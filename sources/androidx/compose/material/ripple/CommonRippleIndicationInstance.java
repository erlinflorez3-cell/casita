package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: CommonRipple.kt */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated(message = "\u0015K\fArw\u001a[\u0018IA:d\u001d1\u000ejQ fvq\u001cb\u0003K\\yRycou\\pGZavMG2<I ")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<K\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.hS2şs{J$c$wDCU0}*\teNog\u0005JbŏK\u000f\u0014\u001b\u0001̓4Icxe\u0012\u00152JoU3UoC<htL\u0005(݅*8\u0010\u0005\t\u001a0I\u0016w\u0011ŏ{\f@/pphRM|\u0015\u001e \u0007V / lk\\9`l\f>?-\u0011nZT7a@|{\u0014tZ7\u0017\u0005i61P9E\u0015S\\1\rқ_?\u0011I:S\u0013z?'Y\\$[Dl\u0018\u0014C9\u007f\u0011k\b>\\3g' o1]zcP<;>\u000fD\u0013J\u001c&\u0006U[tAbl\u0016'Kt!f\u0007dJlP\u001a\u0013ad*U\u0004A?Q\u001b\u0015_(OaXE\u0017\u001d\rL6)nOw\u001b\")1)q\u0010Q_dh=vl:]Kr\u001cp\u0011\tp\u0004ϻFĉ\u009e\u007f\u0013463W,E1\"\u0004\u0002vF>ϻ\u0007¾lSqɭ\u0019R0s.=:\u000b\u001cZrk3q'ӼZ¯\u0015M$\u0381W\u0012\u0016\u00168\\&@wغ\u0012̓NŖʂiLύ\u000e'7fEd?}\u001c_QdC7ac>j\u0001|j̶>И\tXn̻$$hh@.BJz\u0010&\nTP\u001c\u0013`N )\u000bμ3Ǭ`\u0015PґnNO\r!_\tyfк`տ(\u0003q˅ڒ\t\nX_v׳\u0004'H4|fAγEr"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i\u0015w\u001e6WL(o?)\u001chEB\u0006g*J\u0006+QU25janF\u0012\u00120", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u001ft3\"\u0013dp=\u0011l\u0010W\u00056CUL,2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-!j$.ZT;x\n", "0nd;W,=", "", "@`S6h:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "@h_=_,\u001aZ$\u0002v", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u0017r?!\u0011>", "uY5\u0019T5=`#\u0003yquz\u00137p\n6{\n\u000e' Vs\u0016<@\u0013DU\r \rT\u00127LPEo31^fkA\u0012m:N@4WU]0dR<+#\u000ei\u000e$\u0012\u0013\u000fhH(w\u000e<0\u0010uM\u000bJh\u000e\u0015\u0012\u0015~IpCR N\tr\u007fJ7wSi]\tQN-^7j\flr +", "\u0014", "@h_=_,L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-\u0003w]H\u0007K(YL", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005VA\u001e#vEB\u0016c9Jt6KVWjG_rK\"g", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u0017t8&\u0011weC\u00109", "B`a4X;+O\u0018\u0003\u000bl", "", "/cS\u001f\\7IZ\u0019", "", "7mc2e(<b\u001d\t\u0004", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "=m0/T5=]\"~y", "=m5<e.Hb(~\u0004", "=mA2`,FP\u0019\fz]", "@d\\<i,+W$\n\u0002^", "2qPD<5=W\u0017z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", "2qPDE0I^ ~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "2qPDE0I^ ~\t&znw\u0015Rb\u0014", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u00023:\u0018", ";`c2e0:Z`\f~i7\u0004\t)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class CommonRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {
    private final boolean bounded;
    private final State<Color> color;
    private final float radius;
    private final State<RippleAlpha> rippleAlpha;
    private final SnapshotStateMap<PressInteraction.Press, RippleAnimation> ripples;
    private float targetRadius;

    public /* synthetic */ CommonRippleIndicationInstance(boolean z2, float f2, State state, State state2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, f2, state, state2);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }

    private CommonRippleIndicationInstance(boolean z2, float f2, State<Color> state, State<RippleAlpha> state2) {
        super(z2, state2);
        this.bounded = z2;
        this.radius = f2;
        this.color = state;
        this.rippleAlpha = state2;
        this.ripples = SnapshotStateKt.mutableStateMapOf();
        this.targetRadius = Float.NaN;
    }

    @Override // androidx.compose.foundation.IndicationInstance
    public void drawIndication(ContentDrawScope contentDrawScope) {
        float fM1756getRippleEndRadiuscSwnlzA;
        if (Float.isNaN(this.radius)) {
            fM1756getRippleEndRadiuscSwnlzA = RippleAnimationKt.m1756getRippleEndRadiuscSwnlzA(contentDrawScope, this.bounded, contentDrawScope.mo4734getSizeNHjbRc());
        } else {
            fM1756getRippleEndRadiuscSwnlzA = contentDrawScope.mo710toPx0680j_4(this.radius);
        }
        this.targetRadius = fM1756getRippleEndRadiuscSwnlzA;
        long jM4188unboximpl = this.color.getValue().m4188unboximpl();
        contentDrawScope.drawContent();
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        m1761drawStateLayerH2RKhps(contentDrawScope2, this.radius, jM4188unboximpl);
        m1753drawRipples4WTKRHQ(contentDrawScope2, jM4188unboximpl);
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void addRipple(PressInteraction.Press press, CoroutineScope coroutineScope) {
        Iterator<Map.Entry<PressInteraction.Press, RippleAnimation>> it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().finish();
        }
        RippleAnimation rippleAnimation = new RippleAnimation(this.bounded ? Offset.m3926boximpl(press.m865getPressPositionF1C5BW0()) : null, this.targetRadius, this.bounded, null);
        this.ripples.put(press, rippleAnimation);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(rippleAnimation, this, press, null), 3, null);
    }

    /* JADX INFO: renamed from: androidx.compose.material.ripple.CommonRippleIndicationInstance$addRipple$2, reason: invalid class name */
    /* JADX INFO: compiled from: CommonRipple.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bJ\u0010\b\u0010\u0011\u000e\bQg\u0015\u0014\u0015\u0018\u0018|\u0015\u001d\u001e\u001b\u0015y \u0017\u001d\u0018\u0017+!((\u0004*02 .$'f%)*\u001919:71p\u007f", f = "\u0010;8786\u0019/54/'n+3", i = {}, l = {153}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PressInteraction.Press $interaction;
        final /* synthetic */ RippleAnimation $rippleAnimation;
        int label;
        final /* synthetic */ CommonRippleIndicationInstance this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(RippleAnimation rippleAnimation, CommonRippleIndicationInstance commonRippleIndicationInstance, PressInteraction.Press press, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$rippleAnimation = rippleAnimation;
            this.this$0 = commonRippleIndicationInstance;
            this.$interaction = press;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$rippleAnimation, this.this$0, this.$interaction, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.$rippleAnimation.animate(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.ripples.remove(this.$interaction);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                this.this$0.ripples.remove(this.$interaction);
                throw th;
            }
        }
    }

    @Override // androidx.compose.material.ripple.RippleIndicationInstance
    public void removeRipple(PressInteraction.Press press) {
        RippleAnimation rippleAnimation = this.ripples.get(press);
        if (rippleAnimation != null) {
            rippleAnimation.finish();
        }
    }

    /* JADX INFO: renamed from: drawRipples-4WTKRHQ, reason: not valid java name */
    private final void m1753drawRipples4WTKRHQ(DrawScope drawScope, long j2) {
        Iterator<Map.Entry<PressInteraction.Press, RippleAnimation>> it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            RippleAnimation value = it.next().getValue();
            float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
            if (pressedAlpha != 0.0f) {
                value.m1755draw4WTKRHQ(drawScope, Color.m4177copywmQWz5c$default(j2, pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
            }
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.ripples.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        this.ripples.clear();
    }
}
