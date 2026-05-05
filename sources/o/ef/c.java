package o.ef;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import o.a.l;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f23798a = 0;

    /* JADX INFO: renamed from: b */
    public static int f23799b = 0;

    /* JADX INFO: renamed from: c */
    public static int f23800c = 0;

    /* JADX INFO: renamed from: e */
    public static int f23801e = 0;

    /* JADX INFO: renamed from: f */
    private static int f23802f = 0;

    /* JADX INFO: renamed from: g */
    private static char f23803g = 0;

    /* JADX INFO: renamed from: h */
    private static int f23804h = 0;

    /* JADX INFO: renamed from: i */
    private static long f23805i = 0;

    /* JADX INFO: renamed from: j */
    private static int[] f23806j = null;

    /* JADX INFO: renamed from: n */
    private static int f23807n = 0;

    /* JADX INFO: renamed from: d */
    private final List<Object> f23808d;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, short r10, int r11) {
        /*
            int r8 = 122 - r11
            byte[] r7 = o.ef.c.$$a
            int r2 = r9 * 4
            int r1 = 1 - r2
            int r0 = r10 * 3
            int r6 = 3 - r0
            byte[] r5 = new byte[r1]
            r4 = 0
            int r3 = 0 - r2
            if (r7 != 0) goto L2c
            r0 = r8
            r2 = r4
            r1 = r6
        L16:
            int r6 = r6 + r0
            r8 = r6
            r6 = r1
        L19:
            int r1 = r6 + 1
            byte r0 = (byte) r8
            r5[r2] = r0
            if (r2 != r3) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L26:
            int r2 = r2 + 1
            r0 = r7[r1]
            r6 = r8
            goto L16
        L2c:
            r2 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ef.c.$$c(short, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23801e = -449264555;
        f23800c = -1945417802;
        f23798a = -1780882426;
        f23799b = 358747544;
        f23804h = 0;
        f23807n = 1;
        f23806j = new int[]{-34365371, -1033465432, -1326103959, -506451207, -1423506971, 1028132252, -153189775, -2019737019, 612058038, 1112851414, -1539788955, 1679219062, 1370547803, -1929416950, 1445008747, -1917135088, -32564888, 1621648114};
        f23805i = 7573126326937409489L;
        f23802f = 1564493270;
        f23803g = (char) 17878;
    }

    public c() {
        this.f23808d = new ArrayList();
    }

    public c(Object obj) throws Throwable {
        if (!obj.getClass().isArray()) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            l((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), "⒳恲\ue411筳犋敨쥓⽮냖슨\uf8a5\ue4c0트碿☎㦕옦⼯퀫᷅⪣욙誾", "ሇ焃Ϧ捞", "絶ᕵ\ue26dゎ", TextUtils.getOffsetAfter("", 0) + 1830122877, objArr);
            throw new b(sb.append(((String) objArr[0]).intern()).append(obj.getClass()).toString());
        }
        int length = Array.getLength(obj);
        this.f23808d = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            a(a.b(Array.get(obj, i2)));
        }
    }

    public c(String str) throws b {
        this(new j(str));
    }

    public c(Collection<?> collection) {
        this();
        if (collection != null) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                a(a.b(it.next()));
            }
        }
    }

    public c(List<?> list) {
        this.f23808d = new ArrayList(list);
    }

    private c(j jVar) throws Throwable {
        Object objC = jVar.c();
        if (objC instanceof c) {
            this.f23808d = ((c) objC).f23808d;
            return;
        }
        Object[] objArr = new Object[1];
        k(new int[]{1097297935, -449638551, 899871235, 1542880898, -792446038, 657020234}, Color.green(0) + 9, objArr);
        throw d.d(objC, ((String) objArr[0]).intern());
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23807n + 7;
        f23804h = i3 % 128;
        int i4 = i3 % 2;
        int size = cVar.f23808d.size();
        if (i4 != 0) {
            int i5 = 84 / 0;
        }
        int i6 = f23807n + 79;
        f23804h = i6 % 128;
        int i7 = i6 % 2;
        return Integer.valueOf(size);
    }

    public static /* synthetic */ Object b(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~i7;
        int i9 = ~i6;
        int i10 = (~((i8 + i9) - (i8 & i9))) | i5;
        int i11 = ~i5;
        int i12 = i9 | i5;
        int i13 = (-1) - (((-1) - (~((i11 + i7) - (i11 & i7)))) & ((-1) - (~i12)));
        int i14 = (-1) - (((-1) - (~(i6 | (i8 | i5)))) & ((-1) - (~((i12 + i7) - (i12 & i7)))));
        int i15 = i5 + i7 + i4 + (528639218 * i3) + ((-532493036) * i2);
        int i16 = i15 * i15;
        int i17 = ((i5 * 873666089) - 1460666368) + (873666089 * i7) + ((-875965520) * i10) + (437982760 * i13) + ((-437982760) * i14) + (435683328 * i4) + (1819279360 * i3) + ((-1621098496) * i2) + (586088448 * i16);
        int i18 = (i5 * (-1573143961)) + 2078511484 + (i7 * (-1573143961)) + (i10 * 1872) + (i13 * (-936)) + (i14 * 936) + (i4 * (-1573143025)) + (i3 * 123045422) + (i2 * (-1548035028)) + (i16 * 1845559296);
        return i17 + ((i18 * i18) * 1848705024) != 1 ? a(objArr) : c(objArr);
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f23807n + 53;
        f23804h = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = cVar.f23808d.hashCode();
        if (i4 != 0) {
            int i5 = 5 / 0;
        }
        return Integer.valueOf(iHashCode);
    }

    static void init$0() {
        $$a = new byte[]{64, -9, -71, 106};
        $$b = 138;
    }

    private static void k(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f23806j;
        char c2 = '0';
        int i5 = 989264422;
        int i6 = 16;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 57;
                $10 = i8 % 128;
                if (i8 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objA = o.d.d.a(i5);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a(675 - (ViewConfiguration.getScrollBarFadeDuration() >> i6), (char) (TextUtils.lastIndexOf("", c2) + 1), 12 - (ViewConfiguration.getLongPressTimeout() >> 16), -328001469, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                        i7 /= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 674, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 12, -328001469, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i7++;
                }
                i3 = 2;
                c2 = '0';
                i5 = 989264422;
                i6 = 16;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f23806j;
        long j2 = 0;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i9])};
                Object objA3 = o.d.d.a(989264422);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(675 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 12, -328001469, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                i9++;
                j2 = 0;
            }
            iArr5 = iArr6;
        }
        char c3 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        lVar.f19941d = 0;
        while (lVar.f19941d < iArr.length) {
            cArr[c3] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                int i12 = $11 + 69;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                lVar.f19942e ^= iArr4[i10];
                Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                Object objA4 = o.d.d.a(2098218801);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a(301 - Gravity.getAbsoluteGravity(0, 0), (char) (52698 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ';' - AndroidCharacter.getMirror('0'), -1416256172, false, $$c(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = iIntValue;
                i10++;
                int i14 = $11 + 27;
                $10 = i14 % 128;
                int i15 = i14 % 2;
            }
            int i16 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i16;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i17 = lVar.f19942e;
            int i18 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr6 = {lVar, lVar};
            Object objA5 = o.d.d.a(986820978);
            if (objA5 == null) {
                byte b10 = (byte) 0;
                byte b11 = b10;
                objA5 = o.d.d.a((KeyEvent.getMaxKeyCode() >> 16) + 229, (char) (View.combineMeasuredStates(0, 0) + 51004), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 9, -330018025, false, $$c(b10, b11, (byte) (b11 + 5)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
            c3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(char r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ef.c.l(char, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001a, code lost:
    
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0025, code lost:
    
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
    
        r1 = o.ef.c.f23804h + 35;
        o.ef.c.f23807n = r1 % 128;
        r1 = r1 % 2;
        r3 = java.lang.Integer.valueOf(r7);
        r0 = new java.lang.Object[1];
        k(new int[]{2060139486, 1882043072}, 3 - (android.view.ViewConfiguration.getTapTimeout() >> 16), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        throw o.ef.d.c(r3, r4, ((java.lang.String) r0[0]).intern());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Integer a(int r7) throws java.lang.Throwable {
        /*
            r6 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = o.ef.c.f23804h
            int r1 = r0 + 101
            int r0 = r1 % 128
            o.ef.c.f23807n = r0
            int r1 = r1 % r2
            r5 = 0
            if (r1 != 0) goto L1d
            java.lang.Object r4 = r6.b(r7)
            java.lang.Integer r1 = o.ef.d.a(r4)
            r0 = 22
            int r0 = r0 / r5
            if (r1 == 0) goto L28
        L1c:
            return r1
        L1d:
            java.lang.Object r4 = r6.b(r7)
            java.lang.Integer r1 = o.ef.d.a(r4)
            if (r1 == 0) goto L28
            goto L1c
        L28:
            int r0 = o.ef.c.f23804h
            int r1 = r0 + 35
            int r0 = r1 % 128
            o.ef.c.f23807n = r0
            int r1 = r1 % r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r1 = 2060139486(0x7acb3bde, float:5.2762526E35)
            r0 = 1882043072(0x702db2c0, float:2.15028E29)
            int[] r2 = new int[]{r1, r0}
            int r0 = android.view.ViewConfiguration.getTapTimeout()
            int r0 = r0 >> 16
            int r1 = 3 - r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            k(r2, r1, r0)
            r0 = r0[r5]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ef.b r0 = o.ef.d.c(r3, r4, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ef.c.a(int):java.lang.Integer");
    }

    public final c a(Object obj) {
        int i2 = 2 % 2;
        int i3 = f23804h + 49;
        f23807n = i3 % 128;
        if (i3 % 2 == 0) {
            this.f23808d.add(obj);
            int i4 = 80 / 0;
        } else {
            this.f23808d.add(obj);
        }
        int i5 = f23807n + 93;
        f23804h = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
        return this;
    }

    final void a(e eVar) throws b {
        Iterator<Object> it;
        int i2 = 2 % 2;
        int i3 = f23807n + 93;
        f23804h = i3 % 128;
        if (i3 % 2 != 0) {
            eVar.e();
            it = this.f23808d.iterator();
            int i4 = 14 / 0;
        } else {
            eVar.e();
            it = this.f23808d.iterator();
        }
        while (it.hasNext()) {
            int i5 = f23804h + 11;
            f23807n = i5 % 128;
            if (i5 % 2 == 0) {
                eVar.c(it.next());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            eVar.c(it.next());
        }
        eVar.c();
        int i6 = f23804h + 43;
        f23807n = i6 % 128;
        int i7 = i6 % 2;
    }

    public final Object b(int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f23804h + 67;
        f23807n = i4 % 128;
        try {
            if (i4 % 2 == 0) {
                this.f23808d.get(i2);
                throw null;
            }
            Object obj = this.f23808d.get(i2);
            if (obj != null) {
                int i5 = f23807n + 9;
                f23804h = i5 % 128;
                int i6 = i5 % 2;
                return obj;
            }
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            k(new int[]{449558134, 1845204725, 268444237, -1459109761, 625379446, -2055341639}, ((Process.getThreadPriority(0) + 20) >> 6) + 9, objArr);
            StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(i2);
            Object[] objArr2 = new Object[1];
            l((char) KeyEvent.normalizeMetaState(0), "♦髠う愵ᄐ漖ᙰ\uf740\ue8aa", "ሇ焃Ϧ捞", "ⴑ᭧홣\uaa3e", 1662740269 - KeyEvent.normalizeMetaState(0), objArr2);
            throw new b(sbAppend.append(((String) objArr2[0]).intern()).toString());
        } catch (IndexOutOfBoundsException e2) {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr3 = new Object[1];
            l((char) (57244 - Gravity.getAbsoluteGravity(0, 0)), "簻య荬鞞懶뢅", "ሇ焃Ϧ捞", "罝쎯鱭\ue9df", Drawable.resolveOpacity(0, 0), objArr3);
            StringBuilder sbAppend2 = sb2.append(((String) objArr3[0]).intern()).append(i2);
            Object[] objArr4 = new Object[1];
            k(new int[]{1215365033, 299860503, -1857283497, -840216312, -1705753237, 720598921, -320589506, -1258829037, 129348310, -215132315}, TextUtils.lastIndexOf("", '0', 0) + 19, objArr4);
            StringBuilder sbAppend3 = sbAppend2.append(((String) objArr4[0]).intern()).append(this.f23808d.size());
            Object[] objArr5 = new Object[1];
            l((char) (TextUtils.indexOf((CharSequence) "", '0') + 54127), "雤", "ሇ焃Ϧ捞", "닼깞湦臓", KeyEvent.keyCodeFromString("") + 1722703538, objArr5);
            throw new b(sbAppend3.append(((String) objArr5[0]).intern()).toString(), e2);
        }
    }

    public final String b() {
        int i2 = 2 % 2;
        try {
            e eVar = new e();
            a(eVar);
            String strA = eVar.a();
            int i3 = f23804h + 105;
            f23807n = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 15 / 0;
            }
            return strA;
        } catch (b unused) {
            return "";
        }
    }

    public final c b(int i2, Object obj) throws b {
        int i3 = 2 % 2;
        while (this.f23808d.size() <= i2) {
            int i4 = f23804h + 3;
            f23807n = i4 % 128;
            if (i4 % 2 == 0) {
                this.f23808d.add(null);
                int i5 = 30 / 0;
            } else {
                this.f23808d.add(null);
            }
        }
        this.f23808d.set(i2, obj);
        int i6 = f23804h + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f23807n = i6 % 128;
        int i7 = i6 % 2;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001c, code lost:
    
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0027, code lost:
    
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:
    
        r1 = o.ef.c.f23804h + 7;
        o.ef.c.f23807n = r1 % 128;
        r1 = r1 % 2;
        r4 = java.lang.Integer.valueOf(r16);
        r14 = new java.lang.Object[1];
        l((char) (3378 - android.graphics.Color.blue(0)), "睵\ueee0\uec83꽼", "ሇ焃Ϧ捞", "桊锵㈭괍", 1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)), r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        throw o.ef.d.c(r4, r5, ((java.lang.String) r14[0]).intern());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Long c(int r16) throws java.lang.Throwable {
        /*
            r15 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = o.ef.c.f23804h
            int r1 = r0 + 5
            int r0 = r1 % 128
            o.ef.c.f23807n = r0
            int r1 = r1 % r2
            r8 = 0
            r3 = r16
            if (r1 != 0) goto L1f
            java.lang.Object r5 = r15.b(r3)
            java.lang.Long r1 = o.ef.d.c(r5)
            r0 = 71
            int r0 = r0 / r8
            if (r1 == 0) goto L2a
        L1e:
            return r1
        L1f:
            java.lang.Object r5 = r15.b(r3)
            java.lang.Long r1 = o.ef.d.c(r5)
            if (r1 == 0) goto L2a
            goto L1e
        L2a:
            int r0 = o.ef.c.f23804h
            int r1 = r0 + 7
            int r0 = r1 % 128
            o.ef.c.f23807n = r0
            int r1 = r1 % r2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            int r0 = android.graphics.Color.blue(r8)
            int r0 = 3378 - r0
            char r9 = (char) r0
            long r6 = android.os.SystemClock.currentThreadTimeMillis()
            r2 = -1
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r0 = 1
            int r13 = 1 - r1
            java.lang.Object[] r14 = new java.lang.Object[r0]
            java.lang.String r10 = "睵\ueee0\uec83꽼"
            java.lang.String r11 = "ሇ焃Ϧ捞"
            java.lang.String r12 = "桊锵㈭괍"
            l(r9, r10, r11, r12, r13, r14)
            r0 = r14[r8]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ef.b r0 = o.ef.d.c(r4, r5, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ef.c.c(int):java.lang.Long");
    }

    public final int d() {
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i2 = f23799b * 1567746851;
        f23799b = i2;
        int i3 = 1136425123 * f23798a;
        f23798a = i3;
        return ((Integer) b((int) Runtime.getRuntime().maxMemory(), i3, i2, -1513293186, elapsedCpuTime, 1513293186, new Object[]{this})).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0017, code lost:
    
        if ((r4 instanceof o.ef.a) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0019, code lost:
    
        r1 = o.ef.c.f23807n + 47;
        o.ef.c.f23804h = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0022, code lost:
    
        if ((r1 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0024, code lost:
    
        r0 = 56 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0029, code lost:
    
        return (o.ef.a) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0033, code lost:
    
        if ((r4 instanceof o.ef.a) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0036, code lost:
    
        r3 = java.lang.Integer.valueOf(r15);
        r13 = new java.lang.Object[1];
        l((char) android.text.TextUtils.indexOf("", ""), "陶ʔ㝷䁬ᾡ鰫둈\uf065뚵瓚", "ሇ焃Ϧ捞", "沙잛陒勠", (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) - 1, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        throw o.ef.d.c(r3, r4, ((java.lang.String) r13[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return (o.ef.a) r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.ef.a d(int r15) throws java.lang.Throwable {
        /*
            r14 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = o.ef.c.f23807n
            int r1 = r0 + 15
            int r0 = r1 % 128
            o.ef.c.f23804h = r0
            int r1 = r1 % r2
            r7 = 0
            if (r1 == 0) goto L2d
            java.lang.Object r4 = r14.b(r15)
            boolean r1 = r4 instanceof o.ef.a
            r0 = 2
            int r0 = r0 / r7
            if (r1 == 0) goto L36
        L19:
            int r0 = o.ef.c.f23807n
            int r1 = r0 + 47
            int r0 = r1 % 128
            o.ef.c.f23804h = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L2a
            o.ef.a r4 = (o.ef.a) r4
            r0 = 56
            int r0 = r0 / r7
        L29:
            return r4
        L2a:
            o.ef.a r4 = (o.ef.a) r4
            goto L29
        L2d:
            java.lang.Object r4 = r14.b(r15)
            boolean r0 = r4 instanceof o.ef.a
            if (r0 == 0) goto L36
            goto L19
        L36:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            java.lang.String r0 = ""
            int r0 = android.text.TextUtils.indexOf(r0, r0)
            char r8 = (char) r0
            long r5 = android.os.SystemClock.uptimeMillis()
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            int r12 = r0 + (-1)
            r0 = 1
            java.lang.Object[] r13 = new java.lang.Object[r0]
            java.lang.String r9 = "陶ʔ㝷䁬ᾡ鰫둈\uf065뚵瓚"
            java.lang.String r10 = "ሇ焃Ϧ捞"
            java.lang.String r11 = "沙잛陒勠"
            l(r8, r9, r10, r11, r12, r13)
            r0 = r13[r7]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            o.ef.b r0 = o.ef.d.c(r3, r4, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ef.c.d(int):o.ef.a");
    }

    public final String e(int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = f23807n + 117;
        f23804h = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            d.f(b(i2));
            throw null;
        }
        Object objB = b(i2);
        String strF = d.f(objB);
        if (strF == null) {
            Integer numValueOf = Integer.valueOf(i2);
            Object[] objArr = new Object[1];
            k(new int[]{-1770788511, 513424776, -70400568, 1656148391}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 7, objArr);
            throw d.c(numValueOf, objB, ((String) objArr[0]).intern());
        }
        int i5 = f23807n + 31;
        f23804h = i5 % 128;
        if (i5 % 2 == 0) {
            return strF;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f23807n + 53;
        f23804h = i3 % 128;
        int i4 = i3 % 2;
        if (!(obj instanceof c) || !((c) obj).f23808d.equals(this.f23808d)) {
            return false;
        }
        int i5 = f23807n + 71;
        f23804h = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final int hashCode() {
        int i2 = f23800c * 243416390;
        f23800c = i2;
        int iNextInt = new Random().nextInt();
        int i3 = 276998065 * f23801e;
        f23801e = i3;
        return ((Integer) b(new Random().nextInt(645430631), i3, iNextInt, -958452954, i2, 958452955, new Object[]{this})).intValue();
    }
}
