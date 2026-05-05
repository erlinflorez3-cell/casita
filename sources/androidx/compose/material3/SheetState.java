package androidx.compose.material3;

import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
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
/* JADX INFO: compiled from: SheetDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u0010s{J$c$wOCU(\u0003*\tUSog|Jb\u000bI\u001e\f\u001b\u000f̓J{\u0006x\f\u0011G1t0|CQ}=Q`#7\u0015$@$Py3\u0004*0N\u0010\u0005~[K:\u0017@Rv:`\u0013e\u0011*\u0014\u0016>N\u0006.^wNdI\u001bdJ5)\u0003wJf'\u000e1ƊQ\rT]o-\u0005\u00036+nYe\u00193r\u001b\u0007\u0001`o\tEqK(\u0001'UE\u0010֖\u0016͏\\\u0002\u001a99tUi\u0001Lt\u0005\u007f\u0003RʳiյgK^5p\u0004\t$%<20Lΰ\u0007Ͷ1\u001at/V?\u0003\u001ck@~$%۔>ѐe6%LH79c3f\u007f{\u0004/\\b\u0014\u0005;@S\u0005|DsT<z[Ò\u0013ɐU3WlKu\u0017\u0016gk\u0006\u0004\u001f\u0005HÖBΥK\u007f=#YD%TO[gEQo\u0010g\\g%\n'æ\u0012ׂVJFR|G\bH\u0017\u0016rJt\u0007{P\u0003]Z\u001c$Ƚ`Θ\u0002\u0014\u001b\u05fetyB-3\u001dnQnwx\\.\u00193?~7\bs\"RĆ=bK7Wt\u001es#\u0006\"RTb3Y\u001d\u0007ΐ\u0010^t*(FV\u007f`\u0007\nZf\fA3u6ʬ80I\u001bb,V\u0018nQO\u0015!_\tiFCՁ7(\u001bk*\r\u0017\u0016!p~\t\u007fz_++zXk\u0018ٜ7Ԋ*Y:j:\u00181#O\u0006\u000eO\u007fLuMCֶwʀ\u007f&\u001e֝QS5Z!$O;@\u0002EEzs<ʹOɟ+\u0001\u0005Ȫ'=nLu\u001d;\u007f:\u007f\u0003J}YMfՑbv;\nj \bsè~z"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d(5Y\r\u000eFi%.#", "", "AjX=C(Kb\u001dz\u0002e@\\\u001c:a\t'{?", "", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "7mXA\\(ED\u0015\u0006\u000b^", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d(5Y\r\u00113t&.#", "1n]3\\9FD\u0015\u0006\u000b^\n\u007f\u00058g\u007f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "AjX=;0=R\u0019\bhm(\f\t", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC|*VBHu8\u001d(2_C\u000fn6\\vpOH],iVnDa[H\u0011N+\u001cuUH4n\u001a\u001e%\u0012;P\u0006D2\u0006\u001d\u001eW6zy@e\u0014Q\u0003#?\"9qDhc\u0004P\r\u001bWmU", "/mR5b9>Rw\fv`.x\u00066em7wO\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\nVA>uA\u001e\u0014Gn5\te(K}'5[J;\\(", "5dc\u000ea*A]&~y=9x\u000b1a|/{.\u0010\u0013&G.\u00168\u0006%B]y'\u0005g#.TC7y4", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn9b\r Dv\u00125\u0017\u001fDi7(\"h`\u0018\u0014_.Pr$NL<;Xar\u0013", "Adc\u000ea*A]&~y=9x\u000b1a|/{.\u0010\u0013&G.\u00168\u0006%B]y'\u0005g#.TC7y4", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@)>h}-@i\u001dw)L9n>+\u0015g@F\u0003e.Js.G:](kRH\u0001\u0005", "1ta?X5MD\u0015\u0006\u000b^", "5dc\u0010h9KS\"\u000ekZ3\r\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn#\\} F^\u00125]C\u0011", "6`b\u0012k7:\\\u0018~yL;x\u0018/", "5dc\u0015T:\u001ef$z\u0004],{v>a\u000f(", "u(I", "6`b\u001dT9MW\u0015\u0006\u0002r\f\u0010\u0014+n~(z.\u0010\u0013&G", "5dc\u0015T:)O&\u000e~Z3\u0004\u001d\u000fx\u000b$\u0005?\u0001\u0016\u0005Vk\u001d<", "7rE6f0;Z\u0019", "=eU@X;", "", "5dc\u001cY-LS(=\u0003Z;|\u00163a\u0007uuM\u0001\u001e\u0017C}\u000e", "u(;7T=:\u001d z\u0004`u]\u00109a\u000f}", "5dc ^0I6\u001d}y^5j\u0018+t\u007ff\u0004<\u0010\u0017$Kk\u0015\np25`}\u001cEm", "5dc ^0I>\u0015\f\nb(\u0004\u0010CE\u00133wI\u007f\u0017\u0016\u0006w\nKv29U\u0005m1z\u00165M?Ik", "B`a4X;/O \u000fz", "5dc!T9@S(ove<|", "/mX:T;>B#", "", "Dd[<V0Mg", "/mX:T;>B#=\u0003Z;|\u00163a\u0007uuM\u0001\u001e\u0017C}\u000e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00138Y}/(i\u001d>M\u0019\u001cR:($oeBPa6[\u00017VPW,j\u001cPG\u001d!^\u0017^'\u001c\tcJy2+<\u001b\u0019(\u0013\t7q\u0003U\u007f\u000b:jnQ,", "3w_.a+", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "6hS2", ">`aA\\(E3,\nvg+", "@d`B\\9>=\u001a\u007f\t^;", "AdcA_,", "AdcA_,|[\u0015\u000ezk0x\u0010|_\r(\u0003@|%\u0017", "uE;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^! Vs\u0017Lr49c\u0007uzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "Ag^D", "AmP=G6", "AmP=G6|[\u0015\u000ezk0x\u0010|_\r(\u0003@|%\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00138Y}/(i\u001d>M\u0019\"q>-\u001clj\u0003\u0005m9X\u00076KUN:&0|F#\u0016c\u001eJ:\u0011\u000fb\u0017gUI30\u0004uP}DjJu\u0013\u00135h\u007f\u0018", "\u0011n\\=T5B]\"", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SheetState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private AnchoredDraggableState<SheetValue> anchoredDraggableState;
    private final boolean skipHiddenState;
    private final boolean skipPartiallyExpanded;

    public SheetState(boolean z2, final Density density, SheetValue sheetValue, Function1<? super SheetValue, Boolean> function1, boolean z3) {
        this.skipPartiallyExpanded = z2;
        this.skipHiddenState = z3;
        if (z2 && sheetValue == SheetValue.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.".toString());
        }
        if (!z3 || sheetValue != SheetValue.Hidden) {
            this.anchoredDraggableState = new AnchoredDraggableState<>(sheetValue, new Function1<Float, Float>() { // from class: androidx.compose.material3.SheetState$anchoredDraggableState$1
                {
                    super(1);
                }

                public final Float invoke(float f2) {
                    return Float.valueOf(density.mo710toPx0680j_4(Dp.m6638constructorimpl(56)));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                    return invoke(f2.floatValue());
                }
            }, new Function0<Float>() { // from class: androidx.compose.material3.SheetState$anchoredDraggableState$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Float invoke() {
                    return Float.valueOf(density.mo710toPx0680j_4(Dp.m6638constructorimpl(125)));
                }
            }, SheetDefaultsKt.BottomSheetAnimationSpec, function1);
            return;
        }
        throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.".toString());
    }

    public final boolean getSkipPartiallyExpanded$material3_release() {
        return this.skipPartiallyExpanded;
    }

    public /* synthetic */ SheetState(boolean z2, Density density, SheetValue sheetValue, Function1 function1, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, density, (i2 + 4) - (4 | i2) != 0 ? SheetValue.Hidden : sheetValue, (8 & i2) != 0 ? new Function1<SheetValue, Boolean>() { // from class: androidx.compose.material3.SheetState.1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(SheetValue sheetValue2) {
                return true;
            }
        } : function1, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? false : z3);
    }

    public final boolean getSkipHiddenState$material3_release() {
        return this.skipHiddenState;
    }

    public final SheetValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final SheetValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isVisible() {
        return this.anchoredDraggableState.getCurrentValue() != SheetValue.Hidden;
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final boolean getHasExpandedState() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(SheetValue.Expanded);
    }

    public final boolean getHasPartiallyExpandedState() {
        return this.anchoredDraggableState.getAnchors().hasAnchorFor(SheetValue.PartiallyExpanded);
    }

    public final Object expand(Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, SheetValue.Expanded, 0.0f, continuation, 2, null);
        return objAnimateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    public final Object partialExpand(Continuation<? super Unit> continuation) {
        if (this.skipPartiallyExpanded) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.".toString());
        }
        Object objAnimateTo$material3_release$default = animateTo$material3_release$default(this, SheetValue.PartiallyExpanded, 0.0f, continuation, 2, null);
        return objAnimateTo$material3_release$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$material3_release$default : Unit.INSTANCE;
    }

    public final Object show(Continuation<? super Unit> continuation) {
        Object objAnimateTo$material3_release$default = animateTo$material3_release$default(this, getHasPartiallyExpandedState() ? SheetValue.PartiallyExpanded : SheetValue.Expanded, 0.0f, continuation, 2, null);
        return objAnimateTo$material3_release$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$material3_release$default : Unit.INSTANCE;
    }

    public final Object hide(Continuation<? super Unit> continuation) {
        if (this.skipHiddenState) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.".toString());
        }
        Object objAnimateTo$material3_release$default = animateTo$material3_release$default(this, SheetValue.Hidden, 0.0f, continuation, 2, null);
        return objAnimateTo$material3_release$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$material3_release$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateTo$material3_release$default(SheetState sheetState, SheetValue sheetValue, float f2, Continuation continuation, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f2 = sheetState.anchoredDraggableState.getLastVelocity();
        }
        return sheetState.animateTo$material3_release(sheetValue, f2, continuation);
    }

    public final Object animateTo$material3_release(SheetValue sheetValue, float f2, Continuation<? super Unit> continuation) {
        Object objAnimateTo = AnchoredDraggableKt.animateTo(this.anchoredDraggableState, sheetValue, f2, continuation);
        return objAnimateTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
    }

    public final Object snapTo$material3_release(SheetValue sheetValue, Continuation<? super Unit> continuation) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, sheetValue, continuation);
        return objSnapTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSnapTo : Unit.INSTANCE;
    }

    public final Object settle$material3_release(float f2, Continuation<? super Unit> continuation) {
        Object obj = this.anchoredDraggableState.settle(f2, continuation);
        return obj == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : Unit.INSTANCE;
    }

    public final AnchoredDraggableState<SheetValue> getAnchoredDraggableState$material3_release() {
        return this.anchoredDraggableState;
    }

    public final void setAnchoredDraggableState$material3_release(AnchoredDraggableState<SheetValue> anchoredDraggableState) {
        this.anchoredDraggableState = anchoredDraggableState;
    }

    public final Float getOffset$material3_release() {
        return Float.valueOf(this.anchoredDraggableState.getOffset());
    }

    /* JADX INFO: compiled from: SheetDefaults.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nʑA0RnP\u008cZS@\u000fsڔ<$q$yCAU ԉ#\u001fѧ~g\u0016m\u000b_\u0011CǇ\n\u0016\u0007jt\u0006cyu\u001e\u001f4Rom6]qM9\u000fxd\u0007P60=\u0012\u0005/ ZX\u001e}\u0013O[\u000e\"0ntJT\u001dM3 @\u000en$\u000f'tg|@xpkEG#1oŒR3"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d(5Y\r\u000eFi%.\f!Es?\u001a\u001elkB\\", "", "u(E", "!`e2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d(5Y\r\u000eFi%.#", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d(5Y\r\u00113t&.#", "AjX=C(Kb\u001dz\u0002e@\\\u001c:a\t'{?", "", "1n]3\\9FD\u0015\u0006\u000b^\n\u007f\u00058g\u007f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "AjX=;0=R\u0019\bhm(\f\t", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<SheetState, SheetValue> Saver(final boolean z2, final Function1<? super SheetValue, Boolean> function1, final Density density, final boolean z3) {
            return SaverKt.Saver(new Function2<SaverScope, SheetState, SheetValue>() { // from class: androidx.compose.material3.SheetState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                public final SheetValue invoke(SaverScope saverScope, SheetState sheetState) {
                    return sheetState.getCurrentValue();
                }
            }, new Function1<SheetValue, SheetState>() { // from class: androidx.compose.material3.SheetState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final SheetState invoke(SheetValue sheetValue) {
                    return new SheetState(z2, density, sheetValue, function1, z3);
                }
            });
        }
    }
}
