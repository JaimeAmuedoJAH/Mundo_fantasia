package com.jah.mundo_fantasia;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 paginador = findViewById(R.id.paginador);
        FragmentStateAdapter fragmentStateAdapter= new fragmentAdapter(this);
        paginador.setAdapter(fragmentStateAdapter);
    }

    private static class fragmentAdapter extends FragmentStateAdapter {
        public fragmentAdapter(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            Fragment fragment;

            switch (position){
                case 0:
                    fragment = new TierrasFragment();
                    break;
                case 1:
                    fragment = new PersonajesFragment();
                    break;
                case 2:
                    fragment = new ArmasFragment();
                    break;
                default:
                    fragment = null;
                    break;
            }
            return fragment;
        }

        @Override
        public int getItemCount() {
            return 3;
        }
    }
}