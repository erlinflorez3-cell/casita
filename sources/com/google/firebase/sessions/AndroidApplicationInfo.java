package com.google.firebase.sessions;

import java.util.List;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4D\u0007\"B\u0012\u007fјnjGNLeN>ZS8\u0018s{:$c$\u007fICU }(ޜUdʴ\u0018nxYK|\u001f\n$x\u0003,wV\ta \u0011JB\u001e@CQ}@Q`#7\u0015$@&Py3\u0002*.V\u0015\u000fzqQ\u001c\u001c>G\t@b\u000f]\u0005H\u00184Fŋ\u0005\u001ejp\u0017=V\u007fu:]$IފC\u0017.mD\u0015M;G\u001bݒ\u000e?h,@X7c\u0016kڌ\u0004OYiU\u001b? >Kٙ(o2W\u000bo6\u0007\u0006ZǊ,\u0018\u001ak\u000b>b\u0015Sp\fU1}k\u0012\u05fb\u000fpA\t\u0015%<2\u05fa6-N.;\u001a~\b<4%xY@^\u0004vB.{\u0012<\u001d%\u000e6C9Ig\u0002gA\u0019\\;\u0014\u0005;\u001fS\u0007t!iY&`C!\u0005\u0004W1_GUN^\fi=\u001c\n\u001fjHĖ\u0003xX\u000eI\u0014\u0011\\2U=iU;#\u0002\u0001vC.я\u0006)oa\u0007jHn@5߂6r\u0010\u001ay\\d3l\u0017ՐW| [\u001fl\u0007,\t˙$b\u007f˓9'\u0016X]s:\u007f[d\"+?hGY\u001dq<_ߍb9=ȡ{\u0012g^\u0005!\u0010Kp\npfpY۱^b0ίJJp\u001e\u0006\u000b\u0015]\u001a\u0017J? \u001dٜ07!¢-J\t.PLM\u0018mZ\u0001\u0010-Uտ(\tq˅\r\u000b\u0007aj{@v\u0007KD|\u000f#έEW=ӧ>W(zB\bɦ\u000b\u001f"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n\u0011b|-Aq\u0015\nXNBo2\u001a$lkBjl-XL", "", ">`R8T.><\u0015\u0007z", "", "Dda@\\6G<\u0015\u0007z", "/o_\u000fh0ER\n~\bl0\u0007\u0012", "2de6V,&O\"\u000f{Z*\f\u0019<e\r", "1ta?X5M>&\tx^:\u000bg/t{,\u0003N", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n f\b\u001e7{$\rMR7o;,j", "/o_\u001de6<S'\rY^;x\r6s", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<D\u0010\u001b\\W<:\u001a\tbCyUBA'Q.S\f=o\u0001U\u0017\u0012Bjm>d\u0010\u0011\b\u0015\u0004O-rOg)dTKCb8rj_,X>A2iX\u001e\u0017yLw\u001a\u000bW\u0018<9}uv\u001d\\k", "5dc\u000ec7\u001bc\u001d\u0006yO,\n\u00173o\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u000ec7)`#|zl:[\t>a\u0004/\n", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u0010h9KS\"\u000eek6z\t=s^(\u000b<\u0005\u001e%", "u(;0b4\bU#\t|e,F\n3r\u007f%wN\u0001`%G}\u001c@\u0001.C#h-Ak\u0016<[\";z0\"\u001cv7", "5dc\u0011X=BQ\u0019fvg<}\u0005-t\u00105{M", "5dc\u001dT*DO\u001b~cZ4|", "5dc#X9LW#\bcZ4|", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidApplicationInfo {
    private final String appBuildVersion;
    private final List<ProcessDetails> appProcessDetails;
    private final ProcessDetails currentProcessDetails;
    private final String deviceManufacturer;
    private final String packageName;
    private final String versionName;

    public AndroidApplicationInfo(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, ProcessDetails currentProcessDetails, List<ProcessDetails> appProcessDetails) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        this.packageName = packageName;
        this.versionName = versionName;
        this.appBuildVersion = appBuildVersion;
        this.deviceManufacturer = deviceManufacturer;
        this.currentProcessDetails = currentProcessDetails;
        this.appProcessDetails = appProcessDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndroidApplicationInfo copy$default(AndroidApplicationInfo androidApplicationInfo, String str, String str2, String str3, String str4, ProcessDetails processDetails, List list, int i2, Object obj) {
        if ((1 & i2) != 0) {
            str = androidApplicationInfo.packageName;
        }
        if ((2 & i2) != 0) {
            str2 = androidApplicationInfo.versionName;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            str3 = androidApplicationInfo.appBuildVersion;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            str4 = androidApplicationInfo.deviceManufacturer;
        }
        if ((16 & i2) != 0) {
            processDetails = androidApplicationInfo.currentProcessDetails;
        }
        if ((i2 & 32) != 0) {
            list = androidApplicationInfo.appProcessDetails;
        }
        return androidApplicationInfo.copy(str, str2, str3, str4, processDetails, list);
    }

    public final String component1() {
        return this.packageName;
    }

    public final String component2() {
        return this.versionName;
    }

    public final String component3() {
        return this.appBuildVersion;
    }

    public final String component4() {
        return this.deviceManufacturer;
    }

    public final ProcessDetails component5() {
        return this.currentProcessDetails;
    }

    public final List<ProcessDetails> component6() {
        return this.appProcessDetails;
    }

    public final AndroidApplicationInfo copy(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, ProcessDetails currentProcessDetails, List<ProcessDetails> appProcessDetails) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        return new AndroidApplicationInfo(packageName, versionName, appBuildVersion, deviceManufacturer, currentProcessDetails, appProcessDetails);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidApplicationInfo)) {
            return false;
        }
        AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) obj;
        return Intrinsics.areEqual(this.packageName, androidApplicationInfo.packageName) && Intrinsics.areEqual(this.versionName, androidApplicationInfo.versionName) && Intrinsics.areEqual(this.appBuildVersion, androidApplicationInfo.appBuildVersion) && Intrinsics.areEqual(this.deviceManufacturer, androidApplicationInfo.deviceManufacturer) && Intrinsics.areEqual(this.currentProcessDetails, androidApplicationInfo.currentProcessDetails) && Intrinsics.areEqual(this.appProcessDetails, androidApplicationInfo.appProcessDetails);
    }

    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    public final List<ProcessDetails> getAppProcessDetails() {
        return this.appProcessDetails;
    }

    public final ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return (((((((((this.packageName.hashCode() * 31) + this.versionName.hashCode()) * 31) + this.appBuildVersion.hashCode()) * 31) + this.deviceManufacturer.hashCode()) * 31) + this.currentProcessDetails.hashCode()) * 31) + this.appProcessDetails.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.packageName + ", versionName=" + this.versionName + ", appBuildVersion=" + this.appBuildVersion + ", deviceManufacturer=" + this.deviceManufacturer + ", currentProcessDetails=" + this.currentProcessDetails + ", appProcessDetails=" + this.appProcessDetails + ')';
    }
}
