package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.ui.MotionDurationScale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "\u0013R\u00016\u0005yTlkLg\u000fX\u001akajM\u0019\r\u0011q\u001aYXKvkd}3x(RyPPpqHT", replaceWith = @ReplaceWith(expression = "androidx.compose.foundation.gestures.snapping.snapFlingBehavior", imports = {}))
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яl\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012\u0006\fnʑA0ZeP.XS2\u000f\u0002{<$a'yCI^\"Ԃ*\t]Ȟo˧vJh\u0011K\u000f\f\u0018\u0001jBI]xs\u0012\u00172XoG3SoE9vt>\u0005.2*8\u007f\t\t\u001a@H\u0018v\u0001ES\f(0Hp@R\u0013R\u001b܅B\u0006l\u001fAElk\\6`l\f;?-\u0011kZT7a@|{\u0011tW7\u0017\u0005f61P9E\u0015SW1\rқ_?\u0011F:N\u0013v?'YX$]Dh\u0018\u0016+*}\u001e$č&%\u000b_r$'Yb*_\u0019$6\f\u0013{;K4\u0012\u0014<`.[\u001e\u0017\f\u001cI\rr\u0002D\u0017\u0002'z\u000e\u0012yB''\u00103Y=+haai2|O$\u0005;8S\u0005|<sT<dE+b\u0014i=aBMH|\u000ei?}\u0004\u001f\u00010GJ΅\u0006Ĭ3{\u001fM_QE{Q#Oo*Hr\u0002'\tn\u0004ki\u0001Lp2|7O6\u0019\u000ejD\u0013\t{RdXZ/{9\u001bΌ<ݔ\u0017 j\u0017\u0005p32f[xkzM\f\u000e51v7\b\b\u001a&\u007f9\rMeUq3yR%\u0018o@p pfpW<yjL:MX{ \u0007*H«\u0010\u001d8d\u0002\":RA\u001bb\u001bn*.DQ|7}\t\u0006Vк\u0013տ(\u0003wL=I\u000fyt|\u007fi\tIZ\u0001p$=A\u007fNGP}\"\u0017N-'\u0015\u0014\f\u007fuk|KZ\u0003.u\u0004\u007fP&(di;M\u0015\u001f~W6\u0012/UL!\u0004\u007fjX\u06009܃}\u000fI\u0011~y\u0016l\t2plZO\u0003\u001bPy5г%ϋh\u007f\u0002ӓ\u0017\u0013Ukl\u000b\nG \u0380\u000fʾ@Z@و\u001d!$/\u000fzB~;9Q4m(\u0006\u0019G\u001bq_yo\\}\u0011\u0015|۬gנ0c\u001e˱3]k2S8wZUЙ$ٝp\u0003Jוܜ{4"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+'\u0010_7/}+PN+,_N\u0004A\u001e\u001f0", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w<?Hm4-\u0015gB@\u000bl.+v*C]R6i(", "AmP=?(R])\u000e^g-\u0007s<o\u0011,z@\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+'\u0010_75r;Q\\]\u0010eS|(!\u001ck\u0012M+\u001aZ", "2dR.l\bGW!z\nb6\u0006v:e}", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~7k\u0012B)L?s0-\u0019rj'\u0012c*$", "", "AmP=45B[\u0015\u000e~h5j\u0014/c", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u0017QDg?)\u0019qc\u0003tl(Y]#[V^;@[sG~\u001fd\u001fR*\r\u0012/( wCD)\f+\\K9r\t\u0017 \u001c54lKZ\u0018C\t\u0019\u007fJrfPf_C&AC^>@\u0015c%XI>.\u001d_$\u001bf&\u0015\u0006\u0005R\u001e|Vxz1E#\u0003C.Lm%BNs]8\u0004+)TEu\u001c?X>\u0007}1\f09:n\u000e9r\u0018<4<\u0006", ";nc6b5,Q\u0015\u0006z=<\n\u0005>i\n1", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!&Ky\u0017\u001b\u000721h\u0002*@[\u0014*TC\u0011", "5dc\u001ab;B]\"lxZ3|g?r{7\u007fJ\nU\u0018Q\u007f\u0017;r49c\u0007\u001aDm\u001d.IQ;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Q~\u0012F\u007f\u0004Efy/;w\u001f\u001cK?Bk\n", "Adc\u001ab;B]\"lxZ3|g?r{7\u007fJ\nU\u0018Q\u007f\u0017;r49c\u0007\u001aDm\u001d.IQ;", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Vs\u0018EU5BU\r$Av\u0004,IJ;Aw\u000f", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "7r32V(R/$\n\bh(z\f\u001ao\u000e6\u007f=\b\u0017", "=eU@X;", "Dd[<V0Mg", "4kX;Z", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+\u0015\u0010g4J\u0006+QU;,jbyLi", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "=mA2`(B\\\u001d\b|L*\n\u00136li)|N\u0001&\u0007Rn\nKv", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u001719x>%\u001cV_C\u0012c\u0002/]-Q[U0e\u001cwN\u001c[[\u001eW)\u001c\tcJ28%G(\u0006;M\fD4Vr\u001c\u0018DqtK \u000eQ\u0007\u001f\u0006P-qFg)WQJTf3t\bn!fC\u0010gzv\u0015,d\u001a5\u0006\u0005UZ\\O~geVn", ">da3b9F4 \u0003\u0004`", "=mA2`(B\\\u001d\b|=0\u000b\u0018+n}(kK\u007f\u0013&Gn", "@t]\u000ec7K]\u0015|}", "7mXA\\(EB\u0015\f|^;f\n0s\u007f7", "=m0;\\4:b\u001d\t\u0004L;|\u0014", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "2d[AT", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u001719x>%\u001cV_C\u0012c\u0002/W\u000eMV]3`[<B%\u001a$\u000f^4\u000b\u0014]K-|\u000e\u0018/\u0011*X\u0006EqLa|\u0014?ywF_YE\u0004\"\u007fQ8lOYmC%KNq.m\u001c[,`DCyWX\u001e\u0017yLw\u0011w\\\u0013<<vlgE(P", "Bqh\u000ec7K]\u0015|}", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"-\u0011wa\u000f", "CoS.g,+S!z~g0\u0006\u000b\u001dc\r2\u0003Gj\u0018\u0018Uo\u001d", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SnapFlingBehavior implements TargetedFlingBehavior {
    public static final int $stable = 0;
    private final DecayAnimationSpec<Float> decayAnimationSpec;
    private MotionDurationScale motionScaleDuration = ScrollableKt.getDefaultScrollMotionDurationScale();
    private final AnimationSpec<Float> snapAnimationSpec;
    private final SnapLayoutInfoProvider snapLayoutInfoProvider;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1, reason: invalid class name */
    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU\u001c\u0018\f\u001c\u001d\u0017\u001d\u0017^\u0005!\u0015%{#!'!|!%\u001f5)04", f = " :,:\u000f404,\u0006(*\"6(-/i&.", i = {0}, l = {123}, m = "5<:@:", n = {"^dTK_WKU?HM\u001d:L.2\u001f\u0006(\r%\u001c\u001b\u007f\u0007~\bvs"}, s = {"xQ^"})
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
            return SnapFlingBehavior.this.fling(null, 0.0f, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU\u001c\u0018\f\u001c\u001d\u0017\u001d\u0017^\u0005!\u0015%{#!'!|!%\u001f5)04", f = " :,:\u000f404,\u0006(*\"6(-/i&.", i = {}, l = {110}, m = "?5C8BFB\u001cCAGA", n = {}, s = {})
    static final class C04741 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04741(Continuation<? super C04741> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return SnapFlingBehavior.this.performFling(null, 0.0f, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SnapFlingBehavior.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU\u001c\u0018\f\u001c\u001d\u0017\u001d\u0017^\u0005!\u0015%{#!'!|!%\u001f5)04", f = " :,:\u000f404,\u0006(*\"6(-/i&.", i = {}, l = {187}, m = "CBJ\u0013CDGE8;A", n = {}, s = {})
    static final class C04751 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C04751(Continuation<? super C04751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnapFlingBehavior.this.tryApproach(null, 0.0f, 0.0f, null, this);
        }
    }

    public SnapFlingBehavior(SnapLayoutInfoProvider snapLayoutInfoProvider, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec) {
        this.snapLayoutInfoProvider = snapLayoutInfoProvider;
        this.decayAnimationSpec = decayAnimationSpec;
        this.snapAnimationSpec = animationSpec;
    }

    public final MotionDurationScale getMotionScaleDuration$foundation_release() {
        return this.motionScaleDuration;
    }

    public final void setMotionScaleDuration$foundation_release(MotionDurationScale motionDurationScale) {
        this.motionScaleDuration = motionDurationScale;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    @Override // androidx.compose.foundation.gestures.TargetedFlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object performFling(androidx.compose.foundation.gestures.ScrollScope r6, float r7, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r8, kotlin.coroutines.Continuation<? super java.lang.Float> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.C04741
            if (r0 == 0) goto L5a
            r4 = r9
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1 r4 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.C04741) r4
            int r0 = r4.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L5a
            int r0 = r4.label
            int r0 = r0 - r2
            r4.label = r0
        L19:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L4e
            if (r1 != r0) goto L60
            kotlin.ResultKt.throwOnFailure(r3)
        L29:
            androidx.compose.foundation.gestures.snapping.AnimationResult r3 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r3
            java.lang.Object r0 = r3.component1()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            androidx.compose.animation.core.AnimationState r2 = r3.component2()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L43
        L3e:
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)
            return r0
        L43:
            java.lang.Object r0 = r2.getVelocity()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            goto L3e
        L4e:
            kotlin.ResultKt.throwOnFailure(r3)
            r4.label = r0
            java.lang.Object r3 = r5.fling(r6, r7, r8, r4)
            if (r3 != r2) goto L29
            return r2
        L5a:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1 r4 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$performFling$1
            r4.<init>(r9)
            goto L19
        L60:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.performFling(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fling(androidx.compose.foundation.gestures.ScrollScope r12, float r13, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r14, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.snapping.AnimationResult<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r15) {
        /*
            r11 = this;
            r8 = r14
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.AnonymousClass1
            if (r0 == 0) goto L50
            r4 = r15
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r4 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.AnonymousClass1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L50
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L14:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L56
            java.lang.Object r8 = r4.L$0
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            kotlin.ResultKt.throwOnFailure(r3)
        L28:
            androidx.compose.foundation.gestures.snapping.AnimationResult r3 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r3
            r0 = 0
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r0)
            r8.invoke(r0)
            return r3
        L33:
            kotlin.ResultKt.throwOnFailure(r3)
            androidx.compose.ui.MotionDurationScale r0 = r11.motionScaleDuration
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1 r5 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1
            r10 = 0
            r6 = r11
            r7 = r13
            r9 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r4.L$0 = r8
            r4.label = r1
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r0, r5, r4)
            if (r3 != r2) goto L28
            return r2
        L50:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1 r4 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$1
            r4.<init>(r15)
            goto L14
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.fling(androidx.compose.foundation.gestures.ScrollScope, float, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object tryApproach(androidx.compose.foundation.gestures.ScrollScope r15, float r16, float r17, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r18, kotlin.coroutines.Continuation<? super androidx.compose.animation.core.AnimationState<java.lang.Float, androidx.compose.animation.core.AnimationVector1D>> r19) {
        /*
            r14 = this;
            r3 = r19
            boolean r0 = r3 instanceof androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.C04751
            if (r0 == 0) goto L66
            r4 = r3
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1 r4 = (androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.C04751) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L66
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
            r0 = r14
        L19:
            java.lang.Object r1 = r4.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L6d
            kotlin.ResultKt.throwOnFailure(r1)
        L29:
            androidx.compose.foundation.gestures.snapping.AnimationResult r1 = (androidx.compose.foundation.gestures.snapping.AnimationResult) r1
            androidx.compose.animation.core.AnimationState r0 = r1.getCurrentAnimationState()
        L2f:
            return r0
        L30:
            kotlin.ResultKt.throwOnFailure(r1)
            r5 = r16
            float r0 = java.lang.Math.abs(r5)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r6 = r17
            if (r0 != 0) goto L4d
        L40:
            r12 = 28
            r13 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            androidx.compose.animation.core.AnimationState r0 = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(r5, r6, r7, r9, r11, r12, r13)
            goto L2f
        L4d:
            float r0 = java.lang.Math.abs(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L56
            goto L40
        L56:
            r4.label = r2
            r7 = r14
            r11 = r18
            r8 = r15
            r9 = r5
            r10 = r6
            r12 = r4
            java.lang.Object r1 = r7.runApproach(r8, r9, r10, r11, r12)
            if (r1 != r3) goto L29
            return r3
        L66:
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1 r4 = new androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$tryApproach$1
            r0 = r14
            r4.<init>(r3)
            goto L19
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.tryApproach(androidx.compose.foundation.gestures.ScrollScope, float, float, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runApproach(ScrollScope scrollScope, float f2, float f3, Function1<? super Float, Unit> function1, Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
        TargetApproachAnimation targetApproachAnimation;
        if (isDecayApproachPossible(f2, f3)) {
            targetApproachAnimation = new DecayApproachAnimation(this.decayAnimationSpec);
        } else {
            targetApproachAnimation = new TargetApproachAnimation(this.snapAnimationSpec);
        }
        return SnapFlingBehaviorKt.approach(scrollScope, f2, f3, targetApproachAnimation, function1, continuation);
    }

    private final boolean isDecayApproachPossible(float f2, float f3) {
        return Math.abs(DecayAnimationSpecKt.calculateTargetValue(this.decayAnimationSpec, 0.0f, f3)) >= Math.abs(f2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SnapFlingBehavior)) {
            return false;
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) obj;
        return Intrinsics.areEqual(snapFlingBehavior.snapAnimationSpec, this.snapAnimationSpec) && Intrinsics.areEqual(snapFlingBehavior.decayAnimationSpec, this.decayAnimationSpec) && Intrinsics.areEqual(snapFlingBehavior.snapLayoutInfoProvider, this.snapLayoutInfoProvider);
    }

    public int hashCode() {
        return (((this.snapAnimationSpec.hashCode() * 31) + this.decayAnimationSpec.hashCode()) * 31) + this.snapLayoutInfoProvider.hashCode();
    }
}
