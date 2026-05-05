package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĝ\u0014D߬)\u001ew\u007fL܀kt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u001dfrˎ8D{H6ɟ[*\u001dq\u0004é,[:qKП]\u001a\u0014\"\u0011ѧVg}nRҙ\u0013C\u001d\u000f\u001exp,QU\u000f]\u001a\u000fHBw?9Mw=Gś|Ȃ\r H\"@ц\r\u00010*PƵ~zYK\u0014\u0012F@xíZ\rc\u0005\"\u0012\u001c>(\u0001$^oNLHt]@1+\u0003\u007fBV'm<\u0005M\u0013K\\'\u001b{i\u001e1B?5+%[Έ\u001fӛZMšWqk\u0004\u0019+5+as\u00067\t\u0006\u001a\u00159Q%]!)\r\u000bW`\u001a+CO\u0012P\u0001\u0014.w\t\u0002%<2\u00156-N.;\"~\b<<%xY@^\fvB.\u0006\u0012<\u001d%\u000e?C9Is\u0002gA\u0019\\E\u0014\u0005;-S\u0007t!id&`C,\u0005}W1_RUH|\u001b\n`s\u0004~u\u001aG\u0014AW\u000f]\u0005 2!+Lk?)7{\u0004NJ\u000e\u000e\u0015bxS\u0018j^?P\u0003F=0\t\u001as\\d3\u0006\u0001Z^,\u001fh4T5\u001a8B.y\u0010g1' N}\by{]l8.çjA_\u0004{\u0014]On5;W\n0qT\u0007\u0014m;\u0011#ֽjBY-Ⱥ`((T\u000foߑvӻΌR\u000e\u0019UM\u00164ڜ+?>t\u0015v\u0002NFO|!_\ti@\u0005Z32\u0005\u0002$#\f1Vbp}k\u0011IZ\u0002\u0011(3A_;1&\u0004)\u0019:\u0003#\u0015\u0007\f\u007fup|MRl$\u007fm{N!J?W/K9'~WY23KL\u0001siM@6+\u0003\u007f\u000fIxFg6{!2fjXal\u0017P\b\u000f\u0016)\br\u0013\u0012~V\fWr\u0003\u0014ИBSx\u0018iBTN\r\u0007%$K\u0018\u007f$\r5[[=\u001cD\fD5\u001bak\u0003\b.(|?,ze\u0012G{\u0016\u001e~\u0002\r@XPti\u0001N\"R\f\u0013SXy&\u0011ɚ\r>\u0013HXGj\u0007f:S\u0011U\u001ev\t<\r\u001fU\nX݇s}:Oʡ.sI ZcȲ$ݎߠWis\u0016Y\u0006#_\u001d4#{_mB&KKn]r\u000b@\u0006\"Edm\u0002أ\u000bTS2bD<6\u0014kT\u0018\"@~\u000euw\u000fE;rwI\\&T'e\u0007L\u0013\u0011]`O31\u0003\u001dd6xc:5qT\u0007Gc`\n\u0004!\u0017N\u0003O-oU/R\tQ\u001bV\u000e1\u000fS\u0014[I0?JڛA\u0018y'$8F\u007fEBF\u001eiU\u001f_\u000f0\r\f\u0006h\\\u001d\u000f\u0012\u0015c~&78\u0013|<v:\u0013\u0019)gr\u001essًϘw<K\u001d\u0007ӡ`W\u0006҂\u0001\u001f"}, d2 = {"\u0016na6m6Gb\u0015\u0006eZ.|\u0016", "", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP)z0-\u0015>", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "1n]AX5M>\u0015}yb5~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", ">`V2F0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120M1?\u00014s", "0dh<a+/W\u0019\u0011\u0006h9\fs+g\u007f\u0006\u0006P\n&", "", ">`V2F7:Q\u001d\b|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "DdaA\\*:Zt\u0006~`5\u0005\t8t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", "4kX;Z\t>V\u0015\u0010~h9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w<?Hm4-\u0015gB@\u000bl.+v*C]R6i(", "CrT?F*K] \u0006Zg(y\u0010/d", "", "@de2e:>:\u0015\u0013\u0005n;", "9dh", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7mS2k", "", ">`V2A,Lb\u0019}h\\9\u0007\u00106C\n1\u0005@~&\u001bQx", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3UT1PUN*kV|Fi", "AmP=C6LW(\u0003\u0005g", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+'\u0010_79\u00015K[R6e(", ">`V266Gb\u0019\b\n", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP)i>)\u0015>", ">`V2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u0016na6m6Gb\u0015\u0006eZ.|\u0016vocun)u!", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn@U\u007f D7\u0001*OCHYC\u001a$h7 \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u001eRtt\u000fXE%rDDtn(R\u0001Hr\u0005\u000b)W3txM`\u001eGC\u0016\u007fQ2gBhc\u0004P\u000bL^>n\u001cnfG69#\u0018z\u001b\fdW>\n\n)wn[xtqK\u0018\u000e\u0002\"HufPSo\u001f=~7(Jw\u0007\u0016<a>6p/\u0004As!`\u0007KU\u001cS^Nx\rC=0%CF\u0017>^-svF\u0019r-aQ\u001ef~\r iglP\u000f\u0010lUL5nn\u00055N\r\u00140k\u001e&S\tFZ\r^\u0007\u0011,xoWCdU\u000b*yC\u001en\u0015\r\f0\u001a\u001c<%Mf\u000fvsN3Z\u0015\tw8\u000b\\`G\u001er%\u0010pG\u0004_a|y+mwO+BR@\u007f\u001cH\u0001\u0018_5\u0011\u0014|,wsK\b\u007fs5.;h<liz`NO+\u0018tB \u001e@z\u007f\\Hyh\u0006'^\u000e\u00122\u0001\u001ehNGK<AWy\";qI\u0012FaYY\u0015M#>`s\u0004@h}<QL\u0018\t\r+v\" 6/K.\u001bp\u001a<p\u0010\u000b\u001d9\u001b9#\fb\\\u0016\u0017\u0014xXQ\u0019yj3\u000f\u0019kHh#[\u00116CH\u0018V\u007f\u001b>\u0013\u0002]\b{F@un%\u0005/%P\u0016\u0010\u0011&m%O*b\u001a\u0003Aq_7+R2\u0015reC WI^\u00190#~dI\u007ftQ*K\u0006\n+#\u0006=m\u0006X:>b\u0001'?vuvWp|z)<U\u0006]\u0006&?~h1[KJV8C", "$daA\\*:Z\u0004z|^9", "6na6m6Gb\u0015\u0006Ve0~\u00127e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "$daA\\*:Z\u0004z|^9D\u0013\u00133r\u0011pJ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn@U\u007f D7\u0001*OCHYC\u001a$h7 \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u001eRtt\u000fXE%rDDtn(R\u0001Hr\u0005\u000b)W3txM`\u001eGC\u0016\u007fQ2gBhc\u0004P\u000bL^>n\u001cnfG69#\u0018z\u001b\fdW>\n\n)wn[xtqK\u0018\u000e\u0002\"HufPSo\u001f=~7(Jw\u0007\u0016<a>6p/\u0004As!`\u0007KU\u001cS^Nx\rC=0%CF\u0017>^-svF\u0019r-aQ\u001ef~\r iglP\u000f\u0010lU>?nc\u0016A[\u0015:PE{#O}Oe}\u0014\u001cP\"wmTM)TJ\u001bzT+^\r\u0012\u0007p!e0\u0016Kh\u001fu*m\u0001<\u000f\u0016j8\u001b{X$\u001ctQ\u0012JKuWhs.CN\u0006>\b9UK}VL9\u0015'<J\f\u000f&qxF\u0004?!n\u0006Mb6qd9\u00143)\t\u0015p7))10\u0015\u001c>xf\u00031#}Wx\u0001^aGC\u0012B\u000bRj0KcJ\u0013:g\\\u00173\u0017}/n\u0004\u0016AIqBTu\u0015]\u000e4\u0002\u0013\u001a;*\u007fPtN\u00178e\u0019\u0016\u000en0x\u0019\u000b`Y [\u00138IR*\u0007Z+\u0014\u0014,O2\u0017L\u000f8SGNV@-<\u0004\t_\n;Z\u0001gl6\u0006\f+O\u0016\u0015\fZ\u0010t,!e%\u0001{u\u00184rYk\r\u0005_=%RE\u001eFiz\u0011^C\u0005o\r]3_g(\u001fzFxv\u000eO}X\u007f%<\u0001:i\u0011t}\u007f0@\u0014(\u001d[%={r2\u0006t<VX6G\u0001", "2dQBZ\u0013HU", "5d]2e(MS\u0001\r|", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "1ta?X5M>\u0015\u0001zH-}\u0017/t", ":`h<h;,W.~", "AoP0X\t>b+~zg\u0017x\u000b/s", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", "1ta?X5M>\u0015\u0001z", "1ta?X5M>\u0015\u0001zH-}\u0017/t`5w>\u0010\u001b!P", "", ">`V266N\\(", ">`V2e\u001a>[\u0015\b\nb*\u000b", "7rE2e;BQ\u0015\u0006", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PagerKt {
    private static final void debugLog(Function0<String> function0) {
    }

    /* JADX INFO: renamed from: HorizontalPager-oI3XNZo */
    public static final void m1255HorizontalPageroI3XNZo(final PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i2, float f2, Alignment.Vertical vertical, TargetedFlingBehavior targetedFlingBehavior, boolean z2, boolean z3, Function1<? super Integer, ? extends Object> function1, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, final Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        boolean z4;
        NestedScrollConnection nestedScrollConnectionPageNestedScrollConnection = nestedScrollConnection;
        Function1<? super Integer, ? extends Object> function12 = function1;
        boolean z5 = z2;
        TargetedFlingBehavior targetedFlingBehaviorFlingBehavior = targetedFlingBehavior;
        Alignment.Vertical centerVertically = vertical;
        float fM6638constructorimpl = f2;
        int i9 = i2;
        PageSize.Fill fill = pageSize;
        PaddingValues paddingValuesM1011PaddingValues0680j_4 = paddingValues;
        SnapPosition.Start start = snapPosition;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1870896258);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HorizontalPager)P(11,4,1,7!1,8:c#ui.unit.Dp,13!1,12,9!1,6,10)114@6534L28,118@6750L79,125@6952L661:Pager.kt#g6yjnt");
        if ((i5 + 1) - (i5 | 1) != 0) {
            i6 = (i3 + 6) - (i3 & 6);
        } else if ((i3 + 6) - (i3 | 6) == 0) {
            i6 = (composerStartRestartGroup.changed(pagerState) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i10 = (-1) - (((-1) - i5) | ((-1) - 2));
        if (i10 != 0) {
            i6 = (i6 + 48) - (i6 & 48);
        } else if ((i3 & 48) == 0) {
            i6 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
        }
        int i11 = i5 & 4;
        if (i11 != 0) {
            i6 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i6 |= composerStartRestartGroup.changed(paddingValuesM1011PaddingValues0680j_4) ? 256 : 128;
        }
        int i12 = (-1) - (((-1) - i5) | ((-1) - 8));
        if (i12 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 3072));
        } else if ((i3 & 3072) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(fill) ? 2048 : 1024)));
        }
        int i13 = (i5 + 16) - (i5 | 16);
        if (i13 != 0) {
            i6 |= 24576;
        } else if ((i3 + 24576) - (i3 | 24576) == 0) {
            i6 |= composerStartRestartGroup.changed(i9) ? 16384 : 8192;
        }
        int i14 = (i5 + 32) - (i5 | 32);
        if (i14 != 0) {
            i6 = (i6 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i6 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - i3) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i6 |= composerStartRestartGroup.changed(fM6638constructorimpl) ? 131072 : 65536;
        }
        int i15 = (i5 + 64) - (i5 | 64);
        if (i15 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 1572864));
        } else if ((i3 + 1572864) - (i3 | 1572864) == 0) {
            int i16 = composerStartRestartGroup.changed(centerVertically) ? 1048576 : 524288;
            i6 = (i6 + i16) - (i6 & i16);
        }
        if ((i3 & 12582912) == 0) {
            int i17 = ((-1) - (((-1) - i5) | ((-1) - 128)) == 0 && composerStartRestartGroup.changed(targetedFlingBehaviorFlingBehavior)) ? 8388608 : 4194304;
            i6 = (i6 + i17) - (i6 & i17);
        }
        int i18 = (i5 + 256) - (i5 | 256);
        if (i18 != 0) {
            i6 |= 100663296;
        } else if ((-1) - (((-1) - i3) | ((-1) - 100663296)) == 0) {
            int i19 = composerStartRestartGroup.changed(z5) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i6 = (i6 + i19) - (i6 & i19);
        }
        int i20 = i5 & 512;
        if (i20 != 0) {
            i7 = (i6 + 805306368) - (i6 & 805306368);
        } else {
            if ((i3 + 805306368) - (i3 | 805306368) == 0) {
                int i21 = composerStartRestartGroup.changed(z3) ? 536870912 : 268435456;
                i6 = (i6 + i21) - (i6 & i21);
            }
            i7 = i6;
        }
        int i22 = i5 & 1024;
        if (i22 != 0) {
            i8 = i4 | 6;
        } else if ((i4 + 6) - (i4 | 6) == 0) {
            i8 = i4 | (composerStartRestartGroup.changedInstance(function12) ? 4 : 2);
        } else {
            i8 = i4;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 48)) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (((-1) - (((-1) - i5) | ((-1) - 2048)) == 0 && composerStartRestartGroup.changedInstance(nestedScrollConnectionPageNestedScrollConnection)) ? 32 : 16)));
        }
        int i23 = i5 & 4096;
        if (i23 != 0) {
            i8 = (i8 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i8 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i24 = composerStartRestartGroup.changed(start) ? 256 : 128;
            i8 = (i8 + i24) - (i8 & i24);
        }
        if ((i5 & 8192) != 0) {
            i8 |= 3072;
        } else if ((-1) - (((-1) - i4) | ((-1) - 3072)) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
        }
        if ((i7 & 306783379) == 306783378 && (i8 + 1171) - (1171 | i8) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            z4 = z3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i3 + 1) - (i3 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i10 != 0) {
                    companion = Modifier.Companion;
                }
                if (i11 != 0) {
                    paddingValuesM1011PaddingValues0680j_4 = PaddingKt.m1011PaddingValues0680j_4(Dp.m6638constructorimpl(0));
                }
                if (i12 != 0) {
                    fill = PageSize.Fill.INSTANCE;
                }
                if (i13 != 0) {
                    i9 = 0;
                }
                if (i14 != 0) {
                    fM6638constructorimpl = Dp.m6638constructorimpl(0);
                }
                if (i15 != 0) {
                    centerVertically = Alignment.Companion.getCenterVertically();
                }
                if ((i5 & 128) != 0) {
                    int i25 = 14 & i7;
                    targetedFlingBehaviorFlingBehavior = PagerDefaults.INSTANCE.flingBehavior(pagerState, null, null, null, 0.0f, composerStartRestartGroup, (i25 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i25 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE), 30);
                    i7 = (-1) - (((-1) - i7) | ((-1) - (-29360129)));
                }
                if (i18 != 0) {
                    z5 = true;
                }
                z4 = i20 == 0 ? z3 : false;
                if (i22 != 0) {
                    function12 = null;
                }
                if ((i5 & 2048) != 0) {
                    int i26 = (i7 + 14) - (14 | i7);
                    nestedScrollConnectionPageNestedScrollConnection = PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState, Orientation.Horizontal, composerStartRestartGroup, (i26 + 432) - (i26 & 432));
                    i8 &= -113;
                }
                if (i23 != 0) {
                    start = SnapPosition.Start.INSTANCE;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i5 & 128) != 0) {
                    i7 = (i7 - 29360129) - (i7 | (-29360129));
                }
                if ((-1) - (((-1) - i5) | ((-1) - 2048)) != 0) {
                    i8 = (i8 - 113) - (i8 | (-113));
                }
                z4 = z3;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1870896258, i7, i8, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:124)");
            }
            Orientation orientation = Orientation.Horizontal;
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            int i27 = (-1) - (((-1) - ((-1) - (((-1) - (i7 >> 3)) | ((-1) - 14)))) & ((-1) - 24576));
            int i28 = i7 << 3;
            int i29 = (i28 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i28 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
            int i30 = (-1) - (((-1) - ((i27 + i29) - (i27 & i29))) & ((-1) - ((-1) - (((-1) - i7) | ((-1) - 896)))));
            int i31 = (i7 >> 18) & 7168;
            int i32 = (i30 + i31) - (i30 & i31);
            int i33 = i7 >> 6;
            int i34 = (-1) - (((-1) - ((-1) - (((-1) - i32) & ((-1) - ((-1) - (((-1) - 458752) | ((-1) - i33))))))) & ((-1) - (i33 & 3670016)));
            int i35 = i7 << 9;
            int i36 = (29360128 + i35) - (29360128 | i35);
            int i37 = (-1) - (((-1) - ((i34 + i36) - (i34 & i36))) & ((-1) - ((-1) - (((-1) - i35) | ((-1) - 234881024)))));
            int i38 = i7 << 18;
            int i39 = (i38 + 1879048192) - (i38 | 1879048192);
            int i40 = i8 << 6;
            LazyLayoutPagerKt.m1251PageruYRUAWA(companion, pagerState, paddingValuesM1011PaddingValues0680j_4, z4, orientation, targetedFlingBehaviorFlingBehavior, z5, i9, fM6638constructorimpl, fill, nestedScrollConnectionPageNestedScrollConnection, function12, centerHorizontally, centerVertically, start, function4, composerStartRestartGroup, (i37 + i39) - (i37 & i39), ((i7 >> 9) & 7168) | ((-1) - (((-1) - ((i8 >> 3) & 14)) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT))) | ((-1) - (((-1) - (i8 << 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) | (57344 & i40) | ((i40 + 458752) - (i40 | 458752)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final PaddingValues paddingValues2 = paddingValuesM1011PaddingValues0680j_4;
            final PageSize pageSize2 = fill;
            final int i41 = i9;
            final float f3 = fM6638constructorimpl;
            final Alignment.Vertical vertical2 = centerVertically;
            final TargetedFlingBehavior targetedFlingBehavior2 = targetedFlingBehaviorFlingBehavior;
            final boolean z6 = z5;
            final boolean z7 = z4;
            final Function1<? super Integer, ? extends Object> function13 = function12;
            final NestedScrollConnection nestedScrollConnection2 = nestedScrollConnectionPageNestedScrollConnection;
            final SnapPosition snapPosition2 = start;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
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

                public final void invoke(Composer composer2, int i42) {
                    PagerKt.m1255HorizontalPageroI3XNZo(pagerState, modifier2, paddingValues2, pageSize2, i41, f3, vertical2, targetedFlingBehavior2, z6, z7, function13, nestedScrollConnection2, snapPosition2, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                }
            });
        }
    }

    /* JADX INFO: renamed from: VerticalPager-oI3XNZo */
    public static final void m1256VerticalPageroI3XNZo(final PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i2, float f2, Alignment.Horizontal horizontal, TargetedFlingBehavior targetedFlingBehavior, boolean z2, boolean z3, Function1<? super Integer, ? extends Object> function1, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, final Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        boolean z4;
        NestedScrollConnection nestedScrollConnectionPageNestedScrollConnection = nestedScrollConnection;
        Function1<? super Integer, ? extends Object> function12 = function1;
        boolean z5 = z2;
        TargetedFlingBehavior targetedFlingBehaviorFlingBehavior = targetedFlingBehavior;
        Alignment.Horizontal centerHorizontally = horizontal;
        float fM6638constructorimpl = f2;
        int i8 = i2;
        PageSize.Fill fill = pageSize;
        PaddingValues paddingValuesM1011PaddingValues0680j_4 = paddingValues;
        SnapPosition.Start start = snapPosition;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(909160706);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(VerticalPager)P(12,5,1,8!1,9:c#ui.unit.Dp,3!1,13,10!1,7,11)201@11541L28,205@11757L77,212@11957L659:Pager.kt#g6yjnt");
        if ((i5 + 1) - (i5 | 1) != 0) {
            i6 = (-1) - (((-1) - i3) & ((-1) - 6));
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            int i9 = composerStartRestartGroup.changed(pagerState) ? 4 : 2;
            i6 = (i9 + i3) - (i9 & i3);
        } else {
            i6 = i3;
        }
        int i10 = (i5 + 2) - (i5 | 2);
        if (i10 != 0) {
            i6 = (i6 + 48) - (i6 & 48);
        } else if ((i3 & 48) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        int i11 = i5 & 4;
        if (i11 != 0) {
            i6 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i6 |= composerStartRestartGroup.changed(paddingValuesM1011PaddingValues0680j_4) ? 256 : 128;
        }
        int i12 = (-1) - (((-1) - i5) | ((-1) - 8));
        if (i12 != 0) {
            i6 |= 3072;
        } else if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(fill) ? 2048 : 1024)));
        }
        int i13 = i5 & 16;
        if (i13 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 24576));
        } else if ((-1) - (((-1) - i3) | ((-1) - 24576)) == 0) {
            int i14 = composerStartRestartGroup.changed(i8) ? 16384 : 8192;
            i6 = (i6 + i14) - (i6 & i14);
        }
        int i15 = (i5 + 32) - (i5 | 32);
        if (i15 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((i3 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i3 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(fM6638constructorimpl) ? 131072 : 65536)));
        }
        int i16 = (i5 + 64) - (i5 | 64);
        if (i16 != 0) {
            i6 |= 1572864;
        } else if ((-1) - (((-1) - i3) | ((-1) - 1572864)) == 0) {
            i6 |= composerStartRestartGroup.changed(centerHorizontally) ? 1048576 : 524288;
        }
        if ((i3 + 12582912) - (i3 | 12582912) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (((i5 & 128) == 0 && composerStartRestartGroup.changed(targetedFlingBehaviorFlingBehavior)) ? 8388608 : 4194304)));
        }
        int i17 = (-1) - (((-1) - i5) | ((-1) - 256));
        if (i17 != 0) {
            i6 = (i6 + 100663296) - (i6 & 100663296);
        } else if ((i3 & 100663296) == 0) {
            i6 |= composerStartRestartGroup.changed(z5) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i18 = (-1) - (((-1) - i5) | ((-1) - 512));
        if (i18 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 805306368));
        } else if ((i3 + 805306368) - (i3 | 805306368) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(z3) ? 536870912 : 268435456)));
        }
        int i19 = i5 & 1024;
        if (i19 != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = i4 | (composerStartRestartGroup.changedInstance(function12) ? 4 : 2);
        } else {
            i7 = i4;
        }
        if ((i4 + 48) - (i4 | 48) == 0) {
            i7 |= ((-1) - (((-1) - i5) | ((-1) - 2048)) == 0 && composerStartRestartGroup.changedInstance(nestedScrollConnectionPageNestedScrollConnection)) ? 32 : 16;
        }
        int i20 = (i5 + 4096) - (i5 | 4096);
        if (i20 != 0) {
            i7 = (i7 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i7 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i21 = composerStartRestartGroup.changed(start) ? 256 : 128;
            i7 = (i7 + i21) - (i7 & i21);
        }
        if ((i5 + 8192) - (i5 | 8192) != 0) {
            i7 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
        }
        if ((-1) - (((-1) - i6) | ((-1) - 306783379)) == 306783378 && (i7 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            z4 = z3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i3) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i10 != 0) {
                    companion = Modifier.Companion;
                }
                if (i11 != 0) {
                    paddingValuesM1011PaddingValues0680j_4 = PaddingKt.m1011PaddingValues0680j_4(Dp.m6638constructorimpl(0));
                }
                if (i12 != 0) {
                    fill = PageSize.Fill.INSTANCE;
                }
                if (i13 != 0) {
                    i8 = 0;
                }
                if (i15 != 0) {
                    fM6638constructorimpl = Dp.m6638constructorimpl(0);
                }
                if (i16 != 0) {
                    centerHorizontally = Alignment.Companion.getCenterHorizontally();
                }
                if ((i5 + 128) - (i5 | 128) != 0) {
                    int i22 = (-1) - (((-1) - i6) | ((-1) - 14));
                    targetedFlingBehaviorFlingBehavior = PagerDefaults.INSTANCE.flingBehavior(pagerState, null, null, null, 0.0f, composerStartRestartGroup, (i22 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i22 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE), 30);
                    i6 = (i6 - 29360129) - (i6 | (-29360129));
                }
                if (i17 != 0) {
                    z5 = true;
                }
                z4 = i18 == 0 ? z3 : false;
                if (i19 != 0) {
                    function12 = null;
                }
                if ((i5 & 2048) != 0) {
                    nestedScrollConnectionPageNestedScrollConnection = PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState, Orientation.Vertical, composerStartRestartGroup, ((-1) - (((-1) - i6) | ((-1) - 14))) | 432);
                    i7 = (-1) - (((-1) - i7) | ((-1) - (-113)));
                }
                if (i20 != 0) {
                    start = SnapPosition.Start.INSTANCE;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i5 + 128) - (i5 | 128) != 0) {
                    i6 = (-1) - (((-1) - i6) | ((-1) - (-29360129)));
                }
                if ((i5 & 2048) != 0) {
                    i7 = (i7 - 113) - (i7 | (-113));
                }
                z4 = z3;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(909160706, i6, i7, "androidx.compose.foundation.pager.VerticalPager (Pager.kt:211)");
            }
            Orientation orientation = Orientation.Vertical;
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            int i23 = (-1) - (((-1) - (i6 >> 3)) | ((-1) - 14));
            int i24 = i6 >> 6;
            int i25 = ((-1) - (((-1) - ((-1) - (((-1) - ((((i23 + 24576) - (i23 & 24576)) | ((i6 << 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) | (896 & i6))) & ((-1) - ((i6 >> 18) & 7168))))) & ((-1) - (458752 & i24)))) | ((-1) - (((-1) - i24) | ((-1) - 3670016)));
            int i26 = i6 << 9;
            int i27 = (29360128 + i26) - (29360128 | i26);
            int i28 = ((-1) - (((-1) - ((i25 + i27) - (i25 & i27))) & ((-1) - ((-1) - (((-1) - i26) | ((-1) - 234881024)))))) | ((i6 << 18) & 1879048192);
            int i29 = i7 << 3;
            int i30 = ((-1) - (((-1) - ((i7 >> 3) & 14)) & ((-1) - 3072))) | ((i29 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i29 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            int i31 = i6 >> 12;
            int i32 = (i31 + 896) - (i31 | 896);
            int i33 = i7 << 6;
            LazyLayoutPagerKt.m1251PageruYRUAWA(companion, pagerState, paddingValuesM1011PaddingValues0680j_4, z4, orientation, targetedFlingBehaviorFlingBehavior, z5, i8, fM6638constructorimpl, fill, nestedScrollConnectionPageNestedScrollConnection, function12, centerHorizontally, centerVertically, start, function4, composerStartRestartGroup, i28, (-1) - (((-1) - ((-1) - (((-1) - ((i32 + i30) - (i32 & i30))) & ((-1) - ((-1) - (((-1) - 57344) | ((-1) - i33))))))) & ((-1) - ((i33 + 458752) - (i33 | 458752)))), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final PaddingValues paddingValues2 = paddingValuesM1011PaddingValues0680j_4;
            final PageSize pageSize2 = fill;
            final int i34 = i8;
            final float f3 = fM6638constructorimpl;
            final Alignment.Horizontal horizontal2 = centerHorizontally;
            final TargetedFlingBehavior targetedFlingBehavior2 = targetedFlingBehaviorFlingBehavior;
            final boolean z6 = z5;
            final boolean z7 = z4;
            final Function1<? super Integer, ? extends Object> function13 = function12;
            final NestedScrollConnection nestedScrollConnection2 = nestedScrollConnectionPageNestedScrollConnection;
            final SnapPosition snapPosition2 = start;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$VerticalPager$1
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

                public final void invoke(Composer composer2, int i35) {
                    PagerState pagerState2 = pagerState;
                    Modifier modifier3 = modifier2;
                    PaddingValues paddingValues3 = paddingValues2;
                    PageSize pageSize3 = pageSize2;
                    int i36 = i34;
                    float f4 = f3;
                    Alignment.Horizontal horizontal3 = horizontal2;
                    TargetedFlingBehavior targetedFlingBehavior3 = targetedFlingBehavior2;
                    boolean z8 = z6;
                    boolean z9 = z7;
                    Function1<Integer, Object> function14 = function13;
                    NestedScrollConnection nestedScrollConnection3 = nestedScrollConnection2;
                    SnapPosition snapPosition3 = snapPosition2;
                    Function4<PagerScope, Integer, Composer, Integer, Unit> function42 = function4;
                    int i37 = i3;
                    PagerKt.m1256VerticalPageroI3XNZo(pagerState2, modifier3, paddingValues3, pageSize3, i36, f4, horizontal3, targetedFlingBehavior3, z8, z9, function14, nestedScrollConnection3, snapPosition3, function42, composer2, RecomposeScopeImplKt.updateChangedFlags((i37 + 1) - (i37 & 1)), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                }
            });
        }
    }

    public static final int currentPageOffset(SnapPosition snapPosition, int i2, int i3, int i4, int i5, int i6, int i7, float f2, int i8) {
        return MathKt.roundToInt(snapPosition.position(i2, i3, i5, i6, i7, i8) - (f2 * (i3 + i4)));
    }

    public static final boolean pagerSemantics$performForwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollForward()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    public static final boolean pagerSemantics$performBackwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollBackward()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1 */
    /* JADX INFO: compiled from: Pager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        final /* synthetic */ boolean $isVertical;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ PagerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z2, PagerState pagerState, CoroutineScope coroutineScope) {
            super(1);
            z = z2;
            pagerState = pagerState;
            coroutineScope = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1$1 */
        /* JADX INFO: compiled from: Pager.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,r\bDJc\u0003İY\u0006^\ntJ֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class C00401 extends Lambda implements Function0<Boolean> {
            final /* synthetic */ CoroutineScope $scope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00401(CoroutineScope coroutineScope) {
                super(0);
                coroutineScope = coroutineScope;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState, coroutineScope));
            }
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            if (z) {
                SemanticsPropertiesKt.pageUp$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.1
                    final /* synthetic */ CoroutineScope $scope;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00401(CoroutineScope coroutineScope) {
                        super(0);
                        coroutineScope = coroutineScope;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState, coroutineScope));
                    }
                }, 1, null);
                SemanticsPropertiesKt.pageDown$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.2
                    final /* synthetic */ CoroutineScope $scope;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(CoroutineScope coroutineScope) {
                        super(0);
                        coroutineScope = coroutineScope;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState, coroutineScope));
                    }
                }, 1, null);
            } else {
                SemanticsPropertiesKt.pageLeft$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.3
                    final /* synthetic */ CoroutineScope $scope;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass3(CoroutineScope coroutineScope) {
                        super(0);
                        coroutineScope = coroutineScope;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState, coroutineScope));
                    }
                }, 1, null);
                SemanticsPropertiesKt.pageRight$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.4
                    final /* synthetic */ CoroutineScope $scope;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass4(CoroutineScope coroutineScope) {
                        super(0);
                        coroutineScope = coroutineScope;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState, coroutineScope));
                    }
                }, 1, null);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1$2 */
        /* JADX INFO: compiled from: Pager.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,r\bDJc\u0003İY\u0006^\ntJ֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass2 extends Lambda implements Function0<Boolean> {
            final /* synthetic */ CoroutineScope $scope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CoroutineScope coroutineScope) {
                super(0);
                coroutineScope = coroutineScope;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState, coroutineScope));
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1$3 */
        /* JADX INFO: compiled from: Pager.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,r\bDJc\u0003İY\u0006^\ntJ֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass3 extends Lambda implements Function0<Boolean> {
            final /* synthetic */ CoroutineScope $scope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CoroutineScope coroutineScope) {
                super(0);
                coroutineScope = coroutineScope;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState, coroutineScope));
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1$4 */
        /* JADX INFO: compiled from: Pager.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,r\bDJc\u0003İY\u0006^\ntJ֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass4 extends Lambda implements Function0<Boolean> {
            final /* synthetic */ CoroutineScope $scope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CoroutineScope coroutineScope) {
                super(0);
                coroutineScope = coroutineScope;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState, coroutineScope));
            }
        }
    }

    public static final Modifier pagerSemantics(Modifier modifier, PagerState pagerState, boolean z2, CoroutineScope coroutineScope, boolean z3) {
        return z3 ? modifier.then(SemanticsModifierKt.semantics$default(Modifier.Companion, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1
            final /* synthetic */ boolean $isVertical;
            final /* synthetic */ CoroutineScope $scope;
            final /* synthetic */ PagerState $state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z22, PagerState pagerState2, CoroutineScope coroutineScope2) {
                super(1);
                z = z22;
                pagerState = pagerState2;
                coroutineScope = coroutineScope2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1$1 */
            /* JADX INFO: compiled from: Pager.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,r\bDJc\u0003İY\u0006^\ntJ֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            static final class C00401 extends Lambda implements Function0<Boolean> {
                final /* synthetic */ CoroutineScope $scope;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00401(CoroutineScope coroutineScope) {
                    super(0);
                    coroutineScope = coroutineScope;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState, coroutineScope));
                }
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (z) {
                    SemanticsPropertiesKt.pageUp$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.1
                        final /* synthetic */ CoroutineScope $scope;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00401(CoroutineScope coroutineScope2) {
                            super(0);
                            coroutineScope = coroutineScope2;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState, coroutineScope));
                        }
                    }, 1, null);
                    SemanticsPropertiesKt.pageDown$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.2
                        final /* synthetic */ CoroutineScope $scope;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass2(CoroutineScope coroutineScope2) {
                            super(0);
                            coroutineScope = coroutineScope2;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState, coroutineScope));
                        }
                    }, 1, null);
                } else {
                    SemanticsPropertiesKt.pageLeft$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.3
                        final /* synthetic */ CoroutineScope $scope;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass3(CoroutineScope coroutineScope2) {
                            super(0);
                            coroutineScope = coroutineScope2;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState, coroutineScope));
                        }
                    }, 1, null);
                    SemanticsPropertiesKt.pageRight$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.4
                        final /* synthetic */ CoroutineScope $scope;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass4(CoroutineScope coroutineScope2) {
                            super(0);
                            coroutineScope = coroutineScope2;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState, coroutineScope));
                        }
                    }, 1, null);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1$2 */
            /* JADX INFO: compiled from: Pager.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,r\bDJc\u0003İY\u0006^\ntJ֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            static final class AnonymousClass2 extends Lambda implements Function0<Boolean> {
                final /* synthetic */ CoroutineScope $scope;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(CoroutineScope coroutineScope2) {
                    super(0);
                    coroutineScope = coroutineScope2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState, coroutineScope));
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1$3 */
            /* JADX INFO: compiled from: Pager.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,r\bDJc\u0003İY\u0006^\ntJ֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            static final class AnonymousClass3 extends Lambda implements Function0<Boolean> {
                final /* synthetic */ CoroutineScope $scope;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(CoroutineScope coroutineScope2) {
                    super(0);
                    coroutineScope = coroutineScope2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState, coroutineScope));
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1$4 */
            /* JADX INFO: compiled from: Pager.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,r\bDJc\u0003İY\u0006^\ntJ֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            static final class AnonymousClass4 extends Lambda implements Function0<Boolean> {
                final /* synthetic */ CoroutineScope $scope;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(CoroutineScope coroutineScope2) {
                    super(0);
                    coroutineScope = coroutineScope2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState, coroutineScope));
                }
            }
        }, 1, null)) : modifier.then(Modifier.Companion);
    }
}
