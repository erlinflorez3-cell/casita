package com.ticnow.sdk.idnowonboarding.utils;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007f\u0007tjAӄLeV:ZS0\u0010s{J$c$wCQ٥8\nR\t}M fz\u000b]ŲG\u000f\u0014\u0016Av:Jmx\f\u0014?6PrW3{s\u0006MnuN\u0005N7R<\b\u000b\u0019\u001aXO@z\tKc\f@7\t~H[%M3\u001fB\nL*\u0019\u001e\u000br\u00156Ոpj"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u000e/;t$w,?Jg\u0012%\u0015dj9\u00149", "", "u(E", "2d[2g,\u001d\\\u001d_~e,\u000b", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "", "4q^;g\rBZ\u0019ivm/", "", "0`R890ES\u0004z\na", "2d[2g,\u001fW ~", "CqX", "\u001a`]1e6BRb\bzmul\u00163;", "\u0011n\\=T5B]\"", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class DataCleaner {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "DataCleaner";

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u000e/;t$w,?Jg\u0012%\u0015dj9\u0014\"\nX~2CUR6e(", "", "u(E", "\"@6", "", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void deleteFile(Uri uri) {
        try {
            String str = "Deleting file " + uri.getPath();
            File file = new File(uri.getPath());
            if (file.exists()) {
                if (file.delete()) {
                }
            }
        } catch (Exception e2) {
        }
    }

    public final void deleteDniFiles(String frontFilePath, String backFilePath) {
        Intrinsics.checkParameterIsNotNull(frontFilePath, "frontFilePath");
        Intrinsics.checkParameterIsNotNull(backFilePath, "backFilePath");
        try {
            Uri uri = Uri.parse(frontFilePath);
            Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.parse(frontFilePath)");
            deleteFile(uri);
            Uri uri2 = Uri.parse(backFilePath);
            Intrinsics.checkExpressionValueIsNotNull(uri2, "Uri.parse(backFilePath)");
            deleteFile(uri2);
        } catch (Exception e2) {
        }
    }

    public final boolean deleteDniFiles(Context context) throws Throwable {
        String strWd = Jg.Wd(";\u00160@\n\t.=", (short) (C1607wl.Xd() ^ 26173), (short) (C1607wl.Xd() ^ 14806));
        short sXd = (short) (C1607wl.Xd() ^ 4246);
        short sXd2 = (short) (C1607wl.Xd() ^ 5316);
        int[] iArr = new int["6B\u0007J'3b".length()];
        QB qb = new QB("6B\u0007J'3b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(context, new String(iArr, 0, i2));
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1626yg.Ud("T\u0003V<iHMIM=LBt;I5^\u00113\u00013\u0001\t", (short) (C1499aX.Xd() ^ (-747)), (short) (C1499aX.Xd() ^ (-22915)))).getMethod(Ig.wd("Dij\u001cOrMBG\u0013\u0018", (short) (FB.Xd() ^ 200)), new Class[0]);
            try {
                method.setAccessible(true);
                File file = (File) method.invoke(context, objArr);
                Intrinsics.checkExpressionValueIsNotNull(file, EO.Od("yXe\u0010\u0013{\u0012dd9@\u0011jCjO", (short) (ZN.Xd() ^ 17550)));
                String path = file.getPath();
                File[] fileArrListFiles = new File(path).listFiles();
                Intrinsics.checkExpressionValueIsNotNull(fileArrListFiles, C1561oA.Qd("\u001d\u001f!\u0019&", (short) (C1580rY.Xd() ^ (-24008))));
                int length = fileArrListFiles.length;
                for (int i3 = 0; i3 < length; i3++) {
                    File file2 = fileArrListFiles[i3];
                    Intrinsics.checkExpressionValueIsNotNull(file2, strWd);
                    String name = file2.getName();
                    Intrinsics.checkExpressionValueIsNotNull(name, C1593ug.zd("\u007f\u0004\b\u0002\u0011y\t}O\u0011\u0005\u0012\u000b", (short) (OY.Xd() ^ 19641), (short) (OY.Xd() ^ 19802)));
                    String str = name;
                    short sXd3 = (short) (C1580rY.Xd() ^ (-5545));
                    int[] iArr2 = new int[";v{q".length()];
                    QB qb2 = new QB(";v{q");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(sXd3 + sXd3 + i4 + xuXd2.CK(iKK2));
                        i4++;
                    }
                    if (StringsKt.contains$default((CharSequence) str, (CharSequence) new String(iArr2, 0, i4), false, 2, (Object) null)) {
                        StringBuilder sbAppend = new StringBuilder().append(path.toString()).append(C1561oA.Kd("+", (short) (FB.Xd() ^ 23979)));
                        File file3 = fileArrListFiles[i3];
                        Intrinsics.checkExpressionValueIsNotNull(file3, strWd);
                        Uri uri = Uri.parse(sbAppend.append(file3.getName()).toString());
                        Intrinsics.checkExpressionValueIsNotNull(uri, Wg.Zd("tCfN=]?g\u0002qfc\"B3\"l\u0003Oq\u0014-2\u001aCi#_\u000eFe\u000b&K;f\u0015B\u001c(a\u0006e,G\u0003'\u0016", (short) (ZN.Xd() ^ 30754), (short) (ZN.Xd() ^ 18067)));
                        deleteFile(uri);
                    }
                }
                return true;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            C1561oA.Xd("EcweHrliwo}", (short) (Od.Xd() ^ (-15866)));
            e3.toString();
            return false;
        }
    }
}
