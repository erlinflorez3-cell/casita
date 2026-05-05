package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: PullToRefresh.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яć\u0014D߬)\u001e\u007f\u007fLDqy\fǻ\u000e0!.J~(.\u001aw\u0015lr96MmHDR[*\u0015k\u000442[,qY;]ڼ\u0006\"\u001fOVgmpRZ\u0019L\u0017\u0006\u001cxr,_U\u0001ز\u001a\u000fHBwЀ;M\u0006=Aś|6\u001b :\"Ny\r\u00010*P\u0010\rzKK\u0012\u00168@\u0007:Z҈U\u00050\u0012\u000ē(\u00014\\oN<Vt]P/+\u0003oFf5mB\u0015M;Y\u0005+\u001b\u000by\u001eY@}5-Ka\u0018\u001fR\nU3I\u007fQ\u001dn7);I\"Wdo0\u0018#Cg\r\f\fl]՝PӠВ+-U}Yk&&\u0006\u0017\u0014\rj\u001a>\n5eF-H\u00058\u0018A\u0014\u000bYPR\u0012^p\u0016)xf\u001d+\u007fAKQ\u001b\u0015r\u0012A\u001fNE\u001e\u001d\rLF1t'[b2x\u0015Iy(m7QNc`d\u001a[Mm2\u0019r\u0004:\u0004^].Vɨ\u0015.\u001dNھ_9)K\u001c\u001cVo\u007f\r\u0015bxS\u0018zXB2nDMX0ɔ^Dj.\u07fbTT^VWRɟX\u0007\f4+&j%T!S3\u0015T\u0001tx{u\nSR-<֍rk\u001c\u0007Q#Aeic>wzvBplf\u0013\u000b~B\u0002?\u000b`6VJH\u0019E(\u007fRf$\u0013`X\" BbI\u0019\u000b\u0015x\u0007,yY|7r\u000bl\u001e7l3R\u00050$܈\bɖ˩`ru!\u0007\u0004D9n]EA\u007fKA&\u0004S\u00198\u000b;\u001f~\"\u0019wkZ}dlDu\u0006\u007f.M29\u007fBm\u0017\u001d;A20buP\u0001\u001eiM@)A|ʣ\u000e\u0090ÿ2i\u000e(~jx1X\u000fl\u0017P\u0018\u0007rQ)\u0015\u0004\b~^zu\u0002\u0005\u000fi`ar1|lT>|\u0013_6%/\u000eR\u0003;-Qh5\u0016&\u0016_\u001fo|\u0002u>{r\u000fT\u000b\u0014\u001brhޗn̥жa4AzW\u001d\u0017\u000b0h\u0005\u0003pi\u0013w6c98\u001bU`A\u0013\u0014\u0007<[(G}\u0015%\\\u0013vVi{+o,6^e0sQC,^qkASYg{5c\\9c?\u0010\u0011{?7*\u001ck\"\u001d\\ƻ\bݵӒw\u001a<\u000bI-%N\u0017ӗL2L\n\u001bC\u0003i4\u000fQėHݍ\u0013\u0017:߿\u0014Id\u000flx\u000bX\u001fζb҇d#2\u0001\r\u0012S,\u00079I\u0005\u001cH+Вe҅\u0005U%\t)mo\rt*CD\u0003;qμZ܁\u000fGeCW\u0005V\u0010U/\u0006k\u001e\u0013\u000f\u0091OܫF\u0018#ʃq\u001dm~H^9U;̲7ʝ\u0016fZƉB5\r\u0004\u0015\u000ej\neԨk۽voj\u03a2lZ\u0006A[\u001a/\u0017\u001b͋YѼ\u0001cNɑM\u0012C8UI\u0019\u0014}ض*ĺ?}\u0010¶@;\u0012\u00019\\\u0006\u0010=ŋ_Ό>\u001ey\u0016p\u0005!\u0015V-\u0012<j\t\u0001\u0019F\bdQXְ\u0004եbasw/C?-r\u0016PY\t\u0007\u0018t\u0005c\u001dWaӉhܕZ{v-^ ԗ'R6\u0016^ŶV?Rޙ\\\\ך\u0018\u001d4kN\b\u0011)fˡɯh"}, d2 = {"\u000fk_5T\u001bPS\u0019\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIm\u00167;N;i\n", "", "\u000fqR\u001fT+Bc'", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u000fqa<j\u000f>W\u001b\u0002\n", "\u000fqa<j\u001eBR(\u0002", "\u0011q^@f-:R\u0019]\u000bk(\f\r9ng6", "", "\u0012qP4@<Eb\u001d\n\u0002b,\n", "\u001b`g\u000e_7AO", "\u001b`g\u001de6@`\u0019\r\t:9z", "\u001bh]\u000e_7AO", "!oX;a,K1#\b\nZ0\u0006\t<S\u0004={", "5dc c0G\\\u0019\fXh5\f\u00053n\u007f5iD\u0016\u0017", "u(5", "!oX;a,KA\u001d\u0014z", "5dc c0G\\\u0019\fhbA|", "!sa<^,0W\u0018\u000e}", "\u000fqa<j\u001d:Z)~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u00025<`\r*Dm\u0017;MQ>5\u0010+\"rs*\u0003j<N\u0005|", ">q^4e,La", "\u0011ha0h3:`t\f\bh>g\u00169g\r(\nNd \u0016Km\nK\u00012", "", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "\u0011ha0h3:`t\f\bh>g\u00169g\r(\nNd \u0016Km\nK\u00012|Fh(+M\u001c4", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0005\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u00047P[R4\\\u001cPG\u001c\u001dd\u001cN8bh\u001d2", "\u001et[9G6+S\u001a\fzl/Y\u0013B", "7rA2Y9>a\u001c\u0003\u0004`", "", "=mA2Y9>a\u001c", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u00025<`\r*Dm\u0017;MQ>5\u001f.\u001coPCsc-[v5J:](kRH", "1n]AX5M/ \u0003|g4|\u0012>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", "7mS6V(M]&", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7r8`19u?\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "1n]AX5M", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!gA\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005p|\u001b\u0016\u001b9fw\u0010 \u001bW\u0001\u001c\u0005K6hGf_\bJ\u000b0r1kzi\n\\;G$\"t\u0007*d_._bO\u001aq_\u0004kfZbxB,IwiF\u000f\u007fY\u0006P.#M\u0005\u007f\u0012;gJ\u0012z7\u0013;.?.\n\\oa?n\u0002\u0013;`K04\u007f\u001d#HIryvG[>\u0006g\u0012\u001di9:bjvk\u0012\u0010\u0017f\u0015j9kh\u000f\u00013\u0016GG~\u00191OL\u0018Bu\u001e\b\u0014.qd\\\r\u0019^\t%zR\")\u001e\u0013\fu\u001c$._\u001bc\u0017s4m7ZhlL{|", "\u001et[9G6+S\u001a\fzl/j\u0018+t\u007f", "@d\\2`)>`\u0004\u000f\u0002e\u001b\u0007u/f\r(\nCn&\u0013Vo", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016V(kR\u007fA\u0010\u0019(WY;\u0014\fhK1nED\u001f\u0016/\u0013lKo\bz z5k}Bd\u00135\t\u0011\u0005A~", "2qPD49K]+", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "/qa<j", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "0nd;W:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "/k_5T", "D`[BX:", "Asa<^,0W\u0018\u000e}", "2qPD49K]+F\u000b=9\u0010j)w", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b&{@B\"\f*WK&d\u0010\u000fkt1soO`\u0014F\r^sK1sPg_CWE\u000fd*n\u0014_,iN\u0004\u0011\u0014o(pM1\u0015\u0006\u0005R\u001e|Vxz1E#\u0003C.Lm%NA~UIx#&\u0019E\u0003\"9_\u00045\u0002-\u0005A*DgN't%Hpi\u00113lA5{\u0017\u007f\u0004", "2qPD60KQ)\u0006vk\u0010\u0006\b3c{7\u0006M", "/qR\u000fb<GR'", "2qPD60KQ)\u0006vk\u0010\u0006\b3c{7\u0006MH|,[N\u001b\nb", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u00023W\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#I }DD#\u00043\u0017KFx\b\u0013%\u0018BjqOV\u001eJCp\u0003N3z7Uf\nGO\u001bI&m\u000bl'`9Mm\u0012{!&r^.S\fWZtR\u0004ogV&\u000f\u0002\u0011>kj\u001c&3F", ">t[9G6+S\u001a\fzl/", "3mP/_,=", "Bga2f/HZ\u0018", ">t[9G6+S\u001a\fzl/D}}Hm\bl,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000bNd\u001c@l#8QBN52(\u001dskG\u0007-4J\u0006'TPJ3*\u001c}M\u001b\u0019i\u0018[+\u000e\u0012YO'8/G&\u000f\u001bSn;i\u000e\f$\u0011#ylQVe<Z{{K8oJb)~XI\u000fc:m\nn!fCHmt\u0002\"\u0019wT8\u0013F)TYN\u0003ftQ\u001dyKm<wcQO}U\u0006\u0005+h3\u0006v\u00163\\t8J", ">t[9G6+S\u001a\fzl/`\u0012.i}$\u000bJ\u000e", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1n]AT0GS&\\\u0005e6\n", "3kTCT;B]\"", ">t[9G6+S\u001a\fzl/`\u0012.i}$\u000bJ\u000e^)7nt\u001cd#", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pk(]v4KHUy&]\u0003D\u001b!d\u001bN,\u001a\u0005gDmYT>&v66\u0002<u\u0001\u001a\u0019{Df\u007fB,\u0005(`\u0011~@6rJXrCEKMm4r\f)-`\u0004<1\u0010|\u001c\u001ff^ww~O\u001cr(^H+.\u0015\u000471HqZY\u000fm_D\u007f1-KE\b\u0016{@~*x.\b47\f", ";`c2e0:Zfx\b^3|\u0005=e", "B`a4X;\u001aZ$\u0002v"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PullToRefreshKt {
    private static final int CrossfadeDurationMs = 100;
    private static final float DragMultiplier = 0.5f;
    private static final float MaxAlpha = 1.0f;
    private static final float MaxProgressArc = 0.8f;
    private static final float MinAlpha = 0.3f;
    private static final float StrokeWidth = Dp.m6638constructorimpl((float) 2.5d);
    private static final float ArcRadius = Dp.m6638constructorimpl((float) 5.5d);
    private static final float SpinnerSize = Dp.m6638constructorimpl(16);
    private static final float SpinnerContainerSize = Dp.m6638constructorimpl(40);
    private static final float ArrowWidth = Dp.m6638constructorimpl(10);
    private static final float ArrowHeight = Dp.m6638constructorimpl(5);
    private static final TweenSpec<Float> AlphaTween = AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearEasing(), 2, null);

    public static final void PullToRefreshBox(final boolean z2, final Function0<Unit> function0, Modifier modifier, PullToRefreshState pullToRefreshState, Alignment alignment, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i2, final int i3) {
        int i4;
        final PullToRefreshState pullToRefreshStateRememberPullToRefreshState = pullToRefreshState;
        final ComposableLambda composableLambdaRememberComposableLambda = function3;
        final Alignment topStart = alignment;
        final Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1902956467);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PullToRefreshBox)P(3,5,4,6,1,2)124@5580L28,126@5713L163,135@5931L199:PullToRefresh.kt#djiw08");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 & 6) == 0) {
            int i5 = composerStartRestartGroup.changed(z2) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 & 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function0) ? 32 : 16)));
        }
        int i6 = (i3 + 4) - (i3 | 4);
        if (i6 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 256 : 128)));
        }
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((-1) - (((-1) - i3) | ((-1) - 8)) == 0 && composerStartRestartGroup.changed(pullToRefreshStateRememberPullToRefreshState)) ? 2048 : 1024)));
        }
        int i7 = i3 & 16;
        if (i7 != 0) {
            i4 = (i4 + 24576) - (i4 & 24576);
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(topStart) ? 16384 : 8192;
        }
        int i8 = i3 & 32;
        if (i8 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(composableLambdaRememberComposableLambda) ? 131072 : 65536)));
        }
        if ((i3 & 64) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 1572864));
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            int i9 = composerStartRestartGroup.changedInstance(function32) ? 1048576 : 524288;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((599187 + i4) - (599187 | i4) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    pullToRefreshStateRememberPullToRefreshState = rememberPullToRefreshState(composerStartRestartGroup, 0);
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
                if (i7 != 0) {
                    topStart = Alignment.Companion.getTopStart();
                }
                if (i8 != 0) {
                    composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1989171225, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt.PullToRefreshBox.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                            invoke(boxScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope boxScope, Composer composer2, int i10) {
                            int i11 = i10;
                            ComposerKt.sourceInformation(composer2, "C127@5723L147:PullToRefresh.kt#djiw08");
                            if ((6 & i11) == 0) {
                                i11 = (-1) - (((-1) - i11) & ((-1) - (composer2.changed(boxScope) ? 4 : 2)));
                            }
                            if ((i11 & 19) != 18 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1989171225, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox.<anonymous> (PullToRefresh.kt:127)");
                                }
                                PullToRefreshDefaults.INSTANCE.m3002Indicator2poqoh4(pullToRefreshStateRememberPullToRefreshState, z2, boxScope.align(Modifier.Companion, Alignment.Companion.getTopCenter()), 0L, 0L, 0.0f, composer2, 1572864, 56);
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
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 + 8) - (i3 | 8) != 0) {
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1902956467, i4, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:134)");
            }
            Modifier modifierM3016pullToRefreshZ4HSEVQ$default = m3016pullToRefreshZ4HSEVQ$default(companion, z2, pullToRefreshStateRememberPullToRefreshState, false, 0.0f, function0, 12, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topStart, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM3016pullToRefreshZ4HSEVQ$default);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1101976897, "C139@6095L9,140@6113L11:PullToRefresh.kt#djiw08");
            int i10 = i4 >> 15;
            function32.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((i10 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i10 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) | 6));
            int i11 = i4 >> 12;
            composableLambdaRememberComposableLambda.invoke(boxScopeInstance, composerStartRestartGroup, Integer.valueOf(((i11 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i11 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) | 6));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt.PullToRefreshBox.3
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
                    boolean z3 = z2;
                    Function0<Unit> function02 = function0;
                    Modifier modifier2 = companion;
                    PullToRefreshState pullToRefreshState2 = pullToRefreshStateRememberPullToRefreshState;
                    Alignment alignment2 = topStart;
                    Function3<BoxScope, Composer, Integer, Unit> function33 = composableLambdaRememberComposableLambda;
                    Function3<BoxScope, Composer, Integer, Unit> function34 = function32;
                    int i13 = i2;
                    PullToRefreshKt.PullToRefreshBox(z3, function02, modifier2, pullToRefreshState2, alignment2, function33, function34, composer2, RecomposeScopeImplKt.updateChangedFlags((i13 + 1) - (i13 & 1)), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: pullToRefreshIndicator-wUdLESc$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3018pullToRefreshIndicatorwUdLESc$default(Modifier modifier, PullToRefreshState pullToRefreshState, boolean z2, float f2, Shape shape, long j2, float f3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            f2 = PullToRefreshDefaults.INSTANCE.m3004getPositionalThresholdD9Ej5fM();
        }
        if ((8 & i2) != 0) {
            shape = PullToRefreshDefaults.INSTANCE.getShape();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            j2 = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            f3 = PullToRefreshDefaults.INSTANCE.m3003getElevationD9Ej5fM();
        }
        return m3017pullToRefreshIndicatorwUdLESc(modifier, pullToRefreshState, z2, f2, shape, j2, f3);
    }

    /* JADX INFO: renamed from: pullToRefreshIndicator-wUdLESc, reason: not valid java name */
    public static final Modifier m3017pullToRefreshIndicatorwUdLESc(Modifier modifier, final PullToRefreshState pullToRefreshState, final boolean z2, final float f2, final Shape shape, long j2, final float f3) {
        return BackgroundKt.m572backgroundbw27NRU(GraphicsLayerModifierKt.graphicsLayer(DrawModifierKt.drawWithContent(SizeKt.m1063size3ABfNKs(modifier, SpinnerContainerSize), new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$pullToRefreshIndicator$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                int iM4167getIntersectrtfAjoo = ClipOp.Companion.m4167getIntersectrtfAjoo();
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo4658clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, iM4167getIntersectrtfAjoo);
                    contentDrawScope.drawContent();
                } finally {
                    drawContext.getCanvas().restore();
                    drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
                }
            }
        }), new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$pullToRefreshIndicator$2
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
                boolean z3 = pullToRefreshState.getDistanceFraction() > 0.0f || z2;
                graphicsLayerScope.setTranslationY((pullToRefreshState.getDistanceFraction() * graphicsLayerScope.mo704roundToPx0680j_4(f2)) - Size.m4003getHeightimpl(graphicsLayerScope.mo4365getSizeNHjbRc()));
                graphicsLayerScope.setShadowElevation(z3 ? graphicsLayerScope.mo710toPx0680j_4(f3) : 0.0f);
                graphicsLayerScope.setShape(shape);
                graphicsLayerScope.setClip(true);
            }
        }), j2, shape);
    }

    /* JADX INFO: renamed from: pullToRefresh-Z4HSEVQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3016pullToRefreshZ4HSEVQ$default(Modifier modifier, boolean z2, PullToRefreshState pullToRefreshState, boolean z3, float f2, Function0 function0, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z3 = true;
        }
        if ((i2 & 8) != 0) {
            f2 = PullToRefreshDefaults.INSTANCE.m3004getPositionalThresholdD9Ej5fM();
        }
        return m3015pullToRefreshZ4HSEVQ(modifier, z2, pullToRefreshState, z3, f2, function0);
    }

    /* JADX INFO: renamed from: pullToRefresh-Z4HSEVQ, reason: not valid java name */
    public static final Modifier m3015pullToRefreshZ4HSEVQ(Modifier modifier, boolean z2, PullToRefreshState pullToRefreshState, boolean z3, float f2, Function0<Unit> function0) {
        return modifier.then(new PullToRefreshElement(z2, function0, z3, pullToRefreshState, f2, null));
    }

    public static final PullToRefreshState rememberPullToRefreshState(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 318623070, "C(rememberPullToRefreshState)513@19156L83:PullToRefresh.kt#djiw08");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(318623070, i2, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:512)");
        }
        PullToRefreshStateImpl pullToRefreshStateImpl = (PullToRefreshStateImpl) RememberSaveableKt.m3764rememberSaveable(new Object[0], (Saver) PullToRefreshStateImpl.Companion.getSaver(), (String) null, (Function0) new Function0<PullToRefreshStateImpl>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt.rememberPullToRefreshState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final PullToRefreshStateImpl invoke() {
                return new PullToRefreshStateImpl();
            }
        }, composer, 3072, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return pullToRefreshStateImpl;
    }

    public static final PullToRefreshState PullToRefreshState() {
        return new PullToRefreshStateImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: CircularArrowProgressIndicator-RPmYEkk, reason: not valid java name */
    public static final void m3009CircularArrowProgressIndicatorRPmYEkk(final Function0<Float> function0, final long j2, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-569718810);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CircularArrowProgressIndicator)P(1,0:c#ui.graphics.Color)562@20583L61,564@20745L76,565@20843L74,567@20982L98,571@21118L443,566@20922L639:PullToRefresh.kt#djiw08");
        if ((6 & i2) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(function0) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            int i5 = composerStartRestartGroup.changed(j2) ? 32 : 16;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-569718810, i3, -1, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:561)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1136642763, "CC(remember):PullToRefresh.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object obj = objRememberedValue;
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                Path Path = AndroidPath_androidKt.Path();
                Path.mo4071setFillTypeoQ8Xj4U(PathFillType.Companion.m4460getEvenOddRgk1Os());
                composerStartRestartGroup.updateRememberedValue(Path);
                obj = Path;
            }
            final Path path = (Path) obj;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1136647962, "CC(remember):PullToRefresh.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$targetAlpha$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(function0.invoke().floatValue() < 1.0f ? 0.3f : 1.0f);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(CircularArrowProgressIndicator_RPmYEkk$lambda$4((State) objRememberedValue2), AlphaTween, 0.0f, null, null, composerStartRestartGroup, 48, 28);
            Modifier.Companion companion = Modifier.Companion;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1136655568, "CC(remember):PullToRefresh.kt#9igjgp");
            int i6 = i3 & 14;
            boolean z2 = i6 == 4;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$1$1
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
                        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function0.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierM1063size3ABfNKs = SizeKt.m1063size3ABfNKs(SemanticsModifierKt.semantics(companion, true, (Function1) objRememberedValue3), SpinnerSize);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1136660265, "CC(remember):PullToRefresh.kt#9igjgp");
            boolean z3 = (-1) - (((-1) - ((-1) - (((-1) - ((i6 == 4 ? 1 : 0) | (composerStartRestartGroup.changed(stateAnimateFloatAsState) ? 1 : 0))) & ((-1) - ((-1) - (((-1) - i3) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) != 32 ? 0 : 1))) != 1 ? 0 : 1)) & ((-1) - (composerStartRestartGroup.changedInstance(path) ? 1 : 0))) == 1;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) throws Throwable {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) throws Throwable {
                        ArrowValues ArrowValues = PullToRefreshKt.ArrowValues(function0.invoke().floatValue());
                        float fFloatValue = stateAnimateFloatAsState.getValue().floatValue();
                        float rotation = ArrowValues.getRotation();
                        long j3 = j2;
                        Path path2 = path;
                        long jMo4733getCenterF1C5BW0 = drawScope.mo4733getCenterF1C5BW0();
                        DrawContext drawContext = drawScope.getDrawContext();
                        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        try {
                            drawContext.getTransform().mo4661rotateUv8p0NA(rotation, jMo4733getCenterF1C5BW0);
                            Rect rectM3976Rect3MmeM6k = RectKt.m3976Rect3MmeM6k(androidx.compose.ui.geometry.SizeKt.m4016getCenteruvyYCjk(drawScope.mo4734getSizeNHjbRc()), drawScope.mo710toPx0680j_4(PullToRefreshKt.ArcRadius) + (drawScope.mo710toPx0680j_4(PullToRefreshKt.StrokeWidth) / 2.0f));
                            try {
                                PullToRefreshKt.m3014drawCircularIndicatorKzyDr3Q(drawScope, j3, fFloatValue, ArrowValues, rectM3976Rect3MmeM6k, PullToRefreshKt.StrokeWidth);
                                PullToRefreshKt.m3013drawArrowuDrxG_w(drawScope, path2, rectM3976Rect3MmeM6k, j3, fFloatValue, ArrowValues, PullToRefreshKt.StrokeWidth);
                                drawContext.getCanvas().restore();
                                drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
                            } catch (Throwable th) {
                                th = th;
                                drawContext.getCanvas().restore();
                                drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CanvasKt.Canvas(modifierM1063size3ABfNKs, (Function1) objRememberedValue4, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    Function0<Float> function02 = function0;
                    long j3 = j2;
                    int i8 = i2;
                    PullToRefreshKt.m3009CircularArrowProgressIndicatorRPmYEkk(function02, j3, composer2, RecomposeScopeImplKt.updateChangedFlags((i8 + 1) - (i8 & 1)));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawCircularIndicator-KzyDr3Q, reason: not valid java name */
    public static final void m3014drawCircularIndicatorKzyDr3Q(DrawScope drawScope, long j2, float f2, ArrowValues arrowValues, Rect rect, float f3) {
        DrawScope.m4713drawArcyD3GUKo$default(drawScope, j2, arrowValues.getStartAngle(), arrowValues.getEndAngle() - arrowValues.getStartAngle(), false, rect.m3972getTopLeftF1C5BW0(), rect.m3970getSizeNHjbRc(), f2, new Stroke(drawScope.mo710toPx0680j_4(f3), 0.0f, StrokeCap.Companion.m4531getButtKaPHkGw(), 0, null, 26, null), null, 0, 768, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrowValues ArrowValues(float f2) {
        float fMax = (Math.max(Math.min(1.0f, f2) - 0.4f, 0.0f) * 5) / 3;
        float fCoerceIn = RangesKt.coerceIn(Math.abs(f2) - 1.0f, 0.0f, 2.0f);
        float fPow = (((0.4f * fMax) - 0.25f) + (fCoerceIn - (((float) Math.pow(fCoerceIn, 2)) / 4))) * 0.5f;
        float f3 = SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS;
        return new ArrowValues(fPow, fPow * f3, ((0.8f * fMax) + fPow) * f3, Math.min(1.0f, fMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawArrow-uDrxG_w, reason: not valid java name */
    public static final void m3013drawArrowuDrxG_w(DrawScope drawScope, Path path, Rect rect, long j2, float f2, ArrowValues arrowValues, float f3) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f4 = ArrowWidth;
        path.lineTo((drawScope.mo710toPx0680j_4(f4) * arrowValues.getScale()) / 2, drawScope.mo710toPx0680j_4(ArrowHeight) * arrowValues.getScale());
        path.lineTo(drawScope.mo710toPx0680j_4(f4) * arrowValues.getScale(), 0.0f);
        path.mo4073translatek4lQ0M(OffsetKt.Offset(((Math.min(rect.getWidth(), rect.getHeight()) / 2.0f) + Offset.m3937getXimpl(rect.m3967getCenterF1C5BW0())) - ((drawScope.mo710toPx0680j_4(f4) * arrowValues.getScale()) / 2.0f), Offset.m3938getYimpl(rect.m3967getCenterF1C5BW0()) - drawScope.mo710toPx0680j_4(f3)));
        float endAngle = arrowValues.getEndAngle() - drawScope.mo710toPx0680j_4(f3);
        long jMo4733getCenterF1C5BW0 = drawScope.mo4733getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo4661rotateUv8p0NA(endAngle, jMo4733getCenterF1C5BW0);
            DrawScope.m4724drawPathLG529CI$default(drawScope, path, j2, f2, new Stroke(drawScope.mo710toPx0680j_4(f3), 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
        }
    }

    public static final float getSpinnerSize() {
        return SpinnerSize;
    }

    public static final float getSpinnerContainerSize() {
        return SpinnerContainerSize;
    }

    private static final float CircularArrowProgressIndicator_RPmYEkk$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }
}
