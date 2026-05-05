package kotlin.coroutines;

import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
@Metadata(bv = {}, d1 = {"Я@\u001d̉=!4i\bDJf|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007f\u0007|jA0ReP.XU2\u000fyڔ<$a%yCQU\"}8\tWNmlvJh\fK\u000f\f\u0018\u0011%:Mm~m\u0014\u001f2\tum8mqCʠnzf\t.9:8(\u0004120J\u001e~\u0013U[\u0014\"6PrJRSS3$\"\bN /)\u000bp\u0015ȬNɆ\\ŽG^\u0011uZNmeP~SεTZW%|c,8XIE\u001d5Y\u0013\tb[\u0006\tmvM\u0007x'U6w|\u001e̴\u001fß\u0014\u001d3U\u0013\\\u0003&j\u0004o_В++]qc\u0010\u001c7\u0010\u0001\f\u000fL\u0004<\u0011UMN/ Ǒ\u0016\u0014[\u000bxRPX\u0012dR\u0002\u000ba|\u001dS\u0005C/I\u001d|P\u0010KGWg\u0006\u0013\u001e6)\u0011p1[\u001b\u0014\u000f\u001aaYɐU1_RU!\\\u0019qC}\u0006\u0001b0525g\u00025Ʌ\u001fA7'=ZG)I\r\bGTi\u0007\u0005'{cqbNP$~\u0016}07\u0011jHt\u0007\u0002O\u0003hZ%ܖ T\r\u00138\u0017.r\u0010<g8@X]y\u0002p]_\u001a%ule^5pް[9lJMuq(yR%\u001f_>hڳfljY\u001c\\l(h8vo@{\n]f\fY8\u0006ڬ\"ٜ01'v-g\u00119ZA+\u0014\u007f\\nɭ\rZ[*\u0013k4tO\u0007~a!su\u0015a,+}hΒGin'Dm\"\u0017?\u001d%\rѨ\u0002\u0006o}RF\\t&{e}0\u0016`?\u007f4M\u0017\u001f\u0001?10=sU#o_^*-\u000b~\n\u000f\u0002n\\lNoҔ0`xig'%@\u000f^!.(f\u0006טoY\u001bIiS\u0019afjx\u0002i>^8C\u0018/&5\u0007\u007f$\r5sIU\"&{$1+`\fy\u001eBԃf\u000f,\n\u0016\b:y.o)d\u000e<IIa_\u000f@2$3\tpM1|ڇF\tB-SaOЬ\tVfLAʇ}=\u0086.ޛt`k<\u0019o\f5Fa0uQ\u0001й^H-\u0014Sϣ\u0018\u001clџ`,"}, d2 = {"1na<h;B\\\u0019\\\u0005g;|\u001c>", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "5dc\u0010b9Hc(\u0003\u0004^\n\u0007\u0012>e\u00137:<\n !Vk\u001d@\u0001.C", "u(E", "5dc\u0010b9Hc(\u0003\u0004^\n\u0007\u0012>e\u00137", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "\u0011n]A\\5NO(\u0003\u0005g", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "\"", "1n]AX?M", "@dbB`,0W(\u0002", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0006~\tn3\f^", "", "Atb=X5=1#\f\u0005n;\u0001\u0012/", "0k^0^", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "1qT.g,\u001c]&\t\u000bm0\u0006\t", "", "1n\\=_,MW#\b", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q51\u0017\u0014`E-8BA,\u0012<X\u0006Dh\u000fUs\u0018>ytKf\fV}\u001f~\u0017", Global.BLANK, "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "@dR2\\=>`", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007<i'*\u0017J7t6g~ef9\u0005r\u00025|1VSR5&P|J\u001e\"i\u0012W+\u001bN7K-}H@/\u0004;M\fD>Dr\u001c\u0018DqtK \u000eQ\u0007\u001f\u0006P-qFg)WQJTf3t\bn!fC\u0010", "@dbB`,", "D`[BX", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bS\u0007<i'*\u0017J7t6g~ef9\u0005r\u0002\u0012g", "@dbB`,0W(\u0002Zq*|\u0014>i\n1", "3wR2c;B]\"", "", "AsP?g\nH`#\u000f\nb5|", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q?", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007<i'*\u0017J7t6g~ef9\u0005r\u00025|1VSR5&P|J\u001e\"i\u0012W+\u001bN7K-}H@/\u0004;M\fD>D|", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ContinuationKt {
    private static final <T> Continuation<T> Continuation(final CoroutineContext context, final Function1<? super Result<? extends T>, Unit> resumeWith) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resumeWith, "resumeWith");
        return new Continuation<T>() { // from class: kotlin.coroutines.ContinuationKt.Continuation.1
            @Override // kotlin.coroutines.Continuation
            public CoroutineContext getContext() {
                return context;
            }

            @Override // kotlin.coroutines.Continuation
            public void resumeWith(Object obj) {
                resumeWith.invoke(Result.m8979boximpl(obj));
            }
        };
    }

    public static final <T> Continuation<Unit> createCoroutine(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new SafeContinuation(IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function1, completion)), IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }

    public static final <R, T> Continuation<Unit> createCoroutine(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r2, Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new SafeContinuation(IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function2, r2, completion)), IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }

    private static final CoroutineContext getCoroutineContext() {
        throw new NotImplementedError("Implemented as intrinsic");
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    private static final <T> void resume(Continuation<? super T> continuation, T t2) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.m8980constructorimpl(t2));
    }

    private static final <T> void resumeWithException(Continuation<? super T> continuation, Throwable exception) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(exception)));
    }

    public static final <T> void startCoroutine(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter(function1, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Continuation continuationIntercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function1, completion));
        Result.Companion companion = Result.Companion;
        continuationIntercepted.resumeWith(Result.m8980constructorimpl(Unit.INSTANCE));
    }

    public static final <R, T> void startCoroutine(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r2, Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Continuation continuationIntercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function2, r2, completion));
        Result.Companion companion = Result.Companion;
        continuationIntercepted.resumeWith(Result.m8980constructorimpl(Unit.INSTANCE));
    }

    private static final <T> Object suspendCoroutine(Function1<? super Continuation<? super T>, Unit> function1, Continuation<? super T> continuation) {
        InlineMarker.mark(0);
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        function1.invoke(safeContinuation);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        InlineMarker.mark(1);
        return orThrow;
    }
}
