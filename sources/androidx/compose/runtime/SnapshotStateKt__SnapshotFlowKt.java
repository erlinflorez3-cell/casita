package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.Global;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: SnapshotFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d̉=!4i\bDJc|\u0004W\u00068é6B\u0015\"4\u0012}\bnjO0L͜P.hS2\u000fq{<$i-yCQU\"}0ޛWȞog|jb\u000bI\u000f\u001e4\u0007̓DOezm\u0012U2pn_5SڎK9\u0011~D\u0006882:\n\u0005G\u001aXJ(4\tFc\u0012\"2Pp\u0001W;Q% \u0018ßL )\u001e#ln8Nkk?W)\u0013kRNm_^{}\u0011TZ?\r=fN1F7C\u001c=S1\u000f\u0019`ύ\u0007?\u007fF\u001d\u00145*CO\u0004YFXF\u0014C/o\u000fcö4\\-Wp\u000e7+\u0016cyZ>.}z\n\u0014T\u0004<\u000emMͶ1\u001at\u0013&V\u0003~k@~\u000f\u0007H\u0010|q6E4.A[C)vigK\u001b^7*\u0014;/i\u0001ͼ%[Z ה\u0019."}, d2 = {"AmP=f/Hby\u0006\u0005p", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "\"", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "1n[9X*M/'l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", Global.BLANK, "7mXA\\(E", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0003\u001cHi_5IL=5\u001e\u001b\u001ah_H\\J2X\u0006.KU\u0018*f_|M#\u0016c\u000e\\tj\u000ffK4}H@\u001fe6R\u0011;{\u0010a|\n>i}LZ\u000fZC\u0013\u007fI4rTY)\u0007WJTf2dU='dED2\u0014~n~L\u0014\u0015\u0006\u0005R\u001e|Vxz1E#\u0003C.Lm%SUxd@|'h9\u000bs!2.", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u001d8\u0006%\u0016`\b2\r", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9{Kr45:\u0005*IC|4WRBo=g\u0013rnC\u0017r0Wv5\u0011*X9fb\u0002A\u001d\u00128\u0018W:\r\u0018h\u0017\u000bjM6,\u00120H\u0015\u0005f\u000b\u0014!\u0018Cj:Of\u0019V}\u001du\u000b\u0007rNdi\bGN\u001bF\u000e(r[&[GD(\u0013\u0005b\u0019rX9\u0014\nSZ\u007fb\u0003vkO\u0019D&3:|[\u001c", "7mc2e:>Q(\r", "", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r D[\u0016=#", "", "Adc", "", "7mc2e:>Q(\r9L5x\u0014=h\n7iO|&\u0017-~\b6d.1d\f#A|v5WU!z", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 5, mv = {1, 8, 0}, pn = "", xi = 48, xs = "4@5B>71Dy-85758)q46.3'*!i\r'\u0019')\u001d#'\u0005%\u0011#\u0013w ")
final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {
    public static final <T> State<T> collectAsState(StateFlow<? extends T> stateFlow, CoroutineContext coroutineContext, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -1439883919, "C(collectAsState)49@1909L30:SnapshotFlow.kt#9igjgp");
        if ((i3 + 1) - (i3 | 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1439883919, i2, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:49)");
        }
        int i4 = (i2 + 14) - (14 | i2);
        int i5 = i2 << 3;
        int i6 = (i5 + 896) - (i5 | 896);
        State<T> stateCollectAsState = SnapshotStateKt.collectAsState(stateFlow, stateFlow.getValue(), coroutineContext, composer, (i4 + i6) - (i4 & i6), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateCollectAsState;
    }

    public static final <T extends R, R> State<R> collectAsState(Flow<? extends T> flow, R r2, CoroutineContext coroutineContext, Composer composer, int i2, int i3) {
        EmptyCoroutineContext emptyCoroutineContext = coroutineContext;
        ComposerKt.sourceInformationMarkerStart(composer, -606625098, "C(collectAsState)P(1)65@2578L149,65@2541L186:SnapshotFlow.kt#9igjgp");
        if ((i3 & 2) != 0) {
            emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-606625098, i2, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:65)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -498556383, "CC(remember):SnapshotFlow.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(emptyCoroutineContext) | composer.changedInstance(flow);
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance || snapshotStateKt__SnapshotFlowKt$collectAsState$1$1RememberedValue == Composer.Companion.getEmpty()) {
            snapshotStateKt__SnapshotFlowKt$collectAsState$1$1RememberedValue = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(emptyCoroutineContext, flow, null);
            composer.updateRememberedValue(snapshotStateKt__SnapshotFlowKt$collectAsState$1$1RememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        int i4 = i2 << 3;
        State<R> stateProduceState = SnapshotStateKt.produceState(r2, flow, emptyCoroutineContext, (Function2) snapshotStateKt__SnapshotFlowKt$collectAsState$1$1RememberedValue, composer, ((-1) - (((-1) - ((-1) - (((-1) - (i2 >> 3)) | ((-1) - 14)))) & ((-1) - ((i4 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i4 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))))) | ((-1) - (((-1) - i2) | ((-1) - 896))));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateProduceState;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1, reason: invalid class name */
    /* JADX INFO: compiled from: SnapshotFlow.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fpI2Te\u000f.\u0001TpŪ*"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\t\u0003?`\u0005 5| ;#"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0007\u000b\u0005\f\u0002\u0007\u007fIo\f\u007f\u0010\u0014\n\u0012\u0018w\u001a\b\u001c\u000et\u001f\u000b\f\u0001\u001d\u0011!%\u001b#){#'0\u0005/_0, 04*28\u000b26?lz", f = " :,:<06:\u000b029n+3", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {148, 152, 174}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aHSEQ", "a[cJE[V", "a[cJAXULHPK<", "PfrR[[F*>;T1<M", "ddtKY_U[;L':GF8\u0015\u0015*'\u0019(\u001c\u0019", "[WuZHWN\\;", "\u0013jjOe\u001aHSEQ", "a[cJE[V", "a[cJAXULHPK<", "PfrR[[F*>;T1<M", "ddtKY_U[;L':GF8\u0015\u0015*'\u0019(\u001c\u0019", "[WuZHWN\\;", "UewTV", "\u0013jjOe\u001aHSEQ", "a[cJE[V", "a[cJAXULHPK<", "PfrR[[F*>;T1<M", "ddtKY_U[;L':GF8\u0015\u0015*'\u0019(\u001c\u0019", "[WuZHWN\\;"}, s = {"xQ^", "xQ_", "xQ`", "xQa", "xQb", "xQc", "xQ^", "xQ_", "xQ`", "xQa", "xQb", "xQc", "uQ^", "xQ^", "xQ_", "xQ`", "xQa", "xQb", "xQc"})
    static final class AnonymousClass1<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<T> $block;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function0<? extends T> function0, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$block = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:28:0x00e3, B:32:0x00ec], limit reached: 76 */
        /* JADX WARN: Path cross not found for [B:36:0x00fb, B:45:0x0132], limit reached: 76 */
        /* JADX WARN: Path cross not found for [B:45:0x0132, B:36:0x00fb], limit reached: 76 */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00fb A[Catch: all -> 0x014a, TRY_LEAVE, TryCatch #4 {all -> 0x014a, blocks: (B:26:0x00df, B:28:0x00e3, B:33:0x00ed, B:36:0x00fb, B:40:0x0111, B:42:0x011a, B:51:0x013a, B:52:0x013d, B:25:0x00dc, B:37:0x0106, B:39:0x010e, B:48:0x0135, B:49:0x0138, B:38:0x010a), top: B:70:0x00dc, inners: #3 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 335
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T> Flow<T> snapshotFlow(Function0<? extends T> function0) {
        return FlowKt.flow(new AnonymousClass1(function0, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean intersects$SnapshotStateKt__SnapshotFlowKt(MutableScatterSet<Object> mutableScatterSet, Set<? extends Object> set) {
        MutableScatterSet<Object> mutableScatterSet2 = mutableScatterSet;
        Object[] objArr = mutableScatterSet2.elements;
        long[] jArr = mutableScatterSet2.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2))) & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128 && set.contains(objArr[(i2 << 3) + i4])) {
                        return true;
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return false;
                }
            }
            if (i2 == length) {
                return false;
            }
            i2++;
        }
    }
}
