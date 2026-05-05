package com.facetec.sdk;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends Fragment implements View.OnTouchListener {
    protected ScrollView B;
    private TextView C;
    protected LinearLayout Code;
    private boolean D = false;
    private View F;
    JSONObject I;
    private View L;
    private View S;
    protected EditText V;
    protected bf Z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099 A[Catch: JSONException -> 0x01e0, TRY_ENTER, TryCatch #2 {JSONException -> 0x01e0, blocks: (B:4:0x0009, B:7:0x0020, B:62:0x0185, B:63:0x01b4, B:64:0x01d8, B:66:0x01dc, B:8:0x0027, B:10:0x002d, B:12:0x0035, B:14:0x003b, B:16:0x0048, B:19:0x0055, B:22:0x005d, B:25:0x008a, B:27:0x008e, B:30:0x0099, B:31:0x00b1, B:33:0x00b7, B:35:0x00d0, B:37:0x00d6, B:39:0x00e3, B:42:0x00f0, B:44:0x00f6, B:46:0x00fc, B:48:0x0105, B:52:0x016f, B:54:0x0173, B:41:0x00e9, B:55:0x0177, B:18:0x004e), top: B:79:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1 A[Catch: JSONException -> 0x01e0, TryCatch #2 {JSONException -> 0x01e0, blocks: (B:4:0x0009, B:7:0x0020, B:62:0x0185, B:63:0x01b4, B:64:0x01d8, B:66:0x01dc, B:8:0x0027, B:10:0x002d, B:12:0x0035, B:14:0x003b, B:16:0x0048, B:19:0x0055, B:22:0x005d, B:25:0x008a, B:27:0x008e, B:30:0x0099, B:31:0x00b1, B:33:0x00b7, B:35:0x00d0, B:37:0x00d6, B:39:0x00e3, B:42:0x00f0, B:44:0x00f6, B:46:0x00fc, B:48:0x0105, B:52:0x016f, B:54:0x0173, B:41:0x00e9, B:55:0x0177, B:18:0x004e), top: B:79:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ee A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String Code(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.w.Code(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    private static String Code(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private void I(String str) {
        if (this.D) {
            return;
        }
        bu.I(str);
    }

    static w V(JSONObject jSONObject) {
        w wVar = new w();
        Bundle bundle = new Bundle();
        bundle.putString("ocrDataJSONString", jSONObject.toString());
        wVar.setArguments(bundle);
        return wVar;
    }

    public final void Code(View view) throws Throwable {
        Activity activity = getActivity();
        short sXd = (short) (C1607wl.Xd() ^ 16737);
        short sXd2 = (short) (C1607wl.Xd() ^ 23871);
        int[] iArr = new int["GMPVVBQJZOWM".length()];
        QB qb = new QB("GMPVVBQJZOWM");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        short sXd3 = (short) (FB.Xd() ^ 20928);
        short sXd4 = (short) (FB.Xd() ^ 24508);
        int[] iArr2 = new int["S\b\u00132<=M(j\u0002\u0012%';R\u0019?\u0017#:@Zc".length()];
        QB qb2 = new QB("S\b\u00132<=M(j\u0002\u0012%';R\u0019?\u0017#:@Zc");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd4) ^ sXd3));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr2, 0, i3));
        Class<?>[] clsArr = {Class.forName(ZO.xd("U\u0012Z\u0016Vf\u0007e\u00116*6p\u0015\u001e|", (short) (C1499aX.Xd() ^ (-14393)), (short) (C1499aX.Xd() ^ (-308))))};
        Object[] objArr = {str};
        short sXd5 = (short) (Od.Xd() ^ (-5595));
        short sXd6 = (short) (Od.Xd() ^ (-23066));
        int[] iArr3 = new int["\nB\u000b-b ^\"d\u0002hvoJzj".length()];
        QB qb3 = new QB("\nB\u000b-b ^\"d\u0002hvoJzj");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + (i4 * sXd6))) + xuXd3.CK(iKK3));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr3, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            ((InputMethodManager) method.invoke(activity, objArr)).hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.facetec_ocr_confirmation_fragment, viewGroup, false);
        this.S = viewInflate;
        return viewInflate;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) throws Throwable {
        EditText editText;
        if (motionEvent.getAction() == 0 && (editText = this.V) != null && editText.isFocused()) {
            Rect rect = new Rect();
            this.V.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.V.clearFocus();
                Code(view);
            }
        }
        return false;
    }

    @Override // android.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        Activity activity = getActivity();
        try {
            if (getArguments() != null && (string = getArguments().getString("ocrDataJSONString")) != null) {
                this.I = new JSONObject(string);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        this.F = view.findViewById(R.id.backgroundView);
        this.Z = (bf) view.findViewById(R.id.confirmButton);
        this.B = (ScrollView) view.findViewById(R.id.mainContentScrollView);
        this.Code = (LinearLayout) view.findViewById(R.id.scrollableContentLayout);
        this.C = (TextView) view.findViewById(R.id.mainHeaderTextView);
        this.L = view.findViewById(R.id.mainHeaderDividerLineView);
        float fCode = ba.Code();
        float fV = ba.V();
        float f2 = fCode * fV;
        int iZ = ba.Z();
        int iRound = Math.round(ba.f2972l * f2);
        Typeface typeface = FaceTecSDK.V.V.mainHeaderFont;
        int iCode = ba.Code(activity, ba.ak());
        int iRound2 = Math.round(ce.V(ba.b()));
        int iMax = Math.max(iRound2 == 0 ? 0 : 1, Math.round(iRound2 * fV));
        int iCode2 = ba.Code(activity, ba.aj());
        bb.B(this.C, R.string.FaceTec_idscan_ocr_confirmation_main_header);
        this.C.setTextColor(iCode);
        this.C.setTypeface(typeface);
        this.C.setTextSize(iRound);
        ((LinearLayout.LayoutParams) this.C.getLayoutParams()).setMargins(0, 0, 0, iZ);
        this.L.getLayoutParams().height = iMax;
        ((LinearLayout.LayoutParams) this.L.getLayoutParams()).setMargins(iZ, 0, iZ, 0);
        this.L.setBackgroundColor(iCode2);
        int iRound3 = Math.round(ce.V(ba.Z) * f2);
        ((RelativeLayout.LayoutParams) this.Z.getLayoutParams()).setMargins(iZ, 0, iZ, iZ);
        this.Z.getLayoutParams().height = iRound3;
        bb.B(this.Z, R.string.FaceTec_action_confirm);
        this.Z.setEnabled(true);
        this.Z.setupButtonForOCRConfirmation();
        this.Z.setOnClickListenerRunnable(new av(this) { // from class: com.facetec.sdk.w.2
            @Override // com.facetec.sdk.av
            final void B() {
                w.this.Z.setEnabled(false, true);
                final w wVar = w.this;
                final av avVar = new av(w.this) { // from class: com.facetec.sdk.w.2.5
                    @Override // com.facetec.sdk.av
                    public final void B() throws Exception {
                        o oVar = (o) w.this.getActivity();
                        if (oVar != null) {
                            oVar.B(w.this.I);
                        }
                    }
                };
                wVar.getActivity().runOnUiThread(new av(wVar) { // from class: com.facetec.sdk.w.4
                    @Override // com.facetec.sdk.av
                    final void B() {
                        w.this.Z.animate().alpha(0.0f).setDuration(500L).setListener(null).start();
                        w.this.B.animate().alpha(0.0f).setDuration(500L).setListener(null).withEndAction(new av(w.this) { // from class: com.facetec.sdk.w.4.2
                            @Override // com.facetec.sdk.av
                            final void B() {
                                if (avVar != null) {
                                    avVar.B();
                                }
                            }
                        }).start();
                    }
                });
            }
        });
        ((RelativeLayout.LayoutParams) this.B.getLayoutParams()).setMargins(0, iZ, 0, (iZ << 1) + iRound3);
        ba.Code(this.F);
        this.F.getBackground().setAlpha(ba.aB());
        Drawable drawable = ContextCompat.getDrawable(activity, R.drawable.facetec_scrollbar_vertical_track);
        Drawable drawable2 = ContextCompat.getDrawable(activity, R.drawable.facetec_scrollbar_vertical_thumb);
        int iCode3 = ba.Code(iCode, 128);
        int iRound4 = Math.round(ce.V(10) * f2);
        int iRound5 = Math.round(ce.V(5) * f2);
        GradientDrawable gradientDrawable = (GradientDrawable) drawable;
        gradientDrawable.setColor(0);
        GradientDrawable gradientDrawable2 = (GradientDrawable) drawable2;
        gradientDrawable2.setColor(iCode3);
        float f3 = iRound5;
        gradientDrawable.setCornerRadius(f3);
        gradientDrawable2.setCornerRadius(f3);
        this.Code.setScrollBarSize(iRound4);
        if (Build.VERSION.SDK_INT >= 29) {
            this.Code.setVerticalScrollbarTrackDrawable(drawable);
            this.Code.setVerticalScrollbarThumbDrawable(drawable2);
        }
        this.Code.setOnTouchListener(this);
        final JSONObject jSONObject = this.I;
        final Activity activity2 = getActivity();
        getActivity().runOnUiThread(new av(this) { // from class: com.facetec.sdk.w.3
            @Override // com.facetec.sdk.av
            public final void B() {
                JSONArray jSONArrayOptJSONArray;
                float fCode2 = ba.Code();
                float fV2 = ba.V();
                float f4 = fCode2 * fV2;
                int iZ2 = ba.Z();
                int iRound6 = Math.round(ce.V(ba.L) * f4);
                int iRound7 = Math.round(ce.V(110) * f4);
                int iRound8 = Math.round(ba.f2971k * f4);
                int iRound9 = Math.round(ba.f2974n * f4);
                Typeface typeface2 = FaceTecSDK.V.V.sectionHeaderFont;
                int iCode4 = ba.Code(activity2, ba.ai());
                Typeface typeface3 = FaceTecSDK.V.V.fieldLabelFont;
                int iCode5 = ba.Code(activity2, ba.al());
                FaceTecCustomization faceTecCustomization = FaceTecSDK.V;
                ba.Code(activity2, ba.ah());
                Typeface typeface4 = FaceTecSDK.V.V.inputFieldFont;
                int iCode6 = ba.Code(activity2, ba.am());
                FaceTecCustomization faceTecCustomization2 = FaceTecSDK.V;
                Context context = activity2;
                int iCode7 = ba.Code(context, ba.V(context));
                int iRound10 = Math.round(ce.V(ba.c()));
                int iMax2 = Math.max(iRound10 == 0 ? 0 : 1, Math.round(iRound10 * fV2));
                int iRound11 = Math.round(ce.V(ba.q()));
                int iMax3 = Math.max(iRound11 == 0 ? 0 : 1, Math.round(iRound11 * fV2));
                int iCode8 = ba.Code(activity2, ba.aq());
                int iCode9 = ba.Code(activity2, ba.an());
                LayerDrawable layerDrawable = (LayerDrawable) ContextCompat.getDrawable(activity2, R.drawable.facetec_ocr_input_background);
                if (layerDrawable != null) {
                    GradientDrawable gradientDrawable3 = (GradientDrawable) layerDrawable.findDrawableByLayerId(R.id.gradientDrawable);
                    gradientDrawable3.setStroke(iMax2, iCode8);
                    gradientDrawable3.setCornerRadius(iMax3);
                    gradientDrawable3.setColor(iCode9);
                    if (FaceTecSDK.V.V.showInputFieldBottomBorderOnly) {
                        int i2 = -iMax2;
                        layerDrawable.setLayerInset(0, i2, i2, i2, 0);
                        gradientDrawable3.setCornerRadius(0.0f);
                    }
                }
                ArrayList arrayList = new ArrayList();
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("groups");
                    if (jSONArrayOptJSONArray2 == null) {
                        return;
                    }
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i3);
                        if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("fields")) != null) {
                            if (jSONArrayOptJSONArray.length() > 0) {
                                String strOptString = jSONObjectOptJSONObject.optString("groupKey");
                                String strCode = w.this.Code(strOptString, null, "groupFriendlyName", jSONObjectOptJSONObject.optString("groupFriendlyName"));
                                TextView textView = new TextView(activity2);
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                                layoutParams.setMargins(iZ2, iZ2, iZ2, Math.round(iZ2 / 2.0f));
                                layoutParams.gravity = 17;
                                textView.setLayoutParams(layoutParams);
                                textView.setTextSize(iRound8);
                                textView.setText(strCode);
                                textView.setTextColor(iCode4);
                                textView.setTypeface(typeface2);
                                w.this.Code.addView(textView);
                                int i4 = 0;
                                for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i5);
                                    String strOptString2 = jSONObject2.optString("fieldKey");
                                    String strCode2 = w.this.Code(strOptString, strOptString2, "fieldFriendlyName", jSONObject2.optString("fieldFriendlyName"));
                                    String strCode3 = w.this.Code(strOptString, strOptString2, "uiFieldDescriptionText", jSONObject2.optString("uiFieldDescriptionText"));
                                    String upperCase = jSONObject2.optString("scannedValue").toUpperCase(w.this.getResources().getConfiguration().locale);
                                    if (jSONObject2.optBoolean("uiEditable")) {
                                        LinearLayout linearLayout = new LinearLayout(activity2);
                                        linearLayout.setOrientation(0);
                                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                                        layoutParams2.setMargins(iZ2, iZ2 / 4, iZ2, iZ2 / 4);
                                        linearLayout.setLayoutParams(layoutParams2);
                                        TextView textView2 = new TextView(activity2);
                                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iRound7, -2);
                                        layoutParams3.setMargins(0, 0, 0, 0);
                                        layoutParams3.setMarginEnd(iZ2 / 2);
                                        textView2.setLayoutParams(layoutParams3);
                                        float f5 = iRound9;
                                        textView2.setTextSize(f5);
                                        textView2.setText(strCode2);
                                        textView2.setTextColor(iCode5);
                                        textView2.setTypeface(typeface3);
                                        textView2.setMaxLines(1);
                                        textView2.setSingleLine(true);
                                        textView2.setEllipsize(TextUtils.TruncateAt.END);
                                        textView2.setTextDirection(5);
                                        arrayList.add(textView2);
                                        linearLayout.addView(textView2);
                                        final EditText editText = new EditText(activity2);
                                        int i6 = iZ2 / 4;
                                        int i7 = i6 << 1;
                                        editText.setPadding(i6, i7, i6, i7);
                                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, iRound6);
                                        layoutParams4.setMargins(0, 0, 0, 0);
                                        editText.setLayoutParams(layoutParams4);
                                        editText.setTextColor(iCode6);
                                        editText.setTextSize(f5);
                                        editText.setHintTextColor(iCode7);
                                        editText.setText(upperCase);
                                        editText.setHint(strCode3);
                                        editText.setTypeface(typeface4);
                                        editText.setBackground(layerDrawable);
                                        editText.setTextDirection(5);
                                        InputFilter[] filters = editText.getFilters();
                                        final boolean z2 = true;
                                        InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
                                        System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
                                        inputFilterArr[filters.length] = new InputFilter.AllCaps();
                                        editText.setFilters(inputFilterArr);
                                        editText.setInputType(4096);
                                        editText.setImeOptions(6);
                                        final w wVar = w.this;
                                        final Typeface typeface5 = FaceTecSDK.V.V.inputFieldFont;
                                        final Typeface typeface6 = FaceTecSDK.V.V.inputFieldPlaceholderFont;
                                        if (typeface5 == typeface6) {
                                            z2 = false;
                                        }
                                        final int i8 = i3;
                                        final int i9 = i5;
                                        editText.addTextChangedListener(new TextWatcher() { // from class: com.facetec.sdk.w.1
                                            @Override // android.text.TextWatcher
                                            public final void afterTextChanged(Editable editable) {
                                            }

                                            @Override // android.text.TextWatcher
                                            public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                                            }

                                            @Override // android.text.TextWatcher
                                            public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                                                if (z2) {
                                                    if (charSequence.length() == 0) {
                                                        editText.setTypeface(typeface6);
                                                    } else {
                                                        Typeface typeface7 = editText.getTypeface();
                                                        Typeface typeface8 = typeface5;
                                                        if (typeface7 != typeface8) {
                                                            editText.setTypeface(typeface8);
                                                        }
                                                    }
                                                }
                                                try {
                                                    w.this.I.optJSONArray("groups").optJSONObject(i8).optJSONArray("fields").optJSONObject(i9).putOpt("userUpdatedValue", charSequence.toString());
                                                } catch (JSONException e3) {
                                                    e3.printStackTrace();
                                                }
                                            }
                                        });
                                        final w wVar2 = w.this;
                                        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.facetec.sdk.w.6
                                            @Override // android.view.View.OnFocusChangeListener
                                            public final void onFocusChange(View view2, boolean z3) {
                                                EditText editText2 = editText;
                                                if (editText2 == null) {
                                                    return;
                                                }
                                                if (z3) {
                                                    w.this.V = editText2;
                                                    editText.setCursorVisible(true);
                                                } else {
                                                    w.this.V = null;
                                                    editText.setCursorVisible(false);
                                                }
                                            }
                                        });
                                        final w wVar3 = w.this;
                                        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.facetec.sdk.w.7
                                            @Override // android.widget.TextView.OnEditorActionListener
                                            public final boolean onEditorAction(TextView textView3, int i10, KeyEvent keyEvent) throws Throwable {
                                                EditText editText2 = editText;
                                                if (editText2 == null) {
                                                    return false;
                                                }
                                                editText2.setCursorVisible(false);
                                                if (keyEvent != null && keyEvent.getKeyCode() == 66) {
                                                    w.this.Code(textView3);
                                                }
                                                return false;
                                            }
                                        });
                                        linearLayout.addView(editText);
                                        w.this.Code.addView(linearLayout);
                                        i4++;
                                    }
                                }
                                if (i4 == 0) {
                                    w.this.Code.removeView(textView);
                                }
                            }
                        }
                        return;
                    }
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
                int iRound12 = Math.round(ce.Code(iRound9));
                int iRound13 = Math.round(ce.V(120) * f4);
                int iMax4 = 0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    iMax4 = Math.max(iMax4, ce.V(((TextView) arrayList.get(i10)).getText().toString(), iRound12, FaceTecSDK.V.V.fieldLabelFont).V());
                }
                int iMin = Math.min(iRound13, iMax4);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((TextView) arrayList.get(i11)).getLayoutParams().width = iMin;
                }
            }
        });
        getActivity().runOnUiThread(new av(this) { // from class: com.facetec.sdk.w.5
            @Override // com.facetec.sdk.av
            final void B() {
                w.this.Z.animate().alpha(1.0f).setDuration(500L).setStartDelay(1000L).setListener(null).start();
                w.this.B.animate().alpha(1.0f).setDuration(500L).setStartDelay(1000L).setListener(null).start();
            }
        });
    }
}
