package o.ec;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.TextViewCompat;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import fr.antelop.sdk.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import o.a.f;
import o.a.l;
import o.ea.k;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c extends LinearLayout {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$h = null;
    private static final int $$i = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    static final char[] NUM_ARRAY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f23651a = false;
    static final String[] alphaArray;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f23652b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int[] f23653c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f23654d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f23655e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f23656f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f23657g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f23658i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23659j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f23660k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f23661l = 0;
    private View backButtonView;
    private C0349c[] buttonArray;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f23662c1;
    private int c2;
    private int c3;
    private final ArrayList<Integer> columns;
    private d defaultKeypadCallback;
    private View extraButtonView;
    private ConstraintLayout grid;
    private k obscuredWindowOnTouchListener;
    private int r1;
    private int r2;
    private int r3;
    private int r4;
    private int r5;
    private final ArrayList<Integer> rows;
    private int[] scramble;
    b theming;

    public static class b {
        public final int alphaStyle;
        public final int backgroundStyle;
        final String deleteButtonAccessibilityHint;
        final String deleteButtonAccessibilityLabel;
        final int deleteButtonDrawable;
        public final int digitsStyle;
        public final boolean displayAlpha;
        final String extraButtonAccessibilityHint;
        final String extraButtonAccessibilityLabel;
        final int extraButtonDrawable;

        public b(int i2, int i3, int i4, boolean z2, int i5, int i6, String str, String str2, String str3, String str4) {
            this.digitsStyle = i2;
            this.alphaStyle = i3;
            this.backgroundStyle = i4;
            this.displayAlpha = z2;
            this.deleteButtonDrawable = i5;
            this.extraButtonDrawable = i6;
            this.extraButtonAccessibilityLabel = str;
            this.extraButtonAccessibilityHint = str2;
            this.deleteButtonAccessibilityLabel = str3;
            this.deleteButtonAccessibilityHint = str4;
        }
    }

    /* JADX INFO: renamed from: o.ec.c$c, reason: collision with other inner class name */
    public static final class C0349c extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f23673a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f23674d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextView f23675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f23676c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final TextView f23677e;

        public C0349c(Context context, int i2, b bVar) {
            super(context);
            this.f23676c = i2;
            View.inflate(new ContextThemeWrapper(context, bVar.backgroundStyle), R.layout.antelop_keypadview_digitbutton, this);
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.container);
            float f2 = getResources().getConfiguration().fontScale;
            TextView textView = new TextView(context, null);
            this.f23677e = textView;
            TextViewCompat.setTextAppearance(textView, bVar.digitsStyle);
            textView.setId(generateViewId());
            int id = textView.getId();
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.startToStart = 0;
            layoutParams.endToEnd = 0;
            layoutParams.topToTop = 0;
            layoutParams.bottomToBottom = 0;
            textView.setLayoutParams(layoutParams);
            textView.setText(c.NUM_ARRAY, i2, 1);
            constraintLayout.addView(textView);
            if (!bVar.displayAlpha) {
                this.f23675b = null;
                return;
            }
            TextView textView2 = new TextView(context, null);
            this.f23675b = textView2;
            textView2.setId(generateViewId());
            TextViewCompat.setTextAppearance(textView2, bVar.alphaStyle);
            ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams2.startToStart = 0;
            layoutParams2.endToEnd = 0;
            layoutParams2.bottomToBottom = 0;
            layoutParams2.topToBottom = id;
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(constraintLayout);
            constraintSet.connect(id, 4, textView2.getId(), 3, 0);
            constraintSet.applyTo(constraintLayout);
            textView2.setTextSize(0, Math.min(textView2.getTextSize(), textView2.getTextSize() * (1.2f / f2)));
            textView2.setLayoutParams(layoutParams2);
            textView2.setText(c.alphaArray[i2]);
            constraintLayout.addView(textView2);
        }

        public final int c() {
            int i2 = 2 % 2;
            int i3 = f23674d;
            int i4 = (((i3 + 27) - (27 & i3)) << 1) - (i3 ^ 27);
            f23673a = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = this.f23676c;
            int i6 = (i3 & 3) + (i3 | 3);
            f23673a = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final void setIndex(int i2) {
            int i3 = 2 % 2;
            int i4 = f23674d;
            int i5 = (i4 & 37) + (i4 | 37);
            f23673a = i5 % 128;
            int i6 = i5 % 2;
            this.f23676c = i2;
            this.f23677e.setText(c.NUM_ARRAY, i2, 1);
            TextView textView = this.f23675b;
            if (textView != null) {
                int i7 = f23674d;
                int i8 = (i7 ^ 97) + (((-1) - (((-1) - i7) | ((-1) - 97))) << 1);
                f23673a = i8 % 128;
                if (i8 % 2 == 0) {
                    textView.setText(c.alphaArray[i2]);
                    int i9 = 91 / 0;
                } else {
                    textView.setText(c.alphaArray[i2]);
                }
                int i10 = f23673a + 37;
                f23674d = i10 % 128;
                int i11 = i10 % 2;
            }
            int i12 = f23673a;
            int i13 = (i12 ^ 123) + (((i12 + 123) - (i12 | 123)) << 1);
            f23674d = i13 % 128;
            int i14 = i13 % 2;
        }
    }

    public interface d {
        void b();

        void b(char c2);

        void e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(byte r7, byte r8, int r9) {
        /*
            int r6 = r9 * 2
            int r1 = r6 + 1
            int r5 = r7 + 4
            byte[] r4 = o.ec.c.$$h
            int r0 = r8 * 2
            int r0 = 121 - r0
            byte[] r3 = new byte[r1]
            r1 = -1
            if (r4 != 0) goto L26
            r2 = r5
        L12:
            int r5 = r5 + r0
        L13:
            int r1 = r1 + 1
            byte r0 = (byte) r5
            int r2 = r2 + 1
            r3[r1] = r0
            if (r1 != r6) goto L23
            java.lang.String r1 = new java.lang.String
            r0 = 0
            r1.<init>(r3, r0)
            return r1
        L23:
            r0 = r4[r2]
            goto L12
        L26:
            r2 = r5
            r5 = r0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ec.c.$$j(byte, byte, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        f23661l = -342254611;
        f23660k = 529789514;
        init$0();
        f23657g = 0;
        f23658i = 1;
        f23656f = 0;
        f23659j = 1;
        e();
        Object[] objArr = new Object[1];
        o(new int[]{-595093644, 1017287925}, 2 - ImageFormat.getBitsPerPixel(0), objArr);
        Object[] objArr2 = new Object[1];
        p(175 - AndroidCharacter.getMirror('0'), null, null, " \u009f\u009e", objArr2);
        Object[] objArr3 = new Object[1];
        o(new int[]{1745208930, 599427989}, 3 - TextUtils.indexOf("", "", 0, 0), objArr3);
        Object[] objArr4 = new Object[1];
        p(TextUtils.lastIndexOf("", '0', 0, 0) + 128, null, null, "£¢¡", objArr4);
        Object[] objArr5 = new Object[1];
        o(new int[]{-823322694, 1995739280}, View.MeasureSpec.getMode(0) + 3, objArr5);
        Object[] objArr6 = new Object[1];
        p((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, null, null, "\u0097\u0087¥¤", objArr6);
        Object[] objArr7 = new Object[1];
        p(127 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), null, null, "¦\u009b\u0093", objArr7);
        Object[] objArr8 = new Object[1];
        p(127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), null, null, "ª©¨§", objArr8);
        alphaArray = new String[]{"", "", ((String) objArr[0]).intern(), ((String) objArr2[0]).intern(), ((String) objArr3[0]).intern(), ((String) objArr4[0]).intern(), ((String) objArr5[0]).intern(), ((String) objArr6[0]).intern(), ((String) objArr7[0]).intern(), ((String) objArr8[0]).intern()};
        NUM_ARRAY = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int i2 = f23658i + 77;
        f23657g = i2 % 128;
        int i3 = i2 % 2;
    }

    public c(Context context) {
        super(context);
        this.scramble = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        this.columns = new ArrayList<>();
        this.rows = new ArrayList<>();
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.scramble = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        this.columns = new ArrayList<>();
        this.rows = new ArrayList<>();
    }

    public c(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.scramble = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        this.columns = new ArrayList<>();
        this.rows = new ArrayList<>();
    }

    static void e() {
        f23653c = new int[]{561211912, 1419238844, -877978141, 790296012, -2115044804, -1085489090, 774211300, 758851801, -415042309, 105108196, -133646227, 673199136, -1721302780, 52859794, -820801056, 1292439493, 1265822551, 1983810592};
        f23654d = new char[]{2146, 2157, 2150, 2153, 2132, 2149, 2167, 2133, 2158, 2154, 2155, 2135, 2152, 2475, 2438, 2148, 2131, 2142, 2165, 2145, 2159, 2144, 2164, 2147, 2156, 2436, 2162, 2469, 2454, 2437, 2434, 2435, 2447, 2444, 2445, 2441, 2166, 2163, 2160, 2161, 2174, 2175};
        f23655e = 2040400345;
        f23652b = true;
        f23651a = true;
    }

    private View generateButtonView(int i2, int i3) {
        int i4 = 2 % 2;
        if (i2 == 0) {
            int i5 = f23656f + 13;
            f23659j = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            throw null;
        }
        View viewInflate = View.inflate(new ContextThemeWrapper(getContext(), this.theming.backgroundStyle), R.layout.antelop_keypadview_imagebutton, null);
        if (!(viewInflate instanceof ImageView)) {
            int i6 = f23659j + 39;
            f23656f = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 41 / 0;
            }
            return null;
        }
        int i8 = f23656f + 7;
        f23659j = i8 % 128;
        if (i8 % 2 != 0) {
            ImageView imageView = (ImageView) viewInflate;
            imageView.setImageResource(i2);
            imageView.setColorFilter(i3);
            return viewInflate;
        }
        ImageView imageView2 = (ImageView) viewInflate;
        imageView2.setImageResource(i2);
        imageView2.setColorFilter(i3);
        int i9 = 57 / 0;
        return viewInflate;
    }

    private void generateView() {
        int i2 = 2 % 2;
        int i3 = f23659j + 117;
        f23656f = i3 % 128;
        int i4 = i3 % 2;
        if (this.grid != null) {
            return;
        }
        this.buttonArray = new C0349c[10];
        for (int i5 = 0; i5 < 10; i5++) {
            this.buttonArray[i5] = new C0349c(getContext(), this.scramble[i5], this.theming);
            this.buttonArray[i5].setId(generateViewId());
            this.buttonArray[i5].setOnClickListener(new View.OnClickListener() { // from class: o.ec.c$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.m10630instrumented$0$generateView$V(this.f$0, view);
                }
            });
            k kVar = this.obscuredWindowOnTouchListener;
            if (kVar != null) {
                int i6 = f23656f + 19;
                f23659j = i6 % 128;
                int i7 = i6 % 2;
                this.buttonArray[i5].setOnTouchListener(kVar);
                int i8 = f23659j + 5;
                f23656f = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        setOrientation(1);
        customizeView();
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        this.grid = constraintLayout;
        constraintLayout.setId(generateViewId());
        setGuidelines();
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = 0;
            while (i11 < 3) {
                int i12 = i11 + 1;
                int i13 = (i10 * 3) + i12;
                this.grid.addView(this.buttonArray[i13]);
                setPos(this.buttonArray[i13].getId(), this.columns.get(i11).intValue(), this.rows.get(i10).intValue(), this.rows.get(i10 + 1).intValue());
                i11 = i12;
            }
        }
        this.grid.addView(this.buttonArray[0]);
        setPos(this.buttonArray[0].getId(), this.c2, this.r4, this.r5);
        int defaultColor = this.buttonArray[0].f23677e.getTextColors().getDefaultColor();
        View viewGenerateButtonView = generateButtonView(this.theming.deleteButtonDrawable, defaultColor);
        this.backButtonView = viewGenerateButtonView;
        if (viewGenerateButtonView != null) {
            viewGenerateButtonView.setId(generateViewId());
            this.backButtonView.setOnClickListener(new View.OnClickListener() { // from class: o.ec.c$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.m10631instrumented$1$generateView$V(this.f$0, view);
                }
            });
            this.grid.addView(this.backButtonView);
            setPos(this.backButtonView.getId(), this.c3, this.r4, this.r5);
            this.backButtonView.setContentDescription(this.theming.deleteButtonAccessibilityLabel);
            this.backButtonView.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: o.ec.c.4

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f23670a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f23671b = 1;

                @Override // android.view.View.AccessibilityDelegate
                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    int i14 = 2 % 2;
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, c.this.theming.deleteButtonAccessibilityHint));
                    int i15 = f23670a;
                    int i16 = (i15 ^ 17) + (((i15 + 17) - (i15 | 17)) << 1);
                    f23671b = i16 % 128;
                    if (i16 % 2 == 0) {
                        int i17 = 56 / 0;
                    }
                }
            });
        }
        View viewGenerateButtonView2 = generateButtonView(this.theming.extraButtonDrawable, defaultColor);
        this.extraButtonView = viewGenerateButtonView2;
        if (viewGenerateButtonView2 != null) {
            viewGenerateButtonView2.setId(generateViewId());
            this.extraButtonView.setOnClickListener(new View.OnClickListener() { // from class: o.ec.c$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.m10632instrumented$2$generateView$V(this.f$0, view);
                }
            });
            this.extraButtonView.setContentDescription(this.theming.extraButtonAccessibilityLabel);
            this.extraButtonView.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: o.ec.c.1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f23663b = 0;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f23664d = 1;

                @Override // android.view.View.AccessibilityDelegate
                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    int i14 = 2 % 2;
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, c.this.theming.extraButtonAccessibilityHint));
                    int i15 = f23664d + 123;
                    f23663b = i15 % 128;
                    int i16 = i15 % 2;
                }
            });
            this.grid.addView(this.extraButtonView);
            setPos(this.extraButtonView.getId(), this.f23662c1, this.r4, this.r5);
        }
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        this.grid.setBackgroundColor(0);
        addView(this.grid, layoutParams);
        int i14 = f23659j + 71;
        f23656f = i14 % 128;
        if (i14 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static int[] getNewScrambledVector() {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList(10);
        int i3 = f23656f + 37;
        f23659j = i3 % 128;
        int i4 = i3 % 2;
        int i5 = 0;
        while (i5 < 10) {
            int i6 = f23659j + 103;
            f23656f = i6 % 128;
            if (i6 % 2 != 0) {
                arrayList.add(Integer.valueOf(i5));
                i5 += 127;
            } else {
                arrayList.add(Integer.valueOf(i5));
                i5++;
            }
        }
        Collections.shuffle(arrayList);
        int[] iArr = new int[10];
        for (int i7 = 0; i7 < 10; i7++) {
            iArr[i7] = ((Integer) arrayList.get(i7)).intValue();
        }
        return iArr;
    }

    static void init$0() {
        $$a = new byte[]{97, 52, 124, MessagePack.Code.EXT16};
        $$b = 20;
    }

    static void init$1() {
        $$d = new byte[]{97, 98, -19, -80, 60, MessagePack.Code.BIN16, -11, 55, MessagePack.Code.EXT16, 56, -21};
        $$e = 32;
    }

    static void init$2() {
        $$h = new byte[]{7, 42, -92, 85};
        $$i = 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$generateView$--V, reason: not valid java name */
    public static /* synthetic */ void m10630instrumented$0$generateView$V(c cVar, View view) {
        Callback.onClick_enter(view);
        try {
            cVar.lambda$generateView$0(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$generateView$--V, reason: not valid java name */
    public static /* synthetic */ void m10631instrumented$1$generateView$V(c cVar, View view) {
        Callback.onClick_enter(view);
        try {
            cVar.lambda$generateView$1(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$2$generateView$--V, reason: not valid java name */
    public static /* synthetic */ void m10632instrumented$2$generateView$V(c cVar, View view) {
        Callback.onClick_enter(view);
        try {
            cVar.lambda$generateView$2(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    private /* synthetic */ void lambda$generateView$0(View view) {
        int i2 = 2 % 2;
        int i3 = f23659j + 99;
        f23656f = i3 % 128;
        if (i3 % 2 == 0) {
            this.defaultKeypadCallback.b(NUM_ARRAY[((C0349c) view).c()]);
        } else {
            this.defaultKeypadCallback.b(NUM_ARRAY[((C0349c) view).c()]);
            throw null;
        }
    }

    private /* synthetic */ void lambda$generateView$1(View view) {
        int i2 = 2 % 2;
        int i3 = f23659j + 1;
        f23656f = i3 % 128;
        int i4 = i3 % 2;
        this.defaultKeypadCallback.e();
        if (i4 != 0) {
            int i5 = 67 / 0;
        }
    }

    private /* synthetic */ void lambda$generateView$2(View view) {
        int i2 = 2 % 2;
        d dVar = this.defaultKeypadCallback;
        if (dVar != null) {
            int i3 = f23656f + 33;
            f23659j = i3 % 128;
            int i4 = i3 % 2;
            dVar.b();
        }
        int i5 = f23659j + 7;
        f23656f = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void n(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r0 = r9 + 4
            int r7 = r7 * 2
            int r1 = r7 + 1
            byte[] r6 = o.ec.c.$$a
            int r5 = r8 + 97
            byte[] r4 = new byte[r1]
            r3 = 0
            if (r6 != 0) goto L27
            r2 = r0
            r1 = r3
        L11:
            int r5 = r5 + r0
            r0 = r2
        L13:
            byte r2 = (byte) r5
            r4[r1] = r2
            if (r1 != r7) goto L20
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            r10[r3] = r0
            return
        L20:
            int r2 = r0 + 1
            int r1 = r1 + 1
            r0 = r6[r2]
            goto L11
        L27:
            r1 = r3
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ec.c.n(short, int, short, java.lang.Object[]):void");
    }

    private static void o(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3 = 2;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f23653c;
        int i5 = 989264422;
        int i6 = -1;
        int i7 = 0;
        if (iArr3 != null) {
            int i8 = $10 + 69;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 71;
                $11 = i10 % 128;
                if (i10 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i9])};
                        Object objA = o.d.d.a(i5);
                        if (objA == null) {
                            byte b2 = (byte) i6;
                            byte b3 = (byte) (b2 + 1);
                            objA = o.d.d.a((ViewConfiguration.getTouchSlop() >> 8) + 675, (char) ((Process.getThreadPriority(0) + 20) >> 6), 12 - Color.alpha(0), -328001469, false, $$j(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr2[i9] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr3[i9])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objA2 = o.d.d.a(676 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) View.resolveSizeAndState(0, 0, 0), Color.green(0) + 12, -328001469, false, $$j(b4, b5, b5), new Class[]{Integer.TYPE});
                    }
                    iArr2[i9] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i9++;
                }
                i3 = 2;
                i5 = 989264422;
                i6 = -1;
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f23653c;
        int i11 = 16;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i12])};
                Object objA3 = o.d.d.a(989264422);
                if (objA3 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objA3 = o.d.d.a(675 - (ViewConfiguration.getTapTimeout() >> i11), (char) View.getDefaultSize(i7, i7), 12 - (ViewConfiguration.getLongPressTimeout() >> 16), -328001469, false, $$j(b6, b7, b7), new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                i12++;
                i11 = 16;
                i7 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i7, iArr4, i7, length2);
        lVar.f19941d = i7;
        while (lVar.f19941d < iArr.length) {
            int i13 = $10 + 57;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                int i17 = $11 + 17;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    lVar.f19942e ^= iArr4[i15];
                    Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA4 = o.d.d.a(2098218801);
                    if (objA4 == null) {
                        byte b8 = (byte) (-1);
                        byte b9 = (byte) (-b8);
                        objA4 = o.d.d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 301, (char) ((Process.myTid() >> 22) + 52697), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11, -1416256172, false, $$j(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i15 += 4;
                } else {
                    lVar.f19942e ^= iArr4[i15];
                    Object[] objArr6 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA5 = o.d.d.a(2098218801);
                    if (objA5 == null) {
                        byte b10 = (byte) (-1);
                        byte b11 = (byte) (-b10);
                        objA5 = o.d.d.a((Process.myPid() >> 22) + 301, (char) (TextUtils.getCapsMode("", 0, 0) + 52697), 11 - (ViewConfiguration.getEdgeSlop() >> 16), -1416256172, false, $$j(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue2;
                    i15++;
                }
            }
            int i18 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i18;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i19 = lVar.f19942e;
            int i20 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr7 = {lVar, lVar};
            Object objA6 = o.d.d.a(986820978);
            if (objA6 == null) {
                byte b12 = (byte) (-1);
                byte b13 = (byte) (b12 + 3);
                objA6 = o.d.d.a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 228, (char) (TextUtils.getOffsetBefore("", 0) + 51004), 9 - (ViewConfiguration.getScrollBarSize() >> 8), -330018025, false, $$j(b12, b13, (byte) (b13 - 2)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private static void p(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i3;
        String str3 = str;
        String str4 = str2;
        int i4 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        f fVar = new f();
        char[] cArr3 = f23654d;
        int i5 = -1;
        float f2 = 0.0f;
        if (cArr3 != null) {
            int i6 = $11 + 93;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = cArr3.length;
                cArr = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) i5;
                        objA = o.d.d.a(ExpandableListView.getPackedPositionType(0L) + 593, (char) (13181 - (TypedValue.complexToFloat(0) > f2 ? 1 : (TypedValue.complexToFloat(0) == f2 ? 0 : -1))), 11 - (ViewConfiguration.getEdgeSlop() >> 16), -1225586509, false, $$j(b2, (byte) (27 & b2), (byte) 0), new Class[]{Integer.TYPE});
                    }
                    cArr[i3] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i3++;
                    i5 = -1;
                    f2 = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr;
        }
        Object[] objArr3 = {Integer.valueOf(f23655e)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 32, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), View.combineMeasuredStates(0, 0) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f23651a) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i7 = $10 + 97;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    cArr4[fVar.f19922a] = (char) (cArr3[bArr[fVar.f19923e % fVar.f19922a] * i2] / iIntValue);
                    Object[] objArr4 = {fVar, fVar};
                    Object objA3 = o.d.d.a(1540807955);
                    if (objA3 == null) {
                        byte b3 = (byte) (-1);
                        objA3 = o.d.d.a(TextUtils.indexOf("", "") + 458, (char) View.resolveSizeAndState(0, 0, 0), 11 - (KeyEvent.getMaxKeyCode() >> 16), -1923924106, false, $$j(b3, (byte) ((b3 + Ascii.CAN) - (24 | b3)), (byte) 0), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } else {
                    cArr4[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                    Object[] objArr5 = {fVar, fVar};
                    Object objA4 = o.d.d.a(1540807955);
                    if (objA4 == null) {
                        byte b4 = (byte) (-1);
                        objA4 = o.d.d.a(457 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11, -1923924106, false, $$j(b4, (byte) (24 & b4), (byte) 0), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!f23652b) {
            fVar.f19923e = iArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i8 = $11 + 27;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr5[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                fVar.f19922a++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = cArr2.length;
        char[] cArr6 = new char[fVar.f19923e];
        fVar.f19922a = 0;
        while (fVar.f19922a < fVar.f19923e) {
            cArr6[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            Object[] objArr6 = {fVar, fVar};
            Object objA5 = o.d.d.a(1540807955);
            if (objA5 == null) {
                byte b5 = (byte) (-1);
                objA5 = o.d.d.a(((Process.getThreadPriority(0) + 20) >> 6) + 458, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10, -1923924106, false, $$j(b5, (byte) (24 & b5), (byte) 0), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
        }
        String str5 = new String(cArr6);
        int i10 = $10 + 69;
        $11 = i10 % 128;
        if (i10 % 2 != 0) {
            objArr[0] = str5;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void q(byte b2, short s2, int i2, Object[] objArr) {
        int i3 = (i2 * 7) + 4;
        byte[] bArr = $$d;
        int i4 = s2 * 7;
        int i5 = 111 - b2;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i5 = (i5 + (-i4)) - 5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i5;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                int i7 = bArr[i3];
                i3++;
                i5 = (i5 + (-i7)) - 5;
            }
        }
    }

    private void scramble(int[] iArr) {
        int i2 = 2 % 2;
        if (iArr == null || iArr.length != 10) {
            iArr = getNewScrambledVector();
            int i3 = f23656f + 49;
            f23659j = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 % 4;
            }
        }
        this.scramble = iArr;
        int i5 = f23656f + 107;
        f23659j = i5 % 128;
        int i6 = i5 % 2;
        for (int i7 = 0; i7 < 10; i7++) {
            this.buttonArray[i7].setIndex(this.scramble[i7]);
        }
    }

    private int setGuideline(float f2, int i2) {
        int i3 = 2 % 2;
        View guideline = new Guideline(getContext());
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.guidePercent = f2;
        layoutParams.orientation = i2;
        guideline.setLayoutParams(layoutParams);
        guideline.setId(generateViewId());
        this.grid.addView(guideline);
        int id = guideline.getId();
        int i4 = f23656f + 89;
        f23659j = i4 % 128;
        if (i4 % 2 != 0) {
            return id;
        }
        throw null;
    }

    private void setGuidelines() {
        int i2 = 2 % 2;
        int i3 = f23659j + 115;
        f23656f = i3 % 128;
        int i4 = i3 % 2;
        this.f23662c1 = setGuideline(0.25f, 1);
        this.c2 = setGuideline(0.5f, 1);
        this.c3 = setGuideline(0.75f, 1);
        this.columns.add(Integer.valueOf(this.f23662c1));
        this.columns.add(Integer.valueOf(this.c2));
        this.columns.add(Integer.valueOf(this.c3));
        this.r1 = setGuideline(0.05f, 0);
        this.r2 = setGuideline(0.275f, 0);
        this.r3 = setGuideline(0.5f, 0);
        this.r4 = setGuideline(0.725f, 0);
        this.r5 = setGuideline(0.95f, 0);
        this.rows.add(Integer.valueOf(this.r1));
        this.rows.add(Integer.valueOf(this.r2));
        this.rows.add(Integer.valueOf(this.r3));
        this.rows.add(Integer.valueOf(this.r4));
        this.rows.add(Integer.valueOf(this.r5));
        int i5 = f23656f + 11;
        f23659j = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private void setPos(int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.grid);
        constraintSet.connect(i2, 6, i3, 6, 0);
        constraintSet.connect(i2, 7, i3, 7, 0);
        constraintSet.connect(i2, 3, i4, 3, 0);
        constraintSet.connect(i2, 4, i5, 4, 0);
        constraintSet.applyTo(this.grid);
        int i7 = f23656f + 29;
        f23659j = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public abstract void customizeView();

    /* JADX WARN: Removed duplicated region for block: B:17:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void enableOverlayProtection(final java.lang.String r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ec.c.enableOverlayProtection(java.lang.String):void");
    }

    C0349c[] getButtonArray() {
        int i2 = 2 % 2;
        int i3 = f23659j + 73;
        int i4 = i3 % 128;
        f23656f = i4;
        int i5 = i3 % 2;
        C0349c[] c0349cArr = this.buttonArray;
        int i6 = i4 + 19;
        f23659j = i6 % 128;
        if (i6 % 2 != 0) {
            return c0349cArr;
        }
        throw null;
    }

    public void initializeView(d dVar, b bVar) {
        int i2 = 2 % 2;
        int i3 = f23656f + 73;
        f23659j = i3 % 128;
        int i4 = i3 % 2;
        this.theming = bVar;
        this.defaultKeypadCallback = dVar;
        generateView();
        int i5 = f23656f + 7;
        f23659j = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public void scramble() {
        int i2 = 2 % 2;
        int i3 = f23659j + 125;
        f23656f = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            scramble(getNewScrambledVector());
            throw null;
        }
        scramble(getNewScrambledVector());
        int i4 = f23659j + 103;
        f23656f = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setExtraButtonVisible(boolean z2) {
        int i2;
        int i3 = 2 % 2;
        int i4 = f23656f + 21;
        int i5 = i4 % 128;
        f23659j = i5;
        int i6 = i4 % 2;
        View view = this.extraButtonView;
        if (view != null) {
            int i7 = i5 + 101;
            int i8 = i7 % 128;
            f23656f = i8;
            int i9 = i7 % 2;
            if (z2) {
                int i10 = i8 + 95;
                f23659j = i10 % 128;
                int i11 = i10 % 2;
                i2 = 0;
            } else {
                i2 = 4;
            }
            view.setVisibility(i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setObscuredWindowOnTouchListener(o.ea.k r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ec.c.setObscuredWindowOnTouchListener(o.ea.k):void");
    }
}
