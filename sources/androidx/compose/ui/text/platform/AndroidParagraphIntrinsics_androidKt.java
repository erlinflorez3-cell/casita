package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import androidx.core.text.TextUtilsCompat;
import java.util.List;
import java.util.Locale;
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
/* JADX INFO: compiled from: AndroidParagraphIntrinsics.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d̉=!,r\bDZc|\u0004G\u00078\u000bDB\u0007Ӭ4\u0012\u0006\u0013nj?0LeVLZS@\u000fs{J$cҕyCQU\"Ԃ*\teNo˧vJp\u000bKƤ\u000e\u0016\u0007p4կ]xs\u0012\u0017˰JoU3UoC:xCD\b82P<*\t\u000f\u001fBH>|+GY\u0013*0npjb\u001bU\u001d&\"\u000eN&\u0011 lg|Avv\fC_3\u0011uZZ7g@\u0003]\u000fVTU\u001a%kL4p;C#=S1\u0016\u0003_M\u0013Wqk\u0016/ѧ?OW\u0006o6\u0007\u0013D\u00199c%]!;\r\rW`\u001a=CQyJ~%n»¶zȞʀ\b\u0010\f?VGM0tڜ&3#q{@~\u0002\u0015\u0003Vаcي\u001b)\u001851:)hϢa@!Q=߈!;\u001dũ\u0005\t"}, d2 = {"6`b\u0012`6CWv\t\u0003i(\f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "5dc\u0015T:\u001e[#\u0004~<6\u0005\u0014+t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W+v8DG\r4>mkqB", "\u000fbcBT3)O&z|k(\b\f\u0013n\u000f5\u007fI\u000f\u001b\u0015U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9x8\u0004!7fy+:Q\u001f=ZGDy8\u001c#>", "BdgA", "", "Ash9X", "AoP;F;RZ\u0019\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9{Gr.#h\u0012'7C", ">kP0X/HZ\u0018~\bl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "@db<_=>B\u0019\u0012\n=0\n\t-t\u00042\u0005#\u0001'$K}\u001d@t3", "", "BdgA70KS\u0017\u000e~h5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t2ZC9z8(\u001e>", ":nR._,%W'\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u0006,~@\b\u001e3t\u0016\u0015QQJA", "@db<_=>B\u0019\u0012\n=0\n\t-t\u00042\u0005#\u0001'$K}\u001d@t3|<\u0004')<$\n", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.D`G\u0007Ak\u00125M*?yCsXL", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidParagraphIntrinsics_androidKt {
    /* JADX INFO: renamed from: resolveTextDirectionHeuristics-HklW4sA$default, reason: not valid java name */
    public static /* synthetic */ int m6382resolveTextDirectionHeuristicsHklW4sA$default(int i2, LocaleList localeList, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            localeList = null;
        }
        return m6381resolveTextDirectionHeuristicsHklW4sA(i2, localeList);
    }

    /* JADX INFO: renamed from: resolveTextDirectionHeuristics-HklW4sA, reason: not valid java name */
    public static final int m6381resolveTextDirectionHeuristicsHklW4sA(int i2, LocaleList localeList) {
        Locale platformLocale;
        if (TextDirection.m6537equalsimpl0(i2, TextDirection.Companion.m6542getContentOrLtrs_7Xco())) {
            return 2;
        }
        if (!TextDirection.m6537equalsimpl0(i2, TextDirection.Companion.m6543getContentOrRtls_7Xco())) {
            if (TextDirection.m6537equalsimpl0(i2, TextDirection.Companion.m6544getLtrs_7Xco())) {
                return 0;
            }
            if (TextDirection.m6537equalsimpl0(i2, TextDirection.Companion.m6545getRtls_7Xco())) {
                return 1;
            }
            if (TextDirection.m6537equalsimpl0(i2, TextDirection.Companion.m6541getContents_7Xco()) ? true : TextDirection.m6537equalsimpl0(i2, TextDirection.Companion.m6546getUnspecifieds_7Xco())) {
                if (localeList == null || (platformLocale = localeList.get(0).getPlatformLocale()) == null) {
                    platformLocale = Locale.getDefault();
                }
                int layoutDirectionFromLocale = TextUtilsCompat.getLayoutDirectionFromLocale(platformLocale);
                if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                    return 2;
                }
            } else {
                throw new IllegalStateException("Invalid TextDirection.".toString());
            }
        }
        return 3;
    }

    public static final ParagraphIntrinsics ActualParagraphIntrinsics(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, FontFamily.Resolver resolver) {
        return new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasEmojiCompat(TextStyle textStyle) {
        PlatformParagraphStyle paragraphStyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        return !(((platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : EmojiSupportMatch.m5975boximpl(paragraphStyle.m6052getEmojiSupportMatch_3YsG6Y())) == null ? false : EmojiSupportMatch.m5978equalsimpl0(r2.m5981unboximpl(), EmojiSupportMatch.Companion.m5984getNone_3YsG6Y()));
    }
}
