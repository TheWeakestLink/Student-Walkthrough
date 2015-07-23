package com.cosyde.theweakestlink.studentwalkthrough.fragment;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cosyde.theweakestlink.studentwalkthrough.R;

public class Directory extends Fragment {

    public Directory() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_directory, container, false);
        return rootView;
    }
}
