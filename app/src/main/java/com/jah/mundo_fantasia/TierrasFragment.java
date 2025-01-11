package com.jah.mundo_fantasia;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class TierrasFragment extends Fragment {

    RecyclerView rvTierras;
    AdaptadorTierras adaptadorTierras;
    LinearLayoutManager disposicion;
    List<Tierra> tierras;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tierras, container, false);
        rvTierras = view.findViewById(R.id.rvTierras);
        cargarTierras();
        disposicion = new LinearLayoutManager(requireContext());
        rvTierras.setLayoutManager(disposicion);
        adaptadorTierras = new AdaptadorTierras(tierras);
        rvTierras.setAdapter(adaptadorTierras);

        return view;
    }

    public void cargarTierras(){
        tierras = new ArrayList<>();
        tierras.add(new Tierra("Necrolimbo", R.drawable.necrolimbo, "Elden ring", "Limgrave es una sección exuberante y expansiva del dominio de Tenebrae. Los árboles dorados y la hierba alta y los arbustos proporcionan mucho sustento para la vida silvestre local, que cuenta con jabalíes, ovejas, cabras y roedores, además de criaturas voladoras como águilas y búhos. También existe una vida silvestre más siniestra y agresiva, y aquellos que se aventuren deben estar preparados para combatirlos."));
        tierras.add(new Tierra("Liurnia", R.drawable.liurnia, "Elden ring", "Con sus aguas poco profundas y sus vastos humedales, la región de Liurnia está acosada por el hundimiento gradual de la mayor parte de su masa continental. Con sus bosques perpetuamente cubiertos de niebla, se pueden escuchar a lo lejos espeluznantes sonidos de campanas."));
        tierras.add(new Tierra("Leyndell", R.drawable.leyndell, "Elden ring", "La capital, situada a los pies del Erdtree. A pesar de haber sido parcialmente destruido por el dragón Gransax, todavía se mantiene fuerte hasta el día de hoy. Alberga a muchos enemigos fuertes, junto con el misterioso monarca velado, Morgott."));
        tierras.add(new Tierra("Palacio de Mogwhyn", R.drawable.palaciomogwin, "Elden ring", "En las profundidades sin luz yace la tumba de una antigua civilización. Es aquí donde Mohg, el Señor de la Sangre, está construyendo su palacio, para ser la sede de su próxima dinastía llamada Mohgwyn. Y cualquier pesadilla que eso pueda traer."));
        tierras.add(new Tierra("Árbol Hierático", R.drawable.arbolhieratico, "Elden ring", "El Haligtree de Miquella es un Mazmorra de legado en Anillo de Elden. El Haligtree de Miquella se encuentra muy al norte de la Campo de nieve consagrado y todas las Tierras Intermedias. Te encontrarás en el dosel de un gran árbol ramificado, luchando contra enemigos mortales. Si estás buscando la zona del castillo situada dentro del Haligtree de Miquella, visita Elphael, Brazalete del Haligtree."));
    }
}