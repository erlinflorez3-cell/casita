package o.ey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.Ascii;
import fr.antelop.sdk.AntelopError;
import fr.antelop.sdk.AntelopErrorCode;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethod;
import fr.antelop.sdk.authentication.LocalAuthenticationErrorReason;
import fr.antelop.sdk.digitalcard.SecureCardPushToGooglePay;
import fr.antelop.sdk.util.Address;
import fr.antelop.sdk.util.AndroidActivityResultCallback;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.CharCompanionObject;
import o.a.i;
import o.a.l;
import o.a.o;
import o.ea.b;
import o.ea.f;
import o.ea.j;
import o.ep.i;
import o.er.d;
import o.es.c;
import o.y.g;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends d<o.es.a> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f25614f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f25615h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f25616i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f25617j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static char[] f25618l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f25619m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f25620n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f25621o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static char[] f25622p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f25623q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static int f25624r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int f25625s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static long f25626t = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static int f25627x = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private o.es.a f25628k;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$f(int r7, byte r8, short r9) {
        /*
            int r2 = r8 + 4
            int r8 = r7 * 2
            int r0 = r8 + 1
            byte[] r7 = o.ey.e.$$d
            int r1 = 120 - r9
            byte[] r6 = new byte[r0]
            r5 = 0
            if (r7 != 0) goto L28
            r4 = r8
            r0 = r2
            r3 = r5
        L12:
            int r1 = -r2
            int r1 = r1 + r4
            r2 = r0
        L15:
            byte r0 = (byte) r1
            r6[r3] = r0
            int r0 = r2 + 1
            if (r3 != r8) goto L22
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r5)
            return r0
        L22:
            r2 = r7[r0]
            int r3 = r3 + 1
            r4 = r1
            goto L12
        L28:
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ey.e.$$f(int, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25621o = -874530403;
        f25620n = 319994811;
        f25619m = 237458141;
        f25615h = -2011531939;
        f25617j = -845423784;
        f25616i = 746631736;
        f25614f = 368084538;
        f25624r = 0;
        f25627x = 1;
        f25623q = 0;
        f25625s = 1;
        j();
        int i2 = f25627x + 95;
        f25624r = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
        }
    }

    public e(o.ep.d dVar, o.eq.e eVar) {
        super(dVar, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void A(char r24, int r25, int r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ey.e.A(char, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void B(java.lang.String r23, int[] r24, boolean r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ey.e.B(java.lang.String, int[], boolean, java.lang.Object[]):void");
    }

    static /* synthetic */ o.ep.d a(e eVar) {
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i2 = (-637792661) * f25616i;
        f25616i = i2;
        int i3 = f25617j * 514205254;
        f25617j = i3;
        int i4 = f25615h * 410979428;
        f25615h = i4;
        return (o.ep.d) e(i2, -1583053525, i3, iUptimeMillis, i4, new Object[]{eVar}, 1583053526);
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        e eVar = (e) objArr[0];
        int i2 = 2 % 2;
        int i3 = f25625s + 65;
        f25623q = i3 % 128;
        int i4 = i3 % 2;
        o.ep.d dVar = eVar.f25009a;
        int i5 = f25625s + 35;
        f25623q = i5 % 128;
        if (i5 % 2 == 0) {
            return dVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ o.ep.d b(e eVar) {
        int i2 = 2 % 2;
        int i3 = f25623q + 57;
        f25625s = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        o.ep.d dVar = eVar.f25009a;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = f25623q + 37;
        f25625s = i5 % 128;
        if (i5 % 2 != 0) {
            return dVar;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(OperationCallback operationCallback, int i2, Intent intent) {
        int i3 = 2 % 2;
        if (i2 == 0) {
            operationCallback.onError(new AntelopError(new o.by.c(AntelopErrorCode.UserCancelled)));
            return;
        }
        if (i2 != -1) {
            operationCallback.onError(new AntelopError(new o.by.c(AntelopErrorCode.GooglePayWalletNotAvailable)));
            return;
        }
        int i4 = f25623q + 35;
        f25625s = i4 % 128;
        int i5 = i4 % 2;
        operationCallback.onSuccess(null);
        int i6 = f25625s + 65;
        f25623q = i6 % 128;
        int i7 = i6 % 2;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        e eVar = (e) objArr[0];
        int i2 = 2 % 2;
        int i3 = f25623q + 63;
        f25625s = i3 % 128;
        int i4 = i3 % 2;
        o.ep.d dVar = eVar.f25009a;
        if (i4 == 0) {
            throw null;
        }
        int i5 = f25625s + 95;
        f25623q = i5 % 128;
        if (i5 % 2 == 0) {
            return dVar;
        }
        throw null;
    }

    static /* synthetic */ o.ep.d c(e eVar) {
        int i2 = 2 % 2;
        int i3 = f25625s + 85;
        f25623q = i3 % 128;
        int i4 = i3 % 2;
        o.ep.d dVar = eVar.f25009a;
        int i5 = f25623q + 13;
        f25625s = i5 % 128;
        if (i5 % 2 != 0) {
            return dVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(OperationCallback operationCallback, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = f25623q + 111;
        int i5 = i4 % 128;
        f25625s = i5;
        int i6 = i4 % 2;
        if (i2 == 0) {
            operationCallback.onError(new AntelopError(new o.by.c(AntelopErrorCode.UserCancelled)));
            return;
        }
        if (i2 != -1) {
            operationCallback.onError(new AntelopError(new o.by.c(AntelopErrorCode.GooglePayWalletNotAvailable)));
            return;
        }
        int i7 = i5 + 53;
        f25623q = i7 % 128;
        if (i7 % 2 == 0) {
            operationCallback.onSuccess(null);
        } else {
            operationCallback.onSuccess(null);
            int i8 = 78 / 0;
        }
    }

    static /* synthetic */ o.ep.d d(e eVar) {
        int i2 = 2 % 2;
        int i3 = f25625s + 125;
        f25623q = i3 % 128;
        int i4 = i3 % 2;
        o.ep.d dVar = eVar.f25009a;
        int i5 = f25625s + 57;
        f25623q = i5 % 128;
        int i6 = i5 % 2;
        return dVar;
    }

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) throws Throwable {
        String strA;
        Object obj;
        int i8 = i3 | i7;
        int i9 = ~i5;
        int i10 = (i8 + i9) - (i8 & i9);
        int i11 = (~((-1) - (((-1) - (~i3)) & ((-1) - i7)))) | (~((-1) - (((-1) - i3) & ((-1) - i5))));
        int i12 = (-1) - (((-1) - (~(i5 | (~i7)))) & ((-1) - i3));
        int i13 = i3 + i7 + i2 + ((-1069702238) * i4) + (1645725337 * i6);
        int i14 = i13 * i13;
        int i15 = ((i3 * 2084108943) - 1824784384) + (2084108943 * i7) + (i10 * (-929364622)) + (929364622 * i11) + ((-929364622) * i12) + (1154744320 * i2) + ((-1977090048) * i4) + (448004096 * i6) + (1807155200 * i14);
        int i16 = (i3 * (-999696423)) + 1136243370 + (i7 * (-999696423)) + (i10 * 830) + (i11 * (-830)) + (i12 * 830) + (i2 * (-999695593)) + (i4 * 636963214) + (i6 * (-1077364033)) + (i14 * 980484096);
        int i17 = i15 + (i16 * i16 * 1287192576);
        if (i17 == 1) {
            e eVar = (e) objArr[0];
            int i18 = 2 % 2;
            int i19 = f25625s + 85;
            f25623q = i19 % 128;
            int i20 = i19 % 2;
            o.ep.d dVar = eVar.f25009a;
            int i21 = f25625s + 15;
            f25623q = i21 % 128;
            int i22 = i21 % 2;
            return dVar;
        }
        if (i17 == 2) {
            return c(objArr);
        }
        if (i17 != 3) {
            if (i17 == 4) {
                return b(objArr);
            }
            int i23 = 2 % 2;
            String strB = ((e) objArr[0]).f25010g.d().b();
            if (strB == null) {
                if (f.a()) {
                    int i24 = f25625s + 117;
                    f25623q = i24 % 128;
                    int i25 = i24 % 2;
                    Object[] objArr2 = new Object[1];
                    B("\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000", new int[]{0, 21, 46, 0}, false, objArr2);
                    String strIntern = ((String) objArr2[0]).intern();
                    Object[] objArr3 = new Object[1];
                    A((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 16 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 124 - TextUtils.getCapsMode("", 0, 0), objArr3);
                    f.d(strIntern, ((String) objArr3[0]).intern());
                }
                Object[] objArr4 = new Object[1];
                B("\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001", new int[]{21, 17, 0, 17}, false, objArr4);
                strB = ((String) objArr4[0]).intern();
            }
            int i26 = f25625s + 69;
            f25623q = i26 % 128;
            int i27 = i26 % 2;
            return strB;
        }
        e eVar2 = (e) objArr[0];
        final Activity activity = (Activity) objArr[1];
        int i28 = 2 % 2;
        int i29 = f25625s + 53;
        f25623q = i29 % 128;
        int i30 = i29 % 2;
        if (f.a()) {
            int i31 = f25623q + 103;
            f25625s = i31 % 128;
            if (i31 % 2 == 0) {
                strA = eVar2.a();
                Object[] objArr5 = new Object[1];
                A((char) (ViewConfiguration.getScrollBarFadeDuration() / 88), 5376 - (ViewConfiguration.getMinimumFlingVelocity() % 70), 94 / (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr5);
                obj = objArr5[0];
            } else {
                strA = eVar2.a();
                Object[] objArr6 = new Object[1];
                A((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 191, 9 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr6);
                obj = objArr6[0];
            }
            f.c(strA, ((String) obj).intern());
        }
        eVar2.a((Context) activity).c(new c.a<List<o.es.e>>() { // from class: o.ey.e.4
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f25661b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int[] f25662c = null;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static char[] f25663e = null;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static int f25664f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static int f25665g = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f25666i = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$e(short r6, byte r7, short r8) {
                /*
                    int r0 = r8 * 3
                    int r8 = r0 + 4
                    int r1 = r6 * 3
                    int r0 = 1 - r1
                    int r7 = 121 - r7
                    byte[] r6 = o.ey.e.AnonymousClass4.$$c
                    byte[] r5 = new byte[r0]
                    r4 = 0
                    int r3 = 0 - r1
                    if (r6 != 0) goto L2a
                    r0 = r3
                    r2 = r4
                L15:
                    int r0 = -r0
                    int r7 = r7 + r0
                    int r8 = r8 + 1
                    r1 = r2
                L1a:
                    byte r0 = (byte) r7
                    r5[r1] = r0
                    int r2 = r1 + 1
                    if (r1 != r3) goto L27
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    return r0
                L27:
                    r0 = r6[r8]
                    goto L15
                L2a:
                    r1 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ey.e.AnonymousClass4.$$e(short, byte, short):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                f25665g = -1734027697;
                f25664f = -655852358;
                init$0();
                f25661b = 0;
                f25666i = 1;
                f25663e = new char[]{56505, 56563, 56556, 56548, 56547, 56556, 56548, 56544, 56558, 56519, 56486, 56486, 56514, 56555, 56553, 56530, 56541, 56563, 56555, 56557, 56506, 56537, 56536, 56569, 56574, 56321, 56572, 56569, 56321, 56545, 56520, 56553, 56574, 56321, 56572, 56574, 56326, 56570, 56567, 56569, 56571, CharCompanionObject.MIN_LOW_SURROGATE, 56572, 56504, 56560, 56558, 56554, 56550, 56546, 56554, 56558, 56556, 56558, 56539, 56539, 56554, 56554, 56552, 56551, 56553, 56555, 56560, 56556, 56550, 56521, 56520, 56553, 56558, 56561, 56556, 56553, 56561, 56529, 56527, 56558, 56525, 56503, 56499, 56553, 56550, 56548, 56557, 56552, 56428, 56712, 56711, 56719, 56722, 56715, 56712, 56709, 56715, 56716, 56429, 56436, 56718, 56429, 56430, 56720, 56719, 56429, 56432, 56719, 56719, 56722, 56437, 56433, 56720, 56719, 56715, 56737, 56736, 56742, 56742, 56756, 56737, 56740, 56739, 56429, 56750, 56753, 56740, 56747};
                f25662c = new int[]{665567002, 2120224056, 1769586771, 969937270, -1263168186, -1998647601, 445379688, 44313757, -1050923265, 555158612, 437825257, -1439533409, 1852861352, -1279696158, -1060964549, -266125081, 373227849, -45402298};
            }

            private void d(List<o.es.e> list) throws Throwable {
                int i32 = 2 % 2;
                if (f.a()) {
                    int i33 = f25666i + 79;
                    f25661b = i33 % 128;
                    int i34 = i33 % 2;
                    String strA2 = e.this.a();
                    Object[] objArr7 = new Object[1];
                    h("\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001", new int[]{0, 20, 0, 0}, true, objArr7);
                    f.c(strA2, ((String) objArr7[0]).intern());
                }
                int i35 = f25666i + 1;
                f25661b = i35 % 128;
                int i36 = i35 % 2;
                o.es.e eVar3 = null;
                for (o.es.e eVar4 : list) {
                    if (e.i(e.this).s() != null) {
                        String strD = eVar4.d();
                        Object[] objArr8 = {e.g(e.this).s()};
                        int i37 = 574268897 * o.ep.c.f24438e;
                        o.ep.c.f24438e = i37;
                        int id = (int) Thread.currentThread().getId();
                        int i38 = o.ep.c.f24436c * 1169734117;
                        o.ep.c.f24436c = i38;
                        int i39 = (-2104816085) * o.ep.c.f24434a;
                        o.ep.c.f24434a = i39;
                        if (strD.equals((String) o.ep.c.c(i37, id, i39, 1241915024, objArr8, -1241915024, i38))) {
                            int i40 = f25666i + 121;
                            f25661b = i40 % 128;
                            if (i40 % 2 != 0) {
                                int i41 = 14 / 0;
                            }
                            eVar3 = eVar4;
                        }
                    }
                }
                if (eVar3 != null) {
                    int i42 = f25666i + 63;
                    f25661b = i42 % 128;
                    if (i42 % 2 == 0) {
                        e.this.a((Context) activity).a(eVar3);
                    } else {
                        e.this.a((Context) activity).a(eVar3);
                        int i43 = 11 / 0;
                    }
                }
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(Unknown Source)
                	at java.base/java.util.TreeMap.lastKey(Unknown Source)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] d(android.content.Context r23, int r24, int r25, int r26) {
                /*
                    Method dump skipped, instruction units count: 1676
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ey.e.AnonymousClass4.d(android.content.Context, int, int, int):java.lang.Object[]");
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x00eb A[Catch: all -> 0x0206, TryCatch #0 {all -> 0x0206, blocks: (B:10:0x0039, B:12:0x004a, B:13:0x0081, B:28:0x00d3, B:30:0x00eb, B:31:0x011e, B:45:0x01b6, B:47:0x01c7, B:48:0x01fa, B:36:0x013c, B:38:0x0155, B:39:0x0191), top: B:73:0x0039 }] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0155 A[Catch: all -> 0x0206, TryCatch #0 {all -> 0x0206, blocks: (B:10:0x0039, B:12:0x004a, B:13:0x0081, B:28:0x00d3, B:30:0x00eb, B:31:0x011e, B:45:0x01b6, B:47:0x01c7, B:48:0x01fa, B:36:0x013c, B:38:0x0155, B:39:0x0191), top: B:73:0x0039 }] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x01ac  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void h(java.lang.String r23, int[] r24, boolean r25, java.lang.Object[] r26) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 646
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ey.e.AnonymousClass4.h(java.lang.String, int[], boolean, java.lang.Object[]):void");
            }

            static void init$0() {
                $$a = new byte[]{Ascii.EM, -93, 95, -122};
                $$b = 43;
            }

            static void init$1() {
                $$c = new byte[]{53, 102, 82, Ascii.ETB};
                $$d = 96;
            }

            private static void j(int[] iArr, int i32, Object[] objArr7) throws Throwable {
                int i33 = 2;
                int i34 = 2 % 2;
                l lVar = new l();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = f25662c;
                int i35 = 989264422;
                long j2 = 0;
                int i36 = 16;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i37 = 0;
                    while (i37 < length) {
                        int i38 = $10 + 85;
                        $11 = i38 % 128;
                        int i39 = i38 % i33;
                        try {
                            Object[] objArr8 = {Integer.valueOf(iArr2[i37])};
                            Object objA = o.d.d.a(i35);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objA = o.d.d.a((ViewConfiguration.getPressedStateDuration() >> i36) + 675, (char) ExpandableListView.getPackedPositionGroup(j2), 11 - TextUtils.lastIndexOf("", '0'), -328001469, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            iArr3[i37] = ((Integer) ((Method) objA).invoke(null, objArr8)).intValue();
                            i37++;
                            i33 = 2;
                            i35 = 989264422;
                            j2 = 0;
                            i36 = 16;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = f25662c;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    for (int i40 = 0; i40 < length3; i40++) {
                        Object[] objArr9 = {Integer.valueOf(iArr5[i40])};
                        Object objA2 = o.d.d.a(989264422);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA2 = o.d.d.a(675 - TextUtils.indexOf("", "", 0, 0), (char) ((Process.getThreadPriority(0) + 20) >> 6), 12 - (ViewConfiguration.getEdgeSlop() >> 16), -328001469, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        iArr6[i40] = ((Integer) ((Method) objA2).invoke(null, objArr9)).intValue();
                    }
                    iArr5 = iArr6;
                }
                System.arraycopy(iArr5, 0, iArr4, 0, length2);
                lVar.f19941d = 0;
                int i41 = $11 + 57;
                $10 = i41 % 128;
                int i42 = i41 % 2;
                while (lVar.f19941d < iArr.length) {
                    int i43 = $10 + 31;
                    $11 = i43 % 128;
                    int i44 = i43 % 2;
                    cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
                    cArr[1] = (char) iArr[lVar.f19941d];
                    cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                    cArr[3] = (char) iArr[lVar.f19941d + 1];
                    lVar.f19942e = (cArr[0] << 16) + cArr[1];
                    lVar.f19940a = (cArr[2] << 16) + cArr[3];
                    l.a(iArr4);
                    int i45 = 0;
                    for (int i46 = 16; i45 < i46; i46 = 16) {
                        lVar.f19942e ^= iArr4[i45];
                        Object[] objArr10 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                        Object objA3 = o.d.d.a(2098218801);
                        if (objA3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 2);
                            objA3 = o.d.d.a(301 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (52697 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 11 - KeyEvent.keyCodeFromString(""), -1416256172, false, $$e(b6, b7, (byte) (b7 - 2)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr10)).intValue();
                        lVar.f19942e = lVar.f19940a;
                        lVar.f19940a = iIntValue;
                        i45++;
                        int i47 = $11 + 21;
                        $10 = i47 % 128;
                        int i48 = i47 % 2;
                    }
                    int i49 = lVar.f19942e;
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = i49;
                    lVar.f19940a ^= iArr4[16];
                    lVar.f19942e ^= iArr4[17];
                    int i50 = lVar.f19942e;
                    int i51 = lVar.f19940a;
                    cArr[0] = (char) (lVar.f19942e >>> 16);
                    cArr[1] = (char) lVar.f19942e;
                    cArr[2] = (char) (lVar.f19940a >>> 16);
                    cArr[3] = (char) lVar.f19940a;
                    l.a(iArr4);
                    cArr2[lVar.f19941d * 2] = cArr[0];
                    cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                    cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                    cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
                    Object[] objArr11 = {lVar, lVar};
                    Object objA4 = o.d.d.a(986820978);
                    if (objA4 == null) {
                        int packedPositionChild = 228 - ExpandableListView.getPackedPositionChild(0L);
                        char c2 = (char) (51004 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        int i52 = 8 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        byte length4 = (byte) $$c.length;
                        objA4 = o.d.d.a(packedPositionChild, c2, i52, -330018025, false, $$e((byte) 0, length4, (byte) (length4 - 4)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr11);
                }
                objArr7[0] = new String(cArr2, 0, i32);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0014). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void k(short r8, int r9, byte r10, java.lang.Object[] r11) {
                /*
                    int r0 = r10 * 2
                    int r7 = r0 + 4
                    byte[] r6 = o.ey.e.AnonymousClass4.$$a
                    int r0 = r9 * 3
                    int r5 = r0 + 1
                    int r2 = 101 - r8
                    byte[] r4 = new byte[r5]
                    r3 = 0
                    if (r6 != 0) goto L2a
                    r0 = r5
                    r2 = r7
                    r1 = r3
                L14:
                    int r7 = r7 + 1
                    int r0 = -r0
                    int r2 = r2 + r0
                L18:
                    byte r0 = (byte) r2
                    r4[r1] = r0
                    int r1 = r1 + 1
                    if (r1 != r5) goto L27
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    r11[r3] = r0
                    return
                L27:
                    r0 = r6[r7]
                    goto L14
                L2a:
                    r1 = r3
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ey.e.AnonymousClass4.k(short, int, byte, java.lang.Object[]):void");
            }

            @Override // o.es.c.a
            public final /* synthetic */ void a(List<o.es.e> list) throws Throwable {
                int i32 = 2 % 2;
                int i33 = f25661b + 123;
                f25666i = i33 % 128;
                int i34 = i33 % 2;
                d(list);
                int i35 = f25661b + 23;
                f25666i = i35 % 128;
                if (i35 % 2 == 0) {
                    int i36 = 23 / 0;
                }
            }

            @Override // o.es.c.a
            public final void d(o.by.c cVar) throws Throwable {
                int i32 = 2 % 2;
                int i33 = f25661b + 83;
                f25666i = i33 % 128;
                int i34 = i33 % 2;
                if (f.a()) {
                    Object[] objArr7 = new Object[1];
                    j(new int[]{-1737162571, -244175207, 977268179, 1188785401, -67826007, -895123280, -1809494777, -635316874, -1039742026, -157853844, -328094966, -1749642240}, 21 - TextUtils.getOffsetAfter("", 0), objArr7);
                    String strIntern2 = ((String) objArr7[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr8 = new Object[1];
                    j(new int[]{-255680536, -1549062260, 403436663, -1473477518, -967127332, 721030284, 358330723, 1480362767, -879716422, 449482197, -1679598022, -269668206, -1278223115, 718044538, -1418151964, 1623533186, -1067873552, -642475611}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 35, objArr8);
                    f.d(strIntern2, sb.append(((String) objArr8[0]).intern()).append(cVar).toString());
                }
                int i35 = f25661b + 51;
                f25666i = i35 % 128;
                int i36 = i35 % 2;
            }
        });
        int i32 = f25625s + 57;
        f25623q = i32 % 128;
        int i33 = i32 % 2;
        return null;
    }

    static /* synthetic */ o.ep.d e(e eVar) {
        int iNextInt = new Random().nextInt();
        return (o.ep.d) e((int) Process.getElapsedCpuTime(), 436457421, (int) SystemClock.elapsedRealtime(), iNextInt, (int) Thread.currentThread().getId(), new Object[]{eVar}, -436457419);
    }

    private String f() {
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i3 = 1152310514 * f25614f;
        f25614f = i3;
        return (String) e(iFreeMemory, -1817011330, i3, i2, (int) Runtime.getRuntime().freeMemory(), new Object[]{this}, 1817011330);
    }

    static /* synthetic */ o.ep.d f(e eVar) {
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        return (o.ep.d) e((int) Process.getElapsedCpuTime(), 1016123376, new Random().nextInt(), iMaxMemory, (int) SystemClock.uptimeMillis(), new Object[]{eVar}, -1016123372);
    }

    static /* synthetic */ o.ep.d g(e eVar) {
        int i2 = 2 % 2;
        int i3 = f25625s + 101;
        f25623q = i3 % 128;
        int i4 = i3 % 2;
        o.ep.d dVar = eVar.f25009a;
        int i5 = f25623q + 65;
        f25625s = i5 % 128;
        int i6 = i5 % 2;
        return dVar;
    }

    static /* synthetic */ o.ep.d h(e eVar) {
        int i2 = 2 % 2;
        int i3 = f25623q + 21;
        f25625s = i3 % 128;
        int i4 = i3 % 2;
        o.ep.d dVar = eVar.f25009a;
        if (i4 != 0) {
            return dVar;
        }
        throw null;
    }

    static /* synthetic */ o.ep.d i(e eVar) {
        int i2 = 2 % 2;
        int i3 = f25623q + 115;
        f25625s = i3 % 128;
        int i4 = i3 % 2;
        o.ep.d dVar = eVar.f25009a;
        int i5 = f25623q + 49;
        f25625s = i5 % 128;
        int i6 = i5 % 2;
        return dVar;
    }

    static void init$0() {
        $$d = new byte[]{117, -127, -11, 113};
        $$e = 73;
    }

    static void j() {
        f25618l = new char[]{38069, 32969, 48181, 43113, 50638, 61747, 60762, 6879, 13867, 8789, 24543, 19228, 26484, 40159, 34825, 42107, 38037, 32963, 48174, 43102, 50647, 61733, 60770, 6909, 13875, 8820, 24542, 19245, 26487, 40133, 34846, 42097, 53727, 52483, 63848, 5775, 535, 15970, 11170, 18203, 29564, 26802, 33811, 45133, 44451, 55554, 62787, 58033, 7708, 2678, 10171, 21498, 20310, 25779, 37112, 35920, 47602, 54699, 49434, 65211, 60140, 1623, 13192, 12274, 23383, 28870, 27886, 38945, 46530, 41457, 56623, 51850, 59058, 4609, 3989, 15297, 22309, 19610, 30927, 37902, 33171, 48607, 43386, 50558, 62147, 60962, 6782, 14299, 8992, 24424, 29850, 24576, 40035, 35291, 42255, 53566, 52947, 64021, 5737, 929, 16129, 11135, 16555, 31754, 26743, 34210, 45402, 44291, 56034, 63011, 57945, 8123, 2898, 10066, 23730, 18667, 25602, 37298, 36335, 47448, 54963, 49907, 65110, 60314, 1954, 13144, 10373, 17598, 28755, 28051, 39406, 46374, 41666, 57062, 51755, 59274, 5094, 3875, 9352, 20672, 38037, 32963, 48174, 43101, 50631, 61749, 60799, 6860, 13879, 8773, 24539, 19228, 26470, 40166, 34847, 42093, 53722, 38349, 33180, 48486, 43305, 50350, 61560, 60471, 7061, 38017, 32963, 48174, 43087, 50641, 61714, 60783, 6872, 13875, 8819, 24534, 19226, 26433, 40151, 34840, 42106, 38038, 32963, 48182, 43115, 50646, 61747, 60745, 6879, 13856, 8802, 38017, 32974, 48181, 43129, 50657, 61751, 60792, 6874};
        f25626t = 3115907465514483878L;
        f25622p = new char[]{56507, 56329, 56348, 56343, 56345, 56330, 56329, 56349, 56345, 56343, 56342, 56328, 56326, 56347, 56340, 56330, 56345, 56354, 56349, 56340, 56338, 56503, 56558, 56551, 56544, 56555, 56564, 56558, 56550, 56553, 56561, 56558, 56550, 56546, 56554, 56558, 56556, 56558, 56325, 56446, 56425, 56435, 56705, 56705, 56444, 56436, 56438, 56421, 56428, 56447, 56439, 56444, 56442, 56419, 56428, 56706, 56442, 56442};
    }

    @Override // o.er.d
    public final String a() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f25625s + 55;
        f25623q = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            B("\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000", new int[]{0, 21, 46, 0}, true, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            B("\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000", new int[]{0, 21, 46, 0}, false, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i4 = f25625s + 49;
        f25623q = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    public final o.es.a a(Context context) {
        int i2 = 2 % 2;
        int i3 = f25623q + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f25625s = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.f25628k == null) {
            o.ea.c.a();
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            this.f25628k = (o.es.a) b.a((int) Runtime.getRuntime().freeMemory(), 2135872852, iElapsedRealtime, new Object[]{context}, Process.myUid(), Thread.activeCount(), -2135872847);
        }
        o.es.a aVar = this.f25628k;
        int i4 = f25623q + 97;
        f25625s = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return aVar;
    }

    public final void a(final Activity activity, final OperationCallback<Boolean> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f25623q + 47;
            f25625s = i3 % 128;
            int i4 = i3 % 2;
            String strA = a();
            Object[] objArr = new Object[1];
            B("\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", new int[]{38, 20, 145, 12}, true, objArr);
            f.c(strA, ((String) objArr[0]).intern());
            int i5 = f25625s + 19;
            f25623q = i5 % 128;
            int i6 = i5 % 2;
        }
        a((Context) activity, new OperationCallback<Boolean>() { // from class: o.ey.e.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f25669a = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int[] f25670d = null;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f25671i = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:5:0x0015). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$c(short r9, int r10, byte r11) {
                /*
                    int r0 = r10 * 3
                    int r8 = r0 + 4
                    int r0 = r11 * 2
                    int r7 = 1 - r0
                    byte[] r6 = o.ey.e.AnonymousClass5.$$a
                    int r0 = r9 * 2
                    int r5 = 121 - r0
                    byte[] r4 = new byte[r7]
                    r3 = 0
                    if (r6 != 0) goto L2a
                    r0 = r8
                    r2 = r3
                L15:
                    int r8 = r8 + 1
                    int r0 = -r0
                    int r5 = r5 + r0
                    r1 = r2
                L1a:
                    byte r0 = (byte) r5
                    int r2 = r1 + 1
                    r4[r1] = r0
                    if (r2 != r7) goto L27
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    return r0
                L27:
                    r0 = r6[r8]
                    goto L15
                L2a:
                    r1 = r3
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ey.e.AnonymousClass5.$$c(short, int, byte):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f25669a = 0;
                f25671i = 1;
                f25670d = new int[]{1028958821, 1623972658, -1406296415, 35666668, -1671475739, -309035834, -398955422, -1264702967, -595222835, -445525419, 886327154, 1770863295, 618674213, 803504606, -1404670621, -873424428, -870457381, -697203793};
            }

            private void c(Boolean bool) throws Throwable {
                int i7 = 2 % 2;
                int i8 = f25669a + 75;
                f25671i = i8 % 128;
                if (i8 % 2 == 0) {
                    bool.booleanValue();
                    throw null;
                }
                if (bool.booleanValue()) {
                    e.this.a((Context) activity).c(new c.a<List<o.es.e>>() { // from class: o.ey.e.5.2
                        private static final byte[] $$a = null;
                        private static final int $$b = 0;
                        private static final byte[] $$c = null;
                        private static final int $$d = 0;
                        private static int $10 = 0;
                        private static int $11 = 0;

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        private static int f25675a = 0;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        private static long f25676c = 0;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private static int[] f25677d = null;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        private static char f25678e = 0;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public static int f25679f = 0;

                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                        private static int f25680g = 0;

                        /* JADX INFO: renamed from: h, reason: collision with root package name */
                        private static int f25681h = 0;

                        /* JADX INFO: renamed from: i, reason: collision with root package name */
                        public static int f25682i = 0;

                        /* JADX INFO: renamed from: j, reason: collision with root package name */
                        public static int f25683j = 0;

                        /* JADX INFO: renamed from: k, reason: collision with root package name */
                        public static int f25684k = 0;

                        /* JADX INFO: renamed from: l, reason: collision with root package name */
                        public static int f25685l = 0;

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:5:0x0013). Please report as a decompilation issue!!! */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private static java.lang.String $$e(int r9, byte r10, int r11) {
                            /*
                                int r0 = r11 * 4
                                int r8 = 1 - r0
                                byte[] r7 = o.ey.e.AnonymousClass5.AnonymousClass2.$$c
                                int r0 = r10 * 3
                                int r6 = r0 + 4
                                int r5 = r9 + 65
                                byte[] r4 = new byte[r8]
                                r3 = 0
                                if (r7 != 0) goto L28
                                r0 = r8
                                r2 = r3
                            L13:
                                int r0 = -r0
                                int r5 = r5 + r0
                                int r6 = r6 + 1
                                r1 = r2
                            L18:
                                byte r0 = (byte) r5
                                int r2 = r1 + 1
                                r4[r1] = r0
                                if (r2 != r8) goto L25
                                java.lang.String r0 = new java.lang.String
                                r0.<init>(r4, r3)
                                return r0
                            L25:
                                r0 = r7[r6]
                                goto L13
                            L28:
                                r1 = r3
                                goto L18
                            */
                            throw new UnsupportedOperationException("Method not decompiled: o.ey.e.AnonymousClass5.AnonymousClass2.$$e(int, byte, int):java.lang.String");
                        }

                        static {
                            init$1();
                            $10 = 0;
                            $11 = 1;
                            f25685l = -387477490;
                            f25684k = 252615811;
                            f25683j = 1017464215;
                            f25682i = 380718461;
                            f25679f = -1009668316;
                            init$0();
                            f25680g = 0;
                            f25681h = 1;
                            f25676c = 6670952349673485191L;
                            f25675a = 1564493270;
                            f25678e = (char) 17878;
                            f25677d = new int[]{-415217782, 1331717172, -277329548, 556022061, 922832025, 238969125, -300379185, 2065740507, -1136875245, -206028106, -364975936, 1761623916, -1846737989, 1479869868, -1773890202, -377184584, 402043021, -2102059021};
                        }

                        private void c(List<o.es.e> list) throws Throwable {
                            int i9 = 2 % 2;
                            if (f.a()) {
                                String strA2 = e.this.a();
                                Object[] objArr2 = new Object[1];
                                m((char) (45012 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), "谱\udea5傱\ue35d얾눦蘻ꨬ형\udd75ꊹ졑\uf0f2Ŧ\uf6ca\uef09覆ꖌ⭑硳\ued04苦ᅘ⥏ങ洦\uf16bᔠ쟆ꐰ匳⯏翯\udad9죛巈裇\ueda0់ꖆ\uf646刺\ue80b渊ꫫ廃渴ᄸ剅焱采ࣃ", "㙑ژ\ude72囔", "檑鳒폴皯", ViewConfiguration.getScrollDefaultDelay() >> 16, objArr2);
                                f.c(strA2, ((String) objArr2[0]).intern());
                            }
                            Boolean boolH = Boolean.FALSE;
                            Iterator<o.es.e> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                o.es.e next = it.next();
                                Object[] objArr3 = {e.this};
                                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                                int i10 = (-637792661) * e.f25616i;
                                e.f25616i = i10;
                                int i11 = e.f25617j * 514205254;
                                e.f25617j = i11;
                                int i12 = e.f25615h * 410979428;
                                e.f25615h = i12;
                                if (((o.ep.d) e.e(i10, -1583053525, i11, iUptimeMillis, i12, objArr3, 1583053526)).s() != null) {
                                    int i13 = f25681h + 27;
                                    f25680g = i13 % 128;
                                    int i14 = i13 % 2;
                                    String strD = next.d();
                                    Object[] objArr4 = {e.b(e.this).s()};
                                    int i15 = 574268897 * o.ep.c.f24438e;
                                    o.ep.c.f24438e = i15;
                                    int id = (int) Thread.currentThread().getId();
                                    int i16 = o.ep.c.f24436c * 1169734117;
                                    o.ep.c.f24436c = i16;
                                    int i17 = (-2104816085) * o.ep.c.f24434a;
                                    o.ep.c.f24434a = i17;
                                    if (strD.equals((String) o.ep.c.c(i15, id, i17, 1241915024, objArr4, -1241915024, i16))) {
                                        if (f.a()) {
                                            String strA3 = e.this.a();
                                            StringBuilder sb = new StringBuilder();
                                            Object[] objArr5 = new Object[1];
                                            m((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "ܛ甋⍛䉻\ue0b6쿞ሎ⚵큾嫰籈ㅡ䆭㪊篻납뫱Ќ㐓廧뫹\uec71\ue215\ue29f볗ʏ\ufae2곯൱麹龌䙔腼褩⺙퍃熰벪㛛ư鍹䇬㎨벁䚎蜮\udc2ci", "㙑ژ\ude72囔", "犱\ue994\ua638\udb3d", (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), objArr5);
                                            StringBuilder sbAppend = sb.append(((String) objArr5[0]).intern()).append(((o.ep.d) e.e((int) Process.getElapsedCpuTime(), 436457421, (int) SystemClock.elapsedRealtime(), new Random().nextInt(), (int) Thread.currentThread().getId(), new Object[]{e.this}, -436457419)).b());
                                            Object[] objArr6 = new Object[1];
                                            m((char) (63756 - TextUtils.indexOf((CharSequence) "", '0')), "绢⯲ሤꤷ牼ᬵ璓歑\u2fee跙㎝靏폵䍙ၘ鞣⹎㍆챙", "㙑ژ\ude72囔", "敉価\u0dc7۹", TextUtils.getCapsMode("", 0, 0) - 951082651, objArr6);
                                            f.c(strA3, sbAppend.append(((String) objArr6[0]).intern()).toString());
                                        }
                                        boolH = next.h();
                                    }
                                }
                                int i18 = f25680g + 57;
                                f25681h = i18 % 128;
                                int i19 = i18 % 2;
                            }
                            operationCallback.onSuccess(boolH);
                        }

                        /* JADX WARN: Can't wrap try/catch for region: R(9:(4:87|30|(2:32|34)(1:33)|35)|(4:37|95|38|(9:40|41|42|91|49|(5:51|93|52|53|58)(1:57)|(5:90|60|(2:62|69)(4:63|88|64|65)|70|(2:75|76))|72|73)(1:43))(1:47)|48|91|49|(0)(0)|(0)|72|73) */
                        /* JADX WARN: Removed duplicated region for block: B:51:0x04b4 A[Catch: Exception -> 0x04f5, TRY_LEAVE, TryCatch #4 {Exception -> 0x04f5, blocks: (B:49:0x047f, B:51:0x04b4, B:53:0x04e6, B:55:0x04ee, B:56:0x04f4, B:52:0x04be), top: B:91:0x047f, inners: #6 }] */
                        /* JADX WARN: Removed duplicated region for block: B:57:0x04f5  */
                        /* JADX WARN: Removed duplicated region for block: B:90:0x0502 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public static java.lang.Object[] d(int r23, int r24) throws java.lang.Throwable {
                            /*
                                Method dump skipped, instruction units count: 1694
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: o.ey.e.AnonymousClass5.AnonymousClass2.d(int, int):java.lang.Object[]");
                        }

                        static void init$0() {
                            $$a = new byte[]{Utf8.REPLACEMENT_BYTE, -81, -107, -8};
                            $$b = 191;
                        }

                        static void init$1() {
                            $$c = new byte[]{98, -110, MessagePack.Code.BIN16, -94};
                            $$d = 180;
                        }

                        private static void m(char c2, String str, String str2, String str3, int i9, Object[] objArr2) throws Throwable {
                            String str4 = str2;
                            String str5 = str;
                            String str6 = str3;
                            int i10 = 2 % 2;
                            int i11 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                            Object obj = str6;
                            if (str6 != null) {
                                char[] charArray = str6.toCharArray();
                                int i13 = $10 + 57;
                                $11 = i13 % 128;
                                obj = charArray;
                                if (i13 % 2 == 0) {
                                    int i14 = 2 / 4;
                                    obj = charArray;
                                }
                            }
                            char[] cArr = (char[]) obj;
                            Object charArray2 = str4;
                            if (str4 != null) {
                                charArray2 = str4.toCharArray();
                            }
                            char[] cArr2 = (char[]) charArray2;
                            Object charArray3 = str5;
                            if (str5 != null) {
                                charArray3 = str5.toCharArray();
                            }
                            i iVar = new i();
                            int length = cArr.length;
                            char[] cArr3 = new char[length];
                            int length2 = cArr2.length;
                            char[] cArr4 = new char[length2];
                            System.arraycopy(cArr, 0, cArr3, 0, length);
                            System.arraycopy(cArr2, 0, cArr4, 0, length2);
                            cArr3[0] = (char) (cArr3[0] ^ c2);
                            cArr4[2] = (char) (cArr4[2] + ((char) i9));
                            int length3 = ((char[]) charArray3).length;
                            char[] cArr5 = new char[length3];
                            iVar.f19932b = 0;
                            while (iVar.f19932b < length3) {
                                try {
                                    Object[] objArr3 = {iVar};
                                    Object objA = o.d.d.a(540069882);
                                    if (objA == null) {
                                        byte b2 = (byte) 0;
                                        byte b3 = b2;
                                        objA = o.d.d.a(ImageFormat.getBitsPerPixel(0) + 107, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf((CharSequence) "", '0', 0) + 12, -155898465, false, $$e(b2, b3, b3), new Class[]{Object.class});
                                    }
                                    int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr3)).intValue();
                                    Object[] objArr4 = {iVar};
                                    Object objA2 = o.d.d.a(2068572);
                                    if (objA2 == null) {
                                        byte b4 = (byte) 3;
                                        byte b5 = (byte) (b4 - 3);
                                        objA2 = o.d.d.a(847 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (6488 - Color.alpha(0)), 12 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -694521287, false, $$e(b4, b5, b5), new Class[]{Object.class});
                                    }
                                    int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr4)).intValue();
                                    Object[] objArr5 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                                    Object objA3 = o.d.d.a(-1122996612);
                                    if (objA3 == null) {
                                        byte b6 = (byte) 1;
                                        byte b7 = (byte) (b6 - 1);
                                        objA3 = o.d.d.a(458 - KeyEvent.normalizeMetaState(0), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 10 - Process.getGidForName(""), 1804962841, false, $$e(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                                    }
                                    ((Method) objA3).invoke(null, objArr5);
                                    Object[] objArr6 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                                    Object objA4 = o.d.d.a(-1223178239);
                                    if (objA4 == null) {
                                        byte b8 = (byte) 0;
                                        objA4 = o.d.d.a(639 - TextUtils.getCapsMode("", 0, 0), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 65100), View.MeasureSpec.getSize(0) + 12, 1636969060, false, $$e((byte) 57, b8, b8), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr6)).charValue();
                                    cArr3[iIntValue2] = iVar.f19933e;
                                    cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r8[iVar.f19932b])) ^ (f25676c ^ 740602047300126166L)) ^ ((long) ((int) (((long) f25675a) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f25678e) ^ 740602047300126166L))));
                                    iVar.f19932b++;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            objArr2[0] = new String(cArr5);
                        }

                        private static void n(int[] iArr, int i9, Object[] objArr2) throws Throwable {
                            int i10 = 2;
                            int i11 = 2 % 2;
                            l lVar = new l();
                            char[] cArr = new char[4];
                            char[] cArr2 = new char[iArr.length * 2];
                            int[] iArr2 = f25677d;
                            long j2 = 0;
                            int i12 = 989264422;
                            int i13 = 0;
                            if (iArr2 != null) {
                                int length = iArr2.length;
                                int[] iArr3 = new int[length];
                                int i14 = 0;
                                while (i14 < length) {
                                    int i15 = $10 + 5;
                                    $11 = i15 % 128;
                                    if (i15 % i10 == 0) {
                                        try {
                                            Object[] objArr3 = {Integer.valueOf(iArr2[i14])};
                                            Object objA = o.d.d.a(i12);
                                            if (objA == null) {
                                                int i16 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 674;
                                                char c2 = (char) ((SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1)) - 1);
                                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i13, i13) + 13;
                                                byte b2 = (byte) i13;
                                                String str$$e = $$e((byte) 56, b2, b2);
                                                Class[] clsArr = new Class[1];
                                                clsArr[i13] = Integer.TYPE;
                                                objA = o.d.d.a(i16, c2, iIndexOf, -328001469, false, str$$e, clsArr);
                                            }
                                            iArr3[i14] = ((Integer) ((Method) objA).invoke(null, objArr3)).intValue();
                                            i14++;
                                            i10 = 2;
                                            j2 = 0;
                                            i12 = 989264422;
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause == null) {
                                                throw th;
                                            }
                                            throw cause;
                                        }
                                    } else {
                                        Object[] objArr4 = {Integer.valueOf(iArr2[i14])};
                                        Object objA2 = o.d.d.a(989264422);
                                        if (objA2 == null) {
                                            byte b3 = (byte) i13;
                                            objA2 = o.d.d.a((TypedValue.complexToFraction(i13, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i13, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 675, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Color.red(i13) + 12, -328001469, false, $$e((byte) 56, b3, b3), new Class[]{Integer.TYPE});
                                        }
                                        iArr3[i14] = ((Integer) ((Method) objA2).invoke(null, objArr4)).intValue();
                                        i14++;
                                        i10 = 2;
                                        j2 = 0;
                                        i12 = 989264422;
                                        i13 = 0;
                                    }
                                }
                                iArr2 = iArr3;
                            }
                            int length2 = iArr2.length;
                            int[] iArr4 = new int[length2];
                            int[] iArr5 = f25677d;
                            if (iArr5 != null) {
                                int length3 = iArr5.length;
                                int[] iArr6 = new int[length3];
                                for (int i17 = 0; i17 < length3; i17++) {
                                    int i18 = $11 + 1;
                                    $10 = i18 % 128;
                                    int i19 = i18 % 2;
                                    Object[] objArr5 = {Integer.valueOf(iArr5[i17])};
                                    Object objA3 = o.d.d.a(989264422);
                                    if (objA3 == null) {
                                        byte b4 = (byte) 0;
                                        objA3 = o.d.d.a(675 - ExpandableListView.getPackedPositionType(0L), (char) ((Process.getThreadPriority(0) + 20) >> 6), 12 - (ViewConfiguration.getLongPressTimeout() >> 16), -328001469, false, $$e((byte) 56, b4, b4), new Class[]{Integer.TYPE});
                                    }
                                    iArr6[i17] = ((Integer) ((Method) objA3).invoke(null, objArr5)).intValue();
                                }
                                iArr5 = iArr6;
                            }
                            System.arraycopy(iArr5, 0, iArr4, 0, length2);
                            lVar.f19941d = 0;
                            int i20 = $10 + 103;
                            $11 = i20 % 128;
                            int i21 = i20 % 2;
                            while (lVar.f19941d < iArr.length) {
                                int i22 = $11 + 69;
                                $10 = i22 % 128;
                                int i23 = i22 % 2;
                                cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
                                cArr[1] = (char) iArr[lVar.f19941d];
                                cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                                cArr[3] = (char) iArr[lVar.f19941d + 1];
                                lVar.f19942e = (cArr[0] << 16) + cArr[1];
                                lVar.f19940a = (cArr[2] << 16) + cArr[3];
                                l.a(iArr4);
                                int i24 = 0;
                                for (int i25 = 16; i24 < i25; i25 = 16) {
                                    lVar.f19942e ^= iArr4[i24];
                                    Object[] objArr6 = {lVar, Integer.valueOf(l.e(lVar.f19942e)), lVar, lVar};
                                    Object objA4 = o.d.d.a(2098218801);
                                    if (objA4 == null) {
                                        byte b5 = (byte) 0;
                                        objA4 = o.d.d.a(View.MeasureSpec.getMode(0) + 301, (char) (MotionEvent.axisFromString("") + 52698), (ViewConfiguration.getEdgeSlop() >> 16) + 11, -1416256172, false, $$e((byte) 54, b5, b5), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                                    }
                                    int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr6)).intValue();
                                    lVar.f19942e = lVar.f19940a;
                                    lVar.f19940a = iIntValue;
                                    i24++;
                                }
                                int i26 = lVar.f19942e;
                                lVar.f19942e = lVar.f19940a;
                                lVar.f19940a = i26;
                                lVar.f19940a ^= iArr4[16];
                                lVar.f19942e ^= iArr4[17];
                                int i27 = lVar.f19942e;
                                int i28 = lVar.f19940a;
                                cArr[0] = (char) (lVar.f19942e >>> 16);
                                cArr[1] = (char) lVar.f19942e;
                                cArr[2] = (char) (lVar.f19940a >>> 16);
                                cArr[3] = (char) lVar.f19940a;
                                l.a(iArr4);
                                cArr2[lVar.f19941d * 2] = cArr[0];
                                cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                                cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                                cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
                                Object[] objArr7 = {lVar, lVar};
                                Object objA5 = o.d.d.a(986820978);
                                if (objA5 == null) {
                                    byte b6 = (byte) 0;
                                    objA5 = o.d.d.a(Color.rgb(0, 0, 0) + 16777445, (char) (51004 - ((Process.getThreadPriority(0) + 20) >> 6)), 9 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -330018025, false, $$e((byte) ($$d & 127), b6, b6), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objA5).invoke(null, objArr7);
                            }
                            objArr2[0] = new String(cArr2, 0, i9);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0015). Please report as a decompilation issue!!! */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        private static void o(int r9, short r10, short r11, java.lang.Object[] r12) {
                            /*
                                int r0 = r11 * 3
                                int r8 = 100 - r0
                                int r0 = r9 * 2
                                int r7 = 1 - r0
                                int r0 = r10 * 2
                                int r6 = 4 - r0
                                byte[] r5 = o.ey.e.AnonymousClass5.AnonymousClass2.$$a
                                byte[] r4 = new byte[r7]
                                r3 = 0
                                if (r5 != 0) goto L2b
                                r0 = r7
                                r2 = r3
                            L15:
                                int r8 = r8 + r0
                                int r6 = r6 + 1
                                r1 = r2
                            L19:
                                int r2 = r1 + 1
                                byte r0 = (byte) r8
                                r4[r1] = r0
                                if (r2 != r7) goto L28
                                java.lang.String r0 = new java.lang.String
                                r0.<init>(r4, r3)
                                r12[r3] = r0
                                return
                            L28:
                                r0 = r5[r6]
                                goto L15
                            L2b:
                                r1 = r3
                                goto L19
                            */
                            throw new UnsupportedOperationException("Method not decompiled: o.ey.e.AnonymousClass5.AnonymousClass2.o(int, short, short, java.lang.Object[]):void");
                        }

                        @Override // o.es.c.a
                        public final /* synthetic */ void a(List<o.es.e> list) throws Throwable {
                            int i9 = 2 % 2;
                            int i10 = f25681h + 89;
                            f25680g = i10 % 128;
                            int i11 = i10 % 2;
                            c(list);
                            if (i11 != 0) {
                                throw null;
                            }
                        }

                        @Override // o.es.c.a
                        public final void d(o.by.c cVar) throws Throwable {
                            int i9 = 2 % 2;
                            int i10 = f25681h + 25;
                            f25680g = i10 % 128;
                            int i11 = i10 % 2;
                            if (f.a()) {
                                String strA2 = e.this.a();
                                StringBuilder sb = new StringBuilder();
                                Object[] objArr2 = new Object[1];
                                n(new int[]{867729610, 1549106724, 187257184, -651331343, 285819343, 29745438, -1129244241, -1158577385, -1442607272, 548533109, -1404969002, 492411728, 1861996241, 512287023, -1622936143, -118901869, 481412390, -923336856, -416261621, -1811411374, -1009112754, -257979302, -1083976330, -65531671, 1153524492, -1487605224, 1455838350, -764358043, 1529826331, -458365772, -1199265899, -1973699539, -1379345333, -1771255162}, 66 - Color.blue(0), objArr2);
                                f.d(strA2, sb.append(((String) objArr2[0]).intern()).append(cVar.c()).toString());
                                int i12 = f25681h + 83;
                                f25680g = i12 % 128;
                                int i13 = i12 % 2;
                            }
                            operationCallback.onError(cVar.a());
                        }
                    });
                    return;
                }
                if (f.a()) {
                    String strA2 = e.this.a();
                    Object[] objArr2 = new Object[1];
                    f(new int[]{1244732658, 166605891, -1365993639, -1165103736, -1129351108, 1307380855, 297580305, 1360074687, 1476715075, -867009156, 71729915, 998771500, -1229903002, -1240673815, 1742369522, -1315454383, -555166284, -1317141891, 625820078, 278783583, -1674733972, -688663642, 1798208067, -378923249}, 47 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
                    f.c(strA2, ((String) objArr2[0]).intern());
                }
                operationCallback.onSuccess(Boolean.FALSE);
                int i9 = f25671i + 107;
                f25669a = i9 % 128;
                if (i9 % 2 != 0) {
                    throw null;
                }
            }

            private static void f(int[] iArr, int i7, Object[] objArr2) throws Throwable {
                int i8 = 2 % 2;
                l lVar = new l();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = f25670d;
                int i9 = 989264422;
                long j2 = 0;
                int i10 = 0;
                if (iArr2 != null) {
                    int i11 = $10 + 95;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i13 = 0;
                    while (i13 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(iArr2[i13])};
                            Object objA = o.d.d.a(i9);
                            if (objA == null) {
                                byte b2 = (byte) i10;
                                byte b3 = b2;
                                objA = o.d.d.a((ViewConfiguration.getJumpTapTimeout() >> 16) + 675, (char) ((-1) - ExpandableListView.getPackedPositionChild(j2)), 12 - TextUtils.indexOf("", "", i10, i10), -328001469, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            iArr3[i13] = ((Integer) ((Method) objA).invoke(null, objArr3)).intValue();
                            i13++;
                            i9 = 989264422;
                            j2 = 0;
                            i10 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = f25670d;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    for (int i14 = 0; i14 < length3; i14++) {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i14])};
                        Object objA2 = o.d.d.a(989264422);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA2 = o.d.d.a(ImageFormat.getBitsPerPixel(0) + 676, (char) TextUtils.indexOf("", "", 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11, -328001469, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        iArr6[i14] = ((Integer) ((Method) objA2).invoke(null, objArr4)).intValue();
                    }
                    iArr5 = iArr6;
                }
                System.arraycopy(iArr5, 0, iArr4, 0, length2);
                lVar.f19941d = 0;
                int i15 = $10 + 107;
                $11 = i15 % 128;
                int i16 = 3;
                if (i15 % 2 == 0) {
                    int i17 = 4 / 3;
                }
                while (lVar.f19941d < iArr.length) {
                    int i18 = $11 + 123;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                    cArr[0] = (char) (iArr[lVar.f19941d] >> 16);
                    cArr[1] = (char) iArr[lVar.f19941d];
                    cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                    cArr[i16] = (char) iArr[lVar.f19941d + 1];
                    lVar.f19942e = (cArr[0] << 16) + cArr[1];
                    lVar.f19940a = (cArr[2] << 16) + cArr[i16];
                    l.a(iArr4);
                    int i20 = 0;
                    for (int i21 = 16; i20 < i21; i21 = 16) {
                        lVar.f19942e ^= iArr4[i20];
                        int iE = l.e(lVar.f19942e);
                        Object[] objArr5 = new Object[4];
                        objArr5[i16] = lVar;
                        objArr5[2] = lVar;
                        objArr5[1] = Integer.valueOf(iE);
                        objArr5[0] = lVar;
                        Object objA3 = o.d.d.a(2098218801);
                        if (objA3 == null) {
                            int gidForName = Process.getGidForName("") + 302;
                            char c2 = (char) (52698 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                            int i22 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10;
                            byte b6 = (byte) 1;
                            byte b7 = (byte) (b6 - 1);
                            String str$$c = $$c(b6, b7, b7);
                            Class[] clsArr = new Class[4];
                            clsArr[0] = Object.class;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Object.class;
                            clsArr[i16] = Object.class;
                            objA3 = o.d.d.a(gidForName, c2, i22, -1416256172, false, str$$c, clsArr);
                        }
                        int iIntValue = ((Integer) ((Method) objA3).invoke(null, objArr5)).intValue();
                        lVar.f19942e = lVar.f19940a;
                        lVar.f19940a = iIntValue;
                        i20++;
                    }
                    int i23 = lVar.f19942e;
                    lVar.f19942e = lVar.f19940a;
                    lVar.f19940a = i23;
                    lVar.f19940a ^= iArr4[16];
                    lVar.f19942e ^= iArr4[17];
                    int i24 = lVar.f19942e;
                    int i25 = lVar.f19940a;
                    cArr[0] = (char) (lVar.f19942e >>> 16);
                    cArr[1] = (char) lVar.f19942e;
                    cArr[2] = (char) (lVar.f19940a >>> 16);
                    cArr[i16] = (char) lVar.f19940a;
                    l.a(iArr4);
                    cArr2[lVar.f19941d * 2] = cArr[0];
                    cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                    cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                    cArr2[(lVar.f19941d * 2) + i16] = cArr[i16];
                    Object[] objArr6 = {lVar, lVar};
                    Object objA4 = o.d.d.a(986820978);
                    if (objA4 == null) {
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 229;
                        char cIndexOf = (char) (51003 - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 9;
                        int i26 = $$b;
                        byte b8 = (byte) ((i26 + 15) - (i26 | 15));
                        byte b9 = (byte) (b8 - 2);
                        objA4 = o.d.d.a(jumpTapTimeout, cIndexOf, scrollDefaultDelay, -330018025, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr6);
                    i16 = 3;
                }
                objArr2[0] = new String(cArr2, 0, i7);
            }

            static void init$0() {
                $$a = new byte[]{68, -108, -67, 58};
                $$b = 242;
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public final void onError(AntelopError antelopError) {
                int i7 = 2 % 2;
                int i8 = f25669a + 9;
                f25671i = i8 % 128;
                if (i8 % 2 != 0) {
                    operationCallback.onError(antelopError);
                    return;
                }
                operationCallback.onError(antelopError);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public final /* synthetic */ void onSuccess(Boolean bool) throws Throwable {
                int i7 = 2 % 2;
                int i8 = f25671i + 3;
                f25669a = i8 % 128;
                int i9 = i8 % 2;
                c(bool);
                int i10 = f25669a + 3;
                f25671i = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 44 / 0;
                }
            }
        });
    }

    public final AndroidActivityResultCallback b(final Activity activity, final OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f25623q + 59;
            f25625s = i3 % 128;
            int i4 = i3 % 2;
            String strA = a();
            Object[] objArr = new Object[1];
            A((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 181 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 10, objArr);
            f.c(strA, ((String) objArr[0]).intern());
            int i5 = f25625s + 71;
            f25623q = i5 % 128;
            int i6 = i5 % 2;
        }
        j jVar = new j();
        jVar.e(54, new j.e() { // from class: o.ey.e$$ExternalSyntheticLambda0
            @Override // o.ea.j.e
            public final void onActivityResult(int i7, Intent intent) {
                e.b(operationCallback, i7, intent);
            }
        });
        a((Context) activity).c(new c.a<List<o.es.e>>() { // from class: o.ey.e.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static long f25629a = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f25630d = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static char f25631f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static int f25632g = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static int f25633h = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f25634i = 0;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static int f25635j = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0013). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$e(byte r5, short r6, byte r7) {
                /*
                    int r0 = r7 + 4
                    int r7 = r6 + 65
                    byte[] r6 = o.ey.e.AnonymousClass1.$$c
                    int r2 = r5 * 3
                    int r1 = 1 - r2
                    byte[] r5 = new byte[r1]
                    r4 = 0
                    int r3 = 0 - r2
                    if (r6 != 0) goto L28
                    r2 = r0
                    r1 = r4
                L13:
                    int r0 = -r0
                    int r7 = r7 + r0
                    r0 = r2
                L16:
                    byte r2 = (byte) r7
                    r5[r1] = r2
                    int r2 = r0 + 1
                    if (r1 != r3) goto L23
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    return r0
                L23:
                    int r1 = r1 + 1
                    r0 = r6[r2]
                    goto L13
                L28:
                    r1 = r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ey.e.AnonymousClass1.$$e(byte, short, byte):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                f25635j = 877409192;
                f25633h = -1415560132;
                init$0();
                f25632g = 0;
                f25634i = 1;
                f25629a = 740602047300126166L;
                f25630d = 1906353606;
                f25631f = (char) 17878;
            }

            private void b(List<o.es.e> list) throws Throwable {
                int i7 = 2 % 2;
                int i8 = f25632g + 121;
                f25634i = i8 % 128;
                Object obj = null;
                if (i8 % 2 == 0) {
                    f.a();
                    throw null;
                }
                if (f.a()) {
                    String strA2 = e.this.a();
                    Object[] objArr2 = new Object[1];
                    k((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), "\ue348ᬝ✠撠徝镙깩Ⓧ穚\udfe5쿏딡瞒教䪿♆误✳頨榎㮶遣", "\u0000\u0000\u0000\u0000", "沊䧾맕鑢", Drawable.resolveOpacity(0, 0), objArr2);
                    f.c(strA2, ((String) objArr2[0]).intern());
                }
                o.es.e eVar = null;
                for (o.es.e eVar2 : list) {
                    int i9 = f25632g + 29;
                    f25634i = i9 % 128;
                    int i10 = i9 % 2;
                    if (((o.ep.d) e.e((int) Process.getElapsedCpuTime(), 1016123376, new Random().nextInt(), (int) Runtime.getRuntime().maxMemory(), (int) SystemClock.uptimeMillis(), new Object[]{e.this}, -1016123372)).s() != null) {
                        String strD = eVar2.d();
                        Object[] objArr3 = {e.h(e.this).s()};
                        int i11 = 574268897 * o.ep.c.f24438e;
                        o.ep.c.f24438e = i11;
                        int id = (int) Thread.currentThread().getId();
                        int i12 = o.ep.c.f24436c * 1169734117;
                        o.ep.c.f24436c = i12;
                        int i13 = (-2104816085) * o.ep.c.f24434a;
                        o.ep.c.f24434a = i13;
                        if (strD.equals((String) o.ep.c.c(i11, id, i13, 1241915024, objArr3, -1241915024, i12))) {
                            int i14 = f25634i + 67;
                            f25632g = i14 % 128;
                            int i15 = i14 % 2;
                            eVar = eVar2;
                        }
                    }
                }
                if (eVar != null) {
                    e.this.a((Context) activity).d(activity, eVar);
                    return;
                }
                operationCallback.onError(new AntelopError(new o.by.c(AntelopErrorCode.CardDeleted)));
                int i16 = f25632g + 71;
                f25634i = i16 % 128;
                if (i16 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:41:0x0347  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x03eb A[Catch: all -> 0x043e, TryCatch #4 {all -> 0x043e, blocks: (B:56:0x03de, B:58:0x03eb, B:59:0x0424), top: B:109:0x03de, outer: #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0482 A[Catch: all -> 0x04f2, TryCatch #0 {all -> 0x04f2, blocks: (B:67:0x0475, B:69:0x0482, B:70:0x04bb), top: B:102:0x0475, outer: #2 }] */
            /* JADX WARN: Removed duplicated region for block: B:77:0x04fb  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x05ce  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x05d1  */
            /* JADX WARN: Removed duplicated region for block: B:85:0x05d4  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0660  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x0663  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.Object[] d(android.content.Context r28, int r29, int r30, int r31) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1759
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ey.e.AnonymousClass1.d(android.content.Context, int, int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{Ascii.NAK, 117, 119, 110};
                $$b = 55;
            }

            static void init$1() {
                $$c = new byte[]{88, MessagePack.Code.INT64, 78, Ascii.GS};
                $$d = 174;
            }

            private static void k(char c2, String str, String str2, String str3, int i7, Object[] objArr2) throws Throwable {
                String str4 = str;
                String str5 = str2;
                String str6 = str3;
                int i8 = 2 % 2;
                int i9 = $11;
                int i10 = i9 + 81;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                Object charArray = str6;
                if (str6 != null) {
                    int i12 = i9 + 103;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 51 / 0;
                        charArray = str6.toCharArray();
                    } else {
                        charArray = str6.toCharArray();
                    }
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
                i iVar = new i();
                int length = cArr.length;
                char[] cArr3 = new char[length];
                int length2 = cArr2.length;
                char[] cArr4 = new char[length2];
                System.arraycopy(cArr, 0, cArr3, 0, length);
                System.arraycopy(cArr2, 0, cArr4, 0, length2);
                cArr3[0] = (char) (cArr3[0] ^ c2);
                cArr4[2] = (char) (cArr4[2] + ((char) i7));
                int length3 = ((char[]) charArray3).length;
                char[] cArr5 = new char[length3];
                iVar.f19932b = 0;
                while (iVar.f19932b < length3) {
                    try {
                        Object[] objArr3 = {iVar};
                        Object objA = o.d.d.a(540069882);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objA = o.d.d.a(107 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarSize() >> 8), Color.alpha(0) + 11, -155898465, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr3)).intValue();
                        Object[] objArr4 = {iVar};
                        Object objA2 = o.d.d.a(2068572);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 3);
                            objA2 = o.d.d.a(847 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (6488 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 12 - TextUtils.getOffsetAfter("", 0), -694521287, false, $$e(b4, b5, (byte) (b5 - 4)), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objA2).invoke(null, objArr4)).intValue();
                        Object[] objArr5 = {iVar, Integer.valueOf(cArr3[iVar.f19932b % 4] * 32718), Integer.valueOf(cArr4[iIntValue])};
                        Object objA3 = o.d.d.a(-1122996612);
                        if (objA3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 1);
                            objA3 = o.d.d.a(TextUtils.indexOf("", "", 0) + 458, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), Gravity.getAbsoluteGravity(0, 0) + 11, 1804962841, false, $$e(b6, b7, (byte) (-b7)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objA3).invoke(null, objArr5);
                        Object[] objArr6 = {Integer.valueOf(cArr3[iIntValue2] * 32718), Integer.valueOf(cArr4[iIntValue])};
                        Object objA4 = o.d.d.a(-1223178239);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            objA4 = o.d.d.a(Color.blue(0) + 639, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 65100), 12 - ExpandableListView.getPackedPositionType(0L), 1636969060, false, $$e(b8, (byte) ((-1) - (((-1) - b8) & ((-1) - 57))), (byte) (-1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[iIntValue2] = ((Character) ((Method) objA4).invoke(null, objArr6)).charValue();
                        cArr3[iIntValue2] = iVar.f19933e;
                        cArr5[iVar.f19932b] = (char) (((((long) (cArr3[iIntValue2] ^ r8[iVar.f19932b])) ^ (f25629a ^ 740602047300126166L)) ^ ((long) ((int) (((long) f25630d) ^ 740602047300126166L)))) ^ ((long) ((char) (((long) f25631f) ^ 740602047300126166L))));
                        iVar.f19932b++;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr2[0] = new String(cArr5);
            }

            private static void l(int i7, short s2, int i8, Object[] objArr2) {
                int i9 = s2 * 4;
                int i10 = 4 - (i7 * 3);
                int i11 = 101 - i8;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[1 - i9];
                int i12 = 0 - i9;
                int i13 = -1;
                if (bArr == null) {
                    i11 = i10 + i11;
                    i10++;
                }
                while (true) {
                    i13++;
                    bArr2[i13] = (byte) i11;
                    if (i13 == i12) {
                        objArr2[0] = new String(bArr2, 0);
                        return;
                    }
                    int i14 = i10;
                    i11 = bArr[i10] + i11;
                    i10 = i14 + 1;
                }
            }

            @Override // o.es.c.a
            public final /* synthetic */ void a(List<o.es.e> list) throws Throwable {
                int i7 = 2 % 2;
                int i8 = f25634i + 123;
                f25632g = i8 % 128;
                int i9 = i8 % 2;
                b(list);
                int i10 = f25632g + 93;
                f25634i = i10 % 128;
                int i11 = i10 % 2;
            }

            @Override // o.es.c.a
            public final void d(o.by.c cVar) throws Throwable {
                String strA2;
                Object obj;
                int i7 = 2 % 2;
                if (f.a()) {
                    int i8 = f25632g + 105;
                    f25634i = i8 % 128;
                    if (i8 % 2 == 0) {
                        strA2 = e.this.a();
                        Object[] objArr2 = new Object[1];
                        k((char) ((-1) >> TextUtils.lastIndexOf("", 'i')), "툕矒愹ඤ딮穀⿍⋘씿\ue52b줙丙㝿絎뛨ዎ醺䴎ԭ잂", "\u0000\u0000\u0000\u0000", "◅坜傄\uf865", TextUtils.indexOf("", ""), objArr2);
                        obj = objArr2[0];
                    } else {
                        strA2 = e.this.a();
                        Object[] objArr3 = new Object[1];
                        k((char) ((-1) - TextUtils.lastIndexOf("", '0')), "툕矒愹ඤ딮穀⿍⋘씿\ue52b줙丙㝿絎뛨ዎ醺䴎ԭ잂", "\u0000\u0000\u0000\u0000", "◅坜傄\uf865", TextUtils.indexOf("", ""), objArr3);
                        obj = objArr3[0];
                    }
                    f.c(strA2, ((String) obj).intern());
                }
                operationCallback.onError(cVar.a());
                int i9 = f25632g + 63;
                f25634i = i9 % 128;
                int i10 = i9 % 2;
            }
        });
        return jVar.b();
    }

    @Override // o.er.d
    public final String b() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f25623q + 65;
        f25625s = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            A((char) View.getDefaultSize(0, 0), (-1) >> (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 69 << Gravity.getAbsoluteGravity(0, 0), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            A((char) View.getDefaultSize(0, 0), (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 16 - Gravity.getAbsoluteGravity(0, 0), objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i4 = f25623q + 17;
        f25625s = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    @Override // o.er.d
    public final /* synthetic */ o.es.c b(Context context) {
        int i2 = 2 % 2;
        int i3 = f25623q + 83;
        f25625s = i3 % 128;
        if (i3 % 2 == 0) {
            a(context);
            throw null;
        }
        o.es.a aVarA = a(context);
        int i4 = f25623q + 71;
        f25625s = i4 % 128;
        int i5 = i4 % 2;
        return aVarA;
    }

    public final AndroidActivityResultCallback c(Activity activity, final OperationCallback<Void> operationCallback, Address address) throws Throwable {
        String strA;
        Object obj;
        int i2 = 2 % 2;
        if (f.a()) {
            int i3 = f25625s + 29;
            f25623q = i3 % 128;
            if (i3 % 2 != 0) {
                strA = a();
                Object[] objArr = new Object[1];
                A((char) (24784 % Gravity.getAbsoluteGravity(0, 0)), 6641 / (ViewConfiguration.getPressedStateDuration() - 121), ExpandableListView.getPackedPositionGroup(0L) * 13, objArr);
                obj = objArr[0];
            } else {
                strA = a();
                Object[] objArr2 = new Object[1];
                A((char) (335 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 157, ExpandableListView.getPackedPositionGroup(0L) + 8, objArr2);
                obj = objArr2[0];
            }
            f.c(strA, ((String) obj).intern());
        }
        SecureCardPushToGooglePay secureCardPushToGooglePayG = g();
        if (address != null) {
            int i4 = f25623q + 5;
            f25625s = i4 % 128;
            int i5 = i4 % 2;
            secureCardPushToGooglePayG.setUserAddress(address);
        }
        AndroidActivityResultCallback androidActivityResultCallbackLaunch = secureCardPushToGooglePayG.launch(activity, new CustomCustomerAuthenticatedProcessCallback() { // from class: o.ey.e.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static int f25639a = -1162342392;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static int f25640b = 240208650;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static int f25641c = 314289528;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static int f25642d = 1506106805;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static int f25643e = -75313157;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static int f25644f = 775070389;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static int f25645g = -1295241464;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static int f25646h = -513675814;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public static int f25647j = -310633639;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private static int f25648l = 1;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private static int f25649o = 0;

            private static /* synthetic */ Object b(Object[] objArr3) {
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) objArr3[0];
                int i6 = 2 % 2;
                int i7 = f25649o;
                int i8 = ((77 | i7) << 1) - (i7 ^ 77);
                f25648l = i8 % 128;
                Object obj2 = null;
                if (i8 % 2 == 0) {
                    operationCallback.onSuccess(null);
                    obj2.hashCode();
                    throw null;
                }
                operationCallback.onSuccess(null);
                int i9 = f25648l + 103;
                f25649o = i9 % 128;
                if (i9 % 2 == 0) {
                    return null;
                }
                obj2.hashCode();
                throw null;
            }

            public static /* synthetic */ Object d(int i6, int i7, int i8, Object[] objArr3, int i9, int i10, int i11) {
                int i12 = ~i7;
                int i13 = ~((-1) - (((-1) - i12) & ((-1) - i11)));
                int i14 = ~((i7 + i11) - (i7 & i11));
                int i15 = i12 | (~i11);
                int i16 = ~((i15 + i8) - (i15 & i8));
                int i17 = (i14 + i16) - (i14 & i16);
                int i18 = (~i8) | i15;
                int i19 = i7 + i11 + i6 + (770105990 * i10) + ((-157043368) * i9);
                int i20 = i19 * i19;
                int i21 = ((315592168 * i7) - 1432092672) + ((-1000312294) * i11) + ((-1315904462) * i13) + ((-657952231) * i17) + (657952231 * i18) + ((-342360064) * i6) + ((-2121269248) * i10) + (1950351360 * i9) + ((-66846720) * i20);
                int i22 = (i7 * 105828664) + 1394048361 + (i11 * 105827886) + (i13 * (-778)) + (i17 * (-389)) + (i18 * 389) + (i6 * 105828275) + (i10 * (-227623502)) + (i9 * 619312264) + (i20 * 1925971968);
                int i23 = i21 + (i22 * i22 * 261881856);
                if (i23 == 1) {
                    return d(objArr3);
                }
                if (i23 == 2) {
                    return b(objArr3);
                }
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) objArr3[0];
                int i24 = 2 % 2;
                operationCallback.onError(new o.by.c(AntelopErrorCode.CustomerAuthenticationImpossible).a());
                f25640b *= 619254113;
                f25643e *= 991180071;
                return null;
            }

            private static /* synthetic */ Object d(Object[] objArr3) {
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) objArr3[0];
                AntelopError antelopError = (AntelopError) objArr3[1];
                int i6 = 2 % 2;
                int i7 = f25649o;
                int i8 = ((i7 + 75) - (75 | i7)) + ((i7 + 75) - (i7 & 75));
                f25648l = i8 % 128;
                Object obj2 = null;
                if (i8 % 2 != 0) {
                    operationCallback.onError(antelopError);
                    return null;
                }
                operationCallback.onError(antelopError);
                obj2.hashCode();
                throw null;
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onAuthenticationDeclined(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i6 = 2 % 2;
                int i7 = f25649o;
                int i8 = ((-1) - (((-1) - i7) | ((-1) - 41))) + ((i7 + 41) - (i7 & 41));
                f25648l = i8 % 128;
                int i9 = i8 % 2;
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onCustomerCredentialsInvalid(LocalAuthenticationErrorReason localAuthenticationErrorReason, CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i6 = 2 % 2;
                int i7 = f25649o + 39;
                f25648l = i7 % 128;
                if (i7 % 2 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onCustomerCredentialsRequired(List<CustomerAuthenticationMethod> list, CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i6 = f25642d * (-797379937);
                f25642d = i6;
                int i7 = f25639a * 1981214463;
                f25639a = i7;
                int i8 = f25641c * (-1735234858);
                f25641c = i8;
                int i9 = f25645g * 1929336139;
                f25645g = i9;
                d(i7, -210870087, i6, new Object[]{this, list, customerAuthenticatedProcess}, i9, i8, 210870087);
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onError(AntelopError antelopError, CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int iActiveCount = Thread.activeCount();
                int priority = Thread.currentThread().getPriority();
                int iMyUid = Process.myUid();
                int i6 = f25644f * (-1584642481);
                f25644f = i6;
                d(priority, -957102239, iActiveCount, new Object[]{this, antelopError, customerAuthenticatedProcess}, i6, iMyUid, 957102240);
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onProcessStart(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i6 = 2 % 2;
                int i7 = f25648l + 81;
                f25649o = i7 % 128;
                if (i7 % 2 == 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override // fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback
            public final void onProcessSuccess(CustomerAuthenticatedProcess customerAuthenticatedProcess) {
                int i6 = f25647j * 1893765763;
                f25647j = i6;
                int iNextInt = new Random().nextInt(1993099882);
                int iActiveCount = Thread.activeCount();
                int i7 = f25646h * (-1873598553);
                f25646h = i7;
                d(iNextInt, 720653597, i6, new Object[]{this, customerAuthenticatedProcess}, i7, iActiveCount, -720653595);
            }
        });
        int i6 = f25625s + 81;
        f25623q = i6 % 128;
        if (i6 % 2 == 0) {
            return androidActivityResultCallbackLaunch;
        }
        throw null;
    }

    public final AndroidActivityResultCallback d(Activity activity, OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25623q + 71;
        f25625s = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        AndroidActivityResultCallback androidActivityResultCallbackC = c(activity, operationCallback, (Address) null);
        int i5 = f25623q + 117;
        f25625s = i5 % 128;
        if (i5 % 2 != 0) {
            return androidActivityResultCallbackC;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.er.d
    public final i.c d() {
        int i2 = 2 % 2;
        int i3 = f25625s + 9;
        f25623q = i3 % 128;
        int i4 = i3 % 2;
        i.c cVar = i.c.f24665b;
        int i5 = f25623q + 45;
        f25625s = i5 % 128;
        int i6 = i5 % 2;
        return cVar;
    }

    public final void d(Activity activity) throws Throwable {
        int i2 = f25619m * (-1956041236);
        f25619m = i2;
        int priority = Thread.currentThread().getPriority();
        int i3 = f25620n * 1875359101;
        f25620n = i3;
        int i4 = f25621o * (-938990395);
        f25621o = i4;
        e(priority, 62877414, i3, i2, i4, new Object[]{this, activity}, -62877411);
    }

    @Override // o.er.d
    public final AntelopErrorCode e() {
        int i2 = 2 % 2;
        int i3 = f25623q + 47;
        f25625s = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            AntelopErrorCode antelopErrorCode = AntelopErrorCode.GooglePayWalletNotAvailable;
            obj.hashCode();
            throw null;
        }
        AntelopErrorCode antelopErrorCode2 = AntelopErrorCode.GooglePayWalletNotAvailable;
        int i4 = f25623q + 53;
        f25625s = i4 % 128;
        if (i4 % 2 != 0) {
            return antelopErrorCode2;
        }
        obj.hashCode();
        throw null;
    }

    public final AndroidActivityResultCallback e(final Activity activity, final OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25625s + 21;
        f25623q = i3 % 128;
        if (i3 % 2 != 0) {
            f.a();
            throw null;
        }
        if (f.a()) {
            int i4 = f25623q + 109;
            f25625s = i4 % 128;
            int i5 = i4 % 2;
            String strA = a();
            Object[] objArr = new Object[1];
            A((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 166, Color.argb(0, 0, 0, 0) + 16, objArr);
            f.c(strA, ((String) objArr[0]).intern());
            int i6 = f25625s + 45;
            f25623q = i6 % 128;
            int i7 = i6 % 2;
        }
        j jVar = new j();
        jVar.e(53, new j.e() { // from class: o.ey.e$$ExternalSyntheticLambda1
            @Override // o.ea.j.e
            public final void onActivityResult(int i8, Intent intent) {
                e.c(operationCallback, i8, intent);
            }
        });
        a((Context) activity).c(new c.a<List<o.es.e>>() { // from class: o.ey.e.3
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static final int $$f = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static char[] f25652a = null;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static long f25653e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static int f25654f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static int f25655g = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static int f25656h = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static int f25657i = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$g(byte r8, int r9, int r10) {
                /*
                    byte[] r7 = o.ey.e.AnonymousClass3.$$c
                    int r0 = r10 * 3
                    int r6 = 1 - r0
                    int r5 = r9 + 99
                    int r0 = r8 * 3
                    int r4 = 4 - r0
                    byte[] r3 = new byte[r6]
                    r2 = 0
                    if (r7 != 0) goto L27
                    r0 = r6
                    r1 = r2
                L13:
                    int r0 = -r0
                    int r5 = r5 + r0
                    int r4 = r4 + 1
                L17:
                    byte r0 = (byte) r5
                    r3[r1] = r0
                    int r1 = r1 + 1
                    if (r1 != r6) goto L24
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r3, r2)
                    return r0
                L24:
                    r0 = r7[r4]
                    goto L13
                L27:
                    r1 = r2
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ey.e.AnonymousClass3.$$g(byte, int, int):java.lang.String");
            }

            static {
                init$2();
                $10 = 0;
                $11 = 1;
                init$1();
                f25656h = 269021986;
                f25654f = -270318177;
                init$0();
                f25655g = 0;
                f25657i = 1;
                f25652a = new char[]{38528, 50605, 12481, 28661, 55814, 2338, 25673, 54049, 3998, 31392, 43419, 1220, 29440, 44584, 7497, 18554, 42156, 5088, 20201, 48392, 59434, 18240, 38039, 51132, 13015, 28132, 55305, 2877, 26202, 53582, 3463, 30881, 43978, 1776, 28931, 44069, 8011, 38040, 51121, 12992, 28149, 55380, 2868, 26207, 53618, 3461, 30958, 44021, 1789, 28953, 44092, 8011, 19041, 3767, 23960, 43263, 63446, 16930, 37149, 64614, 19273, 38790, 57997, 12793, 40128, 60165, 13835, 34150, 53317, 29948, 10193, 53949, 36233, 14458, 60254, 34357, 12637, 60908, 39135, 19385, 59077, 37188, 19524, 65333, 43530, 18123, 61878, 44173, 24418, 2657, 42303, 20483, 3318, 49100, 27307, 38033, 51109, 12996, 28134, 55327, 2870, 26186, 53597, 3474, 30896, 43978, 1773, 28937, 44073, 8026, 19045, 42685, 4574, 38036, 51106, 12952, 28149, 55316, 2860, 26203, 53616, 3469, 30896, 43912, 1783, 28942, 44067, 7936, 19053, 42663, 4548, 19710, 48913, 59956, 17740, 45175, 60575, 24483, 35540, 58863, 20491, 33572, 65030, 10622, 34206, 61661, 9213, 40454, 51488, 9236, 38747, 50059, 16047, 27094, 50415, 14091, 25121, 56664, 2121, 25755, 55224, 762, 32021, 43064, 6976, 30323, 41627, 7615, 18632, 48107, 5647, 16680, 48244, 61304, 23431, 46755, 57820, 23558, 36626, 64067, 21885, 33174, 64700, 12251, 39662};
                f25653e = -6503057080170199088L;
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x03eb  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void c(java.util.List<o.es.e> r26) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1469
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ey.e.AnonymousClass3.c(java.util.List):void");
            }

            static void init$0() {
                $$a = new byte[]{40, 101, 74, -30};
                $$b = JfifUtil.MARKER_SOS;
            }

            static void init$1() {
                $$d = new byte[]{90, -73, MessagePack.Code.BIN8, 52};
                $$e = 164;
            }

            static void init$2() {
                $$c = new byte[]{95, MessagePack.Code.FALSE, -107, -90};
                $$f = 151;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:5:0x0017). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void j(byte r8, byte r9, byte r10, java.lang.Object[] r11) {
                /*
                    byte[] r7 = o.ey.e.AnonymousClass3.$$a
                    int r2 = r8 * 3
                    int r1 = 1 - r2
                    int r0 = r10 * 3
                    int r6 = 100 - r0
                    int r0 = r9 * 3
                    int r5 = 3 - r0
                    byte[] r4 = new byte[r1]
                    r3 = 0
                    int r2 = 0 - r2
                    if (r7 != 0) goto L2d
                    r1 = r2
                    r0 = r3
                L17:
                    int r6 = r6 + r1
                    r1 = r0
                L19:
                    byte r0 = (byte) r6
                    r4[r1] = r0
                    int r0 = r1 + 1
                    if (r1 != r2) goto L28
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    r11[r3] = r0
                    return
                L28:
                    int r5 = r5 + 1
                    r1 = r7[r5]
                    goto L17
                L2d:
                    r1 = r3
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ey.e.AnonymousClass3.j(byte, byte, byte, java.lang.Object[]):void");
            }

            private static void k(char c2, int i8, int i9, Object[] objArr2) throws Throwable {
                int i10 = 2 % 2;
                o oVar = new o();
                long[] jArr = new long[i9];
                oVar.f19947b = 0;
                while (oVar.f19947b < i9) {
                    int i11 = $10 + 17;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = oVar.f19947b;
                        try {
                            Object[] objArr3 = {Integer.valueOf(f25652a[i8 * i12])};
                            Object objA = o.d.d.a(-214519724);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objA = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0') + 743, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (Process.myTid() >> 22) + 12, 632508977, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            Object[] objArr4 = {Long.valueOf(((Long) ((Method) objA).invoke(null, objArr3)).longValue()), Long.valueOf(i12), Long.valueOf(f25653e), Integer.valueOf(c2)};
                            Object objA2 = o.d.d.a(-1567654649);
                            if (objA2 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = (byte) (b4 + 1);
                                objA2 = o.d.d.a(767 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (12470 - Color.argb(0, 0, 0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 12, 1946853218, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i12] = ((Long) ((Method) objA2).invoke(null, objArr4)).longValue();
                            Object[] objArr5 = {oVar, oVar};
                            Object objA3 = o.d.d.a(-723636472);
                            if (objA3 == null) {
                                byte b6 = (byte) 0;
                                objA3 = o.d.d.a(388 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) Color.blue(0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19, 39570797, false, $$g(b6, (byte) ((-1) - (((-1) - b6) & ((-1) - 6))), b6), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objA3).invoke(null, objArr5);
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        int i13 = oVar.f19947b;
                        Object[] objArr6 = {Integer.valueOf(f25652a[i8 + i13])};
                        Object objA4 = o.d.d.a(-214519724);
                        if (objA4 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objA4 = o.d.d.a(742 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 12 - Color.green(0), 632508977, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr7 = {Long.valueOf(((Long) ((Method) objA4).invoke(null, objArr6)).longValue()), Long.valueOf(i13), Long.valueOf(f25653e), Integer.valueOf(c2)};
                        Object objA5 = o.d.d.a(-1567654649);
                        if (objA5 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = (byte) (b9 + 1);
                            objA5 = o.d.d.a(765 - TextUtils.lastIndexOf("", '0', 0), (char) (12470 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 13 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1946853218, false, $$g(b9, b10, (byte) (b10 - 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i13] = ((Long) ((Method) objA5).invoke(null, objArr7)).longValue();
                        Object[] objArr8 = {oVar, oVar};
                        Object objA6 = o.d.d.a(-723636472);
                        if (objA6 == null) {
                            byte b11 = (byte) 0;
                            objA6 = o.d.d.a(387 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) Color.green(0), 'B' - AndroidCharacter.getMirror('0'), 39570797, false, $$g(b11, (byte) (6 | b11), b11), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA6).invoke(null, objArr8);
                    }
                }
                char[] cArr = new char[i9];
                oVar.f19947b = 0;
                int i14 = $11 + 29;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                while (oVar.f19947b < i9) {
                    cArr[oVar.f19947b] = (char) jArr[oVar.f19947b];
                    Object[] objArr9 = {oVar, oVar};
                    Object objA7 = o.d.d.a(-723636472);
                    if (objA7 == null) {
                        byte b12 = (byte) 0;
                        objA7 = o.d.d.a(KeyEvent.keyCodeFromString("") + 387, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 17, 39570797, false, $$g(b12, (byte) ((-1) - (((-1) - b12) & ((-1) - 6))), b12), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA7).invoke(null, objArr9);
                }
                objArr2[0] = new String(cArr);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0016). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void l(byte r5, int r6, int r7, java.lang.Object[] r8) {
                /*
                    int r0 = r7 * 3
                    int r7 = 97 - r0
                    int r0 = r6 * 3
                    int r6 = 3 - r0
                    int r5 = r5 * 2
                    int r0 = r5 + 1
                    byte[] r4 = o.ey.e.AnonymousClass3.$$d
                    byte[] r3 = new byte[r0]
                    r2 = 0
                    if (r4 != 0) goto L2b
                    r0 = r7
                    r1 = r2
                    r7 = r5
                L16:
                    int r7 = r7 + r0
                L17:
                    byte r0 = (byte) r7
                    r3[r1] = r0
                    int r6 = r6 + 1
                    if (r1 != r5) goto L26
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r3, r2)
                    r8[r2] = r0
                    return
                L26:
                    int r1 = r1 + 1
                    r0 = r4[r6]
                    goto L16
                L2b:
                    r1 = r2
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ey.e.AnonymousClass3.l(byte, int, int, java.lang.Object[]):void");
            }

            @Override // o.es.c.a
            public final /* synthetic */ void a(List<o.es.e> list) throws Throwable {
                int i8 = 2 % 2;
                int i9 = f25657i + 99;
                f25655g = i9 % 128;
                int i10 = i9 % 2;
                c(list);
                if (i10 != 0) {
                    throw null;
                }
            }

            @Override // o.es.c.a
            public final void d(o.by.c cVar) {
                int i8 = 2 % 2;
                int i9 = f25655g + 7;
                f25657i = i9 % 128;
                if (i9 % 2 != 0) {
                    operationCallback.onError(cVar.a());
                    return;
                }
                operationCallback.onError(cVar.a());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        return jVar.b();
    }

    public final SecureCardPushToGooglePay g() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f25625s + 77;
        f25623q = i3 % 128;
        int i4 = i3 % 2;
        if (f.a()) {
            String strA = a();
            Object[] objArr = new Object[1];
            A((char) (ViewConfiguration.getLongPressTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 140, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 18, objArr);
            f.c(strA, ((String) objArr[0]).intern());
            int i5 = f25625s + 103;
            f25623q = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = (int) Runtime.getRuntime().totalMemory();
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i8 = f25614f * 1152310514;
        f25614f = i8;
        return new SecureCardPushToGooglePay(new g((String) e(iFreeMemory, -1817011330, i8, i7, (int) Runtime.getRuntime().freeMemory(), new Object[]{this}, 1817011330), this.f25009a, c()));
    }

    @Override // o.er.h
    public final o.er.c[] h() {
        o.er.c[] cVarArr;
        int i2 = 2 % 2;
        int i3 = f25625s + 93;
        f25623q = i3 % 128;
        if (i3 % 2 != 0) {
            cVarArr = new o.er.c[0];
            cVarArr[0] = this.f25010g.d();
        } else {
            cVarArr = new o.er.c[]{this.f25010g.d()};
        }
        int i4 = f25623q + 45;
        f25625s = i4 % 128;
        if (i4 % 2 != 0) {
            return cVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
