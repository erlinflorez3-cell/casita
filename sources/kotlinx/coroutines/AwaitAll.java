package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&˛\bDRш|İI\u0006>\u001a6B\u0015\"4\u0012}\tnjO0L͜P.`q2\u000fq}:$qҕ\u001aEA٥(|R\t}N gzW\u001b&S!\u0014\u0017\u0011x<S[wm\u0018\u001f4Rou\u074c{rk;žx8\u000b$@'\u0001\f\u0013\n20X\u0012\u0007zyŷ:\u001cvϒ/ĐV\r[\u0010j.\u0014?8\u000f.fmMFN|_J/YɅ\u0018E|)6ܡ~֔\u0011H\\'\u001b|2%9GO5C-*\u038b\tҡ_M"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001c\u0013\u0013\u001bVK\u0015CL", "\"", "", "2dU2e9>R'", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0001\u0018\u0017T|\u000e;L", "\nh]6g\u0005", "uZ;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJu\u0017Ho\u001bIv$\u000b\u001dn", ")KZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n_\u0017\u0018G|\u001b<uz", "<nc\u0010b4IZ\u0019\u000ez]\n\u0007\u00198t", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u0015+x\u001d\u0012", "/vP6g", "", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "\u0012hb=b:>6\u0015\bye,\n\u0017\u0019n]$\u0005>\u0001\u001e", "\u000fvP6g\bEZ\u0002\ty^", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
final class AwaitAll<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater notCompletedCount$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(AwaitAll.class, "notCompletedCount$volatile");
    private final Deferred<T>[] deferreds;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b<`\u0007\"2\u0013\u007f\u0007|jA0JhP.hS2\u000f\u0002{<$q$yCAZ\"}0\u0012WNmhvJh\u000bKƤ\u000e\u0016\u0007k4կ[ޏ_(ƁbB\u001e>sf\u007fMG`\rB\u0015(B(H{\u0015\u0001Pݒv\u0012%{ŲO\u000e\u00183Nt\u0003b\u001bf\u001d\u001a@ n&\u000f9tid5v\t$N\u007f;\u0011iZZ7g@\u0003]\u000fVT]˙%cL,\u0017ʽ7չ)S\u000bޗ#sM\bWqk\u000b?ѮSȅM\u007f_̬p\u0002\u001a\u001c9W-_x/j\u000f\"y\u001a2CasY`\u001a>v)\t]B\u0014\u0010\u0016'~͓[(\u0015\u0014dޚvC\u000eN`\u001ajX~)n\u0007\u001d5\u0002C+oӕ\u0015_\u0012K']O\b\u001b\fL0Qt1]d\u000e\u0017ٽIb.\u0016o\u0016\u0017ׇTݳ\u000ecUo\n\u0002p\u0014J\u00066Z\u000eCL#<,=7\nOYuBɌJזkz\u001dbnjwj͛D?"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001c\u0013\u0013\u001bVK\u0015C5\u0001GU\u0002/\u0013t\u001d\u0017WB;A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014\u007fQn\u000e\u0012", "1n]A\\5NO(\u0003\u0005g", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158s,57\b)Fq\u001f>IR?u=s", "", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\\)\u0013K~iC}z\u001c_\b/>q\u001fA\u0017AEx>.$lj9\u0015-\nJ\u007f%GSU(YYr\u001b\u001e\u001bi\u0012W;\t\u0014]K-D\b(", "6`]1_,", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0005%\"Q}\n9}%\u0018U\u0007\u001f>mk", "5dc\u0015T5=Z\u0019", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJu\u001bUz\u0018Jr\"<Y`\u001c@l\u001d.#", "Adc\u0015T5=Z\u0019", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n_\u001b%Ry\u001c8s,5<y)6t\u0016\u0004\u00114", "-cX@c6LS&", "\u001aj^A_0Gfbz\nh4\u0001\u00070uI\u0004\u000bJ\t\u001b\u00154o\u000f\u0012", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001c\u0013\u0013\u001bVK\u0015C5\u00049g\t*Emx*VBBkA,~q?5\u0010a,UL", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001c\u0013\u0013\u001bVK\u0015CL", "D`[BX", "2hb=b:>`", "5dc\u0011\\:I]'~\b", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJr)Cs\u001d\u0018},s8\u0002.Bw$.0?Dj;\u001e\"vKBd_5Lv.\u001d", "Adc\u0011\\:I]'~\b", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\\)\u0013K~iC}c\u0014]\f+A{\u0016\u0011IL:r4+#Rj\u0017\u0003l*N}|\u000b=", "=m2.a*>Z \u0003\u0004`", "", "5dc\u001ca\n:\\\u0017~\u0002e0\u0006\u000b", "u(I", "7me<^,", "", "1`d@X", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private final class AwaitAllNode extends JobNode {
        private static final /* synthetic */ AtomicReferenceFieldUpdater _disposer$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(AwaitAllNode.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;
        private final CancellableContinuation<List<? extends T>> continuation;
        public DisposableHandle handle;

        /* JADX WARN: Multi-variable type inference failed */
        public AwaitAllNode(CancellableContinuation<? super List<? extends T>> cancellableContinuation) {
            this.continuation = cancellableContinuation;
        }

        private final /* synthetic */ Object get_disposer$volatile() {
            return this._disposer$volatile;
        }

        private final /* synthetic */ void set_disposer$volatile(Object obj) {
            this._disposer$volatile = obj;
        }

        public final AwaitAll<T>.DisposeHandlersOnCancel getDisposer() {
            return (DisposeHandlersOnCancel) _disposer$volatile$FU.get(this);
        }

        public final DisposableHandle getHandle() {
            DisposableHandle disposableHandle = this.handle;
            if (disposableHandle != null) {
                return disposableHandle;
            }
            Intrinsics.throwUninitializedPropertyAccessException("handle");
            return null;
        }

        @Override // kotlinx.coroutines.JobNode
        public boolean getOnCancelling() {
            return false;
        }

        @Override // kotlinx.coroutines.JobNode
        public void invoke(Throwable th) {
            if (th != null) {
                Object objTryResumeWithException = this.continuation.tryResumeWithException(th);
                if (objTryResumeWithException != null) {
                    this.continuation.completeResume(objTryResumeWithException);
                    AwaitAll<T>.DisposeHandlersOnCancel disposer = getDisposer();
                    if (disposer != null) {
                        disposer.disposeAll();
                        return;
                    }
                    return;
                }
                return;
            }
            if (AwaitAll.getNotCompletedCount$volatile$FU().decrementAndGet(AwaitAll.this) == 0) {
                CancellableContinuation<List<? extends T>> cancellableContinuation = this.continuation;
                Deferred[] deferredArr = ((AwaitAll) AwaitAll.this).deferreds;
                ArrayList arrayList = new ArrayList(deferredArr.length);
                for (Deferred deferred : deferredArr) {
                    arrayList.add(deferred.getCompleted());
                }
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m8980constructorimpl(arrayList));
            }
        }

        public final void setDisposer(AwaitAll<T>.DisposeHandlersOnCancel disposeHandlersOnCancel) {
            _disposer$volatile$FU.set(this, disposeHandlersOnCancel);
        }

        public final void setHandle(DisposableHandle disposableHandle) {
            this.handle = disposableHandle;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004O\u00158\u000bDB\u0007\"B\u0012\u007f\u0007llA0ReP.XS2\u000fy|<řc$\u007fOC٥ ԅ$\u001fѧ~g\u0016m\u000bw\u001bW\u001d\u0006.\tz8Y_'_b\u0015BD\u007f?iݹ\u001e@gaҽ:\u0007&60=B\t\u000f!BH>~CSY\u0015*0nxjX\u001bW\u001d\u001c(\u0005l+G2%m\\B`l\fGu7S\bPN?o@\t]\u0017tVw\u0013\u0007c.+vʺc\u0018STYޚTÜC\u0005GqK\u000bػ+5"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001c\u0013\u0013\u001bVK\u0015C5\u00049g\t*Emx*VBBkA,~q?5\u0010a,UL", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gvp8\u007f$<Y\u000bu", "<nS2f", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001c\u0013\u0013\u001bVK\u0015C5\u0001GU\u0002/\u0013t\u001d\u0017WB;A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001c\u0013\u0013\u001bVK\u0015CL", "\nh]6g\u0005", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\\)\u0013K~iC}z+@\u0004*Ft\u001a7`\r9uA(%weB\u0007qu*\t#K[*3c\u0011NO\u0010\u0016iiU2u\u000fXAy25", ")KZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n\\)\u0013K~iC}c\u0011ky$FI\u001d56M:k\n", "2hb=b:>/ \u0006", "", "7me<^,", "1`d@X", "", "BnBAe0GU", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    private final class DisposeHandlersOnCancel implements CancelHandler {
        private final AwaitAll<T>.AwaitAllNode[] nodes;

        public DisposeHandlersOnCancel(AwaitAll<T>.AwaitAllNode[] awaitAllNodeArr) {
            this.nodes = awaitAllNodeArr;
        }

        public final void disposeAll() {
            for (AwaitAll<T>.AwaitAllNode awaitAllNode : this.nodes) {
                awaitAllNode.getHandle().dispose();
            }
        }

        @Override // kotlinx.coroutines.CancelHandler
        public void invoke(Throwable th) {
            disposeAll();
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.nodes + AbstractJsonLexerKt.END_LIST;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AwaitAll(Deferred<? extends T>[] deferredArr) {
        this.deferreds = deferredArr;
        this.notCompletedCount$volatile = deferredArr.length;
    }

    private final /* synthetic */ int getNotCompletedCount$volatile() {
        return this.notCompletedCount$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater getNotCompletedCount$volatile$FU() {
        return notCompletedCount$volatile$FU;
    }

    private final /* synthetic */ void setNotCompletedCount$volatile(int i2) {
        this.notCompletedCount$volatile = i2;
    }

    public final Object await(Continuation<? super List<? extends T>> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        int length = this.deferreds.length;
        AwaitAllNode[] awaitAllNodeArr = new AwaitAllNode[length];
        for (int i2 = 0; i2 < length; i2++) {
            Deferred deferred = this.deferreds[i2];
            deferred.start();
            AwaitAllNode awaitAllNode = new AwaitAllNode(cancellableContinuationImpl2);
            awaitAllNode.setHandle(JobKt__JobKt.invokeOnCompletion$default(deferred, false, awaitAllNode, 1, null));
            Unit unit = Unit.INSTANCE;
            awaitAllNodeArr[i2] = awaitAllNode;
        }
        AwaitAll<T>.DisposeHandlersOnCancel disposeHandlersOnCancel = new DisposeHandlersOnCancel(awaitAllNodeArr);
        for (int i3 = 0; i3 < length; i3++) {
            awaitAllNodeArr[i3].setDisposer(disposeHandlersOnCancel);
        }
        if (cancellableContinuationImpl2.isCompleted()) {
            disposeHandlersOnCancel.disposeAll();
        } else {
            CancellableContinuationKt.invokeOnCancellation(cancellableContinuationImpl2, disposeHandlersOnCancel);
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
