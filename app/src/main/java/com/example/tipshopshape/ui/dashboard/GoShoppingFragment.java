package com.example.tipshopshape.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.tipshopshape.R;

public class GoShoppingFragment extends Fragment {

    private GoShoppingViewModel goShoppingViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        goShoppingViewModel =
                ViewModelProviders.of(this).get(GoShoppingViewModel.class);

        View root = inflater.inflate(R.layout.fragment_go_shopping, container, false);

        final TextView placeholderTextView = root.findViewById(R.id.placeholder_go_shopping);

        goShoppingViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String newVal) {
                placeholderTextView.setText(newVal);
            }
        });

        return root;
    }
}
