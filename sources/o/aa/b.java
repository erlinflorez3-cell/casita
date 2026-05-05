package o.aa;

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
import androidx.core.view.ViewCompat;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.card.CardStatus;
import fr.antelop.sdk.digitalcard.DigitalCard;
import fr.antelop.sdk.digitalcard.DigitalCardServiceStatus;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.a.i;
import o.a.j;
import o.a.n;
import o.a.q;
import o.ae.d;
import o.af.b;
import o.ag.b;
import o.ah.e;
import o.bg.c;
import o.ea.f;
import o.er.k;
import o.er.m;
import o.er.o;
import org.msgpack.core.MessagePack;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: i */
    public static int f19958i = 0;

    /* JADX INFO: renamed from: j */
    public static int f19959j = 0;

    /* JADX INFO: renamed from: k */
    private static char[] f19960k = null;

    /* JADX INFO: renamed from: l */
    public static int f19961l = 0;

    /* JADX INFO: renamed from: o */
    private static b f19962o = null;

    /* JADX INFO: renamed from: p */
    private static long f19963p = 0;

    /* JADX INFO: renamed from: q */
    private static char f19964q = 0;

    /* JADX INFO: renamed from: r */
    private static int f19965r = 0;

    /* JADX INFO: renamed from: s */
    private static char[] f19966s = null;

    /* JADX INFO: renamed from: t */
    private static int f19967t = 0;

    /* JADX INFO: renamed from: v */
    private static int f19968v = 0;

    /* JADX INFO: renamed from: x */
    private static int f19969x = 0;

    /* JADX INFO: renamed from: a */
    List<o> f19970a;

    /* JADX INFO: renamed from: b */
    Long f19971b;

    /* JADX INFO: renamed from: d */
    k f19973d;

    /* JADX INFO: renamed from: h */
    e f19977h;

    /* JADX INFO: renamed from: n */
    private final Context f19979n;

    /* JADX INFO: renamed from: c */
    final Object f19972c = new Object();

    /* JADX INFO: renamed from: e */
    final Object f19974e = new Object();

    /* JADX INFO: renamed from: g */
    final List<OperationCallback<k>> f19976g = new ArrayList();

    /* JADX INFO: renamed from: f */
    final List<OperationCallback<List<o>>> f19975f = new ArrayList();

    /* JADX INFO: renamed from: m */
    private final e.InterfaceC0329e f19978m = new e.InterfaceC0329e() { // from class: o.aa.b.1
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static char[] f19980a = null;

        /* JADX INFO: renamed from: c */
        private static int f19981c = 0;

        /* JADX INFO: renamed from: d */
        private static char f19982d = 0;

        /* JADX INFO: renamed from: e */
        private static int f19983e = 0;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0014). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(int r9, short r10, short r11) {
            /*
                int r8 = 111 - r10
                byte[] r7 = o.aa.b.AnonymousClass1.$$c
                int r0 = r9 * 2
                int r6 = r0 + 4
                int r0 = r11 * 3
                int r5 = 1 - r0
                byte[] r4 = new byte[r5]
                r3 = 0
                if (r7 != 0) goto L28
                r0 = r8
                r2 = r3
                r8 = r6
            L14:
                int r6 = r6 + 1
                int r8 = r8 + r0
                r1 = r2
            L18:
                int r2 = r1 + 1
                byte r0 = (byte) r8
                r4[r1] = r0
                if (r2 != r5) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L25:
                r0 = r7[r6]
                goto L14
            L28:
                r1 = r3
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass1.$$e(int, short, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            f19983e = 0;
            f19981c = 1;
            f19980a = new char[]{51645, 64611, 64612, 64577, 64592, 64616, 64593, 64576, 64586, 64580, 64578, 64535, 51644, 64583, 64582, 64599, 64621, 64543, 64614, 64587, 64584, 64598, 64520, 64588, 64597, 64630, 64629, 64609, 64517, 64589, 64604, 51646, 64625, 64590, 64585, 64610};
            f19982d = (char) 51641;
        }

        AnonymousClass1() {
        }

        public static void e(Context context, long j2, long j3) throws Throwable {
            int i2 = 2 % 2;
            long j4 = j2 ^ (j3 << 32);
            int i3 = f19983e + 27;
            int i4 = i3 % 128;
            f19981c = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 83;
            f19983e = i6 % 128;
            int i7 = i6 % 2;
            try {
                Method method = f.class.getMethod("a", null);
                method.setAccessible(true);
                if (((Boolean) method.invoke(null, null)).booleanValue()) {
                    Object[] objArr = new Object[1];
                    f(13 - TextUtils.indexOf("", "", 0, 0), "\u000e\n\t \u0019\t\u0007\b\f\b\u0014\u000b㘱", (byte) (61 - Color.alpha(0)), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    Object[] objArr2 = new Object[1];
                    f(29 - View.MeasureSpec.getMode(0), "\u0015\u000f\u0012\u001b\u000e\n\t \u0019\t\u0007\b\f\b\t\u0001\"\u001c\u001d\u0018㗶㗶\u001e\u0015\t\u0002\u000b\r㖻", (byte) ((-16777215) - Color.rgb(0, 0, 0)), objArr2);
                    Object[] objArr3 = {((String) objArr2[0]).intern()};
                    Object[] objArr4 = new Object[1];
                    f((-16777210) - Color.rgb(0, 0, 0), "\u0006\u001b\u0019\u0006\u0015\u0001", (byte) (31 - KeyEvent.keyCodeFromString("")), objArr4);
                    Method method2 = StringBuilder.class.getMethod(((String) objArr4[0]).intern(), String.class);
                    method2.setAccessible(true);
                    Object objInvoke = method2.invoke(objNewInstance, objArr3);
                    Object[] objArr5 = {Long.valueOf(j4)};
                    Object[] objArr6 = new Object[1];
                    f('6' - AndroidCharacter.getMirror('0'), "\u0006\u001b\u0019\u0006\u0015\u0001", (byte) (View.resolveSizeAndState(0, 0, 0) + 31), objArr6);
                    Method method3 = StringBuilder.class.getMethod(((String) objArr6[0]).intern(), Long.TYPE);
                    method3.setAccessible(true);
                    Object objInvoke2 = method3.invoke(objInvoke, objArr5);
                    Object[] objArr7 = new Object[1];
                    f(View.combineMeasuredStates(0, 0) + 8, "\u0007\t\u0018\u0007\u0011\u0015\u0016\u0007", (byte) (44 - TextUtils.lastIndexOf("", '0')), objArr7);
                    Method method4 = StringBuilder.class.getMethod(((String) objArr7[0]).intern(), null);
                    method4.setAccessible(true);
                    Object[] objArr8 = {strIntern, method4.invoke(objInvoke2, null)};
                    Method method5 = f.class.getMethod("c", String.class, Object.class);
                    method5.setAccessible(true);
                    method5.invoke(null, objArr8);
                }
                byte b2 = (byte) 0;
                byte b3 = b2;
                byte b4 = (byte) (b3 - 1);
                Object[] objArr9 = new Object[1];
                g(b2, b3, b4, objArr9);
                Class<?> cls = Class.forName((String) objArr9[0]);
                byte b5 = (byte) 1;
                byte b6 = b5;
                byte[] bArr = $$a;
                Object[] objArr10 = new Object[1];
                g(b5, b6, bArr[3], objArr10);
                Method method6 = cls.getMethod((String) objArr10[0], null);
                method6.setAccessible(true);
                Object objInvoke3 = method6.invoke(null, null);
                Object[] objArr11 = new Object[1];
                g(b2, b3, b4, objArr11);
                Class.forName((String) objArr11[0]).getField("d").setInt(objInvoke3, (int) j4);
                Object[] objArr12 = new Object[1];
                g(b2, b3, b4, objArr12);
                Class<?> cls2 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                g(b5, b6, bArr[3], objArr13);
                Method method7 = cls2.getMethod((String) objArr13[0], null);
                method7.setAccessible(true);
                Object objInvoke4 = method7.invoke(null, null);
                Object[] objArr14 = new Object[1];
                g(b2, b3, b4, objArr14);
                Class.forName((String) objArr14[0]).getField("b").setBoolean(objInvoke4, true);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:132:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x01f0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void f(int r29, java.lang.String r30, byte r31, java.lang.Object[] r32) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1054
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass1.f(int, java.lang.String, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x002d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002d -> B:17:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void g(byte r8, byte r9, byte r10, java.lang.Object[] r11) {
            /*
                int r0 = r8 * 14
                int r8 = 111 - r0
                int r2 = r9 * 5
                int r1 = 6 - r2
                int r0 = r10 + 4
                byte[] r7 = o.aa.b.AnonymousClass1.$$a
                byte[] r6 = new byte[r1]
                int r5 = 5 - r2
                r4 = 0
                if (r7 != 0) goto L30
                r8 = r5
                r1 = r0
                r3 = r4
            L16:
                int r0 = -r0
                int r8 = r8 + r0
                int r8 = r8 + (-7)
                r0 = r1
                r2 = r3
            L1c:
                byte r1 = (byte) r8
                r6[r2] = r1
                int r1 = r0 + 1
                int r3 = r2 + 1
                if (r2 != r5) goto L2d
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r4)
                r11[r4] = r0
                return
            L2d:
                r0 = r7[r1]
                goto L16
            L30:
                r2 = r4
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass1.g(byte, byte, byte, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{84, 109, 90, 4, 58, MessagePack.Code.BIN16, -21, 59, MessagePack.Code.BIN16};
            $$b = 206;
        }

        static void init$1() {
            $$c = new byte[]{57, MessagePack.Code.BIN8, -70, 1};
            $$d = 6;
        }

        @Override // o.ah.e.InterfaceC0329e
        public final void a(c cVar) throws Throwable {
            if (f.a()) {
                Object[] objArr = new Object[1];
                f(18 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0016\u001e\u0014\u0011\"!\u000e \u0006!\u0003\u000b\u0015\u0007\u000b\b㙈", (byte) (MotionEvent.axisFromString("") + 97), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f(54 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u0006\u001a\t\r\n\u0007\u0014\u000b\u0017\u001f\b\u0007\u0015\u0006㘊㘊\u000f\u0007\u000f \"\u001c\u001a\n\u0014\u0013\b\u001d\u001f\u000b\f\u0018\u0003\u0016\u0007\t\u0013\b\u000e\u0003\u0015\u0001\u0015\u0006\u0015\t\u0013\u0003\u000b\u0015\u0004\n\r\t", (byte) (Color.rgb(0, 0, 0) + 16777236), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            AntelopError antelopErrorA = o.by.c.b(cVar).a();
            synchronized (b.this.f19974e) {
                Iterator<OperationCallback<k>> it = b.this.f19976g.iterator();
                while (it.hasNext()) {
                    it.next().onError(antelopErrorA);
                }
                b.this.f19976g.clear();
                Iterator<OperationCallback<List<o>>> it2 = b.this.f19975f.iterator();
                while (it2.hasNext()) {
                    it2.next().onError(antelopErrorA);
                }
                b.this.f19975f.clear();
                b.this.f19977h = null;
            }
        }

        @Override // o.ah.e.InterfaceC0329e
        public final void a(k kVar, List<o> list) throws Throwable {
            if (f.a()) {
                Object[] objArr = new Object[1];
                f(17 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u0016\u001e\u0014\u0011\"!\u000e \u0006!\u0003\u000b\u0015\u0007\u000b\b㙈", (byte) (96 - View.MeasureSpec.getSize(0)), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f(54 - View.getDefaultSize(0, 0), "\u0006\u001a\t\r\n\u0007\u0014\u000b\u0017\u001f\b\u0007\u0015\u0006㙈㙈\u000f\u0007\u000f \"\u001c\u001a\n\u0014\u0013\b\u001d\u001f\u000b\f\u0018\u0003\u0016\u0007\t\u0013\b\u000e\u0003\u0015\u0001\u0015\u0006\u0015\t\u0013\u001b\u0002\u0010\r\b㘻㘻", (byte) (82 - Color.red(0)), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            b.this.a(kVar, list, Long.valueOf(System.currentTimeMillis()));
            synchronized (b.this.f19974e) {
                Iterator<OperationCallback<k>> it = b.this.f19976g.iterator();
                while (it.hasNext()) {
                    it.next().onSuccess(kVar);
                }
                b.this.f19976g.clear();
                Iterator<OperationCallback<List<o>>> it2 = b.this.f19975f.iterator();
                while (it2.hasNext()) {
                    it2.next().onSuccess(list);
                }
                b.this.f19975f.clear();
                b.this.f19977h = null;
            }
        }
    };

    /* JADX INFO: renamed from: o.aa.b$1 */
    public class AnonymousClass1 implements e.InterfaceC0329e {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static char[] f19980a = null;

        /* JADX INFO: renamed from: c */
        private static int f19981c = 0;

        /* JADX INFO: renamed from: d */
        private static char f19982d = 0;

        /* JADX INFO: renamed from: e */
        private static int f19983e = 0;

        private static String $$e(int v2, short v3, short v4) {
            /*
                int r8 = 111 - r10
                byte[] r7 = o.aa.b.AnonymousClass1.$$c
                int r0 = r9 * 2
                int r6 = r0 + 4
                int r0 = r11 * 3
                int r5 = 1 - r0
                byte[] r4 = new byte[r5]
                r3 = 0
                if (r7 != 0) goto L28
                r0 = r8
                r2 = r3
                r8 = r6
            L14:
                int r6 = r6 + 1
                int r8 = r8 + r0
                r1 = r2
            L18:
                int r2 = r1 + 1
                byte r0 = (byte) r8
                r4[r1] = r0
                if (r2 != r5) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L25:
                r0 = r7[r6]
                goto L14
            L28:
                r1 = r3
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass1.$$e(int, short, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            f19983e = 0;
            f19981c = 1;
            f19980a = new char[]{51645, 64611, 64612, 64577, 64592, 64616, 64593, 64576, 64586, 64580, 64578, 64535, 51644, 64583, 64582, 64599, 64621, 64543, 64614, 64587, 64584, 64598, 64520, 64588, 64597, 64630, 64629, 64609, 64517, 64589, 64604, 51646, 64625, 64590, 64585, 64610};
            f19982d = (char) 51641;
        }

        AnonymousClass1() {
        }

        public static void e(Context context, long j2, long j3) throws Throwable {
            int i2 = 2 % 2;
            long j4 = j2 ^ (j3 << 32);
            int i3 = f19983e + 27;
            int i4 = i3 % 128;
            f19981c = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 83;
            f19983e = i6 % 128;
            int i7 = i6 % 2;
            try {
                Method method = f.class.getMethod("a", null);
                method.setAccessible(true);
                if (((Boolean) method.invoke(null, null)).booleanValue()) {
                    Object[] objArr = new Object[1];
                    f(13 - TextUtils.indexOf("", "", 0, 0), "\u000e\n\t \u0019\t\u0007\b\f\b\u0014\u000b㘱", (byte) (61 - Color.alpha(0)), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    Object[] objArr2 = new Object[1];
                    f(29 - View.MeasureSpec.getMode(0), "\u0015\u000f\u0012\u001b\u000e\n\t \u0019\t\u0007\b\f\b\t\u0001\"\u001c\u001d\u0018㗶㗶\u001e\u0015\t\u0002\u000b\r㖻", (byte) ((-16777215) - Color.rgb(0, 0, 0)), objArr2);
                    Object[] objArr3 = {((String) objArr2[0]).intern()};
                    Object[] objArr4 = new Object[1];
                    f((-16777210) - Color.rgb(0, 0, 0), "\u0006\u001b\u0019\u0006\u0015\u0001", (byte) (31 - KeyEvent.keyCodeFromString("")), objArr4);
                    Method method2 = StringBuilder.class.getMethod(((String) objArr4[0]).intern(), String.class);
                    method2.setAccessible(true);
                    Object objInvoke = method2.invoke(objNewInstance, objArr3);
                    Object[] objArr5 = {Long.valueOf(j4)};
                    Object[] objArr6 = new Object[1];
                    f('6' - AndroidCharacter.getMirror('0'), "\u0006\u001b\u0019\u0006\u0015\u0001", (byte) (View.resolveSizeAndState(0, 0, 0) + 31), objArr6);
                    Method method3 = StringBuilder.class.getMethod(((String) objArr6[0]).intern(), Long.TYPE);
                    method3.setAccessible(true);
                    Object objInvoke2 = method3.invoke(objInvoke, objArr5);
                    Object[] objArr7 = new Object[1];
                    f(View.combineMeasuredStates(0, 0) + 8, "\u0007\t\u0018\u0007\u0011\u0015\u0016\u0007", (byte) (44 - TextUtils.lastIndexOf("", '0')), objArr7);
                    Method method4 = StringBuilder.class.getMethod(((String) objArr7[0]).intern(), null);
                    method4.setAccessible(true);
                    Object[] objArr8 = {strIntern, method4.invoke(objInvoke2, null)};
                    Method method5 = f.class.getMethod("c", String.class, Object.class);
                    method5.setAccessible(true);
                    method5.invoke(null, objArr8);
                }
                byte b2 = (byte) 0;
                byte b3 = b2;
                byte b4 = (byte) (b3 - 1);
                Object[] objArr9 = new Object[1];
                g(b2, b3, b4, objArr9);
                Class<?> cls = Class.forName((String) objArr9[0]);
                byte b5 = (byte) 1;
                byte b6 = b5;
                byte[] bArr = $$a;
                Object[] objArr10 = new Object[1];
                g(b5, b6, bArr[3], objArr10);
                Method method6 = cls.getMethod((String) objArr10[0], null);
                method6.setAccessible(true);
                Object objInvoke3 = method6.invoke(null, null);
                Object[] objArr11 = new Object[1];
                g(b2, b3, b4, objArr11);
                Class.forName((String) objArr11[0]).getField("d").setInt(objInvoke3, (int) j4);
                Object[] objArr12 = new Object[1];
                g(b2, b3, b4, objArr12);
                Class<?> cls2 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                g(b5, b6, bArr[3], objArr13);
                Method method7 = cls2.getMethod((String) objArr13[0], null);
                method7.setAccessible(true);
                Object objInvoke4 = method7.invoke(null, null);
                Object[] objArr14 = new Object[1];
                g(b2, b3, b4, objArr14);
                Class.forName((String) objArr14[0]).getField("b").setBoolean(objInvoke4, true);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:132:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x01f0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void f(int r29, java.lang.String r30, byte r31, java.lang.Object[] r32) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1054
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass1.f(int, java.lang.String, byte, java.lang.Object[]):void");
        }

        private static void g(byte v2, byte v3, byte v4, Object[] v5) {
            /*
                int r0 = r8 * 14
                int r8 = 111 - r0
                int r2 = r9 * 5
                int r1 = 6 - r2
                int r0 = r10 + 4
                byte[] r7 = o.aa.b.AnonymousClass1.$$a
                byte[] r6 = new byte[r1]
                int r5 = 5 - r2
                r4 = 0
                if (r7 != 0) goto L30
                r8 = r5
                r1 = r0
                r3 = r4
            L16:
                int r0 = -r0
                int r8 = r8 + r0
                int r8 = r8 + (-7)
                r0 = r1
                r2 = r3
            L1c:
                byte r1 = (byte) r8
                r6[r2] = r1
                int r1 = r0 + 1
                int r3 = r2 + 1
                if (r2 != r5) goto L2d
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r4)
                r11[r4] = r0
                return
            L2d:
                r0 = r7[r1]
                goto L16
            L30:
                r2 = r4
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass1.g(byte, byte, byte, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{84, 109, 90, 4, 58, MessagePack.Code.BIN16, -21, 59, MessagePack.Code.BIN16};
            $$b = 206;
        }

        static void init$1() {
            $$c = new byte[]{57, MessagePack.Code.BIN8, -70, 1};
            $$d = 6;
        }

        @Override // o.ah.e.InterfaceC0329e
        public final void a(c cVar) throws Throwable {
            if (f.a()) {
                Object[] objArr = new Object[1];
                f(18 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0016\u001e\u0014\u0011\"!\u000e \u0006!\u0003\u000b\u0015\u0007\u000b\b㙈", (byte) (MotionEvent.axisFromString("") + 97), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f(54 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u0006\u001a\t\r\n\u0007\u0014\u000b\u0017\u001f\b\u0007\u0015\u0006㘊㘊\u000f\u0007\u000f \"\u001c\u001a\n\u0014\u0013\b\u001d\u001f\u000b\f\u0018\u0003\u0016\u0007\t\u0013\b\u000e\u0003\u0015\u0001\u0015\u0006\u0015\t\u0013\u0003\u000b\u0015\u0004\n\r\t", (byte) (Color.rgb(0, 0, 0) + 16777236), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            AntelopError antelopErrorA = o.by.c.b(cVar).a();
            synchronized (b.this.f19974e) {
                Iterator<OperationCallback<k>> it = b.this.f19976g.iterator();
                while (it.hasNext()) {
                    it.next().onError(antelopErrorA);
                }
                b.this.f19976g.clear();
                Iterator<OperationCallback<List<o>>> it2 = b.this.f19975f.iterator();
                while (it2.hasNext()) {
                    it2.next().onError(antelopErrorA);
                }
                b.this.f19975f.clear();
                b.this.f19977h = null;
            }
        }

        @Override // o.ah.e.InterfaceC0329e
        public final void a(k kVar, List<o> list) throws Throwable {
            if (f.a()) {
                Object[] objArr = new Object[1];
                f(17 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u0016\u001e\u0014\u0011\"!\u000e \u0006!\u0003\u000b\u0015\u0007\u000b\b㙈", (byte) (96 - View.MeasureSpec.getSize(0)), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f(54 - View.getDefaultSize(0, 0), "\u0006\u001a\t\r\n\u0007\u0014\u000b\u0017\u001f\b\u0007\u0015\u0006㙈㙈\u000f\u0007\u000f \"\u001c\u001a\n\u0014\u0013\b\u001d\u001f\u000b\f\u0018\u0003\u0016\u0007\t\u0013\b\u000e\u0003\u0015\u0001\u0015\u0006\u0015\t\u0013\u001b\u0002\u0010\r\b㘻㘻", (byte) (82 - Color.red(0)), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            b.this.a(kVar, list, Long.valueOf(System.currentTimeMillis()));
            synchronized (b.this.f19974e) {
                Iterator<OperationCallback<k>> it = b.this.f19976g.iterator();
                while (it.hasNext()) {
                    it.next().onSuccess(kVar);
                }
                b.this.f19976g.clear();
                Iterator<OperationCallback<List<o>>> it2 = b.this.f19975f.iterator();
                while (it2.hasNext()) {
                    it2.next().onSuccess(list);
                }
                b.this.f19975f.clear();
                b.this.f19977h = null;
            }
        }
    }

    /* JADX INFO: renamed from: o.aa.b$2 */
    public class AnonymousClass2 implements b.e {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;
        public static int A = 0;
        public static int B = 0;
        public static int C = 0;
        public static int D = 0;

        /* JADX INFO: renamed from: a */
        private static long f19985a = 0;

        /* JADX INFO: renamed from: b */
        private static char[] f19986b = null;

        /* JADX INFO: renamed from: f */
        private static int f19987f = 0;

        /* JADX INFO: renamed from: g */
        public static int f19988g = 0;

        /* JADX INFO: renamed from: h */
        public static int f19989h = 0;

        /* JADX INFO: renamed from: i */
        public static int f19990i = 0;

        /* JADX INFO: renamed from: j */
        private static int f19991j = 0;

        /* JADX INFO: renamed from: k */
        public static int f19992k = 0;

        /* JADX INFO: renamed from: l */
        public static int f19993l = 0;

        /* JADX INFO: renamed from: m */
        public static int f19994m = 0;

        /* JADX INFO: renamed from: n */
        public static int f19995n = 0;

        /* JADX INFO: renamed from: o */
        public static int f19996o = 0;

        /* JADX INFO: renamed from: p */
        public static int f19997p = 0;

        /* JADX INFO: renamed from: q */
        public static int f19998q = 0;

        /* JADX INFO: renamed from: r */
        public static int f19999r = 0;

        /* JADX INFO: renamed from: s */
        public static int f20000s = 0;

        /* JADX INFO: renamed from: t */
        public static int f20001t = 0;

        /* JADX INFO: renamed from: u */
        public static int f20002u = 0;

        /* JADX INFO: renamed from: v */
        public static int f20003v = 0;

        /* JADX INFO: renamed from: w */
        public static int f20004w = 0;

        /* JADX INFO: renamed from: x */
        public static int f20005x = 0;

        /* JADX INFO: renamed from: y */
        public static int f20006y = 0;

        /* JADX INFO: renamed from: z */
        public static int f20007z = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ OperationCallback f20008c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ k f20009d;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0014). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(short r9, byte r10, int r11) {
            /*
                int r8 = 105 - r11
                int r0 = r9 * 2
                int r7 = r0 + 4
                byte[] r6 = o.aa.b.AnonymousClass2.$$c
                int r0 = r10 * 3
                int r5 = 1 - r0
                byte[] r4 = new byte[r5]
                r3 = 0
                if (r6 != 0) goto L28
                r0 = r8
                r2 = r3
                r8 = r5
            L14:
                int r7 = r7 + 1
                int r8 = r8 + r0
                r1 = r2
            L18:
                int r2 = r1 + 1
                byte r0 = (byte) r8
                r4[r1] = r0
                if (r2 != r5) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L25:
                r0 = r6[r7]
                goto L14
            L28:
                r1 = r3
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass2.$$e(short, byte, int):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            D = 98902529;
            C = 1045445059;
            B = 1120186689;
            A = -220517875;
            f20007z = 1646458863;
            f20006y = 1539746776;
            f20005x = -321357826;
            f20004w = -2143091830;
            f20003v = 680293734;
            f20002u = -1088982976;
            f20001t = -899950679;
            f20000s = 90771198;
            f19999r = -419979649;
            f19998q = -136234142;
            f19997p = -902311169;
            f19996o = -1697851633;
            f19995n = -2117389108;
            f19994m = 1841541462;
            f19993l = -483018444;
            f19992k = -1694487863;
            f19990i = -1570764895;
            f19989h = -777096513;
            f19988g = 1820647036;
            init$0();
            f19987f = 0;
            f19991j = 1;
            char[] cArr = new char[2026];
            ByteBuffer.wrap("\u0094±WF\u0013+ß\u0019\u009bùG\u009e\u0003\u008dÎJ\u008aSv\u00132ÏþÛº¼ek!Eí?©\u0000 ðã-§Qkl/\u0091óØ·Öz\u0018>6Âi\u0086\u009aJ \u000eÀÑ\u000f\u0095\u0005Y_\u001dj!»åÜ©ál\u00000\u001dô8¸Í|ª\u0000óÃ6\u0087\u007fKu\u000f\u00adÓ \u0097Þ[í\u001e\u001e\"@æ~ª\u0091nÒ2øõ\b¹7}\\\u0001\u009bÅ©\u0089æL\u001c\u0010'ÔI\u0098v\\\u008e`À$îç\u0006«Xof3\u009e\u0005ßÆ\u0002\u0082~NC\n¾Ö÷\u0092ù_7\u001b\u0019çF£µo\u008f+ïô °*|p8E\u0004\u0094Àó\u008cÎI/\u00152Ñ\u0017\u009dâY\u0085%Üæ\u0019¢PnZ*\u0082ö\u008f²ñ~Â;1\u0007oÃQ\u008f¾Ký\u0017×Ð'\u009c\u0018Xs$´à\u0086¬Éi35\bñf½Yy´Eû\u0001ËÂ&\u008egJH\u0016§\u0094ÝWN\u0013'ß\f\u009b½G\u00ad\u0003\u008dÎv\u008aVv\f2ëþÉººeU!Cí>©\u0016\u0095ØQ§\u001d\u0089Øa\u0084\u0015@\u0011\fêÈÓ´\u0089wg\u0094ÝWN\u0013'ß\f\u009b½G\u00ad\u0003\u008dÎv\u008aVv\f2ëþÉººeU!Rí3©\u0002\u0095ÏQ\u009d\u001d\u009eØb\u00848@\u0001\fîÈÖøÁ;R\u007f;³\u0010÷¡+±o\u0091¢jæJ\u001a\u0010^÷\u0092ÕÖ¦\tIMM\u0081?Å\u0000ùÕ\u009aÃYG\u001d%Ñ\u0017\u0095£I¹\r\u0093À`\u0084Yx\u0018<ùð\u008b´«k{/Pã §\n\u009bÝ_¯\u0013\u008cÖS\u008a6N\u001d\u0002ðÆØº\u0091yn=]\u0094ÝWO\u00136ß\u0019\u009b½G®\u0003\u0085Î4\u008aBv\u00182íþÊ\u0094ÝWO\u00136ß\u0019\u009b½G¹\u0003\u008bÎw\u008a\u001cv\u001a2ðþÕº¢\u0094ÝWY\u0013&ß\u0019\u009bóG¸\u0003\u0086Î5\u008a`v,2ÏþÕº¤eo!fí;©\u0006\u0095Ë\u0094ÝWY\u0013;ß\t\u009bæG¯\u0003\u008fÎ5\u008a^v\u00032àþ\u0095º¾ec!@í4©\u0010\u0095\u0084Q±\u001d\u0095\u0089\u007fJ¬\u000eÊÂû\u0086\u0012Z]\u0094ÝWY\u0013;ß\t\u009bæG¯\u0003\u008fÎ5\u008aPv\u00032ìþ\u0095º¼eo!Oí/©$\u0095çQï\u001d\u0094Øw\u0084'@\u0017\f·ÈÑ´\u0085wl3Nÿ »ågÎ\u0094ÝWY\u0013;ß\t\u009bæG¯\u0003\u008fÎ5\u008aPv\u00032ìþ\u0095º¼eo!Oí/©$\u0095çQï\u001d\u008aØ`\u0084%@\u0012\u0094ÝWY\u0013;ß\t\u009bæG¯\u0003\u008fÎ5\u008a^v\u00032àþ\u0095º¾ec!@í4©\u0017\u0095ÇQ·\u001d¬Ø_\u0084:@\u0010\fõÈÂ´Äwq3U\u001a§Ù4\u009d]Qv\u0015ÇÉÞ\u008dý@\r\u0004=øw¼\u008dp¥4Ûë\u0004\u0094\u0080WE\u0013lß\u0018\u009bçG£\u0003\u008eÎ~\u008a\u001cv\u00022íþÉº¦-\u001cîÏª£f\u0089\"wþdº\fwÿ3Æ\u0094ÝWZ\u00130ß\u0015\u009bñGå\u0003\u0084Îs\u008a^v\u000f2ñþÃº¡e~!Gí7©\u0001îI-\u009aiú¥Úá4=y\u0094\u0080WE\u0013lß\n\u009bàG¥\u0003\u0086Îo\u008aQv\u001e2¬þ×º³ed!Wí<©\u0013\u0095ÉQ¶\u001d\u008fØ`\u0084/@\u0010\u0094\u0095WO\u0013,ß\u0003\u0094\u0082WO\u00130ß\t\u009bûG¹\u0003\u0096Î4\u008aAv\u00132ñþ\u0094º°en!\fí>©\u0017\u0095ÈQ·\u001d\u009dØ<\u0084-@\u0012\fïÈ\u009c´\u008cwc3Qÿ7»ÕgÅ#ªï\u0087ªu\u00960R\u001f\u001eüÚ®\u0086\u0087Ah\rWÉ\u0018l¢¯oë\u0010')cÛ¿\u0099û¶6\u0014ra\u008e3ÊÑ\u0006´B\u0090\u009dNÙ,\u0015\u001eQ7mè©\u0097å½ \u001c|\r¸2ôÏ0¼L¬\u008fCËq\u0007\u0017Cõ\u009fåÛ\u008a\u0017§RUn\u0014ª?æÜ\"\u008e~\u00ad¹H\u0094\u0082WO\u00130ß\t\u009bûG¹\u0003\u0096Î4\u008aAv\u00132ñþ\u0094º°en!\fí>©\u0017\u0095ÈQ·\u001d\u009dØ<\u00848@\r\f´ÈÑ´\u009bwk\u0094\u0082WO\u00130ß\t\u009bûG¹\u0003\u0096Î4\u008aAv\u00132ñþ\u0094º°en!\fí>©\u0017\u0095ÈQ·\u001d\u009dØ<\u00848@\r\f´ÈÞ´\u008bwa\u0094\u0082WO\u00130ß\t\u009bûG¹\u0003\u0096Î4\u008aAv\u00132ñþ\u0094º°en!\fí>©\u0017\u0095ÈQ·\u001d\u009dØ<\u00848@\r\f´Èß´\u0089wa\u0094\u0082WO\u00130ß\t\u009bûG¹\u0003\u0096Î4\u008aAv\u00132ñþ\u0094º°en!\fí>©\u0017\u0095ÈQ·\u001d\u009dØ<\u00848@\r\f´Èß´\u0084wa 7cû'\u009eë±¯Rs\u001f\u0094®Wk\u0094ÝWZ\u00130ß\u0015\u009bñGå\u0003\u008fÎu\u008aVv\u001f2îþßº¡T¡\u0097mÓ\b\u001f'[Ð\u0087\u009aÃ¢\u000eLJc \u0010cê'\u0089ë¦¯Zs\u000073úÖ¾øB¡HÏ\u008b\fÏa\u0003\\Gµ\u009bõßÄÕ÷\u0016$RV\u009esÚ\u0099\u0006ÅBñ\u008f\u0011\u0094:Wÿ\u0013Öß°\u009bZG\u001f\u0003<ÎÕ\u008aëv¤2\u0016þdº\reÆ!ñí\u0083©\u00ad\u0094\u0084WH\u0013-ß\u0002\u009bªGü\u0003\u0092\u0094\u0095WO\u0013,ß\u001f\u009bàG£\u0003\u0081jÂ©\u0018í{!He·¹ôýÖ0\u0012t\u001d\u0088\u0005ÌãµWv\u008d2îþÝº\"fa\"Cï\u0087«\u0088W\u0090\u0013vß'\u009b&Dü\u0094\u0080WE\u0013lß\n\u009bàG¥\u0003\u0086Îo\u008aQv\u001e2¬þ×º½en!Gí6Q\u0004\u0092ËÖ¬\u0094\u0097WG\u00137ß\u0016\u009bóG¾\u0003\u008dÎhÚg\u0019\u008e]æ\u0091\u008eÕ\u0014\tkMX\u0080ºÄ\u008f8Ó|3°Nô`+±o\u0084£®çåÛ\u0016\u001fdSA\u0096«Êû\u0094³WD\u0013&ß\b\u009býG£\u0003\u0086Î:\u008aav.2Éþ\u009aº°e\u007f!Kí6©\u0006\u0095\u008aQ¤\u001d\u0095Ø`\u0084j@\u001a\f¢È\u0084\u0094³WD\u0013&ß\b\u009býG£\u0003\u0086Î:\u008aav.2Éþ\u009aº°e\u007f!Kí6©\u0006\u0095\u008aQ¤\u001d\u0095Ø`\u0084j@\u001a\f¢È\u0084´µw43\u000e[(\u0098íÜÄ\u0010ºT[\u0088\u0010Ì.\u0001ÅEû¹°ýO Wc\u0087'ìëÜ¯6sa7Sú°Ô\u0093\u0017_S:\u009f\u0015Û½\u0007ëôÓ7\u0018s\u007f¿Jû©'ì\u0094\u0080WE\u0013lß\n\u009bàG¥\u0003\u0086Îo\u008aQv\u001e2¬þØº ek!Lí>\u0094\u0080WE\u0013lß\u0011\u009b÷G¸\u0003\u008cÎ\u007f\u008a^vD2óþßº¿e\u007f\u0000}\u0094\u0080WE\u0013lß\t\u009b÷G©\u0003\u0097Îh\u008aW\u0087\u0085\u0094\u0080WE\u0013lß\u0018\u009bçG£\u0003\u008eÎ~\u008a\u001cv\u001a2ðþÕº¶e\u007f!Aí.Í¬\u000egJ\u0016\u0086.Âõ\u001e\u008aZâ\u0097\u0014\u0094\u0080WE\u0013lß\u0018\u009bçG£\u0003\u008eÎ~\u008a\u001cv\f2ëþÔºµeo!Pí*©\u0000\u0095ÃQ¬\u001d\u008e\u0094\u0095WO\u0013,ß\u001f\u009bàG£\u0003\u0081Î5\u008aAv\u000e2éþ\u0095ºµeo!Lí?©\u0000\u0095ÃQ¡\u0094\u0095WO\u0013,ß\u001f\u009bàG£\u0003\u0081ÎE\u008aJvR2´þ\u0095º¡en!Ií\u0005©\n\u0095\u0092Qô\u001dÕØu\u0084/@\f\fÿÈÀ´\u0083wa3eÿ*»²g\u0094\u0094\u0095WO\u0013,ß\u001f\u009bàG£\u0003\u0081Î5\u008aUv\u00052íþÝº¾eo!}í)©\u0016\u0095ÁQí\u001d\u009dØw\u0084$@\u0007\fèÈÛ´\u0089ú\u009a9@}#±\u0010õï)¬m\u008e :äK\u0018\u0007\\â\u0090ÍÔå\u000b3O]\u0083zÇ\u000bûÇ?¢s\u008d¶%ês.\u001d\u007fõ¼%øM4}p\u009e¬Ïè\u00ad%\ta6\u009daÙ½\u0015½QÂ\u008e\u0002Ê-\u0006TBw~\u0095ºÚö¢3Do\u0005«eç\u009f#¼_ï\u009c\u0010Ø3\u0014QPµ\u008cºÈ\u0082\u0004¤\u0094\u0080WE\u0013lß\u0018\u009býG¥\u0003\u0096Îv\u008a]v\u000b2æþßº \u0094\u0080WE\u0013lß\u0018\u009býG¥\u0003\u0096Îs\u008a_v\u000b2åþßºüeh!Wí3©\u001e\u0095ÎQì\u001d\u009cØ{\u0084$@\u0005\fÿÈÀ´\u009awp3Sÿ<»þîá-\u0016it¥Zá¯=ñyÔ´eð\u0018\f\u0000Hæ\u0094\u0080WE\u0013lß\u0018\u009bçG£\u0003\u008eÎ~\u008a\u001cv\u000e2ëþÉº¢ef!Cí#©\\\u0095ÃQ¦\u0094\u0086WO\u00131ß\u000e\u009b¿Ov\u008c©ÈÆ\u0004ã@Q\u009cTØy\u0015\u0094Qñ\u00adöé\n%:aJ¾Êú¿6ÅrðN7\u008a\\Õ\u0083\u0016OR/\u009e\u000fÚ¼\u0006¢B\u0095\u008f4Ë_7\u000bsë¿Ôû¹$o`[¬)Kì\u0088 Ì@\u0000`DÓ\u0098ÖÜë\u0011[U;©dí\u0086!°eâº\u0006þ,2XvxJ·\u008eÌ\u0094\u0083WO\u0013/ß\u000f\u009b¼G¹\u0003\u0084Î4\u008a^v\t2æþåº¶eo!Lí)©\u001b\u0095ÞQ»\u0094\u0080WE\u0013lß\u0011\u009b÷G¸\u0003\u008cÎ\u007f\u008a^vD2ãþÔº¶ex!Mí3©\u0016\u0095\u0084Q³\u001d\u009fØ\u007f\u0084?@\u0006j«©níG!3eÖ¹\u008eý½0\u001fth\u0088$ÌÄ\u0000äD×\u009b@ß\u007f\u0013\u0015W\u0006kï¯\u0088ã¼&\\ã' âdË¨²ìQ0\u0000tk¹ßýà\u0001¤EI\u0089yÍ[\u0012ËVì\u009a\u0093Þ²âh&\u0017j-¯Çó\u00847«{IVç\u0095\"Ñ\u000b\u001dmY\u0087\u0085ÂÁá\f\bH6´yðË<¿xÀ§\u0004ã)/Yk;W«\u0093Ìßó\u001a\u0012FH\u0082wÎ\u008d\n§väµ\u000bñ)b\u0087¡Båk)\u000emì±¾õ\u00918x|X\u0080CÄç\bÈL¼\u0093a×A\u001bs_\u0013cÄ§«ë\u009a.pr?¶\u0015úï>ÜB\u0083\u0081q¬\u0007oÂ+ëç\u008e£l\u007f>;\u0011öø²ØN²\n`ÆE\u0082!]£\u0019ÇÕ¨\u0091\u009c\u00adAi!%Sàó¼¤x\u008b4zðP\u008c\u001fOõ\u000bÏÇ¼\u0083c_Q¶¹u|1Uý5¹Îe\u009d!¿ìL¨yT}\u0010ÙÜö\u0098\u0082G_\u0003\u007fÏM\u008b-·ús\u0095?¤úN¦\u0001b+.Ñêâ\u0096½UO\u0094\u0080WE\u0013lß\f\u009b÷G¤\u0003\u0086Îu\u008a@v52æþÖº¹eg!\fí8©\u0007\u0095ÃQ®\u001d\u009eØ<\u0084,@\u000b\fôÈÕ´\u008fwp3Jÿ »ãgÌ#®\u0094È\u0094ÝWN\u0013'ß\f\u009b½G»\u0003\u0087Îw\u008aGv52òþÓº¢eo\u0094ÝWN\u0013'ß\f\u009b½G¹\u0003\u008dÎy\u008aYv\u000f2öþ\u0095º°ek!Qí?©\u0010\u0095ËQ¬\u001d\u009eØM\u0084-@\u0007\fôÈË´\u008eÑÎ\u0012]V4\u009a\u001fÞ®\u0002ªF\u009e\u008bjÏJ3\u001cwå»\u0086ÿ¦ |d_¨0ì\u0005\u0094ÝWN\u0013'ß\f\u009b½G¹\u0003\u008dÎy\u008aYv\u000f2öþ\u0095º£eo!Oí/©\u0016\u0094ÝWY\u0013;ß\t\u009b½G»\u0003\u0087Îw\u008aGv52öþÈº³ei!G\fQÏÕ\u008b·G\u0085\u0003jß#\u009b\u0003V¹\u0012Òî\u008fªlf\u0019\"2ýï¹Ìuµ1¡\rKÉ/\u0085\u001a@ò\u001c©Ø\u008d\u0094IPZ,\u0003ïì«Ãg¹#Yÿ_»3w\u00132Ó\u000eàÊ\u0085\u0086q©³j .Iâb¦ÓzÆ>ÿó\u0000·\u0003Kc\u000f\u009cÃ§\u0096ÛUH\u0011!Ý\n\u0099»E®\u0001\u0097Ìh\u0088kt\u00180íüÑ¸±\u0094ÝWN\u0013'ß\f\u009b½G¹\u0003\u008dÎy\u008aYv\u000f2öþ\u0095º°ey!Ví<©\u001d\u0095ÆQ¦\u001d\u009fØ`\u0084.*ïék\u00ad\ta;%Ôù\u009d½½p\u00074lÈ1\u008cÒ@§\u0004\u008cÛQ\u009frS\n\u00173+ìï\u0096£§fL:\u001cþ5²Úvß\n²É^\u008daAN\u0005ËÙÿ\u0094ÝWN\u0013'ß\f\u009b½G¨\u0003\u0091În\u008aSv\t2áþßØ\u009b\u001b\b_a\u0093J×û\u000bîO×\u0082(Æ\u0013:U~¶²\u0093Æç\u0005tA\u001d\u008d6É\u0087\u0015\u0092Q«\u009cTØe$5`ß¬îÂu\u0001æE\u008f\u0089¤Í\u0015\u0011\u0000U9\u0098ÆÜõ °dC¨w\u0094ÝWN\u0013'ß\f\u009b½G¨\u0003\u0091În\u008aDv\u00072ñþÝ¸f{õ?\u009có··\u0006k\u0013/*âÕ¦ùZ¶\u001eXÒh\u0096\u0019IÒ·¸t+0Büi¸ØdÍ ôí\u000b©\bUf\u0011\u008aÝº\u0094ÝWN\u0013#ß\u000e\u009bóGå\u0003\u0086Îu\u008aEv\u00042îþÕº³en!Qíu©\\\u0095ÒQ \u001dÕØp\u00849@\u0016\fñA1\u0082«ÆÀ\nâNQ\u0092QÖg\u001b\u0098_º£éç\u0019+%o\u0011°¤ô½8Â|Í@.\u0084OÈd\r\u009bQÂ\u0095ÈÙ\u0019\u001d2ab¢\u008bæ¤\u0094ÝWZ\u00130ß\u0015\u009bñGå\u0003\u008bÎu\u008aBv\u00052ðþÎº¡B\u001b\u0081\u0095Åý\t\u0083MqzÉ¹Ný$1\u0001uå©ñí\u0085 kdJ\u0098\u0018Ü¹\u0010ÃT§\u008bnÏE\u0094\u0095WX\u0013#ß\u0016\u009bþG¥\u0003\u0081Î4\u008aUv\u00052îþÞº´ec!Qí2©\\\u0095ÙQ\u00ad\u0094\u009eWC\u0013 ß=\u009bÞG\u008f\u0003±ÎE\u008aPv\u00192öþ\u0094º¡ee\u0094ÝWO\u00136ß\u0019\u009b½G§\u0003\u0087Î~\u008a[v\u000b2ÝþÙº½en!Gí9©\u0001\u0095\u0084Qº\u001d\u0097Ø~\u0094\u0090WF\u00137ß\u001f\u009báG¾\u0003\u0083Îy\u008aYv\u0019\u0094ÝWO\u00136ß\u0019\u009b½G§\u0003\u008dÎo\u008a\\v\u001e2ñ\u0094ÝWN\u0013#ß\u000e\u009bóGå\u0003\u0086Îu\u008aEv\u00042îþÕº³en!Qíu©\\\u0095ÎQ²\u001dÕØs\u0084:@\u0012\féÈ\u009c´\u0092wo3VäV'Ñc»¯\u009eëz7ns\n¾áúÌ\u0006\u0088Bg\u008eWÊ6Q\u0002\u0092òÖ\u0099\u001a©^C\u0082\u0014Æ&\u000bÅÌ\t\u000f\u009aK÷\u0087ÚÃ'\u001f1[[\u0096§Ò\u0095.Ýjy¦\u001eât=±y\u0090µçñÊÍ\u001b\teE\u0001\u0080¥Üë\u0018ÄTa\u0090Vì\u0011/µk\u0081§ëãp?\u001b{g·Eò\u008cÎù\nØF/\u0082lÞB\u0019àU\u008b\u0091Ûí;)\u001beo ³ü\u0093".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2026);
            f19986b = cArr;
            f19985a = 308912591312082730L;
        }

        AnonymousClass2(k kVar, OperationCallback operationCallback) {
            kVar = kVar;
            operationCallback = operationCallback;
        }

        private static void E(char c2, int i2, int i3, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            o.a.o oVar = new o.a.o();
            long[] jArr = new long[i3];
            oVar.f19947b = 0;
            while (oVar.f19947b < i3) {
                int i5 = oVar.f19947b;
                try {
                    Object[] objArr2 = {Integer.valueOf(f19986b[i2 + i5])};
                    Object objA = o.d.d.a(-214519724);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a((ViewConfiguration.getPressedStateDuration() >> 16) + 742, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), TextUtils.getCapsMode("", 0, 0) + 12, 632508977, false, $$e(b2, b3, (byte) (6 | b3)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(f19985a), Integer.valueOf(c2)};
                    Object objA2 = o.d.d.a(-1567654649);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        objA2 = o.d.d.a(766 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12470), 12 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1946853218, false, $$e(b4, b4, $$c[0]), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objA2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {oVar, oVar};
                    Object objA3 = o.d.d.a(-723636472);
                    if (objA3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objA3 = o.d.d.a(386 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 18 - ExpandableListView.getPackedPositionType(0L), 39570797, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class});
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
            while (oVar.f19947b < i3) {
                int i6 = $10 + 7;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                Object[] objArr5 = {oVar, oVar};
                Object objA4 = o.d.d.a(-723636472);
                if (objA4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objA4 = o.d.d.a(TextUtils.indexOf("", "") + 387, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 19 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 39570797, false, $$e(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objA4).invoke(null, objArr5);
            }
            String str = new String(cArr);
            int i8 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            $11 = i8 % 128;
            if (i8 % 2 != 0) {
                objArr[0] = str;
            } else {
                int i9 = 90 / 0;
                objArr[0] = str;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void F(byte r8, int r9, byte r10, java.lang.Object[] r11) {
            /*
                byte[] r7 = o.aa.b.AnonymousClass2.$$a
                int r0 = r10 * 2
                int r6 = 4 - r0
                int r5 = 101 - r9
                int r1 = r8 * 3
                int r0 = 1 - r1
                byte[] r4 = new byte[r0]
                r3 = 0
                int r2 = 0 - r1
                if (r7 != 0) goto L2a
                r0 = r2
                r1 = r3
            L15:
                int r6 = r6 + 1
                int r5 = r5 + r0
            L18:
                byte r0 = (byte) r5
                r4[r1] = r0
                if (r1 != r2) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                r11[r3] = r0
                return
            L25:
                r0 = r7[r6]
                int r1 = r1 + 1
                goto L15
            L2a:
                r1 = r3
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass2.F(byte, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:473:0x0b6c  */
        /* JADX WARN: Removed duplicated region for block: B:481:0x0c1a  */
        /* JADX WARN: Removed duplicated region for block: B:538:0x121e  */
        /* JADX WARN: Removed duplicated region for block: B:583:0x18a0  */
        /* JADX WARN: Removed duplicated region for block: B:662:0x2a90  */
        /* JADX WARN: Removed duplicated region for block: B:704:0x327c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] d(android.content.Context r32, int r33, int r34, int r35) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 13589
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass2.d(android.content.Context, int, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{17, -84, -78, -70};
            $$b = 4;
        }

        static void init$1() {
            $$c = new byte[]{5, Ascii.SO, 124, -17};
            $$d = 99;
        }

        @Override // o.ag.b.e
        public final void b(List<m> list) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f19987f + 17;
            f19991j = i3 % 128;
            if (i3 % 2 == 0) {
                f.a();
                throw null;
            }
            if (f.a()) {
                Object[] objArr = new Object[1];
                E((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 1, 17 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                E((char) (View.MeasureSpec.getMode(0) + 46199), 17 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getEdgeSlop() >> 16) + 56, objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
                int i4 = f19991j + 17;
                f19987f = i4 % 128;
                int i5 = i4 % 2;
            }
            b bVar = b.this;
            bVar.a(kVar, bVar.f19970a, Long.valueOf(System.currentTimeMillis()));
            operationCallback.onSuccess(null);
        }

        @Override // o.ag.b.e
        public final void e(c cVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f19991j + 21;
            f19987f = i3 % 128;
            int i4 = i3 % 2;
            if (!(!f.a())) {
                int i5 = f19991j + 65;
                f19987f = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = new Object[1];
                E((char) (ViewConfiguration.getPressedStateDuration() >> 16), ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                E((char) (37208 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 73 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getTouchSlop() >> 8) + 56, objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
                int i7 = f19987f + 69;
                f19991j = i7 % 128;
                int i8 = i7 % 2;
            }
            operationCallback.onError(o.by.c.b(cVar).a());
        }
    }

    /* JADX INFO: renamed from: o.aa.b$3 */
    public final class AnonymousClass3 implements b.InterfaceC0328b {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        private static char f20011a = 0;

        /* JADX INFO: renamed from: d */
        private static long f20012d = 0;

        /* JADX INFO: renamed from: e */
        private static int f20013e = 0;

        /* JADX INFO: renamed from: h */
        private static int f20014h = 0;

        /* JADX INFO: renamed from: i */
        private static int f20015i = 0;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ OperationCallback f20016b;

        private static String $$c(int i2, short s2, short s3) {
            int i3 = i2 + 65;
            byte[] bArr = $$a;
            int i4 = 4 - (s2 * 2);
            int i5 = s3 * 4;
            byte[] bArr2 = new byte[i5 + 1];
            int i6 = -1;
            if (bArr == null) {
                i4++;
                i3 = i4 + i5;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i3;
                if (i6 == i5) {
                    return new String(bArr2, 0);
                }
                int i7 = bArr[i4];
                i4++;
                i3 += i7;
            }
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f20015i = 0;
            f20014h = 1;
            f20012d = 740602047300126166L;
            f20013e = 1564493270;
            f20011a = (char) 13110;
        }

        AnonymousClass3(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        private static void f(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int i3 = 2 % 2;
            Object charArray = str6;
            if (str6 != null) {
                int i4 = $11 + 71;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                charArray = str6.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            Object charArray2 = str5;
            if (str5 != null) {
                int i6 = $10 + 115;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                charArray2 = str5.toCharArray();
            }
            char[] cArr2 = (char[]) charArray2;
            Object charArray3 = str4;
            if (str4 != null) {
                charArray3 = str4.toCharArray();
            }
            i iVar = new i();
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
                        objA = o.d.d.a(Color.green(0) + 106, (char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, -155898465, false, $$c(b2, b3, b3), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {iVar};
                    Object objA2 = o.d.d.a(2068572);
                    if (objA2 == null) {
                        byte b4 = (byte) 3;
                        byte b5 = (byte) (b4 - 3);
                        objA2 = o.d.d.a(Gravity.getAbsoluteGravity(0, 0) + 847, (char) (6487 - Process.getGidForName("")), 13 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -694521287, false, $$c(b4, b5, b5), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA3 = o.d.d.a(-1122996612);
                    if (objA3 == null) {
                        byte b6 = (byte) 1;
                        byte b7 = (byte) (b6 - 1);
                        objA3 = o.d.d.a(458 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1804962841, false, $$c(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA4 = o.d.d.a(-1223178239);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        objA4 = o.d.d.a((ViewConfiguration.getTapTimeout() >> 16) + 639, (char) (65100 - KeyEvent.normalizeMetaState(0)), Color.blue(0) + 12, 1636969060, false, $$c((byte) 57, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    cArr3[iIntValue2] = iVar.f19933e;
                    cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f20012d ^ 740602047300126166L)) ^ ((long) ((int) (((long) f20013e) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f20011a) ^ 740602047300126166L))));
                    iVar.f19932b++;
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
            $$a = new byte[]{44, 115, -31, MessagePack.Code.FLOAT32};
            $$b = 186;
        }

        @Override // o.af.b.InterfaceC0328b
        public final void a() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20014h + 47;
            f20015i = i3 % 128;
            if (i3 % 2 != 0) {
                f.a();
                throw null;
            }
            if (f.a()) {
                Object[] objArr = new Object[1];
                f((char) (54113 - KeyEvent.keyCodeFromString("")), "裟劵\ue85e潭\ud9e5㻯砄ᗕ流焫᪩꒤숼ሯ霁㏚螣", "\u0000\u0000\u0000\u0000", "ᢙ鹯愜跓", Color.green(0) + 480145176, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), "뜹\udd49睧昽䥜\uf74d沍\udd29蚁祹絟ퟥ럠妲꒖嘶䕟䱡땭钝앃䄈醂桾䚙퓞\udaae\uec96婙륡褏侃\ueb67僾ម\u0010崋ﱧ폜짺⯂\ue869㟱뺃탼\uf017楧̲ꮰ\ude31焖뱕榿脥桂瑬\uf606\uebbb᳢", "\u0000\u0000\u0000\u0000", "\udc43ෘ\uf014뉪", 336451804 - View.MeasureSpec.getSize(0), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
                int i4 = f20015i + 111;
                f20014h = i4 % 128;
                int i5 = i4 % 2;
            }
            b.this.a(null, null, null);
            operationCallback.onSuccess(null);
        }

        @Override // o.af.b.InterfaceC0328b
        public final void d(c cVar) throws Throwable {
            int i2 = 2 % 2;
            if (!(!f.a())) {
                int i3 = f20015i + 73;
                f20014h = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = new Object[1];
                f((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 54114), "裟劵\ue85e潭\ud9e5㻯砄ᗕ流焫᪩꒤숼ሯ霁㏚螣", "\u0000\u0000\u0000\u0000", "ᢙ鹯愜跓", 480145176 - (ViewConfiguration.getTouchSlop() >> 8), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                f((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), "럦퉹\ud92f軹ࡰ鳠\u3097렕\udfca\udaa9\uf192銸\uefae싄쌰匈\ue5ae왨渙鍻ᗝﺜᕉ₳픇Їﳱ瀴猞粫ў傴旅뇳吞祡\uf73a\uef20♨\uf49b맟準퀸擜愐\udf5a\uf774䠣䐅鵃䡹\u0adc炻᷁髕ٙ\uf78f㦇鋀", "\u0000\u0000\u0000\u0000", "⾍멳쯌擢", (-860196050) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
                int i5 = f20014h + 99;
                f20015i = i5 % 128;
                int i6 = i5 % 2;
            }
            operationCallback.onError(o.by.c.b(cVar).a());
        }
    }

    /* JADX INFO: renamed from: o.aa.b$4 */
    public class AnonymousClass4 implements d.a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: c */
        private static long f20018c = 0;

        /* JADX INFO: renamed from: d */
        private static int f20019d = 0;

        /* JADX INFO: renamed from: f */
        private static int f20020f = 0;

        /* JADX INFO: renamed from: g */
        private static int f20021g = 0;

        /* JADX INFO: renamed from: h */
        private static byte[] f20022h = null;

        /* JADX INFO: renamed from: i */
        private static short[] f20023i = null;

        /* JADX INFO: renamed from: j */
        private static int f20024j = 0;

        /* JADX INFO: renamed from: k */
        public static int f20025k = 0;

        /* JADX INFO: renamed from: l */
        public static int f20026l = 0;

        /* JADX INFO: renamed from: m */
        public static int f20027m = 0;

        /* JADX INFO: renamed from: n */
        public static int f20028n = 0;

        /* JADX INFO: renamed from: o */
        private static int f20029o = 0;

        /* JADX INFO: renamed from: p */
        public static int f20030p = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ String f20031a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ OperationCallback f20032b;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0022 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(short r7, byte r8, byte r9) {
            /*
                int r0 = r7 * 2
                int r7 = 3 - r0
                int r6 = r9 + 71
                int r5 = r8 * 2
                int r0 = r5 + 1
                byte[] r4 = o.aa.b.AnonymousClass4.$$c
                byte[] r3 = new byte[r0]
                r2 = 0
                if (r4 != 0) goto L27
                r0 = r5
                r1 = r2
            L13:
                int r0 = -r0
                int r6 = r6 + r0
            L15:
                byte r0 = (byte) r6
                r3[r1] = r0
                int r7 = r7 + 1
                if (r1 != r5) goto L22
                java.lang.String r0 = new java.lang.String
                r0.<init>(r3, r2)
                return r0
            L22:
                int r1 = r1 + 1
                r0 = r4[r7]
                goto L13
            L27:
                r1 = r2
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass4.$$e(short, byte, byte):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            f20030p = -1163062142;
            f20028n = -75921871;
            f20027m = 1701118024;
            f20026l = 1321308741;
            f20025k = -57669481;
            init$0();
            f20020f = 0;
            f20029o = 1;
            f20018c = 1345913306149225290L;
            f20019d = -1213406101;
            f20021g = 1150422481;
            f20024j = -176370442;
            f20022h = new byte[]{74, 99, 109, -103, -109, -104, -117, 114, 98, -127, -114, 78, 97, -97, 105, -105, -79, 100, -114, 127, 69, 111, MessagePack.Code.MAP32, 99, -99, 44, 98, -127, -114, 78, 127, -105, -110, -104, 99, 57, 76, -83, 67, -97, -88, 5, -70, -1, 116, 69, 68, 67, -80, 72, -77, 42, 62, 62, 78, MessagePack.Code.FIXARRAY_PREFIX, -106, 101, 110, -100, 102, 105, -107, 109, 109, -128, -111, 97, 88, -84, 104, -104, -109, 98, -107, 83, MessagePack.Code.INT64, -107, 105, 43, -93, -101, -110, 109, 46};
        }

        AnonymousClass4(String str, OperationCallback operationCallback) {
            str = str;
            operationCallback = operationCallback;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:183|128|(1:130)(4:133|186|134|(7:136|182|142|(4:144|180|145|146)(1:150)|(6:184|152|(2:154|156)(1:155)|157|(1:159)(4:164|190|165|166)|(2:162|163))|170|171)(2:137|138))|131|132|182|142|(0)(0)|(0)|170|171) */
        /* JADX WARN: Removed duplicated region for block: B:144:0x0511 A[Catch: Exception -> 0x054b, TRY_LEAVE, TryCatch #1 {Exception -> 0x054b, blocks: (B:142:0x04c2, B:144:0x0511, B:146:0x053c, B:148:0x0544, B:149:0x054a, B:145:0x051b), top: B:182:0x04c2, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:150:0x054b  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x054e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] e(int r30, int r31) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1684
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass4.e(int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{81, 52, -106, MessagePack.Code.FIXEXT4};
            $$b = 206;
        }

        static void init$1() {
            $$c = new byte[]{88, MessagePack.Code.INT64, 78, Ascii.GS};
            $$d = 48;
        }

        private static void q(String str, int i2, Object[] objArr) throws Throwable {
            String str2 = str;
            int i3 = 2 % 2;
            char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
            q qVar = new q();
            qVar.f19949d = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                int i4 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a(TextUtils.indexOf("", "") + 731, (char) (Color.green(0) + 7933), View.resolveSize(0, 0) + 11, 355847088, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f20018c ^ 4743694005979712847L);
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(837 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (27279 - (ViewConfiguration.getTapTimeout() >> 16)), TextUtils.indexOf("", "", 0, 0) + 11, -2145994442, false, $$e(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 7)))), new Class[]{Object.class, Object.class});
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
                int i5 = $10 + 31;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr4 = {qVar, qVar};
                Object objA3 = o.d.d.a(1452497747);
                if (objA3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objA3 = o.d.d.a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 836, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 27280), 11 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -2145994442, false, $$e(b6, b7, (byte) ((b7 + 7) - (7 & b7))), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                int i7 = $10 + 21;
                $11 = i7 % 128;
                int i8 = i7 % 2;
            }
            objArr[0] = new String(cArr2);
        }

        private static void r(short s2, int i2, int i3, int i4, byte b2, Object[] objArr) throws Throwable {
            int i5 = 2;
            int i6 = 2 % 2;
            j jVar = new j();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(f20021g)};
                Object objA = o.d.d.a(-727631768);
                float f2 = 0.0f;
                long j2 = 0;
                if (objA == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objA = o.d.d.a((ViewConfiguration.getPressedStateDuration() >> 16) + 238, (char) (44532 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10, 35969549, false, $$e(b3, b4, (byte) ((b4 + 33) - (33 & b4))), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                int i7 = iIntValue == -1 ? 1 : 0;
                if (i7 != 0) {
                    int i8 = $10 + 105;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                    byte[] bArr = f20022h;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i9 = 0;
                        while (i9 < length) {
                            int i10 = $11 + 67;
                            $10 = i10 % 128;
                            int i11 = i10 % i5;
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objA2 = o.d.d.a(-1239398195);
                            if (objA2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objA2 = o.d.d.a(View.resolveSize(0, 0) + IptcDirectory.TAG_COPYRIGHT_NOTICE, (char) (28649 - (AudioTrack.getMinVolume() > f2 ? 1 : (AudioTrack.getMinVolume() == f2 ? 0 : -1))), 12 - (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)), 1621469864, false, $$e(b5, b6, (byte) ((b6 + 32) - (b6 & 32))), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                            i9++;
                            i5 = 2;
                            f2 = 0.0f;
                            j2 = 0;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = f20022h;
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(f20019d)};
                        Object objA3 = o.d.d.a(-727631768);
                        if (objA3 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objA3 = o.d.d.a(View.combineMeasuredStates(0, 0) + 238, (char) (44532 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 11 - View.MeasureSpec.getSize(0), 35969549, false, $$e(b7, b8, (byte) ((b8 + 33) - (33 & b8))), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f20021g) ^ (-7649639543924978291L))));
                    } else {
                        iIntValue = (short) (((short) (((long) f20023i[i2 + ((int) (((long) f20019d) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f20021g) ^ (-7649639543924978291L))));
                    }
                }
                if (iIntValue > 0) {
                    jVar.f19936d = ((i2 + iIntValue) - 2) + ((int) (((long) f20019d) ^ (-7649639543924978291L))) + i7;
                    Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f20024j), sb};
                    Object objA4 = o.d.d.a(1819197256);
                    if (objA4 == null) {
                        objA4 = o.d.d.a(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (5358 - (ViewConfiguration.getScrollBarSize() >> 8)), 11 - ExpandableListView.getPackedPositionType(0L), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    byte[] bArr4 = f20022h;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i12 = 0; i12 < length2; i12++) {
                            bArr5[i12] = (byte) (((long) bArr4[i12]) ^ (-7649639543924978291L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    jVar.f19934b = 1;
                    while (jVar.f19934b < iIntValue) {
                        int i13 = $11 + 25;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        if (z2) {
                            byte[] bArr6 = f20022h;
                            jVar.f19936d = jVar.f19936d - 1;
                            jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                        } else {
                            short[] sArr = f20023i;
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

        /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0025 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void s(byte r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                int r0 = r8 * 4
                int r0 = 100 - r0
                byte[] r8 = o.aa.b.AnonymousClass4.$$a
                int r2 = r9 + 4
                int r1 = r7 * 3
                int r7 = r1 + 1
                byte[] r6 = new byte[r7]
                r5 = 0
                if (r8 != 0) goto L2c
                r4 = r5
                r3 = r7
            L13:
                int r0 = -r0
                int r0 = r0 + r3
                r3 = r4
            L16:
                byte r1 = (byte) r0
                int r4 = r3 + 1
                r6[r3] = r1
                if (r4 != r7) goto L25
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                r10[r5] = r0
                return
            L25:
                int r2 = r2 + 1
                r1 = r8[r2]
                r3 = r0
                r0 = r1
                goto L13
            L2c:
                r3 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass4.s(byte, short, int, java.lang.Object[]):void");
        }

        @Override // o.ae.d.a
        public final void a() throws Throwable {
            if (f.a()) {
                Object[] objArr = new Object[1];
                q("ๆ⸤件溁轚꿐쾤\uec4eఌⳉ䵊洫跷궍쩔\ueae3ધ", 8268 - ExpandableListView.getPackedPositionChild(0L), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                q("\u0e77⿏䴶歧裏ꘋ쑜\ue5ad̏ⅆ廳粭騑뮉\ud9f9\uf707ᓇ㋊倏熝꿅촻\ueb7bࣙ☮䑳斱茔ꅲ\udea3ﳤᩗ㮀姹睈", 8623 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            synchronized (b.this.f19972c) {
                if (b.this.f19970a != null) {
                    Iterator<o> it = b.this.f19970a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (it.next().c().equals(str)) {
                            it.remove();
                            break;
                        }
                    }
                }
                b.this.e();
            }
            operationCallback.onSuccess(null);
        }

        @Override // o.ae.d.a
        public final void b(c cVar) throws Throwable {
            int i2 = 2 % 2;
            if (f.a()) {
                int i3 = f20029o + 115;
                f20020f = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = new Object[1];
                q("ๆ⸤件溁轚꿐쾤\uec4eఌⳉ䵊洫跷궍쩔\ueae3ધ", ExpandableListView.getPackedPositionType(0L) + 8269, objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                r((short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 213980698 - View.combineMeasuredStates(0, 0), 1309753079 + (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionType(0L) - 93, (byte) (29 - View.getDefaultSize(0, 0)), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            operationCallback.onError(o.by.c.b(cVar).a());
            int i5 = f20029o + 61;
            f20020f = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX INFO: renamed from: o.aa.b$5 */
    public class AnonymousClass5 implements b.e {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10 = 0;
        private static int $11 = 0;
        public static int A = 0;
        public static int B = 0;

        /* JADX INFO: renamed from: b */
        private static char[] f20034b = null;

        /* JADX INFO: renamed from: f */
        private static int f20035f = 0;

        /* JADX INFO: renamed from: g */
        private static char f20036g = 0;

        /* JADX INFO: renamed from: h */
        public static int f20037h = 0;

        /* JADX INFO: renamed from: i */
        private static int f20038i = 0;

        /* JADX INFO: renamed from: j */
        private static int f20039j = 0;

        /* JADX INFO: renamed from: k */
        public static int f20040k = 0;

        /* JADX INFO: renamed from: l */
        public static int f20041l = 0;

        /* JADX INFO: renamed from: m */
        public static int f20042m = 0;

        /* JADX INFO: renamed from: n */
        public static int f20043n = 0;

        /* JADX INFO: renamed from: o */
        public static int f20044o = 0;

        /* JADX INFO: renamed from: p */
        public static int f20045p = 0;

        /* JADX INFO: renamed from: q */
        public static int f20046q = 0;

        /* JADX INFO: renamed from: r */
        public static int f20047r = 0;

        /* JADX INFO: renamed from: s */
        public static int f20048s = 0;

        /* JADX INFO: renamed from: t */
        public static int f20049t = 0;

        /* JADX INFO: renamed from: u */
        public static int f20050u = 0;

        /* JADX INFO: renamed from: v */
        public static int f20051v = 0;

        /* JADX INFO: renamed from: w */
        public static int f20052w = 0;

        /* JADX INFO: renamed from: x */
        public static int f20053x = 0;

        /* JADX INFO: renamed from: y */
        public static int f20054y = 0;

        /* JADX INFO: renamed from: z */
        public static int f20055z = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ k f20056a;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ List f20058d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ OperationCallback f20059e;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(byte r8, short r9, short r10) {
            /*
                int r7 = r10 + 102
                int r0 = r9 * 3
                int r6 = 1 - r0
                byte[] r5 = o.aa.b.AnonymousClass5.$$c
                int r0 = r8 * 2
                int r1 = 3 - r0
                byte[] r4 = new byte[r6]
                r3 = 0
                if (r5 != 0) goto L29
                r2 = r3
                r0 = r1
            L13:
                int r1 = -r1
                int r1 = r1 + r7
                r7 = r1
                r1 = r0
            L17:
                int r0 = r1 + 1
                byte r1 = (byte) r7
                r4[r2] = r1
                int r2 = r2 + 1
                if (r2 != r6) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L26:
                r1 = r5[r0]
                goto L13
            L29:
                r2 = r3
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass5.$$e(byte, short, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            B = 1569380691;
            A = 535180005;
            f20055z = -2059557452;
            f20054y = 286443352;
            f20053x = -1929493484;
            f20052w = 1351174383;
            f20051v = 255852503;
            f20050u = -756767053;
            f20049t = -1008819107;
            f20048s = -1435057166;
            f20047r = -682169380;
            f20046q = -410847992;
            f20045p = -1477283252;
            f20044o = -1643556814;
            f20043n = 137358750;
            f20042m = -1472529369;
            f20041l = -132035198;
            f20040k = -132503309;
            f20037h = -1323150075;
            init$0();
            f20035f = 0;
            f20039j = 1;
            f20034b = new char[]{64580, 64605, 65469, 64517, 64594, 65464, 64612, 64559, 64523, 64520, 64638, 64604, 64620, 64543, 64598, 64609, 64614, 64576, 64582, 64579, 65470, 64589, 64597, 64629, 64625, 64577, 64584, 64590, 64591, 64599, 64535, 64578, 64595, 65468, 65466, 65467, 64587, 64585, 65471, 64611, 64593, 64618, 64586, 64588, 64616, 65463, 64632, 65465, 64592};
            f20036g = (char) 51640;
            f20038i = -1270219406;
        }

        AnonymousClass5(List list, k kVar, OperationCallback operationCallback) {
            list = list;
            kVar = kVar;
            operationCallback = operationCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:128:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x0154  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void C(int r30, java.lang.String r31, byte r32, java.lang.Object[] r33) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 926
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass5.C(int, java.lang.String, byte, java.lang.Object[]):void");
        }

        private static void D(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
            Object obj;
            String str2 = str;
            int i5 = 2 % 2;
            if (str2 != null) {
                char[] charArray = str2.toCharArray();
                int i6 = $10 + 71;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                obj = charArray;
            } else {
                obj = str2;
            }
            char[] cArr = (char[]) obj;
            n nVar = new n();
            char[] cArr2 = new char[i2];
            nVar.f19944a = 0;
            int i8 = $10 + 53;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            while (nVar.f19944a < i2) {
                nVar.f19946e = cArr[nVar.f19944a];
                cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
                int i10 = nVar.f19944a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(f20038i)};
                    Object objA = o.d.d.a(1376241034);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objA = o.d.d.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 270, (char) View.MeasureSpec.getSize(0), ExpandableListView.getPackedPositionType(0L) + 11, -2071844881, false, $$e(b2, b3, (byte) ((b3 + Ascii.CR) - (13 & b3))), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {nVar, nVar};
                    Object objA2 = o.d.d.a(-202660535);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 522, (char) TextUtils.getCapsMode("", 0, 0), 12 - (ViewConfiguration.getEdgeSlop() >> 16), 627984172, false, $$e(b4, b5, (byte) ((b5 + Ascii.VT) - (11 & b5))), new Class[]{Object.class, Object.class});
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
                int i11 = $10 + 45;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                nVar.f19945b = i4;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - nVar.f19945b, nVar.f19945b);
                System.arraycopy(cArr3, nVar.f19945b, cArr2, 0, i2 - nVar.f19945b);
            }
            if (z2) {
                char[] cArr4 = new char[i2];
                nVar.f19944a = 0;
                while (nVar.f19944a < i2) {
                    int i13 = $10 + 89;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                    Object[] objArr4 = {nVar, nVar};
                    Object objA3 = o.d.d.a(-202660535);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0') + 523, (char) TextUtils.getOffsetAfter("", 0), KeyEvent.normalizeMetaState(0) + 12, 627984172, false, $$e(b6, b7, (byte) (11 | b7)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002a -> B:17:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void E(int r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r1 = r8 + 97
                int r0 = r6 * 2
                int r0 = 4 - r0
                int r3 = r7 * 3
                int r2 = 1 - r3
                byte[] r8 = o.aa.b.AnonymousClass5.$$a
                byte[] r7 = new byte[r2]
                r6 = 0
                int r5 = 0 - r3
                if (r8 != 0) goto L30
                r3 = r0
                r2 = r5
                r4 = r6
            L16:
                int r1 = -r0
                int r0 = r3 + 1
                int r1 = r1 + r2
                r3 = r4
            L1b:
                byte r2 = (byte) r1
                r7[r3] = r2
                int r4 = r3 + 1
                if (r3 != r5) goto L2a
                java.lang.String r0 = new java.lang.String
                r0.<init>(r7, r6)
                r9[r6] = r0
                return
            L2a:
                r2 = r8[r0]
                r3 = r0
                r0 = r2
                r2 = r1
                goto L16
            L30:
                r3 = r6
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass5.E(int, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:655:0x1299, code lost:
        
            r2 = new java.lang.Object[]{new int[1], new int[1], r3, null, new int[1]};
            r3 = (java.lang.String) java.lang.Class.forName(r19).getField(r18).get(r16);
            ((int[]) r2[0])[0] = r37;
            ((int[]) r2[4])[0] = r37 ^ 20;
            r5 = (int) android.os.Process.getElapsedCpuTime();
            r1 = r39 + ((((((~((-91260378) | r5)) | 14850) * 449) + 2068775750) + (((~((~r5) | (-91260378))) | 14850) * 449)) + 16);
            r1 = r1 ^ (r1 << 13);
            r1 = r1 ^ (r1 >>> 17);
            r4 = 0;
            ((int[]) r2[1])[0] = r1 ^ (r1 << 5);
         */
        /* JADX WARN: Removed duplicated region for block: B:494:0x0aba  */
        /* JADX WARN: Removed duplicated region for block: B:506:0x0c5d  */
        /* JADX WARN: Removed duplicated region for block: B:509:0x0cab  */
        /* JADX WARN: Removed duplicated region for block: B:571:0x1077 A[Catch: Exception -> 0x1208, IOException -> 0x1293, all -> 0x152a, TryCatch #7 {, blocks: (B:513:0x0cf9, B:514:0x0d1b, B:519:0x0d95, B:639:0x124b, B:641:0x1251, B:642:0x1252, B:530:0x0dec, B:535:0x0e57, B:568:0x1066, B:569:0x1069, B:571:0x1077, B:572:0x10b3, B:574:0x10ca, B:575:0x1105, B:576:0x1117, B:578:0x113f, B:580:0x117c, B:582:0x11a4, B:584:0x11cd, B:586:0x11fa, B:654:0x1298, B:589:0x1204, B:620:0x122e, B:621:0x1231, B:623:0x1233, B:625:0x1239, B:626:0x123a, B:632:0x1240, B:634:0x1246, B:635:0x1247, B:644:0x1254, B:646:0x125a, B:647:0x125b, B:648:0x125c, B:649:0x1290), top: B:777:0x0cf9 }] */
        /* JADX WARN: Removed duplicated region for block: B:574:0x10ca A[Catch: Exception -> 0x1208, IOException -> 0x1293, all -> 0x152a, TryCatch #7 {, blocks: (B:513:0x0cf9, B:514:0x0d1b, B:519:0x0d95, B:639:0x124b, B:641:0x1251, B:642:0x1252, B:530:0x0dec, B:535:0x0e57, B:568:0x1066, B:569:0x1069, B:571:0x1077, B:572:0x10b3, B:574:0x10ca, B:575:0x1105, B:576:0x1117, B:578:0x113f, B:580:0x117c, B:582:0x11a4, B:584:0x11cd, B:586:0x11fa, B:654:0x1298, B:589:0x1204, B:620:0x122e, B:621:0x1231, B:623:0x1233, B:625:0x1239, B:626:0x123a, B:632:0x1240, B:634:0x1246, B:635:0x1247, B:644:0x1254, B:646:0x125a, B:647:0x125b, B:648:0x125c, B:649:0x1290), top: B:777:0x0cf9 }] */
        /* JADX WARN: Removed duplicated region for block: B:578:0x113f A[Catch: IOException -> 0x1293, all -> 0x152a, TryCatch #7 {, blocks: (B:513:0x0cf9, B:514:0x0d1b, B:519:0x0d95, B:639:0x124b, B:641:0x1251, B:642:0x1252, B:530:0x0dec, B:535:0x0e57, B:568:0x1066, B:569:0x1069, B:571:0x1077, B:572:0x10b3, B:574:0x10ca, B:575:0x1105, B:576:0x1117, B:578:0x113f, B:580:0x117c, B:582:0x11a4, B:584:0x11cd, B:586:0x11fa, B:654:0x1298, B:589:0x1204, B:620:0x122e, B:621:0x1231, B:623:0x1233, B:625:0x1239, B:626:0x123a, B:632:0x1240, B:634:0x1246, B:635:0x1247, B:644:0x1254, B:646:0x125a, B:647:0x125b, B:648:0x125c, B:649:0x1290), top: B:777:0x0cf9 }] */
        /* JADX WARN: Removed duplicated region for block: B:641:0x1251 A[Catch: Exception -> 0x125c, IOException -> 0x1293, all -> 0x152a, TryCatch #7 {, blocks: (B:513:0x0cf9, B:514:0x0d1b, B:519:0x0d95, B:639:0x124b, B:641:0x1251, B:642:0x1252, B:530:0x0dec, B:535:0x0e57, B:568:0x1066, B:569:0x1069, B:571:0x1077, B:572:0x10b3, B:574:0x10ca, B:575:0x1105, B:576:0x1117, B:578:0x113f, B:580:0x117c, B:582:0x11a4, B:584:0x11cd, B:586:0x11fa, B:654:0x1298, B:589:0x1204, B:620:0x122e, B:621:0x1231, B:623:0x1233, B:625:0x1239, B:626:0x123a, B:632:0x1240, B:634:0x1246, B:635:0x1247, B:644:0x1254, B:646:0x125a, B:647:0x125b, B:648:0x125c, B:649:0x1290), top: B:777:0x0cf9 }] */
        /* JADX WARN: Removed duplicated region for block: B:642:0x1252 A[Catch: Exception -> 0x125c, IOException -> 0x1293, all -> 0x152a, TryCatch #7 {, blocks: (B:513:0x0cf9, B:514:0x0d1b, B:519:0x0d95, B:639:0x124b, B:641:0x1251, B:642:0x1252, B:530:0x0dec, B:535:0x0e57, B:568:0x1066, B:569:0x1069, B:571:0x1077, B:572:0x10b3, B:574:0x10ca, B:575:0x1105, B:576:0x1117, B:578:0x113f, B:580:0x117c, B:582:0x11a4, B:584:0x11cd, B:586:0x11fa, B:654:0x1298, B:589:0x1204, B:620:0x122e, B:621:0x1231, B:623:0x1233, B:625:0x1239, B:626:0x123a, B:632:0x1240, B:634:0x1246, B:635:0x1247, B:644:0x1254, B:646:0x125a, B:647:0x125b, B:648:0x125c, B:649:0x1290), top: B:777:0x0cf9 }] */
        /* JADX WARN: Removed duplicated region for block: B:676:0x16b5  */
        /* JADX WARN: Removed duplicated region for block: B:682:0x1879 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] e(android.content.Context r36, int r37, int r38, int r39) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 9057
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass5.e(android.content.Context, int, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{83, -90, 91, 36};
            $$b = 154;
        }

        static void init$1() {
            $$c = new byte[]{94, -66, 120, 126};
            $$d = 254;
        }

        @Override // o.ag.b.e
        public final void b(List<m> list) throws Throwable {
            int i2 = 2 % 2;
            boolean zIsEmpty = false;
            if (f.a()) {
                Object[] objArr = new Object[1];
                C(18 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u0017,.\u000f\u0015\u0019,\u0015\u0004\u0007*\u0002#\u0001&\u0018㘝", (byte) (53 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                D(62 - ImageFormat.getBitsPerPixel(0), "\u0018\u0006\u0006\b\u0016\u0016ￃ\uffd0ￃ\u0016\f\u001d\b\uffddￃ\u0013\u0018\u0016\u000b\ufff3\u0015\u0012\t\f\u000f\b￤\u0011\u0007￦\u0004\u0015\u0007\u0016ￃ\uffd0ￃ\u0012\u0011￦ￕ\ufff3\ufff3\u0018\u0016\u000b￦\u0018\u0016\u0017\u0012\u0010\b\u0015￤\u0011\u0007￦\u0004\u0015\u0007\u0016\ufff6", false, View.MeasureSpec.makeMeasureSpec(0, 0) + 198, 15 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
                f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(list.size()).toString());
            }
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((o) it.next()).c());
                }
                Iterator<m> it2 = list.iterator();
                while (it2.hasNext()) {
                    int i3 = f20035f + 57;
                    f20039j = i3 % 128;
                    if (i3 % 2 != 0) {
                        arrayList.remove(it2.next().b());
                    } else {
                        arrayList.remove(it2.next().b());
                        int i4 = 36 / 0;
                    }
                }
                zIsEmpty = arrayList.isEmpty();
            }
            if (zIsEmpty) {
                int i5 = f20039j + 109;
                f20035f = i5 % 128;
                int i6 = i5 % 2;
                b bVar = b.this;
                bVar.a(bVar.f19973d, null, b.this.f19971b);
            } else {
                b.this.a(kVar, null, Long.valueOf(System.currentTimeMillis()));
            }
            operationCallback.onSuccess(list);
        }

        @Override // o.ag.b.e
        public final void e(c cVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f20035f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f20039j = i3 % 128;
            if (i3 % 2 == 0) {
                f.a();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (f.a()) {
                Object[] objArr = new Object[1];
                C(16 - TextUtils.lastIndexOf("", '0', 0, 0), "\u0017,.\u000f\u0015\u0019,\u0015\u0004\u0007*\u0002#\u0001&\u0018㘝", (byte) (Color.blue(0) + 53), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                C(53 - ImageFormat.getBitsPerPixel(0), "\u001b+\u0015\u001c\u0016\u001e/\u000e,$\u0014\u0003'\u0016\u000e\u0002 \u0016\u0011\u0000\n\u0002+#\u0017%㘎㘎*\u0014\u0017\u000e*\u0014#/\u0018\u0013\"\u0001'\u0016\u000e\u0002 \u0016\u0012#\u0001*),\u001f\u000f", (byte) (68 - ExpandableListView.getPackedPositionType(0L)), objArr2);
                f.c(strIntern, ((String) objArr2[0]).intern());
            }
            operationCallback.onError(o.by.c.b(cVar).a());
            int i4 = f20039j + 61;
            f20035f = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0022 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r9, short r10, int r11) {
        /*
            byte[] r8 = o.aa.b.$$a
            int r0 = r9 * 2
            int r7 = 3 - r0
            int r0 = r11 * 4
            int r6 = 1 - r0
            int r5 = r10 + 99
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r8 != 0) goto L27
            r0 = r6
            r2 = r3
        L13:
            int r5 = r5 + r0
            r1 = r2
        L15:
            byte r0 = (byte) r5
            int r2 = r1 + 1
            r4[r1] = r0
            if (r2 != r6) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L22:
            int r7 = r7 + 1
            r0 = r8[r7]
            goto L13
        L27:
            r1 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aa.b.$$c(int, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f19961l = -1459443245;
        f19959j = 1945264973;
        f19958i = -1822549253;
        f19969x = 0;
        f19968v = 1;
        f19965r = 0;
        f19967t = 1;
        a();
        Color.argb(0, 0, 0, 0);
        Process.getThreadPriority(0);
        ViewConfiguration.getTapTimeout();
        Process.myTid();
        ViewConfiguration.getPressedStateDuration();
        ViewConfiguration.getKeyRepeatTimeout();
        Color.argb(0, 0, 0, 0);
        Color.rgb(0, 0, 0);
        ExpandableListView.getPackedPositionForGroup(0);
        ExpandableListView.getPackedPositionChild(0L);
        ViewConfiguration.getScrollBarFadeDuration();
        int i2 = f19969x + 83;
        f19968v = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private b(Context context) {
        this.f19979n = context;
        d();
    }

    public static /* synthetic */ Object a(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) throws Throwable {
        int i8 = ~i6;
        int i9 = ~((i8 + i2) - (i8 & i2));
        int i10 = ~i2;
        int i11 = i9 | (~((-1) - (((-1) - i10) & ((-1) - i3))));
        int i12 = ~((-1) - (((-1) - i10) & ((-1) - i6)));
        int i13 = (-1) - (((-1) - i11) & ((-1) - i12));
        int i14 = ~i3;
        int i15 = ~((-1) - (((-1) - i14) & ((-1) - i6)));
        int i16 = (i12 + i15) - (i12 & i15);
        int i17 = ~((-1) - (((-1) - i2) & ((-1) - ((-1) - (((-1) - i8) & ((-1) - i14))))));
        int i18 = ~(i14 | i10 | i6);
        int i19 = (i17 + i18) - (i17 & i18);
        int i20 = i3 + i6 + i5 + ((-1369571145) * i4) + ((-720088171) * i7);
        int i21 = i20 * i20;
        int i22 = ((i3 * (-1931095572)) - 2087550970) + (i6 * (-1931094842)) + (i13 * (-365)) + (i16 * 365) + (i19 * 365) + ((-1931095207) * i5) + ((-789048161) * i4) + (356376013 * i7) + (i21 * 423362560);
        if ((((-954023988) * i3) - 252706816) + ((-260227018) * i6) + ((-346898485) * i13) + (i16 * 346898485) + (346898485 * i19) + ((-607125504) * i5) + (565182464 * i4) + (1611661312 * i7) + ((-409206784) * i21) + (i22 * i22 * (-1901854720)) != 1) {
            b bVar = (b) objArr[0];
            OperationCallback operationCallback = (OperationCallback) objArr[1];
            int i23 = 2 % 2;
            int i24 = f19965r + 35;
            f19967t = i24 % 128;
            int i25 = i24 % 2;
            if (f.a()) {
                Object[] objArr2 = new Object[1];
                w((char) (TextUtils.lastIndexOf("", '0') + 6047), View.MeasureSpec.getSize(0) + 3, 16 - ImageFormat.getBitsPerPixel(0), objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                Object[] objArr3 = new Object[1];
                w((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 48044), KeyEvent.keyCodeFromString("") + 272, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22, objArr3);
                f.c(strIntern, ((String) objArr3[0]).intern());
                int i26 = f19965r + 1;
                f19967t = i26 % 128;
                int i27 = i26 % 2;
            }
            o.en.b bVarC = o.en.b.c();
            if (!bVarC.a()) {
                int i28 = f19967t + 75;
                f19965r = i28 % 128;
                int i29 = i28 % 2;
                bVarC.b(bVar.f19979n);
                int i30 = f19965r + 109;
                f19967t = i30 % 128;
                if (i30 % 2 == 0) {
                    int i31 = 3 % 5;
                }
            }
            if (bVarC.s()) {
                if (bVar.b()) {
                    int i32 = (-1339268403) * o.en.b.f24086a;
                    o.en.b.f24086a = i32;
                    new o.af.b((Context) o.en.b.a(-1657581939, i32, new Object[]{bVarC}, (int) Runtime.getRuntime().totalMemory(), 1657581940, (int) Thread.currentThread().getId(), Process.myPid()), new b.InterfaceC0328b() { // from class: o.aa.b.3
                        private static final byte[] $$a = null;
                        private static final int $$b = 0;
                        private static int $10 = 0;
                        private static int $11 = 0;

                        /* JADX INFO: renamed from: a */
                        private static char f20011a = 0;

                        /* JADX INFO: renamed from: d */
                        private static long f20012d = 0;

                        /* JADX INFO: renamed from: e */
                        private static int f20013e = 0;

                        /* JADX INFO: renamed from: h */
                        private static int f20014h = 0;

                        /* JADX INFO: renamed from: i */
                        private static int f20015i = 0;

                        /* JADX INFO: renamed from: b */
                        private /* synthetic */ OperationCallback f20016b;

                        private static String $$c(int i210, short s2, short s3) {
                            int i33 = i210 + 65;
                            byte[] bArr = $$a;
                            int i42 = 4 - (s2 * 2);
                            int i52 = s3 * 4;
                            byte[] bArr2 = new byte[i52 + 1];
                            int i62 = -1;
                            if (bArr == null) {
                                i42++;
                                i33 = i42 + i52;
                            }
                            while (true) {
                                i62++;
                                bArr2[i62] = (byte) i33;
                                if (i62 == i52) {
                                    return new String(bArr2, 0);
                                }
                                int i72 = bArr[i42];
                                i42++;
                                i33 += i72;
                            }
                        }

                        static {
                            init$0();
                            $10 = 0;
                            $11 = 1;
                            f20015i = 0;
                            f20014h = 1;
                            f20012d = 740602047300126166L;
                            f20013e = 1564493270;
                            f20011a = (char) 13110;
                        }

                        AnonymousClass3(OperationCallback operationCallback2) {
                            operationCallback = operationCallback2;
                        }

                        private static void f(char c2, String str, String str2, String str3, int i210, Object[] objArr4) throws Throwable {
                            String str4 = str;
                            String str5 = str2;
                            String str6 = str3;
                            int i33 = 2 % 2;
                            Object charArray = str6;
                            if (str6 != null) {
                                int i42 = $11 + 71;
                                $10 = i42 % 128;
                                int i52 = i42 % 2;
                                charArray = str6.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            Object charArray2 = str5;
                            if (str5 != null) {
                                int i62 = $10 + 115;
                                $11 = i62 % 128;
                                int i72 = i62 % 2;
                                charArray2 = str5.toCharArray();
                            }
                            char[] cArr2 = (char[]) charArray2;
                            Object charArray3 = str4;
                            if (str4 != null) {
                                charArray3 = str4.toCharArray();
                            }
                            i iVar = new i();
                            int length = cArr.length;
                            char[] cArr3 = new char[length];
                            int length2 = cArr2.length;
                            char[] cArr4 = new char[length2];
                            System.arraycopy(cArr, 0, cArr3, 0, length);
                            System.arraycopy(cArr2, 0, cArr4, 0, length2);
                            cArr3[0] = (char) (cArr3[0] ^ c2);
                            cArr4[2] = (char) (cArr4[2] + ((char) i210));
                            int length3 = ((char[]) charArray3).length;
                            char[] cArr5 = new char[length3];
                            iVar.f19932b = 0;
                            while (iVar.f19932b < length3) {
                                try {
                                    Object[] objArr22 = {iVar};
                                    Object objA = o.d.d.a(540069882);
                                    if (objA == null) {
                                        byte b2 = (byte) 0;
                                        byte b3 = b2;
                                        objA = o.d.d.a(Color.green(0) + 106, (char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, -155898465, false, $$c(b2, b3, b3), new Class[]{Object.class});
                                    }
                                    int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr22)).intValue();
                                    Object[] objArr32 = {iVar};
                                    Object objA2 = o.d.d.a(2068572);
                                    if (objA2 == null) {
                                        byte b4 = (byte) 3;
                                        byte b5 = (byte) (b4 - 3);
                                        objA2 = o.d.d.a(Gravity.getAbsoluteGravity(0, 0) + 847, (char) (6487 - Process.getGidForName("")), 13 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -694521287, false, $$c(b4, b5, b5), new Class[]{Object.class});
                                    }
                                    int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr32)).intValue();
                                    Object[] objArr42 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                                    Object objA3 = o.d.d.a(-1122996612);
                                    if (objA3 == null) {
                                        byte b6 = (byte) 1;
                                        byte b7 = (byte) (b6 - 1);
                                        objA3 = o.d.d.a(458 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1804962841, false, $$c(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                                    }
                                    ((Method) objA3).invoke(null, objArr42);
                                    Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                                    Object objA4 = o.d.d.a(-1223178239);
                                    if (objA4 == null) {
                                        byte b8 = (byte) 0;
                                        objA4 = o.d.d.a((ViewConfiguration.getTapTimeout() >> 16) + 639, (char) (65100 - KeyEvent.normalizeMetaState(0)), Color.blue(0) + 12, 1636969060, false, $$c((byte) 57, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                                    cArr3[iIntValue2] = iVar.f19933e;
                                    cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f20012d ^ 740602047300126166L)) ^ ((long) ((int) (((long) f20013e) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f20011a) ^ 740602047300126166L))));
                                    iVar.f19932b++;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            objArr4[0] = new String(cArr5);
                        }

                        static void init$0() {
                            $$a = new byte[]{44, 115, -31, MessagePack.Code.FLOAT32};
                            $$b = 186;
                        }

                        @Override // o.af.b.InterfaceC0328b
                        public final void a() throws Throwable {
                            int i210 = 2 % 2;
                            int i33 = f20014h + 47;
                            f20015i = i33 % 128;
                            if (i33 % 2 != 0) {
                                f.a();
                                throw null;
                            }
                            if (f.a()) {
                                Object[] objArr4 = new Object[1];
                                f((char) (54113 - KeyEvent.keyCodeFromString("")), "裟劵\ue85e潭\ud9e5㻯砄ᗕ流焫᪩꒤숼ሯ霁㏚螣", "\u0000\u0000\u0000\u0000", "ᢙ鹯愜跓", Color.green(0) + 480145176, objArr4);
                                String strIntern2 = ((String) objArr4[0]).intern();
                                Object[] objArr22 = new Object[1];
                                f((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), "뜹\udd49睧昽䥜\uf74d沍\udd29蚁祹絟ퟥ럠妲꒖嘶䕟䱡땭钝앃䄈醂桾䚙퓞\udaae\uec96婙륡褏侃\ueb67僾ម\u0010崋ﱧ폜짺⯂\ue869㟱뺃탼\uf017楧̲ꮰ\ude31焖뱕榿脥桂瑬\uf606\uebbb᳢", "\u0000\u0000\u0000\u0000", "\udc43ෘ\uf014뉪", 336451804 - View.MeasureSpec.getSize(0), objArr22);
                                f.c(strIntern2, ((String) objArr22[0]).intern());
                                int i42 = f20015i + 111;
                                f20014h = i42 % 128;
                                int i52 = i42 % 2;
                            }
                            b.this.a(null, null, null);
                            operationCallback.onSuccess(null);
                        }

                        @Override // o.af.b.InterfaceC0328b
                        public final void d(c cVar) throws Throwable {
                            int i210 = 2 % 2;
                            if (!(!f.a())) {
                                int i33 = f20015i + 73;
                                f20014h = i33 % 128;
                                int i42 = i33 % 2;
                                Object[] objArr4 = new Object[1];
                                f((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 54114), "裟劵\ue85e潭\ud9e5㻯砄ᗕ流焫᪩꒤숼ሯ霁㏚螣", "\u0000\u0000\u0000\u0000", "ᢙ鹯愜跓", 480145176 - (ViewConfiguration.getTouchSlop() >> 8), objArr4);
                                String strIntern2 = ((String) objArr4[0]).intern();
                                Object[] objArr22 = new Object[1];
                                f((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), "럦퉹\ud92f軹ࡰ鳠\u3097렕\udfca\udaa9\uf192銸\uefae싄쌰匈\ue5ae왨渙鍻ᗝﺜᕉ₳픇Їﳱ瀴猞粫ў傴旅뇳吞祡\uf73a\uef20♨\uf49b맟準퀸擜愐\udf5a\uf774䠣䐅鵃䡹\u0adc炻᷁髕ٙ\uf78f㦇鋀", "\u0000\u0000\u0000\u0000", "⾍멳쯌擢", (-860196050) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr22);
                                f.c(strIntern2, ((String) objArr22[0]).intern());
                                int i52 = f20014h + 99;
                                f20015i = i52 % 128;
                                int i62 = i52 % 2;
                            }
                            operationCallback.onError(o.by.c.b(cVar).a());
                        }
                    }, bVarC).n();
                    return null;
                }
                WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
                Object[] objArr4 = new Object[1];
                u(17 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0018\r\u001e\f\u000f\u0016)\u0014(\u0015)/\u001d\u0019\u001e\f㘪", (byte) (44 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr4);
                throw new WalletValidationException(walletValidationErrorCode, ((String) objArr4[0]).intern());
            }
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
            Object[] objArr5 = new Object[1];
            w((char) (57373 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 212 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.lastIndexOf("", '0') + 7, objArr5);
            String strIntern2 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            u(42 - Gravity.getAbsoluteGravity(0, 0), "\u001c&㘚㘚.\u0006\u0013\u001f&\u000f\u0006!\u0003\u0012\u001c\u0012㘘㘘(\f\u00110\u0010\n!\u0006\u0006/\u000b\u0002\"\u001c\u0003\u0013\".\u000e\u0015\"!,\u0014", (byte) (36 - View.getDefaultSize(0, 0)), objArr6);
            throw new WalletValidationException(walletValidationErrorCode2, strIntern2, ((String) objArr6[0]).intern());
        }
        b bVar2 = (b) objArr[0];
        String str = (String) objArr[1];
        OperationCallback operationCallback2 = (OperationCallback) objArr[2];
        int i33 = 2 % 2;
        if (f.a()) {
            Object[] objArr7 = new Object[1];
            w((char) (TextUtils.lastIndexOf("", '0') + 6047), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3, 18 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr7);
            String strIntern3 = ((String) objArr7[0]).intern();
            StringBuilder sb = new StringBuilder();
            Object[] objArr8 = new Object[1];
            w((char) (View.MeasureSpec.getSize(0) + 44081), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + ExifDirectoryBase.TAG_PRIMARY_CHROMATICITIES, 21 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr8);
            f.c(strIntern3, sb.append(((String) objArr8[0]).intern()).append(str).toString());
        }
        o.en.b bVarC2 = o.en.b.c();
        if (!bVarC2.a()) {
            bVarC2.b(bVar2.f19979n);
        }
        if (!bVarC2.s()) {
            WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.WrongState;
            Object[] objArr9 = new Object[1];
            w((char) (AndroidCharacter.getMirror('0') + 57324), View.resolveSizeAndState(0, 0, 0) + Mp4VideoDirectory.TAG_OPCOLOR, TextUtils.indexOf("", "") + 6, objArr9);
            String strIntern4 = ((String) objArr9[0]).intern();
            Object[] objArr10 = new Object[1];
            u((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 41, "\u001c&㘚㘚.\u0006\u0013\u001f&\u000f\u0006!\u0003\u0012\u001c\u0012㘘㘘(\f\u00110\u0010\n!\u0006\u0006/\u000b\u0002\"\u001c\u0003\u0013\".\u000e\u0015\"!,\u0014", (byte) (36 - (ViewConfiguration.getFadingEdgeLength() >> 16)), objArr10);
            throw new WalletValidationException(walletValidationErrorCode3, strIntern4, ((String) objArr10[0]).intern());
        }
        if (!bVar2.b()) {
            WalletValidationErrorCode walletValidationErrorCode4 = WalletValidationErrorCode.WrongState;
            Object[] objArr11 = new Object[1];
            u(TextUtils.lastIndexOf("", '0') + 18, "\u0018\r\u001e\f\u000f\u0016)\u0014(\u0015)/\u001d\u0019\u001e\f㘪", (byte) (43 - View.resolveSizeAndState(0, 0, 0)), objArr11);
            throw new WalletValidationException(walletValidationErrorCode4, ((String) objArr11[0]).intern());
        }
        List<o> list = bVar2.f19970a;
        if (list != null) {
            int i34 = f19965r + 23;
            f19967t = i34 % 128;
            int i35 = i34 % 2;
            Iterator<o> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().c().equals(str)) {
                    int i36 = f19965r + 87;
                    f19967t = i36 % 128;
                    int i37 = i36 % 2;
                }
            }
            WalletValidationErrorCode walletValidationErrorCode5 = WalletValidationErrorCode.WrongState;
            Object[] objArr12 = new Object[1];
            w((char) (Color.green(0) + 33528), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 314, (ViewConfiguration.getTapTimeout() >> 16) + 4, objArr12);
            throw new WalletValidationException(walletValidationErrorCode5, ((String) objArr12[0]).intern());
        }
        int i38 = o.en.b.f24086a * (-1339268403);
        o.en.b.f24086a = i38;
        new o.ae.d((Context) o.en.b.a(-1657581939, i38, new Object[]{bVarC2}, (int) Runtime.getRuntime().totalMemory(), 1657581940, (int) Thread.currentThread().getId(), Process.myPid()), new d.a() { // from class: o.aa.b.4
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: c */
            private static long f20018c = 0;

            /* JADX INFO: renamed from: d */
            private static int f20019d = 0;

            /* JADX INFO: renamed from: f */
            private static int f20020f = 0;

            /* JADX INFO: renamed from: g */
            private static int f20021g = 0;

            /* JADX INFO: renamed from: h */
            private static byte[] f20022h = null;

            /* JADX INFO: renamed from: i */
            private static short[] f20023i = null;

            /* JADX INFO: renamed from: j */
            private static int f20024j = 0;

            /* JADX INFO: renamed from: k */
            public static int f20025k = 0;

            /* JADX INFO: renamed from: l */
            public static int f20026l = 0;

            /* JADX INFO: renamed from: m */
            public static int f20027m = 0;

            /* JADX INFO: renamed from: n */
            public static int f20028n = 0;

            /* JADX INFO: renamed from: o */
            private static int f20029o = 0;

            /* JADX INFO: renamed from: p */
            public static int f20030p = 0;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ String f20031a;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ OperationCallback f20032b;

            private static String $$e(short v2, byte v3, byte v4) {
                /*
                    int r0 = r7 * 2
                    int r7 = 3 - r0
                    int r6 = r9 + 71
                    int r5 = r8 * 2
                    int r0 = r5 + 1
                    byte[] r4 = o.aa.b.AnonymousClass4.$$c
                    byte[] r3 = new byte[r0]
                    r2 = 0
                    if (r4 != 0) goto L27
                    r0 = r5
                    r1 = r2
                L13:
                    int r0 = -r0
                    int r6 = r6 + r0
                L15:
                    byte r0 = (byte) r6
                    r3[r1] = r0
                    int r7 = r7 + 1
                    if (r1 != r5) goto L22
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r3, r2)
                    return r0
                L22:
                    int r1 = r1 + 1
                    r0 = r4[r7]
                    goto L13
                L27:
                    r1 = r2
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass4.$$e(short, byte, byte):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                f20030p = -1163062142;
                f20028n = -75921871;
                f20027m = 1701118024;
                f20026l = 1321308741;
                f20025k = -57669481;
                init$0();
                f20020f = 0;
                f20029o = 1;
                f20018c = 1345913306149225290L;
                f20019d = -1213406101;
                f20021g = 1150422481;
                f20024j = -176370442;
                f20022h = new byte[]{74, 99, 109, -103, -109, -104, -117, 114, 98, -127, -114, 78, 97, -97, 105, -105, -79, 100, -114, 127, 69, 111, MessagePack.Code.MAP32, 99, -99, 44, 98, -127, -114, 78, 127, -105, -110, -104, 99, 57, 76, -83, 67, -97, -88, 5, -70, -1, 116, 69, 68, 67, -80, 72, -77, 42, 62, 62, 78, MessagePack.Code.FIXARRAY_PREFIX, -106, 101, 110, -100, 102, 105, -107, 109, 109, -128, -111, 97, 88, -84, 104, -104, -109, 98, -107, 83, MessagePack.Code.INT64, -107, 105, 43, -93, -101, -110, 109, 46};
            }

            AnonymousClass4(String str2, OperationCallback operationCallback22) {
                str = str2;
                operationCallback = operationCallback22;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(11:183|128|(1:130)(4:133|186|134|(7:136|182|142|(4:144|180|145|146)(1:150)|(6:184|152|(2:154|156)(1:155)|157|(1:159)(4:164|190|165|166)|(2:162|163))|170|171)(2:137|138))|131|132|182|142|(0)(0)|(0)|170|171) */
            /* JADX WARN: Removed duplicated region for block: B:144:0x0511 A[Catch: Exception -> 0x054b, TRY_LEAVE, TryCatch #1 {Exception -> 0x054b, blocks: (B:142:0x04c2, B:144:0x0511, B:146:0x053c, B:148:0x0544, B:149:0x054a, B:145:0x051b), top: B:182:0x04c2, inners: #0 }] */
            /* JADX WARN: Removed duplicated region for block: B:150:0x054b  */
            /* JADX WARN: Removed duplicated region for block: B:184:0x054e A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.Object[] e(int r30, int r31) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1684
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass4.e(int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{81, 52, -106, MessagePack.Code.FIXEXT4};
                $$b = 206;
            }

            static void init$1() {
                $$c = new byte[]{88, MessagePack.Code.INT64, 78, Ascii.GS};
                $$d = 48;
            }

            private static void q(String str2, int i210, Object[] objArr13) throws Throwable {
                String str22 = str2;
                int i39 = 2 % 2;
                char[] cArr = (char[]) (str22 != null ? str22.toCharArray() : str22);
                q qVar = new q();
                qVar.f19949d = i210;
                int length = cArr.length;
                long[] jArr = new long[length];
                qVar.f19948a = 0;
                while (qVar.f19948a < cArr.length) {
                    int i42 = qVar.f19948a;
                    try {
                        Object[] objArr22 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                        Object objA = o.d.d.a(-1011865131);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a(TextUtils.indexOf("", "") + 731, (char) (Color.green(0) + 7933), View.resolveSize(0, 0) + 11, 355847088, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i42] = ((Long) ((Method) objA).invoke(null, objArr22)).longValue() ^ (f20018c ^ 4743694005979712847L);
                        Object[] objArr32 = {qVar, qVar};
                        Object objA2 = o.d.d.a(1452497747);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA2 = o.d.d.a(837 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (27279 - (ViewConfiguration.getTapTimeout() >> 16)), TextUtils.indexOf("", "", 0, 0) + 11, -2145994442, false, $$e(b4, b5, (byte) ((-1) - (((-1) - b5) & ((-1) - 7)))), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA2).invoke(null, objArr32);
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
                    int i52 = $10 + 31;
                    $11 = i52 % 128;
                    int i62 = i52 % 2;
                    cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                    Object[] objArr42 = {qVar, qVar};
                    Object objA3 = o.d.d.a(1452497747);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objA3 = o.d.d.a((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 836, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 27280), 11 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -2145994442, false, $$e(b6, b7, (byte) ((b7 + 7) - (7 & b7))), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr42);
                    int i72 = $10 + 21;
                    $11 = i72 % 128;
                    int i82 = i72 % 2;
                }
                objArr13[0] = new String(cArr2);
            }

            private static void r(short s2, int i210, int i39, int i42, byte b2, Object[] objArr13) throws Throwable {
                int i52 = 2;
                int i62 = 2 % 2;
                j jVar = new j();
                StringBuilder sb2 = new StringBuilder();
                try {
                    Object[] objArr22 = {Integer.valueOf(i42), Integer.valueOf(f20021g)};
                    Object objA = o.d.d.a(-727631768);
                    float f2 = 0.0f;
                    long j2 = 0;
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a((ViewConfiguration.getPressedStateDuration() >> 16) + 238, (char) (44532 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10, 35969549, false, $$e(b3, b4, (byte) ((b4 + 33) - (33 & b4))), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr22)).intValue();
                    int i72 = iIntValue == -1 ? 1 : 0;
                    if (i72 != 0) {
                        int i82 = $10 + 105;
                        $11 = i82 % 128;
                        if (i82 % 2 == 0) {
                            throw null;
                        }
                        byte[] bArr = f20022h;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            int i92 = 0;
                            while (i92 < length) {
                                int i102 = $11 + 67;
                                $10 = i102 % 128;
                                int i112 = i102 % i52;
                                Object[] objArr32 = {Integer.valueOf(bArr[i92])};
                                Object objA2 = o.d.d.a(-1239398195);
                                if (objA2 == null) {
                                    byte b5 = (byte) 0;
                                    byte b6 = b5;
                                    objA2 = o.d.d.a(View.resolveSize(0, 0) + IptcDirectory.TAG_COPYRIGHT_NOTICE, (char) (28649 - (AudioTrack.getMinVolume() > f2 ? 1 : (AudioTrack.getMinVolume() == f2 ? 0 : -1))), 12 - (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)), 1621469864, false, $$e(b5, b6, (byte) ((b6 + 32) - (b6 & 32))), new Class[]{Integer.TYPE});
                                }
                                bArr2[i92] = ((Byte) ((Method) objA2).invoke(null, objArr32)).byteValue();
                                i92++;
                                i52 = 2;
                                f2 = 0.0f;
                                j2 = 0;
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            byte[] bArr3 = f20022h;
                            Object[] objArr42 = {Integer.valueOf(i210), Integer.valueOf(f20019d)};
                            Object objA3 = o.d.d.a(-727631768);
                            if (objA3 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                objA3 = o.d.d.a(View.combineMeasuredStates(0, 0) + 238, (char) (44532 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 11 - View.MeasureSpec.getSize(0), 35969549, false, $$e(b7, b8, (byte) ((b8 + 33) - (33 & b8))), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr42)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f20021g) ^ (-7649639543924978291L))));
                        } else {
                            iIntValue = (short) (((short) (((long) f20023i[i210 + ((int) (((long) f20019d) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f20021g) ^ (-7649639543924978291L))));
                        }
                    }
                    if (iIntValue > 0) {
                        jVar.f19936d = ((i210 + iIntValue) - 2) + ((int) (((long) f20019d) ^ (-7649639543924978291L))) + i72;
                        Object[] objArr52 = {jVar, Integer.valueOf(i39), Integer.valueOf(f20024j), sb2};
                        Object objA4 = o.d.d.a(1819197256);
                        if (objA4 == null) {
                            objA4 = o.d.d.a(1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (5358 - (ViewConfiguration.getScrollBarSize() >> 8)), 11 - ExpandableListView.getPackedPositionType(0L), -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objA4).invoke(null, objArr52)).append(jVar.f19937e);
                        jVar.f19935c = jVar.f19937e;
                        byte[] bArr4 = f20022h;
                        if (bArr4 != null) {
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            for (int i122 = 0; i122 < length2; i122++) {
                                bArr5[i122] = (byte) (((long) bArr4[i122]) ^ (-7649639543924978291L));
                            }
                            bArr4 = bArr5;
                        }
                        boolean z2 = bArr4 != null;
                        jVar.f19934b = 1;
                        while (jVar.f19934b < iIntValue) {
                            int i132 = $11 + 25;
                            $10 = i132 % 128;
                            int i142 = i132 % 2;
                            if (z2) {
                                byte[] bArr6 = f20022h;
                                jVar.f19936d = jVar.f19936d - 1;
                                jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                            } else {
                                short[] sArr = f20023i;
                                jVar.f19936d = jVar.f19936d - 1;
                                jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r3]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                            }
                            sb2.append(jVar.f19937e);
                            jVar.f19935c = jVar.f19937e;
                            jVar.f19934b++;
                        }
                    }
                    objArr13[0] = sb2.toString();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            private static void s(byte v2, short v3, int v4, Object[] v5) {
                /*
                    int r0 = r8 * 4
                    int r0 = 100 - r0
                    byte[] r8 = o.aa.b.AnonymousClass4.$$a
                    int r2 = r9 + 4
                    int r1 = r7 * 3
                    int r7 = r1 + 1
                    byte[] r6 = new byte[r7]
                    r5 = 0
                    if (r8 != 0) goto L2c
                    r4 = r5
                    r3 = r7
                L13:
                    int r0 = -r0
                    int r0 = r0 + r3
                    r3 = r4
                L16:
                    byte r1 = (byte) r0
                    int r4 = r3 + 1
                    r6[r3] = r1
                    if (r4 != r7) goto L25
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r6, r5)
                    r10[r5] = r0
                    return
                L25:
                    int r2 = r2 + 1
                    r1 = r8[r2]
                    r3 = r0
                    r0 = r1
                    goto L13
                L2c:
                    r3 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass4.s(byte, short, int, java.lang.Object[]):void");
            }

            @Override // o.ae.d.a
            public final void a() throws Throwable {
                if (f.a()) {
                    Object[] objArr13 = new Object[1];
                    q("ๆ⸤件溁轚꿐쾤\uec4eఌⳉ䵊洫跷궍쩔\ueae3ધ", 8268 - ExpandableListView.getPackedPositionChild(0L), objArr13);
                    String strIntern5 = ((String) objArr13[0]).intern();
                    Object[] objArr22 = new Object[1];
                    q("\u0e77⿏䴶歧裏ꘋ쑜\ue5ad̏ⅆ廳粭騑뮉\ud9f9\uf707ᓇ㋊倏熝꿅촻\ueb7bࣙ☮䑳斱茔ꅲ\udea3ﳤᩗ㮀姹睈", 8623 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr22);
                    f.c(strIntern5, ((String) objArr22[0]).intern());
                }
                synchronized (b.this.f19972c) {
                    if (b.this.f19970a != null) {
                        Iterator<o> it2 = b.this.f19970a.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            } else if (it2.next().c().equals(str)) {
                                it2.remove();
                                break;
                            }
                        }
                    }
                    b.this.e();
                }
                operationCallback.onSuccess(null);
            }

            @Override // o.ae.d.a
            public final void b(c cVar) throws Throwable {
                int i210 = 2 % 2;
                if (f.a()) {
                    int i39 = f20029o + 115;
                    f20020f = i39 % 128;
                    int i42 = i39 % 2;
                    Object[] objArr13 = new Object[1];
                    q("ๆ⸤件溁轚꿐쾤\uec4eఌⳉ䵊洫跷궍쩔\ueae3ધ", ExpandableListView.getPackedPositionType(0L) + 8269, objArr13);
                    String strIntern5 = ((String) objArr13[0]).intern();
                    Object[] objArr22 = new Object[1];
                    r((short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 213980698 - View.combineMeasuredStates(0, 0), 1309753079 + (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionType(0L) - 93, (byte) (29 - View.getDefaultSize(0, 0)), objArr22);
                    f.c(strIntern5, ((String) objArr22[0]).intern());
                }
                operationCallback.onError(o.by.c.b(cVar).a());
                int i52 = f20029o + 61;
                f20020f = i52 % 128;
                int i62 = i52 % 2;
            }
        }, bVarC2).a(str2);
        return null;
    }

    static void a() {
        f19960k = new char[]{64634, 64581, 64628, 64622, 64593, 64587, 64627, 64596, 64590, 64582, 64585, 64609, 64591, 64629, 64592, 64625, 64577, 64517, 64612, 64631, 64578, 64620, 64595, 64624, 64597, 64618, 64604, 64614, 64621, 64617, 64579, 64626, 64599, 64588, 64586, 64580, 64598, 64583, 64584, 64589, 64630, 64623, 64632, 64633, 64619, 64521, 64520, 64523, 64576};
        f19964q = (char) 51640;
        f19966s = new char[]{38024, 17269, 15205, 33583, 21746, 11489, 1241, 56527, 46210, 36015, 25762, 15517, 5271, 60501, 50283, 40026, 29767, 19511, 9255, 64574, 38016, 17253, 15223, 4928, 52074, 41773, 39724, 29471, 11019, 771, 64498, 54257, 35790, 25595, 23457, 13234, 60340, 50057, 48017, 37412, 18999, 8712, 6746, 61993, 43553, 33314, 31263, 20996, 2814, 58109, 56010, 45724, 27377, 17138, 14982, 4804, 51865, 41319, 39280, 29002, 10571, 343, 63846, 53614, 35146, 38016, 17253, 15223, 4928, 52074, 41773, 39724, 29471, 11019, 771, 64498, 54257, 35790, 25595, 23457, 13234, 60340, 50057, 48017, 37412, 18999, 8712, 6747, 61985, 43570, 33316, 31263, 21076, 2798, 58109, 56013, 45774, 27339, 17072, 15010, 4737, 51870, 41256, 39293, 28995, 10572, 342, 63791, 53555, 35103, 24842, 23023, 12776, 59899, 49615, 47576, 37348, 18935, 8648, 6551, 61547, 43116, 32895, 30804, 20573, 2084, 57407, 55374, 45077, 26630, 46952, 24716, 6300, 12457, 59564, 32988, 47298, 20711, 2251, 8443, 55312, 61451, 43066, 16429, 30802, 19818, 39578, 58015, 51899, 4753, 31425, 17098, 43761, 62192, 56039, 8728, 2588, 39492, 19873, 13747, 7556, 50606, 44521, 38376, 32219, 9679, 3527, 62774, 56629, 34058, 27967, 21861, 15734, 58736, 52557, 46421, 55514, 3882, 30526, 24327, 34580, 61255, 55156, 16211, 26440, 12804, 58868, 40435, 46577, 28098, 1470, 15782, 54665, 36242, 42381, 23892, 30052, 11593, 50509, 64798, 38190, 19767, 25880, 7441, 13552, 60636, 34000, 48347, 21685, 3216, 9459, 56487, 29881, 41853, 56166, 62292, 11075, 17184, 38037, 17253, 15202, 4967, 52047, 41787, 39722, 29443, 11023, 789, 64500, 54212, 35800, 25559, 23464, 13237, 60350, 50053, 48086, 37417, 19002, 8826, 6747, 62008, 43575, 33314, 31240, 21076, 2793, 58105, 56013, 45780, 27351, 17120, 15008, 4741, 51862, 41341, 39291, 47540, 28228, 5699, 15942, 59002, 36379, 46619, 24093, 1585, 11838, 54977, 65244, 42727, 20220, 30364, 12090, 63689, 32982, 43245, 28898, 6273, 8369, 51381, 37053, 47272, 16453, 26709, 12387, 55398, 57379, 34846, 20506, 30735, ';', 10714, 61906, 39415, 38065, 17260, 15231, 4935, 52049, 41756, 39729, 29500, 11011, 777, 64453, 54261, 35800, 25564, 23454, 13230, 60349, 50054, 48031, 37480, 19071, 5705, 49561, 47516, 37304, 14513, 61268, 38730, 49018, 26493, 3868, 14124, 57148, 34593, 44837, 22423, 32648, 10171, 53226, 63390, 40863, 18311, 28568, 6051, 15887, 58891};
        f19963p = -8969721450980293888L;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o.aa.b c(android.content.Context r3) {
        /*
            r2 = 2
            int r0 = r2 % r2
            int r0 = o.aa.b.f19965r
            int r1 = r0 + 11
            int r0 = r1 % 128
            o.aa.b.f19967t = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L2d
            o.aa.b r1 = o.aa.b.f19962o
            r0 = 43
            int r0 = r0 / 0
            if (r1 != 0) goto L2a
        L16:
            o.aa.b r0 = new o.aa.b
            r0.<init>(r3)
            o.aa.b.f19962o = r0
            int r0 = o.aa.b.f19965r
            int r1 = r0 + 109
            int r0 = r1 % 128
            o.aa.b.f19967t = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L2a
            r0 = 4
            int r0 = r0 / r2
        L2a:
            o.aa.b r0 = o.aa.b.f19962o
            return r0
        L2d:
            o.aa.b r0 = o.aa.b.f19962o
            if (r0 != 0) goto L2a
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aa.b.c(android.content.Context):o.aa.b");
    }

    private boolean c() {
        int i2 = 2 % 2;
        Long l2 = this.f19971b;
        if (l2 == null) {
            return false;
        }
        int i3 = f19965r + 71;
        f19967t = i3 % 128;
        if (i3 % 2 == 0) {
            if (l2.longValue() + 20000 <= System.currentTimeMillis()) {
                return false;
            }
        } else if (l2.longValue() + 20000 <= System.currentTimeMillis()) {
            return false;
        }
        int i4 = f19965r + 9;
        f19967t = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void d() {
        synchronized (this.f19972c) {
            Context context = this.f19979n;
            Object[] objArr = new Object[1];
            u(47 - ((Process.getThreadPriority(0) + 20) >> 6), C1561oA.yd("TU]Z?=dCLGUR75\\;d_hMvUenYc\\SBcgb7B!\u001427C8;.:\u0010\u001e<竌", (short) (C1499aX.Xd() ^ (-9145))), (byte) (Color.argb(0, 0, 0, 0) + 94), objArr);
            Object[] objArr2 = {((String) objArr[0]).intern(), 0};
            Method method = Class.forName(C1561oA.Yd("-;2A?:6\u00017DDK=GN\t\u001fLLSEYV", (short) (Od.Xd() ^ (-15681)))).getMethod(Jg.Wd("\u0016kW\u0010:\fxDX\u001e\u001d)}U@L\nVu\\", (short) (OY.Xd() ^ 9276), (short) (OY.Xd() ^ 15465)), Class.forName(Xg.qd("+#9%r2(60w\u001e@?7=7", (short) (C1633zX.Xd() ^ (-21353)), (short) (C1633zX.Xd() ^ (-12779)))), Integer.TYPE);
            try {
                method.setAccessible(true);
                SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr2);
                Object[] objArr3 = new Object[1];
                w((char) ((-1) - TextUtils.lastIndexOf("", '0')), ViewConfiguration.getPressedStateDuration() >> 16, 4 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
                String string = sharedPreferences.getString(((String) objArr3[0]).intern(), "");
                if (string.isEmpty()) {
                    if (f.a()) {
                        Object[] objArr4 = new Object[1];
                        w((char) (6046 - View.MeasureSpec.makeMeasureSpec(0, 0)), 3 - (ViewConfiguration.getTapTimeout() >> 16), 18 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr4);
                        String strIntern = ((String) objArr4[0]).intern();
                        Object[] objArr5 = new Object[1];
                        u(39 - View.MeasureSpec.getMode(0), ZO.xd("um\u000b\u001b\u0018pl~l\u0006y\u0004\\Lw8..VE5\u0017\u0004}$qQ[s\u000b=i\f\u001c\u001e\u001ccl㒜", (short) (C1607wl.Xd() ^ 23194), (short) (C1607wl.Xd() ^ 8961)), (byte) (51 - TextUtils.getTrimmedLength("")), objArr5);
                        f.c(strIntern, ((String) objArr5[0]).intern());
                    }
                    return;
                }
                String strC = new o.dk.a(this.f19979n).c(string);
                if (f.a()) {
                    Object[] objArr6 = new Object[1];
                    w((char) (6047 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.indexOf("", "") + 3, 17 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr6);
                    String strIntern2 = ((String) objArr6[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr7 = new Object[1];
                    w((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 20 - TextUtils.getCapsMode("", 0, 0), 45 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr7);
                    f.c(strIntern2, sb.append(((String) objArr7[0]).intern()).append(strC).toString());
                }
                if (strC != null && !strC.isEmpty()) {
                    try {
                        o.ef.a aVar = new o.ef.a(strC);
                        Object[] objArr8 = new Object[1];
                        w((char) (TextUtils.lastIndexOf("", '0') + 9210), (-16777086) - Color.rgb(0, 0, 0), TextUtils.getCapsMode("", 0, 0) + 15, objArr8);
                        this.f19973d = a.b(aVar.x(((String) objArr8[0]).intern()));
                        Object[] objArr9 = new Object[1];
                        w((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 55803), 145 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 12, objArr9);
                        Object[] objArr10 = {aVar, ((String) objArr9[0]).intern()};
                        int iUptimeMillis = (int) SystemClock.uptimeMillis();
                        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                        int iMyUid = Process.myUid();
                        int i2 = o.ef.a.f23780n * (-1229108307);
                        o.ef.a.f23780n = i2;
                        this.f19970a = d.e((o.ef.c) o.ef.a.a(-1398121910, objArr10, iMyUid, i2, 1398121917, iUptimeMillis, iElapsedRealtime));
                        Object[] objArr11 = new Object[1];
                        u(12 - (ViewConfiguration.getScrollBarSize() >> 8), C1626yg.Ud("3k\f\u0006sc츲ᮝ\bC\u0010\u001a", (short) (OY.Xd() ^ 3636), (short) (OY.Xd() ^ 207)), (byte) (102 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr11);
                        this.f19971b = aVar.n(((String) objArr11[0]).intern());
                    } catch (o.ef.b e2) {
                        if (f.a()) {
                            Object[] objArr12 = new Object[1];
                            w((char) (6045 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 4 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 17 - TextUtils.indexOf("", ""), objArr12);
                            String strIntern3 = ((String) objArr12[0]).intern();
                            Object[] objArr13 = new Object[1];
                            w((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3779), 157 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf("", "", 0) + 19, objArr13);
                            f.e(strIntern3, ((String) objArr13[0]).intern(), e2);
                        }
                        a(null, null, null);
                    }
                    return;
                }
                if (f.a()) {
                    Object[] objArr14 = new Object[1];
                    w((char) (6046 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 3 - (ViewConfiguration.getWindowTouchSlop() >> 8), 17 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr14);
                    String strIntern4 = ((String) objArr14[0]).intern();
                    Object[] objArr15 = new Object[1];
                    w((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 65, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 65, objArr15);
                    f.d(strIntern4, ((String) objArr15[0]).intern());
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    private static List<String> e(o.en.b bVar) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, DigitalCard> entry : bVar.b(false).entrySet()) {
            int i4 = f19965r + 27;
            f19967t = i4 % 128;
            int i5 = i4 % 2;
            DigitalCard value = entry.getValue();
            try {
                if (value.getStatus() == CardStatus.Active && value.getClickToPayService().getStatus() == DigitalCardServiceStatus.Active) {
                    arrayList.add(entry.getKey());
                }
                i2 = f19967t + 55;
            } catch (WalletValidationException e2) {
                if (f.a()) {
                    Object[] objArr = new Object[1];
                    w((char) (6046 - Color.green(0)), 2 - MotionEvent.axisFromString(""), TextUtils.indexOf("", "", 0, 0) + 17, objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    w((char) (Color.blue(0) + 42641), 185 - View.resolveSize(0, 0), 'K' - AndroidCharacter.getMirror('0'), objArr2);
                    f.e(strIntern, ((String) objArr2[0]).intern(), e2);
                    int i6 = f19967t + 95;
                    f19965r = i6 % 128;
                    int i7 = i6 % 2;
                }
                i2 = f19967t + 35;
            }
            f19965r = i2 % 128;
            int i8 = i2 % 2;
        }
        return arrayList;
    }

    static void init$0() {
        $$a = new byte[]{84, 109, 90, 4};
        $$b = 226;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void u(int r28, java.lang.String r29, byte r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aa.b.u(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void w(char r22, int r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.aa.b.w(char, int, int, java.lang.Object[]):void");
    }

    public final void a(OperationCallback<List<o>> operationCallback) throws Throwable {
        if (f.a()) {
            Object[] objArr = new Object[1];
            w((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6045), 4 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 17 - TextUtils.getOffsetBefore("", 0), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            w((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11553), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 256, 16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        o.en.b bVarC = o.en.b.c();
        if (!bVarC.a()) {
            bVarC.b(this.f19979n);
        }
        if (!bVarC.s()) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr3 = new Object[1];
            w((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 57373), View.getDefaultSize(0, 0) + Mp4VideoDirectory.TAG_OPCOLOR, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 5, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            u(42 - View.MeasureSpec.getMode(0), "\u001c&㘚㘚.\u0006\u0013\u001f&\u000f\u0006!\u0003\u0012\u001c\u0012㘘㘘(\f\u00110\u0010\n!\u0006\u0006/\u000b\u0002\"\u001c\u0003\u0013\".\u000e\u0015\"!,\u0014", (byte) (35 - TextUtils.indexOf((CharSequence) "", '0', 0)), objArr4);
            throw new WalletValidationException(walletValidationErrorCode, strIntern2, ((String) objArr4[0]).intern());
        }
        if (!c() || this.f19970a == null) {
            synchronized (this.f19974e) {
                this.f19975f.add(operationCallback);
                if (this.f19977h == null) {
                    e eVar = new e(this.f19979n, this.f19978m, bVarC);
                    this.f19977h = eVar;
                    eVar.c(e(bVarC));
                }
            }
            return;
        }
        if (f.a()) {
            Object[] objArr5 = new Object[1];
            w((char) (6045 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getEdgeSlop() >> 16) + 3, 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr5);
            String strIntern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            u((KeyEvent.getMaxKeyCode() >> 16) + 36, "\u001b\u0006\u0006\u0019'\u001c\u0014\t!\u001c\u001f\"\r-&\u000f-\u0012\u0014/\u0000\u0012!\u0004\u0010\n%\u0007).\u000f\u0018&\u0007\u0014*", (byte) (4 - KeyEvent.normalizeMetaState(0)), objArr6);
            f.c(strIntern3, ((String) objArr6[0]).intern());
        }
        operationCallback.onSuccess(this.f19970a);
    }

    final void a(k kVar, List<o> list, Long l2) throws Throwable {
        if (f.a()) {
            Object[] objArr = new Object[1];
            w((char) (6047 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 3 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 16, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            w((char) (19530 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Color.argb(0, 0, 0, 0) + 176, 9 - View.MeasureSpec.getMode(0), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        synchronized (this.f19972c) {
            this.f19973d = kVar;
            this.f19970a = list;
            this.f19971b = l2;
            e();
        }
    }

    public final void b(k kVar, o.er.n nVar, OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f19967t + 53;
            f19965r = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            w((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 6046), 4 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            u(TextUtils.lastIndexOf("", '0', 0, 0) + 22, "\u0011\u0015\u000e%\u0006.\u0015\u0014'\u0001\u001f).\"\u000b\"\u001c\u001f\u001f\f㙐", (byte) (81 - TextUtils.getOffsetAfter("", 0)), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        o.en.b bVarC = o.en.b.c();
        if (!bVarC.a()) {
            bVarC.b(this.f19979n);
        }
        if (!bVarC.s()) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr3 = new Object[1];
            w((char) (57371 - MotionEvent.axisFromString("")), Color.alpha(0) + Mp4VideoDirectory.TAG_OPCOLOR, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            u((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 41, "\u001c&㘚㘚.\u0006\u0013\u001f&\u000f\u0006!\u0003\u0012\u001c\u0012㘘㘘(\f\u00110\u0010\n!\u0006\u0006/\u000b\u0002\"\u001c\u0003\u0013\".\u000e\u0015\"!,\u0014", (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 36), objArr4);
            throw new WalletValidationException(walletValidationErrorCode, strIntern2, ((String) objArr4[0]).intern());
        }
        if (!b()) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
            Object[] objArr5 = new Object[1];
            u(KeyEvent.normalizeMetaState(0) + 17, "\u0018\r\u001e\f\u000f\u0016)\u0014(\u0015)/\u001d\u0019\u001e\f㘪", (byte) (42 - ExpandableListView.getPackedPositionChild(0L)), objArr5);
            throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr5[0]).intern());
        }
        int i5 = (-1339268403) * o.en.b.f24086a;
        o.en.b.f24086a = i5;
        new o.ag.b((Context) o.en.b.a(-1657581939, i5, new Object[]{bVarC}, (int) Runtime.getRuntime().totalMemory(), 1657581940, (int) Thread.currentThread().getId(), Process.myPid()), new b.e() { // from class: o.aa.b.2
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;
            public static int A = 0;
            public static int B = 0;
            public static int C = 0;
            public static int D = 0;

            /* JADX INFO: renamed from: a */
            private static long f19985a = 0;

            /* JADX INFO: renamed from: b */
            private static char[] f19986b = null;

            /* JADX INFO: renamed from: f */
            private static int f19987f = 0;

            /* JADX INFO: renamed from: g */
            public static int f19988g = 0;

            /* JADX INFO: renamed from: h */
            public static int f19989h = 0;

            /* JADX INFO: renamed from: i */
            public static int f19990i = 0;

            /* JADX INFO: renamed from: j */
            private static int f19991j = 0;

            /* JADX INFO: renamed from: k */
            public static int f19992k = 0;

            /* JADX INFO: renamed from: l */
            public static int f19993l = 0;

            /* JADX INFO: renamed from: m */
            public static int f19994m = 0;

            /* JADX INFO: renamed from: n */
            public static int f19995n = 0;

            /* JADX INFO: renamed from: o */
            public static int f19996o = 0;

            /* JADX INFO: renamed from: p */
            public static int f19997p = 0;

            /* JADX INFO: renamed from: q */
            public static int f19998q = 0;

            /* JADX INFO: renamed from: r */
            public static int f19999r = 0;

            /* JADX INFO: renamed from: s */
            public static int f20000s = 0;

            /* JADX INFO: renamed from: t */
            public static int f20001t = 0;

            /* JADX INFO: renamed from: u */
            public static int f20002u = 0;

            /* JADX INFO: renamed from: v */
            public static int f20003v = 0;

            /* JADX INFO: renamed from: w */
            public static int f20004w = 0;

            /* JADX INFO: renamed from: x */
            public static int f20005x = 0;

            /* JADX INFO: renamed from: y */
            public static int f20006y = 0;

            /* JADX INFO: renamed from: z */
            public static int f20007z = 0;

            /* JADX INFO: renamed from: c */
            private /* synthetic */ OperationCallback f20008c;

            /* JADX INFO: renamed from: d */
            private /* synthetic */ k f20009d;

            private static String $$e(short v2, byte v3, int v4) {
                /*
                    int r8 = 105 - r11
                    int r0 = r9 * 2
                    int r7 = r0 + 4
                    byte[] r6 = o.aa.b.AnonymousClass2.$$c
                    int r0 = r10 * 3
                    int r5 = 1 - r0
                    byte[] r4 = new byte[r5]
                    r3 = 0
                    if (r6 != 0) goto L28
                    r0 = r8
                    r2 = r3
                    r8 = r5
                L14:
                    int r7 = r7 + 1
                    int r8 = r8 + r0
                    r1 = r2
                L18:
                    int r2 = r1 + 1
                    byte r0 = (byte) r8
                    r4[r1] = r0
                    if (r2 != r5) goto L25
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    return r0
                L25:
                    r0 = r6[r7]
                    goto L14
                L28:
                    r1 = r3
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass2.$$e(short, byte, int):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                D = 98902529;
                C = 1045445059;
                B = 1120186689;
                A = -220517875;
                f20007z = 1646458863;
                f20006y = 1539746776;
                f20005x = -321357826;
                f20004w = -2143091830;
                f20003v = 680293734;
                f20002u = -1088982976;
                f20001t = -899950679;
                f20000s = 90771198;
                f19999r = -419979649;
                f19998q = -136234142;
                f19997p = -902311169;
                f19996o = -1697851633;
                f19995n = -2117389108;
                f19994m = 1841541462;
                f19993l = -483018444;
                f19992k = -1694487863;
                f19990i = -1570764895;
                f19989h = -777096513;
                f19988g = 1820647036;
                init$0();
                f19987f = 0;
                f19991j = 1;
                char[] cArr = new char[2026];
                ByteBuffer.wrap("\u0094±WF\u0013+ß\u0019\u009bùG\u009e\u0003\u008dÎJ\u008aSv\u00132ÏþÛº¼ek!Eí?©\u0000 ðã-§Qkl/\u0091óØ·Öz\u0018>6Âi\u0086\u009aJ \u000eÀÑ\u000f\u0095\u0005Y_\u001dj!»åÜ©ál\u00000\u001dô8¸Í|ª\u0000óÃ6\u0087\u007fKu\u000f\u00adÓ \u0097Þ[í\u001e\u001e\"@æ~ª\u0091nÒ2øõ\b¹7}\\\u0001\u009bÅ©\u0089æL\u001c\u0010'ÔI\u0098v\\\u008e`À$îç\u0006«Xof3\u009e\u0005ßÆ\u0002\u0082~NC\n¾Ö÷\u0092ù_7\u001b\u0019çF£µo\u008f+ïô °*|p8E\u0004\u0094Àó\u008cÎI/\u00152Ñ\u0017\u009dâY\u0085%Üæ\u0019¢PnZ*\u0082ö\u008f²ñ~Â;1\u0007oÃQ\u008f¾Ký\u0017×Ð'\u009c\u0018Xs$´à\u0086¬Éi35\bñf½Yy´Eû\u0001ËÂ&\u008egJH\u0016§\u0094ÝWN\u0013'ß\f\u009b½G\u00ad\u0003\u008dÎv\u008aVv\f2ëþÉººeU!Cí>©\u0016\u0095ØQ§\u001d\u0089Øa\u0084\u0015@\u0011\fêÈÓ´\u0089wg\u0094ÝWN\u0013'ß\f\u009b½G\u00ad\u0003\u008dÎv\u008aVv\f2ëþÉººeU!Rí3©\u0002\u0095ÏQ\u009d\u001d\u009eØb\u00848@\u0001\fîÈÖøÁ;R\u007f;³\u0010÷¡+±o\u0091¢jæJ\u001a\u0010^÷\u0092ÕÖ¦\tIMM\u0081?Å\u0000ùÕ\u009aÃYG\u001d%Ñ\u0017\u0095£I¹\r\u0093À`\u0084Yx\u0018<ùð\u008b´«k{/Pã §\n\u009bÝ_¯\u0013\u008cÖS\u008a6N\u001d\u0002ðÆØº\u0091yn=]\u0094ÝWO\u00136ß\u0019\u009b½G®\u0003\u0085Î4\u008aBv\u00182íþÊ\u0094ÝWO\u00136ß\u0019\u009b½G¹\u0003\u008bÎw\u008a\u001cv\u001a2ðþÕº¢\u0094ÝWY\u0013&ß\u0019\u009bóG¸\u0003\u0086Î5\u008a`v,2ÏþÕº¤eo!fí;©\u0006\u0095Ë\u0094ÝWY\u0013;ß\t\u009bæG¯\u0003\u008fÎ5\u008a^v\u00032àþ\u0095º¾ec!@í4©\u0010\u0095\u0084Q±\u001d\u0095\u0089\u007fJ¬\u000eÊÂû\u0086\u0012Z]\u0094ÝWY\u0013;ß\t\u009bæG¯\u0003\u008fÎ5\u008aPv\u00032ìþ\u0095º¼eo!Oí/©$\u0095çQï\u001d\u0094Øw\u0084'@\u0017\f·ÈÑ´\u0085wl3Nÿ »ågÎ\u0094ÝWY\u0013;ß\t\u009bæG¯\u0003\u008fÎ5\u008aPv\u00032ìþ\u0095º¼eo!Oí/©$\u0095çQï\u001d\u008aØ`\u0084%@\u0012\u0094ÝWY\u0013;ß\t\u009bæG¯\u0003\u008fÎ5\u008a^v\u00032àþ\u0095º¾ec!@í4©\u0017\u0095ÇQ·\u001d¬Ø_\u0084:@\u0010\fõÈÂ´Äwq3U\u001a§Ù4\u009d]Qv\u0015ÇÉÞ\u008dý@\r\u0004=øw¼\u008dp¥4Ûë\u0004\u0094\u0080WE\u0013lß\u0018\u009bçG£\u0003\u008eÎ~\u008a\u001cv\u00022íþÉº¦-\u001cîÏª£f\u0089\"wþdº\fwÿ3Æ\u0094ÝWZ\u00130ß\u0015\u009bñGå\u0003\u0084Îs\u008a^v\u000f2ñþÃº¡e~!Gí7©\u0001îI-\u009aiú¥Úá4=y\u0094\u0080WE\u0013lß\n\u009bàG¥\u0003\u0086Îo\u008aQv\u001e2¬þ×º³ed!Wí<©\u0013\u0095ÉQ¶\u001d\u008fØ`\u0084/@\u0010\u0094\u0095WO\u0013,ß\u0003\u0094\u0082WO\u00130ß\t\u009bûG¹\u0003\u0096Î4\u008aAv\u00132ñþ\u0094º°en!\fí>©\u0017\u0095ÈQ·\u001d\u009dØ<\u0084-@\u0012\fïÈ\u009c´\u008cwc3Qÿ7»ÕgÅ#ªï\u0087ªu\u00960R\u001f\u001eüÚ®\u0086\u0087Ah\rWÉ\u0018l¢¯oë\u0010')cÛ¿\u0099û¶6\u0014ra\u008e3ÊÑ\u0006´B\u0090\u009dNÙ,\u0015\u001eQ7mè©\u0097å½ \u001c|\r¸2ôÏ0¼L¬\u008fCËq\u0007\u0017Cõ\u009fåÛ\u008a\u0017§RUn\u0014ª?æÜ\"\u008e~\u00ad¹H\u0094\u0082WO\u00130ß\t\u009bûG¹\u0003\u0096Î4\u008aAv\u00132ñþ\u0094º°en!\fí>©\u0017\u0095ÈQ·\u001d\u009dØ<\u00848@\r\f´ÈÑ´\u009bwk\u0094\u0082WO\u00130ß\t\u009bûG¹\u0003\u0096Î4\u008aAv\u00132ñþ\u0094º°en!\fí>©\u0017\u0095ÈQ·\u001d\u009dØ<\u00848@\r\f´ÈÞ´\u008bwa\u0094\u0082WO\u00130ß\t\u009bûG¹\u0003\u0096Î4\u008aAv\u00132ñþ\u0094º°en!\fí>©\u0017\u0095ÈQ·\u001d\u009dØ<\u00848@\r\f´Èß´\u0089wa\u0094\u0082WO\u00130ß\t\u009bûG¹\u0003\u0096Î4\u008aAv\u00132ñþ\u0094º°en!\fí>©\u0017\u0095ÈQ·\u001d\u009dØ<\u00848@\r\f´Èß´\u0084wa 7cû'\u009eë±¯Rs\u001f\u0094®Wk\u0094ÝWZ\u00130ß\u0015\u009bñGå\u0003\u008fÎu\u008aVv\u001f2îþßº¡T¡\u0097mÓ\b\u001f'[Ð\u0087\u009aÃ¢\u000eLJc \u0010cê'\u0089ë¦¯Zs\u000073úÖ¾øB¡HÏ\u008b\fÏa\u0003\\Gµ\u009bõßÄÕ÷\u0016$RV\u009esÚ\u0099\u0006ÅBñ\u008f\u0011\u0094:Wÿ\u0013Öß°\u009bZG\u001f\u0003<ÎÕ\u008aëv¤2\u0016þdº\reÆ!ñí\u0083©\u00ad\u0094\u0084WH\u0013-ß\u0002\u009bªGü\u0003\u0092\u0094\u0095WO\u0013,ß\u001f\u009bàG£\u0003\u0081jÂ©\u0018í{!He·¹ôýÖ0\u0012t\u001d\u0088\u0005ÌãµWv\u008d2îþÝº\"fa\"Cï\u0087«\u0088W\u0090\u0013vß'\u009b&Dü\u0094\u0080WE\u0013lß\n\u009bàG¥\u0003\u0086Îo\u008aQv\u001e2¬þ×º½en!Gí6Q\u0004\u0092ËÖ¬\u0094\u0097WG\u00137ß\u0016\u009bóG¾\u0003\u008dÎhÚg\u0019\u008e]æ\u0091\u008eÕ\u0014\tkMX\u0080ºÄ\u008f8Ó|3°Nô`+±o\u0084£®çåÛ\u0016\u001fdSA\u0096«Êû\u0094³WD\u0013&ß\b\u009býG£\u0003\u0086Î:\u008aav.2Éþ\u009aº°e\u007f!Kí6©\u0006\u0095\u008aQ¤\u001d\u0095Ø`\u0084j@\u001a\f¢È\u0084\u0094³WD\u0013&ß\b\u009býG£\u0003\u0086Î:\u008aav.2Éþ\u009aº°e\u007f!Kí6©\u0006\u0095\u008aQ¤\u001d\u0095Ø`\u0084j@\u001a\f¢È\u0084´µw43\u000e[(\u0098íÜÄ\u0010ºT[\u0088\u0010Ì.\u0001ÅEû¹°ýO Wc\u0087'ìëÜ¯6sa7Sú°Ô\u0093\u0017_S:\u009f\u0015Û½\u0007ëôÓ7\u0018s\u007f¿Jû©'ì\u0094\u0080WE\u0013lß\n\u009bàG¥\u0003\u0086Îo\u008aQv\u001e2¬þØº ek!Lí>\u0094\u0080WE\u0013lß\u0011\u009b÷G¸\u0003\u008cÎ\u007f\u008a^vD2óþßº¿e\u007f\u0000}\u0094\u0080WE\u0013lß\t\u009b÷G©\u0003\u0097Îh\u008aW\u0087\u0085\u0094\u0080WE\u0013lß\u0018\u009bçG£\u0003\u008eÎ~\u008a\u001cv\u001a2ðþÕº¶e\u007f!Aí.Í¬\u000egJ\u0016\u0086.Âõ\u001e\u008aZâ\u0097\u0014\u0094\u0080WE\u0013lß\u0018\u009bçG£\u0003\u008eÎ~\u008a\u001cv\f2ëþÔºµeo!Pí*©\u0000\u0095ÃQ¬\u001d\u008e\u0094\u0095WO\u0013,ß\u001f\u009bàG£\u0003\u0081Î5\u008aAv\u000e2éþ\u0095ºµeo!Lí?©\u0000\u0095ÃQ¡\u0094\u0095WO\u0013,ß\u001f\u009bàG£\u0003\u0081ÎE\u008aJvR2´þ\u0095º¡en!Ií\u0005©\n\u0095\u0092Qô\u001dÕØu\u0084/@\f\fÿÈÀ´\u0083wa3eÿ*»²g\u0094\u0094\u0095WO\u0013,ß\u001f\u009bàG£\u0003\u0081Î5\u008aUv\u00052íþÝº¾eo!}í)©\u0016\u0095ÁQí\u001d\u009dØw\u0084$@\u0007\fèÈÛ´\u0089ú\u009a9@}#±\u0010õï)¬m\u008e :äK\u0018\u0007\\â\u0090ÍÔå\u000b3O]\u0083zÇ\u000bûÇ?¢s\u008d¶%ês.\u001d\u007fõ¼%øM4}p\u009e¬Ïè\u00ad%\ta6\u009daÙ½\u0015½QÂ\u008e\u0002Ê-\u0006TBw~\u0095ºÚö¢3Do\u0005«eç\u009f#¼_ï\u009c\u0010Ø3\u0014QPµ\u008cºÈ\u0082\u0004¤\u0094\u0080WE\u0013lß\u0018\u009býG¥\u0003\u0096Îv\u008a]v\u000b2æþßº \u0094\u0080WE\u0013lß\u0018\u009býG¥\u0003\u0096Îs\u008a_v\u000b2åþßºüeh!Wí3©\u001e\u0095ÎQì\u001d\u009cØ{\u0084$@\u0005\fÿÈÀ´\u009awp3Sÿ<»þîá-\u0016it¥Zá¯=ñyÔ´eð\u0018\f\u0000Hæ\u0094\u0080WE\u0013lß\u0018\u009bçG£\u0003\u008eÎ~\u008a\u001cv\u000e2ëþÉº¢ef!Cí#©\\\u0095ÃQ¦\u0094\u0086WO\u00131ß\u000e\u009b¿Ov\u008c©ÈÆ\u0004ã@Q\u009cTØy\u0015\u0094Qñ\u00adöé\n%:aJ¾Êú¿6ÅrðN7\u008a\\Õ\u0083\u0016OR/\u009e\u000fÚ¼\u0006¢B\u0095\u008f4Ë_7\u000bsë¿Ôû¹$o`[¬)Kì\u0088 Ì@\u0000`DÓ\u0098ÖÜë\u0011[U;©dí\u0086!°eâº\u0006þ,2XvxJ·\u008eÌ\u0094\u0083WO\u0013/ß\u000f\u009b¼G¹\u0003\u0084Î4\u008a^v\t2æþåº¶eo!Lí)©\u001b\u0095ÞQ»\u0094\u0080WE\u0013lß\u0011\u009b÷G¸\u0003\u008cÎ\u007f\u008a^vD2ãþÔº¶ex!Mí3©\u0016\u0095\u0084Q³\u001d\u009fØ\u007f\u0084?@\u0006j«©níG!3eÖ¹\u008eý½0\u001fth\u0088$ÌÄ\u0000äD×\u009b@ß\u007f\u0013\u0015W\u0006kï¯\u0088ã¼&\\ã' âdË¨²ìQ0\u0000tk¹ßýà\u0001¤EI\u0089yÍ[\u0012ËVì\u009a\u0093Þ²âh&\u0017j-¯Çó\u00847«{IVç\u0095\"Ñ\u000b\u001dmY\u0087\u0085ÂÁá\f\bH6´yðË<¿xÀ§\u0004ã)/Yk;W«\u0093Ìßó\u001a\u0012FH\u0082wÎ\u008d\n§väµ\u000bñ)b\u0087¡Båk)\u000emì±¾õ\u00918x|X\u0080CÄç\bÈL¼\u0093a×A\u001bs_\u0013cÄ§«ë\u009a.pr?¶\u0015úï>ÜB\u0083\u0081q¬\u0007oÂ+ëç\u008e£l\u007f>;\u0011öø²ØN²\n`ÆE\u0082!]£\u0019ÇÕ¨\u0091\u009c\u00adAi!%Sàó¼¤x\u008b4zðP\u008c\u001fOõ\u000bÏÇ¼\u0083c_Q¶¹u|1Uý5¹Îe\u009d!¿ìL¨yT}\u0010ÙÜö\u0098\u0082G_\u0003\u007fÏM\u008b-·ús\u0095?¤úN¦\u0001b+.Ñêâ\u0096½UO\u0094\u0080WE\u0013lß\f\u009b÷G¤\u0003\u0086Îu\u008a@v52æþÖº¹eg!\fí8©\u0007\u0095ÃQ®\u001d\u009eØ<\u0084,@\u000b\fôÈÕ´\u008fwp3Jÿ »ãgÌ#®\u0094È\u0094ÝWN\u0013'ß\f\u009b½G»\u0003\u0087Îw\u008aGv52òþÓº¢eo\u0094ÝWN\u0013'ß\f\u009b½G¹\u0003\u008dÎy\u008aYv\u000f2öþ\u0095º°ek!Qí?©\u0010\u0095ËQ¬\u001d\u009eØM\u0084-@\u0007\fôÈË´\u008eÑÎ\u0012]V4\u009a\u001fÞ®\u0002ªF\u009e\u008bjÏJ3\u001cwå»\u0086ÿ¦ |d_¨0ì\u0005\u0094ÝWN\u0013'ß\f\u009b½G¹\u0003\u008dÎy\u008aYv\u000f2öþ\u0095º£eo!Oí/©\u0016\u0094ÝWY\u0013;ß\t\u009b½G»\u0003\u0087Îw\u008aGv52öþÈº³ei!G\fQÏÕ\u008b·G\u0085\u0003jß#\u009b\u0003V¹\u0012Òî\u008fªlf\u0019\"2ýï¹Ìuµ1¡\rKÉ/\u0085\u001a@ò\u001c©Ø\u008d\u0094IPZ,\u0003ïì«Ãg¹#Yÿ_»3w\u00132Ó\u000eàÊ\u0085\u0086q©³j .Iâb¦ÓzÆ>ÿó\u0000·\u0003Kc\u000f\u009cÃ§\u0096ÛUH\u0011!Ý\n\u0099»E®\u0001\u0097Ìh\u0088kt\u00180íüÑ¸±\u0094ÝWN\u0013'ß\f\u009b½G¹\u0003\u008dÎy\u008aYv\u000f2öþ\u0095º°ey!Ví<©\u001d\u0095ÆQ¦\u001d\u009fØ`\u0084.*ïék\u00ad\ta;%Ôù\u009d½½p\u00074lÈ1\u008cÒ@§\u0004\u008cÛQ\u009frS\n\u00173+ìï\u0096£§fL:\u001cþ5²Úvß\n²É^\u008daAN\u0005ËÙÿ\u0094ÝWN\u0013'ß\f\u009b½G¨\u0003\u0091În\u008aSv\t2áþßØ\u009b\u001b\b_a\u0093J×û\u000bîO×\u0082(Æ\u0013:U~¶²\u0093Æç\u0005tA\u001d\u008d6É\u0087\u0015\u0092Q«\u009cTØe$5`ß¬îÂu\u0001æE\u008f\u0089¤Í\u0015\u0011\u0000U9\u0098ÆÜõ °dC¨w\u0094ÝWN\u0013'ß\f\u009b½G¨\u0003\u0091În\u008aDv\u00072ñþÝ¸f{õ?\u009có··\u0006k\u0013/*âÕ¦ùZ¶\u001eXÒh\u0096\u0019IÒ·¸t+0Büi¸ØdÍ ôí\u000b©\bUf\u0011\u008aÝº\u0094ÝWN\u0013#ß\u000e\u009bóGå\u0003\u0086Îu\u008aEv\u00042îþÕº³en!Qíu©\\\u0095ÒQ \u001dÕØp\u00849@\u0016\fñA1\u0082«ÆÀ\nâNQ\u0092QÖg\u001b\u0098_º£éç\u0019+%o\u0011°¤ô½8Â|Í@.\u0084OÈd\r\u009bQÂ\u0095ÈÙ\u0019\u001d2ab¢\u008bæ¤\u0094ÝWZ\u00130ß\u0015\u009bñGå\u0003\u008bÎu\u008aBv\u00052ðþÎº¡B\u001b\u0081\u0095Åý\t\u0083MqzÉ¹Ný$1\u0001uå©ñí\u0085 kdJ\u0098\u0018Ü¹\u0010ÃT§\u008bnÏE\u0094\u0095WX\u0013#ß\u0016\u009bþG¥\u0003\u0081Î4\u008aUv\u00052îþÞº´ec!Qí2©\\\u0095ÙQ\u00ad\u0094\u009eWC\u0013 ß=\u009bÞG\u008f\u0003±ÎE\u008aPv\u00192öþ\u0094º¡ee\u0094ÝWO\u00136ß\u0019\u009b½G§\u0003\u0087Î~\u008a[v\u000b2ÝþÙº½en!Gí9©\u0001\u0095\u0084Qº\u001d\u0097Ø~\u0094\u0090WF\u00137ß\u001f\u009báG¾\u0003\u0083Îy\u008aYv\u0019\u0094ÝWO\u00136ß\u0019\u009b½G§\u0003\u008dÎo\u008a\\v\u001e2ñ\u0094ÝWN\u0013#ß\u000e\u009bóGå\u0003\u0086Îu\u008aEv\u00042îþÕº³en!Qíu©\\\u0095ÎQ²\u001dÕØs\u0084:@\u0012\féÈ\u009c´\u0092wo3VäV'Ñc»¯\u009eëz7ns\n¾áúÌ\u0006\u0088Bg\u008eWÊ6Q\u0002\u0092òÖ\u0099\u001a©^C\u0082\u0014Æ&\u000bÅÌ\t\u000f\u009aK÷\u0087ÚÃ'\u001f1[[\u0096§Ò\u0095.Ýjy¦\u001eât=±y\u0090µçñÊÍ\u001b\teE\u0001\u0080¥Üë\u0018ÄTa\u0090Vì\u0011/µk\u0081§ëãp?\u001b{g·Eò\u008cÎù\nØF/\u0082lÞB\u0019àU\u008b\u0091Ûí;)\u001beo ³ü\u0093".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2026);
                f19986b = cArr;
                f19985a = 308912591312082730L;
            }

            AnonymousClass2(k kVar2, OperationCallback operationCallback2) {
                kVar = kVar2;
                operationCallback = operationCallback2;
            }

            private static void E(char c2, int i22, int i32, Object[] objArr6) throws Throwable {
                int i42 = 2 % 2;
                o.a.o oVar = new o.a.o();
                long[] jArr = new long[i32];
                oVar.f19947b = 0;
                while (oVar.f19947b < i32) {
                    int i52 = oVar.f19947b;
                    try {
                        Object[] objArr22 = {Integer.valueOf(f19986b[i22 + i52])};
                        Object objA = o.d.d.a(-214519724);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a((ViewConfiguration.getPressedStateDuration() >> 16) + 742, (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), TextUtils.getCapsMode("", 0, 0) + 12, 632508977, false, $$e(b2, b3, (byte) (6 | b3)), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr32 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr22)).longValue()), Long.valueOf(i52), Long.valueOf(f19985a), Integer.valueOf(c2)};
                        Object objA2 = o.d.d.a(-1567654649);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            objA2 = o.d.d.a(766 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12470), 12 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1946853218, false, $$e(b4, b4, $$c[0]), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i52] = ((Long) ((Method) objA2).invoke(null, objArr32)).longValue();
                        Object[] objArr42 = {oVar, oVar};
                        Object objA3 = o.d.d.a(-723636472);
                        if (objA3 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objA3 = o.d.d.a(386 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 18 - ExpandableListView.getPackedPositionType(0L), 39570797, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr42);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr = new char[i32];
                oVar.f19947b = 0;
                while (oVar.f19947b < i32) {
                    int i6 = $10 + 7;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                    Object[] objArr52 = {oVar, oVar};
                    Object objA4 = o.d.d.a(-723636472);
                    if (objA4 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        objA4 = o.d.d.a(TextUtils.indexOf("", "") + 387, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 19 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 39570797, false, $$e(b7, b8, b8), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr52);
                }
                String str = new String(cArr);
                int i8 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                $11 = i8 % 128;
                if (i8 % 2 != 0) {
                    objArr6[0] = str;
                } else {
                    int i9 = 90 / 0;
                    objArr6[0] = str;
                }
            }

            private static void F(byte v2, int v3, byte v4, Object[] v5) {
                /*
                    byte[] r7 = o.aa.b.AnonymousClass2.$$a
                    int r0 = r10 * 2
                    int r6 = 4 - r0
                    int r5 = 101 - r9
                    int r1 = r8 * 3
                    int r0 = 1 - r1
                    byte[] r4 = new byte[r0]
                    r3 = 0
                    int r2 = 0 - r1
                    if (r7 != 0) goto L2a
                    r0 = r2
                    r1 = r3
                L15:
                    int r6 = r6 + 1
                    int r5 = r5 + r0
                L18:
                    byte r0 = (byte) r5
                    r4[r1] = r0
                    if (r1 != r2) goto L25
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    r11[r3] = r0
                    return
                L25:
                    r0 = r7[r6]
                    int r1 = r1 + 1
                    goto L15
                L2a:
                    r1 = r3
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass2.F(byte, int, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:473:0x0b6c  */
            /* JADX WARN: Removed duplicated region for block: B:481:0x0c1a  */
            /* JADX WARN: Removed duplicated region for block: B:538:0x121e  */
            /* JADX WARN: Removed duplicated region for block: B:583:0x18a0  */
            /* JADX WARN: Removed duplicated region for block: B:662:0x2a90  */
            /* JADX WARN: Removed duplicated region for block: B:704:0x327c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.Object[] d(android.content.Context r32, int r33, int r34, int r35) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 13589
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass2.d(android.content.Context, int, int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{17, -84, -78, -70};
                $$b = 4;
            }

            static void init$1() {
                $$c = new byte[]{5, Ascii.SO, 124, -17};
                $$d = 99;
            }

            @Override // o.ag.b.e
            public final void b(List<m> list) throws Throwable {
                int i22 = 2 % 2;
                int i32 = f19987f + 17;
                f19991j = i32 % 128;
                if (i32 % 2 == 0) {
                    f.a();
                    throw null;
                }
                if (f.a()) {
                    Object[] objArr6 = new Object[1];
                    E((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 1, 17 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr6);
                    String strIntern3 = ((String) objArr6[0]).intern();
                    Object[] objArr22 = new Object[1];
                    E((char) (View.MeasureSpec.getMode(0) + 46199), 17 - TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getEdgeSlop() >> 16) + 56, objArr22);
                    f.c(strIntern3, ((String) objArr22[0]).intern());
                    int i42 = f19991j + 17;
                    f19987f = i42 % 128;
                    int i52 = i42 % 2;
                }
                b bVar = b.this;
                bVar.a(kVar, bVar.f19970a, Long.valueOf(System.currentTimeMillis()));
                operationCallback.onSuccess(null);
            }

            @Override // o.ag.b.e
            public final void e(c cVar) throws Throwable {
                int i22 = 2 % 2;
                int i32 = f19991j + 21;
                f19987f = i32 % 128;
                int i42 = i32 % 2;
                if (!(!f.a())) {
                    int i52 = f19991j + 65;
                    f19987f = i52 % 128;
                    int i6 = i52 % 2;
                    Object[] objArr6 = new Object[1];
                    E((char) (ViewConfiguration.getPressedStateDuration() >> 16), ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0), 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr6);
                    String strIntern3 = ((String) objArr6[0]).intern();
                    Object[] objArr22 = new Object[1];
                    E((char) (37208 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), 73 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getTouchSlop() >> 8) + 56, objArr22);
                    f.c(strIntern3, ((String) objArr22[0]).intern());
                    int i7 = f19987f + 69;
                    f19991j = i7 % 128;
                    int i8 = i7 % 2;
                }
                operationCallback.onError(o.by.c.b(cVar).a());
            }
        }, bVarC).e(kVar2, nVar);
        int i6 = f19967t + 77;
        f19965r = i6 % 128;
        int i7 = i6 % 2;
    }

    public final boolean b() throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f19967t + 121;
            f19965r = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            w((char) ((-16771170) - Color.rgb(0, 0, 0)), 3 - (ViewConfiguration.getScrollBarSize() >> 8), KeyEvent.getDeadChar(0, 0) + 17, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            u(18 - (ViewConfiguration.getJumpTapTimeout() >> 16), "($)\u0016\u000f#\u0006 )-\"\u000b!\u001c\u001f\"\r-", (byte) (View.resolveSize(0, 0) + 81), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
            int i5 = f19965r + 107;
            f19967t = i5 % 128;
            int i6 = i5 % 2;
        }
        if (this.f19973d == null) {
            return false;
        }
        int i7 = f19965r + 15;
        int i8 = i7 % 128;
        f19967t = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 87;
        f19965r = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    public final void c(OperationCallback<k> operationCallback) throws Throwable {
        if (f.a()) {
            Object[] objArr = new Object[1];
            w((char) (6046 - Drawable.resolveOpacity(0, 0)), TextUtils.getOffsetAfter("", 0) + 3, 17 - (KeyEvent.getMaxKeyCode() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            u(18 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u001b\u0006\u0006\u0019\u000f#\u0006 )-\"\u000b!\u001c\u001f\"\r-", (byte) (42 - (Process.myTid() >> 22)), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        o.en.b bVarC = o.en.b.c();
        if (!bVarC.a()) {
            bVarC.b(this.f19979n);
        }
        if (!bVarC.s()) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr3 = new Object[1];
            w((char) (57372 - (KeyEvent.getMaxKeyCode() >> 16)), 212 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 6, objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            u((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 42, "\u001c&㘚㘚.\u0006\u0013\u001f&\u000f\u0006!\u0003\u0012\u001c\u0012㘘㘘(\f\u00110\u0010\n!\u0006\u0006/\u000b\u0002\"\u001c\u0003\u0013\".\u000e\u0015\"!,\u0014", (byte) (37 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr4);
            throw new WalletValidationException(walletValidationErrorCode, strIntern2, ((String) objArr4[0]).intern());
        }
        if (!c() || this.f19973d == null) {
            synchronized (this.f19974e) {
                this.f19976g.add(operationCallback);
                if (this.f19977h == null) {
                    e eVar = new e(this.f19979n, this.f19978m, bVarC);
                    this.f19977h = eVar;
                    eVar.c(e(bVarC));
                }
            }
            return;
        }
        if (f.a()) {
            Object[] objArr5 = new Object[1];
            w((char) (6094 - AndroidCharacter.getMirror('0')), (KeyEvent.getMaxKeyCode() >> 16) + 3, 18 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr5);
            String strIntern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            w((char) Color.red(0), 217 - TextUtils.indexOf((CharSequence) "", '0'), 39 - (KeyEvent.getMaxKeyCode() >> 16), objArr6);
            f.c(strIntern3, ((String) objArr6[0]).intern());
        }
        operationCallback.onSuccess(this.f19973d);
    }

    public final void c(k kVar, List<o> list, o.er.n nVar, OperationCallback<List<m>> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19967t + 65;
        f19965r = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            int i5 = f19967t + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f19965r = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            w((char) (6047 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 3 - Color.blue(0), KeyEvent.normalizeMetaState(0) + 17, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            u(19 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\u0015\u0011%(\u000b\"\u001c\u001f\u001f\f.\u0014\u0002\u0013\u0015)\u001e\u0012㗱", (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 8), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        if (list.isEmpty()) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.Mandatory;
            Object[] objArr3 = new Object[1];
            w((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 295, 21 - TextUtils.getTrimmedLength(""), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            u(23 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u0002\b'\u001c\u0014\t!\u001c\u001f\"\r-+\b\u0013\u001f&\u000f-)\u0019\u0003㘎", (byte) (View.MeasureSpec.getMode(0) + 43), objArr4);
            throw new WalletValidationException(walletValidationErrorCode, strIntern2, ((String) objArr4[0]).intern());
        }
        o.en.b bVarC = o.en.b.c();
        if (!bVarC.a()) {
            bVarC.b(this.f19979n);
            int i7 = f19965r + 61;
            f19967t = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 5 % 5;
            }
        }
        if (!bVarC.s()) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
            Object[] objArr5 = new Object[1];
            w((char) (57372 - Color.green(0)), 212 - Color.blue(0), Color.argb(0, 0, 0, 0) + 6, objArr5);
            String strIntern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            u(42 - (ViewConfiguration.getScrollBarSize() >> 8), "\u001c&㘚㘚.\u0006\u0013\u001f&\u000f\u0006!\u0003\u0012\u001c\u0012㘘㘘(\f\u00110\u0010\n!\u0006\u0006/\u000b\u0002\"\u001c\u0003\u0013\".\u000e\u0015\"!,\u0014", (byte) (36 - TextUtils.indexOf("", "", 0)), objArr6);
            throw new WalletValidationException(walletValidationErrorCode2, strIntern3, ((String) objArr6[0]).intern());
        }
        Iterator<o> it = list.iterator();
        while (it.hasNext()) {
            DigitalCard digitalCardB = bVarC.b(it.next().c());
            if (digitalCardB == null || digitalCardB.getStatus() != CardStatus.Active) {
                WalletValidationErrorCode walletValidationErrorCode3 = WalletValidationErrorCode.WrongState;
                Object[] objArr7 = new Object[1];
                w((char) (TextUtils.getOffsetAfter("", 0) + 33528), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 314, 3 - ExpandableListView.getPackedPositionChild(0L), objArr7);
                throw new WalletValidationException(walletValidationErrorCode3, ((String) objArr7[0]).intern());
            }
            int i9 = f19965r + 93;
            f19967t = i9 % 128;
            int i10 = i9 % 2;
        }
        int i11 = (-1339268403) * o.en.b.f24086a;
        o.en.b.f24086a = i11;
        new o.ag.b((Context) o.en.b.a(-1657581939, i11, new Object[]{bVarC}, (int) Runtime.getRuntime().totalMemory(), 1657581940, (int) Thread.currentThread().getId(), Process.myPid()), new b.e() { // from class: o.aa.b.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;
            public static int A = 0;
            public static int B = 0;

            /* JADX INFO: renamed from: b */
            private static char[] f20034b = null;

            /* JADX INFO: renamed from: f */
            private static int f20035f = 0;

            /* JADX INFO: renamed from: g */
            private static char f20036g = 0;

            /* JADX INFO: renamed from: h */
            public static int f20037h = 0;

            /* JADX INFO: renamed from: i */
            private static int f20038i = 0;

            /* JADX INFO: renamed from: j */
            private static int f20039j = 0;

            /* JADX INFO: renamed from: k */
            public static int f20040k = 0;

            /* JADX INFO: renamed from: l */
            public static int f20041l = 0;

            /* JADX INFO: renamed from: m */
            public static int f20042m = 0;

            /* JADX INFO: renamed from: n */
            public static int f20043n = 0;

            /* JADX INFO: renamed from: o */
            public static int f20044o = 0;

            /* JADX INFO: renamed from: p */
            public static int f20045p = 0;

            /* JADX INFO: renamed from: q */
            public static int f20046q = 0;

            /* JADX INFO: renamed from: r */
            public static int f20047r = 0;

            /* JADX INFO: renamed from: s */
            public static int f20048s = 0;

            /* JADX INFO: renamed from: t */
            public static int f20049t = 0;

            /* JADX INFO: renamed from: u */
            public static int f20050u = 0;

            /* JADX INFO: renamed from: v */
            public static int f20051v = 0;

            /* JADX INFO: renamed from: w */
            public static int f20052w = 0;

            /* JADX INFO: renamed from: x */
            public static int f20053x = 0;

            /* JADX INFO: renamed from: y */
            public static int f20054y = 0;

            /* JADX INFO: renamed from: z */
            public static int f20055z = 0;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ k f20056a;

            /* JADX INFO: renamed from: d */
            private /* synthetic */ List f20058d;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ OperationCallback f20059e;

            private static String $$e(byte v2, short v3, short v4) {
                /*
                    int r7 = r10 + 102
                    int r0 = r9 * 3
                    int r6 = 1 - r0
                    byte[] r5 = o.aa.b.AnonymousClass5.$$c
                    int r0 = r8 * 2
                    int r1 = 3 - r0
                    byte[] r4 = new byte[r6]
                    r3 = 0
                    if (r5 != 0) goto L29
                    r2 = r3
                    r0 = r1
                L13:
                    int r1 = -r1
                    int r1 = r1 + r7
                    r7 = r1
                    r1 = r0
                L17:
                    int r0 = r1 + 1
                    byte r1 = (byte) r7
                    r4[r2] = r1
                    int r2 = r2 + 1
                    if (r2 != r6) goto L26
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    return r0
                L26:
                    r1 = r5[r0]
                    goto L13
                L29:
                    r2 = r3
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass5.$$e(byte, short, short):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                B = 1569380691;
                A = 535180005;
                f20055z = -2059557452;
                f20054y = 286443352;
                f20053x = -1929493484;
                f20052w = 1351174383;
                f20051v = 255852503;
                f20050u = -756767053;
                f20049t = -1008819107;
                f20048s = -1435057166;
                f20047r = -682169380;
                f20046q = -410847992;
                f20045p = -1477283252;
                f20044o = -1643556814;
                f20043n = 137358750;
                f20042m = -1472529369;
                f20041l = -132035198;
                f20040k = -132503309;
                f20037h = -1323150075;
                init$0();
                f20035f = 0;
                f20039j = 1;
                f20034b = new char[]{64580, 64605, 65469, 64517, 64594, 65464, 64612, 64559, 64523, 64520, 64638, 64604, 64620, 64543, 64598, 64609, 64614, 64576, 64582, 64579, 65470, 64589, 64597, 64629, 64625, 64577, 64584, 64590, 64591, 64599, 64535, 64578, 64595, 65468, 65466, 65467, 64587, 64585, 65471, 64611, 64593, 64618, 64586, 64588, 64616, 65463, 64632, 65465, 64592};
                f20036g = (char) 51640;
                f20038i = -1270219406;
            }

            AnonymousClass5(List list2, k kVar2, OperationCallback operationCallback2) {
                list = list2;
                kVar = kVar2;
                operationCallback = operationCallback2;
            }

            /* JADX WARN: Removed duplicated region for block: B:128:0x0120  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x0154  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void C(int r30, java.lang.String r31, byte r32, java.lang.Object[] r33) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 926
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass5.C(int, java.lang.String, byte, java.lang.Object[]):void");
            }

            private static void D(int i22, String str, boolean z2, int i32, int i42, Object[] objArr8) throws Throwable {
                Object obj;
                String str2 = str;
                int i52 = 2 % 2;
                if (str2 != null) {
                    char[] charArray = str2.toCharArray();
                    int i62 = $10 + 71;
                    $11 = i62 % 128;
                    int i72 = i62 % 2;
                    obj = charArray;
                } else {
                    obj = str2;
                }
                char[] cArr = (char[]) obj;
                n nVar2 = new n();
                char[] cArr2 = new char[i22];
                nVar2.f19944a = 0;
                int i82 = $10 + 53;
                $11 = i82 % 128;
                int i92 = i82 % 2;
                while (nVar2.f19944a < i22) {
                    nVar2.f19946e = cArr[nVar2.f19944a];
                    cArr2[nVar2.f19944a] = (char) (i32 + nVar2.f19946e);
                    int i102 = nVar2.f19944a;
                    try {
                        Object[] objArr22 = {Integer.valueOf(cArr2[i102]), Integer.valueOf(f20038i)};
                        Object objA = o.d.d.a(1376241034);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 270, (char) View.MeasureSpec.getSize(0), ExpandableListView.getPackedPositionType(0L) + 11, -2071844881, false, $$e(b2, b3, (byte) ((b3 + Ascii.CR) - (13 & b3))), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i102] = ((Character) ((Method) objA).invoke(null, objArr22)).charValue();
                        Object[] objArr32 = {nVar2, nVar2};
                        Object objA2 = o.d.d.a(-202660535);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA2 = o.d.d.a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 522, (char) TextUtils.getCapsMode("", 0, 0), 12 - (ViewConfiguration.getEdgeSlop() >> 16), 627984172, false, $$e(b4, b5, (byte) ((b5 + Ascii.VT) - (11 & b5))), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA2).invoke(null, objArr32);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                if (i42 > 0) {
                    int i112 = $10 + 45;
                    $11 = i112 % 128;
                    int i12 = i112 % 2;
                    nVar2.f19945b = i42;
                    char[] cArr3 = new char[i22];
                    System.arraycopy(cArr2, 0, cArr3, 0, i22);
                    System.arraycopy(cArr3, 0, cArr2, i22 - nVar2.f19945b, nVar2.f19945b);
                    System.arraycopy(cArr3, nVar2.f19945b, cArr2, 0, i22 - nVar2.f19945b);
                }
                if (z2) {
                    char[] cArr4 = new char[i22];
                    nVar2.f19944a = 0;
                    while (nVar2.f19944a < i22) {
                        int i13 = $10 + 89;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        cArr4[nVar2.f19944a] = cArr2[(i22 - nVar2.f19944a) - 1];
                        Object[] objArr42 = {nVar2, nVar2};
                        Object objA3 = o.d.d.a(-202660535);
                        if (objA3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objA3 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0') + 523, (char) TextUtils.getOffsetAfter("", 0), KeyEvent.normalizeMetaState(0) + 12, 627984172, false, $$e(b6, b7, (byte) (11 | b7)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr42);
                    }
                    cArr2 = cArr4;
                }
                objArr8[0] = new String(cArr2);
            }

            private static void E(int v2, int v3, byte v4, Object[] v5) {
                /*
                    int r1 = r8 + 97
                    int r0 = r6 * 2
                    int r0 = 4 - r0
                    int r3 = r7 * 3
                    int r2 = 1 - r3
                    byte[] r8 = o.aa.b.AnonymousClass5.$$a
                    byte[] r7 = new byte[r2]
                    r6 = 0
                    int r5 = 0 - r3
                    if (r8 != 0) goto L30
                    r3 = r0
                    r2 = r5
                    r4 = r6
                L16:
                    int r1 = -r0
                    int r0 = r3 + 1
                    int r1 = r1 + r2
                    r3 = r4
                L1b:
                    byte r2 = (byte) r1
                    r7[r3] = r2
                    int r4 = r3 + 1
                    if (r3 != r5) goto L2a
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r7, r6)
                    r9[r6] = r0
                    return
                L2a:
                    r2 = r8[r0]
                    r3 = r0
                    r0 = r2
                    r2 = r1
                    goto L16
                L30:
                    r3 = r6
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass5.E(int, int, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code restructure failed: missing block: B:655:0x1299, code lost:
            
                r2 = new java.lang.Object[]{new int[1], new int[1], r3, null, new int[1]};
                r3 = (java.lang.String) java.lang.Class.forName(r19).getField(r18).get(r16);
                ((int[]) r2[0])[0] = r37;
                ((int[]) r2[4])[0] = r37 ^ 20;
                r5 = (int) android.os.Process.getElapsedCpuTime();
                r1 = r39 + ((((((~((-91260378) | r5)) | 14850) * 449) + 2068775750) + (((~((~r5) | (-91260378))) | 14850) * 449)) + 16);
                r1 = r1 ^ (r1 << 13);
                r1 = r1 ^ (r1 >>> 17);
                r4 = 0;
                ((int[]) r2[1])[0] = r1 ^ (r1 << 5);
             */
            /* JADX WARN: Removed duplicated region for block: B:494:0x0aba  */
            /* JADX WARN: Removed duplicated region for block: B:506:0x0c5d  */
            /* JADX WARN: Removed duplicated region for block: B:509:0x0cab  */
            /* JADX WARN: Removed duplicated region for block: B:571:0x1077 A[Catch: Exception -> 0x1208, IOException -> 0x1293, all -> 0x152a, TryCatch #7 {, blocks: (B:513:0x0cf9, B:514:0x0d1b, B:519:0x0d95, B:639:0x124b, B:641:0x1251, B:642:0x1252, B:530:0x0dec, B:535:0x0e57, B:568:0x1066, B:569:0x1069, B:571:0x1077, B:572:0x10b3, B:574:0x10ca, B:575:0x1105, B:576:0x1117, B:578:0x113f, B:580:0x117c, B:582:0x11a4, B:584:0x11cd, B:586:0x11fa, B:654:0x1298, B:589:0x1204, B:620:0x122e, B:621:0x1231, B:623:0x1233, B:625:0x1239, B:626:0x123a, B:632:0x1240, B:634:0x1246, B:635:0x1247, B:644:0x1254, B:646:0x125a, B:647:0x125b, B:648:0x125c, B:649:0x1290), top: B:777:0x0cf9 }] */
            /* JADX WARN: Removed duplicated region for block: B:574:0x10ca A[Catch: Exception -> 0x1208, IOException -> 0x1293, all -> 0x152a, TryCatch #7 {, blocks: (B:513:0x0cf9, B:514:0x0d1b, B:519:0x0d95, B:639:0x124b, B:641:0x1251, B:642:0x1252, B:530:0x0dec, B:535:0x0e57, B:568:0x1066, B:569:0x1069, B:571:0x1077, B:572:0x10b3, B:574:0x10ca, B:575:0x1105, B:576:0x1117, B:578:0x113f, B:580:0x117c, B:582:0x11a4, B:584:0x11cd, B:586:0x11fa, B:654:0x1298, B:589:0x1204, B:620:0x122e, B:621:0x1231, B:623:0x1233, B:625:0x1239, B:626:0x123a, B:632:0x1240, B:634:0x1246, B:635:0x1247, B:644:0x1254, B:646:0x125a, B:647:0x125b, B:648:0x125c, B:649:0x1290), top: B:777:0x0cf9 }] */
            /* JADX WARN: Removed duplicated region for block: B:578:0x113f A[Catch: IOException -> 0x1293, all -> 0x152a, TryCatch #7 {, blocks: (B:513:0x0cf9, B:514:0x0d1b, B:519:0x0d95, B:639:0x124b, B:641:0x1251, B:642:0x1252, B:530:0x0dec, B:535:0x0e57, B:568:0x1066, B:569:0x1069, B:571:0x1077, B:572:0x10b3, B:574:0x10ca, B:575:0x1105, B:576:0x1117, B:578:0x113f, B:580:0x117c, B:582:0x11a4, B:584:0x11cd, B:586:0x11fa, B:654:0x1298, B:589:0x1204, B:620:0x122e, B:621:0x1231, B:623:0x1233, B:625:0x1239, B:626:0x123a, B:632:0x1240, B:634:0x1246, B:635:0x1247, B:644:0x1254, B:646:0x125a, B:647:0x125b, B:648:0x125c, B:649:0x1290), top: B:777:0x0cf9 }] */
            /* JADX WARN: Removed duplicated region for block: B:641:0x1251 A[Catch: Exception -> 0x125c, IOException -> 0x1293, all -> 0x152a, TryCatch #7 {, blocks: (B:513:0x0cf9, B:514:0x0d1b, B:519:0x0d95, B:639:0x124b, B:641:0x1251, B:642:0x1252, B:530:0x0dec, B:535:0x0e57, B:568:0x1066, B:569:0x1069, B:571:0x1077, B:572:0x10b3, B:574:0x10ca, B:575:0x1105, B:576:0x1117, B:578:0x113f, B:580:0x117c, B:582:0x11a4, B:584:0x11cd, B:586:0x11fa, B:654:0x1298, B:589:0x1204, B:620:0x122e, B:621:0x1231, B:623:0x1233, B:625:0x1239, B:626:0x123a, B:632:0x1240, B:634:0x1246, B:635:0x1247, B:644:0x1254, B:646:0x125a, B:647:0x125b, B:648:0x125c, B:649:0x1290), top: B:777:0x0cf9 }] */
            /* JADX WARN: Removed duplicated region for block: B:642:0x1252 A[Catch: Exception -> 0x125c, IOException -> 0x1293, all -> 0x152a, TryCatch #7 {, blocks: (B:513:0x0cf9, B:514:0x0d1b, B:519:0x0d95, B:639:0x124b, B:641:0x1251, B:642:0x1252, B:530:0x0dec, B:535:0x0e57, B:568:0x1066, B:569:0x1069, B:571:0x1077, B:572:0x10b3, B:574:0x10ca, B:575:0x1105, B:576:0x1117, B:578:0x113f, B:580:0x117c, B:582:0x11a4, B:584:0x11cd, B:586:0x11fa, B:654:0x1298, B:589:0x1204, B:620:0x122e, B:621:0x1231, B:623:0x1233, B:625:0x1239, B:626:0x123a, B:632:0x1240, B:634:0x1246, B:635:0x1247, B:644:0x1254, B:646:0x125a, B:647:0x125b, B:648:0x125c, B:649:0x1290), top: B:777:0x0cf9 }] */
            /* JADX WARN: Removed duplicated region for block: B:676:0x16b5  */
            /* JADX WARN: Removed duplicated region for block: B:682:0x1879 A[RETURN] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.Object[] e(android.content.Context r36, int r37, int r38, int r39) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 9057
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.aa.b.AnonymousClass5.e(android.content.Context, int, int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{83, -90, 91, 36};
                $$b = 154;
            }

            static void init$1() {
                $$c = new byte[]{94, -66, 120, 126};
                $$d = 254;
            }

            @Override // o.ag.b.e
            public final void b(List<m> list2) throws Throwable {
                int i22 = 2 % 2;
                boolean zIsEmpty = false;
                if (f.a()) {
                    Object[] objArr8 = new Object[1];
                    C(18 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u0017,.\u000f\u0015\u0019,\u0015\u0004\u0007*\u0002#\u0001&\u0018㘝", (byte) (53 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr8);
                    String strIntern4 = ((String) objArr8[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr22 = new Object[1];
                    D(62 - ImageFormat.getBitsPerPixel(0), "\u0018\u0006\u0006\b\u0016\u0016ￃ\uffd0ￃ\u0016\f\u001d\b\uffddￃ\u0013\u0018\u0016\u000b\ufff3\u0015\u0012\t\f\u000f\b￤\u0011\u0007￦\u0004\u0015\u0007\u0016ￃ\uffd0ￃ\u0012\u0011￦ￕ\ufff3\ufff3\u0018\u0016\u000b￦\u0018\u0016\u0017\u0012\u0010\b\u0015￤\u0011\u0007￦\u0004\u0015\u0007\u0016\ufff6", false, View.MeasureSpec.makeMeasureSpec(0, 0) + 198, 15 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr22);
                    f.c(strIntern4, sb.append(((String) objArr22[0]).intern()).append(list2.size()).toString());
                }
                if (!list2.isEmpty()) {
                    ArrayList arrayList = new ArrayList(list.size());
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((o) it2.next()).c());
                    }
                    Iterator<m> it22 = list2.iterator();
                    while (it22.hasNext()) {
                        int i32 = f20035f + 57;
                        f20039j = i32 % 128;
                        if (i32 % 2 != 0) {
                            arrayList.remove(it22.next().b());
                        } else {
                            arrayList.remove(it22.next().b());
                            int i42 = 36 / 0;
                        }
                    }
                    zIsEmpty = arrayList.isEmpty();
                }
                if (zIsEmpty) {
                    int i52 = f20039j + 109;
                    f20035f = i52 % 128;
                    int i62 = i52 % 2;
                    b bVar = b.this;
                    bVar.a(bVar.f19973d, null, b.this.f19971b);
                } else {
                    b.this.a(kVar, null, Long.valueOf(System.currentTimeMillis()));
                }
                operationCallback.onSuccess(list2);
            }

            @Override // o.ag.b.e
            public final void e(c cVar) throws Throwable {
                int i22 = 2 % 2;
                int i32 = f20035f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f20039j = i32 % 128;
                if (i32 % 2 == 0) {
                    f.a();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (f.a()) {
                    Object[] objArr8 = new Object[1];
                    C(16 - TextUtils.lastIndexOf("", '0', 0, 0), "\u0017,.\u000f\u0015\u0019,\u0015\u0004\u0007*\u0002#\u0001&\u0018㘝", (byte) (Color.blue(0) + 53), objArr8);
                    String strIntern4 = ((String) objArr8[0]).intern();
                    Object[] objArr22 = new Object[1];
                    C(53 - ImageFormat.getBitsPerPixel(0), "\u001b+\u0015\u001c\u0016\u001e/\u000e,$\u0014\u0003'\u0016\u000e\u0002 \u0016\u0011\u0000\n\u0002+#\u0017%㘎㘎*\u0014\u0017\u000e*\u0014#/\u0018\u0013\"\u0001'\u0016\u000e\u0002 \u0016\u0012#\u0001*),\u001f\u000f", (byte) (68 - ExpandableListView.getPackedPositionType(0L)), objArr22);
                    f.c(strIntern4, ((String) objArr22[0]).intern());
                }
                operationCallback.onError(o.by.c.b(cVar).a());
                int i42 = f20039j + 61;
                f20035f = i42 % 128;
                int i52 = i42 % 2;
            }
        }, bVarC).e(kVar2, list2, nVar);
    }

    public final void d(String str, OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int id = (int) Thread.currentThread().getId();
        int i3 = f19961l * 1270056971;
        f19961l = i3;
        a(new Object[]{this, str, operationCallback}, i2, 2108498235, id, elapsedCpuTime, -2108498234, i3);
    }

    final void e() throws Throwable {
        if (f.a()) {
            Object[] objArr = new Object[1];
            w((char) (Color.green(0) + 6046), 3 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 17 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            u(11 - (ViewConfiguration.getTouchSlop() >> 8), Ig.wd("$cQ8N\u0004\u000f6\bï摇", (short) (C1633zX.Xd() ^ (-4267))), (byte) (Process.getGidForName("") + 78), objArr2);
            f.c(strIntern, ((String) objArr2[0]).intern());
        }
        synchronized (this.f19972c) {
            Context context = this.f19979n;
            Object[] objArr3 = new Object[1];
            u(47 - (ViewConfiguration.getKeyRepeatDelay() >> 16), EO.Od("\u001aJ\u0004#R\u0017-V@I\\v \u0017a\\\u001c(k+\u0005\u001aO_z4Mz\u001a- vN;t5+\u000f9\u001f)wW&M\u0003ﷵ", (short) (C1499aX.Xd() ^ (-32514))), (byte) (Process.getGidForName("") + 95), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Class<?> cls = Class.forName(C1561oA.Qd("|\t}\u000b\u0007\u007fyBv\u0002\u007f\u0005t|\u0002:Nyw|l~y", (short) (ZN.Xd() ^ 22100)));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (C1580rY.Xd() ^ (-20540));
            short sXd2 = (short) (C1580rY.Xd() ^ (-5534));
            int[] iArr = new int["\u001f\u0017-\u0019f&\u001c*$k\u001243+1+".length()];
            QB qb = new QB("\u001f\u0017-\u0019f&\u001c*$k\u001243+1+");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            clsArr[1] = Integer.TYPE;
            Object[] objArr4 = {strIntern2, 0};
            Method method = cls.getMethod(C1561oA.od("ebpNbZj\\ZEfXXVbT\\PQ^", (short) (C1499aX.Xd() ^ (-13516))), clsArr);
            try {
                method.setAccessible(true);
                SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr4);
                o.ef.a aVar = new o.ef.a();
                try {
                    if (this.f19973d != null) {
                        Object[] objArr5 = new Object[1];
                        w((char) (9209 - Gravity.getAbsoluteGravity(0, 0)), 130 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.getOffsetBefore("", 0) + 15, objArr5);
                        aVar.a(((String) objArr5[0]).intern(), a.c(this.f19973d));
                    }
                    if (this.f19970a != null) {
                        Object[] objArr6 = new Object[1];
                        w((char) (55804 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 145 - ExpandableListView.getPackedPositionGroup(0L), 12 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr6);
                        aVar.a(((String) objArr6[0]).intern(), d.b(this.f19970a));
                    }
                    Object[] objArr7 = new Object[1];
                    u(12 - KeyEvent.getDeadChar(0, 0), C1561oA.Kd("m\u000e\u0010jq\u007f\ud881\ud882u\u0017v ", (short) (C1580rY.Xd() ^ (-17679))), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 102), objArr7);
                    aVar.a(((String) objArr7[0]).intern(), this.f19971b);
                    String strE = new o.dk.a(this.f19979n).e(aVar.e());
                    if (f.a()) {
                        Object[] objArr8 = new Object[1];
                        w((char) (6046 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 3 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 17 - View.resolveSize(0, 0), objArr8);
                        String strIntern3 = ((String) objArr8[0]).intern();
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 45;
                        short sXd3 = (short) (C1499aX.Xd() ^ (-17311));
                        short sXd4 = (short) (C1499aX.Xd() ^ (-12026));
                        int[] iArr2 = new int["DiR}mYNabH[\u007ffJ~drN`\u0007\u0006Jek`\u0004f\u0005\u0016z\remt|\u0004stpzu\u0004y\u0016㵋".length()];
                        QB qb2 = new QB("DiR}mYNabH[\u007ffJ~drN`\u0007\u0006Jek`\u0004f\u0005\u0016z\remt|\u0004stpzu\u0004y\u0016㵋");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(((i3 * sXd4) ^ sXd3) + xuXd2.CK(iKK2));
                            i3++;
                        }
                        Object[] objArr9 = new Object[1];
                        u(touchSlop, new String(iArr2, 0, i3), (byte) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14), objArr9);
                        f.c(strIntern3, ((String) objArr9[0]).intern());
                    }
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    Object[] objArr10 = new Object[1];
                    w((char) (ViewConfiguration.getEdgeSlop() >> 16), View.resolveSizeAndState(0, 0, 0), 3 - ExpandableListView.getPackedPositionGroup(0L), objArr10);
                    editorEdit.putString(((String) objArr10[0]).intern(), strE).commit();
                } catch (o.ef.b e2) {
                    if (f.a()) {
                        Object[] objArr11 = new Object[1];
                        w((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6046), View.MeasureSpec.getMode(0) + 3, 18 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr11);
                        String strIntern4 = ((String) objArr11[0]).intern();
                        Object[] objArr12 = new Object[1];
                        u(ExpandableListView.getPackedPositionChild(0L) + 12, C1561oA.Xd("s\u0007w\u0003y\u0006iq\b֦凳", (short) (Od.Xd() ^ (-28684))), (byte) (Color.argb(0, 0, 0, 0) + 77), objArr12);
                        f.e(strIntern4, ((String) objArr12[0]).intern(), e2);
                    }
                    SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                    Object[] objArr13 = new Object[1];
                    w((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, 3 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr13);
                    editorEdit2.putString(((String) objArr13[0]).intern(), "").commit();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    public final void e(OperationCallback<Void> operationCallback) throws Throwable {
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int id = (int) Thread.currentThread().getId();
        int i2 = f19958i * (-1273408225);
        f19958i = i2;
        int i3 = f19959j * (-1192134959);
        f19959j = i3;
        a(new Object[]{this, operationCallback}, iUptimeMillis, 409566510, i2, id, -409566510, i3);
    }
}
