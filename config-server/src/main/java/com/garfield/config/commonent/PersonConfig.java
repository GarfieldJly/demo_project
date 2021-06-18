package com.garfield.config.commonent;

import com.garfield.config.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * PersonConfig
 *
 * @author zhaojian
 * @date 2021/6/1
 */
@Component
public class PersonConfig {
    @Bean
    public Person createPerson(){
        return new Person("garfield","female");
    }
}
