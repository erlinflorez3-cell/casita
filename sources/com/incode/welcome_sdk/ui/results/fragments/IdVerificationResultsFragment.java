package com.incode.welcome_sdk.ui.results.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pair;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.utils.ResourceUtils;
import com.incode.welcome_sdk.d.bg;
import com.incode.welcome_sdk.data.remote.beans.IdVerificationResults;
import com.incode.welcome_sdk.data.remote.beans.ResultsStatus;
import com.incode.welcome_sdk.ui.results.common.PropertyViewIcon;
import java.io.File;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class IdVerificationResultsFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17324b = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f17325g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IdVerificationResults f17326a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f17327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private bg f17328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f17329e;

    public static IdVerificationResultsFragment newInstance(File file, File file2, IdVerificationResults idVerificationResults) {
        int i2 = 2 % 2;
        IdVerificationResultsFragment idVerificationResultsFragment = new IdVerificationResultsFragment();
        idVerificationResultsFragment.f17327c = file;
        idVerificationResultsFragment.f17329e = file2;
        idVerificationResultsFragment.f17326a = idVerificationResults;
        int i3 = f17325g + 7;
        f17324b = i3 % 128;
        if (i3 % 2 == 0) {
            return idVerificationResultsFragment;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        bg bgVarB = bg.b(layoutInflater, viewGroup);
        this.f17328d = bgVarB;
        NestedScrollView nestedScrollViewC = bgVarB.c();
        if (this.f17326a != null) {
            int i3 = f17325g + 57;
            f17324b = i3 % 128;
            if (i3 % 2 != 0) {
                this.f17328d.f7070e.setImageResource(this.f17326a.getOverallStatusIconResId());
                this.f17326a.isManualCheckNeeded();
                throw null;
            }
            this.f17328d.f7070e.setImageResource(this.f17326a.getOverallStatusIconResId());
            if (this.f17326a.isManualCheckNeeded()) {
                b();
            } else {
                int i4 = f17324b + 99;
                f17325g = i4 % 128;
                int i5 = i4 % 2;
                d(nestedScrollViewC.getContext());
                int i6 = f17324b + 75;
                f17325g = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return nestedScrollViewC;
    }

    private void d(Context context) {
        int i2 = 2 % 2;
        int i3 = f17324b + 43;
        f17325g = i3 % 128;
        int i4 = i3 % 2;
        this.f17328d.f7073h.setTextColor(ContextCompat.getColor(context, this.f17326a.getOverallStatusColorResId()));
        this.f17328d.f7073h.setText(this.f17326a.getOverallScore());
        b(this.f17327c, R.drawable.onboard_sdk_placeholder_id_front, this.f17328d.f7068c);
        b(this.f17329e, R.drawable.onboard_sdk_placeholder_id_back, this.f17328d.f7069d);
        c(this.f17328d.f7066a, this.f17326a.getPhotoSecurityAndQualityMap());
        c(this.f17328d.f7067b, this.f17326a.getIdSpecificMap());
        int i5 = f17324b + 81;
        f17325g = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void b(File file, int i2, ImageView imageView) {
        int i3 = 2 % 2;
        Glide.with(this).load(file).transform(new RoundedCorners(Math.max((int) getResources().getDimension(R.dimen.onboard_sdk_id_corners_rounding_radius), 1))).skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).placeholder(i2).into(imageView);
        int i4 = f17325g + 39;
        f17324b = i4 % 128;
        int i5 = i4 % 2;
    }

    private void c(LinearLayout linearLayout, Map<String, Pair<String, ResultsStatus>> map) {
        int i2 = 2 % 2;
        Iterator<String> it = map.keySet().iterator();
        int i3 = f17325g + 69;
        f17324b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (it.hasNext()) {
            i5++;
            PropertyViewIcon propertyViewIconC = c(map, i5, it.next());
            if (propertyViewIconC != null) {
                int i6 = f17324b + 89;
                f17325g = i6 % 128;
                linearLayout.addView(propertyViewIconC, -1, i6 % 2 == 0 ? 14 : -2);
            }
        }
    }

    private PropertyViewIcon c(Map<String, Pair<String, ResultsStatus>> map, int i2, String str) {
        int i3 = 2 % 2;
        Pair<String, ResultsStatus> pair = map.get(str);
        if (pair != null) {
            if (pair.first == null) {
                return null;
            }
            PropertyViewIcon propertyViewIcon = new PropertyViewIcon(getContext());
            propertyViewIcon.setIndex(i2);
            propertyViewIcon.setName(ResourceUtils.getTranslatedString(getContext(), "onboard_sdk_property_", str));
            propertyViewIcon.setValue(new Pair<>(ResourceUtils.getTranslatedString(getContext(), "onboard_sdk_results_status_", pair.first.toLowerCase(Locale.US)), pair.second));
            return propertyViewIcon;
        }
        int i4 = f17325g;
        int i5 = i4 + 121;
        f17324b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        int i7 = i4 + 71;
        f17324b = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private void b() {
        int i2 = 2 % 2;
        int i3 = f17324b + 19;
        f17325g = i3 % 128;
        int i4 = i3 % 2;
        this.f17328d.f7073h.setVisibility(8);
        this.f17328d.f7074i.setVisibility(8);
        this.f17328d.f7071f.setVisibility(8);
        this.f17328d.f7072g.setVisibility(0);
        int i5 = f17324b + 7;
        f17325g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
