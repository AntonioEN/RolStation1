package com.example.rolstation.ui.Juegos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.rolstation.R;

public class Fragment_Juegos extends Fragment {
    private View root;

    private JuegosViewModel juegosViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        juegosViewModel = ViewModelProviders.of(this).get(JuegosViewModel.class);
        root= inflater.inflate(R.layout.fragment_lista_juegos, container, false);
        return root;
    }
}
