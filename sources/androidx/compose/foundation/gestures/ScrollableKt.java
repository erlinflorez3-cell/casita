package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яe\u001d̉=!4i\bDZc|\u0004O\u000f8é6B\u0015\"4\u0012}\bnjG5L͜P.hS2şs{:%c$\bCC٥\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001j2J]xs\u0012\u0017˰JoU3UڎE9vt>ӌ(288\u0002\u0005\u0017\u001a2H\u0016x#BV$n>M\t:\u0001\u001bu\u0005H 6B.\u00106\\\u0016^fLznR/Q\u0015\u001aH\\:w2\u0013L;Z\u0005-\u0013vo3C@e6E+Y\u0003\u0015hs?1@\"E\u000bh5>CK\nVdp0\u001c\u001b+]&ut<[3k\u0011\u0014-+]~cR$'&\u0017B\u0012TJ\u001c\u0013?H\\;Bf6\u001ccx\u0001bXP0nr\u0004\trN\u0017S\u0012c1?\u001btfy;GOg\u0002\u000b\r,9\u0019nO\\\u0005\u0016f\u0015)k\u0010SGPnUxV\u0010YK\u0007\u001crx\u0001X\u001evL\u0018L\n.F\u0017SU\u00049Q@\u001c\u0006Vd\u007fv3~/\u05c8(˦G̱ؗr\u0018=K\u0017.z\\rʍ\u0004\\dZ<\u0011{\u001cd\t\u000e\bA!\u000bv\u0013Ɯ'ŎROpȉ\u000b_k\f=/\u0015:0ʥmް[?fڨMSi\u0014oW\u0017 MBz\u0005\u0007m\u0019Ͱ^Ⱥ`(*õhv\u001e\u007f\u0014D|\u0015iԸAۇ 44ջ9j#R\u001b\u001epLSȄa˖l\u0012\u0007TA0ѳi)|\f\u0007˨x\u001fnψ|l"}, d2 = {"\u0011`]\u0011e(@1\u0015\u0006xn3x\u00183o\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "", "\u0012dU.h3MA\u0017\f\u0005e3d\u0013>i\n1ZP\u000e\u0013&Ky\u0017*t!<Y", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!&Ky\u0017\u001b\u000721h\u0002*@[\u0014*TC\u0011", "5dc\u0011X-:c \u000eh\\9\u0007\u00106M\n7\u007fJ\nu'Tk\u001d@\u0001.#Wy'7", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Q~\u0012F\u007f\u0004Efy/;w\u001f\u001cK?Bk\n", "\u0012dU.h3MA\u0017\f\u0005e3d\u0013>i\n1ZP\u000e\u0013&Ky\u0017*t!<Y^\u001c5| ;", "", "\u001cn>=F*K] \u0006h\\6\b\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079", "#mXAl\u000b>\\'\u0003\nr", "/mS?b0=fb|\u0005f7\u0007\u0017//\u00012\fI\u007f\u0013&Ky\u0017\u0006x%Ch\u000e-7{_\u001cKPEr;\u001a\u0012oa\u001f\u0016\"\u001cWz6[+N5jV\u0002QR]", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0011eh9lrj>\u007f+V`-,e`vL(P&c", "Aba<_3:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0011eh9tr(]v|", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "=uT?f*K] \u0006Z_-|\u0007>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u000fFY\u000b.5z 5T#<l4\u001c$>", "3mP/_,=", "@de2e:>2\u001d\fz\\;\u0001\u00138", "4kX;Z\t>V\u0015\u0010~h9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w.J?t6z\u0015k]J\u000bm9$", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "0qX;Z\u0010Gb#o~^>j\u0014/c", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w*P?t6\u0002\u001ewk*\u000bc><\u0002'E\"", "Ad\\.a;BQ'lxk6\u0004\u0010\fy", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0019qc \u0011e0LL", "=eU@X;", "Ad\\.a;BQ'lxk6\u0004\u0010\fyG'C\u000f\u0001\u0015h+", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u001719x>%\u001clj;mm.Rt|,3T6kYvF]\u0010d\u001bX;\u001c\tbA28\"A(\u00170R\u00127w\u0005\u0016\u001fcxQu>g\f\u0011\u0001\u0011~CrRC^_wV\u0017", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ScrollableKt {
    private static final float DefaultScrollMotionDurationScaleFactor = 1.0f;
    private static final Function1<PointerInputChange, Boolean> CanDragCalculation = new Function1<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$CanDragCalculation$1
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return Boolean.valueOf(!PointerType.m5457equalsimpl0(pointerInputChange.m5388getTypeT8wyACA(), PointerType.Companion.m5462getMouseT8wyACA()));
        }
    };
    private static final ScrollScope NoOpScrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollableKt$NoOpScrollScope$1
        @Override // androidx.compose.foundation.gestures.ScrollScope
        public float scrollBy(float f2) {
            return f2;
        }
    };
    private static final MotionDurationScale DefaultScrollMotionDurationScale = new MotionDurationScale() { // from class: androidx.compose.foundation.gestures.ScrollableKt$DefaultScrollMotionDurationScale$1
        @Override // androidx.compose.ui.MotionDurationScale
        public float getScaleFactor() {
            return 1.0f;
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public <R> R fold(R r2, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) MotionDurationScale.DefaultImpls.fold(this, r2, function2);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
            return (E) MotionDurationScale.DefaultImpls.get(this, key);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
            return MotionDurationScale.DefaultImpls.minusKey(this, key);
        }

        @Override // kotlin.coroutines.CoroutineContext
        public CoroutineContext plus(CoroutineContext coroutineContext) {
            return MotionDurationScale.DefaultImpls.plus(this, coroutineContext);
        }
    };
    private static final ScrollableKt$UnityDensity$1 UnityDensity = new Density() { // from class: androidx.compose.foundation.gestures.ScrollableKt$UnityDensity$1
        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return 1.0f;
        }

        ScrollableKt$UnityDensity$1() {
        }
    };

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z2, boolean z3, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, int i2, Object obj) {
        FlingBehavior flingBehavior2 = flingBehavior;
        boolean z4 = z3;
        boolean z5 = z2;
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z5 = true;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            z4 = false;
        }
        if ((16 & i2) != 0) {
            flingBehavior2 = null;
        }
        return scrollable(modifier, scrollableState, orientation, z5, z4, flingBehavior2, (i2 & 32) == 0 ? mutableInteractionSource : null);
    }

    public static final Modifier scrollable(Modifier modifier, ScrollableState scrollableState, Orientation orientation, boolean z2, boolean z3, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource) {
        return scrollable$default(modifier, scrollableState, orientation, null, z2, z3, flingBehavior, mutableInteractionSource, null, 128, null);
    }

    public static /* synthetic */ Modifier scrollable$default(Modifier modifier, ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z2, boolean z3, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec, int i2, Object obj) {
        boolean z4 = z2;
        FlingBehavior flingBehavior2 = flingBehavior;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        boolean z5 = z3;
        if ((i2 & 8) != 0) {
            z4 = true;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            z5 = false;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            flingBehavior2 = null;
        }
        if ((i2 & 64) != 0) {
            mutableInteractionSource2 = null;
        }
        return scrollable(modifier, scrollableState, orientation, overscrollEffect, z4, z5, flingBehavior2, mutableInteractionSource2, (-1) - (((-1) - i2) | ((-1) - 128)) == 0 ? bringIntoViewSpec : null);
    }

    public static final Modifier scrollable(Modifier modifier, ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z2, boolean z3, FlingBehavior flingBehavior, MutableInteractionSource mutableInteractionSource, BringIntoViewSpec bringIntoViewSpec) {
        return modifier.then(new ScrollableElement(scrollableState, orientation, overscrollEffect, z2, z3, flingBehavior, mutableInteractionSource, bringIntoViewSpec));
    }

    public static final MotionDurationScale getDefaultScrollMotionDurationScale() {
        return DefaultScrollMotionDurationScale;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX INFO: renamed from: semanticsScrollBy-d-4ec7I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m818semanticsScrollByd4ec7I(androidx.compose.foundation.gestures.ScrollingLogic r10, long r11, kotlin.coroutines.Continuation<? super androidx.compose.ui.geometry.Offset> r13) {
        /*
            r6 = r10
            boolean r0 = r13 instanceof androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1
            if (r0 == 0) goto L5d
            r4 = r13
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1 r4 = (androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1) r4
            int r0 = r4.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L5d
            int r0 = r4.label
            int r0 = r0 - r2
            r4.label = r0
        L1a:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L3d
            if (r0 != r1) goto L63
            java.lang.Object r9 = r4.L$1
            kotlin.jvm.internal.Ref$FloatRef r9 = (kotlin.jvm.internal.Ref.FloatRef) r9
            java.lang.Object r6 = r4.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r6 = (androidx.compose.foundation.gestures.ScrollingLogic) r6
            kotlin.ResultKt.throwOnFailure(r3)
        L32:
            float r0 = r9.element
            long r0 = r6.m836toOffsettuRUvjQ(r0)
            androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.m3926boximpl(r0)
            return r0
        L3d:
            kotlin.ResultKt.throwOnFailure(r3)
            kotlin.jvm.internal.Ref$FloatRef r9 = new kotlin.jvm.internal.Ref$FloatRef
            r9.<init>()
            androidx.compose.foundation.MutatePriority r0 = androidx.compose.foundation.MutatePriority.Default
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2 r5 = new androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2
            r10 = 0
            r7 = r11
            r5.<init>(r6, r7, r9, r10)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r4.L$0 = r6
            r4.L$1 = r9
            r4.label = r1
            java.lang.Object r0 = r6.scroll(r0, r5, r4)
            if (r0 != r2) goto L32
            return r2
        L5d:
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1 r4 = new androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1
            r4.<init>(r13)
            goto L1a
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.m818semanticsScrollByd4ec7I(androidx.compose.foundation.gestures.ScrollingLogic, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
