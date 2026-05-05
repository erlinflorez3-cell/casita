package com.biocatch.client.android.sdk.backend.communication;

import com.biocatch.android.commonsdk.logging.Log;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4Q\u0007\":\u0012\u007fјlʑOӄtev-\u0013~:\u0013y{L$\n%\u0002GIW2}P\n_Ruj\u0007J\t\fS\u0013\u0014\u001a\u0011jZJe|k\u0017'2ppУ7M}C\u0002f\u0003H\u001d `5~yU\u0019(-`\u0010%{\u001až\u0018ܘ4Lxíj\u000fS\f(\u001a&@&\n,f8fDL\u0005]h0yɌuŌR3gܞ\u0015O\u0013Qb/-xg*9J\bD#*k\u00035SÜC\tGмU\u0007n453\u001a\fe6p\u007fB\u0016\u0002̄\u0019ǁv2dӤib\u001259W\u0004MV\u001d6\u0002K\u0014\u001b>\u001c\u000e4(\u001f͚9բj\u0014\u0016ޗ\rtYP^\n~D\u0006\fo@ж)\u0014"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011;[(e`zA#!Z\u001b<+\u001c\u0014]J&|\u001a", "", ";db@T.><)\u0007ih\u0019|\u0018<y", "", ";db@T.>@\u0019\u000e\br\u0010\u0006\u0018/r\u0011$\u0003", "7mR?X4>\\(z\u0002@9\u0007\u001b>h\\(\u000bR\u0001\u0017 (k\u0012C\u000725g", ";`g\u0016a;>`*z\u0002;,\f\u001b/e\t\twD\b'$G}", ";`g\u001aX:LO\u001b~\tM6]\u0010?s\u0003", "uH8\u0016<\u0010\u0002D", "5dc\u0016a*KS!~\u0004m(\u0004j<o\u00127~\u001d\u0001&)Go\u0017\u001dr)<i\u000b E", "u(8", "Adc\u0016a*KS!~\u0004m(\u0004j<o\u00127~\u001d\u0001&)Go\u0017\u001dr)<i\u000b E", "uH\u0018#", "5dc\u001aT?\"\\(~\bo(\u0004e/t\u0012({Ia\u0013\u001bN\u007f\u001b<\u0005", "Adc\u001aT?\"\\(~\bo(\u0004e/t\u0012({Ia\u0013\u001bN\u007f\u001b<\u0005", "5dc\u001aT?&S'\rv`,\u000bw9F\u00078\nC", "5dc\u001aX:LO\u001b~cn4k\u0013\u001ce\u000f5\u0010", "Adc\u001aX:LO\u001b~cn4k\u0013\u001ce\u000f5\u0010", "5dc\u001aX:LO\u001b~g^;\n\u001d\u0013n\u000f(\tQ|\u001e", "Adc\u001aX:LO\u001b~g^;\n\u001d\u0013n\u000f(\tQ|\u001e", "D`[6W(MS\b\fvg:\u0005\r>t\u007f5i@\u0010&\u001bPq\u001c", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TransmitterSettings {
    private int incrementalGrowthBetweenFailures;
    private int maxIntervalBetweenFailures;
    private final int maxMessagesToFlush;
    private int messageNumToRetry;
    private int messageRetryInterval;

    public TransmitterSettings(int i2, int i3, int i4, int i5, int i6) {
        this.messageNumToRetry = i2;
        this.messageRetryInterval = i3;
        this.incrementalGrowthBetweenFailures = i4;
        this.maxIntervalBetweenFailures = i5;
        this.maxMessagesToFlush = i6;
        validateTransmitterSettings();
    }

    private final void validateTransmitterSettings() {
        int i2 = this.messageNumToRetry;
        if (i2 < 1 || i2 > 1000) {
            Log.Companion.getLogger().warning("The provided configuration of retry message number to send is invalid, it must be in the following range: [1 - 1000], setting to default: 5");
            this.messageNumToRetry = 5;
        }
        int i3 = this.messageRetryInterval;
        if (i3 < 100 || i3 > 10000) {
            Log.Companion.getLogger().warning("The provided configuration of message retry interval is invalid, it must be in the following range: [100 - 10000], setting to default: 1000");
            this.messageRetryInterval = 1000;
        }
        int i4 = this.incrementalGrowthBetweenFailures;
        if (i4 < 0 || i4 > 10000) {
            Log.Companion.getLogger().warning("The provided configuration of incremental growth between failures is invalid, it must be in the following range: [0 - 10000], setting to default: 3500");
            this.incrementalGrowthBetweenFailures = 3500;
        }
        int i5 = this.maxIntervalBetweenFailures;
        if (i5 < 100 || i5 > 300000) {
            Log.Companion.getLogger().warning("The provided configuration of max interval between failures is invalid, it must be in the following range: [100 - 300000], setting to default: 16000");
            this.maxIntervalBetweenFailures = 16000;
        }
        if (this.maxIntervalBetweenFailures < this.messageRetryInterval) {
            Log.Companion.getLogger().warning("The provided max interval between failures is smaller than message retry interval, setting to defaults: max interval between failures: 16000, message retry interval: 1000");
            this.maxIntervalBetweenFailures = 16000;
            this.messageRetryInterval = 1000;
        }
    }

    public final int getIncrementalGrowthBetweenFailures() {
        return this.incrementalGrowthBetweenFailures;
    }

    public final int getMaxIntervalBetweenFailures() {
        return this.maxIntervalBetweenFailures;
    }

    public final int getMaxMessagesToFlush() {
        return this.maxMessagesToFlush;
    }

    public final int getMessageNumToRetry() {
        return this.messageNumToRetry;
    }

    public final int getMessageRetryInterval() {
        return this.messageRetryInterval;
    }

    public final void setIncrementalGrowthBetweenFailures(int i2) {
        this.incrementalGrowthBetweenFailures = i2;
    }

    public final void setMaxIntervalBetweenFailures(int i2) {
        this.maxIntervalBetweenFailures = i2;
    }

    public final void setMessageNumToRetry(int i2) {
        this.messageNumToRetry = i2;
    }

    public final void setMessageRetryInterval(int i2) {
        this.messageRetryInterval = i2;
    }
}
