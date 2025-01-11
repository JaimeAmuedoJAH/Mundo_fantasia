package com.jah.mundo_fantasia;

import android.app.Person;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class PersonajesFragment extends Fragment {

    RecyclerView rvPersonajes;
    AdaptadorPersonajes adaptadorPersonajes;
    LinearLayoutManager disposicion;
    List<Personaje> personajes;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_personajes, container, false);
        rvPersonajes = view.findViewById(R.id.rvPersonajes);
        cargarPersonajes();
        disposicion = new LinearLayoutManager(requireContext());
        rvPersonajes.setLayoutManager(disposicion);
        adaptadorPersonajes = new AdaptadorPersonajes(personajes);
        rvPersonajes.setAdapter(adaptadorPersonajes);

        return view;
    }

    public void cargarPersonajes(){
        personajes = new ArrayList<>();
        personajes.add(new Personaje("Alexander", R.drawable.alexander, "Elden ring", "Iron Fist Alexander (también conocido como Alexander, Warrior Jar). Iron Fist Alexander es un gran Tarro viviente que un día partió de su casa en busca de aventuras, buscando convertirse en un poderoso guerrero. Soy Alexander, también conocido como el Puño de Hierro. Y como puedes ver, estoy atrapado aquí."));
        personajes.add(new Personaje("Malena", R.drawable.malenia, "Elden ring", "Malenia, Espada de Miquella y Malenia, Diosa de la Podredumbre es una Semidiós Jefe en Elden Ring. Ella es la Empíreo hermana gemela de Miquella y ganó renombre por su legendaria batalla contra Azote de las estrellas Radahn durante la Fragmentación, en la que desató el poder de la Podredumbre Escarlata y redujo Caelid a las ruinas. Este es un jefe opcional, ya que los jugadores no necesitan derrotarla para avanzar en Elden Ring. Presta atención a mis palabras. Soy Malenia. Espada de Miquella. Y nunca he conocido la derrota"));
        personajes.add(new Personaje("Messmer", R.drawable.messmer, "Elden ring", "Messmer el Empalador es un Semidiós Jefe en Sombra del Erdtree. Lucha junto a los bicéfalos Serpiente abisal y utiliza productos a base de fuego Hechizos para atacar al jugador, así como una lanza de largo alcance. Se revela que Él es Reina Marika, escondido y abandonado en la Tierra de las Sombras. Madre, ¿acaso tu Señoría sancionaría, en uno tan desprovisto de luz?"));
        personajes.add(new Personaje("Maliketh", R.drawable.maliketh, "Elden ring", "Beast Clergyman y Maliketh, The Black Blade es una película de dos fases Jefe de leyenda en Anillo de Elden. Gurranq, Clérigo de la Bestia se encuentra al final de Farum Azula desmoronado y se revela que es Maliketh, la Espada Negra. De manera similar a cómo Blaidd es Ranni, Maliketh es La reina Marika Bestia ligada a las sombras. Se le encomendó la tarea de proteger la Runa de la Muerte, pero su fracaso en hacerlo condujo a la Noche de los Cuchillos Negros. Para que esto no volviera a suceder, impregnó la runa en su propia carne. Oh, muerte. Conviértete en mi espada, una vez más.\n" +
                "\n"));
        personajes.add(new Personaje("Radahn", R.drawable.radahn, "Elden ring", "Starscourge Radahn es un Jefe de leyenda en Anillo de Elden. Radahn Azote de las Estrellas es proclamado como uno de los seres vivos más poderosos Semidioses, después de haber luchado Malenia la Cortada hasta detenerse durante la Fragmentación. Sin embargo, su aflicción resultante con la Podredumbre Escarlata hizo que lo llevaran a la locura, incapacitándolo y reduciéndolo a un estado de ira salvaje. Se encuentra en Caelid, desde donde se puede acceder desde Castillo de Melenaroja. El General León Rojo ejercía poderes gravitacionales que aprendió en Sellia durante sus días de juventud. Todo para que nunca tuviera que abandonar a su amado pero escuálido corcel."));
    }
}