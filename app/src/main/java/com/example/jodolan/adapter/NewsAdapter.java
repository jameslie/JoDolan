package com.example.jodolan.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
import com.example.jodolan.model.ArticlesItem;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private ArrayList<ArticlesItem> articlesItems = new ArrayList<>();
    private Context context;

    public NewsAdapter(Context context) {
        this.context = context;
    }

    public void setData(ArrayList<ArticlesItem>items){
        articlesItems.clear();
        articlesItems.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_news,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.ViewHolder holder, final int position) {
        Glide.with(context).load(articlesItems.get(position).getUrlToImage())
                .into(holder.ivThumbnail);
        holder.tvTitle.setText(articlesItems.get(position).getTitle());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(articlesItems.get(position).getUrl()));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return articlesItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        ImageView ivThumbnail;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivThumbnail = itemView.findViewById(R.id.itemlist_iv_thumbnail);
            tvTitle = itemView.findViewById(R.id.itemlist_tv_title);
            cardView = itemView.findViewById(R.id.itemlist_cv_news);
        }
    }
}
