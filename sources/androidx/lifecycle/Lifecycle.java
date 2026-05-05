package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.atomic.AtomicReference;
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
/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nj?1Le^.ZS@\u000fs{:(c$\u007fCC٥\"}8\tWNmitnpŏs\u000f4\u00151jB`\u0016{ٕ\u0016\u000f@B8MA^\b=gr%:\u00133J\"f\u000eK&b8V%\u000fzq]<\u0016>S\t:\u0001!\u0014*j$\u0014?8\u0001L^\u001e4\rՆnҺ>3;\u0005oE\\+0H\u000bR%Ld)\u001dv\u0010 YFm\nkȃUΫ\u000bVsA\tF\u007fEU553C]\u0004[FZ\u0016\u0013C*}\u0017Fz6`\u0015Sv\u000bU*.n{h\u001c1\u0010\u000f\f\u0011L\u0006$\u0005UG\\7\u0003n\u0018\u0012Cv\tRnO`ixE9'\rЕ1ő77Aӕ~SgH'\\W}\u000b\u001c,3ѐr9"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvz", "", "u(E", "1ta?X5MA(z\n^", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc#hy/7C", "5dc\u0010h9KS\"\u000ehm(\f\t", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J}\u001bHo\fPt,5\u0018k/3|\u0016\u0004", "1ta?X5MA(z\n^\r\u0004\u0013A", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011]\u001d8\u0006%\u0016`\b2\r", "5dc\u0010h9KS\"\u000ehm(\f\t\u0010l\n:", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0018\u001eQ\u0002W*\u0006!DY^'A\u007fk", "\nrTA \u0006\u0017", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Z\u0016/MP;t2\u001ej", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E\u001c\u0010!\u001fKmz<w%BY\u0007\u001e7C", "7mc2e5:Z\u0007|\u0005i,i\t0", "5dc\u0016a;>`\"z\u0002L*\u0007\u0014/R\u007f)", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`C~\u0018Dz#~5\r*?q\u0014\u001bMD;x4'\u0013h7", "Adc\u0016a;>`\"z\u0002L*\u0007\u0014/R\u007f)", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`\u0013Vy\u0016@tn\u0011h\b(;k\u0003.NCHk=\u001c\u0015>%*", "/cS\u001cU:>`*~\b", "", "=ab2e=>`", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000f2g}-Hm#\u0004", "@d\\<i,(P'~\bo,\n", "\u0013uT;g", "!sPAX", ":hU2V@<Z\u0019Fxh4\u0005\u00138"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class Lifecycle {
    private AtomicReference<Object> internalScopeRef = new AtomicReference<>(null);

    public abstract void addObserver(LifecycleObserver lifecycleObserver);

    public abstract State getCurrentState();

    public abstract void removeObserver(LifecycleObserver lifecycleObserver);

    public final AtomicReference<Object> getInternalScopeRef() {
        return this.internalScopeRef;
    }

    public final void setInternalScopeRef(AtomicReference<Object> atomicReference) {
        Intrinsics.checkNotNullParameter(atomicReference, "<set-?>");
        this.internalScopeRef = atomicReference;
    }

    public StateFlow<State> getCurrentStateFlow() {
        final MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(getCurrentState());
        addObserver(new LifecycleEventObserver() { // from class: androidx.lifecycle.Lifecycle$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Lifecycle._get_currentStateFlow_$lambda$0(MutableStateFlow, lifecycleOwner, event);
            }
        });
        return FlowKt.asStateFlow(MutableStateFlow);
    }

    public static final void _get_currentStateFlow_$lambda$0(MutableStateFlow mutableStateFlow, LifecycleOwner lifecycleOwner, Event event) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "$mutableStateFlow");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        mutableStateFlow.setValue(event.getTargetState());
    }

    /* JADX INFO: compiled from: Lifecycle.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eRLcz\u0004I\u0006F\u000b6B\u0005+2ߡv\u001d߿\tE`JuJ>R\u0002ճ=j430\u001c)wCтY\u001a\f\"Y^\\h\u007fnx\\A\bǇ\n\u001a\u0011l2Lc|F\u0012\u00157+oE96oC@It<\r\t2(Ab\u0005\u0007$\u0013H\u0016\u0002ڂGX"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc\u0015j})FC", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "B`a4X;,b\u0015\u000ez", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc#hy/7C", "5dc!T9@S(l\nZ;|", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J}\u001bHo\fPt,5\u0018k/3|\u0016\u0004", "\u001dMN\u0010E\f\u001aBx", "\u001dMN G\b+B", "\u001dMN\u001f8\u001a.;x", "\u001dMN\u001d4\u001c,3", "\u001dMN G\u0016)", "\u001dMN\u00118\u001a-@\u0003r", "\u001dMN\u000eA ", "\u0011n\\=T5B]\"", ":hU2V@<Z\u0019Fxh4\u0005\u00138"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum Event {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final Companion Companion = new Companion(null);

        /* JADX INFO: compiled from: Lifecycle.kt */
        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Event.values().length];
                try {
                    iArr[Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Event.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Event.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Event.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Event.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Event.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @JvmStatic
        public static final Event downFrom(State state) {
            return Companion.downFrom(state);
        }

        @JvmStatic
        public static final Event downTo(State state) {
            return Companion.downTo(state);
        }

        @JvmStatic
        public static final Event upFrom(State state) {
            return Companion.upFrom(state);
        }

        @JvmStatic
        public static final Event upTo(State state) {
            return Companion.upTo(state);
        }

        public final State getTargetState() {
            switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
                case 1:
                case 2:
                    return State.CREATED;
                case 3:
                case 4:
                    return State.STARTED;
                case 5:
                    return State.RESUMED;
                case 6:
                    return State.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }

        /* JADX INFO: compiled from: Lifecycle.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ll?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\u0004e(~:\u000beM\u0016i\u001fNh\u000e[\u000f4\u001a?otYc}u\u0014%1pqo7[rU9\u000fx|\nhB0>\u0012\u0007\u0017\u0019XJ@z\tFc\f@4\u0007u\u0003b\u001bT\u001d\u001c(\u0005l\"1\"jjf6vp$?ǫ'\u000b"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc\u0015j})F,s8UN7t8(\u001e>", "", "u(E", "2nf;99H[", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc\u0015j})FC", "AsPAX", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc#hy/7C", "2nf;G6", "Co5?b4", "CoC<", ":hU2V@<Z\u0019Fxh4\u0005\u00138"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {

            /* JADX INFO: compiled from: Lifecycle.kt */
            @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[State.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[State.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[State.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[State.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[State.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Event downFrom(State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i2 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i2 == 1) {
                    return Event.ON_DESTROY;
                }
                if (i2 == 2) {
                    return Event.ON_STOP;
                }
                if (i2 != 3) {
                    return null;
                }
                return Event.ON_PAUSE;
            }

            @JvmStatic
            public final Event downTo(State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i2 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i2 == 1) {
                    return Event.ON_STOP;
                }
                if (i2 == 2) {
                    return Event.ON_PAUSE;
                }
                if (i2 != 4) {
                    return null;
                }
                return Event.ON_DESTROY;
            }

            @JvmStatic
            public final Event upFrom(State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i2 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i2 == 1) {
                    return Event.ON_START;
                }
                if (i2 == 2) {
                    return Event.ON_RESUME;
                }
                if (i2 != 5) {
                    return null;
                }
                return Event.ON_CREATE;
            }

            @JvmStatic
            public final Event upTo(State state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i2 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                if (i2 == 1) {
                    return Event.ON_CREATE;
                }
                if (i2 == 2) {
                    return Event.ON_START;
                }
                if (i2 != 3) {
                    return null;
                }
                return Event.ON_RESUME;
            }
        }
    }

    /* JADX INFO: compiled from: Lifecycle.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eRLcz\u0004I\u0006>\u00146B\u0005'2ߡv\u001d߿\u001b?@FuH\\ɟ\u0002)Op\u00024ż_$\u007fC\u0004a(~:\t}P\u0018k|Mr\u000bqƤn\u0016~n\u0015I[}F\u0012\u00158+oE:6oCAƄx?"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc#hy/7C", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "7r0A?,:a(", "", "AsPAX", "\u0012DB!E\u001623w", "\u0017M8!<\b%7\u000e^Y", "\u0011Q4\u000eG\f\u001d", "!S0\u001fG\f\u001d", " DB\"@\f\u001d", ":hU2V@<Z\u0019Fxh4\u0005\u00138"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return compareTo(state) >= 0;
        }
    }
}
