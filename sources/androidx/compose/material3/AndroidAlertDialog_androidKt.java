package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: AndroidAlertDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?3Le^.Zݷ2\u000f\u0002{<$a&yCQU\"Ԃ*\teNogtKrƯB\u001dإ.x\u0019+y_\u0007]*\u0015BD\u007f?aL\u001e>io\u00038\u001d+B$Hy3\u007fH+Н\u0014v\u0001F{\u0012\u00180NtRR;R5-\u0018\u0006L&\u0019+li^6vks9]$ɨmBT*\u0010C\u0003M\u001bMl4\u001dxq\u001eY?M4C&٨\u0007\u0007X^o\u0016EqK\r\u000147-Ys\u00065n~B\u0016ۣS\rcuVo\u000bQn\u0015?8_e[P<'\u000ey*\u000eʀ\b\u000e\f*x43\u001at\u0012&3#}\u0004FV\u0002lN\u0018z\u0010CG+\u000639G3f\u007fnk\u001fT7\n\u0014%\u001eQ\u000e\u001f'aT\u001cp-\u001b\u0003\u0005\u00027W@KYf\n\bO\u001e\nvb\u0010=\u001c0u\u0014u\u0001ö-ϏÉ;]?8/\u0002ȸHIoy\u000b½\u0005\u0002hʖLW"}, d2 = {"\u000fkT?g\u000bBO \t|", "", "=m36f4Ba'kzj<|\u0017>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "1n]3\\9F0)\u000e\nh5", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "2hb:\\:L0)\u000e\nh5", "7b^;", "Bhc9X", "BdgA", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "7b^;66Gb\u0019\b\n<6\u0004\u0013<", "Bhc9X\nH\\(~\u0004m\n\u0007\u00109r", "BdgA66Gb\u0019\b\n<6\u0004\u0013<", "Bn]._\fES*z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", ">q^=X9MW\u0019\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006U)1`\b\"\"z 9MPJo4,j", "\u000fkT?g\u000bBO \t|&\u0016\u0001\u001cy1_r", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u0011\u0010_u?itCZ\u0010TO{{K8oJb)~XI\u000fc:m\nn!fCHmt\u0002\"\u0019wT8\u0013H)wx\\\tnkPb\u007fI,\bnkOC~YF}5h,\f\u0001\u0010A\\~4A\u0003j:4Ek\tT1\u001dOfB\u0016<e?6*@E!\t,s~jM\u0012r(.]th?@ in-M \u000f'\u0018k>_n\u0005A[\u0014\b*\u007f\u001e%U\u0003LdFjo\u0003-lrSG\u001agJ\u0018zL-i\u001f\u0003Lv\u001ce0#9d\u0012l(m\u0001;\u0016\u0005s8a`>(yQ/\fvJ\u007fe[n7\u007fv\u001bQ,=Y<@bG9\"\u001a=\u007f\u0015\u0011fRm>\u0001@\u0015\u00102Gd8oo3\u000bu)\t\u0015p7))10\u0015\u001c>xf\u00031#}Wu\r\u001elB@\u0002|\u001fSr-FqK\u0012\u0012>6so>", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidAlertDialog_androidKt {
    /* JADX INFO: renamed from: AlertDialog-Oix01E0, reason: not valid java name */
    public static final void m1778AlertDialogOix01E0(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Shape shape, long j2, long j3, long j4, long j5, float f2, DialogProperties dialogProperties, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        DialogProperties dialogProperties2 = dialogProperties;
        long titleContentColor = j4;
        long iconContentColor = j3;
        long containerColor = j2;
        Shape shape2 = shape;
        float fM1772getTonalElevationD9Ej5fM = f2;
        Function2<? super Composer, ? super Integer, Unit> function27 = function24;
        long textContentColor = j5;
        Modifier.Companion companion = modifier;
        Function2<? super Composer, ? super Integer, Unit> function28 = function22;
        Function2<? super Composer, ? super Integer, Unit> function29 = function23;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2081346864);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AlertDialog)P(6!1,5,2,3,11,9,8,1:c#ui.graphics.Color,4:c#ui.graphics.Color,12:c#ui.graphics.Color,10:c#ui.graphics.Color,13:c#ui.unit.Dp)62@4918L5,62@4973L14,62@5039L16,62@5108L17,62@5177L16,46@1648L513:AndroidAlertDialog.android.kt#uh7d8r");
        Function0<Unit> function02 = function0;
        if ((i4 & 1) != 0) {
            i5 = (i2 + 6) - (i2 & 6);
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i5 = (composerStartRestartGroup.changedInstance(function02) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        Function2<? super Composer, ? super Integer, Unit> function210 = function2;
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function210) ? 32 : 16)));
        }
        int i7 = i4 & 4;
        if (i7 != 0) {
            i5 = (i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 |= composerStartRestartGroup.changed(companion) ? 256 : 128;
        }
        int i8 = (-1) - (((-1) - i4) | ((-1) - 8));
        if (i8 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((i2 & 3072) == 0) {
            int i9 = composerStartRestartGroup.changedInstance(function28) ? 2048 : 1024;
            i5 = (i5 + i9) - (i5 & i9);
        }
        int i10 = (-1) - (((-1) - i4) | ((-1) - 16));
        if (i10 != 0) {
            i5 = (i5 + 24576) - (i5 & 24576);
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function29) ? 16384 : 8192;
        }
        int i11 = i4 & 32;
        if (i11 != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i2 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            int i12 = composerStartRestartGroup.changedInstance(function27) ? 131072 : 65536;
            i5 = (i5 + i12) - (i5 & i12);
        }
        int i13 = (i4 + 64) - (i4 | 64);
        if (i13 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 1572864));
        } else if ((i2 & 1572864) == 0) {
            int i14 = composerStartRestartGroup.changedInstance(function25) ? 1048576 : 524288;
            i5 = (i5 + i14) - (i5 & i14);
        }
        if ((i2 & 12582912) == 0) {
            i5 |= ((i4 & 128) == 0 && composerStartRestartGroup.changed(shape2)) ? 8388608 : 4194304;
        }
        if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 + 256) - (i4 | 256) == 0 && composerStartRestartGroup.changed(containerColor)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((-1) - (((-1) - 805306368) | ((-1) - i2)) == 0) {
            int i15 = ((i4 + 512) - (i4 | 512) == 0 && composerStartRestartGroup.changed(iconContentColor)) ? 536870912 : 268435456;
            i5 = (i5 + i15) - (i5 & i15);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            int i16 = ((i4 & 1024) == 0 && composerStartRestartGroup.changed(titleContentColor)) ? 4 : 2;
            i6 = (i3 + i16) - (i3 & i16);
        } else {
            i6 = i3;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
            i6 |= ((i4 + 2048) - (i4 | 2048) == 0 && composerStartRestartGroup.changed(textContentColor)) ? 32 : 16;
        }
        int i17 = i4 & 4096;
        if (i17 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i18 = composerStartRestartGroup.changed(fM1772getTonalElevationD9Ej5fM) ? 256 : 128;
            i6 = (i6 + i18) - (i6 & i18);
        }
        int i19 = (-1) - (((-1) - i4) | ((-1) - 8192));
        if (i19 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 3072));
        } else if ((i3 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(dialogProperties2) ? 2048 : 1024;
        }
        if ((i5 + 306783379) - (306783379 | i5) == 306783378 && (-1) - (((-1) - i6) | ((-1) - 1171)) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function26 = function25;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i7 != 0) {
                    companion = Modifier.Companion;
                }
                if (i8 != 0) {
                    function28 = null;
                }
                if (i10 != 0) {
                    function29 = null;
                }
                if (i11 != 0) {
                    function27 = null;
                }
                function26 = i13 == 0 ? function25 : null;
                if ((i4 + 128) - (i4 | 128) != 0) {
                    shape2 = AlertDialogDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i5 = (i5 - 29360129) - (i5 | (-29360129));
                }
                if ((i4 & 256) != 0) {
                    containerColor = AlertDialogDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i5 &= -234881025;
                }
                if ((i4 & 512) != 0) {
                    iconContentColor = AlertDialogDefaults.INSTANCE.getIconContentColor(composerStartRestartGroup, 6);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-1879048193)));
                }
                if ((i4 & 1024) != 0) {
                    titleContentColor = AlertDialogDefaults.INSTANCE.getTitleContentColor(composerStartRestartGroup, 6);
                    i6 &= -15;
                }
                if ((i4 + 2048) - (i4 | 2048) != 0) {
                    textContentColor = AlertDialogDefaults.INSTANCE.getTextContentColor(composerStartRestartGroup, 6);
                    i6 &= -113;
                }
                if (i17 != 0) {
                    fM1772getTonalElevationD9Ej5fM = AlertDialogDefaults.INSTANCE.m1772getTonalElevationD9Ej5fM();
                }
                if (i19 != 0) {
                    dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 & 128) != 0) {
                    i5 &= -29360129;
                }
                if ((i4 & 256) != 0) {
                    i5 &= -234881025;
                }
                if ((i4 + 512) - (i4 | 512) != 0) {
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-1879048193)));
                }
                if ((-1) - (((-1) - i4) | ((-1) - 1024)) != 0) {
                    i6 = (-1) - (((-1) - i6) | ((-1) - (-15)));
                }
                if ((i4 + 2048) - (i4 | 2048) != 0) {
                    i6 = (-1) - (((-1) - i6) | ((-1) - (-113)));
                }
                function26 = function25;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2081346864, i5, i6, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:46)");
            }
            function02 = function02;
            function210 = function210;
            function28 = function28;
            AlertDialogKt.m1775AlertDialogImplwrnwzgE(function02, function210, companion, function28, function29, function27, function26, shape2, containerColor, iconContentColor, titleContentColor, textContentColor, fM1772getTonalElevationD9Ej5fM, dialogProperties2, composerStartRestartGroup, i5 & 2147483646, i6 & 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function2<? super Composer, ? super Integer, Unit> function211 = function29;
            final Function2<? super Composer, ? super Integer, Unit> function212 = function27;
            final Shape shape3 = shape2;
            final long j6 = containerColor;
            final long j7 = iconContentColor;
            final long j8 = titleContentColor;
            final long j9 = textContentColor;
            final float f3 = fM1772getTonalElevationD9Ej5fM;
            final DialogProperties dialogProperties3 = dialogProperties2;
            final Function0<Unit> function03 = function02;
            final Function2<? super Composer, ? super Integer, Unit> function213 = function210;
            final Modifier modifier2 = companion;
            final Function2<? super Composer, ? super Integer, Unit> function214 = function28;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
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

                public final void invoke(Composer composer2, int i20) {
                    Function0<Unit> function04 = function03;
                    Function2<Composer, Integer, Unit> function215 = function213;
                    Modifier modifier3 = modifier2;
                    Function2<Composer, Integer, Unit> function216 = function214;
                    Function2<Composer, Integer, Unit> function217 = function211;
                    Function2<Composer, Integer, Unit> function218 = function212;
                    Function2<Composer, Integer, Unit> function219 = function26;
                    Shape shape4 = shape3;
                    long j10 = j6;
                    long j11 = j7;
                    long j12 = j8;
                    long j13 = j9;
                    float f4 = f3;
                    DialogProperties dialogProperties4 = dialogProperties3;
                    int i21 = i2;
                    AndroidAlertDialog_androidKt.m1778AlertDialogOix01E0(function04, function215, modifier3, function216, function217, function218, function219, shape4, j10, j11, j12, j13, f4, dialogProperties4, composer2, RecomposeScopeImplKt.updateChangedFlags((i21 + 1) - (i21 & 1)), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }
}
