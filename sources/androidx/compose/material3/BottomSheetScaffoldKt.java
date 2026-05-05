package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.avi.AviDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.math.MathKt;
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
/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яr\u001d̉=!,i\bӵLc\u000b\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yCAU\"}8\tWȞog\u0005Jb\u000bI\u0011\u000e\u0016\u000fj4կ]xk\u001b\u00172HoG3coE9fu>\u000562*8\u007f\t\t\u001a8M\u0018͌\u0003Ca\f\u001a0F\u007fBR#M\r\u001a\u0018\bVĳ\u0001,ձ\u007fNdG\u001dwH/;\u0019yD^'\u000e2\rO\u001dF\u0003&;wҐ\"+F:߱\u0019%Y\u00077Xa?\u0011D\n=3nW-1I\u0002^NX.\u001cE1U\rk{>\\3[\u0011\u0012-+]ncP<2(\u0001\u0002\rJ\u0010&\u0006UU^3 f\u0016\u001cKt!bpV\b^P\u0010\u0013ad&U\u00069+G,~Q\u0010EIT={\u0013\u001f6#/xQnZ\u000en(3a\bSAQn<^M8mǀq\u0004ve20\n0U\u0015G{?DG8=[G:9x\u0012JTg%\u0004vg\u0002}ʐL@(qFN0\t\u001ar\\u\u0015m`T\u0007E!O,T5|6\u0014ء`wB$U\u0016TOv\u0004\u0003M\f\u0019U5l7g\n\u0004\u000e\u0006H\u000fHCm{!qT\u0007\u0014mYr\u0007hfpR:[څ,\"8K1\u0015ɧzͩ«\u0010\u00158]\u007f;Lψ0'|-H1\u001drE\u000b\u000ewZ\u0017\u0016/eA;\u001bv4v\u0019\u0001~[\u0007n\u0016\rͅ0|f%]P_V11e$x4+\"5\u0013\u0381\u0004GmOw[z8\u000e`\f\"&\u001agP]Qт\u0013~/52<Sd\u000bpaO\"'){(#³l.m\u000b\u001bz:\u0004\u0003P_V'\"%\u0003!78h\u000e\u001fyF)m\u0014X\u0019uVI!\u0012\n@\\S\u0015\u0005M-k\u0002ɴ!Ĝީ1E-D$ ,ٺ\u0014o\u0007\u0002o\\x\u0013\u00134\u001f}\u0004Z\nFsp|u2iBy]\rI:$\u001b\rrLx\r B7J=7Vm|p\u0005E}\u000f=\u0018~\u0007Z\u001c!ZiU+o,C^c8![}Bhs)\u001f{kg\u001cw{m\u0019y'\u0017\u001b}An@\u001bS\u001f\u0005kť\r0\fvHPOWz\u001bL\u000b44Z>\u0018\rST\u0018\u0005>{ķJ_\u0015\u001aЋFsAZTUݸ[Ƈ߃\tbK\u0011/[\u0019\u001e\u001de6xc95sLT=\u0017J\u0001\u0002C9!pO\r\u001b=+rm\u007f Ϝ\\\u0001\u0019zuxW8N\u0004uO\u001equ\fFO\u0015\u001dpPKKW\u0011m0Hj\u001bWtN\u0013/\"hbNP?-{-\u0014B\n\u001dE1O!\u0006)2ٮRwE~ב\u0001\u001cL,\rѻ\u0019\u0012Eɺ1B"}, d2 = {"\u0010ncAb4,V\u0019~\nL*x\n0o\u0007'", "", "AgT2g\nH\\(~\u0004m", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8TSCt\"\u001c\u001fsa\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AbP3Y6ER\u0007\u000evm,", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006S/Dh\b(%p\u0016.\\19g5\u001f\u001fo`'\u0016_;NL", "AgT2g\u0017>S\u001fazb.\u007f\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "AgT2g\u0014:f\u000b\u0003ym/", "AgT2g\u001aAO$~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "AgT2g\nH\\(z~g,\nf9l\n5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "AgT2g\nH\\(~\u0004m\n\u0007\u00109r", "AgT2g\u001bH\\\u0015\u0006Ze,\u000e\u0005>i\n1", "AgT2g\u001aAO\u0018\t\r>3|\u001a+t\u00042\u0005", "AgT2g\u000bKO\u001bavg+\u0004\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "AgT2g\u001aPW$~Zg(y\u0010/d", "", "Bn_\u000fT9", "AmP0^):`{\t\tm", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d.1W\u0004\u001d3zx8[R)z0-\u0015>", "1n]AT0GS&\\\u0005e6\n", "1n]AX5M1#\u0006\u0005k", "1n]AX5M", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "\u0010ncAb4,V\u0019~\nL*x\n0o\u0007'CN\u007f~\u000bD:\u0014", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJixV\u0017M8\u0017\tXTmlN?*\u0012:IKCd\u0010\f#\u00121q>\f3\u001aV\t\u001f}/,hFhMwCBFl1cyn\u0019k:\u0010\u0005tX\u0015$g]8\u000ezfZp\\\u0002rqU\u0019DH(\bohBPrY:\u0003p\rNw\u0003\u0012\b=Y\fU\u0014\n>9=h\u000e\u0015l)F(y%5ZP+0?J\\ [ls{B\u0018qk7|th?@ in-M \u000f'\u0018k>_n\u0005A[\u0014\b*\u007f\u001e%U\u0003LdFjo\r.|lMLdY\u0012\":E2h\u000f\u0012\u0007p!*wvMb\rw.i@\u001bhmM\u001f\u0012\u0006hJ\u0019y\u0012\u0015~S<\\gx\"E|\u001bR/|,L\u007fPRs\u001a\u001f\u0002Vqz&rvL}5&n#GaCln/Ttc+(k@\u001ch\u000b;\n]J|^\u0005|xaq,m", "\u0010ncAb4,V\u0019~\nL*x\n0o\u0007'b<\u0015!'V", "0nSF", "0ncAb4,V\u0019~\n", "AgT2g\u0016?T'~\n", "", "AgT2g\u001aMO(~", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d(5Y\r\u000eFi%.#", "\u0010ncAb4,V\u0019~\nL*x\n0o\u0007'b<\u0015!'V7Z\u001cGt\u001e]e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\nix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0014O{{K8oJb)~XI\u000fc:m\nn!fCHmt\u0002\"\u0019wT8\u0013H)wx\\\tnkPb\u007fI,\bnkOC~YF}5h,\f\u0001\u0010A\\~4A\u0003j:4Ek\tT1\u001dOfB\u0016<e?6*@E!\t,s~jM\u0012r(,]t^>0&oib[X\u0005g\u001ff?o_J?N\u0015>Vs\u0011.\u0014H0^y\u0015\u0018t3itI\u0019\u007f9g\u0016yC/i\u0015\u0002\u00160\u0016&6!Gg\u000f27o@\\\u0017\u0011h\u0002i\u0006aN\u001f~H\u001dC/6L", "!sP;W(KRu\t\nm6\u0005v2e\u007f7", "AsPAX", ">dT8;,BU\u001c\u000e", "AgP=X", "Bn]._\fES*z\nb6\u0006", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "2qP4;(GR ~", "!sP;W(KRu\t\nm6\u0005v2e\u007f7CRRzfJ;\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00138Y}/%|\u0012=M\u0019\u001cL)\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[\\\u001bJ6\u0010\tWOm\\G3*\b\u0002.f\u001cIg\u0012 \u001d<ny\f[!OC\u0016\u0006J'wJch\b\u0011\"Uk(s\u0010i&)\u0010!*\u001e\u0001 \u001fq\u001a3\u001b\u0004\u001d\u0012\u0003[wvkQ\"\t\u0002\u0005NvYUIy^\nJ\u000e\u001bTz\u0005\u001c6W\btr7\f?4DdNXw!Mb\u0001\u0015u:K/1@J\u0013L!GY0/", "@d\\2`)>`u\t\nm6\u0005v2e\u007f7i>|\u0018\u0018Qv\r*\u0006!DY", "0ncAb4,V\u0019~\nL;x\u0018/", "AmP0^):`{\t\tm\u001a\f\u0005>e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00138Y}/%|\u0012=M\u0019\"g=\u001d\"re8\u001a-*X~2QZNudN\u0002=!\u0016V\u0015\u001ctz\u000eU?*k@D\u0002\u0012:XoJd\u0010\fkt1soO`\u0014F\r^sK1sPg_CTQNq.l\f)zfBE.\"q&pL4qpw\\\u0010\u007f\\}fz\u0011\u0017\u0005@/H{[\u0010Mkd<\u0002+\u001bRIAn<g\u00045|\u001b\u00074*ER\u0003Gh\u0019Hew\u0003;XP'{", "@d\\2`)>`\u0007\u000evg+x\u0016.B\n7\u000bJ\t\u0005\u001aGo\u001d*\u0006!DY", "7mXA\\(ED\u0015\u0006\u000b^", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d(5Y\r\u00113t&.#", "1n]3\\9FD\u0015\u0006\u000b^\n\u007f\u00058g\u007f", "AjX=;0=R\u0019\bhm(\f\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00138Y}/(i\u001d>M\u0019\"q>-\u001clj\u0003\ft4\u0018w7PJ]0f[\u0001\u0007t\"c\f]/\u0017\u000e%\u0017\u0019U@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\fc P\t\u0019}ArFPaj\u0004UAR8\u000eHOF\u0019e9G.\u0018p,dfZ6\u0015\u0006a\u0011<ZuvgT\u001dv?q\b[^FE~CKp6\u001f!", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BottomSheetScaffoldKt {
    /* JADX INFO: renamed from: BottomSheetScaffold-sdMYb0k, reason: not valid java name */
    public static final void m1812BottomSheetScaffoldsdMYb0k(final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, float f2, float f3, Shape shape, long j2, long j3, float f4, float f5, Function2<? super Composer, ? super Integer, Unit> function2, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function32, long j4, long j5, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function33, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        long jM1947contentColorForek8zF_U = j5;
        long jM1933getSurface0d7_KjU = j4;
        final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function3M1976getLambda2$material3_release = function32;
        Function2<? super Composer, ? super Integer, Unit> function23 = function22;
        float fM1809getElevationD9Ej5fM = f5;
        float fM6638constructorimpl = f4;
        long jM1947contentColorForek8zF_U2 = j3;
        long containerColor = j2;
        Shape expandedShape = shape;
        float fM1810getSheetMaxWidthD9Ej5fM = f3;
        float fM1811getSheetPeekHeightD9Ej5fM = f2;
        boolean z3 = z2;
        final BottomSheetScaffoldState bottomSheetScaffoldStateRememberBottomSheetScaffoldState = bottomSheetScaffoldState;
        Function2<? super Composer, ? super Integer, Unit> function2M1975getLambda1$material3_release = function2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1523924135);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomSheetScaffold)P(6,3,4,10:c#ui.unit.Dp,9:c#ui.unit.Dp,12,5:c#ui.graphics.Color,7:c#ui.graphics.Color,14:c#ui.unit.Dp,11:c#ui.unit.Dp,8,13,16,15,0:c#ui.graphics.Color,2:c#ui.graphics.Color)112@5992L34,115@6194L13,116@6262L14,117@6309L36,124@6741L11,125@6788L31,131@6974L52,137@7329L597,132@7051L49,133@7124L50,128@6878L1054:BottomSheetScaffold.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i8 = (-1) - (((-1) - i4) | ((-1) - 2));
        if (i8 != 0) {
            i5 = (i5 + 48) - (i5 & 48);
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i5 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 + 4) - (i4 | 4) == 0 && composerStartRestartGroup.changed(bottomSheetScaffoldStateRememberBottomSheetScaffoldState)) ? 256 : 128)));
        }
        int i9 = i4 & 8;
        if (i9 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((i2 & 3072) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(fM1811getSheetPeekHeightD9Ej5fM) ? 2048 : 1024)));
        }
        int i10 = (i4 + 16) - (i4 | 16);
        int i11 = 8192;
        if (i10 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 24576));
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i12 = composerStartRestartGroup.changed(fM1810getSheetMaxWidthD9Ej5fM) ? 16384 : 8192;
            i5 = (i5 + i12) - (i5 & i12);
        }
        if ((-1) - (((-1) - i2) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i5 |= ((i4 & 32) == 0 && composerStartRestartGroup.changed(expandedShape)) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 + 64) - (i4 | 64) == 0 && composerStartRestartGroup.changed(containerColor)) ? 1048576 : 524288)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            int i13 = ((-1) - (((-1) - i4) | ((-1) - 128)) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U2)) ? 8388608 : 4194304;
            i5 = (i5 + i13) - (i5 & i13);
        }
        int i14 = (i4 + 256) - (i4 | 256);
        if (i14 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 100663296));
        } else if ((i2 & 100663296) == 0) {
            i5 |= composerStartRestartGroup.changed(fM6638constructorimpl) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i15 = i4 & 512;
        if (i15 != 0) {
            i5 |= 805306368;
        } else if ((-1) - (((-1) - i2) | ((-1) - 805306368)) == 0) {
            i5 |= composerStartRestartGroup.changed(fM1809getElevationD9Ej5fM) ? 536870912 : 268435456;
        }
        int i16 = i4 & 1024;
        if (i16 != 0) {
            i6 = i3 | 6;
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            i6 = i3 | (composerStartRestartGroup.changedInstance(function2M1975getLambda1$material3_release) ? 4 : 2);
        } else {
            i6 = i3;
        }
        int i17 = (-1) - (((-1) - i4) | ((-1) - 2048));
        if (i17 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 48));
        } else if ((i3 + 48) - (i3 | 48) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(z3) ? 32 : 16)));
        }
        int i18 = (-1) - (((-1) - i4) | ((-1) - 4096));
        if (i18 != 0) {
            i6 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i19 = composerStartRestartGroup.changedInstance(function23) ? 256 : 128;
            i6 = (i6 + i19) - (i6 & i19);
        }
        int i20 = (i4 + 8192) - (i4 | 8192);
        if (i20 != 0) {
            i6 = (i6 + 3072) - (i6 & 3072);
        } else if ((i3 + 3072) - (i3 | 3072) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function3M1976getLambda2$material3_release) ? 2048 : 1024;
        }
        if ((i3 + 24576) - (i3 | 24576) == 0) {
            if ((-1) - (((-1) - i4) | ((-1) - 16384)) == 0 && composerStartRestartGroup.changed(jM1933getSurface0d7_KjU)) {
                i11 = 16384;
            }
            i6 = (i6 + i11) - (i6 & i11);
        }
        if ((-1) - (((-1) - i3) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (((-1) - (((-1) - i4) | ((-1) - 32768)) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U)) ? 131072 : 65536)));
        }
        if ((-1) - (((-1) - i4) | ((-1) - 65536)) != 0) {
            i6 = (i6 + 1572864) - (i6 & 1572864);
        } else if ((i3 & 1572864) == 0) {
            int i21 = composerStartRestartGroup.changedInstance(function33) ? 1048576 : 524288;
            i6 = (i6 + i21) - (i6 & i21);
        }
        if ((i5 & 306783379) == 306783378 && (-1) - (((-1) - 599187) | ((-1) - i6)) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i8 != 0) {
                    companion = Modifier.Companion;
                }
                if ((i4 + 4) - (i4 | 4) != 0) {
                    bottomSheetScaffoldStateRememberBottomSheetScaffoldState = rememberBottomSheetScaffoldState(null, null, composerStartRestartGroup, 0, 3);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-897)));
                }
                if (i9 != 0) {
                    fM1811getSheetPeekHeightD9Ej5fM = BottomSheetDefaults.INSTANCE.m1811getSheetPeekHeightD9Ej5fM();
                }
                if (i10 != 0) {
                    fM1810getSheetMaxWidthD9Ej5fM = BottomSheetDefaults.INSTANCE.m1810getSheetMaxWidthD9Ej5fM();
                }
                if ((i4 + 32) - (i4 | 32) != 0) {
                    expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                    i5 &= -458753;
                }
                if ((i4 & 64) != 0) {
                    containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-3670017)));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 128)) != 0) {
                    int i22 = i5 >> 18;
                    jM1947contentColorForek8zF_U2 = ColorSchemeKt.m1947contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i22 + 14) - (i22 | 14));
                    i5 &= -29360129;
                }
                if (i14 != 0) {
                    fM6638constructorimpl = Dp.m6638constructorimpl(0);
                }
                if (i15 != 0) {
                    fM1809getElevationD9Ej5fM = BottomSheetDefaults.INSTANCE.m1809getElevationD9Ej5fM();
                }
                if (i16 != 0) {
                    function2M1975getLambda1$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1975getLambda1$material3_release();
                }
                if (i17 != 0) {
                    z3 = true;
                }
                if (i18 != 0) {
                    function23 = null;
                }
                if (i20 != 0) {
                    function3M1976getLambda2$material3_release = ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1976getLambda2$material3_release();
                }
                if ((-1) - (((-1) - i4) | ((-1) - 16384)) != 0) {
                    jM1933getSurface0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m1933getSurface0d7_KjU();
                    i7 = (i6 - 57345) - (i6 | (-57345));
                } else {
                    i7 = i6;
                }
                if ((i4 & 32768) != 0) {
                    int i23 = i7 >> 12;
                    jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(jM1933getSurface0d7_KjU, composerStartRestartGroup, (i23 + 14) - (i23 | 14));
                    i7 = (-1) - (((-1) - i7) | ((-1) - (-458753)));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-897)));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 32)) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-458753)));
                }
                if ((i4 + 64) - (i4 | 64) != 0) {
                    i5 = (i5 - 3670017) - (i5 | (-3670017));
                }
                if ((i4 + 128) - (i4 | 128) != 0) {
                    i5 = (i5 - 29360129) - (i5 | (-29360129));
                }
                if ((i4 + 16384) - (i4 | 16384) != 0) {
                    i6 &= -57345;
                }
                if ((i4 + 32768) - (i4 | 32768) != 0) {
                    i6 = (i6 - 458753) - (i6 | (-458753));
                }
                i7 = i6;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1523924135, i5, i7, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:127)");
            }
            SheetState bottomSheetState = bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState();
            final float f6 = fM1811getSheetPeekHeightD9Ej5fM;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-459880832, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1
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

                public final void invoke(Composer composer2, int i24) {
                    ComposerKt.sourceInformation(composer2, "C131@6976L48:BottomSheetScaffold.kt#uh7d8r");
                    if ((i24 + 3) - (3 | i24) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-459880832, i24, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:131)");
                    }
                    function33.invoke(PaddingKt.m1015PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f6, 7, null), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            final BottomSheetScaffoldState bottomSheetScaffoldState2 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
            final float f7 = fM1811getSheetPeekHeightD9Ej5fM;
            final float f8 = fM1810getSheetMaxWidthD9Ej5fM;
            final boolean z4 = z3;
            final Shape shape2 = expandedShape;
            final long j6 = containerColor;
            final long j7 = jM1947contentColorForek8zF_U2;
            final float f9 = fM6638constructorimpl;
            final float f10 = fM1809getElevationD9Ej5fM;
            final Function2<? super Composer, ? super Integer, Unit> function24 = function2M1975getLambda1$material3_release;
            boolean z5 = true;
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1961872927, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$2
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

                public final void invoke(Composer composer2, int i24) {
                    ComposerKt.sourceInformation(composer2, "C138@7343L573:BottomSheetScaffold.kt#uh7d8r");
                    if ((i24 + 3) - (3 | i24) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1961872927, i24, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:138)");
                        }
                        BottomSheetScaffoldKt.m1814StandardBottomSheetw7I5h1o(bottomSheetScaffoldState2.getBottomSheetState(), f7, f8, z4, shape2, j6, j7, f9, f10, function24, function3, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(88659390, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$3
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

                public final void invoke(Composer composer2, int i24) {
                    ComposerKt.sourceInformation(composer2, "C132@7053L45:BottomSheetScaffold.kt#uh7d8r");
                    if ((i24 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(88659390, i24, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:132)");
                    }
                    function3M1976getLambda2$material3_release.invoke(bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getSnackbarHostState(), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1349215175, "CC(remember):BottomSheetScaffold.kt#9igjgp");
            if (((((-1) - (((-1) - i5) | ((-1) - 896))) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composerStartRestartGroup.changed(bottomSheetScaffoldStateRememberBottomSheetScaffoldState)) && (i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 256) {
                z5 = false;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$4$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(bottomSheetScaffoldStateRememberBottomSheetScaffoldState.getBottomSheetState().requireOffset());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i24 = i5 >> 3;
            int i25 = (-1) - (((-1) - ((i24 + 14) - (i24 | 14))) & ((-1) - 28032));
            int i26 = i7 >> 3;
            int i27 = (i26 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i26 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
            int i28 = i7 << 9;
            m1813BottomSheetScaffoldLayout2E65NiM(companion, function23, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda3, (Function0) objRememberedValue, bottomSheetState, jM1933getSurface0d7_KjU, jM1947contentColorForek8zF_U, composerStartRestartGroup, ((-1) - (((-1) - ((i25 + i27) - (i25 & i27))) & ((-1) - ((29360128 + i28) - (29360128 | i28))))) | ((-1) - (((-1) - i28) | ((-1) - 234881024))));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final BottomSheetScaffoldState bottomSheetScaffoldState3 = bottomSheetScaffoldStateRememberBottomSheetScaffoldState;
            final float f11 = fM1811getSheetPeekHeightD9Ej5fM;
            final float f12 = fM1810getSheetMaxWidthD9Ej5fM;
            final Shape shape3 = expandedShape;
            final long j8 = containerColor;
            final long j9 = jM1947contentColorForek8zF_U2;
            final float f13 = fM6638constructorimpl;
            final float f14 = fM1809getElevationD9Ej5fM;
            final Function2<? super Composer, ? super Integer, Unit> function25 = function2M1975getLambda1$material3_release;
            final boolean z6 = z3;
            final Function2<? super Composer, ? super Integer, Unit> function26 = function23;
            final Function3<? super SnackbarHostState, ? super Composer, ? super Integer, Unit> function34 = function3M1976getLambda2$material3_release;
            final long j10 = jM1933getSurface0d7_KjU;
            final long j11 = jM1947contentColorForek8zF_U;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$5
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

                public final void invoke(Composer composer2, int i29) {
                    BottomSheetScaffoldKt.m1812BottomSheetScaffoldsdMYb0k(function3, modifier2, bottomSheetScaffoldState3, f11, f12, shape3, j8, j9, f13, f14, function25, z6, function26, function34, j10, j11, function33, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(SheetState sheetState, SnackbarHostState snackbarHostState, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -1474606134, "C(rememberBottomSheetScaffoldState)178@8695L34,179@8774L32,181@8848L196:BottomSheetScaffold.kt#uh7d8r");
        if ((i3 + 1) - (1 | i3) != 0) {
            sheetState = rememberStandardBottomSheetState(null, null, false, composer, 0, 7);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            ComposerKt.sourceInformationMarkerStart(composer, -787714761, "CC(remember):BottomSheetScaffold.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(objRememberedValue);
            }
            snackbarHostState = (SnackbarHostState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1474606134, i2, -1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:180)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -787712229, "CC(remember):BottomSheetScaffold.kt#9igjgp");
        int i4 = (-1) - (((-1) - ((((((-1) - (((-1) - i2) | ((-1) - 14))) ^ 6) <= 4 || !composer.changed(sheetState)) && (-1) - (((-1) - i2) | ((-1) - 6)) != 4) ? 0 : 1)) & ((-1) - ((((((i2 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i2)) ^ 48) > 32 && composer.changed(snackbarHostState)) || (i2 + 48) - (i2 | 48) == 32) ? 1 : 0)));
        Object objRememberedValue2 = composer.rememberedValue();
        if (i4 != 0 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new BottomSheetScaffoldState(sheetState, snackbarHostState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) objRememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return bottomSheetScaffoldState;
    }

    public static final SheetState rememberStandardBottomSheetState(SheetValue sheetValue, Function1<? super SheetValue, Boolean> function1, boolean z2, Composer composer, int i2, int i3) {
        boolean z3 = z2;
        AnonymousClass1 anonymousClass1 = function1;
        SheetValue sheetValue2 = sheetValue;
        ComposerKt.sourceInformationMarkerStart(composer, 678511581, "C(rememberStandardBottomSheetState)P(1)204@9680L154:BottomSheetScaffold.kt#uh7d8r");
        if ((i3 + 1) - (1 | i3) != 0) {
            sheetValue2 = SheetValue.PartiallyExpanded;
        }
        if ((2 & i3) != 0) {
            anonymousClass1 = new Function1<SheetValue, Boolean>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt.rememberStandardBottomSheetState.1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(SheetValue sheetValue3) {
                    return true;
                }
            };
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            z3 = true;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(678511581, i2, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:204)");
        }
        int i4 = i2 << 3;
        SheetState sheetStateRememberSheetState = SheetDefaultsKt.rememberSheetState(false, anonymousClass1, sheetValue2, z3, composer, (-1) - (((-1) - (((-1) - (((-1) - i2) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) | ((-1) - (((-1) - (i2 << 6)) | ((-1) - 896))))) & ((-1) - ((i4 + 7168) - (i4 | 7168)))), 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return sheetStateRememberSheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: StandardBottomSheet-w7I5h1o, reason: not valid java name */
    public static final void m1814StandardBottomSheetw7I5h1o(final SheetState sheetState, final float f2, final float f3, final boolean z2, final Shape shape, final long j2, final long j3, final float f4, final float f5, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Object obj;
        Modifier.Companion companionNestedScroll$default;
        Composer composerStartRestartGroup = composer.startRestartGroup(721467526);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(StandardBottomSheet)P(9,4:c#ui.unit.Dp,7:c#ui.unit.Dp,8,6,0:c#ui.graphics.Color,2:c#ui.graphics.Color,10:c#ui.unit.Dp,5:c#ui.unit.Dp,3)225@10249L24,*227@10358L7,248@11164L1938,294@13493L2297,242@10889L4901:BottomSheetScaffold.kt#uh7d8r");
        if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (composerStartRestartGroup.changed(sheetState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i6 = composerStartRestartGroup.changed(f2) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i7 = composerStartRestartGroup.changed(f3) ? 256 : 128;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            int i8 = composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(shape) ? 16384 : 8192)));
        }
        if ((196608 & i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(j2) ? 131072 : 65536)));
        }
        if ((-1) - (((-1) - 1572864) | ((-1) - i2)) == 0) {
            i4 |= composerStartRestartGroup.changed(j3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            int i9 = composerStartRestartGroup.changed(f4) ? 8388608 : 4194304;
            i4 = (i4 + i9) - (i4 & i9);
        }
        if ((i2 & 100663296) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(f5) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((i2 & 805306368) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            i5 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function3) ? 4 : 2)));
        } else {
            i5 = i3;
        }
        if ((i4 & 306783379) == 306783378 && (-1) - (((-1) - i5) | ((-1) - 3)) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(721467526, i4, i5, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:224)");
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
            Orientation orientation = Orientation.Vertical;
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final float fMo710toPx0680j_4 = ((Density) objConsume).mo710toPx0680j_4(f2);
            composerStartRestartGroup.startReplaceGroup(-1831611516);
            ComposerKt.sourceInformation(composerStartRestartGroup, "231@10496L326");
            if (z2) {
                Modifier.Companion companion = Modifier.Companion;
                AnchoredDraggableState<SheetValue> anchoredDraggableState$material3_release = sheetState.getAnchoredDraggableState$material3_release();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1831609222, "CC(remember):BottomSheetScaffold.kt#9igjgp");
                boolean zChanged = composerStartRestartGroup.changed(anchoredDraggableState$material3_release);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState, orientation, new Function1<Float, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Float f6) {
                            invoke(f6.floatValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1$1, reason: invalid class name */
                        /* JADX INFO: compiled from: BottomSheetScaffold.kt */
                        @InterfaceC1492Gx
                        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK`\u000f\u0015\u0016\u0012\u0011w\u000e\f\r\u001d|\u000e\r\u0013\u0014\u001e\u001c\u0015|'W\b*\u0018&\u001d\u001b- ~-340/\u0016,*+;k7/>@22\"3CA?@x\u0007z\t|\u000b", f = "\u000f;?>85\u001a.*)7\u0015$!%$,(\u001fg$,", i = {}, l = {236}, m = "8>GA>9(KJH>H?", n = {}, s = {})
                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ float $it;
                            final /* synthetic */ SheetState $state;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(SheetState sheetState, float f2, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$state = sheetState;
                                this.$it = f2;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new AnonymousClass1(this.$state, this.$it, continuation);
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
                                    if (this.$state.settle$material3_release(this.$it, this) == coroutine_suspended) {
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

                        public final void invoke(float f6) {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sheetState, f6, null), 3, null);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                obj = null;
                companionNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(companion, (NestedScrollConnection) objRememberedValue2, null, 2, null);
            } else {
                obj = null;
                companionNestedScroll$default = Modifier.Companion;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen = SizeKt.m1054requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m1070widthInVpY3zN4$default(Modifier.Companion, 0.0f, f3, 1, obj), 0.0f, 1, obj), f2, 0.0f, 2, obj).then(companionNestedScroll$default);
            AnchoredDraggableState<SheetValue> anchoredDraggableState$material3_release2 = sheetState.getAnchoredDraggableState$material3_release();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1831586234, "CC(remember):BottomSheetScaffold.kt#9igjgp");
            boolean zChanged2 = ((-1) - (((-1) - i4) | ((-1) - 14)) == 4) | composerStartRestartGroup.changed(fMo710toPx0680j_4);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (Function2) new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue>>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1

                    /* JADX INFO: compiled from: BottomSheetScaffold.kt */
                    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[SheetValue.values().length];
                            try {
                                iArr[SheetValue.Hidden.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[SheetValue.Expanded.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue> invoke(IntSize intSize, Constraints constraints) {
                        return m1817invokeGpV2Q24(intSize.m6812unboximpl(), constraints.m6597unboximpl());
                    }

                    /* JADX INFO: renamed from: invoke-GpV2Q24, reason: not valid java name */
                    public final Pair<DraggableAnchors<SheetValue>, SheetValue> m1817invokeGpV2Q24(long j4, long j5) {
                        final float fM6590getMaxHeightimpl = Constraints.m6590getMaxHeightimpl(j5);
                        final float fM6807getHeightimpl = IntSize.m6807getHeightimpl(j4);
                        final SheetState sheetState2 = sheetState;
                        final float f6 = fMo710toPx0680j_4;
                        DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<SheetValue>, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$1$1$newAnchors$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                invoke2(draggableAnchorsConfig);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                if (!sheetState2.getSkipPartiallyExpanded$material3_release()) {
                                    draggableAnchorsConfig.at(SheetValue.PartiallyExpanded, fM6590getMaxHeightimpl - f6);
                                }
                                if (fM6807getHeightimpl != f6) {
                                    draggableAnchorsConfig.at(SheetValue.Expanded, Math.max(fM6590getMaxHeightimpl - fM6807getHeightimpl, 0.0f));
                                }
                                if (sheetState2.getSkipHiddenState$material3_release()) {
                                    return;
                                }
                                draggableAnchorsConfig.at(SheetValue.Hidden, fM6590getMaxHeightimpl);
                            }
                        });
                        SheetValue targetValue = sheetState.getAnchoredDraggableState$material3_release().getTargetValue();
                        int i10 = WhenMappings.$EnumSwitchMapping$0[targetValue.ordinal()];
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    if (DraggableAnchors.hasAnchorFor(SheetValue.Expanded)) {
                                        targetValue = SheetValue.Expanded;
                                    } else if (DraggableAnchors.hasAnchorFor(SheetValue.PartiallyExpanded)) {
                                        targetValue = SheetValue.PartiallyExpanded;
                                    } else if (DraggableAnchors.hasAnchorFor(SheetValue.Hidden)) {
                                        targetValue = SheetValue.Hidden;
                                    }
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (DraggableAnchors.hasAnchorFor(SheetValue.PartiallyExpanded)) {
                                targetValue = SheetValue.PartiallyExpanded;
                            } else if (DraggableAnchors.hasAnchorFor(SheetValue.Expanded)) {
                                targetValue = SheetValue.Expanded;
                            } else if (DraggableAnchors.hasAnchorFor(SheetValue.Hidden)) {
                                targetValue = SheetValue.Hidden;
                            }
                        } else if (DraggableAnchors.hasAnchorFor(SheetValue.Hidden)) {
                            targetValue = SheetValue.Hidden;
                        }
                        return TuplesKt.to(DraggableAnchors, targetValue);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierAnchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(AnchoredDraggableKt.draggableAnchors(modifierThen, anchoredDraggableState$material3_release2, orientation, (Function2) objRememberedValue3), sheetState.getAnchoredDraggableState$material3_release(), orientation, z2, false, null, 24, null);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(390720907, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2
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
                    ComposerKt.sourceInformation(composer2, "C295@13503L2281:BottomSheetScaffold.kt#uh7d8r");
                    if ((-1) - (((-1) - i10) | ((-1) - 3)) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(390720907, i10, -1, "androidx.compose.material3.StandardBottomSheet.<anonymous> (BottomSheetScaffold.kt:295)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                    Function2<Composer, Integer, Unit> function22 = function2;
                    final SheetState sheetState2 = sheetState;
                    final boolean z3 = z2;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
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
                    ComposerKt.sourceInformationMarkerStart(composer2, -1850745504, "C337@15765L9:BottomSheetScaffold.kt#uh7d8r");
                    composer2.startReplaceGroup(-1168080147);
                    ComposerKt.sourceInformation(composer2, "298@13642L54,299@13738L48,300@13827L47,302@13986L1680,301@13891L1847");
                    if (function22 != null) {
                        Strings.Companion companion2 = Strings.Companion;
                        final String strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_bottom_sheet_collapse_description), composer2, 0);
                        Strings.Companion companion3 = Strings.Companion;
                        final String strM2993getString2EP1pXo2 = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_bottom_sheet_dismiss_description), composer2, 0);
                        Strings.Companion companion4 = Strings.Companion;
                        final String strM2993getString2EP1pXo3 = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_bottom_sheet_expand_description), composer2, 0);
                        Modifier modifierAlign = columnScopeInstance.align(Modifier.Companion, Alignment.Companion.getCenterHorizontally());
                        ComposerKt.sourceInformationMarkerStart(composer2, -1168066686, "CC(remember):BottomSheetScaffold.kt#9igjgp");
                        int i11 = (-1) - (((-1) - ((((composer2.changed(sheetState2) ? 1 : 0) | (composer2.changed(z3) ? 1 : 0)) | (composer2.changed(strM2993getString2EP1pXo3) ? 1 : 0)) | (composer2.changedInstance(coroutineScope2) ? 1 : 0))) & ((-1) - (composer2.changed(strM2993getString2EP1pXo) ? 1 : 0))) != 1 ? 0 : 1;
                        boolean zChanged3 = composer2.changed(strM2993getString2EP1pXo2);
                        boolean z4 = (i11 + (zChanged3 ? 1 : 0)) - (i11 & (zChanged3 ? 1 : 0)) == 1;
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (z4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                            objRememberedValue4 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1
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
                                    final SheetState sheetState3 = sheetState2;
                                    boolean z5 = z3;
                                    String str = strM2993getString2EP1pXo3;
                                    String str2 = strM2993getString2EP1pXo;
                                    String str3 = strM2993getString2EP1pXo2;
                                    final CoroutineScope coroutineScope3 = coroutineScope2;
                                    if (sheetState3.getAnchoredDraggableState$material3_release().getAnchors().getSize() <= 1 || !z5) {
                                        return;
                                    }
                                    if (sheetState3.getCurrentValue() == SheetValue.PartiallyExpanded) {
                                        if (sheetState3.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded).booleanValue()) {
                                            SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str, new Function0<Boolean>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX INFO: renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$1$1, reason: invalid class name */
                                                /* JADX INFO: compiled from: BottomSheetScaffold.kt */
                                                @InterfaceC1492Gx
                                                @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                                                @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK`\u000f\u0015\u0016\u0012\u0011w\u000e\f\r\u001d|\u000e\r\u0013\u0014\u001e\u001c\u0015|'W\b*\u0018&\u001d\u001b- ~-340/\u0016,*+;kzm{o}q\u007fs\u0002u\u0004w\u0006", f = "\u000f;?>85\u001a.*)7\u0015$!%$,(\u001fg$,", i = {}, l = {311}, m = "8>GA>9(KJH>H?", n = {}, s = {})
                                                static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    final /* synthetic */ SheetState $this_with;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$this_with = sheetState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                        return new AnonymousClass1(this.$this_with, continuation);
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
                                                            if (this.$this_with.expand(this) == coroutine_suspended) {
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

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(sheetState3, null), 3, null);
                                                    return true;
                                                }
                                            });
                                        }
                                    } else if (sheetState3.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.PartiallyExpanded).booleanValue()) {
                                        SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            /* JADX INFO: renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$2$1, reason: invalid class name */
                                            /* JADX INFO: compiled from: BottomSheetScaffold.kt */
                                            /* JADX INFO: loaded from: classes.dex */
                                            @InterfaceC1492Gx
                                            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                                            @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK`\u000f\u0015\u0016\u0012\u0011w\u000e\f\r\u001d|\u000e\r\u0013\u0014\u001e\u001c\u0015|'W\b*\u0018&\u001d\u001b- ~-340/\u0016,*+;kzm{o}q\u007fs\u0002u\u0005w\u0006", f = "\u000f;?>85\u001a.*)7\u0015$!%$,(\u001fg$,", i = {}, l = {AviDirectory.TAG_DATETIME_ORIGINAL}, m = "8>GA>9(KJH>H?", n = {}, s = {})
                                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ SheetState $this_with;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$this_with = sheetState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                    return new AnonymousClass1(this.$this_with, continuation);
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
                                                        if (this.$this_with.partialExpand(this) == coroutine_suspended) {
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

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(sheetState3, null), 3, null);
                                                return true;
                                            }
                                        });
                                    }
                                    if (sheetState3.getSkipHiddenState$material3_release()) {
                                        return;
                                    }
                                    SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str3, new Function0<Boolean>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        /* JADX INFO: renamed from: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$2$1$1$1$1$3$1, reason: invalid class name */
                                        /* JADX INFO: compiled from: BottomSheetScaffold.kt */
                                        /* JADX INFO: loaded from: classes2.dex */
                                        @InterfaceC1492Gx
                                        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                                        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK`\u000f\u0015\u0016\u0012\u0011w\u000e\f\r\u001d|\u000e\r\u0013\u0014\u001e\u001c\u0015|'W\b*\u0018&\u001d\u001b- ~-340/\u0016,*+;kzm{o}q\u007fs\u0002u\u0006w\u0006", f = "\u000f;?>85\u001a.*)7\u0015$!%$,(\u001fg$,", i = {}, l = {327}, m = "8>GA>9(KJH>H?", n = {}, s = {})
                                        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ SheetState $this_with;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            AnonymousClass1(SheetState sheetState, Continuation<? super AnonymousClass1> continuation) {
                                                super(2, continuation);
                                                this.$this_with = sheetState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                return new AnonymousClass1(this.$this_with, continuation);
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
                                                    if (this.$this_with.hide(this) == coroutine_suspended) {
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

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new AnonymousClass1(sheetState3, null), 3, null);
                                            return true;
                                        }
                                    });
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierAlign, true, (Function1) objRememberedValue4);
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierSemantics);
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
                        ComposerKt.sourceInformationMarkerStart(composer2, -1678862234, "C334@15708L12:BottomSheetScaffold.kt#uh7d8r");
                        function22.invoke(composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                    }
                    composer2.endReplaceGroup();
                    function32.invoke(columnScopeInstance, composer2, 6);
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
            }, composerStartRestartGroup, 54);
            int i10 = i4 >> 9;
            int i11 = (-1) - (((-1) - i10) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            int i12 = (i11 + 12582912) - (i11 & 12582912);
            int i13 = (i10 + 896) - (896 | i10);
            int i14 = (i12 + i13) - (i12 & i13);
            int i15 = (-1) - (((-1) - i10) | ((-1) - 7168));
            SurfaceKt.m2561SurfaceT9BRK9s(modifierAnchoredDraggable$default, shape, j2, j3, f4, f5, null, composableLambdaRememberComposableLambda, composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - ((i14 + i15) - (i14 & i15))) & ((-1) - ((-1) - (((-1) - 57344) | ((-1) - i10))))))) & ((-1) - ((-1) - (((-1) - i10) | ((-1) - 458752))))), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3
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
                    SheetState sheetState2 = sheetState;
                    float f6 = f2;
                    float f7 = f3;
                    boolean z3 = z2;
                    Shape shape2 = shape;
                    long j4 = j2;
                    long j5 = j3;
                    float f8 = f4;
                    float f9 = f5;
                    Function2<Composer, Integer, Unit> function22 = function2;
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    int i17 = i2;
                    BottomSheetScaffoldKt.m1814StandardBottomSheetw7I5h1o(sheetState2, f6, f7, z3, shape2, j4, j5, f8, f9, function22, function32, composer2, RecomposeScopeImplKt.updateChangedFlags((i17 + 1) - (i17 & 1)), RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: BottomSheetScaffoldLayout-2E65NiM, reason: not valid java name */
    public static final void m1813BottomSheetScaffoldLayout2E65NiM(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Function0<Float> function0, final SheetState sheetState, final long j2, final long j3, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1651214892);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomSheetScaffoldLayout)P(4,8!2,7,5,6,2:c#ui.graphics.Color,3:c#ui.graphics.Color)359@16300L255,370@16635L1950,355@16183L2402:BottomSheetScaffold.kt#uh7d8r");
        if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i3 = (-1) - (((-1) - (composerStartRestartGroup.changed(modifier) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (i2 | 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function22) ? 256 : 128)));
        }
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(function23) ? 2048 : 1024;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((1572864 & i2) == 0) {
            int i6 = composerStartRestartGroup.changed(sheetState) ? 1048576 : 524288;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((12582912 & i2) == 0) {
            composerStartRestartGroup = composerStartRestartGroup;
            i3 |= composerStartRestartGroup.changed(j2) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(j3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((38347923 & i3) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1651214892, i3, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:354)");
            }
            Function2[] function2Arr = new Function2[4];
            function2Arr[0] = function2 == null ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1977getLambda3$material3_release() : function2;
            function2Arr[1] = ComposableLambdaKt.rememberComposableLambda(398963586, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1
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
                    ComposerKt.sourceInformation(composer2, "C360@16322L215:BottomSheetScaffold.kt#uh7d8r");
                    if ((i7 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(398963586, i7, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous> (BottomSheetScaffold.kt:360)");
                        }
                        SurfaceKt.m2561SurfaceT9BRK9s(modifier, null, j2, j3, 0.0f, 0.0f, null, function22, composer2, 0, 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            function2Arr[2] = function23;
            function2Arr[3] = function24;
            List listListOf = CollectionsKt.listOf((Object[]) function2Arr);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1221133327, "CC(remember):BottomSheetScaffold.kt#9igjgp");
            boolean z2 = ((3670016 + i3) - (3670016 | i3) == 1048576) | ((458752 & i3) == 131072);
            MultiContentMeasurePolicy multiContentMeasurePolicyRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || multiContentMeasurePolicyRememberedValue == Composer.Companion.getEmpty()) {
                multiContentMeasurePolicyRememberedValue = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1
                    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo966measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j4) {
                        Integer numValueOf;
                        List<? extends Measurable> list2 = list.get(0);
                        int i7 = 1;
                        List<? extends Measurable> list3 = list.get(1);
                        List<? extends Measurable> list4 = list.get(2);
                        List<? extends Measurable> list5 = list.get(3);
                        final int iM6591getMaxWidthimpl = Constraints.m6591getMaxWidthimpl(j4);
                        final int iM6590getMaxHeightimpl = Constraints.m6590getMaxHeightimpl(j4);
                        long jM6582copyZbe2FdA$default = Constraints.m6582copyZbe2FdA$default(j4, 0, 0, 0, 0, 10, null);
                        ArrayList arrayList = new ArrayList(list4.size());
                        int size = list4.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            arrayList.add(list4.get(i8).mo5514measureBRTryo0(jM6582copyZbe2FdA$default));
                        }
                        final ArrayList arrayList2 = arrayList;
                        ArrayList arrayList3 = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            arrayList3.add(list2.get(i9).mo5514measureBRTryo0(jM6582copyZbe2FdA$default));
                        }
                        final ArrayList arrayList4 = arrayList3;
                        if (arrayList4.isEmpty()) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(((Placeable) arrayList4.get(0)).getHeight());
                            int lastIndex = CollectionsKt.getLastIndex(arrayList4);
                            if (1 <= lastIndex) {
                                while (true) {
                                    Integer numValueOf2 = Integer.valueOf(((Placeable) arrayList4.get(i7)).getHeight());
                                    if (numValueOf2.compareTo(numValueOf) > 0) {
                                        numValueOf = numValueOf2;
                                    }
                                    if (i7 == lastIndex) {
                                        break;
                                    }
                                    i7++;
                                }
                            }
                        }
                        Integer num = numValueOf;
                        final int iIntValue = num != null ? num.intValue() : 0;
                        long jM6582copyZbe2FdA$default2 = Constraints.m6582copyZbe2FdA$default(jM6582copyZbe2FdA$default, 0, 0, 0, iM6590getMaxHeightimpl - iIntValue, 7, null);
                        ArrayList arrayList5 = new ArrayList(list3.size());
                        int size3 = list3.size();
                        for (int i10 = 0; i10 < size3; i10++) {
                            arrayList5.add(list3.get(i10).mo5514measureBRTryo0(jM6582copyZbe2FdA$default2));
                        }
                        final ArrayList arrayList6 = arrayList5;
                        ArrayList arrayList7 = new ArrayList(list5.size());
                        int size4 = list5.size();
                        for (int i11 = 0; i11 < size4; i11++) {
                            arrayList7.add(list5.get(i11).mo5514measureBRTryo0(jM6582copyZbe2FdA$default));
                        }
                        final ArrayList arrayList8 = arrayList7;
                        final SheetState sheetState2 = sheetState;
                        final Function0<Float> function02 = function0;
                        return MeasureScope.layout$default(measureScope, iM6591getMaxWidthimpl, iM6590getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1.1

                            /* JADX INFO: renamed from: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2$1$1$WhenMappings */
                            /* JADX INFO: compiled from: BottomSheetScaffold.kt */
                            @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[SheetValue.values().length];
                                    try {
                                        iArr[SheetValue.PartiallyExpanded.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[SheetValue.Expanded.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[SheetValue.Hidden.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

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
                                Integer numValueOf3;
                                Integer numValueOf4;
                                int iRoundToInt;
                                List<Placeable> list6 = arrayList2;
                                Integer numValueOf5 = null;
                                if (list6.isEmpty()) {
                                    numValueOf3 = null;
                                } else {
                                    numValueOf3 = Integer.valueOf(list6.get(0).getWidth());
                                    int lastIndex2 = CollectionsKt.getLastIndex(list6);
                                    if (1 <= lastIndex2) {
                                        int i12 = 1;
                                        while (true) {
                                            Integer numValueOf6 = Integer.valueOf(list6.get(i12).getWidth());
                                            if (numValueOf6.compareTo(numValueOf3) > 0) {
                                                numValueOf3 = numValueOf6;
                                            }
                                            if (i12 == lastIndex2) {
                                                break;
                                            } else {
                                                i12++;
                                            }
                                        }
                                    }
                                }
                                Integer num2 = numValueOf3;
                                int iMax = Integer.max(0, (iM6591getMaxWidthimpl - (num2 != null ? num2.intValue() : 0)) / 2);
                                List<Placeable> list7 = arrayList8;
                                if (list7.isEmpty()) {
                                    numValueOf4 = null;
                                } else {
                                    numValueOf4 = Integer.valueOf(list7.get(0).getWidth());
                                    int lastIndex3 = CollectionsKt.getLastIndex(list7);
                                    if (1 <= lastIndex3) {
                                        int i13 = 1;
                                        while (true) {
                                            Integer numValueOf7 = Integer.valueOf(list7.get(i13).getWidth());
                                            if (numValueOf7.compareTo(numValueOf4) > 0) {
                                                numValueOf4 = numValueOf7;
                                            }
                                            if (i13 == lastIndex3) {
                                                break;
                                            } else {
                                                i13++;
                                            }
                                        }
                                    }
                                }
                                Integer num3 = numValueOf4;
                                int iIntValue2 = num3 != null ? num3.intValue() : 0;
                                List<Placeable> list8 = arrayList8;
                                if (!list8.isEmpty()) {
                                    numValueOf5 = Integer.valueOf(list8.get(0).getHeight());
                                    int lastIndex4 = CollectionsKt.getLastIndex(list8);
                                    if (1 <= lastIndex4) {
                                        int i14 = 1;
                                        while (true) {
                                            Integer numValueOf8 = Integer.valueOf(list8.get(i14).getHeight());
                                            if (numValueOf8.compareTo(numValueOf5) > 0) {
                                                numValueOf5 = numValueOf8;
                                            }
                                            if (i14 == lastIndex4) {
                                                break;
                                            } else {
                                                i14++;
                                            }
                                        }
                                    }
                                }
                                Integer num4 = numValueOf5;
                                int iIntValue3 = num4 != null ? num4.intValue() : 0;
                                int i15 = (iM6591getMaxWidthimpl - iIntValue2) / 2;
                                int i16 = WhenMappings.$EnumSwitchMapping$0[sheetState2.getCurrentValue().ordinal()];
                                if (i16 == 1) {
                                    iRoundToInt = MathKt.roundToInt(function02.invoke().floatValue());
                                } else {
                                    if (i16 != 2 && i16 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    iRoundToInt = iM6590getMaxHeightimpl;
                                }
                                int i17 = iRoundToInt - iIntValue3;
                                List<Placeable> list9 = arrayList6;
                                int i18 = iIntValue;
                                int size5 = list9.size();
                                for (int i19 = 0; i19 < size5; i19++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list9.get(i19), 0, i18, 0.0f, 4, null);
                                }
                                List<Placeable> list10 = arrayList4;
                                int size6 = list10.size();
                                for (int i20 = 0; i20 < size6; i20++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list10.get(i20), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list11 = arrayList2;
                                int size7 = list11.size();
                                for (int i21 = 0; i21 < size7; i21++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list11.get(i21), iMax, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list12 = arrayList8;
                                int size8 = list12.size();
                                for (int i22 = 0; i22 < size8; i22++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list12.get(i22), i15, i17, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(multiContentMeasurePolicyRememberedValue);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) multiContentMeasurePolicyRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1399185516, "CC(Layout)P(!1,2)173@6976L62,170@6862L182:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.Companion;
            Function2<Composer, Integer, Unit> function2CombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listListOf);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -290761997, "CC(remember):Layout.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(multiContentMeasurePolicy);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
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
            function2CombineAsVirtualLayouts.invoke(composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$3
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
                    BottomSheetScaffoldKt.m1813BottomSheetScaffoldLayout2E65NiM(modifier, function2, function22, function23, function24, function0, sheetState, j2, j3, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))));
                }
            });
        }
    }
}
