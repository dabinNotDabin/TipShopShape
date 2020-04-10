package com.example.tipshopshape.ui.notifications;

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

public class RemindersFragment extends Fragment {

    private RemindersViewModel remindersViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        remindersViewModel =
                ViewModelProviders.of(this).get(RemindersViewModel.class);

        View root = inflater.inflate(R.layout.fragment_reminders, container, false);

        final TextView textView = root.findViewById(R.id.text_reminders);

        remindersViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        return root;
    }
}
