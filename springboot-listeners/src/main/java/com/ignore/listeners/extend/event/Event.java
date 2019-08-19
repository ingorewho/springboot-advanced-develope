package com.ignore.listeners.extend.event;

/**
 * @Author renzhiqiang
 * @Description 自定义事件接口
 * @Date 2019-08-19
 **/
public class Event {
    /**
     * 事件源信息
     */
    protected transient Object  source;

    public Event(Object source) {
        if (source == null)
            throw new IllegalArgumentException("null source");

        this.source = source;
    }


    public Object getSource() {
        return source;
    }


    public String toString() {
        return getClass().getName() + "[source=" + source + "]";
    }
}
