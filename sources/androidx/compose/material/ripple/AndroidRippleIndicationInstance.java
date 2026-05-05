package androidx.compose.material.ripple;

import android.view.ViewGroup;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: Ripple.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "\u0015K\fArw\u001a[\u0018IA:d\u001d1\u000ejQ fvq\u001cb\u0003K\\yRycou\\pGZavMG2<I ")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\":\u001b\u007fјnjO0L͜P.hS2\u000f\u0002{<řc$\bCC٥\"}8\tWNmovJp\u000bK\u000f\u0014\u0016\u0001j2I]xs\u0012\u00172XoG3StE9nz>ӌ(288\u0002\u0005\u0007\u001b2H&v\u0003ŏS\f(0Hp@X\u0015M\u001b\u001a\u001aßD\u001f\u0017Ȧ\rg|5xl\f:_#1j\u0003\u00067c>~e\rtW7\u0011\u0005e6+n<E\u001f3Y\u001b\rb]O\u0003myk\fx154ayg8h\u007fB\u001fYV\u001da\u00011t\u0005\u007flВ++]p\u0014f\u001cP\u0010z*%l\b\u001c/?H\\WJj\u00169Kt!\u007f\u0007dJdP-\u0013ad/k\u007f{1GI~Q\u0010V_N\u007f\u0002\u0013<6#/\u0007go\u001d\u0014nE3T&iwe\tCV\u007f\"Yk\u0006J\u0005+\b86HG.GB%v%3js9Q9\u001c\u0006Vm\u007fv3\u000b/g2\\Vt:nDOR\t:\u0010\u000bxUw^Vp,?Pr΄\tą\f\u0013(οHN/+(T_jyj{e8,\u0006ό9֍rk\u0016ã\n\bADic>d\u0003z\"MTb3[\u001d\u0003\u0012L1٥̴\"ĘLz\u0018y\u0002X\\!+4E\u0002*EL3\u001fn#[S0PW\u0015\u000fo\\x\u0010-la;Yǰ&ڲ\r\u0001XʔA\u0004u|a,+ex\u038dC۔4ӧƘT!מ8~+\u0007\r\rPYuU_R|\u0018\u0006U**D!\u0010֚1ˮ\u0017\u000f\u0007ǻ\u0003\u0010;_dt{P{-}Ϙ\tɍ\u0013;p֫85x\u000eDb\u0001I}pG(\u0005l\u000b%\u001ec.\u0016\u0018\u00079\b:ҽ\u07bb[ƏM\u0003\u000b[BpF\u0012\u001d!$C\u000f\u000fB~;MQHm\"\u00067G\u0015\u0010\u0002@۳:ԃf\u000f.۩6\u0018:\t.o\u0011w4ЩGϨHʲ͓=!ٝp\u0005JHx\u001fXN\u0017?%3vM;ݨXиQ\u000b7̎ֈ\u00075\u0015s\\\u074cVAn\u000644~ͱwy"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i\u0013v\u0015;WG:X8) oa\u001d\u0010b0Lr6KVW\u0010e`\u00029\u001d\u0010Zc", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u001ft3\"\u0013dp=\u0011l\u0010W\u00056CUL,2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-!j$.ZT;x\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u001euB-zhu\u000f", "0nd;W,=", "", "@`S6h:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "@h_=_,\u001aZ$\u0002v", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u0017r?!\u0011>", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "uY5\u0019T5=`#\u0003yquz\u00137p\n6{\n\u000e' Vs\u0016<@\u0013DU\r \rT\u00127LPEo31^fkA\u0012m:N@4WU]0dR<+#\u000ei\u000e$\u0012\t\u000eXN.rC\u00010\f,[K,l\u0001\u001ew\u001b?z{\u0018=\u0016Q\t\u001cyJrmWa)}PPEo3`\u0013){\\;64\u001b\u0001v%q^=\u0017\fQ |_actM\u0019\b\u000eg/", "\nrTA \u0006\u0017", "7me._0=O(~ib*\u0003", "5dc\u0016a=:Z\u001d}vm,k\r-k", "u(I", "Adc\u0016a=:Z\u001d}vm,k\r-k", "uY\u0018#", "7me._0=O(~ib*\u0003G.e\u0007(}<\u0010\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "=m8;i(EW\u0018z\n^\u0019\u0001\u0014:l\u007f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u0014", "@h_=_,\u001c]\"\u000evb5|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u0019u=-\u0011lj9\u00149", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u001euB-\u0006laK\\", "@h_=_,!]'\u000ekb,\u000f", "5dc\u001f\\7IZ\u0019a\u0005l;m\r/w", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nC@29d\t'77\u00032XNBk\u0017(#wR=\u0007u\u0002", "Adc\u001f\\7IZ\u0019a\u0005l;m\r/w", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\u0006\u0004)@d\u0005 \u0001Z\u001a9XJ;N>,$Ye9\u00199o?", "@h_=_,!]'\u000ekb,\u000fG.e\u0007(}<\u0010\u0017", "@h_=_,+O\u0018\u0003\u000bl", "", "@h_=_,,W.~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "\u0018", "/cS\u001f\\7IZ\u0019", "7mc2e(<b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005VA\u001e#vEB\u0016c9Jt6KVWjG_rK\"g", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "2hb=b:>", "5dc\u001ce\nKS\u0015\u000ezK0\b\u00146e]2\u0005O|\u001b G|", "=m0/T5=]\"~y", "=m5<e.Hb(~\u0004", "=mA2`,FP\u0019\fz]", "=mA2f,M@\u001d\n\u0006e,_\u0013=tp,{R", "@d\\<i,+W$\n\u0002^", "2qPD<5=W\u0017z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", ";`c2e0:Z`\f~i7\u0004\t)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver, RippleHostKey {
    public static final int $stable = 8;
    private final boolean bounded;
    private final State<Color> color;
    private final MutableState invalidateTick$delegate;
    private final Function0<Unit> onInvalidateRipple;
    private final float radius;
    private final State<RippleAlpha> rippleAlpha;
    private RippleContainer rippleContainer;
    private final MutableState rippleHostView$delegate;
    private int rippleRadius;
    private long rippleSize;
    private final ViewGroup view;

    public /* synthetic */ AndroidRippleIndicationInstance(boolean z2, float f2, State state, State state2, ViewGroup viewGroup, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, f2, state, state2, viewGroup);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }

    private AndroidRippleIndicationInstance(boolean z2, float f2, State<Color> state, State<RippleAlpha> state2, ViewGroup viewGroup) {
        super(z2, state2);
        this.bounded = z2;
        this.radius = f2;
        this.color = state;
        this.rippleAlpha = state2;
        this.view = viewGroup;
        this.rippleHostView$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.invalidateTick$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.rippleSize = Size.Companion.m4015getZeroNHjbRc();
        this.rippleRadius = -1;
        this.onInvalidateRipple = new Function0<Unit>() { // from class: androidx.compose.material.ripple.AndroidRippleIndicationInstance$onInvalidateRipple$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.setInvalidateTick(!r1.getInvalidateTick());
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final RippleHostView getRippleHostView() {
        return (RippleHostView) this.rippleHostView$delegate.getValue();
    }

    private final void setRippleHostView(RippleHostView rippleHostView) {
        this.rippleHostView$delegate.setValue(rippleHostView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getInvalidateTick() {
        return ((Boolean) this.invalidateTick$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInvalidateTick(boolean z2) {
        this.invalidateTick$delegate.setValue(Boolean.valueOf(z2));
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(ContentDrawScope contentDrawScope) {
        int iRoundToInt;
        this.rippleSize = contentDrawScope.mo4734getSizeNHjbRc();
        if (Float.isNaN(this.radius)) {
            iRoundToInt = MathKt.roundToInt(RippleAnimationKt.m1756getRippleEndRadiuscSwnlzA(contentDrawScope, this.bounded, contentDrawScope.mo4734getSizeNHjbRc()));
        } else {
            iRoundToInt = contentDrawScope.mo704roundToPx0680j_4(this.radius);
        }
        this.rippleRadius = iRoundToInt;
        long jM4188unboximpl = this.color.getValue().m4188unboximpl();
        float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
        contentDrawScope.drawContent();
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        m1761drawStateLayerH2RKhps(contentDrawScope2, this.radius, jM4188unboximpl);
        Canvas canvas = contentDrawScope2.getDrawContext().getCanvas();
        getInvalidateTick();
        RippleHostView rippleHostView = getRippleHostView();
        if (rippleHostView != null) {
            rippleHostView.m1760setRippleProperties07v42R4(contentDrawScope.mo4734getSizeNHjbRc(), jM4188unboximpl, pressedAlpha);
            rippleHostView.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        }
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(PressInteraction.Press press, CoroutineScope coroutineScope) {
        RippleHostView rippleHostView = getOrCreateRippleContainer().getRippleHostView(this);
        rippleHostView.m1759addRippleKOepWvA(press, this.bounded, this.rippleSize, this.rippleRadius, this.color.getValue().m4188unboximpl(), this.rippleAlpha.getValue().getPressedAlpha(), this.onInvalidateRipple);
        setRippleHostView(rippleHostView);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(PressInteraction.Press press) {
        RippleHostView rippleHostView = getRippleHostView();
        if (rippleHostView != null) {
            rippleHostView.removeRipple();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        dispose();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        dispose();
    }

    private final void dispose() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            rippleContainer.disposeRippleIfNeeded(this);
        }
    }

    @Override // androidx.compose.material.ripple.RippleHostKey
    public void onResetRippleHostView() {
        setRippleHostView(null);
    }

    private final RippleContainer getOrCreateRippleContainer() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            Intrinsics.checkNotNull(rippleContainer);
            return rippleContainer;
        }
        RippleContainer rippleContainerCreateAndAttachRippleContainerIfNeeded = Ripple_androidKt.createAndAttachRippleContainerIfNeeded(this.view);
        this.rippleContainer = rippleContainerCreateAndAttachRippleContainerIfNeeded;
        Intrinsics.checkNotNull(rippleContainerCreateAndAttachRippleContainerIfNeeded);
        return rippleContainerCreateAndAttachRippleContainerIfNeeded;
    }
}
