package androidx.lifecycle;

import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: compiled from: ComputableLiveData.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&˛\bDRш|İI\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0ZeP.XX2\u000f\u0002{<$a,yCIU\"Ԃ(.eȞ\u0010itϺh\ns\u000f4\u00169y2Ne~c\u0012\u001d3Zom5ޜs=Gc=A\u00137J\"nцK$ʀ.H\u001e\u000fCIY%*0n\u000b\u0001f]a\u0013\u001e*\u000eN$\u0011 rf\u0005Ȥvq4ƀ1ݭ\u0007iJ÷wq>\u0003e\rt[}˚xҐ\"1HʺM\u0017+[\u0011\u0010#mM\u0004Wqk\u0007?Ѩ)ȅMy_̬p\u0002\u001a\u001f9Z]o\u00012t\u0005\u007fgbʭ-յgQXʫ@y\u0001\t\u001bET\"\u00145`.[)\u001dڜdޙvɤWFX\u061cnD\u0006\u000boGg?\u000eECA+jacQ\u0018\u0005љ*\nc̫%ъr'c٪&b\u001b.b\f\"E_UUH|\u0019\u0010ƝDՐrĊ\u00060\f\u0382W\u00025\u0012\u001f?ϸ)R"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E\u001e\u000b\u001f\"W~\n9}%\u001c]\u000f \u0016i%*#", "\"", "", "3wT0h;H`", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`vZo\fL\u0006/B/A\u0011", "-kXCX\u000b:b\u0015", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005(\u0017&k\u001d8L", "1n\\=h;B\\\u001b", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "5dc\u0010b4Ic(\u0003\u0004`j\u0004\r0e}<yG\u0001\u0011\u001eK\u0001\u000e;r41S\u000b >m\u0012<M", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`C~\u0018Dz#~5\r*?q\u0014\u000bWMBk0'j", "5dc\u0012k,<c(\t\b\u001d3\u0001\n/c\u0014&\u0003@z\u001e\u001bXo\r8\u0006!/f}'7i$.", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`'\u0003\u000e:\u00074?fS", "7me._0=", "5dc\u0016a=:Z\u001d}9e0}\t-y}/{:\b\u001b(Gn\nKr\u001fBY\u0005 3{\u0016", "7me._0=O(\u0003\u0005g\u0019\r\u00128a|/{", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "5dc\u0016a=:Z\u001d}vm0\u0007\u0012\u001cu\t1w=\b\u0017UNs\u000f<t93`}\u001a>q'.L?Jg.+\u0015oa5\u0015cjJ\u007f0Q[J;`\\{K", "u(E", ":he27(MO", "5dc\u0019\\=>2\u0015\u000ev", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J}\u001bXol8\u0006!\u000b", "@dU?X:A@)\b\u0004Z)\u0004\t", "5dc\u001fX-KS'\u0002gn5\u0006\u0005,l\u007ff\u0003D\u0002\u0017\u0015[m\u0015<p,9j}\u001f3|\u0012(ZCBk0,\u0015']B\u0010m;J\u0006+QU\\", "1n\\=h;>", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "7me._0=O(~", "", ":hU2V@<Z\u0019F\u0002b=|\b+t{\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class ComputableLiveData<T> {
    private final LiveData<T> _liveData;
    private final AtomicBoolean computing;
    private final Executor executor;
    private final AtomicBoolean invalid;
    public final Runnable invalidationRunnable;
    private final LiveData<T> liveData;
    public final Runnable refreshRunnable;

    public ComputableLiveData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata_release$annotations() {
    }

    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata_release$annotations() {
    }

    protected abstract T compute();

    public ComputableLiveData(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.executor = executor;
        LiveData<T> liveData = new LiveData<T>(this) { // from class: androidx.lifecycle.ComputableLiveData$_liveData$1
            final /* synthetic */ ComputableLiveData<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.lifecycle.LiveData
            protected void onActive() {
                this.this$0.getExecutor$lifecycle_livedata_release().execute(this.this$0.refreshRunnable);
            }
        };
        this._liveData = liveData;
        this.liveData = liveData;
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable() { // from class: androidx.lifecycle.ComputableLiveData$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.refreshRunnable$lambda$0(this.f$0);
            }
        };
        this.invalidationRunnable = new Runnable() { // from class: androidx.lifecycle.ComputableLiveData$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.invalidationRunnable$lambda$1(this.f$0);
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ComputableLiveData(Executor executor, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            executor = ArchTaskExecutor.getIOThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(executor, "getIOThreadExecutor()");
        }
        this(executor);
    }

    public final Executor getExecutor$lifecycle_livedata_release() {
        return this.executor;
    }

    public LiveData<T> getLiveData() {
        return this.liveData;
    }

    public final AtomicBoolean getInvalid$lifecycle_livedata_release() {
        return this.invalid;
    }

    public final AtomicBoolean getComputing$lifecycle_livedata_release() {
        return this.computing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void refreshRunnable$lambda$0(ComputableLiveData this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        do {
            boolean z2 = false;
            if (this$0.computing.compareAndSet(false, true)) {
                Object objCompute = null;
                boolean z3 = false;
                while (this$0.invalid.compareAndSet(true, false)) {
                    try {
                        objCompute = this$0.compute();
                        z3 = true;
                    } catch (Throwable th) {
                        this$0.computing.set(false);
                        throw th;
                    }
                }
                if (z3) {
                    this$0.getLiveData().postValue(objCompute);
                }
                this$0.computing.set(false);
                z2 = z3;
            }
            if (!z2) {
                return;
            }
        } while (this$0.invalid.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidationRunnable$lambda$1(ComputableLiveData this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean zHasActiveObservers = this$0.getLiveData().hasActiveObservers();
        if (this$0.invalid.compareAndSet(false, true) && zHasActiveObservers) {
            this$0.executor.execute(this$0.refreshRunnable);
        }
    }

    public void invalidate() {
        ArchTaskExecutor.getInstance().executeOnMainThread(this.invalidationRunnable);
    }
}
