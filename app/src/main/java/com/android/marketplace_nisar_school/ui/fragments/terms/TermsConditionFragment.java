package com.android.marketplace_nisar_school.ui.fragments.terms;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.android.marketplace_nisar_school.R;
import com.android.marketplace_nisar_school.databinding.FragmentTermsConditionBinding;

public class TermsConditionFragment extends Fragment {

    private FragmentTermsConditionBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentTermsConditionBinding.inflate(inflater, container, false);
        View view = binding.getRoot();

        binding.finished.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_termsConditionFragment_to_registerFragment);
        });

        return view;
    }
}