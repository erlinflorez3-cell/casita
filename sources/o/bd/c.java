package o.bd;

import android.content.Context;
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
import com.google.common.base.Ascii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import kotlin.io.encoding.Base64;
import o.a.l;
import o.a.n;
import o.ab.j;
import o.cg.f;
import o.cg.i;
import o.ef.a;
import o.ef.b;
import o.fm.g;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends o.ab.e<e> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: k */
    private static int[] f20907k = null;

    /* JADX INFO: renamed from: l */
    private static int f20908l = 0;

    /* JADX INFO: renamed from: m */
    private static int f20909m = 0;

    /* JADX INFO: renamed from: n */
    private static int f20910n = 0;

    /* JADX INFO: renamed from: o */
    private static int f20911o = 0;

    /* JADX INFO: renamed from: f */
    boolean f20912f;

    /* JADX INFO: renamed from: g */
    String f20913g;

    /* JADX INFO: renamed from: j */
    public o.be.c f20914j;

    /* JADX INFO: renamed from: o.bd.c$c */
    public static final class C0339c extends j<c> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        public static int f20915b = 0;

        /* JADX INFO: renamed from: c */
        public static int f20916c = 0;

        /* JADX INFO: renamed from: d */
        public static int f20917d = 0;

        /* JADX INFO: renamed from: f */
        public static int f20918f = 0;

        /* JADX INFO: renamed from: g */
        public static int f20919g = 0;

        /* JADX INFO: renamed from: h */
        private static int f20920h = 0;

        /* JADX INFO: renamed from: i */
        private static int f20921i = 0;

        /* JADX INFO: renamed from: j */
        public static int f20922j = 0;

        /* JADX INFO: renamed from: k */
        private static short[] f20923k = null;

        /* JADX INFO: renamed from: l */
        private static int f20924l = 0;

        /* JADX INFO: renamed from: m */
        private static int f20925m = 0;

        /* JADX INFO: renamed from: n */
        private static int f20926n = 0;

        /* JADX INFO: renamed from: o */
        private static byte[] f20927o = null;

        /* JADX INFO: renamed from: p */
        private static int f20928p = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0022 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$k(short r9, byte r10, short r11) {
            /*
                int r0 = r10 * 3
                int r8 = 4 - r0
                byte[] r7 = o.bd.c.C0339c.$$d
                int r0 = 115 - r11
                int r6 = r9 * 2
                int r1 = r6 + 1
                byte[] r5 = new byte[r1]
                r4 = 0
                if (r7 != 0) goto L29
                r3 = r6
                r2 = r4
            L13:
                int r0 = -r0
                int r0 = r0 + r3
                int r8 = r8 + 1
            L17:
                byte r1 = (byte) r0
                r5[r2] = r1
                if (r2 != r6) goto L22
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L22:
                int r2 = r2 + 1
                r1 = r7[r8]
                r3 = r0
                r0 = r1
                goto L13
            L29:
                r2 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bd.c.C0339c.$$k(short, byte, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            f20919g = 1546386818;
            f20918f = -1457734682;
            f20922j = -1951283053;
            f20917d = -91697594;
            f20916c = -1955050791;
            f20915b = 688516035;
            f20925m = 0;
            f20928p = 1;
            f20921i = 147557186;
            f20920h = 1150422420;
            f20926n = 162746751;
            f20927o = new byte[]{113, 40, MessagePack.Code.FALSE, MessagePack.Code.ARRAY32, 48, MessagePack.Code.MAP32, 41, MessagePack.Code.INT8, MessagePack.Code.STR32, MessagePack.Code.STR16, 34, 59, MessagePack.Code.NEVER_USED, 45, MessagePack.Code.STR32, 40, 37, MessagePack.Code.STR32, 43, -11, -10, 122, -99, 107, -110, -103, -104, 96, 121, -125, 111, -103, 106, 103, -103, 105, -105, 120, -84, 98, -79, -66, 75, 74, -98, 102, -70, 71, -75, -73, -67, 120, 101, -85, 113, -121, 126, 117, 116, -101, 115, -114, 124, 126, 116, 123, -113, 117, 117, -127, -117, 84, -85, 122, -113, 115, -125, 118, 121, -124, 122, 53, MessagePack.Code.NEVER_USED, Ascii.CAN, -31, MessagePack.Code.FLOAT64, 50, MessagePack.Code.NEVER_USED, 39, MessagePack.Code.NIL, MessagePack.Code.UINT64, Base64.padSymbol, 55, MessagePack.Code.UINT8, MessagePack.Code.FLOAT64, 56, -119, 83, 67, -95, -88, -82, 82, -65, -98, Ascii.ETB, -83, 89, -128, -113, Ascii.RS, 83, -86, 89, -65, 88, 87, -91, -81, 84, 83, -128, -113, Ascii.GS, -115, 98, Ascii.SI, MessagePack.Code.NEVER_USED, Ascii.ESC, -19, Ascii.DC4, Ascii.US, -2, 120, 68, 74, -68, 66, 70, -72, 67, -65, -68, 102, -95, 67, -70, 120, 85, 91, -83, 83, 87, -87, 82, -82, -83, 119, -76, -82, MessagePack.Code.FIXSTR_PREFIX, 112, -122, -120, 126, -128, -124, 122, -127, 125, 126, -92, 98, 113, -110, -99, 84, -120, 110, -120, -127, 125, -122, -98, Ascii.DC2, 3, -27, -18, -19, -26, -84, 65, -4, 3, -4, Ascii.CAN, 16, -17, -67, 92, MessagePack.Code.UINT8, MessagePack.Code.TRUE, Ascii.RS, MessagePack.Code.NEGFIXINT_PREFIX, 86, Ascii.US, -24, Ascii.DC2, Ascii.DC2, 16, -29, -2, 51, -4, 19, Ascii.SYN, -27, -2, Ascii.FF, Ascii.DC2, 17, MessagePack.Code.BIN8, 8, Ascii.US, -20, -4, Ascii.FS};
            f20924l = -1270219398;
        }

        C0339c(c cVar) {
            super(cVar, false);
        }

        private static void A(int i2, short s2, byte b2, Object[] objArr) {
            int i3 = 111 - (s2 * 3);
            int i4 = (b2 * 5) + 4;
            int i5 = i2 * 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i5 + 6];
            int i6 = i5 + 5;
            int i7 = -1;
            if (bArr == null) {
                i4++;
                i3 = (i3 + (-i4)) - 5;
            }
            while (true) {
                i7++;
                bArr2[i7] = (byte) i3;
                if (i7 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    byte b3 = bArr[i4];
                    i4++;
                    i3 = (i3 + (-b3)) - 5;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object a(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) throws Throwable {
            int i8 = ~i4;
            int i9 = ~i6;
            int i10 = ~((-1) - (((-1) - ((i9 + i8) - (i9 & i8))) & ((-1) - i7)));
            int i11 = (~i7) | i8;
            int i12 = (-1) - (((-1) - i4) & ((-1) - i6));
            int i13 = ((-1) - (((-1) - i10) & ((-1) - (~((-1) - (((-1) - i11) & ((-1) - i6))))))) | (~((i12 + i7) - (i12 & i7)));
            int i14 = ~i11;
            int i15 = (~(i7 | i4)) | ((-1) - (((-1) - i6) & ((-1) - i14)));
            int i16 = (-1) - (((-1) - (~((-1) - (((-1) - i8) & ((-1) - i6))))) & ((-1) - i14));
            int i17 = i4 + i6 + i5 + (933655473 * i2) + ((-1037598838) * i3);
            int i18 = i17 * i17;
            int i19 = ((i4 * (-727610197)) - 1081761860) + (i6 * (-727608285)) + (i13 * 956) + (i15 * (-956)) + (i16 * 956) + ((-727609241) * i5) + (1532828727 * i2) + ((-747900794) * i3) + (i18 * 556466176);
            if ((((-1556109539) * i4) - 925892608) + (470833381 * i6) + (i13 * (-1134012188)) + (1134012188 * i15) + ((-1134012188) * i16) + (1604845568 * i5) + ((-1691877376) * i2) + ((-393216000) * i3) + ((-1633878016) * i18) + (i19 * i19 * (-1911357440)) != 1) {
                int i20 = 2 % 2;
                int i21 = f20925m + 113;
                f20928p = i21 % 128;
                int i22 = i21 % 2;
                return false;
            }
            C0339c c0339c = (C0339c) objArr[0];
            int i23 = 2 % 2;
            a aVar = new a();
            o.be.c cVar = ((c) c0339c.e()).f20914j;
            byte b2 = (byte) 0;
            byte b3 = b2;
            A(b2, b3, b3, new Object[1]);
            if (!(!Class.forName((String) r1[0]).isInstance(cVar))) {
                Object[] objArr2 = {((o.be.e) ((c) c0339c.e()).f20914j).e(), 10};
                Method declaredMethod = Class.forName(C1561oA.Yd("O]Tca\\X#kkae(=]pc54", (short) (C1580rY.Xd() ^ (-8851)))).getDeclaredMethod(Xg.qd("jtjwmo_{`\u0003\u0002y\u007fy", (short) (FB.Xd() ^ 13730), (short) (FB.Xd() ^ 27530)), byte[].class, Integer.TYPE);
                try {
                    declaredMethod.setAccessible(true);
                    String str = (String) declaredMethod.invoke(null, objArr2);
                    if (!(!r8.d())) {
                        Object[] objArr3 = new Object[1];
                        z(Gravity.getAbsoluteGravity(0, 0) + 17, Jg.Wd("?@y\u0005|\u0015㦂\ue5c9裦(,6ྏ\u000eQ\u000b?", (short) (C1499aX.Xd() ^ (-4929)), (short) (C1499aX.Xd() ^ (-1210))), true, Color.green(0) + 192, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6, objArr3);
                        aVar.a(((String) objArr3[0]).intern(), (Object) str);
                    } else {
                        Object[] objArr4 = new Object[1];
                        z(14 - (ViewConfiguration.getScrollBarSize() >> 8), ZO.xd("肒\uf46a켍\u0005D\u000e꣫_+y\u0012䛚\f튙", (short) (C1580rY.Xd() ^ (-27787)), (short) (C1580rY.Xd() ^ (-592))), false, (ViewConfiguration.getTapTimeout() >> 16) + 200, 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr4);
                        aVar.a(((String) objArr4[0]).intern(), (Object) str);
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } else if (((c) c0339c.e()).f20914j instanceof o.be.d) {
                o.be.d dVar = (o.be.d) ((c) c0339c.e()).f20914j;
                int i24 = o.be.d.f20954a * 1876285600;
                o.be.d.f20954a = i24;
                int i25 = o.be.d.f20956c * 1612249588;
                o.be.d.f20956c = i25;
                int i26 = o.be.d.f20959h * 529832505;
                o.be.d.f20959h = i26;
                int i27 = o.be.d.f20960i * (-1068154465);
                o.be.d.f20960i = i27;
                byte[] bArr = (byte[]) o.be.d.a(new Object[]{dVar}, i24, 234842887, i27, i26, i25, -234842886);
                Class<?> cls = Class.forName(C1626yg.Ud("H\u0013S\u000fo\u000e3m[2\u001fR6MI\u0007hfj", (short) (C1499aX.Xd() ^ (-18208)), (short) (C1499aX.Xd() ^ (-19201))));
                Class<?>[] clsArr = {byte[].class, Integer.TYPE};
                Object[] objArr5 = {bArr, 10};
                short sXd = (short) (C1499aX.Xd() ^ (-30451));
                int[] iArr = new int["jN\u0011t!E`+0AA\u001aP?".length()];
                QB qb = new QB("jN\u0011t!E`+0AA\u001aP?");
                int i28 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i28] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i28 % C1561oA.Xd.length] ^ (sXd + i28)));
                    i28++;
                }
                Method declaredMethod2 = cls.getDeclaredMethod(new String(iArr, 0, i28), clsArr);
                try {
                    declaredMethod2.setAccessible(true);
                    String str2 = (String) declaredMethod2.invoke(null, objArr5);
                    int i29 = o.be.d.f20955b * (-1321914167);
                    o.be.d.f20955b = i29;
                    int i30 = o.be.d.f20957d * (-71125391);
                    o.be.d.f20957d = i30;
                    int i31 = o.be.d.f20958e * 68842276;
                    o.be.d.f20958e = i31;
                    String str3 = new String((byte[]) o.be.d.a(new Object[]{dVar}, i29, -1734156919, Process.myTid(), i31, i30, 1734156919));
                    Object[] objArr6 = new Object[1];
                    z(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15, EO.Od("雮\uf476\uf4c7'%o졝Ae]X췲d컍", (short) (C1633zX.Xd() ^ (-20669))), false, Color.alpha(0) + 200, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr6);
                    aVar.a(((String) objArr6[0]).intern(), (Object) str2);
                    Object[] objArr7 = new Object[1];
                    z((ViewConfiguration.getFadingEdgeLength() >> 16) + 18, C1561oA.Qd("ih]뫗못__Xb뫎bT^뫌목Y뫋Z", (short) (C1633zX.Xd() ^ (-3459))), true, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 200, TextUtils.lastIndexOf("", '0') + 4, objArr7);
                    aVar.a(((String) objArr7[0]).intern(), (Object) str3);
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } else {
                o.be.c cVar2 = ((c) c0339c.e()).f20914j;
                Object[] objArr8 = new Object[1];
                A(b2, b3, (byte) (b3 + 1), objArr8);
                if (Class.forName((String) objArr8[0]).isInstance(cVar2)) {
                    int i32 = f20928p + 81;
                    f20925m = i32 % 128;
                    int i33 = i32 % 2;
                    o.be.a aVar2 = (o.be.a) ((c) c0339c.e()).f20914j;
                    Object[] objArr9 = new Object[1];
                    v((short) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (-1280935594) + Color.green(0), ((Process.getThreadPriority(0) + 20) >> 6) - 1294032009, TextUtils.lastIndexOf("", '0', 0) - 25, (byte) (59 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr9);
                    aVar.a(((String) objArr9[0]).intern(), (Object) aVar2.c());
                    Object[] objArr10 = new Object[1];
                    v((short) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1280935580, (-1294032010) - ((byte) KeyEvent.getModifierMetaStateMask()), (-27) - TextUtils.lastIndexOf("", '0', 0), (byte) ((-14) - TextUtils.indexOf((CharSequence) "", '0')), objArr10);
                    aVar.a(((String) objArr10[0]).intern(), (Object) aVar2.a());
                    Object[] objArr11 = new Object[1];
                    v((short) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (-1280935566) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (-1294031999) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (-25) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (Color.green(0) - 5), objArr11);
                    aVar.a(((String) objArr11[0]).intern(), (Object) aVar2.d());
                    int i34 = f20925m + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    f20928p = i34 % 128;
                    int i35 = i34 % 2;
                }
            }
            int mirror = '6' - AndroidCharacter.getMirror('0');
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 174;
            int iIndexOf = TextUtils.indexOf("", "", 0) + 6;
            Object[] objArr12 = new Object[1];
            short sXd2 = (short) (Od.Xd() ^ (-18383));
            short sXd3 = (short) (Od.Xd() ^ (-30572));
            int[] iArr2 = new int["؛?儣A儠>".length()];
            QB qb2 = new QB("؛?儣A儠>");
            int i36 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i36] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i36)) - sXd3);
                i36++;
            }
            z(mirror, new String(iArr2, 0, i36), false, tapTimeout, iIndexOf, objArr12);
            String strIntern = ((String) objArr12[0]).intern();
            Object[] objArr13 = {((c) c0339c.e()).f20914j};
            o.be.c.f20950j = o.be.c.f20950j * 1447608726;
            int iActiveCount = Thread.activeCount();
            o.be.c.f20948f = o.be.c.f20948f * (-256061114);
            o.be.c.f20949g = o.be.c.f20949g * 1407037253;
            aVar.a(strIntern, o.be.c.a(r5, 1945454185, r7, -1945454185, r9, objArr13, iActiveCount));
            return aVar;
        }

        private static boolean e(a aVar, String str) throws b {
            int i2 = 2 % 2;
            if (aVar.d(str)) {
                Object[] objArr = {aVar, str};
                int i3 = a.f23778l * 493926616;
                a.f23778l = i3;
                int i4 = a.f23779m * 1131312688;
                a.f23779m = i4;
                if (((Integer) a.a(1122077797, objArr, (int) SystemClock.elapsedRealtime(), new Random().nextInt(1747993327), -1122077791, i3, i4)).intValue() == 0) {
                    int i5 = f20928p + 95;
                    f20925m = i5 % 128;
                    int i6 = i5 % 2;
                    return true;
                }
            }
            int i7 = f20928p + 33;
            f20925m = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        static void init$0() {
            $$a = new byte[]{60, 66, -100, 104, 60, MessagePack.Code.EXT8, -8, 50, MessagePack.Code.BIN8, 60, MessagePack.Code.EXT8, -8, 50, MessagePack.Code.EXT16};
            $$b = 23;
        }

        static void init$1() {
            $$d = new byte[]{64, -84, MessagePack.Code.MAP32, -5};
            $$e = 219;
        }

        private static void v(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
            long j2;
            int length;
            byte[] bArr;
            boolean z2;
            int i5 = 2;
            int i6 = 2 % 2;
            o.a.j jVar = new o.a.j();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f20920h)};
                Object objA = o.d.d.a(-727631768);
                long j3 = 0;
                if (objA == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objA = o.d.d.a(238 - ExpandableListView.getPackedPositionGroup(0L), (char) (44530 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 11, 35969549, false, $$k(b3, b4, (byte) ((-1) - (((-1) - b4) & ((-1) - 11)))), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                int i7 = iIntValue == -1 ? 1 : 0;
                if (i7 != 0) {
                    byte[] bArr2 = f20927o;
                    if (bArr2 != null) {
                        int i8 = $11 + 41;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            length = bArr2.length;
                            bArr = new byte[length];
                        } else {
                            length = bArr2.length;
                            bArr = new byte[length];
                        }
                        int i9 = 0;
                        while (i9 < length) {
                            int i10 = $10 + 13;
                            $11 = i10 % 128;
                            if (i10 % i5 == 0) {
                                Object[] objArr3 = {Integer.valueOf(bArr2[i9])};
                                Object objA2 = o.d.d.a(-1239398195);
                                if (objA2 == null) {
                                    byte b5 = (byte) 0;
                                    byte b6 = b5;
                                    objA2 = o.d.d.a(627 - TextUtils.lastIndexOf("", '0', 0), (char) ((Process.getElapsedCpuTime() > j3 ? 1 : (Process.getElapsedCpuTime() == j3 ? 0 : -1)) + 28648), 10 - TextUtils.indexOf((CharSequence) "", '0', 0), 1621469864, false, $$k(b5, b6, (byte) ((-1) - (((-1) - b6) & ((-1) - 12)))), new Class[]{Integer.TYPE});
                                }
                                bArr[i9] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                            } else {
                                Object[] objArr4 = {Integer.valueOf(bArr2[i9])};
                                Object objA3 = o.d.d.a(-1239398195);
                                if (objA3 == null) {
                                    byte b7 = (byte) 0;
                                    byte b8 = b7;
                                    objA3 = o.d.d.a(628 - TextUtils.getCapsMode("", 0, 0), (char) (28649 - KeyEvent.getDeadChar(0, 0)), (Process.myPid() >> 22) + 11, 1621469864, false, $$k(b7, b8, (byte) (12 | b8)), new Class[]{Integer.TYPE});
                                }
                                bArr[i9] = ((Byte) ((Method) objA3).invoke(null, objArr4)).byteValue();
                                i9++;
                            }
                            i5 = 2;
                            j3 = 0;
                        }
                        bArr2 = bArr;
                    }
                    if (bArr2 != null) {
                        byte[] bArr3 = f20927o;
                        Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(f20921i)};
                        Object objA4 = o.d.d.a(-727631768);
                        if (objA4 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objA4 = o.d.d.a(238 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (Color.argb(0, 0, 0, 0) + 44531), (KeyEvent.getMaxKeyCode() >> 16) + 11, 35969549, false, $$k(b9, b10, (byte) ((b10 + Ascii.VT) - (11 & b10))), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA4).invoke(null, objArr5)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f20920h) ^ (-7649639543924978291L))));
                        j2 = -7649639543924978291L;
                    } else {
                        j2 = -7649639543924978291L;
                        iIntValue = (short) (((short) (((long) f20923k[i2 + ((int) (((long) f20921i) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f20920h) ^ (-7649639543924978291L))));
                    }
                } else {
                    j2 = -7649639543924978291L;
                }
                if (iIntValue > 0) {
                    jVar.f19936d = ((i2 + iIntValue) - 2) + ((int) (((long) f20921i) ^ j2)) + i7;
                    Object[] objArr6 = {jVar, Integer.valueOf(i3), Integer.valueOf(f20926n), sb};
                    Object objA5 = o.d.d.a(1819197256);
                    if (objA5 == null) {
                        objA5 = o.d.d.a(ExpandableListView.getPackedPositionType(0L), (char) (KeyEvent.getDeadChar(0, 0) + 5358), KeyEvent.normalizeMetaState(0) + 11, -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objA5).invoke(null, objArr6)).append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    byte[] bArr4 = f20927o;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i11 = 0; i11 < length2; i11++) {
                            bArr5[i11] = (byte) (((long) bArr4[i11]) ^ (-7649639543924978291L));
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i12 = $11 + 51;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    jVar.f19934b = 1;
                    while (jVar.f19934b < iIntValue) {
                        if (!(!z2)) {
                            byte[] bArr6 = f20927o;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                        } else {
                            short[] sArr = f20923k;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                        }
                        sb.append(jVar.f19937e);
                        jVar.f19935c = jVar.f19937e;
                        jVar.f19934b++;
                        int i14 = $11 + 81;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
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

        private static void z(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i5 = 2 % 2;
            int i6 = $11 + 77;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 36 / 0;
                charArray = str2 != null ? str2.toCharArray() : str2;
            } else {
                if (str2 != null) {
                }
            }
            char[] cArr = (char[]) charArray;
            n nVar = new n();
            char[] cArr2 = new char[i2];
            nVar.f19944a = 0;
            while (nVar.f19944a < i2) {
                nVar.f19946e = cArr[nVar.f19944a];
                cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
                int i8 = nVar.f19944a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(f20924l)};
                    Object objA = o.d.d.a(1376241034);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(270 - View.resolveSize(0, 0), (char) ExpandableListView.getPackedPositionGroup(0L), KeyEvent.getDeadChar(0, 0) + 11, -2071844881, false, $$k(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {nVar, nVar};
                    Object objA2 = o.d.d.a(-202660535);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 523, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12, 627984172, false, $$k(b4, b5, (byte) (b5 + 2)), new Class[]{Object.class, Object.class});
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
                int i9 = $11 + 107;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                nVar.f19945b = i4;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
                System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
            }
            if (z2) {
                int i11 = $10 + 83;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                char[] cArr4 = new char[i2];
                nVar.f19944a = 0;
                while (nVar.f19944a < i2) {
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(523 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (Process.myTid() >> 22) + 12, 627984172, false, $$k(b6, b7, (byte) (b7 + 2)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        @Override // o.ab.j
        public final f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            z(TextUtils.getCapsMode("", 0, 0) + 19, "\u0002\ufffe�\u0001\uffff\uffff\u0004\ufffe\u0004\u0006\uffff\u0005�\u0000\uffff\u0005�\ufffe\u0003", true, 149 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 5, objArr);
            o.cg.b bVar = new o.cg.b(context, 0, ((String) objArr[0]).intern());
            int i3 = f20925m + 95;
            f20928p = i3 % 128;
            if (i3 % 2 != 0) {
                return bVar;
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j
        public final void a(a aVar) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v((short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-1280935551) - KeyEvent.keyCodeFromString(""), (Process.myTid() >> 22) - 1294032015, (-25) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) ((-71) - View.resolveSizeAndState(0, 0, 0)), objArr);
            if (aVar.d(((String) objArr[0]).intern())) {
                if (o.ea.f.a()) {
                    String strD = d();
                    Object[] objArr2 = new Object[1];
                    z(ExpandableListView.getPackedPositionType(0L) + 53, "\uffbf\r\u000e\u0003\u0004\uffbf\u0005\u000e\u0014\r\u0003\u000f\u0000\u0011\u0012\u0004￩\u0012\u000e\r￮\u0001\t\u0004\u0002\u0013\ufff1\u0004\u0012\u000f\u000e\r\u0012\u0004\uffbfￌ\uffbf￢\u000e\r\u0005\b\u0011\f\u0000\u0013\b\u000e\r￢\u000e\u0003\u0004", false, 194 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 10 - TextUtils.lastIndexOf("", '0', 0), objArr2);
                    o.ea.f.c(strD, ((String) objArr2[0]).intern());
                    int i3 = f20925m + 19;
                    f20928p = i3 % 128;
                    int i4 = i3 % 2;
                }
                c cVar = (c) e();
                Object[] objArr3 = new Object[1];
                v((short) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getPressedStateDuration() >> 16) - 1280935551, View.getDefaultSize(0, 0) - 1294032015, AndroidCharacter.getMirror('0') - 'J', (byte) (TextUtils.indexOf((CharSequence) "", '0') - 70), objArr3);
                Object[] objArr4 = {aVar, ((String) objArr3[0]).intern()};
                int i5 = a.f23782p * (-1576737484);
                a.f23782p = i5;
                cVar.f20913g = (String) a.a(-781664457, objArr4, Thread.activeCount(), (int) SystemClock.elapsedRealtime(), 781664467, i5, Thread.currentThread().getPriority());
            } else {
                if (o.ea.f.a()) {
                    String strD2 = d();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr5 = new Object[1];
                    z((ViewConfiguration.getLongPressTimeout() >> 16) + 60, "ￄ\ufff8\ufff3\ufff2ￄ\t\b\u0013\u0012ￄ\t\b\u0013\uffe7\u0012\u0013\r\u0018\u0005\u0011\u0016\r\n\u0012\u0013\uffe7ￄ\uffd1ￄ\t\u0017\u0012\u0013\u0014\u0017\t\ufff6\u0018\u0007\t\u000e\u0006\ufff3\u0012\u0013\u0017￮\t\u0017\u0016\u0005\u0014ￄ\uffd1ￄ\b\u0012\u0019\u0013\n", true, 189 - Color.red(0), 52 - Color.alpha(0), objArr5);
                    o.ea.f.c(strD2, sb.append(((String) objArr5[0]).intern()).append(aVar.e()).toString());
                    int i6 = f20925m + 63;
                    f20928p = i6 % 128;
                    int i7 = i6 % 2;
                }
                o.bg.c cVarF = f();
                o.bg.a aVar2 = o.bg.a.W;
                Object[] objArr6 = new Object[1];
                v((short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0', 0) - 1280935534, ((Process.getThreadPriority(0) + 20) >> 6) - 1294032036, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 27, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 34), objArr6);
                cVarF.c(aVar2, ((String) objArr6[0]).intern());
                int i8 = f20925m + 63;
                f20928p = i8 % 128;
                int i9 = i8 % 2;
            }
            Object[] objArr7 = new Object[1];
            v((short) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 1280935506, MotionEvent.axisFromString("") - 1294031994, Color.green(0) - 26, (byte) ((-104) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr7);
            Long lK = aVar.k(((String) objArr7[0]).intern());
            if (lK != null) {
                Object[] objArr8 = {j()};
                int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int priority = Thread.currentThread().getPriority();
                int i10 = o.en.b.f24088c * (-1721916949);
                o.en.b.f24088c = i10;
                ((g) o.en.b.a(-568976488, elapsedCpuTime, objArr8, iUptimeMillis, 568976490, priority, i10)).b(String.valueOf(lK));
                Object[] objArr9 = {j()};
                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                int iUptimeMillis2 = (int) SystemClock.uptimeMillis();
                int priority2 = Thread.currentThread().getPriority();
                int i11 = o.en.b.f24088c * (-1721916949);
                o.en.b.f24088c = i11;
                ((g) o.en.b.a(-568976488, elapsedCpuTime2, objArr9, iUptimeMillis2, 568976490, priority2, i11)).b(h());
            }
            Object[] objArr10 = {f()};
            int i12 = o.bg.c.f21082a * 1232037242;
            o.bg.c.f21082a = i12;
            int iMyUid = Process.myUid();
            int i13 = o.bg.c.f21083c * 1942342535;
            o.bg.c.f21083c = i13;
            if (!((Boolean) o.bg.c.a(i12, i13, iMyUid, -1017985026, objArr10, 1017985027, new Random().nextInt())).booleanValue()) {
                int i14 = f20925m + 15;
                f20928p = i14 % 128;
                if (i14 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object[] objArr11 = new Object[1];
            v((short) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (-1280935498) - View.getDefaultSize(0, 0), (-1294032010) - (Process.myPid() >> 22), TextUtils.getOffsetBefore("", 0) - 26, (byte) ((-52) - TextUtils.indexOf("", "")), objArr11);
            boolean zE = e(aVar, ((String) objArr11[0]).intern());
            Object[] objArr12 = new Object[1];
            v((short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (-1280935484) - KeyEvent.getDeadChar(0, 0), Color.alpha(0) - 1294031999, (-27) - MotionEvent.axisFromString(""), (byte) (KeyEvent.normalizeMetaState(0) - 35), objArr12);
            boolean zE2 = e(aVar, ((String) objArr12[0]).intern());
            Object[] objArr13 = new Object[1];
            v((short) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (-1280935470) - Drawable.resolveOpacity(0, 0), (-1294032015) - Process.getGidForName(""), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 27, (byte) (14 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr13);
            boolean zE3 = e(aVar, ((String) objArr13[0]).intern());
            if (zE) {
                return;
            }
            int i15 = f20925m + 11;
            f20928p = i15 % 128;
            int i16 = i15 % 2;
            if (zE2 || zE3) {
                return;
            }
            if (o.ea.f.a()) {
                int i17 = f20928p + 125;
                f20925m = i17 % 128;
                int i18 = i17 % 2;
                String strD3 = d();
                Object[] objArr14 = new Object[1];
                v((short) TextUtils.getOffsetBefore("", 0), View.MeasureSpec.getSize(0) - 1280935448, (-1294032002) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) - 26, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 97), objArr14);
                o.ea.f.d(strD3, ((String) objArr14[0]).intern());
            }
            f().d(o.bg.a.V);
        }

        @Override // o.ab.j
        public final o.bg.a b(i iVar) {
            int i2 = 2 % 2;
            int i3 = f20925m + 91;
            f20928p = i3 % 128;
            int i4 = i3 % 2;
            if (iVar.c().e() != o.cg.c.f22268u) {
                return super.b(iVar);
            }
            o.bg.a aVar = o.bg.a.Z;
            int i5 = f20925m + 17;
            f20928p = i5 % 128;
            int i6 = i5 % 2;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20928p + 19;
            f20925m = i3 % 128;
            int i4 = i3 % 2;
            ((c) e()).g().d(cVar);
            int i5 = f20925m + 31;
            f20928p = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        @Override // o.ab.c
        public final void c() {
            int i2 = 2 % 2;
            int i3 = f20928p + 17;
            f20925m = i3 % 128;
            int i4 = i3 % 2;
            o.bu.e.a().d(h(), false, true);
            super.c();
            int i5 = f20925m + 59;
            f20928p = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(o.bg.c cVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20928p + 41;
            f20925m = i3 % 128;
            int i4 = i3 % 2;
            ((c) e()).g().a();
            ((c) e()).f20912f = true;
            c.c((c) e());
            int i5 = f20928p + 81;
            f20925m = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j, o.ab.c
        public final String d() throws Throwable {
            int i2 = 2 % 2;
            StringBuilder sbAppend = new StringBuilder().append(((c) e()).e());
            Object[] objArr = new Object[1];
            v((short) TextUtils.indexOf("", ""), (-1280935631) + (ViewConfiguration.getDoubleTapTimeout() >> 16), (-1294032079) - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) - 26, (byte) (View.MeasureSpec.getSize(0) + 93), objArr);
            String string = sbAppend.append(((String) objArr[0]).intern()).toString();
            int i3 = f20925m + 45;
            f20928p = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 56 / 0;
            }
            return string;
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            int i3 = f20925m + 29;
            int i4 = i3 % 128;
            f20928p = i4;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i5 = i4 + 73;
            f20925m = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final boolean l() {
            int i2 = f20915b * 1250931328;
            f20915b = i2;
            int i3 = f20916c * 457995573;
            f20916c = i3;
            int i4 = f20917d * 2132625372;
            f20917d = i4;
            int i5 = f20922j * 577204731;
            f20922j = i5;
            return ((Boolean) a(i4, i5, new Object[]{this}, -476049643, i3, 476049643, i2)).booleanValue();
        }

        @Override // o.ab.j
        public final a m() throws b {
            int i2 = (int) Runtime.getRuntime().totalMemory();
            int iMyTid = Process.myTid();
            int i3 = f20918f * (-1912064772);
            f20918f = i3;
            int i4 = f20919g * 33153691;
            f20919g = i4;
            return (a) a(i3, i4, new Object[]{this}, 214162607, iMyTid, -214162606, i2);
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20928p + 55;
            f20925m = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            v((short) ((Process.getThreadPriority(0) + 20) >> 6), (-1280935610) + TextUtils.indexOf("", ""), (-1294032010) - ImageFormat.getBitsPerPixel(0), TextUtils.lastIndexOf("", '0', 0) - 25, (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 30), objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i5 = f20928p + 91;
            f20925m = i5 % 128;
            int i6 = i5 % 2;
            return strIntern;
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f20925m;
            int i4 = i3 + 21;
            f20928p = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 103;
            f20928p = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }

        @Override // o.ab.j
        public final boolean r() {
            int i2 = 2 % 2;
            int i3 = f20928p;
            int i4 = i3 + 107;
            f20925m = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 35;
            f20925m = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            throw null;
        }
    }

    public static final class d extends j<c> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        public static int f20929b = 0;

        /* JADX INFO: renamed from: c */
        public static int f20930c = 0;

        /* JADX INFO: renamed from: d */
        public static int f20931d = 0;

        /* JADX INFO: renamed from: g */
        private static int[] f20932g = null;

        /* JADX INFO: renamed from: h */
        private static int f20933h = 0;

        /* JADX INFO: renamed from: j */
        private static int f20934j = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$d(short r8, short r9, int r10) {
            /*
                int r7 = r9 * 3
                int r1 = r7 + 1
                int r0 = r10 * 2
                int r6 = r0 + 117
                byte[] r5 = o.bd.c.d.$$a
                int r0 = r8 * 4
                int r4 = r0 + 4
                byte[] r3 = new byte[r1]
                r2 = 0
                if (r5 != 0) goto L29
                r1 = r4
                r0 = r2
            L15:
                int r4 = r4 + 1
                int r6 = r6 + r1
                r1 = r0
            L19:
                byte r0 = (byte) r6
                r3[r1] = r0
                int r0 = r1 + 1
                if (r1 != r7) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r3, r2)
                return r0
            L26:
                r1 = r5[r4]
                goto L15
            L29:
                r1 = r2
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bd.c.d.$$d(short, short, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20929b = -303189806;
            f20931d = 922192597;
            f20930c = 1020193623;
            f20933h = 0;
            f20934j = 1;
            f20932g = new int[]{1346093811, -1358366909, 1269313456, 2113207473, 1660859738, -1042557693, 1847988423, 1602538502, 907527104, -1135822493, 199532096, -474441191, 853894706, -1887363420, 1567912849, 573724523, -1866818799, 1318948410};
        }

        d(c cVar) {
            super(cVar, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object a(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) throws Throwable {
            int i8 = ~i7;
            int i9 = ~i4;
            int i10 = ~((-1) - (((-1) - i8) & ((-1) - i9)));
            int i11 = (i10 + i6) - (i10 & i6);
            int i12 = ~((i7 + i4) - (i7 & i4));
            int i13 = (i11 + i12) - (i11 & i12);
            int i14 = ~i6;
            int i15 = ~((-1) - (((-1) - i14) & ((-1) - i7)));
            int i16 = ~((i14 + i4) - (i14 & i4));
            int i17 = ((i16 + i15) - (i16 & i15)) | i12;
            int i18 = ~((-1) - (((-1) - i8) & ((-1) - i4)));
            int i19 = ~((i9 + i7) - (i9 & i7));
            int i20 = (i18 + i19) - (i18 & i19);
            int i21 = i7 + i4 + i5 + (1040777104 * i3) + ((-1861505373) * i2);
            int i22 = i21 * i21;
            int i23 = (i7 * (-1036928585)) + 527892480 + ((-1036928585) * i4) + ((-562525036) * i13) + (562525036 * i17) + ((-281262518) * i20) + ((-1318191104) * i5) + (1608515584 * i3) + ((-1123418112) * i2) + ((-2114519040) * i22);
            int i24 = (i7 * 1703033811) + 1712528133 + (i4 * 1703033811) + (i13 * 1508) + (i17 * (-1508)) + (i20 * 754) + (i5 * 1703034565) + (i3 * (-2114876976)) + (i2 * 1880022383) + (i22 * (-720175104));
            if (i23 + (i24 * i24 * (-739180544)) == 1) {
                int i25 = 2 % 2;
                int i26 = f20934j + 89;
                f20933h = i26 % 128;
                return Boolean.valueOf(i26 % 2 != 0);
            }
            d dVar = (d) objArr[0];
            int i27 = 2 % 2;
            a aVar = new a();
            Object[] objArr2 = new Object[1];
            v(new int[]{-419179107, -1600494648, -1953166999, -331227527, 2045635400, 918479814, 1707303276, -756895796}, Color.red(0) + 16, objArr2);
            aVar.a(((String) objArr2[0]).intern(), (Object) ((c) dVar.e()).f20913g);
            int i28 = f20933h + 43;
            f20934j = i28 % 128;
            int i29 = i28 % 2;
            return aVar;
        }

        static void init$0() {
            $$a = new byte[]{44, 115, -31, MessagePack.Code.FLOAT32};
            $$b = 37;
        }

        private static void v(int[] iArr, int i2, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i3 = 2;
            int i4 = 2 % 2;
            l lVar = new l();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = f20932g;
            int i5 = 989264422;
            int i6 = 1;
            int i7 = 0;
            if (iArr3 != null) {
                int length2 = iArr3.length;
                int[] iArr4 = new int[length2];
                int i8 = 0;
                while (i8 < length2) {
                    int i9 = $11 + 45;
                    $10 = i9 % 128;
                    int i10 = i9 % i3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                        Object objA = o.d.d.a(i5);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a(675 - View.MeasureSpec.getSize(0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 12 - Color.blue(0), -328001469, false, $$d(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                        }
                        iArr4[i8] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                        i8++;
                        i3 = 2;
                        i5 = 989264422;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr3 = iArr4;
            }
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int[] iArr6 = f20932g;
            if (iArr6 != null) {
                int i11 = $10 + 95;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    length = iArr6.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr6.length;
                    iArr2 = new int[length];
                    i6 = 0;
                }
                while (i6 < length) {
                    int i12 = $11 + 3;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    Object[] objArr3 = {Integer.valueOf(iArr6[i6])};
                    Object objA2 = o.d.d.a(989264422);
                    if (objA2 == null) {
                        byte b4 = (byte) i7;
                        byte b5 = b4;
                        objA2 = o.d.d.a(Process.getGidForName("") + 676, (char) Color.red(i7), 12 - ExpandableListView.getPackedPositionType(0L), -328001469, false, $$d(b4, b5, (byte) (b5 + 2)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i6] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i6++;
                    i7 = 0;
                }
                iArr6 = iArr2;
            }
            System.arraycopy(iArr6, i7, iArr5, i7, length3);
            lVar.f19941d = i7;
            while (lVar.f19941d < iArr.length) {
                int i14 = $10 + 11;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
                cArr[1] = (char) iArr[lVar.f19941d];
                cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                cArr[3] = (char) iArr[lVar.f19941d + 1];
                lVar.f19942e = (cArr[0] << 16) + cArr[1];
                lVar.f19940a = (cArr[2] << 16) + cArr[3];
                l.a(iArr5);
                int i16 = 0;
                for (int i17 = 16; i16 < i17; i17 = 16) {
                    lVar.f19942e ^= iArr5[i16];
                    Object[] objArr4 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA3 = o.d.d.a(2098218801);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(((Process.getThreadPriority(0) + 20) >> 6) + 301, (char) (52697 - KeyEvent.getDeadChar(0, 0)), Process.getGidForName("") + 12, -1416256172, false, $$d(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i16++;
                }
                int i18 = lVar.f19942e;
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = i18;
                lVar.f19940a ^= iArr5[16];
                lVar.f19942e ^= iArr5[17];
                int i19 = lVar.f19942e;
                int i20 = lVar.f19940a;
                cArr[0] = (char) (lVar.f19942e >>> 16);
                cArr[1] = (char) lVar.f19942e;
                cArr[2] = (char) (lVar.f19940a >>> 16);
                cArr[3] = (char) lVar.f19940a;
                l.a(iArr5);
                cArr2[lVar.f19941d * 2] = cArr[0];
                cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
                Object[] objArr5 = {lVar, lVar};
                Object objA4 = o.d.d.a(986820978);
                if (objA4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objA4 = o.d.d.a(228 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (ExpandableListView.getPackedPositionGroup(0L) + 51004), 10 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -330018025, false, $$d(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        @Override // o.ab.j
        public final f a(Context context) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            v(new int[]{-96219056, 584946962, -1338890958, -85824646, -1486505088, 1246981538, -1797358704, 2020669033, 1652601562, 1620717620}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20, objArr);
            o.cg.b bVar = new o.cg.b(context, 1, ((String) objArr[0]).intern());
            int i3 = f20933h + 59;
            f20934j = i3 % 128;
            if (i3 % 2 != 0) {
                return bVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final void a(a aVar) throws b {
            int i2 = 2 % 2;
            int i3 = f20933h + 85;
            f20934j = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void b(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20933h + 73;
            f20934j = i3 % 128;
            int i4 = i3 % 2;
            ((c) e()).g().d(cVar);
            int i5 = f20934j + 41;
            f20933h = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.c
        public final void c(o.bg.c cVar) {
            int i2 = 2 % 2;
            int i3 = f20934j + 1;
            f20933h = i3 % 128;
            if (i3 % 2 == 0) {
                ((c) e()).g().b();
                return;
            }
            ((c) e()).g().b();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.ab.j, o.ab.c
        public final String d() throws Throwable {
            int i2 = 2 % 2;
            StringBuilder sbAppend = new StringBuilder().append(((c) e()).e());
            Object[] objArr = new Object[1];
            v(new int[]{101147844, 1906701751, -1633852398, 543497759, 2070193814, -944786091, -1278018566, 656345425, -785450242, -1073962990, 1470264252, 354450000}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23, objArr);
            String string = sbAppend.append(((String) objArr[0]).intern()).toString();
            int i3 = f20933h + 117;
            f20934j = i3 % 128;
            int i4 = i3 % 2;
            return string;
        }

        @Override // o.ab.j
        public final o.cg.j k() {
            int i2 = 2 % 2;
            int i3 = f20933h + 13;
            int i4 = i3 % 128;
            f20934j = i4;
            int i5 = i3 % 2;
            int i6 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f20933h = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        @Override // o.ab.j
        public final boolean l() {
            int i2 = 2 % 2;
            int i3 = f20933h + 115;
            int i4 = i3 % 128;
            f20934j = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 7;
            f20933h = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        @Override // o.ab.j
        public final a m() throws b {
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i2 = f20930c * (-1735130769);
            f20930c = i2;
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            return (a) a((int) Runtime.getRuntime().maxMemory(), iFreeMemory, 695303159, i2, iUptimeMillis, -695303159, new Object[]{this});
        }

        @Override // o.ab.j
        public final String o() throws Throwable {
            Object obj;
            int i2 = 2 % 2;
            int i3 = f20934j + 53;
            f20933h = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = new Object[1];
                v(new int[]{1883416554, -1236536797, 1305830116, 1560809563, -1527568061, -764641710, 1078047342, -1471816945, -190379859, -1070105136}, 111 >> ExpandableListView.getPackedPositionGroup(0L), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                v(new int[]{1883416554, -1236536797, 1305830116, 1560809563, -1527568061, -764641710, 1078047342, -1471816945, -190379859, -1070105136}, 18 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
                obj = objArr2[0];
            }
            return ((String) obj).intern();
        }

        @Override // o.ab.j
        public final byte[][] p() {
            int i2 = 2 % 2;
            int i3 = f20934j;
            int i4 = i3 + 125;
            f20933h = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 23 / 0;
            }
            int i6 = i3 + 71;
            f20933h = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }

        @Override // o.ab.j
        public final void q() {
            int i2 = 2 % 2;
            int i3 = f20934j + 107;
            f20933h = i3 % 128;
            if (i3 % 2 != 0) {
                o.c.a.j(h());
                throw null;
            }
            o.c.a.j(h());
            int i4 = f20933h + 107;
            f20934j = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.ab.j
        public final boolean r() {
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i2 = f20931d * 2134256353;
            f20931d = i2;
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i3 = f20929b * (-1005875341);
            f20929b = i3;
            return ((Boolean) a(i3, iFreeMemory, -641323938, i2, elapsedCpuTime, 641323939, new Object[]{this})).booleanValue();
        }
    }

    public interface e {
        void a();

        void b();

        void d(o.bg.c cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$j(int r7, short r8, int r9) {
        /*
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r0 = r9 * 2
            int r6 = r0 + 117
            int r0 = r8 * 2
            int r5 = r0 + 4
            byte[] r4 = o.bd.c.$$d
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r4 != 0) goto L28
            r0 = r7
            r1 = r2
        L15:
            int r5 = r5 + 1
            int r6 = r6 + r0
        L18:
            byte r0 = (byte) r6
            r3[r1] = r0
            if (r1 != r7) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L23:
            int r1 = r1 + 1
            r0 = r4[r5]
            goto L15
        L28:
            r1 = r2
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bd.c.$$j(int, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f20908l = 0;
        f20909m = 1;
        f20911o = 0;
        f20910n = 1;
        l();
        ViewConfiguration.getMaximumDrawingCacheSize();
        TextUtils.indexOf("", "", 0);
        ViewConfiguration.getZoomControlsTimeout();
        int i2 = f20908l + 69;
        f20909m = i2 % 128;
        int i3 = i2 % 2;
    }

    public c(Context context, e eVar, o.en.b bVar) {
        super(context, eVar, bVar, o.bg.e.f21107e);
        this.f20912f = false;
    }

    static /* synthetic */ void c(c cVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20911o + 69;
        f20910n = i3 % 128;
        int i4 = i3 % 2;
        cVar.a();
        int i5 = f20910n + 95;
        f20911o = i5 % 128;
        int i6 = i5 % 2;
    }

    static void init$0() {
        $$d = new byte[]{96, -114, MessagePack.Code.EXT16, -13};
        $$e = 189;
    }

    static void l() {
        f20907k = new int[]{1466042820, 95494555, -905261147, -1289970253, 1130830811, 225975335, 1117615313, -1663331504, 1245608697, 779565216, -931832778, 49828845, -367197918, 1409532036, -2010284668, -1487005861, 570656809, 989768303};
    }

    private static void q(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        l lVar = new l();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = f20907k;
        int i5 = 989264422;
        long j2 = 0;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 77;
                $11 = i8 % 128;
                if (i8 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                        Object objA = o.d.d.a(i5);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a(676 - (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1)), (char) TextUtils.getCapsMode("", 0, 0), (Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1)) + 11, -328001469, false, $$j(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i7] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
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
                        objA2 = o.d.d.a(675 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) KeyEvent.normalizeMetaState(0), 12 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -328001469, false, $$j(b4, b5, (byte) (b5 + 2)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    i7++;
                }
                i3 = 2;
                i5 = 989264422;
                j2 = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f20907k;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = $11 + 67;
            $10 = i9 % 128;
            int i10 = 2;
            int i11 = i9 % 2;
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $11 + 109;
                $10 = i13 % 128;
                if (i13 % i10 != 0) {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i12])};
                    Object objA3 = o.d.d.a(989264422);
                    if (objA3 == null) {
                        byte b6 = (byte) i6;
                        byte b7 = b6;
                        objA3 = o.d.d.a((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 674, (char) View.getDefaultSize(i6, i6), 12 - TextUtils.getOffsetBefore("", i6), -328001469, false, $$j(b6, b7, (byte) (b7 + 2)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                } else {
                    Object[] objArr5 = {Integer.valueOf(iArr5[i12])};
                    Object objA4 = o.d.d.a(989264422);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objA4 = o.d.d.a(676 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) KeyEvent.getDeadChar(0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, -328001469, false, $$j(b8, b9, (byte) (b9 + 2)), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                }
                i12++;
                i10 = 2;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, i6, iArr4, i6, length2);
        lVar.f19941d = i6;
        int i14 = $11 + 39;
        $10 = i14 % 128;
        int i15 = i14 % 2;
        while (lVar.f19941d < iArr.length) {
            int i16 = $11 + 95;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
            cArr[1] = (char) iArr[lVar.f19941d];
            cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
            cArr[3] = (char) iArr[lVar.f19941d + 1];
            lVar.f19942e = (cArr[0] << 16) + cArr[1];
            lVar.f19940a = (cArr[2] << 16) + cArr[3];
            l.a(iArr4);
            int i18 = 0;
            for (int i19 = 16; i18 < i19; i19 = 16) {
                int i20 = $10 + 107;
                $11 = i20 % 128;
                if (i20 % 2 == 0) {
                    lVar.f19942e ^= iArr4[i18];
                    Object[] objArr6 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA5 = o.d.d.a(2098218801);
                    if (objA5 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        objA5 = o.d.d.a((ViewConfiguration.getLongPressTimeout() >> 16) + 301, (char) (Process.getGidForName("") + 52698), 11 - TextUtils.indexOf("", ""), -1416256172, false, $$j(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue;
                    i18 += 50;
                } else {
                    lVar.f19942e ^= iArr4[i18];
                    Object[] objArr7 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                    Object objA6 = o.d.d.a(2098218801);
                    if (objA6 == null) {
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        objA6 = o.d.d.a(View.resolveSize(0, 0) + 301, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 52697), (ViewConfiguration.getEdgeSlop() >> 16) + 11, -1416256172, false, $$j(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA6).invoke(null, objArr7)).intValue();
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = iIntValue2;
                    i18++;
                }
            }
            int i21 = lVar.f19942e;
            lVar.f19942e = lVar.f19940a;
            lVar.f19940a = i21;
            lVar.f19940a ^= iArr4[16];
            lVar.f19942e ^= iArr4[17];
            int i22 = lVar.f19942e;
            int i23 = lVar.f19940a;
            cArr[0] = (char) (lVar.f19942e >>> 16);
            cArr[1] = (char) lVar.f19942e;
            cArr[2] = (char) (lVar.f19940a >>> 16);
            cArr[3] = (char) lVar.f19940a;
            l.a(iArr4);
            cArr2[lVar.f19941d * 2] = cArr[0];
            cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
            cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
            cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
            Object[] objArr8 = {lVar, lVar};
            Object objA7 = o.d.d.a(986820978);
            if (objA7 == null) {
                byte b14 = (byte) 0;
                byte b15 = b14;
                objA7 = o.d.d.a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 228, (char) (51004 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 10 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -330018025, false, $$j(b14, b15, b15), new Class[]{Object.class, Object.class});
            }
            ((Method) objA7).invoke(null, objArr8);
        }
        String str = new String(cArr2, 0, i2);
        int i24 = $11 + 29;
        $10 = i24 % 128;
        if (i24 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i25 = 68 / 0;
            objArr[0] = str;
        }
    }

    public final void a(o.be.c cVar) throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        if (o.ea.f.a()) {
            int i3 = f20911o + 121;
            f20910n = i3 % 128;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                q(new int[]{1815278616, 1154563565, -1742349745, -429430239, -423536945, 1629715908, -1419951433, -452747817, 1102179876, -1496658568}, (AudioTrack.getMinVolume() > 2.0f ? 1 : (AudioTrack.getMinVolume() == 2.0f ? 0 : -1)) * 86, objArr);
                strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                q(new int[]{2029513684, 1519446040, 2053476779, -1421165607, -1023591071, -1475024159, 1642422128, 1491752206}, TextUtils.lastIndexOf("", 'M', 0, 1) + 81, objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                q(new int[]{1815278616, 1154563565, -1742349745, -429430239, -423536945, 1629715908, -1419951433, -452747817, 1102179876, -1496658568}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 19, objArr3);
                strIntern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                q(new int[]{2029513684, 1519446040, 2053476779, -1421165607, -1023591071, -1475024159, 1642422128, 1491752206}, TextUtils.lastIndexOf("", '0', 0, 0) + 17, objArr4);
                obj = objArr4[0];
            }
            o.ea.f.c(strIntern, ((String) obj).intern());
            int i4 = f20911o + 45;
            f20910n = i4 % 128;
            int i5 = i4 % 2;
        }
        this.f20914j = cVar;
        a();
    }

    @Override // o.ab.e
    public final o.ab.c<?> c() {
        int i2 = 2 % 2;
        int i3 = f20911o + 33;
        f20910n = i3 % 128;
        int i4 = i3 % 2;
        if (this.f20912f) {
            return new d(this);
        }
        C0339c c0339c = new C0339c(this);
        int i5 = f20911o + 5;
        f20910n = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return c0339c;
    }

    @Override // o.ab.e
    public final String e() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f20911o + 87;
        f20910n = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        q(new int[]{1815278616, 1154563565, -1742349745, -429430239, -423536945, 1629715908, -1419951433, -452747817, 1102179876, -1496658568}, Color.rgb(0, 0, 0) + 16777235, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f20911o + 113;
        f20910n = i5 % 128;
        if (i5 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    public final boolean m() {
        int i2 = 2 % 2;
        int i3 = f20910n + 9;
        f20911o = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f20912f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
