package com.pluralsight.springboot.ticket.events;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToOne(optional = false)
    @JoinColumn(name = "venue_id", nullable = false, referencedColumnName = "id")
    private Venue venue;
    @ManyToOne(optional = false)
    @JoinColumn(name = "organizer_id", nullable = false,referencedColumnName = "id")
    private Organizer organizer;
    public Event() {}
    public Event(int id, String name, String description, LocalDate startDate, LocalDate endDate, Venue venue, Organizer organizer) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.venue = venue;
        this.organizer = organizer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Venue getVenue() {
        return venue;
    }

    public Organizer getOrganizer() {
        return organizer;
    }
}
