package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.android.volley.DefaultRetryPolicy;
import com.google.android.gms.common.ConnectionResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
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
/* JADX INFO: compiled from: LazyAnimateScroll.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d̉=!4i\bDJc|\u0004O\u000f8\u000b4C\u0007\":\u0012\u007fјnjO0LeV:Zݷ2\u000f\u0002{<řc$\u007fICU ~*\teNogtKr Q\u0014\u001e\u0016'p\\Sc\u007fu\u0018\u001f4Rom<{w\u0004ʣf\rf\u0013*J\"f\u007f-\u0001H5x\u0014\u0005\u0007[K:\u001f`D~Hj\r{\u0012J\u0016\u0014M8\u0001Li\u0018RDX\u0005]h@iɆ(ŌR'mB\u0015_\u001bYl';x\n\u001eYKg9#1k\u00035_\"Ϊ#M\u007fܵ\u001dhU&\u0002ɡuɱ:Z\b\u0014#+o\u0019ks>\\3S7ϲy˦ScSִ.6\u0006}\u0014\rj\u0003dͽ)ρ2/\"f\u0016\u000eS\u0003\u0001WXP0]\u0019Ș|ˋ:\u0019-\u007fA+ݶ\u001fz"}, d2 = {"\u0010nd;W\u000bBa(z\u0004\\,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u0012D1\":", "", "\u001bh]6`<F2\u001d\r\nZ5z\t", "\"`a4X;\u001dW'\u000evg*|", "2dQBZ\u0013HU", "", "5d]2e(MS\u0001\r|", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "/mX:T;>A\u0017\f\u0005e3k\u0013\u0013t\u007f0", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;*\u007f+OH],JP\u007fG\u001b\u0019H\fX6\rZ", "7mS2k", "", "Aba<_3(T\u001a\rzm", "<t\\\u001cY\u0010MS!\r[h9k\t6e\u000b2\tO", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]R0KTJ;\\@pJ\u001e\u0019a{L5\u0018\u0005/%\bR+3(\u00079S\u0006:{J\n \u0016@t~B  KC%~E82%Yh\bKPY8\u0011j\u0016n$`C\u0004\"\u001e~#+wT7\n\n\u001dn|[\tkpW\u0015\n<.GC\u001f-Jkf8>.\u001bT}A{/]t)\u0004\u0003", "7r8AX4/W'\u0003we,", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyAnimateScrollKt {
    private static final boolean DEBUG = false;
    private static final float TargetDistance = Dp.m6638constructorimpl(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS);
    private static final float BoundDistance = Dp.m6638constructorimpl(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
    private static final float MinimumDistance = Dp.m6638constructorimpl(50);

    private static final void debugLog(Function0<String> function0) {
    }

    public static final boolean isItemVisible(LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i2) {
        return i2 <= lazyLayoutAnimateScrollScope.getLastVisibleItemIndex() && lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() <= i2;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2 */
    /* JADX INFO: compiled from: LazyAnimateScroll.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\f\u0002\u001c\u001cQ\u0011\u0007 \u0017\u001e\u001eXw\u000e((p\u001f\u001b \u0015)\u001b\n\u001b+)'(\b2b!/+0%9+\u001a+;978!=\u0018D6?v\u0006", f = "\u0019-EC\n603&8(\u0015$2.*)i&.", i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, l = {174, 272}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aUJHIR6", "[eqV", "PdkS", "[eqVe", "cWtMWj&PING8:?\u000f>", "QewTV:KZJ;T-<*7", "\\_p*[iVHD=K\u001aO", "Uet]ShF", "\u0013jjOe\u001aUJHIR6"}, s = {"xQ^", "xQ_", "xQ`", "xQa", "rQ^", "rQ_", "rQ`", "uQ^", "xQ^"})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Density $density;
        final /* synthetic */ int $index;
        final /* synthetic */ int $numOfItemsForTeleport;
        final /* synthetic */ int $scrollOffset;
        final /* synthetic */ LazyLayoutAnimateScrollScope $this_animateScrollToItem;
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i2, Density density, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i3, int i4, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$index = i2;
            this.$density = density;
            this.$this_animateScrollToItem = lazyLayoutAnimateScrollScope;
            this.$scrollOffset = i3;
            this.$numOfItemsForTeleport = i4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$index, this.$density, this.$this_animateScrollToItem, this.$scrollOffset, this.$numOfItemsForTeleport, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:113:0x00b4 A[Catch: ItemFoundInScroll -> 0x0185, TryCatch #0 {ItemFoundInScroll -> 0x0185, blocks: (B:111:0x00b0, B:113:0x00b4, B:115:0x00bc, B:124:0x00e4, B:128:0x0121, B:132:0x0132), top: B:161:0x00b0 }] */
        /* JADX WARN: Removed duplicated region for block: B:117:0x00d0 A[Catch: ItemFoundInScroll -> 0x0181, TRY_ENTER, TryCatch #3 {ItemFoundInScroll -> 0x0181, blocks: (B:137:0x0178, B:117:0x00d0), top: B:167:0x0178 }] */
        /* JADX WARN: Removed duplicated region for block: B:118:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0177 A[RETURN] */
        /* JADX WARN: Type inference failed for: r1v9, types: [T, androidx.compose.animation.core.AnimationState] */
        /* JADX WARN: Type inference failed for: r7v5, types: [T, androidx.compose.animation.core.AnimationState] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x0175 -> B:167:0x0178). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r36) {
            /*
                Method dump skipped, instruction units count: 553
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public static final boolean invokeSuspend$isOvershot(boolean z2, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i2, int i3) {
            if (z2) {
                if (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() <= i2 && (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() != i2 || lazyLayoutAnimateScrollScope.getFirstVisibleItemScrollOffset() <= i3)) {
                    return false;
                }
            } else if (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() >= i2 && (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() != i2 || lazyLayoutAnimateScrollScope.getFirstVisibleItemScrollOffset() >= i3)) {
                return false;
            }
            return true;
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$3 */
        /* JADX INFO: compiled from: LazyAnimateScroll.kt */
        /* JADX INFO: loaded from: classes2.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDZc|\u0004O\u000b8\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015ia<TgX.\u0001T:\u0011{{b&\n$8KтY\u001a\u0004%"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"\u001c\u001fsa\u000f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass3 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
            final /* synthetic */ ScrollScope $$this$scroll;
            final /* synthetic */ Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> $anim;
            final /* synthetic */ float $boundDistancePx;
            final /* synthetic */ boolean $forward;
            final /* synthetic */ int $index;
            final /* synthetic */ Ref.BooleanRef $loop;
            final /* synthetic */ Ref.IntRef $loops;
            final /* synthetic */ int $numOfItemsForTeleport;
            final /* synthetic */ Ref.FloatRef $prevValue;
            final /* synthetic */ int $scrollOffset;
            final /* synthetic */ float $target;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(int i2, float f2, Ref.FloatRef floatRef, ScrollScope scrollScope, Ref.BooleanRef booleanRef, boolean z2, float f3, Ref.IntRef intRef, int i3, int i4, Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> objectRef) {
                super(1);
                i = i2;
                f = f2;
                floatRef = floatRef;
                scrollScope = scrollScope;
                booleanRef = booleanRef;
                z = z2;
                f = f3;
                intRef = intRef;
                i = i3;
                i = i4;
                objectRef = objectRef;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                invoke2(animationScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                float fCoerceAtLeast;
                if (!LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope, i)) {
                    if (f > 0.0f) {
                        fCoerceAtLeast = RangesKt.coerceAtMost(animationScope.getValue().floatValue(), f);
                    } else {
                        fCoerceAtLeast = RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), f);
                    }
                    float f2 = fCoerceAtLeast - floatRef.element;
                    float fScrollBy = scrollScope.scrollBy(f2);
                    if (!LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope, i) && !AnonymousClass2.invokeSuspend$isOvershot(z, lazyLayoutAnimateScrollScope, i, i)) {
                        if (f2 != fScrollBy) {
                            animationScope.cancelAnimation();
                            booleanRef.element = false;
                            return;
                        }
                        floatRef.element += f2;
                        if (z) {
                            if (animationScope.getValue().floatValue() > f) {
                                animationScope.cancelAnimation();
                            }
                        } else if (animationScope.getValue().floatValue() < (-f)) {
                            animationScope.cancelAnimation();
                        }
                        if (z) {
                            if (intRef.element >= 2) {
                                int lastVisibleItemIndex = i - lazyLayoutAnimateScrollScope.getLastVisibleItemIndex();
                                int i2 = i;
                                if (lastVisibleItemIndex > i2) {
                                    lazyLayoutAnimateScrollScope.snapToItem(scrollScope, i - i2, 0);
                                }
                            }
                        } else if (intRef.element >= 2) {
                            int firstVisibleItemIndex = lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex();
                            int i3 = i;
                            int i4 = firstVisibleItemIndex - i3;
                            int i5 = i;
                            if (i4 > i5) {
                                lazyLayoutAnimateScrollScope.snapToItem(scrollScope, i3 + i5, 0);
                            }
                        }
                    }
                }
                if (AnonymousClass2.invokeSuspend$isOvershot(z, lazyLayoutAnimateScrollScope, i, i)) {
                    lazyLayoutAnimateScrollScope.snapToItem(scrollScope, i, i);
                    booleanRef.element = false;
                    animationScope.cancelAnimation();
                    return;
                }
                if (LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope, i)) {
                    throw new ItemFoundInScroll(MathKt.roundToInt(lazyLayoutAnimateScrollScope.calculateDistanceTo(i)), objectRef.element);
                }
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$5 */
        /* JADX INFO: compiled from: LazyAnimateScroll.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDZc|\u0004O\u000b8\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015ia<TgX.\u0001T:\u0011{{b&\n$8KтY\u001a\u0004%"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"\u001c\u001fsa\u000f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass5 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
            final /* synthetic */ ScrollScope $$this$scroll;
            final /* synthetic */ Ref.FloatRef $prevValue;
            final /* synthetic */ float $target;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(float f2, Ref.FloatRef floatRef, ScrollScope scrollScope) {
                super(1);
                f = f2;
                floatRef = floatRef;
                scrollScope = scrollScope;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                invoke2(animationScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                float f2 = f;
                float fCoerceAtLeast = 0.0f;
                if (f2 > 0.0f) {
                    fCoerceAtLeast = RangesKt.coerceAtMost(animationScope.getValue().floatValue(), f);
                } else if (f2 < 0.0f) {
                    fCoerceAtLeast = RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), f);
                }
                float f3 = fCoerceAtLeast - floatRef.element;
                if (f3 != scrollScope.scrollBy(f3) || fCoerceAtLeast != animationScope.getValue().floatValue()) {
                    animationScope.cancelAnimation();
                }
                floatRef.element += f3;
            }
        }
    }

    public static final Object animateScrollToItem(LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i2, int i3, int i4, Density density, Continuation<? super Unit> continuation) {
        Object objScroll = lazyLayoutAnimateScrollScope.scroll(new AnonymousClass2(i2, density, lazyLayoutAnimateScrollScope, i3, i4, null), continuation);
        return objScroll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }
}
