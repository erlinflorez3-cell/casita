package com.incode.welcome_sdk.ui.tutorial.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.incode.welcome_sdk.R;

/* JADX INFO: loaded from: classes5.dex */
public class TutorialPassport4Fragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17955a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f17956d = 0;

    public static TutorialPassport4Fragment newInstance() {
        int i2 = 2 % 2;
        TutorialPassport4Fragment tutorialPassport4Fragment = new TutorialPassport4Fragment();
        int i3 = f17956d + 83;
        f17955a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 22 / 0;
        }
        return tutorialPassport4Fragment;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        boolean z2;
        int i3 = 2 % 2;
        int i4 = f17955a + 95;
        f17956d = i4 % 128;
        if (i4 % 2 != 0) {
            i2 = R.layout.onboard_sdk_fragment_tutorial_passport_4;
            z2 = true;
        } else {
            i2 = R.layout.onboard_sdk_fragment_tutorial_passport_4;
            z2 = false;
        }
        View viewInflate = layoutInflater.inflate(i2, viewGroup, z2);
        int i5 = f17956d + 113;
        f17955a = i5 % 128;
        int i6 = i5 % 2;
        return viewInflate;
    }
}
