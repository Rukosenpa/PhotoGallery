package com.rukosenpa.photogallery.api;

import com.rukosenpa.photogallery.model.PhotosResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FlickrAPI {
    @GET("services/rest/?method=flickr.photos.getRecent&api_key=6215419357c1e7547b52f9cebf7e993e&extras=url_s&format=json&nojsoncallback=1")
    Call<PhotosResponse> getRecent();

    @GET("services/rest/?method=flickr.photos.search&api_key=6215419357c1e7547b52f9cebf7e993e&extras=url_s&format=json&nojsoncallback=1")
    Call<PhotosResponse> searchPhotos(@Query("text") String keyWord);
}

