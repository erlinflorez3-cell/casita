package com.statsig.androidsdk;

import com.google.gson.annotations.SerializedName;
import java.util.Map;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4D\u0007\":4\u007f\u0007lmA0RtP.XZ2\u000fy\u0003<$a%yCQU\"}(\u0013WNupvJ`\u000bK\u000f\u0014\u001c\u0001j2I[ލc(ƁbB\u001e>sX\u007fAG`\r63!ݨ&8\b\u0007I!8l(v)D\u0012ď\u0013xQ~_j\r{ĨJ\u0018\f>.\u00016\\\u0016O|զk&K=I\u001bipuWe>%e\u000f\\SU\f=ӄ\u001fsGE^-%\u0002-MӏZ\b\nM\u001dU\u0005\u0017(mȹHDkDX\u0018\u0014C,\u0006\u00114þ(ػ\tWhϯ?-UfYT^T\u0006\u007f\u0014\u001dL\u0006\u001e\u0006UI>1*h\u001e\rau\tRnV8b\u0001\u0004QʰBа)\f;ٿQ\u001dlXoC9P=\u0005\u0013\u0017nU\u000fy9od\u001cp!+V\bQ_RP?XN8Zks\u001ao\u0011\u000e`\bnKV\u0083\b 2%-7iJ;#q\u000fVR\bx\u000bovc:~VR:~&9:\t:[Th\u0015mfS\u0007-'LJZ=\u0002F\u0017vχ\u0004˶%1\u0018ʚgjo}[e*'5zEc?\u007f\u001clQ^aK\bgfШTλ\u0018EDϵ\u001dZlYa$+\u00056=JJ\u0001\u000f&\u0016tT\u001a,JA\b\u001bbFg\u001d\u001bY\u001fҙ*նE\t\u0011ݠrj\u0016\u001bbPD\u0005oB\u0003(Qnj\n\bi\u000fHZ{\u0017&kE(ډ%łY.pؔ\u0015%\r\u001f\u0002!giRiZ\u0010מy\u0002"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`.y\u0010\u001c\b%>hS", "", "3uT;g\u0015:[\u0019", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0012i,Gb\u0002z\u0003^", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", ";dc.W(MO", "", "5dc\u001aX;:R\u0015\u000ev", "u(;7T=:\u001d)\u000e~eud\u0005:;", "Adc\u001aX;:R\u0015\u000ev", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)p", "AdR<a+:`-^\u000ei6\u000b\u0019<e\u000e", "", "5dc X*H\\\u0018z\br\f\u0010\u00149s\u00105{N", "u(J\u0019](OOb\u000f\nb3Fp+pU", "Adc X*H\\\u0018z\br\f\u0010\u00149s\u00105{N", "uZ;7T=:\u001d)\u000e~eud\u0005:;C\u0019", ")KY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005", "AsPAf0@;\u0019\u000ev](\f\u0005", "5dc g(Ma\u001d\u0001b^;x\b+t{", "Adc g(Ma\u001d\u0001b^;x\b+t{", "Bh\\2", "", "5dc!\\4>", "u(9", "D`[BX", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7I\f DC", "CrT?", "5dc\"f,K", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9{Kr4C]\u007f\u0010Em#\u0004", "Adc\"f,K", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011]\u001d8\u000639[m.7zkq>", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc#T3NS", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "1n\\=b5>\\(J", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class LogEvent {

    @SerializedName(alternate = {}, value = "\f\u001c\n\u0012\u0017o\u0002\r\u0004")
    @InterfaceC1492Gx
    private final String eventName;

    @SerializedName(alternate = {}, value = "\u0014\u000b\u0019\u0005\u0007\u0003\u0015\u0001")
    @InterfaceC1492Gx
    private Map<String, String> metadata;

    @SerializedName(alternate = {}, value = "\u001a\u000b\b\u0013\u0011\u0006\u0002\u0012\u0018b\u0015\f\n\r\u000e\n{\t")
    @InterfaceC1492Gx
    private Map<String, String>[] secondaryExposures;

    @SerializedName(alternate = {}, value = "\u001a\u001a\u0006\u0018\u0016\u000b\bl\u0004\u0012}\u007f{\u000ey")
    @InterfaceC1492Gx
    private Map<String, String> statsigMetadata;

    @SerializedName(alternate = {}, value = "\u001b\u000f\u0012\t")
    @InterfaceC1492Gx
    private final long time;

    @SerializedName(alternate = {}, value = "\u001c\u0019\n\u0016")
    @InterfaceC1492Gx
    private StatsigUser user;

    @SerializedName(alternate = {}, value = "\u001d\u0007\u0011\u0019\b")
    @InterfaceC1492Gx
    private Object value;

    public LogEvent(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.eventName = eventName;
        this.time = System.currentTimeMillis();
    }

    public static /* synthetic */ LogEvent copy$default(LogEvent logEvent, String str, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            str = logEvent.eventName;
        }
        return logEvent.copy(str);
    }

    public final String component1() {
        return this.eventName;
    }

    public final LogEvent copy(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return new LogEvent(eventName);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LogEvent) && Intrinsics.areEqual(this.eventName, ((LogEvent) obj).eventName);
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final Map<String, String>[] getSecondaryExposures() {
        return this.secondaryExposures;
    }

    public final Map<String, String> getStatsigMetadata() {
        return this.statsigMetadata;
    }

    public final long getTime() {
        return this.time;
    }

    public final StatsigUser getUser() {
        return this.user;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.eventName.hashCode();
    }

    public final void setMetadata(Map<String, String> map) {
        this.metadata = map;
    }

    public final void setSecondaryExposures(Map<String, String>[] mapArr) {
        this.secondaryExposures = mapArr;
    }

    public final void setStatsigMetadata(Map<String, String> map) {
        this.statsigMetadata = map;
    }

    public final void setUser(StatsigUser statsigUser) {
        this.user = statsigUser == null ? null : statsigUser.getCopyForLogging$android_sdk_release();
    }

    public final void setValue(Object obj) {
        this.value = obj;
    }

    public String toString() {
        return "LogEvent(eventName=" + this.eventName + ')';
    }
}
