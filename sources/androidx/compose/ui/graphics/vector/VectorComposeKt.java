package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: VectorCompose.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d̉=!,i\bӵLc\u0003\u0010Iي8\u000b<G\u0007\"2\u0017\u007f\u0007t\tA0ZeP\u008cZS@\u000fs{J$c$\bCCU \u007f*\teNo˧vJp\u000bK\u000f\f\u0019\u0001jBI]ތe\u0012%2JoE8eڔ<Gś\r63\u001fb(>y\u0013\u00012*v\u0011'\u0001IK\u001a\u0014H@\u001f=\u0003\u0013S\u0005(\u0016\u001e>N\u0004NbmNDM\u0005]h2S\toB\\-w0+P=LZ'\u001b}y\u001eYCg;\u001b%a\u000b\u001fR\nB3Ew=\u0013q?'YL$c<X\u000e\u001e-1_\u000fmrTh3\\\u0011 58gs[R\u001e(&y*\u001bʀ\b\u000e\f6ρ2- vN\u0013\u07baxraQhك]P\u0012\u0013ad\u0016U\nA>Q!vSq;GZe\u00075\u0013$#\u000f\u00039[\u0003#\u0011\u001b!T\u0006QIQn>xV\u0010YK\u0004\u001crx\u0001X\u001b`M\u0006/\n)F\u0017S:\fA)!y\u001b`F}u3w\u0019YoRVZ:nD:Z\u000f\u0012ZR\u007f\u001dk~W\t2\u0017M*p\u001f}60Pb}</C(N}\b\u001apS]\u0018EGfe\\\u001fq\u0014WG\u007fK5\u007ff@gXv\"aTb3[\u0017HY\fh\u007f@\"`K1\u0015ɧzͩ«\u0010\u00158c\u007fAؼ,6!_\u001bȟ\u001fLA˯\u0001/"}, d2 = {"\u0015q^Bc", "", "<`\\2", "", "@nc.g0H\\", "", ">he<g\u001f", ">he<g ", "AbP9X\u001f", "AbP9X ", "BqP;f3:b\u001d\t\u0004Q", "BqP;f3:b\u001d\t\u0004R", "1kX=C(MVwz\nZ", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA{\u001fplC\u0015_)Uv|", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}\\!aww(PtAr61#\u000e/;t_\u0015QQJA\u001b$\u001fwh=\u0010-1_~pH\\W*kV|F\"[;\u001eW)\u001c\tcJpD+3(\u00079S\u0006:{J\n \u0016@t~B \u001dW\u0003$yI)2$cg\u0005QOEo\u007fHo#\u000e", "\u001e`c5", ">`c57(MO", ">`c590EZ\b\u0013\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u0018q\u001d5<WFk\n", "4h[9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "4h[943IV\u0015", "Asa<^,", "Asa<^,\u001aZ$\u0002v", "Asa<^,%W\"~lb+\f\f", "Asa<^,%W\"~XZ7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=ms*X\u0019", "Asa<^,%W\"~_h0\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=mz8QL\u0011", "Asa<^,%W\"~bb;|\u0016", "BqX:C(MV\u0007\u000evk;", "BqX:C(MVx\by", "BqX:C(MV\u0003\u007f{l,\f", "\u001e`c5 \u007f<R\u0015q_-", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;c\u000f\u0001<\u0012\u0013`Nk\u0017>@\u0013Df\u0002)9C|*VBHu8\u001d(2_C\u000fn6\\vpWP\u0018.iN}@\u0018\u0010hW+8\u001d\u0013\\\u0017\u0005U@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\ff\u0014\u0011{\"qL,lDg)VTQSe\u007fElC\u0001=\u001b\u001b\u0005zm\"\u001auZ2\t\u000f\u001d\u000f|Z\u0005quGb\bH-MqcF\u000fM_D\u007f1-K\tMu\u0016<8\u001c", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class VectorComposeKt {
    public static final void Group(String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List<? extends PathNode> list, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2, final int i3) {
        int i4;
        final float f9;
        final float f10;
        List<? extends PathNode> emptyPath = list;
        float f11 = f7;
        float f12 = f5;
        float f13 = f4;
        float f14 = f3;
        float f15 = f2;
        String str2 = str;
        Composer composerStartRestartGroup = composer.startRestartGroup(-213417674);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Group)P(2,5,3,4,6,7,8,9)58@2500L585:VectorCompose.kt#huu6hf");
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            int i6 = composerStartRestartGroup.changed(str2) ? 4 : 2;
            i4 = (i6 + i2) - (i6 & i2);
        } else {
            i4 = i2;
        }
        int i7 = (i3 + 2) - (i3 | 2);
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 |= composerStartRestartGroup.changed(f15) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(f14) ? 256 : 128)));
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 = (i4 + 3072) - (i4 & 3072);
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(f13) ? 2048 : 1024)));
        }
        int i10 = (-1) - (((-1) - i3) | ((-1) - 16));
        if (i10 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(f12) ? 16384 : 8192)));
        }
        int i11 = i3 & 32;
        if (i11 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((i2 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i2 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(f6) ? 131072 : 65536)));
        }
        int i12 = (-1) - (((-1) - i3) | ((-1) - 64));
        if (i12 != 0) {
            i4 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(f11) ? 1048576 : 524288)));
        }
        int i13 = (-1) - (((-1) - i3) | ((-1) - 128));
        if (i13 != 0) {
            i4 |= 12582912;
        } else if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(f8) ? 8388608 : 4194304)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 100663296)) == 0) {
            int i14 = ((i3 + 256) - (i3 | 256) == 0 && composerStartRestartGroup.changedInstance(emptyPath)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            i4 = (i4 + i14) - (i4 & i14);
        }
        if ((i3 & 512) != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 805306368));
        } else if ((-1) - (((-1) - i2) | ((-1) - 805306368)) == 0) {
            int i15 = composerStartRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
            i4 = (i4 + i15) - (i4 & i15);
        }
        if ((306783379 + i4) - (306783379 | i4) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    str2 = "";
                }
                if (i7 != 0) {
                    f15 = 0.0f;
                }
                if (i8 != 0) {
                    f14 = 0.0f;
                }
                if (i9 != 0) {
                    f13 = 0.0f;
                }
                if (i10 != 0) {
                    f12 = 1.0f;
                }
                f9 = i11 == 0 ? f6 : 1.0f;
                if (i12 != 0) {
                    f11 = 0.0f;
                }
                f10 = i13 == 0 ? f8 : 0.0f;
                if ((-1) - (((-1) - i3) | ((-1) - 256)) != 0) {
                    emptyPath = VectorKt.getEmptyPath();
                    i4 = (i4 - 234881025) - (i4 | (-234881025));
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((-1) - (((-1) - i3) | ((-1) - 256)) != 0) {
                    i4 = (-1) - (((-1) - i4) | ((-1) - (-234881025)));
                }
                f9 = f6;
                f10 = f8;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-213417674, i4, -1, "androidx.compose.ui.graphics.vector.Group (VectorCompose.kt:57)");
            }
            AnonymousClass1 anonymousClass1 = new Function0<GroupComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final GroupComponent invoke() {
                    return new GroupComponent();
                }
            };
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -548224868, "CC(ComposeNode)P(1,2)336@12596L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(anonymousClass1);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl, str2, new Function2<GroupComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, String str3) {
                    invoke2(groupComponent, str3);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(GroupComponent groupComponent, String str3) {
                    groupComponent.setName(str3);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, Float.valueOf(f15), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f16) {
                    invoke(groupComponent, f16.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(GroupComponent groupComponent, float f16) {
                    groupComponent.setRotation(f16);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, Float.valueOf(f14), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f16) {
                    invoke(groupComponent, f16.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(GroupComponent groupComponent, float f16) {
                    groupComponent.setPivotX(f16);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, Float.valueOf(f13), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f16) {
                    invoke(groupComponent, f16.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(GroupComponent groupComponent, float f16) {
                    groupComponent.setPivotY(f16);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, Float.valueOf(f12), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f16) {
                    invoke(groupComponent, f16.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(GroupComponent groupComponent, float f16) {
                    groupComponent.setScaleX(f16);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, Float.valueOf(f9), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$6
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f16) {
                    invoke(groupComponent, f16.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(GroupComponent groupComponent, float f16) {
                    groupComponent.setScaleY(f16);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, Float.valueOf(f11), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$7
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f16) {
                    invoke(groupComponent, f16.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(GroupComponent groupComponent, float f16) {
                    groupComponent.setTranslationX(f16);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, Float.valueOf(f10), new Function2<GroupComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$8
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, Float f16) {
                    invoke(groupComponent, f16.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(GroupComponent groupComponent, float f16) {
                    groupComponent.setTranslationY(f16);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, emptyPath, new Function2<GroupComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Group$2$9
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GroupComponent groupComponent, List<? extends PathNode> list2) {
                    invoke2(groupComponent, list2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(GroupComponent groupComponent, List<? extends PathNode> list2) {
                    groupComponent.setClipPathData(list2);
                }
            });
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 541925533, "C72@3070L9:VectorCompose.kt#huu6hf");
            int i16 = i4 >> 27;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i16 + 14) - (i16 | 14)));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            f9 = f6;
            f10 = f8;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final float f16 = f14;
            final float f17 = f13;
            final float f18 = f12;
            final float f19 = f11;
            final List<? extends PathNode> list2 = emptyPath;
            final String str3 = str2;
            final float f20 = f15;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt.Group.4
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
                    VectorComposeKt.Group(str3, f20, f16, f17, f18, f9, f19, f10, list2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Path-9cdaXJ4, reason: not valid java name */
    public static final void m4882Path9cdaXJ4(final List<? extends PathNode> list, int i2, String str, Brush brush, float f2, Brush brush2, float f3, float f4, int i3, int i4, float f5, float f6, float f7, float f8, Composer composer, final int i5, final int i6, final int i7) {
        int i8;
        int i9;
        final float f9;
        float f10 = f7;
        int defaultFillType = i2;
        float f11 = f6;
        float f12 = f5;
        int defaultStrokeLineJoin = i4;
        int defaultStrokeLineCap = i3;
        float f13 = f4;
        float f14 = f3;
        Brush brush3 = brush2;
        float f15 = f2;
        Brush brush4 = brush;
        String str2 = str;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1478270750);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Path)P(3,4:c#ui.graphics.PathFillType,2!4,10,7:c#ui.graphics.StrokeCap,8:c#ui.graphics.StrokeJoin!1,13)115@5068L876:VectorCompose.kt#huu6hf");
        if ((-1) - (((-1) - i7) | ((-1) - 1)) != 0) {
            i8 = i5 | 6;
        } else if ((i5 & 6) == 0) {
            i8 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        int i10 = (i7 + 2) - (i7 | 2);
        if (i10 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 48));
        } else if ((i5 & 48) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changed(defaultFillType) ? 32 : 16)));
        }
        int i11 = (-1) - (((-1) - i7) | ((-1) - 4));
        if (i11 != 0) {
            i8 = (i8 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i8 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i5 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i12 = composerStartRestartGroup.changed(str2) ? 256 : 128;
            i8 = (i8 + i12) - (i8 & i12);
        }
        int i13 = (-1) - (((-1) - i7) | ((-1) - 8));
        if (i13 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i5) | ((-1) - 3072)) == 0) {
            int i14 = composerStartRestartGroup.changed(brush4) ? 2048 : 1024;
            i8 = (i8 + i14) - (i8 & i14);
        }
        int i15 = i7 & 16;
        if (i15 != 0) {
            i8 = (i8 + 24576) - (i8 & 24576);
        } else if ((i5 & 24576) == 0) {
            i8 |= composerStartRestartGroup.changed(f15) ? 16384 : 8192;
        }
        int i16 = i7 & 32;
        if (i16 != 0) {
            i8 = (i8 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i8 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - i5) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changed(brush3) ? 131072 : 65536)));
        }
        int i17 = (-1) - (((-1) - i7) | ((-1) - 64));
        if (i17 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 1572864));
        } else if ((-1) - (((-1) - i5) | ((-1) - 1572864)) == 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - (composerStartRestartGroup.changed(f14) ? 1048576 : 524288)));
        }
        int i18 = (i7 + 128) - (i7 | 128);
        if (i18 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 12582912));
        } else if ((-1) - (((-1) - i5) | ((-1) - 12582912)) == 0) {
            i8 |= composerStartRestartGroup.changed(f13) ? 8388608 : 4194304;
        }
        int i19 = (-1) - (((-1) - i7) | ((-1) - 256));
        if (i19 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 100663296));
        } else if ((i5 & 100663296) == 0) {
            i8 |= composerStartRestartGroup.changed(defaultStrokeLineCap) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i20 = (-1) - (((-1) - i7) | ((-1) - 512));
        if (i20 != 0) {
            i8 = (-1) - (((-1) - i8) & ((-1) - 805306368));
        } else if ((-1) - (((-1) - i5) | ((-1) - 805306368)) == 0) {
            i8 |= composerStartRestartGroup.changed(defaultStrokeLineJoin) ? 536870912 : 268435456;
        }
        int i21 = (i7 + 1024) - (i7 | 1024);
        if (i21 != 0) {
            i9 = (-1) - (((-1) - i6) & ((-1) - 6));
        } else if ((i6 + 6) - (i6 | 6) == 0) {
            i9 = i6 | (composerStartRestartGroup.changed(f12) ? 4 : 2);
        } else {
            i9 = i6;
        }
        int i22 = (-1) - (((-1) - i7) | ((-1) - 2048));
        if (i22 != 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - 48));
        } else if ((i6 & 48) == 0) {
            i9 = (-1) - (((-1) - i9) & ((-1) - (composerStartRestartGroup.changed(f11) ? 32 : 16)));
        }
        int i23 = (-1) - (((-1) - i7) | ((-1) - 4096));
        if (i23 != 0) {
            i9 = (i9 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i9 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((i6 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i6 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i24 = composerStartRestartGroup.changed(f10) ? 256 : 128;
            i9 = (i9 + i24) - (i9 & i24);
        }
        int i25 = (-1) - (((-1) - i7) | ((-1) - 8192));
        if (i25 != 0) {
            i9 |= 3072;
        } else if ((-1) - (((-1) - i6) | ((-1) - 3072)) == 0) {
            i9 |= composerStartRestartGroup.changed(f8) ? 2048 : 1024;
        }
        if ((i8 & 306783379) != 306783378 || (-1) - (((-1) - i9) | ((-1) - 1171)) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i10 != 0) {
                defaultFillType = VectorKt.getDefaultFillType();
            }
            if (i11 != 0) {
                str2 = "";
            }
            if (i13 != 0) {
                brush4 = null;
            }
            if (i15 != 0) {
                f15 = 1.0f;
            }
            if (i16 != 0) {
                brush3 = null;
            }
            if (i17 != 0) {
                f14 = 1.0f;
            }
            if (i18 != 0) {
                f13 = 0.0f;
            }
            if (i19 != 0) {
                defaultStrokeLineCap = VectorKt.getDefaultStrokeLineCap();
            }
            if (i20 != 0) {
                defaultStrokeLineJoin = VectorKt.getDefaultStrokeLineJoin();
            }
            if (i21 != 0) {
                f12 = 4.0f;
            }
            if (i22 != 0) {
                f11 = 0.0f;
            }
            if (i23 != 0) {
                f10 = 1.0f;
            }
            f9 = i25 == 0 ? f8 : 0.0f;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1478270750, i8, i9, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:114)");
            }
            VectorComposeKt$Path$1 vectorComposeKt$Path$1 = new Function0<PathComponent>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final PathComponent invoke() {
                    return new PathComponent();
                }
            };
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1886828752, "CC(ComposeNode):Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof VectorApplier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(vectorComposeKt$Path$1);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composerStartRestartGroup);
            Updater.m3678setimpl(composerM3671constructorimpl, str2, new Function2<PathComponent, String, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, String str3) {
                    invoke2(pathComponent, str3);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PathComponent pathComponent, String str3) {
                    pathComponent.setName(str3);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, list, new Function2<PathComponent, List<? extends PathNode>, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, List<? extends PathNode> list2) {
                    invoke2(pathComponent, list2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PathComponent pathComponent, List<? extends PathNode> list2) {
                    pathComponent.setPathData(list2);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, PathFillType.m4453boximpl(defaultFillType), new Function2<PathComponent, PathFillType, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, PathFillType pathFillType) {
                    m4884invokepweu1eQ(pathComponent, pathFillType.m4459unboximpl());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-pweu1eQ, reason: not valid java name */
                public final void m4884invokepweu1eQ(PathComponent pathComponent, int i26) {
                    pathComponent.m4876setPathFillTypeoQ8Xj4U(i26);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, brush4, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush5) {
                    invoke2(pathComponent, brush5);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PathComponent pathComponent, Brush brush5) {
                    pathComponent.setFill(brush5);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, Float.valueOf(f15), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f16) {
                    invoke(pathComponent, f16.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PathComponent pathComponent, float f16) {
                    pathComponent.setFillAlpha(f16);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, brush3, new Function2<PathComponent, Brush, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$6
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Brush brush5) {
                    invoke2(pathComponent, brush5);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PathComponent pathComponent, Brush brush5) {
                    pathComponent.setStroke(brush5);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, Float.valueOf(f14), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$7
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f16) {
                    invoke(pathComponent, f16.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PathComponent pathComponent, float f16) {
                    pathComponent.setStrokeAlpha(f16);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, Float.valueOf(f13), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$8
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f16) {
                    invoke(pathComponent, f16.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PathComponent pathComponent, float f16) {
                    pathComponent.setStrokeLineWidth(f16);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, StrokeJoin.m4534boximpl(defaultStrokeLineJoin), new Function2<PathComponent, StrokeJoin, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$9
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeJoin strokeJoin) {
                    m4885invokekLtJ_vA(pathComponent, strokeJoin.m4540unboximpl());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-kLtJ_vA, reason: not valid java name */
                public final void m4885invokekLtJ_vA(PathComponent pathComponent, int i26) {
                    pathComponent.m4878setStrokeLineJoinWw9F2mQ(i26);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, StrokeCap.m4524boximpl(defaultStrokeLineCap), new Function2<PathComponent, StrokeCap, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, StrokeCap strokeCap) {
                    m4883invokeCSYIeUk(pathComponent, strokeCap.m4530unboximpl());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-CSYIeUk, reason: not valid java name */
                public final void m4883invokeCSYIeUk(PathComponent pathComponent, int i26) {
                    pathComponent.m4877setStrokeLineCapBeK7IIE(i26);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, Float.valueOf(f12), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$11
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f16) {
                    invoke(pathComponent, f16.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PathComponent pathComponent, float f16) {
                    pathComponent.setStrokeLineMiter(f16);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, Float.valueOf(f11), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$12
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f16) {
                    invoke(pathComponent, f16.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PathComponent pathComponent, float f16) {
                    pathComponent.setTrimPathStart(f16);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, Float.valueOf(f10), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$13
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f16) {
                    invoke(pathComponent, f16.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PathComponent pathComponent, float f16) {
                    pathComponent.setTrimPathEnd(f16);
                }
            });
            Updater.m3678setimpl(composerM3671constructorimpl, Float.valueOf(f9), new Function2<PathComponent, Float, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$14
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(PathComponent pathComponent, Float f16) {
                    invoke(pathComponent, f16.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PathComponent pathComponent, float f16) {
                    pathComponent.setTrimPathOffset(f16);
                }
            });
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            f9 = f8;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i26 = defaultFillType;
            final String str3 = str2;
            final Brush brush5 = brush4;
            final float f16 = f15;
            final Brush brush6 = brush3;
            final float f17 = f14;
            final float f18 = f13;
            final int i27 = defaultStrokeLineCap;
            final int i28 = defaultStrokeLineJoin;
            final float f19 = f12;
            final float f20 = f11;
            final float f21 = f10;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$3
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

                public final void invoke(Composer composer2, int i29) {
                    VectorComposeKt.m4882Path9cdaXJ4(list, i26, str3, brush5, f16, brush6, f17, f18, i27, i28, f19, f20, f21, f9, composer2, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), RecomposeScopeImplKt.updateChangedFlags(i6), i7);
                }
            });
        }
    }
}
