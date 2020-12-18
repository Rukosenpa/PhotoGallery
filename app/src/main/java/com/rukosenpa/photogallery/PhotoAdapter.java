package com.rukosenpa.photogallery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.rukosenpa.photogallery.model.Photo;

import java.util.List;


public class PhotoAdapter extends RecyclerView.Adapter <PhotoAdapter.ViewHolder>{
    private final List<Photo> values;
    private OnInsertListener onInsertListener;

    public PhotoAdapter(List<Photo> items) {
        values = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        String s;
        s = "https://farm" + values.get(position).getFarm() + ".staticflickr.com/" +
                values.get(position).getServer() + "/" + values.get(position).getId() +
                "_" + values.get(position).getSecret() + "_q.jpg";
        Picasso.get().load(s).into(holder.image);
        holder.itemView.setTag(values.get(position));
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public interface OnInsertListener {
        void onInsert(Photo photo);
    }

    public void setOnInsertListener(OnInsertListener onInsertListener) {
        this.onInsertListener = onInsertListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView image;

        ViewHolder(View view) {
            super(view);
            image = view.findViewById(R.id.image);
            image.setOnClickListener(v -> onInsertListener.onInsert(values.get(ViewHolder.this.getAdapterPosition())));
        }
    }

}
