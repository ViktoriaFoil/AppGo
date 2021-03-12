package com.example.myappgo.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Выжить группой - это значит построить 2 глаза. Это 2 пространства, куда противник не сможнт поставить свои камни");

        mText = new MutableLiveData<>();
        mText.setValue("Убить группу соперника - это значит не дать построить глаза.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}