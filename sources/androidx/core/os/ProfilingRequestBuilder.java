package androidx.core.os;

import android.os.Bundle;
import androidx.core.os.ProfilingRequestBuilder;
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
/* JADX INFO: compiled from: Profiling.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&˛\bDRш|\u0004G\u00068\u000bDB\u0007Ӭ4\u0012\u0006\u0013nʑA0ZeP\u008cZS@\u000fsڔ<$i*yCA\\ #8ޛwZm˧|I\u0003\u0011S\u0011\u0016\u0016?iZկ\u0006x\f\u0012O7HģУ7M}>\u0002d\u0003<\u001d `)\u0001\u007f\u0013\t2*v\u0019=\u001e\fQ\u001a\u001cH@\u001fE\u00190\u0016\u0010(\u001e\u001e>Vҵd\u007fʄR6Vy&K=1\u001bix÷Wc>\fe\rtWܮ\u0011vo.sQEF-%\nΈ7ViQ\u001b? Bݾl'5>\u001a\u0002e8p\u0002*\u0014YRcơ~͉`\u0005YӠ\\59S{Mf\rV|Qԋ\u0019ʀ\b\u000e\u000eΩχ2A"}, d2 = {"\u001a`]1e6BR,Hxh9|R9sI\u0013\tJ\u0002\u001b\u001eKx\u0010)v1EY\f/\u0014}\u001a5LCHA", "\"", "", "u(E", ";BP;V,EZ\u0015\u000e~h5j\r1n{/", "\u001a`]1e6BRb\t\t(\nx\u0012-e\u0007/wO\u0005! 5s\u0010Er,\u000b", ";SP4", "", "0tX9W", "\u001a`]1e6BR,Hxh9|R9sI\u0013\tJ\u0002\u001b\u001eKx\u0010)v1EY\f/\r", "5dc\u001dT9:['", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "5dc\u001de6?W \u0003\u0004`\u001b\u0011\u0014/", "", "5dc![0L", "u(;.a+K]\u001d}\u000e(*\u0007\u0016//\n6E+\u000e!\u0018Kv\u0012Ex\u00125e\u000e E|r>QJ:kAs", "Adc\u0010T5<S \u0006vm0\u0007\u0012\u001di\u00021wG", "1`]0X3EO(\u0003\u0005g\u001a\u0001\u000b8a\u0007", "uKP;W9HW\u0018H\u0005luZ\u00058c\u007f/\u0003<\u0010\u001b!P]\u0012>\u007f!</A\u00073v\u0015;WG:~}\u001c\u001fua\u0003\u0011qu9\u00041HPU0eT_= \"Z\u001c]\b\u001d\t`@${\u001a", "Adc!T.", "B`V", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'| \u0016Ty\u0012;\nn3c\u000b \u0001w$w8PEl8%\u0019qc&\u0007o<N\u00056$\\R3[R\u007f\u0013", "1na2R9>Z\u0019z\t^"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class ProfilingRequestBuilder<T extends ProfilingRequestBuilder<T>> {
    private android.os.CancellationSignal mCancellationSignal;
    private String mTag;

    protected abstract Bundle getParams();

    protected abstract int getProfilingType();

    protected abstract T getThis();

    public final T setTag(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.mTag = tag;
        return (T) getThis();
    }

    public final T setCancellationSignal(android.os.CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
        this.mCancellationSignal = cancellationSignal;
        return (T) getThis();
    }

    public final ProfilingRequest build() {
        return new ProfilingRequest(getProfilingType(), getParams(), this.mTag, this.mCancellationSignal);
    }
}
