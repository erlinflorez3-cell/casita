package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
import io.sentry.protocol.MetricSummary;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG6L͜P.`W2\u000fq\u007f<$i0yّCU(}*ޛUȞ}˧\u001fJ\t\n\u0004\"\u0016\u001a\u0007jDI\u0004ym\u0016\u001d4Zom6ޜs=Gd=<\u0013.J\"f\tK\u0015b0V \u000fzq\\R&\u0001L~?j\r{\u000bpŊ\b̧$\u0001&ձ8`DO\u0005]h7YC@ĬPϮc4\u0015O\u0013Ob1]\u0003o)C@e=kǯ_Ϋ\u000bRcΪSK\u007fI\u001dhU/\u0002ɡuɱ:X\bϬe7]\u001aurTd[ĬbВ++WҪ\u001c\\\u001c*\u0010z*\u0010\u0013ǌ\u0010Ν+H6Ʀըj\u001a"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u00049Z~}>i\u001e9)L?s0-\u0015gJC\u0006c\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u00161`\u000e \u0013v\u001a6IR;j\u001d(\u0014h7", "1n]3\\.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "<`c6i,\u001a\\\u001d\u0007vm,{q9d\u007f6c<\n\u0013\u0019G|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u000e1h\u000217I\u001f2U?Jk3\u0007\u001fgaGn_5Jx'T\"", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1Xy\u001d>m}*X\u0019\"i>&^i]7\u0007`6X|pTLJ*k\u001cnF\u0018\u001aV\u001dN*VmUP(\u007fD\u0013(\f4E\u0011;gi\u0016\u0015\u000eCRlKR\u0012G\u0007j92", "7m_Bg\u0015HR\u0019mv`", "", "7m_Bg\u0015HR\u0019ove<|", "", "5dc\u0016a7Nb\u0002\ty^\u001dx\u0010?e", "u(3", ":`bAI(Ec\u0019", ";`g#T3NS", ";h]#T3NS", ">qTAg@)`\u001d\b\n", "", "CoS.g,", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DiffClampAnimatedNode extends ValueAnimatedNode {
    private final int inputNodeTag;
    private double lastValue;
    private final double maxValue;
    private final double minValue;
    private final NativeAnimatedNodesManager nativeAnimatedNodesManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiffClampAnimatedNode(ReadableMap config, NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.inputNodeTag = config.getInt("input");
        this.minValue = config.getDouble(MetricSummary.JsonKeys.MIN);
        this.maxValue = config.getDouble(MetricSummary.JsonKeys.MAX);
        this.nodeValue = this.lastValue;
    }

    private final double getInputNodeValue() {
        AnimatedNode nodeById = this.nativeAnimatedNodesManager.getNodeById(this.inputNodeTag);
        if (nodeById == null || !(nodeById instanceof ValueAnimatedNode)) {
            throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
        }
        return ((ValueAnimatedNode) nodeById).getValue();
    }

    @Override // com.facebook.react.animated.ValueAnimatedNode, com.facebook.react.animated.AnimatedNode
    public String prettyPrint() {
        return "DiffClampAnimatedNode[" + this.tag + "]: InputNodeTag: " + this.inputNodeTag + " min: " + this.minValue + " max: " + this.maxValue + " lastValue: " + this.lastValue + " super: " + super.prettyPrint();
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public void update() {
        double inputNodeValue = getInputNodeValue();
        double d2 = inputNodeValue - this.lastValue;
        this.lastValue = inputNodeValue;
        this.nodeValue = Math.min(Math.max(this.nodeValue + d2, this.minValue), this.maxValue);
    }
}
