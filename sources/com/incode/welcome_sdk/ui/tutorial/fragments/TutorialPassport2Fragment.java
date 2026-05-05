package com.incode.welcome_sdk.ui.tutorial.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.incode.welcome_sdk.R;

/* JADX INFO: loaded from: classes5.dex */
public class TutorialPassport2Fragment extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f17951d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17952e = 1;

    public static TutorialPassport2Fragment newInstance() {
        int i2 = 2 % 2;
        TutorialPassport2Fragment tutorialPassport2Fragment = new TutorialPassport2Fragment();
        int i3 = f17952e + 15;
        f17951d = i3 % 128;
        int i4 = i3 % 2;
        return tutorialPassport2Fragment;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f17952e + 83;
        f17951d = i3 % 128;
        int i4 = i3 % 2;
        return layoutInflater.inflate(R.layout.onboard_sdk_fragment_tutorial_passport_2, viewGroup, false);
    }
}
