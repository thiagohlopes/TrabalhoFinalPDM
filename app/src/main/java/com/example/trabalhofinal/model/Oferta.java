package com.example.trabalhofinal.model;

public class Oferta {

    private long id;
    private float preco;
    private String nome;
    private String mercado;

    public Oferta(long id, float preco, String nome, String mercado) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
        this.mercado = mercado;
    }

    public Oferta(float preco, String nome, String mercado) {
        this.preco = preco;
        this.nome = nome;
        this.mercado = mercado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMercado() {
        return mercado;
    }

    public void setMercado(String mercado) {
        this.mercado = mercado;
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "id=" + id +
                ", preco=" + preco +
                ", nome='" + nome + '\'' +
                ", mercado='" + mercado + '\'' +
                '}';
    }
}


