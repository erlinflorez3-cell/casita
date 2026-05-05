package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
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
@Metadata(bv = {}, d1 = {"ЯT\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u0006\rnʑA0ZeP\u008cZS@\u000fs{J$c$\u007fDCU0}*\tUNog|JbŏK\u000f\u001c\u0016\u0001jBI]xs\u0012\u00172PģG3coE9ftNӦ\u001f@ĲP\u007f\u0015\u0003**\u000f\u0010%ycM\u0012۵>@\u0019:\u0001\u000e}\u000b \u0012\u0014@8\u0001L_\u0018T<HzaR/Q\b\u001aHT'm6\u0015M;M\u0005R\u0013vo&CeGH%6i\u00025]ÜC\rE}M\u000bn47-Oy}Dh\u0002$\u0015Y^#\\!0E\u0007g_j0[zq[h5.v\u000b\u0004\u001dB\u0014\u0010\u0016'\u000f.[,v\u0010\u001e9\u0005tc@~\u0011\rU\u0010~q8-$.GYJӸjQgP_SѼ\u007f\u0005\u001b4ũ\u0005\u0006"}, d2 = {"/bc<e", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00135b|}:i\u001f7MJ\u0011", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "1`_.V0Mg", "", "AsP?g", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0013DU\u000b/\r", "=m2<`7ES(\u0003\u0005g", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b\u001f\"No\u001d@\u0001.\u0018U\u0007\u001f>m#\u0004", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1`d@X", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00013h\b-%k 9M\u0019", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7C|4WRBo=g\u0013rnC\u0017r0Wv5\u0011*X9fb\u0002A\u001d\u00128\u0018W:\r\u0018h\u0017\bUJA.\u000f0R\u0015\u0005f\u000b\u0019 \u001eDnyBdY%\u0004\"\u007fQ8lOYM\tCNT8\u0011j\u0016n$`C\u0004)%yb\u001cxY,\u0019\u007f]\u001a\u0001\u001cZwpE(~B-\nCBLO~\\@}p$\\\u0004A\u0013Bar:x7\rBs\u0017t\u000eIv\u001cHgEjoCG15=@\u001cR\u0015a\u007fyH\u001ew#j\b\u001c,34\u0015nncO\u001dPK\u0017d4?b|@[\u0006E\u001f", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ActorKt {
    public static final <E> SendChannel<E> actor(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i2, CoroutineStart coroutineStart, Function1<? super Throwable, Unit> function1, Function2<? super ActorScope<E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        CoroutineContext coroutineContextNewCoroutineContext = CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext);
        Channel channelChannel$default = ChannelKt.Channel$default(i2, null, null, 6, null);
        LazyActorCoroutine lazyActorCoroutine = coroutineStart.isLazy() ? new LazyActorCoroutine(coroutineContextNewCoroutineContext, channelChannel$default, function2) : new ActorCoroutine(coroutineContextNewCoroutineContext, channelChannel$default, true);
        if (function1 != null) {
            lazyActorCoroutine.invokeOnCompletion(function1);
        }
        lazyActorCoroutine.start(coroutineStart, lazyActorCoroutine, function2);
        return lazyActorCoroutine;
    }

    public static /* synthetic */ SendChannel actor$default(CoroutineScope coroutineScope, CoroutineContext coroutineContext, int i2, CoroutineStart coroutineStart, Function1 function1, Function2 function2, int i3, Object obj) {
        if ((i3 + 1) - (1 | i3) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i2 = 0;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        return actor(coroutineScope, coroutineContext, i2, coroutineStart, function1, function2);
    }
}
