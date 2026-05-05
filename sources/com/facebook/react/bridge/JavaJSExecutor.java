package com.facebook.react.bridge;

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
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\r.4\u0012}\u000flPOӄtev-\u000bS5\u001b4\u0002B$s$ D\u0002yb\u00180\u000bgP}f\u001dM\u000b\u000fQ\u0013\u001e\u0016'm\\Oc}u\u0014%1pr\u0006X\u0016}K?xtd\u0006P60?\u0012\u0005/\u001dpmX\r\tKc\f@1ptH[%M3\u001dB\nL*\u0019\u001e\u000bj\u0015[֘kҗƀ/'\u000bkHmU^݇\u0001Z϶JS"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW!r61>k\u007fJm\u0014>\\MHA", "", "1k^@X", "", "3wT0h;>8\u0007\\ve3", "", ";dc5b+'O!~", "8r^;49@at\f\bZ@", ":nP15<GR ~", "And?V,.@\u007f", "Adc\u0014_6;O ovk0x\u00066e", ">q^=X9Mg\u0002z\u0003^", "8r^;85<]\u0018~yO(\u0004\u0019/", "\u0014`RAb9R", "\u001eq^El\fQS\u0017\u000f\nh9\\\u001c-e\u000b7\u007fJ\n", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface JavaJSExecutor {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u000eӵLш|\u0004W\u00068é4'\u0015Ӭ\\\u0012&\u0006/rG0\\g^-\u0001Tp3ԿzéŜ[(yEAtH|͆\rQɟkf"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW!r61>k\u007fJm\u0014>\\MH*\u0015\u001a\u0013wkF\u001b9", "", "1qT.g,", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW!r61>k\u007fJm\u0014>\\MHA", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface Factory {
        JavaJSExecutor create() throws Exception;
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<C\u0007\"2\u0012\u000eј\u0017ng/-e'.\u0013^:\u0013y|L$\n&ڱG;c\u001dԫ&\r"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW!r61>k\u007fJm\u0014>\\MH*\u001f+\u001f{u\u0019\u001ac*^\u00061T,a*\\]\u0002A\u001e\u001b0", "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU", "1`d@X", "", "uKY.i(\bZ\u0015\b|(\u001b\u007f\u00169w{%\u0003@VZ\b", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class ProxyExecutorException extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProxyExecutorException(Throwable cause) {
            super(cause);
            Intrinsics.checkNotNullParameter(cause, "cause");
        }
    }

    void close();

    String executeJSCall(String str, String str2) throws ProxyExecutorException;

    void loadBundle(String str) throws ProxyExecutorException;

    void setGlobalVariable(String str, String str2);
}
