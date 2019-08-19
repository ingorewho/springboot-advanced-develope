package com.ignore.listeners.spring;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Author renzhiqiang
 * @Description
 * @Date 2019-08-13
 **/
public class ApplicationStartingListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        System.out.println("监听到spring开始启动事件");
    }
}
