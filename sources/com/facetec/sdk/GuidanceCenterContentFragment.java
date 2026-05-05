package com.facetec.sdk;

import android.app.Fragment;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class GuidanceCenterContentFragment extends Fragment implements ViewTreeObserver.OnGlobalLayoutListener {
    protected LinearLayout B;
    protected LinearLayout C;
    protected ImageView Code;
    protected TextView D;
    protected C F;
    protected TextView I;
    protected TextView L;
    protected TextView S;
    protected TextView V;
    protected TextView Z;

    /* JADX INFO: renamed from: a */
    protected RelativeLayout f2856a;

    /* JADX INFO: renamed from: b */
    protected GradientDrawable f2857b;

    /* JADX INFO: renamed from: c */
    View f2858c;

    /* JADX INFO: renamed from: d */
    protected RelativeLayout f2859d;

    /* JADX INFO: renamed from: e */
    protected GradientDrawable f2860e;

    /* JADX INFO: renamed from: f */
    private RelativeLayout f2861f;

    /* JADX INFO: renamed from: g */
    private TextView f2862g;

    /* JADX INFO: renamed from: h */
    private TextView f2863h;

    /* JADX INFO: renamed from: i */
    private ScreenType f2864i;

    /* JADX INFO: renamed from: j */
    private boolean f2865j = false;

    protected enum ScreenType {
        GENERIC,
        READY_OVAL
    }

    protected static GuidanceCenterContentFragment Code(int i2, int i3, ScreenType screenType, float f2, float f3) {
        GuidanceCenterContentFragment guidanceCenterContentFragment = new GuidanceCenterContentFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("header", i2);
        bundle.putInt("message", i3);
        bundle.putSerializable("screenType", screenType);
        bundle.putFloat("topOval", f2);
        bundle.putFloat("bottomOval", f3);
        guidanceCenterContentFragment.setArguments(bundle);
        return guidanceCenterContentFragment;
    }

    protected final void B(int i2) {
        String[] strArrSplit = bb.Z(i2).split("\n\n");
        if (strArrSplit.length != 2) {
            bb.B(this.V, i2);
            this.f2862g.setVisibility(8);
        } else {
            this.V.setText(strArrSplit[0]);
            this.f2862g.setText(strArrSplit[1]);
            this.f2862g.setVisibility(0);
        }
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.facetec_guidance_center_content_fragment, viewGroup, false);
        this.f2858c = viewInflate;
        return viewInflate;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.f2865j) {
            return;
        }
        this.f2865j = true;
        this.f2856a.post(new t(this, this));
    }

    @Override // android.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.feedbackIconsLayout);
        this.B = (LinearLayout) view.findViewById(R.id.zoomIconLayout);
        this.Code = (ImageView) view.findViewById(R.id.zoomDialogImage);
        TextView textView = (TextView) view.findViewById(R.id.genericHeaderView);
        this.I = textView;
        ba.Z(textView);
        this.I.setTypeface(bn.Code);
        this.I.setLineSpacing(0.0f, ba.V);
        TextView textView2 = (TextView) view.findViewById(R.id.feedbackIconsHeader);
        this.f2863h = textView2;
        ba.Z(textView2);
        this.f2863h.setTypeface(bn.Code);
        this.f2863h.setLineSpacing(0.0f, ba.V);
        this.V = (TextView) view.findViewById(R.id.zoomDialogText1);
        this.f2862g = (TextView) view.findViewById(R.id.zoomDialogText2);
        this.V.setTypeface(bn.I);
        this.f2862g.setTypeface(bn.I);
        ba.Z(this.V);
        ba.Z(this.f2862g);
        this.V.setLineSpacing(0.0f, ba.V);
        this.f2862g.setLineSpacing(0.0f, ba.V);
        this.f2861f = (RelativeLayout) view.findViewById(R.id.readyScreenContent);
        this.Z = (TextView) view.findViewById(R.id.readyScreenHeader1);
        this.L = (TextView) view.findViewById(R.id.readyScreenHeader2);
        this.S = (TextView) view.findViewById(R.id.readyScreenSubtext1);
        this.D = (TextView) view.findViewById(R.id.readyScreenSubtext2);
        this.f2856a = (RelativeLayout) view.findViewById(R.id.readyScreenHeaderOuterContainer);
        this.f2859d = (RelativeLayout) view.findViewById(R.id.readyScreenSubtextOuterContainer);
        this.C = (LinearLayout) view.findViewById(R.id.readyScreenHeaderInnerContainer);
        this.F = (C) view.findViewById(R.id.readyScreenSubtextInnerContainer);
        this.Z.setTypeface(ba.x());
        this.L.setTypeface(ba.x());
        this.S.setTypeface(ba.y());
        this.D.setTypeface(ba.y());
        this.Z.setTextColor(ba.L(getActivity()));
        this.L.setTextColor(ba.L(getActivity()));
        this.S.setTextColor(ba.D(getActivity()));
        this.D.setTextColor(ba.D(getActivity()));
        this.Z.setLineSpacing(0.0f, ba.V);
        this.L.setLineSpacing(0.0f, ba.V);
        this.S.setLineSpacing(0.0f, ba.V);
        this.D.setLineSpacing(0.0f, ba.V);
        float fCode = ba.Code() * ba.V();
        this.Z.setTextSize(2, ba.f2964d * fCode);
        this.L.setTextSize(2, ba.f2964d * fCode);
        this.S.setTextSize(2, ba.f2965e * fCode);
        this.D.setTextSize(2, ba.f2965e * fCode);
        this.I.setTextSize(2, ba.f2962b * fCode);
        this.f2863h.setTextSize(2, ba.f2962b * fCode);
        this.V.setTextSize(2, ba.f2961a * fCode);
        int iZ = ba.Z();
        view.setPadding(iZ, iZ, iZ, 0);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f2856a.getLayoutParams();
        layoutParams.setMarginStart(iZ);
        layoutParams.setMarginEnd(iZ);
        this.f2856a.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f2859d.getLayoutParams();
        layoutParams2.setMarginStart(iZ);
        layoutParams2.setMarginEnd(iZ);
        this.f2859d.setLayoutParams(layoutParams2);
        ScreenType screenType = (ScreenType) getArguments().get("screenType");
        this.f2864i = screenType;
        if (screenType == ScreenType.GENERIC) {
            bb.B(this.I, getArguments().getInt("header"));
        } else {
            bb.B(this.f2863h, getArguments().getInt("header"));
        }
        if (this.f2864i == ScreenType.GENERIC) {
            bb.B(this.V, getArguments().getInt("message"));
        } else if (this.f2864i == ScreenType.READY_OVAL) {
            this.f2861f.setVisibility(0);
            ba.B(this.Z, ba.B(true));
            ba.B(this.L, ba.Z(true));
            ba.B(this.S, ba.Code(true));
            ba.B(this.D, ba.V(true));
            GradientDrawable gradientDrawable = (GradientDrawable) getResources().getDrawable(R.drawable.facetec_ready_header_background).mutate();
            this.f2857b = gradientDrawable;
            gradientDrawable.setCornerRadius(ce.V(ba.k()) * ba.V());
            ba.I(getActivity(), this.f2857b, ba.H());
            GradientDrawable gradientDrawable2 = (GradientDrawable) getResources().getDrawable(R.drawable.facetec_ready_subtext_background).mutate();
            this.f2860e = gradientDrawable2;
            gradientDrawable2.setCornerRadius(ce.V(ba.k()) * ba.V());
            ba.I(getActivity(), this.f2860e, ba.H());
            this.f2856a.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.B.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams3).height = Math.round(ce.V(ba.I) * fCode);
        ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = iZ;
        this.B.setLayoutParams(layoutParams3);
        ((ViewGroup.MarginLayoutParams) ((LinearLayout.LayoutParams) this.I.getLayoutParams())).bottomMargin = iZ;
    }
}
