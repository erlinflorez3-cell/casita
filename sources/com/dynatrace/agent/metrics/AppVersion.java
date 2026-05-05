package com.dynatrace.agent.metrics;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004O\r8é6B\r.4\u0012}\u000fnjG9LeN.ZS8\u0015s{:$aҜwYП\u0006\u001a,!If^kunbZ9D\u001f\f$z\u0003._T'`ܫ\u00134HsM8\u0016vKCxtd\u0006fތ#\u0001\u0003\u0013\f2,^\u000f%}\nƾ\rZMN|RR;˟5 \u0018\u0006L \u0019\u001e\u000bh~>Nlk<G%\u0019hpQm܆/E^\u001bSl';\u0005\u0012$9OO7+$\u0002\u0002Mӏ\\\b\nM\u0002U\u0005\u00178mȹH<^Dj\u0018\u0014C.\u0016֬\\C5j\u0005i`:(˦SiSִ&*}\u0001\n\u0014\r\u0015\u001c\b?JD,Hiڿ\u00129|ɁkBV\nlKȾ~t"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\t\u0017&Ts\fJ@\u0001@dn D{\u001a8V\u0019", "", "Dda@\\6G1#}z", "", "Dda@\\6G<\u0015\u0007z", "", "\nh]6g\u0005", "uI;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004q", "5dc#X9LW#\bXh+|", "u(9", "5dc#X9LW#\bcZ4|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class AppVersion {
    private final long versionCode;
    private final String versionName;

    public AppVersion(long j2, String str) {
        this.versionCode = j2;
        this.versionName = str;
    }

    public static /* synthetic */ AppVersion copy$default(AppVersion appVersion, long j2, String str, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            j2 = appVersion.versionCode;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            str = appVersion.versionName;
        }
        return appVersion.copy(j2, str);
    }

    public final long component1() {
        return this.versionCode;
    }

    public final String component2() {
        return this.versionName;
    }

    public final AppVersion copy(long j2, String str) {
        return new AppVersion(j2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppVersion)) {
            return false;
        }
        AppVersion appVersion = (AppVersion) obj;
        return this.versionCode == appVersion.versionCode && Intrinsics.areEqual(this.versionName, appVersion.versionName);
    }

    public final long getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.versionCode) * 31;
        String str = this.versionName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AppVersion(versionCode=" + this.versionCode + ", versionName=" + this.versionName + ')';
    }
}
