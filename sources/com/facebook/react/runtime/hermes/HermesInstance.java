package com.facebook.react.runtime.hermes;

import com.facebook.jni.HybridData;
import com.facebook.react.fabric.ReactNativeConfig;
import com.facebook.react.runtime.JSRuntimeFactory;
import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001b\u007f\u0007lkOӄbkx.\u0001Rb\u000eq<9*oҸuCIUZ\u00132\u000f]O\u007fi\u0005I\t\rS\u0013\u0014\u0019\u0011jZMǤ|] \u0014̙Fv"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006y%Ba}.\u0001P\u0016;UCIO=,$dj7\u00079", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006[\u0013\"i\u0007/;u\u0016\u000fIAJuA2j", "u(E", "@dP0g\u0015:b\u001d\u0010z<6\u0006\n3g", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EA|\u0014$KmW)v!3hf\u001cFq'.+MDl8 j", "/k[<V\u0010G= }\\^5Y\t0o\r(j/d", "", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0002\u0013\u0014Ts\f\u0006c%1W\r\t3|\u001a?M!Et5\"\u0017>V|w", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class HermesInstance extends JSRuntimeFactory {
    public static final Companion Companion = new Companion(null);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006\u0010nʑ?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\u0004n(~:\t}P\u0018m|Mr\rY\u000e4\u0015)n:Mmx\f\u0017U˶`ŌC9"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EM\u0011 &Kw\u000e\u0006y%Ba}.\u0001P\u0016;UCIO=,$dj7\u0007\"\nX~2CUR6e(", "", "u(E", "7mXA;@;`\u001d}", "\u001ab^:\"-:Q\u0019{\u0005h2F\u000e8iI\u000b\u0010=\u000e\u001b\u0016&k\u001d8L", "@dP0g\u0015:b\u001d\u0010z<6\u0006\n3g", "/k[<V\u0010G= }\\^5Y\t0o\r(j/d", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        protected final HybridData initHybrid(Object obj, boolean z2) {
            return HermesInstance.initHybrid(obj, z2);
        }
    }

    static {
        SoLoader.loadLibrary("hermesinstancejni");
    }

    public HermesInstance() {
        this(null, false);
    }

    public HermesInstance(ReactNativeConfig reactNativeConfig, boolean z2) {
        super(initHybrid(reactNativeConfig, z2));
    }

    @JvmStatic
    protected static final native HybridData initHybrid(Object obj, boolean z2);
}
