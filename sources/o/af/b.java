package o.af;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.Random;
import o.ab.e;
import o.ab.j;
import o.bg.c;
import o.cg.f;
import o.d.d;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends e<InterfaceC0328b> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static char[] f20180f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char f20181g = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f20182j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f20183k = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f20184n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f20185o = 0;

    static final class a extends j<b> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f20186b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f20187c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f20188d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f20189f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static short[] f20190g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static byte[] f20191h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f20192i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f20193j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static int f20194k = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(short r9, short r10, int r11) {
            /*
                byte[] r8 = o.af.b.a.$$a
                int r0 = r10 * 4
                int r7 = 4 - r0
                int r0 = r9 + 103
                int r2 = r11 * 4
                int r1 = 1 - r2
                byte[] r6 = new byte[r1]
                r5 = 0
                int r4 = 0 - r2
                if (r8 != 0) goto L2a
                r1 = r7
                r3 = r5
            L15:
                int r0 = -r0
                int r7 = r7 + r0
                int r1 = r1 + 1
                r2 = r3
            L1a:
                byte r0 = (byte) r7
                r6[r2] = r0
                int r3 = r2 + 1
                if (r2 != r4) goto L27
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                return r0
            L27:
                r0 = r8[r1]
                goto L15
            L2a:
                r2 = r5
                r1 = r7
                r7 = r0
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.af.b.a.$$d(short, short, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20188d = -1385863856;
            f20186b = 888260044;
            f20193j = 0;
            f20194k = 1;
            f20187c = -1544845849;
            f20192i = 1150422519;
            f20189f = 1658286249;
            f20191h = new byte[]{40, MessagePack.Code.FIXEXT2, 54, 57, -8, MessagePack.Code.INT16, 10, -24, 42, MessagePack.Code.MAP32, MessagePack.Code.STR8, MessagePack.Code.ARRAY16, 38, MessagePack.Code.STR8, Ascii.NAK, -12, Ascii.EM, MessagePack.Code.EXT16, -7, MessagePack.Code.FIXEXT4, 40, MessagePack.Code.MAP16, 32, 38, 110, -111, 110, -105, -98, -105, 106, -107, -105, 107, -106, 108, -111, 105, 105, -110, -106, 104, -115, -115};
        }

        a(b bVar) {
            super(bVar, true);
        }

        public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
            int i8 = ~i3;
            int i9 = ~((i8 + i4) - (i8 & i4));
            int i10 = ~i4;
            int i11 = i9 | (~((-1) - (((-1) - i10) & ((-1) - i2))));
            int i12 = ~((-1) - (((-1) - i10) & ((-1) - i3)));
            int i13 = (-1) - (((-1) - i11) & ((-1) - i12));
            int i14 = ~i2;
            int i15 = (-1) - (((-1) - i12) & ((-1) - (~(i14 | i3))));
            int i16 = (-1) - (((-1) - (~(i4 | ((i8 + i14) - (i8 & i14))))) & ((-1) - (~((-1) - (((-1) - (i14 | i10)) & ((-1) - i3))))));
            int i17 = i2 + i3 + i6 + ((-1369571145) * i7) + ((-720088171) * i5);
            int i18 = i17 * i17;
            int i19 = (((-954023988) * i2) - 252706816) + ((-260227018) * i3) + ((-346898485) * i13) + (i15 * 346898485) + (346898485 * i16) + ((-607125504) * i6) + (565182464 * i7) + (1611661312 * i5) + ((-409206784) * i18);
            int i20 = ((i2 * (-1931095572)) - 2087550970) + (i3 * (-1931094842)) + (i13 * (-365)) + (i15 * 365) + (i16 * 365) + (i6 * (-1931095207)) + (i7 * (-789048161)) + (i5 * 356376013) + (i18 * 423362560);
            if (i19 + (i20 * i20 * (-1901854720)) == 1) {
                int i21 = 2 % 2;
                o.ef.a aVar = new o.ef.a();
                int i22 = f20194k + 41;
                f20193j = i22 % 128;
                int i23 = i22 % 2;
                return aVar;
            }
            int i24 = 2 % 2;
            int i25 = f20193j + 31;
            int i26 = i25 % 128;
            f20194k = i26;
            int i27 = i25 % 2;
            int i28 = i26 + 113;
            f20193j = i28 % 128;
            int i29 = i28 % 2;
            return null;
        }

        private static o.cg.b d(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v((short) KeyEvent.normalizeMetaState(0), 411465646 - (Process.myPid() >> 22), (-642088177) + TextUtils.indexOf((CharSequence) "", '0'), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 103, (byte) (Color.blue(0) + 26), objArr);
            o.cg.b bVar = new o.cg.b(context, 53, ((String) objArr[0]).intern());
            int i3 = f20194k + 53;
            f20193j = i3 % 128;
            if (i3 % 2 == 0) {
                return bVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static void init$0() {
            $$a = new byte[]{42, -91, MessagePack.Code.MAP16, 103};
            $$b = 245;
        }

        private static void v(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
            long j2;
            int i5;
            int i6;
            int i7 = 2 % 2;
            o.a.j jVar = new o.a.j();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f20192i)};
                Object objA = d.a(-727631768);
                if (objA == null) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 238;
                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 44531);
                    int i8 = 12 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i9 = $$b;
                    byte b3 = (byte) ((i9 + 3) - (i9 | 3));
                    byte b4 = (byte) (b3 - 1);
                    objA = d.a(absoluteGravity, touchSlop, i8, 35969549, false, $$d(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                boolean z2 = iIntValue == -1;
                if (z2) {
                    byte[] bArr = f20191h;
                    if (bArr != null) {
                        int i10 = $10 + 117;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        for (int i12 = 0; i12 < length; i12++) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                            Object objA2 = d.a(-1239398195);
                            if (objA2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objA2 = d.a(628 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (28649 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), View.getDefaultSize(0, 0) + 11, 1621469864, false, $$d(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr2[i12] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i13 = $11 + 71;
                        $10 = i13 % 128;
                        if (i13 % 2 != 0) {
                            byte[] bArr3 = f20191h;
                            Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f20187c)};
                            Object objA3 = d.a(-727631768);
                            if (objA3 == null) {
                                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 238;
                                char c2 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44531);
                                int packedPositionChild = 10 - ExpandableListView.getPackedPositionChild(0L);
                                byte b7 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 3)));
                                byte b8 = (byte) (b7 - 1);
                                objA3 = d.a(iKeyCodeFromString, c2, packedPositionChild, 35969549, false, $$d(b7, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i6 = ((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) >> ((int) (((long) f20192i) ^ (-7649639543924978291L)));
                        } else {
                            byte[] bArr4 = f20191h;
                            Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(f20187c)};
                            Object objA4 = d.a(-727631768);
                            if (objA4 == null) {
                                int longPressTimeout = 238 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                char c3 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 44530);
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11;
                                byte b9 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 3)));
                                byte b10 = (byte) (b9 - 1);
                                objA4 = d.a(longPressTimeout, c3, scrollBarFadeDuration, 35969549, false, $$d(b9, b10, b10), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i6 = ((byte) (((long) bArr4[((Integer) ((Method) objA4).invoke(null, objArr5)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f20192i) ^ (-7649639543924978291L)));
                        }
                        iIntValue = (byte) i6;
                        j2 = -7649639543924978291L;
                    } else {
                        j2 = -7649639543924978291L;
                        iIntValue = (short) (((short) (((long) f20190g[i2 + ((int) (((long) f20187c) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f20192i) ^ (-7649639543924978291L))));
                    }
                } else {
                    j2 = -7649639543924978291L;
                }
                if (iIntValue > 0) {
                    int i14 = ((i2 + iIntValue) - 2) + ((int) (((long) f20187c) ^ j2));
                    if (z2) {
                        int i15 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    jVar.f19936d = i14 + i5;
                    Object[] objArr6 = {jVar, Integer.valueOf(i3), Integer.valueOf(f20189f), sb};
                    Object objA5 = d.a(1819197256);
                    if (objA5 == null) {
                        objA5 = d.a(ViewConfiguration.getTapTimeout() >> 16, (char) (TextUtils.lastIndexOf("", '0') + 5359), KeyEvent.getDeadChar(0, 0) + 11, -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objA5).invoke(null, objArr6)).append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    byte[] bArr5 = f20191h;
                    if (bArr5 != null) {
                        int length2 = bArr5.length;
                        byte[] bArr6 = new byte[length2];
                        for (int i17 = 0; i17 < length2; i17++) {
                            bArr6[i17] = (byte) (((long) bArr5[i17]) ^ (-7649639543924978291L));
                        }
                        bArr5 = bArr6;
                    }
                    boolean z3 = bArr5 != null;
                    jVar.f19934b = 1;
                    int i18 = $10 + 77;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                    while (jVar.f19934b < iIntValue) {
                        int i20 = $11 + 123;
                        int i21 = i20 % 128;
                        $10 = i21;
                        int i22 = i20 % 2;
                        if (z3) {
                            int i23 = i21 + 61;
                            $11 = i23 % 128;
                            int i24 = i23 % 2;
                            byte[] bArr7 = f20191h;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr7[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                        } else {
                            short[] sArr = f20190g;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                        }
                        sb.append(jVar.f19937e);
                        jVar.f19935c = jVar.f19937e;
                        jVar.f19934b++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        @Override // o.ab.j
        public final /* synthetic */ f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20194k + 113;
            f20193j = i3 % 128;
            int i4 = i3 % 2;
            o.cg.b bVarD = d(context);
            int i5 = f20193j + 37;
            f20194k = i5 % 128;
            int i6 = i5 % 2;
            return bVarD;
        }

        @Override // o.ab.j
        public final void a(o.ef.a aVar) throws o.ef.b {
            int i2 = 2 % 2;
            int i3 = f20193j + 93;
            f20194k = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // o.ab.j
        public final o.bg.a b(int i2) {
            int i3 = 2 % 2;
            int i4 = f20194k;
            int i5 = i4 + 9;
            f20193j = i5 % 128;
            int i6 = i5 % 2;
            if (i2 != 6000) {
                return super.b(i2);
            }
            int i7 = i4 + 125;
            f20193j = i7 % 128;
            int i8 = i7 % 2;
            return o.bg.a.aI;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(c cVar) {
            int i2 = 2 % 2;
            int i3 = f20193j + 19;
            f20194k = i3 % 128;
            if (i3 % 2 != 0) {
                ((b) e()).g().d(cVar);
            } else {
                ((b) e()).g().d(cVar);
                int i4 = 73 / 0;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(c cVar) {
            int i2 = 2 % 2;
            int i3 = f20194k + 13;
            f20193j = i3 % 128;
            if (i3 % 2 == 0) {
                ((b) e()).g().a();
                return;
            }
            ((b) e()).g().a();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            int i3 = f20194k;
            int i4 = i3 + 111;
            f20193j = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 27;
            f20193j = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }

        @Override // o.ab.j
        public final o.ef.a m() throws o.ef.b {
            int iMyPid = Process.myPid();
            int priority = Thread.currentThread().getPriority();
            int id = (int) Thread.currentThread().getId();
            return (o.ef.a) a(357820267, -357820266, iMyPid, new Random().nextInt(), priority, new Object[]{this}, id);
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20194k + 5;
            f20193j = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            v((short) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), MotionEvent.axisFromString("") + 411465623, (-642088128) - Color.green(0), (-98) - Process.getGidForName(""), (byte) ((-86) - (ViewConfiguration.getTouchSlop() >> 8)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i5 = f20193j + 7;
            f20194k = i5 % 128;
            int i6 = i5 % 2;
            return strIntern;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int iMyTid = Process.myTid();
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i2 = f20186b * (-87996027);
            f20186b = i2;
            int i3 = f20188d * (-187434141);
            f20188d = i3;
            return (byte[][]) a(880429899, -880429899, iMyTid, i3, iElapsedRealtime, new Object[]{this}, i2);
        }
    }

    /* JADX INFO: renamed from: o.af.b$b, reason: collision with other inner class name */
    public interface InterfaceC0328b {
        void a();

        void d(c cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(byte r8, byte r9, int r10) {
        /*
            byte[] r7 = o.af.b.$$d
            int r6 = 111 - r8
            int r1 = r10 * 2
            int r0 = 1 - r1
            int r5 = r9 + 4
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
            int r1 = r1 + 1
            r0 = r7[r5]
            goto L13
        L26:
            r1 = r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.af.b.$$j(byte, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20183k = 0;
        f20185o = 1;
        f20182j = 0;
        f20184n = 1;
        o();
        Color.green(0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        ViewConfiguration.getTouchSlop();
        ViewConfiguration.getKeyRepeatTimeout();
        int i2 = f20185o + 79;
        f20183k = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public b(Context context, InterfaceC0328b interfaceC0328b, o.en.b bVar) {
        super(context, interfaceC0328b, bVar, o.bg.e.B);
    }

    static void init$0() {
        $$d = new byte[]{103, 35, 47, 90};
        $$e = 70;
    }

    private a k() {
        int i2 = 2 % 2;
        a aVar = new a(this);
        int i3 = f20182j + 23;
        f20184n = i3 % 128;
        int i4 = i3 % 2;
        return aVar;
    }

    static void o() {
        f20180f = new char[]{64535, 64577, 64528, 64580, 64534, 64597, 64593, 64586, 64598, 64530, 64533, 64576, 64592, 64599, 64614, 64629, 64529, 64584, 64532, 64587, 64612, 64609, 64531, 64585, 64527};
        f20181g = (char) 51642;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void q(int r25, java.lang.String r26, byte r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.af.b.q(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    @Override // o.ab.e
    public final /* synthetic */ o.ab.c c() {
        int i2 = 2 % 2;
        int i3 = f20184n + 67;
        f20182j = i3 % 128;
        int i4 = i3 % 2;
        a aVarK = k();
        if (i4 != 0) {
            int i5 = 71 / 0;
        }
        return aVarK;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f20184n + 91;
        f20182j = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            q(76 / Drawable.resolveOpacity(0, 0), "\n\u0004\u0010\u0014\r\u0015\u0010\u000b\f\n\r\u0007\u0007\b\u0010\f\n\u0017\u0010\u0004\r\u0004\u000b\u0003\t\r\f\u0016\u0012\u0002\u0010\u0004", (byte) ((ViewConfiguration.getWindowTouchSlop() % 55) + 85), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            q(32 - Drawable.resolveOpacity(0, 0), "\n\u0004\u0010\u0014\r\u0015\u0010\u000b\f\n\r\u0007\u0007\b\u0010\f\n\u0017\u0010\u0004\r\u0004\u000b\u0003\t\r\f\u0016\u0012\u0002\u0010\u0004", (byte) (34 - (ViewConfiguration.getWindowTouchSlop() >> 8)), objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i4 = f20184n + 81;
        f20182j = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    public final void n() {
        int i2 = 2 % 2;
        int i3 = f20184n + 15;
        f20182j = i3 % 128;
        int i4 = i3 % 2;
        if (o.ea.f.a()) {
            int i5 = f20184n + 35;
            f20182j = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            q(32 - (ViewConfiguration.getTapTimeout() >> 16), "\n\u0004\u0010\u0014\r\u0015\u0010\u000b\f\n\r\u0007\u0007\b\u0010\f\n\u0017\u0010\u0004\r\u0004\u000b\u0003\t\r\f\u0016\u0012\u0002\u0010\u0004", (byte) (34 - View.getDefaultSize(0, 0)), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            q(23 - ImageFormat.getBitsPerPixel(0), "\u0002\u0006\u0001\u0010\u0015\r\u000b\u0010\n\r\t\u0007\f\u0016\f\u000e\u0018\u000f\u0004\u000b\b\u0012\u0003\u0006", (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15), objArr2);
            o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
        }
        a();
        int i7 = f20182j + 39;
        f20184n = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 80 / 0;
        }
    }
}
