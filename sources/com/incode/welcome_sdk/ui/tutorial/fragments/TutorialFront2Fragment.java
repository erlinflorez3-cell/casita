package com.incode.welcome_sdk.ui.tutorial.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.incode.welcome_sdk.R;

/* JADX INFO: loaded from: classes5.dex */
public class TutorialFront2Fragment extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f17943c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17944e = 1;

    public static TutorialFront2Fragment newInstance() {
        int i2 = 2 % 2;
        TutorialFront2Fragment tutorialFront2Fragment = new TutorialFront2Fragment();
        int i3 = f17944e + 85;
        f17943c = i3 % 128;
        if (i3 % 2 == 0) {
            return tutorialFront2Fragment;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f17944e + 77;
        f17943c = i3 % 128;
        int i4 = i3 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_fragment_tutorial_front_2, viewGroup, false);
        int i5 = f17944e + 19;
        f17943c = i5 % 128;
        int i6 = i5 % 2;
        return viewInflate;
    }
}
