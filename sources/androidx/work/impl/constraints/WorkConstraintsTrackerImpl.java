package androidx.work.impl.constraints;

import androidx.work.Logger;
import androidx.work.impl.constraints.controllers.BatteryChargingController;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.controllers.NetworkConnectedController;
import androidx.work.impl.constraints.controllers.NetworkMeteredController;
import androidx.work.impl.constraints.controllers.NetworkNotRoamingController;
import androidx.work.impl.constraints.controllers.NetworkUnmeteredController;
import androidx.work.impl.constraints.controllers.StorageNotLowController;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: WorkConstraintsTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0LeV=ZS@\u000fs{:%c$\u007fّC٥\"}0\u0012WȞog|VbŏK\u000f\u0014\u0016\u0001̓4Ic\u0017e\u0012%2JoE3UoKSht<\u00056݅R8(\u00041\u001aXHP\u000e\u0001W[\u0010 1XphT\u001dS\u0013\u001d*\bT\u001f/\"֔kNDM-~@.3\twEf)u/+Q\u001dTb-%\u0001q$;DG5\u001b&\u0002\u000b5YÜC\u0003Mz\u0006\u0011v4?+w\u0002\b:f\u000f,\u0015Y_Uq\u00017t\u0005\u007fr<19b{Q`\u00108w)\u0011;PJ\"N;VDE\u001a\u0015\u001a>=\u0003\u0006kF`\u0004nB.\u0010\u0010J]9HG9P3f\u007fsk#\\J\u0014\u000b\u001d 3\u0001\u001d6\nlTt]!b\u0011i1\u007fR\u0004\\\u001f\u0018g@\u0006\u0006\u0007a0.Z΅IĬ3{\u0019фg=EaQ-1q\u0012LTg|\u0006\u000fp\u0002p)̵Ḇr\u0018?*\u0017\u0016+Pr\u0010\u0004P\u0003d\u0003ҍOɟX\u0007\u0006ܱ˟$v"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#o*Dss8VQJx0\"\u001ewo(\u0014_*Tv4+TY32", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#o*Dss8VQJx0\"\u001ewo(\u0014_*Tv4\u001d", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#{*@|#8TJ;xBgrrjG\u0016p(R\u007f6%VW;i\\yD\u0014\u001f\u0019wW\t\u0017\u000egP1jH@.w7H}Jh\u007fi\u0012\u0015<gl@\\e", "BqP0^,Ka", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#\r-3k\u001c.ZQ\u0005ZA\u001a\u0013naF\u00159", "1`[9U(<Y", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#o*Dss8VQJx0\"\u001ewo\u0017\u0003j3Kr%M\"", "uKP;W9HW\u0018\u0012Dp6\n\u000fxi\b3\u0003\n~! U~\u001b8z.DgG/Di\u00144MPI5#+\u0011fg9\u0014q\u00025r0FYX0[e<O\u001e\u001f`WR3\u0018\f#?.wRF,\u00040R\u0011I2r\u0016#\u0014\u0013tyPe\u001dC}\u001e\u0005O\u0007dM`\\uEG\u001b&\u001b", "1n]@g9:W\"\u000eXh5\f\u00169l\u0007(\tN", "", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/E>\u000b %V|\n@\u007f4C#{*@|#8TJ;xBgrrjG\u0016p(R\u007f6%VW;i\\yD\u0014\u001f0", "uKP;W9HW\u0018\u0012Dp6\n\u000fxi\b3\u0003\n~! U~\u001b8z.DgG\u0012Az\u001c\fWLIzA\u001a\u0019qpGd_3Us#ER$\"CN{<!\u001c^\rat\u001f\u000ffGmrLB&Q*S\u000bIw\u000e\b\u001a\u0017Dx:@`\u0019V\u0007\u001f|H)uT#=\u0004POTo&h\u0015nzfCI1\u001ex \u001bu&qz", ")KP;W9HW\u0018\u0012Dp6\n\u000fxi\b3\u0003\n~! U~\u001b8z.DgG\u001eAv%;WJBkA,^FkB\u0015r9Jz0V*X5k_|D\u001b\u0012gc", ":nR8", "", "/qT\u000e_3\u001c]\"\r\nk(\u0001\u0012>sg(\u000b", "", "Ena8F7>Q|}", "", "=m2<a:M`\u0015\u0003\u0004m\u0014|\u0018", "", "Ena8F7>Q'", "", "\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9\u007fF\u0004+#d}\u001e\r", "=m2<a:M`\u0015\u0003\u0004m\u0015\u0007\u0018\u0017e\u000f", "@d_9T*>", "", "@db2g", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class WorkConstraintsTrackerImpl implements WorkConstraintsTracker, ConstraintController.OnConstraintUpdatedCallback {
    private final WorkConstraintsCallback callback;
    private final ConstraintController<?>[] constraintControllers;
    private final Object lock;

    public WorkConstraintsTrackerImpl(WorkConstraintsCallback workConstraintsCallback, ConstraintController<?>[] constraintControllers) {
        Intrinsics.checkNotNullParameter(constraintControllers, "constraintControllers");
        this.callback = workConstraintsCallback;
        this.constraintControllers = constraintControllers;
        this.lock = new Object();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTrackerImpl(Trackers trackers, WorkConstraintsCallback workConstraintsCallback) {
        this(workConstraintsCallback, (ConstraintController<?>[]) new ConstraintController[]{new BatteryChargingController(trackers.getBatteryChargingTracker()), new BatteryNotLowController(trackers.getBatteryNotLowTracker()), new StorageNotLowController(trackers.getStorageNotLowTracker()), new NetworkConnectedController(trackers.getNetworkStateTracker()), new NetworkUnmeteredController(trackers.getNetworkStateTracker()), new NetworkNotRoamingController(trackers.getNetworkStateTracker()), new NetworkMeteredController(trackers.getNetworkStateTracker())});
        Intrinsics.checkNotNullParameter(trackers, "trackers");
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsTracker
    public void replace(Iterable<WorkSpec> workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.lock) {
            for (ConstraintController<?> constraintController : this.constraintControllers) {
                constraintController.setCallback(null);
            }
            for (ConstraintController<?> constraintController2 : this.constraintControllers) {
                constraintController2.replace(workSpecs);
            }
            for (ConstraintController<?> constraintController3 : this.constraintControllers) {
                constraintController3.setCallback(this);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsTracker
    public void reset() {
        synchronized (this.lock) {
            for (ConstraintController<?> constraintController : this.constraintControllers) {
                constraintController.reset();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean areAllConstraintsMet(String workSpecId) {
        ConstraintController<?> constraintController;
        boolean z2;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.lock) {
            ConstraintController<?>[] constraintControllerArr = this.constraintControllers;
            int length = constraintControllerArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    constraintController = null;
                    break;
                }
                constraintController = constraintControllerArr[i2];
                if (constraintController.isWorkSpecConstrained(workSpecId)) {
                    break;
                }
                i2++;
            }
            if (constraintController != null) {
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "Work " + workSpecId + " constrained by " + constraintController.getClass().getSimpleName());
            }
            z2 = constraintController == null;
        }
        return z2;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback
    public void onConstraintMet(List<WorkSpec> workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.lock) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : workSpecs) {
                if (areAllConstraintsMet(((WorkSpec) obj).id)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Logger.get().debug(WorkConstraintsTrackerKt.TAG, "Constraints met for " + ((WorkSpec) it.next()));
            }
            WorkConstraintsCallback workConstraintsCallback = this.callback;
            if (workConstraintsCallback != null) {
                workConstraintsCallback.onAllConstraintsMet(arrayList2);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback
    public void onConstraintNotMet(List<WorkSpec> workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        synchronized (this.lock) {
            WorkConstraintsCallback workConstraintsCallback = this.callback;
            if (workConstraintsCallback != null) {
                workConstraintsCallback.onAllConstraintsNotMet(workSpecs);
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
