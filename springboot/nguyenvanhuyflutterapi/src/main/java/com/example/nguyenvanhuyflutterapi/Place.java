package com.example.nguyenvanhuyflutterapi;

public class Place {
    private int id;
    private String name;
    private String imageUrl;
    private double rating;

    public Place(int id, String name, String imageUrl, double rating) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.rating = rating;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getImageUrl() { return imageUrl; }
    public double getRating() { return rating; }
}
