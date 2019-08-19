package com.ignore.listeners.extend.event;

/**
 * @Author renzhiqiang
 * @Description
 * @Date 2019-08-19
 **/
public abstract class AbstractEvent extends Event{
    /**
     * 执行时间
     */
    private final long timestamp;


    public AbstractEvent(Object source) {
        super(source);
        this.timestamp = System.currentTimeMillis();
    }


    public final long getTimestamp() {
        return this.timestamp;
    }
}
