package o.ds;

import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.g;

/* JADX INFO: loaded from: classes6.dex */
final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f23322a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f23323b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f23324c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23325d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f23326e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f23327g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f23328h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f23329j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, byte r9, byte r10) {
        /*
            int r7 = r9 + 4
            int r0 = r10 * 3
            int r6 = 72 - r0
            byte[] r5 = o.ds.c.$$a
            int r1 = r8 * 2
            int r0 = 1 - r1
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r5 != 0) goto L29
            r0 = r6
            r1 = r3
            r6 = r2
        L16:
            int r6 = r6 + r0
        L17:
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r1 != r2) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L22:
            int r7 = r7 + 1
            int r1 = r1 + 1
            r0 = r5[r7]
            goto L16
        L29:
            r1 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ds.c.$$c(short, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23327g = 0;
        f23328h = 1;
        f23325d = 0;
        f23329j = 1;
        b();
        ViewConfiguration.getKeyRepeatTimeout();
        int i2 = f23327g + 41;
        f23328h = i2 % 128;
        int i3 = i2 % 2;
    }

    c() {
    }

    static void b() {
        f23326e = (char) 50083;
        f23322a = (char) 4896;
        f23324c = (char) 2496;
        f23323b = (char) 34683;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int c(o.dq.c r15, o.dq.c r16) {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ds.c.c(o.dq.c, o.dq.c):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static o.dq.c d(o.dq.c r12, java.util.List<o.dq.c> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ds.c.d(o.dq.c, java.util.List):o.dq.c");
    }

    private static void f(String str, int i2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i6 = $11 + 25;
            $10 = i6 % 128;
            int i7 = 58224;
            if (i6 % i4 != 0) {
                cArr3[0] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d / 0];
                i3 = 1;
            } else {
                cArr3[0] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d + 1];
                i3 = 0;
            }
            while (i3 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                int i8 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) f23324c) ^ (-7511683281764982996L))));
                int i9 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f23323b);
                    objArr2[i4] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 270, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 11, -1995022631, false, $$c(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) f23326e) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f23322a)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a(271 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) TextUtils.indexOf("", "", 0, 0), View.getDefaultSize(0, 0) + 11, -1995022631, false, $$c(b4, b5, (byte) (-b5)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i3++;
                    i4 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[gVar.f19924d] = cArr3[0];
            cArr2[gVar.f19924d + 1] = cArr3[1];
            Object[] objArr4 = {gVar, gVar};
            Object objA3 = o.d.d.a(1390051551);
            if (objA3 == null) {
                byte b6 = (byte) 0;
                byte b7 = (byte) (b6 - 1);
                objA3 = o.d.d.a(270 - KeyEvent.normalizeMetaState(0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 10 - ExpandableListView.getPackedPositionChild(0L), -2074123590, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i4 = 2;
        }
        String str3 = new String(cArr2, 0, i2);
        int i10 = $10 + 115;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str3;
    }

    static void init$0() {
        $$a = new byte[]{53, 97, -95, 41};
        $$b = 155;
    }
}
