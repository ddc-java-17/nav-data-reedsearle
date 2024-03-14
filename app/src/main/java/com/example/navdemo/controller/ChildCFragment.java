package com.example.navdemo.controller;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.navdemo.databinding.FragmentChildCBinding;
import com.example.navdemo.viewmodel.CommonViewModel;

public class ChildCFragment extends Fragment {

  private FragmentChildCBinding binding;
  private CommonViewModel viewModel;
  private boolean updatingContent;

  @Override
  public View onCreateView(
      LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    binding = FragmentChildCBinding.inflate(inflater, container, false);
    return binding.getRoot();
  }

  @Override
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    binding.content.setSaveEnabled(false);
    binding.content.addTextChangedListener(new ContentWatcher());
    viewModel = new ViewModelProvider(requireActivity()).get(CommonViewModel.class);
    viewModel
        .getSharedContent()
        .observe(getViewLifecycleOwner(), (content) -> {
          if (!updatingContent) {
            binding.content.setText(content);
          } else {
            updatingContent = false;
          }
        });
  }

  private class ContentWatcher implements TextWatcher {

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
      // Do nothing.
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
      // Do nothing.
    }

    @Override
    public void afterTextChanged(Editable content) {
      updatingContent = true;
      viewModel.getSharedContent().setValue(content.toString());
    }
  }


}