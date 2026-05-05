package o.ep;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.AntelopErrorCode;
import fr.antelop.sdk.card.CardStatus;
import fr.antelop.sdk.digitalcard.VirtualCardNumber;
import fr.antelop.sdk.exception.WalletValidationErrorCode;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import o.a.g;
import o.au.e;
import o.er.j;
import o.y.m;
import o.y.p;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    private static int B = 0;
    private static int D = 0;

    /* JADX INFO: renamed from: a */
    public static int f24521a = 0;

    /* JADX INFO: renamed from: b */
    public static int f24522b = 0;

    /* JADX INFO: renamed from: c */
    public static int f24523c = 0;

    /* JADX INFO: renamed from: d */
    public static int f24524d = 0;

    /* JADX INFO: renamed from: e */
    public static int f24525e = 0;

    /* JADX INFO: renamed from: f */
    public static int f24526f = 0;

    /* JADX INFO: renamed from: h */
    public static int f24527h = 0;

    /* JADX INFO: renamed from: i */
    public static int f24528i = 0;

    /* JADX INFO: renamed from: j */
    public static int f24529j = 0;

    /* JADX INFO: renamed from: r */
    private static char f24530r = 0;

    /* JADX INFO: renamed from: u */
    private static int f24531u = 0;

    /* JADX INFO: renamed from: v */
    private static char f24532v = 0;

    /* JADX INFO: renamed from: w */
    private static int f24533w = 0;

    /* JADX INFO: renamed from: x */
    private static char f24534x = 0;

    /* JADX INFO: renamed from: y */
    private static char f24535y = 0;

    /* JADX INFO: renamed from: g */
    private final String f24536g;

    /* JADX INFO: renamed from: k */
    private e f24537k;

    /* JADX INFO: renamed from: l */
    private final Date f24538l;

    /* JADX INFO: renamed from: m */
    private final String f24539m;

    /* JADX INFO: renamed from: n */
    private final String f24540n;

    /* JADX INFO: renamed from: o */
    private final String f24541o;

    /* JADX INFO: renamed from: p */
    private final String f24542p;

    /* JADX INFO: renamed from: q */
    private final Date f24543q;

    /* JADX INFO: renamed from: s */
    private final Integer f24544s;

    /* JADX INFO: renamed from: t */
    private final String f24545t;

    /* JADX INFO: renamed from: o.ep.h$2 */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f24546b;

        /* JADX INFO: renamed from: d */
        private static int f24547d = 1;

        /* JADX INFO: renamed from: e */
        private static int f24548e = 0;

        static {
            int[] iArr = new int[e.values().length];
            f24546b = iArr;
            try {
                iArr[e.f24572c.ordinal()] = 1;
                int i2 = f24547d;
                int i3 = (i2 ^ 65) + (((-1) - (((-1) - i2) | ((-1) - 65))) << 1);
                f24548e = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24546b[e.f24570a.ordinal()] = 2;
                int i6 = f24547d;
                int i7 = (i6 ^ 95) + ((i6 & 95) << 1);
                f24548e = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24546b[e.f24573e.ordinal()] = 3;
                int i10 = f24547d;
                int i11 = ((117 | i10) << 1) - (i10 ^ 117);
                f24548e = i11 % 128;
                if (i11 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: o.ep.h$4 */
    final class AnonymousClass4 implements o.x.f {

        /* JADX INFO: renamed from: a */
        public static int f24549a = 1533933122;

        /* JADX INFO: renamed from: b */
        public static int f24550b = 13195615;

        /* JADX INFO: renamed from: c */
        public static int f24551c = 1031358598;

        /* JADX INFO: renamed from: d */
        public static int f24552d = 953120048;

        /* JADX INFO: renamed from: e */
        public static int f24553e = 1237106632;

        /* JADX INFO: renamed from: g */
        public static int f24554g = 2108665305;

        /* JADX INFO: renamed from: h */
        public static int f24555h = -590008810;

        /* JADX INFO: renamed from: i */
        public static int f24556i = -635774601;

        /* JADX INFO: renamed from: j */
        public static int f24557j = 1698624876;

        /* JADX INFO: renamed from: n */
        private static int f24558n = 1;

        /* JADX INFO: renamed from: o */
        private static int f24559o = 0;

        /* JADX INFO: renamed from: f */
        private /* synthetic */ OperationCallback f24560f;

        AnonymousClass4(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        private static /* synthetic */ Object a(Object[] objArr) {
            AnonymousClass4 anonymousClass4 = (AnonymousClass4) objArr[0];
            int i2 = 2 % 2;
            int i3 = f24558n;
            int i4 = (i3 & 77) + ((-1) - (((-1) - i3) & ((-1) - 77)));
            f24559o = i4 % 128;
            int i5 = i4 % 2;
            operationCallback.onSuccess(null);
            int i6 = f24558n;
            int i7 = ((-1) - (((-1) - i6) | ((-1) - 55))) + (i6 | 55);
            f24559o = i7 % 128;
            if (i7 % 2 == 0) {
                return null;
            }
            throw null;
        }

        private static /* synthetic */ Object b(Object[] objArr) {
            int i2 = 2 % 2;
            int i3 = f24559o + 1;
            f24558n = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Object e(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
            int i8 = ~i3;
            int i9 = ~i4;
            int i10 = ~(i8 | i9 | i7);
            int i11 = ~i7;
            int i12 = (~((-1) - (((-1) - i8) & ((-1) - i11)))) | (~(((-1) - (((-1) - i9) & ((-1) - i3))) | i7));
            int i13 = (~((i7 + i8) - (i7 & i8))) | (~((i9 + i11) - (i9 & i11)));
            int i14 = i3 + i4 + i5 + ((-1255669517) * i2) + (533247121 * i6);
            int i15 = i14 * i14;
            int i16 = ((i3 * (-1895547823)) - 858849280) + ((-1895547823) * i4) + (i10 * (-204618832)) + (i12 * (-204618832)) + ((-204618832) * i13) + ((-2100166656) * i5) + (760610816 * i2) + ((-1057882112) * i6) + (1344208896 * i15);
            int i17 = ((i3 * (-122328301)) - 2132886715) + (i4 * (-122328301)) + (i10 * 272) + (i12 * 272) + (i13 * 272) + (i5 * (-122328029)) + (i2 * (-1196579527)) + (i6 * 656595923) + (i15 * 138215424);
            int i18 = i16 + (i17 * i17 * (-833028096));
            if (i18 != 1) {
                return i18 != 2 ? b(objArr) : a(objArr);
            }
            AnonymousClass4 anonymousClass4 = (AnonymousClass4) objArr[0];
            int i19 = 2 % 2;
            operationCallback.onError(new o.by.c(AntelopErrorCode.CustomerAuthenticationImpossible).a());
            int i20 = f24558n;
            int i21 = ((115 | i20) << 1) - (i20 ^ 115);
            f24559o = i21 % 128;
            int i22 = i21 % 2;
            return null;
        }

        @Override // o.x.f
        public final void onAuthenticationDeclined() {
            int i2 = f24553e * 1149540579;
            f24553e = i2;
            int i3 = f24550b * 1802307827;
            f24550b = i3;
            int i4 = f24551c * 1644858706;
            f24551c = i4;
            e(new Object[]{this}, i4, 480280557, -480280557, i3, (int) Process.getElapsedCpuTime(), i2);
        }

        @Override // o.x.f
        public final void onCustomerCredentialsInvalid(o.j.b bVar) {
            int i2 = 2 % 2;
            int i3 = f24559o;
            int i4 = (i3 ^ 83) + (((-1) - (((-1) - i3) | ((-1) - 83))) << 1);
            f24558n = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // o.x.f
        public final void onCustomerCredentialsRequired(List<o.m.h> list) {
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i2 = f24552d * (-1149566266);
            f24552d = i2;
            int id = (int) Thread.currentThread().getId();
            int i3 = f24556i * (-1541327924);
            f24556i = i3;
            e(new Object[]{this, list}, id, -1353300951, 1353300952, i2, i3, iFreeMemory);
        }

        @Override // o.x.f
        public final void onError(o.by.c cVar) {
            int i2 = 2 % 2;
            int i3 = f24559o;
            int i4 = ((77 | i3) << 1) - (i3 ^ 77);
            f24558n = i4 % 128;
            if (i4 % 2 != 0) {
                operationCallback.onError(cVar.a());
                return;
            }
            operationCallback.onError(cVar.a());
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.x.f
        public final void onProcessStart() {
            int i2 = 2 % 2;
            int i3 = f24549a * 47771832;
            f24549a = i3;
            int i4 = ~i3;
            int i5 = 470369790 ^ i4;
            int i6 = i4 & 470369790;
            int i7 = ~((i6 + i5) - (i6 & i5));
            int i8 = (1052630881 - (~(-(-(((-1) - (((-1) - ((i7 - 1709603905) - (i7 | (-1709603905)))) & ((-1) - ((-1709603905) ^ i7)))) * (-865)))))) + ((~((-1) - (((-1) - ((-470369791) ^ i3)) & ((-1) - (((-470369791) + i3) - ((-470369791) | i3)))))) * 865);
            int i9 = ~i3;
            int i10 = ~((-1) - (((-1) - (((-1709603905) + i9) - ((-1709603905) | i9))) & ((-1) - ((-1709603905) ^ i9))));
            int i11 = ~((i9 & (-470369791)) | (i9 ^ (-470369791)));
            int i12 = i10 ^ i11;
            int i13 = (i11 + i10) - (i11 | i10);
            int i14 = (i8 - (~(-(-(((i13 + i12) - (i13 & i12)) * 865))))) - 1;
            int iIdentityHashCode = System.identityHashCode(this);
            int i15 = ~iIdentityHashCode;
            int i16 = (~((-1) - (((-1) - (586729898 ^ i15)) & ((-1) - ((586729898 + i15) - (586729898 | i15)))))) | 13631874;
            int i17 = (-586729899) ^ iIdentityHashCode;
            int i18 = (-586729899) & iIdentityHashCode;
            int i19 = ~((i18 + i17) - (i18 & i17));
            int i20 = (((-1) - (((-1) - i16) | ((-1) - i19))) | (i16 ^ i19)) * (-338);
            int i21 = ((1008130369 + i20) - (1008130369 | i20)) + ((-1) - (((-1) - i20) & ((-1) - 1008130369)));
            int i22 = (i21 ^ (-848987078)) + (((-1) - (((-1) - (-848987078)) | ((-1) - i21))) << 1);
            int i23 = ~((i15 + 586729898) - (i15 & 586729898));
            int i24 = ~((-1) - (((-1) - (iIdentityHashCode & (-573098025))) & ((-1) - ((-573098025) ^ iIdentityHashCode))));
            int i25 = i23 ^ i24;
            int i26 = (-1) - (((-1) - i24) | ((-1) - i23));
            int i27 = ((i26 + i25) - (i26 & i25)) * ExifDirectoryBase.TAG_EXTRA_SAMPLES;
            if (i14 <= (((-1) - (((-1) - i22) & ((-1) - i27))) << 1) - (i27 ^ i22)) {
                throw null;
            }
        }

        @Override // o.x.f
        public final void onProcessSuccess() {
            int iMyPid = Process.myPid();
            int i2 = f24555h * (-919140414);
            f24555h = i2;
            int i3 = f24557j * 1930643972;
            f24557j = i3;
            int i4 = f24554g * 589413900;
            f24554g = i4;
            e(new Object[]{this}, i3, 1523467044, -1523467042, i2, i4, iMyPid);
        }
    }

    /* JADX INFO: renamed from: o.ep.h$5 */
    final class AnonymousClass5 implements e.d {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: b */
        private static int f24562b = 0;

        /* JADX INFO: renamed from: d */
        private static char[] f24563d = null;

        /* JADX INFO: renamed from: e */
        private static boolean f24564e = false;

        /* JADX INFO: renamed from: f */
        private static boolean f24565f = false;

        /* JADX INFO: renamed from: h */
        private static int f24566h = 0;

        /* JADX INFO: renamed from: i */
        private static int f24567i = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ OperationCallback f24568a;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0026 -> B:17:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(byte r9, int r10, short r11) {
            /*
                int r0 = r10 * 6
                int r8 = r0 + 67
                byte[] r7 = o.ep.h.AnonymousClass5.$$a
                int r0 = r11 * 3
                int r6 = r0 + 1
                int r0 = r9 * 4
                int r5 = 4 - r0
                byte[] r4 = new byte[r6]
                r3 = 0
                if (r7 != 0) goto L29
                r0 = r6
                r2 = r3
            L15:
                int r5 = r5 + 1
                int r8 = r8 + r0
                r1 = r2
            L19:
                int r2 = r1 + 1
                byte r0 = (byte) r8
                r4[r1] = r0
                if (r2 != r6) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L26:
                r0 = r7[r5]
                goto L15
            L29:
                r1 = r3
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ep.h.AnonymousClass5.$$c(byte, int, short):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f24566h = 0;
            f24567i = 1;
            f24563d = new char[]{2088, 2293, 2060, 2289, 2077, 2056, 2303, 2300, 2048, 2295, 2094, 2063, 2069, 2292, 2049, 2067, 2290, 2062, 2302, 2115, 2100, 2068, 2058, 2078, 2093};
            f24562b = 2040399971;
            f24564e = true;
            f24565f = true;
        }

        AnonymousClass5(OperationCallback operationCallback) {
            operationCallback = operationCallback;
        }

        private static void g(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
            int length;
            char[] cArr;
            int i3;
            String str3 = str;
            String str4 = str2;
            int i4 = 2;
            int i5 = 2 % 2;
            int i6 = $11 + 101;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            Object bytes = str4;
            if (str4 != null) {
                bytes = str4.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            Object charArray = str3;
            if (str3 != null) {
                int i8 = $10 + 81;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                charArray = str3.toCharArray();
            }
            char[] cArr2 = (char[]) charArray;
            o.a.f fVar = new o.a.f();
            char[] cArr3 = f24563d;
            char c2 = '0';
            int i10 = 0;
            if (cArr3 != null) {
                int i11 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    length = cArr3.length;
                    cArr = new char[length];
                    i3 = 1;
                } else {
                    length = cArr3.length;
                    cArr = new char[length];
                    i3 = 0;
                }
                while (i3 < length) {
                    int i12 = $10 + 101;
                    $11 = i12 % 128;
                    int i13 = i12 % i4;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                        Object objA = o.d.d.a(1618406102);
                        if (objA == null) {
                            byte b2 = (byte) i10;
                            byte b3 = b2;
                            objA = o.d.d.a(Drawable.resolveOpacity(i10, i10) + 593, (char) (TextUtils.lastIndexOf("", c2) + 13182), 11 - Color.alpha(i10), -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr[i3] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        i3++;
                        i4 = 2;
                        c2 = '0';
                        i10 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i14 = $10 + 41;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                cArr3 = cArr;
            }
            Object[] objArr3 = {Integer.valueOf(f24562b)};
            Object objA2 = o.d.d.a(-1503702982);
            if (objA2 == null) {
                objA2 = o.d.d.a(32 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
            if (f24565f) {
                fVar.f19923e = bArr.length;
                char[] cArr4 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    cArr4[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                    Object[] objArr4 = {fVar, fVar};
                    Object objA3 = o.d.d.a(1540807955);
                    if (objA3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objA3 = o.d.d.a(458 - (ViewConfiguration.getEdgeSlop() >> 16), (char) TextUtils.getTrimmedLength(""), ';' - AndroidCharacter.getMirror('0'), -1923924106, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    int i16 = $10 + 93;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            int i18 = 0;
            if (f24564e) {
                fVar.f19923e = cArr2.length;
                char[] cArr5 = new char[fVar.f19923e];
                fVar.f19922a = 0;
                while (fVar.f19922a < fVar.f19923e) {
                    int i19 = $10 + 37;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    cArr5[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    Object[] objArr5 = {fVar, fVar};
                    Object objA4 = o.d.d.a(1540807955);
                    if (objA4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objA4 = o.d.d.a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 457, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 11, -1923924106, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            fVar.f19923e = iArr.length;
            char[] cArr6 = new char[fVar.f19923e];
            while (true) {
                fVar.f19922a = i18;
                if (fVar.f19922a >= fVar.f19923e) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                    i18 = fVar.f19922a + 1;
                }
            }
        }

        static void init$0() {
            $$a = new byte[]{88, MessagePack.Code.INT64, 78, Ascii.GS};
            $$b = 55;
        }

        @Override // o.au.e.d
        public final void c(o.bg.c cVar) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f24567i + 99;
            f24566h = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                o.by.c.b(cVar);
                o.ea.f.a();
                obj.hashCode();
                throw null;
            }
            o.by.c cVarB = o.by.c.b(cVar);
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                g(127 - (ViewConfiguration.getTapTimeout() >> 16), null, null, "\u0084\u0083\u008f\u008e\u0088\u008d\u008c\u0084\u0089\u008b\u008a\u0089\u0088\u0087\u0084\u0086\u0085\u0084\u0083\u0082\u0082\u0081", objArr);
                String strIntern = ((String) objArr[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr2 = new Object[1];
                g((ViewConfiguration.getFadingEdgeLength() >> 16) + 127, null, null, "\u0094\u0095\u0094\u0083\u0084\u0088\u008a\u0086\u0089\u0099\u0082\u0092\u0085\u0083\u0097\u0089\u0082\u0089\u0096\u0082\u0091\u0094\u0095\u0094\u0093\u0093\u0083\u0092\u0091\u0084\u0090\u0082\u0088\u0084", objArr2);
                o.ea.f.c(strIntern, sb.append(((String) objArr2[0]).intern()).append(cVarB).toString());
            }
            operationCallback.onError(o.by.c.b(cVar).a());
            int i4 = f24567i + 71;
            f24566h = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        @Override // o.au.e.d
        public final void e() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f24566h + 43;
            f24567i = i3 % 128;
            int i4 = i3 % 2;
            if (o.ea.f.a()) {
                Object[] objArr = new Object[1];
                g((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, null, null, "\u0084\u0083\u008f\u008e\u0088\u008d\u008c\u0084\u0089\u008b\u008a\u0089\u0088\u0087\u0084\u0086\u0085\u0084\u0083\u0082\u0082\u0081", objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                g(127 - Color.argb(0, 0, 0, 0), null, null, "\u0093\u0093\u0083\u0092\u0092\u0088\u0098\u0082\u0092\u0085\u0083\u0097\u0089\u0082\u0089\u0096\u0082\u0091\u0094\u0095\u0094\u0093\u0093\u0083\u0092\u0091\u0084\u0090\u0082\u0088\u0084", objArr2);
                o.ea.f.c(strIntern, ((String) objArr2[0]).intern());
            }
            operationCallback.onSuccess(null);
            int i5 = f24566h + 107;
            f24567i = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public static final class e extends Enum<e> implements o.ea.d<VirtualCardNumber.Status>, o.en.a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10 = 0;
        private static int $11 = 0;

        /* JADX INFO: renamed from: a */
        public static final e f24570a;

        /* JADX INFO: renamed from: b */
        private static final /* synthetic */ e[] f24571b;

        /* JADX INFO: renamed from: c */
        public static final e f24572c;

        /* JADX INFO: renamed from: e */
        public static final e f24573e;

        /* JADX INFO: renamed from: f */
        private static char f24574f = 0;

        /* JADX INFO: renamed from: g */
        private static char f24575g = 0;

        /* JADX INFO: renamed from: h */
        private static int f24576h = 0;

        /* JADX INFO: renamed from: i */
        private static char f24577i = 0;

        /* JADX INFO: renamed from: j */
        private static char f24578j = 0;

        /* JADX INFO: renamed from: l */
        private static int f24579l = 0;

        /* JADX INFO: renamed from: n */
        private static int f24580n = 0;

        /* JADX INFO: renamed from: o */
        private static int f24581o = 0;

        /* JADX INFO: renamed from: d */
        private final String f24582d;

        /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0013). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$c(int r9, short r10, int r11) {
            /*
                byte[] r8 = o.ep.h.e.$$a
                int r0 = r11 * 3
                int r7 = r0 + 1
                int r0 = r10 + 4
                int r1 = r9 * 3
                int r6 = r1 + 69
                byte[] r5 = new byte[r7]
                r4 = 0
                if (r8 != 0) goto L28
                r1 = r0
                r3 = r4
            L13:
                int r6 = r6 + r0
                r0 = r1
                r2 = r3
            L16:
                int r3 = r2 + 1
                byte r1 = (byte) r6
                r5[r2] = r1
                if (r3 != r7) goto L23
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5, r4)
                return r0
            L23:
                int r1 = r0 + 1
                r0 = r8[r1]
                goto L13
            L28:
                r2 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ep.h.e.$$c(int, short, int):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            f24579l = 0;
            f24580n = 1;
            f24576h = 0;
            f24581o = 1;
            b();
            Object[] objArr = new Object[1];
            k("묧\ud80fሩ\uf112\ue746椥", TextUtils.getTrimmedLength("") + 6, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            k("Ͽ㵒\ua8cc`蔟\uf347", View.resolveSize(0, 0) + 6, objArr2);
            f24572c = new e(strIntern, 0, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            k("䕮㯨뚛ꮟ㴸힇棂㇑ᢵ獁", 9 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr3);
            String strIntern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            k("ꮯ\ue9da뉆껳髶咳ﮞ풸\ue272靋", ((byte) KeyEvent.getModifierMetaStateMask()) + 10, objArr4);
            f24570a = new e(strIntern2, 1, ((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            k("蒿不팘\u05edꈷ醢ᢵ獁", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6, objArr5);
            String strIntern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            k("ﮞ풸\uf36e㳐構汄\ue272靋", 7 - ExpandableListView.getPackedPositionType(0L), objArr6);
            f24573e = new e(strIntern3, 2, ((String) objArr6[0]).intern());
            f24571b = c();
            int i2 = f24580n + 1;
            f24579l = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private e(String str, int i2, String str2) {
            super(str, i2);
            this.f24582d = str2;
        }

        static void b() {
            f24575g = (char) 11414;
            f24574f = (char) 18564;
            f24577i = (char) 56918;
            f24578j = (char) 20662;
        }

        private static /* synthetic */ e[] c() {
            e[] eVarArr;
            int i2 = 2 % 2;
            int i3 = f24581o;
            int i4 = i3 + 125;
            f24576h = i4 % 128;
            if (i4 % 2 != 0) {
                eVarArr = new e[4];
                eVarArr[0] = f24572c;
                eVarArr[1] = f24570a;
                eVarArr[2] = f24573e;
            } else {
                eVarArr = new e[]{f24572c, f24570a, f24573e};
            }
            int i5 = i3 + 73;
            f24576h = i5 % 128;
            int i6 = i5 % 2;
            return eVarArr;
        }

        static void init$0() {
            $$a = new byte[]{46, -113, 33, 42};
            $$b = 117;
        }

        private static void k(String str, int i2, Object[] objArr) throws Throwable {
            String str2 = str;
            int i3 = 2 % 2;
            int i4 = $10 + 103;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
            g gVar = new g();
            char[] cArr2 = new char[cArr.length];
            int i6 = 0;
            gVar.f19924d = 0;
            char[] cArr3 = new char[2];
            int i7 = $11 + 33;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 5 % 4;
            }
            while (gVar.f19924d < cArr.length) {
                cArr3[i6] = cArr[gVar.f19924d];
                cArr3[1] = cArr[gVar.f19924d + 1];
                int i9 = 58224;
                int i10 = i6;
                while (i10 < 16) {
                    char c2 = cArr3[1];
                    char c3 = cArr3[i6];
                    try {
                        Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i9) ^ ((c3 << 4) + ((char) (((long) f24577i) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f24578j)};
                        Object objA = o.d.d.a(1603517628);
                        if (objA == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objA = o.d.d.a(270 - TextUtils.getOffsetBefore("", 0), (char) Gravity.getAbsoluteGravity(0, 0), 11 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1995022631, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (((long) f24575g) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f24574f)};
                        Object objA2 = o.d.d.a(1603517628);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 - 1);
                            objA2 = o.d.d.a(TextUtils.getCapsMode("", 0, 0) + 270, (char) (TextUtils.lastIndexOf("", '0') + 1), 11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1995022631, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                        i9 -= 40503;
                        i10++;
                        i6 = 0;
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
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 270;
                    char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                    int pressedStateDuration = 11 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte b6 = (byte) ((-1) - (((-1) - $$b) | ((-1) - 3)));
                    byte b7 = (byte) (-b6);
                    objA3 = o.d.d.a(threadPriority, absoluteGravity, pressedStateDuration, -2074123590, false, $$c(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
                i6 = 0;
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        public static e valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f24576h + 21;
            f24581o = i3 % 128;
            int i4 = i3 % 2;
            e eVar = (e) Enum.valueOf(e.class, str);
            if (i4 != 0) {
                return eVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static e[] values() {
            int i2 = 2 % 2;
            int i3 = f24576h + 65;
            f24581o = i3 % 128;
            int i4 = i3 % 2;
            e[] eVarArr = (e[]) f24571b.clone();
            int i5 = f24581o + 79;
            f24576h = i5 % 128;
            int i6 = i5 % 2;
            return eVarArr;
        }

        @Override // o.en.a
        public final String a() {
            int i2 = 2 % 2;
            int i3 = f24576h + 53;
            int i4 = i3 % 128;
            f24581o = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = this.f24582d;
            int i5 = i4 + 19;
            f24576h = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 81 / 0;
            }
            return str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0020, code lost:
        
            if (r1 != 3) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0022, code lost:
        
            r3 = new java.lang.StringBuilder();
            r1 = new java.lang.Object[1];
            k("侊冩廪꓿ጣ罉녳\uef7a◟Ç\u1bf6\u0e85败ṽĩ즡!⟽", android.text.AndroidCharacter.getMirror('0') - 30, r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
        
            throw new java.lang.UnsupportedOperationException(r3.append(((java.lang.String) r1[0]).intern()).append(name()).toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
        
            if (r0 != 3) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0063, code lost:
        
            r1 = new java.lang.Object[1];
            k("蒿不팘\u05edꈷ醢쿫ᕷ௺珡덲왃湴ᦰ髢䛔壞䆢㥆\uf33c틴\ud959퇖벛罽ꋹ廪꓿䬖㖃辶ȥᢵ獁", 33 - android.text.TextUtils.getOffsetBefore("", 0), r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
        
            throw new java.lang.RuntimeException(((java.lang.String) r1[0]).intern());
         */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final fr.antelop.sdk.digitalcard.VirtualCardNumber.Status d() throws java.lang.Throwable {
            /*
                r7 = this;
                r3 = 2
                int r0 = r3 % r3
                int r0 = o.ep.h.e.f24581o
                int r1 = r0 + 67
                int r0 = r1 % 128
                o.ep.h.e.f24576h = r0
                int r1 = r1 % r3
                r2 = 3
                r6 = 1
                r4 = 0
                if (r1 == 0) goto L54
                int[] r1 = o.ep.h.AnonymousClass2.f24546b
                int r0 = r7.ordinal()
                r1 = r1[r0]
                r0 = 61
                int r0 = r0 / r4
                if (r1 == r6) goto L83
                if (r1 == r3) goto L80
                if (r1 == r2) goto L63
            L22:
                java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r0 = 48
                char r0 = android.text.AndroidCharacter.getMirror(r0)
                int r2 = r0 + (-30)
                java.lang.Object[] r1 = new java.lang.Object[r6]
                java.lang.String r0 = "侊冩廪꓿ጣ罉녳\uef7a◟Ç\u1bf6\u0e85败ṽĩ즡!⟽"
                k(r0, r2, r1)
                r0 = r1[r4]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                java.lang.StringBuilder r1 = r3.append(r0)
                java.lang.String r0 = r7.name()
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                throw r5
            L54:
                int[] r1 = o.ep.h.AnonymousClass2.f24546b
                int r0 = r7.ordinal()
                r0 = r1[r0]
                if (r0 == r6) goto L83
                if (r0 == r3) goto L80
                if (r0 == r2) goto L63
                goto L22
            L63:
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                java.lang.String r0 = ""
                int r0 = android.text.TextUtils.getOffsetBefore(r0, r4)
                int r2 = 33 - r0
                java.lang.Object[] r1 = new java.lang.Object[r6]
                java.lang.String r0 = "蒿不팘\u05edꈷ醢쿫ᕷ௺珡덲왃湴ᦰ髢䛔壞䆢㥆\uf33c틴\ud959퇖벛罽ꋹ廪꓿䬖㖃辶ȥᢵ獁"
                k(r0, r2, r1)
                r0 = r1[r4]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                r3.<init>(r0)
                throw r3
            L80:
                fr.antelop.sdk.digitalcard.VirtualCardNumber$Status r0 = fr.antelop.sdk.digitalcard.VirtualCardNumber.Status.Suspended
                return r0
            L83:
                fr.antelop.sdk.digitalcard.VirtualCardNumber$Status r2 = fr.antelop.sdk.digitalcard.VirtualCardNumber.Status.Active
                int r0 = o.ep.h.e.f24576h
                int r1 = r0 + 33
                int r0 = r1 % 128
                o.ep.h.e.f24581o = r0
                int r1 = r1 % r3
                if (r1 != 0) goto L93
                r0 = 86
                int r0 = r0 / r4
            L93:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ep.h.e.d():fr.antelop.sdk.digitalcard.VirtualCardNumber$Status");
        }

        @Override // o.ea.a
        public final /* synthetic */ Object e() throws Throwable {
            int i2 = 2 % 2;
            int i3 = f24576h + 41;
            f24581o = i3 % 128;
            int i4 = i3 % 2;
            VirtualCardNumber.Status statusD = d();
            int i5 = f24581o + 11;
            f24576h = i5 % 128;
            if (i5 % 2 == 0) {
                return statusD;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, short r9, short r10) {
        /*
            byte[] r7 = o.ep.h.$$a
            int r0 = r9 * 3
            int r6 = 72 - r0
            int r5 = r10 * 3
            int r1 = r5 + 1
            int r0 = r8 * 2
            int r4 = 4 - r0
            byte[] r3 = new byte[r1]
            r2 = 0
            if (r7 != 0) goto L29
            r0 = r5
            r1 = r2
        L15:
            int r0 = -r0
            int r6 = r6 + r0
            int r4 = r4 + 1
        L19:
            byte r0 = (byte) r6
            r3[r1] = r0
            if (r1 != r5) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2)
            return r0
        L24:
            int r1 = r1 + 1
            r0 = r7[r4]
            goto L15
        L29:
            r1 = r2
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ep.h.$$c(int, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f24526f = -2089265249;
        f24528i = 1332603107;
        f24527h = -1776012598;
        f24529j = -127281830;
        f24525e = -2120769609;
        f24524d = -1841438016;
        f24522b = 1617877879;
        f24521a = 1514234959;
        f24523c = 1156419310;
        B = 0;
        D = 1;
        f24533w = 0;
        f24531u = 1;
        o();
        TextUtils.getCapsMode("", 0, 0);
        int i2 = D + 111;
        B = i2 % 128;
        int i3 = i2 % 2;
    }

    public h(String str, e eVar, String str2, String str3, String str4, Date date, String str5, String str6, Date date2, Integer num) {
        this.f24536g = str;
        this.f24537k = eVar;
        this.f24540n = str2;
        this.f24539m = str3;
        this.f24541o = str4;
        this.f24538l = date;
        this.f24545t = str5;
        this.f24542p = str6;
        this.f24543q = date2;
        this.f24544s = num;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        h hVar = (h) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24531u + 89;
        int i4 = i3 % 128;
        f24533w = i4;
        int i5 = i3 % 2;
        String str = hVar.f24541o;
        int i6 = i4 + 121;
        f24531u = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 73 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        h hVar = (h) objArr[0];
        e eVar = (e) objArr[1];
        int i2 = 2 % 2;
        int i3 = f24533w;
        int i4 = i3 + 107;
        f24531u = i4 % 128;
        int i5 = i4 % 2;
        hVar.f24537k = eVar;
        int i6 = i3 + 121;
        f24531u = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private void b(Context context, e.c cVar, o.er.i iVar, d dVar, OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24531u + 71;
        f24533w = i3 % 128;
        int i4 = i3 % 2;
        int i5 = d.f24461m * (-222457364);
        d.f24461m = i5;
        int i6 = d.f24462n * 325900588;
        d.f24462n = i6;
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        int i7 = d.f24460l * 323941697;
        d.f24460l = i7;
        if (((CardStatus) d.e(1555433584, -1555433578, new Object[]{dVar}, i6, iElapsedRealtime, i7, i5)) != CardStatus.Active) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr = new Object[1];
            z("߂덾᳨袅", 5 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
        }
        if (!iVar.c()) {
            WalletValidationErrorCode walletValidationErrorCode2 = WalletValidationErrorCode.WrongState;
            Object[] objArr2 = new Object[1];
            z("ﺶⴢ፻ﹾ쑚\uf21e㶱즵䴍宒ᄫ嚰䈤䂛瓠봍뾌廽", 17 - TextUtils.getTrimmedLength(""), objArr2);
            throw new WalletValidationException(walletValidationErrorCode2, ((String) objArr2[0]).intern());
        }
        o.au.e eVar = new o.au.e(context, new e.d() { // from class: o.ep.h.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10 = 0;
            private static int $11 = 0;

            /* JADX INFO: renamed from: b */
            private static int f24562b = 0;

            /* JADX INFO: renamed from: d */
            private static char[] f24563d = null;

            /* JADX INFO: renamed from: e */
            private static boolean f24564e = false;

            /* JADX INFO: renamed from: f */
            private static boolean f24565f = false;

            /* JADX INFO: renamed from: h */
            private static int f24566h = 0;

            /* JADX INFO: renamed from: i */
            private static int f24567i = 0;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ OperationCallback f24568a;

            private static String $$c(byte v2, int v3, short v4) {
                /*
                    int r0 = r10 * 6
                    int r8 = r0 + 67
                    byte[] r7 = o.ep.h.AnonymousClass5.$$a
                    int r0 = r11 * 3
                    int r6 = r0 + 1
                    int r0 = r9 * 4
                    int r5 = 4 - r0
                    byte[] r4 = new byte[r6]
                    r3 = 0
                    if (r7 != 0) goto L29
                    r0 = r6
                    r2 = r3
                L15:
                    int r5 = r5 + 1
                    int r8 = r8 + r0
                    r1 = r2
                L19:
                    int r2 = r1 + 1
                    byte r0 = (byte) r8
                    r4[r1] = r0
                    if (r2 != r6) goto L26
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    return r0
                L26:
                    r0 = r7[r5]
                    goto L15
                L29:
                    r1 = r3
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: o.ep.h.AnonymousClass5.$$c(byte, int, short):java.lang.String");
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                f24566h = 0;
                f24567i = 1;
                f24563d = new char[]{2088, 2293, 2060, 2289, 2077, 2056, 2303, 2300, 2048, 2295, 2094, 2063, 2069, 2292, 2049, 2067, 2290, 2062, 2302, 2115, 2100, 2068, 2058, 2078, 2093};
                f24562b = 2040399971;
                f24564e = true;
                f24565f = true;
            }

            AnonymousClass5(OperationCallback operationCallback2) {
                operationCallback = operationCallback2;
            }

            private static void g(int i22, String str, int[] iArr, String str2, Object[] objArr3) throws Throwable {
                int length;
                char[] cArr;
                int i32;
                String str3 = str;
                String str4 = str2;
                int i42 = 2;
                int i52 = 2 % 2;
                int i62 = $11 + 101;
                $10 = i62 % 128;
                int i72 = i62 % 2;
                Object bytes = str4;
                if (str4 != null) {
                    bytes = str4.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                Object charArray = str3;
                if (str3 != null) {
                    int i8 = $10 + 81;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    charArray = str3.toCharArray();
                }
                char[] cArr2 = (char[]) charArray;
                o.a.f fVar = new o.a.f();
                char[] cArr3 = f24563d;
                char c2 = '0';
                int i10 = 0;
                if (cArr3 != null) {
                    int i11 = $11 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        length = cArr3.length;
                        cArr = new char[length];
                        i32 = 1;
                    } else {
                        length = cArr3.length;
                        cArr = new char[length];
                        i32 = 0;
                    }
                    while (i32 < length) {
                        int i12 = $10 + 101;
                        $11 = i12 % 128;
                        int i13 = i12 % i42;
                        try {
                            Object[] objArr22 = {Integer.valueOf(cArr3[i32])};
                            Object objA = o.d.d.a(1618406102);
                            if (objA == null) {
                                byte b2 = (byte) i10;
                                byte b3 = b2;
                                objA = o.d.d.a(Drawable.resolveOpacity(i10, i10) + 593, (char) (TextUtils.lastIndexOf("", c2) + 13182), 11 - Color.alpha(i10), -1225586509, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr[i32] = ((Character) ((Method) objA).invoke(null, objArr22)).charValue();
                            i32++;
                            i42 = 2;
                            c2 = '0';
                            i10 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i14 = $10 + 41;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    cArr3 = cArr;
                }
                Object[] objArr32 = {Integer.valueOf(f24562b)};
                Object objA2 = o.d.d.a(-1503702982);
                if (objA2 == null) {
                    objA2 = o.d.d.a(32 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr32)).intValue();
                if (f24565f) {
                    fVar.f19923e = bArr.length;
                    char[] cArr4 = new char[fVar.f19923e];
                    fVar.f19922a = 0;
                    while (fVar.f19922a < fVar.f19923e) {
                        cArr4[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i22] - iIntValue);
                        Object[] objArr4 = {fVar, fVar};
                        Object objA3 = o.d.d.a(1540807955);
                        if (objA3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 1);
                            objA3 = o.d.d.a(458 - (ViewConfiguration.getEdgeSlop() >> 16), (char) TextUtils.getTrimmedLength(""), ';' - AndroidCharacter.getMirror('0'), -1923924106, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA3).invoke(null, objArr4);
                        int i16 = $10 + 93;
                        $11 = i16 % 128;
                        int i17 = i16 % 2;
                    }
                    objArr3[0] = new String(cArr4);
                    return;
                }
                int i18 = 0;
                if (f24564e) {
                    fVar.f19923e = cArr2.length;
                    char[] cArr5 = new char[fVar.f19923e];
                    fVar.f19922a = 0;
                    while (fVar.f19922a < fVar.f19923e) {
                        int i19 = $10 + 37;
                        $11 = i19 % 128;
                        int i20 = i19 % 2;
                        cArr5[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i22] - iIntValue);
                        Object[] objArr5 = {fVar, fVar};
                        Object objA4 = o.d.d.a(1540807955);
                        if (objA4 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = (byte) (b6 + 1);
                            objA4 = o.d.d.a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 457, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 11, -1923924106, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objA4).invoke(null, objArr5);
                    }
                    objArr3[0] = new String(cArr5);
                    return;
                }
                fVar.f19923e = iArr.length;
                char[] cArr6 = new char[fVar.f19923e];
                while (true) {
                    fVar.f19922a = i18;
                    if (fVar.f19922a >= fVar.f19923e) {
                        objArr3[0] = new String(cArr6);
                        return;
                    } else {
                        cArr6[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i22] - iIntValue);
                        i18 = fVar.f19922a + 1;
                    }
                }
            }

            static void init$0() {
                $$a = new byte[]{88, MessagePack.Code.INT64, 78, Ascii.GS};
                $$b = 55;
            }

            @Override // o.au.e.d
            public final void c(o.bg.c cVar2) throws Throwable {
                int i22 = 2 % 2;
                int i32 = f24567i + 99;
                f24566h = i32 % 128;
                Object obj = null;
                if (i32 % 2 != 0) {
                    o.by.c.b(cVar2);
                    o.ea.f.a();
                    obj.hashCode();
                    throw null;
                }
                o.by.c cVarB = o.by.c.b(cVar2);
                if (o.ea.f.a()) {
                    Object[] objArr3 = new Object[1];
                    g(127 - (ViewConfiguration.getTapTimeout() >> 16), null, null, "\u0084\u0083\u008f\u008e\u0088\u008d\u008c\u0084\u0089\u008b\u008a\u0089\u0088\u0087\u0084\u0086\u0085\u0084\u0083\u0082\u0082\u0081", objArr3);
                    String strIntern = ((String) objArr3[0]).intern();
                    StringBuilder sb = new StringBuilder();
                    Object[] objArr22 = new Object[1];
                    g((ViewConfiguration.getFadingEdgeLength() >> 16) + 127, null, null, "\u0094\u0095\u0094\u0083\u0084\u0088\u008a\u0086\u0089\u0099\u0082\u0092\u0085\u0083\u0097\u0089\u0082\u0089\u0096\u0082\u0091\u0094\u0095\u0094\u0093\u0093\u0083\u0092\u0091\u0084\u0090\u0082\u0088\u0084", objArr22);
                    o.ea.f.c(strIntern, sb.append(((String) objArr22[0]).intern()).append(cVarB).toString());
                }
                operationCallback.onError(o.by.c.b(cVar2).a());
                int i42 = f24567i + 71;
                f24566h = i42 % 128;
                if (i42 % 2 != 0) {
                    throw null;
                }
            }

            @Override // o.au.e.d
            public final void e() throws Throwable {
                int i22 = 2 % 2;
                int i32 = f24566h + 43;
                f24567i = i32 % 128;
                int i42 = i32 % 2;
                if (o.ea.f.a()) {
                    Object[] objArr3 = new Object[1];
                    g((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, null, null, "\u0084\u0083\u008f\u008e\u0088\u008d\u008c\u0084\u0089\u008b\u008a\u0089\u0088\u0087\u0084\u0086\u0085\u0084\u0083\u0082\u0082\u0081", objArr3);
                    String strIntern = ((String) objArr3[0]).intern();
                    Object[] objArr22 = new Object[1];
                    g(127 - Color.argb(0, 0, 0, 0), null, null, "\u0093\u0093\u0083\u0092\u0092\u0088\u0098\u0082\u0092\u0085\u0083\u0097\u0089\u0082\u0089\u0096\u0082\u0091\u0094\u0095\u0094\u0093\u0093\u0083\u0092\u0091\u0084\u0090\u0082\u0088\u0084", objArr22);
                    o.ea.f.c(strIntern, ((String) objArr22[0]).intern());
                }
                operationCallback.onSuccess(null);
                int i52 = f24566h + 107;
                f24567i = i52 % 128;
                int i62 = i52 % 2;
            }
        }, o.en.b.c());
        o.i.d dVar2 = new o.i.d();
        Object[] objArr3 = new Object[1];
        z("巯둞魤牶垸ં㲳忧\uddfeⵑ닌\u0a52쩴圏얾홆՛乌", 17 - KeyEvent.keyCodeFromString(""), objArr3);
        eVar.a(dVar2, ((String) objArr3[0]).intern(), cVar, dVar, this);
        int i8 = f24531u + 55;
        f24533w = i8 % 128;
        int i9 = i8 % 2;
    }

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = (~((~i2) | i4)) | (~((-1) - (((-1) - i4) & ((-1) - i3))));
        int i9 = (~i4) | (~i3);
        int i10 = (-1) - (((-1) - i8) & ((-1) - (~((i9 + i2) - (i9 & i2)))));
        int i11 = (-1) - (((-1) - (~i9)) & ((-1) - i2));
        int i12 = ~((i3 + i2) - (i3 & i2));
        int i13 = i2 + i4 + i5 + ((-417414852) * i6) + (1247522396 * i7);
        int i14 = i13 * i13;
        int i15 = (i2 * (-1219797419)) + 1526988800 + ((-1219797419) * i4) + (825712212 * i10) + ((-1651424424) * i11) + ((-825712212) * i12) + ((-2045509632) * i5) + ((-2135949312) * i6) + ((-953155584) * i7) + ((-430374912) * i14);
        int i16 = ((i2 * 184508743) - 476012450) + (i4 * 184508743) + (i10 * (-996)) + (i11 * 1992) + (i12 * 996) + (i5 * 184509739) + (i6 * (-953474796)) + (i7 * (-288057996)) + (i14 * (-839712768));
        int i17 = i15 + (i16 * i16 * 1709113344);
        return i17 != 1 ? i17 != 2 ? a(objArr) : e(objArr) : b(objArr);
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        h hVar = (h) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24531u + 65;
        f24533w = i3 % 128;
        int i4 = i3 % 2;
        e eVar = hVar.f24537k;
        if (i4 == 0) {
            return eVar;
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{45, 113, 111, 122};
        $$b = 66;
    }

    static void o() {
        f24530r = (char) 32103;
        f24534x = (char) 16775;
        f24535y = (char) 61966;
        f24532v = (char) 8925;
    }

    private static void z(String str, int i2, Object[] objArr) throws Throwable {
        String str2 = str;
        int i3 = 2 % 2;
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        g gVar = new g();
        char[] cArr2 = new char[cArr.length];
        gVar.f19924d = 0;
        char[] cArr3 = new char[2];
        while (gVar.f19924d < cArr.length) {
            int i4 = $10 + 77;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[0] = cArr[gVar.f19924d];
            cArr3[1] = cArr[gVar.f19924d + 1];
            int i6 = $11 + 125;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            for (int i9 = 0; i9 < 16; i9++) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i8) ^ ((c3 << 4) + ((char) (((long) f24535y) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f24532v)};
                    Object objA = o.d.d.a(1603517628);
                    if (objA == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objA = o.d.d.a(View.combineMeasuredStates(0, 0) + 270, (char) ((-1) - Process.getGidForName("")), Color.argb(0, 0, 0, 0) + 11, -1995022631, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) f24530r) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f24534x)};
                    Object objA2 = o.d.d.a(1603517628);
                    if (objA2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objA2 = o.d.d.a(270 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (KeyEvent.getMaxKeyCode() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 11, -1995022631, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
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
                byte b6 = (byte) 0;
                byte b7 = b6;
                objA3 = o.d.d.a(TextUtils.getOffsetAfter("", 0) + 270, (char) TextUtils.getOffsetAfter("", 0), AndroidCharacter.getMirror('0') - '%', -2074123590, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objA3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f24531u + 79;
        int i4 = i3 % 128;
        f24533w = i4;
        int i5 = i3 % 2;
        String str = this.f24536g;
        int i6 = i4 + 77;
        f24531u = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String b() {
        int i2 = 2 % 2;
        int i3 = f24531u + 125;
        int i4 = i3 % 128;
        f24533w = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.f24539m;
        int i5 = i4 + 99;
        f24531u = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final void b(Context context, o.er.i iVar, d dVar, OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24531u + 103;
        f24533w = i3 % 128;
        int i4 = i3 % 2;
        int i5 = f24529j * (-1456136215);
        f24529j = i5;
        int i6 = f24527h * 389977318;
        f24527h = i6;
        int i7 = f24528i * (-407821031);
        f24528i = i7;
        int i8 = f24526f * (-2143292461);
        f24526f = i8;
        if (((e) c(-1791483773, i5, 1791483775, i6, new Object[]{this}, i7, i8)) != e.f24572c) {
            WalletValidationErrorCode walletValidationErrorCode = WalletValidationErrorCode.WrongState;
            Object[] objArr = new Object[1];
            z("ﺶⴢ፻ﹾ쑚\uf21e㶱즵䴍宒ᄫ嚰䈤䂛瓠봍뾌廽", TextUtils.indexOf((CharSequence) "", '0', 0) + 18, objArr);
            throw new WalletValidationException(walletValidationErrorCode, ((String) objArr[0]).intern());
        }
        b(context, e.c.f20673c, iVar, dVar, operationCallback);
        int i9 = f24531u + 117;
        f24533w = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    public final e c() {
        int i2 = (-1456136215) * f24529j;
        f24529j = i2;
        int i3 = f24527h * 389977318;
        f24527h = i3;
        int i4 = f24528i * (-407821031);
        f24528i = i4;
        int i5 = f24526f * (-2143292461);
        f24526f = i5;
        return (e) c(-1791483773, i2, 1791483775, i3, new Object[]{this}, i4, i5);
    }

    public final m c(j jVar, d dVar, o.eb.e eVar) {
        int i2 = 2 % 2;
        m mVar = new m(jVar.b(), dVar, jVar.c(), eVar, this);
        int i3 = f24533w + 17;
        f24531u = i3 % 128;
        if (i3 % 2 != 0) {
            return mVar;
        }
        throw null;
    }

    public final String d() {
        int i2 = 2 % 2;
        int i3 = f24533w + 19;
        int i4 = i3 % 128;
        f24531u = i4;
        int i5 = i3 % 2;
        String str = this.f24540n;
        int i6 = i4 + 121;
        f24533w = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 61 / 0;
        }
        return str;
    }

    public final p d(o.er.i iVar, d dVar) {
        int i2 = 2 % 2;
        p pVar = new p(iVar.b(), dVar, iVar.c(), this);
        int i3 = f24533w + 91;
        f24531u = i3 % 128;
        if (i3 % 2 != 0) {
            return pVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void d(Context context, o.er.i iVar, d dVar, OperationCallback<Void> operationCallback) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f24533w + 113;
        f24531u = i3 % 128;
        int i4 = i3 % 2;
        b(context, e.c.f20675e, iVar, dVar, operationCallback);
        int i5 = f24533w + 75;
        f24531u = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void d(e eVar) {
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i3 = f24524d * (-1038625529);
        f24524d = i3;
        int i4 = f24525e * 1286687698;
        f24525e = i4;
        c(1046956277, i2, -1046956276, iMaxMemory, new Object[]{this, eVar}, i3, i4);
    }

    public final String e() {
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i2 = f24523c * (-1159367798);
        f24523c = i2;
        int i3 = f24521a * 1358326175;
        f24521a = i3;
        int i4 = f24522b * 1587957066;
        f24522b = i4;
        return (String) c(173556768, elapsedCpuTime, -173556768, i2, new Object[]{this}, i3, i4);
    }

    public final void e(Context context, o.er.i iVar, d dVar, OperationCallback<Void> operationCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        d(iVar, dVar).a(context, new o.x.f() { // from class: o.ep.h.4

            /* JADX INFO: renamed from: a */
            public static int f24549a = 1533933122;

            /* JADX INFO: renamed from: b */
            public static int f24550b = 13195615;

            /* JADX INFO: renamed from: c */
            public static int f24551c = 1031358598;

            /* JADX INFO: renamed from: d */
            public static int f24552d = 953120048;

            /* JADX INFO: renamed from: e */
            public static int f24553e = 1237106632;

            /* JADX INFO: renamed from: g */
            public static int f24554g = 2108665305;

            /* JADX INFO: renamed from: h */
            public static int f24555h = -590008810;

            /* JADX INFO: renamed from: i */
            public static int f24556i = -635774601;

            /* JADX INFO: renamed from: j */
            public static int f24557j = 1698624876;

            /* JADX INFO: renamed from: n */
            private static int f24558n = 1;

            /* JADX INFO: renamed from: o */
            private static int f24559o = 0;

            /* JADX INFO: renamed from: f */
            private /* synthetic */ OperationCallback f24560f;

            AnonymousClass4(OperationCallback operationCallback2) {
                operationCallback = operationCallback2;
            }

            private static /* synthetic */ Object a(Object[] objArr) {
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) objArr[0];
                int i22 = 2 % 2;
                int i3 = f24558n;
                int i4 = (i3 & 77) + ((-1) - (((-1) - i3) & ((-1) - 77)));
                f24559o = i4 % 128;
                int i5 = i4 % 2;
                operationCallback.onSuccess(null);
                int i6 = f24558n;
                int i7 = ((-1) - (((-1) - i6) | ((-1) - 55))) + (i6 | 55);
                f24559o = i7 % 128;
                if (i7 % 2 == 0) {
                    return null;
                }
                throw null;
            }

            private static /* synthetic */ Object b(Object[] objArr) {
                int i22 = 2 % 2;
                int i3 = f24559o + 1;
                f24558n = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }

            public static /* synthetic */ Object e(Object[] objArr, int i22, int i3, int i4, int i5, int i6, int i7) {
                int i8 = ~i3;
                int i9 = ~i4;
                int i10 = ~(i8 | i9 | i7);
                int i11 = ~i7;
                int i12 = (~((-1) - (((-1) - i8) & ((-1) - i11)))) | (~(((-1) - (((-1) - i9) & ((-1) - i3))) | i7));
                int i13 = (~((i7 + i8) - (i7 & i8))) | (~((i9 + i11) - (i9 & i11)));
                int i14 = i3 + i4 + i5 + ((-1255669517) * i22) + (533247121 * i6);
                int i15 = i14 * i14;
                int i16 = ((i3 * (-1895547823)) - 858849280) + ((-1895547823) * i4) + (i10 * (-204618832)) + (i12 * (-204618832)) + ((-204618832) * i13) + ((-2100166656) * i5) + (760610816 * i22) + ((-1057882112) * i6) + (1344208896 * i15);
                int i17 = ((i3 * (-122328301)) - 2132886715) + (i4 * (-122328301)) + (i10 * 272) + (i12 * 272) + (i13 * 272) + (i5 * (-122328029)) + (i22 * (-1196579527)) + (i6 * 656595923) + (i15 * 138215424);
                int i18 = i16 + (i17 * i17 * (-833028096));
                if (i18 != 1) {
                    return i18 != 2 ? b(objArr) : a(objArr);
                }
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) objArr[0];
                int i19 = 2 % 2;
                operationCallback.onError(new o.by.c(AntelopErrorCode.CustomerAuthenticationImpossible).a());
                int i20 = f24558n;
                int i21 = ((115 | i20) << 1) - (i20 ^ 115);
                f24559o = i21 % 128;
                int i222 = i21 % 2;
                return null;
            }

            @Override // o.x.f
            public final void onAuthenticationDeclined() {
                int i22 = f24553e * 1149540579;
                f24553e = i22;
                int i3 = f24550b * 1802307827;
                f24550b = i3;
                int i4 = f24551c * 1644858706;
                f24551c = i4;
                e(new Object[]{this}, i4, 480280557, -480280557, i3, (int) Process.getElapsedCpuTime(), i22);
            }

            @Override // o.x.f
            public final void onCustomerCredentialsInvalid(o.j.b bVar) {
                int i22 = 2 % 2;
                int i3 = f24559o;
                int i4 = (i3 ^ 83) + (((-1) - (((-1) - i3) | ((-1) - 83))) << 1);
                f24558n = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // o.x.f
            public final void onCustomerCredentialsRequired(List<o.m.h> list) {
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i22 = f24552d * (-1149566266);
                f24552d = i22;
                int id = (int) Thread.currentThread().getId();
                int i3 = f24556i * (-1541327924);
                f24556i = i3;
                e(new Object[]{this, list}, id, -1353300951, 1353300952, i22, i3, iFreeMemory);
            }

            @Override // o.x.f
            public final void onError(o.by.c cVar) {
                int i22 = 2 % 2;
                int i3 = f24559o;
                int i4 = ((77 | i3) << 1) - (i3 ^ 77);
                f24558n = i4 % 128;
                if (i4 % 2 != 0) {
                    operationCallback.onError(cVar.a());
                    return;
                }
                operationCallback.onError(cVar.a());
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // o.x.f
            public final void onProcessStart() {
                int i22 = 2 % 2;
                int i3 = f24549a * 47771832;
                f24549a = i3;
                int i4 = ~i3;
                int i5 = 470369790 ^ i4;
                int i6 = i4 & 470369790;
                int i7 = ~((i6 + i5) - (i6 & i5));
                int i8 = (1052630881 - (~(-(-(((-1) - (((-1) - ((i7 - 1709603905) - (i7 | (-1709603905)))) & ((-1) - ((-1709603905) ^ i7)))) * (-865)))))) + ((~((-1) - (((-1) - ((-470369791) ^ i3)) & ((-1) - (((-470369791) + i3) - ((-470369791) | i3)))))) * 865);
                int i9 = ~i3;
                int i10 = ~((-1) - (((-1) - (((-1709603905) + i9) - ((-1709603905) | i9))) & ((-1) - ((-1709603905) ^ i9))));
                int i11 = ~((i9 & (-470369791)) | (i9 ^ (-470369791)));
                int i12 = i10 ^ i11;
                int i13 = (i11 + i10) - (i11 | i10);
                int i14 = (i8 - (~(-(-(((i13 + i12) - (i13 & i12)) * 865))))) - 1;
                int iIdentityHashCode = System.identityHashCode(this);
                int i15 = ~iIdentityHashCode;
                int i16 = (~((-1) - (((-1) - (586729898 ^ i15)) & ((-1) - ((586729898 + i15) - (586729898 | i15)))))) | 13631874;
                int i17 = (-586729899) ^ iIdentityHashCode;
                int i18 = (-586729899) & iIdentityHashCode;
                int i19 = ~((i18 + i17) - (i18 & i17));
                int i20 = (((-1) - (((-1) - i16) | ((-1) - i19))) | (i16 ^ i19)) * (-338);
                int i21 = ((1008130369 + i20) - (1008130369 | i20)) + ((-1) - (((-1) - i20) & ((-1) - 1008130369)));
                int i222 = (i21 ^ (-848987078)) + (((-1) - (((-1) - (-848987078)) | ((-1) - i21))) << 1);
                int i23 = ~((i15 + 586729898) - (i15 & 586729898));
                int i24 = ~((-1) - (((-1) - (iIdentityHashCode & (-573098025))) & ((-1) - ((-573098025) ^ iIdentityHashCode))));
                int i25 = i23 ^ i24;
                int i26 = (-1) - (((-1) - i24) | ((-1) - i23));
                int i27 = ((i26 + i25) - (i26 & i25)) * ExifDirectoryBase.TAG_EXTRA_SAMPLES;
                if (i14 <= (((-1) - (((-1) - i222) & ((-1) - i27))) << 1) - (i27 ^ i222)) {
                    throw null;
                }
            }

            @Override // o.x.f
            public final void onProcessSuccess() {
                int iMyPid = Process.myPid();
                int i22 = f24555h * (-919140414);
                f24555h = i22;
                int i3 = f24557j * 1930643972;
                f24557j = i3;
                int i4 = f24554g * 589413900;
                f24554g = i4;
                e(new Object[]{this}, i3, 1523467044, -1523467042, i22, i4, iMyPid);
            }
        });
        int i3 = f24531u + 29;
        f24533w = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 42 / 0;
        }
    }

    public final Date f() {
        int i2 = 2 % 2;
        int i3 = f24533w + 57;
        f24531u = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f24543q;
        }
        throw null;
    }

    public final String g() {
        int i2 = 2 % 2;
        int i3 = f24533w + 55;
        f24531u = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f24545t;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String h() {
        int i2 = 2 % 2;
        int i3 = f24533w;
        int i4 = i3 + 63;
        f24531u = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f24542p;
        int i6 = i3 + 59;
        f24531u = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final Integer i() {
        Integer num;
        int i2 = 2 % 2;
        int i3 = f24531u + 49;
        int i4 = i3 % 128;
        f24533w = i4;
        if (i3 % 2 != 0) {
            num = this.f24544s;
            int i5 = 14 / 0;
        } else {
            num = this.f24544s;
        }
        int i6 = i4 + 115;
        f24531u = i6 % 128;
        if (i6 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Date j() {
        int i2 = 2 % 2;
        int i3 = f24531u;
        int i4 = i3 + 37;
        f24533w = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Date date = this.f24538l;
        int i5 = i3 + 79;
        f24533w = i5 % 128;
        int i6 = i5 % 2;
        return date;
    }
}
