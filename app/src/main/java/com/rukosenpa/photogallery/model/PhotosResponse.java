package com.rukosenpa.photogallery.model;

import java.io.Serializable;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class PhotosResponse implements Serializable
{

    private Photos photos;
    private String stat;
    private final static long serialVersionUID = -7558643752400542424L;

    public Photos getPhotos() {
        return photos;
    }

    public void setPhotos(Photos photos) {
        this.photos = photos;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("photos", photos).append("stat", stat).toString();
    }

}