package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.TypeScaleTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: OutlinedTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яķ\u0014D߬)\u001e\u007f\u007fLDit\fA\u001c0\u0013.H\u0001*, w\u000f߿r9FDm߉6Ri*\u0017ӆ\u00044:[,ڎK;c#\u0006\"\u000fOVg}nRҙ\u0013C%\u0006\u001ex\u0001,QU~c\u001a\u000fHBwЀ;M\u0006=Aś|6\u001b :\">y\r\u0001(0P\u0010|zKK\"\u00128ϋx:h\rUĨ\"\u0012\u001c>(ҵ&\\uZ>HraB/1\bqĩV'u0\u0005M\u0013G\\'#vi\u001e1I?5+%[\u0003\r`c?\u0019?y=\u000bi/'AI{W<_\b\u0014++W\rcs>ٱ\u0005_f$'YV\u0014O^\u0016@w)\u0005=L\u0012\u0018\u001e3X0=\u001a\u0015\u0011\u001e5\u0005r\u0002G~\r\u000fH\u0006zoB/%.@[?!f_oS\u0019|F,\u000b\u0013\u001e1\u0011\u0007!\nc>f\u001b\u001bb\ti1\u007fRm[T\ngP\u0006\u0011\u0001d\u0012*27]~]\u0010 2\u0017+L\fL)!y\u0018`Qwx\u0015`\u0017Z\u007fQvṮr\u0016=?9\u001f`Dr\u001c\u0004]dZ<\u0011{#j\u0006,\u001c˙$\\}QQ8\u0016N]\u0001\u0002w]_\u001a%]mMX\u001d\u007fް[9dHedi\u0010ok\u000f!O>r\u0005\u0007mXR:nڅ,\"8]\u001b#}{Rh$ BA\u0002\u001cb3G\u0018\u000b)Ƞ\u0007\u001eHV-\u001ceZv+\u0017aC&\u0013iR{\u001f\u007f~pʼsg~^\\\u0003f\";]i5G5\u0006(n4\u000b@\u001f~\"\u001ewmRGZ\f.u\u0004\u001cP\u001c 9_PU\u0013=!Y8\b-So\u000be\u007f\\B-\u0001|\b3Sh\\\r8pv,n\u0011bO\u0003<R~dr1/|\u0002\u0010`t#wiZ\u000bigar1\u0004lT>|\u0013J6%/\u001ch\u0002ީ1C5J.¨\u0014=\u001by]\u0018v^}p\u0017>t\u00142\\s$yz]m4K8w\b\u000f@2$\u001b\npS\u001b}\u000eB\u0017@%3vN\u0015v\\8[\u0019G}\u0015\u0016\\\u0013vViJ+o,C^e0sQ\u000f,^q7A`Yg{\u0001ci\u001bL\u001f\n9\u0003Gm@0ݞ$V]w9C\fs&LYHr\u0007L\tR;B;6\u001fͲXi\f%+\u0013L_\u001d.JO\u0004=f\u000e\u0003\u007frUv\u0019ޝI`'?1\u0012\u00153,\u0011M>\u0015oVT]jH\u007f\u00021͢\u001fjU\u0014\u001781DbR35h\u0003\u001bE\fJ_\u0001d\u0018ھ-mq\u0005<K\u001e|+\\0(IS!_%7t\n\u0004x͒hv\u0018{\u0003a()\r\u0016\u0015\u001bL\f\u001f\u000bGV\tn\u0011AٮRw=XJ\u0007\u001dD7#$|\u0012UK3\f5;ZajBE,]Y;\f'8 U$%'bW\u001c\b\"]I\\Fw\u001cb\u0010,+PN\u0013^Pzr\u0018R 6}'c\b\u0019^g\u0012\u0010!nL[t\fBY\u0010\u0011\fyk\u0012\u0017\u0006\u0011\tf?\u007f\u0012n[zM\u000f-M<>pZh=\u001a%Ǩ\u0015\u007f\"D>̀6\u0016\u0013A\u0010}j\u0019ty[s\rY<\u001c9obH].\u007f/y$\u000bXhӲ\u0019;\\bn{\u0017r\u0005Ug\u0010njVq\u0005\u000e9\u0014+\u0006^]?\u001ḙJr$y_H'2s\u001aWb\u0017\u0004sP< _f̫\u001f78  9\u0005C\u001bGrv\u0010*p\u0010\t~\u0016@\u0082JTC/Wj2!|\u00106MU8p\u000fB\u0010<%˲^8&S\r+*Ti@Q\u001b!\u0001C?\u001cn5-ǝnQY:Z\u0012\u000b\u001b%L\n3{:\">\t\"]#Θ\u001fWlPU9so?\f0tz\u0003[\u0018n\u000f\u0010ayEST\u0012aP\u0002\u001a\u001fR[\u0016w3\u007fs8v5\u0010kN\u000f\fb\u0014(:6\u001dKQ[ـ|s\u0010A\u001a)\u0002\u001esnDC\u000b\u0014GKT)[\u0001خIMn\u000f;H\u001b\u007f,7=Ao2ٽ\u0001\u0010].X\u001cW0e/\u000b\u0003l\u0017\u0002BR2\u0010[*KN\u0019B\u0006[7\u0005gx+\u0006Q\u000e5h\u0016\u001bN\u001cw_w\u0011\u0004n_0'y\u001cv:j<eA\u00110p\u00132#FB:06\u001a<\u000e/\u0002,o\u0011\u0019!g_so|BZ\ng5\u0011\nl6)u3_?\u0004'\tAGm#mx\u0014{eܝ\u0004ǹ٠Of1^\u000e5C\u0017U\"V\u001aX}6\u0012S1`\u0010r\u001et,{}H0~$\u000bGkO4\u001fkzEi\r\u0002z7\n\nA/E(\u0007R\u0004H]|\u0010T(AG8;\"a\fJ#\"2aB\n<tI\u00042\u001eM\u001eIyJOv6C=\ncl\u0005\u001bo\u001dey\u0017\fNbj\u0006ۙ#߬ԝ\u0017k\u0014umWdVd~`K\b\u001e\u000fB\u0019\u001c+~\u001a\u0005$>e\bM\u0006?\u001aJIkcNfFp7\u0003\u0016Ǫ\u0014۬d}>\rY{LSuG\u0017au\u001f=g_B\u0014\u0002`f\u0019/WTeC\b(x>c\u0012GW\rG[qK\u0003uj_?6dq>C\u0012t|cl@nBVL1he|I.tf\u0017A\tHol\u0013r:\tNJ\u0001\u0018/]{g%vOF\r\"\u0016\u0010j&o\u0006k]S$z\f\u001cOyy+z\f\u0010f\u0011}`\u0015\u00153s\u0017v\u0012\u0010\u001dM^\u0013\u001c3@\u000fr@Jb\u000b+{N *<r-\t:)kR\u007f1er|\u00111\u00062A\u0006^o!A(I@\u0016\u001beX)\u0014\u001f\\E<\nݠ7\u0012pz\fΙCѡ\u007f5_q]4}27~\u0002wN\u000fBԸ\u0006ծN+Wip\u0016u0Sz\u0015]߮YF\n\r(˘@6\u0014כ\u00062"}, d2 = {"\u001dtc9\\5>R\b~\u000em\r\u0001\t6dc1\u0005@\u000e\u0002\u0013Fn\u0012Ex", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u001dtc9\\5>R\b~\u000em\r\u0001\t6dn2\u0007+|\u0016\u0016Kx\u0010", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "5dc\u001ch;EW\"~yM,\u0010\u0018\u0010i\u007f/z/\u000b\"\u0002Cn\r@\u007f'", "u(9", "\u0018", "\u001dtc9\\5>R\b~\u000em\r\u0001\t6d", "", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "=mE._<>1\u001cz\u0004`,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "3mP/_,=", "", "@dP1B5Eg", "BdgAF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", ":`Q2_", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", ">kP0X/HZ\u0018~\b", ":dP1\\5@7\u0017\t\u0004", "BqP6_0GU||\u0005g", ">qT3\\?", "AtU3\\?", "At_=b9MW\"\u0001i^?\f", "7r4?e6K", "DhbBT3-`\u0015\b\t_6\n\u0011+t\u00042\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#n$E}\u00125<P7tB\u001f\u001fui5\u0016g6WL", "9dh/b(KR\u0003\n\nb6\u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u001e)$lkB\u00159", "9dh/b(KRt|\nb6\u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u0010\u001c$lkB\u00159", "Ah]4_,%W\"~", ";`g\u0019\\5>a", "", ";h]\u0019\\5>a", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e%Hh^$7t\u0015\fWJExBs", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W@\u007f0EhG\u000f7\u0001%\u000fQCBj%\u001a\u001cxa\u000fmi6]}+P\u0016S=d\u001csM\u001d\u0010i\u0012X4\u001bN:Q-lS;)\u0011w\u001fh7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b9l\u0010AixKBIb7:\u0001T\u0004XC91\u001eu\u0018.2N8\u0012\u0007]\u001fr\u001c\nk1V\u0019\u000eGm-mnU3~iCt|\u0006Q\u0006\u0007\u00196a>0\u00065M5:?b\u0014Oq!L(Y%5ZP+0?\th&Qm\u0005sB\u00172$r\u0010WcE:\u0017timQ\u001dP>'d3pc\u000b@\u001f[%Oy$.J\b\f`\u000b\u001dR\b4vcXG%]\u000fcQT+] \u0007\rodq\u0015\u001cGh\u0016l3)<^\u001bRiH\u0015yhG\u001fyVYN[{Yfs.?Ef0'=ZCz[\rt!\u001e}\u0002\u001b\b\u001b\u0003mL\u0003D\\\u00065FWGfj8W=:(#v? (v6\u0013Z\non\u0001%$\u0002\u0018q\u000b^>NA\u007fBESsn\u0012JQ\u000fKaV\u0019uR&7*u&KY\u00039Tw\u001cId;\u0002\u0011+00~\u0014t\\\u0002+o\u000b\u0019\u0014s\u001cBd~bV!W!n\u0012X\u001eGj/\u0018\u001fkJq \\\u0010r4>\\Xr&\"\u0015y]\u00143bD\u0002_I~+*\u0017x\u0002\u0011O\u0014)I\u001an_w\u0002tY9oQk\r~fH\u0015JJ\u0019B)c\u0010UX\u00055hTx\u0007\u000b(#z#y\u0002\u0013F=hK\u0004-\u007f+vQkl\nj:\u00160^\b)5:i.\u0016pen\u0004V\u000e\u0019tH1\u000eU\u00068\u001eTJ1x\u0002[\n(3\bUL'S+V\u0001\u0004Ez\u0013K~\u000b&Z-\bK{#BaE\u000f^40$\u0006[\u0016=g7\u001at*dJU&Tgxe\u000b]40s!\b\u001aS'+\bJF\u0015{`@\u001db \u0015\u0012%\u000e/.a<]\rju\u0013~FTpN_d\u0002WO\tx4o\u007f>nYcD$$A\u0019\u001cfM,ULY0\u0004iim`LX\u000b8*GukA\u0013-9c\"2-E|K]\u001ff\n<gG}\u0019\u0017.p\n_z(\u000e;z -\b\u00155KK\b\u000bG]l}x4I\u007f)\\x,XS\u0015tq{hH#\t\\n5\fki&)", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b\fxC; \f,VW0]g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCVAXqsS\fr,JIN+\u0014G\u007f!r_5\u000e\u0005\u001d\u0016\u0004ZChwP\u0017\n<.G{%'UxSKx1(\u0018Q^\u0018<g{/}v\tE2\u007fe\u0015Te'Bh\u0002#u=Q0$E@\u001dH\u00189\\rH\u001do#jQ\u0013s=z\u001aunaW\u0013\u0011f%%\u0016qh~FV\u0010G\u0016E{-P\u000eI_\u0003^\u000e\u0018,7fYL\u0019c\u0005$yRk@!\f\u0001u\u001c&7b\u0013@\u0015r9f;V\\\u000ey@U|iL\u0013\u007fL\u001avY<<gx\"E|\u001bRm\t2B\u0001aJs\u0019_9\u0012\u0013H\u001e\u0004r@\t:\u001d.3\u0007:Hk^>\u000fq\\nnN>&.45\u000b\u001cE\u007ffA(%\u0007\fw\u0001\u001ffL\u0002bCJGy&Fl\u0018Z1AN\u0019+Z\u001f3_\b_@e{@T|\u000eI\u0014/B\"\u001c?5?K(r+>0|\u0010\u0018\u007f\u00196\n\u000eTW$N\u001d{PD)\u0002e8Zv\u001eOg\"V\u0005(V\u0004LR~*=\u0016}\u001e\u0007<h@x_I~+*\u000b!\u0006\u001b_P\u0005E/X u\u0005k8:pU,\u0015\u0003,&\u0012W:\"B$\u0019\u0014\u001fC\u007fs\u000e^r\nJ- \fBmn\u001e@>c?,1\n;3-g\u0002s+8\u0019'/{*9zq2[\\JV[N\r\u000f8C5yY\u0006P(HX1\u000bt&/44\rJ?(\u0002@{f!R\u0001\u0014Kp\u00056Km\u0013\u000b[(GOBL]\u000e)*\u0007l\u00037l2Zy\u000f_ZU(V.[W\u000b\u0013Y*h$\u001e\\QM*\u0004TG\u0019Ga@\\[?\u0007\r\u001b\u0014-fD.W\nhkdf/\u0014qQa]v\\\u0019=r81\b?r\u0018h<5\u0016\u0005/\u0015q\u0010unep6e`_p`\u0017\u0019\u00148/JAD=R$J^&$<\u0013s\b\u001c;p\u0005-PP\u000e\u001b'Tn\u0003\u001fK$@_\t%.\b`\u00150\u001c\"P.", "\u001dtc9\\5>R\b~\u000em\r\u0001\t6df$\u0010J\u0011&", "BdgA90>Z\u0018", ":dP1\\5@", "BqP6_0GU", "/mX:T;B]\"i\bh.\n\t=s", "", "=m;.U,E;\u0019z\tn9|\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "1n]AT0GS&", "At_=b9MW\"\u0001", ">`S1\\5@D\u0015\u0006\u000b^:", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\nix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0015O{{K8oJb)~XI\u000fc:m\nn!fCHmt\u0002\"\u0019wT8\u0013H)wx\\\tnkPb\u007fI,\bnkOC~YF}5h,\f\u0001\u0010A\\~4A\u0003j:4Ek\tT1\u001dOfB\u0016<e?6*@E!\t,s~jM\u0012r(.]th?@ in-M \u000f'\u0018k>_n\u0005A[\u0014\b*\u007f\u001e%U\u0003LdFjo\r.|lMLdY\u0012\":E2h\u000f\u0012\u0007p!*wvMb\rw.i@\u001ah}I\u001f\u0012\u0006hJ\u0019y\u0012\u0015~S<\\gx\"E|\u001bR/|,L\u007fPRs\u001a\u001f\u007fVq\u0005'\u0003pF\u0003\u007f\u00186-\u0007ZHk^>\u000fq\\0bHH%\u001d<5\f[\rDE}1$\u0005\u0012qF\u001anF\u0002\u0003CJGy&FlYN\u001dj[\u000e;Q\u001f8-J|>drBTr\r\u0013M)\u0003\u001b'64u\u0011 q+8e\b\u001b\u000ey&x\"|lX&\\\\YDG\u0019\u0002d1u\f)Vh#\"g%L9[Rz\u001eFQ{^\u000e=bEy-G\u000b*0E\u001a\u0006Q.\u0011'P%i\u0016\u0007MP2rR", "1`[0h3:b\u0019azb.\u007f\u0018", ":dP1\\5@6\u0019\u0003|a;", "BqP6_0GU{~~`/\f", ">qT3\\?!S\u001d\u0001}m", "AtU3\\?!S\u001d\u0001}m", "BdgA90>Z\u0018azb.\u007f\u0018", ":`Q2_\u000f>W\u001b\u0002\n", ">kP0X/HZ\u0018~\bA,\u0001\u000b2t", "At_=b9MW\"\u0001]^0~\f>", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "2d]@\\;R", "1`[0h3:b\u0019azb.\u007f\u0018vme\u001b`>q\u0015", "uH8\u0016<\u0010\"7|__?\u0013x\u0012.r\n,zSJ\u0015!Oz\u0018Jvn6c\u000e)6i%2WL\u0005r02\u001fxp\u0003q_+Mz0I=J3lR\u0001\u0013Wu", "1`[0h3:b\u0019p~];\u007f", ":dP1\\5@> zx^(y\u0010/W\u0004'\u000bC", "BqP6_0GU\u0004\u0006v\\,x\u00066eq,zO\u0004", ">qT3\\?)Z\u0015|zZ)\u0004\t!i~7~", "AtU3\\?)Z\u0015|zZ)\u0004\t!i~7~", "BdgA90>Z\u0018i\u0002Z*|\u0005,l\u007f\u001a\u007f?\u0010\u001a", ":`Q2_\u0017EO\u0017~v[3|z3d\u000f+", ">kP0X/HZ\u0018~\bI3x\u0007/a|/{2\u0005\u0016&J", "1`[0h3:b\u0019p~];\u007fP\u000eHd\u0004M0K", "uH8\u0016<\u0010\"7yc[E(\u0006\b<o\u0004'\u000f\n~!\u001fRy\u001c<@&?i\u0007\u001f3|\u001a8V\rBgH(%w+$\u0003b+R\u007f)8HU<\\`H\u0001w", "=tc9\\5>1)\u000e\u0005n;", ":`Q2_\u001aBh\u0019", ">kP0X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "Bnc._\u000f>W\u001b\u0002\n", "EhSA[", ":dP1\\5@> zx^(y\u0010/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "BqP6_0GU\u0004\u0006v\\,x\u00066e", ">qT3\\?)Z\u0015|zZ)\u0004\t", "AtU3\\?)Z\u0015|zZ)\u0004\t", "BdgA90>Z\u0018i\u0002Z*|\u0005,l\u007f", ":`Q2_\u0017EO\u0017~v[3|", ">kP0X/HZ\u0018~\bI3x\u0007/a|/{", "1n]AT0GS&i\u0002Z*|\u0005,l\u007f", "At_=b9MW\"\u0001ee(z\t+b\u0007(", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "AtQ@g9:Q(\\\u0005g:\f\u0016+i\t7i<\u0002\u0017\u001e[", "4q^:", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class OutlinedTextFieldKt {
    private static final float OutlinedTextFieldInnerPadding = Dp.m6638constructorimpl(4);
    private static final long OutlinedTextFieldTopPadding;

    /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2 */
    /* JADX INFO: compiled from: OutlinedTextField.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$changed2;
        final /* synthetic */ int $$default;
        final /* synthetic */ TextFieldColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ KeyboardActions $keyboardActions;
        final /* synthetic */ KeyboardOptions $keyboardOptions;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        final /* synthetic */ int $maxLines;
        final /* synthetic */ int $minLines;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<String, Unit> $onValueChange;
        final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
        final /* synthetic */ boolean $readOnly;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ boolean $singleLine;
        final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
        final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
        final /* synthetic */ TextStyle $textStyle;
        final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        final /* synthetic */ String $value;
        final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(String str, Function1<? super String, Unit> function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i4, int i5, int i6, int i7) {
            super(2);
            str = str;
            function1 = function1;
            modifier = modifier;
            z = z2;
            z = z3;
            textStyle = textStyle;
            function2 = function2;
            function2 = function22;
            function2 = function23;
            function2 = function24;
            function2 = function25;
            function2 = function26;
            function2 = function27;
            z = z4;
            visualTransformation = visualTransformation;
            keyboardOptions = keyboardOptions;
            keyboardActions = keyboardActions;
            z = z5;
            i = i2;
            i = i3;
            mutableInteractionSource = mutableInteractionSource;
            shape = shape;
            textFieldColors = textFieldColors;
            i = i4;
            i = i5;
            i = i6;
            i = i7;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            OutlinedTextFieldKt.OutlinedTextField(str, function1, modifier, z, z, textStyle, function2, function2, function2, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, i, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$4 */
    /* JADX INFO: compiled from: OutlinedTextField.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$changed2;
        final /* synthetic */ int $$default;
        final /* synthetic */ TextFieldColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ KeyboardActions $keyboardActions;
        final /* synthetic */ KeyboardOptions $keyboardOptions;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        final /* synthetic */ int $maxLines;
        final /* synthetic */ int $minLines;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
        final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
        final /* synthetic */ boolean $readOnly;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ boolean $singleLine;
        final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
        final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
        final /* synthetic */ TextStyle $textStyle;
        final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i4, int i5, int i6, int i7) {
            super(2);
            function1 = function1;
            modifier = modifier;
            z = z2;
            z = z3;
            textStyle = textStyle;
            function2 = function2;
            function2 = function22;
            function2 = function23;
            function2 = function24;
            function2 = function25;
            function2 = function26;
            function2 = function27;
            z = z4;
            visualTransformation = visualTransformation;
            keyboardOptions = keyboardOptions;
            keyboardActions = keyboardActions;
            z = z5;
            i = i2;
            i = i3;
            mutableInteractionSource = mutableInteractionSource;
            shape = shape;
            textFieldColors = textFieldColors;
            i = i4;
            i = i5;
            i = i6;
            i = i7;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            OutlinedTextFieldKt.OutlinedTextField(textFieldValue, function1, modifier, z, z, textStyle, function2, function2, function2, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, i, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextFieldLayout$2 */
    /* JADX INFO: compiled from: OutlinedTextField.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06712 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ float $animationProgress;
        final /* synthetic */ Function2<Composer, Integer, Unit> $container;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Function2<Composer, Integer, Unit> $leading;
        final /* synthetic */ Function1<Size, Unit> $onLabelMeasured;
        final /* synthetic */ PaddingValues $paddingValues;
        final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> $placeholder;
        final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
        final /* synthetic */ boolean $singleLine;
        final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
        final /* synthetic */ Function2<Composer, Integer, Unit> $supporting;
        final /* synthetic */ Function2<Composer, Integer, Unit> $textField;
        final /* synthetic */ Function2<Composer, Integer, Unit> $trailing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C06712(Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, boolean z2, float f2, Function1<? super Size, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, PaddingValues paddingValues, int i2, int i3) {
            super(2);
            function2 = function2;
            function3 = function3;
            function2 = function22;
            function2 = function23;
            function2 = function24;
            function2 = function25;
            function2 = function26;
            z = z2;
            f = f2;
            function1 = function1;
            function2 = function27;
            function2 = function28;
            paddingValues = paddingValues;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            OutlinedTextFieldKt.OutlinedTextFieldLayout(modifier, function2, function3, function2, function2, function2, function2, function2, z, f, function1, function2, function2, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i));
        }
    }

    public static final int substractConstraintSafely(int i2, int i3) {
        return i2 == Integer.MAX_VALUE ? i2 : i2 - i3;
    }

    public static final void OutlinedTextField(String str, Function1<? super String, Unit> function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        TextFieldColors textFieldColorsColors = textFieldColors;
        Shape shape2 = shape;
        int i11 = i3;
        int i12 = i2;
        boolean z6 = z5;
        KeyboardActions keyboardActions2 = keyboardActions;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        VisualTransformation none = visualTransformation;
        boolean z7 = z4;
        Function2<? super Composer, ? super Integer, Unit> function28 = function27;
        Function2<? super Composer, ? super Integer, Unit> function29 = function25;
        Function2<? super Composer, ? super Integer, Unit> function210 = function23;
        Function2<? super Composer, ? super Integer, Unit> function211 = function26;
        Function2<? super Composer, ? super Integer, Unit> function212 = function24;
        Function2<? super Composer, ? super Integer, Unit> function213 = function22;
        Function2<? super Composer, ? super Integer, Unit> function214 = function2;
        TextStyle textStyle2 = textStyle;
        boolean z8 = z3;
        boolean z9 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1922450045);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedTextField)P(21,11,10,1,14,19,6,12,7,20,13,17,18,3,22,5,4,16,8,9,2,15)175@9821L7,191@10625L5,192@10688L8,204@11208L7,206@11308L2853,206@11221L2940:OutlinedTextField.kt#uh7d8r");
        if ((i7 & 1) != 0) {
            i8 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i13 = composerStartRestartGroup.changed(str) ? 4 : 2;
            i8 = (i13 + i4) - (i13 & i4);
        } else {
            i8 = i4;
        }
        if ((i7 + 2) - (i7 | 2) != 0) {
            i8 = (i8 + 48) - (i8 & 48);
        } else if ((-1) - (((-1) - i4) | ((-1) - 48)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i14 = composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            i8 = (i8 + i14) - (i8 & i14);
        }
        int i15 = (-1) - (((-1) - i7) | ((-1) - 4));
        if (i15 != 0) {
            i8 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changed(companion) ? 256 : 128)));
        }
        int i16 = i7 & 8;
        if (i16 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i4) | ((-1) - 3072)) == 0) {
            i8 |= composerStartRestartGroup.changed(z9) ? 2048 : 1024;
        }
        int i17 = (-1) - (((-1) - i7) | ((-1) - 16));
        if (i17 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 24576));
        } else if ((-1) - (((-1) - i4) | ((-1) - 24576)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i18 = composerStartRestartGroup.changed(z8) ? 16384 : 8192;
            i8 = (i8 + i18) - (i8 & i18);
        }
        if ((-1) - (((-1) - i4) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            int i19 = ((i7 & 32) == 0 && composerStartRestartGroup.changed(textStyle2)) ? 131072 : 65536;
            i8 = (i8 + i19) - (i8 & i19);
        }
        int i20 = i7 & 64;
        if (i20 != 0) {
            i8 = (i8 + 1572864) - (i8 & 1572864);
        } else if ((-1) - (((-1) - i4) | ((-1) - 1572864)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i8 |= composerStartRestartGroup.changedInstance(function214) ? 1048576 : 524288;
        }
        int i21 = (-1) - (((-1) - i7) | ((-1) - 128));
        if (i21 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 12582912));
        } else if ((i4 + 12582912) - (i4 | 12582912) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changedInstance(function213) ? 8388608 : 4194304)));
        }
        int i22 = (-1) - (((-1) - i7) | ((-1) - 256));
        if (i22 != 0) {
            i8 |= 100663296;
        } else if ((i4 & 100663296) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i8 |= composerStartRestartGroup.changedInstance(function210) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i23 = (-1) - (((-1) - i7) | ((-1) - 512));
        if (i23 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 805306368));
        } else if ((-1) - (((-1) - i4) | ((-1) - 805306368)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i8 |= composerStartRestartGroup.changedInstance(function212) ? 536870912 : 268435456;
        }
        int i24 = i7 & 1024;
        if (i24 != 0) {
            i9 = (i5 + 6) - (i5 & 6);
        } else if ((-1) - (((-1) - i5) | ((-1) - 6)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i9 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function29) ? 4 : 2)));
        } else {
            i9 = i5;
        }
        int i25 = (-1) - (((-1) - i7) | ((-1) - 2048));
        if (i25 != 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - 48));
        } else if ((i5 + 48) - (i5 | 48) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i9 = (-1) - (((-1) - i9) & ((-1) - (composerStartRestartGroup.changedInstance(function211) ? 32 : 16)));
        }
        int i26 = (-1) - (((-1) - i7) | ((-1) - 4096));
        if (i26 != 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i9 = (-1) - (((-1) - i9) & ((-1) - (composerStartRestartGroup.changedInstance(function28) ? 256 : 128)));
        }
        int i27 = i7 & 8192;
        if (i27 != 0) {
            i9 = (i9 + 3072) - (i9 & 3072);
        } else if ((i5 + 3072) - (i5 | 3072) == 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - (composerStartRestartGroup.changed(z7) ? 2048 : 1024)));
        }
        int i28 = (i7 + 16384) - (i7 | 16384);
        if (i28 != 0) {
            i9 = (i9 + 24576) - (i9 & 24576);
        } else if ((i5 & 24576) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i29 = composerStartRestartGroup.changed(none) ? 16384 : 8192;
            i9 = (i9 + i29) - (i9 & i29);
        }
        int i30 = i7 & 32768;
        if (i30 != 0) {
            i9 = (i9 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i9 = (-1) - (((-1) - i9) & ((-1) - (composerStartRestartGroup.changed(keyboardOptions2) ? 131072 : 65536)));
        }
        int i31 = (i7 + 65536) - (i7 | 65536);
        if (i31 != 0) {
            i9 = (i9 + 1572864) - (i9 & 1572864);
        } else if ((-1) - (((-1) - i5) | ((-1) - 1572864)) == 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - (composerStartRestartGroup.changed(keyboardActions2) ? 1048576 : 524288)));
        }
        int i32 = i7 & 131072;
        if (i32 != 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - 12582912));
        } else if ((-1) - (((-1) - i5) | ((-1) - 12582912)) == 0) {
            i9 |= composerStartRestartGroup.changed(z6) ? 8388608 : 4194304;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 100663296)) == 0) {
            i9 |= ((-1) - (((-1) - i7) | ((-1) - 262144)) == 0 && composerStartRestartGroup.changed(i12)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i33 = (i7 + 524288) - (i7 | 524288);
        if (i33 != 0) {
            i9 |= 805306368;
        } else if ((-1) - (((-1) - i5) | ((-1) - 805306368)) == 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - (composerStartRestartGroup.changed(i11) ? 536870912 : 268435456)));
        }
        int i34 = i7 & 1048576;
        if (i34 != 0) {
            i10 = (i6 + 6) - (i6 & 6);
        } else if ((i6 & 6) == 0) {
            i10 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2)));
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            int i35 = ((i7 & 2097152) == 0 && composerStartRestartGroup.changed(shape2)) ? 32 : 16;
            i10 = (i10 + i35) - (i10 & i35);
        }
        if ((-1) - (((-1) - i6) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i10 = (-1) - (((-1) - i10) & ((-1) - (((-1) - (((-1) - i7) | ((-1) - 4194304)) == 0 && composerStartRestartGroup.changed(textFieldColorsColors)) ? 256 : 128)));
        }
        if ((-1) - (((-1) - i8) | ((-1) - 306783379)) == 306783378 && (306783379 + i9) - (306783379 | i9) == 306783378 && (i10 + 147) - (i10 | 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i4 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i15 != 0) {
                    companion = Modifier.Companion;
                }
                if (i16 != 0) {
                    z9 = true;
                }
                if (i17 != 0) {
                    z8 = false;
                }
                if ((i7 & 32) != 0) {
                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(localTextStyle);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    textStyle2 = (TextStyle) objConsume;
                    i8 = (-1) - (((-1) - i8) | ((-1) - (-458753)));
                }
                if (i20 != 0) {
                    function214 = null;
                }
                if (i21 != 0) {
                    function213 = null;
                }
                if (i22 != 0) {
                    function210 = null;
                }
                if (i23 != 0) {
                    function212 = null;
                }
                if (i24 != 0) {
                    function29 = null;
                }
                if (i25 != 0) {
                    function211 = null;
                }
                if (i26 != 0) {
                    function28 = null;
                }
                if (i27 != 0) {
                    z7 = false;
                }
                if (i28 != 0) {
                    none = VisualTransformation.Companion.getNone();
                }
                if (i30 != 0) {
                    keyboardOptions2 = KeyboardOptions.Companion.getDefault();
                }
                if (i31 != 0) {
                    keyboardActions2 = KeyboardActions.Companion.getDefault();
                }
                if (i32 != 0) {
                    z6 = false;
                }
                if ((i7 & 262144) != 0) {
                    i12 = z6 ? 1 : Integer.MAX_VALUE;
                    i9 &= -234881025;
                }
                if (i33 != 0) {
                    i11 = 1;
                }
                mutableInteractionSource2 = i34 == 0 ? mutableInteractionSource : null;
                if ((i7 + 2097152) - (i7 | 2097152) != 0) {
                    shape2 = OutlinedTextFieldDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                }
                if ((i7 + 4194304) - (i7 | 4194304) != 0) {
                    textFieldColorsColors = OutlinedTextFieldDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i7 + 32) - (i7 | 32) != 0) {
                    i8 = (-1) - (((-1) - i8) | ((-1) - (-458753)));
                }
                if ((262144 & i7) != 0) {
                    i9 = (i9 - 234881025) - (i9 | (-234881025));
                }
                mutableInteractionSource2 = mutableInteractionSource;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1922450045, i8, i9, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:193)");
            }
            composerStartRestartGroup.startReplaceGroup(30062948);
            ComposerKt.sourceInformation(composerStartRestartGroup, "195@10782L39");
            if (mutableInteractionSource2 == null) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 30063599, "CC(remember):OutlinedTextField.kt#9igjgp");
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            } else {
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(30069058);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*199@11006L25");
            long jM6153getColor0d7_KjU = textStyle2.m6153getColor0d7_KjU();
            if (jM6153getColor0d7_KjU == 16) {
                jM6153getColor0d7_KjU = textFieldColorsColors.m2680textColorXeAY9LY$material3_release(z9, z7, FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource3, composerStartRestartGroup, 0).getValue().booleanValue());
            }
            composerStartRestartGroup.endReplaceGroup();
            TextStyle textStyleMerge = textStyle2.merge(new TextStyle(jM6153getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ProvidedValue<TextSelectionColors> providedValueProvides = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColorsColors.getTextSelectionColors());
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1886965181, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1
                final /* synthetic */ TextFieldColors $colors;
                final /* synthetic */ Density $density;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ boolean $isError;
                final /* synthetic */ KeyboardActions $keyboardActions;
                final /* synthetic */ KeyboardOptions $keyboardOptions;
                final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                final /* synthetic */ int $maxLines;
                final /* synthetic */ TextStyle $mergedTextStyle;
                final /* synthetic */ int $minLines;
                final /* synthetic */ Function1<String, Unit> $onValueChange;
                final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                final /* synthetic */ boolean $readOnly;
                final /* synthetic */ Shape $shape;
                final /* synthetic */ boolean $singleLine;
                final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                final /* synthetic */ String $value;
                final /* synthetic */ VisualTransformation $visualTransformation;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(Function2<? super Composer, ? super Integer, Unit> function2142, Density density, boolean z72, TextFieldColors textFieldColorsColors2, String str2, Function1<? super String, Unit> function12, boolean z92, boolean z82, TextStyle textStyleMerge2, KeyboardOptions keyboardOptions22, KeyboardActions keyboardActions22, boolean z62, int i122, int i112, VisualTransformation none2, MutableInteractionSource mutableInteractionSource32, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function2122, Function2<? super Composer, ? super Integer, Unit> function292, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function282, Shape shape22) {
                    super(2);
                    function2 = function2142;
                    density = density;
                    z = z72;
                    textFieldColors = textFieldColorsColors2;
                    str = str2;
                    function1 = function12;
                    z = z92;
                    z = z82;
                    textStyle = textStyleMerge2;
                    keyboardOptions = keyboardOptions22;
                    keyboardActions = keyboardActions22;
                    z = z62;
                    i = i122;
                    i = i112;
                    visualTransformation = none2;
                    mutableInteractionSource = mutableInteractionSource32;
                    function2 = function2132;
                    function2 = function2102;
                    function2 = function2122;
                    function2 = function292;
                    function2 = function2112;
                    function2 = function282;
                    shape = shape22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i36) {
                    Modifier.Companion companionM1022paddingqDBjuR0$default;
                    ComposerKt.sourceInformation(composer2, "C222@12041L38,240@12860L1285,207@11318L2837:OutlinedTextField.kt#uh7d8r");
                    if ((i36 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1886965181, i36, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:207)");
                        }
                        Modifier modifier2 = modifier;
                        if (function2 != null) {
                            companionM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(SemanticsModifierKt.semantics(Modifier.Companion, true, C00861.INSTANCE), 0.0f, density.mo705toDpGaN1DYA(OutlinedTextFieldKt.getOutlinedTextFieldTopPadding()), 0.0f, 0.0f, 13, null);
                        } else {
                            companionM1022paddingqDBjuR0$default = Modifier.Companion;
                        }
                        Modifier modifierThen = modifier2.then(companionM1022paddingqDBjuR0$default);
                        boolean z10 = z;
                        Strings.Companion companion2 = Strings.Companion;
                        BasicTextFieldKt.BasicTextField(str, function1, SizeKt.m1047defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifierThen, z10, Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), OutlinedTextFieldDefaults.INSTANCE.m2365getMinWidthD9Ej5fM(), OutlinedTextFieldDefaults.INSTANCE.m2364getMinHeightD9Ej5fM()), z, z, textStyle, keyboardOptions, keyboardActions, z, i, i, visualTransformation, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, new SolidColor(textFieldColors.m2630cursorColorvNxB06k$material3_release(z), null), ComposableLambdaKt.rememberComposableLambda(1474611661, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1.3
                            final /* synthetic */ TextFieldColors $colors;
                            final /* synthetic */ boolean $enabled;
                            final /* synthetic */ MutableInteractionSource $interactionSource;
                            final /* synthetic */ boolean $isError;
                            final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                            final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                            final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                            final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                            final /* synthetic */ Shape $shape;
                            final /* synthetic */ boolean $singleLine;
                            final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                            final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                            final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                            final /* synthetic */ String $value;
                            final /* synthetic */ VisualTransformation $visualTransformation;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass3(String str2, boolean z11, boolean z12, VisualTransformation visualTransformation2, MutableInteractionSource mutableInteractionSource4, boolean z13, Function2<? super Composer, ? super Integer, Unit> function215, Function2<? super Composer, ? super Integer, Unit> function216, Function2<? super Composer, ? super Integer, Unit> function217, Function2<? super Composer, ? super Integer, Unit> function218, Function2<? super Composer, ? super Integer, Unit> function219, Function2<? super Composer, ? super Integer, Unit> function220, Function2<? super Composer, ? super Integer, Unit> function221, TextFieldColors textFieldColors2, Shape shape3) {
                                super(3);
                                str = str2;
                                z = z11;
                                z = z12;
                                visualTransformation = visualTransformation2;
                                mutableInteractionSource = mutableInteractionSource4;
                                z = z13;
                                function2 = function215;
                                function2 = function216;
                                function2 = function217;
                                function2 = function218;
                                function2 = function219;
                                function2 = function220;
                                function2 = function221;
                                textFieldColors = textFieldColors2;
                                shape = shape3;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function215, Composer composer3, Integer num) {
                                invoke((Function2<? super Composer, ? super Integer, Unit>) function215, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function215, Composer composer3, int i37) {
                                int i38 = i37;
                                ComposerKt.sourceInformation(composer3, "C257@13714L391,241@12926L1201:OutlinedTextField.kt#uh7d8r");
                                if ((i38 + 6) - (6 | i38) == 0) {
                                    i38 = (-1) - (((-1) - i38) & ((-1) - (composer3.changedInstance(function215) ? 4 : 2)));
                                }
                                if ((i38 & 19) != 18 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1474611661, i38, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:241)");
                                    }
                                    int i39 = i38 << 3;
                                    OutlinedTextFieldDefaults.INSTANCE.DecorationBox(str, function215, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, textFieldColors, null, ComposableLambdaKt.rememberComposableLambda(2108828640, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1.3.1
                                        final /* synthetic */ TextFieldColors $colors;
                                        final /* synthetic */ boolean $enabled;
                                        final /* synthetic */ MutableInteractionSource $interactionSource;
                                        final /* synthetic */ boolean $isError;
                                        final /* synthetic */ Shape $shape;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        C00871(boolean z11, boolean z12, MutableInteractionSource mutableInteractionSource4, TextFieldColors textFieldColors2, Shape shape3) {
                                            super(2);
                                            z = z11;
                                            z = z12;
                                            mutableInteractionSource = mutableInteractionSource4;
                                            textFieldColors = textFieldColors2;
                                            shape = shape3;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i40) {
                                            ComposerKt.sourceInformation(composer4, "C258@13770L309:OutlinedTextField.kt#uh7d8r");
                                            if ((i40 + 3) - (3 | i40) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(2108828640, i40, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:258)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2359Container4EFweAY(z, z, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer4, 100663296, 200);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }, composer3, 54), composer3, (i39 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i39 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION), 14155776, 32768);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }

                            /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1$3$1 */
                            /* JADX INFO: compiled from: OutlinedTextField.kt */
                            @InterfaceC1492Gx
                            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                            static final class C00871 extends Lambda implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ TextFieldColors $colors;
                                final /* synthetic */ boolean $enabled;
                                final /* synthetic */ MutableInteractionSource $interactionSource;
                                final /* synthetic */ boolean $isError;
                                final /* synthetic */ Shape $shape;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C00871(boolean z11, boolean z12, MutableInteractionSource mutableInteractionSource4, TextFieldColors textFieldColors2, Shape shape3) {
                                    super(2);
                                    z = z11;
                                    z = z12;
                                    mutableInteractionSource = mutableInteractionSource4;
                                    textFieldColors = textFieldColors2;
                                    shape = shape3;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i40) {
                                    ComposerKt.sourceInformation(composer4, "C258@13770L309:OutlinedTextField.kt#uh7d8r");
                                    if ((i40 + 3) - (3 | i40) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2108828640, i40, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:258)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2359Container4EFweAY(z, z, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer4, 100663296, 200);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }
                        }, composer2, 54), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }

                /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1$1 */
                /* JADX INFO: compiled from: OutlinedTextField.kt */
                /* JADX INFO: loaded from: classes.dex */
                @InterfaceC1492Gx
                @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                static final class C00861 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
                    public static final C00861 INSTANCE = ;

                    C00861() {
                    }

                    /* JADX INFO: renamed from: invoke */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1$3 */
                /* JADX INFO: compiled from: OutlinedTextField.kt */
                /* JADX INFO: loaded from: classes.dex */
                @InterfaceC1492Gx
                @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bӵLc\u000b\u0004I\u0006F\u000b6B\u0005\":ߚ\u0010\u0007\u0015ii?Re`9bU:\u000f\u001azb%Ӯ(qI=\u001c#ԥ&\u000bUQuk"}, d2 = {"\n`]<a@F])\rS", "", "7m]2e\u001b>f(_~^3{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "7me<^,", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001pHJ"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                static final class AnonymousClass3 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
                    final /* synthetic */ TextFieldColors $colors;
                    final /* synthetic */ boolean $enabled;
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    final /* synthetic */ boolean $isError;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                    final /* synthetic */ Shape $shape;
                    final /* synthetic */ boolean $singleLine;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                    final /* synthetic */ String $value;
                    final /* synthetic */ VisualTransformation $visualTransformation;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass3(String str2, boolean z11, boolean z12, VisualTransformation visualTransformation2, MutableInteractionSource mutableInteractionSource4, boolean z13, Function2<? super Composer, ? super Integer, Unit> function215, Function2<? super Composer, ? super Integer, Unit> function216, Function2<? super Composer, ? super Integer, Unit> function217, Function2<? super Composer, ? super Integer, Unit> function218, Function2<? super Composer, ? super Integer, Unit> function219, Function2<? super Composer, ? super Integer, Unit> function220, Function2<? super Composer, ? super Integer, Unit> function221, TextFieldColors textFieldColors2, Shape shape3) {
                        super(3);
                        str = str2;
                        z = z11;
                        z = z12;
                        visualTransformation = visualTransformation2;
                        mutableInteractionSource = mutableInteractionSource4;
                        z = z13;
                        function2 = function215;
                        function2 = function216;
                        function2 = function217;
                        function2 = function218;
                        function2 = function219;
                        function2 = function220;
                        function2 = function221;
                        textFieldColors = textFieldColors2;
                        shape = shape3;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function215, Composer composer3, Integer num) {
                        invoke((Function2<? super Composer, ? super Integer, Unit>) function215, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> function215, Composer composer3, int i37) {
                        int i38 = i37;
                        ComposerKt.sourceInformation(composer3, "C257@13714L391,241@12926L1201:OutlinedTextField.kt#uh7d8r");
                        if ((i38 + 6) - (6 | i38) == 0) {
                            i38 = (-1) - (((-1) - i38) & ((-1) - (composer3.changedInstance(function215) ? 4 : 2)));
                        }
                        if ((i38 & 19) != 18 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1474611661, i38, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:241)");
                            }
                            int i39 = i38 << 3;
                            OutlinedTextFieldDefaults.INSTANCE.DecorationBox(str, function215, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, textFieldColors, null, ComposableLambdaKt.rememberComposableLambda(2108828640, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1.3.1
                                final /* synthetic */ TextFieldColors $colors;
                                final /* synthetic */ boolean $enabled;
                                final /* synthetic */ MutableInteractionSource $interactionSource;
                                final /* synthetic */ boolean $isError;
                                final /* synthetic */ Shape $shape;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C00871(boolean z11, boolean z12, MutableInteractionSource mutableInteractionSource4, TextFieldColors textFieldColors2, Shape shape3) {
                                    super(2);
                                    z = z11;
                                    z = z12;
                                    mutableInteractionSource = mutableInteractionSource4;
                                    textFieldColors = textFieldColors2;
                                    shape = shape3;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i40) {
                                    ComposerKt.sourceInformation(composer4, "C258@13770L309:OutlinedTextField.kt#uh7d8r");
                                    if ((i40 + 3) - (3 | i40) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2108828640, i40, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:258)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2359Container4EFweAY(z, z, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer4, 100663296, 200);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }, composer3, 54), composer3, (i39 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i39 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION), 14155776, 32768);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }

                    /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1$3$1 */
                    /* JADX INFO: compiled from: OutlinedTextField.kt */
                    @InterfaceC1492Gx
                    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                    static final class C00871 extends Lambda implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ TextFieldColors $colors;
                        final /* synthetic */ boolean $enabled;
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        final /* synthetic */ boolean $isError;
                        final /* synthetic */ Shape $shape;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00871(boolean z11, boolean z12, MutableInteractionSource mutableInteractionSource4, TextFieldColors textFieldColors2, Shape shape3) {
                            super(2);
                            z = z11;
                            z = z12;
                            mutableInteractionSource = mutableInteractionSource4;
                            textFieldColors = textFieldColors2;
                            shape = shape3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i40) {
                            ComposerKt.sourceInformation(composer4, "C258@13770L309:OutlinedTextField.kt#uh7d8r");
                            if ((i40 + 3) - (3 | i40) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2108828640, i40, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:258)");
                                }
                                OutlinedTextFieldDefaults.INSTANCE.m2359Container4EFweAY(z, z, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer4, 100663296, 200);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }
                }
            }, composerStartRestartGroup, 54);
            int i36 = ProvidedValue.$stable;
            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, composableLambdaRememberComposableLambda, composerStartRestartGroup, (i36 + 48) - (i36 & 48));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$changed1;
                final /* synthetic */ int $$changed2;
                final /* synthetic */ int $$default;
                final /* synthetic */ TextFieldColors $colors;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ boolean $isError;
                final /* synthetic */ KeyboardActions $keyboardActions;
                final /* synthetic */ KeyboardOptions $keyboardOptions;
                final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                final /* synthetic */ int $maxLines;
                final /* synthetic */ int $minLines;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function1<String, Unit> $onValueChange;
                final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                final /* synthetic */ boolean $readOnly;
                final /* synthetic */ Shape $shape;
                final /* synthetic */ boolean $singleLine;
                final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                final /* synthetic */ TextStyle $textStyle;
                final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                final /* synthetic */ String $value;
                final /* synthetic */ VisualTransformation $visualTransformation;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(String str2, Function1<? super String, Unit> function12, Modifier companion2, boolean z92, boolean z82, TextStyle textStyle22, Function2<? super Composer, ? super Integer, Unit> function2142, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function2122, Function2<? super Composer, ? super Integer, Unit> function292, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function282, boolean z72, VisualTransformation none2, KeyboardOptions keyboardOptions22, KeyboardActions keyboardActions22, boolean z62, int i122, int i112, MutableInteractionSource mutableInteractionSource22, Shape shape22, TextFieldColors textFieldColorsColors2, int i42, int i52, int i62, int i72) {
                    super(2);
                    str = str2;
                    function1 = function12;
                    modifier = companion2;
                    z = z92;
                    z = z82;
                    textStyle = textStyle22;
                    function2 = function2142;
                    function2 = function2132;
                    function2 = function2102;
                    function2 = function2122;
                    function2 = function292;
                    function2 = function2112;
                    function2 = function282;
                    z = z72;
                    visualTransformation = none2;
                    keyboardOptions = keyboardOptions22;
                    keyboardActions = keyboardActions22;
                    z = z62;
                    i = i122;
                    i = i112;
                    mutableInteractionSource = mutableInteractionSource22;
                    shape = shape22;
                    textFieldColors = textFieldColorsColors2;
                    i = i42;
                    i = i52;
                    i = i62;
                    i = i72;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i210) {
                    OutlinedTextFieldKt.OutlinedTextField(str, function1, modifier, z, z, textStyle, function2, function2, function2, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, i, mutableInteractionSource, shape, textFieldColors, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i), RecomposeScopeImplKt.updateChangedFlags(i), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1 */
    /* JADX INFO: compiled from: OutlinedTextField.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ TextFieldColors $colors;
        final /* synthetic */ Density $density;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ KeyboardActions $keyboardActions;
        final /* synthetic */ KeyboardOptions $keyboardOptions;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        final /* synthetic */ int $maxLines;
        final /* synthetic */ TextStyle $mergedTextStyle;
        final /* synthetic */ int $minLines;
        final /* synthetic */ Function1<String, Unit> $onValueChange;
        final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
        final /* synthetic */ boolean $readOnly;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ boolean $singleLine;
        final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
        final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
        final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        final /* synthetic */ String $value;
        final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super Composer, ? super Integer, Unit> function2142, Density density, boolean z72, TextFieldColors textFieldColorsColors2, String str2, Function1<? super String, Unit> function12, boolean z92, boolean z82, TextStyle textStyleMerge2, KeyboardOptions keyboardOptions22, KeyboardActions keyboardActions22, boolean z62, int i122, int i112, VisualTransformation none2, MutableInteractionSource mutableInteractionSource32, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function2122, Function2<? super Composer, ? super Integer, Unit> function292, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function282, Shape shape22) {
            super(2);
            function2 = function2142;
            density = density;
            z = z72;
            textFieldColors = textFieldColorsColors2;
            str = str2;
            function1 = function12;
            z = z92;
            z = z82;
            textStyle = textStyleMerge2;
            keyboardOptions = keyboardOptions22;
            keyboardActions = keyboardActions22;
            z = z62;
            i = i122;
            i = i112;
            visualTransformation = none2;
            mutableInteractionSource = mutableInteractionSource32;
            function2 = function2132;
            function2 = function2102;
            function2 = function2122;
            function2 = function292;
            function2 = function2112;
            function2 = function282;
            shape = shape22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer2, int i36) {
            Modifier.Companion companionM1022paddingqDBjuR0$default;
            ComposerKt.sourceInformation(composer2, "C222@12041L38,240@12860L1285,207@11318L2837:OutlinedTextField.kt#uh7d8r");
            if ((i36 & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1886965181, i36, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:207)");
                }
                Modifier modifier2 = modifier;
                if (function2 != null) {
                    companionM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(SemanticsModifierKt.semantics(Modifier.Companion, true, C00861.INSTANCE), 0.0f, density.mo705toDpGaN1DYA(OutlinedTextFieldKt.getOutlinedTextFieldTopPadding()), 0.0f, 0.0f, 13, null);
                } else {
                    companionM1022paddingqDBjuR0$default = Modifier.Companion;
                }
                Modifier modifierThen = modifier2.then(companionM1022paddingqDBjuR0$default);
                boolean z10 = z;
                Strings.Companion companion2 = Strings.Companion;
                BasicTextFieldKt.BasicTextField(str, function1, SizeKt.m1047defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifierThen, z10, Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), OutlinedTextFieldDefaults.INSTANCE.m2365getMinWidthD9Ej5fM(), OutlinedTextFieldDefaults.INSTANCE.m2364getMinHeightD9Ej5fM()), z, z, textStyle, keyboardOptions, keyboardActions, z, i, i, visualTransformation, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, new SolidColor(textFieldColors.m2630cursorColorvNxB06k$material3_release(z), null), ComposableLambdaKt.rememberComposableLambda(1474611661, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1.3
                    final /* synthetic */ TextFieldColors $colors;
                    final /* synthetic */ boolean $enabled;
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    final /* synthetic */ boolean $isError;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                    final /* synthetic */ Shape $shape;
                    final /* synthetic */ boolean $singleLine;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                    final /* synthetic */ String $value;
                    final /* synthetic */ VisualTransformation $visualTransformation;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass3(String str2, boolean z11, boolean z12, VisualTransformation visualTransformation2, MutableInteractionSource mutableInteractionSource4, boolean z13, Function2<? super Composer, ? super Integer, Unit> function215, Function2<? super Composer, ? super Integer, Unit> function216, Function2<? super Composer, ? super Integer, Unit> function217, Function2<? super Composer, ? super Integer, Unit> function218, Function2<? super Composer, ? super Integer, Unit> function219, Function2<? super Composer, ? super Integer, Unit> function220, Function2<? super Composer, ? super Integer, Unit> function221, TextFieldColors textFieldColors2, Shape shape3) {
                        super(3);
                        str = str2;
                        z = z11;
                        z = z12;
                        visualTransformation = visualTransformation2;
                        mutableInteractionSource = mutableInteractionSource4;
                        z = z13;
                        function2 = function215;
                        function2 = function216;
                        function2 = function217;
                        function2 = function218;
                        function2 = function219;
                        function2 = function220;
                        function2 = function221;
                        textFieldColors = textFieldColors2;
                        shape = shape3;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function215, Composer composer3, Integer num) {
                        invoke((Function2<? super Composer, ? super Integer, Unit>) function215, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> function215, Composer composer3, int i37) {
                        int i38 = i37;
                        ComposerKt.sourceInformation(composer3, "C257@13714L391,241@12926L1201:OutlinedTextField.kt#uh7d8r");
                        if ((i38 + 6) - (6 | i38) == 0) {
                            i38 = (-1) - (((-1) - i38) & ((-1) - (composer3.changedInstance(function215) ? 4 : 2)));
                        }
                        if ((i38 & 19) != 18 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1474611661, i38, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:241)");
                            }
                            int i39 = i38 << 3;
                            OutlinedTextFieldDefaults.INSTANCE.DecorationBox(str, function215, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, textFieldColors, null, ComposableLambdaKt.rememberComposableLambda(2108828640, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1.3.1
                                final /* synthetic */ TextFieldColors $colors;
                                final /* synthetic */ boolean $enabled;
                                final /* synthetic */ MutableInteractionSource $interactionSource;
                                final /* synthetic */ boolean $isError;
                                final /* synthetic */ Shape $shape;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C00871(boolean z11, boolean z12, MutableInteractionSource mutableInteractionSource4, TextFieldColors textFieldColors2, Shape shape3) {
                                    super(2);
                                    z = z11;
                                    z = z12;
                                    mutableInteractionSource = mutableInteractionSource4;
                                    textFieldColors = textFieldColors2;
                                    shape = shape3;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i40) {
                                    ComposerKt.sourceInformation(composer4, "C258@13770L309:OutlinedTextField.kt#uh7d8r");
                                    if ((i40 + 3) - (3 | i40) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2108828640, i40, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:258)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2359Container4EFweAY(z, z, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer4, 100663296, 200);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }, composer3, 54), composer3, (i39 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i39 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION), 14155776, 32768);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }

                    /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1$3$1 */
                    /* JADX INFO: compiled from: OutlinedTextField.kt */
                    @InterfaceC1492Gx
                    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                    static final class C00871 extends Lambda implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ TextFieldColors $colors;
                        final /* synthetic */ boolean $enabled;
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        final /* synthetic */ boolean $isError;
                        final /* synthetic */ Shape $shape;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00871(boolean z11, boolean z12, MutableInteractionSource mutableInteractionSource4, TextFieldColors textFieldColors2, Shape shape3) {
                            super(2);
                            z = z11;
                            z = z12;
                            mutableInteractionSource = mutableInteractionSource4;
                            textFieldColors = textFieldColors2;
                            shape = shape3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i40) {
                            ComposerKt.sourceInformation(composer4, "C258@13770L309:OutlinedTextField.kt#uh7d8r");
                            if ((i40 + 3) - (3 | i40) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2108828640, i40, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:258)");
                                }
                                OutlinedTextFieldDefaults.INSTANCE.m2359Container4EFweAY(z, z, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer4, 100663296, 200);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }
                }, composer2, 54), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }

        /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1$1 */
        /*  JADX ERROR: Failed to generate init code
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  A[DECLARE_VAR, DONT_GENERATE, MD:():void (m), REMOVE, WRAPPED] call: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1.1.<init>():void type: CONSTRUCTOR in method: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1.1.<clinit>():void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:549)
            	at jadx.core.codegen.ClassGen.addField(ClassGen.java:455)
            	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:422)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:287)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:88)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
            Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1.1
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:813)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:286)
            	... 72 more
            */
        /* JADX INFO: compiled from: OutlinedTextField.kt */
        /* JADX INFO: loaded from: classes.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class C00861 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
            public static final C00861 INSTANCE = new C00861();

            C00861() {
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1$3 */
        /* JADX INFO: compiled from: OutlinedTextField.kt */
        /* JADX INFO: loaded from: classes.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bӵLc\u000b\u0004I\u0006F\u000b6B\u0005\":ߚ\u0010\u0007\u0015ii?Re`9bU:\u000f\u001azb%Ӯ(qI=\u001c#ԥ&\u000bUQuk"}, d2 = {"\n`]<a@F])\rS", "", "7m]2e\u001b>f(_~^3{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "7me<^,", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001pHJ"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass3 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
            final /* synthetic */ TextFieldColors $colors;
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ MutableInteractionSource $interactionSource;
            final /* synthetic */ boolean $isError;
            final /* synthetic */ Function2<Composer, Integer, Unit> $label;
            final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
            final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
            final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
            final /* synthetic */ Shape $shape;
            final /* synthetic */ boolean $singleLine;
            final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
            final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
            final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
            final /* synthetic */ String $value;
            final /* synthetic */ VisualTransformation $visualTransformation;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(String str2, boolean z11, boolean z12, VisualTransformation visualTransformation2, MutableInteractionSource mutableInteractionSource4, boolean z13, Function2<? super Composer, ? super Integer, Unit> function215, Function2<? super Composer, ? super Integer, Unit> function216, Function2<? super Composer, ? super Integer, Unit> function217, Function2<? super Composer, ? super Integer, Unit> function218, Function2<? super Composer, ? super Integer, Unit> function219, Function2<? super Composer, ? super Integer, Unit> function220, Function2<? super Composer, ? super Integer, Unit> function221, TextFieldColors textFieldColors2, Shape shape3) {
                super(3);
                str = str2;
                z = z11;
                z = z12;
                visualTransformation = visualTransformation2;
                mutableInteractionSource = mutableInteractionSource4;
                z = z13;
                function2 = function215;
                function2 = function216;
                function2 = function217;
                function2 = function218;
                function2 = function219;
                function2 = function220;
                function2 = function221;
                textFieldColors = textFieldColors2;
                shape = shape3;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function215, Composer composer3, Integer num) {
                invoke((Function2<? super Composer, ? super Integer, Unit>) function215, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function215, Composer composer3, int i37) {
                int i38 = i37;
                ComposerKt.sourceInformation(composer3, "C257@13714L391,241@12926L1201:OutlinedTextField.kt#uh7d8r");
                if ((i38 + 6) - (6 | i38) == 0) {
                    i38 = (-1) - (((-1) - i38) & ((-1) - (composer3.changedInstance(function215) ? 4 : 2)));
                }
                if ((i38 & 19) != 18 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1474611661, i38, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:241)");
                    }
                    int i39 = i38 << 3;
                    OutlinedTextFieldDefaults.INSTANCE.DecorationBox(str, function215, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, textFieldColors, null, ComposableLambdaKt.rememberComposableLambda(2108828640, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1.3.1
                        final /* synthetic */ TextFieldColors $colors;
                        final /* synthetic */ boolean $enabled;
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        final /* synthetic */ boolean $isError;
                        final /* synthetic */ Shape $shape;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00871(boolean z11, boolean z12, MutableInteractionSource mutableInteractionSource4, TextFieldColors textFieldColors2, Shape shape3) {
                            super(2);
                            z = z11;
                            z = z12;
                            mutableInteractionSource = mutableInteractionSource4;
                            textFieldColors = textFieldColors2;
                            shape = shape3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i40) {
                            ComposerKt.sourceInformation(composer4, "C258@13770L309:OutlinedTextField.kt#uh7d8r");
                            if ((i40 + 3) - (3 | i40) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2108828640, i40, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:258)");
                                }
                                OutlinedTextFieldDefaults.INSTANCE.m2359Container4EFweAY(z, z, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer4, 100663296, 200);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }, composer3, 54), composer3, (i39 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i39 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION), 14155776, 32768);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }

            /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1$3$1 */
            /* JADX INFO: compiled from: OutlinedTextField.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            static final class C00871 extends Lambda implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ TextFieldColors $colors;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ boolean $isError;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00871(boolean z11, boolean z12, MutableInteractionSource mutableInteractionSource4, TextFieldColors textFieldColors2, Shape shape3) {
                    super(2);
                    z = z11;
                    z = z12;
                    mutableInteractionSource = mutableInteractionSource4;
                    textFieldColors = textFieldColors2;
                    shape = shape3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer4, int i40) {
                    ComposerKt.sourceInformation(composer4, "C258@13770L309:OutlinedTextField.kt#uh7d8r");
                    if ((i40 + 3) - (3 | i40) != 2 || !composer4.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2108828640, i40, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:258)");
                        }
                        OutlinedTextFieldDefaults.INSTANCE.m2359Container4EFweAY(z, z, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer4, 100663296, 200);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer4.skipToGroupEnd();
                }
            }
        }
    }

    public static final void OutlinedTextField(TextFieldValue textFieldValue, Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        TextFieldColors textFieldColorsColors = textFieldColors;
        Shape shape2 = shape;
        int i11 = i3;
        int i12 = i2;
        boolean z6 = z5;
        KeyboardActions keyboardActions2 = keyboardActions;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        VisualTransformation none = visualTransformation;
        boolean z7 = z4;
        Function2<? super Composer, ? super Integer, Unit> function28 = function27;
        Function2<? super Composer, ? super Integer, Unit> function29 = function25;
        Function2<? super Composer, ? super Integer, Unit> function210 = function24;
        Function2<? super Composer, ? super Integer, Unit> function211 = function23;
        Function2<? super Composer, ? super Integer, Unit> function212 = function2;
        Function2<? super Composer, ? super Integer, Unit> function213 = function26;
        Function2<? super Composer, ? super Integer, Unit> function214 = function22;
        TextStyle textStyle2 = textStyle;
        boolean z8 = z3;
        boolean z9 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1570442800);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedTextField)P(21,11,10,1,14,19,6,12,7,20,13,17,18,3,22,5,4,16,8,9,2,15)350@19364L7,366@20168L5,367@20231L8,379@20751L7,381@20851L2858,381@20764L2945:OutlinedTextField.kt#uh7d8r");
        if ((-1) - (((-1) - i7) | ((-1) - 1)) != 0) {
            i8 = (-1) - (((-1) - i4) & ((-1) - 6));
        } else if ((i4 & 6) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i13 = composerStartRestartGroup.changed(textFieldValue) ? 4 : 2;
            i8 = (i13 + i4) - (i13 & i4);
        } else {
            i8 = i4;
        }
        if ((i7 + 2) - (i7 | 2) != 0) {
            i8 |= 48;
        } else if ((i4 + 48) - (i4 | 48) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i14 = composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            i8 = (i8 + i14) - (i8 & i14);
        }
        int i15 = (i7 + 4) - (i7 | 4);
        if (i15 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i4) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i16 = composerStartRestartGroup.changed(companion) ? 256 : 128;
            i8 = (i8 + i16) - (i8 & i16);
        }
        int i17 = i7 & 8;
        if (i17 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 3072));
        } else if ((i4 & 3072) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changed(z9) ? 2048 : 1024)));
        }
        int i18 = (i7 + 16) - (i7 | 16);
        if (i18 != 0) {
            i8 = (i8 + 24576) - (i8 & 24576);
        } else if ((-1) - (((-1) - i4) | ((-1) - 24576)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i8 |= composerStartRestartGroup.changed(z8) ? 16384 : 8192;
        }
        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i8 |= ((-1) - (((-1) - i7) | ((-1) - 32)) == 0 && composerStartRestartGroup.changed(textStyle2)) ? 131072 : 65536;
        }
        int i19 = (-1) - (((-1) - i7) | ((-1) - 64));
        if (i19 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 1572864));
        } else if ((i4 + 1572864) - (i4 | 1572864) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changedInstance(function212) ? 1048576 : 524288)));
        }
        int i20 = (-1) - (((-1) - i7) | ((-1) - 128));
        if (i20 != 0) {
            i8 |= 12582912;
        } else if ((-1) - (((-1) - i4) | ((-1) - 12582912)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i21 = composerStartRestartGroup.changedInstance(function214) ? 8388608 : 4194304;
            i8 = (i8 + i21) - (i8 & i21);
        }
        int i22 = (-1) - (((-1) - i7) | ((-1) - 256));
        if (i22 != 0) {
            i8 = (i8 + 100663296) - (i8 & 100663296);
        } else if ((i4 + 100663296) - (i4 | 100663296) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i8 |= composerStartRestartGroup.changedInstance(function211) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i23 = i7 & 512;
        if (i23 != 0) {
            i8 = (i8 + 805306368) - (i8 & 805306368);
        } else if ((i4 & 805306368) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changedInstance(function210) ? 536870912 : 268435456)));
        }
        int i24 = (i7 + 1024) - (i7 | 1024);
        if (i24 != 0) {
            i9 = (i5 + 6) - (i5 & 6);
        } else if ((i5 & 6) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i9 = i5 | (composerStartRestartGroup.changedInstance(function29) ? 4 : 2);
        } else {
            i9 = i5;
        }
        int i25 = (-1) - (((-1) - i7) | ((-1) - 2048));
        if (i25 != 0) {
            i9 = (i9 + 48) - (i9 & 48);
        } else if ((-1) - (((-1) - i5) | ((-1) - 48)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i26 = composerStartRestartGroup.changedInstance(function213) ? 32 : 16;
            i9 = (i9 + i26) - (i9 & i26);
        }
        int i27 = (i7 + 4096) - (i7 | 4096);
        if (i27 != 0) {
            i9 = (i9 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i9 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i5) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i9 = (-1) - (((-1) - i9) & ((-1) - (composerStartRestartGroup.changedInstance(function28) ? 256 : 128)));
        }
        int i28 = (-1) - (((-1) - i7) | ((-1) - 8192));
        if (i28 != 0) {
            i9 = (i9 + 3072) - (i9 & 3072);
        } else if ((i5 & 3072) == 0) {
            i9 |= composerStartRestartGroup.changed(z7) ? 2048 : 1024;
        }
        int i29 = (i7 + 16384) - (i7 | 16384);
        if (i29 != 0) {
            i9 = (i9 + 24576) - (i9 & 24576);
        } else if ((-1) - (((-1) - i5) | ((-1) - 24576)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i30 = composerStartRestartGroup.changed(none) ? 16384 : 8192;
            i9 = (i9 + i30) - (i9 & i30);
        }
        int i31 = (i7 + 32768) - (i7 | 32768);
        if (i31 != 0) {
            i9 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i32 = composerStartRestartGroup.changed(keyboardOptions2) ? 131072 : 65536;
            i9 = (i9 + i32) - (i9 & i32);
        }
        int i33 = (-1) - (((-1) - i7) | ((-1) - 65536));
        if (i33 != 0) {
            i9 = (i9 + 1572864) - (i9 & 1572864);
        } else if ((-1) - (((-1) - i5) | ((-1) - 1572864)) == 0) {
            int i34 = composerStartRestartGroup.changed(keyboardActions2) ? 1048576 : 524288;
            i9 = (i9 + i34) - (i9 & i34);
        }
        int i35 = (i7 + 131072) - (i7 | 131072);
        if (i35 != 0) {
            i9 = (i9 + 12582912) - (i9 & 12582912);
        } else if ((i5 & 12582912) == 0) {
            int i36 = composerStartRestartGroup.changed(z6) ? 8388608 : 4194304;
            i9 = (i9 + i36) - (i9 & i36);
        }
        if ((-1) - (((-1) - i5) | ((-1) - 100663296)) == 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - (((-1) - (((-1) - i7) | ((-1) - 262144)) == 0 && composerStartRestartGroup.changed(i12)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        int i37 = (i7 + 524288) - (i7 | 524288);
        if (i37 != 0) {
            i9 |= 805306368;
        } else if ((i5 & 805306368) == 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - (composerStartRestartGroup.changed(i11) ? 536870912 : 268435456)));
        }
        int i38 = i7 & 1048576;
        if (i38 != 0) {
            i10 = (-1) - (((-1) - i6) & ((-1) - 6));
        } else if ((i6 + 6) - (i6 | 6) == 0) {
            i10 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2)));
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            int i39 = ((i7 & 2097152) == 0 && composerStartRestartGroup.changed(shape2)) ? 32 : 16;
            i10 = (i10 + i39) - (i10 & i39);
        }
        if ((-1) - (((-1) - i6) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i40 = ((-1) - (((-1) - i7) | ((-1) - 4194304)) == 0 && composerStartRestartGroup.changed(textFieldColorsColors)) ? 256 : 128;
            i10 = (i10 + i40) - (i10 & i40);
        }
        if ((i8 & 306783379) == 306783378 && (306783379 & i9) == 306783378 && (-1) - (((-1) - i10) | ((-1) - 147)) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i4) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i15 != 0) {
                    companion = Modifier.Companion;
                }
                if (i17 != 0) {
                    z9 = true;
                }
                if (i18 != 0) {
                    z8 = false;
                }
                if ((i7 + 32) - (i7 | 32) != 0) {
                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(localTextStyle);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    textStyle2 = (TextStyle) objConsume;
                    i8 = (-1) - (((-1) - i8) | ((-1) - (-458753)));
                }
                if (i19 != 0) {
                    function212 = null;
                }
                if (i20 != 0) {
                    function214 = null;
                }
                if (i22 != 0) {
                    function211 = null;
                }
                if (i23 != 0) {
                    function210 = null;
                }
                if (i24 != 0) {
                    function29 = null;
                }
                if (i25 != 0) {
                    function213 = null;
                }
                if (i27 != 0) {
                    function28 = null;
                }
                if (i28 != 0) {
                    z7 = false;
                }
                if (i29 != 0) {
                    none = VisualTransformation.Companion.getNone();
                }
                if (i31 != 0) {
                    keyboardOptions2 = KeyboardOptions.Companion.getDefault();
                }
                if (i33 != 0) {
                    keyboardActions2 = KeyboardActions.Companion.getDefault();
                }
                if (i35 != 0) {
                    z6 = false;
                }
                if ((i7 & 262144) != 0) {
                    i12 = z6 ? 1 : Integer.MAX_VALUE;
                    i9 &= -234881025;
                }
                if (i37 != 0) {
                    i11 = 1;
                }
                mutableInteractionSource2 = i38 == 0 ? mutableInteractionSource : null;
                if ((i7 & 2097152) != 0) {
                    shape2 = OutlinedTextFieldDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                }
                if ((i7 + 4194304) - (i7 | 4194304) != 0) {
                    textFieldColorsColors = OutlinedTextFieldDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i7 & 32) != 0) {
                    i8 &= -458753;
                }
                if ((-1) - (((-1) - 262144) | ((-1) - i7)) != 0) {
                    i9 = (-1) - (((-1) - i9) | ((-1) - (-234881025)));
                }
                mutableInteractionSource2 = mutableInteractionSource;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1570442800, i8, i9, "androidx.compose.material3.OutlinedTextField (OutlinedTextField.kt:368)");
            }
            composerStartRestartGroup.startReplaceGroup(30368324);
            ComposerKt.sourceInformation(composerStartRestartGroup, "370@20325L39");
            if (mutableInteractionSource2 == null) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 30368975, "CC(remember):OutlinedTextField.kt#9igjgp");
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            } else {
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(30374434);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*374@20549L25");
            long jM6153getColor0d7_KjU = textStyle2.m6153getColor0d7_KjU();
            if (jM6153getColor0d7_KjU == 16) {
                jM6153getColor0d7_KjU = textFieldColorsColors.m2680textColorXeAY9LY$material3_release(z9, z7, FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource3, composerStartRestartGroup, 0).getValue().booleanValue());
            }
            composerStartRestartGroup.endReplaceGroup();
            TextStyle textStyleMerge = textStyle2.merge(new TextStyle(jM6153getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColorsColors.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(1830921872, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3
                final /* synthetic */ TextFieldColors $colors;
                final /* synthetic */ Density $density;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ boolean $isError;
                final /* synthetic */ KeyboardActions $keyboardActions;
                final /* synthetic */ KeyboardOptions $keyboardOptions;
                final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                final /* synthetic */ int $maxLines;
                final /* synthetic */ TextStyle $mergedTextStyle;
                final /* synthetic */ int $minLines;
                final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
                final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                final /* synthetic */ boolean $readOnly;
                final /* synthetic */ Shape $shape;
                final /* synthetic */ boolean $singleLine;
                final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                final /* synthetic */ TextFieldValue $value;
                final /* synthetic */ VisualTransformation $visualTransformation;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(Function2<? super Composer, ? super Integer, Unit> function2122, Density density, boolean z72, TextFieldColors textFieldColorsColors2, TextFieldValue textFieldValue2, Function1<? super TextFieldValue, Unit> function12, boolean z92, boolean z82, TextStyle textStyleMerge2, KeyboardOptions keyboardOptions22, KeyboardActions keyboardActions22, boolean z62, int i122, int i112, VisualTransformation none2, MutableInteractionSource mutableInteractionSource32, Function2<? super Composer, ? super Integer, Unit> function2142, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function292, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function282, Shape shape22) {
                    super(2);
                    function2 = function2122;
                    density = density;
                    z = z72;
                    textFieldColors = textFieldColorsColors2;
                    textFieldValue = textFieldValue2;
                    function1 = function12;
                    z = z92;
                    z = z82;
                    textStyle = textStyleMerge2;
                    keyboardOptions = keyboardOptions22;
                    keyboardActions = keyboardActions22;
                    z = z62;
                    i = i122;
                    i = i112;
                    visualTransformation = none2;
                    mutableInteractionSource = mutableInteractionSource32;
                    function2 = function2142;
                    function2 = function2112;
                    function2 = function2102;
                    function2 = function292;
                    function2 = function2132;
                    function2 = function282;
                    shape = shape22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i41) {
                    Modifier.Companion companionM1022paddingqDBjuR0$default;
                    ComposerKt.sourceInformation(composer2, "C397@21584L38,415@22403L1290,382@20861L2842:OutlinedTextField.kt#uh7d8r");
                    if ((-1) - (((-1) - i41) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1830921872, i41, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:382)");
                        }
                        Modifier modifier2 = modifier;
                        if (function2 != null) {
                            companionM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(SemanticsModifierKt.semantics(Modifier.Companion, true, AnonymousClass1.INSTANCE), 0.0f, density.mo705toDpGaN1DYA(OutlinedTextFieldKt.getOutlinedTextFieldTopPadding()), 0.0f, 0.0f, 13, null);
                        } else {
                            companionM1022paddingqDBjuR0$default = Modifier.Companion;
                        }
                        Modifier modifierThen = modifier2.then(companionM1022paddingqDBjuR0$default);
                        boolean z10 = z;
                        Strings.Companion companion2 = Strings.Companion;
                        BasicTextFieldKt.BasicTextField(textFieldValue, function1, SizeKt.m1047defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifierThen, z10, Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), OutlinedTextFieldDefaults.INSTANCE.m2365getMinWidthD9Ej5fM(), OutlinedTextFieldDefaults.INSTANCE.m2364getMinHeightD9Ej5fM()), z, z, textStyle, keyboardOptions, keyboardActions, z, i, i, visualTransformation, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, new SolidColor(textFieldColors.m2630cursorColorvNxB06k$material3_release(z), null), ComposableLambdaKt.rememberComposableLambda(-757328870, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3.3
                            final /* synthetic */ TextFieldColors $colors;
                            final /* synthetic */ boolean $enabled;
                            final /* synthetic */ MutableInteractionSource $interactionSource;
                            final /* synthetic */ boolean $isError;
                            final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                            final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                            final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                            final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                            final /* synthetic */ Shape $shape;
                            final /* synthetic */ boolean $singleLine;
                            final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                            final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                            final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                            final /* synthetic */ VisualTransformation $visualTransformation;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            C00883(boolean z11, boolean z12, VisualTransformation visualTransformation2, MutableInteractionSource mutableInteractionSource4, boolean z13, Function2<? super Composer, ? super Integer, Unit> function215, Function2<? super Composer, ? super Integer, Unit> function216, Function2<? super Composer, ? super Integer, Unit> function217, Function2<? super Composer, ? super Integer, Unit> function218, Function2<? super Composer, ? super Integer, Unit> function219, Function2<? super Composer, ? super Integer, Unit> function220, Function2<? super Composer, ? super Integer, Unit> function221, TextFieldColors textFieldColors2, Shape shape3) {
                                super(3);
                                z = z11;
                                z = z12;
                                visualTransformation = visualTransformation2;
                                mutableInteractionSource = mutableInteractionSource4;
                                z = z13;
                                function2 = function215;
                                function2 = function216;
                                function2 = function217;
                                function2 = function218;
                                function2 = function219;
                                function2 = function220;
                                function2 = function221;
                                textFieldColors = textFieldColors2;
                                shape = shape3;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function215, Composer composer3, Integer num) {
                                invoke((Function2<? super Composer, ? super Integer, Unit>) function215, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function215, Composer composer3, int i42) {
                                int i43 = i42;
                                ComposerKt.sourceInformation(composer3, "C432@23262L391,416@22469L1206:OutlinedTextField.kt#uh7d8r");
                                if ((-1) - (((-1) - i43) | ((-1) - 6)) == 0) {
                                    i43 = (-1) - (((-1) - i43) & ((-1) - (composer3.changedInstance(function215) ? 4 : 2)));
                                }
                                if ((i43 + 19) - (19 | i43) != 18 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-757328870, i43, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:416)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.DecorationBox(textFieldValue.getText(), function215, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, textFieldColors, null, ComposableLambdaKt.rememberComposableLambda(255570733, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3.3.1
                                        final /* synthetic */ TextFieldColors $colors;
                                        final /* synthetic */ boolean $enabled;
                                        final /* synthetic */ MutableInteractionSource $interactionSource;
                                        final /* synthetic */ boolean $isError;
                                        final /* synthetic */ Shape $shape;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        AnonymousClass1(boolean z11, boolean z12, MutableInteractionSource mutableInteractionSource4, TextFieldColors textFieldColors2, Shape shape3) {
                                            super(2);
                                            z = z11;
                                            z = z12;
                                            mutableInteractionSource = mutableInteractionSource4;
                                            textFieldColors = textFieldColors2;
                                            shape = shape3;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i44) {
                                            ComposerKt.sourceInformation(composer4, "C433@23318L309:OutlinedTextField.kt#uh7d8r");
                                            if ((i44 + 3) - (3 | i44) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(255570733, i44, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:433)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2359Container4EFweAY(z, z, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer4, 100663296, 200);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }, composer3, 54), composer3, (i43 << 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, 14155776, 32768);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }

                            /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3$3$1 */
                            /* JADX INFO: compiled from: OutlinedTextField.kt */
                            @InterfaceC1492Gx
                            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                            static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ TextFieldColors $colors;
                                final /* synthetic */ boolean $enabled;
                                final /* synthetic */ MutableInteractionSource $interactionSource;
                                final /* synthetic */ boolean $isError;
                                final /* synthetic */ Shape $shape;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(boolean z11, boolean z12, MutableInteractionSource mutableInteractionSource4, TextFieldColors textFieldColors2, Shape shape3) {
                                    super(2);
                                    z = z11;
                                    z = z12;
                                    mutableInteractionSource = mutableInteractionSource4;
                                    textFieldColors = textFieldColors2;
                                    shape = shape3;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i44) {
                                    ComposerKt.sourceInformation(composer4, "C433@23318L309:OutlinedTextField.kt#uh7d8r");
                                    if ((i44 + 3) - (3 | i44) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(255570733, i44, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:433)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2359Container4EFweAY(z, z, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer4, 100663296, 200);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }
                        }, composer2, 54), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }

                /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3$1 */
                /* JADX INFO: compiled from: OutlinedTextField.kt */
                @InterfaceC1492Gx
                @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                static final class AnonymousClass1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
                    public static final AnonymousClass1 INSTANCE = ;

                    AnonymousClass1() {
                    }

                    /* JADX INFO: renamed from: invoke */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3$3 */
                /* JADX INFO: compiled from: OutlinedTextField.kt */
                @InterfaceC1492Gx
                @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bӵLc\u000b\u0004I\u0006F\u000b6B\u0005\":ߚ\u0010\u0007\u0015ii?Re`9bU:\u000f\u001azb%Ӯ(qI=\u001c#ԥ&\u000bUQuk"}, d2 = {"\n`]<a@F])\rS", "", "7m]2e\u001b>f(_~^3{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "7me<^,", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001pHJ"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                static final class C00883 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
                    final /* synthetic */ TextFieldColors $colors;
                    final /* synthetic */ boolean $enabled;
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    final /* synthetic */ boolean $isError;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                    final /* synthetic */ Shape $shape;
                    final /* synthetic */ boolean $singleLine;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                    final /* synthetic */ VisualTransformation $visualTransformation;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C00883(boolean z11, boolean z12, VisualTransformation visualTransformation2, MutableInteractionSource mutableInteractionSource4, boolean z13, Function2<? super Composer, ? super Integer, Unit> function215, Function2<? super Composer, ? super Integer, Unit> function216, Function2<? super Composer, ? super Integer, Unit> function217, Function2<? super Composer, ? super Integer, Unit> function218, Function2<? super Composer, ? super Integer, Unit> function219, Function2<? super Composer, ? super Integer, Unit> function220, Function2<? super Composer, ? super Integer, Unit> function221, TextFieldColors textFieldColors2, Shape shape3) {
                        super(3);
                        z = z11;
                        z = z12;
                        visualTransformation = visualTransformation2;
                        mutableInteractionSource = mutableInteractionSource4;
                        z = z13;
                        function2 = function215;
                        function2 = function216;
                        function2 = function217;
                        function2 = function218;
                        function2 = function219;
                        function2 = function220;
                        function2 = function221;
                        textFieldColors = textFieldColors2;
                        shape = shape3;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function215, Composer composer3, Integer num) {
                        invoke((Function2<? super Composer, ? super Integer, Unit>) function215, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> function215, Composer composer3, int i42) {
                        int i43 = i42;
                        ComposerKt.sourceInformation(composer3, "C432@23262L391,416@22469L1206:OutlinedTextField.kt#uh7d8r");
                        if ((-1) - (((-1) - i43) | ((-1) - 6)) == 0) {
                            i43 = (-1) - (((-1) - i43) & ((-1) - (composer3.changedInstance(function215) ? 4 : 2)));
                        }
                        if ((i43 + 19) - (19 | i43) != 18 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-757328870, i43, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:416)");
                            }
                            OutlinedTextFieldDefaults.INSTANCE.DecorationBox(textFieldValue.getText(), function215, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, textFieldColors, null, ComposableLambdaKt.rememberComposableLambda(255570733, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3.3.1
                                final /* synthetic */ TextFieldColors $colors;
                                final /* synthetic */ boolean $enabled;
                                final /* synthetic */ MutableInteractionSource $interactionSource;
                                final /* synthetic */ boolean $isError;
                                final /* synthetic */ Shape $shape;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(boolean z11, boolean z12, MutableInteractionSource mutableInteractionSource4, TextFieldColors textFieldColors2, Shape shape3) {
                                    super(2);
                                    z = z11;
                                    z = z12;
                                    mutableInteractionSource = mutableInteractionSource4;
                                    textFieldColors = textFieldColors2;
                                    shape = shape3;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i44) {
                                    ComposerKt.sourceInformation(composer4, "C433@23318L309:OutlinedTextField.kt#uh7d8r");
                                    if ((i44 + 3) - (3 | i44) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(255570733, i44, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:433)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2359Container4EFweAY(z, z, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer4, 100663296, 200);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }, composer3, 54), composer3, (i43 << 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, 14155776, 32768);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }

                    /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3$3$1 */
                    /* JADX INFO: compiled from: OutlinedTextField.kt */
                    @InterfaceC1492Gx
                    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                    static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ TextFieldColors $colors;
                        final /* synthetic */ boolean $enabled;
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        final /* synthetic */ boolean $isError;
                        final /* synthetic */ Shape $shape;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(boolean z11, boolean z12, MutableInteractionSource mutableInteractionSource4, TextFieldColors textFieldColors2, Shape shape3) {
                            super(2);
                            z = z11;
                            z = z12;
                            mutableInteractionSource = mutableInteractionSource4;
                            textFieldColors = textFieldColors2;
                            shape = shape3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i44) {
                            ComposerKt.sourceInformation(composer4, "C433@23318L309:OutlinedTextField.kt#uh7d8r");
                            if ((i44 + 3) - (3 | i44) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(255570733, i44, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:433)");
                                }
                                OutlinedTextFieldDefaults.INSTANCE.m2359Container4EFweAY(z, z, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer4, 100663296, 200);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - ProvidedValue.$stable) & ((-1) - 48)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.4
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$changed1;
                final /* synthetic */ int $$changed2;
                final /* synthetic */ int $$default;
                final /* synthetic */ TextFieldColors $colors;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ boolean $isError;
                final /* synthetic */ KeyboardActions $keyboardActions;
                final /* synthetic */ KeyboardOptions $keyboardOptions;
                final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                final /* synthetic */ int $maxLines;
                final /* synthetic */ int $minLines;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
                final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                final /* synthetic */ boolean $readOnly;
                final /* synthetic */ Shape $shape;
                final /* synthetic */ boolean $singleLine;
                final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                final /* synthetic */ TextStyle $textStyle;
                final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                final /* synthetic */ VisualTransformation $visualTransformation;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass4(Function1<? super TextFieldValue, Unit> function12, Modifier companion2, boolean z92, boolean z82, TextStyle textStyle22, Function2<? super Composer, ? super Integer, Unit> function2122, Function2<? super Composer, ? super Integer, Unit> function2142, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function292, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function282, boolean z72, VisualTransformation none2, KeyboardOptions keyboardOptions22, KeyboardActions keyboardActions22, boolean z62, int i122, int i112, MutableInteractionSource mutableInteractionSource22, Shape shape22, TextFieldColors textFieldColorsColors2, int i42, int i52, int i62, int i72) {
                    super(2);
                    function1 = function12;
                    modifier = companion2;
                    z = z92;
                    z = z82;
                    textStyle = textStyle22;
                    function2 = function2122;
                    function2 = function2142;
                    function2 = function2112;
                    function2 = function2102;
                    function2 = function292;
                    function2 = function2132;
                    function2 = function282;
                    z = z72;
                    visualTransformation = none2;
                    keyboardOptions = keyboardOptions22;
                    keyboardActions = keyboardActions22;
                    z = z62;
                    i = i122;
                    i = i112;
                    mutableInteractionSource = mutableInteractionSource22;
                    shape = shape22;
                    textFieldColors = textFieldColorsColors2;
                    i = i42;
                    i = i52;
                    i = i62;
                    i = i72;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i210) {
                    OutlinedTextFieldKt.OutlinedTextField(textFieldValue, function1, modifier, z, z, textStyle, function2, function2, function2, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, i, mutableInteractionSource, shape, textFieldColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), RecomposeScopeImplKt.updateChangedFlags(i), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3 */
    /* JADX INFO: compiled from: OutlinedTextField.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ TextFieldColors $colors;
        final /* synthetic */ Density $density;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ KeyboardActions $keyboardActions;
        final /* synthetic */ KeyboardOptions $keyboardOptions;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
        final /* synthetic */ int $maxLines;
        final /* synthetic */ TextStyle $mergedTextStyle;
        final /* synthetic */ int $minLines;
        final /* synthetic */ Function1<TextFieldValue, Unit> $onValueChange;
        final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
        final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
        final /* synthetic */ boolean $readOnly;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ boolean $singleLine;
        final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
        final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
        final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
        final /* synthetic */ TextFieldValue $value;
        final /* synthetic */ VisualTransformation $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Function2<? super Composer, ? super Integer, Unit> function2122, Density density, boolean z72, TextFieldColors textFieldColorsColors2, TextFieldValue textFieldValue2, Function1<? super TextFieldValue, Unit> function12, boolean z92, boolean z82, TextStyle textStyleMerge2, KeyboardOptions keyboardOptions22, KeyboardActions keyboardActions22, boolean z62, int i122, int i112, VisualTransformation none2, MutableInteractionSource mutableInteractionSource32, Function2<? super Composer, ? super Integer, Unit> function2142, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function292, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function282, Shape shape22) {
            super(2);
            function2 = function2122;
            density = density;
            z = z72;
            textFieldColors = textFieldColorsColors2;
            textFieldValue = textFieldValue2;
            function1 = function12;
            z = z92;
            z = z82;
            textStyle = textStyleMerge2;
            keyboardOptions = keyboardOptions22;
            keyboardActions = keyboardActions22;
            z = z62;
            i = i122;
            i = i112;
            visualTransformation = none2;
            mutableInteractionSource = mutableInteractionSource32;
            function2 = function2142;
            function2 = function2112;
            function2 = function2102;
            function2 = function292;
            function2 = function2132;
            function2 = function282;
            shape = shape22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer2, int i41) {
            Modifier.Companion companionM1022paddingqDBjuR0$default;
            ComposerKt.sourceInformation(composer2, "C397@21584L38,415@22403L1290,382@20861L2842:OutlinedTextField.kt#uh7d8r");
            if ((-1) - (((-1) - i41) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1830921872, i41, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:382)");
                }
                Modifier modifier2 = modifier;
                if (function2 != null) {
                    companionM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(SemanticsModifierKt.semantics(Modifier.Companion, true, AnonymousClass1.INSTANCE), 0.0f, density.mo705toDpGaN1DYA(OutlinedTextFieldKt.getOutlinedTextFieldTopPadding()), 0.0f, 0.0f, 13, null);
                } else {
                    companionM1022paddingqDBjuR0$default = Modifier.Companion;
                }
                Modifier modifierThen = modifier2.then(companionM1022paddingqDBjuR0$default);
                boolean z10 = z;
                Strings.Companion companion2 = Strings.Companion;
                BasicTextFieldKt.BasicTextField(textFieldValue, function1, SizeKt.m1047defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifierThen, z10, Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), OutlinedTextFieldDefaults.INSTANCE.m2365getMinWidthD9Ej5fM(), OutlinedTextFieldDefaults.INSTANCE.m2364getMinHeightD9Ej5fM()), z, z, textStyle, keyboardOptions, keyboardActions, z, i, i, visualTransformation, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, new SolidColor(textFieldColors.m2630cursorColorvNxB06k$material3_release(z), null), ComposableLambdaKt.rememberComposableLambda(-757328870, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3.3
                    final /* synthetic */ TextFieldColors $colors;
                    final /* synthetic */ boolean $enabled;
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    final /* synthetic */ boolean $isError;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                    final /* synthetic */ Shape $shape;
                    final /* synthetic */ boolean $singleLine;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
                    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
                    final /* synthetic */ VisualTransformation $visualTransformation;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C00883(boolean z11, boolean z12, VisualTransformation visualTransformation2, MutableInteractionSource mutableInteractionSource4, boolean z13, Function2<? super Composer, ? super Integer, Unit> function215, Function2<? super Composer, ? super Integer, Unit> function216, Function2<? super Composer, ? super Integer, Unit> function217, Function2<? super Composer, ? super Integer, Unit> function218, Function2<? super Composer, ? super Integer, Unit> function219, Function2<? super Composer, ? super Integer, Unit> function220, Function2<? super Composer, ? super Integer, Unit> function221, TextFieldColors textFieldColors2, Shape shape3) {
                        super(3);
                        z = z11;
                        z = z12;
                        visualTransformation = visualTransformation2;
                        mutableInteractionSource = mutableInteractionSource4;
                        z = z13;
                        function2 = function215;
                        function2 = function216;
                        function2 = function217;
                        function2 = function218;
                        function2 = function219;
                        function2 = function220;
                        function2 = function221;
                        textFieldColors = textFieldColors2;
                        shape = shape3;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function215, Composer composer3, Integer num) {
                        invoke((Function2<? super Composer, ? super Integer, Unit>) function215, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> function215, Composer composer3, int i42) {
                        int i43 = i42;
                        ComposerKt.sourceInformation(composer3, "C432@23262L391,416@22469L1206:OutlinedTextField.kt#uh7d8r");
                        if ((-1) - (((-1) - i43) | ((-1) - 6)) == 0) {
                            i43 = (-1) - (((-1) - i43) & ((-1) - (composer3.changedInstance(function215) ? 4 : 2)));
                        }
                        if ((i43 + 19) - (19 | i43) != 18 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-757328870, i43, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:416)");
                            }
                            OutlinedTextFieldDefaults.INSTANCE.DecorationBox(textFieldValue.getText(), function215, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, textFieldColors, null, ComposableLambdaKt.rememberComposableLambda(255570733, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3.3.1
                                final /* synthetic */ TextFieldColors $colors;
                                final /* synthetic */ boolean $enabled;
                                final /* synthetic */ MutableInteractionSource $interactionSource;
                                final /* synthetic */ boolean $isError;
                                final /* synthetic */ Shape $shape;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(boolean z11, boolean z12, MutableInteractionSource mutableInteractionSource4, TextFieldColors textFieldColors2, Shape shape3) {
                                    super(2);
                                    z = z11;
                                    z = z12;
                                    mutableInteractionSource = mutableInteractionSource4;
                                    textFieldColors = textFieldColors2;
                                    shape = shape3;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i44) {
                                    ComposerKt.sourceInformation(composer4, "C433@23318L309:OutlinedTextField.kt#uh7d8r");
                                    if ((i44 + 3) - (3 | i44) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(255570733, i44, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:433)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2359Container4EFweAY(z, z, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer4, 100663296, 200);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }, composer3, 54), composer3, (i43 << 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, 14155776, 32768);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }

                    /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3$3$1 */
                    /* JADX INFO: compiled from: OutlinedTextField.kt */
                    @InterfaceC1492Gx
                    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                    static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ TextFieldColors $colors;
                        final /* synthetic */ boolean $enabled;
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        final /* synthetic */ boolean $isError;
                        final /* synthetic */ Shape $shape;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(boolean z11, boolean z12, MutableInteractionSource mutableInteractionSource4, TextFieldColors textFieldColors2, Shape shape3) {
                            super(2);
                            z = z11;
                            z = z12;
                            mutableInteractionSource = mutableInteractionSource4;
                            textFieldColors = textFieldColors2;
                            shape = shape3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i44) {
                            ComposerKt.sourceInformation(composer4, "C433@23318L309:OutlinedTextField.kt#uh7d8r");
                            if ((i44 + 3) - (3 | i44) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(255570733, i44, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:433)");
                                }
                                OutlinedTextFieldDefaults.INSTANCE.m2359Container4EFweAY(z, z, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer4, 100663296, 200);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }
                }, composer2, 54), composer2, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 4096);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }

        /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3$1 */
        /*  JADX ERROR: Failed to generate init code
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  A[DECLARE_VAR, DONT_GENERATE, MD:():void (m), REMOVE, WRAPPED] call: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3.1.<init>():void type: CONSTRUCTOR in method: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3.1.<clinit>():void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:549)
            	at jadx.core.codegen.ClassGen.addField(ClassGen.java:455)
            	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:422)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:287)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
            	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:88)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
            Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3.1
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:813)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:286)
            	... 78 more
            */
        /* JADX INFO: compiled from: OutlinedTextField.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3$3 */
        /* JADX INFO: compiled from: OutlinedTextField.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bӵLc\u000b\u0004I\u0006F\u000b6B\u0005\":ߚ\u0010\u0007\u0015ii?Re`9bU:\u000f\u001azb%Ӯ(qI=\u001c#ԥ&\u000bUQuk"}, d2 = {"\n`]<a@F])\rS", "", "7m]2e\u001b>f(_~^3{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "7me<^,", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001pHJ"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class C00883 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
            final /* synthetic */ TextFieldColors $colors;
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ MutableInteractionSource $interactionSource;
            final /* synthetic */ boolean $isError;
            final /* synthetic */ Function2<Composer, Integer, Unit> $label;
            final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
            final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
            final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
            final /* synthetic */ Shape $shape;
            final /* synthetic */ boolean $singleLine;
            final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
            final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
            final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
            final /* synthetic */ VisualTransformation $visualTransformation;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00883(boolean z11, boolean z12, VisualTransformation visualTransformation2, MutableInteractionSource mutableInteractionSource4, boolean z13, Function2<? super Composer, ? super Integer, Unit> function215, Function2<? super Composer, ? super Integer, Unit> function216, Function2<? super Composer, ? super Integer, Unit> function217, Function2<? super Composer, ? super Integer, Unit> function218, Function2<? super Composer, ? super Integer, Unit> function219, Function2<? super Composer, ? super Integer, Unit> function220, Function2<? super Composer, ? super Integer, Unit> function221, TextFieldColors textFieldColors2, Shape shape3) {
                super(3);
                z = z11;
                z = z12;
                visualTransformation = visualTransformation2;
                mutableInteractionSource = mutableInteractionSource4;
                z = z13;
                function2 = function215;
                function2 = function216;
                function2 = function217;
                function2 = function218;
                function2 = function219;
                function2 = function220;
                function2 = function221;
                textFieldColors = textFieldColors2;
                shape = shape3;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function215, Composer composer3, Integer num) {
                invoke((Function2<? super Composer, ? super Integer, Unit>) function215, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function215, Composer composer3, int i42) {
                int i43 = i42;
                ComposerKt.sourceInformation(composer3, "C432@23262L391,416@22469L1206:OutlinedTextField.kt#uh7d8r");
                if ((-1) - (((-1) - i43) | ((-1) - 6)) == 0) {
                    i43 = (-1) - (((-1) - i43) & ((-1) - (composer3.changedInstance(function215) ? 4 : 2)));
                }
                if ((i43 + 19) - (19 | i43) != 18 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-757328870, i43, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:416)");
                    }
                    OutlinedTextFieldDefaults.INSTANCE.DecorationBox(textFieldValue.getText(), function215, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, textFieldColors, null, ComposableLambdaKt.rememberComposableLambda(255570733, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3.3.1
                        final /* synthetic */ TextFieldColors $colors;
                        final /* synthetic */ boolean $enabled;
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        final /* synthetic */ boolean $isError;
                        final /* synthetic */ Shape $shape;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(boolean z11, boolean z12, MutableInteractionSource mutableInteractionSource4, TextFieldColors textFieldColors2, Shape shape3) {
                            super(2);
                            z = z11;
                            z = z12;
                            mutableInteractionSource = mutableInteractionSource4;
                            textFieldColors = textFieldColors2;
                            shape = shape3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i44) {
                            ComposerKt.sourceInformation(composer4, "C433@23318L309:OutlinedTextField.kt#uh7d8r");
                            if ((i44 + 3) - (3 | i44) != 2 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(255570733, i44, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:433)");
                                }
                                OutlinedTextFieldDefaults.INSTANCE.m2359Container4EFweAY(z, z, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer4, 100663296, 200);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }, composer3, 54), composer3, (i43 << 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, 14155776, 32768);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }

            /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3$3$1 */
            /* JADX INFO: compiled from: OutlinedTextField.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ TextFieldColors $colors;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ boolean $isError;
                final /* synthetic */ Shape $shape;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(boolean z11, boolean z12, MutableInteractionSource mutableInteractionSource4, TextFieldColors textFieldColors2, Shape shape3) {
                    super(2);
                    z = z11;
                    z = z12;
                    mutableInteractionSource = mutableInteractionSource4;
                    textFieldColors = textFieldColors2;
                    shape = shape3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer4, int i44) {
                    ComposerKt.sourceInformation(composer4, "C433@23318L309:OutlinedTextField.kt#uh7d8r");
                    if ((i44 + 3) - (3 | i44) != 2 || !composer4.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(255570733, i44, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:433)");
                        }
                        OutlinedTextFieldDefaults.INSTANCE.m2359Container4EFweAY(z, z, mutableInteractionSource, null, textFieldColors, shape, 0.0f, 0.0f, composer4, 100663296, 200);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer4.skipToGroupEnd();
                }
            }
        }
    }

    public static final void OutlinedTextFieldLayout(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, boolean z2, float f2, Function1<? super Size, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, PaddingValues paddingValues, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1408290209);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OutlinedTextFieldLayout)P(4,12,7,2,3,13,8,10,9!1,5!1,11)470@24558L267,478@24873L7,479@24885L3739:OutlinedTextField.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(modifier) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            i4 = (i4 + i7) - (i4 & i7);
        }
        Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function32 = function3;
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function32) ? 256 : 128;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i9 = composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((i2 & 24576) == 0) {
            int i10 = composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
            i4 = (i4 + i10) - (i4 & i10);
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            int i11 = composerStartRestartGroup.changedInstance(function24) ? 131072 : 65536;
            i4 = (i4 + i11) - (i4 & i11);
        }
        if ((-1) - (((-1) - 1572864) | ((-1) - i2)) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function25) ? 1048576 : 524288;
        }
        if ((-1) - (((-1) - 12582912) | ((-1) - i2)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function26) ? 8388608 : 4194304)));
        }
        if ((-1) - (((-1) - 100663296) | ((-1) - i2)) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((-1) - (((-1) - 805306368) | ((-1) - i2)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(f2) ? 536870912 : 268435456)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
            int i12 = composerStartRestartGroup.changedInstance(function27) ? 32 : 16;
            i5 = (i5 + i12) - (i5 & i12);
        }
        if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function28) ? 256 : 128)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            i5 |= composerStartRestartGroup.changed(paddingValues) ? 2048 : 1024;
        }
        if ((i4 + 306783379) - (306783379 | i4) != 306783378 || (i5 + 1171) - (1171 | i5) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1408290209, i4, i5, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:468)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 602705309, "CC(remember):OutlinedTextField.kt#9igjgp");
            int i13 = (-1) - (((-1) - ((-1) - (((-1) - ((i5 + 14) - (14 | i5) == 4 ? 1 : 0)) & ((-1) - ((-1) - (((-1) - 234881024) | ((-1) - i4)) == 67108864 ? 1 : 0))))) & ((-1) - ((-1) - (((-1) - 1879048192) | ((-1) - i4)) == 536870912 ? 1 : 0)));
            int i14 = (i5 + 7168) - (7168 | i5) == 2048 ? 1 : 0;
            int i15 = (i13 + i14) - (i13 & i14);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i15 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new OutlinedTextFieldMeasurePolicy(function1, z2, f2, paddingValues);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) objConsume;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m3678setimpl(composerM3671constructorimpl, outlinedTextFieldMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -828374317, "C482@24954L11,550@27430L186:OutlinedTextField.kt#uh7d8r");
            function27.invoke(composerStartRestartGroup, Integer.valueOf((-1) - (((-1) - (i5 >> 3)) | ((-1) - 14))));
            composerStartRestartGroup.startReplaceGroup(250370369);
            ComposerKt.sourceInformation(composerStartRestartGroup, "485@25018L219");
            if (function23 != null) {
                Modifier modifierThen = LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.LeadingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.Companion.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -367907446, "C489@25210L9:OutlinedTextField.kt#uh7d8r");
                function23.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 12) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(250379492);
            ComposerKt.sourceInformation(composerStartRestartGroup, "493@25304L221");
            if (function24 != null) {
                Modifier modifierThen2 = LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.TrailingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.Companion.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen2);
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -367622711, "C497@25497L10:OutlinedTextField.kt#uh7d8r");
                function24.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 15) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceGroup();
            float fCalculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float fCalculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            if (function23 != null) {
                i6 = 0;
                fCalculateStartPadding = Dp.m6638constructorimpl(RangesKt.coerceAtLeast(Dp.m6638constructorimpl(fCalculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m6638constructorimpl(0)));
            } else {
                i6 = 0;
            }
            if (function24 != null) {
                fCalculateEndPadding = Dp.m6638constructorimpl(RangesKt.coerceAtLeast(Dp.m6638constructorimpl(fCalculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m6638constructorimpl(i6)));
            }
            composerStartRestartGroup.startReplaceGroup(250410106);
            ComposerKt.sourceInformation(composerStartRestartGroup, "518@26256L309");
            if (function25 != null) {
                Modifier modifierM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m1051heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.PrefixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), fCalculateStartPadding, 0.0f, TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, 10, null);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1022paddingqDBjuR0$default);
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -366589109, "C524@26539L8:OutlinedTextField.kt#uh7d8r");
                function25.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 18) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(250422072);
            ComposerKt.sourceInformation(composerStartRestartGroup, "528@26630L307");
            if (function26 != null) {
                Modifier modifierM1022paddingqDBjuR0$default2 = PaddingKt.m1022paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m1051heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.SuffixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, fCalculateEndPadding, 0.0f, 10, null);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1022paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3671constructorimpl5 = Updater.m3671constructorimpl(composerStartRestartGroup);
                Updater.m3678setimpl(composerM3671constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM3671constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM3671constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m3678setimpl(composerM3671constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -366220085, "C534@26911L8:OutlinedTextField.kt#uh7d8r");
                function26.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 21) & 14));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m1051heightInVpY3zN4$default(Modifier.Companion, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null);
            if (function25 != null) {
                fCalculateStartPadding = Dp.m6638constructorimpl(0);
            }
            if (function26 != null) {
                fCalculateEndPadding = Dp.m6638constructorimpl(0);
            }
            Modifier modifierM1022paddingqDBjuR0$default3 = PaddingKt.m1022paddingqDBjuR0$default(modifierWrapContentHeight$default, fCalculateStartPadding, 0.0f, fCalculateEndPadding, 0.0f, 10, null);
            composerStartRestartGroup.startReplaceGroup(250444361);
            ComposerKt.sourceInformation(composerStartRestartGroup, "547@27339L63");
            if (function32 != null) {
                function32 = function32;
                function32.invoke(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.PlaceholderId).then(modifierM1022paddingqDBjuR0$default3), composerStartRestartGroup, Integer.valueOf((-1) - (((-1) - (i4 >> 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))));
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen3 = LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.TextFieldId).then(modifierM1022paddingqDBjuR0$default3);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen3);
            Function0<ComposeUiNode> constructor6 = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor6);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl6 = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy5, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                composerM3671constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                composerM3671constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            Updater.m3678setimpl(composerM3671constructorimpl6, modifierMaterializeModifier6, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -365545432, "C554@27591L11:OutlinedTextField.kt#uh7d8r");
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 3) & 14));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.startReplaceGroup(250455481);
            ComposerKt.sourceInformation(composerStartRestartGroup, "558@27667L501");
            if (function22 != null) {
                Modifier modifierLayoutId = LayoutIdKt.layoutId(SizeKt.wrapContentHeight$default(SizeKt.m1051heightInVpY3zN4$default(Modifier.Companion, DpKt.m6681lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), f2), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.LabelId);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
                Function0<ComposeUiNode> constructor7 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor7);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3671constructorimpl7 = Updater.m3671constructorimpl(composerStartRestartGroup);
                Updater.m3678setimpl(composerM3671constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy6, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    composerM3671constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                    composerM3671constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                }
                Updater.m3678setimpl(composerM3671constructorimpl7, modifierMaterializeModifier7, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -364997972, "C570@28143L7:OutlinedTextField.kt#uh7d8r");
                function22.invoke(composerStartRestartGroup, Integer.valueOf((-1) - (((-1) - (i4 >> 9)) | ((-1) - 14))));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(250473414);
            ComposerKt.sourceInformation(composerStartRestartGroup, "575@28238L317");
            if (function28 != null) {
                Modifier modifierPadding = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.m1051heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.SupportingId), TextFieldImplKt.getMinSupportingTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldDefaults.m2688supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
                Function0<ComposeUiNode> constructor8 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor8);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3671constructorimpl8 = Updater.m3671constructorimpl(composerStartRestartGroup);
                Updater.m3678setimpl(composerM3671constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy7, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3678setimpl(composerM3671constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3671constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    composerM3671constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                    composerM3671constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                }
                Updater.m3678setimpl(composerM3671constructorimpl8, modifierMaterializeModifier8, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -364618873, "C581@28525L12:OutlinedTextField.kt#uh7d8r");
                int i16 = i5 >> 6;
                function28.invoke(composerStartRestartGroup, Integer.valueOf((i16 + 14) - (i16 | 14)));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextFieldLayout.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$changed1;
                final /* synthetic */ float $animationProgress;
                final /* synthetic */ Function2<Composer, Integer, Unit> $container;
                final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                final /* synthetic */ Function2<Composer, Integer, Unit> $leading;
                final /* synthetic */ Function1<Size, Unit> $onLabelMeasured;
                final /* synthetic */ PaddingValues $paddingValues;
                final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> $placeholder;
                final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
                final /* synthetic */ boolean $singleLine;
                final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
                final /* synthetic */ Function2<Composer, Integer, Unit> $supporting;
                final /* synthetic */ Function2<Composer, Integer, Unit> $textField;
                final /* synthetic */ Function2<Composer, Integer, Unit> $trailing;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C06712(Function2<? super Composer, ? super Integer, Unit> function29, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function322, Function2<? super Composer, ? super Integer, Unit> function222, Function2<? super Composer, ? super Integer, Unit> function232, Function2<? super Composer, ? super Integer, Unit> function242, Function2<? super Composer, ? super Integer, Unit> function252, Function2<? super Composer, ? super Integer, Unit> function262, boolean z22, float f22, Function1<? super Size, Unit> function12, Function2<? super Composer, ? super Integer, Unit> function272, Function2<? super Composer, ? super Integer, Unit> function282, PaddingValues paddingValues2, int i22, int i32) {
                    super(2);
                    function2 = function29;
                    function3 = function322;
                    function2 = function222;
                    function2 = function232;
                    function2 = function242;
                    function2 = function252;
                    function2 = function262;
                    z = z22;
                    f = f22;
                    function1 = function12;
                    function2 = function272;
                    function2 = function282;
                    paddingValues = paddingValues2;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    OutlinedTextFieldKt.OutlinedTextFieldLayout(modifier, function2, function3, function2, function2, function2, function2, function2, z, f, function1, function2, function2, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i));
                }
            });
        }
    }

    /* JADX INFO: renamed from: calculateWidth-DHJA7U0 */
    public static final int m2370calculateWidthDHJA7U0(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f2, long j2, float f3, PaddingValues paddingValues) {
        int i9 = i4 + i5;
        return Math.max(i2 + Math.max(i6 + i9, Math.max(i8 + i9, MathHelpersKt.lerp(i7, 0, f2))) + i3, Math.max(MathKt.roundToInt((i7 + (Dp.m6638constructorimpl(paddingValues.mo969calculateLeftPaddingu2uoSUM(LayoutDirection.Ltr) + paddingValues.mo970calculateRightPaddingu2uoSUM(LayoutDirection.Ltr)) * f3)) * f2), Constraints.m6593getMinWidthimpl(j2)));
    }

    /* JADX INFO: renamed from: calculateHeight-mKXJcVc */
    public static final int m2369calculateHeightmKXJcVc(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f2, long j2, float f3, PaddingValues paddingValues) {
        int iMaxOf = ComparisonsKt.maxOf(i6, i8, i4, i5, MathHelpersKt.lerp(i7, 0, f2));
        float fMo971calculateTopPaddingD9Ej5fM = paddingValues.mo971calculateTopPaddingD9Ej5fM() * f3;
        return Math.max(Constraints.m6592getMinHeightimpl(j2), Math.max(i2, Math.max(i3, MathKt.roundToInt(MathHelpersKt.lerp(fMo971calculateTopPaddingD9Ej5fM, Math.max(fMo971calculateTopPaddingD9Ej5fM, i7 / 2.0f), f2) + iMaxOf + (paddingValues.mo968calculateBottomPaddingD9Ej5fM() * f3)))) + i9);
    }

    public static final void place(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, float f2, boolean z2, float f3, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        Placeable.PlacementScope.m5578place70tqf50$default(placementScope, placeable8, IntOffset.Companion.m6776getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i2 - TextFieldImplKt.heightOrZero(placeable9);
        int iRoundToInt = MathKt.roundToInt(paddingValues.mo971calculateTopPaddingD9Ej5fM() * f3);
        int iRoundToInt2 = MathKt.roundToInt(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f3);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f3;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(placeable.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, MathKt.roundToInt(placeable == null ? 0.0f : (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding) * (1 - f2)) + iRoundToInt2, MathHelpersKt.lerp(z2 ? Alignment.Companion.getCenterVertically().align(placeable6.getHeight(), iHeightOrZero) : iRoundToInt, -(placeable6.getHeight() / 2), f2), 0.0f, 4, null);
        }
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), place$calculateVerticalPosition(z2, iHeightOrZero, iRoundToInt, placeable6, placeable3), 0.0f, 4, null);
        }
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeable) + TextFieldImplKt.widthOrZero(placeable3);
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.placeRelative$default(placementScope2, placeable5, iWidthOrZero, place$calculateVerticalPosition(z2, iHeightOrZero, iRoundToInt, placeable6, placeable5), 0.0f, 4, null);
        if (placeable7 != null) {
            placementScope2 = placementScope2;
            Placeable.PlacementScope.placeRelative$default(placementScope2, placeable7, iWidthOrZero, place$calculateVerticalPosition(z2, iHeightOrZero, iRoundToInt, placeable6, placeable7), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            placementScope2 = placementScope2;
            Placeable.PlacementScope.placeRelative$default(placementScope2, placeable4, (i3 - TextFieldImplKt.widthOrZero(placeable2)) - placeable4.getWidth(), place$calculateVerticalPosition(z2, iHeightOrZero, iRoundToInt, placeable6, placeable4), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope2, placeable2, i3 - placeable2.getWidth(), Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope2, placeable9, 0, iHeightOrZero, 0.0f, 4, null);
        }
    }

    private static final int place$calculateVerticalPosition(boolean z2, int i2, int i3, Placeable placeable, Placeable placeable2) {
        if (z2) {
            i3 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i2);
        }
        return Math.max(i3, TextFieldImplKt.heightOrZero(placeable) / 2);
    }

    /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$outlineCutout$1 */
    /* JADX INFO: compiled from: OutlinedTextField.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06721 extends Lambda implements Function1<ContentDrawScope, Unit> {
        final /* synthetic */ Function0<Size> $labelSize;
        final /* synthetic */ PaddingValues $paddingValues;

        /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$outlineCutout$1$WhenMappings */
        /* JADX INFO: compiled from: OutlinedTextField.kt */
        /* JADX INFO: loaded from: classes.dex */
        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LayoutDirection.values().length];
                try {
                    iArr[LayoutDirection.Rtl.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06721(Function0<Size> function0, PaddingValues paddingValues) {
            super(1);
            function0 = function0;
            paddingValues = paddingValues;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
            invoke2(contentDrawScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(ContentDrawScope contentDrawScope) {
            float fCoerceAtLeast;
            long jM4011unboximpl = function0.invoke().m4011unboximpl();
            float fM4006getWidthimpl = Size.m4006getWidthimpl(jM4011unboximpl);
            if (fM4006getWidthimpl > 0.0f) {
                float f2 = contentDrawScope.mo710toPx0680j_4(OutlinedTextFieldKt.OutlinedTextFieldInnerPadding);
                float f3 = contentDrawScope.mo710toPx0680j_4(paddingValues.mo969calculateLeftPaddingu2uoSUM(contentDrawScope.getLayoutDirection())) - f2;
                float f4 = 2;
                float fM4006getWidthimpl2 = fM4006getWidthimpl + f3 + (f2 * f4);
                if (WhenMappings.$EnumSwitchMapping$0[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                    fCoerceAtLeast = Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc()) - fM4006getWidthimpl2;
                } else {
                    fCoerceAtLeast = RangesKt.coerceAtLeast(f3, 0.0f);
                }
                if (WhenMappings.$EnumSwitchMapping$0[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                    fM4006getWidthimpl2 = Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc()) - RangesKt.coerceAtLeast(f3, 0.0f);
                }
                float fM4003getHeightimpl = Size.m4003getHeightimpl(jM4011unboximpl);
                float f5 = (-fM4003getHeightimpl) / f4;
                float f6 = fM4003getHeightimpl / f4;
                int iM4166getDifferencertfAjoo = ClipOp.Companion.m4166getDifferencertfAjoo();
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo4658clipRectN_I0leg(fCoerceAtLeast, f5, fM4006getWidthimpl2, f6, iM4166getDifferencertfAjoo);
                    contentDrawScope.drawContent();
                    return;
                } finally {
                    drawContext.getCanvas().restore();
                    drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
                }
            }
            contentDrawScope.drawContent();
        }
    }

    public static final Modifier outlineCutout(Modifier modifier, Function0<Size> function0, PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.outlineCutout.1
            final /* synthetic */ Function0<Size> $labelSize;
            final /* synthetic */ PaddingValues $paddingValues;

            /* JADX INFO: renamed from: androidx.compose.material3.OutlinedTextFieldKt$outlineCutout$1$WhenMappings */
            /* JADX INFO: compiled from: OutlinedTextField.kt */
            /* JADX INFO: loaded from: classes.dex */
            @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.Rtl.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06721(Function0<Size> function02, PaddingValues paddingValues2) {
                super(1);
                function0 = function02;
                paddingValues = paddingValues2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                float fCoerceAtLeast;
                long jM4011unboximpl = function0.invoke().m4011unboximpl();
                float fM4006getWidthimpl = Size.m4006getWidthimpl(jM4011unboximpl);
                if (fM4006getWidthimpl > 0.0f) {
                    float f2 = contentDrawScope.mo710toPx0680j_4(OutlinedTextFieldKt.OutlinedTextFieldInnerPadding);
                    float f3 = contentDrawScope.mo710toPx0680j_4(paddingValues.mo969calculateLeftPaddingu2uoSUM(contentDrawScope.getLayoutDirection())) - f2;
                    float f4 = 2;
                    float fM4006getWidthimpl2 = fM4006getWidthimpl + f3 + (f2 * f4);
                    if (WhenMappings.$EnumSwitchMapping$0[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                        fCoerceAtLeast = Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc()) - fM4006getWidthimpl2;
                    } else {
                        fCoerceAtLeast = RangesKt.coerceAtLeast(f3, 0.0f);
                    }
                    if (WhenMappings.$EnumSwitchMapping$0[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                        fM4006getWidthimpl2 = Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc()) - RangesKt.coerceAtLeast(f3, 0.0f);
                    }
                    float fM4003getHeightimpl = Size.m4003getHeightimpl(jM4011unboximpl);
                    float f5 = (-fM4003getHeightimpl) / f4;
                    float f6 = fM4003getHeightimpl / f4;
                    int iM4166getDifferencertfAjoo = ClipOp.Companion.m4166getDifferencertfAjoo();
                    DrawContext drawContext = contentDrawScope.getDrawContext();
                    long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    try {
                        drawContext.getTransform().mo4658clipRectN_I0leg(fCoerceAtLeast, f5, fM4006getWidthimpl2, f6, iM4166getDifferencertfAjoo);
                        contentDrawScope.drawContent();
                        return;
                    } finally {
                        drawContext.getCanvas().restore();
                        drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
                    }
                }
                contentDrawScope.drawContent();
            }
        });
    }

    public static final long getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }

    static {
        long jM3595getBodySmallLineHeightXSAIIZE = TypeScaleTokens.INSTANCE.m3595getBodySmallLineHeightXSAIIZE();
        TextUnitKt.m6844checkArithmeticR2X_6o(jM3595getBodySmallLineHeightXSAIIZE);
        OutlinedTextFieldTopPadding = TextUnitKt.pack(TextUnit.m6829getRawTypeimpl(jM3595getBodySmallLineHeightXSAIIZE), TextUnit.m6831getValueimpl(jM3595getBodySmallLineHeightXSAIIZE) / 2);
    }
}
