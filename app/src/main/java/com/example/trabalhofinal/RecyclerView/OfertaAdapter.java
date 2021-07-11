package com.example.trabalhofinal.RecyclerView;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OfertaAdapter extends RecyclerView.Adapter<OfertaViewHolder>
{
    private ArrayList<Oferta> ofertas;
    private Activity activity;

    public OfertaAdapter(ArrayList<Oferta> Ofertas, Activity activity) {
        this.ofertas = Ofertas;
        this.activity = activity;
    }

    @NonNull
    @Override
    public OfertaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.activity_view_holder_oferta, parent, false);
        OfertaViewHolder viewHolder = new OfertaViewHolder(itemView, activity);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OfertaViewHolder holder, int position)
    {
        holder.bind(this.ofertas.get(position));
    }

    @Override
    public int getItemCount() {
        if(this.ofertas!=null)
            return this.ofertas.size();
        else return 0;
    }
}
