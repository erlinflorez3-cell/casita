package o.fm;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import o.a.q;
import o.m.i;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends e<d> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f26047a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26048b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f26049d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f26050e = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f26051j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, o.p.b> f26052c;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, short r10, byte r11) {
        /*
            byte[] r8 = o.fm.d.$$a
            int r0 = r10 * 7
            int r7 = r0 + 71
            int r2 = r9 * 4
            int r1 = 1 - r2
            int r0 = r11 + 4
            byte[] r6 = new byte[r1]
            r5 = 0
            int r4 = 0 - r2
            if (r8 != 0) goto L2b
            r1 = r0
            r3 = r5
        L15:
            int r0 = -r0
            int r7 = r7 + r0
            r0 = r1
            r2 = r3
        L19:
            byte r1 = (byte) r7
            r6[r2] = r1
            int r3 = r2 + 1
            if (r2 != r4) goto L26
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L26:
            int r1 = r0 + 1
            r0 = r8[r1]
            goto L15
        L2b:
            r2 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fm.d.$$c(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26048b = 0;
        f26051j = 1;
        f26047a = 0;
        f26049d = 1;
        a();
        ViewConfiguration.getTouchSlop();
        int i2 = f26048b + 67;
        f26051j = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    d() {
        super(false);
        this.f26052c = new HashMap<>();
    }

    public d(List<o.p.b> list) throws Throwable {
        super(true);
        HashMap<String, o.p.b> map = new HashMap<>();
        this.f26052c = map;
        Object[] objArr = new Object[1];
        f("柼䮪㽣\ue2f6횻멕淰冖Մ\ue8e9\udc9d职珧➍ହﻤꊌ", Color.green(0) + 11351, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        f("柼䮪㽣\ue2f6횻멕淰冖Մ\ue8e9\udc9d职珧➍ହﻤꊌ", Color.argb(0, 0, 0, 0) + 11351, objArr2);
        map.put(strIntern, new o.p.b(((String) objArr2[0]).intern(), new i[0][]));
        for (o.p.b bVar : list) {
            this.f26052c.put(bVar.b(), bVar);
        }
    }

    static void a() {
        f26050e = 6025872395414498013L;
    }

    private static void f(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        q qVar = new q();
        qVar.f19949d = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        qVar.f19948a = 0;
        while (qVar.f19948a < cArr.length) {
            int i4 = $11 + 31;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 731, (char) (7933 - ((Process.getThreadPriority(0) + 20) >> 6)), Color.red(0) + 11, 355847088, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    long jLongValue = ((Long) ((Method) objA).invoke(null, objArr2)).longValue();
                    long j2 = f26050e;
                    jArr[i5] = jLongValue * ((j2 + 4743694005979712847L) - (j2 & 4743694005979712847L));
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objA2 = o.d.d.a(835 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (27280 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 11 - Color.red(0), -2145994442, false, $$c(b4, b5, (byte) (-b5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = qVar.f19948a;
                Object[] objArr4 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                Object objA3 = o.d.d.a(-1011865131);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a(Process.getGidForName("") + 732, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 7933), (-16777205) - Color.rgb(0, 0, 0), 355847088, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objA3).invoke(null, objArr4)).longValue() ^ (f26050e ^ 4743694005979712847L);
                Object[] objArr5 = {qVar, qVar};
                Object objA4 = o.d.d.a(1452497747);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 1);
                    objA4 = o.d.d.a(View.resolveSizeAndState(0, 0, 0) + 836, (char) (27278 - Process.getGidForName("")), 10 - TextUtils.indexOf((CharSequence) "", '0'), -2145994442, false, $$c(b8, b9, (byte) (-b9)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        qVar.f19948a = 0;
        int i7 = $10 + 45;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (qVar.f19948a < cArr.length) {
            int i9 = $10 + 67;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr6 = {qVar, qVar};
                Object objA5 = o.d.d.a(1452497747);
                if (objA5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 + 1);
                    objA5 = o.d.d.a(836 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 27278), TextUtils.indexOf("", "", 0) + 11, -2145994442, false, $$c(b10, b11, (byte) (-b11)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA5).invoke(null, objArr6);
                throw null;
            }
            cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
            Object[] objArr7 = {qVar, qVar};
            Object objA6 = o.d.d.a(1452497747);
            if (objA6 == null) {
                byte b12 = (byte) 0;
                byte b13 = (byte) (b12 + 1);
                objA6 = o.d.d.a(837 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (27279 - ExpandableListView.getPackedPositionGroup(0L)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12, -2145994442, false, $$c(b12, b13, (byte) (-b13)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    static void init$0() {
        $$a = new byte[]{53, 102, 82, Ascii.ETB};
        $$b = 111;
    }

    public final HashMap<String, o.p.b> c() {
        int i2 = 2 % 2;
        int i3 = f26047a;
        int i4 = i3 + 109;
        f26049d = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        HashMap<String, o.p.b> map = this.f26052c;
        int i5 = i3 + 89;
        f26049d = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        r3 = r19.f26052c.keySet();
        r2 = r20.f26052c.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r2.hasNext() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (r3.contains(r2.next()) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        r1 = o.fm.d.f26049d + 61;
        o.fm.d.f26047a = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        r9 = r19.f26052c.entrySet().iterator();
        r2 = o.fm.d.f26049d + 3;
        o.fm.d.f26047a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        if (r9.hasNext() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        r2 = o.fm.d.f26049d + 51;
        o.fm.d.f26047a = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if ((r2 % 2) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        r3 = r9.next();
        r0 = r20.f26052c.get(r3.getKey());
        r2 = 87 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        if (r0 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        r3 = r9.next();
        r0 = r20.f26052c.get(r3.getKey());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
    
        if (r0 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
    
        r2 = r3.getValue();
        r17 = o.p.b.f26681e * 372422417;
        o.p.b.f26681e = r17;
        r16 = o.p.b.f26680d * 1240573401;
        o.p.b.f26680d = r16;
        r4 = ((java.lang.Integer) o.p.b.a(-927348846, android.os.Process.myPid(), 927348846, android.os.Process.myUid(), r16, r17, new java.lang.Object[]{r2})).intValue();
        r17 = o.p.b.f26681e * 372422417;
        o.p.b.f26681e = r17;
        r16 = o.p.b.f26680d * 1240573401;
        o.p.b.f26680d = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010d, code lost:
    
        if (r4 == ((java.lang.Integer) o.p.b.a(-927348846, android.os.Process.myPid(), 927348846, android.os.Process.myUid(), r16, r17, new java.lang.Object[]{r0})).intValue()) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0110, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0111, code lost:
    
        r17 = o.p.b.f26681e * 372422417;
        o.p.b.f26681e = r17;
        r16 = o.p.b.f26680d * 1240573401;
        o.p.b.f26680d = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0133, code lost:
    
        if (r5 >= ((java.lang.Integer) o.p.b.a(-927348846, android.os.Process.myPid(), 927348846, android.os.Process.myUid(), r16, r17, new java.lang.Object[]{r2})).intValue()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0141, code lost:
    
        if (java.util.Arrays.equals(r2.b(r5), r0.b(r5)) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0143, code lost:
    
        r1 = o.fm.d.f26049d + 31;
        o.fm.d.f26047a = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x014c, code lost:
    
        if ((r1 % 2) == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014f, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0152, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r19.f26052c.size() != r20.f26052c.size()) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r19.f26052c.size() != r20.f26052c.size()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(o.fm.d r20) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fm.d.d(o.fm.d):boolean");
    }
}
