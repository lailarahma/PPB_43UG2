package com.example.aplikasimenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recMakanan;
    private ArrayList<Menu> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMakanan = findViewById(R.id.rec_makanan);
        initData();

        recMakanan.setAdapter(new MenuAdapter(listMakanan));
        recMakanan.setLayoutManager(new LinearLayoutManager(this));
    }
    private void initData(){
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Menu("Ikan bakar",
                "Rp. 24.000",
                "Ikan gurame bakar, sambal dan lalapan ",
                R.drawable.ikan));
        listMakanan.add(new Menu("Bakso sapi uenak",
                "Rp. 16.500",
                "Bakso dengan daging sapi pilihan",
                R.drawable.bakso));
        listMakanan.add(new Menu("Ayam bakar manis,
                "Rp. 15.000",
                "Ayam bakar dengan kecap manis",
                R.drawable.ayam_bakar));
        listMakanan.add(new Menu("Lele Goreng",
                "Rp. 17.500",
                "Lele goreng, lalap dan sambel",
                R.drawable.bakso));
        listMakanan.add(new Menu("Soto bening",
                "Rp. 12500",
                "Soto dengan kaldu dan berbagai macam toping",
                R.drawable.soto));
        listMakanan.add(new Menu("Tahu Bulat",
                "Rp. 8.000",
                "Tahu bulat dengan sambal",
                R.drawable.tahubulat));
    }
}