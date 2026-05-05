package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&˛\bDZc|\u0004W\u00068\u000bDB\u0007\"2\u0012\u007f\u0007|jA0JkP.`S2şs{J$c$wCCU0}*\teNogtJ`\u000bYƤ.\u0018~̓:H\u0006~m\u0014\u001f2\tnm3}sk;It\u0015\u0006`M2B\b\b\u0019 :J v1ŏy\f\"4NtRR;Rŋ\u001e\u0014\fD.\bfuu[NH\u001bkj91\u0012\u0002H^)o03ձ;V\u001b;˼za,<\tJC'=[\u0019\u0006\u0001o(\u0005Up\u001c\u0018/;ݳ/I\u0002l\u0007j\u000e\u0017-1_\u000fmr\\ؘ3Q7ϲ)˦ScSִ^:\u0006~\u0014\rj\tdΑ)ρ23\"Ǒ \u00109|\u0001\\\u0011j\u0010hZ\b\u0011`d\u0019\u000e\u0002I*\u0018\u001c\u001d&8ݹ\u001b\u05ee;\u007f\u001d\u000f$.\u000fzĸ_j"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011s\u0017Kv2>U\u0005i%|\u0012,S$Hg<\u001errjH\u000bl<J\u0006+QU$", "\"", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0003?f\b0Fq\u001f.;R7i:~\"di9\\", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eq\u0001Q\t`\u001bP~\u000eI\u007f!<#[*Dw&=QL;YC\u001a\u0013nBF\u0003k,$", "CB^;g", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "\nh]6g\u0005", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bS\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1TV^;`[r\u001b\u001e\u001bi\u000ea:bHJ", "5dc\u0010b5MS,\u000e", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "1`[9X9\u001f`\u0015\u0007z", "5dc\u0010T3ES&_\bZ4|", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n\u0006(\u001f\u0011s\u0017Kv2>U\u0005i\u0015w#8]R?t4\f$d_?gp(Vv|", "@dbB`,0W(\u0002", "", "@dbB_;", "\u001aj^A_0G\u001d\u0006~\tn3\f^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "5dc g(<Y\b\fv\\,\\\u0010/m\u007f1\u000b", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0013DU{&&z\u0012,M#Bk<\u001e\u001ew7", "\u001aiPCTuEO\"\u0001DL;x\u00075T\r$y@`\u001e\u0017Oo\u0017KL", "u(;7T=:\u001d z\u0004`uj\u0018+c\u0006\u0017\t<~\u0017vNo\u0016<\u007f4\u000b", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class StackFrameContinuation<T> implements Continuation<T>, CoroutineStackFrame {
    private final CoroutineContext context;
    private final Continuation<T> uCont;

    /* JADX WARN: Multi-variable type inference failed */
    public StackFrameContinuation(Continuation<? super T> continuation, CoroutineContext coroutineContext) {
        this.uCont = continuation;
        this.context = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.uCont;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.context;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        this.uCont.resumeWith(obj);
    }
}
