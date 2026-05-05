package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
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
/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{J$cҕyCQU\"}(\ng\u0014u˧\u0007Pj\rS\u000fL\u0016'iLK[ތk\u001278RqO3\u0014ok:\u0011xD\u000782h8*\t\u000f\u001dBH>z+IQ\f 5XphX=S\u000b\u001a \rV /&#lߑ:HzfRv1Ʌ\u0002H^)o0CM;Et)\u0013Ǹo\u001eSFG7%%\u001a\u00035S\fC\u0011A\n=KhW-1I\u0002aNX.\u001fE1U\rkw>\\3W\u0011\u0012-+]jcP<0>\u007fԫ\u0011<\u0012\u001a\u001edV͓E v\n\u001e3;r\u0002?p\u0004dۍ\u000ez\n<''\u00103q9Is\u0002eI\u001cf7*\t=$)\u0001|&sT<fE!Zw_8i@kP\u0015\u000fՒAm\u0012~zA8ʶHM\u00101\f\u0011t\u0017S6{;)ܩy\u0002pJwx\u0015`/S\u0018_xF(n$AB\t:etj\u000bk^Yp,?SLZ\r}\u0016\u001a8\\&Dg*ŎROvxҽQm"}, d2 = {"1n[9X*M/'l\nZ;|z3t\u0003\u000f\u007fA\u0001\u0015+Ev\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "7mXA\\(ED\u0015\u0006\u000b^", ":hU2V@<Z\u0019", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvz", ";h]\u000eV;Bd\u0019l\nZ;|", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc#hy/7C", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0003\u001cHi_5IL=5\u001e\u001b\u001ah_H\\J(Wu4QPM?&Yv>\u0014\u0010n\fU+Vk]B$lX5&\b\u00020}Dg\u000e\u0016\u001a\rH4wFW\u0010E\u000e\u0013|ArOJZ_w[?LbhR\u001b[,\\\u0010!*\u001e\u0001 \u001fq\u001a,\u0014\t]!\u0002V\u0003gu\u0011v\u0005E.N|_OEM_E\u0004'2ZQ^\u000e;W\u00025x,\u0017}(@l\u0010Uu\u0018\bk\t\u001e;`I'o\u0014F\u001bJUquy\u0014qLbH\u0004\u0017aB;\u001ddx-F\u0019\u000fh!i5+l\u0011@a\nFI9\u00036B\u000eB1", ":hU2V@<Z\u0019h\rg,\n", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0003\u001cHi_5IL=5\u001e\u001b\u001ah_H\\J(Wu4QPM?&Yv>\u0014\u0010n\fU+Vk]B$lX5&\b\u0016[\u000b;uVr\u0012\u00174wzFU#\u0011\u0001\u0019vA'|D`_C.EFb(x\nf\u001d\u001b(I #qn\u0002nZ=\u0011\u007f\\Zp\\\u0007qwV\u001d\u000482\bKeSO\u007fd@}'|U\u0005\u0007\u0012EgJ\u0012p6\u0003A4:c\u0018\u0015e\"Fi\u0003#,&N7/E@\u001b?\u0015A\u007ftI\u0018v\u001fn]qFx\u0018\u0015ndpR\u0013\u0006p`Y?ij\u000bEROKYx$+N~\fI\t\u0011\u0018\u0007y", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u001d8\u0006%\u0016`\b2\r", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9{Kr45:\u0005*IC|*VBHu8\u001d(2h=\bc*bt.G\u001650]RpQ\u0012\u0019Zc5'\u0016\u0004fK(mW\u0001&\f-I\u007fOf\b\f_t9kp@j\u000eNyScP%wF/F\u007fQPLf3.\ni*fJI(\u001dq'dFZ;\u0014\fb\u0015{RWqpV\u0019\u000eGy%idERyY;\bp\u001dU\u0004\u0003\u001c@X>8\u00056\u0013826.bUo#Hlx\"\u0002@%j\r2E\u0012LUgt\u007f\b\fr'l\u0012\u001cb~>)ntgP\u000fPK&WDa5", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9{Kr45:\u0005*IC|*VBHu8\u001d(2h=\bc*bt.G\u001650]RpQ\u0012\u0019Zw`4\r\u0012/( wCD)\f+\\KBl\u0002\f\u0014\"3qp\f=\u0014Hy\u0013\n?0h\u0005GnuVA\u001bI0n\u001bf!e\u00048.!{)*lY.\u0018E1\u001b\u007f\\\nvkP\u0019XB-MmnU\u001bVQEs4)Oz\u000b[0b|6~;\u0004}7Fm\u0014Oo\u0018\b<\u0003\u001d7fO'3\f v\u00032_~kK\u0018l\u001etQ\fl=<#se-U\u001f\u0010l\u001bc5+M\u00103a\u0006\u0014", ":hU2V@<Z\u0019F\bn5\f\r7eG&\u0006H\f!%Gi\u001b<}%1g}"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FlowExtKt {
    public static final <T> State<T> collectAsStateWithLifecycle(StateFlow<? extends T> stateFlow, LifecycleOwner lifecycleOwner, Lifecycle.State state, CoroutineContext coroutineContext, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 743249048, "C(collectAsStateWithLifecycle)P(1,2)57@2548L7,60@2688L162:FlowExt.kt#2vxrgp");
        if ((i3 + 1) - (1 | i3) != 0) {
            ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localLifecycleOwner);
            ComposerKt.sourceInformationMarkerEnd(composer);
            lifecycleOwner = (LifecycleOwner) objConsume;
        }
        if ((2 & i3) != 0) {
            state = Lifecycle.State.STARTED;
        }
        if ((i3 & 4) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(743249048, i2, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:60)");
        }
        int i4 = i2 & 14;
        int i5 = i2 << 3;
        int i6 = 7168 & i5;
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(stateFlow, stateFlow.getValue(), lifecycleOwner.getLifecycle(), state, coroutineContext, composer, (-1) - (((-1) - ((i4 + i6) - (i4 & i6))) & ((-1) - ((-1) - (((-1) - i5) | ((-1) - 57344))))), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateCollectAsStateWithLifecycle;
    }

    public static final <T> State<T> collectAsStateWithLifecycle(StateFlow<? extends T> stateFlow, Lifecycle lifecycle, Lifecycle.State state, CoroutineContext coroutineContext, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -1858162195, "C(collectAsStateWithLifecycle)P(1,2)95@4299L147:FlowExt.kt#2vxrgp");
        if ((2 & i3) != 0) {
            state = Lifecycle.State.STARTED;
        }
        if ((i3 & 4) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1858162195, i2, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:95)");
        }
        int i4 = i2 << 3;
        int i5 = (-1) - (((-1) - (i2 & 14)) & ((-1) - ((i4 + 896) - (896 | i4))));
        int i6 = (i4 + 7168) - (7168 | i4);
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(stateFlow, stateFlow.getValue(), lifecycle, state, coroutineContext, composer, (-1) - (((-1) - ((i5 + i6) - (i5 & i6))) & ((-1) - ((i4 + 57344) - (i4 | 57344)))), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateCollectAsStateWithLifecycle;
    }

    public static final <T> State<T> collectAsStateWithLifecycle(Flow<? extends T> flow, T t2, LifecycleOwner lifecycleOwner, Lifecycle.State state, CoroutineContext coroutineContext, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -1485997211, "C(collectAsStateWithLifecycle)P(1,2,3)130@5826L7,133@5966L164:FlowExt.kt#2vxrgp");
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localLifecycleOwner);
            ComposerKt.sourceInformationMarkerEnd(composer);
            lifecycleOwner = (LifecycleOwner) objConsume;
        }
        if ((4 & i3) != 0) {
            state = Lifecycle.State.STARTED;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1485997211, i2, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:133)");
        }
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(flow, t2, lifecycleOwner.getLifecycle(), state, coroutineContext, composer, (-1) - (((-1) - ((-1) - (((-1) - ((((i2 + 14) - (14 | i2)) | (((-1) - (((-1) - (i2 >> 3)) | ((-1) - 8))) << 3)) | (112 & i2))) & ((-1) - (7168 & i2))))) & ((-1) - (i2 & 57344))), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateCollectAsStateWithLifecycle;
    }

    public static final <T> State<T> collectAsStateWithLifecycle(Flow<? extends T> flow, T t2, Lifecycle lifecycle, Lifecycle.State state, CoroutineContext coroutineContext, Composer composer, int i2, int i3) {
        EmptyCoroutineContext emptyCoroutineContext = coroutineContext;
        Lifecycle.State state2 = state;
        ComposerKt.sourceInformationMarkerStart(composer, 1977777920, "C(collectAsStateWithLifecycle)P(1,2,3)170@7594L359,170@7525L428:FlowExt.kt#2vxrgp");
        if ((i3 & 4) != 0) {
            state2 = Lifecycle.State.STARTED;
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1977777920, i2, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:169)");
        }
        Object[] objArr = {flow, lifecycle, state2, emptyCoroutineContext};
        ComposerKt.sourceInformationMarkerStart(composer, 710004817, "CC(remember):FlowExt.kt#9igjgp");
        int i4 = ((-1) - (((-1) - (composer.changedInstance(lifecycle) ? 1 : 0)) & ((-1) - ((((((i2 + 7168) - (7168 | i2)) ^ 3072) <= 2048 || !composer.changed(state2)) && (3072 & i2) != 2048) ? 0 : 1)))) | (composer.changedInstance(emptyCoroutineContext) ? 1 : 0) | (composer.changedInstance(flow) ? 1 : 0);
        FlowExtKt$collectAsStateWithLifecycle$1$1 flowExtKt$collectAsStateWithLifecycle$1$1RememberedValue = composer.rememberedValue();
        if (i4 != 0 || flowExtKt$collectAsStateWithLifecycle$1$1RememberedValue == Composer.Companion.getEmpty()) {
            flowExtKt$collectAsStateWithLifecycle$1$1RememberedValue = new FlowExtKt$collectAsStateWithLifecycle$1$1(lifecycle, state2, emptyCoroutineContext, flow, null);
            composer.updateRememberedValue(flowExtKt$collectAsStateWithLifecycle$1$1RememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        int i5 = i2 >> 3;
        State<T> stateProduceState = SnapshotStateKt.produceState((Object) t2, objArr, (Function2) flowExtKt$collectAsStateWithLifecycle$1$1RememberedValue, composer, (i5 + 14) - (i5 | 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateProduceState;
    }
}
