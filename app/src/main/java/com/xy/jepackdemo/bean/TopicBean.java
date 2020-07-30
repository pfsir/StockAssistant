package com.xy.jepackdemo.bean;

/**
 * @author oyangpengfei
 * @date 2019/7/8.
 * description
 */
public class TopicBean {
    private String topic;
    private boolean HasMore;

    public TopicBean(String topic, boolean hasMore) {
        this.topic = topic;
        HasMore = hasMore;
    }

    public String getTopic() {
        return topic;
    }

    public boolean isHasMore() {
        return HasMore;
    }


}
