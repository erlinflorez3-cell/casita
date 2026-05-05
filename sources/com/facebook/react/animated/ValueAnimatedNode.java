package com.facebook.react.animated;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.react.bridge.ReadableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0016\u007f\u0007ljA0ZeP\u008cZS8\u000fs{:$c$\u007fّCU ~*\t]ZogtK`\u001fYƤ6\u0016'ilXe\u0001c\u0012\u001d2ZqU2{pެ=`\u00038M$@*Py3\nb.V\u001a\u000fzqTT\u001a>K\t<h\f{\u0011`&NB.\u000e6\\\u0016R~LzkR/Q\f2H\\6w0+]SZ\u001d5\u001b\by\u001eYIg;#7k\u0005\u001dQ\nFSO\u007f@\u001dhU+aɞ2Ɏ\rݛ\fЏ\u0019+WՕ.\u00034a\u001dQ\u000f\u0010]˃\u000eҪ\"ֶ\u001a߭{z\u0004Ȟ\r\u0012\u001c\f?JD,Hm^ԇ?ϢvSHАمbU"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u00161`\u000e \u0013v\u001a6IR;j\u001d(\u0014h7", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0001>]\u0006\u001cFm\u0015\u0017WB;A", "1n]3\\.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1Xy\u001d>m}*X\u0019~\\", "<nS2I(Ec\u0019", "", "=eU@X;", "D`[BX\u0013Ba(~\u0004^9", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0001>]\u0006\u001cFm\u0015\u0017WB;\\0%%hH=\u0015r,Wv4\u001d", "3wc?T*M=\u001a\u007f\t^;", "", "4kPAg,G=\u001a\u007f\t^;", "5dc\u000ea0FO(~yH)\u0002\t-t", "", "5dc#T3NS", "=mE._<>C$}vm,", ">qTAg@)`\u001d\b\n", "", "Adc#T3NS\u007f\u0003\tm,\u0006\t<", ":hbAX5>`", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class ValueAnimatedNode extends AnimatedNode {
    public double nodeValue;
    public double offset;
    private AnimatedNodeValueListener valueListener;

    public ValueAnimatedNode() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ValueAnimatedNode(ReadableMap readableMap) {
        this.nodeValue = readableMap != null ? readableMap.getDouble("value") : Double.NaN;
        this.offset = readableMap != null ? readableMap.getDouble(TypedValues.CycleType.S_WAVE_OFFSET) : 0.0d;
    }

    public /* synthetic */ ValueAnimatedNode(ReadableMap readableMap, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : readableMap);
    }

    public final void extractOffset() {
        this.offset += this.nodeValue;
        this.nodeValue = 0.0d;
    }

    public final void flattenOffset() {
        this.nodeValue += this.offset;
        this.offset = 0.0d;
    }

    public Object getAnimatedObject() {
        return null;
    }

    public final double getValue() {
        if (Double.isNaN(this.offset + this.nodeValue)) {
            update();
        }
        return this.offset + this.nodeValue;
    }

    public final void onValueUpdate() {
        AnimatedNodeValueListener animatedNodeValueListener = this.valueListener;
        if (animatedNodeValueListener != null) {
            animatedNodeValueListener.onValueUpdate(getValue());
        }
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public String prettyPrint() {
        return "ValueAnimatedNode[" + this.tag + "]: value: " + this.nodeValue + " offset: " + this.offset;
    }

    public final void setValueListener(AnimatedNodeValueListener animatedNodeValueListener) {
        this.valueListener = animatedNodeValueListener;
    }
}
