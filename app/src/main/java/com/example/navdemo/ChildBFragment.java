package com.example.navdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.example.navdemo.databinding.FragmentChildBBinding;

public class ChildBFragment extends Fragment {

  private FragmentChildBBinding binding;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    binding = FragmentChildBBinding.inflate(inflater, container, false);
    return inflater.inflate(R.layout.fragment_child_b, container, false);
  }
}