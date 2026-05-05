package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.NavigationRailTokens;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.braze.models.inappmessage.InAppMessageBase;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.google.firebase.messaging.Constants;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:299)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
/* JADX INFO: compiled from: NavigationRail.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яċ\u0014D߬)\u001ew\fL܀kt\u001aA\u000e0\u00112J~02\u001aw\rpr9>Dm߉6Ri*\u0017ӆ\u00044:[,qI;]\u001a\u0014\"\u0011Odgon`Z\u0013C%\u0006\u001eюr,_U\u0001]\u0018\u0012:B}H;ݹw=O`|6\u000b#:\"Ny\rЏ\"*^\u0010~zIN\u0014\u0012>Ex:X\rU\u00050\u0012\u000e>6\u0001&ձoNLHt]@0+\u0003\u007fBV'e7\u0015F\u001bZl';\f\u0012$1@EK-%\u0002\u001a7Xa?\u0011W\n=3\u0002W-1I\u0002qNX.-EIU\rk\u000e>t\u0015Sp\fUH_e[P<=\u000ey*)ʀ\b\u000e\fEρ2- \u00068\u00149t\u0001sXP0\u007fr\u001a\t\u0004N-5\u0002C+g8vSq;Gce\u0018˿\u0011\u001e)\u001fͼ%[Z-'\u001aŊSȭΦ5SF`Vr\"Ա<{)\tb0?44U&G{?UG/E\u0004Q)1m\u0012Hr|%.\u0011wa\u0014jSP$~\u0016e?75ʑHd\u000b\n\u0001Z^,\u001fc4T5\u00158\u0019&\\\u0006g9%>u\u007f{oj[\n\"2?hGY\u001d\u0001$Vg\bۋ9Qi.\u0012X|\u0014Miz\u0005\u0007\u000erY\u0012ZjV:2v\u001a@\u007f\u0002D\\<+4UpJer6Ǭ`\u0015V562O0!_\t}@\u000ebg<\u000ey&\u0005\t/e\u000b\u001a״kxOJ-o0bY\\E\u001b6UP}b&ɠ\u000b~y\u001ewvZqdw&we{N+Hbֺ3=\u0019-/:@.ER\\tuQ{'=y+#ӛ?h4\u00068n~Yxjxv\u0005!0-vx3\nt\u007f(\u0019t$\u000edӝ\u000f[L\u0002\u000b9guf8+?G\u001eS< &\u000bqECUZF{\"m-a\f' 4\b\"'(\u000bd2i\u0014\u001a}#i]`|~I̫}Жѐ(n\t\u0005V.\u0010VPML\ra\u0003id\u001f\u0012hQ\u0019t\u0016f5i=td\u0018R\u0013\u001e;d2mh\fC,Q\u000fI3PeU}l\u001c\t\r\u000fXO\"\u000b*r\u001f\u0016*j8V\u0006\n94\u0014*06or)\u0005Į\bӗҬ0>\u000eQQ\u001c\n\u0012\u001eÿ\u0018F\u000e\u000emϫ\u0015Ǡ?V\u0016֊\u0019jdH\u001d`sawƤ\u0003϶\u00135&xC3%yTWGc`\u007f*\u07fc[ƨnO\u0007ܺE7RXQ\u001bVWWՍ\u0018زGI\nԍ$U7r\u0004o:9nԀ\u001fÐ\u001c\u001dAQ\u001fa\u0017>l\u0011md|eMԦhŽR$1~\t~.H\u0018\u0016#\u0019}zF۱\u007fٮRw?Ƒ:\r%MA\u0007:{:˭mұ\n55֑ix\"1\u0014W\u0002<TЛ\"Č+\u0006|!jY.z\u0018h3:Drlȉ\u0004Ƥ\u0017X(\u0004<L\rt\u0010:\u0016Co\u0016A\u0010+^\blN˻BӲ/t\u000eBYj\u0011\fi{q{u\u001f\u0011vIV(o\u0004ǡ\u001fԷ+U6\u0013f\\R\u0013Y1f\u001e (#8766c\u007fւQʍlxsOi\u000fC1q=o>ËR#\u0006\"\u007fȃ XSӸ\u0019\u0004ܡQFrRtlppdߧȪ(̢x\u00147^\u0015~vwgӍ̏F"}, d2 = {"\u0017b^;?(R])\u000e^]\u001bx\u000b", "", "\u0017mS6V(M]&a\u0005k0\u0012\u00138t{/f<\u007f\u0016\u001bPq", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u0017mS6V(M]&evr6\r\u0018\u0013dn$}", "\u0017mS6V(M]&k~i7\u0004\t\u0016a\u00142\fOd\u0016\u0006Cq", "\u0017mS6V(M]&ozk;\u0001\u0007+lj$z?\u0005 \u00190yt8s%<", "\u0017mS6V(M]&ozk;\u0001\u0007+lj$z?\u0005 \u00199s\u001d?]!2Y\u0005", "\u0017sT:45B[\u0015\u000e~h5[\u0019<a\u000f,\u0006Ih\u001b\u001eNs\u001c", "", "\u001a`Q2_\u0013:g#\u000f\nB+k\u00051", "\u001c`e6Z(MW#\bgZ0\u0004k/a~(\t+|\u0016\u0016Kx\u0010", "\u001c`e6Z(MW#\bgZ0\u0004l>e\b\u000b{D\u0003\u001a&", "5dc\u001bT=BU\u0015\u000e~h5i\u00053lc7{Hc\u0017\u001bIr\u001d", "u(5", "\u001c`e6Z(MW#\bgZ0\u0004l>e\b\u0019{M\u0010\u001b\u0015Cvx8u$9b\u007f", "5dc\u001bT=BU\u0015\u000e~h5i\u00053lc7{Hq\u0017$Vs\f8}\u00101X|$@o", "\u001c`e6Z(MW#\bgZ0\u0004l>e\b\u001a\u007f?\u0010\u001a", "5dc\u001bT=BU\u0015\u000e~h5i\u00053lc7{Hr\u001b\u0016Vr", "\u001c`e6Z(MW#\bgZ0\u0004y/r\u000f,y<\b\u0002\u0013Fn\u0012Ex", "5dc\u001bT=BU\u0015\u000e~h5i\u00053lp(\tO\u0005\u0015\u0013NZ\n;u)>[", "\u001c`e6Z(MW#\bgZ0\u0004", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n]AX5M1#\u0006\u0005k", "6dP1X9", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8TSCt\"\u001c\u001fsa\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "Eh]1b>\"\\'~\nl", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpG\\", "1n]AX5M", "\u001c`e6Z(MW#\bgZ0\u0004P;iP*n&S", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b>b\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d_0tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u0002\u0016&\u00174f\u007fF`\u0019\u0011\u0001\u0011\nK9w\u0010Kc\u0003FKWF3r\fn+2!@.#x\u001d$2U?\u0012ET!{P\tkqP'D\u00194GkjJOx#\u0012[#(J\t\u0002\u00161k>)~5\u000f>86.\u0012[p'Bfx^\nfI20D< \u0015/G9]", "\u001c`e6Z(MW#\bgZ0\u0004l>e\b", "Ad[2V;>R", "", "=m29\\*D", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "7b^;", "3mP/_,=", ":`Q2_", "/kf.l:,V#\u0011aZ)|\u0010", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006_!F]\u007f\u001cFq 7:??r\u0018-\u0015p?C\u000em9\\L", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b'c5'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\u001c\u001aW\u001dtoFW\u0014G\u0007jj(/rU`c\u0003\u0011FVjse\u001ch\u001bk>D-\";y+qN=\u000e\u0006\\]HG`cpF&\u0005<#Q7YPMz_Jtp'G\u000bw\u001f6T{x>\u0016\u007fE.8`\u0014Oq!+Z|\u001c\u0010kA/\u0004@C\u001dLY9\\hG\ru)e\u0007!,3;!poqHX\bg'd4]n\u0005A[OBR~\u00154B|Q_\u0004\u001eRn4|aFJ\u001b8\n)pQ\u001e] \u0007\ro\u0006&>#;YdO&h6Z\u001d\rgKUycK zV\u00107X\u0003dfs,6BnS)>UJv_\u0019SsY%", "\u001c`e6Z(MW#\bgZ0\u0004l>e\b\u000fwT\u000b'&", "7mS6V(M]&k~i7\u0004\t", "7mS6V(M]&", "/mX:T;B]\"i\bh.\n\t=s", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003aK(/rU`c\u0003\u0011FVjse\u001ch\u001bk>D-\";y+qN=\u000e\u0006\\]HG`mqV ~AmC~c\u0010F\u007f^:\u0004+)T\nArBar:x7\r~\u007f\u001d`\u000eJt\"B]\f^*fI20D<\\L[l\u0005pF\u000e2|k\u0010\u0019lC1&;I'9", ">kP0X\u0010<]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "7b^;C3:Q\u0019zwe,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "7mS6V(M]&k~i7\u0004\t\u001al{&{<}\u001e\u0017", "7mS6V(M]&i\u0002Z*|\u0005,l\u007f", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ">kP0X\u0010<]\"Fm2\f\u0004\f 4", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNDH lD3\u001c\u000f,\u001fh7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b9l\u0010`[\u000eQQT,\u0015k\b]\u001dX7A$iX\u0015$g]8\u000ezfZp\\\u0002rqU\u0019DH(\btWZO\u007fd\u0006_.\u001bI{s\u000f9XJ\u00108\u0014\u007f=)Cn\tJza<h\u0001 6jAp6:\u0006\u001a;_m\u0006{\buh\u001bo\u0018\u001bb\"1'ulr\u001e", ">kP0X\u0013:P\u0019\u0006Vg+`\u00079n", ":`Q2_\u0017EO\u0017~v[3|", ">kP0X\u0013:P\u0019\u0006Vg+`\u00079nG=kBM\u0011+\u0012", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNDH lD3\u001c\u000f,\u001fh7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b9l\u0010`[\u000eQQT,\u0015k\b]\u001dX7A$iX\u0015$g]8\u000ezfZp\\\u0002rqU\u0019DH(\btWZO\u007fd\u0006_.\u001bI{s\u000f9XJ\u0012p6\u0003A4:c\u0018\u0015e\"Fi\u0003#,&Q+o=8'I[r?WE\nf\u001f]\u0005\u0015b\u000b\u0016\u000eF)JD\u0018\u0006j!_4t)~AZ\u0011HWo^7JHIW\u000e\u001f\u0019\u0016mUeEQ+a\u0001\u0007pR2f X", ";`c2e0:Zfx\b^3|\u0005=e", "7b^;66E]&", "BdgA66E]&"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class NavigationRailKt {
    private static final String IconLayoutIdTag = "icon";
    private static final float IndicatorHorizontalPadding;
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final float IndicatorVerticalPaddingNoLabel;
    private static final float IndicatorVerticalPaddingWithLabel;
    private static final int ItemAnimationDurationMillis = 150;
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationRailItemVerticalPadding;
    private static final float NavigationRailVerticalPadding;
    private static final float NavigationRailHeaderPadding = Dp.m6638constructorimpl(8);
    private static final float NavigationRailItemWidth = NavigationRailTokens.INSTANCE.m3350getContainerWidthD9Ej5fM();
    private static final float NavigationRailItemHeight = NavigationRailTokens.INSTANCE.m3353getNoLabelActiveIndicatorHeightD9Ej5fM();

    /* JADX INFO: renamed from: NavigationRail-qi6gXK8, reason: not valid java name */
    public static final void m2353NavigationRailqi6gXK8(Modifier modifier, long j2, long j3, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i2, final int i3) {
        int i4;
        long jM1947contentColorForek8zF_U = j3;
        long containerColor = j2;
        final WindowInsets windowInsets2 = windowInsets;
        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33 = function3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(118552648);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(NavigationRail)P(4,0:c#ui.graphics.Color,2:c#ui.graphics.Color,3,5)113@5242L14,114@5284L31,116@5431L12,123@5614L618,119@5501L731:NavigationRail.kt#uh7d8r");
        int i5 = (-1) - (((-1) - i3) | ((-1) - 1));
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(companion) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            int i6 = ((-1) - (((-1) - i3) | ((-1) - 2)) == 0 && composerStartRestartGroup.changed(containerColor)) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 4) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U)) ? 256 : 128)));
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function33) ? 2048 : 1024;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((i2 + 24576) - (i2 | 24576) == 0) {
            int i9 = ((-1) - (((-1) - i3) | ((-1) - 16)) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 16384 : 8192;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((i2 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function32) ? 131072 : 65536;
        }
        if ((-1) - (((-1) - 74899) | ((-1) - i4)) != 74898 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
                    containerColor = NavigationRailDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(containerColor, composerStartRestartGroup, (-1) - (((-1) - (i4 >> 3)) | ((-1) - 14)));
                    i4 &= -897;
                }
                if (i7 != 0) {
                    function33 = null;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    windowInsets2 = NavigationRailDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                    i4 &= -897;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(118552648, i4, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:118)");
            }
            int i10 = i4 & 14;
            int i11 = i4 << 3;
            int i12 = (-1) - (((-1) - ((i10 + 12582912) - (i10 & 12582912))) & ((-1) - (896 & i11)));
            int i13 = (i11 + 7168) - (i11 | 7168);
            SurfaceKt.m2561SurfaceT9BRK9s(companion, null, containerColor, jM1947contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-2092683357, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRail$1
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
                    ComposerKt.sourceInformation(composer2, "C124@5624L602:NavigationRail.kt#uh7d8r");
                    if ((-1) - (((-1) - i14) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2092683357, i14, -1, "androidx.compose.material3.NavigationRail.<anonymous> (NavigationRail.kt:124)");
                        }
                        Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m1020paddingVpY3zN4$default(SizeKt.m1070widthInVpY3zN4$default(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), windowInsets2), NavigationRailTokens.INSTANCE.m3350getContainerWidthD9Ej5fM(), 0.0f, 2, null), 0.0f, NavigationRailKt.getNavigationRailVerticalPadding(), 1, null));
                        Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM898spacedBy0680j_4 = Arrangement.INSTANCE.m898spacedBy0680j_4(NavigationRailKt.getNavigationRailVerticalPadding());
                        Function3<ColumnScope, Composer, Integer, Unit> function34 = function33;
                        Function3<ColumnScope, Composer, Integer, Unit> function35 = function32;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM898spacedBy0680j_4, centerHorizontally, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierSelectableGroup);
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
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 933375077, "C137@6207L9:NavigationRail.kt#uh7d8r");
                        composer2.startReplaceGroup(722845512);
                        ComposerKt.sourceInformation(composer2, "134@6103L8,135@6128L52");
                        if (function34 != null) {
                            function34.invoke(columnScopeInstance, composer2, 6);
                            SpacerKt.Spacer(SizeKt.m1049height3ABfNKs(Modifier.Companion, NavigationRailKt.NavigationRailHeaderPadding), composer2, 6);
                        }
                        composer2.endReplaceGroup();
                        function35.invoke(columnScopeInstance, composer2, 6);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i12 + i13) - (i12 & i13), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final long j4 = containerColor;
            final long j5 = jM1947contentColorForek8zF_U;
            final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function34 = function33;
            final WindowInsets windowInsets3 = windowInsets2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRail$2
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
                    NavigationRailKt.m2353NavigationRailqi6gXK8(modifier2, j4, j5, function34, windowInsets3, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
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
    public static final void NavigationRailItem(final boolean z2, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z3, Function2<? super Composer, ? super Integer, Unit> function22, boolean z4, NavigationRailItemColors navigationRailItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        ComposableLambda composableLambdaRememberComposableLambda;
        final Shape value;
        MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
        final NavigationRailItemColors navigationRailItemColorsColors = navigationRailItemColors;
        boolean z5 = z4;
        Function2<? super Composer, ? super Integer, Unit> function23 = function22;
        boolean z6 = z3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1533971045);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(NavigationRailItem)P(8,7,3,6,2,5)179@8055L8,185@8288L633,215@9569L2776:NavigationRail.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 & 6) == 0) {
            int i5 = composerStartRestartGroup.changed(z2) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 256 : 128)));
        }
        int i6 = (-1) - (((-1) - i3) | ((-1) - 8));
        if (i6 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 & 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 2048 : 1024)));
        }
        int i7 = (i3 + 16) - (i3 | 16);
        if (i7 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z6) ? 16384 : 8192)));
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 32));
        if (i8 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            int i9 = composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
            i4 = (i4 + i9) - (i4 & i9);
        }
        int i10 = i3 & 64;
        if (i10 != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changed(z5) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= ((i3 + 128) - (i3 | 128) == 0 && composerStartRestartGroup.changed(navigationRailItemColorsColors)) ? 8388608 : 4194304;
        }
        int i11 = (i3 + 256) - (i3 | 256);
        if (i11 != 0) {
            i4 = (i4 + 100663296) - (i4 & 100663296);
        } else if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((i4 + 38347923) - (38347923 | i4) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    z6 = true;
                }
                if (i8 != 0) {
                    function23 = null;
                }
                if (i10 != 0) {
                    z5 = true;
                }
                if ((i3 & 128) != 0) {
                    navigationRailItemColorsColors = NavigationRailItemDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-29360129)));
                }
                if (i11 != 0) {
                    mutableInteractionSource3 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 128) != 0) {
                    i4 = (i4 - 29360129) - (i4 | (-29360129));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1533971045, i4, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:181)");
            }
            composerStartRestartGroup.startReplaceGroup(-782588008);
            ComposerKt.sourceInformation(composerStartRestartGroup, "183@8207L39");
            if (mutableInteractionSource3 == null) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -782587357, "CC(remember):NavigationRail.kt#9igjgp");
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            } else {
                mutableInteractionSource2 = mutableInteractionSource3;
            }
            composerStartRestartGroup.endReplaceGroup();
            final NavigationRailItemColors navigationRailItemColors2 = navigationRailItemColorsColors;
            final boolean z7 = z6;
            final Function2<? super Composer, ? super Integer, Unit> function24 = function23;
            final boolean z8 = z5;
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1023357515, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
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
                    ComposerKt.sourceInformation(composer2, "C187@8335L201,193@8718L193:NavigationRail.kt#uh7d8r");
                    if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1023357515, i12, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:186)");
                        }
                        State<Color> stateM451animateColorAsStateeuL9pac = SingleValueAnimationKt.m451animateColorAsStateeuL9pac(navigationRailItemColors2.m2349iconColorWaAFU9c$material3_release(z2, z7), AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer2, 48, 12);
                        Modifier.Companion companionClearAndSetSemantics = (function24 == null || !(z8 || z2)) ? Modifier.Companion : SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }
                        });
                        Function2<Composer, Integer, Unit> function25 = function2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companionClearAndSetSemantics);
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
                        ComposerKt.sourceInformationMarkerStart(composer2, -296474437, "C194@8819L78:NavigationRail.kt#uh7d8r");
                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(invoke$lambda$0(stateM451animateColorAsStateeuL9pac))), function25, composer2, ProvidedValue.$stable);
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

                private static final long invoke$lambda$0(State<Color> state) {
                    return state.getValue().m4188unboximpl();
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(-782561860);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*200@9017L536");
            if (function23 == null) {
                composableLambdaRememberComposableLambda = null;
            } else {
                final NavigationRailItemColors navigationRailItemColors3 = navigationRailItemColorsColors;
                final boolean z9 = z6;
                final Function2<? super Composer, ? super Integer, Unit> function25 = function23;
                composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-105269599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
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
                        ComposerKt.sourceInformation(composer2, "C201@9082L5,203@9141L213,207@9371L168:NavigationRail.kt#uh7d8r");
                        if ((-1) - (((-1) - i12) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-105269599, i12, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:201)");
                            }
                            ProvideContentColorTextStyleKt.m2921ProvideContentColorTextStyle3JVO9M(invoke$lambda$0(SingleValueAnimationKt.m451animateColorAsStateeuL9pac(navigationRailItemColors3.m2350textColorWaAFU9c$material3_release(z2, z9), AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer2, 48, 12)), TypographyKt.getValue(NavigationRailTokens.INSTANCE.getLabelTextFont(), composer2, 6), function25, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    private static final long invoke$lambda$0(State<Color> state) {
                        return state.getValue().m4188unboximpl();
                    }
                }, composerStartRestartGroup, 54);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM1070widthInVpY3zN4$default = SizeKt.m1070widthInVpY3zN4$default(SizeKt.m1048defaultMinSizeVpY3zN4$default(SelectableKt.m1269selectableO2vRcR0(companion, z2, mutableInteractionSource2, null, z6, Role.m5926boximpl(Role.Companion.m5939getTabo7Vup1c()), function0), 0.0f, NavigationRailItemHeight, 1, null), NavigationRailItemWidth, 0.0f, 2, null);
            Alignment center = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, true);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1070widthInVpY3zN4$default);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 584386773, "C231@10130L157,*240@10571L7,246@10874L128,260@11450L261,268@11760L280,282@12301L27,276@12050L289:NavigationRail.kt#uh7d8r");
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z2 ? 1.0f : 0.0f, AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Density density = (Density) objConsume;
            long jOffset = OffsetKt.Offset((density.mo704roundToPx0680j_4(r1) - density.mo704roundToPx0680j_4(NavigationRailTokens.INSTANCE.m3348getActiveIndicatorWidthD9Ej5fM())) / 2, 0.0f);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -119672869, "CC(remember):NavigationRail.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(mutableInteractionSource2) | composerStartRestartGroup.changed(jOffset);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new MappedInteractionSource(mutableInteractionSource2, jOffset, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MappedInteractionSource mappedInteractionSource = (MappedInteractionSource) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (function23 != null) {
                composerStartRestartGroup.startReplaceGroup(585295320);
                ComposerKt.sourceInformation(composerStartRestartGroup, "252@11124L5");
                value = ShapesKt.getValue(NavigationRailTokens.INSTANCE.getActiveIndicatorShape(), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(585379857);
                ComposerKt.sourceInformation(composerStartRestartGroup, "254@11216L5");
                value = ShapesKt.getValue(NavigationRailTokens.INSTANCE.getNoLabelActiveIndicatorShape(), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(211026382, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$1$indicatorRipple$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12) {
                    ComposerKt.sourceInformation(composer2, "C264@11646L32,261@11468L229:NavigationRail.kt#uh7d8r");
                    if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(211026382, i12, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:261)");
                        }
                        BoxKt.Box(IndicationKt.indication(ClipKt.clip(LayoutIdKt.layoutId(Modifier.Companion, "indicatorRipple"), value), mappedInteractionSource, RippleKt.m2425rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7)), composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(-1862011490, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$1$indicator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12) {
                    ComposerKt.sourceInformation(composer2, "C271@11882L35,269@11778L248:NavigationRail.kt#uh7d8r");
                    if ((i12 + 3) - (3 | i12) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1862011490, i12, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:269)");
                        }
                        Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, "indicator");
                        ComposerKt.sourceInformationMarkerStart(composer2, -425107715, "CC(remember):NavigationRail.kt#9igjgp");
                        boolean zChanged2 = composer2.changed(stateAnimateFloatAsState);
                        final State<Float> state = stateAnimateFloatAsState;
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                            objRememberedValue3 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$1$indicator$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                    invoke2(graphicsLayerScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                    graphicsLayerScope.setAlpha(state.getValue().floatValue());
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        BoxKt.Box(BackgroundKt.m572backgroundbw27NRU(GraphicsLayerModifierKt.graphicsLayer(modifierLayoutId, (Function1) objRememberedValue3), navigationRailItemColorsColors.m2343getIndicatorColor0d7_KjU$material3_release(), value), composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -119627306, "CC(remember):NavigationRail.kt#9igjgp");
            boolean zChanged2 = composerStartRestartGroup.changed(stateAnimateFloatAsState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return stateAnimateFloatAsState.getValue();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            NavigationRailItemLayout(composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda4, composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda, z5, (Function0) objRememberedValue3, composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - 57344) | ((-1) - (i4 >> 6))))) & ((-1) - 438)));
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
            final boolean z10 = z5;
            final NavigationRailItemColors navigationRailItemColors4 = navigationRailItemColorsColors;
            final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
            final Modifier modifier2 = companion;
            final boolean z11 = z6;
            final Function2<? super Composer, ? super Integer, Unit> function26 = function23;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationRailKt.NavigationRailItem.2
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
                    NavigationRailKt.NavigationRailItem(z2, function0, function2, modifier2, z11, function26, z10, navigationRailItemColors4, mutableInteractionSource4, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavigationRailItemLayout(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final boolean z2, final Function0<Float> function0, Composer composer, final int i2) {
        int i3;
        int i4;
        boolean z3;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(1498399348);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(NavigationRailItemLayout)P(4,3,2,5)530@23300L1924,515@22904L2320:NavigationRail.kt#uh7d8r");
        if ((i2 + 6) - (i2 | 6) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function2) ? 4 : 2;
            i3 = (i6 + i2) - (i6 & i2);
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(function22) ? 32 : 16;
            i3 = (i3 + i7) - (i3 & i7);
        }
        Function2<? super Composer, ? super Integer, Unit> function25 = function23;
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function25) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function24) ? 2048 : 1024;
            i3 = (i3 + i8) - (i3 & i8);
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((-1) - (((-1) - 74899) | ((-1) - i3)) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1498399348, i3, -1, "androidx.compose.material3.NavigationRailItemLayout (NavigationRail.kt:514)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1881815062, "CC(remember):NavigationRail.kt#9igjgp");
            int i9 = 458752 & i3;
            int i10 = (57344 + i3) - (57344 | i3);
            int i11 = ((-1) - (((-1) - (i9 == 131072 ? 1 : 0)) & ((-1) - ((7168 & i3) == 2048 ? 1 : 0)))) | (i10 == 16384 ? 1 : 0);
            MeasurePolicy measurePolicyRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i11 != 0 || measurePolicyRememberedValue == Composer.Companion.getEmpty()) {
                measurePolicyRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItemLayout$2$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo375measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                        Measurable measurable;
                        Placeable placeableMo5514measureBRTryo0;
                        float fFloatValue = function0.invoke().floatValue();
                        long jM6582copyZbe2FdA$default = Constraints.m6582copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
                        int size = list.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            Measurable measurable2 = list.get(i12);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), InAppMessageBase.ICON)) {
                                Placeable placeableMo5514measureBRTryo02 = measurable2.mo5514measureBRTryo0(jM6582copyZbe2FdA$default);
                                float f2 = 2;
                                int width = placeableMo5514measureBRTryo02.getWidth() + measureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(NavigationRailKt.IndicatorHorizontalPadding * f2));
                                int iRoundToInt = MathKt.roundToInt(width * fFloatValue);
                                int height = placeableMo5514measureBRTryo02.getHeight() + measureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl((function24 == null ? NavigationRailKt.IndicatorVerticalPaddingNoLabel : NavigationRailKt.IndicatorVerticalPaddingWithLabel) * f2));
                                int size2 = list.size();
                                for (int i13 = 0; i13 < size2; i13++) {
                                    Measurable measurable3 = list.get(i13);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                        Placeable placeableMo5514measureBRTryo03 = measurable3.mo5514measureBRTryo0(Constraints.Companion.m6601fixedJhjzzOo(width, height));
                                        int size3 = list.size();
                                        int i14 = 0;
                                        while (true) {
                                            if (i14 >= size3) {
                                                measurable = null;
                                                break;
                                            }
                                            measurable = list.get(i14);
                                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "indicator")) {
                                                break;
                                            }
                                            i14++;
                                        }
                                        Measurable measurable4 = measurable;
                                        Placeable placeableMo5514measureBRTryo04 = measurable4 != null ? measurable4.mo5514measureBRTryo0(Constraints.Companion.m6601fixedJhjzzOo(iRoundToInt, height)) : null;
                                        if (function24 != null) {
                                            int size4 = list.size();
                                            for (int i15 = 0; i15 < size4; i15++) {
                                                Measurable measurable5 = list.get(i15);
                                                if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable5), Constants.ScionAnalytics.PARAM_LABEL)) {
                                                    placeableMo5514measureBRTryo0 = measurable5.mo5514measureBRTryo0(jM6582copyZbe2FdA$default);
                                                }
                                            }
                                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                        }
                                        placeableMo5514measureBRTryo0 = null;
                                        if (function24 == null) {
                                            return NavigationRailKt.m2356placeIconX9ElhV4(measureScope, placeableMo5514measureBRTryo02, placeableMo5514measureBRTryo03, placeableMo5514measureBRTryo04, j2);
                                        }
                                        Intrinsics.checkNotNull(placeableMo5514measureBRTryo0);
                                        return NavigationRailKt.m2357placeLabelAndIconzUg2_y0(measureScope, placeableMo5514measureBRTryo0, placeableMo5514measureBRTryo02, placeableMo5514measureBRTryo03, placeableMo5514measureBRTryo04, j2, z2, fFloatValue);
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(measurePolicyRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) measurePolicyRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2082816907, "C516@22921L17,517@22947L11,519@22968L50:NavigationRail.kt#uh7d8r");
            function2.invoke(composerStartRestartGroup, Integer.valueOf((-1) - (((-1) - i3) | ((-1) - 14))));
            function22.invoke(composerStartRestartGroup, Integer.valueOf((-1) - (((-1) - (i3 >> 3)) | ((-1) - 14))));
            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, "icon");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 402566553, "C519@23010L6:NavigationRail.kt#uh7d8r");
            int i12 = i3 >> 6;
            function25 = function25;
            function25.invoke(composerStartRestartGroup, Integer.valueOf((i12 + 14) - (i12 | 14)));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.startReplaceGroup(2145400941);
            ComposerKt.sourceInformation(composerStartRestartGroup, "523@23132L96,522@23061L221");
            if (function24 != null) {
                Modifier modifierLayoutId2 = LayoutIdKt.layoutId(Modifier.Companion, "label");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2145404101, "CC(remember):NavigationRail.kt#9igjgp");
                if (i10 == 16384) {
                    i4 = 131072;
                    z3 = true;
                } else {
                    i4 = 131072;
                    z3 = false;
                }
                boolean z4 = z3 | (i9 == i4);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue == Composer.Companion.getEmpty()) {
                    i5 = -692256719;
                    objRememberedValue = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItemLayout$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                            invoke2(graphicsLayerScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                            graphicsLayerScope.setAlpha(z2 ? 1.0f : function0.invoke().floatValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    i5 = -692256719;
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierLayoutId2, (Function1) objRememberedValue);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, i5, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 402815576, "C527@23261L7:NavigationRail.kt#uh7d8r");
                int i13 = i3 >> 9;
                function24.invoke(composerStartRestartGroup, Integer.valueOf((i13 + 14) - (i13 | 14)));
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
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationRailKt.NavigationRailItemLayout.3
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
                    NavigationRailKt.NavigationRailItemLayout(function2, function22, function26, function24, z2, function0, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: placeIcon-X9ElhV4, reason: not valid java name */
    public static final MeasureResult m2356placeIconX9ElhV4(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, long j2) {
        final int iM6608constrainWidthK40F9xA = ConstraintsKt.m6608constrainWidthK40F9xA(j2, Math.max(placeable.getWidth(), Math.max(placeable2.getWidth(), placeable3 != null ? placeable3.getWidth() : 0)));
        final int iM6607constrainHeightK40F9xA = ConstraintsKt.m6607constrainHeightK40F9xA(j2, measureScope.mo704roundToPx0680j_4(NavigationRailItemHeight));
        final int width = (iM6608constrainWidthK40F9xA - placeable.getWidth()) / 2;
        final int height = (iM6607constrainHeightK40F9xA - placeable.getHeight()) / 2;
        final int width2 = (iM6608constrainWidthK40F9xA - placeable2.getWidth()) / 2;
        final int height2 = (iM6607constrainHeightK40F9xA - placeable2.getHeight()) / 2;
        return MeasureScope.layout$default(measureScope, iM6608constrainWidthK40F9xA, iM6607constrainHeightK40F9xA, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$placeIcon$1
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
                Placeable placeable4 = placeable3;
                if (placeable4 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, (iM6608constrainWidthK40F9xA - placeable4.getWidth()) / 2, (iM6607constrainHeightK40F9xA - placeable4.getHeight()) / 2, 0.0f, 4, null);
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, height, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width2, height2, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: placeLabelAndIcon-zUg2_y0, reason: not valid java name */
    public static final MeasureResult m2357placeLabelAndIconzUg2_y0(final MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j2, final boolean z2, final float f2) {
        float height = placeable2.getHeight();
        float f3 = IndicatorVerticalPaddingWithLabel;
        float f4 = height + measureScope.mo710toPx0680j_4(f3);
        float f5 = NavigationRailItemVerticalPadding;
        float f6 = f4 + measureScope.mo710toPx0680j_4(f5) + placeable.getHeight();
        float f7 = 2;
        final float fCoerceAtLeast = RangesKt.coerceAtLeast((Constraints.m6592getMinHeightimpl(j2) - f6) / f7, measureScope.mo710toPx0680j_4(f3));
        float f8 = f6 + (fCoerceAtLeast * f7);
        final float height2 = ((z2 ? fCoerceAtLeast : (f8 - placeable2.getHeight()) / f7) - fCoerceAtLeast) * (1 - f2);
        final float height3 = placeable2.getHeight() + fCoerceAtLeast + measureScope.mo710toPx0680j_4(f3) + measureScope.mo710toPx0680j_4(f5);
        final int iM6608constrainWidthK40F9xA = ConstraintsKt.m6608constrainWidthK40F9xA(j2, Math.max(placeable2.getWidth(), Math.max(placeable.getWidth(), placeable4 != null ? placeable4.getWidth() : 0)));
        final int width = (iM6608constrainWidthK40F9xA - placeable.getWidth()) / 2;
        final int width2 = (iM6608constrainWidthK40F9xA - placeable2.getWidth()) / 2;
        final int width3 = (iM6608constrainWidthK40F9xA - placeable3.getWidth()) / 2;
        final float f9 = fCoerceAtLeast - measureScope.mo710toPx0680j_4(f3);
        return MeasureScope.layout$default(measureScope, iM6608constrainWidthK40F9xA, MathKt.roundToInt(f8), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationRailKt$placeLabelAndIcon$1
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
                Placeable placeable5 = placeable4;
                if (placeable5 != null) {
                    int i2 = iM6608constrainWidthK40F9xA;
                    float f10 = fCoerceAtLeast;
                    MeasureScope measureScope2 = measureScope;
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, (i2 - placeable5.getWidth()) / 2, MathKt.roundToInt((f10 - measureScope2.mo710toPx0680j_4(NavigationRailKt.IndicatorVerticalPaddingWithLabel)) + height2), 0.0f, 4, null);
                }
                if (z2 || f2 != 0.0f) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, MathKt.roundToInt(height3 + height2), 0.0f, 4, null);
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width2, MathKt.roundToInt(fCoerceAtLeast + height2), 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, width3, MathKt.roundToInt(f9 + height2), 0.0f, 4, null);
            }
        }, 4, null);
    }

    public static final float getNavigationRailVerticalPadding() {
        return NavigationRailVerticalPadding;
    }

    public static final float getNavigationRailItemWidth() {
        return NavigationRailItemWidth;
    }

    public static final float getNavigationRailItemHeight() {
        return NavigationRailItemHeight;
    }

    public static final float getNavigationRailItemVerticalPadding() {
        return NavigationRailItemVerticalPadding;
    }

    static {
        float f2 = 4;
        NavigationRailVerticalPadding = Dp.m6638constructorimpl(f2);
        NavigationRailItemVerticalPadding = Dp.m6638constructorimpl(f2);
        float f3 = 2;
        IndicatorHorizontalPadding = Dp.m6638constructorimpl(Dp.m6638constructorimpl(NavigationRailTokens.INSTANCE.m3348getActiveIndicatorWidthD9Ej5fM() - NavigationRailTokens.INSTANCE.m3351getIconSizeD9Ej5fM()) / f3);
        IndicatorVerticalPaddingWithLabel = Dp.m6638constructorimpl(Dp.m6638constructorimpl(NavigationRailTokens.INSTANCE.m3347getActiveIndicatorHeightD9Ej5fM() - NavigationRailTokens.INSTANCE.m3351getIconSizeD9Ej5fM()) / f3);
        IndicatorVerticalPaddingNoLabel = Dp.m6638constructorimpl(Dp.m6638constructorimpl(NavigationRailTokens.INSTANCE.m3353getNoLabelActiveIndicatorHeightD9Ej5fM() - NavigationRailTokens.INSTANCE.m3351getIconSizeD9Ej5fM()) / f3);
    }
}
