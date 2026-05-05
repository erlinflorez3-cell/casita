package kotlinx.coroutines.flow;

import com.dynatrace.android.agent.Global;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
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
@Metadata(bv = {}, d1 = {"ЯT\u001d̉=!4i\bDJc|\u0004W\u00068\u000bDB\u0007\":\u001b\u007f\u0007tʑA0JhP.hS2\u000fq|<$q$yCAW\"}8\tWNmgvJh\u000bK\u000f\f\u0017\u0001jBI]xc\u0016\u00172P\u000eG\u074cUoK?hҚNM.݅:>\n\u0007\u0011\u001apH>u\u001bEQÈ 0hvJT\u001dMK\u001a@\u0005nB\u0007 jhfRNkm<?#IiRV7e@~]\rtXU\u0010\u0007e.-V6c\u001aSUIޞXÜC\u0003MwUMv.?1Yug6\u001f\u007fB\u0014KQ\u0013ƞ\u0001&\u0005\u000bab\u001c'qO\u0012J\u00010.y\t|%X\n\r\u0016)X.s\u001av\u0010\u001e9\u0005tc@~\u0006\rE\u0010~q8-$.8Y;aƟWň?\u0019\\=\u0014\"\u001b&;\u0007~#kTTiC\u001at{Wĸ_ISGv\u000ei=s\u0005\u001faHÖ\nHq\u000e7\u0014\u0017>\u001957\"BQ \f\bNֳu\u007f-`\u0017X\u0012VX@(oD6Z\u0013\u001ad\\j\u0015m`T\u001f5?X4t\u0015\n \u00190^\b<g%>MonoҔ[]2%]k_a~o\u001eYO]y5\u007fb(?`\u0004,ELd\u0015X-K\u0002\u000bz^.ί@H\u000b\u0012}zRW4\u0019BA\u0002\u001cz,_\u0018\rFN\u0005,PY(\u000f^jy \u000e\u001b3ʗ\u0007s*\u0004\u0019\u0007Vl\u0001qm~o=\rh23QSE\u0019l^PkD\u00013\t\u0015r.L\u0016N\u000eƉrטyU\n&.}GcGC#\u0011\u000f)x\u000b[Dltkʸ[\u0012G\u0001\u0003x\u001dD\u0011.\u0016\r\u0013v<bzJ\u0016TE!'\u0012x%\u0016r\u0018'gE\u000bXscQ[ƏM|\thLT>\r\u0015!$+'\u00012\u0007E5S+-\u0018\u000e\u0013u\u001e\u0010`ys>{x\u000eTy\u0014\u0006rϪ\u001c̔fQk8SXWl\u0017J2,|\tRJzwNB7H;2hCjݥd8u\u0011?\u007fv\u0007r\r\u001fUs}!\u0005\u0016:>a:s\n}B]c'\u0017\u07bdag\u0016s[^\u001bJU\n9za\u000f 2U<\\Vr\u000b@\u0006:\u0018FIKh\u0015>\u0019$bCj\u000b\u001bGdk\u001c\u000f)\u0005taʸ\u001b2PySN\u001cl\u0011bfJ\u0015`\fiO)!\u0001\u0015ɼ,xU3\u000blT]WiB\u0003c\u001dO\u001b\u0019N/j3D\\T\u007f$X\u001f\u0007\nSw[\n\b5\u0014X9|2xɒ<\"\u0003,R\u001e!Ia\u0013e|Vz\u001bft]+vՆj\\T19\u0005\u0001\r\u001e>\u0010\u00151*_z\u007fh=N^w}LH\u0004'H9\t\"{\u0012KIHޅ9-Kf\u0003\f5\u001aoYK\u007f\u0018 f02sA^]ʪt\n}\u001d@\u0015\u007f\u001f\u000b\b\u0019\u0015` J.xs#\u000e<!NOH<2YdXy\u00129\u0001-*|\u0017RZ/\u0002Ơgvi}e\u0011\tvAX\u007ftSl-\u001a7\\t\u0013͠^D\u0017b0^\u0017\u0010$\u0017,%\\\u0019r1 Usj\u0001k\u0016d;.?o:cG/\u0001#,:ݺy\u00048q@|IueDt\u000bll\tW<]\u000b*jÆ\u001a)<\u0003\u000fJn\u0011Y4tqN)=Q1_a\fWq\u0017\u0013\fI±%;XN+=8\u001b\u007f*|\u0017)Vr\u0006\u00109\t\tۥ\u0004q2<VZC*7[*s\u000b\u00146SU>R\n<\u0011T\u0011]]H$N^0\u001biVa\\˵\u0015\u0001#X\u001e\u001a\u0015:Mva[50\u0011~\u0011\r\u0006y_\u000ehrWt)˄\u001doC]v=55,LU\u000b2iX\"ec\u00053(1ޢ9j"}, d2 = {"4h[AX9", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "\"", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\niUA\u0014X:\u0014\tbTmlND)\u0018;M\u000b;vJ\r\u001d\u0018G4QI`\"\u001d", "4h[AX9'](", "4h[AX9\"a|\b\tm(\u0006\u0007/", Global.BLANK, "9kP@f", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "4h[AX9'](g\u000be3", ";`_", "BqP;f-H`!", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "D`[BX", ";`_\u001bb;'c \u0006", "Ehc5<5=S,", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E$\n\u0016\u0017Zo\r-r,EYS", "=m4.V/", "/bc6b5", "", "AbP;", "7mXA\\(E", "=oT?T;B]\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "/bRB`<EO(\t\b", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0003\u001cHi_5IL=5\u001e\u001b\u001ah_H\\J2X\u0006.KU\u00181mZ<>$\u001bX\u001dR5\u0016\u0013#\"4wBF#\u00125\u0017W~O\u0007\u0016%\u00159s\u0004\fT\u001aT\u0004%\u0005E2hT#`\u0001QS\u000fC1n\u001e5", "@t];\\5@4#\u0006y", "@t];\\5@@\u0019}\u000b\\,", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\u0002\u001e!Y9nC\u00017\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\u000biUA\u0014X:\u0014\tbTmlND)\u0018;M\u000b;vJ\r\u001d\u0018G4QI`\"\u001d", "1gd;^,=", "", "Ahi2", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 5, mv = {2, 0, 0}, pn = "", xi = 48, xs = ">AE<8<Ez.9;7<:.2(5o&+-4j\u0001&(/\u0002*")
final /* synthetic */ class FlowKt__TransformKt {
    public static final <T> Flow<List<T>> chunked(Flow<? extends T> flow, int i2) {
        if (i2 >= 1) {
            return new FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1(flow, i2);
        }
        throw new IllegalArgumentException(("Expected positive chunk size, but got " + i2).toString());
    }

    public static final <T> Flow<T> filter(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new FlowKt__TransformKt$filter$$inlined$unsafeTransform$1(flow, function2);
    }

    public static final /* synthetic */ <R> Flow<R> filterIsInstance(Flow<?> flow) {
        Intrinsics.needClassReification();
        return new FlowKt__TransformKt$filterIsInstance$$inlined$filter$1(flow);
    }

    public static final <R> Flow<R> filterIsInstance(final Flow<?> flow, final KClass<R> kClass) {
        return (Flow) new Flow<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2, reason: invalid class name */
            @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ KClass $klass$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1, reason: invalid class name */
                @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, KClass kClass) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$klass$inlined = kClass;
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L3f
                        r4 = r7
                        kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1 r4 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r4
                        int r0 = r4.label
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L3f
                        int r0 = r4.label
                        int r0 = r0 - r1
                        r4.label = r0
                    L13:
                        java.lang.Object r1 = r4.result
                        java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r4.label
                        r2 = 1
                        if (r0 == 0) goto L26
                        if (r0 != r2) goto L45
                        kotlin.ResultKt.throwOnFailure(r1)
                    L23:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L26:
                        kotlin.ResultKt.throwOnFailure(r1)
                        kotlinx.coroutines.flow.FlowCollector r1 = r5.$this_unsafeFlow
                        r0 = r4
                        kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                        kotlin.reflect.KClass r0 = r5.$klass$inlined
                        boolean r0 = r0.isInstance(r6)
                        if (r0 == 0) goto L23
                        r4.label = r2
                        java.lang.Object r0 = r1.emit(r6, r4)
                        if (r0 != r3) goto L23
                        return r3
                    L3f:
                        kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1 r4 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2$1
                        r4.<init>(r7)
                        goto L13
                    L45:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, kClass), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public static final <T> Flow<T> filterNot(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return new FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1(flow, function2);
    }

    public static final <T> Flow<T> filterNotNull(final Flow<? extends T> flow) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2, reason: invalid class name */
            @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        int i2 = this.label;
                        this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(T r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L3c
                        r4 = r7
                        kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 r4 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r4
                        int r2 = r4.label
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r0 = r2 + r1
                        r2 = r2 | r1
                        int r0 = r0 - r2
                        if (r0 == 0) goto L3c
                        int r0 = r4.label
                        int r0 = r0 - r1
                        r4.label = r0
                    L16:
                        java.lang.Object r1 = r4.result
                        java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r4.label
                        r2 = 1
                        if (r0 == 0) goto L29
                        if (r0 != r2) goto L42
                        kotlin.ResultKt.throwOnFailure(r1)
                    L26:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L29:
                        kotlin.ResultKt.throwOnFailure(r1)
                        kotlinx.coroutines.flow.FlowCollector r1 = r5.$this_unsafeFlow
                        r0 = r4
                        kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                        if (r6 == 0) goto L26
                        r4.label = r2
                        java.lang.Object r0 = r1.emit(r6, r4)
                        if (r0 != r3) goto L26
                        return r3
                    L3c:
                        kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 r4 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1
                        r4.<init>(r7)
                        goto L16
                    L42:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public static final <T, R> Flow<R> map(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return new FlowKt__TransformKt$map$$inlined$unsafeTransform$1(flow, function2);
    }

    public static final <T, R> Flow<R> mapNotNull(Flow<? extends T> flow, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return new FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1(flow, function2);
    }

    public static final <T> Flow<T> onEach(final Flow<? extends T> flow, final Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2, reason: invalid class name */
            @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ Function2 $action$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, Function2 function2) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$action$inlined = function2;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L66
                        r6 = r9
                        kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r6 = (kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r6
                        int r0 = r6.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = (-1) - r0
                        int r0 = (-1) - r2
                        r1 = r1 | r0
                        int r0 = (-1) - r1
                        if (r0 == 0) goto L66
                        int r0 = r6.label
                        int r0 = r0 - r2
                        r6.label = r0
                    L19:
                        java.lang.Object r1 = r6.result
                        java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r6.label
                        r4 = 2
                        r3 = 1
                        if (r0 == 0) goto L2f
                        if (r0 == r3) goto L4f
                        if (r0 != r4) goto L6c
                        kotlin.ResultKt.throwOnFailure(r1)
                    L2c:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L2f:
                        kotlin.ResultKt.throwOnFailure(r1)
                        kotlinx.coroutines.flow.FlowCollector r2 = r7.$this_unsafeFlow
                        r0 = r6
                        kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                        kotlin.jvm.functions.Function2 r1 = r7.$action$inlined
                        r6.L$0 = r8
                        r6.L$1 = r2
                        r6.label = r3
                        r0 = 6
                        kotlin.jvm.internal.InlineMarker.mark(r0)
                        java.lang.Object r1 = r1.invoke(r8, r6)
                        r0 = 7
                        kotlin.jvm.internal.InlineMarker.mark(r0)
                        if (r1 != r5) goto L4e
                        return r5
                    L4e:
                        goto L58
                    L4f:
                        java.lang.Object r2 = r6.L$1
                        kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                        java.lang.Object r8 = r6.L$0
                        kotlin.ResultKt.throwOnFailure(r1)
                    L58:
                        r0 = 0
                        r6.L$0 = r0
                        r6.L$1 = r0
                        r6.label = r4
                        java.lang.Object r0 = r2.emit(r8, r6)
                        if (r0 != r5) goto L2c
                        return r5
                    L66:
                        kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 r6 = new kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1
                        r6.<init>(r9)
                        goto L19
                    L6c:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, function2), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public static final <T, R> Flow<R> runningFold(Flow<? extends T> flow, R r2, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        return new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(r2, flow, function3);
    }

    public static final <T> Flow<T> runningReduce(final Flow<? extends T> flow, final Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = (T) NullSurrogateKt.NULL;
                Object objCollect = flow.collect(new FlowKt__TransformKt$runningReduce$1$1(objectRef, function3, flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public static final <T, R> Flow<R> scan(Flow<? extends T> flow, R r2, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        return FlowKt.runningFold(flow, r2, function3);
    }

    public static final <T> Flow<IndexedValue<T>> withIndex(final Flow<? extends T> flow) {
        return new Flow<IndexedValue<? extends T>>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super IndexedValue<? extends T>> flowCollector, Continuation<? super Unit> continuation) {
                Object objCollect = flow.collect(new FlowKt__TransformKt$withIndex$1$1(flowCollector, new Ref.IntRef()), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
