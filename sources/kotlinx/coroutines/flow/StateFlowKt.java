package kotlinx.coroutines.flow;

import defpackage.Architecture;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d̉=!4i\bDJf|\u0004W\u00068\u000b4C\u0007\":\u0012\u007fјnjO0LeN.ZS@\u000fs{J$cҕyCQU\"Ԃ*\t]To˧vJp\u000bKƤ\u001e3\u0007̓DOezm\u0012U2pn_5SڎK9\u0011xD\u000682h8ѩ\t\u0001(,`@\u0005}[KR\u0012PBví`\ru\u000b*\u0014\u0016>f\u0001L[\u0018^DL\u0005iJ13\u00030B^)o0CM;K\u001bܒ\u0013țe\u001e9FOe#,k\u0003MR{A\tӊ\u007f=-n7);I:WdW0$#/g\u0019mt6\\KQp\u000e7+\u0016cyUTߑ}ߡ\u007f\rJ\n&15PF-Ho(\u00109ο\u0001ShV\u0012`R\u007fAad\u0016U\u0010A/Q'vSq;_NG}\u0015\rd#/sgƃZ&\u0015#(l}a3a@\u0004H|\u0018y?sՎ~b*0\u00142W\u007fu{?=G)EkQ#O|2LRy\u000f\u0005\u000f{\u0004m`\\X\"\u001d+}ѧ)\u0018hN|\u0005\u001a[+Г.ҭQ\u001c\\͵\u001e\u0014!,twj,{ĮPћlirܔϓ\u000e;"}, d2 = {"\u001btc.U3>A(z\n^\r\u0004\u0013A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011W\u001eKr\"<Yk/3|\u0016\u000fTMMA", "\"", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0007!&Ns\u0017O@#?f\b0Fq\u001f.[\r<r>0^PqH\u0003`3Nd6C[N\rc\\\u0005\u0013", "CoS.g,\u001a\\\u0018`zm", "4t]0g0H\\", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9uL\u0006!2`}\u000eFi%..JE}\n\u0005\u001brp@\u000bluS\b/\u0011M^5ZavG\u001d $n^4\u000b\u0014]K-:\u001az\u0006\r(Z}\u0005o|\u0015\u0018W\u001fguBT\u001f\u001d", "5dc\u000ea+.^\u0018z\n^", "CoS.g,", "", "\u001cN=\u0012", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6ED\n&\u0017Tx\nC@\u0013Iaz*>C", "\u001eD=\u0011<\u0015 ", "4tb2F;:b\u0019_\u0002h>", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u001d8\u0006%\u0016`\b2\r", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "1`_.V0Mg", "", "=m1BY->`\u0003\u0010zk-\u0004\u0013A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0002EZ~ DW'.ZDBuFs", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class StateFlowKt {
    private static final Symbol NONE = new Symbol("NONE");
    private static final Symbol PENDING = new Symbol("PENDING");

    public static final <T> MutableStateFlow<T> MutableStateFlow(T t2) {
        if (t2 == null) {
            t2 = (T) NullSurrogateKt.NULL;
        }
        return new StateFlowImpl(t2);
    }

    public static final <T> Flow<T> fuseStateFlow(StateFlow<? extends T> stateFlow, CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        if (DebugKt.getASSERTIONS_ENABLED() && i2 == -1) {
            throw new AssertionError();
        }
        return (((i2 < 0 || i2 >= 2) && i2 != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? SharedFlowKt.fuseSharedFlow(stateFlow, coroutineContext, i2, bufferOverflow) : stateFlow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    public static final <T> T getAndUpdate(MutableStateFlow<T> mutableStateFlow, Function1<? super T, ? extends T> function1) {
        ?? r1;
        do {
            r1 = (Object) mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(r1, function1.invoke(r1)));
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void update(MutableStateFlow<T> mutableStateFlow, Function1<? super T, ? extends T> function1) {
        Architecture architecture;
        do {
            architecture = (Object) mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(architecture, function1.invoke(architecture)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T updateAndGet(MutableStateFlow<T> mutableStateFlow, Function1<? super T, ? extends T> function1) {
        Architecture architecture;
        T tInvoke;
        do {
            architecture = (Object) mutableStateFlow.getValue();
            tInvoke = function1.invoke(architecture);
        } while (!mutableStateFlow.compareAndSet(architecture, tInvoke));
        return tInvoke;
    }
}
