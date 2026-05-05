package com.facetec.sdk;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.facetec.sdk.ce;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.Od;
import yg.Qg;
import yg.Wg;

/* JADX INFO: loaded from: classes3.dex */
public final class at extends Fragment {
    ImageView B;
    TextView C;
    LinearLayout Code;
    TextView D;
    TextView F;
    ImageView I;
    TextView L;
    LinearLayout S;
    ImageView V;
    ImageView Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    aw f2939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    TextView f2940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    TextView f2941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Bitmap f2942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    GradientDrawable f2943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private LinearLayout f2944f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f2945g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private LinearLayout f2946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private FrameLayout f2947i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private LinearLayout f2948j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f2949k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private FrameLayout f2950l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f2951n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RoundedBitmapDrawable f2952o;

    /* JADX INFO: renamed from: com.facetec.sdk.at$3, reason: invalid class name */
    final class AnonymousClass3 extends av implements ViewTreeObserver.OnGlobalLayoutListener {
        AnonymousClass3(Fragment fragment) {
            super(fragment);
        }

        @Override // com.facetec.sdk.av
        public final void B() {
            at.Code(at.this);
            at.this.L.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (at.this.f2951n) {
                return;
            }
            at.V(at.this);
            at.Code(at.this);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.at$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] V;

        static {
            int[] iArr = new int[ar.values().length];
            V = iArr;
            try {
                iArr[ar.LIGHTING_AND_NEUTRAL_EXPRESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                V[ar.LIGHTING_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                V[ar.NEUTRAL_EXPRESSION_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                V[ar.BLURRY_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static /* synthetic */ void Code(at atVar) {
        float fV = ba.V() * ba.Code();
        int iRound = Math.round(ba.Z() * ba.V());
        double measuredHeight = atVar.f2944f.getMeasuredHeight();
        int iRound2 = (int) Math.round(0.06d * measuredHeight);
        if (n.S() < 1.4d && Resources.getSystem().getDisplayMetrics().heightPixels < 900) {
            iRound2 = (int) Math.round(measuredHeight * 0.07d);
        }
        int iRound3 = (int) Math.round(((double) iRound2) * 0.85d);
        int iRound4 = (int) Math.round(((double) iRound3) * 0.85d);
        int height = atVar.f2945g.getHeight() + iRound4 + ((ViewGroup.MarginLayoutParams) ((LinearLayout.LayoutParams) atVar.f2940b.getLayoutParams())).topMargin;
        atVar.f2948j.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) atVar.f2946h.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams).height = height;
        layoutParams.weight = 0.0f;
        atVar.f2946h.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) atVar.L.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams2).height = iRound2;
        layoutParams2.weight = 0.0f;
        atVar.L.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) atVar.D.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams3).height = iRound3;
        layoutParams3.weight = 0.0f;
        atVar.D.setLayoutParams(layoutParams3);
        atVar.C.setLayoutParams(layoutParams3);
        atVar.F.setLayoutParams(layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) atVar.f2940b.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams4).height = iRound4;
        atVar.f2940b.setLayoutParams(layoutParams4);
        atVar.f2941c.setLayoutParams(layoutParams4);
        int width = atVar.L.getWidth();
        if (ba.aQ()) {
            int iRound5 = Math.round(ce.V(ba.Code) * fV);
            int[] iArr = new int[2];
            atVar.f2949k.getLocationInWindow(iArr);
            int iRound6 = (int) (((long) (iArr[1] + iRound5)) - Math.round(((double) iRound) / 2.0d));
            int[] iArr2 = new int[2];
            atVar.L.getLocationInWindow(iArr2);
            if (iArr2[1] < iRound6) {
                width -= iRound5 << 1;
            }
        }
        ce.I i2 = new ce.I(width, iRound2);
        ce.I i3 = new ce.I(atVar.D.getWidth(), iRound3);
        ce.I i4 = new ce.I(atVar.C.getWidth(), iRound3);
        ce.I i5 = new ce.I(atVar.F.getWidth(), iRound3);
        ce.I i6 = new ce.I(atVar.f2940b.getWidth(), iRound4);
        ce.I i7 = new ce.I(atVar.f2941c.getWidth(), iRound4);
        int iRound7 = Math.round(ce.Code(8));
        int iRound8 = Math.round(ce.Code(40));
        int iRound9 = Math.round(ce.Code(5));
        int iRound10 = Math.round(ce.Code(36));
        int iZ = ce.Z(atVar.L, i2, iRound7, iRound8);
        int iZ2 = ce.Z(atVar.D, i3, iRound9, iRound10);
        int iZ3 = ce.Z(atVar.C, i4, iRound9, iRound10);
        int iZ4 = ce.Z(atVar.F, i5, iRound9, iRound10);
        int iZ5 = ce.Z(atVar.f2940b, i6, iRound9, iRound10);
        int iZ6 = ce.Z(atVar.f2941c, i7, iRound9, iRound10);
        int iRound11 = (int) Math.round(((double) iZ) * 0.85d);
        if (iZ2 >= iRound11) {
            iZ2 = iRound11;
        }
        if (atVar.C.getText().toString().isEmpty() || iZ3 >= iZ2) {
            iZ3 = iZ2;
        }
        if (atVar.F.getText().toString().isEmpty() || iZ4 >= iZ3) {
            iZ4 = iZ3;
        }
        int iRound12 = (int) Math.round(((double) iZ4) * 0.85d);
        if (iZ5 >= iZ4) {
            iZ5 = iRound12;
        }
        if (iZ6 >= iZ4) {
            iZ6 = iZ5;
        }
        atVar.L.setTextSize(0, iZ);
        float f2 = iZ4;
        atVar.D.setTextSize(0, f2);
        atVar.C.setTextSize(0, f2);
        atVar.F.setTextSize(0, f2);
        float f3 = iZ6;
        atVar.f2940b.setTextSize(0, f3);
        atVar.f2941c.setTextSize(0, f3);
    }

    static /* synthetic */ boolean V(at atVar) {
        atVar.f2951n = true;
        return true;
    }

    private static boolean V(bw bwVar) {
        for (int i2 = 0; i2 < cd.Z.length(); i2++) {
            try {
                JSONObject jSONObject = cd.Z.getJSONObject(i2);
                String string = jSONObject.getString("overrideKey");
                bw bwVar2 = (bw) jSONObject.get("type");
                if (FaceTecSDK.V.f2854e.get(string) != null && FaceTecSDK.V.f2854e.get(string).equals(jSONObject.getString("overrideValue")) && bwVar2 == bwVar) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    final void I() {
        if (this.f2942d != null) {
            float height = r0.getHeight() / this.f2942d.getWidth();
            if (height <= 1.776f) {
                float height2 = this.f2942d.getHeight() / 1.776f;
                if (this.f2942d.getWidth() - height2 > 0.0f) {
                    this.f2942d = Bitmap.createBitmap(this.f2942d, (int) ((r3.getWidth() - height2) / 2.0f), 0, (int) height2, this.f2942d.getHeight());
                }
            } else if (height > 1.776f) {
                float width = this.f2942d.getWidth() * 1.776f;
                if (this.f2942d.getHeight() - width > 0.0f) {
                    this.f2942d = Bitmap.createBitmap(this.f2942d, 0, (int) ((r3.getHeight() - width) / 2.0f), this.f2942d.getWidth(), (int) width);
                }
            }
            int width2 = (int) (((double) this.f2942d.getWidth()) * 0.75d);
            int height3 = (int) (((double) this.f2942d.getHeight()) * 0.75d);
            Bitmap bitmap = this.f2942d;
            this.f2942d = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - width2) / 2, (this.f2942d.getHeight() - height3) / 2, width2, height3);
            this.f2952o = RoundedBitmapDrawableFactory.create(getResources(), this.f2942d);
        }
        if (V(bw.YOUR_ZOOM_IMAGE_OVERRIDE)) {
            Resources resources = getResources();
            Activity activity = getActivity();
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1593ug.zd("P^Udb]Y$Zggn`jq,Boovh|y", (short) (C1633zX.Xd() ^ (-1189)), (short) (C1633zX.Xd() ^ (-30157)))).getMethod(C1561oA.od("jguP`ah]b_GYd[", (short) (Od.Xd() ^ (-8834))), new Class[0]);
            try {
                method.setAccessible(true);
                int identifier = resources.getIdentifier(C1561oA.Kd(";121$?6=;)E;<;.9>3:94EM=KLD@B", (short) (Od.Xd() ^ (-10674))), Wg.Zd("]`5l?\"\u0012,", (short) (C1580rY.Xd() ^ (-31546)), (short) (C1580rY.Xd() ^ (-9050))), (String) method.invoke(activity, objArr));
                if (identifier != 0) {
                    this.f2942d = BitmapFactory.decodeResource(getResources(), identifier);
                    this.f2952o = RoundedBitmapDrawableFactory.create(getResources(), this.f2942d);
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.B.setImageDrawable(this.f2952o);
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.facetec_retry_screen_center_content_fragment, viewGroup, false);
    }

    @Override // android.app.Fragment
    public final void onStart() throws Throwable {
        super.onStart();
        Handler handler = new Handler();
        Object[] objArr = {new AnonymousClass3(this), 100L};
        Method method = Class.forName(C1561oA.Xd("$2)861-w:?z\u00160>5>8F", (short) (C1499aX.Xd() ^ (-27450)))).getMethod(Qg.kd(",*--{\u001c\"\u0016-\u0018\u0016", (short) (C1607wl.Xd() ^ 14647), (short) (C1607wl.Xd() ^ 10063)), Class.forName(Wg.vd("wm\u0006o7tlxl2Y{ondd\n\u0002", (short) (C1607wl.Xd() ^ 19560))), Long.TYPE);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // android.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f2944f = (LinearLayout) view.findViewById(R.id.contentLayout);
        this.L = (TextView) view.findViewById(R.id.headerTextView);
        this.D = (TextView) view.findViewById(R.id.subheaderTextView);
        this.C = (TextView) view.findViewById(R.id.instructionMessage1TextView);
        this.F = (TextView) view.findViewById(R.id.instructionMessage2TextView);
        this.f2941c = (TextView) view.findViewById(R.id.yourZoomSubimageTextView);
        this.f2940b = (TextView) view.findViewById(R.id.idealZoomSubimageTextView);
        this.B = (ImageView) view.findViewById(R.id.yourZoomImage);
        this.f2945g = (ImageView) view.findViewById(R.id.idealZoomImage);
        this.Z = (ImageView) view.findViewById(R.id.idealZoomImageBorder);
        this.V = (ImageView) view.findViewById(R.id.yourZoomImageBorder);
        this.I = (ImageView) view.findViewById(R.id.idealOval);
        this.f2939a = (aw) view.findViewById(R.id.idealImageSlideshowView);
        this.f2949k = (TextView) view.findViewById(R.id.cancelButtonSpacer);
        this.f2947i = (FrameLayout) view.findViewById(R.id.yourZoomImageContainer);
        this.f2950l = (FrameLayout) view.findViewById(R.id.idealZoomImageContainer);
        this.Code = (LinearLayout) view.findViewById(R.id.idealZoomLayout);
        this.S = (LinearLayout) view.findViewById(R.id.yourZoomLayout);
        this.f2946h = (LinearLayout) view.findViewById(R.id.sideBySideLayout);
        this.f2948j = (LinearLayout) view.findViewById(R.id.headerAndSubheaderLayout);
        if (ba.aC().length != 0) {
            this.f2945g.setVisibility(4);
        }
        ba.B(this.L, ba.I(true));
        ba.B(this.D, ba.C(true));
        String strL = ba.L(true);
        String strS = ba.S(true);
        int i2 = AnonymousClass5.V[ai.b().ordinal()];
        if (i2 != 2) {
            if (i2 == 3) {
                this.F.setVisibility(8);
            } else if (i2 == 4) {
                strL = ba.F(true);
                this.F.setVisibility(8);
            }
            strS = "";
        } else {
            this.C.setVisibility(8);
            strL = "";
        }
        this.C.setText(strL);
        this.F.setText(strS);
        this.f2941c.setText(ba.e(true));
        this.f2940b.setText(ba.D(true));
        this.L.setTypeface(ba.u());
        this.D.setTypeface(ba.y());
        this.C.setTypeface(ba.w());
        this.F.setTypeface(ba.w());
        this.f2941c.setTypeface(ba.w());
        this.f2940b.setTypeface(ba.w());
        this.L.setLineSpacing(0.0f, ba.V);
        this.D.setLineSpacing(0.0f, ba.V);
        this.C.setLineSpacing(0.0f, ba.V);
        this.F.setLineSpacing(0.0f, ba.V);
        this.L.setTextColor(ba.F(getActivity()));
        this.D.setTextColor(ba.C(getActivity()));
        this.C.setTextColor(ba.C(getActivity()));
        this.F.setTextColor(ba.C(getActivity()));
        this.f2941c.setTextColor(ba.C(getActivity()));
        this.f2940b.setTextColor(ba.C(getActivity()));
        float fCode = ba.Code() * ba.V();
        float f2 = ba.f2966f * fCode;
        this.L.setTextSize(2, ba.f2963c * fCode);
        this.D.setTextSize(2, f2);
        this.C.setTextSize(2, f2);
        this.F.setTextSize(2, f2);
        this.f2941c.setTextSize(2, f2);
        this.f2940b.setTextSize(2, f2);
        this.f2942d = null;
        this.f2952o = null;
        FaceTecSessionActivity faceTecSessionActivity = (FaceTecSessionActivity) getActivity();
        if (faceTecSessionActivity == null) {
            return;
        }
        if (faceTecSessionActivity.W != null) {
            this.f2942d = faceTecSessionActivity.W;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), ba.B(getActivity()));
        I();
        this.f2945g.setImageDrawable(RoundedBitmapDrawableFactory.create(getResources(), bitmapDecodeResource));
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f2943e = gradientDrawable;
        gradientDrawable.setCornerRadius(ce.V((int) (ba.n() * ba.V())));
        this.f2943e.setStroke((int) ce.V(Math.max(ba.F() == 0 ? 0 : 1, (int) (ba.F() * ba.V()))), ba.f(getActivity()));
        this.f2943e.setColor(0);
        RoundedBitmapDrawable roundedBitmapDrawableCreate = RoundedBitmapDrawableFactory.create(getResources(), bitmapDecodeResource);
        roundedBitmapDrawableCreate.setAlpha(0);
        this.Z.setImageDrawable(roundedBitmapDrawableCreate);
        this.Z.setBackground(this.f2943e);
        this.V.setImageDrawable(roundedBitmapDrawableCreate);
        this.V.setBackground(this.f2943e);
        this.B.setBackground(this.f2943e);
        this.f2945g.setBackground(this.f2943e);
        this.B.setClipToOutline(true);
        this.f2945g.setClipToOutline(true);
        this.B.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        this.f2945g.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        this.I.setColorFilter(ba.j(getActivity()), PorterDuff.Mode.SRC_IN);
        float fCode2 = ba.Code() * ba.V();
        int iZ = ba.Z();
        int iRound = Math.round(iZ / 2.0f);
        int iRound2 = (int) Math.round(((double) faceTecSessionActivity.L) * 0.45d);
        if (this.f2942d != null) {
            float height = r0.getHeight() / this.f2942d.getWidth();
            if (n.S() >= height) {
                iRound2 = Math.round((Math.round(Math.round(faceTecSessionActivity.S) - (r6 * 3.0f)) / 2.0f) * height);
            }
        }
        ((ViewGroup.MarginLayoutParams) ((LinearLayout.LayoutParams) this.L.getLayoutParams())).bottomMargin = Math.round(ce.V(5) * fCode2);
        int iRound3 = Math.round(ce.V(5) * fCode2);
        ((ViewGroup.MarginLayoutParams) ((LinearLayout.LayoutParams) this.f2940b.getLayoutParams())).topMargin = iRound3;
        ((ViewGroup.MarginLayoutParams) ((LinearLayout.LayoutParams) this.f2941c.getLayoutParams())).topMargin = iRound3;
        ((ViewGroup.MarginLayoutParams) ((LinearLayout.LayoutParams) this.f2946h.getLayoutParams())).topMargin = Math.round(ce.V(5) * fCode2);
        this.f2950l.getLayoutParams().height = iRound2;
        this.f2947i.getLayoutParams().height = iRound2;
        ((LinearLayout.LayoutParams) this.S.getLayoutParams()).setMarginEnd(iRound);
        ((LinearLayout.LayoutParams) this.Code.getLayoutParams()).setMarginStart(iRound);
        view.setPadding(iZ, iZ, iZ, 0);
    }
}
