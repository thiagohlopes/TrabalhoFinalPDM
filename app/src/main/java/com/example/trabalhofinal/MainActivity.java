package com.example.trabalhofinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.trabalhofinal.ui.CartFragment;
import com.example.trabalhofinal.ui.HomeFragment;
import com.example.trabalhofinal.ui.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity implements  BottomNavigationView.OnNavigationItemSelectedListener{
    private BottomNavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigationView = (BottomNavigationView) findViewById(R.id.navigationView);
        navigationView.setOnNavigationItemSelectedListener(this);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.container, new CartFragment());
        ft.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.search: {
                getSupportActionBar().setTitle("Busca");
                Fragment search = SearchFragment.newInstance();
                openFragment(search);

                //Toast.makeText(getApplicationContext(), "listar", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.home: {
                getSupportActionBar().setTitle("Home");
                Fragment home = HomeFragment.newInstance();
                openFragment(home);
                //Toast.makeText(getApplicationContext(), "novo", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.cart: {
                getSupportActionBar().setTitle("Carrinho");
                Fragment cart = CartFragment.newInstance();
                openFragment(cart);
                //Toast.makeText(getApplicationContext(), "novo", Toast.LENGTH_LONG).show();
                break;
            }
        }

        return true;
    }
    private void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}