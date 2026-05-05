package o.bs;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f21592c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f21593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f21594f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ a[] f21595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21596h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f21597i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f21598j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f21599l = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21600d;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, short r9, byte r10) {
        /*
            int r0 = r8 * 3
            int r8 = 3 - r0
            byte[] r7 = o.bs.a.$$a
            int r0 = r10 * 2
            int r6 = r0 + 113
            int r5 = r9 * 3
            int r0 = r5 + 1
            byte[] r4 = new byte[r0]
            r3 = 0
            if (r7 != 0) goto L2c
            r0 = r6
            r2 = r3
            r1 = r8
        L16:
            int r8 = r8 + r0
            r6 = r8
            r8 = r1
        L19:
            int r1 = r8 + 1
            byte r0 = (byte) r6
            r4[r2] = r0
            if (r2 != r5) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L26:
            r0 = r7[r1]
            int r2 = r2 + 1
            r8 = r6
            goto L16
        L2c:
            r2 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bs.a.$$c(int, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21597i = 0;
        f21599l = 1;
        f21598j = 0;
        f21594f = 1;
        a();
        Object[] objArr = new Object[1];
        k(7 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u000b\b￭\b\n\ufff3", false, Color.alpha(0) + 118, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1, objArr);
        f21591b = new a(((String) objArr[0]).intern(), 0, 1);
        Object[] objArr2 = new Object[1];
        k(6 - (ViewConfiguration.getEdgeSlop() >> 16), "\u0002\uffe7\u000f\u0012\ufff3\u0004", true, TextUtils.indexOf((CharSequence) "", '0') + 125, 2 - ExpandableListView.getPackedPositionType(0L), objArr2);
        f21593e = new a(((String) objArr2[0]).intern(), 1, 3);
        Object[] objArr3 = new Object[1];
        k((ViewConfiguration.getTapTimeout() >> 16) + 12, "\u0006\u0006\u0007\u0010￪\u0005\u0007\ufff0\b\u0005￪\u000b", false, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 121, 3 - ImageFormat.getBitsPerPixel(0), objArr3);
        f21590a = new a(((String) objArr3[0]).intern(), 2, 4);
        Object[] objArr4 = new Object[1];
        k((ViewConfiguration.getLongPressTimeout() >> 16) + 7, "\u0004\u0003\u0000\u0003￪\u0003\f", true, 134 - KeyEvent.getDeadChar(0, 0), Gravity.getAbsoluteGravity(0, 0) + 5, objArr4);
        f21592c = new a(((String) objArr4[0]).intern(), 3, 9);
        f21595g = d();
        int i2 = f21599l + 55;
        f21597i = i2 % 128;
        int i3 = i2 % 2;
    }

    private a(String str, int i2, int i3) {
        this.f21600d = i3;
    }

    static void a() {
        f21596h = -1270219520;
    }

    public static a b(int i2) {
        int i3 = 2 % 2;
        a[] aVarArrValues = values();
        int length = aVarArrValues.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = f21594f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f21598j = i5 % 128;
            int i6 = i5 % 2;
            a aVar = aVarArrValues[i4];
            if (i2 == aVar.c()) {
                return aVar;
            }
            i4++;
            int i7 = f21598j + 113;
            f21594f = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = f21594f + 1;
        f21598j = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 91 / 0;
        }
        return null;
    }

    private static /* synthetic */ a[] d() {
        int i2 = 2 % 2;
        int i3 = f21594f + 35;
        f21598j = i3 % 128;
        if (i3 % 2 == 0) {
            return new a[]{f21591b, f21593e, f21590a, f21592c};
        }
        a[] aVarArr = new a[3];
        aVarArr[1] = f21591b;
        aVarArr[1] = f21593e;
        aVarArr[3] = f21590a;
        aVarArr[5] = f21592c;
        return aVarArr;
    }

    static void init$0() {
        $$a = new byte[]{Ascii.SYN, -5, 39, 97};
        $$b = 40;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(int r20, java.lang.String r21, boolean r22, int r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bs.a.k(int, java.lang.String, boolean, int, int, java.lang.Object[]):void");
    }

    public static a valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f21598j + 67;
        f21594f = i3 % 128;
        int i4 = i3 % 2;
        a aVar = (a) Enum.valueOf(a.class, str);
        if (i4 == 0) {
            throw null;
        }
        int i5 = f21598j + 111;
        f21594f = i5 % 128;
        int i6 = i5 % 2;
        return aVar;
    }

    public static a[] values() {
        int i2 = 2 % 2;
        int i3 = f21594f + 67;
        f21598j = i3 % 128;
        int i4 = i3 % 2;
        a[] aVarArr = f21595g;
        if (i4 == 0) {
            return (a[]) aVarArr.clone();
        }
        a[] aVarArr2 = (a[]) aVarArr.clone();
        int i5 = 15 / 0;
        return aVarArr2;
    }

    public final int c() {
        int i2 = 2 % 2;
        int i3 = f21594f + 29;
        int i4 = i3 % 128;
        f21598j = i4;
        int i5 = i3 % 2;
        int i6 = this.f21600d;
        int i7 = i4 + 19;
        f21594f = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 83 / 0;
        }
        return i6;
    }
}
