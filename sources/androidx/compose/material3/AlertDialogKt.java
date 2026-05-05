package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
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
/* JADX INFO: compiled from: AlertDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!4i\bDJi|\u0004W\u00068\u000b4D\u0007\":\u0012\u007fјnjO0L͜P.hS2şs{J$cҕyCQU\"}(\u000eWN}gvϺb\u000bY\u000f\u000e\u0016~{D\nc\u0005u\u0012=?ryMAeuM;ptd\u0012NAR>\u007f\u0005\u000f*BH>\b+IQ\f BXphe=\\\u0013.*\u0011N\"\u0011\u001e\u000bt|EՂp]@Di\bݦFN5uHƎL\u001b]l';\u0004\u0012-9XO@%'c\u00035_\nNƄCqC\u001a\u0019--+W\u0004o6\u0007\u0011D&9h%j\u0003(l\u0005\u007fm\"&Y^ӍOP\u0014=(\f\n'T\u0011\u001e\b7H\\:0e6\u001d\u07baxrYU\u0001\u0013l]\u0018\bq8'%.@A8IuЂe;\u001fcg\u007f\u0013)6#/\fQ_b,x\u0015Is(U?qX=vM:]K\u000f\u001cp\u0011!Z\b>i\u0018/*0^\u001b3Zs9Q@\u001c\u0006Vh\u007fv3\u007f/RؘQ̲غ&p\u001c\\8/$\u000eR\f\u001dk~a\t0\u001fu4T5|8\u0017.\u0006\u0010<O$@]]|\u0002u]_\u001a%]sehˇo\u000e]N%2ΉPүߧeT|>MgzۻWtnk\f\tiX,@V\u0003\u0016\b}TN: `N\"+BYI$l\u0017X\u0003LOo\fȤcZn%/XA4\u001biR\u00069\u0012^\u000b\t|wzY,+m8,o`ڤ\u001d&[7\u0019E\u000b<\u001f\f\u0004\u0002WgzTbkD\u0005ʀ\u007f \u001c/ib=W+\u001c\u000f+B\u0002[Rbq\u0014`̊\u0016'\u0001\u0012* I\u0004Ft\u0018l\u0001,\u000fw`N\u0003&Ȕz^x88h\u000e\u0016yF)d\u0014X\u0019yVI!\"\n@\\Z\u0015\u0005M=U\u0005}E\u00155[bW!$\u001c,/C\u0001\u000em}N\u0012b=%%i\u0012>{\u0016\u001eu\u0018\\ҟ:ͯա]\u0001DQ2\u001d\u001b\u0003V\u001c\u0010\bp\u0016d\u0017AVYj\u0001XHM9<,u72\u0013pdkR\u0013\u001e\u000fd4e*\u0002U\u0016\u0014\rVU [g\u007fx}Ml\u000bx\u001c8\u001a֭5n\u00181\u0004%ݫ[b\u0017F&\u0002&ܽY;\u0011\u0004\u0013ʂ&Ҭ0>\u0010\u000bQT\n\u0014\u001e{\u0018F\u000e\u000emϫDǠ?X\u0016T\u0007\\v\\\u0013b]`O)Wϔ\u0011ʟ\"\u0001=1\u0013m^V5f@\u0005s1\u0017 \u0003O-e{ľFȗ=#0X\u000f\u000b]_IO\u0010:$S7t\u0004o:@nԀ\u001fÐ\u001c\u001bAܱ1k\u00059v\u000b\u0004l%ЉxՆjRVÝI\u000b\t\u0007&<8\u0017aĂQζsb5ًn\u0004EN2\u0001EL\u007fܐ\u000eƔgF#Ҏݥ52ELṕC*Vŀ?0"}, d2 = {"\u0010tcAb5L1&\t\tl\b\u0010\r=S\u000b$yD\n\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u0010tcAb5L;\u0015\u0003\u0004:?\u0001\u0017\u001dp{&\u007fI\u0003", "\u0012hP9b.&O,p~];\u007f", "5dc\u0011\\(E]\u001bfvq\u001e\u0001\b>h", "u(5", "\u0012hP9b.&W\"p~];\u007f", "5dc\u0011\\(E]\u001bf~g\u001e\u0001\b>h", "\u0012hP9b.)O\u0018}~g.", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "\u0017b^;C(=R\u001d\b|", "\"dgAC(=R\u001d\b|", "\"hc9X\u0017:R\u0018\u0003\u0004`", "\u000fkT?g\u000bBO \t|", "", "=m36f4Ba'kzj<|\u0017>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", ">q^=X9MW\u0019\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006U)1`\b\"\"z 9MPJo4,j", "1n]AX5M", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJixV\u0017M8\u0017\tXTmlN?*\u0012:IKKlJ\u001e\u001a\u00174t\u0003\f5\u0014C\u0001\u001fw,6rQYl\tKAS8\u0011j\u0016n$`C\u0004)%yb\u001cxY,\u0019\u007f]\u001a\u0001\u001cZwpE(~B-\u000bCBBNnbFx&2\u0015y\u0002\u001a=b\u0003+>:\u0014=9:l\u0005\u0015E\"Fi\u0003#,i\u0017\u000b\ny-", "\u000fkT?g\u000bBO \t|<6\u0006\u0018/n\u000f", "0tcAb5L", "7b^;", "Bhc9X", "BdgA", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "1n]AT0GS&\\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "Bn]._\fES*z\nb6\u0006", "0tcAb5\u001c]\"\u000ezg;Z\u00136o\r", "7b^;66Gb\u0019\b\n<6\u0004\u0013<", "Bhc9X\nH\\(~\u0004m\n\u0007\u00109r", "BdgA66Gb\u0019\b\n<6\u0004\u0013<", "\u000fkT?g\u000bBO \t|<6\u0006\u0018/n\u000foJC\u0012#xVK", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0014O{{K8oJb)~XI\u000fc:m\nn!fCHmt\u0002\"\u0019wT8\u0013H)wx\\\tnkPb\u007fI,\bnkOC~YF}5h,\f\u0001\u0010A\\~4A\u0003j035q\u000fOf+\b\\\u0003\u001d7fO'oF@\\AX_\u0001oB\fvhO\u000b\nm5\u0007}FJH-smY ZBkc\u007fJ\u001c\u0004HQz\u001f5FHOk\u0003$\r\u000f$7CSK&^\u000f\u001a}\u001a\u0006CtFs", "\u000fkT?g\u000bBO \t|?3\u0007\u001b\u001co\u0012", ";`X;4?Ba\u0007\nv\\0\u0006\u000b", "1q^@f\bQW'l\u0006Z*\u0001\u00121", "\u000fkT?g\u000bBO \t|?3\u0007\u001b\u001co\u0012o\u007fS\fh\u0016JB", "uE5\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007l\rT\u00127LPEo31^fkA\u0012m:N@4WU]0dR<\u001b\u001e\u001ae\u0018\\+\u001aZ=\u0005\u0015", "\u000fkT?g\u000bBO \t|B4\b\u0010", "1n]3\\9F0)\u000e\nh5", "2hb:\\:L0)\u000e\nh5", "\u000fkT?g\u000bBO \t|B4\b\u0010vw\r1\u000eU\u0003v", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u0011\u0010_u?itCZ\u0010TO{{K8oJb)~XI\u000fc:m\nn!fCHmt\u0002\"\u0019wT8\u0013H)wx\\\tnkPb\u007fI,\bnkOC~YF}5h,\f\u0001\u0010A\\~4A\u0003j:4Ek\tT1\u001dOfB\u0016<e?6*@E!\t,s~jM\u0012r(.]th?@ in-M \u000f'\u0018k>_n\u0005A[\u0014\b*\u007f\u001e%U\u0003LdFjo\u0003-lrSG\u001agJ\u0018zL-i\u001f\u0003Lv\u001ce0#9d\u0012l(m\u0001;\u0016\u0005s8a`>(yQ/\fvJ\u007fe[n7\u007fv\u001bQ,=Y<@bG9\"\u001a=\u007f\u0015\u0011fRm>\u0001@\u0015\u00102Gd8oo3\u000bu)\t\u0015p7))10\u0015\u001c>xf\u00031#}Wu\r\u001elB@\u0002|\u001fSr-FqK\u0012\u0012>6S\u001d", "\u0010`b6V\bES&\u000eYb(\u0004\u00131", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AlertDialogKt {
    private static final PaddingValues DialogPadding;
    private static final PaddingValues IconPadding;
    private static final PaddingValues TextPadding;
    private static final PaddingValues TitlePadding;
    private static final float DialogMinWidth = Dp.m6638constructorimpl(280);
    private static final float DialogMaxWidth = Dp.m6638constructorimpl(560);
    private static final float ButtonsMainAxisSpacing = Dp.m6638constructorimpl(8);
    private static final float ButtonsCrossAxisSpacing = Dp.m6638constructorimpl(12);

    public static final void BasicAlertDialog(final Function0<Unit> function0, Modifier modifier, DialogProperties dialogProperties, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2, final int i3) {
        int i4;
        final DialogProperties dialogProperties2 = dialogProperties;
        final Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1922902937);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicAlertDialog)P(2,1,3)149@6931L384,146@6839L476:AlertDialog.kt#uh7d8r");
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((i2 + 6) - (i2 | 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 48));
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = (i3 + 4) - (4 | i3);
        if (i7 != 0) {
            i4 = (i4 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i4 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(dialogProperties2) ? 256 : 128)));
        }
        if ((i3 + 8) - (8 | i3) != 0) {
            i4 |= 3072;
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i4 + 1171) - (1171 | i4) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                companion = Modifier.Companion;
            }
            if (i7 != 0) {
                dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1922902937, i4, -1, "androidx.compose.material3.BasicAlertDialog (AlertDialog.kt:145)");
            }
            int i8 = i4 >> 3;
            AndroidDialog_androidKt.Dialog(function0, dialogProperties2, ComposableLambdaKt.rememberComposableLambda(905289008, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt.BasicAlertDialog.1
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

                public final void invoke(Composer composer2, int i9) {
                    ComposerKt.sourceInformation(composer2, "C150@6969L25,155@7183L37,151@7003L306:AlertDialog.kt#uh7d8r");
                    if ((-1) - (((-1) - i9) | ((-1) - 3)) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(905289008, i9, -1, "androidx.compose.material3.BasicAlertDialog.<anonymous> (AlertDialog.kt:150)");
                        }
                        Strings.Companion companion2 = Strings.Companion;
                        final String strM2993getString2EP1pXo = Strings_androidKt.m2993getString2EP1pXo(Strings.m2923constructorimpl(R.string.m3c_dialog), composer2, 0);
                        Modifier modifierM1067sizeInqDBjuR0$default = SizeKt.m1067sizeInqDBjuR0$default(companion, AlertDialogKt.getDialogMinWidth(), 0.0f, AlertDialogKt.getDialogMaxWidth(), 0.0f, 10, null);
                        Modifier.Companion companion3 = Modifier.Companion;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1349419811, "CC(remember):AlertDialog.kt#9igjgp");
                        boolean zChanged = composer2.changed(strM2993getString2EP1pXo);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$BasicAlertDialog$1$1$1
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
                                    SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM2993getString2EP1pXo);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        Modifier modifierThen = modifierM1067sizeInqDBjuR0$default.then(SemanticsModifierKt.semantics$default(companion3, false, (Function1) objRememberedValue, 1, null));
                        Function2<Composer, Integer, Unit> function22 = function2;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierThen);
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
                        ComposerKt.sourceInformationMarkerStart(composer2, 1061665763, "C158@7290L9:AlertDialog.kt#uh7d8r");
                        function22.invoke(composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i4 & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT | ((i8 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i8 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt.BasicAlertDialog.2
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

                public final void invoke(Composer composer2, int i9) {
                    AlertDialogKt.BasicAlertDialog(function0, companion, dialogProperties2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    @Deprecated(message = "\u0018Y\u0001tSu(`[(4\u007fb)\u0010W]X\u0018.Dq\u001ae\u000bKon", replaceWith = @ReplaceWith(expression = "BasicAlertDialog(onDismissRequest, modifier, properties, content)", imports = {}))
    @InterfaceC1492Gx
    public static final void AlertDialog(final Function0<Unit> function0, Modifier modifier, DialogProperties dialogProperties, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2, final int i3) {
        int i4;
        DialogProperties dialogProperties2 = dialogProperties;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(325249497);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AlertDialog)P(2,1,3)201@8986L65:AlertDialog.kt#uh7d8r");
        if ((i3 + 1) - (i3 | 1) != 0) {
            i4 = (i2 + 6) - (i2 & 6);
        } else if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = (i3 + 2) - (i3 | 2);
        if (i5 != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((i2 + 48) - (i2 | 48) == 0) {
            int i6 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i4 = (i4 + i6) - (i4 & i6);
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT));
        } else if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i4 |= composerStartRestartGroup.changed(dialogProperties2) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024)));
        }
        if ((i4 + 1171) - (1171 | i4) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                companion = Modifier.Companion;
            }
            if (i7 != 0) {
                dialogProperties2 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(325249497, i4, -1, "androidx.compose.material3.AlertDialog (AlertDialog.kt:201)");
            }
            BasicAlertDialog(function0, companion, dialogProperties2, function2, composerStartRestartGroup, (-1) - (((-1) - i4) | ((-1) - 8190)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = companion;
            final DialogProperties dialogProperties3 = dialogProperties2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt.AlertDialog.1
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
                    AlertDialogKt.AlertDialog(function0, modifier2, dialogProperties3, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: AlertDialogImpl-wrnwzgE, reason: not valid java name */
    public static final void m1775AlertDialogImplwrnwzgE(final Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, final Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Shape shape, final long j2, final long j3, final long j4, final long j5, final float f2, final DialogProperties dialogProperties, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-919826268);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AlertDialogImpl)P(6!1,5,2,3,11,9,8,1:c#ui.graphics.Color,4:c#ui.graphics.Color,12:c#ui.graphics.Color,10:c#ui.graphics.Color,13:c#ui.unit.Dp)251@10652L1109,247@10522L1239:AlertDialog.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        final Function2<? super Composer, ? super Integer, Unit> function26 = function2;
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function26) ? 32 : 16;
        }
        if ((i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i2 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(modifier) ? 256 : 128)));
        }
        final Function2<? super Composer, ? super Integer, Unit> function27 = function22;
        if ((i2 + 3072) - (i2 | 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function27) ? 2048 : 1024;
        }
        final Function2<? super Composer, ? super Integer, Unit> function28 = function23;
        if ((-1) - (((-1) - i2) | ((-1) - 24576)) == 0) {
            int i6 = composerStartRestartGroup.changedInstance(function28) ? 16384 : 8192;
            i4 = (i4 + i6) - (i4 & i6);
        }
        final Function2<? super Composer, ? super Integer, Unit> function29 = function24;
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changedInstance(function29) ? 131072 : 65536)));
        }
        final Function2<? super Composer, ? super Integer, Unit> function210 = function25;
        if ((i2 & 1572864) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(function210) ? 1048576 : 524288;
            i4 = (i4 + i7) - (i4 & i7);
        }
        final Shape shape2 = shape;
        if ((i2 & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changed(shape2) ? 8388608 : 4194304;
        }
        if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(j2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432)));
        }
        if ((-1) - (((-1) - i2) | ((-1) - 805306368)) == 0) {
            i4 |= composerStartRestartGroup.changed(j3) ? 536870912 : 268435456;
        }
        if ((i3 + 6) - (i3 | 6) == 0) {
            int i8 = composerStartRestartGroup.changed(j4) ? 4 : 2;
            i5 = (i3 + i8) - (i3 & i8);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(j5) ? 32 : 16;
        }
        if ((i3 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (i3 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i9 = composerStartRestartGroup.changed(f2) ? 256 : 128;
            i5 = (i5 + i9) - (i5 & i9);
        }
        if ((i3 & 3072) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(dialogProperties) ? 2048 : 1024)));
        }
        if ((306783379 & i4) == 306783378 && (i5 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-919826268, i4, i5, "androidx.compose.material3.AlertDialogImpl (AlertDialog.kt:247)");
            }
            function28 = function28;
            function29 = function29;
            function210 = function210;
            shape2 = shape2;
            function27 = function27;
            function26 = function26;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1852840226, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$1
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

                public final void invoke(Composer composer2, int i10) {
                    ComposerKt.sourceInformation(composer2, "C253@10704L294,272@11590L5,252@10662L1093:AlertDialog.kt#uh7d8r");
                    if ((i10 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1852840226, i10, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous> (AlertDialog.kt:252)");
                        }
                        final Function2<Composer, Integer, Unit> function211 = function27;
                        final Function2<Composer, Integer, Unit> function212 = function26;
                        AlertDialogKt.m1773AlertDialogContent4hvqGtA(ComposableLambdaKt.rememberComposableLambda(1163543932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$1.1
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
                                ComposerKt.sourceInformation(composer3, "C257@10885L99,254@10722L262:AlertDialog.kt#uh7d8r");
                                if ((i11 + 3) - (3 | i11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1163543932, i11, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous> (AlertDialog.kt:254)");
                                    }
                                    float f3 = AlertDialogKt.ButtonsMainAxisSpacing;
                                    float f4 = AlertDialogKt.ButtonsCrossAxisSpacing;
                                    final Function2<Composer, Integer, Unit> function213 = function211;
                                    final Function2<Composer, Integer, Unit> function214 = function212;
                                    AlertDialogKt.m1774AlertDialogFlowRowixp7dh8(f3, f4, ComposableLambdaKt.rememberComposableLambda(1887135077, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt.AlertDialogImpl.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i12) {
                                            ComposerKt.sourceInformation(composer4, "C259@10951L15:AlertDialog.kt#uh7d8r");
                                            if ((-1) - (((-1) - i12) | ((-1) - 3)) != 2 || !composer4.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1887135077, i12, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:258)");
                                                }
                                                Function2<Composer, Integer, Unit> function215 = function213;
                                                composer4.startReplaceGroup(1497073862);
                                                ComposerKt.sourceInformation(composer4, "258@10922L8");
                                                if (function215 != null) {
                                                    function215.invoke(composer4, 0);
                                                    Unit unit = Unit.INSTANCE;
                                                }
                                                composer4.endReplaceGroup();
                                                function214.invoke(composer4, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }, composer3, 54), composer3, 438);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), null, function28, function29, function210, shape2, j2, f2, ColorSchemeKt.getValue(DialogTokens.INSTANCE.getActionLabelTextColor(), composer2, 6), j3, j4, j5, composer2, 6, 0, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            int i10 = i4 >> 3;
            int i11 = (-1) - (((-1) - ((-1) - (((-1) - (i4 & 14)) & ((-1) - 3072)))) & ((-1) - ((i10 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i10 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))));
            int i12 = i5 >> 3;
            int i13 = (i12 + 896) - (i12 | 896);
            BasicAlertDialog(function0, modifier, dialogProperties, composableLambdaRememberComposableLambda, composerStartRestartGroup, (i13 + i11) - (i13 & i11), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function2<? super Composer, ? super Integer, Unit> function211 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function212 = function27;
            final Function2<? super Composer, ? super Integer, Unit> function213 = function28;
            final Function2<? super Composer, ? super Integer, Unit> function214 = function29;
            final Function2<? super Composer, ? super Integer, Unit> function215 = function210;
            final Shape shape3 = shape2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$2
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

                public final void invoke(Composer composer2, int i14) {
                    AlertDialogKt.m1775AlertDialogImplwrnwzgE(function0, function211, modifier, function212, function213, function214, function215, shape3, j2, j3, j4, j5, f2, dialogProperties, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))), RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
    }

    /* JADX INFO: renamed from: AlertDialogContent-4hvqGtA, reason: not valid java name */
    public static final void m1773AlertDialogContent4hvqGtA(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Shape shape, final long j2, float f2, final long j3, final long j4, final long j5, final long j6, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        Composer composer2;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1522575799);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AlertDialogContent)P(1,5,3,9,7,6,2:c#ui.graphics.Color,11:c#ui.unit.Dp,0:c#ui.graphics.Color,4:c#ui.graphics.Color,10:c#ui.graphics.Color,8:c#ui.graphics.Color)299@12328L2062,294@12188L2202:AlertDialog.kt#uh7d8r");
        final Function2<? super Composer, ? super Integer, Unit> function25 = function2;
        if ((i4 + 1) - (i4 | 1) != 0) {
            i5 = (-1) - (((-1) - i2) & ((-1) - 6));
        } else if ((i2 & 6) == 0) {
            int i7 = composerStartRestartGroup.changedInstance(function25) ? 4 : 2;
            i5 = (i7 + i2) - (i7 & i2);
        } else {
            i5 = i2;
        }
        int i8 = i4 & 2;
        if (i8 != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 48));
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            int i9 = composerStartRestartGroup.changed(companion) ? 32 : 16;
            i5 = (i5 + i9) - (i5 & i9);
        }
        final Function2<? super Composer, ? super Integer, Unit> function26 = function22;
        if ((i4 + 4) - (i4 | 4) != 0) {
            i5 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            int i10 = composerStartRestartGroup.changedInstance(function26) ? 256 : 128;
            i5 = (i5 + i10) - (i5 & i10);
        }
        final Function2<? super Composer, ? super Integer, Unit> function27 = function23;
        if ((i4 + 8) - (i4 | 8) != 0) {
            i5 = (i5 + 3072) - (i5 & 3072);
        } else if ((i2 + 3072) - (i2 | 3072) == 0) {
            int i11 = composerStartRestartGroup.changedInstance(function27) ? 2048 : 1024;
            i5 = (i5 + i11) - (i5 & i11);
        }
        final Function2<? super Composer, ? super Integer, Unit> function28 = function24;
        if ((-1) - (((-1) - i4) | ((-1) - 16)) != 0) {
            i5 = (i5 + 24576) - (i5 & 24576);
        } else if ((i2 + 24576) - (i2 | 24576) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function28) ? 16384 : 8192;
        }
        Shape shape2 = shape;
        if ((i4 & 32) != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((-1) - (((-1) - i2) | ((-1) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE)) == 0) {
            int i12 = composerStartRestartGroup.changed(shape2) ? 131072 : 65536;
            i5 = (i5 + i12) - (i5 & i12);
        }
        if ((i4 + 64) - (i4 | 64) != 0) {
            i5 |= 1572864;
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            i5 |= composerStartRestartGroup.changed(j2) ? 1048576 : 524288;
        }
        float f3 = f2;
        if ((i4 & 128) != 0) {
            i5 |= 12582912;
        } else if ((-1) - (((-1) - i2) | ((-1) - 12582912)) == 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - (composerStartRestartGroup.changed(f3) ? 8388608 : 4194304)));
        }
        if ((i4 & 256) != 0) {
            i5 = (-1) - (((-1) - i5) & ((-1) - 100663296));
        } else if ((i2 + 100663296) - (i2 | 100663296) == 0) {
            i5 |= composerStartRestartGroup.changed(j3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i4 + 512) - (i4 | 512) != 0) {
            i5 = (i5 + 805306368) - (i5 & 805306368);
        } else if ((i2 + 805306368) - (i2 | 805306368) == 0) {
            int i13 = composerStartRestartGroup.changed(j4) ? 536870912 : 268435456;
            i5 = (i5 + i13) - (i5 & i13);
        }
        if ((i4 & 1024) != 0) {
            i6 = i3 | 6;
        } else if ((i3 + 6) - (i3 | 6) == 0) {
            i6 = i3 | (composerStartRestartGroup.changed(j5) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i4 + 2048) - (i4 | 2048) != 0) {
            i6 = (-1) - (((-1) - i6) & ((-1) - 48));
        } else if ((i3 & 48) == 0) {
            int i14 = composerStartRestartGroup.changed(j6) ? 32 : 16;
            i6 = (i6 + i14) - (i6 & i14);
        }
        if ((-1) - (((-1) - 306783379) | ((-1) - i5)) != 306783378 || (i6 + 19) - (19 | i6) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i8 != 0) {
                companion = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1522575799, i5, i6, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:293)");
            }
            function26 = function26;
            function27 = function27;
            function28 = function28;
            function25 = function25;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-2126308228, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1
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

                public final void invoke(Composer composer3, int i15) {
                    int i16;
                    ComposerKt.sourceInformation(composer3, "C300@12338L2046:AlertDialog.kt#uh7d8r");
                    if ((i15 + 3) - (3 | i15) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2126308228, i15, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:300)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(Modifier.Companion, AlertDialogKt.DialogPadding);
                        final Function2<Composer, Integer, Unit> function29 = function26;
                        final Function2<Composer, Integer, Unit> function210 = function27;
                        final Function2<Composer, Integer, Unit> function211 = function28;
                        long j7 = j4;
                        long j8 = j5;
                        long j9 = j6;
                        long j10 = j3;
                        Function2<Composer, Integer, Unit> function212 = function25;
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierPadding);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer3);
                        Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                        final ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, 455478874, "C343@14042L332:AlertDialog.kt#uh7d8r");
                        composer3.startReplaceGroup(-1924971291);
                        ComposerKt.sourceInformation(composer3, "*302@12501L165,302@12431L235");
                        if (function29 != null) {
                            ProvidedValue<Color> providedValueProvides = ContentColorKt.getLocalContentColor().provides(Color.m4168boximpl(j7));
                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(934657765, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i17) {
                                    ComposerKt.sourceInformation(composer4, "C303@12523L125:AlertDialog.kt#uh7d8r");
                                    if ((i17 + 3) - (3 | i17) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(934657765, i17, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:303)");
                                        }
                                        Modifier modifierAlign = columnScopeInstance.align(PaddingKt.padding(Modifier.Companion, AlertDialogKt.IconPadding), Alignment.Companion.getCenterHorizontally());
                                        Function2<Composer, Integer, Unit> function213 = function29;
                                        ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierAlign);
                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor2);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composer4);
                                        Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                        Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                        if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer4, -1509127830, "C304@12620L6:AlertDialog.kt#uh7d8r");
                                        function213.invoke(composer4, 0);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }, composer3, 54);
                            int i17 = ProvidedValue.$stable;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, composableLambdaRememberComposableLambda2, composer3, (i17 + 48) - (i17 & 48));
                        }
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(-1924961479);
                        ComposerKt.sourceInformation(composer3, "*311@12864L5,312@12888L569,309@12722L735");
                        if (function210 == null) {
                            i16 = -1323940314;
                        } else {
                            i16 = -1323940314;
                            ProvideContentColorTextStyleKt.m2921ProvideContentColorTextStyle3JVO9M(j8, TypographyKt.getValue(DialogTokens.INSTANCE.getHeadlineFont(), composer3, 6), ComposableLambdaKt.rememberComposableLambda(434448772, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i18) {
                                    Alignment.Horizontal centerHorizontally;
                                    ComposerKt.sourceInformation(composer4, "C313@12910L529:AlertDialog.kt#uh7d8r");
                                    if ((-1) - (((-1) - i18) | ((-1) - 3)) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(434448772, i18, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:313)");
                                        }
                                        ColumnScope columnScope = columnScopeInstance;
                                        Modifier modifierPadding2 = PaddingKt.padding(Modifier.Companion, AlertDialogKt.TitlePadding);
                                        if (function29 == null) {
                                            centerHorizontally = Alignment.Companion.getStart();
                                        } else {
                                            centerHorizontally = Alignment.Companion.getCenterHorizontally();
                                        }
                                        Modifier modifierAlign = columnScope.align(modifierPadding2, centerHorizontally);
                                        Function2<Composer, Integer, Unit> function213 = function210;
                                        ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierAlign);
                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor2);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composer4);
                                        Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                        Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                        if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer4, -1508344119, "C324@13410L7:AlertDialog.kt#uh7d8r");
                                        function213.invoke(composer4, 0);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }, composer3, 54), composer3, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
                        }
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(-1924936431);
                        ComposerKt.sourceInformation(composer3, "*329@13560L5,333@13725L290,330@13582L433");
                        if (function211 != null) {
                            ProvideContentColorTextStyleKt.m2921ProvideContentColorTextStyle3JVO9M(j9, TypographyKt.getValue(DialogTokens.INSTANCE.getSupportingTextFont(), composer3, 6), ComposableLambdaKt.rememberComposableLambda(-796843771, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i18) {
                                    ComposerKt.sourceInformation(composer4, "C334@13747L250:AlertDialog.kt#uh7d8r");
                                    if ((i18 & 3) != 2 || !composer4.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-796843771, i18, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:334)");
                                        }
                                        ColumnScope columnScope = columnScopeInstance;
                                        Modifier modifierAlign = columnScope.align(PaddingKt.padding(columnScope.weight(Modifier.Companion, 1.0f, false), AlertDialogKt.TextPadding), Alignment.Companion.getStart());
                                        Function2<Composer, Integer, Unit> function213 = function211;
                                        ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierAlign);
                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor2);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composer4);
                                        Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                                        Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                                        if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer4, -1507789622, "C339@13969L6:AlertDialog.kt#uh7d8r");
                                        function213.invoke(composer4, 0);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }, composer3, 54), composer3, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
                        }
                        composer3.endReplaceGroup();
                        Modifier modifierAlign = columnScopeInstance.align(Modifier.Companion, Alignment.Companion.getEnd());
                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer3, i16, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierAlign);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3671constructorimpl2 = Updater.m3671constructorimpl(composer3);
                        Updater.m3678setimpl(composerM3671constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                        Updater.m3678setimpl(composerM3671constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composerM3671constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM3671constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3671constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m3678setimpl(composerM3671constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, -1768340368, "C344@14155L5,345@14177L183:AlertDialog.kt#uh7d8r");
                        ProvideContentColorTextStyleKt.m2921ProvideContentColorTextStyle3JVO9M(j10, TypographyKt.getValue(DialogTokens.INSTANCE.getActionLabelTextFont(), composer3, 6), function212, composer3, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54);
            int i15 = i5 >> 3;
            int i16 = (i15 + 14) - (i15 | 14);
            int i17 = (i16 + 12582912) - (i16 & 12582912);
            int i18 = i5 >> 12;
            int i19 = (i18 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i18 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
            composer2 = composerStartRestartGroup;
            shape2 = shape2;
            f3 = f3;
            SurfaceKt.m2561SurfaceT9BRK9s(companion, shape2, j2, 0L, f3, 0.0f, null, composableLambdaRememberComposableLambda, composer2, ((-1) - (((-1) - ((i17 + i19) - (i17 & i19))) & ((-1) - ((-1) - (((-1) - i18) | ((-1) - 896)))))) | ((-1) - (((-1) - (i5 >> 9)) | ((-1) - 57344))), 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final float f4 = f3;
            final Function2<? super Composer, ? super Integer, Unit> function29 = function25;
            final Modifier modifier2 = companion;
            final Function2<? super Composer, ? super Integer, Unit> function210 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function211 = function27;
            final Function2<? super Composer, ? super Integer, Unit> function212 = function28;
            final Shape shape3 = shape2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$2
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

                public final void invoke(Composer composer3, int i20) {
                    Function2<Composer, Integer, Unit> function213 = function29;
                    Modifier modifier3 = modifier2;
                    Function2<Composer, Integer, Unit> function214 = function210;
                    Function2<Composer, Integer, Unit> function215 = function211;
                    Function2<Composer, Integer, Unit> function216 = function212;
                    Shape shape4 = shape3;
                    long j7 = j2;
                    float f5 = f4;
                    long j8 = j3;
                    long j9 = j4;
                    long j10 = j5;
                    long j11 = j6;
                    int i21 = i2;
                    AlertDialogKt.m1773AlertDialogContent4hvqGtA(function213, modifier3, function214, function215, function216, shape4, j7, f5, j8, j9, j10, j11, composer3, RecomposeScopeImplKt.updateChangedFlags((i21 + 1) - (i21 & 1)), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m1774AlertDialogFlowRowixp7dh8(final float f2, final float f3, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(586821353);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AlertDialogFlowRow)P(2:c#ui.unit.Dp,1:c#ui.unit.Dp)365@14664L3370,365@14648L3386:AlertDialog.kt#uh7d8r");
        if ((6 & i2) == 0) {
            i3 = (composerStartRestartGroup.changed(f2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i3 |= composerStartRestartGroup.changed(f3) ? 32 : 16;
        }
        if ((-1) - (((-1) - i2) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 256 : 128)));
        }
        if ((-1) - (((-1) - i3) | ((-1) - 147)) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(586821353, i3, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:364)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -767073803, "CC(remember):AlertDialog.kt#9igjgp");
            int i4 = (14 & i3) == 4 ? 1 : 0;
            int i5 = (i3 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i3) != 32 ? 0 : 1;
            int i6 = (i4 + i5) - (i4 & i5);
            MeasurePolicy measurePolicyRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 != 0 || measurePolicyRememberedValue == Composer.Companion.getEmpty()) {
                measurePolicyRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo375measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        final ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        final ArrayList arrayList5 = new ArrayList();
                        Ref.IntRef intRef = new Ref.IntRef();
                        Ref.IntRef intRef2 = new Ref.IntRef();
                        ArrayList arrayList6 = new ArrayList();
                        Ref.IntRef intRef3 = new Ref.IntRef();
                        Ref.IntRef intRef4 = new Ref.IntRef();
                        float f4 = f2;
                        float f5 = f3;
                        int size = list.size();
                        int i7 = 0;
                        while (i7 < size) {
                            int i8 = i7;
                            Placeable placeableMo5514measureBRTryo0 = list.get(i8).mo5514measureBRTryo0(j2);
                            float f6 = f4;
                            if (measure_3p2s80s$canAddToCurrentSequence(arrayList6, intRef3, measureScope, f6, j2, placeableMo5514measureBRTryo0)) {
                                arrayList = arrayList4;
                                arrayList2 = arrayList6;
                            } else {
                                arrayList = arrayList4;
                                arrayList2 = arrayList6;
                                measure_3p2s80s$startNewSequence(arrayList3, intRef2, measureScope, f5, arrayList6, arrayList4, intRef4, arrayList5, intRef, intRef3);
                            }
                            if (!arrayList2.isEmpty()) {
                                intRef3.element += measureScope.mo704roundToPx0680j_4(f6);
                            }
                            arrayList2.add(placeableMo5514measureBRTryo0);
                            intRef3.element += placeableMo5514measureBRTryo0.getWidth();
                            intRef4.element = Math.max(intRef4.element, placeableMo5514measureBRTryo0.getHeight());
                            i7 = i8 + 1;
                            arrayList6 = arrayList2;
                            f4 = f6;
                            arrayList4 = arrayList;
                        }
                        if (!arrayList6.isEmpty()) {
                            measure_3p2s80s$startNewSequence(arrayList3, intRef2, measureScope, f3, arrayList6, arrayList4, intRef4, arrayList5, intRef, intRef3);
                        }
                        final int iMax = Math.max(intRef.element, Constraints.m6593getMinWidthimpl(j2));
                        int iMax2 = Math.max(intRef2.element, Constraints.m6592getMinHeightimpl(j2));
                        final float f7 = f2;
                        return MeasureScope.layout$default(measureScope, iMax, iMax2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                List<List<Placeable>> list2 = arrayList3;
                                MeasureScope measureScope2 = measureScope;
                                float f8 = f7;
                                int i9 = iMax;
                                List<Integer> list3 = arrayList5;
                                int size2 = list2.size();
                                for (int i10 = 0; i10 < size2; i10++) {
                                    List<Placeable> list4 = list2.get(i10);
                                    int size3 = list4.size();
                                    int[] iArr = new int[size3];
                                    int i11 = 0;
                                    while (i11 < size3) {
                                        iArr[i11] = list4.get(i11).getWidth() + (i11 < CollectionsKt.getLastIndex(list4) ? measureScope2.mo704roundToPx0680j_4(f8) : 0);
                                        i11++;
                                    }
                                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                    int[] iArr2 = new int[size3];
                                    for (int i12 = 0; i12 < size3; i12++) {
                                        iArr2[i12] = 0;
                                    }
                                    end.arrange(measureScope2, i9, iArr, measureScope2.getLayoutDirection(), iArr2);
                                    int size4 = list4.size();
                                    for (int i13 = 0; i13 < size4; i13++) {
                                        Placeable.PlacementScope.place$default(placementScope, list4.get(i13), iArr2[i13], list3.get(i10).intValue(), 0.0f, 4, null);
                                    }
                                }
                            }
                        }, 4, null);
                    }

                    private static final boolean measure_3p2s80s$canAddToCurrentSequence(List<Placeable> list, Ref.IntRef intRef, MeasureScope measureScope, float f4, long j2, Placeable placeable) {
                        return list.isEmpty() || (intRef.element + measureScope.mo704roundToPx0680j_4(f4)) + placeable.getWidth() <= Constraints.m6591getMaxWidthimpl(j2);
                    }

                    private static final void measure_3p2s80s$startNewSequence(List<List<Placeable>> list, Ref.IntRef intRef, MeasureScope measureScope, float f4, List<Placeable> list2, List<Integer> list3, Ref.IntRef intRef2, List<Integer> list4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
                        if (!list.isEmpty()) {
                            intRef.element += measureScope.mo704roundToPx0680j_4(f4);
                        }
                        list.add(0, CollectionsKt.toList(list2));
                        list3.add(Integer.valueOf(intRef2.element));
                        list4.add(Integer.valueOf(intRef.element));
                        intRef.element += intRef2.element;
                        intRef3.element = Math.max(intRef3.element, intRef4.element);
                        list2.clear();
                        intRef4.element = 0;
                        intRef2.element = 0;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(measurePolicyRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) measurePolicyRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            int i7 = ((-1) - (((-1) - (i3 >> 6)) | ((-1) - 14))) << 6;
            int i8 = (i7 + 896) - (i7 | 896);
            int i9 = (i8 + 6) - (i8 & 6);
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
            Updater.m3678setimpl(composerM3671constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i9 >> 6) & 14));
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$2
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

                public final void invoke(Composer composer2, int i10) {
                    AlertDialogKt.m1774AlertDialogFlowRowixp7dh8(f2, f3, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    public static final float getDialogMinWidth() {
        return DialogMinWidth;
    }

    public static final float getDialogMaxWidth() {
        return DialogMaxWidth;
    }

    static {
        float f2 = 24;
        DialogPadding = PaddingKt.m1011PaddingValues0680j_4(Dp.m6638constructorimpl(f2));
        float f3 = 16;
        IconPadding = PaddingKt.m1015PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6638constructorimpl(f3), 7, null);
        TitlePadding = PaddingKt.m1015PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6638constructorimpl(f3), 7, null);
        TextPadding = PaddingKt.m1015PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6638constructorimpl(f2), 7, null);
    }
}
