package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.PinnableContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: LazyLayoutPinnableItem.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\":ߚ\u007fјnjO0LeN5ZS8\u0015s{::c$\u007fCCU ~(\teȞ\u0018g\u001dI\u000b\u000bq\u000f6\u0016'kl^e~k\u0014'4Xnm6]sK=xtd\nڶ6\"F\u007fM\u0005(Q`\u0010%#\fQ\u001a;H@\u001f:\u0019!\u0016\u000b(<\u001e>N)dp8{DP\u0005_P.Q\u0002\u001aH\\.w2\u0013L;E\u000bgK78ӟѷ@˝9%-U\t\u0014`iW\u0005EzK\u000f\t)-6W\u007f(_f\u0010,\u0015Y^=a\u0001-t\u0005\u007foB{i$:ֶ׃\u000e߭{\u000b\u0004\u000fB\u0019\u001c\u001c?J4>(x(\u00109\b\u0001g\u0011d\u0010`Z\u0002\u0011`d\u001a{Ņ5ڢ=!nϟy=\u001feE\u0014U:,<\u0019p7Z\u0003\u000e\u0011\u001b)[\u0010SGPn=~\u000fH\u001a\u0014Ъ՝pĊ\u0006:\f2M\u001e=\n)0\u001d?EvY%'\b\u0010e\u0015\u000e\u0005%xjih\u0001Gp(|5O,\u001f\u000b\tC\u001bI*\u0015+З8ҭQ&l\t\u0004)!*|yBC3\u001c\u001f[vm\u0003M\f\u000f{ÇhƠ]nsލ(blVMQ\u0012\u001f\u0012V\u0005\u001bW<\u0011\u0014\u000f'\u0001\u0014bȚٱ(ϒ6Xr\u0012}\"Rd$\u00158c\u007f.T.7>j)Ȧ\u0007I"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;9z0PHK3\\6\u0002=\u001cg", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a)>by\u001d>ms8VR7o=\u001e\">", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a)>by\u001d>ms8VR7o=\u001e\"'L=\u0010l,MY#PKU,2", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;9z0PLM\u0010kRz$\u0018 iL9/\u0016\u000eY@\b}D?t", "9dh", "", ">h];X+\"b\u0019\u0007ab:\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;9z0PLM\u0010kRz$\u0018 ic", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_/WSDj0-\u0019rj\u0003\u000e_Ab@.C`X<k\u001cY9)&A\nb5\u001d\u0014DE-wD6\u0003\u0017,Qh?v\u0010aY~", "\nrTA \u0006\u0017", "-oP?X5M>\u001d\b\u0004Z)\u0004\t\ro\t7wD\n\u0017$", "5dc,c(KS\"\u000eeb5\u0006\u0005,l\u007f\u0006\u0006I\u0010\u0013\u001bPo\u001b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n ]\u0007)3j\u001d.+MDz0\"\u001ehn\u000f", "Adc,c(KS\"\u000eeb5\u0006\u0005,l\u007f\u0006\u0006I\u0010\u0013\u001bPo\u001b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u00109b\u0007\u001c4t\u0016\fWLJg8'\u0015u7|w", "-oP?X5M>\u001d\b\u0004Z)\u0004\t\ro\t7wD\n\u0017$\u0006n\u000eCv'1h}", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "", "7mS2k", "5dc\u0016a+>f", "u(8", "Adc\u0016a+>f", "uH\u0018#", "7mS2kj=S ~|Z;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0004@|\u0004=IR;A", "5dc\u0018X@", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", ">`a2a;!O\"}\u0002^", "5dc\u001dT9>\\(avg+\u0004\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n ]\u0007)3j\u001d.+MDz0\"\u001ehnwqg5Wv&*HW+cRH", "Adc\u001dT9>\\(avg+\u0004\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u00109b\u0007\u001c4t\u0016\fWLJg8'\u0015u $\u000bl5Nu\nCUM3\\(6.", ">`a2a;!O\"}\u0002^j{\t6e\u0002$\u000b@", "D`[BX", ">`a2a;)W\"\bv[3|f9n\u000f$\u007fI\u0001$", "5dc\u001dT9>\\(i~g5x\u00066e]2\u0005O|\u001b G|", "Adc\u001dT9>\\(i~g5x\u00066e]2\u0005O|\u001b G|", ">h]@66N\\(", "5dc\u001d\\5L1#\u000f\u0004m", "Adc\u001d\\5L1#\u000f\u0004m", ">h]@66N\\(=y^3|\u000b+t\u007f", "=m36f7Ha\u0019}", "", ">h]", "@d[2T:>", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class LazyLayoutPinnableItem implements PinnableContainer, PinnableContainer.PinnedHandle, LazyLayoutPinnedItemList.PinnedItem {
    private final Object key;
    private final LazyLayoutPinnedItemList pinnedItemList;
    private final MutableIntState index$delegate = SnapshotIntStateKt.mutableIntStateOf(-1);
    private final MutableIntState pinsCount$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
    private final MutableState parentHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState _parentPinnableContainer$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public LazyLayoutPinnableItem(Object obj, LazyLayoutPinnedItemList lazyLayoutPinnedItemList) {
        this.key = obj;
        this.pinnedItemList = lazyLayoutPinnedItemList;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem
    public int getIndex() {
        return this.index$delegate.getIntValue();
    }

    public void setIndex(int i2) {
        this.index$delegate.setIntValue(i2);
    }

    private final int getPinsCount() {
        return this.pinsCount$delegate.getIntValue();
    }

    private final void setPinsCount(int i2) {
        this.pinsCount$delegate.setIntValue(i2);
    }

    private final PinnableContainer.PinnedHandle getParentHandle() {
        return (PinnableContainer.PinnedHandle) this.parentHandle$delegate.getValue();
    }

    private final void setParentHandle(PinnableContainer.PinnedHandle pinnedHandle) {
        this.parentHandle$delegate.setValue(pinnedHandle);
    }

    private final PinnableContainer get_parentPinnableContainer() {
        return (PinnableContainer) this._parentPinnableContainer$delegate.getValue();
    }

    private final void set_parentPinnableContainer(PinnableContainer pinnableContainer) {
        this._parentPinnableContainer$delegate.setValue(pinnableContainer);
    }

    public final PinnableContainer getParentPinnableContainer() {
        return get_parentPinnableContainer();
    }

    public final void setParentPinnableContainer(PinnableContainer pinnableContainer) {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (pinnableContainer != get_parentPinnableContainer()) {
                set_parentPinnableContainer(pinnableContainer);
                if (getPinsCount() > 0) {
                    PinnableContainer.PinnedHandle parentHandle = getParentHandle();
                    if (parentHandle != null) {
                        parentHandle.release();
                    }
                    setParentHandle(pinnableContainer != null ? pinnableContainer.pin() : null);
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    @Override // androidx.compose.ui.layout.PinnableContainer
    public PinnableContainer.PinnedHandle pin() {
        if (getPinsCount() == 0) {
            this.pinnedItemList.pin$foundation_release(this);
            PinnableContainer parentPinnableContainer = getParentPinnableContainer();
            setParentHandle(parentPinnableContainer != null ? parentPinnableContainer.pin() : null);
        }
        setPinsCount(getPinsCount() + 1);
        return this;
    }

    @Override // androidx.compose.ui.layout.PinnableContainer.PinnedHandle
    public void release() {
        if (getPinsCount() <= 0) {
            throw new IllegalStateException("Release should only be called once".toString());
        }
        setPinsCount(getPinsCount() - 1);
        if (getPinsCount() == 0) {
            this.pinnedItemList.release$foundation_release(this);
            PinnableContainer.PinnedHandle parentHandle = getParentHandle();
            if (parentHandle != null) {
                parentHandle.release();
            }
            setParentHandle(null);
        }
    }

    public final void onDisposed() {
        int pinsCount = getPinsCount();
        for (int i2 = 0; i2 < pinsCount; i2++) {
            release();
        }
    }
}
