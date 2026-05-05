package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.emoji2.text.EmojiSpan;
import java.util.List;
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
/* JADX INFO: compiled from: PlaceholderExtensions.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d̉=!,o\bDZc|\u0004G\t8\u000bDB\u0007\"2\u0015\u007f\u0007tjA0ZeP\u008cZS@\u000fs{:%c$\bCCU }*\t]log\u0005Jbŏ[9\u0014!\u0011jZU}x\f\u001f?6P}W3{~m=n\u0005N\u0005N1R<\b\u0016\u0019\u001aXG@z\tUc\f@C\u0007pRx\u001ba\u001d\u001a@\u0012f /+\rw\\K`xmB?)\u0013kRNUn^\u0014{#vX5\u001f\u000faL>\u0007ʺU13م\u001b\u0007\u0001Zg\u0003mqsE?Ѫ)ȅM}g8^\u0001\"\u0017CQ\u0013`\u0001*|!_e$'YN\fK~\u0014^8Qԋ\u000fʀ\b\u0018\u0016)N5;\"~\n\u0014<\u0003|ՈDh"}, d2 = {"AoP;H5Bb", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "5dc c(GC\"\u0003\n&siU\"_P2:<\n !Vk\u001d@\u0001.C", "uI\u0018#", "5dc c(GC\"\u0003\n&siU\"_P2", "uI\u0018\u0016", "AoP;I,Kb\u001d|ve\b\u0004\r1n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u001fMPJo2\u001a\u001cDh=\tl\u0002", "5dc c(GD\u0019\f\nb*x\u0010\u000bl\u0004*\u0005\b\u007f!j:7o>5!>b\b/3|\u001a8VQ", "uH\u0018#", "5dc c(GD\u0019\f\nb*x\u0010\u000bl\u0004*\u0005\b\u007f!j:7o>", "uH\u0018\u0016", "Adc\u001d_(<S\u001c\t\u0002],\n", "", "\u001a`]1e6BRb\u000ezq;Fv:a\t1w=\b\u0017l", ">kP0X/HZ\u0018~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9xCr#5\\\b'6m#\u0004", "AsP?g", "3mS", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "Adc\u001d_(<S\u001c\t\u0002],\n\u0017", ">kP0X/HZ\u0018~\bl", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=*!\u001a\u001eja\u000f", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PlaceholderExtensions_androidKt {
    /* JADX INFO: renamed from: getSpanUnit--R2X_6o$annotations, reason: not valid java name */
    private static /* synthetic */ void m6395getSpanUnitR2X_6o$annotations(long j2) {
    }

    /* JADX INFO: renamed from: getSpanVerticalAlign-do9X-Gg$annotations, reason: not valid java name */
    private static /* synthetic */ void m6397getSpanVerticalAligndo9XGg$annotations(int i2) {
    }

    private static final void setPlaceholder(Spannable spannable, Placeholder placeholder, int i2, int i3, Density density) {
        for (Object obj : spannable.getSpans(i2, i3, EmojiSpan.class)) {
            spannable.removeSpan((EmojiSpan) obj);
        }
        SpannableExtensions_androidKt.setSpan(spannable, new PlaceholderSpan(TextUnit.m6831getValueimpl(placeholder.m6037getWidthXSAIIZE()), m6394getSpanUnitR2X_6o(placeholder.m6037getWidthXSAIIZE()), TextUnit.m6831getValueimpl(placeholder.m6035getHeightXSAIIZE()), m6394getSpanUnitR2X_6o(placeholder.m6035getHeightXSAIIZE()), density.getFontScale() * density.getDensity(), m6396getSpanVerticalAligndo9XGg(placeholder.m6036getPlaceholderVerticalAlignJ6kI3mc())), i2, i3);
    }

    /* JADX INFO: renamed from: getSpanUnit--R2X_6o, reason: not valid java name */
    private static final int m6394getSpanUnitR2X_6o(long j2) {
        long jM6830getTypeUIouoOA = TextUnit.m6830getTypeUIouoOA(j2);
        if (TextUnitType.m6859equalsimpl0(jM6830getTypeUIouoOA, TextUnitType.Companion.m6864getSpUIouoOA())) {
            return 0;
        }
        return TextUnitType.m6859equalsimpl0(jM6830getTypeUIouoOA, TextUnitType.Companion.m6863getEmUIouoOA()) ? 1 : 2;
    }

    /* JADX INFO: renamed from: getSpanVerticalAlign-do9X-Gg, reason: not valid java name */
    private static final int m6396getSpanVerticalAligndo9XGg(int i2) {
        if (PlaceholderVerticalAlign.m6041equalsimpl0(i2, PlaceholderVerticalAlign.Companion.m6045getAboveBaselineJ6kI3mc())) {
            return 0;
        }
        if (PlaceholderVerticalAlign.m6041equalsimpl0(i2, PlaceholderVerticalAlign.Companion.m6051getTopJ6kI3mc())) {
            return 1;
        }
        if (PlaceholderVerticalAlign.m6041equalsimpl0(i2, PlaceholderVerticalAlign.Companion.m6046getBottomJ6kI3mc())) {
            return 2;
        }
        if (PlaceholderVerticalAlign.m6041equalsimpl0(i2, PlaceholderVerticalAlign.Companion.m6047getCenterJ6kI3mc())) {
            return 3;
        }
        if (PlaceholderVerticalAlign.m6041equalsimpl0(i2, PlaceholderVerticalAlign.Companion.m6050getTextTopJ6kI3mc())) {
            return 4;
        }
        if (PlaceholderVerticalAlign.m6041equalsimpl0(i2, PlaceholderVerticalAlign.Companion.m6048getTextBottomJ6kI3mc())) {
            return 5;
        }
        if (PlaceholderVerticalAlign.m6041equalsimpl0(i2, PlaceholderVerticalAlign.Companion.m6049getTextCenterJ6kI3mc())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
    }

    public static final void setPlaceholders(Spannable spannable, List<AnnotatedString.Range<Placeholder>> list, Density density) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<Placeholder> range = list.get(i2);
            setPlaceholder(spannable, range.component1(), range.component2(), range.component3(), density);
        }
    }
}
