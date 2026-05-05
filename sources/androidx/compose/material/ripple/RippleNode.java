package androidx.compose.material.ripple;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import com.drew.metadata.iptc.IptcDirectory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
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
/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яė\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.J~8,\u001aՄ\u000ff\u000198ǏmH<[[ճ\u0017k\u00124,Ӌ,qY;]ڼ\u0006\"\u001fOVg}nRZ\u0011F\u0017\u0006,xr,_U\u0001]\u0018\u0011:B\u0006?;Mu>A`\u000b6\r 8&@y\u001b\u0001\"ݒP\u0010\u0005\u007fKŷ\u0014\u0012>@xíZ\rc\u0005\"\u0012\fC(\u00014\\oN<Jt]P/+ɅqBd'gܞ\u0005M#F\\܋\u0015vw\u001e3¨=S+Ǭ\u0004\u00035Q\f?1?\"=3iW'YK4\tF\\\u000e\u0017-+}\u0011mv4a\u001dQ\u000f\u00127/]jcP<0\b~\n\u0016T\u0004<\u00107R<82l\u0018\u0010Ct!`n\\ؿbB\u000e\t*^%L\u00183YaKj_\u000bS\u0019|a,\t\u001bI;\u0001\u001d>\fX\u001c\u0006-\u001b\u0003\u001e\u0018UӾ?׀˓R\f_i{19p\u0010X\u001c0u(_\u007f\u001f]/%eo\u007f#iq\u0010x\\g%-'|\u001c\u0002`yX\"\u001d>g.\u00177rD\u001372dղW\u008cҭQ\u001eZ:\f<[.j-T!S8~Sv\u0013\u0003M\f4kS/Mg%\u0004\u000e\u0006a\u000f7Cz{\u0010\u0010\n'\u0018Mtz\u0005\u0007 \tSTdjb:2v\u00138w*\u007f\u0015 [<M.44ZYA\\C\u0006IB\u0013S\u000b\u000ewZ\u0017\u0016Uԣ5ʗ\u0007o,ڏ!\u0003Vk~\u007f8\u0005W5\u0015`P7\u0018ٞ7Ԋ*U*ֻ\u0005\t1\u0018\u0017s.M>չSƥp\u0016}ɝL,$\u001dQQ]AiÄ\u0001Ȟ6\u00025զ\u001d\u0005sce\u00187|\ry=O\u0017A>ŐlҔ0`r\u07ba h%)\u000f^!+^۰\u0002ّ`¿ܢFbӝ\u000f]FI\u0001\u0018*T\\C\u0015\u000b/ 5\u0001\u001e/+A\u0004σ)ޗ\u001a}\u001c٬-cc\u007f}EJw\u001d>\re2E\u001aZͪaГњ1:ΒM]\u0017@(>z\u001e\u0013lx\u0016 B7Q=7V]|p\u0005U\fK\u0006̓r÷+ݸÖUZǈ\u0017w\u00064<\u007fBuI\u001d\"y\u00147\u001fnkg\u001cs\"œMΊ\u0013\u0010\u0013֊Ip\u0018>K0'ep,H\b\n\u0017de\u0012أ\u0011Ø\r$<ɶ\r\u0014\u0019hli46QėRݍ\u0013\u0017:߿ǀ;_\u0016W~זrv\u0004hEf@Ǌ\u0005="}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC$u3\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9kF~0?g\u0002/;w\u001f\u0015WA7r\u0012(\u001evqA\u0007p\u0014Xu+HPN9E\\q=i", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9lIr7\u001dc|$8q\u0016;6M:k\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/EhY23z\u0016\u0016WB?l8\u001e\"Qk8\u00079", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6Wd1WYL,2", "0nd;W,=", "", "@`S6h:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DX#8LS9kAs", "@h_=_,\u001aZ$\u0002v", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i$q!9TC\u0017r?!\u0011>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u0018'$hn5\u0005r0X\u007f\u0015Q\\[*\\(g\u001ez\u000ec\r[5\u0011\u0004l\u000b\"xLB)\u0016,\u0013\u0012?2\u0003\u0019\u0012\u00198nnP mQ\u0001\u001f\u0003,6rEi]yT\u0017,h4s\u0013c&&?K,]r)$f_2\u0014\u0005aZSb\u0003evK#\u0004\u0003y%seULs^\u0006y8'\u0015\u007f\u0001!2e}'{vb4+2t\fZE\"Gl\b\"<ZP13\u001e8 EKpK0/", "5dc\u000fb<GR\u0019}", "u(I", "6`b#T3BR\u0007\u0003\u0010^", ">d]1\\5@7\"\u000ezk(z\u00183o\t6", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001eq$=#", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005VA\u001e#vEB\u0016c9Jt6KVW\u0002", "\u0014", "5dc\u001f\\7IZ\u0019Z\u0002i/x", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "@h_=_,\u001c] \t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "5dc\u001f\\7IZ\u0019\\\u0005e6\nPydQ\"aEp", "u(9", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "@h_=_,,W.~", "5dc\u001f\\7IZ\u0019l~s,Dq\u0012-\u0005%h>", "\u0018", "Ag^B_+\u001ac(\t^g=x\u00103d{7{", "5dc [6NZ\u0018Z\u000bm6`\u0012@a\u0007,z<\u0010\u0017", "AsPAX\u0013:g\u0019\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvWIz0@`}i%|\u0012=M*7\u007f4+j", "B`a4X;+O\u0018\u0003\u000bl", "", "/cS\u001f\\7IZ\u0019", "", "7mc2e(<b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005VA\u001e#vEB\u0016c9Jt6KVWjG_rK\"g", "Ahi2", "/cS\u001f\\7IZ\u0019FF+\u001a]\\\u000eM", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u001f+\u0015vo\u001d\u0010r,[r%VPX5\u001b=\u007f=\" 0r/n}", "6`]1_,)`\u0019\r\tB5\f\t<a}7\u007fJ\n", ">qT@f\u0010Gb\u0019\fv\\;\u0001\u00138", "=m0Ag(<V", "=mA2`,:a)\fz]", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "=mA2`,:a)\fz]s\u0007\u001e7zt\u0013_", "uI\u0018#", "@d\\<i,+W$\n\u0002^", "CoS.g,,b\u0015\u000ezE(\u0011\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6WL", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "2qPD", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", "2qPDE0I^ ~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", ";`c2e0:Z`\f~i7\u0004\t)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class RippleNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, DrawModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private final boolean bounded;
    private final ColorProducer color;
    private boolean hasValidSize;
    private final InteractionSource interactionSource;
    private final MutableObjectList<PressInteraction> pendingInteractions;
    private final float radius;
    private final Function0<RippleAlpha> rippleAlpha;
    private long rippleSize;
    private final boolean shouldAutoInvalidate;
    private StateLayer stateLayer;
    private float targetRadius;

    public /* synthetic */ RippleNode(InteractionSource interactionSource, boolean z2, float f2, ColorProducer colorProducer, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource, z2, f2, colorProducer, function0);
    }

    /* JADX INFO: renamed from: addRipple-12SF9DM */
    public abstract void mo1751addRipple12SF9DM(PressInteraction.Press press, long j2, float f2);

    public abstract void drawRipples(DrawScope drawScope);

    public abstract void removeRipple(PressInteraction.Press press);

    protected final boolean getBounded() {
        return this.bounded;
    }

    protected final Function0<RippleAlpha> getRippleAlpha() {
        return this.rippleAlpha;
    }

    private RippleNode(InteractionSource interactionSource, boolean z2, float f2, ColorProducer colorProducer, Function0<RippleAlpha> function0) {
        this.interactionSource = interactionSource;
        this.bounded = z2;
        this.radius = f2;
        this.color = colorProducer;
        this.rippleAlpha = function0;
        this.rippleSize = Size.Companion.m4015getZeroNHjbRc();
        this.pendingInteractions = new MutableObjectList<>(0, 1, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* JADX INFO: renamed from: getRippleSize-NH-jbRc */
    protected final long m1765getRippleSizeNHjbRc() {
        return this.rippleSize;
    }

    /* JADX INFO: renamed from: getRippleColor-0d7_KjU */
    public final long m1764getRippleColor0d7_KjU() {
        return this.color.mo2078invoke0d7_KjU();
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public void mo700onRemeasuredozmzZPI(long j2) {
        float fMo710toPx0680j_4;
        this.hasValidSize = true;
        Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
        this.rippleSize = IntSizeKt.m6820toSizeozmzZPI(j2);
        if (Float.isNaN(this.radius)) {
            fMo710toPx0680j_4 = RippleAnimationKt.m1756getRippleEndRadiuscSwnlzA(densityRequireDensity, this.bounded, this.rippleSize);
        } else {
            fMo710toPx0680j_4 = densityRequireDensity.mo710toPx0680j_4(this.radius);
        }
        this.targetRadius = fMo710toPx0680j_4;
        MutableObjectList<PressInteraction> mutableObjectList = this.pendingInteractions;
        Object[] objArr = mutableObjectList.content;
        int i2 = mutableObjectList._size;
        for (int i3 = 0; i3 < i2; i3++) {
            handlePressInteraction((PressInteraction) objArr[i3]);
        }
        this.pendingInteractions.clear();
    }

    /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleNode$onAttach$1 */
    /* JADX INFO: compiled from: Ripple.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bJ\u0010\b\u0010\u0011\u000e\bQv\u000f\u0017\u0018\u0015\u000fx\u001b\u0011\u0013R\u001f\u001fr'(\u0016\u0019\u001f[i", f = "\u001f5;:5-t19", i = {}, l = {IptcDirectory.TAG_ARM_VERSION}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = RippleNode.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.compose.material.ripple.RippleNode$onAttach$1$1 */
        /* JADX INFO: compiled from: Ripple.kt */
        /* JADX INFO: loaded from: classes.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f\u0097\u0011ޚ.\u0011q}B'"}, d2 = {"\n`]<a@F])\rS", "", "7mc2e(<b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6WL", "3lXA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u0018'$hn5\u0005r0X\u007f|.RX;cV{\u0007\u0012\u001cg\u0018^:\u0011\u000eYOmLN@.\f5Y}Jl\u000b\u0015kQ\u001colSRYNu\u001ew\u000b\u0013eKY]\t\u001d"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class C00691<T> implements FlowCollector {
            final /* synthetic */ CoroutineScope $$this$launch;

            C00691(CoroutineScope coroutineScope) {
                coroutineScope = coroutineScope;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Interaction) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(Interaction interaction, Continuation<? super Unit> continuation) {
                if (interaction instanceof PressInteraction) {
                    if (rippleNode.hasValidSize) {
                        rippleNode.handlePressInteraction((PressInteraction) interaction);
                    } else {
                        rippleNode.pendingInteractions.add(interaction);
                    }
                } else {
                    rippleNode.updateStateLayer(interaction, coroutineScope);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                this.label = 1;
                if (RippleNode.this.interactionSource.getInteractions().collect(new FlowCollector() { // from class: androidx.compose.material.ripple.RippleNode.onAttach.1.1
                    final /* synthetic */ CoroutineScope $$this$launch;

                    C00691(CoroutineScope coroutineScope2) {
                        coroutineScope = coroutineScope2;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Interaction) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Interaction interaction, Continuation<? super Unit> continuation) {
                        if (interaction instanceof PressInteraction) {
                            if (rippleNode.hasValidSize) {
                                rippleNode.handlePressInteraction((PressInteraction) interaction);
                            } else {
                                rippleNode.pendingInteractions.add(interaction);
                            }
                        } else {
                            rippleNode.updateStateLayer(interaction, coroutineScope);
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
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

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void handlePressInteraction(PressInteraction pressInteraction) {
        if (!(pressInteraction instanceof PressInteraction.Press)) {
            if (pressInteraction instanceof PressInteraction.Release) {
                removeRipple(((PressInteraction.Release) pressInteraction).getPress());
                return;
            } else {
                if (pressInteraction instanceof PressInteraction.Cancel) {
                    removeRipple(((PressInteraction.Cancel) pressInteraction).getPress());
                    return;
                }
                return;
            }
        }
        mo1751addRipple12SF9DM((PressInteraction.Press) pressInteraction, this.rippleSize, this.targetRadius);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        StateLayer stateLayer = this.stateLayer;
        if (stateLayer != null) {
            stateLayer.m1769drawStateLayermxwnekA(contentDrawScope, this.targetRadius, m1764getRippleColor0d7_KjU());
        }
        drawRipples(contentDrawScope);
    }

    public final void updateStateLayer(Interaction interaction, CoroutineScope coroutineScope) {
        StateLayer stateLayer = this.stateLayer;
        if (stateLayer == null) {
            stateLayer = new StateLayer(this.bounded, this.rippleAlpha);
            DrawModifierNodeKt.invalidateDraw(this);
            this.stateLayer = stateLayer;
        }
        stateLayer.handleInteraction$material_ripple_release(interaction, coroutineScope);
    }
}
