package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: LazyGrid.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яx\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS8\u0018s{:$c$\bCCU }*\teNo˧vJp\u000bKƤ\u000e\u0016\u000fj4Ikxe\u0012%2JoE3UoS9htL\u0005(288\u0002\u0005\u0017\u001a2Ϻ\u0018v\u0011CS\f(0H\u0081BR#M\r܅\u001a\u0006T \t\u001ebgf3VǍu:]\"3oHN5_H|{\u000evX5\u000f\u000faL.p;C\u0019=S1\f\u0003aE\u0003MwU\u0005\u0017.W1Ose>p\u007fB\u001e[S\u001bg\u000b&\u000b\u000e\u0002f\u0012'9Z{K~\u001aX{\t\t%<2\u00176+V<E\u001a\u0015\u0017>7\u0003\u0003k@~\u0013\u000fW\u000e\ryG''\u00103YM+haai\u0018|J߉\t\r$8GmĲ_T\u001cv-\u0018b\u000fiHaBMH|#i?}\u0004\u001f|\u0012,\u00140u\u001b]\u0014 2\u0017+L\fC1=\u0004\bXFwv3~\u0017p\u001aVVB:nD:Z\r\u001a^\\d3p\u0001Xf2)MJ[7\u0002\u0016\u001b8\\&EQ)\u001eXgh\u0018s}c\u00185GhMX\u001d|>]GlK7gb>p\u0003z\"^Tb3x\u0017Fa-r\\VDxIн\u0014w\ng±\u00107"}, d2 = {"\u001a`iF:9BR", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`'\u0016_;NL", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`'\u000em;\\a4Q]R+\\_H", "1n]AX5M>\u0015}yb5~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "@de2e:>:\u0015\u0013\u0005n;", "", "7rE2e;BQ\u0015\u0006", "4kX;Z\t>V\u0015\u0010~h9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w.J?t6z\u0015k]J\u000bm9$", "CrT?F*K] \u0006Zg(y\u0010/d", "DdaA\\*:Zt\f\bZ5~\t7e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwwc9]z%CS$", "6na6m6Gb\u0015\u0006Vk9x\u00121e\b(\u0005O", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J32", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`'\u0005m7NL", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pd6^\u007f&C[R6e\u001cy9)&$\u0010[/\fN@=9\u0003&D#\u0007\u001aX}JhVr\u0012\u00174wzFU#\u0011w\u001f}L3vF#`\u0004WJD^9h\u0016hfc6O8]s&\u001fg\u001a\u0015\u0006\u0011gr\u007fVxUnQ(\t#1H~_EE|+#p0\u001eX\u0006{\u0011E\"r5|8\u000eB*\u007fe\u000f[p\u0017:m|\u001f5&H#:@L\"\t6_tkB\u0017j\u0010]\u000f\u001ebC\u0007\u000eZL_Q\u000e\u0014g\u001bZH+]\u000b?]\u0010LI9\u00161V\bAW\t\u0019\u0013\u0010moeWR+a\u0001(:%)c\u001a\u0005_f\u001b\u0018?\u001aGfd]\u0011[@L \u0013l7\u001fEWM\u001d{R\u001em\u0015segx#2\b\u0015S*|R8\u000b\\S~YqA\u000e\u0007\b\u001fsqB\u0003EQ\u0016%Jh<`\\6`NO+\u0018tB \u001e@z\u007f\\Hyh\u0006'^~\u0018x\u0006\u0014YM<\f<\u000bPf6FsZN\u0018g_\f5O\u00157`}%\u0001>}BN\u0004\u0018\t\u0013'\u007fh\u000320\u0005N#pd4w\u0014U\u000b\u007f&-*\u0005bW$\u0017s~QF)\u0002e8Pe\tBq\u0014Y\u000b-BM\u0018F\u0001'>\u0012\fTO?h@\tgBzj~K\u001a\u0011\u0012^\u0007,\u001b~?y=h", "@d\\2`)>`\u007fz\u0010r\u000e\n\r.M\u007f$\nP\u000e\u0017\u0002Qv\u0012:\u000b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,JP|H\u0014g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "7sT:C9Hd\u001d}zk\u0013x\u0011,d{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`\u001d\u0016c49\u00041XPM,i(", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "5qP=[0<av\t\u0004m,\u0010\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<+MDz41$>", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cuO\u00017PKJ;`\\{\u0007\u001b\u000eo\"\u0018-\u001a\tX\u000b\u000bjYK\u0001\u00150HoJd\u0010\fkt1soO`\u0014F\r^sK1sPg_CHKUk)`\u001bc'e\u0004A )\u0006b\u001duT-SbO&\u00074\u0007kf5 \u0005G2)zeWInUIJ\u000e\u001bTz\u0005\u001c6W\btr7\f?4DdNLq(G]t$0fJp-2P\u001dOZ-`h=\rl(cx\niE1';ZX/\u000b\u0010\\$e9`rJ5\\\u000eIS}\u0015pG\tRdx\u0011\u0018\u000b.v/P?/^\u0011): /l\r\f\u0005f \u001c7%{<\u0019u.tAV\"\u0005o\u000erwbB\"zL\u000f\u0001\u0015pe_z.DxZJ+CT;raGy\u0019_;|\u001f\t-\u00033\u001e\u0007C\u000f.'=a8kom{g`1\u001de4#t\u00147\faGrg\u000bp\u0013\b\u001br\r$aG8\u0010|\u001fSw,LrO\u000e<HP\u001a7Mj\u0016\\}\u0015Oew4]8\f\n\f6\u0003!\u001cu6y\u0011!t\u0017:i\u0010\n\u00189~<\u0017\f[R\u0014[pxQW\u001a\u0011j\u0005k\f+Eu\u001fP\u007f<\r8XP\u0002)A\bGa\u0016;g;\u0002c\u0004X+)L\u001c\u0014\b]\\\u0003\t\u0002a \t~pWxfb*UufH\u0014]?\u001fA.caeNsz\u0007^mVV", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyGridKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1 */
    /* JADX INFO: compiled from: LazyGrid.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function1<LazyGridScope, Unit> $content;
        final /* synthetic */ PaddingValues $contentPadding;
        final /* synthetic */ FlingBehavior $flingBehavior;
        final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
        final /* synthetic */ boolean $isVertical;
        final /* synthetic */ boolean $reverseLayout;
        final /* synthetic */ LazyGridSlotsProvider $slots;
        final /* synthetic */ LazyGridState $state;
        final /* synthetic */ boolean $userScrollEnabled;
        final /* synthetic */ Arrangement.Vertical $verticalArrangement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(LazyGridState lazyGridState, LazyGridSlotsProvider lazyGridSlotsProvider, PaddingValues paddingValues, boolean z2, boolean z3, FlingBehavior flingBehavior, boolean z4, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Function1<? super LazyGridScope, Unit> function1, int i2, int i3, int i4) {
            super(2);
            lazyGridState = lazyGridState;
            lazyGridSlotsProvider = lazyGridSlotsProvider;
            paddingValues = paddingValues;
            z = z2;
            z = z3;
            flingBehavior = flingBehavior;
            z = z4;
            vertical = vertical;
            horizontal = horizontal;
            function1 = function1;
            i = i2;
            i = i3;
            i = i4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            LazyGridKt.LazyGrid(modifier, lazyGridState, lazyGridSlotsProvider, paddingValues, z, z, flingBehavior, z, vertical, horizontal, function1, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    public static final void LazyGrid(Modifier modifier, LazyGridState lazyGridState, LazyGridSlotsProvider lazyGridSlotsProvider, PaddingValues paddingValues, boolean z2, boolean z3, FlingBehavior flingBehavior, boolean z4, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Function1<? super LazyGridScope, Unit> function1, Composer composer, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean z5;
        Composer composer2;
        FlingBehavior flingBehavior2 = flingBehavior;
        boolean z6 = z2;
        PaddingValues paddingValuesM1011PaddingValues0680j_4 = paddingValues;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-649686062);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LazyGrid)P(5,8,7,1,6,4,2,9,10,3)68@3233L15,78@3657L50,80@3733L51,82@3811L24,83@3883L7,84@3915L269,102@4422L278,110@4770L48,113@4981L7,109@4714L376,118@5151L317,98@4277L1324:LazyGrid.kt#7791vq");
        int i7 = (-1) - (((-1) - i4) | ((-1) - 1));
        if (i7 != 0) {
            i5 = (i2 + 6) - (i2 & 6);
        } else if ((i2 & 6) == 0) {
            int i8 = composerStartRestartGroup.changed(companion) ? 4 : 2;
            i5 = (i8 + i2) - (i8 & i2);
        } else {
            i5 = i2;
        }
        if ((i4 + 2) - (i4 | 2) != 0) {
            i5 = (i5 + 48) - (i5 & 48);
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i9 = composerStartRestartGroup.changed(lazyGridState) ? 32 : 16;
            i5 = (i5 + i9) - (i5 & i9);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 |= (i2 + 512) - (i2 | 512) == 0 ? composerStartRestartGroup.changed(lazyGridSlotsProvider) : composerStartRestartGroup.changedInstance(lazyGridSlotsProvider) ? 256 : 128;
        }
        int i10 = (i4 + 8) - (i4 | 8);
        if (i10 != 0) {
            i5 |= 3072;
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i11 = composerStartRestartGroup.changed(paddingValuesM1011PaddingValues0680j_4) ? 2048 : 1024;
            i5 = (i5 + i11) - (i5 & i11);
        }
        int i12 = (i4 + 16) - (i4 | 16);
        if (i12 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 24576));
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i5 |= composerStartRestartGroup.changed(z6) ? 16384 : 8192;
        }
        if ((i4 + 32) - (i4 | 32) != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            int i13 = composerStartRestartGroup.changed(z3) ? 131072 : 65536;
            i5 = (i5 + i13) - (i5 & i13);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 1572864)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 + 64) - (i4 | 64) == 0 && composerStartRestartGroup.changed(flingBehavior2)) ? 1048576 : 524288)));
        }
        if ((i4 & 128) != 0) {
            i5 |= 12582912;
        } else if ((i2 + 12582912) - (i2 | 12582912) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(z4) ? 8388608 : 4194304)));
        }
        if ((i4 + 256) - (i4 | 256) != 0) {
            i5 = (i5 + 100663296) - (i5 & 100663296);
        } else if ((i2 & 100663296) == 0) {
            i5 |= composerStartRestartGroup.changed(vertical) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i4 & 512) != 0) {
            i5 |= 805306368;
        } else if ((i2 + 805306368) - (i2 | 805306368) == 0) {
            int i14 = composerStartRestartGroup.changed(horizontal) ? 536870912 : 268435456;
            i5 = (i5 + i14) - (i5 & i14);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 1024)) != 0) {
            i6 = (i3 + 6) - (i3 & 6);
        } else if ((i3 & 6) == 0) {
            i6 = i3 | (composerStartRestartGroup.changedInstance(function1) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 306783379)) == 306783378 && (i6 + 3) - (3 | i6) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            z5 = z6;
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    companion = Modifier.Companion;
                }
                if (i10 != 0) {
                    paddingValuesM1011PaddingValues0680j_4 = PaddingKt.m1011PaddingValues0680j_4(Dp.m6638constructorimpl(0));
                }
                if (i12 != 0) {
                    z6 = false;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                    i5 &= -3670017;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 + 64) - (i4 | 64) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-3670017)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-649686062, i5, i6, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
            }
            int i15 = i5 >> 3;
            int i16 = (-1) - (((-1) - i15) | ((-1) - 14));
            int i17 = i6 << 3;
            int i18 = (i17 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i17 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
            Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, (i18 + i16) - (i18 & i16));
            int i19 = i5 >> 9;
            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z6, composerStartRestartGroup, ((i19 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i19 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) | i16);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ProvidableCompositionLocal<GraphicsContext> localGraphicsContext = CompositionLocalsKt.getLocalGraphicsContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localGraphicsContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i20 = (-1) - (((-1) - i5) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            int i21 = (i5 + 57344) - (57344 | i5);
            z5 = z6;
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda, lazyGridState, lazyGridSlotsProvider, paddingValuesM1011PaddingValues0680j_4, z6, z3, horizontal, vertical, coroutineScope, (GraphicsContext) objConsume, composerStartRestartGroup, (-1) - (((-1) - (((524272 + i5) - (524272 | i5)) | (i19 & 3670016))) & ((-1) - (29360128 & i15))));
            Orientation orientation = z3 ? Orientation.Vertical : Orientation.Horizontal;
            Modifier modifierLazyLayoutSemantics = LazyLayoutSemanticsKt.lazyLayoutSemantics(companion.then(lazyGridState.getRemeasurementModifier$foundation_release()).then(lazyGridState.getAwaitLayoutModifier$foundation_release()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState, orientation, z4, z5, composerStartRestartGroup, (-1) - (((-1) - (i19 & 57344)) & ((-1) - ((i5 << 3) & 458752))));
            LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsStateRememberLazyGridBeyondBoundsState = LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i16);
            LazyLayoutBeyondBoundsInfo beyondBoundsInfo$foundation_release = lazyGridState.getBeyondBoundsInfo$foundation_release();
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i22 = (-1) - (((-1) - (MutableVector.$stable << 6)) & ((-1) - (i15 & 7168)));
            int i23 = (-1) - (((-1) - 3670016) | ((-1) - i15));
            composer2 = composerStartRestartGroup;
            LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(modifierLazyLayoutSemantics, lazyLayoutBeyondBoundsStateRememberLazyGridBeyondBoundsState, beyondBoundsInfo$foundation_release, z5, (LayoutDirection) objConsume2, orientation, z4, composerStartRestartGroup, (i22 + i23) - (i22 & i23)).then(lazyGridState.getItemAnimator$foundation_release().getModifier()), lazyGridState, orientation, z4, z5, flingBehavior2, lazyGridState.getInternalInteractionSource$foundation_release(), null, composerStartRestartGroup, i20 | ((-1) - (((-1) - (i5 >> 12)) | ((-1) - 7168))) | i21 | ((458752 + i15) - (458752 | i15)), 64), lazyGridState.getPrefetchState$foundation_release(), function2RememberLazyGridMeasurePolicy, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$changed1;
                final /* synthetic */ int $$default;
                final /* synthetic */ Function1<LazyGridScope, Unit> $content;
                final /* synthetic */ PaddingValues $contentPadding;
                final /* synthetic */ FlingBehavior $flingBehavior;
                final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
                final /* synthetic */ boolean $isVertical;
                final /* synthetic */ boolean $reverseLayout;
                final /* synthetic */ LazyGridSlotsProvider $slots;
                final /* synthetic */ LazyGridState $state;
                final /* synthetic */ boolean $userScrollEnabled;
                final /* synthetic */ Arrangement.Vertical $verticalArrangement;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(LazyGridState lazyGridState2, LazyGridSlotsProvider lazyGridSlotsProvider2, PaddingValues paddingValuesM1011PaddingValues0680j_42, boolean z52, boolean z32, FlingBehavior flingBehavior22, boolean z42, Arrangement.Vertical vertical2, Arrangement.Horizontal horizontal2, Function1<? super LazyGridScope, Unit> function12, int i24, int i32, int i42) {
                    super(2);
                    lazyGridState = lazyGridState2;
                    lazyGridSlotsProvider = lazyGridSlotsProvider2;
                    paddingValues = paddingValuesM1011PaddingValues0680j_42;
                    z = z52;
                    z = z32;
                    flingBehavior = flingBehavior22;
                    z = z42;
                    vertical = vertical2;
                    horizontal = horizontal2;
                    function1 = function12;
                    i = i24;
                    i = i32;
                    i = i42;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i24) {
                    LazyGridKt.LazyGrid(modifier, lazyGridState, lazyGridSlotsProvider, paddingValues, z, z, flingBehavior, z, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i), i);
                }
            });
        }
    }

    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy(final Function0<? extends LazyGridItemProvider> function0, final LazyGridState lazyGridState, final LazyGridSlotsProvider lazyGridSlotsProvider, final PaddingValues paddingValues, final boolean z2, final boolean z3, final Arrangement.Horizontal horizontal, final Arrangement.Vertical vertical, final CoroutineScope coroutineScope, final GraphicsContext graphicsContext, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1585069765, "C(rememberLazyGridMeasurePolicy)P(5,8,7!1,6,4,3,9)161@6721L9334:LazyGrid.kt#7791vq");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1585069765, i2, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:161)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1026581015, "CC(remember):LazyGrid.kt#9igjgp");
        int i3 = ((((((-1) - (((-1) - i2) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) ^ 48) <= 32 || !composer.changed(lazyGridState)) && (-1) - (((-1) - i2) | ((-1) - 48)) != 32) ? 0 : 1) | ((((((i2 + 896) - (896 | i2)) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composer.changed(lazyGridSlotsProvider)) && (384 & i2) != 256) ? 0 : 1);
        int i4 = (((((i2 + 7168) - (7168 | i2)) ^ 3072) <= 2048 || !composer.changed(paddingValues)) && (3072 & i2) != 2048) ? 0 : 1;
        int i5 = (i3 + i4) - (i3 & i4);
        int i6 = ((((57344 & i2) ^ 24576) <= 16384 || !composer.changed(z2)) && (-1) - (((-1) - i2) | ((-1) - 24576)) != 16384) ? 0 : 1;
        int i7 = (-1) - (((-1) - ((i5 + i6) - (i5 & i6))) & ((-1) - ((((((-1) - (((-1) - 458752) | ((-1) - i2))) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 || !composer.changed(z3)) && (-1) - (((-1) - i2) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) != 131072) ? 0 : 1)));
        int i8 = ((((3670016 & i2) ^ 1572864) <= 1048576 || !composer.changed(horizontal)) && (i2 + 1572864) - (i2 | 1572864) != 1048576) ? 0 : 1;
        int i9 = ((i7 + i8) - (i7 & i8)) | ((((((-1) - (((-1) - 29360128) | ((-1) - i2))) ^ 12582912) > 8388608 && composer.changed(vertical)) || (-1) - (((-1) - i2) | ((-1) - 12582912)) == 8388608) ? 1 : 0);
        boolean zChanged = composer.changed(graphicsContext);
        int i10 = (i9 + (zChanged ? 1 : 0)) - (i9 & (zChanged ? 1 : 0));
        Object objRememberedValue = composer.rememberedValue();
        if (i10 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m1156invoke0kLqBqw(lazyLayoutMeasureScope, constraints.m6597unboximpl());
                }

                /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1] */
                /* JADX WARN: Type inference failed for: r13v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1] */
                /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridMeasureResult m1156invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j2) {
                    int i11;
                    int i12;
                    float fMo904getSpacingD9Ej5fM;
                    int iM6591getMaxWidthimpl;
                    final long jIntOffset;
                    int lineIndexOfItem;
                    int firstVisibleItemScrollOffset;
                    ObservableScopeInvalidator.m1192attachToScopeimpl(lazyGridState.m1164getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                    CheckScrollableContainerConstraintsKt.m601checkScrollableContainerConstraintsK40F9xA(j2, z3 ? Orientation.Vertical : Orientation.Horizontal);
                    if (z3) {
                        i11 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(paddingValues.mo969calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i11 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    if (z3) {
                        i12 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(paddingValues.mo970calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i12 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int i13 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(paddingValues.mo971calculateTopPaddingD9Ej5fM());
                    int i14 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(paddingValues.mo968calculateBottomPaddingD9Ej5fM());
                    final int i15 = i13 + i14;
                    final int i16 = i11 + i12;
                    boolean z4 = z3;
                    int i17 = z4 ? i15 : i16;
                    if (z4 && !z2) {
                        i14 = i13;
                    } else if (!z4 || !z2) {
                        i14 = (z4 || z2) ? i12 : i11;
                    }
                    final int i18 = i17 - i14;
                    long jM6610offsetNN6EwU = ConstraintsKt.m6610offsetNN6EwU(j2, -i16, -i15);
                    final LazyGridItemProvider lazyGridItemProviderInvoke = function0.invoke();
                    final LazyGridSpanLayoutProvider spanLayoutProvider = lazyGridItemProviderInvoke.getSpanLayoutProvider();
                    LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                    final LazyGridSlots lazyGridSlotsMo1145invoke0kLqBqw = lazyGridSlotsProvider.mo1145invoke0kLqBqw(lazyLayoutMeasureScope2, j2);
                    int length = lazyGridSlotsMo1145invoke0kLqBqw.getSizes().length;
                    spanLayoutProvider.setSlotsPerLine(length);
                    if (z3) {
                        Arrangement.Vertical vertical2 = vertical;
                        if (vertical2 == null) {
                            throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                        }
                        fMo904getSpacingD9Ej5fM = vertical2.mo904getSpacingD9Ej5fM();
                    } else {
                        Arrangement.Horizontal horizontal2 = horizontal;
                        if (horizontal2 == null) {
                            throw new IllegalArgumentException("null horizontalArrangement when isVertical == false".toString());
                        }
                        fMo904getSpacingD9Ej5fM = horizontal2.mo904getSpacingD9Ej5fM();
                    }
                    final int i19 = lazyLayoutMeasureScope.mo704roundToPx0680j_4(fMo904getSpacingD9Ej5fM);
                    final int itemCount = lazyGridItemProviderInvoke.getItemCount();
                    if (z3) {
                        iM6591getMaxWidthimpl = Constraints.m6590getMaxHeightimpl(j2) - i15;
                    } else {
                        iM6591getMaxWidthimpl = Constraints.m6591getMaxWidthimpl(j2) - i16;
                    }
                    if (!z2 || iM6591getMaxWidthimpl > 0) {
                        jIntOffset = IntOffsetKt.IntOffset(i11, i13);
                    } else {
                        boolean z5 = z3;
                        if (!z5) {
                            i11 += iM6591getMaxWidthimpl;
                        }
                        if (z5) {
                            i13 += iM6591getMaxWidthimpl;
                        }
                        jIntOffset = IntOffsetKt.IntOffset(i11, i13);
                    }
                    final LazyGridState lazyGridState2 = lazyGridState;
                    final boolean z6 = z3;
                    final boolean z7 = z2;
                    final int i20 = i14;
                    final ?? r13 = new LazyGridMeasuredItemProvider(lazyGridItemProviderInvoke, lazyLayoutMeasureScope, i19, lazyGridState2, z6, z7, i20, i18, jIntOffset) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
                        final /* synthetic */ int $afterContentPadding;
                        final /* synthetic */ int $beforeContentPadding;
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ boolean $reverseLayout;
                        final /* synthetic */ LazyGridState $state;
                        final /* synthetic */ LazyLayoutMeasureScope $this_null;
                        final /* synthetic */ long $visualItemOffset;

                        {
                            this.$this_null = lazyLayoutMeasureScope;
                            this.$state = lazyGridState2;
                            this.$isVertical = z6;
                            this.$reverseLayout = z7;
                            this.$beforeContentPadding = i20;
                            this.$afterContentPadding = i18;
                            this.$visualItemOffset = jIntOffset;
                        }

                        @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
                        /* JADX INFO: renamed from: createItem-O3s9Psw, reason: not valid java name */
                        public LazyGridMeasuredItem mo1157createItemO3s9Psw(int i21, Object obj, Object obj2, int i22, int i23, List<? extends Placeable> list, long j3, int i24, int i25) {
                            return new LazyGridMeasuredItem(i21, obj, this.$isVertical, i22, i23, this.$reverseLayout, this.$this_null.getLayoutDirection(), this.$beforeContentPadding, this.$afterContentPadding, list, this.$visualItemOffset, obj2, this.$state.getItemAnimator$foundation_release(), j3, i24, i25, null);
                        }
                    };
                    final boolean z8 = z3;
                    final ?? r10 = new LazyGridMeasuredLineProvider(z8, lazyGridSlotsMo1145invoke0kLqBqw, itemCount, i19, r13, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ LazyGridSlots $resolvedSlots;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(z8, lazyGridSlotsMo1145invoke0kLqBqw, itemCount, i19, r13, spanLayoutProvider);
                            this.$isVertical = z8;
                            this.$resolvedSlots = lazyGridSlotsMo1145invoke0kLqBqw;
                        }

                        @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
                        public LazyGridMeasuredLine createLine(int i21, LazyGridMeasuredItem[] lazyGridMeasuredItemArr, List<GridItemSpan> list, int i22) {
                            return new LazyGridMeasuredLine(i21, lazyGridMeasuredItemArr, this.$resolvedSlots, list, this.$isVertical, i22);
                        }
                    };
                    Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>> function1 = new Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$prefetchInfoRetriever$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ ArrayList<Pair<? extends Integer, ? extends Constraints>> invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        public final ArrayList<Pair<Integer, Constraints>> invoke(int i21) {
                            LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = spanLayoutProvider.getLineConfiguration(i21);
                            int firstItemIndex = lineConfiguration.getFirstItemIndex();
                            ArrayList<Pair<Integer, Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
                            List<GridItemSpan> spans = lineConfiguration.getSpans();
                            LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1 = r10;
                            int size = spans.size();
                            int i22 = 0;
                            for (int i23 = 0; i23 < size; i23++) {
                                int iM1141getCurrentLineSpanimpl = GridItemSpan.m1141getCurrentLineSpanimpl(spans.get(i23).m1144unboximpl());
                                arrayList.add(TuplesKt.to(Integer.valueOf(firstItemIndex), Constraints.m6579boximpl(lazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1.m1163childConstraintsJhjzzOo$foundation_release(i22, iM1141getCurrentLineSpanimpl))));
                                firstItemIndex++;
                                i22 += iM1141getCurrentLineSpanimpl;
                            }
                            return arrayList;
                        }
                    };
                    Snapshot.Companion companion = Snapshot.Companion;
                    LazyGridState lazyGridState3 = lazyGridState;
                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        int iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyGridState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProviderInvoke, lazyGridState3.getFirstVisibleItemIndex());
                        if (iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release < itemCount || itemCount <= 0) {
                            lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release);
                            firstVisibleItemScrollOffset = lazyGridState3.getFirstVisibleItemScrollOffset();
                        } else {
                            lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(itemCount - 1);
                            firstVisibleItemScrollOffset = 0;
                        }
                        Unit unit = Unit.INSTANCE;
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        LazyGridMeasureResult lazyGridMeasureResultM1159measureLazyGridOZKpZRA = LazyGridMeasureKt.m1159measureLazyGridOZKpZRA(itemCount, (LazyGridMeasuredLineProvider) r10, (LazyGridMeasuredItemProvider) r13, iM6591getMaxWidthimpl, i14, i18, i19, lineIndexOfItem, firstVisibleItemScrollOffset, lazyGridState.getScrollToBeConsumed$foundation_release(), jM6610offsetNN6EwU, z3, vertical, horizontal, z2, lazyLayoutMeasureScope2, lazyGridState.getItemAnimator$foundation_release(), length, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyGridItemProviderInvoke, lazyGridState.getPinnedItems$foundation_release(), lazyGridState.getBeyondBoundsInfo$foundation_release()), coroutineScope, lazyGridState.m1165getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, function1, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measureResult$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function12) {
                                return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function12);
                            }

                            public final MeasureResult invoke(int i21, int i22, Function1<? super Placeable.PlacementScope, Unit> function12) {
                                return lazyLayoutMeasureScope.layout(ConstraintsKt.m6608constrainWidthK40F9xA(j2, i21 + i16), ConstraintsKt.m6607constrainHeightK40F9xA(j2, i22 + i15), MapsKt.emptyMap(), function12);
                            }
                        });
                        LazyGridState.applyMeasureResult$foundation_release$default(lazyGridState, lazyGridMeasureResultM1159measureLazyGridOZKpZRA, false, 2, null);
                        return lazyGridMeasureResultM1159measureLazyGridOZKpZRA;
                    } catch (Throwable th) {
                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2 = (Function2) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return function2;
    }
}
