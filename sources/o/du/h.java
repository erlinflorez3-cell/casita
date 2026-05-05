package o.du;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imageutils.JfifUtil;
import fr.antelop.sdk.settings.TransactionStartCondition;
import java.lang.reflect.Method;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f23366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f23367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f23368c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ h[] f23369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char[] f23370f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f23371g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23372h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char f23373i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23374j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f23375k = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f23376d;

    /* JADX INFO: renamed from: o.du.h$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f23377a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f23378c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f23379e = 1;

        static {
            int[] iArr = new int[h.values().length];
            f23378c = iArr;
            try {
                iArr[h.f23368c.ordinal()] = 1;
                int i2 = f23379e;
                int i3 = ((-1) - (((-1) - i2) | ((-1) - 87))) + ((-1) - (((-1) - i2) & ((-1) - 87)));
                f23377a = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23378c[h.f23366a.ordinal()] = 2;
                int i6 = f23377a;
                int i7 = (i6 ^ 7) + (((-1) - (((-1) - i6) | ((-1) - 7))) << 1);
                f23379e = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23378c[h.f23367b.ordinal()] = 3;
                int i10 = f23379e + 75;
                f23377a = i10 % 128;
                if (i10 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r6, byte r7, short r8) {
        /*
            int r2 = r8 * 3
            int r1 = 1 - r2
            int r0 = r7 * 4
            int r8 = r0 + 4
            byte[] r7 = o.du.h.$$a
            int r6 = 111 - r6
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r7 != 0) goto L2c
            r2 = r8
            r6 = r3
            r1 = r4
        L16:
            int r0 = -r8
            int r6 = r6 + r0
            int r8 = r2 + 1
        L1a:
            byte r0 = (byte) r6
            r5[r1] = r0
            if (r1 != r3) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            int r1 = r1 + 1
            r0 = r7[r8]
            r2 = r8
            r8 = r0
            goto L16
        L2c:
            r1 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.du.h.$$c(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23371g = 0;
        f23375k = 1;
        f23372h = 0;
        f23374j = 1;
        c();
        Object[] objArr = new Object[1];
        l((Process.myTid() >> 22) + 2, "\u000b\u0013", (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 118), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        l(2 - TextUtils.getCapsMode("", 0, 0), "\r\u0001", (byte) (9 - TextUtils.getTrimmedLength("")), objArr2);
        f23368c = new h(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        l(8 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0011\u001f\u0007\u001f\u001b\u0001!\u0001", (byte) (1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        l(8 - ExpandableListView.getPackedPositionChild(0L), "\u000e\u0013\u0011\u0006\u0006\b# 㘾", (byte) (106 - View.resolveSize(0, 0)), objArr4);
        f23366a = new h(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        l(13 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0000 \u0015\u0005\u0018\u0007\u0005\u001b\u001d\u0005\u0001\u001c㙰", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 115), objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        l(14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0003\u000e\u0001\r\n#\u0007\b\u0019 \u0017\u000e\t#", (byte) (18 - TextUtils.indexOf("", "")), objArr6);
        f23367b = new h(strIntern3, 2, ((String) objArr6[0]).intern());
        f23369e = e();
        int i2 = f23375k + 59;
        f23371g = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 94 / 0;
        }
    }

    private h(String str, int i2, String str2) {
        this.f23376d = str2;
    }

    public static TransactionStartCondition a(h hVar) throws Throwable {
        int i2 = 2 % 2;
        if (hVar == null) {
            return null;
        }
        int i3 = AnonymousClass1.f23378c[hVar.ordinal()];
        if (i3 == 1) {
            TransactionStartCondition transactionStartCondition = TransactionStartCondition.No;
            int i4 = f23372h + 85;
            f23374j = i4 % 128;
            int i5 = i4 % 2;
            return transactionStartCondition;
        }
        if (i3 == 2) {
            return TransactionStartCondition.ScreenOn;
        }
        if (i3 != 3) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            l(TextUtils.lastIndexOf("", '0', 0) + 19, "\t\u0000\u001a\u0019\u001d\u001a\"\u0017\u001f\u0019\u0003\u000b\u0017\u0018\u0001\u0018\u000b\u0004", (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 97), objArr);
            throw new UnsupportedOperationException(sb.append(((String) objArr[0]).intern()).append(hVar.name()).toString());
        }
        TransactionStartCondition transactionStartCondition2 = TransactionStartCondition.PhoneUnlocked;
        int i6 = f23372h + 11;
        f23374j = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 45 / 0;
        }
        return transactionStartCondition2;
    }

    public static h a(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23372h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f23374j = i3 % 128;
        int i4 = i3 % 2;
        for (h hVar : values()) {
            if (hVar.f23376d.equals(str)) {
                int i5 = f23374j + 69;
                f23372h = i5 % 128;
                if (i5 % 2 == 0) {
                    return hVar;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        l((ViewConfiguration.getDoubleTapTimeout() >> 16) + 25, "\u0015\u0012\u0001\u0015\u0016\u001c\u0011\u0016\u0004\u0000!\u001a\u001d\u001a\u0000\u0001\u0004\u0005\u0005\u0015\u001b\t\u0004\u000b㘫", (byte) (113 - (ViewConfiguration.getTapTimeout() >> 16)), objArr);
        throw new IllegalArgumentException(sb.append(((String) objArr[0]).intern()).append(str).toString());
    }

    static void c() {
        f23370f = new char[]{64592, 64599, 64629, 64587, 64590, 64517, 64624, 64619, 64591, 64627, 64543, 64608, 64631, 64630, 64584, 64621, 64588, 64622, 64580, 64577, 64614, 64594, 64593, 64586, 64605, 64576, 64617, 64604, 64597, 64585, 64589, 64618, 64625, 64609, 64634, 64582};
        f23373i = (char) 51641;
    }

    private static /* synthetic */ h[] e() {
        int i2 = 2 % 2;
        int i3 = f23374j + 47;
        int i4 = i3 % 128;
        f23372h = i4;
        int i5 = i3 % 2;
        h[] hVarArr = {f23368c, f23366a, f23367b};
        int i6 = i4 + 75;
        f23374j = i6 % 128;
        int i7 = i6 % 2;
        return hVarArr;
    }

    static void init$0() {
        $$a = new byte[]{34, -117, -98, -86};
        $$b = 166;
    }

    private static void l(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        int i4;
        int length;
        char[] cArr;
        int i5;
        String str2 = str;
        int i6 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        o.a.h hVar = new o.a.h();
        char[] cArr3 = f23370f;
        int i7 = 421932776;
        int i8 = 9;
        if (cArr3 != null) {
            int i9 = $10 + 65;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = cArr3.length;
                cArr = new char[length];
                i5 = 1;
            } else {
                length = cArr3.length;
                cArr = new char[length];
                i5 = 0;
            }
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objA = o.d.d.a(i7);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        objA = o.d.d.a((ViewConfiguration.getTouchSlop() >> 8) + 270, (char) Gravity.getAbsoluteGravity(0, 0), 11 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -811348851, false, $$c((byte) i8, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr[i5] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i5++;
                    i7 = 421932776;
                    i8 = 9;
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
        Object[] objArr3 = {Integer.valueOf(f23373i)};
        Object objA2 = o.d.d.a(421932776);
        if (objA2 == null) {
            byte b4 = (byte) 0;
            objA2 = o.d.d.a(271 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ViewConfiguration.getTapTimeout() >> 16), 11 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -811348851, false, $$c((byte) 9, b4, b4), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr2[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            int i10 = $10 + 83;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                hVar.f19926b = 1;
            } else {
                hVar.f19926b = 0;
            }
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr2[hVar.f19926b];
                hVar.f19925a = cArr2[hVar.f19926b + 1];
                if (hVar.f19927c == hVar.f19925a) {
                    cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                    cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                    i4 = 2;
                } else {
                    Object[] objArr4 = {hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), hVar};
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objA3 = o.d.d.a(825 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getTapTimeout() >> 16) + 11, -611683395, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + JfifUtil.MARKER_SOS;
                            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                            int i11 = 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                            byte b7 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 11)));
                            byte b8 = (byte) (b7 - 2);
                            objA4 = o.d.d.a(edgeSlop, cIndexOf, i11, 212688716, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i12 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr3[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr3[i12];
                    } else if (hVar.f19928d == hVar.f19929e) {
                        int i13 = $11 + 107;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                        hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                        int i15 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                        int i16 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr3[i15];
                        cArr4[hVar.f19926b + 1] = cArr3[i16];
                    } else {
                        int i17 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                        int i18 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                        cArr4[hVar.f19926b] = cArr3[i17];
                        cArr4[hVar.f19926b + 1] = cArr3[i18];
                        int i19 = $10 + 103;
                        $11 = i19 % 128;
                        i4 = 2;
                        int i20 = i19 % 2;
                    }
                    i4 = 2;
                }
                hVar.f19926b += i4;
            }
        }
        for (int i21 = 0; i21 < i2; i21++) {
            int i22 = $10 + 97;
            $11 = i22 % 128;
            int i23 = i22 % 2;
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        String str3 = new String(cArr4);
        int i24 = $11 + 17;
        $10 = i24 % 128;
        int i25 = i24 % 2;
        objArr[0] = str3;
    }

    public static h valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f23372h + 3;
        f23374j = i3 % 128;
        int i4 = i3 % 2;
        h hVar = (h) Enum.valueOf(h.class, str);
        int i5 = f23372h + 59;
        f23374j = i5 % 128;
        if (i5 % 2 != 0) {
            return hVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static h[] values() {
        int i2 = 2 % 2;
        int i3 = f23372h + 63;
        f23374j = i3 % 128;
        int i4 = i3 % 2;
        h[] hVarArr = (h[]) f23369e.clone();
        int i5 = f23372h + 83;
        f23374j = i5 % 128;
        if (i5 % 2 != 0) {
            return hVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f23374j + 101;
        f23372h = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f23376d;
        }
        throw null;
    }
}
