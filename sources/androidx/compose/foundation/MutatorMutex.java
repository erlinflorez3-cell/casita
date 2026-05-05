package androidx.compose.foundation;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.dynatrace.android.agent.Global;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
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
/* JADX INFO: compiled from: MutatorMutex.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nʑA0ZeP.XT2\u000f\u0002{<řc$\bCCU0}*\tUPog\u0005Jb\u000bY\u000f\u000e\u0016~j4Ic\u0002e܈\u00172XoG3[oE9fw<\n6݅R8(\u00049\u0019G\t\u0013ͯ~CY\fZjNwRRSU%\u001c\u0018ßL(1$bg\\?`l\fD_=\u0011tZd-^@\u0005]\u0013VV7\r=iL8P;E\u0017;R1\u0006\u0001g\u0006Ũ}џA\u0005v5o~W\u0003o6\u001f\b4\u00171˽\u001bm\u0013(b\u0004_h<+9`{K\u0017\u001eX}\u0001{\u001bE\u001c\u000e41xS;%~)\u00142\u0005tc@\u0017\u0012nJ\u0010\u0001q8'%F;YF+jacQ\u0018|6*\u0017ڟ\"#\u0007\u0002gƃ\u0013\u05f8d\u0015)h@W?fX=vdPX\u0006\u0003\u0012\bz\u0002X\u001a`Q\u000e:\u0014\u0017>\u001957\nRQ92ȼN\ru\u0005\u001fxh\u0002\u0003\u0003LN=\u0007\u0016e-O\f#Jr!\u0004P\u0003qr\u0010\u001e<b\b\u0016\u001c#$lyR S\u0013|QQqzQm\f;.\u0015:8rBސYߍb3=ȡ4\u001coW\u000f\u0014mB9ڶZڋFS\u0014ȗڋ,@"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\rEhy/Az}>\\CNA", "", "u(E", "1ta?X5M;)\u000evm6\n", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Z\u0016/MP;t2\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\rEhy/Az}>\\CN*\u001c.$dpC\u00149", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0001Dc\u0006$5Z\u0016/MP;t2\u001ej", ";tc2k", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0015 \u0015\u0011W\u001eKv8\u000b", ";tc.g,", Global.BLANK, ">qX<e0Mg", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\rEhy/7X#2WP?zHs", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn\u001di\r\u001cFm\u0001;QMHoC2jOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0003tn2S\u0011Bl\nU\u0014\u0018Bt\u0001QZ\u0019G\b^SK2wJbouVEOk\u007f(rd\u0019m6\u0004+\u0010z\u001bdRM3\nybf", ";tc.g,0W(\u0002", "\"", "@dR2\\=>`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_/WSDj0-\u0019rj\u0003ns;J\u0006'2YR6iV\u0002Qix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0014O{{K8oJb)wQNOr9h\u0015_+&\u0018D-#u\"+d_2\u0014\u0005)TYWuxc\u0011 vA&\bWXKEmd\u0012", "Bqh\u0019b*D", "", "Bqh\u001ah;:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "Bqh\u001ah;:b\u0019h\b<(\u0006\u0007/l", ";tc.g6K", "Cm[<V2", "\u001btc.g6K", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutatorMutex {
    public static final int $stable = 0;
    private final AtomicReference<Mutator> currentMutator = new AtomicReference<>(null);
    private final Mutex mutex = MutexKt.Mutex$default(false, 1, null);

    /* JADX INFO: compiled from: MutatorMutex.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u000bnjG9LeN.ZS8\u000fsڔ:$qҕ\"CiTZ\u00112\r]N\u007fg\u001dKj\u000fQ\u0011\u001e\u0016'm߽MU\u0007aZ\u001b@K\b?aW AGk\r63ړz&F\u0006\u001d\u0001H7\u0019\u001f\u0005|[K:\u0015ضDvBĥ%O\u000b\u001f \f\u000f/\u000f\u001etg|7ՂpcBǂ;\u0005oI\\/ۨ4\u000b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\rEhy/Az}>\\CN*\u001c.$dpC\u00149", "", ">qX<e0Mg", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\rEhy/7X#2WP?zHs", "8nQ", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn\u001di\r\u001cFm\u0001;QMHoC2jOgC\u0016j0W\npEV[6lavF\u0014 $rX(bHJ", "5dc\u0017b)", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ{!DE", "5dc\u001de0H`\u001d\u000e\u000f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~A\u000e/3|\u0016\u0019ZGEx8-)>", "1`]\u0016a;>`&\u000f\u0006m", "", "=sW2e", "1`]0X3", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Mutator {
        private final Job job;
        private final MutatePriority priority;

        public Mutator(MutatePriority mutatePriority, Job job) {
            this.priority = mutatePriority;
            this.job = job;
        }

        public final Job getJob() {
            return this.job;
        }

        public final MutatePriority getPriority() {
            return this.priority;
        }

        public final boolean canInterrupt(Mutator mutator) {
            return this.priority.compareTo(mutator.priority) >= 0;
        }

        public final void cancel() {
            this.job.cancel((CancellationException) new MutationInterruptedException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryMutateOrCancel(Mutator mutator) {
        Mutator mutator2;
        do {
            mutator2 = this.currentMutator.get();
            if (mutator2 != null && !mutator.canInterrupt(mutator2)) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.currentMutator, mutator2, mutator));
        if (mutator2 != null) {
            mutator2.cancel();
        }
    }

    public static /* synthetic */ Object mutate$default(MutatorMutex mutatorMutex, MutatePriority mutatePriority, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutate(mutatePriority, function1, continuation);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.foundation.MutatorMutex$mutate$2, reason: invalid class name */
    /* JADX INFO: compiled from: MutatorMutex.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d<;!&i\u0016DRш\r\u0004\b\u0005P\r4Ȑ\r!T\u0012&\u0007-ʜw"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fLl\u0016\u0016\u0004\u0018\u0014\u0018s\u001d\u001d\u000f#O\u001a##\u0011%\u0017Ve", f = "\u001aA?+=79\u0013:8(:n+3", i = {0, 0, 1, 1}, l = {Mp4VideoDirectory.TAG_FRAME_RATE, 126}, m = "8>GA>9(KJH>H?", n = {"\\kvGfeT", "\u0013jjOe\u001aYPJB29:E\u001e;dj&\f\u0018\u0018\u001c\u0017\u000b>\u0010x", "\\kvGfeT", "\u0013jjOe\u001aYPJB29:E\u001e;dj&\f\u0018\u0018\u001c\u0017\u000b>\u0010x"}, s = {"xQ^", "xQ_", "xQ^", "xQ_"})
    static final class AnonymousClass2<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function1<Continuation<? super R>, Object> $block;
        final /* synthetic */ MutatePriority $priority;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ MutatorMutex this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(MutatePriority mutatePriority, MutatorMutex mutatorMutex, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$priority = mutatePriority;
            this.this$0 = mutatorMutex;
            this.$block = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$priority, this.this$0, this.$block, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Not initialized variable reg: 8, insn: 0x00a5: INVOKE (r8 I:kotlinx.coroutines.sync.Mutex), (r3 I:java.lang.Object) INTERFACE call: kotlinx.coroutines.sync.Mutex.unlock(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:218), block:B:26:0x00a5 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Mutex mutexUnlock;
            Mutator mutator;
            Mutex mutex;
            Function1<Continuation<? super R>, Object> function1;
            MutatorMutex mutatorMutex;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                        MutatePriority mutatePriority = this.$priority;
                        CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(Job.Key);
                        Intrinsics.checkNotNull(element);
                        mutator = new Mutator(mutatePriority, (Job) element);
                        this.this$0.tryMutateOrCancel(mutator);
                        mutex = this.this$0.mutex;
                        function1 = this.$block;
                        mutatorMutex = this.this$0;
                        this.L$0 = mutator;
                        this.L$1 = mutex;
                        this.L$2 = function1;
                        this.L$3 = mutatorMutex;
                        this.label = 1;
                        if (mutex.lock(null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutatorMutex = (MutatorMutex) this.L$2;
                            mutex = (Mutex) this.L$1;
                            mutator = (Mutator) this.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex.currentMutator, mutator, null);
                                mutex.unlock(null);
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex.currentMutator, mutator, null);
                                throw th;
                            }
                        }
                        mutatorMutex = (MutatorMutex) this.L$3;
                        function1 = (Function1) this.L$2;
                        mutex = (Mutex) this.L$1;
                        mutator = (Mutator) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    this.L$0 = mutator;
                    this.L$1 = mutex;
                    this.L$2 = mutatorMutex;
                    this.L$3 = null;
                    this.label = 2;
                    obj = function1.invoke(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex.currentMutator, mutator, null);
                    mutex.unlock(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex.currentMutator, mutator, null);
                    throw th;
                }
            } catch (Throwable th3) {
                mutexUnlock.unlock(null);
                throw th3;
            }
        }
    }

    public final <R> Object mutate(MutatePriority mutatePriority, Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super R> continuation) {
        return CoroutineScopeKt.coroutineScope(new AnonymousClass2(mutatePriority, this, function1, null), continuation);
    }

    public static /* synthetic */ Object mutateWith$default(MutatorMutex mutatorMutex, Object obj, MutatePriority mutatePriority, Function2 function2, Continuation continuation, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return mutatorMutex.mutateWith(obj, mutatePriority, function2, continuation);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.foundation.MutatorMutex$mutateWith$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: MutatorMutex.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d<;\"&i\u0016DRш\r\u0004\b\u0005P\r4Ȑ\r\"L\u0014}\u0006tia0rf\u000f\u0097\u0011"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fLl\u0016\u0016\u0004\u0018\u0014\u0018s\u001d\u001d\u000f#O\u001a##\u0011%\u0017\n\u001d)\u001eZi", f = "\u001aA?+=79\u0013:8(:n+3", i = {0, 0, 1, 1}, l = {Mp4VideoDirectory.TAG_FRAME_RATE, 167}, m = "8>GA>9(KJH>H?", n = {"\\kvGfeT", "\u0013jjOe\u001aYPJB29:E\u001e;dj&\f\u0018\u0018\u001c\u0017\u000b>\u0010x", "\\kvGfeT", "\u0013jjOe\u001aYPJB29:E\u001e;dj&\f\u0018\u0018\u001c\u0017\u000b>\u0010x"}, s = {"xQ^", "xQ_", "xQ^", "xQ_"})
    static final class C04322<R> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
        final /* synthetic */ Function2<T, Continuation<? super R>, Object> $block;
        final /* synthetic */ MutatePriority $priority;
        final /* synthetic */ T $receiver;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ MutatorMutex this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04322(MutatePriority mutatePriority, MutatorMutex mutatorMutex, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, T t2, Continuation<? super C04322> continuation) {
            super(2, continuation);
            this.$priority = mutatePriority;
            this.this$0 = mutatorMutex;
            this.$block = function2;
            this.$receiver = t2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C04322 c04322 = new C04322(this.$priority, this.this$0, this.$block, this.$receiver, continuation);
            c04322.L$0 = obj;
            return c04322;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
            return ((C04322) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Not initialized variable reg: 8, insn: 0x00ae: INVOKE (r8 I:kotlinx.coroutines.sync.Mutex), (r3 I:java.lang.Object) INTERFACE call: kotlinx.coroutines.sync.Mutex.unlock(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:218), block:B:26:0x00ae */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Mutex mutexUnlock;
            Mutator mutator;
            Mutex mutex;
            Function2 function2;
            Object obj2;
            MutatorMutex mutatorMutex;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
                try {
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                        MutatePriority mutatePriority = this.$priority;
                        CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(Job.Key);
                        Intrinsics.checkNotNull(element);
                        mutator = new Mutator(mutatePriority, (Job) element);
                        this.this$0.tryMutateOrCancel(mutator);
                        mutex = this.this$0.mutex;
                        function2 = this.$block;
                        obj2 = this.$receiver;
                        mutatorMutex = this.this$0;
                        this.L$0 = mutator;
                        this.L$1 = mutex;
                        this.L$2 = function2;
                        this.L$3 = obj2;
                        this.L$4 = mutatorMutex;
                        this.label = 1;
                        if (mutex.lock(null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutatorMutex = (MutatorMutex) this.L$2;
                            mutex = (Mutex) this.L$1;
                            mutator = (Mutator) this.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex.currentMutator, mutator, null);
                                mutex.unlock(null);
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex.currentMutator, mutator, null);
                                throw th;
                            }
                        }
                        mutatorMutex = (MutatorMutex) this.L$4;
                        obj2 = this.L$3;
                        function2 = (Function2) this.L$2;
                        mutex = (Mutex) this.L$1;
                        mutator = (Mutator) this.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    this.L$0 = mutator;
                    this.L$1 = mutex;
                    this.L$2 = mutatorMutex;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 2;
                    obj = function2.invoke(obj2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex.currentMutator, mutator, null);
                    mutex.unlock(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(mutatorMutex.currentMutator, mutator, null);
                    throw th;
                }
            } catch (Throwable th3) {
                mutexUnlock.unlock(null);
                throw th3;
            }
        }
    }

    public final <T, R> Object mutateWith(T t2, MutatePriority mutatePriority, Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        return CoroutineScopeKt.coroutineScope(new C04322(mutatePriority, this, function2, t2, null), continuation);
    }

    public final boolean tryMutate(Function0<Unit> function0) {
        boolean zTryLock = tryLock();
        if (zTryLock) {
            try {
                function0.invoke();
            } finally {
                InlineMarker.finallyStart(1);
                unlock();
                InlineMarker.finallyEnd(1);
            }
        }
        return zTryLock;
    }

    public final boolean tryLock() {
        return Mutex.DefaultImpls.tryLock$default(this.mutex, null, 1, null);
    }

    public final void unlock() {
        Mutex.DefaultImpls.unlock$default(this.mutex, null, 1, null);
    }
}
