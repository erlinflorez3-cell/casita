package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
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
/* JADX INFO: compiled from: ContextualFlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яz\u001d̉=!,i\bӵLc\u0003\nIي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.XT2\u000f\u0002{<řc$\bCCU0}*\teNogtJb\u000bY\u000f\u000e\u0016\u000fj4I[ye\u0012%2JoU3UoC9htL\u0005(288\u0002\u0005\u0017\u001a2H\u0016v\u0003Ca\f\u001aؓHpHp\u0015M\u001b\u001a\u001aßF \u0017\u001edgT9`ǒ\\Hǂ;\u0003\u0018A~+m0\u0015M;G\u0005-\u0013vo C@e8E+Y\u0003\u0015Vs?1D\"C\u000bh5-CI\"^f^\u0006\u0014#3g\r\fsVb\u000bQn\u0015?+}d{V\u0014(\u0006\u0005\u0014\rj\u000f>55TFX*h\u0018\u000ea\u0003\u0003dP_0_۰\u0004\u0005gE'+\u0006C;;!lwrK\u001b^7*\u0004;+ţ\u0005n'mڍ\u0012`\u001b.\u001b|Φ5QNQ`ݕ\tgR\u0006\u0004\u001fa2.\u00120_\u007f]|A4\u001d%E]Q#On2NJg\u0005\u000bxh\u0002p\u0003NF\"|\u001aO*7\u0011\u000bJj\u0005yflXZ\u0012}\"Z\u0007\f\u0011+ \u000bxl'+\u0010\\Y\u0001i\u0019d\u000e93;~bip{\u000e\u0006QnDE`\u0012\u0011уV\u0001\u001aNLh\u000bhvDY\u0012\u0001m8$BH\u0019\u000f&\tΌR\f\u0019DƐu\u001c:?w\u001eÅ\u0019H\u00117Zˬ{\u0017yrz \u0001d3R\u001ey&\u0005\t/llr\u007fg'fZ\n\u0011&;Ei5G+\u0006&v:\u0015#5\u0006$\u0004U\u0006dGzmFyc\u00058\u0016H:\u00023K2'~WR21SL\u000be\u007fNB<\t\u001e\u0012 Ku>r\u0018l\u0001,\u000fixrݚ\u001b\"|p!E8\u001e\u000e\u001ey{\u000bXsc9\\ƏM|\thLT>\r\u0015!$+'\u00012\u000eE<qLޗ\u001a\u0002\u001a>%gcy\u007f0\u007fh5L\u0005g\u0014,\u0012\u0015\u001eoжa2AJ\u0010X˽B\"2\u0014\u001bݏGx  T\u00196\u001d3v\\trf8{'?\u007fv\u0007Z*\u001fc\f>!u\u00164\\fZwQ\u0002,^q*AQa\u0006\u0006my];N\u001d\u0013#{_oB K?nW\u0011)`\n\u0002\u0018NAic5Q\u0017EL=L\u0015\u001bNdk\u0016\u0010)~t\u0003ʸ\u001b2H\u0006ix>\u000e\u0007\u0001n}\u0015qUoO+ܣ\u0003\u00199-\t;7\u0015}HZ5\nC\u0011d-\u0018I\u0010ˍ\u0003p+:TZ?+8Z\u0007\u0011k\u0004SK\u001262FWzÃs\f>*C\u001cÐ\u001c\u001bGzςc!"}, d2 = {"\u0011n]AX?Mc\u0015\u0006[e6\u000ff9l\u00100\u0005", "", "7sT:66N\\(", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "DdaA\\*:Zt\f\bZ5~\t7e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwwc9]z%CS$", "6na6m6Gb\u0015\u0006Vk9x\u00121e\b(\u0005O", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J32", ";`g\u0016g,Fa|\bZZ*\u007ff9l\u00100\u0005", ";`g\u0019\\5>a", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8VR;~C.\u0011oB@\u0011u\nX}7OU8=\\_sD\u001e$0", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8VR;~C.\u0011oB@\u0011u\nX}7OU<*f]r\u0013", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7mS2k", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/d\u001c@l#8QBN52(\u001dskG\u0007--X\u00070FH]0f[<D\u0010&d\u001e]th\u0012f=-pD?\u001f\u0011;\br;u\u0010\u0010\u0014\n<@W>_\u000fT\u0004\u0019tTrfPaj\u0004UA\u000fc4t\u0015^\u0019k>D-]x\u0015/r`=SW`\u001en[{goG\"\nv\u0007Hz_[Oxd8{|\u0003/bs\u001b1e~/s@M24>o\u000fYga?h\t\u001e+XP+0?\u0006\u001a;_m\u0006{\bkr(p\b!qE- FlmZl\u0011d'c>Kp\u0001DS\rH[E{-P\u000eI_\u0003^\u000e\u0018,7fYL\u0019c\u0005$yRk@!\f\u0001u\u001c&7d\u0013@\u000bq)lAQ\u0012\u001c26\u0016\u0004dM#p\u0012\u001d}T\u0002__om\u0014\u0003\u0019T+AKIL6'3\u0001", "\u0011n]AX?Mc\u0015\u0006[e6\u000fu9w", ";`g\u0016g,Fa|\bZZ*\u007fu9w", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8VR;~C.\u0011oB@\u0011u\u0019X\t\u0011XL[-c\\\u0005\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8VR;~C.\u0011oB@\u0011u\u0019X\t\u0015EVY,2", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/d\u001c@l#8QBN52(\u001dskG\u0007--X\u00070FH]0f[<D\u0010&d\u001e]th\u0012f=-pD?\u001f\u0011;\bdEu\u0005! \u0017Dfw\u0018=\fPx\"\u007fE({\u0010Wi\u0002RKSbse\u0016o&[6I(\u001ezb\"dd8\u001a\u000b\u001dl\u007f_upiG!zA3|^[STsS8{|\u0003/bs\u001b1e~/s@M24>o\u000fYga?h\t\u001e+XP+0?\u0006\u001a;_m\u0006{\bkr(p\b!qE- FlmZ{\u0011o\u0001l5n`\bAd[%Oy$.J\b\f`\u000b\u001dR\b4vcXG%]\u000fcQT+] \u0007\rofq\u0015\u0012FX\u001cr.^J\u0017\u0011\u0013pC\u0016\nY\r\"\u0001Q\u001fqSr%5y,A\u0003\u001fI.\t/ :C", "1n]AX?Mc\u0015\u0006Xh3\r\u00118M\u007f$\nP\u000e\u0017yGv\u0019<\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.5C7yD+\u0015V_C\u0012c\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", ";`g\u0016g,Fa|\bbZ0\u0006dBi\u000e", "=uT?Y3He\u0007\u000evm,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%wKJ\u0007p-U\u000195[J;\\(", "=uT?Y3Hev\t\u0003i6\u000b\u0005,l\u007f6", "", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "5dc\u0010b4I]'zwe,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"o=\u001exqbC\\", "7mU<", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\nZP7t6\u001e\u001dhjHET,[\u0006+EHU\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001 \u0012<R\u00017w\u0005\u0016\u001fW<f\u0005Lf\u001f\u0011U\"\u0003=2jFa_\u0003V\u007f(l7h!i&k6AywU\u007f\u0017qO;\u0014\u007fR$<P\u0004orQ'z\u0002%H}dEA~YF}p&G\u0010\u0002\"A\"U2~?j0>@t\u00145x\u0018K_\u007f\u001f>JP#56\u0012v&P_\u0007h\b\u001ew#hQtfC@nLkmW\u0016\u000bf``Fi)\u0002G[\u0004MMy\u001e5\u0010_Rdw$\r\u0011-<;0?$S\u000e$tC5)\u000f\r\u000bq\"*._Ji\u0018w.g7\u0017p\u0013pC\u0016\nYPjT\fvsU\u0002b[xm;\n\u0019\u0013\"CT:\u0006VMx\u001e_\u0015\u0011\u0014|,wsKF\f", "1n]AX?Mc\u0015\u0006gh>d\t+s\u00105{H\u0001 &*o\u0015Gv2", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\nZP7t6\u001e\u001dhjHEF6[z<QU](c(Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ-S\u0012Dg|\u001b\u001a\u0018>4w>j\u001aW\t^QN6dO[_\u0002GJT!\u001bd\u0019n!Z6AywU\u007f\u0017qO;\u0014\u007fR$<P\u0004orQ'z\u0002%H}dEA~YF}p&G\u0010\u0002\"A\"U2~?j0>@t\u00145x\u0018K_\u007f\u001f>JP#56\u0012v&P_\u0007h\b\u001ew#hQtfC@nLkmW\u0016\u000bf``Fi)\u0002G[\u0004MMy\u001e5\u0010_Rdw$\r\u0011-<;0?$S\u000e$tC5)\u000f\r\u000bq\"*._Ji\u0018w.g7\u0017p\u0013pC\u0016\nYPjT\fvsU\u0002b[xm;\n\u0019\u0013\"CT:\u0006VMx\u001e_\u0015\u0011\u0014|,wsKF\f", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ContextualFlowLayoutKt {
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ContextualFlowRow(final int r22, androidx.compose.ui.Modifier r23, androidx.compose.foundation.layout.Arrangement.Horizontal r24, androidx.compose.foundation.layout.Arrangement.Vertical r25, int r26, int r27, androidx.compose.foundation.layout.ContextualFlowRowOverflow r28, final kotlin.jvm.functions.Function4<? super androidx.compose.foundation.layout.ContextualFlowRowScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.ContextualFlowLayoutKt.ContextualFlowRow(int, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, int, int, androidx.compose.foundation.layout.ContextualFlowRowOverflow, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ContextualFlowColumn(final int r22, androidx.compose.ui.Modifier r23, androidx.compose.foundation.layout.Arrangement.Vertical r24, androidx.compose.foundation.layout.Arrangement.Horizontal r25, int r26, int r27, androidx.compose.foundation.layout.ContextualFlowColumnOverflow r28, final kotlin.jvm.functions.Function4<? super androidx.compose.foundation.layout.ContextualFlowColumnScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.ContextualFlowLayoutKt.ContextualFlowColumn(int, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, int, int, androidx.compose.foundation.layout.ContextualFlowColumnOverflow, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Function2<SubcomposeMeasureScope, Constraints, MeasureResult> contextualRowMeasurementHelper(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, int i4, List<? extends Function2<? super Composer, ? super Integer, Unit>> list, Function4<? super Integer, ? super FlowLineInfo, ? super Composer, ? super Integer, Unit> function4, Composer composer, int i5) {
        ComposerKt.sourceInformationMarkerStart(composer, -43351224, "C(contextualRowMeasurementHelper)P(1,7,3,4,6,2,5)343@13891L847:ContextualFlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-43351224, i5, -1, "androidx.compose.foundation.layout.contextualRowMeasurementHelper (ContextualFlowLayout.kt:342)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1138967354, "CC(remember):ContextualFlowLayout.kt#9igjgp");
        int i6 = ((-1) - (((-1) - ((((((i5 + 14) - (14 | i5)) ^ 6) <= 4 || !composer.changed(horizontal)) && (-1) - (((-1) - i5) | ((-1) - 6)) != 4) ? 0 : 1)) & ((-1) - ((((((-1) - (((-1) - i5) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) ^ 48) <= 32 || !composer.changed(vertical)) && (i5 + 48) - (48 | i5) != 32) ? 0 : 1)))) | (((((896 & i5) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composer.changed(i2)) && (i5 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (384 | i5) != 256) ? 0 : 1) | (((((7168 & i5) ^ 3072) <= 2048 || !composer.changed(i3)) && (3072 & i5) != 2048) ? 0 : 1);
        boolean zChanged = composer.changed(flowLayoutOverflowState);
        int i7 = (-1) - (((-1) - (((i6 + (zChanged ? 1 : 0)) - (i6 & (zChanged ? 1 : 0))) | ((((((-1) - (((-1) - 458752) | ((-1) - i5))) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 || !composer.changed(i4)) && (i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) ? 0 : 1))) & ((-1) - (((((29360128 & i5) ^ 12582912) > 8388608 && composer.changed(function4)) || (i5 + 12582912) - (i5 | 12582912) == 8388608) ? 1 : 0)));
        Object objRememberedValue = composer.rememberedValue();
        if (i7 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new FlowMeasureLazyPolicy(true, horizontal, vertical, horizontal.mo904getSpacingD9Ej5fM(), FlowLayoutKt.getCROSS_AXIS_ALIGNMENT_TOP(), vertical.mo904getSpacingD9Ej5fM(), i4, i3, i2, flowLayoutOverflowState, list, function4, null).getMeasurePolicy();
            composer.updateRememberedValue(objRememberedValue);
        }
        Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function2 = (Function2) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return function2;
    }

    public static final Function2<SubcomposeMeasureScope, Constraints, MeasureResult> contextualColumnMeasureHelper(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i2, int i3, FlowLayoutOverflowState flowLayoutOverflowState, int i4, List<? extends Function2<? super Composer, ? super Integer, Unit>> list, Function4<? super Integer, ? super FlowLineInfo, ? super Composer, ? super Integer, Unit> function4, Composer composer, int i5) {
        ComposerKt.sourceInformationMarkerStart(composer, 1009762916, "C(contextualColumnMeasureHelper)P(7,1,3,4,6,2,5)383@15228L850:ContextualFlowLayout.kt#2w3rfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009762916, i5, -1, "androidx.compose.foundation.layout.contextualColumnMeasureHelper (ContextualFlowLayout.kt:382)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -1978242771, "CC(remember):ContextualFlowLayout.kt#9igjgp");
        int i6 = ((-1) - (((-1) - (((((((((14 & i5) ^ 6) <= 4 || !composer.changed(vertical)) && (i5 + 6) - (6 | i5) != 4) ? 0 : 1) | ((((((-1) - (((-1) - i5) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) ^ 48) <= 32 || !composer.changed(horizontal)) && (48 & i5) != 32) ? 0 : 1)) | (((((896 & i5) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composer.changed(i2)) && (-1) - (((-1) - i5) | ((-1) - BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT)) != 256) ? 0 : 1)) | ((((((-1) - (((-1) - i5) | ((-1) - 7168))) ^ 3072) <= 2048 || !composer.changed(i3)) && (i5 + 3072) - (3072 | i5) != 2048) ? 0 : 1)) | (composer.changed(flowLayoutOverflowState) ? 1 : 0))) & ((-1) - (((((458752 & i5) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 || !composer.changed(i4)) && (i5 + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) - (i5 | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) ? 0 : 1)))) | ((((((-1) - (((-1) - 29360128) | ((-1) - i5))) ^ 12582912) > 8388608 && composer.changed(function4)) || (i5 & 12582912) == 8388608) ? 1 : 0);
        Object objRememberedValue = composer.rememberedValue();
        if (i6 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new FlowMeasureLazyPolicy(false, horizontal, vertical, vertical.mo904getSpacingD9Ej5fM(), FlowLayoutKt.getCROSS_AXIS_ALIGNMENT_START(), horizontal.mo904getSpacingD9Ej5fM(), i4, i3, i2, flowLayoutOverflowState, list, function4, null).getMeasurePolicy();
            composer.updateRememberedValue(objRememberedValue);
        }
        Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function2 = (Function2) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return function2;
    }
}
