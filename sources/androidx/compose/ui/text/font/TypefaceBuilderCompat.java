package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import java.io.File;
import java.util.ArrayList;
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
/* JADX INFO: compiled from: AndroidPreloadedFont.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG<L͜P.hS2şs{J$c$wCCU0}*\tUNog\u0005JbŏK\u000f\u0014%\u0001jBI]xc\u0012\u0015̴B\u0006ЀcM\u001e<yez6ӯ$208B/\u000f\u001bBJ&u)E{\u0010 3XphV=Q\u0013\u001f*\u0006l&1$jnf8^k\fB_'\u0011rZNUiv\u0002\u0016/T_?\u000f\r`L-p;C!=S1\u0014\u0003aM\nWsS\u0004\u0017/W/W|o6\u0007\nZ\u001asq\u001bk\u000b(r\u0004\u007fb<+9^{K~\u001eX}\t\u0003%>\u001a\r4/x2;#~\b<=;w\u001c_^\u0013vH\u0010|q6E8.ES9Ip\u0002gI f9\u0012\u0004;&i\u0002ͼ%[b\"ה\u00190"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~H\u0012+7n\u0012,M Ko;\u001d\u0015u?C\u000fn(]L", "", "u(E", "1qT.g,\u001f`#\u0007Vl:|\u0018=", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0017\u0010K\u0001\u0018\u0013Eoc", "/rb2g\u0014:\\\u0015\u0001zk", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\n\\%%G~u8\u007f!7Y\u000bu", ">`c5", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "D`a6T;B]\"lzm;\u0001\u00121s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5P\u0005|", "1qT.g,\u001f`#\u0007[b3|", "4h[2", "\u001aiPCTuB]b_~e,R", "1qT.g,\u001f`#\u0007[b3|g/s}5\u007fK\u0010!$", "4h[27,LQ&\u0003\u0006m6\n", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007\t\u007fG\u0001u\u0017Um\u001b@\u00024?fS", "BnE.e0:b\u001d\t\u0004L,\f\u00183n\u00026", "", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI)\u0006I\u0010%`(y\u0017Kg!B]y/;w\u001f\n`GIA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|\u0007*ZG7z8(\u001e'O9\u0016r0Wx5\u001d3J5[_|A\u0013[X\u0018W:\r\u000eh\u000b\u0002xMF\u001f\u001b;\u001fE1O|\u0015\u0015\u001b?no\fX\u001dC\u0005\u0018y?72Gch\tU\u000b&l3s|[*`6I(\u001ezt.l^\u0004", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class TypefaceBuilderCompat {
    public static final TypefaceBuilderCompat INSTANCE = new TypefaceBuilderCompat();

    private TypefaceBuilderCompat() {
    }

    public final android.graphics.Typeface createFromAssets(AssetManager assetManager, String str, Context context, FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(assetManager, str).setFontVariationSettings(toVariationSettings(settings, context)).build();
    }

    public final android.graphics.Typeface createFromFile(File file, Context context, FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(file).setFontVariationSettings(toVariationSettings(settings, context)).build();
    }

    public final android.graphics.Typeface createFromFileDescriptor(ParcelFileDescriptor parcelFileDescriptor, Context context, FontVariation.Settings settings) {
        if (context == null) {
            return null;
        }
        return new Typeface.Builder(parcelFileDescriptor.getFileDescriptor()).setFontVariationSettings(toVariationSettings(settings, context)).build();
    }

    private final FontVariationAxis[] toVariationSettings(FontVariation.Settings settings, Context context) throws Throwable {
        Density Density;
        if (context != null) {
            Density = AndroidDensity_androidKt.Density(context);
        } else if (!settings.getNeedsDensity$ui_text_release()) {
            Density = DensityKt.Density(1.0f, 1.0f);
        } else {
            throw new IllegalStateException("Required density, but not provided");
        }
        List<FontVariation.Setting> settings2 = settings.getSettings();
        ArrayList arrayList = new ArrayList(settings2.size());
        int size = settings2.size();
        for (int i2 = 0; i2 < size; i2++) {
            FontVariation.Setting setting = settings2.get(i2);
            arrayList.add(new FontVariationAxis(setting.getAxisName(), setting.toVariationValue(Density)));
        }
        return (FontVariationAxis[]) arrayList.toArray(new FontVariationAxis[0]);
    }
}
