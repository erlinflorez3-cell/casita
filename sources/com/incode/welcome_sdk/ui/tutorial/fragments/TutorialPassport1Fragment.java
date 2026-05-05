package com.incode.welcome_sdk.ui.tutorial.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.incode.welcome_sdk.R;

/* JADX INFO: loaded from: classes5.dex */
public class TutorialPassport1Fragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17949a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17950b = 0;

    public static TutorialPassport1Fragment newInstance() {
        int i2 = 2 % 2;
        TutorialPassport1Fragment tutorialPassport1Fragment = new TutorialPassport1Fragment();
        int i3 = f17950b + 25;
        f17949a = i3 % 128;
        if (i3 % 2 != 0) {
            return tutorialPassport1Fragment;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f17949a + 57;
        f17950b = i3 % 128;
        int i4 = i3 % 2;
        return layoutInflater.inflate(R.layout.onboard_sdk_fragment_tutorial_passport_1, viewGroup, false);
    }
}
