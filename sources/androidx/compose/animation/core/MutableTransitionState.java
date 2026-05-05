package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
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
/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&˛\bDZc|\u0004G\u000e8\u000b<K\u0007\"2\u0016\u007f\u0007tjAӄLe^.ZS0\u0011q\u0001Jř\u0004&wّITJ\u00042\u000b_N.f\u001dJ\u001b\u0016S\u0013\u0014\u0017\u0011jbկǤ|] \u0011z[}PKM\u001eOij\u0003I\u001d&B$Hy;ЏH>\u000f\u001eͯ~CQ!Z;N\u0007RR;_K(Ū\n>&\u0018n\u0006uRNH#җj31\u0006\u0002B\u0005ϋ\u0016\u0005;\u001ccЖå'˼zq&-F?C\u001e=U\t\f`a_\u0005ExK\u00079655as\u0006A\u000fDЏ\u0019/g\u000fc|4hUzn\u0019?+\u0006Ҫ{T\u001c+\u0010z2ȞrXLZ}ε͢-բj\u0018\u00165z\u0003aIh\u0004dP\u000e\u0001\u00028\u001d4\u000e5ڨ=3"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\bG|\u0012+TC*x0'#lp=\u0011l\u001a]r6G\"", "!", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\f$dp9\\", "7mXA\\(EA(z\n^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "\nrTA \u0006\u0017", "1ta?X5MA(z\n^", "5dc\u0010h9KS\"\u000ehm(\f\t", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc\u0010h9KS\"\u000ehm(\f\tma\t,\u0004<\u0010\u001b!Pi\fF\u0004%/f}'7i$.", "1ta?X5MA(z\n^j{\t6e\u0002$\u000b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "7r81_,", "", "u(I", "B`a4X;,b\u0015\u000ez", "5dc!T9@S(l\nZ;|", "Adc!T9@S(l\nZ;|", "B`a4X;,b\u0015\u000ez\u001d+|\u0010/g{7{", "BqP;f0MW#\bXh5}\r1u\r(z", "", "BqP;f0MW#\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=s", "BqP;f0MW#\bXh5}\r1u\r(z~| \u001bOk\u001d@\u0001./W\b-7g#.TC7y4", "BqP;f0MW#\bg^4\u0007\u001a/d", "BqP;f0MW#\bg^4\u0007\u001a/d>$\u0005D\t\u0013&Ky\u00176t/BYw-7t\u0016*[C", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableTransitionState<S> extends TransitionState<S> {
    public static final int $stable = 0;
    private final MutableState currentState$delegate;
    private final MutableState targetState$delegate;

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionConfigured$animation_core_release(Transition<S> transition) {
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionRemoved$animation_core_release() {
    }

    public MutableTransitionState(S s2) {
        super(null);
        this.currentState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s2, null, 2, null);
        this.targetState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s2, null, 2, null);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getCurrentState() {
        return (S) this.currentState$delegate.getValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setCurrentState$animation_core_release(S s2) {
        this.currentState$delegate.setValue(s2);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    /* JADX INFO: renamed from: setTargetState, reason: merged with bridge method [inline-methods] */
    public void setTargetState$animation_core_release(S s2) {
        this.targetState$delegate.setValue(s2);
    }

    public final boolean isIdle() {
        return Intrinsics.areEqual(getCurrentState(), getTargetState()) && !isRunning$animation_core_release();
    }
}
