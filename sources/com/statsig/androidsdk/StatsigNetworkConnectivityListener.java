package com.statsig.androidsdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjG9L͜^\u008c\u0003SX\u000e,\u0007D(i$\nCiV۟\u0002\"\u0017Q\u0017kusbZ9I_\u0012${\u0003,wYOص\u0014Ƥ6BwЀݵQv"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7B}/Iw#4+MDt4\u001c$lr=\u0016w\u0013R\u00056GUN92", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "1n];X*MW*\u0003\nr\u0014x\u0012+g\u007f5", "\u001a`]1e6BRb\bzmuZ\u00138n\u007f&\u000bD\u0012\u001b&[W\nEr'5fS", "7r=2g>H`\u001fZ\fZ0\u0004\u0005,l\u007f", "", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class StatsigNetworkConnectivityListener {
    private final ConnectivityManager connectivityManager;

    public StatsigNetworkConnectivityListener(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.Xd("N[[bThe", (short) (C1499aX.Xd() ^ (-15909))));
        String strVd = Wg.vd("ZgcdXWe[eYag", (short) (ZN.Xd() ^ 9505));
        short sXd = (short) (Od.Xd() ^ (-13295));
        short sXd2 = (short) (Od.Xd() ^ (-1214));
        int[] iArr = new int["bncple_(\\gejZbg 4_]bRd_".length()];
        QB qb = new QB("bncple_(\\gejZbg 4_]bRd_");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Object[] objArr = {strVd};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.ud("2/=\u001b@99)0\u0015&25' !", (short) (Od.Xd() ^ (-25226))), Class.forName(hg.Vd("\u001f\u0015)\u0013^\u001c\u0010\u001c\u0014Y}\u001e\u001b\u0011\u0015\r", (short) (Od.Xd() ^ (-30512)), (short) (Od.Xd() ^ (-22544)))));
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            if (objInvoke == null) {
                throw new NullPointerException(C1561oA.yd("GOGHt98FOQW\u0004?C~C*=?k95f6@@\u007fBB:;o-3+!T\u0017%\u001c31,(j,$4Vl\u001a\u001a\u0013\u000b\n\u001c\u001a(\u001c(&z\u0010\u001ez\u0002\u0001\u000f", (short) (OY.Xd() ^ 6876)));
            }
            this.connectivityManager = (ConnectivityManager) objInvoke;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final boolean isNetworkAvailable() {
        NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(this.connectivityManager.getActiveNetwork());
        return Intrinsics.areEqual((Object) (networkCapabilities == null ? null : Boolean.valueOf(networkCapabilities.hasCapability(12))), (Object) true);
    }
}
