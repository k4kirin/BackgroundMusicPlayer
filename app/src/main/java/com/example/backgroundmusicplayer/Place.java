package com.example.backgroundmusicplayer;

public class Place {
    String name,songName;
    double latCenter, longCenter, latLength, longLength;
    public Place(String[] strArr){
        name=strArr[0];
        songName=strArr[1];
        this.latCenter = Double.parseDouble(strArr[2]);
        this.longCenter = Double.parseDouble(strArr[3]);
        this.latLength = Double.parseDouble(strArr[4]);
        this.longLength = Double.parseDouble(strArr[5]);
    }
    public Place(String name, String songName, double latCenter, double longCenter, double latLength, double longLength) {
        this.name = name;
        this.songName = songName;
        this.latCenter = latCenter;
        this.longCenter = longCenter;
        this.latLength = latLength;
        this.longLength = longLength;
    }

    public boolean isHere(double lat, double longi){
        return (Math.abs(lat-latCenter)<=latLength && Math.abs(longi-longCenter)<=longLength);
    }

    public String getname() {
        return name;
    }

    public double getLatCenter() {
        return latCenter;
    }

    public double getLongCenter() {
        return longCenter;
    }

    public double getLatLength() {
        return latLength;
    }

    public double getLongLength() {
        return longLength;
    }
}
