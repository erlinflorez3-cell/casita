package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0018\u007fјnjG4LeN0ZS8\u0016s{:$c$\u007fCCU ~(ޛeȞ\u0018g\u001dI\u001b\u0016S\u0013\u0014\u0016\u0011jZJǤ|] \u0011zP}LKM\u001eKid\u00036\u001d `#~\u000eM\u000f(9`\u0010%\tsO\u001a\"H@\u001fE\u0019!\u001e\u0011(\u0015\u001e>N\u0005tմsߑ:Htҗ\u000b;1\b\u0002B|-6ܡ\t֔\u0011F\\܋]\u0003o%C@e;kǯ_Ϋ\u000bRcΪSK\u007fE\u001dhU+\u0002ɡ\u007fɱ:X\bϬe7]\u0016urTb[ĬlВ++WҪ\u001c\\\u001c2\u0010z*\u0018\u0013ǌ\u001aΝ+H6Ʀjr\u0016\u001aKt!Y\u0017Г\u000eެF\u007f\u0003ʨِ\u001b6"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u00045Wy4\u0013v\u001a6IR?u=s", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0001>]\u0006\u001cFq 7,P?|4+j", "1n]3\\.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1Xy\u001d>m}*X\u0019~\\", "1ta?X5M:#\t\u0006", "", "2dR2_,KO(\u0003\u0005g", "", "4q^:I(Ec\u0019", "7sT?T;B]\"\r", ":`bAI(Ec\u0019", "AsP?g\rKO!~ib4|p3l\u0007,\n", "", "Dd[<V0Mg", "@db2g\nH\\\u001a\u0003|", "", "@t]\u000ea0FO(\u0003\u0005g\u001a\f\t:", "4qP:X\u001bB[\u0019gvg6\u000b", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DecayAnimation extends AnimationDriver {
    private int currentLoop;
    private double deceleration;
    private double fromValue;
    private int iterations;
    private double lastValue;
    private long startFrameTimeMillis;
    private double velocity;

    public DecayAnimation(ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.startFrameTimeMillis = -1L;
        this.iterations = 1;
        this.currentLoop = 1;
        resetConfig(config);
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void resetConfig(ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.velocity = config.getDouble("velocity");
        this.deceleration = config.getDouble("deceleration");
        this.startFrameTimeMillis = -1L;
        this.fromValue = 0.0d;
        this.lastValue = 0.0d;
        int i2 = config.hasKey("iterations") ? config.getInt("iterations") : 1;
        this.iterations = i2;
        this.currentLoop = 1;
        this.hasFinished = i2 == 0;
    }

    @Override // com.facebook.react.animated.AnimationDriver
    public void runAnimationStep(long j2) {
        ValueAnimatedNode valueAnimatedNode = this.animatedValue;
        if (valueAnimatedNode == null) {
            throw new IllegalArgumentException("Animated value should not be null".toString());
        }
        long j3 = j2 / ((long) 1000000);
        if (this.startFrameTimeMillis == -1) {
            this.startFrameTimeMillis = j3 - ((long) 16);
            double d2 = this.fromValue;
            if (d2 == this.lastValue) {
                this.fromValue = valueAnimatedNode.nodeValue;
            } else {
                valueAnimatedNode.nodeValue = d2;
            }
            this.lastValue = valueAnimatedNode.nodeValue;
        }
        double d3 = this.fromValue;
        double d4 = this.velocity;
        double d5 = 1;
        double d6 = this.deceleration;
        double dExp = d3 + ((d4 / (d5 - d6)) * (d5 - Math.exp((-(d5 - d6)) * (j3 - this.startFrameTimeMillis))));
        if (Math.abs(this.lastValue - dExp) < 0.1d) {
            int i2 = this.iterations;
            if (i2 != -1 && this.currentLoop >= i2) {
                this.hasFinished = true;
                return;
            } else {
                this.startFrameTimeMillis = -1L;
                this.currentLoop++;
            }
        }
        this.lastValue = dExp;
        valueAnimatedNode.nodeValue = dExp;
    }
}
