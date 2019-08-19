package com.ignore.listeners.spring;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Author renzhiqiang
 * @Description
 * @Date 2019-08-13
 **/
public class ApplicationReadyListener implements ApplicationListener<ApplicationReadyEvent> {
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        System.out.println("监听到spring准备就绪事件");
    }
}
