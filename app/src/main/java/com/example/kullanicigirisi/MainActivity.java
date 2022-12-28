package com.example.kullanicigirisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.kullanicigirisi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Button giris;
    EditText ad;
    EditText parola;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        giris = findViewById(R.id.button);
        ad = findViewById(R.id.editTextAd);
        parola = findViewById(R.id.editTextParola);

        giris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kullaniciGirisi(view);
            }
        });

    }

    public void kullaniciGirisi(View view){
        String kullaniciAdi = binding.editTextAd.getText().toString();
        String parola = binding.editTextParola.getText().toString();
        Singleton singleton = Singleton.getInstance();
        singleton.setKullaniciAdi(kullaniciAdi);
        singleton.setKullaniciParola(parola);
        Intent intent = new Intent(this,Anasayfa.class);
        startActivity(intent);
    }




}