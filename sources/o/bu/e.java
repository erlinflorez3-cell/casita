package o.bu;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o.a.g;
import o.a.n;
import o.ea.f;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<b> f21691b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e f21692d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char f21693f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char f21694g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char[] f21695h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char f21696i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char f21697j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f21698k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f21699l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f21700m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f21701n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static char f21702o = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21705e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b f21704c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    C0346e f21703a = null;

    /* JADX INFO: renamed from: o.bu.e$e, reason: collision with other inner class name */
    public static final class C0346e {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f21706a = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f21707g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f21708h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f21709i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f21710j = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f21712c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final e f21714e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f21711b = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f21713d = false;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r8, short r9, short r10) {
            /*
                int r0 = r10 * 2
                int r7 = 115 - r0
                int r0 = r8 * 3
                int r6 = 4 - r0
                int r5 = r9 * 3
                int r0 = r5 + 1
                byte[] r4 = o.bu.e.C0346e.$$a
                byte[] r3 = new byte[r0]
                r2 = 0
                if (r4 != 0) goto L2a
                r1 = r7
                r0 = r2
                r7 = r5
            L16:
                int r7 = r7 + r1
                int r6 = r6 + 1
                r1 = r0
            L1a:
                byte r0 = (byte) r7
                r3[r1] = r0
                int r0 = r1 + 1
                if (r1 != r5) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r3, r2)
                return r0
            L27:
                r1 = r4[r6]
                goto L16
            L2a:
                r1 = r2
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bu.e.C0346e.$$c(byte, short, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f21710j = 0;
            f21709i = 1;
            f21708h = 0;
            f21707g = 1;
            d();
            AudioTrack.getMaxVolume();
            TypedValue.complexToFraction(0, 0.0f, 0.0f);
            View.getDefaultSize(0, 0);
            int i2 = f21710j + 101;
            f21709i = i2 % 128;
            int i3 = i2 % 2;
        }

        public C0346e(e eVar, b bVar) {
            this.f21714e = eVar;
            this.f21712c = bVar;
        }

        static void d() {
            f21706a = -1270219406;
        }

        private static void f(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i5 = 2 % 2;
            if (str2 != null) {
                int i6 = $10 + 79;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    str2.toCharArray();
                    throw null;
                }
                charArray = str2.toCharArray();
            } else {
                charArray = str2;
            }
            char[] cArr = (char[]) charArray;
            n nVar = new n();
            char[] cArr2 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                nVar.f19946e = cArr[nVar.f19944a];
                cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
                int i7 = nVar.f19944a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(f21706a)};
                    Object objA = o.d.d.a(1376241034);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(270 - (ViewConfiguration.getTapTimeout() >> 16), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11, -2071844881, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {nVar, nVar};
                    Object objA2 = o.d.d.a(-202660535);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(522 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 13, 627984172, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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
            if (i4 > 0) {
                nVar.f19945b = i4;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
                System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
                int i8 = $11 + 85;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            }
            if (z2) {
                char[] cArr4 = new char[i2];
                nVar.f19944a = 0;
                int i10 = $10 + 53;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                while (nVar.f19944a < i2) {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(522 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 16777228 + Color.rgb(0, 0, 0), 627984172, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        static void init$0() {
            $$a = new byte[]{Ascii.CR, Ascii.ESC, 39, 17};
            $$b = 77;
        }

        public final boolean a() {
            int i2 = 2 % 2;
            int i3 = f21708h;
            int i4 = i3 + 79;
            f21707g = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            boolean z2 = this.f21711b;
            int i5 = i3 + 109;
            f21707g = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 94 / 0;
            }
            return z2;
        }

        public final b b() {
            int i2 = 2 % 2;
            int i3 = f21708h + 71;
            int i4 = i3 % 128;
            f21707g = i4;
            int i5 = i3 % 2;
            b bVar = this.f21712c;
            int i6 = i4 + 93;
            f21708h = i6 % 128;
            int i7 = i6 % 2;
            return bVar;
        }

        public final void d(Context context) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f21708h + 23;
            f21707g = i3 % 128;
            int i4 = i3 % 2;
            if (f.a()) {
                Object[] objArr = new Object[1];
                f(31 - TextUtils.indexOf("", "", 0, 0), C1561oA.od("\u0014\b\r\u000b\ueb8b\u0004\b\u007fʨ\t\u0006\u0007|\u0001\u0006y}u\ueb84\ueb97y\ueb95pʙy\ueb5e\ueb7cmjt\ueb8c", (short) (C1633zX.Xd() ^ (-28190))), false, TextUtils.getTrimmedLength("") + 206, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f(5 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), C1561oA.Kd("ps朩z朱u", (short) (ZN.Xd() ^ 4456)), true, 261 - AndroidCharacter.getMirror('0'), 3 - Color.alpha(0), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            Object obj = null;
            if (!this.f21711b) {
                int i5 = f21707g + 89;
                f21708h = i5 % 128;
                if (i5 % 2 != 0) {
                    f.a();
                    obj.hashCode();
                    throw null;
                }
                if (f.a()) {
                    Object[] objArr3 = new Object[1];
                    f((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 30, Wg.Zd("\u0016*#P軿_W~إ*\u000b{%\u001bD(_EጸᐩMﻧḯ\u0007ℰ⨰L-)䛀", (short) (OY.Xd() ^ 25718), (short) (OY.Xd() ^ 4087)), false, 205 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 4 - Color.green(0), objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    f(30 - Color.alpha(0), C1561oA.Xd("\u0017\u0017竢\u0019\u001b!竦\"$\u0012$'\u0019\u0019\u0019&%&#/竴笂競笤)(4$8.", (short) (C1580rY.Xd() ^ (-26370))), false, 200 - (ViewConfiguration.getTapTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 15, objArr4);
                    f.d(strIntern2, ((String) objArr4[0]).intern());
                    return;
                }
                return;
            }
            if (this.f21713d) {
                if (!(!f.a())) {
                    Object[] objArr5 = new Object[1];
                    f((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 30, Wg.vd("e[^^빀_a[ɛ\\WZV\\_UOI븱빆S빌JɖK븍븩ADP빁", (short) (C1499aX.Xd() ^ (-9911))), false, 206 - TextUtils.indexOf("", "", 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4, objArr5);
                    String strIntern3 = ((String) objArr5[0]).intern();
                    Object[] objArr6 = new Object[1];
                    f(35 - TextUtils.lastIndexOf("", '0', 0), Qg.kd("6$6*/-」\u001e(-\u001f\u001a\u001c0々\u0018# \u001f\u001a$#\u0013\u0011\u000f\u001a\u0017\u0016\u0011\u001b⿵、⿳〟\u000b\b", (short) (C1607wl.Xd() ^ 11983), (short) (C1607wl.Xd() ^ 30386)), false, 200 - TextUtils.lastIndexOf("", '0', 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24, objArr6);
                    f.d(strIntern3, ((String) objArr6[0]).intern());
                }
                int i6 = f21708h + 51;
                f21707g = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.f21713d = true;
            Object[] objArr7 = new Object[1];
            f(47 - (ViewConfiguration.getScrollDefaultDelay() >> 16), hg.Vd("‼\u0001‸‹\u0003‸\u007f῾‰x}‱suuῶ\u2028pu\u2029kmmd•‣ea”h‚fl―dX—`‖—\u200eZ[‑‑\u200fW", (short) (C1580rY.Xd() ^ (-29565)), (short) (C1580rY.Xd() ^ (-27775))), false, 208 - (KeyEvent.getMaxKeyCode() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 5, objArr7);
            Object[] objArr8 = {((String) objArr7[0]).intern(), 0};
            Method method = Class.forName(C1561oA.ud("bncple_(\\gejZbg 4_]bRd_", (short) (OY.Xd() ^ 2198))).getMethod(C1561oA.Yd("32B\"82D88%H<>>L@J@CR", (short) (OY.Xd() ^ 11940)), Class.forName(C1561oA.yd("XPbN\u0018WIW]%Gid\\^X", (short) (C1499aX.Xd() ^ (-29910)))), Integer.TYPE);
            try {
                method.setAccessible(true);
                SharedPreferences.Editor editorEdit = ((SharedPreferences) method.invoke(context, objArr8)).edit();
                Object[] objArr9 = new Object[1];
                f(25 - ExpandableListView.getPackedPositionChild(0L), Xg.qd("porjpwmsm磱礆w礈r礎\u007f磙Ăw\u0002\t磶}\u0004}礙", (short) (Od.Xd() ^ (-8124)), (short) (Od.Xd() ^ (-26811))), false, Color.rgb(0, 0, 0) + 16777423, 21 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr9);
                editorEdit.putInt(((String) objArr9[0]).intern(), this.f21712c.d()).commit();
                this.f21714e.f21704c = this.f21712c;
                this.f21714e.f21703a = null;
                int i7 = f21707g + 87;
                f21708h = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        public final void e() {
            int i2 = 2 % 2;
            int i3 = f21707g + 125;
            f21708h = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                f.a();
                obj.hashCode();
                throw null;
            }
            if (f.a()) {
                int i4 = f21708h + 25;
                f21707g = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr = new Object[1];
                f(((Process.getThreadPriority(0) + 20) >> 6) + 31, "\u000f\u0004\n\t￡\u0004\t\u0002\u0000\r\u000b\r\u0004\t\u000f\u0004\t\u0002￨￼\t￼\u0002\u0000\r\uffc9￨\u0004\u0002\r￼", false, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 205, View.MeasureSpec.getMode(0) + 4, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f(6 - MotionEvent.axisFromString(""), "\ufff7\b�\uffff\u0003\ufffb\n", true, 210 - MotionEvent.axisFromString(""), 6 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            if (!this.f21711b) {
                if (!this.f21713d) {
                    this.f21711b = true;
                    return;
                }
                if (!(!f.a())) {
                    Object[] objArr3 = new Object[1];
                    f((ViewConfiguration.getPressedStateDuration() >> 16) + 31, "\u000f\u0004\n\t￡\u0004\t\u0002\u0000\r\u000b\r\u0004\t\u000f\u0004\t\u0002￨￼\t￼\u0002\u0000\r\uffc9￨\u0004\u0002\r￼", false, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 206, 3 - TextUtils.lastIndexOf("", '0'), objArr3);
                    String strIntern2 = ((String) objArr3[0]).intern();
                    Object[] objArr4 = new Object[1];
                    f((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37, "\u0005\u0012\f\u0001\uffc0\u000e\u000f\t\u0014\u0001\u0012\u0007\t￭\uffc0ￍ\uffc0\u0005\u0014\u0001\u0012\u0007\t\r\u0004\u0005\u0014\u0014\t\r\r\u000f\u0003\uffc0\u0019\u0004\u0001", true, Color.blue(0) + 201, TextUtils.indexOf("", "", 0) + 24, objArr4);
                    f.d(strIntern2, ((String) objArr4[0]).intern());
                    return;
                }
                return;
            }
            if (f.a()) {
                Object[] objArr5 = new Object[1];
                f(KeyEvent.normalizeMetaState(0) + 31, "\u000f\u0004\n\t￡\u0004\t\u0002\u0000\r\u000b\r\u0004\t\u000f\u0004\t\u0002￨￼\t￼\u0002\u0000\r\uffc9￨\u0004\u0002\r￼", false, 206 - (ViewConfiguration.getWindowTouchSlop() >> 8), 3 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr5);
                String strIntern3 = ((String) objArr5[0]).intern();
                Object[] objArr6 = new Object[1];
                f('S' - AndroidCharacter.getMirror('0'), "\u0006\u0015\u0013\u0002\u0015\u0014\uffc1\u001a\u0005\u0002\u0006\u0013\r\u0002\uffc1\u000f\u0010\n\u0015\u0002\u0013\b\n￮\uffc1ￎ\uffc1\u0006\u0015\u0002\u0013\b\n\u000e\u0005", true, 200 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 34 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr6);
                f.d(strIntern3, ((String) objArr6[0]).intern());
            }
            int i6 = f21707g + 77;
            f21708h = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r9, short r10, int r11) {
        /*
            int r8 = 111 - r10
            byte[] r7 = o.bu.e.$$a
            int r0 = r9 * 4
            int r6 = 5 - r0
            int r1 = r11 * 2
            int r0 = 1 - r1
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r7 != 0) goto L2a
            r0 = r6
            r2 = r4
        L15:
            int r6 = r6 + 1
            int r0 = -r0
            int r8 = r8 + r0
            r1 = r2
        L1a:
            byte r0 = (byte) r8
            r5[r1] = r0
            int r2 = r1 + 1
            if (r1 != r3) goto L27
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L27:
            r0 = r7[r6]
            goto L15
        L2a:
            r1 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bu.e.$$c(short, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f21701n = 0;
        f21700m = 1;
        f21699l = 0;
        f21698k = 1;
        b();
        ImageFormat.getBitsPerPixel(0);
        ViewConfiguration.getScrollDefaultDelay();
        f21691b = Arrays.asList(new d(), new a());
        f21692d = new e();
        int i2 = f21700m + 85;
        f21701n = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 15 / 0;
        }
    }

    private e() {
    }

    public static e a() {
        int i2 = 2 % 2;
        int i3 = f21698k + 1;
        f21699l = i3 % 128;
        if (i3 % 2 == 0) {
            return f21692d;
        }
        throw null;
    }

    static void b() {
        f21695h = new char[]{64584, 64582, 65469, 64577, 65470, 64599, 65471, 64580, 64604, 64586, 64634, 64578, 64631, 64607, 64581, 64576, 64594, 65468, 64595, 64587, 64543, 64585, 64616, 64598, 64589, 64523, 64520, 64593, 64592, 64611, 64517, 65467, 64579, 64588, 64583, 64597};
        f21693f = (char) 51641;
        f21696i = (char) 57748;
        f21694g = (char) 6035;
        f21697j = (char) 28950;
        f21702o = (char) 54729;
    }

    static void init$0() {
        $$a = new byte[]{0, -128, Ascii.EM, 70, MessagePack.Code.FIXEXT4};
        $$b = 236;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(int r31, java.lang.String r32, byte r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bu.e.p(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    private static void q(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = $11 + 107;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        int i7 = 0;
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i8 = $11 + 85;
            $10 = i8 % 128;
            int i9 = i8 % i3;
            cArr3[i7] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i10 = 58224;
            int i11 = i7;
            while (i11 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i7];
                int i12 = (c3 + i10) ^ ((c3 << 4) + ((char) (((long) f21697j) ^ (-7511683281764982996L))));
                int i13 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f21702o);
                    objArr2[i3] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[i7] = Integer.valueOf(c2);
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        int iKeyCodeFromString = 270 - KeyEvent.keyCodeFromString("");
                        char size = (char) View.MeasureSpec.getSize(i7);
                        int i14 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11;
                        byte[] bArr = $$a;
                        byte b2 = bArr[i7];
                        String str$$c = $$c(b2, (byte) (-bArr[4]), b2);
                        Class[] clsArr = new Class[4];
                        clsArr[i7] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objA = o.d.d.a(iKeyCodeFromString, size, i14, -1995022631, false, str$$c, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i7]), Integer.valueOf((cCharValue + i10) ^ ((cCharValue << 4) + ((char) (((long) f21696i) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f21694g)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        int scrollBarSize = 270 - (ViewConfiguration.getScrollBarSize() >> 8);
                        char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iIndexOf = 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        byte[] bArr2 = $$a;
                        byte b3 = bArr2[0];
                        objA2 = o.d.d.a(scrollBarSize, minimumFlingVelocity, iIndexOf, -1995022631, false, $$c(b3, (byte) (-bArr2[4]), b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i10 -= 40503;
                    i11++;
                    i3 = 2;
                    i7 = 0;
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
                int iBlue = Color.blue(0) + 270;
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 12;
                byte b4 = $$a[0];
                byte b5 = b4;
                String str$$c2 = $$c(b5, (byte) ((b5 + 39) - (39 & b5)), b4);
                i3 = 2;
                objA3 = o.d.d.a(iBlue, scrollBarFadeDuration, iIndexOf2, -2074123590, false, str$$c2, new Class[]{Object.class, Object.class});
            } else {
                i3 = 2;
            }
            ((Method) objA3).invoke(null, objArr4);
            i7 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public final b c() {
        int i2 = 2 % 2;
        int i3 = f21699l + 55;
        f21698k = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f21704c;
        }
        throw null;
    }

    public final C0346e d() {
        int i2 = 2 % 2;
        int i3 = f21699l;
        int i4 = i3 + 15;
        f21698k = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        C0346e c0346e = this.f21703a;
        int i5 = i3 + 105;
        f21698k = i5 % 128;
        int i6 = i5 % 2;
        return c0346e;
    }

    public final void d(Context context, boolean z2, boolean z3) {
        Object obj;
        Object obj2;
        int i2 = 2 % 2;
        int i3 = f21699l + 115;
        f21698k = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        p((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 20, Jg.Wd("=\u0014\u001a\u001b8;Of\u000e%3'M^lq\u0013hu\u0001ꭱ", (short) (ZN.Xd() ^ 23849), (short) (ZN.Xd() ^ 18926)), (byte) (8 - Color.alpha(0)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (this.f21705e) {
            return;
        }
        if (!(!f.a())) {
            int i5 = f21699l + 35;
            f21698k = i5 % 128;
            int i6 = i5 % 2;
            String strXd = ZO.xd("-Ru*f# ^>J", (short) (C1633zX.Xd() ^ (-31207)), (short) (C1633zX.Xd() ^ (-6709)));
            if (i6 == 0) {
                Object[] objArr2 = new Object[1];
                p(35 / (ViewConfiguration.getTapTimeout() >>> 122), strXd, (byte) (View.resolveSizeAndState(1, 0, 0) * 95), objArr2);
                obj2 = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                p((ViewConfiguration.getTapTimeout() >> 16) + 10, strXd, (byte) (13 - View.resolveSizeAndState(0, 0, 0)), objArr3);
                obj2 = objArr3[0];
            }
            f.c(strIntern, ((String) obj2).intern());
        }
        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 47;
        byte pressedStateDuration = (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 34);
        Object[] objArr4 = new Object[1];
        short sXd = (short) (OY.Xd() ^ 10971);
        short sXd2 = (short) (OY.Xd() ^ 16311);
        int[] iArr = new int["3~v0x\"FUFL\\{\t_\u001f<C$?˪\f\u000ev \u0014\u000bSRX\u0002\r\u0014\u00119`|)W-\u0015-f\u000ed\u007f\u0012ꚓ".length()];
        QB qb = new QB("3~v0x\"FUFL\\{\t_\u001f<C$?˪\f\u000ev \u0014\u000bSRX\u0002\r\u0014\u00119`|)W-\u0015-f\u000ed\u007f\u0012ꚓ");
        int i7 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i7] = xuXd.fK((C1561oA.Xd[i7 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i7 * sXd2))) + xuXd.CK(iKK));
            i7++;
        }
        p(offsetBefore, new String(iArr, 0, i7), pressedStateDuration, objArr4);
        Object[] objArr5 = {((String) objArr4[0]).intern(), 0};
        Method method = Class.forName(Ig.wd("-\u000f\u0015@c\u0011]\u001dwIDn\r&yVCk0\fB3G", (short) (C1499aX.Xd() ^ (-25425)))).getMethod(C1561oA.Qd(" \u001d+\t\u001d\u0015%\u0017\u0015\u007f!\u0013\u0013\u0011\u001d\u000f\u0017\u000b\f\u0019", (short) (FB.Xd() ^ 29243)), Class.forName(EO.Od("\u007fD-vUP_\u000fB{!\u001eJMXq", (short) (C1580rY.Xd() ^ (-20920)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr5);
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 26;
            byte bResolveOpacity = (byte) (55 - Drawable.resolveOpacity(0, 0));
            Object[] objArr6 = new Object[1];
            String strZd = C1593ug.zd("<E:+6),3H?L/D5B:J?<E6SZ@WQ", (short) (C1580rY.Xd() ^ (-9712)), (short) (C1580rY.Xd() ^ (-9464)));
            p(fadingEdgeLength, strZd, bResolveOpacity, objArr6);
            int i8 = sharedPreferences.getInt(((String) objArr6[0]).intern(), -1);
            if (i8 == -1) {
                if (f.a()) {
                    int i9 = f21698k + 57;
                    f21699l = i9 % 128;
                    int i10 = i9 % 2;
                    String strOd = C1561oA.od("咢去\ud828㑝䏮搮\uf640\uedb1画ꄎ㑕\uf37b㴁႘ᱣ\ue770놟笪牟출᳂⋑汅℟Ⲅ嵲咈厡\udce0辠앃ⴢᠯ擑䀼料呾厗\uf61e搜䛐讀왪债Ც⊹唄র刏殎䛆縷ϓ値ꡒꓫ礵꧈ﴖ♫嶗䦭᠑撳䴫绘ଲ䁩哷㽕뜒層醚춒䤎\ude43쎨陠吖\ueb0e䴛终ሺꃓ녛竦呌卥律\uedbb䴑纾\uf647疕ሮꃇﳰ♅礋ꦞ卛세鋕\ueacf\uf391\u0ef5㧀ᛖ哆ॲ毭\u20c7€쾃▵辭㿪塞䪴ʒ퍼䮳Ꮜ缑", (short) (C1633zX.Xd() ^ (-18966)));
                    if (i10 != 0) {
                        Object[] objArr7 = new Object[1];
                        q(strOd, 127 - (ExpandableListView.getPackedPositionForGroup(1) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 0L ? 0 : -1)), objArr7);
                        obj = objArr7[0];
                    } else {
                        Object[] objArr8 = new Object[1];
                        q(strOd, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 124, objArr8);
                        obj = objArr8[0];
                    }
                    f.c(strIntern, ((String) obj).intern());
                }
                i8 = 0;
            } else if (f.a()) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr9 = new Object[1];
                p(32 - (ViewConfiguration.getPressedStateDuration() >> 16), C1561oA.Kd("\u0015\fz\u001a\u0019\u0004\u0017\u007f\f\u000f \u0019դ\u0015\u0019&\t*\u0014\u001e\u001b\u000eծ%\u001f\u0012%4\u0019(&5", (short) (C1607wl.Xd() ^ 29667)), (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29), objArr9);
                f.c(strIntern, sb.append(((String) objArr9[0]).intern()).append(i8).toString());
            }
            this.f21704c = null;
            Iterator<b> it = f21691b.iterator();
            int i11 = f21699l + 55;
            f21698k = i11 % 128;
            int i12 = i11 % 2;
            while (!(!it.hasNext())) {
                b next = it.next();
                if (next.d() == i8) {
                    int i13 = f21698k + 101;
                    int i14 = i13 % 128;
                    f21699l = i14;
                    int i15 = i13 % 2;
                    this.f21704c = next;
                    int i16 = i14 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    f21698k = i16 % 128;
                    int i17 = i16 % 2;
                }
            }
            if (this.f21704c == null) {
                int iBlue = Color.blue(0) + 4;
                Object[] objArr10 = new Object[1];
                short sXd3 = (short) (Od.Xd() ^ (-14132));
                int[] iArr2 = new int["앑믙ᒂ晲".length()];
                QB qb2 = new QB("앑믙ᒂ晲");
                int i18 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i18] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i18));
                    i18++;
                }
                q(new String(iArr2, 0, i18), iBlue, objArr10);
                throw new RuntimeException(((String) objArr10[0]).intern());
            }
            List<b> list = f21691b;
            b bVar = list.get(list.size() - 1);
            if (this.f21704c.d() == bVar.d()) {
                int i19 = f21699l + 79;
                f21698k = i19 % 128;
                int i20 = i19 % 2;
                if (f.a()) {
                    Object[] objArr11 = new Object[1];
                    q(Wg.Zd("瞸䩙됮寫䴬룴㡮筧\udc21歜찫盹疊喋꼱\udd04␠㘄값㼜䵆쮼ꗺﺛ捊玲糝㸤\uf4c1⺋捾\uf068꣘筹罨룮\uf8d2蛤㕜᪴듔ṋ∞㏲繩簦䘄僣샡糇蠤\uf711쾝⽩䟐슍》₃먐趯㾃常ꍼ\udbdc鯇߽㗍祘⏌૫廬Ⅶ⣛嬤\ud891绊寞思", (short) (FB.Xd() ^ 22047), (short) (FB.Xd() ^ 13242)), ExpandableListView.getPackedPositionChild(0L) + 79, objArr11);
                    f.c(strIntern, ((String) objArr11[0]).intern());
                }
            } else {
                if (f.a()) {
                    int i21 = 78 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    Object[] objArr12 = new Object[1];
                    short sXd4 = (short) (C1499aX.Xd() ^ (-24184));
                    int[] iArr3 = new int["\uea48\ue963痒쨉\ud99c吏鏲譥ዱ㻆쨏鄷䘺䋕仵鮢罐뮮혖鞚쉖\uf346\uea5e\ue979窺\u2d7c挡쌂긑蝹혢鞦\uea68\ue983鐌兀\udcc2靎摠\ue632늤뢵\ueb02龰ẙ뫰燈\ue201\ude36評ꅌ횅\ueb15핵薬✓鰱᩷\udf38籯ᙿꗑ밋⸅伵䕣ꂳ᎕\uf3bd\udfd5餥縤\ue556ﯱᛡ⋮羌믪濎힌".length()];
                    QB qb3 = new QB("\uea48\ue963痒쨉\ud99c吏鏲譥ዱ㻆쨏鄷䘺䋕仵鮢罐뮮혖鞚쉖\uf346\uea5e\ue979窺\u2d7c挡쌂긑蝹혢鞦\uea68\ue983鐌兀\udcc2靎摠\ue632늤뢵\ueb02龰ẙ뫰燈\ue201\ude36評ꅌ횅\ueb15핵薬✓鰱᩷\udf38籯ᙿꗑ밋⸅伵䕣ꂳ᎕\uf3bd\udfd5餥縤\ue556ﯱᛡ⋮羌믪濎힌");
                    int i22 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i22] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd4 + i22));
                        i22++;
                    }
                    q(new String(iArr3, 0, i22), i21, objArr12);
                    f.c(strIntern, ((String) objArr12[0]).intern());
                }
                if (z3) {
                    if (f.a()) {
                        int iArgb = Color.argb(0, 0, 0, 0) + 59;
                        Object[] objArr13 = new Object[1];
                        short sXd5 = (short) (OY.Xd() ^ 30288);
                        int[] iArr4 = new int["㈬ㅅ떲ᇧⅸ䆸폊쬻動纨ᇯ턕﮵涭軛蔇\ue065卅㭫➁䰔⋼\ue820纹獅驓ᣚ\ud802\uf6ba궑\ue110ṇ倄氹⬥ᚁ࿋귙療\u0094깿\uf227᧐ࡏ槶ꤺ\u1a7eḕ뽔ﮰ樀ꥄ㗙䭋缲⤂쇷ꓐ⡌祝".length()];
                        QB qb4 = new QB("㈬ㅅ떲ᇧⅸ䆸폊쬻動纨ᇯ턕﮵涭軛蔇\ue065卅㭫➁䰔⋼\ue820纹獅驓ᣚ\ud802\uf6ba궑\ue110ṇ倄氹⬥ᚁ࿋귙療\u0094깿\uf227᧐ࡏ槶ꤺ\u1a7eḕ뽔ﮰ樀ꥄ㗙䭋缲⤂쇷ꓐ⡌祝");
                        int i23 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i23] = xuXd4.fK((sXd5 ^ i23) + xuXd4.CK(iKK4));
                            i23++;
                        }
                        q(new String(iArr4, 0, i23), iArgb, objArr13);
                        f.c(strIntern, ((String) objArr13[0]).intern());
                    }
                    this.f21704c = bVar;
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    Object[] objArr14 = new Object[1];
                    p(View.resolveSize(0, 0) + 26, strZd, (byte) (55 - (Process.myPid() >> 22)), objArr14);
                    editorEdit.putInt(((String) objArr14[0]).intern(), this.f21704c.d()).commit();
                    this.f21703a = null;
                } else if (z2) {
                    if (f.a()) {
                        Object[] objArr15 = new Object[1];
                        p(View.MeasureSpec.getSize(0) + 48, Qg.kd("\n~k\t\u0006n\u007ffpq\u0001w\u0001ual[daluseVsYڃPcVmcgټRbLbٷIeJAJ_@CP", (short) (FB.Xd() ^ 11805), (short) (FB.Xd() ^ 2659)), (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 95), objArr15);
                        f.c(strIntern, ((String) objArr15[0]).intern());
                    }
                    this.f21703a = new C0346e(this, bVar);
                } else if (o.c.a.e(context) == o.c.c.f21972e) {
                    if (f.a()) {
                        int i24 = f21698k + 109;
                        f21699l = i24 % 128;
                        int i25 = i24 % 2;
                        Object[] objArr16 = new Object[1];
                        p(96 - ImageFormat.getBitsPerPixel(0), hg.Vd("=2\u001f<9\"3\u001a$%4+1#\u00160+/\u001d\u0016\u0013\n\u0014(\u000f\u0018\u001f\u0012\u0013\u0011˫ \u0002\u001f\u0014\u001c\u000f\u007f\u001a\u0003~\b\u000f\b\n\u0012tys\u0002\u000f\u007flw|sˑ\u0006u\u0003\u0003hˋ`|qa}laxkjqrspeX_XQNm^af[KgXNL]BMﰄ", (short) (ZN.Xd() ^ 7810), (short) (ZN.Xd() ^ 12155)), (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 109), objArr16);
                        f.c(strIntern, ((String) objArr16[0]).intern());
                    }
                    this.f21704c = bVar;
                    SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                    Object[] objArr17 = new Object[1];
                    p(TextUtils.getOffsetAfter("", 0) + 26, strZd, (byte) (56 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr17);
                    editorEdit2.putInt(((String) objArr17[0]).intern(), this.f21704c.d()).commit();
                    this.f21703a = null;
                } else if (f.a()) {
                    Object[] objArr18 = new Object[1];
                    q(C1561oA.ud("㯧㬀뽭ᮢ⬳䭳\udd85퓶岀術ᮚ\udac0묭㍤ﮨ캵㙱⍩﨤Շ挺팽␁➘폭첐쪾ᬜꆄ⯩Ʊ㝿럲ﮚ䜆픶ꎆ\u0c3b㯁㫚\udd61䭟陎Ⱑ\uea8d⟄㱒⚰컥灊\ue566措ど얞ꬃ綻⸅\ue08f궟㝯ﯟ৮㰹\ue8e5占࠺ࠟ뛶\u139d䒋끽绋\uea71➨㰶⚔\uecaf\ued3f펷챚\ue56c⽥ㅿ芐", (short) (Od.Xd() ^ (-8024))), Color.blue(0) + 83, objArr18);
                    f.c(strIntern, ((String) objArr18[0]).intern());
                }
            }
            this.f21705e = true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void e() throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f21698k + 21;
            f21699l = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            p(20 - TextUtils.indexOf((CharSequence) "", '0'), "\u001b#\u0017\u0007\u0011\u0003\u0005\u000b\u001f\u0015!\u0003\u0017\u0007\u0013\n\u0019\r\t\u0011㗰", (byte) (8 - (ViewConfiguration.getWindowTouchSlop() >> 8)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            p((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5, "\u0003\u0011\u0015\u0011㙖", (byte) (104 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        this.f21705e = false;
        this.f21704c = null;
        this.f21703a = null;
        int i5 = f21698k + 17;
        f21699l = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
    }
}
