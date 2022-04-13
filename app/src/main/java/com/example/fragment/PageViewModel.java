package com.example.fragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {
    private MutableLiveData<String> mName = new MutableLiveData<>();
    public void setName(String name ) {
        mName.setValue(name);
    }
    public LiveData<String> getName() {
        return mName;
    }

    private MutableLiveData<String> mAlamat = new MutableLiveData<>();
    public void setAlamat(String alamat ) {
        mAlamat.setValue(alamat);
    }
    public LiveData<String> getAlamat() {
        return mAlamat;
    }

    private MutableLiveData<String> mNumber = new MutableLiveData<>();
    public void setNumber(String number ) {
        mNumber.setValue(number);
    }
    public LiveData<String> getNumber() {
        return mNumber;
    }


}

