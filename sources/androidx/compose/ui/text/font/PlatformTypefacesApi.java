package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: compiled from: PlatformTypefaces.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007fјnjO0L͜P.hS2\u000fq\u0001<$q$yCA\\\"}8\tWȞog\u0005Jb\u000bI\u0010\f\u0017\u000f̓\\I\u0004w\u001e\u0015Ƥ6B}?{}}>Q`#85(8\"F|\u001d\u00030)v\u0014'\u0001IK\u001a\u0017H@\u001f@\u0003\u0013S\u0005(\u0019\u001e>N\td\\˚MȤՂp_@81\r2b\\2w0+O=Jb,%v\u0010$[DE<-%\u0002\u000bMfĲ>šӭu?\u000bt54sq\u0002eNX.\u0016E/]\u001curTl5Un\u0011?+}i{T\u001c/\u0010z*\u0015\u0003\u0018ٳ\u0005Ωρ2/ w\u0016 {\u001f\u0001fXR\u0018]p\u0002+eD+=\u007fa/i\u001ftfy;GTg\u007f\u0013#6#/vg[ۣ\r֫ڠ\u001fV}h?[\twVf\"[Sl2r\u0013\u00068\u0018HG.3,\u0015<,=7\n?S%y\u0018`D\u0016~5dvl\u0002RvZRr$RB\t:v\u000bx̆j¬Ԝ\\.\u0017j*r\u0378}\r\u001b#bʞXO$ŔRn"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~D\u0005\u001cFn ;U2Ov4\u001f\u0011faGbn0$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~D\u0005\u001cFn ;U2Ov4\u001f\u0011faG\\", "u(E", "1qT.g,\u001a\\\u0018\f\u0005b+k\u001d:e\u0001$y@p%\u001bPq|P\u0002%6U{ %|*5M", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0017\u0010K\u0001\u0018\u0013Eoc", "5d]2e0<4#\b\n?(\u0005\r6y", "", "4n]AJ,BU\u001c\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "4n]AF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "1qT.g,\u001a\\\u0018\f\u0005b+k\u001d:e\u0001$y@p%\u001bPq|P\u0002%6U{ %|*5M\u000b(kC\b\u0019Lc", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\rJkG-^ikB\u0016-\rX\u007f69LR._aH!WxV\u0017M8\u0017\tX\u000b&{@B\"\f*WK*|\f\f\u0017\n3jF", "1qT.g,\u001dS\u001az\u000be;", "1qT.g,\u001dS\u001az\u000be;Di\u00191g/m(", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|\b.QE>z\n\u0002XO]B\u0006p6RupIYJ7_VpK]\u0001n\u0019N,\t\u0003Y\u0017", "1qT.g,'O!~y", "<`\\2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~;})7z\u001a,.MDz\u0015\u001a\u001dlhM\\", "1qT.g,'O!~y&\u0019|\u0018\u0019ic*", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#_ @m#2K$EtC~\u0011pe@\u001b9\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001d\t#P$\u0002S\u0001 \u00125XK\u001cr\n\u001b\b\u000e9lsQ,s\u000b`\u0011~@6rJX){T=Pe.b\u001a)\fpE:%\u0010o\u0019p", ":nP1A(FS\u0018_\bh4k\u001d:e\u0001$y@^\u0013\u0015JowI_5<`", "4`\\6_@'O!~", "EdX4[;", "Ash9X", ":nP1A(FS\u0018_\bh4k\u001d:e\u0001$y@^\u0013\u0015JowI_5<`E\r7|\u007f21E", "=oc6b5:Z\u0003\bY^=\u0001\u0007/F\n1\u000b!|\u001f\u001bN\u0004jP_!=Y", "D`a6T;B]\"lzm;\u0001\u00121s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5P\u0005|", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "=oc6b5:Z\u0003\bY^=\u0001\u0007/F\n1\u000b!|\u001f\u001bN\u0004jP_!=YEq\nL{\u007fT+", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\rJkG-^ikB\u0016-\rX\u007f69LR._aH!z\u000ec\r[5\u0011\u0004l\u000b\"xLB)\u0016,\u0013\u0012?2\u0010\f)\u001d~kzKeY(\u0004\u001e\u00052%uJUn}QJ\u0004P*s\u001bc&^H\u0010\u000b\u0010z\u0018(rT-Sy]\u001a\u0002R\u0003v1%#\u0004G$Q|1\n,k^;\u00021#JEy\u001f.cw/r;M#>Ad\u0006Ge\u0018\u0014", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class PlatformTypefacesApi implements PlatformTypefaces {
    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* JADX INFO: renamed from: createDefault-FO1MlWM */
    public android.graphics.Typeface mo6260createDefaultFO1MlWM(FontWeight fontWeight, int i2) {
        return m6263createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i2);
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* JADX INFO: renamed from: createNamed-RetOiIg */
    public android.graphics.Typeface mo6261createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i2) {
        android.graphics.Typeface typefaceM6265loadNamedFromTypefaceCacheOrNullRetOiIg = m6265loadNamedFromTypefaceCacheOrNullRetOiIg(PlatformTypefaces_androidKt.getWeightSuffixForFallbackFamilyName(genericFontFamily.getName(), fontWeight), fontWeight, i2);
        return typefaceM6265loadNamedFromTypefaceCacheOrNullRetOiIg == null ? m6263createAndroidTypefaceUsingTypefaceStyleRetOiIg(genericFontFamily.getName(), fontWeight, i2) : typefaceM6265loadNamedFromTypefaceCacheOrNullRetOiIg;
    }

    @Override // androidx.compose.ui.text.font.PlatformTypefaces
    /* JADX INFO: renamed from: optionalOnDeviceFontFamilyByName-78DK7lM */
    public android.graphics.Typeface mo6262optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i2, FontVariation.Settings settings, Context context) {
        android.graphics.Typeface typefaceMo6261createNamedRetOiIg;
        if (Intrinsics.areEqual(str, FontFamily.Companion.getSansSerif().getName())) {
            typefaceMo6261createNamedRetOiIg = mo6261createNamedRetOiIg(FontFamily.Companion.getSansSerif(), fontWeight, i2);
        } else if (Intrinsics.areEqual(str, FontFamily.Companion.getSerif().getName())) {
            typefaceMo6261createNamedRetOiIg = mo6261createNamedRetOiIg(FontFamily.Companion.getSerif(), fontWeight, i2);
        } else if (Intrinsics.areEqual(str, FontFamily.Companion.getMonospace().getName())) {
            typefaceMo6261createNamedRetOiIg = mo6261createNamedRetOiIg(FontFamily.Companion.getMonospace(), fontWeight, i2);
        } else {
            typefaceMo6261createNamedRetOiIg = Intrinsics.areEqual(str, FontFamily.Companion.getCursive().getName()) ? mo6261createNamedRetOiIg(FontFamily.Companion.getCursive(), fontWeight, i2) : m6265loadNamedFromTypefaceCacheOrNullRetOiIg(str, fontWeight, i2);
        }
        return PlatformTypefaces_androidKt.setFontVariationSettings(typefaceMo6261createNamedRetOiIg, settings, context);
    }

    /* JADX INFO: renamed from: loadNamedFromTypefaceCacheOrNull-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m6265loadNamedFromTypefaceCacheOrNullRetOiIg(String str, FontWeight fontWeight, int i2) {
        if (str.length() == 0) {
            return null;
        }
        android.graphics.Typeface typefaceM6263createAndroidTypefaceUsingTypefaceStyleRetOiIg = m6263createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i2);
        if (Intrinsics.areEqual(typefaceM6263createAndroidTypefaceUsingTypefaceStyleRetOiIg, android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, AndroidFontUtils_androidKt.m6187getAndroidTypefaceStyleFO1MlWM(fontWeight, i2))) || Intrinsics.areEqual(typefaceM6263createAndroidTypefaceUsingTypefaceStyleRetOiIg, m6263createAndroidTypefaceUsingTypefaceStyleRetOiIg(null, fontWeight, i2))) {
            return null;
        }
        return typefaceM6263createAndroidTypefaceUsingTypefaceStyleRetOiIg;
    }

    /* JADX INFO: renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg$default, reason: not valid java name */
    static /* synthetic */ android.graphics.Typeface m6264createAndroidTypefaceUsingTypefaceStyleRetOiIg$default(PlatformTypefacesApi platformTypefacesApi, String str, FontWeight fontWeight, int i2, int i3, Object obj) {
        if ((i3 + 1) - (1 | i3) != 0) {
            str = null;
        }
        if ((2 & i3) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            i2 = FontStyle.Companion.m6240getNormal_LCdwA();
        }
        return platformTypefacesApi.m6263createAndroidTypefaceUsingTypefaceStyleRetOiIg(str, fontWeight, i2);
    }

    /* JADX INFO: renamed from: createAndroidTypefaceUsingTypefaceStyle-RetOiIg, reason: not valid java name */
    private final android.graphics.Typeface m6263createAndroidTypefaceUsingTypefaceStyleRetOiIg(String str, FontWeight fontWeight, int i2) {
        String str2;
        if (FontStyle.m6233equalsimpl0(i2, FontStyle.Companion.m6240getNormal_LCdwA()) && Intrinsics.areEqual(fontWeight, FontWeight.Companion.getNormal()) && ((str2 = str) == null || str2.length() == 0)) {
            return android.graphics.Typeface.DEFAULT;
        }
        int iM6187getAndroidTypefaceStyleFO1MlWM = AndroidFontUtils_androidKt.m6187getAndroidTypefaceStyleFO1MlWM(fontWeight, i2);
        String str3 = str;
        if (str3 == null || str3.length() == 0) {
            return android.graphics.Typeface.defaultFromStyle(iM6187getAndroidTypefaceStyleFO1MlWM);
        }
        return android.graphics.Typeface.create(str, iM6187getAndroidTypefaceStyleFO1MlWM);
    }
}
