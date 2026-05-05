package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
/* JADX INFO: compiled from: ConstraintController.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nj?6LeVMZS8\u001bsڔ<$q$yّCU(\u0007*\tURog|Jb\u000bI\u0011\u000e\u0016\u0007\u00054I[{c6%˰jqE\u074c[nm?pvF\u0005f1P82\u0004$Z=NƵ\u0007\u0005QL$\u0018@B\u0001:\t҈{\u0007ܨ\u0016\u0006L#I,jyf6v\u007f\u000e>=7\u001bip_m\u0004x\u0010[\"^TU 'e,/X7kՖkwΫ\u000bRiUKK\u007fT\u001dhU:[M\u0002oNX.#]>]&urTv5Un'?+\u0006Ҫ\u0012dˎ,w\t\u0018UN\u0012+\u001e'vH]$t&&9\u0005tc@~\u0013\raH~oV/%.MsX)\biai3~=\n\u000b% 9\u007f\u001d&\fZ\u001ck-\u001djv\bĸ\u0018@ףLN\u0018{\u000e\u0014\u0012vz\u0004@\u0003^L05\n\u0015F\u0019;6\n>aeBȼTזk\u0003\r\u009b\u0001UoYVHBp\u001c@8\u0013\\jRo\u001dmfS\u000f\u008cg۶(Τ\u000b\u007f\u0010\u0013.hHN/2(T_jyj{l83\u0006ό9֍rk\u0016ã\npAEii cbvBPjp[֝h͞W\fb٢x4@I\u0003\u0016\b}TNBƎ`AHʌ6Ϝ5\u0019déȦ\u0007B"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#{*@|#8TJ;xBgrrjG\u0016p(R\u007f6%VW;i\\yD\u0014\u001f0", "\"", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#[*@{%;IGDz\u001b\"#waB\u0007p\u0002", "BqP0^,K", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#\r-3k\u001c.ZQ\u0005I>'#wn5\u000bl;=\u0004#ERN92", "uKP;W9HW\u0018\u0012Dp6\n\u000fxi\b3\u0003\n~! U~\u001b8z.DgG/Di\u00144MPI5\u0012(\u001evpF\u0003g5]e4CJT,i(6.", "D`[BX", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#{*@|#8TJ;xBgrrjG\u0016p(R\u007f6%VW;i\\yD\u0014\u001f\u0019wW\t\u0017\u000egP1jH@.w7H}Jh\u007fi\u0012\u0015<gl@\\e", "1`[9U(<Y", "5dc\u0010T3EP\u0015|\u0001", "u(;.a+K]\u001d}\u000e(>\u0007\u00165/\u00040\u0007GJ\u0015!P}\u001dIr)>h\fi5w\u001f=ZMBr4+#2?C\u0010q;[r+P[,6ea\u007fG\u001b\u0019Z\u001b\r\u0015\u0016bcJ2}Q3#\u0011;9\r:d\u0010\f\u0015k1qw?R\u000eMO", "Adc\u0010T3EP\u0015|\u0001", "uKP;W9HW\u0018\u0012Dp6\n\u000fxi\b3\u0003\n~! U~\u001b8z.DgG\u001eAv%;WJBkA,^FkB\u0015r9Jz0V*X5k_|D\u001b\u0012gL84j\u000fbO3{@;(\u0017\u001cT\u00017w\u0001\u000bs\n<qm>T\u0016\u001d=\u0006", "1ta?X5MD\u0015\u0006\u000b^", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", ";`c0[0GU\u000b\t\bd\u001a\b\t-I~6", "", "", ";`c0[0GU\u000b\t\bd\u001a\b\t-s", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+#d}\u001e\r", "6`b\u0010b5Lb&z~g;", "", "Ena8F7>Q", "7r2<a:M`\u0015\u0003\u0004^+", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "7rF<e2,^\u0019|Xh5\u000b\u0018<a\u00041{?", "Ena8F7>Q|}", "=m2<a:M`\u0015\u0003\u0004m\n\u007f\u00058g\u007f'", "", "<df#T3NS", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "@d_9T*>", "Ena8F7>Q'", "", "@db2g", "CoS.g,\u001cO \u0006wZ*\u0003", "uKP;W9HW\u0018\u0012Dp6\n\u000fxi\b3\u0003\n~! U~\u001b8z.DgG\u001eAv%;WJBkA,^FkB\u0015r9Jz0V*X5k_|D\u001b\u0012gL84j\u000fbO3{@;(\u0017\u001cT\u00017w\u0001\u000bs\n<qm>T\u0016\u001d`\u001aqR%2MUh{\u0011+Bg*b\u001b5`M", "\u001dm2<a:M`\u0015\u0003\u0004m\u001c\b\b+t\u007f'Y<\b\u001e\u0014Cm\u0014", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class ConstraintController<T> implements ConstraintListener<T> {
    private OnConstraintUpdatedCallback callback;
    private T currentValue;
    private final List<String> matchingWorkSpecIds;
    private final List<WorkSpec> matchingWorkSpecs;
    private final ConstraintTracker<T> tracker;

    /* JADX INFO: compiled from: ConstraintController.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\r@4\u0012\u000e\u0007nj?0JJ^\u008c\u0003SX\u000e4\u0010B$s$ Dk_(\u007f:\u000f_Pwg\u001dN\t\u000e\n3N*\u0007oDI\u0004y\u000e\u001c\u001d4ZuO5]ok=\u000fw|)ڼ6("}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#{*@|#8TJ;xBgrrjG\u0016p(R\u007f6%VW;i\\yD\u0014\u001f\u0019wW\t\u0017\u000egP1jH@.w7H}Jh\u007fi\u0012\u0015<gl@\\e", "", "=m2<a:M`\u0015\u0003\u0004m\u0014|\u0018", "", "Ena8F7>Q'", "", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+#d}\u001e\r", "=m2<a:M`\u0015\u0003\u0004m\u0015\u0007\u0018\u0017e\u000f", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public interface OnConstraintUpdatedCallback {
        void onConstraintMet(List<WorkSpec> list);

        void onConstraintNotMet(List<WorkSpec> list);
    }

    public abstract boolean hasConstraint(WorkSpec workSpec);

    public abstract boolean isConstrained(T t2);

    public ConstraintController(ConstraintTracker<T> tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.tracker = tracker;
        this.matchingWorkSpecs = new ArrayList();
        this.matchingWorkSpecIds = new ArrayList();
    }

    public final OnConstraintUpdatedCallback getCallback() {
        return this.callback;
    }

    public final void setCallback(OnConstraintUpdatedCallback onConstraintUpdatedCallback) {
        if (this.callback != onConstraintUpdatedCallback) {
            this.callback = onConstraintUpdatedCallback;
            updateCallback(onConstraintUpdatedCallback, this.currentValue);
        }
    }

    public final void replace(Iterable<WorkSpec> workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        this.matchingWorkSpecs.clear();
        this.matchingWorkSpecIds.clear();
        List<WorkSpec> list = this.matchingWorkSpecs;
        for (WorkSpec workSpec : workSpecs) {
            if (hasConstraint(workSpec)) {
                list.add(workSpec);
            }
        }
        List<WorkSpec> list2 = this.matchingWorkSpecs;
        List<String> list3 = this.matchingWorkSpecIds;
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            list3.add(((WorkSpec) it.next()).id);
        }
        if (this.matchingWorkSpecs.isEmpty()) {
            this.tracker.removeListener(this);
        } else {
            this.tracker.addListener(this);
        }
        updateCallback(this.callback, this.currentValue);
    }

    public final void reset() {
        if (this.matchingWorkSpecs.isEmpty()) {
            return;
        }
        this.matchingWorkSpecs.clear();
        this.tracker.removeListener(this);
    }

    public final boolean isWorkSpecConstrained(String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        T t2 = this.currentValue;
        return t2 != null && isConstrained(t2) && this.matchingWorkSpecIds.contains(workSpecId);
    }

    private final void updateCallback(OnConstraintUpdatedCallback onConstraintUpdatedCallback, T t2) {
        if (!this.matchingWorkSpecs.isEmpty() && onConstraintUpdatedCallback != null) {
            if (t2 == null || isConstrained(t2)) {
                onConstraintUpdatedCallback.onConstraintNotMet(this.matchingWorkSpecs);
            } else {
                onConstraintUpdatedCallback.onConstraintMet(this.matchingWorkSpecs);
            }
        }
    }

    @Override // androidx.work.impl.constraints.ConstraintListener
    public void onConstraintChanged(T t2) {
        this.currentValue = t2;
        updateCallback(this.callback, t2);
    }
}
