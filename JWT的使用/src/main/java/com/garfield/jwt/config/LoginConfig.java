package com.garfield.jwt.config;

import com.alibaba.fastjson.JSONObject;
import com.garfield.jwt.domain.UserBean;
import com.garfield.jwt.exception.BizEnum;
import com.garfield.jwt.exception.BizException;
import com.garfield.jwt.util.ConstantUtils;
import com.garfield.jwt.util.UserLocalThread;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.aopalliance.intercept.Interceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.CollectionUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/**
 * LoginConfig
 *
 * @author zhaojian
 * @date 2021/6/24
 */
@Configuration
public class LoginConfig implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Map<String, String[]> parameterMap = request.getParameterMap();
        String[] tokens = parameterMap.get("token");
        if(Objects.isNull(tokens)){
            String[] userNames = parameterMap.get("userName");
            String[] passwords = parameterMap.get("password");
            if(Objects.isNull(userNames) || Objects.isNull(passwords)){
                throw new BizException(BizEnum.PARAM_ERROR);
            }
            UserBean userBean = new UserBean();
            userBean.setPassword(passwords[0]);
            userBean.setUserName(userNames[0]);
            UserLocalThread.localThread.set(userBean);
            String userJson = JSONObject.toJSONString(userBean);
            Jwts.builder().setSubject(userJson).signWith(SignatureAlgorithm.HS256,ConstantUtils.SECRET);
        }
        Claims claims = Jwts.parser().setSigningKey(ConstantUtils.SECRET).parseClaimsJws(tokens[0]).getBody();
        String subject = claims.getSubject();
        UserBean userBean = JSONObject.parseObject(subject, UserBean.class);
        if(Objects.isNull(userBean)){
            throw new BizException(BizEnum.PARSE_ERROR);
        }
        UserBean userBean1 = UserLocalThread.localThread.get();
        if(userBean1.getUserName().equals(userBean.getUserName()) && userBean1.getPassword().equals(userBean.getPassword())){

            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
