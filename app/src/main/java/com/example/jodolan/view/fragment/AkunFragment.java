package com.example.jodolan.view.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.jodolan.R;
import com.example.jodolan.database.AkunLogin;
import com.example.jodolan.database.AkunModel;
import com.example.jodolan.database.AppDatabase;
import com.example.jodolan.view.activity.LoginActivity;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class AkunFragment extends Fragment {

    private EditText etnama, etemail, ettelepon, etpassword;
    private AppDatabase appDatabase;

    String email, password, telepon, nama;
    private Button btn_edit, btn_exit;

    private ArrayList<AkunLogin> list;

    public AkunFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_akun, container, false);

        etnama = view.findViewById(R.id.et_namaAkun);
        etemail = view.findViewById(R.id.et_emailAkun);
        ettelepon = view.findViewById(R.id.et_telpAkun);
        etpassword = view.findViewById(R.id.et_passAkun);

        btn_edit = view.findViewById(R.id.btn_simpanAkun);
        btn_exit = view.findViewById(R.id.btn_logout);

        list = new ArrayList<>();

        appDatabase = AppDatabase.initDatabase(getContext());

        list.addAll(Arrays.asList(appDatabase.akunDAO().getData()));
        Log.d("AkunFragment", "item : " + list.size());

        email = list.get(0).getEmail().trim();
        password = list.get(0).getPassword().trim();

        AkunModel akunModel = appDatabase.akunDAO().getData(email,password);
        if (akunModel != null){
            etnama.setText(akunModel.getUsername());
            etemail.setText(akunModel.getEmail());
            etpassword.setText(akunModel.getPassword());
            ettelepon.setText(akunModel.getTelepon());

            btn_exit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    delete();
                }
            });

            btn_edit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    update();
                }
            });
        }else {
            Toast.makeText(getContext(),"ERROR", Toast.LENGTH_SHORT).show();
        }



        return view;
    }

    private void update(){
        email = etemail.getText().toString();
        password = etpassword.getText().toString();
        nama = etnama.getText().toString();
        telepon = ettelepon.getText().toString();

        AkunLogin akunLogin = new AkunLogin();
        akunLogin.setEmail(email);
        akunLogin.setPassword(password);

        appDatabase.akunDAO().updateDataLogin(akunLogin);

        AkunModel akunModel = new AkunModel();
        akunModel.setEmail(email);
        akunModel.setPassword(password);
        akunModel.setTelepon(telepon);
        akunModel.setUsername(nama);

        appDatabase.akunDAO().updateDataAkun(akunModel);

        Toast.makeText(getContext(),"Data Berhasil diUbah", Toast.LENGTH_SHORT).show();

    }

    private void delete(){
        email = etemail.getText().toString();
        password = etpassword.getText().toString();

        AkunLogin akunLogin = new AkunLogin();
        akunLogin.setEmail(email);
        akunLogin.setPassword(password);

        appDatabase.akunDAO().deleteData(akunLogin);

        Toast.makeText(getContext(),"Anda Keluar", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(getContext(), LoginActivity.class);
        getContext().startActivity(intent);
    }
}
