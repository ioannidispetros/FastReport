package com.example.fastreport;

import com.firebase.geofire.GeoLocation;

public class Upload {
    public String name;
    public String userId;
    public String imageUrl;
    public Double longitude;
    public Double latitude;
    public Upload() {

    }

    public Upload(String name, String imageUrl, String userId, Double longitude, Double latitude) {
        if (name.trim().equals("")) {
            name = "No name";
        }

        this.name = name;
        this.userId = userId;
        this.imageUrl = imageUrl;
        this.longitude=longitude;
        this.latitude=latitude;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
