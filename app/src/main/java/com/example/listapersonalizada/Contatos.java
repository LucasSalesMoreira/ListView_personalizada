package com.example.listapersonalizada;

import android.graphics.Bitmap;

public class Contatos {

    private String nome;
    private String visto;
    private Bitmap foto;

    public Contatos(String nome, String visto, Bitmap foto) {
        super();
        this.nome = nome;
        this.visto = visto;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVisto() {
        return visto;
    }

    public void setVisto(String visto) {
        this.visto = visto;
    }

    public Bitmap getFoto() {
        return foto;
    }

    public void setFoto(Bitmap foto) {
        this.foto = foto;
    }
}
