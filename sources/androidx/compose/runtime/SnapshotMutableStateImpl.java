package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: SnapshotState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&˛\bDZc|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007loA0ZeP.XT2\u000f\u0002{<$a*yCQU\"}0\tWNmkvJh\u0017K\u000f\f\u0016~xBկ}zc܈\u001d1rom3}uM;pt|\u0004N3Z7\u001cE\u001a*.V\u0012\u000fzyŷ\u001c\u001c>C\t@b\u000f]\u0005PŇ4Bŋ\u0005\u001ejl\u0017BV\u0004u:e݊IݚBĚ+_>\u0007\u0016 Tl?\u0019\u0007c.+vʺE\u00175S1!\u0001t\u0006Ÿ?:]\u0013\u0004?)AH\"cf\\\u000e0-+}\u0019\u000ev4y\u001dQ\u000f\u0018W/]\u0002cP<4>\u000fD\u001bJ#&\u0006Ub^1(h \u000ea\u00019g\tV\u0010~Z\u007f)\u0003|+u\u0015A1Q\u001b\u001dϟ\u0018\u0001ϭRA\f\u0007\u0013%1\t\u0007#a]\u001cje-b\u0003i1\u007fLs\u001d%˺[ǀq\b\td\b7\u0012>\u0018\u0012=\u000b)4''G[o\u05faO{X҉Pϼz\u0005hå$\u0002`KX(~\u0018G*?ȱ\tH;ʤmÏX^4Ҋe\u001eZ\u0018\f\u001acHjyT![ī~Svk\u0003M\u0014܃[\u0004%\f0ʻwް[In5;dq\u0018yT|(MF\u0003\u0007^{Pi۷^\u007f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Er0C\\\b/\u001f}%*JJ;YC\u001a$hEA\u0012j\u0002", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;U1#\u0015fp\u001d\u000fn3$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-|xp5\u0004j,<\u0006#VL$", "D`[BX", ">n[6V@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Er0C\\\b/\u001f}%*\\GEt\u001f(\u001cl_M\\", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_;]LJo<\u001e^Vj5\u0012q/X\u0006\u000fW[J;`\\{(\u001e\u0019^\fb\u0001Pu", "2dQBZ.>`w\u0003\ti3x\u001d a\u00078{", "5dc\u0011X)NU\u001b~\b=0\u000b\u00146a\u0014\u0019wG\u0011\u0017UCx\u0017F\u0006!D]\b)E", "u(E", "5dc\u0011X)NU\u001b~\b=0\u000b\u00146a\u0014\u0019wG\u0011\u0017", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "4ha@g\u001aMO(~g^*\u0007\u0016.", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;X4\u001c\u001fu`\u000f", "5dc\u0013\\9Lb\u0007\u000evm,i\t-o\r'", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;R7z4\u000b\u0015fkF\u00069", "<dgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Er0C\\\b/\u001f}%*JJ;YC\u001a$hEA\u0012jj<\u0006#VL<;Xar*\u0014\u0010d\u001bM\u0001", "5dc\u001db3BQ-", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d.1d\f#A|}>\\?Jo>'\u007frh=\u0005w\u0002", "5dc#T3NSWz\u0004g6\f\u0005>i\n1\n", "5dc#T3NS", "Adc#T3NS", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", ";da4X\u0019>Q#\fyl", ">qTC\\6Na", "1ta?X5M", "/o_9\\,=", ">qT=X5=A(z\n^\u0019|\u00079r~", "BnBAe0GU", "", "!sPAX\u001aMO(~g^*\u0007\u0016.", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class SnapshotMutableStateImpl<T> extends StateObjectImpl implements SnapshotMutableState<T> {
    public static final int $stable = 0;
    private StateStateRecord<T> next;
    private final SnapshotMutationPolicy<T> policy;

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    public SnapshotMutableStateImpl(T t2, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        this.policy = snapshotMutationPolicy;
        StateStateRecord<T> stateStateRecord = new StateStateRecord<>(t2);
        if (Snapshot.Companion.isInSnapshot()) {
            StateStateRecord stateStateRecord2 = new StateStateRecord(t2);
            stateStateRecord2.setSnapshotId$runtime_release(1);
            stateStateRecord.setNext$runtime_release(stateStateRecord2);
        }
        this.next = stateStateRecord;
    }

    @Override // androidx.compose.runtime.MutableState, androidx.compose.runtime.State
    public T getValue() {
        return (T) ((StateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.MutableState
    public void setValue(T t2) {
        Snapshot current;
        StateStateRecord stateStateRecord = (StateStateRecord) SnapshotKt.current(this.next);
        if (!getPolicy().equivalent(stateStateRecord.getValue(), t2)) {
            StateStateRecord<T> stateStateRecord2 = this.next;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                ((StateStateRecord) SnapshotKt.overwritableRecord(stateStateRecord2, this, current, stateStateRecord)).setValue(t2);
                Unit unit = Unit.INSTANCE;
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        Intrinsics.checkNotNull(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.next = (StateStateRecord) stateRecord;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        Intrinsics.checkNotNull(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        StateStateRecord stateStateRecord = (StateStateRecord) stateRecord;
        Intrinsics.checkNotNull(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        StateStateRecord stateStateRecord2 = (StateStateRecord) stateRecord2;
        Intrinsics.checkNotNull(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        StateStateRecord stateStateRecord3 = (StateStateRecord) stateRecord3;
        if (!getPolicy().equivalent(stateStateRecord2.getValue(), stateStateRecord3.getValue())) {
            Object objMerge = getPolicy().merge(stateStateRecord.getValue(), stateStateRecord2.getValue(), stateStateRecord3.getValue());
            if (objMerge == null) {
                return null;
            }
            StateRecord stateRecordCreate = stateStateRecord3.create();
            Intrinsics.checkNotNull(stateRecordCreate, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$4>");
            ((StateStateRecord) stateRecordCreate).setValue(objMerge);
            return stateRecordCreate;
        }
        return stateRecord2;
    }

    public String toString() {
        return "MutableState(value=" + ((StateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    /* JADX INFO: compiled from: SnapshotState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&˛\bDZc|\u0004G\f8\u000b<B\u0007\"2\u0012}\u0007|ʑa2JdV-\u0003SX\u000f,\u0007D(i%\nCqT۟\u0002\"\u0017Q\u0017uuvbZ9L?\n${\u0003,wU?qZ\u0015@L\b?aM6Q\nz\u00039\u001d h!\u000fэ\u0011в\u001e8P\u0010\u0005\u0002[M\u0012\u0016>E\u0011<X\u0013[\u0007ܮ\u0016\u0011"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Er0C\\\b/\u001f}%*JJ;YC\u001a$hEA\u0012jj<\u0006#VL<;Xar*\u0014\u0010d\u001bM\u0001", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;X4\u001c\u001fu`\u000f", ";xE._<>", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "D`[BX", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc#T3NS", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "/rb6Z5", "", "1qT.g,", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class StateStateRecord<T> extends StateRecord {
        private T value;

        public StateStateRecord(T t2) {
            this.value = t2;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            Intrinsics.checkNotNull(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.value = ((StateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new StateStateRecord(this.value);
        }

        public final T getValue() {
            return this.value;
        }

        public final void setValue(T t2) {
            this.value = t2;
        }
    }

    @Override // androidx.compose.runtime.MutableState
    public T component1() {
        return getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    public Function1<T, Unit> component2() {
        return new Function1<T, Unit>(this) { // from class: androidx.compose.runtime.SnapshotMutableStateImpl.component2.1
            final /* synthetic */ SnapshotMutableStateImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t2) {
                this.this$0.setValue(t2);
            }
        };
    }

    public final T getDebuggerDisplayValue() {
        return (T) ((StateStateRecord) SnapshotKt.current(this.next)).getValue();
    }
}
