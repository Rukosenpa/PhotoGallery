

package com.rukosenpa.photogallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.rukosenpa.photogallery.api.FlickrAPI;
import com.rukosenpa.photogallery.api.ServiceAPI;
import com.rukosenpa.photogallery.model.Photo;
import com.rukosenpa.photogallery.model.PhotosResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class PhotoGallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_activity);

        final RecyclerView recycler = findViewById(R.id.rView);
        recycler.setLayoutManager(new GridLayoutManager(this, 3));

        Retrofit retrofit = ServiceAPI.getRetrofit();
        retrofit.create(FlickrAPI.class).getRecent().enqueue(new Callback<PhotosResponse>() {
            @Override
            public void onResponse(Call<PhotosResponse> call, Response<PhotosResponse> response) {
                assert response.body() != null;
                PhotoAdapter adapter = new PhotoAdapter(response.body().getPhotos().getPhoto());
                recycler.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<PhotosResponse> call, Throwable t) {
                System.out.println("Failure");
            }
        });

    }
}