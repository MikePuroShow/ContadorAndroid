package com.example.primerappdefi;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.primerappdefi.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        contador = 0;

    }
    public void incrementarContador (View vista){
        contador++;
        mostrarResultado();
    }

    public void restarContador (View vista){
        contador--;
        mostrarResultado();
    }

    public void resetearContador (View vista){
        contador = 0;
        mostrarResultado();
    }
    public void mostrarResultado (){
        TextView textoResult = (TextView) findViewById(R.id.textView2);
        textoResult.setText("Contandor:" +" " + contador);
    }
}