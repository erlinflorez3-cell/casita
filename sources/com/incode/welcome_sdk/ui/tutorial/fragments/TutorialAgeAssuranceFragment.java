package com.incode.welcome_sdk.ui.tutorial.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.incode.welcome_sdk.R;

/* JADX INFO: loaded from: classes5.dex */
public class TutorialAgeAssuranceFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17939a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f17940c = 1;

    public static TutorialAgeAssuranceFragment newInstance() {
        int i2 = 2 % 2;
        TutorialAgeAssuranceFragment tutorialAgeAssuranceFragment = new TutorialAgeAssuranceFragment();
        int i3 = f17940c + 113;
        f17939a = i3 % 128;
        int i4 = i3 % 2;
        return tutorialAgeAssuranceFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f17939a + 29;
        f17940c = i3 % 128;
        int i4 = i3 % 2;
        return layoutInflater.inflate(R.layout.onboard_sdk_fragment_tutorial_age_assurance, viewGroup, false);
    }
}
