package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d̉=!4i\bDJc|\u0004O\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0ZeP.XU2\u000f\u0002{<řc$\bCCU }*\teNo˧vJp\u000bK\u000f\u001c\u0016\u0001j2Pm\u07be\\ \u0010JB\u001eAcSu=Gc\r63$b3>y\u0013\u000625X\u0012\u0007zqM:\u0018ضDp@Y=^\u000b\u001a \u000eV+\u0011 lg|8vrҺ>/)\n\u001aST'm9\u0015X\u001dHd';x\u0010$ҋD7;\u001cUd\t\u0007`eW\u000eOsM\u0005\u0017)U1ʁwW<_0\u001a\u001b+]\u0018urTh5Wf\f58gcy^>.}z\n\u001cT\u0004<\u0014WN4-(v \u000ea\u0006#hNb\u001aoR\u0002\u000bad+5\u0002C+g\u001d\u0015dň?\u0019T>B\n۵\u001dŀъr#ai\u001cv-ÙS\u0006hIQn?xR\u0018qUm2|\u0013\u00118\tHR\u00101\f\u0011\\\u0019S=٦=#'r2]Ry\u000f\u0016pjci\u0001\\P$~\u0016e,7\u001fʑHd\u000br\u0001cfE)X,V\u0017}6\u0015Nbʟ@!+\u0017~^v\u0004\u0003Xm\f5/\u00159\bt«\u0012W?ec9_s(a\u0001\bDNJj\u001dcvDc\f\t^V(ĘLj\u0016~BEā\u000bƎ\u0558Cs\"O:M9j#ǽ\u001b\u001ep@SȄa˖l\u0012\u0007TA$ѳi)|\f\u0007˨x\u001fnψ|f"}, d2 = {"\u0014`Q c(<W\"\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "!bP3Y6ER", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "Bn_\u000fT9", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "0ncAb4\u001bO&", "AmP0^):`{\t\tm", "4k^.g0GUt|\nb6\u0006e?t\u000f2\u0005", "4k^.g0GUt|\nb6\u0006e?t\u000f2\u0005+\u000b%\u001bVs\u0018E", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006W!2D\b.;|\u001a8V\u0019", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n]AX5M1#\u0006\u0005k", "1n]AX5ME\u001d\byh>`\u0012=e\u000f6", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\b2VBE}\u0018'#hpG\\", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "!bP3Y6ER`m\fg3\u0002\u001d\u001b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@\u0004*Ft\u001a7\u0017HLs}\u001f%q_H\u000bm5\\@\bWUL;`\\{\nix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0014O{{K8oJb)~XI\u000fc:m\nn!fCHmt\u0002\"\u0019wT8\u0013H)wx\\\tnkPb\u007fI,\bnkOC~YF}5h,\f\u0001\u0010A\\~4A\u0003g\u0019\u000f\u001d`\u000eJt\"B]\f^*fI20D<\\@Us~k:\u001dl)jQ\u0015^I;)t/UL\u0018\u0006g)?>o_\u0010E(lDS~\u001c+OHGl\u0002^\n\u0017-ktMM$bJz\u0001M n\u0015\r\f4m\u0003*\u001f<f\u0019l)r\u0001K\u001d\u0011sB\u001a{#P%yW\u0014uK<9aw/@\u0007\u0011Vv\u0017/\u007fg", "!bP3Y6ER\u007fz\u000fh<\f", "4`Q\u001db:Bb\u001d\t\u0004", "AmP0^):`", "4`Q", "!bP3Y6ER\u007fz\u000fh<\fP\u0010Mc\u000f]B~", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b(c51\u0017\u0014`E-8IH'Q-Y\u000b9w\u0005\u0016\u001f\u001c~K\u0001KT\u001fK\u0004\u001eB\u0017\u0010nPhf}P\u000bJs2.\ro&ZI>.\u001d\u007fb{xY,\u0019\u007f]\u001a?(`cpF&\u0005<#Q7YPMz_Jtp U\f\u0001\u0011.gx5}v\u000b0>@t\u0014\u0015Y\u001cG]\u0003'\u0010eO'5D\u0012yEUr|pGWm0iQ\u000fr>/(iolVXgm YDei\n\u0004(l:Rn\"1J}U%w\u001f\u0011\u0012.{e\u0013P+]\u0010\u001exDk=\u001b\u000b\u000ep&\u001c;k!\u001d\u007f", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ScaffoldKt {
    private static final float FabSpacing = Dp.m6638constructorimpl(16);

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: Scaffold-TvnljyQ, reason: not valid java name */
    public static final void m2426ScaffoldTvnljyQ(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, int i2, long j2, long j3, WindowInsets windowInsets, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3, final int i4) {
        int i5;
        final WindowInsets contentWindowInsets = windowInsets;
        long jM1947contentColorForek8zF_U = j3;
        long jM1909getBackground0d7_KjU = j2;
        int iM2123getEndERTFSPs = i2;
        Function2<? super Composer, ? super Integer, Unit> function2M1991getLambda1$material3_release = function2;
        Function2<? super Composer, ? super Integer, Unit> function2M1993getLambda3$material3_release = function23;
        Function2<? super Composer, ? super Integer, Unit> function2M1992getLambda2$material3_release = function22;
        Function2<? super Composer, ? super Integer, Unit> function2M1994getLambda4$material3_release = function24;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1219521777);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Scaffold)P(7,9!1,8,5,6:c#material3.FabPosition,1:c#ui.graphics.Color,3:c#ui.graphics.Color,4)90@4654L11,91@4704L31,92@4794L19,95@4889L74,98@5047L224,104@5347L314,96@4968L693:Scaffold.kt#uh7d8r");
        int i6 = (i4 + 1) - (i4 | 1);
        if (i6 != 0) {
            i5 = (-1) - (((-1) - i3) & ((-1) - 6));
        } else if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            i5 = (composerStartRestartGroup.changed(companion) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i7 = (-1) - (((-1) - i4) | ((-1) - 2));
        if (i7 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 48));
        } else if ((-1) - (((-1) - i3) | ((-1) - 48)) == 0) {
            int i8 = composerStartRestartGroup.changedInstance(function2M1991getLambda1$material3_release) ? 32 : 16;
            i5 = (i5 + i8) - (i5 & i8);
        }
        int i9 = i4 & 4;
        if (i9 != 0) {
            i5 = (i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i10 = composerStartRestartGroup.changedInstance(function2M1992getLambda2$material3_release) ? 256 : 128;
            i5 = (i5 + i10) - (i5 & i10);
        }
        int i11 = i4 & 8;
        if (i11 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 3072));
        } else if ((i3 + 3072) - (i3 | 3072) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function2M1993getLambda3$material3_release) ? 2048 : 1024)));
        }
        int i12 = i4 & 16;
        if (i12 != 0) {
            i5 = (i5 + 24576) - (i5 & 24576);
        } else if ((i3 + 24576) - (i3 | 24576) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changedInstance(function2M1994getLambda4$material3_release) ? 16384 : 8192)));
        }
        int i13 = (i4 + 32) - (i4 | 32);
        if (i13 != 0) {
            i5 = (i5 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((i3 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i3 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            int i14 = composerStartRestartGroup.changed(iM2123getEndERTFSPs) ? 131072 : 65536;
            i5 = (i5 + i14) - (i5 & i14);
        }
        if ((-1) - (((-1) - i3) | ((-1) - 1572864)) == 0) {
            int i15 = ((i4 & 64) == 0 && composerStartRestartGroup.changed(jM1909getBackground0d7_KjU)) ? 1048576 : 524288;
            i5 = (i5 + i15) - (i5 & i15);
        }
        if ((i3 + 12582912) - (i3 | 12582912) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((i4 + 128) - (i4 | 128) == 0 && composerStartRestartGroup.changed(jM1947contentColorForek8zF_U)) ? 8388608 : 4194304)));
        }
        if ((i3 & 100663296) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (((-1) - (((-1) - i4) | ((-1) - 256)) == 0 && composerStartRestartGroup.changed(contentWindowInsets)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((i4 + 512) - (i4 | 512) != 0) {
            i5 = (i5 + 805306368) - (i5 & 805306368);
        } else if ((i3 & 805306368) == 0) {
            int i16 = composerStartRestartGroup.changedInstance(function3) ? 536870912 : 268435456;
            i5 = (i5 + i16) - (i5 & i16);
        }
        if ((-1) - (((-1) - i5) | ((-1) - 306783379)) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((-1) - (((-1) - i3) | ((-1) - 1)) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i6 != 0) {
                    companion = Modifier.Companion;
                }
                if (i7 != 0) {
                    function2M1991getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1991getLambda1$material3_release();
                }
                if (i9 != 0) {
                    function2M1992getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1992getLambda2$material3_release();
                }
                if (i11 != 0) {
                    function2M1993getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1993getLambda3$material3_release();
                }
                if (i12 != 0) {
                    function2M1994getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1994getLambda4$material3_release();
                }
                if (i13 != 0) {
                    iM2123getEndERTFSPs = FabPosition.Companion.m2123getEndERTFSPs();
                }
                if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                    jM1909getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m1909getBackground0d7_KjU();
                    i5 &= -3670017;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 128)) != 0) {
                    jM1947contentColorForek8zF_U = ColorSchemeKt.m1947contentColorForek8zF_U(jM1909getBackground0d7_KjU, composerStartRestartGroup, (i5 >> 18) & 14);
                    i5 = (-1) - (((-1) - i5) | ((-1) - (-29360129)));
                }
                if ((i4 & 256) != 0) {
                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                    i5 &= -234881025;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
                    i5 &= -3670017;
                }
                if ((-1) - (((-1) - i4) | ((-1) - 128)) != 0) {
                    i5 &= -29360129;
                }
                if ((i4 + 256) - (i4 | 256) != 0) {
                    i5 = (i5 - 234881025) - (i5 | (-234881025));
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1219521777, i5, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:94)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1794939901, "CC(remember):Scaffold.kt#9igjgp");
            int i17 = ((234881024 + i5) - (234881024 | i5)) ^ 100663296;
            boolean z2 = (i17 > 67108864 && composerStartRestartGroup.changed(contentWindowInsets)) || (i5 & 100663296) == 67108864;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MutableWindowInsets(contentWindowInsets);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1794934695, "CC(remember):Scaffold.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(mutableWindowInsets);
            int i18 = ((i17 <= 67108864 || !composerStartRestartGroup.changed(contentWindowInsets)) && (100663296 & i5) != 67108864) ? 0 : 1;
            int i19 = ((zChanged ? 1 : 0) + i18) - ((zChanged ? 1 : 0) & i18);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i19 != 0 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function1) new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets2) {
                        invoke2(windowInsets2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(WindowInsets windowInsets2) {
                        mutableWindowInsets.setInsets(WindowInsetsKt.exclude(contentWindowInsets, windowInsets2));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final int i20 = iM2123getEndERTFSPs;
            final Function2<? super Composer, ? super Integer, Unit> function25 = function2M1991getLambda1$material3_release;
            final Function2<? super Composer, ? super Integer, Unit> function26 = function2M1993getLambda3$material3_release;
            final Function2<? super Composer, ? super Integer, Unit> function27 = function2M1994getLambda4$material3_release;
            final Function2<? super Composer, ? super Integer, Unit> function28 = function2M1992getLambda2$material3_release;
            int i21 = i5 >> 12;
            int i22 = (-1) - (((-1) - (896 & i21)) & ((-1) - 12582912));
            int i23 = i21 & 7168;
            SurfaceKt.m2561SurfaceT9BRK9s(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(companion, (Function1) objRememberedValue2), null, jM1909getBackground0d7_KjU, jM1947contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1979205334, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
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
                    ComposerKt.sourceInformation(composer2, "C105@5357L298:Scaffold.kt#uh7d8r");
                    if ((i24 + 3) - (3 | i24) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1979205334, i24, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:105)");
                        }
                        ScaffoldKt.m2427ScaffoldLayoutFMILGgc(i20, function25, function3, function26, function27, mutableWindowInsets, function28, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i22 + i23) - (i22 & i23), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function2<? super Composer, ? super Integer, Unit> function29 = function2M1992getLambda2$material3_release;
            final Function2<? super Composer, ? super Integer, Unit> function210 = function2M1993getLambda3$material3_release;
            final Function2<? super Composer, ? super Integer, Unit> function211 = function2M1994getLambda4$material3_release;
            final int i24 = iM2123getEndERTFSPs;
            final long j4 = jM1909getBackground0d7_KjU;
            final long j5 = jM1947contentColorForek8zF_U;
            final WindowInsets windowInsets2 = contentWindowInsets;
            final Modifier modifier2 = companion;
            final Function2<? super Composer, ? super Integer, Unit> function212 = function2M1991getLambda1$material3_release;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$3
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

                public final void invoke(Composer composer2, int i25) {
                    ScaffoldKt.m2426ScaffoldTvnljyQ(modifier2, function212, function29, function210, function211, i24, j4, j5, windowInsets2, function3, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i3) & ((-1) - 1))), i4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ScaffoldLayout-FMILGgc, reason: not valid java name */
    public static final void m2427ScaffoldLayoutFMILGgc(final int i2, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-975511942);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScaffoldLayout)P(4:c#material3.FabPosition,6,1,5,3,2)139@6582L6951,139@6565L6968:Scaffold.kt#uh7d8r");
        if ((i3 + 6) - (i3 | 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 + 48) - (i3 | 48) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            i4 = (i4 + i5) - (i4 & i5);
        }
        if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
            i4 = (i4 + i6) - (i4 & i6);
        }
        if ((i3 & 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024)));
        }
        if ((i3 & 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function23) ? 16384 : 8192)));
        }
        if ((-1) - (((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) | ((-1) - i3)) == 0) {
            int i7 = composerStartRestartGroup.changed(windowInsets) ? 131072 : 65536;
            i4 = (i4 + i7) - (i4 & i7);
        }
        if ((i3 & 1572864) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function24) ? 1048576 : 524288)));
        }
        if ((i4 + 599187) - (599187 | i4) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-975511942, i4, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:138)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1690368138, "CC(remember):Scaffold.kt#9igjgp");
            int i8 = (i4 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i4) == 32 ? 1 : 0;
            int i9 = (7168 & i4) == 2048 ? 1 : 0;
            int i10 = (i8 + i9) - (i8 & i9);
            int i11 = (458752 + i4) - (458752 | i4) == 131072 ? 1 : 0;
            int i12 = ((-1) - (((-1) - ((i10 + i11) - (i10 & i11))) & ((-1) - ((57344 & i4) == 16384 ? 1 : 0)))) | ((i4 & 14) == 4 ? 1 : 0) | ((3670016 & i4) == 1048576 ? 1 : 0);
            int i13 = (-1) - (((-1) - i4) | ((-1) - 896)) == 256 ? 1 : 0;
            int i14 = (i12 + i13) - (i12 & i13);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i14 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m2429invoke0kLqBqw(subcomposeMeasureScope, constraints.m6597unboximpl());
                    }

                    /* JADX INFO: renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m2429invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, long j2) {
                        Object obj;
                        Object obj2;
                        Object obj3;
                        FabPlacement fabPlacement;
                        Object obj4;
                        final Integer numValueOf;
                        int height;
                        int bottom;
                        Object obj5;
                        Object obj6;
                        int i15;
                        int i16;
                        final int iM6591getMaxWidthimpl = Constraints.m6591getMaxWidthimpl(j2);
                        final int iM6590getMaxHeightimpl = Constraints.m6590getMaxHeightimpl(j2);
                        long jM6582copyZbe2FdA$default = Constraints.m6582copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.TopBar, function2);
                        ArrayList arrayList = new ArrayList(listSubcompose.size());
                        int size = listSubcompose.size();
                        for (int i17 = 0; i17 < size; i17++) {
                            arrayList.add(listSubcompose.get(i17).mo5514measureBRTryo0(jM6582copyZbe2FdA$default));
                        }
                        final ArrayList arrayList2 = arrayList;
                        int i18 = 1;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            obj = arrayList2.get(0);
                            int height2 = ((Placeable) obj).getHeight();
                            int lastIndex = CollectionsKt.getLastIndex(arrayList2);
                            if (1 <= lastIndex) {
                                while (true) {
                                    Object obj7 = arrayList2.get(i18);
                                    int height3 = ((Placeable) obj7).getHeight();
                                    if (height2 < height3) {
                                        obj = obj7;
                                        height2 = height3;
                                    }
                                    if (i18 == lastIndex) {
                                        break;
                                    }
                                    i18++;
                                }
                            }
                        }
                        Placeable placeable = (Placeable) obj;
                        final int height4 = placeable != null ? placeable.getHeight() : 0;
                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Snackbar, function22);
                        WindowInsets windowInsets2 = windowInsets;
                        ArrayList arrayList3 = new ArrayList(listSubcompose2.size());
                        int size2 = listSubcompose2.size();
                        for (int i19 = 0; i19 < size2; i19++) {
                            SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                            arrayList3.add(listSubcompose2.get(i19).mo5514measureBRTryo0(ConstraintsKt.m6610offsetNN6EwU(jM6582copyZbe2FdA$default, (-windowInsets2.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection())) - windowInsets2.getRight(subcomposeMeasureScope2, subcomposeMeasureScope.getLayoutDirection()), -windowInsets2.getBottom(subcomposeMeasureScope2))));
                        }
                        final ArrayList arrayList4 = arrayList3;
                        if (arrayList4.isEmpty()) {
                            obj2 = null;
                        } else {
                            obj2 = arrayList4.get(0);
                            int height5 = ((Placeable) obj2).getHeight();
                            int lastIndex2 = CollectionsKt.getLastIndex(arrayList4);
                            if (1 <= lastIndex2) {
                                int i20 = 1;
                                while (true) {
                                    Object obj8 = arrayList4.get(i20);
                                    int height6 = ((Placeable) obj8).getHeight();
                                    if (height5 < height6) {
                                        obj2 = obj8;
                                        height5 = height6;
                                    }
                                    if (i20 == lastIndex2) {
                                        break;
                                    }
                                    i20++;
                                }
                            }
                        }
                        Placeable placeable2 = (Placeable) obj2;
                        int height7 = placeable2 != null ? placeable2.getHeight() : 0;
                        if (arrayList4.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList4.get(0);
                            int width = ((Placeable) obj3).getWidth();
                            int lastIndex3 = CollectionsKt.getLastIndex(arrayList4);
                            if (1 <= lastIndex3) {
                                int i21 = 1;
                                while (true) {
                                    Object obj9 = arrayList4.get(i21);
                                    int width2 = ((Placeable) obj9).getWidth();
                                    if (width < width2) {
                                        obj3 = obj9;
                                        width = width2;
                                    }
                                    if (i21 == lastIndex3) {
                                        break;
                                    }
                                    i21++;
                                }
                            }
                        }
                        Placeable placeable3 = (Placeable) obj3;
                        final int width3 = placeable3 != null ? placeable3.getWidth() : 0;
                        List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Fab, function23);
                        WindowInsets windowInsets3 = windowInsets;
                        ArrayList arrayList5 = new ArrayList(listSubcompose3.size());
                        int size3 = listSubcompose3.size();
                        for (int i22 = 0; i22 < size3; i22++) {
                            SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                            Placeable placeableMo5514measureBRTryo0 = listSubcompose3.get(i22).mo5514measureBRTryo0(ConstraintsKt.m6610offsetNN6EwU(jM6582copyZbe2FdA$default, (-windowInsets3.getLeft(subcomposeMeasureScope3, subcomposeMeasureScope.getLayoutDirection())) - windowInsets3.getRight(subcomposeMeasureScope3, subcomposeMeasureScope.getLayoutDirection()), -windowInsets3.getBottom(subcomposeMeasureScope3)));
                            if (placeableMo5514measureBRTryo0.getHeight() == 0 || placeableMo5514measureBRTryo0.getWidth() == 0) {
                                placeableMo5514measureBRTryo0 = null;
                            }
                            if (placeableMo5514measureBRTryo0 != null) {
                                arrayList5.add(placeableMo5514measureBRTryo0);
                            }
                        }
                        final ArrayList arrayList6 = arrayList5;
                        if (arrayList6.isEmpty()) {
                            fabPlacement = null;
                        } else {
                            if (arrayList6.isEmpty()) {
                                obj5 = null;
                            } else {
                                obj5 = arrayList6.get(0);
                                int width4 = ((Placeable) obj5).getWidth();
                                int lastIndex4 = CollectionsKt.getLastIndex(arrayList6);
                                if (1 <= lastIndex4) {
                                    int i23 = 1;
                                    while (true) {
                                        Object obj10 = arrayList6.get(i23);
                                        int width5 = ((Placeable) obj10).getWidth();
                                        if (width4 < width5) {
                                            obj5 = obj10;
                                            width4 = width5;
                                        }
                                        if (i23 == lastIndex4) {
                                            break;
                                        }
                                        i23++;
                                    }
                                }
                            }
                            Intrinsics.checkNotNull(obj5);
                            int width6 = ((Placeable) obj5).getWidth();
                            if (arrayList6.isEmpty()) {
                                obj6 = null;
                            } else {
                                obj6 = arrayList6.get(0);
                                int height8 = ((Placeable) obj6).getHeight();
                                int lastIndex5 = CollectionsKt.getLastIndex(arrayList6);
                                if (1 <= lastIndex5) {
                                    int i24 = 1;
                                    while (true) {
                                        Object obj11 = arrayList6.get(i24);
                                        int height9 = ((Placeable) obj11).getHeight();
                                        if (height8 < height9) {
                                            height8 = height9;
                                            obj6 = obj11;
                                        }
                                        if (i24 == lastIndex5) {
                                            break;
                                        }
                                        i24++;
                                    }
                                }
                            }
                            Intrinsics.checkNotNull(obj6);
                            int height10 = ((Placeable) obj6).getHeight();
                            int i25 = i2;
                            if (!FabPosition.m2118equalsimpl0(i25, FabPosition.Companion.m2125getStartERTFSPs())) {
                                if (!(FabPosition.m2118equalsimpl0(i25, FabPosition.Companion.m2123getEndERTFSPs()) ? true : FabPosition.m2118equalsimpl0(i25, FabPosition.Companion.m2124getEndOverlayERTFSPs()))) {
                                    i15 = (iM6591getMaxWidthimpl - width6) / 2;
                                } else if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                    i16 = subcomposeMeasureScope.mo704roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                    i15 = (iM6591getMaxWidthimpl - i16) - width6;
                                } else {
                                    i15 = subcomposeMeasureScope.mo704roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                }
                                fabPlacement = new FabPlacement(i15, width6, height10);
                            } else if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                i15 = subcomposeMeasureScope.mo704roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                fabPlacement = new FabPlacement(i15, width6, height10);
                            } else {
                                i16 = subcomposeMeasureScope.mo704roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                i15 = (iM6591getMaxWidthimpl - i16) - width6;
                                fabPlacement = new FabPlacement(i15, width6, height10);
                            }
                        }
                        ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.BottomBar;
                        final Function2<Composer, Integer, Unit> function25 = function24;
                        List<Measurable> listSubcompose4 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent, ComposableLambdaKt.composableLambdaInstance(-2146438447, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1
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

                            public final void invoke(Composer composer2, int i26) {
                                ComposerKt.sourceInformation(composer2, "C209@10015L11:Scaffold.kt#uh7d8r");
                                if ((i26 + 3) - (3 | i26) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2146438447, i26, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:209)");
                                }
                                function25.invoke(composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        ArrayList arrayList7 = new ArrayList(listSubcompose4.size());
                        int size4 = listSubcompose4.size();
                        for (int i26 = 0; i26 < size4; i26++) {
                            arrayList7.add(listSubcompose4.get(i26).mo5514measureBRTryo0(jM6582copyZbe2FdA$default));
                        }
                        final ArrayList arrayList8 = arrayList7;
                        if (arrayList8.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList8.get(0);
                            int height11 = ((Placeable) obj4).getHeight();
                            int lastIndex6 = CollectionsKt.getLastIndex(arrayList8);
                            if (1 <= lastIndex6) {
                                int i27 = 1;
                                while (true) {
                                    Object obj12 = arrayList8.get(i27);
                                    int height12 = ((Placeable) obj12).getHeight();
                                    if (height11 < height12) {
                                        height11 = height12;
                                        obj4 = obj12;
                                    }
                                    if (i27 == lastIndex6) {
                                        break;
                                    }
                                    i27++;
                                }
                            }
                        }
                        Placeable placeable4 = (Placeable) obj4;
                        final Integer numValueOf2 = placeable4 != null ? Integer.valueOf(placeable4.getHeight()) : null;
                        if (fabPlacement != null) {
                            int i28 = i2;
                            WindowInsets windowInsets4 = windowInsets;
                            if (numValueOf2 == null || FabPosition.m2118equalsimpl0(i28, FabPosition.Companion.m2124getEndOverlayERTFSPs())) {
                                height = fabPlacement.getHeight() + subcomposeMeasureScope.mo704roundToPx0680j_4(ScaffoldKt.FabSpacing);
                                bottom = windowInsets4.getBottom(subcomposeMeasureScope);
                            } else {
                                height = numValueOf2.intValue() + fabPlacement.getHeight();
                                bottom = subcomposeMeasureScope.mo704roundToPx0680j_4(ScaffoldKt.FabSpacing);
                            }
                            numValueOf = Integer.valueOf(height + bottom);
                        } else {
                            numValueOf = null;
                        }
                        final int iIntValue = height7 != 0 ? height7 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : windowInsets.getBottom(subcomposeMeasureScope)) : 0;
                        ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.MainContent;
                        final WindowInsets windowInsets5 = windowInsets;
                        final Function3<PaddingValues, Composer, Integer, Unit> function32 = function3;
                        final Integer num = numValueOf2;
                        List<Measurable> listSubcompose5 = subcomposeMeasureScope.subcompose(scaffoldLayoutContent2, ComposableLambdaKt.composableLambdaInstance(-1213360416, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                                invoke(composer2, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i29) {
                                float fMo971calculateTopPaddingD9Ej5fM;
                                float fMo968calculateBottomPaddingD9Ej5fM;
                                Integer num2;
                                ComposerKt.sourceInformation(composer2, "C260@12377L21:Scaffold.kt#uh7d8r");
                                if ((i29 + 3) - (3 | i29) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1213360416, i29, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:238)");
                                    }
                                    PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(windowInsets5, subcomposeMeasureScope);
                                    if (arrayList2.isEmpty()) {
                                        fMo971calculateTopPaddingD9Ej5fM = paddingValuesAsPaddingValues.mo971calculateTopPaddingD9Ej5fM();
                                    } else {
                                        fMo971calculateTopPaddingD9Ej5fM = subcomposeMeasureScope.mo707toDpu2uoSUM(height4);
                                    }
                                    if (arrayList8.isEmpty() || (num2 = num) == null) {
                                        fMo968calculateBottomPaddingD9Ej5fM = paddingValuesAsPaddingValues.mo968calculateBottomPaddingD9Ej5fM();
                                    } else {
                                        fMo968calculateBottomPaddingD9Ej5fM = subcomposeMeasureScope.mo707toDpu2uoSUM(num2.intValue());
                                    }
                                    function32.invoke(PaddingKt.m1014PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), fMo971calculateTopPaddingD9Ej5fM, PaddingKt.calculateEndPadding(paddingValuesAsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), fMo968calculateBottomPaddingD9Ej5fM), composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }));
                        ArrayList arrayList9 = new ArrayList(listSubcompose5.size());
                        int size5 = listSubcompose5.size();
                        for (int i29 = 0; i29 < size5; i29++) {
                            arrayList9.add(listSubcompose5.get(i29).mo5514measureBRTryo0(jM6582copyZbe2FdA$default));
                        }
                        final ArrayList arrayList10 = arrayList9;
                        final WindowInsets windowInsets6 = windowInsets;
                        final FabPlacement fabPlacement2 = fabPlacement;
                        return MeasureScope.layout$default(subcomposeMeasureScope, iM6591getMaxWidthimpl, iM6590getMaxHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                List<Placeable> list = arrayList10;
                                int size6 = list.size();
                                for (int i30 = 0; i30 < size6; i30++) {
                                    Placeable.PlacementScope.place$default(placementScope, list.get(i30), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list2 = arrayList2;
                                int size7 = list2.size();
                                for (int i31 = 0; i31 < size7; i31++) {
                                    Placeable.PlacementScope.place$default(placementScope, list2.get(i31), 0, 0, 0.0f, 4, null);
                                }
                                List<Placeable> list3 = arrayList4;
                                int i32 = iM6591getMaxWidthimpl;
                                int i33 = width3;
                                WindowInsets windowInsets7 = windowInsets6;
                                SubcomposeMeasureScope subcomposeMeasureScope4 = subcomposeMeasureScope;
                                int i34 = iM6590getMaxHeightimpl;
                                int i35 = iIntValue;
                                int size8 = list3.size();
                                for (int i36 = 0; i36 < size8; i36++) {
                                    Placeable.PlacementScope.place$default(placementScope, list3.get(i36), ((i32 - i33) / 2) + windowInsets7.getLeft(subcomposeMeasureScope4, subcomposeMeasureScope4.getLayoutDirection()), i34 - i35, 0.0f, 4, null);
                                }
                                List<Placeable> list4 = arrayList8;
                                int i37 = iM6590getMaxHeightimpl;
                                Integer num2 = numValueOf2;
                                int size9 = list4.size();
                                for (int i38 = 0; i38 < size9; i38++) {
                                    Placeable.PlacementScope.place$default(placementScope, list4.get(i38), 0, i37 - (num2 != null ? num2.intValue() : 0), 0.0f, 4, null);
                                }
                                FabPlacement fabPlacement3 = fabPlacement2;
                                if (fabPlacement3 != null) {
                                    List<Placeable> list5 = arrayList6;
                                    int i39 = iM6590getMaxHeightimpl;
                                    Integer num3 = numValueOf;
                                    int size10 = list5.size();
                                    for (int i40 = 0; i40 < size10; i40++) {
                                        Placeable placeable5 = list5.get(i40);
                                        int left = fabPlacement3.getLeft();
                                        Intrinsics.checkNotNull(num3);
                                        Placeable.PlacementScope.place$default(placementScope, placeable5, left, i39 - num3.intValue(), 0.0f, 4, null);
                                    }
                                }
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$2
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

                public final void invoke(Composer composer2, int i15) {
                    ScaffoldKt.m2427ScaffoldLayoutFMILGgc(i2, function2, function3, function22, function23, windowInsets, function24, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i3) & ((-1) - 1))));
                }
            });
        }
    }
}
