package com.rukosenpa.photogallery.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Photo implements Serializable {

    private String id;
    private String owner;
    private String secret;
    private String server;
    private int farm;
    private String title;
    private int ispublic;
    private int isfriend;
    private int isfamily;
    private String media;
    private String mediaStatus;
    private String urlS;
    private String heightS;
    private String widthS;
    private final static long serialVersionUID = -4481577031136186301L;

    /**
     * No args constructor for use in serialization
     */
    public Photo() {
    }

    /**
     * @param owner
     * @param server
     * @param isfriend
     * @param mediaStatus
     * @param widthS
     * @param secret
     * @param media
     * @param title
     * @param isfamily
     * @param urlS
     * @param heightS
     * @param ispublic
     * @param farm
     * @param id
     */
    public Photo(String id, String owner, String secret, String server, int farm, String title, int ispublic, int isfriend, int isfamily, String media, String mediaStatus, String urlS, String heightS, String widthS) {
        super();
        this.id = id;
        this.owner = owner;
        this.secret = secret;
        this.server = server;
        this.farm = farm;
        this.title = title;
        this.ispublic = ispublic;
        this.isfriend = isfriend;
        this.isfamily = isfamily;
        this.media = media;
        this.mediaStatus = mediaStatus;
        this.urlS = urlS;
        this.heightS = heightS;
        this.widthS = widthS;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public int getFarm() {
        return farm;
    }

    public void setFarm(int farm) {
        this.farm = farm;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIspublic() {
        return ispublic;
    }

    public void setIspublic(int ispublic) {
        this.ispublic = ispublic;
    }

    public int getIsfriend() {
        return isfriend;
    }

    public void setIsfriend(int isfriend) {
        this.isfriend = isfriend;
    }

    public int getIsfamily() {
        return isfamily;
    }

    public void setIsfamily(int isfamily) {
        this.isfamily = isfamily;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getMediaStatus() {
        return mediaStatus;
    }

    public void setMediaStatus(String mediaStatus) {
        this.mediaStatus = mediaStatus;
    }

    public String getUrlS() {
        return urlS;
    }

    public void setUrlS(String urlS) {
        this.urlS = urlS;
    }

    public String getHeightS() {
        return heightS;
    }

    public void setHeightS(String heightS) {
        this.heightS = heightS;
    }

    public String getWidthS() {
        return widthS;
    }

    public void setWidthS(String widthS) {
        this.widthS = widthS;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("title", title).toString();
    }

}