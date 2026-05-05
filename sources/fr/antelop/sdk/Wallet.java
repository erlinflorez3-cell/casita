package fr.antelop.sdk;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import fr.antelop.sdk.card.Card;
import fr.antelop.sdk.card.CreateCardRequestBuilder;
import fr.antelop.sdk.card.emvapplication.EmvApplication;
import fr.antelop.sdk.digitalcard.DigitalCard;
import fr.antelop.sdk.digitalcard.WalletClickToPayService;
import fr.antelop.sdk.exception.WalletValidationException;
import fr.antelop.sdk.settings.WalletSettings;
import fr.antelop.sdk.util.OperationCallback;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.a.g;
import o.a.h;
import o.d.d;
import o.en.b;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class Wallet {
    private final b innerWallet;

    public Wallet(b bVar) {
        this.innerWallet = bVar;
    }

    public final List<Product> availableProducts() {
        return this.innerWallet.p();
    }

    public final Map<String, Card> cards(boolean z2) {
        return this.innerWallet.a(z2);
    }

    @Deprecated
    public final void createCard(Context context, CreateCardRequestBuilder createCardRequestBuilder, final AntelopCallback antelopCallback) throws Throwable {
        this.innerWallet.a(context, createCardRequestBuilder, antelopCallback != null ? new OperationCallback<Void>() { // from class: fr.antelop.sdk.Wallet.1
            @Override // fr.antelop.sdk.util.OperationCallback
            public void onError(AntelopError antelopError) {
                antelopCallback.onError(antelopError);
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public void onSuccess(Void r2) {
                antelopCallback.onSuccess();
            }
        } : null);
    }

    public final void createCard(Context context, CreateCardRequestBuilder createCardRequestBuilder, OperationCallback<Void> operationCallback) throws Throwable {
        this.innerWallet.a(context, createCardRequestBuilder, operationCallback);
    }

    public final Map<String, DigitalCard> digitalCards(boolean z2) {
        return this.innerWallet.b(z2);
    }

    @Deprecated
    public final void enrollDigitalCard(Context context, String str, final AntelopCallback antelopCallback) throws Throwable {
        this.innerWallet.e(context, str, antelopCallback != null ? new OperationCallback<Void>() { // from class: fr.antelop.sdk.Wallet.2
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

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static char f18708a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static char f18709b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static char f18710c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static char f18711d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static char f18712e = 0;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static char f18713f = 0;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static char f18714g = 0;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private static char f18715h = 0;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private static char[] f18716i = null;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private static char f18717j = 0;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private static int f18718k = 0;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static int f18719l = 0;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private static int f18720m = 0;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private static int f18721n = 0;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private static int f18722o = 0;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public static int f18723p = 0;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static int f18724q = 0;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static int f18725r = 0;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public static int f18726s = 0;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public static int f18727t = 0;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public static int f18728u = 0;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public static int f18729v = 0;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public static int f18730w = 0;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public static int f18731x = 0;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public static int f18732y = 0;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public static int f18733z = 0;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0013). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$e(int r6, short r7, byte r8) {
                /*
                    int r0 = r8 * 4
                    int r8 = 3 - r0
                    int r0 = r7 * 2
                    int r7 = r0 + 1
                    int r6 = r6 + 69
                    byte[] r5 = fr.antelop.sdk.Wallet.AnonymousClass2.$$c
                    byte[] r4 = new byte[r7]
                    r3 = 0
                    if (r5 != 0) goto L27
                    r0 = r7
                    r2 = r3
                L13:
                    int r6 = r6 + r0
                    r1 = r2
                L15:
                    byte r0 = (byte) r6
                    int r2 = r1 + 1
                    r4[r1] = r0
                    if (r2 != r7) goto L22
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r4, r3)
                    return r0
                L22:
                    int r8 = r8 + 1
                    r0 = r5[r8]
                    goto L13
                L27:
                    r1 = r3
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.Wallet.AnonymousClass2.$$e(int, short, byte):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                F = 1801797791;
                E = 337684628;
                D = -933355946;
                C = 898124395;
                B = -639738521;
                A = -1570844975;
                f18733z = -1053203979;
                f18732y = -356532372;
                f18731x = 1722036522;
                f18730w = -11294133;
                f18729v = 1359424729;
                f18728u = -549550038;
                f18727t = -1847570034;
                f18726s = -423703898;
                f18725r = 597963085;
                f18724q = 1880959445;
                f18723p = 708129927;
                f18719l = 2138928574;
                init$0();
                f18722o = 0;
                f18720m = 1;
                f18718k = 0;
                f18721n = 1;
                c();
                f18712e = (char) 53221;
                f18711d = (char) 22151;
                f18708a = (char) 23077;
                f18709b = (char) 39913;
                int i2 = f18720m + 91;
                f18722o = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 67 / 0;
                }
            }

            private static void G(String str2, int i2, byte b2, Object[] objArr) throws Throwable {
                int i3;
                int i4;
                String str3 = str2;
                int i5 = 2 % 2;
                Object charArray = str3;
                if (str3 != null) {
                    charArray = str3.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                h hVar = new h();
                char[] cArr2 = f18716i;
                int i6 = 33;
                int i7 = 421932776;
                int i8 = 1;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i9 = 0;
                    while (i9 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                            Object objA = d.a(i7);
                            if (objA == null) {
                                byte b3 = (byte) 0;
                                objA = d.a(270 - Color.alpha(0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 11, -811348851, false, $$e((byte) i6, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr3[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                            i9++;
                            i6 = 33;
                            i7 = 421932776;
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
                Object[] objArr3 = {Integer.valueOf(f18715h)};
                Object objA2 = d.a(421932776);
                if (objA2 == null) {
                    byte b4 = (byte) 0;
                    objA2 = d.a(271 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 11 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -811348851, false, $$e((byte) 33, b4, b4), new Class[]{Integer.TYPE});
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
                            int i10 = $11 + 13;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            cArr4[hVar.f19926b] = (char) (hVar.f19927c - b2);
                            cArr4[hVar.f19926b + i8] = (char) (hVar.f19925a - b2);
                            i4 = 2;
                        } else {
                            Object[] objArr4 = new Object[13];
                            objArr4[12] = hVar;
                            objArr4[11] = Integer.valueOf(cCharValue);
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
                            Object objA3 = d.a(219124184);
                            if (objA3 == null) {
                                byte b5 = (byte) 0;
                                objA3 = d.a(825 - TextUtils.indexOf("", "", 0, 0), (char) (Process.myPid() >> 22), 11 - (ViewConfiguration.getEdgeSlop() >> 16), -611683395, false, $$e((byte) 42, b5, b5), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objA3).invoke(null, objArr4)).intValue() == hVar.f19930g) {
                                Object[] objArr5 = {hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, hVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), hVar, Integer.valueOf(cCharValue), hVar};
                                Object objA4 = d.a(-634864343);
                                if (objA4 == null) {
                                    byte b6 = (byte) 0;
                                    objA4 = d.a(TextUtils.lastIndexOf("", '0') + 219, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 11 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 212688716, false, $$e((byte) 40, b6, b6), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                int iIntValue = ((Integer) ((Method) objA4).invoke(null, objArr5)).intValue();
                                int i12 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                                cArr4[hVar.f19926b] = cArr2[iIntValue];
                                cArr4[hVar.f19926b + 1] = cArr2[i12];
                            } else if (hVar.f19928d == hVar.f19929e) {
                                hVar.f19931i = ((hVar.f19931i + cCharValue) - 1) % cCharValue;
                                hVar.f19930g = ((hVar.f19930g + cCharValue) - 1) % cCharValue;
                                int i13 = (hVar.f19928d * cCharValue) + hVar.f19931i;
                                int i14 = (hVar.f19929e * cCharValue) + hVar.f19930g;
                                cArr4[hVar.f19926b] = cArr2[i13];
                                cArr4[hVar.f19926b + 1] = cArr2[i14];
                            } else {
                                int i15 = (hVar.f19928d * cCharValue) + hVar.f19930g;
                                int i16 = (hVar.f19929e * cCharValue) + hVar.f19931i;
                                cArr4[hVar.f19926b] = cArr2[i15];
                                i8 = 1;
                                cArr4[hVar.f19926b + 1] = cArr2[i16];
                                int i17 = $11 + 23;
                                $10 = i17 % 128;
                                i4 = 2;
                                int i18 = i17 % 2;
                            }
                            i4 = 2;
                            i8 = 1;
                        }
                        hVar.f19926b += i4;
                    }
                }
                int i19 = 0;
                while (i19 < i2) {
                    int i20 = $10 + 23;
                    $11 = i20 % 128;
                    if (i20 % 2 == 0) {
                        cArr4[i19] = (char) (cArr4[i19] ^ 463);
                        i19 += 44;
                    } else {
                        cArr4[i19] = (char) (cArr4[i19] ^ 13722);
                        i19++;
                    }
                }
                objArr[0] = new String(cArr4);
            }

            private static void H(String str2, int i2, Object[] objArr) throws Throwable {
                String str3 = str2;
                int i3 = 2 % 2;
                int i4 = $11 + 117;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                Object obj = str3;
                if (str3 != null) {
                    char[] charArray = str3.toCharArray();
                    int i6 = $11 + 99;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    obj = charArray;
                }
                char[] cArr = (char[]) obj;
                g gVar = new g();
                char[] cArr2 = new char[cArr.length];
                int i8 = 0;
                gVar.f19924d = 0;
                char[] cArr3 = new char[2];
                while (gVar.f19924d < cArr.length) {
                    int i9 = $10 + 57;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        cArr3[i8] = cArr[gVar.f19924d];
                        cArr3[1] = cArr[gVar.f19924d + 1];
                    } else {
                        cArr3[i8] = cArr[gVar.f19924d];
                        cArr3[1] = cArr[gVar.f19924d + 1];
                    }
                    int i10 = $11 + 51;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = 58224;
                    int i13 = i8;
                    while (i13 < 16) {
                        char c2 = cArr3[1];
                        char c3 = cArr3[i8];
                        try {
                            Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i12) ^ ((c3 << 4) + ((char) (((long) f18713f) ^ (-7511683281764982996L))))), Integer.valueOf(c3 >>> 5), Integer.valueOf(f18717j)};
                            Object objA = d.a(1603517628);
                            if (objA == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objA = d.a(269 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 11, -1995022631, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            char cCharValue = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i12) ^ ((cCharValue << 4) + ((char) (((long) f18710c) ^ (-7511683281764982996L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f18714g)};
                            Object objA2 = d.a(1603517628);
                            if (objA2 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objA2 = d.a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 269, (char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 11, -1995022631, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objA2).invoke(null, objArr3)).charValue();
                            i12 -= 40503;
                            i13++;
                            i8 = 0;
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
                    Object objA3 = d.a(1390051551);
                    if (objA3 == null) {
                        byte b6 = (byte) 3;
                        byte b7 = (byte) (b6 - 3);
                        objA3 = d.a(Color.argb(0, 0, 0, 0) + 270, (char) (Process.myPid() >> 22), 10 - Process.getGidForName(""), -2074123590, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objA3).invoke(null, objArr4);
                    i8 = 0;
                }
                objArr[0] = new String(cArr2, 0, i2);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:5:0x0012). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void I(int r8, byte r9, int r10, java.lang.Object[] r11) {
                /*
                    int r8 = r8 * 2
                    int r1 = r8 + 1
                    int r0 = 101 - r9
                    byte[] r7 = fr.antelop.sdk.Wallet.AnonymousClass2.$$a
                    int r6 = r10 + 4
                    byte[] r5 = new byte[r1]
                    r4 = 0
                    if (r7 != 0) goto L2a
                    r3 = r8
                    r1 = r6
                    r2 = r4
                L12:
                    int r6 = r6 + r3
                    r0 = r6
                    r6 = r1
                L15:
                    byte r1 = (byte) r0
                    r5[r2] = r1
                    if (r2 != r8) goto L22
                    java.lang.String r0 = new java.lang.String
                    r0.<init>(r5, r4)
                    r11[r4] = r0
                    return
                L22:
                    int r2 = r2 + 1
                    int r1 = r6 + 1
                    r3 = r7[r1]
                    r6 = r0
                    goto L12
                L2a:
                    r2 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.Wallet.AnonymousClass2.I(int, byte, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void J(java.lang.String r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 519
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.Wallet.AnonymousClass2.J(java.lang.String, int, java.lang.Object[]):void");
            }

            static void c() {
                f18710c = (char) 30406;
                f18714g = (char) 44436;
                f18713f = (char) 11793;
                f18717j = (char) 54478;
                f18716i = new char[]{64597, 64609, 64612, 64598, 64599, 64611, 64630, 64576, 64587, 64522, 64614, 64580, 64605, 64592, 64559, 64543, 64578, 64517, 64579, 64589, 64596, 64595, 64586, 64523, 64590, 65470, 64593, 64625, 64577, 64594, 64629, 65471, 64620, 64585, 64634, 64616, 65468, 64520, 64618, 65469, 64583, 64588, 64541, 64624, 64591, 64604, 64581, 64582, 64584};
                f18715h = (char) 51640;
            }

            /* JADX WARN: Removed duplicated region for block: B:213:0x1218 A[Catch: Exception -> 0x1223, IOException -> 0x1248, all -> 0x14ae, TryCatch #9 {, blocks: (B:86:0x0d8f, B:87:0x0da6, B:216:0x121b, B:218:0x1221, B:219:0x1222, B:95:0x0e1d, B:211:0x1212, B:213:0x1218, B:214:0x1219, B:105:0x0e6e, B:109:0x0ebf, B:148:0x1069, B:149:0x106c, B:151:0x107a, B:152:0x10b4, B:154:0x10cb, B:155:0x1108, B:156:0x111a, B:158:0x1140, B:160:0x115e, B:162:0x1182, B:164:0x11a9, B:166:0x11c7, B:227:0x124d, B:169:0x11d0, B:194:0x11f7, B:195:0x11fa, B:197:0x11fc, B:199:0x1202, B:200:0x1203, B:204:0x1207, B:206:0x120d, B:207:0x120e, B:220:0x1223, B:221:0x1244), top: B:355:0x0d8f }] */
            /* JADX WARN: Removed duplicated region for block: B:214:0x1219 A[Catch: Exception -> 0x1223, IOException -> 0x1248, all -> 0x14ae, TRY_LEAVE, TryCatch #9 {, blocks: (B:86:0x0d8f, B:87:0x0da6, B:216:0x121b, B:218:0x1221, B:219:0x1222, B:95:0x0e1d, B:211:0x1212, B:213:0x1218, B:214:0x1219, B:105:0x0e6e, B:109:0x0ebf, B:148:0x1069, B:149:0x106c, B:151:0x107a, B:152:0x10b4, B:154:0x10cb, B:155:0x1108, B:156:0x111a, B:158:0x1140, B:160:0x115e, B:162:0x1182, B:164:0x11a9, B:166:0x11c7, B:227:0x124d, B:169:0x11d0, B:194:0x11f7, B:195:0x11fa, B:197:0x11fc, B:199:0x1202, B:200:0x1203, B:204:0x1207, B:206:0x120d, B:207:0x120e, B:220:0x1223, B:221:0x1244), top: B:355:0x0d8f }] */
            /* JADX WARN: Removed duplicated region for block: B:250:0x15cb  */
            /* JADX WARN: Removed duplicated region for block: B:256:0x1799 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0b06  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x0d09  */
            /* JADX WARN: Removed duplicated region for block: B:82:0x0d4d  */
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.Object[] c(android.content.Context r35, int r36, int r37, int r38) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 8794
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.Wallet.AnonymousClass2.c(android.content.Context, int, int, int):java.lang.Object[]");
            }

            static void init$0() {
                $$a = new byte[]{74, -74, 100, -77};
                $$b = 193;
            }

            static void init$1() {
                $$c = new byte[]{Ascii.FF, 10, -28, MessagePack.Code.NEGFIXINT_PREFIX};
                $$d = 201;
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public void onError(AntelopError antelopError) {
                int i2 = 2 % 2;
                int i3 = f18721n + 33;
                f18718k = i3 % 128;
                if (i3 % 2 != 0) {
                    antelopCallback.onError(antelopError);
                    throw null;
                }
                antelopCallback.onError(antelopError);
                int i4 = f18721n + 67;
                f18718k = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // fr.antelop.sdk.util.OperationCallback
            public /* bridge */ /* synthetic */ void onSuccess(Void r4) {
                int i2 = 2 % 2;
                int i3 = f18721n + 91;
                f18718k = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(r4);
                if (i4 != 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: onSuccess, reason: avoid collision after fix types in other method */
            public void onSuccess2(Void r4) {
                int i2 = 2 % 2;
                int i3 = f18718k + 15;
                f18721n = i3 % 128;
                int i4 = i3 % 2;
                antelopCallback.onSuccess();
                int i5 = f18721n + 83;
                f18718k = i5 % 128;
                int i6 = i5 % 2;
            }
        } : null);
    }

    public final void enrollDigitalCard(Context context, String str, OperationCallback<Void> operationCallback) throws Throwable {
        this.innerWallet.e(context, str, operationCallback);
    }

    public final Card getCard(String str) throws WalletValidationException {
        return this.innerWallet.a(str);
    }

    public final X509Certificate getCertificate() {
        return this.innerWallet.v();
    }

    public final WalletClickToPayService getClickToPayService() {
        return new WalletClickToPayService(this.innerWallet);
    }

    public final String getDefaultCardId() {
        Object[] objArr = {this.innerWallet};
        int iNextInt = new Random().nextInt();
        int iActiveCount = Thread.activeCount();
        int iMyUid = Process.myUid();
        int i2 = b.f24089d * 2028490856;
        b.f24089d = i2;
        return (String) b.a(1484095091, iNextInt, objArr, iActiveCount, -1484095091, iMyUid, i2);
    }

    public final DigitalCard getDigitalCard(String str) throws WalletValidationException {
        return this.innerWallet.b(str);
    }

    public final EmvApplication getEmvApplication(String str) throws WalletValidationException {
        return this.innerWallet.c(str);
    }

    public final String getIssuerClientId() {
        return this.innerWallet.o();
    }

    public final String getIssuerData() {
        Object[] objArr = {this.innerWallet};
        int i2 = b.f24095j * (-753814041);
        b.f24095j = i2;
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i3 = b.f24094i * 968490782;
        b.f24094i = i3;
        return (String) b.a(721620061, i2, objArr, iUptimeMillis, -721620057, i3, Process.myTid());
    }

    public final String getIssuerWalletId() {
        return this.innerWallet.k();
    }

    public final String getMdesPaymentAppInstanceId() {
        return this.innerWallet.u();
    }

    public final String getNextTransactionCardId() {
        return this.innerWallet.i();
    }

    public final X509Certificate getSecureDisplayCertificate() {
        Object[] objArr = {this.innerWallet};
        int iNextInt = new Random().nextInt();
        int i2 = b.f24096m * 403932859;
        b.f24096m = i2;
        return (X509Certificate) b.a(1828373187, iNextInt, objArr, i2, -1828373180, new Random().nextInt(1734004265), Thread.activeCount());
    }

    public final String getVtsClientDeviceId() {
        Object[] objArr = {this.innerWallet};
        int i2 = b.f24091f * (-637535876);
        b.f24091f = i2;
        int id = (int) Thread.currentThread().getId();
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        int i3 = b.f24092g * 1321308741;
        b.f24092g = i3;
        return (String) b.a(63409599, i2, objArr, id, -63409594, iMaxMemory, i3);
    }

    public final String getVtsClientWalletAccountId() {
        return this.innerWallet.w();
    }

    public final String getWalletId() {
        return this.innerWallet.n();
    }

    public final void refreshDigitalCards(Context context, OperationCallback<Void> operationCallback) throws Throwable {
        this.innerWallet.b(context, operationCallback);
    }

    public final void resetNextTransactionCard() throws Throwable {
        this.innerWallet.h();
    }

    public final void setDefaultCard(String str) throws Throwable {
        this.innerWallet.d(str);
    }

    public final void setNextTransactionCard(String str) throws Throwable {
        Object[] objArr = {this.innerWallet, str};
        int i2 = b.f24093h * (-163821843);
        b.f24093h = i2;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i3 = (int) Runtime.getRuntime().totalMemory();
        int i4 = b.f24097n * (-204943166);
        b.f24097n = i4;
        b.a(-1857014006, i2, objArr, iFreeMemory, 1857014012, i3, i4);
    }

    public final WalletSettings settings() {
        return this.innerWallet.l();
    }

    public final String toString() {
        return new StringBuilder("Wallet{id=").append(getWalletId()).append(", defaultCardId=").append(getDefaultCardId() == null ? "" : getDefaultCardId()).append(", nextTransactionCardId=").append(getNextTransactionCardId() == null ? "" : getNextTransactionCardId()).append(", issuerData=").append(getIssuerData() == null ? "" : getIssuerData()).append(", issuerWalletId=").append(getIssuerWalletId() == null ? "" : getIssuerWalletId()).append(", issuerClientId=").append(getIssuerClientId() == null ? "" : getIssuerClientId()).append(", vtsClientDeviceId=").append(getVtsClientDeviceId()).append(", vtsClientWalletAccountId=").append(getVtsClientWalletAccountId()).append(", mdesPaymentAppInstanceId=").append(getMdesPaymentAppInstanceId() != null ? getMdesPaymentAppInstanceId() : "").append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
