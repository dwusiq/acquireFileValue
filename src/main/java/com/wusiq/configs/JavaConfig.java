package com.wusiq.configs;

import com.wusiq.service.DogServcie;
import com.wusiq.service.impl.DogServcieImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * java配置文件
 */
@Configuration
@PropertySource("classpath:/properties.properties")
public class JavaConfig {

    @Autowired
    Environment env;

    @Bean
    public DogServcie getDogService(){
        String dogName = env.getProperty("dog.name");
        DogServcieImpl ds = new DogServcieImpl(dogName);
        return ds;
    }
}
