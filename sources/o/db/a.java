package o.db;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.CharCompanionObject;
import o.a.m;
import o.en.f;
import o.m.i;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f22712a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f22713b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char[] f22714c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22715d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f22716e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22717f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f22718g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f22719i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f22720j = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r6, byte r7, int r8) {
        /*
            int r4 = r8 * 2
            int r3 = 1 - r4
            int r0 = r6 + 67
            int r1 = r7 * 4
            int r2 = 3 - r1
            byte[] r8 = o.db.a.$$a
            byte[] r7 = new byte[r3]
            r6 = 0
            int r5 = 0 - r4
            if (r8 != 0) goto L2c
            r3 = r5
            r4 = r6
        L15:
            int r0 = -r0
            int r0 = r0 + r3
            r3 = r4
        L18:
            byte r1 = (byte) r0
            r7[r3] = r1
            int r4 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r7, r6)
            return r0
        L25:
            int r2 = r2 + 1
            r1 = r8[r2]
            r3 = r0
            r0 = r1
            goto L15
        L2c:
            r3 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.db.a.$$c(byte, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22718g = 0;
        f22720j = 1;
        f22717f = 0;
        f22719i = 1;
        b();
        int i2 = f22720j + 93;
        f22718g = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static i[] a(o.ef.a aVar, String str) throws o.ef.b {
        int i2 = 2 % 2;
        int i3 = f22719i + 21;
        f22717f = i3 % 128;
        if (i3 % 2 != 0) {
            i[] iVarArr = new i[1];
            if (!aVar.C(str)) {
                return iVarArr;
            }
        } else {
            i[] iVarArr2 = new i[0];
            if (!aVar.C(str)) {
                return iVarArr2;
            }
        }
        int i4 = f22719i + 35;
        f22717f = i4 % 128;
        if (i4 % 2 == 0) {
            return (i[]) aVar.d(i.class, str);
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int[], java.lang.String] */
    public static o.fm.d b(o.ef.c cVar, Collection<i> collection) throws f {
        int i2;
        String str;
        i[] iVarArrB;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = 0;
        int i6 = 1;
        Object[] objArr = new Object[1];
        h("\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000", new int[]{19, 28, 0, 0}, true, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i7 = o.ef.c.f23799b * 1567746851;
        o.ef.c.f23799b = i7;
        int i8 = o.ef.c.f23798a * 1136425123;
        o.ef.c.f23798a = i8;
        int i9 = -1513293186;
        int i10 = 1513293186;
        ArrayList arrayList = new ArrayList(((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i8, i7, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar})).intValue());
        Object[] objArr2 = new Object[1];
        ?? r3 = 0;
        k(127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), null, null, "\u0088\u0087\u0085\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
        int i11 = 10;
        Object[] objArr3 = new Object[1];
        h("\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{0, 10, 23, 0}, false, objArr3);
        Object[] objArr4 = new Object[1];
        h("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000", new int[]{10, 9, 101, 0}, true, objArr4);
        String[] strArr = {((String) objArr2[0]).intern(), ((String) objArr3[0]).intern(), ((String) objArr4[0]).intern()};
        int i12 = f22719i + 111;
        f22717f = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 2 / 2;
        }
        boolean z2 = false;
        while (true) {
            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            int i14 = o.ef.c.f23799b * 1567746851;
            o.ef.c.f23799b = i14;
            int i15 = o.ef.c.f23798a * 1136425123;
            o.ef.c.f23798a = i15;
            if (i5 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i15, i14, i9, elapsedCpuTime2, i10, new Object[]{cVar})).intValue()) {
                return new o.fm.d(arrayList);
            }
            int i16 = f22719i + 25;
            f22717f = i16 % 128;
            if (i16 % i3 != 0) {
                o.ea.f.a();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (o.ea.f.a()) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr5 = new Object[i6];
                k(127 - ExpandableListView.getPackedPositionType(0L), r3, r3, "\u0098\u0092\u0097\u0087\u008a\u008e\u0096\u0092\u0095\u008e\u0082\u008a\u0089\u0087\u0094\u0092\u0093\u0092\u0084\u008e\u0083\u0087\u0085\u0085\u0089\u0091\u008e\u0090\u0082\u0085\u0089\u008f\u0082\u0085\u008e\u0087\u008d\u0085\u008c\u008b\u008a\u0089\u0087\u0083", objArr5);
                i2 = 0;
                StringBuilder sbAppend = sb.append(((String) objArr5[0]).intern()).append(i5);
                Object[] objArr6 = new Object[i6];
                k(127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), r3, r3, "\u0098", objArr6);
                o.ea.f.c(strIntern, sbAppend.append(((String) objArr6[0]).intern()).toString());
            } else {
                i2 = 0;
            }
            try {
                o.ef.a aVarD = cVar.d(i5);
                Object[] objArr7 = new Object[i6];
                k(127 - TextUtils.getCapsMode("", i2, i2), r3, r3, "\u0087\u0099\u0089\u008e", objArr7);
                if (!aVarD.C(((String) objArr7[i2]).intern())) {
                    Object[] objArr8 = new Object[1];
                    k(126 - TextUtils.lastIndexOf("", '0'), null, null, "\u0087\u008c\u009b\u0089\u009a\u0092\u0087\u0099\u0089\u008e\u0092\u0095\u008e\u0082\u0084\u0084\u0082\u0099", objArr8);
                    throw new f(((String) objArr8[0]).intern());
                }
                Object[] objArr9 = new Object[i6];
                k(TextUtils.indexOf("", "", i2) + 127, r3, r3, "\u0087\u0099\u0089\u008e", objArr9);
                Object[] objArr10 = {aVarD, ((String) objArr9[i2]).intern()};
                int i17 = o.ef.a.f23782p * (-1576737484);
                o.ef.a.f23782p = i17;
                String str2 = (String) o.ef.a.a(-781664457, objArr10, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i17, Thread.currentThread().getPriority());
                if (o.ea.f.a()) {
                    StringBuilder sb2 = new StringBuilder();
                    Object[] objArr11 = new Object[i6];
                    k((ViewConfiguration.getScrollBarSize() >> 8) + 127, r3, r3, "\u0098\u0092\u0097\u0087\u008a\u008e\u0096\u0092\u0095\u008e\u0082\u008a\u0089\u0087\u0094\u0092\u0093\u0092\u0084\u008e\u0083\u0087\u0085\u0085\u0089\u0091\u008e\u0090\u0082\u0085\u0089\u008f\u0082\u0085\u008e\u0087\u008d\u0085\u008c\u008b\u008a\u0089\u0087\u0083", objArr11);
                    StringBuilder sbAppend2 = sb2.append(((String) objArr11[0]).intern()).append(i5);
                    Object[] objArr12 = new Object[i6];
                    h("\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000", new int[]{47, i11, 18, 0}, false, objArr12);
                    o.ea.f.c(strIntern, sbAppend2.append(((String) objArr12[0]).intern()).append(str2).toString());
                    int i18 = f22719i + 75;
                    f22717f = i18 % 128;
                    int i19 = i18 % 2;
                }
                int i20 = 3;
                i[][] iVarArr = new i[3][];
                String str3 = null;
                int i21 = 0;
                int i22 = 0;
                while (true) {
                    if (i21 >= i20) {
                        break;
                    }
                    int i23 = f22717f + 61;
                    f22719i = i23 % 128;
                    if (i23 % 2 == 0) {
                        str = strArr[i21];
                        int i24 = 5 / 0;
                        if (o.ea.f.a()) {
                            StringBuilder sb3 = new StringBuilder();
                            Object[] objArr13 = new Object[1];
                            h("\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{57, 36, 0, 0}, true, objArr13);
                            StringBuilder sbAppend3 = sb3.append(((String) objArr13[0]).intern()).append(i5);
                            Object[] objArr14 = new Object[1];
                            h("\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{93, 10, 106, 4}, false, objArr14);
                            StringBuilder sbAppend4 = sbAppend3.append(((String) objArr14[0]).intern()).append(str);
                            Object[] objArr15 = new Object[1];
                            k(127 - (ViewConfiguration.getLongPressTimeout() >> 16), null, null, "\u0098", objArr15);
                            o.ea.f.c(strIntern, sbAppend4.append(((String) objArr15[0]).intern()).toString());
                        }
                    } else {
                        str = strArr[i21];
                        if (o.ea.f.a()) {
                            StringBuilder sb32 = new StringBuilder();
                            Object[] objArr132 = new Object[1];
                            h("\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{57, 36, 0, 0}, true, objArr132);
                            StringBuilder sbAppend32 = sb32.append(((String) objArr132[0]).intern()).append(i5);
                            Object[] objArr142 = new Object[1];
                            h("\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{93, 10, 106, 4}, false, objArr142);
                            StringBuilder sbAppend42 = sbAppend32.append(((String) objArr142[0]).intern()).append(str);
                            Object[] objArr152 = new Object[1];
                            k(127 - (ViewConfiguration.getLongPressTimeout() >> 16), null, null, "\u0098", objArr152);
                            o.ea.f.c(strIntern, sbAppend42.append(((String) objArr152[0]).intern()).toString());
                        }
                    }
                    i[] iVarArrA = a(aVarD, str);
                    if (iVarArrA.length == 0) {
                        if (o.ea.f.a()) {
                            StringBuilder sb4 = new StringBuilder();
                            Object[] objArr16 = new Object[1];
                            h("\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{57, 36, 0, 0}, true, objArr16);
                            StringBuilder sbAppend5 = sb4.append(((String) objArr16[0]).intern()).append(i5);
                            Object[] objArr17 = new Object[1];
                            h("\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{93, 10, 106, 4}, false, objArr17);
                            StringBuilder sbAppend6 = sbAppend5.append(((String) objArr17[0]).intern()).append(str);
                            Object[] objArr18 = new Object[1];
                            h("\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001", new int[]{103, 19, 154, 13}, false, objArr18);
                            o.ea.f.c(strIntern, sbAppend6.append(((String) objArr18[0]).intern()).toString());
                        }
                        str3 = str;
                        iVarArrB = null;
                        i11 = 10;
                    } else {
                        if (str3 != null) {
                            Object[] objArr19 = new Object[1];
                            k((ViewConfiguration.getTouchSlop() >> 8) + 127, null, null, "\u0095\u008e\u0082\u0084\u0084\u0082\u0099\u0092\u0084\u0082\u0092\u0098\u0084\u009d\u0098\u0092\u0085\u008c\u009e\u0092\u0085\u008e\u0087\u0084\u0087\u0083\u0088\u0092\u0084\u0082\u0092\u0098\u0084\u009d\u0098\u0092\u0087\u008d\u009c", objArr19);
                            throw new f(String.format(((String) objArr19[0]).intern(), str, str3));
                        }
                        iVarArrB = b(iVarArrA, collection);
                        if (iVarArrB.length == 0) {
                            if (o.ea.f.a()) {
                                StringBuilder sb5 = new StringBuilder();
                                Object[] objArr20 = new Object[1];
                                h("\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{57, 36, 0, 0}, true, objArr20);
                                StringBuilder sbAppend7 = sb5.append(((String) objArr20[0]).intern()).append(i5);
                                i11 = 10;
                                Object[] objArr21 = new Object[1];
                                h("\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{93, 10, 106, 4}, false, objArr21);
                                StringBuilder sbAppend8 = sbAppend7.append(((String) objArr21[0]).intern()).append(str);
                                Object[] objArr22 = new Object[1];
                                h("\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000", new int[]{122, 39, 45, 21}, false, objArr22);
                                o.ea.f.c(strIntern, sbAppend8.append(((String) objArr22[0]).intern()).toString());
                            } else {
                                i11 = 10;
                            }
                            z2 = true;
                        } else {
                            i11 = 10;
                            str3 = null;
                        }
                    }
                    if (iVarArrB != null) {
                        int i25 = f22719i + 41;
                        f22717f = i25 % 128;
                        int i26 = i25 % 2;
                        int i27 = i22 + 1;
                        iVarArr[i22] = iVarArrB;
                        i22 = i27;
                    }
                    i21++;
                    i20 = 3;
                }
                if (z2) {
                    int i28 = f22717f + 73;
                    f22719i = i28 % 128;
                    i3 = 2;
                    int i29 = i28 % 2;
                    z2 = false;
                } else {
                    i3 = 2;
                    arrayList.add(new o.p.b(str2, (i[][]) Arrays.copyOf(iVarArr, i22)));
                }
                i5++;
                i6 = 1;
                r3 = 0;
                i9 = -1513293186;
                i10 = 1513293186;
            } catch (o.ef.b e2) {
                StringBuilder sb6 = new StringBuilder();
                Object[] objArr23 = new Object[1];
                h("\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{161, 69, 91, 0}, true, objArr23);
                throw new f(sb6.append(((String) objArr23[0]).intern()).append(e2.getMessage()).toString());
            }
        }
    }

    static void b() {
        f22714c = new char[]{2124, 2123, 2096, 2097, 2110, 2129, 2127, 2098, 2115, 2126, 2147, 2111, 2122, 2100, 2113, 2101, 2130, 2434, 2167, 2128, 2125, 2155, 2106, 2114, 2103, 2108, 2102, 2142, 2447, 2112};
        f22715d = 2040400290;
        f22712a = true;
        f22716e = true;
        f22713b = new char[]{56517, 56323, 56571, CharCompanionObject.MIN_LOW_SURROGATE, 56325, CharCompanionObject.MIN_LOW_SURROGATE, 56562, 56570, 56323, 56321, 56554, 56399, 56401, 56392, 56384, 56400, 56402, 56397, 56403, 56505, 56555, 56548, 56546, 56547, 56539, 56546, 56560, 56560, 56555, 56556, 56564, 56554, 56536, 56543, 56558, 56556, 56558, 56554, 56546, 56550, 56558, 56561, 56553, 56550, 56558, 56564, 56539, 56505, 56530, 56504, 56504, 56521, 56553, 56569, 56571, 56545, 56511, 56496, 56512, 56524, 56558, 56548, 56553, 56539, 56500, 56486, 56486, 56521, 56560, 56560, 56555, 56556, 56564, 56554, 56536, 56543, 56558, 56556, 56558, 56554, 56546, 56550, 56558, 56561, 56553, 56550, 56558, 56564, 56539, 56530, 56546, 56547, 56555, 56551, 56404, 56370, 56362, 56394, 56362, 56336, 56336, 56355, 56397, 56324, 56715, 56714, 56710, 56416, 56417, 56714, 56419, 56412, 56707, 56712, 56716, 56720, 56710, 56410, 56378, 56398, 56440, 56419, 56521, 56337, 56559, 56531, 56531, 56566, 56348, 56343, 56345, 56349, 56345, 56344, 56343, 56560, 56565, 56341, 56343, 56353, 56345, 56344, 56349, 56340, 56557, 56561, 56347, 56566, 56564, 56347, 56350, 56567, 56567, 56350, 56349, 56353, 56351, 56349, 56348, 56349, 56352, 56509, 56328, 56328, 56356, 56395, 56395, 56390, 56391, 56399, 56389, 56371, 56378, 56393, 56391, 56393, 56389, 56381, 56385, 56393, 56396, 56388, 56385, 56393, 56399, 56374, 56331, 56350, 56389, 56390, 56393, 56398, 56391, 56383, 56388, 56395, 56396, 56355, 56349, 56387, 56389, 56387, 56394, 56358, 56349, 56383, 56390, 56390, 56391, 56396, 56396, 56397, 56388, 56387, 56388, 56349, 56354, 56393, 56391, 56393, 56397, 56389, 56383, 56392, 56377, 56333, 56354, 56393, 56396, 56377};
    }

    private static i[] b(i[] iVarArr, Collection<i> collection) {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i3 = f22719i + 35;
        f22717f = i3 % 128;
        int i4 = i3 % 2;
        for (i iVar : iVarArr) {
            if (!(!collection.contains(iVar))) {
                int i5 = f22719i + 21;
                f22717f = i5 % 128;
                if (i5 % 2 != 0) {
                    arrayList.add(iVar);
                    throw null;
                }
                arrayList.add(iVar);
                int i6 = f22719i + 113;
                f22717f = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return (i[]) arrayList.toArray(new i[0]);
    }

    private static void h(String str, int[] iArr, boolean z2, Object[] objArr) throws Throwable {
        int i2;
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        int i5 = $11 + 105;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        m mVar = new m();
        int i7 = 0;
        int i8 = iArr[0];
        int i9 = iArr[1];
        int i10 = iArr[2];
        int i11 = iArr[3];
        char[] cArr = f22713b;
        long j2 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i12 = 0;
            while (i12 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i12])};
                    Object objA = o.d.d.a(-2071388435);
                    if (objA == null) {
                        byte b2 = (byte) i7;
                        objA = o.d.d.a((SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1)) + 248, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.MeasureSpec.makeMeasureSpec(i7, i7) + 11, 1376582792, false, $$c((byte) 49, b2, b2), new Class[]{Integer.TYPE});
                    }
                    cArr2[i12] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i12++;
                    i7 = 0;
                    j2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i9];
        System.arraycopy(cArr, i8, cArr3, 0, i9);
        if (bArr != null) {
            char[] cArr4 = new char[i9];
            mVar.f19943d = 0;
            char c2 = 0;
            while (mVar.f19943d < i9) {
                if (bArr[mVar.f19943d] == 1) {
                    int i13 = mVar.f19943d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(120026474);
                    if (objA2 == null) {
                        objA2 = o.d.d.a(11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ExpandableListView.getPackedPositionType(0L), 10 - Color.blue(0), -777873649, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = mVar.f19943d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[mVar.f19943d]), Integer.valueOf(c2)};
                    Object objA3 = o.d.d.a(1632715197);
                    if (objA3 == null) {
                        byte b3 = (byte) 0;
                        objA3 = o.d.d.a(View.combineMeasuredStates(0, 0) + 836, (char) (27280 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) + 11, -1210801192, false, $$c((byte) 53, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objA3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[mVar.f19943d];
                Object[] objArr5 = {mVar, mVar};
                Object objA4 = o.d.d.a(-1041906996);
                if (objA4 == null) {
                    objA4 = o.d.d.a(View.MeasureSpec.makeMeasureSpec(0, 0) + 21, (char) (35715 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, 392175785, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i11 > 0) {
            int i15 = $10 + 55;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                char[] cArr5 = new char[i9];
                System.arraycopy(cArr3, 1, cArr5, 1, i9);
                i2 = 0;
                System.arraycopy(cArr5, 0, cArr3, i9 * i11, i11);
                System.arraycopy(cArr5, i11, cArr3, 0, i9 << i11);
            } else {
                i2 = 0;
                char[] cArr6 = new char[i9];
                System.arraycopy(cArr3, 0, cArr6, 0, i9);
                int i16 = i9 - i11;
                System.arraycopy(cArr6, 0, cArr3, i16, i11);
                System.arraycopy(cArr6, i11, cArr3, 0, i16);
            }
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr7 = new char[i9];
            mVar.f19943d = i2;
            while (mVar.f19943d < i9) {
                int i17 = $11 + 85;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    cArr7[mVar.f19943d] = cArr3[(mVar.f19943d + i9) >>> 1];
                    i3 = mVar.f19943d;
                } else {
                    cArr7[mVar.f19943d] = cArr3[(i9 - mVar.f19943d) - 1];
                    i3 = mVar.f19943d + 1;
                }
                mVar.f19943d = i3;
            }
            cArr3 = cArr7;
        }
        if (i10 > 0) {
            int i18 = $10 + 19;
            $11 = i18 % 128;
            int i19 = i18 % 2 == 0 ? 1 : 0;
            while (true) {
                mVar.f19943d = i19;
                if (mVar.f19943d >= i9) {
                    break;
                }
                int i20 = $11 + 33;
                $10 = i20 % 128;
                if (i20 % 2 != 0) {
                    cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] * iArr[3]);
                    i19 = mVar.f19943d << 1;
                } else {
                    cArr3[mVar.f19943d] = (char) (cArr3[mVar.f19943d] - iArr[2]);
                    i19 = mVar.f19943d + 1;
                }
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void init$0() {
        $$a = new byte[]{120, 70, -13, MessagePack.Code.FIXEXT4};
        $$b = 170;
    }

    private static void k(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        String str3 = str;
        String str4 = str2;
        int i3 = 2 % 2;
        int i4 = $11 + 115;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object obj = str3;
        if (str3 != null) {
            char[] charArray = str3.toCharArray();
            int i6 = $10 + 49;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            obj = charArray;
        }
        char[] cArr = (char[]) obj;
        o.a.f fVar = new o.a.f();
        char[] cArr2 = f22714c;
        int i8 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        int iKeyCodeFromString = 593 - KeyEvent.keyCodeFromString("");
                        char minimumFlingVelocity = (char) (13181 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(i8) + 11;
                        byte b2 = (byte) i8;
                        byte b3 = b2;
                        objA = o.d.d.a(iKeyCodeFromString, minimumFlingVelocity, iNormalizeMetaState, -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i9++;
                    i8 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f22715d)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a(Color.green(0) + 32, (char) View.resolveSize(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        int i10 = 1540807955;
        if (f22716e) {
            fVar.f19923e = bArr.length;
            char[] cArr4 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(ImageFormat.getBitsPerPixel(0) + 459, (char) Color.argb(0, 0, 0, 0), 11 - (Process.myTid() >> 22), -1923924106, false, $$c((byte) 6, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        int i11 = 0;
        if (f22712a) {
            fVar.f19923e = cArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                Object[] objArr5 = {fVar, fVar};
                Object objA4 = o.d.d.a(i10);
                if (objA4 == null) {
                    byte b5 = (byte) 0;
                    objA4 = o.d.d.a(TextUtils.getTrimmedLength("") + 458, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 11 - ((Process.getThreadPriority(0) + 20) >> 6), -1923924106, false, $$c((byte) 6, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
                i10 = 1540807955;
            }
            String str5 = new String(cArr5);
            int i12 = $10 + 101;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            objArr[0] = str5;
            return;
        }
        fVar.f19923e = iArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        while (true) {
            fVar.f19922a = i11;
            if (fVar.f19922a >= fVar.f19923e) {
                objArr[0] = new String(cArr6);
                return;
            } else {
                cArr6[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                i11 = fVar.f19922a + 1;
            }
        }
    }
}
