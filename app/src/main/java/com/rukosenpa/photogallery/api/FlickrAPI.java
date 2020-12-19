package com.rukosenpa.photogallery.api;

import com.rukosenpa.photogallery.model.PhotosResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FlickrAPI {
    @GET("services/rest/?method=flickr.photos.getRecent&api_key=Your API&extras=url_s&format=json&nojsoncallback=1")
    Call<PhotosResponse> getRecent();

    @GET("services/rest/?method=flickr.photos.search&api_key=d Your API&extras=url_s&format=json&nojsoncallback=1")
    Call<PhotosResponse> searchPhotos(@Query("text") String keyWord);
}

