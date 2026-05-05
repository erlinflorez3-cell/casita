package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\":\u0019\u007f\u0007ljA0ZeP\u008cZS@\u000fsڔ<$q$yCAV\"}0\u0015WNmgvJp\u000bK\u000f\u001c\u0016\u0001j2O[ߔ](ƁbB\u001e>sRu=˃dtD\u0005hp09\u0012\u0005/\u001cZN\u001ey\u0013Ea\u000b@4pvHW%O\u001b\u0019@\nn$\u000f$tg|=xpkBG#1rrT-_>\u0007e\rt_m\u0012ɱ`ӜҋD9;!3`KޟQi@\u001b? ?5n5*CK\nVd\\0\u001a#0g\u000fsqT`5Un\u0012?+}j{T\u001c0\u0010z*\u0016l\b\u001c\u0010?H\\8Jj\u0016\u001cKt!bpT\u0010nZ\u007f)pf&3\u0011K6I\u001dvQ\u0010=G`Ѽ\u007f\u0005\u00131S\u0010|5s_\u001eb%\u001b\u0003y\u007fCҨD=Na:hK\u0003\u001c{r\u0004:\u0004^I.Aɨ\u0015.\u001d8}\\߶\"ܩȠ\u0006JJ}\u0005\u001c)\u000ba\u0002jHn$\u001f\u001aE0!\f\tK\u0015\u000bqPbbD\u0011{'\u001b\fś\u0007ʶء`yB:3*ʝOmqmSό&S.ϲ;t"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYj\u001c@o\u0016\u0019QAAkA|\u0015i]I\u000er:$", "", "u(E", "\u0012`c2E(GU\u0019i~\\2|\u0016\u0012e{'\u0003D\n\u0017", "", "Ad[2V;>R\u0007\u000evk;[\u0005>eg,\u0003G\u0005%", "", "Ad[2V;>Rx\by=(\f\t\u0017i\u0007/\u007fN", "2hb=_(R;#}z", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U)Cd\u0005\u001cKU -M\u0019", "2`c296K[\u0015\u000e\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYh$5s\u0016;.MHs0-$hn\u000f", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "\u0012`c2E(GU\u0019i~\\2|\u0016\u0012e{'\u0003D\n\u0017^XB\\,u6\u007f", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;f-wQ|`\u001eCx\u0010\u0006]/>[S\u0004\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018~#VL[0XY@\u0007r\u000ei\u000e9/\u000b\u000bYN\u0005xQ?\u001b\u0017;I\u000f\u0011O|\u0015\u0015\u001b?noU \u000eQ\u0002 \u007fO)2V])aQ@Ic.d\u00195\u0004XC91\u001eu\u0018.2N8\u0012\u0007]\u001fr\u001c\u0007wpV\u001d\u00038m\u001cwcQO}UIJ\u000b\u0003\u000fl", "AsP?g\u000b:b\u0019mzq;", "", "3mS\u0011T;>B\u0019\u0012\n", "AsP?g\u000b:b\u0019i\u0002Z*|\f9l~(\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "3mS\u0011T;>> zx^/\u0007\u0010.e\r", "2`c2f\u000b>Z\u001d\u0007~m,\n", "\u0012`c2E(GU\u0019i~\\2|\u0016\u0012e{'\u0003D\n\u0017^\u0012cq,x\u0013!", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;f-wQ|`\u001eCx\u0010\u0006]/>[S\u0004\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018~#VL[0XY@\u0007r\u000ei\u000e9/\u000b\u000bYN\u0005xQ?\u001b\u0017;I\u000f\u0011O|\u0015\u0015\u001b?noU \u000eQ\u0002 \u007fO)2V])aQ@Ic.d\u00195\u0004a6K ]x\u0015$j\u001a\u001c\u0019\tW\u001at(`lcX\u0015D? Go%4T|YEv|\u0006Q\u0006\u0007\u00196a>0\u00065M5:?b\u0014Oq!L(Y%5ZP+0?\th&Qm\u0005sB\u00172$r\u0010WcE:\u0017timQ\u001dP>'d3pc\u000b@\u001f[%Oy$.J\b\f`\u000b\u001dR\b4vcXG%]\u000fcQT+] \u0007\rodq\u0015\u0012FX\u001cr.^J\u0017\u0011\u0013pC\u0016\nY\r\"\u0001Q\u001fqSr%5y,A\u0003\u001fI.\t/ :C", "\u0012`c2E(GU\u0019i~\\2|\u0016\u001ei\u000f/{", "\u0012`c2E(GU\u0019i~\\2|\u0016\u001ei\u000f/{\b\u0004\u0001u\u001b;#\u000b", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/d\u001c@l#8QBN52(\u001dskG\u0007-9^\u007f6KTNu:\\zH\u001e Z\u001b$\u000fpHJ", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DateRangePickerDefaults {
    public static final int $stable = 0;
    public static final DateRangePickerDefaults INSTANCE = new DateRangePickerDefaults();

    private DateRangePickerDefaults() {
    }

    /* JADX INFO: renamed from: DateRangePickerTitle-hOD91z4, reason: not valid java name */
    public final void m2059DateRangePickerTitlehOD91z4(final int i2, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1412719908);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DateRangePickerTitle)P(0:c#material3.DisplayMode):DateRangePicker.kt#uh7d8r");
        if ((i4 & 1) != 0) {
            i5 = (-1) - (((-1) - i3) & ((-1) - 6));
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            i5 = i3 | (composerStartRestartGroup.changed(i2) ? 4 : 2);
        } else {
            i5 = i3;
        }
        int i6 = i4 & 2;
        if (i6 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 48));
        } else if ((i3 & 48) == 0) {
            int i7 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i5 = (i5 + i7) - (i5 & i7);
        }
        if ((-1) - (((-1) - i5) | ((-1) - 19)) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i6 != 0) {
                companion = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1412719908, i5, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle (DateRangePicker.kt:338)");
            }
            if (DisplayMode.m2082equalsimpl0(i2, DisplayMode.Companion.m2087getPickerjFl4v0())) {
                composerStartRestartGroup.startReplaceGroup(980469064);
                ComposerKt.sourceInformation(composerStartRestartGroup, "341@15673L48,341@15668L75");
                Strings.Companion companion2 = Strings.Companion;
                TextKt.m2711Text4IGK_g(Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_range_picker_title), composerStartRestartGroup, 0), companion, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i5 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION, 0, 131068);
                composerStartRestartGroup.endReplaceGroup();
            } else if (DisplayMode.m2082equalsimpl0(i2, DisplayMode.Companion.m2086getInputjFl4v0())) {
                composerStartRestartGroup.startReplaceGroup(980473063);
                ComposerKt.sourceInformation(composerStartRestartGroup, "343@15798L47,343@15793L74");
                Strings.Companion companion3 = Strings.Companion;
                TextKt.m2711Text4IGK_g(Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_range_input_title), composerStartRestartGroup, 0), companion, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (-1) - (((-1) - i5) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)), 0, 131068);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(329974917);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerTitle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    this.$tmp0_rcvr.m2059DateRangePickerTitlehOD91z4(i2, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i3) & ((-1) - 1))), i4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: DateRangePickerHeadline-v84Udv0, reason: not valid java name */
    public final void m2058DateRangePickerHeadlinev84Udv0(final Long l2, final Long l3, final int i2, final DatePickerFormatter datePickerFormatter, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        Composer composer2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1611069472);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DateRangePickerHeadline)P(4,3,1:c#material3.DisplayMode)367@16887L47,368@16961L45,377@17394L30,378@17459L28,369@17015L534:DateRangePicker.kt#uh7d8r");
        if ((-1) - (((-1) - i4) | ((-1) - 1)) != 0) {
            i5 = (-1) - (((-1) - i3) & ((-1) - 6));
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(l2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i5 = (i5 + 48) - (i5 & 48);
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(l3) ? 32 : 16;
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i6 = composerStartRestartGroup.changed(i2) ? 256 : 128;
            i5 = (i5 + i6) - (i5 & i6);
        }
        if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
            i5 = (i5 + 3072) - (i5 & 3072);
        } else if ((i3 + 3072) - (i3 | 3072) == 0) {
            i5 |= (-1) - (((-1) - i3) | ((-1) - 4096)) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 2048 : 1024;
        }
        int i7 = (-1) - (((-1) - i4) | ((-1) - 16));
        if (i7 != 0) {
            i5 = (i5 + 24576) - (i5 & 24576);
        } else if ((-1) - (((-1) - i3) | ((-1) - 24576)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(companion) ? 16384 : 8192)));
        }
        if ((-1) - (((-1) - i4) | ((-1) - 32)) != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((-1) - (((-1) - i3) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            int i8 = composerStartRestartGroup.changed(this) ? 131072 : 65536;
            i5 = (i5 + i8) - (i5 & i8);
        }
        if ((74899 & i5) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (i7 != 0) {
                companion = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1611069472, i5, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:366)");
            }
            Strings.Companion companion2 = Strings.Companion;
            final String strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_range_picker_start_headline), composerStartRestartGroup, 0);
            Strings.Companion companion3 = Strings.Companion;
            final String strM2993getString2EP1pXo2 = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_range_picker_end_headline), composerStartRestartGroup, 0);
            int i9 = (-1) - (((-1) - ((i5 & 14) | 918552576)) & ((-1) - (112 & i5)));
            int i10 = (-1) - (((-1) - i5) | ((-1) - 896));
            composer2 = composerStartRestartGroup;
            m2056DateRangePickerHeadline0YIUgSQ(l2, l3, i2, datePickerFormatter, companion, strM2993getString2EP1pXo, strM2993getString2EP1pXo2, ComposableLambdaKt.rememberComposableLambda(482821121, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i11) {
                    ComposerKt.sourceInformation(composer3, "C377@17396L26:DateRangePicker.kt#uh7d8r");
                    if ((i11 + 3) - (3 | i11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(482821121, i11, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline.<anonymous> (DateRangePicker.kt:377)");
                    }
                    TextKt.m2711Text4IGK_g(strM2993getString2EP1pXo, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1522669758, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i11) {
                    ComposerKt.sourceInformation(composer3, "C378@17461L24:DateRangePicker.kt#uh7d8r");
                    if ((i11 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1522669758, i11, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline.<anonymous> (DateRangePicker.kt:378)");
                    }
                    TextKt.m2711Text4IGK_g(strM2993getString2EP1pXo2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableSingletons$DateRangePickerKt.INSTANCE.m1982getLambda1$material3_release(), composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - ((i9 + i10) - (i9 & i10))) & ((-1) - (7168 & i5))))) & ((-1) - (57344 & i5))), (-1) - (((-1) - (i5 >> 15)) | ((-1) - 14)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i11) {
                    this.$tmp0_rcvr.m2058DateRangePickerHeadlinev84Udv0(l2, l3, i2, datePickerFormatter, modifier2, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: DateRangePickerHeadline-0YIUgSQ, reason: not valid java name */
    public final void m2056DateRangePickerHeadline0YIUgSQ(final Long l2, final Long l3, final int i2, final DatePickerFormatter datePickerFormatter, final Modifier modifier, final String str, final String str2, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, final int i3, final int i4) {
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-820363420);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DateRangePickerHeadline)P(7,6,2:c#material3.DisplayMode!1,5,9,4,8,3)420@19570L15,456@21103L168,454@21029L748:DateRangePicker.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            i5 = (composerStartRestartGroup.changed(l2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 + 48) - (i3 | 48) == 0) {
            i5 |= composerStartRestartGroup.changed(l3) ? 32 : 16;
        }
        if ((-1) - (((-1) - i3) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(i2) ? 256 : 128)));
        }
        if ((i3 & 3072) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - ((-1) - (((-1) - i3) | ((-1) - 4096)) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 2048 : 1024)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 24576)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(modifier) ? 16384 : 8192)));
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i3)) == 0) {
            i5 |= composerStartRestartGroup.changed(str) ? 131072 : 65536;
        }
        if ((-1) - (((-1) - 1572864) | ((-1) - i3)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(str2) ? 1048576 : 524288)));
        }
        if ((12582912 + i3) - (12582912 | i3) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i3) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function23) ? 536870912 : 268435456;
            i5 = (i5 + i6) - (i5 & i6);
        }
        if ((-1) - (((-1) - 306783379) | ((-1) - i5)) == 306783378 && (i4 & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-820363420, i5, i4, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:419)");
            }
            Locale localeDefaultLocale = CalendarLocale_androidKt.defaultLocale(composerStartRestartGroup, 0);
            String date$default = DatePickerFormatter.formatDate$default(datePickerFormatter, l2, localeDefaultLocale, false, 4, null);
            String date$default2 = DatePickerFormatter.formatDate$default(datePickerFormatter, l3, localeDefaultLocale, false, 4, null);
            String date = datePickerFormatter.formatDate(l2, localeDefaultLocale, true);
            composerStartRestartGroup.startReplaceGroup(1063158288);
            String strM2993getString2EP1pXo = "";
            ComposerKt.sourceInformation(composerStartRestartGroup, "");
            if (date == null) {
                if (DisplayMode.m2082equalsimpl0(i2, DisplayMode.Companion.m2087getPickerjFl4v0())) {
                    composerStartRestartGroup.startReplaceGroup(1063166242);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "434@20163L51");
                    Strings.Companion companion = Strings.Companion;
                    date = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_picker_no_selection_description), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (DisplayMode.m2082equalsimpl0(i2, DisplayMode.Companion.m2086getInputjFl4v0())) {
                    composerStartRestartGroup.startReplaceGroup(1063169213);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "435@20256L46");
                    Strings.Companion companion2 = Strings.Companion;
                    date = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_input_no_input_description), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1401419729);
                    composerStartRestartGroup.endReplaceGroup();
                    date = "";
                }
            }
            composerStartRestartGroup.endReplaceGroup();
            String date2 = datePickerFormatter.formatDate(l3, localeDefaultLocale, true);
            composerStartRestartGroup.startReplaceGroup(1063174382);
            ComposerKt.sourceInformation(composerStartRestartGroup, "");
            if (date2 != null) {
                strM2993getString2EP1pXo = date2;
            } else if (DisplayMode.m2082equalsimpl0(i2, DisplayMode.Companion.m2087getPickerjFl4v0())) {
                composerStartRestartGroup.startReplaceGroup(1063182274);
                ComposerKt.sourceInformation(composerStartRestartGroup, "446@20664L51");
                Strings.Companion companion3 = Strings.Companion;
                strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_picker_no_selection_description), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (DisplayMode.m2082equalsimpl0(i2, DisplayMode.Companion.m2086getInputjFl4v0())) {
                composerStartRestartGroup.startReplaceGroup(1063185245);
                ComposerKt.sourceInformation(composerStartRestartGroup, "447@20757L46");
                Strings.Companion companion4 = Strings.Companion;
                strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_input_no_input_description), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1400922737);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            final String str3 = str + ": " + date;
            final String str4 = str2 + ": " + strM2993getString2EP1pXo;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1063196439, "CC(remember):DateRangePicker.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(str3) | composerStartRestartGroup.changed(str4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$4$1
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
                        SemanticsPropertiesKt.m5951setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.Companion.m5925getPolite0phEisY());
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str3 + ", " + str4);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) objRememberedValue);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM898spacedBy0680j_4 = Arrangement.INSTANCE.m898spacedBy0680j_4(Dp.m6638constructorimpl(4));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM898spacedBy0680j_4, centerVertically, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierClearAndSetSemantics);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 303513083, "C468@21589L16:DateRangePicker.kt#uh7d8r");
            if (date$default != null) {
                composerStartRestartGroup.startReplaceGroup(303536053);
                ComposerKt.sourceInformation(composerStartRestartGroup, "464@21471L31");
                TextKt.m2711Text4IGK_g(date$default, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 131070);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(303604222);
                ComposerKt.sourceInformation(composerStartRestartGroup, "466@21540L22");
                function2.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 21) & 14));
                composerStartRestartGroup.endReplaceGroup();
            }
            function23.invoke(composerStartRestartGroup, Integer.valueOf((-1) - (((-1) - (i5 >> 27)) | ((-1) - 14))));
            if (date$default2 != null) {
                composerStartRestartGroup.startReplaceGroup(303729431);
                ComposerKt.sourceInformation(composerStartRestartGroup, "470@21666L29");
                TextKt.m2711Text4IGK_g(date$default2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 131070);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(303795616);
                ComposerKt.sourceInformation(composerStartRestartGroup, "472@21733L20");
                int i7 = i5 >> 24;
                function22.invoke(composerStartRestartGroup, Integer.valueOf((i7 + 14) - (i7 | 14)));
                composerStartRestartGroup.endReplaceGroup();
            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$6
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

                public final void invoke(Composer composer2, int i8) {
                    this.$tmp7_rcvr.m2056DateRangePickerHeadline0YIUgSQ(l2, l3, i2, datePickerFormatter, modifier, str, str2, function2, function22, function23, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i3) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i4));
                }
            });
        }
    }
}
