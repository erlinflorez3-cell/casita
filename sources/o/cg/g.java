package o.cg;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import okio.Utf8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class g {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ g[] f22327a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f22328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22329d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22330e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static short[] f22331f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static byte[] f22332g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f22333h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f22334i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22335j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f22336l = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f22337o = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22338b;

    private static String $$c(byte b2, short s2, int i2) {
        byte[] bArr = $$a;
        int i3 = i2 * 4;
        int i4 = 4 - (b2 * 3);
        int i5 = s2 + 103;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5 = (-i5) + i3;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i5;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            i5 = (-bArr[i4]) + i5;
            i4++;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22336l = 0;
        f22337o = 1;
        f22334i = 0;
        f22335j = 1;
        d();
        Object[] objArr = new Object[1];
        k((short) (64 - TextUtils.lastIndexOf("", '0', 0, 0)), 1538094092 - Color.red(0), (ViewConfiguration.getEdgeSlop() >> 16) + 163467591, (-77) - (ViewConfiguration.getScrollBarSize() >> 8), (byte) View.MeasureSpec.getSize(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        k((short) ((Process.myPid() >> 22) + 105), 1538094106 - Color.red(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 163467591, (ViewConfiguration.getPressedStateDuration() >> 16) - 75, (byte) KeyEvent.keyCodeFromString(""), objArr2);
        f22328c = new g(strIntern, ((String) objArr2[0]).intern());
        f22327a = a();
        int i2 = f22336l + 19;
        f22337o = i2 % 128;
        int i3 = i2 % 2;
    }

    private g(String str, String str2) {
        this.f22338b = str2;
    }

    private static /* synthetic */ g[] a() {
        int i2 = 2 % 2;
        int i3 = f22335j + 87;
        f22334i = i3 % 128;
        if (i3 % 2 == 0) {
            return new g[]{f22328c};
        }
        g[] gVarArr = new g[0];
        gVarArr[1] = f22328c;
        return gVarArr;
    }

    public static g b(String str) {
        int i2 = 2 % 2;
        int i3 = f22335j + 115;
        int i4 = i3 % 128;
        f22334i = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (str == null) {
            int i5 = i4 + 27;
            f22335j = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            throw null;
        }
        for (g gVar : values()) {
            if (gVar.f22338b.equals(str)) {
                int i6 = f22334i + 27;
                f22335j = i6 % 128;
                int i7 = i6 % 2;
                return gVar;
            }
        }
        return null;
    }

    static void d() {
        f22330e = -524253575;
        f22329d = 1150422481;
        f22333h = -1294752905;
        f22332g = new byte[]{51, 104, 39, 51, 48, 50, 58, 111, 43, 35, 65, 57, 93, 108, Ascii.ESC, 16, 10, Utf8.REPLACEMENT_BYTE, Ascii.ESC, Ascii.CAN, Ascii.SUB, 2, Ascii.ETB, 9, 60, Ascii.VT, 41, 1, 37, Ascii.DC4, -115, -115};
    }

    static void init$0() {
        $$a = new byte[]{108, -100, -109, 80};
        $$b = 190;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(short r24, int r25, int r26, int r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cg.g.k(short, int, int, int, byte, java.lang.Object[]):void");
    }

    public static g valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f22335j + 35;
        f22334i = i3 % 128;
        int i4 = i3 % 2;
        g gVar = (g) Enum.valueOf(g.class, str);
        if (i4 == 0) {
            return gVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static g[] values() {
        int i2 = 2 % 2;
        int i3 = f22335j + 109;
        f22334i = i3 % 128;
        int i4 = i3 % 2;
        g[] gVarArr = (g[]) f22327a.clone();
        int i5 = f22334i + 79;
        f22335j = i5 % 128;
        int i6 = i5 % 2;
        return gVarArr;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f22335j;
        int i4 = i3 + 87;
        f22334i = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f22338b;
        int i6 = i3 + 71;
        f22334i = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
