package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import com.drew.metadata.exif.makernotes.OlympusImageProcessingMakernoteDirectory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.reflect.KProperty0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
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
/* JADX INFO: compiled from: LazyLayoutPager.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яē\u0014D߬)\u001ew\u007fL܀kt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u001dfrˎ8DsQ6ɟ[*%k\u0004é,[:qK;[\u001a\u0006\"\u0017UVʴon`Z\u0013¼\u0017\u0006,xrߚQU\u000f]\u001aƁ:B\u0006?;M\u0006=A`z6\r @Ĳ@ц\r\u00010*PƵ~zYK\u0014۵8@\u0007:Z҈U\u00050\u0012\u000e>6\u0001&ձoNLHt]P/+\u0003oCV'u0\u0005M#F\\'\u0013xyԻ*NʺM\u0015SR3\u000b`[W\u0003mrm\tv)?+wv\b:f\u0004,\u0015YT=a\u0001,t\u0005\u007fg<+9W{K~\u0017X{\t\u0006%<2\u00196+V:E\u001a\u0015\u000f>9zraMh\u0002\rP0\u0001g6%4\u00183YIKj_rS\u0019|I,\t\u001b1;\u0001\u001d5\fu\u001cu-8d\ta@\u007fNףLX\u0010pMs\n\tr\u00040\nV`\u00101\f\u0011\\1;6\nOS%y\u001d`D\u0016\u00135dvp\u0002Rv^Rr$VB\t:zt\u0014\u0013\rh\u007fh.!MJw\u0017\u000f\u0018\"Njʟ@++'^Un\u0002zOc\u0010KSv9in\u001a\r\u0006[ӷ75W\tߧeR|:\u0006;Ѯ\u0004֚ڋFU\u0012\u0002jP:÷Gx9\u0010\u0002TP\u001c\u0013`j Fd0?\u001bt\u0015v\u0006NqO\u001e!\u000bjj ~\u0003V4\u0014y3#\u0017ɹTfv\u0007w~OD\rb(3guE\u001b6UPgb\u001fɠ\u000b~y%ěkLMr\u001d7\u0004j\u0014=&+I`]Kт\u0013\t/I\u00123Kd\u0003gWS8@\u000b~\n\u000fi\u0003Df6\u0001!6n\u0017bUd\u00192v\r\u0001Q2+\u0001\u05fbeF\tt{f\u0019\nVI!\u0004\u0002<|9-\t- =\u0001\u001e%C5ԉC,%\u0019}ӃKC`ԉm\u001f"}, d2 = {"\u001e`V2e", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP)z0-\u0015>", "1n]AX5M>\u0015}yb5~", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "@de2e:>:\u0015\u0013\u0005n;", "", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "4kX;Z\t>V\u0015\u0010~h9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w<?Hm4-\u0015gB@\u000bl.+v*C]R6i(", "CrT?F*K] \u0006Zg(y\u0010/d", "0dh<a+/W\u0019\u0011\u0006h9\fs+g\u007f\u0006\u0006P\n&", "", ">`V2F7:Q\u001d\b|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", ">`V2F0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120M1?\u00014s", ">`V2A,Lb\u0019}h\\9\u0007\u00106C\n1\u0005@~&\u001bQx", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3UT1PUN*kV|Fi", "9dh", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7mS2k", "", "6na6m6Gb\u0015\u0006Ve0~\u00127e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "DdaA\\*:Zt\u0006~`5\u0005\t8t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", "AmP=C6LW(\u0003\u0005g", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+'\u0010_79\u00015K[R6e(", ">`V266Gb\u0019\b\n", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP)i>)\u0015>", ">`V2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u001e`V2esNG\u0006nVP\b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pd6^\u007f&C[R6e\u001c}9\u0016\u0012gW9'\u000f\u0005f/3jS7tn(R\u0001Hr\u0005\u000b)W3txM`\u001eGC\u0016\u007fQ2gBhc\u0004P\u000bL^>n\u001cnfG69#\u0018z\u001b\fdW>\n\n)\u0006YN\u0003ftQ\u001dyKm<wcQO}U\u0006u1/Tzs!6b}tv-\u0012C:Cd\u0013\u0015Q%B^\u0002$(kE1/\f#\u000fHJp\u007fp=!2\u001dk\u0010\u0019lC1bfosQ\u000e\u0003l\u001be>+a\u0001Ea\u0016KI}^\u0016B\fD[\t\u0015\bg+qnK \u001bW|+tN/5\u0006fcM\u0014%-#G]\u000e{s]AU\u001e\u0013v8U|cS\u001eoD\u001fqU{%bk&6\u0006Z4\u001d5K*zgCEv\u0012=\u007f\u0018\t!r|\fw@\u001b0/KY\u0002rdx\u000fp^2(1A\u001c-<1\u0001`>{h~.^f\u000ev\f\u0015\\,6\u000f=HPH,ElK\u0003K^\\\u0019\u00024\u001b9o{\u001aK%xFR8\u000f\u0010\r)\b\u0017&54?(/p\u0019>j\u0016\u0015UE\u0004+$\u007feX\u001aL&8FR\"\te=\u0005Y2J2pS\u0005+LBNQ\u0006]\u0016\u0012\u000bX\u001b<aFuj\u0010a\u001d*@\u001f\u0010\fO\u001ahC%c!\u0004\u0006l\u0018?e\u001b}\u0013xXH\u001eND$v\u0011\u001a\u000edIsg\n*K\u0006\n+#\u0006=m\u0006X:>b\u0001'?vujQwvu\u001dK\u00102\\G\u001d5~w4\u0013gt<\u0003[\u007f\u001b6=:|\u0010*[\u001aK81\u000bxk24-Y2I#\r=v&fN\u0003\u001c\bu\u00170Er\u000eK|&\u00024UN[9$%\u0010.\\ Y7O}+YI[sTb|f\f\"Liq5\u0014\"WK\"B(C!\t[J\u0013f\bne{S ", "@d\\2`)>`\u0004z|^9`\u0018/mj5\u0006Q\u0005\u0016\u0017TV\nDs$1", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP\"gI2{duC\u0017r\u0010]v/2YX=`QrJi", ">`V266N\\(", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn@U\u007f D7\u0001*OCHYC\u001a$h7 \rm;Uz0\u0011Q_4&S\u0003F\u0012!^\u0018W9VeiJ\"}HA(V\u00020\bEw\b\u0010\u001fW:{x\fW Pw$yK2v\u0010:o\u0003EPIl30aF#fIA(\u001d;\u001e,p\u001a/\u001a\u0005Q v\\\u0003u1()\u000463Bwd\u0011\u001bVQEs4)Oz\u000b[0b|6~;\u0004}7Fm\u0014Oo\u0018\b<\u0003\u001d7fO'3\f V&Qm\u0005sB\u00172$r\u0010WcE:\u0017timQ\u001dP>'d3pc\u000b@\u001d[", "2qP470KS\u0017\u000e~h5[\t>e}7\u0006M", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyLayoutPagerKt {
    /* JADX WARN: Removed duplicated region for block: B:114:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:238:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0182  */
    /* JADX INFO: renamed from: Pager-uYRUAWA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1251PageruYRUAWA(final androidx.compose.ui.Modifier r57, final androidx.compose.foundation.pager.PagerState r58, final androidx.compose.foundation.layout.PaddingValues r59, final boolean r60, final androidx.compose.foundation.gestures.Orientation r61, final androidx.compose.foundation.gestures.TargetedFlingBehavior r62, final boolean r63, int r64, float r65, androidx.compose.foundation.pager.PageSize r66, final androidx.compose.ui.input.nestedscroll.NestedScrollConnection r67, final kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> r68, androidx.compose.ui.Alignment.Horizontal r69, androidx.compose.ui.Alignment.Vertical r70, androidx.compose.foundation.gestures.snapping.SnapPosition r71, final kotlin.jvm.functions.Function4<? super androidx.compose.foundation.pager.PagerScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r72, androidx.compose.runtime.Composer r73, final int r74, final int r75, final int r76) {
        /*
            Method dump skipped, instruction units count: 1687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.LazyLayoutPagerKt.m1251PageruYRUAWA(androidx.compose.ui.Modifier, androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.gestures.Orientation, androidx.compose.foundation.gestures.TargetedFlingBehavior, boolean, int, float, androidx.compose.foundation.pager.PageSize, androidx.compose.ui.input.nestedscroll.NestedScrollConnection, kotlin.jvm.functions.Function1, androidx.compose.ui.Alignment$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.snapping.SnapPosition, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final Function0<PagerLazyLayoutItemProvider> rememberPagerItemProviderLambda(final PagerState pagerState, Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Function1<? super Integer, ? extends Object> function1, final Function0<Integer> function0, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1372505274, "C(rememberPagerItemProviderLambda)P(3,1)259@10522L33,260@10576L25,261@10613L677:LazyLayoutPager.kt#g6yjnt");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1372505274, i2, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:258)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function4, composer, (i2 >> 3) & 14);
        final State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function1, composer, (i2 >> 6) & 14);
        ComposerKt.sourceInformationMarkerStart(composer, 1578864961, "CC(remember):LazyLayoutPager.kt#9igjgp");
        int i3 = (-1) - (((-1) - (((((((14 & i2) ^ 6) <= 4 || !composer.changed(pagerState)) && (-1) - (((-1) - i2) | ((-1) - 6)) != 4) ? 0 : 1) | (composer.changed(stateRememberUpdatedState) ? 1 : 0)) | (composer.changed(stateRememberUpdatedState2) ? 1 : 0))) & ((-1) - (((((7168 & i2) ^ 3072) > 2048 && composer.changed(function0)) || (i2 & 3072) == 2048) ? 1 : 0)));
        Object objRememberedValue = composer.rememberedValue();
        if (i3 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            final State stateDerivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new Function0<PagerLayoutIntervalContent>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final PagerLayoutIntervalContent invoke() {
                    return new PagerLayoutIntervalContent(stateRememberUpdatedState.getValue(), stateRememberUpdatedState2.getValue(), function0.invoke().intValue());
                }
            });
            final State stateDerivedStateOf2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new Function0<PagerLazyLayoutItemProvider>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final PagerLazyLayoutItemProvider invoke() {
                    PagerLayoutIntervalContent value = stateDerivedStateOf.getValue();
                    return new PagerLazyLayoutItemProvider(pagerState, value, new NearestRangeKeyIndexMap(pagerState.getNearestRange$foundation_release(), value));
                }
            });
            objRememberedValue = (KProperty0) new PropertyReference0Impl(stateDerivedStateOf2) { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        KProperty0 kProperty0 = (KProperty0) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return kProperty0;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1, reason: invalid class name */
    /* JADX INFO: compiled from: LazyLayoutPager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0010\u0002\t\b\u0016Rq\b\"\"u\f%\u001c##\u007f\u0012\u0019\u0018&\u007f*Z\u001c+\u001b\"\u007f&0$#5+22\t+;-,>:>p~", f = "\u0019-EC\u0015)@5:8\u0013#(%1k(0", i = {}, l = {284}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PagerState $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PagerState pagerState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$state = pagerState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: LazyLayoutPager.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0010\u0002\t\b\u0016Rq\b\"\"u\f%\u001c##\u007f\u0012\u0019\u0018&\u007f*Z\u001c+\u001b\"\u007f&0$#5+22\t+;-,>:>p~r\u0001", f = "\u0019-EC\u0015)@5:8\u0013#(%1k(0", i = {}, l = {285}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class C00381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ PagerState $state;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00381(PointerInputScope pointerInputScope, PagerState pagerState, Continuation<? super C00381> continuation) {
                super(2, continuation);
                this.$$this$pointerInput = pointerInputScope;
                this.$state = pagerState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C00381(this.$$this$pointerInput, this.$state, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C00381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: LazyLayoutPager.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0010\u0002\t\b\u0016Rq\b\"\"u\f%\u001c##\u007f\u0012\u0019\u0018&\u007f*Z\u001c+\u001b\"\u007f&0$#5+22\t+;-,>:>p~r\u0001t\u0003", f = "\u0019-EC\u0015)@5:8\u0013#(%1k(0", i = {0, 1, 1, 1}, l = {OlympusImageProcessingMakernoteDirectory.TagWbGLevel, 291}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aC^7CZ\u000f8='\r\u0018*6\u001c$\u001c", "\u0013jjOe\u001aC^7CZ\u000f8='\r\u0018*6\u001c$\u001c", "SeyT7lGUJ", "dfG\\WdV6H\u001dG8:?+2\u0014++\u0016 "}, s = {"xQ^", "xQ^", "xQ_", "xQ`"})
            static final class C00391 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ PagerState $state;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C00391(PagerState pagerState, Continuation<? super C00391> continuation) {
                    super(2, continuation);
                    this.$state = pagerState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C00391 c00391 = new C00391(this.$state, continuation);
                    c00391.L$0 = obj;
                    return c00391;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((C00391) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0050 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004a -> B:7:0x001e). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        r10 = this;
                        java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r10.label
                        r8 = 2
                        r7 = 0
                        r2 = 1
                        if (r0 == 0) goto L5b
                        if (r0 == r2) goto L72
                        if (r0 != r8) goto L9d
                        java.lang.Object r0 = r10.L$2
                        androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                        java.lang.Object r6 = r10.L$1
                        androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
                        java.lang.Object r5 = r10.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                        kotlin.ResultKt.throwOnFailure(r11)
                    L1e:
                        androidx.compose.ui.input.pointer.PointerEvent r11 = (androidx.compose.ui.input.pointer.PointerEvent) r11
                        java.util.List r4 = r11.getChanges()
                        int r3 = r4.size()
                        r2 = r7
                    L29:
                        if (r2 >= r3) goto L50
                        java.lang.Object r1 = r4.get(r2)
                        androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                        boolean r1 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(r1)
                        if (r1 != 0) goto L4d
                    L37:
                        if (r0 != 0) goto L89
                        androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r1 = r10
                        kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                        r10.L$0 = r5
                        r10.L$1 = r6
                        r10.L$2 = r0
                        r10.label = r8
                        java.lang.Object r11 = r5.awaitPointerEvent(r2, r1)
                        if (r11 != r9) goto L1e
                        return r9
                    L4d:
                        int r2 = r2 + 1
                        goto L29
                    L50:
                        java.util.List r0 = r11.getChanges()
                        java.lang.Object r0 = r0.get(r7)
                        androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                        goto L37
                    L5b:
                        kotlin.ResultKt.throwOnFailure(r11)
                        java.lang.Object r5 = r10.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                        androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r0 = r10
                        kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                        r10.L$0 = r5
                        r10.label = r2
                        java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(r5, r7, r1, r0)
                        if (r11 != r9) goto L79
                        return r9
                    L72:
                        java.lang.Object r5 = r10.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                        kotlin.ResultKt.throwOnFailure(r11)
                    L79:
                        androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                        androidx.compose.foundation.pager.PagerState r2 = r10.$state
                        androidx.compose.ui.geometry.Offset$Companion r0 = androidx.compose.ui.geometry.Offset.Companion
                        long r0 = r0.m3953getZeroF1C5BW0()
                        r2.m1268setUpDownDifferencek4lQ0M$foundation_release(r0)
                        r0 = 0
                        r6 = r11
                        goto L37
                    L89:
                        androidx.compose.foundation.pager.PagerState r4 = r10.$state
                        long r2 = r0.m5385getPositionF1C5BW0()
                        long r0 = r6.m5385getPositionF1C5BW0()
                        long r0 = androidx.compose.ui.geometry.Offset.m3941minusMKHz9U(r2, r0)
                        r4.m1268setUpDownDifferencek4lQ0M$foundation_release(r0)
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L9d:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.LazyLayoutPagerKt.AnonymousClass1.C00381.C00391.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (ForEachGestureKt.awaitEachGesture(this.$$this$pointerInput, new C00391(this.$state, null), this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(new C00381((PointerInputScope) this.L$0, this.$state, null), this) == coroutine_suspended) {
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

    private static final Modifier dragDirectionDetector(Modifier modifier, PagerState pagerState) {
        return modifier.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, pagerState, new AnonymousClass1(pagerState, null)));
    }
}
