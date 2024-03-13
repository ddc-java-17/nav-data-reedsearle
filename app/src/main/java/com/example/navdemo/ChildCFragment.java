package com.example.navdemo;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.navdemo.databinding.FragmentChildCBinding;

public class ChildCFragment extends Fragment {

  private FragmentChildCBinding binding;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    binding = FragmentChildCBinding.inflate(inflater, container, false);
    return binding.getRoot();
  }
}