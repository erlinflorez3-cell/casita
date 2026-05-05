package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яd\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4B\u0007\"B\u0012\u007fјnjG5L͜P.`\\2\u000fq\u0002<$q$yCAV\"}8\tWNm}vJh\u000bKƤ\u000e\u0016\u000fj4I[{e\u0012%2JģG3coE9vt>\u000562*8\bڎ\t\u001a@H\u0018v\u0001FQ\u0011(ؓ^1jR;L=\u0019RFI0\u0005,\\\u007fNdIǰa:=%K\u000eP{?_^+}\u0011Tx?\r%bN7F7CD=Y\u0013\tb[m\tm\"\u0004ݢ'Ҋ++W% Df2,\u0015YU=a\u0001Yt\u0005\u007ffR;s\rq\u007fh\u000eV&+\u007f\u001bq\u001c\u000e4]xS;Q~)\u00142\u0005tc@~;nJ\u0010\u0001q8'%.aYs+jacQ\u0018|r*=ڟ\"#\u0007+gƓ\u0013\u05f8d\u0015)\u0012@e?\u0010X=vT:]K\u0012\u001cp\u0011\u0003pʽnϽ\u0004/\nP~#3:s9Q%BȸTזkv\r\u009b9_wW`@Ptlն6Á\u0010ZLߟU\u0005^[p,?UR)]ùܶ\u0013ء`\u0002D#+\u001b\\[\u0001kpVk\u0014uHtDqn\u001a\u0016\u000e\u000e5ڿ̕QӒ\u0014kZx\u001aNJn\u001dZlPa\u0016+k62JH\u0019!.@ΌR\u0010+4E\u0004*G|C'p-H13\u0019ˇ~Ȥc`pɭ\u0017V9:\u0011\u0001t\u0007\u0017\u0019h\\\u001fw\u001eM ت~˃&1YS;14_rzB\u0016;\u0007-{6\u001c>֍Iƥp\u001a\u000eW\u0002:$$\nc=X+\u000f-1hV\u0004սNȌiUe\u0014-\u0017\u000b\u0004_]vL\u007f\b\u0019q\\dxggTE#-#1a^۴\f\u05fbeP\u0013Iis\u0019{^Kx$g>\u001fD\u000b'7\u001eS\u007fFܵ~ީ1C/ݴf!\"S-a\fj 2\b\u0006'&#f:p\"VF̬Т]щ?HQ[\u0005e0L\u0005\u0005Hmx\u0018(D\u000fZ\u001b5\u0019jr\u001an8{\f_\u0002t*D\r\u001fW\u0012~Q.Tҵʬ_ͫwS\u0006\u0016do39eUm\u0018{k|\rP:\u0018\rֳ50"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00133f\b'>[%*\\C\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0011eh9tr(]v|", "7mXA\\(E", "", "uH\u0018#", "-lPEI(Ec\u0019l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0004@|\u0004=IR;A", "/bRB`<EO(\t\b", "", "1`] V9HZ [v\\2\u000f\u0005<d", "", "5dc\u0010T5,Q&\t\u0002e\tx\u00075w{5z", "u(I", "1`] V9HZ [v\\2\u000f\u0005<d>'{G\u0001\u0019\u0013Vo", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "1`] V9HZ _\u0005k>x\u0016.", "5dc\u0010T5,Q&\t\u0002e\r\u0007\u0016Aa\r'", "1`] V9HZ _\u0005k>x\u0016.$~(\u0003@\u0003\u0013&G", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6Wd1WYL,2", "5dc\u0016a;>`\u0015|\nb6\u0006v9u\r&{", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~]\u0007/7z\u0012,\\GEt}\u0002\u001ewaF\u0003a;R\u000105V^9ZRH", "7mc2e5:Z|\b\n^9x\u0007>i\n1iJ\u0011$\u0015G", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "5dc\u0016a;>`\"z\u0002B5\f\t<a}7\u007fJ\n\u0005!W|\f<5&?i\u0007\u001f3|\u001a8V=Hk;\u001e\u0011va", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~]\u0007/7z\u0012,\\GEt}\u0006%w]6\u000ec\u0010W\u0006'THL;`\\{+\u001e\"g\fN\u0001", "7rB0e6EZ|\bek6~\u0016/s\u000e", ":`bAF*K] \u0006z]\tx\u00075w{5z", "5dc\u0019T:MA\u0017\f\u0005e3|\b\fa}.\u000e<\u000e\u0016", ":`bAF*K] \u0006z]\r\u0007\u0016Aa\r'", "5dc\u0019T:MA\u0017\f\u0005e3|\b\u0010o\r:wM\u007f", "<df\u001aT?", ";`g#T3NS", "5dc\u001aT?/O \u000fz", "u(8", "Adc\u001aT?/O \u000fz\u001d-\u0007\u00198d{7\u007fJ\n\u0011$Gv\u000e8\u0005%", "Aba<_3:P ~hm(\f\t", "\nrTA \u0006\u0017", "D`[BX", "5dc#T3NS", "Adc#T3NS", "D`[BXj=S ~|Z;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0004@|\u0004=IR;A", "DhTDc6Kb\u0007\u0003\u0010^", "5dc#\\,P^#\f\nL0\u0012\t", "Adc#\\,P^#\f\nL0\u0012\tmf\n8\u0005?|&\u001bQx\bIv,5U\f ", "DhTDc6Kb\u0007\u0003\u0010^j{\t6e\u0002$\u000b@", "/mX:T;>A\u0017\f\u0005e3k\u0013", "", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0003sa7\\J2X\u0006.KU\u0018*f_|M#\u0016c\u000e\\tj\u000fbP(wT3.\f6RW~O\u0006\b'\n~qlKXY1v\u001au?8>", "2hb=T;<V\u0006z\r=,\u0004\u0018+", "2d[AT", "Aba<_3", "Aba<_3)`\u001d\t\bb;\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\rEhy/7X#2WP?zHs", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn\u001di\r\u001cFm\u0001;QMHoC2jOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0004tn2S\u0011Bl\nU\u0014\u0018Bt\u0001QZ\u0019G\b^SK2wJbouVEOk\u007f(rd\u0019m6\u0004+\u0010z\u001bdRM3\nybf", "Aba<_3-]", "uH;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^! Vs\u0017Lr49c\u0007uzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ScrollState implements ScrollableState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<ScrollState, ?> Saver = SaverKt.Saver(new Function2<SaverScope, ScrollState, Integer>() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(SaverScope saverScope, ScrollState scrollState) {
            return Integer.valueOf(scrollState.getValue());
        }
    }, new Function1<Integer, ScrollState>() { // from class: androidx.compose.foundation.ScrollState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ ScrollState invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final ScrollState invoke(int i2) {
            return new ScrollState(i2);
        }
    });
    private float accumulator;
    private final MutableIntState value$delegate;
    private final MutableIntState viewportSize$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
    private final MutableInteractionSource internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
    private MutableIntState _maxValueState = SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);
    private final ScrollableState scrollableState = ScrollableStateKt.ScrollableState(new Function1<Float, Float>() { // from class: androidx.compose.foundation.ScrollState$scrollableState$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f2) {
            return invoke(f2.floatValue());
        }

        public final Float invoke(float f2) {
            float value = this.this$0.getValue() + f2 + this.this$0.accumulator;
            float fCoerceIn = RangesKt.coerceIn(value, 0.0f, this.this$0.getMaxValue());
            boolean z2 = value == fCoerceIn;
            float value2 = fCoerceIn - this.this$0.getValue();
            int iRound = Math.round(value2);
            ScrollState scrollState = this.this$0;
            scrollState.setValue(scrollState.getValue() + iRound);
            this.this$0.accumulator = value2 - iRound;
            if (!z2) {
                f2 = value2;
            }
            return Float.valueOf(f2);
        }
    });
    private final State canScrollForward$delegate = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.foundation.ScrollState$canScrollForward$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.getValue() < this.this$0.getMaxValue());
        }
    });
    private final State canScrollBackward$delegate = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.foundation.ScrollState$canScrollBackward$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.this$0.getValue() > 0);
        }
    });

    public ScrollState(int i2) {
        this.value$delegate = SnapshotIntStateKt.mutableIntStateOf(i2);
    }

    public final void setValue(int i2) {
        this.value$delegate.setIntValue(i2);
    }

    public final int getValue() {
        return this.value$delegate.getIntValue();
    }

    public final int getMaxValue() {
        return this._maxValueState.getIntValue();
    }

    public final void setMaxValue$foundation_release(int i2) {
        this._maxValueState.setIntValue(i2);
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (getValue() > i2) {
                setValue(i2);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    public final int getViewportSize() {
        return this.viewportSize$delegate.getIntValue();
    }

    public final void setViewportSize$foundation_release(int i2) {
        this.viewportSize$delegate.setIntValue(i2);
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objScroll = this.scrollableState.scroll(mutatePriority, function2, continuation);
        return objScroll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f2) {
        return this.scrollableState.dispatchRawDelta(f2);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.scrollableState.getLastScrolledForward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.scrollableState.getLastScrolledBackward();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollTo$default(ScrollState scrollState, int i2, AnimationSpec animationSpec, Continuation continuation, int i3, Object obj) {
        SpringSpec springSpec = animationSpec;
        if ((i3 + 2) - (i3 | 2) != 0) {
            springSpec = new SpringSpec(0.0f, 0.0f, null, 7, null);
        }
        return scrollState.animateScrollTo(i2, springSpec, continuation);
    }

    public final Object animateScrollTo(int i2, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        Object objAnimateScrollBy = ScrollExtensionsKt.animateScrollBy(this, i2 - getValue(), animationSpec, continuation);
        return objAnimateScrollBy == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateScrollBy : Unit.INSTANCE;
    }

    public final Object scrollTo(int i2, Continuation<? super Float> continuation) {
        return ScrollExtensionsKt.scrollBy(this, i2 - getValue(), continuation);
    }

    /* JADX INFO: compiled from: Scroll.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\blʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$B\\IV2\b2\u000b_N\u0016j~J`\fq\u0011و\u001a~rߚaW~a \u0014̙Fu"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00133f\b'>[%*\\CyI>& dj=\u0011l\u0002", "", "u(E", "!`e2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00133f\b'>[%*\\C\u0011", "5dc T=>`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005!FYy\u001d>m_\u001cIT;x\n", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<ScrollState, ?> getSaver() {
            return ScrollState.Saver;
        }
    }
}
