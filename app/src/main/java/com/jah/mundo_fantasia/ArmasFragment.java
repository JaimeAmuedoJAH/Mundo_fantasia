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

public class ArmasFragment extends Fragment {

    RecyclerView rvArmas;
    AdaptadorArmas adaptadorArmas;
    LinearLayoutManager disposicion;
    List<Arma> armas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_armas, container, false);
        rvArmas = view.findViewById(R.id.rvArmas);
        cargarArmas();
        disposicion = new LinearLayoutManager(requireContext());
        rvArmas.setLayoutManager(disposicion);
        adaptadorArmas = new AdaptadorArmas(armas);
        rvArmas.setAdapter(adaptadorArmas);
        return view;
    }

    public void cargarArmas(){
        armas = new ArrayList<>();
        armas.add(new Arma("Colmillo de sabueso", R.drawable.colmillo, "Elden Ring", "Espadón curvo con una hoja suavemente ondulada empuñada por los Caballeros Sabuesos. Una temible espada capaz de brutales ataques aéreos."));
        armas.add(new Arma("Ríos de sangre", R.drawable.rios, "Elden Ring", "Arma de Okina, espadachín de la Tierra de los Juncos.\n" +
                "Un arma maldita que ha derribado a innumerables hombres.\n" +
                "\n" +
                "Cuando Mohg, el Señor de la Sangre, sintió por primera vez la espada y la locura de Okina\n" +
                "en su carne, tuvo una propuesta: ofrecer a Okina la vida de un demonio, cuya sed nunca quedaría sin saciarse."));
        armas.add(new Arma("Espadón", R.drawable.espadon, "Elden Ring", "Un tosco pedazo de hierro de un ultraespadón. Aprovecha su increíble peso para barrer a los enemigos.   Aunque para usarla el portador tiene que haber superado los límites de la humanidad, es precisamente por ese motivo que el arma se utiliza para masacrar incluso a enemigos inhumanos."));
        armas.add(new Arma("Extermindora de dioses", R.drawable.exterminador, "Elden Ring", "Espada sagrada de la Reina del Ojo Velado, que controlaba a los apóstoles sacrodermos antes de sucumbir ante Maliketh.   Las llamas negras de los apóstoles se canalizan a través de esta espada."));
        armas.add(new Arma("Espadón de luna negra", R.drawable.luna, "Elden Ring", "Espadón de la luna otorgado por las reinas carianas a sus cónyuges según una longeva tradición.\n" +
                "Una de las armas legendarias.\n" +
                "\n" +
                "El sello de Ranni es una luna llena, fría y plúmbea, y esta espada es un haz de su luz."));
    }
}