package com.incode.welcome_sdk.commons.utils;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import com.incode.welcome_sdk.ui.dynamic_forms.view.FormsSelectInputScreenKt;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ae {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static char[] f6364a = null;

    /* JADX INFO: renamed from: b */
    private static final char[] f6365b;

    /* JADX INFO: renamed from: c */
    private static char[] f6366c = null;

    /* JADX INFO: renamed from: d */
    private static final Map<String, byte[]> f6367d;

    /* JADX INFO: renamed from: e */
    private static char f6368e = 0;

    /* JADX INFO: renamed from: g */
    private static int f6369g = 0;

    /* JADX INFO: renamed from: h */
    private static int f6370h = 0;

    /* JADX INFO: renamed from: i */
    private static int f6371i = 0;

    /* JADX INFO: renamed from: j */
    private static int f6372j = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, int r9, int r10) {
        /*
            byte[] r7 = com.incode.welcome_sdk.commons.utils.ae.$$a
            int r0 = r10 * 4
            int r6 = 4 - r0
            int r1 = r9 * 3
            int r0 = 1 - r1
            int r5 = r8 + 102
            byte[] r4 = new byte[r0]
            r3 = 0
            int r2 = 0 - r1
            if (r7 != 0) goto L28
            r0 = r2
            r1 = r3
        L15:
            int r6 = r6 + 1
            int r5 = r5 + r0
        L18:
            byte r0 = (byte) r5
            r4[r1] = r0
            if (r1 != r2) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L23:
            int r1 = r1 + 1
            r0 = r7[r6]
            goto L15
        L28:
            r1 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.ae.$$c(int, int, int):java.lang.String");
    }

    public static /* synthetic */ Object b(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) throws Throwable {
        int i8 = ~i7;
        int i9 = ~(i8 | i6);
        int i10 = ~i6;
        int i11 = ~((~i2) | i10);
        int i12 = ~(i10 | i7);
        int i13 = i11 | i12;
        int i14 = (~(i2 | i8)) | i12 | i9;
        int i15 = i6 + i7 + i5 + ((-168536539) * i3) + (1787681333 * i4);
        int i16 = i15 * i15;
        int i17 = ((-1349843359) * i6) + 1460535296 + ((-923239215) * i7) + ((-1716058528) * i9) + (i13 * (-1289454384)) + ((-1289454384) * i14) + (366215168 * i5) + (1604583424 * i3) + (216268800 * i4) + (1778253824 * i16);
        int i18 = (i6 * (-925914073)) + 175428941 + (i7 * (-925912777)) + (i9 * (-864)) + (i13 * 432) + (i14 * 432) + (i5 * (-925913209)) + (i3 * 1252505731) + (i4 * 30625011) + (i16 * (-2030960640));
        int i19 = i17 + (i18 * i18 * 899809280);
        if (i19 == 1) {
            String str = (String) objArr[0];
            SecretKey secretKey = (SecretKey) objArr[1];
            int i20 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Cipher cipher = Cipher.getInstance(g());
            byte[] bArrB = com.incode.welcome_sdk.commons.httpinterceptors.f.b(12);
            cipher.init(1, secretKey, new IvParameterSpec(bArrB));
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            byte[] bArrDoFinal = cipher.doFinal(bytes);
            Map<String, byte[]> map = f6367d;
            Intrinsics.checkNotNull(bArrDoFinal);
            Charset charset2 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset2, "");
            map.put(new String(bArrDoFinal, charset2), bArrB);
            int i21 = f6369g + 79;
            f6370h = i21 % 128;
            int i22 = i21 % 2;
            return bArrDoFinal;
        }
        if (i19 == 2) {
            int i23 = 2 % 2;
            Object[] objArr2 = new Object[1];
            f("9(\r\u00140'\u0017$2E\u001f\u0018'\u0015(483\b7@=\u0016>5N\u0011I\u001b\u0003\n\u0002-\u0007(\u00077L\nI\u001b.\r\u00149\u001f5\u001b\u001e(;/\u001b\u0003\u0015>G\u001f\u000bAG\u001f\u0019\u001e0)\u001457O6\u00000!\u001b. \u001b 36\u001e@\u0018\u001b0N#M\u0011@ 9+.I\f\u000f\rL㙆㙆;FM\u0011\u000314#6F\u000e(+B+=\n<\u001c\u001a\u0007&\u0001\u0017)\u0013\u001c\bMB㙃㙃\t\u0013#\u001d&\n#J\u0010\u000e;\u0015+I\u001c\b\u001f\u00141G<\u0007\u0001\u0017\u001d\u001e0\u0013.2\u001c%\u0010E\u001aH\u0001\u0017=%;M\tN80\u001e<\u0000\t㙢㙢\u0001\u001eC\u0001 2\u0015CF:/\r.F\t\u001b\u0001B4(\"2IF9K=J0J\u001aDD9\fB\u0015\u0005?\u00170\u0002A\t\f2@\u0013M6\u0000KM6,@\n\u0004\t\u0000PJ9I\u0010\u001e\u00029E\u001fM1D\u0003F)#C\u0000\u00185-", (byte) ((KeyEvent.getMaxKeyCode() >> 16) + PanasonicMakernoteDirectory.TAG_BURST_SPEED), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 267, objArr2);
            byte[] bArrD = d(((String) objArr2[0]).intern());
            Intrinsics.checkNotNull(bArrD);
            String str2 = new String(bArrD, Charsets.UTF_8);
            int i24 = f6370h + 7;
            f6369g = i24 % 128;
            int i25 = i24 % 2;
            return str2;
        }
        String str3 = (String) objArr[0];
        int i26 = 2 % 2;
        int i27 = f6370h + 123;
        f6369g = i27 % 128;
        int i28 = i27 % 2;
        Intrinsics.checkNotNullParameter(str3, "");
        byte[] bytes2 = str3.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        byte[] bArrDecode = Base64.decode(bytes2, 2);
        Intrinsics.checkNotNullExpressionValue("IncodeWelcomeRepository", "");
        byte[] bytes3 = "IncodeWelcomeRepository".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes3, "");
        byte[] bArrC = c(bArrDecode, bytes3);
        int i29 = f6370h + 83;
        f6369g = i29 % 128;
        int i30 = i29 % 2;
        return bArrC;
    }

    static void init$0() {
        $$a = new byte[]{34, -105, 53, -7};
        $$b = 30;
    }

    private ae() {
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f6372j = 0;
        f6371i = 1;
        f6370h = 0;
        f6369g = 1;
        h();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        KeyEvent.getDeadChar(0, 0);
        new ae();
        Object[] objArr = new Object[1];
        f("\u0014\u0003\u0011\u00057\u000ePC(\u0007'01\u001d\u0013#", (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 57), (ViewConfiguration.getJumpTapTimeout() >> 16) + 16, objArr);
        char[] charArray = ((String) objArr[0]).intern().toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "");
        f6365b = charArray;
        f6367d = new LinkedHashMap();
        int i2 = f6371i + 79;
        f6372j = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final String c(String str, byte[] bArr) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = new Object[1];
        f("D\u0016<B\u0016L \f\rI", (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 66), 9 - ExpandableListView.getPackedPositionChild(0L), objArr);
        Mac mac = Mac.getInstance(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        f("D\u0016<B\u0016L \f\rI", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 67), TextUtils.lastIndexOf("", '0', 0) + 11, objArr2);
        mac.init(new SecretKeySpec(bArr, ((String) objArr2[0]).intern()));
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(charset, "");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDoFinal = mac.doFinal(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "");
        String strE = e(bArrDoFinal);
        int i3 = f6370h + 105;
        f6369g = i3 % 128;
        int i4 = i3 % 2;
        return strE;
    }

    @JvmStatic
    public static final String e() throws Throwable {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        k(new int[]{0, 62, 0, 10}, false, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", objArr);
        String strIntern = ((String) objArr[0]).intern();
        IntRange intRange = new IntRange(1, 16);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int i3 = f6369g + 39;
            f6370h = i3 % 128;
            if (i3 % 2 != 0) {
                ((IntIterator) it).nextInt();
                arrayList.add(Character.valueOf(StringsKt.random(strIntern, Random.Default)));
                int i4 = 89 / 0;
            } else {
                ((IntIterator) it).nextInt();
                arrayList.add(Character.valueOf(StringsKt.random(strIntern, Random.Default)));
            }
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
        int i5 = f6369g + 9;
        f6370h = i5 % 128;
        int i6 = i5 % 2;
        return strJoinToString$default;
    }

    public static final byte[] c() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f6370h + 93;
        f6369g = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        f("\u000fD<D\u0000\u0003:\u0003FC\u0000\u0003;\f\u0000\u0005A\bC\b\fD&\u0007\u0013\f\u0007&A#\u000b\u0005\u0003\u0017#/\b1\u0010)#/\rM>\u0011\u000b\u001c\bC>0\u00058\u001eB㖻㖻\u0014\u001e㘉㘉\u0003\u0014", (byte) (Process.getGidForName("") + 15), 64 - Color.green(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(charset, "");
        byte[] bytes = strIntern.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        int i5 = f6369g + 25;
        f6370h = i5 % 128;
        int i6 = i5 % 2;
        return bytes;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0034, code lost:
    
        r0 = r4.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003b, code lost:
    
        return r0;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String e(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = 2
            int r0 = r6 % r6
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>(r7)
            r5 = 0
        L11:
            r0 = 64
            if (r5 >= r0) goto L34
            int r0 = r7.length()
            int r2 = r5 + 1
            int r1 = r2 << 6
            if (r0 > r1) goto L3c
            int r0 = com.incode.welcome_sdk.commons.utils.ae.f6369g
            int r1 = r0 + 39
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.ae.f6370h = r0
            int r1 = r1 % r6
            if (r1 != 0) goto L4f
            java.lang.String r0 = r8.substring(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            r4.append(r0)
        L34:
            java.lang.String r0 = r4.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            return r0
        L3c:
            int r1 = r1 + r5
            char r0 = r8.charAt(r5)
            r4.insert(r1, r0)
            int r0 = com.incode.welcome_sdk.commons.utils.ae.f6370h
            int r1 = r0 + 17
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.ae.f6369g = r0
            int r1 = r1 % r6
            r5 = r2
            goto L11
        L4f:
            java.lang.String r0 = r8.substring(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            r4.append(r0)
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.ae.e(java.lang.String, java.lang.String):java.lang.String");
    }

    private static String e(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = f6369g + 89;
        f6370h = i3 % 128;
        int i4 = 0;
        char[] cArr = new char[i3 % 2 != 0 ? bArr.length : bArr.length << 1];
        int length = bArr.length;
        while (i4 < length) {
            int i5 = f6370h + 33;
            int i6 = i5 % 128;
            f6369g = i6;
            int i7 = i5 % 2;
            byte b2 = bArr[i4];
            int i8 = i4 << 1;
            char[] cArr2 = f6365b;
            cArr[i8] = cArr2[(b2 & 255) >>> 4];
            cArr[i8 + 1] = cArr2[b2 & Ascii.SI];
            i4++;
            int i9 = i6 + 95;
            f6370h = i9 % 128;
            int i10 = i9 % 2;
        }
        return new String(cArr);
    }

    @JvmStatic
    public static final String b(String str) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = new Object[1];
        f("\u0016L#'㗝", (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 50), 6 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        int i3 = 0;
        MessageDigest messageDigest = MessageDigest.getInstance(((String) objArr[0]).intern());
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String string = new BigInteger(1, messageDigest.digest(bytes)).toString(16);
        if (string.length() < 40) {
            int length = 40 - string.length();
            StringBuilder sb = new StringBuilder();
            int i4 = f6369g + 97;
            f6370h = i4 % 128;
            while (true) {
                int i5 = i4 % 2;
                if (i3 >= length) {
                    break;
                }
                sb.append('0');
                i3++;
                i4 = f6370h + 33;
                f6369g = i4 % 128;
            }
            sb.append(string);
            string = sb.toString();
        }
        Intrinsics.checkNotNull(string);
        return string;
    }

    @JvmStatic
    public static final void c(String str) {
        int i2 = 2 % 2;
        int i3 = f6369g + 23;
        f6370h = i3 % 128;
        if (i3 % 2 != 0) {
            com.incode.welcome_sdk.commons.c.f4652d = str;
            int i4 = 8 / 0;
        } else {
            com.incode.welcome_sdk.commons.c.f4652d = str;
        }
        int i5 = f6369g + 123;
        f6370h = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ SecretKey b() throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        int i3 = f6370h + 51;
        f6369g = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[1];
            k(new int[]{65, 32, 0, 0}, true, "\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            k(new int[]{65, 32, 0, 0}, false, "\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000", objArr2);
            obj = objArr2[0];
        }
        return a(((String) obj).intern());
    }

    @JvmStatic
    private static SecretKey a(String str) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        Object[] objArr = new Object[1];
        k(new int[]{62, 3, 58, 3}, true, "\u0001\u0000\u0000", objArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, ((String) objArr[0]).intern());
        int i3 = f6370h + 95;
        f6369g = i3 % 128;
        int i4 = i3 % 2;
        return secretKeySpec;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x001b, code lost:
    
        if ((!com.incode.welcome_sdk.commons.utils.ae.f6367d.isEmpty()) != true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x001d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0024, code lost:
    
        if (com.incode.welcome_sdk.commons.utils.ae.f6367d.isEmpty() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:
    
        r5 = javax.crypto.Cipher.getInstance(g());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0031, code lost:
    
        if (r7 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0033, code lost:
    
        r0 = java.nio.charset.StandardCharsets.UTF_8;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r2 = new java.lang.String(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003d, code lost:
    
        r1 = com.incode.welcome_sdk.commons.utils.ae.f6367d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0043, code lost:
    
        if (r1.containsKey(r2) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0045, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0046, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0048, code lost:
    
        r5.init(2, r8, new javax.crypto.spec.IvParameterSpec(r1.get(r2)));
        r1 = r5.doFinal(r7);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r0 = java.nio.charset.StandardCharsets.UTF_8;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
        r2 = new java.lang.String(r1, r0);
        r1 = com.incode.welcome_sdk.commons.utils.ae.f6370h + 69;
        com.incode.welcome_sdk.commons.utils.ae.f6369g = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0074, code lost:
    
        if ((r1 % 2) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0076, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0077, code lost:
    
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007a, code lost:
    
        throw null;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String d(byte[] r7, javax.crypto.SecretKey r8) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.io.UnsupportedEncodingException, java.security.InvalidAlgorithmParameterException {
        /*
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.commons.utils.ae.f6370h
            int r1 = r0 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.ae.f6369g = r0
            int r1 = r1 % r4
            r6 = 0
            if (r1 != 0) goto L1e
            java.util.Map<java.lang.String, byte[]> r0 = com.incode.welcome_sdk.commons.utils.ae.f6367d
            boolean r1 = r0.isEmpty()
            r0 = 95
            int r0 = r0 / 0
            r0 = 1
            r1 = r1 ^ r0
            if (r1 == r0) goto L27
        L1d:
            return r6
        L1e:
            java.util.Map<java.lang.String, byte[]> r0 = com.incode.welcome_sdk.commons.utils.ae.f6367d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L27
            goto L1d
        L27:
            java.lang.String r0 = g()
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r0)
            java.lang.String r3 = ""
            if (r7 == 0) goto L46
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.String r2 = new java.lang.String
            r2.<init>(r7, r0)
        L3d:
            java.util.Map<java.lang.String, byte[]> r1 = com.incode.welcome_sdk.commons.utils.ae.f6367d
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L48
            return r6
        L46:
            r2 = r6
            goto L3d
        L48:
            java.lang.Object r1 = r1.get(r2)
            byte[] r1 = (byte[]) r1
            java.security.Key r8 = (java.security.Key) r8
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec
            r0.<init>(r1)
            java.security.spec.AlgorithmParameterSpec r0 = (java.security.spec.AlgorithmParameterSpec) r0
            r5.init(r4, r8, r0)
            byte[] r1 = r5.doFinal(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1, r0)
            int r0 = com.incode.welcome_sdk.commons.utils.ae.f6370h
            int r1 = r0 + 69
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.ae.f6369g = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L77
            return r2
        L77:
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.ae.d(byte[], javax.crypto.SecretKey):java.lang.String");
    }

    private static byte[] c(byte[] bArr, byte[] bArr2) {
        int i2 = 2 % 2;
        if (bArr != null) {
            if (bArr.length == 0) {
                int i3 = f6370h + 43;
                f6369g = i3 % 128;
                int i4 = i3 % 2;
            } else {
                int i5 = f6370h;
                int i6 = i5 + 71;
                f6369g = i6 % 128;
                int i7 = i6 % 2;
                if (bArr2 != null) {
                    int i8 = i5 + 103;
                    int i9 = i8 % 128;
                    f6369g = i9;
                    if (i8 % 2 == 0) {
                        int length = bArr2.length;
                        throw null;
                    }
                    if (bArr2.length != 0) {
                        byte[] bArr3 = new byte[bArr.length];
                        int length2 = bArr.length;
                        for (int i10 = 0; i10 < length2; i10++) {
                            bArr3[i10] = (byte) ((bArr[i10] ^ bArr2[i10 % bArr2.length]) ^ (i10 & 255));
                        }
                        int i11 = f6370h + 123;
                        f6369g = i11 % 128;
                        int i12 = i11 % 2;
                        return bArr3;
                    }
                    int i13 = i9 + 95;
                    f6370h = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
        }
        return bArr;
    }

    private static String g() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f6369g + 31;
        f6370h = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        k(new int[]{97, 21, 0, 18}, false, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000", objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i5 = f6369g + 51;
        f6370h = i5 % 128;
        if (i5 % 2 == 0) {
            return strIntern;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void k(int[] iArr, boolean z2, String str, Object[] objArr) throws Throwable {
        int i2;
        String str2 = str;
        int i3 = 2 % 2;
        int i4 = 0;
        Object bytes = str2;
        if (str2 != null) {
            int i5 = $11 + 47;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 53 / 0;
                bytes = str2.getBytes("ISO-8859-1");
            } else {
                bytes = str2.getBytes("ISO-8859-1");
            }
        }
        byte[] bArr = (byte[]) bytes;
        com.c.a.o oVar = new com.c.a.o();
        int i7 = iArr[0];
        int i8 = iArr[1];
        int i9 = iArr[2];
        int i10 = iArr[3];
        char[] cArr = f6364a;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i11])};
                    Object objC = com.c.a.e.e.c(-1916745907);
                    if (objC == null) {
                        char cResolveOpacity = (char) Drawable.resolveOpacity(i4, i4);
                        int mode = View.MeasureSpec.getMode(i4) + 27;
                        int iGreen = Color.green(i4) + 961;
                        byte b2 = (byte) i4;
                        byte b3 = b2;
                        objC = com.c.a.e.e.e(cResolveOpacity, mode, iGreen, -1923431116, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr2[i11] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    i11++;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i8];
        System.arraycopy(cArr, i7, cArr3, 0, i8);
        if (bArr != null) {
            char[] cArr4 = new char[i8];
            oVar.f2783d = 0;
            char c2 = 0;
            while (oVar.f2783d < i8) {
                if (bArr[oVar.f2783d] == 1) {
                    int i12 = oVar.f2783d;
                    Object[] objArr3 = {Integer.valueOf(cArr3[oVar.f2783d]), Integer.valueOf(c2)};
                    Object objC2 = com.c.a.e.e.c(83881166);
                    if (objC2 == null) {
                        objC2 = com.c.a.e.e.e((char) (60229 - ImageFormat.getBitsPerPixel(0)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17, 33 - (ViewConfiguration.getLongPressTimeout() >> 16), 73789111, false, "j", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objC2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = oVar.f2783d;
                    Object[] objArr4 = {Integer.valueOf(cArr3[oVar.f2783d]), Integer.valueOf(c2)};
                    Object objC3 = com.c.a.e.e.c(1697816169);
                    if (objC3 == null) {
                        byte b4 = (byte) 1;
                        byte b5 = (byte) (b4 - 1);
                        objC3 = com.c.a.e.e.e((char) (60521 - TextUtils.getCapsMode("", 0, 0)), Color.red(0) + 20, 921 - ((byte) KeyEvent.getModifierMetaStateMask()), 1705548816, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objC3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[oVar.f2783d];
                Object[] objArr5 = {oVar, oVar};
                Object objC4 = com.c.a.e.e.c(-2143286564);
                if (objC4 == null) {
                    objC4 = com.c.a.e.e.e((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 48811), (ViewConfiguration.getJumpTapTimeout() >> 16) + 16, ExpandableListView.getPackedPositionType(0L) + 101, -2133194587, false, "h", new Class[]{Object.class, Object.class});
                }
                ((Method) objC4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i10 > 0) {
            int i14 = $11 + 97;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                char[] cArr5 = new char[i8];
                i2 = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i8);
                System.arraycopy(cArr5, 0, cArr3, i8 << i10, i10);
                System.arraycopy(cArr5, i10, cArr3, 1, i8 % i10);
            } else {
                i2 = 0;
                char[] cArr6 = new char[i8];
                System.arraycopy(cArr3, 0, cArr6, 0, i8);
                int i15 = i8 - i10;
                System.arraycopy(cArr6, 0, cArr3, i15, i10);
                System.arraycopy(cArr6, i10, cArr3, 0, i15);
            }
        } else {
            i2 = 0;
        }
        if (z2) {
            char[] cArr7 = new char[i8];
            while (true) {
                oVar.f2783d = i2;
                if (oVar.f2783d >= i8) {
                    break;
                }
                cArr7[oVar.f2783d] = cArr3[(i8 - oVar.f2783d) - 1];
                i2 = oVar.f2783d + 1;
            }
            cArr3 = cArr7;
        }
        if (i9 > 0) {
            int i16 = 0;
            while (true) {
                oVar.f2783d = i16;
                if (oVar.f2783d >= i8) {
                    break;
                }
                int i17 = $10 + 19;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                cArr3[oVar.f2783d] = (char) (cArr3[oVar.f2783d] - iArr[2]);
                i16 = oVar.f2783d + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void f(String str, byte b2, int i2, Object[] objArr) throws Throwable {
        int i3;
        int i4;
        String str2 = str;
        int i5 = 2 % 2;
        Object charArray = str2;
        if (str2 != null) {
            int i6 = $11 + 21;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 1 / 0;
                charArray = str2.toCharArray();
            } else {
                charArray = str2.toCharArray();
            }
        }
        char[] cArr = (char[]) charArray;
        com.c.a.f fVar = new com.c.a.f();
        char[] cArr2 = f6366c;
        int i8 = 19;
        int i9 = 1768797182;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i10])};
                    Object objC = com.c.a.e.e.c(i9);
                    if (objC == null) {
                        byte b3 = (byte) 0;
                        objC = com.c.a.e.e.e((char) (29971 - Color.blue(0)), 18 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 828, 1777840519, false, $$c((byte) i8, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i10] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                    i10++;
                    i8 = 19;
                    i9 = 1768797182;
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
        Object[] objArr3 = {Integer.valueOf(f6368e)};
        Object objC2 = com.c.a.e.e.c(1768797182);
        if (objC2 == null) {
            byte b4 = (byte) 0;
            objC2 = com.c.a.e.e.e((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 29971), View.MeasureSpec.getSize(0) + 18, 828 - View.MeasureSpec.getSize(0), 1777840519, false, $$c((byte) 19, b4, b4), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objC2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            int i11 = $11 + 25;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                i3 = i2 + 33;
                cArr4[i3] = (char) (cArr[i3] << b2);
            } else {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b2);
            }
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            int i12 = $10 + 87;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            fVar.f2749e = 0;
            while (fVar.f2749e < i3) {
                fVar.f2747c = cArr[fVar.f2749e];
                fVar.f2746b = cArr[fVar.f2749e + 1];
                if (fVar.f2747c == fVar.f2746b) {
                    int i14 = $11 + 57;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        cArr4[fVar.f2749e] = (char) (fVar.f2747c >>> b2);
                        cArr4[fVar.f2749e] = (char) (fVar.f2746b + b2);
                    } else {
                        cArr4[fVar.f2749e] = (char) (fVar.f2747c - b2);
                        cArr4[fVar.f2749e + 1] = (char) (fVar.f2746b - b2);
                    }
                } else {
                    Object[] objArr4 = {fVar, fVar, Integer.valueOf(cCharValue), fVar, fVar, Integer.valueOf(cCharValue), fVar, fVar, Integer.valueOf(cCharValue), fVar, fVar, Integer.valueOf(cCharValue), fVar};
                    Object objC3 = com.c.a.e.e.c(1369381351);
                    if (objC3 == null) {
                        byte b5 = (byte) 0;
                        objC3 = com.c.a.e.e.e((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 49572), 20 - (Process.myTid() >> 22), (-16775994) - Color.rgb(0, 0, 0), 1359289246, false, $$c((byte) ($$b & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION), b5, b5), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objC3).invoke(null, objArr4)).intValue() == fVar.f2750f) {
                        int i15 = $11 + 87;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                        Object[] objArr5 = {fVar, fVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), fVar, fVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), fVar, Integer.valueOf(cCharValue), fVar};
                        Object objC4 = com.c.a.e.e.c(-486756316);
                        if (objC4 == null) {
                            byte b6 = (byte) 0;
                            objC4 = com.c.a.e.e.e((char) (27450 - TextUtils.lastIndexOf("", '0')), TextUtils.lastIndexOf("", '0', 0) + 20, View.MeasureSpec.getSize(0) + 392, -496586147, false, $$c((byte) ($$b & 115), b6, b6), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objC4).invoke(null, objArr5)).intValue();
                        int i17 = (fVar.f2745a * cCharValue) + fVar.f2750f;
                        cArr4[fVar.f2749e] = cArr2[iIntValue];
                        cArr4[fVar.f2749e + 1] = cArr2[i17];
                    } else if (fVar.f2748d == fVar.f2745a) {
                        fVar.f2751h = ((fVar.f2751h + cCharValue) - 1) % cCharValue;
                        fVar.f2750f = ((fVar.f2750f + cCharValue) - 1) % cCharValue;
                        int i18 = (fVar.f2748d * cCharValue) + fVar.f2751h;
                        int i19 = (fVar.f2745a * cCharValue) + fVar.f2750f;
                        cArr4[fVar.f2749e] = cArr2[i18];
                        cArr4[fVar.f2749e + 1] = cArr2[i19];
                    } else {
                        int i20 = (fVar.f2748d * cCharValue) + fVar.f2750f;
                        int i21 = (fVar.f2745a * cCharValue) + fVar.f2751h;
                        cArr4[fVar.f2749e] = cArr2[i20];
                        cArr4[fVar.f2749e + 1] = cArr2[i21];
                        int i22 = $10 + 87;
                        $11 = i22 % 128;
                        i4 = 2;
                        int i23 = i22 % 2;
                        fVar.f2749e += i4;
                    }
                }
                i4 = 2;
                fVar.f2749e += i4;
            }
        }
        for (int i24 = 0; i24 < i2; i24++) {
            cArr4[i24] = (char) (cArr4[i24] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    static void h() {
        f6366c = new char[]{23094, 23051, 23151, 23087, 23143, 23099, 23081, 22980, 23149, 23102, 23147, 23047, 23079, 23053, 23148, 23082, 22981, 22982, 23063, 23049, 22986, 23150, 23084, 23091, 22985, 22978, 23067, 23078, 23064, 23098, 23071, 23066, 23076, 23085, 23046, 23055, 22989, 23090, 22977, 23068, 22988, 23088, 22976, 23142, 23155, 23093, 23044, 23069, 23157, 23080, 23057, 23059, 23065, 23096, 22991, 23092, 23089, 23103, 23058, 23146, 23054, 23056, 23095, 23153, 23086, 22979, 23100, 23062, 23097, 23101, 23050, 23145, 23061, 23052, 22990, 23060, 23144, 22983, 22984, 23083, 23048};
        f6368e = (char) 28621;
        f6364a = new char[]{30784, 30824, 30825, 30826, 30827, 30828, 30829, 30830, 30831, 30816, 30821, 30745, 30746, 30747, 30748, 30749, 30750, 30751, 30736, 30737, 30738, 30739, 30740, 30741, 30742, 30743, 30728, 30729, 30730, 30731, 30732, 30733, 30734, 30735, 30720, 30721, 30725, 30777, 30778, 30779, 30780, 30781, 30782, 30783, 30768, 30769, 30770, 30771, 30772, 30773, 30774, 30775, 30760, 30761, 30762, 30763, 30764, 30765, 30766, 30767, 30752, 30753, 30750, 30942, 30757, 30787, 30746, 30724, 30726, 30725, 30724, 30740, 30738, 30822, 30747, 30748, 30730, 30760, 30776, 30776, 30722, 30721, 30726, 30721, 30779, 30737, 30732, 30773, 30732, 30820, 30746, 30778, 30765, 30763, 30771, 30725, 30742, 30839, 30736, 30827, 30829, 30826, 30819, 30749, 30736, 30822, 30822, 30726, 30727, 30720, 30778, 30780, 30782, 30771, 30770, 30732, 30747, 30740, 30840, 30747, 30740, 30745, 30819, 30749, 30736, 30822, 30822, 30726, 30727, 30720, 30778, 30780, 30782, 30771, 30770};
    }

    @JvmStatic
    public static final SecretKey d() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f6370h + 29;
        f6369g = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            b();
            throw null;
        }
        SecretKey secretKeyB = b();
        int i4 = f6369g + 23;
        f6370h = i4 % 128;
        if (i4 % 2 == 0) {
            return secretKeyB;
        }
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final String a() {
        int iB = FormsSelectInputScreenKt.h.b();
        int iB2 = FormsSelectInputScreenKt.h.b();
        return (String) b(iB, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), iB2, -643729730, 643729732, new Object[0]);
    }

    @JvmStatic
    private static byte[] d(String str) {
        int iB = FormsSelectInputScreenKt.h.b();
        int iB2 = FormsSelectInputScreenKt.h.b();
        return (byte[]) b(iB, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), iB2, -2005058287, 2005058287, new Object[]{str});
    }

    @JvmStatic
    public static final byte[] c(String str, SecretKey secretKey) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        int iB = FormsSelectInputScreenKt.h.b();
        int iB2 = FormsSelectInputScreenKt.h.b();
        return (byte[]) b(iB, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), iB2, 1880353, -1880352, new Object[]{str, secretKey});
    }
}
