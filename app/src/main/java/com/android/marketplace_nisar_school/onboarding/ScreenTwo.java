package com.android.marketplace_nisar_school.onboarding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.viewpager2.widget.ViewPager2;

import com.android.marketplace_nisar_school.R;
import com.android.marketplace_nisar_school.databinding.FragmentScreenTwoBinding;
import com.android.marketplace_nisar_school.others.Utils;

import org.jetbrains.annotations.NotNull;

public class ScreenTwo extends Fragment {
    FragmentScreenTwoBinding binding;

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentScreenTwoBinding.inflate(inflater, container, false);


        View view = binding.getRoot();

        ViewPager2 viewPager2 = getActivity().findViewById(R.id.viewPager);

        binding.next2.setOnClickListener(v -> viewPager2.setCurrentItem(2));

        binding.skip2.setOnClickListener(v -> {
            Utils.onBoardingDone(requireContext());
            Navigation.findNavController(v).navigate(R.id.action_viewPagerFragment_to_registerFragment);
        });
        return view;
    }
}