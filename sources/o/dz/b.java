package o.dz;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URI;
import o.a.l;
import o.dx.a;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements c<URI> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f23464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f23465b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f23466c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23467d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int[] f23468e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23469h = 0;

    private static String $$c(byte b2, int i2, byte b3) {
        byte[] bArr = $$a;
        int i3 = (b3 * 4) + 4;
        int i4 = b2 * 3;
        int i5 = (i2 * 2) + 117;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i5 += i3;
            i3++;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            int i8 = i3;
            i5 += bArr[i3];
            i3 = i8 + 1;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23467d = 0;
        f23469h = 1;
        f23465b = 0;
        f23466c = 1;
        d();
        f23464a = new b();
        int i2 = f23469h + 117;
        f23467d = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static URI b(File file) throws a {
        int i2 = 2 % 2;
        int i3 = f23466c + 13;
        f23465b = i3 % 128;
        if (i3 % 2 == 0) {
            return file.toURI();
        }
        file.toURI();
        throw null;
    }

    static void d() {
        f23468e = new int[]{-1561876620, -1266710975, 778138828, -971265598, 118866774, -711165670, 1803577506, -125973413, -895905431, 2018110292, -628795802, 672176511, 513532526, 1710916955, 2015888356, -1084432267, -647972033, 1858596109};
    }

    private static void f(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        char c2 = 2;
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f23468e;
        int i4 = 989264422;
        long j2 = 0;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $10;
            int i7 = i6 + 37;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i8 = i6 + 85;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i10])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        int absoluteGravity = 675 - Gravity.getAbsoluteGravity(0, 0);
                        char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(j2);
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 13;
                        byte b2 = $$a[c2];
                        byte b3 = b2;
                        objA = o.d.d.a(absoluteGravity, packedPositionGroup, bitsPerPixel, -328001469, false, $$c(b3, (byte) (b3 + 2), b2), new Class[]{Integer.TYPE});
                    }
                    iArr2[i10] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i10++;
                    c2 = 2;
                    i4 = 989264422;
                    j2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f23468e;
        int i11 = 16;
        if (iArr5 != null) {
            int i12 = $10 + 97;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i14 = 0;
            while (i14 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i14])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    int minimumFlingVelocity = 675 - (ViewConfiguration.getMinimumFlingVelocity() >> i11);
                    char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int iMyPid = 12 - (Process.myPid() >> 22);
                    byte b4 = $$a[2];
                    byte b5 = b4;
                    objA2 = o.d.d.a(minimumFlingVelocity, modifierMetaStateMask, iMyPid, -328001469, false, $$c(b5, (byte) (b5 + 2), b4), new Class[]{Integer.TYPE});
                }
                iArr6[i14] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i14++;
                i11 = 16;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i5, iArr4, i5, length2);
        lVar.f19941d = i5;
        while (lVar.f19941d < iArr.length) {
            int i15 = $11 + 101;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                lVar.f19942e ^= iArr4[i17];
                Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA3 = o.d.d.a(2098218801);
                if (objA3 == null) {
                    int mirror = AndroidCharacter.getMirror('0') + 253;
                    char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 52697);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 11;
                    byte b6 = $$a[2];
                    byte b7 = b6;
                    objA3 = o.d.d.a(mirror, cIndexOf, threadPriority, -1416256172, false, $$c(b7, (byte) (b7 + 1), b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i17++;
            }
            int i19 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i19;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i20 = lVar.f19942e;
            int i21 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr5 = {lVar, lVar};
            Object objA4 = o.d.d.a(986820978);
            if (objA4 == null) {
                int packedPositionGroup2 = 229 - ExpandableListView.getPackedPositionGroup(0L);
                char tapTimeout = (char) (51004 - (ViewConfiguration.getTapTimeout() >> 16));
                int i22 = 9 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte b8 = $$a[2];
                byte b9 = b8;
                objA4 = o.d.d.a(packedPositionGroup2, tapTimeout, i22, -330018025, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            int i23 = $10 + 85;
            $11 = i23 % 128;
            int i24 = i23 % 2;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static void init$0() {
        $$a = new byte[]{123, MessagePack.Code.FLOAT32, 0, -17};
        $$b = 157;
    }

    @Override // o.dz.c
    public final Class<URI> a() {
        Class<URI> cls;
        int i2 = 2 % 2;
        int i3 = f23466c;
        int i4 = i3 + 101;
        f23465b = i4 % 128;
        if (i4 % 2 != 0) {
            cls = URI.class;
            int i5 = 18 / 0;
        } else {
            cls = URI.class;
        }
        int i6 = i3 + 83;
        f23465b = i6 % 128;
        int i7 = i6 % 2;
        return cls;
    }

    @Override // o.dz.c
    public final /* synthetic */ URI e(File file) throws a {
        int i2 = 2 % 2;
        int i3 = f23466c + 51;
        f23465b = i3 % 128;
        if (i3 % 2 == 0) {
            return b(file);
        }
        b(file);
        throw null;
    }

    public final String toString() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23465b + 15;
        f23466c = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        f(new int[]{1606667070, -493327487, -462170597, -92182305, 864784811, 37986934, -1415226519, 844508333, 1219602182, -327587737, -1880564920, -2086375646, -738680821, 1025884876, 1031837529, -151160299}, 32 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f23466c + 37;
        f23465b = i5 % 128;
        if (i5 % 2 == 0) {
            return strIntern;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
