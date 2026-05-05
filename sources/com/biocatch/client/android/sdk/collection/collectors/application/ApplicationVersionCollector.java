package com.biocatch.client.android.sdk.collection.collectors.application;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.collectors.OnDemandCollector;
import com.biocatch.client.android.sdk.core.ApplicationCache;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.Xg;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007|jA0JfP.hS2\u000fq|<$i0yCAW Ԃ8ޛ\u007fTwi~J\t\u000bq\u000eF!\tn:Jmx\f\u0014Ƥ6B}B{S}MQ`#6K4\u0003.Fz\u001d\u0001H,\u001fƸxټGK\u0014۵\u0001R~>j\r{\nPf\\̛\"Ә\"`\u007fP<Nzd\u000bA1\u000b\u0002B|0\u0016\u0005Sֈ\u000fТX+%xg(9K\bG#1k\u00035_\u0012\u0014Yӡsݘ\tl?)1W\u0002f͕\\\u0011"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\u0007\u0018\u0010`E\"jS;)\u0011\u001dI\u000fIl\u000b\u0015s\u0018<qp@e\u001aTO", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p1U-,dN{<q\u001ca\u0015N)\u001c\u000ff\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\u0007\u0018\u0010`E\"jS;)\u0011\u001dI\u000fIl\u000b\u0015}\u00184jw\u0018", "/o_9\\*:b\u001d\t\u0004<(z\f/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w)NFr8\u001c\u0011weC\u0010A(Ly'\u001d", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017\u001fFv;\"\u0013dp=\u0011l\nJt*G\"\u0012\u001d", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "@t]\u0010b3ES\u0017\u000e~h5", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ApplicationVersionCollector extends OnDemandCollector<ApplicationVersionModel> {
    private final ApplicationCache applicationCache;

    public ApplicationVersionCollector(ApplicationCache applicationCache) {
        Intrinsics.checkNotNullParameter(applicationCache, "applicationCache");
        this.applicationCache = applicationCache;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.ApplicationVersion;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.enableApplicationVersion;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "application_version";
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.OnDemandCollector
    public ApplicationVersionModel runCollection() throws Throwable {
        Context applicationContext = this.applicationCache.get().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, C1561oA.Xd("Scd#Wghec^]qgnnDqqxj~{", (short) (C1580rY.Xd() ^ (-5117))));
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd("hvixzum8r\u007f{\u0003x\u0003\u0006@Z\b\u0004\u000b\u0001\u0015\u000e", (short) (OY.Xd() ^ 17845))).getMethod(Qg.kd("=:H#34;052\u0019,8*/,8", (short) (C1607wl.Xd() ^ 24167), (short) (C1607wl.Xd() ^ 27893)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(applicationContext, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(hg.Vd("bncple_(\\gejZbg 4_]bRd_", (short) (C1607wl.Xd() ^ 26662), (short) (C1607wl.Xd() ^ 27214))).getMethod(C1561oA.ud("SP^9IJQFKH0BMD", (short) (FB.Xd() ^ 9416)), new Class[0]);
            try {
                method2.setAccessible(true);
                Object[] objArr3 = {(String) method2.invoke(applicationContext, objArr2), 0};
                Method method3 = Class.forName(C1561oA.yd("ESJYWRN\u0019O\\\\cU_f!db$GY\\e\\cbK`nbih6", (short) (ZN.Xd() ^ 8016))).getMethod(Xg.qd(">=M*<?H?FE*PIS", (short) (C1580rY.Xd() ^ (-6151)), (short) (C1580rY.Xd() ^ (-31592))), Class.forName(C1561oA.Yd("\u001e\u0016,\u0018e%\u001b)#j\u001132*0*", (short) (OY.Xd() ^ 785))), Integer.TYPE);
                try {
                    method3.setAccessible(true);
                    PackageInfo packageInfo = (PackageInfo) method3.invoke(packageManager, objArr3);
                    Intrinsics.checkNotNullExpressionValue(packageInfo, Jg.Wd("<Cq%A\u0003.UCX\u00027X\u0015y\rN#BkW\u001c\u0006b\uf502?$J}2d\u0003=?$\u00133b\u0016:/H^ Y\u00051U\u0013O", (short) (Od.Xd() ^ (-14879)), (short) (Od.Xd() ^ (-13862))));
                    return new ApplicationVersionModel(packageInfo.versionName);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
