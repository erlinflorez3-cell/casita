package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
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
/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яċ\u0014D57\u001eqܜLDyt\fǻ\u000e0!.Jչ*,(w\u000f߿r9FDmH4R[*%k\u00044:[,qIS]\u001a\u0014\"\u0011OTlonXc\u0013C%\u0006\u001exp/QU\u000f]\u001a\u000f8Dw?IMwމA`\u000b6\r 8#@y\u001b\u0001\"*N\u0010~zYK\u0014۵8@\u0007:Z\r[\u000b\"\u0012\u001c>(\u0001$_oNLHt]@2+\u0003\u007fBV'e2\u0003ձ#Ͽ|)\u0013Ǹo\u001d[FG7%%\u001a\u00025R\u0014?V\u00142`\u000bؒ719J\f]FZ\u0010\u0014Kۀ}\u000fmv4_\u001dQ\u000f\u00107/]hcP<.Þ~{\u001bCL.\u0014Z`.[N\u0017\f\u001ch\rr\u0002J\u0001\u0006lU\u0018z\u0010@]%Ƨ2ٿݰ\u001fhW\u0018IP\u0017L\n=%\u001eQ:\u001f%i\u000f&`CV\u001bvΦ5SFyV\fR#K,\u001cp\u0011AZ\b>\b\u0018/*?^!3xs?3#{\u0002vx\u001695\u007fv\u0017\u0002mXQ2}D|Ҋ\r\u0016`\u000bt\u000bq\u0018dZ2\u0017sdd\t\u000e\bAe\u000b<\u00035ڰ\u000fʚћlkp\u0017kTmxt\u0003qn\u001aZ\b=lsMQ\u0012>\u0012\\\u0005UWBr\u0007hfp\b:\u001d\rG0\u007f`\u0006 \t\fS|QƱ6IwbD27`l\u0017N\tD\u000bQ~\u0019_\t.>C\u001bG˭\u0002ǭ˨x\u000b\u0007\u001fj@8|\u0007\u001aD|\u000f]UA\u007fpI,cs\u00016\u0013\"5Q:éI8lUT\u0005\u001e\u0006W\f D$OP]FiÂ\u000bȞ6\u000e5զdtk\\[\u001eG|\u0003\u0007\u001dI9Fu\u000b\u0003pZdAߑ[ݚ\u001b.~ܥ\u000b%\u000es\u000e\n\u0002H\u0001Xqf[sL\\\u000b\u0003\bF\u0005xSā!ɀ$˚ɴ!{ީ1G?\u001f\u001c\f\"Desk\u007f\b.0ʬEzKИ\u0006Нg\u001a\bdWt@S\tag\u0004V\"RrYܪTܖ{\u0014JކL\u000f9aO~\u0011X>h\u0019KN\u0016\u0015J%p\u0005ej\u0017}\u001bL.\u000e4*\u0002<R5ƺѨ\u0011µR܊ȓlJů\u000fZ\u0017\f\u0011\u001e?\u0012*\u001eC?dl\u0003\u000b6&\u00029\u0007eI\u0007\u001dN\u0019&D,rފ\u001bKdo\u0016\u0012\u000b\u007fti= `gJĪXոX~dƇ`\u0007fknHz\u0013\r7K\u001e/߶gYD܅Vвg6\u0019U#2)\u0003 \u0017t&CJd;+(\u000f۞9G4ŞKΜ:\nOӣ\u0006mu6FCM3PD39\u007f>\bv^\rA\u0016;̲fʝ\u0016jjP(X\r+M$J;'\u000bG|\u001bo\u0011[\u0003\u000fN̂Eױ\u0005\u001b\\+\r>\u000b\u0014˭\u001b6\u000e83ֳe\u0019\u0013/{]rȵ\u0002]é$5\u0012K9\\\u0006;\u0007\fcͩH\u0015Hпȗ\u0002"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006R.9ay/7ls8VR;tC\r\"djG\u000br0X\u007f\u0015EVY,@Z}Di", "!", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006R.9ay/7ls8VR;tC\r\"djG\u000br0X\u007f\u0015EVY,2", "BqP;f0MW#\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=s", "1n]AX5M/ \u0003|g4|\u0012>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W*2\u0011\u0007bI$wS\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011\n\u0019?Q2lU#Fu[KUq\th\u0019_\u001bk>D-i5\n", "/mX:T;>R\u0007\u0003\u0010^", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc\u000ea0FO(~yL0\u0012\tma\t,\u0004<\u0010\u001b!Pi\u001b<}%1g}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d41h}u", "Adc\u000ea0FO(~yL0\u0012\tma\t,\u0004<\u0010\u001b!Pi\u001b<}%1g}", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW*\u0006!DYSc(", "5dc\u0010b5MS\"\u000eVe0~\u00127e\t7", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`rNs\u0010E~%>hS", "Adc\u0010b5MS\"\u000eVe0~\u00127e\t7", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJr\u001eKq\u0017Dv.D/A\u0011", "1ta?X5MA\u001d\u0014z", "5dc\u0010h9KS\"\u000ehbA|P#b\u00140b\r\u0003", "u(9", "7mXA\\(EA(z\n^", "5dc\u0016a0MW\u0015\u0006hm(\f\t", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "5dc\u0019T@Hc(]~k,z\u00183o\tfwI\u0005\u001f\u0013Vs\u0018Ep25`}\u001cEm", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", "Adc\u0019T@Hc(]~k,z\u00183o\tfwI\u0005\u001f\u0013Vs\u0018Ep25`}\u001cEm", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W#r9?i\r~;z\u0016,\\GEt\na\u0006", "\nrTA \u0006\u0017", ";dP@h9>R\u0007\u0003\u0010^", "5dc\u001aX(Lc&~yL0\u0012\tvY|<\u0004'M\u0019UCx\u0012Dr49c\u0007\u001aDm\u001d.IQ;", "Adc\u001aX(Lc&~yL0\u0012\tvo\u00150\u00115kzUCx\u0012Dr49c\u0007\u001aDm\u001d.IQ;", "uI\u0018#", ";dP@h9>R\u0007\u0003\u0010^j{\t6e\u0002$\u000b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "B`a4X;,W.~bZ7", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r DU\u00129#", "5dc!T9@S(l~s,d\u0005:${1\u007fH|&\u001bQx\bIv,5U\f ", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`~W~\n9}%#Wy/Fm#\u0016IN\u0011", "B`a4X;,b\u0015\u000ez", "5dc!T9@S(l\nZ;|", "5dc!e(Ga\u001d\u000e~h5;\u00058i\b$\u000bD\u000b \u0011To\u0015<r35", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\#*VQ?z8(\u001e>", "7r;2Y;", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006R.9ay/7ls8VR;tC\r\"djG\u000br0X\u007f\u0015EVY,\u001b@yA\u0013\u00129\u0012[+\u000b\u0014]K-D", "7r;2Y;\u0006U\u000b\tKE\u0011K", "uH\u0018'", "7rA6Z/M", "7rA6Z/M\u001b\u001bp\u0005/\u0013aW", "1`[0h3:b\u0019h{_:|\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "4t[9F0SS", "1`[0h3:b\u0019h{_:|\u0018ve\b1k<}v", "uI9u=", "1qT.g,,W.~Vg0\u0005\u0005>i\n1cJ\u007f\u001b\u0018Ko\u001b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "1n]AX5MB&z\u0004l-\u0007\u00167", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006T/>h})F\\#*VQ<uA&j", "1qT.g,,W.~Vg0\u0005\u0005>i\n1cJ\u007f\u001b\u0018Ko\u001bzr.9ay/;w\u001f(ZCBk0,\u0015", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u0003?b\r @|\u0005;ILIl>+\u001d>H5\u0010b9Xz&Z\u0016L6d]|K\u0014[g\u001eW:\u0011\rY\u000b\u0002xLB)\u0016,VW\u001f,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icC/KDf+h\flr", "AkX1X\u0010Gb#\\\u0005g;x\r8e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V.DY\u000b\u000fDi\u001f<QR?u=s", "Bnf.e+L", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "7mXA\\(E=\u001a\u007f\t^;", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "=eU@X;\u001f]&_\u000be3j\u00103d\u007f", "AkX1X\u0010Gb#\\\u0005g;x\r8e\ro\u0004*\u0004si2_", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001N\u001a7QR;G=\"\u001ddp=\u0011l\u001aYv%\u001d3T6kYvF]\u0017k\u0016\u0018,\u001d\u000eWP(xMEhh<R\u007fJl\u000b\u0015acxQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bAk.l\bn!fC\u0004\u0004\u001d\u0001\u0019(W]*\u0013\nW v\\\u0003=", "AkX1X\u0016Nb\u0003\u007fXh5\f\u00053n\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006V89hl-3v$2\\GEt\n", "B`a4X;(T\u001a\rzm", "AkX1X\u0016Nb\u0003\u007fXh5\f\u00053n\u007f5CHj\u001as\u001aZ}", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001N\u001a7QR;G=\"\u001ddp=\u0011l\u001aYv%\u001d3T6kYvF]\u0017k\u0016\u0018,\u001d\u000eWP(xMEhh<R\u007fJl\u000b\u0015acxQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bAk.l\bn!fC\u0004\u0004'u(\nuL7\u0018\u007fb\u0015|[O", "CrX;Z", "Ahi2G9:\\'\u007f\u0005k4", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d)JYl-3v$/WPCA", "\u0011gX9W\u000b:b\u0015", "!hi2@6=W\u001a\u0003zk", "/mX:T;B]\"x\b^3|\u0005=e", "Ag^B_+\u001a\\\u001d\u0007vm,j\rDe"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnimatedContentTransitionScopeImpl<S> implements AnimatedContentTransitionScope<S> {
    public static final int $stable = 8;
    private State<IntSize> animatedSize;
    private Alignment contentAlignment;
    private LayoutDirection layoutDirection;
    private final MutableState measuredSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m6800boximpl(IntSize.Companion.m6813getZeroYbymL2g()), null, 2, null);
    private final MutableScatterMap<S, State<IntSize>> targetSizeMap = ScatterMapKt.mutableScatterMapOf();
    private final Transition<S> transition;

    public AnimatedContentTransitionScopeImpl(Transition<S> transition, Alignment alignment, LayoutDirection layoutDirection) {
        this.transition = transition;
        this.contentAlignment = alignment;
        this.layoutDirection = layoutDirection;
    }

    public final Transition<S> getTransition$animation_release() {
        return this.transition;
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public Alignment getContentAlignment() {
        return this.contentAlignment;
    }

    public void setContentAlignment(Alignment alignment) {
        this.contentAlignment = alignment;
    }

    public final LayoutDirection getLayoutDirection$animation_release() {
        return this.layoutDirection;
    }

    public final void setLayoutDirection$animation_release(LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public ContentTransform using(ContentTransform contentTransform, SizeTransform sizeTransform) {
        contentTransform.setSizeTransform$animation_release(sizeTransform);
        return contentTransform;
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    /* JADX INFO: renamed from: slideIntoContainer-mOhB8PU */
    public EnterTransition mo378slideIntoContainermOhB8PU(int i2, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, final Function1<? super Integer, Integer> function1) {
        return m397isLeftgWo6LJ4(i2) ? EnterExitTransitionKt.slideInHorizontally(finiteAnimationSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Integer invoke(int i3) {
                return function1.invoke(Integer.valueOf(IntSize.m6808getWidthimpl(this.m396getCurrentSizeYbymL2g()) - IntOffset.m6766getXimpl(this.m395calculateOffsetemnUabE(IntSizeKt.IntSize(i3, i3), this.m396getCurrentSizeYbymL2g()))));
            }
        }) : m398isRightgWo6LJ4(i2) ? EnterExitTransitionKt.slideInHorizontally(finiteAnimationSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Integer invoke(int i3) {
                return function1.invoke(Integer.valueOf((-IntOffset.m6766getXimpl(this.m395calculateOffsetemnUabE(IntSizeKt.IntSize(i3, i3), this.m396getCurrentSizeYbymL2g()))) - i3));
            }
        }) : AnimatedContentTransitionScope.SlideDirection.m383equalsimpl0(i2, AnimatedContentTransitionScope.SlideDirection.Companion.m392getUpDKzdypw()) ? EnterExitTransitionKt.slideInVertically(finiteAnimationSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Integer invoke(int i3) {
                return function1.invoke(Integer.valueOf(IntSize.m6807getHeightimpl(this.m396getCurrentSizeYbymL2g()) - IntOffset.m6767getYimpl(this.m395calculateOffsetemnUabE(IntSizeKt.IntSize(i3, i3), this.m396getCurrentSizeYbymL2g()))));
            }
        }) : AnimatedContentTransitionScope.SlideDirection.m383equalsimpl0(i2, AnimatedContentTransitionScope.SlideDirection.Companion.m387getDownDKzdypw()) ? EnterExitTransitionKt.slideInVertically(finiteAnimationSpec, new Function1<Integer, Integer>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideIntoContainer$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Integer invoke(int i3) {
                return function1.invoke(Integer.valueOf((-IntOffset.m6767getYimpl(this.m395calculateOffsetemnUabE(IntSizeKt.IntSize(i3, i3), this.m396getCurrentSizeYbymL2g()))) - i3));
            }
        }) : EnterTransition.Companion.getNone();
    }

    /* JADX INFO: renamed from: isLeft-gWo6LJ4, reason: not valid java name */
    private final boolean m397isLeftgWo6LJ4(int i2) {
        return AnimatedContentTransitionScope.SlideDirection.m383equalsimpl0(i2, AnimatedContentTransitionScope.SlideDirection.Companion.m389getLeftDKzdypw()) || (AnimatedContentTransitionScope.SlideDirection.m383equalsimpl0(i2, AnimatedContentTransitionScope.SlideDirection.Companion.m391getStartDKzdypw()) && this.layoutDirection == LayoutDirection.Ltr) || (AnimatedContentTransitionScope.SlideDirection.m383equalsimpl0(i2, AnimatedContentTransitionScope.SlideDirection.Companion.m388getEndDKzdypw()) && this.layoutDirection == LayoutDirection.Rtl);
    }

    /* JADX INFO: renamed from: isRight-gWo6LJ4, reason: not valid java name */
    private final boolean m398isRightgWo6LJ4(int i2) {
        return AnimatedContentTransitionScope.SlideDirection.m383equalsimpl0(i2, AnimatedContentTransitionScope.SlideDirection.Companion.m390getRightDKzdypw()) || (AnimatedContentTransitionScope.SlideDirection.m383equalsimpl0(i2, AnimatedContentTransitionScope.SlideDirection.Companion.m391getStartDKzdypw()) && this.layoutDirection == LayoutDirection.Rtl) || (AnimatedContentTransitionScope.SlideDirection.m383equalsimpl0(i2, AnimatedContentTransitionScope.SlideDirection.Companion.m388getEndDKzdypw()) && this.layoutDirection == LayoutDirection.Ltr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculateOffset-emnUabE, reason: not valid java name */
    public final long m395calculateOffsetemnUabE(long j2, long j3) {
        return getContentAlignment().mo3783alignKFBX0sM(j2, j3, LayoutDirection.Ltr);
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    /* JADX INFO: renamed from: slideOutOfContainer-mOhB8PU */
    public ExitTransition mo379slideOutOfContainermOhB8PU(int i2, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, final Function1<? super Integer, Integer> function1) {
        return m397isLeftgWo6LJ4(i2) ? EnterExitTransitionKt.slideOutHorizontally(finiteAnimationSpec, new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$1
            final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Integer invoke(int i3) {
                State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                return function1.invoke(Integer.valueOf((-IntOffset.m6766getXimpl(this.this$0.m395calculateOffsetemnUabE(IntSizeKt.IntSize(i3, i3), state != null ? ((IntSize) state.getValue()).m6812unboximpl() : IntSize.Companion.m6813getZeroYbymL2g()))) - i3));
            }
        }) : m398isRightgWo6LJ4(i2) ? EnterExitTransitionKt.slideOutHorizontally(finiteAnimationSpec, new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$2
            final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Integer invoke(int i3) {
                State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                long jM6812unboximpl = state != null ? ((IntSize) state.getValue()).m6812unboximpl() : IntSize.Companion.m6813getZeroYbymL2g();
                return function1.invoke(Integer.valueOf((-IntOffset.m6766getXimpl(this.this$0.m395calculateOffsetemnUabE(IntSizeKt.IntSize(i3, i3), jM6812unboximpl))) + IntSize.m6808getWidthimpl(jM6812unboximpl)));
            }
        }) : AnimatedContentTransitionScope.SlideDirection.m383equalsimpl0(i2, AnimatedContentTransitionScope.SlideDirection.Companion.m392getUpDKzdypw()) ? EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec, new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$3
            final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Integer invoke(int i3) {
                State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                return function1.invoke(Integer.valueOf((-IntOffset.m6767getYimpl(this.this$0.m395calculateOffsetemnUabE(IntSizeKt.IntSize(i3, i3), state != null ? ((IntSize) state.getValue()).m6812unboximpl() : IntSize.Companion.m6813getZeroYbymL2g()))) - i3));
            }
        }) : AnimatedContentTransitionScope.SlideDirection.m383equalsimpl0(i2, AnimatedContentTransitionScope.SlideDirection.Companion.m387getDownDKzdypw()) ? EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec, new Function1<Integer, Integer>(this) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$slideOutOfContainer$4
            final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Integer invoke(int i3) {
                State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
                long jM6812unboximpl = state != null ? ((IntSize) state.getValue()).m6812unboximpl() : IntSize.Companion.m6813getZeroYbymL2g();
                return function1.invoke(Integer.valueOf((-IntOffset.m6767getYimpl(this.this$0.m395calculateOffsetemnUabE(IntSizeKt.IntSize(i3, i3), jM6812unboximpl))) + IntSize.m6807getHeightimpl(jM6812unboximpl)));
            }
        }) : ExitTransition.Companion.getNone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getMeasuredSize-YbymL2g$animation_release, reason: not valid java name */
    public final long m399getMeasuredSizeYbymL2g$animation_release() {
        return ((IntSize) this.measuredSize$delegate.getValue()).m6812unboximpl();
    }

    /* JADX INFO: renamed from: setMeasuredSize-ozmzZPI$animation_release, reason: not valid java name */
    public final void m400setMeasuredSizeozmzZPI$animation_release(long j2) {
        this.measuredSize$delegate.setValue(IntSize.m6800boximpl(j2));
    }

    public final MutableScatterMap<S, State<IntSize>> getTargetSizeMap$animation_release() {
        return this.targetSizeMap;
    }

    public final State<IntSize> getAnimatedSize$animation_release() {
        return this.animatedSize;
    }

    public final void setAnimatedSize$animation_release(State<IntSize> state) {
        this.animatedSize = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getCurrentSize-YbymL2g, reason: not valid java name */
    public final long m396getCurrentSizeYbymL2g() {
        State<IntSize> state = this.animatedSize;
        return state != null ? state.getValue().m6812unboximpl() : m399getMeasuredSizeYbymL2g$animation_release();
    }

    public final Modifier createSizeAnimationModifier$animation_release(ContentTransform contentTransform, Composer composer, int i2) {
        Modifier.Companion companion;
        ComposerKt.sourceInformationMarkerStart(composer, 93755870, "C(createSizeAnimationModifier)574@27302L40,575@27371L52:AnimatedContent.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(93755870, i2, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:573)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -546171924, "CC(remember):AnimatedContent.kt#9igjgp");
        boolean zChanged = composer.changed(this);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(contentTransform.getSizeTransform(), composer, 0);
        if (Intrinsics.areEqual(this.transition.getCurrentState(), this.transition.getTargetState())) {
            createSizeAnimationModifier$lambda$3(mutableState, false);
        } else if (stateRememberUpdatedState.getValue() != null) {
            createSizeAnimationModifier$lambda$3(mutableState, true);
        }
        if (createSizeAnimationModifier$lambda$2(mutableState)) {
            composer.startReplaceGroup(249037309);
            ComposerKt.sourceInformation(composer, "585@27840L48,586@27901L205");
            Transition.DeferredAnimation deferredAnimationCreateDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(this.transition, VectorConvertersKt.getVectorConverter(IntSize.Companion), null, composer, 0, 2);
            ComposerKt.sourceInformationMarkerStart(composer, -546152591, "CC(remember):AnimatedContent.kt#9igjgp");
            boolean zChanged2 = composer.changed(deferredAnimationCreateDeferredAnimation);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                SizeTransform sizeTransform = (SizeTransform) stateRememberUpdatedState.getValue();
                objRememberedValue2 = ((sizeTransform == null || sizeTransform.getClip()) ? ClipKt.clipToBounds(Modifier.Companion) : Modifier.Companion).then(new SizeModifier(deferredAnimationCreateDeferredAnimation, stateRememberUpdatedState));
                composer.updateRememberedValue(objRememberedValue2);
            }
            companion = (Modifier) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(249353726);
            composer.endReplaceGroup();
            this.animatedSize = null;
            companion = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return companion;
    }

    private static final boolean createSizeAnimationModifier$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void createSizeAnimationModifier$lambda$3(MutableState<Boolean> mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: compiled from: AnimatedContent.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLш|\u0004O\u000f8\u000b4G\u0007\":ߚ\u007f\u0007|jA0JeN\u008chݷZ\u000f\u001azt/k(\u007fCSUH~̀\rO\\i0\u0003Xb#C=\u000f>x\u00196y[\u0007h*\u0011HA\u001eHya@fG`\r63!b&F|\u001d\u0001H+~T5?\u001až×\u0012ضD\u0001BT\u0013S\u0013!*\bD \u000f\"|iT;VnӀ>;"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006R.9ay/7ls8VR;tC\r\"djG\u000br0X\u007f\u0015EVY,@Z}DRo]\u0012U*k\u0001h=y", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a!BY\u0007/\u0016i%*5M:o5\"\u0015u7", "7rC.e.>b", "", "uY\u0018#", "\nrTA \u0006\u0017", "u(I", "Adc!T9@S(", "7rC.e.>bW}ze,~\u0005>e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", ";nS6Y@)O&~\u0004m\u000bx\u0018+", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", ">`a2a;\u001dO(z", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ChildData implements ParentDataModifier {
        public static final int $stable = 0;
        private final MutableState isTarget$delegate;

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public Object modifyParentData(Density density, Object obj) {
            return this;
        }

        public ChildData(boolean z2) {
            this.isTarget$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z2), null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean isTarget() {
            return ((Boolean) this.isTarget$delegate.getValue()).booleanValue();
        }

        public final void setTarget(boolean z2) {
            this.isTarget$delegate.setValue(Boolean.valueOf(z2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: AnimatedContent.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLш|\u0004W\u00068\u000bDB\u0007\"B\u0012\u007f\u0007|jAӄLe^.ZS@\u000fs{:(c$\bCCU0}*ޛWN}gvϺb\u000bY\u000f\u000e\u0016~k2ղW\u000fزB\u000f`A0pCg}=Qv\u00058\u0015 `$H{\u0015\u0001H-v\u0011G\u0001SM\u001c\u0012fϋ\u001f>b\u0019[\n2\u001a\u0016B0\u00034[\u0016UdNǰa:=+K\u000eP[?_^\u000bu\rtcW\u0011\u0005q6+nHe\u00193e\u001b\u0007\u0001n\u0006\u0017Ճpܵݾl)-?W\t([f\u007f,+;Q\u001d]!(l\u0007a`:*YP4Q`\u00108w1Ԉ;@Ǭ\u0012\f/ΞF/ o\u0016\u0018\u0004\f\u0001XXX\u0012bR\u0002\u0011`d\u001eS\u0006Ĵ/?#ƘicA$\\Cީ\u0005\u0012&&\u0007ͻ=\nS\u05fed+"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006R.9ay/7ls8VR;tC\r\"djG\u000br0X\u007f\u0015EVY,@Z}DR\u007f^#N\u0013\u0017\u0004]B(nQ\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006]!Ic\u000e/\u001fw\u00152NG;x&\"$kL5\u0015q\u001bQ\u00041WNQ\u0010ea\u007fA\u001d ^\f\\\u0001", "Ahi245B[\u0015\u000e~h5", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\shb9\u0014p,MR0KTJ;`\\{\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFSB\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=s", "Ahi2G9:\\'\u007f\u0005k4", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d)JYl-3v$/WPCA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u0001>]\u0006\u001cFm\u0015\fWLJk=-\u0004u]B\u0015g;R\u000105JX7\\6zH\u001bgA\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005d\n\u0010\u001e\nDnzK \u000eQ\u0007\u0015?06dOgc\tKKN!\td\r_*i:9\u007f\u001du!\u0017wT8\u0013Q:\r{Q\u0007qkF,D6.FxeTE9bL}6#S{A\u007fAT\u0004+Jpt", "5dc \\A>/\"\u0003\u0003Z;\u0001\u00138", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\#*VQ?z8(\u001e'@9\bc9[v&#UR4XavG\u001dg", "5dc \\A>B&z\u0004l-\u0007\u00167", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d41h}u", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNAA |TD\u001b\u00053IW ,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCN=Yl:sUG\u001dXHJ1\u0014^\u0019)xW=_", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    final class SizeModifier extends LayoutModifierWithPassThroughIntrinsics {
        private final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
        private final State<SizeTransform> sizeTransform;

        /* JADX WARN: Multi-variable type inference failed */
        public SizeModifier(Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, State<? extends SizeTransform> state) {
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = state;
        }

        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.ui.layout.LayoutModifier
        /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
        public MeasureResult mo401measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
            final long jM6812unboximpl;
            final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(j2);
            Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation = this.sizeAnimation;
            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = AnimatedContentTransitionScopeImpl.this;
            Function1<Transition.Segment<S>, FiniteAnimationSpec<IntSize>> function1 = new Function1<Transition.Segment<S>, FiniteAnimationSpec<IntSize>>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final FiniteAnimationSpec<IntSize> invoke(Transition.Segment<S> segment) {
                    FiniteAnimationSpec<IntSize> finiteAnimationSpecMo460createAnimationSpecTemP2vQ;
                    State<IntSize> state = animatedContentTransitionScopeImpl.getTargetSizeMap$animation_release().get(segment.getInitialState());
                    long jM6812unboximpl2 = state != null ? state.getValue().m6812unboximpl() : IntSize.Companion.m6813getZeroYbymL2g();
                    State<IntSize> state2 = animatedContentTransitionScopeImpl.getTargetSizeMap$animation_release().get(segment.getTargetState());
                    long jM6812unboximpl3 = state2 != null ? state2.getValue().m6812unboximpl() : IntSize.Companion.m6813getZeroYbymL2g();
                    SizeTransform value = this.getSizeTransform().getValue();
                    return (value == null || (finiteAnimationSpecMo460createAnimationSpecTemP2vQ = value.mo460createAnimationSpecTemP2vQ(jM6812unboximpl2, jM6812unboximpl3)) == null) ? AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null) : finiteAnimationSpecMo460createAnimationSpecTemP2vQ;
                }
            };
            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl2 = AnimatedContentTransitionScopeImpl.this;
            State<IntSize> stateAnimate = deferredAnimation.animate(function1, new Function1<S, IntSize>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntSize invoke(Object obj) {
                    return IntSize.m6800boximpl(m402invokeYEO4UFw(obj));
                }

                /* JADX INFO: renamed from: invoke-YEO4UFw, reason: not valid java name */
                public final long m402invokeYEO4UFw(S s2) {
                    State<IntSize> state = animatedContentTransitionScopeImpl2.getTargetSizeMap$animation_release().get(s2);
                    return state != null ? state.getValue().m6812unboximpl() : IntSize.Companion.m6813getZeroYbymL2g();
                }
            });
            AnimatedContentTransitionScopeImpl.this.setAnimatedSize$animation_release(stateAnimate);
            if (measureScope.isLookingAhead()) {
                jM6812unboximpl = IntSizeKt.IntSize(placeableMo5514measureBRTryo0.getWidth(), placeableMo5514measureBRTryo0.getHeight());
            } else {
                jM6812unboximpl = stateAnimate.getValue().m6812unboximpl();
            }
            int iM6808getWidthimpl = IntSize.m6808getWidthimpl(jM6812unboximpl);
            int iM6807getHeightimpl = IntSize.m6807getHeightimpl(jM6812unboximpl);
            final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl3 = AnimatedContentTransitionScopeImpl.this;
            return MeasureScope.layout$default(measureScope, iM6808getWidthimpl, iM6807getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifier$measure$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.m5578place70tqf50$default(placementScope, placeableMo5514measureBRTryo0, animatedContentTransitionScopeImpl3.getContentAlignment().mo3783alignKFBX0sM(IntSizeKt.IntSize(placeableMo5514measureBRTryo0.getWidth(), placeableMo5514measureBRTryo0.getHeight()), jM6812unboximpl, LayoutDirection.Ltr), 0.0f, 2, null);
                }
            }, 4, null);
        }
    }
}
