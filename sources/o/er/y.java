package o.er;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imageutils.JfifUtil;
import fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControl;
import fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControls;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import o.eo.e;

/* JADX INFO: loaded from: classes6.dex */
public final class y extends h {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f25262b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f25263c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f25264d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static char f25265e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f25266f = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f25267j = 0;

    /* JADX INFO: renamed from: o.er.y$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25268a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f25269d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f25270e = 1;

        static {
            int[] iArr = new int[o.ex.c.values().length];
            f25268a = iArr;
            try {
                iArr[o.ex.c.f25549d.ordinal()] = 1;
                int i2 = f25269d + 51;
                f25270e = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 4 / 5;
                } else {
                    int i4 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25268a[o.ex.c.f25550e.ordinal()] = 2;
                int i5 = f25270e;
                int i6 = (((-1) - (((-1) - i5) & ((-1) - 1))) << 1) - (i5 ^ 1);
                f25269d = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25268a[o.ex.c.f25546a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25268a[o.ex.c.f25547b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25268a[o.ex.c.f25548c.ordinal()] = 5;
                int i8 = f25270e;
                int i9 = (((-1) - (((-1) - i8) & ((-1) - 47))) << 1) - (i8 ^ 47);
                f25269d = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 2 % 2;
                }
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25268a[o.ex.c.f25553h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25268a[o.ex.c.f25555j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25268a[o.ex.c.f25552g.ordinal()] = 8;
                int i11 = f25269d;
                int i12 = (i11 & 91) + (i11 | 91);
                f25270e = i12 % 128;
                int i13 = i12 % 2;
                int i14 = 2 % 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f25268a[o.ex.c.f25554i.ordinal()] = 9;
                int i15 = f25269d + 25;
                f25270e = i15 % 128;
                if (i15 % 2 != 0) {
                    int i16 = 2 % 2;
                }
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f25268a[o.ex.c.f25551f.ordinal()] = 10;
                int i17 = 2 % 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f25268a[o.ex.c.f25558m.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f25268a[o.ex.c.f25556k.ordinal()] = 12;
                int i18 = 2 % 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f25268a[o.ex.c.f25557l.ordinal()] = 13;
                int i19 = 2 % 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f25268a[o.ex.c.f25560o.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f25268a[o.ex.c.f25559n.ordinal()] = 15;
                int i20 = f25269d;
                int i21 = ((-1) - (((-1) - i20) | ((-1) - PanasonicMakernoteDirectory.TAG_BURST_SPEED))) + (i20 | PanasonicMakernoteDirectory.TAG_BURST_SPEED);
                f25270e = i21 % 128;
                int i22 = i21 % 2;
                int i23 = 2 % 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f25268a[o.ex.c.f25562q.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f25268a[o.ex.c.f25564s.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f25268a[o.ex.c.f25565t.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f25268a[o.ex.c.f25563r.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f25268a[o.ex.c.f25561p.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f25268a[o.ex.c.f25570y.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f25268a[o.ex.c.f25567v.ordinal()] = 22;
                int i24 = f25269d + 77;
                f25270e = i24 % 128;
                int i25 = i24 % 2;
                int i26 = 2 % 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f25268a[o.ex.c.f25566u.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f25268a[o.ex.c.f25569x.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f25268a[o.ex.c.f25568w.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f25268a[o.ex.c.B.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f25268a[o.ex.c.A.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: o.er.y$5, reason: invalid class name */
    public class AnonymousClass5 implements e.d<o.ex.b<?>> {
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
        public static int E = 0;
        public static int F = 0;
        public static int G = 0;
        public static int H = 0;
        public static int I = 0;
        public static int J = 0;
        public static int K = 0;
        public static int L = 0;
        public static int M = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static char[] f25271a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static char f25272b = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f25273f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f25274g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int[] f25275h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f25276i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static int f25277j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static int f25278k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static int f25279l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static int f25280m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static int f25281n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static int f25282o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static int f25283p = 0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static int f25284q = 0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static int f25285r = 0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static int f25286s = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static int f25287t = 0;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static int f25288u = 0;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static int f25289v = 0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static int f25290w = 0;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static int f25291x = 0;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static int f25292y = 0;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static int f25293z = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ OperationCallback f25294c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ o.eo.e f25295d;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:5:0x0012). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(byte r9, byte r10, short r11) {
            /*
                int r8 = r11 + 4
                int r0 = r9 * 3
                int r7 = r0 + 1
                int r6 = 121 - r10
                byte[] r5 = o.er.y.AnonymousClass5.$$c
                byte[] r4 = new byte[r7]
                r3 = 0
                if (r5 != 0) goto L26
                r0 = r6
                r2 = r3
                r6 = r7
            L12:
                int r6 = r6 + r0
                r1 = r2
            L14:
                int r8 = r8 + 1
                byte r0 = (byte) r6
                int r2 = r1 + 1
                r4[r1] = r0
                if (r2 != r7) goto L23
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4, r3)
                return r0
            L23:
                r0 = r5[r8]
                goto L12
            L26:
                r1 = r3
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.y.AnonymousClass5.$$e(byte, byte, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            M = -1731977715;
            L = 295693410;
            K = -716763617;
            J = -1906725309;
            I = -1700412733;
            H = 192494988;
            G = 1770900040;
            F = 740487534;
            E = -154699469;
            D = -1587392681;
            C = 1595628892;
            B = -597246486;
            A = 507143337;
            f25293z = 1539938965;
            f25292y = -1235811997;
            f25291x = 1487950247;
            f25290w = -16173833;
            f25289v = 249213001;
            f25288u = 87130500;
            f25287t = -654923647;
            f25286s = -1623976376;
            f25285r = 1556137194;
            f25284q = -782153553;
            f25283p = 714109590;
            f25282o = 630369984;
            f25281n = 1918720133;
            f25280m = 1874256575;
            f25279l = -1030821920;
            f25278k = -1315375585;
            f25277j = 557294270;
            f25273f = 1087086702;
            init$0();
            f25274g = 0;
            f25276i = 1;
            f25271a = new char[]{64577, 64607, 64586, 64597, 65466, 64589, 64634, 64584, 64580, 64531, 64605, 64592, 64604, 64594, 64520, 64579, 64583, 64595, 65467, 64598, 65469, 64582, 64588, 65465, 64587, 64585, 64522, 65468, 64590, 65471, 64576, 64523, 64578, 64599, 65470, 64593};
            f25272b = (char) 51641;
            f25275h = new int[]{-1426320985, -1083021281, 717404196, -1737316195, -141774414, -2104736440, 433735033, 1018288679, -1921787626, -759760544, -271620144, -1874420511, 766609954, 1427471269, 1412691894, -1564622015, 949247691, 1284812026};
        }

        AnonymousClass5(o.eo.e eVar, OperationCallback operationCallback) {
            this.f25295d = eVar;
            this.f25294c = operationCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:5:0x0015). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void N(int r8, int r9, byte r10, java.lang.Object[] r11) {
            /*
                int r2 = r8 * 3
                int r1 = 1 - r2
                byte[] r8 = o.er.y.AnonymousClass5.$$a
                int r0 = r9 * 2
                int r7 = 4 - r0
                int r0 = r10 + 97
                byte[] r6 = new byte[r1]
                r5 = 0
                int r4 = 0 - r2
                if (r8 != 0) goto L2d
                r3 = r4
                r2 = r5
            L15:
                int r7 = r7 + 1
                int r0 = -r0
                int r0 = r0 + r3
            L19:
                byte r1 = (byte) r0
                r6[r2] = r1
                if (r2 != r4) goto L26
                java.lang.String r0 = new java.lang.String
                r0.<init>(r6, r5)
                r11[r5] = r0
                return
            L26:
                int r2 = r2 + 1
                r1 = r8[r7]
                r3 = r0
                r0 = r1
                goto L15
            L2d:
                r2 = r5
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.y.AnonymousClass5.N(int, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0157  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void O(int r29, java.lang.String r30, byte r31, java.lang.Object[] r32) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 918
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.y.AnonymousClass5.O(int, java.lang.String, byte, java.lang.Object[]):void");
        }

        private static void P(int[] iArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            o.a.l lVar = new o.a.l();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = f25275h;
            long j2 = 0;
            int i4 = 989264422;
            char c2 = '0';
            int i5 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                        Object objA = o.d.d.a(i4);
                        if (objA == null) {
                            byte b2 = (byte) i5;
                            byte b3 = b2;
                            objA = o.d.d.a((SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1)) + 674, (char) ((-1) - TextUtils.lastIndexOf("", c2, i5)), 13 - (ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)), -328001469, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr3[i6] = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
                        i6++;
                        j2 = 0;
                        i4 = 989264422;
                        c2 = '0';
                        i5 = 0;
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
            int[] iArr5 = f25275h;
            float f2 = 0.0f;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i7 = 0;
                while (i7 < length3) {
                    int i8 = $11 + 39;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        Object[] objArr3 = {Integer.valueOf(iArr5[i7])};
                        Object objA2 = o.d.d.a(989264422);
                        if (objA2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objA2 = o.d.d.a(674 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((AudioTrack.getMaxVolume() > f2 ? 1 : (AudioTrack.getMaxVolume() == f2 ? 0 : -1)) - 1), 11 - TextUtils.lastIndexOf("", '0', 0, 0), -328001469, false, $$e(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i7] = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
                    } else {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i7])};
                        Object objA3 = o.d.d.a(989264422);
                        if (objA3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objA3 = o.d.d.a((ViewConfiguration.getTapTimeout() >> 16) + 675, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 12, -328001469, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE});
                        }
                        iArr6[i7] = ((Integer) ((Method) objA3).invoke(null, objArr4)).intValue();
                        i7++;
                    }
                    f2 = 0.0f;
                }
                iArr5 = iArr6;
            }
            char c3 = 0;
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            lVar.f19941d = 0;
            while (lVar.f19941d < iArr.length) {
                cArr[c3] = (char) (iArr[lVar.f19941d] >> 16);
                cArr[1] = (char) iArr[lVar.f19941d];
                cArr[2] = (char) (iArr[lVar.f19941d + 1] >> 16);
                cArr[3] = (char) iArr[lVar.f19941d + 1];
                lVar.f19942e = (cArr[0] << 16) + cArr[1];
                lVar.f19940a = (cArr[2] << 16) + cArr[3];
                o.a.l.a(iArr4);
                int i9 = 0;
                for (int i10 = 16; i9 < i10; i10 = 16) {
                    int i11 = $10 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        lVar.f19942e ^= iArr4[i9];
                        Object[] objArr5 = {lVar, Integer.valueOf(o.a.l.e(lVar.f19942e)), lVar, lVar};
                        Object objA4 = o.d.d.a(2098218801);
                        if (objA4 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 + 2);
                            objA4 = o.d.d.a(301 - KeyEvent.normalizeMetaState(0), (char) (52697 - (ViewConfiguration.getScrollBarSize() >> 8)), 11 - (ViewConfiguration.getScrollBarSize() >> 8), -1416256172, false, $$e(b8, b9, (byte) (b9 - 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        lVar.f19942e = lVar.f19940a;
                        lVar.f19940a = iIntValue;
                        i9 += 74;
                    } else {
                        lVar.f19942e ^= iArr4[i9];
                        Object[] objArr6 = {lVar, Integer.valueOf(o.a.l.e(lVar.f19942e)), lVar, lVar};
                        Object objA5 = o.d.d.a(2098218801);
                        if (objA5 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = (byte) (b10 + 2);
                            objA5 = o.d.d.a(TextUtils.indexOf((CharSequence) "", '0', 0) + 302, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 52697), 11 - KeyEvent.getDeadChar(0, 0), -1416256172, false, $$e(b10, b11, (byte) (b11 - 3)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objA5).invoke(null, objArr6)).intValue();
                        lVar.f19942e = lVar.f19940a;
                        lVar.f19940a = iIntValue2;
                        i9++;
                    }
                    int i12 = $11 + 75;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                }
                int i14 = lVar.f19942e;
                lVar.f19942e = lVar.f19940a;
                lVar.f19940a = i14;
                lVar.f19940a ^= iArr4[16];
                lVar.f19942e ^= iArr4[17];
                int i15 = lVar.f19942e;
                int i16 = lVar.f19940a;
                cArr[0] = (char) (lVar.f19942e >>> 16);
                cArr[1] = (char) lVar.f19942e;
                cArr[2] = (char) (lVar.f19940a >>> 16);
                cArr[3] = (char) lVar.f19940a;
                o.a.l.a(iArr4);
                cArr2[lVar.f19941d * 2] = cArr[0];
                cArr2[(lVar.f19941d * 2) + 1] = cArr[1];
                cArr2[(lVar.f19941d * 2) + 2] = cArr[2];
                cArr2[(lVar.f19941d * 2) + 3] = cArr[3];
                Object[] objArr7 = {lVar, lVar};
                Object objA6 = o.d.d.a(986820978);
                if (objA6 == null) {
                    int doubleTapTimeout = 229 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    char threadPriority = (char) (51004 - ((Process.getThreadPriority(0) + 20) >> 6));
                    int i17 = 9 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte length4 = (byte) $$c.length;
                    objA6 = o.d.d.a(doubleTapTimeout, threadPriority, i17, -330018025, false, $$e((byte) 0, length4, (byte) (length4 - 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA6).invoke(null, objArr7);
                c3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x0d6a, code lost:
        
            if (r0 == false) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x0d6c, code lost:
        
            r4 = new java.lang.Object[4];
            r2 = new int[r3];
            r4[r5] = r2;
            r1 = new int[r3];
            r4[r3] = r1;
            r3 = new int[r3];
            r4[3] = r3;
            r1[r5] = r16;
            r2[r5] = r16 ^ 260;
            r4[2] = null;
            r6 = o.er.y.AnonymousClass5.I * (-1032362825);
            o.er.y.AnonymousClass5.I = r6;
            r5 = ~r6;
            r2 = (((1922978130 + (yg.Zl.Yd(~yg.Zl.Xd(1296011370, r5), 583034512) * 184)) + (yg.Zl.Kd(r6, 1142652930) * (-184))) + ((~yg.Zl.Xd(-736392953, r5)) * 184)) - 309313436;
            r1 = (r2 << 13) ^ r2;
            r1 = r1 ^ (r1 >>> 17);
            r3[0] = r1 ^ (r1 << 5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x0dd1, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x0dd2, code lost:
        
            r5 = 0;
            r0 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x0dd5, code lost:
        
            r16 = r32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x0dd7, code lost:
        
            r1 = new java.lang.Object[1];
            O(8 - android.text.TextUtils.indexOf("", "", 0), "\u0006\u0002\f\n\u0018\"\r\u0012", (byte) (56 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1))), r1);
            r0 = new java.lang.Object[1];
            P(new int[]{-908139931, 109671088, -829097506, 346664790}, 6 - android.text.TextUtils.indexOf("", "", 0, 0), r0);
            r1 = new java.lang.Object[1];
            O(android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 8, "\u0001\u0006\u0007\u0017\u001f\"㘀", (byte) (1 - android.os.Process.getGidForName("")), r1);
            r1 = new java.lang.Object[1];
            O(android.view.View.MeasureSpec.getSize(0) + 9, "\u001e\u0002\r\u0016\u001f\"\f#㙊", (byte) (98 - android.view.KeyEvent.normalizeMetaState(0)), r1);
            r1 = new java.lang.Object[1];
            P(new int[]{339906357, -281593138, 482845893, 946425784}, '6' - android.text.AndroidCharacter.getMirror('0'), r1);
            r0 = new java.lang.Object[1];
            P(new int[]{-98432051, 637434974, 1556922460, -1208987553, -420013514, 1570460429, 978334779, -2006973795}, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 13, r0);
            r1 = new java.lang.Object[1];
            O((android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 4, "\u0014\u0004 \u0005㙇", (byte) (android.graphics.Color.rgb(0, 0, 0) + 16777309), r1);
            r1 = new java.lang.Object[1];
            P(new int[]{835833263, 1379664015, -1005111253, -872346348}, android.view.KeyEvent.keyCodeFromString("") + 6, r1);
            r0 = new java.lang.Object[1];
            P(new int[]{412576621, -781253327}, 2 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), r0);
            r1 = new java.lang.Object[1];
            O(15 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0), "\u001a\u0001!\u0002\u001f\"\u0014\u0017\u0017\u001f\u0001\u0019 \u000b\"\u001e", (byte) (81 - android.widget.ExpandableListView.getPackedPositionGroup(0)), r1);
            r1 = new java.lang.Object[1];
            O(10 - android.text.TextUtils.indexOf("", "", 0), "\u001a\u0001!\u001e\u000e\u0002\u0001\u001e\u0003\u001b", (byte) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44), r1);
            r0 = new java.lang.Object[1];
            P(new int[]{1190639537, 1376634650, 1350843900, -1914566128}, 9 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)), r0);
            r1 = new java.lang.Object[1];
            O(android.view.View.resolveSizeAndState(0, 0, 0) + 12, "\t\u0003\u0003\u000e\u0014\u0003㘼㘼!\u0012\u001e\u0005", (byte) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 71), r1);
            r1 = new java.lang.Object[1];
            P(new int[]{31317248, 1339100776, 402027763, -1654740505, 1521100336, -1210097878, 1478819351, 2013489499}, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 14, r1);
            r1 = new java.lang.Object[1];
            P(new int[]{1547718740, 148415507, 1071475083, 1502831025}, (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 6, r1);
            r1 = new java.lang.Object[1];
            P(new int[]{1633954593, -2017869833, 1842576162, 1193770629}, 7 - android.view.KeyEvent.keyCodeFromString(""), r1);
            r0 = new java.lang.Object[1];
            P(new int[]{1507293984, -1155050337, -2000294498, 566132500}, 7 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), r0);
            r0 = new java.lang.Object[1];
            P(new int[]{-954378090, 385747766}, android.graphics.Color.alpha(0) + 2, r0);
            r0 = new java.lang.Object[1];
            P(new int[]{-337251396, 1477898267, -1503640873, -1396120342, 1398873937, 492741243, 1713375767, 1437929263, 1720599933, -1473059776}, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 20, r0);
            r1 = new java.lang.Object[1];
            O((-16777210) - android.graphics.Color.rgb(0, 0, 0), "\u0017\u001f \t\u0012!", (byte) (73 - android.graphics.Color.alpha(0)), r1);
            r1 = new java.lang.Object[1];
            O((android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 1, "\u0017\u0007", (byte) (59 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), r1);
            r1 = new java.lang.Object[1];
            O((android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 15, "\u0014\u0007\u001c\u0012\"\u0017\u0000\u001f \u000f\u0017\u001f\u000b \u0007\u0017", (byte) (97 - android.text.TextUtils.getTrimmedLength("")), r1);
            r0 = new java.lang.Object[1];
            P(new int[]{1037710660, 588201155, 401027354, 1238971142, -453644188, -1989669664}, (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 8, r0);
            r0 = new java.lang.Object[1];
            P(new int[]{1037710660, 588201155, 401027354, 1238971142, 551237102, -2027395524}, 10 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), r0);
            r1 = new java.lang.Object[1];
            O(11 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u001e\"\t\u0014\u001f\"\u0005\b\u001e\u001f㗉", (byte) (29 - android.view.View.MeasureSpec.getSize(0)), r1);
            r0 = new java.lang.Object[1];
            P(new int[]{-1405166219, 1162972968, -892313109, 378680736, 967048801, -1046408037}, 11 - android.widget.ExpandableListView.getPackedPositionGroup(0), r0);
            r1 = new java.lang.Object[1];
            O((android.os.Process.myTid() >> 22) + 15, "\u0006\u001d\u0010\u0013\u001e\u0006\t\u001e\u001f!\n\u0012\u001b\f㘤", (byte) (android.graphics.Color.rgb(0, 0, 0) + 16777263), r1);
            r0 = new java.lang.Object[1];
            P(new int[]{-1405166219, 1162972968, 1431204613, 2129291656, -2032778190, -1842038147, 255125086, 1120308490}, 14 - android.graphics.Color.red(0), r0);
            r14 = new java.lang.String[]{((java.lang.String) r1[0]).intern(), ((java.lang.String) r0[0]).intern(), ((java.lang.String) r1[0]).intern(), ((java.lang.String) r1[0]).intern(), ((java.lang.String) r1[0]).intern(), ((java.lang.String) r0[0]).intern(), ((java.lang.String) r1[0]).intern(), ((java.lang.String) r1[0]).intern(), ((java.lang.String) r0[0]).intern(), ((java.lang.String) r1[0]).intern(), ((java.lang.String) r1[0]).intern(), ((java.lang.String) r0[0]).intern(), ((java.lang.String) r1[0]).intern(), ((java.lang.String) r1[0]).intern(), ((java.lang.String) r1[0]).intern(), ((java.lang.String) r1[0]).intern(), ((java.lang.String) r0[0]).intern(), ((java.lang.String) r0[0]).intern(), ((java.lang.String) r0[0]).intern(), ((java.lang.String) r1[0]).intern(), ((java.lang.String) r1[0]).intern(), ((java.lang.String) r1[0]).intern(), ((java.lang.String) r0[0]).intern(), ((java.lang.String) r0[0]).intern(), ((java.lang.String) r1[0]).intern(), ((java.lang.String) r0[0]).intern(), ((java.lang.String) r1[0]).intern(), ((java.lang.String) r0[0]).intern()};
            r1 = new java.lang.Object[1];
            O(11 - android.text.TextUtils.getOffsetBefore("", 0), " \u0003#\u0001\t \u0001\f\t 㙔", (byte) ((android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 84), r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x1225, code lost:
        
            r2 = new java.lang.Object[]{((java.lang.String) r1[0]).intern()};
            r1 = o.d.d.a(785142162);
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x1230, code lost:
        
            if (r1 != null) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x1232, code lost:
        
            r6 = ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 301;
            r7 = (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52697);
            r8 = 11 - android.view.View.MeasureSpec.getMode(0);
            r4 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r3 = r4;
            r0 = new java.lang.Object[1];
            N(r4, r3, (byte) (r3 + 2), r0);
            r1 = o.d.d.a(r6, r7, r8, -129387529, false, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x1272, code lost:
        
            r4 = (java.lang.String) ((java.lang.reflect.Method) r1).invoke(null, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x127b, code lost:
        
            if (r4 == null) goto L166;
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x127d, code lost:
        
            r1 = new java.lang.Object[1];
            O(6 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), " \t\u001b\u0012\u000b\u0011", (byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 126), r1);
            r0 = new java.lang.Object[1];
            P(new int[]{-1308683636, 2023190924, 1980372793, 1457495432}, android.graphics.Color.rgb(0, 0, 0) + 16777224, r0);
            r3 = new java.lang.String[]{((java.lang.String) r1[0]).intern(), ((java.lang.String) r0[0]).intern()};
            r1 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x12cf, code lost:
        
            if (r1 >= 2) goto L543;
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x12d7, code lost:
        
            if (r4.contains(r3[r1]) == false) goto L117;
         */
        /* JADX WARN: Code restructure failed: missing block: B:116:0x12d9, code lost:
        
            r1 = new java.lang.Object[1];
            O(23 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), " \u0003!\u0001 \u0003\u0005\u0006\u0017!\u0001\r\u0006\u001a\t\u0011\t\u0014\u0005\u0011\"\u001f㘘", (byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 48), r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x12fd, code lost:
        
            r1 = r1 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x1300, code lost:
        
            r5 = new java.lang.Object[]{((java.lang.String) r1[0]).intern()};
            r1 = o.d.d.a(785142162);
         */
        /* JADX WARN: Code restructure failed: missing block: B:119:0x130b, code lost:
        
            if (r1 != null) goto L121;
         */
        /* JADX WARN: Code restructure failed: missing block: B:120:0x130d, code lost:
        
            r6 = 301 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
            r4 = (char) (52698 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)));
            r8 = 11 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16);
            r3 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r2 = r3;
            r0 = new java.lang.Object[1];
            N(r3, r2, (byte) (r2 + 2), r0);
            r1 = o.d.d.a(r6, r4, r8, -129387529, false, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x1351, code lost:
        
            r6 = ((java.lang.reflect.Method) r1).invoke(null, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:122:0x1358, code lost:
        
            r1 = new java.lang.Object[1];
            P(new int[]{-1061336057, -1197936168, 591091561, -1251007326, 1209185448, -1956498445, 358792124, 647953220, 682848056, -2059150293, -1773615766, 1504524520, 1491845788, 1368829099, 1474777190, 1194039406}, (android.os.Process.myTid() >> 22) + 30, r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:123:0x1376, code lost:
        
            r2 = new java.lang.Object[]{((java.lang.String) r1[0]).intern()};
            r1 = o.d.d.a(785142162);
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x1381, code lost:
        
            if (r1 != null) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x1383, code lost:
        
            r7 = (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 301;
            r8 = (char) (android.view.KeyEvent.keyCodeFromString("") + 52697);
            r9 = 11 - (android.os.Process.myTid() >> 22);
            r4 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r3 = r4;
            r0 = new java.lang.Object[1];
            N(r4, r3, (byte) (r3 + 2), r0);
            r1 = o.d.d.a(r7, r8, r9, -129387529, false, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x13c0, code lost:
        
            r15 = ((java.lang.reflect.Method) r1).invoke(null, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:127:0x13c7, code lost:
        
            if (r6 == null) goto L132;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x13c9, code lost:
        
            r5 = new java.lang.Object[]{r6, 42};
            r1 = o.d.d.a(455802643);
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x13df, code lost:
        
            if (r1 != null) goto L131;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x13e1, code lost:
        
            r6 = 593 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1));
            r4 = (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 13180);
            r8 = 11 - ((android.os.Process.getThreadPriority(0) + 20) >> 6);
            r3 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r2 = r3;
            r0 = new java.lang.Object[1];
            N(r3, r2, (byte) (r2 + 3), r0);
            r1 = o.d.d.a(r6, r4, r8, -844161674, false, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
         */
        /* JADX WARN: Code restructure failed: missing block: B:131:0x142b, code lost:
        
            r6 = ((java.lang.Long) ((java.lang.reflect.Method) r1).invoke(null, r5)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:133:0x143b, code lost:
        
            r4 = -1515408239;
            r8 = -1;
            r10 = r4 ^ r8;
            r12 = android.os.Process.myTid();
            r2 = r12 ^ r8;
            r22 = ((((long) 55) * r4) + (((long) (-107)) * r6)) + (((long) (-108)) * yg.Bu.Xd(yg.Bu.Yd(r10, r6) ^ r8, yg.Bu.Yd(r2, r6) ^ r8));
            r0 = 54;
            r17 = yg.Bu.Kd(r10, r12) ^ r8;
            r10 = yg.Bu.Xd(r6 ^ r8, r4) ^ r8;
            r22 = ((r22 + (yg.Bu.Kd(yg.Bu.Xd(r17, r10), yg.Bu.Kd(r2, r4) ^ r8) * r0)) + (r0 * yg.Bu.Yd(r12, r10))) + ((long) 1991578097);
            r6 = o.er.y.AnonymousClass5.f25279l * 346487096;
            o.er.y.AnonymousClass5.f25279l = r6;
            r5 = ~r6;
            r2 = yg.PY.Xd((int) (r22 >> 32), (((-937112115) + (yg.Zl.Kd(~yg.Zl.Yd(185492794, r5), 1622719205) * (-602))) + (yg.Zl.Yd(yg.Zl.Xd(~yg.Zl.Yd(r6, 185492794), 1622186693), ~yg.Zl.Yd(-184960283, r5)) * (-301))) + ((~yg.Zl.Yd(r5, 1622719205)) * 301));
            r7 = o.er.y.AnonymousClass5.f25280m * 54600678;
            o.er.y.AnonymousClass5.f25280m = r7;
            r6 = ~r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:134:0x153d, code lost:
        
            if (yg.Zl.Kd(r2, yg.PY.Xd((int) r22, (((-12628411) + (yg.Zl.Xd(~yg.Zl.Yd(1880356101, r6), 443129691) * (-602))) + (yg.Zl.Yd(yg.Zl.Kd(~yg.Zl.Kd(r7, 1880356101), 174590554), ~yg.Zl.Xd(-1611816965, r6)) * (-301))) + ((~yg.Zl.Kd(r6, 443129691)) * 301))) == 477111747) goto L144;
         */
        /* JADX WARN: Code restructure failed: missing block: B:135:0x153f, code lost:
        
            if (r15 == null) goto L166;
         */
        /* JADX WARN: Code restructure failed: missing block: B:137:0x1542, code lost:
        
            r2 = new java.lang.Object[]{r15, 42};
            r1 = o.d.d.a(455802643);
         */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x1557, code lost:
        
            if (r1 != null) goto L141;
         */
        /* JADX WARN: Code restructure failed: missing block: B:139:0x1559, code lost:
        
            r6 = 593 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16);
            r7 = (char) (android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 13182);
            r8 = android.text.TextUtils.indexOf("", "") + 11;
            r4 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r3 = r4;
            r0 = new java.lang.Object[1];
            N(r4, r3, (byte) (r3 + 3), r0);
            r1 = o.d.d.a(r6, r7, r8, -844161674, false, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
         */
        /* JADX WARN: Code restructure failed: missing block: B:140:0x15a0, code lost:
        
            r12 = ((java.lang.Long) ((java.lang.reflect.Method) r1).invoke(null, r2)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:142:0x15af, code lost:
        
            r6 = -237908518;
            r2 = o.er.y.AnonymousClass5.f25292y * (-1609885845);
            o.er.y.AnonymousClass5.f25292y = r2;
            r0 = -406;
            r4 = -1;
            r10 = r12 ^ r4;
            r2 = r2;
            r0 = r2 ^ r4;
            r8 = (((((((long) (-405)) * r6) + (((long) cz.msebera.android.httpclient.HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED) * r12)) + (yg.Bu.Yd(yg.Bu.Kd(r10, r2) ^ r4, yg.Bu.Yd(yg.Bu.Yd(r0, r6), r12) ^ r4) * r0)) + ((yg.Bu.Xd(yg.Bu.Xd(r10, r0), r6) ^ r4) * r0)) + (((long) cz.msebera.android.httpclient.HttpStatus.SC_NOT_ACCEPTABLE) * yg.Bu.Yd(yg.Bu.Yd(r0, r12) ^ r4, yg.Bu.Yd(r2, r6 ^ r4) ^ r4))) + ((long) 714078376);
            r5 = o.er.y.AnonymousClass5.f25281n * 1089024474;
            o.er.y.AnonymousClass5.f25281n = r5;
            r6 = ~r5;
            r2 = yg.PY.Yd((int) (r8 >> 32), ((635053406 + (yg.Zl.Yd(~yg.Zl.Xd(-5311287, r6), ~yg.Zl.Yd(-1431915125, r5)) * (-370))) + (yg.Zl.Yd(yg.Zl.Kd(~yg.Zl.Yd(r5, -5311287), ~yg.Zl.Yd(r6, -1431915125)), -1431915383) * (-370))) - 1527714302);
            r5 = (int) android.os.SystemClock.uptimeMillis();
         */
        /* JADX WARN: Code restructure failed: missing block: B:143:0x1693, code lost:
        
            if (yg.Zl.Kd(r2, yg.PY.Xd((int) r8, ((749682369 + (yg.Zl.Xd(~yg.Zl.Xd(250812481, r5), 1186413928) * (-948))) + ((~yg.Zl.Xd(~r5, 1324825961)) * (-948))) - 257530836)) != 477111747) goto L166;
         */
        /* JADX WARN: Code restructure failed: missing block: B:144:0x1695, code lost:
        
            r15 = 0;
            r26 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:146:0x169a, code lost:
        
            if (r15 >= 28) goto L545;
         */
        /* JADX WARN: Code restructure failed: missing block: B:147:0x169c, code lost:
        
            r6 = r14[r15];
            r1 = new java.lang.Object[1];
            O((android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 11, "\u0019\u0014\r\u0012\u001e\u001f\b\u0019\u0016\u001c\u0019\u001b", (byte) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 61), r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:148:0x16cc, code lost:
        
            r1 = new java.lang.Object[]{((java.lang.String) r1[0]).intern().concat(java.lang.String.valueOf(r6))};
            r2 = o.d.d.a(-754175925);
         */
        /* JADX WARN: Code restructure failed: missing block: B:149:0x16d7, code lost:
        
            if (r2 != null) goto L152;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x01a6, code lost:
        
            if (yg.Zl.Yd(r3, yg.PY.Xd((int) r17, (((-2038855459) + (yg.Zl.Yd(r1, ~yg.Zl.Xd(2011102719, r6)) * 920)) + (yg.Zl.Xd(~yg.Zl.Yd(-572151872, r6), 1724438) * 920)) + (yg.Zl.Kd(yg.Zl.Kd(~yg.Zl.Kd(-1724439, r6), ~yg.Zl.Xd(-570427434, r32)), ~yg.Zl.Yd(2011102719, r32)) * 920))) != 0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:150:0x16d9, code lost:
        
            r6 = 847 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            r7 = (char) (6488 - android.view.KeyEvent.normalizeMetaState(0));
            r8 = android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 13;
            r4 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r3 = r4;
            r0 = new java.lang.Object[1];
            N(r4, r3, r3, r0);
            r2 = o.d.d.a(r6, r7, r8, 92918318, false, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:151:0x1713, code lost:
        
            r6 = ((java.lang.Long) ((java.lang.reflect.Method) r2).invoke(null, r1)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:153:0x1722, code lost:
        
            r10 = -921092582;
            r12 = o.er.y.AnonymousClass5.f25293z * 1971471705;
            o.er.y.AnonymousClass5.f25293z = r12;
            r0 = -209;
            r24 = (r0 * r10) + (r0 * r6);
            r0 = com.drew.metadata.mp4.media.Mp4VideoDirectory.TAG_COMPRESSION_TYPE;
            r8 = -1;
            r4 = r10 ^ r8;
            r2 = r6 ^ r8;
            r24 = r24 + ((yg.Bu.Yd(r4, r2) ^ r8) * r0);
            r0 = r12;
            r12 = r0 ^ r8;
            r24 = ((r24 + (yg.Bu.Xd(yg.Bu.Xd(r2, r12) ^ r8, yg.Bu.Xd(r4, r0) ^ r8) * r0)) + (r0 * yg.Bu.Yd(yg.Bu.Yd(yg.Bu.Kd(r4, r12), r6) ^ r8, yg.Bu.Kd(yg.Bu.Kd(r2, r10), r0) ^ r8))) + ((long) (-901057583));
            r5 = (-2126936846) + (yg.Zl.Yd(-1107362177, r16) * (-676));
            r4 = ~r16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:154:0x183a, code lost:
        
            if (yg.Zl.Kd(yg.PY.Xd((int) r24, (((-1972008908) + (yg.Zl.Kd(~yg.Zl.Yd(-1262958031, r4), ~yg.Zl.Kd(-1594782856, r4)) * (-867))) + (yg.Zl.Yd(yg.Zl.Kd(~yg.Zl.Yd(-1262958031, r16), 1258697862), ~yg.Zl.Yd(-1594782856, r16)) * (-1734))) + (yg.Zl.Yd(yg.Zl.Yd(~yg.Zl.Xd(-1258697863, r4), ~yg.Zl.Xd(-4260169, r16)), ~yg.Zl.Kd(-336084994, r16)) * 867)), yg.PY.Xd((int) (r24 >> 32), (r5 + (yg.Zl.Yd(~yg.Zl.Yd(299822614, r4), 1107362176) * 676)) + (yg.Zl.Xd(yg.Zl.Xd(~yg.Zl.Kd(-1137403797, r4), 30041620), ~yg.Zl.Kd(1407184790, r16)) * 676))) != 0) goto L157;
         */
        /* JADX WARN: Code restructure failed: missing block: B:155:0x183c, code lost:
        
            r0 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:156:0x183d, code lost:
        
            r26 = r26 + r0;
            r15 = r15 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:157:0x1843, code lost:
        
            r0 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:159:0x184f, code lost:
        
            if (r26 < 25.2d) goto L165;
         */
        /* JADX WARN: Code restructure failed: missing block: B:160:0x1851, code lost:
        
            r1 = cz.msebera.android.httpclient.message.TokenParser.SP;
         */
        /* JADX WARN: Code restructure failed: missing block: B:162:0x1855, code lost:
        
            if (r1 == 'I') goto L166;
         */
        /* JADX WARN: Code restructure failed: missing block: B:163:0x1857, code lost:
        
            r3 = new java.lang.Object[]{new int[]{r16 ^ 261}, new int[]{r16}, null, new int[]{r1 ^ (r1 << 5)}};
            r5 = (-298952254) + (yg.Zl.Kd(~yg.Zl.Xd(904256921, r16), 1128147401) * 672);
            r4 = ~r16;
            r5 = ((r5 + (yg.Zl.Kd(~yg.Zl.Kd(1128147401, r16), ~yg.Zl.Xd(-904256922, r4)) * (-672))) + (yg.Zl.Yd(~yg.Zl.Xd(r4, -1128147402), 1109008448) * 672)) - 309313436;
            r1 = (r5 << 13) ^ r5;
            r1 = r1 ^ (r1 >>> 17);
         */
        /* JADX WARN: Code restructure failed: missing block: B:164:0x18cd, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:165:0x18ce, code lost:
        
            r1 = 'I';
         */
        /* JADX WARN: Code restructure failed: missing block: B:166:0x18d1, code lost:
        
            r0 = new java.lang.Object[1];
            P(new int[]{-85481412, -11714510, 133798065, -1398142320, 872336626, -567315455, -204112241, 1473813978, -2003037705, -864160229, 554606666, -687753081}, 23 - android.view.View.combineMeasuredStates(0, 0), r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:167:0x18ed, code lost:
        
            r2 = new java.lang.Object[]{((java.lang.String) r0[0]).intern()};
            r1 = o.d.d.a(570364970);
         */
        /* JADX WARN: Code restructure failed: missing block: B:168:0x18f8, code lost:
        
            if (r1 != null) goto L170;
         */
        /* JADX WARN: Code restructure failed: missing block: B:169:0x18fa, code lost:
        
            r6 = android.view.View.resolveSizeAndState(0, 0, 0) + 754;
            r7 = (char) android.graphics.Color.green(0);
            r8 = 12 - android.text.TextUtils.getCapsMode("", 0, 0);
            r4 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r0 = new java.lang.Object[1];
            N(r4, r4, (byte) o.er.y.AnonymousClass5.$$a.length, r0);
            r1 = o.d.d.a(r6, r7, r8, -142936497, false, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:170:0x1931, code lost:
        
            r6 = ((java.lang.Long) ((java.lang.reflect.Method) r1).invoke(null, r2)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:171:0x193e, code lost:
        
            r4 = -1216235725;
            r0 = -55;
            r8 = (r0 * r4) + (r0 * r6);
            r2 = 56;
            r0 = (int) android.os.SystemClock.elapsedRealtime();
            r14 = -1;
            r8 = (((r8 + (yg.Bu.Xd(yg.Bu.Yd(r4, r0) ^ r14, r6) * r2)) + (((long) (-56)) * (yg.Bu.Yd(r4, r6) ^ r14))) + (r2 * yg.Bu.Kd(yg.Bu.Yd(r6, r0 ^ r14) ^ r14, r4))) + ((long) 1531240009);
            r6 = (int) java.lang.Runtime.getRuntime().freeMemory();
            r5 = ~r6;
            r2 = yg.PY.Kd((int) (r8 >> 32), (((-1786779402) + ((~yg.Zl.Yd(1194707756, r5)) * 979)) + (yg.Zl.Xd(-1663033129, r6) * (-979))) + (yg.Zl.Xd(~yg.Zl.Xd(r6, 1194707756), ~yg.Zl.Kd(r5, -1663033129)) * 979));
            r4 = ~java.lang.Thread.activeCount();
            r0 = yg.Zl.Kd(r2, yg.PY.Kd((int) r8, ((1019428157 + (yg.Zl.Kd(~yg.Zl.Kd(r4, -17833985), ~yg.Zl.Xd(2080374254, r4)) * (-184))) + (yg.Zl.Kd(yg.Zl.Kd(312656930, ~yg.Zl.Xd(1767717324, r4)), ~yg.Zl.Xd(-330490915, r4)) * 184)) + 144012456));
            r1 = new java.lang.Object[1];
            O((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17, "\u001b\u0002 \u0003\u0014\u001b\u0012\u001f\u001b\r\u0019\u0014 \u000b\u0005\u0011㙠", (byte) (android.widget.ExpandableListView.getPackedPositionChild(0) + 120), r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:172:0x1a26, code lost:
        
            r1 = new java.lang.Object[]{((java.lang.String) r1[0]).intern()};
            r2 = o.d.d.a(570364970);
         */
        /* JADX WARN: Code restructure failed: missing block: B:173:0x1a31, code lost:
        
            if (r2 != null) goto L175;
         */
        /* JADX WARN: Code restructure failed: missing block: B:174:0x1a33, code lost:
        
            r9 = (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 11;
            r5 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r0 = new java.lang.Object[1];
            N(r5, r5, (byte) o.er.y.AnonymousClass5.$$a.length, r0);
            r2 = o.d.d.a(android.view.View.combineMeasuredStates(0, 0) + 754, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) - 1), r9, -142936497, false, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:175:0x1a70, code lost:
        
            r4 = ((java.lang.Long) ((java.lang.reflect.Method) r2).invoke(null, r1)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:176:0x1a7d, code lost:
        
            r10 = -871097515;
            r0 = (int) java.lang.Runtime.getRuntime().totalMemory();
            r12 = r10 ^ r14;
            r2 = 381;
            r6 = (((((((long) (-380)) * r10) + (((long) 382) * r4)) + (((long) (-381)) * yg.Bu.Xd(yg.Bu.Yd(r4, r0), r12))) + (yg.Bu.Xd(yg.Bu.Yd(yg.Bu.Yd(r12, r4 ^ r14) ^ r14, yg.Bu.Yd(r0 ^ r14, r4) ^ r14), yg.Bu.Kd(r10, r4) ^ r14) * r2)) + (r2 * (yg.Bu.Xd(r12, r4) ^ r14))) + ((long) 1186101799);
            r4 = new java.util.Random().nextInt(15349824);
            r1 = yg.PY.Xd((int) (r6 >> 32), (((-867972060) + ((~yg.Zl.Yd(729153446, r4)) * (-301))) + (yg.Zl.Yd(~yg.Zl.Kd(-729052967, r4), ~yg.Zl.Kd(~r4, 708173444)) * (-301))) + (yg.Zl.Xd(~yg.Zl.Kd(r4, -708173445), -729052967) * 301));
            r3 = (yg.Zl.Kd(~yg.Zl.Kd(473951521, r16), -1911177932) * 56) + 93834125;
            r0 = ~r16;
            r1 = yg.Zl.Kd(r1, yg.PY.Yd((int) r6, r3 + (yg.Zl.Xd(473951521, ~yg.Zl.Kd(-1911177932, r0)) * 56)));
         */
        /* JADX WARN: Code restructure failed: missing block: B:177:0x1b52, code lost:
        
            if (r0 <= 0) goto L184;
         */
        /* JADX WARN: Code restructure failed: missing block: B:179:0x1b56, code lost:
        
            if (r1 <= 0) goto L184;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0297, code lost:
        
            if (yg.Zl.Xd(r3, yg.PY.Yd((int) r17, (((-1770858047) + (yg.Zl.Kd(671219969, r1) * (-476))) + (r1 * 952)) + ((~yg.Zl.Xd(~r5, 2143267771)) * 476))) != 0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:181:0x1b5d, code lost:
        
            if ((r1 - 3) >= r0) goto L184;
         */
        /* JADX WARN: Code restructure failed: missing block: B:182:0x1b5f, code lost:
        
            r1 = o.er.y.AnonymousClass5.f25276i + 121;
            o.er.y.AnonymousClass5.f25274g = r1 % 128;
            r1 = r1 % 2;
            r3 = new java.lang.Object[]{new int[]{r16 ^ 247}, new int[]{r16}, null, new int[]{r1 ^ (r1 << 5)}};
            r4 = (((-872700990) + (yg.Zl.Yd(-1610769489, r0) * 184)) + (yg.Zl.Kd(~yg.Zl.Yd(261200266, r0), -1711535187) * 184)) - 309313436;
            r1 = (r4 << 13) ^ r4;
            r1 = r1 ^ (r1 >>> 17);
         */
        /* JADX WARN: Code restructure failed: missing block: B:183:0x1bc0, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:184:0x1bc1, code lost:
        
            r0 = new java.lang.Object[1];
            P(new int[]{-85481412, -11714510, 133798065, -1398142320, 872336626, -567315455, -204112241, 1473813978, -2003037705, -864160229, 554606666, -687753081}, 23 - android.graphics.Color.argb(0, 0, 0, 0), r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:185:0x1bdd, code lost:
        
            r2 = new java.lang.Object[]{((java.lang.String) r0[0]).intern()};
            r1 = o.d.d.a(570364970);
         */
        /* JADX WARN: Code restructure failed: missing block: B:186:0x1be8, code lost:
        
            if (r1 != null) goto L189;
         */
        /* JADX WARN: Code restructure failed: missing block: B:187:0x1bea, code lost:
        
            r7 = 755 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1));
            r8 = (char) android.text.TextUtils.getOffsetAfter("", 0);
            r9 = 13 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1));
            r5 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r0 = new java.lang.Object[1];
            N(r5, r5, (byte) o.er.y.AnonymousClass5.$$a.length, r0);
            r1 = o.d.d.a(r7, r8, r9, -142936497, false, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:188:0x1c27, code lost:
        
            r6 = ((java.lang.Long) ((java.lang.reflect.Method) r1).invoke(null, r2)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0299, code lost:
        
            r3 = new java.lang.Object[]{new int[]{r32 ^ 271}, new int[]{r32}, null, new int[1]};
            r4 = (((yg.Zl.Kd(~yg.Zl.Kd(-843219739, r2), 1150903360) * 501) - 590855104) + ((~yg.Zl.Xd(~new java.util.Random().nextInt(), -843219739)) * 501)) - 309313436;
            r2 = (r4 << 13) ^ r4;
            r2 = r2 ^ (r2 >>> 17);
            ((int[]) r3[3])[0] = r2 ^ (r2 << 5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:190:0x1c36, code lost:
        
            r4 = -716986594;
            r8 = -783;
            r2 = ((((long) 784) * r4) + (((long) (-782)) * r6)) + ((r6 ^ r14) * r8);
            r4 = r4 ^ r14;
            r0 = r16;
            r19 = r0 ^ r14;
            r2 = ((r2 + (r8 * (yg.Bu.Xd(yg.Bu.Xd(r4, r19), r6) ^ r14))) + (((long) 783) * yg.Bu.Kd(r4, yg.Bu.Yd(r19, r6) ^ r14))) + ((long) 1031990878);
            r6 = android.os.Process.myPid();
            r0 = ~r6;
            r0 = yg.Zl.Xd(yg.PY.Yd((int) (r2 >> 32), (((-1377673794) + (yg.Zl.Xd(~yg.Zl.Kd(2012965751, r0), ~yg.Zl.Yd(-2624102, r16)) * (-302))) + ((~yg.Zl.Xd(2012965751, r16)) * (-604))) + (yg.Zl.Yd(~yg.Zl.Xd(2010341650, r16), 570491138) * 302)), yg.PY.Kd((int) r2, ((1020437093 + (yg.Zl.Yd(~yg.Zl.Xd(r0, 413315333), yg.Zl.Kd(~yg.Zl.Yd(1850541743, r0), -2129639344)) * 464)) + (yg.Zl.Xd(-279097601, r6) * (-464))) + (yg.Zl.Xd(~yg.Zl.Yd(413315333, r6), -2129639344) * 464)));
            r1 = new java.lang.Object[1];
            O(4 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), "\u0018\u0002#\f", (byte) (57 - android.text.TextUtils.lastIndexOf("", '0')), r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:191:0x1d31, code lost:
        
            r2 = new java.lang.Object[]{((java.lang.String) r1[0]).intern()};
            r1 = o.d.d.a(570364970);
         */
        /* JADX WARN: Code restructure failed: missing block: B:192:0x1d3c, code lost:
        
            if (r1 != null) goto L195;
         */
        /* JADX WARN: Code restructure failed: missing block: B:193:0x1d3e, code lost:
        
            r6 = (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 753;
            r7 = (char) android.view.View.getDefaultSize(0, 0);
            r8 = 12 - android.text.TextUtils.getOffsetBefore("", 0);
            r5 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r0 = new java.lang.Object[1];
            N(r5, r5, (byte) o.er.y.AnonymousClass5.$$a.length, r0);
            r1 = o.d.d.a(r6, r7, r8, -142936497, false, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:194:0x1d7c, code lost:
        
            r6 = ((java.lang.Long) ((java.lang.reflect.Method) r1).invoke(null, r2)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:196:0x1d8b, code lost:
        
            r4 = -1260476132;
            r8 = o.er.y.AnonymousClass5.A * 331137740;
            o.er.y.AnonymousClass5.A = r8;
            r0 = 623;
            r10 = r6 ^ r14;
            r2 = yg.Bu.Xd(r10, r4);
            r0 = r8;
            r28 = (((((((long) 624) * r4) + (((long) (-622)) * r6)) + ((yg.Bu.Kd(r2, r0) ^ r14) * r0)) + (((long) (-623)) * yg.Bu.Yd(r0 ^ r14, yg.Bu.Xd(r4 ^ r14, r6) ^ r14))) + (r0 * yg.Bu.Kd(yg.Bu.Yd(r2 ^ r14, yg.Bu.Xd(r10, r0) ^ r14), yg.Bu.Kd(r4, r0) ^ r14))) + ((long) 1575480416);
            r3 = o.er.y.AnonymousClass5.f25282o * (-1297902553);
            o.er.y.AnonymousClass5.f25282o = r3;
            r0 = yg.Zl.Xd(yg.PY.Xd((int) (r28 >> 32), ((860732012 + (yg.Zl.Xd(~yg.Zl.Kd(-1971702988, r3), 886037897) * (-465))) + (yg.Zl.Yd(-1971702988, ~yg.Zl.Yd(886037897, r3)) * 930)) + (yg.Zl.Xd(r3, -1090519107) * 465)), yg.PY.Kd((int) r28, ((yg.Zl.Yd(~yg.Zl.Xd(-1772839726, r5), 687940613) * 398) - 1575664999) + (yg.Zl.Xd(~yg.Zl.Xd(~android.os.Process.myPid(), -1772839726), 687940613) * 398)));
         */
        /* JADX WARN: Code restructure failed: missing block: B:197:0x1e61, code lost:
        
            if (r0 <= 0) goto L206;
         */
        /* JADX WARN: Code restructure failed: missing block: B:199:0x1e65, code lost:
        
            if (r0 <= 0) goto L206;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x02fa, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:201:0x1e6c, code lost:
        
            if ((r0 + 100) >= r0) goto L206;
         */
        /* JADX WARN: Code restructure failed: missing block: B:202:0x1e6e, code lost:
        
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:203:0x1e6f, code lost:
        
            if (r0 == false) goto L207;
         */
        /* JADX WARN: Code restructure failed: missing block: B:204:0x1e71, code lost:
        
            r3 = new java.lang.Object[]{new int[]{r16 ^ 248}, new int[]{r16}, null, new int[1]};
            r2 = (int) java.lang.Runtime.getRuntime().maxMemory();
            r5 = ~yg.Zl.Xd(454459802, r2);
            r4 = ((((-552361810) + (yg.Zl.Kd(1141441600, r5) * (-814))) + (yg.Zl.Xd(r5, yg.Zl.Xd(~yg.Zl.Xd(~r2, -1577944521), android.R.^attr-private.allowStacking)) * cz.msebera.android.httpclient.HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED)) + (yg.Zl.Yd(~yg.Zl.Xd(r2, 1577944520), yg.Zl.Xd(~yg.Zl.Kd(-454459803, r2), android.R.^attr-private.allowStacking)) * cz.msebera.android.httpclient.HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED)) - 309313436;
            r2 = (r4 << 13) ^ r4;
            r2 = r2 ^ (r2 >>> 17);
            ((int[]) r3[3])[0] = r2 ^ (r2 << 5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:205:0x1ef8, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:206:0x1ef9, code lost:
        
            r0 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:207:0x1efc, code lost:
        
            r12 = r16;
            r2 = 7;
            r1 = new java.lang.Object[1];
            O(android.view.KeyEvent.keyCodeFromString("") + 7, "\u0019\u0014\r\u0012\u001e\u001f㘮", (byte) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 54), r1);
            r0 = new java.lang.Object[1];
            P(new int[]{-85481412, -11714510, -220398098, -987691585, -890628867, 707813971}, ';' - android.text.AndroidCharacter.getMirror('0'), r0);
            r1 = new java.lang.Object[1];
            P(new int[]{-85481412, -11714510, -220398098, -987691585, -1134625670, 929185471}, 13 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), r1);
            r1 = new java.lang.Object[1];
            O(12 - android.view.KeyEvent.keyCodeFromString(""), "\u0019\u0014\r\u0012\u001e\u001f\b\u0019\u0010\u0016\u0012\u001c", (byte) (71 - android.os.Process.getGidForName("")), r1);
            r1 = new java.lang.Object[1];
            O(10 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0'), "\u001d\u000e\u0000\u001e\u0001\u0003 \u001b\u0016\u001c㘕", (byte) ((android.os.Process.myTid() >> 22) + 33), r1);
            r1 = new java.lang.Object[1];
            P(new int[]{1674450468, 1820489632, 393531313, 564476839}, 6 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)), r1);
            r1 = new java.lang.Object[1];
            P(new int[]{-236667916, 1147793949}, android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 5, r1);
            r0 = new java.lang.String[]{((java.lang.String) r1[0]).intern(), ((java.lang.String) r0[0]).intern(), ((java.lang.String) r1[0]).intern(), ((java.lang.String) r1[0]).intern(), ((java.lang.String) r1[0]).intern(), ((java.lang.String) r1[0]).intern(), ((java.lang.String) r1[0]).intern()};
            r24 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:209:0x2010, code lost:
        
            if (r24 >= r2) goto L548;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x02fb, code lost:
        
            r1 = new java.lang.Object[1];
            O(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.FF, " \u0003#\u0001\t \u0001\f\t 㙔", (byte) (android.view.KeyEvent.getDeadChar(0, 0) + 85), r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:211:0x2014, code lost:
        
            r2 = new java.lang.Object[]{r0[r24]};
            r1 = o.d.d.a(-1199553513);
         */
        /* JADX WARN: Code restructure failed: missing block: B:212:0x201f, code lost:
        
            if (r1 != null) goto L214;
         */
        /* JADX WARN: Code restructure failed: missing block: B:213:0x2021, code lost:
        
            r6 = (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 128;
            r7 = (char) (android.os.Process.getGidForName("") + 1);
            r8 = 11 - android.text.TextUtils.indexOf("", "");
            r4 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r3 = r4;
            r0 = new java.lang.Object[1];
            N(r4, r3, (byte) (r3 + 2), r0);
            r1 = o.d.d.a(r6, r7, r8, 1845864050, false, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:214:0x205f, code lost:
        
            r6 = ((java.lang.Long) ((java.lang.reflect.Method) r1).invoke(null, r2)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:215:0x206d, code lost:
        
            r6 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:216:0x2070, code lost:
        
            r4 = -989445400;
            r10 = o.er.y.AnonymousClass5.B * 1031762367;
            o.er.y.AnonymousClass5.B = r10;
            r8 = 220;
            r12 = r10;
            r10 = r12 ^ r14;
            r22 = (((((((long) 221) * r4) + (((long) (-219)) * r6)) + (yg.Bu.Xd(yg.Bu.Yd(r4 ^ r14, r6 ^ r14) ^ r14, yg.Bu.Yd(yg.Bu.Kd(r10, r4), r6) ^ r14) * r8)) + (((long) (-440)) * yg.Bu.Xd(r4, yg.Bu.Kd(r10, r6) ^ r14))) + (r8 * yg.Bu.Yd(r12, yg.Bu.Kd(r4, r6)))) + ((long) (-157161169));
            r2 = (int) (r22 >> 32);
            r5 = new java.util.Random().nextInt();
            r4 = ~r5;
            r12 = r16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:217:0x2158, code lost:
        
            if (yg.Zl.Yd(yg.PY.Xd(r2, (((-1857216142) + (yg.Zl.Xd(yg.Zl.Xd(~yg.Zl.Xd(-1382021747, r4), -55204665), ~yg.Zl.Kd(1382021746, r5)) * (-564))) + ((~yg.Zl.Yd(r5, -16777481)) * 1128)) + (yg.Zl.Kd(~yg.Zl.Yd(-55204665, r4), -1398799227) * 564)), yg.PY.Xd((int) r22, (1724645211 + (yg.Zl.Kd(~yg.Zl.Yd(1548819939, r0), ~yg.Zl.Kd(111593529, r12)) * 333)) + (yg.Zl.Yd(~yg.Zl.Yd(1548819939, r12), ~yg.Zl.Yd(r0, 111593529)) * 333))) == 0) goto L226;
         */
        /* JADX WARN: Code restructure failed: missing block: B:218:0x215a, code lost:
        
            r6 = r24 + 90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:219:0x215c, code lost:
        
            if (r6 == 0) goto L225;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x031b, code lost:
        
            r2 = new java.lang.Object[]{((java.lang.String) r1[0]).intern()};
            r1 = o.d.d.a(785142162);
         */
        /* JADX WARN: Code restructure failed: missing block: B:220:0x215e, code lost:
        
            r1 = '3';
         */
        /* JADX WARN: Code restructure failed: missing block: B:222:0x2162, code lost:
        
            if (r1 == 30) goto L227;
         */
        /* JADX WARN: Code restructure failed: missing block: B:223:0x2164, code lost:
        
            r3 = new java.lang.Object[]{new int[]{r6 ^ r12}, new int[]{r12}, null, new int[]{r4 ^ (r4 << 5)}};
            r4 = ((((~yg.Zl.Yd(-1360003137, r0)) * 130) - 50735682) + (yg.Zl.Xd(~yg.Zl.Kd(-1360003137, r12), 671351826) * 130)) - 309313436;
            r4 = r4 ^ (r4 << 13);
            r4 = r4 ^ (r4 >>> 17);
         */
        /* JADX WARN: Code restructure failed: missing block: B:224:0x21b8, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:225:0x21b9, code lost:
        
            r1 = 30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:226:0x21bc, code lost:
        
            r24 = r24 + 1;
            r2 = 7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:228:0x21c4, code lost:
        
            r0 = new java.lang.Object[1];
            P(new int[]{-368140134, 2040097860, 744379120, 37428166, 1192931182, 594453850, -1192045560, -877787837}, android.graphics.Color.green(0) + 13, r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:229:0x21dd, code lost:
        
            r6 = new java.lang.Object[]{((java.lang.String) r0[0]).intern()};
            r1 = o.d.d.a(785142162);
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0329, code lost:
        
            if (r1 != null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:230:0x21e8, code lost:
        
            if (r1 != null) goto L232;
         */
        /* JADX WARN: Code restructure failed: missing block: B:231:0x21ea, code lost:
        
            r5 = 302 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1));
         */
        /* JADX WARN: Code restructure failed: missing block: B:233:0x21f7, code lost:
        
            r4 = (char) (52697 - android.text.TextUtils.getCapsMode("", 0, 0));
            r24 = 11 - android.text.TextUtils.getTrimmedLength("");
            r3 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r2 = r3;
            r0 = new java.lang.Object[1];
            N(r3, r2, (byte) (r2 + 2), r0);
            r1 = o.d.d.a(r5, r4, r24, -129387529, false, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:234:0x2238, code lost:
        
            r3 = (java.lang.String) ((java.lang.reflect.Method) r1).invoke(null, r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:235:0x2241, code lost:
        
            if (r3 == null) goto L259;
         */
        /* JADX WARN: Code restructure failed: missing block: B:237:0x2244, code lost:
        
            r0 = new java.lang.Object[1];
            P(new int[]{1057881996, 869604882, 466450278, -1291072129, 1073398365, 645366900}, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 11, r0);
            r2 = new java.lang.String[]{((java.lang.String) r0[0]).intern()};
            r1 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:238:0x2267, code lost:
        
            if (r1 > 0) goto L551;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x032b, code lost:
        
            r6 = 301 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
            r7 = (char) (android.view.KeyEvent.getDeadChar(0, 0) + 52697);
            r8 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11;
            r4 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r3 = r4;
            r0 = new java.lang.Object[1];
            N(r4, r3, (byte) (r3 + 2), r0);
            r1 = o.d.d.a(r6, r7, r8, -129387529, false, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:240:0x226f, code lost:
        
            if (r3.contains(r2[r1]) == false) goto L242;
         */
        /* JADX WARN: Code restructure failed: missing block: B:242:0x2272, code lost:
        
            r1 = r1 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:243:0x2275, code lost:
        
            r1 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:244:0x2277, code lost:
        
            r1 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:246:0x2279, code lost:
        
            r1 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:247:0x227a, code lost:
        
            r0 = r1.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:248:0x227e, code lost:
        
            if (r0 != null) goto L249;
         */
        /* JADX WARN: Code restructure failed: missing block: B:249:0x2280, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0367, code lost:
        
            r8 = ((java.lang.reflect.Method) r1).invoke(null, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:250:0x2281, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:252:0x2283, code lost:
        
            r1 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:254:0x2285, code lost:
        
            if (r1 == true) goto L259;
         */
        /* JADX WARN: Code restructure failed: missing block: B:259:0x2307, code lost:
        
            r1 = new java.lang.Object[1];
            P(new int[]{-98432051, 637434974, -514910530, 2131221398, -87686225, 555736341, 1451776872, 110527704, -690595397, 356703304}, 18 - android.widget.ExpandableListView.getPackedPositionGroup(0), r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:260:0x2325, code lost:
        
            r6 = new java.lang.Object[]{((java.lang.String) r1[0]).intern()};
            r1 = o.d.d.a(785142162);
         */
        /* JADX WARN: Code restructure failed: missing block: B:261:0x2330, code lost:
        
            if (r1 != null) goto L263;
         */
        /* JADX WARN: Code restructure failed: missing block: B:262:0x2332, code lost:
        
            r5 = (android.view.ViewConfiguration.getTouchSlop() >> 8) + 301;
            r4 = (char) (52697 - android.view.View.combineMeasuredStates(0, 0));
            r24 = (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10;
            r3 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r2 = r3;
            r0 = new java.lang.Object[1];
            N(r3, r2, (byte) (r2 + 2), r0);
            r1 = o.d.d.a(r5, r4, r24, -129387529, false, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:263:0x237a, code lost:
        
            r2 = ((java.lang.reflect.Method) r1).invoke(null, r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:264:0x2381, code lost:
        
            if (r2 == null) goto L255;
         */
        /* JADX WARN: Code restructure failed: missing block: B:265:0x2383, code lost:
        
            r1 = new java.lang.Object[1];
            O(6 - android.os.Process.getGidForName(""), "#\t㘨㘨\u0012\u001c㘱", (byte) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 52), r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:266:0x23ab, code lost:
        
            if (r2.equals(((java.lang.String) r1[0]).intern()) != false) goto L268;
         */
        /* JADX WARN: Code restructure failed: missing block: B:268:0x23af, code lost:
        
            r1 = new java.lang.Object[1];
            O(22 - android.text.TextUtils.lastIndexOf("", '0'), "\u0000!\u001f\u0015\u0017\u0014\u001e \u0012\r\u0019\u0001 \u0003\u0005 \u0007\t㘆㘆\u001f\u0012㗶", (byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 13), r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:269:0x23d5, code lost:
        
            r6 = new java.lang.Object[]{((java.lang.String) r1[0]).intern()};
            r1 = o.d.d.a(785142162);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0375, code lost:
        
            if (r8 == null) goto L104;
         */
        /* JADX WARN: Code restructure failed: missing block: B:270:0x23e0, code lost:
        
            if (r1 != null) goto L272;
         */
        /* JADX WARN: Code restructure failed: missing block: B:271:0x23e2, code lost:
        
            r5 = 301 - android.graphics.Color.blue(0);
            r4 = (char) (52697 - android.widget.ExpandableListView.getPackedPositionType(0));
            r24 = ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 11;
            r3 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r2 = r3;
            r0 = new java.lang.Object[1];
            N(r3, r2, (byte) (r2 + 2), r0);
            r1 = o.d.d.a(r5, r4, r24, -129387529, false, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:272:0x242a, code lost:
        
            r0 = (java.lang.String) ((java.lang.reflect.Method) r1).invoke(null, r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:273:0x2433, code lost:
        
            if (r0 == null) goto L255;
         */
        /* JADX WARN: Code restructure failed: missing block: B:274:0x2435, code lost:
        
            r0 = java.lang.Integer.parseInt(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:275:0x2439, code lost:
        
            if (r0 == 0) goto L255;
         */
        /* JADX WARN: Code restructure failed: missing block: B:276:0x243b, code lost:
        
            r6 = r0 + 170;
         */
        /* JADX WARN: Code restructure failed: missing block: B:277:0x243f, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:278:0x2440, code lost:
        
            r0 = r1.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:279:0x2444, code lost:
        
            if (r0 != null) goto L280;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0377, code lost:
        
            r1 = new java.lang.Object[1];
            O(6 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), " \t\u001b\u0012\u000b\u0011", (byte) (127 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1))), r1);
            r0 = new java.lang.Object[1];
            P(new int[]{-1308683636, 2023190924, 1980372793, 1457495432}, 8 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:280:0x2446, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:281:0x2447, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:282:0x2448, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:283:0x2449, code lost:
        
            r0 = r1.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:284:0x244d, code lost:
        
            if (r0 != null) goto L285;
         */
        /* JADX WARN: Code restructure failed: missing block: B:285:0x244f, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:286:0x2450, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x03c9, code lost:
        
            r4 = new java.lang.Object[]{r8, new java.lang.String[]{((java.lang.String) r1[0]).intern(), ((java.lang.String) r0[0]).intern()}};
            r1 = o.d.d.a(1127585698);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x03d6, code lost:
        
            if (r1 != null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x03d8, code lost:
        
            r5 = 238 - android.graphics.Color.blue(0);
            r3 = (char) (44531 - android.view.View.resolveSizeAndState(0, 0, 0));
            r24 = android.text.TextUtils.indexOf("", "") + 11;
            r6 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r0 = new java.lang.Object[1];
            N(r6, r6, (byte) o.er.y.AnonymousClass5.$$a.length, r0);
            r1 = o.d.d.a(r5, r3, r24, -1783597625, false, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class, java.lang.String[].class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0422, code lost:
        
            r6 = ((java.lang.Long) ((java.lang.reflect.Method) r1).invoke(null, r4)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x042f, code lost:
        
            r4 = -17164053;
            r0 = -115;
            r8 = (r0 * r4) + (r0 * r6);
            r0 = r32;
            r0 = -1;
            r17 = r0 ^ r0;
            r2 = 116;
            r8 = (r8 + (((long) (-116)) * (yg.Bu.Kd(yg.Bu.Kd(r17, r4), r6) ^ r0))) + (yg.Bu.Kd(r4, r0) * r2);
            r6 = r6 ^ r0;
            r8 = (r8 + (r2 * yg.Bu.Kd(yg.Bu.Kd(r6, r0) ^ r0, yg.Bu.Yd(r4 ^ r0, r6) ^ r0))) + ((long) 364163476);
            r3 = yg.PY.Kd((int) (r8 >> 32), ((yg.Zl.Yd(1346652420, r5) * (-196)) - 1562280530) + (yg.Zl.Yd(~yg.Zl.Yd(android.os.Process.myUid(), 1349996343), 3343923) * 196));
            r2 = ~r32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x04eb, code lost:
        
            if (yg.Zl.Kd(yg.PY.Kd((int) r8, (((-1645316524) + ((~yg.Zl.Yd(-391428441, r2)) * 979)) + (yg.Zl.Xd(-1828654851, r32) * (-979))) + (yg.Zl.Xd(~yg.Zl.Xd(-391428441, r32), ~yg.Zl.Kd(r2, -1828654851)) * 979)), r3) == 0) goto L104;
         */
        /* JADX WARN: Code restructure failed: missing block: B:346:0x2bb5, code lost:
        
            r0 = r1 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:349:0x2bc7, code lost:
        
            r4.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x04ed, code lost:
        
            r3 = o.er.y.AnonymousClass5.f25276i + 101;
            o.er.y.AnonymousClass5.f25274g = r3 % 128;
            r3 = r3 % 2;
            r3 = new java.lang.Object[1];
            O(23 - android.view.Gravity.getAbsoluteGravity(0, 0), " \u0003!\u0001 \u0003\u0005\u0006\u0017!\u0001\r\u0006\u001a\t\u0011\t\u0014\u0005\u0011\"\u001f㘘", (byte) (android.view.Gravity.getAbsoluteGravity(0, 0) + 48), r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0514, code lost:
        
            r8 = new java.lang.Object[]{((java.lang.String) r3[0]).intern()};
            r3 = o.d.d.a(785142162);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x051f, code lost:
        
            if (r3 != null) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0521, code lost:
        
            r7 = android.view.MotionEvent.axisFromString("") + 302;
            r6 = (char) (52697 - ((android.os.Process.getThreadPriority(0) + 20) >> 6));
            r11 = android.text.AndroidCharacter.getMirror('0') - '%';
            r5 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r4 = r5;
            r2 = new java.lang.Object[1];
            N(r5, r4, (byte) (r4 + 2), r2);
            r3 = o.d.d.a(r7, r6, r11, -129387529, false, (java.lang.String) r2[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0562, code lost:
        
            r23 = ((java.lang.reflect.Method) r3).invoke(null, r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0569, code lost:
        
            r2 = new java.lang.Object[1];
            P(new int[]{-1061336057, -1197936168, 591091561, -1251007326, 1209185448, -1956498445, 358792124, 647953220, 682848056, -2059150293, -1773615766, 1504524520, 1491845788, 1368829099, 1474777190, 1194039406}, android.view.KeyEvent.getDeadChar(0, 0) + 30, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0585, code lost:
        
            r8 = new java.lang.Object[]{((java.lang.String) r2[0]).intern()};
            r3 = o.d.d.a(785142162);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0590, code lost:
        
            if (r3 != null) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0592, code lost:
        
            r7 = android.view.KeyEvent.normalizeMetaState(0) + 301;
            r6 = (char) (52697 - android.view.View.MeasureSpec.getSize(0));
            r11 = android.graphics.Color.blue(0) + 11;
            r5 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r4 = r5;
            r2 = new java.lang.Object[1];
            N(r5, r4, (byte) (r4 + 2), r2);
            r3 = o.d.d.a(r7, r6, r11, -129387529, false, (java.lang.String) r2[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x05ce, code lost:
        
            r22 = ((java.lang.reflect.Method) r3).invoke(null, r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x05d5, code lost:
        
            if (r23 == null) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x05d7, code lost:
        
            r6 = new java.lang.Object[]{r23, 42};
            r4 = o.d.d.a(455802643);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x05ed, code lost:
        
            if (r4 != null) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x05ef, code lost:
        
            r5 = 594 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
            r4 = (char) (13181 - android.graphics.Color.argb(0, 0, 0, 0));
            r9 = android.view.KeyEvent.keyCodeFromString("") + 11;
            r8 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r7 = r8;
            r2 = new java.lang.Object[1];
            N(r8, r7, (byte) (r7 + 3), r2);
            r4 = o.d.d.a(r5, r4, r9, -844161674, false, (java.lang.String) r2[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0634, code lost:
        
            r12 = ((java.lang.Long) ((java.lang.reflect.Method) r4).invoke(null, r6)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0645, code lost:
        
            r10 = 263412951;
            r14 = r12 ^ r0;
            r8 = (((((((long) (-830)) * r10) + (((long) com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory.TAG_IMAGE_ID_NUMBER) * r12)) + (((long) (-831)) * yg.Bu.Xd(yg.Bu.Yd(r14, r17) ^ r0, yg.Bu.Kd(yg.Bu.Kd(r10, r12), r0) ^ r0))) + (((long) (-1662)) * (yg.Bu.Kd(yg.Bu.Yd(r14, r10), r0) ^ r0))) + (((long) 831) * yg.Bu.Xd(yg.Bu.Xd(r12, r0) ^ r0, yg.Bu.Yd(yg.Bu.Kd(r10 ^ r0, r17) ^ r0, yg.Bu.Kd(r10, r0) ^ r0)))) + ((long) 212756907);
            r6 = (-41835382) + (yg.Zl.Yd(~yg.Zl.Kd(-1443627076, r2), ~yg.Zl.Kd(1468810307, r32)) * 520);
            r2 = ~yg.Zl.Kd(-1468810308, r2);
            r5 = ~yg.Zl.Kd(-31583897, r32);
            r3 = yg.PY.Yd((int) (r8 >> 32), (r6 + (yg.Zl.Yd(r2, r5) * (-1040))) + (yg.Zl.Kd(yg.Zl.Kd(~yg.Zl.Xd(31583896, r2), 25183232), r5) * 520));
            r7 = android.os.Process.myPid();
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0746, code lost:
        
            if (yg.Zl.Kd(r3, yg.PY.Kd((int) r8, (1706624937 + (yg.Zl.Kd(~yg.Zl.Xd(1178502912, r7), 1679237973) * 191)) + (yg.Zl.Yd(~yg.Zl.Kd(~r7, 1178502912), 536944725) * 191))) == 477111747) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0748, code lost:
        
            if (r22 == null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x074b, code lost:
        
            r6 = new java.lang.Object[]{r22, 42};
            r3 = o.d.d.a(455802643);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0760, code lost:
        
            if (r3 != null) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0762, code lost:
        
            r5 = 593 - ((android.os.Process.getThreadPriority(0) + 20) >> 6);
            r4 = (char) (13181 - ((android.os.Process.getThreadPriority(0) + 20) >> 6));
            r9 = (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11;
            r8 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r7 = r8;
            r2 = new java.lang.Object[1];
            N(r8, r7, (byte) (r7 + 3), r2);
            r3 = o.d.d.a(r5, r4, r9, -844161674, false, (java.lang.String) r2[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x07ad, code lost:
        
            r12 = ((java.lang.Long) ((java.lang.reflect.Method) r3).invoke(null, r6)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x07ba, code lost:
        
            r10 = -955806402;
            r6 = 521;
            r14 = r10 ^ r0;
            r8 = (((((((long) 522) * r10) + (((long) (-520)) * r12)) + (((long) (-1042)) * yg.Bu.Yd(r10, yg.Bu.Xd(r17, r12) ^ r0))) + (yg.Bu.Yd(r12, r0) * r6)) + (r6 * yg.Bu.Kd(yg.Bu.Yd(yg.Bu.Xd(r14, r12 ^ r0) ^ r0, yg.Bu.Xd(r14, r0) ^ r0), yg.Bu.Xd(r12, yg.Bu.Yd(r17, r10)) ^ r0))) + ((long) 1431976260);
            r5 = (int) java.lang.Runtime.getRuntime().maxMemory();
            r3 = yg.PY.Kd((int) (r8 >> 32), (((-2088991750) + (yg.Zl.Yd(-335906069, r5) * com.drew.metadata.iptc.IptcDirectory.TAG_ARM_IDENTIFIER)) + (yg.Zl.Yd(~yg.Zl.Kd(~r5, -1596527281), 1260917408) * (-376))) + (yg.Zl.Kd(~yg.Zl.Kd(r5, 1596527280), -1261213605) * com.drew.metadata.iptc.IptcDirectory.TAG_ARM_IDENTIFIER));
            r5 = o.er.y.AnonymousClass5.f25273f * (-413878638);
            o.er.y.AnonymousClass5.f25273f = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0892, code lost:
        
            if (yg.Zl.Kd(r3, yg.PY.Kd((int) r8, ((yg.Zl.Xd(~yg.Zl.Yd(-1275078724, r6), 1275068418) * (-241)) - 204063961) + (yg.Zl.Yd(~yg.Zl.Yd(~r5, -10306), 307593744) * 241))) == 477111747) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0894, code lost:
        
            if (r23 == null) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0897, code lost:
        
            r6 = new java.lang.Object[]{r23, 42};
            r3 = o.d.d.a(455802643);
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x08ac, code lost:
        
            if (r3 != null) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x08ae, code lost:
        
            r5 = 593 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1));
            r4 = (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 13181);
            r9 = 10 - android.os.Process.getGidForName("");
            r8 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r7 = r8;
            r2 = new java.lang.Object[1];
            N(r8, r7, (byte) (r7 + 3), r2);
            r3 = o.d.d.a(r5, r4, r9, -844161674, false, (java.lang.String) r2[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x08f7, code lost:
        
            r12 = ((java.lang.Long) ((java.lang.reflect.Method) r3).invoke(null, r6)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0907, code lost:
        
            r2 = -1192740264;
            r10 = 983;
            r4 = r12 ^ r0;
            r6 = ((((long) (-1965)) * r2) + (((long) 984) * r12)) + (yg.Bu.Yd(r2, r4) * r10);
            r2 = r2 ^ r0;
            r4 = ((long) 1668910122) + ((r6 + (((long) (-983)) * yg.Bu.Xd(r2, yg.Bu.Kd(r4, r17) ^ r0))) + (r10 * yg.Bu.Xd(yg.Bu.Xd(r12, r2) ^ r0, yg.Bu.Kd(r2, r17) ^ r0)));
            r8 = new java.util.Random().nextInt();
            r3 = ~yg.Zl.Kd(-1708398797, r8);
            r7 = ~r8;
            r3 = yg.PY.Xd((int) (r4 >> 32), ((-1229051220) + (yg.Zl.Yd(r3, ~yg.Zl.Xd(-167780353, r7)) * 497)) + (yg.Zl.Yd(~yg.Zl.Kd(r8, -167780353), yg.Zl.Xd(~yg.Zl.Yd(438952737, r7), -2147351534)) * 497));
            r6 = (int) r4;
            r7 = new java.util.Random().nextInt(1265005891);
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x09de, code lost:
        
            if (yg.Zl.Kd(yg.PY.Xd(r6, ((1134486735 + (yg.Zl.Kd(~yg.Zl.Kd(455102529, r7), 436207680) * (-502))) + ((~yg.Zl.Xd(~r7, -545916201)) * (-502))) + (yg.Zl.Xd(~yg.Zl.Kd(r7, 982123880), 455102529) * 502)), r3) == (-1032769152)) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x09e0, code lost:
        
            if (r22 == null) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x09e3, code lost:
        
            r6 = new java.lang.Object[]{r22, 42};
            r3 = o.d.d.a(455802643);
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x09f8, code lost:
        
            if (r3 != null) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x09fa, code lost:
        
            r5 = 592 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0);
            r4 = (char) (13181 - (android.view.ViewConfiguration.getTapTimeout() >> 16));
            r9 = 11 - android.view.Gravity.getAbsoluteGravity(0, 0);
            r8 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r7 = r8;
            r2 = new java.lang.Object[1];
            N(r8, r7, (byte) (r7 + 3), r2);
            r3 = o.d.d.a(r5, r4, r9, -844161674, false, (java.lang.String) r2[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0a44, code lost:
        
            r6 = ((java.lang.Long) ((java.lang.reflect.Method) r3).invoke(null, r6)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0a53, code lost:
        
            r12 = -386554247;
            r4 = -397;
            r2 = r12 ^ r0;
            r10 = yg.Bu.Kd(r2, r17) ^ r0;
            r2 = yg.Bu.Yd(r2, r6) ^ r0;
            r8 = (((((((long) 398) * r12) + (((long) (-396)) * r6)) + (yg.Bu.Xd(yg.Bu.Xd(r10, r2), yg.Bu.Yd(r17, r6) ^ r0) * r4)) + (r4 * r2)) + (((long) 397) * yg.Bu.Yd(yg.Bu.Xd(r0, r2), yg.Bu.Kd(r6 ^ r0, r12) ^ r0))) + ((long) 862724105);
            r16 = r32;
            r3 = yg.PY.Yd((int) (r8 >> 32), ((2038856378 + (yg.Zl.Yd(~yg.Zl.Kd(-550131126, r16), ~yg.Zl.Kd(-1116225, r2)) * 920)) + (yg.Zl.Xd(~yg.Zl.Kd(-885979062, r2), 550131125) * 920)) + (yg.Zl.Xd(yg.Zl.Xd(~yg.Zl.Xd(-550131126, r2), ~yg.Zl.Xd(-335847937, r16)), ~yg.Zl.Xd(-1116225, r16)) * 920));
            r4 = (int) r8;
            r6 = o.er.y.AnonymousClass5.f25277j * 1930610548;
            o.er.y.AnonymousClass5.f25277j = r6;
            r5 = yg.Zl.Kd(~yg.Zl.Xd(-1576638815, r6), 1280839766);
            r8 = ~r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0b5d, code lost:
        
            if (yg.Zl.Yd(r3, yg.PY.Yd(r4, (((-104706891) + (yg.Zl.Xd(r5, ~yg.Zl.Yd(1576901119, r8)) * 886)) + (yg.Zl.Yd(~yg.Zl.Yd(r8, 1576638814), 1281102071) * (-1772))) + ((~yg.Zl.Kd(r8, 1281102071)) * 886))) != 542074309) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0b60, code lost:
        
            r16 = r32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0b64, code lost:
        
            r16 = r32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0b67, code lost:
        
            r16 = r32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0b6d, code lost:
        
            if (android.os.Build.VERSION.SDK_INT <= 33) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x0b6f, code lost:
        
            r3 = new java.lang.Object[1];
            O(android.os.Process.getGidForName("") + 29, "\u0018 !\u0017\u001c\u0014\u001c\u0012 \u001d㘎㘎\u0018\u0004\f\u0002\"\f\b#\u0002\u000e\r\u001c\u001f \u0003\u001b", (byte) (android.graphics.Color.alpha(0) + 24), r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0b8f, code lost:
        
            r7 = new java.lang.Object[]{((java.lang.String) r3[0]).intern()};
            r3 = o.d.d.a(-120123186);
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0b9a, code lost:
        
            if (r3 != null) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0b9c, code lost:
        
            r8 = 846 - ((byte) android.view.KeyEvent.getModifierMetaStateMask());
            r6 = (char) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 6488);
            r10 = (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12;
            r5 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r4 = r5;
            r2 = new java.lang.Object[1];
            N(r5, r4, (byte) (r4 + 3), r2);
            r3 = o.d.d.a(r8, r6, r10, 777188011, false, (java.lang.String) r2[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0bdb, code lost:
        
            r6 = ((java.lang.Long) ((java.lang.reflect.Method) r3).invoke(null, r7)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x0bea, code lost:
        
            r1 = new java.lang.Object[1];
            O(android.os.Process.getGidForName("") + 14, " \u0003\u001e\u0001\"\f\b#\u0002\u000e\r\u001c㙋", (byte) (android.graphics.Color.alpha(0) + 76), r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0c08, code lost:
        
            r2 = new java.lang.Object[]{((java.lang.String) r1[0]).intern()};
            r1 = o.d.d.a(785142162);
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0c13, code lost:
        
            if (r1 != null) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x0c15, code lost:
        
            r6 = 301 - android.text.TextUtils.getOffsetAfter("", 0);
            r7 = (char) (52697 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
            r8 = 12 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
            r4 = (byte) (o.er.y.AnonymousClass5.$$b - 1);
            r3 = r4;
            r0 = new java.lang.Object[1];
            N(r4, r3, (byte) (r3 + 2), r0);
            r1 = o.d.d.a(r6, r7, r8, -129387529, false, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0c54, code lost:
        
            r7 = ((java.lang.reflect.Method) r1).invoke(null, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0c5d, code lost:
        
            r3 = 1;
            r0 = new java.lang.Object[1];
            P(new int[]{-79984827, 2059709713}, (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), r0);
            r5 = 0;
            r0 = r7.equals(((java.lang.String) r0[0]).intern());
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x0c84, code lost:
        
            r4 = -1173003182;
            r10 = o.er.y.AnonymousClass5.f25291x * 803230783;
            o.er.y.AnonymousClass5.f25291x = r10;
            r8 = (((long) (-1335)) * r4) + (((long) (-667)) * r6);
            r6 = r6 ^ r0;
            r12 = r10;
            r10 = yg.Bu.Xd(r4, r12);
            r8 = (((r8 + (((long) (-668)) * yg.Bu.Yd(r6, r10 ^ r0))) + (((long) 1336) * yg.Bu.Kd(r0 ^ yg.Bu.Kd(r12, r6), r4))) + (((long) 668) * yg.Bu.Kd(r10, r6))) + ((long) (-415160736));
            r1 = o.er.y.AnonymousClass5.f25278k * (-710263264);
            o.er.y.AnonymousClass5.f25278k = r1;
            r3 = 1443102998 + (yg.Zl.Xd(yg.Zl.Yd(~yg.Zl.Xd(-692984009, r1), android.R.id.icon2), ~yg.Zl.Yd(744242402, r1)) * (-754));
            r2 = ~yg.Zl.Xd(-16908297, r1);
            r1 = ~r1;
            r2 = yg.PY.Yd((int) (r8 >> 32), (r3 + (yg.Zl.Xd(r2, ~yg.Zl.Xd(761150698, r1)) * (-754))) + (yg.Zl.Yd(r1, -692984009) * 754));
            r5 = (int) android.os.SystemClock.uptimeMillis();
            r3 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0d65, code lost:
        
            if (yg.Zl.Kd(r2, yg.PY.Kd((int) r8, (((-1521033179) + (yg.Zl.Kd(~yg.Zl.Xd(1407841695, ~r5), ~yg.Zl.Xd(-29384715, r5)) * (-272))) + (yg.Zl.Xd(~yg.Zl.Yd(331904398, r5), 1075937297) * (-272))) + (yg.Zl.Yd(~yg.Zl.Kd(r5, -331904399), -1105322012) * 272))) != 1) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x0d67, code lost:
        
            r5 = 0;
            r3 = 1;
            r0 = true;
         */
        /* JADX WARN: Removed duplicated region for block: B:298:0x255a  */
        /* JADX WARN: Removed duplicated region for block: B:361:0x2bde  */
        /* JADX WARN: Removed duplicated region for block: B:363:0x2be1  */
        /* JADX WARN: Removed duplicated region for block: B:365:0x2c67  */
        /* JADX WARN: Removed duplicated region for block: B:366:0x2c6a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] d$4a7e738d(int r32, java.lang.Object r33) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 17508
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.er.y.AnonymousClass5.d$4a7e738d(int, java.lang.Object):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{46, -113, 33, 42};
            $$b = 1;
        }

        static void init$1() {
            $$c = new byte[]{39, 50, 101, -97};
            $$d = 203;
        }

        @Override // o.eo.e.d
        public final void a(o.by.c cVar) {
            int i2 = 2 % 2;
            int i3 = f25274g + 85;
            f25276i = i3 % 128;
            int i4 = i3 % 2;
            this.f25294c.onError(cVar.a());
            int i5 = f25274g + 79;
            f25276i = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // o.eo.e.d
        public final void d(List<o.ex.b<?>> list) {
            int i2 = 2 % 2;
            Date dateH = this.f25295d.e().h(y.this.f25009a.b());
            ac acVar = (ac) y.this.h()[0];
            ArrayList arrayList = new ArrayList();
            int i3 = f25274g + 101;
            f25276i = i3 % 128;
            int i4 = i3 % 2;
            for (o.ex.b<?> bVar : list) {
                arrayList.add(new o.ex.b(bVar.a(), bVar.c(), acVar.c(bVar.c()), y.this.f25009a));
            }
            y yVar = y.this;
            this.f25294c.onSuccess(yVar.e(arrayList, dateH, yVar.f25009a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:5:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, byte r9, byte r10) {
        /*
            int r0 = r8 * 4
            int r8 = 4 - r0
            byte[] r7 = o.er.y.$$a
            int r0 = r10 + 102
            int r1 = r9 * 3
            int r6 = r1 + 1
            byte[] r5 = new byte[r6]
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
            int r2 = r2 + 1
            if (r2 != r6) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            r1 = r7[r8]
            r3 = r0
            r0 = r1
            goto L13
        L29:
            r2 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.y.$$c(int, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f25267j = 0;
        f25266f = 1;
        f25263c = 0;
        f25264d = 1;
        e();
        ViewConfiguration.getScrollDefaultDelay();
        KeyEvent.getMaxKeyCode();
        int i2 = f25267j + 61;
        f25266f = i2 % 128;
        int i3 = i2 % 2;
    }

    public y(o.ep.d dVar, o.eq.e eVar) {
        super(dVar, eVar);
    }

    static void e() {
        f25262b = new char[]{64520, 64580, 64539, 64517, 64609, 64584, 64588, 64585, 64518, 64631, 64515, 64592, 64597, 64586, 64599, 64598, 64619, 64589, 64577, 64620, 64614, 64630, 64533, 64516, 64587, 64582, 64578, 64617, 64625, 64519, 64579, 64521, 64595, 64593, 64532, 64576};
        f25265e = (char) 51641;
    }

    private static void i(int i2, String str, byte b2, Object[] objArr) throws Throwable {
        int i3;
        String str2 = str;
        int i4 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i5 = $10 + 59;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 10 / 0;
                charArray = str2.toCharArray();
            } else {
                charArray = str2.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        o.a.h hVar = new o.a.h();
        char[] cArr2 = f25262b;
        int i7 = 421932776;
        long j2 = 0;
        int i8 = 1;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objA = o.d.d.a(i7);
                    if (objA == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objA = o.d.d.a(Color.green(0) + 270, (char) TextUtils.getCapsMode("", 0, 0), 10 - (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1)), -811348851, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i9++;
                    i7 = 421932776;
                    j2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = $10 + 53;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(f25265e)};
        Object objA2 = o.d.d.a(421932776);
        char c2 = 11;
        if (objA2 == null) {
            byte b5 = (byte) 0;
            byte b6 = b5;
            objA2 = o.d.d.a(270 - ExpandableListView.getPackedPositionGroup(0L), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 11 - (ViewConfiguration.getJumpTapTimeout() >> 16), -811348851, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b2);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            hVar.f19926b = 0;
            while (hVar.f19926b < i3) {
                hVar.f19927c = cArr[hVar.f19926b];
                hVar.f19925a = cArr[hVar.f19926b + i8];
                if (hVar.f19927c == hVar.f19925a) {
                    int i12 = $11 + 53;
                    $10 = i12 % 128;
                    if (i12 % 2 != 0) {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c >>> b2);
                        cArr4[hVar.f19926b] = (char) (hVar.f19925a >>> b2);
                    } else {
                        cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                        cArr4[hVar.f19926b + i8] = (char) (hVar.f19925a - b2);
                    }
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = hVar;
                    objArr4[c2] = Integer.valueOf(cCharValue);
                    objArr4[10] = hVar;
                    objArr4[9] = hVar;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = hVar;
                    objArr4[6] = hVar;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = hVar;
                    objArr4[3] = hVar;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[i8] = hVar;
                    objArr4[0] = hVar;
                    Object objA3 = o.d.d.a(219124184);
                    if (objA3 == null) {
                        int iGreen = 825 - Color.green(0);
                        char c3 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 12;
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        String str$$c = $$c(b7, b8, (byte) ((b8 + 9) - (9 & b8)));
                        Class[] clsArr = new Class[13];
                        clsArr[0] = Object.class;
                        clsArr[i8] = Object.class;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Object.class;
                        clsArr[4] = Object.class;
                        clsArr[5] = Integer.TYPE;
                        clsArr[6] = Object.class;
                        clsArr[7] = Object.class;
                        clsArr[8] = Integer.TYPE;
                        clsArr[9] = Object.class;
                        clsArr[10] = Object.class;
                        clsArr[11] = Integer.TYPE;
                        clsArr[12] = Object.class;
                        objA3 = o.d.d.a(iGreen, c3, iLastIndexOf, -611683395, false, str$$c, clsArr);
                    }
                    if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                        int i13 = $10 + 117;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        Object[] objArr5 = new Object[11];
                        objArr5[10] = hVar;
                        objArr5[9] = Integer.valueOf(cCharValue);
                        objArr5[8] = hVar;
                        objArr5[7] = Integer.valueOf(cCharValue);
                        objArr5[6] = Integer.valueOf(cCharValue);
                        objArr5[5] = hVar;
                        objArr5[4] = hVar;
                        objArr5[3] = Integer.valueOf(cCharValue);
                        objArr5[2] = Integer.valueOf(cCharValue);
                        objArr5[i8] = hVar;
                        objArr5[0] = hVar;
                        Object objA4 = o.d.d.a(-634864343);
                        if (objA4 == null) {
                            c2 = 11;
                            byte b9 = (byte) 0;
                            byte b10 = b9;
                            objA4 = o.d.d.a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + JfifUtil.MARKER_SOS, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 11 - (ViewConfiguration.getEdgeSlop() >> 16), 212688716, false, $$c(b9, b10, (byte) ((-1) - (((-1) - b10) & ((-1) - 7)))), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c2 = 11;
                        }
                        int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                        int i15 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                        cArr4[hVar.f19926b] = cArr2[iIntValue];
                        cArr4[hVar.f19926b + 1] = cArr2[i15];
                    } else {
                        c2 = 11;
                        if (hVar.f19928d == hVar.f19929e) {
                            int i16 = $11 + 55;
                            $10 = i16 % 128;
                            int i17 = i16 % 2;
                            hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                            hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                            int i18 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                            int i19 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                            cArr4[hVar.f19926b] = cArr2[i18];
                            cArr4[hVar.f19926b + 1] = cArr2[i19];
                        } else {
                            int i20 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                            int i21 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                            cArr4[hVar.f19926b] = cArr2[i20];
                            i8 = 1;
                            cArr4[hVar.f19926b + 1] = cArr2[i21];
                        }
                    }
                    i8 = 1;
                }
                hVar.f19926b += 2;
            }
        }
        for (int i22 = 0; i22 < i2; i22++) {
            cArr4[i22] = (char) (cArr4[i22] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void init$0() {
        $$a = new byte[]{123, 10, 108, -85};
        $$b = 150;
    }

    public final String a() throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f25264d + 87;
        f25263c = i3 % 128;
        int i4 = i3 % 2;
        String strA = this.f25010g.m().a();
        int i5 = f25263c + 43;
        f25264d = i5 % 128;
        int i6 = i5 % 2;
        return strA;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r26, fr.antelop.sdk.util.OperationCallback<fr.antelop.sdk.digitalcard.transactioncontrol.TransactionControls> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.er.y.a(android.content.Context, fr.antelop.sdk.util.OperationCallback):void");
    }

    @Override // o.er.h
    public final /* bridge */ /* synthetic */ boolean c() {
        int i2 = 2 % 2;
        int i3 = f25263c + 115;
        f25264d = i3 % 128;
        int i4 = i3 % 2;
        boolean zC = super.c();
        int i5 = f25264d + 25;
        f25263c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return zC;
    }

    final TransactionControls e(List<o.ex.b<?>> list, Date date, o.ep.d dVar) {
        int i2 = 2 % 2;
        TransactionControl transactionControl = new TransactionControl(null);
        TransactionControl transactionControl2 = new TransactionControl(null);
        TransactionControl transactionControl3 = new TransactionControl(null);
        TransactionControl transactionControl4 = new TransactionControl(null);
        TransactionControl transactionControl5 = new TransactionControl(null);
        TransactionControl transactionControl6 = new TransactionControl(null);
        TransactionControl transactionControl7 = new TransactionControl(null);
        TransactionControl transactionControl8 = new TransactionControl(null);
        TransactionControl transactionControl9 = new TransactionControl(null);
        TransactionControl transactionControl10 = new TransactionControl(null);
        TransactionControl transactionControl11 = new TransactionControl(null);
        TransactionControl transactionControl12 = new TransactionControl(null);
        TransactionControl transactionControl13 = new TransactionControl(null);
        TransactionControl transactionControl14 = new TransactionControl(null);
        TransactionControl transactionControl15 = new TransactionControl(null);
        TransactionControl transactionControl16 = new TransactionControl(null);
        TransactionControl transactionControl17 = new TransactionControl(null);
        TransactionControl transactionControl18 = new TransactionControl(null);
        TransactionControl transactionControl19 = new TransactionControl(null);
        TransactionControl transactionControl20 = new TransactionControl(null);
        TransactionControl transactionControl21 = new TransactionControl(null);
        TransactionControl transactionControl22 = new TransactionControl(null);
        TransactionControl transactionControl23 = new TransactionControl(null);
        TransactionControl transactionControl24 = new TransactionControl(null);
        TransactionControl transactionControl25 = new TransactionControl(null);
        TransactionControl transactionControl26 = new TransactionControl(null);
        TransactionControl transactionControl27 = new TransactionControl(null);
        for (o.ex.b<?> bVar : list) {
            int i3 = f25263c + 93;
            f25264d = i3 % 128;
            int i4 = i3 % 2;
            if (h()[0].c()) {
                int i5 = f25264d + 11;
                f25263c = i5 % 128;
                int i6 = i5 % 2;
                switch (AnonymousClass2.f25268a[bVar.c().ordinal()]) {
                    case 1:
                        transactionControl = new TransactionControl(bVar);
                        continue;
                    case 2:
                        transactionControl2 = new TransactionControl(bVar);
                        continue;
                    case 3:
                        transactionControl3 = new TransactionControl(bVar);
                        continue;
                    case 4:
                        transactionControl4 = new TransactionControl(bVar);
                        continue;
                    case 5:
                        transactionControl5 = new TransactionControl(bVar);
                        continue;
                    case 6:
                        transactionControl6 = new TransactionControl(bVar);
                        int i7 = f25263c + 17;
                        f25264d = i7 % 128;
                        int i8 = i7 % 2;
                        continue;
                    case 7:
                        transactionControl7 = new TransactionControl(bVar);
                        continue;
                    case 8:
                        transactionControl8 = new TransactionControl(bVar);
                        continue;
                    case 9:
                        transactionControl9 = new TransactionControl(bVar);
                        continue;
                    case 10:
                        transactionControl10 = new TransactionControl(bVar);
                        continue;
                    case 11:
                        transactionControl11 = new TransactionControl(bVar);
                        continue;
                    case 12:
                        transactionControl12 = new TransactionControl(bVar);
                        continue;
                    case 13:
                        transactionControl13 = new TransactionControl(bVar);
                        continue;
                    case 14:
                        transactionControl14 = new TransactionControl(bVar);
                        continue;
                    case 15:
                        transactionControl15 = new TransactionControl(bVar);
                        continue;
                    case 16:
                        transactionControl16 = new TransactionControl(bVar);
                        continue;
                    case 17:
                        transactionControl17 = new TransactionControl(bVar);
                        continue;
                    case 18:
                        transactionControl18 = new TransactionControl(bVar);
                        continue;
                    case 19:
                        transactionControl19 = new TransactionControl(bVar);
                        continue;
                    case 20:
                        transactionControl20 = new TransactionControl(bVar);
                        continue;
                    case 21:
                        transactionControl21 = new TransactionControl(bVar);
                        continue;
                    case 22:
                        transactionControl22 = new TransactionControl(bVar);
                        continue;
                    case 23:
                        transactionControl23 = new TransactionControl(bVar);
                        continue;
                    case 24:
                        transactionControl24 = new TransactionControl(bVar);
                        continue;
                    case 25:
                        transactionControl25 = new TransactionControl(bVar);
                        continue;
                    case 26:
                        transactionControl26 = new TransactionControl(bVar);
                        continue;
                    case 27:
                        transactionControl27 = new TransactionControl(bVar);
                        break;
                }
            }
        }
        return new TransactionControls(dVar.b(), date, new o.ex.d(dVar), new TransactionControls.GlobalControls(transactionControl, transactionControl2, transactionControl3, transactionControl4), new TransactionControls.TransactionTypeControls(new TransactionControls.TransactionTypeControls.AtmTransactionControls(transactionControl5, transactionControl6), new TransactionControls.TransactionTypeControls.RecurringTransactionControls(transactionControl7, transactionControl8), new TransactionControls.TransactionTypeControls.BrickAndMortarTransactionControls(transactionControl9, transactionControl10), new TransactionControls.TransactionTypeControls.CrossBorderTransactionControls(transactionControl11, transactionControl12), new TransactionControls.TransactionTypeControls.EcommerceTransactionControls(transactionControl13, transactionControl14), new TransactionControls.TransactionTypeControls.ContactlessTransactionControls(transactionControl15, transactionControl16)), new TransactionControls.TransactionGeolocationControls(transactionControl17, transactionControl18, transactionControl19, transactionControl20), new TransactionControls.MerchantTypeControls(transactionControl21, transactionControl22, transactionControl23), new TransactionControls.VelocityControls(transactionControl24, transactionControl25, transactionControl26, transactionControl27));
    }

    @Override // o.er.h
    public final c[] h() {
        c[] cVarArr;
        int i2 = 2 % 2;
        int i3 = f25264d + 81;
        f25263c = i3 % 128;
        if (i3 % 2 != 0) {
            cVarArr = new c[0];
            cVarArr[0] = this.f25010g.m();
        } else {
            cVarArr = new c[]{this.f25010g.m()};
        }
        int i4 = f25264d + 55;
        f25263c = i4 % 128;
        if (i4 % 2 == 0) {
            return cVarArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
