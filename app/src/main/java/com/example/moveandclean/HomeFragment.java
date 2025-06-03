package com.example.moveandclean;
// app/src/main/java/com/yourpackage/HomeFragment.java

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
// Add other imports as needed

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Initialize your UI elements here, using the 'view' parameter
        // 'view' is the root view of fragment_home.xml
        etSearch = view.findViewById(R.id.et_search);
        rvPopularServices = view.findViewById(R.id.rv_popular_services);
        rvProviders = view.findViewById(R.id.rv_providers);
        imgPromoBanner = view.findViewById(R.id.img_promo_banner);

        // Now you can set up your RecyclerViews, click listeners for etSearch, etc.
        // Example for RecyclerViews:
        if (rvPopularServices != null) {
            rvPopularServices.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
            // rvPopularServices.setAdapter(new PopularServicesAdapter(...)); // Set your adapter here
        }
        if (rvProviders != null) {
            rvProviders.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
            // rvProviders.setAdapter(new ProvidersAdapter(...)); // Set your adapter here
        }
    }
}
