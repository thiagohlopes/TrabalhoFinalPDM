package com.example.trabalhofinal.RecyclerView;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.trabalhofinal.R;
import com.example.trabalhofinal.model.Oferta;

public class OfertaViewHolder extends RecyclerView.ViewHolder {

    private TextView tv_name;
    private TextView tv_price;
    private Oferta oferta;
    private Activity activity;
    private TextView tv_mercado;

    public OfertaViewHolder(View itemView, final Activity activity){
        super(itemView);
        this.tv_name = itemView.findViewById(R.id.tv_bd_produto);
        this.tv_price = itemView.findViewById(R.id.tv_bd_preco);
        this.tv_mercado = itemView.findViewById(R.id.tv_bd_mercado);
        this.activity = activity;
    }

    public void bind(final Oferta oferta) {
        this.oferta = oferta;
        this.tv_name.setText(this.oferta.getNome());
        this.tv_price.setText(Double.toString(this.oferta.getPreco()));
        this.tv_mercado.setText(this.oferta.getMercado());
    }
}
