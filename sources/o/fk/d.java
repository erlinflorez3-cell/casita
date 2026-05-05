package o.fk;

import android.graphics.Color;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import o.a.f;
import o.a.h;
import o.ef.c;
import o.ff.a;
import o.ff.e;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends a {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f25961a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f25962c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f25963d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f25964e = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char[] f25965j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static char[] f25966k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f25967l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static boolean f25968m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static char f25969n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static boolean f25970o = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f25971q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f25972r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f25973s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f25974t = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25975b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<C0351d> f25976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f25977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private short f25978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte f25979i;

    /* JADX INFO: renamed from: o.fk.d$d, reason: collision with other inner class name */
    public static final class C0351d {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f25988f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static boolean f25989g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static char[] f25990h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static boolean f25991i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f25992j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static int f25993k = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static int f25994m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static int f25995n = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f25996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f25998c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private o.ff.b f25999d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f26000e;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r7, int r8, byte r9) {
            /*
                int r0 = r7 * 4
                int r7 = r0 + 4
                int r0 = r8 * 6
                int r6 = 73 - r0
                int r5 = r9 * 4
                int r0 = r5 + 1
                byte[] r4 = o.fk.d.C0351d.$$a
                byte[] r3 = new byte[r0]
                r2 = 0
                if (r4 != 0) goto L29
                r1 = r5
                r0 = r2
            L15:
                int r6 = r6 + r1
                int r7 = r7 + 1
                r1 = r0
            L19:
                byte r0 = (byte) r6
                r3[r1] = r0
                int r0 = r1 + 1
                if (r1 != r5) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r3, r2)
                return r0
            L26:
                r1 = r4[r7]
                goto L15
            L29:
                r1 = r2
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.fk.d.C0351d.$$c(int, int, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f25995n = 0;
            f25993k = 1;
            f25992j = 0;
            f25994m = 1;
            j();
            Process.getThreadPriority(0);
            Color.red(0);
            int i2 = f25995n + 11;
            f25993k = i2 % 128;
            int i3 = i2 % 2;
        }

        public C0351d(String str, long j2, byte[] bArr, int i2, o.ff.b bVar) {
            this.f25998c = str;
            this.f26000e = j2;
            this.f25996a = bArr;
            this.f25997b = i2;
            this.f25999d = bVar;
        }

        static void init$0() {
            $$a = new byte[]{Ascii.CR, Ascii.ESC, 39, 17};
            $$b = 227;
        }

        static void j() {
            f25990h = new char[]{2095, 2136};
            f25988f = 2040400299;
            f25989g = true;
            f25991i = true;
        }

        private static void l(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
            String str3 = str;
            String str4 = str2;
            int i3 = 2;
            int i4 = 2 % 2;
            Object obj = str4;
            if (str4 != null) {
                byte[] bytes = str4.getBytes("ISO-8859-1");
                int i5 = $11 + 105;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                obj = bytes;
            }
            byte[] bArr = (byte[]) obj;
            Object charArray = str3;
            if (str3 != null) {
                charArray = str3.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            f fVar = new f();
            char[] cArr2 = f25990h;
            int i7 = 0;
            if (cArr2 != null) {
                int i8 = $11 + 15;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i10 = 0;
                while (i10 < length) {
                    int i11 = $11 + 55;
                    $10 = i11 % 128;
                    int i12 = i11 % i3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i10])};
                        Object objA = o.d.d.a(1618406102);
                        if (objA == null) {
                            byte b2 = (byte) i7;
                            byte b3 = (byte) (b2 + 1);
                            objA = o.d.d.a(593 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (13181 - TextUtils.indexOf("", "", i7)), 11 - TextUtils.indexOf("", "", i7, i7), -1225586509, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i10++;
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
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(f25988f)};
            Object objA2 = o.d.d.a(-1503702982);
            if (objA2 == null) {
                objA2 = o.d.d.a(32 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) Color.argb(0, 0, 0, 0), 11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1893380703, false, "F", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
            char c2 = '0';
            int i13 = 1540807955;
            if (f25991i) {
                fVar.f19923e = bArr.length;
                char[] cArr4 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    int i14 = $11 + 45;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        cArr4[fVar.f19922a] = (char) (cArr2[bArr[fVar.f19923e * fVar.f19922a] + i2] % iIntValue);
                        Object[] objArr4 = {fVar, fVar};
                        Object objA3 = o.d.d.a(1540807955);
                        if (objA3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA3 = o.d.d.a(457 - TextUtils.indexOf("", c2, 0, 0), (char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10, -1923924106, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr4);
                    } else {
                        cArr4[fVar.f19922a] = (char) (cArr2[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                        Object[] objArr5 = {fVar, fVar};
                        Object objA4 = o.d.d.a(1540807955);
                        if (objA4 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objA4 = o.d.d.a(459 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) KeyEvent.getDeadChar(0, 0), 11 - View.resolveSizeAndState(0, 0, 0), -1923924106, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA4).invoke(null, objArr5);
                    }
                    c2 = '0';
                }
                objArr[0] = new String(cArr4);
                return;
            }
            int i15 = 0;
            if (f25989g) {
                fVar.f19923e = cArr.length;
                char[] cArr5 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    cArr5[fVar.f19922a] = (char) (cArr2[cArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    Object[] objArr6 = {fVar, fVar};
                    Object objA5 = o.d.d.a(i13);
                    if (objA5 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objA5 = o.d.d.a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 459, (char) (Process.getGidForName("") + 1), 10 - TextUtils.lastIndexOf("", '0', 0, 0), -1923924106, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA5).invoke(null, objArr6);
                    i13 = 1540807955;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            fVar.f19923e = iArr.length;
            char[] cArr6 = new char[fVar.f19923e];
            while (true) {
                fVar.f19922a = i15;
                if (fVar.f19922a >= fVar.f19923e) {
                    break;
                }
                int i16 = $10 + 121;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    cArr6[fVar.f19922a] = (char) (cArr2[iArr[fVar.f19923e % fVar.f19922a] % i2] / iIntValue);
                    i15 = fVar.f19922a % 1;
                } else {
                    cArr6[fVar.f19922a] = (char) (cArr2[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    i15 = fVar.f19922a + 1;
                }
            }
            String str5 = new String(cArr6);
            int i17 = $10 + 7;
            $11 = i17 % 128;
            if (i17 % 2 != 0) {
                objArr[0] = str5;
            } else {
                int i18 = 94 / 0;
                objArr[0] = str5;
            }
        }

        public final long a() {
            int i2 = 2 % 2;
            int i3 = f25992j + 39;
            f25994m = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f26000e;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void a(int i2) {
            int i3 = 2 % 2;
            int i4 = f25992j + 7;
            int i5 = i4 % 128;
            f25994m = i5;
            int i6 = i4 % 2;
            this.f25997b = i2;
            int i7 = i5 + 17;
            f25992j = i7 % 128;
            int i8 = i7 % 2;
        }

        public final String b() throws Throwable {
            int i2 = 2 % 2;
            StringBuilder sbAppend = new StringBuilder().append(String.valueOf(this.f26000e));
            Object[] objArr = new Object[1];
            l(TextUtils.indexOf("", "") + 127, null, null, "\u0081", objArr);
            StringBuilder sbAppend2 = sbAppend.append(((String) objArr[0]).intern()).append(o.dl.d.e(this.f25996a));
            Object[] objArr2 = new Object[1];
            l(127 - (ViewConfiguration.getPressedStateDuration() >> 16), null, null, "\u0081", objArr2);
            StringBuilder sbAppend3 = sbAppend2.append(((String) objArr2[0]).intern()).append(this.f25997b);
            Object[] objArr3 = new Object[1];
            l((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, null, null, "\u0081", objArr3);
            StringBuilder sbAppend4 = sbAppend3.append(((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            l(126 - ((byte) KeyEvent.getModifierMetaStateMask()), null, null, "\u0082", objArr4);
            String string = sbAppend4.append(((String) objArr4[0]).intern()).toString();
            int i3 = f25994m + 29;
            f25992j = i3 % 128;
            int i4 = i3 % 2;
            return string;
        }

        public final byte[] c() {
            int i2 = 2 % 2;
            int i3 = f25992j + 31;
            f25994m = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f25996a;
            }
            int i4 = 2 / 0;
            return this.f25996a;
        }

        public final String d() {
            int i2 = 2 % 2;
            int i3 = f25994m;
            int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f25992j = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.f25998c;
            int i5 = i3 + 39;
            f25992j = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final o.ff.b e() {
            o.ff.b bVar;
            int i2 = 2 % 2;
            int i3 = f25992j;
            int i4 = i3 + 117;
            f25994m = i4 % 128;
            if (i4 % 2 == 0) {
                bVar = this.f25999d;
                int i5 = 41 / 0;
            } else {
                bVar = this.f25999d;
            }
            int i6 = i3 + 77;
            f25994m = i6 % 128;
            int i7 = i6 % 2;
            return bVar;
        }

        public final int g() {
            int i2 = 2 % 2;
            int i3 = f25994m + 17;
            int i4 = i3 % 128;
            f25992j = i4;
            int i5 = i3 % 2;
            int i6 = this.f25997b;
            int i7 = i4 + 11;
            f25994m = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, byte r9, short r10) {
        /*
            byte[] r7 = o.fk.d.$$a
            int r6 = r8 + 67
            int r1 = r9 * 3
            int r0 = 1 - r1
            int r5 = r10 + 4
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r7 != 0) goto L26
            r0 = r2
            r1 = r3
        L13:
            int r6 = r6 + r0
        L14:
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r1 != r2) goto L1f
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L1f:
            int r5 = r5 + 1
            r0 = r7[r5]
            int r1 = r1 + 1
            goto L13
        L26:
            r1 = r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fk.d.$$c(byte, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25963d = -1732973443;
        f25964e = 2089978807;
        f25962c = -1057872485;
        f25961a = 1307955534;
        f25973s = 0;
        f25972r = 1;
        f25971q = 0;
        f25974t = 1;
        o();
        ViewConfiguration.getJumpTapTimeout();
        KeyEvent.getDeadChar(0, 0);
        TextUtils.indexOf("", "", 0);
        View.resolveSizeAndState(0, 0, 0);
        ExpandableListView.getPackedPositionGroup(0L);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        int i2 = f25973s + 49;
        f25972r = i2 % 128;
        int i3 = i2 % 2;
    }

    public d(boolean z2, o.ff.b bVar, short s2) {
        super(z2, bVar, s2);
    }

    public static /* synthetic */ Object b(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i4;
        int i9 = ~i2;
        int i10 = ~(i9 | i7);
        int i11 = (i10 + i8) - (i10 & i8);
        int i12 = ~i7;
        int i13 = ~((-1) - (((-1) - ((i9 + i12) - (i9 & i12))) & ((-1) - i4)));
        int i14 = ~(i7 | i8);
        int i15 = ((i14 + i9) - (i14 & i9)) | (~(i12 | i4));
        int i16 = i4 + i2 + i3 + (325770565 * i5) + ((-1284996642) * i6);
        int i17 = i16 * i16;
        int i18 = ((789042555 * i4) - 1205338112) + ((-1364710777) * i2) + (i11 * 1076876666) + (1076876666 * i13) + ((-1076876666) * i15) + ((-287834112) * i3) + ((-667418624) * i5) + ((-145752064) * i6) + (1116340224 * i17);
        int i19 = (i4 * (-1991011123)) + 595473426 + (i2 * (-1991009311)) + (i11 * (-906)) + (i13 * (-906)) + (i15 * TypedValues.Custom.TYPE_REFERENCE) + (i3 * (-1991010217)) + (i5 * (-1223611789)) + (i6 * (-291900814)) + (i17 * (-1931083776));
        int i20 = i18 + (i19 * i19 * (-1558839296));
        return i20 != 1 ? i20 != 2 ? b(objArr) : e(objArr) : c(objArr);
    }

    private static /* synthetic */ Object b(Object[] objArr) throws Throwable {
        d dVar = (d) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i2 = 2 % 2;
        int i3 = f25974t + 25;
        int i4 = i3 % 128;
        f25971q = i4;
        int i5 = i3 % 2;
        Object obj = null;
        if (dVar.f25978h == 0) {
            int i6 = i4 + 49;
            f25974t = i6 % 128;
            if (i6 % 2 == 0) {
                dVar.f25976f.size();
                obj.hashCode();
                throw null;
            }
            if (dVar.f25976f.size() == 0) {
                return null;
            }
        }
        c cVar = new c();
        int i7 = 0;
        for (C0351d c0351d : dVar.f25976f) {
            o.ef.a aVar = new o.ef.a();
            Object[] objArr2 = new Object[1];
            u(127 - TextUtils.indexOf("", "", 0, 0), null, null, "\u0083\u0082\u0081", objArr2);
            aVar.c(((String) objArr2[0]).intern(), iIntValue + i7);
            Object[] objArr3 = new Object[1];
            p((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 5, "\u0011\u0002\u0011\u0004\f\u000f", (byte) (45 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr3);
            aVar.a(((String) objArr3[0]).intern(), (Object) c0351d.e().a());
            i7++;
            cVar.a(aVar);
        }
        for (int i8 = 0; i8 < dVar.f25978h - dVar.f25976f.size(); i8++) {
            o.ef.a aVar2 = new o.ef.a();
            Object[] objArr4 = new Object[1];
            u(127 - View.MeasureSpec.getSize(0), null, null, "\u0083\u0082\u0081", objArr4);
            aVar2.c(((String) objArr4[0]).intern(), iIntValue + i7 + i8);
            Object[] objArr5 = new Object[1];
            p(6 - TextUtils.getCapsMode("", 0, 0), "\u0011\u0002\u0011\u0004\f\u000f", (byte) (TextUtils.indexOf("", "", 0, 0) + 44), objArr5);
            aVar2.a(((String) objArr5[0]).intern(), (Object) dVar.b().a());
            cVar.a(aVar2);
        }
        return cVar;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        d dVar = (d) objArr[0];
        List<C0351d> list = (List) objArr[1];
        int i2 = 2 % 2;
        int i3 = f25974t + 87;
        f25971q = i3 % 128;
        if (i3 % 2 == 0) {
            dVar.f25976f = list;
            return null;
        }
        dVar.f25976f = list;
        throw null;
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        int i3 = f25971q + 45;
        f25974t = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            dVar.c(o.ff.b.f25843a);
            obj.hashCode();
            throw null;
        }
        dVar.c(o.ff.b.f25843a);
        int i4 = f25974t + 3;
        f25971q = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{123, MessagePack.Code.FLOAT32, 0, -17};
        $$b = 247;
    }

    static void o() {
        f25965j = new char[]{2171, 2134, 2169, 2153, 2132, 2158, 2168, 2135, 2147, 2150, 2444, 2151, 2130, 2441, 2156, 2149, 2167, 2433, 2131, 2436, 2157, 2152, 2442, 2159, 2490, 2479, 2145, 2434, 2446, 2146, 2448, 2471, 2155};
        f25967l = 2040400346;
        f25970o = true;
        f25968m = true;
        f25966k = new char[]{51645, 64577, 64582, 64590, 64625, 64593, 64612, 64622, 64614, 64578, 64604, 64597, 64605, 64576, 64598, 64583, 64580, 64592, 51644, 64584, 64517, 64627, 64611, 64585, 64520, 64586, 64630, 64595, 64588, 64629, 64589, 64619, 64624, 64599, 64587, 51646};
        f25969n = (char) 51641;
    }

    private static void p(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        int i4;
        String str2 = str;
        char c2 = 2;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            charArray = str2.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        h hVar = new h();
        char[] cArr2 = f25966k;
        int i6 = 421932776;
        long j2 = 0;
        char c3 = 11;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objA = o.d.d.a(i6);
                    if (objA == null) {
                        int iResolveSize = 270 - View.resolveSize(0, 0);
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(j2);
                        int iIndexOf = 11 - TextUtils.indexOf("", "", 0, 0);
                        byte b3 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 43)));
                        byte b4 = $$a[c2];
                        objA = o.d.d.a(iResolveSize, packedPositionType, iIndexOf, -811348851, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i7++;
                    c2 = 2;
                    i6 = 421932776;
                    j2 = 0;
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
        Object[] objArr3 = {Integer.valueOf(f25969n)};
        Object objA2 = o.d.d.a(421932776);
        if (objA2 == null) {
            int i8 = 270 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
            char mode = (char) View.MeasureSpec.getMode(0);
            int offsetAfter = 11 - TextUtils.getOffsetAfter("", 0);
            int i9 = $$b;
            byte b5 = $$a[2];
            objA2 = o.d.d.a(i8, mode, offsetAfter, -811348851, false, $$c((byte) ((i9 + 43) - (i9 | 43)), b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            int i10 = $11 + 95;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                i3 = i2 + 45;
                cArr4[i3] = (char) (cArr[i3] % b2);
            } else {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b2);
            }
        } else {
            i3 = i2;
        }
        int i11 = 1;
        if (i3 > 1) {
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + i11];
                if (hVar.f19927c == hVar.f19925a) {
                    int i12 = $11 + 59;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c + b2);
                        cArr4[hVar.f19926b - 1] = (char) (hVar.f19925a + b2);
                    } else {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                        cArr4[hVar.f19926b + 1] = (char) (hVar.f19925a - b2);
                    }
                    i4 = 2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[c3] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        int i13 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 824;
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 12;
                        byte b6 = $$a[2];
                        objA3 = o.d.d.a(i13, maximumDrawingCacheSize, iIndexOf2, -611683395, false, $$c((byte) 44, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + JfifUtil.MARKER_SOS;
                            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int packedPositionType2 = ExpandableListView.getPackedPositionType(0L) + 11;
                            byte b7 = $$a[2];
                            c3 = 11;
                            objA4 = o.d.d.a(iKeyCodeFromString, doubleTapTimeout, packedPositionType2, 212688716, false, $$c((byte) 42, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c3 = 11;
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i14 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i14];
                        int i15 = $11 + 15;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                    } else {
                        c3 = 11;
                        if (hVar.f19928d == hVar.f19929e) {
                            int i17 = $11 + 45;
                            $10 = i17 % 128;
                            int i18 = i17 % 2;
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i19 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i20 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i19];
                            cArr4[hVar.f19926b + 1] = cArr2[i20];
                        } else {
                            int i21 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i22 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i21];
                            i11 = 1;
                            cArr4[hVar.f19926b + 1] = cArr2[i22];
                            int i23 = $11 + 35;
                            $10 = i23 % 128;
                            i4 = 2;
                            int i24 = i23 % 2;
                            hVar.f19926b += i4;
                        }
                    }
                    i4 = 2;
                }
                i11 = 1;
                hVar.f19926b += i4;
            }
        }
        int i25 = 0;
        while (i25 < i2) {
            int i26 = $11 + 39;
            $10 = i26 % 128;
            if (i26 % 2 != 0) {
                cArr4[i25] = (char) (cArr4[i25] ^ 14000);
                i25 += 15;
            } else {
                cArr4[i25] = (char) (cArr4[i25] ^ 13722);
                i25++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private static void u(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        int i3;
        char[] cArr;
        String str3 = str;
        String str4 = str2;
        int i4 = 2;
        int i5 = 2 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        f fVar = new f();
        char[] cArr3 = f25965j;
        char c2 = '0';
        int i6 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 55;
                $11 = i8 % 128;
                int i9 = i8 % i4;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i7])};
                    Object objA = o.d.d.a(1618406102);
                    if (objA == null) {
                        int iIndexOf = 592 - TextUtils.indexOf("", c2);
                        char keyRepeatTimeout = (char) (13181 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        int iBlue = Color.blue(i6) + 11;
                        byte b2 = $$a[i4];
                        byte b3 = b2;
                        objA = o.d.d.a(iIndexOf, keyRepeatTimeout, iBlue, -1225586509, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i7] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i7++;
                    i4 = 2;
                    c2 = '0';
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(f25967l)};
        Object objA2 = o.d.d.a(-1503702982);
        if (objA2 == null) {
            objA2 = o.d.d.a(32 - Color.blue(0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), ExpandableListView.getPackedPositionType(0L) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f25968m) {
            int i10 = $10 + 121;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                fVar.f19923e = bArr.length;
                cArr = new char[fVar.f19923e];
                i3 = 0;
            } else {
                i3 = 0;
                fVar.f19923e = bArr.length;
                cArr = new char[fVar.f19923e];
            }
            fVar.f19922a = i3;
            while (fVar.f19922a < fVar.f19923e) {
                cArr[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = o.d.d.a(1540807955);
                if (objA3 == null) {
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 458;
                    char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                    int mirror = AndroidCharacter.getMirror('0') - '%';
                    int i11 = $$b;
                    byte b4 = $$a[2];
                    objA3 = o.d.d.a(maxKeyCode, tapTimeout, mirror, -1923924106, false, $$c((byte) ((i11 + 14) - (i11 | 14)), b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr);
            return;
        }
        int i12 = 0;
        if (f25970o) {
            fVar.f19923e = cArr2.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                int i13 = $10 + 29;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    cArr5[fVar.f19922a] = (char) (cArr3[cArr2[fVar.f19923e / fVar.f19922a] << i2] * iIntValue);
                    Object[] objArr5 = {fVar, fVar};
                    Object objA4 = o.d.d.a(1540807955);
                    if (objA4 == null) {
                        int iResolveOpacity = 458 - Drawable.resolveOpacity(0, 0);
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                        int threadPriority = 11 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte b5 = (byte) ($$b & 14);
                        byte b6 = $$a[2];
                        objA4 = o.d.d.a(iResolveOpacity, cLastIndexOf, threadPriority, -1923924106, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                } else {
                    cArr5[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    Object[] objArr6 = {fVar, fVar};
                    Object objA5 = o.d.d.a(1540807955);
                    if (objA5 == null) {
                        int iAxisFromString = 10 - MotionEvent.axisFromString("");
                        byte b7 = (byte) ($$b & 14);
                        byte b8 = $$a[2];
                        objA5 = o.d.d.a(Color.rgb(0, 0, 0) + 16777674, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), iAxisFromString, -1923924106, false, $$c(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        fVar.f19923e = iArr.length;
        char[] cArr6 = new char[fVar.f19923e];
        while (true) {
            fVar.f19922a = i12;
            if (fVar.f19922a >= fVar.f19923e) {
                String str5 = new String(cArr6);
                int i14 = $11 + 21;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                objArr[0] = str5;
                return;
            }
            cArr6[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            i12 = fVar.f19922a + 1;
        }
    }

    public final void a(byte b2) {
        int i2 = 2 % 2;
        int i3 = f25971q;
        int i4 = i3 + 121;
        f25974t = i4 % 128;
        if (i4 % 2 == 0) {
            this.f25979i = b2;
            int i5 = 29 / 0;
        } else {
            this.f25979i = b2;
        }
        int i6 = i3 + 61;
        f25974t = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public final e b(int i2) throws Throwable {
        Object obj;
        int i3 = 2 % 2;
        int i4 = f25974t + 109;
        f25971q = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = new Object[1];
        p(13 - TextUtils.lastIndexOf("", '0'), "\u0016\u001b\u000f\u0011\u001c\u0011\u0007\u0016\u0010\u001f\u0001\u000b\u0010\u0007", (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 95), objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (!c()) {
            int i6 = f25974t + 7;
            f25971q = i6 % 128;
            int i7 = i6 % 2;
            if (o.ea.f.a()) {
                int i8 = f25971q + 57;
                f25974t = i8 % 128;
                if (i8 % 2 == 0) {
                    Object[] objArr2 = new Object[1];
                    u(View.MeasureSpec.getSize(1) + 89, null, null, "\u008c\u0086\u0087\u0081\u0086\u0089\u0081\u0085\u0081\u0099\u0082\u0095\u008f\u0099\u0084\u0089\u0099\u0093\u008c\u009b\u0099\u009a\u0099\u0082\u008f\u008c\u0098\u0093\u0081\u0097\u0096\u0095\u0094\u0093\u008c\u0092\u008c\u0084\u0091\u008c\u0086\u0090\u008f\u0089\u008e\u0082\u008d\u008c\u008b\u008a\u0086\u0089\u0088\u0087", objArr2);
                    obj = objArr2[0];
                } else {
                    Object[] objArr3 = new Object[1];
                    u(View.MeasureSpec.getSize(0) + 127, null, null, "\u008c\u0086\u0087\u0081\u0086\u0089\u0081\u0085\u0081\u0099\u0082\u0095\u008f\u0099\u0084\u0089\u0099\u0093\u008c\u009b\u0099\u009a\u0099\u0082\u008f\u008c\u0098\u0093\u0081\u0097\u0096\u0095\u0094\u0093\u008c\u0092\u008c\u0084\u0091\u008c\u0086\u0090\u008f\u0089\u008e\u0082\u008d\u008c\u008b\u008a\u0086\u0089\u0088\u0087", objArr3);
                    obj = objArr3[0];
                }
                o.ea.f.d(strIntern, ((String) obj).intern());
            }
            return null;
        }
        if (o.ea.f.a()) {
            int i9 = f25974t + 3;
            f25971q = i9 % 128;
            int i10 = i9 % 2;
            Object[] objArr4 = new Object[1];
            u(View.MeasureSpec.makeMeasureSpec(0, 0) + 127, null, null, "\u0084 \u0099\u009f\u0099\u0096\u008c\u0082\u008f\u0088\u0095\u0083\u0099\u008c\u0083\u008f\u008c\u0088¡\u008c\u0084\u0099\u009a\u0099\u0084 \u0099\u009f\u0099\u0082\u008f\u008c\u0098\u0093\u0081\u0097\u0099\u008d\u0081\u0098\u0099\u009a\u0099\u0084 \u0099\u009f\u0099\u009e\u0082\u0090\u008f\u008c\u009d\u0099\u0093\u0096\u0095\u0082\u0084\u0089\u009c\u0099\u008c\u0090\u0081\u0084\u0091\u0099\u0093\u008c\u009b\u0099\u009a\u0099\u0082\u008f\u008c\u0098\u0093\u0081\u0097\u0096\u0095\u0094\u0093\u008c\u0092\u008c\u0084\u0091\u008c\u0086\u0090\u008f\u0089\u008e\u0082\u008d\u008c\u008b\u008a\u0086\u0089\u0088\u0087", objArr4);
            o.ea.f.c(strIntern, String.format(((String) objArr4[0]).intern(), Integer.valueOf(this.f25976f.size()), Short.valueOf(this.f25978h), Integer.valueOf(this.f25975b)));
        }
        if (this.f25976f.size() >= this.f25978h && o.ea.f.a()) {
            int i11 = f25971q + 59;
            f25974t = i11 % 128;
            int i12 = i11 % 2;
            Object[] objArr5 = new Object[1];
            p(77 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u0010\f\u001d\u0016\u0007\u0001\u000e\r\u0002\u001d\"\u0004\u000b\u0015\u000e\u001f\u000f\u000e\r\u0013\u0010\u001c\u001b\u001f\u001c\u0011\u0007\u0016\u0010\u001f\u0002\u0017\u001a\u0012\u0001\u000f\b\u0016\"\f\u0014\u001a\u001f\u000f\u000e\u0004\u001f\f\u0002\u0013\u001d\u0004\u0014\u001a\u0016\r\u0010\u0018\u0017\r\u0014\u0015\n\u0011\u0007\u0016\u0010\u001f\u0002\u0017#\u0010\u0015\r\u000f\u001f", (byte) (97 - TextUtils.lastIndexOf("", '0', 0, 0)), objArr5);
            o.ea.f.c(strIntern, ((String) objArr5[0]).intern());
        }
        if (this.f25975b < 65535) {
            if (this.f25976f.size() + i2 < 65535) {
                return new b(o.ff.b.f25845c, a(), i2 + this.f25976f.size(), this.f25977g, this.f25979i) { // from class: o.fk.d.3

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static char[] f25980b = null;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static char f25981d = 0;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    private static int f25982f = 1;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    private static int f25983g = 1;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    private static int f25984h = 0;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    private static int f25985j = 0;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private final d f25987e;

                    static {
                        g();
                        View.MeasureSpec.getMode(0);
                        TypedValue.complexToFloat(0);
                        int i13 = f25984h + 71;
                        f25983g = i13 % 128;
                        if (i13 % 2 == 0) {
                            int i14 = 0 / 0;
                        }
                    }

                    {
                        this.f25987e = d.this;
                    }

                    static void g() {
                        f25980b = new char[]{64593, 64588, 64578, 64598, 64587, 64576, 64584, 64629, 64604, 64630, 64627, 64585, 64523, 64624, 64622, 64580};
                        f25981d = (char) 51643;
                    }

                    @Override // o.ff.e, o.ff.a
                    public final boolean d(String str, o.dk.a aVar) {
                        int i13 = 2 % 2;
                        int i14 = f25982f + 87;
                        f25985j = i14 % 128;
                        int i15 = i14 % 2;
                        if (b() != o.ff.b.f25845c) {
                            return false;
                        }
                        int i16 = f25982f + 51;
                        f25985j = i16 % 128;
                        if (i16 % 2 != 0) {
                            c(o.ff.b.f25844b);
                            return false;
                        }
                        c(o.ff.b.f25844b);
                        return true;
                    }
                };
            }
            if (o.ea.f.a()) {
                Object[] objArr6 = new Object[1];
                p(67 - TextUtils.indexOf("", "", 0, 0), "\u0010\f\u001d\u0016\u0007\u0001\u000e\r\u0002\u001d\"\u0004\u000b\u0015\u000e\u001f\u000f\u000e\r\u0013\u0010\u001c\u001b\u001f\u001c\u0011\u0007\u0016\u0010\u001f\u0002\u0017\u001a\u0012\n\u0000\u000e\u001a\"\f\u0014\u001a\u001f\u000f\u000e\u0004\u001f\f\u0002\u0013\u0000#\u000e\u0013\u0016\r\u0010\u0018\u0017\r\u0014\u0015\u001c\u000f\u001d\u0017㘍", (byte) (14 - KeyEvent.keyCodeFromString("")), objArr6);
                o.ea.f.d(strIntern, ((String) objArr6[0]).intern());
            }
            return null;
        }
        if (!(!o.ea.f.a())) {
            int i13 = f25974t + 125;
            f25971q = i13 % 128;
            int i14 = i13 % 2;
            Object[] objArr7 = new Object[1];
            u(TextUtils.indexOf("", "", 0) + 127, null, null, "\u008c\u0088\u0086\u0081\u0085\u0099\u0098\u0088\u0098\u0089\u008d\u0081\u0098\u0099\u008c\u009e\u0082\u0099\u008a\u008c\u009e\u0083\u0081\u008c\u0096\u0099\u0084\u0081\u009e\u0099\u0096\u008c\u0082\u008f\u0088\u0095\u0083\u0099\u008c\u0083\u008f\u008c\u0088¡\u008c\u008e\u0099\u009a\u0099\u0082\u008f\u008c\u0098\u0093\u0081\u0097\u0096\u0095\u0094\u0093\u008c\u0092\u008c\u0084\u0091\u008c\u0086\u0090\u008f\u0089\u008e\u0082\u008d\u008c\u008b\u008a\u0086\u0089\u0088\u0087", objArr7);
            o.ea.f.d(strIntern, ((String) objArr7[0]).intern());
            int i15 = f25971q + 55;
            f25974t = i15 % 128;
            int i16 = i15 % 2;
        }
        return null;
    }

    public final void c(int i2) {
        int i3 = 2 % 2;
        int i4 = f25971q + 101;
        int i5 = i4 % 128;
        f25974t = i5;
        if (i4 % 2 == 0) {
            this.f25975b = i2;
            throw null;
        }
        this.f25975b = i2;
        int i6 = i5 + 9;
        f25971q = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void c(List<C0351d> list) {
        int i2 = f25964e * 683229526;
        f25964e = i2;
        b(1823901947, (int) Runtime.getRuntime().freeMemory(), -1823901946, new Object[]{this, list}, Thread.currentThread().getPriority(), Process.myTid(), i2);
    }

    @Override // o.ff.a
    public final void d() {
        int i2 = f25963d * (-900626085);
        f25963d = i2;
        b(-2095905912, Thread.activeCount(), 2095905914, new Object[]{this}, new Random().nextInt(1701854888), Thread.currentThread().getPriority(), i2);
    }

    @Override // o.ff.a
    public final boolean d(String str, o.dk.a aVar) {
        int i2 = 2 % 2;
        int i3 = f25974t + 57;
        f25971q = i3 % 128;
        int i4 = i3 % 2;
        if (b() == o.ff.b.f25845c) {
            c(o.ff.b.f25844b);
            return true;
        }
        int i5 = f25971q + 99;
        f25974t = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public final c e(int i2) throws o.ef.b {
        Object[] objArr = {this, Integer.valueOf(i2)};
        int i3 = f25961a * 1858853131;
        f25961a = i3;
        int iNextInt = new Random().nextInt(2145090875);
        int iMyTid = Process.myTid();
        int i4 = f25962c * (-301211916);
        f25962c = i4;
        return (c) b(-823306114, iNextInt, 823306114, objArr, iMyTid, i4, i3);
    }

    public final void e(String str) {
        int i2 = 2 % 2;
        int i3 = f25974t + 109;
        f25971q = i3 % 128;
        if (i3 % 2 == 0) {
            this.f25977g = str;
        } else {
            this.f25977g = str;
            int i4 = 56 / 0;
        }
    }

    public final void e(short s2) {
        int i2 = 2 % 2;
        int i3 = f25971q;
        int i4 = i3 + 99;
        f25974t = i4 % 128;
        int i5 = i4 % 2;
        this.f25978h = s2;
        int i6 = i3 + 45;
        f25974t = i6 % 128;
        int i7 = i6 % 2;
    }

    public final int g() {
        int i2 = 2 % 2;
        int i3 = f25974t + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f25971q = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f25975b;
        }
        throw null;
    }

    @Override // o.ff.a
    public final short h() {
        int i2 = 2 % 2;
        int i3 = f25971q + 57;
        f25974t = i3 % 128;
        int i4 = i3 % 2;
        short size = (short) (this.f25978h - this.f25976f.size());
        if (size <= 0) {
            return (short) 0;
        }
        int i5 = f25974t + 33;
        f25971q = i5 % 128;
        if (i5 % 2 == 0) {
            return size;
        }
        throw null;
    }

    public final List<C0351d> i() {
        int i2 = 2 % 2;
        int i3 = f25974t;
        int i4 = i3 + 55;
        f25971q = i4 % 128;
        int i5 = i4 % 2;
        List<C0351d> list = this.f25976f;
        int i6 = i3 + 117;
        f25971q = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    public final short j() {
        int i2 = 2 % 2;
        int i3 = f25974t;
        int i4 = i3 + 63;
        f25971q = i4 % 128;
        int i5 = i4 % 2;
        short s2 = this.f25978h;
        int i6 = i3 + 7;
        f25971q = i6 % 128;
        if (i6 % 2 == 0) {
            return s2;
        }
        throw null;
    }

    public final byte l() {
        int i2 = 2 % 2;
        int i3 = f25974t;
        int i4 = i3 + 53;
        f25971q = i4 % 128;
        int i5 = i4 % 2;
        byte b2 = this.f25979i;
        int i6 = i3 + 11;
        f25971q = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 94 / 0;
        }
        return b2;
    }

    public final o.ef.a m() throws Throwable {
        List<C0351d> listSubList;
        int i2 = 2 % 2;
        o.ef.a aVar = new o.ef.a();
        Object[] objArr = new Object[1];
        p(View.resolveSizeAndState(0, 0, 0) + 3, "\u0011\n㘻", (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 72), objArr);
        aVar.a(((String) objArr[0]).intern(), (Object) this.f25977g);
        Object[] objArr2 = new Object[1];
        u(127 - TextUtils.indexOf("", "", 0), null, null, "\u0083\u0084", objArr2);
        aVar.c(((String) objArr2[0]).intern(), this.f25975b);
        c cVar = new c();
        if (this.f25976f.size() > 100) {
            int i3 = f25974t + 41;
            f25971q = i3 % 128;
            if (i3 % 2 != 0) {
                List<C0351d> list = this.f25976f;
                listSubList = list.subList(list.size() >>> 35, this.f25976f.size());
            } else {
                List<C0351d> list2 = this.f25976f;
                listSubList = list2.subList(list2.size() - 100, this.f25976f.size());
            }
        } else {
            listSubList = this.f25976f;
        }
        for (C0351d c0351d : listSubList) {
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i4 = c.f23799b * 1567746851;
            c.f23799b = i4;
            int i5 = 1136425123 * c.f23798a;
            c.f23798a = i5;
            cVar.b(((Integer) c.b((int) Runtime.getRuntime().maxMemory(), i5, i4, -1513293186, elapsedCpuTime, 1513293186, new Object[]{cVar})).intValue(), c0351d.b());
            int i6 = f25974t + 23;
            f25971q = i6 % 128;
            int i7 = i6 % 2;
        }
        Object[] objArr3 = new Object[1];
        u(127 - Color.argb(0, 0, 0, 0), null, null, "\u0086\u0085\u0082", objArr3);
        aVar.a(((String) objArr3[0]).intern(), cVar);
        return aVar;
    }

    public final String n() {
        int i2 = 2 % 2;
        int i3 = f25974t + 39;
        int i4 = i3 % 128;
        f25971q = i4;
        int i5 = i3 % 2;
        String str = this.f25977g;
        int i6 = i4 + 47;
        f25974t = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }
}
