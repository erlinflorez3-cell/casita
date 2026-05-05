package kotlin.jvm.internal;

import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00156B\u0005*4\u0012\u0006\rnj?2JΝHDɟ\u0004*=j<9*[ҸuCIUj\n0\ngN\u0016iEЁ-ŲG\u000f\u000eǝIv:Lmx\f\u0014e˷\u0015ņC3Uڎ\u000eEnxN\u0005N4x؇Lڱ\u0005\u001a2Ϻ`\u000b\tHc\f@2vt\u0011ĭ_̂\t \u001aßN\"\u0007$jg\u001fBVsu:]%Y݊\u0015Ě+_8ŧ\u001e\u0019T\\?\r%ctѯ\u0013˝9\u0015-مS\u0013`dW\u0003ms\u0014ݢ;Ҋ++Q֕(Jf\n,\u0015YQCaI̮/ԇUf\u0014ʬ;QiV^\u000ex\f\t\b%<2\u001b<+\u001f͛\u007fբj\u000e\u0016ޗ\u0005tYN^\u0002/V\u000e\ny6E267\u0002ݕmƻUgCϊ^9\u0002\u0015\u001b\u001eũ\u0005\u007f"}, d2 = {"\u001aj^A_0G\u001d\u001e\u0010\u0003(0\u0006\u0018/r\t$\u0003\n^\u001a\u0013TM\u0018D\u0002!>]\b)!j\u001b.KR\u0011", "", "u(E", "\u001b@G,;\u0010 6\u0013ljK\u0019fj\u000bT_", "", "\u001b@G,?\u00160M\u0007ngK\u0016^d\u001eE", "\u001b@G,F\u001c+@\u0003`VM\f", "\u001b@G,I\b%Cx", "5dc\u001a4\u001f8Dtej>jx\u00128o\u000f$\u000bD\u000b %", "\u001bH=,;\u0010 6\u0013ljK\u0019fj\u000bT_", "\u001bH=,?\u00160M\u0007ngK\u0016^d\u001eE", "\u001bH=,F\u001c+@\u0003`VM\f", "\u001bH=,I\b%Cx", "5dc\u001a<\u00158Dtej>jx\u00128o\u000f$\u000bD\u000b %", "!HI\u0012R\t\"B\u0007", "", "5dc <!\u001eMubiLjx\u00128o\u000f$\u000bD\u000b %", "!HI\u0012R\t2Bxl", "5dc <!\u001eMuri>\u001a;\u00058n\n7wO\u0005! U", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CharCompanionObject {
    public static final CharCompanionObject INSTANCE = new CharCompanionObject();
    public static final char MAX_HIGH_SURROGATE = 56319;
    public static final char MAX_LOW_SURROGATE = 57343;
    public static final char MAX_SURROGATE = 57343;
    public static final char MAX_VALUE = 65535;
    public static final char MIN_HIGH_SURROGATE = 55296;
    public static final char MIN_LOW_SURROGATE = 56320;
    public static final char MIN_SURROGATE = 55296;
    public static final char MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;

    private CharCompanionObject() {
    }

    public static /* synthetic */ void getMAX_VALUE$annotations() {
    }

    public static /* synthetic */ void getMIN_VALUE$annotations() {
    }

    public static /* synthetic */ void getSIZE_BITS$annotations() {
    }

    public static /* synthetic */ void getSIZE_BYTES$annotations() {
    }
}
