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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u0006\rnj?5LeV5ZS0\u000fs{B-cҕwHQ٥J\u00042\u000b_N\u0016˧\u001dI\u001b\u000eß\u0013\u0006$x32WX\u0011]@\u0011xU8EAQ\b=ge;IM&@(Py3Џ`=\u0011\u001c\u0005\u0002[K:۵`D~Bj\r{\nb\u001e\u0014G8\u0001Lձ\u0018RDR\u0005]h4k\u000fwMf'\u000eܞ-Q\u001bRl';\u0004**9NO5CǬ\u0004\u0007\u0015as?1OBI\u0013i?'YKJɑ8ݼ\u0004\u0014\u001dۀ̦\u0011n"}, d2 = {"\u001a`]1e6BR,Hxh9|R9sI\u000b{<\f\u0002$Qp\u0012Cv\u00125e\u000e E|r>QJ:kAs", "\u001a`]1e6BR,Hxh9|R9sI\u0013\tJ\u0002\u001b\u001eKx\u0010)v1EY\f/\u0014}\u001a5LCHA", "u(E", ";OP?T4L", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "5dc\u001dT9:['", "5dc\u001de6?W \u0003\u0004`\u001b\u0011\u0014/", "", "5dc![0L", "Adc\u000fh-?S&l~s,b\u0006", "0tU3X9,W.~`[", "Adc\u0011h9:b\u001d\t\u0004F:", "2ta.g0H\\\u0001\r", "Adc T4IZ\u001d\b|B5\f\t<v{/XT\u0010\u0017%", "A`\\=_0GU|\b\n^9\u000e\u00056B\u00147{N", "", "Adc!e(<Y}z\fZ\b\u0004\u00109c{7\u007fJ\n%", "BqP0X\u0011:d\u0015Z\u0002e6z\u0005>i\n1\n", "", "1na2R9>Z\u0019z\t^"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class HeapProfileRequestBuilder extends ProfilingRequestBuilder<HeapProfileRequestBuilder> {
    private final Bundle mParams = new Bundle();

    @Override // androidx.core.os.ProfilingRequestBuilder
    protected int getProfilingType() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.os.ProfilingRequestBuilder
    public HeapProfileRequestBuilder getThis() {
        return this;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    protected Bundle getParams() {
        return this.mParams;
    }

    public final HeapProfileRequestBuilder setBufferSizeKb(int i2) {
        this.mParams.putInt("KEY_SIZE_KB", i2);
        return this;
    }

    public final HeapProfileRequestBuilder setDurationMs(int i2) {
        this.mParams.putInt("KEY_DURATION_MS", i2);
        return this;
    }

    public final HeapProfileRequestBuilder setSamplingIntervalBytes(long j2) {
        this.mParams.putLong("KEY_SAMPLING_INTERVAL_BYTES", j2);
        return this;
    }

    public final HeapProfileRequestBuilder setTrackJavaAllocations(boolean z2) {
        this.mParams.putBoolean("KEY_TRACK_JAVA_ALLOCATIONS", z2);
        return this;
    }
}
