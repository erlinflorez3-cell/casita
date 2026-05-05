package kotlinx.coroutines.debug.internal;

import java.io.Serializable;
import java.lang.Thread;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineId;
import kotlinx.coroutines.CoroutineName;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\bnjG7LeN0ZS8\u001bs{:-c$\u007faCU0}*\tURmf\u0005Ϻ\u000b\u000bq\u000eF+\tn:Imx\f\u0013\u001f6PqW3{rެ=bz:\u0013%\u00035F\u007f\u001d\u00030)v\u0017ͯ~KS\f :Xr@Z\u001bVU+ \u0011V\"\u0017\u001d\u000bsߑ:NtҗR1)\u0010wP\u001f8m?\u0015O#E\u00033˼zg&ѨX9;%3aS\u0016`lW\u0003m}ݘ\tn/ݐCKyiDfP%#>g\u000fsqThԇUf\u0014ʬCQi_^\u001cx\t\t\u0011%>\u001a\r43ρ23\"Ǒ \u00109\u000b\u0001a\u0011e\u0010uZ\u0006\u000bcF\u0017S\u0019aCݰ\u001flYĥS\u001bTQ\n ]-1\u001d\u0007!\n[\u05f8d\u001b#Ƙ\u0010S7nN[˙R)"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001L\u0016+]E=kA\u0002\u001eik\u000f", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "And?V,", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001L\u0016+]E\u0019uA(%weB\u0007G5O\u0001\u000bOWU\u0002", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u007f\u0017\u0014WqW@\u007f45f\u0007\u001c>7t.JS=I>+\u001fxp=\u0010c\u0010Ww1+TY329xG#\u0019^\u0017\u0018)\u0017\u0012cQ3rM7-Q\nS\u000fEx\u0010\u0010\u001f\u000e\u0013tyQV#VOXf", "1na<h;B\\\u0019by", "", "5dc\u0010b9Hc(\u0003\u0004^\u0010{", "u(;7T=:\u001d z\u0004`uc\u00138gU", "\u001aiPCTuEO\"\u0001DE6\u0006\u000b\u0005", "2hb=T;<V\u0019\f", "", "5dc\u0011\\:IO(|}^9", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "<`\\2", "5dc\u001bT4>", "AsPAX", "5dc g(MS", ":`bAB)LS&\u0010z]\u001b\u007f\u0016/a~\u0016\u000b<\u0010\u0017", "5dc\u0019T:M=\u0016\rzk=|\b\u001eh\r(w?n&\u0013Vo", ":`bAB)LS&\u0010z]\u001b\u007f\u0016/a~\u0011wH\u0001", "5dc\u0019T:M=\u0016\rzk=|\b\u001eh\r(w?i\u0013\u001fG", ":`bAB)LS&\u0010z]\u001a\f\u0005-kn5w>\u0001", "", "\u001aiPCTuEO\"\u0001DL;x\u00075T\r$y@`\u001e\u0017Oo\u0017KL", "5dc\u0019T:M=\u0016\rzk=|\b\u001dt{&\u0002/\u000e\u0013\u0015G", "u(;7T=:\u001d)\u000e~euc\r=tU", "Ad`BX5<S\u0002\u000f\u0003[,\n", "5dc X8NS\"|zG<\u0005\u0006/r", "u(9", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class DebuggerInfo implements Serializable {
    private final Long coroutineId;
    private final String dispatcher;
    private final List<StackTraceElement> lastObservedStackTrace;
    private final String lastObservedThreadName;
    private final String lastObservedThreadState;
    private final String name;
    private final long sequenceNumber;
    private final String state;

    public DebuggerInfo(DebugCoroutineInfoImpl debugCoroutineInfoImpl, CoroutineContext coroutineContext) {
        Thread.State state;
        CoroutineId coroutineId = (CoroutineId) coroutineContext.get(CoroutineId.Key);
        this.coroutineId = coroutineId != null ? Long.valueOf(coroutineId.getId()) : null;
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.Key);
        this.dispatcher = continuationInterceptor != null ? continuationInterceptor.toString() : null;
        CoroutineName coroutineName = (CoroutineName) coroutineContext.get(CoroutineName.Key);
        this.name = coroutineName != null ? coroutineName.getName() : null;
        this.state = debugCoroutineInfoImpl.getState$kotlinx_coroutines_core();
        Thread thread = debugCoroutineInfoImpl.lastObservedThread;
        this.lastObservedThreadState = (thread == null || (state = thread.getState()) == null) ? null : state.toString();
        Thread thread2 = debugCoroutineInfoImpl.lastObservedThread;
        this.lastObservedThreadName = thread2 != null ? thread2.getName() : null;
        this.lastObservedStackTrace = debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core();
        this.sequenceNumber = debugCoroutineInfoImpl.sequenceNumber;
    }

    public final Long getCoroutineId() {
        return this.coroutineId;
    }

    public final String getDispatcher() {
        return this.dispatcher;
    }

    public final List<StackTraceElement> getLastObservedStackTrace() {
        return this.lastObservedStackTrace;
    }

    public final String getLastObservedThreadName() {
        return this.lastObservedThreadName;
    }

    public final String getLastObservedThreadState() {
        return this.lastObservedThreadState;
    }

    public final String getName() {
        return this.name;
    }

    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public final String getState() {
        return this.state;
    }
}
