package com.jah.mundo_fantasia;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class AdaptadorPersonajes extends RecyclerView.Adapter<AdaptadorPersonajes.HolderPersonajes> {

    List<Personaje> dataSet;
    Context context;
    Personaje p;

    public AdaptadorPersonajes(List<Personaje> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public AdaptadorPersonajes.HolderPersonajes onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.carta_view, parent, false);
        return new HolderPersonajes(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorPersonajes.HolderPersonajes holder, int position) {
        p = dataSet.get(position);

        holder.imgFoto.setImageResource(p.getImagen());
        holder.lblNombre.setText(p.getNombre());
        holder.lblJuego.setText(p.getJuego());
        holder.cvCarta.setOnClickListener(view -> {
            mostrarInfo(dataSet.get(holder.getAdapterPosition()));
        });
    }

    private void mostrarInfo(Personaje personaje) {
        Intent intent = new Intent(context, MostrarInfoActivity.class);
        intent.putExtra("fragment", "personaje");
        intent.putExtra("personaje", personaje);
        context.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public static class HolderPersonajes extends RecyclerView.ViewHolder {

        MaterialCardView cvCarta;
        TextView lblNombre, lblJuego;
        ImageView imgFoto;

        public HolderPersonajes(@NonNull View itemView) {
            super(itemView);
            cvCarta = itemView.findViewById(R.id.cvCarta);
            lblNombre = itemView.findViewById(R.id.lblNombre);
            lblJuego = itemView.findViewById(R.id.lblJuego);
            imgFoto= itemView.findViewById(R.id.imgFoto);
        }
    }
}
