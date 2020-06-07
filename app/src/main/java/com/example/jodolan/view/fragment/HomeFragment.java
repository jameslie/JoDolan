package com.example.jodolan.view.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.jodolan.datawisata.DataWisata;
import com.example.jodolan.R;
import com.example.jodolan.view.activity.RuteActivity;
import com.example.jodolan.adapter.wisataAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private RecyclerView rvWisata;
    private EditText etSearch;
    private ProgressBar pb;
    private ImageView btnSearch;

    ImageView ivWisatacad;
    TextView tvNamecad, tvAlamatcad;
    CardView cardViewcad;

    String nama;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        rvWisata = view.findViewById(R.id.fragment_rv);


        rvWisata.setHasFixedSize(true);
        rvWisata.setLayoutManager(new LinearLayoutManager(view.getContext()));
        wisataAdapter wisataAdapter = new wisataAdapter(view.getContext());
        wisataAdapter.setWisata(DataWisata.getWisataList());
        rvWisata.setAdapter(wisataAdapter);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        etSearch = view.findViewById(R.id.search_edittext);
        btnSearch = view.findViewById(R.id.search_button);
        pb = view.findViewById(R.id.pb);

        ivWisatacad = view.findViewById(R.id.iv_wisata_cad);
        tvNamecad = view.findViewById(R.id.tv_wisata_cad);
        tvAlamatcad = view.findViewById(R.id.itemlist_tv_alamat_cad);

        cardViewcad = view.findViewById(R.id.itemlist_cad);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb.setVisibility(View.VISIBLE);
                btnSearch.setVisibility(View.GONE);

                nama = etSearch.getText().toString().trim();

                if (nama.isEmpty()) {
                    Toast.makeText(getContext(), "Tolong di isi", Toast.LENGTH_SHORT).show();
                    pb.setVisibility(View.GONE);
                    btnSearch.setVisibility(View.VISIBLE);
                } else {
                    getData(nama);
                }
            }
        });

        etSearch.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN || keyCode == KeyEvent.KEYCODE_ENTER) {
                    pb.setVisibility(View.VISIBLE);
                    btnSearch.setVisibility(View.GONE);

                    nama = etSearch.getText().toString().trim();

                    if (nama.isEmpty()) {
                        Toast.makeText(getContext(), "Tolong di isi", Toast.LENGTH_SHORT).show();
                        pb.setVisibility(View.GONE);
                        btnSearch.setVisibility(View.VISIBLE);
                    } else {
                        getData(nama);
                    }
                }
                return false;
            }
        });
    }

    public void getData(String nama) {
        pb.setVisibility(View.GONE);
        btnSearch.setVisibility(View.VISIBLE);


        boolean wisata_ada = true;

        for (int i = 0; i < DataWisata.getWisataList().size(); i++) {
            if (nama.equalsIgnoreCase(DataWisata.getWisataList().get(i).getWisataName())) {
//                Toast.makeText(getContext(), "Wisata : " + DataWisata.getWisataList().get(i).getWisataName(), Toast.LENGTH_SHORT).show();
                rvWisata.setVisibility(View.GONE);

                Glide.with(getContext()).load(DataWisata.getWisataList().get(i).getWisataImage()).into(ivWisatacad);
                tvNamecad.setText(DataWisata.getWisataList().get(i).getWisataName());
                tvAlamatcad.setText(DataWisata.getWisataList().get(i).getWisataAlamat());
                cardViewcad.setVisibility(View.VISIBLE);

                final int index = i;

                cardViewcad.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getContext(), RuteActivity.class);
                        intent.putExtra("nama", DataWisata.getWisataList().get(index).getWisataName());
                        intent.putExtra("alamat", DataWisata.getWisataList().get(index).getWisataAlamat());
                        intent.putExtra("waktu", DataWisata.getWisataList().get(index).getWisataWaktu());
                        intent.putExtra("gmaps", DataWisata.getWisataList().get(index).getWisataGmaps());
                        intent.putExtra("deskripsi", DataWisata.getWisataList().get(index).getWisataDeskripsi());
                        intent.putExtra("gambar", DataWisata.getWisataList().get(index).getWisataImage());
                        getContext().startActivity(intent);
                    }
                });


                wisata_ada = true;
                break;
            } else {
                wisata_ada = false;
            }
        }

        if (!wisata_ada) {

            Toast.makeText(getContext(), "Tempat tidak ditemukan!", Toast.LENGTH_SHORT).show();
        }
    }
}
