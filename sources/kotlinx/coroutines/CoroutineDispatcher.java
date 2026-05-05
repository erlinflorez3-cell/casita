package kotlinx.coroutines;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.LimitedDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\f6B\r+4ߚ\u007f\u0007|jA0JeP.`Y2şs{B0cҕyCIU\"Ԃ*\teNog\u0005Jb\u000bI\u0010\u000e\u0016\u000fj4I[~c6%˰`\u000bo3{nm9\u000ftn\u0004;r'أ}\u0007\u0007\u001b8JX\u0005\tFc\f@4ptHW%M3 X\u001a\u0007:\u000f%tg|ȤxpkBG#1rrV-_>\u0007e\u000f\\SU\u0018=uf9N>M\u0015Sم3\u000b`cW\u0003mz\u0004\u001a1F57as\u0006C\t\u0004\"\u001aCO;c#.j\u0013id:7\u0014OBZ\u00172߭{z\n\u001e\u0005#\u001c\u0018?H\\:Jj\u0016\u0013Kt!YpX\u0010lZ\u0004)q\u001f\u0017\u0004\u000fy@ݰ\u001ff_r\u00047\\J\u0014\u000b\u001d 3\u000156\nh.b\u001bÑb\r\u0002;_VUN^\fi=4\u0019\u001fvJ:\u0012G_\u007f]\tA6%;O_I#'l0\\\rv\u0005\u001dxh\u0002֟\u0003LN;\u0007\u0016eѧOȹZ\rj\u0013\u0006hT\u00077WaɥX#"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00049g\t\u001cFk\u0019.Z\u0019", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqW=\u000f&$Cm\u001d\u001a\u00012?i\r$@ms8VR;~C}\u001chi9\u0010r\u0002", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>=\u0007/7z\u0014.XREx\n", "\nh]6g\u0005", "u(E", "7r36f7:b\u0017\u0002c^,{\t.", "", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", ":h\\6g,=>\u0015\fve3|\u00103s\b", ">`a._3>Z\u001d\r\u0003", "", "<`\\2", "", "2hb=T;<V", "", "0k^0^", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E-\u0011  Cl\u0015<L", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015R?Lg}%\u0011qc\u0003ss5Wr$NL$oM", "2hb=T;<V\r\u0003ze+", "7mc2e*>^(\\\u0005g;\u0001\u0012?a\u000f,\u0006I", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "\"", "1n]A\\5NO(\u0003\u0005g", "@d[2T:>7\"\u000ezk*|\u0014>e~\u0006\u0006I\u0010\u001b Wk\u001d@\u0001.", ">kd@", "=sW2e", "BnBAe0GU", "\u0019dh", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public abstract class CoroutineDispatcher extends AbstractCoroutineContextElement implements ContinuationInterceptor {
    public static final Key Key = new Key(null);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005#2ߢx\u001d߿\u001bE@FuH\\Rc,\u001fk*5RZdxI;ڈ\u001e\u007f(\u000b]Q˝kr"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00049g\t\u001cFk\u0019.Z\u0002!kHs", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqW=\u000f&$Cm\u001d\u001a\u00012?i\r$@ms8VR;~C\u0004\u0015|7", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>=\u0007/7z\u0014.XREx\n", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00049g\t\u001cFk\u0019.Z\u0019", "\nh]6g\u0005", "u(E", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Key extends AbstractCoroutineContextKey<ContinuationInterceptor, CoroutineDispatcher> {
        private Key() {
            super(ContinuationInterceptor.Key, new Function1() { // from class: kotlinx.coroutines.CoroutineDispatcher$Key$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CoroutineDispatcher.Key._init_$lambda$0((CoroutineContext.Element) obj);
                }
            });
        }

        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final CoroutineDispatcher _init_$lambda$0(CoroutineContext.Element element) {
            if (element instanceof CoroutineDispatcher) {
                return (CoroutineDispatcher) element;
            }
            return null;
        }
    }

    public CoroutineDispatcher() {
        super(ContinuationInterceptor.Key);
    }

    public static /* synthetic */ CoroutineDispatcher limitedParallelism$default(CoroutineDispatcher coroutineDispatcher, int i2, String str, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            str = null;
        }
        return coroutineDispatcher.limitedParallelism(i2, str);
    }

    /* JADX INFO: renamed from: dispatch */
    public abstract void mo10550dispatch(CoroutineContext coroutineContext, Runnable runnable);

    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        mo10550dispatch(coroutineContext, runnable);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) ContinuationInterceptor.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final <T> Continuation<T> interceptContinuation(Continuation<? super T> continuation) {
        return new DispatchedContinuation(this, continuation);
    }

    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return true;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0007K\fGvw\u0016k]Kg\u0001_'kUk[\rtDW\"W\tXwnS4jrqYmVR`X:X\u001f?F\u0017bU\r/ X<w?@\u001e\u0011S\u001dW(Psj\u0001 ;v*L\u000b\u00017az\u0010Z\u0019M\u0002 vnp\\}Ng!o\u007f", replaceWith = @ReplaceWith(expression = "limitedParallelism(parallelism, null)", imports = {}))
    @InterfaceC1492Gx
    public /* synthetic */ CoroutineDispatcher limitedParallelism(int i2) {
        return limitedParallelism(i2, null);
    }

    public CoroutineDispatcher limitedParallelism(int i2, String str) {
        LimitedDispatcherKt.checkParallelism(i2);
        return new LimitedDispatcher(this, i2, str);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return ContinuationInterceptor.DefaultImpls.minusKey(this, key);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0012V\u0001Gr\t$i\u0018\u000erA\u0010$:\u000epc\u0018fgw\u001ea\fZwxSX-yxMxEUazxU =?\u0015j_9+k\bHj?B\u001b\u001aN I.\n\u0002AU\u001b\u0002F1_\u0007\nb\u0006\u0011\u000fX\u0011S}I3:p\\\u0003zT[q\u000b2\u00057X\u00194\u0004Z\u0018\u001aGf\u001783}<q\u007f$+OO\u0016^Y5[O\u00042..sr\u0019?\u0018\tC1~-Q\u0017f\u001a$4{L\ff<|S0h}w\u0003Ytt7\u001as(\u000fy&Bmfv\b6\u001bB$L&M\"m8 tH?\u0011Sp\\[aoS%n_)\u0010ovuvw\u0013op4\u0013>)|:=1\n24\u007f\u0005\tF=Y=lpH\u001d.[`\u001fuCv\u0018D\u00171b\u000f\u001c\u001f\u0010:R\u001en.")
    @InterfaceC1492Gx
    public final CoroutineDispatcher plus(CoroutineDispatcher coroutineDispatcher) {
        return coroutineDispatcher;
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final void releaseInterceptedContinuation(Continuation<?> continuation) {
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((DispatchedContinuation) continuation).release$kotlinx_coroutines_core();
    }

    public String toString() {
        return DebugStringsKt.getClassSimpleName(this) + '@' + DebugStringsKt.getHexAddress(this);
    }
}
