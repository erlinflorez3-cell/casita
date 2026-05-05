package com.incode.welcome_sdk.ui.results.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.incode.welcome_sdk.d.bi;
import com.incode.welcome_sdk.data.remote.beans.LivenessCheckResults;

/* JADX INFO: loaded from: classes5.dex */
public class LivenessCheckResultsFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17330a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f17331d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LivenessCheckResults f17332e;

    public static LivenessCheckResultsFragment newInstance(LivenessCheckResults livenessCheckResults) {
        int i2 = 2 % 2;
        LivenessCheckResultsFragment livenessCheckResultsFragment = new LivenessCheckResultsFragment();
        livenessCheckResultsFragment.f17332e = livenessCheckResults;
        int i3 = f17330a + 11;
        f17331d = i3 % 128;
        int i4 = i3 % 2;
        return livenessCheckResultsFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        bi biVarB = bi.b(layoutInflater, viewGroup);
        if (this.f17332e != null) {
            int i3 = f17330a + 117;
            f17331d = i3 % 128;
            int i4 = i3 % 2;
            biVarB.f7097c.setImageResource(this.f17332e.getOverallStatusIconResId());
            biVarB.f7099e.setTextColor(ContextCompat.getColor(layoutInflater.getContext(), this.f17332e.getOverallStatusColorResId()));
            biVarB.f7099e.setText(this.f17332e.getOverallScore());
            biVarB.f7098d.setValue(this.f17332e.getLivenessScore());
            biVarB.f7095a.setValue(this.f17332e.getPhotoQuality());
            int i5 = f17331d + 23;
            f17330a = i5 % 128;
            int i6 = i5 % 2;
        }
        return biVarB.c();
    }
}
