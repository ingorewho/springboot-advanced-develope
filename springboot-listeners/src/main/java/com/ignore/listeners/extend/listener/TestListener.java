package com.ignore.listeners.extend.listener;

import com.ignore.listeners.extend.event.AbstractEvent;

/**
 * @Author renzhiqiang
 * @Description 测试监听器
 * @Date 2019-08-19
 **/
public interface TestListener<E extends AbstractEvent>  extends Listener {
    /**
     * 监听测试事件
     */
    void onTestEvent(E event);
}
