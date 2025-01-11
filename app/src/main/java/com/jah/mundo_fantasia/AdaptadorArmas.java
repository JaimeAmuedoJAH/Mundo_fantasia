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

public class AdaptadorArmas extends RecyclerView.Adapter<AdaptadorArmas.HolderArmas> {

    List<Arma> dataSet;
    Context context;
    Arma a;

    public AdaptadorArmas(List<Arma> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public AdaptadorArmas.HolderArmas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.carta_view, parent, false);
        return new HolderArmas(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorArmas.HolderArmas holder, int position) {
        a = dataSet.get(position);

        holder.imgFoto.setImageResource(a.getImagen());
        holder.lblNombre.setText(a.getNombre());
        holder.lblJuego.setText(a.getJuego());
        holder.cvCarta.setOnClickListener(view -> mostrarInfo(dataSet.get(holder.getAdapterPosition())));
    }

    private void mostrarInfo(Arma arma) {
        Intent intent = new Intent(context, MostrarInfoActivity.class);
        intent.putExtra("fragment", "arma");
        intent.putExtra("arma", arma);
        context.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public static class HolderArmas extends RecyclerView.ViewHolder {

        MaterialCardView cvCarta;
        TextView lblNombre, lblJuego;
        ImageView imgFoto;

        public HolderArmas(@NonNull View itemView) {
            super(itemView);

            cvCarta = itemView.findViewById(R.id.cvCarta);
            lblNombre = itemView.findViewById(R.id.lblNombre);
            lblJuego = itemView.findViewById(R.id.lblJuego);
            imgFoto= itemView.findViewById(R.id.imgFoto);
        }
    }
}
