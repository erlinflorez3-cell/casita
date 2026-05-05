package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: ModalBottomSheet.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яğ\u0014D߬)\u001e\u007f\u007fLDit\fA\u001c0\u0013.H\u007f*, w\u000f߿r9FDm߉6Ri*\u0017ӆ\u00044:[,qI;]\u001a\u0014\"\u0011ѧVg}nRZ\u0011E\u0017\u0006,xrߚQU\u000f]\u001aƁ:B\u0006?;ݹw=O`|6\u001b :\"Ny\r\u0001 -P\u0010\u0005\u0004KK\u0012\u00158@\u0007:Z\rS\u0005\"\u0012\u001c>(ҵ&\\}N>HzbB/9\u0003qĩV'u0\u0005M\u0013F\\'#vi\u001e1C?5+%[\u0003\rTsϯ\u0002MvU\u0005\u0017-W5Wzo<h\u0002$\u0015YU;e#,b\u0005_i$'YY\u0014QV\u000e6\u0003\u0013{;H4\u0014\f'V;E\u001a\u0015\n>9zraNh\u0002\rQ0\u0001g6%5\u00183YJKlWaI+f7*\u0016=$)\u0001|4sT<bE!Zw_Ei@kY~\u001d_={\u0019\to\u0012,\u00140u\u0006Ez?6ϲ)7aOS2q\u0002V[\u007f\u0002\u0015bxS\u0018jvH̱r\u0016=@9\u0012`Dr\u001e\u0004P\u0003r\\+[7l\u001d\u000e\n# \u000b\u0015L#5\u0010|U\u0017\u0006ҷQ]\u0010;çj7_\r2\u0013Ŝ8Ӕۋ9Si/or\u000fBM]z\u0005\u0007lrW\u001a|t(PCxt\u001e~\u0014J^\u000e#2mwJ<\\5'\u007f-H1B\tBԊ\bݠ˖l\u0012\u0005yAJ\u001b\u00152\u001c!\u0001~h!umxWT\u0015`PQqc;\u00194~:tD~3\u0007-\u001e\u0010IwLup\u001b2<Zދ$\u0016(diɱ<!;\u0017)`\bUEz \u0016a[@?\u0007\r{\u001f;\u0017^w\nzpZ\u0012\u0019y\u007fX%T\u000f^!V8n\u000e.yL\u000bIsT9alQ#\"gqfS\r\u0016/-S1Ȟ&\u0007;cS-#M\b\u00165\u001b\b\u0016yq>y\u0011\u0015T\u0011\u0016\n2c$xzQ\f<k>OY\rI:$\u001b\u000frNpw\u0016O!4;5xGjpdFe\u000b]\r\u0017\r2\r~fs:A\u0001.:4_8\u0006[}Bos+\u0017Maz\u0006my^;]\u0015\n\u0019\u0011I{\"\u001eM \u0005]x\b^\u000e֯\u001c6GQ\u0013\u0016B\t2KDG\u0018\rST\u0018\u001e>\u0003ķJ_\u0015-b\\\u0002Vn$dzlVv\"pGp!X\u0007-+ʟ\"x;GܭqFZM*1ޥR߹͢\u001flU8t_CVbt3(\u000713E\f\u007fy\u0006DA_)\u001c\u001c6\fP*\u000b[Z\u0018Iiy\u0011\u000e3`b\u0019\u0013|N\u0013'Xfr\\0Ė\u0017z+\r\u0013\u0000\u0011Ո\u001dQzop-l\\\u00068[\u001a/\u0019\u001b͋\tѼ\u0001eN\u001b;\tU;KM\u0003\u0014U}.Ě=֞\f\"('\u0012wը\\\\\u0016i\u0010ܣ7h\u0015\u07b3\u001a\"֢\r\u001b^`\u001c.x%Iˡڙ\b"}, d2 = {"\u001eqT1\\*MW*~WZ*\u0003f2i\u0007'jM| %Hy\u001bD`29[\u0002)", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n$fy)En ;U-Ho6\"\u001e>", "\u0018", "\u001eqT1\\*MW*~WZ*\u0003p+xm&wG\u0001\nuK}\u001d8\u007f#5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u001eqT1\\*MW*~WZ*\u0003p+xm&wG\u0001\u000buK}\u001d8\u007f#5", "\u001bnS._\tHb(\t\u0003L/|\t>", "", "=m36f4Ba'kzj<|\u0017>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AgT2g\u001aMO(~", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d(5Y\r\u000eFi%.#", "AgT2g\u0014:f\u000b\u0003ym/", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n]AX5M1#\u0006\u0005k", "Bn]._\fES*z\nb6\u0006", "Aba6`\nHZ#\f", "2qP4;(GR ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "1n]AX5ME\u001d\byh>`\u0012=e\u000f6", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpG\\", ">q^=X9MW\u0019\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006^/4U\u0005|A|%8U1>k4-\u007fukD\u0007p;Rv5\u001d", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8TSCt\"\u001c\u001fsa\u000f", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u001bnS._\tHb(\t\u0003L/|\t>-~\u001cy\u000f\u0004%!", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJixV\u0017M8\u0017\tXTmlN?*\u0012:IKCd\u0010\f#\u00121q>\fD\u0013Gy$cP%wF/@`CJDo4h\u000brfZDB/\u001e\u007f\u0019dxTw\f\tO\u001cuVwu15\u001cvC$\u0014R@'*V[F\u0004.#TE|#:\"u;}+\u001384?rN,w!<m|\u001f5)\u0017\u000e,@K\u001aCT-z}FWi/j\u0006\u001df?:'/FsQ\r\u0016a!d\u00027F|@Q\u0013HMn(pD\tJf\u0004#\tP,itIP\u001fP\bg:,,^\r\n_p'+8\u001e+\\\u000fh9JDW\u001e\tuG\u0010{g\u0019{vR\u001ftO{%\\\u0001,\u007fy!R\u001fBOF\u007f`\rP \u001f2\u0010\u000f\t&A?)u?\u00122/AXK,^9\u0013r]0\u00191E,(<5\nR\nLh\u007f2\u001f\f\u000euRxA\"{r", "!ba6`", "1n[<e", "Dhb6U3>", "", "!ba6`s\f8`od2\u0014", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu,T\u00127LPEo31^fkA\u0012m:N@4WU]0dR<\u001b\u001e\u001ae\u0018\\+\u001aZ=\u0005\u0015", "@d\\2`)>`\u0001\tyZ3Y\u0013>t\n0iC\u0001\u0017&5~\nKv", "AjX=C(Kb\u001dz\u0002e@\\\u001c:a\t'{?", "1n]3\\9FD\u0015\u0006\u000b^\n\u007f\u00058g\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d(5Y\r\u00113t&.#", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u00047P[R4\\\u001cPG\u001c\u001dd\u001cN8bh=\u0005\u000bjM6,\u00120H\u0015\u0005f\u000b\u0014!\u0018Cj:JR\u001fG\u0007\u0019qHv24\\_yV/T^9da", "\u001bnS._\tHb(\t\u0003L/|\t>C\n1\u000b@\n&", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7r8`19u?\u001ej", ">qT1\\*MW*~WZ*\u0003s<o\u00025{N\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\?8r4s", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "/mX:T;>B#]~l4\u0001\u0017=", "AdcA_,-]w\u0003\tf0\u000b\u0017", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "Dd[<V0Mg", "\u001bnS._\tHb(\t\u0003L/|\t>C\n1\u000b@\n&^+[\u0014Nt\f\u0004", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\u000bWV)i>)\u0015>H5\u0010b9Xz&Z\u0016L6d]|K\u0014[V\u0017R3\t\u0014]K-8BA,\bu%\u000b?p|\u001b\u0012\u000b<jF)\\\u001aV\u0001\u0019~TrfPfi\nVENb8.ii*fJI(\u001dq\u0007\u0019r[._bY\u001b\u0002Y}p1L*\u0003\u0002%NvYUIy^J>\b/Ty\u0007\u0016<a?\u0001[3\u000eC1:mNPx \b_\t\u001e*kE1/D\u0006sOTa\u0005pH\u00174tH\u0004\u0017aB;\u001ddx-F\u0019\u000fh!i5+o\u0005\u0001:\u0010=Mp\u0019'ST)W\u0003\u0014\u0016\u0011(lx\u0013A%\\\f$~Dkg\r\u0012\u0003s\u001c\u00185c\u0007G\u0012h*n%\\\u000f\u0018h\u000elbUL\u0014}R\u0014l^<Yaw/@\u0007\u0011\u001317\u0015>\u0004NNr\u0014\u0014BJx\u0002\u0019~i\u0018^\u001bs\f+Gh?fix\u0010x[k\u001awA\u001a.1;\u000b`\nOn\u0001%$\u0002\u0018qIjDDB\u0011:ER4'Mk\u0015\u0006LcP\u001f0W\u001e=*U&KY\u00039TwZUj1\u0003\"#0/?L0od0v\u0015\n\u0019s'8)J9^\u001fK\"rRQgSB+\u000e\u000f/Pl\u0014_J'MBYR\u0005\u001f|\u0015\u000e]\u00156`7CAD\u0003,+O\u0012\u0013]4j\u0003\t\f", "1`[0h3:b\u0019i\b^+\u0001\u0007>i\u0011(X<~\u001d\u0005Ek\u0015<i", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<4?OkA\f\u0013rl9\\", ">q^4e,La", "1`[0h3:b\u0019i\b^+\u0001\u0007>i\u0011(X<~\u001d\u0005Ek\u0015<j", ";`c2e0:Zfx\b^3|\u0005=e", "/k_5T"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ModalBottomSheetKt {
    private static final float PredictiveBackMaxScaleXDistance = Dp.m6638constructorimpl(48);
    private static final float PredictiveBackMaxScaleYDistance = Dp.m6638constructorimpl(24);
    private static final long PredictiveBackChildTransformOrigin = TransformOriginKt.TransformOrigin(0.5f, 0.0f);

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ModalBottomSheet-dYc4hso */
    public static final void m2260ModalBottomSheetdYc4hso(final Function0<Unit> function0, Modifier modifier, SheetState sheetState, float f2, Shape shape, long j2, long j3, float f3, long j4, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, ? extends WindowInsets> function22, ModalBottomSheetProperties modalBottomSheetProperties, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        long scrimColor = j4;
        float fM6638constructorimpl = f3;
        long jM1947contentColorForek8zF_U = j3;
        long containerColor = j2;
        Shape expandedShape = shape;
        final SheetState sheetStateRememberModalBottomSheetState = sheetState;
        float fM1810getSheetMaxWidthD9Ej5fM = f2;
        ModalBottomSheetKt$ModalBottomSheet$1 modalBottomSheetKt$ModalBottomSheet$1 = function22;
        ModalBottomSheetProperties properties = modalBottomSheetProperties;
        Function2<? super Composer, ? super Integer, Unit> function2M1987getLambda1$material3_release = function2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(2132719801);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ModalBottomSheet)P(6,5,11,10:c#ui.unit.Dp,9,0:c#ui.graphics.Color,2:c#ui.graphics.Color,12:c#ui.unit.Dp,8:c#ui.graphics.Color,4,3,7)121@6012L31,123@6143L13,124@6206L14,125@6248L31,127@6356L10,133@6697L24,134@6761L327,145@7142L149,151@7326L42,155@7458L708,167@8231L771,153@7374L1628,193@9077L21,193@9050L48:ModalBottomSheet.kt#uh7d8r");
        if ((i4 + 1) - (i4 | 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function0) ? 4 : 2;
            i5 = (i8 + i2) - (i8 & i2);
        } else {
            i5 = i2;
        }
        int i9 = i4 & 2;
        if (i9 != 0) {
            i5 = (i5 + 48) - (i5 & 48);
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i10 = ((i4 + 4) - (i4 | 4) == 0 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) ? 256 : 128;
            i5 = (i5 + i10) - (i5 & i10);
        }
        int i11 = (-1) - (((-1) - i4) | ((-1) - 8));
        if (i11 != 0) {
            i5 |= 3072;
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(fM1810getSheetMaxWidthD9Ej5fM) ? 2048 : 1024)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i12 = ((i4 + 16) - (i4 | 16) == 0 && composerStartRestartGroup.changed(expandedShape)) ? 16384 : 8192;
            i5 = (i5 + i12) - (i5 & i12);
        }
        if ((i2 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 + 32) - (i4 | 32) == 0 && composerStartRestartGroup.changed(containerColor)) ? 131072 : 65536)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1572864)) == 0) {
            int i13 = ((i4 + 64) - (i4 | 64) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U)) ? 1048576 : 524288;
            i5 = (i5 + i13) - (i5 & i13);
        }
        int i14 = i4 & 128;
        if (i14 != 0) {
            i5 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i5 |= composerStartRestartGroup.changed(fM6638constructorimpl) ? 8388608 : 4194304;
        }
        if ((-1) - (((-1) - 100663296) | ((-1) - i2)) == 0) {
            i5 |= ((i4 & 256) == 0 && composerStartRestartGroup.changed(scrimColor)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i15 = (i4 + 512) - (i4 | 512);
        if (i15 != 0) {
            i5 = (i5 + 805306368) - (i5 & 805306368);
        } else if ((805306368 & i2) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function2M1987getLambda1$material3_release) ? 536870912 : 268435456)));
        }
        if ((i3 & 6) == 0) {
            int i16 = ((-1) - (((-1) - i4) | ((-1) - 1024)) == 0 && composerStartRestartGroup.changedInstance(modalBottomSheetKt$ModalBottomSheet$1)) ? 4 : 2;
            i6 = (i3 + i16) - (i3 & i16);
        } else {
            i6 = i3;
        }
        int i17 = (-1) - (((-1) - i4) | ((-1) - 2048));
        if (i17 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i18 = composerStartRestartGroup.changed(properties) ? 32 : 16;
            i6 = (i6 + i18) - (i6 & i18);
        }
        if ((i4 & 4096) != 0) {
            i6 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changedInstance(function3) ? 256 : 128)));
        }
        if ((i5 + 306783379) - (306783379 | i5) == 306783378 && (i6 + 147) - (147 | i6) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i9 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i4 + 4) - (i4 | 4) != 0) {
                    sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-897)));
                }
                if (i11 != 0) {
                    fM1810getSheetMaxWidthD9Ej5fM = BottomSheetDefaults.INSTANCE.m1810getSheetMaxWidthD9Ej5fM();
                }
                if ((-1) - (((-1) - i4) | ((-1) - 16)) != 0) {
                    i7 = 6;
                    expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                    i5 &= -57345;
                } else {
                    i7 = 6;
                }
                if ((i4 + 32) - (i4 | 32) != 0) {
                    containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i7);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-458753)));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                    int i19 = i5 >> 15;
                    jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i19 + 14) - (i19 | 14));
                    i5 = (i5 - 3670017) - (i5 | (-3670017));
                }
                if (i14 != 0) {
                    fM6638constructorimpl = Dp.m6638constructorimpl(0);
                }
                if ((i4 + 256) - (i4 | 256) != 0) {
                    scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i5 = ((-234881025) + i5) - ((-234881025) | i5);
                }
                if (i15 != 0) {
                    function2M1987getLambda1$material3_release = ComposableSingletons$ModalBottomSheetKt.INSTANCE.m1987getLambda1$material3_release();
                }
                if ((-1) - (((-1) - i4) | ((-1) - 1024)) != 0) {
                    modalBottomSheetKt$ModalBottomSheet$1 = new Function2<Composer, Integer, WindowInsets>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$1
                        public final WindowInsets invoke(Composer composer2, int i20) {
                            composer2.startReplaceGroup(58488196);
                            ComposerKt.sourceInformation(composer2, "C129@6530L12:ModalBottomSheet.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(58488196, i20, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:129)");
                            }
                            WindowInsets windowInsets = BottomSheetDefaults.INSTANCE.getWindowInsets(composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2.endReplaceGroup();
                            return windowInsets;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ WindowInsets invoke(Composer composer2, Integer num) {
                            return invoke(composer2, num.intValue());
                        }
                    };
                    i6 = (i6 - 15) - (i6 | (-15));
                }
                if (i17 != 0) {
                    properties = ModalBottomSheetDefaults.INSTANCE.getProperties();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 + 4) - (i4 | 4) != 0) {
                    i5 = (i5 - 897) - (i5 | (-897));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 16)) != 0) {
                    i5 &= -57345;
                }
                if ((i4 & 32) != 0) {
                    i5 = (i5 - 458753) - (i5 | (-458753));
                }
                if ((i4 + 64) - (i4 | 64) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-3670017)));
                }
                if ((i4 & 256) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-234881025)));
                }
                if ((i4 & 1024) != 0) {
                    i6 &= -15;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2132719801, i5, i6, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:132)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954363344, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2011393839, "CC(remember):ModalBottomSheet.kt#9igjgp");
            int i20 = ((i5 + 896) - (896 | i5)) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            int i21 = i5 & 14;
            int i22 = (-1) - (((-1) - (i21 == 4 ? 1 : 0)) & ((-1) - ((((i20 <= 256 || !composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) && (-1) - (((-1) - i5) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) != 256) ? 0 : 1) | (composerStartRestartGroup.changedInstance(coroutineScope) ? 1 : 0))));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i22 != 0 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        if (sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Hidden).booleanValue()) {
                            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sheetStateRememberModalBottomSheetState, null), 3, null);
                            final SheetState sheetState2 = sheetStateRememberModalBottomSheetState;
                            final Function0<Unit> function02 = function0;
                            jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                    invoke2(th);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Throwable th) {
                                    if (sheetState2.isVisible()) {
                                        return;
                                    }
                                    function02.invoke();
                                }
                            });
                        }
                    }

                    /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: ModalBottomSheet.kt */
                    @InterfaceC1492Gx
                    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKk\u000f\u0005\u0003\u000fe\u0014\u001a\u001b\u0017\u0016|\u0013\u0011\u0012\"y$T~\"\u0018\u0016\"x'-.*)\u0010&$%5e$2.3(<.\u001e:\u00106A<9DEv\u0005x\u0007z\t", f = "\u001a;/+5\n6:930\u0015)%$2j'/", i = {}, l = {138}, m = "8>GA>9(KJH>H?", n = {}, s = {})
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ SheetState $sheetState;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$sheetState = sheetState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.$sheetState, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.label = 1;
                                if (this.$sheetState.hide(this) == coroutine_suspended) {
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
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final Function0 function02 = (Function0) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2011381825, "CC(remember):ModalBottomSheet.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope);
            int i23 = ((i20 <= 256 || !composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) && (i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (384 | i5) != 256) ? 0 : 1;
            int i24 = (((zChangedInstance ? 1 : 0) + i23) - ((zChangedInstance ? 1 : 0) & i23)) | (i21 == 4 ? 1 : 0);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (i24 != 0 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f4) {
                        invoke(f4.floatValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: ModalBottomSheet.kt */
                    /* JADX INFO: loaded from: classes.dex */
                    @InterfaceC1492Gx
                    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKk\u000f\u0005\u0003\u000fe\u0014\u001a\u001b\u0017\u0016|\u0013\u0011\u0012\"y$T~\"\u0018\u0016\"x'-.*)\u0010&$%5e6)9:3-\u001d9\u000f5@;8CDu\u0004w\u0006y\b", f = "\u001a;/+5\n6:930\u0015)%$2j'/", i = {}, l = {148}, m = "8>GA>9(KJH>H?", n = {}, s = {})
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ float $it;
                        final /* synthetic */ SheetState $sheetState;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(SheetState sheetState, float f2, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$sheetState = sheetState;
                            this.$it = f2;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.$sheetState, this.$it, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.label = 1;
                                if (this.$sheetState.settle$material3_release(this.$it, this) == coroutine_suspended) {
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

                    public final void invoke(float f4) {
                        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sheetStateRememberModalBottomSheetState, f4, null), 3, null);
                        final SheetState sheetState2 = sheetStateRememberModalBottomSheetState;
                        final Function0<Unit> function03 = function0;
                        jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                invoke2(th);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Throwable th) {
                                if (sheetState2.isVisible()) {
                                    return;
                                }
                                function03.invoke();
                            }
                        });
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final Function1 function1 = (Function1) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2011376044, "CC(remember):ModalBottomSheet.kt#9igjgp");
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final Animatable animatable = (Animatable) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2011371154, "CC(remember):ModalBottomSheet.kt#9igjgp");
            int i25 = ((-1) - (((-1) - ((((i20 <= 256 || !composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) && (384 & i5) != 256) ? 0 : 1) | (composerStartRestartGroup.changedInstance(coroutineScope) ? 1 : 0))) & ((-1) - (composerStartRestartGroup.changedInstance(animatable) ? 1 : 0)))) | (i21 == 4 ? 1 : 0);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (i25 != 0 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        if (sheetStateRememberModalBottomSheetState.getCurrentValue() == SheetValue.Expanded && sheetStateRememberModalBottomSheetState.getHasPartiallyExpandedState()) {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(animatable, null), 3, null);
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(sheetStateRememberModalBottomSheetState, null), 3, null);
                        } else {
                            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(sheetStateRememberModalBottomSheetState, null), 3, null);
                            final Function0<Unit> function03 = function0;
                            jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1.4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                    invoke2(th);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Throwable th) {
                                    function03.invoke();
                                }
                            });
                        }
                    }

                    /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1, reason: invalid class name */
                    /* JADX INFO: compiled from: ModalBottomSheet.kt */
                    @InterfaceC1492Gx
                    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKk\u000f\u0005\u0003\u000fe\u0014\u001a\u001b\u0017\u0016|\u0013\u0011\u0012\"y$T~\"\u0018\u0016\"x'-.*)\u0010&$%5etguiw", f = "\u001a;/+5\n6:930\u0015)%$2j'/", i = {}, l = {161}, m = "8>GA>9(KJH>H?", n = {}, s = {})
                    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ Animatable<Float, AnimationVector1D> $predictiveBackProgress;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(Animatable<Float, AnimationVector1D> animatable, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$predictiveBackProgress = animatable;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.$predictiveBackProgress, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.label = 1;
                                if (Animatable.animateTo$default(this.$predictiveBackProgress, Boxing.boxFloat(0.0f), null, null, null, this, 14, null) == coroutine_suspended) {
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

                    /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: ModalBottomSheet.kt */
                    @InterfaceC1492Gx
                    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKk\u000f\u0005\u0003\u000fe\u0014\u001a\u001b\u0017\u0016|\u0013\u0011\u0012\"y$T~\"\u0018\u0016\"x'-.*)\u0010&$%5etguix", f = "\u001a;/+5\n6:930\u0015)%$2j'/", i = {}, l = {162}, m = "8>GA>9(KJH>H?", n = {}, s = {})
                    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ SheetState $sheetState;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(SheetState sheetState, Continuation<? super AnonymousClass2> continuation) {
                            super(2, continuation);
                            this.$sheetState = sheetState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass2(this.$sheetState, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.label = 1;
                                if (this.$sheetState.partialExpand(this) == coroutine_suspended) {
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

                    /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3, reason: invalid class name */
                    /* JADX INFO: compiled from: ModalBottomSheet.kt */
                    @InterfaceC1492Gx
                    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKk\u000f\u0005\u0003\u000fe\u0014\u001a\u001b\u0017\u0016|\u0013\u0011\u0012\"y$T~\"\u0018\u0016\"x'-.*)\u0010&$%5etguiy", f = "\u001a;/+5\n6:930\u0015)%$2j'/", i = {}, l = {164}, m = "8>GA>9(KJH>H?", n = {}, s = {})
                    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ SheetState $sheetState;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass3(SheetState sheetState, Continuation<? super AnonymousClass3> continuation) {
                            super(2, continuation);
                            this.$sheetState = sheetState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass3(this.$sheetState, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.label = 1;
                                if (this.$sheetState.hide(this) == coroutine_suspended) {
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
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final long j5 = scrimColor;
            final SheetState sheetState2 = sheetStateRememberModalBottomSheetState;
            final Modifier modifier2 = companion;
            final float f4 = fM1810getSheetMaxWidthD9Ej5fM;
            final Shape shape2 = expandedShape;
            final long j6 = containerColor;
            final long j7 = jM1947contentColorForek8zF_U;
            final float f5 = fM6638constructorimpl;
            final Function2<? super Composer, ? super Integer, Unit> function23 = function2M1987getLambda1$material3_release;
            final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function24 = modalBottomSheetKt$ModalBottomSheet$1;
            Function2<Composer, Integer, Unit> function25 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3
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

                public final void invoke(Composer composer2, int i26) {
                    ComposerKt.sourceInformation(composer2, "C168@8241L755:ModalBottomSheet.kt#uh7d8r");
                    if ((-1) - (((-1) - i26) | ((-1) - 3)) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-314673510, i26, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:168)");
                    }
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
                        }
                    }, 1, null);
                    long j8 = j5;
                    Function0<Unit> function03 = function02;
                    SheetState sheetState3 = sheetState2;
                    Animatable<Float, AnimationVector1D> animatable2 = animatable;
                    CoroutineScope coroutineScope2 = coroutineScope;
                    Function1<Float, Unit> function12 = function1;
                    Modifier modifier3 = modifier2;
                    float f6 = f4;
                    Shape shape3 = shape2;
                    long j9 = j6;
                    long j10 = j7;
                    float f7 = f5;
                    Function2<Composer, Integer, Unit> function26 = function23;
                    Function2<Composer, Integer, WindowInsets> function27 = function24;
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierSemantics$default);
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
                    ComposerKt.sourceInformationMarkerStart(composer2, 1107507610, "C169@8345L169,174@8527L459:ModalBottomSheet.kt#uh7d8r");
                    ModalBottomSheetKt.m2262Scrim3JVO9M(j8, function03, sheetState3.getTargetValue() != SheetValue.Hidden, composer2, 0);
                    ModalBottomSheetKt.m2261ModalBottomSheetContentIQkwcL4(boxScopeInstance, animatable2, coroutineScope2, function03, function12, modifier3, sheetState3, f6, shape3, j9, j10, f7, function26, function27, function32, composer2, 6 | (Animatable.$stable << 3), 0, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            };
            boolean z2 = true;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-314673510, true, function25, composerStartRestartGroup, 54);
            int i26 = i6 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
            ModalBottomSheet_androidKt.ModalBottomSheetDialog((Function0) objRememberedValue5, properties, animatable, composableLambdaRememberComposableLambda, composerStartRestartGroup, (-1) - (((-1) - ((i26 + 3072) - (i26 & 3072))) & ((-1) - (Animatable.$stable << 6))));
            if (sheetStateRememberModalBottomSheetState.getHasExpandedState()) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2011320033, "CC(remember):ModalBottomSheet.kt#9igjgp");
                if ((i20 <= 256 || !composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) && (i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (384 | i5) != 256) {
                    z2 = false;
                }
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                    objRememberedValue6 = (Function2) new ModalBottomSheetKt$ModalBottomSheet$4$1(sheetStateRememberModalBottomSheetState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                int i27 = i5 >> 6;
                EffectsKt.LaunchedEffect(sheetStateRememberModalBottomSheetState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composerStartRestartGroup, (i27 + 14) - (i27 | 14));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j8 = containerColor;
            final long j9 = jM1947contentColorForek8zF_U;
            final float f6 = fM6638constructorimpl;
            final long j10 = scrimColor;
            final Function2<? super Composer, ? super Integer, Unit> function26 = function2M1987getLambda1$material3_release;
            final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function27 = modalBottomSheetKt$ModalBottomSheet$1;
            final ModalBottomSheetProperties modalBottomSheetProperties2 = properties;
            final Modifier modifier3 = companion;
            final SheetState sheetState3 = sheetStateRememberModalBottomSheetState;
            final float f7 = fM1810getSheetMaxWidthD9Ej5fM;
            final Shape shape3 = expandedShape;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$5
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

                public final void invoke(Composer composer2, int i28) {
                    Function0<Unit> function03 = function0;
                    Modifier modifier4 = modifier3;
                    SheetState sheetState4 = sheetState3;
                    float f8 = f7;
                    Shape shape4 = shape3;
                    long j11 = j8;
                    long j12 = j9;
                    float f9 = f6;
                    long j13 = j10;
                    Function2<Composer, Integer, Unit> function28 = function26;
                    Function2<Composer, Integer, WindowInsets> function29 = function27;
                    ModalBottomSheetProperties modalBottomSheetProperties3 = modalBottomSheetProperties2;
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    int i29 = i2;
                    ModalBottomSheetKt.m2260ModalBottomSheetdYc4hso(function03, modifier4, sheetState4, f8, shape4, j11, j12, f9, j13, function28, function29, modalBottomSheetProperties3, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i29 + 1) - (i29 & 1)), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:510:0x055b A[PHI: r0
  0x055b: PHI (r0v21 androidx.compose.runtime.Composer) = (r0v11 androidx.compose.runtime.Composer), (r0v23 androidx.compose.runtime.Composer) binds: [B:336:0x0112, B:338:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0562 A[PHI: r0
  0x0562: PHI (r0v24 androidx.compose.runtime.Composer) = (r0v10 androidx.compose.runtime.Composer), (r0v26 androidx.compose.runtime.Composer) binds: [B:328:0x00f1, B:330:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0568 A[PHI: r0
  0x0568: PHI (r0v27 androidx.compose.runtime.Composer) = (r0v9 androidx.compose.runtime.Composer), (r0v29 androidx.compose.runtime.Composer) binds: [B:320:0x00c7, B:322:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ModalBottomSheetContent-IQkwcL4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2261ModalBottomSheetContentIQkwcL4(final androidx.compose.foundation.layout.BoxScope r29, final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r30, final kotlinx.coroutines.CoroutineScope r31, final kotlin.jvm.functions.Function0<kotlin.Unit> r32, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r33, androidx.compose.ui.Modifier r34, androidx.compose.material3.SheetState r35, float r36, androidx.compose.ui.graphics.Shape r37, long r38, long r40, float r42, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.foundation.layout.WindowInsets> r44, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r45, androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instruction units count: 1601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheetKt.m2261ModalBottomSheetContentIQkwcL4(androidx.compose.foundation.layout.BoxScope, androidx.compose.animation.core.Animatable, kotlinx.coroutines.CoroutineScope, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.material3.SheetState, float, androidx.compose.ui.graphics.Shape, long, long, float, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final float calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope, float f2) {
        float fM4006getWidthimpl = Size.m4006getWidthimpl(graphicsLayerScope.mo4365getSizeNHjbRc());
        if (Float.isNaN(fM4006getWidthimpl) || fM4006getWidthimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo710toPx0680j_4(PredictiveBackMaxScaleXDistance), fM4006getWidthimpl), f2) / fM4006getWidthimpl);
    }

    public static final float calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope, float f2) {
        float fM4003getHeightimpl = Size.m4003getHeightimpl(graphicsLayerScope.mo4365getSizeNHjbRc());
        if (Float.isNaN(fM4003getHeightimpl) || fM4003getHeightimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo710toPx0680j_4(PredictiveBackMaxScaleYDistance), fM4003getHeightimpl), f2) / fM4003getHeightimpl);
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ModalBottomSheetKt$rememberModalBottomSheetState$1 */
    /* JADX INFO: compiled from: ModalBottomSheet.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<SheetValue, Boolean> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(SheetValue sheetValue) {
            return true;
        }
    }

    public static final SheetState rememberModalBottomSheetState(boolean z2, Function1<? super SheetValue, Boolean> function1, Composer composer, int i2, int i3) {
        AnonymousClass1 anonymousClass1 = function1;
        boolean z3 = z2;
        ComposerKt.sourceInformationMarkerStart(composer, -778250030, "C(rememberModalBottomSheetState)P(1)400@18058L160:ModalBottomSheet.kt#uh7d8r");
        if ((i3 + 1) - (1 | i3) != 0) {
            z3 = false;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            anonymousClass1 = AnonymousClass1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-778250030, i2, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:400)");
        }
        SheetValue sheetValue = SheetValue.Hidden;
        int i4 = ((i2 + 14) - (14 | i2)) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        int i5 = (i2 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i2 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
        SheetState sheetStateRememberSheetState = SheetDefaultsKt.rememberSheetState(z3, anonymousClass1, sheetValue, false, composer, (i4 + i5) - (i4 & i5), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return sheetStateRememberSheetState;
    }

    /* JADX INFO: renamed from: Scrim-3J-VO9M */
    public static final void m2262Scrim3JVO9M(final long j2, final Function0<Unit> function0, final boolean z2, Composer composer, final int i2) {
        int i3;
        Modifier.Companion companionSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(951870469);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Scrim)P(0:c#ui.graphics.Color)410@18376L87,411@18489L29,426@19112L79,426@19062L129:ModalBottomSheet.kt#uh7d8r");
        if ((i2 + 6) - (i2 | 6) == 0) {
            i3 = (-1) - (((-1) - (composerStartRestartGroup.changed(j2) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function0) ? 32 : 16)));
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(z2) ? 256 : 128)));
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(951870469, i3, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.kt:407)");
            }
            if (j2 != 16) {
                final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z2 ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                Strings.Companion companion = Strings.Companion;
                final String strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(androidx.compose.ui.R.string.close_sheet), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1785653838);
                ComposerKt.sourceInformation(composerStartRestartGroup, "414@18629L44,415@18730L263");
                if (z2) {
                    Modifier.Companion companion2 = Modifier.Companion;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1785652017, "CC(remember):ModalBottomSheet.kt#9igjgp");
                    int i4 = (-1) - (((-1) - i3) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
                    boolean z3 = i4 == 32;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = (Function2) new ModalBottomSheetKt$Scrim$dismissSheet$1$1(function0, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1785648566, "CC(remember):ModalBottomSheet.kt#9igjgp");
                    int i5 = (-1) - (((-1) - (composerStartRestartGroup.changed(strM2993getString2EP1pXo) ? 1 : 0)) & ((-1) - (i4 == 32 ? 1 : 0)));
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (i5 != 0 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 1.0f);
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2993getString2EP1pXo);
                                final Function0<Unit> function02 = function0;
                                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        function02.invoke();
                                        return true;
                                    }
                                }, 1, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    companionSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (Function1) objRememberedValue2);
                } else {
                    companionSemantics = Modifier.Companion;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(companionSemantics);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1785636526, "CC(remember):ModalBottomSheet.kt#9igjgp");
                boolean z4 = (-1) - (((-1) - (composerStartRestartGroup.changed(stateAnimateFloatAsState) ? 1 : 0)) & ((-1) - ((-1) - (((-1) - i3) | ((-1) - 14)) != 4 ? 0 : 1))) == 1;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            DrawScope.m4728drawRectnJ9OG0$default(drawScope, j2, 0L, 0L, RangesKt.coerceIn(ModalBottomSheetKt.Scrim_3J_VO9M$lambda$10(stateAnimateFloatAsState), 0.0f, 1.0f), null, null, 0, 118, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    ModalBottomSheetKt.m2262Scrim3JVO9M(j2, function0, z2, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))));
                }
            });
        }
    }

    public static final float Scrim_3J_VO9M$lambda$10(State<Float> state) {
        return state.getValue().floatValue();
    }
}
