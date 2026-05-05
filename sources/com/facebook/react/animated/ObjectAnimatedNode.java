package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0L͜P.`S2şs{B0c$wCCU0}*ޛWN}gvJ`\fIƤ\u001cǝ\u0017{\\I\u0004w\u0016\u0011 rU\u007fCAM\b=ga\u0005:\u0013\"J\"f|ڱ\u0005\u001a8LX\u000b\tJc\f@8ptH[%M3$B\nL+\u0019\u001e\u000bm\u0017HVxu<E\"1vrT5mH~c\ftcm\r?s,7X9K\u0014SY3\r`iW\u0005Upk\u0006/'o1W\u0004o6\u0007\nZ){[\u001bb\u000b&\u000b\u000b(ӣ\u000eˏ/Ok֟!\u001a6y\u0013{;?Z\u05fd\bόL.5ԿǺ\f "}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u000f2^}\u001eFI\u001f2U?Jk3\u0007\u001fga\u000f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u0001>]\u0006\u001cFm\u0015\u0017WB;A", "1n]3\\.", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "<`c6i,\u001a\\\u001d\u0007vm,{q9d\u007f6c<\n\u0013\u0019G|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u000e1h\u000217I\u001f2U?Jk3\u0007\u001fgaGn_5Jx'T\"", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1Xy\u001d>m}*X\u0019\"i>&^i]7\u0007`6X|pTLJ*k\u001cnF\u0018\u001aV\u001dN*VmUP(\u007fD\u0013(\f4E\u0011;gi\u0016\u0015\u000eCRlKR\u0012G\u0007j92", "1n]3\\.\u001cZ#\bz", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW!r61C\u0007'KU\u00129#", "1n[9X*MD\u001d~\rN7{\u0005>e\u000e", "", ">q^=>,R", "", ">q^=f\u0014:^", "1n[9X*MD\u001d~\rN7{\u0005>e\u000e\u000b{G\f\u0017$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW!r61C\u0007'KI#;IW\u0011", "And?V,", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", ">qTAg@)`\u001d\b\n", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ObjectAnimatedNode extends AnimatedNode {
    public static final Companion Companion = new Companion(null);
    private static final String NODE_TAG_KEY = "nodeTag";
    private static final String VALUE_KEY = "value";
    private final JavaOnlyMap configClone;
    private final NativeAnimatedNodesManager nativeAnimatedNodesManager;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005\"2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈ƪ6F"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E<\n\u001b\u001fC~\u000e;@\u000f2^}\u001eFI\u001f2U?Jk3\u0007\u001fgawdm4Yr0KVW\u0002", "", "u(E", "\u001cN3\u0012R\u001b\u001a5\u0013dZR", "", "$@;\"8&$3\r", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ObjectAnimatedNode(ReadableMap config, NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        JavaOnlyMap javaOnlyMapDeepClone = JavaOnlyMap.deepClone(config);
        Intrinsics.checkNotNullExpressionValue(javaOnlyMapDeepClone, "deepClone(...)");
        this.configClone = javaOnlyMapDeepClone;
    }

    private final JavaOnlyArray collectViewUpdatesHelper(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            switch (WhenMappings.$EnumSwitchMapping$0[readableArray.getType(i2).ordinal()]) {
                case 1:
                    javaOnlyArray.pushNull();
                    break;
                case 2:
                    javaOnlyArray.pushBoolean(readableArray.getBoolean(i2));
                    break;
                case 3:
                    javaOnlyArray.pushDouble(readableArray.getDouble(i2));
                    break;
                case 4:
                    javaOnlyArray.pushString(readableArray.getString(i2));
                    break;
                case 5:
                    ReadableMap map = readableArray.getMap(i2);
                    if (map.hasKey(NODE_TAG_KEY) && map.getType(NODE_TAG_KEY) == ReadableType.Number) {
                        AnimatedNode nodeById = this.nativeAnimatedNodesManager.getNodeById(map.getInt(NODE_TAG_KEY));
                        if (nodeById == null) {
                            throw new IllegalArgumentException("Mapped value node does not exist".toString());
                        }
                        if (nodeById instanceof ValueAnimatedNode) {
                            ValueAnimatedNode valueAnimatedNode = (ValueAnimatedNode) nodeById;
                            Object animatedObject = valueAnimatedNode.getAnimatedObject();
                            if (animatedObject instanceof Integer) {
                                javaOnlyArray.pushInt(((Number) animatedObject).intValue());
                            } else if (animatedObject instanceof String) {
                                javaOnlyArray.pushString((String) animatedObject);
                            } else {
                                javaOnlyArray.pushDouble(valueAnimatedNode.getValue());
                            }
                        } else if (nodeById instanceof ColorAnimatedNode) {
                            javaOnlyArray.pushInt(((ColorAnimatedNode) nodeById).getColor());
                        }
                    } else {
                        javaOnlyArray.pushMap(collectViewUpdatesHelper(readableArray.getMap(i2)));
                    }
                    break;
                case 6:
                    javaOnlyArray.pushArray(collectViewUpdatesHelper(readableArray.getArray(i2)));
                    break;
            }
        }
        return javaOnlyArray;
    }

    private final JavaOnlyMap collectViewUpdatesHelper(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (WhenMappings.$EnumSwitchMapping$0[readableMap.getType(strNextKey).ordinal()]) {
                case 1:
                    javaOnlyMap.putNull(strNextKey);
                    break;
                case 2:
                    javaOnlyMap.putBoolean(strNextKey, readableMap.getBoolean(strNextKey));
                    break;
                case 3:
                    javaOnlyMap.putDouble(strNextKey, readableMap.getDouble(strNextKey));
                    break;
                case 4:
                    javaOnlyMap.putString(strNextKey, readableMap.getString(strNextKey));
                    break;
                case 5:
                    ReadableMap map = readableMap.getMap(strNextKey);
                    if (map != null && map.hasKey(NODE_TAG_KEY) && map.getType(NODE_TAG_KEY) == ReadableType.Number) {
                        AnimatedNode nodeById = this.nativeAnimatedNodesManager.getNodeById(map.getInt(NODE_TAG_KEY));
                        if (nodeById == null) {
                            throw new IllegalArgumentException("Mapped value node does not exist".toString());
                        }
                        if (nodeById instanceof ValueAnimatedNode) {
                            ValueAnimatedNode valueAnimatedNode = (ValueAnimatedNode) nodeById;
                            Object animatedObject = valueAnimatedNode.getAnimatedObject();
                            if (animatedObject instanceof Integer) {
                                javaOnlyMap.putInt(strNextKey, ((Number) animatedObject).intValue());
                            } else if (!(animatedObject instanceof String)) {
                                javaOnlyMap.putDouble(strNextKey, valueAnimatedNode.getValue());
                            } else {
                                javaOnlyMap.putString(strNextKey, (String) animatedObject);
                            }
                        } else if (nodeById instanceof ColorAnimatedNode) {
                            javaOnlyMap.putInt(strNextKey, ((ColorAnimatedNode) nodeById).getColor());
                        }
                    } else {
                        javaOnlyMap.putMap(strNextKey, collectViewUpdatesHelper(map));
                    }
                    break;
                case 6:
                    javaOnlyMap.putArray(strNextKey, collectViewUpdatesHelper(readableMap.getArray(strNextKey)));
                    break;
            }
        }
        return javaOnlyMap;
    }

    public final void collectViewUpdates(String propKey, JavaOnlyMap propsMap) {
        Intrinsics.checkNotNullParameter(propKey, "propKey");
        Intrinsics.checkNotNullParameter(propsMap, "propsMap");
        ReadableType type = this.configClone.getType("value");
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        if (type == ReadableType.Map) {
            propsMap.putMap(propKey, collectViewUpdatesHelper(this.configClone.getMap("value")));
        } else {
            if (type != ReadableType.Array) {
                throw new IllegalArgumentException("Invalid value type for ObjectAnimatedNode");
            }
            propsMap.putArray(propKey, collectViewUpdatesHelper(this.configClone.getArray("value")));
        }
    }

    @Override // com.facebook.react.animated.AnimatedNode
    public String prettyPrint() {
        return "ObjectAnimatedNode[" + this.tag + "]: mConfig: " + this.configClone;
    }
}
