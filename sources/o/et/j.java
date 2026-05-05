package o.et;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import fr.antelop.sdk.card.emvapplication.EmvApplicationType;
import java.lang.reflect.Method;
import o.a.k;
import o.a.n;
import o.a.q;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends g {
    private static int G = 1;
    private static int I = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static char[] f25382g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f25383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f25384i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f25385j = 1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static b f25386a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static b f25387b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f25388c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f25389d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static b f25390e = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f25391g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f25392h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f25393i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f25394j = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(short r7, short r8, short r9) {
            /*
                int r0 = r8 * 2
                int r8 = r0 + 113
                int r7 = r7 * 3
                int r1 = r7 + 1
                byte[] r6 = o.et.j.b.$$a
                int r0 = r9 * 3
                int r5 = 4 - r0
                byte[] r4 = new byte[r1]
                r3 = 0
                if (r6 != 0) goto L2c
                r0 = r5
                r2 = r3
            L15:
                int r8 = r8 + r5
                int r5 = r0 + 1
                r1 = r2
            L19:
                byte r0 = (byte) r8
                r4[r1] = r0
                int r2 = r1 + 1
                if (r1 != r7) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L26:
                r1 = r6[r5]
                r0 = r5
                r5 = r8
                r8 = r1
                goto L15
            L2c:
                r1 = r3
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.et.j.b.$$c(short, short, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f25393i = 0;
            f25394j = 1;
            f25391g = 0;
            f25392h = 1;
            d();
            Object[] objArr = new Object[1];
            f(TextUtils.indexOf("", "") + 12, "\u0012\ufff4\uffff\n\ufff4\f\u0006\ufff6\ufff7\ufff6\t\u0000", false, 243 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 7, objArr);
            f25390e = new b(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            f(14 - ((Process.getThreadPriority(0) + 20) >> 6), "\ufffa\ufff9\f\u0003￼\u0002\ufffb\u000e\uffff\ufff8\u0002\ufffb\u0015\ufff9", false, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 240, (ViewConfiguration.getPressedStateDuration() >> 16) + 4, objArr2);
            f25387b = new b(((String) objArr2[0]).intern(), 1);
            Object[] objArr3 = new Object[1];
            f(View.resolveSizeAndState(0, 0, 0) + 9, "\u0001\ufffb\ufff9\ufff7\b\ufffa\u0015\u0002\uffff", false, Color.green(0) + 240, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2, objArr3);
            f25386a = new b(((String) objArr3[0]).intern(), 2);
            f25389d = e();
            int i2 = f25393i + 5;
            f25394j = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private b(String str, int i2) {
        }

        static void d() {
            f25388c = -1270219331;
        }

        private static /* synthetic */ b[] e() {
            int i2 = 2 % 2;
            int i3 = f25392h + 87;
            f25391g = i3 % 128;
            if (i3 % 2 == 0) {
                return new b[]{f25390e, f25387b, f25386a};
            }
            b[] bVarArr = new b[4];
            bVarArr[0] = f25390e;
            bVarArr[1] = f25387b;
            bVarArr[5] = f25386a;
            return bVarArr;
        }

        private static void f(int i2, String str, boolean z2, int i3, int i4, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i5 = 2 % 2;
            int i6 = $10 + 43;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 13 / 0;
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
                int i8 = $10 + 49;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                nVar.f19946e = cArr[nVar.f19944a];
                cArr2[nVar.f19944a] = (char) (i3 + nVar.f19946e);
                int i10 = nVar.f19944a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(f25388c)};
                    Object objA = o.d.d.a(1376241034);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a(269 - MotionEvent.axisFromString(""), (char) Color.alpha(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, -2071844881, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {nVar, nVar};
                    Object objA2 = o.d.d.a(-202660535);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(522 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0') + 13, 627984172, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
            }
            if (z2) {
                char[] cArr4 = new char[i2];
                nVar.f19944a = 0;
                while (nVar.f19944a < i2) {
                    int i11 = $10 + 75;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        cArr4[nVar.f19944a] = cArr2[i2 >> nVar.f19944a];
                        Object[] objArr4 = {nVar, nVar};
                        Object objA3 = o.d.d.a(-202660535);
                        if (objA3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objA3 = o.d.d.a(Color.blue(0) + 522, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 627984172, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr4);
                    } else {
                        cArr4[nVar.f19944a] = cArr2[(i2 - nVar.f19944a) - 1];
                        Object[] objArr5 = {nVar, nVar};
                        Object objA4 = o.d.d.a(-202660535);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objA4 = o.d.d.a(View.resolveSizeAndState(0, 0, 0) + 522, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 12 - (KeyEvent.getMaxKeyCode() >> 16), 627984172, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA4).invoke(null, objArr5);
                    }
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        static void init$0() {
            $$a = new byte[]{119, -27, 45, 98};
            $$b = 222;
        }

        public static b valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f25392h + 115;
            f25391g = i3 % 128;
            int i4 = i3 % 2;
            b bVar = (b) Enum.valueOf(b.class, str);
            if (i4 != 0) {
                throw null;
            }
            int i5 = f25391g + 7;
            f25392h = i5 % 128;
            int i6 = i5 % 2;
            return bVar;
        }

        public static b[] values() {
            int i2 = 2 % 2;
            int i3 = f25391g + 5;
            f25392h = i3 % 128;
            int i4 = i3 % 2;
            b[] bVarArr = (b[]) f25389d.clone();
            int i5 = f25391g + 23;
            f25392h = i5 % 128;
            if (i5 % 2 != 0) {
                return bVarArr;
            }
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static c f25395a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static c f25396b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ c[] f25397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static c f25398d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static long f25399e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f25400f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f25401g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f25402h = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f25403j = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r8, byte r9, byte r10) {
            /*
                int r0 = r10 * 7
                int r7 = 78 - r0
                byte[] r6 = o.et.j.c.$$a
                int r5 = r9 + 4
                int r1 = r8 * 4
                int r0 = 1 - r1
                byte[] r4 = new byte[r0]
                r3 = 0
                int r2 = 0 - r1
                if (r6 != 0) goto L29
                r0 = r2
                r1 = r3
            L15:
                int r0 = -r0
                int r7 = r7 + r0
            L17:
                byte r0 = (byte) r7
                int r5 = r5 + 1
                r4[r1] = r0
                if (r1 != r2) goto L24
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L24:
                int r1 = r1 + 1
                r0 = r6[r5]
                goto L15
            L29:
                r1 = r3
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.et.j.c.$$c(int, byte, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f25403j = 0;
            f25402h = 1;
            f25400f = 0;
            f25401g = 1;
            b();
            Object[] objArr = new Object[1];
            i("\ue708뺀吼\uebc4腦壢", 22936 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
            f25396b = new c(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            i("\ue70fꍋ澃⯍\uf60b", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 17477, objArr2);
            f25395a = new c(((String) objArr2[0]).intern(), 1);
            Object[] objArr3 = new Object[1];
            i("\ue71e믨廚\uf1c2钰㞽쪋", 23789 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr3);
            f25398d = new c(((String) objArr3[0]).intern(), 2);
            f25397c = c();
            int i2 = f25403j + 47;
            f25402h = i2 % 128;
            int i3 = i2 % 2;
        }

        private c(String str, int i2) {
        }

        static void b() {
            f25399e = 4417888296819747332L;
        }

        private static /* synthetic */ c[] c() {
            int i2 = 2 % 2;
            int i3 = f25401g;
            int i4 = i3 + 89;
            f25400f = i4 % 128;
            int i5 = i4 % 2;
            c[] cVarArr = {f25396b, f25395a, f25398d};
            int i6 = i3 + 113;
            f25400f = i6 % 128;
            int i7 = i6 % 2;
            return cVarArr;
        }

        private static void i(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $10;
            int i5 = i4 + 17;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (str2 != null) {
                int i6 = i4 + 113;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                charArray = str2.toCharArray();
            } else {
                charArray = str2;
            }
            char[] cArr = (char[]) charArray;
            q qVar = new q();
            qVar.f19949d = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            qVar.f19948a = 0;
            while (qVar.f19948a < cArr.length) {
                int i8 = $10 + 109;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                int i10 = qVar.f19948a;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[qVar.f19948a]), qVar, qVar};
                    Object objA = o.d.d.a(-1011865131);
                    if (objA == null) {
                        int i11 = 731 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        char cArgb = (char) (7933 - Color.argb(0, 0, 0, 0));
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11;
                        byte b2 = $$a[3];
                        objA = o.d.d.a(i11, cArgb, minimumFlingVelocity, 355847088, false, $$c((byte) (b2 - 1), (byte) (-b2), b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i10] = ((Long) ((Method) objA).invoke(null, objArr2)).longValue() ^ (f25399e ^ 4743694005979712847L);
                    Object[] objArr3 = {qVar, qVar};
                    Object objA2 = o.d.d.a(1452497747);
                    if (objA2 == null) {
                        int scrollBarFadeDuration = 836 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        char c2 = (char) (27280 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        int iAlpha = 11 - Color.alpha(0);
                        byte b3 = $$a[3];
                        byte b4 = (byte) (b3 - 1);
                        byte b5 = (byte) (-b3);
                        objA2 = o.d.d.a(scrollBarFadeDuration, c2, iAlpha, -2145994442, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
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
                int i12 = $11 + 31;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                cArr2[qVar.f19948a] = (char) jArr[qVar.f19948a];
                Object[] objArr4 = {qVar, qVar};
                Object objA3 = o.d.d.a(1452497747);
                if (objA3 == null) {
                    int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 836;
                    char c3 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27278);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 11;
                    byte b6 = $$a[3];
                    byte b7 = (byte) (b6 - 1);
                    byte b8 = (byte) (-b6);
                    objA3 = o.d.d.a(doubleTapTimeout, c3, iResolveOpacity, -2145994442, false, $$c(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            String str3 = new String(cArr2);
            int i14 = $11 + 21;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
            objArr[0] = str3;
        }

        static void init$0() {
            $$a = new byte[]{57, MessagePack.Code.BIN8, -70, 1};
            $$b = 207;
        }

        public static c valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f25401g + 29;
            f25400f = i3 % 128;
            int i4 = i3 % 2;
            c cVar = (c) Enum.valueOf(c.class, str);
            int i5 = f25400f + 109;
            f25401g = i5 % 128;
            int i6 = i5 % 2;
            return cVar;
        }

        public static c[] values() {
            int i2 = 2 % 2;
            int i3 = f25401g + 71;
            f25400f = i3 % 128;
            int i4 = i3 % 2;
            c[] cVarArr = (c[]) f25397c.clone();
            int i5 = f25401g + 1;
            f25400f = i5 % 128;
            if (i5 % 2 == 0) {
                return cVarArr;
            }
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static d f25404a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ d[] f25405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static d f25406c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static d f25407d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static long f25408e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f25409f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f25410g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f25411h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f25412i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static char f25413j = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static int f25414m = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r8, int r9, byte r10) {
            /*
                byte[] r7 = o.et.j.d.$$a
                int r1 = r9 + 4
                int r2 = r8 * 3
                int r0 = 1 - r2
                int r6 = r10 + 65
                byte[] r5 = new byte[r0]
                r4 = 0
                int r3 = 0 - r2
                if (r7 != 0) goto L29
                r2 = r4
                r0 = r1
            L13:
                int r1 = -r1
                int r1 = r1 + r6
                r6 = r1
                r1 = r0
            L17:
                byte r0 = (byte) r6
                r5[r2] = r0
                if (r2 != r3) goto L22
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L22:
                int r0 = r1 + 1
                int r2 = r2 + 1
                r1 = r7[r0]
                goto L13
            L29:
                r2 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.et.j.d.$$c(byte, int, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f25411h = 0;
            f25414m = 1;
            f25410g = 0;
            f25412i = 1;
            e();
            Object[] objArr = new Object[1];
            k((char) (View.MeasureSpec.getSize(0) + 57216), "㼳丛炞ᤛꇍ䪻맢\u2cf4꼶╣칞⋚䀯睲꺚\uea63㓘闽ٿ缿茴ἕ사\uf176솱翯◉", "ⴓѻ⨨㨝", "踀蚪耸\udadf", 948349582 - Color.green(0), objArr);
            f25407d = new d(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            k((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), "ే啡悇窑헧ꨀ\uee8d뱺⦀ི᱓弙Č⪮\ud9a3ꤏ᳃ᗅ\uddbb쮂ﶝꤸ吉㑒ﯠ", "ⴓѻ⨨㨝", "鋻竢熰癁", (ViewConfiguration.getScrollDefaultDelay() >> 16) - 1334123886, objArr2);
            f25404a = new d(((String) objArr2[0]).intern(), 1);
            Object[] objArr3 = new Object[1];
            k((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 30865), "清鞄椪儀謺쬋縚\ude35ᬲᢺ컞衻ꀞㅨՄ㈇爠\uaa5a걖\u0ffa\ude24隺⎼Ǐ釋뭶", "ⴓѻ⨨㨝", "㢳ͦ递외", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr3);
            f25406c = new d(((String) objArr3[0]).intern(), 2);
            f25405b = d();
            int i2 = f25411h + 117;
            f25414m = i2 % 128;
            int i3 = i2 % 2;
        }

        private d(String str, int i2) {
        }

        private static /* synthetic */ d[] d() {
            int i2 = 2 % 2;
            int i3 = f25410g + 79;
            f25412i = i3 % 128;
            if (i3 % 2 != 0) {
                return new d[]{f25407d, f25404a, f25406c};
            }
            d[] dVarArr = new d[5];
            dVarArr[1] = f25407d;
            dVarArr[0] = f25404a;
            dVarArr[2] = f25406c;
            return dVarArr;
        }

        static void e() {
            f25408e = 3484114352896436421L;
            f25409f = 1564493270;
            f25413j = (char) 17878;
        }

        static void init$0() {
            $$a = new byte[]{84, 109, 90, 4};
            $$b = 186;
        }

        private static void k(char c2, String str, String str2, String str3, int i2, Object[] objArr) throws Throwable {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int i3 = 2 % 2;
            Object charArray = str6;
            if (str6 != null) {
                int i4 = $10 + 113;
                $11 = i4 % 128;
                int i5 = i4 % 2;
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
            int i6 = $11 + 3;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            while (iVar.f19932b < length3) {
                try {
                    Object[] objArr2 = {iVar};
                    Object objA = o.d.d.a(540069882);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a(107 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getLongPressTimeout() >> 16), Drawable.resolveOpacity(0, 0) + 11, -155898465, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {iVar};
                    Object objA2 = o.d.d.a(2068572);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objA2 = o.d.d.a((ViewConfiguration.getLongPressTimeout() >> 16) + 847, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6487), TextUtils.getOffsetAfter("", 0) + 12, -694521287, false, $$c(b4, b5, (byte) (b5 + 4)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA3 = o.d.d.a(-1122996612);
                    if (objA3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 - 1);
                        objA3 = o.d.d.a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 457, (char) Drawable.resolveOpacity(0, 0), 11 - (ViewConfiguration.getScrollBarSize() >> 8), 1804962841, false, $$c(b6, b7, (byte) (-b7)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                    Object objA4 = o.d.d.a(-1223178239);
                    if (objA4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = (byte) (b8 - 1);
                        objA4 = o.d.d.a(639 - (ViewConfiguration.getTouchSlop() >> 8), (char) (65100 - ExpandableListView.getPackedPositionType(0L)), 12 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1636969060, false, $$c(b8, b9, (byte) ((b9 + 57) - (57 | b9))), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr5)).charValue();
                    cArr3[iIntValue2] = iVar.f19933e;
                    cArr5[iVar.f19932b] = (char) ((((long) ((int) (((long) f25409f) ^ 740602047300126166L))) ^ (((long) (cArr3[iIntValue2] ^ r9[iVar.f19932b])) ^ (f25408e ^ 740602047300126166L))) ^ ((long) ((char) (((long) f25413j) ^ 740602047300126166L))));
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

        public static d valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f25412i + 103;
            f25410g = i3 % 128;
            int i4 = i3 % 2;
            d dVar = (d) Enum.valueOf(d.class, str);
            if (i4 != 0) {
                int i5 = 30 / 0;
            }
            int i6 = f25410g + 19;
            f25412i = i6 % 128;
            if (i6 % 2 != 0) {
                return dVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static d[] values() {
            int i2 = 2 % 2;
            int i3 = f25410g + 91;
            f25412i = i3 % 128;
            int i4 = i3 % 2;
            d[] dVarArr = (d[]) f25405b.clone();
            int i5 = f25410g + 55;
            f25412i = i5 % 128;
            int i6 = i5 % 2;
            return dVarArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static e f25415a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static e f25416b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static e f25417c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static e f25418d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static e f25419e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f25420f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f25421g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ e[] f25422h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f25423i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static long f25424j = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static int f25425o = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0016). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(short r8, int r9, int r10) {
            /*
                byte[] r7 = o.et.j.e.$$a
                int r0 = r8 * 7
                int r6 = 114 - r0
                int r0 = r10 * 3
                int r5 = 2 - r0
                int r4 = r9 * 3
                int r0 = r4 + 1
                byte[] r3 = new byte[r0]
                r2 = 0
                if (r7 != 0) goto L29
                r0 = r6
                r6 = r4
                r1 = r2
            L16:
                int r6 = r6 + r0
            L17:
                byte r0 = (byte) r6
                r3[r1] = r0
                if (r1 != r4) goto L22
                java.lang.String r0 = new java.lang.String
                r0.<init>(r3, r2)
                return r0
            L22:
                int r5 = r5 + 1
                int r1 = r1 + 1
                r0 = r7[r5]
                goto L16
            L29:
                r1 = r2
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.et.j.e.$$c(short, int, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f25420f = 0;
            f25425o = 1;
            f25421g = 0;
            f25423i = 1;
            d();
            Object[] objArr = new Object[1];
            k("省㿉\udfd7冷ࣱ튳ׂ쿍䶄鹕", View.getDefaultSize(0, 0), objArr);
            f25416b = new e(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            k("ᶓ\u19cf\ue792ᷗ삛\uf4a2㶀ުꥧ", ViewConfiguration.getEdgeSlop() >> 16, objArr2);
            f25417c = new e(((String) objArr2[0]).intern(), 1);
            Object[] objArr3 = new Object[1];
            k("\uded8\ue56c꺭\ude9bXࠋ環읭樽䓶„簉럙덈", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
            f25415a = new e(((String) objArr3[0]).intern(), 2);
            Object[] objArr4 = new Object[1];
            k("乔本\ue295丄奢詖㢀鹊蝹욭氡", View.MeasureSpec.makeMeasureSpec(0, 0), objArr4);
            f25418d = new e(((String) objArr4[0]).intern(), 3);
            Object[] objArr5 = new Object[1];
            k("퇉㗦襰톜\udd36\ud880卫ᨀ攦鑹ߎ", '0' - AndroidCharacter.getMirror('0'), objArr5);
            f25419e = new e(((String) objArr5[0]).intern(), 4);
            f25422h = c();
            int i2 = f25420f + 55;
            f25425o = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private e(String str, int i2) {
        }

        private static /* synthetic */ e[] c() {
            int i2 = 2 % 2;
            int i3 = f25423i + 63;
            f25421g = i3 % 128;
            if (i3 % 2 == 0) {
                return new e[]{f25416b, f25417c, f25415a, f25418d, f25419e};
            }
            e[] eVarArr = new e[3];
            eVarArr[1] = f25416b;
            eVarArr[0] = f25417c;
            eVarArr[2] = f25415a;
            eVarArr[5] = f25418d;
            eVarArr[5] = f25419e;
            return eVarArr;
        }

        static void d() {
            f25424j = -5234707664858415278L;
        }

        static void init$0() {
            $$a = new byte[]{32, MessagePack.Code.STR16, MessagePack.Code.NEVER_USED};
            $$b = 178;
        }

        private static void k(String str, int i2, Object[] objArr) throws Throwable {
            Object charArray;
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $11 + 101;
            int i5 = i4 % 128;
            $10 = i5;
            int i6 = i4 % 2;
            if (str2 != null) {
                int i7 = i5 + 57;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                charArray = str2.toCharArray();
            } else {
                charArray = str2;
            }
            k kVar = new k();
            char[] cArrC = k.c(f25424j ^ (-5882309809461882246L), (char[]) charArray, i2);
            kVar.f19939c = 4;
            while (kVar.f19939c < cArrC.length) {
                int i9 = $11 + 93;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                kVar.f19938a = kVar.f19939c - 4;
                int i11 = kVar.f19939c;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrC[kVar.f19939c] ^ cArrC[kVar.f19939c % 4]), Long.valueOf(kVar.f19938a), Long.valueOf(f25424j)};
                    Object objA = o.d.d.a(-1093976004);
                    if (objA == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objA = o.d.d.a(228 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 51004), 9 - (ViewConfiguration.getEdgeSlop() >> 16), 1749983833, false, $$c(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrC[i11] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {kVar, kVar};
                    Object objA2 = o.d.d.a(-912105096);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objA2 = o.d.d.a(View.getDefaultSize(0, 0) + 675, (char) View.getDefaultSize(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 12, 522683165, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
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
            objArr[0] = new String(cArrC, 4, cArrC.length - 4);
        }

        public static e valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f25423i + 7;
            f25421g = i3 % 128;
            int i4 = i3 % 2;
            e eVar = (e) Enum.valueOf(e.class, str);
            if (i4 == 0) {
                return eVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static e[] values() {
            int i2 = 2 % 2;
            int i3 = f25421g + 29;
            f25423i = i3 % 128;
            int i4 = i3 % 2;
            e[] eVarArr = (e[]) f25422h.clone();
            int i5 = f25421g + 7;
            f25423i = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 91 / 0;
            }
            return eVarArr;
        }
    }

    static {
        b();
        f25383h = new byte[]{-1, -1, -1, -1, -1, -1};
        int i2 = I + 23;
        G = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public j(String str, String str2, int i2, String str3) {
        super(str, str2, i2, str3);
        e(o.dp.b.f23217e);
        j((byte[]) f25383h.clone());
    }

    static void b() {
        f25382g = new char[]{56711, 56761, 56747, 56746, 56723, 56756, 56757, 56751, 56762, 56743, 56745, 56751, 56754, 56758, 56758};
    }

    private o.fd.c j(String str) {
        int i2 = 2 % 2;
        o.fd.c cVar = new o.fd.c(k(), str, false);
        cVar.a(g());
        int i3 = f25385j + 33;
        f25384i = i3 % 128;
        if (i3 % 2 == 0) {
            return cVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.et.g, o.et.c
    public final EmvApplicationType a() {
        int i2 = 2 % 2;
        int i3 = f25384i + 101;
        f25385j = i3 % 128;
        int i4 = i3 % 2;
        EmvApplicationType emvApplicationType = EmvApplicationType.HceMdes;
        int i5 = f25384i + 77;
        f25385j = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 1 / 0;
        }
        return emvApplicationType;
    }

    @Override // o.et.g, o.et.c
    protected final o.et.c b(String str, String str2, int i2, String str3) {
        int i3 = 2 % 2;
        j jVar = new j(str, str2, i2, str3);
        int i4 = f25384i + 87;
        f25385j = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return jVar;
    }

    @Override // o.et.g, o.eq.b
    public final /* synthetic */ o.eu.d c(String str) {
        int i2 = 2 % 2;
        int i3 = f25384i + 105;
        f25385j = i3 % 128;
        if (i3 % 2 != 0) {
            return j(str);
        }
        j(str);
        throw null;
    }

    @Override // o.et.g
    public final /* synthetic */ o.eu.e d(String str) {
        int i2 = 2 % 2;
        int i3 = f25385j + 51;
        f25384i = i3 % 128;
        int i4 = i3 % 2;
        o.fd.c cVarJ = j(str);
        if (i4 != 0) {
            int i5 = 67 / 0;
        }
        return cVarJ;
    }
}
