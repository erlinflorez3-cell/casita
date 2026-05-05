package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.AdkSettings;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: NavigationDrawer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яċ\u0014D߬)\u001e\u007f\u007fLDqy\fA\f0\u0013.X~*,\u0018x\u000ffx98ǏmHDR[ճ\u0017k\u00124,Ӌ,qY;]ڼ\u0006\"\u001fOVgmoRZ!C\u0017إ\u001ex\u0001,QU\u000f]\u001a\u000fHBw?IMw=?d|6\u001b :Ĳ@y\u0013\n\"*N\u0011~zYK\u0014\u00126Ox:h\rUĨ\"\u0012\u001c>(\u0001$loNLHt]@0+\u0003\u007fBV'e5\u0015@\u001bLl';}\u0012\"9HO5C.\u0004\t\rRiI\u001b? H5n-'9U\fWde0\u001a\u001b+]\u001burTk5Wf\f5;gcy_>.}z\n\u001eT\u0004<\tWN4-(x \u000ea\b#mNd\u001atR\u0002\u000bad-5\u0002C+g\"\u0015fň?\u0019TN߉\t\r$;GsƈZ٪\u05f8d\u0017!m\u0006kI<NC`N8`ms\npp\fB\u0004^R05\u0002\u0011<#=7\nFS'q\u0002VR\u007fv3o\u0019YoRVP:nDFZ\u000f\u0012ZRu\u001dk~W\t2\u0017M*f\u001f}6&Pv\u0006P9; P_h\u0018\u0001]_\u001a%]menˇo\u000e]Pӷ75W{Vf٥uܝ͖@d\u000bst^k[hy@\"`O\u001b\u001f\u0006\u001a\\Y\u001c\u0015B? #bK֞\u001d\\\u001b_3$HA\u000b\u0013wZ\u0017\u001b/Z9$\u0011q<t7\n\u0001bvou\u0019a,+\u0002R<OeM$6W2hb\u0004Q&ҋw\u007fM~\u0013Lƥp\u0016\u0004w\u0014\u0013$=QQ]DC\u0015\rMJ\u0004CDz\u0018\u0016U[$?z+\r?An.u\u0012\u0003pZk\u001bPUT%.\u000f^!08j\u0006yoT\u0013G\u0012c;aDI\u0001\u0013q<|G-\u000b%\u001e3\u0012\b\"+8]]51.\u000e$1%a\f\u007f\u007f0\nb=-#zנ0c\u001c\u0007͈U]8S~H̫}Жѐ(n\thV\u0012\u0010zP1L\raOqh~^PM98.l\r,\u001bzn[h\u001e \u0004:.m6\fC,!\u000fI+\u0011[a\u007fm\u001cZ\r\u0011P\u000f\u0018\u001b\u00141\u001d!LC&Ves!04vH<G;p\u0017T\tRG\\V\u0016\u001f[jy\b z.\\o\u0011'2pzikոXxbm߃\t`Kxg/ݹ}۰ʟ\"z;Z\u0013\b^?=\fJ\u0001\u0002$9!pO\rp=+r_i!.X\u000f\u0017]]qV2<\nG7{\u0004o:GH\u0003#B&+QQ?n'6d\u000bcufd%\u0015\u0017XT\"7\u0011\u0013|<O:)\u0019-g\t\u007fd=L|\u000eGE*\u0001EKW\u001cѼ\u0001cL2ұ\n53U\u0010oΘ&س\u009cW=\u00042.<?b\u0003LtW<m:l)X.|&d\u0012\tAWN#̛Ntx!^\u000e<O\u0010=\u001a\u0013\rd\u001c}'@53\u0005\u0006pT\u0019~\u0010cz\u0004\u0007U9$\u00177\\y|Yh\u001d76}=!lrE!U0X?\u0007B4Ӕ#6\u000eyo\u0015͏b֬ӗoQa:9]\u0004˚`?_j\u001e,&*\u0005\u0012Zl3%=fMlk7{\u05cfFW\u0014u\u001b,r&$)B\u001e/RlC+:Vt.d]>G>\f\u0013M`\u0015\u000e]IT,aeE\u001bEe#|8x!\u0003hi\u000b~Xa֟v\u007fmC]YZ=([q1}f\u0013&yLNA6Kי\u0012\u00115qh&D\\(QSQaNI\u0017\u0007\u0015F<\b\u0007Gl\u001bYY%89\u0015\u0003#>(j2?ތ;r1i'Z)\u0013~;S<\u0016R-\f\u0010ob~{n\u0007\u0015g,WA]\u001e(bp\u0006\u0010\u001f22\u001euQ\u000fu7N*mlXV\"f4,06|U;G\u001b{$\u00102i&\u0006|[\u0010Gq\u0015\"-\\T:/|\u0007scx{\u001bD;LBLʷ\n)9.ϧ\u0014OwXqNٕLҍۺa>\u00190\u0012VJ\u001dD7_@\b16< r{uzoa_>?@,ƒ\bw7i\u0011\u0006f\u001d&1cvtA\r\b[Uz\u0016P\u00114^\\I:*ʲ\u001a.N.H\u0003ߢd\u0015!q_0O\u0007*V*(M\u0015ie\u001e%\u0016\fwIc3pCI5\u001bmx_c\u0005\r\u000fcccj;\u0017\u0010jY.uun\u001e8\u001c\u001e\u000ess\u000f\u0011σwؤڍq26t^DrakG4\u001fkUEi\ryz7\ndA/E \u0007R\u0004#]|\u0010L(AG\u0013Q\u001ekb@m\f\r_G,\fj\u0015m|\u001c\u0016@\u0015gJ/|\u001eK?C[l\u00052O\u001bg?--N<j\u000bڃ(bua\u0002 0/\u001bLdVQHy*AjP\u000f'z#1t\fPg\u0014\u000f\u001e\u0011\u0011\u001c];\u000e\u0011\\2~-_O\u0019!pe\b\u0001\u0003,eEY\u0001A>_|Ag]\u0004,n\u007f\u0002\tB%+>@A#`\u001d>{\n\u001dA0E`\fm\u0019~\u0005d\u001f}Lk^\n*vt8Vcl]\u000fl9x]ʇ3WTd\u0019`\u001fHo\u000f9ۭ.ɒ:Hrߘ!\rYb/\u0014eDMŻ*ˋ>\"iͩsk3Ib\u0006<m8߂\u0017ٛa5>\r}0\u001d#\u0013C~r2o[Ԯ2ʽo1:FhD˻-_/pnǻF<\u000bЇ\t\u0002ͧWZ_L7r\u0013 yֵ̙AÁ=O/j\u001b\u0019j\b\t×úzѿ\\d3\u0005\u0014\u0006M3\u0019۸ҩl"}, d2 = {"\u000fmX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIm\u00167;N;i\n", "", "\u0012qPDX9)]'\u0003\nb6\u0006\u00056T\u00035{N\u0004!\u001eF", "\u0012qPDX9/S \txb;\u0011w2r\u007f6~J\b\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u001bh]6`<F2&z\r^9n\r.t\u0003", "\u0012hb:\\:LW\u0016\u0006z=9x\u001b/rm+{@\u0010", "", "2qPDX9,b\u0015\u000ez", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U21k}-%|\u0012=M\u0019", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "2qPDX9,V\u0015\nz", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "2qPDX9\u001c]\"\u000evb5|\u0016\ro\u00072\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "2qPDX9\u001c]\"\u000ezg;Z\u00136o\r", "2qPDX9-]\"z\u0002>3|\u001a+t\u00042\u0005", "Eh]1b>\"\\'~\nl", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpG\\", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8TSCt\"\u001c\u001fsa\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u0012hb:\\:LW\u0016\u0006z=9x\u001b/rm+{@\u0010^\u0005P|\bLg\r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0004BU\u0010 D[%*\\C\u0011R0'\u0014uk=\u0006vuL\u0001/RV\\,&bv\u0007{\u001cY\u0012O/\r\u0012/( wCD)\f+\\K9r\t\u0017 \u001c54\u0001F \u0012Tu xE'v\u0010GbuRA\u001bG\u000fEr[&[GD(\u0013\u0005b\u0019rX9\u0014\nSZs\\\npfC(~B-\btWZO\u007fd\u0006f+(J\u0006\nu;ft:\u0003\u0003j:4Ek\tT1\u001dOfB\u0016<e?6*@E!\t,s~jM\u0012r(/]t^>0&oib[X\u0005g\u001ff?o_JDb\u000fMMw\u0015p$\tJf\u0004#\t\u0014yQI\r4", "\u0012hb:\\:LW\u0016\u0006z=9x\u001b/rm+{@\u0010^\u0013H{\u000e-S+", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Ps0\u0018x4CWQ0Z`<+\u0017\u000ee\u000e$\u0010qe@=-mQA#\u0007?\u0013\u007fEp\f\u0016$\u000e~kzR_\u000fC\t\u0019\u007fJroBmi\nV\u000b7f3c\u0016q\u0001eH:3\"G\u007f!r_5\u000e\u0005\u001d\u0016\u0004ZChwP\u0017\n<.G{%'UxSKx1(\u0019Q^\u000e;W\u00025x,\u0017}(@l\u0010Uu\u0018\bk\t\u001e;`I'o\u0014F\u001bJUquy\u0014qLbR", "\u0012hb:\\:LW\u0016\u0006zG(\u000e\r1a\u000f,\u0006I_$\u0013Yo\u001b", "2qPDX9\u001c]\"\u000ezg;", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "5dbAh9>ax\bv[3|\b", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJixV\u0017M8\u0017\tXTmlN?*\u0012:IKCd\u0010\f#\u00121q>\f5\u001dC\f\u0015\u0003/8dUY5n.GOq1h\u0015)\"mB\u0004%$z\u0017*lZ7\u0018E4!{P\tkqPeP\u001f GlhPInh\u0006r1'V\u0006\u0006\u0012{e\u00054\u00041\f4s\u0014n\rVq&>kNx\u0010 2", "\u0012qPDX9,V\u0019~\n", "2qPDX9)`\u0019}~\\;\u0001\u001a/B{&\u0002.\u0010\u0013&G", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U21k}-\"z\u0016-QAJoE\u001eqd_?tr(]v|", "\u0012qPDX9,V\u0019~\n&}\u0012v/kP:", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0004BU\u0010 DX#.LG9z8/\u0015E]7\rQ;J\u0006'\u001d3J5[_|A\u0013%$\fX3\u0018\u000fgAmoNG(\u0007(X\u0006EqJ\u0013\u0012\"?z\u007f\fH\u0014Px\u001f\b%2vFhmO.=Na7n\u0010^0&8D,\u001f{'\u001b2`2Sc]\u0010vS}gt\u001d\u007fvA#Kw_EX9SF|2)Y{A\"6\"v8p8\u00078(D.rNc#>4]y\rCG15=@\u001c\tPt}6?\u001eq\u001dp\f\u0018kCzyunaW\u0013\u0011fd1\u001c]h\u007fD\\\n=\\9\u00131N\nLiy^\u0016\u0017-|iQCd2\u000b\"{N0_\u001eXfJ[\r", "\u001bnS._\u000bKO+~\bL/|\t>", "\u001bnS._\u000bKO+~\bL/|\t>-m1\t:\u0011\b~", "\u001bnS._\u000bKO+~\bL/|\t>-{)\b@qs\u001d", "\u001bnS._\u0015:d\u001d\u0001vm0\u0007\u0012\u000er{:{M", "Aba6`\nHZ#\f", "\u001bnS._\u0015:d\u001d\u0001vm0\u0007\u0012\u000er{:{MHwyR|\u001dIx", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJixV\u0017M8\u0017\tXTmlN?*\u0012:IKCd\u0010\f#\u00121q>\f5\u001dC\f\u0015\u0003/8dUY5n,(Kl9k\u0010hfaKBm\u0015\u0002\"\u0019wT8\u0013\n\u001dq\u0003[wvkQ\"G\u000e\u000b:vZSOsTO>%)S\u0007\u0002 2\"\u0002;}<\b<*\u007fB\u000fSr\"L^\u0006j\u0010@\u0005\u0018", "\u001c`e6Z(MW#\bYk(\u000f\t<I\u000f(\u0004", ":`Q2_", "Ad[2V;>R", "=m29\\*D", "7b^;", "0`S4X", "AgP=X", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006_!F]\u007f\u001cFq 7,P7}4+xwaAdm3X\u00045\u001d", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0015\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b%c5'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\u001c\u001aW\u001dtoFW\u0014G\u0007j\\G3wM]hCLRM,+t\u0015],`DC2]R)$f_2\u0014\u0005 fYX\u0004vnK\"D=5F7\\VNmd@~0-\u0015\\\b\u001b0gx5}yY\u001b&?c\u0012Uk\u0017Q(v\u001f4gK5&\u007fL\u0017\tMpqwA\u0012f-+u\u0011^@1nLalG\u001c\u0011a\u0016n~_i\tB\\\u0014>\u0013w\u00116F\fFW\u0001bRo ~iK?*X\u000b#OQ\u001eq\u0011\u0010fu\u0018$\f Dc\u001cv\u007fF3V\u0012\u0016r<\u000b\u000f#A\u001fxS\u001a{K<\\a\u007f-5t M+<\u0015@\u007faC|\f\u0014C\u0005\u0015\bf[yQu3\u001a%\tFh8o\\-\u001ak]+\u0007qH)\u001d-\u0007hNImk\u0002+\u0014\u0011Wf\u0007\u001dhHF\u0002|NYs1@kKN\u001adZ\u001b6[\u0015<6Xy\u0006L", "\u001eda:T5>\\(]\bZ>|\u0016\u001dh\u007f(\u000b", "\u001eda:T5>\\(]\bZ>|\u0016\u001dh\u007f(\u000b\b|\u0018#G`jB", "\u001eda:T5>\\(gvo0~\u0005>i\n1ZM|)\u0017T", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0014O{qJ(uP]^\r\u0011?Oj5n\u001a_fiJC3\u0018y\u0019dFZ6\u0015\u0006a\u0011\u007f(]K+8", "!ba6`", "=oT;", "=m29b:>", "4qP0g0H\\", "1n[<e", "!ba6`s\u001bfgRLF*", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b%c3\u0012\t\u000eXN.rCJh\u00066Q\rEv\u0001U#\u001e>ytJVY%\u0004\u001d\u0001K7hS/C=8", "1`[0h3:b\u0019_\bZ*\f\r9n", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, ">nb", "@d\\2`)>`w\fvp,\nv>a\u000f(", "7mXA\\(ED\u0015\u0006\u000b^", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U21k}-(i\u001d>M\u0019", "1n]3\\9FA(z\n^\n\u007f\u00058g\u007f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u0004BU\u0010 D^\u00125]C\u0011R:($oeBPh=V@(WUL;`\\{K]rj\u0017L:\u0011\u000fb\ryU@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\fc P\t\u0019}ArFPaj\u0004UAR8\u000eHOF\u0019e9G.\u0018p,dfZ6\u0015\u0006a\u0011<ZuvgT\u001dv?q\bLhBWob*\u0004#.KQ", "1`[0h3:b\u0019i\b^+\u0001\u0007>i\u0011(X<~\u001d\u0005Ek\u0015<i", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<4?OkA\f\u0013rl9\\", "1`[0h3:b\u0019i\b^+\u0001\u0007>i\u0011(X<~\u001d\u0005Ek\u0015<j", ">qT1\\*MW*~WZ*\u0003g<a\u0012(\t\u001e\u0004\u001b\u001eF", "7rAA_", ">qT1\\*MW*~WZ*\u0003g<a\u0012(\t\u001e\u000b &Cs\u0017<\u0004", ";`c2e0:Zfx\b^3|\u0005=e", "/mR5b9L7\"\u0003\nb(\u0004\rDe~", ";h]#T3NS"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class NavigationDrawerKt {
    private static final float DrawerPositionalThreshold = 0.5f;
    private static final float DrawerVelocityThreshold = Dp.m6638constructorimpl(400);
    private static final float MinimumDrawerWidth = Dp.m6638constructorimpl(240);
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(256, 0, null, 6, null);

    /* JADX INFO: renamed from: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$3 */
    /* JADX INFO: compiled from: NavigationDrawer.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ Function2<Composer, Integer, Unit> $drawerContent;
        final /* synthetic */ DrawerState $drawerState;
        final /* synthetic */ boolean $gesturesEnabled;
        final /* synthetic */ Modifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, DrawerState drawerState, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, int i2, int i3) {
            super(2);
            function2 = function2;
            modifier = modifier;
            drawerState = drawerState;
            z = z2;
            function2 = function22;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            NavigationDrawerKt.DismissibleNavigationDrawer(function2, modifier, drawerState, z, function2, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$3 */
    /* JADX INFO: compiled from: NavigationDrawer.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06663 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2<Composer, Integer, Unit> $badge;
        final /* synthetic */ NavigationDrawerItemColors $colors;
        final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ boolean $selected;
        final /* synthetic */ Shape $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06663(Function2<? super Composer, ? super Integer, Unit> function2, boolean z2, Function0<Unit> function0, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, NavigationDrawerItemColors navigationDrawerItemColors, MutableInteractionSource mutableInteractionSource, int i2, int i3) {
            super(2);
            function2 = function2;
            z = z2;
            function0 = function0;
            modifier = modifier;
            function2 = function22;
            function2 = function23;
            shape = shape;
            navigationDrawerItemColors = navigationDrawerItemColors;
            mutableInteractionSource = mutableInteractionSource;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            Function2<Composer, Integer, Unit> function2 = function2;
            boolean z2 = z;
            Function0<Unit> function0 = function0;
            Modifier modifier = modifier;
            Function2<Composer, Integer, Unit> function22 = function2;
            Function2<Composer, Integer, Unit> function23 = function2;
            Shape shape = shape;
            NavigationDrawerItemColors navigationDrawerItemColors = navigationDrawerItemColors;
            MutableInteractionSource mutableInteractionSource = mutableInteractionSource;
            int i3 = i;
            NavigationDrawerKt.NavigationDrawerItem(function2, z2, function0, modifier, function22, function23, shape, navigationDrawerItemColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.NavigationDrawerKt$PermanentNavigationDrawer$2 */
    /* JADX INFO: compiled from: NavigationDrawer.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06672 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ Function2<Composer, Integer, Unit> $drawerContent;
        final /* synthetic */ Modifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06672(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, int i2, int i3) {
            super(2);
            function2 = function2;
            modifier = modifier;
            function2 = function22;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            Function2<Composer, Integer, Unit> function2 = function2;
            Modifier modifier = modifier;
            Function2<Composer, Integer, Unit> function22 = function2;
            int i3 = i;
            NavigationDrawerKt.PermanentNavigationDrawer(function2, modifier, function22, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$1 */
    /* JADX INFO: compiled from: NavigationDrawer.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06701 extends Lambda implements Function1<DrawerValue, Boolean> {
        public static final C06701 INSTANCE = ;

        C06701() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(DrawerValue drawerValue) {
            return true;
        }
    }

    public static final DrawerState rememberDrawerState(final DrawerValue drawerValue, final Function1<? super DrawerValue, Boolean> function1, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 2098699222, "C(rememberDrawerState)P(1)286@11488L61,286@11424L125:NavigationDrawer.kt#uh7d8r");
        if ((i3 & 2) != 0) {
            function1 = C06701.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2098699222, i2, -1, "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:285)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.Companion.Saver(function1);
        ComposerKt.sourceInformationMarkerStart(composer, -666801427, "CC(remember):NavigationDrawer.kt#9igjgp");
        int i4 = (((((-1) - (((-1) - i2) | ((-1) - 14))) ^ 6) <= 4 || !composer.changed(drawerValue)) && (i2 + 6) - (6 | i2) != 4) ? 0 : 1;
        int i5 = (((((-1) - (((-1) - i2) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) ^ 48) > 32 && composer.changed(function1)) || (-1) - (((-1) - i2) | ((-1) - 48)) == 32) ? 1 : 0;
        int i6 = (i4 + i5) - (i4 & i5);
        Object objRememberedValue = composer.rememberedValue();
        if (i6 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (Function0) new Function0<DrawerState>() { // from class: androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final DrawerState invoke() {
                    return new DrawerState(drawerValue, function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m3764rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return drawerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:284:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0624  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ModalNavigationDrawer-FHprtrg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m2303ModalNavigationDrawerFHprtrg(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r27, androidx.compose.ui.Modifier r28, androidx.compose.material3.DrawerState r29, boolean r30, long r31, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 1739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m2303ModalNavigationDrawerFHprtrg(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, androidx.compose.material3.DrawerState, boolean, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final boolean ModalNavigationDrawer_FHprtrg$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void ModalNavigationDrawer_FHprtrg$lambda$3(MutableState<Boolean> mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    public static final float ModalNavigationDrawer_FHprtrg$lambda$5(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    public static final void DismissibleNavigationDrawer(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, DrawerState drawerState, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, int i2, int i3) {
        int i4;
        Modifier.Companion companion = modifier;
        boolean z3 = z2;
        final DrawerState drawerStateRememberDrawerState = drawerState;
        Composer composerStartRestartGroup = composer.startRestartGroup(398812198);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DismissibleNavigationDrawer)P(1,4,2,3)440@17931L39,444@18079L34,445@18145L7,446@18168L33,446@18157L44,448@18219L24,449@18269L33,451@18341L7,452@18376L2358:NavigationDrawer.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(function2) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 & 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i6 = ((-1) - (((-1) - i3) | ((-1) - 4)) == 0 && composerStartRestartGroup.changed(drawerStateRememberDrawerState)) ? 256 : 128;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z3) ? 2048 : 1024)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            i4 = (i4 + 24576) - (i4 & 24576);
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((i4 + 9363) - (9363 | i4) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i3 + 4) - (i3 | 4) != 0) {
                    drawerStateRememberDrawerState = rememberDrawerState(DrawerValue.Closed, null, composerStartRestartGroup, 6, 2);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
                if (i7 != 0) {
                    z3 = true;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 4) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(398812198, i4, -1, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:443)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1034582752, "CC(remember):NavigationDrawer.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Density density = (Density) objConsume;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1034585599, "CC(remember):NavigationDrawer.kt#9igjgp");
            int i8 = (896 & i4) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            boolean z4 = (-1) - (((-1) - (((i8 <= 256 || !composerStartRestartGroup.changed(drawerStateRememberDrawerState)) && (384 & i4) != 256) ? 0 : 1)) & ((-1) - (composerStartRestartGroup.changed(density) ? 1 : 0))) == 1;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$1$1
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
                        drawerStateRememberDrawerState.setDensity$material3_release(density);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954363344, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Strings.Companion companion2 = Strings.Companion;
            final String strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(androidx.compose.ui.R.string.navigation_menu), composerStartRestartGroup, 0);
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(companion, drawerStateRememberDrawerState.getAnchoredDraggableState$material3_release(), Orientation.Horizontal, z3, objConsume2 == LayoutDirection.Rtl, null, 16, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAnchoredDraggable$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1217734065, "C483@19473L1255,460@18625L2103:NavigationDrawer.kt#uh7d8r");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 99291876, "CC(remember):NavigationDrawer.kt#9igjgp");
            boolean z5 = (i8 > 256 && composerStartRestartGroup.changed(drawerStateRememberDrawerState)) || (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (384 | i4) == 256;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = (MeasurePolicy) new MeasurePolicy() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo375measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                        final Placeable placeableMo5514measureBRTryo0 = list.get(0).mo5514measureBRTryo0(j2);
                        final Placeable placeableMo5514measureBRTryo02 = list.get(1).mo5514measureBRTryo0(j2);
                        int width = placeableMo5514measureBRTryo02.getWidth();
                        int height = placeableMo5514measureBRTryo02.getHeight();
                        final DrawerState drawerState2 = drawerStateRememberDrawerState;
                        final MutableState<Boolean> mutableState2 = mutableState;
                        return MeasureScope.layout$default(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1.1
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
                                float fPositionOf = drawerState2.getAnchoredDraggableState$material3_release().getAnchors().positionOf(DrawerValue.Closed);
                                final float f2 = -placeableMo5514measureBRTryo0.getWidth();
                                if (!NavigationDrawerKt.DismissibleNavigationDrawer$lambda$16(mutableState2) || fPositionOf != f2) {
                                    if (!NavigationDrawerKt.DismissibleNavigationDrawer$lambda$16(mutableState2)) {
                                        NavigationDrawerKt.DismissibleNavigationDrawer$lambda$17(mutableState2, true);
                                    }
                                    AnchoredDraggableState.updateAnchors$default(drawerState2.getAnchoredDraggableState$material3_release(), AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<DrawerValue>, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.DismissibleNavigationDrawer.2.2.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                            invoke2(draggableAnchorsConfig);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(DraggableAnchorsConfig<DrawerValue> draggableAnchorsConfig) {
                                            draggableAnchorsConfig.at(DrawerValue.Closed, f2);
                                            draggableAnchorsConfig.at(DrawerValue.Open, 0.0f);
                                        }
                                    }), null, 2, null);
                                }
                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo02, placeableMo5514measureBRTryo0.getWidth() + MathKt.roundToInt(drawerState2.requireOffset$material3_release()), 0, 0.0f, 4, null);
                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo0, MathKt.roundToInt(drawerState2.requireOffset$material3_release()), 0, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            Modifier.Companion companion3 = Modifier.Companion;
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 285828320, "C463@18717L623,462@18673L741,481@19431L17:NavigationDrawer.kt#uh7d8r");
            Modifier.Companion companion4 = Modifier.Companion;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1376251797, "CC(remember):NavigationDrawer.kt#9igjgp");
            boolean z6 = (-1) - (((-1) - ((-1) - (((-1) - (composerStartRestartGroup.changed(strM2993getString2EP1pXo) ? 1 : 0)) & ((-1) - (((i8 <= 256 || !composerStartRestartGroup.changed(drawerStateRememberDrawerState)) && (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (384 | i4) != 256) ? 0 : 1))))) & ((-1) - (composerStartRestartGroup.changedInstance(coroutineScope) ? 1 : 0))) == 1;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1
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
                        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM2993getString2EP1pXo);
                        if (drawerStateRememberDrawerState.isOpen()) {
                            final DrawerState drawerState2 = drawerStateRememberDrawerState;
                            final CoroutineScope coroutineScope2 = coroutineScope;
                            SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    if (drawerState2.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(DrawerValue.Closed).booleanValue()) {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C00821(drawerState2, null), 3, null);
                                    }
                                    return true;
                                }

                                /* JADX INFO: renamed from: androidx.compose.material3.NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                                /* JADX INFO: compiled from: NavigationDrawer.kt */
                                /* JADX INFO: loaded from: classes.dex */
                                @InterfaceC1492Gx
                                @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                                @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKl\u0001\u0017\u000b\n\u0005\u0019\u000f\u0016\u0016l\u001c\f#\u0012 y$Tu\u001c'\"\u001f*+\"\u001c'!\u000b\u001f5)(#7-44\u000b:*A0>p\u007fr\u0001t\u0003v\u0005x\u0007z\t", f = "\u001b-A30);/42\u00074\"7$0j'/", i = {}, l = {473}, m = "8>GA>9(KJH>H?", n = {}, s = {})
                                static final class C00821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ DrawerState $drawerState;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C00821(DrawerState drawerState, Continuation<? super C00821> continuation) {
                                        super(2, continuation);
                                        this.$drawerState = drawerState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        return new C00821(this.$drawerState, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C00821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i2 = this.label;
                                        if (i2 == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            this.label = 1;
                                            if (this.$drawerState.close(this) == coroutine_suspended) {
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
                            }, 1, null);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion4, false, (Function1) objRememberedValue5, 1, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierSemantics$default);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl3 = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3671constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3671constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3678setimpl(composerM3671constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 590751801, "C479@19381L15:NavigationDrawer.kt#uh7d8r");
            function2.invoke(composerStartRestartGroup, Integer.valueOf(14 & i4));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Modifier.Companion companion5 = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion5);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl4 = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM3671constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM3671constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m3678setimpl(composerM3671constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 590807167, "C481@19437L9:NavigationDrawer.kt#uh7d8r");
            int i9 = i4 >> 12;
            function22.invoke(composerStartRestartGroup, Integer.valueOf((i9 + 14) - (i9 | 14)));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.DismissibleNavigationDrawer.3
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                final /* synthetic */ Function2<Composer, Integer, Unit> $drawerContent;
                final /* synthetic */ DrawerState $drawerState;
                final /* synthetic */ boolean $gesturesEnabled;
                final /* synthetic */ Modifier $modifier;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(Function2<? super Composer, ? super Integer, Unit> function23, Modifier companion6, final DrawerState drawerStateRememberDrawerState2, boolean z32, Function2<? super Composer, ? super Integer, Unit> function222, int i22, int i32) {
                    super(2);
                    function2 = function23;
                    modifier = companion6;
                    drawerState = drawerStateRememberDrawerState2;
                    z = z32;
                    function2 = function222;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    NavigationDrawerKt.DismissibleNavigationDrawer(function2, modifier, drawerState, z, function2, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
                }
            });
        }
    }

    public static final boolean DismissibleNavigationDrawer$lambda$16(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void DismissibleNavigationDrawer$lambda$17(MutableState<Boolean> mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    public static final void PermanentNavigationDrawer(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, int i2, int i3) {
        int i4;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-276843608);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PermanentNavigationDrawer)P(1,2)538@21771L85:NavigationDrawer.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        if ((i3 & 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function22) ? 256 : 128)));
        }
        if ((i4 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                companion = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-276843608, i4, -1, "androidx.compose.material3.PermanentNavigationDrawer (NavigationDrawer.kt:537)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -882563509, "C539@21809L15,540@21833L17:NavigationDrawer.kt#uh7d8r");
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i4 + 14) - (14 | i4)));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.Companion;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1559366900, "C540@21839L9:NavigationDrawer.kt#uh7d8r");
            function22.invoke(composerStartRestartGroup, Integer.valueOf((-1) - (((-1) - (i4 >> 6)) | ((-1) - 14))));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.PermanentNavigationDrawer.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                final /* synthetic */ Function2<Composer, Integer, Unit> $drawerContent;
                final /* synthetic */ Modifier $modifier;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06672(Function2<? super Composer, ? super Integer, Unit> function23, Modifier companion3, Function2<? super Composer, ? super Integer, Unit> function222, int i22, int i32) {
                    super(2);
                    function2 = function23;
                    modifier = companion3;
                    function2 = function222;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    Function2<Composer, Integer, Unit> function23 = function2;
                    Modifier modifier2 = modifier;
                    Function2<Composer, Integer, Unit> function222 = function2;
                    int i32 = i;
                    NavigationDrawerKt.PermanentNavigationDrawer(function23, modifier2, function222, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ModalDrawerSheet-afqeVBk */
    public static final void m2302ModalDrawerSheetafqeVBk(Modifier modifier, Shape shape, long j2, long j3, float f2, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        long jM1947contentColorForek8zF_U = j3;
        float fM2094getModalDrawerElevationD9Ej5fM = f2;
        Shape shape2 = shape;
        long modalContainerColor = j2;
        WindowInsets windowInsets2 = windowInsets;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1001163336);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ModalDrawerSheet)P(5,3,1:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,6)567@23196L5,568@23252L19,569@23305L37,571@23460L12,574@23530L225:NavigationDrawer.kt#uh7d8r");
        int i5 = (i3 + 1) - (i3 | 1);
        if (i5 != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 4 : 2;
            i4 = (i6 + i2) - (i6 & i2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 2)) == 0 && composerStartRestartGroup.changed(shape2)) ? 32 : 16;
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 |= ((i3 + 4) - (i3 | 4) == 0 && composerStartRestartGroup.changed(modalContainerColor)) ? 256 : 128;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i7 = ((-1) - (((-1) - i3) | ((-1) - 8)) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U)) ? 2048 : 1024;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = (i3 + 16) - (i3 | 16);
        if (i8 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(fM2094getModalDrawerElevationD9Ej5fM) ? 16384 : 8192)));
        }
        if ((196608 & i2) == 0) {
            int i9 = ((i3 & 32) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 131072 : 65536;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((i3 + 64) - (i3 | 64) != 0) {
            i4 |= 1572864;
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
        }
        if ((599187 & i4) != 599186 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i3 + 2) - (i3 | 2) != 0) {
                    shape2 = DrawerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i4 = (i4 - 113) - (i4 | (-113));
                }
                if ((i3 + 4) - (i3 | 4) != 0) {
                    modalContainerColor = DrawerDefaults.INSTANCE.getModalContainerColor(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(modalContainerColor, composerStartRestartGroup, (i4 >> 6) & 14);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-7169)));
                }
                if (i8 != 0) {
                    fM2094getModalDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m2094getModalDrawerElevationD9Ej5fM();
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    windowInsets2 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-113)));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                    i4 &= -897;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if ((i3 & 32) != 0) {
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1001163336, i4, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:573)");
            }
            int i10 = (-1) - (((-1) - (i4 >> 12)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            int i11 = i4 << 6;
            int i12 = (-1) - (((-1) - ((i10 + 6) - (i10 & 6))) & ((-1) - ((-1) - (((-1) - i11) | ((-1) - 896)))));
            int i13 = 7168 & i11;
            int i14 = (i12 + i13) - (i12 & i13);
            int i15 = (57344 + i11) - (57344 | i11);
            int i16 = ((i14 + i15) - (i14 & i15)) | ((-1) - (((-1) - 458752) | ((-1) - i11)));
            int i17 = (-1) - (((-1) - i11) | ((-1) - 3670016));
            int i18 = i4 << 3;
            m2300DrawerSheet7zSek6w(null, windowInsets2, companion, shape2, modalContainerColor, jM1947contentColorForek8zF_U, fM2094getModalDrawerElevationD9Ej5fM, function3, composerStartRestartGroup, (-1) - (((-1) - ((i16 + i17) - (i16 & i17))) & ((-1) - ((i18 + 29360128) - (i18 | 29360128)))), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final Shape shape3 = shape2;
            final long j4 = modalContainerColor;
            final long j5 = jM1947contentColorForek8zF_U;
            final float f3 = fM2094getModalDrawerElevationD9Ej5fM;
            final WindowInsets windowInsets3 = windowInsets2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$1
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

                public final void invoke(Composer composer2, int i19) {
                    Modifier modifier3 = modifier2;
                    Shape shape4 = shape3;
                    long j6 = j4;
                    long j7 = j5;
                    float f4 = f3;
                    WindowInsets windowInsets4 = windowInsets3;
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    int i20 = i2;
                    NavigationDrawerKt.m2302ModalDrawerSheetafqeVBk(modifier3, shape4, j6, j7, f4, windowInsets4, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i20 + 1) - (i20 & 1)), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ModalDrawerSheet-Snr_uVM */
    public static final void m2301ModalDrawerSheetSnr_uVM(final DrawerState drawerState, Modifier modifier, Shape shape, long j2, long j3, float f2, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        WindowInsets windowInsets2 = windowInsets;
        long jM1947contentColorForek8zF_U = j3;
        long modalContainerColor = j2;
        float fM2094getModalDrawerElevationD9Ej5fM = f2;
        Shape shape2 = shape;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1513027356);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ModalDrawerSheet)P(4,6,3,1:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.unit.Dp,7)611@25149L5,612@25205L19,613@25258L37,615@25413L12,618@25524L299,618@25483L340:NavigationDrawer.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(drawerState) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i5 = (i3 + 2) - (i3 | 2);
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 4) == 0 && composerStartRestartGroup.changed(shape2)) ? 256 : 128)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 8)) == 0 && composerStartRestartGroup.changed(modalContainerColor)) ? 2048 : 1024;
        }
        if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 |= ((i3 + 16) - (i3 | 16) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U)) ? 16384 : 8192;
        }
        int i7 = (i3 + 32) - (i3 | 32);
        if (i7 != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(fM2094getModalDrawerElevationD9Ej5fM) ? 131072 : 65536)));
        }
        if ((-1) - (((-1) - 1572864) | ((-1) - i2)) == 0) {
            int i8 = ((-1) - (((-1) - i3) | ((-1) - 64)) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 1048576 : 524288;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
            i4 |= 12582912;
        } else if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            int i9 = composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((i4 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                    shape2 = DrawerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if ((i3 + 8) - (i3 | 8) != 0) {
                    modalContainerColor = DrawerDefaults.INSTANCE.getModalContainerColor(composerStartRestartGroup, 6);
                    i4 &= -7169;
                }
                if ((i3 + 16) - (i3 | 16) != 0) {
                    int i10 = i4 >> 9;
                    jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(modalContainerColor, composerStartRestartGroup, (i10 + 14) - (i10 | 14));
                    i4 &= -57345;
                }
                if (i7 != 0) {
                    fM2094getModalDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m2094getModalDrawerElevationD9Ej5fM();
                }
                if ((i3 & 64) != 0) {
                    windowInsets2 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i4 &= -3670017;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
                if ((i3 + 8) - (i3 | 8) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-7169)));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    i4 &= -57345;
                }
                if ((i3 + 64) - (i3 | 64) != 0) {
                    i4 = (i4 - 3670017) - (i4 | (-3670017));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1513027356, i4, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:617)");
            }
            final WindowInsets windowInsets3 = windowInsets2;
            final Modifier modifier2 = companion;
            final Shape shape3 = shape2;
            final long j4 = modalContainerColor;
            final long j5 = jM1947contentColorForek8zF_U;
            final float f3 = fM2094getModalDrawerElevationD9Ej5fM;
            NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(1552342929, true, new Function3<DrawerPredictiveBackState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, Integer num) {
                    invoke(drawerPredictiveBackState, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, int i11) {
                    int i12 = i11;
                    ComposerKt.sourceInformation(composer2, "C619@25563L254:NavigationDrawer.kt#uh7d8r");
                    if ((i12 + 6) - (6 | i12) == 0) {
                        i12 |= composer2.changed(drawerPredictiveBackState) ? 4 : 2;
                    }
                    if ((i12 + 19) - (19 | i12) != 18 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1552342929, i12, -1, "androidx.compose.material3.ModalDrawerSheet.<anonymous> (NavigationDrawer.kt:619)");
                        }
                        NavigationDrawerKt.m2300DrawerSheet7zSek6w(drawerPredictiveBackState, windowInsets3, modifier2, shape3, j4, j5, f3, function3, composer2, i12 & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - i4) | ((-1) - 14)))) & ((-1) - 48)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final float f4 = fM2094getModalDrawerElevationD9Ej5fM;
            final WindowInsets windowInsets4 = windowInsets2;
            final long j6 = modalContainerColor;
            final long j7 = jM1947contentColorForek8zF_U;
            final Modifier modifier3 = companion;
            final Shape shape4 = shape2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$3
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

                public final void invoke(Composer composer2, int i11) {
                    DrawerState drawerState2 = drawerState;
                    Modifier modifier4 = modifier3;
                    Shape shape5 = shape4;
                    long j8 = j6;
                    long j9 = j7;
                    float f5 = f4;
                    WindowInsets windowInsets5 = windowInsets4;
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    int i12 = i2;
                    NavigationDrawerKt.m2301ModalDrawerSheetSnr_uVM(drawerState2, modifier4, shape5, j8, j9, f5, windowInsets5, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i12 + 1) - (i12 & 1)), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: DismissibleDrawerSheet-afqeVBk */
    public static final void m2299DismissibleDrawerSheetafqeVBk(Modifier modifier, Shape shape, long j2, long j3, float f2, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        WindowInsets windowInsets2 = windowInsets;
        long jM1947contentColorForek8zF_U = j3;
        long standardContainerColor = j2;
        float fM2092getDismissibleDrawerElevationD9Ej5fM = f2;
        Shape rectangleShape = shape;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-588600583);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DismissibleDrawerSheet)P(5,3,1:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,6)656@27243L22,657@27299L37,659@27460L12,662@27530L225:NavigationDrawer.kt#uh7d8r");
        int i5 = (-1) - (((-1) - i3) | ((-1) - 1));
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 4 : 2;
            i4 = (i6 + i2) - (i6 & i2);
        } else {
            i4 = i2;
        }
        int i7 = (i3 + 2) - (i3 | 2);
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(rectangleShape) ? 32 : 16;
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((-1) - (((-1) - i3) | ((-1) - 4)) == 0 && composerStartRestartGroup.changed(standardContainerColor)) ? 256 : 128)));
        }
        if ((i2 & 3072) == 0) {
            i4 |= ((i3 & 8) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U)) ? 2048 : 1024;
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 16));
        if (i8 != 0) {
            i4 |= 24576;
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            int i9 = composerStartRestartGroup.changed(fM2092getDismissibleDrawerElevationD9Ej5fM) ? 16384 : 8192;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 1572864));
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
        }
        if ((i4 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                if ((i3 + 4) - (i3 | 4) != 0) {
                    standardContainerColor = DrawerDefaults.INSTANCE.getStandardContainerColor(composerStartRestartGroup, 6);
                    i4 = (i4 - 897) - (i4 | (-897));
                }
                if ((i3 + 8) - (i3 | 8) != 0) {
                    int i10 = i4 >> 6;
                    jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(standardContainerColor, composerStartRestartGroup, (i10 + 14) - (i10 | 14));
                    i4 &= -7169;
                }
                if (i8 != 0) {
                    fM2092getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m2092getDismissibleDrawerElevationD9Ej5fM();
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    windowInsets2 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i4 &= -458753;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-7169)));
                }
                if ((i3 & 32) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-588600583, i4, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:661)");
            }
            int i11 = i4 >> 12;
            int i12 = i4 << 6;
            int i13 = ((-1) - (((-1) - (6 | ((i11 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i11 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))) & ((-1) - (896 & i12)))) | (7168 & i12) | ((57344 + i12) - (57344 | i12)) | ((458752 + i12) - (458752 | i12)) | ((-1) - (((-1) - i12) | ((-1) - 3670016))) | ((-1) - (((-1) - (i4 << 3)) | ((-1) - 29360128)));
            Modifier modifier2 = companion;
            WindowInsets windowInsets3 = windowInsets2;
            m2300DrawerSheet7zSek6w(null, windowInsets3, modifier2, rectangleShape, standardContainerColor, jM1947contentColorForek8zF_U, fM2092getDismissibleDrawerElevationD9Ej5fM, function3, composerStartRestartGroup, i13, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = companion;
            final Shape shape2 = rectangleShape;
            final long j4 = standardContainerColor;
            final long j5 = jM1947contentColorForek8zF_U;
            final float f3 = fM2092getDismissibleDrawerElevationD9Ej5fM;
            final WindowInsets windowInsets4 = windowInsets2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$1
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

                public final void invoke(Composer composer2, int i14) {
                    NavigationDrawerKt.m2299DismissibleDrawerSheetafqeVBk(modifier3, shape2, j4, j5, f3, windowInsets4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: DismissibleDrawerSheet-Snr_uVM */
    public static final void m2298DismissibleDrawerSheetSnr_uVM(final DrawerState drawerState, Modifier modifier, Shape shape, long j2, long j3, float f2, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        WindowInsets windowInsets2 = windowInsets;
        long jM1947contentColorForek8zF_U = j3;
        long standardContainerColor = j2;
        float fM2092getDismissibleDrawerElevationD9Ej5fM = f2;
        Shape rectangleShape = shape;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1473549901);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DismissibleDrawerSheet)P(4,6,3,1:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.unit.Dp,7)700@29223L22,701@29279L37,703@29440L12,706@29551L299,706@29510L340:NavigationDrawer.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (composerStartRestartGroup.changed(drawerState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(rectangleShape) ? 256 : 128)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i4 |= ((i3 & 8) == 0 && composerStartRestartGroup.changed(standardContainerColor)) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= ((i3 & 16) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U)) ? 16384 : 8192;
        }
        int i7 = (i3 + 32) - (i3 | 32);
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((196608 & i2) == 0) {
            int i8 = composerStartRestartGroup.changed(fM2092getDismissibleDrawerElevationD9Ej5fM) ? 131072 : 65536;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            int i9 = ((i3 & 64) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 1048576 : 524288;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304)));
        }
        if ((i4 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                if ((i3 & 8) != 0) {
                    standardContainerColor = DrawerDefaults.INSTANCE.getStandardContainerColor(composerStartRestartGroup, 6);
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if ((i3 & 16) != 0) {
                    jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(standardContainerColor, composerStartRestartGroup, (i4 >> 9) & 14);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if (i7 != 0) {
                    fM2092getDismissibleDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m2092getDismissibleDrawerElevationD9Ej5fM();
                }
                if ((i3 & 64) != 0) {
                    windowInsets2 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-3670017)));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    i4 &= -7169;
                }
                if ((i3 + 16) - (i3 | 16) != 0) {
                    i4 &= -57345;
                }
                if ((i3 & 64) != 0) {
                    i4 = (i4 - 3670017) - (i4 | (-3670017));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1473549901, i4, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:705)");
            }
            final WindowInsets windowInsets3 = windowInsets2;
            final Modifier modifier2 = companion;
            final Shape shape2 = rectangleShape;
            final long j4 = standardContainerColor;
            final long j5 = jM1947contentColorForek8zF_U;
            final float f3 = fM2092getDismissibleDrawerElevationD9Ej5fM;
            NavigationDrawer_androidKt.DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(-807955710, true, new Function3<DrawerPredictiveBackState, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, Integer num) {
                    invoke(drawerPredictiveBackState, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(DrawerPredictiveBackState drawerPredictiveBackState, Composer composer2, int i10) {
                    int i11 = i10;
                    ComposerKt.sourceInformation(composer2, "C707@29590L254:NavigationDrawer.kt#uh7d8r");
                    if ((i11 + 6) - (6 | i11) == 0) {
                        i11 |= composer2.changed(drawerPredictiveBackState) ? 4 : 2;
                    }
                    if ((i11 & 19) != 18 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-807955710, i11, -1, "androidx.compose.material3.DismissibleDrawerSheet.<anonymous> (NavigationDrawer.kt:707)");
                        }
                        NavigationDrawerKt.m2300DrawerSheet7zSek6w(drawerPredictiveBackState, windowInsets3, modifier2, shape2, j4, j5, f3, function3, composer2, (i11 + 14) - (i11 | 14), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - i4) | ((-1) - 14)))) & ((-1) - 48)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j6 = jM1947contentColorForek8zF_U;
            final float f4 = fM2092getDismissibleDrawerElevationD9Ej5fM;
            final WindowInsets windowInsets4 = windowInsets2;
            final Shape shape3 = rectangleShape;
            final long j7 = standardContainerColor;
            final Modifier modifier3 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DismissibleDrawerSheet$3
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

                public final void invoke(Composer composer2, int i10) {
                    NavigationDrawerKt.m2298DismissibleDrawerSheetSnr_uVM(drawerState, modifier3, shape3, j7, j6, f4, windowInsets4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: PermanentDrawerSheet-afqeVBk */
    public static final void m2304PermanentDrawerSheetafqeVBk(Modifier modifier, Shape shape, long j2, long j3, float f2, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        WindowInsets windowInsets2 = windowInsets;
        long jM1947contentColorForek8zF_U = j3;
        long standardContainerColor = j2;
        float fM2095getPermanentDrawerElevationD9Ej5fM = f2;
        Shape rectangleShape = shape;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1733353241);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PermanentDrawerSheet)P(5,3,1:c#ui.graphics.Color,2:c#ui.graphics.Color,4:c#ui.unit.Dp,6)740@31022L22,741@31078L37,743@31237L12,746@31328L33,750@31470L30,747@31366L266:NavigationDrawer.kt#uh7d8r");
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(companion) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 2));
        if (i6 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 |= composerStartRestartGroup.changed(rectangleShape) ? 32 : 16;
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 |= ((i3 + 4) - (i3 | 4) == 0 && composerStartRestartGroup.changed(standardContainerColor)) ? 256 : 128;
        }
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((-1) - (((-1) - i3) | ((-1) - 8)) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U)) ? 2048 : 1024)));
        }
        int i7 = i3 & 16;
        if (i7 != 0) {
            i4 |= 24576;
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            int i8 = composerStartRestartGroup.changed(fM2095getPermanentDrawerElevationD9Ej5fM) ? 16384 : 8192;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 32) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 131072 : 65536)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 1572864));
        } else if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 599187)) != 599186 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                if ((i3 + 4) - (i3 | 4) != 0) {
                    standardContainerColor = DrawerDefaults.INSTANCE.getStandardContainerColor(composerStartRestartGroup, 6);
                    i4 = (i4 - 897) - (i4 | (-897));
                }
                if ((i3 + 8) - (i3 | 8) != 0) {
                    int i9 = i4 >> 6;
                    jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(standardContainerColor, composerStartRestartGroup, (i9 + 14) - (i9 | 14));
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if (i7 != 0) {
                    fM2095getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m2095getPermanentDrawerElevationD9Ej5fM();
                }
                if ((i3 & 32) != 0) {
                    windowInsets2 = DrawerDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i4 = (i4 - 458753) - (i4 | (-458753));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-458753)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1733353241, i4, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:745)");
            }
            Strings.Companion companion2 = Strings.Companion;
            final String strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(androidx.compose.ui.R.string.navigation_menu), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 391093473, "CC(remember):NavigationDrawer.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(strM2993getString2EP1pXo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$1$1
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
                        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM2993getString2EP1pXo);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null);
            int i10 = (-1) - (((-1) - (i4 >> 12)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            int i11 = i4 << 6;
            int i12 = (-1) - (((-1) - ((i10 + 6) - (i10 & 6))) & ((-1) - ((i11 + 7168) - (7168 | i11))));
            int i13 = 57344 & i11;
            int i14 = (-1) - (((-1) - ((i12 + i13) - (i12 & i13))) & ((-1) - ((458752 + i11) - (458752 | i11))));
            int i15 = (i11 + 3670016) - (i11 | 3670016);
            int i16 = (i14 + i15) - (i14 & i15);
            int i17 = (i4 << 3) & 29360128;
            WindowInsets windowInsets3 = windowInsets2;
            m2300DrawerSheet7zSek6w(null, windowInsets3, modifierSemantics$default, rectangleShape, standardContainerColor, jM1947contentColorForek8zF_U, fM2095getPermanentDrawerElevationD9Ej5fM, function3, composerStartRestartGroup, (i16 + i17) - (i16 & i17), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final Shape shape2 = rectangleShape;
            final long j4 = standardContainerColor;
            final long j5 = jM1947contentColorForek8zF_U;
            final float f3 = fM2095getPermanentDrawerElevationD9Ej5fM;
            final WindowInsets windowInsets4 = windowInsets2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$PermanentDrawerSheet$2
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

                public final void invoke(Composer composer2, int i18) {
                    Modifier modifier3 = modifier2;
                    Shape shape3 = shape2;
                    long j6 = j4;
                    long j7 = j5;
                    float f4 = f3;
                    WindowInsets windowInsets5 = windowInsets4;
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    int i19 = i2;
                    NavigationDrawerKt.m2304PermanentDrawerSheetafqeVBk(modifier3, shape3, j6, j7, f4, windowInsets5, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i19 + 1) - (i19 & 1)), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: DrawerSheet-7zSek6w */
    public static final void m2300DrawerSheet7zSek6w(final DrawerPredictiveBackState drawerPredictiveBackState, final WindowInsets windowInsets, Modifier modifier, Shape shape, long j2, long j3, float f2, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier.Companion companionPredictiveBackDrawerContainer;
        long jM1947contentColorForek8zF_U = j3;
        long standardContainerColor = j2;
        float fM2095getPermanentDrawerElevationD9Ej5fM = f2;
        Shape rectangleShape = shape;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-151557245);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DrawerSheet)P(3,7,6,4,1:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.unit.Dp)765@31890L22,766@31946L37,770@32146L7,785@32790L545,775@32383L952:NavigationDrawer.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(drawerPredictiveBackState) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(windowInsets) ? 32 : 16;
        }
        int i5 = (i3 + 4) - (i3 | 4);
        if (i5 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 256 : 128)));
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(rectangleShape) ? 2048 : 1024)));
        }
        if ((i2 & 24576) == 0) {
            i4 |= ((i3 + 16) - (i3 | 16) == 0 && composerStartRestartGroup.changed(standardContainerColor)) ? 16384 : 8192;
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            int i7 = ((i3 + 32) - (i3 | 32) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U)) ? 131072 : 65536;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = i3 & 64;
        if (i8 != 0) {
            i4 = (i4 + 1572864) - (i4 & 1572864);
        } else if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changed(fM2095getPermanentDrawerElevationD9Ej5fM) ? 1048576 : 524288;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 128)) != 0) {
            i4 = (i4 + 12582912) - (i4 & 12582912);
        } else if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
        }
        if ((-1) - (((-1) - 4793491) | ((-1) - i4)) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                if ((i3 + 16) - (i3 | 16) != 0) {
                    standardContainerColor = DrawerDefaults.INSTANCE.getStandardContainerColor(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                if ((i3 + 32) - (i3 | 32) != 0) {
                    int i9 = i4 >> 12;
                    jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(standardContainerColor, composerStartRestartGroup, (i9 + 14) - (i9 | 14));
                    i4 = ((-458753) + i4) - ((-458753) | i4);
                }
                if (i8 != 0) {
                    fM2095getPermanentDrawerElevationD9Ej5fM = DrawerDefaults.INSTANCE.m2095getPermanentDrawerElevationD9Ej5fM();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 16) - (i3 | 16) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
                if ((i3 & 32) != 0) {
                    i4 &= -458753;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-151557245, i4, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:769)");
            }
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            boolean z2 = objConsume == LayoutDirection.Rtl;
            if (drawerPredictiveBackState != null) {
                companionPredictiveBackDrawerContainer = predictiveBackDrawerContainer(Modifier.Companion, drawerPredictiveBackState, z2);
            } else {
                companionPredictiveBackDrawerContainer = Modifier.Companion;
            }
            final boolean z3 = z2;
            int i10 = i4 >> 6;
            Shape shape2 = rectangleShape;
            long j4 = standardContainerColor;
            SurfaceKt.m2561SurfaceT9BRK9s(SizeKt.fillMaxHeight$default(SizeKt.m1067sizeInqDBjuR0$default(companion, MinimumDrawerWidth, 0.0f, DrawerDefaults.INSTANCE.m2093getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null).then(companionPredictiveBackDrawerContainer), 0.0f, 1, null), shape2, j4, jM1947contentColorForek8zF_U, fM2095getPermanentDrawerElevationD9Ej5fM, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(669057502, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DrawerSheet$1
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

                public final void invoke(Composer composer2, int i11) {
                    Modifier.Companion companionPredictiveBackDrawerChild;
                    ComposerKt.sourceInformation(composer2, "C790@33010L319:NavigationDrawer.kt#uh7d8r");
                    if ((-1) - (((-1) - i11) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(669057502, i11, -1, "androidx.compose.material3.DrawerSheet.<anonymous> (NavigationDrawer.kt:786)");
                        }
                        if (drawerPredictiveBackState != null) {
                            companionPredictiveBackDrawerChild = NavigationDrawerKt.predictiveBackDrawerChild(Modifier.Companion, drawerPredictiveBackState, z3);
                        } else {
                            companionPredictiveBackDrawerChild = Modifier.Companion;
                        }
                        Modifier modifierWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.m1067sizeInqDBjuR0$default(Modifier.Companion, NavigationDrawerKt.MinimumDrawerWidth, 0.0f, DrawerDefaults.INSTANCE.m2093getMaximumDrawerWidthD9Ej5fM(), 0.0f, 10, null).then(companionPredictiveBackDrawerChild), windowInsets);
                        Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierWindowInsetsPadding);
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
                        Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                        function32.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - ((((-1) - (((-1) - ((-1) - (((-1) - i10) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))) & ((-1) - 12582912))) | (896 & i10)) | ((i10 + 7168) - (7168 | i10)))) & ((-1) - ((i10 + 57344) - (i10 | 57344)))), 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final Shape shape3 = rectangleShape;
            final long j5 = standardContainerColor;
            final long j6 = jM1947contentColorForek8zF_U;
            final float f3 = fM2095getPermanentDrawerElevationD9Ej5fM;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DrawerSheet$2
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

                public final void invoke(Composer composer2, int i11) {
                    DrawerPredictiveBackState drawerPredictiveBackState2 = drawerPredictiveBackState;
                    WindowInsets windowInsets2 = windowInsets;
                    Modifier modifier3 = modifier2;
                    Shape shape4 = shape3;
                    long j7 = j5;
                    long j8 = j6;
                    float f4 = f3;
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    int i12 = i2;
                    NavigationDrawerKt.m2300DrawerSheet7zSek6w(drawerPredictiveBackState2, windowInsets2, modifier3, shape4, j7, j8, f4, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i12 + 1) - (i12 & 1)), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.NavigationDrawerKt$predictiveBackDrawerContainer$1 */
    /* JADX INFO: compiled from: NavigationDrawer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<4?OkA\f\u0013rl9\\", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06691 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
        final /* synthetic */ boolean $isRtl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06691(boolean z2) {
            super(1);
            z = z2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
            invoke2(graphicsLayerScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
            graphicsLayerScope.setScaleX(NavigationDrawerKt.calculatePredictiveBackScaleX(graphicsLayerScope, drawerPredictiveBackState));
            graphicsLayerScope.setScaleY(NavigationDrawerKt.calculatePredictiveBackScaleY(graphicsLayerScope, drawerPredictiveBackState));
            graphicsLayerScope.mo4371setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 1.0f : 0.0f, 0.5f));
        }
    }

    private static final Modifier predictiveBackDrawerContainer(Modifier modifier, DrawerPredictiveBackState drawerPredictiveBackState, boolean z2) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.predictiveBackDrawerContainer.1
            final /* synthetic */ boolean $isRtl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06691(boolean z22) {
                super(1);
                z = z22;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.setScaleX(NavigationDrawerKt.calculatePredictiveBackScaleX(graphicsLayerScope, drawerPredictiveBackState));
                graphicsLayerScope.setScaleY(NavigationDrawerKt.calculatePredictiveBackScaleY(graphicsLayerScope, drawerPredictiveBackState));
                graphicsLayerScope.mo4371setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 1.0f : 0.0f, 0.5f));
            }
        });
    }

    /* JADX INFO: renamed from: androidx.compose.material3.NavigationDrawerKt$predictiveBackDrawerChild$1 */
    /* JADX INFO: compiled from: NavigationDrawer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<4?OkA\f\u0013rl9\\", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06681 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
        final /* synthetic */ boolean $isRtl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06681(boolean z2) {
            super(1);
            z = z2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
            invoke2(graphicsLayerScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
            float fCalculatePredictiveBackScaleX = NavigationDrawerKt.calculatePredictiveBackScaleX(graphicsLayerScope, drawerPredictiveBackState);
            graphicsLayerScope.setScaleX(fCalculatePredictiveBackScaleX == 0.0f ? 1.0f : NavigationDrawerKt.calculatePredictiveBackScaleY(graphicsLayerScope, drawerPredictiveBackState) / fCalculatePredictiveBackScaleX);
            graphicsLayerScope.mo4371setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 0.0f : 1.0f, 0.0f));
        }
    }

    public static final Modifier predictiveBackDrawerChild(Modifier modifier, DrawerPredictiveBackState drawerPredictiveBackState, boolean z2) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.predictiveBackDrawerChild.1
            final /* synthetic */ boolean $isRtl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06681(boolean z22) {
                super(1);
                z = z22;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                float fCalculatePredictiveBackScaleX = NavigationDrawerKt.calculatePredictiveBackScaleX(graphicsLayerScope, drawerPredictiveBackState);
                graphicsLayerScope.setScaleX(fCalculatePredictiveBackScaleX == 0.0f ? 1.0f : NavigationDrawerKt.calculatePredictiveBackScaleY(graphicsLayerScope, drawerPredictiveBackState) / fCalculatePredictiveBackScaleX);
                graphicsLayerScope.mo4371setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 0.0f : 1.0f, 0.0f));
            }
        });
    }

    public static final float calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float fM4006getWidthimpl = Size.m4006getWidthimpl(graphicsLayerScope.mo4365getSizeNHjbRc());
        if (Float.isNaN(fM4006getWidthimpl) || fM4006getWidthimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f + ((drawerPredictiveBackState.getScaleXDistance() * (drawerPredictiveBackState.getSwipeEdgeMatchesDrawer() ? 1 : -1)) / fM4006getWidthimpl);
    }

    public static final float calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float fM4003getHeightimpl = Size.m4003getHeightimpl(graphicsLayerScope.mo4365getSizeNHjbRc());
        if (Float.isNaN(fM4003getHeightimpl) || fM4003getHeightimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (drawerPredictiveBackState.getScaleYDistance() / fM4003getHeightimpl);
    }

    public static final void NavigationDrawerItem(Function2<? super Composer, ? super Integer, Unit> function2, boolean z2, Function0<Unit> function0, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, NavigationDrawerItemColors navigationDrawerItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        NavigationDrawerItemColors navigationDrawerItemColorsM2297colorsoq7We08 = navigationDrawerItemColors;
        Shape value = shape;
        Function2<? super Composer, ? super Integer, Unit> function24 = function23;
        Function2<? super Composer, ? super Integer, Unit> function25 = function22;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1304626543);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(NavigationDrawerItem)P(4,7,6,5,2!1,8)931@38697L5,932@38774L8,944@39157L24,946@39242L884,935@38848L1278:NavigationDrawer.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function2) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 2048 : 1024;
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 16));
        if (i7 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function25) ? 16384 : 8192)));
        }
        int i8 = (i3 + 32) - (i3 | 32);
        if (i8 != 0) {
            i4 = (i4 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function24) ? 131072 : 65536)));
        }
        if ((1572864 & i2) == 0) {
            i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(value)) ? 1048576 : 524288;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            i4 |= ((-1) - (((-1) - i3) | ((-1) - 128)) == 0 && composerStartRestartGroup.changed(navigationDrawerItemColorsM2297colorsoq7We08)) ? 8388608 : 4194304;
        }
        int i9 = (i3 + 256) - (i3 | 256);
        if (i9 != 0) {
            i4 |= 100663296;
        } else if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((i4 + 38347923) - (38347923 | i4) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    function25 = null;
                }
                if (i8 != 0) {
                    function24 = null;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
                    value = ShapesKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                    i4 = (i4 - 3670017) - (i4 | (-3670017));
                }
                if ((i3 & 128) != 0) {
                    navigationDrawerItemColorsM2297colorsoq7We08 = NavigationDrawerItemDefaults.INSTANCE.m2297colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 100663296, 255);
                    i4 = (i4 - 29360129) - (i4 | (-29360129));
                }
                if (i9 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 64) - (i3 | 64) != 0) {
                    i4 = (i4 - 3670017) - (i4 | (-3670017));
                }
                if ((i3 & 128) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-29360129)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1304626543, i4, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:934)");
            }
            int i10 = i4 >> 3;
            int i11 = (-1) - (((-1) - (i4 >> 24)) | ((-1) - 14));
            SurfaceKt.m2562Surfaced85dljk(z2, function0, SizeKt.fillMaxWidth$default(SizeKt.m1051heightInVpY3zN4$default(SemanticsModifierKt.semantics$default(companion, false, AnonymousClass1.INSTANCE, 1, null), NavigationDrawerTokens.INSTANCE.m3341getActiveIndicatorHeightD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), false, value, navigationDrawerItemColorsM2297colorsoq7We08.containerColor(z2, composerStartRestartGroup, ((-1) - (((-1) - i10) | ((-1) - 14))) | ((-1) - (((-1) - (i4 >> 18)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))).getValue().m4188unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(191488423, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.NavigationDrawerItem.2
                final /* synthetic */ Function2<Composer, Integer, Unit> $badge;
                final /* synthetic */ NavigationDrawerItemColors $colors;
                final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
                final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                final /* synthetic */ boolean $selected;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(Function2<? super Composer, ? super Integer, Unit> function252, NavigationDrawerItemColors navigationDrawerItemColorsM2297colorsoq7We082, boolean z22, Function2<? super Composer, ? super Integer, Unit> function242, Function2<? super Composer, ? super Integer, Unit> function26) {
                    super(2);
                    function2 = function252;
                    navigationDrawerItemColors = navigationDrawerItemColorsM2297colorsoq7We082;
                    z = z22;
                    function2 = function242;
                    function2 = function26;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12) {
                    ComposerKt.sourceInformation(composer2, "C947@39252L868:NavigationDrawer.kt#uh7d8r");
                    if ((-1) - (((-1) - i12) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(191488423, i12, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:947)");
                        }
                        Modifier modifierM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(Modifier.Companion, Dp.m6638constructorimpl(16), 0.0f, Dp.m6638constructorimpl(24), 0.0f, 10, null);
                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                        Function2<Composer, Integer, Unit> function26 = function2;
                        NavigationDrawerItemColors navigationDrawerItemColors2 = navigationDrawerItemColors;
                        boolean z3 = z;
                        Function2<Composer, Integer, Unit> function27 = function2;
                        Function2<Composer, Integer, Unit> function28 = function2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1022paddingqDBjuR0$default);
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
                        Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1046361182, "C956@39650L203:NavigationDrawer.kt#uh7d8r");
                        composer2.startReplaceGroup(-449396056);
                        ComposerKt.sourceInformation(composer2, "952@39457L19,953@39499L78,954@39594L29");
                        if (function26 != null) {
                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(navigationDrawerItemColors2.iconColor(z3, composer2, 0).getValue().m4188unboximpl())), function26, composer2, ProvidedValue.$stable);
                            SpacerKt.Spacer(SizeKt.m1068width3ABfNKs(Modifier.Companion, Dp.m6638constructorimpl(12)), composer2, 6);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null);
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composer2);
                        Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 839121305, "C957@39717L19,958@39759L80:NavigationDrawer.kt#uh7d8r");
                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(navigationDrawerItemColors2.textColor(z3, composer2, 0).getValue().m4188unboximpl())), function28, composer2, ProvidedValue.$stable);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.startReplaceGroup(-449381075);
                        ComposerKt.sourceInformation(composer2, "961@39903L29,962@39973L20,963@40016L80");
                        if (function27 != null) {
                            SpacerKt.Spacer(SizeKt.m1068width3ABfNKs(Modifier.Companion, Dp.m6638constructorimpl(12)), composer2, 6);
                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(navigationDrawerItemColors2.badgeColor(z3, composer2, 0).getValue().m4188unboximpl())), function27, composer2, ProvidedValue.$stable);
                        }
                        composer2.endReplaceGroup();
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - (i10 & 126)) & ((-1) - ((-1) - (((-1) - (i4 >> 6)) | ((-1) - 57344))))), (i11 + 48) - (i11 & 48), 968);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.NavigationDrawerItem.3
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function2<Composer, Integer, Unit> $badge;
                final /* synthetic */ NavigationDrawerItemColors $colors;
                final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;
                final /* synthetic */ boolean $selected;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06663(Function2<? super Composer, ? super Integer, Unit> function26, boolean z22, Function0<Unit> function02, Modifier companion2, Function2<? super Composer, ? super Integer, Unit> function252, Function2<? super Composer, ? super Integer, Unit> function242, Shape value2, NavigationDrawerItemColors navigationDrawerItemColorsM2297colorsoq7We082, MutableInteractionSource mutableInteractionSource22, int i22, int i32) {
                    super(2);
                    function2 = function26;
                    z = z22;
                    function0 = function02;
                    modifier = companion2;
                    function2 = function252;
                    function2 = function242;
                    shape = value2;
                    navigationDrawerItemColors = navigationDrawerItemColorsM2297colorsoq7We082;
                    mutableInteractionSource = mutableInteractionSource22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    Function2<Composer, Integer, Unit> function26 = function2;
                    boolean z22 = z;
                    Function0<Unit> function02 = function0;
                    Modifier modifier2 = modifier;
                    Function2<Composer, Integer, Unit> function222 = function2;
                    Function2<Composer, Integer, Unit> function232 = function2;
                    Shape shape2 = shape;
                    NavigationDrawerItemColors navigationDrawerItemColors2 = navigationDrawerItemColors;
                    MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                    int i32 = i;
                    NavigationDrawerKt.NavigationDrawerItem(function26, z22, function02, modifier2, function222, function232, shape2, navigationDrawerItemColors2, mutableInteractionSource3, composer2, RecomposeScopeImplKt.updateChangedFlags((i32 + 1) - (i32 & 1)), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$1 */
    /* JADX INFO: compiled from: NavigationDrawer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertiesKt.m5952setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m5939getTabo7Vup1c());
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$2 */
    /* JADX INFO: compiled from: NavigationDrawer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function2<Composer, Integer, Unit> $badge;
        final /* synthetic */ NavigationDrawerItemColors $colors;
        final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super Composer, ? super Integer, Unit> function252, NavigationDrawerItemColors navigationDrawerItemColorsM2297colorsoq7We082, boolean z22, Function2<? super Composer, ? super Integer, Unit> function242, Function2<? super Composer, ? super Integer, Unit> function26) {
            super(2);
            function2 = function252;
            navigationDrawerItemColors = navigationDrawerItemColorsM2297colorsoq7We082;
            z = z22;
            function2 = function242;
            function2 = function26;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer2, int i12) {
            ComposerKt.sourceInformation(composer2, "C947@39252L868:NavigationDrawer.kt#uh7d8r");
            if ((-1) - (((-1) - i12) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(191488423, i12, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:947)");
                }
                Modifier modifierM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(Modifier.Companion, Dp.m6638constructorimpl(16), 0.0f, Dp.m6638constructorimpl(24), 0.0f, 10, null);
                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                Function2<Composer, Integer, Unit> function26 = function2;
                NavigationDrawerItemColors navigationDrawerItemColors2 = navigationDrawerItemColors;
                boolean z3 = z;
                Function2<Composer, Integer, Unit> function27 = function2;
                Function2<Composer, Integer, Unit> function28 = function2;
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1022paddingqDBjuR0$default);
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
                Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -1046361182, "C956@39650L203:NavigationDrawer.kt#uh7d8r");
                composer2.startReplaceGroup(-449396056);
                ComposerKt.sourceInformation(composer2, "952@39457L19,953@39499L78,954@39594L29");
                if (function26 != null) {
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(navigationDrawerItemColors2.iconColor(z3, composer2, 0).getValue().m4188unboximpl())), function26, composer2, ProvidedValue.$stable);
                    SpacerKt.Spacer(SizeKt.m1068width3ABfNKs(Modifier.Companion, Dp.m6638constructorimpl(12)), composer2, 6);
                }
                composer2.endReplaceGroup();
                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composer2);
                Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 839121305, "C957@39717L19,958@39759L80:NavigationDrawer.kt#uh7d8r");
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(navigationDrawerItemColors2.textColor(z3, composer2, 0).getValue().m4188unboximpl())), function28, composer2, ProvidedValue.$stable);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.startReplaceGroup(-449381075);
                ComposerKt.sourceInformation(composer2, "961@39903L29,962@39973L20,963@40016L80");
                if (function27 != null) {
                    SpacerKt.Spacer(SizeKt.m1068width3ABfNKs(Modifier.Companion, Dp.m6638constructorimpl(12)), composer2, 6);
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(navigationDrawerItemColors2.badgeColor(z3, composer2, 0).getValue().m4188unboximpl())), function27, composer2, ProvidedValue.$stable);
                }
                composer2.endReplaceGroup();
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
    }

    public static final float calculateFraction(float f2, float f3, float f4) {
        return RangesKt.coerceIn((f4 - f2) / (f3 - f2), 0.0f, 1.0f);
    }

    /* JADX INFO: renamed from: Scrim-Bx497Mc */
    public static final void m2305ScrimBx497Mc(final boolean z2, final Function0<Unit> function0, final Function0<Float> function02, final long j2, Composer composer, final int i2) {
        int i3;
        int i4;
        Modifier.Companion companionSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(2106487387);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Scrim)P(3,2,1,0:c#ui.graphics.Color)1142@46950L30,1157@47448L39,1157@47397L90:NavigationDrawer.kt#uh7d8r");
        if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i3 = (-1) - (((-1) - (composerStartRestartGroup.changed(z2) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function02) ? 256 : 128)));
        }
        if ((i2 & 3072) == 0) {
            int i6 = composerStartRestartGroup.changed(j2) ? 2048 : 1024;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2106487387, i3, -1, "androidx.compose.material3.Scrim (NavigationDrawer.kt:1141)");
            }
            Strings.Companion companion = Strings.Companion;
            final String strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(androidx.compose.ui.R.string.close_drawer), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1784743395);
            ComposerKt.sourceInformation(composerStartRestartGroup, "1145@47068L35,1146@47156L187");
            if (z2) {
                Modifier.Companion companion2 = Modifier.Companion;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1784741978, "CC(remember):NavigationDrawer.kt#9igjgp");
                int i7 = (i3 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i3);
                boolean z3 = i7 == 32;
                NavigationDrawerKt$Scrim$dismissDrawer$1$1 navigationDrawerKt$Scrim$dismissDrawer$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3 || navigationDrawerKt$Scrim$dismissDrawer$1$1RememberedValue == Composer.Companion.getEmpty()) {
                    navigationDrawerKt$Scrim$dismissDrawer$1$1RememberedValue = new NavigationDrawerKt$Scrim$dismissDrawer$1$1(function0, null);
                    composerStartRestartGroup.updateRememberedValue(navigationDrawerKt$Scrim$dismissDrawer$1$1RememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) navigationDrawerKt$Scrim$dismissDrawer$1$1RememberedValue);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1784739010, "CC(remember):NavigationDrawer.kt#9igjgp");
                boolean zChanged = (i7 == 32) | composerStartRestartGroup.changed(strM2993getString2EP1pXo);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$2$1
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
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2993getString2EP1pXo);
                            final Function0<Unit> function03 = function0;
                            SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$2$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    function03.invoke();
                                    return true;
                                }
                            }, 1, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                i4 = 1;
                companionSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (Function1) objRememberedValue);
            } else {
                i4 = 1;
                companionSemantics = Modifier.Companion;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, i4, null).then(companionSemantics);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1784729814, "CC(remember):NavigationDrawer.kt#9igjgp");
            int i8 = (i3 & 7168) == 2048 ? i4 : 0;
            if ((i3 & 896) != 256) {
                i4 = 0;
            }
            int i9 = i8 | i4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i9 != 0 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$1$1
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
                        DrawScope.m4728drawRectnJ9OG0$default(drawScope, j2, 0L, 0L, function02.invoke().floatValue(), null, null, 0, 118, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i10) {
                    boolean z4 = z2;
                    Function0<Unit> function03 = function0;
                    Function0<Float> function04 = function02;
                    long j3 = j2;
                    int i11 = i2;
                    NavigationDrawerKt.m2305ScrimBx497Mc(z4, function03, function04, j3, composer2, RecomposeScopeImplKt.updateChangedFlags((i11 + 1) - (i11 & 1)));
                }
            });
        }
    }
}
