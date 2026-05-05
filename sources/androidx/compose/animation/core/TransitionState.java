package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&˛\bDRш|\u0004G\u000b8\u000b<K\u0007\"2\u001b\u007f\u0007tjAӄLe^.ZS0\u0010s{J$c$\bCCU0}*ޛU\u0004}˧\u0017L`ŏQ\u000e6\u0016'jlN[zٕ\u0016\u000f@C8XA`\b=gt%@\u00135J(H{\u0015\u0001Pݒv&=\u0019ŲO\f\u0018G\t{Hj%M3.X$̧$\u0001$u8nDK\u0005]pǂS\u0007wDf'\u0016ܞ;,cЦ`ܮ\u0011\u0001y 1DE:5'Y\t\u0015Y,h\u0011H\n=3pW+9K\fWd`6RSi&Ֆƭr͉`\u0015Yb\u001259^{MV\u00186\u0003\u001b}\u0013H\u0012\u001bVGV>E\u001a\u001dڜ>7\u0003tk@\u0007\u061c\u001d!Vєmي\u001b/\u001851J)kqcA+\\>ީ\u0004\u000e8>\u001d\u0382%x"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\f$dp9\\", "!", "", "u(E", "\nrTA \u0006\u0017", "1ta?X5MA(z\n^", "5dc\u0010h9KS\"\u000ehm(\f\t", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc\u0010h9KS\"\u000ehm(\f\tma\t,\u0004<\u0010\u001b!Pi\fF\u0004%/f}'7i$.", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "", "7rABa5B\\\u001b", "7rABa5B\\\u001b=vg0\u0005\u0005>i\n1u>\u000b$\u0017A|\u000eCv!CY", "u(I", "Adc\u001fh5GW\"\u00019Z5\u0001\u0011+t\u00042\u0005:~!$Gi\u001b<}%1g}", "uY\u0018#", "7rABa5B\\\u001b=y^3|\u000b+t\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "B`a4X;,b\u0015\u000ez", "5dc!T9@S(l\nZ;|", "Adc!T9@S(l\nZ;|G+n\u00040wO\u0005! Am\u0018Iv\u001fBY\u0005 3{\u0016", "BqP;f0MW#\bXh5}\r1u\r(z", "", "BqP;f0MW#\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=s", "BqP;f0MW#\bXh5}\r1u\r(z~| \u001bOk\u001d@\u0001./W\b-7g#.TC7y4", "BqP;f0MW#\bg^4\u0007\u001a/d", "BqP;f0MW#\bg^4\u0007\u001a/d>$\u0005D\t\u0013&Ky\u00176t/BYw-7t\u0016*[C", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\bG|\u0012+TC*x0'#lp=\u0011l\u001a]r6G\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000bDm'.VR\u001b~7\u001a%vp=\u0018c\u001eQv06YJ5jV\u0002A\u001e\u001bH\u001dJ:\rZ", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000e7m\u001c*JJ;ZA\u001a\u001eveH\u000bm5<\u0006#VL$", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class TransitionState<S> {
    public static final int $stable = 0;
    private final MutableState isRunning$delegate;

    public /* synthetic */ TransitionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract S getCurrentState();

    public abstract S getTargetState();

    public abstract void setCurrentState$animation_core_release(S s2);

    public abstract void setTargetState$animation_core_release(S s2);

    public abstract void transitionConfigured$animation_core_release(Transition<S> transition);

    public abstract void transitionRemoved$animation_core_release();

    private TransitionState() {
        this.isRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isRunning$animation_core_release() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public final void setRunning$animation_core_release(boolean z2) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z2));
    }
}
