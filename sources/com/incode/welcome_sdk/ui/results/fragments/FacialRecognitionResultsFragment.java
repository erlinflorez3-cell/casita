package com.incode.welcome_sdk.ui.results.fragments;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pair;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.d.bh;
import com.incode.welcome_sdk.data.remote.beans.FacialRecognitionResults;
import com.incode.welcome_sdk.data.remote.beans.ResultsStatus;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class FacialRecognitionResultsFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17310b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f17311c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f17312a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f17313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FacialRecognitionResults f17314e;

    public static FacialRecognitionResultsFragment newInstance(File file, File file2, FacialRecognitionResults facialRecognitionResults) {
        int i2 = 2 % 2;
        FacialRecognitionResultsFragment facialRecognitionResultsFragment = new FacialRecognitionResultsFragment();
        facialRecognitionResultsFragment.f17312a = file;
        facialRecognitionResultsFragment.f17313d = file2;
        facialRecognitionResultsFragment.f17314e = facialRecognitionResults;
        int i3 = f17310b + 117;
        f17311c = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 75 / 0;
        }
        return facialRecognitionResultsFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ResultsStatus resultsStatus;
        int i2 = 2 % 2;
        final bh bhVarB = bh.b(layoutInflater, viewGroup);
        FacialRecognitionResults facialRecognitionResults = this.f17314e;
        if (facialRecognitionResults != null) {
            int i3 = f17310b + 51;
            f17311c = i3 % 128;
            if (i3 % 2 != 0) {
                facialRecognitionResults.getOverallScoreAndResultStatus();
                throw null;
            }
            if (facialRecognitionResults.getOverallScoreAndResultStatus() != null) {
                int i4 = f17310b + 73;
                f17311c = i4 % 128;
                int i5 = i4 % 2;
                bhVarB.f7081d.setImageResource(this.f17314e.getOverallStatusIconResId());
                bhVarB.f7083f.setTextColor(ContextCompat.getColor(layoutInflater.getContext(), this.f17314e.getOverallStatusColorResId()));
                bhVarB.f7083f.setText(this.f17314e.getOverallScore());
                bhVarB.f7082e.setText(this.f17314e.getOverallStatusIsPositive() ? R.string.onboard_sdk_facial_recognition_match : R.string.onboard_sdk_facial_recognition_mismatch);
                Glide.with(this).load(this.f17312a).skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).placeholder(R.drawable.onboard_sdk_placeholder_face).into(bhVarB.f7080c);
                Glide.with(this).load(this.f17313d).skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).addListener(new RequestListener<Drawable>() { // from class: com.incode.welcome_sdk.ui.results.fragments.FacialRecognitionResultsFragment.1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    private static int f17315a = 0;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static int f17316d = 1;

                    @Override // com.bumptech.glide.request.RequestListener
                    public final /* synthetic */ boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z2) {
                        int i6 = 2 % 2;
                        int i7 = f17315a + 49;
                        f17316d = i7 % 128;
                        int i8 = i7 % 2;
                        boolean zA = a();
                        int i9 = f17315a + 9;
                        f17316d = i9 % 128;
                        if (i9 % 2 != 0) {
                            return zA;
                        }
                        throw null;
                    }

                    @Override // com.bumptech.glide.request.RequestListener
                    public final boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z2) {
                        int i6 = 2 % 2;
                        int i7 = f17316d + 103;
                        f17315a = i7 % 128;
                        return i7 % 2 != 0;
                    }

                    private boolean a() {
                        int i6 = 2 % 2;
                        int i7 = f17315a + 37;
                        f17316d = i7 % 128;
                        if (i7 % 2 == 0) {
                            bhVarB.f7086i.setVisibility(5);
                            return true;
                        }
                        bhVarB.f7086i.setVisibility(4);
                        return false;
                    }
                }).into(bhVarB.f7078a);
                int i6 = f17311c + 55;
                f17310b = i6 % 128;
                int i7 = i6 % 2;
            }
            boolean zIsExistingUser = this.f17314e.isExistingUser();
            String string = getString(zIsExistingUser ? R.string.onboard_sdk_results_yes : R.string.onboard_sdk_results_no);
            if (zIsExistingUser) {
                resultsStatus = ResultsStatus.FAIL;
            } else {
                resultsStatus = ResultsStatus.OK;
                int i8 = f17311c + 83;
                f17310b = i8 % 128;
                int i9 = i8 % 2;
            }
            bhVarB.f7079b.setValue(new Pair<>(string, resultsStatus));
        }
        NestedScrollView nestedScrollViewE = bhVarB.e();
        int i10 = f17310b + 89;
        f17311c = i10 % 128;
        if (i10 % 2 == 0) {
            return nestedScrollViewE;
        }
        throw null;
    }
}
