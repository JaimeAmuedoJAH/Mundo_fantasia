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

public class AdaptadorTierras extends RecyclerView.Adapter<AdaptadorTierras.HolderTierras> {

    List<Tierra> dataSet;
    Context context;
    Tierra t;

    public AdaptadorTierras(List<Tierra> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public AdaptadorTierras.HolderTierras onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.carta_view, parent, false);
        return new HolderTierras(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorTierras.HolderTierras holder, int position) {
        t = dataSet.get(position);

        holder.imgFoto.setImageResource(t.getImagen());
        holder.lblNombre.setText(t.getNombre());
        holder.lblJuego.setText(t.getJuego());
        holder.cvCarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarInfo(dataSet.get(holder.getAdapterPosition()));
            }
        });
    }

    private void mostrarInfo(Tierra tierra) {
        Intent intent = new Intent(context, MostrarInfoActivity.class);
        intent.putExtra("tierra", tierra);
        intent.putExtra("fragment", "tierra");
        context.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public static class HolderTierras extends RecyclerView.ViewHolder {

        MaterialCardView cvCarta;
        TextView lblNombre, lblJuego;
        ImageView imgFoto;

        public HolderTierras(@NonNull View itemView) {
            super(itemView);

            cvCarta = itemView.findViewById(R.id.cvCarta);
            lblNombre = itemView.findViewById(R.id.lblNombre);
            lblJuego = itemView.findViewById(R.id.lblJuego);
            imgFoto = itemView.findViewById(R.id.imgFoto);
        }
    }
}
