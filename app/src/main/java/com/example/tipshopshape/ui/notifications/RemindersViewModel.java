package com.example.tipshopshape.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RemindersViewModel extends ViewModel {

    private MutableLiveData<String> screenPlaceholderText;

    public RemindersViewModel() {
        screenPlaceholderText = new MutableLiveData<>();
        screenPlaceholderText.setValue("Items you may have forgot");
    }

    public LiveData<String> getText() {
        return screenPlaceholderText;
    }
}