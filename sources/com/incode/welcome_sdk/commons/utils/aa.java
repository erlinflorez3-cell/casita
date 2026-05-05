package com.incode.welcome_sdk.commons.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Process;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes5.dex */
public final class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f6348a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f6349b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f6350c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f6351e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f6352f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f6353h = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f6354j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f6355d;

    public aa(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.f6355d = context;
    }

    public final String a() throws Throwable {
        AssetManager assets;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f6352f + 55;
        f6348a = i3 % 128;
        if (i3 % 2 != 0) {
            assets = this.f6355d.getAssets();
            byte[] bArr = f6351e;
            Object[] objArr = new Object[1];
            g(bArr[69], bArr[67], bArr[76], objArr);
            obj = objArr[0];
        } else {
            assets = this.f6355d.getAssets();
            byte[] bArr2 = f6351e;
            Object[] objArr2 = new Object[1];
            g(bArr2[44], bArr2[36], bArr2[19], objArr2);
            obj = objArr2[0];
        }
        try {
            Object[] objArr3 = {(String) obj};
            byte[] bArr3 = f6351e;
            byte b2 = bArr3[5];
            Object[] objArr4 = new Object[1];
            g(b2, bArr3[47], b2, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            byte b3 = bArr3[9];
            Object[] objArr5 = new Object[1];
            g((byte) (-b3), (byte) 41, (byte) (-b3), objArr5);
            InputStream inputStreamB = b((InputStream) cls.getMethod((String) objArr5[0], String.class).invoke(assets, objArr3), null, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 611344288 - Process.getGidForName(""), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7);
            Intrinsics.checkNotNullExpressionValue(inputStreamB, "");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamB, Charsets.UTF_8), 8192);
            try {
                String text = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                int i4 = f6352f + 99;
                f6348a = i4 % 128;
                int i5 = i4 % 2;
                return text;
            } finally {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static String e(String str, String str2) {
        String str3;
        int i2;
        Object obj;
        String str4;
        boolean z2;
        int i3 = 2 % 2;
        int i4 = f6348a + 57;
        f6352f = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            str3 = "content = '" + StringsKt.replace$default(StringsKt.replace$default(str2, "\n", "\\n", true, 2, (Object) null), "'", "\\'", true, 2, (Object) null) + "'";
            i2 = 5;
            obj = null;
            str4 = "content = ''";
            z2 = true;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            str3 = "content = '" + StringsKt.replace$default(StringsKt.replace$default(str2, "\n", "\\n", false, 4, (Object) null), "'", "\\'", false, 4, (Object) null) + "'";
            i2 = 4;
            obj = null;
            str4 = "content = ''";
            z2 = false;
        }
        String strReplace$default = StringsKt.replace$default(str, str4, str3, z2, i2, obj);
        int i5 = f6352f + 25;
        f6348a = i5 % 128;
        int i6 = i5 % 2;
        return strReplace$default;
    }

    private InputStream b(InputStream inputStream, byte[] bArr, int i2, int i3, int i4) throws IOException {
        long j2 = f6350c;
        return new com.c.a.d(new com.c.a.a(inputStream, new int[]{((int) (j2 >>> 32)) ^ i3, i3 ^ ((int) j2)}, bArr, i4, i4 <= 6, i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:5:0x0015). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r3 = r8 * 4
            int r2 = 32 - r3
            int r0 = r7 + 4
            byte[] r8 = com.incode.welcome_sdk.commons.utils.aa.f6351e
            int r1 = r6 * 2
            int r7 = r1 + 97
            byte[] r6 = new byte[r2]
            int r5 = 31 - r3
            r4 = 0
            if (r8 != 0) goto L2f
            r1 = r0
            r3 = r4
        L15:
            int r0 = -r0
            int r7 = r7 + r0
            int r7 = r7 + (-1)
            r0 = r1
            r2 = r3
        L1b:
            byte r1 = (byte) r7
            r6[r2] = r1
            int r3 = r2 + 1
            if (r2 != r5) goto L2a
            java.lang.String r0 = new java.lang.String
            r0.<init>(r6, r4)
            r9[r4] = r0
            return
        L2a:
            int r1 = r0 + 1
            r0 = r8[r1]
            goto L15
        L2f:
            r2 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.aa.g(int, short, int, java.lang.Object[]):void");
    }

    static void b() {
        f6351e = new byte[]{67, 87, 59, -10, -13, 0, -6, Ascii.CR, -10, -7, 69, MessagePack.Code.BIN16, -13, 6, 0, -14, 9, -15, 2, 5, 4, 53, MessagePack.Code.FLOAT32, -13, 0, -7, Ascii.SO, -10, -7, 69, -69, Ascii.FF, -15, 68, -20, MessagePack.Code.UINT16, -1, Ascii.CR, -16, 38, -21, -14, Ascii.FF, -7, 1, -14, -2, 10, -10};
        f6349b = 168;
    }

    static void e() {
        f6350c = 804113604503773563L;
    }

    static {
        b();
        e();
        int i2 = f6354j + 121;
        f6353h = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
