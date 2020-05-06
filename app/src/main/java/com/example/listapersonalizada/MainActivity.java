package com.example.listapersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tirarFoto(View v) {
        Intent myIntent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivityForResult(myIntent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data != null) {
            Bundle bundle = data.getExtras();
            if (bundle != null) {
                Bitmap img = (Bitmap) bundle.get("data");

                ArrayList<Contatos> arrayContatos = new ArrayList<>();
                for (int i = 0; i < 100; i++)
                    arrayContatos.add(new Contatos("Contato - "+i, "04-12-2019 21:33", img));

                ContatosAdapter adapter = new ContatosAdapter(getApplicationContext(), R.layout.my_list_item_row, arrayContatos);
                ListView listView = (ListView) findViewById(R.id.myList);
                listView.setAdapter(adapter);
            }
        }
    }
}
