package com.incode.welcome_sdk.data;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.c.a.i;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f7613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f7614c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static c f7615d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static c f7616e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ c[] f7617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f7618g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char[] f7619h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f7620i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f7621j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f7622k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f7623m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f7624n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f7625o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7626a;

    private static String $$c(short s2, int i2, byte b2) {
        int i3 = 4 - (s2 * 2);
        int i4 = (i2 * 50) + 72;
        int i5 = b2 * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i3++;
            i4 += -i3;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i3];
            i3++;
            i4 += -b3;
        }
    }

    static void init$0() {
        $$a = new byte[]{70, -123, Ascii.CR, 112};
        $$b = 135;
    }

    private c(String str, int i2, String str2) {
        this.f7626a = str2;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f7624n + 1;
        int i4 = i3 % 128;
        f7625o = i4;
        int i5 = i3 % 2;
        String str = this.f7626a;
        int i6 = i4 + 29;
        f7624n = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f7623m = 0;
        f7622k = 1;
        f7625o = 0;
        f7624n = 1;
        a();
        Object[] objArr = new Object[1];
        l("\u0082\u0085\u0084\u0083\u0082\u0081", null, null, View.MeasureSpec.getMode(0) + 127, objArr);
        f7613b = new c("SELFIE", 0, ((String) objArr[0]).intern());
        f7614c = new c("VIDEO_SELFIE", 1, "videoSelfie");
        f7616e = new c("ID", 2, "id");
        f7615d = new c("MIXED", 3, "mixed");
        c[] cVarArrE = e();
        f7617f = cVarArrE;
        EnumEntriesKt.enumEntries(cVarArrE);
        int i2 = f7623m + 51;
        f7622k = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void l(String str, String str2, int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        Object charArray = str4;
        if (str4 != null) {
            charArray = str4.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        i iVar = new i();
        char[] cArr3 = f7619h;
        float f2 = 0.0f;
        int i4 = 0;
        if (cArr3 != null) {
            int i5 = $11 + 59;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr = new char[length];
            } else {
                length = cArr3.length;
                cArr = new char[length];
            }
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    Object objC = com.c.a.e.e.c(936178174);
                    if (objC == null) {
                        byte b2 = (byte) i4;
                        byte b3 = (byte) (b2 + 1);
                        objC = com.c.a.e.e.e((char) (PointF.length(f2, f2) > f2 ? 1 : (PointF.length(f2, f2) == f2 ? 0 : -1)), 20 - Color.green(i4), 846 - TextUtils.getOffsetBefore("", i4), 928445319, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr[i6] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    i6++;
                    f2 = 0.0f;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $10 + 109;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr3 = cArr;
        }
        Object[] objArr3 = {Integer.valueOf(f7618g)};
        Object objC2 = com.c.a.e.e.c(-1774242729);
        long j2 = 0;
        if (objC2 == null) {
            objC2 = com.c.a.e.e.e((char) (35038 - Color.blue(0)), 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), Color.alpha(0) + 1362, -1767557586, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objC2).invoke(null, objArr3)).intValue();
        if (f7621j) {
            iVar.f2754b = bArr.length;
            char[] cArr4 = new char[iVar.f2754b];
            iVar.f2755c = 0;
            while (iVar.f2755c < iVar.f2754b) {
                cArr4[iVar.f2755c] = (char) (cArr3[bArr[(iVar.f2754b - 1) - iVar.f2755c] + i2] - iIntValue);
                Object[] objArr4 = {iVar, iVar};
                Object objC3 = com.c.a.e.e.c(-1471606930);
                if (objC3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objC3 = com.c.a.e.e.e((char) ((SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1)) + 49812), (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)) + 20, 1341 - Process.getGidForName(""), -1462563561, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objC3).invoke(null, objArr4);
                j2 = 0;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        int i9 = 0;
        if (!f7620i) {
            iVar.f2754b = iArr.length;
            char[] cArr5 = new char[iVar.f2754b];
            while (true) {
                iVar.f2755c = i9;
                if (iVar.f2755c >= iVar.f2754b) {
                    break;
                }
                cArr5[iVar.f2755c] = (char) (cArr3[iArr[(iVar.f2754b - 1) - iVar.f2755c] - i2] - iIntValue);
                i9 = iVar.f2755c + 1;
            }
            String str5 = new String(cArr5);
            int i10 = $11 + 37;
            $10 = i10 % 128;
            if (i10 % 2 == 0) {
                objArr[0] = str5;
                return;
            } else {
                int i11 = 5 / 0;
                objArr[0] = str5;
                return;
            }
        }
        iVar.f2754b = cArr2.length;
        char[] cArr6 = new char[iVar.f2754b];
        iVar.f2755c = 0;
        while (iVar.f2755c < iVar.f2754b) {
            int i12 = $10 + 83;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr6[iVar.f2755c] = (char) (cArr3[cArr2[(iVar.f2754b - 1) - iVar.f2755c] - i2] - iIntValue);
            Object[] objArr5 = {iVar, iVar};
            Object objC4 = com.c.a.e.e.c(-1471606930);
            if (objC4 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objC4 = com.c.a.e.e.e((char) (49814 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), View.resolveSize(0, 0) + 20, 1342 - Color.argb(0, 0, 0, 0), -1462563561, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objC4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    static void a() {
        f7619h = new char[]{64447, 64429, 64436, 64426, 64425};
        f7618g = -1867973824;
        f7620i = true;
        f7621j = true;
    }

    private static final /* synthetic */ c[] e() {
        int i2 = 2 % 2;
        int i3 = f7624n + 125;
        int i4 = i3 % 128;
        f7625o = i4;
        int i5 = i3 % 2;
        c[] cVarArr = {f7613b, f7614c, f7616e, f7615d};
        int i6 = i4 + 103;
        f7624n = i6 % 128;
        int i7 = i6 % 2;
        return cVarArr;
    }

    public static c valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f7625o + 57;
        f7624n = i3 % 128;
        int i4 = i3 % 2;
        c cVar = (c) Enum.valueOf(c.class, str);
        int i5 = f7624n + 3;
        f7625o = i5 % 128;
        if (i5 % 2 == 0) {
            return cVar;
        }
        throw null;
    }

    public static c[] values() {
        int i2 = 2 % 2;
        int i3 = f7624n + 51;
        f7625o = i3 % 128;
        int i4 = i3 % 2;
        c[] cVarArr = (c[]) f7617f.clone();
        int i5 = f7624n + 95;
        f7625o = i5 % 128;
        if (i5 % 2 == 0) {
            return cVarArr;
        }
        throw null;
    }
}
