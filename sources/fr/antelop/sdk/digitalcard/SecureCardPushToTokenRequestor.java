package fr.antelop.sdk.digitalcard;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.drew.metadata.iptc.IptcDirectory;
import com.google.common.base.Ascii;
import fr.antelop.sdk.authentication.CustomCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.authentication.CustomerAuthenticatedProcess;
import fr.antelop.sdk.authentication.CustomerAuthenticationCredentials;
import fr.antelop.sdk.authentication.CustomerAuthenticationMethodType;
import fr.antelop.sdk.authentication.DefaultCustomerAuthenticatedProcessCallback;
import fr.antelop.sdk.exception.WalletValidationException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import o.a.f;
import o.a.j;
import o.ap.c;
import o.d.d;
import o.ea.m;
import o.m.i;
import o.y.h;
import okio.Utf8;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class SecureCardPushToTokenRequestor implements CustomerAuthenticatedProcess {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static boolean f19171a = false;

    /* JADX INFO: renamed from: b */
    private static boolean f19172b = false;

    /* JADX INFO: renamed from: c */
    private static int f19173c = 0;

    /* JADX INFO: renamed from: d */
    private static int f19174d = 0;

    /* JADX INFO: renamed from: e */
    private static char[] f19175e = null;

    /* JADX INFO: renamed from: f */
    private static int f19176f = 0;

    /* JADX INFO: renamed from: g */
    private static int f19177g = 0;

    /* JADX INFO: renamed from: h */
    private static byte[] f19178h = null;

    /* JADX INFO: renamed from: i */
    private static int f19179i = 0;

    /* JADX INFO: renamed from: j */
    private static short[] f19180j = null;

    /* JADX INFO: renamed from: k */
    private static int f19181k = 0;

    /* JADX INFO: renamed from: l */
    public static int f19182l = 0;

    /* JADX INFO: renamed from: m */
    public static int f19183m = 0;

    /* JADX INFO: renamed from: n */
    private static int f19184n = 0;

    /* JADX INFO: renamed from: o */
    private static int f19185o = 0;

    /* JADX INFO: renamed from: p */
    public static int f19186p = 0;

    /* JADX INFO: renamed from: q */
    public static int f19187q = 0;
    private final h innerSecureDigitalCardPushToTokenRequestorProcess;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0014). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(short r7, short r8, byte r9) {
        /*
            int r8 = r8 + 4
            int r7 = 104 - r7
            byte[] r6 = fr.antelop.sdk.digitalcard.SecureCardPushToTokenRequestor.$$c
            int r1 = r9 * 3
            int r0 = 1 - r1
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r6 != 0) goto L28
            r1 = r8
            r0 = r3
            r2 = r4
        L14:
            int r0 = -r0
            int r8 = r8 + r0
        L16:
            byte r0 = (byte) r8
            r5[r2] = r0
            int r1 = r1 + 1
            if (r2 != r3) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L23:
            int r2 = r2 + 1
            r0 = r6[r1]
            goto L14
        L28:
            r2 = r4
            r1 = r8
            r8 = r7
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureCardPushToTokenRequestor.$$e(short, short, byte):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        f19187q = 2008826795;
        f19186p = -664373492;
        f19183m = 1024887908;
        f19182l = -833768003;
        init$0();
        f19185o = 0;
        f19184n = 1;
        f19176f = 0;
        f19181k = 1;
        a();
        f19175e = new char[]{2524};
        f19174d = 2040400143;
        f19172b = true;
        f19171a = true;
        int i2 = f19185o + 25;
        f19184n = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
    }

    public SecureCardPushToTokenRequestor(h hVar) {
        this.innerSecureDigitalCardPushToTokenRequestorProcess = hVar;
    }

    static void a() {
        f19173c = 201838326;
        f19179i = 1150422401;
        f19177g = 2074957652;
        f19178h = new byte[]{47, 52, Ascii.SUB, 33, 40, 95, 54, -19, 33, 34, Ascii.SUB, 33, 40, Utf8.REPLACEMENT_BYTE, 86, -3, 44, 45, 46, 57, 17, 62, -89, -108, MessagePack.Code.FLOAT64, 113, -83, -86, -101, -71, -110, -106, -109, MessagePack.Code.FIXARRAY_PREFIX, -84, MessagePack.Code.ARRAY32, 99, -67, -110, MessagePack.Code.FIXARRAY_PREFIX, -127, -76, 98, -98, -105, -124, -86, -97, -125, -100, -99, -103, MessagePack.Code.UINT32, -86, 88, -100, MessagePack.Code.STR32, 67, -105, MessagePack.Code.FIXARRAY_PREFIX, -120, -105, -98, -83, MessagePack.Code.BIN8, 83, -126, -125, -100, -81, -121, -84, 108, 86, 71, 86, -17, 56, -73, -25, -10, -1, -26, -4, -18, 9, -29, -1, 37, -73, -25, -3, -4, 35, -95, -15, -31, -5, 38, -80, -19, Ascii.CR, 42, Ascii.RS, 41, Ascii.SYN, Ascii.EM, Ascii.ETB, 1, 32, Ascii.SUB, Ascii.SYN, 93, MessagePack.Code.FIXEXT1, Ascii.SUB, -115, -115, -115, -115, -115, -115};
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0397  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] a(android.content.Context r28, int r29, int r30, int r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1935
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureCardPushToTokenRequestor.a(android.content.Context, int, int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{68, -115, MessagePack.Code.BIN16, -123};
        $$b = 15;
    }

    static void init$1() {
        $$c = new byte[]{73, 44, MessagePack.Code.UINT64, -90};
        $$d = 113;
    }

    private static void r(short s2, int i2, byte b2, int i3, int i4, Object[] objArr) throws Throwable {
        boolean z2;
        int i5 = 2 % 2;
        j jVar = new j();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(f19179i)};
            Object objA = d.a(-727631768);
            long j2 = 0;
            if (objA == null) {
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 - 1);
                objA = d.a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 238, (char) (44531 - (KeyEvent.getMaxKeyCode() >> 16)), 12 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 35969549, false, $$e(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objA).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f19178h;
                if (bArr != null) {
                    int i7 = $11 + 65;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objA2 = d.a(-1239398195);
                        if (objA2 == null) {
                            int i10 = (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)) + IptcDirectory.TAG_SOURCE;
                            char c2 = (char) (28649 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 12;
                            byte b5 = (byte) ((-1) - (((-1) - $$d) | ((-1) - 7)));
                            byte b6 = (byte) (-b5);
                            objA2 = d.a(i10, c2, iLastIndexOf, 1621469864, false, $$e(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objA2).invoke(null, objArr3)).byteValue();
                        i9++;
                        j2 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = f19178h;
                    Object[] objArr4 = {Integer.valueOf(i4), Integer.valueOf(f19173c)};
                    Object objA3 = d.a(-727631768);
                    if (objA3 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 - 1);
                        objA3 = d.a(238 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (44531 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11, 35969549, false, $$e(b7, b8, (byte) (b8 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objA3).invoke(null, objArr4)).intValue()]) ^ (-7649639543924978291L))) + ((int) (((long) f19179i) ^ (-7649639543924978291L))));
                } else {
                    iIntValue = (short) (((short) (((long) f19180j[i4 + ((int) (((long) f19173c) ^ (-7649639543924978291L)))]) ^ (-7649639543924978291L))) + ((int) (((long) f19179i) ^ (-7649639543924978291L))));
                }
            }
            if (iIntValue > 0) {
                int i11 = $10 + 39;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                jVar.f19936d = ((i4 + iIntValue) - 2) + ((int) (((long) f19173c) ^ (-7649639543924978291L))) + i6;
                Object[] objArr5 = {jVar, Integer.valueOf(i3), Integer.valueOf(f19177g), sb};
                Object objA4 = d.a(1819197256);
                if (objA4 == null) {
                    objA4 = d.a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, (char) (5358 - (ViewConfiguration.getWindowTouchSlop() >> 8)), TextUtils.indexOf("", "") + 11, -1158980307, false, "j", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objA4).invoke(null, objArr5)).append(jVar.f19937e);
                jVar.f19935c = jVar.f19937e;
                byte[] bArr4 = f19178h;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        bArr5[i13] = (byte) (((long) bArr4[i13]) ^ (-7649639543924978291L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i14 = $11 + 23;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    z2 = true;
                } else {
                    int i16 = $10 + 45;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    z2 = false;
                }
                jVar.f19934b = 1;
                while (jVar.f19934b < iIntValue) {
                    int i18 = $10 + 1;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                    if (z2) {
                        byte[] bArr6 = f19178h;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((byte) (((byte) (((long) bArr6[r2]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    } else {
                        short[] sArr = f19180j;
                        jVar.f19936d = jVar.f19936d - 1;
                        jVar.f19937e = (char) (jVar.f19935c + (((short) (((short) (((long) sArr[r2]) ^ (-7649639543924978291L))) + s2)) ^ b2));
                    }
                    sb.append(jVar.f19937e);
                    jVar.f19935c = jVar.f19937e;
                    jVar.f19934b++;
                }
            }
            String string = sb.toString();
            int i20 = $11 + 99;
            $10 = i20 % 128;
            if (i20 % 2 != 0) {
                throw null;
            }
            objArr[0] = string;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002b -> B:17:0x0016). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void s(short r8, short r9, byte r10, java.lang.Object[] r11) {
        /*
            int r0 = r8 * 4
            int r8 = r0 + 4
            byte[] r7 = fr.antelop.sdk.digitalcard.SecureCardPushToTokenRequestor.$$a
            int r6 = r10 + 97
            int r1 = r9 * 2
            int r0 = 1 - r1
            byte[] r5 = new byte[r0]
            r4 = 0
            int r3 = 0 - r1
            if (r7 != 0) goto L30
            r1 = r8
            r6 = r3
            r2 = r4
        L16:
            int r8 = r8 + r6
            int r0 = r1 + 1
            r1 = r2
            r6 = r8
            r8 = r0
        L1c:
            byte r0 = (byte) r6
            r5[r1] = r0
            int r2 = r1 + 1
            if (r1 != r3) goto L2b
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            r11[r4] = r0
            return
        L2b:
            r0 = r7[r8]
            r1 = r8
            r8 = r0
            goto L16
        L30:
            r1 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.digitalcard.SecureCardPushToTokenRequestor.s(short, short, byte, java.lang.Object[]):void");
    }

    private static void t(int i2, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        char[] cArr;
        String str3 = str;
        String str4 = str2;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = $11 + 53;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        Object bytes = str4;
        if (str4 != null) {
            bytes = str4.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str3;
        if (str3 != null) {
            int i7 = $11 + 19;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                str3.toCharArray();
                throw null;
            }
            charArray = str3.toCharArray();
        }
        char[] cArr2 = (char[]) charArray;
        f fVar = new f();
        char[] cArr3 = f19175e;
        int i8 = -1;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 5;
                $10 = i10 % 128;
                int i11 = i10 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i9])};
                    Object objA = d.a(1618406102);
                    if (objA == null) {
                        byte b2 = (byte) i8;
                        objA = d.a(593 - Gravity.getAbsoluteGravity(0, 0), (char) (View.getDefaultSize(0, 0) + 13181), 11 - (ViewConfiguration.getTapTimeout() >> 16), -1225586509, false, $$e((byte) 37, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objA).invoke(null, objArr2)).charValue();
                    i9++;
                    i3 = 2;
                    i8 = -1;
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
        Object[] objArr3 = {Integer.valueOf(f19174d)};
        Object objA2 = d.a(-1503702982);
        int i12 = 31;
        float f2 = 0.0f;
        if (objA2 == null) {
            objA2 = d.a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 11, 1893380703, false, "F", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objA2).invoke(null, objArr3)).intValue();
        if (f19171a) {
            fVar.f19923e = bArr.length;
            char[] cArr5 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr5[fVar.f19922a] = (char) (cArr3[bArr[(fVar.f19923e - 1) - fVar.f19922a] + i2] - iIntValue);
                Object[] objArr4 = {fVar, fVar};
                Object objA3 = d.a(1540807955);
                if (objA3 == null) {
                    byte b3 = (byte) (-1);
                    objA3 = d.a(458 - KeyEvent.normalizeMetaState(0), (char) Drawable.resolveOpacity(0, 0), TextUtils.getTrimmedLength("") + 11, -1923924106, false, $$e((byte) 31, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objA3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!f19172b) {
            fVar.f19923e = iArr.length;
            char[] cArr6 = new char[fVar.f19923e];
            fVar.f19922a = 0;
            while (fVar.f19922a < fVar.f19923e) {
                cArr6[fVar.f19922a] = (char) (cArr3[iArr[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
                fVar.f19922a++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i13 = $10 + 61;
        $11 = i13 % 128;
        if (i13 % 2 == 0) {
            fVar.f19923e = cArr2.length;
            cArr = new char[fVar.f19923e];
            fVar.f19922a = 1;
        } else {
            fVar.f19923e = cArr2.length;
            cArr = new char[fVar.f19923e];
            fVar.f19922a = 0;
        }
        while (fVar.f19922a < fVar.f19923e) {
            cArr[fVar.f19922a] = (char) (cArr3[cArr2[(fVar.f19923e - 1) - fVar.f19922a] - i2] - iIntValue);
            Object[] objArr5 = {fVar, fVar};
            Object objA4 = d.a(1540807955);
            if (objA4 == null) {
                byte b4 = (byte) i12;
                byte b5 = (byte) (-1);
                objA4 = d.a(458 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 11 - (TypedValue.complexToFraction(0, f2, f2) > f2 ? 1 : (TypedValue.complexToFraction(0, f2, f2) == f2 ? 0 : -1)), -1923924106, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objA4).invoke(null, objArr5);
            i12 = 31;
            f2 = 0.0f;
        }
        objArr[0] = new String(cArr);
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final List<CustomerAuthenticationMethodType> getAuthenticatedMethods() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19181k + 103;
        f19176f = i3 % 128;
        int i4 = i3 % 2;
        List<i> listD = this.innerSecureDigitalCardPushToTokenRequestorProcess.d();
        if (i4 == 0) {
            return m.b(listD);
        }
        m.b(listD);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final CardPushUrl getCardPushUrl() {
        int i2 = 2 % 2;
        int i3 = f19181k + 37;
        f19176f = i3 % 128;
        if (i3 % 2 != 0) {
            this.innerSecureDigitalCardPushToTokenRequestorProcess.l();
            throw null;
        }
        c.C0331c c0331cL = this.innerSecureDigitalCardPushToTokenRequestorProcess.l();
        if (c0331cL == null) {
            return null;
        }
        CardPushUrl cardPushUrl = new CardPushUrl(c0331cL);
        int i4 = f19176f + 29;
        f19181k = i4 % 128;
        int i5 = i4 % 2;
        return cardPushUrl;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getCustomerAuthenticationPatternName() {
        String strG;
        int i2 = 2 % 2;
        int i3 = f19176f + 39;
        f19181k = i3 % 128;
        if (i3 % 2 == 0) {
            strG = this.innerSecureDigitalCardPushToTokenRequestorProcess.g();
            int i4 = 37 / 0;
        } else {
            strG = this.innerSecureDigitalCardPushToTokenRequestorProcess.g();
        }
        int i5 = f19176f + 29;
        f19181k = i5 % 128;
        if (i5 % 2 != 0) {
            return strG;
        }
        throw null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final String getMessage() {
        int i2 = 2 % 2;
        int i3 = f19176f + 113;
        int i4 = i3 % 128;
        f19181k = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 23;
        f19176f = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final boolean isOnline() {
        int i2 = 2 % 2;
        int i3 = f19176f + 9;
        f19181k = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.innerSecureDigitalCardPushToTokenRequestorProcess};
        int i5 = o.x.i.f26925h * 601961010;
        o.x.i.f26925h = i5;
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int iNextInt = new Random().nextInt(1592817291);
        int i6 = o.x.i.f26927j * 826423998;
        o.x.i.f26927j = i6;
        if (((Boolean) o.x.i.c(-571425008, i5, 571425009, iFreeMemory, i6, iNextInt, objArr)).booleanValue()) {
            return false;
        }
        int i7 = f19176f + 121;
        f19181k = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public final void launch(Context context, CustomCustomerAuthenticatedProcessCallback customCustomerAuthenticatedProcessCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        this.innerSecureDigitalCardPushToTokenRequestorProcess.d(context, new o.x.d(context, customCustomerAuthenticatedProcessCallback, this, this.innerSecureDigitalCardPushToTokenRequestorProcess));
        int i3 = f19176f + 9;
        f19181k = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 48 / 0;
        }
    }

    public final void launch(Context context, DefaultCustomerAuthenticatedProcessCallback defaultCustomerAuthenticatedProcessCallback) throws WalletValidationException {
        int i2 = 2 % 2;
        this.innerSecureDigitalCardPushToTokenRequestorProcess.d(context, new o.x.j(context, defaultCustomerAuthenticatedProcessCallback, this, this.innerSecureDigitalCardPushToTokenRequestorProcess));
        int i3 = f19176f + 23;
        f19181k = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // fr.antelop.sdk.authentication.CustomerAuthenticatedProcess
    public final void setCustomerCredentials(Context context, CustomerAuthenticationCredentials customerAuthenticationCredentials) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f19176f + 61;
        f19181k = i3 % 128;
        int i4 = i3 % 2;
        this.innerSecureDigitalCardPushToTokenRequestorProcess.e(context, customerAuthenticationCredentials);
        int i5 = f19181k + 7;
        f19176f = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setReturnUrl(String str) throws WalletValidationException {
        int i2 = 2 % 2;
        int i3 = f19181k + 65;
        f19176f = i3 % 128;
        int i4 = i3 % 2;
        this.innerSecureDigitalCardPushToTokenRequestorProcess.c(str);
        int i5 = f19176f + 79;
        f19181k = i5 % 128;
        int i6 = i5 % 2;
    }
}
