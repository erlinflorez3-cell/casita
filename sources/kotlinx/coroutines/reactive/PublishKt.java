package kotlinx.coroutines.reactive;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d̉=!4i\bDJc|\u0004W\u00068é6B\u0015\"4\u0012\u000e\u0007njO0LeV.ZS8şs{J$c$wDCU0}*ޛWNuhvJ`\u000bK\u000f\u0014\u001d\u0001j2KmIk܈'8RqO3\u0014ok8\u0001v<ӌ.2R>\u007f\u0005\u000f\u001bBH>x+pQ\u000b 3X\u0018@Q\u001dU\u0015 \"\bN G\u001e\u000bl^>Xrm<?#1ppT7c@~c\ft\\U\u0011țe\u001e1I˝9\u00153]\u001bw`fW\tOsM\u0005/'U*iu]̬f\u007fD\u00199[%]!3\r\t_a$'YQ\u0014a^\u001c@\n\u000b}\u001d<2\u001d\u0016)X.[\u001cv\n\u001e3#y\u0002D\u0001-lE\u0018\"g5'-\u00109;;+f\u0018ai\u001e^?\f\u000b\u001d 3\u0001\u001d(\nZ\u001ed%\u001djv\u007f9\u007fDףLN\u0010b\u0004rձtb\u0010:\u001c\u0007UĉG\u0002!0'%}[g\"Am\b҆Rg\u001f\u0005\u000fu\u0004oXHN#\u0007\u0016e,99`Cr\b\u0004wZW<\u0019]\"d\t\u000e\bY \u000b|L)5\u0016^Qxi\u0019T\f\u001053v9om\u001a\u0016\u0006=ӷ75WlVf؏z\u0014MQ\u0003\u0011fwZS:l3̨tĘLj\u0018Ǯ\u001cP\\\u001f+2m\u0004rؼ~֞\u001d\\\u001dǽ#<PU\u0015\u001bo\\x\u0010-cC&\u0013iRv\u0019\u0003`\\\u001fv\u0016| ؖ~˃&-Iٛڪ\u001d<"}, d2 = {">tQ9\\:A", "\u001ana4\"9>O\u0017\u000e~o,\u000b\u0018<e{0\n\nk'\u0014Ns\u001c?v2\u000b", "\"", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u0010Bc|05m#\u001cKMFk\n", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WwbH@K1p\u000eD\u001f\u0004*X\u0006Lh\u000f\u001b#\u000e1r~\fA D\u0001\u0019\u0004D)u\u001c", ">tQ9\\:A7\"\u000ezk5x\u0010", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "3wR2c;B]\"h\u0004<(\u0006\u0007/lb$\u0005?\b\u0017$", "", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7C|4WRBo=g\u0013rnC\u0017r0Wv5\u0011*X9fb\u0002A\u001d\u00128\u0018W:\r\u0018h\u0017\u000btNF&\f5\u0013\u0007LpJ\r&\u00173ytL_\u001e\u0011Z%~?8lPb,O.GOq1h\u0015)\"mB\u0004%$z\u0017*lZ7\u0018E4!{P\tkqPeP{\u000bHz]\u0010RoQ:\u0004+0K\n\u0007\u001f2T|9>\u0018\u001411:r\bKtm", "\u0011K> 8\u000b", "", "!H6\u001b4\u0013%3w", "\u0012D5\u000eH\u0013-M{Zc=\u0013\\u", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7C|4WRBo=g\u0013rnC\u0017r0Wv5\u0011*X9fb\u0002A\u001d\u00128\u0018W:\r\u0018h\u0017\u000btNF&\f5\u0013\u0007LpJ\r&\u00173ytL_\u001e\u0011Z%~?8lPb,O\u000b(Oo,.\u0019_\u0019ZI>5\u0014\u007f((hL6\u0018E>!oY}ujG&P", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eo\t@|\u0015&K\u0001\u000e"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class PublishKt {
    private static final long CLOSED = -1;
    private static final Function2<Throwable, CoroutineContext, Unit> DEFAULT_HANDLER = new Function2() { // from class: kotlinx.coroutines.reactive.PublishKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return PublishKt.DEFAULT_HANDLER$lambda$2((Throwable) obj, (CoroutineContext) obj2);
        }
    };
    private static final long SIGNALLED = -2;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DEFAULT_HANDLER$lambda$2(Throwable th, CoroutineContext coroutineContext) {
        if (!(th instanceof CancellationException)) {
            CoroutineExceptionHandlerKt.handleCoroutineException(coroutineContext, th);
        }
        return Unit.INSTANCE;
    }

    public static final <T> Publisher<T> publish(CoroutineContext coroutineContext, Function2<? super ProducerScope<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        if (coroutineContext.get(Job.Key) == null) {
            return publishInternal(GlobalScope.INSTANCE, coroutineContext, DEFAULT_HANDLER, function2);
        }
        throw new IllegalArgumentException(("Publisher context cannot contain job in it.Its lifecycle should be managed via subscription. Had " + coroutineContext).toString());
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0006U\u000eD\u0007\t\u001ee]:+\n`\u001ay^qN\u00150\u0018pK[\n\u0006ro^\u0007)ii`iF\revxL\u001fII'h\f\t(\u0018\\Ju\u000b@\u0017\"L \u0004+\f6\u000e{\u001fw", replaceWith = @ReplaceWith(expression = "publish(context, block)", imports = {}))
    @InterfaceC1492Gx
    public static final /* synthetic */ Publisher publish(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Function2 function2) {
        return publishInternal(coroutineScope, coroutineContext, DEFAULT_HANDLER, function2);
    }

    public static /* synthetic */ Publisher publish$default(CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return publish(coroutineContext, function2);
    }

    public static /* synthetic */ Publisher publish$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return publish(coroutineScope, coroutineContext, function2);
    }

    public static final <T> Publisher<T> publishInternal(final CoroutineScope coroutineScope, final CoroutineContext coroutineContext, final Function2<? super Throwable, ? super CoroutineContext, Unit> function2, final Function2<? super ProducerScope<? super T>, ? super Continuation<? super Unit>, ? extends Object> function22) {
        return new Publisher() { // from class: kotlinx.coroutines.reactive.PublishKt$$ExternalSyntheticLambda0
            @Override // org.reactivestreams.Publisher
            public final void subscribe(Subscriber subscriber) {
                PublishKt.publishInternal$lambda$1(coroutineScope, coroutineContext, function2, function22, subscriber);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void publishInternal$lambda$1(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Function2 function2, Function2 function22, Subscriber subscriber) {
        if (subscriber == null) {
            throw new NullPointerException("Subscriber cannot be null");
        }
        PublisherCoroutine publisherCoroutine = new PublisherCoroutine(CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext), subscriber, function2);
        subscriber.onSubscribe(publisherCoroutine);
        publisherCoroutine.start(CoroutineStart.DEFAULT, publisherCoroutine, function22);
    }
}
