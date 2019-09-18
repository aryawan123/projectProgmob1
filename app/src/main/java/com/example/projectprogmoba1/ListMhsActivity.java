package com.example.projectprogmoba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ListMhsActivity extends AppCompatActivity {

    String [] mhs ={"Riyan Mozes Sahetapy","Brian Eldrin Sombuk","Elias Aru F. Langer",
            "Aditya Halimawan","Immanuel Harold Maga","Eben Haezer Gultom",
            "Yosua Erick Gunawan","Eva Kristina","Jonathan Prajna Marga Parama",
            "Emma Norren Cahya Putri","Michael Gerardi Adji","Cynthia Kumalasari",
            "Nikolaus Aryawan Ravato Wijaya","Daniel Surya Nugraha","Lionrico Sanjay Exauvida Jeipy",
            "Jonathan Alvin Ananto","Monica Carista","Didimus Candra Gased",
            "Valeriana Tanesha Indra S","Ivan Bernov","Friska F. Nainggolan",
            "Grace Hutabarat","Beni Mulia Tabarus"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_mhs);
        Button addMhs = findViewById(R.id.btnAddMhs);
        Button editMhs = findViewById(R.id.btnEdit);
        ListView listMhs = findViewById(R.id.ListMhs);

        listMhs.setAdapter(new ArrayAdapter<String>(ListMhsActivity.this,android.R.layout.simple_list_item_1,mhs));
        listMhs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListMhsActivity.this,"Anda telah memilih mahasiswa= "+mhs[i],Toast.LENGTH_LONG).show();
            }
        });

        addMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMhsActivity.this,CreadMhsActivity.class);
                startActivity(intent);
            }
        });
    }
}