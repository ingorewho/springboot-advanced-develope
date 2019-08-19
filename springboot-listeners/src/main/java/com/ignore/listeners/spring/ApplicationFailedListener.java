package com.ignore.listeners.spring;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Author renzhiqiang
 * @Description
 * @Date 2019-08-13
 **/
public class ApplicationFailedListener implements ApplicationListener<ApplicationFailedEvent> {
    @Override
    public void onApplicationEvent(ApplicationFailedEvent applicationFailedEvent) {
        System.out.println("监听到spring启动失败事件");
    }
}
