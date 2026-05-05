package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: Checkbox.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d̉=!,o\bDJd|\u0004W\u00068\u000b4E\u0007\":\u0012\u007fјnjG9L͜P.hS2şs{J$c$wCCU0}*ޛWN}gvJ`\fK\u000f\u001c\u0016\u0001j2K]xs\u0012\u00172HoG3coEʠhtL\u0005(2(8\u0002\u0005\u000f\u001f2H\u0016}\u0003Ca\f\u001a0FqR&\u001bU\u001d\u001a@\u000fn$\u000f(tg|Ax~kFG1\u0013kRNUj@~]\rt]=\f%nN1F7C#=S1\u0016\u0003aE\u0003M\u0002U\u0005\u00172W1OseGp\u007fB'[W\u0013]\u00019t\u0007g_:;qTӍOP\u001c=\u0010&\n#T\u0004<\u000fWL<=2f6\u0019cx\u0001jXP0vr\u0004\toN\u0017S\u000fc/G,~Q\u0010M_OѼ\u007f\u0005\u001b7;N|;sT<iE\u001fb\u0013i1\u007fXmT\\&qE}\u0006\u0001b03\u001a/u\u001d_\u0002\u0017.%3O[g2Qq\bHRw\u000f\u0005\u000fs\u0004oXHN3\u0007\u0016e<9\u0014`Dr\u0018\u0004RjWZ%\u0014!Τ\u000b}\u001618\u0011\u0006[9%>Wwh\u0018\u000b}a\u0018FGfe{\u001fo\u001czQ^aW\u0002g\u001e\u0006jvBdlf\u0013~~B\u00021!\\Ξ!õʮn\u0012}#Rv$O@h\n\u001cb5Y\u0019\u000b5x\u0007,lY|7\u0002\u000bl\u001e*l3R(\u001a(\u00035\u0019P\u000b\u0016 k\u0007vD|\u000fG]E_c1&\u0004Q/4ţ\"Ȕҋw\u0002M\u0018Zxlx$߯m{N\u0015pߜ$ȠA\u0013\u0017ȯI>\u0010-]L!d(˪dؠ~|\u0002Ҹ[t<h j\u001f+7ʇ\u001dׅX\u0017*Ԯ~\u00011\n|\u007f(d\u001dڬIϭX\rc>Wv#gJSP|3\"tݕ\u0003Ȟ&~=-Q+=$\u0006\u001aG\u0015\u0010`@۳0ԃf\u0011.ts\bLq$vzQ\f5\u0012ͲK˕\u0003@*$z\u0007ܬHo\u007f\u000bHިP;2ȎE\u0017"}, d2 = {"\u0010ng\u0016a\u000bN`\u0015\u000e~h5", "", "\u0010ng\u001ch;\u001dc&z\nb6\u0006", "\u0011gT0^\bGW!z\nb6\u0006g?r{7\u007fJ\n", "\u0011gT0^)Hfw~{Z<\u0004\u0018\u001aa~'\u007fI\u0003", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u0011gT0^)Hf\u0007\u0003\u0010^", " `S6h:,W.~", "!sa<^,0W\u0018\u000e}", "\u0011gT0^)Hf", "", "1gT0^,=", "", "=m25X*DS\u0018\\}Z5~\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "3mP/_,=", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T(5W\u0004\u001dA\u0001s8TMHy\n", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!gOtJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\t\b%\u000eBnlI$Y%|\u0015sG&rY7i\u0001QNS8\u0011`\u0015^*f>97]o##sZ<\nET\u001b\u0003[xcvK#\u0004\u0002(G|[SAmd@~0h3\f\u0007\u000e/_t\u000f}<\u0004A&4s\tUp\u0006Hn\u0006\u0013,2(#/5I\u001dCJv?jH\u0016s)o\bWoE:(imc\u0012l\u0011e\"eCalV\u001b6I/", "\u0011gT0^)Hf|\u0007\u0006e", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f&\u0013VoW+\u0001'7`}\u001c4t\u0016\u001c\\?Jk\n", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`%Vk\u001d<@\u0014?[\u007f'7i\u00135M1JgC\u001ejO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W65\f\tZE${\u001a\u001e\u001b\u0011+V\f?g\u0014U\u0014\u0018=uzPVYOu$uN-dM')WJACh'n\u001f='cDG2iX\u0015$g]8\u000ezfZp\\\u0002rqU\u0019DE4G|_NE93F|2)Y{\u0005g\u0016\u001ce", "\"qX g(MSv\u0002z\\2y\u0013B", "AsPAX", "=m29\\*D", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%&C~\u000e\u0006e/7[\u0005 3j\u001d.;R7z4s{nkH\u000eg5\u0018{8O\u0016O<eP\u0002A\u001e\u001bhW/;\u0016\u0003hE.w\u000f\r\u0006\u00045H\u000fEl\u007f\u001f_\f?r{Ld\u0010\u0011\n\u0019?)3gJZcyT\u0017:I&m\u000bl'`9Mm\u0012{!&r^.S\u0004O r_}cn\u0015bX;$<sXPXM_C~4-!bs\u001b1e~/s@M24>o\u000fYga?h\t\u001e+XP+0?\u0006\u0017HZc\u0003h<\u001dl)jQurD-\u0016leGQ\u001e\u0007j\u0013YDei\n%\\\u0016KGoj\u000eB\bAh\u0004\u0019\b\u001amkoQN%b\u0001c}T+n\u0015\u000b\u00030u&6!Gg\u000fu\u007fC\u001b\u0011\u0004", "2qPD56Q", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "0ng\u0010b3H`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "0na1X9\u001c] \t\b", "@`S6h:", "", "Asa<^,0W\u0018\u000e}", "2qPD56Q\u001bd\u0011\u0001;\bd\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u00023[\b(\u0010?", "2qPD6/>Q\u001f", "1gT0^\nHZ#\f", "1gT0^\rKO\u0017\u000e~h5", "1q^@f\n>\\(~\b@9x\u001a3t{7\u007fJ\n", "Asa<^,0W\u0018\u000e}I?", "2qPD\\5@1\u0015|}^", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T(5W\u0004~Di(2VE\u0019g2!\u0015>", "2qPD6/>Q\u001fFHB.|p+k", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~X\u000b\u001cI{\u00148XC\u0005JA\u001a'V_C\u0012c\u00023W\b(3J5[_|A\u0013%$\fX3\u0018\u000fgAmv@F\u001f\u00150E\t\t2^\u000f\u0016\f;I}>h\u0014P{rq?,h\u001c\u001dP", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CheckboxKt {
    private static final int BoxInDuration = 50;
    private static final int BoxOutDuration = 100;
    private static final int CheckAnimationDuration = 100;
    private static final float CheckboxDefaultPadding;
    private static final float CheckboxSize = Dp.m6638constructorimpl(20);
    private static final float RadiusSize;
    private static final float StrokeWidth;

    /* JADX INFO: renamed from: androidx.compose.material3.CheckboxKt$Checkbox$2 */
    /* JADX INFO: compiled from: Checkbox.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $checked;
        final /* synthetic */ CheckboxColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(boolean z2, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z3, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i2, int i3) {
            super(2);
            z = z2;
            function1 = function1;
            modifier = modifier;
            z = z3;
            checkboxColors = checkboxColors;
            mutableInteractionSource = mutableInteractionSource;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            CheckboxKt.Checkbox(z, function1, modifier, z, checkboxColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.CheckboxKt$CheckboxImpl$2 */
    /* JADX INFO: compiled from: Checkbox.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06122 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CheckboxColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ ToggleableState $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06122(boolean z2, ToggleableState toggleableState, Modifier modifier, CheckboxColors checkboxColors, int i2) {
            super(2);
            z = z2;
            toggleableState = toggleableState;
            modifier = modifier;
            checkboxColors = checkboxColors;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            boolean z2 = z;
            ToggleableState toggleableState = toggleableState;
            Modifier modifier = modifier;
            CheckboxColors checkboxColors = checkboxColors;
            int i3 = i;
            CheckboxKt.CheckboxImpl(z2, toggleableState, modifier, checkboxColors, composer, RecomposeScopeImplKt.updateChangedFlags((i3 + 1) - (i3 & 1)));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.CheckboxKt$TriStateCheckbox$1 */
    /* JADX INFO: compiled from: Checkbox.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CheckboxColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function0<Unit> function0, Modifier modifier, boolean z2, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, int i2, int i3) {
            super(2);
            function0 = function0;
            modifier = modifier;
            z = z2;
            checkboxColors = checkboxColors;
            mutableInteractionSource = mutableInteractionSource;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            CheckboxKt.TriStateCheckbox(toggleableState, function0, modifier, z, checkboxColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    /* JADX INFO: compiled from: Checkbox.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void Checkbox(final boolean z2, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z3, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3) {
        int i4;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        CheckboxColors checkboxColorsColors = checkboxColors;
        boolean z4 = z3;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1406741137);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Checkbox)P(!1,5,4,2)96@4296L8,99@4370L356:Checkbox.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 256 : 128;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = (i3 + 8) - (i3 | 8);
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 3072));
        } else if ((i2 & 3072) == 0) {
            int i8 = composerStartRestartGroup.changed(z4) ? 2048 : 1024;
            i4 = (i4 + i8) - (i4 & i8);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 + 16) - (i3 | 16) == 0 && composerStartRestartGroup.changed(checkboxColorsColors)) ? 16384 : 8192)));
        }
        int i9 = (-1) - (((-1) - i3) | ((-1) - 32));
        if (i9 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536)));
        }
        if ((74899 + i4) - (74899 | i4) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            Function0 function0 = null;
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    z4 = true;
                }
                if ((i3 & 16) != 0) {
                    checkboxColorsColors = CheckboxDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                if (i9 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 16) != 0) {
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1406741137, i4, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:98)");
            }
            ToggleableState ToggleableState = ToggleableStateKt.ToggleableState(z2);
            composerStartRestartGroup.startReplaceGroup(1046936362);
            ComposerKt.sourceInformation(composerStartRestartGroup, "103@4507L29");
            if (function1 != null) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1046937763, "CC(remember):Checkbox.kt#9igjgp");
                int i10 = (112 & i4) == 32 ? 1 : 0;
                int i11 = (i4 + 14) - (14 | i4) != 4 ? 0 : 1;
                int i12 = (i10 + i11) - (i10 & i11);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i12 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.CheckboxKt$Checkbox$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function1.invoke(Boolean.valueOf(!z2));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function0 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function02 = function0;
            TriStateCheckbox(ToggleableState, function02, companion, z4, checkboxColorsColors, mutableInteractionSource2, composerStartRestartGroup, i4 & 524160, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CheckboxKt.Checkbox.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ boolean $checked;
                final /* synthetic */ CheckboxColors $colors;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(final boolean z22, final Function1<? super Boolean, Unit> function12, Modifier companion2, boolean z42, CheckboxColors checkboxColorsColors2, MutableInteractionSource mutableInteractionSource22, int i22, int i32) {
                    super(2);
                    z = z22;
                    function1 = function12;
                    modifier = companion2;
                    z = z42;
                    checkboxColors = checkboxColorsColors2;
                    mutableInteractionSource = mutableInteractionSource22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    CheckboxKt.Checkbox(z, function1, modifier, z, checkboxColors, mutableInteractionSource, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
                }
            });
        }
    }

    public static final void TriStateCheckbox(ToggleableState toggleableState, Function0<Unit> function0, Modifier modifier, boolean z2, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3) {
        int i4;
        Modifier.Companion companionM1278triStateToggleableO2vRcR0;
        Modifier.Companion companionMinimumInteractiveComponentSize;
        Modifier.Companion companion = modifier;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        boolean z3 = z2;
        CheckboxColors checkboxColorsColors = checkboxColors;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1608358065);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TriStateCheckbox)P(5,4,3,1)149@6731L8,169@7373L460:Checkbox.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i5 = composerStartRestartGroup.changed(toggleableState) ? 4 : 2;
            i4 = (i5 + i2) - (i5 & i2);
        } else {
            i4 = i2;
        }
        if ((i3 + 2) - (i3 | 2) != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i7 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 |= composerStartRestartGroup.changed(companion) ? 256 : 128;
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(z3) ? 2048 : 1024)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (((i3 & 16) == 0 && composerStartRestartGroup.changed(checkboxColorsColors)) ? 16384 : 8192)));
        }
        int i9 = i3 & 32;
        if (i9 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource2) ? 131072 : 65536)));
        }
        if ((74899 & i4) != 74898 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    companion = Modifier.Companion;
                }
                if (i8 != 0) {
                    z3 = true;
                }
                if ((i3 + 16) - (i3 | 16) != 0) {
                    checkboxColorsColors = CheckboxDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                    i4 = (i4 - 57345) - (i4 | (-57345));
                }
                if (i9 != 0) {
                    mutableInteractionSource2 = null;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 16) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-57345)));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1608358065, i4, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:151)");
            }
            composerStartRestartGroup.startReplaceGroup(-97239746);
            ComposerKt.sourceInformation(composerStartRestartGroup, "161@7145L161");
            if (function0 != null) {
                companionM1278triStateToggleableO2vRcR0 = ToggleableKt.m1278triStateToggleableO2vRcR0(Modifier.Companion, toggleableState, mutableInteractionSource2, RippleKt.m2425rippleOrFallbackImplementation9IZ8Weo(false, Dp.m6638constructorimpl(CheckboxTokens.INSTANCE.m3047getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4), z3, Role.m5926boximpl(Role.Companion.m5934getCheckboxo7Vup1c()), function0);
            } else {
                companionM1278triStateToggleableO2vRcR0 = Modifier.Companion;
            }
            composerStartRestartGroup.endReplaceGroup();
            if (function0 != null) {
                companionMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion);
            } else {
                companionMinimumInteractiveComponentSize = Modifier.Companion;
            }
            int i10 = i4 << 3;
            int i11 = i4 >> 3;
            CheckboxImpl(z3, toggleableState, PaddingKt.m1018padding3ABfNKs(companion.then(companionMinimumInteractiveComponentSize).then(companionM1278triStateToggleableO2vRcR0), CheckboxDefaultPadding), checkboxColorsColors, composerStartRestartGroup, ((-1) - (((-1) - ((i4 >> 9) & 14)) & ((-1) - ((i10 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i10 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))))) | ((i11 + 7168) - (i11 | 7168)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CheckboxKt.TriStateCheckbox.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ CheckboxColors $colors;
                final /* synthetic */ boolean $enabled;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ Modifier $modifier;
                final /* synthetic */ Function0<Unit> $onClick;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Function0<Unit> function02, Modifier companion2, boolean z32, CheckboxColors checkboxColorsColors2, MutableInteractionSource mutableInteractionSource22, int i22, int i32) {
                    super(2);
                    function0 = function02;
                    modifier = companion2;
                    z = z32;
                    checkboxColors = checkboxColorsColors2;
                    mutableInteractionSource = mutableInteractionSource22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    CheckboxKt.TriStateCheckbox(toggleableState, function0, modifier, z, checkboxColors, mutableInteractionSource, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x031e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CheckboxImpl(boolean r22, androidx.compose.ui.state.ToggleableState r23, androidx.compose.ui.Modifier r24, androidx.compose.material3.CheckboxColors r25, androidx.compose.runtime.Composer r26, int r27) {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.CheckboxImpl(boolean, androidx.compose.ui.state.ToggleableState, androidx.compose.ui.Modifier, androidx.compose.material3.CheckboxColors, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: renamed from: drawBox-1wkBAMs */
    public static final void m1869drawBox1wkBAMs(DrawScope drawScope, long j2, long j3, float f2, float f3) {
        float f4 = f3 / 2.0f;
        Stroke stroke = new Stroke(f3, 0.0f, 0, 0, null, 30, null);
        float fM4006getWidthimpl = Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc());
        if (Color.m4179equalsimpl0(j2, j3)) {
            DrawScope.m4730drawRoundRectuAw5IA$default(drawScope, j2, 0L, SizeKt.Size(fM4006getWidthimpl, fM4006getWidthimpl), CornerRadiusKt.CornerRadius$default(f2, 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 226, null);
            return;
        }
        float f5 = fM4006getWidthimpl - (2 * f3);
        DrawScope.m4730drawRoundRectuAw5IA$default(drawScope, j2, OffsetKt.Offset(f3, f3), SizeKt.Size(f5, f5), CornerRadiusKt.CornerRadius$default(Math.max(0.0f, f2 - f3), 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY, null);
        float f6 = fM4006getWidthimpl - f3;
        DrawScope.m4730drawRoundRectuAw5IA$default(drawScope, j3, OffsetKt.Offset(f4, f4), SizeKt.Size(f6, f6), CornerRadiusKt.CornerRadius$default(f2 - f4, 0.0f, 2, null), stroke, 0.0f, null, 0, CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY, null);
    }

    /* JADX INFO: renamed from: drawCheck-3IgeMak */
    public static final void m1870drawCheck3IgeMak(DrawScope drawScope, long j2, float f2, float f3, float f4, CheckDrawingCache checkDrawingCache) {
        Stroke stroke = new Stroke(f4, 0.0f, StrokeCap.Companion.m4533getSquareKaPHkGw(), 0, null, 26, null);
        float fM4006getWidthimpl = Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc());
        float fLerp = MathHelpersKt.lerp(0.4f, 0.5f, f3);
        float fLerp2 = MathHelpersKt.lerp(0.7f, 0.5f, f3);
        float fLerp3 = MathHelpersKt.lerp(0.5f, 0.5f, f3);
        float fLerp4 = MathHelpersKt.lerp(0.3f, 0.5f, f3);
        checkDrawingCache.getCheckPath().reset();
        checkDrawingCache.getCheckPath().moveTo(0.2f * fM4006getWidthimpl, fLerp3 * fM4006getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(fLerp * fM4006getWidthimpl, fLerp2 * fM4006getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(0.8f * fM4006getWidthimpl, fM4006getWidthimpl * fLerp4);
        checkDrawingCache.getPathMeasure().setPath(checkDrawingCache.getCheckPath(), false);
        checkDrawingCache.getPathToDraw().reset();
        checkDrawingCache.getPathMeasure().getSegment(0.0f, checkDrawingCache.getPathMeasure().getLength() * f2, checkDrawingCache.getPathToDraw(), true);
        DrawScope.m4724drawPathLG529CI$default(drawScope, checkDrawingCache.getPathToDraw(), j2, 0.0f, stroke, null, 0, 52, null);
    }

    static {
        float f2 = 2;
        CheckboxDefaultPadding = Dp.m6638constructorimpl(f2);
        StrokeWidth = Dp.m6638constructorimpl(f2);
        RadiusSize = Dp.m6638constructorimpl(f2);
    }
}
