package com.rukosenpa.photogallery.model;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Photos implements Serializable {

    private int page;
    private int pages;
    private int perpage;
    private String total;
    private List<Photo> photos = null;
    private final static long serialVersionUID = 6867387752364735107L;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPerpage() {
        return perpage;
    }

    public void setPerpage(int perpage) {
        this.perpage = perpage;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("page", page).append("pages", pages).append("perpage", perpage).append("total", total).append("photo", photos).toString();
    }

}