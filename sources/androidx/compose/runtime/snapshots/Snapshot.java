package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import com.dynatrace.android.agent.Global;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\u0015\"4\u0012}\u0007njG9LeN<ZS@\u000fs{J$c$wGCU0}*\t]Nogt^b\u000bY\u000f\u000e\u0016~\u00044Ikxe\u0012%2JoU3UoS9hҚ<:6݅@\u000b*\u0005/\u0019bGb7\u0010IM\u001c\u0016>@\t:\u0001\u000e]\t(\u0014\u001e>N\u0004ɉ`g\\:\u0011wkiG#1\n\t÷Ϯc0\u0003}UQbX%v\u0010>qN˝9\u0015+\u0006K\r`\u000fW\u0003m\u0012\u0004\u00191G5_as\u001ekx\u0002\u001aƃ9\u0005=g\u0001\\t\u000bab\u001c'q\u0005\u0012\u0003\u0017ʲ.Þ~{\u001btL\u0014\u0014``.[ -,V;\u0003-kBf\u0001\rۍF\n*I%`\u00183YYKj_\u001eS\u0019|љB#ڟ\"#\u0007,inbLx\u0015It(U?\u000eX=vݐPwǀq\u0004v\"J5\u0012p_\u007f]\u001cWLϲ)7azk4yD`D\u0016\u00175dv\u0017\u0002RvXh\rގ;*\u000fP#OrJ\u0004P\u0003xrҊܖ T\rDP\u001e.$\u0010<OEV\\ћlip\u0016&\u001a3x~7\b\u000f\u001c\u0014euv5KP\u0012߄(a?2M\u0007z\u0005\u0007٨rg\u0012ZjF:@Xl w*C^\u000e#2m\u001223ZP_\u0001]S\u0011iZA+\n&ʳӳ\u0014~Z\u007fl\u000bwq\r\u000b\u0017O\u000bʙ6lAY:Kx\"[a\u0002;'um$~3+ȽM\u0004<\u000bU8dGz\r\\߯ʀ\u007f \u001ck\ni=B+\u000f-/\tĉ9։P~mʸe\u0014-\u0002\u000b\u0002/=n7u\u0012;\u0013:`\u0003J}UG&\u0005i\u000b#6e>H8Ö\u0007ĕg`\u0013ϵVKx\u000fgIn:\u0003\u0013--u\u0019}$\u00155[F}ޅ\"߳\u0018;\u001d˕uku>\bs/(zw\u0012?4)}vi]`AnտYUЗ$ٝp\u0007ZJp\r\u0016JYL\u001bI`Itrf8{#E|\u0015\u001e\u0003ޙrÆ_>+q\u0004M<yz\u0006Q\u0019,^q&g߀_ܭqsSŌ\u001bL\u0015&\u0019\u0019\u0002\u0015 :U.fYr\t^\u0005\u0004\u001aFAi\u0003\u001b;7CjJ\u0013ެ\rͲXs\u0016\u0012\u0001!T|'\u00198d\u0002^'\u001eb\u001dtVv\u000b7ҋbՃ.\u0005\u0017\u00119C\u0007=\u0002\u0015{ll/\u0012ѢWӜ\u001f͢\u001fng\u0001lL9l%[)Rp\u00019F\u000eGW+N\u0004u*$:.Z\u000f\u009f\tܫF\"3;W<m\u0004P`\u0011\u0002r]5\u0015 \u0014j\\2+\u000fz+\rL\f\u001f\u000bGo\tn\u0011L#϶y̢G\u001e\u0019\u0019JW\u0015/ŴbHn\u0002[\fϬA!"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-j", "", "7c", "", "7me._0=", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-xgO9\u00169", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;L7vB!\u001fwE8tc;$:\u0018", "2hb=b:>R", "", "5dc\u0011\\:I]'~y\u001d9\r\u0012>i\b(uM\u0001\u001e\u0017C}\u000e", "u(I", "Adc\u0011\\:I]'~y\u001d9\r\u0012>i\b(uM\u0001\u001e\u0017C}\u000e", "uY\u0018#", "\nrTA \u0006\u0017", "5dc\u0016W", "u(8", "Adc\u0016WjKc\"\u000e~f,v\u0016/l\u007f$\n@", "uH\u0018#", "5dc\u0016a=:Z\u001d}9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;L7vB!\u001fwE8tc;$", "Adc\u0016a=:Z\u001d}9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001cV?Fy7($L`'\u0007r\u0002\u0012g", "7r?6a5>R", "7r?6a5>RW\f\u000bg;\u0001\u0011/_\r(\u0003@|%\u0017", ";nS6Y0>R", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r D[\u0016=#", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;U1#\u0015fp\u000f", "5dc\u001ab+BT\u001d~y\u001d9\r\u0012>i\b(uM\u0001\u001e\u0017C}\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`~W~\n9}%#Wy/Fm#\u001cMR\u0011", ">h];\\5@B&zxd0\u0006\u000b\u0012a\t'\u0003@", "5dc\u001d\\5GW\"\u0001ik(z\u000f3n\u0002\u000bwI\u007f\u001e\u0017\u0006k\u0017E\u000141h\u0002*@{", "u(E", "@dP1B)LS&\u0010zk", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "5dc\u001fX(==\u0016\rzk=|\u0016ma\t1\u0006O|&\u001bQx\u001c", "5dc\u001fX(==\u0016\rzk=|\u0016", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "@dP1B5Eg", "5dc\u001fX(==\"\u0006\u000f", "@n^A", "5dc\u001fb6M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;L7vB!\u001fw7", "D`[BX", "EqXAX\nHc\"\u000e", "5dc$e0MSv\t\u000bg;;\u0016?n\u000f,\u0004@z$\u0017No\nJv", "Adc$e0MSv\t\u000bg;;\u0016?n\u000f,\u0004@z$\u0017No\nJv", "EqXAX\u0016;a\u0019\f\f^9", "5dc$e0MS\u0003{\t^9\u000e\t<$\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "1k^@X\bGR\u0006~\u0002^(\u000b\t\u001ai\t1\u007fI\u0003", "1k^@X\bGR\u0006~\u0002^(\u000b\t\u001ai\t1\u007fI\u0003U$Wx\u001d@~%/f}'7i$.", "1k^@X\u0013HQ\u001f~y", "1k^@X\u0013HQ\u001f~y\u001d9\r\u0012>i\b(uM\u0001\u001e\u0017C}\u000e", "2hb=b:>", "3mc2e", "\"", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "6`b\u001dX5=W\"\u0001Xa(\u0006\u000b/s", ";`Z26<K`\u0019\b\n", "<dbAX+\u001aQ(\u0003\fZ;|\b", "AmP=f/Hb", "<dbAX+\u001aQ(\u0003\fZ;|\bmr\u00101\u000bD\t\u0017\u0011To\u0015<r35", "<dbAX+\u001dS\u0015|\nb=x\u0018/d", "<dbAX+\u001dS\u0015|\nb=x\u0018/d>5\fI\u0010\u001b\u001fGi\u001b<}%1g}", "<nc6Y@(P\u001e~xm:`\u00123t\u0004$\u0003D\u0016\u0017\u0016", "<nc6Y@(P\u001e~xm:`\u00123t\u0004$\u0003D\u0016\u0017\u0016\u0006|\u001eE\u0006)=Yw-7t\u0016*[C", "@dR<e+&]\u0018\u0003{b,{", "AsPAX", "@dR<e+&]\u0018\u0003{b,{G<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "@d[2T:>>\u001d\b\u0004^+j\u0012+p\u000e+\u0006Og!\u0015Mo\r", "@d[2T:>>\u001d\b\u0004^+j\u0012+p\u000e+\u0006Og!\u0015Mo\rz\u00045>h\u0002(7g#.TC7y4", "@d[2T:>>\u001d\b\u0004^+j\u0012+p\u000e+\u0006O\u000fw!TM\u0015F\u0005%\u001cc{&7l", "@d[2T:>>\u001d\b\u0004^+j\u0012+p\u000e+\u0006O\u000fw!TM\u0015F\u0005%\u001cc{&7lT;]LJo<\u001e\u000fua@\u0007_:N", "@dbAb9>1)\f\b^5\f", "B`Z2A,Lb\u0019}hg(\b\u00172o\u000f", "B`Z2b=>`\u0004\u0003\u0004g,{v8a\u000b6~J\u0010", "B`Z2b=>`\u0004\u0003\u0004g,{v8a\u000b6~J\u0010U$Wx\u001d@~%/f}'7i$.", "Cmb.Y,\u001e\\(~\b", "Cmb.Y,%S\u0015\u0010z", "=kS a(Ia\u001c\t\n", "D`[6W(MS\u0002\t\n=0\u000b\u00149s\u007f'", "D`[6W(MS\u0002\t\n=0\u000b\u00149s\u007f':M\u0011 &Kw\u000e6\u0004%<Yy.7", "\u0011n\\=T5B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7}>\\?8r4\f\u001edlG\nm;$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7~.[R;j!\u001e\u0011gkB\u000ew\u001aWr2UOX;2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0003.IBEt;2\u0003q]D\u0015f6]L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0005;ILIv0+\u0015qp#\u0004q,[\b'T:W(g`uG#g", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class Snapshot {
    public static final int PreexistingSnapshotId = 1;
    private boolean disposed;
    private int id;
    private SnapshotIdSet invalid;
    private int pinningTrackingHandle;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ Snapshot(int i2, SnapshotIdSet snapshotIdSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, snapshotIdSet);
    }

    private static /* synthetic */ void getPinningTrackingHandle$annotations() {
    }

    public static /* synthetic */ void getReadObserver$annotations() {
    }

    public abstract MutableScatterSet<StateObject> getModified$runtime_release();

    public abstract Function1<Object, Unit> getReadObserver();

    public abstract boolean getReadOnly();

    public abstract Snapshot getRoot();

    public int getWriteCount$runtime_release() {
        return 0;
    }

    public abstract Function1<Object, Unit> getWriteObserver$runtime_release();

    public abstract boolean hasPendingChanges();

    /* JADX INFO: renamed from: nestedActivated$runtime_release */
    public abstract void mo3765nestedActivated$runtime_release(Snapshot snapshot);

    /* JADX INFO: renamed from: nestedDeactivated$runtime_release */
    public abstract void mo3766nestedDeactivated$runtime_release(Snapshot snapshot);

    public abstract void notifyObjectsInitialized$runtime_release();

    /* JADX INFO: renamed from: recordModified$runtime_release */
    public abstract void mo3767recordModified$runtime_release(StateObject stateObject);

    public abstract Snapshot takeNestedSnapshot(Function1<Object, Unit> function1);

    private Snapshot(int i2, SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
        this.id = i2;
        this.pinningTrackingHandle = i2 != 0 ? SnapshotKt.trackPinning(i2, getInvalid$runtime_release()) : -1;
    }

    public SnapshotIdSet getInvalid$runtime_release() {
        return this.invalid;
    }

    public void setInvalid$runtime_release(SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
    }

    public int getId() {
        return this.id;
    }

    public void setId$runtime_release(int i2) {
        this.id = i2;
    }

    public void setWriteCount$runtime_release(int i2) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot".toString());
    }

    public void dispose() {
        this.disposed = true;
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Snapshot takeNestedSnapshot$default(Snapshot snapshot, Function1 function1, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedSnapshot");
        }
        if ((i2 + 1) - (i2 | 1) != 0) {
            function1 = null;
        }
        return snapshot.takeNestedSnapshot(function1);
    }

    public final <T> T enter(Function0<? extends T> function0) {
        Snapshot snapshotMakeCurrent = makeCurrent();
        try {
            return function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            restoreCurrent(snapshotMakeCurrent);
            InlineMarker.finallyEnd(1);
        }
    }

    public Snapshot makeCurrent() {
        Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
        SnapshotKt.threadSnapshot.set(this);
        return snapshot;
    }

    public void restoreCurrent(Snapshot snapshot) {
        SnapshotKt.threadSnapshot.set(snapshot);
    }

    public final Snapshot unsafeEnter() {
        return makeCurrent();
    }

    public final void unsafeLeave(Snapshot snapshot) {
        if (!(SnapshotKt.threadSnapshot.get() == this)) {
            PreconditionsKt.throwIllegalStateException("Cannot leave snapshot; " + this + " is not the current snapshot");
        }
        restoreCurrent(snapshot);
    }

    public final boolean getDisposed$runtime_release() {
        return this.disposed;
    }

    public final void setDisposed$runtime_release(boolean z2) {
        this.disposed = z2;
    }

    public final boolean isPinned$runtime_release() {
        return this.pinningTrackingHandle >= 0;
    }

    public void closeLocked$runtime_release() {
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(getId());
    }

    public void releasePinnedSnapshotsForCloseLocked$runtime_release() {
        releasePinnedSnapshotLocked$runtime_release();
    }

    public final void validateNotDisposed$runtime_release() {
        if (this.disposed) {
            PreconditionsKt.throwIllegalArgumentException("Cannot use a disposed snapshot");
        }
    }

    public final void releasePinnedSnapshotLocked$runtime_release() {
        int i2 = this.pinningTrackingHandle;
        if (i2 >= 0) {
            SnapshotKt.releasePinningLocked(i2);
            this.pinningTrackingHandle = -1;
        }
    }

    public final int takeoverPinnedSnapshot$runtime_release() {
        int i2 = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i2;
    }

    /* JADX INFO: compiled from: Snapshot.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яn\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"4\u0012\u000e\u0007nj?4LeV7ZS0\u0010s{J$c$wCCU0}*\tUQog\u0005Jb\u000bI\u0011\u000e\u0016\u0007j4I[xe\u0012%2JoE5UoS9hҚ>\u000562*8\b%\t\u001a0M\u0018v\u0011CS\f\u00182HpPR\u0015˟\u000b܌\u0013\u001c̄P\u0001L[(S<Hǰa:=#KoPc?_^\u0002\u0014\f\u000ft5#\u000fadB`9;Ֆ3j3\u0011`sW\tOsM\u0005/>UD\u0010֜]͏\\\u007f\"/s_\u001bx\u000b&\u000b\n\u0002f\u001aCCQyJ~\u0013nvC\u007f\u001bY\u001c\u000e4E\u0011{;9~\bTJ\u0015tYó^\u0019\u000fV\u0006zoV/3\u00105;9IeacK\u0019|U\u0012\u0004;?S\u0015t!iv&n%\u001ddw\u007f0aBMH|(o<\u001c%!l\u0010B\u001c6W\u0002?{WEE>ھ_91D4\bVh\u007fv3b/X2vVe:nD]Z%\u001a\u0002\\|\u0015s`Zh.!MJS5'\u0018\u00150\\&A1' N}\u0007\u0018\u0013\u0016u\u0018OGfe\u007f\u001f{\u001c~QjC7ac>`bx$?j\u00013y/Ja7r^>!`M1\u000f@\fRz$\u0013`]\"\"BHI\u001br\u0014v\bdA\n+\u0017\rrh>\u001d\u000592\u001f\u0002&\u000b\b/U\rt}\u0016\u0011IZ\u0002\u00114;hiC)(e\"\u00173\r%\u0017~\"\u001e]fzh\u0013k^yc+8\u0016HW\u001acKC'~Wc2AKL\u0001\u0006i[\")\u000b|(\u000eKj>g6\t\u0007+\u000f\fzcZ\u00170\u0019v\u00013\nt\u007f(`V|Wc\u0003)q=w\u0014KuJ\u0001P|3$N9\u0007o0\u001dM;S)-\u0016&\u0013?\u0017q]\u0018\u000eDx\u00110n\u0015s7Dc\\$\u0003ScЦIlyc\rV:*|\u0005RH1,6[OͰ\u0013άLAr\u000b\u001fj[@G}-\u001eL\u000fv£iQC~\fLFj:uS}Zuq>ݱQSm$4нb֨J\u0017\u0012\u0011\u00020~\u0012*<>U͓f\t> D*DBSb3>_Ӟ\u0007ʙ@\u000e\u0013͏dk\f\u0013\t\u007f\u0017n\u001d\u001bJB\"@\rR֭|`nJ\u000bfSgqD\u000f\u0007'54wc6;,\u001d\u07be1ҕ6\u000bc\u001f\u000f$xO\u0017h+5R[\n*6c\u0019\u000bsiy\u000eΜ:\b_+sv}\u0019\t'\u000b+Z\u0018IE\bUچz4v\r[r\\qG)taf\"W\u000b#|<L@܊\u000bo\u06ddtƚf1dP}HQ,Q.R8\u001f\f+on\u001b[\u0019kІ= ݠ\u0016ր\u007f[k=\u0004\u0019.4ڝ\b,"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-SFkA\u0012_5R\u00010\u001d", "", "u(E", "\u001eqT2k0Lb\u001d\b|L5x\u0014=h\n7_?", "", "5dc\u001de,>f\u001d\r\nb5~v8a\u000b6~J\u0010z\u0016\u0006k\u0017E\u000141h\u0002*@{", "1ta?X5M", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-j", "5dc\u0010h9KS\"\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;L7vB!\u001fw7", "1ta?X5MB\u001c\fzZ+j\u0012+p\u000e+\u0006O", "5dc\u0010h9KS\"\u000eia9|\u0005.S\t$\u0007N\u0004!&\u0006k\u0017E\u000141h\u0002*@{", "5dc\u0010h9KS\"\u000eia9|\u0005.S\t$\u0007N\u0004!&", "7r0=c3R=\u0016\rzk=|\u0016\u0018o\u000f,|D~\u0013&Ky\u0017'v.4]\u0007\"", "", "u(I", "7r8;F5:^'\u0002\u0005m", "1`]\u000fX\u0019>c'~y", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0005;ILIv0+\u0015qp#\u0004q,[\b'T4^;XOy=\u0002\u001bV\u0019\\.\u0017\u0014/", "5dc\u0010T5\u001bS\u0006~\u000bl,{", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001dZ?Dy?\u001a\"hjHp`:N\u00048GY6<kNoD\u0014\u007fc\nY9\u0010\u000fh\u0017gc", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0005;ILIv0+\u0015qp#\u0004q,[\b'T:W(g`uG#g", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJ\u007f!@g\u0001*F{_\u001dZ?Dy?\u001a\"hjHp`:N\u00048GY<5X]\u0001@\u001e!0QC", "1qT.g,']\"hwl,\n\u001a+b\u0007(iI|\"%Jy\u001d", "5k^/T3", "\"", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", ";`Z26<K`\u0019\b\nG6\u0006r,s\u007f5\r<}\u001e\u0017", ">qTC\\6Na", "<nc6Y@(P\u001e~xm:`\u00123t\u0004$\u0003D\u0016\u0017\u0016", "", "=ab2e=>", "@dP1B)LS&\u0010zk", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "EqXAX\u0016;a\u0019\f\f^9", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d]0tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003_K\u0005\u0010mBj[CN=NdsN\td\u001dZI\u0010", "=oT;F5:^'\u0002\u0005m\n\u0007\u00198t", "@dV6f;>`t\n\u0006e@f\u0006=e\r9{M", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u007f+[CH|4+wdj8\u000ec\u0002", "=ab2e=>`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "@dV6f;>`z\u0006\u0005[(\u0004z<i\u000f(e=\u000f\u0017$Xo\u001b", "@d\\<i,\u001cc&\fzg;", "@dbAb9>1)\f\b^5\f", "@dbAb9><#\bd[:|\u0016@a|/{", "<n]\u001cU:>`*zwe,", "Ad]147IZ-g\u0005m0}\r-a\u000f,\u0006I\u000f", "B`Z2@<MO\u0016\u0006zL5x\u0014=h\n7", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7}>\\?8r4\f\u001edlG\nm;$", "B`Z2F5:^'\u0002\u0005m", "Ehc5@<MO\u0016\u0006zL5x\u0014=h\n7", Global.BLANK, "Ehc5b<M@\u0019zyH)\u000b\t<v{7\u007fJ\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l@\u0005!<`\b2\u0015w\u001e9WQ7h;\u001erdh@\u00159", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCurrentThreadSnapshot$annotations() {
        }

        public static /* synthetic */ void getPreexistingSnapshotId$annotations() {
        }

        private Companion() {
        }

        public final Snapshot getCurrent() {
            return SnapshotKt.currentSnapshot();
        }

        public final boolean isInSnapshot() {
            return SnapshotKt.threadSnapshot.get() != null;
        }

        public final boolean isApplyObserverNotificationPending() {
            return SnapshotKt.pendingApplyObserverCount.get() > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Snapshot takeSnapshot$default(Companion companion, Function1 function1, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                function1 = null;
            }
            return companion.takeSnapshot(function1);
        }

        public final Snapshot takeSnapshot(Function1<Object, Unit> function1) {
            return SnapshotKt.currentSnapshot().takeNestedSnapshot(function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MutableSnapshot takeMutableSnapshot$default(Companion companion, Function1 function1, Function1 function12, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                function1 = null;
            }
            if ((i2 + 2) - (i2 | 2) != 0) {
                function12 = null;
            }
            return companion.takeMutableSnapshot(function1, function12);
        }

        public final MutableSnapshot takeMutableSnapshot(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
            MutableSnapshot mutableSnapshotTakeNestedMutableSnapshot;
            Snapshot snapshotCurrentSnapshot = SnapshotKt.currentSnapshot();
            MutableSnapshot mutableSnapshot = snapshotCurrentSnapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshotCurrentSnapshot : null;
            if (mutableSnapshot == null || (mutableSnapshotTakeNestedMutableSnapshot = mutableSnapshot.takeNestedMutableSnapshot(function1, function12)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            return mutableSnapshotTakeNestedMutableSnapshot;
        }

        public final <T> T global(Function0<? extends T> function0) {
            Snapshot snapshotRemoveCurrent = removeCurrent();
            T tInvoke = function0.invoke();
            Snapshot.Companion.restoreCurrent(snapshotRemoveCurrent);
            return tInvoke;
        }

        public final <R> R withMutableSnapshot(Function0<? extends R> function0) {
            MutableSnapshot mutableSnapshotTakeMutableSnapshot$default = takeMutableSnapshot$default(this, null, null, 3, null);
            try {
                MutableSnapshot mutableSnapshot = mutableSnapshotTakeMutableSnapshot$default;
                Snapshot snapshotMakeCurrent = mutableSnapshot.makeCurrent();
                try {
                    R rInvoke = function0.invoke();
                    InlineMarker.finallyStart(1);
                    mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    InlineMarker.finallyEnd(1);
                    mutableSnapshotTakeMutableSnapshot$default.apply().check();
                    return rInvoke;
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    mutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            } finally {
                InlineMarker.finallyStart(1);
                mutableSnapshotTakeMutableSnapshot$default.dispose();
                InlineMarker.finallyEnd(1);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object observe$default(Companion companion, Function1 function1, Function1 function12, Function0 function0, int i2, Object obj) {
            if ((1 & i2) != 0) {
                function1 = null;
            }
            if ((i2 & 2) != 0) {
                function12 = null;
            }
            return companion.observe(function1, function12, function0);
        }

        public final <T> T observe(Function1<Object, Unit> function1, Function1<Object, Unit> function12, Function0<? extends T> function0) {
            TransparentObserverMutableSnapshot transparentObserverMutableSnapshot;
            if (function1 != null || function12 != null) {
                Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
                if (snapshot instanceof TransparentObserverMutableSnapshot) {
                    TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                    if (transparentObserverMutableSnapshot2.getThreadId$runtime_release() == ActualJvm_jvmKt.currentThreadId()) {
                        Function1<Object, Unit> readObserver = transparentObserverMutableSnapshot2.getReadObserver();
                        Function1<Object, Unit> writeObserver$runtime_release = transparentObserverMutableSnapshot2.getWriteObserver$runtime_release();
                        try {
                            ((TransparentObserverMutableSnapshot) snapshot).setReadObserver(SnapshotKt.mergedReadObserver$default(function1, readObserver, false, 4, null));
                            ((TransparentObserverMutableSnapshot) snapshot).setWriteObserver(SnapshotKt.mergedWriteObserver(function12, writeObserver$runtime_release));
                            return function0.invoke();
                        } finally {
                            transparentObserverMutableSnapshot2.setReadObserver(readObserver);
                            transparentObserverMutableSnapshot2.setWriteObserver(writeObserver$runtime_release);
                        }
                    }
                }
                if (snapshot != null && !(snapshot instanceof MutableSnapshot)) {
                    if (function1 == null) {
                        return function0.invoke();
                    }
                    transparentObserverMutableSnapshot = snapshot.takeNestedSnapshot(function1);
                } else {
                    transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, function1, function12, true, false);
                }
                try {
                    Snapshot snapshotMakeCurrent = transparentObserverMutableSnapshot.makeCurrent();
                    try {
                        return function0.invoke();
                    } finally {
                        transparentObserverMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    }
                } finally {
                    transparentObserverMutableSnapshot.dispose();
                }
            }
            return function0.invoke();
        }

        public final Snapshot createNonObservableSnapshot() {
            return SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default((Snapshot) SnapshotKt.threadSnapshot.get(), null, false, 6, null);
        }

        public final Snapshot getCurrentThreadSnapshot() {
            return (Snapshot) SnapshotKt.threadSnapshot.get();
        }

        private final boolean getCanBeReused(TransparentObserverMutableSnapshot transparentObserverMutableSnapshot) {
            return transparentObserverMutableSnapshot.getThreadId$runtime_release() == ActualJvm_jvmKt.currentThreadId();
        }

        private final boolean getCanBeReused(TransparentObserverSnapshot transparentObserverSnapshot) {
            return transparentObserverSnapshot.getThreadId$runtime_release() == ActualJvm_jvmKt.currentThreadId();
        }

        public final Snapshot makeCurrentNonObservable(Snapshot snapshot) {
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot.getThreadId$runtime_release() == ActualJvm_jvmKt.currentThreadId()) {
                    transparentObserverMutableSnapshot.setReadObserver(null);
                    return snapshot;
                }
            }
            if (snapshot instanceof TransparentObserverSnapshot) {
                TransparentObserverSnapshot transparentObserverSnapshot = (TransparentObserverSnapshot) snapshot;
                if (transparentObserverSnapshot.getThreadId$runtime_release() == ActualJvm_jvmKt.currentThreadId()) {
                    transparentObserverSnapshot.setReadObserver(null);
                    return snapshot;
                }
            }
            Snapshot snapshotCreateTransparentSnapshotWithNoParentReadObserver$default = SnapshotKt.createTransparentSnapshotWithNoParentReadObserver$default(snapshot, null, false, 6, null);
            snapshotCreateTransparentSnapshotWithNoParentReadObserver$default.makeCurrent();
            return snapshotCreateTransparentSnapshotWithNoParentReadObserver$default;
        }

        public final void restoreNonObservable(Snapshot snapshot, Snapshot snapshot2, Function1<Object, Unit> function1) {
            if (snapshot == snapshot2) {
                if (snapshot instanceof TransparentObserverMutableSnapshot) {
                    ((TransparentObserverMutableSnapshot) snapshot).setReadObserver(function1);
                    return;
                } else {
                    if (snapshot instanceof TransparentObserverSnapshot) {
                        ((TransparentObserverSnapshot) snapshot).setReadObserver(function1);
                        return;
                    }
                    throw new IllegalStateException(("Non-transparent snapshot was reused: " + snapshot).toString());
                }
            }
            snapshot2.restoreCurrent(snapshot);
            snapshot2.dispose();
        }

        public final <T> T withoutReadObservation(Function0<? extends T> function0) {
            Snapshot currentThreadSnapshot = getCurrentThreadSnapshot();
            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot snapshotMakeCurrentNonObservable = makeCurrentNonObservable(currentThreadSnapshot);
            try {
                return function0.invoke();
            } finally {
                InlineMarker.finallyStart(1);
                restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                InlineMarker.finallyEnd(1);
            }
        }

        public final ObserverHandle registerApplyObserver(final Function2<? super Set<? extends Object>, ? super Snapshot, Unit> function2) {
            SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.applyObservers = CollectionsKt.plus((Collection<? extends Function2<? super Set<? extends Object>, ? super Snapshot, Unit>>) SnapshotKt.applyObservers, function2);
                Unit unit = Unit.INSTANCE;
            }
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.Snapshot$Companion$$ExternalSyntheticLambda0
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    Snapshot.Companion.registerApplyObserver$lambda$6(function2);
                }
            };
        }

        public final void notifyObjectsInitialized() {
            SnapshotKt.currentSnapshot().notifyObjectsInitialized$runtime_release();
        }

        public final int openSnapshotCount() {
            return CollectionsKt.toList(SnapshotKt.openSnapshots).size();
        }

        public final Snapshot removeCurrent() {
            Snapshot snapshot = (Snapshot) SnapshotKt.threadSnapshot.get();
            if (snapshot != null) {
                SnapshotKt.threadSnapshot.set(null);
            }
            return snapshot;
        }

        public final void restoreCurrent(Snapshot snapshot) {
            if (snapshot != null) {
                SnapshotKt.threadSnapshot.set(snapshot);
            }
        }

        public final ObserverHandle registerGlobalWriteObserver(final Function1<Object, Unit> function1) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.globalWriteObservers = CollectionsKt.plus((Collection<? extends Function1<Object, Unit>>) SnapshotKt.globalWriteObservers, function1);
                Unit unit = Unit.INSTANCE;
            }
            SnapshotKt.advanceGlobalSnapshot();
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.Snapshot$Companion$$ExternalSyntheticLambda1
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void dispose() {
                    Snapshot.Companion.registerGlobalWriteObserver$lambda$9(function1);
                }
            };
        }

        public final void sendApplyNotifications() {
            boolean z2;
            synchronized (SnapshotKt.getLock()) {
                MutableScatterSet<StateObject> modified$runtime_release = ((GlobalSnapshot) SnapshotKt.currentGlobalSnapshot.get()).getModified$runtime_release();
                z2 = false;
                if (modified$runtime_release != null) {
                    if (modified$runtime_release.isNotEmpty()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                SnapshotKt.advanceGlobalSnapshot();
            }
        }

        public static final void registerApplyObserver$lambda$6(Function2 function2) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.applyObservers = CollectionsKt.minus(SnapshotKt.applyObservers, function2);
                Unit unit = Unit.INSTANCE;
            }
        }

        public static final void registerGlobalWriteObserver$lambda$9(Function1 function1) {
            synchronized (SnapshotKt.getLock()) {
                SnapshotKt.globalWriteObservers = CollectionsKt.minus(SnapshotKt.globalWriteObservers, function1);
                Unit unit = Unit.INSTANCE;
            }
            SnapshotKt.advanceGlobalSnapshot();
        }
    }

    public final void closeAndReleasePinning$runtime_release() {
        synchronized (SnapshotKt.getLock()) {
            closeLocked$runtime_release();
            releasePinnedSnapshotsForCloseLocked$runtime_release();
            Unit unit = Unit.INSTANCE;
        }
    }
}
