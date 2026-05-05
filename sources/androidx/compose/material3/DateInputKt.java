package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
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
/* JADX INFO: compiled from: DateInput.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яć\u0014D߬)\u001e\u007f\u007fLDiu\fA\u001c0\u0013.H~*, w\u000f߿r9>Km߉6Ri*\u0017k\u00124,[*rK;k\u001a\u0006̝\u0011OdgoñRZ!C\u0017إ\u001ex\u0001,Qǁ\u0001](\u000f:Bu@;M\u0006=A`z6\r H\"@y\u001b\u0001\"*N\u0010~zYK\u0014۵8@\u0007:Z҈U\u00050\u0012\u000ē(\u00014\\oNLHt]@1+\u0003\u007fBf\nm5\u0015M;L\u0005-\u001b}y A?e=EFa\f\u001fokR\u0013P\b<3pҊ+5O~g<^\f$\u00171U3j\u0003(l\u0005\u007ff:1[SqYh\u000eV\u0007+\u007f\u001bL\u001c\u000e48x2;,~\b<F%vaTh\u0002\rW0~oL/%.Jq8ӸjQoS1פ6\n\u001e%\u001eQ\u0007\u001f%in&`C6\u0005}_MiBSG|\u0012\nO{\r\tp\u0012.\u00142]~]\u0004!0'%eag-Qo\u0010V\\g%\u0014\u0011ya\u0007jUP$~\u0016e0\u001f\u000b\tb\u0081\tkVs\t=\u001fm4a\u0017\u007f\u0018\u0013Nb\u000e;OCŎROn\t\u001bQk+=/\u0015Y\nry1o9\rWeUq5yR%:oDp,pjp{tZ;QR6V\u0001(w*[\u0015\u000bȇ1ŭۇ 62['\b5Z\u0011ٜZA+\b6ʴjʐ\u0003Z;ɴ\u001bk*t\u0017\u0002pj~q\u007fxw/Sʣ$έES=\u00194Yȫh9\u0005&\rҊ\u0010.FѮPsƵp\u001e\u0004\u0003\u0014 DH\u0010֢Ȍ="}, d2 = {"\u0017m_Bg\u001b>f(_~^3{s+d~,\u0005B", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "5dc\u0016a7Nb\b~\u000em\r\u0001\t6dj$z?\u0005 \u0019", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w8?:j8'\u0017Y]@\u0017c:$", "\u0017m_Bg\u001b>f(g\u0005g\f\n\u00169n\u007f2\fN]!&Vy\u0016'r$4]\u0007\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u0012`c2<5Ic(\\\u0005g;|\u0012>", "", "Ad[2V;>Rwz\n^\u0014\u0001\u00106i\u000e", "", "=m3.g,,S ~xm0\u0007\u0012\rh{1}@", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "2`c2<5&W \u0006~l", "1`[2a+:`\u0001\ty^3", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\fIJ;t3\u001a\"Pk8\u0007j\u0002", "GdP?E(GU\u0019", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "2`c296K[\u0015\u000e\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYh$5s\u0016;.MHs0-$hn\u000f", "Ad[2V;:P ~YZ;|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d%<Y{/3j\u001d.,?JkBs", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYh$5s\u0016;+MBuA,j", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;f.\u0006O\b\u001b \u0011t\u001fD@&Eb{/;w\u001f<\u0017$Kt2-\u0019rj\u0005\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u00183\t\u0014YN(jK\u0005h\f5X\u0002Hq|\u0013_k1qpKU\fTa\u001ftA0>-_i\tNEN,7`\u0015a\u001dj\u0004\u001e-#^\u0015$jP\u0004pw\\\u0010\u007f\\}fz\u0011\u0017\u0005@/H{[\u0010Mkd<\u0002+\u001bRIAp.gt\u0016x+\n47\u0017n\u0012Sc'M^\u0006j\u0013XJ&3@@\u0012R\u0015a\u007ftI\u0018v\u001f+\u0010\nq5>\u001dal1\u0012|\u0007d\u0017YD]\\\b71\u0002MI}j\u000eB\bAh\u0004\u0019\b\u001amkoQN%b\u0001cx@1_\u001e\u0007~mee\r\u0012LYyl(e7Zp\u0013oB\u0019\n/*\u0011yG\u001dwOqn!m.>\u0004\u001bW!|XL\u007faGw\u0010_\u0012\u000b\u0013\n'\u0002iOO\u001aV\u0016", "\u0012`c2<5Ic(mzq;]\r/l~", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "7mXA\\(E2\u0015\u000ezF0\u0004\u00103s", ":`Q2_", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", ">kP0X/HZ\u0018~\b", "7m_Bg\u0010=S\"\u000e~_0|\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006Z.@i\r\u00046m\u001f=QD?kAs", "2`c2<5Ic(ove0{\u0005>o\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006U!DYa)B}%\u001fIJ?j0-\u001fu7", "2`c2<5Ic(_\u0005k4x\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\rIR;O=)%wBC\u0014k(]L", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T!<Y\u0007\u001f3z|8K?Bk\n", "\u0012`c2<5Ic(mzq;]\r/l~o\u000b,i$'(:", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0003\u001cHi_5IL=5\u001b(\u001ej7 \rm;Uz0\u0011Q_4&S\u0003F\u0012!^\u0018W9VeiJ\"}HA(S\u00020}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?I%wFfcuN\u000f\u000ff3s\fl&XA\u0004\u0002\u0010x\u0019$gL;q\u0006R\u0011y(`mqV ~AmC~c\u0010F\u007f^:\u0004+)T\nArBar:x7\r\u0001\u007f\u001dj\u000fZn\u001cG(}&4&B7/4K\u0017ITq?MN\u0017f.e\u0012\u0017/\u000b\u0015\u007fanbU\u0019\u000b\\*%3kg\fA`\u0006\bQk$'S\u0003>bG^g\u00033mIRN+cq\u0016wH![ \r\u0010<~\u00187\u0015Jc\u0013g=)5W\u001b\u0014rF\fEa?$pU\u0014iR@%[x36\u0006\u001aE(|*8\u0006R'x\u001b&Ca\u0015\f%ox\u0018`;\u000f6!\u0007iGfgxqqQ\u001e g\u000e\u0003\u001b60\u000f\\DmqA%\u001f\u0006\u0019r\u000b\u0015'F4\u00113NMf)\n-*\u0001KZ=\u0014*S\u0015<>~\u001dLh\u0002\u000b1j\u0017~\u00115|\u0012/u$\u007fO*q)/0\u0019\u001c\u0013~!7\u001bJ6X\u001eX\u001d|HUoa?ru", ";`c2e0:Zfx\b^3|\u0005=e", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DateInputKt {
    private static final PaddingValues InputTextFieldPadding;
    private static final float InputTextNonErroneousBottomPadding = Dp.m6638constructorimpl(16);

    public static final void DateInputContent(final Long l2, Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        DateInputFormat dateInputFormat;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(643325609);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DateInputContent)P(5,3!1,6,2,4)62@2605L15,64@2655L75,65@2758L45,66@2838L44,67@2916L45,69@2999L551,82@3639L42,86@3836L164,92@4024L62,83@3686L901:DateInput.kt#uh7d8r");
        if ((i2 + 6) - (i2 | 6) == 0) {
            i3 = (composerStartRestartGroup.changed(l2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        Function1<? super Long, Unit> function12 = function1;
        if ((i2 + 48) - (i2 | 48) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
            i3 = (i3 + i4) - (i3 & i4);
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(calendarModel) ? 256 : 128;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((i2 & 3072) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(intRange) ? 2048 : 1024;
            i3 = (i3 + i6) - (i3 & i6);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - ((-1) - (((-1) - i2) | ((-1) - 32768)) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 16384 : 8192)));
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i2)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(selectableDates) ? 131072 : 65536)));
        }
        if ((1572864 + i2) - (1572864 | i2) == 0) {
            int i7 = composerStartRestartGroup.changed(datePickerColors) ? 1048576 : 524288;
            i3 = (i3 + i7) - (i3 & i7);
        }
        if ((599187 + i3) - (599187 | i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(643325609, i3, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:60)");
            }
            int i8 = 0;
            Locale localeDefaultLocale = CalendarLocale_androidKt.defaultLocale(composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1825155115, "CC(remember):DateInput.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = calendarModel.getDateInputFormat(localeDefaultLocale);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            DateInputFormat dateInputFormat2 = (DateInputFormat) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Strings.Companion companion = Strings.Companion;
            String strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_input_invalid_for_pattern), composerStartRestartGroup, 0);
            Strings.Companion companion2 = Strings.Companion;
            String strM2993getString2EP1pXo2 = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_input_invalid_year_range), composerStartRestartGroup, 0);
            Strings.Companion companion3 = Strings.Companion;
            String strM2993getString2EP1pXo3 = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_input_invalid_not_allowed), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1825166599, "CC(remember):DateInput.kt#9igjgp");
            boolean zChanged2 = composerStartRestartGroup.changed(dateInputFormat2);
            if ((-1) - (((-1) - 57344) | ((-1) - i3)) == 16384 || ((32768 + i3) - (32768 | i3) != 0 && composerStartRestartGroup.changed(datePickerFormatter))) {
                i8 = 1;
            }
            int i9 = ((zChanged2 ? 1 : 0) + i8) - ((zChanged2 ? 1 : 0) & i8);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i9 != 0 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = dateInputValidator;
                dateInputFormat = dateInputFormat2;
                DateInputValidator dateInputValidator = new DateInputValidator(intRange, selectableDates, dateInputFormat2, datePickerFormatter, strM2993getString2EP1pXo, strM2993getString2EP1pXo2, strM2993getString2EP1pXo3, "", null, null, 768, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                dateInputFormat = dateInputFormat2;
            }
            DateInputValidator dateInputValidator2 = (DateInputValidator) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            Strings.Companion companion4 = Strings.Companion;
            final String strM2993getString2EP1pXo4 = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_date_input_label), composerStartRestartGroup, 0);
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), InputTextFieldPadding);
            int iM2193getSingleDateInputJ2x2o4M = InputIdentifier.Companion.m2193getSingleDateInputJ2x2o4M();
            dateInputValidator2.setCurrentStartDateMillis$material3_release(l2);
            int i10 = i3 << 3;
            composer2 = composerStartRestartGroup;
            function12 = function12;
            m2010DateInputTextFieldtQNruF0(modifierPadding, l2, function12, calendarModel, ComposableLambdaKt.rememberComposableLambda(-1819015125, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt.DateInputContent.2
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
                    ComposerKt.sourceInformation(composer3, "C89@3929L47,87@3850L140:DateInput.kt#uh7d8r");
                    if ((-1) - (((-1) - i11) | ((-1) - 3)) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1819015125, i11, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:87)");
                    }
                    String str = strM2993getString2EP1pXo4;
                    Modifier.Companion companion5 = Modifier.Companion;
                    ComposerKt.sourceInformationMarkerStart(composer3, -49706674, "CC(remember):DateInput.kt#9igjgp");
                    boolean z2 = (-1) - (((-1) - (composer3.changed(strM2993getString2EP1pXo4) ? 1 : 0)) & ((-1) - (composer3.changed(upperCase) ? 1 : 0))) == 1;
                    final String str2 = strM2993getString2EP1pXo4;
                    final String str3 = upperCase;
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (z2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$2$1$1
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
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2 + ", " + str3);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    TextKt.m2711Text4IGK_g(str, SemanticsModifierKt.semantics$default(companion5, false, (Function1) objRememberedValue3, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-564233108, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt.DateInputContent.3
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
                    ComposerKt.sourceInformation(composer3, "C92@4026L58:DateInput.kt#uh7d8r");
                    if ((-1) - (((-1) - i11) | ((-1) - 3)) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-564233108, i11, -1, "androidx.compose.material3.DateInputContent.<anonymous> (DateInput.kt:92)");
                    }
                    TextKt.m2711Text4IGK_g(upperCase, SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateInputKt.DateInputContent.3.1
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    }), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), iM2193getSingleDateInputJ2x2o4M, dateInputValidator2, dateInputFormat, localeDefaultLocale, datePickerColors, composer2, ((-1) - (((-1) - (i10 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) & ((-1) - 1794054))) | ((i10 + 896) - (896 | i10)) | ((i10 + 7168) - (i10 | 7168)), (-1) - (((-1) - (i3 >> 18)) | ((-1) - 14)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function1<? super Long, Unit> function13 = function12;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt.DateInputContent.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i11) {
                    Long l3 = l2;
                    Function1<Long, Unit> function14 = function13;
                    CalendarModel calendarModel2 = calendarModel;
                    IntRange intRange2 = intRange;
                    DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                    SelectableDates selectableDates2 = selectableDates;
                    DatePickerColors datePickerColors2 = datePickerColors;
                    int i12 = i2;
                    DateInputKt.DateInputContent(l3, function14, calendarModel2, intRange2, datePickerFormatter2, selectableDates2, datePickerColors2, composer3, RecomposeScopeImplKt.updateChangedFlags((i12 + 1) - (i12 & 1)));
                }
            });
        }
    }

    /* JADX INFO: renamed from: DateInputTextField-tQNruF0, reason: not valid java name */
    public static final void m2010DateInputTextFieldtQNruF0(final Modifier modifier, final Long l2, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final int i2, final DateInputValidator dateInputValidator, final DateInputFormat dateInputFormat, final Locale locale, final DatePickerColors datePickerColors, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-857008589);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DateInputTextField)P(8,4,9!1,6,10,5:c#material3.InputIdentifier,3,2,7)122@5091L39,124@5207L488,124@5155L540,142@5766L1458,188@7730L60,191@7875L59,140@5701L2642:DateInput.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            int i7 = composerStartRestartGroup.changed(l2) ? 32 : 16;
            i5 = (i5 + i7) - (i5 & i7);
        }
        if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            i5 = (i5 + i8) - (i5 & i8);
        }
        if ((i3 + 3072) - (i3 | 3072) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(calendarModel) ? 2048 : 1024)));
        }
        if ((i3 + 24576) - (i3 | 24576) == 0) {
            int i9 = composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
            i5 = (i5 + i9) - (i5 & i9);
        }
        if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i3) - (196608 | i3) == 0) {
            int i10 = composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
            i5 = (i5 + i10) - (i5 & i10);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 1572864)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(i2) ? 1048576 : 524288)));
        }
        if ((i3 + 12582912) - (i3 | 12582912) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(dateInputValidator) ? 8388608 : 4194304)));
        }
        if ((i3 + 100663296) - (i3 | 100663296) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(dateInputFormat) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((i3 + 805306368) - (i3 | 805306368) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(locale) ? 536870912 : 268435456;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 6)) == 0) {
            i6 = i4 | (composerStartRestartGroup.changed(datePickerColors) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 306783379)) == 306783378 && (i6 + 3) - (3 | i6) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-857008589, i5, i6, "androidx.compose.material3.DateInputTextField (DateInput.kt:121)");
            }
            final MutableState mutableState = (MutableState) RememberSaveableKt.m3764rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) new Function0<MutableState<String>>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$errorText$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final MutableState<String> invoke() {
                    return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                }
            }, composerStartRestartGroup, 3072, 6);
            Object[] objArr = new Object[0];
            Saver<TextFieldValue, Object> saver = TextFieldValue.Companion.getSaver();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 236419420, "CC(remember):DateInput.kt#9igjgp");
            int i11 = (-1) - (((-1) - 234881024) | ((-1) - i5));
            int i12 = ((-1) - (((-1) - (((i5 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) == 32 ? 1 : 0) | (composerStartRestartGroup.changedInstance(calendarModel) ? 1 : 0))) & ((-1) - (i11 == 67108864 ? 1 : 0)))) | (composerStartRestartGroup.changedInstance(locale) ? 1 : 0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i12 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function0) new Function0<MutableState<TextFieldValue>>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$text$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
                    @Override // kotlin.jvm.functions.Function0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final androidx.compose.runtime.MutableState<androidx.compose.ui.text.input.TextFieldValue> invoke() {
                        /*
                            r9 = this;
                            java.lang.Long r1 = r2
                            if (r1 == 0) goto L1a
                            androidx.compose.material3.internal.CalendarModel r4 = r3
                            androidx.compose.material3.internal.DateInputFormat r0 = r4
                            java.util.Locale r3 = r5
                            java.lang.Number r1 = (java.lang.Number) r1
                            long r1 = r1.longValue()
                            java.lang.String r0 = r0.getPatternWithoutDelimiters()
                            java.lang.String r3 = r4.formatWithPattern(r1, r0, r3)
                            if (r3 != 0) goto L1c
                        L1a:
                            java.lang.String r3 = ""
                        L1c:
                            r0 = 0
                            long r4 = androidx.compose.ui.text.TextRangeKt.TextRange(r0, r0)
                            androidx.compose.ui.text.input.TextFieldValue r2 = new androidx.compose.ui.text.input.TextFieldValue
                            r6 = 0
                            r7 = 4
                            r8 = 0
                            r2.<init>(r3, r4, r6, r7, r8)
                            r1 = 2
                            r0 = 0
                            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(r2, r0, r1, r0)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateInputKt$DateInputTextField$text$2$1.invoke():androidx.compose.runtime.MutableState");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final MutableState mutableStateRememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 4);
            TextFieldValue textFieldValueDateInputTextField_tQNruF0$lambda$4 = DateInputTextField_tQNruF0$lambda$4(mutableStateRememberSaveable);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 236438278, "CC(remember):DateInput.kt#9igjgp");
            int i13 = ((-1) - (((-1) - (composerStartRestartGroup.changed(mutableStateRememberSaveable) ? 1 : 0)) & ((-1) - (i11 == 67108864 ? 1 : 0)))) | (composerStartRestartGroup.changed(mutableState) ? 1 : 0);
            int i14 = (i5 + 896) - (896 | i5) == 256 ? 1 : 0;
            int i15 = ((-1) - (((-1) - (((-1) - (((-1) - ((i13 + i14) - (i13 & i14))) & ((-1) - (composerStartRestartGroup.changedInstance(calendarModel) ? 1 : 0))) != 1 ? 0 : 1) | ((29360128 + i5) - (29360128 | i5) == 8388608 ? 1 : 0))) & ((-1) - ((3670016 & i5) == 1048576 ? 1 : 0)))) | (composerStartRestartGroup.changedInstance(locale) ? 1 : 0);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i15 != 0 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                        invoke2(textFieldValue);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextFieldValue textFieldValue) {
                        if (textFieldValue.getText().length() <= dateInputFormat.getPatternWithoutDelimiters().length()) {
                            String text = textFieldValue.getText();
                            for (int i16 = 0; i16 < text.length(); i16++) {
                                if (!Character.isDigit(text.charAt(i16))) {
                                    return;
                                }
                            }
                            mutableStateRememberSaveable.setValue(textFieldValue);
                            String string = StringsKt.trim((CharSequence) textFieldValue.getText()).toString();
                            Long lValueOf = null;
                            if (string.length() == 0 || string.length() < dateInputFormat.getPatternWithoutDelimiters().length()) {
                                mutableState.setValue("");
                                function1.invoke(null);
                                return;
                            }
                            CalendarDate calendarDate = calendarModel.parse(string, dateInputFormat.getPatternWithoutDelimiters());
                            mutableState.setValue(dateInputValidator.m2011validateXivgLIo(calendarDate, i2, locale));
                            Function1<Long, Unit> function12 = function1;
                            if (mutableState.getValue().length() == 0 && calendarDate != null) {
                                lValueOf = Long.valueOf(calendarDate.getUtcTimeMillis());
                            }
                            function12.invoke(lValueOf);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierM1022paddingqDBjuR0$default = PaddingKt.m1022paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, !StringsKt.isBlank((CharSequence) mutableState.getValue()) ? Dp.m6638constructorimpl(0) : InputTextNonErroneousBottomPadding, 7, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 236499728, "CC(remember):DateInput.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$2$1
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
                        if (StringsKt.isBlank(mutableState.getValue())) {
                            return;
                        }
                        SemanticsPropertiesKt.error(semanticsPropertyReceiver, mutableState.getValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i16 = i5 << 6;
            OutlinedTextFieldKt.OutlinedTextField(textFieldValueDateInputTextField_tQNruF0$lambda$4, (Function1<? super TextFieldValue, Unit>) function12, SemanticsModifierKt.semantics$default(modifierM1022paddingqDBjuR0$default, false, (Function1) objRememberedValue3, 1, null), false, false, (TextStyle) null, function2, function22, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-591991974, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i17) {
                    ComposerKt.sourceInformation(composer2, "C191@7911L21:DateInput.kt#uh7d8r");
                    if ((i17 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-591991974, i17, -1, "androidx.compose.material3.DateInputTextField.<anonymous> (DateInput.kt:191)");
                    }
                    if (!StringsKt.isBlank(mutableState.getValue())) {
                        TextKt.m2711Text4IGK_g(mutableState.getValue(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), !StringsKt.isBlank((CharSequence) mutableState.getValue()), (VisualTransformation) new DateVisualTransformation(dateInputFormat), new KeyboardOptions(0, (Boolean) false, KeyboardType.Companion.m6358getNumberPjHm6EE(), ImeAction.Companion.m6302getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 113, (DefaultConstructorMarker) null), (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, datePickerColors.getDateTextFieldColors(), composerStartRestartGroup, (i16 + 33030144) - (i16 | 33030144), 12779904, 0, 4001592);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$4
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

                public final void invoke(Composer composer2, int i17) {
                    Modifier modifier2 = modifier;
                    Long l3 = l2;
                    Function1<Long, Unit> function13 = function1;
                    CalendarModel calendarModel2 = calendarModel;
                    Function2<Composer, Integer, Unit> function23 = function2;
                    Function2<Composer, Integer, Unit> function24 = function22;
                    int i18 = i2;
                    DateInputValidator dateInputValidator2 = dateInputValidator;
                    DateInputFormat dateInputFormat2 = dateInputFormat;
                    Locale locale2 = locale;
                    DatePickerColors datePickerColors2 = datePickerColors;
                    int i19 = i3;
                    DateInputKt.m2010DateInputTextFieldtQNruF0(modifier2, l3, function13, calendarModel2, function23, function24, i18, dateInputValidator2, dateInputFormat2, locale2, datePickerColors2, composer2, RecomposeScopeImplKt.updateChangedFlags((i19 + 1) - (i19 & 1)), RecomposeScopeImplKt.updateChangedFlags(i4));
                }
            });
        }
    }

    private static final TextFieldValue DateInputTextField_tQNruF0$lambda$4(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    public static final PaddingValues getInputTextFieldPadding() {
        return InputTextFieldPadding;
    }

    static {
        float f2 = 24;
        InputTextFieldPadding = PaddingKt.m1015PaddingValuesa9UjIt4$default(Dp.m6638constructorimpl(f2), Dp.m6638constructorimpl(10), Dp.m6638constructorimpl(f2), 0.0f, 8, null);
    }
}
