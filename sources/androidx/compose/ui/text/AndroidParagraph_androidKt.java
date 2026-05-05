package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: AndroidParagraph.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d̉=!,r\bӵLc\u000b\u0004I\u00066\u000b6B\r(4ߚ\u007f\u0007|jA0JgP.hS2\u000fq|<$q$yCAV\"}8\tWNmhvJp\u000bK\u000f\f\u0016\u0001j:T]ތe\u0012%2JoE3UoS9ht<\u00058H0\u0600\u0012\u0005/\u0019ZL\u001ev\u0013Cy\rB4NrRR;LK\u001a*\u001eL#\u0019\u001e\u000bk~:Vqu:])IiƢMϋۢ4~S\u0014T\\?%\u0005j6+n;e\u00193]\u001b\u0007\u0001f\u0006\u0003Ճpܵݾl)-7W{oNf\r,\u0015YS=a\u00014t\u0005\u007foR'̼NҪׂT\u0010.\b\t\u0004%T\u0012\u001f\u001e'v2]\u001et\u001a&3#\u0006\u001a@҉\u0001މ۰\u0004|gJ%-\u0018K9N3f\u007fek\u001d\\M\u0014\u0005;5i\u0001ϒ żڍ\u0012b\u001b3b\u007fi;_YUH|$\u0002=\u001c\u001e7b\u001a<\u0012K_\u007f]\u007f9.EAg_G@9k0L\u000bg\u000f\u0019n\u0007ki\u0001Lh\"\u001d5}*ė\u000bɮֈh\u0007qpb`\u008f\u0011R$W\rĄ$A\u001fϨ{]"}, d2 = {"Ag^B_+\u001ab(zxa\u0010\u0006\b/n\u000f$\u000bD\u000b wK\u0003{Gr.", "", "BdgAF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "3k[6c:Ba", "Bn;.l6Nbt\u0006~`5", "", "/kX4a", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|q5QEDA", "Bn;.l6Nbt\u0006~`5D\u0005\"eQ=X\u000b", "uH\u0018\u0016", "Bn;.l6Nbu\fzZ2j\u0018<a\u000f(}T", "0qT.^\u001aM`\u0015\u000ez`@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?A*\"-\"dp9\tw\u0002", "Bn;.l6Nbu\fzZ2j\u0018<a\u000f(}TH*zOs\u0014=V", "Bn;.l6Nb{\u0013\u0006a,\u0006\u0005>i\n1\\M\u0001#'Gx\fP", "6x_5X5L", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#`4Bp\u00167[\u0019", "Bn;.l6Nb{\u0013\u0006a,\u0006\u0005>i\n1\\M\u0001#'Gx\fP>l\u0003Zk\t\u001bM", "Bn;.l6Nb\u007f\u0003\u0004^\t\n\t+km7\u0010G\u0001", ":h]259>O\u001fl\nk0z\u00188e\u000e6", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?A*\"-\"l_H\u0010c:\\L", "Bn;.l6Nb\u007f\u0003\u0004^\t\n\t+km7\u0010G\u0001^\u001aRm\u001a;\u0007w", "Bn;.l6Nb\u007f\u0003\u0004^\t\n\t+kq2\t?n&+No", ":h]259>O\u001fp\u0005k+j\u0018Cl\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#d$@mr;M?A*&(\"g>F\u0007_2$", "Bn;.l6Nb\u007f\u0003\u0004^\t\n\t+kq2\t?n&+NoUNa\u000e\u007fF\t2", "/sc.V/\"\\\u0018~\u0004m(\f\r9n`,\u000f.\f\u0013 ", "", "<t\\/X9(T\u007f\u0003\u0004^:k\f+t`,\u000b(|*yGs\u0010?\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\nEu2?]|i&m)=4?OuD-j", ";`g\u0015X0@V(", "Bn;.l6Nb\b~\u000em\u000e\n\u00058u\u0007$\tD\u0010+", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u0017fy)Gt\u0012;QROA", "Bn;.l6Nb\b~\u000em\u000e\n\u00058u\u0007$\tD\u0010+^F\u007fvJu+7", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final int m5968toLayoutAlignaXe7zB0(int i2) {
        if (TextAlign.m6523equalsimpl0(i2, TextAlign.Companion.m6530getLefte0LSkKk())) {
            return 3;
        }
        if (TextAlign.m6523equalsimpl0(i2, TextAlign.Companion.m6531getRighte0LSkKk())) {
            return 4;
        }
        if (TextAlign.m6523equalsimpl0(i2, TextAlign.Companion.m6527getCentere0LSkKk())) {
            return 2;
        }
        return (!TextAlign.m6523equalsimpl0(i2, TextAlign.Companion.m6532getStarte0LSkKk()) && TextAlign.m6523equalsimpl0(i2, TextAlign.Companion.m6528getEnde0LSkKk())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final int m5970toLayoutHyphenationFrequency3fSNIE(int i2) {
        if (Hyphens.m6433equalsimpl0(i2, Hyphens.Companion.m6437getAutovmbZdU8())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        Hyphens.m6433equalsimpl0(i2, Hyphens.Companion.m6438getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final int m5969toLayoutBreakStrategyxImikfE(int i2) {
        if (LineBreak.Strategy.m6464equalsimpl0(i2, LineBreak.Strategy.Companion.m6470getSimplefcGXIks())) {
            return 0;
        }
        if (LineBreak.Strategy.m6464equalsimpl0(i2, LineBreak.Strategy.Companion.m6469getHighQualityfcGXIks())) {
            return 1;
        }
        return LineBreak.Strategy.m6464equalsimpl0(i2, LineBreak.Strategy.Companion.m6468getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final int m5971toLayoutLineBreakStylehpcqdu8(int i2) {
        if (LineBreak.Strictness.m6475equalsimpl0(i2, LineBreak.Strictness.Companion.m6479getDefaultusljTpc())) {
            return 0;
        }
        if (LineBreak.Strictness.m6475equalsimpl0(i2, LineBreak.Strictness.Companion.m6480getLooseusljTpc())) {
            return 1;
        }
        if (LineBreak.Strictness.m6475equalsimpl0(i2, LineBreak.Strictness.Companion.m6481getNormalusljTpc())) {
            return 2;
        }
        return LineBreak.Strictness.m6475equalsimpl0(i2, LineBreak.Strictness.Companion.m6482getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final int m5972toLayoutLineBreakWordStylewPN0Rpw(int i2) {
        return (!LineBreak.WordBreak.m6487equalsimpl0(i2, LineBreak.WordBreak.Companion.m6491getDefaultjp8hJ3c()) && LineBreak.WordBreak.m6487equalsimpl0(i2, LineBreak.WordBreak.Companion.m6492getPhrasejp8hJ3c())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i2) {
        int lineCount = textLayout.getLineCount();
        for (int i3 = 0; i3 < lineCount; i3++) {
            if (textLayout.getLineBottom(i3) > i2) {
                return i3;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z2) {
        return (!z2 || TextUnit.m6828equalsimpl0(textStyle.m6159getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) || TextUnit.m6828equalsimpl0(textStyle.m6159getLetterSpacingXSAIIZE(), TextUnit.Companion.m6842getUnspecifiedXSAIIZE()) || TextAlign.m6523equalsimpl0(textStyle.m6164getTextAligne0LSkKk(), TextAlign.Companion.m6533getUnspecifiede0LSkKk()) || TextAlign.m6523equalsimpl0(textStyle.m6164getTextAligne0LSkKk(), TextAlign.Companion.m6532getStarte0LSkKk()) || TextAlign.m6523equalsimpl0(textStyle.m6164getTextAligne0LSkKk(), TextAlign.Companion.m6529getJustifye0LSkKk())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: toLayoutTextGranularity-duNsdkg, reason: not valid java name */
    public static final int m5973toLayoutTextGranularityduNsdkg(int i2) {
        return (!TextGranularity.m6083equalsimpl0(i2, TextGranularity.Companion.m6087getCharacterDRrd7Zo()) && TextGranularity.m6083equalsimpl0(i2, TextGranularity.Companion.m6088getWordDRrd7Zo())) ? 1 : 0;
    }
}
