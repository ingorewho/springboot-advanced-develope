package com.ignore.listeners;

import com.alibaba.fastjson.JSONObject;
import com.ignore.listeners.spring.ApplicationEnvironmentPreparedListener;
import com.ignore.listeners.spring.ApplicationFailedListener;
import com.ignore.listeners.spring.ApplicationReadyListener;
import com.ignore.listeners.spring.ApplicationStartedListener;
import com.ignore.listeners.spring.ApplicationStartingListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;

/**
 * @Author renzhiqiang
 * @Description
 * @Date 2019-08-13
 **/
@SpringBootApplication
public class ListenerApplication {
    public static void main(String[] args){
        SpringApplication application = new SpringApplication(ListenerApplication.class);
        application.addListeners(new ApplicationEnvironmentPreparedListener(), new ApplicationStartingListener(),
                new ApplicationStartedListener(), new ApplicationFailedListener(), new ApplicationReadyListener(),
                (ApplicationEnvironmentPreparedEvent event) -> System.out.println("123"));
        System.out.println("spring 当前监听器列表:" + JSONObject.toJSONString(application.getListeners()));
        application.run(args);

    }
}
