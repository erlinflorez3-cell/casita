package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4E\u0007\"B\u0012\u007f\u0007|jA0JeP.hS2\u000fq{<$i$yCAV\"}8\tWNmntJpŏs\u000f4\u00159\u000e<Mcxu\u0012=3RsM5eok:pxD\b82P9\n\t\u000f\u001eBH>wټGK\u001a\u0017xV~Gj\r{\u0013J\u0018\u0014M8\u00034[\u0016Y|Ԧ+Һ>/1\u00132L\\8w6\rO\u001dF\u0003(;\t**9SO5C3\u001a\u038bEқ_?\u0011S:n\u0013}?'YW$[DX\u0018\u0014C,\u007f\u0011kt>\\3R\u0011\u00105.gcyQ>,\u0006~\u0014\rj\u0005T\u0381eЗ-Ʀբj\n\u0014I\u0003\n\u001cY^\u001avB.{\n8-$.>q9ՎePƞ:ϊ\u05ee;}\u000b&,=Q\u0007/al\u001ap\u0017+T&RASP=vV8`\u0014Ъ\u0006Ͳf\u00022ʶ\u0001[\u000e/\u0014\u0011\\\u0018{ڞg߶\"ܩɶ\u0001Gזkx\r`v\\:fVD:nD8\u0001¡\u0018˧Cߟ̆jOԜ\\.\u0019M*]W\u0012\u0016\u00168\\&=wغ\u001c̓NŖʂiLύ\u000e'7fEb?y\u001caQ`I4\u007fnfУ^λ\u0018?DϵUltDk\f\t]~β>̄iݘɧzC«\u0010\u0015:?\u007f%\u0005:?%t\u0017^\u0002LM\u0018Ҕ\u0015ރ^h\u0018зԡ3-\u000bl*ڱ%/Odpu\u0007֗MG"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006W,?U\r$@oq,\\GEt\u0011.$wkBfj,_r6KVW\beVz9#\u000eW\u0015N\u0001", "", "2dU.h3M3 ~\fZ;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", ">qT@f,=3 ~\fZ;\u0001\u00138", "6ne2e,=3 ~\fZ;\u0001\u00138", "4nRBf,=3 ~\fZ;\u0001\u00138", "uE5\u00139\u0013D](\u0006~gu\u0002\u001a7/\u00041\u000b@\u000e \u0013N9l<w!E`\r}Av$=ZS9z>+|dn?\u0007p\u0002\u0012g", "/mX:T;:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\?8r4s", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "\u0014", ":`bAG(KU\u0019\u000e^g;|\u0016+c\u000f,\u0006I", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6WL", "B`a4X;\"\\(~\bZ*\f\r9n", "/mX:T;>3 ~\fZ;\u0001\u00138", "", "Bn", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u0018'$hn5\u0005r0X\u007f|.RX;cV{\u0007\u0012\u001cg\u0018^:\u0011\u000eYOmLN@.\f5Y}Jl\u000b\u0015kQ\u001colSRYNu\u001ew\u000b\u0013eKY]\t\u001d", "/rBAT;>", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "AmP=83>d\u0015\u000e~h5", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "CoS.g,\u001eZ\u0019\u0010vm0\u0007\u0012", "CoS.g,\u001eZ\u0019\u0010vm0\u0007\u0012vl^<II\u000er", "uE5\u00139\u0013D](\u0006~guz\u0013<o\u00107\u007fI\u0001%`%y\u0017Kz.EU\r$Avkq4H7|0g\u001cdj;PM)Sv%V\"", "1`[0h3:b\u0019mvk.|\u0018", "1`[0h3:b\u0019mvk.|\u0018vuL8\u0006.p~", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u0018'$hn5\u0005r0X\u007f|\u000b-", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class FloatingActionButtonElevationAnimatable {
    private final Animatable<Dp, AnimationVector1D> animatable;
    private float defaultElevation;
    private float focusedElevation;
    private float hoveredElevation;
    private Interaction lastTargetInteraction;
    private float pressedElevation;
    private Interaction targetInteraction;

    /* JADX INFO: renamed from: androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1 */
    /* JADX INFO: compiled from: FloatingActionButton.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKd\f\u0010\u0003\u0017\r\u0013\rg\u000b\u001d\u0013\u001a\u001an##$  w \u001a,\u0018,\"))|+',!5#%0*", f = "\u00138:+=15-\u0006'7+0.\u0001310*(f#+", i = {0, 0}, l = {650}, m = "0>:?4H:\u001bC=O;OELL", n = {"c^kY", "ce"}, s = {"xQ^", "xQ_"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FloatingActionButtonElevationAnimatable.this.animateElevation(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1 */
    /* JADX INFO: compiled from: FloatingActionButton.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKd\f\u0010\u0003\u0017\r\u0013\rg\u000b\u001d\u0013\u001a\u001an##$  w \u001a,\u0018,\"))|+',!5#%0*", f = "\u00138:+=15-\u0006'7+0.\u0001310*(f#+", i = {0}, l = {636}, m = "B>2B\u0018@:L8LBII", n = {"c^kY"}, s = {"xQ^"})
    static final class C06391 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C06391(Continuation<? super C06391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return FloatingActionButtonElevationAnimatable.this.snapElevation(this);
        }
    }

    public /* synthetic */ FloatingActionButtonElevationAnimatable(float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5);
    }

    private FloatingActionButtonElevationAnimatable(float f2, float f3, float f4, float f5) {
        this.defaultElevation = f2;
        this.pressedElevation = f3;
        this.hoveredElevation = f4;
        this.focusedElevation = f5;
        this.animatable = new Animatable<>(Dp.m6636boximpl(this.defaultElevation), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
    }

    /* JADX INFO: renamed from: calculateTarget-u2uoSUM */
    private final float m2139calculateTargetu2uoSUM(Interaction interaction) {
        return interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : this.defaultElevation;
    }

    /* JADX INFO: renamed from: updateElevation-lDy3nrA */
    public final Object m2140updateElevationlDy3nrA(float f2, float f3, float f4, float f5, Continuation<? super Unit> continuation) throws Throwable {
        this.defaultElevation = f2;
        this.pressedElevation = f3;
        this.hoveredElevation = f4;
        this.focusedElevation = f5;
        Object objSnapElevation = snapElevation(continuation);
        return objSnapElevation == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSnapElevation : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object snapElevation(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.FloatingActionButtonElevationAnimatable.C06391
            if (r0 == 0) goto L25
            r5 = r7
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1 r5 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable.C06391) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L25
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L13:
            java.lang.Object r1 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L37
            if (r0 != r3) goto L2f
            java.lang.Object r2 = r5.L$0
            androidx.compose.material3.FloatingActionButtonElevationAnimatable r2 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable) r2
            goto L2b
        L25:
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1 r5 = new androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1
            r5.<init>(r7)
            goto L13
        L2b:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Throwable -> L66
            goto L6d
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L37:
            kotlin.ResultKt.throwOnFailure(r1)
            androidx.compose.foundation.interaction.Interaction r0 = r6.targetInteraction
            float r2 = r6.m2139calculateTargetu2uoSUM(r0)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r0 = r6.animatable
            java.lang.Object r0 = r0.getTargetValue()
            androidx.compose.ui.unit.Dp r0 = (androidx.compose.ui.unit.Dp) r0
            float r0 = r0.m6652unboximpl()
            boolean r0 = androidx.compose.ui.unit.Dp.m6643equalsimpl0(r0, r2)
            if (r0 != 0) goto L71
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r1 = r6.animatable     // Catch: java.lang.Throwable -> L63
            androidx.compose.ui.unit.Dp r0 = androidx.compose.ui.unit.Dp.m6636boximpl(r2)     // Catch: java.lang.Throwable -> L63
            r5.L$0 = r6     // Catch: java.lang.Throwable -> L63
            r5.label = r3     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r1.snapTo(r0, r5)     // Catch: java.lang.Throwable -> L63
            if (r0 != r4) goto L6c
            return r4
        L63:
            r1 = move-exception
            r2 = r6
            goto L67
        L66:
            r1 = move-exception
        L67:
            androidx.compose.foundation.interaction.Interaction r0 = r2.targetInteraction
            r2.lastTargetInteraction = r0
            throw r1
        L6c:
            r2 = r6
        L6d:
            androidx.compose.foundation.interaction.Interaction r0 = r2.targetInteraction
            r2.lastTargetInteraction = r0
        L71:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonElevationAnimatable.snapElevation(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object animateElevation(androidx.compose.foundation.interaction.Interaction r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.material3.FloatingActionButtonElevationAnimatable.AnonymousClass1
            if (r0 == 0) goto L2f
            r5 = r8
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1 r5 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable.AnonymousClass1) r5
            int r0 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L2f
            int r0 = r5.label
            int r0 = r0 - r2
            r5.label = r0
        L19:
            java.lang.Object r2 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L41
            if (r0 != r3) goto L39
            java.lang.Object r7 = r5.L$1
            androidx.compose.foundation.interaction.Interaction r7 = (androidx.compose.foundation.interaction.Interaction) r7
            java.lang.Object r1 = r5.L$0
            androidx.compose.material3.FloatingActionButtonElevationAnimatable r1 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable) r1
            goto L35
        L2f:
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1 r5 = new androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1
            r5.<init>(r8)
            goto L19
        L35:
            kotlin.ResultKt.throwOnFailure(r2)     // Catch: java.lang.Throwable -> L76
            goto L6e
        L39:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L41:
            kotlin.ResultKt.throwOnFailure(r2)
            float r2 = r6.m2139calculateTargetu2uoSUM(r7)
            r6.targetInteraction = r7
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r0 = r6.animatable     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r0.getTargetValue()     // Catch: java.lang.Throwable -> L73
            androidx.compose.ui.unit.Dp r0 = (androidx.compose.ui.unit.Dp) r0     // Catch: java.lang.Throwable -> L73
            float r0 = r0.m6652unboximpl()     // Catch: java.lang.Throwable -> L73
            boolean r0 = androidx.compose.ui.unit.Dp.m6643equalsimpl0(r0, r2)     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L6d
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r1 = r6.animatable     // Catch: java.lang.Throwable -> L73
            androidx.compose.foundation.interaction.Interaction r0 = r6.lastTargetInteraction     // Catch: java.lang.Throwable -> L73
            r5.L$0 = r6     // Catch: java.lang.Throwable -> L73
            r5.L$1 = r7     // Catch: java.lang.Throwable -> L73
            r5.label = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = androidx.compose.material3.internal.ElevationKt.m2919animateElevationrAjV9yQ(r1, r2, r0, r7, r5)     // Catch: java.lang.Throwable -> L73
            if (r0 != r4) goto L6d
            return r4
        L6d:
            r1 = r6
        L6e:
            r1.lastTargetInteraction = r7
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L73:
            r0 = move-exception
            r1 = r6
            goto L77
        L76:
            r0 = move-exception
        L77:
            r1.lastTargetInteraction = r7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonElevationAnimatable.animateElevation(androidx.compose.foundation.interaction.Interaction, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final State<Dp> asState() {
        return this.animatable.asState();
    }
}
