package androidx.compose.runtime.snapshots;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.DerivedStateObserver;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
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
/* JADX INFO: compiled from: SnapshotStateObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007\":\u0012\u007f\u0007|jA0JgP.hS2\u000fy\u001c<$q$yّCU0}*ޛWN}gvϺb\u000bQ\u0016\u000eǝ\u0001j:R]ތe\u0012%2JģG3coE9vt>\u0005&G*8\b\u0004\t\u001a0L\u0016{\u0011ŏ{\f@/xoo\u00139]*(\u0012\u001e_0\u0018.qwPFH\u001b`h1ݭ\u0007sHR7e6\u0002]\u000fLZM\u0013\u0007c.+n:c\u0016ȏW\u0003\u0015Y$S\u0011Z\n=3kW19e\f]FZ\u0010\u0014C*}\u0017$rn`\u0013nx\fU.\u0018oYm&(&},\u0011J\"&\u0006UGvT(\u0006 \u000eaw#rNp\u001ayR\u0011\u000bpd\u0016Ӿ\u0004=1=+lWfK\u001bT=\"#\u001d 3\u0001\u001d4\nUVf#<lw\u007fD\u0018@\u0006l\\,q=\u001c\u0013\u0011h\bÏ\u0012So\u007f]zA>%IOgI%1kHkTi\u0007\u0005\u000fk\u0002j\u0019H\t=|;O*7\u000f\u000bTr+\u0004\\dZ<\u0011{+d\t\u000e\bA#\u000bx\u0003Ɯ+Xj]\u0010\u0002j{`:/=\u000fO_~m\u001eWg]a?\u0002g\u001e\u000bjvBJ\u0003gM\u0016tlk\f\t_H(8ʋx3 {rM<\u0017@]\n\u001czOa)j@`\u000f.DQ|O\u0003jj ~\u00036R\u0004\u001a.\u0003/\u0019Vlr\u007fg'LZ~˃&-O}}'4\u0003:pD~3\u0007-r\u0016F\u0016V\u000eL51\u0004\u0004\u0014 D\u001dia=c+\u001b\u000f+B\u0002[T\\tuQ{%U{Cȭ\u0015\u0004n<\u0017 j\u001f\\'j\u0013UbH:v\rui\b-\u0004\b\u0014^zuf\u001d\u000fiqar1\\\u0005bF1\u001d\u001fL(1y0#M3S)-\u0016&\u0017]\u0017(b:\u0014<\u0002z'6|u\n<e&o\u0011P\f<K:YY-I2&|\u0003pK\u0019\u0001^Ⱥ\u000bΌ\u00113PШ5~dDe\rE|\u0015\u0014\u0003ݻ|Æ_:\u001b̊NB<mBuY|Bm\u001aќ\u001dߠWguޮ\u001ch\u0019Z'\n9\r\bޮ\u001eεA ^̰3\u0015>\u0018\f\u0018dT\u0012أ\u0011Ø\r$<ɶ\r\u001a\u0019Wlo\u0016\u0012\u000b\u007ftn=,\t\u0081uŌZ\u000e\\ۿ-\u0004V\u0005xfp8:\u0016\u000f\u0011C\u001e'8_\u0007֪J^5gB\u0007Y\"\u0019\u001dpU%l5-TTg\u001eVYWՍGزGI\nԍTg7\u0004\u0004\u0004\u001c<(~3AF\u001aghyg\u00074n\rkc|cU*=ŝPĀ-~\u0003Մ^T\u0018(#%_t\u007fb[K^yGCH\u0004EE\u007fܐ\u000eƔgF#ҎVA;WajB:R߽_ȯ\u0002\b(éڝ\b+"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-\u0003w]H\u0007M)\\v4XL[\u0002", "", "=m25T5@S\u0018^\u000e^*\r\u00189r", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1`[9U(<Y", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "/o_9l\u0016;a\u0019\f\f^9", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-j", "/o_9l\u001cGa){\t\\9\u0001\u0006/", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u007f+[CH|4+wdj8\u000ec\u0002", "1ta?X5M;\u0015\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-\u0003w]H\u0007M)\\v4XL[jFO\u0001=!#Z\r<)\u0017\u0010Y) y\u001a", "1ta?X5M;\u0015\nia9|\u0005.I~", "", "7r?.h:>R", "", "=ab2e=>R\u0007|\u0005i,d\u0005:s", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", ">d]1\\5@1\u001cz\u0004`,\u000b", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Z\u0016/MP;t2\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iK\u0001-9Wj 8m#.VA;A", "@dP1B)LS&\u0010zk", "Ad]1\\5@<#\u000e~_0z\u0005>i\n1\n", "/cS\u0010[(GU\u0019\r", "Adc", "1kT.e", "Ab^=X", "1kT.e\u0010?", ">qT1\\*:b\u0019", "2qP6a\nAO\"\u0001zl", "3mbBe,&O$", "\"", "=m25T5@S\u0018", "4na\u0012T*AA\u0017\t\u0006^\u0014x\u0014", "0k^0^", "<nc6Y@\u001cV\u0015\b|^:", "1gP;Z,L", "AmP=f/Hb", "=ab2e=>@\u0019zyl", "=mE._<>1\u001cz\u0004`,{i9rm&\u0006K\u0001", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u00025|1VSR5&W\u0004E]\u0013j\u0017L:\u0011\u000fbOmOT@\u001d\u00170S\u000b\u0006>D|", "@d\\<i,\u001cV\u0015\b|^:", "@d\\<i,,Q#\nzF(\bl0", "@d_<e;", "", "Ad]1A6MW\u001a\u0003xZ;\u0001\u00138s", "AsP?g", "As^=", "Ehc5A6(P'~\bo(\f\r9n\u000e", "\u001dab2e=>R\u0007|\u0005i,d\u0005:", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SnapshotStateObserver {
    public static final int $stable = 8;
    private ObserverHandle applyUnsubscribe;
    private ObservedScopeMap currentMap;
    private boolean isPaused;
    private final Function1<Function0<Unit>, Unit> onChangedExecutor;
    private boolean sendingNotifications;
    private final AtomicReference<Object> pendingChanges = new AtomicReference<>(null);
    private final Function2<Set<? extends Object>, Snapshot, Unit> applyObserver = new Function2<Set<? extends Object>, Snapshot, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1
        {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set, Snapshot snapshot) {
            invoke2(set, snapshot);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Set<? extends Object> set, Snapshot snapshot) {
            this.this$0.addChanges(set);
            if (this.this$0.drainChanges()) {
                this.this$0.sendNotifications();
            }
        }
    };
    private final Function1<Object, Unit> readObserver = new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$readObserver$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
            if (this.this$0.isPaused) {
                return;
            }
            MutableVector mutableVector = this.this$0.observedScopeMaps;
            SnapshotStateObserver snapshotStateObserver = this.this$0;
            synchronized (mutableVector) {
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = snapshotStateObserver.currentMap;
                Intrinsics.checkNotNull(observedScopeMap);
                observedScopeMap.recordRead(obj);
                Unit unit = Unit.INSTANCE;
            }
        }
    };
    private final MutableVector<ObservedScopeMap> observedScopeMaps = new MutableVector<>(new ObservedScopeMap[16], 0);
    private long currentMapThreadId = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateObserver(Function1<? super Function0<Unit>, Unit> function1) {
        this.onChangedExecutor = function1;
    }

    public final boolean drainChanges() {
        boolean z2;
        synchronized (this.observedScopeMaps) {
            z2 = this.sendingNotifications;
        }
        if (z2) {
            return false;
        }
        boolean z3 = false;
        while (true) {
            Set<? extends Object> setRemoveChanges = removeChanges();
            if (setRemoveChanges == null) {
                return z3;
            }
            synchronized (this.observedScopeMaps) {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i2 = 0;
                    do {
                        z3 = content[i2].recordInvalidation(setRemoveChanges) || z3;
                        i2++;
                    } while (i2 < size);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotStateObserver$sendNotifications$1 */
    /* JADX INFO: compiled from: SnapshotStateObserver.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            do {
                MutableVector mutableVector = SnapshotStateObserver.this.observedScopeMaps;
                SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
                synchronized (mutableVector) {
                    if (!snapshotStateObserver.sendingNotifications) {
                        snapshotStateObserver.sendingNotifications = true;
                        try {
                            MutableVector mutableVector2 = snapshotStateObserver.observedScopeMaps;
                            int size = mutableVector2.getSize();
                            if (size > 0) {
                                Object[] content = mutableVector2.getContent();
                                int i2 = 0;
                                do {
                                    ((ObservedScopeMap) content[i2]).notifyInvalidatedScopes();
                                    i2++;
                                } while (i2 < size);
                            }
                        } finally {
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } while (SnapshotStateObserver.this.drainChanges());
        }
    }

    public final void sendNotifications() {
        this.onChangedExecutor.invoke(new Function0<Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver.sendNotifications.1
            AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                do {
                    MutableVector mutableVector = SnapshotStateObserver.this.observedScopeMaps;
                    SnapshotStateObserver snapshotStateObserver = SnapshotStateObserver.this;
                    synchronized (mutableVector) {
                        if (!snapshotStateObserver.sendingNotifications) {
                            snapshotStateObserver.sendingNotifications = true;
                            try {
                                MutableVector mutableVector2 = snapshotStateObserver.observedScopeMaps;
                                int size = mutableVector2.getSize();
                                if (size > 0) {
                                    Object[] content = mutableVector2.getContent();
                                    int i2 = 0;
                                    do {
                                        ((ObservedScopeMap) content[i2]).notifyInvalidatedScopes();
                                        i2++;
                                    } while (i2 < size);
                                }
                            } finally {
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } while (SnapshotStateObserver.this.drainChanges());
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void addChanges(Set<? extends Object> set) {
        Object obj;
        List listPlus;
        do {
            obj = this.pendingChanges.get();
            if (obj == null) {
                listPlus = set;
            } else if (obj instanceof Set) {
                listPlus = CollectionsKt.listOf((Object[]) new Set[]{obj, set});
            } else {
                if (!(obj instanceof List)) {
                    report();
                    throw new KotlinNothingValueException();
                }
                listPlus = CollectionsKt.plus((Collection) obj, (Iterable) CollectionsKt.listOf(set));
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.pendingChanges, obj, listPlus));
    }

    private final Set<Object> removeChanges() {
        Object obj;
        Object objSubList;
        Set<Object> set;
        do {
            obj = this.pendingChanges.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else if (obj instanceof List) {
                List list = (List) obj;
                set = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
            } else {
                report();
                throw new KotlinNothingValueException();
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.pendingChanges, obj, objSubList));
        return set;
    }

    private final Void report() {
        ComposerKt.composeRuntimeError("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    private final void forEachScopeMap(Function1<? super ObservedScopeMap, Unit> function1) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                if (size > 0) {
                    ObservedScopeMap[] content = mutableVector.getContent();
                    int i2 = 0;
                    do {
                        function1.invoke(content[i2]);
                        i2++;
                    } while (i2 < size);
                }
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
    }

    private final void removeScopeMapIf(Function1<? super ObservedScopeMap, Boolean> function1) {
        synchronized (this.observedScopeMaps) {
            try {
                MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
                int size = mutableVector.getSize();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    if (function1.invoke(mutableVector.getContent()[i3]).booleanValue()) {
                        i2++;
                    } else if (i2 > 0) {
                        mutableVector.getContent()[i3 - i2] = mutableVector.getContent()[i3];
                    }
                }
                int i4 = size - i2;
                ArraysKt.fill(mutableVector.getContent(), (Object) null, i4, size);
                mutableVector.setSize(i4);
                Unit unit = Unit.INSTANCE;
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
    }

    public final <T> void observeReads(T t2, Function1<? super T, Unit> function1, Function0<Unit> function0) {
        ObservedScopeMap observedScopeMapEnsureMap;
        synchronized (this.observedScopeMaps) {
            observedScopeMapEnsureMap = ensureMap(function1);
        }
        boolean z2 = this.isPaused;
        ObservedScopeMap observedScopeMap = this.currentMap;
        long j2 = this.currentMapThreadId;
        if (j2 != -1) {
            if (!(j2 == ActualJvm_jvmKt.currentThreadId())) {
                PreconditionsKt.throwIllegalArgumentException("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j2 + "), currentThread={id=" + ActualJvm_jvmKt.currentThreadId() + ", name=" + ActualJvm_jvmKt.currentThreadName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.isPaused = false;
            this.currentMap = observedScopeMapEnsureMap;
            this.currentMapThreadId = ActualJvm_jvmKt.currentThreadId();
            observedScopeMapEnsureMap.observe(t2, this.readObserver, function0);
        } finally {
            this.currentMap = observedScopeMap;
            this.isPaused = z2;
            this.currentMapThreadId = j2;
        }
    }

    @Deprecated(message = "\u0015K\fArw\u001a\u0017oP<\u0003\u0010\b:Ol_\u00116\u00196#[\u000bN}\u007fbf)gl;fURn~:Z'BHY\u001f", replaceWith = @ReplaceWith(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"}))
    @InterfaceC1492Gx
    public final void withNoObservations(Function0<Unit> function0) {
        boolean z2 = this.isPaused;
        this.isPaused = true;
        try {
            function0.invoke();
        } finally {
            this.isPaused = z2;
        }
    }

    public final void start() {
        this.applyUnsubscribe = Snapshot.Companion.registerApplyObserver(this.applyObserver);
    }

    public final void stop() {
        ObserverHandle observerHandle = this.applyUnsubscribe;
        if (observerHandle != null) {
            observerHandle.dispose();
        }
    }

    public final void notifyChanges(Set<? extends Object> set, Snapshot snapshot) {
        this.applyObserver.invoke(set, snapshot);
    }

    private final <T> ObservedScopeMap ensureMap(Function1<? super T, Unit> function1) {
        ObservedScopeMap observedScopeMap;
        MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
        int size = mutableVector.getSize();
        if (size > 0) {
            ObservedScopeMap[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                observedScopeMap = content[i2];
                if (observedScopeMap.getOnChanged() == function1) {
                    break;
                }
                i2++;
            } while (i2 < size);
            observedScopeMap = null;
        } else {
            observedScopeMap = null;
        }
        ObservedScopeMap observedScopeMap2 = observedScopeMap;
        if (observedScopeMap2 == null) {
            Intrinsics.checkNotNull(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
            ObservedScopeMap observedScopeMap3 = new ObservedScopeMap((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1));
            this.observedScopeMaps.add(observedScopeMap3);
            return observedScopeMap3;
        }
        return observedScopeMap2;
    }

    /* JADX INFO: compiled from: SnapshotStateObserver.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яx\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b<B\u0007\"2\u0013\u007f\u0007|jAӄLeV4Zݷ2\u000f\u0002{<$q$yCAU\"}8\tWNmhvJp\u000bK\u000f\f\u0017\u0001jBI]xs\u0012\u0017˰JoU3UڎE9vt>\u0005&6*8\b\u000e\t\u001a0J\u0018v\u0011CS\f\u00180HpHr\u0015M\u000b\u001e\u001a\u0006T \t\u001ebiT6^Ǎ\u000e:]\"C\u0001R^5_H\t]\u000fVTU\f\u0007c.+n9c\u0016ȏW\u0003\u0015U$C\u0011\\\n=3jo59g\fWdZ0\u0018#Jg\r\fql\\M]n,?+}e{T\u001cG\u0010z*\f\u0005\b\u001c'?H\\Obj\u00161Kt!U\t~\u0010\u0003Z\u007f)cf\u001b3\u001fK+g\u001a\u0017ao`1ZG}\u0015\rL\"\u0011p1[\u0003\u0010\u000f\u0016K^\u0006wIWP?XN8[k\u0015L\u0003p*B\u0004^i09\n:F\u001d59k9Q \u001a,\u0011Pu\"\u001d`\u0017U\u001aVVl:nD6r5\u001a\u0006\\d3m\u0001XfX)MJS7\u0002\u0016\u001a8\\&DQ)\u001eRgh\u0018i}g\u0018RGlG[~k<Vgdy5\u001ay\u001e\u0010jvBAlf\u0013w~B\u0002\u000b\u000b`6NJH\u0019\u000f>{\ru\u001aBJ? \u001edK?It0X\u0014.Qo{ȤcdnA\u000fZ9V\u0013k*z/ `^\u0001o\u0016\u001bw-Ep0`YQc\u001bV]0\u001dL\u00013\u0007\u0005t.R8ZUP\u0005\u0018\fT*\u001fl֠Eֺ3=\u001bÁO=@\u0007EM\\tuQ{\u0011=y+\u007fe\u0093t\u05cek\brѱ|lxQgTE*Mܨ~ן\fd\bט2b\tP{d\u001b]NI!\u0002iB^<\r\u0005%\u001fS\f\u001e,Sމ/ϡ+\u001d\u001eߐd;#mui\u001e6Pʯ\u001b֑xe\fϺ4%}oi]`IΒM_\u0007Ж:&r\u0012PX;\n\u0016S!:\u001d5XA\u0013o\u0005J$ߕ1̱j\u00074ݸAqi:+{\u000e6>_XrS\u007f$^q'?NϬksuжt\rP\"\u0018\u001fLe|'4e0\\gf\u00190\ftFAQ?r\u0007R\bR3ZRp\u001dSZy\n z\u0006G\u000e\u001a'6RuQU<SWs-ޣ\u0007ޝI`)ơQ\u001d\u001dK6\u000bE3\u0015mtS?kB\u0007c\u001f\u0019\u001b\u0019N-lSD\u001bǷ;Ь,X\tՊ\u0016sQc\u001a@\u0014M9q{o\u00129F\bK]nÊ;ݔ\u0015_~Ѫ/#c\u0001fp\u0007\u0014vR|!9\u0001\u000b|<;8\u0019aĂQζsb5ًϾ{l"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-\u0003w]H\u0007M)\\v4XL[jFO\u0001=!#Z\r<)\u0017\u0010Y) y\u001a", "", "=m25T5@S\u0018", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "1ta?X5MA\u0017\t\u0006^", "1ta?X5MA\u0017\t\u0006^\u0019|\u0005.s", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001bv%\u0016IN\u0011", "1ta?X5MB#\u0005zg", "", "2d_2a+>\\\u0017\u0013ih\u000b|\u00163v\u007f'iO|&\u0017U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u001cKMFk\u001c\u001a >", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l<\u0004)FY|\u000eFi%.#", "2da6i,,b\u0015\u000ezL*\u0007\u0014/C\n8\u0005O", "2da6i,=A(z\n^\u0016y\u0017/r\u0011(\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l<\u0004)FY|\u000eFi%.7@IkA/\u0015u7", "5dc\u0011X9Bd\u0019}hm(\f\t\u0019b\u000e(\tQ\u0001$", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006U%B]\u000f 6[%*\\C%hB\u001e\"yaF\\", "7me._0=O(~y", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r D[\u0016=#", "5dc\u001ca\nAO\"\u0001z]", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "@dR<e+>Rw~\bb=|\b\u001dt{7{1|\u001e'G}", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", "Ab^=X\u001bHD\u0015\u0006\u000b^:", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r DU\u00129#", "AsPAX:-]\u0006~\b^({", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "D`[BX\u001bHA\u0017\t\u0006^:", "1kT.e", "1kT.e\u0016;a#\u0006zm,j\u0018+t\u007f\u0015{<\u007f%", "Ab^=X", "1kT.e\u001a<]$~d[:|\u0016@a\u000f,\u0006I\u000f", "6`b V6IS\u0003{\t^9\u000e\u0005>i\n1\n", "", "<nc6Y@\"\\*z\u0002b+x\u0018/dm&\u0006K\u0001%", "=ab2e=>", "@dP1B)LS&\u0010zk", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "@dR<e+\"\\*z\u0002b+x\u00183o\t", "1gP;Z,L", "", "@dR<e++S\u0015}", "D`[BX", "@dR<e+>R\nz\u0002n,\u000b", "@d\\<i,(P'~\bo(\f\r9n", "@d\\<i,,Q#\nzB-", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "@da2T+\u001dS&\u0003\f^+j\u0018+t\u007f", "2da6i,=A(z\n^", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class ObservedScopeMap {
        private Object currentScope;
        private MutableObjectIntMap<Object> currentScopeReads;
        private int deriveStateScopeCount;
        private final Function1<Object, Unit> onChanged;
        private int currentToken = -1;
        private final ScopeMap<Object, Object> valueToScopes = new ScopeMap<>();
        private final MutableScatterMap<Object, MutableObjectIntMap<Object>> scopeToValues = new MutableScatterMap<>(0, 1, null);
        private final MutableScatterSet<Object> invalidated = new MutableScatterSet<>(0, 1, null);
        private final MutableVector<DerivedState<?>> statesToReread = new MutableVector<>(new DerivedState[16], 0);
        private final DerivedStateObserver derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.snapshots.SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState<?> derivedState) {
                this.this$0.deriveStateScopeCount++;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState<?> derivedState) {
                SnapshotStateObserver.ObservedScopeMap observedScopeMap = this.this$0;
                observedScopeMap.deriveStateScopeCount--;
            }
        };
        private final ScopeMap<Object, DerivedState<?>> dependencyToDerivedStates = new ScopeMap<>();
        private final HashMap<DerivedState<?>, Object> recordedDerivedStateValues = new HashMap<>();

        public ObservedScopeMap(Function1<Object, Unit> function1) {
            this.onChanged = function1;
        }

        public final Function1<Object, Unit> getOnChanged() {
            return this.onChanged;
        }

        public final DerivedStateObserver getDerivedStateObserver() {
            return this.derivedStateObserver;
        }

        public final void recordRead(Object obj) {
            Object obj2 = this.currentScope;
            Intrinsics.checkNotNull(obj2);
            int i2 = this.currentToken;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
                this.currentScopeReads = mutableObjectIntMap;
                this.scopeToValues.set(obj2, mutableObjectIntMap);
                Unit unit = Unit.INSTANCE;
            }
            recordRead(obj, i2, obj2, mutableObjectIntMap);
        }

        /* JADX WARN: Removed duplicated region for block: B:64:0x0096  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void recordRead(java.lang.Object r22, int r23, java.lang.Object r24, androidx.collection.MutableObjectIntMap<java.lang.Object> r25) {
            /*
                r21 = this;
                r7 = r21
                int r0 = r7.deriveStateScopeCount
                if (r0 <= 0) goto L7
                return
            L7:
                r1 = -1
                r0 = r25
                r2 = r23
                r6 = r22
                int r11 = r0.put(r6, r2, r1)
                boolean r0 = r6 instanceof androidx.compose.runtime.DerivedState
                r20 = 2
                if (r0 == 0) goto L9c
                if (r11 == r2) goto L9c
                r0 = r6
                androidx.compose.runtime.DerivedState r0 = (androidx.compose.runtime.DerivedState) r0
                androidx.compose.runtime.DerivedState$Record r2 = r0.getCurrentRecord()
                java.util.HashMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> r1 = r7.recordedDerivedStateValues
                java.util.Map r1 = (java.util.Map) r1
                java.lang.Object r0 = r2.getCurrentValue()
                r1.put(r6, r0)
                androidx.collection.ObjectIntMap r0 = r2.getDependencies()
                androidx.compose.runtime.collection.ScopeMap<java.lang.Object, androidx.compose.runtime.DerivedState<?>> r10 = r7.dependencyToDerivedStates
                r10.removeScope(r6)
                java.lang.Object[] r9 = r0.keys
                long[] r8 = r0.metadata
                int r5 = r8.length
                int r5 = r5 - r20
                if (r5 < 0) goto L9d
                r4 = 0
            L3f:
                r2 = r8[r4]
                long r0 = ~r2
                r12 = 7
                long r0 = r0 << r12
                long r16 = r0 + r2
                long r0 = r0 | r2
                long r16 = r16 - r0
                r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r12 = r16 + r14
                long r16 = r16 | r14
                long r12 = r12 - r16
                int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r0 == 0) goto L96
                int r0 = r4 - r5
                int r0 = ~r0
                int r0 = r0 >>> 31
                r1 = 8
                int r13 = 8 - r0
                r12 = 0
            L62:
                if (r12 >= r13) goto L94
                r18 = 255(0xff, double:1.26E-321)
                long r16 = r2 + r18
                long r14 = r2 | r18
                long r16 = r16 - r14
                r14 = 128(0x80, double:6.3E-322)
                int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
                if (r0 >= 0) goto L93
                int r0 = r4 << 3
                int r0 = r0 + r12
                r14 = r9[r0]
                androidx.compose.runtime.snapshots.StateObject r14 = (androidx.compose.runtime.snapshots.StateObject) r14
                boolean r0 = r14 instanceof androidx.compose.runtime.snapshots.StateObjectImpl
                if (r0 == 0) goto L89
                r1 = r14
                androidx.compose.runtime.snapshots.StateObjectImpl r1 = (androidx.compose.runtime.snapshots.StateObjectImpl) r1
                androidx.compose.runtime.snapshots.ReaderKind$Companion r0 = androidx.compose.runtime.snapshots.ReaderKind.Companion
                int r0 = androidx.compose.runtime.snapshots.ReaderKind.m3769constructorimpl(r20)
                r1.m3782recordReadInh_f27i8$runtime_release(r0)
            L89:
                r10.add(r14, r6)
                r1 = 8
            L8e:
                long r2 = r2 >> r1
                int r12 = r12 + 1
                r0 = -1
                goto L62
            L93:
                goto L8e
            L94:
                if (r13 != r1) goto L9d
            L96:
                if (r4 == r5) goto L9d
                int r4 = r4 + 1
                r0 = -1
                goto L3f
            L9c:
                goto L9e
            L9d:
                r1 = -1
            L9e:
                if (r11 != r1) goto Lb7
                boolean r0 = r6 instanceof androidx.compose.runtime.snapshots.StateObjectImpl
                if (r0 == 0) goto Lb0
                r1 = r6
                androidx.compose.runtime.snapshots.StateObjectImpl r1 = (androidx.compose.runtime.snapshots.StateObjectImpl) r1
                androidx.compose.runtime.snapshots.ReaderKind$Companion r0 = androidx.compose.runtime.snapshots.ReaderKind.Companion
                int r0 = androidx.compose.runtime.snapshots.ReaderKind.m3769constructorimpl(r20)
                r1.m3782recordReadInh_f27i8$runtime_release(r0)
            Lb0:
                androidx.compose.runtime.collection.ScopeMap<java.lang.Object, java.lang.Object> r0 = r7.valueToScopes
                r1 = r24
                r0.add(r6, r1)
            Lb7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.recordRead(java.lang.Object, int, java.lang.Object, androidx.collection.MutableObjectIntMap):void");
        }

        public final void observe(Object obj, Function1<Object, Unit> function1, Function0<Unit> function0) {
            Object obj2 = this.currentScope;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            int i2 = this.currentToken;
            this.currentScope = obj;
            this.currentScopeReads = this.scopeToValues.get(obj);
            if (this.currentToken == -1) {
                this.currentToken = SnapshotKt.currentSnapshot().getId();
            }
            DerivedStateObserver derivedStateObserver = this.derivedStateObserver;
            MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
            try {
                mutableVectorDerivedStateObservers.add(derivedStateObserver);
                Snapshot.Companion.observe(function1, null, function0);
                mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                Object obj3 = this.currentScope;
                Intrinsics.checkNotNull(obj3);
                clearObsoleteStateReads(obj3);
                this.currentScope = obj2;
                this.currentScopeReads = mutableObjectIntMap;
                this.currentToken = i2;
            } catch (Throwable th) {
                mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                throw th;
            }
        }

        private final void clearObsoleteStateReads(Object obj) {
            int i2 = this.currentToken;
            MutableObjectIntMap<Object> mutableObjectIntMap = this.currentScopeReads;
            if (mutableObjectIntMap == null) {
                return;
            }
            long[] jArr = mutableObjectIntMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 + j2) - (255 | j2) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj2 = mutableObjectIntMap.keys[i6];
                            boolean z2 = mutableObjectIntMap.values[i6] != i2;
                            if (z2) {
                                removeObservation(obj, obj2);
                            }
                            if (z2) {
                                mutableObjectIntMap.removeValueAt(i6);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        return;
                    }
                }
                if (i3 == length) {
                    return;
                } else {
                    i3++;
                }
            }
        }

        public final void clearScopeObservations(Object obj) {
            MutableObjectIntMap<Object> mutableObjectIntMapRemove = this.scopeToValues.remove(obj);
            if (mutableObjectIntMapRemove == null) {
                return;
            }
            MutableObjectIntMap<Object> mutableObjectIntMap = mutableObjectIntMapRemove;
            Object[] objArr = mutableObjectIntMap.keys;
            int[] iArr = mutableObjectIntMap.values;
            long[] jArr = mutableObjectIntMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2))) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 + j2) - (255 | j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj2 = objArr[i5];
                            int i6 = iArr[i5];
                            removeObservation(obj, obj2);
                        }
                        j2 >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }

        public final void removeScopeIf(Function1<Object, Boolean> function1) {
            MutableScatterMap<Object, MutableObjectIntMap<Object>> mutableScatterMap = this.scopeToValues;
            long[] jArr = mutableScatterMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2))) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((j2 + 255) - (j2 | 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            Object obj = mutableScatterMap.keys[i6];
                            MutableObjectIntMap mutableObjectIntMap = (MutableObjectIntMap) mutableScatterMap.values[i6];
                            Boolean boolInvoke = function1.invoke(obj);
                            if (boolInvoke.booleanValue()) {
                                MutableObjectIntMap mutableObjectIntMap2 = mutableObjectIntMap;
                                Object[] objArr = mutableObjectIntMap2.keys;
                                int[] iArr = mutableObjectIntMap2.values;
                                long[] jArr2 = mutableObjectIntMap2.metadata;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i7 = 0;
                                    while (true) {
                                        long j3 = jArr2[i7];
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i8 = 8 - ((~(i7 - length2)) >>> 31);
                                            for (int i9 = 0; i9 < i8; i9++) {
                                                if ((j3 + 255) - (j3 | 255) < 128) {
                                                    int i10 = (i7 << 3) + i9;
                                                    Object obj2 = objArr[i10];
                                                    int i11 = iArr[i10];
                                                    removeObservation(obj, obj2);
                                                }
                                                j3 >>= 8;
                                            }
                                            if (i8 != 8) {
                                                break;
                                            }
                                        }
                                        if (i7 == length2) {
                                            break;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                            }
                            if (boolInvoke.booleanValue()) {
                                mutableScatterMap.removeValueAt(i6);
                            }
                            i3 = 8;
                        }
                        j2 >>= i3;
                    }
                    if (i4 != i3) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }

        public final boolean hasScopeObservations() {
            return this.scopeToValues.isNotEmpty();
        }

        private final void removeObservation(Object obj, Object obj2) {
            this.valueToScopes.remove(obj2, obj);
            if (!(obj2 instanceof DerivedState) || this.valueToScopes.contains(obj2)) {
                return;
            }
            this.dependencyToDerivedStates.removeScope(obj2);
            this.recordedDerivedStateValues.remove(obj2);
        }

        public final void clear() {
            this.valueToScopes.clear();
            this.scopeToValues.clear();
            this.dependencyToDerivedStates.clear();
            this.recordedDerivedStateValues.clear();
        }

        /* JADX WARN: Removed duplicated region for block: B:329:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:369:0x019a A[PHI: r30
  0x019a: PHI (r30v53 boolean) = (r30v52 boolean), (r30v54 boolean) binds: [B:358:0x015f, B:368:0x0198] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:378:0x01ba A[PHI: r30
  0x01ba: PHI (r30v48 boolean) = (r30v47 boolean), (r30v49 boolean) binds: [B:339:0x00da, B:377:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:403:0x0250 A[PHI: r30
  0x0250: PHI (r30v43 boolean) = (r30v42 boolean), (r30v44 boolean) binds: [B:393:0x0218, B:402:0x024e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:425:0x02c2 A[EDGE_INSN: B:425:0x02c2->B:562:0x0086 BREAK  A[LOOP:8: B:414:0x027d->B:426:0x02c4], PHI: r30
  0x02c2: PHI (r30v37 boolean) = (r30v36 boolean), (r30v38 boolean) binds: [B:415:0x028e, B:424:0x02c0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:431:0x02d5 A[PHI: r30
  0x02d5: PHI (r30v31 boolean) = (r30v30 boolean), (r30v32 boolean) binds: [B:318:0x004c, B:430:0x02d3] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:443:0x0318  */
        /* JADX WARN: Removed duplicated region for block: B:482:0x040f A[PHI: r30
  0x040f: PHI (r30v21 boolean) = (r30v20 boolean), (r30v22 boolean) binds: [B:471:0x03d6, B:481:0x040d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:491:0x042d A[PHI: r30
  0x042d: PHI (r30v16 boolean) = (r30v15 boolean), (r30v17 boolean) binds: [B:453:0x0353, B:490:0x042b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:517:0x04ba A[PHI: r30
  0x04ba: PHI (r30v11 boolean) = (r30v10 boolean), (r30v12 boolean) binds: [B:507:0x0487, B:516:0x04b8] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean recordInvalidation(java.util.Set<? extends java.lang.Object> r41) {
            /*
                Method dump skipped, instruction units count: 1419
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.recordInvalidation(java.util.Set):boolean");
        }

        public final void rereadDerivedState(DerivedState<?> derivedState) {
            MutableScatterMap<Object, MutableObjectIntMap<Object>> mutableScatterMap = this.scopeToValues;
            int id = SnapshotKt.currentSnapshot().getId();
            Object obj = this.valueToScopes.getMap().get(derivedState);
            if (obj == null) {
                return;
            }
            if (!(obj instanceof MutableScatterSet)) {
                MutableObjectIntMap<Object> mutableObjectIntMap = mutableScatterMap.get(obj);
                if (mutableObjectIntMap == null) {
                    mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
                    mutableScatterMap.set(obj, mutableObjectIntMap);
                    Unit unit = Unit.INSTANCE;
                }
                recordRead(derivedState, id, obj, mutableObjectIntMap);
                return;
            }
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2))) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((j2 & 255) < 128) {
                            Object obj2 = objArr[(i2 << 3) + i5];
                            MutableObjectIntMap<Object> mutableObjectIntMap2 = mutableScatterMap.get(obj2);
                            if (mutableObjectIntMap2 == null) {
                                mutableObjectIntMap2 = new MutableObjectIntMap<>(0, 1, null);
                                mutableScatterMap.set(obj2, mutableObjectIntMap2);
                                Unit unit2 = Unit.INSTANCE;
                            }
                            recordRead(derivedState, id, obj2, mutableObjectIntMap2);
                            i3 = 8;
                        }
                        j2 >>= i3;
                    }
                    if (i4 != i3) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x004d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void notifyInvalidatedScopes() {
            /*
                r17 = this;
                r1 = r17
                androidx.collection.MutableScatterSet<java.lang.Object> r11 = r1.invalidated
                r0 = r11
                androidx.collection.ScatterSet r0 = (androidx.collection.ScatterSet) r0
                kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r10 = r1.onChanged
                java.lang.Object[] r9 = r0.elements
                long[] r8 = r0.metadata
                int r0 = r8.length
                int r7 = r0 + (-2)
                if (r7 < 0) goto L52
                r16 = 0
                r6 = r16
            L16:
                r4 = r8[r6]
                long r0 = ~r4
                r2 = 7
                long r0 = r0 << r2
                long r0 = r0 & r4
                r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r0 = r0 & r12
                int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
                if (r2 == 0) goto L4d
                int r0 = r6 - r7
                int r0 = ~r0
                int r0 = r0 >>> 31
                r13 = 8
                int r12 = 8 - r0
                r3 = r16
            L31:
                if (r3 >= r12) goto L4b
                r0 = 255(0xff, double:1.26E-321)
                long r14 = r0 + r4
                long r0 = r0 | r4
                long r14 = r14 - r0
                r1 = 128(0x80, double:6.3E-322)
                int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
                if (r0 >= 0) goto L47
                int r0 = r6 << 3
                int r0 = r0 + r3
                r0 = r9[r0]
                r10.invoke(r0)
            L47:
                long r4 = r4 >> r13
                int r3 = r3 + 1
                goto L31
            L4b:
                if (r12 != r13) goto L52
            L4d:
                if (r6 == r7) goto L52
                int r6 = r6 + 1
                goto L16
            L52:
                r11.clear()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateObserver.ObservedScopeMap.notifyInvalidatedScopes():void");
        }
    }

    public final void clear(Object obj) {
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                ObservedScopeMap observedScopeMap = mutableVector.getContent()[i3];
                observedScopeMap.clearScopeObservations(obj);
                if (!observedScopeMap.hasScopeObservations()) {
                    i2++;
                } else if (i2 > 0) {
                    mutableVector.getContent()[i3 - i2] = mutableVector.getContent()[i3];
                }
            }
            int i4 = size - i2;
            ArraysKt.fill(mutableVector.getContent(), (Object) null, i4, size);
            mutableVector.setSize(i4);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void clearIf(Function1<Object, Boolean> function1) {
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                ObservedScopeMap observedScopeMap = mutableVector.getContent()[i3];
                observedScopeMap.removeScopeIf(function1);
                if (!observedScopeMap.hasScopeObservations()) {
                    i2++;
                } else if (i2 > 0) {
                    mutableVector.getContent()[i3 - i2] = mutableVector.getContent()[i3];
                }
            }
            int i4 = size - i2;
            ArraysKt.fill(mutableVector.getContent(), (Object) null, i4, size);
            mutableVector.setSize(i4);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void clear() {
        synchronized (this.observedScopeMaps) {
            MutableVector<ObservedScopeMap> mutableVector = this.observedScopeMaps;
            int size = mutableVector.getSize();
            if (size > 0) {
                ObservedScopeMap[] content = mutableVector.getContent();
                int i2 = 0;
                do {
                    content[i2].clear();
                    i2++;
                } while (i2 < size);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
