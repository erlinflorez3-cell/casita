package o.q;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import o.a.q;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f26723a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26724b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f26725c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f26726d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f26727e = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0018). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r7, int r8, int r9) {
        /*
            int r3 = r8 * 4
            int r2 = 1 - r3
            byte[] r8 = o.q.d.$$c
            int r0 = r7 * 3
            int r0 = r0 + 4
            int r1 = r9 * 7
            int r1 = r1 + 71
            byte[] r7 = new byte[r2]
            r6 = 0
            int r5 = 0 - r3
            if (r8 != 0) goto L2f
            r4 = r0
            r2 = r5
            r3 = r6
        L18:
            int r1 = -r0
            int r1 = r1 + r2
            int r0 = r4 + 1
        L1c:
            byte r2 = (byte) r1
            r7[r3] = r2
            if (r3 != r5) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7, r6)
            return r0
        L27:
            int r3 = r3 + 1
            r2 = r8[r0]
            r4 = r0
            r0 = r2
            r2 = r1
            goto L18
        L2f:
            r3 = r6
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.q.d.$$g(byte, int, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        f26724b = 0;
        f26725c = 1;
        f26727e = 0;
        f26723a = 1;
        a();
        PointF.length(0.0f, 0.0f);
        int i2 = f26725c + 49;
        f26724b = i2 % 128;
        int i3 = i2 % 2;
    }

    static void a() {
        f26726d = -4774266852961147411L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(short r9, short r10, short r11, java.lang.Object[] r12) {
        /*
            int r9 = r9 * 2
            int r0 = r9 + 1
            byte[] r8 = o.q.d.$$a
            int r7 = 101 - r10
            int r6 = r11 + 4
            byte[] r5 = new byte[r0]
            r4 = 0
            if (r8 != 0) goto L2a
            r1 = r6
            r3 = r4
        L11:
            int r7 = r7 + r6
            r6 = r1
            r2 = r3
        L14:
            byte r0 = (byte) r7
            r5[r2] = r0
            int r1 = r6 + 1
            int r3 = r2 + 1
            if (r2 != r9) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r12[r4] = r0
            return
        L25:
            r0 = r8[r1]
            r6 = r7
            r7 = r0
            goto L11
        L2a:
            r2 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.q.d.f(short, short, short, java.lang.Object[]):void");
    }

    private static void g(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        Object obj = null;
        if (str2 != null) {
            int i4 = $10 + 11;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                str2.toCharArray();
                obj.hashCode();
                throw null;
            }
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i5 = qVar.f19948a;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA = o.d.d.a(-1011865131);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 731, (char) (7933 - TextUtils.indexOf("", "")), (ViewConfiguration.getJumpTapTimeout() >> 16) + 11, 355847088, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f26726d ^ 4743694005979712847L);
                Object[] objArr3 = {qVar, qVar};
                Object objA2 = o.d.d.a(1452497747);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objA2 = o.d.d.a(TextUtils.lastIndexOf("", '0', 0) + 837, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27280), ExpandableListView.getPackedPositionChild(0L) + 12, -2145994442, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i6 = $11 + 19;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr4 = {qVar, qVar};
            Object objA3 = o.d.d.a(1452497747);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = o.d.d.a(836 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (View.combineMeasuredStates(0, 0) + 27279), (-16777205) - Color.rgb(0, 0, 0), -2145994442, false, $$g(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            int i8 = $10 + 29;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r8, short r9, int r10, java.lang.Object[] r11) {
        /*
            int r7 = r9 * 4
            int r1 = r7 + 1
            byte[] r6 = o.q.d.$$d
            int r0 = r8 * 4
            int r5 = r0 + 98
            int r4 = r10 + 4
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r6 != 0) goto L29
            r0 = r5
            r5 = r7
            r1 = r2
        L14:
            int r5 = r5 + r0
        L15:
            byte r0 = (byte) r5
            int r4 = r4 + 1
            r3[r1] = r0
            if (r1 != r7) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            r11[r2] = r0
            return
        L24:
            int r1 = r1 + 1
            r0 = r6[r4]
            goto L14
        L29:
            r1 = r2
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.q.d.h(short, short, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{78, MessagePack.Code.UINT16, MessagePack.Code.FALSE, 123};
        $$b = 154;
    }

    static void init$1() {
        $$d = new byte[]{5, Ascii.SO, 124, -17};
        $$e = 50;
    }

    static void init$2() {
        $$c = new byte[]{37, Ascii.SUB, MessagePack.Code.FLOAT32, 10};
        $$f = JfifUtil.MARKER_SOI;
    }

    @Override // o.q.a
    public final void a(o.ef.a aVar) {
        int i2 = 2 % 2;
        int i3 = f26727e + 103;
        f26723a = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.q.a
    public final String c() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26723a + 57;
        f26727e = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        g("⣑\uf592鉥뼎嶝穜ܷ▂쉾\uef28跨꩒", 56659 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f26723a + 49;
        f26727e = i5 % 128;
        if (i5 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x05e6  */
    @Override // o.q.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.ef.a d() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.q.d.d():o.ef.a");
    }

    @Override // o.q.a
    public final void e(a aVar) {
        int i2 = 2 % 2;
        int i3 = f26727e + 35;
        f26723a = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f26727e;
        int i4 = i3 + 19;
        f26723a = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = obj instanceof d;
        int i6 = i3 + 107;
        f26723a = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }
}
