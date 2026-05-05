package kotlinx.coroutines.rx2;

import io.reactivex.Flowable;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.reactive.PublishKt;
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
@Metadata(bv = {}, d1 = {"Я:\u001d̉=!4i\bӵLc\u0003İIي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007njO0Le^.ZS8\u000fs{J$cҕyCQU\"}(\tWNuhvϺr_QƤ\u001e\u001c\tl<I\u001cx\f\u0011/8HģM3uok:\u0011z<\u0005.4:8(\b1G0G\u001ez\u0013jQ\u000b\"8PvJT\u001dMK\u001a@\fN(\u0011$li^6vt\fA?'\u0013kXMU`^\u0002֔\u0011FZ0˼za,5X\u0012CՖ=Y\u0013\tb[\u0006\u0003mp]\u000bnѧ5+qs\u00067\u0001\u007fB [U\u0013]\u0001(t\u0005\u007fc<T1NqOh5.v\u000b\u0004\u001dB\u0014\u0010\u0016'\u000f.[ v\u0010\u001e9\u0005tc@~\n\rI\u0010~q8-$.4Y>ӸjQgD_SѼ\u007f\u0005\u001b*C\u001f|.sf\u001eb%\u001b\u0003\u0006a3a@kK^\fi=\u001c\f\u001fgXÒ\u0006ΥK\u007f7Ʌ¦2&"}, d2 = {"@w59b>:P ~", "\u001ah^{e,:Q(\u0003\f^?Fi6o\u0012$xG\u0001l", "\"", "", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WwbH@E.8Q7\u001b\u0006;M\u0013;{Jl\u001d\u0018GfmIVe", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7C|4WRBo=g\u0013rnC\u0017r0Wv5\u0011*X9fb\u0002A\u001d\u00128\u0018W:\r\u0018h\u0017\u000btNF&\f5\u0013\u0007LpJ\r&\u00173ytL_\u001e\u0011Z%~?8lPb,O\u000b(Ilsq\f[\u001bk>K$';y\"rb*\u0007\u0003Sf", " WN\u00154\u0015\u001d:xk", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\tSM"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class RxFlowableKt {
    private static final Function2<Throwable, CoroutineContext, Unit> RX_HANDLER = RxFlowableKt$RX_HANDLER$1.INSTANCE;

    public static final <T> Flowable<T> rxFlowable(CoroutineContext coroutineContext, Function2<? super ProducerScope<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        if (coroutineContext.get(Job.Key) == null) {
            return Flowable.fromPublisher(PublishKt.publishInternal(GlobalScope.INSTANCE, coroutineContext, RX_HANDLER, function2));
        }
        throw new IllegalArgumentException(("Flowable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0006U\u000eD\u0007\t\u001ee]:+\n`\u001ay`t2\u00156\u001ci\u000e^{\u0006w}\u000ex)vzQgCaalxO,r@\u0013l[\u000f4\u0018WA%RC\"XS\u0019Z \u0003s\u0014\u000bq{F3L\u007f\bb", replaceWith = @ReplaceWith(expression = "rxFlowable(context, block)", imports = {}))
    @InterfaceC1492Gx
    public static final /* synthetic */ Flowable rxFlowable(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Function2 function2) {
        return Flowable.fromPublisher(PublishKt.publishInternal(coroutineScope, coroutineContext, RX_HANDLER, function2));
    }

    public static /* synthetic */ Flowable rxFlowable$default(CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return rxFlowable(coroutineContext, function2);
    }

    public static /* synthetic */ Flowable rxFlowable$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return rxFlowable(coroutineScope, coroutineContext, function2);
    }
}
