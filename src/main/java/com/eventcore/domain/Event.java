package com.eventcore.domain;

public class Event {
    private String eventId;
    private String eventType;
    private String timestamp;
    private Detail details;

    public static class Detail {
        private String userId;
        private String ipAddress;
    }
}
