package o.br;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.FirebaseError;
import java.lang.reflect.Method;
import o.a.o;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f21584a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f21585b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f21586c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f21587d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f21588e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f21589i = 0;

    private static String $$c(byte b2, byte b3, int i2) {
        int i3 = 4 - (b3 * 4);
        byte[] bArr = $$a;
        int i4 = b2 + 99;
        int i5 = i2 * 4;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3++;
            i4 += -i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            int i7 = bArr[i3];
            i3++;
            i4 += -i7;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21588e = 0;
        f21589i = 1;
        f21585b = 0;
        f21587d = 1;
        g();
        ViewConfiguration.getScrollDefaultDelay();
        CdmaCellLocation.convertQuartSecToDecDegrees(0);
        Process.getThreadPriority(0);
        int i2 = f21588e + 25;
        f21589i = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void f(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i6 = $10 + 77;
            $11 = i6 % 128;
            if (i6 % i4 == 0) {
                int i7 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f21584a[i2 / i7])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        int trimmedLength = 742 - TextUtils.getTrimmedLength("");
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                        int keyRepeatTimeout = 12 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte b2 = $$a[1];
                        byte b3 = b2;
                        objA = o.d.d.a(trimmedLength, cIndexOf, keyRepeatTimeout, 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f21586c), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        int size = View.MeasureSpec.getSize(0) + 766;
                        char cRed = (char) (Color.red(0) + 12470);
                        int iIndexOf = 11 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        byte b4 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 1)));
                        byte b5 = $$a[1];
                        objA2 = o.d.d.a(size, cRed, iIndexOf, 1946853218, false, $$c(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        int iArgb = Color.argb(0, 0, 0, 0) + 387;
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 18;
                        byte b6 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 14)));
                        byte b7 = $$a[1];
                        objA3 = o.d.d.a(iArgb, cCombineMeasuredStates, iResolveOpacity, 39570797, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i8 = oVar.f19947b;
                Object[] objArr5 = {Integer.valueOf(f21584a[i2 + i8])};
                Object objA4 = o.d.d.a(-214519724);
                if (objA4 == null) {
                    int trimmedLength2 = 742 - TextUtils.getTrimmedLength("");
                    char cGreen = (char) Color.green(0);
                    int i9 = 13 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                    byte b8 = $$a[1];
                    byte b9 = b8;
                    objA4 = o.d.d.a(trimmedLength2, cGreen, i9, 632508977, false, $$c(b8, b9, b9), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(f21586c), Integer.valueOf(c2)};
                Object objA5 = o.d.d.a(-1567654649);
                if (objA5 == null) {
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 766;
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 12471);
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 12;
                    int i10 = $$b;
                    byte b10 = (byte) ((i10 + 1) - (i10 | 1));
                    byte b11 = $$a[1];
                    objA5 = o.d.d.a(scrollBarSize, bitsPerPixel, iCombineMeasuredStates, 1946853218, false, $$c(b10, b11, b11), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = o.d.d.a(-723636472);
                if (objA6 == null) {
                    int iLastIndexOf = 386 - TextUtils.lastIndexOf("", '0', 0, 0);
                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                    int i11 = 17 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    byte b12 = (byte) ($$b & 14);
                    byte b13 = $$a[1];
                    objA6 = o.d.d.a(iLastIndexOf, packedPositionGroup, i11, 39570797, false, $$c(b12, b13, b13), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            i4 = 2;
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr8 = {oVar, oVar};
            Object objA7 = o.d.d.a(-723636472);
            if (objA7 == null) {
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 387;
                char cRed2 = (char) Color.red(0);
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 19;
                int i12 = $$b;
                byte b14 = $$a[1];
                objA7 = o.d.d.a(tapTimeout, cRed2, iLastIndexOf2, 39570797, false, $$c((byte) ((i12 + 14) - (i12 | 14)), b14, b14), new Class[]{Object.class, Object.class});
            }
            ((Method) objA7).invoke(null, objArr8);
            int i13 = $11 + 15;
            $10 = i13 % 128;
            int i14 = i13 % 2;
        }
        objArr[0] = new String(cArr);
    }

    static void g() {
        f21584a = new char[]{39843, 32209, 22289, 10621, 657, 58560, 65026, 53367, 43419, 33778, 25900, 32609, 20645, 10774, 3139, 58761, 65473, 53521, 43843, 35968, 26362, 30729, 21100, 11180, 3582, 59172, 63638, 53970, 46094};
        f21586c = -5262564140220648777L;
    }

    static void init$0() {
        $$a = new byte[]{88, 0, 126, -69};
        $$b = 87;
    }

    @Override // o.br.c
    public final String a() {
        int i2 = 2 % 2;
        int i3 = f21587d;
        int i4 = i3 + 57;
        f21585b = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 87;
        f21585b = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // o.br.c
    public final String b() {
        int i2 = 2 % 2;
        if (!"".isEmpty()) {
            int i3 = f21585b + 95;
            f21587d = i3 % 128;
            int i4 = i3 % 2;
            return "";
        }
        int i5 = f21587d + 99;
        int i6 = i5 % 128;
        f21585b = i6;
        if (i5 % 2 != 0) {
            int i7 = 50 / 0;
        }
        int i8 = i6 + 15;
        f21587d = i8 % 128;
        if (i8 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // o.br.c
    public final o.bk.c c() {
        int i2 = 2 % 2;
        int i3 = f21585b + 21;
        f21587d = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // o.br.c
    public final String d() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f21587d + 9;
        f21585b = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            f((char) (FirebaseError.ERROR_PROVIDER_ALREADY_LINKED << (ViewConfiguration.getFadingEdgeLength() / 28)), ViewConfiguration.getFadingEdgeLength() % 7, 108 % Gravity.getAbsoluteGravity(0, 1), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            f((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 3842), ViewConfiguration.getFadingEdgeLength() >> 16, Gravity.getAbsoluteGravity(0, 0) + 29, objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // o.br.c
    public final void d(Context context) {
        int i2 = 2 % 2;
        int i3 = f21587d + 11;
        f21585b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 99 / 0;
        }
    }

    @Override // o.br.c
    public final o.bk.a e() {
        int i2 = 2 % 2;
        int i3 = f21587d + 103;
        int i4 = i3 % 128;
        f21585b = i4;
        if (i3 % 2 != 0) {
            int i5 = 60 / 0;
        }
        int i6 = i4 + 13;
        f21587d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 79 / 0;
        }
        return null;
    }
}
