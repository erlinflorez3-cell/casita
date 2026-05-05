package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njGOLe^.Zݷ2\u000fy{<řc$\bCC٥\"}0\u0015WNmitϺpŏs\u000f4\u00151k:Xe9p\"\u0013@B\b?aN\u007fAGb\r63#ݨ&8\b\tI&8P(v)L{\u0010 :Xph]US\u0013&*\u0006l-G2-s\\8`l\f=\u0006ݍ\u0005ݦFN/ڿ\u0001\u0013[\u0012^^7\u0013\u0007eL2\u00117cՖSYYޚTÜC\u0003Gмݞ\ty"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0014BU\u0007.8w#6)L?s0-\u0015gJC\u0006c\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0001>]\u0006\u001cFm\u0015\u0017WB;A", "1n]3\\.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "<`c6i,\u001a\\\u001d\u0007vm,{q9d\u007f6c<\n\u0013\u0019G|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u000e1h\u000217I\u001f2U?Jk3\u0007\u001fgaGn_5Jx'T\"", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1Xy\u001d>m}*X\u0019\"i>&^i]7\u0007`6X|pTLJ*k\u001cnF\u0018\u001aV\u001dN*VmUP(\u007fD\u0013(\f4E\u0011;gi\u0016\u0015\u000eCRlKR\u0012G\u0007j92", "BqP;f-H`!\\\u0005g-\u0001\u000b=", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0014BU\u0007.8w#6)L?s0-\u0015gJC\u0006cj=\u0004#PZO6iZPG\u001d\u0013^\u0010$", "1n[9X*MD\u001d~\rN7{\u0005>e\u000e", "", ">q^=f\u0014:^", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW!r61C\u0007'KU\u00129#", ">qTAg@)`\u001d\b\n", "", "\u000fmX:T;>R\b\fvg:}\u0013<m]2\u0005A\u0005\u0019", "!sPA\\*-`\u0015\b\t_6\n\u0011\ro\t)\u007fB", "\"qP;f-H`!\\\u0005g-\u0001\u000b", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class TransformAnimatedNode extends AnimatedNode {
    private final NativeAnimatedNodesManager nativeAnimatedNodesManager;
    private final List<TransformConfig> transformConfigs;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r(4\u0012}\nlʔ;FǏ\u0016L\\Q$*=k<7ż_$\u007fD\fm(\u007f:\t}Q>ˮzН^\u0017KƤ\u001e\u0018~n:Nuzc\u0018\u001d9ԸsG"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0014BU\u0007.8w#6)L?s0-\u0015gJC\u0006cj*\u007f+OH],[A\u007f9\u001d [\u0018[3j\u000fbB(p\u001a", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0014BU\u0007.8w#6)L?s0-\u0015gJC\u0006cj=\u0004#PZO6iZPG\u001d\u0013^\u0010$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0014BU\u0007.8w#6)L?s0-\u0015gJC\u0006c\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n| \u001bOk\u001d<un$fy)En ;U\u001fDo<\u001a$h`\"\u0011b,$:\u0018", "<nS2G(@", "", "5dc\u001bb+>B\u0015\u0001", "u(8", "Adc\u001bb+>B\u0015\u0001", "uH\u0018#", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private final class AnimatedTransformConfig extends TransformConfig {
        private int nodeTag;

        public AnimatedTransformConfig() {
            super();
        }

        public final int getNodeTag() {
            return this.nodeTag;
        }

        public final void setNodeTag(int i2) {
            this.nodeTag = i2;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\r&4\u0012}\nlʔ;FǏ\u0016L\\Q$*=k<7ż_$\u007fD\fm(\u007f:\t}Q>ˮzН^\u0017KƤ\u001e\u0018~n:Nuzc\u0018\u001d9ԸsG"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0014BU\u0007.8w#6)L?s0-\u0015gJC\u0006cj<\u0006#VPL\u001biN{K\u0015\u001cg\u0016,5\u0016\u0006]Cy", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0014BU\u0007.8w#6)L?s0-\u0015gJC\u0006cj=\u0004#PZO6iZPG\u001d\u0013^\u0010$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0014BU\u0007.8w#6)L?s0-\u0015gJC\u0006c\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n| \u001bOk\u001d<un$fy)En ;U\u001fDo<\u001a$h`\"\u0011b,$:\u0018", "D`[BX", "", "5dc#T3NS", "u(3", "Adc#T3NS", "uC\u0018#", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private final class StaticTransformConfig extends TransformConfig {
        private double value;

        public StaticTransformConfig() {
            super();
        }

        public final double getValue() {
            return this.value;
        }

        public final void setValue(double d2) {
            this.value = d2;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005%2߭y\u001d߿\u001b9^C&K¯VS8\u000f<\u0016B%s&\bBiWpԉ.\u07beSZo˧\u0007L`\u000eQ\u0013&\u0018~o:OǪ|d"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0014BU\u0007.8w#6)L?s0-\u0015gJC\u0006cj=\u0004#PZO6iZPG\u001d\u0013^\u0010$", "", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n| \u001bOk\u001d<un$fy)En ;U\u001fDo<\u001a$h`\"\u0011b,$:\u0018", ">q^=X9Mg", "", "5dc\u001de6IS&\u000e\u000f", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u001de6IS&\u000e\u000f", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private class TransformConfig {
        private String property;

        public TransformConfig() {
        }

        public final String getProperty() {
            return this.property;
        }

        public final void setProperty(String str) {
            this.property = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.react.animated.TransformAnimatedNode$StaticTransformConfig] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.facebook.react.animated.TransformAnimatedNode$AnimatedTransformConfig] */
    public TransformAnimatedNode(ReadableMap config, NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        ArrayList arrayList;
        ?? staticTransformConfig;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        ReadableArray array = config.getArray("transforms");
        if (array == null) {
            arrayList = new ArrayList();
        } else {
            int size = array.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                ReadableMap map = array.getMap(i2);
                String string = map.getString("property");
                if (Intrinsics.areEqual(map.getString("type"), "animated")) {
                    staticTransformConfig = new AnimatedTransformConfig();
                    staticTransformConfig.setProperty(string);
                    staticTransformConfig.setNodeTag(map.getInt("nodeTag"));
                } else {
                    staticTransformConfig = new StaticTransformConfig();
                    staticTransformConfig.setProperty(string);
                    staticTransformConfig.setValue(map.getDouble("value"));
                }
                arrayList2.add((TransformConfig) staticTransformConfig);
            }
            arrayList = arrayList2;
        }
        this.transformConfigs = arrayList;
    }

    public final void collectViewUpdates(JavaOnlyMap propsMap) {
        double value;
        Intrinsics.checkNotNullParameter(propsMap, "propsMap");
        int size = this.transformConfigs.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            TransformConfig transformConfig = this.transformConfigs.get(i2);
            if (transformConfig instanceof AnimatedTransformConfig) {
                AnimatedNode nodeById = this.nativeAnimatedNodesManager.getNodeById(((AnimatedTransformConfig) transformConfig).getNodeTag());
                if (nodeById == null) {
                    throw new IllegalArgumentException("Mapped style node does not exist");
                }
                if (!(nodeById instanceof ValueAnimatedNode)) {
                    throw new IllegalArgumentException("Unsupported type of node used as a transform child node " + nodeById.getClass());
                }
                value = ((ValueAnimatedNode) nodeById).getValue();
            } else {
                Intrinsics.checkNotNull(transformConfig, "null cannot be cast to non-null type com.facebook.react.animated.TransformAnimatedNode.StaticTransformConfig");
                value = ((StaticTransformConfig) transformConfig).getValue();
            }
            JavaOnlyMap javaOnlyMapOf = JavaOnlyMap.of(transformConfig.getProperty(), Double.valueOf(value));
            Intrinsics.checkNotNullExpressionValue(javaOnlyMapOf, "of(...)");
            arrayList.add(javaOnlyMapOf);
        }
        propsMap.putArray(ViewProps.TRANSFORM, JavaOnlyArray.from(arrayList));
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public String prettyPrint() {
        return "TransformAnimatedNode[" + this.tag + "]: transformConfigs: " + this.transformConfigs;
    }
}
