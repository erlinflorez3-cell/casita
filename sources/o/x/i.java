package o.x;

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
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.o;
import o.a.q;
import o.ea.m;
import o.i.c;
import o.x.c;
import o.x.h;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i<CredentialsLoader extends o.i.c> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static int A = 0;
    private static int D = 0;
    public static int E = 0;
    public static int G = 0;
    public static int H = 0;

    /* JADX INFO: renamed from: f */
    public static int f26923f = 0;

    /* JADX INFO: renamed from: g */
    public static int f26924g = 0;

    /* JADX INFO: renamed from: h */
    public static int f26925h = 0;

    /* JADX INFO: renamed from: i */
    public static int f26926i = 0;

    /* JADX INFO: renamed from: j */
    public static int f26927j = 0;

    /* JADX INFO: renamed from: v */
    private static char[] f26928v = null;

    /* JADX INFO: renamed from: w */
    private static long f26929w = 0;

    /* JADX INFO: renamed from: y */
    private static int f26930y = 0;

    /* JADX INFO: renamed from: z */
    private static int f26931z = 0;

    /* JADX INFO: renamed from: c */
    f f26934c;

    /* JADX INFO: renamed from: e */
    o.en.b f26936e;

    /* JADX INFO: renamed from: l */
    private CredentialsLoader f26938l;

    /* JADX INFO: renamed from: n */
    private final o.m.f f26940n;

    /* JADX INFO: renamed from: o */
    private final String f26941o;

    /* JADX INFO: renamed from: p */
    private o.c.a f26942p;

    /* JADX INFO: renamed from: r */
    private Integer f26944r;

    /* JADX INFO: renamed from: t */
    private o.p.b f26946t;

    /* JADX INFO: renamed from: m */
    private boolean f26939m = false;

    /* JADX INFO: renamed from: a */
    final List<o.m.i> f26932a = new ArrayList();

    /* JADX INFO: renamed from: d */
    boolean f26935d = false;

    /* JADX INFO: renamed from: q */
    private final o.s.d f26943q = new o.s.d();

    /* JADX INFO: renamed from: s */
    private final TreeMap<Integer, o.m.i> f26945s = new TreeMap<>();

    /* JADX INFO: renamed from: u */
    private Object f26947u = new Object();

    /* JADX INFO: renamed from: x */
    private boolean f26948x = true;

    /* JADX INFO: renamed from: b */
    public final o.i.d f26933b = new o.i.d();

    /* JADX INFO: renamed from: k */
    private boolean f26937k = false;

    /* JADX INFO: renamed from: o.x.i$3 */
    public class AnonymousClass3 {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static char[] f26949a = null;

        /* JADX INFO: renamed from: b */
        private static int f26950b = 0;

        /* JADX INFO: renamed from: c */
        private static long f26951c = 0;

        /* JADX INFO: renamed from: d */
        private static long f26952d = 0;

        /* JADX INFO: renamed from: e */
        private static int f26953e = 0;

        /* JADX INFO: renamed from: f */
        public static int f26954f = 0;

        /* JADX INFO: renamed from: g */
        public static int f26955g = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(int r8, byte r9, short r10) {
            /*
                int r0 = 105 - r8
                byte[] r8 = o.x.i.AnonymousClass3.$$c
                int r1 = r9 * 2
                int r7 = r1 + 1
                int r1 = r10 * 3
                int r6 = r1 + 4
                byte[] r5 = new byte[r7]
                r4 = 0
                if (r8 != 0) goto L2a
                r3 = r4
                r2 = r7
            L13:
                int r6 = r6 + 1
                int r0 = -r0
                int r0 = r0 + r2
                r2 = r3
            L18:
                byte r1 = (byte) r0
                int r3 = r2 + 1
                r5[r2] = r1
                if (r3 != r7) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L25:
                r1 = r8[r6]
                r2 = r0
                r0 = r1
                goto L13
            L2a:
                r2 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.x.i.AnonymousClass3.$$e(int, byte, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            f26955g = -1651117227;
            f26954f = -1335901641;
            init$0();
            f26950b = 0;
            f26953e = 1;
            f26952d = 873347079871854062L;
            f26949a = new char[]{38037, 20933, 7714, 56133, 33226, 19992, 2930, 61861, 48641, 31601, 8626, 60957, 43845, 37302, 24263, 6994, 49588, 36591, 38036, 20940, 7735, 56163, 33225};
            f26951c = -6310517129667260000L;
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(Unknown Source)
            	at java.base/java.util.TreeMap.lastKey(Unknown Source)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] c(android.content.Context r27, int r28, int r29, int r30) {
            /*
                Method dump skipped, instruction units count: 1506
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.x.i.AnonymousClass3.c(android.content.Context, int, int, int):java.lang.Object[]");
        }

        private static void h(String str, int i2, Object[] objArr) throws Throwable {
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $11 + 123;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
            q qVar = new q();
            qVar.f19949d = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                int i6 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        objA = o.d.d.a(((Process.getThreadPriority(0) + 20) >> 6) + 731, (char) (View.resolveSize(0, 0) + 7933), TextUtils.getOffsetAfter("", 0) + 11, 355847088, false, $$e((byte) ($$d >>> 2), b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f26952d ^ 4743694005979712847L);
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a(TextUtils.lastIndexOf("", '0', 0) + 837, (char) (Color.alpha(0) + 27279), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 11, -2145994442, false, $$e((byte) 27, b3, b3), new Class[]{Object.class, Object.class});
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
            char[] cArr2 = new char[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr4 = {qVar, qVar};
                Object objA3 = o.d.d.a(1452497747);
                if (objA3 == null) {
                    byte b4 = (byte) 0;
                    objA3 = o.d.d.a(View.combineMeasuredStates(0, 0) + 836, (char) (27279 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), TextUtils.getTrimmedLength("") + 11, -2145994442, false, $$e((byte) 27, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i7 = $10 + 103;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            }
            objArr[0] = new String(cArr2);
        }

        private static void i(char c2, int i2, int i3, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            o oVar = new o();
            long[] jArr = new long[i3];
            oVar.f19947b = 0;
            while (oVar.f19947b < i3) {
                int i5 = $10 + 45;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = oVar.f19947b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(f26949a[i2 >> i6])};
                        Object objA = o.d.d.a(-214519724);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            objA = o.d.d.a(TextUtils.indexOf("", "", 0) + 742, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 13, 632508977, false, $$e((byte) 6, b2, b2), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(f26951c), Integer.valueOf(c2)};
                        Object objA2 = o.d.d.a(-1567654649);
                        if (objA2 == null) {
                            byte b3 = (byte) 5;
                            byte b4 = (byte) (b3 - 5);
                            objA2 = o.d.d.a((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 766, (char) (12471 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 12 - ((Process.getThreadPriority(0) + 20) >> 6), 1946853218, false, $$e(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {oVar, oVar};
                        Object objA3 = o.d.d.a(-723636472);
                        if (objA3 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objA3 = o.d.d.a(387 - View.MeasureSpec.getMode(0), (char) Gravity.getAbsoluteGravity(0, 0), 18 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 39570797, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i7 = oVar.f19947b;
                    Object[] objArr5 = {Integer.valueOf(f26949a[i2 + i7])};
                    Object objA4 = o.d.d.a(-214519724);
                    if (objA4 == null) {
                        byte b7 = (byte) 0;
                        objA4 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 743, (char) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getFadingEdgeLength() >> 16) + 12, 632508977, false, $$e((byte) 6, b7, b7), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(f26951c), Integer.valueOf(c2)};
                    Object objA5 = o.d.d.a(-1567654649);
                    if (objA5 == null) {
                        byte b8 = (byte) 5;
                        byte b9 = (byte) (b8 - 5);
                        objA5 = o.d.d.a(TextUtils.getCapsMode("", 0, 0) + 766, (char) (12469 - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 11, 1946853218, false, $$e(b8, b9, b9), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {oVar, oVar};
                    Object objA6 = o.d.d.a(-723636472);
                    if (objA6 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        objA6 = o.d.d.a(387 - View.resolveSize(0, 0), (char) Color.green(0), TextUtils.getOffsetBefore("", 0) + 18, 39570797, false, $$e(b10, b11, b11), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA6).invoke(null, objArr7);
                }
            }
            char[] cArr = new char[i3];
            oVar.f19947b = 0;
            while (oVar.f19947b < i3) {
                int i8 = $10 + 73;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                    Object[] objArr8 = {oVar, oVar};
                    Object objA7 = o.d.d.a(-723636472);
                    if (objA7 == null) {
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        objA7 = o.d.d.a(387 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 18 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 39570797, false, $$e(b12, b13, b13), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA7).invoke(null, objArr8);
                    int i9 = 62 / 0;
                } else {
                    cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                    Object[] objArr9 = {oVar, oVar};
                    Object objA8 = o.d.d.a(-723636472);
                    if (objA8 == null) {
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        objA8 = o.d.d.a(387 - KeyEvent.getDeadChar(0, 0), (char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 18, 39570797, false, $$e(b14, b15, b15), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA8).invoke(null, objArr9);
                }
            }
            objArr[0] = new String(cArr);
        }

        static void init$0() {
            $$a = new byte[]{93, -2, -4, -85};
            $$b = 129;
        }

        static void init$1() {
            $$c = new byte[]{Ascii.FF, 10, -28, MessagePack.Code.NEGFIXINT_PREFIX};
            $$d = 138;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void j(int r7, int r8, int r9, java.lang.Object[] r10) {
            /*
                int r7 = 101 - r7
                int r0 = r8 * 3
                int r6 = r0 + 4
                byte[] r5 = o.x.i.AnonymousClass3.$$a
                int r1 = r9 * 4
                int r0 = 1 - r1
                byte[] r4 = new byte[r0]
                r3 = 0
                int r2 = 0 - r1
                if (r5 != 0) goto L2a
                r0 = r2
                r1 = r3
            L15:
                int r7 = r7 + r0
                int r6 = r6 + 1
            L18:
                byte r0 = (byte) r7
                r4[r1] = r0
                if (r1 != r2) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                r10[r3] = r0
                return
            L25:
                int r1 = r1 + 1
                r0 = r5[r6]
                goto L15
            L2a:
                r1 = r3
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.x.i.AnonymousClass3.j(int, int, int, java.lang.Object[]):void");
        }
    }

    /* JADX INFO: renamed from: o.x.i$4 */
    final class AnonymousClass4 implements o.ca.e {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final int $$f = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static char[] f26956a = null;

        /* JADX INFO: renamed from: b */
        private static char f26957b = 0;

        /* JADX INFO: renamed from: e */
        private static long f26958e = 0;

        /* JADX INFO: renamed from: f */
        private static int f26959f = 0;

        /* JADX INFO: renamed from: g */
        private static int f26960g = 0;

        /* JADX INFO: renamed from: h */
        private static int f26961h = 0;

        /* JADX INFO: renamed from: i */
        private static char f26962i = 0;

        /* JADX INFO: renamed from: j */
        public static int f26963j = 0;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ Context f26965d;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0022 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$g(byte r6, int r7, short r8) {
            /*
                int r3 = r7 * 4
                int r1 = 1 - r3
                int r2 = r8 + 4
                int r0 = 122 - r6
                byte[] r8 = o.x.i.AnonymousClass4.$$c
                byte[] r7 = new byte[r1]
                r6 = 0
                int r5 = 0 - r3
                if (r8 != 0) goto L29
                r4 = r6
                r3 = r5
            L13:
                int r0 = -r0
                int r0 = r0 + r3
            L15:
                byte r1 = (byte) r0
                int r2 = r2 + 1
                r7[r4] = r1
                if (r4 != r5) goto L22
                java.lang.String r0 = new java.lang.String
                r0.<init>(r7, r6)
                return r0
            L22:
                int r4 = r4 + 1
                r1 = r8[r2]
                r3 = r0
                r0 = r1
                goto L13
            L29:
                r4 = r6
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: o.x.i.AnonymousClass4.$$g(byte, int, short):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            f26963j = 882516334;
            init$0();
            f26960g = 0;
            f26961h = 1;
            f26956a = new char[]{64595, 64593, 64601, 64586, 64630, 64598, 64529, 64523, 64588, 64587, 64578, 64580, 64599, 64541, 64590, 64585, 64614, 64576, 64577, 64584, 64582, 64535, 64534, 64604, 64591};
            f26957b = (char) 51642;
            f26958e = 740602047300126166L;
            f26959f = 1564493270;
            f26962i = (char) 36559;
        }

        AnonymousClass4(Context context) {
            context = context;
        }

        static void init$0() {
            $$a = new byte[]{8, -110, 120, 122};
            $$b = 122;
        }

        static void init$1() {
            $$d = new byte[]{120, -15, 89, -97, MessagePack.Code.BIN8, 60, Ascii.SI, MessagePack.Code.BIN8, 59, MessagePack.Code.BIN16, Ascii.DC4};
            $$e = 82;
        }

        static void init$2() {
            $$c = new byte[]{120, -15, 89, -97};
            $$f = 56;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0014). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void k(byte r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                int r0 = r7 * 3
                int r7 = 4 - r0
                int r6 = r9 + 99
                int r5 = r8 * 4
                int r0 = r5 + 1
                byte[] r4 = o.x.i.AnonymousClass4.$$a
                byte[] r3 = new byte[r0]
                r2 = 0
                if (r4 != 0) goto L29
                r0 = r6
                r1 = r2
                r6 = r5
            L14:
                int r7 = r7 + 1
                int r6 = r6 + r0
            L17:
                byte r0 = (byte) r6
                r3[r1] = r0
                if (r1 != r5) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r3, r2)
                r10[r2] = r0
                return
            L24:
                int r1 = r1 + 1
                r0 = r4[r7]
                goto L14
            L29:
                r1 = r2
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.x.i.AnonymousClass4.k(byte, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:138:0x018a  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x01c7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void l(int r28, java.lang.String r29, byte r30, java.lang.Object[] r31) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 986
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.x.i.AnonymousClass4.l(int, java.lang.String, byte, java.lang.Object[]):void");
        }

        private static void m(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int i3 = 2;
            int i4 = 2 % 2;
            int i5 = $11 + 91;
            $10 = i5 % 128;
            Object obj = null;
            Object charArray = str6;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (str6 != null) {
                charArray = str6.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            Object charArray2 = str5;
            if (str5 != null) {
                int i6 = $11 + 113;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                charArray2 = str5.toCharArray();
            }
            char[] cArr2 = (char[]) charArray2;
            Object charArray3 = str4;
            if (str4 != null) {
                int i8 = $11 + 97;
                $10 = i8 % 128;
                int i9 = i8 % 2;
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
                        objA = o.d.d.a(106 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), Drawable.resolveOpacity(0, 0) + 11, -155898465, false, $$g((byte) ($$f + 1), b2, (byte) (b2 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr2)).intValue();
                    Object[] objArr3 = {iVar};
                    Object objA2 = o.d.d.a(2068572);
                    if (objA2 == null) {
                        byte b3 = (byte) 0;
                        objA2 = o.d.d.a((Process.myTid() >> 22) + 847, (char) (6488 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12, -694521287, false, $$g((byte) ($$f - i3), b3, (byte) (b3 - 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA2).invoke(obj, objArr3)).intValue();
                    Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA3 = o.d.d.a(-1122996612);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        objA3 = o.d.d.a(459 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1804962841, false, $$g((byte) $$f, b4, (byte) (b4 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA4 = o.d.d.a(-1223178239);
                    if (objA4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objA4 = o.d.d.a(Color.argb(0, 0, 0, 0) + 639, (char) (View.MeasureSpec.getMode(0) + 65100), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, 1636969060, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    cArr3[iIntValue2] = iVar.f19933e;
                    cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r8[iVar.f19932b])) ^ (f26958e ^ 740602047300126166L)) ^ ((long) ((int) (((long) f26959f) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f26962i) ^ 740602047300126166L))));
                    iVar.f19932b++;
                    i3 = 2;
                    obj = null;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str7 = new String(cArr5);
            int i10 = $10 + 35;
            $11 = i10 % 128;
            if (i10 % 2 != 0) {
                objArr[0] = str7;
            } else {
                int i11 = 73 / 0;
                objArr[0] = str7;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:17:0x0017). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void n(int r8, short r9, byte r10, java.lang.Object[] r11) {
            /*
                byte[] r7 = o.x.i.AnonymousClass4.$$d
                int r0 = r9 * 7
                int r6 = 11 - r0
                int r2 = r8 * 7
                int r1 = 8 - r2
                int r0 = r10 * 14
                int r5 = r0 + 97
                byte[] r4 = new byte[r1]
                int r3 = 7 - r2
                r2 = 0
                if (r7 != 0) goto L2e
                r0 = r6
                r1 = r2
            L17:
                int r6 = r6 + 1
                int r5 = r5 + r0
                int r5 = r5 + (-5)
            L1c:
                byte r0 = (byte) r5
                r4[r1] = r0
                if (r1 != r3) goto L29
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r2)
                r11[r2] = r0
                return
            L29:
                int r1 = r1 + 1
                r0 = r7[r6]
                goto L17
            L2e:
                r1 = r2
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.x.i.AnonymousClass4.n(int, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:119:0x00f3  */
        @Override // o.ca.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(o.m.i r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2387
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.x.i.AnonymousClass4.b(o.m.i):void");
        }

        @Override // o.ca.e
        public final void d(o.m.i iVar, o.j.b bVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f26961h + 33;
            f26960g = i3 % 128;
            int i4 = i3 % 2;
            if (o.ea.f.a()) {
                int i5 = f26961h + 23;
                f26960g = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = new Object[1];
                m((char) (Process.myPid() >> 22), "ࣆจ蹮娘騃丘軋꾹佔﮺裓\udadb\u09b1晳\ue5e2뼔잯ꮵ鮏儣졆锒酦䈗삧忆劦ꥉ줫६鯦鲴拽", "\u0000\u0000\u0000\u0000", "쩓왢̻䍍", 1002857162 - ExpandableListView.getPackedPositionType(0L), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                m((char) (TextUtils.indexOf("", "", 0, 0) + 13781), "乲\uf560盗秸ꌷ妼忡穽㿄놖䛠㊫彧僑ꉮ浇⧁독扟镠㔜\uf112솶槈⮃㻒儤婨ไ\ue82dꀬ怔Ꟁ欂ₖ\ue483ԙ嚵䀠䅔崄뿝펞筐︀놌\ue114ﲸ孀⏈㦤类훋颭얯", "\u0000\u0000\u0000\u0000", "೮\ude16헴張", (-186771956) - View.MeasureSpec.getMode(0), objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
                int i7 = f26961h + 15;
                f26960g = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 4 % 2;
                }
            }
            if (i.this.i() != null) {
                int i9 = f26960g + 23;
                f26961h = i9 % 128;
                int i10 = i9 % 2;
                i.this.i().onCustomerCredentialsInvalid(bVar);
            }
            int i11 = f26961h + 67;
            f26960g = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 75 / 0;
            }
        }
    }

    /* JADX INFO: renamed from: o.x.i$5 */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: c */
        private static int f26966c = 0;

        /* JADX INFO: renamed from: d */
        private static int f26967d = 1;

        /* JADX INFO: renamed from: e */
        static final /* synthetic */ int[] f26968e;

        static {
            int[] iArr = new int[o.g.b.values().length];
            f26968e = iArr;
            try {
                iArr[o.g.b.f26186d.ordinal()] = 1;
                int i2 = f26966c;
                int i3 = (i2 ^ 89) + ((i2 & 89) << 1);
                f26967d = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 2 / 2;
                } else {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26968e[o.g.b.f26187e.ordinal()] = 2;
                int i6 = f26967d + 107;
                f26966c = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26968e[o.g.b.f26184b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26968e[o.g.b.f26183a.ordinal()] = 4;
                int i8 = f26966c + 59;
                f26967d = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26968e[o.g.b.f26185c.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public interface c {
        void execute(Context context, o.en.b bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r7, short r8, byte r9) {
        /*
            int r0 = r7 * 2
            int r7 = r0 + 4
            int r1 = r9 * 2
            int r0 = 1 - r1
            int r6 = r8 + 99
            byte[] r5 = o.x.i.$$c
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r5 != 0) goto L28
            r0 = r2
            r1 = r3
        L15:
            int r7 = r7 + 1
            int r6 = r6 + r0
        L18:
            byte r0 = (byte) r6
            r4[r1] = r0
            if (r1 != r2) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L23:
            int r1 = r1 + 1
            r0 = r5[r7]
            goto L15
        L28:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.x.i.$$i(int, short, byte):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        H = 1439182234;
        G = -1467202056;
        E = -8433941;
        init$0();
        f26927j = 545046844;
        f26925h = -116389029;
        f26926i = 177905489;
        f26923f = 501613340;
        f26924g = -1033996280;
        f26931z = 0;
        D = 1;
        f26930y = 0;
        A = 1;
        f();
        ViewConfiguration.getPressedStateDuration();
        View.MeasureSpec.getSize(0);
        PointF.length(0.0f, 0.0f);
        int i2 = f26931z + 63;
        D = i2 % 128;
        int i3 = i2 % 2;
    }

    public i(o.m.f fVar, String str) {
        this.f26940n = fVar;
        this.f26941o = str;
    }

    private static void L(int i2, short s2, short s3, Object[] objArr) {
        byte[] bArr = $$a;
        int i3 = 3 - (i2 * 3);
        int i4 = 100 - s3;
        int i5 = s2 * 4;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i4 = (-i4) + i6;
        }
        while (true) {
            i7++;
            i3++;
            bArr2[i7] = (byte) i4;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i4 = (-bArr[i3]) + i4;
            }
        }
    }

    private static void M(char c2, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2;
        int i5 = 2 % 2;
        o oVar = new o();
        long[] jArr = new long[i3];
        oVar.f19947b = 0;
        int i6 = $11 + 55;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (oVar.f19947b < i3) {
            int i8 = $10 + 123;
            $11 = i8 % 128;
            if (i8 % i4 == 0) {
                int i9 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f26928v[i2 << i9])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 742, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), TextUtils.getCapsMode("", 0, 0) + 12, 632508977, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i9), Long.valueOf(f26929w), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objA2 = o.d.d.a(TextUtils.lastIndexOf("", '0') + 767, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 12470), Color.blue(0) + 12, 1946853218, false, $$i(b4, b5, (byte) (b5 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i9] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        objA3 = o.d.d.a(387 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) View.resolveSizeAndState(0, 0, 0), 'B' - AndroidCharacter.getMirror('0'), 39570797, false, $$i(b6, (byte) ((-1) - (((-1) - b6) & ((-1) - 6))), b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i10 = oVar.f19947b;
                Object[] objArr5 = {Integer.valueOf(f26928v[i2 + i10])};
                Object objA4 = o.d.d.a(-214519724);
                if (objA4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objA4 = o.d.d.a(742 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), Color.green(0) + 12, 632508977, false, $$i(b7, b8, b8), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr5)).longValue()), Long.valueOf(i10), Long.valueOf(f26929w), Integer.valueOf(c2)};
                Object objA5 = o.d.d.a(-1567654649);
                if (objA5 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = (byte) (b9 + 1);
                    objA5 = o.d.d.a(765 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12470), TextUtils.lastIndexOf("", '0', 0) + 13, 1946853218, false, $$i(b9, b10, (byte) (b10 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i10] = ((Long) ((Method) objA5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {oVar, oVar};
                Object objA6 = o.d.d.a(-723636472);
                if (objA6 == null) {
                    byte b11 = (byte) 0;
                    objA6 = o.d.d.a(View.MeasureSpec.getMode(0) + 387, (char) KeyEvent.normalizeMetaState(0), 18 - Gravity.getAbsoluteGravity(0, 0), 39570797, false, $$i(b11, (byte) (6 | b11), b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
            }
            i4 = 2;
        }
        char[] cArr = new char[i3];
        oVar.f19947b = 0;
        while (oVar.f19947b < i3) {
            cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
            Object[] objArr8 = {oVar, oVar};
            Object objA7 = o.d.d.a(-723636472);
            if (objA7 == null) {
                byte b12 = (byte) 0;
                objA7 = o.d.d.a((ViewConfiguration.getTouchSlop() >> 8) + 387, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 17 - TextUtils.indexOf((CharSequence) "", '0', 0), 39570797, false, $$i(b12, (byte) (6 | b12), b12), new Class[]{Object.class, Object.class});
            }
            ((Method) objA7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002a -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void N(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 4
            byte[] r8 = o.x.i.$$g
            int r1 = r7 * 11
            int r7 = r1 + 100
            int r1 = r6 * 5
            int r6 = 6 - r1
            byte[] r5 = new byte[r6]
            r4 = 0
            if (r8 != 0) goto L2d
            r7 = r6
            r1 = r0
            r3 = r4
        L14:
            int r7 = r7 + r0
            int r7 = r7 + (-6)
            r0 = r1
            r2 = r3
        L19:
            int r1 = r0 + 1
            int r3 = r2 + 1
            byte r0 = (byte) r7
            r5[r2] = r0
            if (r3 != r6) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r9[r4] = r0
            return
        L2a:
            r0 = r8[r1]
            goto L14
        L2d:
            r2 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.x.i.N(short, byte, byte, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        i iVar = (i) objArr[0];
        int i2 = 2 % 2;
        int i3 = A + 57;
        int i4 = i3 % 128;
        f26930y = i4;
        int i5 = i3 % 2;
        boolean z2 = iVar.f26937k;
        int i6 = i4 + 57;
        A = i6 % 128;
        if (i6 % 2 != 0) {
            return Boolean.valueOf(z2);
        }
        int i7 = 85 / 0;
        return Boolean.valueOf(z2);
    }

    private synchronized void b(Context context, o.g.a aVar) throws h {
        String strIntern;
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        M((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (Process.myPid() >> 22) + 76, 32 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        String strIntern2 = ((String) objArr[0]).intern();
        if (!(!o.ea.f.a())) {
            Object[] objArr2 = new Object[1];
            M((char) View.combineMeasuredStates(0, 0), 109 - (Process.myPid() >> 22), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 24, objArr2);
            o.ea.f.c(strIntern2, ((String) objArr2[0]).intern());
            int i3 = 2 % 2;
        }
        if (((Boolean) c(552271142, (int) Runtime.getRuntime().freeMemory(), -552271140, (int) Thread.currentThread().getId(), Thread.activeCount(), new Random().nextInt(), new Object[]{this})).booleanValue() && o()) {
            if (!this.f26936e.s()) {
                int i4 = A + 109;
                f26930y = i4 % 128;
                if (i4 % 2 != 0) {
                    o.ea.f.a();
                    throw null;
                }
                if (o.ea.f.a()) {
                    Object[] objArr3 = new Object[1];
                    M((char) (1917 - Drawable.resolveOpacity(0, 0)), 241 - AndroidCharacter.getMirror('0'), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 45, objArr3);
                    o.ea.f.d(strIntern2, ((String) objArr3[0]).intern());
                }
                throw new h(h.d.f26917e);
            }
            if (o.ea.f.a()) {
                int i5 = f26930y + 17;
                A = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr4 = new Object[1];
                M((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), Color.alpha(0) + 238, 87 - Color.blue(0), objArr4);
                o.ea.f.c(strIntern2, ((String) objArr4[0]).intern());
            }
            if (!this.f26946t.c(aVar.b(), this.f26944r.intValue() - 1)) {
                if (o.ea.f.a()) {
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr5 = new Object[1];
                    M((char) (64681 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + ExifDirectoryBase.TAG_TILE_BYTE_COUNTS, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 48, objArr5);
                    o.ea.f.d(strIntern2, sb.append(((String) objArr5[0]).intern()).append(aVar.b()).toString());
                }
                throw new h(h.d.f26913a);
            }
            if (o.ea.f.a()) {
                Object[] objArr6 = new Object[1];
                M((char) View.MeasureSpec.makeMeasureSpec(0, 0), 372 - TextUtils.getTrimmedLength(""), Color.red(0) + 42, objArr6);
                o.ea.f.c(strIntern2, ((String) objArr6[0]).intern());
            }
            int i7 = AnonymousClass5.f26968e[n().a(context, this.f26933b, aVar, new o.ca.e() { // from class: o.x.i.4
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static final byte[] $$c = null;
                private static final byte[] $$d = null;
                private static final int $$e = 0;
                private static final int $$f = 0;
                private static int $10 = 0;
                private static int $11 = 0;

                /* JADX INFO: renamed from: a */
                private static char[] f26956a = null;

                /* JADX INFO: renamed from: b */
                private static char f26957b = 0;

                /* JADX INFO: renamed from: e */
                private static long f26958e = 0;

                /* JADX INFO: renamed from: f */
                private static int f26959f = 0;

                /* JADX INFO: renamed from: g */
                private static int f26960g = 0;

                /* JADX INFO: renamed from: h */
                private static int f26961h = 0;

                /* JADX INFO: renamed from: i */
                private static char f26962i = 0;

                /* JADX INFO: renamed from: j */
                public static int f26963j = 0;

                /* JADX INFO: renamed from: d */
                private /* synthetic */ Context f26965d;

                private static String $$g(byte v2, int v3, short v4) {
                    /*
                        int r3 = r7 * 4
                        int r1 = 1 - r3
                        int r2 = r8 + 4
                        int r0 = 122 - r6
                        byte[] r8 = o.x.i.AnonymousClass4.$$c
                        byte[] r7 = new byte[r1]
                        r6 = 0
                        int r5 = 0 - r3
                        if (r8 != 0) goto L29
                        r4 = r6
                        r3 = r5
                    L13:
                        int r0 = -r0
                        int r0 = r0 + r3
                    L15:
                        byte r1 = (byte) r0
                        int r2 = r2 + 1
                        r7[r4] = r1
                        if (r4 != r5) goto L22
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r7, r6)
                        return r0
                    L22:
                        int r4 = r4 + 1
                        r1 = r8[r2]
                        r3 = r0
                        r0 = r1
                        goto L13
                    L29:
                        r4 = r6
                        goto L15
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.x.i.AnonymousClass4.$$g(byte, int, short):java.lang.String");
                }

                static {
                    init$2();
                    $10 = 0;
                    $11 = 1;
                    init$1();
                    f26963j = 882516334;
                    init$0();
                    f26960g = 0;
                    f26961h = 1;
                    f26956a = new char[]{64595, 64593, 64601, 64586, 64630, 64598, 64529, 64523, 64588, 64587, 64578, 64580, 64599, 64541, 64590, 64585, 64614, 64576, 64577, 64584, 64582, 64535, 64534, 64604, 64591};
                    f26957b = (char) 51642;
                    f26958e = 740602047300126166L;
                    f26959f = 1564493270;
                    f26962i = (char) 36559;
                }

                AnonymousClass4(Context context2) {
                    context = context2;
                }

                static void init$0() {
                    $$a = new byte[]{8, -110, 120, 122};
                    $$b = 122;
                }

                static void init$1() {
                    $$d = new byte[]{120, -15, 89, -97, MessagePack.Code.BIN8, 60, Ascii.SI, MessagePack.Code.BIN8, 59, MessagePack.Code.BIN16, Ascii.DC4};
                    $$e = 82;
                }

                static void init$2() {
                    $$c = new byte[]{120, -15, 89, -97};
                    $$f = 56;
                }

                private static void k(byte v2, int v3, short v4, Object[] v5) {
                    /*
                        int r0 = r7 * 3
                        int r7 = 4 - r0
                        int r6 = r9 + 99
                        int r5 = r8 * 4
                        int r0 = r5 + 1
                        byte[] r4 = o.x.i.AnonymousClass4.$$a
                        byte[] r3 = new byte[r0]
                        r2 = 0
                        if (r4 != 0) goto L29
                        r0 = r6
                        r1 = r2
                        r6 = r5
                    L14:
                        int r7 = r7 + 1
                        int r6 = r6 + r0
                    L17:
                        byte r0 = (byte) r6
                        r3[r1] = r0
                        if (r1 != r5) goto L24
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r3, r2)
                        r10[r2] = r0
                        return
                    L24:
                        int r1 = r1 + 1
                        r0 = r4[r7]
                        goto L14
                    L29:
                        r1 = r2
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.x.i.AnonymousClass4.k(byte, int, short, java.lang.Object[]):void");
                }

                /* JADX WARN: Removed duplicated region for block: B:138:0x018a  */
                /* JADX WARN: Removed duplicated region for block: B:143:0x01c7  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                private static void l(int r28, java.lang.String r29, byte r30, java.lang.Object[] r31) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 986
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.x.i.AnonymousClass4.l(int, java.lang.String, byte, java.lang.Object[]):void");
                }

                private static void m(char c2, String str, String str2, String str3, int i22, Object[] objArr7) throws Throwable {
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    int i32 = 2;
                    int i42 = 2 % 2;
                    int i52 = $11 + 91;
                    $10 = i52 % 128;
                    Object obj = null;
                    Object charArray = str6;
                    if (i52 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    if (str6 != null) {
                        charArray = str6.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    Object charArray2 = str5;
                    if (str5 != null) {
                        int i62 = $11 + 113;
                        $10 = i62 % 128;
                        int i72 = i62 % 2;
                        charArray2 = str5.toCharArray();
                    }
                    char[] cArr2 = (char[]) charArray2;
                    Object charArray3 = str4;
                    if (str4 != null) {
                        int i8 = $11 + 97;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
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
                    cArr4[2] = (char) (cArr4[2] + ((char) i22));
                    int length3 = ((char[]) charArray3).length;
                    char[] cArr5 = new char[length3];
                    iVar.f19932b = 0;
                    while (iVar.f19932b < length3) {
                        try {
                            Object[] objArr22 = {iVar};
                            Object objA = o.d.d.a(540069882);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                objA = o.d.d.a(106 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), Drawable.resolveOpacity(0, 0) + 11, -155898465, false, $$g((byte) ($$f + 1), b2, (byte) (b2 - 1)), new Class[]{Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objA).invoke(obj, objArr22)).intValue();
                            Object[] objArr32 = {iVar};
                            Object objA2 = o.d.d.a(2068572);
                            if (objA2 == null) {
                                byte b3 = (byte) 0;
                                objA2 = o.d.d.a((Process.myTid() >> 22) + 847, (char) (6488 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12, -694521287, false, $$g((byte) ($$f - i32), b3, (byte) (b3 - 1)), new Class[]{Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objA2).invoke(obj, objArr32)).intValue();
                            Object[] objArr42 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                            Object objA3 = o.d.d.a(-1122996612);
                            if (objA3 == null) {
                                byte b4 = (byte) 0;
                                objA3 = o.d.d.a(459 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1804962841, false, $$g((byte) $$f, b4, (byte) (b4 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objA3).invoke(null, objArr42);
                            Object[] objArr52 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                            Object objA4 = o.d.d.a(-1223178239);
                            if (objA4 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objA4 = o.d.d.a(Color.argb(0, 0, 0, 0) + 639, (char) (View.MeasureSpec.getMode(0) + 65100), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12, 1636969060, false, $$g(b5, b6, (byte) (b6 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr52)).charValue();
                            cArr3[iIntValue2] = iVar.f19933e;
                            cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r8[iVar.f19932b])) ^ (f26958e ^ 740602047300126166L)) ^ ((long) ((int) (((long) f26959f) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f26962i) ^ 740602047300126166L))));
                            iVar.f19932b++;
                            i32 = 2;
                            obj = null;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    String str7 = new String(cArr5);
                    int i10 = $10 + 35;
                    $11 = i10 % 128;
                    if (i10 % 2 != 0) {
                        objArr7[0] = str7;
                    } else {
                        int i11 = 73 / 0;
                        objArr7[0] = str7;
                    }
                }

                private static void n(int v2, short v3, byte v4, Object[] v5) {
                    /*
                        byte[] r7 = o.x.i.AnonymousClass4.$$d
                        int r0 = r9 * 7
                        int r6 = 11 - r0
                        int r2 = r8 * 7
                        int r1 = 8 - r2
                        int r0 = r10 * 14
                        int r5 = r0 + 97
                        byte[] r4 = new byte[r1]
                        int r3 = 7 - r2
                        r2 = 0
                        if (r7 != 0) goto L2e
                        r0 = r6
                        r1 = r2
                    L17:
                        int r6 = r6 + 1
                        int r5 = r5 + r0
                        int r5 = r5 + (-5)
                    L1c:
                        byte r0 = (byte) r5
                        r4[r1] = r0
                        if (r1 != r3) goto L29
                        java.lang.String r0 = new java.lang.String
                        r0.<init>(r4, r2)
                        r11[r2] = r0
                        return
                    L29:
                        int r1 = r1 + 1
                        r0 = r7[r6]
                        goto L17
                    L2e:
                        r1 = r2
                        goto L1c
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.x.i.AnonymousClass4.n(int, short, byte, java.lang.Object[]):void");
                }

                /* JADX WARN: Removed duplicated region for block: B:119:0x00f3  */
                @Override // o.ca.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void b(o.m.i r30) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 2387
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.x.i.AnonymousClass4.b(o.m.i):void");
                }

                @Override // o.ca.e
                public final void d(o.m.i iVar, o.j.b bVar) throws Throwable {
                    int i22 = 2 % 2;
                    int i32 = f26961h + 33;
                    f26960g = i32 % 128;
                    int i42 = i32 % 2;
                    if (o.ea.f.a()) {
                        int i52 = f26961h + 23;
                        f26960g = i52 % 128;
                        int i62 = i52 % 2;
                        Object[] objArr7 = new Object[1];
                        m((char) (Process.myPid() >> 22), "ࣆจ蹮娘騃丘軋꾹佔﮺裓\udadb\u09b1晳\ue5e2뼔잯ꮵ鮏儣졆锒酦䈗삧忆劦ꥉ줫६鯦鲴拽", "\u0000\u0000\u0000\u0000", "쩓왢̻䍍", 1002857162 - ExpandableListView.getPackedPositionType(0L), objArr7);
                        String strIntern3 = ((String) objArr7[0]).intern();
                        Object[] objArr22 = new Object[1];
                        m((char) (TextUtils.indexOf("", "", 0, 0) + 13781), "乲\uf560盗秸ꌷ妼忡穽㿄놖䛠㊫彧僑ꉮ浇⧁독扟镠㔜\uf112솶槈⮃㻒儤婨ไ\ue82dꀬ怔Ꟁ欂ₖ\ue483ԙ嚵䀠䅔崄뿝펞筐︀놌\ue114ﲸ孀⏈㦤类훋颭얯", "\u0000\u0000\u0000\u0000", "೮\ude16헴張", (-186771956) - View.MeasureSpec.getMode(0), objArr22);
                        o.ea.f.c(strIntern3, ((String) objArr22[0]).intern());
                        int i72 = f26961h + 15;
                        f26960g = i72 % 128;
                        if (i72 % 2 != 0) {
                            int i8 = 4 % 2;
                        }
                    }
                    if (i.this.i() != null) {
                        int i9 = f26960g + 23;
                        f26961h = i9 % 128;
                        int i10 = i9 % 2;
                        i.this.i().onCustomerCredentialsInvalid(bVar);
                    }
                    int i11 = f26961h + 67;
                    f26960g = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 75 / 0;
                    }
                }
            }).ordinal()];
            if (i7 != 1) {
                if (i7 != 2 && i7 != 3) {
                    throw new h(h.d.f26913a);
                }
                if (i() != null) {
                    i().onCustomerCredentialsInvalid(o.j.b.f26287a);
                    return;
                }
                return;
            }
            return;
        }
        if (o.ea.f.a()) {
            int i8 = A + 117;
            f26930y = i8 % 128;
            if (i8 % 2 != 0) {
                Object[] objArr7 = new Object[1];
                M((char) ExpandableListView.getPackedPositionType(0L), 11568 % TextUtils.indexOf((CharSequence) "", 'X', 0, 1), Color.red(1) * 32, objArr7);
                strIntern = ((String) objArr7[0]).intern();
            } else {
                Object[] objArr8 = new Object[1];
                M((char) ExpandableListView.getPackedPositionType(0L), 132 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 60 - Color.red(0), objArr8);
                strIntern = ((String) objArr8[0]).intern();
            }
            o.ea.f.d(strIntern2, strIntern);
            int i9 = 2 % 2;
        }
        throw new h(h.d.f26915c);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x01cc A[Catch: h -> 0x01d4, all -> 0x023d, TryCatch #2 {h -> 0x01d4, blocks: (B:90:0x0073, B:92:0x007d, B:102:0x00ca, B:104:0x00d0, B:117:0x0150, B:119:0x0156, B:120:0x01b6, B:121:0x01bd, B:122:0x01be, B:123:0x01c1, B:107:0x0128, B:109:0x0132, B:112:0x013e, B:97:0x00c1, B:98:0x00c4, B:99:0x00c7, B:126:0x01c4, B:127:0x01cb, B:128:0x01cc, B:129:0x01d3), top: B:144:0x0073, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x007d A[Catch: h -> 0x01d4, all -> 0x023d, TryCatch #2 {h -> 0x01d4, blocks: (B:90:0x0073, B:92:0x007d, B:102:0x00ca, B:104:0x00d0, B:117:0x0150, B:119:0x0156, B:120:0x01b6, B:121:0x01bd, B:122:0x01be, B:123:0x01c1, B:107:0x0128, B:109:0x0132, B:112:0x013e, B:97:0x00c1, B:98:0x00c4, B:99:0x00c7, B:126:0x01c4, B:127:0x01cb, B:128:0x01cc, B:129:0x01d3), top: B:144:0x0073, outer: #4 }] */
    /* JADX WARN: Type inference failed for: r5v3, types: [int, o.x.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void b(android.content.Context r21, o.x.f r22, o.en.b r23) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.x.i.b(android.content.Context, o.x.f, o.en.b):void");
    }

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~i2;
        int i9 = ~i4;
        int i10 = ~(i8 | i9 | i3);
        int i11 = ~i3;
        int i12 = i10 | (~((-1) - (((-1) - (i8 | i11)) & ((-1) - i4))));
        int i13 = (-1) - (((-1) - ((-1) - (((-1) - (~((i3 + i9) - (i3 & i9)))) & ((-1) - i8)))) & ((-1) - (~((-1) - (((-1) - i11) & ((-1) - i4))))));
        int i14 = i2 + i4 + i5 + (1112421973 * i7) + ((-1897213938) * i6);
        int i15 = i14 * i14;
        int i16 = ((1216318437 * i2) - 781189120) + ((-1395624931) * i4) + (i12 * (-1305971684)) + ((-1305971684) * i9) + (1305971684 * i13) + ((-89653248) * i5) + ((-1446510592) * i7) + (892338176 * i6) + ((-1657864192) * i15);
        int i17 = (i2 * 2010092721) + 1217064380 + (i4 * 2010090761) + (i12 * (-980)) + (i9 * (-980)) + (i13 * 980) + (i5 * 2010091741) + (i7 * (-1378896031)) + (i6 * 856652822) + (i15 * 563281920);
        int i18 = i16 + (i17 * i17 * (-1077346304));
        if (i18 == 1) {
            return a(objArr);
        }
        if (i18 != 2) {
            return c(objArr);
        }
        i iVar = (i) objArr[0];
        int i19 = 2 % 2;
        if (iVar.f26936e != null && iVar.f26934c != null && iVar.f26946t != null) {
            int i20 = A;
            int i21 = i20 + 7;
            f26930y = i21 % 128;
            int i22 = i21 % 2;
            if (iVar.f26944r != null) {
                int i23 = i20 + 1;
                int i24 = i23 % 128;
                f26930y = i24;
                int i25 = i23 % 2;
                int i26 = i24 + 33;
                A = i26 % 128;
                int i27 = i26 % 2;
                return true;
            }
        }
        return false;
    }

    private static /* synthetic */ Object c(Object[] objArr) throws Throwable {
        final i iVar = (i) objArr[0];
        Context context = (Context) objArr[1];
        f fVar = (f) objArr[2];
        final c cVar = (c) objArr[3];
        o.en.b bVarC = o.en.b.c();
        if (!bVarC.a()) {
            bVarC.b(context);
        }
        if (!bVarC.s()) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr2 = new Object[1];
            M((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17705), 453 - ((Process.getThreadPriority(0) + 20) >> 6), 6 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            M((char) TextUtils.getOffsetBefore("", 0), View.resolveSize(0, 0) + 459, View.combineMeasuredStates(0, 0) + 42, objArr3);
            throw new WalletValidationException(walletValidationErrorCode, strIntern, ((String) objArr3[0]).intern());
        }
        iVar.a(bVarC);
        synchronized (iVar.f26947u) {
            if (o.ea.f.a()) {
                Object[] objArr4 = new Object[1];
                M((char) (Color.rgb(0, 0, 0) + 16777216), ((Process.getThreadPriority(0) + 20) >> 6) + 76, 33 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr4);
                String strIntern2 = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                M((char) (63549 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 501 - Color.blue(0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 9, objArr5);
                o.ea.f.c(strIntern2, ((String) objArr5[0]).intern());
            }
            if (context == null) {
                WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.Mandatory;
                Object[] objArr6 = new Object[1];
                M((char) (Color.rgb(0, 0, 0) + 16777216), 68 - ((byte) KeyEvent.getModifierMetaStateMask()), 7 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr6);
                throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr6[0]).intern());
            }
            if (fVar == null) {
                WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.Mandatory;
                Object[] objArr7 = new Object[1];
                M((char) TextUtils.indexOf("", ""), 510 - (ViewConfiguration.getWindowTouchSlop() >> 8), View.MeasureSpec.getMode(0) + 36, objArr7);
                throw new WalletValidationException(walletValidationErrorCode3, ((String) objArr7[0]).intern());
            }
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int id = (int) Thread.currentThread().getId();
            int iNextInt = new Random().nextInt();
            if (((Boolean) c(552271142, iFreeMemory, -552271140, id, Thread.activeCount(), iNextInt, new Object[]{iVar})).booleanValue()) {
                throw new WalletValidationException(WalletValidationErrorCode.WrongState, iVar.c());
            }
            if (!iVar.o()) {
                throw new WalletValidationException(WalletValidationErrorCode.WrongState, iVar.c());
            }
            if (iVar.f26942p != null) {
                WalletValidationErrorCode walletValidationErrorCode4 = WalletValidationErrorCode.WrongState;
                Object[] objArr8 = new Object[1];
                M((char) (Color.green(0) + 32528), Color.argb(0, 0, 0, 0) + 546, 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr8);
                throw new WalletValidationException(walletValidationErrorCode4, ((String) objArr8[0]).intern());
            }
            iVar.f26942p = iVar.e(context, fVar, new c.a() { // from class: o.x.i$$ExternalSyntheticLambda0
                @Override // o.x.c.a
                public final void runWithWallet(Context context2, o.en.b bVar) {
                    this.f$0.c(cVar, context2, bVar);
                }
            });
        }
        return null;
    }

    public /* synthetic */ void c(f fVar, Context context, o.en.b bVar) {
        int i2 = 2 % 2;
        int i3 = A + 63;
        f26930y = i3 % 128;
        int i4 = i3 % 2;
        b(context, fVar, bVar);
        int i5 = A + 87;
        f26930y = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void c(c cVar, Context context, o.en.b bVar) {
        synchronized (this.f26947u) {
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                M((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), KeyEvent.getDeadChar(0, 0) + 76, KeyEvent.normalizeMetaState(0) + 33, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                M((char) (1585 - TextUtils.indexOf((CharSequence) "", '0')), KeyEvent.keyCodeFromString("") + 1770, Gravity.getAbsoluteGravity(0, 0) + 25, objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            }
            cVar.execute(context, bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x029b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private o.c.a e(android.content.Context r23, o.x.f r24, o.x.c.a r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.x.i.e(android.content.Context, o.x.f, o.x.c$a):o.c.a");
    }

    private void e(Context context, f fVar, c cVar) throws WalletValidationException {
        int i2 = f26924g * 1214751154;
        f26924g = i2;
        int iNextInt = new Random().nextInt(1643835445);
        int i3 = f26923f * (-1113655905);
        f26923f = i3;
        int i4 = f26926i * 1662107799;
        f26926i = i4;
        c(850699045, i2, -850699045, iNextInt, i4, i3, new Object[]{this, context, fVar, cVar});
    }

    static void f() {
        char[] cArr = new char[1795];
        ByteBuffer.wrap("\u0094\u0093\u0006«°ø\"%ÜAO\u0088ùÜk]\u0005%·n\"úÜüN\u001føJk\u0084\u0005®·ï!\u0016Ó@N\u0088øÝj\u001a\u0094\u0097\u0006©°ý\"'Ü]O\u0084ùÜk!\u0005/·|\"¸ÜÛN\u000føTk\u0095ÉÄ[øí¶\u007fj\u0081\\\u0012Ñ¤\u00856AXqêo\u007fÛ\u0081\u008a\u0013I¥\u00116ÉXúcVñlG4Õô+\u0097¸E\u000e\u0001\u009cÇòÏ@±Õj+\n¹è\u000f\u009b\u009cYòc\u0094±\u0006ª°ò\"#ÜKO\u0099ùÌ\u0094»\u0006«°ò\"2Ü\\O¢ùÍk\u0000\u0005>·r\"¹ÜÊN\u0014øxk\u0085\u0005¿·ê!0ÓBN\u0093ø×j\u0012\u0004)¶w!¿ÓÉM4ÿMj\u0099\u0004ª¶å (Òa\u0094\u0081\u0006 °è\"\u0014Ü[O\u0092ùÌk\u001c\u0005'·x\"¦ÜìN\u0014ø\\k\u0094\u0005®·ì!!ÓEN\u0086øÒj\u0002\u0004`¶*\u0094\u0081\u0006 °è\"\u0014Ü[O\u0092ùÌk\u001c\u0005'·x\"¦ÜìN\u0014ø\\k\u0094\u0005®·ì!!ÓEN\u0086øÒj\u0002\u0004`¶*!úÓ\u0080MDÿOj\u0084\u0004¦¶ã >ÒaM\u0096ÿ\u009ci\u0019\u001b!µu øÒÿL\u000bþHi\u009a\u001b¬µî'<ÑtLËþÍh\u0007\u001al´i'±ÑåCHýUh\u009b\u001a¡´í&;\u0093ü\u0001Ý·\u0095%iÛ&Hïþ±la\u0002Z°\u0005%ÛÛ\u0091Iiÿ!lé\u0002Ó°\u0091&\\Ô8Iûÿ¯m\u007f\u0003\u001d±W&\u0087ÔýJ9ø5mê\u0003Ø±\u0091'CÕ\u001bJ¸ø¯ne\u001cG²\\'×Õ\u009bKyù.nà\u001cÜ²\u009c\u0094\u0081\u0006 °è\"\u0014Ü[O\u0092ùÌk\u001c\u0005'·x\"¦ÜìN\u0014ø\\k\u0094\u0005®·ì!!ÓEN\u0086øÒj\u0002\u0004`¶*!úÓ\u0080MDÿ|j\u009e\u0004¬¶ã 0Ò2M\u008cÿÚiW\u001b-µs ½Ò÷L\u000fþSi\u0080\u001b¦µç'5ÑcLËþËh\u0006\u001al´f'\u00adÑâC\u0007ý@h\u0093\u001a¬´ð&:ÐrCÉýÔo\u0014\u0019\u0012\u008bj&²ÐòBNüLo\u009d\u0019Ç\u008bâ%2×pBÏüÉn\u001f\u0018\u0010\u008a\u007f%ª×ðALóTn\u008a\u0018Ô\u008aøh(ú\tLAÞ½ ò³;\u0005e\u0097µù\u008eKÑÞ\u000f E²½\u0004õ\u0097=ù\u0007KEÝ\u0088/ì²/\u0004{\u0096«øÉJ\u0083ÝS/)±í\u0003Ã\u00961ø\u0005JQÜ\u0082.Þ±/\u0003a\u0095»ç\u0083I\u0088Ü\u001c._°·\u0002ü\u00952ç\u0002I\u000fÛÊ-\u0099\u0094\u0081\u0006 °è\"\u0014Ü[O\u0092ùÌk\u001c\u0005'·x\"¦ÜìN\u0014ø\\k\u0094\u0005®·ì!!ÓEN\u0086øÒj\u0002\u0004`¶*!úÓ\u0080MDÿsj\u0099\u0004¨¶ä \u0018Ò`M\u0080ÿØi\u0012\u001b µu ±ÒòL\u0006þN\u0094\u0095\u0006 °è\"\u0016Ü[O\u0095ùÐk\u0016\u0005$·i\"½ÜÌN\u0007øMk\u0095\u0005¯·Ï!0ÓXN\u008føÑj\u0015\u0004;¶+!óÓ\u008dMIÿ\u001fj¥\u0004½¶å +Ò[M\u008bÿØi\u0012\u001b6µ; øÑ\u008dC\u008cõØg\u0013\u0099c\n½\u0094¥\u0006¤°ð\";ÜKO\u0095ù\u0098k\u001a\u00059·=\"ºÜÀN\u0012ø\u0019k\u0082\u0005¾·ì!;ÓEN\u0089øÙj]\u0004h¶`!µÓÃM\nÿZj\u0095\u0004½¶é 4Ò|MÅÿÎi\u0012\u001b?µt ±ÒáL\u000fþYlªþ\u0080HÄÚ\t$f·¨\u0001à\u0093fý^\u0094±\u0006°°ï\"#ÜAO\u008cùÝk\u0001\u0005\u000b·h\" ÜÇN\u0003øWk\u0084\u0005¢·á!4ÓXN\u0082øÚj!\u0004:¶l!¹ÓÈM\u0017ÿLjµ\u0004¨¶ì 7ÒpM\u0084ÿßi\u001cë¡y Ïÿ]3£Q0\u009c\u0086Í\u0014\u0011z\u001bÈx]°£×1\u0013\u0087G\u0014\u0094z²Èñ^$¬H1\u0092\u0087Ê\u00151{*É|^©¬Ø2\u0007\u0080\\6k¤A\u0012\u0005\u0080È~§íi[!É§§\u009f\u0015Á\u0080\u0005~sìÏZ«Ém§U\u0015\u0012\u0083ÌqðìoZ-È\u00ad¦Ò\u0014\u0096\u0083Hq5ï¸]³Èk¦A\u0014\b\u0082Âp\u009cïw]`Ëü¹Û\u0017\u0089\u0082LpOîø\\ Ëe¹V\u0017@\u0085\u0085\u0094\u0097\u0006½°ù\"4Ü[O\u0095ùÝkS\u0005g·=\"\u009dÜÁN\bø\\k\u0082\u0005\u0088·÷!&ÓXN\u0088øÓj\u0014\u0004:¶B!¯ÓÙM\fÿZj\u0098\u0004½¶é 8ÒsM\u0091ÿÙi\u0013\u001b\u001eµs ·ÒðL\u000fþNi\u0087\u001b\u008aµþ':ÑuL\u009bþÖh\u001c\u001a#´i'þÑ«CHý\u0006h\u0089\u001aí´©&\u007fÐdC\u008cýÃo\u001e\u0019[\u008bs&¹ÐóBNü@o\u009e\u0019Ç\u008bï%/×4B\u0098üÇn\u0015\u0018\\\u008an%¶×µA\u000fóHn\u0090\u0018ß\u008aí$ ÖnA\u0084óËm\u0011\u0094\u0082\u0006·°ó\"4ÜKO\u0084ùÜk#\u00058·r\"·ÜÊN\u0015øJkØ\u0005â\u0094\u0082\u0006·°ó\"4ÜKO\u0084ùÜk#\u00058·r\"·ÜÊN\u0015øJkÐ\u0005æ·¢!%ÓMN\u0095øÍj\u0018\u0004&¶d!úÓÌM\u0011ÿKj\u009e\u0004¬¶î /Ò{M\u0086ÿÝi\u0003\u001b'µn ¶Ò³L\u001eþRi\u009f\u001bªµè'yÑcL\u009fþÃh\u0007\u001a8´t\u0094\u0091\u0006¤°ò\"9ÜAO\u0095ù\u0098k\u0010\u0005%·s\"§ÜÛN\u0014øLk\u0093\u0005¿·¢!4ÓYN\u0093øÖj\u0014\u0004&¶w!³ÓÎM\u0005ÿKj\u009f\u0004¦¶î {Ò\u007fM\u0080ÿÈi\u001f\u001b!µe «Ò³L\fþOi\u009b\u001b¢µ¦'8ÑeL\u009fþÊh\u0010\u001a\"´s'·ÑòC\týWh\u0093\u001a¢´ê&\u007fÐbC\u0086ýËo\u001e\u0019\\\u009dO\u000fz¹>+ùÕ\u0086FIð\u0011bî\fõ¾¿+zÕ\u0007GØñ\u0087b\u001d\f+¾o(öÚ\u008eG]ñScÎ\rð¿ (yÚ\tDÇö\u0095c\u001b\rt¿?)ùÛ¼DMö\u0002`É\u0012£¼»)|Û*EÏ÷Ð`X\u0012w¼?.üØ¸EH÷\u001baÑ\u0013â½«.gØ5JÊô\u0080a\u0017\u0013t½&/ùÙ¾JJ\u0094\u0082\u0006·°ó\"4ÜKO\u0084ùÜk#\u00058·r\"·ÜÊN\u0015øJkÐ\u0005æ·¢!4ÓYN\u0093øÖj\u0014\u0004&¶w!³ÓÎM\u0005ÿKj\u009f\u0004¦¶î {ÒqM\u008aÿÑi\u0007\u001b\"µd ¬ÒöL\u000e\u0094\u0082\u0006·°ó\"4ÜKO\u0084ùÜk#\u00058·r\"·ÜÊN\u0015øJkÐ\u0005æ·¢!4ÓBNÇøßj\u0004\u0004<¶k!¿ÓÃM\u0010ÿVj\u0095\u0004¨¶ô 2Ò}M\u008bÿ\u009ci\u0005\u001b+µt «ÒöLJþXi\u008c\u001b¿µï'+ÑuL\u008fþ\u0082h\u0011\u001a9´u'·ÑÿC\u000fý\u0003h\u008a\u001a¿´ë&<ÐsC\u009aýÓo[\u0019\u001f\u008b%&®ÐøB\u0002üMo\u0091\u0019Ý\u008bí%}×vB\u008eüÅn\u0012\u0018\u0010\u008aj%·×áA\u0004óBn\u0090\u0018Å\u008aá$ Ö{A\u0099óÍm\u0010\u001fX\u0089)$¦Öé@=òHmÜ\u001fÃ\u0089æ;$Õ8@²òÙl\u000e\u001e[\u0088l;¯ÕøG$ñNl\u0086\u001e\u0095\u0088ÿ:3Ô{G¡\u0094\u0082\u0006·°ó\"4ÜKO\u0084ùÜk#\u00058·r\"·ÜÊN\u0015øJkÐ\u0005æ·¢!4ÓYN\u0093øÖj\u0014\u0004&¶w!³ÓÎM\u0005ÿKj\u009f\u0004¦¶î {Ò\u007fM\u0090ÿÏi\u0003\u001bnµc ½Ò³L\tþUi\u0091\u001b¬µí'<ÑtLËþÍh\u001b\u001a ´n'°ÑôCHýTh\u0093\u001a¹´ì&\u007fÐuC\u0081ýÅo\u0018\u0019Y\u008bF&®ÐòB\nüDo\u0096\u0019Ç\u008bã%<×xB\u009c7Q¥d\u0013 \u0081ç\u007f\u0098ìWZ\u000fÈð¦ë\u0014¡\u0081d\u007f\u0019íÆ[\u0099È\u0003¦5\u0014q\u0082èp\u0090íC[MÉÐ§î\u0015¾\u0082gp\u0017îÙ\\\u008bÉ\u0005§j\u0015!\u0083çq¢îS\\\u001cÊ×úËhþÞºL}²\u0002!Í\u0097\u0095\u0005jkqÙ;Lþ²\u0083 \\\u0096\u0003\u0005\u0091k«ÙëO1½E ã\u0096\u0092\u0004LjiØ%O÷½°#T\u0091\u0006\u0004Új¨\fï\u009e\u0084(\u00818 *\u001a¸/\u000ek\u009c¬bÓñ\u001cGDÕ»» \tê\u009c/bRð\u008dFÒÕH»~\t:\u009f mÑð\u000bFNÔ\u0086º´\b»\u009fgmFóÜAÎÔ\u001dºq\b{\u009e¬läó\u000eAM×\u008b¥³\u000bë\u009e%loòÒ@Ã×\u0003¥%\u000b>\u0099²oüò\u0016@J\u0094\u0082\u0006·°ó\"4ÜKO\u0084ùÜk#\u00058·r\"·ÜÊN\u0015øJkÐ\u0005æ·¢!\u001bÓCN\u0089øÛjQ\u0004!¶p!úÓÝM\u0005ÿMj\u0082\u0004é¶ï =Ò2M\u0091ÿÔi\u0012\u001bnµr ¬ÒöL\u001aþ\u001diÎ\u001bïµõ'-ÑuL\u009bþ\u0082h\u0016\u001a-´i'þÑóC\rý\u0003h\u0089\u001a¦´í&/ÐfC\u008cýÄ=c¯V\u0019\u0012\u008bÕuªæeP=ÂÂ¬Ù\u001e\u0093\u008bVu+çôQ«Â1¬\u0007\u001eC\u0088çz®çtQ:Ãõ\u00adÇ\u001fÂ\u0088nz\"äéV±Ãt\u00adC\u001fA\u0089Ó{\u0080ä$V-À÷²Ý\u001c\u0094\u0089\u0019{\u001dåíWüÀa²F\u001c\u0002\u008e\u0098x\u0082å~W&Áä³\u008d\u001d\u0087\u008eQx\u0014ê©T«Áo³\f\u001d\f\u008fÍy×êiT-Æè°¶\"\u0085\u008fYy\u000fë¯U¡Æl°&\"\u0003\u008cÙ~\u009bëzU.Çû±°#\u009e\u008cF~\u0010è\u00adZüÇ?±##\u001d\u008dÇ\u007f\u008bè,Z&Äÿ¶¹ È\u008dC\u007f\u001fé\u0093[·Äv¶? \u001f\u0092Ð|\u009céV\u0094\u0082\u0006·°ó\"4ÜKO\u0084ùÜk#\u00058·r\"·ÜÊN\u0015øJkÐ\u0005æ·¢!8ÓIN\u0093øÖj\u001e\u0004,¶#!ÿÓÞMDÿVj\u0085\u0004é¶á 7Ò`M\u0080ÿÝi\u0013\u001b7µ! ¹ÒæL\u001eþUi\u0091\u001b¡µò'0ÑsL\u008aþÖh\u0010\u001a(´''äÑ±C\u001býWh\u009f\u001a½´¤&<ÐwC\u0087ý\u0080o\u0019\u0019W\u008b%&¯ÐüB\u0007üQo\u0088\u0019Ö\u008bî%$·\u0011\u0001U\u0093\u0092míþ\"HzÚ\u0085´\u009e\u0006Ô\u0093\u0011mlÿ³IìÚv´@\u0006\u0004\u0090\u0081bïÿ4IkÛ¾µ\u0080\u0007Â\u0090\\b{ü°NüÛ&µ\u0006\u0007I\u0091\u0088cÇücN{Ø¤ª\u009c\u0004Ï\u0091\u001bc[ý¸OòØ1ª\b\u0004T\u0096\u0096`Ùý#O$Ù¼«\u008c\u0005\u0081\u0096\u0015`RòºLíÙ3«\u000f\u0005\u0002\u0097ÜaÃòoL<Þý¨ç:×\u0097\u001faAóèMäÞ?¨{:\f\u0094\u0099f×óiMsß´©ÿ;Ý\u0094\u0014fVð®IUÛ`m$ÿã\u0001\u009c\u0092S$\u000b¶ôØïj¥ÿ`\u0001\u001d\u0093Â%\u009d¶\u000fØ5juü¯\u000eÛ\u0093e%\u0007·ÇÙýk¸üh\u000eZ\u0090Ç\"\u0087·\u0001Ùxk>ýâ\u000f¡\u0090\u0012\"\u0018´ÕÆðh¢ýn\u000f&\u0091Ñ#\u008f´\u0003Æ{h#úë\f£\u0091Y#\u001bµÖÇòi±úe\f5â\u0019p,ÆhT¯ªÐ9\u001f\u008fG\u001d¸s£ÁéT,ªQ8\u008e\u008eÑ\u001dCsyÁ9Wã¥\u00978/\u008eN\u001c\u0083r£ÀèW(¥X;\u0098\u0089\u0084\u001c\u001er&À~V°«\u008e9\u009e\u008fÇ\u001d\u0007ãip\u0097ÆøT5:\u000b\u0088G\u001d\u008cãÿq!ÇMT°:\u008a\u0088ß\u001e\u0005ìwq¦ÇâU';\u001c\u0089B\u001e\u008aìür\u0001ÀxU¬;\u009f\u0089Ð\u001f\u001díTr«ÀüV1$\u001a\u008aS\u001f\u0088í\u009bÅxWCáJs\u0090\u008dü\u001e3¨{:§T\u0082æõs\u0013\u008dd\u001f¥©¢:q\u0094Þ\u0006å°ý\"\"ÜZO\u0089ùÝk\u001d\u0005>·t\"·ÜÎN\u0012ø\\k\u0094\u0005\u0086·ç!!ÓDN\u0088øÚj\u0002\u0004u\u0094Þ\u0006å°ì\"6ÜZO\u0095ùÝk\u0001\u0005$· ã\u009eq¥Ç¯Uc«\u000b8Ñ\u008e±\u001c]rnÀ8Uì«Ò\u0092¬\u0000\u0096¶Û$\u000bÚ\u007fI»ÿªml\u0003F±\u000f$\u0094ÚèH:þ\\m«\u0003\u008d±Ø'0Õ\u007fH¹þàl&\u0002\u000e°\u0019'Á".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1795);
        f26928v = cArr;
        f26929w = 1402874548949354181L;
    }

    static void init$0() {
        $$a = new byte[]{68, -115, MessagePack.Code.BIN16, -123};
        $$b = 38;
    }

    static void init$1() {
        $$g = new byte[]{8, -110, 120, 122, MessagePack.Code.BIN16, 59, 10, MessagePack.Code.UINT16, 57};
        $$h = 187;
    }

    static void init$2() {
        $$c = new byte[]{5, Ascii.SO, 124, -17};
        $$f = 204;
    }

    private boolean k() {
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int id = (int) Thread.currentThread().getId();
        int iNextInt = new Random().nextInt();
        return ((Boolean) c(552271142, iFreeMemory, -552271140, id, Thread.activeCount(), iNextInt, new Object[]{this})).booleanValue();
    }

    private o.m.f m() {
        int i2 = 2 % 2;
        int i3 = A + 83;
        f26930y = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f26940n;
        }
        throw null;
    }

    private CredentialsLoader n() {
        int i2 = 2 % 2;
        if (this.f26938l == null) {
            int i3 = A + 45;
            f26930y = i3 % 128;
            int i4 = i3 % 2;
            this.f26938l = (CredentialsLoader) j();
        }
        CredentialsLoader credentialsloader = this.f26938l;
        int i5 = A + 83;
        f26930y = i5 % 128;
        int i6 = i5 % 2;
        return credentialsloader;
    }

    private boolean o() {
        int i2 = 2 % 2;
        int i3 = f26930y + 61;
        A = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.f26948x;
        if (i4 == 0) {
            int i5 = 12 / 0;
        }
        return z2;
    }

    public final void a() {
        int i2 = 2 % 2;
        int i3 = f26930y + 9;
        int i4 = i3 % 128;
        A = i4;
        int i5 = i3 % 2;
        this.f26948x = false;
        int i6 = i4 + 37;
        f26930y = i6 % 128;
        int i7 = i6 % 2;
    }

    protected abstract void a(o.en.b bVar) throws WalletValidationException;

    protected abstract int b();

    public final void b(Context context, final f fVar) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = A + 1;
        f26930y = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this, context, fVar, new c() { // from class: o.x.i$$ExternalSyntheticLambda1
            @Override // o.x.i.c
            public final void execute(Context context2, o.en.b bVar) {
                this.f$0.c(fVar, context2, bVar);
            }
        }};
        int i5 = f26924g * 1214751154;
        f26924g = i5;
        int iNextInt = new Random().nextInt(1643835445);
        int i6 = f26923f * (-1113655905);
        f26923f = i6;
        int i7 = f26926i * 1662107799;
        f26926i = i7;
        c(850699045, i5, -850699045, iNextInt, i7, i6, objArr);
        int i8 = A + 117;
        f26930y = i8 % 128;
        int i9 = i8 % 2;
    }

    protected abstract String c();

    /* JADX WARN: Removed duplicated region for block: B:248:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void c(android.content.Context r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.x.i.c(android.content.Context):void");
    }

    protected abstract void c(Context context, o.en.b bVar, o.i.d dVar);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<o.m.i> d() throws java.lang.Throwable {
        /*
            r9 = this;
            r8 = 2
            int r0 = r8 % r8
            int r0 = o.x.i.f26930y
            int r1 = r0 + 19
            int r0 = r1 % 128
            o.x.i.A = r0
            int r1 = r1 % r8
            r7 = 0
            if (r1 != 0) goto L83
            boolean r1 = o.ea.f.a()
            r0 = 15
            int r0 = r0 / r7
            if (r1 == 0) goto L80
        L18:
            int r0 = android.view.ViewConfiguration.getWindowTouchSlop()
            int r0 = r0 >> 8
            char r3 = (char) r0
            float r1 = android.view.ViewConfiguration.getScrollFriction()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            int r2 = 77 - r0
            int r0 = android.view.ViewConfiguration.getScrollBarSize()
            int r0 = r0 >> 8
            int r1 = 33 - r0
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            M(r3, r2, r1, r0)
            r0 = r0[r7]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r4 = r0.intern()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = ""
            int r0 = android.os.Process.getGidForName(r1)
            int r0 = r0 + r6
            char r3 = (char) r0
            int r0 = android.text.TextUtils.getTrimmedLength(r1)
            int r2 = r0 + 414
            r0 = 0
            int r0 = android.widget.ExpandableListView.getPackedPositionGroup(r0)
            int r1 = r0 + 39
            java.lang.Object[] r0 = new java.lang.Object[r6]
            M(r3, r2, r1, r0)
            r0 = r0[r7]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.StringBuilder r1 = r5.append(r0)
            java.lang.Integer r0 = r9.f26944r
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            o.ea.f.c(r4, r0)
            int r0 = o.x.i.A
            int r1 = r0 + 121
            int r0 = r1 % 128
            o.x.i.f26930y = r0
            int r1 = r1 % r8
        L80:
            java.util.List<o.m.i> r0 = r9.f26932a
            return r0
        L83:
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto L80
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.x.i.d():java.util.List");
    }

    public final void e() {
        int i2 = 2 % 2;
        int i3 = A + 17;
        f26930y = i3 % 128;
        if (i3 % 2 != 0) {
            this.f26944r = null;
            this.f26942p = null;
            this.f26932a.clear();
            this.f26933b.e();
            this.f26948x = false;
            this.f26935d = true;
        } else {
            this.f26944r = null;
            this.f26942p = null;
            this.f26932a.clear();
            this.f26933b.e();
            this.f26948x = true;
            this.f26935d = false;
        }
        int i4 = f26930y + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        A = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void e(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int i2 = 2 % 2;
        new o.bz.b();
        o.g.a aVarD = o.bz.b.d(customerAuthenticationCredentials);
        if (context == null) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Mandatory;
            Object[] objArr = new Object[1];
            M((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 69 - TextUtils.getTrimmedLength(""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6, objArr);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
        }
        try {
            b(context, aVarD);
            int i3 = A + 1;
            f26930y = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 40 / 0;
            }
        } catch (h e2) {
            throw e2.b(c());
        }
    }

    public final String g() {
        int i2 = 2 % 2;
        int i3 = f26930y;
        int i4 = i3 + 89;
        A = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f26941o;
        int i6 = i3 + 91;
        A = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final boolean h() {
        int i2 = 601961010 * f26925h;
        f26925h = i2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int iNextInt = new Random().nextInt(1592817291);
        int i3 = f26927j * 826423998;
        f26927j = i3;
        return ((Boolean) c(-571425008, i2, 571425009, iFreeMemory, i3, iNextInt, new Object[]{this})).booleanValue();
    }

    public final f i() {
        int i2 = 2 % 2;
        int i3 = f26930y;
        int i4 = i3 + 123;
        A = i4 % 128;
        int i5 = i4 % 2;
        f fVar = this.f26934c;
        int i6 = i3 + 115;
        A = i6 % 128;
        int i7 = i6 % 2;
        return fVar;
    }

    protected abstract CredentialsLoader j();

    public final String toString() throws Throwable {
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        M((char) (Color.green(0) + 16181), Color.argb(0, 0, 0, 0) + 1670, 39 - MotionEvent.axisFromString(""), objArr);
        StringBuilder sbAppend = sb.append(((String) objArr[0]).intern()).append(this.f26940n);
        Object[] objArr2 = new Object[1];
        M((char) (20902 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1709, 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
        StringBuilder sbAppend2 = sbAppend.append(((String) objArr2[0]).intern()).append(this.f26941o).append('\'');
        Object[] objArr3 = new Object[1];
        M((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 1725 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 24, objArr3);
        StringBuilder sbAppend3 = sbAppend2.append(((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        M((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 38973), 1208 - View.getDefaultSize(0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3, objArr4);
        StringBuilder sbAppend4 = sbAppend3.append(m.e(((String) objArr4[0]).intern(), this.f26932a.iterator()));
        Object[] objArr5 = new Object[1];
        M((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1748 - Color.blue(0), ((Process.getThreadPriority(0) + 20) >> 6) + 10, objArr5);
        StringBuilder sbAppend5 = sbAppend4.append(((String) objArr5[0]).intern()).append(this.f26946t);
        Object[] objArr6 = new Object[1];
        M((char) (30528 - KeyEvent.normalizeMetaState(0)), (KeyEvent.getMaxKeyCode() >> 16) + 1758, 12 - TextUtils.indexOf("", "", 0, 0), objArr6);
        String string = sbAppend5.append(((String) objArr6[0]).intern()).append(this.f26944r).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f26930y + 77;
        A = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }
}
