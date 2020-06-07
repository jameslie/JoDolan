package com.example.jodolan.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jodolan.R;
import com.example.jodolan.database.AkunLogin;
import com.example.jodolan.database.AkunModel;
import com.example.jodolan.database.AppDatabase;

public class LoginActivity extends AppCompatActivity {

    private TextView btnRegister;
    private Button btnLogin;
    private EditText etemail, etpassword;
    private AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnRegister = (TextView) findViewById(R.id.tv_registerLogin);
        btnLogin = findViewById(R.id.btn_signLogin);

        etemail = findViewById(R.id.et_emailLogin);
        etpassword = findViewById(R.id.et_passLogin);

        appDatabase = AppDatabase.initDatabase(this);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etemail.getText().toString().trim();
                String password = etpassword.getText().toString().trim();

                AkunModel akunModel = appDatabase.akunDAO().getData(email,password);

                if (akunModel != null){
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);

                    AkunLogin akunLogin = new AkunLogin();

                    akunLogin.setEmail(email);
                    akunLogin.setPassword(password);

                    appDatabase.akunDAO().insertLogin(akunLogin);

                } else {
                    Toast.makeText(getApplicationContext(),"Email atau Password salah", Toast.LENGTH_SHORT).show();
                    etpassword.setText("");
                }
            }
        });



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
        finish();
        System.exit(0);
    }
}
