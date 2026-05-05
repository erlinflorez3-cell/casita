package com.swmansion.rnscreens.events;

import android.animation.Animator;
import com.swmansion.rnscreens.ScreenStackFragmentWrapper;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2şs{B$cҕyCQU\"}(\u000feȞ\u0006y\u001fJ\t\n{\u0010\u0017(\f+IYY\u0007]*\u000f`C\u007fEAO\b?O_#9\u0015$@&Py3\u0006ʀ.H\u001e|CQY\u0015*0nzjV\u001bX\u001d\u001a@\u0012\u00054I,jtf6vv\u000e>=.\u001bipZmsx\u000b[\u001b^TU\u0017'e,6X7c!kgK\u0015`jW\u0003m{m\tv2?+w\u007f\u001eJ!\u0006\"%CO;g9&-\u0011_d$'YT:֢Rˎ,w\u0003Ԉ]H\u0012\u0015\u001e'v6\u0004Ղrڿ\u00123|Ɂ$N^\u0004vD\u0016y\u00109mӞ\u0002Ĵ/9#Ƙ\"mI\u0019f7*\u0006c̗%ъr!c٪\u05fed)"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011o\u001f<\u007f4C#k\u001eDm\u00167)L?s0-\u0019rj\u0018\u0007j,Pr6G\"", "\u001a`]1e6BRbz\u0004b4x\u00183o\tqWI\u0005\u001f\u0013Vy\u001bzR.9ay/Az|2[R;t4+j", "EqP=c,K", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sv;IECk=-\u0007u]D\u0012c9$", "3uT;g\fFW(\u000ezk", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011o\u001f<\u007f4C#k\u001eDm\u00167-T;tC}\u001dlpH\u0007p\u0002", "/mX:T;B]\"m\u000fi,", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011o\u001f<\u007f4C#k\u001eDm\u00167)L?s0-\u0019rj\u0018\u0007j,Pr6G\u000b*5`ZnL\u0018\u001cc|b6\rZ", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{:\u0004%5bk/3k\u001c\u000fZ?=s4'$Zn5\u0012n,[L\u000eEVVujdz9\u001d ^\u0018Wt\u001a\u000eg?1nD@-Q,Z\u0002Dw\u000fU\u0004\fBjpK6!G\u0003$UI-wUYlO.?Ojsr\u001eg\u0019eH>.\u001d;&$vN;\n{\\\u001f<R\u000bgpV'D&\"Km[O!xYDp6#U\u0005V\u00129Xv'\u0004-B\u00103:l\u0001Zk\"GM\r ,2\u0005\u0018", "1ta?X5MA(z\n^", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011o\u001f<\u007f4C#k\u001eDm\u00167)L?s0-\u0019rj\u0018\u0007j,Pr6G\u000b50]RpQ\u0012\u0019Z{]'\u001c\u0005/", "=m0;\\4:b\u001d\t\u0004<(\u0006\u0007/l", "", "/mX:T;B]\"", "\u001a`]1e6BRbz\u0004b4x\u00183o\tqWI\u0005\u001f\u0013Vy\u001b\u0012", "=m0;\\4:b\u001d\t\u0004>5{", "=m0;\\4:b\u001d\t\u0004K,\b\t+t", "=m0;\\4:b\u001d\t\u0004L;x\u0016>", ">q^4e,La\u0007\u000evm,", "\u000fmX:T;B]\"m\u000fi,", "\u0011n\\=T5B]\"", "\u001ahU2V@<Z\u0019l\nZ;|", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ScreenAnimationDelegate implements Animator.AnimatorListener {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "ScreenEventDelegate";
    private final AnimationType animationType;
    private LifecycleState currentState;
    private final ScreenEventEmitter eventEmitter;
    private final ScreenStackFragmentWrapper wrapper;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0006Gָّ\u000bDȐ/(<\u0014\b\u0007\u0015ʑg/\u0005jN.ʂW*\u001dkd4*\\\rqI=ڎ\u001e\u0001"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011o\u001f<\u007f4C#k\u001eDm\u00167)L?s0-\u0019rj\u0018\u0007j,Pr6G\u000b*5`ZnL\u0018\u001cc|b6\rZ", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0013MC\u0012E", "\u0013W8!", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnimationType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AnimationType[] $VALUES;
        public static final AnimationType ENTER = new AnimationType("ENTER", 0);
        public static final AnimationType EXIT = new AnimationType("EXIT", 1);

        private static final /* synthetic */ AnimationType[] $values() {
            return new AnimationType[]{ENTER, EXIT};
        }

        static {
            AnimationType[] animationTypeArr$values = $values();
            $VALUES = animationTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(animationTypeArr$values);
        }

        private AnimationType(String str, int i2) {
        }

        public static EnumEntries<AnimationType> getEntries() {
            return $ENTRIES;
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011o\u001f<\u007f4C#k\u001eDm\u00167)L?s0-\u0019rj\u0018\u0007j,Pr6G\u000b,6d]nF\u0018\u001ccc", "", "u(E", "\"@6", "", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0007Gָٍ\u000bDȐ/(<\u0014\b\u0007\u0015ʑg/\u0005jN.ʂW*\u001dkd4*\\\rqI=>\u001a\u0004%߄SR"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011o\u001f<\u007f4C#k\u001eDm\u00167)L?s0-\u0019rj\u0018\u0007j,Pr6G\u000b50]RpQ\u0012\u0019Z{]'\u001c\u0005/", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0017M8!<\b%7\u000e^Y", "!S0\u001fG&\u001d7\u0007iVM\n_h\u000e", "\u0013M3,7\u0010,>tmXA\f[", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class LifecycleState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LifecycleState[] $VALUES;
        public static final LifecycleState INITIALIZED = new LifecycleState("INITIALIZED", 0);
        public static final LifecycleState START_DISPATCHED = new LifecycleState("START_DISPATCHED", 1);
        public static final LifecycleState END_DISPATCHED = new LifecycleState("END_DISPATCHED", 2);

        private static final /* synthetic */ LifecycleState[] $values() {
            return new LifecycleState[]{INITIALIZED, START_DISPATCHED, END_DISPATCHED};
        }

        static {
            LifecycleState[] lifecycleStateArr$values = $values();
            $VALUES = lifecycleStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(lifecycleStateArr$values);
        }

        private LifecycleState(String str, int i2) {
        }

        public static EnumEntries<LifecycleState> getEntries() {
            return $ENTRIES;
        }

        public static LifecycleState valueOf(String str) {
            return (LifecycleState) Enum.valueOf(LifecycleState.class, str);
        }

        public static LifecycleState[] values() {
            return (LifecycleState[]) $VALUES.clone();
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LifecycleState.values().length];
            try {
                iArr[LifecycleState.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LifecycleState.START_DISPATCHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LifecycleState.END_DISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AnimationType.values().length];
            try {
                iArr2[AnimationType.ENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AnimationType.EXIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ScreenAnimationDelegate(ScreenStackFragmentWrapper wrapper, ScreenEventEmitter screenEventEmitter, AnimationType animationType) {
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        this.wrapper = wrapper;
        this.eventEmitter = screenEventEmitter;
        this.animationType = animationType;
        this.currentState = LifecycleState.INITIALIZED;
    }

    private final void progressState() {
        LifecycleState lifecycleState;
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.currentState.ordinal()];
        if (i2 == 1) {
            lifecycleState = LifecycleState.START_DISPATCHED;
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            lifecycleState = LifecycleState.END_DISPATCHED;
        }
        this.currentState = lifecycleState;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        ScreenEventEmitter screenEventEmitter;
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (this.currentState == LifecycleState.START_DISPATCHED) {
            progressState();
            animation.removeListener(this);
            int i2 = WhenMappings.$EnumSwitchMapping$1[this.animationType.ordinal()];
            if (i2 == 1) {
                ScreenEventEmitter screenEventEmitter2 = this.eventEmitter;
                if (screenEventEmitter2 != null) {
                    screenEventEmitter2.dispatchOnAppear();
                }
            } else if (i2 == 2 && (screenEventEmitter = this.eventEmitter) != null) {
                screenEventEmitter.dispatchOnDisappear();
            }
            boolean z2 = this.animationType == AnimationType.EXIT;
            ScreenEventEmitter screenEventEmitter3 = this.eventEmitter;
            if (screenEventEmitter3 != null) {
                screenEventEmitter3.dispatchTransitionProgress(1.0f, z2, z2);
            }
            this.wrapper.getScreen().endRemovalTransition();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        ScreenEventEmitter screenEventEmitter;
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (this.currentState == LifecycleState.INITIALIZED) {
            progressState();
            int i2 = WhenMappings.$EnumSwitchMapping$1[this.animationType.ordinal()];
            if (i2 == 1) {
                ScreenEventEmitter screenEventEmitter2 = this.eventEmitter;
                if (screenEventEmitter2 != null) {
                    screenEventEmitter2.dispatchOnWillAppear();
                }
            } else if (i2 == 2 && (screenEventEmitter = this.eventEmitter) != null) {
                screenEventEmitter.dispatchOnWillDisappear();
            }
            boolean z2 = this.animationType == AnimationType.EXIT;
            ScreenEventEmitter screenEventEmitter3 = this.eventEmitter;
            if (screenEventEmitter3 != null) {
                screenEventEmitter3.dispatchTransitionProgress(0.0f, z2, z2);
            }
        }
    }
}
