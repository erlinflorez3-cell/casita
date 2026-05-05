package androidx.compose.material3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yCAW\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001̓4Ikxe\u0012%2JoU3UoC;htL\u0005(20=\u0002\u0005\u0017\u001a2H\u0016v\u0003CY\u0015\u001a0VpBĥ\u0015M\u001b\u001a\u001a\u0006D!\u0019ɠ[uޮNH\u001b\\j91\u0003\u0002H^)o0+L;G\u0005-\u0013vo C@e8E+Y\u0003\u0015Vs?1D\"C\u000bh5-CI\"^f^\u0006\u0014#3g\r\f{Vb\u000bQn\u0016?+}n{V\u0014(\u0006\u0007\u0014\rj\u000f>\f-H<:2f6\u0015czxSN^\u001a^p\u000b+t<\u00173\u000fK8I\u001dvQ\u0010:/Me|˿\u0011\u001e)\u0011\u001f'aT\u001cq-\u001b\u0003\n\u00027W@K[f\n\bQ\u001e\u001e~w\u001a@\u00142W\u007f]\u0013!0'%eZg9\u074co\u0002NTϼz\u0005f\u0001\u001an˦G̱ؗr\u0018=C\u0017&r\rr \u0004P\u0003W\\\u001b[\u001cl\r\u000e\n# \u000bvj\"U\u0014\\b\u0001i\u0019a\u000e\u001a3K~Cip{\u000e\u0006Wn5EQ\u0012/\u0010o'#MQz\u0010hhRS:Y\u000b)ϒ6Hp >zΌR\f!RW{*UD1G~=H1A\tˆ\u0015\u001bm~\u0001\u0010-v[$1\u000fTx\u0017'h\\\u001f\u0012.x̥,\u0002h%3ۭmc\u0018ňYI\u05ee8\u00101/\u0017~\u0010IwLuK\u001b\u0017\u0091Y{&&pߤ֜/"}, d2 = {"\u001bnS._\tHb(\t\u0003L/|\t>", "", "=m36f4Ba'kzj<|\u0017>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AgT2g\u001aMO(~", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d(5Y\r\u000eFi%.#", "AgT2g\u0014:f\u000b\u0003ym/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n]AX5M1#\u0006\u0005k", "Bn]._\fES*z\nb6\u0006", "Aba6`\nHZ#\f", "2qP4;(GR ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "Eh]1b>\"\\'~\nl", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpG\\", ">q^=X9MW\u0019\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006^/4U\u0005|A|%8U1>k4-\u007fukD\u0007p;Rv5\u001d", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8TSCt\"\u001c\u001fsa\u000f", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u001bnS._\tHb(\t\u0003L/|\t>-~\u001cy\u000f\u0004%!", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJixV\u0017M8\u0017\tXTmlN?*\u0012:IKCd\u0010\f#\u00121q>\fD\u0013Gy$cP%wF/@`CJDo4h\u000brfZDB/\u001e\u007f\u0019dxTw\f\tO\u001cuVwu15\u001cvC$\u0014R@'*V[F\u0004.#TE|#:\"u;}+\u001384?rN,w!<m|\u001f5)\u0017\u000e\"?; IOb\t6<\u0018p*k\u0016\u000e,6;)nd_W\u0013\u0011f`b1ui\u0011F\u001cwBRn\u001f9*\bP[\t#^m vdVM\u001fS\u0014cnN*j\u001b\u0011\u00030 \u0018=\u0016J]\u000bow)\u001fW\u0012\u0005o\u0015\u0016\u000bhM\u001d^K\u0010mZ]haz$C\b\u0015I/\t2B\u0001aJs\u0019_9\u0012\u0013H\u001e\u0004r@\t:\u001d.3\u0007:Hk^>\u000fq\\onN4%\u001e:;\u0006QS8\\\u0002/ \b\u001chF\"mGG\u0006;A\u0013H,DnU\u0013<g(s\u00101X ", "\u001bnS._\tHb(\t\u0003L/|\t>D\u0004$\u0003J\u0003", ">qT1\\*MW*~WZ*\u0003s<o\u00025{N\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\?8r4s", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cuVr6GYR(c <%\u001e\u0011V\u0015+5\u001c\u0014cI\u0012qD7.r9S\r;u\u0010\u0010\u0016\u001c\u000bQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bAk.l\bn!fC\u0004\"\u001e~\u0019dDY2\u0012wb\roYy=NM#\n?(G7`WM9VL}%.O\u0006\u0001 {9\u00054r<\b>3\u0003:kGp\u0017Kh|\u0014?&?1.AF!?\u0015p\u0006uM\u0012p\u001f+e\u0018j@;'er9,Rw", "7r59T.,S\u0017\u000f\b^\f\u0006\u0005,l\u007f'", "", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "Ag^B_+\u001a^$\u0006\u000fL,z\u0019<e`/wB", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006d%3i\u000b \u0018t\u001208MBo22j", "7rB2V<KSy\u0006v`\u001a|\u0018\u0019nj$\t@\n&", ";`c2e0:Zfx\b^3|\u0005=e", "1ta?X5M1#\b\n^5\f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ModalBottomSheet_androidKt {

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecureFlagPolicy.values().length];
            try {
                iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0018Y\u0001tt\u0004#jlY=}d$>\u000esU\u001d/Dk\u001b`\u000bK|~E}2jwcMP`a|L\u0006.4L\u0013cQ\u000e'j\u0016", replaceWith = @ReplaceWith(expression = "ModalBottomSheet(onDismissRequest,modifier,sheetState,sheetMaxWidth,shape,containerColor,contentColor,tonalElevation,scrimColor,dragHandle,{ windowInsets },properties,content,)", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: ModalBottomSheet-dYc4hso, reason: not valid java name */
    public static final /* synthetic */ void m2266ModalBottomSheetdYc4hso(Function0 function0, Modifier modifier, SheetState sheetState, float f2, Shape shape, long j2, long j3, float f3, long j4, Function2 function2, WindowInsets windowInsets, ModalBottomSheetProperties modalBottomSheetProperties, final Function3 function3, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        ModalBottomSheetProperties properties = modalBottomSheetProperties;
        Function2 function2M1989getLambda1$material3_release = function2;
        long scrimColor = j4;
        float fM6638constructorimpl = f3;
        long jM1947contentColorForek8zF_U = j3;
        long containerColor = j2;
        Shape expandedShape = shape;
        float fM1810getSheetMaxWidthD9Ej5fM = f2;
        final WindowInsets windowInsets2 = windowInsets;
        SheetState sheetStateRememberModalBottomSheetState = sheetState;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(944867294);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ModalBottomSheet)P(5,4,10,9:c#ui.unit.Dp,8,0:c#ui.graphics.Color,2:c#ui.graphics.Color,11:c#ui.unit.Dp,7:c#ui.graphics.Color,3,12,6)235@10240L31,237@10371L13,238@10434L14,239@10476L31,241@10584L10,243@10731L12,247@10884L485:ModalBottomSheet.android.kt#uh7d8r");
        Function0 function02 = function0;
        if ((i4 + 1) - (i4 | 1) != 0) {
            i5 = (i2 + 6) - (i2 & 6);
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i5 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(function02) ? 4 : 2)) & ((-1) - i2));
        } else {
            i5 = i2;
        }
        int i8 = (-1) - (((-1) - i4) | ((-1) - 2));
        if (i8 != 0) {
            i5 = (i5 + 48) - (i5 & 48);
        } else if ((i2 & 48) == 0) {
            int i9 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i5 = (i5 + i9) - (i5 & i9);
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 + 4) - (i4 | 4) == 0 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) ? 256 : 128)));
        }
        int i10 = (-1) - (((-1) - i4) | ((-1) - 8));
        if (i10 != 0) {
            i5 = (i5 + 3072) - (i5 & 3072);
        } else if ((i2 & 3072) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(fM1810getSheetMaxWidthD9Ej5fM) ? 2048 : 1024)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            i5 |= ((-1) - (((-1) - i4) | ((-1) - 16)) == 0 && composerStartRestartGroup.changed(expandedShape)) ? 16384 : 8192;
        }
        if ((-1) - (((-1) - i2) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 + 32) - (i4 | 32) == 0 && composerStartRestartGroup.changed(containerColor)) ? 131072 : 65536)));
        }
        if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            int i11 = ((i4 & 64) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U)) ? 1048576 : 524288;
            i5 = (i5 + i11) - (i5 & i11);
        }
        int i12 = (i4 + 128) - (i4 | 128);
        if (i12 != 0) {
            i5 = (i5 + 12582912) - (i5 & 12582912);
        } else if ((i2 & 12582912) == 0) {
            i5 |= composerStartRestartGroup.changed(fM6638constructorimpl) ? 8388608 : 4194304;
        }
        if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            int i13 = ((i4 & 256) == 0 && composerStartRestartGroup.changed(scrimColor)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i5 = (i5 + i13) - (i5 & i13);
        }
        int i14 = (-1) - (((-1) - i4) | ((-1) - 512));
        if (i14 != 0) {
            i5 |= 805306368;
        } else if ((805306368 & i2) == 0) {
            int i15 = composerStartRestartGroup.changedInstance(function2M1989getLambda1$material3_release) ? 536870912 : 268435456;
            i5 = (i5 + i15) - (i5 & i15);
        }
        if ((i3 + 6) - (i3 | 6) == 0) {
            i6 = (-1) - (((-1) - i3) & ((-1) - (((i4 & 1024) == 0 && composerStartRestartGroup.changed(windowInsets2)) ? 4 : 2)));
        } else {
            i6 = i3;
        }
        int i16 = i4 & 2048;
        if (i16 != 0) {
            i6 |= 48;
        } else if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
            i6 |= composerStartRestartGroup.changed(properties) ? 32 : 16;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 4096)) != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((306783379 + i5) - (306783379 | i5) == 306783378 && (i6 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 + 1) - (i2 | 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i8 != 0) {
                    companion = Modifier.Companion;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
                    sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-897)));
                }
                if (i10 != 0) {
                    fM1810getSheetMaxWidthD9Ej5fM = BottomSheetDefaults.INSTANCE.m1810getSheetMaxWidthD9Ej5fM();
                }
                if ((-1) - (((-1) - i4) | ((-1) - 16)) != 0) {
                    expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                    i5 &= -57345;
                }
                if ((i4 + 32) - (i4 | 32) != 0) {
                    containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i7 = (i5 - 458753) - (i5 | (-458753));
                } else {
                    i7 = i5;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                    jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i7 >> 15) & 14);
                    i7 = (i7 - 3670017) - (i7 | (-3670017));
                }
                if (i12 != 0) {
                    fM6638constructorimpl = Dp.m6638constructorimpl(0);
                }
                if ((i4 + 256) - (i4 | 256) != 0) {
                    scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                    i7 = (-1) - (((-1) - i7) | ((-1) - (-234881025)));
                }
                if (i14 != 0) {
                    function2M1989getLambda1$material3_release = ComposableSingletons$ModalBottomSheet_androidKt.INSTANCE.m1989getLambda1$material3_release();
                }
                if ((i4 + 1024) - (i4 | 1024) != 0) {
                    windowInsets2 = BottomSheetDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i6 &= -15;
                }
                if (i16 != 0) {
                    properties = ModalBottomSheetDefaults.INSTANCE.getProperties();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i4 & 4) != 0) {
                    i5 = (i5 - 897) - (i5 | (-897));
                }
                if ((i4 & 16) != 0) {
                    i5 &= -57345;
                }
                if ((i4 + 32) - (i4 | 32) != 0) {
                    i5 = (i5 - 458753) - (i5 | (-458753));
                }
                if ((i4 & 64) != 0) {
                    i5 = (i5 - 3670017) - (i5 | (-3670017));
                }
                if ((i4 & 256) != 0) {
                    i5 = (i5 - 234881025) - (i5 | (-234881025));
                }
                if ((i4 & 1024) != 0) {
                    i6 = (i6 - 15) - (i6 | (-15));
                }
                i7 = i5;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(944867294, i7, i6, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.android.kt:247)");
            }
            function02 = function02;
            ModalBottomSheetKt.m2260ModalBottomSheetdYc4hso(function02, companion, sheetStateRememberModalBottomSheetState, fM1810getSheetMaxWidthD9Ej5fM, expandedShape, containerColor, jM1947contentColorForek8zF_U, fM6638constructorimpl, scrimColor, function2M1989getLambda1$material3_release, new Function2<Composer, Integer, WindowInsets>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ WindowInsets invoke(Composer composer2, Integer num) {
                    return invoke(composer2, num.intValue());
                }

                public final WindowInsets invoke(Composer composer2, int i17) {
                    composer2.startReplaceGroup(-2061903609);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2061903609, i17, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.android.kt:258)");
                    }
                    WindowInsets windowInsets3 = windowInsets2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return windowInsets3;
                }
            }, properties, function3, composerStartRestartGroup, (i7 + 2147483646) - (i7 | 2147483646), (i6 + 1008) - (i6 | 1008), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0 function03 = function02;
            final Modifier modifier2 = companion;
            final SheetState sheetState2 = sheetStateRememberModalBottomSheetState;
            final float f4 = fM1810getSheetMaxWidthD9Ej5fM;
            final Shape shape2 = expandedShape;
            final long j5 = containerColor;
            final long j6 = jM1947contentColorForek8zF_U;
            final float f5 = fM6638constructorimpl;
            final long j7 = scrimColor;
            final Function2 function22 = function2M1989getLambda1$material3_release;
            final WindowInsets windowInsets3 = windowInsets2;
            final ModalBottomSheetProperties modalBottomSheetProperties2 = properties;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheet_androidKt$ModalBottomSheet$2
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
                    ModalBottomSheet_androidKt.m2266ModalBottomSheetdYc4hso(function03, modifier2, sheetState2, f4, shape2, j5, j6, f5, j7, function22, windowInsets3, modalBottomSheetProperties2, function3, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ModalBottomSheetDialog(final kotlin.jvm.functions.Function0<kotlin.Unit> r21, final androidx.compose.material3.ModalBottomSheetProperties r22, final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r23, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheet_androidKt.ModalBottomSheetDialog(kotlin.jvm.functions.Function0, androidx.compose.material3.ModalBottomSheetProperties, androidx.compose.animation.core.Animatable, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    public static final boolean isFlagSecureEnabled(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return false;
        }
        int i2 = layoutParams2.flags;
        return (i2 + 8192) - (i2 | 8192) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldApplySecureFlag(SecureFlagPolicy secureFlagPolicy, boolean z2) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[secureFlagPolicy.ordinal()];
        if (i2 == 1) {
            return false;
        }
        if (i2 == 2) {
            return true;
        }
        if (i2 == 3) {
            return z2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<Composer, Integer, Unit> ModalBottomSheetDialog$lambda$0(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
        return (Function2) state.getValue();
    }
}
