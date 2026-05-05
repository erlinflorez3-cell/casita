package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
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
/* JADX INFO: compiled from: TextField.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яī\u0014D߬)\u001e\u007f\u007fLDiv\fA\u00140\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\n=,[*qK;k\u001a\u0006̝\u0011Odgon`Z\u0013C\u0015\f\u001ex\u0001,Qǁ\u0001](\u000f:ԏw?IMw=?`|6\u0013&:\">y\r\u00010*PƵ~zYK\u0014۵8@\u0007:Z҈U\u0005(\u001e\u000e>&\u0005&\\uS>Hr^B/9\u0003qBT0g0\u0013M\u0015FZ4\u0015vw\u001e3@M5\u001dǬ[\u0003\u001dRc?\t@y=\u001bh/'1V\fʧ6f\u0003,\u0015YS=a\u0001+t\u0005\u007ff<79V{W`\u00108w)\u0002\u001d>\u0014\u000e4+v6] l\b\u001c<\rr\u0002J\u0001\bdB\u000e\u0006y6E10919)siai%~=\u0002\u0005\u001b,;\u0001\u001d0\fg\u0014`#+l\u0005a3a@kLd\t\bNъ\bph\u0014Z\u00176G\u000eB\u0014\u001e>\u001957\n=9 \u001a\u0013ҩHg|\u0017\u0011{Yi`\\X/~\u0018G*7\u0010pC\u0013\u0016\u07fbTT^>A`\"T\u0015\u0013  0^\b<O)&M}yȬnMc\u001cUBl7g\u0005\u0004\u001bg;n3cUy\u000f\u0010cλ\u0018?Bt5klBa#ri8$BH\u0019\u0014\u000ezr_ܟ\u00172E\u0004LG21't-U\u0013 RA+\ruY\u0017!њX3*\u0015\u001a*z\t\u000fitp\u001es)O2|n<EA\u007fPI,[\"vP\u0015#5\u001c$\u0006MgZedlD\u0015\u0006\u0002&\u0016(Yi/k\u001f?\u0005/2\u0010N]L!\b\u0002S\u0018'\t \u0012\u000fi\u000b^o\u000ej~Pxl`N\u0003<R|dr1.|\u007f(\tv\u0001Mcb3s>w\u001cI^\u0084R8\u000b/7Ƞ%\u000fr:|c1s++\u001b\u0010\u0014]@\u0012mwvF\u0006r\u00116t\u0014/<e&o\u0011U\f:k>OY\rG:$\u001b\rrNpw\u0016M!4;?xGjpdEe\u000b]\n\u0017\r2\r~ds:A~.G4_8\u0004[\u000b$`S%?Qif\u001c~љ`\u000bP!:\u001e\u00021|%4J0Xgb74\u001crFGװ?b\u000bN97:,J\u001c#Pdk\u0016\u0010)\u0004\\^=(ЋFsAh>g~\\d]\u001dmUb1*/\u0003%2L\n\u00985\u0005sX\u0005Bi2\u000fi5\u0016+l_~\u0015)AC\u0003JЬ,X\u0007\u001dupII\u0010M\u001cT9o{o:<.{KSɓ\u001f9W#\u0010\n6^\u0019m|[tx\"f\u0001R8(-\fէ\u0012<\u0010!;\u001fUr}{EL|\u0004gI \u0001%^A\u0007:\u0018\u0014L!-\u0014QE=w\bD-\u0002WaY\u0016\bN?W\nz!jw&f8iK@\u001cq$\u0004\u001a\tArP\n4J\u0003\u0016\".6X\u007f\n9\u0002!\u0003qm\u000e nL[r\fBY\u000f\u0011\n\u0012\u0014\u0014t[\u000b\u0011\u000fIV(\u0018sUɢ\r'[Z+ΪYH>k \u0007\u00150\u0018#/766lY\u001f]\u0012\u0001{{Qk\rY3\u001a;Հ50X0.0\b\u0006\u001c7d*%;\u0005QTc7m\u05cfFW\u0014p\u001b?r\b$<$~\u000fH\r\u001b#6VrLhE6G'˝\u0011Gf\u00194VWU9>bA+7`\u000f\u0006'%\"ܾ>bz\u0012ZS\u0017#\u0018t</VTk\u001e=XR~҉\u0007&QWhS\u0016B)\u001b!1j8NBr\u0019JLǾ7A\u001f#1&F\u001d\b\u0014)7zQ\u0002)@\u007f+\u0012°Cy7}jwE\u0013;/={K[tl=5\u0014~W\u001b\u0010\u0019b\n]ef\u000f\u00100wF¹\"y[R0\u001b-X<\u0013\u0006%\u0010E_L@^\u000bQҕwW\n8Z:|y;G\u001b/:\tߢm\u0018\u0002\u001csRBy\u0013\u0014Gfn.;&\u001fE{\u000b*\u000fRG]\u0014e16-AR\u0015\u0010}\u0014p/W/e/\u000b\u007fl\u0017\u0002AR2\u0010X*KN\u0018B\u0006[4\u0005gx*\u0006Q\u000e2h\u0016\u001bM\u001cw_t\u0011\u0004nN0'y)v:j:eA\u0011Mp\u00132\"FB:=6\u001a<}/\u0002,\u0001'\u0015Ϯ2ʺضEI\u0018\u001b\nf5aik\u001e%\u0016\rwCc9p=gU;qX!Me\u000b'\u0006%Y.C\u0015.\r[2U!V\u001aXz6\u0012S0`\u0010r\u001bt,{|H0~!\u000bGkN4\u001fkwEi\rsz7\n'W+ǄV֙דY%3G\u0010R(Y'c#\u001e\u0002CZ#\"\u0017aH\nYtOe~}I>V\u0010\u001dgǒ\u001eܵ.O \u0005V\u0014CAWmT<$5z\u001e\u0013R\u0005\u0018\u0017we:_1nfZ7!cY?@rp\u001dU\r\u000eD\u000bf/6C\u0014lz\u001eK:\u000e\u001a\\4~e_Q\u0001zX? l\u00037eGAtG\u0018aw\u001fBga*m\u007f6\tD%7>B)\u0001HvVe\n)A0E/\u0014sxUlb'XbE`h\b\u0013~dlon@VO1f} KURF!`\u001fjq\u0014p\u001eD'dz\u001b\u001d\u000fDcaEF}D\u000fŹfA\u001f:aPW\u0006%u 6\u0012x8\u0010\u0015*\u007fc:\u001bGD|C'nj\u0001i\u0005\u0005{\n4q=\u000e^\\V\u001b[4WsvdB\u0010\"{3\u0006\u001fY`/\u000e!\tc-|N O6QI7\u00121rl\u000e@-p|\u0005W\u000b~^\u007f\u0014\u007f*B*\u000f\u001dG\u0002]KY\bNb7N-\f\n\u0010 ;wB\bq\u000e;O\u0018\u0015Aa<\u0003\u0010\u0007\br A\u001a\u001c0\u0010<\bCI*Hblb&1h'6Fl-n\u00199\u0017½$/#tdٳoӇwnegBCUWc~S.Íq\rSLsȼGu\rʑ\u001a#"}, d2 = {"\"dgA90>Z\u0018p~m/c\u0005,e\u0007\u0019{M\u0010\u001b\u0015Cvx8u$9b\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc!X?M4\u001d~\u0002]\u001e\u0001\u00182L{%{Gq\u0017$Vs\f8}\u00101X|$@o", "u(5", "\u0014", "\"dgA90>Z\u0018", "", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "=mE._<>1\u001cz\u0004`,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "3mP/_,=", "", "@dP1B5Eg", "BdgAF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", ":`Q2_", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", ">kP0X/HZ\u0018~\b", ":dP1\\5@7\u0017\t\u0004", "BqP6_0GU||\u0005g", ">qT3\\?", "AtU3\\?", "At_=b9MW\"\u0001i^?\f", "7r4?e6K", "DhbBT3-`\u0015\b\t_6\n\u0011+t\u00042\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#n$E}\u00125<P7tB\u001f\u001fui5\u0016g6WL", "9dh/b(KR\u0003\n\nb6\u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u001e)$lkB\u00159", "9dh/b(KRt|\nb6\u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u0010\u001c$lkB\u00159", "Ah]4_,%W\"~", ";`g\u0019\\5>a", "", ";h]\u0019\\5>a", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e%Hh^$7t\u0015\fWJExBs", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W@\u007f0EhG\u000f7\u0001%\u000fQCBj%\u001a\u001cxa\u000fmi6]}+P\u0016S=d\u001csM\u001d\u0010i\u0012X4\u001bN:Q-lS;)\u0011w\u001fh7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b9l\u0010AixKBIb7:\u0001T\u0004XC91\u001eu\u0018.2N8\u0012\u0007]\u001fr\u001c\nk1V\u0019\u000eGm-mnU3~iCt|\u0006Q\u0006\u0007\u00196a>0\u00065M5:?b\u0014Oq!L(Y%5ZP+0?\th&Qm\u0005sB\u00172$r\u0010WcE:\u0017timQ\u001dP>'d3pc\u000b@\u001f[%Oy$.J\b\f`\u000b\u001dR\b4vcXG%]\u000fcQT+] \u0007\rodq\u0015\u001cGh\u0016l3)<^\u001bRiH\u0015yhG\u001fyVYN[{Yfs.?Ef0'=ZCz[\rt!\u001e}\u0002\u001b\b\u001b\u0003mL\u0003D\\\u00065FWGfj8W=:(#v? (v6\u0013Z\non\u0001%$\u0002\u0018q\u000b^>NA\u007fBESsn\u0012JQ\u000fKaV\u0019uR&7*u&KY\u00039Tw\u001cId;\u0002\u0011+00~\u0014t\\\u0002+o\u000b\u0019\u0014s\u001cBd~bV!W!n\u0012X\u001eGj/\u0018\u001fkJq \\\u0010r4>\\Xr&\"\u0015y]\u00143bD\u0002_I~+*\u0017x\u0002\u0011O\u0014)I\u001an_w\u0002tY9oQk\r~fH\u0015JJ\u0019B)c\u0010UX\u00055hTx\u0007\u000b(#z#y\u0002\u0013F=hK\u0004-\u007f+vQkl\nj:\u00160^\b)5:i.\u0016pen\u0004V\u000e\u0019tH1\u000eU\u00068\u001eTJ1x\u0002[\n(3\bUL'S+V\u0001\u0004Ez\u0013K~\u000b&Z-\bK{#BaE\u000f^40$\u0006[\u0016=g7\u001at*dJU&Tgxe\u000b]40s!\b\u001aS'+\bJF\u0015{`@\u001db \u0015\u0012%\u000e/.a<]\rju\u0013~FTpN_d\u0002WO\tx4o\u007f>nYcD$$A\u0019\u001cfM,ULY0\u0004iim`LX\u000b8*GukA\u0013-9c\"2-E|K]\u001ff\n<gG}\u0019\u0017.p\n_z(\u000e;z -\b\u00155KK\b\u000bG]l}x4I\u007f)\\x,XS\u0015tq{hH#\t\\n5\fki&)", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b\fxC; \f,VW0]g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCVAXqsS\fr,JIN+\u0014G\u007f!r_5\u000e\u0005\u001d\u0016\u0004ZChwP\u0017\n<.G{%'UxSKx1(\u0018Q^\u0018<g{/}v\tE2\u007fe\u0015Te'Bh\u0002#u=Q0$E@\u001dH\u00189\\rH\u001do#jQ\u0013s=z\u001aunaW\u0013\u0011f%%\u0016qh~FV\u0010G\u0016E{-P\u000eI_\u0003^\u000e\u0018,7fYL\u0019c\u0005$yRk@!\f\u0001u\u001c&7b\u0013@\u0015r9f;V\\\u000ey@U|iL\u0013\u007fL\u001avY<<gx\"E|\u001bRm\t2B\u0001aJs\u0019_9\u0012\u0013H\u001e\u0004r@\t:\u001d.3\u0007:Hk^>\u000fq\\nnN>&.45\u000b\u001cE\u007ffA(%\u0007\fw\u0001\u001ffL\u0002bCJGy&Fl\u0018Z1AN\u0019+Z\u001f3_\b_@e{@T|\u000eI\u0014/B\"\u001c?5?K(r+>0|\u0010\u0018\u007f\u00196\n\u000eTW$N\u001d{PD)\u0002e8Zv\u001eOg\"V\u0005(V\u0004LR~*=\u0016}\u001e\u0007<h@x_I~+*\u000b!\u0006\u001b_P\u0005E/X u\u0005k8:pU,\u0015\u0003,&\u0012W:\"B$\u0019\u0014\u001fC\u007fs\u000e^r\nJ- \fBmn\u001e@>c?,1\n;3-g\u0002s+8\u0019'/{*9zq2[\\JV[N\r\u000f8C5yY\u0006P(HX1\u000bt&/44\rJ?(\u0002@{f!R\u0001\u0014Kp\u00056Km\u0013\u000b[(GOBL]\u000e)*\u0007l\u00037l2Zy\u000f_ZU(V.[W\u000b\u0013Y*h$\u001e\\QM*\u0004TG\u0019Ga@\\[?\u0007\r\u001b\u0014-fD.W\nhkdf/\u0014qQa]v\\\u0019=r81\b?r\u0018h<5\u0016\u0005/\u0015q\u0010unep6e`_p`\u0017\u0019\u00148/JAD=R$J^&$<\u0013s\b\u001c;p\u0005-PP\u000e\u001b'Tn\u0003\u001fK$@_\t%.\b`\u00150\u001c\"P.", "\"dgA90>Z\u0018evr6\r\u0018", "BdgA90>Z\u0018", ":dP1\\5@", "BqP6_0GU", "/mX:T;B]\"i\bh.\n\t=s", "", "1n]AT0GS&", "At_=b9MW\"\u0001", ">`S1\\5@D\u0015\u0006\u000b^:", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\nix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0014O{{K8oJb)~XI\u000fc:m\nn!fCHmt\u0002\"\u0019wT8\u0013I)wx\\\tnkPb\u007fI,\bnkOC~YF}5h,\f\u0001\u0010A\\~4A\u0003j:4Ek\tT1\u001dOfB\u0016<e?6*@E!\t,s~jM\u0012r(.]th?@ in-M \u000f'\u0018k>_n\u0005A[\u0014\b*\u007f\u001e%U\u0003LdFjo\r.|lMLdY\u0012\":E2h\u000f\u0012\u0007p!*wvMb\rw.i@\u001ah}I\u001f\u0012\u0006hJ\u0019y\u0012\u0015~S<\\gx\"E|\u001bR/|,L\u007fPRs\u001a\u001f\u0001Vq\u0005'\u0003pF\u0003\u007f\u00186-\u0007ZHk^>\u000fq\\0bHH%\u001d<5\f[\rDEs0\u0014\u000b\u0018l{('<B\n>KWjk=m[\u000e;Va\u00146V^6\\\t Rj= Fm\r\u0004\r-i\u000f#<&\u0004\u001d\u0006c$.s\u0016\u0010\t\u0003f-%\tcX$M\\{XQ)\u0002c/Nm,Ns\u001fZ\u00016\u0019\u001e2\fg", "1`[0h3:b\u0019azb.\u007f\u0018", "BdgA90>Z\u0018azb.\u007f\u0018", ":`Q2_\u000f>W\u001b\u0002\n", ":dP1\\5@6\u0019\u0003|a;", "BqP6_0GU{~~`/\f", ">qT3\\?!S\u001d\u0001}m", "AtU3\\?!S\u001d\u0001}m", ">kP0X/HZ\u0018~\bA,\u0001\u000b2t", "At_=b9MW\"\u0001]^0~\f>", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "2d]@\\;R", "1`[0h3:b\u0019azb.\u007f\u0018vme\u001b`>q\u0015", "uH8\u0016<\u0010\"7|__?\u0013x\u0012.r\n,zSJ\u0015!Oz\u0018Jvn6c\u000e)6i%2WL\u0005r02\u001fxp\u0003q_+Mz0I=J3lR\u0001\u0013Wu", "1`[0h3:b\u0019p~];\u007f", ":dP1\\5@E\u001d}\na", "BqP6_0GU\u000b\u0003ym/", ">qT3\\?0W\u0018\u000e}", "AtU3\\?0W\u0018\u000e}", "BdgA90>Z\u0018p~];\u007f", ":`Q2_\u001eBR(\u0002", ">kP0X/HZ\u0018~\bP0{\u00182", "1`[0h3:b\u0019p~];\u007fPCeb-a\u000et", "uH8\u0016<\u0010\"7}B^", "2qPD<5=W\u0017z\nh9c\r8e", "7mS6V(M]&[\u0005k+|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", ">kP0X\u001eBb\u001cev[,\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "EhSA[", "Bnc._\u000f>W\u001b\u0002\n", "BdgAY0>Z\u0018i\u0002Z*|\u0005,l\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", ":`Q2_\u0017EO\u0017~v[3|", ">kP0X/HZ\u0018~\bI3x\u0007/a|/{", ":dP1\\5@> zx^(y\u0010/", "BqP6_0GU\u0004\u0006v\\,x\u00066e", ">qT3\\?)Z\u0015|zZ)\u0004\t", "AtU3\\?)Z\u0015|zZ)\u0004\t", "1n]AT0GS&i\u0002Z*|\u0005,l\u007f", "At_=b9MW\"\u0001ee(z\t+b\u0007(", ":`Q2_\fGR\u0004\t\tb;\u0001\u00138", "BdgAC6LW(\u0003\u0005g", ">kP0X\u001eBb\u001c\t\u000bm\u0013x\u0006/l", "BdgAC3:Q\u0019zwe,", "AtQ@g9:Q(\\\u0005g:\f\u0016+i\t7i<\u0002\u0017\u001e[", "4q^:", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldKt {
    private static final float TextFieldWithLabelVerticalPadding = Dp.m6638constructorimpl(8);

    /* JADX INFO: renamed from: androidx.compose.material3.TextFieldKt$TextField$2 */
    /* JADX INFO: compiled from: TextField.kt */
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
            TextFieldKt.TextField(str, function1, modifier, z, z, textStyle, function2, function2, function2, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, i, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TextFieldKt$TextField$4 */
    /* JADX INFO: compiled from: TextField.kt */
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
            TextFieldKt.TextField(textFieldValue, function1, modifier, z, z, textStyle, function2, function2, function2, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, i, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TextFieldKt$TextFieldLayout$2 */
    /* JADX INFO: compiled from: TextField.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06942 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ float $animationProgress;
        final /* synthetic */ Function2<Composer, Integer, Unit> $container;
        final /* synthetic */ Function2<Composer, Integer, Unit> $label;
        final /* synthetic */ Function2<Composer, Integer, Unit> $leading;
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
        C06942(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, boolean z2, float f2, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, PaddingValues paddingValues, int i2, int i3) {
            super(2);
            function2 = function2;
            function2 = function22;
            function3 = function3;
            function2 = function23;
            function2 = function24;
            function2 = function25;
            function2 = function26;
            z = z2;
            f = f2;
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
            TextFieldKt.TextFieldLayout(modifier, function2, function2, function3, function2, function2, function2, function2, z, f, function2, function2, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i));
        }
    }

    public static final int substractConstraintSafely(int i2, int i3) {
        return i2 == Integer.MAX_VALUE ? i2 : i2 - i3;
    }

    public static final void TextField(String str, Function1<? super String, Unit> function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        int i10;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        TextFieldColors textFieldColorsColors = textFieldColors;
        int i11 = i3;
        int i12 = i2;
        boolean z6 = z5;
        KeyboardActions keyboardActions2 = keyboardActions;
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        VisualTransformation none = visualTransformation;
        boolean z7 = z4;
        Function2<? super Composer, ? super Integer, Unit> function28 = function27;
        Shape shape2 = shape;
        Function2<? super Composer, ? super Integer, Unit> function29 = function26;
        Function2<? super Composer, ? super Integer, Unit> function210 = function25;
        Function2<? super Composer, ? super Integer, Unit> function211 = function24;
        Function2<? super Composer, ? super Integer, Unit> function212 = function23;
        Function2<? super Composer, ? super Integer, Unit> function213 = function22;
        Function2<? super Composer, ? super Integer, Unit> function214 = function2;
        TextStyle textStyle2 = textStyle;
        boolean z8 = z3;
        boolean z9 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-676242365);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextField)P(21,11,10,1,14,19,6,12,7,20,13,17,18,3,22,5,4,16,8,9,2,15)201@10573L7,217@11369L5,218@11424L8,230@12004L1956,230@11917L2043:TextField.kt#uh7d8r");
        if ((-1) - (((-1) - i7) | ((-1) - 1)) != 0) {
            i8 = i4 | 6;
        } else if ((-1) - (((-1) - i4) | ((-1) - 6)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i13 = composerStartRestartGroup.changed(str) ? 4 : 2;
            i8 = (i13 + i4) - (i13 & i4);
        } else {
            i8 = i4;
        }
        if ((i7 + 2) - (i7 | 2) != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 48));
        } else if ((i4 + 48) - (i4 | 48) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i8 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i14 = (i7 + 4) - (i7 | 4);
        if (i14 != 0) {
            i8 = (i8 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i8 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i4) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i8 |= composerStartRestartGroup.changed(companion) ? 256 : 128;
        }
        int i15 = (-1) - (((-1) - i7) | ((-1) - 8));
        if (i15 != 0) {
            i8 = (i8 + 3072) - (i8 & 3072);
        } else if ((i4 & 3072) == 0) {
            int i16 = composerStartRestartGroup.changed(z9) ? 2048 : 1024;
            i8 = (i8 + i16) - (i8 & i16);
        }
        int i17 = i7 & 16;
        if (i17 != 0) {
            i8 = (i8 + 24576) - (i8 & 24576);
        } else if ((-1) - (((-1) - i4) | ((-1) - 24576)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changed(z8) ? 16384 : 8192)));
        }
        if ((i4 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i8 |= ((-1) - (((-1) - i7) | ((-1) - 32)) == 0 && composerStartRestartGroup.changed(textStyle2)) ? 131072 : 65536;
        }
        int i18 = i7 & 64;
        if (i18 != 0) {
            i8 = (i8 + 1572864) - (i8 & 1572864);
        } else if ((i4 + 1572864) - (i4 | 1572864) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i19 = composerStartRestartGroup.changedInstance(function214) ? 1048576 : 524288;
            i8 = (i8 + i19) - (i8 & i19);
        }
        int i20 = (i7 + 128) - (i7 | 128);
        if (i20 != 0) {
            i8 = (i8 + 12582912) - (i8 & 12582912);
        } else if ((i4 & 12582912) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changedInstance(function213) ? 8388608 : 4194304)));
        }
        int i21 = (-1) - (((-1) - i7) | ((-1) - 256));
        if (i21 != 0) {
            i8 |= 100663296;
        } else if ((-1) - (((-1) - i4) | ((-1) - 100663296)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i22 = composerStartRestartGroup.changedInstance(function212) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i8 = (i8 + i22) - (i8 & i22);
        }
        int i23 = (-1) - (((-1) - i7) | ((-1) - 512));
        if (i23 != 0) {
            i8 |= 805306368;
        } else if ((i4 & 805306368) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i8 |= composerStartRestartGroup.changedInstance(function211) ? 536870912 : 268435456;
        }
        int i24 = (-1) - (((-1) - i7) | ((-1) - 1024));
        if (i24 != 0) {
            i9 = i5 | 6;
        } else if ((i5 + 6) - (i5 | 6) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i25 = composerStartRestartGroup.changedInstance(function210) ? 4 : 2;
            i9 = (i5 + i25) - (i5 & i25);
        } else {
            i9 = i5;
        }
        int i26 = (-1) - (((-1) - i7) | ((-1) - 2048));
        if (i26 != 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - 48));
        } else if ((i5 + 48) - (i5 | 48) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i9 |= composerStartRestartGroup.changedInstance(function29) ? 32 : 16;
        }
        int i27 = (i7 + 4096) - (i7 | 4096);
        if (i27 != 0) {
            i9 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i5 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i28 = composerStartRestartGroup.changedInstance(function28) ? 256 : 128;
            i9 = (i9 + i28) - (i9 & i28);
        }
        int i29 = (-1) - (((-1) - i7) | ((-1) - 8192));
        if (i29 != 0) {
            i9 |= 3072;
        } else if ((i5 + 3072) - (i5 | 3072) == 0) {
            int i30 = composerStartRestartGroup.changed(z7) ? 2048 : 1024;
            i9 = (i9 + i30) - (i9 & i30);
        }
        int i31 = i7 & 16384;
        if (i31 != 0) {
            i9 = (i9 + 24576) - (i9 & 24576);
        } else if ((i5 + 24576) - (i5 | 24576) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i32 = composerStartRestartGroup.changed(none) ? 16384 : 8192;
            i9 = (i9 + i32) - (i9 & i32);
        }
        int i33 = i7 & 32768;
        if (i33 != 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i34 = composerStartRestartGroup.changed(keyboardOptions2) ? 131072 : 65536;
            i9 = (i9 + i34) - (i9 & i34);
        }
        int i35 = (-1) - (((-1) - i7) | ((-1) - 65536));
        if (i35 != 0) {
            i9 = (i9 + 1572864) - (i9 & 1572864);
        } else if ((-1) - (((-1) - i5) | ((-1) - 1572864)) == 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - (composerStartRestartGroup.changed(keyboardActions2) ? 1048576 : 524288)));
        }
        int i36 = (i7 + 131072) - (i7 | 131072);
        if (i36 != 0) {
            i9 |= 12582912;
        } else if ((i5 + 12582912) - (i5 | 12582912) == 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - (composerStartRestartGroup.changed(z6) ? 8388608 : 4194304)));
        }
        if ((i5 & 100663296) == 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - (((-1) - (((-1) - i7) | ((-1) - 262144)) == 0 && composerStartRestartGroup.changed(i12)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        int i37 = i7 & 524288;
        if (i37 != 0) {
            i9 = (i9 + 805306368) - (i9 & 805306368);
        } else if ((-1) - (((-1) - i5) | ((-1) - 805306368)) == 0) {
            int i38 = composerStartRestartGroup.changed(i11) ? 536870912 : 268435456;
            i9 = (i9 + i38) - (i9 & i38);
        }
        int i39 = (i7 + 1048576) - (i7 | 1048576);
        if (i39 != 0) {
            i10 = (-1) - (((-1) - i6) & ((-1) - 6));
        } else if ((-1) - (((-1) - i6) | ((-1) - 6)) == 0) {
            i10 = i6 | (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
        } else {
            i10 = i6;
        }
        if ((i6 + 48) - (i6 | 48) == 0) {
            int i40 = ((-1) - (((-1) - i7) | ((-1) - 2097152)) == 0 && composerStartRestartGroup.changed(shape2)) ? 32 : 16;
            i10 = (i10 + i40) - (i10 & i40);
        }
        if ((-1) - (((-1) - i6) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i41 = ((i7 & 4194304) == 0 && composerStartRestartGroup.changed(textFieldColorsColors)) ? 256 : 128;
            i10 = (i10 + i41) - (i10 & i41);
        }
        if ((-1) - (((-1) - i8) | ((-1) - 306783379)) == 306783378 && (306783379 + i9) - (306783379 | i9) == 306783378 && (i10 + 147) - (i10 | 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i4) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i14 != 0) {
                    companion = Modifier.Companion;
                }
                if (i15 != 0) {
                    z9 = true;
                }
                if (i17 != 0) {
                    z8 = false;
                }
                if ((-1) - (((-1) - i7) | ((-1) - 32)) != 0) {
                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(localTextStyle);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    textStyle2 = (TextStyle) objConsume;
                    i8 = (i8 - 458753) - (i8 | (-458753));
                }
                if (i18 != 0) {
                    function214 = null;
                }
                if (i20 != 0) {
                    function213 = null;
                }
                if (i21 != 0) {
                    function212 = null;
                }
                if (i23 != 0) {
                    function211 = null;
                }
                if (i24 != 0) {
                    function210 = null;
                }
                if (i26 != 0) {
                    function29 = null;
                }
                if (i27 != 0) {
                    function28 = null;
                }
                if (i29 != 0) {
                    z7 = false;
                }
                if (i31 != 0) {
                    none = VisualTransformation.Companion.getNone();
                }
                if (i33 != 0) {
                    keyboardOptions2 = KeyboardOptions.Companion.getDefault();
                }
                if (i35 != 0) {
                    keyboardActions2 = KeyboardActions.Companion.getDefault();
                }
                if (i36 != 0) {
                    z6 = false;
                }
                if ((i7 + 262144) - (i7 | 262144) != 0) {
                    i12 = z6 ? 1 : Integer.MAX_VALUE;
                    i9 &= -234881025;
                }
                if (i37 != 0) {
                    i11 = 1;
                }
                mutableInteractionSource2 = i39 == 0 ? mutableInteractionSource : null;
                if ((-1) - (((-1) - i7) | ((-1) - 2097152)) != 0) {
                    shape2 = TextFieldDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                }
                if ((i7 & 4194304) != 0) {
                    textFieldColorsColors = TextFieldDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i7) | ((-1) - 32)) != 0) {
                    i8 &= -458753;
                }
                if ((262144 & i7) != 0) {
                    i9 &= -234881025;
                }
                mutableInteractionSource2 = mutableInteractionSource;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-676242365, i8, i9, "androidx.compose.material3.TextField (TextField.kt:219)");
            }
            composerStartRestartGroup.startReplaceGroup(-508515290);
            ComposerKt.sourceInformation(composerStartRestartGroup, "221@11518L39");
            if (mutableInteractionSource2 == null) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -508514639, "CC(remember):TextField.kt#9igjgp");
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
            composerStartRestartGroup.startReplaceGroup(-508509180);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*225@11742L25");
            long jM6153getColor0d7_KjU = textStyle2.m6153getColor0d7_KjU();
            if (jM6153getColor0d7_KjU == 16) {
                jM6153getColor0d7_KjU = textFieldColorsColors.m2680textColorXeAY9LY$material3_release(z9, z7, FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource3, composerStartRestartGroup, 0).getValue().booleanValue());
            }
            composerStartRestartGroup.endReplaceGroup();
            CompositionLocalKt.CompositionLocalProvider(TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColorsColors.getTextSelectionColors()), ComposableLambdaKt.rememberComposableLambda(1859145987, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.1
                final /* synthetic */ TextFieldColors $colors;
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
                AnonymousClass1(boolean z72, TextFieldColors textFieldColorsColors2, String str2, Function1<? super String, Unit> function12, boolean z92, boolean z82, TextStyle textStyle3, KeyboardOptions keyboardOptions22, KeyboardActions keyboardActions22, boolean z62, int i122, int i112, VisualTransformation none2, MutableInteractionSource mutableInteractionSource32, Function2<? super Composer, ? super Integer, Unit> function2142, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function2122, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function292, Function2<? super Composer, ? super Integer, Unit> function282, Shape shape22) {
                    super(2);
                    z = z72;
                    textFieldColors = textFieldColorsColors2;
                    str = str2;
                    function1 = function12;
                    z = z92;
                    z = z82;
                    textStyle = textStyle3;
                    keyboardOptions = keyboardOptions22;
                    keyboardActions = keyboardActions22;
                    z = z62;
                    i = i122;
                    i = i112;
                    visualTransformation = none2;
                    mutableInteractionSource = mutableInteractionSource32;
                    function2 = function2142;
                    function2 = function2132;
                    function2 = function2122;
                    function2 = function2112;
                    function2 = function2102;
                    function2 = function292;
                    function2 = function282;
                    shape = shape22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i42) {
                    ComposerKt.sourceInformation(composer2, "C235@12157L38,253@12960L984,231@12014L1940:TextField.kt#uh7d8r");
                    if ((-1) - (((-1) - i42) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1859145987, i42, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:231)");
                        }
                        Modifier modifier2 = modifier;
                        boolean z10 = z;
                        Strings.Companion companion2 = Strings.Companion;
                        BasicTextFieldKt.BasicTextField(str, function1, SizeKt.m1047defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier2, z10, Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2698getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2697getMinHeightD9Ej5fM()), z, z, textStyle, keyboardOptions, keyboardActions, z, i, i, visualTransformation, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, new SolidColor(textFieldColors.m2630cursorColorvNxB06k$material3_release(z), null), ComposableLambdaKt.rememberComposableLambda(-288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.1.1
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
                            C00971(String str2, boolean z11, boolean z12, VisualTransformation visualTransformation2, MutableInteractionSource mutableInteractionSource4, boolean z13, Function2<? super Composer, ? super Integer, Unit> function215, Function2<? super Composer, ? super Integer, Unit> function216, Function2<? super Composer, ? super Integer, Unit> function217, Function2<? super Composer, ? super Integer, Unit> function218, Function2<? super Composer, ? super Integer, Unit> function219, Function2<? super Composer, ? super Integer, Unit> function220, Function2<? super Composer, ? super Integer, Unit> function221, Shape shape3, TextFieldColors textFieldColors2) {
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
                                shape = shape3;
                                textFieldColors = textFieldColors2;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function215, Composer composer3, Integer num) {
                                invoke((Function2<? super Composer, ? super Integer, Unit>) function215, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function215, Composer composer3, int i43) {
                                int i44 = i43;
                                ComposerKt.sourceInformation(composer3, "C255@13115L811:TextField.kt#uh7d8r");
                                if ((i44 + 6) - (6 | i44) == 0) {
                                    i44 |= composer3.changedInstance(function215) ? 4 : 2;
                                }
                                if ((i44 + 19) - (19 | i44) != 18 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-288211827, i44, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:255)");
                                    }
                                    int i45 = i44 << 3;
                                    TextFieldDefaults.INSTANCE.DecorationBox(str, function215, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, null, null, composer3, (i45 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i45 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION), 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
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

                /* JADX INFO: renamed from: androidx.compose.material3.TextFieldKt$TextField$1$1 */
                /* JADX INFO: compiled from: TextField.kt */
                /* JADX INFO: loaded from: classes2.dex */
                @InterfaceC1492Gx
                @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bӵLc\u000b\u0004I\u0006F\u000b6B\u0005\":ߚ\u0010\u0007\u0015ii?Re`9bU:\u000f\u001azb%Ӯ(qI=\u001c#ԥ&\u000bUQuk"}, d2 = {"\n`]<a@F])\rS", "", "7m]2e\u001b>f(_~^3{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "7me<^,", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001pHJ"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                static final class C00971 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
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
                    C00971(String str2, boolean z11, boolean z12, VisualTransformation visualTransformation2, MutableInteractionSource mutableInteractionSource4, boolean z13, Function2<? super Composer, ? super Integer, Unit> function215, Function2<? super Composer, ? super Integer, Unit> function216, Function2<? super Composer, ? super Integer, Unit> function217, Function2<? super Composer, ? super Integer, Unit> function218, Function2<? super Composer, ? super Integer, Unit> function219, Function2<? super Composer, ? super Integer, Unit> function220, Function2<? super Composer, ? super Integer, Unit> function221, Shape shape3, TextFieldColors textFieldColors2) {
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
                        shape = shape3;
                        textFieldColors = textFieldColors2;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function215, Composer composer3, Integer num) {
                        invoke((Function2<? super Composer, ? super Integer, Unit>) function215, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> function215, Composer composer3, int i43) {
                        int i44 = i43;
                        ComposerKt.sourceInformation(composer3, "C255@13115L811:TextField.kt#uh7d8r");
                        if ((i44 + 6) - (6 | i44) == 0) {
                            i44 |= composer3.changedInstance(function215) ? 4 : 2;
                        }
                        if ((i44 + 19) - (19 | i44) != 18 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-288211827, i44, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:255)");
                            }
                            int i45 = i44 << 3;
                            TextFieldDefaults.INSTANCE.DecorationBox(str, function215, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, null, null, composer3, (i45 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i45 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION), 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.2
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
                AnonymousClass2(String str2, Function1<? super String, Unit> function12, Modifier companion2, boolean z92, boolean z82, TextStyle textStyle22, Function2<? super Composer, ? super Integer, Unit> function2142, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function2122, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function292, Function2<? super Composer, ? super Integer, Unit> function282, boolean z72, VisualTransformation none2, KeyboardOptions keyboardOptions22, KeyboardActions keyboardActions22, boolean z62, int i122, int i112, MutableInteractionSource mutableInteractionSource22, Shape shape22, TextFieldColors textFieldColorsColors2, int i42, int i52, int i62, int i72) {
                    super(2);
                    str = str2;
                    function1 = function12;
                    modifier = companion2;
                    z = z92;
                    z = z82;
                    textStyle = textStyle22;
                    function2 = function2142;
                    function2 = function2132;
                    function2 = function2122;
                    function2 = function2112;
                    function2 = function2102;
                    function2 = function292;
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
                    TextFieldKt.TextField(str, function1, modifier, z, z, textStyle, function2, function2, function2, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, i, mutableInteractionSource, shape, textFieldColors, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i), RecomposeScopeImplKt.updateChangedFlags(i), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TextFieldKt$TextField$1 */
    /* JADX INFO: compiled from: TextField.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ TextFieldColors $colors;
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
        AnonymousClass1(boolean z72, TextFieldColors textFieldColorsColors2, String str2, Function1<? super String, Unit> function12, boolean z92, boolean z82, TextStyle textStyle3, KeyboardOptions keyboardOptions22, KeyboardActions keyboardActions22, boolean z62, int i122, int i112, VisualTransformation none2, MutableInteractionSource mutableInteractionSource32, Function2<? super Composer, ? super Integer, Unit> function2142, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function2122, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function292, Function2<? super Composer, ? super Integer, Unit> function282, Shape shape22) {
            super(2);
            z = z72;
            textFieldColors = textFieldColorsColors2;
            str = str2;
            function1 = function12;
            z = z92;
            z = z82;
            textStyle = textStyle3;
            keyboardOptions = keyboardOptions22;
            keyboardActions = keyboardActions22;
            z = z62;
            i = i122;
            i = i112;
            visualTransformation = none2;
            mutableInteractionSource = mutableInteractionSource32;
            function2 = function2142;
            function2 = function2132;
            function2 = function2122;
            function2 = function2112;
            function2 = function2102;
            function2 = function292;
            function2 = function282;
            shape = shape22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer2, int i42) {
            ComposerKt.sourceInformation(composer2, "C235@12157L38,253@12960L984,231@12014L1940:TextField.kt#uh7d8r");
            if ((-1) - (((-1) - i42) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1859145987, i42, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:231)");
                }
                Modifier modifier2 = modifier;
                boolean z10 = z;
                Strings.Companion companion2 = Strings.Companion;
                BasicTextFieldKt.BasicTextField(str, function1, SizeKt.m1047defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier2, z10, Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2698getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2697getMinHeightD9Ej5fM()), z, z, textStyle, keyboardOptions, keyboardActions, z, i, i, visualTransformation, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, new SolidColor(textFieldColors.m2630cursorColorvNxB06k$material3_release(z), null), ComposableLambdaKt.rememberComposableLambda(-288211827, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.1.1
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
                    C00971(String str2, boolean z11, boolean z12, VisualTransformation visualTransformation2, MutableInteractionSource mutableInteractionSource4, boolean z13, Function2<? super Composer, ? super Integer, Unit> function215, Function2<? super Composer, ? super Integer, Unit> function216, Function2<? super Composer, ? super Integer, Unit> function217, Function2<? super Composer, ? super Integer, Unit> function218, Function2<? super Composer, ? super Integer, Unit> function219, Function2<? super Composer, ? super Integer, Unit> function220, Function2<? super Composer, ? super Integer, Unit> function221, Shape shape3, TextFieldColors textFieldColors2) {
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
                        shape = shape3;
                        textFieldColors = textFieldColors2;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function215, Composer composer3, Integer num) {
                        invoke((Function2<? super Composer, ? super Integer, Unit>) function215, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> function215, Composer composer3, int i43) {
                        int i44 = i43;
                        ComposerKt.sourceInformation(composer3, "C255@13115L811:TextField.kt#uh7d8r");
                        if ((i44 + 6) - (6 | i44) == 0) {
                            i44 |= composer3.changedInstance(function215) ? 4 : 2;
                        }
                        if ((i44 + 19) - (19 | i44) != 18 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-288211827, i44, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:255)");
                            }
                            int i45 = i44 << 3;
                            TextFieldDefaults.INSTANCE.DecorationBox(str, function215, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, null, null, composer3, (i45 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i45 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION), 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
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

        /* JADX INFO: renamed from: androidx.compose.material3.TextFieldKt$TextField$1$1 */
        /* JADX INFO: compiled from: TextField.kt */
        /* JADX INFO: loaded from: classes2.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bӵLc\u000b\u0004I\u0006F\u000b6B\u0005\":ߚ\u0010\u0007\u0015ii?Re`9bU:\u000f\u001azb%Ӯ(qI=\u001c#ԥ&\u000bUQuk"}, d2 = {"\n`]<a@F])\rS", "", "7m]2e\u001b>f(_~^3{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "7me<^,", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001pHJ"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class C00971 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
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
            C00971(String str2, boolean z11, boolean z12, VisualTransformation visualTransformation2, MutableInteractionSource mutableInteractionSource4, boolean z13, Function2<? super Composer, ? super Integer, Unit> function215, Function2<? super Composer, ? super Integer, Unit> function216, Function2<? super Composer, ? super Integer, Unit> function217, Function2<? super Composer, ? super Integer, Unit> function218, Function2<? super Composer, ? super Integer, Unit> function219, Function2<? super Composer, ? super Integer, Unit> function220, Function2<? super Composer, ? super Integer, Unit> function221, Shape shape3, TextFieldColors textFieldColors2) {
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
                shape = shape3;
                textFieldColors = textFieldColors2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function215, Composer composer3, Integer num) {
                invoke((Function2<? super Composer, ? super Integer, Unit>) function215, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function215, Composer composer3, int i43) {
                int i44 = i43;
                ComposerKt.sourceInformation(composer3, "C255@13115L811:TextField.kt#uh7d8r");
                if ((i44 + 6) - (6 | i44) == 0) {
                    i44 |= composer3.changedInstance(function215) ? 4 : 2;
                }
                if ((i44 + 19) - (19 | i44) != 18 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-288211827, i44, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:255)");
                    }
                    int i45 = i44 << 3;
                    TextFieldDefaults.INSTANCE.DecorationBox(str, function215, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, null, null, composer3, (i45 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i45 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION), 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }
    }

    public static final void TextField(TextFieldValue textFieldValue, Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z2, boolean z3, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, boolean z4, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z5, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, Composer composer, int i4, int i5, int i6, int i7) {
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
        KeyboardOptions keyboardOptions2 = keyboardOptions;
        VisualTransformation none = visualTransformation;
        boolean z7 = z4;
        Function2<? super Composer, ? super Integer, Unit> function28 = function27;
        Function2<? super Composer, ? super Integer, Unit> function29 = function25;
        Function2<? super Composer, ? super Integer, Unit> function210 = function24;
        Function2<? super Composer, ? super Integer, Unit> function211 = function23;
        Function2<? super Composer, ? super Integer, Unit> function212 = function22;
        KeyboardActions keyboardActions2 = keyboardActions;
        Function2<? super Composer, ? super Integer, Unit> function213 = function26;
        Function2<? super Composer, ? super Integer, Unit> function214 = function2;
        TextStyle textStyle2 = textStyle;
        boolean z8 = z3;
        boolean z9 = z2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1268528240);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextField)P(21,11,10,1,14,19,6,12,7,20,13,17,18,3,22,5,4,16,8,9,2,15)357@19138L7,373@19934L5,374@19989L8,386@20569L1961,386@20482L2048:TextField.kt#uh7d8r");
        if ((i7 + 1) - (i7 | 1) != 0) {
            i8 = i4 | 6;
        } else if ((-1) - (((-1) - i4) | ((-1) - 6)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i8 = (composerStartRestartGroup.changed(textFieldValue) ? 4 : 2) | i4;
        } else {
            i8 = i4;
        }
        if ((i7 + 2) - (i7 | 2) != 0) {
            i8 |= 48;
        } else if ((-1) - (((-1) - i4) | ((-1) - 48)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changedInstance(function1) ? 32 : 16)));
        }
        int i13 = (-1) - (((-1) - i7) | ((-1) - 4));
        if (i13 != 0) {
            i8 = (i8 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i8 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i4) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i8 |= composerStartRestartGroup.changed(companion) ? 256 : 128;
        }
        int i14 = (i7 + 8) - (i7 | 8);
        if (i14 != 0) {
            i8 = (i8 + 3072) - (i8 & 3072);
        } else if ((i4 & 3072) == 0) {
            int i15 = composerStartRestartGroup.changed(z9) ? 2048 : 1024;
            i8 = (i8 + i15) - (i8 & i15);
        }
        int i16 = (i7 + 16) - (i7 | 16);
        if (i16 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 24576));
        } else if ((-1) - (((-1) - i4) | ((-1) - 24576)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i17 = composerStartRestartGroup.changed(z8) ? 16384 : 8192;
            i8 = (i8 + i17) - (i8 & i17);
        }
        if ((-1) - (((-1) - i4) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            int i18 = ((i7 + 32) - (i7 | 32) == 0 && composerStartRestartGroup.changed(textStyle2)) ? 131072 : 65536;
            i8 = (i8 + i18) - (i8 & i18);
        }
        int i19 = (-1) - (((-1) - i7) | ((-1) - 64));
        if (i19 != 0) {
            i8 |= 1572864;
        } else if ((-1) - (((-1) - i4) | ((-1) - 1572864)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i20 = composerStartRestartGroup.changedInstance(function214) ? 1048576 : 524288;
            i8 = (i8 + i20) - (i8 & i20);
        }
        int i21 = (-1) - (((-1) - i7) | ((-1) - 128));
        if (i21 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 12582912));
        } else if ((i4 + 12582912) - (i4 | 12582912) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i8 |= composerStartRestartGroup.changedInstance(function212) ? 8388608 : 4194304;
        }
        int i22 = (-1) - (((-1) - i7) | ((-1) - 256));
        if (i22 != 0) {
            i8 = (i8 + 100663296) - (i8 & 100663296);
        } else if ((i4 + 100663296) - (i4 | 100663296) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changedInstance(function211) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        int i23 = (-1) - (((-1) - i7) | ((-1) - 512));
        if (i23 != 0) {
            i8 = (i8 + 805306368) - (i8 & 805306368);
        } else if ((i4 + 805306368) - (i4 | 805306368) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i24 = composerStartRestartGroup.changedInstance(function210) ? 536870912 : 268435456;
            i8 = (i8 + i24) - (i8 & i24);
        }
        int i25 = (i7 + 1024) - (i7 | 1024);
        if (i25 != 0) {
            i9 = (-1) - (((-1) - i5) & ((-1) - 6));
        } else if ((i5 & 6) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i26 = composerStartRestartGroup.changedInstance(function29) ? 4 : 2;
            i9 = (i5 + i26) - (i5 & i26);
        } else {
            i9 = i5;
        }
        int i27 = i7 & 2048;
        if (i27 != 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - 48));
        } else if ((-1) - (((-1) - i5) | ((-1) - 48)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i9 |= composerStartRestartGroup.changedInstance(function213) ? 32 : 16;
        }
        int i28 = (i7 + 4096) - (i7 | 4096);
        if (i28 != 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i29 = composerStartRestartGroup.changedInstance(function28) ? 256 : 128;
            i9 = (i9 + i29) - (i9 & i29);
        }
        int i30 = i7 & 8192;
        if (i30 != 0) {
            i9 |= 3072;
        } else if ((i5 & 3072) == 0) {
            int i31 = composerStartRestartGroup.changed(z7) ? 2048 : 1024;
            i9 = (i9 + i31) - (i9 & i31);
        }
        int i32 = (-1) - (((-1) - i7) | ((-1) - 16384));
        if (i32 != 0) {
            i9 = (i9 + 24576) - (i9 & 24576);
        } else if ((-1) - (((-1) - i5) | ((-1) - 24576)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i9 = (-1) - (((-1) - i9) & ((-1) - (composerStartRestartGroup.changed(none) ? 16384 : 8192)));
        }
        int i33 = (-1) - (((-1) - i7) | ((-1) - 32768));
        if (i33 != 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i34 = composerStartRestartGroup.changed(keyboardOptions2) ? 131072 : 65536;
            i9 = (i9 + i34) - (i9 & i34);
        }
        int i35 = (-1) - (((-1) - i7) | ((-1) - 65536));
        if (i35 != 0) {
            i9 = (i9 + 1572864) - (i9 & 1572864);
        } else if ((-1) - (((-1) - i5) | ((-1) - 1572864)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            int i36 = composerStartRestartGroup.changed(keyboardActions2) ? 1048576 : 524288;
            i9 = (i9 + i36) - (i9 & i36);
        }
        int i37 = (-1) - (((-1) - i7) | ((-1) - 131072));
        if (i37 != 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - 12582912));
        } else if ((-1) - (((-1) - i5) | ((-1) - 12582912)) == 0) {
            i9 |= composerStartRestartGroup.changed(z6) ? 8388608 : 4194304;
        }
        if ((i5 + 100663296) - (i5 | 100663296) == 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - (((-1) - (((-1) - i7) | ((-1) - 262144)) == 0 && composerStartRestartGroup.changed(i12)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        int i38 = (i7 + 524288) - (i7 | 524288);
        if (i38 != 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - 805306368));
        } else if ((-1) - (((-1) - i5) | ((-1) - 805306368)) == 0) {
            i9 |= composerStartRestartGroup.changed(i11) ? 536870912 : 268435456;
        }
        int i39 = i7 & 1048576;
        if (i39 != 0) {
            i10 = (-1) - (((-1) - i6) & ((-1) - 6));
        } else if ((-1) - (((-1) - i6) | ((-1) - 6)) == 0) {
            i10 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2)));
        } else {
            i10 = i6;
        }
        if ((i6 & 48) == 0) {
            i10 |= ((-1) - (((-1) - i7) | ((-1) - 2097152)) == 0 && composerStartRestartGroup.changed(shape2)) ? 32 : 16;
        }
        if ((i6 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i6 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i40 = ((-1) - (((-1) - i7) | ((-1) - 4194304)) == 0 && composerStartRestartGroup.changed(textFieldColorsColors)) ? 256 : 128;
            i10 = (i10 + i40) - (i10 & i40);
        }
        if ((i8 + 306783379) - (306783379 | i8) == 306783378 && (306783379 & i9) == 306783378 && (i10 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i4) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i13 != 0) {
                    companion = Modifier.Companion;
                }
                if (i14 != 0) {
                    z9 = true;
                }
                if (i16 != 0) {
                    z8 = false;
                }
                if ((-1) - (((-1) - i7) | ((-1) - 32)) != 0) {
                    ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(localTextStyle);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    textStyle2 = (TextStyle) objConsume;
                    i8 &= -458753;
                }
                if (i19 != 0) {
                    function214 = null;
                }
                if (i21 != 0) {
                    function212 = null;
                }
                if (i22 != 0) {
                    function211 = null;
                }
                if (i23 != 0) {
                    function210 = null;
                }
                if (i25 != 0) {
                    function29 = null;
                }
                if (i27 != 0) {
                    function213 = null;
                }
                if (i28 != 0) {
                    function28 = null;
                }
                if (i30 != 0) {
                    z7 = false;
                }
                if (i32 != 0) {
                    none = VisualTransformation.Companion.getNone();
                }
                if (i33 != 0) {
                    keyboardOptions2 = KeyboardOptions.Companion.getDefault();
                }
                if (i35 != 0) {
                    keyboardActions2 = KeyboardActions.Companion.getDefault();
                }
                if (i37 != 0) {
                    z6 = false;
                }
                if ((i7 + 262144) - (i7 | 262144) != 0) {
                    i12 = z6 ? 1 : Integer.MAX_VALUE;
                    i9 = (-1) - (((-1) - i9) | ((-1) - (-234881025)));
                }
                if (i38 != 0) {
                    i11 = 1;
                }
                mutableInteractionSource2 = i39 == 0 ? mutableInteractionSource : null;
                if ((i7 & 2097152) != 0) {
                    shape2 = TextFieldDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                }
                if ((-1) - (((-1) - i7) | ((-1) - 4194304)) != 0) {
                    textFieldColorsColors = TextFieldDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i7 & 32) != 0) {
                    i8 = (i8 - 458753) - (i8 | (-458753));
                }
                if ((262144 & i7) != 0) {
                    i9 = (i9 - 234881025) - (i9 | (-234881025));
                }
                mutableInteractionSource2 = mutableInteractionSource;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1268528240, i8, i9, "androidx.compose.material3.TextField (TextField.kt:375)");
            }
            composerStartRestartGroup.startReplaceGroup(-508241210);
            ComposerKt.sourceInformation(composerStartRestartGroup, "377@20083L39");
            if (mutableInteractionSource2 == null) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -508240559, "CC(remember):TextField.kt#9igjgp");
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
            composerStartRestartGroup.startReplaceGroup(-508235100);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*381@20307L25");
            long jM6153getColor0d7_KjU = textStyle2.m6153getColor0d7_KjU();
            if (jM6153getColor0d7_KjU == 16) {
                jM6153getColor0d7_KjU = textFieldColorsColors.m2680textColorXeAY9LY$material3_release(z9, z7, FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource3, composerStartRestartGroup, 0).getValue().booleanValue());
            }
            composerStartRestartGroup.endReplaceGroup();
            TextStyle textStyleMerge = textStyle2.merge(new TextStyle(jM6153getColor0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
            ProvidedValue<TextSelectionColors> providedValueProvides = TextSelectionColorsKt.getLocalTextSelectionColors().provides(textFieldColorsColors.getTextSelectionColors());
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1163788208, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.3
                final /* synthetic */ TextFieldColors $colors;
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
                AnonymousClass3(boolean z72, TextFieldColors textFieldColorsColors2, TextFieldValue textFieldValue2, Function1<? super TextFieldValue, Unit> function12, boolean z92, boolean z82, TextStyle textStyleMerge2, KeyboardOptions keyboardOptions22, KeyboardActions keyboardActions22, boolean z62, int i122, int i112, VisualTransformation none2, MutableInteractionSource mutableInteractionSource32, Function2<? super Composer, ? super Integer, Unit> function2142, Function2<? super Composer, ? super Integer, Unit> function2122, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function292, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function282, Shape shape22) {
                    super(2);
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
                    function2 = function2122;
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
                    ComposerKt.sourceInformation(composer2, "C391@20722L38,409@21525L989,387@20579L1945:TextField.kt#uh7d8r");
                    if ((-1) - (((-1) - i41) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1163788208, i41, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:387)");
                        }
                        Modifier modifier2 = modifier;
                        boolean z10 = z;
                        Strings.Companion companion2 = Strings.Companion;
                        BasicTextFieldKt.BasicTextField(textFieldValue, function1, SizeKt.m1047defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier2, z10, Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2698getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2697getMinHeightD9Ej5fM()), z, z, textStyle, keyboardOptions, keyboardActions, z, i, i, visualTransformation, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, new SolidColor(textFieldColors.m2630cursorColorvNxB06k$material3_release(z), null), ComposableLambdaKt.rememberComposableLambda(1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.3.1
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
                            AnonymousClass1(boolean z11, boolean z12, VisualTransformation visualTransformation2, MutableInteractionSource mutableInteractionSource4, boolean z13, Function2<? super Composer, ? super Integer, Unit> function215, Function2<? super Composer, ? super Integer, Unit> function216, Function2<? super Composer, ? super Integer, Unit> function217, Function2<? super Composer, ? super Integer, Unit> function218, Function2<? super Composer, ? super Integer, Unit> function219, Function2<? super Composer, ? super Integer, Unit> function220, Function2<? super Composer, ? super Integer, Unit> function221, Shape shape3, TextFieldColors textFieldColors2) {
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
                                shape = shape3;
                                textFieldColors = textFieldColors2;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function215, Composer composer3, Integer num) {
                                invoke((Function2<? super Composer, ? super Integer, Unit>) function215, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function215, Composer composer3, int i42) {
                                int i43 = i42;
                                ComposerKt.sourceInformation(composer3, "C411@21680L816:TextField.kt#uh7d8r");
                                if ((-1) - (((-1) - i43) | ((-1) - 6)) == 0) {
                                    i43 = (-1) - (((-1) - i43) & ((-1) - (composer3.changedInstance(function215) ? 4 : 2)));
                                }
                                if ((i43 & 19) != 18 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1751957978, i43, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:411)");
                                    }
                                    TextFieldDefaults.INSTANCE.DecorationBox(textFieldValue.getText(), function215, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, null, null, composer3, (-1) - (((-1) - (i43 << 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)), 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
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

                /* JADX INFO: renamed from: androidx.compose.material3.TextFieldKt$TextField$3$1 */
                /* JADX INFO: compiled from: TextField.kt */
                @InterfaceC1492Gx
                @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bӵLc\u000b\u0004I\u0006F\u000b6B\u0005\":ߚ\u0010\u0007\u0015ii?Re`9bU:\u000f\u001azb%Ӯ(qI=\u001c#ԥ&\u000bUQuk"}, d2 = {"\n`]<a@F])\rS", "", "7m]2e\u001b>f(_~^3{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "7me<^,", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001pHJ"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                static final class AnonymousClass1 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
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
                    AnonymousClass1(boolean z11, boolean z12, VisualTransformation visualTransformation2, MutableInteractionSource mutableInteractionSource4, boolean z13, Function2<? super Composer, ? super Integer, Unit> function215, Function2<? super Composer, ? super Integer, Unit> function216, Function2<? super Composer, ? super Integer, Unit> function217, Function2<? super Composer, ? super Integer, Unit> function218, Function2<? super Composer, ? super Integer, Unit> function219, Function2<? super Composer, ? super Integer, Unit> function220, Function2<? super Composer, ? super Integer, Unit> function221, Shape shape3, TextFieldColors textFieldColors2) {
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
                        shape = shape3;
                        textFieldColors = textFieldColors2;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function215, Composer composer3, Integer num) {
                        invoke((Function2<? super Composer, ? super Integer, Unit>) function215, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> function215, Composer composer3, int i42) {
                        int i43 = i42;
                        ComposerKt.sourceInformation(composer3, "C411@21680L816:TextField.kt#uh7d8r");
                        if ((-1) - (((-1) - i43) | ((-1) - 6)) == 0) {
                            i43 = (-1) - (((-1) - i43) & ((-1) - (composer3.changedInstance(function215) ? 4 : 2)));
                        }
                        if ((i43 & 19) != 18 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1751957978, i43, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:411)");
                            }
                            TextFieldDefaults.INSTANCE.DecorationBox(textFieldValue.getText(), function215, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, null, null, composer3, (-1) - (((-1) - (i43 << 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)), 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            int i41 = ProvidedValue.$stable;
            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, composableLambdaRememberComposableLambda, composerStartRestartGroup, (i41 + 48) - (i41 & 48));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.4
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
                AnonymousClass4(Function1<? super TextFieldValue, Unit> function12, Modifier companion2, boolean z92, boolean z82, TextStyle textStyle22, Function2<? super Composer, ? super Integer, Unit> function2142, Function2<? super Composer, ? super Integer, Unit> function2122, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function292, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function282, boolean z72, VisualTransformation none2, KeyboardOptions keyboardOptions22, KeyboardActions keyboardActions22, boolean z62, int i122, int i112, MutableInteractionSource mutableInteractionSource22, Shape shape22, TextFieldColors textFieldColorsColors2, int i42, int i52, int i62, int i72) {
                    super(2);
                    function1 = function12;
                    modifier = companion2;
                    z = z92;
                    z = z82;
                    textStyle = textStyle22;
                    function2 = function2142;
                    function2 = function2122;
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
                    TextFieldKt.TextField(textFieldValue, function1, modifier, z, z, textStyle, function2, function2, function2, function2, function2, function2, function2, z, visualTransformation, keyboardOptions, keyboardActions, z, i, i, mutableInteractionSource, shape, textFieldColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), RecomposeScopeImplKt.updateChangedFlags(i), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TextFieldKt$TextField$3 */
    /* JADX INFO: compiled from: TextField.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ TextFieldColors $colors;
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
        AnonymousClass3(boolean z72, TextFieldColors textFieldColorsColors2, TextFieldValue textFieldValue2, Function1<? super TextFieldValue, Unit> function12, boolean z92, boolean z82, TextStyle textStyleMerge2, KeyboardOptions keyboardOptions22, KeyboardActions keyboardActions22, boolean z62, int i122, int i112, VisualTransformation none2, MutableInteractionSource mutableInteractionSource32, Function2<? super Composer, ? super Integer, Unit> function2142, Function2<? super Composer, ? super Integer, Unit> function2122, Function2<? super Composer, ? super Integer, Unit> function2112, Function2<? super Composer, ? super Integer, Unit> function2102, Function2<? super Composer, ? super Integer, Unit> function292, Function2<? super Composer, ? super Integer, Unit> function2132, Function2<? super Composer, ? super Integer, Unit> function282, Shape shape22) {
            super(2);
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
            function2 = function2122;
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
            ComposerKt.sourceInformation(composer2, "C391@20722L38,409@21525L989,387@20579L1945:TextField.kt#uh7d8r");
            if ((-1) - (((-1) - i41) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1163788208, i41, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:387)");
                }
                Modifier modifier2 = modifier;
                boolean z10 = z;
                Strings.Companion companion2 = Strings.Companion;
                BasicTextFieldKt.BasicTextField(textFieldValue, function1, SizeKt.m1047defaultMinSizeVpY3zN4(TextFieldImplKt.defaultErrorSemantics(modifier2, z10, Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(androidx.compose.ui.R.string.default_error_message), composer2, 0)), TextFieldDefaults.INSTANCE.m2698getMinWidthD9Ej5fM(), TextFieldDefaults.INSTANCE.m2697getMinHeightD9Ej5fM()), z, z, textStyle, keyboardOptions, keyboardActions, z, i, i, visualTransformation, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource, new SolidColor(textFieldColors.m2630cursorColorvNxB06k$material3_release(z), null), ComposableLambdaKt.rememberComposableLambda(1751957978, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextField.3.1
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
                    AnonymousClass1(boolean z11, boolean z12, VisualTransformation visualTransformation2, MutableInteractionSource mutableInteractionSource4, boolean z13, Function2<? super Composer, ? super Integer, Unit> function215, Function2<? super Composer, ? super Integer, Unit> function216, Function2<? super Composer, ? super Integer, Unit> function217, Function2<? super Composer, ? super Integer, Unit> function218, Function2<? super Composer, ? super Integer, Unit> function219, Function2<? super Composer, ? super Integer, Unit> function220, Function2<? super Composer, ? super Integer, Unit> function221, Shape shape3, TextFieldColors textFieldColors2) {
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
                        shape = shape3;
                        textFieldColors = textFieldColors2;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function215, Composer composer3, Integer num) {
                        invoke((Function2<? super Composer, ? super Integer, Unit>) function215, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Function2<? super Composer, ? super Integer, Unit> function215, Composer composer3, int i42) {
                        int i43 = i42;
                        ComposerKt.sourceInformation(composer3, "C411@21680L816:TextField.kt#uh7d8r");
                        if ((-1) - (((-1) - i43) | ((-1) - 6)) == 0) {
                            i43 = (-1) - (((-1) - i43) & ((-1) - (composer3.changedInstance(function215) ? 4 : 2)));
                        }
                        if ((i43 & 19) != 18 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1751957978, i43, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:411)");
                            }
                            TextFieldDefaults.INSTANCE.DecorationBox(textFieldValue.getText(), function215, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, null, null, composer3, (-1) - (((-1) - (i43 << 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)), 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
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

        /* JADX INFO: renamed from: androidx.compose.material3.TextFieldKt$TextField$3$1 */
        /* JADX INFO: compiled from: TextField.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bӵLc\u000b\u0004I\u0006F\u000b6B\u0005\":ߚ\u0010\u0007\u0015ii?Re`9bU:\u000f\u001azb%Ӯ(qI=\u001c#ԥ&\u000bUQuk"}, d2 = {"\n`]<a@F])\rS", "", "7m]2e\u001b>f(_~^3{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "7me<^,", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001pHJ"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
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
            AnonymousClass1(boolean z11, boolean z12, VisualTransformation visualTransformation2, MutableInteractionSource mutableInteractionSource4, boolean z13, Function2<? super Composer, ? super Integer, Unit> function215, Function2<? super Composer, ? super Integer, Unit> function216, Function2<? super Composer, ? super Integer, Unit> function217, Function2<? super Composer, ? super Integer, Unit> function218, Function2<? super Composer, ? super Integer, Unit> function219, Function2<? super Composer, ? super Integer, Unit> function220, Function2<? super Composer, ? super Integer, Unit> function221, Shape shape3, TextFieldColors textFieldColors2) {
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
                shape = shape3;
                textFieldColors = textFieldColors2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function215, Composer composer3, Integer num) {
                invoke((Function2<? super Composer, ? super Integer, Unit>) function215, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function215, Composer composer3, int i42) {
                int i43 = i42;
                ComposerKt.sourceInformation(composer3, "C411@21680L816:TextField.kt#uh7d8r");
                if ((-1) - (((-1) - i43) | ((-1) - 6)) == 0) {
                    i43 = (-1) - (((-1) - i43) & ((-1) - (composer3.changedInstance(function215) ? 4 : 2)));
                }
                if ((i43 & 19) != 18 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1751957978, i43, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:411)");
                    }
                    TextFieldDefaults.INSTANCE.DecorationBox(textFieldValue.getText(), function215, z, z, visualTransformation, mutableInteractionSource, z, function2, function2, function2, function2, function2, function2, function2, shape, textFieldColors, null, null, composer3, (-1) - (((-1) - (i43 << 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)), 100663296, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }
    }

    public static final void TextFieldLayout(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, boolean z2, float f2, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, PaddingValues paddingValues, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1830307184);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextFieldLayout)P(4,11,2,6,3,12,7,9,8!2,10)455@23228L147,458@23423L7,459@23435L4118:TextField.kt#uh7d8r");
        if ((i2 + 6) - (i2 | 6) == 0) {
            int i7 = composerStartRestartGroup.changed(modifier) ? 4 : 2;
            i4 = (i7 + i2) - (i7 & i2);
        } else {
            i4 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function24) ? 131072 : 65536;
        }
        if ((1572864 + i2) - (1572864 | i2) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function25) ? 1048576 : 524288;
        }
        if ((-1) - (((-1) - 12582912) | ((-1) - i2)) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function26) ? 8388608 : 4194304;
        }
        if ((-1) - (((-1) - 100663296) | ((-1) - i2)) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i2) == 0) {
            int i9 = composerStartRestartGroup.changed(f2) ? 536870912 : 268435456;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerStartRestartGroup.changedInstance(function27) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
            int i10 = composerStartRestartGroup.changedInstance(function28) ? 32 : 16;
            i5 = (i5 + i10) - (i5 & i10);
        }
        if ((-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(paddingValues) ? 256 : 128)));
        }
        if ((-1) - (((-1) - i4) | ((-1) - 306783379)) != 306783378 || (i5 + 147) - (147 | i5) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1830307184, i4, i5, "androidx.compose.material3.TextFieldLayout (TextField.kt:453)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1052646361, "CC(remember):TextField.kt#9igjgp");
            int i11 = (-1) - (((-1) - (((234881024 & i4) == 67108864 ? 1 : 0) | ((1879048192 + i4) - (1879048192 | i4) == 536870912 ? 1 : 0))) & ((-1) - ((-1) - (((-1) - i5) | ((-1) - 896)) == 256 ? 1 : 0)));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i11 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new TextFieldMeasurePolicy(z2, f2, paddingValues);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) objRememberedValue;
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
            Updater.m3678setimpl(composerM3671constructorimpl, textFieldMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1362557328, "C465@23754L11,550@26868L187:TextField.kt#uh7d8r");
            function27.invoke(composerStartRestartGroup, Integer.valueOf((-1) - (((-1) - i5) | ((-1) - 14))));
            composerStartRestartGroup.startReplaceGroup(1341517187);
            ComposerKt.sourceInformation(composerStartRestartGroup, "468@23818L219");
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -948431736, "C472@24010L9:TextField.kt#uh7d8r");
                int i12 = i4 >> 12;
                function23.invoke(composerStartRestartGroup, Integer.valueOf((i12 + 14) - (i12 | 14)));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1341526310);
            ComposerKt.sourceInformation(composerStartRestartGroup, "476@24104L221");
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -948147001, "C480@24297L10:TextField.kt#uh7d8r");
                function24.invoke(composerStartRestartGroup, Integer.valueOf((-1) - (((-1) - (i4 >> 15)) | ((-1) - 14))));
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
            composerStartRestartGroup.startReplaceGroup(1341556924);
            ComposerKt.sourceInformation(composerStartRestartGroup, "501@25056L309");
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -947113399, "C507@25339L8:TextField.kt#uh7d8r");
                function25.invoke(composerStartRestartGroup, Integer.valueOf((-1) - (((-1) - (i4 >> 18)) | ((-1) - 14))));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1341568890);
            ComposerKt.sourceInformation(composerStartRestartGroup, "511@25430L307");
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -946744375, "C517@25711L8:TextField.kt#uh7d8r");
                int i13 = i4 >> 21;
                function26.invoke(composerStartRestartGroup, Integer.valueOf((i13 + 14) - (i13 | 14)));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1341581092);
            ComposerKt.sourceInformation(composerStartRestartGroup, "522@25802L574");
            if (function22 != null) {
                fCalculateStartPadding = fCalculateStartPadding;
                Modifier modifierM1022paddingqDBjuR0$default3 = PaddingKt.m1022paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m1051heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.LabelId), DpKt.m6681lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), f2), 0.0f, 2, null), null, false, 3, null), fCalculateStartPadding, 0.0f, fCalculateEndPadding, 0.0f, 10, null);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1022paddingqDBjuR0$default3);
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -946109526, "C535@26351L7:TextField.kt#uh7d8r");
                function22.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 6) & 14));
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
            Modifier modifierM1022paddingqDBjuR0$default4 = PaddingKt.m1022paddingqDBjuR0$default(modifierWrapContentHeight$default, fCalculateStartPadding, 0.0f, fCalculateEndPadding, 0.0f, 10, null);
            composerStartRestartGroup.startReplaceGroup(1341611627);
            ComposerKt.sourceInformation(composerStartRestartGroup, "548@26778L63");
            if (function3 != null) {
                int i14 = i4 >> 6;
                function3.invoke(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.PlaceholderId).then(modifierM1022paddingqDBjuR0$default4), composerStartRestartGroup, Integer.valueOf((i14 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i14 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)));
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen3 = LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.TextFieldId).then(modifierM1022paddingqDBjuR0$default4);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen3);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -945435834, "C554@27030L11:TextField.kt#uh7d8r");
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 3) & 14));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.startReplaceGroup(1341622624);
            ComposerKt.sourceInformation(composerStartRestartGroup, "559@27167L317");
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -945015195, "C565@27454L12:TextField.kt#uh7d8r");
                int i15 = i5 >> 3;
                function28.invoke(composerStartRestartGroup, Integer.valueOf((i15 + 14) - (i15 | 14)));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextFieldLayout.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$changed1;
                final /* synthetic */ float $animationProgress;
                final /* synthetic */ Function2<Composer, Integer, Unit> $container;
                final /* synthetic */ Function2<Composer, Integer, Unit> $label;
                final /* synthetic */ Function2<Composer, Integer, Unit> $leading;
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
                C06942(Function2<? super Composer, ? super Integer, Unit> function29, Function2<? super Composer, ? super Integer, Unit> function222, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function32, Function2<? super Composer, ? super Integer, Unit> function232, Function2<? super Composer, ? super Integer, Unit> function242, Function2<? super Composer, ? super Integer, Unit> function252, Function2<? super Composer, ? super Integer, Unit> function262, boolean z22, float f22, Function2<? super Composer, ? super Integer, Unit> function272, Function2<? super Composer, ? super Integer, Unit> function282, PaddingValues paddingValues2, int i22, int i32) {
                    super(2);
                    function2 = function29;
                    function2 = function222;
                    function3 = function32;
                    function2 = function232;
                    function2 = function242;
                    function2 = function252;
                    function2 = function262;
                    z = z22;
                    f = f22;
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
                    TextFieldKt.TextFieldLayout(modifier, function2, function2, function3, function2, function2, function2, function2, z, f, function2, function2, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i));
                }
            });
        }
    }

    /* JADX INFO: renamed from: calculateWidth-yeHjK3Y */
    public static final int m2709calculateWidthyeHjK3Y(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2) {
        int i9 = i4 + i5;
        return Math.max(i2 + Math.max(i6 + i9, Math.max(i8 + i9, i7)) + i3, Constraints.m6593getMinWidthimpl(j2));
    }

    /* JADX INFO: renamed from: calculateHeight-mKXJcVc */
    public static final int m2708calculateHeightmKXJcVc(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f2, long j2, float f3, PaddingValues paddingValues) {
        boolean z2 = i3 > 0;
        float fM6638constructorimpl = Dp.m6638constructorimpl(paddingValues.mo971calculateTopPaddingD9Ej5fM() + paddingValues.mo968calculateBottomPaddingD9Ej5fM()) * f3;
        if (z2) {
            fM6638constructorimpl = MathHelpersKt.lerp(Dp.m6638constructorimpl(TextFieldImplKt.getTextFieldPadding() * 2) * f3, fM6638constructorimpl, f2);
        }
        return Math.max(Constraints.m6592getMinHeightimpl(j2), Math.max(i4, Math.max(i5, MathKt.roundToInt(fM6638constructorimpl + MathHelpersKt.lerp(0, i3, f2) + ComparisonsKt.maxOf(i2, i8, i6, i7, MathHelpersKt.lerp(i3, 0, f2))))) + i9);
    }

    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, boolean z2, int i4, int i5, float f2, float f3) {
        int iRoundToInt;
        Placeable.PlacementScope.m5578place70tqf50$default(placementScope, placeable8, IntOffset.Companion.m6776getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i3 - TextFieldImplKt.heightOrZero(placeable9);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            if (z2) {
                iRoundToInt = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), iHeightOrZero);
            } else {
                iRoundToInt = MathKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * f3);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), iRoundToInt - MathKt.roundToInt((iRoundToInt - i4) * f2), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, TextFieldImplKt.widthOrZero(placeable4), i5, 0.0f, 4, null);
        }
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeable4) + TextFieldImplKt.widthOrZero(placeable6);
        int i6 = i5;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, iWidthOrZero, i6, 0.0f, 4, null);
        if (placeable3 != null) {
            i6 = i6;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, iWidthOrZero, i6, 0.0f, 4, null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, (i2 - TextFieldImplKt.widthOrZero(placeable5)) - placeable7.getWidth(), i6, 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i2 - placeable5.getWidth(), Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, iHeightOrZero, 0.0f, 4, null);
        }
    }

    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, boolean z2, float f2, PaddingValues paddingValues) {
        Placeable.PlacementScope.m5578place70tqf50$default(placementScope, placeable7, IntOffset.Companion.m6776getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i3 - TextFieldImplKt.heightOrZero(placeable8);
        int iRoundToInt = MathKt.roundToInt(paddingValues.mo971calculateTopPaddingD9Ej5fM() * f2);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable3), placeWithoutLabel$calculateVerticalPosition(z2, iHeightOrZero, iRoundToInt, placeable5), 0.0f, 4, null);
        }
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeable3) + TextFieldImplKt.widthOrZero(placeable5);
        Placeable.PlacementScope placementScope2 = placementScope;
        Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, iWidthOrZero, placeWithoutLabel$calculateVerticalPosition(z2, iHeightOrZero, iRoundToInt, placeable), 0.0f, 4, null);
        if (placeable2 != null) {
            placementScope2 = placementScope2;
            Placeable.PlacementScope.placeRelative$default(placementScope2, placeable2, iWidthOrZero, placeWithoutLabel$calculateVerticalPosition(z2, iHeightOrZero, iRoundToInt, placeable2), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            placementScope2 = placementScope2;
            Placeable.PlacementScope.placeRelative$default(placementScope2, placeable6, (i2 - TextFieldImplKt.widthOrZero(placeable4)) - placeable6.getWidth(), placeWithoutLabel$calculateVerticalPosition(z2, iHeightOrZero, iRoundToInt, placeable6), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope2, placeable4, i2 - placeable4.getWidth(), Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable8 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope2, placeable8, 0, iHeightOrZero, 0.0f, 4, null);
        }
    }

    private static final int placeWithoutLabel$calculateVerticalPosition(boolean z2, int i2, int i3, Placeable placeable) {
        return z2 ? Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i2) : i3;
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TextFieldKt$drawIndicatorLine$1 */
    /* JADX INFO: compiled from: TextField.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06951 extends Lambda implements Function1<ContentDrawScope, Unit> {
        final /* synthetic */ State<BorderStroke> $indicatorBorder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06951(State<BorderStroke> state) {
            super(1);
            state = state;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
            invoke2(contentDrawScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(ContentDrawScope contentDrawScope) {
            contentDrawScope.drawContent();
            float f2 = contentDrawScope.mo710toPx0680j_4(state.getValue().m599getWidthD9Ej5fM());
            float fM4003getHeightimpl = Size.m4003getHeightimpl(contentDrawScope.mo4734getSizeNHjbRc()) - (f2 / 2);
            DrawScope.m4719drawLine1RTmtNc$default(contentDrawScope, state.getValue().getBrush(), OffsetKt.Offset(0.0f, fM4003getHeightimpl), OffsetKt.Offset(Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc()), fM4003getHeightimpl), f2, 0, null, 0.0f, null, 0, 496, null);
        }
    }

    public static final Modifier drawIndicatorLine(Modifier modifier, State<BorderStroke> state) {
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.TextFieldKt.drawIndicatorLine.1
            final /* synthetic */ State<BorderStroke> $indicatorBorder;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C06951(State<BorderStroke> state2) {
                super(1);
                state = state2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                float f2 = contentDrawScope.mo710toPx0680j_4(state.getValue().m599getWidthD9Ej5fM());
                float fM4003getHeightimpl = Size.m4003getHeightimpl(contentDrawScope.mo4734getSizeNHjbRc()) - (f2 / 2);
                DrawScope.m4719drawLine1RTmtNc$default(contentDrawScope, state.getValue().getBrush(), OffsetKt.Offset(0.0f, fM4003getHeightimpl), OffsetKt.Offset(Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc()), fM4003getHeightimpl), f2, 0, null, 0.0f, null, 0, 496, null);
            }
        });
    }

    public static final float getTextFieldWithLabelVerticalPadding() {
        return TextFieldWithLabelVerticalPadding;
    }
}
