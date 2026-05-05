package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.internal.MappedInteractionSource;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
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
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:305)
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
/* JADX INFO: compiled from: NavigationItem.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яđ\u0014D߬)\u001ew\fLDiu\fA\u001c0\u0013.H~*, }\u000ffp>8DsH6ɟ[*\u001dt\u0004é,[:qKП]\u001a\u0014\"\u0011ѧVg}nRҙ\u0013C%\u0006\u001exp1QU\u000f]\u001aƁ:B\u0006?;Mu?A`\u000b6\rړ:\"Ny\r\u0001 +P\u0010\rzKŷ\u0014\u0012F@xíZ\r[\n\"\u0012\f?(\u00014\\oNLHtҗB/9\u0003qBT(g0\u0013M\u0015FZ0%Ɇ`,8X7c#UW\u0011\u0016j[m\u0013o{K\u0016\u0001-7-Ys\u0006D\u0007\u0012D$9b%h\u0003(l\u0005\u007fn:9˦ScQd>,\u0006\u0010\u0014\rj\u001a>\n5_F-H~8\u0012A\u000e\u000bSnS2bP\u001a\u0013ad\u001aU\u0004AFQ\u001b\u0015T\u0012?'jO{3\u0010N'\u000f\f9[\u0003\u0011\u0011\u0019)r\u0010Q_TpAVm\"Yk\u000e4tp#B\u0004^i03\n4F\u0017SG\fJ1E\u0004\u000fXFwv3n~R\u0018d͕D\"t*g;\u00171rQt\u0007{P\u0003fB\u0010{.Τ\u000b}\u000e'P`\u0006b9%>u\u007flw\u0013e]8NueǶXʤ«\u0012Y?\tA`iӀ\u000fo~\u000f\u0014mJ\u0013\tf\u000fZS:\b\r,0``j>',H\\#+2m\nLC:D1g%J\u0013\u001epO+\u001bރ^h\u0016\u0013\u000572)\u0002$#01aj\u0015\bt\tK<|\u000f0C@\u007fGԊ*U(|d\u000717\u0017y\u0010IwLu}\u001b(&Y\n:.\u001agT_A!*\u0017)`\u0005]IZ\u000f}Q{\u0015W~\u000b\u0017';\u00171\u0018\fx\u000fD`\u0019M\u0016Uј!Ԯ݈v%\u000e\u0017\u000e-yz\t{{T9\u0011fI!9\n@\\o\u0015\u0005MVU\u0005}[\u00155[{W!$2,/C\u001a\u000em}i\u0012b=b;eض+ϣ݁sdW\u001b@yP\u000eg>V\"R\"+Bv!(\fPIL\ra\u0001qh~\u000ePM9g.j\u0015e%p\u0005\u0014j\u0017}8L.\u000eb$G\fOvCSM}Wu\u000b\u0006K\u000b\u000e\u0011\u000fё\n֊ϥr\u0014\"~.\u0019o7\u0017s\u001esFki;\u0011;l\r2tD<6CsXw=(z.~\u0010\u0013%kZsi\u000f>X\u0007\u0017nH3\u0019ud/e\u0019~=oN|CM\u001dmtW_g@\u001ck\u001d7\u001e\u001bS\r\u0005=+rW\u007f\u001bвW۞խI_I\u000e\u0010{$S7Ԗ\u0004o:7nԀoÐ\u001c\u001bAܱ1k\u00050v\u000b\u0004c%ЉIՆjRVÝI\u000b\t}&<8\u000eaĂ\"ζsb5ًn\u0006EE2\u0001EG\u007fܐ\u000eƔgH#-\u00149MIWo,'*]*ȏPл$ /״\u0015-j^&f8\\qŰhޭ\u001ab\nƁ3d.\fFJ#u`ڕ\n˩S\n;\u0002!bqm}*N1K\u0001\u0014Mch'\r:ؚe߾Y\u0013\u000bf?Z\u0012p3\\+\u0013\u07b3M3\u001b[`ϲ-\u0002\u001fǮ\u0015Fȧ\u0019.-} bW\u0016&ɵֻp"}, d2 = {"\u0017b^;?(R])\u000e^]\u001bx\u000b", "", "\u0017mS6V(M]&evr6\r\u0018\u0013dn$}", "\u0017mS6V(M]&k~i7\u0004\t\u0016a\u00142\fOd\u0016\u0006Cq", "\u0017mS6V(M]&ozk;\u0001\u0007+li)|N\u0001&", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u0017sT:45B[\u0015\u000e~h5[\u0019<a\u000f,\u0006Ih\u001b\u001eNs\u001c", "", "\u001a`Q2_\u0013:g#\u000f\nB+k\u00051", "\u001c`e6Z(MW#\b^m,\u0005p3nb(\u007fB\u0004&", "5dc\u001bT=BU\u0015\u000e~h5`\u0018/mg,\u0005#\u0001\u001b\u0019J~", "u(5", "\u001c`e6Z(MW#\b^m,\u0005p3nq,zO\u0004", "5dc\u001bT=BU\u0015\u000e~h5`\u0018/mg,\u00052\u0005\u0016&J", "\u001c`e6Z(MW#\b^m,\u0005", "", "Ad[2V;>R", "", "=m29\\*D", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "7b^;", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", ":`Q2_\u001b>f(l\nr3|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "7mS6V(M]&l}Z7|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "7mS6V(M]&p~];\u007f", "7mS6V(M]&a\u0005k0\u0012\u00138t{/f<\u007f\u0016\u001bPq", "7mS6V(M]&ozk;\u0001\u0007+lj$z?\u0005 \u0019", "7mS6V(M]&m\u0005E(y\t6V\u007f5\u000bD~\u0013\u001e2k\r;z.7", "AsP?g\u0010<]\"m\u0005E(y\t6H\n5\u007fU\u000b &Cvx8u$9b\u007f", "Bn_\u0016V6G7(~\u0003O,\n\u00183c{/f<\u007f\u0016\u001bPq", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006_!F]\u007f\u001cFq 71R;s\u0012(\u001crnG\\", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "3mP/_,=", ":`Q2_", "0`S4X", "7b^;C6LW(\u0003\u0005g", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006_!F]\u007f\u001cFq 71R;s\u0018\u001c\u001fqLC\u0015g;R\u00010\u001d", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "\u001c`e6Z(MW#\b^m,\u0005P\u001dH|,H@\u0003", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b'c5'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\u001c\u001aWDj\u0004Q ~G\r$cP=oF/FuP@Rl.c\u001f)\u001bfBE.\"qb+l\u001a0\u0017w^\u0014vP\b1UJ\u0015\u00068y\u001fN<'&P<8}&,U\u007fv%{V~3\u007f7\u00124s>`\u0014Kt\u001c:eF^\u0015XR+(2K\u0017ITG\u0005lFkr&k\u0015\u001c8\u001c-\"drmL\u000e\u001a'\u0015e=li\u000f7\u001c\u0016B\u0013W\u001f&J\u007fF[\u0007j}m*wtPG$\u001e\u0006+x\u000e#o\u001a\u0001\u0012j\"%<_\u001ei\u0018f9cAV_^O>\u0016\u000b`G\u001e:M!u\u0015sk`m3:\u0003\u001aWj\u0014[EtaGy\u0019b\ndqz&rvL}5&n#GaCln/Th]2\"f4+#7:KVI}^\u0005#\u0013\r\u0012r\u0006^ENG}0HIN+KcX\u0001:iV\u001a5;\u001f?mr\u0016\u0018Bo>I{\u0018\u0004\u0003>B\u0011&41\u007fU\u001f1(?o\u001b\u0010\u0012of\r%\tcX$M D,,]n", "\u001c`e6Z(MW#\b^m,\u0005o+y\n8\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6Wd1WYL,2", "7mS6V(M]&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "/mX:T;B]\"i\bh.\n\t=s", "", "\u001c`e6Z(MW#\b^m,\u0005o+y\n8\u000b\bf\u001f\u0004:7l>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u0018'$hn5\u0005r0X\u007f\u0015Q\\[*\\(W$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buY\u0006\u0005j\u000e\b!\u00119h~\fD\u0013C\u0005\u0015K(/rU`c\u0003\u0011FVjse\u001ch\u001bk>D-\";y+qN=\u000e\u0006\\]H6`mqV ~AmC~c\u0010F\u007f^:\u0004+)T\nArBar:x7\r\u0001\u007f\u001dj\u000fZn\u001cG(}&4&B7/4K\u0017ITq?MN\u0017f.e\u0012\u0017-\u000b\u0012yFFD/\u000b\u0010\\$e9`rJ5\\\u000eIS}\u0015pS\u000fKj}\u001d\tP\u0002wmTM)T\u000eoT(eP", ">kP0X\u0010<]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "7b^;C3:Q\u0019zwe,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "7mS6V(M]&k~i7\u0004\t\u001al{&{<}\u001e\u0017", "7mS6V(M]&i\u0002Z*|\u0005,l\u007f", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ">kP0X\u0010<]\"Fm2\f\u0004\f 4", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNDH lD3\u001c\u000f,\u001fh7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b9l\u0010`[\u000eQQT,\u0015k\b]\u001dX7A$iX\u0015$g]8\u000ezfZp\\\u0002rqU\u0019DH(\btWZO\u007fd\u0006_.\u001bI{s\u000f9XJ\u00108\u0014\u007f=)Cn\tJza<h\u0001 6jAp6:\u0006\u001a;_m\u0006{\buh\u001bo\u0018\u001bb\"1'ulr\u001e", ">kP0X\u0013:P\u0019\u0006Vg+j\u0018+r\u000f\fyJ\n", ":`Q2_\u0017EO\u0017~v[3|", ">kP0X\u0013:P\u0019\u0006Vg+j\u0018+r\u000f\fyJ\n^ T\u007fX\bxs", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNDH lD3\u001c\u000f,\u001fh7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b9l\u0010`[\u000eQQT,\u0015k\b]\u001dX7A$iX\u0015$g]8\u000ezfZp\\\u0002rqU\u0019DH(\btWZO\u007fd\u0006_.\u001bI{s\u000f9XJ\u0012p6\u0003A4:c\u0018\u0015e\"Fi\u0003#,&Q+o=8'I[r?WE\nf\u001f]\u0005\u0015b\u000b\u0016y)L_Q\u000e\u0014g\u001bZH+]\u000b?]\u0010LI9%+\u0010\u0006>o\u0004%\u0018P\fmaWS(Tm\u001a~T)nf", ">kP0X\u0013:P\u0019\u0006Vg+k\u0013:I}2\u0005", ">kP0X\u0013:P\u0019\u0006Vg+k\u0013:I}2\u0005\b\r!#.|o ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNDH lD3\u001c\u000f,\u001fh7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b9l\u0010`[\u000eQQT,\u0015k\b]\u001dX7A$iX\u0015$g]8\u000ezfZp\\\u0002rqU\u0019DH(\btWZO\u007fd\u0006_.\u001bI{s\u000f9XJ\u0012p6\u0003A4:c\u0018\u0015e\"Fi\u0003#,&Q+o=8'I[r?WE\nf\u001f]\u0005\u0015b\u000b\u0016yFF'/\u000b\u0010\\$e9`rJ5\\\u000eIS}\u0015pV\u0003\fbu)\u0013\u001737MI?)d\u000e\u001a]D0o\u0018\u0012X", ";`c2e0:Zfx\b^3|\u0005=e", "7sT:J0=b\u001c"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class NavigationItemKt {
    private static final String IconLayoutIdTag = "icon";
    private static final String IndicatorLayoutIdTag = "indicator";
    private static final String IndicatorRippleLayoutIdTag = "indicatorRipple";
    private static final int ItemAnimationDurationMillis = 100;
    private static final String LabelLayoutIdTag = "label";
    private static final float NavigationItemMinWidth = NavigationRailKt.getNavigationRailItemWidth();
    private static final float NavigationItemMinHeight = NavigationRailKt.getNavigationRailItemHeight();
    private static final float IndicatorVerticalOffset = Dp.m6638constructorimpl(12);

    /* JADX INFO: renamed from: NavigationItem-SHbi2eg */
    public static final void m2329NavigationItemSHbi2eg(boolean z2, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, Shape shape, final float f2, float f3, float f4, float f5, float f6, final float f7, final NavigationItemColors navigationItemColors, final Modifier modifier, final boolean z3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final int i2, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        MappedInteractionSource mappedInteractionSource;
        Composer composerStartRestartGroup = composer.startRestartGroup(547979956);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(NavigationItem)P(15,14,3,12,6,9:c#ui.unit.Dp,5:c#ui.unit.Dp,8:c#ui.unit.Dp,7:c#ui.unit.Dp,16:c#ui.unit.Dp,17:c#ui.unit.Dp,1,13,2,11!1,4:c#material3.NavigationItemIconPosition)254@10949L438,281@11981L33,294@12438L24,283@12020L2390:NavigationItem.kt#uh7d8r");
        final boolean z4 = z2;
        if ((i3 & 6) == 0) {
            i5 = (-1) - (((-1) - (composerStartRestartGroup.changed(z4) ? 4 : 2)) & ((-1) - i3));
        } else {
            i5 = i3;
        }
        if ((i3 + 48) - (i3 | 48) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
            i5 = (i5 + i7) - (i5 & i7);
        }
        if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(textStyle) ? 2048 : 1024)));
        }
        Shape shape2 = shape;
        if ((-1) - (((-1) - i3) | ((-1) - 24576)) == 0) {
            int i8 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
            i5 = (i5 + i8) - (i5 & i8);
        }
        if ((-1) - (((-1) - i3) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            int i9 = composerStartRestartGroup.changed(f2) ? 131072 : 65536;
            i5 = (i5 + i9) - (i5 & i9);
        }
        float f8 = f3;
        if ((-1) - (((-1) - i3) | ((-1) - 1572864)) == 0) {
            i5 |= composerStartRestartGroup.changed(f8) ? 1048576 : 524288;
        }
        float f9 = f4;
        if ((i3 & 12582912) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(f9) ? 8388608 : 4194304)));
        }
        float f10 = f5;
        if ((-1) - (((-1) - i3) | ((-1) - 100663296)) == 0) {
            i5 |= composerStartRestartGroup.changed(f10) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        float f11 = f6;
        if ((-1) - (((-1) - i3) | ((-1) - 805306368)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(f11) ? 536870912 : 268435456)));
        }
        if ((i4 + 6) - (i4 | 6) == 0) {
            i6 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(f7) ? 4 : 2)));
        } else {
            i6 = i4;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 48)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(navigationItemColors) ? 32 : 16)));
        }
        if ((-1) - (((-1) - i4) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i6 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 24576)) == 0) {
            int i10 = composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
            i6 = (i6 + i10) - (i6 & i10);
        }
        if ((-1) - (((-1) - i4) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            int i11 = composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
            i6 = (i6 + i11) - (i6 & i11);
        }
        if ((i4 & 1572864) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(i2) ? 1048576 : 524288)));
        }
        if ((12582912 & i4) == 0) {
            i6 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 306783379)) != 306783378 || (4793491 + i6) - (4793491 | i6) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(547979956, i5, i6, "androidx.compose.material3.NavigationItem (NavigationItem.kt:252)");
            }
            final ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-44329638, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$styledIcon$1
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
                    ComposerKt.sourceInformation(composer2, "C258@11184L193:NavigationItem.kt#uh7d8r");
                    if ((-1) - (((-1) - i12) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-44329638, i12, -1, "androidx.compose.material3.NavigationItem.<anonymous> (NavigationItem.kt:255)");
                        }
                        long jM2318iconColorWaAFU9c = navigationItemColors.m2318iconColorWaAFU9c(z4, z3);
                        Modifier.Companion companionClearAndSetSemantics = function22 != null ? SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$styledIcon$1.1
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }
                        }) : Modifier.Companion;
                        Function2<Composer, Integer, Unit> function24 = function2;
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
                        ComposerKt.sourceInformationMarkerStart(composer2, -735818003, "C259@11285L78:NavigationItem.kt#uh7d8r");
                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(jM2318iconColorWaAFU9c)), function24, composer2, ProvidedValue.$stable);
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
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(-1735402128);
            ComposerKt.sourceInformation(composerStartRestartGroup, "264@11453L51");
            if (function23 != null) {
                composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1836184859, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1
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
                        ComposerKt.sourceInformation(composer2, "C264@11473L11,264@11486L16,264@11455L47:NavigationItem.kt#uh7d8r");
                        if ((i12 + 3) - (3 | i12) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1836184859, i12, -1, "androidx.compose.material3.NavigationItem.<anonymous> (NavigationItem.kt:264)");
                        }
                        final Function2<Composer, Integer, Unit> function24 = function23;
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(870803363, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                invoke(boxScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope boxScope, Composer composer3, int i13) {
                                ComposerKt.sourceInformation(composer3, "C264@11475L7:NavigationItem.kt#uh7d8r");
                                if ((-1) - (((-1) - i13) | ((-1) - 17)) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(870803363, i13, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:264)");
                                }
                                function24.invoke(composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        final Function2<Composer, Integer, Unit> function25 = composableLambdaRememberComposableLambda;
                        BadgeKt.BadgedBox(composableLambdaRememberComposableLambda2, null, ComposableLambdaKt.rememberComposableLambda(-1365557663, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$iconWithBadge$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                                invoke(boxScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BoxScope boxScope, Composer composer3, int i13) {
                                ComposerKt.sourceInformation(composer3, "C264@11488L12:NavigationItem.kt#uh7d8r");
                                if ((-1) - (((-1) - i13) | ((-1) - 17)) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1365557663, i13, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:264)");
                                }
                                function25.invoke(composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 390, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1735395524);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*271@11650L298");
            ComposableLambda composableLambdaRememberComposableLambda2 = function22 == null ? null : ComposableLambdaKt.rememberComposableLambda(-254668050, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$styledLabel$1$1
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
                    ComposerKt.sourceInformation(composer2, "C273@11757L177:NavigationItem.kt#uh7d8r");
                    if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-254668050, i12, -1, "androidx.compose.material3.NavigationItem.<anonymous>.<anonymous> (NavigationItem.kt:272)");
                        }
                        ProvideContentColorTextStyleKt.m2921ProvideContentColorTextStyle3JVO9M(navigationItemColors.m2319textColorWaAFU9c(z4, z3), textStyle, function22, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1735384277, "CC(remember):NavigationItem.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableIntState mutableIntState = (MutableIntState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            z4 = z4;
            Modifier modifierM1047defaultMinSizeVpY3zN4 = SizeKt.m1047defaultMinSizeVpY3zN4(SelectableKt.m1269selectableO2vRcR0(modifier, z4, mutableInteractionSource, null, z3, Role.m5926boximpl(Role.Companion.m5939getTabo7Vup1c()), function0), NavigationItemMinWidth, NavigationItemMinHeight);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1735369662, "CC(remember):NavigationItem.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function1) new Function1<IntSize, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                        m2338invokeozmzZPI(intSize.m6812unboximpl());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m2338invokeozmzZPI(long j2) {
                        mutableIntState.setIntValue(IntSize.m6808getWidthimpl(j2));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierM1047defaultMinSizeVpY3zN4, (Function1) objRememberedValue2);
            Alignment center = Alignment.Companion.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, true);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 872931531, "C299@12615L157,330@14002L27,323@13657L747:NavigationItem.kt#uh7d8r");
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z4 ? 1.0f : 0.0f, AnimationSpecKt.tween$default(100, 0, null, 6, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            composerStartRestartGroup.startReplaceGroup(-1634400795);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*310@13207L7,318@13501L136");
            if (NavigationItemIconPosition.m2323equalsimpl0(i2, NavigationItemIconPosition.Companion.m2328getTopxw1Ddg())) {
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                long jOffset = OffsetKt.Offset((NavigationItem_SHbi2eg$lambda$2(mutableIntState) - r11.mo704roundToPx0680j_4(f2)) / 2, ((Density) objConsume).mo710toPx0680j_4(IndicatorVerticalOffset));
                Unit unit = Unit.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1634380655, "CC(remember):NavigationItem.kt#9igjgp");
                boolean zChanged = composerStartRestartGroup.changed(jOffset) | ((-1) - (((-1) - i6) | ((-1) - 29360128)) == 8388608);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new MappedInteractionSource(mutableInteractionSource, jOffset, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                mappedInteractionSource = (MappedInteractionSource) objRememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            } else {
                mappedInteractionSource = null;
            }
            composerStartRestartGroup.endReplaceGroup();
            MutableInteractionSource mutableInteractionSource2 = mappedInteractionSource != null ? mappedInteractionSource : mutableInteractionSource;
            long jM2314getSelectedIndicatorColor0d7_KjU = navigationItemColors.m2314getSelectedIndicatorColor0d7_KjU();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1634364732, "CC(remember):NavigationItem.kt#9igjgp");
            boolean zChanged2 = composerStartRestartGroup.changed(stateAnimateFloatAsState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$2$3$1
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
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i12 = i5 << 3;
            int i13 = (-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - (((-1) - (((-1) - (i5 >> 6)) | ((-1) - 896))) | ((i6 >> 6) & 57344))) & ((-1) - (29360128 & i12))))) & ((-1) - ((-1) - (((-1) - 234881024) | ((-1) - i12))))))) & ((-1) - (i12 & 1879048192)));
            int i14 = (i5 >> 27) & 14;
            int i15 = (-1) - (((-1) - (i6 << 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            shape2 = shape2;
            f8 = f8;
            f9 = f9;
            f10 = f10;
            f11 = f11;
            m2330NavigationItemLayoutKmRXDg(mutableInteractionSource2, jM2314getSelectedIndicatorColor0d7_KjU, shape2, composableLambdaRememberComposableLambda, i2, composableLambdaRememberComposableLambda2, (Function0) objRememberedValue4, f8, f9, f10, f11, f7, composerStartRestartGroup, i13, (i14 + i15) - (i14 & i15));
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
            final float f12 = f8;
            final float f13 = f9;
            final float f14 = f10;
            final float f15 = f11;
            final boolean z5 = z4;
            final Shape shape3 = shape2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItem$3
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

                public final void invoke(Composer composer2, int i16) {
                    NavigationItemKt.m2329NavigationItemSHbi2eg(z5, function0, function2, textStyle, shape3, f2, f12, f13, f14, f15, f7, navigationItemColors, modifier, z3, function22, function23, i2, mutableInteractionSource, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i3) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i4));
                }
            });
        }
    }

    private static final int NavigationItem_SHbi2eg$lambda$2(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: renamed from: NavigationItemLayout-KmRX-Dg */
    public static final void m2330NavigationItemLayoutKmRXDg(final InteractionSource interactionSource, final long j2, final Shape shape, final Function2<? super Composer, ? super Integer, Unit> function2, final int i2, final Function2<? super Composer, ? super Integer, Unit> function22, Function0<Float> function0, final float f2, final float f3, final float f4, final float f5, final float f6, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        TopIconOrIconOnlyMeasurePolicy topIconOrIconOnlyMeasurePolicy;
        Composer composerStartRestartGroup = composer.startRestartGroup(1757687417);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(NavigationItemLayout)P(8,3:c#ui.graphics.Color,5,1,2:c#material3.NavigationItemIconPosition,9!1,4:c#ui.unit.Dp,7:c#ui.unit.Dp,6:c#ui.unit.Dp,10:c#ui.unit.Dp,11:c#ui.unit.Dp)356@14947L1719:NavigationItem.kt#uh7d8r");
        if ((i3 + 6) - (i3 | 6) == 0) {
            int i7 = composerStartRestartGroup.changed(interactionSource) ? 4 : 2;
            i5 = (i7 + i3) - (i7 & i3);
        } else {
            i5 = i3;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
            i5 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(shape) ? 256 : 128)));
        }
        if ((i3 & 3072) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024)));
        }
        if ((i3 + 24576) - (i3 | 24576) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(i2) ? 16384 : 8192)));
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i3)) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
            i5 = (i5 + i8) - (i5 & i8);
        }
        final Function0<Float> function02 = function0;
        if ((1572864 & i3) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288)));
        }
        if ((12582912 + i3) - (12582912 | i3) == 0) {
            int i9 = composerStartRestartGroup.changed(f2) ? 8388608 : 4194304;
            i5 = (i5 + i9) - (i5 & i9);
        }
        if ((i3 & 100663296) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(f3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((i3 & 805306368) == 0) {
            int i10 = composerStartRestartGroup.changed(f4) ? 536870912 : 268435456;
            i5 = (i5 + i10) - (i5 & i10);
        }
        if ((i4 & 6) == 0) {
            i6 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(f5) ? 4 : 2)));
        } else {
            i6 = i4;
        }
        if ((i4 + 48) - (i4 | 48) == 0) {
            i6 |= composerStartRestartGroup.changed(f6) ? 32 : 16;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 306783379)) == 306783378 && (i6 + 19) - (19 | i6) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1757687417, i5, i6, "androidx.compose.material3.NavigationItemLayout (NavigationItem.kt:355)");
            }
            if (function22 == null || NavigationItemIconPosition.m2323equalsimpl0(i2, NavigationItemIconPosition.Companion.m2328getTopxw1Ddg())) {
                function02 = function02;
                topIconOrIconOnlyMeasurePolicy = new TopIconOrIconOnlyMeasurePolicy(function22 != null, function02, f2, f3, f4, f6, null);
            } else {
                function02 = function02;
                topIconOrIconOnlyMeasurePolicy = new StartIconMeasurePolicy(function02, f2, f3, f5, null);
            }
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
            Updater.m3678setimpl(composerM3671constructorimpl, topIconOrIconOnlyMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1690051920, "C362@15191L32,359@15031L207,369@15552L31,367@15456L292,375@15761L50:NavigationItem.kt#uh7d8r");
            BoxKt.Box(IndicationKt.indication(ClipKt.clip(LayoutIdKt.layoutId(Modifier.Companion, IndicatorRippleLayoutIdTag), shape), interactionSource, RippleKt.m2425rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 0);
            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.Companion, IndicatorLayoutIdTag);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -776750382, "CC(remember):NavigationItem.kt#9igjgp");
            boolean z2 = (i5 + 3670016) - (3670016 | i5) == 1048576;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItemLayout$1$1$1
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
                        graphicsLayerScope.setAlpha(function02.invoke().floatValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            BoxKt.Box(BackgroundKt.m572backgroundbw27NRU(GraphicsLayerModifierKt.graphicsLayer(modifierLayoutId, (Function1) objRememberedValue), j2, shape), composerStartRestartGroup, 0);
            Modifier modifierLayoutId2 = LayoutIdKt.layoutId(Modifier.Companion, "icon");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId2);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 14502763, "C375@15803L6:NavigationItem.kt#uh7d8r");
            function2.invoke(composerStartRestartGroup, Integer.valueOf((-1) - (((-1) - (i5 >> 9)) | ((-1) - 14))));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.startReplaceGroup(-776741606);
            ComposerKt.sourceInformation(composerStartRestartGroup, "377@15861L52");
            if (function22 != null) {
                Modifier modifierLayoutId3 = LayoutIdKt.layoutId(Modifier.Companion, "label");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId3);
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
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 14602986, "C377@15904L7:NavigationItem.kt#uh7d8r");
                function22.invoke(composerStartRestartGroup, Integer.valueOf((-1) - (((-1) - (i5 >> 15)) | ((-1) - 14))));
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
            final Function0<Float> function03 = function02;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$NavigationItemLayout$2
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
                    NavigationItemKt.m2330NavigationItemLayoutKmRXDg(interactionSource, j2, shape, function2, i2, function22, function03, f2, f3, f4, f5, f6, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i3) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i4));
                }
            });
        }
    }

    /* JADX INFO: renamed from: placeIcon-X9ElhV4 */
    public static final MeasureResult m2335placeIconX9ElhV4(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, long j2) {
        int iM6608constrainWidthK40F9xA = ConstraintsKt.m6608constrainWidthK40F9xA(j2, placeable2.getWidth());
        int iM6607constrainHeightK40F9xA = ConstraintsKt.m6607constrainHeightK40F9xA(j2, placeable2.getHeight());
        final int width = (iM6608constrainWidthK40F9xA - placeable3.getWidth()) / 2;
        final int height = (iM6607constrainHeightK40F9xA - placeable3.getHeight()) / 2;
        final int width2 = (iM6608constrainWidthK40F9xA - placeable.getWidth()) / 2;
        final int height2 = (iM6607constrainHeightK40F9xA - placeable.getHeight()) / 2;
        final int width3 = (iM6608constrainWidthK40F9xA - placeable2.getWidth()) / 2;
        final int height3 = (iM6607constrainHeightK40F9xA - placeable2.getHeight()) / 2;
        return MeasureScope.layout$default(measureScope, iM6608constrainWidthK40F9xA, iM6607constrainHeightK40F9xA, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$placeIcon$1
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
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, width, height, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width2, height2, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width3, height3, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: placeLabelAndTopIcon-qoqLrGI */
    public static final MeasureResult m2337placeLabelAndTopIconqoqLrGI(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j2, float f2, float f3, float f4) {
        int iM6608constrainWidthK40F9xA = ConstraintsKt.m6608constrainWidthK40F9xA(j2, Math.max(placeable.getWidth(), placeable3.getWidth()));
        int iM6607constrainHeightK40F9xA = ConstraintsKt.m6607constrainHeightK40F9xA(j2, MathKt.roundToInt(placeable3.getHeight() + measureScope.mo710toPx0680j_4(f2) + placeable.getHeight() + (measureScope.mo710toPx0680j_4(f4) * 2)));
        final int i2 = measureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(f4 + f3));
        final int width = (iM6608constrainWidthK40F9xA - placeable2.getWidth()) / 2;
        final int width2 = (iM6608constrainWidthK40F9xA - placeable4.getWidth()) / 2;
        final int i3 = i2 - measureScope.mo704roundToPx0680j_4(f3);
        final int width3 = (iM6608constrainWidthK40F9xA - placeable.getWidth()) / 2;
        final int height = i2 + placeable2.getHeight() + measureScope.mo704roundToPx0680j_4(Dp.m6638constructorimpl(f2 + f3));
        final int width4 = (iM6608constrainWidthK40F9xA - placeable3.getWidth()) / 2;
        return MeasureScope.layout$default(measureScope, iM6608constrainWidthK40F9xA, iM6607constrainHeightK40F9xA, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$placeLabelAndTopIcon$1
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
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, width2, i3, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width3, height, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, i2, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, width4, i3, 0.0f, 4, null);
            }
        }, 4, null);
    }

    /* JADX INFO: renamed from: placeLabelAndStartIcon-nru01g4 */
    public static final MeasureResult m2336placeLabelAndStartIconnru01g4(MeasureScope measureScope, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, long j2, float f2) {
        int iM6608constrainWidthK40F9xA = ConstraintsKt.m6608constrainWidthK40F9xA(j2, placeable3.getWidth());
        int iM6607constrainHeightK40F9xA = ConstraintsKt.m6607constrainHeightK40F9xA(j2, placeable3.getHeight());
        final int width = (iM6608constrainWidthK40F9xA - placeable4.getWidth()) / 2;
        final int height = (iM6607constrainHeightK40F9xA - placeable4.getHeight()) / 2;
        final int height2 = (iM6607constrainHeightK40F9xA - placeable2.getHeight()) / 2;
        final int height3 = (iM6607constrainHeightK40F9xA - placeable.getHeight()) / 2;
        final int width2 = (iM6608constrainWidthK40F9xA - ((placeable2.getWidth() + measureScope.mo704roundToPx0680j_4(f2)) + placeable.getWidth())) / 2;
        final int width3 = placeable2.getWidth() + width2 + measureScope.mo704roundToPx0680j_4(f2);
        final int width4 = (iM6608constrainWidthK40F9xA - placeable3.getWidth()) / 2;
        final int height4 = (iM6607constrainHeightK40F9xA - placeable3.getHeight()) / 2;
        return MeasureScope.layout$default(measureScope, iM6608constrainWidthK40F9xA, iM6607constrainHeightK40F9xA, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.NavigationItemKt$placeLabelAndStartIcon$1
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
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, width, height, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width3, height3, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width2, height2, 0.0f, 4, null);
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, width4, height4, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public static final float getNavigationItemMinWidth() {
        return NavigationItemMinWidth;
    }

    public static final float getNavigationItemMinHeight() {
        return NavigationItemMinHeight;
    }
}
