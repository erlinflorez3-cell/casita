package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: Column.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d̉=!4i\bDJf|\u0004O\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$q$yCQU\"}8\tWNmivJp\u000bKƤ\u000e\u0016\u0007s4կ]xk\u0018\u00172HrW{[sU9\u000fyf\u000b&20>\u0012\u0005/!ZN\u0016v\tKc\f@9pv@R\u001bW\u001d\u001a@\u0011n:\u000f*t}^8Xl\fH?%\u0013ipSUl݁\u0001M\u0013Uù+\r|qdѰF˝9\u00153d\u001b\"`mW\u0003mpm\tv/?+w|\b:f\n,\u0015YZS\\ę*\\\u0013dx?5?gcye>,\u0006\u0011\u0014\rj\u001b>\n5`F-H\u007f8\u0012A\u000f\u000bSni2bP\u001b\u0013ad0U\u0004AGQ\u001b\u0015j(ݢϭR7\n\"-81Ч\u0007!\nSD֫kÓVɐU=Y̵MJT\ng>\u0006\u0006vd\u0010-˟4e"}, d2 = {"\u0012dU.h3M1#\u0006\u000bf5d\t+s\u00105{+\u000b\u001e\u001bE\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7X 5QAOA", "5dc\u0011X-:c \u000eXh3\r\u00118M\u007f$\nP\u000e\u0017\u0002Qv\u0012:\u000bc1b\u0007*Fi%2WLI", "u(E", "5dc\u0011X-:c \u000eXh3\r\u00118M\u007f$\nP\u000e\u0017\u0002Qv\u0012:\u000b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001dYy.Gz\u0016\u0019WJ?iHs", "\u0011n[B`5", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "DdaA\\*:Zt\f\bZ5~\t7e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwwc9]z%CS$", "6na6m6Gb\u0015\u0006Ve0~\u00127e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8TSCt\"\u001c\u001fsa\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pd6^\u007f&C[R6e\u001cy9(\u001cj\u001d\u0018\u0007\u001a\u0012UJ&nL7(\u0017j:\u0002Hw\u0005\n\u0012\u0015\u000bQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bUfs@\u0013c\u001feB:-#0{%uTC\u0014\u0005b\ry(`mqV ~AmC~c\u0010F\u007f^:\u0004+)T\nArBar:x7\r\u0002\u007f\u001d`\u000eJt\"B]\f^*fI20D<\\L[l\u0005pF\u000e2|k\u0010\u0019lC1&;IG\f\u007f", "1n[B`5&S\u0015\r\u000bk,g\u00136i}<", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\nZP7t6\u001e\u001dhjHET,[\u0006+EHU\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fu%\t?j\n\u0014\u0016\u0017D)SLc\u0014\\\u0004\u001e\u0005=0>-UhxTKIa=.\ni%gDH$]~)$wT6\nE1\u001bz]\u0004ugTn^{\u000b:vZSOsTO>%)S\u0007\u0002 2\"\u0005/>4\u007fH4FsN3g\u0014Ln\u0006\u0015\u0017fH+$J\u0012", "1qT.g,\u001c] \u000f\u0003g\n\u0007\u0012=t\r$\u007fI\u0010%", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "7r??\\6KW(\u0003\u0010b5~", "", ";`X;4?Ba\u0001\u0003\u0004", "", "1q^@f\bQW'f~g", ";`X;4?Ba\u0001z\u000e", "1q^@f\bQW'fvq", "uY8\u0016<\u0010\u00028", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ColumnKt {
    private static final MeasurePolicy DefaultColumnMeasurePolicy = new ColumnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart());

    public static /* synthetic */ void getDefaultColumnMeasurePolicy$annotations() {
    }

    public static final void Column(Modifier modifier, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        if ((1 & i3) != 0) {
            modifier = Modifier.Companion;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            horizontal = Alignment.Companion.getStart();
        }
        MeasurePolicy measurePolicyColumnMeasurePolicy = columnMeasurePolicy(vertical, horizontal, composer, (-1) - (((-1) - (i2 >> 3)) | ((-1) - 126)));
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM3671constructorimpl = Updater.m3671constructorimpl(composer);
        Updater.m3678setimpl(composerM3671constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
        Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        int i4 = i2 >> 6;
        int i5 = (i4 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i4 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
        function3.invoke(columnScopeInstance, composer, Integer.valueOf((i5 + 6) - (i5 & 6)));
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    public static final MeasurePolicy getDefaultColumnMeasurePolicy() {
        return DefaultColumnMeasurePolicy;
    }

    public static final MeasurePolicy columnMeasurePolicy(Arrangement.Vertical vertical, Alignment.Horizontal horizontal, Composer composer, int i2) {
        ColumnMeasurePolicy columnMeasurePolicy;
        ComposerKt.sourceInformationMarkerStart(composer, 1089876336, "C(columnMeasurePolicy)P(1):Column.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1089876336, i2, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:106)");
        }
        if (Intrinsics.areEqual(vertical, Arrangement.INSTANCE.getTop()) && Intrinsics.areEqual(horizontal, Alignment.Companion.getStart())) {
            composer.startReplaceGroup(345962472);
            composer.endReplaceGroup();
            columnMeasurePolicy = DefaultColumnMeasurePolicy;
        } else {
            composer.startReplaceGroup(346016319);
            ComposerKt.sourceInformation(composer, "109@5034L227");
            ComposerKt.sourceInformationMarkerStart(composer, -1789953197, "CC(remember):Column.kt#9igjgp");
            int i3 = (((((-1) - (((-1) - i2) | ((-1) - 14))) ^ 6) <= 4 || !composer.changed(vertical)) && (6 & i2) != 4) ? 0 : 1;
            int i4 = ((((112 & i2) ^ 48) > 32 && composer.changed(horizontal)) || (-1) - (((-1) - i2) | ((-1) - 48)) == 32) ? 1 : 0;
            int i5 = (i3 + i4) - (i3 & i4);
            Object objRememberedValue = composer.rememberedValue();
            if (i5 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new ColumnMeasurePolicy(vertical, horizontal);
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
            columnMeasurePolicy = (ColumnMeasurePolicy) objRememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return columnMeasurePolicy;
    }

    public static final long createColumnConstraints(boolean z2, int i2, int i3, int i4, int i5) {
        return !z2 ? ConstraintsKt.Constraints(i3, i5, i2, i4) : Constraints.Companion.m6599fitPrioritizingHeightZbe2FdA(i3, i5, i2, i4);
    }
}
