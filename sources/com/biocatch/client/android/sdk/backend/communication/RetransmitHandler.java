package com.biocatch.client.android.sdk.backend.communication;

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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u0018\u007fјnjG9LeN1ZS8\u000fs{:*aҕ\bّkUH|b\u0014_Rug\u0007J\t\fß\u0013\u0006$z30W]\u0011]@\u0013zF}HKM\u001eA\u0002d\u0003@\u001d `&\u0001}\u0013\f2*v\u001c?~QX$\u0012^F9>`\u001be\u0005H\u001eNB.\u00106\\\u0016Z~LzmR/Q\t2N\\8w0+S=Jb9%v\u0010$sLEH-%\u0002\u000f7Vi?\u001b? >Ut5*CI\"[\rݜ\fЏ\u0019+WՕ.~4a\u001dQ\u000f\u0012}ˆ[ӍOP\u0016ߊH\u0007\n\rT\u0004<\u0007}Ρ:ǉ\u001ef\u0010Ԅ\u0004\u0001\u0001ZXP0b\u0019Ș\u0007ˋ:\u0017-Įĺ/M"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u00119N;iN{K\u001c\u0016ipJ4\f\fYNy", "", "BqP;f4Bb(~\bL,\f\u00183n\u00026", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001d3k\u001c.VB\u0005i>&\u001dxj=\u0005_;R\u00010\u0011;[(e`zA#!Z\u001b<+\u001c\u0014]J&|\u001a", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i4i\u00144ML:52(\u001dpqB\u000ba(]z1P\u0016=9X[\u0001E\u0018!i\u000e[\u0019\r\u0014hE-pR\rbx", "1ta?X5M7\"\u000ezk=x\u0010", "", "BqP;f4Ba'\u0003\u0005g\u001a\r\u0007-e\u000e6|P\b", "", "BqX2f", "5dc\u001aT?&S'\rv`,\u000bw9F\u00078\nC", "5dc\u001bX?M7\"\u000ezk=x\u0010", "5dc!e0>a\u0002\u000f\u0003", "7mXAE,M`\u0015\b\tf0\u000b\u00173o\t", "", "7rC?T5L[\u001d\r\tb6\u0006v?c}(\nN\u0002'\u001e", "Adc\u001fX;KO\"\r\u0003b;]\u00053l\u007f'", "Adc\u001fX;KO\"\r\u0003b;j\u0019-c\u007f(z@\u007f", "Ag^B_+\u001dS z\u000f", "Ag^B_++S(\fvg:\u0005\r>", "7r<.a+:b#\f\u000f", "CoS.g,-`\u0015\b\tf0\f\u0018/rm(\u000bO\u0005 \u0019U", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class RetransmitHandler {
    private int currentInterval;
    private boolean transmissionSuccessful;
    private TransmitterSettings transmitterSettings;
    private int tries;

    public RetransmitHandler(TransmitterSettings transmitterSettings) {
        Intrinsics.checkNotNullParameter(transmitterSettings, "transmitterSettings");
        this.transmitterSettings = transmitterSettings;
        this.currentInterval = transmitterSettings.getMessageRetryInterval();
    }

    public final int getMaxMessagesToFlush() {
        return this.transmitterSettings.getMaxMessagesToFlush();
    }

    public final int getNextInterval() {
        return this.currentInterval;
    }

    public final int getTriesNum() {
        return this.tries;
    }

    public final void initRetransmission() {
        this.transmissionSuccessful = false;
        this.tries = 0;
        this.currentInterval = this.transmitterSettings.getMessageRetryInterval();
    }

    public final boolean isTransmissionSuccessful() {
        return this.transmissionSuccessful;
    }

    public final void setRetransmitFailed() {
        this.transmissionSuccessful = false;
        int incrementalGrowthBetweenFailures = this.currentInterval + (this.tries * this.transmitterSettings.getIncrementalGrowthBetweenFailures());
        if (incrementalGrowthBetweenFailures > this.transmitterSettings.getMaxIntervalBetweenFailures()) {
            incrementalGrowthBetweenFailures = this.transmitterSettings.getMaxIntervalBetweenFailures();
        }
        this.currentInterval = incrementalGrowthBetweenFailures;
        this.tries++;
    }

    public final void setRetransmitSucceeded() {
        this.transmissionSuccessful = true;
    }

    public final boolean shouldDelay() {
        return this.tries > 0;
    }

    public final boolean shouldRetransmit(boolean z2) {
        return !this.transmissionSuccessful && (z2 || this.tries <= this.transmitterSettings.getMessageNumToRetry());
    }

    public final void updateTransmitterSettings(TransmitterSettings transmitterSettings) {
        Intrinsics.checkNotNullParameter(transmitterSettings, "transmitterSettings");
        this.transmitterSettings = transmitterSettings;
    }
}
