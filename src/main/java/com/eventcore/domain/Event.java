package com.eventcore.domain;

import com.eventcore.dto.EventDTO;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Data
@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    @CreationTimestamp
    private Date timestamp;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String ipAddress;
}
