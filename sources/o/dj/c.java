package o.dj;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import o.a.o;
import o.ea.f;
import o.ea.m;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f23104a = 0;

    /* JADX INFO: renamed from: b */
    public static int f23105b = 0;

    /* JADX INFO: renamed from: c */
    public static int f23106c = 0;

    /* JADX INFO: renamed from: d */
    public static int f23107d = 0;

    /* JADX INFO: renamed from: e */
    public static int f23108e = 0;

    /* JADX INFO: renamed from: f */
    public static int f23109f = 0;

    /* JADX INFO: renamed from: g */
    public static int f23110g = 0;

    /* JADX INFO: renamed from: h */
    public static int f23111h = 0;

    /* JADX INFO: renamed from: i */
    public static int f23112i = 0;

    /* JADX INFO: renamed from: j */
    private static final Object f23113j;

    /* JADX INFO: renamed from: k */
    private static char[] f23114k = null;

    /* JADX INFO: renamed from: l */
    private static List<Long> f23115l = null;

    /* JADX INFO: renamed from: m */
    private static final Map<String, d> f23116m;

    /* JADX INFO: renamed from: n */
    private static int f23117n = 0;

    /* JADX INFO: renamed from: o */
    private static long f23118o = 0;

    /* JADX INFO: renamed from: p */
    private static int f23119p = 0;

    /* JADX INFO: renamed from: q */
    private static int f23120q = 0;

    /* JADX INFO: renamed from: r */
    private static int f23121r = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, short r9, int r10) {
        /*
            byte[] r7 = o.dj.c.$$a
            int r0 = r8 * 4
            int r6 = r0 + 4
            int r1 = r10 * 3
            int r0 = 1 - r1
            int r2 = r9 + 99
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r7 != 0) goto L2a
            r2 = r6
            r1 = r3
            r0 = r4
        L16:
            int r6 = r6 + 1
            int r2 = r2 + r1
            r1 = r0
        L1a:
            byte r0 = (byte) r2
            r5[r1] = r0
            int r0 = r1 + 1
            if (r1 != r3) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            r1 = r7[r6]
            goto L16
        L2a:
            r1 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dj.c.$$c(int, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f23112i = 1722036522;
        f23110g = -720273308;
        f23111h = -1359723841;
        f23109f = -1765074818;
        f23104a = -2082743982;
        f23105b = 894901383;
        f23107d = 1911725351;
        f23106c = -174904165;
        f23108e = 1996985622;
        f23120q = 0;
        f23121r = 1;
        f23117n = 0;
        f23119p = 1;
        d();
        TextUtils.getOffsetAfter("", 0);
        TextUtils.getTrimmedLength("");
        MotionEvent.axisFromString("");
        ViewConfiguration.getGlobalActionKeyTimeout();
        ExpandableListView.getPackedPositionChild(0L);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        ViewConfiguration.getScrollBarFadeDuration();
        ViewConfiguration.getGlobalActionKeyTimeout();
        KeyEvent.getMaxKeyCode();
        SystemClock.uptimeMillis();
        ExpandableListView.getPackedPositionType(0L);
        Process.getElapsedCpuTime();
        f23113j = new Object();
        f23116m = new HashMap();
        int i2 = f23121r + 87;
        f23120q = i2 % 128;
        int i3 = i2 % 2;
    }

    private static Set<d> a(o.dk.a aVar, SharedPreferences sharedPreferences) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23119p + 45;
        f23117n = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        s((char) View.combineMeasuredStates(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 141, 23 - KeyEvent.keyCodeFromString(""), objArr);
        String strIntern = ((String) objArr[0]).intern();
        long j2 = 0;
        if (f.a()) {
            int i5 = f23119p + 91;
            f23117n = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr2 = new Object[1];
            s((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 877, 19 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        Map<String, ?> all = sharedPreferences.getAll();
        HashSet hashSet = new HashSet(all.size());
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Map<String, d> map = f23116m;
            d dVar = map.get(key);
            if (dVar != null) {
                if (f.a()) {
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr3 = new Object[1];
                    s((char) TextUtils.getCapsMode("", 0, 0), View.getDefaultSize(0, 0) + 895, 62 - (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)), objArr3);
                    StringBuilder sbAppend = sb.append(((String) objArr3[0]).intern()).append(key);
                    Object[] objArr4 = new Object[1];
                    s((char) ((Process.getThreadPriority(0) + 20) >> 6), 956 - (KeyEvent.getMaxKeyCode() >> 16), 19 - (SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1)), objArr4);
                    f.c(strIntern, sbAppend.append(((String) objArr4[0]).intern()).toString());
                }
                hashSet.add(dVar);
            } else {
                Object value = entry.getValue();
                if (value instanceof String) {
                    String strC = aVar.c((String) value);
                    try {
                        if (f.a()) {
                            StringBuilder sb2 = new StringBuilder();
                            Object[] objArr5 = new Object[1];
                            s((char) TextUtils.getCapsMode("", 0, 0), TextUtils.indexOf("", "") + 974, 44 - Color.argb(0, 0, 0, 0), objArr5);
                            f.c(strIntern, sb2.append(((String) objArr5[0]).intern()).append(strC).toString());
                        }
                        Object[] objArr6 = {new o.ef.a(strC)};
                        int iNextInt = new Random().nextInt();
                        int id = (int) Thread.currentThread().getId();
                        int i7 = f23107d * 107736487;
                        f23107d = i7;
                        int i8 = f23105b * 779046959;
                        f23105b = i8;
                        d dVar2 = (d) b(i7, objArr6, iNextInt, 533872428, -533872427, id, i8);
                        hashSet.add(dVar2);
                        map.put(key, dVar2);
                    } catch (o.ef.b e2) {
                        if (f.a()) {
                            StringBuilder sb3 = new StringBuilder();
                            Object[] objArr7 = new Object[1];
                            s((char) (Drawable.resolveOpacity(0, 0) + 52017), 1017 - TextUtils.indexOf((CharSequence) "", '0'), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 68, objArr7);
                            f.e(strIntern, sb3.append(((String) objArr7[0]).intern()).append(strC).toString(), e2);
                        }
                    }
                } else if (f.a()) {
                    StringBuilder sb4 = new StringBuilder();
                    Object[] objArr8 = new Object[1];
                    s((char) (TextUtils.indexOf("", "", 0) + 55257), 1086 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36, objArr8);
                    StringBuilder sbAppend2 = sb4.append(((String) objArr8[0]).intern()).append(entry.getKey());
                    Object[] objArr9 = new Object[1];
                    s((char) (45230 - Gravity.getAbsoluteGravity(0, 0)), 861 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16, objArr9);
                    f.d(strIntern, sbAppend2.append(((String) objArr9[0]).intern()).toString());
                    int i9 = f23117n + 51;
                    f23119p = i9 % 128;
                    int i10 = i9 % 2;
                }
                j2 = 0;
            }
        }
        return hashSet;
    }

    static void a(Context context) throws Throwable {
        int iNextInt = new Random().nextInt();
        int i2 = f23108e * 1630934154;
        f23108e = i2;
        int i3 = (-1067748560) * f23106c;
        f23106c = i3;
        b(i3, new Object[]{context}, iNextInt, 1428144871, -1428144871, i2, (int) Runtime.getRuntime().totalMemory());
    }

    private static void a(Context context, SharedPreferences sharedPreferences, Set<d> set) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23117n + 3;
        f23119p = i3 % 128;
        int i4 = i3 % 2;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        List<Long> listG = g(context);
        int i5 = f23119p + 7;
        f23117n = i5 % 128;
        int i6 = i5 % 2;
        for (d dVar : set) {
            int i7 = f23119p + 49;
            f23117n = i7 % 128;
            int i8 = i7 % 2;
            String strValueOf = String.valueOf(dVar.e());
            editorEdit.remove(strValueOf);
            f23116m.remove(strValueOf);
            listG.remove(Long.valueOf(dVar.e()));
        }
        e(context, listG);
        editorEdit.commit();
        int i9 = f23117n + 91;
        f23119p = i9 % 128;
        int i10 = i9 % 2;
    }

    static void a(Context context, Long l2) {
        synchronized (f23113j) {
            List<Long> listG = g(context);
            listG.add(l2);
            e(context, listG);
        }
    }

    static boolean a(Context context, d dVar) {
        boolean zContains;
        synchronized (f23113j) {
            zContains = d(context).contains(String.valueOf(dVar.e()));
        }
        return zContains;
    }

    public static /* synthetic */ Object b(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) throws Throwable {
        int i8 = ~i5;
        int i9 = (~(i8 | i4)) | (~((-1) - (((-1) - i8) & ((-1) - i3)))) | (~((i4 + i3) - (i4 & i3)));
        int i10 = ~((i5 + i3) - (i5 & i3));
        int i11 = (i10 + i4) - (i10 & i4);
        int i12 = (-1) - (((-1) - (~((-1) - (((-1) - i3) & ((-1) - (i5 | i4)))))) & ((-1) - (~((-1) - (((-1) - (i8 | (~i4))) & ((-1) - (~i3)))))));
        int i13 = i5 + i4 + i6 + (862446602 * i2) + (395103901 * i7);
        int i14 = i13 * i13;
        int i15 = (i5 * 1384179468) + 550727958 + (i4 * 1384180977) + (i9 * 503) + (i11 * (-1006)) + (i12 * 503) + (1384179971 * i6) + (1640285726 * i2) + (120803543 * i7) + (i14 * 2025127936);
        int i16 = (((-1892237052) * i5) - 438566912) + ((-683246085) * i4) + (i9 * 402996989) + ((-805993978) * i11) + (402996989 * i12) + ((-1489240064) * i6) + ((-128450560) * i2) + ((-674496512) * i7) + ((-1108934656) * i14) + (i15 * i15 * (-275709952));
        if (i16 != 1) {
            return i16 != 2 ? i16 != 3 ? e(objArr) : c(objArr) : b(objArr);
        }
        o.ef.a aVar = (o.ef.a) objArr[0];
        int i17 = 2 % 2;
        Object[] objArr2 = new Object[1];
        s((char) TextUtils.getCapsMode("", 0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1172, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2, objArr2);
        long jLongValue = aVar.n(((String) objArr2[0]).intern()).longValue();
        h[] hVarArrValues = h.values();
        Object[] objArr3 = new Object[1];
        s((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 36760), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1174, 7 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr3);
        Object[] objArr4 = {aVar, ((String) objArr3[0]).intern()};
        int i18 = o.ef.a.f23778l * 493926616;
        o.ef.a.f23778l = i18;
        int i19 = o.ef.a.f23779m * 1131312688;
        o.ef.a.f23779m = i19;
        h hVar = hVarArrValues[((Integer) o.ef.a.a(1122077797, objArr4, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i18, i19)).intValue()];
        Object[] objArr5 = new Object[1];
        s((char) View.MeasureSpec.getMode(0), 1180 - (ViewConfiguration.getScrollBarSize() >> 8), 11 - TextUtils.lastIndexOf("", '0', 0), objArr5);
        Date date = (Date) Objects.requireNonNull(m.e(aVar.n(((String) objArr5[0]).intern()).longValue()));
        Object[] objArr6 = new Object[1];
        s((char) (57237 - TextUtils.getOffsetBefore("", 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 1192, 6 - (ViewConfiguration.getScrollBarSize() >> 8), objArr6);
        Date dateE = m.e(aVar.n(((String) objArr6[0]).intern()).longValue());
        Object[] objArr7 = new Object[1];
        s((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 58546), 1198 - ExpandableListView.getPackedPositionType(0L), 6 - TextUtils.lastIndexOf("", '0', 0), objArr7);
        d dVar = new d(jLongValue, hVar, date, dateE, aVar.v(((String) objArr7[0]).intern()));
        int i20 = f23117n + 55;
        f23119p = i20 % 128;
        int i21 = i20 % 2;
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0048 A[PHI: r3
  0x0048: PHI (r3v3 java.lang.String) = (r3v1 java.lang.String), (r3v5 java.lang.String) binds: [B:73:0x0100, B:58:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dj.c.b(java.lang.Object[]):java.lang.Object");
    }

    static Set<d> b(Context context) {
        HashSet hashSet;
        synchronized (f23113j) {
            hashSet = new HashSet();
            List<Long> listG = g(context);
            if (!listG.isEmpty()) {
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    s((char) View.MeasureSpec.getSize(0), Process.getGidForName("") + 142, TextUtils.indexOf("", "", 0) + 23, objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    s((char) (ViewConfiguration.getTapTimeout() >> 16), 349 - (ViewConfiguration.getPressedStateDuration() >> 16), 69 - Color.alpha(0), objArr2);
                    f.c(strIntern, ((String) objArr2[0]).intern());
                }
                Iterator<Long> it = listG.iterator();
                while (it.hasNext()) {
                    d dVarE = e(new o.dk.a(context), d(context), String.valueOf(it.next()));
                    if (dVarE != null) {
                        hashSet.add(dVarE);
                    }
                }
            } else if (f.a()) {
                Object[] objArr3 = new Object[1];
                s((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 141 - (Process.myPid() >> 22), TextUtils.getTrimmedLength("") + 23, objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                s((char) (17987 - Color.green(0)), TextUtils.indexOf("", "", 0, 0) + 286, 63 - TextUtils.getOffsetAfter("", 0), objArr4);
                f.c(strIntern2, ((String) objArr4[0]).intern());
            }
        }
        return hashSet;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        Context context = (Context) objArr[0];
        Long l2 = (Long) objArr[1];
        synchronized (f23113j) {
            List<Long> listG = g(context);
            listG.remove(l2);
            e(context, listG);
        }
        return null;
    }

    private static d c(o.dk.a aVar, SharedPreferences sharedPreferences, String str) {
        Object[] objArr = {aVar, sharedPreferences, str};
        int i2 = f23104a * 1585614218;
        f23104a = i2;
        int i3 = f23109f * (-201575712);
        f23109f = i3;
        int priority = Thread.currentThread().getPriority();
        int i4 = f23111h * 1965818903;
        f23111h = i4;
        return (d) b(priority, objArr, i2, -387887892, 387887894, i3, i4);
    }

    public static void c(Context context) {
        synchronized (f23113j) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                s((char) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 141, 23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                s((char) (TextUtils.getOffsetAfter("", 0) + 46560), View.MeasureSpec.getSize(0) + 418, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 27, objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            o.dk.a aVar = new o.dk.a(context);
            SharedPreferences sharedPreferencesD = d(context);
            Set<d> setE = e(aVar, sharedPreferencesD, h.values());
            if (f.a()) {
                Object[] objArr3 = new Object[1];
                s((char) ((-1) - Process.getGidForName("")), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 141, TextUtils.getTrimmedLength("") + 23, objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr4 = new Object[1];
                s((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 445 - View.resolveSize(0, 0), TextUtils.indexOf((CharSequence) "", '0') + 40, objArr4);
                StringBuilder sbAppend = sb.append(((String) objArr4[0]).intern()).append(setE.size());
                Object[] objArr5 = new Object[1];
                s((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 55031), 484 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 14, objArr5);
                f.c(strIntern2, sbAppend.append(((String) objArr5[0]).intern()).toString());
            }
            a(context, sharedPreferencesD, setE);
        }
    }

    private static void c(SharedPreferences sharedPreferences) {
        int i2 = 2 % 2;
        int i3 = f23119p + 91;
        f23117n = i3 % 128;
        int i4 = i3 % 2;
        sharedPreferences.edit().clear().commit();
        f23116m.clear();
        int i5 = f23117n + 109;
        f23119p = i5 % 128;
        int i6 = i5 % 2;
    }

    static boolean c(Context context, d dVar) {
        boolean zCommit;
        synchronized (f23113j) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                s((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 142, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22, objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                s((char) TextUtils.indexOf("", ""), 163 - ((byte) KeyEvent.getModifierMetaStateMask()), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 44, objArr2);
                f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(dVar).toString());
            }
            try {
                zCommit = d(context).edit().putString(String.valueOf(dVar.e()), new o.dk.a(context).e(d(dVar).e())).commit();
                if (zCommit) {
                    f23116m.put(String.valueOf(dVar.e()), dVar);
                }
            } catch (o.ef.b e2) {
                if (f.a()) {
                    Object[] objArr3 = new Object[1];
                    s((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 141, 24 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    StringBuilder sb2 = new StringBuilder();
                    Object[] objArr4 = new Object[1];
                    s((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + Mp4VideoDirectory.TAG_COMPRESSION_TYPE, Color.green(0) + 77, objArr4);
                    f.e(strIntern2, sb2.append(((String) objArr4[0]).intern()).append(dVar.toString()).toString(), e2);
                }
                return false;
            }
        }
        return zCommit;
    }

    private static SharedPreferences d(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23117n + 33;
        f23119p = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        s((char) (58990 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), ViewConfiguration.getJumpTapTimeout() >> 16, 70 - View.resolveSize(0, 0), objArr);
        Object[] objArr2 = {((String) objArr[0]).intern(), 0};
        Method method = Class.forName(Jg.Wd("\u007f_h\b\u001f$0x<Qo\u0007\u0006F]*Y/AECa~", (short) (OY.Xd() ^ 31835), (short) (OY.Xd() ^ 22087))).getMethod(C1626yg.Ud("a!w2O\u0004-g4Kc\u0011V_P\"I8z5", (short) (C1580rY.Xd() ^ (-4197)), (short) (C1580rY.Xd() ^ (-5146))), Class.forName(ZO.xd("y~Qi\u0016E\na.WZ\u0007j\u0004*q", (short) (OY.Xd() ^ 8660), (short) (OY.Xd() ^ 5110))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr2);
            int i5 = f23117n + 17;
            f23119p = i5 % 128;
            int i6 = i5 % 2;
            return sharedPreferences;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static d d(o.ef.a aVar) throws o.ef.b {
        Object[] objArr = {aVar};
        int iNextInt = new Random().nextInt();
        int id = (int) Thread.currentThread().getId();
        int i2 = 107736487 * f23107d;
        f23107d = i2;
        int i3 = f23105b * 779046959;
        f23105b = i3;
        return (d) b(i2, objArr, iNextInt, 533872428, -533872427, id, i3);
    }

    private static o.ef.a d(d dVar) throws Throwable {
        int i2 = 2 % 2;
        o.ef.a aVar = new o.ef.a();
        long time = -1;
        Object[] objArr = new Object[1];
        s((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 1172 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2 - TextUtils.getCapsMode("", 0, 0), objArr);
        aVar.c(((String) objArr[0]).intern(), dVar.e());
        Object[] objArr2 = new Object[1];
        s((char) (36760 - Color.blue(0)), 1174 - ExpandableListView.getPackedPositionType(0L), 6 - Color.green(0), objArr2);
        aVar.c(((String) objArr2[0]).intern(), dVar.a().ordinal());
        Object[] objArr3 = new Object[1];
        s((char) View.MeasureSpec.makeMeasureSpec(0, 0), 1181 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 12, objArr3);
        aVar.c(((String) objArr3[0]).intern(), dVar.c().getTime());
        Object[] objArr4 = new Object[1];
        s((char) (57237 - (ViewConfiguration.getTouchSlop() >> 8)), 1192 - Color.green(0), 6 - View.resolveSizeAndState(0, 0, 0), objArr4);
        String strIntern = ((String) objArr4[0]).intern();
        if (dVar.b() != null) {
            int i3 = f23119p + 21;
            f23117n = i3 % 128;
            if (i3 % 2 != 0) {
                dVar.b().getTime();
                throw null;
            }
            time = dVar.b().getTime();
        }
        aVar.c(strIntern, time);
        Object[] objArr5 = new Object[1];
        s((char) (58547 - View.resolveSizeAndState(0, 0, 0)), 1198 - TextUtils.getCapsMode("", 0, 0), AndroidCharacter.getMirror('0') - ')', objArr5);
        aVar.a(((String) objArr5[0]).intern(), dVar.j());
        return aVar;
    }

    static void d() {
        char[] cArr = new char[1205];
        ByteBuffer.wrap("rùn¾J\u0017&\u0007\u0003½ÿtÛ\b´¶\u0090h\u008c\u0004i\u008fEo!\u0015\u0002ÜþpÚ.·À\u0093l\u008f!hÕD\u0086 <\u001dÔù\u0088Õ%¶å\u0092\u0083\u008e'kÔG\u008b#M\u001cóø\u008dÔI±ý\u00ad\u0099\u0089Ce\u0012F¨\"\\\u001e\u0002û¦×d³\u0000¬¸\u0088md\u0006A\u008c=a\u0019\u0013úÝÖ\u007f²%¯Ù\u008b~g+@Ã<\u008d\u0018>õÐÑ\u0098Í\u0007®è\u008a\u0097f,Cÿ?\u0098\u001bAôöÐ³EqY6}\u009f\u0011\u008f45Èüì\u0080\u0083>§à»\u008c^\u0007rç\u0016\u009d5TÉøí¦\u0080H¤ä¸©_]s\u000e\u0017´*\\Î\u0000â\u00ad\u0081m¥\u000b¹¯\\\\p\u0003\u0014Å+{Ï\u0005ãÁ\u0086u\u009a\u0011¾ËR\u009aq \u0015Ô)\u008aÌ.àì\u0084\u0088\u009b0¿åS\u008ev\u0004\nô.\u0080ÍHáý\u0085 \u0098A¼ÊP¬wP\u000b\u0018/°ÂPæ\nú³\u0099l½\u000eQ¾tk\b\u001f,ñÃrç,ûÖ\u0094¢\u0088Ô¬8Àgåð\u0019\u0002=tRÞv\fjp\u008f¯£\u0002Çbä¬\u0018\u0017<AQ\u008fu\u0010iJ\u008eº¢éÆXû¢\u0094\u0082\u0088Ä¬&Àxå×\u0019\u001e=tRùv\u0005jm\u008f¥£\u0005Ç\u007fä¦\u0018\u0019<[Q«u\u001eiJ\u008eó¢§Æ\u001dûý\u001f§3TP\u0086tèhZ\u008d\u0080¡üÅ+ú\u009e\u001eæ2(W\u009bKÅo\u0013\u0083h ÓÄ$øk\u001dÞ1\tU9J\u0096\u0094\u0082\u0088Ä¬&Àxå×\u0019\u001e=tRùv\u0005jm\u008f¥£\u0005Ç\u007fä¦\u0018\u0019<[Q«u\u001eiJ\u008eó¢§Æ\u001dûý\u001f§3oP\u0087týhQ\u008d\u008a¡ðÅhú\u008b\u001eý2aW\u0096KÞo7\u0083a ÄÄwø@\u001dê1\u0003UmJùn\u0007\u0082r§ªÛ\u0001ÿe\u001cä0\u001dT\\I²m\u001d\u0081\u0007¦\u0094ÚæþH\u0013º7à+\\H\u008blþ\u0080F¥\u0088Ùûý%\u0012³6È*3O\u0084cË\u0087>»iØ\u0099üvÒÖÎ\u0087êc\u0086\u001e£\u009c_B{*\u0014\u00900z,.ÉæåC\u0081>¢ÿ^uz\u0003\u0017õ3[/\u0001Èñä®\u0080\u001f½çY\u00adu\u0016\u0016Ä2¬.PË\u0088çö\u0083e¼ÓXñtq\u0011Ã\r\u0081)~Å%æ\u009a\u00824¾'[\u0095w[\u0013)\f\u0093(OÄ8áí\u009dU¹;ZèvV\u0012M\u000fì+VÇ\u0003àð\u009c¹¸\u000bUõq·m\u0013\u000eÏ\u0094\u0095\u0088Ä¬ À]åß\u0019\u0001=iRÓv9jm\u008f¥£\u0000Ç}ä¼\u00186<@Q¶u\u0018iB\u008e²¢íÆ\\û¤\u001fî3UP\u0087tïh\u0013\u008dË¡µÅ;ú\u0090\u001eÿ2$WÔKØo*\u0083d ÃÄ<øs\u001d\u00991\u0002UlJÂn\f\u0082~§¦Û\u0001ÿp\u001c°0\u0012TAI³mP\u0081F¦¨Úìþ\u001c\u0013¡7ã+RH\u0081lì\u0080F¥\u0084Ùæý.\u0012\u009a!q=-\u0019Ñu\u008aP0¬È\u0088\u0098ç'Ããß\u008b:I\u0016çr¸QJ\u00adì\u0089¦äDÀøÜ§;Z\u0017\u001as´N_ª\t\u0086©å!ÁU\u0094\u0091\u0088Í¬1ÀjåÐ\u0019(=xRÇv\u0003jk\u008f©£\u0007ÇXäª\u0018\f<FQ¤u\u0018iG\u008eº¢úÆTû¿\u001fé3IPÁtµh\u0013\u008dË¡µÅ\u000bú\u0093\u001e÷2 W\u009aKÂo0\u0083j \u0080B%^\u0018zÌ\u0016\u00883 Ïüë\u009e\u0084# ü¼\u009aYRuû\u0011\u008f2A\u0094\u0095\u0088Ä¬ ÀNåÆ\u0019\u001d=iRÅv\u000fj}\u008f\u0082£\fÇbä¬\u0018\u001e<FQ¡u\u0010iP\u008e²¢áÆSû£\u001f¯3\u0013PÉt±h\u0013\u008d\u0089¡çÅ!ú\u0098\u001eû2/W\u0087Kío7\u0083a ÔÄ2øx\u001d\u00831LU+\u0094Ò\u0088Ý¬tá¿\u0094\u0095\u0088Ä¬ ÀNåÆ\u0019\u001d=iRÅv\u000fj}\u008f\u0082£\fÇbä¬\u0018\u001e<FQ¡u\u0010iP\u008e²¢áÆSû£\u001f¯3\u0013PÉt±h\u0013\u008d¨¡úÅ<ú\u0096\u001eô2(W\u0097KÊo*\u0083d ÏÄ9ø*ö%ê?ÎÐ¢ÜÌ\rÐ_ô±\u0098º\u0094\u0097\u0088Ù¬$ÀbåÌ\u0019\b=dÎ\u0001ÒPö´\u009aÑ¿EC\u008dgý\bE,\u00970îÕ9ù\u0083\u009dë¾>B\u0082qpm!IÅ% \u00004üüØ\u008c·4\u0093æ\u008f\u009fjHFò\"\u009a\u0001OýóÙ¹´\u000f\u0090½\u008cák\u0013GK#\u0088\u001e@ú\u000eÖ³µB\u0091\u0016\u008d¢hjD\u0016 Ä\u001fyû\u0016×Ð²x®!\u008aÕf¥E !Á\u001d\u009cø=Ôî°\u0083¯s\u008bág\u0091BX>â\u001a\u0095ùEÕç±ë¬Q\u0088ûdâC\\?\r\u001bºö^Ò\u0006\u0094\u0095\u0088Ä¬ ÀEåÑ\u0019\u0019=iRÑv\u0003jz\u008f\u00ad£\u0017Ç\u007fäª\u0018\u0016<\u000fQïuQiQ\u008eµ¢åÆSû¿\u001fð3TPÉtòh\\\u008d\u0092¡üÅ.ú\u0096\u001eñ2 W\u0080KÂo1\u0083c \u0080Ä>øn\u001d\u00991VU#ÞhÂ9æÝ\u008a¸¯,Säw\u0094\u0018,<þ \u0087ÅPéê\u008d\u0082®WRëvò\u001b\u0012?¬#\u0089ÄGè\u0001\u008c³±DU\u0014y \u001a4>\u0005\"«Çxë\u001a\u008fÌ°rT\u001bxÙ\u001dm\u0001\u0012%ÂÉ\u0084ê<\u008e\u0090²×\u0094\u0095\u0088Ä¬ ÀEåÑ\u0019\u0019=iRÑv\u0003jz\u008f\u00ad£\u0017Ç\u007fäª\u0018\u0016<\u000fQïuQiq\u008eµ¢ïÆ_û¼\u001fâ3\u001aP\u009dtóh\u0013\u008d\u0096¡ôÅ:ú\u008c\u001e÷2aW¾Køo1\u0083c ïÄ5ø`\u001dÜ1\u000fUwJ\u0096n\u0003\u0082j§ Û\u000fÿ1\u001c 0\u001eTMI¯m\t\u0081W¦®ÚìþX\u0013\u00977ç+AH\u0089l¥\u0080\u0012·û«ª\u008fNã+Æ¿:w\u001e\u0007q¿UmI\u0014¬Ã\u0080yä\u0011ÇÄ;x\u001far\u0081V?J\u001c\u00adÔ\u0081\u008cå&ØÛ<É\u00102sèW\u0080K}®ã\u0082\u009eæ_Ù«=Ü$|8f\u001c\u0089p\u0085U~©¬\u008dÚâ9Æ¥Ú\u0097?\u0011\u0013¹wÊT\u0002¨¸\u008cæ\u0094\u0095\u0088Ä¬ ÀEåÑ\u0019\u0019=iRÑv\u0003jz\u008f\u00ad£\u0017Ç\u007fäª\u0018\u0016<\\QêuX\u0094\u0095\u0088Ä¬ ÀEåÑ\u0019\u0019=iRÑv\u0003jz\u008f\u00ad£\u0017Ç\u007fäª\u0018\u0016<\\QêuXi\u0004\u008eö¢®Æmû¥\u001fë3VP§tóhG\u008d\u008f¡óÅ!ú\u009c\u001eó25W\u009dKÄo0\u0083@ ÅÄ$øy\u001dØ1\u000bUfJ\u0096n\u0012\u00827§ïÛ\u000bÿu\u001c¡0\u0015TZI´m\u0016\u0081N¦¿Úûþ\u0006\u0013ó7¡\u0094Õ\u0088\u0081¬5ÀgåÌ\u0019\b=aRÓv\u0013j9\u008f¥£\rÇ6ä¦\u0018\u0019<LQªu\u0014\u0094\u0095\u0088Ä¬ ÀEåÑ\u0019\u0019=iRÑv\u0003jz\u008f\u00ad£\u0017Ç\u007fäª\u0018\u0016<\\QêuXi\u0004\u008eö¢®Æmû±\u001fõ3IP\u0080tòhT\u008dÆ¡ñÅ-ú\u009c\u001eà28W\u0084Kßo;\u0083i äÄ6ø~\u001dØ1VU#_¤Cõg\u0011\u000bt.àÒ(öX\u0099à½2¡KD\u009ch&\fN/\u009bÓ'÷m\u009aÛ¾i¢5EÇi\u009f\rY0\u008fÔ×øi\u009b´¿È£\"F£jË\u000eY1¾ÕÂù\u0002\u009c¶\u0080ÿ¤OHvkÂ\u000f\t3UÖÇú?\u009eX\u0081â¥7I]lÞ\u001054R×\u009aû'\u009f?\u0082\u0088¦$Jum\u0099\u0011Á5}Ø\u0096üÒà`\u0083\u009d§ÏKwn±\u0012\u009f6ZCL_\u001d{ù\u0017\u009c2\bÎÀê°\u0085\b¡Ú½£XttÎ\u0010¦3sÏÏë\u0085\u00863¢\u0081¾ÝY/uw\u0011²,hÈ2ä\u0096\u0087U£e¿\u008cZPv>\u0012±-MÉ.åá\u0080\u0017\u009cR\u0094\u0091\u0088Í¬1ÀjåÐ\u0019,=lRÛv$jv\u008f¸£\nÇpä¬\u0018\u001b<NQ¶u\u0018iK\u008eµ¢ý\u0094j\u00886¬ÊÀ\u0091å7\u0019Å=\u008fR%vòj\u0089\u008fN£ÖÇ\u0082äJ\u0018ê<²QPuéi¾\u008eT¢\u001cÆ©ûE\u001f\u000f\u0094\u009b\u0088Å¬'\u0094©\u0088ü\u0094\u009b\u0088Å\u001b\u0005\u0007K#¥OôjO\u0096\u009b\u0094\u0091\u0088Ó¬1ÀjåÊ\u0019\u0004=oRÙv.jx\u008f¸£\u0006K\u0002WLs±\u001f÷:YÆ\u0081p,lwH\u0094$Ë\u0001lý¹ÙÖ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1205);
        f23114k = cArr;
        f23118o = 8351055698547738785L;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        Context context = (Context) objArr[0];
        synchronized (f23113j) {
            if (f.a()) {
                Object[] objArr2 = new Object[1];
                s((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 142 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 23 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                s((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 251), 1143 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr3);
                f.c(strIntern, ((String) objArr3[0]).intern());
            }
            List<Long> list = f23115l;
            if (list != null) {
                list.clear();
            }
            SharedPreferences.Editor editorEdit = i(context).edit();
            Object[] objArr4 = new Object[1];
            s((char) Color.argb(0, 0, 0, 0), TextUtils.getCapsMode("", 0, 0) + 1167, 4 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr4);
            editorEdit.remove(((String) objArr4[0]).intern()).commit();
        }
        return null;
    }

    private static Set<d> e(o.dk.a aVar, SharedPreferences sharedPreferences, h... hVarArr) throws Throwable {
        boolean z2;
        String strIntern;
        int i2 = 2;
        int i3 = 2 % 2;
        char c2 = '0';
        long j2 = 0;
        if (f.a()) {
            Object[] objArr = new Object[1];
            s((char) TextUtils.getCapsMode("", 0, 0), 142 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), Color.alpha(0) + 23, objArr);
            String strIntern2 = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            s((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), View.resolveSize(0, 0) + 498, 45 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
            StringBuilder sbAppend = sb.append(((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            s((char) (Process.myTid() >> 22), 542 - View.MeasureSpec.getMode(0), 3 - View.getDefaultSize(0, 0), objArr3);
            StringBuilder sbAppend2 = sbAppend.append(m.d(((String) objArr3[0]).intern(), (Object[]) hVarArr));
            Object[] objArr4 = new Object[1];
            s((char) (30051 - Process.getGidForName("")), ImageFormat.getBitsPerPixel(0) + 546, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr4);
            f.c(strIntern2, sbAppend2.append(((String) objArr4[0]).intern()).toString());
        }
        Set<d> setA = a(aVar, sharedPreferences);
        HashSet hashSet = new HashSet(setA.size());
        for (d dVar : setA) {
            if (m.c.e(dVar.a(), hVarArr) && dVar.d()) {
                int i4 = f23119p + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f23117n = i4 % 128;
                int i5 = i4 % i2;
                z2 = true;
            } else {
                int i6 = f23119p + 117;
                f23117n = i6 % 128;
                int i7 = i6 % i2;
                z2 = false;
            }
            if (z2) {
                hashSet.add(dVar);
            }
            if (f.a()) {
                Object[] objArr5 = new Object[1];
                s((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1))), 141 - View.resolveSizeAndState(0, 0, 0), TextUtils.lastIndexOf("", c2) + 24, objArr5);
                String strIntern3 = ((String) objArr5[0]).intern();
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr6 = new Object[1];
                s((char) Drawable.resolveOpacity(0, 0), 547 - (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)) + 40, objArr6);
                StringBuilder sbAppend3 = sb2.append(((String) objArr6[0]).intern()).append(dVar.toString());
                Object[] objArr7 = new Object[1];
                s((char) (KeyEvent.getDeadChar(0, 0) + 25335), TextUtils.getCapsMode("", 0, 0) + IptcDirectory.TAG_OBJECT_CYCLE, 4 - (ViewConfiguration.getEdgeSlop() >> 16), objArr7);
                StringBuilder sbAppend4 = sbAppend3.append(((String) objArr7[0]).intern());
                if (!z2) {
                    Object[] objArr8 = new Object[1];
                    s((char) (View.resolveSize(0, 0) + 22673), 591 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 4 - Gravity.getAbsoluteGravity(0, 0), objArr8);
                    strIntern = ((String) objArr8[0]).intern();
                } else {
                    strIntern = "";
                }
                StringBuilder sbAppend5 = sbAppend4.append(strIntern);
                Object[] objArr9 = new Object[1];
                s((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), Color.blue(0) + 595, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7, objArr9);
                f.c(strIntern3, sbAppend5.append(((String) objArr9[0]).intern()).toString());
            }
            i2 = 2;
            c2 = '0';
            j2 = 0;
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[PHI: r1
  0x0044: PHI (r1v5 o.dj.d) = (r1v2 o.dj.d), (r1v7 o.dj.d) binds: [B:25:0x007c, B:19:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.dj.d e(o.dk.a r9, android.content.SharedPreferences r10, java.lang.String r11) {
        /*
            r4 = 2
            int r0 = r4 % r4
            int r0 = o.dj.c.f23119p
            int r3 = r0 + 93
            int r0 = r3 % 128
            o.dj.c.f23117n = r0
            int r3 = r3 % r4
            r2 = 1965818903(0x752c0417, float:2.1805616E32)
            r1 = -201575712(0xfffffffff3fc32e0, float:-3.9962484E31)
            r0 = 1585614218(0x5e828d8a, float:4.7036635E18)
            if (r3 == 0) goto L55
            java.lang.Object[] r6 = new java.lang.Object[]{r9, r10, r11}
            int r7 = o.dj.c.f23104a
            int r7 = r7 * r0
            o.dj.c.f23104a = r7
            int r10 = o.dj.c.f23109f
            int r10 = r10 * r1
            o.dj.c.f23109f = r10
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            int r5 = r0.getPriority()
            int r11 = o.dj.c.f23111h
            int r11 = r11 * r2
            o.dj.c.f23111h = r11
            r9 = 387887894(0x171eb316, float:5.127859E-25)
            r8 = -387887892(0xffffffffe8e14cec, float:-8.5116113E24)
            java.lang.Object r1 = b(r5, r6, r7, r8, r9, r10, r11)
            o.dj.d r1 = (o.dj.d) r1
            r0 = 72
            int r0 = r0 / 0
            if (r1 == 0) goto L4a
        L44:
            boolean r0 = r1.d()
            if (r0 == 0) goto L7f
        L4a:
            int r0 = o.dj.c.f23119p
            int r1 = r0 + 115
            int r0 = r1 % 128
            o.dj.c.f23117n = r0
            int r1 = r1 % r4
            r0 = 0
            return r0
        L55:
            java.lang.Object[] r6 = new java.lang.Object[]{r9, r10, r11}
            int r7 = o.dj.c.f23104a
            int r7 = r7 * r0
            o.dj.c.f23104a = r7
            int r10 = o.dj.c.f23109f
            int r10 = r10 * r1
            o.dj.c.f23109f = r10
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            int r5 = r0.getPriority()
            int r11 = o.dj.c.f23111h
            int r11 = r11 * r2
            o.dj.c.f23111h = r11
            r9 = 387887894(0x171eb316, float:5.127859E-25)
            r8 = -387887892(0xffffffffe8e14cec, float:-8.5116113E24)
            java.lang.Object r1 = b(r5, r6, r7, r8, r9, r10, r11)
            o.dj.d r1 = (o.dj.d) r1
            if (r1 == 0) goto L4a
            goto L44
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dj.c.e(o.dk.a, android.content.SharedPreferences, java.lang.String):o.dj.d");
    }

    public static void e(Context context) {
        synchronized (f23113j) {
            if (f.a()) {
                Object[] objArr = new Object[1];
                s((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf("", "", 0) + 141, TextUtils.indexOf((CharSequence) "", '0', 0) + 24, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                s((char) ExpandableListView.getPackedPositionType(0L), View.MeasureSpec.makeMeasureSpec(0, 0) + 1122, 20 - ImageFormat.getBitsPerPixel(0), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            c(d(context));
        }
    }

    public static void e(Context context, Long l2) throws Throwable {
        Object[] objArr = {context, l2};
        int i2 = f23110g * 853602821;
        f23110g = i2;
        int iMyPid = Process.myPid();
        int id = (int) Thread.currentThread().getId();
        int i3 = f23112i * 693335188;
        f23112i = i3;
        b(id, objArr, i2, 901275581, -901275578, iMyPid, i3);
    }

    private static void e(Context context, List<Long> list) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f23117n + 67;
        f23119p = i3 % 128;
        int i4 = i3 % 2;
        f23115l = list;
        o.ef.c cVarD = m.d((List<?>) list);
        SharedPreferences.Editor editorEdit = i(context).edit();
        Object[] objArr = new Object[1];
        s((char) (ViewConfiguration.getLongPressTimeout() >> 16), 1166 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 3 - KeyEvent.getDeadChar(0, 0), objArr);
        editorEdit.putString(((String) objArr[0]).intern(), cVarD.b()).commit();
        int i5 = f23119p + 33;
        f23117n = i5 % 128;
        int i6 = i5 % 2;
    }

    private static List<Long> g(Context context) {
        synchronized (f23113j) {
            if (f23115l == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    SharedPreferences sharedPreferencesI = i(context);
                    Object[] objArr = new Object[1];
                    s((char) Color.alpha(0), Color.alpha(0) + 1167, 3 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    s((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString("") + 1170, 2 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
                    String string = sharedPreferencesI.getString(strIntern, ((String) objArr2[0]).intern());
                    if (!string.isEmpty()) {
                        o.ef.c cVar = new o.ef.c(string);
                        int i2 = 0;
                        while (true) {
                            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                            int i3 = o.ef.c.f23799b * 1567746851;
                            o.ef.c.f23799b = i3;
                            int i4 = 1136425123 * o.ef.c.f23798a;
                            o.ef.c.f23798a = i4;
                            if (i2 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i4, i3, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar})).intValue()) {
                                break;
                            }
                            arrayList.add(cVar.c(i2));
                            i2++;
                        }
                    }
                    return arrayList;
                } catch (o.ef.b unused) {
                    SharedPreferences.Editor editorEdit = i(context).edit();
                    Object[] objArr3 = new Object[1];
                    s((char) View.resolveSize(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 1167, 2 - Process.getGidForName(""), objArr3);
                    editorEdit.remove(((String) objArr3[0]).intern()).commit();
                    arrayList.clear();
                    f23115l = arrayList;
                }
            }
            return f23115l;
        }
    }

    private static SharedPreferences i(Context context) throws Throwable {
        SharedPreferences sharedPreferences;
        int i2 = 2 % 2;
        int i3 = f23117n + 85;
        f23119p = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            s((char) (53732 / TextUtils.indexOf((CharSequence) "", '#', 0, 0)), 18 / ImageFormat.getBitsPerPixel(0), 87 << (Process.myTid() / 117), objArr);
            Object[] objArr2 = {((String) objArr[0]).intern(), 1};
            Method method = Class.forName(Ig.wd("1\u000f`MW\f!\u0019z\npN\u0010%|\u000f~'|\u0019F0\u0004", (short) (C1580rY.Xd() ^ (-16441)))).getMethod(C1561oA.Qd("OLZ8LDTFD/PBB@L>F:;H", (short) (OY.Xd() ^ 6412)), Class.forName(EO.Od("8\b-1(\fn]\u000eq\u001bXA0'|", (short) (FB.Xd() ^ 20521))), Integer.TYPE);
            try {
                method.setAccessible(true);
                sharedPreferences = (SharedPreferences) method.invoke(context, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            Object[] objArr3 = new Object[1];
            s((char) (53732 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), ImageFormat.getBitsPerPixel(0) + 71, 71 - (Process.myTid() >> 22), objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            short sXd = (short) (Od.Xd() ^ (-4396));
            short sXd2 = (short) (Od.Xd() ^ (-27430));
            int[] iArr = new int["iwn}{vr=s\u0001\u0001\by\u0004\u000bE[\t\t\u0010\u0002\u0016\u0013".length()];
            QB qb = new QB("iwn}{vr=s\u0001\u0001\by\u0004\u000bE[\t\t\u0010\u0002\u0016\u0013");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK((xuXd.CK(iKK) - (sXd + i4)) - sXd2);
                i4++;
            }
            Object[] objArr4 = {strIntern, 0};
            Method method2 = Class.forName(new String(iArr, 0, i4)).getMethod(C1561oA.Kd("TScCYSeYYFi]__makads", (short) (OY.Xd() ^ 3141)), Class.forName(C1561oA.od("|r\u0007p<ymyq7[{xnrj", (short) (C1607wl.Xd() ^ 16324))), Integer.TYPE);
            try {
                method2.setAccessible(true);
                sharedPreferences = (SharedPreferences) method2.invoke(context, objArr4);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        int i5 = f23117n + 17;
        f23119p = i5 % 128;
        if (i5 % 2 != 0) {
            return sharedPreferences;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{39, 50, 101, -97};
        $$b = Mp4VideoDirectory.TAG_COLOR_TABLE;
    }

    private static void s(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        int i5 = $11 + 1;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (oVar.f19947b < i3) {
            int i7 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f23114k[i2 + i7])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 743, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 12 - (ViewConfiguration.getPressedStateDuration() >> 16), 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f23118o), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a(766 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0') + 12471), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11, 1946853218, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    objA3 = o.d.d.a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 386, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 17, 39570797, false, $$c(b6, (byte) ((-1) - (((-1) - b6) & ((-1) - 6))), b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        int i8 = $10 + 51;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        while (oVar.f19947b < i3) {
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b7 = (byte) 0;
                objA4 = o.d.d.a(435 - AndroidCharacter.getMirror('0'), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 17, 39570797, false, $$c(b7, (byte) ((b7 + 6) - (6 & b7)), b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }
}
