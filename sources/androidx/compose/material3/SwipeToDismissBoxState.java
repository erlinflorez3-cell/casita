package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableDefaults;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: SwipeToDismissBox.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0RnP\u008cZS8\u0014s{J$c$wECU0}*\tU]og|Jb\u000bI\u0015\f\u001b\u000f̓Jp\u0006x\f\u0011G1i0\fCQ}=Q`#7\u0015$@$Py3\u0004*<N\u0010\u0005~[W\u001c\u0014@@\u001f;b\u000f]\u0005H\u00184C0 ,c\u007fiFY|lh7ݭ\u0007sHW7e6\u0007]\u000fLZM\u0018\u0007c.+n?c\u001aȏW\u0003\u0015^$S\u0011^\n=3\tW+9j\fWdYFϳSۣS\rk\u0015n`\u0013tx\fU3\u0018oYt&(&\u001bBȥzǬ\u0012\u00065mvA(\r \u000ea\u0015#WNm\u001a^p\u0001Aʯtа)\u007fAM\n3t^yA)PG{3\u000eL1W͚#ƟX\u0014hٽ3V}`?a\u0011LV_\"Ykn:5Ċ\u0006.\u001c2M\u0012=\u000fa@%'O[g&wǾ\u0004ҩHm~ݓxjY}`]\u00111|,O*7\r\u0011\t\u0081\tohV^C\u001f`lf\u0015\u0016 \u0013Nd.zwظ\u0012ʽSl\u0002lSv\u0018?\u007fuEt\u0007k<_o$ۋ9U{\u0012gn\u0005.\u0010Kp\"pfpTB\u001fڅ,&JJp.\u0006\u000fΒR4"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d79d}\u000fAL\u001a<UGIy\u0011((Vp5\u0016c\u0002", "", "7mXA\\(ED\u0015\u0006\u000b^", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d79d}\u000fAL\u001a<UGIy\u0011((Y]@\u0017c\u0002", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "1n]3\\9FD\u0015\u0006\u000b^\n\u007f\u00058g\u007f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", ">nb6g0H\\\u0015\u0006ia9|\u00172o\u0007'", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "Bnc._\u000bBa(z\u0004\\,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0013G]\t &wt2[K?yBz\u001f{R5\u000es,$]#PK[6`Q\u0006\u0007\u0012\u001cb\u0019X9\rNiEm~M;.Q\u000bI\u000bIl\u0010 kt;t\u007fIZ\u0019\u0011~&}\u000b*xOWn}QJS,\u000bt\u0015],`DCoiX\u001f%wW2\u0013EX\"z\u001czwpE(~B-L7<VNmd@~0j!?h", "/mR5b9>Rw\fv`.x\u00066em7wO\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\nVA>uA\u001e\u0014Gn5\te(K}'5[J;\\(", "5dc\u000ea*A]&~y=9x\u000b1a|/{.\u0010\u0013&G.\u00168\u0006%B]y'\u0005g#.TC7y4", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn9b\r Dv\u00125\u0017\u001fDi7(\"h`\u0018\u0014_.Pr$NL<;Xar\u0013", "1ta?X5MD\u0015\u0006\u000b^", "5dc\u0010h9KS\"\u000ekZ3\r\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn#k\u0002+7\\ \rQQCoB,qrt*\u0003j<NL", "5dc\u0011X5LW(\u00139f(\f\t<i{/I:\u000e\u0017\u001eGk\u001c<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "2hb:\\:L2\u001d\fz\\;\u0001\u00138", "5dc\u0011\\:FW'\rYb9|\u0007>i\n1", "=eU@X;", "5dc\u001cY-LS(=\u0003Z;|\u00163a\u0007uuM\u0001\u001e\u0017C}\u000e", "u(5", ">q^4e,La", "5dc\u001de6@`\u0019\r\t", "B`a4X;/O \u000fz", "5dc!T9@S(ove<|", "2hb:\\:L", "", "2ha2V;B]\"", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0013G]\t &wt2[K?yBz\u001f{R5\u000es,$]-Q[U0e\u001cpG!\u001cj\u001dR4\r\u0013#\u001f.wS;(\u0018(X\u0006EqVO|\u00131{l\f]\fP{^_>.hDh5", "@d`B\\9>=\u001a\u007f\t^;", "@db2g", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "AmP=G6", "\u0011n\\=T5B]\"", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SwipeToDismissBoxState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AnchoredDraggableState<SwipeToDismissBoxValue> anchoredDraggableState;
    private final Density density;

    public SwipeToDismissBoxState(SwipeToDismissBoxValue swipeToDismissBoxValue, Density density, Function1<? super SwipeToDismissBoxValue, Boolean> function1, Function1<? super Float, Float> function12) {
        this.density = density;
        this.anchoredDraggableState = new AnchoredDraggableState<>(swipeToDismissBoxValue, function12, new Function0<Float>() { // from class: androidx.compose.material3.SwipeToDismissBoxState$anchoredDraggableState$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                return Float.valueOf(this.this$0.getDensity$material3_release().mo710toPx0680j_4(SwipeToDismissBoxKt.DismissVelocityThreshold));
            }
        }, AnchoredDraggableDefaults.INSTANCE.getAnimationSpec(), function1);
    }

    public final Density getDensity$material3_release() {
        return this.density;
    }

    public /* synthetic */ SwipeToDismissBoxState(SwipeToDismissBoxValue swipeToDismissBoxValue, Density density, AnonymousClass1 anonymousClass1, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(swipeToDismissBoxValue, density, (i2 + 4) - (i2 | 4) != 0 ? new Function1<SwipeToDismissBoxValue, Boolean>() { // from class: androidx.compose.material3.SwipeToDismissBoxState.1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(SwipeToDismissBoxValue swipeToDismissBoxValue2) {
                return true;
            }
        } : anonymousClass1, function1);
    }

    public final AnchoredDraggableState<SwipeToDismissBoxValue> getAnchoredDraggableState$material3_release() {
        return this.anchoredDraggableState;
    }

    public final float getOffset$material3_release() {
        return this.anchoredDraggableState.getOffset();
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final SwipeToDismissBoxValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final SwipeToDismissBoxValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final float getProgress() {
        return this.anchoredDraggableState.getProgress();
    }

    public final SwipeToDismissBoxValue getDismissDirection() {
        return (getOffset$material3_release() == 0.0f || Float.isNaN(getOffset$material3_release())) ? SwipeToDismissBoxValue.Settled : getOffset$material3_release() > 0.0f ? SwipeToDismissBoxValue.StartToEnd : SwipeToDismissBoxValue.EndToStart;
    }

    public final Object snapTo(SwipeToDismissBoxValue swipeToDismissBoxValue, Continuation<? super Unit> continuation) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, swipeToDismissBoxValue, continuation);
        return objSnapTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSnapTo : Unit.INSTANCE;
    }

    public final Object reset(Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, SwipeToDismissBoxValue.Settled, 0.0f, continuation, 2, null);
        return objAnimateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    public final Object dismiss(SwipeToDismissBoxValue swipeToDismissBoxValue, Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, swipeToDismissBoxValue, 0.0f, continuation, 2, null);
        return objAnimateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    /* JADX INFO: compiled from: SwipeToDismissBox.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nʑA0ZeP.`\\2şs{B)c$\bCCU ~*\teNo˧tЁ[!¼?\u0006Dw+1OUޯa\u0012\u001d2\u000b?M4e{M;ptd\b0428(\t/\u001cZX\u001e{\u0013O[\u000e\"0ntJT\u001dM3!@\fn?\u000f&t\u0003^GX{\fCǥ'\roL^-e;\rO\u0013Lz3\u001dxq\u001eYIe;E)a\u0010\u001fR\nMƊC\u0001"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d79d}\u000fAL\u001a<UGIy\u0011((Vp5\u0016cj,\u0001/RHW0f[H", "", "u(E", "!`e2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d79d}\u000fAL\u001a<UGIy\u0011((Vp5\u0016c\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d79d}\u000fAL\u001a<UGIy\u0011((Y]@\u0017c\u0002", "1n]3\\9FD\u0015\u0006\u000b^\n\u007f\u00058g\u007f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", ">nb6g0H\\\u0015\u0006ia9|\u00172o\u0007'", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "Bnc._\u000bBa(z\u0004\\,", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<SwipeToDismissBoxState, SwipeToDismissBoxValue> Saver(final Function1<? super SwipeToDismissBoxValue, Boolean> function1, final Function1<? super Float, Float> function12, final Density density) {
            return SaverKt.Saver(new Function2<SaverScope, SwipeToDismissBoxState, SwipeToDismissBoxValue>() { // from class: androidx.compose.material3.SwipeToDismissBoxState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                public final SwipeToDismissBoxValue invoke(SaverScope saverScope, SwipeToDismissBoxState swipeToDismissBoxState) {
                    return swipeToDismissBoxState.getCurrentValue();
                }
            }, new Function1<SwipeToDismissBoxValue, SwipeToDismissBoxState>() { // from class: androidx.compose.material3.SwipeToDismissBoxState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final SwipeToDismissBoxState invoke(SwipeToDismissBoxValue swipeToDismissBoxValue) {
                    return new SwipeToDismissBoxState(swipeToDismissBoxValue, density, function1, function12);
                }
            });
        }
    }
}
