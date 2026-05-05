package androidx.compose.foundation;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.profileinstaller.ProfileVerifier;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: Image.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000b<N\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$i)yّCU0}*\tUNog\u0005Jb\u000bI\u0010\u000e\u0016\u000fj4I[xe\u0012%2JoE3eAKʠxtd\u0004P608\u0012\u0005/\u001bZN\u001ex\u0013Ea\u000b@3pv@R\u001bQ\u001d\u001a@\u000bn&\u0007\u001ejmf6vs\u000e@5#\u0011qZNUh`\u0003S\rT^?\r%lN3F7C!=U\u0019\u0006\u0001h\u0006\bӭu=\u0013v?\b9ɞ\fWdW0\u0018#+g\r\fsVb\u0013Sx\u000e=*}f{V\u0014(\u0006~\u0014\rj\t>\f-H<32f6\u0015czxSNX\u001a^p\t+g<\u00173\nK+g&\u0017Yg;'ZO}\u001b\fL01t'[b\u001dx\u0015Id>VƱP̵ףLP\u0010jK\u007f\u001cBp̣B\u0004^F03\n$F\u0017SK\f?1#\u0004\u0004^C\u0016y5fnSwV`@PsF=0\t\u001a`\\d3r\u0001Z^,\u001fU4T5\u00078\u0019&\\\u0006F9%>Y\u007fpoj[i\"'Eeef5pް[9lHM#q߄yR%\u0013o@p\u001bpfpj<`j*:4^i>z,JT\f!6WqJ9\\7\u001f\\#N\u001b\u001epH-\u000feZv\u0018\u0017Ta-3o*t\u0017\u000bh\\\u001fz\u0018\u0001O,\u000bl:/WPc&lZɋl4\u000b;ȗ~x\bJm֘czkמyn"}, d2 = {"\u0017lP4X", "", "0hc:T7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FA", "1n]AX5M2\u0019\rxk0\b\u00183o\t", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "/kX4a4>\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", "1n]AX5MA\u0017z\u0002^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006T/>h})F[\u0014*TC\u0011", "/k_5T", "", "1n[<e\rBZ(~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\n\u0005\u001adr5Pj(Wxp5[[0eTH$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buY\u0006\u0005P\u000b\u000b\u001a\u000f9j}\u0018=\fPx\"\u007fE({\u0010Wi\u0002RKSbst\u0010)xc><-\u001cq\"*>7*\u0013z`\u001bvQ\r1eQ!\u0006B2>7kJ\u000fvQP~7.\u0015Y\u0002\u001bAX}:b+\u007f;*\fEkGp\u0017Kh|\u0014?&?1.AF!?\u0015sy6@\u001bd*d\f\fp~\u000f#lop)\u0013\u000el\u0017h\u000bH[\n6_\u0010BH\u0003^%P\u0007Me\b\u0015R\u00144vtMK\u001b\u001e^$xO,m\u0011\u0010XJ{_\u001f", "4h[AX9*c\u0015\u0006~m@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0016]\u0005/7z\u0002>IJ?zHs", "\u0017lP4Xs\u000eV`\bZ^>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\n\u0005\u001adr5Pj(Wxp5[[0eTH$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buY\u0006\u0005P\u000b\u000b\u001a\u000f9j}\u0018=\fPx\"\u007fE({\u0010Wi\u0002RKSbst\u0010)xc><-\u001cq\"*>7*\u0013z`\u001bvQ\r1eQ!\u0006B2>7kJ\u000fvQP~7.\u0015Y\u0002\u001bAX}:b+\u007f;*\fEkGp\u0017Kh|\u0014?&?1.AF!?\u0015sy6@\u001bd*d\f\fp~\u000f#lop)\u0013\u000el\u0017h\u000bEF|@Q\u0013HMn(pD\tJf\u0004#\tP1}nXG#TJwzL-i\u001f\u0003\u0010<{\u007fq\u0007", ">`X;g,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n@U\u0002)Fm#w8??tC\u001e\">", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~dy$@|\u0016;\u0017.7o=-\u0015u7 \f_=J@.CUPuJa\u007fA\u001d\u00140tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u0011\u0010_u?itCZ\u0010TO{qJ(uP]^\r\u0011?Oj5n\u001a_fl>\u0004\u007f\u001bu\u001b$pP7\u0019Q:\r{Q\u0007qkF,D6.FxeTE9e@>.\u001b_\u0006\b!{6~4\u0004-\rC\u00184`\fK=x%Z\u0002\u00149fE&9\u007f:\u001dGVm\u0004l\b\u001elhc\u0015\nm85\u0017s/AR\u0016\u0011jw_<p_\u000e\r9\u0002GH|\u001f+E\u0012\fY\u0004\u001d\u0014\u00112m/VS$c\u0005\"p\u000e\u007fi\u0019\u000e\rt\u0018)\u0004y!\u001d\u007f", "7lP4X\u001d>Q(\t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0012U?=k%\u001e\u0013wkF\\", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~j}\u001eFw#w1K7m4\u000f\u0015fpC\u00149\u0013Sr8C\u0016U(eT<+#\u001f^\u0017P\u0001s\u0001b@1xH62Q*S\nFr\u000f\f_\u001e94XLU\u0014H}\u0015\u0003\u0017\u0010dOXl\u0004K@X,(n\u0014j'j:\u00044\u0018;t\"lR7\u0012{\\ H9upfT#~77\bkeNPyc<>7#\u0015\u0003s&<h\u0004tR7\rC*?srIc\u001f>4Y{(e@40:;&\tIm}wH\u001chhq\fWdB-$hiaVXdg\u001eeBBc\bFR\u0013\u00140k\u001e&S\tFZ\r^\u0007\u0011,xoWCda\u0011#\u007fH*_Z`\rn#&<\u0016J/rLmP", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ImageKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.ImageKt$Image$2 */
    /* JADX INFO: compiled from: Image.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Alignment $alignment;
        final /* synthetic */ float $alpha;
        final /* synthetic */ ColorFilter $colorFilter;
        final /* synthetic */ String $contentDescription;
        final /* synthetic */ ContentScale $contentScale;
        final /* synthetic */ Modifier $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, int i2, int i3) {
            super(2);
            str = str;
            modifier = modifier;
            alignment = alignment;
            contentScale = contentScale;
            f = f2;
            colorFilter = colorFilter;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            ImageKt.Image(painter, str, modifier, alignment, contentScale, f, colorFilter, composer, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0006U\nHzx\u001ai\u0018\\;{W\u001ak]b\f\u001d/\n(t_wMs*Q\u00041vw_eDYa(MN\u001fGy\u0015eZ\r7eMN%?BQ\u001bW(M*\u00055\u000e2qxC0P\u0010lr#\u0014\u0005\\)~\u000bB@)>X\u0004@e", replaceWith = @ReplaceWith(expression = "Image(bitmap, contentDescription, modifier, alignment, contentScale, alpha, colorFilter, DefaultFilterQuality)", imports = {"androidx.compose.foundation", "androidx.compose.ui.graphics.DefaultAlpha", "androidx.compose.ui.Alignment", "androidx.compose.ui.graphics.drawscope.DrawScope.Companion.DefaultFilterQuality", "androidx.compose.ui.layout.ContentScale.Fit"}))
    @InterfaceC1492Gx
    public static final /* synthetic */ void Image(ImageBitmap imageBitmap, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, Composer composer, int i2, int i3) {
        ColorFilter colorFilter2 = colorFilter;
        float f3 = f2;
        ContentScale fit = contentScale;
        Alignment center = alignment;
        Modifier.Companion companion = modifier;
        ComposerKt.sourceInformationMarkerStart(composer, -2123228673, "C(Image)P(2,4,6!1,5)96@4585L177:Image.kt#71ulvw");
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            companion = Modifier.Companion;
        }
        if ((i3 & 8) != 0) {
            center = Alignment.Companion.getCenter();
        }
        if ((i3 & 16) != 0) {
            fit = ContentScale.Companion.getFit();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            f3 = 1.0f;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 64)) != 0) {
            colorFilter2 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2123228673, i2, -1, "androidx.compose.foundation.Image (Image.kt:95)");
        }
        m629Image5hnEew(imageBitmap, str, companion, center, fit, f3, colorFilter2, FilterQuality.Companion.m4278getLowfv9h1I(), composer, (-1) - (((-1) - i2) | ((-1) - 4194302)), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* JADX INFO: renamed from: Image-5h-nEew */
    public static final void m629Image5hnEew(ImageBitmap imageBitmap, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, int i2, Composer composer, int i3, int i4) {
        int iM4737getDefaultFilterQualityfv9h1I = i2;
        ColorFilter colorFilter2 = colorFilter;
        float f3 = f2;
        Alignment center = alignment;
        ContentScale fit = contentScale;
        Modifier.Companion companion = modifier;
        ComposerKt.sourceInformationMarkerStart(composer, -1396260732, "C(Image)P(2,4,7!1,5!,6:c#ui.graphics.FilterQuality)153@7224L73,154@7302L248:Image.kt#71ulvw");
        if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
            companion = Modifier.Companion;
        }
        if ((i4 & 8) != 0) {
            center = Alignment.Companion.getCenter();
        }
        if ((i4 & 16) != 0) {
            fit = ContentScale.Companion.getFit();
        }
        if ((i4 + 32) - (i4 | 32) != 0) {
            f3 = 1.0f;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 64)) != 0) {
            colorFilter2 = null;
        }
        if ((-1) - (((-1) - i4) | ((-1) - 128)) != 0) {
            iM4737getDefaultFilterQualityfv9h1I = DrawScope.Companion.m4737getDefaultFilterQualityfv9h1I();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1396260732, i3, -1, "androidx.compose.foundation.Image (Image.kt:152)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 449057418, "CC(remember):Image.kt#9igjgp");
        boolean zChanged = composer.changed(imageBitmap);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = BitmapPainterKt.m4858BitmapPainterQZhYCtY$default(imageBitmap, 0L, 0L, iM4737getDefaultFilterQualityfv9h1I, 6, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        Image((BitmapPainter) objRememberedValue, str, companion, center, fit, f3, colorFilter2, composer, i3 & 4194288, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    public static final void Image(ImageVector imageVector, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, Composer composer, int i2, int i3) {
        float f3 = f2;
        Modifier.Companion companion = modifier;
        Alignment center = alignment;
        ContentScale fit = contentScale;
        ColorFilter colorFilter2 = colorFilter;
        ComposerKt.sourceInformationMarkerStart(composer, 1595907091, "C(Image)P(5,3,6!1,4)198@9330L34,197@9309L237:Image.kt#71ulvw");
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            companion = Modifier.Companion;
        }
        if ((i3 + 8) - (8 | i3) != 0) {
            center = Alignment.Companion.getCenter();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            fit = ContentScale.Companion.getFit();
        }
        if ((32 & i3) != 0) {
            f3 = 1.0f;
        }
        if ((i3 & 64) != 0) {
            colorFilter2 = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1595907091, i2, -1, "androidx.compose.foundation.Image (Image.kt:197)");
        }
        VectorPainter vectorPainterRememberVectorPainter = VectorPainterKt.rememberVectorPainter(imageVector, composer, 14 & i2);
        int i4 = VectorPainter.$stable;
        int i5 = (i2 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (112 | i2);
        int i6 = (i4 + i5) - (i4 & i5);
        int i7 = 896 & i2;
        int i8 = (i6 + i7) - (i6 & i7);
        int i9 = 7168 & i2;
        int i10 = (-1) - (((-1) - ((i8 + i9) - (i8 & i9))) & ((-1) - ((57344 + i2) - (57344 | i2))));
        int i11 = (458752 + i2) - (458752 | i2);
        Image(vectorPainterRememberVectorPainter, str, companion, center, fit, f3, colorFilter2, composer, ((i10 + i11) - (i10 & i11)) | (i2 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    public static final void Image(Painter painter, final String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, Composer composer, int i2, int i3) {
        int i4;
        Modifier.Companion companionSemantics$default;
        float f3 = f2;
        ContentScale fit = contentScale;
        Alignment center = alignment;
        ColorFilter colorFilter2 = colorFilter;
        Modifier.Companion companion = modifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1142754848);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Image)P(6,3,5!1,4)255@11931L329:Image.kt#71ulvw");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(painter) ? 4 : 2)) & ((-1) - i2));
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 = (i4 + 48) - (i4 & 48);
        } else if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i5 = (-1) - (((-1) - i3) | ((-1) - 4));
        if (i5 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - (composerStartRestartGroup.changed(companion) ? 256 : 128)));
        }
        int i6 = (i3 + 8) - (i3 | 8);
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
            int i7 = composerStartRestartGroup.changed(center) ? 2048 : 1024;
            i4 = (i4 + i7) - (i4 & i7);
        }
        int i8 = (-1) - (((-1) - i3) | ((-1) - 16));
        if (i8 != 0) {
            i4 = (-1) - (((-1) - i4) & ((-1) - 24576));
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(fit) ? 16384 : 8192;
        }
        int i9 = i3 & 32;
        if (i9 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE + i2) - (196608 | i2) == 0) {
            i4 |= composerStartRestartGroup.changed(f3) ? 131072 : 65536;
        }
        int i10 = (i3 + 64) - (i3 | 64);
        if (i10 != 0) {
            i4 = (i4 + 1572864) - (i4 & 1572864);
        } else if ((i2 + 1572864) - (i2 | 1572864) == 0) {
            i4 |= composerStartRestartGroup.changed(colorFilter2) ? 1048576 : 524288;
        }
        if ((i4 + 599187) - (599187 | i4) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                companion = Modifier.Companion;
            }
            if (i6 != 0) {
                center = Alignment.Companion.getCenter();
            }
            if (i8 != 0) {
                fit = ContentScale.Companion.getFit();
            }
            if (i9 != 0) {
                f3 = 1.0f;
            }
            if (i10 != 0) {
                colorFilter2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1142754848, i4, -1, "androidx.compose.foundation.Image (Image.kt:243)");
            }
            if (str != null) {
                composerStartRestartGroup.startReplaceGroup(1040258775);
                ComposerKt.sourceInformation(composerStartRestartGroup, "245@11667L103");
                Modifier.Companion companion2 = Modifier.Companion;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 449199624, "CC(remember):Image.kt#9igjgp");
                boolean z2 = (i4 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) - (i4 | PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.ImageKt$Image$semantics$1$1
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
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                            SemanticsPropertiesKt.m5952setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m5936getImageo7Vup1c());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                companionSemantics$default = SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue, 1, null);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1040398089);
                composerStartRestartGroup.endReplaceGroup();
                companionSemantics$default = Modifier.Companion;
            }
            Modifier modifierPaint$default = PainterModifierKt.paint$default(ClipKt.clipToBounds(companion.then(companionSemantics$default)), painter, false, center, fit, f3, colorFilter2, 2, null);
            AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 544976794, "CC(Layout)P(1)125@4862L23,128@5013L385:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPaint$default);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
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
            Updater.m3678setimpl(composerM3671constructorimpl, anonymousClass1, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m3678setimpl(composerM3671constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m3678setimpl(composerM3671constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerM3671constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3671constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3671constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3671constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            Modifier modifier2 = companion;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.ImageKt.Image.2
                final /* synthetic */ int $$changed;
                final /* synthetic */ int $$default;
                final /* synthetic */ Alignment $alignment;
                final /* synthetic */ float $alpha;
                final /* synthetic */ ColorFilter $colorFilter;
                final /* synthetic */ String $contentDescription;
                final /* synthetic */ ContentScale $contentScale;
                final /* synthetic */ Modifier $modifier;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(final String str2, Modifier modifier22, Alignment center2, ContentScale fit2, float f32, ColorFilter colorFilter22, int i22, int i32) {
                    super(2);
                    str = str2;
                    modifier = modifier22;
                    alignment = center2;
                    contentScale = fit2;
                    f = f32;
                    colorFilter = colorFilter22;
                    i = i22;
                    i = i32;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    ImageKt.Image(painter, str, modifier, alignment, contentScale, f, colorFilter, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i) & ((-1) - 1))), i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.ImageKt$Image$1 */
    /* JADX INFO: compiled from: Image.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d̉=!4i\bDZc|İI\u0006>)6B\u0015\"4ߚ\u007f\u0007|jA0JeV\u008cjSX\u000e\u0014{b$\f.\u007fDS[*\u007f2\t}Q\u0016i\u001fNh\u000f[\u000f4\u001b?r߽MW~c \u0016"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzKo", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b#\u0011y]\u0003\u0017r0U@\u000eKZ]\u0002A\u0016Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ<MKBd\u0015\u0016&\u001d~Rp>d Ty\u0002uO9oU/"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 implements MeasurePolicy {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.ImageKt$Image$1$1 */
        /* JADX INFO: compiled from: Image.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class C00131 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
            public static final C00131 INSTANCE = ;

            C00131() {
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(Placeable.PlacementScope placementScope) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final MeasureResult mo375measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
            return MeasureScope.layout$default(measureScope, Constraints.m6593getMinWidthimpl(j2), Constraints.m6592getMinHeightimpl(j2), null, C00131.INSTANCE, 4, null);
        }
    }
}
