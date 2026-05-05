package com.biocatch.client.android.sdk.collection.collectors.application;

import android.content.pm.ApplicationInfo;
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
import yg.C1607wl;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;

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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0Le^.ZS0\u0010s{J$c$wDCU(\n*\tUPog\u0005Jb\u000bI\u000f\fǝ\u000f̓\\Oezm\u0012=2pn\u007fF]sK:xtd\u0007060;\u0012\u0005/\u001eݵL\u0010\u0005\u007f\fY\u001a$H@\u001fI\u0003\u0011[\u00182\u00124Rf\u0001fducNJ\u0003\\h/i\u0017:N\\(w0+OcЂVܮ\u0011viӜ{RE;-%\u0002\n='2ρ\u0005ӭuA\u001dj-/9RDiDb\u0018\u0014C6\u0006a4č(ػ\tUx\u000e-7]p\u001cb\u001c6\u0010z*\u001crXdΑ)ρ212h\u000e\u001eA\u0006C_NS\u001a^p\u0004Qʫ8а)\u007f;ٿݶ\u001f|"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\u0007\u0018\u0010`E\"jS;)\u0011\u0015E\n;F\u000b\u0013\u001d\u000e3yzO,", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p1U-,dN{<q\u001ca\u0015N)\u001c\u000ff\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011HY7cVp9#\u0016d\u0017\u0018\u0007\u0018\u0010`E\"jS;)\u0011\u0015E\n;P\u000b\u000b\u0016\u0015\u000b", "/o_9\\*:b\u001d\t\u0004<(z\f/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w)NFr8\u001c\u0011weC\u0010A(Ly'\u001d", ">`R8T.>;\u0015\bv`,\n", "\u001a`]1e6BRb|\u0005g;|\u0012>/\u000b0E+|\u0015\u001dCq\u000e$r.1[}-\r", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017\u001fFv;\"\u0013dp=\u0011l\nJt*G\"5(eQ\u007fG\u0018\u0011$\fX4\u001c\u0005bPmyL\u0001\n\u0004*O}=hh\b\u001f\n7j}\u0018\u001a\u0001", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u000ec7EW\u0017z\nb6\u0006q+m\u007f", "/o_9\\*:b\u001d\t\u0004B5}\u0013", "\u001a`]1e6BRb|\u0005g;|\u0012>/\u000b0E\u001c\f\"\u001eKm\nKz/>=\u0007!AC", "@t]\u0010b3ES\u0017\u000e~h5", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ApplicationNameCollector extends OnDemandCollector<ApplicationNameModel> {
    private final ApplicationCache applicationCache;
    private final PackageManager packageManager;

    public ApplicationNameCollector(ApplicationCache applicationCache, PackageManager packageManager) {
        Intrinsics.checkNotNullParameter(applicationCache, "applicationCache");
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        this.applicationCache = applicationCache;
        this.packageManager = packageManager;
    }

    private final String getApplicationName(ApplicationInfo applicationInfo) throws Throwable {
        int i2 = applicationInfo.labelRes;
        if (i2 == 0) {
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            if (charSequence != null) {
                return charSequence.toString();
            }
            PackageManager packageManager = this.packageManager;
            Object[] objArr = {applicationInfo};
            Method method = Class.forName(C1561oA.od("\r\u0019\u000e\u001b\u0017\u0010\nR\u0007\u0012\u0010\u0015\u0005\r\u0012J\f\bGhxy\u0001uzw^q}otq}", (short) (OY.Xd() ^ 14275))).getMethod(Wg.Zd("\u000f\u0019c\f7\u0013M&\u001ceTE$b\u0018-\u0006JZ", (short) (OY.Xd() ^ 17321), (short) (OY.Xd() ^ 867)), Class.forName(C1561oA.Kd("Yg^mkfb-cppwisz5xv8L|}zxsr\u0007|\u0004\u0004_\u0006~\t", (short) (C1607wl.Xd() ^ 2332))));
            try {
                method.setAccessible(true);
                return ((CharSequence) method.invoke(packageManager, objArr)).toString();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        String string = this.applicationCache.get().getString(i2);
        short sXd = (short) (C1607wl.Xd() ^ 29235);
        short sXd2 = (short) (C1607wl.Xd() ^ 13671);
        int[] iArr = new int["5D[\\]^_`abcdefghij@57B}2꣤:{HJIAGA$@\u0006g~\u007f\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\nh".length()];
        QB qb = new QB("5D[\\]^_`abcdefghij@57B}2꣤:{HJIAGA$@\u0006g~\u007f\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\nh");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) - sXd2);
            i3++;
        }
        Intrinsics.checkNotNullExpressionValue(string, new String(iArr, 0, i3));
        return string;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.ApplicationName;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.enableApplicationNameFeature;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "application_name";
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.OnDemandCollector
    public ApplicationNameModel runCollection() throws Throwable {
        ApplicationInfo applicationInfo = this.applicationCache.get().getApplicationInfo();
        if (applicationInfo == null) {
            return null;
        }
        String applicationName = getApplicationName(applicationInfo);
        String str = applicationInfo.packageName;
        Intrinsics.checkNotNullExpressionValue(str, "appInfo.packageName");
        return new ApplicationNameModel(applicationName, str);
    }
}
