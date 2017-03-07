package com.example.sushilverma.glidelib;

import org.json.JSONObject;

/**
 * Created by sushil.verma on 2/2/2017.
 */

public class Image {

    private String Name;
    private String Small;
    private String Medium;
    private String Large;
    private String Timestamp;

    public String getSmall() {
        return Small;
    }

    public void setSmall(String small) {
        Small = small;
    }



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMedium() {
        return Medium;
    }

    public void setMedium(String medium) {
        Medium = medium;
    }

    public String getLarge() {
        return Large;
    }

    public void setLarge(String large) {
        Large = large;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(String timestamp) {
        Timestamp = timestamp;
    }



  /*  image.setName(object.getString("name"));

    JSONObject url = object.getJSONObject("url");
    image.setSmall(url.getString("small"));
    image.setMedium(url.getString("medium"));
    image.setLarge(url.getString("large"));
    image.setTimestamp(object.getString("timestamp"));*/


}
