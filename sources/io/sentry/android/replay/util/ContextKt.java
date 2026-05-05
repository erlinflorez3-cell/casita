package io.sentry.android.replay.util;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.QB;
import yg.Xu;

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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\n\u001d̉=!4i\bӵ\\m\u0003İY\u0006^\nVB-!rߚխ\u000bf"}, d2 = {"/o_\u0010b5MS,\u000e", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Ad]Ae@\u0006O\"}\bh0{P<e\u000b/wTz$\u0017No\nJv"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ContextKt {
    public static final Context appContext(Context context) throws Throwable {
        short sXd = (short) (Od.Xd() ^ (-9073));
        short sXd2 = (short) (Od.Xd() ^ (-3052));
        int[] iArr = new int["L\u0004vv\u007fI".length()];
        QB qb = new QB("L\u0004vv\u007fI");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("@LANJC=\u0006:ECH8@E}\u0012=;@0B=", (short) (C1607wl.Xd() ^ 25319))).getMethod(C1561oA.yd("\u0006\u0003\u0015`\u000b\n\t\u0005yv\r\u0001\u0002\u007fW\u0003\u001d\"\u0016(\u001f", (short) (C1633zX.Xd() ^ (-19578))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            return context2 == null ? context : context2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
