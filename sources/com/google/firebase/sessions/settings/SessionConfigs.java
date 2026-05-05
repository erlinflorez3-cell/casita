package com.google.firebase.sessions.settings;

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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\r&4ߚ\u007f\u0007tpA0JeP.`Z2\u000fq\u0013<$i0yّA٦ \u0014̝9O|f($Z`\u0019C'\b,w\u0019-Y[\u0007_*\u0011HA\u001eBCS}AQb\u000b53%B(F\u007f\u001d\u00030)v\u0015\u0007\u0001QR$\u0014F?\u001fBň\u0011M\u0013#Z\u0014L7\u0019 rf|7\u000fȔ^Ơ3#\u0011z\u000b\\5wH~c\ftWm̠wҐ\"+NL}#3l\u001b\thZm\b\u0006҃>ݾl'56\u0012\u0002ePp\u0002*\u0014YTSǥs͉`\u0005_kT59j{Mf\rV\u007fAՏ\u000eʀ\b\u000e\u00145\u0011v;6~\b<ޗ%zY@^\u0002vD\u0016y\u00107G-\u000639;3hg`i\u001c~?\u0002\u0005\u001b\";\u0003\u0005 \nY>h\u001b\u001bb}i3g?kM~\u0012_={\u000b\td\u0018)28\u000eŐ.ɨ\u0015.%B\u007flGA9k0Itm\u0005$xjih\u0001G\u0007ͥo^>8)$ZriK®O\u001d_:2e\u001c\u0003)Dވ\u0012po\u0006B9'&M}mȬnUe\n3;~9_xy\u0019(Ll:MSy\u000f\u0010Zλ\u0018GDb\u0013g~DY\u0019hjx5@H\u0003\u0012\u000ezrOܟ\u0017:Gq*FD3\u001fl#YS1PE\u0015\u000buY\u0017\u0015њX;,\u0003w0\r\u000b\u0007cj{@z\u0007KD~v![Dپ9!.U0~L~)\u001b\r\tûK\u000b"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005nCY\r/;v\u0018<\u00171;yB\"\u001fq?C\u0010d0P\u0005|", "", "Adb@\\6G3\"zwe,{", "", "Adb@\\6GA\u0015\u0007\u0006e0\u0006\u000b\u001ca\u000f(", "", "Adb@\\6G@\u0019\r\nZ9\fw3m\u007f2\fO", "", "1`R5X\u000bN`\u0015\u000e~h5", "1`R5X\u001cIR\u0015\u000ez]\u001b\u0001\u0011/", "", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q'\u0006\u0013(C9\u00158\u007f'~8\b04t\u0016\u00044H7|0g\u001cdj;PG5]v)GY$\u0013aN\u00049]\u0019V\u0017Ptp\u000ehA&nQ\r\u0006\r(Z}\u0005o|\u0015\u0018W\u001ctyD,S8", "5dc\u0010T*ASw\u000f\bZ;\u0001\u00138", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "5dc\u0010T*AS\t\nyZ;|\b\u001ei\b(", "u(;7T=:\u001d z\u0004`uc\u00138gU", "\u001aiPCTuEO\"\u0001DE6\u0006\u000b\u0005", "5dc X:LW#\bZg(y\u0010/d", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "5dc X:LW#\bg^:\f\u0005<tn,\u0004@\u000b'&", "5dc X:LW#\bhZ4\b\u00103n\u0002\u0015wO\u0001", "u(;7T=:\u001d z\u0004`u[\u0013?b\u0007(Q", "\u001aiPCTuEO\"\u0001D=6\r\u00066eU", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n_F", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q'\u0006\u0013(C9\u00158\u007f'~8\b04t\u0016\u00044H7|0g\u001cdj;PG5]v)GY$\u0013aN\u00049]\u0019V\u0017Ptp\u000ehA&nQ\r\u0006\r(Z}\u0005o|\u0015\u0018W\u001ctyD,S.w\u001f}\u000b+rP[fy\u0011BIo*a\bm\u001d&H:2\"u#$v\u001a<\n\u000bb\u0015{T\b1UG'\t<.GKeOFsWJJ", "3pd._:", "=sW2e", "6`b566=S", "BnBAe0GU", "", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SessionConfigs {
    private final Integer cacheDuration;
    private final Long cacheUpdatedTime;
    private final Boolean sessionEnabled;
    private final Integer sessionRestartTimeout;
    private final Double sessionSamplingRate;

    public SessionConfigs(Boolean bool, Double d2, Integer num, Integer num2, Long l2) {
        this.sessionEnabled = bool;
        this.sessionSamplingRate = d2;
        this.sessionRestartTimeout = num;
        this.cacheDuration = num2;
        this.cacheUpdatedTime = l2;
    }

    public static /* synthetic */ SessionConfigs copy$default(SessionConfigs sessionConfigs, Boolean bool, Double d2, Integer num, Integer num2, Long l2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            bool = sessionConfigs.sessionEnabled;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            d2 = sessionConfigs.sessionSamplingRate;
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            num = sessionConfigs.sessionRestartTimeout;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            num2 = sessionConfigs.cacheDuration;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            l2 = sessionConfigs.cacheUpdatedTime;
        }
        return sessionConfigs.copy(bool, d2, num, num2, l2);
    }

    public final Boolean component1() {
        return this.sessionEnabled;
    }

    public final Double component2() {
        return this.sessionSamplingRate;
    }

    public final Integer component3() {
        return this.sessionRestartTimeout;
    }

    public final Integer component4() {
        return this.cacheDuration;
    }

    public final Long component5() {
        return this.cacheUpdatedTime;
    }

    public final SessionConfigs copy(Boolean bool, Double d2, Integer num, Integer num2, Long l2) {
        return new SessionConfigs(bool, d2, num, num2, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) obj;
        return Intrinsics.areEqual(this.sessionEnabled, sessionConfigs.sessionEnabled) && Intrinsics.areEqual((Object) this.sessionSamplingRate, (Object) sessionConfigs.sessionSamplingRate) && Intrinsics.areEqual(this.sessionRestartTimeout, sessionConfigs.sessionRestartTimeout) && Intrinsics.areEqual(this.cacheDuration, sessionConfigs.cacheDuration) && Intrinsics.areEqual(this.cacheUpdatedTime, sessionConfigs.cacheUpdatedTime);
    }

    public final Integer getCacheDuration() {
        return this.cacheDuration;
    }

    public final Long getCacheUpdatedTime() {
        return this.cacheUpdatedTime;
    }

    public final Boolean getSessionEnabled() {
        return this.sessionEnabled;
    }

    public final Integer getSessionRestartTimeout() {
        return this.sessionRestartTimeout;
    }

    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    public int hashCode() {
        Boolean bool = this.sessionEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d2 = this.sessionSamplingRate;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Integer num = this.sessionRestartTimeout;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cacheDuration;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.cacheUpdatedTime;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.sessionEnabled + ", sessionSamplingRate=" + this.sessionSamplingRate + ", sessionRestartTimeout=" + this.sessionRestartTimeout + ", cacheDuration=" + this.cacheDuration + ", cacheUpdatedTime=" + this.cacheUpdatedTime + ')';
    }
}
