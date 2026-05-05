package com.incode.welcome_sdk.ui.tutorial.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.incode.welcome_sdk.R;

/* JADX INFO: loaded from: classes5.dex */
public class TutorialFront3Fragment extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f17945c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17946e = 0;

    public static TutorialFront3Fragment newInstance() {
        int i2 = 2 % 2;
        TutorialFront3Fragment tutorialFront3Fragment = new TutorialFront3Fragment();
        int i3 = f17945c + 3;
        f17946e = i3 % 128;
        if (i3 % 2 == 0) {
            return tutorialFront3Fragment;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f17945c + 11;
        f17946e = i3 % 128;
        int i4 = i3 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_fragment_tutorial_front_3, viewGroup, false);
        int i5 = f17945c + 79;
        f17946e = i5 % 128;
        int i6 = i5 % 2;
        return viewInflate;
    }
}
