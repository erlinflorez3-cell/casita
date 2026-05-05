package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яv\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0RkP\u008cZS@\u000fs{:$c$\bCC٥\"}8\tWNmgvJp\u000bK\u000f\f\u0018\u0001jBI]xc\u0013\u00172PoG\u074cUoS9ht<\u0006(288\u0002\u0005\u0007\u001a2H&v\u0003Ca\f\u001a0VpBR\u001b˟\r\u001a(\u0006F \u0007\u001et\u001c\\Ȥ`rm<?#IipMGa6ŧ[\rnZ7\u000f\u0007ad+n8e\u00193U\u001b\u0007\u0001^o\u0007MuU\u0005\u0017,W1Ose<p\u007fB\u001cCx\u001be\u000b,l\u0007a`R'YX\u0004MVʫ6w#\u0002\u001d>\u0014\u000eL'v/]\u001et\u000e&3#y\u001a@г\u0006^H\n\u0013-D\"=\u007fa7Y\u001dlϟo;ANe~5\u0011,0\u0019nOi\u0005\u0018n$3Z\bSAQ\u0007=vO:cK}\u001cvr\u0004:\u0004vG.@,\u0015<\u001b=7\n>S%y\u0014`D.vK`ĈWkX[N6\u0007ME?!\u0012jFt\u00052P\u0003nL\u0013Sȼb\u0007&\u000e#\"lw\u0003!S\u0011~Svk\u0003M\f\rU3t;qn\u001a\u0013\b=lEMQ*\u0010уVv\"VT\r\u0013m~Hc\u000ej\\n\"`^\u000b\u0012}ӻRN4\u0019BA\u0002\u001cz,_\u001a\r\u0019V\u00056Bo\u007fOݧ\u0019ӳ\u0014~bK<Bw=\r\t/j|ruΟ\u0007IT|\u000f%]E_B1&\u00040\u0019>\u000b2\u001f\u0005\u0004\u0002Wg\u0013GzmF\u0006c\u00178\"*Aa5M\u0015\u001f~o20Csh9e˛Q\u0012-\u0018\u0015\u0014\u001dY\u00014w\nzpr`\u0019IoV\u001dǱ\u0005^\u001b)\u0018f\u0010y(F)X{n\u0019zVO\u0003\u0005i<\u00158+\u001b? +˚}\"%;=E7\u001d\\wBO-0k\u000b\b4\nd\u001f&;e2+\u0004\u0018u̥_]ZAHKi~\u0005\"Rk3mV\r\u0010/H\bD\u0015CNQf\u0001V~M9S\u000en\u00172\u001drf[h-\u001e#D2o,\nB,:\rfѼ\u0015MY\u000fƽqKj3ΐ\u00133"}, d2 = {"AgP?X\u0010G", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u00118\u0004%4:\u0005*IC", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "AsP?g,=", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u00118\u0004)>[k/3z%.L\u0019", "@d_9T@", "", "1n]3\\.N`\u0019l}Z9\u0001\u00121", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u00118\u0004)>[[*@n\u001a0#", "1n]3\\.N`\u0019l}Z9\u0001\u00121$`/\u0006Rf&\u0011A]\u00118\u0004%\u001bh", ":`d;V/,V\u0015\f~g.", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "CobAe,:[", "AgP?X+", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011W\u001eKr\"<Yk#3z\u0016-.JE}\n", "7mXA\\(ED\u0015\u0006\u000b^", ":`d;V/,V\u0015\f~g.;i6o\u0012\u000e\u000b:z\u0005\u001aC|\u000e\"\u0006", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%#W\b+7C|4WRBo=g\u0013rnC\u0017r0Wv5\u0011*X9fb\u0002A\u001d\u00128\u0018W:\r\u0018h\u0017\u000btNF&\f5\\K9r\u000e\u0016&\u001d9spP \u0011N\u0004'?\"0rX/F\u007fQPLf3wU]'iDJ3\u0018z\u0019)2Q5\u0014\u000e\u001dx\u0003audnG\u0007}41>l<MO\u0002+#z1.R\u007f\u0001%{V~8~=\u0013836rNLn\"P(f\u0018(iE0($K\u000fLZctB%\u0013d0]Q\u0015^>3bObhH\r\u00163ZB;kn\b;[\u0019\bGy\"1V\u000eFdy#Rk.j;", "AsPAX\u0010G", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u001d8\u0006%\u0016`\b2\r", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7`\r9uA(%weB\u0007qu,\u00014Q\\]0eR`;\u001e\u001dZc51\u0017\u0014`E-\u0002\u000e5)\u00156Y\u0011?q\u0001\u001a_\u000f<t\u0003\fD\u0013C\u0007\u0019~C\u0017wBfnyF\u0017,g&u\b)$XC<m}n\u001e\u001bf_\u0004MbY\u001b\u0002Y}pz\u0011\u0017\u0005E.N|_OE}\u001f={11\u0015i\u0007\u000eAXU2~?Y", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7`\r9uA(%weB\u0007qu,\u00014Q\\]0eR`;\u001e\u001dZc51\u0017\u0014`E-8BA,\u0012<X\u0006Dh\u000fUs\u0018>ytKf\fV}\u001f~\u0017lOKUpu\u0011HAk,.u\\\"\\8Iy", ":`d;V/,V\u0015\f~g.[\t0e\r5{?", "", "@dbB_;", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b\u001f\"No\u001d8s,58}!7z#.L\u0019", ":`d;V/,V\u0015\f~g.[\t0e\r5{??w\u001eQ\u0002sKp\u001f#\\y-7S%", "/rB5T9>Ry\u0006\u0005p", "/rBAT;>4 \t\r", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011W\u001eKr\"<Yk/3|\u0016\u000fTMMA", "=mBBU:<`\u001d\n\nb6\u0006", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9{?r25X^'A\u007fk\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WwbH@G.}K;(\u001buG\fHr\u0011\u001b\u001a\u00175x:C]\u001aYC\u0003x=6hE:f\u0004Y\u0017", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 5, mv = {2, 0, 0}, pn = "", xi = 48, xs = ">AE<8<Ez.9;7<:.2(5o&+-4j\u0001&(/\u0002*")
public final /* synthetic */ class FlowKt__ShareKt {
    public static final <T> SharedFlow<T> asSharedFlow(MutableSharedFlow<T> mutableSharedFlow) {
        return new ReadonlySharedFlow(mutableSharedFlow, null);
    }

    public static final <T> StateFlow<T> asStateFlow(MutableStateFlow<T> mutableStateFlow) {
        return new ReadonlyStateFlow(mutableStateFlow, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final <T> kotlinx.coroutines.flow.SharingConfig<T> configureSharing$FlowKt__ShareKt(kotlinx.coroutines.flow.Flow<? extends T> r7, int r8) {
        /*
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L8
            if (r8 < 0) goto L53
        L8:
            kotlinx.coroutines.channels.Channel$Factory r0 = kotlinx.coroutines.channels.Channel.Factory
            int r0 = r0.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core()
            int r4 = kotlin.ranges.RangesKt.coerceAtLeast(r8, r0)
            int r4 = r4 - r8
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.internal.ChannelFlow
            if (r0 == 0) goto L47
            r6 = r7
            kotlinx.coroutines.flow.internal.ChannelFlow r6 = (kotlinx.coroutines.flow.internal.ChannelFlow) r6
            kotlinx.coroutines.flow.Flow r5 = r6.dropChannelOperators()
            if (r5 == 0) goto L47
            kotlinx.coroutines.flow.SharingConfig r3 = new kotlinx.coroutines.flow.SharingConfig
            int r1 = r6.capacity
            r0 = -3
            if (r1 == r0) goto L36
            r0 = -2
            if (r1 == r0) goto L36
            if (r1 == 0) goto L36
            int r4 = r6.capacity
        L2e:
            kotlinx.coroutines.channels.BufferOverflow r1 = r6.onBufferOverflow
            kotlin.coroutines.CoroutineContext r0 = r6.context
            r3.<init>(r5, r4, r1, r0)
            return r3
        L36:
            kotlinx.coroutines.channels.BufferOverflow r2 = r6.onBufferOverflow
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            r1 = 0
            if (r2 != r0) goto L43
            int r0 = r6.capacity
            if (r0 != 0) goto L2e
        L41:
            r4 = r1
            goto L2e
        L43:
            if (r8 != 0) goto L41
            r4 = 1
            goto L2e
        L47:
            kotlinx.coroutines.flow.SharingConfig r2 = new kotlinx.coroutines.flow.SharingConfig
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            r2.<init>(r7, r4, r1, r0)
            return r2
        L53:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt.configureSharing$FlowKt__ShareKt(kotlinx.coroutines.flow.Flow, int):kotlinx.coroutines.flow.SharingConfig");
    }

    private static final <T> Job launchSharing$FlowKt__ShareKt(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Flow<? extends T> flow, MutableSharedFlow<T> mutableSharedFlow, SharingStarted sharingStarted, T t2) {
        return BuildersKt.launch(coroutineScope, coroutineContext, Intrinsics.areEqual(sharingStarted, SharingStarted.Companion.getEagerly()) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(sharingStarted, flow, mutableSharedFlow, t2, null));
    }

    private static final <T> void launchSharingDeferred$FlowKt__ShareKt(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Flow<? extends T> flow, CompletableDeferred<StateFlow<T>> completableDeferred) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineContext, null, new FlowKt__ShareKt$launchSharingDeferred$1(flow, completableDeferred, null), 2, null);
    }

    public static final <T> SharedFlow<T> onSubscription(SharedFlow<? extends T> sharedFlow, Function2<? super FlowCollector<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new SubscribedSharedFlow(sharedFlow, function2);
    }

    public static final <T> SharedFlow<T> shareIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i2) {
        SharingConfig sharingConfigConfigureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(flow, i2);
        MutableSharedFlow MutableSharedFlow = SharedFlowKt.MutableSharedFlow(i2, sharingConfigConfigureSharing$FlowKt__ShareKt.extraBufferCapacity, sharingConfigConfigureSharing$FlowKt__ShareKt.onBufferOverflow);
        return new ReadonlySharedFlow(MutableSharedFlow, launchSharing$FlowKt__ShareKt(coroutineScope, sharingConfigConfigureSharing$FlowKt__ShareKt.context, sharingConfigConfigureSharing$FlowKt__ShareKt.upstream, MutableSharedFlow, sharingStarted, SharedFlowKt.NO_VALUE));
    }

    public static /* synthetic */ SharedFlow shareIn$default(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i2, int i3, Object obj) {
        if ((i3 + 4) - (i3 | 4) != 0) {
            i2 = 0;
        }
        return FlowKt.shareIn(flow, coroutineScope, sharingStarted, i2);
    }

    public static final <T> Object stateIn(Flow<? extends T> flow, CoroutineScope coroutineScope, Continuation<? super StateFlow<? extends T>> continuation) {
        SharingConfig sharingConfigConfigureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(flow, 1);
        CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        launchSharingDeferred$FlowKt__ShareKt(coroutineScope, sharingConfigConfigureSharing$FlowKt__ShareKt.context, sharingConfigConfigureSharing$FlowKt__ShareKt.upstream, completableDeferredCompletableDeferred$default);
        return completableDeferredCompletableDeferred$default.await(continuation);
    }

    public static final <T> StateFlow<T> stateIn(Flow<? extends T> flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, T t2) {
        SharingConfig sharingConfigConfigureSharing$FlowKt__ShareKt = configureSharing$FlowKt__ShareKt(flow, 1);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(t2);
        return new ReadonlyStateFlow(MutableStateFlow, launchSharing$FlowKt__ShareKt(coroutineScope, sharingConfigConfigureSharing$FlowKt__ShareKt.context, sharingConfigConfigureSharing$FlowKt__ShareKt.upstream, MutableStateFlow, sharingStarted, t2));
    }
}
