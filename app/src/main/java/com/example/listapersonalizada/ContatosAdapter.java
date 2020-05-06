package com.example.listapersonalizada;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContatosAdapter extends ArrayAdapter<Contatos> {

    private Context context;
    private int resourceXMLfile;
    private ArrayList<Contatos> arrayContatos;

    public ContatosAdapter(Context context, int resourceXMLfile, ArrayList<Contatos> arrayContatos) {
        super(context, resourceXMLfile, arrayContatos);

        this.context = context;
        this.resourceXMLfile = resourceXMLfile;
        this.arrayContatos = arrayContatos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(resourceXMLfile, parent, false);

        ImageView imageView = (ImageView) row.findViewById(R.id.iconPerfil);
        TextView textNome = (TextView) row.findViewById(R.id.nomeContato);
        TextView textVisto = (TextView) row.findViewById(R.id.visto);

        Contatos contatos = arrayContatos.get(position);
        textNome.setText(contatos.getNome());
        textVisto.setText(contatos.getVisto());
        imageView.setImageBitmap(contatos.getFoto());

        return row;
    }

}
