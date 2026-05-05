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
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\rӬ4\u0012\u0006\u0007nj?0LeV7ZS0\u0013s{B*c$wFCU0}*\tUQog\u0005Jb\u000bY\u000f\u000e\u0016~w4Ic\u007fe\u0012\u00159JoU3UoC:htD\u0004(݅*8\u0010\u0005\t\u001a0Q\u0016͌\u0011ŏ{\f@/\u0001:JX\u001bM\u001d\u001c(\u0005l\u001f\u00110jhfDXnm:]&\u0013kRNUcF{{\u000fVf5\u0012\u000fo.-P7c\u00185U\u0013\u0007\u0001_U\u0002msM\tv-?+wzg:f\b,\u0015YVոar4eMWn@?+}\u0019\u0012dV.\u00061\u0014\rj\bT\u001aoN<d2f6\u0015y\t;fN\t\u001a^p9+eDQ=\u007faf\u007f)ƻUaAU\u0017J\nB%\u001eQ:\u001f%i\u000f&`CV\u001b\u0006Φ5QF{\u0011Y\u0018\u0019Um2t)\u0010ò\b0M@w\u000f\u001fo/%e_i'/.\u001aHr\u0003=\u0013¾lSo\u0016\u0011r03.7X\b<lR\u0007\u001dy`Vh,?P,V\u0017}6\u00176[&>Q7\u001e\u007fgvyl]]8(?hGY\u001do$Vg`yI\u001a\u007f\u001e'jvBzlt\u0013z~Pc\u000ej\\V%BJz\u0010&\u007fZM:\u0015xSB.B6I\u0019\u000b\u0014~CtՖCҴ\rcrj\u0016\nb?t%w3\r\t/^\rt}t\u0011IZ\u000b\u0017vk\u0010(ژ%łY,\u00016\u00033\u0015\u0010\u0014\u0002MyZZ\u001d\u000f$\u000bm{N*J=_<U\u0013=\u0013_\u0001@{\u001cɴ~ϯUW*)\u0001\u0013\b&[j4\u007f\u0016\u0004A8npbO\u0003\u001exԱ`ѓ'\blрJ\u0014T\u0017_kd\rk>w\u000e\u0019Xjhh\t\u0013,6-\u0011q2|cHY&K0.bmi8ӱuܓ2\u0004z\u0011,\u0012s\"Le\u001c\u000fpq.>I@aY-ExؽnúFHr̫XP\u00174%5^@\u0013o-ИOߵ3}n߿|K~xsH#q\u000e4\\b:uS}BbY$?O\u0004y{\u000fcj\u001bL\u001f\n9~Ap\"\u001ck$lV\u0011\u000bnZJ͉Bװ?n\rµ!&:OJ,+EZ\u000f\u00146K\u0012T\u0007'\u0017`I*\u0010-լVܢ`Z`\u0007fmnJz\u0013\r9K\u001e'`\b܋oܑX5kѢ\u0019U#5)\u0018 !tSCD\u0003GK,f\u000e#E\fQ\u007fPtR\u001eӴyÃs\u0016P\u001a\u0003LP);;WAm\n\u0001\u001d\u0019\u0007|\\tx\"f\u0001Q2+\u000fz+\u0012R\t=\rIa\u0001\u0011z;\\P\b7q\u001d\u0011\u0019T)5\u0010\u0013bt\u001dkZ\fϔIƹn /سoUA0\u0016D@)\n(/\u0003ߏ\u0012-"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0005;ILIv0+\u0015qp#\u0004q,[\b'T4^;XOy=\u0002\u001bV\u0019\\.\u0017\u0014/", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7}>\\?8r4\f\u001edlG\nm;$", ">`a2a;,\\\u0015\n\ta6\f", "AoT0\\-BS\u0018kzZ+f\u0006=e\r9{M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", "AoT0\\-BS\u0018p\bb;|r,s\u007f5\r@\u000e", ";da4X\u0017:`\u0019\b\nH)\u000b\t<v\u007f5\n", "", "=v]@C(KS\"\u000ehg(\b\u00172o\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u0016]R7h;\u001e\u0003q]D\u0015f6]L\u000eMV]3`[<B%\u001a$\u000f^4\u000b\u0014]K-|\u000e\u0018/\u0011*X\u0006EqLa|\u0014?ywF_YL\u000b\u001d?B9qDhc\u0004PO\u000fC:m\nn!fC\u0006y\tf\\\f", "1ta?X5MA\"z\u0006l/\u0007\u0018", "5dc\u0010h9KS\"\u000ehg(\b\u00172o\u000f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w5SJg1%\u0015Vj5\u0012q/X\u0006|", "D`[BX", "", "7c", "5dc\u0016W", "u(8", "Adc\u0016WjKc\"\u000e~f,v\u0016/l\u007f$\n@", "uH\u0018#", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-xgO9\u00169", "7me._0=", "5dc\u0016a=:Z\u001d}9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;L7vB!\u001fwE8tc;$", "Adc\u0016a=:Z\u001d}9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001cV?Fy7($L`'\u0007r\u0002\u0012g", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r D[\u0016=#", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;U1#\u0015fp\u000f", ";nS6Y0>R", "5dc\u001ab+BT\u001d~y\u001d9\r\u0012>i\b(uM\u0001\u001e\u0017C}\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`~W~\n9}%#Wy/Fm#\u001cMR\u0011", "Adc\u001ab+BT\u001d~y", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ~'Vk\u000bCv\u00133U\r/7z\u0004.\\\u0019~\\", "\nrTA \u0006\u0017", "@dP1B)LS&\u0010zk", "5dc\u001fX(==\u0016\rzk=|\u0016mr\u00101\u000bD\t\u0017\u0011To\u0015<r35", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u001fX(==\u0016\rzk=|\u0016", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "@dP1B5Eg", "5dc\u001fX(==\"\u0006\u000f", "u(I", "Bga2T+\"R", "", "5dc![9>O\u0018by\u001d9\r\u0012>i\b(uM\u0001\u001e\u0017C}\u000e", "u(9", "EqXAX\nHc\"\u000e", "5dc$e0MSv\t\u000bg;;\u0016?n\u000f,\u0004@z$\u0017No\nJv", "Adc$e0MSv\t\u000bg;;\u0016?n\u000f,\u0004@z$\u0017No\nJv", "EqXAX\u0016;a\u0019\f\f^9", "5dc$e0MS\u0003{\t^9\u000e\t<$\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "Adc$e0MS\u0003{\t^9\u000e\t<", "/o_9l", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-psl@\u001bP,\\\u0007.V\"", "2hb=b:>", "6`b\u001dX5=W\"\u0001Xa(\u0006\u000b/s", "<dbAX+\u001aQ(\u0003\fZ;|\b", "", "AmP=f/Hb", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-j", "<dbAX+\u001aQ(\u0003\fZ;|\bmr\u00101\u000bD\t\u0017\u0011To\u0015<r35", "<dbAX+\u001dS\u0015|\nb=x\u0018/d", "<dbAX+\u001dS\u0015|\nb=x\u0018/d>5\fI\u0010\u001b\u001fGi\u001b<}%1g}", "<nc6Y@(P\u001e~xm:`\u00123t\u0004$\u0003D\u0016\u0017\u0016", "<nc6Y@(P\u001e~xm:`\u00123t\u0004$\u0003D\u0016\u0017\u0016\u0006|\u001eE\u0006)=Yw-7t\u0016*[C", "@dR<e+&]\u0018\u0003{b,{", "AsPAX", "@dR<e+&]\u0018\u0003{b,{G<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "B`Z2A,Lb\u0019}bn;x\u00066em1wK\u000f\u001a!V", "B`Z2A,Lb\u0019}hg(\b\u00172o\u000f", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TransparentObserverMutableSnapshot extends MutableSnapshot {
    public static final int $stable = 8;
    private final boolean mergeParentObservers;
    private final boolean ownsParentSnapshot;
    private final MutableSnapshot parentSnapshot;
    private Function1<Object, Unit> readObserver;
    private final long threadId;
    private Function1<Object, Unit> writeObserver;

    public TransparentObserverMutableSnapshot(MutableSnapshot mutableSnapshot, Function1<Object, Unit> function1, Function1<Object, Unit> function12, boolean z2, boolean z3) {
        Function1<Object, Unit> writeObserver$runtime_release;
        Function1<Object, Unit> readObserver;
        super(0, SnapshotIdSet.Companion.getEMPTY(), SnapshotKt.mergedReadObserver(function1, (mutableSnapshot == null || (readObserver = mutableSnapshot.getReadObserver()) == null) ? ((GlobalSnapshot) SnapshotKt.currentGlobalSnapshot.get()).getReadObserver() : readObserver, z2), SnapshotKt.mergedWriteObserver(function12, (mutableSnapshot == null || (writeObserver$runtime_release = mutableSnapshot.getWriteObserver$runtime_release()) == null) ? ((GlobalSnapshot) SnapshotKt.currentGlobalSnapshot.get()).getWriteObserver$runtime_release() : writeObserver$runtime_release));
        this.parentSnapshot = mutableSnapshot;
        this.mergeParentObservers = z2;
        this.ownsParentSnapshot = z3;
        this.readObserver = super.getReadObserver();
        this.writeObserver = super.getWriteObserver$runtime_release();
        this.threadId = ActualJvm_jvmKt.currentThreadId();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: getReadObserver$runtime_release */
    public Function1<Object, Unit> getReadObserver() {
        return this.readObserver;
    }

    public void setReadObserver(Function1<Object, Unit> function1) {
        this.readObserver = function1;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public Function1<Object, Unit> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    public void setWriteObserver(Function1<Object, Unit> function1) {
        this.writeObserver = function1;
    }

    public final long getThreadId$runtime_release() {
        return this.threadId;
    }

    private final MutableSnapshot getCurrentSnapshot() {
        MutableSnapshot mutableSnapshot = this.parentSnapshot;
        return mutableSnapshot == null ? (MutableSnapshot) SnapshotKt.currentGlobalSnapshot.get() : mutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        MutableSnapshot mutableSnapshot;
        setDisposed$runtime_release(true);
        if (!this.ownsParentSnapshot || (mutableSnapshot = this.parentSnapshot) == null) {
            return;
        }
        mutableSnapshot.dispose();
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

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return getCurrentSnapshot().hasPendingChanges();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public MutableScatterSet<StateObject> getModified$runtime_release() {
        return getCurrentSnapshot().getModified$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public void setModified(MutableScatterSet<StateObject> mutableScatterSet) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public int getWriteCount$runtime_release() {
        return getCurrentSnapshot().getWriteCount$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime_release(int i2) {
        getCurrentSnapshot().setWriteCount$runtime_release(i2);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult apply() {
        return getCurrentSnapshot().apply();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: recordModified$runtime_release */
    public void mo3767recordModified$runtime_release(StateObject stateObject) {
        getCurrentSnapshot().mo3767recordModified$runtime_release(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1<Object, Unit> function1) {
        Function1<Object, Unit> function1MergedReadObserver$default = SnapshotKt.mergedReadObserver$default(function1, getReadObserver(), false, 4, null);
        return !this.mergeParentObservers ? SnapshotKt.createTransparentSnapshotWithNoParentReadObserver(getCurrentSnapshot().takeNestedSnapshot(null), function1MergedReadObserver$default, true) : getCurrentSnapshot().takeNestedSnapshot(function1MergedReadObserver$default);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public MutableSnapshot takeNestedMutableSnapshot(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        Function1<Object, Unit> function1MergedReadObserver$default = SnapshotKt.mergedReadObserver$default(function1, getReadObserver(), false, 4, null);
        Function1<Object, Unit> function1MergedWriteObserver = SnapshotKt.mergedWriteObserver(function12, getWriteObserver$runtime_release());
        return !this.mergeParentObservers ? new TransparentObserverMutableSnapshot(getCurrentSnapshot().takeNestedMutableSnapshot(null, function1MergedWriteObserver), function1MergedReadObserver$default, function1MergedWriteObserver, false, true) : getCurrentSnapshot().takeNestedMutableSnapshot(function1MergedReadObserver$default, function1MergedWriteObserver);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo3765nestedActivated$runtime_release(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo3766nestedDeactivated$runtime_release(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }
}
