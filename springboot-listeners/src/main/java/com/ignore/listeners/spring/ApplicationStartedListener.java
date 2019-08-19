package com.ignore.listeners.spring;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Author renzhiqiang
 * @Description
 * @Date 2019-08-13
 **/
public class ApplicationStartedListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("监听到spring启动完成事件");
    }
}
