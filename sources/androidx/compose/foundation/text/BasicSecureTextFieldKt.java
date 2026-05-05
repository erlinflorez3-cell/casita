package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.InputTransformationKt;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextObfuscationMode;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: BasicSecureTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0001\u001d̉=!,s\bӵLc\u0003\u000bIي8\u000b<B\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS8\u0018sڔ<$q$yّCU0}*ޛWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]xs\u0012\u00172XoG3coE9vt>\u0005&2*8\u0010\u0005\tɝ2H&v\u0003ŏS\f(0H\u0081BR#M\r܅\u001a\u0006T \t\u001ebjV6^le:5%\u001bގA\\)w0+P=Jb+%v\u0010#[F=5#+k\u00035Y\fE\t?\u007fE\u001dhU0[QyWDb\u0018\u0016+*}\u0018\u000ex,\\\u0013]x\fU8\u007fiQP\u001c6\u0010z*\u001cl\f\u0014\u00065XF/0e6\u001fc+xSNb\u001a\u000fR\u0002\u000bad+5\u0019CBI\u001fvSw:Gde\u0011˿\u0011()\u0018~'al\u001eb\u001b!z\u0011a3a@kKd\t\bPъ\bph\u001cZ\f6G\u000eJ\u0014\u0013D\u0016SS\f?)!y\u001f`D\u0016\u00155hnSwq`B8mDWZ\u000f\u0012ZR\u0006\u001dk~v\t2\u0017M*w\u001f}6\u0012fa˵;ƙٚ\u0014PU\rw\u0010e{\u0018KGfe\\\u001fz\u001c~QiC7ac>d\u0001\f݀C<h-\u001fg͞W\fh\u0006@:@r\u0003\u0012\u000ezrY4\u0015H> 'd2?Dt\u0017^\u0002LM\b|)khӐ(~\u00032zѳ<˨x\t\tˆ||}g\u0011IZ}7ø\u007fۮU5!ğš\"m<\u007f)ȶ\u001b\"~ġkx"}, d2 = {"\u0012dU.h3M=\u0016\u007f\u000bl*x\u00183o\t\u0006~<\u000e\u0013\u0015Vo\u001b", "", "\u001a@B!R\u001b2>x]t<\u000fXu\u000bCn\bh:mv\b'Kt6U\u0015\"5l\u0004!V\u0010\u00161*\"O\"", "", "\u0010`b6V\u001a>Q)\fzM,\u0010\u0018\u0010i\u007f/z", "", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006Q;J\u0006'\u001d", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "3mP/_,=", "", "7m_Bg\u001bKO\"\r{h9\u0005\u0005>i\n1", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r\u001ft?.$Wn5\u0010q-X\u0004/C[R6e(", "BdgAF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "9dh/b(KR\u0003\n\nb6\u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u001e)$lkB\u00159", "=m:2l)HO&}V\\;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r!kH\u001b\u001fdn8ba;R\u00010*HW+cR\u007f\u0013", "=mC2k;%O-\t\u000bm", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "5dc\u001fX:NZ(", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "1ta@b9\u001b`)\r}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "2dR<e(M]&", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-ula@\u0006B,L\u00014C[X92", "BdgAB)?c'|vm0\u0007\u0012\u0017o~(", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r*kG-~ebI\u0015a(]z1P4X+\\(", "BdgAB)?c'|vm0\u0007\u0012\rh{5w>\u0010\u0017$", "\u0010`b6V\u001a>Q)\fzM,\u0010\u0018\u0010i\u007f/z\be\u0014jDWlB", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001q\u001f9]R\u0005Z41$Ie9\u000eb\u001a]r6G\"5(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8T;ho6H\u0006<l\u0001\u0019k\u0003\u001cfyAc\u001aKx(??3pQcmy\u0011BOr3c\bn!fC\u00043\u0014\u0005(dlY9\u001a\u000b\u001dt{]\nvVT\u0015\u0004F%HzcBTs_EJ\u000e\u001bTz\u0005\u001c6W\btr7\f?4DdN[kaM^\f$uKA:5$K'FK9\\hG\ru)e\u0007!,3;!poqHX\bg'd4]n\u0005A[OMI\u0003$p,~VX\u0004\u0011\u0016\u0006\u000extMM$bV\u0001lM!l\u001b\u0007\u0002ya\u001a8\u001eHc\u001dhs`A]\u001c\bdG\u0010\u0006b\r$p[\u001f7O{fg~m\u001cx%F+/X;RPRs\u001a\u001f\u0017|\u0014}$sv\u0018`<\u001d4,Ab\u0002gq7Thc+\u0017v<&(;zbbIlm{1\u001eJcOx\u001e\\KB\u00062T\u0013h,DnU\u0013<$S\u001a<V\u0014+ox K%w>Yn\u001b{\u0002:|\u001d%u\u000e\u0006V\u001bd\"/J\u0015\u001b\n|\u0019-*\u0005bW\u0004W#{FHodW8\u0004\u001d,Jg(\u0016~3KEXVvhC\fGV\u0013.c:}aHD}.Q \t]7\u0003(D(e\u001ax\u000b6L9i\\,\u001at @ ^D\u00144/\u001e\u000b^\u000f\u0005k\u0016c.\u000e\n7&\u000b\u0003]r\"K\u0015^u$0U,gQti\u0006+Ia\f1d\u0017>ou.\nfy<r\\\f\u001b5G1DSL[-DU'FRf65.\u0012KPna\u001aV`\u000e", "\u0012hb.U3>1)\u000eXh7\u0011", "1n]AX5M", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001pHJ", "BgT;", "<dgA", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BasicSecureTextFieldKt {
    private static final char DefaultObfuscationCharacter = 8226;
    private static final long LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS = 1500;

    /* JADX INFO: renamed from: BasicSecureTextField-Jb9bMDk, reason: not valid java name */
    public static final void m1306BasicSecureTextFieldJb9bMDk(TextFieldState textFieldState, Modifier modifier, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, MutableInteractionSource mutableInteractionSource, Brush brush, TextFieldDecorator textFieldDecorator, int i2, char c2, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        TextFieldDecorator textFieldDecorator2;
        SolidColor solidColor = brush;
        final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function22 = function2;
        int iM1468getRevealLastTypedvTwcZD0 = i2;
        final KeyboardActionHandler keyboardActionHandler2 = keyboardActionHandler;
        KeyboardOptions secureTextField$foundation_release = keyboardOptions;
        TextStyle textStyle2 = textStyle;
        final InputTransformation inputTransformation2 = inputTransformation;
        boolean z3 = z2;
        char c3 = c2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1399310985);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicSecureTextField)P(9,6,2,3,12,5,7,8,4!2,11:c#foundation.text.input.TextObfuscationMode)131@7694L46,132@7777L60,133@7884L130,133@7842L172,144@8392L129,144@8353L168,150@8557L384,176@9335L825,176@9320L840:BasicSecureTextField.kt#423gt5");
        final TextFieldState textFieldState2 = textFieldState;
        if ((i5 + 1) - (i5 | 1) != 0) {
            i6 = (-1) - (((-1) - i3) & ((-1) - 6));
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            i6 = (-1) - (((-1) - (composerStartRestartGroup.changed(textFieldState2) ? 4 : 2)) & ((-1) - i3));
        } else {
            i6 = i3;
        }
        int i8 = (-1) - (((-1) - i5) | ((-1) - 2));
        if (i8 != 0) {
            i6 |= 48;
        } else if ((i3 + 48) - (i3 | 48) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(companion) ? 32 : 16)));
        }
        int i9 = (i5 + 4) - (i5 | 4);
        if (i9 != 0) {
            i6 = (i6 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i6 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(z3) ? 256 : 128)));
        }
        int i10 = (i5 + 8) - (i5 | 8);
        if (i10 != 0) {
            i6 |= 3072;
        } else if ((-1) - (((-1) - i3) | ((-1) - 3072)) == 0) {
            i6 |= composerStartRestartGroup.changed(inputTransformation2) ? 2048 : 1024;
        }
        int i11 = (-1) - (((-1) - i5) | ((-1) - 16));
        if (i11 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 24576));
        } else if ((i3 + 24576) - (i3 | 24576) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(textStyle2) ? 16384 : 8192)));
        }
        int i12 = (-1) - (((-1) - i5) | ((-1) - 32));
        if (i12 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((-1) - (((-1) - i3) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(secureTextField$foundation_release) ? 131072 : 65536)));
        }
        int i13 = i5 & 64;
        if (i13 != 0) {
            i6 = (i6 + 1572864) - (i6 & 1572864);
        } else if ((i3 + 1572864) - (i3 | 1572864) == 0) {
            int i14 = composerStartRestartGroup.changed(keyboardActionHandler2) ? 1048576 : 524288;
            i6 = (i6 + i14) - (i6 & i14);
        }
        int i15 = (-1) - (((-1) - i5) | ((-1) - 128));
        if (i15 != 0) {
            i6 = (i6 + 12582912) - (i6 & 12582912);
        } else if ((i3 & 12582912) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304)));
        }
        int i16 = (i5 + 256) - (i5 | 256);
        if (i16 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 100663296));
        } else if ((i3 + 100663296) - (i3 | 100663296) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(mutableInteractionSource2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        int i17 = (i5 + 512) - (i5 | 512);
        if (i17 != 0) {
            i6 |= 805306368;
        } else if ((i3 & 805306368) == 0) {
            i6 |= composerStartRestartGroup.changed(solidColor) ? 536870912 : 268435456;
        }
        int i18 = (-1) - (((-1) - i5) | ((-1) - 1024));
        if (i18 != 0) {
            i7 = (-1) - (((-1) - i4) & ((-1) - 6));
        } else if ((i4 + 6) - (i4 | 6) == 0) {
            i7 = i4 | ((i4 & 8) == 0 ? composerStartRestartGroup.changed(textFieldDecorator) : composerStartRestartGroup.changedInstance(textFieldDecorator) ? 4 : 2);
        } else {
            i7 = i4;
        }
        int i19 = i5 & 2048;
        if (i19 != 0) {
            i7 = (i7 + 48) - (i7 & 48);
        } else if ((i4 + 48) - (i4 | 48) == 0) {
            int i20 = composerStartRestartGroup.changed(iM1468getRevealLastTypedvTwcZD0) ? 32 : 16;
            i7 = (i7 + i20) - (i7 & i20);
        }
        int i21 = (-1) - (((-1) - i5) | ((-1) - 4096));
        if (i21 != 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i7 = (-1) - (((-1) - i7) & ((-1) - (composerStartRestartGroup.changed(c3) ? 256 : 128)));
        }
        if ((-1) - (((-1) - i6) | ((-1) - 306783379)) == 306783378 && (i7 + 147) - (147 | i7) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            textFieldDecorator2 = textFieldDecorator;
        } else {
            if (i8 != 0) {
                companion = Modifier.Companion;
            }
            if (i9 != 0) {
                z3 = true;
            }
            if (i10 != 0) {
                inputTransformation2 = null;
            }
            if (i11 != 0) {
                textStyle2 = TextStyle.Companion.getDefault();
            }
            if (i12 != 0) {
                secureTextField$foundation_release = KeyboardOptions.Companion.getSecureTextField$foundation_release();
            }
            if (i13 != 0) {
                keyboardActionHandler2 = null;
            }
            if (i15 != 0) {
                function22 = null;
            }
            if (i16 != 0) {
                mutableInteractionSource2 = null;
            }
            if (i17 != 0) {
                solidColor = new SolidColor(Color.Companion.m4204getBlack0d7_KjU(), null);
            }
            textFieldDecorator2 = i18 == 0 ? textFieldDecorator : null;
            if (i19 != 0) {
                iM1468getRevealLastTypedvTwcZD0 = TextObfuscationMode.Companion.m1468getRevealLastTypedvTwcZD0();
            }
            if (i21 != 0) {
                c3 = 8226;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1399310985, i6, i7, "androidx.compose.foundation.text.BasicSecureTextField (BasicSecureTextField.kt:130)");
            }
            int i22 = i7 >> 6;
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Character.valueOf(c3), composerStartRestartGroup, (i22 + 14) - (i22 | 14));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 120982059, "CC(remember):BasicSecureTextField.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new SecureTextFieldController(stateRememberUpdatedState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SecureTextFieldController secureTextFieldController = (SecureTextFieldController) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 120985553, "CC(remember):BasicSecureTextField.kt#9igjgp");
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(secureTextFieldController);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function2) new BasicSecureTextFieldKt$BasicSecureTextField$1$1(secureTextFieldController, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.LaunchedEffect(secureTextFieldController, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            final boolean zM1463equalsimpl0 = TextObfuscationMode.m1463equalsimpl0(iM1468getRevealLastTypedvTwcZD0, TextObfuscationMode.Companion.m1468getRevealLastTypedvTwcZD0());
            Boolean boolValueOf = Boolean.valueOf(zM1463equalsimpl0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 121001808, "CC(remember):BasicSecureTextField.kt#9igjgp");
            boolean z4 = (-1) - (((-1) - (composerStartRestartGroup.changed(zM1463equalsimpl0) ? 1 : 0)) & ((-1) - (composerStartRestartGroup.changedInstance(secureTextFieldController) ? 1 : 0))) == 1;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (Function2) new BasicSecureTextFieldKt$BasicSecureTextField$2$1(zM1463equalsimpl0, secureTextFieldController, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 121007343, "CC(remember):BasicSecureTextField.kt#9igjgp");
            boolean z5 = (i7 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i7 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) == 32;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = TextObfuscationMode.m1463equalsimpl0(iM1468getRevealLastTypedvTwcZD0, TextObfuscationMode.Companion.m1468getRevealLastTypedvTwcZD0()) ? secureTextFieldController.getCodepointTransformation() : TextObfuscationMode.m1463equalsimpl0(iM1468getRevealLastTypedvTwcZD0, TextObfuscationMode.Companion.m1467getHiddenvTwcZD0()) ? new CodepointTransformation() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$$ExternalSyntheticLambda0
                    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
                    public final int transform(int i23, int i24) {
                        return BasicSecureTextFieldKt.BasicSecureTextField_Jb9bMDk$lambda$4$lambda$3(stateRememberUpdatedState, i23, i24);
                    }
                } : null;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final CodepointTransformation codepointTransformation = (CodepointTransformation) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Modifier modifierThen = SemanticsModifierKt.semantics(companion, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                    SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return false;
                        }
                    }, 1, null);
                    SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$secureTextFieldModifier$1.2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return false;
                        }
                    }, 1, null);
                }
            }).then(zM1463equalsimpl0 ? secureTextFieldController.getFocusChangeModifier() : Modifier.Companion);
            textFieldState2 = textFieldState2;
            final boolean z6 = z3;
            inputTransformation2 = inputTransformation2;
            final TextStyle textStyle3 = textStyle2;
            final KeyboardOptions keyboardOptions2 = secureTextField$foundation_release;
            keyboardActionHandler2 = keyboardActionHandler2;
            function22 = function22;
            mutableInteractionSource2 = mutableInteractionSource2;
            final Brush brush2 = solidColor;
            final TextFieldDecorator textFieldDecorator3 = textFieldDecorator2;
            DisableCutCopy(ComposableLambdaKt.rememberComposableLambda(2023988909, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$3
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

                public final void invoke(Composer composer2, int i23) {
                    InputTransformation inputTransformationThen;
                    ComposerKt.sourceInformation(composer2, "C177@9345L809:BasicSecureTextField.kt#423gt5");
                    if ((i23 + 3) - (3 | i23) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2023988909, i23, -1, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)");
                        }
                        TextFieldState textFieldState3 = textFieldState2;
                        Modifier modifier2 = modifierThen;
                        boolean z7 = z6;
                        if (zM1463equalsimpl0) {
                            inputTransformationThen = BasicSecureTextFieldKt.then(inputTransformation2, secureTextFieldController.getPasswordInputTransformation());
                        } else {
                            inputTransformationThen = inputTransformation2;
                        }
                        BasicTextFieldKt.BasicTextField(textFieldState3, modifier2, z7, false, inputTransformationThen, textStyle3, keyboardOptions2, keyboardActionHandler2, TextFieldLineLimits.SingleLine.INSTANCE, function22, mutableInteractionSource2, brush2, codepointTransformation, null, textFieldDecorator3, null, true, composer2, 100666368, 1572864, ExifDirectoryBase.TAG_FLASHPIX_VERSION);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final TextFieldState textFieldState3 = textFieldState2;
            final Modifier modifier2 = companion;
            final boolean z7 = z3;
            final InputTransformation inputTransformation3 = inputTransformation2;
            final TextStyle textStyle4 = textStyle2;
            final KeyboardOptions keyboardOptions3 = secureTextField$foundation_release;
            final KeyboardActionHandler keyboardActionHandler3 = keyboardActionHandler2;
            final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function23 = function22;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
            final Brush brush3 = solidColor;
            final TextFieldDecorator textFieldDecorator4 = textFieldDecorator2;
            final int i23 = iM1468getRevealLastTypedvTwcZD0;
            final char c4 = c3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$4
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
                    BasicSecureTextFieldKt.m1306BasicSecureTextFieldJb9bMDk(textFieldState3, modifier2, z7, inputTransformation3, textStyle4, keyboardOptions3, keyboardActionHandler3, function23, mutableInteractionSource3, brush3, textFieldDecorator4, i23, c4, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BasicSecureTextField_Jb9bMDk$lambda$4$lambda$3(State state, int i2, int i3) {
        return ((Character) state.getValue()).charValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputTransformation then(InputTransformation inputTransformation, InputTransformation inputTransformation2) {
        return inputTransformation == null ? inputTransformation2 : inputTransformation2 == null ? inputTransformation : InputTransformationKt.then(inputTransformation, inputTransformation2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisableCutCopy(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1085555050);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DisableCutCopy)311@13911L7,312@13949L680,331@14706L361,331@14634L433:BasicSecureTextField.kt#423gt5");
        if ((6 & i2) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 + 3) - (3 | i3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1085555050, i3, -1, "androidx.compose.foundation.text.DisableCutCopy (BasicSecureTextField.kt:310)");
            }
            ProvidableCompositionLocal<TextToolbar> localTextToolbar = CompositionLocalsKt.getLocalTextToolbar();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localTextToolbar);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final TextToolbar textToolbar = (TextToolbar) objConsume;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1202776994, "CC(remember):BasicSecureTextField.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(textToolbar);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new TextToolbar() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1
                    private final /* synthetic */ TextToolbar $$delegate_0;

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public TextToolbarStatus getStatus() {
                        return this.$$delegate_0.getStatus();
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void hide() {
                        this.$$delegate_0.hide();
                    }

                    {
                        this.$$delegate_0 = this.$currentToolbar;
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void showMenu(Rect rect, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
                        this.$currentToolbar.showMenu(rect, null, function02, null, function04);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalTextToolbar().provides((BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1) objRememberedValue), ComposableLambdaKt.rememberComposableLambda(-1448819882, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt.DisableCutCopy.1
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

                public final void invoke(Composer composer2, int i4) {
                    ComposerKt.sourceInformation(composer2, "C332@14716L345:BasicSecureTextField.kt#423gt5");
                    if ((-1) - (((-1) - i4) | ((-1) - 3)) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1448819882, i4, -1, "androidx.compose.foundation.text.DisableCutCopy.<anonymous> (BasicSecureTextField.kt:332)");
                    }
                    Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(Modifier.Companion, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt.DisableCutCopy.1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                            return m1307invokeZmokQxo(keyEvent.m5232unboximpl());
                        }

                        /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
                        public final Boolean m1307invokeZmokQxo(android.view.KeyEvent keyEvent) {
                            KeyCommand keyCommandMo1334mapZmokQxo = KeyMapping_androidKt.getPlatformDefaultKeyMapping().mo1334mapZmokQxo(keyEvent);
                            return Boolean.valueOf(keyCommandMo1334mapZmokQxo == KeyCommand.COPY || keyCommandMo1334mapZmokQxo == KeyCommand.CUT);
                        }
                    });
                    Function2<Composer, Integer, Unit> function22 = function2;
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierOnPreviewKeyEvent);
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
                    Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1177942586, "C338@15042L9:BasicSecureTextField.kt#423gt5");
                    function22.invoke(composer2, 0);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt.DisableCutCopy.2
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

                public final void invoke(Composer composer2, int i4) {
                    BasicSecureTextFieldKt.DisableCutCopy(function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }
}
