package com.eventcore.domain;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Data
@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "event_id")
    private Long eventId;

    private String type;

    @CreationTimestamp
    private Date creationTimestamp;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String ipAddress;
}
