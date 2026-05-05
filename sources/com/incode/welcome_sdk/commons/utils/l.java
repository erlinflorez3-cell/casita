package com.incode.welcome_sdk.commons.utils;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Environment;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.incode.welcome_sdk.commons.exceptions.IncodeGenericError;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.ui.dynamic_forms.view.FormsSelectInputScreenKt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class l {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: a */
    private static int f6525a = 0;

    /* JADX INFO: renamed from: b */
    private static int f6526b = 0;

    /* JADX INFO: renamed from: c */
    private static int f6527c = 0;

    /* JADX INFO: renamed from: d */
    private static int f6528d = 0;

    /* JADX INFO: renamed from: e */
    public static final l f6529e;

    /* JADX INFO: renamed from: f */
    private static int f6530f = 0;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0024 -> B:17:0x0013). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r8, byte r9, byte r10) {
        /*
            int r0 = r10 * 4
            int r0 = 3 - r0
            int r8 = r8 * 4
            int r1 = r8 + 1
            byte[] r7 = com.incode.welcome_sdk.commons.utils.l.$$a
            int r6 = 70 - r9
            byte[] r5 = new byte[r1]
            r4 = 0
            if (r7 != 0) goto L29
            r1 = r0
            r3 = r4
        L13:
            int r0 = -r0
            int r6 = r6 + r0
            r0 = r1
            r2 = r3
        L17:
            byte r1 = (byte) r6
            r5[r2] = r1
            int r3 = r2 + 1
            if (r2 != r8) goto L24
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5, r4)
            return r0
        L24:
            int r1 = r0 + 1
            r0 = r7[r1]
            goto L13
        L29:
            r2 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.l.$$c(byte, byte, byte):java.lang.String");
    }

    public static /* synthetic */ Object a(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) throws NoSuchAlgorithmException, IncodeGenericError, IOException {
        int i8 = ~i6;
        int i9 = ~i7;
        int i10 = ~(i8 | i9);
        int i11 = i5 | i10;
        int i12 = ~i5;
        int i13 = i10 | (~(i12 | i6));
        int i14 = (~(i7 | i8 | i5)) | (~(i9 | i12 | i8));
        int i15 = i6 + i5 + i2 + ((-619979367) * i4) + (68302741 * i3);
        int i16 = i15 * i15;
        int i17 = (i6 * 561304900) + 382271488 + (561304900 * i5) + ((-1585293958) * i11) + (792646979 * i13) + ((-792646979) * i14) + ((-231342080) * i2) + (1615200256 * i4) + ((-1821507584) * i3) + (428933120 * i16);
        int i18 = ((i6 * (-96142684)) - 56799437) + (i5 * (-96142684)) + (i11 * 1642) + (i13 * (-821)) + (i14 * 821) + (i2 * (-96141863)) + (i4 * (-1380774991)) + (i3 * (-1175232947)) + (i16 * (-118947840));
        int i19 = i17 + (i18 * i18 * (-1369505792));
        if (i19 == 1) {
            File file = (File) objArr[0];
            String str = (String) objArr[1];
            int i20 = 2 % 2;
            Intrinsics.checkNotNullParameter(file, "");
            Intrinsics.checkNotNullParameter(str, "");
            File file2 = new File(file, str);
            int i21 = f6527c + 37;
            f6525a = i21 % 128;
            int i22 = i21 % 2;
            return file2;
        }
        if (i19 != 2) {
            return e(objArr);
        }
        Application application = (Application) objArr[0];
        File file3 = (File) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i23 = 2 % 2;
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(file3, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        File file4 = new File(file3, str2);
        if (file4.exists()) {
            String strC = c(file4);
            if (Intrinsics.areEqual(strC, str3)) {
                int i24 = f6525a + 23;
                f6527c = i24 % 128;
                if (i24 % 2 != 0) {
                    Timber.Forest forest = Timber.Forest;
                    Object[] objArr2 = new Object[0];
                    objArr2[0] = str2;
                    forest.d("Model already exists and is up to date: %s", objArr2);
                } else {
                    Timber.Forest.d("Model already exists and is up to date: %s", str2);
                }
            }
            if (Intrinsics.areEqual(strC, str3)) {
                return file4;
            }
            int i25 = f6527c + 27;
            f6525a = i25 % 128;
            int i26 = i25 % 2;
            Timber.Forest.d("Model already exists but needs to be updated (wrong checksum): %s", str2);
            Timber.Forest.d("Current model checksum:  %s", strC);
            Timber.Forest.d("Expected model checksum: %s", str3);
        } else {
            Timber.Forest.d("Model does not exist: %s", str2);
            int i27 = f6527c + 49;
            f6525a = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = 4 / 3;
            }
        }
        int i29 = f6527c + 13;
        f6525a = i29 % 128;
        int i30 = i29 % 2;
        Timber.Forest.d("Copying model: %s", str2);
        String path = file4.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "");
        a(application, iIntValue, path);
        String strC2 = c(file4);
        if (!Intrinsics.areEqual(strC2, str3)) {
            throw new IncodeGenericError("Model checksum does not match after copying: " + str2 + ". Expected: " + str3 + ", Actual: " + strC2);
        }
        Timber.Forest.d("Model has been updated successfully: %s", str2);
        int i31 = f6525a + 125;
        f6527c = i31 % 128;
        int i32 = i31 % 2;
        return file4;
    }

    static void init$0() {
        $$a = new byte[]{103, 5, 74, Ascii.SYN};
        $$b = 19;
    }

    private l() {
    }

    @JvmStatic
    public static final boolean b() {
        int i2 = 2 % 2;
        int i3 = f6525a + 75;
        f6527c = i3 % 128;
        int i4 = i3 % 2;
        boolean zAreEqual = Intrinsics.areEqual("mounted", Environment.getExternalStorageState());
        int i5 = f6525a + 117;
        f6527c = i5 % 128;
        int i6 = i5 % 2;
        return zAreEqual;
    }

    private static void a(Context context, int i2, String str) throws IOException {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        byte[] bArr;
        int i3 = 2 % 2;
        FileOutputStream fileOutputStreamOpenRawResource = context.getResources().openRawResource(i2);
        try {
            inputStream = fileOutputStreamOpenRawResource;
            fileOutputStreamOpenRawResource = new FileOutputStream(str);
            try {
                fileOutputStream = fileOutputStreamOpenRawResource;
                bArr = new byte[1024];
            } finally {
            }
        } finally {
        }
        while (true) {
            int i4 = inputStream.read(bArr);
            if (i4 <= 0) {
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStreamOpenRawResource, null);
                int i5 = f6525a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f6527c = i5 % 128;
                int i6 = i5 % 2;
                Unit unit2 = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStreamOpenRawResource, null);
                return;
            }
            int i7 = f6525a + 59;
            f6527c = i7 % 128;
            if (i7 % 2 != 0) {
                fileOutputStream.write(bArr, 1, i4);
            } else {
                fileOutputStream.write(bArr, 0, i4);
            }
        }
    }

    private static /* synthetic */ String c(File file) throws NoSuchAlgorithmException, IOException {
        int i2 = 2 % 2;
        int i3 = f6525a + 11;
        f6527c = i3 % 128;
        int i4 = i3 % 2;
        String strA = a(file, "SHA-256");
        int i5 = f6525a + 41;
        f6527c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return strA;
    }

    static final class d extends Lambda implements Function1<Byte, CharSequence> {

        /* JADX INFO: renamed from: a */
        private static int f6531a = 1;

        /* JADX INFO: renamed from: b */
        private static int f6532b = 0;

        /* JADX INFO: renamed from: c */
        private static int f6533c = 1;

        /* JADX INFO: renamed from: d */
        private static int f6534d = 0;

        /* JADX INFO: renamed from: e */
        public static final d f6535e = new d();

        private static CharSequence d(byte b2) {
            int i2 = 2 % 2;
            int i3 = f6532b + 47;
            f6531a = i3 % 128;
            int i4 = i3 % 2;
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            String str2 = str;
            int i5 = f6532b + 45;
            f6531a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 19 / 0;
            }
            return str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CharSequence invoke(Byte b2) {
            int i2 = 2 % 2;
            int i3 = f6531a + 95;
            f6532b = i3 % 128;
            int i4 = i3 % 2;
            byte bByteValue = b2.byteValue();
            if (i4 != 0) {
                d(bByteValue);
                throw null;
            }
            CharSequence charSequenceD = d(bByteValue);
            int i5 = f6532b + 79;
            f6531a = i5 % 128;
            int i6 = i5 % 2;
            return charSequenceD;
        }

        static {
            int i2 = f6534d + 1;
            f6533c = i2 % 128;
            int i3 = i2 % 2;
        }

        d() {
            super(1);
        }
    }

    private static String a(File file, String str) throws NoSuchAlgorithmException, IOException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bArr = new byte[8192];
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileInputStream fileInputStream2 = fileInputStream;
            while (true) {
                int i3 = fileInputStream2.read(bArr);
                if (i3 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i3);
                int i4 = f6525a + 13;
                f6527c = i4 % 128;
                int i5 = i4 % 2;
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileInputStream, null);
            int i6 = f6527c + 7;
            f6525a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 / 5;
            }
            byte[] bArrDigest = messageDigest.digest();
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
            String strJoinToString$default = ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) d.f6535e, 30, (Object) null);
            int i8 = f6527c + 87;
            f6525a = i8 % 128;
            int i9 = i8 % 2;
            return strJoinToString$default;
        } finally {
        }
    }

    @JvmStatic
    public static final String e() {
        int i2 = 2 % 2;
        String str = "JPEG_" + (new Date().getTime() / 10000) + ".jpeg";
        int i3 = f6525a + 65;
        f6527c = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    private static void g(String str, int i2, int i3, boolean z2, int i4, Object[] objArr) throws Throwable {
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $10 + 77;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        char[] cArr = (char[]) (str2 != null ? str2.toCharArray() : str2);
        com.c.a.n nVar = new com.c.a.n();
        char[] cArr2 = new char[i3];
        nVar.f2781b = 0;
        while (nVar.f2781b < i3) {
            int i7 = $11 + 57;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            nVar.f2782c = cArr[nVar.f2781b];
            cArr2[nVar.f2781b] = (char) (i4 + nVar.f2782c);
            int i9 = nVar.f2781b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(f6528d)};
                Object objC = com.c.a.e.e.c(2056116162);
                if (objC == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objC = com.c.a.e.e.e((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.green(0) + 20, TextUtils.lastIndexOf("", '0', 0) + TypedValues.Custom.TYPE_STRING, 2048382395, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objC2 = com.c.a.e.e.c(1507983255);
                if (objC2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objC2 = com.c.a.e.e.e((char) ((-1) - Process.getGidForName("")), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 19, 281 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1501298158, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objC2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            int i10 = $11 + 37;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            nVar.f2780a = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - nVar.f2780a, nVar.f2780a);
            System.arraycopy(cArr3, nVar.f2780a, cArr2, 0, i3 - nVar.f2780a);
            int i12 = $10 + 29;
            $11 = i12 % 128;
            int i13 = i12 % 2;
        }
        if (!(!z2)) {
            char[] cArr4 = new char[i3];
            nVar.f2781b = 0;
            while (nVar.f2781b < i3) {
                int i14 = $10 + 11;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    cArr4[nVar.f2781b] = cArr2[(i3 % nVar.f2781b) - 1];
                    Object[] objArr4 = {nVar, nVar};
                    Object objC3 = com.c.a.e.e.c(1507983255);
                    if (objC3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objC3 = com.c.a.e.e.e((char) TextUtils.getOffsetBefore("", 0), Color.green(0) + 19, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 280, 1501298158, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objC3).invoke(null, objArr4);
                } else {
                    cArr4[nVar.f2781b] = cArr2[(i3 - nVar.f2781b) - 1];
                    Object[] objArr5 = {nVar, nVar};
                    Object objC4 = com.c.a.e.e.c(1507983255);
                    if (objC4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objC4 = com.c.a.e.e.e((char) Gravity.getAbsoluteGravity(0, 0), 19 - View.getDefaultSize(0, 0), 280 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1501298158, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objC4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @JvmStatic
    public static final File a(byte[] bArr, File file) {
        int i2 = 2 % 2;
        int i3 = f6525a + 123;
        f6527c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(file, "");
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                FileOutputStream fileOutputStream2 = fileOutputStream;
                if ((bArr != null ? '&' : AbstractJsonLexerKt.COLON) == '&') {
                    int i5 = f6525a + 103;
                    f6527c = i5 % 128;
                    int i6 = i5 % 2;
                    fileOutputStream2.write(bArr);
                    Unit unit = Unit.INSTANCE;
                    int i7 = f6525a + 55;
                    f6527c = i7 % 128;
                    int i8 = i7 % 2;
                }
                CloseableKt.closeFinally(fileOutputStream, null);
            } finally {
            }
        } catch (Exception e2) {
            if ((e2 instanceof FileNotFoundException ? true : e2 instanceof IOException ? 'L' : 'A') != 'A') {
                Timber.Forest.log(6, e2);
            }
        }
        int i9 = f6527c + 25;
        f6525a = i9 % 128;
        int i10 = i9 % 2;
        return file;
    }

    @JvmStatic
    public static final boolean c(File file, File file2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(file2, "");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                boolean zD = d(file, fileOutputStream);
                CloseableKt.closeFinally(fileOutputStream, null);
                int i3 = f6527c;
                int i4 = i3 + 55;
                f6525a = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 4 % 2;
                }
                int i6 = i3 + 123;
                f6525a = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 21 / 0;
                }
                return zD;
            } finally {
            }
        } catch (IOException e2) {
            Timber.Forest.e(e2);
            return false;
        }
    }

    @JvmStatic
    private static boolean d(File file, FileOutputStream fileOutputStream) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(fileOutputStream, "");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                channel.transferTo(0L, channel.size(), fileOutputStream.getChannel());
                CloseableKt.closeFinally(fileInputStream, null);
                int i3 = f6527c + 1;
                int i4 = i3 % 128;
                f6525a = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 73;
                f6527c = i6 % 128;
                int i7 = i6 % 2;
                return true;
            } finally {
            }
        } catch (IOException e2) {
            Timber.Forest.e(e2);
            return false;
        }
    }

    @JvmStatic
    private static void a(IncodeWelcomeRepository incodeWelcomeRepository, String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(str, "");
        a(new File(incodeWelcomeRepository.getImagesDirectory().getPath() + RemoteSettings.FORWARD_SLASH_STRING + str));
        int i3 = f6527c + 33;
        f6525a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        File file = (File) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(str, "");
        boolean zA = a(new File(file, str));
        int i3 = f6525a + 3;
        f6527c = i3 % 128;
        if (i3 % 2 == 0) {
            return Boolean.valueOf(zA);
        }
        throw null;
    }

    @JvmStatic
    public static final boolean a(File file) {
        boolean zDelete;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(file, "");
        try {
        } catch (Exception e2) {
            Timber.Forest.e(e2);
        }
        if (file.exists()) {
            int i3 = f6527c + 101;
            f6525a = i3 % 128;
            int i4 = i3 % 2;
            zDelete = file.delete();
        } else {
            zDelete = false;
        }
        int i5 = f6527c + 43;
        f6525a = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 99 / 0;
        }
        return zDelete;
    }

    public final void d(File file) {
        int i2 = 2 % 2;
        int i3 = f6527c + 99;
        f6525a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(file, "");
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            int i5 = 0;
            if (fileArrListFiles == null) {
                int i6 = f6525a + 93;
                f6527c = i6 % 128;
                int i7 = i6 % 2;
                fileArrListFiles = new File[0];
            }
            int length = fileArrListFiles.length;
            while (i5 < length) {
                File file2 = fileArrListFiles[i5];
                Intrinsics.checkNotNull(file2);
                d(file2);
                i5++;
                int i8 = f6525a + 101;
                f6527c = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        file.delete();
    }

    @JvmStatic
    public static final void e(IncodeWelcomeRepository incodeWelcomeRepository) {
        int i2 = 2 % 2;
        int i3 = f6525a + 121;
        f6527c = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Object[] objArr = new Object[1];
        g("\u0007\ufff5\u0011\u0007\u0006\u000b\ufff8ￖ\u0012\u000f\uffd0\u0007\u000b\b\u000e", Gravity.getAbsoluteGravity(0, 0) + 7, 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), true, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 153, objArr);
        Object[] objArr2 = new Object[1];
        g("\u0004\u0007\ufffb\ufff4\ufff9\ufffe\ufff4\b\u000b\t\u0003", 9 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.getCapsMode("", 0, 0) + 11, true, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 165, objArr2);
        Object[] objArr3 = new Object[1];
        g("\r\ufff9\u0003\ufffe\ufff9￼\ufffb�\u0005\u0010", 9 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 9, false, AndroidCharacter.getMirror('0') + 'q', objArr3);
        Object[] objArr4 = new Object[1];
        g("\t\u0001\ufff9\u0002\b\n\u0007\ufff3\ufff8\u0003\ufff7", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 4, Color.green(0) + 11, false, TextUtils.indexOf((CharSequence) "", '0') + 168, objArr4);
        Object[] objArr5 = new Object[1];
        g("\t\ufff5\t\f\ufffb\uffff￼\u0002\ufffb", 4 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 10 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), true, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 166, objArr5);
        Object[] objArr6 = new Object[1];
        g("\u0004\u0005\ufff9\ufff5\ufffb\ufff9\uffff\u0005\f\ufff5\t\f\ufffb\uffff￼\u0002\ufffb\t\ufff5\n\u0004\ufffb\t", 11 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 22 - ImageFormat.getBitsPerPixel(0), true, 165 - (ViewConfiguration.getTapTimeout() >> 16), objArr6);
        Object[] objArr7 = new Object[1];
        g("\ufff9\ufffe\u0004\u000b\b\ufff4\ufff6\n", 3 - TextUtils.indexOf("", "", 0, 0), 8 - (ViewConfiguration.getTouchSlop() >> 8), false, 167 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr7);
        Iterator it = CollectionsKt.listOf((Object[]) new String[]{((String) objArr[0]).intern(), "video_selfie_temp_video.mp4", "0.mp4", "1.mp4", "2.mp4", "3.mp4", "4.mp4", "5.mp4", "6.mp4", "7.mp4", "1audio.mp4", "2audio.mp4", "3audio.mp4", "4audio.mp4", "5audio.mp4", "6audio.mp4", ((String) objArr2[0]).intern(), ((String) objArr3[0]).intern(), ((String) objArr4[0]).intern(), ((String) objArr5[0]).intern(), ((String) objArr6[0]).intern(), ((String) objArr7[0]).intern()}).iterator();
        int i5 = f6525a + 121;
        f6527c = i5 % 128;
        int i6 = i5 % 2;
        while (it.hasNext()) {
            int i7 = f6527c + 35;
            f6525a = i7 % 128;
            int i8 = i7 % 2;
            a(incodeWelcomeRepository, (String) it.next());
        }
    }

    @JvmStatic
    public static final byte[] d(InputStream inputStream) throws IOException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(inputStream, "");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        int i3 = f6525a + 59;
        f6527c = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            int i5 = inputStream.read(bArr);
            if (i5 == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "");
                return byteArray;
            }
            int i6 = f6525a + 89;
            f6527c = i6 % 128;
            int i7 = i6 % 2;
            byteArrayOutputStream.write(bArr, 0, i5);
        }
    }

    public static double a(Context context, int i2) {
        double dAvailable;
        InputStream inputStreamOpenRawResource;
        int i3 = 2 % 2;
        int i4 = f6527c + 103;
        f6525a = i4 % 128;
        try {
            try {
                if (i4 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(context, "");
                    inputStreamOpenRawResource = context.getResources().openRawResource(i2);
                    dAvailable = ((double) inputStreamOpenRawResource.available()) % 1048576.0d;
                } else {
                    Intrinsics.checkNotNullParameter(context, "");
                    inputStreamOpenRawResource = context.getResources().openRawResource(i2);
                    dAvailable = ((double) inputStreamOpenRawResource.available()) / 1048576.0d;
                }
                CloseableKt.closeFinally(inputStreamOpenRawResource, null);
            } finally {
            }
        } catch (IOException e2) {
            Timber.Forest.e(e2);
            dAvailable = 0.0d;
        }
        int i5 = f6525a + 5;
        f6527c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return dAvailable;
    }

    static void d() {
        f6528d = 1994499207;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f6526b = 0;
        f6530f = 1;
        f6527c = 0;
        f6525a = 1;
        d();
        f6529e = new l();
        int i2 = f6530f + 1;
        f6526b = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final boolean e(File file, String str) {
        Object[] objArr = {file, str};
        int iB = FormsSelectInputScreenKt.h.b();
        return ((Boolean) a(FormsSelectInputScreenKt.h.b(), objArr, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1081484302, -1081484302, iB)).booleanValue();
    }

    @JvmStatic
    public static final File b(File file, String str) {
        Object[] objArr = {file, str};
        int iB = FormsSelectInputScreenKt.h.b();
        return (File) a(FormsSelectInputScreenKt.h.b(), objArr, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), 1815762904, -1815762903, iB);
    }

    @JvmStatic
    public static final File c(Application application, File file, String str, String str2, int i2) {
        Object[] objArr = {application, file, str, str2, Integer.valueOf(i2)};
        int iB = FormsSelectInputScreenKt.h.b();
        return (File) a(FormsSelectInputScreenKt.h.b(), objArr, FormsSelectInputScreenKt.h.b(), FormsSelectInputScreenKt.h.b(), -1252974840, 1252974842, iB);
    }
}
