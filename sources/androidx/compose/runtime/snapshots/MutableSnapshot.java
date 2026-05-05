package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.PreconditionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
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
/* JADX INFO: compiled from: Snapshot.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яh\u001d<K!&i\u0016DLш|\u0004O\f8é6B\u0015\"4ߚ\u007f\u0007|jA0R͜P.`S2\u000fq|<$i-yCAX\"}0'WN}gvJ`\u000eK\u000f\u001c\u0016\u0001j2R]xk%\u00172H\u0005G3coE9ft>\u000562*8\u007f\n\t\u001a8j\u0018v\u0011CS\f\u0018LF\u0006Pĥ+35\u001a@\u0005v\u001ff^\u001emޮFLz]R/Q\u0004yF\\)w0+P\u001dXb+%\u0005q ;@e;%'c\u00035Yq>1D\u0002O\u0013p?5;K\u0004Wd^\u0010\u0016%+}\u0014sqTaԇU`\u001a0sUq\u0003h\u000eV~A{UG\u0012F\u001e'v5sԿǴ\f\u000e9.;uN\t\u001a^\t:\u001bc<Ѝ3:c5GV~Wq=)N}63IdŁ\u0007ͼ%]ZGnRcZ\u0006\u0010IQn|\u000fbRdK.\u001cp\u0011\tp\u0012ΥK\u007f5=Y4%gO[g*g\u007fJNR+\u000f\u0005\u000fs\u001a}\u001byNf\u0007\u0016ei9\u0010h\n|\u0005\u001aQ\u0005j:We*d\t\u000e\bAhlyL!SXdN\u00171\u001bQkS=/\u0015: ʤ«\u0012W?){H_/(a\u0001}DCJ/\u001dX\u0015A\u001a\u001aȺ`((\u007f\u0011}\u001eF\u0014D|\u0013C6M>44Z0_jČL\u0003$\u0012\n\b\u00170rh>\u0006\u001bAʗ\u0007i*FQ\u0014^/\to\u0016\u007fy0\u000b4:-oc{'łY\"n\tE6\u0015T\f\u007fun|KZl.u\u0004|fچ׀=Q5\u0014[\"\r\u0001J\u0002[L|vs\u0002e\u0012U}CȪӛ?h4@P}~\u0006xjxV\u0005\u001b0vvrQ\t+р\u05fbeF\u0001\",g\u00197VI!\n\n@\\\u0015\u0015\u0005MBk˚Ȟ&|;\u000b\f2+t\u0010\u0014]\u001c(kɳs.\u007fBW,\u0003F\u001c,\u0012\u001d6b\u001a\u0014@\u001dPI\b˚n6*l\u0011F`x\b\nR\tb\u0013CJQd\u001f]NL94.z\r,\u001bxniJ\u0015\u007f}b4o,\u0004C,\u001btBS\u0016\u0014g0\n{.t\u000bx\u000e:\u001d\n5\u0007 ,?0V\u0006h\u00192\u0016sF=W:\u0011\n\u0003\u001dl::  \u000bq[0\u0006X\u0001\u000e+w\u000fE9\ts\fn\u001c^\u0011\\\u0005S[ݻQȚ%6\tϓ'5$\u0005C>%oLb=r\u0003!a-!#zQ\u000ffS=ZSg,~߱\rխIiK̲\u001a8\nZ7\u0002\fq\u0012M&\u0013mt&4QY!a\u00070\r\u001dkc||'\u001etif*9\u0001\u000b|<N \u000e91\u000eGFۿ9ٮR\u0004?Ƒ2\u0003\u001d^7\",~ib)JVM;[ajB*R\u07fb_ȯ\u0002\u0014(é?\u0006z@jw.h\u0010~)\\f\n$\u0006\u001a\tAtvɍ:ؠx~\u0012ڔ 8U'A(3`_\u0013\u0006I\u0011G9p\u001eP[j\t\n\u0012rspe\u000b1mGU(s\u0004Ǳ\u001fԷ+S6߾p\\@:aJ)#\u000e?-&MA>7\u007f֘Qʍlt\u0004Qa99<<<o^HRL|UNLù,ķ,\u0019SXSlr8-xP\b&^\u0019);É\u0018ì\u0018|\u0007Ĝ/)!e^rLe\u0006п%۵_\u0019O֜\u001f\u0006K{4TQTEOEg[\u00106~)\u0011Jd\u0005\u007fXH\u0019t\u0010gZ4\\Sk\u001f}ڣ&މh\t.ɔ]:H>:;é\u0015\u0016"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7}>\\?8r4\f\u001edlG\nm;$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-j", "7c", "", "7me._0=", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-xgO9\u00169", "@dP1B)LS&\u0010zk", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", "EqXAX\u0016;a\u0019\f\f^9", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;L7vB!\u001fwE8tc;$]-Q[U0e\u001cwN\u001c[[\u001eW)\u001c\tcJ28%G(\u0006;M\fD4Vr\u001c\u0018DqtK \u0015X\u0002^vQ2fU]i\u0003U\u000b&r3b\u001bc'e\u0006\u0010g\u0005", "/o_9\\,=", "", "5dc\u000ec7EW\u0019}9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "u(I", "Adc\u000ec7EW\u0019}9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "uY\u0018#", ";da4X+", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;U1#\u0015fp\u000f", "5dc\u001aX9@S\u0018=\bn5\f\r7ey5{G\u0001\u0013%G", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc\u001aX9@S\u0018=\bn5\f\r7ey5{G\u0001\u0013%G", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r D[\u0016=#", ";nS6Y0>R", "5dc\u001ab+BT\u001d~y\u001d9\r\u0012>i\b(uM\u0001\u001e\u0017C}\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`~W~\n9}%#Wy/Fm#\u001cMR\u0011", "Adc\u001ab+BT\u001d~y", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ~'Vk\u000bCv\u00133U\r/7z\u0004.\\\u0019~\\", ">qTC\\6Na|}\t", "5dc\u001de,OW#\u000f\tB+\u000bG<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;L7vB!\u001fwE8tc;$", "Adc\u001de,OW#\u000f\tB+\u000bG<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001cV?Fy7($L`'\u0007r\u0002\u0012g", ">qTC\\6Na\u0004\u0003\u0004g,{v8a\u000b6~J\u0010%", "", "5dc\u001de,OW#\u000f\tI0\u0006\u0012/dm1wK\u000f\u001a!V}LI\u0007.D]\u0006 1z\u00165M?Ik", "u(J\u0016", "Adc\u001de,OW#\u000f\tI0\u0006\u0012/dm1wK\u000f\u001a!V}LI\u0007.D]\u0006 1z\u00165M?Ik", "uZ8uI", "5dc\u001fX(==\u0016\rzk=|\u0016mr\u00101\u000bD\t\u0017\u0011To\u0015<r35", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "@dP1B5Eg", "5dc\u001fX(==\"\u0006\u000f", "@n^A", "5dc\u001fb6M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;L7vB!\u001fw7", "AmP=f/Hb'", "EqXAX\nHc\"\u000e", "5dc$e0MSv\t\u000bg;;\u0016?n\u000f,\u0004@z$\u0017No\nJv", "u(8", "Adc$e0MSv\t\u000bg;;\u0016?n\u000f,\u0004@z$\u0017No\nJv", "uH\u0018#", "5dc$e0MS\u0003{\t^9\u000e\t<$\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "/aP;W6G", "/ce.a*>", "/ce.a*>\u0012&\u000f\u0004m0\u0005\t)r\u007f/{<\u000f\u0017", "\"", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "/o_9l", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-psl@\u001bP,\\\u0007.V\"", "1k^@X\u0013HQ\u001f~y", "1k^@X\u0013HQ\u001f~y\u001d9\r\u0012>i\b(uM\u0001\u001e\u0017C}\u000e", "2hb=b:>", "6`b\u001dX5=W\"\u0001Xa(\u0006\u000b/s", "7m]2e\bI^ \u0013ah*\u0003\t.", "AmP=f/Hb|}", "=oc6`0Lb\u001d|b^9~\t=", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;X4\u001c\u001fu`\u000f", "7me._0=A\"z\u0006l/\u0007\u0018=", "7m]2e\bI^ \u0013ah*\u0003\t.$\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "<dbAX+\u001aQ(\u0003\fZ;|\b", "AmP=f/Hb", "<dbAX+\u001aQ(\u0003\fZ;|\bmr\u00101\u000bD\t\u0017\u0011To\u0015<r35", "<dbAX+\u001dS\u0015|\nb=x\u0018/d", "<dbAX+\u001dS\u0015|\nb=x\u0018/d>5\fI\u0010\u001b\u001fGi\u001b<}%1g}", "<nc6Y@(P\u001e~xm:`\u00123t\u0004$\u0003D\u0016\u0017\u0016", "<nc6Y@(P\u001e~xm:`\u00123t\u0004$\u0003D\u0016\u0017\u0016\u0006|\u001eE\u0006)=Yw-7t\u0016*[C", "@dR<e+&]\u0018\u0003{b,{", "AsPAX", "@dR<e+&]\u0018\u0003{b,{G<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "@dR<e+)`\u0019\u0010~h<\u000b", "@dR<e+)`\u0019\u0010~h<\u000bG<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "@dR<e+)`\u0019\u0010~h<\u000bo3s\u000f", "@dR<e+)`\u0019\u0010~h<\u000bo3s\u000ff\tP\n&\u001bOo\bIv,5U\f ", "@dR<e+)`\u0019\u0010~h<\u000bs3n\t(z.\n\u0013\"Ur\u0018K", "@dR<e+)`\u0019\u0010~h<\u000bs3n\t(z.\n\u0013\"Ur\u0018K52Eb\r$?m\u0010;MJ;gB\u001e", "@dR<e+)`\u0019\u0010~h<\u000bs3n\t(z.\n\u0013\"Ur\u0018K\u0005", "6`]1_,L", "@dR<e+)`\u0019\u0010~h<\u000bs3n\t(z.\n\u0013\"Ur\u0018K\u0005cBi\u0007/;u\u0016(ZCBk0,\u0015", "@d[2T:>>\u001d\b\u0004^+j\u0012+p\u000e+\u0006O\u000fw!TM\u0015F\u0005%\u001cc{&7l", "@d[2T:>>\u001d\b\u0004^+j\u0012+p\u000e+\u0006O\u000fw!TM\u0015F\u0005%\u001cc{&7lT;]LJo<\u001e\u000fua@\u0007_:N", "@d[2T:>>&~\fb6\r\u00176yj,\u0005I\u0001\u0016\u0005Pk\u0019Jy/Dgd*5s\u0016-", "B`Z2A,Lb\u0019}bn;x\u00066em1wK\u000f\u001a!V", "B`Z2A,Lb\u0019}hg(\b\u00172o\u000f", "D`[6W(MS\u0002\t\n:7\b\u00103e~", "D`[6W(MS\u0002\t\n:7\b\u00103e~\u0012\t+\u0005  Gn", "\u0011n\\=T5B]\"", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class MutableSnapshot extends Snapshot {
    private boolean applied;
    private List<? extends StateObject> merged;
    private MutableScatterSet<StateObject> modified;
    private SnapshotIdSet previousIds;
    private int[] previousPinnedSnapshots;
    private final Function1<Object, Unit> readObserver;
    private int snapshots;
    private int writeCount;
    private final Function1<Object, Unit> writeObserver;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int[] EmptyIntArray = new int[0];

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: getReadObserver$runtime_release */
    public Function1<Object, Unit> getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Function1<Object, Unit> getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    public MutableSnapshot(int i2, SnapshotIdSet snapshotIdSet, Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        super(i2, snapshotIdSet, null);
        this.readObserver = function1;
        this.writeObserver = function12;
        this.previousIds = SnapshotIdSet.Companion.getEMPTY();
        this.previousPinnedSnapshots = EmptyIntArray;
        this.snapshots = 1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        MutableScatterSet<StateObject> modified$runtime_release = getModified$runtime_release();
        return modified$runtime_release != null && modified$runtime_release.isNotEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutableSnapshot takeNestedMutableSnapshot$default(MutableSnapshot mutableSnapshot, Function1 function1, Function1 function12, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
        }
        if ((1 & i2) != 0) {
            function1 = null;
        }
        if ((i2 & 2) != 0) {
            function12 = null;
        }
        return mutableSnapshot.takeNestedMutableSnapshot(function1, function12);
    }

    public MutableSnapshot takeNestedMutableSnapshot(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        NestedMutableSnapshot nestedMutableSnapshot;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            int i2 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i2 + 1;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(i2);
            SnapshotIdSet invalid$runtime_release = getInvalid$runtime_release();
            setInvalid$runtime_release(invalid$runtime_release.set(i2));
            nestedMutableSnapshot = new NestedMutableSnapshot(i2, SnapshotKt.addRange(invalid$runtime_release, getId() + 1, i2), SnapshotKt.mergedReadObserver$default(function1, getReadObserver(), false, 4, null), SnapshotKt.mergedWriteObserver(function12, getWriteObserver$runtime_release()), this);
        }
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id = getId();
            synchronized (SnapshotKt.getLock()) {
                int i3 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = i3 + 1;
                setId$runtime_release(i3);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                Unit unit = Unit.INSTANCE;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, getId()));
        }
        return nestedMutableSnapshot;
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.compose.runtime.snapshots.SnapshotApplyResult apply() {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.apply():androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime_release()) {
            return;
        }
        super.dispose();
        mo3766nestedDeactivated$runtime_release(this);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1<Object, Unit> function1) {
        NestedReadonlySnapshot nestedReadonlySnapshot;
        validateNotDisposed$runtime_release();
        validateNotAppliedOrPinned();
        int id = getId();
        recordPrevious$runtime_release(getId());
        synchronized (SnapshotKt.getLock()) {
            int i2 = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i2 + 1;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(i2);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(i2, SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, i2), SnapshotKt.mergedReadObserver$default(function1, getReadObserver(), false, 4, null), this);
        }
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id2 = getId();
            synchronized (SnapshotKt.getLock()) {
                int i3 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = i3 + 1;
                setId$runtime_release(i3);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                Unit unit = Unit.INSTANCE;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id2 + 1, getId()));
        }
        return nestedReadonlySnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedActivated$runtime_release */
    public void mo3765nestedActivated$runtime_release(Snapshot snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release */
    public void mo3766nestedDeactivated$runtime_release(Snapshot snapshot) {
        if (!(this.snapshots > 0)) {
            PreconditionsKt.throwIllegalArgumentException("no pending nested snapshots");
        }
        int i2 = this.snapshots - 1;
        this.snapshots = i2;
        if (i2 != 0 || this.applied) {
            return;
        }
        abandon();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        if (this.applied || getDisposed$runtime_release()) {
            return;
        }
        advance$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void closeLocked$runtime_release() {
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getId()).andNot(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePreviouslyPinnedSnapshotsLocked();
        super.releasePinnedSnapshotsForCloseLocked$runtime_release();
    }

    private final void validateNotApplied() {
        if (this.applied) {
            PreconditionsKt.throwIllegalStateException("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void validateNotAppliedOrPinned() {
        if (!this.applied || ((Snapshot) this).pinningTrackingHandle >= 0) {
            return;
        }
        PreconditionsKt.throwIllegalStateException("Unsupported operation on a disposed or applied snapshot");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void abandon() {
        /*
            r18 = this;
            r11 = r18
            androidx.collection.MutableScatterSet r1 = r11.getModified$runtime_release()
            if (r1 == 0) goto L81
            r11.validateNotApplied()
            r0 = 0
            r11.setModified(r0)
            int r10 = r11.getId()
            androidx.collection.ScatterSet r1 = (androidx.collection.ScatterSet) r1
            java.lang.Object[] r9 = r1.elements
            long[] r8 = r1.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L81
            r6 = 0
            r5 = r6
        L20:
            r3 = r8[r5]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r12 = r0 + r3
            long r0 = r0 | r3
            long r12 = r12 - r0
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r1
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto L7c
            int r0 = r5 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r2 = r6
        L3d:
            if (r2 >= r12) goto L7a
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r3
            r14 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L76
            int r0 = r5 << 3
            int r0 = r0 + r2
            r0 = r9[r0]
            androidx.compose.runtime.snapshots.StateObject r0 = (androidx.compose.runtime.snapshots.StateObject) r0
            androidx.compose.runtime.snapshots.StateRecord r1 = r0.getFirstStateRecord()
        L54:
            if (r1 == 0) goto L76
            int r0 = r1.getSnapshotId$runtime_release()
            if (r0 == r10) goto L6e
            androidx.compose.runtime.snapshots.SnapshotIdSet r14 = r11.previousIds
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            int r0 = r1.getSnapshotId$runtime_release()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = kotlin.collections.CollectionsKt.contains(r14, r0)
            if (r0 == 0) goto L71
        L6e:
            r1.setSnapshotId$runtime_release(r6)
        L71:
            androidx.compose.runtime.snapshots.StateRecord r1 = r1.getNext$runtime_release()
            goto L54
        L76:
            long r3 = r3 >> r13
            int r2 = r2 + 1
            goto L3d
        L7a:
            if (r12 != r13) goto L81
        L7c:
            if (r5 == r7) goto L81
            int r5 = r5 + 1
            goto L20
        L81:
            r11.closeAndReleasePinning$runtime_release()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.abandon():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0129 A[PHI: r16 r17
  0x0129: PHI (r16v3 java.util.ArrayList) = (r16v2 java.util.ArrayList), (r16v4 java.util.ArrayList) binds: [B:96:0x003e, B:142:0x0127] A[DONT_GENERATE, DONT_INLINE]
  0x0129: PHI (r17v7 java.util.List<? extends androidx.compose.runtime.snapshots.StateObject>) = 
  (r17v6 java.util.List<? extends androidx.compose.runtime.snapshots.StateObject>)
  (r17v8 java.util.List<? extends androidx.compose.runtime.snapshots.StateObject>)
 binds: [B:96:0x003e, B:142:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.snapshots.SnapshotApplyResult innerApplyLocked$runtime_release(int r22, java.util.Map<androidx.compose.runtime.snapshots.StateRecord, ? extends androidx.compose.runtime.snapshots.StateRecord> r23, androidx.compose.runtime.snapshots.SnapshotIdSet r24) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.MutableSnapshot.innerApplyLocked$runtime_release(int, java.util.Map, androidx.compose.runtime.snapshots.SnapshotIdSet):androidx.compose.runtime.snapshots.SnapshotApplyResult");
    }

    public final <T> T advance$runtime_release(Function0<? extends T> function0) {
        recordPrevious$runtime_release(getId());
        T tInvoke = function0.invoke();
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id = getId();
            synchronized (SnapshotKt.getLock()) {
                try {
                    int i2 = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId = i2 + 1;
                    setId$runtime_release(i2);
                    SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
            InlineMarker.finallyEnd(1);
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, getId()));
        }
        return tInvoke;
    }

    public final void recordPreviousPinnedSnapshot$runtime_release(int i2) {
        if (i2 >= 0) {
            this.previousPinnedSnapshots = ArraysKt.plus(this.previousPinnedSnapshots, i2);
        }
    }

    public final void recordPreviousPinnedSnapshots$runtime_release(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.previousPinnedSnapshots;
        if (iArr2.length != 0) {
            iArr = ArraysKt.plus(iArr2, iArr);
        }
        this.previousPinnedSnapshots = iArr;
    }

    private final void releasePreviouslyPinnedSnapshotsLocked() {
        int length = this.previousPinnedSnapshots.length;
        for (int i2 = 0; i2 < length; i2++) {
            SnapshotKt.releasePinningLocked(this.previousPinnedSnapshots[i2]);
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: recordModified$runtime_release */
    public void mo3767recordModified$runtime_release(StateObject stateObject) {
        MutableScatterSet<StateObject> modified$runtime_release = getModified$runtime_release();
        if (modified$runtime_release == null) {
            modified$runtime_release = ScatterSetKt.mutableScatterSetOf();
            setModified(modified$runtime_release);
        }
        modified$runtime_release.add(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public int getWriteCount$runtime_release() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime_release(int i2) {
        this.writeCount = i2;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public MutableScatterSet<StateObject> getModified$runtime_release() {
        return this.modified;
    }

    public void setModified(MutableScatterSet<StateObject> mutableScatterSet) {
        this.modified = mutableScatterSet;
    }

    public final List<StateObject> getMerged$runtime_release() {
        return this.merged;
    }

    public final void setMerged$runtime_release(List<? extends StateObject> list) {
        this.merged = list;
    }

    public final SnapshotIdSet getPreviousIds$runtime_release() {
        return this.previousIds;
    }

    public final void setPreviousIds$runtime_release(SnapshotIdSet snapshotIdSet) {
        this.previousIds = snapshotIdSet;
    }

    public final int[] getPreviousPinnedSnapshots$runtime_release() {
        return this.previousPinnedSnapshots;
    }

    public final void setPreviousPinnedSnapshots$runtime_release(int[] iArr) {
        this.previousPinnedSnapshots = iArr;
    }

    public final boolean getApplied$runtime_release() {
        return this.applied;
    }

    public final void setApplied$runtime_release(boolean z2) {
        this.applied = z2;
    }

    /* JADX INFO: compiled from: Snapshot.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001e6Ȑ\u0005ӯ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨\u001cԥ&\tWȞ˝kq"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7}>\\?8r4\f\u001edlG\nm;\rT1OWJ5`\\{\u0013", "", "u(E", "\u0013l_Al\u0010Gbt\f\bZ@", "", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void advance$runtime_release() {
        recordPrevious$runtime_release(getId());
        Unit unit = Unit.INSTANCE;
        if (!getApplied$runtime_release() && !getDisposed$runtime_release()) {
            int id = getId();
            synchronized (SnapshotKt.getLock()) {
                int i2 = SnapshotKt.nextSnapshotId;
                SnapshotKt.nextSnapshotId = i2 + 1;
                setId$runtime_release(i2);
                SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(getId());
                Unit unit2 = Unit.INSTANCE;
            }
            setInvalid$runtime_release(SnapshotKt.addRange(getInvalid$runtime_release(), id + 1, getId()));
        }
    }

    public final void recordPrevious$runtime_release(int i2) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.set(i2);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void recordPreviousList$runtime_release(SnapshotIdSet snapshotIdSet) {
        synchronized (SnapshotKt.getLock()) {
            this.previousIds = this.previousIds.or(snapshotIdSet);
            Unit unit = Unit.INSTANCE;
        }
    }
}
