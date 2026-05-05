package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!,m\bDJc|\u0004O\u000b8\u000b4H\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000fq|<$q$yّSu(\b:\t}Y\u0018k|Vr\u000bq\u001c6\u001a\u0007xDI\u0004\b$\u0011Ǻ1ԏņC5S\u007fKJx~D\u001782PK\"\u0005/-pM0\u0003\tŏc\f@/\u0017\u0084<ň\u0011M\r܅2\u0012L \u0019\u001e\u000bf%ȧJǰa:7݊#uPO?_^~$θ\u0019ù+\r~ѭ>7N:M\u0015SUYޚ%ÜC\u0003Gм]\u0011v+?+wu.̯+ÿ\u0018\u00153˽-i\u0001+t\u0005\u007fbbʯ}յgKXʫH\u0004\t\u0002%<2\u0010\\ά\u001bͶ1\u001anڜ.?\u0003yk@~\u00045ېRѐe6\u001fӛ ?9A3f\u007fc\u0012ύPѼ\u007f\u0005\u0015̔C\r|*sT<bkÔ'ɐU1Y̵׃HS\u0012\\Cщ \u001fa͌.\u0018"}, d2 = {"\u0012dR2_\u0014B\\)\rdg,", "", "\u0012dR2_,KO(\u0003\u0005g\u0019x\u0018/", "\u0013mS!X5LW#\b", "", "\u0015qPC\\;R3\u0015\f\na", "\u0017mR5X:)S&fzm,\n", "\u0017mU9X*MW#\b", "\u001e0", "\u001e1", "\u001ekPAY6K[y\u0006~g.j\u0007<o\u0007/\\M\u0005\u0015&Ky\u0017", "!sP?g\u001b>\\'\u0003\u0005g", "@d\\2`)>`\u000b\u0003\u0004]6\u000fl8s\u007f7\n\u001e\u000b  Gm\u001d@\u0001.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3UT1PUN*kV|Fi", "Eh]1b>\"\\'~\nl", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q7LPEo3\u0010\u0019q`C\u0019G5\\v6U\"", "AhS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpGtg+N\u0005|", "@d\\2`)>`\u000b\u0003\u0004]6\u000fl8s\u007f7\n\u001e\u000b  Gm\u001d@\u0001.|Jj\"HQ\u0018\u0012", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\nVBHu8\u001d\u0007lj8\u0011u\u0010W\u0005'VZ$\u0010CN{<!\u001c^\rat\u000b\u000faL.|D\u0001,\u00185X\u0006ChJi \u0016@t~Bce+={qJ(uP]^\r\u0011?Oj5n\u001a_fl>\u0004(\u001d|)*2Y.\u0018\u000bS\u0010\u0001P\u0007qnNbc82MmZ4C|_C{\u0005)T\u0005w\u0010A\\~4J", "7lT\u001bX:MS\u0018lxk6\u0004\u0010", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class WindowInsetsConnection_androidKt {
    private static final double DecelMinusOne;
    private static final double DecelerationRate;
    private static final float EndTension = 1.0f;
    private static final float GravityEarth = 9.80665f;
    private static final float InchesPerMeter = 39.37f;
    private static final float Inflection = 0.35f;
    private static final float P1 = 0.175f;
    private static final float P2 = 0.35000002f;
    private static final float PlatformFlingScrollFriction = ViewConfiguration.getScrollFriction();
    private static final float StartTension = 0.5f;

    public static final Modifier imeNestedScroll(Modifier modifier) {
        if (Build.VERSION.SDK_INT < 30) {
            return modifier;
        }
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$imeNestedScroll$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("imeNestedScroll");
            }
        } : InspectableValueKt.getNoInspectorInfo(), AnonymousClass2.INSTANCE);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$imeNestedScroll$2 */
    /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJc\u0003İY\u0006^\nVB-!r\u001bէ\u000bhp9>E"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pp<W\u0006+OL\u0018\nfZ}G\"\u0012gc2ns\u0001b@1xH62Q*S\nFr\u000f\f_\u001e94XLU\u0014H}\u0015\u0003\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        public static final AnonymousClass2 INSTANCE = ;

        AnonymousClass2() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier modifier, Composer composer, int i2) {
            composer.startReplaceGroup(-369978792);
            ComposerKt.sourceInformation(composer, "C81@3235L9,80@3172L124:WindowInsetsConnection.android.kt#2w3rfo");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-369978792, i2, -1, "androidx.compose.foundation.layout.imeNestedScroll.<anonymous> (WindowInsetsConnection.android.kt:80)");
            }
            Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifier, WindowInsetsConnection_androidKt.m1086rememberWindowInsetsConnectionVRgvIgI(WindowInsetsHolder.Companion.current(composer, 6).getIme(), WindowInsetsSides.Companion.m1109getBottomJoeWqyM(), composer, 48), null, 2, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierNestedScroll$default;
        }
    }

    /* JADX INFO: renamed from: rememberWindowInsetsConnection-VRgvIgI */
    public static final NestedScrollConnection m1086rememberWindowInsetsConnectionVRgvIgI(AndroidWindowInsets androidWindowInsets, int i2, Composer composer, int i3) {
        composer.startReplaceGroup(-1011341039);
        ComposerKt.sourceInformation(composer, "C(rememberWindowInsetsConnection)P(1,0:c#foundation.layout.WindowInsetsSides)112@4564L7,114@4677L7,115@4716L7,116@4745L149,119@4928L70,119@4899L99:WindowInsetsConnection.android.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1011341039, i3, -1, "androidx.compose.foundation.layout.rememberWindowInsetsConnection (WindowInsetsConnection.android.kt:108)");
        }
        if (Build.VERSION.SDK_INT < 30) {
            DoNothingNestedScrollConnection doNothingNestedScrollConnection = DoNothingNestedScrollConnection.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return doNothingNestedScrollConnection;
        }
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localLayoutDirection);
        ComposerKt.sourceInformationMarkerEnd(composer);
        SideCalculator sideCalculatorM1046chooseCalculatorni1skBw = SideCalculator.Companion.m1046chooseCalculatorni1skBw(i2, (LayoutDirection) objConsume);
        ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composer.consume(localView);
        ComposerKt.sourceInformationMarkerEnd(composer);
        View view = (View) objConsume2;
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume3 = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) objConsume3;
        ComposerKt.sourceInformationMarkerStart(composer, 786091504, "CC(remember):WindowInsetsConnection.android.kt#9igjgp");
        int i4 = (-1) - (((-1) - ((((((14 & i3) ^ 6) <= 4 || !composer.changed(androidWindowInsets)) && (-1) - (((-1) - i3) | ((-1) - 6)) != 4) ? 0 : 1) | (composer.changed(view) ? 1 : 0))) & ((-1) - (composer.changed(sideCalculatorM1046chooseCalculatorni1skBw) ? 1 : 0)));
        boolean zChanged = composer.changed(density);
        int i5 = (i4 + (zChanged ? 1 : 0)) - (i4 & (zChanged ? 1 : 0));
        Object objRememberedValue = composer.rememberedValue();
        if (i5 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new WindowInsetsNestedScrollConnection(androidWindowInsets, view, sideCalculatorM1046chooseCalculatorni1skBw, density);
            composer.updateRememberedValue(objRememberedValue);
        }
        final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = (WindowInsetsNestedScrollConnection) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 786097281, "CC(remember):WindowInsetsConnection.android.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(windowInsetsNestedScrollConnection);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection2 = windowInsetsNestedScrollConnection;
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            windowInsetsNestedScrollConnection2.dispose();
                        }
                    };
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.DisposableEffect(windowInsetsNestedScrollConnection, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return windowInsetsNestedScrollConnection;
    }

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        DecelerationRate = dLog;
        DecelMinusOne = dLog - 1.0d;
    }
}
