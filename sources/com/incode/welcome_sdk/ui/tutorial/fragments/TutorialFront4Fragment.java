package com.incode.welcome_sdk.ui.tutorial.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.incode.welcome_sdk.R;

/* JADX INFO: loaded from: classes5.dex */
public class TutorialFront4Fragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17947a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17948b = 0;

    public static TutorialFront4Fragment newInstance() {
        int i2 = 2 % 2;
        TutorialFront4Fragment tutorialFront4Fragment = new TutorialFront4Fragment();
        int i3 = f17947a + 17;
        f17948b = i3 % 128;
        int i4 = i3 % 2;
        return tutorialFront4Fragment;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f17948b + 49;
        f17947a = i3 % 128;
        int i4 = i3 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_fragment_tutorial_front_4, viewGroup, false);
        int i5 = f17948b + 25;
        f17947a = i5 % 128;
        int i6 = i5 % 2;
        return viewInflate;
    }
}
