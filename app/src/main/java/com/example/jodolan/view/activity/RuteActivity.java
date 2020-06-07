package com.example.jodolan.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.jodolan.R;

public class RuteActivity extends AppCompatActivity {

    TextView tvnama, tvalamat,tvwaktu, tvdeskripsi;
    ImageView ivwisata;
    String lokasi;
    Button btnRute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rute);

        tvnama = findViewById(R.id.tv_rutename);
        tvalamat = findViewById(R.id.tv_rutealamat);
        tvdeskripsi = findViewById(R.id.tv_rutedeskripsi);
        tvwaktu = findViewById(R.id.tv_rutewaktu);
        ivwisata = findViewById(R.id.img_rute);
        btnRute = findViewById(R.id.btn_rute);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String valuenama = extras.getString("nama");
            tvnama.setText(valuenama);

            String valuealamat = extras.getString("alamat");
            tvalamat.setText(valuealamat);

            String valuedeskripsi = extras.getString("deskripsi");
            tvdeskripsi.setText(valuedeskripsi);

            String valuewaktu = extras.getString("waktu");
            tvwaktu.setText(valuewaktu);

            int valuegambar = extras.getInt("gambar");
            Log.d("RuteActivity", "Cek gambar 2 : " + valuegambar);
            Glide.with(getApplicationContext()).load(valuegambar).into(ivwisata);

            String valuegmaps = extras.getString("gmaps");
            lokasi = valuegmaps;
            Log.d("RuteActivity", "Cek Lokasi : " + lokasi);
        }

        btnRute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(lokasi));
                startActivity(intent);
            }
        });


    }
}
