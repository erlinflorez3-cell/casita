package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.TabRowDefaults;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.material3.tokens.SecondaryNavigationTabTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$4\u0012\u000e\u0007nj?=LeV.Zݷ2\u000f\u0002{<$a)yCQU\"}(\rWN}gvJ`\fIǬ\u0006,ю\u001b,wT9b\u0018\u000f̓FoM3\u0016\u001eKOxtd\u001cP8(8\b\u001d\u0019\u001aXa@|\u0001CY&*0nrjX\u0013M\u00135*\u0006l'G#תfޮɇLncV=@K,Pl?_^\u0014}\u0013LT5%\u000faLDp=;\u00153r\u001b\u0007\u0001]o\tEqK\u001f\u0001'U-yy]6f\u001b,\u0015YV=cx&j%i`:HqTԣJִˎ,y\u0001\u001e\u001b_L<\u0014K`.[1\u0017\u000e\u00143\u0003\u000bk@~\u001b\u000fH\u0006zoP/%.5[?!f_|S\u0019|>B\n۵\u001dŀъr#ay\u001c}]+b\u001ei1\u007fYeH|#\nA{+\tb0RTGU\u0001G{?0ш$ڛڼ8\"\u074co\nPDu{\u001dbnVwV\u0019^0t.7X\u0010B \u001bߧ\u0007ÐOӹ҉+\u0010ܖ ^\u0017\u007f\u000e\u001b.\\\u0010>'.\u001eX \u0007wue]8,e,\u000eղpā\rã¢]2̳Um cX\u0003\"?Td\u000betL$!hj@\"`O!Uɧzͩā\u000b\u0012\u0558Cu462@'fe]\u0011.ZA+\u0010\u0016 Չ\u000fз֗2#ғm(\r\u000b\u0007ajz@|\u0007[D|\u000f)c\u0007۔4ӧƘT!מ8\u0001;\t\u0005\u0007\u000eQ8aU`\u0005\u0016$\\2eۿ\u0019ߙؐ.<т\u0013\u0003A4\bBSVǬeZU\u0015-Ϸ\u0019(\u000eCh4\u0007Ŷn\u001aލdrXyl\u0017Px5лׁ\bܠ\u0004\u0002oq\u0013G\u0012VaЀűI"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e!2F\b2\u0016m\u0017*]JJy\n", "", "u(E", "!ba<_3:P ~iZ)i\u0013AE~*{.\u0010\u0013$VZ\n;u)>[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc V9HZ zwe,k\u0005,R\n:[?\u0003\u0017\u0005Vk\u001bKa!4X\u0002)95t\u0002-H\u000bl\u001c", "u(5", "\u0014", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "5dc\u0010b5MO\u001d\bzk\n\u0007\u00109r>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc\u0010b5MO\u001d\bzk\n\u0007\u00109r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq2", "1n]AX5M1#\u0006\u0005k", "5dc\u0010b5MS\"\u000eXh3\u0007\u0016ma\t1\u0006O|&\u001bQx\u001c", "5dc\u0010b5MS\"\u000eXh3\u0007\u0016", ">qX:T9R1#\b\nZ0\u0006\t<C\n/\u0006M", "5dc\u001de0FO&\u0013Xh5\f\u00053n\u007f5YJ\b!$", ">qX:T9R1#\b\n^5\ff9l\n5", "5dc\u001de0FO&\u0013Xh5\f\t8t]2\u0003J\u000e", "AdR<a+:`-\\\u0005g;x\r8e\r\u0006\u0006G\u000b$", "5dc X*H\\\u0018z\br\n\u0007\u0012>a\u00041{M^!\u001eQ|", "AdR<a+:`-\\\u0005g;|\u0012>C\n/\u0006M", "5dc X*H\\\u0018z\br\n\u0007\u0012>e\t7YJ\b!$", "\u0017mS6V(M]&", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "6dX4[;", "1n[<e", "\u0017mS6V(M]&FNB!Oz/o", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:b\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001ph\u001d2", "\u001eqX:T9R7\"}~\\(\f\u0013<", "EhSA[", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "\u001eqX:T9R7\"}~\\(\f\u0013<-Krb\"\u0014\u001av", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:^\u0005\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u0011N[(gUv;\"[H\u0011J6\rZ@=-mQA#\u0007?\u0013\u007fEp\f\u0016$\u000e~w\u0001Ke\u0014Oy^SK1sPg_\u0007\u001d%)&\u001b", "!dR<a+:`-b\u0004]0z\u0005>o\r", "!dR<a+:`-b\u0004]0z\u0005>o\roO$ui\tGy", "B`Q\u0016a+BQ\u0015\u000e\u0005k\u0016}\n=e\u000f", "1ta?X5MB\u0015{eh:\u0001\u00183o\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e!2D\b.;|\u001a8V\u0019", ";`c2e0:Zfx\b^3|\u0005=e", "1ta?X5MB\u0015{lb+\f\f", "7mS6V(M]&h{_:|\u0018"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TabRowDefaults {
    public static final int $stable = 0;
    public static final TabRowDefaults INSTANCE = new TabRowDefaults();
    private static final float ScrollableTabRowEdgeStartPadding = Dp.m6638constructorimpl(52);

    @Deprecated(message = "\u0018Y\u0001teu\u0017Ig^\f\u007fV\u0016AZp_V7\u0017q\u0019S\t_Qy\\\t%ovQv%\\hwK\u0006'AM&[M}", replaceWith = @ReplaceWith(expression = "primaryContainerColor", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getContainerColor$annotations() {
    }

    @Deprecated(message = "\u0018Y\u0001teu\u0017Ig^\f\u007fV\u0016AZp_V7\u0017q\u0019S\t_Qy\\\t)t|/sN\\n(BT1G?\u0013Z", replaceWith = @ReplaceWith(expression = "primaryContentColor", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getContentColor$annotations() {
    }

    private TabRowDefaults() {
    }

    /* JADX INFO: renamed from: getScrollableTabRowEdgeStartPadding-D9Ej5fM, reason: not valid java name */
    public final float m2607getScrollableTabRowEdgeStartPaddingD9Ej5fM() {
        return ScrollableTabRowEdgeStartPadding;
    }

    public final long getContainerColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -2026555673, "C1165@50074L5:TabRow.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2026555673, i2, -1, "androidx.compose.material3.TabRowDefaults.<get-containerColor> (TabRow.kt:1165)");
        }
        long value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final long getPrimaryContainerColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -2069154037, "C1169@50245L5:TabRow.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2069154037, i2, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContainerColor> (TabRow.kt:1169)");
        }
        long value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final long getSecondaryContainerColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1938007129, "C1173@50422L5:TabRow.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1938007129, i2, -1, "androidx.compose.material3.TabRowDefaults.<get-secondaryContainerColor> (TabRow.kt:1173)");
        }
        long value = ColorSchemeKt.getValue(SecondaryNavigationTabTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final long getContentColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1163072359, "C1181@50728L5:TabRow.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1163072359, i2, -1, "androidx.compose.material3.TabRowDefaults.<get-contentColor> (TabRow.kt:1181)");
        }
        long value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final long getPrimaryContentColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1410362619, "C1185@50901L5:TabRow.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1410362619, i2, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContentColor> (TabRow.kt:1185)");
        }
        long value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final long getSecondaryContentColor(Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1166419479, "C1189@51080L5:TabRow.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1166419479, i2, -1, "androidx.compose.material3.TabRowDefaults.<get-secondaryContentColor> (TabRow.kt:1189)");
        }
        long value = ColorSchemeKt.getValue(SecondaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    @Deprecated(message = "\u0018Y\u0001tdy\u0018ffK)\ri}:ReO\n;\u0014zK[\u0005Y\u0003oOxq", replaceWith = @ReplaceWith(expression = "SecondaryIndicator(modifier, height, color)", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: Indicator-9IZ8Weo, reason: not valid java name */
    public final void m2604Indicator9IZ8Weo(Modifier modifier, float f2, long j2, Composer composer, final int i2, final int i3) {
        int i4;
        final long jFromToken = j2;
        final float fM3476getActiveIndicatorHeightD9Ej5fM = f2;
        final Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1454716052);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Indicator)P(2,1:c#ui.unit.Dp,0:c#ui.graphics.Color)1208@51720L11,1210@51807L69:TabRow.kt#uh7d8r");
        int i5 = (i3 + 1) - (1 | i3);
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(companion) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 & 48) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(fM3476getActiveIndicatorHeightD9Ej5fM) ? 32 : 16)));
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((4 & i3) == 0 && composerStartRestartGroup.changed(jFromToken)) ? 256 : 128)));
        }
        if ((i4 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i2) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    fM3476getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3476getActiveIndicatorHeightD9Ej5fM();
                }
                if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                    jFromToken = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor());
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-897)));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((4 & i3) != 0) {
                    i4 &= -897;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1454716052, i4, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:1209)");
            }
            BoxKt.Box(BackgroundKt.m573backgroundbw27NRU$default(SizeKt.m1049height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), fM3476getActiveIndicatorHeightD9Ej5fM), jFromToken, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$Indicator$1
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
                    this.$tmp0_rcvr.m2604Indicator9IZ8Weo(companion, fM3476getActiveIndicatorHeightD9Ej5fM, jFromToken, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: PrimaryIndicator-10LGxhE, reason: not valid java name */
    public final void m2605PrimaryIndicator10LGxhE(Modifier modifier, float f2, float f3, long j2, Shape shape, Composer composer, final int i2, final int i3) {
        int i4;
        final float fM3476getActiveIndicatorHeightD9Ej5fM = f3;
        final RoundedCornerShape activeIndicatorShape = shape;
        final long value = j2;
        final float fM6638constructorimpl = f2;
        final Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1895596205);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PrimaryIndicator)P(2,4:c#ui.unit.Dp,1:c#ui.unit.Dp,0:c#ui.graphics.Color)1228@52502L5,1231@52596L174:TabRow.kt#uh7d8r");
        int i5 = (-1) - (((-1) - i3) | ((-1) - 1));
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (composerStartRestartGroup.changed(companion) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            i4 |= composerStartRestartGroup.changed(fM6638constructorimpl) ? 32 : 16;
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i7 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i8 = composerStartRestartGroup.changed(fM3476getActiveIndicatorHeightD9Ej5fM) ? 256 : 128;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 |= ((i3 & 8) == 0 && composerStartRestartGroup.changed(value)) ? 2048 : 1024;
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i4 |= 24576;
        } else if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 |= composerStartRestartGroup.changed(activeIndicatorShape) ? 16384 : 8192;
        }
        if ((i4 + 9363) - (9363 | i4) != 9362 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i6 != 0) {
                    fM6638constructorimpl = Dp.m6638constructorimpl(24);
                }
                if (i7 != 0) {
                    fM3476getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3476getActiveIndicatorHeightD9Ej5fM();
                }
                if ((i3 & 8) != 0) {
                    value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                    i4 &= -7169;
                }
                if (i9 != 0) {
                    activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                    i4 = (i4 - 7169) - (i4 | (-7169));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1895596205, i4, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1230)");
            }
            SpacerKt.Spacer(BackgroundKt.m572backgroundbw27NRU(SizeKt.m1060requiredWidth3ABfNKs(SizeKt.m1052requiredHeight3ABfNKs(companion, fM3476getActiveIndicatorHeightD9Ej5fM), fM6638constructorimpl), value, activeIndicatorShape), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$PrimaryIndicator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i10) {
                    this.$tmp0_rcvr.m2605PrimaryIndicator10LGxhE(companion, fM6638constructorimpl, fM3476getActiveIndicatorHeightD9Ej5fM, value, activeIndicatorShape, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX INFO: renamed from: SecondaryIndicator-9IZ8Weo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2606SecondaryIndicator9IZ8Weo(androidx.compose.ui.Modifier r21, float r22, long r23, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowDefaults.m2606SecondaryIndicator9IZ8Weo(androidx.compose.ui.Modifier, float, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: renamed from: androidx.compose.material3.TabRowDefaults$tabIndicatorOffset$2, reason: invalid class name */
    /* JADX INFO: compiled from: TabRow.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJc\u0003İY\u0006^\nVB-!r\u001bէ\u000bhp9>E"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pp<W\u0006+OL\u0018\nfZ}G\"\u0012gc2ns\u0001b@1xH62Q*S\nFr\u000f\f_\u001e94XLU\u0014H}\u0015\u0003\u0017"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ TabPosition $currentTabPosition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TabPosition tabPosition) {
            super(3);
            this.$currentTabPosition = tabPosition;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier modifier, Composer composer, int i2) {
            composer.startReplaceGroup(-1541271084);
            ComposerKt.sourceInformation(composer, "C1272@54128L151,1277@54331L150,1283@54589L53:TabRow.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1541271084, i2, -1, "androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:1271)");
            }
            State<Dp> stateM465animateDpAsStateAjpBEmI = AnimateAsStateKt.m465animateDpAsStateAjpBEmI(this.$currentTabPosition.m2603getWidthD9Ej5fM(), TabRowKt.TabRowIndicatorSpec, null, null, composer, 0, 12);
            final State<Dp> stateM465animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m465animateDpAsStateAjpBEmI(this.$currentTabPosition.m2601getLeftD9Ej5fM(), TabRowKt.TabRowIndicatorSpec, null, null, composer, 0, 12);
            Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Alignment.Companion.getBottomStart(), false, 2, null);
            ComposerKt.sourceInformationMarkerStart(composer, -1825070699, "CC(remember):TabRow.kt#9igjgp");
            boolean zChanged = composer.changed(stateM465animateDpAsStateAjpBEmI2);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material3.TabRowDefaults$tabIndicatorOffset$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                        return IntOffset.m6757boximpl(m2608invokeBjo55l4(density));
                    }

                    /* JADX INFO: renamed from: invoke-Bjo55l4, reason: not valid java name */
                    public final long m2608invokeBjo55l4(Density density) {
                        return IntOffsetKt.IntOffset(density.mo704roundToPx0680j_4(TabRowDefaults.AnonymousClass2.invoke$lambda$1(stateM465animateDpAsStateAjpBEmI2)), 0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier modifierM1068width3ABfNKs = SizeKt.m1068width3ABfNKs(OffsetKt.offset(modifierWrapContentSize$default, (Function1) objRememberedValue), invoke$lambda$0(stateM465animateDpAsStateAjpBEmI));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierM1068width3ABfNKs;
        }

        private static final float invoke$lambda$0(State<Dp> state) {
            return state.getValue().m6652unboximpl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$lambda$1(State<Dp> state) {
            return state.getValue().m6652unboximpl();
        }
    }

    public final Modifier tabIndicatorOffset(Modifier modifier, final TabPosition tabPosition) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("tabIndicatorOffset");
                inspectorInfo.setValue(tabPosition);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new AnonymousClass2(tabPosition));
    }
}
