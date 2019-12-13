package com.example.backgroundmusicplayer;

public class Place {
    String name,songName;
    double latCenter, longCenter, latLength, longLength;
    public Place(String[] strArr){
        name=strArr[0];
        songName=strArr[1];
        if(Double.parseDouble(strArr[5])>=0){
            this.latCenter = Double.parseDouble(strArr[2]);
            this.longCenter = Double.parseDouble(strArr[3]);
            this.latLength = Double.parseDouble(strArr[4]);
            this.longLength = Double.parseDouble(strArr[5]);
        }
        else{
            double lat1 = Double.parseDouble(strArr[2]);
            double lat2 = Double.parseDouble(strArr[3]);
            double longi1 = Double.parseDouble(strArr[4]);
            double longi2 = Double.parseDouble(strArr[5]);
            this.latCenter = (lat1+lat2)/2;
            this.longCenter = (longi1+longi2)/2;
            this.latLength = Math.abs(latCenter-lat1);
            this.longLength = Math.abs(longCenter-longi1);
        }
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
