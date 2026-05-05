package androidx.core.os;

import android.os.Bundle;
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
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\u0015\"4ߚ\u007f\u0007tvAӄLe^.ZS0\u0017q\u0001Jř\f$ B{~ Ԃ2\r]N\u007fg\u001dKj\u000fQ\u0011\u001e\u0016'm<Oc|u\u0014%1ptO9[uU;vsd\fڶ6\"F\u0002U\u0012(0`\u0012\ryqRë\u00166H\u0081RT\u0013V\u0013$b\u0015L\"\u0019\u001e\u000bjߑ:NtҗR1)\u000ewN\u001f6m0\u0015M;Gù+\u0013~ѭ6-FDC#ud\u0011\u000bj]U\u0002mvݘ\tn/ݐCKyfDhą\u0018&"}, d2 = {"\u001a`]1e6BR,Hxh9|R9sI\u0013\tJ\u0002\u001b\u001eKx\u0010)v1EY\f/\r", "", ">q^3\\3B\\\u001bm\u000fi,", "", ">`a.`:", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "B`V", "", "1`]0X3EO(\u0003\u0005g\u001a\u0001\u000b8a\u0007", "\u001a`]1e6BRb\t\t(\nx\u0012-e\u0007/wO\u0005! 5s\u0010Er,\u000b", "uH;.a+K]\u001d}Dh:Fe?n~/{\u0016g\u001c\u0013XkWCr.7#k/Dq\u001f0#*7t3+\u001fl`\u0003\u0011qu,r0ELU3XavG\u001d\u007f^\u0010W'\u0014Z\u001d2", "5dc\u0010T5<S \u0006vm0\u0007\u0012\u001di\u00021wG", "u(;.a+K]\u001d}Dh:Ff+n}(\u0003G|&\u001bQx{@x.1`S", "5dc\u001dT9:['", "u(;.a+K]\u001d}Dh:Fe?n~/{\u0016", "5dc\u001de6?W \u0003\u0004`\u001b\u0011\u0014/", "u(8", "5dc!T.", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1na2R9>Z\u0019z\t^"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ProfilingRequest {
    private final android.os.CancellationSignal cancellationSignal;
    private final Bundle params;
    private final int profilingType;
    private final String tag;

    public ProfilingRequest(int i2, Bundle params, String str, android.os.CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.profilingType = i2;
        this.params = params;
        this.tag = str;
        this.cancellationSignal = cancellationSignal;
    }

    public final int getProfilingType() {
        return this.profilingType;
    }

    public final Bundle getParams() {
        return this.params;
    }

    public final String getTag() {
        return this.tag;
    }

    public final android.os.CancellationSignal getCancellationSignal() {
        return this.cancellationSignal;
    }
}
