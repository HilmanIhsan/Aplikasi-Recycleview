package com.example.posterapp;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecycleView extends RecyclerView.Adapter<AdapterRecycleView.ViewHolder> {

    ArrayList<ItemModel> dataItem;
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textJudul;
        TextView textTahun;
        ImageView posterFilm;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textJudul = itemView.findViewById(R.id.text_judul);
            textTahun = itemView.findViewById(R.id.text_tahun);
            posterFilm = itemView.findViewById(R.id.image_poster);
        }
    }

    AdapterRecycleView(ArrayList<ItemModel> data) {
        this.dataItem = data;

    }

    @NonNull
    @Override
    public AdapterRecycleView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecycleView.ViewHolder holder, int position) {

        TextView text_Judul = holder.textJudul;
        TextView text_Tahun = holder.textTahun;
        ImageView image_poster = holder.posterFilm;

        text_Judul.setText(dataItem.get(position).getName());
        text_Tahun.setText(dataItem.get(position).getYear());
        image_poster.setImageResource(dataItem.get(position).getPoster());

    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }
}
