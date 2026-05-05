package com.braze.support;

import android.content.Context;
import bo.app.aj0;
import bo.app.bj0;
import bo.app.qi0;
import bo.app.ri0;
import bo.app.si0;
import bo.app.ti0;
import bo.app.ui0;
import bo.app.vi0;
import bo.app.wi0;
import bo.app.xi0;
import bo.app.yi0;
import bo.app.zi0;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#4\u0012\u000e\u0007nʑA0ZeP.XW2\u000fy\u001e<řc$\u007fLCU \u0002(ߣOdʴ\u0018nxYKH\u0015\u0006Ȁ|j:I\u001e\u0007k\u0017'2puo7[vU9\u000f||\nhJ0A\u0012\u0007\u0017\u0019XJ@z\tMc\f@6ptH]%M3\u001cX\u000b\u0007B\u000f*tg|8xpkGG#1kr^5mH\t]\u000fVTU\u000f\u0007c.+n9c$kXK\u001d`kW\u0003m\u0003m\tv9?+wu\b:f\u0013,\u0015YUSb;<j\u0019i`:)[Sq`h\u000eVy+\u007f\u001bR\u001c\u000e4)\u000f3}&t\t&3#t*ú#ؿbB\bЭ2B%(\u00183Y;qƟ$ň?\u0019VљL\u0011\u001b\";\u0001\u001d#2٭`\u05ce\u0019\u001b\\ȭά5h"}, d2 = {"\u001ab^:\")KO.~Dl<\b\u00149r\u000fqm@}t!P~\u000eE\u0006\u0015D]\u0005.\r", "", "u(E", "\u000fRB\u0012G&%=t]ZK&[x\u0017Ms\"Z*hrz0", "", "\u0016S<\u0019R\u0010'/\u0004itF\fjv\u000bG_\u0016u!j}u'\\", "(H?,8\u001f-3\u0002l^H\u0015", "5dc\u0015g4E7\"Z\u0006i\u0014|\u0017=a\u0002(WN\u000f\u0017&%k\f?v\u00049f}\u001eFw#B", "\u001aiPCTuB]b_~e,R", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u0019b*:Z{\u000e\u0003e\u001c\n\u0010\u0010r\n0h@\t!&G_\u001bC", ":nR._\u000bB`\u0019|\nh9\u0011", "@d\\<g,3W$n\be", "@d_9T*>>&~{^;z\f/do5\u0003Nr\u001b&JV\u0018:r,\u0011g\f F{", "=qX4\\5:Z\u0007\u000e\bb5~", "@d\\<g,-]\u007f\txZ3X\u0017=e\u000f\u0010wK", "", "Cm_.V23W$b\u0004m6[\r<e}7\u0006M\u0015", "", "Cm_.V2\u001dW&~xm6\n\u001d", "Hh_\u0013\\3>", "D`[6W(MSv\u0002~e+]\r6e_;\u007fN\u0010%\u0007Pn\u000eIa!BY\u0007/", "7mc2a+>R\u0004z\b^5\fg3r\u007f&\u000bJ\u000e+", "1gX9W\rBZ\u0019ivm/", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class WebContentUtils {
    public static final String ASSET_LOADER_DUMMY_DOMAIN = "iamcache.braze";
    public static final String HTML_INAPP_MESSAGES_FOLDER = "braze-html-inapp-messages";
    public static final WebContentUtils INSTANCE = new WebContentUtils();
    private static final String ZIP_EXTENSION = ".zip";

    private WebContentUtils() {
    }

    @JvmStatic
    public static final File getHtmlInAppMessageAssetCacheDirectory(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.Qd("\u0002\r\u000b\u0010\u007f\u0012\r", (short) (OY.Xd() ^ 14968)));
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1593ug.zd("m{r\u0002\u007fzvAw\u0005\u0005\f}\b\u000fI_\r\r\u0014\u0006\u001a\u0017", (short) (OY.Xd() ^ 22155), (short) (OY.Xd() ^ 9720))).getMethod(C1561oA.od("# .{\u0019\u001a\u001e\u001aw\u001c$", (short) (C1607wl.Xd() ^ 859)), new Class[0]);
        try {
            method.setAccessible(true);
            return new File(sb.append(((File) method.invoke(context, objArr)).getPath()).append(C1561oA.Kd("x->.H4|9F@@\u0002?E9IJ\bIBQRAHGV", (short) (C1580rY.Xd() ^ (-28662)))).toString());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @JvmStatic
    public static final String getLocalHtmlUrlFromRemoteUrl(File localDirectory, String remoteZipUrl) {
        Intrinsics.checkNotNullParameter(localDirectory, "localDirectory");
        Intrinsics.checkNotNullParameter(remoteZipUrl, "remoteZipUrl");
        if (StringsKt.isBlank(remoteZipUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) qi0.f1608a, 6, (Object) null);
            return null;
        }
        String absolutePath = localDirectory.getAbsolutePath();
        String strValueOf = String.valueOf(IntentUtils.getRequestCode());
        String str = absolutePath + '/' + strValueOf;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        WebContentUtils webContentUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ri0(remoteZipUrl, str), 7, (Object) null);
        try {
            File fileComponent1 = BrazeFileUtils.downloadFileToPath(str, remoteZipUrl, strValueOf, ZIP_EXTENSION).component1();
            BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ti0(remoteZipUrl, str), 7, (Object) null);
            if (unpackZipIntoDirectory(str, fileComponent1)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new vi0(str), 7, (Object) null);
                return str;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) ui0.f1951a, 6, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(new File(str));
            return null;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new si0(remoteZipUrl), 4, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(new File(str));
            return null;
        }
    }

    @JvmStatic
    public static final String replacePrefetchedUrlsWithLocalAssets(String str, Map<String, String> remoteToLocalAssetMap) {
        String originalString = str;
        Intrinsics.checkNotNullParameter(originalString, "originalString");
        Intrinsics.checkNotNullParameter(remoteToLocalAssetMap, "remoteToLocalAssetMap");
        for (Map.Entry<String, String> entry : remoteToLocalAssetMap.entrySet()) {
            String value = entry.getValue();
            if (new File(value).exists()) {
                String key = entry.getKey();
                if (StringsKt.contains$default((CharSequence) value, (CharSequence) Constants.TRIGGERS_ASSETS_FOLDER, false, 2, (Object) null)) {
                    String str2 = "https://iamcache.braze/ab_triggers" + ((String) StringsKt.split$default((CharSequence) value, new String[]{Constants.TRIGGERS_ASSETS_FOLDER}, false, 0, 6, (Object) null).get(1));
                    if (StringsKt.contains$default((CharSequence) originalString, (CharSequence) key, false, 2, (Object) null)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xi0(key, str2), 7, (Object) null);
                        originalString = StringsKt.replace$default(originalString, key, str2, false, 4, (Object) null);
                    }
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new wi0(value), 6, (Object) null);
            }
        }
        return originalString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, java.lang.Object, java.lang.String] */
    @JvmStatic
    public static final boolean unpackZipIntoDirectory(String str, File file) {
        short sXd = (short) (FB.Xd() ^ 24138);
        short sXd2 = (short) (FB.Xd() ^ 28542);
        int[] iArr = new int["\u0019W)_5\u0011+ z1\u0003Y$|?".length()];
        QB qb = new QB("\u0019W)_5\u0011+ z1\u0003Y$|?");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(str, new String(iArr, 0, i2));
        short sXd3 = (short) (FB.Xd() ^ 11037);
        int[] iArr2 = new int["2\"*\u0001%)#".length()];
        QB qb2 = new QB("2\"*\u0001%)#");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i3));
            i3++;
        }
        Intrinsics.checkNotNullParameter(file, new String(iArr2, 0, i3));
        if (StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) yi0.f2316a, 6, (Object) null);
            return false;
        }
        new File(str).mkdirs();
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
            try {
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(Wg.vd("B8P:\nPRF<|L:D\u00010>X,X]^d", (short) (FB.Xd() ^ 30661))).getMethod(Qg.kd("SP^7ITK", (short) (C1607wl.Xd() ^ 10536), (short) (C1607wl.Xd() ^ 24625)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        ?? r10 = (String) method.invoke(nextEntry, objArr);
                        short sXd4 = (short) (C1607wl.Xd() ^ 13646);
                        short sXd5 = (short) (C1607wl.Xd() ^ 22546);
                        int[] iArr3 = new int["8&,\u007f(-*0c#\u0015 \u0017".length()];
                        QB qb3 = new QB("8&,\u007f(-*0c#\u0015 \u0017");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3) + sXd5);
                            i4++;
                        }
                        Intrinsics.checkNotNullExpressionValue(r10, new String(iArr3, 0, i4));
                        objectRef.element = r10;
                        Locale locale = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(locale, C1561oA.ud("kh", (short) (C1633zX.Xd() ^ (-12008))));
                        String lowerCase = r10.toLowerCase(locale);
                        short sXd6 = (short) (Od.Xd() ^ (-9309));
                        int[] iArr4 = new int["\f\u0001~\n3u\u00052\n\u0002\u0014\u007fI\tz\tn6Xzumoi8>\u0002}W{\u0001oi;ViX\u001c]abaic$".length()];
                        QB qb4 = new QB("\f\u0001~\n3u\u00052\n\u0002\u0014\u007fI\tz\tn6Xzumoi8>\u0002}W{\u0001oi;ViX\u001c]abaic$");
                        int i5 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd6 ^ i5));
                            i5++;
                        }
                        Intrinsics.checkNotNullExpressionValue(lowerCase, new String(iArr4, 0, i5));
                        if (!StringsKt.startsWith$default(lowerCase, C1561oA.Yd("|}\r\u0002\u0005\u0012\u0017\u001d", (short) (ZN.Xd() ^ 30060)), false, 2, (Object) null)) {
                            try {
                                String strValidateChildFileExistsUnderParent = validateChildFileExistsUnderParent(str, str + '/' + ((String) objectRef.element));
                                Object[] objArr2 = new Object[0];
                                Method method2 = Class.forName(Xg.qd("\u001d\u0015+\u0017d--#'i7'/m\u001b+3\t3:9A", (short) (ZN.Xd() ^ 10696), (short) (ZN.Xd() ^ 15322))).getMethod(Jg.Wd("Zg+#\u001f\u0015\u0006iW]W", (short) (C1580rY.Xd() ^ (-6136)), (short) (C1580rY.Xd() ^ (-22279))), new Class[0]);
                                try {
                                    method2.setAccessible(true);
                                    if (((Boolean) method2.invoke(nextEntry, objArr2)).booleanValue()) {
                                        new File(strValidateChildFileExistsUnderParent).mkdirs();
                                    } else {
                                        try {
                                            File parentFile = new File(strValidateChildFileExistsUnderParent).getParentFile();
                                            if (parentFile != null) {
                                                parentFile.mkdirs();
                                            }
                                        } catch (Exception e2) {
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new zi0(objectRef), 4, (Object) null);
                                        }
                                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(strValidateChildFileExistsUnderParent));
                                        try {
                                            ByteStreamsKt.copyTo$default(zipInputStream, bufferedOutputStream, 0, 2, null);
                                            CloseableKt.closeFinally(bufferedOutputStream, null);
                                        } catch (Throwable th) {
                                            try {
                                                throw th;
                                            } catch (Throwable th2) {
                                                CloseableKt.closeFinally(bufferedOutputStream, th);
                                                throw th2;
                                            }
                                        }
                                    }
                                } catch (InvocationTargetException e3) {
                                    throw e3.getCause();
                                }
                            } catch (Exception e4) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new aj0(objectRef), 4, (Object) null);
                            }
                        }
                        zipInputStream.closeEntry();
                    } catch (InvocationTargetException e5) {
                        throw e5.getCause();
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(zipInputStream, null);
                return true;
            } finally {
            }
        } catch (Throwable th3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, th3, false, (Function0) new bj0(file, str), 4, (Object) null);
            return false;
        }
    }

    @JvmStatic
    public static final String validateChildFileExistsUnderParent(String intendedParentDirectory, String childFilePath) throws IOException {
        Intrinsics.checkNotNullParameter(intendedParentDirectory, "intendedParentDirectory");
        Intrinsics.checkNotNullParameter(childFilePath, "childFilePath");
        String parentCanonicalPath = new File(intendedParentDirectory).getCanonicalPath();
        String childFileCanonicalPath = new File(childFilePath).getCanonicalPath();
        Intrinsics.checkNotNullExpressionValue(childFileCanonicalPath, "childFileCanonicalPath");
        Intrinsics.checkNotNullExpressionValue(parentCanonicalPath, "parentCanonicalPath");
        if (StringsKt.startsWith$default(childFileCanonicalPath, parentCanonicalPath, false, 2, (Object) null)) {
            return childFileCanonicalPath;
        }
        throw new IllegalStateException("Invalid file with original path: " + childFilePath + " with canonical path: " + childFileCanonicalPath + " does not exist under intended parent with  path: " + intendedParentDirectory + " and canonical path: " + parentCanonicalPath);
    }
}
