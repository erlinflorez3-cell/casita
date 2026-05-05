package com.incode.welcome_sdk.commons.utils;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.incode.welcome_sdk.R;
import cz.msebera.android.httpclient.message.TokenParser;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class StringUtils {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    public static final int $stable = 0;
    public static final StringUtils INSTANCE;

    /* JADX INFO: renamed from: a */
    private static int f6335a = 0;

    /* JADX INFO: renamed from: b */
    private static int f6336b = 0;

    /* JADX INFO: renamed from: c */
    private static int f6337c = 0;

    /* JADX INFO: renamed from: d */
    private static char[] f6338d = null;

    /* JADX INFO: renamed from: e */
    private static long f6339e = 0;

    /* JADX INFO: renamed from: f */
    private static int f6340f = 0;

    private static String $$c(int i2, short s2, short s3) {
        int i3 = (s2 * 4) + 4;
        byte[] bArr = $$a;
        int i4 = s3 * 3;
        int i5 = 116 - i2;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i3++;
            i5 = i6 + i3;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            int i8 = bArr[i3];
            i3++;
            i5 += i8;
        }
    }

    static void init$0() {
        $$a = new byte[]{34, -105, 53, -7};
        $$b = 95;
    }

    private StringUtils() {
    }

    @JvmStatic
    public static final String addTrailingSlash(String str) {
        String str2;
        int i2 = 2 % 2;
        int i3 = f6335a + 75;
        f6337c = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            str2 = str + RemoteSettings.FORWARD_SLASH_STRING;
            int i4 = 98 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            str2 = str + RemoteSettings.FORWARD_SLASH_STRING;
        }
        int i5 = f6337c + 61;
        f6335a = i5 % 128;
        if (i5 % 2 != 0) {
            return str2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @JvmStatic
    public static final String removeTrailingSlash(String str) {
        int i2 = 2 % 2;
        int i3 = f6337c + 15;
        f6335a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strRemoveSuffix = StringsKt.removeSuffix(str, (CharSequence) RemoteSettings.FORWARD_SLASH_STRING);
        int i5 = f6337c + 85;
        f6335a = i5 % 128;
        int i6 = i5 % 2;
        return strRemoveSuffix;
    }

    @JvmStatic
    public static final String getFirstWord(String str) {
        int i2;
        int i3 = 2 % 2;
        int i4 = f6335a + 93;
        f6337c = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        if (str == null) {
            return null;
        }
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, TokenParser.SP, 0, false, 6, (Object) null);
        if (iIndexOf$default < 0) {
            int i6 = f6337c + 97;
            f6335a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 98 / 0;
            }
            return str;
        }
        int i8 = f6335a + 83;
        f6337c = i8 % 128;
        int i9 = i8 % 2;
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        String str2 = strSubstring;
        int length = str2.length() - 1;
        int i10 = 0;
        boolean z2 = false;
        while (i10 <= length) {
            if (z2) {
                i2 = length;
            } else {
                int i11 = f6337c + 37;
                f6335a = i11 % 128;
                if (i11 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                i2 = i10;
            }
            boolean z3 = Intrinsics.compare((int) str2.charAt(i2), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                }
                int i12 = f6335a + 55;
                f6337c = i12 % 128;
                int i13 = i12 % 2;
                length--;
            } else if (z3) {
                i10++;
            } else {
                int i14 = f6337c + 71;
                f6335a = i14 % 128;
                int i15 = i14 % 2;
                z2 = true;
            }
        }
        return str2.subSequence(i10, length + 1).toString();
    }

    @JvmStatic
    public static final String capitalizeAllWords(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = f6337c + 57;
        f6335a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strCapitalizeWords = INSTANCE.capitalizeWords(str);
        int i5 = f6337c + 33;
        f6335a = i5 % 128;
        if (i5 % 2 != 0) {
            return strCapitalizeWords;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class d extends Lambda implements Function1<String, CharSequence> {

        /* JADX INFO: renamed from: a */
        private static int f6341a = 1;

        /* JADX INFO: renamed from: b */
        private static int f6342b = 0;

        /* JADX INFO: renamed from: c */
        public static final d f6343c = new d();

        /* JADX INFO: renamed from: d */
        private static int f6344d = 0;

        /* JADX INFO: renamed from: e */
        private static int f6345e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CharSequence invoke(String str) {
            int i2 = 2 % 2;
            int i3 = f6341a + 85;
            f6342b = i3 % 128;
            String str2 = str;
            if (i3 % 2 == 0) {
                return a(str2);
            }
            a(str2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x002a A[PHI: r2
  0x002a: PHI (r2v6 java.lang.String) = (r2v0 java.lang.String), (r2v7 java.lang.String) binds: [B:27:0x006c, B:20:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006f A[PHI: r2
  0x006f: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v7 java.lang.String) binds: [B:27:0x006c, B:20:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.CharSequence a(java.lang.String r7) {
            /*
                r6 = 2
                int r0 = r6 % r6
                int r0 = com.incode.welcome_sdk.commons.utils.StringUtils.d.f6341a
                int r1 = r0 + 111
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.utils.StringUtils.d.f6342b = r0
                int r1 = r1 % r6
                r4 = 1
                r5 = 0
                java.lang.String r3 = ""
                if (r1 == 0) goto L59
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
                java.util.Locale r0 = java.util.Locale.ROOT
                java.lang.String r2 = r7.toLowerCase(r0)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                r0 = r2
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r1 = r0.length()
                r0 = 25
                int r0 = r0 / r5
                if (r1 <= 0) goto L6f
            L2a:
                r0 = r4
            L2b:
                if (r0 == 0) goto L4d
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                char r0 = r2.charAt(r5)
                java.lang.String r0 = kotlin.text.CharsKt.titlecase(r0)
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = r2.substring(r4)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r2 = r0.toString()
            L4d:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                int r0 = com.incode.welcome_sdk.commons.utils.StringUtils.d.f6342b
                int r1 = r0 + 53
                int r0 = r1 % 128
                com.incode.welcome_sdk.commons.utils.StringUtils.d.f6341a = r0
                int r1 = r1 % r6
                return r2
            L59:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
                java.util.Locale r0 = java.util.Locale.ROOT
                java.lang.String r2 = r7.toLowerCase(r0)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                r0 = r2
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                if (r0 <= 0) goto L6f
                goto L2a
            L6f:
                r0 = r5
                goto L2b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.StringUtils.d.a(java.lang.String):java.lang.CharSequence");
        }

        static {
            int i2 = f6345e + 117;
            f6344d = i2 % 128;
            int i3 = i2 % 2;
        }

        d() {
            super(1);
        }
    }

    private final String capitalizeWords(String str) throws Throwable {
        int i2 = 2 % 2;
        String[] strArr = (String[]) new Regex("\\s+").split(StringsKt.trim((CharSequence) str).toString(), 0).toArray(new String[0]);
        Object[] objArr = new Object[1];
        g(Process.getGidForName("") + 1, -TextUtils.lastIndexOf("", '0', 0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        String strJoinToString$default = ArraysKt.joinToString$default(strArr, ((String) objArr[0]).intern(), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, d.f6343c, 30, (Object) null);
        int i3 = f6335a + 115;
        f6337c = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 34 / 0;
        }
        return strJoinToString$default;
    }

    @JvmStatic
    public static final boolean isEmpty(CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = f6337c + 63;
        f6335a = i3 % 128;
        int i4 = i3 % 2;
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        int i5 = f6337c + 113;
        f6335a = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0018  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean isNotEmpty(java.lang.CharSequence r5) {
        /*
            r4 = 2
            int r0 = r4 % r4
            r3 = 0
            r2 = 1
            if (r5 == 0) goto L18
            int r0 = com.incode.welcome_sdk.commons.utils.StringUtils.f6337c
            int r1 = r0 + 5
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.StringUtils.f6335a = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L28
            int r0 = r5.length()
            if (r0 != 0) goto L25
        L18:
            r0 = r2
        L19:
            if (r0 == r2) goto L27
            int r0 = com.incode.welcome_sdk.commons.utils.StringUtils.f6335a
            int r1 = r0 + 53
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.StringUtils.f6337c = r0
            int r1 = r1 % r4
            return r2
        L25:
            r0 = r3
            goto L19
        L27:
            return r3
        L28:
            r5.length()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.StringUtils.isNotEmpty(java.lang.CharSequence):boolean");
    }

    @JvmStatic
    public static final boolean isBlank(CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = f6335a + 43;
        int i4 = i3 % 128;
        f6337c = i4;
        int i5 = i3 % 2;
        if (charSequence != null) {
            int i6 = i4 + 15;
            f6335a = i6 % 128;
            if (i6 % 2 == 0) {
                StringsKt.isBlank(charSequence);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!StringsKt.isBlank(charSequence)) {
                return false;
            }
        }
        return true;
    }

    @JvmStatic
    public static final boolean isNotBlank(CharSequence charSequence) {
        int i2 = 2 % 2;
        int i3 = f6335a + 59;
        int i4 = i3 % 128;
        f6337c = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (charSequence == null) {
            return false;
        }
        int i5 = i4 + 77;
        f6335a = i5 % 128;
        int i6 = i5 % 2;
        if (StringsKt.isBlank(charSequence)) {
            return false;
        }
        int i7 = f6337c + 45;
        f6335a = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    @JvmStatic
    public static final String joinNonBlankStringArray(String[] strArr, String str) {
        int length;
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        if (strArr != null) {
            int i3 = f6335a + 43;
            f6337c = i3 % 128;
            if (i3 % 2 != 0) {
                int length2 = strArr.length;
                throw null;
            }
            if (strArr.length != 0) {
                Iterator it = ArrayIteratorKt.iterator(strArr);
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (isNotBlank(str2)) {
                        sb.append(str2);
                        sb.append(str);
                    }
                }
            }
        }
        int length3 = sb.length();
        if (str != null) {
            int i4 = f6335a + 121;
            f6337c = i4 % 128;
            int i5 = i4 % 2;
            length = str.length();
        } else {
            length = 0;
        }
        return sb.substring(0, length3 - length);
    }

    public static /* synthetic */ SpannableString getSpannableStringWithHighlightedSection$default(String str, String str2, Context context, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 8) != 0) {
            int i5 = f6337c + 69;
            f6335a = i5 % 128;
            if (i5 % 2 == 0) {
                i2 = R.color.onboard_sdk_brand_accentPrimary;
                int i6 = 65 / 0;
            } else {
                i2 = R.color.onboard_sdk_brand_accentPrimary;
            }
        }
        SpannableString spannableStringWithHighlightedSection = getSpannableStringWithHighlightedSection(str, str2, context, i2);
        int i7 = f6335a + 15;
        f6337c = i7 % 128;
        int i8 = i7 % 2;
        return spannableStringWithHighlightedSection;
    }

    private static void g(int i2, int i3, char c2, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        com.c.a.g gVar = new com.c.a.g();
        long[] jArr = new long[i3];
        gVar.f2752c = 0;
        int i5 = $10 + 67;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 % 4;
        }
        while (gVar.f2752c < i3) {
            int i7 = gVar.f2752c;
            try {
                Object[] objArr2 = {Integer.valueOf(f6338d[i2 + i7])};
                Object objC = com.c.a.e.e.c(-542847437);
                if (objC == null) {
                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 19;
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1028;
                    byte b2 = (byte) ($$b & 3);
                    byte b3 = (byte) (b2 - 3);
                    objC = com.c.a.e.e.e(minimumFlingVelocity, touchSlop, longPressTimeout, -549532598, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objC).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(f6339e), Integer.valueOf(c2)};
                Object objC2 = com.c.a.e.e.c(1506450485);
                if (objC2 == null) {
                    char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 60521);
                    int iIndexOf = 20 - TextUtils.indexOf("", "", 0);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 923;
                    byte b4 = (byte) ($$b & 2);
                    byte b5 = (byte) (b4 - 2);
                    objC2 = com.c.a.e.e.e(fadingEdgeLength, iIndexOf, iLastIndexOf, 1498455628, false, $$c(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objC2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {gVar, gVar};
                Object objC3 = com.c.a.e.e.c(-364489268);
                if (objC3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objC3 = com.c.a.e.e.e((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 9087), 20 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 242, -354658379, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objC3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        gVar.f2752c = 0;
        while (gVar.f2752c < i3) {
            int i8 = $11 + 35;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr[gVar.f2752c] = (char) jArr[gVar.f2752c];
                Object[] objArr5 = {gVar, gVar};
                Object objC4 = com.c.a.e.e.c(-364489268);
                if (objC4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objC4 = com.c.a.e.e.e((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 9087), 20 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 243, -354658379, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objC4).invoke(null, objArr5);
                int i9 = 68 / 0;
            } else {
                cArr[gVar.f2752c] = (char) jArr[gVar.f2752c];
                Object[] objArr6 = {gVar, gVar};
                Object objC5 = com.c.a.e.e.c(-364489268);
                if (objC5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objC5 = com.c.a.e.e.e((char) (9087 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (Process.myTid() >> 22) + 19, 242 - View.resolveSizeAndState(0, 0, 0), -354658379, false, $$c(b10, b11, b11), new Class[]{Object.class, Object.class});
                }
                ((Method) objC5).invoke(null, objArr6);
            }
        }
        String str = new String(cArr);
        int i10 = $10 + 13;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    @JvmStatic
    public static final SpannableString getSpannableStringWithHighlightedSection(String str, String str2, Context context, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(context, "");
        String str3 = str;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str3, str2, 0, false, 6, (Object) null);
        int length = str2.length();
        SpannableString spannableString = new SpannableString(str3);
        if (iIndexOf$default != -1) {
            int i4 = length + iIndexOf$default;
            spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, i2)), iIndexOf$default, i4, 33);
            spannableString.setSpan(new StyleSpan(1), iIndexOf$default, i4, 33);
            int i5 = f6337c + 7;
            f6335a = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = f6335a + 1;
        f6337c = i7 % 128;
        if (i7 % 2 == 0) {
            return spannableString;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long toLongOrZero(String str) {
        int i2 = 2 % 2;
        long j2 = 0;
        if (str != null) {
            int i3 = f6335a + 121;
            f6337c = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    int i4 = 86 / 0;
                    j2 = Long.parseLong(str);
                } else {
                    j2 = Long.parseLong(str);
                }
            } catch (NumberFormatException unused) {
            }
        }
        int i5 = f6337c + 5;
        f6335a = i5 % 128;
        if (i5 % 2 != 0) {
            return j2;
        }
        throw null;
    }

    @JvmStatic
    public static final String removeSpecialCharactersFromCPF(CharSequence charSequence) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        String strReplace = new Regex("[./-]").replace(charSequence, "");
        int i3 = f6335a + 37;
        f6337c = i3 % 128;
        if (i3 % 2 == 0) {
            return strReplace;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String sanitizePhoneNumber(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            r7 = 2
            int r0 = r7 % r7
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r3)
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Appendable r6 = (java.lang.Appendable) r6
            int r5 = r9.length()
            r4 = 0
        L16:
            if (r4 >= r5) goto L4e
            int r0 = com.incode.welcome_sdk.commons.utils.StringUtils.f6335a
            int r1 = r0 + 53
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.StringUtils.f6337c = r0
            int r1 = r1 % r7
            char r2 = r9.charAt(r4)
            boolean r0 = java.lang.Character.isDigit(r2)
            if (r0 != 0) goto L3a
            int r0 = com.incode.welcome_sdk.commons.utils.StringUtils.f6335a
            int r1 = r0 + 17
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.StringUtils.f6337c = r0
            int r1 = r1 % r7
            if (r1 == 0) goto L49
            r0 = 27
            if (r2 != r0) goto L46
        L3a:
            int r0 = com.incode.welcome_sdk.commons.utils.StringUtils.f6337c
            int r1 = r0 + 3
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.StringUtils.f6335a = r0
            int r1 = r1 % r7
            r6.append(r2)
        L46:
            int r4 = r4 + 1
            goto L16
        L49:
            r0 = 43
            if (r2 != r0) goto L46
            goto L3a
        L4e:
            java.lang.StringBuilder r6 = (java.lang.StringBuilder) r6
            java.lang.String r2 = r6.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.incode.welcome_sdk.commons.utils.al r0 = com.incode.welcome_sdk.commons.utils.al.f6409c
            kotlin.text.Regex r1 = com.incode.welcome_sdk.commons.utils.al.b()
            r0 = r2
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = r1.matches(r0)
            if (r0 == 0) goto L67
            return r2
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.StringUtils.sanitizePhoneNumber(java.lang.String):java.lang.String");
    }

    public final Spanned fromHtml(String str) {
        int i2 = 2 % 2;
        int i3 = f6335a + 35;
        f6337c = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            if (Build.VERSION.SDK_INT < 94) {
                Spanned spannedFromHtml = Html.fromHtml(str);
                Intrinsics.checkNotNull(spannedFromHtml);
                int i4 = f6335a + 53;
                f6337c = i4 % 128;
                int i5 = i4 % 2;
                return spannedFromHtml;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
        }
        Spanned spannedFromHtml2 = Html.fromHtml(str, 63);
        Intrinsics.checkNotNull(spannedFromHtml2);
        return spannedFromHtml2;
    }

    static void e() {
        f6338d = new char[]{25296};
        f6339e = 6757137118117741704L;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f6336b = 0;
        f6340f = 1;
        f6337c = 0;
        f6335a = 1;
        e();
        INSTANCE = new StringUtils();
        int i2 = f6336b + 77;
        f6340f = i2 % 128;
        int i3 = i2 % 2;
    }
}
