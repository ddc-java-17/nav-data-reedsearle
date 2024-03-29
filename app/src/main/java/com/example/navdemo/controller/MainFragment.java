package com.example.navdemo.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import com.example.navdemo.databinding.FragmentMainBinding;

public class MainFragment extends Fragment {

  private FragmentMainBinding binding;

  @Override
  public View onCreateView(
      LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    binding = FragmentMainBinding.inflate(inflater, container, false);
    View root = binding.getRoot();
    return root;
  }

  @Override
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    NavController navController = Navigation
        .findNavController(binding.getRoot());
    //noinspection DataFlowIssue
    binding.navigateB.setOnClickListener((v) ->
        navController.navigate(MainFragmentDirections.navigateToB(binding.content.getText().toString())));
    binding.navigateC.setOnClickListener((v) ->
        navController.navigate(MainFragmentDirections.navigateToC()));
    binding.navigateD.setOnClickListener((v) ->
        navController.navigate(MainFragmentDirections.navigateToD()));

  }
}