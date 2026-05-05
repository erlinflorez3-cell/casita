package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CancellableContinuationImpl;
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
/* JADX INFO: compiled from: BroadcastFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b<B\u0007\"2\u0012\u007f\u0007t\nA0ZeP\u008cZS8\u0010sڔ<$i-yCAV\"}8\tWȞog|Ϻb\u000bI\u0010\u000e\u0016\u000fj4Ikxe\u0012\u00154JoM:UoC:htL\u0005(2(9\u007f\n\u0017ɝZH>u3BkL'@Nv:`\re\r*\u0014\u0016>N\u00034[\u0016OɇLlk=w5\u0011{ZNUa`\u0007S\rTg?\u0011%u\u0007+\u001fL}#3i\u001b\u0007\u0001]o\u0007M\tU\u0005\u0017/m+\u0012\u007feNp\u007fB\u0017[S\u001bv\u000b&\u000b\u001f\u001a\u0007\u001aBCO*gp\u0010.»\t\u0018=L\u0012+\u001e3X0=\u001a\u0015\"\u001e5\u0005r\u001a\\~ %ۤ>ѐe6%DPI9=3pagK\u001d^7\u0002\u0006;$Q\u0006EĒgڍ\u0012`\u001dÑ%\u0006_8iBSG|\u00120Ơyձtb\nÏT?U\tG{?8Miھ_=;#q\rVP8\u0003\u0013m\u0001S\u0018`\u001fؚ$å\u001a72\u009e\\fRs\u001dk~d/\u008f\u0013ܖ T\u000fâX'.\\\u0010D1' N}j\u007fi{^`ɛ1Ϭ;Yv\u0088^mGoK?ai ebv\u001a@jh3]=̾_۱^\\0ίĞL\f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9jI\u0001!4Wy.FN#*UC\u0019r>\u001c\u001b>", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\u007f/Dc\u0007$5N#*UC\u0019r>\u001c\u001b>", "=m=2j\bPO\u001d\u000ezk:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", "/vP6g,Ka", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9jI\u0001!4Wy.FN#*UC\u0019r>\u001c\u001b'BF\u0003k,*\t#K[N92", "4`X9h9>1\u0015\u000f\t^", "", "6`b\u000ej(Bb\u0019\f\t", "", "5dc\u0015T:\u001ae\u0015\u0003\n^9\u000b", "u(I", "6`b\u000ej(Bb\u0019\f\tN5\u0004\u0013-k\u007f'", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iK\u0001-9Wa)FC", ":nR8", "", "AoP?X\u0013Ba(", "1`]0X3", "1`]0X3EO(\u0003\u0005g\f\u0010\u0007/p\u000f,\u0006I", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt\u0013Pm\u000eC}!D]\b)\u0017\u0001\u0014.XR?u=s", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158\u0006)?b]35m!=QMDA", "4`X9", "1`d@X", "Ad]199:[\u0019", "Bh\\2A(G]'", "", "Ehc599:[\u0019gvg6\u000b", Global.BLANK, "=m5?T4>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "\u0014qP:X\bPO\u001d\u000ezk", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private List<FrameAwaiter<?>> awaiters;
    private Throwable failureCause;
    private final AtomicInt hasAwaitersUnlocked;
    private final Object lock;
    private final Function0<Unit> onNewAwaiters;
    private List<FrameAwaiter<?>> spareList;

    public BroadcastFrameClock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public BroadcastFrameClock(Function0<Unit> function0) {
        this.onNewAwaiters = function0;
        this.lock = new Object();
        this.awaiters = new ArrayList();
        this.spareList = new ArrayList();
        this.hasAwaitersUnlocked = new AtomicInt(0);
    }

    public /* synthetic */ BroadcastFrameClock(Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? null : function0);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r2, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r2, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return MonotonicFrameClock.DefaultImpls.plus(this, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: BroadcastFrameClock.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&˛\bDRш|İI\u0006F\u000b6B\r)4ߚ\u007f\u0007|jA0JiP.`S2\u000fq{:$qҕ\u001aEA٥(|R\t}N(\r~Zh\f[\u001b\u0016\u0018\tjZLezm\u0012E˰pqO=[sU?pvF\u0005V݅P=ѩ\t\u0001(0\u0011\u001c\u0005\u0006[K:\u001e`D~Gj\r{\bj'\u0014B8\u0007.^wNlԟ\u001bbƠ3)\u000b݃ZP-f>\u0005\u001e(TU?\u0019\u0007c.+n:E\u00175S9ޗ\u0001]ύ\u0007Eyܵ\u001dj-09S־[D"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9jI\u0001!4Wy.FN#*UC\u0019r>\u001c\u001b'BF\u0003k,*\t#K[N92", Global.BLANK, "", "=m5?T4>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "1n]A\\5NO(\u0003\u0005g", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q?", "5dc\u0010b5MW\"\u000fvm0\u0007\u0012", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^! Vs\u0017Lr49c\u0007u", "5dc\u001ca\rKO!~", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "@dbB`,", "", "Bh\\2A(G]'", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class FrameAwaiter<R> {
        private final Continuation<R> continuation;
        private final Function1<Long, R> onFrame;

        /* JADX WARN: Multi-variable type inference failed */
        public FrameAwaiter(Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
            this.onFrame = function1;
            this.continuation = continuation;
        }

        public final Continuation<R> getContinuation() {
            return this.continuation;
        }

        public final Function1<Long, R> getOnFrame() {
            return this.onFrame;
        }

        public final void resume(long j2) {
            Object objM8980constructorimpl;
            Continuation<R> continuation = this.continuation;
            try {
                Result.Companion companion = Result.Companion;
                FrameAwaiter<R> frameAwaiter = this;
                objM8980constructorimpl = Result.m8980constructorimpl(this.onFrame.invoke(Long.valueOf(j2)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
            }
            continuation.resumeWith(objM8980constructorimpl);
        }
    }

    public final boolean getHasAwaiters() {
        return this.hasAwaitersUnlocked.get() != 0;
    }

    public final void sendFrame(long j2) {
        synchronized (this.lock) {
            List<FrameAwaiter<?>> list = this.awaiters;
            this.awaiters = this.spareList;
            this.spareList = list;
            this.hasAwaitersUnlocked.set(0);
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                list.get(i2).resume(j2);
            }
            list.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(Throwable th) {
        synchronized (this.lock) {
            if (this.failureCause != null) {
                return;
            }
            this.failureCause = th;
            List<FrameAwaiter<?>> list = this.awaiters;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Continuation<?> continuation = list.get(i2).getContinuation();
                Result.Companion companion = Result.Companion;
                continuation.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(th)));
            }
            this.awaiters.clear();
            this.hasAwaitersUnlocked.set(0);
            Unit unit = Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void cancel$default(BroadcastFrameClock broadcastFrameClock, CancellationException cancellationException, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        broadcastFrameClock.cancel(cancellationException);
    }

    public final void cancel(CancellationException cancellationException) {
        fail(cancellationException);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final FrameAwaiter frameAwaiter = new FrameAwaiter(function1, cancellableContinuationImpl2);
        synchronized (this.lock) {
            Throwable th = this.failureCause;
            if (th == null) {
                boolean zIsEmpty = this.awaiters.isEmpty();
                this.awaiters.add(frameAwaiter);
                if (zIsEmpty) {
                    this.hasAwaitersUnlocked.set(1);
                }
                cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.BroadcastFrameClock$withFrameNanos$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                        invoke2(th2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Throwable th2) {
                        Object obj = this.this$0.lock;
                        BroadcastFrameClock broadcastFrameClock = this.this$0;
                        Object obj2 = frameAwaiter;
                        synchronized (obj) {
                            broadcastFrameClock.awaiters.remove(obj2);
                            if (broadcastFrameClock.awaiters.isEmpty()) {
                                broadcastFrameClock.hasAwaitersUnlocked.set(0);
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                    }
                });
                if (zIsEmpty && this.onNewAwaiters != null) {
                    try {
                        this.onNewAwaiters.invoke();
                    } catch (Throwable th2) {
                        fail(th2);
                    }
                }
            } else {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl2.resumeWith(Result.m8980constructorimpl(ResultKt.createFailure(th)));
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
