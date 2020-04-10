package com.example.tipshopshape.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GoShoppingViewModel extends ViewModel {

    private MutableLiveData<String> screenPlaceholderText;

    public GoShoppingViewModel() {
        screenPlaceholderText = new MutableLiveData<>();
        screenPlaceholderText.setValue("Check items off you list");
    }

    public LiveData<String> getText() {
        return screenPlaceholderText;
    }
}