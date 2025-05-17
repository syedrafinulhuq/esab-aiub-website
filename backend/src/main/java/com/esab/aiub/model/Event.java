package com.esab.aiub.model;

public class Event {
    private Long id;
    private String title;
    private String date;
    private String location;

    public Event() {}
    public Event(Long id, String title, String date, String location) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.location = location;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
}