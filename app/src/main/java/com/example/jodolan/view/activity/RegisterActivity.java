package com.example.jodolan.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.jodolan.R;
import com.example.jodolan.database.AkunModel;
import com.example.jodolan.database.AppDatabase;

public class RegisterActivity extends AppCompatActivity {

    private AppDatabase appDatabase;
    private Button btn_simpan;
    private EditText etnama,etemail,etpassword,ettelepon;
    private TextView btn_signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        btn_simpan = findViewById(R.id.btn_signRegistrasi);
        btn_signin = findViewById(R.id.tv_signinLogin);

        etnama = findViewById(R.id.et_namaRegistrasi);
        etemail = findViewById(R.id.et_emailRegistrasi);
        etpassword = findViewById(R.id.et_passRegistrasi);
        ettelepon = findViewById(R.id.et_telpRegistrasi);

        appDatabase = AppDatabase.initDatabase(getApplicationContext());

        btn_simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    AkunModel akunModel = new AkunModel();

                    akunModel.setUsername(etnama.getText().toString());
                    akunModel.setPassword(etpassword.getText().toString());
                    akunModel.setEmail(etemail.getText().toString());
                    akunModel.setTelepon(ettelepon.getText().toString());

                    appDatabase.akunDAO().insertAkun(akunModel);

                    Intent moveIntent = new Intent(RegisterActivity.this,
                            LoginActivity.class);
                    startActivity(moveIntent);

                    Log.e("Registeractivity", "Sukses");
                    Toast.makeText(getApplicationContext(),"Tersimpan", Toast.LENGTH_SHORT).show();

                }catch (Exception ex){
                    Log.e("Registeractivity", "Gagal Membuat akun, msg : "+ex.getMessage());
                    Toast.makeText(getApplicationContext(),"Gagal Membuat akun", Toast.LENGTH_SHORT).show();

                    etnama.setText("");
                    etemail.setText("");
                    etpassword.setText("");
                    ettelepon.setText("");
                }
            }
        });

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        }
}
