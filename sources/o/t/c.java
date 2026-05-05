package o.t;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.lang.reflect.Method;
import o.a.g;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends Exception {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char f26812a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f26813b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static char f26814c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char f26815d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f26816e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f26817f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char f26818g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f26819h = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r7, int r8, short r9) {
        /*
            int r0 = r8 * 2
            int r8 = 4 - r0
            int r7 = r7 + 65
            int r0 = r9 * 3
            int r6 = r0 + 1
            byte[] r5 = o.t.c.$$a
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r5 != 0) goto L28
            r0 = r7
            r7 = r6
            r2 = r3
        L14:
            int r7 = r7 + r0
            int r8 = r8 + 1
            r1 = r2
        L18:
            int r2 = r1 + 1
            byte r0 = (byte) r7
            r4[r1] = r0
            if (r2 != r6) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L25:
            r0 = r5[r8]
            goto L14
        L28:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.t.c.$$c(short, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26819h = -1002813413;
        f26813b = 740602047300126166L;
        f26816e = 1564493270;
        f26815d = (char) 23081;
        f26812a = (char) 11372;
        f26814c = (char) 7801;
        f26817f = (char) 17447;
        f26818g = (char) 5896;
    }

    public c(String str) {
        super(str);
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(Unknown Source)
        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] d(android.content.Context r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 1322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.t.c.d(android.content.Context, int, int):java.lang.Object[]");
    }

    private static void i(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = 2 % 2;
        int i4 = $11;
        int i5 = i4 + 19;
        $10 = i5 % 128;
        Object obj = null;
        Object charArray = str6;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (str6 != null) {
            int i6 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            charArray = str6.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str5;
        if (str5 != null) {
            charArray2 = str5.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str4;
        if (str4 != null) {
            charArray3 = str4.toCharArray();
        }
        o.a.i iVar = new o.a.i();
        int length = cArr.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = ((char[]) charArray3).length;
        char[] cArr5 = new char[length3];
        iVar.f19932b = 0;
        while (iVar.f19932b < length3) {
            try {
                Object[] objArr2 = {iVar};
                Object objA = o.d.d.a(540069882);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 106, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 11, -155898465, false, $$c(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {iVar};
                Object objA2 = o.d.d.a(2068572);
                if (objA2 == null) {
                    byte b4 = (byte) 3;
                    byte b5 = (byte) (b4 - 3);
                    objA2 = o.d.d.a((ViewConfiguration.getTouchSlop() >> 8) + 847, (char) (TextUtils.getTrimmedLength("") + 6488), ExpandableListView.getPackedPositionType(0L) + 12, -694521287, false, $$c(b4, b5, b5), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA3 = o.d.d.a(-1122996612);
                if (objA3 == null) {
                    byte b6 = (byte) 1;
                    byte b7 = (byte) (b6 - 1);
                    objA3 = o.d.d.a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 458, (char) TextUtils.getCapsMode("", 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 11, 1804962841, false, $$c(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objA3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                Object objA4 = o.d.d.a(-1223178239);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    objA4 = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 638, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 65100), 12 - TextUtils.indexOf("", ""), 1636969060, false, $$c((byte) 57, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = iVar.f19933e;
                cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r8[iVar.f19932b])) ^ (f26813b ^ 740602047300126166L)) ^ ((long) ((int) (((long) f26816e) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f26815d) ^ 740602047300126166L))));
                iVar.f19932b++;
                int i8 = $11 + 113;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                obj = null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    static void init$0() {
        $$a = new byte[]{103, 35, 47, 90};
        $$b = 180;
    }

    private static void j(String str, int i2, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i3 = 2 % 2;
        if (str2 != null) {
            int i4 = $10 + 1;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        int i6 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i7 = $11 + 5;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr3[i6] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i9 = 58224;
            int i10 = i6;
            while (i10 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i6];
                int i11 = (c3 + i9) ^ ((c3 << 4) + ((char) (((long) f26817f) ^ (-7511683281764982996L))));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f26818g);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i6] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        int i13 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 269;
                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 11;
                        byte length = (byte) $$a.length;
                        byte b2 = (byte) (length - 4);
                        String str$$c = $$c(length, b2, b2);
                        Class[] clsArr = new Class[4];
                        clsArr[i6] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = o.d.d.a(i13, scrollBarFadeDuration, tapTimeout, -1995022631, false, str$$c, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) f26812a) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f26814c)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        int iRed = 270 - Color.red(0);
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16777216);
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11;
                        byte length2 = (byte) $$a.length;
                        byte b3 = (byte) (length2 - 4);
                        objA2 = o.d.d.a(iRed, cRgb, scrollDefaultDelay, -1995022631, false, $$c(length2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i10++;
                    i6 = 0;
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
                byte b4 = (byte) 0;
                objA3 = o.d.d.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 269, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 11 - (ViewConfiguration.getTouchSlop() >> 8), -2074123590, false, $$c((byte) 7, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
            i6 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }
}
