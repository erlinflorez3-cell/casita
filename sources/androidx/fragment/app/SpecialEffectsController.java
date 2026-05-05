package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import androidx.fragment.R;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: compiled from: SpecialEffectsController.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4D\u0007\":\u001b\u007f\u0007ljA0R\u0005P.hS2\u000fq{<$i$yّCU0}*ޛWN}gvϺb\u000bY\u000f\u000e\u0016~n4Ic\u0017e\u0012%2JoE5UoS9ht<\u000e&P8\u0600\u0018-1\u001aXGHw#luL\u001d@D~:j\r{\u0006ܨ\u0016\u0006L\"I<jsf6vy\u000e>=1\u001bip]Wc>\re\rteW\u0011\u0005s6+nJ{\u0015mg\u0011\u001bj[m\u0010ouK\u0013\u0001'U:yweHp\u007fB(s[\u001br\u000b&\u000b\u0012\u0002d\u001a9CO\u0012^\u0019\u001a6\u000e\u0013{;I4\u0012\u00149`.[-/\u0014\u001cJ\rr\u0002M\u0001\u0006lT\u0018z\u0010I_F\u000eKC9Is\u0002pI2fB\f\f\u001d#Q\u000bͼ%[Z)\u000f/KX\u0006mIQnC\u000frR]K\u000b\u001cp\u0011\u000fr\u0014>e\u00181\u0012\u0010\\!U;iX;!\u001a\"\u000fD0\u0007\u0013\u0002\u0001U\u007fQvJRr$VB\t:z\u000bdMo^vp,?ZdX\u0015! \u0013Ni@J/I(Peg\u0018{}a\u00187Gfel7o\u001c|Q^aB\u001ai\u001e\bjvBL\u0003bMdtik\f\tiX&@d\u0003\u0010&\u0002\u0015]\u001a\u0013J? \u001dٜ07!¢-J\t!PEM\u0015m_\u0001\u0010-Z\nɷ\u000fȐ(t\u0011ɖ!h~v\u007fxw2Sʣ.έEQ=ӧvg0pL\u00033\t\u000fs.Q\u0016U\u001eƅnטyU\u0004\u008df,G\\GC#\u0011\u000f)`\f[N#Ǭg˛Q\u0012/ϕ܉}:"}, d2 = {"\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chn\u000f", "", "1n]AT0GS&", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:]M\u000b'\"\u001d3~", "5dc\u0010b5MO\u001d\bzk", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\"\u000e!'RE", "7r2<a;:W\"~\bI6\u000b\u0018:o\t(z", "", "=oT?T;B]\"]~k,z\u00183o\t\f\n+\u000b\"", ">d]1\\5@=$~\bZ;\u0001\u00138s", "", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chnwpn,[r6KVW\u0002", "@t];\\5@=$~\bZ;\u0001\u00138s", "3m`BX<>", "", "4h]._\u001aMO(~", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chnwpn,[r6KVWjJanL\u0014g", ":hU2V@<Z\u0019b\u0003i(z\u0018", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chnwpn,[r6KVWjCVs=\u0012&X\u0015N\u000f\u0015\u0010U?3D", "4qP4`,Gb\u0007\u000evm,d\u00058a\u0002(\t", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.DG\r\u001cFm}*V?=kAs", "3m`BX<>/\u0018}", "3m`BX<>6\u001d}z", "3m`BX<>@\u0019\u0007\u0005o,", "3m`BX<>A\u001c\t\r", "3wT0h;>=$~\bZ;\u0001\u00138s", "=oT?T;B]\"\r", "", "\u001aj^A_0G\u001d\u001e\u0010\u0003(\u0011\u000e\u0011\u001du\u000b3\t@\u000f%\tKv\r:r24gS", "7r?<c", "3wT0h;>>\u0019\byb5~r:e\r$\u000bD\u000b %", "4h]1C,GR\u001d\b|H7|\u0016+t\u00042\u0005", "4qP4`,Gb", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "4h]1E<G\\\u001d\b|H7|\u0016+t\u00042\u0005", "4na0X\nH[$\u0006zm,X\u00106O\u000b(\t<\u0010\u001b!P}", "4na0X\u0017Ha(\n\u0005g,{hBe}8\u000b@k\u0017 Fs\u0017>`05fy/;w\u001f<", "5dc\u000ej(Bb\u001d\b|<6\u0005\u00146e\u000f,\u0006Ig\u001b\u0018Gm\":}%\u0019a\t\u001c5|", ";`a8C6Lb$\t\u0004^+j\u0018+t\u007f", "CoS.g,\u001fW\"z\u0002L;x\u0018/", "CoS.g,(^\u0019\fvm0\u0007\u0012\u000ei\r(yO\u0005! ", "\u0011n\\=T5B]\"", "\u0014qP4`,Gb\u0007\u000evm,d\u00058a\u0002(\t*\f\u0017$C~\u0012F\u007f", "\u001doT?T;B]\"", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class SpecialEffectsController {
    public static final Companion Companion = new Companion(null);
    private final ViewGroup container;
    private boolean isContainerPostponed;
    private boolean operationDirectionIsPop;
    private final List<Operation> pendingOperations;
    private final List<Operation> runningOperations;

    /* JADX INFO: compiled from: SpecialEffectsController.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[Operation.LifecycleImpact.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final SpecialEffectsController getOrCreateController(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return Companion.getOrCreateController(viewGroup, fragmentManager);
    }

    @JvmStatic
    public static final SpecialEffectsController getOrCreateController(ViewGroup viewGroup, SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        return Companion.getOrCreateController(viewGroup, specialEffectsControllerFactory);
    }

    public abstract void executeOperations(List<Operation> list, boolean z2);

    public SpecialEffectsController(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
        this.pendingOperations = new ArrayList();
        this.runningOperations = new ArrayList();
    }

    public final ViewGroup getContainer() {
        return this.container;
    }

    public final Operation.LifecycleImpact getAwaitingCompletionLifecycleImpact(FragmentStateManager fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        Fragment fragment = fragmentStateManager.getFragment();
        Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
        Operation operationFindPendingOperation = findPendingOperation(fragment);
        Operation.LifecycleImpact lifecycleImpact = operationFindPendingOperation != null ? operationFindPendingOperation.getLifecycleImpact() : null;
        Operation operationFindRunningOperation = findRunningOperation(fragment);
        Operation.LifecycleImpact lifecycleImpact2 = operationFindRunningOperation != null ? operationFindRunningOperation.getLifecycleImpact() : null;
        int i2 = lifecycleImpact == null ? -1 : WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
        return (i2 == -1 || i2 == 1) ? lifecycleImpact2 : lifecycleImpact;
    }

    private final Operation findPendingOperation(Fragment fragment) {
        Object next;
        Iterator<T> it = this.pendingOperations.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                Operation operation = (Operation) next;
                if (Intrinsics.areEqual(operation.getFragment(), fragment) && !operation.isCanceled()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (Operation) next;
    }

    private final Operation findRunningOperation(Fragment fragment) {
        Object next;
        Iterator<T> it = this.runningOperations.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                Operation operation = (Operation) next;
                if (Intrinsics.areEqual(operation.getFragment(), fragment) && !operation.isCanceled()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (Operation) next;
    }

    public final void enqueueAdd(Operation.State finalState, FragmentStateManager fragmentStateManager) {
        Intrinsics.checkNotNullParameter(finalState, "finalState");
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            String str = "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.getFragment();
        }
        enqueue(finalState, Operation.LifecycleImpact.ADDING, fragmentStateManager);
    }

    public final void enqueueShow(FragmentStateManager fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            String str = "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.getFragment();
        }
        enqueue(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void enqueueHide(FragmentStateManager fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            String str = "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.getFragment();
        }
        enqueue(Operation.State.GONE, Operation.LifecycleImpact.NONE, fragmentStateManager);
    }

    public final void enqueueRemove(FragmentStateManager fragmentStateManager) {
        Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
        if (FragmentManager.isLoggingEnabled(2)) {
            String str = "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.getFragment();
        }
        enqueue(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, fragmentStateManager);
    }

    private final void enqueue(Operation.State state, Operation.LifecycleImpact lifecycleImpact, FragmentStateManager fragmentStateManager) {
        synchronized (this.pendingOperations) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            Fragment fragment = fragmentStateManager.getFragment();
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            Operation operationFindPendingOperation = findPendingOperation(fragment);
            if (operationFindPendingOperation != null) {
                operationFindPendingOperation.mergeWith(state, lifecycleImpact);
                return;
            }
            final FragmentStateManagerOperation fragmentStateManagerOperation = new FragmentStateManagerOperation(state, lifecycleImpact, fragmentStateManager, cancellationSignal);
            this.pendingOperations.add(fragmentStateManagerOperation);
            fragmentStateManagerOperation.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.SpecialEffectsController$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    SpecialEffectsController.enqueue$lambda$4$lambda$2(this.f$0, fragmentStateManagerOperation);
                }
            });
            fragmentStateManagerOperation.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.SpecialEffectsController$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    SpecialEffectsController.enqueue$lambda$4$lambda$3(this.f$0, fragmentStateManagerOperation);
                }
            });
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$4$lambda$2(SpecialEffectsController this$0, FragmentStateManagerOperation operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        if (this$0.pendingOperations.contains(operation)) {
            Operation.State finalState = operation.getFinalState();
            View view = operation.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            finalState.applyState(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$4$lambda$3(SpecialEffectsController this$0, FragmentStateManagerOperation operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        this$0.pendingOperations.remove(operation);
        this$0.runningOperations.remove(operation);
    }

    public final void updateOperationDirection(boolean z2) {
        this.operationDirectionIsPop = z2;
    }

    public final void markPostponedState() {
        Operation operationPrevious;
        synchronized (this.pendingOperations) {
            updateFinalState();
            List<Operation> list = this.pendingOperations;
            ListIterator<Operation> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    operationPrevious = null;
                    break;
                }
                operationPrevious = listIterator.previous();
                Operation operation = operationPrevious;
                Operation.State.Companion companion = Operation.State.Companion;
                View view = operation.getFragment().mView;
                Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
                Operation.State stateAsOperationState = companion.asOperationState(view);
                if (operation.getFinalState() == Operation.State.VISIBLE && stateAsOperationState != Operation.State.VISIBLE) {
                    break;
                }
            }
            Operation operation2 = operationPrevious;
            Fragment fragment = operation2 != null ? operation2.getFragment() : null;
            this.isContainerPostponed = fragment != null ? fragment.isPostponed() : false;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void forcePostponedExecutePendingOperations() {
        if (this.isContainerPostponed) {
            if (FragmentManager.isLoggingEnabled(2)) {
            }
            this.isContainerPostponed = false;
            executePendingOperations();
        }
    }

    public final void executePendingOperations() {
        if (this.isContainerPostponed) {
            return;
        }
        if (!ViewCompat.isAttachedToWindow(this.container)) {
            forceCompleteAllOperations();
            this.operationDirectionIsPop = false;
            return;
        }
        synchronized (this.pendingOperations) {
            if (!this.pendingOperations.isEmpty()) {
                List<Operation> mutableList = CollectionsKt.toMutableList((Collection) this.runningOperations);
                this.runningOperations.clear();
                for (Operation operation : mutableList) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        String str = "SpecialEffectsController: Cancelling operation " + operation;
                    }
                    operation.cancel();
                    if (!operation.isComplete()) {
                        this.runningOperations.add(operation);
                    }
                }
                updateFinalState();
                List<Operation> mutableList2 = CollectionsKt.toMutableList((Collection) this.pendingOperations);
                this.pendingOperations.clear();
                this.runningOperations.addAll(mutableList2);
                if (FragmentManager.isLoggingEnabled(2)) {
                }
                Iterator<Operation> it = mutableList2.iterator();
                while (it.hasNext()) {
                    it.next().onStart();
                }
                executeOperations(mutableList2, this.operationDirectionIsPop);
                this.operationDirectionIsPop = false;
                if (FragmentManager.isLoggingEnabled(2)) {
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void forceCompleteAllOperations() {
        String str;
        String str2;
        if (FragmentManager.isLoggingEnabled(2)) {
        }
        boolean zIsAttachedToWindow = ViewCompat.isAttachedToWindow(this.container);
        synchronized (this.pendingOperations) {
            updateFinalState();
            Iterator<Operation> it = this.pendingOperations.iterator();
            while (it.hasNext()) {
                it.next().onStart();
            }
            for (Operation operation : CollectionsKt.toMutableList((Collection) this.runningOperations)) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    if (zIsAttachedToWindow) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.container + " is not attached to window. ";
                    }
                    String str3 = "SpecialEffectsController: " + str2 + "Cancelling running operation " + operation;
                }
                operation.cancel();
            }
            for (Operation operation2 : CollectionsKt.toMutableList((Collection) this.pendingOperations)) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    if (zIsAttachedToWindow) {
                        str = "";
                    } else {
                        str = "Container " + this.container + " is not attached to window. ";
                    }
                    String str4 = "SpecialEffectsController: " + str + "Cancelling pending operation " + operation2;
                }
                operation2.cancel();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void updateFinalState() {
        for (Operation operation : this.pendingOperations) {
            if (operation.getLifecycleImpact() == Operation.LifecycleImpact.ADDING) {
                View viewRequireView = operation.getFragment().requireView();
                Intrinsics.checkNotNullExpressionValue(viewRequireView, "fragment.requireView()");
                operation.mergeWith(Operation.State.Companion.from(viewRequireView.getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{BCc$\bCCU \u0003*\t]WogtPb\u000bQ0\u000eǝ\u0001j:I]xc\u0019\u00172P{G3SpCGvҚf\u0005N1Z8#/A=:L\u001ev\u0013Cy\r\"4NrRR;P\u0015\u001e \nV /#lk\\<`l\fAǥ'\u0003wJ\u00173mM\u0015M;d\u0005+\u001b\u0016y\u001eYK\u007f9#Ek\u00035p$E\u0011`\n=3\u0007m<sU\u0002yNX.2E/]0urTcM]n0?+}\u0002{T\u001cK\u0010z*\u0014\u0005\u0018\u001c+?H\\KJj\u0016\u000eKt!TpT\u0010`Z\u007f)d~\u001d3&K+g9-e*A'uO{35d7Q\u0001/dl\u0014p\u0017+T&\\_[\u0017׃Jݳ\u000eYEЧT\tp\u0002B\u0004^HV\u0082\b 2#-ڛs;)-y\u000fhFm\u0005\u0013o9bwV`@Psގ;0\u0011ȱrFj\u0015ya%t:%e\u001c\u0003\u001a.\f!2twj4cP%пtȬnSe܃=1lKg\u0004<*eOv3cd\u0014\u0014od\u000f\u0014mO!E/ٯNΐ\u0010`d̥:4N\u0001\u001e\rL\\\\\u000e+2mtrـ8֞\u001dh\u001dǽ\u001b HX\u000b!\u007f\\n)\rn\u00046\u0011\u0005<z\u0019\u0003`\\\u001fv\u0016\u0015 ؖ~˃&-Iٛڪ\u001dQ"}, d2 = {"\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chnwpn,[r6KVW\u0002", "", "4h]._\u001aMO(~", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chnwpn,[r6KVWjJanL\u0014g", ":hU2V@<Z\u0019b\u0003i(z\u0018", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chnwpn,[r6KVWjCVs=\u0012&X\u0015N\u000f\u0015\u0010U?3D", "4qP4`,Gb", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "1`]0X3EO(\u0003\u0005g\u001a\u0001\u000b8a\u0007", "\u001a`]1e6BR,Hxh9|R9sI\u0006wI~\u0017\u001eNk\u001d@\u0001.#]\u007f)3tk", "uKP;W9HW\u0018\u0012D_9x\u000b7e\t7E<\f\"`5z\u000e:z!<9~!7k%<+MDzA(\u001coaFEM7N\u0004#VPX5\u001b@\u00029#\u00120tJ4\f\u0012cE#\u0002\u000e8,\u0004.Q\u0002DwJ\b!\u0019~X{BT\u0014C\u0001tvB)fUg=\u0004PPRl1k\fl[FE:1\u0010\u0001\u001d%q\u000f\u0015\u000e|S\u000f\u0007P\u0001gKO$v63\u0014TWOD|_@s:hL\ts\u0014:X}:>)\u000f?s\u0017q\u0001Mo\u0018GmN{(e@40:;&\tIm\u0003l\b\u0018vh?\u0004\u0017`58 atgR\u0018ta\u0019d1h5D(", "1n\\=_,MW#\bab:\f\t8e\r6", "", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "5dc\u0013\\5:Z\u0007\u000evm,", "u(;.a+K]\u001d}\u000e(-\n\u00051m\u007f1\u000b\n|\"\"\u0011]\u0019<t)1`]!8m\u0014=[!EtC+\u001foh9\u0014\"\u0016Yv4C[R6e\u0011`L\u0010!Zc", "Adc\u0013\\5:Z\u0007\u000evm,", "uKP;W9HW\u0018\u0012D_9x\u000b7e\t7E<\f\"`5z\u000e:z!<9~!7k%<+MDzA(\u001coaFEM7N\u0004#VPX5\u001b@\u00029#\u00120Q?", "5dc\u0013e(@[\u0019\b\n", "u(;.a+K]\u001d}\u000e(-\n\u00051m\u007f1\u000b\n|\"\"\u0011P\u001b8x-5b\ru", "\nrTA \u0006\u0017", "", "7r2.a*>Z\u0019}", "u(I", "7r2<`7ES(~", "5dc\u0019\\->Q-|\u0002^\u0010\u0005\u0014+c\u000f", "u(;.a+K]\u001d}\u000e(-\n\u00051m\u007f1\u000b\n|\"\"\u0011]\u0019<t)1`]!8m\u0014=[!EtC+\u001foh9\u0014\"\u0016Yv4C[R6e\u0011YA\u0015\u0012X\"L2\rhaL lS\r", "Adc\u0019\\->Q-|\u0002^\u0010\u0005\u0014+c\u000f", "uKP;W9HW\u0018\u0012D_9x\u000b7e\t7E<\f\"`5z\u000e:z!<9~!7k%<+MDzA(\u001coaFEM7N\u0004#VPX5\u001b9v>\u0014\u0010n\fU+p\rd=\"}\u001az\u0010", "AoT0\\(E3\u001a\u007fz\\;\u000bv3g\t$\u0003N", "", "/cS\u0010b4IZ\u0019\u000e~h5c\r=t\u007f1{M", "", ":hbAX5>`", "1`]0X3", "1n\\=_,MS", "1n\\=_,MS\u0007\nz\\0x\u0010\u000ff\u0001(yO", "AhV;T3", ";`a8F;:`(~yL7|\u00073a\u0007\b|A\u0001\u0015&", ";da4X\u001eBb\u001c", "=mBAT9M", "BnBAe0GU", "", "\u001ahU2V@<Z\u0019b\u0003i(z\u0018", "!sPAX", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class Operation {
        private final List<Runnable> completionListeners;
        private State finalState;
        private final Fragment fragment;
        private boolean isCanceled;
        private boolean isComplete;
        private LifecycleImpact lifecycleImpact;
        private final Set<CancellationSignal> specialEffectsSignals;

        /* JADX INFO: compiled from: SpecialEffectsController.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0007Gً/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001͆\rS"}, d2 = {"\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chnwpn,[r6KVWjCVs=\u0012&X\u0015N\u000f\u0015\u0010U?3D", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001cN=\u0012", "\u000fC3\u0016A\u000e", " D<\u001cI\u0010'5", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: compiled from: SpecialEffectsController.kt */
        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[LifecycleImpact.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LifecycleImpact.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LifecycleImpact.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public void onStart() {
        }

        public Operation(State finalState, LifecycleImpact lifecycleImpact, Fragment fragment, CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            this.finalState = finalState;
            this.lifecycleImpact = lifecycleImpact;
            this.fragment = fragment;
            this.completionListeners = new ArrayList();
            this.specialEffectsSignals = new LinkedHashSet();
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.SpecialEffectsController$Operation$$ExternalSyntheticLambda0
                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    SpecialEffectsController.Operation._init_$lambda$0(this.f$0);
                }
            });
        }

        public final State getFinalState() {
            return this.finalState;
        }

        public final void setFinalState(State state) {
            Intrinsics.checkNotNullParameter(state, "<set-?>");
            this.finalState = state;
        }

        public final LifecycleImpact getLifecycleImpact() {
            return this.lifecycleImpact;
        }

        public final void setLifecycleImpact(LifecycleImpact lifecycleImpact) {
            Intrinsics.checkNotNullParameter(lifecycleImpact, "<set-?>");
            this.lifecycleImpact = lifecycleImpact;
        }

        public final Fragment getFragment() {
            return this.fragment;
        }

        /* JADX INFO: compiled from: SpecialEffectsController.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eRLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ln?ӅC{߉L[\u00040\u001fm\f4RӋRp{:^Z\u0003(\tҊRgun\u0013f\u0019D'\u0006Dz\u001b0WX\u0011]@\u0013\u001bBuD\u001cMuC\"`z=m 8*ة}\u000f"}, d2 = {"\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chnwpn,[r6KVWjJanL\u0014g", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "/o_9l\u001aMO(~", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", " D<\u001cI\f\u001d", "$HB\u00165\u0013\u001e", "\u0015N=\u0012", "\u0017ME\u0016F\u0010\u001b:x", "\u0011n\\=T5B]\"", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static final Companion Companion = new Companion(null);

            /* JADX INFO: compiled from: SpecialEffectsController.kt */
            @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @JvmStatic
            public static final State from(int i2) {
                return Companion.from(i2);
            }

            public final void applyState(View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
                if (i2 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            String str = "SpecialEffectsController: Removing view " + view + " from container " + viewGroup;
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i2 == 2) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        String str2 = "SpecialEffectsController: Setting view " + view + " to VISIBLE";
                    }
                    view.setVisibility(0);
                } else if (i2 == 3) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        String str3 = "SpecialEffectsController: Setting view " + view + " to GONE";
                    }
                    view.setVisibility(8);
                } else {
                    if (i2 != 4) {
                        return;
                    }
                    if (FragmentManager.isLoggingEnabled(2)) {
                        String str4 = "SpecialEffectsController: Setting view " + view + " to INVISIBLE";
                    }
                    view.setVisibility(4);
                }
            }

            /* JADX INFO: compiled from: SpecialEffectsController.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0018\u007fјnjO0L͜N\u0093Siճ?k*3d`*qٴ?U(}j\u0017]O\u007fg\u001dL\u000b\u000fQ\u0012\u001e\u0016'nrN\u001e\u0001k\u0017'2pqg3{u\u07b2=g"}, d2 = {"\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chnwpn,[r6KVWjJanL\u0014P8\u0018V6\t\u000e]K-D", "", "u(E", "4q^:", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chnwpn,[r6KVWjJanL\u0014g", "Dhb6U0EW(\u0013", "", "/r>=X9:b\u001d\t\u0004L;x\u0018/", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final State asOperationState(View view) {
                    Intrinsics.checkNotNullParameter(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? State.INVISIBLE : from(view.getVisibility());
                }

                @JvmStatic
                public final State from(int i2) {
                    if (i2 == 0) {
                        return State.VISIBLE;
                    }
                    if (i2 == 4) {
                        return State.INVISIBLE;
                    }
                    if (i2 == 8) {
                        return State.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i2);
                }
            }
        }

        public final boolean isCanceled() {
            return this.isCanceled;
        }

        public final boolean isComplete() {
            return this.isComplete;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(Operation this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.cancel();
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.finalState + " lifecycleImpact = " + this.lifecycleImpact + " fragment = " + this.fragment + AbstractJsonLexerKt.END_OBJ;
        }

        public final void cancel() {
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            if (this.specialEffectsSignals.isEmpty()) {
                complete();
                return;
            }
            Iterator it = CollectionsKt.toMutableSet(this.specialEffectsSignals).iterator();
            while (it.hasNext()) {
                ((CancellationSignal) it.next()).cancel();
            }
        }

        public final void mergeWith(State finalState, LifecycleImpact lifecycleImpact) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            int i2 = WhenMappings.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
            if (i2 == 1) {
                if (this.finalState == State.REMOVED) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        String str = "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.lifecycleImpact + " to ADDING.";
                    }
                    this.finalState = State.VISIBLE;
                    this.lifecycleImpact = LifecycleImpact.ADDING;
                    return;
                }
                return;
            }
            if (i2 == 2) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    String str2 = "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> REMOVED. mLifecycleImpact  = " + this.lifecycleImpact + " to REMOVING.";
                }
                this.finalState = State.REMOVED;
                this.lifecycleImpact = LifecycleImpact.REMOVING;
                return;
            }
            if (i2 == 3 && this.finalState != State.REMOVED) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    String str3 = "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> " + finalState + '.';
                }
                this.finalState = finalState;
            }
        }

        public final void addCompletionListener(Runnable listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.completionListeners.add(listener);
        }

        public final void markStartedSpecialEffect(CancellationSignal signal) {
            Intrinsics.checkNotNullParameter(signal, "signal");
            onStart();
            this.specialEffectsSignals.add(signal);
        }

        public final void completeSpecialEffect(CancellationSignal signal) {
            Intrinsics.checkNotNullParameter(signal, "signal");
            if (this.specialEffectsSignals.remove(signal) && this.specialEffectsSignals.isEmpty()) {
                complete();
            }
        }

        public void complete() {
            if (this.isComplete) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                String str = "SpecialEffectsController: " + this + " has called complete.";
            }
            this.isComplete = true;
            Iterator<T> it = this.completionListeners.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: SpecialEffectsController.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{B$c$wCAU0ԂR\t}M(\u000b~Nh\u000b[\u000f4\u0017\tn:Kmx\f\u0015\u001f6PsW3{tM=nzN\u0005N9ŕ<y\u0013\tb0V\u0019\u000fzqUR&xF~Ej\r{\u000f`&VJ.\u00056\\\u0016S\rԢnҺ>/+ɅݬFZ"}, d2 = {"\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chnwgp(P~'P[<;Xar%\u0010\u001bV\u0010N8v\u0010YN }HA(]", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chnwpn,[r6KVW\u0002", "4h]._\u001aMO(~", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chnwpn,[r6KVWjJanL\u0014g", ":hU2V@<Z\u0019b\u0003i(z\u0018", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chnwpn,[r6KVWjCVs=\u0012&X\u0015N\u000f\u0015\u0010U?3D", "4qP4`,Gb\u0007\u000evm,d\u00058a\u0002(\t", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.DG\r\u001cFm}*V?=kAs", "1`]0X3EO(\u0003\u0005g\u001a\u0001\u000b8a\u0007", "\u001a`]1e6BR,Hxh9|R9sI\u0006wI~\u0017\u001eNk\u001d@\u0001.#]\u007f)3tk", "uKP;W9HW\u0018\u0012D_9x\u000b7e\t7E<\f\"`5z\u000e:z!<9~!7k%<+MDzA(\u001coaFEM7N\u0004#VPX5\u001b@\u00029#\u00120tJ4\f\u0012cE#\u0002\u000e8,\u0004.Q\u0002DwJ\b!\u0019~X{BT\u0014C\u0001tvB)fUg=\u0004PPRl1k\fl[FE:1\u0010\u0001\u001d%q\u000f\u0015\u000e|S\u000f\u0007P\u0001gKO$v63\u0014TWOD|_@s:hL\ts\u0014:X}:>)\u000f?s\u0017q\u0001Mo\u0018Gmf$(kA\u000f\"?8\u0015?X9\\hG\ru)e\u0007!,3;&e/mVXdY Y5hf|FV\u0010G7s\u00170B\u0006\u0018\u001fj", "1n\\=_,MS", "", "=mBAT9M", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class FragmentStateManagerOperation extends Operation {
        private final FragmentStateManager fragmentStateManager;

        /* JADX WARN: Illegal instructions before constructor call */
        public FragmentStateManagerOperation(Operation.State finalState, Operation.LifecycleImpact lifecycleImpact, FragmentStateManager fragmentStateManager, CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(finalState, "finalState");
            Intrinsics.checkNotNullParameter(lifecycleImpact, "lifecycleImpact");
            Intrinsics.checkNotNullParameter(fragmentStateManager, "fragmentStateManager");
            Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            Fragment fragment = fragmentStateManager.getFragment();
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, fragment, cancellationSignal);
            this.fragmentStateManager = fragmentStateManager;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void onStart() {
            if (getLifecycleImpact() == Operation.LifecycleImpact.ADDING) {
                Fragment fragment = this.fragmentStateManager.getFragment();
                Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
                View viewFindFocus = fragment.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        String str = "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment;
                    }
                }
                View viewRequireView = getFragment().requireView();
                Intrinsics.checkNotNullExpressionValue(viewRequireView, "this.fragment.requireView()");
                if (viewRequireView.getParent() == null) {
                    this.fragmentStateManager.addViewToContainer();
                    viewRequireView.setAlpha(0.0f);
                }
                if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                    viewRequireView.setVisibility(4);
                }
                viewRequireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
                return;
            }
            if (getLifecycleImpact() == Operation.LifecycleImpact.REMOVING) {
                Fragment fragment2 = this.fragmentStateManager.getFragment();
                Intrinsics.checkNotNullExpressionValue(fragment2, "fragmentStateManager.fragment");
                View viewRequireView2 = fragment2.requireView();
                Intrinsics.checkNotNullExpressionValue(viewRequireView2, "fragment.requireView()");
                if (FragmentManager.isLoggingEnabled(2)) {
                    String str2 = "Clearing focus " + viewRequireView2.findFocus() + " on view " + viewRequireView2 + " for Fragment " + fragment2;
                }
                viewRequireView2.clearFocus();
            }
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public void complete() {
            super.complete();
            this.fragmentStateManager.moveToExpectedState();
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şqڛ5:ӋTqq:\u0016\u001f\u0004\"\u07beSNug7`h\f[\u000f4\u0018)n:Lmx\f\u0016?6PtW3{u\u0004>)\u000bD\u000682P:*\t\u000f\u001dBH>z+GY\u0013*0nx\u0001WұQ\u000e"}, d2 = {"\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chnwdm4Yr0KVW\u0002", "", "u(E", "5dc\u001ce\nKS\u0015\u000ez<6\u0006\u0018<o\u0007/{M", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chn\u000f", "1n]AT0GS&", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "4qP4`,Gb\u0001z\u0004Z.|\u0016", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.DAy)3o\u0016;#", "4`RAb9R", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chn\u001a\u0003a;X\u0004;\u001d", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SpecialEffectsController getOrCreateController(ViewGroup container, FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            SpecialEffectsControllerFactory specialEffectsControllerFactory = fragmentManager.getSpecialEffectsControllerFactory();
            Intrinsics.checkNotNullExpressionValue(specialEffectsControllerFactory, "fragmentManager.specialEffectsControllerFactory");
            return getOrCreateController(container, specialEffectsControllerFactory);
        }

        @JvmStatic
        public final SpecialEffectsController getOrCreateController(ViewGroup container, SpecialEffectsControllerFactory factory) {
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Object tag = container.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof SpecialEffectsController) {
                return (SpecialEffectsController) tag;
            }
            SpecialEffectsController specialEffectsControllerCreateController = factory.createController(container);
            Intrinsics.checkNotNullExpressionValue(specialEffectsControllerCreateController, "factory.createController(container)");
            container.setTag(R.id.special_effects_controller_view_tag, specialEffectsControllerCreateController);
            return specialEffectsControllerCreateController;
        }
    }
}
