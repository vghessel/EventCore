package com.eventcore.dto;

import java.util.UUID;

public record EventDTO(String type, UUID userId, String ipAddress) {
}
