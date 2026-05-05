package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontWeight;
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
/* JADX INFO: compiled from: AndroidFontUtils.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d̉=!4i\bDZc|\u0004G\u00078\u000b<H\u0007\"2\u0012\u007f\u0007|jA0JfP.`\\2\u000fq{LDi'\nCiYJ\u00020\u000egN\u0016f\u001fNh\u0011[\u000f4\u001d?̓ÒHǁޯa\u0014\u0015:PxWI[rU9\u000fxf\t.<:8(\u00101\u001e8T(v)N\u0012È2FN\u0081RR;L-\u001a@\u0006t^Wȧ^ʄR:`nc;=%ɈiGV*e݀\u0019{\fШX4"}, d2 = {"\u000fmS?b0=0#\u0006y", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJ*\u0012(\u001ds]B\u000bm5$", "5dc\u000ea+K]\u001d}Wh3{", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|\b.QE>zr{\u001fpl5\u0010g6WLj.HW+i\\v<'[X\u0018V6\u0017\u0013Y\u000b4r\u000eF\u001f\u001b;\u0013\u0003Eq\u0010Uv\u0018>ybBZ\u0012J\tj", "5dc\u000ea+K]\u001d}ir7|\n+c\u007f\u0016\u000bT\b\u0017", "", "4n]AJ,BU\u001c\u000e", "4n]AF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "5dc\u000ea+K]\u001d}ir7|\n+c\u007f\u0016\u000bT\b\u0017^(YY$}\u0017\u001d", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|\b.QE>z\n\u0002XL", "7r1<_+", "", "7r8AT3BQ", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidFontUtils_androidKt {
    public static final int getAndroidTypefaceStyle(boolean z2, boolean z3) {
        if (z3 && z2) {
            return 3;
        }
        if (z2) {
            return 1;
        }
        return z3 ? 2 : 0;
    }

    public static final FontWeight getAndroidBold(FontWeight.Companion companion) {
        return companion.getW600();
    }

    /* JADX INFO: renamed from: getAndroidTypefaceStyle-FO1MlWM, reason: not valid java name */
    public static final int m6187getAndroidTypefaceStyleFO1MlWM(FontWeight fontWeight, int i2) {
        return getAndroidTypefaceStyle(fontWeight.compareTo(getAndroidBold(FontWeight.Companion)) >= 0, FontStyle.m6233equalsimpl0(i2, FontStyle.Companion.m6239getItalic_LCdwA()));
    }
}
