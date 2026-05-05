package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004O\f8é6B\u0015\"4ߚ\u007f\u0007|jA0R͜P.`S2\u000fq{<$q$yCQU\"}(\u000fWNupvJ`\u001fIƤ\u001cǝ)jZH\u0016$c܈\u001f6PoW3{pM=nvN\u0005N52J\b\t\u0019(:J v)I[\u000e\"0nwPQ;Rŋ\u001e\u0012\u0014Fh\u0007,y\u007fNdO3q\u000351!\u0002B|;&DE`\u001bel';}\u0012\"9`O5C$\u001a\u0011\u07baV[E$\b\u0005K'\u0001'U2yweVp\u007fB\u0014q]ոar,\u007fM\\n0?+}j\u0012^ˎ,w\u0001!UO\u00124\u001e'v5]\u001et/&3#}\u001aNг\u0006^H(C}D@=\u007fa*i-tUyI)PG{3\u0013.%\u0011nObj\r\u000f\u001aahH\u0004?]XEXP\u001aYkx\u001ao\u0011\fZ\u0010>P\u00187\f\u0013>\u0017SBq8Q+\"P\u0007\u0019>Љ\u0011¾l]\u0002TNM0|690\u0018\u001aj\u0015\u0005\u0013ohbh.!MJZ\u0017\u007f\u0018\u0013Nc\u000e;O*fʫQŹmpUΪ\"'5wEk?}\u001cjQ^aI\b8fзTλ\u0018CTd\u000bmtX$\u001ehs@\"`G!dNԒF«\u0010\u0017JAw4BE\u0002%j/`\u0003LC\u0018Ҕ\u0015ރ^h\u0018з%S2\u001e\u00022\u0005\u000b\u0011P\u000bv\u007fi\tIZ\u0004v![F\b\u0004oİWɋl8\u0015%\r\u001b\u0002\u0012ġkv"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0003.IBEt;2\u0003q]D\u0015f6]L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-j", "7c", "", "7me._0=", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-xgO9\u00169", "@dP1B)LS&\u0010zk", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;L7vB!\u001fwE8tc;$]-Q[U0e\u001cwN\u001c[[\u001eW)\u001c\tcJ28%G(\u0006;M\fD4VO\u0007", "D`[BX", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r D[\u0016=#", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;U1#\u0015fp\u000f", ";nS6Y0>R", "5dc\u001ab+BT\u001d~y\u001d9\r\u0012>i\b(uM\u0001\u001e\u0017C}\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`~W~\n9}%#Wy/Fm#\u001cMR\u0011", "Adc\u001ab+BT\u001d~y", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ~'Vk\u000bCv\u00133U\r/7z\u0004.\\\u0019~\\", "5dc\u001fX(==\u0016\rzk=|\u0016mr\u00101\u000bD\t\u0017\u0011To\u0015<r35", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "@dP1B5Eg", "", "5dc\u001fX(==\"\u0006\u000f", "u(I", "@n^A", "5dc\u001fb6M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;L7vB!\u001fw7", "AmP=f/Hb'", "EqXAX\u0016;a\u0019\f\f^9", "5dc$e0MS\u0003{\t^9\u000e\t<$\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "2hb=b:>", "6`b\u001dX5=W\"\u0001Xa(\u0006\u000b/s", "<dbAX+\u001aQ(\u0003\fZ;|\b", "AmP=f/Hb", "<dbAX+\u001aQ(\u0003\fZ;|\bmr\u00101\u000bD\t\u0017\u0011To\u0015<r35", "<dbAX+\u001dS\u0015|\nb=x\u0018/d", "<dbAX+\u001dS\u0015|\nb=x\u0018/d>5\fI\u0010\u001b\u001fGi\u001b<}%1g}", "<nc6Y@(P\u001e~xm:`\u00123t\u0004$\u0003D\u0016\u0017\u0016", "<nc6Y@(P\u001e~xm:`\u00123t\u0004$\u0003D\u0016\u0017\u0016\u0006|\u001eE\u0006)=Yw-7t\u0016*[C", "@dR<e+&]\u0018\u0003{b,{", "AsPAX", "@dR<e+&]\u0018\u0003{b,{G<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "B`Z2A,Lb\u0019}hg(\b\u00172o\u000f", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ReadonlySnapshot extends Snapshot {
    public static final int $stable = 8;
    private final Function1<Object, Unit> readObserver;
    private int snapshots;

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public MutableScatterSet<StateObject> getModified$runtime_release() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Function1<Object, Unit> getWriteObserver$runtime_release() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: getReadObserver$runtime_release, reason: merged with bridge method [inline-methods] */
    public Function1<Object, Unit> getReadObserver() {
        return this.readObserver;
    }

    public ReadonlySnapshot(int i2, SnapshotIdSet snapshotIdSet, Function1<Object, Unit> function1) {
        super(i2, snapshotIdSet, null);
        this.readObserver = function1;
        this.snapshots = 1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this;
    }

    public void setModified(MutableScatterSet<StateObject> mutableScatterSet) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(Function1<Object, Unit> function1) {
        ReadonlySnapshot readonlySnapshot = this;
        SnapshotKt.validateOpen(readonlySnapshot);
        return new NestedReadonlySnapshot(getId(), getInvalid$runtime_release(), SnapshotKt.mergedReadObserver$default(function1, getReadObserver(), false, 4, null), readonlySnapshot);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime_release()) {
            return;
        }
        mo3766nestedDeactivated$runtime_release(this);
        super.dispose();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedActivated$runtime_release */
    public void mo3765nestedActivated$runtime_release(Snapshot snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nestedDeactivated$runtime_release */
    public void mo3766nestedDeactivated$runtime_release(Snapshot snapshot) {
        int i2 = this.snapshots - 1;
        this.snapshots = i2;
        if (i2 == 0) {
            closeAndReleasePinning$runtime_release();
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: recordModified$runtime_release */
    public void mo3767recordModified$runtime_release(StateObject stateObject) {
        SnapshotKt.reportReadonlySnapshotWrite();
        throw new KotlinNothingValueException();
    }
}
