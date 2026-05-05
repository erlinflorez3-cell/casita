package o.df;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.a.l;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f22948a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int[] f22949b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f22950c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22951d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f22952e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f22953f = 0;

    private static String $$c(short s2, short s3, short s4) {
        int i2 = 121 - s3;
        int i3 = s2 * 4;
        int i4 = 3 - (s4 * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 = i5 + i2;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            i4++;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i4];
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f22948a = 0;
        f22953f = 1;
        f22952e = 0;
        f22951d = 1;
        c();
        ViewConfiguration.getMaximumFlingVelocity();
        int i2 = f22948a + 91;
        f22953f = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        r13 = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        if (o.ea.f.a() == true) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        r2 = new java.lang.Object[1];
        g(new int[]{-1364317391, 1155558956, -358345286, 890462765, -491700935, -22738814, 1263532375, -710843470, 606646316, 767931288}, 18 - android.view.KeyEvent.keyCodeFromString(""), r2);
        r15 = new java.lang.Object[]{r31, ((java.lang.String) r2[0]).intern()};
        r5 = (int) android.os.SystemClock.uptimeMillis();
        r4 = (int) android.os.SystemClock.elapsedRealtime();
        r16 = android.os.Process.myUid();
        r17 = o.ef.a.f23780n * (-1229108307);
        o.ef.a.f23780n = r17;
        r18 = 1398121917;
        r8 = (o.ef.c) o.ef.a.a(-1398121910, r15, r16, r17, 1398121917, r5, r4);
        new o.df.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b9, code lost:
    
        r2 = new java.lang.Object[1];
        g(new int[]{-1885390481, -1739620054, -358345286, 890462765, -491700935, -22738814, 1263532375, -710843470, -492714972, 779828285, -252030610, 446384855}, 24 - android.widget.ExpandableListView.getPackedPositionGroup(0), r2);
        r7 = ((java.lang.String) r2[0]).intern();
        r2 = new java.lang.Object[1];
        h("璾濰䈟⚣᧼ﰃ킻쯍깷芌旕填㲉ᜦ\u0a7c\ueeb3섵ꑖ飺猸噊䫸ⵊ\u001e\ue4b4\udf0f뎣雎褔涰䃌㭬ῌ\uf2db핻즐걨蝥箈帢ㅊᗾ࠷\ue35c쟴먀鵝燵呜䢭⏇\u0604窱\uddce끸钪", android.view.KeyEvent.normalizeMetaState(0) + com.drew.metadata.photoshop.PhotoshopDirectory.TAG_IMAGE_READY_DATA_SETS, r2);
        o.ea.f.c(r7, ((java.lang.String) r2[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ec, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ed, code lost:
    
        r4 = (int) android.os.Process.getElapsedCpuTime();
        r21 = o.ef.c.f23799b * 1567746851;
        o.ef.c.f23799b = r21;
        r20 = o.ef.c.f23798a * 1136425123;
        o.ef.c.f23798a = r20;
        r22 = -1513293186;
        r24 = 1513293186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0125, code lost:
    
        if (r7 >= ((java.lang.Integer) o.ef.c.b((int) java.lang.Runtime.getRuntime().maxMemory(), r20, r21, -1513293186, r4, 1513293186, new java.lang.Object[]{r8})).intValue()) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0127, code lost:
    
        r3 = o.df.e.f22951d + 115;
        o.df.e.f22952e = r3 % 128;
        r3 = r3 % r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0130, code lost:
    
        r2 = r8.d(r7);
        r3 = new java.lang.Object[r1];
        g(new int[]{526325958, 256434593, -1987699403, 2044404346, 780956952, -633278278, -111476026, 1107789330}, 16 - android.view.View.MeasureSpec.getMode(r0), r3);
        r26 = new java.lang.Object[]{r2, ((java.lang.String) r3[r0]).intern()};
        r30 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = r30;
        r3 = (java.lang.String) o.ef.a.a(-781664457, r26, java.lang.Thread.activeCount(), (int) android.os.SystemClock.elapsedRealtime(), 781664467, r30, java.lang.Thread.currentThread().getPriority());
        r4 = new java.lang.Object[r1];
        h("璸ꂑ\udcf3\u082f␃偆趵맱헝Ą㵴檏蚗닝\uee33ᩬ㙈", 54320 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), r4);
        r26 = new java.lang.Object[]{r2, ((java.lang.String) r4[r0]).intern()};
        r30 = o.ef.a.f23782p * (-1576737484);
        o.ef.a.f23782p = r30;
        r12 = (java.lang.String) o.ef.a.a(-781664457, r26, java.lang.Thread.activeCount(), (int) android.os.SystemClock.elapsedRealtime(), 781664467, r30, java.lang.Thread.currentThread().getPriority());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01bf, code lost:
    
        if (o.ea.f.a() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01c1, code lost:
    
        r4 = new java.lang.Object[r1];
        g(new int[]{-1885390481, -1739620054, -358345286, 890462765, -491700935, -22738814, 1263532375, -710843470, -492714972, 779828285, -252030610, 446384855}, 24 - (android.view.KeyEvent.getMaxKeyCode() >> 16), r4);
        r11 = ((java.lang.String) r4[r0]).intern();
        r10 = new java.lang.StringBuilder();
        r4 = new java.lang.Object[r1];
        g(new int[]{-766547156, 1179157480, -1885390481, -1739620054, -358345286, 890462765, -491700935, -22738814, 1263532375, -710843470, -398452752, -84524522, -681641389, -2053084574, -243268222, -1062029375, -875361944, -1201586074, -252750829, 856030625, -194160310, 1637634816, -1344838706, 375893122}, 45 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), r4);
        r10 = r10.append(((java.lang.String) r4[r0]).intern()).append(r3);
        r4 = new java.lang.Object[r1];
        g(new int[]{1167340255, 1691353912, 1667119911, -1842362841, -878445281, 1152250886, -1384746183, -1076352887}, android.widget.ExpandableListView.getPackedPositionType(0) + 15, r4);
        o.ea.f.c(r11, r10.append(((java.lang.String) r4[r0]).intern()).append(r12).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0231, code lost:
    
        r9 = o.df.c.d(r12);
        r1 = new java.lang.Object[r1];
        g(new int[]{-1364317391, 1155558956, -358345286, 890462765, 1311694154, 1919084746}, android.view.Gravity.getAbsoluteGravity(r0, r0) + 12, r1);
        r15 = new java.lang.Object[]{r2, ((java.lang.String) r1[r0]).intern()};
        r5 = (int) android.os.SystemClock.uptimeMillis();
        r4 = (int) android.os.SystemClock.elapsedRealtime();
        r16 = android.os.Process.myUid();
        r17 = o.ef.a.f23780n * (-1229108307);
        o.ef.a.f23780n = r17;
        r18 = r18;
        r5 = (o.ef.c) o.ef.a.a(-1398121910, r15, r16, r17, r18, r5, r4);
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x027c, code lost:
    
        r11 = (int) android.os.Process.getElapsedCpuTime();
        r21 = o.ef.c.f23799b * 1567746851;
        o.ef.c.f23799b = r21;
        r20 = o.ef.c.f23798a * 1136425123;
        o.ef.c.f23798a = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x02ae, code lost:
    
        if (r0 >= ((java.lang.Integer) o.ef.c.b((int) java.lang.Runtime.getRuntime().maxMemory(), r20, r21, r22, r11, r24, new java.lang.Object[]{r5})).intValue()) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x02b0, code lost:
    
        r4.add(r9.d(r3, r5.e(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x02bf, code lost:
    
        if (o.ea.f.a() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x02c1, code lost:
    
        r1 = new java.lang.Object[1];
        g(new int[]{-1885390481, -1739620054, -358345286, 890462765, -491700935, -22738814, 1263532375, -710843470, -492714972, 779828285, -252030610, 446384855}, 25 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), r1);
        r10 = ((java.lang.String) r1[0]).intern();
        r1 = new java.lang.Object[1];
        g(new int[]{-766547156, 1179157480, -1885390481, -1739620054, -358345286, 890462765, -491700935, -22738814, 1263532375, -710843470, -398452752, -84524522, -324314239, -210586556, -1612277640, -699347529, -1641125024, 709746352, 561448881, -1022891497, -46897515, -600869146, 398760866, -1161829303}, 45 - android.view.View.MeasureSpec.getMode(0), r1);
        o.ea.f.c(r10, ((java.lang.String) r1[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x02fd, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0302, code lost:
    
        if (o.ea.f.a() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0304, code lost:
    
        r2 = new java.lang.Object[1];
        g(new int[]{-1885390481, -1739620054, -358345286, 890462765, -491700935, -22738814, 1263532375, -710843470, -492714972, 779828285, -252030610, 446384855}, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24, r2);
        r10 = ((java.lang.String) r2[0]).intern();
        r2 = new java.lang.Object[1];
        h("璾遮봣\udafd\ue784͝⠇㗓劇繒魩ꀵ췱\ueab8\uf640ጭ㣕䖈慆蹦ꬲ냦\uddf6豈ل⏆䢂呒煭鸷믪삼\uec43अᚂ㎎彘摦脪껸쯴흡ﰏᧀ⚜䉞潠琢醼뺯\uda60\ue708\u0cce⦌㕗剮缰蓪ꆵ쵿\uea44\uf787\u1c8d㡞䕥戻迲钰끾\udd08惘߇⌔", 58567 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), r2);
        o.ea.f.e(r10, ((java.lang.String) r2[0]).intern(), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x033f, code lost:
    
        r0 = r0 + 1;
        r22 = -1513293186;
        r24 = 1513293186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x034b, code lost:
    
        r13.put(r3, r4);
        r7 = r7 + 1;
        r9 = 2;
        r1 = 1;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0357, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0358, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0359, code lost:
    
        r4 = new java.lang.StringBuilder();
        r1 = new java.lang.Object[1];
        h("璆杪匉保㮸ហɊﹼ\uea01웁닪꺂饟畳慊巒䧲▊ၙ\u0c76\uf806퓁샧벝꽑魥睎揌忨䮄♖ቢ์頋훣슲뵜ꥬ蔼燘涤妹㑗⁸ᰤ࣒\ue4f8킮쌜뼳ꭶ", 5077 - android.graphics.Color.green(0), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x038a, code lost:
    
        throw new o.en.f(r4.append(((java.lang.String) r1[0]).intern()).append(r6.getMessage()).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
    
        if (r31.d(((java.lang.String) r2[0]).intern()) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
    
        return java.util.Collections.emptyMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
    
        if (r31.d(((java.lang.String) r2[0]).intern()) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, java.util.List<o.dq.c>> a(o.ef.a r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.df.e.a(o.ef.a):java.util.Map");
    }

    static void c() {
        f22949b = new int[]{1655846571, 1961219411, 41150686, -446668849, 1543023218, -105087885, 1666244495, 2025593526, 1689553843, 1098150232, -327486288, 123856208, -1273677143, 1833220742, 1609568477, 419867917, 1118253660, -1625403014};
        f22950c = 8781794172195338627L;
    }

    private static void g(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f22949b;
        int i4 = 989264422;
        long j2 = 0;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objA = o.d.d.a(i4);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(Color.blue(0) + 675, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), ExpandableListView.getPackedPositionGroup(j2) + 12, -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    i6++;
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
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f22949b;
        if (iArr5 != null) {
            int i7 = $10 + 89;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i9])};
                Object objA2 = o.d.d.a(989264422);
                if (objA2 == null) {
                    byte b4 = (byte) i5;
                    byte b5 = b4;
                    objA2 = o.d.d.a(674 - TextUtils.indexOf((CharSequence) "", '0', i5, i5), (char) (ExpandableListView.getPackedPositionForGroup(i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i5) == 0L ? 0 : -1)), 11 - TextUtils.lastIndexOf("", '0', i5, i5), -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                i9++;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i5, iArr4, i5, length2);
        lVar.f19941d = i5;
        while (lVar.f19941d < iArr.length) {
            cArr[i5] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                int i12 = $11 + 17;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    lVar.f19942e ^= iArr4[i10];
                    Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA3 = o.d.d.a(2098218801);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 2);
                        objA3 = o.d.d.a(302 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (52697 - (Process.myPid() >> 22)), 11 - (ViewConfiguration.getPressedStateDuration() >> 16), -1416256172, false, $$c(b6, b7, (byte) (b7 - 2)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i10 += 127;
                } else {
                    lVar.f19942e ^= iArr4[i10];
                    Object[] objArr5 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA4 = o.d.d.a(2098218801);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 + 2);
                        objA4 = o.d.d.a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 301, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 52697), 10 - ExpandableListView.getPackedPositionChild(0L), -1416256172, false, $$c(b8, b9, (byte) (b9 - 2)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue2;
                    i10++;
                }
            }
            int i13 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i13;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i14 = lVar.f19942e;
            int i15 = lVar.f19940a;
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
                int iRgb = (-16776987) - Color.rgb(0, 0, 0);
                char cMakeMeasureSpec = (char) (51004 - View.MeasureSpec.makeMeasureSpec(0, 0));
                int iMyTid = (Process.myTid() >> 22) + 9;
                byte length4 = (byte) $$a.length;
                objA5 = o.d.d.a(iRgb, cMakeMeasureSpec, iMyTid, -330018025, false, $$c((byte) 0, length4, (byte) (length4 - 4)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA5).invoke(null, objArr6);
            i5 = 0;
        }
        String str = new String(cArr2, 0, i2);
        int i16 = $11 + 39;
        $10 = i16 % 128;
        int i17 = i16 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(java.lang.String r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.df.e.h(java.lang.String, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{117, -127, -11, 113};
        $$b = 35;
    }
}
