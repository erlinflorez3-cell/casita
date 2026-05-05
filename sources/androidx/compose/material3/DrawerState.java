package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.material3.internal.AnchoredDragScope;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
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
/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012\u0006\u0010nj?0Le^.ZS0\u0010s{B)c$wGCU0}*\tUXog\u0005Jb\u000bI\u0014\u000e\u0016\u0007j4կ]xs\u0012\u00172H{E8cڎ[o\u0011td\u0004X1Xx\u001b\u0015\u0005(*`\u0010%{S]\u0012\u0012>B\tFb\u000f]\u0005H\u0013\u0016@0\u0001L`\u0016QɇLlk?wE\u0011\u0010ZNU\u0007`\u0001[1^TU\u000e'k,SX=E\u00175S1\u0012\u0001\u0005\u0006ũ}џA\u0005vQoYW\u001ao6\u0007'D\u00199s%]!'\r\u0011W`\u001aRCUsM`\u000eV\u0003)%=B\n\u000e\u0014S`.[%-ڟL\u07baxram\u0019\u000elp\u0018z\u0010]]Ӣ>Ĵ/9)\u0016\u001amIIf7*,S̛aъr!i\u0004Vf#Llw\u007fC\u0018@\u0006S\\<q=\u001c\u000f7ç͆.\u00046zHC\nEF\u0017S^\f=1E\u0004\u0002vE.ϿC¾lSw\b\u0019X0t.=:\u000b\u001cZre3r'ӺZ¯\u0015S$\u0381\u001f\u007f\u000e\u001b.eHK//(N}s /ܷa\u000e=1lCg{<\u001deGv3cR\u001aTуVz,ABq\u0013h7oa\u001fr^>!`Z\u001b\u0016\u0006\r\\P\"\u0012`Q(Zrj\bǊ±\u0015Ƞ\u0007.JC\u0003!ms\u0001\u0012\u0005hA9#k*\u000b\u0017\u0018!k~\n\u007fxw03%Ę1Ei7\u001f@c=9C\u000b?\u001f~\"\u0004},֙KP\u0005\u0018{q\n;f)GnG=A\u00135mɨ\u00061]Nx\u0003_hbG\t\u001b\u0012\u0015Kj>g6u\u001fK\u0017n!֪VЂ&\u0003fа3\nj \b\u0003^|M\u0006b.,MW\u0017\u001bYjOnAġ#\"=\u0003uG\u000bEԯG^"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U21k}-%|\u0012=M\u0019", "", "7mXA\\(ED\u0015\u0006\u000b^", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U21k}-(i\u001d>M\u0019", "1n]3\\9FA(z\n^\n\u007f\u00058g\u007f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0004BU\u0010 D^\u00125]C\u0011R:($oeBPh=V@(WUL;`\\{K]rj\u0017L:\u0011\u000fb\ry25", "/mR5b9>Rw\fv`.x\u00066em7wO\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\nVA>uA\u001e\u0014Gn5\te(K}'5[J;\\(", "5dc\u000ea*A]&~y=9x\u000b1a|/{.\u0010\u0013&G.\u00168\u0006%B]y'\u0005g#.TC7y4", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn9b\r Dv\u00125\u0017\u001fDi7(\"h`\u0018\u0014_.Pr$NL<;Xar\u0013", "1ta?X5M=\u001a\u007f\t^;", "", "5dc\u0010h9KS\"\u000ed_-\u000b\t>", "u(5", "1ta?X5MD\u0015\u0006\u000b^", "5dc\u0010h9KS\"\u000ekZ3\r\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn\u0014fy27z\u0007*TS;A", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "2d]@\\;R", "5dc\u0011X5LW(\u00139f(\f\t<i{/I:\u000e\u0017\u001eGk\u001c<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "Adc\u0011X5LW(\u00139f(\f\t<i{/I:\u000e\u0017\u001eGk\u001c<", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\r1\u0007", "2d]@\\;R\u0012\u0018~\u0002^.x\u0018/", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "7r0;\\4:b\u001d\t\u0004K<\u0006\u00123n\u0002", "u(I", "7r29b:>R", "7r>=X5", "=eU@X;", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "5dc\u001cY-LS(=vg5\u0007\u0018+t\u00042\u0005N", "u(E", "5dc\u001cY-LS(", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d41h}u", "B`a4X;/O \u000fz", "5dc!T9@S(ove<|", "/mX:T;>B#", "", "/mX:", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0004BU\u0010 D^\u00125]C\u0011R0'\u0014uk=\u0006vuL\u0001/RV\\,&N{A\u001c\u000ei\u0012X4V\u0003cN$8 @#\u0010(X\u0006Eqn\u0017\u0016\f\u000bQvLe\u0017K\u0003^sK6rVhc\u0003GO\u000f@4m\u001bc&l6I(\u001ezn^OU*\u001bw\u001d\u0018n[{1QD\u001ez63\u0014", "/mX:T;B]\"l\u0006^*", "Dd[<V0Mg", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0004BU\u0010 D^\u00125]C\u0011R0'\u0014uk=\u0006vuL\u0001/RV\\,&N{A\u001c\u000ei\u0012X4V\u0003cN$8 @#\u0010(X\u0006Eqn\u0017\u0016\f\u000bKWH`\u001fN}\u001e??3uPin}PAS,\bn\u0015n!eJ63\u0018{\"p,73\u0006\rOZyN\u0003i11\u0016\u007f8\"MC", "1k^@X", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "=oT;", "@d`B\\9>2\u0019\b\tb;\u0011", "@d`B\\9>=\u001a\u007f\t^;", "@d`B\\9>=\u001a\u007f\t^;;\u0011+t\u007f5\u007f<\bd\u0011To\u0015<r35", "AmP=G6", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0004BU\u0010 D^\u00125]C\u0011R:($oeBPa6[\u00017VPW,j\u001cPG\u001d!^\u0017^'\u001c\tcJy2+<\u001b\u0019(\u0013\t7q\u0003U\u007f\u000b:jnQ,", "\u0011n\\=T5B]\"", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DrawerState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AnchoredDraggableState<DrawerValue> anchoredDraggableState;
    private final MutableState density$delegate;
    private final State<Float> offset;

    @Deprecated(message = "\u0013R\u00016\u0005yTX[J-\u000ecT@Va\f\u0018-\u000b{\u0011f6Zv|]\n+n(OyT_avM5$9M\u0017j\u001899`Q>m}F\u0017 \\&R.6H\nwK\u00068(`\u0003;a+\u001a\u0001K$K\u0014\u000176Dgt<W[}\u0002_\r4E 6\b)\u001cJBfQ)-}8%\u000e+'U@\u0016lM;!RM\u007f", replaceWith = @ReplaceWith(expression = "currentOffset", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getOffset$annotations() {
    }

    public DrawerState(DrawerValue drawerValue, Function1<? super DrawerValue, Boolean> function1) {
        this.anchoredDraggableState = new AnchoredDraggableState<>(drawerValue, new Function1<Float, Float>() { // from class: androidx.compose.material3.DrawerState$anchoredDraggableState$1
            public final Float invoke(float f2) {
                return Float.valueOf(f2 * NavigationDrawerKt.DrawerPositionalThreshold);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                return invoke(f2.floatValue());
            }
        }, new Function0<Float>() { // from class: androidx.compose.material3.DrawerState$anchoredDraggableState$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                return Float.valueOf(this.this$0.requireDensity().mo710toPx0680j_4(NavigationDrawerKt.DrawerVelocityThreshold));
            }
        }, NavigationDrawerKt.AnimationSpec, function1);
        this.offset = new State<Float>() { // from class: androidx.compose.material3.DrawerState$offset$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.compose.runtime.State
            public Float getValue() {
                return Float.valueOf(this.this$0.getAnchoredDraggableState$material3_release().getOffset());
            }
        };
        this.density$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, AnonymousClass1 anonymousClass1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawerValue, (i2 & 2) != 0 ? new Function1<DrawerValue, Boolean>() { // from class: androidx.compose.material3.DrawerState.1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(DrawerValue drawerValue2) {
                return true;
            }
        } : anonymousClass1);
    }

    public final AnchoredDraggableState<DrawerValue> getAnchoredDraggableState$material3_release() {
        return this.anchoredDraggableState;
    }

    public final boolean isOpen() {
        return getCurrentValue() == DrawerValue.Open;
    }

    public final boolean isClosed() {
        return getCurrentValue() == DrawerValue.Closed;
    }

    public final DrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final boolean isAnimationRunning() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    public final Object open(Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = animateTo$default(this, DrawerValue.Open, null, 0.0f, continuation, 6, null);
        return objAnimateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    public final Object close(Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = animateTo$default(this, DrawerValue.Closed, null, 0.0f, continuation, 6, null);
        return objAnimateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    @Deprecated(message = "\u0017N\u0005H1\u0002\u001ak`V,:X\u0016?\u000e^Q\u000e5Dz\u0011b\u0003GqoR4&\u007f(`lG\rkx>T]4H\u0016\u0016O\u00061kMzrCH\u001a\u001bK'\u0012Zj<\u00072\r}@)L\u0012\u0005l0G\u000fX\u0015B:JAg?b\u0007zT*.\u0005-\u0006.I\u001d+\r/\u0016\u001fBa _#CKf\u0004#ePA\u0016JZ5\u001d[\u001dDo<eEe")
    @InterfaceC1492Gx
    public final Object animateTo(DrawerValue drawerValue, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = animateTo$default(this, drawerValue, animationSpec, 0.0f, continuation, 4, null);
        return objAnimateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    public final Object snapTo(DrawerValue drawerValue, Continuation<? super Unit> continuation) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, drawerValue, continuation);
        return objSnapTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSnapTo : Unit.INSTANCE;
    }

    public final DrawerValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final State<Float> getOffset() {
        return this.offset;
    }

    public final float getCurrentOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    public final Density getDensity$material3_release() {
        return (Density) this.density$delegate.getValue();
    }

    public final void setDensity$material3_release(Density density) {
        this.density$delegate.setValue(density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Density requireDensity() {
        Density density$material3_release = getDensity$material3_release();
        if (density$material3_release != null) {
            return density$material3_release;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the ModalNavigationDrawer or DismissibleNavigationDrawer composables?").toString());
    }

    public final float requireOffset$material3_release() {
        return this.anchoredDraggableState.requireOffset();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object animateTo$default(DrawerState drawerState, DrawerValue drawerValue, AnimationSpec animationSpec, float f2, Continuation continuation, int i2, Object obj) {
        if ((2 & i2) != 0) {
            animationSpec = NavigationDrawerKt.AnimationSpec;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            f2 = drawerState.anchoredDraggableState.getLastVelocity();
        }
        return drawerState.animateTo(drawerValue, animationSpec, f2, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.material3.DrawerState$animateTo$3, reason: invalid class name */
    /* JADX INFO: compiled from: NavigationDrawer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,i\bDZc|İI\u0006F\u000b6B\u0015\"4ߚ\u0006ј~jg/lev.\u0003]8\u0010\u0004\u0002D&k$ FiWJ\u00020\rgN\u0016j5Ѕ\u0019"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\nVA>uA\u001e\u0014Gn5\tQ*X\u0002'\u001d", "/mR5b9L", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\rZ?=m0\u001b\u001ch=B\u0005f6[\u0005|", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U21k}-(i\u001d>M\u0019", ":`c2f;-O&\u0001zm"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKb\u0012\u0002\u0019\b\u0016w\u001a\b\u001c\u000eM\f\u001a\u0016\u001b\u0010$\u0016\u0006\"Wg", f = "\u001b-A30);/42\u00074\"7$0j'/", i = {}, l = {254}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<DrawerValue>, DrawerValue, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(float f2, AnimationSpec<Float> animationSpec, Continuation<? super AnonymousClass3> continuation) {
            super(4, continuation);
            this.$velocity = f2;
            this.$animationSpec = animationSpec;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<DrawerValue> draggableAnchors, DrawerValue drawerValue, Continuation<? super Unit> continuation) {
            AnonymousClass3 anonymousClass3 = DrawerState.this.new AnonymousClass3(this.$velocity, this.$animationSpec, continuation);
            anonymousClass3.L$0 = anchoredDragScope;
            anonymousClass3.L$1 = draggableAnchors;
            anonymousClass3.L$2 = drawerValue;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                float fPositionOf = ((DraggableAnchors) this.L$1).positionOf((DrawerValue) this.L$2);
                if (!Float.isNaN(fPositionOf)) {
                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                    floatRef.element = Float.isNaN(DrawerState.this.getCurrentOffset()) ? 0.0f : DrawerState.this.getCurrentOffset();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (SuspendAnimationKt.animate(floatRef.element, fPositionOf, this.$velocity, this.$animationSpec, new Function2<Float, Float, Unit>() { // from class: androidx.compose.material3.DrawerState.animateTo.3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Float f2, Float f3) {
                            invoke(f2.floatValue(), f3.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(float f2, float f3) {
                            anchoredDragScope.dragTo(f2, f3);
                            floatRef.element = f2;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateTo(DrawerValue drawerValue, AnimationSpec<Float> animationSpec, float f2, Continuation<? super Unit> continuation) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(this.anchoredDraggableState, drawerValue, null, new AnonymousClass3(f2, animationSpec, null), continuation, 2, null);
        return objAnchoredDrag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnchoredDrag$default : Unit.INSTANCE;
    }

    /* JADX INFO: compiled from: NavigationDrawer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nʑA0ZeP.`\\2şqڛ5:ӋTqq:\u0016\u001f\u0004\"\u07beSNug7nh\f[\u001b\u0016\u0018\tjZLezm\u0012=6pqoC[tUEpvF\u0005N62:\n\u0005/!XNǞz\u0003"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U21k}-%|\u0012=M\u0002\u0019u<)\u0011qeC\u00109", "", "u(E", "!`e2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U21k}-%|\u0012=M\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U21k}-(i\u001d>M\u0019", "1n]3\\9FA(z\n^\n\u007f\u00058g\u007f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<DrawerState, DrawerValue> Saver(final Function1<? super DrawerValue, Boolean> function1) {
            return SaverKt.Saver(new Function2<SaverScope, DrawerState, DrawerValue>() { // from class: androidx.compose.material3.DrawerState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                public final DrawerValue invoke(SaverScope saverScope, DrawerState drawerState) {
                    return drawerState.getCurrentValue();
                }
            }, new Function1<DrawerValue, DrawerState>() { // from class: androidx.compose.material3.DrawerState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DrawerState invoke(DrawerValue drawerValue) {
                    return new DrawerState(drawerValue, function1);
                }
            });
        }
    }
}
