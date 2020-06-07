package com.example.jodolan.view.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jodolan.adapter.NewsAdapter;
import com.example.jodolan.view.model.NewsViewModel;
import com.example.jodolan.R;
import com.example.jodolan.model.ArticlesItem;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {

    private NewsAdapter newsAdapter;
    private RecyclerView rvNewsDiscover;
    private NewsViewModel newsViewModel;


    public NewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        newsAdapter = new NewsAdapter(getContext());
        newsAdapter.notifyDataSetChanged();

        rvNewsDiscover = view.findViewById(R.id.fragment_rv_news);
        rvNewsDiscover.setLayoutManager(new GridLayoutManager(getContext(),1));

        newsViewModel = new ViewModelProvider(this).get(NewsViewModel.class);
        newsViewModel.setListMutableLiveData();
        newsViewModel.getNews().observe(this,getNewsDiscover);

        rvNewsDiscover.setAdapter(newsAdapter);

    }

    private Observer<ArrayList<ArticlesItem>> getNewsDiscover = new Observer<ArrayList<ArticlesItem>>() {
        @Override
        public void onChanged(ArrayList<ArticlesItem> articlesItems) {
            if (articlesItems != null){
                newsAdapter.setData(articlesItems);
            }
        }
    };
}