package androidx.compose.ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.compose.ui.text.font.FontVariation;
import java.io.File;
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
/* JADX INFO: compiled from: AndroidFont.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.XT2\u000f\u0002{<$a$yCIa\"Ԃ*\teNogtKb\u000bQ\u000f\u000eǝ\u0011!:կmx\f\u0011?6PoW3{pm?ftD\u000782P;*\u000b\u0007\u001a8L(v)H{\u0012\u00180NvRR;TK\u001fǀ\u0005̄ŋ\u0005 bo\\?`#kŽG#1hrR5iH|{\u0018vZ-\r\u0005c6+n:e\u001b+S\u0011\u000bj[m\bowC\u0005v-?+wz\u001e;ߒ~ϬƦ/Q\u0013e\u00012tC_Ӡ$'YN\u0014O^\u001b@w)\n=@\u0012\u001d\u001e'v>] l\b\u001c5\rr\u0002C\u0001\bdB\u000e~y6E*0919)liai \u0015<\u009e\u0004ټ̷'\u0003t2if&f#.lw\u007fE\u0018@׃HS\u0012\\Cщ \u001fa͌.\u0019"}, d2 = {"\u0014n]A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FC", "4h[27,LQ&\u0003\u0006m6\n", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007\t\u007fG\u0001u\u0017Um\u001b@\u00024?fS", "EdX4[;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "D`a6T;B]\"lzm;\u0001\u00121s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5P\u0005|", "\u0014n]A \fC\"\u0002jL1", "uKP;W9HW\u0018H\u0005lug\u0005<c\u007f/\\D\b\u0017uG}\fIz0Dc\u000bu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u0011[N?k\u001csG\u001d!$nX4\u001cvYE&qS\r\u0003n(R\u0001Hr\u0005\u000b)W3txM`\u001eGC%y\u000b8hYh)zQJT,\u000bn\u0015n\u000eXG> #u#$'>.\u0019\u000bW\u001at`O+NC\"yE.Bln\u0010Cy]G~5\u001f\u0015\f{[AX\b:>.\u000e=9\u007fE\u000fTvm", "4h[2", "\u001aiPCTuB]b_~e,R", "uKY.i(\bW#H[b3|^\u0016a\t'\tJ\u0005\u0016*\u0011m\u0018D\u0002/CYG0;7%.`R\u0005l>'$2BC\u0010r\u001eNz)J[$\u0010CN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fuX\u0002NwJ\r \u0017D4QL_\u001f8u\"y=8lPb\u001egGPTf3f\u001a5`C6C#!{\u001d\u001a{\u001a,\u0014\u0004^\u001b\u0001RCwk\u0011(zK3\bneOT96F}6t", ">`c5", "", "/rb2g\u0014:\\\u0015\u0001zk", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\n\\%%G~u8\u007f!7Y\u000bu", "\u0014n]A \u0014N1ef[l", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\r\u0006t/>h})F7#.[\r\u0017yB\u001e$P]B\u0003e,[L\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#Q(8S72\u0017uJ\fDwJl \u0017D\\pFX\u0013VOx\\=2gSccxZ\u000bCl2o\u0016m\u001d&J>m#q,*2Q8\u0013\u000b\u001dq|[\tXcT\u001dvG(Hv\u001a4E~d@})-!?^\u000e;W\u00025x,\u0017}(@l\u0010Uu\u0018\bn|^;\\T6o7F\u001cN\u0015D\u007fuMc", "5d]2e(MSt\byk6\u0001\b\u0010o\t7aOa!$#z\u0012\u001a\u0001-@U\r$4q\u001d2\\W", "", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidFontKt {
    private static final void generateAndroidFontKtForApiCompatibility() {
    }

    /* JADX INFO: renamed from: Font-MuC2MFs$default, reason: not valid java name */
    public static /* synthetic */ Font m6186FontMuC2MFs$default(String str, AssetManager assetManager, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3, Object obj) {
        if ((4 & i3) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            i2 = FontStyle.Companion.m6240getNormal_LCdwA();
        }
        if ((i3 & 16) != 0) {
            settings = FontVariation.INSTANCE.m6255Settings6EWAqTQ(fontWeight, i2, new FontVariation.Setting[0]);
        }
        return m6185FontMuC2MFs(str, assetManager, fontWeight, i2, settings);
    }

    /* JADX INFO: renamed from: Font-MuC2MFs, reason: not valid java name */
    public static final Font m6185FontMuC2MFs(String str, AssetManager assetManager, FontWeight fontWeight, int i2, FontVariation.Settings settings) {
        return new AndroidAssetFont(assetManager, str, fontWeight, i2, settings, null);
    }

    /* JADX INFO: renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m6184FontEj4NQ78$default(File file, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i3 + 4) - (4 | i3) != 0) {
            i2 = FontStyle.Companion.m6240getNormal_LCdwA();
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            settings = FontVariation.INSTANCE.m6255Settings6EWAqTQ(fontWeight, i2, new FontVariation.Setting[0]);
        }
        return m6182FontEj4NQ78(file, fontWeight, i2, settings);
    }

    /* JADX INFO: renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m6182FontEj4NQ78(File file, FontWeight fontWeight, int i2, FontVariation.Settings settings) {
        return new AndroidFileFont(file, fontWeight, i2, settings, null);
    }

    /* JADX INFO: renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m6183FontEj4NQ78$default(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3, Object obj) {
        if ((i3 + 2) - (2 | i3) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((4 & i3) != 0) {
            i2 = FontStyle.Companion.m6240getNormal_LCdwA();
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            settings = FontVariation.INSTANCE.m6255Settings6EWAqTQ(fontWeight, i2, new FontVariation.Setting[0]);
        }
        return m6181FontEj4NQ78(parcelFileDescriptor, fontWeight, i2, settings);
    }

    /* JADX INFO: renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m6181FontEj4NQ78(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i2, FontVariation.Settings settings) {
        return new AndroidFileDescriptorFont(parcelFileDescriptor, fontWeight, i2, settings, null);
    }
}
