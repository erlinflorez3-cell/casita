package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: ScrollExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d̉=!,n\bDZc|\u0004G\u00068\u000bDB\u0007\"2\u0014\u007f\u0007tjAӄLe^.ZS0\u000f\u0004$Břs$ BcUH}R\r]O\u007fg\u001dI\u000b\u0017I\u000f\u0014\u0018\u0011p<Kex\f\u0011=5\tĪ}ݯQoK=x\rD\n82P7\"\u0005/\u001aZL\u001ew\u0013Cy\u000bXؚ~¤>R\u001bS\u001d4 \rV /&\u0005g|6xrc:=,\u001bipXmۆnƊQ\rT_ܴ\u0011\u0003"}, d2 = {"/mX:T;>A\u0017\f\u0005e3Y\u001d", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0011eh9tr(]v|", "D`[BX", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u001719x>%\u001cd^@\u0007Q;J\u0006'\u001d-5(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8@@#\u0010(X\u0006EqJ\n \u001b54LKZ\u0018C\t\u0019\u007fJ\u0017sFW5`MKTi.mU]'iDJ3\u0018z\u0019)2.8\u0013\u000bW\u001a\u0003N\tkqPn>\u001f):~W\u0010Lk^>>\u0011\u001cP{u!\b", "Aba<_3\u001bg", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u001719x>%\u001cd^@\u0007Q;J\u0006'\u001d-52fayA\u001d[X\u0018[5\u001d\u0014]J$|\u000e\u0015)\u0011;M\u000bKd\u0010\u0010 \u0017\u000b.WGR!CC\u001cqJ+20VdyEP\u001b", "As^=F*K] \u0006", "", "Aba<_3)`\u001d\t\bb;\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\rEhy/7X#2WP?zHs", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u001719x>%\u001cd^@\u0007Q;J\u0006'\u001d3J5[_|A\u0013%$\fX3\u0018\u000fgAmoNG(\u0007(X\u0006EqJs&\u001d1yp-c\u0014Q\u0007\u0019\u0005U~OLcn\u0001KJ\u000f`4q\u0016o,`C:2]O#$wT7\u001awb\u0015|[O+NL\u0015\f4mEidH\u000fYRAt%.!", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ScrollExtensionsKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 */
    /* JADX INFO: compiled from: ScrollExtensions.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU{\r\u001d\u001b\u0019\u001as(%\u0017!'\u001e%%+\u0004.", f = " /=954\f>9)15*/-1j'/", i = {0}, l = {40}, m = "0>:?4H:):JHFG\u001eV", n = {"_hg\\[eWZ,;R?<"}, s = {"xQ^"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return ScrollExtensionsKt.animateScrollBy(null, 0.0f, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 */
    /* JADX INFO: compiled from: ScrollExtensions.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU{\r\u001d\u001b\u0019\u001as(%\u0017!'\u001e%%+\u0004.", f = " /=954\f>9)15*/-1j'/", i = {0}, l = {61}, m = "B3CA?@\u0017O", n = {"RepYgcGK"}, s = {"xQ^"})
    static final class C04611 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C04611(Continuation<? super C04611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScrollExtensionsKt.scrollBy(null, 0.0f, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object animateScrollBy(androidx.compose.foundation.gestures.ScrollableState r10, float r11, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r12, kotlin.coroutines.Continuation<? super java.lang.Float> r13) {
        /*
            boolean r0 = r13 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt.AnonymousClass1
            if (r0 == 0) goto L4e
            r7 = r13
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r7 = (androidx.compose.foundation.gestures.ScrollExtensionsKt.AnonymousClass1) r7
            int r0 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L4e
            int r0 = r7.label
            int r0 = r0 - r1
            r7.label = r0
        L13:
            java.lang.Object r4 = r7.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r7.label
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L54
            java.lang.Object r1 = r7.L$0
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
            kotlin.ResultKt.throwOnFailure(r4)
        L27:
            float r0 = r1.element
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r0)
            return r0
        L2e:
            kotlin.ResultKt.throwOnFailure(r4)
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2 r6 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2
            r0 = 0
            r6.<init>(r11, r12, r1, r0)
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7.L$0 = r1
            r7.label = r2
            r5 = 0
            r8 = 1
            r9 = 0
            r4 = r10
            java.lang.Object r0 = androidx.compose.foundation.gestures.ScrollableState.scroll$default(r4, r5, r6, r7, r8, r9)
            if (r0 != r3) goto L4d
            return r3
        L4d:
            goto L27
        L4e:
            androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1 r7 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1
            r7.<init>(r13)
            goto L13
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy(androidx.compose.foundation.gestures.ScrollableState, float, androidx.compose.animation.core.AnimationSpec, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object animateScrollBy$default(ScrollableState scrollableState, float f2, AnimationSpec animationSpec, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animateScrollBy(scrollableState, f2, animationSpec, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2 */
    /* JADX INFO: compiled from: ScrollExtensions.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU{\r\u001d\u001b\u0019\u001as(%\u0017!'\u001e%%+\u0004.^\u001d+',!5'\u0016'7534\u000bCn}", f = " /=954\f>9)15*/-1j'/", i = {}, l = {41}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ Ref.FloatRef $previousValue;
        final /* synthetic */ float $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(float f2, AnimationSpec<Float> animationSpec, Ref.FloatRef floatRef, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$value = f2;
            this.$animationSpec = animationSpec;
            this.$previousValue = floatRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$value, this.$animationSpec, this.$previousValue, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2$1 */
        /* JADX INFO: compiled from: ScrollExtensions.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u0003\tI\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rfx2`UB\u000f\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "1ta?X5MD\u0015\u0006\u000b^", "", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzLo", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends Lambda implements Function2<Float, Float, Unit> {
            final /* synthetic */ ScrollScope $$this$scroll;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ScrollScope scrollScope) {
                super(2);
                scrollScope = scrollScope;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Float f2, Float f3) {
                invoke(f2.floatValue(), f3.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f2, float f3) {
                floatRef.element += scrollScope.scrollBy(f2 - floatRef.element);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                ScrollScope scrollScope = (ScrollScope) this.L$0;
                this.label = 1;
                if (SuspendAnimationKt.animate$default(0.0f, this.$value, 0.0f, this.$animationSpec, new Function2<Float, Float, Unit>() { // from class: androidx.compose.foundation.gestures.ScrollExtensionsKt.animateScrollBy.2.1
                    final /* synthetic */ ScrollScope $$this$scroll;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(ScrollScope scrollScope2) {
                        super(2);
                        scrollScope = scrollScope2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Float f2, Float f3) {
                        invoke(f2.floatValue(), f3.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f2, float f3) {
                        floatRef.element += scrollScope.scrollBy(f2 - floatRef.element);
                    }
                }, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
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

    /* JADX WARN: Removed duplicated region for block: B:37:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object scrollBy(androidx.compose.foundation.gestures.ScrollableState r10, float r11, kotlin.coroutines.Continuation<? super java.lang.Float> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.ScrollExtensionsKt.C04611
            if (r0 == 0) goto L54
            r7 = r12
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 r7 = (androidx.compose.foundation.gestures.ScrollExtensionsKt.C04611) r7
            int r0 = r7.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L54
            int r0 = r7.label
            int r0 = r0 - r2
            r7.label = r0
        L19:
            java.lang.Object r4 = r7.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r7.label
            r2 = 1
            if (r0 == 0) goto L34
            if (r0 != r2) goto L5a
            java.lang.Object r1 = r7.L$0
            kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref.FloatRef) r1
            kotlin.ResultKt.throwOnFailure(r4)
        L2d:
            float r0 = r1.element
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r0)
            return r0
        L34:
            kotlin.ResultKt.throwOnFailure(r4)
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2 r6 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2
            r0 = 0
            r6.<init>(r1, r11, r0)
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7.L$0 = r1
            r7.label = r2
            r5 = 0
            r8 = 1
            r9 = 0
            r4 = r10
            java.lang.Object r0 = androidx.compose.foundation.gestures.ScrollableState.scroll$default(r4, r5, r6, r7, r8, r9)
            if (r0 != r3) goto L53
            return r3
        L53:
            goto L2d
        L54:
            androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1 r7 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1
            r7.<init>(r12)
            goto L19
        L5a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(androidx.compose.foundation.gestures.ScrollableState, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2 */
    /* JADX INFO: compiled from: ScrollExtensions.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU{\r\u001d\u001b\u0019\u001as(%\u0017!'\u001e%%+\u0004.^/ 0.,-\u0004<gv", f = " /=954\f>9)15*/-1j'/", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C04622 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.FloatRef $consumed;
        final /* synthetic */ float $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04622(Ref.FloatRef floatRef, float f2, Continuation<? super C04622> continuation) {
            super(2, continuation);
            this.$consumed = floatRef;
            this.$value = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C04622 c04622 = new C04622(this.$consumed, this.$value, continuation);
            c04622.L$0 = obj;
            return c04622;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((C04622) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ScrollScope scrollScope = (ScrollScope) this.L$0;
            this.$consumed.element = scrollScope.scrollBy(this.$value);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$stopScroll$2 */
    /* JADX INFO: compiled from: ScrollExtensions.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU{\r\u001d\u001b\u0019\u001as(%\u0017!'\u001e%%+\u0004.^/1-/\u0013$4201ix", f = " /=954\f>9)15*/-1j'/", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C04632 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        int label;

        C04632(Continuation<? super C04632> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C04632(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((C04632) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object stopScroll$default(ScrollableState scrollableState, MutatePriority mutatePriority, Continuation continuation, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopScroll(scrollableState, mutatePriority, continuation);
    }

    public static final Object stopScroll(ScrollableState scrollableState, MutatePriority mutatePriority, Continuation<? super Unit> continuation) {
        Object objScroll = scrollableState.scroll(mutatePriority, new C04632(null), continuation);
        return objScroll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }
}
