package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d̉=!4i\bDJc|\u0004W\u00068\u000b<G\u0007\"2\u0012\u007f\u0007tjAӄLeV4Zݷ2\u000f\u0002{<řc$\bCC٥\"}8\tWNmhvJp\u000bK\u000f\u001c\u0016\u0001jBI]xs\u0012\u0017˰JoU3UoC>htD#(288\u0002\u0005\u0017\u001a2H\u0016\u000b\u0013ŤJ\u001a\u0017H@\u001f@\u0003\u0011[\f2\u00124FP\u0007$\\uWNH\u001bgj5)\u0003wMf'\u000e<-S\u0013Fb4%v\u0010,[F=5#4k\u00035`\fE\t?\u007fM\u001dhU&[eyWDi\u0018*%-_\r\f\u00066^\u0015Q\u000f\u0012U=յgKV\"߭{z\u0002\"l\u0015\u0014\u00065^F8*h\u0018\u000eaz!jĖT\u0002dV0\noN/0\u00105;9Il\u007fxޅ\u001dN=\u0010K\u0012\u038d\"Чͼ%]Z'n/3ƙv_Li@kN~\u000egD\u0006\u0004\u001fj20\n0U\tG{?8G+=[G09k0Vtm|\u0005nwki\u0001Vp>t\u0016E;!\"jFt\u0005\u001acdZ<\u0011{\"\u0003\u0019ą\f\u0013&pʟ@!+%~`nixcu\u001551v7\bt\u001a%Ć=^9I\u0002r\u001eyj\u0002$ALb3^\u0015Yΐ\u0010Zb<h7̄iݘȑ\u007fFT(!OWڿ\u001bBJI\u0019\u000b\u001bx\u0007,IY|7g\u000bn\u0016~b<<\u0003\u0018.%\u000f\u0007Pj}\bg'W\\\u0003f\";Pi5G4\u0006(n4\u000b3\u001f~\"~w\u0014RGZ}.\u001ce\u00130+*;a/k3=\u001eȞ6\f3f\\xks]\u0014-\u0001#\u001d\u001f=x.\u0016\u000e\u0019\u0003ݽdjPc\u0005((vl\t;\u0013t\u0002\nat\u0001uzӝ\u000f[D]#\u0012gTfC\r\u0007/\u001eS\u0007\u001e9Ŀ9-I;c\u001bÈ\u0013٬ֵe_o\u0014<\u001fzώ%\u0003\f\u001c,\u0012\u001c f_dJ;fQ\n\u0003L+<l1Lxn\u0006\u0015Z\tb\u001bcLOs\tVf[;3\fv\u001f,;o\u0007_H\u001e\b}b:\u0010D\u0002T\u0016*nE5\u0011{fwo}K\u000b\u0011x!ϻ\u000f{7\u0003݁ =&k\bq\u0017F\u001e~(8Q;\u0011\u000bj Ӻ8,B\u001c;Rb\u0002\u001e\u001b\u000b\u0002V_=\u001d`YǠ?V\u0014h?]ȀGγޝIb'Q\u000f''ʝ\u001d\u0007^I\u0005\u001cL\u00053q9\u0019SK\u0011K\u0015]\u0010~K;[dN+*h\u00019e\fb͕\u0006@\nh9sq\u0012\u001c:\u001e\u0003Ce(\u001dIQ?e%BͿ\u000fUjb\u0015|\u0018f`W:)-\u0005-\u0014B\n\u001d\u00181O!}\u00133RN\u0006F[\u001a/%t/\r\f\u000bs^\u001b[\u0005e>CIx*?\u0007gUK}6&N>ؗx!bk>u\u0018u3E&s&b0\u000fAgܣ\b.P\t#\u000e<\u0013NO0?H\u0014ɾXŕ֏%B-Uz1Zƃg\u00076{l\u0012t\u0006\u000f\u0011mIV(v]V#\t5VF\u0013\u0007dj\u0017Y f\u001c\u0018\u0014C2O<\u000eb7\u001dgc\u0017~\u001cUa\r9>\u0004*\u0010?`X$}-\n\u000e\u0004XSX1AV[O|\u001flnRW<qz*tt:/B\u000f۫L^\u0017'̭Jr$y_H\u001f\u001fi#_k\u0017\u0006UIT'_i̫\u001f78\u001f 7\u0005)\u001bErv\u0010*p\u000f!\u0017\u05ff0-Lh\u0004\u001fǔXݾމh\u0005,xSRZ\u074b+\u001f<)/\t>PBj!4;\u007f;q\u001f\u0017\u0001#A\u001eo5#epWS37\u0019|/\u001bo\u007f7kH\u0003OrQ=?\f!WtL=KuN7\f0xZ\u0001]c\u0005\u0015\u0010>ޜ9E$\u000eߝD\u007f\u00104T5\fu1\u0016]<X,o\\n\\\"nǋ**<\u0003t2U\u0005\u0011~\u001a.y\u0018\"j\nxƍEz\u001a-\u000bCљ,ìخIOn)\u0019a%ӆ\u0013E?\u001e)a\u001d-\u0014]xX+wz}5b]J\u001c\f\u0004h<\u0012<\u007fGNfB\u0006[ \u0005ipj{`w\u0010f =9\nw?cx&p4(<[xV6\u000b\u0019{`Ƕ\u000fJ\u0015En4H.\u001b\b\u001c4n:\u0012\u007fZ`C\u0019aYضEG\u0018j,2#\u0011i;\u001e0wlW?\u0004w\u0007Tٝ7\u000bs^\tDst\u001d`1Mt+C\u0006\u0019BʜKVD.p]Ȓ\rȊŜL\u0012J*RE\u0006\u001d>bh~\tI\u000e\u0005*(UUCo/6pDsd?9g[|am#[\u00072\u001d\u001eR1)\u001b c9`6\u0004\u000fA>*\u000e\u000b[ʳ\u0001mO$ØeJ'D6N=WcwfgO\u0019\u0006E-#ԯ+$\f'Tqu+\u0002\u00192a\u0013Ld\\W_ä]\u0011lV1\u0010¿sޛ˻\u0010:[9K:)_*jS_n2^t\u0017Pgj*4\u0016st\u0002qMs9&\u001dL@\n\u0011\u0012]\u0010>|bt~N.g;P\u0015\u0012\u001aKF\u0010\u001bž-:\u001dvssp\u0016db\u0017_Z\u000f@f\nr\u0015jlu\u07ba@Hr-\u0017^\f1iOr\u000bppvG>y܍0'<\\\u001b(\u000f\u0019cl'\u0016GD%)\u0016J؞&a(g$&ьIԑ¤nc}K\n\u0012SD\u001bѥD|C\u0004\u0015\u070ftûp\u0007U0\u0012kODT[X\"=\\7m\u0017\u000bX\u0010bϡ\u0007؞rSZރ\u00161\u0001h\u0017).\u001cQWgFO\u0015Yƈ>Σ6M`ײяXa-1\u0002ނ;@Aܖ9$"}, d2 = {"!ba<_3:P ~iZ)i\u0013AM\u00041\u007fH\u0011\u001f\u0006Cl\u007f@u48", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "!ba<_3:P ~iZ)i\u0013AS}5\u0006G\b\u0005\"Gm", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "", "\"`Q\u001fb>\"\\\u0018\u0003xZ;\u0007\u0016\u001dp\u007f&", "\u001eqX:T9RA\u0017\f\u0005e3x\u00066en$x-\u000b)", "", "Ad[2V;>R\bzwB5{\tB", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "Aba<_3,b\u0015\u000ez", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00133f\b'>[%*\\C\u0011", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n]AX5M1#\u0006\u0005k", "3cV2C(=R\u001d\b|", "7mS6V(M]&", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e!2=\u0007\u001f;k\u0012=WP)i>)\u0015>", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "2he6W,K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "B`Q@", "\u001eqX:T9RA\u0017\f\u0005e3x\u00066en$x-\u000b)^Srn\u0019a7\u0004", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/d\u001c@l#8QBN52(\u001dskG\u0007--X\u00070FH]0f[<+\u0012\u001fd\u0015U\u0019\u001c\u0001hAyS)\u0018\u0006\u000e6X\t?qJ\u0011'\u0016~k\u0001KT\u001fK\u0004\u001e\u0004\u000b\nxOWn}QJ\u00138\u0011j\u0016n$`C\u0004)%yb\u001cxY,\u0019\u007f]\u001a\u0001\u001cZwpE(~B-\u000bCBLO~\\@}p$\\\u0004A\u0013Bar:x7\rBs\u0017t\u000eIv\u001cHgEj\u0013XJ&3@@\u0012R\u0015a\u007ftI\u0018v\u001f+\u0015\u001ekD5!e/AR\u0017\u0012g%[B7CdzC", "\u001eqX:T9RB\u0015{gh>", "\u001eqX:T9RB\u0015{gh>D\u0014\u000bZ\nxWF", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/b\u0005\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b(c51\u0017\u0014`E-8IH'Q-Y\u000b9w\u0005\u0016\u001f\u001c~K\u0001KT\u001fK\u0004\u001eB\u0017\u0010nPhf}P\u000bJs2.\ro&ZI>.\u001d\u007fb{xY,\u0019\u007f]\u001a?(`cpF&\u0005<#Q7YPMz_Jtp,[\u0005\u0007\u0016:X>\t~5\u000f>86qZ/K[/", "!ba<_3:P ~iZ)i\u0013A", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e!2D\b.;|\u001a8V\u0019", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "B`Q\u001db:Bb\u001d\t\u0004l", "!ba<_3:P ~iZ)i\u0013A-\u000e\u000e|,\u0003ar", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/b\u0005\u0018T\u001c8\\J?t}#&p+:\u0017l*]z1PZ\u0018\rl[pL\u0018\u001cc[$\u0012\u0013\u000fhH(w\u000e<0\u0010uJ\u0012Df\u0010\u0010 \u0017C4QR_\u000eV}\u001f~\u000e~OLcn\u0001KJ\u000fg;lU`-e8I(\u001ez'dI`7\b\u000bW\u001b{\u001fONcP\u0018\bB(=\u0001%DOw`F\u0003'hX\f\u0001!6`ttR7\f?4Dd\u0012!K{\u0002O", "!ba<_3:P ~iZ)i\u0013AI\b3\u0003", "!ba<_3:P ~iZ)i\u0013AI\b3\u0003\b\u000f|\u00183qX\u0018", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/b\u0005\u0018T\u00127LPEo31^fkA\u0012m:N@(Q\\W+XavG\u001d[H\f[5\u0014\fGP }D\r\u0006\u000e6X\t?qJ\u0011'\u0016~k\u0001KT\u001fK\u0004\u001e\u0004\u000b\nxOWn}QJ\u00138\u0011j\u0016n$`C\u0004)%yb\u001cxY,\u0019\u007f]\u001a\u0001\u001cZwpE(~B-\u000bCBLO~\\@}p$\\\u0004A\u0013Bar:x7\rBs\u0017t\u000eIv\u001cHgEj\u0013XJ&3@@\u0012R\u0015a\u007ftI\u0018v\u001f+\u0015\u001ekD5!e/AR\u0017\u0012g%[B7CD(", "!ba<_3:P ~iZ)i\u0013AW\u00047~.\u0011\u0014\u0015Qw\u0019F\u0005%\u0019a\t'", "!ba<_3:P ~iZ)i\u0013AW\u00047~.\u0011\u0014\u0015Qw\u0019F\u0005%\u0019a\t'~y\u0019\u000f*.M:", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bKu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!g?r/\u0012\u0013\u000fhH(w\u000e<0\u0010uJ\u0012Df\u0010\u0010 \u0017C4QR_\u000eV}\u001f~\u000e~OLcn\u0001KJ\u000fg;lU`-e8I(\u001ez'dI`7\b\u000bW\u001b{\u001fONcP\u0018\bB(=\u0001%DOw`F\u0003'hL\u0006\b\u001b1T\u0004/~6M\"(Cn\fRU':mxj\u0013XJ&3@@\u0012R\u0015a\u007ftI\u0018v\u001f+\u0015\u001ekD5!e/AR\u0017\u0012g%[B7CdzC", "!dR<a+:`-lxk6\u0004\u0010+b\u0007(j<}\u0004!Y", "!dR<a+:`-lxk6\u0004\u0010+b\u0007(j<}\u0004!Y7\u001a?W\u0002 kL", "!dR<a+:`-mv[\u0019\u0007\u001b", "!dR<a+:`-mv[\u0019\u0007\u001bvp[\u001d\u0006\u0011\\\u001d", "\"`Q\u001fb>", "\"`Q\u001fb>\u0006^ts\u0005/\b\u0003", "\"`Q\u001fb>\"[$\u0006", "\"`Q\u001fb>\"[$\u0006B=\u001bz\n@L\u0006", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b>b\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d_0tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003aK(/rU`c\u0003\u0011FVjse\u001ch\u001bk>D-\";y+qN=\u000e\u0006\\]H9upfT#~77\bkeNPyc<>4/T\u000b{\u001a2\"R5|8\u000eB*C:h\u000fX", "\"`Q\u001fb>0W(\u0002hn)z\u00137p\n6{$\t\"\u001e", "\"`Q\u001fb>0W(\u0002hn)z\u00137p\n6{$\t\"\u001e\u000fN|:w6\u001c_", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = Dp.m6638constructorimpl(90);
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final AnimationSpec<Dp> TabRowIndicatorSpec = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX INFO: renamed from: PrimaryTabRow-pAZo6Ak */
    public static final void m2610PrimaryTabRowpAZo6Ak(final int i2, Modifier modifier, long j2, long j3, Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier.Companion companion = modifier;
        Function2<? super Composer, ? super Integer, Unit> function2M2000getLambda1$material3_release = function2;
        long primaryContentColor = j3;
        ComposableLambda composableLambdaRememberComposableLambda = function3;
        long primaryContainerColor = j2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1884787284);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PrimaryTabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)155@7603L21,156@7667L19,157@7746L189,166@8053L76:TabRow.kt#uh7d8r");
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i5 = (i3 + 6) - (i3 & 6);
        } else if ((i3 + 6) - (i3 | 6) == 0) {
            int i6 = composerStartRestartGroup.changed(i2) ? 4 : 2;
            i5 = (i6 + i3) - (i6 & i3);
        } else {
            i5 = i3;
        }
        int i7 = (i4 + 2) - (i4 | 2);
        if (i7 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 |= ((i4 + 4) - (i4 | 4) == 0 && composerStartRestartGroup.changed(primaryContainerColor)) ? 256 : 128;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((-1) - (((-1) - i4) | ((-1) - 8)) == 0 && composerStartRestartGroup.changed(primaryContentColor)) ? 2048 : 1024)));
        }
        int i8 = (-1) - (((-1) - i4) | ((-1) - 16));
        if (i8 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 24576));
        } else if ((i3 & 24576) == 0) {
            int i9 = composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda) ? 16384 : 8192;
            i5 = (i5 + i9) - (i5 & i9);
        }
        int i10 = (-1) - (((-1) - i4) | ((-1) - 32));
        if (i10 != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i3) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function2M2000getLambda1$material3_release) ? 131072 : 65536)));
        }
        if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
            i5 |= 1572864;
        } else if ((i3 + 1572864) - (i3 | 1572864) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288)));
        }
        if ((i5 + 599187) - (599187 | i5) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i4 + 4) - (i4 | 4) != 0) {
                    primaryContainerColor = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composerStartRestartGroup, 6);
                    i5 = (i5 - 897) - (i5 | (-897));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
                    primaryContentColor = TabRowDefaults.INSTANCE.getPrimaryContentColor(composerStartRestartGroup, 6);
                    i5 &= -7169;
                }
                if (i8 != 0) {
                    composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-2021049253, true, new Function3<TabIndicatorScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$PrimaryTabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(TabIndicatorScope tabIndicatorScope, Composer composer2, Integer num) {
                            invoke(tabIndicatorScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(TabIndicatorScope tabIndicatorScope, Composer composer2, int i11) {
                            int i12;
                            ComposerKt.sourceInformation(composer2, "C158@7771L158:TabRow.kt#uh7d8r");
                            if ((-1) - (((-1) - i11) | ((-1) - 6)) == 0) {
                                int i13 = (i11 & 8) == 0 ? composer2.changed(tabIndicatorScope) : composer2.changedInstance(tabIndicatorScope) ? 4 : 2;
                                i12 = (i13 + i11) - (i13 & i11);
                            } else {
                                i12 = i11;
                            }
                            if ((i12 & 19) != 18 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2021049253, i12, -1, "androidx.compose.material3.PrimaryTabRow.<anonymous> (TabRow.kt:158)");
                                }
                                TabRowDefaults.INSTANCE.m2605PrimaryIndicator10LGxhE(tabIndicatorScope.tabIndicatorOffset(Modifier.Companion, i2, true), Dp.Companion.m6658getUnspecifiedD9Ej5fM(), 0.0f, 0L, null, composer2, 196656, 28);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54);
                }
                if (i10 != 0) {
                    function2M2000getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m2000getLambda1$material3_release();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 & 4) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-897)));
                }
                if ((i4 & 8) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-7169)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1884787284, i5, -1, "androidx.compose.material3.PrimaryTabRow (TabRow.kt:165)");
            }
            int i11 = i5 >> 3;
            m2617TabRowImplDTcfvLk(companion, primaryContainerColor, primaryContentColor, composableLambdaRememberComposableLambda, function2M2000getLambda1$material3_release, function22, composerStartRestartGroup, (i11 + 524286) - (i11 | 524286));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function2<? super Composer, ? super Integer, Unit> function23 = function2M2000getLambda1$material3_release;
            final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function32 = composableLambdaRememberComposableLambda;
            final long j4 = primaryContentColor;
            final long j5 = primaryContainerColor;
            final Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$PrimaryTabRow$2
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

                public final void invoke(Composer composer2, int i12) {
                    int i13 = i2;
                    Modifier modifier3 = modifier2;
                    long j6 = j5;
                    long j7 = j4;
                    Function3<TabIndicatorScope, Composer, Integer, Unit> function33 = function32;
                    Function2<Composer, Integer, Unit> function24 = function23;
                    Function2<Composer, Integer, Unit> function25 = function22;
                    int i14 = i3;
                    TabRowKt.m2610PrimaryTabRowpAZo6Ak(i13, modifier3, j6, j7, function33, function24, function25, composer2, RecomposeScopeImplKt.updateChangedFlags((i14 + 1) - (i14 & 1)), i4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: SecondaryTabRow-pAZo6Ak */
    public static final void m2615SecondaryTabRowpAZo6Ak(final int i2, Modifier modifier, long j2, long j3, Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i3, final int i4) {
        int i5;
        long secondaryContainerColor = j2;
        Function2<? super Composer, ? super Integer, Unit> function2M2001getLambda2$material3_release = function2;
        long secondaryContentColor = j3;
        ComposableLambda composableLambdaRememberComposableLambda = function3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1909540706);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SecondaryTabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)209@10549L23,210@10615L21,212@10716L160,220@10994L76:TabRow.kt#uh7d8r");
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i5 = (i3 + 6) - (i3 & 6);
        } else if ((i3 & 6) == 0) {
            i5 = (-1) - (((-1) - (composerStartRestartGroup.changed(i2) ? 4 : 2)) & ((-1) - i3));
        } else {
            i5 = i3;
        }
        int i6 = (-1) - (((-1) - i4) | ((-1) - 2));
        if (i6 != 0) {
            i5 = (i5 + 48) - (i5 & 48);
        } else if ((i3 + 48) - (i3 | 48) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 |= ((i4 & 4) == 0 && composerStartRestartGroup.changed(secondaryContainerColor)) ? 256 : 128;
        }
        if ((i3 + 3072) - (i3 | 3072) == 0) {
            i5 |= ((i4 + 8) - (i4 | 8) == 0 && composerStartRestartGroup.changed(secondaryContentColor)) ? 2048 : 1024;
        }
        int i7 = (i4 + 16) - (i4 | 16);
        if (i7 != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda) ? 16384 : 8192;
            i5 = (i5 + i8) - (i5 & i8);
        }
        int i9 = (i4 + 32) - (i4 | 32);
        if (i9 != 0) {
            i5 = (i5 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((196608 & i3) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function2M2001getLambda2$material3_release) ? 131072 : 65536;
        }
        if ((i4 & 64) != 0) {
            i5 |= 1572864;
        } else if ((-1) - (((-1) - i3) | ((-1) - 1572864)) == 0) {
            int i10 = composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
            i5 = (i5 + i10) - (i5 & i10);
        }
        if ((i5 & 599187) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i3) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i4 + 4) - (i4 | 4) != 0) {
                    secondaryContainerColor = TabRowDefaults.INSTANCE.getSecondaryContainerColor(composerStartRestartGroup, 6);
                    i5 = (i5 - 897) - (i5 | (-897));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
                    secondaryContentColor = TabRowDefaults.INSTANCE.getSecondaryContentColor(composerStartRestartGroup, 6);
                    i5 &= -7169;
                }
                if (i7 != 0) {
                    composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(286693261, true, new Function3<TabIndicatorScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$SecondaryTabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(TabIndicatorScope tabIndicatorScope, Composer composer2, Integer num) {
                            invoke(tabIndicatorScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(TabIndicatorScope tabIndicatorScope, Composer composer2, int i11) {
                            ComposerKt.sourceInformation(composer2, "C213@10745L121:TabRow.kt#uh7d8r");
                            if ((i11 + 6) - (6 | i11) == 0) {
                                int i12 = (i11 + 8) - (8 | i11) == 0 ? composer2.changed(tabIndicatorScope) : composer2.changedInstance(tabIndicatorScope) ? 4 : 2;
                                i11 = (i11 + i12) - (i11 & i12);
                            }
                            if ((i11 & 19) != 18 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(286693261, i11, -1, "androidx.compose.material3.SecondaryTabRow.<anonymous> (TabRow.kt:213)");
                                }
                                TabRowDefaults.INSTANCE.m2606SecondaryIndicator9IZ8Weo(tabIndicatorScope.tabIndicatorOffset(Modifier.Companion, i2, false), 0.0f, 0L, composer2, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54);
                }
                if (i9 != 0) {
                    function2M2001getLambda2$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m2001getLambda2$material3_release();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 + 4) - (i4 | 4) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-897)));
                }
                if ((i4 + 8) - (i4 | 8) != 0) {
                    i5 &= -7169;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1909540706, i5, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:219)");
            }
            int i11 = i5 >> 3;
            m2617TabRowImplDTcfvLk(companion, secondaryContainerColor, secondaryContentColor, composableLambdaRememberComposableLambda, function2M2001getLambda2$material3_release, function22, composerStartRestartGroup, (i11 + 524286) - (i11 | 524286));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function2<? super Composer, ? super Integer, Unit> function23 = function2M2001getLambda2$material3_release;
            final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function32 = composableLambdaRememberComposableLambda;
            final long j4 = secondaryContentColor;
            final long j5 = secondaryContainerColor;
            final Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$SecondaryTabRow$2
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

                public final void invoke(Composer composer2, int i12) {
                    TabRowKt.m2615SecondaryTabRowpAZo6Ak(i2, modifier2, j5, j4, function32, function23, function22, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i3) & ((-1) - 1))), i4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: TabRow-pAZo6Ak */
    public static final void m2616TabRowpAZo6Ak(final int i2, Modifier modifier, long j2, long j3, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i3, final int i4) {
        int i5;
        ComposableLambda composableLambdaRememberComposableLambda = function3;
        long primaryContentColor = j3;
        Function2<? super Composer, ? super Integer, Unit> function2M2002getLambda3$material3_release = function2;
        long primaryContainerColor = j2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1199178586);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)303@15331L21,304@15395L19,306@15507L246,316@15871L90:TabRow.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = (i3 + 6) - (i3 & 6);
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            i5 = (composerStartRestartGroup.changed(i2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i6 = i4 & 2;
        if (i6 != 0) {
            i5 = (i5 + 48) - (i5 & 48);
        } else if ((i3 + 48) - (i3 | 48) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 |= ((i4 & 4) == 0 && composerStartRestartGroup.changed(primaryContainerColor)) ? 256 : 128;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            i5 |= ((-1) - (((-1) - i4) | ((-1) - 8)) == 0 && composerStartRestartGroup.changed(primaryContentColor)) ? 2048 : 1024;
        }
        int i7 = (i4 + 16) - (i4 | 16);
        if (i7 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 24576));
        } else if ((-1) - (((-1) - i3) | ((-1) - 24576)) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda) ? 16384 : 8192;
        }
        int i8 = (-1) - (((-1) - i4) | ((-1) - 32));
        if (i8 != 0) {
            i5 = (i5 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((196608 & i3) == 0) {
            int i9 = composerStartRestartGroup.changedInstance(function2M2002getLambda3$material3_release) ? 131072 : 65536;
            i5 = (i5 + i9) - (i5 & i9);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
            i5 = (i5 + 1572864) - (i5 & 1572864);
        } else if ((i3 & 1572864) == 0) {
            int i10 = composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
            i5 = (i5 + i10) - (i5 & i10);
        }
        if ((i5 + 599187) - (599187 | i5) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i3 + 1) - (i3 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i4 + 4) - (i4 | 4) != 0) {
                    primaryContainerColor = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composerStartRestartGroup, 6);
                    i5 = (i5 - 897) - (i5 | (-897));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
                    primaryContentColor = TabRowDefaults.INSTANCE.getPrimaryContentColor(composerStartRestartGroup, 6);
                    i5 = (i5 - 7169) - (i5 | (-7169));
                }
                if (i7 != 0) {
                    composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-2052073983, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                            invoke((List<TabPosition>) list, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(List<TabPosition> list, Composer composer2, int i11) {
                            ComposerKt.sourceInformation(composer2, "C308@15612L117:TabRow.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2052073983, i11, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:307)");
                            }
                            if (i2 < list.size()) {
                                TabRowDefaults.INSTANCE.m2606SecondaryIndicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.Companion, list.get(i2)), 0.0f, 0L, composer2, 3072, 6);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                }
                if (i8 != 0) {
                    function2M2002getLambda3$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m2002getLambda3$material3_release();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
                    i5 &= -897;
                }
                if ((i4 + 8) - (i4 | 8) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-7169)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1199178586, i5, -1, "androidx.compose.material3.TabRow (TabRow.kt:315)");
            }
            int i11 = i5 >> 3;
            m2618TabRowWithSubcomposeImplDTcfvLk(companion, primaryContainerColor, primaryContentColor, composableLambdaRememberComposableLambda, function2M2002getLambda3$material3_release, function22, composerStartRestartGroup, (i11 + 524286) - (i11 | 524286));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function2<? super Composer, ? super Integer, Unit> function23 = function2M2002getLambda3$material3_release;
            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32 = composableLambdaRememberComposableLambda;
            final long j4 = primaryContentColor;
            final long j5 = primaryContainerColor;
            final Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
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

                public final void invoke(Composer composer2, int i12) {
                    TabRowKt.m2616TabRowpAZo6Ak(i2, modifier2, j5, j4, function32, function23, function22, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i3) & ((-1) - 1))), i4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: PrimaryScrollableTabRow-qhFBPw4 */
    public static final void m2609PrimaryScrollableTabRowqhFBPw4(final int i2, Modifier modifier, ScrollState scrollState, long j2, long j3, float f2, Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i3, final int i4) {
        int i5;
        Composer composer2;
        Function2<? super Composer, ? super Integer, Unit> function2M2003getLambda4$material3_release = function2;
        ComposableLambda composableLambdaRememberComposableLambda = function3;
        long primaryContentColor = j3;
        long primaryContainerColor = j2;
        float fM2607getScrollableTabRowEdgeStartPaddingD9Ej5fM = f2;
        ScrollState scrollStateRememberScrollState = scrollState;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1763241113);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PrimaryScrollableTabRow)P(7,5,6,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)358@18337L21,359@18403L21,360@18467L19,363@18637L198,372@18953L328:TabRow.kt#uh7d8r");
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i5 = (i3 + 6) - (i3 & 6);
        } else if ((i3 & 6) == 0) {
            int i6 = composerStartRestartGroup.changed(i2) ? 4 : 2;
            i5 = (i6 + i3) - (i6 & i3);
        } else {
            i5 = i3;
        }
        int i7 = (-1) - (((-1) - i4) | ((-1) - 2));
        if (i7 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            int i8 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i5 = (i5 + i8) - (i5 & i8);
        }
        if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i9 = ((-1) - (((-1) - i4) | ((-1) - 4)) == 0 && composerStartRestartGroup.changed(scrollStateRememberScrollState)) ? 256 : 128;
            i5 = (i5 + i9) - (i5 & i9);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            i5 |= ((i4 + 8) - (i4 | 8) == 0 && composerStartRestartGroup.changed(primaryContainerColor)) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 & 16) == 0 && composerStartRestartGroup.changed(primaryContentColor)) ? 16384 : 8192)));
        }
        int i10 = (i4 + 32) - (i4 | 32);
        if (i10 != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i3) - (196608 | i3) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(fM2607getScrollableTabRowEdgeStartPaddingD9Ej5fM) ? 131072 : 65536)));
        }
        int i11 = (-1) - (((-1) - i4) | ((-1) - 64));
        if (i11 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 1572864));
        } else if ((-1) - (((-1) - i3) | ((-1) - 1572864)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda) ? 1048576 : 524288)));
        }
        int i12 = (i4 + 128) - (i4 | 128);
        if (i12 != 0) {
            i5 = (i5 + 12582912) - (i5 & 12582912);
        } else if ((i3 + 12582912) - (i3 | 12582912) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function2M2003getLambda4$material3_release) ? 8388608 : 4194304)));
        }
        if ((i4 + 256) - (i4 | 256) != 0) {
            i5 |= 100663296;
        } else if ((i3 & 100663296) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((i5 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i3 + 1) - (i3 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i4 + 4) - (i4 | 4) != 0) {
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    i5 = (i5 - 897) - (i5 | (-897));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
                    primaryContainerColor = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composerStartRestartGroup, 6);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-7169)));
                }
                if ((i4 + 16) - (i4 | 16) != 0) {
                    primaryContentColor = TabRowDefaults.INSTANCE.getPrimaryContentColor(composerStartRestartGroup, 6);
                    i5 &= -57345;
                }
                if (i10 != 0) {
                    fM2607getScrollableTabRowEdgeStartPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m2607getScrollableTabRowEdgeStartPaddingD9Ej5fM();
                }
                if (i11 != 0) {
                    composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1601820568, true, new Function3<TabIndicatorScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$PrimaryScrollableTabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(TabIndicatorScope tabIndicatorScope, Composer composer3, Integer num) {
                            invoke(tabIndicatorScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(TabIndicatorScope tabIndicatorScope, Composer composer3, int i13) {
                            int i14 = i13;
                            ComposerKt.sourceInformation(composer3, "C364@18666L159:TabRow.kt#uh7d8r");
                            if ((-1) - (((-1) - i14) | ((-1) - 6)) == 0) {
                                i14 = (-1) - (((-1) - ((i14 + 8) - (8 | i14) == 0 ? composer3.changed(tabIndicatorScope) : composer3.changedInstance(tabIndicatorScope) ? 4 : 2)) & ((-1) - i14));
                            }
                            if ((-1) - (((-1) - i14) | ((-1) - 19)) != 18 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1601820568, i14, -1, "androidx.compose.material3.PrimaryScrollableTabRow.<anonymous> (TabRow.kt:364)");
                                }
                                TabRowDefaults.INSTANCE.m2605PrimaryIndicator10LGxhE(tabIndicatorScope.tabIndicatorOffset(Modifier.Companion, i2, true), Dp.Companion.m6658getUnspecifiedD9Ej5fM(), 0.0f, 0L, null, composer3, 196656, 28);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54);
                }
                if (i12 != 0) {
                    function2M2003getLambda4$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m2003getLambda4$material3_release();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 + 4) - (i4 | 4) != 0) {
                    i5 &= -897;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
                    i5 &= -7169;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 16)) != 0) {
                    i5 &= -57345;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1763241113, i5, -1, "androidx.compose.material3.PrimaryScrollableTabRow (TabRow.kt:371)");
            }
            int i13 = (i5 + 126) - (126 | i5);
            int i14 = i5 >> 3;
            int i15 = (-1) - (((-1) - i14) | ((-1) - 896));
            int i16 = i5 << 9;
            composer2 = composerStartRestartGroup;
            m2612ScrollableTabRowImplsKfQg0A(i2, companion, primaryContainerColor, primaryContentColor, fM2607getScrollableTabRowEdgeStartPaddingD9Ej5fM, scrollStateRememberScrollState, composableLambdaRememberComposableLambda, function2M2003getLambda4$material3_release, function22, composerStartRestartGroup, (-1) - (((-1) - ((((((-1) - (((-1) - ((i13 + i15) - (i13 & i15))) & ((-1) - ((-1) - (((-1) - i14) | ((-1) - 7168)))))) | (i14 & 57344)) | ((i16 + 458752) - (i16 | 458752))) | ((-1) - (((-1) - 3670016) | ((-1) - i5)))) | ((29360128 + i5) - (29360128 | i5)))) & ((-1) - ((i5 + 234881024) - (i5 | 234881024)))));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final float f3 = fM2607getScrollableTabRowEdgeStartPaddingD9Ej5fM;
            final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function32 = composableLambdaRememberComposableLambda;
            final Function2<? super Composer, ? super Integer, Unit> function23 = function2M2003getLambda4$material3_release;
            final ScrollState scrollState2 = scrollStateRememberScrollState;
            final long j4 = primaryContainerColor;
            final long j5 = primaryContentColor;
            final Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$PrimaryScrollableTabRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i17) {
                    TabRowKt.m2609PrimaryScrollableTabRowqhFBPw4(i2, modifier2, scrollState2, j4, j5, f3, function32, function23, function22, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: SecondaryScrollableTabRow-qhFBPw4 */
    public static final void m2614SecondaryScrollableTabRowqhFBPw4(final int i2, Modifier modifier, ScrollState scrollState, long j2, long j3, float f2, Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i3, final int i4) {
        int i5;
        Composer composer2;
        Function2<? super Composer, ? super Integer, Unit> function2M2004getLambda5$material3_release = function2;
        ComposableLambda composableLambdaRememberComposableLambda = function3;
        long secondaryContentColor = j3;
        long secondaryContainerColor = j2;
        float fM2607getScrollableTabRowEdgeStartPaddingD9Ej5fM = f2;
        ScrollState scrollStateRememberScrollState = scrollState;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1821940917);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SecondaryScrollableTabRow)P(7,5,6,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)428@21932L21,429@21998L23,430@22064L21,433@22236L160,441@22514L327:TabRow.kt#uh7d8r");
        if ((i4 + 1) - (i4 | 1) != 0) {
            i5 = (-1) - (((-1) - i3) & ((-1) - 6));
        } else if ((i3 + 6) - (i3 | 6) == 0) {
            int i6 = composerStartRestartGroup.changed(i2) ? 4 : 2;
            i5 = (i6 + i3) - (i6 & i3);
        } else {
            i5 = i3;
        }
        int i7 = (i4 + 2) - (i4 | 2);
        if (i7 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 48));
        } else if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
            int i8 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i5 = (i5 + i8) - (i5 & i8);
        }
        if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 & 4) == 0 && composerStartRestartGroup.changed(scrollStateRememberScrollState)) ? 256 : 128)));
        }
        if ((i3 & 3072) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((-1) - (((-1) - i4) | ((-1) - 8)) == 0 && composerStartRestartGroup.changed(secondaryContainerColor)) ? 2048 : 1024)));
        }
        if ((i3 & 24576) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((-1) - (((-1) - i4) | ((-1) - 16)) == 0 && composerStartRestartGroup.changed(secondaryContentColor)) ? 16384 : 8192)));
        }
        int i9 = (i4 + 32) - (i4 | 32);
        if (i9 != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i3)) == 0) {
            int i10 = composerStartRestartGroup.changed(fM2607getScrollableTabRowEdgeStartPaddingD9Ej5fM) ? 131072 : 65536;
            i5 = (i5 + i10) - (i5 & i10);
        }
        int i11 = (-1) - (((-1) - i4) | ((-1) - 64));
        if (i11 != 0) {
            i5 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            int i12 = composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda) ? 1048576 : 524288;
            i5 = (i5 + i12) - (i5 & i12);
        }
        int i13 = (-1) - (((-1) - i4) | ((-1) - 128));
        if (i13 != 0) {
            i5 |= 12582912;
        } else if ((i3 & 12582912) == 0) {
            int i14 = composerStartRestartGroup.changedInstance(function2M2004getLambda5$material3_release) ? 8388608 : 4194304;
            i5 = (i5 + i14) - (i5 & i14);
        }
        if ((i4 & 256) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 100663296));
        } else if ((i3 + 100663296) - (i3 | 100663296) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 38347923)) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i3) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i4 + 4) - (i4 | 4) != 0) {
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-897)));
                }
                if ((i4 + 8) - (i4 | 8) != 0) {
                    secondaryContainerColor = TabRowDefaults.INSTANCE.getSecondaryContainerColor(composerStartRestartGroup, 6);
                    i5 &= -7169;
                }
                if ((i4 & 16) != 0) {
                    secondaryContentColor = TabRowDefaults.INSTANCE.getSecondaryContentColor(composerStartRestartGroup, 6);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-57345)));
                }
                if (i9 != 0) {
                    fM2607getScrollableTabRowEdgeStartPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m2607getScrollableTabRowEdgeStartPaddingD9Ej5fM();
                }
                if (i11 != 0) {
                    composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1535842470, true, new Function3<TabIndicatorScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$SecondaryScrollableTabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(TabIndicatorScope tabIndicatorScope, Composer composer3, Integer num) {
                            invoke(tabIndicatorScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(TabIndicatorScope tabIndicatorScope, Composer composer3, int i15) {
                            ComposerKt.sourceInformation(composer3, "C434@22265L121:TabRow.kt#uh7d8r");
                            if ((-1) - (((-1) - i15) | ((-1) - 6)) == 0) {
                                i15 |= (-1) - (((-1) - i15) | ((-1) - 8)) == 0 ? composer3.changed(tabIndicatorScope) : composer3.changedInstance(tabIndicatorScope) ? 4 : 2;
                            }
                            if ((-1) - (((-1) - i15) | ((-1) - 19)) != 18 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1535842470, i15, -1, "androidx.compose.material3.SecondaryScrollableTabRow.<anonymous> (TabRow.kt:434)");
                                }
                                TabRowDefaults.INSTANCE.m2606SecondaryIndicator9IZ8Weo(tabIndicatorScope.tabIndicatorOffset(Modifier.Companion, i2, false), 0.0f, 0L, composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54);
                }
                if (i13 != 0) {
                    function2M2004getLambda5$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m2004getLambda5$material3_release();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
                    i5 = (i5 - 897) - (i5 | (-897));
                }
                if ((i4 + 8) - (i4 | 8) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-7169)));
                }
                if ((i4 & 16) != 0) {
                    i5 &= -57345;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1821940917, i5, -1, "androidx.compose.material3.SecondaryScrollableTabRow (TabRow.kt:440)");
            }
            int i15 = i5 >> 3;
            int i16 = ((-1) - (((-1) - ((-1) - (((-1) - (((i5 + 126) - (126 | i5)) | ((-1) - (((-1) - i15) | ((-1) - 896))))) & ((-1) - ((-1) - (((-1) - i15) | ((-1) - 7168))))))) & ((-1) - ((-1) - (((-1) - i15) | ((-1) - 57344)))))) | ((i5 << 9) & 458752);
            int i17 = (3670016 + i5) - (3670016 | i5);
            int i18 = ((i16 + i17) - (i16 & i17)) | ((-1) - (((-1) - 29360128) | ((-1) - i5))) | (i5 & 234881024);
            composer2 = composerStartRestartGroup;
            m2612ScrollableTabRowImplsKfQg0A(i2, companion, secondaryContainerColor, secondaryContentColor, fM2607getScrollableTabRowEdgeStartPaddingD9Ej5fM, scrollStateRememberScrollState, composableLambdaRememberComposableLambda, function2M2004getLambda5$material3_release, function22, composerStartRestartGroup, i18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final float f3 = fM2607getScrollableTabRowEdgeStartPaddingD9Ej5fM;
            final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function32 = composableLambdaRememberComposableLambda;
            final Function2<? super Composer, ? super Integer, Unit> function23 = function2M2004getLambda5$material3_release;
            final ScrollState scrollState2 = scrollStateRememberScrollState;
            final long j4 = secondaryContainerColor;
            final long j5 = secondaryContentColor;
            final Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$SecondaryScrollableTabRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i19) {
                    TabRowKt.m2614SecondaryScrollableTabRowqhFBPw4(i2, modifier2, scrollState2, j4, j5, f3, function32, function23, function22, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ScrollableTabRow-sKfQg0A */
    public static final void m2611ScrollableTabRowsKfQg0A(int i2, Modifier modifier, long j2, long j3, float f2, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i3, final int i4) {
        int i5;
        Composer composer2;
        Function2<? super Composer, ? super Integer, Unit> function2M2005getLambda6$material3_release = function2;
        long primaryContentColor = j3;
        ComposableLambda composableLambdaRememberComposableLambda = function3;
        long primaryContainerColor = j2;
        float fM2607getScrollableTabRowEdgeStartPaddingD9Ej5fM = f2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-497821003);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScrollableTabRow)P(6,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)496@25397L21,497@25461L19,500@25644L164,517@26250L21,508@25926L351:TabRow.kt#uh7d8r");
        final int i6 = i2;
        if ((i4 & 1) != 0) {
            i5 = (-1) - (((-1) - i3) & ((-1) - 6));
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(i6) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i7 = i4 & 2;
        if (i7 != 0) {
            i5 = (i5 + 48) - (i5 & 48);
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 |= ((-1) - (((-1) - i4) | ((-1) - 4)) == 0 && composerStartRestartGroup.changed(primaryContainerColor)) ? 256 : 128;
        }
        if ((i3 + 3072) - (i3 | 3072) == 0) {
            i5 |= ((-1) - (((-1) - i4) | ((-1) - 8)) == 0 && composerStartRestartGroup.changed(primaryContentColor)) ? 2048 : 1024;
        }
        int i8 = (i4 + 16) - (i4 | 16);
        if (i8 != 0) {
            i5 = (i5 + 24576) - (i5 & 24576);
        } else if ((-1) - (((-1) - i3) | ((-1) - 24576)) == 0) {
            int i9 = composerStartRestartGroup.changed(fM2607getScrollableTabRowEdgeStartPaddingD9Ej5fM) ? 16384 : 8192;
            i5 = (i5 + i9) - (i5 & i9);
        }
        int i10 = (-1) - (((-1) - i4) | ((-1) - 32));
        if (i10 != 0) {
            i5 = (i5 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i3) - (196608 | i3) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda) ? 131072 : 65536)));
        }
        int i11 = (-1) - (((-1) - i4) | ((-1) - 64));
        if (i11 != 0) {
            i5 |= 1572864;
        } else if ((i3 + 1572864) - (i3 | 1572864) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function2M2005getLambda6$material3_release) ? 1048576 : 524288)));
        }
        if ((i4 & 128) != 0) {
            i5 |= 12582912;
        } else if ((-1) - (((-1) - i3) | ((-1) - 12582912)) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 4793491)) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i3 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i4 + 4) - (i4 | 4) != 0) {
                    primaryContainerColor = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composerStartRestartGroup, 6);
                    i5 = (i5 - 897) - (i5 | (-897));
                }
                if ((i4 & 8) != 0) {
                    primaryContentColor = TabRowDefaults.INSTANCE.getPrimaryContentColor(composerStartRestartGroup, 6);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-7169)));
                }
                if (i8 != 0) {
                    fM2607getScrollableTabRowEdgeStartPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m2607getScrollableTabRowEdgeStartPaddingD9Ej5fM();
                }
                if (i10 != 0) {
                    composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-913748678, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer3, Integer num) {
                            invoke((List<TabPosition>) list, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(List<TabPosition> list, Composer composer3, int i12) {
                            ComposerKt.sourceInformation(composer3, "C501@25689L109:TabRow.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-913748678, i12, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:501)");
                            }
                            TabRowDefaults.INSTANCE.m2606SecondaryIndicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.Companion, list.get(i6)), 0.0f, 0L, composer3, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                }
                if (i11 != 0) {
                    function2M2005getLambda6$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m2005getLambda6$material3_release();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 & 4) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-897)));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
                    i5 &= -7169;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-497821003, i5, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:507)");
            }
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            int i12 = (-1) - (((-1) - i5) | ((-1) - 14));
            int i13 = i5 >> 12;
            int i14 = (i13 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i13 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
            int i15 = i5 << 3;
            int i16 = (-1) - (((-1) - (((((i12 + i14) - (i12 & i14)) | ((i15 + 896) - (896 | i15))) | ((-1) - (((-1) - i15) | ((-1) - 7168)))) | ((-1) - (((-1) - 57344) | ((-1) - i15))))) & ((-1) - ((-1) - (((-1) - i15) | ((-1) - 458752)))));
            int i17 = 3670016 & i5;
            composer2 = composerStartRestartGroup;
            i6 = i6;
            Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32 = composableLambdaRememberComposableLambda;
            m2613ScrollableTabRowWithSubcomposeImplqhFBPw4(i6, function32, companion, primaryContainerColor, primaryContentColor, fM2607getScrollableTabRowEdgeStartPaddingD9Ej5fM, function2M2005getLambda6$material3_release, function22, scrollStateRememberScrollState, composerStartRestartGroup, (-1) - (((-1) - ((i16 + i17) - (i16 & i17))) & ((-1) - (i5 & 29360128))), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i18 = i6;
            final Modifier modifier2 = companion;
            final long j4 = primaryContainerColor;
            final long j5 = primaryContentColor;
            final float f3 = fM2607getScrollableTabRowEdgeStartPaddingD9Ej5fM;
            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33 = composableLambdaRememberComposableLambda;
            final Function2<? super Composer, ? super Integer, Unit> function23 = function2M2005getLambda6$material3_release;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i19) {
                    int i20 = i18;
                    Modifier modifier3 = modifier2;
                    long j6 = j4;
                    long j7 = j5;
                    float f4 = f3;
                    Function3<List<TabPosition>, Composer, Integer, Unit> function34 = function33;
                    Function2<Composer, Integer, Unit> function24 = function23;
                    Function2<Composer, Integer, Unit> function25 = function22;
                    int i21 = i3;
                    TabRowKt.m2611ScrollableTabRowsKfQg0A(i20, modifier3, j6, j7, f4, function34, function24, function25, composer3, RecomposeScopeImplKt.updateChangedFlags((i21 + 1) - (i21 & 1)), i4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: TabRowImpl-DTcfvLk */
    public static final void m2617TabRowImplDTcfvLk(final Modifier modifier, final long j2, final long j3, final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1757425411);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TabRowImpl)P(4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)576@28021L4041,572@27891L4171:TabRow.kt#uh7d8r");
        if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i4 = composerStartRestartGroup.changed(j3) ? 256 : 128;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024)));
        }
        if ((i2 & 24576) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1757425411, i3, -1, "androidx.compose.material3.TabRowImpl (TabRow.kt:571)");
            }
            int i6 = i3 << 3;
            SurfaceKt.m2561SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier), null, j2, j3, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-65106680, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1
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

                public final void invoke(Composer composer2, int i7) {
                    ComposerKt.sourceInformation(composer2, "C577@28043L1274,618@29505L21,620@29556L2500,612@29327L2729:TabRow.kt#uh7d8r");
                    if ((-1) - (((-1) - i7) | ((-1) - 3)) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-65106680, i7, -1, "androidx.compose.material3.TabRowImpl.<anonymous> (TabRow.kt:577)");
                    }
                    ComposerKt.sourceInformationMarkerStart(composer2, 1811399233, "CC(remember):TabRow.kt#9igjgp");
                    Object objRememberedValue = composer2.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new TabRowKt$TabRowImpl$1$scope$1$1();
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    final TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1 = (TabRowKt$TabRowImpl$1$scope$1$1) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                    final Function3<TabIndicatorScope, Composer, Integer, Unit> function32 = function3;
                    List listListOf = CollectionsKt.listOf((Object[]) new Function2[]{function22, function2, ComposableLambdaKt.rememberComposableLambda(1236693605, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i8) {
                            ComposerKt.sourceInformation(composer3, "C618@29513L11:TabRow.kt#uh7d8r");
                            if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1236693605, i8, -1, "androidx.compose.material3.TabRowImpl.<anonymous>.<anonymous> (TabRow.kt:618)");
                            }
                            function32.invoke(tabRowKt$TabRowImpl$1$scope$1$1, composer3, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54)});
                    ComposerKt.sourceInformationMarkerStart(composer2, 1811448875, "CC(remember):TabRow.kt#9igjgp");
                    MultiContentMeasurePolicy multiContentMeasurePolicyRememberedValue = composer2.rememberedValue();
                    if (multiContentMeasurePolicyRememberedValue == Composer.Companion.getEmpty()) {
                        multiContentMeasurePolicyRememberedValue = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1
                            @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public final MeasureResult mo966measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j4) {
                                int i8 = 0;
                                List<? extends Measurable> list2 = list.get(0);
                                List<? extends Measurable> list3 = list.get(1);
                                int i9 = 2;
                                List<? extends Measurable> list4 = list.get(2);
                                int iM6591getMaxWidthimpl = Constraints.m6591getMaxWidthimpl(j4);
                                int size = list2.size();
                                final Ref.IntRef intRef = new Ref.IntRef();
                                if (size > 0) {
                                    intRef.element = iM6591getMaxWidthimpl / size;
                                }
                                int iValueOf = 0;
                                int size2 = list2.size();
                                for (int i10 = 0; i10 < size2; i10++) {
                                    iValueOf = Integer.valueOf(Math.max(list2.get(i10).maxIntrinsicHeight(intRef.element), iValueOf.intValue()));
                                }
                                final int iIntValue = iValueOf.intValue();
                                TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$12 = tabRowKt$TabRowImpl$1$scope$1$1;
                                ArrayList arrayList = new ArrayList(size);
                                while (i8 < size) {
                                    arrayList.add(new TabPosition(Dp.m6638constructorimpl(measureScope.mo707toDpu2uoSUM(intRef.element) * i8), measureScope.mo707toDpu2uoSUM(intRef.element), ((Dp) ComparisonsKt.maxOf(Dp.m6636boximpl(Dp.m6638constructorimpl(measureScope.mo707toDpu2uoSUM(Math.min(list2.get(i8).maxIntrinsicWidth(iIntValue), intRef.element)) - Dp.m6638constructorimpl(TabKt.getHorizontalTextPadding() * i9))), Dp.m6636boximpl(Dp.m6638constructorimpl(24)))).m6652unboximpl(), null));
                                    i8++;
                                    i9 = 2;
                                }
                                tabRowKt$TabRowImpl$1$scope$1$12.setTabPositions(arrayList);
                                ArrayList arrayList2 = new ArrayList(list2.size());
                                int size3 = list2.size();
                                for (int i11 = 0; i11 < size3; i11++) {
                                    arrayList2.add(list2.get(i11).mo5514measureBRTryo0(Constraints.m6581copyZbe2FdA(j4, intRef.element, intRef.element, iIntValue, iIntValue)));
                                }
                                final ArrayList arrayList3 = arrayList2;
                                ArrayList arrayList4 = new ArrayList(list3.size());
                                int size4 = list3.size();
                                for (int i12 = 0; i12 < size4; i12++) {
                                    arrayList4.add(list3.get(i12).mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(j4, 0, 0, 0, 0, 11, null)));
                                }
                                final ArrayList arrayList5 = arrayList4;
                                ArrayList arrayList6 = new ArrayList(list4.size());
                                int size5 = list4.size();
                                for (int i13 = 0; i13 < size5; i13++) {
                                    arrayList6.add(list4.get(i13).mo5514measureBRTryo0(Constraints.m6581copyZbe2FdA(j4, intRef.element, intRef.element, 0, iIntValue)));
                                }
                                final ArrayList arrayList7 = arrayList6;
                                return MeasureScope.layout$default(measureScope, iM6591getMaxWidthimpl, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        List<Placeable> list5 = arrayList3;
                                        Ref.IntRef intRef2 = intRef;
                                        int size6 = list5.size();
                                        for (int i14 = 0; i14 < size6; i14++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, list5.get(i14), i14 * intRef2.element, 0, 0.0f, 4, null);
                                        }
                                        List<Placeable> list6 = arrayList5;
                                        int i15 = iIntValue;
                                        int size7 = list6.size();
                                        for (int i16 = 0; i16 < size7; i16++) {
                                            Placeable placeable = list6.get(i16);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i15 - placeable.getHeight(), 0.0f, 4, null);
                                        }
                                        List<Placeable> list7 = arrayList7;
                                        int i17 = iIntValue;
                                        int size8 = list7.size();
                                        for (int i18 = 0; i18 < size8; i18++) {
                                            Placeable placeable2 = list7.get(i18);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, i17 - placeable2.getHeight(), 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                        };
                        composer2.updateRememberedValue(multiContentMeasurePolicyRememberedValue);
                    }
                    MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) multiContentMeasurePolicyRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerStart(composer2, 1399185516, "CC(Layout)P(!1,2)173@6976L62,170@6862L182:Layout.kt#80mrfh");
                    Function2<Composer, Integer, Unit> function2CombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listListOf);
                    ComposerKt.sourceInformationMarkerStart(composer2, -290761997, "CC(remember):Layout.kt#9igjgp");
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
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
                    Updater.m3678setimpl(composerM3671constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    function2CombineAsVirtualLayouts.invoke(composer2, 0);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i6 + 896) - (896 | i6)) | 12582912 | ((-1) - (((-1) - i6) | ((-1) - 7168))), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$2
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

                public final void invoke(Composer composer2, int i7) {
                    TabRowKt.m2617TabRowImplDTcfvLk(modifier, j2, j3, function3, function2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))));
                }
            });
        }
    }

    /* JADX INFO: renamed from: ScrollableTabRowImpl-sKfQg0A */
    public static final void m2612ScrollableTabRowImplsKfQg0A(final int i2, final Modifier modifier, final long j2, final long j3, final float f2, final ScrollState scrollState, final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1594140035);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScrollableTabRowImpl)P(7,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,6,4)710@32775L5081,700@32441L5415:TabRow.kt#uh7d8r");
        if ((i3 + 6) - (i3 | 6) == 0) {
            int i5 = composerStartRestartGroup.changed(i2) ? 4 : 2;
            i4 = (i5 + i3) - (i5 & i3);
        } else {
            i4 = i3;
        }
        if ((i3 + 48) - (i3 | 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(modifier) ? 32 : 16)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i3 + 3072) - (i3 | 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(j3) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(f2) ? 16384 : 8192)));
        }
        if ((196608 & i3) == 0) {
            int i6 = composerStartRestartGroup.changed(scrollState) ? 131072 : 65536;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((1572864 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        if ((100663296 + i3) - (100663296 | i3) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((-1) - (((-1) - i4) | ((-1) - 38347923)) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1594140035, i4, -1, "androidx.compose.material3.ScrollableTabRowImpl (TabRow.kt:699)");
            }
            int i7 = (-1) - (((-1) - ((-1) - (((-1) - i4) | ((-1) - 896)))) & ((-1) - 12582912));
            int i8 = i4 & 7168;
            SurfaceKt.m2561SurfaceT9BRK9s(ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Alignment.Companion.getCenterStart(), false, 2, null), scrollState, false, null, false, 14, null))), null, j2, j3, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1556158104, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1
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

                public final void invoke(Composer composer2, int i9) {
                    ComposerKt.sourceInformation(composer2, "C711@32806L24,713@32875L147,717@33044L1274,757@34458L21,759@34509L3341,752@34328L3522:TabRow.kt#uh7d8r");
                    if ((i9 + 3) - (3 | i9) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1556158104, i9, -1, "androidx.compose.material3.ScrollableTabRowImpl.<anonymous> (TabRow.kt:711)");
                    }
                    ComposerKt.sourceInformationMarkerStart(composer2, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(composer2, -954363344, "CC(remember):Effects.kt#9igjgp");
                    Object objRememberedValue = composer2.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerStart(composer2, 413419233, "CC(remember):TabRow.kt#9igjgp");
                    boolean zChanged = composer2.changed(scrollState);
                    boolean zChanged2 = composer2.changed(coroutineScope);
                    boolean z2 = ((zChanged ? 1 : 0) + (zChanged2 ? 1 : 0)) - ((zChanged ? 1 : 0) & (zChanged2 ? 1 : 0)) == 1;
                    ScrollState scrollState2 = scrollState;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new ScrollableTabData(scrollState2, coroutineScope);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerStart(composer2, 413425768, "CC(remember):TabRow.kt#9igjgp");
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new TabRowKt$ScrollableTabRowImpl$1$scope$1$1();
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    final TabRowKt$ScrollableTabRowImpl$1$scope$1$1 tabRowKt$ScrollableTabRowImpl$1$scope$1$1 = (TabRowKt$ScrollableTabRowImpl$1$scope$1$1) objRememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    final Function3<TabIndicatorScope, Composer, Integer, Unit> function32 = function3;
                    List listListOf = CollectionsKt.listOf((Object[]) new Function2[]{function22, function2, ComposableLambdaKt.rememberComposableLambda(-1530560661, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i10) {
                            ComposerKt.sourceInformation(composer3, "C757@34466L11:TabRow.kt#uh7d8r");
                            if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1530560661, i10, -1, "androidx.compose.material3.ScrollableTabRowImpl.<anonymous>.<anonymous> (TabRow.kt:757)");
                            }
                            function32.invoke(tabRowKt$ScrollableTabRowImpl$1$scope$1$1, composer3, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54)});
                    ComposerKt.sourceInformationMarkerStart(composer2, 413474715, "CC(remember):TabRow.kt#9igjgp");
                    int i10 = (-1) - (((-1) - (composer2.changed(f2) ? 1 : 0)) & ((-1) - (composer2.changed(i2) ? 1 : 0))) != 1 ? 0 : 1;
                    boolean zChangedInstance = composer2.changedInstance(scrollableTabData);
                    boolean z3 = (i10 + (zChangedInstance ? 1 : 0)) - (i10 & (zChangedInstance ? 1 : 0)) == 1;
                    final float f3 = f2;
                    final int i11 = i2;
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (z3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                        objRememberedValue4 = (MultiContentMeasurePolicy) new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$2$1
                            @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public final MeasureResult mo966measure3p2s80s(final MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j4) {
                                List<? extends Measurable> list2 = list.get(0);
                                List<? extends Measurable> list3 = list.get(1);
                                List<? extends Measurable> list4 = list.get(2);
                                final int i12 = measureScope.mo704roundToPx0680j_4(f3);
                                int size = list2.size();
                                int i13 = measureScope.mo704roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                int iValueOf = 0;
                                int size2 = list2.size();
                                for (int i14 = 0; i14 < size2; i14++) {
                                    iValueOf = Integer.valueOf(Math.max(iValueOf.intValue(), list2.get(i14).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                }
                                final int iIntValue = iValueOf.intValue();
                                int i15 = i12 * 2;
                                long jM6582copyZbe2FdA$default = Constraints.m6582copyZbe2FdA$default(j4, i13, 0, iIntValue, iIntValue, 2, null);
                                final Ref.FloatRef floatRef = new Ref.FloatRef();
                                floatRef.element = f3;
                                ArrayList arrayList = new ArrayList(list2.size());
                                int size3 = list2.size();
                                for (int i16 = 0; i16 < size3; i16++) {
                                    arrayList.add(list2.get(i16).mo5514measureBRTryo0(jM6582copyZbe2FdA$default));
                                }
                                final ArrayList arrayList2 = arrayList;
                                ArrayList arrayList3 = new ArrayList(size);
                                for (int i17 = 0; i17 < size; i17++) {
                                    float fM6652unboximpl = ((Dp) ComparisonsKt.maxOf(Dp.m6636boximpl(TabRowKt.ScrollableTabRowMinimumTabWidth), Dp.m6636boximpl(measureScope.mo707toDpu2uoSUM(((Placeable) arrayList2.get(i17)).getWidth())))).m6652unboximpl();
                                    i15 += measureScope.mo704roundToPx0680j_4(fM6652unboximpl);
                                    TabPosition tabPosition = new TabPosition(floatRef.element, fM6652unboximpl, ((Dp) ComparisonsKt.maxOf(Dp.m6636boximpl(Dp.m6638constructorimpl(fM6652unboximpl - Dp.m6638constructorimpl(TabKt.getHorizontalTextPadding() * 2))), Dp.m6636boximpl(Dp.m6638constructorimpl(24)))).m6652unboximpl(), null);
                                    floatRef.element = Dp.m6638constructorimpl(floatRef.element + fM6652unboximpl);
                                    arrayList3.add(tabPosition);
                                }
                                final ArrayList arrayList4 = arrayList3;
                                tabRowKt$ScrollableTabRowImpl$1$scope$1$1.setTabPositions(arrayList4);
                                ArrayList arrayList5 = new ArrayList(list3.size());
                                int size4 = list3.size();
                                for (int i18 = 0; i18 < size4; i18++) {
                                    arrayList5.add(list3.get(i18).mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(j4, i15, i15, 0, 0, 8, null)));
                                }
                                final ArrayList arrayList6 = arrayList5;
                                int i19 = i11;
                                ArrayList arrayList7 = new ArrayList(list4.size());
                                int size5 = list4.size();
                                for (int i20 = 0; i20 < size5; i20++) {
                                    arrayList7.add(list4.get(i20).mo5514measureBRTryo0(Constraints.m6581copyZbe2FdA(j4, 0, measureScope.mo704roundToPx0680j_4(((TabPosition) arrayList4.get(i19)).m2603getWidthD9Ej5fM()), 0, iIntValue)));
                                }
                                final ArrayList arrayList8 = arrayList7;
                                final float f4 = f3;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i21 = i11;
                                return MeasureScope.layout$default(measureScope, i15, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        floatRef.element = f4;
                                        List<Placeable> list5 = arrayList2;
                                        MeasureScope measureScope2 = measureScope;
                                        Ref.FloatRef floatRef2 = floatRef;
                                        List<TabPosition> list6 = arrayList4;
                                        int size6 = list5.size();
                                        for (int i22 = 0; i22 < size6; i22++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, list5.get(i22), measureScope2.mo704roundToPx0680j_4(floatRef2.element), 0, 0.0f, 4, null);
                                            floatRef2.element = Dp.m6638constructorimpl(floatRef2.element + list6.get(i22).m2603getWidthD9Ej5fM());
                                        }
                                        List<Placeable> list7 = arrayList6;
                                        int i23 = iIntValue;
                                        int size7 = list7.size();
                                        for (int i24 = 0; i24 < size7; i24++) {
                                            Placeable placeable = list7.get(i24);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i23 - placeable.getHeight(), 0.0f, 4, null);
                                        }
                                        List<Placeable> list8 = arrayList8;
                                        MeasureScope measureScope3 = measureScope;
                                        List<TabPosition> list9 = arrayList4;
                                        int i25 = i21;
                                        int i26 = iIntValue;
                                        int size8 = list8.size();
                                        for (int i27 = 0; i27 < size8; i27++) {
                                            Placeable placeable2 = list8.get(i27);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, Math.max(0, (measureScope3.mo704roundToPx0680j_4(list9.get(i25).m2603getWidthD9Ej5fM()) - placeable2.getWidth()) / 2), i26 - placeable2.getHeight(), 0.0f, 4, null);
                                        }
                                        scrollableTabData2.onLaidOut(measureScope, i12, arrayList4, i21);
                                    }
                                }, 4, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) objRememberedValue4;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerStart(composer2, 1399185516, "CC(Layout)P(!1,2)173@6976L62,170@6862L182:Layout.kt#80mrfh");
                    Modifier.Companion companion = Modifier.Companion;
                    Function2<Composer, Integer, Unit> function2CombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listListOf);
                    ComposerKt.sourceInformationMarkerStart(composer2, -290761997, "CC(remember):Layout.kt#9igjgp");
                    boolean zChanged3 = composer2.changed(multiContentMeasurePolicy);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                        objRememberedValue5 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue5;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
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
                    Updater.m3678setimpl(composerM3671constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    function2CombineAsVirtualLayouts.invoke(composer2, 0);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i7 + i8) - (i7 & i8), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$2
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

                public final void invoke(Composer composer2, int i9) {
                    int i10 = i2;
                    Modifier modifier2 = modifier;
                    long j4 = j2;
                    long j5 = j3;
                    float f3 = f2;
                    ScrollState scrollState2 = scrollState;
                    Function3<TabIndicatorScope, Composer, Integer, Unit> function32 = function3;
                    Function2<Composer, Integer, Unit> function23 = function2;
                    Function2<Composer, Integer, Unit> function24 = function22;
                    int i11 = i3;
                    TabRowKt.m2612ScrollableTabRowImplsKfQg0A(i10, modifier2, j4, j5, f3, scrollState2, function32, function23, function24, composer2, RecomposeScopeImplKt.updateChangedFlags((i11 + 1) - (i11 & 1)));
                }
            });
        }
    }

    /* JADX INFO: renamed from: TabRowWithSubcomposeImpl-DTcfvLk */
    public static final void m2618TabRowWithSubcomposeImplDTcfvLk(final Modifier modifier, final long j2, final long j3, final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-160898917);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TabRowWithSubcomposeImpl)P(4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)953@41542L2218,949@41412L2348:TabRow.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i4 = composerStartRestartGroup.changed(j2) ? 32 : 16;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(j3) ? 256 : 128)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((74899 + i3) - (74899 | i3) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-160898917, i3, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl (TabRow.kt:948)");
            }
            int i6 = i3 << 3;
            SurfaceKt.m2561SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier), null, j2, j3, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1617702432, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1
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

                public final void invoke(Composer composer2, int i7) {
                    ComposerKt.sourceInformation(composer2, "C954@41594L2160,954@41552L2202:TabRow.kt#uh7d8r");
                    if ((i7 + 3) - (3 | i7) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1617702432, i7, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:954)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1807606673, "CC(remember):TabRow.kt#9igjgp");
                    boolean z2 = (-1) - (((-1) - ((composer2.changed(function22) ? 1 : 0) | (composer2.changed(function2) ? 1 : 0))) & ((-1) - (composer2.changed(function3) ? 1 : 0))) == 1;
                    final Function2<Composer, Integer, Unit> function23 = function22;
                    final Function2<Composer, Integer, Unit> function24 = function2;
                    final Function3<List<TabPosition>, Composer, Integer, Unit> function32 = function3;
                    Object objRememberedValue = composer2.rememberedValue();
                    if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m2626invoke0kLqBqw(subcomposeMeasureScope, constraints.m6597unboximpl());
                            }

                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m2626invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j4) {
                                final int iM6591getMaxWidthimpl = Constraints.m6591getMaxWidthimpl(j4);
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function23);
                                int size = listSubcompose.size();
                                final Ref.IntRef intRef = new Ref.IntRef();
                                if (size > 0) {
                                    intRef.element = iM6591getMaxWidthimpl / size;
                                }
                                int iValueOf = 0;
                                int size2 = listSubcompose.size();
                                for (int i8 = 0; i8 < size2; i8++) {
                                    iValueOf = Integer.valueOf(Math.max(listSubcompose.get(i8).maxIntrinsicHeight(intRef.element), iValueOf.intValue()));
                                }
                                final int iIntValue = iValueOf.intValue();
                                ArrayList arrayList = new ArrayList(listSubcompose.size());
                                int size3 = listSubcompose.size();
                                for (int i9 = 0; i9 < size3; i9++) {
                                    arrayList.add(listSubcompose.get(i9).mo5514measureBRTryo0(Constraints.m6581copyZbe2FdA(j4, intRef.element, intRef.element, iIntValue, iIntValue)));
                                }
                                final ArrayList arrayList2 = arrayList;
                                ArrayList arrayList3 = new ArrayList(size);
                                for (int i10 = 0; i10 < size; i10++) {
                                    arrayList3.add(new TabPosition(Dp.m6638constructorimpl(subcomposeMeasureScope.mo707toDpu2uoSUM(intRef.element) * i10), subcomposeMeasureScope.mo707toDpu2uoSUM(intRef.element), ((Dp) ComparisonsKt.maxOf(Dp.m6636boximpl(Dp.m6638constructorimpl(subcomposeMeasureScope.mo707toDpu2uoSUM(Math.min(listSubcompose.get(i10).maxIntrinsicWidth(iIntValue), intRef.element)) - Dp.m6638constructorimpl(TabKt.getHorizontalTextPadding() * 2))), Dp.m6636boximpl(Dp.m6638constructorimpl(24)))).m6652unboximpl(), null));
                                }
                                final ArrayList arrayList4 = arrayList3;
                                final Function2<Composer, Integer, Unit> function25 = function24;
                                final Function3<List<TabPosition>, Composer, Integer, Unit> function33 = function32;
                                return MeasureScope.layout$default(subcomposeMeasureScope, iM6591getMaxWidthimpl, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        List<Placeable> list = arrayList2;
                                        Ref.IntRef intRef2 = intRef;
                                        int size4 = list.size();
                                        for (int i11 = 0; i11 < size4; i11++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i11), i11 * intRef2.element, 0, 0.0f, 4, null);
                                        }
                                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function25);
                                        long j5 = j4;
                                        int i12 = iIntValue;
                                        int size5 = listSubcompose2.size();
                                        for (int i13 = 0; i13 < size5; i13++) {
                                            Placeable placeableMo5514measureBRTryo0 = listSubcompose2.get(i13).mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(j5, 0, 0, 0, 0, 11, null));
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo0, 0, i12 - placeableMo5514measureBRTryo0.getHeight(), 0.0f, 4, null);
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<List<TabPosition>, Composer, Integer, Unit> function34 = function33;
                                        final List<TabPosition> list2 = arrayList4;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(1621992604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.TabRowWithSubcomposeImpl.1.1.1.1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i14) {
                                                ComposerKt.sourceInformation(composer3, "C1000@43547L23:TabRow.kt#uh7d8r");
                                                if ((i14 & 3) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1621992604, i14, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1000)");
                                                }
                                                function34.invoke(list2, composer3, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        int i14 = iM6591getMaxWidthimpl;
                                        int i15 = iIntValue;
                                        int size6 = listSubcompose3.size();
                                        for (int i16 = 0; i16 < size6; i16++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i16).mo5514measureBRTryo0(Constraints.Companion.m6601fixedJhjzzOo(i14, i15)), 0, 0, 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - (((i6 + 896) - (896 | i6)) | 12582912)) & ((-1) - (i6 & 7168))), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$2
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

                public final void invoke(Composer composer2, int i7) {
                    TabRowKt.m2618TabRowWithSubcomposeImplDTcfvLk(modifier, j2, j3, function3, function2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))));
                }
            });
        }
    }

    /* JADX INFO: renamed from: ScrollableTabRowWithSubcomposeImpl-qhFBPw4 */
    public static final void m2613ScrollableTabRowWithSubcomposeImplqhFBPw4(final int i2, final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, long j2, long j3, float f2, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final ScrollState scrollState, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier.Companion companion = modifier;
        float fM2607getScrollableTabRowEdgeStartPaddingD9Ej5fM = f2;
        long primaryContentColor = j3;
        Function2<? super Composer, ? super Integer, Unit> function2M2006getLambda7$material3_release = function2;
        long primaryContainerColor = j2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-955409947);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScrollableTabRowWithSubcomposeImpl)P(7,4,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp!1,8)1014@43999L21,1015@44063L19,1021@44384L3880,1021@44302L3962:TabRow.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = (i3 + 6) - (i3 & 6);
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i5 = (-1) - (((-1) - (composerStartRestartGroup.changed(i2) ? 4 : 2)) & ((-1) - i3));
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 48));
        } else if ((i3 + 48) - (i3 | 48) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function3) ? 32 : 16)));
        }
        int i6 = (-1) - (((-1) - i4) | ((-1) - 4));
        if (i6 != 0) {
            i5 = (i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(companion) ? 256 : 128)));
        }
        if ((i3 & 3072) == 0) {
            i5 |= ((i4 & 8) == 0 && composerStartRestartGroup.changed(primaryContainerColor)) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 & 16) == 0 && composerStartRestartGroup.changed(primaryContentColor)) ? 16384 : 8192)));
        }
        int i7 = i4 & 32;
        if (i7 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i3)) == 0) {
            int i8 = composerStartRestartGroup.changed(fM2607getScrollableTabRowEdgeStartPaddingD9Ej5fM) ? 131072 : 65536;
            i5 = (i5 + i8) - (i5 & i8);
        }
        int i9 = (i4 + 64) - (i4 | 64);
        if (i9 != 0) {
            i5 = (i5 + 1572864) - (i5 & 1572864);
        } else if ((i3 & 1572864) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function2M2006getLambda7$material3_release) ? 1048576 : 524288)));
        }
        if ((i4 + 128) - (i4 | 128) != 0) {
            i5 = (i5 + 12582912) - (i5 & 12582912);
        } else if ((i3 & 12582912) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304)));
        }
        if ((i4 + 256) - (i4 | 256) != 0) {
            i5 |= 100663296;
        } else if ((-1) - (((-1) - i3) | ((-1) - 100663296)) == 0) {
            i5 |= composerStartRestartGroup.changed(scrollState) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 38347923)) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i3) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i4 + 8) - (i4 | 8) != 0) {
                    primaryContainerColor = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composerStartRestartGroup, 6);
                    i5 = (i5 - 7169) - (i5 | (-7169));
                }
                if ((i4 & 16) != 0) {
                    primaryContentColor = TabRowDefaults.INSTANCE.getPrimaryContentColor(composerStartRestartGroup, 6);
                    i5 = (i5 - 57345) - (i5 | (-57345));
                }
                if (i7 != 0) {
                    fM2607getScrollableTabRowEdgeStartPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m2607getScrollableTabRowEdgeStartPaddingD9Ej5fM();
                }
                if (i9 != 0) {
                    function2M2006getLambda7$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m2006getLambda7$material3_release();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 & 8) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-7169)));
                }
                if ((i4 & 16) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-57345)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-955409947, i5, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl (TabRow.kt:1020)");
            }
            final float f3 = fM2607getScrollableTabRowEdgeStartPaddingD9Ej5fM;
            final Function2<? super Composer, ? super Integer, Unit> function23 = function2M2006getLambda7$material3_release;
            int i10 = (i5 >> 6) & 14;
            int i11 = i5 >> 3;
            int i12 = ((i10 + 12582912) - (i10 & 12582912)) | (896 & i11);
            int i13 = (i11 + 7168) - (i11 | 7168);
            SurfaceKt.m2561SurfaceT9BRK9s(companion, null, primaryContainerColor, primaryContentColor, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1572959552, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1
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
                    ComposerKt.sourceInformation(composer2, "C1022@44415L24,1024@44484L147,1033@44882L3376,1027@44640L3618:TabRow.kt#uh7d8r");
                    if ((-1) - (((-1) - i14) | ((-1) - 3)) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1572959552, i14, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:1022)");
                    }
                    ComposerKt.sourceInformationMarkerStart(composer2, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(composer2, -954363344, "CC(remember):Effects.kt#9igjgp");
                    Object objRememberedValue = composer2.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerStart(composer2, -702885223, "CC(remember):TabRow.kt#9igjgp");
                    boolean zChanged = composer2.changed(scrollState);
                    boolean zChanged2 = composer2.changed(coroutineScope);
                    boolean z2 = ((zChanged ? 1 : 0) + (zChanged2 ? 1 : 0)) - ((zChanged ? 1 : 0) & (zChanged2 ? 1 : 0)) == 1;
                    ScrollState scrollState2 = scrollState;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (z2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new ScrollableTabData(scrollState2, coroutineScope);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getCenterStart(), false, 2, null), scrollState, false, null, false, 14, null)));
                    ComposerKt.sourceInformationMarkerStart(composer2, -702869258, "CC(remember):TabRow.kt#9igjgp");
                    int i15 = (-1) - (((-1) - (composer2.changed(f3) ? 1 : 0)) & ((-1) - (composer2.changed(function22) ? 1 : 0))) != 1 ? 0 : 1;
                    boolean zChanged3 = composer2.changed(function23);
                    int i16 = (-1) - (((-1) - (((i15 + (zChanged3 ? 1 : 0)) - (i15 & (zChanged3 ? 1 : 0)) != 1 ? 0 : 1) | (composer2.changed(function3) ? 1 : 0))) & ((-1) - (composer2.changedInstance(scrollableTabData) ? 1 : 0))) != 1 ? 0 : 1;
                    boolean zChanged4 = composer2.changed(i2);
                    boolean z3 = (i16 + (zChanged4 ? 1 : 0)) - (i16 & (zChanged4 ? 1 : 0)) == 1;
                    final float f4 = f3;
                    final Function2<Composer, Integer, Unit> function24 = function22;
                    final Function2<Composer, Integer, Unit> function25 = function23;
                    final int i17 = i2;
                    final Function3<List<TabPosition>, Composer, Integer, Unit> function32 = function3;
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (z3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m2624invoke0kLqBqw(subcomposeMeasureScope, constraints.m6597unboximpl());
                            }

                            /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m2624invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j4) {
                                int i18 = subcomposeMeasureScope.mo704roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                final int i19 = subcomposeMeasureScope.mo704roundToPx0680j_4(f4);
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function24);
                                int iValueOf = 0;
                                int size = listSubcompose.size();
                                for (int i20 = 0; i20 < size; i20++) {
                                    iValueOf = Integer.valueOf(Math.max(iValueOf.intValue(), listSubcompose.get(i20).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                }
                                final int iIntValue = iValueOf.intValue();
                                long jM6582copyZbe2FdA$default = Constraints.m6582copyZbe2FdA$default(j4, i18, 0, iIntValue, iIntValue, 2, null);
                                final ArrayList arrayList = new ArrayList();
                                final ArrayList arrayList2 = new ArrayList();
                                int size2 = listSubcompose.size();
                                for (int i21 = 0; i21 < size2; i21++) {
                                    Measurable measurable = listSubcompose.get(i21);
                                    Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(jM6582copyZbe2FdA$default);
                                    float fM6638constructorimpl = Dp.m6638constructorimpl(subcomposeMeasureScope.mo707toDpu2uoSUM(Math.min(measurable.maxIntrinsicWidth(placeableMo5514measureBRTryo0.getHeight()), placeableMo5514measureBRTryo0.getWidth())) - Dp.m6638constructorimpl(TabKt.getHorizontalTextPadding() * 2));
                                    arrayList.add(placeableMo5514measureBRTryo0);
                                    arrayList2.add(Dp.m6636boximpl(fM6638constructorimpl));
                                }
                                Integer numValueOf = Integer.valueOf(i19 * 2);
                                int size3 = arrayList.size();
                                for (int i22 = 0; i22 < size3; i22++) {
                                    numValueOf = Integer.valueOf(numValueOf.intValue() + ((Placeable) arrayList.get(i22)).getWidth());
                                }
                                final int iIntValue2 = numValueOf.intValue();
                                final Function2<Composer, Integer, Unit> function26 = function25;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i23 = i17;
                                final Function3<List<TabPosition>, Composer, Integer, Unit> function33 = function32;
                                return MeasureScope.layout$default(subcomposeMeasureScope, iIntValue2, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        final ArrayList arrayList3 = new ArrayList();
                                        int width = i19;
                                        List<Placeable> list = arrayList;
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                        List<Dp> list2 = arrayList2;
                                        int size4 = list.size();
                                        for (int i24 = 0; i24 < size4; i24++) {
                                            Placeable placeable = list.get(i24);
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, 0, 0.0f, 4, null);
                                            arrayList3.add(new TabPosition(subcomposeMeasureScope2.mo707toDpu2uoSUM(width), subcomposeMeasureScope2.mo707toDpu2uoSUM(placeable.getWidth()), list2.get(i24).m6652unboximpl(), null));
                                            width += placeable.getWidth();
                                        }
                                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function26);
                                        long j5 = j4;
                                        int i25 = iIntValue2;
                                        int i26 = iIntValue;
                                        int size5 = listSubcompose2.size();
                                        for (int i27 = 0; i27 < size5; i27++) {
                                            Placeable placeableMo5514measureBRTryo02 = listSubcompose2.get(i27).mo5514measureBRTryo0(Constraints.m6582copyZbe2FdA$default(j5, i25, i25, 0, 0, 8, null));
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo02, 0, i26 - placeableMo5514measureBRTryo02.getHeight(), 0.0f, 4, null);
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<List<TabPosition>, Composer, Integer, Unit> function34 = function33;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(1734082948, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRowWithSubcomposeImpl.1.1.1.2.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i28) {
                                                ComposerKt.sourceInformation(composer3, "C1100@47792L23:TabRow.kt#uh7d8r");
                                                if ((i28 & 3) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1734082948, i28, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1100)");
                                                }
                                                function34.invoke(arrayList3, composer3, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        int i28 = iIntValue2;
                                        int i29 = iIntValue;
                                        int size6 = listSubcompose3.size();
                                        for (int i30 = 0; i30 < size6; i30++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i30).mo5514measureBRTryo0(Constraints.Companion.m6601fixedJhjzzOo(i28, i29)), 0, 0, 0.0f, 4, null);
                                        }
                                        scrollableTabData2.onLaidOut(subcomposeMeasureScope, i19, arrayList3, i23);
                                    }
                                }, 4, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, (Function2) objRememberedValue3, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i12 + i13) - (i12 & i13), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final float f4 = fM2607getScrollableTabRowEdgeStartPaddingD9Ej5fM;
            final Function2<? super Composer, ? super Integer, Unit> function24 = function2M2006getLambda7$material3_release;
            final Modifier modifier2 = companion;
            final long j4 = primaryContainerColor;
            final long j5 = primaryContentColor;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$2
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
                    TabRowKt.m2613ScrollableTabRowWithSubcomposeImplqhFBPw4(i2, function3, modifier2, j4, j5, f4, function24, function22, scrollState, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i3) & ((-1) - 1))), i4);
                }
            });
        }
    }
}
