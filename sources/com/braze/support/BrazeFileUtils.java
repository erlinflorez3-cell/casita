package com.braze.support;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.TrafficStats;
import android.net.Uri;
import bo.app.da;
import bo.app.ea;
import bo.app.fa;
import bo.app.ga;
import bo.app.ha;
import bo.app.ia;
import bo.app.ih0;
import bo.app.ja;
import bo.app.ka;
import bo.app.la;
import bo.app.ma;
import com.braze.Braze;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.dynatrace.android.callback.Callback;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import yg.C1607wl;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d̉=!,u\bӵLc\u0003\"I\u00066\f6B\r\"4ߚ\u007f\u0007|jA0JeP.hS2\u000fq{<$q$yCIw\"}8\tWNmjvJp\u000bK\u000f\f\u0016\u0001j:R]xs\u0012\u00172HoW?[sU9\u000fyf\t.8:8(\f\u001908P(v)H{\u0010 9Xph\\=Q\u0013%*\u0006l'G#t.\\B`\u000bm<?#1pRb7q@~]\rtS7\u0011\u0007c4*n6c#\u000eSa\u0016\u0001ho\u0007M\u0002U\u0005\u0017&W/W\u0005o6\u0007~D\u00199a%]!%\r\rW`\u001a:CQyJ~\r@\b\t\u0010%<2\r.'vC]\u001et\u001e&3#qkH^\u0019vB.\u0013\n6E>\u0018;9S3f\u007fyc\u0019|P\u001c\u0011\u001b̔;\u0001\u001d 2٭`\u05ce\u0019\u001b\\ȭqE_@UN^\fi=\u001c\u0003\u001fc8.ZΊIĬ3{\u0019ф71E]Q#OjX҉\u0017ϼz\u0005håsu`KX\"\u001d\u0015\u000eѪ\u000bɔ^Dlʍ\u0080To"}, d2 = {"\u0014H;\u0012R\u001a\u001c6xfZ", "", " D<\u001cG\f8AvaZF\fj", "", "!G0\u001f8\u000b8>\u0006^[>\u0019\\q\rEm\"\\$gv\u007f#Wm6d\u0015\u0016:a\u0013", "\"@6", "2d[2g,\u001fW ~dk\u000b\u0001\u0016/c\u000f2\tT", "", "4h[2B9\u001dW&~xm6\n\u001d", "\u001aiPCTuB]b_~e,R", "2d[2g,,V\u0015\fz]\u0017\n\t0e\r(\u0005>\u0001%wKv\u000e", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "4h[2", "2nf;_6:Ry\u0003\u0002^\u001b\u0007s+t\u0003", "\u001aj^A_0G\u001d\u0004z~k\u0002", "", "\u001ab^:\")KO.~D\\6\u0005\u0011?n\u0004&wO\u0005! \u0011R\u001dK\u0002\b5U| D{k", "2nf;_6:Rw\u0003\b^*\f\u0013<y[%\nJ\b'&GZ\nKy", "@d\\<g,\u001fW ~jk3", "=tc=h;\u001fW ~\u0004Z4|", "3wc2a:B]\"", "5dc\u000ef:>by\u0003\u0002^\u001a\f\u00163n\u0002\u0006\u0006I\u0010\u0017 V}", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\n\\%%G~u8\u007f!7Y\u000bu", "/rb2g\u0017:b\u001c", "7r;<V(EC&\u0003", "", "\u001a`]1e6BRb\bzmul\u00163;", "7rA2`6MS\t\f~", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BrazeFileUtils {
    private static final String FILE_SCHEME = "file";
    private static final String SHARED_PREFERENCES_FILENAME_SUFFIX = ".xml";
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeFileUtils");
    public static final List<String> REMOTE_SCHEMES = CollectionsKt.listOf((Object[]) new String[]{"http", "https", "ftp", "ftps", "about", "javascript"});

    public static final void deleteFileOrDirectory(File fileOrDirectory) {
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        if (FilesKt.deleteRecursively(fileOrDirectory)) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new da(fileOrDirectory), 12, (Object) null);
    }

    public static final void deleteSharedPreferencesFile(Context context, File file) throws Throwable {
        Intrinsics.checkNotNullParameter(context, hg.Vd("\u001e)',\u001c.)", (short) (OY.Xd() ^ 24562), (short) (OY.Xd() ^ 23355)));
        short sXd = (short) (ZN.Xd() ^ 5594);
        int[] iArr = new int["egia".length()];
        QB qb = new QB("egia");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(file, new String(iArr, 0, i2));
        if (!file.exists()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new ea(file), 12, (Object) null);
            return;
        }
        String name = file.getName();
        short sXd2 = (short) (OY.Xd() ^ 7067);
        int[] iArr2 = new int["\u0001\u0003\u0005|l~\n\u0001".length()];
        QB qb2 = new QB("\u0001\u0003\u0005|l~\n\u0001");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
            i3++;
        }
        Intrinsics.checkNotNullExpressionValue(name, new String(iArr2, 0, i3));
        short sXd3 = (short) (OY.Xd() ^ 26027);
        int[] iArr3 = new int["\fWMM".length()];
        QB qb3 = new QB("\fWMM");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (((sXd3 + sXd3) + sXd3) + i4));
            i4++;
        }
        String str = new String(iArr3, 0, i4);
        if (!StringsKt.endsWith$default(name, str, false, 2, (Object) null)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new fa(file), 12, (Object) null);
            return;
        }
        String strRemoveSuffix = StringsKt.removeSuffix(name, (CharSequence) str);
        short sXd4 = (short) (ZN.Xd() ^ 12891);
        short sXd5 = (short) (ZN.Xd() ^ 8170);
        int[] iArr4 = new int["IWN][VR\u001dS``gYcj%;hhoaur".length()];
        QB qb4 = new QB("IWN][VR\u001dS``gYcj%;hhoaur");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd4 + i5)) + sXd5);
            i5++;
        }
        Class<?> cls = Class.forName(new String(iArr4, 0, i5));
        Class<?>[] clsArr = new Class[1];
        short sXd6 = (short) (OY.Xd() ^ 14468);
        short sXd7 = (short) (OY.Xd() ^ 8191);
        int[] iArr5 = new int["8,uv8\u0013@aOT\u000e$:m\tv".length()];
        QB qb5 = new QB("8,uv8\u0013@aOT\u000e$:m\tv");
        int i6 = 0;
        while (qb5.YK()) {
            int iKK5 = qb5.KK();
            Xu xuXd5 = Xu.Xd(iKK5);
            iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - ((i6 * sXd7) ^ sXd6));
            i6++;
        }
        clsArr[0] = Class.forName(new String(iArr5, 0, i6));
        Object[] objArr = {strRemoveSuffix};
        Method method = cls.getMethod(ZO.xd("SAf\u0015lrz)Q(\tFV{0c\u0019I?\u001d\u000bZB", (short) (C1607wl.Xd() ^ 26329), (short) (C1607wl.Xd() ^ 7132)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static final Pair<File, Map<String, String>> downloadFileToPath(String downloadDirectoryAbsolutePath, String remoteFileUrl, String str, String str2) throws Exception {
        String outputFilename = str;
        Intrinsics.checkNotNullParameter(downloadDirectoryAbsolutePath, "downloadDirectoryAbsolutePath");
        Intrinsics.checkNotNullParameter(remoteFileUrl, "remoteFileUrl");
        Intrinsics.checkNotNullParameter(outputFilename, "outputFilename");
        TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
        if (Braze.Companion.getOutboundNetworkRequestsOffline()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new ga(remoteFileUrl), 12, (Object) null);
            throw new Exception("SDK is offline. File not downloaded for url: " + remoteFileUrl);
        }
        if (StringsKt.isBlank(downloadDirectoryAbsolutePath)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) ha.f814a, 12, (Object) null);
            throw new Exception("Download directory is blank. File not downloaded.");
        }
        if (StringsKt.isBlank(remoteFileUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) ia.f891a, 12, (Object) null);
            throw new Exception("Zip file url is blank. File not downloaded.");
        }
        if (StringsKt.isBlank(outputFilename)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) ja.f997a, 12, (Object) null);
            throw new Exception("Output filename is blank. File not downloaded.");
        }
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                new File(downloadDirectoryAbsolutePath).mkdirs();
                if (str2 != null && !StringsKt.isBlank(str2)) {
                    outputFilename = outputFilename + str2;
                }
                File file = new File(downloadDirectoryAbsolutePath, outputFilename);
                HttpURLConnection httpURLConnectionA = ih0.f914a.a(new URL(remoteFileUrl));
                try {
                    int responseCode = Callback.getResponseCode(httpURLConnectionA);
                    if (responseCode != 200) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ka(remoteFileUrl, responseCode), 14, (Object) null);
                        throw new Exception("HTTP response code was " + responseCode + ". File with url " + remoteFileUrl + " could not be downloaded.");
                    }
                    DataInputStream dataInputStream = new DataInputStream(Callback.getInputStream((URLConnection) httpURLConnectionA));
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            ByteStreamsKt.copyTo$default(dataInputStream, fileOutputStream, 0, 2, null);
                            CloseableKt.closeFinally(fileOutputStream, null);
                            CloseableKt.closeFinally(dataInputStream, null);
                            Map<String, List<String>> headerFields = Callback.getHeaderFields(httpURLConnectionA);
                            Intrinsics.checkNotNullExpressionValue(headerFields, "urlConnection.headerFields");
                            LinkedHashMap linkedHashMapA = i.a(headerFields);
                            httpURLConnectionA.disconnect();
                            return new Pair<>(file, linkedHashMapA);
                        } finally {
                        }
                    } finally {
                    }
                } catch (Exception e2) {
                    e = e2;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new la(remoteFileUrl), 8, (Object) null);
                    throw new Exception("Exception during download of file from url : " + remoteFileUrl);
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnectionA;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static /* synthetic */ Pair downloadFileToPath$default(String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            str4 = null;
        }
        return downloadFileToPath(str, str2, str3, str4);
    }

    public static final String getAssetFileStringContents(AssetManager assetManager, String assetPath) {
        Intrinsics.checkNotNullParameter(assetManager, "<this>");
        Intrinsics.checkNotNullParameter(assetPath, "assetPath");
        InputStream inputStreamOpen = assetManager.open(assetPath);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "this.open(assetPath)");
        Reader inputStreamReader = new InputStreamReader(inputStreamOpen, Charsets.UTF_8);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            String text = TextStreamsKt.readText(bufferedReader);
            CloseableKt.closeFinally(bufferedReader, null);
            return text;
        } finally {
        }
    }

    public static final boolean isLocalUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String scheme = uri.getScheme();
        return scheme == null || StringsKt.isBlank(scheme) || Intrinsics.areEqual(scheme, "file");
    }

    public static final boolean isRemoteUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String scheme = uri.getScheme();
        if (scheme != null && !StringsKt.isBlank(scheme)) {
            return REMOTE_SCHEMES.contains(scheme);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) ma.f1269a, 12, (Object) null);
        return false;
    }
}
