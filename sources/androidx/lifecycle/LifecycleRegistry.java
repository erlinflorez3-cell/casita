package androidx.lifecycle;

import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
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
/* JADX INFO: compiled from: LifecycleRegistry.jvm.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007f\u0007ljA0ZeP.hS2şs{B*c$wHCU0}*\tURog\u0005Jb\u000bI\u0012\u000e\u0016\u000fj4Ikxe\u0012%2JģG3coE9vt>ӌ(208\u0002\u0005\u0007\u001d2H\u001e\u0003\u0003CQ\r\u001a0VpBR\u0013U\u000b.(ß\\X1\u001e\u000bf\u00076\u0001&\u001eG57\u0013mPN?_^}֔\u0011Fb)M\fg\u001e;DE5-%\u0002\u0004\u0017ViB\u001b? Aݾl'50\u0012\u0002e[p\u007fB;[S\u001b\u0005\u000b&\u000b%\u0018tT59w{K~4X{\t\u0014%<2\u000fL'\u0011<;C~\b<;%vagh\u0002\rbFz*D%O\u00183Y_Kj_\rS\u0019|cB\u0005U,1.\u0007!\nz>d#3lw\u007f2\u0018@\u0006V\\8q=\u001c*!f\u0010Y\u001c0u0u\u0010Y<%VO[gIQo\u0010S\\g%\r'}\u001cw`zX\"\u001d<g.\u0017?rD\u0013\r2P\u001d^:Ee\u001c\u0003-D\b[.j-T!S6~Svt\u0003M\f\u0012k//Eg%\u0004\u000e\u0006_\u000f7Cx{\u0010\u0010r=(\bBp<pfpyRZ-:08`p y\fD|\u0014A9\u0016ڧ\u001eٜ01!¢eT\u0011'ZA+\u00136ʶtʐ\u0003T;ɴS\f2\u0001!\u0001~d!su\u0004a,+hX\u0002\u007f&\fӾ2Ɓ&rL~)\u0014\r\u0002 Im[U\\=.\u0004f\u0014&&\u001cIQ]EA!5}\tğ/։Pv}SS%5\u000fM\u0006\u001d>\u0001.\u0016\fAѴ.߯nJWܷg.\u0005s\u000b#6hVכmâ~GkҺ[mL_\u000b\u0003\b@\u0005xSā!Ǫ)\u0005\b$\u0003K;Zw/$\u0010,5%cmi\u001e/({eձvФ\b,kܞ@n_wJ;fM0˝Jѐ(l\u000bܩ\u0019|\u0006#Z\tb\u0017i\u001d\u0018уrެ<Q#1\u0004\u0003\u0015I]\tdyR\u001f\u007f\u007fD.\u000eJ\u0004E\u000e\u0014\rdS0$όsƽqKd֥\u001b+\u0018-\u0014A~\u0014,=N^\u0006\u0006q6\u0016u(6oCA)\u0013ʂ0Ҭ0<\u0010Ձ\u0014`w\u0011(z.N6ʘ#ЋFsCٙվX3"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u00125[\u0002.Fz*\u0004", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvz", ">q^C\\+>`", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%\u001fk\u0007 DCY\u001f", "3mU<e*>;\u0015\u0003\u0004M/\n\t+d", "", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%\u001fk\u0007 DC\u000bq>", "-bd?e,Gb\u0007\u000evm,]\u00109w", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011W\u001eKr\"<Yk/3|\u0016\u000fTMMA", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc#hy/7C", "/cS6a.(P'~\bo,\nf9u\t7{M", "", "AsPAX", "1ta?X5MA(z\n^", "5dc\u0010h9KS\"\u000ehm(\f\t", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J}\u001bHo\fPt,5\u0018k/3|\u0016\u0004", "Adc\u0010h9KS\"\u000ehm(\f\t", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%sG\r\u001cFmkq>", "1ta?X5MA(z\n^\r\u0004\u0013A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u001d8\u0006%\u0016`\b2\r", "5dc\u0010h9KS\"\u000ehm(\f\t\u0010l\n:", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0018\u001eQ\u0002W*\u0006!DY^'A\u007fk", "6`]1_0GUx\u0010zg;", "7rBFa*>R", "u(I", ":hU2V@<Z\u0019h\rg,\n", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "<df\u0012i,Gb\u0003|xn9\n\t.", "=ab2e=>`v\t\u000bg;", "5dc\u001cU:>`*~\b<6\r\u0012>", "u(8", "=ab2e=>`\u0001z\u0006", "\u001a`]1e6BR,Hvk*\u007fR-o\r(ED\n&\u0017Tx\nC@\u00061g\r\u000e3n\u0016\u0012\\CHg1%\u0015P]D\\", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000f2g}-Hm#\u0004", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u00125[\u0002.Fz*l7@IkA/\u0015uS=\u0016f\u001a]r6G\"", ">`a2a;,b\u0015\u000ezl", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "/cS\u001cU:>`*~\b", "", "=ab2e=>`", "0`R8j(KR\u0004z\tl", "1`[0h3:b\u0019mvk.|\u0018\u001dt{7{", "3mU<e*>;\u0015\u0003\u0004M/\n\t+dc)d@\u0001\u0016\u0017F", ";dc5b+'O!~", "", "4naDT9=>\u0015\r\t", "6`]1_,%W\u001a~xr*\u0004\t\u000fv\u007f1\u000b", "3uT;g", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc\u0015j})FC", ";`a8F;:b\u0019", ";ne2G6,b\u0015\u000ez", "<dgA", ">n_\u001dT9>\\(l\nZ;|", ">tb5C(KS\"\u000ehm(\f\t", "@d\\<i,(P'~\bo,\n", "Ax]0", "\u0011n\\=T5B]\"", "\u001dab2e=>`\u000b\u0003\na\u001a\f\u0005>e", ":hU2V@<Z\u0019F\bn5\f\r7ey5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class LifecycleRegistry extends Lifecycle {
    public static final Companion Companion = new Companion(null);
    private final MutableStateFlow<Lifecycle.State> _currentStateFlow;
    private int addingObserverCounter;
    private final boolean enforceMainThread;
    private boolean handlingEvent;
    private final WeakReference<LifecycleOwner> lifecycleOwner;
    private boolean newEventOccurred;
    private FastSafeIterableMap<LifecycleObserver, ObserverWithState> observerMap;
    private ArrayList<Lifecycle.State> parentStates;
    private Lifecycle.State state;

    public /* synthetic */ LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycleOwner, z2);
    }

    @JvmStatic
    public static final LifecycleRegistry createUnsafe(LifecycleOwner lifecycleOwner) {
        return Companion.createUnsafe(lifecycleOwner);
    }

    private LifecycleRegistry(LifecycleOwner lifecycleOwner, boolean z2) {
        this.enforceMainThread = z2;
        this.observerMap = new FastSafeIterableMap<>();
        this.state = Lifecycle.State.INITIALIZED;
        this.parentStates = new ArrayList<>();
        this.lifecycleOwner = new WeakReference<>(lifecycleOwner);
        this._currentStateFlow = StateFlowKt.MutableStateFlow(Lifecycle.State.INITIALIZED);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LifecycleRegistry(LifecycleOwner provider) {
        this(provider, true);
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @Deprecated(message = "\u0012\\\u0001G\u0004}\u0019\\\u0018B+\u0010b'1\\p?\u001d(\u0019m\t ")
    @InterfaceC1492Gx
    public void markState(Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        enforceMainThreadIfNeeded("markState");
        setCurrentState(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public Lifecycle.State getCurrentState() {
        return this.state;
    }

    public void setCurrentState(Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        enforceMainThreadIfNeeded("setCurrentState");
        moveToState(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public StateFlow<Lifecycle.State> getCurrentStateFlow() {
        return FlowKt.asStateFlow(this._currentStateFlow);
    }

    public void handleLifecycleEvent(Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        enforceMainThreadIfNeeded("handleLifecycleEvent");
        moveToState(event.getTargetState());
    }

    private final void moveToState(Lifecycle.State state) {
        Lifecycle.State state2 = this.state;
        if (state2 == state) {
            return;
        }
        if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + state + ", but was " + this.state + " in component " + this.lifecycleOwner.get()).toString());
        }
        this.state = state;
        if (this.handlingEvent || this.addingObserverCounter != 0) {
            this.newEventOccurred = true;
            return;
        }
        this.handlingEvent = true;
        sync();
        this.handlingEvent = false;
        if (this.state == Lifecycle.State.DESTROYED) {
            this.observerMap = new FastSafeIterableMap<>();
        }
    }

    private final boolean isSynced() {
        if (this.observerMap.size() == 0) {
            return true;
        }
        Map.Entry<LifecycleObserver, ObserverWithState> entryEldest = this.observerMap.eldest();
        Intrinsics.checkNotNull(entryEldest);
        Lifecycle.State state = entryEldest.getValue().getState();
        Map.Entry<LifecycleObserver, ObserverWithState> entryNewest = this.observerMap.newest();
        Intrinsics.checkNotNull(entryNewest);
        Lifecycle.State state2 = entryNewest.getValue().getState();
        return state == state2 && this.state == state2;
    }

    private final Lifecycle.State calculateTargetState(LifecycleObserver lifecycleObserver) {
        ObserverWithState value;
        Map.Entry<LifecycleObserver, ObserverWithState> entryCeil = this.observerMap.ceil(lifecycleObserver);
        Lifecycle.State state = null;
        Lifecycle.State state2 = (entryCeil == null || (value = entryCeil.getValue()) == null) ? null : value.getState();
        if (!this.parentStates.isEmpty()) {
            state = this.parentStates.get(r1.size() - 1);
        }
        Companion companion = Companion;
        return companion.min$lifecycle_runtime_release(companion.min$lifecycle_runtime_release(this.state, state2), state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(LifecycleObserver observer) {
        LifecycleOwner lifecycleOwner;
        Intrinsics.checkNotNullParameter(observer, "observer");
        enforceMainThreadIfNeeded("addObserver");
        ObserverWithState observerWithState = new ObserverWithState(observer, this.state == Lifecycle.State.DESTROYED ? Lifecycle.State.DESTROYED : Lifecycle.State.INITIALIZED);
        if (this.observerMap.putIfAbsent(observer, observerWithState) == null && (lifecycleOwner = this.lifecycleOwner.get()) != null) {
            boolean z2 = this.addingObserverCounter != 0 || this.handlingEvent;
            Lifecycle.State stateCalculateTargetState = calculateTargetState(observer);
            this.addingObserverCounter++;
            while (observerWithState.getState().compareTo(stateCalculateTargetState) < 0 && this.observerMap.contains(observer)) {
                pushParentState(observerWithState.getState());
                Lifecycle.Event eventUpFrom = Lifecycle.Event.Companion.upFrom(observerWithState.getState());
                if (eventUpFrom == null) {
                    throw new IllegalStateException("no event up from " + observerWithState.getState());
                }
                observerWithState.dispatchEvent(lifecycleOwner, eventUpFrom);
                popParentState();
                stateCalculateTargetState = calculateTargetState(observer);
            }
            if (!z2) {
                sync();
            }
            this.addingObserverCounter--;
        }
    }

    private final void popParentState() {
        this.parentStates.remove(r1.size() - 1);
    }

    private final void pushParentState(Lifecycle.State state) {
        this.parentStates.add(state);
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(LifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        enforceMainThreadIfNeeded("removeObserver");
        this.observerMap.remove(observer);
    }

    public int getObserverCount() {
        enforceMainThreadIfNeeded("getObserverCount");
        return this.observerMap.size();
    }

    private final void forwardPass(LifecycleOwner lifecycleOwner) {
        SafeIterableMap<LifecycleObserver, ObserverWithState>.IteratorWithAdditions iteratorWithAdditions = this.observerMap.iteratorWithAdditions();
        Intrinsics.checkNotNullExpressionValue(iteratorWithAdditions, "observerMap.iteratorWithAdditions()");
        SafeIterableMap<LifecycleObserver, ObserverWithState>.IteratorWithAdditions iteratorWithAdditions2 = iteratorWithAdditions;
        while (iteratorWithAdditions2.hasNext() && !this.newEventOccurred) {
            Map.Entry next = iteratorWithAdditions2.next();
            LifecycleObserver lifecycleObserver = (LifecycleObserver) next.getKey();
            ObserverWithState observerWithState = (ObserverWithState) next.getValue();
            while (observerWithState.getState().compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.contains(lifecycleObserver)) {
                pushParentState(observerWithState.getState());
                Lifecycle.Event eventUpFrom = Lifecycle.Event.Companion.upFrom(observerWithState.getState());
                if (eventUpFrom == null) {
                    throw new IllegalStateException("no event up from " + observerWithState.getState());
                }
                observerWithState.dispatchEvent(lifecycleOwner, eventUpFrom);
                popParentState();
            }
        }
    }

    private final void backwardPass(LifecycleOwner lifecycleOwner) {
        Iterator<Map.Entry<LifecycleObserver, ObserverWithState>> itDescendingIterator = this.observerMap.descendingIterator();
        Intrinsics.checkNotNullExpressionValue(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.newEventOccurred) {
            Map.Entry<LifecycleObserver, ObserverWithState> next = itDescendingIterator.next();
            Intrinsics.checkNotNullExpressionValue(next, "next()");
            LifecycleObserver key = next.getKey();
            ObserverWithState value = next.getValue();
            while (value.getState().compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.contains(key)) {
                Lifecycle.Event eventDownFrom = Lifecycle.Event.Companion.downFrom(value.getState());
                if (eventDownFrom == null) {
                    throw new IllegalStateException("no event down from " + value.getState());
                }
                pushParentState(eventDownFrom.getTargetState());
                value.dispatchEvent(lifecycleOwner, eventDownFrom);
                popParentState();
            }
        }
    }

    private final void sync() {
        LifecycleOwner lifecycleOwner = this.lifecycleOwner.get();
        if (lifecycleOwner == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!isSynced()) {
            this.newEventOccurred = false;
            Lifecycle.State state = this.state;
            Map.Entry<LifecycleObserver, ObserverWithState> entryEldest = this.observerMap.eldest();
            Intrinsics.checkNotNull(entryEldest);
            if (state.compareTo(entryEldest.getValue().getState()) < 0) {
                backwardPass(lifecycleOwner);
            }
            Map.Entry<LifecycleObserver, ObserverWithState> entryNewest = this.observerMap.newest();
            if (!this.newEventOccurred && entryNewest != null && this.state.compareTo(entryNewest.getValue().getState()) > 0) {
                forwardPass(lifecycleOwner);
            }
        }
        this.newEventOccurred = false;
        this._currentStateFlow.setValue(getCurrentState());
    }

    private final void enforceMainThreadIfNeeded(String str) {
        if (this.enforceMainThread && !LifecycleRegistry_androidKt.isMainThread()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    /* JADX INFO: compiled from: LifecycleRegistry.jvm.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0LeN6ZS8\u000fsڔ<$q$yّCU0}*ޛUȞ}˧\u001fJ\t\n\u0004$\u0016\u001c\u0007jDKkw\f\u0013\u001f6PqW3{rެ=`\u0003:M6@2Py3\u0012J0V\"\u000f|YJ:%`D~Nj\r{\u001aj*\u0014C8\u0001Lb>\u07b5BՂpiBǂ;\u0005oI\\/\u007f2\u0003V\u001bP%?\u001b\u0002y\u001eYC\u000eߕ!ȏW\u000f\u000fѸsA\tK\u007fJ%j-59X־[L"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u00125[\u0002.Fz*l7@IkA/\u0015uS=\u0016f\u001a]r6G\"", "", "=ab2e=>`", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000f2g}-Hm#\u0004", "7mXA\\(EA(z\n^", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc#hy/7C", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%\u001fV\f D~\u0016;#*7t3+\u001fl`LPj0Ov%[JU,&9v>\u0014\u0010n\fU+Krh=3n\u001az\u0010", ":hU2V@<Z\u0019hwl,\n\u001a/r", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u0005FY\u0007/!j$.ZT;x\n", "5dc\u0019\\->Q-|\u0002^\u0016y\u0017/r\u0011(\t", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J}\u001bHo\fPt,59\u000f @|\u007f+[CH|4+j", "Adc\u0019\\->Q-|\u0002^\u0016y\u0017/r\u0011(\t", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%\u0015j})FW\u0013<MPLkAsXY", "AsPAX", "5dc g(MS", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J}\u001bHo\fPt,5\u0018k/3|\u0016\u0004", "Adc g(MS", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%sG\r\u001cFmkq>", "2hb=T;<Vx\u0010zg;", "", "=v]2e", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "3uT;g", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc\u0015j})FC", ":hU2V@<Z\u0019F\bn5\f\r7ey5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ObserverWithState {
        private LifecycleEventObserver lifecycleObserver;
        private Lifecycle.State state;

        public ObserverWithState(LifecycleObserver lifecycleObserver, Lifecycle.State initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.checkNotNull(lifecycleObserver);
            this.lifecycleObserver = Lifecycling.lifecycleEventObserver(lifecycleObserver);
            this.state = initialState;
        }

        public final Lifecycle.State getState() {
            return this.state;
        }

        public final void setState(Lifecycle.State state) {
            Intrinsics.checkNotNullParameter(state, "<set-?>");
            this.state = state;
        }

        public final LifecycleEventObserver getLifecycleObserver() {
            return this.lifecycleObserver;
        }

        public final void setLifecycleObserver(LifecycleEventObserver lifecycleEventObserver) {
            Intrinsics.checkNotNullParameter(lifecycleEventObserver, "<set-?>");
            this.lifecycleObserver = lifecycleEventObserver;
        }

        public final void dispatchEvent(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(event, "event");
            Lifecycle.State targetState = event.getTargetState();
            this.state = LifecycleRegistry.Companion.min$lifecycle_runtime_release(this.state, targetState);
            LifecycleEventObserver lifecycleEventObserver = this.lifecycleObserver;
            Intrinsics.checkNotNull(lifecycleOwner);
            lifecycleEventObserver.onStateChanged(lifecycleOwner, event);
            this.state = targetState;
        }
    }

    /* JADX INFO: compiled from: LifecycleRegistry.jvm.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN0Xݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018\\uh\u0007J\t\rs\u0013\u0014\u0019\u0011jZM\u001c}&/\u001d7Zom9}sK@xtd\u000bP80@\u0012\u0007\u0017\u0019XNVuټGK\u0012\u001bؼDz"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u00125[\u0002.Fz*l+MCv0'\u0019rj\u000f", "", "u(E", "1qT.g,.\\'z{^", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u00125[\u0002.Fz*\u0004", "=v]2e", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", ";h]", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc#hy/7C", "AsPAXw", "AsPAXx", ";h]p_0?S\u0017\u0013xe,v\u0016?n\u000f,\u0004@z$\u0017No\nJv", ":hU2V@<Z\u0019F\bn5\f\r7ey5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LifecycleRegistry createUnsafe(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new LifecycleRegistry(owner, false, null);
        }

        @JvmStatic
        public final Lifecycle.State min$lifecycle_runtime_release(Lifecycle.State state1, Lifecycle.State state) {
            Intrinsics.checkNotNullParameter(state1, "state1");
            return (state == null || state.compareTo(state1) >= 0) ? state1 : state;
        }
    }
}
