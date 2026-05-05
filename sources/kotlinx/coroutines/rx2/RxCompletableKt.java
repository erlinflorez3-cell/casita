package kotlinx.coroutines.rx2;

import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
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
@Metadata(bv = {}, d1 = {"Я,\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000bDB\u0007\"B\u0012\u007f\u0007|jA0ReP.`ݷ2\u000f\u0002{<$a'\n\u007fI٥2}P\b\u007fTmg|Jr\u000bq\u00106;\u0007lDj[wm\u0014\u001f2psO;]uM;ptd\u000bN72<\n\u0007\u0017\u0019XO>yټGK\u0012\u001aضDpH[%\u0012\u0013$*\u0006l\u001f1\"jrf6vp\u000e>=#\u001bipOW\u0005>~e.LS7\u000f\u0007aL/P?E\u001b5U\u0013\u0007\u0001am\bOuM\u0007~&U2wvɱ:X\u0006\u001c[+̠\u0011]\u00012tG_Ӡ$'YN\fK~\u0012X}\u0001{\u001b<\u001c\u000e4(xS;\u001c~)\u00142\u0005tc@~\u0006nJ\u0010\u0001q8'%.9Y>+jacQ\u0018|>*\bڟ\"#\u0007vg`ڍ\u0012`#'ǁ{^"}, d2 = {"@w2<`7ES(zwe,", "\u001ah^{e,:Q(\u0003\f^?Ff9m\u000b/{O|\u0014\u001eGE", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WwbH@E.8Q7\u001b\u0006;M\u0013;{Ji \u0016@qpQR\rNyj", "@w2<`7ES(zwe,`\u0012>e\r1wG", "Ab^=X", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7C|4WRBo=g\u0013rnC\u0017r0Wv5\u0011*X9fb\u0002A\u001d\u00128\u0018W:\r\u0018h\u0017\u000btNF&\f5\u0013\u0007LpJ\r&\u00173ytL_\u001e\u0011Z%~?8lPb,O\u000b(Ilsq\f[\u001bk>K$';v%p[5\n\u000bO\u000eyRO", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\tSM"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class RxCompletableKt {
    public static final Completable rxCompletable(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        if (coroutineContext.get(Job.Key) == null) {
            return rxCompletableInternal(GlobalScope.INSTANCE, coroutineContext, function2);
        }
        throw new IllegalArgumentException(("Completable context cannot contain job in it. Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    public static /* synthetic */ Completable rxCompletable$default(CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return rxCompletable(coroutineContext, function2);
    }

    public static /* synthetic */ Completable rxCompletable$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return rxCompletableInternal(coroutineScope, coroutineContext, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Completable rxCompletableInternal(final CoroutineScope coroutineScope, final CoroutineContext coroutineContext, final Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return Completable.create(new CompletableOnSubscribe() { // from class: kotlinx.coroutines.rx2.RxCompletableKt$$ExternalSyntheticLambda0
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(CompletableEmitter completableEmitter) {
                RxCompletableKt.rxCompletableInternal$lambda$1(coroutineScope, coroutineContext, function2, completableEmitter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rxCompletableInternal$lambda$1(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Function2 function2, CompletableEmitter completableEmitter) {
        RxCompletableCoroutine rxCompletableCoroutine = new RxCompletableCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext), completableEmitter);
        completableEmitter.setCancellable(new RxCancellable(rxCompletableCoroutine));
        rxCompletableCoroutine.start(CoroutineStart.DEFAULT, rxCompletableCoroutine, function2);
    }
}
