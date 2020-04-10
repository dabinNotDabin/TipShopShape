package com.example.tipshopshape.ui.home;

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

public class ShoppingListsFragment extends Fragment {

    private ShoppingListsViewModel shoppingListsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        shoppingListsViewModel =
                ViewModelProviders.of(this).get(ShoppingListsViewModel.class);

        View root = inflater.inflate(R.layout.fragment_shopping_lists, container, false);

        final TextView textView = root.findViewById(R.id.placeholder_shopping_lists);

        shoppingListsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        return root;
    }
}
