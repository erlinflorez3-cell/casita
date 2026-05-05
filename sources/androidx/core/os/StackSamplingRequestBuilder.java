package androidx.core.os;

import android.os.Bundle;
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
/* JADX INFO: compiled from: Profiling.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006\rnj?6Jj^\u008c\u0003Y:\u0011{{bř\n#2FтY\u001a\f\"QU\\j\u007fnx\\QVW\f$|\u0003,wZ?pZ\u0015@H\b?aݹ6P\u0002l\u0003=\u001d `Ĳh}\u0013\t2*v\u0015?\u0007QT$\u0012^ϋ!>`\u0017e\u0005H\u0017NJ.\f6\\\u0016ޮfLziR/Q\b:N\\(w0+OcЂVܮ\u0011viӜґDD"}, d2 = {"\u001a`]1e6BR,Hxh9|R9sI\u0016\u000b<~\u001d\u0005Cw\u0019Cz.7F},Gm$=*S?r3\u001e\">", "\u001a`]1e6BR,Hxh9|R9sI\u0013\tJ\u0002\u001b\u001eKx\u0010)v1EY\f/\u0014}\u001a5LCHA", "u(E", ";OP?T4L", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "5dc\u001dT9:['", "5dc\u001de6?W \u0003\u0004`\u001b\u0011\u0014/", "", "5dc![0L", "Adc\u000fh-?S&l~s,b\u0006", "0tU3X9,W.~`[", "Adc\u0011h9:b\u001d\t\u0004F:", "2ta.g0H\\\u0001\r", "Adc T4IZ\u001d\b|?9|\u0015?e\t&\u0010#\u0016", "A`\\=_0GUy\fzj<|\u0012-yb=", "1na2R9>Z\u0019z\t^"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class StackSamplingRequestBuilder extends ProfilingRequestBuilder<StackSamplingRequestBuilder> {
    private final Bundle mParams = new Bundle();

    @Override // androidx.core.os.ProfilingRequestBuilder
    protected int getProfilingType() {
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.os.ProfilingRequestBuilder
    public StackSamplingRequestBuilder getThis() {
        return this;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    protected Bundle getParams() {
        return this.mParams;
    }

    public final StackSamplingRequestBuilder setBufferSizeKb(int i2) {
        this.mParams.putInt("KEY_SIZE_KB", i2);
        return this;
    }

    public final StackSamplingRequestBuilder setDurationMs(int i2) {
        this.mParams.putInt("KEY_DURATION_MS", i2);
        return this;
    }

    public final StackSamplingRequestBuilder setSamplingFrequencyHz(int i2) {
        this.mParams.putInt("KEY_FREQUENCY_HZ", i2);
        return this;
    }
}
