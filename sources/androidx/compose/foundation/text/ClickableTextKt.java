package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: ClickableText.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007\":\u0018\u007fјnjO0L͜P.hS2şs{B-cҕyCQU\"}(\tWN}gvJ`\u000fK\u000f\u001c\u0016\u0001̓4Ikxe\u0012\u00153Zİ>Aݹ\b=g_%:\u0013 J\"fz5\u0013(,`\u001e\u0007~SM\"\u0011^D\u0001<b\r{\u0004H\u00156D&\u0001,a\u007fNdN\u001dc@/1\n\u0002B|/\u00106\u0003M\u001bOl';\u0001\u0012$1@E@-%\u0002\u000f7Xa?\u0011L\n=3lW91I\u0002eNd\u0010\u0016%+}\u001cmt6\\3P\u000f\u000fW;]sc\\\u001e*\bz*\u0011L\u0006\u001e\u0006UG\\0`kܕ\rޗϢvUFa\u0010pZt\tʨN\u0017S~c/G\u001b~Q\u0010<IT={\u0013\u00126#/tQaZ\u000en\u001c3T&YaWF=VW\"Ykw4vh\u00028\u000fHG.;,\u00174\u00173Ds9Q%\u001c\u0014NDu\u0005\u001dlxUyRvO2p&7X\b:]tt\u0013{h`h.!MJX\u0017\u007f\u0018\u0013N[&?g*ƤMиŹmlSp\u00189G\u0003En\u0007k<aa^aK\u0002g\u001exjvBW\u0003bܬW٨͞W\u000e`u6<øHo\u0018z\u0002\u038bj:\u0012՞C\r"}, d2 = {"\u0011kX0^(;Z\u0019mzq;", "", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "=m7<i,K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "AnUAJ9:^", "", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|\u007f?MP<r>0j", ";`g\u0019\\5>a", "=mC2k;%O-\t\u000bm", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "=m29\\*D", "\u0011kX0^(;Z\u0019mzq;DS|Us%\u0002R", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u001brp@\u000bluS\b/\u0011M^5ZavG\u001d $n^4\u000b\u0014]K-:\u001a\u001e\u001b\u0011+V\f?g\u0014U\u0014\u0018=uzPVYW}^]K(lG]_\u0007\u001d(Ak)q\u0016c\u001co\u00048.\u001c|#)h\u001a>\u000eEb\u0011\u0006aCVgZ(hG8Em1;)S<B~6&O\u0005A\u0017C`>,\u00056\u0002C.@m\u0013\u0015H(G\\\b\u00196e\r|\r<F\"FOl?qO\u00162 q\u0011\fq9;\"s/DX\u0018\u0005l\u001be>-5g3[\u0005KSs\u0014:\u0010|Lc\u0005\u001f\u0017\u0007mzuRR\u001f\\\u0001cNN*j\u001b\u0011\u0003sm\u007f\u0012Y.", "\u0011kX0^(;Z\u0019mzq;DW#K\u0007+m ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[B\u0018M/\u000e\tYNyU@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\ff\u0014\u0011\t\u0015\tPrWFlngVULb\u007fYoC\u0004bDI+\u0018zb yXw\u000b\f\\\u000f\u0002V\u0004pu\u0011y\u000bA\"MqeO\u0011E<B~6&O\u0005A\u0017C`>,\u00056\u0002C.@m\u0013\u0015H(G\\\b\u00196e\r|\r2E\u0012LUgt\u007f\b\fr'l\u0012\u001cb~>)ntgP\u000fP;!c@km\u0001D(i\"\r`", "1n]AT0Ga\u000b\u0003\na0\u0006e9u\t'\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9uL}49Dy-3o#*XF\u0011", ">nb6g0H\\\u0003\u007f{l,\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "1n]AT0Ga\u000b\u0003\na0\u0006e9u\t'\n\bp(iR:v\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W$\u0007,D]h\u001cDi\u0018;IN>A\u0019a\n", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ClickableTextKt {
    @Deprecated(message = "\u0018Y\u0001tey-k\u0018V::2\u0016?W_@\u000e?\u0019(\r`z\u0006~ka\bcgv\fEP[k|:Z#7-&hU\b)\u0018\\CfRs\u0015\u001bU(E$\u0005GAsK[@*V^\nk1\u001c|\\\u0019N\t")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: ClickableText-4YKlhWE */
    public static final void m1319ClickableText4YKlhWE(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, boolean z2, int i2, int i3, Function1<? super TextLayoutResult, Unit> function1, final Function1<? super Integer, Unit> function12, Composer composer, final int i4, final int i5) {
        int i6;
        final ClickableTextKt$ClickableText$1 clickableTextKt$ClickableText$1 = function1;
        int iM6576getClipgIe3tQ8 = i2;
        Modifier.Companion companion = modifier;
        boolean z3 = z2;
        TextStyle textStyle2 = textStyle;
        int i7 = i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-246609449);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ClickableText)P(7,1,6,5,4:c#ui.text.style.TextOverflow!1,3)84@3976L52,85@4085L184,100@4490L76,93@4275L297:ClickableText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = (-1) - (((-1) - i4) & ((-1) - 6));
        } else if ((i4 & 6) == 0) {
            int i8 = composerStartRestartGroup.changed(annotatedString) ? 4 : 2;
            i6 = (i8 + i4) - (i8 & i4);
        } else {
            i6 = i4;
        }
        int i9 = i5 & 2;
        if (i9 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 48));
        } else if ((i4 + 48) - (i4 | 48) == 0) {
            int i10 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i6 = (i6 + i10) - (i6 & i10);
        }
        int i11 = i5 & 4;
        if (i11 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i6 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
        }
        int i12 = i5 & 8;
        if (i12 != 0) {
            i6 |= 3072;
        } else if ((-1) - (((-1) - i4) | ((-1) - 3072)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(z3) ? 2048 : 1024)));
        }
        int i13 = (i5 + 16) - (i5 | 16);
        if (i13 != 0) {
            i6 = (i6 + 24576) - (i6 & 24576);
        } else if ((i4 + 24576) - (i4 | 24576) == 0) {
            int i14 = composerStartRestartGroup.changed(iM6576getClipgIe3tQ8) ? 16384 : 8192;
            i6 = (i6 + i14) - (i6 & i14);
        }
        int i15 = (-1) - (((-1) - i5) | ((-1) - 32));
        if (i15 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE));
        } else if ((-1) - (((-1) - i4) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(i7) ? 131072 : 65536)));
        }
        int i16 = (i5 + 64) - (i5 | 64);
        if (i16 != 0) {
            i6 |= 1572864;
        } else if ((i4 + 1572864) - (i4 | 1572864) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(clickableTextKt$ClickableText$1) ? 1048576 : 524288;
        }
        if ((i5 & 128) != 0) {
            i6 |= 12582912;
        } else if ((-1) - (((-1) - i4) | ((-1) - 12582912)) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changedInstance(function12) ? 8388608 : 4194304)));
        }
        if ((4793491 & i6) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i9 != 0) {
                companion = Modifier.Companion;
            }
            if (i11 != 0) {
                textStyle2 = TextStyle.Companion.getDefault();
            }
            if (i12 != 0) {
                z3 = true;
            }
            if (i13 != 0) {
                iM6576getClipgIe3tQ8 = TextOverflow.Companion.m6576getClipgIe3tQ8();
            }
            if (i15 != 0) {
                i7 = Integer.MAX_VALUE;
            }
            if (i16 != 0) {
                clickableTextKt$ClickableText$1 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextLayoutResult textLayoutResult) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }
                };
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-246609449, i6, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:83)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1498074812, "CC(remember):ClickableText.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier.Companion companion2 = Modifier.Companion;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1498078432, "CC(remember):ClickableText.kt#9igjgp");
            boolean z4 = (29360128 & i6) == 8388608;
            ClickableTextKt$ClickableText$pressIndicator$1$1 clickableTextKt$ClickableText$pressIndicator$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || clickableTextKt$ClickableText$pressIndicator$1$1RememberedValue == Composer.Companion.getEmpty()) {
                clickableTextKt$ClickableText$pressIndicator$1$1RememberedValue = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function12, null);
                composerStartRestartGroup.updateRememberedValue(clickableTextKt$ClickableText$pressIndicator$1$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierThen = companion.then(SuspendingPointerInputFilterKt.pointerInput(companion2, function12, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) clickableTextKt$ClickableText$pressIndicator$1$1RememberedValue));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1498091284, "CC(remember):ClickableText.kt#9igjgp");
            boolean z5 = (i6 + 3670016) - (i6 | 3670016) == 1048576;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextLayoutResult textLayoutResult) {
                        mutableState.setValue(textLayoutResult);
                        clickableTextKt$ClickableText$1.invoke(textLayoutResult);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i17 = (58254 + i6) - (58254 | i6);
            int i18 = (-1) - (((-1) - (i6 << 6)) | ((-1) - 458752));
            TextStyle textStyle3 = textStyle2;
            int i19 = iM6576getClipgIe3tQ8;
            boolean z6 = z3;
            BasicTextKt.m1312BasicTextRWo7tUw(annotatedString, modifierThen, textStyle3, (Function1) objRememberedValue2, i19, z6, i7, 0, null, null, composerStartRestartGroup, (-1) - (((-1) - ((i17 + i18) - (i17 & i18))) & ((-1) - ((-1) - (((-1) - (i6 << 3)) | ((-1) - 3670016))))), 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final TextStyle textStyle4 = textStyle2;
            final boolean z7 = z3;
            final int i20 = iM6576getClipgIe3tQ8;
            final int i21 = i7;
            final Function1<? super TextLayoutResult, Unit> function13 = clickableTextKt$ClickableText$1;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
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

                public final void invoke(Composer composer2, int i22) {
                    AnnotatedString annotatedString2 = annotatedString;
                    Modifier modifier3 = modifier2;
                    TextStyle textStyle5 = textStyle4;
                    boolean z8 = z7;
                    int i23 = i20;
                    int i24 = i21;
                    Function1<TextLayoutResult, Unit> function14 = function13;
                    Function1<Integer, Unit> function15 = function12;
                    int i25 = i4;
                    ClickableTextKt.m1319ClickableText4YKlhWE(annotatedString2, modifier3, textStyle5, z8, i23, i24, function14, function15, composer2, RecomposeScopeImplKt.updateChangedFlags((i25 + 1) - (i25 & 1)), i5);
                }
            });
        }
    }

    @Deprecated(message = "\u0018Y\u0001tey-k\u0018V::2\u0016?W_@\u000e?\u0019(\r`z\u0006~ka\bcgv\fEP[k|:Z#7-&hU\b)\u0018\\CfRs\u0015\u001bU(E$\u0005GAsK[@*V^\nk1\u001c|\\\u0019N\t")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: ClickableText-03UYbkw */
    public static final void m1318ClickableText03UYbkw(final AnnotatedString annotatedString, final Function1<? super Integer, Unit> function1, Modifier modifier, TextStyle textStyle, boolean z2, int i2, int i3, Function1<? super TextLayoutResult, Unit> function12, final Function1<? super Integer, Unit> function13, Composer composer, final int i4, final int i5) {
        int i6;
        final ClickableTextKt$ClickableText$4 clickableTextKt$ClickableText$4 = function12;
        int i7 = i3;
        int iM6576getClipgIe3tQ8 = i2;
        boolean z3 = z2;
        TextStyle textStyle2 = textStyle;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1020774372);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ClickableText)P(8,3,1,7,6,5:c#ui.text.style.TextOverflow!1,4)163@7538L52,164@7616L24,171@7916L413,193@8556L76,186@8335L303:ClickableText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = (i4 + 6) - (i4 & 6);
        } else if ((i4 + 6) - (i4 | 6) == 0) {
            i6 = (composerStartRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((-1) - (((-1) - i5) | ((-1) - 2)) != 0) {
            i6 = (i6 + 48) - (i6 & 48);
        } else if ((i4 + 48) - (i4 | 48) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changedInstance(function1) ? 32 : 16)));
        }
        int i8 = (-1) - (((-1) - i5) | ((-1) - 4));
        if (i8 != 0) {
            i6 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i6 |= composerStartRestartGroup.changed(companion) ? 256 : 128;
        }
        int i9 = (-1) - (((-1) - i5) | ((-1) - 8));
        if (i9 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 3072));
        } else if ((-1) - (((-1) - i4) | ((-1) - 3072)) == 0) {
            int i10 = composerStartRestartGroup.changed(textStyle2) ? 2048 : 1024;
            i6 = (i6 + i10) - (i6 & i10);
        }
        int i11 = i5 & 16;
        if (i11 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 24576));
        } else if ((i4 & 24576) == 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - (composerStartRestartGroup.changed(z3) ? 16384 : 8192)));
        }
        int i12 = i5 & 32;
        if (i12 != 0) {
            i6 = (i6 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i6 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
        } else if ((-1) - (((-1) - i4) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            int i13 = composerStartRestartGroup.changed(iM6576getClipgIe3tQ8) ? 131072 : 65536;
            i6 = (i6 + i13) - (i6 & i13);
        }
        int i14 = (-1) - (((-1) - i5) | ((-1) - 64));
        if (i14 != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 1572864));
        } else if ((-1) - (((-1) - i4) | ((-1) - 1572864)) == 0) {
            int i15 = composerStartRestartGroup.changed(i7) ? 1048576 : 524288;
            i6 = (i6 + i15) - (i6 & i15);
        }
        int i16 = (i5 + 128) - (i5 | 128);
        if (i16 != 0) {
            i6 |= 12582912;
        } else if ((i4 + 12582912) - (i4 | 12582912) == 0) {
            int i17 = composerStartRestartGroup.changedInstance(clickableTextKt$ClickableText$4) ? 8388608 : 4194304;
            i6 = (i6 + i17) - (i6 & i17);
        }
        if ((i5 & 256) != 0) {
            i6 |= 100663296;
        } else if ((i4 & 100663296) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function13) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((38347923 & i6) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i8 != 0) {
                companion = Modifier.Companion;
            }
            if (i9 != 0) {
                textStyle2 = TextStyle.Companion.getDefault();
            }
            if (i11 != 0) {
                z3 = true;
            }
            if (i12 != 0) {
                iM6576getClipgIe3tQ8 = TextOverflow.Companion.m6576getClipgIe3tQ8();
            }
            if (i14 != 0) {
                i7 = Integer.MAX_VALUE;
            }
            if (i16 != 0) {
                clickableTextKt$ClickableText$4 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$4
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextLayoutResult textLayoutResult) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }
                };
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1020774372, i6, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:162)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1498188796, "CC(remember):ClickableText.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier.Companion companion2 = Modifier.Companion;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1498201253, "CC(remember):ClickableText.kt#9igjgp");
            int i18 = (-1) - (((-1) - ((composerStartRestartGroup.changedInstance(coroutineScope) ? 1 : 0) | ((i6 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) == 32 ? 1 : 0))) & ((-1) - ((234881024 & i6) == 67108864 ? 1 : 0)));
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (i18 != 0 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (Function2) new ClickableTextKt$ClickableText$pointerInputModifier$1$1(coroutineScope, function1, mutableState, function13, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierThen = companion.then(SuspendingPointerInputFilterKt.pointerInput(companion2, function13, function1, (Function2) objRememberedValue3));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1498221396, "CC(remember):ClickableText.kt#9igjgp");
            boolean z4 = (-1) - (((-1) - 29360128) | ((-1) - i6)) == 8388608;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                        invoke2(textLayoutResult);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(TextLayoutResult textLayoutResult) {
                        mutableState.setValue(textLayoutResult);
                        clickableTextKt$ClickableText$4.invoke(textLayoutResult);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            int i19 = i6 >> 3;
            TextStyle textStyle3 = textStyle2;
            int i20 = iM6576getClipgIe3tQ8;
            boolean z5 = z3;
            BasicTextKt.m1312BasicTextRWo7tUw(annotatedString, modifierThen, textStyle3, (Function1) objRememberedValue4, i20, z5, i7, 0, null, null, composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - (i6 & 14)) & ((-1) - ((i19 + 896) - (896 | i19)))))) & ((-1) - ((-1) - (((-1) - i19) | ((-1) - 57344))))))) & ((-1) - ((-1) - (((-1) - (i6 << 3)) | ((-1) - 458752))))))) & ((-1) - ((i6 + 3670016) - (i6 | 3670016)))), 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final TextStyle textStyle4 = textStyle2;
            final boolean z6 = z3;
            final int i21 = iM6576getClipgIe3tQ8;
            final int i22 = i7;
            final Function1<? super TextLayoutResult, Unit> function14 = clickableTextKt$ClickableText$4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$6
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
                    ClickableTextKt.m1318ClickableText03UYbkw(annotatedString, function1, modifier2, textStyle4, z6, i21, i22, function14, function13, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i4) & ((-1) - 1))), i5);
                }
            });
        }
    }

    public static final Integer ClickableText_03UYbkw$getOffset(MutableState<TextLayoutResult> mutableState, long j2) {
        MultiParagraph multiParagraph;
        TextLayoutResult value = mutableState.getValue();
        if (value == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return null;
        }
        if (!m1320containsWithinBoundsUv8p0NA(multiParagraph, j2)) {
            multiParagraph = null;
        }
        if (multiParagraph != null) {
            return Integer.valueOf(multiParagraph.m5989getOffsetForPositionk4lQ0M(j2));
        }
        return null;
    }

    /* JADX INFO: renamed from: containsWithinBounds-Uv8p0NA */
    private static final boolean m1320containsWithinBoundsUv8p0NA(MultiParagraph multiParagraph, long j2) {
        float fM3937getXimpl = Offset.m3937getXimpl(j2);
        float fM3938getYimpl = Offset.m3938getYimpl(j2);
        return fM3937getXimpl > 0.0f && fM3938getYimpl >= 0.0f && fM3937getXimpl <= multiParagraph.getWidth() && fM3938getYimpl <= multiParagraph.getHeight();
    }
}
