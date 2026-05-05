package kotlinx.coroutines.debug.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
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
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\nnjO0LeN/ZS8\u0016s{:%c$\u007faCU0}*\tUOog|Vb\u000bI\u0010\u000e\u0016\u000fj4I[|c\u0011%˰rom2\u000e\u0007CʠpxD\u000582P9\n\t\u000f\u001cBH>yټGM\u0012\u0016>EAI`\u000fe\u0005H\u0015ĂB&\tȦtiT<Vs.N=+\u001bkXMUh\u0007ŨOϘJZ/˙\u000fc$5NB\u0006$3_\u001b\u0007\u0001hύ\u0007Eyܵ\u001dj-59XDlDh\u0018\u001a%-_\r\f\u0005TmԇUf\u0014ʬCQi^^\"x\u0007\t\u0011%<2$Ν+N6Ʀ2h\u000e%A\rCdNi\u001a`X~){ي\u001b+\bđC;!\u0002_}\f*\\T\u0014\u0007#\u001dQ\nͼ%a\\וx\u0017!r\u0006\\\u0002hN\\`T\u001a[Mm2\u0003\u0011\u0013`IΥK\u00067Ʌ)0\u001dDEoަ'A"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001L\u0016+]E\u0019uA(%weB\u0007G5O\u0001|", "", "And?V,", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E?\u0001\u0014'I9\u0012E\u0006%Bby'\u0001L\u0016+]E\u0019uA(%weB\u0007G5O\u0001\u000bOWU\u0002", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u007f\u0017\u0014WqW@\u007f45f\u0007\u001c>7t.JS=I>+\u001fxp=\u0010c\u0010Ww1+TY329xG#\u0019^\u0017\u0018)\u0017\u0012cQ3rM7-Q\nS\u000fEx\u0010\u0010\u001f\u000e\u0013tyQV#VOXf", "5dc\u0010b5MS,\u000e", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "1qT.g0H\\\u0007\u000ev\\2Y\u0013>t\n0", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eq\u0001Q\t`\u001bP~\u000eI\u007f!<#[*Dw&=QL;YC\u001a\u0013nBF\u0003k,$", "5dc\u0010e,:b\u001d\t\u0004L;x\u00075B\n7\u000bJ\tU\u001dQ~\u0015@\u007f8/W\b-A}%2VCIe2(\"h", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n\u0006(\u001f\u0011s\u0017Kv2>U\u0005i\u0015w#8]R?t4\f$d_?gp(Vv|", "Ad`BX5<S\u0002\u000f\u0003[,\n", "", "5dc X8NS\"|zG<\u0005\u0006/r", "u(9", "1qT.g0H\\\u0007\u000ev\\2k\u0016+c\u007f", "", "\u001aiPCTuEO\"\u0001DL;x\u00075T\r$y@`\u001e\u0017Oo\u0017KL", "5dc\u0010e,:b\u001d\t\u0004L;x\u00075T\r$y@", "u(;7T=:\u001d)\u000e~euc\r=tU", "AsPAX", "", "5dc g(MS", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", ":`bAB)LS&\u0010z]\u001b\u007f\u0016/a~", "\u001aiPCTuEO\"\u0001DM/\n\t+dU", "5dc\u0019T:M=\u0016\rzk=|\b\u001eh\r(w?", "u(;7T=:\u001d z\u0004`uk\f<e{'Q", ":`bAB)LS&\u0010z]\r\n\u00057e", "5dc\u0019T:M=\u0016\rzk=|\b\u0010r{0{", ":`bAB)LS&\u0010z]\u001a\f\u0005-kn5w>\u0001", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class DebugCoroutineInfo {
    private final CoroutineContext context;
    private final CoroutineStackFrame creationStackBottom;
    private final List<StackTraceElement> creationStackTrace;
    private final CoroutineStackFrame lastObservedFrame;
    private final List<StackTraceElement> lastObservedStackTrace;
    private final Thread lastObservedThread;
    private final long sequenceNumber;
    private final String state;

    public DebugCoroutineInfo(DebugCoroutineInfoImpl debugCoroutineInfoImpl, CoroutineContext coroutineContext) {
        this.context = coroutineContext;
        this.creationStackBottom = debugCoroutineInfoImpl.getCreationStackBottom$kotlinx_coroutines_core();
        this.sequenceNumber = debugCoroutineInfoImpl.sequenceNumber;
        this.creationStackTrace = debugCoroutineInfoImpl.getCreationStackTrace();
        this.state = debugCoroutineInfoImpl.getState$kotlinx_coroutines_core();
        this.lastObservedThread = debugCoroutineInfoImpl.lastObservedThread;
        this.lastObservedFrame = debugCoroutineInfoImpl.getLastObservedFrame$kotlinx_coroutines_core();
        this.lastObservedStackTrace = debugCoroutineInfoImpl.lastObservedStackTrace$kotlinx_coroutines_core();
    }

    public final CoroutineContext getContext() {
        return this.context;
    }

    public final CoroutineStackFrame getCreationStackBottom$kotlinx_coroutines_core() {
        return this.creationStackBottom;
    }

    public final List<StackTraceElement> getCreationStackTrace() {
        return this.creationStackTrace;
    }

    public final CoroutineStackFrame getLastObservedFrame() {
        return this.lastObservedFrame;
    }

    public final Thread getLastObservedThread() {
        return this.lastObservedThread;
    }

    public final long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public final String getState() {
        return this.state;
    }

    public final List<StackTraceElement> lastObservedStackTrace() {
        return this.lastObservedStackTrace;
    }
}
