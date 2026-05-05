package com.facetec.sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.braze.Constants;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.EO;
import yg.OY;
import yg.Wg;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
final class Z implements ZoomEncryptStrings {
    private static Z B = null;
    private static int C = 0;
    private static long F = 0;
    private static char[] L = null;
    private static int S = 1;
    private static byte[] V = null;
    private int Code;
    private boolean I;
    private I Z;

    /* JADX INFO: renamed from: com.facetec.sdk.Z$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] Z;

        static {
            int[] iArr = new int[I.EnumC0156I.values().length];
            Z = iArr;
            try {
                iArr[I.EnumC0156I.ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Z[I.EnumC0156I.APP_SEND_DIAGNOSTICS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Z[I.EnumC0156I.DIAGNOSTICS_SIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Z[I.EnumC0156I.GRACE_PERIOD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Z[I.EnumC0156I.CACHE_KEY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Z[I.EnumC0156I.IS_VERSION_DEPRECATED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Z[I.EnumC0156I.RECENT_FAILURES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Z[I.EnumC0156I.APPLICATION_ID.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Z[I.EnumC0156I.IS_LATEST_VERSION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static class I {
        Integer D;
        Integer F;
        String I;
        String Z;
        Boolean V = Boolean.FALSE;
        Integer B = 10;
        Integer Code = 0;
        Boolean L = Boolean.FALSE;
        private Boolean C = Boolean.TRUE;

        /* JADX INFO: renamed from: com.facetec.sdk.Z$I$I, reason: collision with other inner class name */
        enum EnumC0156I {
            ID("id"),
            APP_SEND_DIAGNOSTICS(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_KEY),
            DIAGNOSTICS_SIZE(com.biocatch.client.android.sdk.core.Constants.DEVICE_SOURCE_META_FIELD),
            GRACE_PERIOD("gp"),
            CACHE_KEY("ck"),
            IS_VERSION_DEPRECATED("vd"),
            RECENT_FAILURES("rf"),
            APPLICATION_ID("ai"),
            IS_LATEST_VERSION("lv");

            final String L;

            EnumC0156I(String str) {
                this.L = str;
            }
        }

        I() {
        }

        static I Code(JSONObject jSONObject) throws JSONException {
            I i2 = new I();
            for (EnumC0156I enumC0156I : EnumC0156I.values()) {
                switch (AnonymousClass2.Z[enumC0156I.ordinal()]) {
                    case 1:
                        i2.I = jSONObject.getString(enumC0156I.L);
                        break;
                    case 2:
                        i2.V = Boolean.valueOf(jSONObject.getBoolean(enumC0156I.L));
                        break;
                    case 3:
                        i2.B = Integer.valueOf(jSONObject.getInt(enumC0156I.L));
                        break;
                    case 4:
                        i2.Code = Integer.valueOf(jSONObject.getInt(enumC0156I.L));
                        break;
                    case 5:
                        i2.Z = jSONObject.getString(enumC0156I.L);
                        break;
                    case 6:
                        i2.L = Boolean.valueOf(jSONObject.getBoolean(enumC0156I.L));
                        break;
                    case 7:
                        i2.F = Integer.valueOf(jSONObject.getInt(enumC0156I.L));
                        break;
                    case 8:
                        i2.D = Integer.valueOf(jSONObject.getInt(enumC0156I.L));
                        break;
                    case 9:
                        i2.C = Boolean.valueOf(jSONObject.getBoolean(enumC0156I.L));
                        break;
                }
            }
            return i2;
        }

        final String Z() {
            JSONObject jSONObject = new JSONObject();
            try {
                for (EnumC0156I enumC0156I : EnumC0156I.values()) {
                    switch (AnonymousClass2.Z[enumC0156I.ordinal()]) {
                        case 1:
                            jSONObject.put(enumC0156I.L, this.I);
                            break;
                        case 2:
                            jSONObject.put(enumC0156I.L, this.V);
                            break;
                        case 3:
                            jSONObject.put(enumC0156I.L, this.B);
                            break;
                        case 4:
                            jSONObject.put(enumC0156I.L, this.Code);
                            break;
                        case 5:
                            jSONObject.put(enumC0156I.L, this.Z);
                            break;
                        case 6:
                            jSONObject.put(enumC0156I.L, this.L);
                            break;
                        case 7:
                            jSONObject.put(enumC0156I.L, this.F);
                            break;
                        case 8:
                            jSONObject.put(enumC0156I.L, this.D);
                            break;
                        case 9:
                            jSONObject.put(enumC0156I.L, this.C);
                            break;
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return jSONObject.toString();
        }
    }

    static abstract class V {
        private V() {
        }

        /* synthetic */ V(byte b2) {
            this();
        }

        abstract void V(Z z2);

        final synchronized void Z(Context context) {
            try {
                Z z2 = new Z(context, (byte) 0);
                V(z2);
                Z.Z(z2, context);
            } catch (Exception e2) {
                L.V(e2);
            }
        }
    }

    static {
        Z();
        V = null;
        B = null;
        int i2 = C + 125;
        S = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private Z(Context context) {
        this.Code = 0;
        this.I = true;
        this.Z = new I();
        try {
            byte[] bArrV = m.V(context, S(context), L(context));
            JSONObject jSONObject = new JSONObject(new String(bArrV, 0, bArrV.length, StandardCharsets.UTF_8));
            this.Code = jSONObject.getInt(B((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, 13 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (Gravity.getAbsoluteGravity(0, 0) + 39133)).intern());
            this.I = jSONObject.optBoolean(B((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 14, 10 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) TextUtils.getCapsMode("", 0, 0)).intern());
            String strOptString = jSONObject.optString(B(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24, TextUtils.indexOf((CharSequence) "", '0', 0) + 9, (char) (16131 - TextUtils.indexOf("", "", 0))).intern(), "");
            if (strOptString.isEmpty()) {
                return;
            }
            this.Z = I.Code(new JSONObject(strOptString));
        } catch (Exception e2) {
            L.V(e2);
        }
    }

    /* synthetic */ Z(Context context, byte b2) {
        this(context);
    }

    static /* synthetic */ int B(Z z2, int i2) {
        int i3 = 2 % 2;
        int i4 = S;
        int i5 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        C = i5 % 128;
        int i6 = i5 % 2;
        z2.Code = i2;
        if (i6 != 0) {
            throw null;
        }
        int i7 = i4 + 111;
        C = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 2 / 0;
        }
        return i2;
    }

    private static String B(int i2, int i3, char c2) {
        int i4 = 2 % 2;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i5 < i3) {
            int i6 = S + 103;
            int i7 = i6 % 128;
            C = i7;
            int i8 = i6 % 2;
            cArr[i5] = (char) ((((long) L[i2 + i5]) ^ (((long) i5) * F)) ^ ((long) c2));
            i5++;
            int i9 = i7 + 47;
            S = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 % 4;
            }
        }
        return new String(cArr);
    }

    static void B(Context context) {
        int i2 = 2 % 2;
        new V() { // from class: com.facetec.sdk.Z.4
            @Override // com.facetec.sdk.Z.V
            final void V(Z z2) {
                if (Z.V(z2) > 0) {
                    Z.Code(z2);
                }
            }
        }.Z(context);
        int i3 = C + 35;
        S = i3 % 128;
        int i4 = i3 % 2;
    }

    static /* synthetic */ int Code(Z z2) {
        int i2 = 2 % 2;
        int i3 = S + 39;
        int i4 = i3 % 128;
        C = i4;
        int i5 = i3 % 2;
        int i6 = z2.Code;
        z2.Code = i6 - 1;
        int i7 = i4 + 81;
        S = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    static boolean Code() {
        int i2 = 2 % 2;
        int i3 = S + 95;
        C = i3 % 128;
        int i4 = i3 % 2;
        boolean zBooleanValue = V().V.booleanValue();
        int i5 = S + 109;
        C = i5 % 128;
        int i6 = i5 % 2;
        return zBooleanValue;
    }

    static boolean Code(Context context) {
        int i2 = 2 % 2;
        int i3 = C + 17;
        S = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                int i4 = I(context).Code;
                Object obj = null;
                super.hashCode();
                throw null;
            }
            if (I(context).Code > 0) {
                return true;
            }
            int i5 = C + 71;
            S = i5 % 128;
            int i6 = i5 % 2;
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    static /* synthetic */ boolean Code(Z z2, boolean z3) {
        int i2 = 2 % 2;
        int i3 = S + 57;
        C = i3 % 128;
        int i4 = i3 % 2;
        z2.I = z3;
        if (i4 == 0) {
            return z3;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    private static byte[] F(Context context) throws Exception {
        byte[] bArrB;
        int i2 = 2 % 2;
        Object[] objArr = new Object[0];
        Method method = Class.forName(EO.Od("\u007f\\f\u000e\u000eE\u001eI:cb\t)>y\u0014m\u0006_/Z8\u0014", (short) (ZN.Xd() ^ 21993))).getMethod(C1561oA.Qd("dao=hfk[chEWd_[dR^", (short) (ZN.Xd() ^ 2663)), new Class[0]);
        try {
            method.setAccessible(true);
            String string = Settings.Secure.getString((ContentResolver) method.invoke(context, objArr), B((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 53, 9 - ImageFormat.getBitsPerPixel(0), (char) TextUtils.getOffsetAfter("", 0)).intern());
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1593ug.zd("3A8GE@<\u0007=JJQCMT\u000f%RRYK_\\", (short) (ZN.Xd() ^ 13133), (short) (ZN.Xd() ^ 27452))).getMethod(C1561oA.od("EBP+;<C8=:\"4?6", (short) (OY.Xd() ^ 6659)), new Class[0]);
            try {
                method2.setAccessible(true);
                String strI = C1150r.I(sb.append((String) method2.invoke(context, objArr2)).append(string).append(B(63 - Gravity.getAbsoluteGravity(0, 0), 10 - View.MeasureSpec.getMode(0), (char) View.MeasureSpec.getSize(0)).intern()).toString());
                try {
                    bArrB = m.B(context, strI);
                    int i3 = C + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    S = i3 % 128;
                    int i4 = i3 % 2;
                } catch (FileNotFoundException unused) {
                    bArrB = null;
                }
                if (bArrB == null) {
                    StringBuilder sb2 = new StringBuilder();
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(C1561oA.Kd("\u0016$\u001b*(#\u001fi --4&07q\b55<.B?", (short) (C1607wl.Xd() ^ 19378))).getMethod(Wg.Zd("6,:\u000e\u0012\u0013\u0013\u0004\u0001vZlh[", (short) (C1499aX.Xd() ^ (-31201)), (short) (C1499aX.Xd() ^ (-29251))), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        try {
                            bArrB = m.B(context, C1150r.I(sb2.append((String) method3.invoke(context, objArr3)).append(B(53 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 10 - ExpandableListView.getPackedPositionType(0L), (char) (Process.myTid() >> 22)).intern()).append(B(64 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern()).toString()));
                            m.I(context, strI, bArrB);
                        } catch (FileNotFoundException unused2) {
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                if (bArrB != null) {
                    return bArrB;
                }
                int i5 = S + 89;
                C = i5 % 128;
                int i6 = i5 % 2;
                byte[] bArrZ = ce.Z(32, 128);
                m.I(context, strI, bArrZ);
                return bArrZ;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    static int I() {
        int i2 = 2 % 2;
        int i3 = S + 45;
        C = i3 % 128;
        int i4 = i3 % 2;
        Integer num = V().B;
        if (i4 == 0) {
            return num.intValue();
        }
        num.intValue();
        throw null;
    }

    private static synchronized Z I(Context context) throws Exception {
        Z z2;
        int i2 = 2 % 2;
        int i3 = C + 65;
        S = i3 % 128;
        int i4 = i3 % 2;
        if (B == null) {
            B = new Z(context);
        }
        z2 = B;
        int i5 = S + 19;
        C = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    private static byte[] L(Context context) throws Exception {
        int i2 = 2 % 2;
        int i3 = C + 49;
        S = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrI = C1150r.I(Z(context), B((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 85, TextUtils.indexOf("", "", 0) + 14, (char) Drawable.resolveOpacity(0, 0)).intern());
        int i5 = S + 75;
        C = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return bArrI;
    }

    private static String S(Context context) throws Exception {
        int i2 = 2 % 2;
        int i3 = C + 39;
        S = i3 % 128;
        return i3 % 2 == 0 ? C1150r.Code(Z(context), B(115 % (TypedValue.complexToFraction(0, 2.0f, 2.0f) > 2.0f ? 1 : (TypedValue.complexToFraction(0, 2.0f, 2.0f) == 2.0f ? 0 : -1)), KeyEvent.normalizeMetaState(0) * 84, (char) (39652 % TextUtils.indexOf("", "", 0))).intern()) : C1150r.Code(Z(context), B((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 73, KeyEvent.normalizeMetaState(0) + 13, (char) (39652 - TextUtils.indexOf("", "", 0))).intern());
    }

    static /* synthetic */ int V(Z z2) {
        int i2 = 2 % 2;
        int i3 = S;
        int i4 = i3 + 27;
        C = i4 % 128;
        int i5 = i4 % 2;
        int i6 = z2.Code;
        int i7 = i3 + 49;
        C = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    private static synchronized I V() {
        Z z2;
        int i2 = 2 % 2;
        int i3 = C;
        int i4 = i3 + 97;
        S = i4 % 128;
        int i5 = i4 % 2;
        z2 = B;
        if (z2 == null) {
            try {
                throw new RuntimeException(B(31 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16, (char) (Drawable.resolveOpacity(0, 0) + 12713)).intern());
            } catch (Exception e2) {
                L.V(e2);
                return new I();
            }
        }
        int i6 = i3 + 101;
        S = i6 % 128;
        int i7 = i6 % 2;
        return z2.Z;
    }

    static boolean V(Context context) {
        int i2 = 2 % 2;
        int i3 = S + 65;
        C = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                return I(context).I;
            }
            boolean z2 = I(context).I;
            throw null;
        } catch (Exception unused) {
            return false;
        }
    }

    static /* synthetic */ I Z(Z z2, I i2) {
        int i3 = 2 % 2;
        int i4 = S + 95;
        int i5 = i4 % 128;
        C = i5;
        int i6 = i4 % 2;
        z2.Z = i2;
        int i7 = i5 + 71;
        S = i7 % 128;
        int i8 = i7 % 2;
        return i2;
    }

    static void Z() {
        F = -4031807091089444249L;
        L = new char[]{39087, 60127, 31870, 53129, 20776, 42160, 14046, 47202, 2946, 40216, 57524, 29407, 50276, 22421, 'i', 29204, 58506, 22352, 51690, 15438, 44549, 8373, 37725, 16240, 19713, 56249, 26690, 63222, 878, 37134, 8097, 12794, 17323, 54547, 26344, 63580, 3524, 40868, 4363, 41649, 13403, 18886, 56247, 27918, 65275, 28773, 34247, 26368, 5492, 33746, 12323, 44673, 23324, 'a', 29193, 58538, 22343, 51699, 15466, 44558, 8334, 37713, 1531, 'a', 29207, 58558, 22378, 51692, 15467, 44568, 8368, 37707, 1530, 39614, 59628, 32325, 52668, 21305, 42647, 13566, 47729, 2493, 40719, 57987, 28895, 50690, 'Z', 29192, 58529, 22360, 51677, 15475, 44570, 8341, 37721, 1515, 30823, 59942, 23729, 53058};
    }

    static void Z(Context context, final boolean z2, final I i2) {
        int i3 = 2 % 2;
        new V() { // from class: com.facetec.sdk.Z.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((byte) 0);
            }

            @Override // com.facetec.sdk.Z.V
            final void V(Z z3) {
                Z.Code(z3, z2);
                Z.B(z3, i2.Code.intValue());
                Z.Z(z3, i2);
            }
        }.Z(context);
        int i4 = S + 113;
        C = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    static /* synthetic */ void Z(Z z2, Context context) throws Exception {
        int i2 = 2 % 2;
        B = z2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(B((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, 13 - Process.getGidForName(""), (char) (AndroidCharacter.getMirror('0') + 39085)).intern(), z2.Code);
        jSONObject.put(B(14 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (Process.myTid() >> 22) + 9, (char) (MotionEvent.axisFromString("") + 1)).intern(), z2.I);
        jSONObject.put(B(ExpandableListView.getPackedPositionType(0L) + 23, View.MeasureSpec.makeMeasureSpec(0, 0) + 8, (char) (16131 - Color.red(0))).intern(), z2.Z.Z());
        jSONObject.put(B(47 - KeyEvent.getDeadChar(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 26481)).intern(), ce.V(16, 32));
        m.I(context, S(context), new bh(L(context)).Z(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
        int i3 = C + 29;
        S = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    static byte[] Z(Context context) throws Exception {
        int i2 = 2 % 2;
        int i3 = C + 17;
        int i4 = i3 % 128;
        S = i4;
        int i5 = i3 % 2;
        if (V == null) {
            int i6 = i4 + 53;
            C = i6 % 128;
            if (i6 % 2 != 0) {
                V = F(context);
                Object obj = null;
                super.hashCode();
                throw null;
            }
            V = F(context);
        }
        return C1150r.Code(V);
    }
}
