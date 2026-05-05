package com.facebook.react.bridge;

import com.facebook.infer.annotation.Assertions;
import com.facebook.jni.HybridData;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\f6B\r\"4ߚ\u007f\u0007|jA0JfP.`_2şs{J$cҕyCI^\"Ԃ*\t]Ro˧vJh\u0011KƤ\u000e\u0016\u0007q4I[xe\u0012%2JoE6StSʠ~\u0010f\u0005N1R8(\u00059\u0019E\t\u0013ͯ~CY\rZ6NrRR;MK.Z\u0014L#\u0019\u001e\u000bk~:Vqu:])I}\u000b]5fH|{\u0011vX5\u0012\u000faL*\u0007ʽS]=a\u000b\u001fR\nC3C\u007fF\u001dhU1[O\u0002bNZ\u0016\u0013C7\u0016!&\n4i\u001dQ\u000f\u0010W/]lcP<2(~\n\u0018T\u0004<\u0014mεLu1t\u0017&3#v\u0004D^\u000bvB.\u0005\u0012:%0\u00183YIaƯo*R'_O{3\u0011N'\u000fw9[\u0003\u0018\u0011\u0019)_\u0010Q_c\u0007חf\u0017!gP\u0006\u0004\u001ff2.\u00129_\u007f]\u0006A2%0O[g7gȔ \u0011\\u\f\u001d`\u0017W\u001aVVI:nDAZ\u000f\u001ae\\f\u001bj~Z\u001f@Yf*j\u001f}6\u0017P`\u0006E9%>X\u007fnwue_ $]}}խ\r4'eQv3cU\u0014\u0014o[\u000f\u0014mF\u0013\u000bfqZU\"Y\u000b'høf3\u001f\u0006\u0015\\N:\u0017bC\u007f%L,_##ĀfK7P[\u0015\t\u000e^\u0019\u0014\r]K$1sTz\u0017\fh^\u0007n\u0016\u0003\u0010ت\u001bˉ&I"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7V\u0012=QT;S0)j", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7V\u0012=QT;S0)j", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7U\u00129#", "u(E", "1n_F", ";da4X", "", "And?V,", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", ";da4X\u0015:b\u001d\u0010zF(\b", ">tc\u000ee9:g", "9dh", "", "D`[BX", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", ">tc\u000fb6ES\u0015\b", "", ">tc\u0011b<;Z\u0019", "", ">tc\u0016a;", "", ">tc\u0019b5@", "", ">tc\u001aT7", ">tc\u001bT;Bd\u0019Z\bk(\u0011", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7V\u0012=QT;GA+\u0011|7", ">tc\u001bT;Bd\u0019fvi", ">tc\u001bh3E", ">tc g9B\\\u001b", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class WritableNativeMap extends ReadableNativeMap implements WritableMap {
    private static final Companion Companion = new Companion(null);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0005ӯ-(Մ7f\u00198pIkH¯VS8\u000f4\u0005B%s&\bBiW`Ԇ@߄SQ"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7V\u0012=QT;S0)SFkA\u0012_5R\u00010\u001d", "", "u(E", "7mXA;@;`\u001d}", "\u001ab^:\"-:Q\u0019{\u0005h2F\u000e8iI\u000b\u0010=\u000e\u001b\u0016&k\u001d8L", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final HybridData initHybrid() {
            return WritableNativeMap.initHybrid();
        }
    }

    static {
        ReactBridge.staticInit();
    }

    public WritableNativeMap() {
        super(Companion.initHybrid());
    }

    @JvmStatic
    public static final native HybridData initHybrid();

    private final native void mergeNativeMap(ReadableNativeMap readableNativeMap);

    private final native void putNativeArray(String str, ReadableNativeArray readableNativeArray);

    private final native void putNativeMap(String str, ReadableNativeMap readableNativeMap);

    @Override // com.facebook.react.bridge.WritableMap
    public WritableMap copy() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.merge(this);
        return writableNativeMap;
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void merge(ReadableMap source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Assertions.assertCondition(source instanceof ReadableNativeMap, "Illegal type provided");
        mergeNativeMap((ReadableNativeMap) source);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public void putArray(String key, ReadableArray readableArray) {
        Intrinsics.checkNotNullParameter(key, "key");
        Assertions.assertCondition(readableArray == null || (readableArray instanceof ReadableNativeArray), "Illegal type provided");
        putNativeArray(key, (ReadableNativeArray) readableArray);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public native void putBoolean(String str, boolean z2);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putDouble(String str, double d2);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putInt(String str, int i2);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putLong(String str, long j2);

    @Override // com.facebook.react.bridge.WritableMap
    public void putMap(String key, ReadableMap readableMap) {
        Intrinsics.checkNotNullParameter(key, "key");
        Assertions.assertCondition(readableMap == null || (readableMap instanceof ReadableNativeMap), "Illegal type provided");
        putNativeMap(key, (ReadableNativeMap) readableMap);
    }

    @Override // com.facebook.react.bridge.WritableMap
    public native void putNull(String str);

    @Override // com.facebook.react.bridge.WritableMap
    public native void putString(String str, String str2);
}
