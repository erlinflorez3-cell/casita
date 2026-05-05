package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Surface.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d̉=!4i\bDZc|\u0004G\u00078\u000b<B\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS8\u0018sڔ<$q$yّCU0}*\tUPog\u0005JbŏK\u000f\u001c\u0016\u0001̓4Ikxe\u0012\u00159JoU3UoC>htD\n(2(9\u0012ڠ\u007f(-`\u0010%~sU\u001a\u0017HF\u0001<b\r{\tH\u00186D&\u0001,c\u007fNdP\u001dc@/1\f\u0002B|1\u00106\u0003M\u001bQl';\u0003\u0012$1@EB-%\u0002\u00117Xa?\u0011N\n=3vW-1I\u0002gNX.\u0014E1U\rk\u0004>\\3Q\u0011\u0014-+]ucR$'&\u000e,\u0015B\u0004\u001c\u001a?JD,H{8\u001dA\u000b\u000b^PR\u0012^p\u0004)gي\u001b%\u0006Jq>Վeϟň?\u001bTO\n\u001e%\n1\u0004\u0007!\nX>f\u001b\u001bb~i1\u007fHmNT\ngH\u0006\u0004\u001fn20\n0U\rG{?<G+=[G29k0Vtm|\u0005nxki\u0001Hp(t\u0016E;!\f\tD\u0015\rqPbjD\u0013c\u001b\u0003\u001a.\u0017!6t\u0003L#5\u0010|S\u0017oҷQ]\u0010<ukǶXʤ«\u0012Y?xAPiӉ\u000foU\u000f\u0014m@\u0013\tf\u0003ZS:d\r207`p y\fD|\u0010A8ow\"4:81\\CP3$HA\u000b\u0012wZ\u0017\u001a/Z9$\u0011t<t7\r\u0001bvou\u0006a,+nR3GQC(>UPvd\u0003)\u0007\r\u0004\u0018G\u0016LwRr\u0016\u0004f\u0014 D\u001aiY5=!!\u0017+H\u0001[X|zkQ[&?|\u0013x=P\u0019=u\u001e\u0003{<bzJ}XE(Ցbr)\u001f+\u0005ّ`¿یKeZ(i\\aΟ\u0002g?f8+\tO\"3 \b\"+?]S5=.\u0004$1%a\fs\u007f0\nb=*#\u000742i\u0016}ii]`ChO_~L+<l1Lxp}\bP\u0014L\raTqjvVFZ#/,t72\u0013pdjR\u0013\u001e\fd4e*\u0002S\u0016\u0014\rCU\u0017SSu~\u0006K\u000b\u000bz\u0017\u0010\u000b\nC\u0007\u00142<Ni\bj\u000f0\u0014\b08W:\u0011\u001al\u00182JDG\u0018\rST\u0018\n>\u0001ķJ_\u0015.xGȶ:ٙոXzbsV'xenDB\u0001-\u001dc\"\u0007BI\u0005\u001cT\u00053qV\u0019SK\taḳ}ܺު/FZ^)Np7\u0019luCw\n^\u0004u1\u001eo}\u0017P\u0018+)r\u001c)ai\u0011\u000e\u0005`d\u0019g|Pzu@y\u0003R0:\u0017z+7\u0003\u000b݀\nÿ۽vqhWZy\u0018LQ\u05ce\u0019\u001dT+\u0017\f+ct\u001aұ\n;5֑al\u001a(\nYĚ;\u0003\u0010#&ږ # ǡ[:"}, d2 = {"\u001anR._\b;a#\u0006\u000bm,k\u00138a\u0007\b\u0003@\u0012\u0013&Ky\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xI\u000169Xy\u001d>ms8UNEy8-\u0019rj \u0011a(UL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0019b*:Zt{\th3\r\u0018/T\n1wG`\u001e\u0017Xk\u001d@\u0001.", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006a2?j\u0002\u001f3j\u001d.+MCv>,\u0019weC\u0010J6Lr.\u001d", "!ta3T*>", "", "=m29\\*D", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "3mP/_,=", "", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n]AX5M1#\u0006\u0005k", "Bn]._\fES*z\nb6\u0006", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "0na1X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "1n]AX5M", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "!ta3T*>\u001b#x[H\u0011{\u000b", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJi\u0007A\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005x\u0005U\u0018\u001b1usFT\u001e\u0011g\u0018qL)>+>@Z.=Na7n\u0010^0&8D,\u001f{'\u001b2Q8\u001a\u0005R\r\u0002V\u0004p1$#\b7$K[jSOuU\u0012[#(J\t\u0002\u00161k>)~5\u000f>86.\u0006Uw!=Z\b\u00196e\u000b+/E< ;IryvGWP/p\u0004\u000bi5\u0015\"tepD\r\u0016a!d#ko\u000e5R[%Oy$.J\b\f`\u000b\u001dR\b4vcXG%]\u000fcQT+] \u0007\rodq\u0015\u0012FX\u001cr.^J\u0017\u0011\u0013pC\u0016\nY\r\"\u0001Q\u001fqSr%5y,A\u0003\u001fI.\t/ Z\u00164", "!ta3T*>\u001b\bRWK\u0012P\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Ps0\u0018x4CWQ0Z`<+\u0017\u000ee\u000e$\u0010qe:( wCD)\f+\\K9r\t\u0017 \u001c54qLf\u0019Fu$yK22#clxGN3q7n\u0012_rC@D3\u001bu\"dma6S|c\u001apa}qpUb[H-<|_PN<+#p0\u001eX\u0006{\u0011E\"r5|8\u000eB*\u007fq\u0015Tv\u001cF^Br6dL146Ih#/'f", "Ad[2V;>R", "!ta3T*>\u001b\u0018QJ]3\u0002\u000f", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!gOtJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u0011\u0010_\u0010Bf{EZ\u000eUC\u0003x=4h\u001c>DZ((Ak)q\u0016c\u001co\u00048.\u001c|#)h\u001a/\u0014\f\\\u0010na}qp\u0011u\u0005E#>zIURy[<J\u000e\u001bTz\u0005\u001c6W\btr7\f?4DdNLq(G]t$0fJp*?K\u0013LGa\u0005pH\u00172\u0007q\u0017\n_<1|ntcU\u000b\u0005l\u001be>Oi\u0011DP\u0006\u00140u\u001f6M\u0003K%~&\u0011P%}nGR\u001f^\n(:%2h\u000f\u0012\u0007p!h\u0004|9b\u000eu4c6`\\\u0007r@\u0017\u0006gC^}X\u0019|Oz[!M.>\u0004\u001bW!@! Z6\u0007`", "1gT0^,=", "=m25X*DS\u0018\\}Z5~\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!gOtJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u0011\u0010_\u0010Bf{EZ\u000eUC\u0003x=4h\u001c>DZ((Ak)q\u0016c\u001co\u00048.\u001c|#)h\u001a/\u0014\f\\\u0010na}qp\u0011u\u0005E#>zIURy[<J\u000e\u001bTz\u0005\u001c6W\btr7\f?4DdNLq(G]t$0fJp*?K\u0013LGa\u0005pH\u00172\u0007q\u0017\n_<1|ntcU\u000b\u0005l\u001be>Oi\u0011DP\u0006\u00140u\u001f6M\u0003K%~&\u0011P%}nGR\u001f^\n(:%2h\u000f\u0012\u0007p!h\u0004|9b\u000eu4c6`\\\u0007r@\u0017\u0006gC^}X\u0019|Oz[!M.>\u0004\u001bW!@! Z6\u0007`", "Ata3T*>1#\u0006\u0005k\b\fh6e\u0011$\u000bD\u000b ", "3kTCT;B]\"", "Ata3T*>1#\u0006\u0005k\b\fh6e\u0011$\u000bD\u000b ^%V}\n[\u0006C", "uI5\u0019T5=`#\u0003yquz\u00137p\n6{\n\u000e' Vs\u0016<@\u0003?a\t*Em#\u00041\u0007 ", "Ata3T*>", "0`R8Z9Hc\"}Xh3\u0007\u0016", "", "Ata3T*>\u001b\fhBC\b\u000bx", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Ps0\u0018x4CWQ0Z`<+\u0017\u000ee\u000e$\u0010s\u0001b@1xH62Q*S\nFr\u000f\f_\u000f?zyAR\u001fK\u0004\u001e?\u001e3uEYlgVNOh*:l#\u0004XC91\u001eu\u0018.2N8\u0012\u0007]\u001fr\u001c\nk1/#y<%Bmh\u001c", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SurfaceKt {
    private static final ProvidableCompositionLocal<Dp> LocalAbsoluteTonalElevation = CompositionLocalKt.compositionLocalOf$default(null, new Function0<Dp>() { // from class: androidx.compose.material3.SurfaceKt$LocalAbsoluteTonalElevation$1
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Dp invoke() {
            return Dp.m6636boximpl(m2569invokeD9Ej5fM());
        }

        /* JADX INFO: renamed from: invoke-D9Ej5fM, reason: not valid java name */
        public final float m2569invokeD9Ej5fM() {
            return Dp.m6638constructorimpl(0);
        }
    }, 1, null);

    /* JADX INFO: renamed from: Surface-T9BRK9s */
    public static final void m2561SurfaceT9BRK9s(Modifier modifier, Shape shape, long j2, long j3, float f2, float f3, BorderStroke borderStroke, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2, int i3) {
        final BorderStroke borderStroke2 = borderStroke;
        final float fM6638constructorimpl = f3;
        final Modifier.Companion companion = modifier;
        final long jM1933getSurface0d7_KjU = j2;
        final Shape rectangleShape = shape;
        ComposerKt.sourceInformationMarkerStart(composer, -513881741, "C(Surface)P(4,6,1:c#ui.graphics.Color,3:c#ui.graphics.Color,7:c#ui.unit.Dp,5:c#ui.unit.Dp)96@5014L11,97@5061L22,*103@5278L7,107@5451L741,104@5307L885:Surface.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            companion = Modifier.Companion;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            rectangleShape = RectangleShapeKt.getRectangleShape();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            jM1933getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1933getSurface0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            j3 = ColorSchemeKt.m1947contentColorForek8zF_U(jM1933getSurface0d7_KjU, composer, (i2 >> 6) & 14);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            f2 = Dp.m6638constructorimpl(0);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            fM6638constructorimpl = Dp.m6638constructorimpl(0);
        }
        if ((i3 & 64) != 0) {
            borderStroke2 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-513881741, i2, -1, "androidx.compose.material3.Surface (Surface.kt:102)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final float fM6638constructorimpl2 = Dp.m6638constructorimpl(((Dp) objConsume).m6652unboximpl() + f2);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(j3)), providableCompositionLocal.provides(Dp.m6636boximpl(fM6638constructorimpl2))}, ComposableLambdaKt.rememberComposableLambda(-70914509, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                ComposerKt.sourceInformation(composer2, "C114@5653L69,*116@5825L7,108@5461L725:Surface.kt#uh7d8r");
                if ((i4 + 3) - (3 | i4) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-70914509, i4, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:108)");
                    }
                    Modifier modifier2 = companion;
                    Shape shape2 = rectangleShape;
                    long jM2568surfaceColorAtElevationCLU3JFs = SurfaceKt.m2568surfaceColorAtElevationCLU3JFs(jM1933getSurface0d7_KjU, fM6638constructorimpl2, composer2, 0);
                    BorderStroke borderStroke3 = borderStroke2;
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume2 = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(SurfaceKt.m2567surfaceXOJAsU(modifier2, shape2, jM2568surfaceColorAtElevationCLU3JFs, borderStroke3, ((Density) objConsume2).mo710toPx0680j_4(fM6638constructorimpl)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1.2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                        }
                    }), Unit.INSTANCE, new AnonymousClass3(null));
                    Function2<Composer, Integer, Unit> function22 = function2;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierPointerInput);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer2);
                    Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1154533166, "C125@6167L9:Surface.kt#uh7d8r");
                    function22.invoke(composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }

            /* JADX INFO: renamed from: androidx.compose.material3.SurfaceKt$Surface$1$3, reason: invalid class name */
            /* JADX INFO: compiled from: Surface.kt */
            /* JADX INFO: loaded from: classes.dex */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKq\u0015\u0013\b\u0004\u0007\np\u001bK{\u001f\u001d\u0012\u000e\u0011\u0014SaUe", f = " A=0*+,s08", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
            static final class AnonymousClass3 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                int label;

                AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
        }, composer, 54), composer, (-1) - (((-1) - ProvidedValue.$stable) & ((-1) - 48)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* JADX INFO: renamed from: Surface-o_FOJdg */
    public static final void m2564Surfaceo_FOJdg(final Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, long j2, long j3, float f2, float f3, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2, int i3, int i4) {
        final BorderStroke borderStroke2 = borderStroke;
        final float fM6638constructorimpl = f3;
        final long jM1933getSurface0d7_KjU = j2;
        final Shape rectangleShape = shape;
        final boolean z3 = z2;
        final Modifier.Companion companion = modifier;
        ComposerKt.sourceInformationMarkerStart(composer, -789752804, "C(Surface)P(7,6,4,9,1:c#ui.graphics.Color,3:c#ui.graphics.Color,10:c#ui.unit.Dp,8:c#ui.unit.Dp!1,5)196@10536L11,197@10583L22,*204@10857L7,208@11030L853,205@10886L997:Surface.kt#uh7d8r");
        if ((i4 & 2) != 0) {
            companion = Modifier.Companion;
        }
        if ((i4 & 4) != 0) {
            z3 = true;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
            rectangleShape = RectangleShapeKt.getRectangleShape();
        }
        if ((i4 & 16) != 0) {
            jM1933getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1933getSurface0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 32)) != 0) {
            j3 = ColorSchemeKt.m1947contentColorForek8zF_U(jM1933getSurface0d7_KjU, composer, (i2 >> 12) & 14);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
            f2 = Dp.m6638constructorimpl(0);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 128)) != 0) {
            fM6638constructorimpl = Dp.m6638constructorimpl(0);
        }
        if ((i4 & 256) != 0) {
            borderStroke2 = null;
        }
        final MutableInteractionSource mutableInteractionSource2 = (i4 & 512) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-789752804, i2, i3, "androidx.compose.material3.Surface (Surface.kt:203)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final float fM6638constructorimpl2 = Dp.m6638constructorimpl(((Dp) objConsume).m6652unboximpl() + f2);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(j3)), providableCompositionLocal.provides(Dp.m6636boximpl(fM6638constructorimpl2))}, ComposableLambdaKt.rememberComposableLambda(1279702876, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                ComposerKt.sourceInformation(composer2, "C216@11287L69,*218@11459L7,222@11649L32,209@11040L837:Surface.kt#uh7d8r");
                if ((-1) - (((-1) - i5) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1279702876, i5, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:209)");
                    }
                    Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(companion);
                    Shape shape2 = rectangleShape;
                    long jM2568surfaceColorAtElevationCLU3JFs = SurfaceKt.m2568surfaceColorAtElevationCLU3JFs(jM1933getSurface0d7_KjU, fM6638constructorimpl2, composer2, 0);
                    BorderStroke borderStroke3 = borderStroke2;
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume2 = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Modifier modifierM604clickableO2vRcR0$default = ClickableKt.m604clickableO2vRcR0$default(SurfaceKt.m2567surfaceXOJAsU(modifierMinimumInteractiveComponentSize, shape2, jM2568surfaceColorAtElevationCLU3JFs, borderStroke3, ((Density) objConsume2).mo710toPx0680j_4(fM6638constructorimpl)), mutableInteractionSource2, RippleKt.m2425rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z3, null, null, function0, 24, null);
                    Function2<Composer, Integer, Unit> function22 = function2;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM604clickableO2vRcR0$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer2);
                    Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1148887694, "C228@11858L9:Surface.kt#uh7d8r");
                    function22.invoke(composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* JADX INFO: renamed from: Surface-d85dljk */
    public static final void m2562Surfaced85dljk(final boolean z2, final Function0<Unit> function0, Modifier modifier, boolean z3, Shape shape, long j2, long j3, float f2, float f3, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2, int i3, int i4) {
        final BorderStroke borderStroke2 = borderStroke;
        final boolean z4 = z3;
        final float fM6638constructorimpl = f3;
        final Modifier.Companion companion = modifier;
        final long jM1933getSurface0d7_KjU = j2;
        final Shape rectangleShape = shape;
        ComposerKt.sourceInformationMarkerStart(composer, 540296512, "C(Surface)P(8,7,6,4,10,1:c#ui.graphics.Color,3:c#ui.graphics.Color,11:c#ui.unit.Dp,9:c#ui.unit.Dp!1,5)299@16163L11,300@16210L22,*307@16484L7,311@16657L899,308@16513L1043:Surface.kt#uh7d8r");
        if ((i4 & 4) != 0) {
            companion = Modifier.Companion;
        }
        if ((i4 + 8) - (i4 | 8) != 0) {
            z4 = true;
        }
        if ((i4 & 16) != 0) {
            rectangleShape = RectangleShapeKt.getRectangleShape();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 32)) != 0) {
            jM1933getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1933getSurface0d7_KjU();
        }
        if ((i4 & 64) != 0) {
            int i5 = i2 >> 15;
            j3 = ColorSchemeKt.m1947contentColorForek8zF_U(jM1933getSurface0d7_KjU, composer, (i5 + 14) - (i5 | 14));
        }
        if ((-1) - (((-1) - i4) | ((-1) - 128)) != 0) {
            f2 = Dp.m6638constructorimpl(0);
        }
        if ((i4 & 256) != 0) {
            fM6638constructorimpl = Dp.m6638constructorimpl(0);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 512)) != 0) {
            borderStroke2 = null;
        }
        final MutableInteractionSource mutableInteractionSource2 = (i4 + 1024) - (i4 | 1024) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(540296512, i2, i3, "androidx.compose.material3.Surface (Surface.kt:306)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final float fM6638constructorimpl2 = Dp.m6638constructorimpl(((Dp) objConsume).m6652unboximpl() + f2);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(j3)), providableCompositionLocal.provides(Dp.m6636boximpl(fM6638constructorimpl2))}, ComposableLambdaKt.rememberComposableLambda(-1164547968, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i6) {
                ComposerKt.sourceInformation(composer2, "C319@16914L69,*321@17086L7,326@17322L32,312@16667L883:Surface.kt#uh7d8r");
                if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1164547968, i6, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:312)");
                    }
                    Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(companion);
                    Shape shape2 = rectangleShape;
                    long jM2568surfaceColorAtElevationCLU3JFs = SurfaceKt.m2568surfaceColorAtElevationCLU3JFs(jM1933getSurface0d7_KjU, fM6638constructorimpl2, composer2, 0);
                    BorderStroke borderStroke3 = borderStroke2;
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume2 = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Modifier modifierM1270selectableO2vRcR0$default = SelectableKt.m1270selectableO2vRcR0$default(SurfaceKt.m2567surfaceXOJAsU(modifierMinimumInteractiveComponentSize, shape2, jM2568surfaceColorAtElevationCLU3JFs, borderStroke3, ((Density) objConsume2).mo710toPx0680j_4(fM6638constructorimpl)), z2, mutableInteractionSource2, RippleKt.m2425rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z4, null, function0, 16, null);
                    Function2<Composer, Integer, Unit> function22 = function2;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1270selectableO2vRcR0$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer2);
                    Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1143260078, "C332@17531L9:Surface.kt#uh7d8r");
                    function22.invoke(composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* JADX INFO: renamed from: Surface-d85dljk */
    public static final void m2563Surfaced85dljk(final boolean z2, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z3, Shape shape, long j2, long j3, float f2, float f3, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2, int i3, int i4) {
        final BorderStroke borderStroke2 = borderStroke;
        final float fM6638constructorimpl = f3;
        final Modifier.Companion companion = modifier;
        final long jM1933getSurface0d7_KjU = j2;
        final Shape rectangleShape = shape;
        final boolean z4 = z3;
        ComposerKt.sourceInformationMarkerStart(composer, -1877401889, "C(Surface)P(1,8,7,5,10,2:c#ui.graphics.Color,4:c#ui.graphics.Color,11:c#ui.unit.Dp,9:c#ui.unit.Dp!1,6)403@21903L11,404@21950L22,*411@22224L7,415@22397L909,412@22253L1053:Surface.kt#uh7d8r");
        if ((i4 & 4) != 0) {
            companion = Modifier.Companion;
        }
        if ((i4 + 8) - (i4 | 8) != 0) {
            z4 = true;
        }
        if ((i4 & 16) != 0) {
            rectangleShape = RectangleShapeKt.getRectangleShape();
        }
        if ((i4 & 32) != 0) {
            jM1933getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1933getSurface0d7_KjU();
        }
        if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
            j3 = ColorSchemeKt.m1947contentColorForek8zF_U(jM1933getSurface0d7_KjU, composer, (i2 >> 15) & 14);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 128)) != 0) {
            f2 = Dp.m6638constructorimpl(0);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 256)) != 0) {
            fM6638constructorimpl = Dp.m6638constructorimpl(0);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 512)) != 0) {
            borderStroke2 = null;
        }
        final MutableInteractionSource mutableInteractionSource2 = (-1) - (((-1) - i4) | ((-1) - 1024)) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877401889, i2, i3, "androidx.compose.material3.Surface (Surface.kt:410)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final float fM6638constructorimpl2 = Dp.m6638constructorimpl(((Dp) objConsume).m6652unboximpl() + f2);
        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(j3)), providableCompositionLocal.provides(Dp.m6636boximpl(fM6638constructorimpl2))};
        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(712720927, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                ComposerKt.sourceInformation(composer2, "C423@22654L69,*425@22826L7,430@23058L32,416@22407L893:Surface.kt#uh7d8r");
                if ((i5 + 3) - (3 | i5) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(712720927, i5, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:416)");
                    }
                    Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(companion);
                    Shape shape2 = rectangleShape;
                    long jM2568surfaceColorAtElevationCLU3JFs = SurfaceKt.m2568surfaceColorAtElevationCLU3JFs(jM1933getSurface0d7_KjU, fM6638constructorimpl2, composer2, 0);
                    BorderStroke borderStroke3 = borderStroke2;
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume2 = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Modifier modifierM1275toggleableO2vRcR0$default = ToggleableKt.m1275toggleableO2vRcR0$default(SurfaceKt.m2567surfaceXOJAsU(modifierMinimumInteractiveComponentSize, shape2, jM2568surfaceColorAtElevationCLU3JFs, borderStroke3, ((Density) objConsume2).mo710toPx0680j_4(fM6638constructorimpl)), z2, mutableInteractionSource2, RippleKt.m2425rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z4, null, function1, 16, null);
                    Function2<Composer, Integer, Unit> function22 = function2;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1275toggleableO2vRcR0$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer2);
                    Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1137556078, "C436@23281L9:Surface.kt#uh7d8r");
                    function22.invoke(composer2, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, composer, 54);
        int i5 = ProvidedValue.$stable;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, composableLambdaRememberComposableLambda, composer, (i5 + 48) - (i5 & 48));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* JADX INFO: renamed from: surface-XO-JAsU */
    public static final Modifier m2567surfaceXOJAsU(Modifier modifier, Shape shape, long j2, BorderStroke borderStroke, float f2) {
        Modifier.Companion companionM4339graphicsLayerAp8cVGQ$default;
        if (f2 > 0.0f) {
            companionM4339graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m4339graphicsLayerAp8cVGQ$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape, false, null, 0L, 0L, 0, 124895, null);
        } else {
            companionM4339graphicsLayerAp8cVGQ$default = Modifier.Companion;
        }
        return ClipKt.clip(BackgroundKt.m572backgroundbw27NRU(modifier.then(companionM4339graphicsLayerAp8cVGQ$default).then(borderStroke != null ? BorderKt.border(Modifier.Companion, borderStroke, shape) : Modifier.Companion), j2, shape), shape);
    }

    /* JADX INFO: renamed from: surfaceColorAtElevation-CLU3JFs */
    public static final long m2568surfaceColorAtElevationCLU3JFs(long j2, float f2, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -2079918090, "C(surfaceColorAtElevation)P(0:c#ui.graphics.Color,1:c#ui.unit.Dp)465@24025L11,465@24037L37:Surface.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079918090, i2, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)");
        }
        int i3 = i2 << 3;
        long jM1945applyTonalElevationRFCenO8 = ColorSchemeKt.m1945applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j2, f2, composer, (i3 + 1008) - (i3 | 1008));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return jM1945applyTonalElevationRFCenO8;
    }

    public static final ProvidableCompositionLocal<Dp> getLocalAbsoluteTonalElevation() {
        return LocalAbsoluteTonalElevation;
    }
}
