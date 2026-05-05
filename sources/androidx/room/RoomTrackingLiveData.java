package androidx.room;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.LiveData;
import androidx.room.InvalidationTracker;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: RoomTrackingLiveData.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&˛\bDZc|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG9L͜P.hS2şs{B3c$\u007fOCU \u007f*\teNogtQb\u000bY\u000f\u000e\u0016~k4Ikxe\u0012\u00153JoU3UoC>htD\u0005(2(8\u007f\u0004\u0017ɝRJ\u0016͌\tB{\u0012\"2Pp\u0001Q;MEU\"\nL!\u0019\u001e\u000bi^:Vou:]'\u0013mPS?_^\u0003]\u0019T[?\u0015\u0007e.-V6kՖS[\u0013\u0013`dW\u000bOuC\u0004x'U6w}ɱ:X\u000e ]1]6urT\u0007Kc)\u00125VgcyzT:H\u0012\n\u0014T\f\u001e\n7JD,PǑ6\u0016\u07baxx[óh\u0004dO\u000e\t2E%4\u00183YIӸjWiݢ1P=\r\u0013\u001fn/\u000fq9[\u0003\u00127ڀ\u001dƻ{Q9҅\u0011LVO\"Ykoձth\nÏ\u001c2M\u0013=\u0010a=%*O[g)\u074co\bPֳ\u007fx\u000buvi:aVW:nDGҊ\r\u0012bե|\u0007qhbj| [5l\u0007,\"˙$b\u007f˓9'\u0016i]\u0005:y[z\"%]\u0005Ơ]tsލo;dRCq4\u001fos\u000f\u0014m^\u0019IֽjFk\u000e`\u007f6F\u0003Wx5\u0010{rhܟ\u00178Gڤ462W'xeW\u0011EZA+\u0019ރ^n\u0018зl5*+w6ڸ\r-"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u001co\n0jM|\u0015\u001dKx\u0010#z658y/3C", "\"", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005(\u0017&k\u001d8L", "2`c.U(LS", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000e\u0012", "1n]AT0GS&", "\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017#z658y/3K 7\\??t4+j", "7mC?T5LO\u0017\u000e~h5", "", "1n\\=h;>4)\bxm0\u0007\u0012", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt\u0013Nv\n9}%\u000b", "B`Q9X\u0015:[\u0019\r", "", "", "uKP;W9HW\u0018\u0012Dk6\u0007\u0011xR\n2\u0004\u001f|&\u0013Dk\u001c<L\f1b|-Aq\u0015A\u0017PEu<gxqr5\u000eg+J\u0006+QU50mRQ9#\u000e8\u0018W:\t\tbA1D9\u001e$\u0004=EKKw\u0005\u0013_\f?snRc\u001dG\u0003$?\u001f%oMU\\\u0001G\u0017;I/`\u001d[fc6C&]_((lY0_?D", "5dc\u0010b4Ic(~[n5z\u00183o\t", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`%k\u0015Cr\"<YS", "1n\\=h;B\\\u001b", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "5dc\u0010b4Ic(\u0003\u0004`", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`C~\u0018Dz#~5\r*?q\u0014\u000bWMBk0'j", "5dc\u0011T;:P\u0015\rz", "u(;.a+K]\u001d}\u000e(9\u0007\u00137/l2\u0006H_\u0013&Cl\nJvz", "5dc\u0016a\u001bKO\"\rv\\;\u0001\u00138", "u(I", "7me._0=", "5dc\u0016a=:Z\u001d}", "7me._0=O(\u0003\u0005g\u0019\r\u00128a|/{", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "5dc\u0016a=:Z\u001d}vm0\u0007\u0012\u001cu\t1w=\b\u0017", "u(;7T=:\u001d z\u0004`ui\u00198n{%\u0003@V", "=ab2e=>`", "\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017+\u0004!3_}-uW\u0013<MPLkAs", "5dc\u001cU:>`*~\b", "u(;.a+K]\u001d}\u000e(9\u0007\u00137/c1\r<\b\u001b\u0016C~\u0012F\u007f\u0014BU{&7zT\u0018JQ;xE\u001e\">", "?tT?l\fQS\u0017\u000f\nh9", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "5dc\u001eh,Kgx\u0012z\\<\f\u0013<", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`'\u0003\u000e:\u00074?fS", "@dU?X:A@)\b\u0004Z)\u0004\t", "5dc\u001fX-KS'\u0002gn5\u0006\u0005,l\u007f", "@dV6f;>`\u0019}d[:|\u0016@e\r", "5dc\u001fX.Ba(~\b^+f\u0006=e\r9{M", "=m00g0OS", "", "=m8;T*MW*~", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RoomTrackingLiveData<T> extends LiveData<T> {
    private final Callable<T> computeFunction;
    private final AtomicBoolean computing;
    private final InvalidationLiveDataContainer container;
    private final RoomDatabase database;
    private final boolean inTransaction;
    private final AtomicBoolean invalid;
    private final Runnable invalidationRunnable;
    private final InvalidationTracker.Observer observer;
    private final Runnable refreshRunnable;
    private final AtomicBoolean registeredObserver;

    public final RoomDatabase getDatabase() {
        return this.database;
    }

    public final boolean getInTransaction() {
        return this.inTransaction;
    }

    public final Callable<T> getComputeFunction() {
        return this.computeFunction;
    }

    public RoomTrackingLiveData(RoomDatabase database, InvalidationLiveDataContainer container, boolean z2, Callable<T> computeFunction, final String[] tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.database = database;
        this.container = container;
        this.inTransaction = z2;
        this.computeFunction = computeFunction;
        this.observer = new InvalidationTracker.Observer(tableNames) { // from class: androidx.room.RoomTrackingLiveData$observer$1
            @Override // androidx.room.InvalidationTracker.Observer
            public void onInvalidated(Set<String> tables) {
                Intrinsics.checkNotNullParameter(tables, "tables");
                ArchTaskExecutor.getInstance().executeOnMainThread(this.getInvalidationRunnable());
            }
        };
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.registeredObserver = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable() { // from class: androidx.room.RoomTrackingLiveData$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RoomTrackingLiveData.refreshRunnable$lambda$0(this.f$0);
            }
        };
        this.invalidationRunnable = new Runnable() { // from class: androidx.room.RoomTrackingLiveData$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                RoomTrackingLiveData.invalidationRunnable$lambda$1(this.f$0);
            }
        };
    }

    public final InvalidationTracker.Observer getObserver() {
        return this.observer;
    }

    public final AtomicBoolean getInvalid() {
        return this.invalid;
    }

    public final AtomicBoolean getComputing() {
        return this.computing;
    }

    public final AtomicBoolean getRegisteredObserver() {
        return this.registeredObserver;
    }

    public final Runnable getRefreshRunnable() {
        return this.refreshRunnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshRunnable$lambda$0(RoomTrackingLiveData this$0) {
        boolean z2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.registeredObserver.compareAndSet(false, true)) {
            this$0.database.getInvalidationTracker().addWeakObserver(this$0.observer);
        }
        do {
            if (this$0.computing.compareAndSet(false, true)) {
                T tCall = null;
                z2 = false;
                while (this$0.invalid.compareAndSet(true, false)) {
                    try {
                        try {
                            tCall = this$0.computeFunction.call();
                            z2 = true;
                        } catch (Exception e2) {
                            throw new RuntimeException("Exception while computing database live data.", e2);
                        }
                    } finally {
                        this$0.computing.set(false);
                    }
                }
                if (z2) {
                    this$0.postValue(tCall);
                }
            } else {
                z2 = false;
            }
            if (!z2) {
                return;
            }
        } while (this$0.invalid.get());
    }

    public final Runnable getInvalidationRunnable() {
        return this.invalidationRunnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidationRunnable$lambda$1(RoomTrackingLiveData this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean zHasActiveObservers = this$0.hasActiveObservers();
        if (this$0.invalid.compareAndSet(false, true) && zHasActiveObservers) {
            this$0.getQueryExecutor().execute(this$0.refreshRunnable);
        }
    }

    @Override // androidx.lifecycle.LiveData
    protected void onActive() {
        super.onActive();
        InvalidationLiveDataContainer invalidationLiveDataContainer = this.container;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        invalidationLiveDataContainer.onActive(this);
        getQueryExecutor().execute(this.refreshRunnable);
    }

    @Override // androidx.lifecycle.LiveData
    protected void onInactive() {
        super.onInactive();
        InvalidationLiveDataContainer invalidationLiveDataContainer = this.container;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        invalidationLiveDataContainer.onInactive(this);
    }

    public final Executor getQueryExecutor() {
        return this.inTransaction ? this.database.getTransactionExecutor() : this.database.getQueryExecutor();
    }
}
