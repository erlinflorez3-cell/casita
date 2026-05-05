package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4D\u0007\"B\u0012\u007fјnjO0LeN>ZS8\u0018s{:$c$\u007fICU }(ޜUdʴ\u0018nxYKv\u001f\n$x\u0003,wV\ta \u0011JB\u001e@CQ}@Q`#7\u0015$@&Py3\u0002*.V\u0015\u000fzqQ\u001c\u0016>G\t:\u0001\u0015̂\t\u001a \u000f\u0007'\u000f1tg|7\u000fȔ^\u000361\u0017\u0002B|(&ݥ}\u0016\u0014Ti?\r%bdүA\u007f<#;k\u00035S\"ϱ\u0004\bxK\u001c\u0001'U1\u0010לX~_\u000e,-+}\u0015$Ľ'%H_y$'YՒ\u0014QV\u000e6w\u0013{;=4\u0014\f'V0E\u001a\u0015\t>9zraCh\u0002\rC0\u0001g6%)\u00183Y:KlWaI\u001ef7*\u000b=$)\u0001|(sT<h[ĘS@b?kX=vi:_K\n\u001crx\u0001X\u0003vб\u0001w\u0003\u001fK/%ey\u007fّ 4\tVc\u007fv3a/\u061ch#WN)\u0007\u0016e2Á\u0010`Lߟ\u001dmV^f7a\\*T\u001f}6\u0014ء`}Dƙ=\u0012T[vv;\\k\f=/\u00158֍rq\u0016ãQ`9C_p`p`{,?jhۖ\\lJͭ$\\b70B\u0019y\u001e{\u0014D|\rƱ6EyʉL.7*j\"\u0019\u0012,EY|7`˖l\u0016\u0007ԞK&\t{2\u0002\u0590\u0005p"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n\u0011d\t';k\u0012=QMDO=\u001f\u001f>", "", "/o_\u0016W", "", "2de6V,&]\u0018~\u0002", "Adb@\\6GA\u0018\u0005k^9\u000b\r9n", "=rE2e:B]\"", ":nV\u0012a=B`#\b\u0003^5\f", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n\u001cc\u007f\u007f@~\u001a;WLCk=-j", "/mS?b0=/$\n^g-\u0007", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n\u0011b|-Aq\u0015\nXNBo2\u001a$lkBjl-XL", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<D\u0010\u001b\\W<:\u001a\tbCyUBA'Q.S\f=o\u0001U\u0017\u0012Bjm>d\u0010\u0011\b\u0015\u0004O-rOg)`QC%k;h\u0019i&d:C3iX\u0017%p\u001a0\u0014\u0006U\u0018r\u001czktG\u0016vF$\b{[TSs_E\u0003pzTz\u0005\u001c6WP6\u007f4\b2&Eh\u000fTK!?hNX\u001d", "5dc\u000ea+K]\u001d}Vi7`\u00120o", "u(;0b4\bU#\t|e,F\n3r\u007f%wN\u0001`%G}\u001c@\u0001.C#Y)6z 2L\u001fFv;\"\u0013dp=\u0011l\u0010Ww1\u001d", "5dc\u000ec7\"R", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0011X=BQ\u0019f\u0005],\u0004", "5dc\u0019b.\u001e\\*\u0003\bh5\u0005\t8t", "u(;0b4\bU#\t|e,F\n3r\u007f%wN\u0001`%G}\u001c@\u0001.C#d*9M\u001f?QPEt<\u001e\u001ew7", "5dc\u001cf\u001d>`'\u0003\u0005g", "5dc X:LW#\bh]2m\t<s\u00042\u0005", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ApplicationInfo {
    private final AndroidApplicationInfo androidAppInfo;
    private final String appId;
    private final String deviceModel;
    private final LogEnvironment logEnvironment;
    private final String osVersion;
    private final String sessionSdkVersion;

    public ApplicationInfo(String appId, String deviceModel, String sessionSdkVersion, String osVersion, LogEnvironment logEnvironment, AndroidApplicationInfo androidAppInfo) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(sessionSdkVersion, "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        this.appId = appId;
        this.deviceModel = deviceModel;
        this.sessionSdkVersion = sessionSdkVersion;
        this.osVersion = osVersion;
        this.logEnvironment = logEnvironment;
        this.androidAppInfo = androidAppInfo;
    }

    public static /* synthetic */ ApplicationInfo copy$default(ApplicationInfo applicationInfo, String str, String str2, String str3, String str4, LogEnvironment logEnvironment, AndroidApplicationInfo androidApplicationInfo, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = applicationInfo.appId;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            str2 = applicationInfo.deviceModel;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            str3 = applicationInfo.sessionSdkVersion;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            str4 = applicationInfo.osVersion;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            logEnvironment = applicationInfo.logEnvironment;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            androidApplicationInfo = applicationInfo.androidAppInfo;
        }
        return applicationInfo.copy(str, str2, str3, str4, logEnvironment, androidApplicationInfo);
    }

    public final String component1() {
        return this.appId;
    }

    public final String component2() {
        return this.deviceModel;
    }

    public final String component3() {
        return this.sessionSdkVersion;
    }

    public final String component4() {
        return this.osVersion;
    }

    public final LogEnvironment component5() {
        return this.logEnvironment;
    }

    public final AndroidApplicationInfo component6() {
        return this.androidAppInfo;
    }

    public final ApplicationInfo copy(String appId, String deviceModel, String sessionSdkVersion, String osVersion, LogEnvironment logEnvironment, AndroidApplicationInfo androidAppInfo) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(sessionSdkVersion, "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        return new ApplicationInfo(appId, deviceModel, sessionSdkVersion, osVersion, logEnvironment, androidAppInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationInfo)) {
            return false;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) obj;
        return Intrinsics.areEqual(this.appId, applicationInfo.appId) && Intrinsics.areEqual(this.deviceModel, applicationInfo.deviceModel) && Intrinsics.areEqual(this.sessionSdkVersion, applicationInfo.sessionSdkVersion) && Intrinsics.areEqual(this.osVersion, applicationInfo.osVersion) && this.logEnvironment == applicationInfo.logEnvironment && Intrinsics.areEqual(this.androidAppInfo, applicationInfo.androidAppInfo);
    }

    public final AndroidApplicationInfo getAndroidAppInfo() {
        return this.androidAppInfo;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final LogEnvironment getLogEnvironment() {
        return this.logEnvironment;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getSessionSdkVersion() {
        return this.sessionSdkVersion;
    }

    public int hashCode() {
        return (((((((((this.appId.hashCode() * 31) + this.deviceModel.hashCode()) * 31) + this.sessionSdkVersion.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.logEnvironment.hashCode()) * 31) + this.androidAppInfo.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.appId + ", deviceModel=" + this.deviceModel + ", sessionSdkVersion=" + this.sessionSdkVersion + ", osVersion=" + this.osVersion + ", logEnvironment=" + this.logEnvironment + ", androidAppInfo=" + this.androidAppInfo + ')';
    }
}
