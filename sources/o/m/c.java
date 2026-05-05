package o.m;

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
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethod;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    public static int f26413a = 0;

    /* JADX INFO: renamed from: b */
    public static int f26414b = 0;

    /* JADX INFO: renamed from: c */
    public static int f26415c = 0;

    /* JADX INFO: renamed from: d */
    public static int f26416d = 0;

    /* JADX INFO: renamed from: e */
    public static int f26417e = 0;

    /* JADX INFO: renamed from: h */
    public static int f26418h = 0;

    /* JADX INFO: renamed from: i */
    private static c f26419i = null;

    /* JADX INFO: renamed from: j */
    private static char[] f26420j = null;

    /* JADX INFO: renamed from: k */
    private static int f26421k = 0;

    /* JADX INFO: renamed from: l */
    private static int f26422l = 0;

    /* JADX INFO: renamed from: m */
    private static int f26423m = 0;

    /* JADX INFO: renamed from: n */
    private static int f26424n = 0;

    /* JADX INFO: renamed from: o */
    private static long f26425o = 0;

    /* JADX INFO: renamed from: f */
    private final HashMap<i, h> f26426f = new HashMap<>();

    /* JADX INFO: renamed from: g */
    private o.ef.a f26427g;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r9, short r10, int r11) {
        /*
            int r0 = r11 * 3
            int r8 = 4 - r0
            int r0 = r9 * 2
            int r7 = r0 + 1
            int r0 = r10 + 99
            byte[] r6 = o.m.c.$$a
            byte[] r5 = new byte[r7]
            r4 = 0
            if (r6 != 0) goto L28
            r0 = r7
            r1 = r8
            r3 = r4
        L14:
            int r8 = r8 + r0
            int r1 = r1 + 1
            r2 = r3
        L18:
            int r3 = r2 + 1
            byte r0 = (byte) r8
            r5[r2] = r0
            if (r3 != r7) goto L25
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L25:
            r0 = r6[r1]
            goto L14
        L28:
            r2 = r4
            r1 = r8
            r8 = r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.c.$$c(byte, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f26418h = 1876428722;
        f26416d = 2038466542;
        f26413a = -795908627;
        f26417e = 1861371973;
        f26415c = -1374637811;
        f26414b = 537494866;
        f26422l = 0;
        f26423m = 1;
        f26421k = 0;
        f26424n = 1;
        f();
        AudioTrack.getMinVolume();
        MotionEvent.axisFromString("");
        ViewConfiguration.getScrollDefaultDelay();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        ExpandableListView.getPackedPositionForGroup(0);
        ViewConfiguration.getWindowTouchSlop();
        View.combineMeasuredStates(0, 0);
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getScrollFriction();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewConfiguration.getLongPressTimeout();
        KeyEvent.normalizeMetaState(0);
        MotionEvent.axisFromString("");
        ExpandableListView.getPackedPositionType(0L);
        ViewConfiguration.getLongPressTimeout();
        int i2 = f26422l + 95;
        f26423m = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 65 / 0;
        }
    }

    private c() {
    }

    private static /* synthetic */ Object a(Object[] objArr) throws Throwable {
        Object obj;
        Object obj2;
        Object obj3;
        c cVar = (c) objArr[0];
        Context context = (Context) objArr[1];
        int i2 = 2 % 2;
        Object[] objArr2 = new Object[1];
        p((char) (TextUtils.getTrimmedLength("") + 22170), Gravity.getAbsoluteGravity(0, 0), 35 - TextUtils.indexOf("", ""), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        o.ef.a aVar = cVar.f26427g;
        if (aVar != null) {
            return aVar;
        }
        Object[] objArr3 = new Object[1];
        p((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 61705), 847 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 48, objArr3);
        Object[] objArr4 = {((String) objArr3[0]).intern(), 0};
        Method method = Class.forName(Ig.wd("\u0014x\u0001*w\u001d\u007f)\u001cKPp\u000f\u0012L#_\u0016\\f\u0015w\u0012", (short) (C1580rY.Xd() ^ (-27810)))).getMethod(C1561oA.Qd("\u001b\u0018&\u0004\u0018\u0010 \u0012\u0010z\u001c\u000e\u000e\f\u0018\n\u0012\u0006\u0007\u0014", (short) (C1499aX.Xd() ^ (-29010))), Class.forName(EO.Od("\u0004TkrWj7\u001dX?Z&rk`\u007f", (short) (C1499aX.Xd() ^ (-1661)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr4);
            Object[] objArr5 = new Object[1];
            p((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 893 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14, objArr5);
            String string = sharedPreferences.getString(((String) objArr5[0]).intern(), "");
            if (string.isEmpty()) {
                if (o.ea.f.a()) {
                    int i3 = f26424n + 105;
                    f26421k = i3 % 128;
                    if (i3 % 2 != 0) {
                        Object[] objArr6 = new Object[1];
                        p((char) (TypedValue.complexToFloat(1) > 0.0f ? 1 : (TypedValue.complexToFloat(1) == 0.0f ? 0 : -1)), 24203 / (ViewConfiguration.getFadingEdgeLength() + 38), 110 << (ViewConfiguration.getTouchSlop() >> 13), objArr6);
                        obj3 = objArr6[0];
                    } else {
                        Object[] objArr7 = new Object[1];
                        p((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1018 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 64, objArr7);
                        obj3 = objArr7[0];
                    }
                    o.ea.f.c(strIntern, ((String) obj3).intern());
                }
                return new o.ef.a();
            }
            if (o.ea.f.a()) {
                int i4 = f26421k + 89;
                f26424n = i4 % 128;
                if (i4 % 2 == 0) {
                    Object[] objArr8 = new Object[1];
                    p((char) ExpandableListView.getPackedPositionType(0L), 24831 % ExpandableListView.getPackedPositionChild(0L), 7 >>> (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)), objArr8);
                    obj2 = objArr8[0];
                } else {
                    Object[] objArr9 = new Object[1];
                    p((char) ExpandableListView.getPackedPositionType(0L), ExpandableListView.getPackedPositionChild(0L) + PhotoshopDirectory.TAG_PRINT_STYLE, 53 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr9);
                    obj2 = objArr9[0];
                }
                o.ea.f.c(strIntern, ((String) obj2).intern());
            }
            String strC = new o.dk.a(context).c(string);
            if (o.ea.f.a()) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr10 = new Object[1];
                p((char) (TextUtils.getCapsMode("", 0, 0) + 42549), 1133 - Process.getGidForName(""), Color.blue(0) + 45, objArr10);
                o.ea.f.c(strIntern, sb.append(((String) objArr10[0]).intern()).append(strC).toString());
            }
            if (strC != null && !strC.isEmpty()) {
                try {
                    o.ef.a aVar2 = new o.ef.a(strC);
                    cVar.f26427g = aVar2;
                    return aVar2;
                } catch (o.ef.b e2) {
                    if (o.ea.f.a()) {
                        Object[] objArr11 = new Object[1];
                        p((char) Color.green(0), 1244 - View.resolveSizeAndState(0, 0, 0), 19 - View.MeasureSpec.getSize(0), objArr11);
                        o.ea.f.e(strIntern, ((String) objArr11[0]).intern(), e2);
                    }
                    return new o.ef.a();
                }
            }
            if (o.ea.f.a()) {
                int i5 = f26421k + 97;
                f26424n = i5 % 128;
                if (i5 % 2 == 0) {
                    Object[] objArr12 = new Object[1];
                    p((char) ((Process.myTid() + 102) * 23810), (SystemClock.elapsedRealtimeNanos() > 1L ? 1 : (SystemClock.elapsedRealtimeNanos() == 1L ? 0 : -1)) * 28643, 33 - View.getDefaultSize(0, 1), objArr12);
                    obj = objArr12[0];
                } else {
                    Object[] objArr13 = new Object[1];
                    p((char) ((Process.myTid() >> 22) + 25899), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1178, 65 - View.getDefaultSize(0, 0), objArr13);
                    obj = objArr13[0];
                }
                o.ea.f.d(strIntern, ((String) obj).intern());
            }
            return new o.ef.a();
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static void c(o.en.b bVar, boolean z2, Collection<h> collection, boolean z3) throws Throwable {
        Object obj;
        int i2 = 2;
        int i3 = 2 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            p((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 22170), ViewConfiguration.getScrollBarSize() >> 8, Color.red(0) + 35, objArr);
            String strIntern = ((String) objArr[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr2 = new Object[1];
            p((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1514 - (ViewConfiguration.getWindowTouchSlop() >> 8), 25 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
            o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(z3).toString());
        }
        int i4 = o.en.b.f24090e * (-1580596594);
        o.en.b.f24090e = i4;
        int i5 = o.en.b.f24087b * (-2071415875);
        o.en.b.f24087b = i5;
        o.fr.b bVarC = ((o.fr.e) o.en.b.a(342371170, i4, new Object[]{bVar}, i5, -342371167, Process.myUid(), new Random().nextInt(460146032))).c();
        int i6 = f26421k + 123;
        f26424n = i6 % 128;
        int i7 = i6 % 2;
        for (h hVar : collection) {
            if (!(!o.ea.f.a())) {
                Object[] objArr3 = new Object[1];
                p((char) (TextUtils.getOffsetBefore("", 0) + 22170), View.MeasureSpec.makeMeasureSpec(0, 0), (Process.myPid() >> 22) + 35, objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                p((char) (58338 - (ViewConfiguration.getTouchSlop() >> 8)), 1539 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), View.MeasureSpec.getSize(0) + 46, objArr4);
                String strIntern3 = ((String) objArr4[0]).intern();
                i iVarD = hVar.d();
                String strM = hVar.m();
                if (z2) {
                    int i8 = f26424n + 107;
                    f26421k = i8 % 128;
                    int i9 = i8 % i2;
                    Object[] objArr5 = new Object[1];
                    p((char) (Color.argb(0, 0, 0, 0) + 18331), 1337 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 10 - (KeyEvent.getMaxKeyCode() >> 16), objArr5);
                    obj = objArr5[0];
                } else {
                    Object[] objArr6 = new Object[1];
                    p((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23084), 1347 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr6);
                    obj = objArr6[0];
                }
                o.ea.f.c(strIntern2, String.format(strIntern3, iVarD, strM, ((String) obj).intern()));
                int i10 = f26421k + 113;
                f26424n = i10 % 128;
                int i11 = i10 % 2;
            }
            if (z3) {
                bVarC.e(hVar.d(), z2);
                if (z2) {
                    hVar.a(b.f26400a);
                } else {
                    hVar.a(b.f26402c);
                    try {
                        if (hVar instanceof k) {
                            int i12 = f26421k + 93;
                            f26424n = i12 % 128;
                            if (i12 % 2 == 0) {
                                ((k) hVar).k();
                                int i13 = 64 / 0;
                            } else {
                                ((k) hVar).k();
                            }
                        }
                    } catch (e unused) {
                        if (o.ea.f.a()) {
                            Object[] objArr7 = new Object[1];
                            p((char) (22170 - Color.argb(0, 0, 0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 1, ExpandableListView.getPackedPositionGroup(0L) + 35, objArr7);
                            String strIntern4 = ((String) objArr7[0]).intern();
                            StringBuilder sb2 = new StringBuilder();
                            Object[] objArr8 = new Object[1];
                            p((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), ExpandableListView.getPackedPositionChild(0L) + 1585, Color.red(0) + 34, objArr8);
                            o.ea.f.d(strIntern4, sb2.append(((String) objArr8[0]).intern()).append(hVar.d()).toString());
                        }
                    }
                }
                i2 = 2;
            } else if (z2) {
                int i14 = f26421k + 3;
                f26424n = i14 % 128;
                i2 = 2;
                int i15 = i14 % 2;
                try {
                    if (hVar instanceof k) {
                        ((k) hVar).k();
                    }
                } catch (e unused2) {
                    if (o.ea.f.a()) {
                        Object[] objArr9 = new Object[1];
                        p((char) (22169 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), ViewConfiguration.getMaximumFlingVelocity() >> 16, 34 - ExpandableListView.getPackedPositionChild(0L), objArr9);
                        String strIntern5 = ((String) objArr9[0]).intern();
                        StringBuilder sb3 = new StringBuilder();
                        Object[] objArr10 = new Object[1];
                        p((char) Drawable.resolveOpacity(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1584, 35 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr10);
                        o.ea.f.d(strIntern5, sb3.append(((String) objArr10[0]).intern()).append(hVar.d()).toString());
                    }
                }
            } else {
                i2 = 2;
            }
        }
    }

    public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~i4;
        int i9 = ~((i8 + i5) - (i8 & i5));
        int i10 = ~i6;
        int i11 = (-1) - (((-1) - i9) & ((-1) - (~((i10 + i5) - (i10 & i5)))));
        int i12 = ~i5;
        int i13 = ~((i12 + i10) - (i12 & i10));
        int i14 = ~(i12 | i4);
        int i15 = (-1) - (((-1) - (~(i10 | i4))) & ((-1) - ((-1) - (((-1) - i13) & ((-1) - i14)))));
        int i16 = (~(i6 | i12)) | i14;
        int i17 = i4 + i5 + i7 + (1039959776 * i3) + ((-2046201414) * i2);
        int i18 = i17 * i17;
        int i19 = ((357140864 * i4) - 8388608) + ((-1785926397) * i5) + ((-2146011519) * i11) + (i15 * 2146011519) + (2146011519 * i16) + ((-1788870656) * i7) + ((-201326592) * i3) + ((-406847488) * i2) + (529399808 * i18);
        int i20 = ((i4 * 868240256) - 1765242424) + (i5 * 868238279) + (i11 * (-659)) + (i15 * 659) + (i16 * 659) + (i7 * 868239597) + (i3 * 817356128) + (i2 * 406493490) + (i18 * 645267456);
        int i21 = i19 + (i20 * i20 * 681705472);
        if (i21 == 1) {
            return e(objArr);
        }
        if (i21 == 2) {
            return d(objArr);
        }
        if (i21 != 3) {
            return a(objArr);
        }
        c cVar = (c) objArr[0];
        Context context = (Context) objArr[1];
        o.en.b bVar = (o.en.b) objArr[2];
        int i22 = 2 % 2;
        int i23 = f26424n + 91;
        f26421k = i23 % 128;
        int i24 = i23 % 2;
        int iActiveCount = Thread.activeCount();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        o.ef.a aVar = (o.ef.a) d((int) Process.getElapsedCpuTime(), Thread.currentThread().getPriority(), -1764130032, 1764130032, iActiveCount, elapsedCpuTime, new Object[]{cVar, context});
        int i25 = o.en.b.f24090e * (-1580596594);
        o.en.b.f24090e = i25;
        int i26 = o.en.b.f24087b * (-2071415875);
        o.en.b.f24087b = i26;
        o.fr.b bVarC = ((o.fr.e) o.en.b.a(342371170, i25, new Object[]{bVar}, i26, -342371167, Process.myUid(), new Random().nextInt(460146032))).c();
        for (h hVar : cVar.f26426f.values()) {
            hVar.a(context, bVarC.b(hVar.d()), aVar.v(hVar.d().a()));
            int i27 = f26421k + 25;
            f26424n = i27 % 128;
            int i28 = i27 % 2;
        }
        new o.dt.d();
        o.dt.d.b().e();
        return null;
    }

    private static /* synthetic */ Object d(Object[] objArr) throws Throwable {
        h next;
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f26421k + 45;
        f26424n = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f26421k + 41;
            f26424n = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr2 = new Object[1];
            p((char) (22170 - View.MeasureSpec.getMode(0)), Color.rgb(0, 0, 0) + 16777216, 35 - ExpandableListView.getPackedPositionType(0L), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            p((char) (42590 - TextUtils.lastIndexOf("", '0')), 659 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getEdgeSlop() >> 16) + 14, objArr3);
            o.ea.f.c(strIntern, ((String) objArr3[0]).intern());
        }
        Iterator<h> it = cVar.f26426f.values().iterator();
        int i7 = f26424n + 3;
        f26421k = i7 % 128;
        int i8 = i7 % 2;
        while (it.hasNext()) {
            int i9 = f26421k + 67;
            f26424n = i9 % 128;
            if (i9 % 2 == 0) {
                next = it.next();
                try {
                    int i10 = 48 / 0;
                    if (next instanceof k) {
                        ((k) next).k();
                    }
                } catch (e e2) {
                    if (o.ea.f.a()) {
                        Object[] objArr4 = new Object[1];
                        p((char) (22170 - View.MeasureSpec.getMode(0)), ViewConfiguration.getScrollBarSize() >> 8, Color.blue(0) + 35, objArr4);
                        String strIntern2 = ((String) objArr4[0]).intern();
                        Object[] objArr5 = new Object[1];
                        p((char) View.resolveSize(0, 0), 673 - KeyEvent.getDeadChar(0, 0), 37 - TextUtils.indexOf((CharSequence) "", '0'), objArr5);
                        o.ea.f.e(strIntern2, ((String) objArr5[0]).intern(), e2);
                    }
                }
            } else {
                next = it.next();
                if (next instanceof k) {
                    ((k) next).k();
                }
            }
        }
        return null;
    }

    public static synchronized c d() {
        c cVar;
        int i2 = 2 % 2;
        int i3 = f26421k + 11;
        f26424n = i3 % 128;
        int i4 = i3 % 2;
        if (f26419i == null) {
            f26419i = new c();
        }
        cVar = f26419i;
        int i5 = f26421k + 41;
        f26424n = i5 % 128;
        int i6 = i5 % 2;
        return cVar;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        HashMap map = new HashMap();
        for (h hVar : cVar.e().values()) {
            map.put(hVar.d().d(), new CustomerAuthenticationMethod(hVar));
            int i3 = f26424n + 1;
            f26421k = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = f26424n + 117;
        f26421k = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        throw null;
    }

    static void f() {
        char[] cArr = new char[1840];
        ByteBuffer.wrap("Â+\u0014~nÝA5\u009b\u008bíêÄ_\u001e¯q1Kf\u009dÂôAÎ©!\u0001{vMÌ¤;þ\u009aÐê+X}»T\u0019®§\u0080èÛT-«\u0004\t^}°ñ\u008b>Ý\u009c7ô\u000eo`Î»<?zé\u001c\u0093\u00ad¼Gf÷\u0010\u00859\u001eãÌ\u008cz¶'`´\t:3ßÜa\u0086\u000b°¥YL\u0003¼-ÔÖv\u0080Ý©uSú}Ê&2ÐÔùe£\u001fM¯v]±!gG\u001dö2\u001cè¬\u009eÞ·Em\u0097\u0002!8|îï\u0087a½\u0084R:\bP>þ×\u0017\u008dç£\u008fX-\u000e\u008b'=Ý»ó\u0091¨z^\u008dw5-HÃ ø\u000e®¯DÙ}\u0014\u0013ÿÈ\u0013þ®\u0094\u0098Muc\u0089\u00185Î\fäí\u009d\u000f³\u0090h>\u001e\u00134ìí\u001c\u0083°¹Õnk\u0004\u0088=>ÓN\u0089Ò¾1T\u0095\r1#\u001aÙñ\u008e\b¤¦Z\u008esz)ñÞ\u0003ô¦ªÔCvy\u009c.5Ä\rú¬\u0093\u0006I¾~u\u0014YÊàã^\u0099«OÁdj\u001a\u008d3;éM\u009fï\u001bpÍ\u0016·§\u0098MBý4\u008f\u001d\u0014ÇÆ¨p\u0092-D¾-0\u0017Õøk¢\u0001\u0094¯}F'¶\tÞò|¤Ú\u008dlwêYÀ\u0002+ôÜÝd\u0087\u0019iñRA\u0004úî\u008c×\u0011¹¯bMTë>Éç\"ÉÖ²cd]N¼7^\u0019ÁÂo´B\u009e½GM)á\u0013\u0084Ä:®Ù\u0097oy\u001f#\u0083\u0014`þÄ§`\u0089Ks $Y\u000e÷ðßÙ5\u0083¤tV^¯\u0000Ìé ÓÞ\u00847n\u0019P®9\u001eãîÔt¾\u0005`£I[3íå\u0091\u001asÌ\u0015¶¤\u0099NCþ5\u008c\u001c\u0017ÆÅ©s\u0093.E½,3\u0016Öùh£\u0002\u0095¬|E&µ\bÝó\u007f¥Ù\u008covéXÃ\u0003(õßÜg\u0086\u001ahòSB\u0005ùï\u008fÖ\u0012¸¬cNUè?Êæ!ÈÕ³`e^O³6W\u0018ÓÃ\"µ\u0003\u009f©FN(ø\u0012ÕÅ\"¯Ú\u0096nx\u000b\"\u008d\u0015&ÿØ¦h\u0088\fr÷%[\u000fÿñÜØ/\u0082®u@_ \u0001\u0082è+ÒÙ\u00858oSQ¿8\u001dâöÕb¿\u0015aáHE2ÿä\u0093Ï8±\u0090\u0098vB\t4ù\u001f'ÁÑ¨k\u0092\fD¼/R\u0011öxx®\u001eÔ¯ûE!õW\u0087~\u001c¤ÎËxñ7'§N8tÌ\u009bgÁ\u0017÷´\u001e~Dñj\u008e\u0091:ÇÅî2\u0014¢:Èa7\u0097Ã¾bä\u0018\n°1Tgð\u008dÐ´\u0003Ú«\u0001\\7¤]\u008c\u0084#ªÏì\u0001:g@Öo<µ\u008cÃþêe0·_\u0001eN³ÞÚAàµ\u000f\u001eUncÍ\u008a\u0007Ð\u0088þ÷\u0005CS¼zK\u0080Û®±õQ\u0003º*\bpb\u009eÉ¥-ó\u0089\u0019© zNÒ\u0095%£ÝÉõ\u0010Z>¶EA\u0093x¹ÀÀjî¡5\u0018Cvi\u009e°<Þ\u009cäî3QY¹`\u0001\u008eeÔñã\u0011\t³P\u0011~\u007f\rºÛÜ¡m\u008e\u0087T7\"E\u000bÞÑ\f¾º\u0084õRe;ú\u0001\u000eî¥´Õ\u0082vk¼13\u001fLäø²\u0007\u009bða`O\n\u0014Éâ\u000bËá\u0091Ó\u007f~D\u008c\u0012=ø]ÁË¯,t\u008aB)(Qñòß\u0018¤©rÇX{!\u009f\u000f\nÔ¢¢Æ\u0088bQÂ?+\u0005SÒ¹¸\u0002\u0081»oÕ5\r\u0002¯è\u0014±ä\u009fÉe\u007f2\u0088\u0018xæWÏ÷\u0095jb\u0082Hi\u0016@ÿìÅ\u0015\u0092³xÞF;/Ôõ\"Â¥¨Âvx_\u0095%+óQØû\u0094\u0087Bá8P\u0017ºÍ\n»x\u0092ãH1'\u0087\u001dÈËX¢Ç\u00983w\u0098-è\u001bKò\u0081¨\u000e\u0086q}Å+:\u0002Íø]Ö7\u008dÙ{/R\u0091\b£æ@Ý·\u008b\u0007abX²6Bí±Û\u000f±jhÔF.=\u0080ëªÁF¸ª\u0096sMÓ;æ\u0011\u0018È·¦\u0003\u009crK\u0084!)\u0018\u008böè¬~\u009b\u0097q((\u009c\u0006èüQ«¯\u0081\u0000\u007f~VÊ\fVûñÑ\u001d\u008fuf\u009e\\)\u000b\u0088áâß\n¶¤l\r[\u00831ºï\u0015Æ±¼\u000bjqA\u0081?'\u0016\u009eÌüº_\u0091ÕO9&\u008e\u001c¹Ê]¡·\u009f\u0012u`,Å\u001a?ñ¦¯Q\u0085w|Ô*+\u0001\u0093ÿôÕ\u0007\u008c£z\u001aP,\u000fæåFÜ±\u008a\u0019`k_Ç5%¶Ò`´\u001a\u00055ïï_\u0099-°¶jd\u0005Ò?\u009dé\r\u0080\u0092ºfUÍ\u000f½9\u001eÐÔ\u008a[¤$_\u0090\to \u0098Ú\bôb¯\u009aY|pÍ*·Ä\u0007ÿõ©\u001dC9z¨\u0014\tÏñùB\u0093.J\u009cdp\u001fÖ2Ëä¢\u009e\u001e±÷kI\u001d\t4\u009aîa\u0081Æ»¢m\u001c\u0004\u009e>lÑÙ\u0094\u0094Bý8A\u0017¨Í\u0016»V\u0092ÅH>'\u0099\u001dýËC¢Á\u00983w\u0086-¸\u001b\u0005òâ¨\u0004\u0086|}È++\u0002\u009dø\u0004Ö~\u008dÕ{7RÜ\bææHÝ¦\u008b\u0007azXü6Eí±Û\t±{hÙ\u0094\u0080Bô8R\u0017©Í\u001b»n\u0092ÈH\n'\u008f\u001dýËD¢Ü\u00982w\u0086-×\u001bQò\u0090¨\u0004\u0086w}Þ+#\u0002\u0088\u0094\u0080Bô8R\u0017©Í\u001b»n\u0092ÈH\n'\u008f\u001dýËD¢Ü\u00982w\u0086-Í\u001bOò\u00ad¨\u000f\u0086G}Ù+7\u0002\u009dø\u0004Öx\u008dù{6R\u0091\bóæSÝ±\u008b\ta{Xû6^íº\u0094\u0080Bô8R\u0017©Í\u001b»n\u0092ÈH\n'\u008f\u001dýËD¢Ü\u00982w\u0086-×\u001bQò\u0090¨\u0004\u0086w}Û+!\u0002\u0083ø\u0003Ör\u008dù{6R\u0091\bîæGÝ«\u008b\f\u0089ü_\u0088%.\nÕÐg¦\u0012\u008f´Uv:ó\u0000\u0081Ö8¿ \u0085Njú0«\u0006-ïìµx\u009b\u000b`§6]\u001fÿå\u007fË\u000e\u0090\u0085fJOí\u0015\u0092û;À×\u0096p|SEÃ+mðâÆt¬\ru¯[\u001c Þö\u008eÜ6¥Õ\u008b_Pþ&\u0080\f+ÕÍe\u009e³éÉ\u0010æ°<\u001aJccÏ¹!Ö\u008fìó:\bSØi2\u0086\u008bÜ÷êY\u0003§Y\u001bwf\u008cÂÚ!ó\u008b\t\u0013'\u007f|Â\u008a2£\u0084ùð\u0017s,¼z\n\u0090d©êÇ^\u001cº*.@d\u0099Å·/Ì\u008b\u001aå0QI£g7¼\u009fÊúàA\u0094\u0091Bç8Y\u0017¶Í\u0019»o\u0092\u008eH$'\u009c\u001däËO¢Ü\u00988w\u0093³úe\u008c\u001f>0Ðêo\u009c\u0016µ¬o|\u0000ý:\u009fì2\u0085¢¿IP\u00ad\nÍ<gÕÉ\u008f|¡\u000eZº\fW%ùßañ\u0015ª§\\Eu¤/\u0091Á-úÒ¬~FW\u007fÐ\u0011i¶¢`Ô\u001af5\u0088ï7\u0099N°ôj$\u0005¥?Çéj\u0080úº\u0011Uõ\u000f\u00959?Ð\u0087\u008a,¤T_ÿ\t\u0017 íÚ\"ôR¯éY\u0016p©*ÑÄeÿ\u0080©;\u0081\rW{-É\u0002'Ø\u0098®á\u0087[]\u008b2\n\bhÞÅ·U\u008d¾bZ8:\u000e\u0090ç>½\u009a\u0093ähV>¨\u0017\fí\u0098Ã¸\u0098Vn¿G\u0003\u001ddóÌÈ8\u009e\u0082täM=#Ôø(Î\u009b¤ÿ}\u0012S»(\u0007þ%ÔÂ\u00ad*\u0083¯X\u0012\u0094\u0080Bô8U\u0017¿Í.»x\u0092ÒH4'\u0083\u001dúËX¢Ö\u00982w¶-÷\u001bQò¤¨\b\u0086c}\u008b+c\u0002Íø\u001eÖx\u008d\u009a{:R\u008a\bîæ\u0006Ý¦\u008b\u0007aaXô6Xí³Û[±mhÉF/=\u0095ëïÁM¸ì\u0096iMÖ;æ\u0011LÈ°¦\u0012\u009cqKÍ!%\u0018\u0089ö\u00ad¬`\u009bÅq5(\u009a\u0006ùüP«µ\u0081\f\u007ffVÈ\u0094\u0080Bô8U\u0017¿Í.»x\u0092ÒH4'\u0083\u001dúËX¢Ö\u00982w¶-÷\u001bQò¤¨\b\u0086c}\u008b+c\u0002Íø\u0011Ö7\u008dÙ{/R\u0091\b£æEÝª\u008b\u0006aiXû6VíôÛ\u0012±mh\u009dF3=\u0093ëåÁ[¸©\u00967MÖ;ú\u0011VÈÿ¦\u0006\u009chK×! 2µäÁ\u009e`±\u008ak\u001b\u001dM4çî\u0001\u0081¶»Ïmm\u0004ã>\u0007Ñ\u0083\u008bÂ½dT\u0091\u000e= VÛ¾\u008dV¤ø^!pG+ìÝ\u001eô°®Æ@g{\u0095-9Ç\u001aþÄ\u0090rK\u008c}n\u0017HÎçà\u001b\u009b´MÖg{\u001eÙ0\\ëãñ«'ß]~r\u0094¨\u0005ÞS÷ù-\u001fB¨xÑ®sÇýý\u0019\u0012\u009dHÜ~z\u0097\u008fÍ#ãH\u0018 NHgæ\u009d>³Qèá\u001e\u00067®m\u0088\u0083i¸\u008bî \u0004V=ÀSj\u0088\u008b¾5ÔQ\r¶#\bX£\u008eÏ¤dÝ\u008eó\u001f(¨^Ìtr\u00ad\u0080Ã ùE.áD@}è\u0093\u0086ÉRþû\u0014\u001fM½cÅ\u0099aÎ\u0083ä)\u001a\u00033íim\u0094\u0080Bô8U\u0017¿Í.»x\u0092ÒH4'\u0083\u001dúËX¢Ö\u00982w¶-÷\u001bQò¤¨\b\u0086c\u0094\u0082Bã8Q\u0017«Í\u001f»o\u0092ÅH\n'\u008f\u001dýËD¢Ü\u00982w³-÷\u001bMò\u0097¨\u0011\u0086`}Ê+:\u0002\u0088\u0094\u0082Bã8Q\u0017«Í\u001f»o\u0092ÅH\n'\u008f\u001dýËD¢Ü\u00982w³-÷\u001bMò\u0097¨\u0011\u0086`}Ê+:\u0002\u0088øPÖ:\u008d\u009a{4R\u0099\b÷æNÝª\u008b\fajX¯6\u0011íñÛ\b±>hÒF&=ÇëþÁP¸¼\u00966MÖ;°\u0011KÈÿ¦_\u009c!K\u0081!8Ó(\u0005i\u007fÛP)\u008a\u0093üçÕO\u000fµ`\u001eZ|Î\u009a\u0018ØbyM\u0094\u0097&áXÈú\u0012\n}²GÌ\u0091oøñ\\Z\u008a6ð\u009fßx\u001afÌ\u0007¶µ\u0099GCý5\u0089\u001c!Æ×©{\u0015äÃ\u0089¹0\u0096ÕLw:\u000f\u0013¯É_¦Ç\u009c\u0081J3#¢\u0019Böë¬®\u009a'sÆÕd\u00030y\u0095Vg\u008cßúîÓ\u0004\tüfP\\6\u008a\u009aã@Ùä6El?Z\u0085³géÓÇ£<\u001djÖC[¹Ú\u0097·Ì\u001d:å\u0013]I5§Õ\u009cpÊÔ ®\u0019aw¡¬Q\u009aåðíU¬\u0083Õù@Ö\u009e\f,zNSò\u0089\u001eæ©Ü×\nzcèY\u0012¶\u0084ìÝÚm3\u0090i\u0006GV¼îê\u0010Ãµ9#\u0017aLáº\u0002\u0093¤ÉÃ't\u001c\u0096J\u007f \u0015\u0099\u0085÷r,\u0091\u001a9pL©ª\u0087Müð*Ü\u0000>y\u0098W\u000b\u008c¬úÒÐc\t\u0081g4]X\u008açà\\Ù¸7ÏmSZè°\bé Çß=}j\u0092@3¾K\u0097ñÍj:\u0088\u0010cNA§ì\u009d\u001eÊ¿ ß\u001eywÞ\u00ad3\u009a¥ðÒ.\"\u0007\u008d}-«P\u0080øþS×º\rÖ{oPé\u008e\u0004\u0094\u009cBþ8@\u0017²Í\u0018»d\u0092ãH1'\u0087\u001dÜË\\¢×\u00987w\u0081-ý\u001bmò§¨\u0012\u0086q}Ç+:\u0002Íø]Ö7w~¡\u001cÛ¢ôP.úX\u0086q\u0001«ÓÄeþ>(¾A5{Õ\u0094cÎ\u001fø\u008f\u0011EKðe\u0093\u009e%ÈØá/\u001b¿5Õn\u001b\u0098í±SëA\u0005á>Thª\u0082\u0082»\u0016Õó\u000eB8àR\u008c\u008b:¥\u0082Þ \b\u001b\"ë[\u0013u\u0091®1Ø\u0004\u0094·Bã8F\u0017´Í\f»=\u0092×H/'\u0083\u001dåËI¢\u0093\u00980w\u0099-í\u001bLòª¨*\u0086a}Ò+=\u0002\u0099ø\u001fÖe\u008dß{yR\u009a\bìæTÝå\u008b+aYXß6\u0011\u0094\u0093Bò8@\u0017²Í\b»x\u0092áH2'\u009e\u001dáËI¢Ý\u0098\"w\u009c-û\u001b^ò¶¨\b\u0086k}Å+\u0003\u0002\u0088ø\u0004Ö\u007f\u008dÕ{=R\u008f\u0094\u0093Bå8@\u0017¾Í\u0013»m\u0092ÔHg'\u0089\u001dæËY¢Ý\u0098\"wÕ-ñ\u001bLòâ¨\u0013\u0086a}È++\u0002\u0084ø\u0006Ör\u008dÞ{yR\u009a\bìæTÝå\u008b\ta/Xñ6Gí¹Û[±jhÕF!=\u0093ëªÁM¸£\u00966M\u0085;µ\u0011VÈ°¦\u0016\u009c!KÀ!.\u0018\u0088öä¬~\u009bÒqz(\u0098\u0006¼üN«§\u0081\u001d\u007f(VÎ\fFû¥Ñ\u0011\u008fvfÎ\\)\u000bÀáäßE¶¼l\u0002[\u0087\u0094¡Bô8@\u0017ûÍ\u001d»o\u0092ÅH#'\u008f\u001dçËX¢Ú\u00987w\u0099-¸\u001bVò±¨A\u0086b}Ä+<\u0002\u008fø\u0019Ös\u008dÞ{<R\u0092\b£æ@Ýª\u008b\u001aa/Xæ6Yí±Û[±mhÍF%=\u0084ëãÁO¸¥\u00966M\u0092;µ\u0011YÈª¦\u0016\u009ciKÁ!%\u0018\u009aöä¬s\u009bÖq.(\u0090\u0006óüM«æ\u0081\b\u007fmVÛ\fZû¾Ñ\u0010\u0099eO:5\u0092\u001a8ÀÎ¶®\u009f\u0006Eç*@\u0010,Æ\u0086¯\u0015\u0095ñz\u0016 :\u0016\u0089ÿu¥Ê\u008b¢p\u0006&ù\u000fGõÐÛµ\u0080\rvó_P\u0005.ëÅÐk\u0086Îl¸U9;\u009dàsÖ\u0098¼´e\rK£0Jæ&Ì\u009eµ/\u009bñ@V6\"\u001c\u0092Åj«À\u0091¶F\u0002,ì".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1840);
        f26420j = cArr;
        f26425o = -7668416899414015343L;
    }

    private o.ef.c i() throws o.ef.b {
        int i2 = 2 % 2;
        o.ef.c cVar = new o.ef.c();
        Iterator<h> it = this.f26426f.values().iterator();
        while (!(!it.hasNext())) {
            int i3 = f26424n + 103;
            f26421k = i3 % 128;
            int i4 = i3 % 2;
            cVar.a(it.next().i());
        }
        int i5 = f26421k + 93;
        f26424n = i5 % 128;
        if (i5 % 2 != 0) {
            return cVar;
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{37, Ascii.SUB, MessagePack.Code.FLOAT32, 10};
        $$b = 138;
    }

    private static void p(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        o.a.o oVar = new o.a.o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            int i5 = oVar.f19947b;
            try {
                Object[] objArr2 = {Integer.valueOf(f26420j[i2 + i5])};
                Object objA = o.d.d.a(-214519724);
                if (objA == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objA = o.d.d.a(790 - AndroidCharacter.getMirror('0'), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), 12 - TextUtils.getOffsetAfter("", 0), 632508977, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f26425o), Integer.valueOf(c2)};
                Object objA2 = o.d.d.a(-1567654649);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objA2 = o.d.d.a((ViewConfiguration.getWindowTouchSlop() >> 8) + 766, (char) (12470 - KeyEvent.normalizeMetaState(0)), TextUtils.getOffsetBefore("", 0) + 12, 1946853218, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {oVar, oVar};
                Object objA3 = o.d.d.a(-723636472);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    objA3 = o.d.d.a(387 - View.MeasureSpec.getSize(0), (char) View.MeasureSpec.getSize(0), 18 - View.combineMeasuredStates(0, 0), 39570797, false, $$c(b6, (byte) ((-1) - (((-1) - b6) & ((-1) - 6))), b6), new Class[]{Object.class, Object.class});
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
        int i6 = $11 + 67;
        $10 = i6 % 128;
        while (true) {
            int i7 = i6 % 2;
            if (oVar.f19947b >= i3) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr5 = {oVar, oVar};
            Object objA4 = o.d.d.a(-723636472);
            if (objA4 == null) {
                byte b7 = (byte) 0;
                objA4 = o.d.d.a((KeyEvent.getMaxKeyCode() >> 16) + 387, (char) KeyEvent.getDeadChar(0, 0), 18 - (KeyEvent.getMaxKeyCode() >> 16), 39570797, false, $$c(b7, (byte) ((b7 + 6) - (6 & b7)), b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            i6 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            $10 = i6 % 128;
        }
    }

    public final List<h> a(f fVar) {
        h next;
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator<h> it = this.f26426f.values().iterator();
        int i3 = f26421k + 99;
        f26424n = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            int i5 = f26421k + 7;
            f26424n = i5 % 128;
            if (i5 % 2 == 0) {
                next = it.next();
                int i6 = 70 / 0;
                if (!(!next.a(fVar))) {
                    arrayList.add(next);
                }
            } else {
                next = it.next();
                if (next.a(fVar)) {
                    arrayList.add(next);
                }
            }
        }
        int i7 = f26424n + 97;
        f26421k = i7 % 128;
        if (i7 % 2 == 0) {
            return arrayList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<CustomerAuthenticationMethodType, CustomerAuthenticationMethod> a() {
        int i2 = f26414b * 1238623564;
        f26414b = i2;
        int i3 = f26415c * 616651361;
        f26415c = i3;
        int i4 = 397457117 * f26417e;
        f26417e = i4;
        return (Map) d((int) Runtime.getRuntime().maxMemory(), i4, -830210895, 830210896, i2, i3, new Object[]{this});
    }

    final o.ef.a a(Context context) {
        int iActiveCount = Thread.activeCount();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int priority = Thread.currentThread().getPriority();
        return (o.ef.a) d((int) Process.getElapsedCpuTime(), priority, -1764130032, 1764130032, iActiveCount, elapsedCpuTime, new Object[]{this, context});
    }

    public final boolean a(Context context, o.en.b bVar, o.bg.c cVar) throws Throwable {
        boolean zC;
        int i2 = 2 % 2;
        if (cVar.c() == o.bg.a.f21049r) {
            return false;
        }
        if (o.ea.f.a()) {
            int i3 = f26424n + 45;
            f26421k = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            p((char) (22170 - Color.argb(0, 0, 0, 0)), View.getDefaultSize(0, 0), 35 - (Process.myTid() >> 22), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p((char) View.resolveSize(0, 0), (Process.myTid() >> 22) + 768, Color.blue(0) + 31, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        int iActiveCount = Thread.activeCount();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        o.ef.a aVar = (o.ef.a) d((int) Process.getElapsedCpuTime(), Thread.currentThread().getPriority(), -1764130032, 1764130032, iActiveCount, elapsedCpuTime, new Object[]{this, context});
        int i5 = o.en.b.f24090e * (-1580596594);
        o.en.b.f24090e = i5;
        int i6 = o.en.b.f24087b * (-2071415875);
        o.en.b.f24087b = i6;
        o.fr.b bVarC = ((o.fr.e) o.en.b.a(342371170, i5, new Object[]{bVar}, i6, -342371167, Process.myUid(), new Random().nextInt(460146032))).c();
        try {
            zC = false;
            for (h hVar : this.f26426f.values()) {
                try {
                    int i7 = f26421k + 27;
                    f26424n = i7 % 128;
                    int i8 = i7 % 2;
                    zC |= hVar.c(context, bVarC.b(hVar.d()), cVar);
                    aVar.a(hVar.d().a(), hVar.c());
                } catch (o.ef.b e2) {
                    e = e2;
                    if (o.ea.f.a()) {
                        Object[] objArr3 = new Object[1];
                        p((char) ((KeyEvent.getMaxKeyCode() >> 16) + 22170), (-1) - Process.getGidForName(""), AndroidCharacter.getMirror('0') - '\r', objArr3);
                        String strIntern2 = ((String) objArr3[0]).intern();
                        Object[] objArr4 = new Object[1];
                        p((char) (KeyEvent.keyCodeFromString("") + 7548), Color.argb(0, 0, 0, 0) + 799, 48 - TextUtils.indexOf("", "", 0, 0), objArr4);
                        o.ea.f.e(strIntern2, ((String) objArr4[0]).intern(), e);
                    }
                    aVar = new o.ef.a();
                    int i9 = f26421k + 9;
                    f26424n = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
            int i11 = f26424n + 111;
            f26421k = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 4 / 2;
            }
        } catch (o.ef.b e3) {
            e = e3;
            zC = false;
        }
        e(context, aVar);
        new o.dt.d();
        o.dt.d.b().e();
        return zC;
    }

    public final boolean a(o.ef.c cVar) throws Throwable {
        boolean z2;
        Object obj;
        Object obj2;
        Object obj3;
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        p((char) (22170 - Color.alpha(0)), Process.myPid() >> 22, 35 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (o.ea.f.a()) {
            int i3 = f26421k + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f26424n = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr2 = new Object[1];
                p((char) (60671 % KeyEvent.getDeadChar(1, 0)), 32155 - Process.getGidForName(""), 59 / (ViewConfiguration.getWindowTouchSlop() >>> 34), objArr2);
                obj3 = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                p((char) (60671 - KeyEvent.getDeadChar(0, 0)), 324 - Process.getGidForName(""), 39 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr3);
                obj3 = objArr3[0];
            }
            o.ea.f.c(strIntern, ((String) obj3).intern());
        }
        new o.db.e();
        loop0: while (true) {
            z2 = false;
            for (Map.Entry<i, Short> entry : o.db.e.c(cVar).entrySet()) {
                if (o.ea.f.a()) {
                    int i4 = f26424n + 111;
                    f26421k = i4 % 128;
                    if (i4 % 2 != 0) {
                        Object[] objArr4 = new Object[1];
                        p((char) (19821 % (ViewConfiguration.getPressedStateDuration() >>> 45)), (ViewConfiguration.getScrollBarFadeDuration() << 52) * 15165, 77 << (PointF.length(1.0f, 0.0f) > 1.0f ? 1 : (PointF.length(1.0f, 0.0f) == 1.0f ? 0 : -1)), objArr4);
                        obj2 = objArr4[0];
                    } else {
                        Object[] objArr5 = new Object[1];
                        p((char) (30854 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 364, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 59, objArr5);
                        obj2 = objArr5[0];
                    }
                    o.ea.f.c(strIntern, ((String) obj2).intern());
                }
                h hVar = this.f26426f.get(entry.getKey());
                if (hVar != null) {
                    if (o.ea.f.a()) {
                        Object[] objArr6 = new Object[1];
                        p((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 505 - TextUtils.getTrimmedLength(""), 115 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr6);
                        o.ea.f.c(strIntern, String.format(((String) objArr6[0]).intern(), entry.getKey()));
                    }
                    if (hVar instanceof m) {
                        int i5 = f26424n + 73;
                        int i6 = i5 % 128;
                        f26421k = i6;
                        int i7 = i5 % 2;
                        m mVar = (m) hVar;
                        if (!z2) {
                            int i8 = i6 + 45;
                            f26424n = i8 % 128;
                            int i9 = i8 % 2;
                            if (!mVar.a(entry.getValue())) {
                                break;
                            }
                        }
                        z2 = true;
                    } else {
                        continue;
                    }
                } else if (o.ea.f.a()) {
                    Object[] objArr7 = new Object[1];
                    p((char) (39229 - (KeyEvent.getMaxKeyCode() >> 16)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 422, 82 - Color.blue(0), objArr7);
                    o.ea.f.c(strIntern, String.format(((String) objArr7[0]).intern(), entry.getKey()));
                }
            }
            int i10 = f26424n + 25;
            f26421k = i10 % 128;
            int i11 = i10 % 2;
        }
        if (o.ea.f.a()) {
            int i12 = f26424n + 59;
            f26421k = i12 % 128;
            if (i12 % 2 != 0) {
                Object[] objArr8 = new Object[1];
                p((char) (ExpandableListView.getPackedPositionGroup(1L) * 1697), 15048 >> AndroidCharacter.getMirror((char) 15), 14 << TextUtils.getCapsMode("", 1, 1), objArr8);
                obj = objArr8[0];
            } else {
                Object[] objArr9 = new Object[1];
                p((char) (8789 - ExpandableListView.getPackedPositionGroup(0L)), AndroidCharacter.getMirror('0') + 571, TextUtils.getCapsMode("", 0, 0) + 40, objArr9);
                obj = objArr9[0];
            }
            o.ea.f.c(strIntern, ((String) obj).intern());
        }
        return z2;
    }

    public final List<h> b() {
        int i2 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i3 = f26421k + 97;
        f26424n = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 3 % 4;
        }
        for (Map.Entry<i, h> entry : this.f26426f.entrySet()) {
            if (entry.getValue().f() == b.f26402c) {
                int i5 = f26424n + 11;
                f26421k = i5 % 128;
                int i6 = i5 % 2;
                arrayList.add(entry.getValue());
            }
        }
        int i7 = f26421k + 9;
        f26424n = i7 % 128;
        int i8 = i7 % 2;
        return arrayList;
    }

    public final void b(Context context, o.en.b bVar) {
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int iMyUid = Process.myUid();
        int i3 = f26418h * (-1655977743);
        f26418h = i3;
        d((int) SystemClock.uptimeMillis(), i3, 543852784, -543852781, i2, iMyUid, new Object[]{this, context, bVar});
    }

    public final void c() {
        int i2 = f26413a * (-29408498);
        f26413a = i2;
        int iMyPid = Process.myPid();
        int i3 = 1758787202 * f26416d;
        f26416d = i3;
        d(Thread.activeCount(), i3, 754437089, -754437087, i2, iMyPid, new Object[]{this});
    }

    public final void c(Context context) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26424n + 39;
        f26421k = i3 % 128;
        int i4 = i3 % 2;
        this.f26427g = null;
        this.f26426f.clear();
        Object[] objArr = new Object[1];
        p((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 61706), 847 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 47, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Class<?> cls = Class.forName(C1593ug.zd("m{r\u0002\u007fzvAw\u0005\u0005\f}\b\u000fI_\r\r\u0014\u0006\u001a\u0017", (short) (Od.Xd() ^ (-10984)), (short) (Od.Xd() ^ (-19038))));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (Od.Xd() ^ (-10791));
        int[] iArr = new int["J@T>\nG;G?\u0005)IF<@8".length()];
        QB qb = new QB("J@T>\nG;G?\u0005)IF<@8");
        int i5 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i5] = xuXd.fK(sXd + sXd + i5 + xuXd.CK(iKK));
            i5++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i5));
        clsArr[1] = Integer.TYPE;
        Object[] objArr2 = {strIntern, 0};
        Method method = cls.getMethod(C1561oA.Kd("VUeE[Ug[[Hk_aaocmcfu", (short) (ZN.Xd() ^ 11745)), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(context, objArr2)).edit();
            Object[] objArr3 = new Object[1];
            p((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 894 - ExpandableListView.getPackedPositionGroup(0L), 15 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr3);
            editorEdit.putString(((String) objArr3[0]).intern(), "").commit();
            int i6 = f26421k + 27;
            f26424n = i6 % 128;
            int i7 = i6 % 2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final o.ef.c d(Context context, boolean z2, Collection<h> collection) throws Throwable {
        o.ef.a aVarD;
        Object obj;
        int i2 = 2 % 2;
        long j2 = 0;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            p((char) (22170 - View.MeasureSpec.makeMeasureSpec(0, 0)), View.resolveSize(0, 0), 35 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 1263 - Drawable.resolveOpacity(0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        o.ef.c cVarI = i();
        for (h hVar : collection) {
            if (o.ea.f.a()) {
                Object[] objArr3 = new Object[1];
                p((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22170), (ExpandableListView.getPackedPositionForGroup(0) > j2 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j2 ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 36, objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                p((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)) - 1), 1285 - Color.argb(0, 0, 0, 0), TextUtils.getCapsMode("", 0, 0) + 52, objArr4);
                String strIntern3 = ((String) objArr4[0]).intern();
                i iVarD = hVar.d();
                String strM = hVar.m();
                if (!(!z2)) {
                    Object[] objArr5 = new Object[1];
                    p((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 18331), TextUtils.indexOf((CharSequence) "", '0') + 1338, 9 - TextUtils.lastIndexOf("", '0'), objArr5);
                    obj = objArr5[0];
                } else {
                    Object[] objArr6 = new Object[1];
                    p((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23083), ImageFormat.getBitsPerPixel(0) + 1348, 12 - TextUtils.getCapsMode("", 0, 0), objArr6);
                    obj = objArr6[0];
                }
                o.ea.f.c(strIntern2, String.format(strIntern3, iVarD, strM, ((String) obj).intern()));
            }
            int i3 = 0;
            while (true) {
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int i4 = o.ef.c.f23799b * 1567746851;
                o.ef.c.f23799b = i4;
                int i5 = o.ef.c.f23798a * 1136425123;
                o.ef.c.f23798a = i5;
                if (i3 >= ((Integer) o.ef.c.b((int) Runtime.getRuntime().maxMemory(), i5, i4, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVarI})).intValue()) {
                    aVarD = null;
                    break;
                }
                int i6 = f26424n + 5;
                f26421k = i6 % 128;
                int i7 = i6 % 2;
                o.ef.a aVarD2 = cVarI.d(i3);
                Object[] objArr7 = new Object[1];
                p((char) (51398 - (ViewConfiguration.getLongPressTimeout() >> 16)), 1359 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ImageFormat.getBitsPerPixel(0) + 5, objArr7);
                if (aVarD2.a(((String) objArr7[0]).intern()).equals(hVar.m())) {
                    aVarD = cVarI.d(i3);
                    break;
                }
                i3++;
            }
            if (aVarD != null) {
                int i8 = f26421k + 1;
                f26424n = i8 % 128;
                int i9 = i8 % 2;
                Object[] objArr8 = new Object[1];
                p((char) (ImageFormat.getBitsPerPixel(0) + 36598), Color.alpha(0) + 1363, View.resolveSizeAndState(0, 0, 0) + 9, objArr8);
                aVarD.b(((String) objArr8[0]).intern(), z2);
                if (z2) {
                    try {
                        if (hVar instanceof k) {
                            try {
                                byte[] bArrD = ((k) hVar).d(context);
                                Object[] objArr9 = new Object[1];
                                p((char) (33149 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1372 - (Process.myTid() >> 22), TextUtils.indexOf((CharSequence) "", '0') + 18, objArr9);
                                aVarD.a(((String) objArr9[0]).intern(), (Object) o.dl.d.e(bArrD));
                            } catch (e e2) {
                                e = e2;
                                if (o.ea.f.a()) {
                                    j2 = 0;
                                    Object[] objArr10 = new Object[1];
                                    p((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 22170), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, 34 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr10);
                                    String strIntern4 = ((String) objArr10[0]).intern();
                                    StringBuilder sb = new StringBuilder();
                                    Object[] objArr11 = new Object[1];
                                    p((char) (16851 - (ViewConfiguration.getScrollBarSize() >> 8)), 1389 - Color.red(0), 37 - Gravity.getAbsoluteGravity(0, 0), objArr11);
                                    o.ea.f.e(strIntern4, sb.append(((String) objArr11[0]).intern()).append(hVar.d().name()).toString(), e);
                                } else {
                                    j2 = 0;
                                }
                            }
                        }
                        j2 = 0;
                    } catch (e e3) {
                        e = e3;
                    }
                }
            }
            j2 = 0;
        }
        int i10 = f26424n + 73;
        f26421k = i10 % 128;
        int i11 = i10 % 2;
        return cVarI;
    }

    public final h d(o.g.a aVar) {
        int i2 = 2 % 2;
        int i3 = f26424n + 27;
        f26421k = i3 % 128;
        int i4 = i3 % 2;
        for (h hVar : this.f26426f.values()) {
            if (hVar.d().equals(aVar.b())) {
                int i5 = f26424n + 103;
                f26421k = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 76 / 0;
                }
                return hVar;
            }
        }
        int i7 = f26421k + 49;
        f26424n = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public final h d(i iVar) {
        int i2 = 2 % 2;
        int i3 = f26424n + 117;
        f26421k = i3 % 128;
        int i4 = i3 % 2;
        h hVar = this.f26426f.get(iVar);
        int i5 = f26421k + 91;
        f26424n = i5 % 128;
        if (i5 % 2 != 0) {
            return hVar;
        }
        throw null;
    }

    public final void d(Context context, List<i> list) throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            p((char) ((Process.myPid() >> 22) + 22170), TextUtils.getOffsetAfter("", 0), 35 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p((char) ExpandableListView.getPackedPositionGroup(0L), 733 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 36, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (list.contains(i.f26494b)) {
            int i3 = f26424n + 63;
            f26421k = i3 % 128;
            if (i3 % 2 != 0) {
                list.contains(i.f26493a);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!list.contains(i.f26493a)) {
                list.add(i.f26493a);
            }
        }
        if (list.contains(i.f26493a)) {
            int i4 = f26424n + 89;
            f26421k = i4 % 128;
            int i5 = i4 % 2;
            if (!list.contains(i.f26494b)) {
                int i6 = f26424n + 67;
                f26421k = i6 % 128;
                int i7 = i6 % 2;
                list.add(i.f26494b);
            }
        }
        Iterator<i> it = list.iterator();
        int i8 = f26421k + 117;
        f26424n = i8 % 128;
        int i9 = i8 % 2;
        while (it.hasNext()) {
            h hVar = this.f26426f.get(it.next());
            if (hVar != null) {
                hVar.a(context);
            }
        }
    }

    public final void d(Context context, o.en.b bVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f26421k + 79;
        f26424n = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f26421k + 15;
            f26424n = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            p((char) (22171 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), Drawable.resolveOpacity(0, 0), 36 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p((char) ((-1) - ImageFormat.getBitsPerPixel(0)), TextUtils.getTrimmedLength("") + 711, Gravity.getAbsoluteGravity(0, 0) + 22, objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            int i7 = f26421k + 105;
            f26424n = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = o.en.b.f24090e * (-1580596594);
        o.en.b.f24090e = i9;
        int i10 = o.en.b.f24087b * (-2071415875);
        o.en.b.f24087b = i10;
        o.fr.b bVarC = ((o.fr.e) o.en.b.a(342371170, i9, new Object[]{bVar}, i10, -342371167, Process.myUid(), new Random().nextInt(460146032))).c();
        for (h hVar : this.f26426f.values()) {
            hVar.e(context, bVarC.b(hVar.d()));
        }
    }

    public final HashMap<i, h> e() {
        HashMap<i, h> map;
        int i2 = 2 % 2;
        int i3 = f26424n + 35;
        int i4 = i3 % 128;
        f26421k = i4;
        if (i3 % 2 != 0) {
            map = this.f26426f;
            int i5 = 34 / 0;
        } else {
            map = this.f26426f;
        }
        int i6 = i4 + 23;
        f26424n = i6 % 128;
        int i7 = i6 % 2;
        return map;
    }

    public final void e(Context context, HashMap<i, h> map) throws Throwable {
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            Object[] objArr = new Object[1];
            p((char) (22171 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), 35 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p((char) (44028 - MotionEvent.axisFromString("")), 34 - ImageFormat.getBitsPerPixel(0), 30 - (KeyEvent.getMaxKeyCode() >> 16), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        ArrayList arrayList = new ArrayList();
        for (i iVar : this.f26426f.keySet()) {
            if (!map.containsKey(iVar)) {
                int i3 = f26424n + 87;
                f26421k = i3 % 128;
                int i4 = i3 % 2;
                if (o.ea.f.a()) {
                    Object[] objArr3 = new Object[1];
                    p((char) (22171 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 35, objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    p((char) (9639 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 65 - ExpandableListView.getPackedPositionType(0L), View.getDefaultSize(0, 0) + 86, objArr4);
                    o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
                }
                arrayList.add(this.f26426f.get(iVar));
            }
            int i5 = f26421k + 103;
            f26424n = i5 % 128;
            int i6 = i5 % 2;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f26426f.remove(((h) it.next()).d());
            int i7 = f26421k + 93;
            f26424n = i7 % 128;
            int i8 = i7 % 2;
        }
        for (Map.Entry<i, h> entry : map.entrySet()) {
            h hVar = this.f26426f.get(entry.getKey());
            if (hVar == null || hVar.d() != entry.getValue().d()) {
                if (o.ea.f.a()) {
                    int i9 = f26424n + 121;
                    f26421k = i9 % 128;
                    int i10 = i9 % 2;
                    Object[] objArr5 = new Object[1];
                    p((char) (22218 - AndroidCharacter.getMirror('0')), TextUtils.indexOf("", ""), 36 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr5);
                    String strIntern3 = ((String) objArr5[0]).intern();
                    Object[] objArr6 = new Object[1];
                    p((char) (36596 - Drawable.resolveOpacity(0, 0)), 280 - AndroidCharacter.getMirror('0'), 92 - ImageFormat.getBitsPerPixel(0), objArr6);
                    o.ea.f.c(strIntern3, ((String) objArr6[0]).intern());
                    int i11 = f26421k + 1;
                    f26424n = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 3 % 4;
                    }
                }
                this.f26426f.put(entry.getKey(), entry.getValue());
            } else {
                if (o.ea.f.a()) {
                    Object[] objArr7 = new Object[1];
                    p((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 22171), KeyEvent.getDeadChar(0, 0), 35 - (ViewConfiguration.getTouchSlop() >> 8), objArr7);
                    String strIntern4 = ((String) objArr7[0]).intern();
                    Object[] objArr8 = new Object[1];
                    p((char) (KeyEvent.normalizeMetaState(0) + 36855), TextUtils.indexOf("", "") + 151, 82 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr8);
                    o.ea.f.c(strIntern4, ((String) objArr8[0]).intern());
                }
                hVar.e(context, entry.getValue());
            }
        }
    }

    final void e(Context context, o.ef.a aVar) throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        p((char) ((ViewConfiguration.getTapTimeout() >> 16) + 61706), 847 - (Process.myPid() >> 22), Color.alpha(0) + 47, objArr);
        Object[] objArr2 = {((String) objArr[0]).intern(), 0};
        Method method = Class.forName(Wg.Zd("s*1\u0015+\u0019d8B>R281\u007fO5UmIKF\u0017", (short) (C1633zX.Xd() ^ (-18728)), (short) (C1633zX.Xd() ^ (-27481)))).getMethod(Wg.vd(":7I'?7K=/\u001a?153C51%*7", (short) (C1607wl.Xd() ^ 4220)), Class.forName(C1561oA.Xd("\u007fw\u000eyG\u0007|\u000b\u0005Lr\u0015\u0014\f\u0012\f", (short) (C1633zX.Xd() ^ (-22021)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr2);
            if (o.ea.f.a()) {
                Object[] objArr3 = new Object[1];
                p((char) (TextUtils.getOffsetBefore("", 0) + 22170), ViewConfiguration.getTouchSlop() >> 8, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 35, objArr3);
                String strIntern = ((String) objArr3[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr4 = new Object[1];
                p((char) (10104 - (ViewConfiguration.getTouchSlop() >> 8)), 908 - View.combineMeasuredStates(0, 0), 34 - ExpandableListView.getPackedPositionType(0L), objArr4);
                o.ea.f.c(strIntern, sb.append(((String) objArr4[0]).intern()).append(aVar.e()).toString());
            }
            int iActiveCount = Thread.activeCount();
            int priority = Thread.currentThread().getPriority();
            int i3 = o.ef.a.f23768b * 408478217;
            o.ef.a.f23768b = i3;
            if (((Integer) o.ef.a.a(-1670499501, new Object[]{aVar}, i3, (int) Thread.currentThread().getId(), 1670499501, iActiveCount, priority)).intValue() == 0) {
                if (o.ea.f.a()) {
                    int i4 = f26424n + 17;
                    f26421k = i4 % 128;
                    int i5 = i4 % 2;
                    Object[] objArr5 = new Object[1];
                    p((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22170), TextUtils.indexOf("", ""), 35 - (KeyEvent.getMaxKeyCode() >> 16), objArr5);
                    String strIntern2 = ((String) objArr5[0]).intern();
                    Object[] objArr6 = new Object[1];
                    p((char) (View.MeasureSpec.getSize(0) + 8736), 942 - TextUtils.indexOf("", ""), 31 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr6);
                    o.ea.f.c(strIntern2, ((String) objArr6[0]).intern());
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                Object[] objArr7 = new Object[1];
                p((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 894 - Color.alpha(0), 14 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr7);
                editorEdit.putString(((String) objArr7[0]).intern(), "").commit();
                return;
            }
            this.f26427g = aVar;
            String strE = new o.dk.a(context).e(aVar.e());
            if (!(!o.ea.f.a())) {
                int i6 = f26421k + 111;
                f26424n = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr8 = new Object[1];
                p((char) (22170 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), View.getDefaultSize(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 35, objArr8);
                String strIntern3 = ((String) objArr8[0]).intern();
                Object[] objArr9 = new Object[1];
                p((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 5519), 974 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 44 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr9);
                o.ea.f.c(strIntern3, ((String) objArr9[0]).intern());
            }
            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
            Object[] objArr10 = new Object[1];
            p((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 894 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 13 - ExpandableListView.getPackedPositionChild(0L), objArr10);
            editorEdit2.putString(((String) objArr10[0]).intern(), strE).commit();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final i g() {
        int i2 = 2 % 2;
        int i3 = f26421k + 89;
        f26424n = i3 % 128;
        if (i3 % 2 == 0) {
            this.f26426f.keySet().contains(i.f26496d);
            throw null;
        }
        Set<i> setKeySet = this.f26426f.keySet();
        if (!setKeySet.contains(i.f26496d)) {
            return setKeySet.contains(i.f26495c) ? i.f26495c : i.f26495c;
        }
        int i4 = f26421k + 107;
        f26424n = i4 % 128;
        int i5 = i4 % 2;
        return i.f26496d;
    }

    public final boolean j() throws Throwable {
        Iterator<h> it;
        int i2 = 2 % 2;
        int i3 = f26421k + 11;
        f26424n = i3 % 128;
        if (i3 % 2 == 0) {
            it = this.f26426f.values().iterator();
            int i4 = 46 / 0;
        } else {
            it = this.f26426f.values().iterator();
        }
        while (it.hasNext()) {
            h next = it.next();
            if (next.a(f.f26439e)) {
                int i5 = f26424n + 73;
                f26421k = i5 % 128;
                if (i5 % 2 != 0) {
                    boolean z2 = next instanceof m;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!(!(next instanceof m)) && !((m) next).p()) {
                    if (o.ea.f.a()) {
                        int i6 = f26421k + 113;
                        f26424n = i6 % 128;
                        int i7 = i6 % 2;
                        Object[] objArr = new Object[1];
                        p((char) (22169 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Color.rgb(0, 0, 0) + 16777216, 35 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
                        String strIntern = ((String) objArr[0]).intern();
                        Object[] objArr2 = new Object[1];
                        p((char) (49463 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1426, View.MeasureSpec.getSize(0) + 88, objArr2);
                        o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
