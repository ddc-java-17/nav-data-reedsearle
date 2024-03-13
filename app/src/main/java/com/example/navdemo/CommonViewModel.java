package com.example.navdemo;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class CommonViewModel extends AndroidViewModel {

  private final MutableLiveData<String> sharedContent;

  public CommonViewModel(@NonNull Application application) {
    super(application);
    sharedContent = new MutableLiveData<>();
  }

  public MutableLiveData<String> getSharedContent() {
    return sharedContent;
  }

}
