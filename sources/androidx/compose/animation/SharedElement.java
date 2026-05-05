package androidx.compose.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: SharedElement.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nj?9LeV7ZS0\u0016s{J$c$\u007fCCU ~*\teNog\u0005Jb\u000bI\u0015\u000e\u0016\u000fj4I[}e\u0012%2JģG3coE9fx<ӌ6݅R8(\u0004A-:L\u001ev\u0013Cy\u000b\"4NqRR;Oŋ\u001e\u0012\u0014Ah\r,\b\u007fNdd\u001daH[;\u0003\u0018c\u0017-m]\u0015M;W\u001b'UzoLC@eF]Ka2\u001fR\n[3C\u007fm\u001dhUH[M\u0002\tNX.FE/]@urT\u0011՝PӠВ+-U\u0019Y\u0007V,\u00062\u0014\rj V\u00125\u0001F-H\u00038\u0012A!\u000bSnqJbP)\u0013ad3m\u0004AdQ\u001b\u0015m2h'TO}\u001b\fL(1t/_l\u0010v\u0014IY.\u0012o\u0012\u0017׃ʿN̆]Mu\u0006vm\u00106\u001c2M\u0007=\u000410\u001d.Ee\nP/x\u001aJZf%\n\u0011namjJV!\u001d\u001bmnGP1լ߮\u0005\u07fbTd`.\u0017]*`\u001f\u007f\u000e!.d\u0018>'4\u001eX \u0012w|e]86_jE]\u0007k<ho#qu(Ҷߓa؏z$G>h\u001cfrZU\u0012mj<B4N\u007f\u001e\u000eLS\\\f+2mpʬ829ǉt\u0017N\u001b,[\u0012\u000f\u0017yrn \u0001d3R\u001f\u0018?Kժ\u0003˩`pwΟIX:}x\"[Cپ9\u001f.Ş:j:\u001a1%O\t\u000ef\u007fRWN|\u0016$v*@ک\u001e?YǽU\u0015\u0015!7UR>Sp\u000bggL@,1Aɍ\u0013?\u00010m-xx|\u0001xpgV-!%\u007f#)\u0016h\u0018{wE)h\"\u0015a϶Jϗv\taߢf:\u0003,-Fu\u0019}K\u0015A=E7\u001dDߐ$1%a\f\u0006\u001eXPʯ\u0011֑xe\fϺϦ\u0016tjTcшWfH˛\u0003x"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f\u0017t\u00166MLJA", "", "9dh", "Ab^=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u0007G4Y}|", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_*VGCgC\"\u001fq+'\n_9Nu\u0016THW:`avG\u001d\u007fX\u0018Y+p\rdHy25", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "-sP?Z,M0#\u000f\u0004]:", "5dc,g(KU\u0019\u000eWh<\u0006\b=", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#j 5|k", "Adc,g(KU\u0019\u000eWh<\u0006\b=", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFCY\u001f", "-sP?Z,M0#\u000f\u0004]:;\b/l\u007f*wO\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "1ta?X5M0#\u000f\u0004]:", "5dc\u0010h9KS\"\u000eWh<\u0006\b=", "Adc\u0010h9KS\"\u000eWh<\u0006\b=", "1ta?X5M0#\u000f\u0004]:;\b/l\u007f*wO\u0001", "", "4nd;W\u0014:b\u0017\u0002", "5dc\u0013b<GR\u0001z\n\\/", "u(I", "Adc\u0013b<GR\u0001z\n\\/", "uY\u0018#", "4nd;W\u0014:b\u0017\u00029],\u0004\t1a\u000f(", "5dc\u0018X@", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "=ab2e=B\\\u001bo~l0y\r6i\u000f<YC| \u0019G", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "5dc V6IS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#\\y-7l\u0005;ILIoC\"\u001fqO7\u0011n,2~2N\"", "AsPAX:", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-\u0003w]H\u0007J0\\\u0006|", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f\u0017t\u00166MLJO=-\u0015uj5\u000eQ;J\u0006'\u001d", "5dc g(MS'", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005.1d\f#A|$w;L7vB!\u001fwOH\u0003r,5z5V\"", "B`a4X;\u001b])\byl", "5dc!T9@S([\u0005n5{\u0017", "B`a4X;\u001b])\byl\u0017\n\u0013@i~(\t", "5dc!T9@S([\u0005n5{\u0017\u001ar\n9\u007f?\u0001$UCx\u0012Dr49c\u0007\u001aDm\u001d.IQ;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#\\y-7lu5MK;tC\u0002\u001ewaF\u0010_3<\u0006#VL$", "CoS.g,&O(|}", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "/cS g(MS", "AgP?X+\u001eZ\u0019\u0007zg;j\u0018+t\u007f", "6`b#\\:BP ~Xh5\f\t8t", "7r0;\\4:b\u001d\b|", "=m;<b2:V\u0019zyK,\u000b\u00196t", "AsPAX", ":n^8T/>O\u0018l~s,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "Bn_\u0019X-M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "=m;<b2:V\u0019zyK,\u000b\u00196tG9uRS&uE", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u00138U\u000b 6M\u001d.UCDz\u0018'$hnB\u0003j\u001a]r6G\"3\u0011 C", "=mB5T9>R\b\fvg:\u0001\u00183o\t\t\u007fI\u0005%\u001aGn", "@d\\<i,,b\u0015\u000ez", "CoS.g,-O&\u0001zm\t\u0007\u00198d\u000e\u0013\tJ\u0012\u001b\u0016G|", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SharedElement {
    public static final int $stable = 8;
    private final Object key;
    private final SharedTransitionScopeImpl scope;
    private SharedElementInternalState targetBoundsProvider;
    private final MutableState _targetBounds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState foundMatch$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableState currentBounds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final SnapshotStateList<SharedElementInternalState> states = SnapshotStateKt.mutableStateListOf();
    private final Function1<SharedElement, Unit> updateMatch = new Function1<SharedElement, Unit>() { // from class: androidx.compose.animation.SharedElement.updateMatch.1
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SharedElement sharedElement) {
            invoke2(sharedElement);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(SharedElement sharedElement) {
            SharedElement.this.updateMatch();
        }
    };
    private final Function0<Unit> observingVisibilityChange = new Function0<Unit>() { // from class: androidx.compose.animation.SharedElement$observingVisibilityChange$1
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
            this.this$0.hasVisibleContent();
        }
    };

    public SharedElement(Object obj, SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.key = obj;
        this.scope = sharedTransitionScopeImpl;
    }

    public final Object getKey() {
        return this.key;
    }

    public final SharedTransitionScopeImpl getScope() {
        return this.scope;
    }

    public final boolean isAnimating() {
        SnapshotStateList<SharedElementInternalState> snapshotStateList = this.states;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (snapshotStateList.get(i2).getBoundsAnimation().isRunning()) {
                return getFoundMatch();
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Rect get_targetBounds() {
        return (Rect) this._targetBounds$delegate.getValue();
    }

    private final void set_targetBounds(Rect rect) {
        this._targetBounds$delegate.setValue(rect);
    }

    public final Rect getTargetBounds() {
        SharedElementInternalState sharedElementInternalState = this.targetBoundsProvider;
        set_targetBounds(sharedElementInternalState != null ? RectKt.m3977Recttz77jQw(sharedElementInternalState.m443calculateLookaheadOffsetF1C5BW0(), sharedElementInternalState.m444getNonNullLookaheadSizeNHjbRc()) : null);
        return get_targetBounds();
    }

    public final void updateMatch() {
        boolean zHasVisibleContent = hasVisibleContent();
        if (this.states.size() > 1 && zHasVisibleContent) {
            setFoundMatch(true);
        } else if (!this.scope.isTransitionActive() || !zHasVisibleContent) {
            setFoundMatch(false);
        }
        if (this.states.isEmpty()) {
            return;
        }
        SharedTransitionScopeKt.getSharedTransitionObserver().observeReads(this, this.updateMatch, this.observingVisibilityChange);
    }

    private final void setFoundMatch(boolean z2) {
        this.foundMatch$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getFoundMatch() {
        return ((Boolean) this.foundMatch$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Rect getCurrentBounds() {
        return (Rect) this.currentBounds$delegate.getValue();
    }

    public final void setCurrentBounds(Rect rect) {
        this.currentBounds$delegate.setValue(rect);
    }

    public final SharedElementInternalState getTargetBoundsProvider$animation_release() {
        return this.targetBoundsProvider;
    }

    /* JADX INFO: renamed from: onLookaheadResult-v_w8tDc */
    public final void m442onLookaheadResultv_w8tDc(SharedElementInternalState sharedElementInternalState, long j2, long j3) {
        if (sharedElementInternalState.getBoundsAnimation().getTarget()) {
            this.targetBoundsProvider = sharedElementInternalState;
            Rect rect = get_targetBounds();
            Offset offsetM3926boximpl = rect != null ? Offset.m3926boximpl(rect.m3972getTopLeftF1C5BW0()) : null;
            if (offsetM3926boximpl == null ? false : Offset.m3934equalsimpl0(offsetM3926boximpl.m3947unboximpl(), j3)) {
                Rect rect2 = get_targetBounds();
                Size sizeM3994boximpl = rect2 != null ? Size.m3994boximpl(rect2.m3970getSizeNHjbRc()) : null;
                if (sizeM3994boximpl == null ? false : Size.m4002equalsimpl0(sizeM3994boximpl.m4011unboximpl(), j2)) {
                    return;
                }
            }
            Rect rectM3977Recttz77jQw = RectKt.m3977Recttz77jQw(j3, j2);
            set_targetBounds(rectM3977Recttz77jQw);
            SnapshotStateList<SharedElementInternalState> snapshotStateList = this.states;
            int size = snapshotStateList.size();
            for (int i2 = 0; i2 < size; i2++) {
                BoundsAnimation boundsAnimation = snapshotStateList.get(i2).getBoundsAnimation();
                Rect currentBounds = getCurrentBounds();
                Intrinsics.checkNotNull(currentBounds);
                boundsAnimation.animate(currentBounds, rectM3977Recttz77jQw);
            }
        }
    }

    public final SnapshotStateList<SharedElementInternalState> getStates() {
        return this.states;
    }

    public final boolean hasVisibleContent() {
        SnapshotStateList<SharedElementInternalState> snapshotStateList = this.states;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (snapshotStateList.get(i2).getBoundsAnimation().getTarget()) {
                return true;
            }
        }
        return false;
    }

    public final void updateTargetBoundsProvider() {
        SnapshotStateList<SharedElementInternalState> snapshotStateList = this.states;
        int size = snapshotStateList.size() - 1;
        SharedElementInternalState sharedElementInternalState = null;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                SharedElementInternalState sharedElementInternalState2 = snapshotStateList.get(size);
                if (sharedElementInternalState2.getBoundsAnimation().getTarget()) {
                    sharedElementInternalState = sharedElementInternalState2;
                }
                if (i2 < 0) {
                    break;
                } else {
                    size = i2;
                }
            }
        }
        if (Intrinsics.areEqual(sharedElementInternalState, this.targetBoundsProvider)) {
            return;
        }
        this.targetBoundsProvider = sharedElementInternalState;
        set_targetBounds(null);
    }

    public final void onSharedTransitionFinished() {
        setFoundMatch(this.states.size() > 1 && hasVisibleContent());
        set_targetBounds(null);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.SharedElement$updateMatch$1 */
    /* JADX INFO: compiled from: SharedElement.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f\u0017t\u00166MLJA", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<SharedElement, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SharedElement sharedElement) {
            invoke2(sharedElement);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(SharedElement sharedElement) {
            SharedElement.this.updateMatch();
        }
    }

    public final void addState(SharedElementInternalState sharedElementInternalState) {
        this.states.add(sharedElementInternalState);
        SharedTransitionScopeKt.getSharedTransitionObserver().observeReads(this, this.updateMatch, this.observingVisibilityChange);
    }

    public final void removeState(SharedElementInternalState sharedElementInternalState) {
        this.states.remove(sharedElementInternalState);
        if (this.states.isEmpty()) {
            updateMatch();
            SharedTransitionScopeKt.getSharedTransitionObserver().clear(this);
        } else {
            SharedTransitionScopeKt.getSharedTransitionObserver().observeReads(this, this.updateMatch, this.observingVisibilityChange);
        }
    }
}
