package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: TextLayoutHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d̉=!,r\bDZc|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjGNLe^.ZS@\u000fsڔ<$i*yCAU\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001̓4Ikxe܈\u00172XoG3SpU*nҚN\u0005N1J8(\u00051\u001e8I(v)E{\u0010 3XphV=]\u0013\u001f*\u0012N(\u0011$li^6vt\fA])3mPW?_^\u0007}\u0011T_?\r%`N/NCM\u0015S`3\u000b`iW\u0003m\u0001m\tv7?+w\u0005\b:f\u0012,\u0015Yb=a\u0001:t\u0005\u007fuRʬ̼NҪׂT\u0010.\u000e\t\u0013ȡ<\t\u0016\t-πJ[\u0019Ǻ\f&"}, d2 = {"1`]\u001fX<LS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "BdgA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", ">kP0X/HZ\u0018~\bl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", ";`g\u0019\\5>a", "", "AnUAJ9:^", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|\u007f?MP<r>0j", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "1`]\u001fX<LS`Pt0 ZY\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W+v8D@y4A}%\u001bMQKrCs{dj8\u0014m0M\npEVV7f`r\u0007$\u0016$\u001dN>\u001cN5J-xS3.\b+7\u0011Hl\n\u000ekt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\f\\MI\u0012#\u0006 \u001b>73\u0006\rOZ\u0003a}n1.\u001d\tGy\"b?-AxTI~+\u001e^Eu\u001c:c~9tv\u00148sFm\tZ1v>g\u0007\u0019;p\u0017\u000e\"?; IOb\t6<\u0018p*k\u0016\u000e,E5bungWXmY+eEp>\u0005DR\u0004MMy\u001e|-zKZ\u0007\u001f\r\u000677cSK&^\u000f\u001a:T&) \u0003\u0016ua\u001d8\u001fL#or3n\u0018I\u001b\roLJhYQ\u001fwY\u0010z!W\u001fL", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextLayoutHelperKt {
    /* JADX INFO: renamed from: canReuse-7_7YC6M, reason: not valid java name */
    public static final boolean m1425canReuse7_7YC6M(TextLayoutResult textLayoutResult, AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i2, boolean z2, int i3, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2) {
        TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
        if (textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || !Intrinsics.areEqual(layoutInput.getText(), annotatedString) || !layoutInput.getStyle().hasSameLayoutAffectingAttributes(textStyle) || !Intrinsics.areEqual(layoutInput.getPlaceholders(), list) || layoutInput.getMaxLines() != i2 || layoutInput.getSoftWrap() != z2 || !TextOverflow.m6569equalsimpl0(layoutInput.m6092getOverflowgIe3tQ8(), i3) || !Intrinsics.areEqual(layoutInput.getDensity(), density) || layoutInput.getLayoutDirection() != layoutDirection || !Intrinsics.areEqual(layoutInput.getFontFamilyResolver(), resolver) || Constraints.m6593getMinWidthimpl(j2) != Constraints.m6593getMinWidthimpl(layoutInput.m6091getConstraintsmsEJaDk())) {
            return false;
        }
        if (z2 || TextOverflow.m6569equalsimpl0(i3, TextOverflow.Companion.m6577getEllipsisgIe3tQ8())) {
            return Constraints.m6591getMaxWidthimpl(j2) == Constraints.m6591getMaxWidthimpl(layoutInput.m6091getConstraintsmsEJaDk()) && Constraints.m6590getMaxHeightimpl(j2) == Constraints.m6590getMaxHeightimpl(layoutInput.m6091getConstraintsmsEJaDk());
        }
        return true;
    }
}
