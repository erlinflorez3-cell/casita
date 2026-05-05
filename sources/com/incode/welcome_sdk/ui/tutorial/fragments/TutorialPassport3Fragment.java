package com.incode.welcome_sdk.ui.tutorial.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.incode.welcome_sdk.R;

/* JADX INFO: loaded from: classes5.dex */
public class TutorialPassport3Fragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17953b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17954e = 0;

    public static TutorialPassport3Fragment newInstance() {
        int i2 = 2 % 2;
        TutorialPassport3Fragment tutorialPassport3Fragment = new TutorialPassport3Fragment();
        int i3 = f17953b + 53;
        f17954e = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 63 / 0;
        }
        return tutorialPassport3Fragment;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f17954e + 107;
        f17953b = i3 % 128;
        int i4 = i3 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_fragment_tutorial_passport_3, viewGroup, false);
        int i5 = f17954e + 7;
        f17953b = i5 % 128;
        if (i5 % 2 != 0) {
            return viewInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
