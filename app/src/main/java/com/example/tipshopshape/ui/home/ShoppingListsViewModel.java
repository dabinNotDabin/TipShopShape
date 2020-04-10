package com.example.tipshopshape.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShoppingListsViewModel extends ViewModel {

    private MutableLiveData<String> screenPlaceholderText;

    public ShoppingListsViewModel() {
        screenPlaceholderText = new MutableLiveData<>();
        screenPlaceholderText.setValue("These are your lists");
    }

    public LiveData<String> getText() {
        return screenPlaceholderText;
    }
}