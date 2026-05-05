package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.res.ImageVectorCache;
import androidx.compose.ui.res.ResourceIdCache;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

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
/* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d̉=!4i\bDZc|\u0004G\u00078\u000bDB\u0007\"2\u0012\u007f\u0007|jA0JeP.hS2\u000fq}<$q$yCAU\"}8\tWNmgvJp\u000bK\u000f\f\u0016\u0001j:I]ތe\u0012%2JģG3coE9vt>\u0005&2*8\b\u0004\tɝ2H\u001e\u0003\u0003CQ\u0011*VN\bRR;e5\u001e \u001fV /8\rv\\Q`wm<?#1\u0002pjϮc0\u0003jSEù+\r\u0005\u007f69NVM\u0015Ss3\u000b`|W\u0003m\u0014\u0004\u0005\u0001D5Nas\u0006=\t\u0004\"9CO;a#,j*ib\"&YO*Lח\u0012(\u0006!\u0014 J+&\u0006UW^1(\u000b \u000eax9TĖT\u0002lj \u0010oا/+\u00105;9If\u007f`ޅ\u001dT?ަ\u001d\u000f$$\u000fpApb\u0011x\u001b+V\bQ_Un<˓R\u0010aƝ\u0006\u0006vg\u0010,$HU\u0006G\u0002!0'%ebg\"wǾ\u0004ҩHm~ݓxjYq`J`@|\u001fO0\u0019\u000ejD\u0013\u000f\u001aO\u000b\u001d\u0003ҒOɟX\u0011\u000e\n\u0019+j\u0004T#+\u001d\\Q\t\u0002x[u\u001051v7\b}\u001a\r.ޫ`ۋ9Wk߄yT|$M>\u0003\u001afwZY\u001c\\l(PDviݻ{\u0002L\u0088$\u00158R\u007f\u001eTA?-t\u001bX\u0005.Bo\u00127^˖l\u0016\u0007ԞK&\t\u007f2v\u0590\u0005yˇtwu\u001ea,+`xΕۚQ"}, d2 = {"\u001anR._\nH\\\u001a\u0003|n9x\u00183o\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xI\u000169Xy\u001d>ms8UNEy8-\u0019rj \u0011a(UL", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\n^! Hs\u0010L\u0004!D]\b)\r", "5dc\u0019b*:Zv\t\u0004_0~\u0019<a\u000f,\u0006I", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006a2?j\u0002\u001f3j\u001d.+MCv>,\u0019weC\u0010J6Lr.\u001d", "\u001anR._\nH\\(~\u000em", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u0019b*:Zv\t\u0004m,\u0010\u0018", "\u001anR._\u0010FO\u001b~k^*\f\u0013<C{&~@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000e\u0017%\u0011S\u00168x%&Y{/Azs*KF;A", "5dc\u0019b*:Z|\u0007v`,m\t-t\n5Y<~\u001a\u0017", "\u001anR._\u0013BT\u0019|\u000f\\3|rAn\u007f5", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "5dc\u0019b*:Z\u007f\u0003{^*\u0011\u00076ei:\u0005@\u000eU\u0013Px\u0018Kr49c\u0007.", "u(E", "5dc\u0019b*:Z\u007f\u0003{^*\u0011\u00076ei:\u0005@\u000e", "\u001anR._\u0019>a#\u000f\b\\,`\b\ra}+{", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000e\u0017%\u0011\\\u000eJ\u00015BW}\u00046K\u0012,PC\u0011", "5dc\u0019b*:Z\u0006~\th<\n\u0007/I~\u0006w>\u0004\u0017", "\u001anR._\u001a:d\u0019}hm(\f\t\u001ce\u0002,\nO\u000e+\u0001Yx\u000eI", "\u001a`]1e6BR,H\tZ=|\b=t{7{\nn\u0013(Gn{Kr45F}\";{%;a-Mt4+j", "5dc\u0019b*:Z\u0007z\f^+j\u0018+t\u007f\u0015{B\u0005%&T\u0004wN\u007f%B", "\u001anR._\u001dBS+", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5dc\u0019b*:Z\n\u0003zp", "\u001eq^C\\+>/\"}\bh0{f9m\u000b2\nD\u0010\u001b!PV\u0018:r,C", "", "=v]2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laK\\", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~5\u0007\u001fDw\u001a-+MCv>,\u0015Ye9\u00199\u0013T\u00016NPWuacz\u0007\u0015\"c\f]/\u0017\u000eg\u000b\u0005~M5.\f6RN\u0011O|\u0015\u0015\u001b?noU \u000eQ\u0002 \u007fO)2Sih\tKIE,\bn\u0014j'j:Gyw5\n", "<n;<V(E>&\t\fb+|\b\u0010o\r", "", "<`\\2", "", "=ac.\\5\"[\u0015\u0001zO,z\u00189r]$yC\u0001", "1n]AX?M", "1n]3\\.N`\u0015\u000e~h5", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001k 7\\CDz}+\u0015v+\u0017\u0011l-Rx7TH]0f[H$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buV\u0012Dw\u0005\u0014\u0016W\u0013txM`\u001eG\u0007jY\u0005\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;&\u001bv\u001a\u0012\u0012wU\u0011cRwvqTvv6'>C", "=ac.\\5+S'\t\u000bk*|l.C{&~@", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001fJ7\u00148UNEy4g\"xjH\u000bk,\u0018T1OWX:\\_H!WxV\u0017M8\u0017\tXTmlN?*\u0012:IKKlJ\u0019\u0016\u001c~WpP` Tw\u0015Y@\u0007dD\\_O", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidCompositionLocals_androidKt {
    private static final ProvidableCompositionLocal<Configuration> LocalConfiguration = CompositionLocalKt.compositionLocalOf$default(null, new Function0<Configuration>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalConfiguration$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<Context> LocalContext = CompositionLocalKt.staticCompositionLocalOf(new Function0<Context>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalContext$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalContext");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal<ImageVectorCache> LocalImageVectorCache = CompositionLocalKt.staticCompositionLocalOf(new Function0<ImageVectorCache>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalImageVectorCache$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ImageVectorCache invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal<ResourceIdCache> LocalResourceIdCache = CompositionLocalKt.staticCompositionLocalOf(new Function0<ResourceIdCache>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalResourceIdCache$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ResourceIdCache invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalResourceIdCache");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal<SavedStateRegistryOwner> LocalSavedStateRegistryOwner = CompositionLocalKt.staticCompositionLocalOf(new Function0<SavedStateRegistryOwner>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalSavedStateRegistryOwner$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final SavedStateRegistryOwner invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalSavedStateRegistryOwner");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal<View> LocalView = CompositionLocalKt.staticCompositionLocalOf(new Function0<View>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalView$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalView");
            throw new KotlinNothingValueException();
        }
    });

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4 */
    /* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(Function2<? super Composer, ? super Integer, Unit> function2, int i2) {
            super(2);
            function2 = function2;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Throwable {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) throws Throwable {
            AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(androidComposeView, function2, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))));
        }
    }

    @Deprecated(message = "\u0010U\u0012:u4)f\u0018S1\u0001U\u0018EQhQU9\u001av [\u0004K;m]\u00024u{Q$NV^z:X7rC \u0016M\b&jWDiV\u0002\u001e\u0015M\u0019G4y@\u0007@\u000f~D,Z\u0011\u0001\u001d2\t~S\u0011F\u007f\u000f", replaceWith = @ReplaceWith(expression = "androidx.lifecycle.compose.LocalLifecycleOwner", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getLocalLifecycleOwner$annotations() {
    }

    public static final ProvidableCompositionLocal<Configuration> getLocalConfiguration() {
        return LocalConfiguration;
    }

    public static final ProvidableCompositionLocal<Context> getLocalContext() {
        return LocalContext;
    }

    public static final ProvidableCompositionLocal<ImageVectorCache> getLocalImageVectorCache() {
        return LocalImageVectorCache;
    }

    public static final ProvidableCompositionLocal<ResourceIdCache> getLocalResourceIdCache() {
        return LocalResourceIdCache;
    }

    public static final ProvidableCompositionLocal<LifecycleOwner> getLocalLifecycleOwner() {
        return LocalLifecycleOwnerKt.getLocalLifecycleOwner();
    }

    public static final ProvidableCompositionLocal<SavedStateRegistryOwner> getLocalSavedStateRegistryOwner() {
        return LocalSavedStateRegistryOwner;
    }

    public static final ProvidableCompositionLocal<View> getLocalView() {
        return LocalView;
    }

    public static final void ProvideAndroidCompositionLocals(AndroidComposeView androidComposeView, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2) throws Throwable {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1396852028);
        ComposerKt.sourceInformation(composerStartRestartGroup, Ig.wd("\u0018OGHR$9:\u0014BkE(\u001dtTu\"v\u0010w5W\\z\u00131:\u0016\u00199i\u0007[\u001a5Oi|iu}KD76;t\u00168l@BZ\u0011\u0006\u0005z\u0013\u001b\nn\u00197z$k\u001f\u0012\"N.|Q,\u001f\n^8\u0014Q'iB\"2/Gv!Zpa@hpAnK<{\u001c\u00154\t\u0006ruGI\u001a3sUqa\u001ev^\u0017|Q\u001f\u0001`E$f;\u001b\u0007$\u0003X)\u001cF> D?$\u000b\u0001\u0004\tZ=c\n/A*C\u001a\u0019T\u0005=y\u0011\u000bXLg0U\u0019\u001c0d\u0002wny(,\u0014\u000f\u0015\u001b+;B\u0002H%u\u001bUC\u001e;9B+\u001bX1\rni+:MfIs\u0014^3\u0012bs", (short) (C1499aX.Xd() ^ (-29504))));
        if ((i2 + 6) - (6 | i2) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(androidComposeView) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((i2 + 48) - (48 | i2) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1396852028, i3, -1, EO.Od("A{UET\u00145ZcVz`\u0013\u0006\u0018q_+HW]\u0003_xN5[0lB\u000b/H^k$+vegbu8##7\"n\u0003\u001a\b\"\u0016~\u0014TLf\\[y^DQ\"Z\u000eN-\u0012\u0005`D\u0018c*#rR2xh;\u0017~\u0016N\\\u001c*xkl\r\u000bj.P-oB", (short) (C1580rY.Xd() ^ (-21022))));
            }
            Context context = androidComposeView.getContext();
            short sXd = (short) (ZN.Xd() ^ 31010);
            int[] iArr = new int["\u001b\u001a}G9@7>24@u\u0006\f8-:6/)\u00072/1/2'1%*(\u0005'\u001a\u0017!'`\u0013\u001f\u0014!\u001d\u0016\u0010X\u0015\u001dJ_\u000f\f\u000e\n\u0012".length()];
            QB qb = new QB("\u001b\u001a}G9@7>24@u\u0006\f8-:6/)\u00072/1/2'1%*(\u0005'\u001a\u0017!'`\u0013\u001f\u0014!\u001d\u0016\u0010X\u0015\u001dJ_\u000f\f\u000e\n\u0012");
            int i6 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i6] = xuXd.fK(sXd + sXd + sXd + i6 + xuXd.CK(iKK));
                i6++;
            }
            String str = new String(iArr, 0, i6);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1970600807, str);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                short sXd2 = (short) (C1633zX.Xd() ^ (-28040));
                short sXd3 = (short) (C1633zX.Xd() ^ (-27493));
                int[] iArr2 = new int["\u0017%\u001c+)$ j!..5'18r\t66=/C@".length()];
                QB qb2 = new QB("\u0017%\u001c+)$ j!..5'18r\t66=/C@");
                int i7 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i7] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i7)) - sXd3);
                    i7++;
                }
                Object[] objArr = new Object[0];
                Method method = Class.forName(new String(iArr2, 0, i7)).getMethod(C1561oA.od(".+9\u0016(5051!\"/", (short) (FB.Xd() ^ 9463)), new Class[0]);
                try {
                    method.setAccessible(true);
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Configuration(((Resources) method.invoke(context, objArr)).getConfiguration()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1970596729, str);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function1) new Function1<Configuration, Unit>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                        invoke2(configuration);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Configuration configuration) {
                        mutableState.setValue(new Configuration(configuration));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            androidComposeView.setConfigurationChangeObserver((Function1) objRememberedValue2);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1970594807, str);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new AndroidUriHandler(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            AndroidUriHandler androidUriHandler = (AndroidUriHandler) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            AndroidComposeView.ViewTreeOwners viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException(Wg.Zd("`\u0012p2~O\\\u007f<peb\tN\u001d\u001b%o7\u0015\u001b\u0015Q\u001bX4z5\u0014p(']!s,\u0001Y.t+k[nDJl/\u0006\u00052e@EZ),\u0001\n\u0016oF\rY+_e\u0003U6\u001bO", (short) (C1633zX.Xd() ^ (-21058)), (short) (C1633zX.Xd() ^ (-11035))));
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1970587064, str);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry(androidComposeView, viewTreeOwners.getSavedStateRegistryOwner());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final DisposableSaveableStateRegistry disposableSaveableStateRegistry = (DisposableSaveableStateRegistry) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1970582925, str);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(disposableSaveableStateRegistry);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final DisposableSaveableStateRegistry disposableSaveableStateRegistry2 = disposableSaveableStateRegistry;
                        return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                disposableSaveableStateRegistry2.dispose();
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composerStartRestartGroup, 6);
            ImageVectorCache imageVectorCacheObtainImageVectorCache = obtainImageVectorCache(context, ProvideAndroidCompositionLocals$lambda$1(mutableState), composerStartRestartGroup, 0);
            ResourceIdCache resourceIdCacheObtainResourceIdCache = obtainResourceIdCache(context, composerStartRestartGroup, 0);
            CompositionLocal<Boolean> localScrollCaptureInProgress = CompositionLocalsKt.getLocalScrollCaptureInProgress();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, C1561oA.Kd("\u0002\u0003z\u00052155:1=3::\u0019=21=\u007f>Hw\u000f@?CAK", (short) (C1607wl.Xd() ^ 20674)));
            Object objConsume = composerStartRestartGroup.consume(localScrollCaptureInProgress);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalConfiguration.provides(ProvideAndroidCompositionLocals$lambda$1(mutableState)), LocalContext.provides(context), LocalLifecycleOwnerKt.getLocalLifecycleOwner().provides(viewTreeOwners.getLifecycleOwner()), LocalSavedStateRegistryOwner.provides(viewTreeOwners.getSavedStateRegistryOwner()), SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(disposableSaveableStateRegistry), LocalView.provides(androidComposeView.getView()), LocalImageVectorCache.provides(imageVectorCacheObtainImageVectorCache), LocalResourceIdCache.provides(resourceIdCacheObtainResourceIdCache), CompositionLocalsKt.getLocalProvidableScrollCaptureInProgress().provides(Boolean.valueOf(((Boolean) objConsume).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release()))}, ComposableLambdaKt.rememberComposableLambda(1471621628, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals.3
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                final /* synthetic */ AndroidUriHandler $uriHandler;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(AndroidUriHandler androidUriHandler2, Function2<? super Composer, ? super Integer, Unit> function22) {
                    super(2);
                    androidUriHandler = androidUriHandler2;
                    function2 = function22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    ComposerKt.sourceInformation(composer2, "C131@4821L135:AndroidCompositionLocals.android.kt#itgzvw");
                    if ((-1) - (((-1) - i8) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1471621628, i8, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:131)");
                        }
                        CompositionLocalsKt.ProvideCommonCompositionLocals(androidComposeView, androidUriHandler, function2, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - ProvidedValue.$stable) & ((-1) - 48)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals.4
                final /* synthetic */ int $$changed;
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass4(Function2<? super Composer, ? super Integer, Unit> function22, int i22) {
                    super(2);
                    function2 = function22;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Throwable {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) throws Throwable {
                    AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(androidComposeView, function2, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))));
                }
            });
        }
    }

    private static final Configuration ProvideAndroidCompositionLocals$lambda$1(MutableState<Configuration> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3 */
    /* JADX INFO: compiled from: AndroidCompositionLocals.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\ntK֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq>"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ AndroidUriHandler $uriHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(AndroidUriHandler androidUriHandler2, Function2<? super Composer, ? super Integer, Unit> function22) {
            super(2);
            androidUriHandler = androidUriHandler2;
            function2 = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
            invoke(composer2, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer2, int i8) {
            ComposerKt.sourceInformation(composer2, "C131@4821L135:AndroidCompositionLocals.android.kt#itgzvw");
            if ((-1) - (((-1) - i8) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1471621628, i8, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:131)");
                }
                CompositionLocalsKt.ProvideCommonCompositionLocals(androidComposeView, androidUriHandler, function2, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer2.skipToGroupEnd();
        }
    }

    private static final ResourceIdCache obtainResourceIdCache(final Context context, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1348507246, "C(obtainResourceIdCache)142@5083L30,143@5134L398,158@5571L189,158@5537L223:AndroidCompositionLocals.android.kt#itgzvw");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1348507246, i2, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:141)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1144662288, "CC(remember):AndroidCompositionLocals.android.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new ResourceIdCache();
            composer.updateRememberedValue(objRememberedValue);
        }
        final ResourceIdCache resourceIdCache = (ResourceIdCache) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 1144664288, "CC(remember):AndroidCompositionLocals.android.kt#9igjgp");
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new ComponentCallbacks2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                    resourceIdCache.clear();
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                    resourceIdCache.clear();
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i3) {
                    resourceIdCache.clear();
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        final AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 = (AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1) objRememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 1144678063, "CC(remember):AndroidCompositionLocals.android.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(context);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) throws Throwable {
                    Context context2 = context;
                    Class<?> cls = Class.forName(C1561oA.Yd("jxo~|ws>t\u0002\u0002\tz\u0005\fF\\\n\n\u0011\u0003\u0017\u0014", (short) (Od.Xd() ^ (-28125))));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr = new Object[0];
                    short sXd = (short) (Od.Xd() ^ (-30906));
                    short sXd2 = (short) (Od.Xd() ^ (-29039));
                    int[] iArr = new int["'&6\u00044520+*>4;;\u0011>>E7KH".length()];
                    QB qb = new QB("'&6\u00044520+*>4;;\u0011>>E7KH");
                    int i3 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
                        i3++;
                    }
                    Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
                    try {
                        method.setAccessible(true);
                        Context context3 = (Context) method.invoke(context2, objArr);
                        AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$12 = androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1;
                        Class<?> cls2 = Class.forName(Jg.Wd("R d;~9\u0003\u0015\u0011]*z0{NRL;\u0007V\u000ea,", (short) (C1499aX.Xd() ^ (-18111)), (short) (C1499aX.Xd() ^ (-1171))));
                        Class<?>[] clsArr2 = {Class.forName(ZO.xd(",\u0002X$S\b\u00160\u0011^#p\u0018JR% \u0014\u0019\u0003\u0015iN'J8\u0012\u0007\\\u0011M\u0012\u00155", (short) (C1499aX.Xd() ^ (-14752)), (short) (C1499aX.Xd() ^ (-31355))))};
                        Object[] objArr2 = {androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$12};
                        short sXd3 = (short) (C1580rY.Xd() ^ (-24987));
                        short sXd4 = (short) (C1580rY.Xd() ^ (-5659));
                        int[] iArr2 = new int["\u0011+\u0014r5bdRq&7r\u0018\u001eE\u001ek-\r%b\u0002\u00143De".length()];
                        QB qb2 = new QB("\u0011+\u0014r5bdRq&7r\u0018\u001eE\u001ek-\r%b\u0002\u00143De");
                        int i4 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i4] = xuXd2.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i4 * sXd4))) + xuXd2.CK(iKK2));
                            i4++;
                        }
                        Method method2 = cls2.getMethod(new String(iArr2, 0, i4), clsArr2);
                        try {
                            method2.setAccessible(true);
                            method2.invoke(context3, objArr2);
                            final Context context4 = context;
                            final AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$13 = androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1;
                            return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainResourceIdCache$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() throws Throwable {
                                    Context context5 = context4;
                                    Object[] objArr3 = new Object[0];
                                    Method method3 = Class.forName(Wg.vd("\u001f+ -)\"\u001cd)427'/4lp\u001c\u001a\u001f\u000f!\u001c", (short) (FB.Xd() ^ 859))).getMethod(Qg.kd("MJX$RQLHA>PDIG\u001bFDI9KF", (short) (C1499aX.Xd() ^ (-3745)), (short) (C1499aX.Xd() ^ (-18239))), new Class[0]);
                                    try {
                                        method3.setAccessible(true);
                                        Context context6 = (Context) method3.invoke(context5, objArr3);
                                        Object[] objArr4 = {androidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$13};
                                        Method method4 = Class.forName(hg.Vd("IUJWSLF\u000fCNLQAIN\u0007\u001bFDI9KF", (short) (Od.Xd() ^ (-16847)), (short) (Od.Xd() ^ (-9366)))).getMethod(C1561oA.yd("jdi]`cnpR`2_^bbbjt{Kjvwn^ajs", (short) (C1499aX.Xd() ^ (-700))), Class.forName(C1561oA.ud("\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u000b\u0016\u0014\u0019\t\u0011\u0016Nb\u000e\u000b\r\u000b\t~\u0007\fYv\u0001\u007ftrsz\u0002", (short) (FB.Xd() ^ 19380))));
                                        try {
                                            method4.setAccessible(true);
                                            method4.invoke(context6, objArr4);
                                        } catch (InvocationTargetException e2) {
                                            throw e2.getCause();
                                        }
                                    } catch (InvocationTargetException e3) {
                                        throw e3.getCause();
                                    }
                                }
                            };
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.DisposableEffect(resourceIdCache, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return resourceIdCache;
    }

    private static final ImageVectorCache obtainImageVectorCache(final Context context, Configuration configuration, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -485908294, "C(obtainImageVectorCache)P(1)173@5952L31,174@6030L88,177@6139L557,194@6736L189,194@6701L224:AndroidCompositionLocals.android.kt#itgzvw");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-485908294, i2, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:172)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 674256202, "CC(remember):AndroidCompositionLocals.android.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new ImageVectorCache();
            composer.updateRememberedValue(objRememberedValue);
        }
        final ImageVectorCache imageVectorCache = (ImageVectorCache) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 674258755, "CC(remember):AndroidCompositionLocals.android.kt#9igjgp");
        Object objRememberedValue2 = composer.rememberedValue();
        Object obj = objRememberedValue2;
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            composer.updateRememberedValue(configuration2);
            obj = configuration2;
        }
        final Configuration configuration3 = (Configuration) obj;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 674262712, "CC(remember):AndroidCompositionLocals.android.kt#9igjgp");
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = new ComponentCallbacks2() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1
                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration4) {
                    imageVectorCache.prune(configuration3.updateFrom(configuration4));
                    configuration3.setTo(configuration4);
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                    imageVectorCache.clear();
                }

                @Override // android.content.ComponentCallbacks2
                public void onTrimMemory(int i3) {
                    imageVectorCache.clear();
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        final AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 = (AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1) objRememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 674281448, "CC(remember):AndroidCompositionLocals.android.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(context);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue4 == Composer.Companion.getEmpty()) {
            objRememberedValue4 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) throws Throwable {
                    Context context2 = context;
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(C1593ug.zd("\u0007\u0015\f\u001b\u0019\u0014\u0010Z\u0011\u001e\u001e%\u0017!(bx&&-\u001f30", (short) (FB.Xd() ^ 24022), (short) (FB.Xd() ^ 10490))).getMethod(C1561oA.od("FCQ\u001dKJEA:7I=B@\u0014?=B2D?", (short) (FB.Xd() ^ 4578)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        Context context3 = (Context) method.invoke(context2, objArr);
                        AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$12 = androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1;
                        short sXd = (short) (C1580rY.Xd() ^ (-9988));
                        int[] iArr = new int["iwn}{vr=s\u0001\u0001\by\u0004\u000bE[\t\t\u0010\u0002\u0016\u0013".length()];
                        QB qb = new QB("iwn}{vr=s\u0001\u0001\by\u0004\u000bE[\t\t\u0010\u0002\u0016\u0013");
                        int i3 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i3));
                            i3++;
                        }
                        Class<?> cls = Class.forName(new String(iArr, 0, i3));
                        Class<?>[] clsArr = {Class.forName(Wg.Zd("J\u0010rx\"t\u001c.@4\u0010|9[-\u001fAE0{v|\u0010!\u0014\u001bE)5c/W\u001c\r", (short) (OY.Xd() ^ 15558), (short) (OY.Xd() ^ 3775)))};
                        Object[] objArr2 = {androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$12};
                        short sXd2 = (short) (C1633zX.Xd() ^ (-25997));
                        int[] iArr2 = new int[".\"%(35'5\u000743777/9@\u0010/;<336?H".length()];
                        QB qb2 = new QB(".\"%(35'5\u000743777/9@\u0010/;<336?H");
                        int i4 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i4));
                            i4++;
                        }
                        Method method2 = cls.getMethod(new String(iArr2, 0, i4), clsArr);
                        try {
                            method2.setAccessible(true);
                            method2.invoke(context3, objArr2);
                            final Context context4 = context;
                            final AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$13 = androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1;
                            return new DisposableEffectResult() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() throws Throwable {
                                    Context context5 = context4;
                                    Class<?> cls2 = Class.forName(ZO.xd("\u0001m1*\u00049-H!I.w\u001d0O\f\u001f~\"m\u0007G%", (short) (Od.Xd() ^ (-13558)), (short) (Od.Xd() ^ (-1540))));
                                    Class<?>[] clsArr2 = new Class[0];
                                    Object[] objArr3 = new Object[0];
                                    short sXd3 = (short) (FB.Xd() ^ 4960);
                                    short sXd4 = (short) (FB.Xd() ^ 18674);
                                    int[] iArr3 = new int["Lh\rr\u0007\\K!}\fCs:;K\u0012e])q}".length()];
                                    QB qb3 = new QB("Lh\rr\u0007\\K!}\fCs:;K\u0012e])q}");
                                    int i5 = 0;
                                    while (qb3.YK()) {
                                        int iKK3 = qb3.KK();
                                        Xu xuXd3 = Xu.Xd(iKK3);
                                        iArr3[i5] = xuXd3.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i5 * sXd4))) + xuXd3.CK(iKK3));
                                        i5++;
                                    }
                                    Method method3 = cls2.getMethod(new String(iArr3, 0, i5), clsArr2);
                                    try {
                                        method3.setAccessible(true);
                                        Context context6 = (Context) method3.invoke(context5, objArr3);
                                        AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$14 = androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$13;
                                        short sXd5 = (short) (C1633zX.Xd() ^ (-30253));
                                        int[] iArr4 = new int["\u001e]\u00048r?\u00144\nx{]\u0003\f\u0018.u*_,]\u001bj".length()];
                                        QB qb4 = new QB("\u001e]\u00048r?\u00144\nx{]\u0003\f\u0018.u*_,]\u001bj");
                                        int i6 = 0;
                                        while (qb4.YK()) {
                                            int iKK4 = qb4.KK();
                                            Xu xuXd4 = Xu.Xd(iKK4);
                                            iArr4[i6] = xuXd4.fK(xuXd4.CK(iKK4) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ (sXd5 + i6)));
                                            i6++;
                                        }
                                        Object[] objArr4 = {androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$14};
                                        Method method4 = Class.forName(new String(iArr4, 0, i6)).getMethod(C1561oA.Qd("mehZ[\\eeUa1\\Y[YWMUZ(EONCABIP", (short) (C1607wl.Xd() ^ 9626)), Class.forName(EO.Od("^B\bs:Y~iVDG%\u0002\u0003\u001boRjB\u000bA\n!(5N\f`ty#@b\u0006", (short) (C1633zX.Xd() ^ (-32703)))));
                                        try {
                                            method4.setAccessible(true);
                                            method4.invoke(context6, objArr4);
                                        } catch (InvocationTargetException e2) {
                                            throw e2.getCause();
                                        }
                                    } catch (InvocationTargetException e3) {
                                        throw e3.getCause();
                                    }
                                }
                            };
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.DisposableEffect(imageVectorCache, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return imageVectorCache;
    }

    public static final Void noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
