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
/* JADX INFO: compiled from: SnapshotDoubleState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\r&4\u0012}\fnjO0LeN/ZS@\u000fsڔ<$q$yCAX\"}8\tWNugvJ`\u000fK\u000f\u0014\"\u0001j2I[\u0007s܈?2pno3{om?pvF\u0005N4P92\u0004 Z5X\u0014\u0005}[K:\u0014ضDpHVUY\u0013-*\u0006l\"GȽ\\ʄR6V\u0001&M=8\u001buRP7_^~]\u000fVTU$%wdѿ@\u007fU#=k\u0005\u001dQ\nI3C\u007fV\u001dhU1[M\u0002qNX.\u001eE/](urTfKe)\u001a5Ggcyg>,\u0006}\u0014\rj\u000eT\u001aoN<J2f6,y\tCuNU\u001a^p\u0002+eD\u001a=\u007fa-oo%&8ݹ%\u05ee;\u0006\u001d\u000f$)\u000fuA]Z\u0016n\u0019kf\u0006ZIQnG~#`Ն?ъ\btz\u00040\u000f>SP;\n\u001eF\u0017SE2ހ/\u074co\u0002Pֳ8\u000f\u0013o\u0001YyTX@PpDG`]bʅF\u0081\tohV^=\u001f_ɥX'"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Er0C\\\b/\u001f}%*JJ;J>.\u0012oa'\u0016_;NZ/RS$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;U1#\u0015fp\u001d\u000fn3$", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}~A}\u00135M1JgC\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-|xp5\u0004j,<\u0006#VL$", "", "D`[BX", "uC\u0018#", "2nd/_,/O \u000fz", "5dc\u0011b<;Z\u0019ove<|", "u(3", "Adc\u0011b<;Z\u0019ove<|", "4ha@g\u001aMO(~g^*\u0007\u0016.", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;X4\u001c\u001fu`\u000f", "5dc\u0013\\9Lb\u0007\u000evm,i\t-o\r'", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;R7z4\u000b\u0015fkF\u00069", "<dgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Er0C\\\b/\u001f}%*JJ;J>.\u0012oa'\u0016_;NZ/RS\r\u000bfboD\u0014\u007fi\n]+z\u0014UP$[D5)\u0015+\u001f", ">n[6V@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Er0C\\\b/\u001f}%*\\GEt\u001f(\u001cl_M\\", "5dc\u001db3BQ-", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d.1d\f#A|}>\\?Jo>'\u007frh=\u0005w\u0002", "1n\\=b5>\\(J", "u(;7T=:\u001d z\u0004`u[\u0013?b\u0007(Q", "1n\\=b5>\\(K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", ";da4X\u0019>Q#\fyl", ">qTC\\6Na", "1ta?X5M", "/o_9\\,=", ">qT=X5=A(z\n^\u0019|\u00079r~", "BnBAe0GU", "", "\u0012nd/_,,b\u0015\u000ezL;x\u0018/R\u007f&\u0006M\u007f", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class SnapshotMutableDoubleStateImpl extends StateObjectImpl implements MutableDoubleState, SnapshotMutableState<Double> {
    public static final int $stable = 0;
    private DoubleStateStateRecord next;

    public SnapshotMutableDoubleStateImpl(double d2) {
        DoubleStateStateRecord doubleStateStateRecord = new DoubleStateStateRecord(d2);
        if (Snapshot.Companion.isInSnapshot()) {
            DoubleStateStateRecord doubleStateStateRecord2 = new DoubleStateStateRecord(d2);
            doubleStateStateRecord2.setSnapshotId$runtime_release(1);
            doubleStateStateRecord.setNext$runtime_release(doubleStateStateRecord2);
        }
        this.next = doubleStateStateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.MutableDoubleState, androidx.compose.runtime.DoubleState
    public double getDoubleValue() {
        return ((DoubleStateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.MutableDoubleState
    public void setDoubleValue(double d2) {
        Snapshot current;
        DoubleStateStateRecord doubleStateStateRecord = (DoubleStateStateRecord) SnapshotKt.current(this.next);
        if (doubleStateStateRecord.getValue() != d2) {
            DoubleStateStateRecord doubleStateStateRecord2 = this.next;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                ((DoubleStateStateRecord) SnapshotKt.overwritableRecord(doubleStateStateRecord2, this, current, doubleStateStateRecord)).setValue(d2);
                Unit unit = Unit.INSTANCE;
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public SnapshotMutationPolicy<Double> getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    public Double component1() {
        return Double.valueOf(getDoubleValue());
    }

    @Override // androidx.compose.runtime.MutableState
    public Function1<Double, Unit> component2() {
        return new Function1<Double, Unit>() { // from class: androidx.compose.runtime.SnapshotMutableDoubleStateImpl.component2.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Double d2) {
                invoke(d2.doubleValue());
                return Unit.INSTANCE;
            }

            public final void invoke(double d2) {
                SnapshotMutableDoubleStateImpl.this.setDoubleValue(d2);
            }
        };
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        Intrinsics.checkNotNull(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.next = (DoubleStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        Intrinsics.checkNotNull(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        Intrinsics.checkNotNull(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        if (((DoubleStateStateRecord) stateRecord2).getValue() == ((DoubleStateStateRecord) stateRecord3).getValue()) {
            return stateRecord2;
        }
        return null;
    }

    public String toString() {
        return "MutableDoubleState(value=" + ((DoubleStateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    /* JADX INFO: compiled from: SnapshotDoubleState.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLш|\u0004O\n8\u000b4E\u0007\":\u0012\u007f\u0007lj?0Z͜x.\u0001Rj\u001a{\u007fB$s$ DтY\u001a\f$Q]\\m\u007fnxa;G\u001d\u0006.x\u0019+\u0010iAc \u0017JB\u001e>ya@UG`\r63!\tĹDѩ\t\r\"ݒ`\u0012|}QO,\u00146E~<Ŏ\u0011V"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Er0C\\\b/\u001f}%*JJ;J>.\u0012oa'\u0016_;NZ/RS\r\u000bfboD\u0014\u007fi\n]+z\u0014UP$[D5)\u0015+\u001f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u0004=IR;X4\u001c\u001fu`\u000f", "D`[BX", "", "uC\u0018#", "5dc#T3NS", "u(3", "Adc#T3NS", "/rb6Z5", "", "1qT.g,", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class DoubleStateStateRecord extends StateRecord {
        private double value;

        public final double getValue() {
            return this.value;
        }

        public final void setValue(double d2) {
            this.value = d2;
        }

        public DoubleStateStateRecord(double d2) {
            this.value = d2;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            Intrinsics.checkNotNull(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
            this.value = ((DoubleStateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new DoubleStateStateRecord(this.value);
        }
    }
}
