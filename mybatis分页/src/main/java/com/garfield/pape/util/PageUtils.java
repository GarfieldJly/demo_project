package com.garfield.pape.util;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

/**
 * @author jingliyuan
 * @date 2020/11/23
 */
public class PageUtils {
    /**
     * 将PageInfo对象泛型中的Po对象转化为Vo对象
     *
     * @param pageInfo PageInfo<Po>对象</>
     * @param <P>        Po类型
     * @param <V>        Vo类型
     * @return
     */
    public static <P,V> PageInfo<V> PageInfo2PageInfoVo(PageInfo<P> pageInfo){
        // 创建Page对象，实际上是一个ArrayList类型的集合
        Page<V> page = new Page<V>(pageInfo.getPageNum(), pageInfo.getPageSize());
        page.setTotal(pageInfo.getTotal());
        return new PageInfo<>(page);
    }

}
