package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.ActualJvm_jvmKt;
import kotlin.KotlinNothingValueException;
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
/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\rӬ4\u0012\u0006\u0007nʑA0RnP.XW2\u000fy\u0002<$a'yCQU\"}(\fWN}gvJp\u000bK\u000f\f%\u0001j:P]xc\u0017\u00172PnG3SxCʠvҚf\u0005N1bk\n\u000b\u000f\u001aBJ&u)B[\u001e 1X~JT\u001dM3\u001d\"\bN /\"rf|8Xpk?G#1oRR5fH|{\u0013ТX'\u001b~*$9qO5C)\u001a\u0017OXiq\u001b? CK|o:9|\fWd\r0\u0018#`g\r\fqljԇU`\u0012]sbq\u0003h\u000eV,+\u007f\u001bq\u001c\u000e4&\u000f<ǉ\u001ef\u000eF{\u007f\u0001\rXP0b\t\u000eѐe6\u001d_HF9t3f\u007fek\u001d\\s\u0014\u0005;8i\u000fͼ%[ZK)1)\u0013\u0010Q_PpOVo\"gMo\u0014p\u0011\u0005:\u0006@G.3\u0012\u0010\\\u0019kK,K1*\u0004\u0002vC\u001e7[\u009ejרmV`B(x$Bz+\u001ah\\d3x\u0001Xf8)MJa=RFavϖ\u0004˶%/(PUwwzm_\u00106=x\b{|\u007f&Wgqc9_o(a\u0001\nJ\u000ez1[֫r͞W\u0016r^.7@^\u000b\u0012}\u0013Rf\\\u001f@D\n\u001cb2\bǌ^ČL\u0003&Փ\u0012/\u0017zrp \u0001d3R\u001d\u007f##\"1\\j|\bo\tK<|\u000f<C@\u007fNOt\u0014v?إ\tɠ\u000b\t\f\u0002M\u0004Zdln\u001c\u0014c\u001bp\"(@i/k\u0019eȲ+ɨ\u0006-MɣCs_M*)\u0011{(\u000e\u0012ß0Թ\fjxݚ1)Xpl%2xnrQ\u000bt\u0002\nat~]b\u0003\r\fPW\u0013\u001bgLPH|3\".'\u0011oP\u0001K,q)[jNҲ;ֵeiq۰F{h14\u0018\u0006\u00062\b$\u00153ckXS8w_5\u0013xّnúFL\u0003y\u000ei\u0017\\]EVj|p\u00057$ߩ1̱j\r4ݸ\tXad!zNF<\u000bBsq*j٬EѼ\u0015S[܊\u0006oQ\n\u0019x_*\u0019+I|\"\u001eM \u0005Zr\u000b@\u0006\"\u001cL@id[Æ\u000bӺ82Dފ#EZ\u001a\u00143Ĩ\u0004\u0006"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0005;ILIv0+\u0015qp#\u0004q,[\b'T:W(g`uG#g", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-j", ">qTC\\6Na\u0007\bvi:\u007f\u0013>", "AoT0\\-BS\u0018kzZ+f\u0006=e\r9{M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", ";da4X\u0017:`\u0019\b\nH)\u000b\t<v\u007f5\n", "", "=v]@C9>d\u001d\t\u000bl\u001a\u0006\u0005:s\u00032\u000b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001cV?Fy7($>H?\u0011r3R\u007fpL]Vu]b{;#\u0016d\u0017\\tm\u0015b?3rN@j]!>E,", "1ta?X5MA\"z\u0006l/\u0007\u0018", "5dc\u0010h9KS\"\u000ehg(\b\u00172o\u000f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;L7vB!\u001fw7", "D`[BX", "", "7c", "5dc\u0016W", "u(8", "Adc\u0016WjKc\"\u000e~f,v\u0016/l\u007f$\n@", "uH\u0018#", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-xgO9\u00169", "7me._0=", "5dc\u0016a=:Z\u001d}9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;L7vB!\u001fwE8tc;$", "Adc\u0016a=:Z\u001d}9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001cV?Fy7($L`'\u0007r\u0002\u0012g", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r D[\u0016=#", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;U1#\u0015fp\u000f", ";nS6Y0>R", "5dc\u001ab+BT\u001d~y\u001d9\r\u0012>i\b(uM\u0001\u001e\u0017C}\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`~W~\n9}%#Wy/Fm#\u001cMR\u0011", "Adc\u001ab+BT\u001d~y", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ~'Vk\u000bCv\u00133U\r/7z\u0004.\\\u0019~\\", "\nrTA \u0006\u0017", "@dP1B)LS&\u0010zk", "5dc\u001fX(==\u0016\rzk=|\u0016mr\u00101\u000bD\t\u0017\u0011To\u0015<r35", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u001fX(==\u0016\rzk=|\u0016", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "@dP1B5Eg", "5dc\u001fX(==\"\u0006\u000f", "u(I", "@n^A", "5dc\u001fb6M", "Bga2T+\"R", "", "5dc![9>O\u0018by\u001d9\r\u0012>i\b(uM\u0001\u001e\u0017C}\u000e", "u(9", "EqXAX\u0016;a\u0019\f\f^9", "5dc$e0MS\u0003{\t^9\u000e\t<$\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "2hb=b:>", "6`b\u001dX5=W\"\u0001Xa(\u0006\u000b/s", "<dbAX+\u001aQ(\u0003\fZ;|\b", "", "AmP=f/Hb", "<dbAX+\u001aQ(\u0003\fZ;|\bmr\u00101\u000bD\t\u0017\u0011To\u0015<r35", "<dbAX+\u001dS\u0015|\nb=x\u0018/d", "<dbAX+\u001dS\u0015|\nb=x\u0018/d>5\fI\u0010\u001b\u001fGi\u001b<}%1g}", "<nc6Y@(P\u001e~xm:`\u00123t\u0004$\u0003D\u0016\u0017\u0016", "<nc6Y@(P\u001e~xm:`\u00123t\u0004$\u0003D\u0016\u0017\u0016\u0006|\u001eE\u0006)=Yw-7t\u0016*[C", "@dR<e+&]\u0018\u0003{b,{", "AsPAX", "@dR<e+&]\u0018\u0003{b,{G<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "B`Z2A,Lb\u0019}hg(\b\u00172o\u000f", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TransparentObserverSnapshot extends Snapshot {
    public static final int $stable = 8;
    private final boolean mergeParentObservers;
    private final boolean ownsPreviousSnapshot;
    private final Snapshot previousSnapshot;
    private Function1<Object, Unit> readObserver;
    private final Snapshot root;
    private final long threadId;
    private final Function1<Object, Unit> writeObserver;

    public TransparentObserverSnapshot(Snapshot snapshot, Function1<Object, Unit> function1, boolean z2, boolean z3) {
        Function1<Object, Unit> readObserver;
        super(0, SnapshotIdSet.Companion.getEMPTY(), null);
        this.previousSnapshot = snapshot;
        this.mergeParentObservers = z2;
        this.ownsPreviousSnapshot = z3;
        this.readObserver = SnapshotKt.mergedReadObserver(function1, (snapshot == null || (readObserver = snapshot.getReadObserver()) == null) ? ((GlobalSnapshot) SnapshotKt.currentGlobalSnapshot.get()).getReadObserver() : readObserver, z2);
        this.threadId = ActualJvm_jvmKt.currentThreadId();
        this.root = this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: getReadObserver$runtime_release, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> getReadObserver() {
        return this.readObserver;
    }

    public void setReadObserver(Function1<Object, Unit> function1) {
        this.readObserver = function1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Function1<Object, Unit> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    public final long getThreadId$runtime_release() {
        return this.threadId;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this.root;
    }

    private final Snapshot getCurrentSnapshot() {
        Snapshot snapshot = this.previousSnapshot;
        return snapshot == null ? (Snapshot) SnapshotKt.currentGlobalSnapshot.get() : snapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        Snapshot snapshot;
        setDisposed$runtime_release(true);
        if (!this.ownsPreviousSnapshot || (snapshot = this.previousSnapshot) == null) {
            return;
        }
        snapshot.dispose();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public int getId() {
        return getCurrentSnapshot().getId();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setId$runtime_release(int i2) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public SnapshotIdSet getInvalid$runtime_release() {
        return getCurrentSnapshot().getInvalid$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setInvalid$runtime_release(SnapshotIdSet snapshotIdSet) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return getCurrentSnapshot().hasPendingChanges();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public MutableScatterSet<StateObject> getModified$runtime_release() {
        return getCurrentSnapshot().getModified$runtime_release();
    }

    public void setModified(MutableScatterSet<StateObject> mutableScatterSet) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: recordModified$runtime_release */
    public void mo3767recordModified$runtime_release(StateObject stateObject) {
        getCurrentSnapshot().mo3767recordModified$runtime_release(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1<Object, Unit> function1) {
        Function1<Object, Unit> function1MergedReadObserver$default = SnapshotKt.mergedReadObserver$default(function1, getReadObserver(), false, 4, null);
        return !this.mergeParentObservers ? SnapshotKt.createTransparentSnapshotWithNoParentReadObserver(getCurrentSnapshot().takeNestedSnapshot(null), function1MergedReadObserver$default, true) : getCurrentSnapshot().takeNestedSnapshot(function1MergedReadObserver$default);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo3765nestedActivated$runtime_release(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo3766nestedDeactivated$runtime_release(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }
}
