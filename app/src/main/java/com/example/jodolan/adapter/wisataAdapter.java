package com.example.jodolan.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.jodolan.R;
import com.example.jodolan.datawisata.Wisata;
import com.example.jodolan.view.activity.RuteActivity;

import java.util.ArrayList;

public class wisataAdapter extends RecyclerView.Adapter<wisataAdapter.ViewHolder> {
    private ArrayList<Wisata> wisata;
    private Context context;

    public wisataAdapter(Context context){
        this.context = context;
    }

    public ArrayList<Wisata> getWisata(){
        return wisata;
    }
    public void setWisata(ArrayList<Wisata> wisata){
        this.wisata = wisata;
    }

    @NonNull
    @Override
    public wisataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_wisata,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull wisataAdapter.ViewHolder holder, final int position) {
    holder.tvName.setText(getWisata().get(position).getWisataName());
    holder.tvAlamat.setText(getWisata().get(position).getWisataAlamat());
        Glide.with(context).load(getWisata().get(position).getWisataImage()).into(holder.ivWisata);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("wisataAdapter", "CEK gambar : " + getWisata().get(position).getWisataImage());
                Intent intent = new Intent(context, RuteActivity.class);
                intent.putExtra("nama", getWisata().get(position).getWisataName());
                intent.putExtra("alamat", getWisata().get(position).getWisataAlamat());
                intent.putExtra("waktu", getWisata().get(position).getWisataWaktu());
                intent.putExtra("gmaps", getWisata().get(position).getWisataGmaps());
                intent.putExtra("deskripsi", getWisata().get(position).getWisataDeskripsi());
                intent.putExtra("gambar", getWisata().get(position).getWisataImage());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return wisata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivWisata;
        TextView tvName, tvAlamat;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivWisata = itemView.findViewById(R.id.iv_wisata);
            tvName = itemView.findViewById(R.id.itemlist_tv_wisata);
            tvAlamat = itemView.findViewById(R.id.itemlist_tv_alamat);

            cardView = itemView.findViewById(R.id.itemlist_cv);
        }
    }
}
