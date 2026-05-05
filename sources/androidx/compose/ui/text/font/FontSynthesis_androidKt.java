package androidx.compose.ui.text.font;

import android.os.Build;
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
/* JADX INFO: compiled from: FontSynthesis.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d̉=!,˛\bDZc|\u0004G\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.XTBCyڔL$\n#\u001aCiUJ\u00020\ngN\u0016f\u001fNh\r[\u000f4\u0019)n:Mmx\f\u0017?6PuW3{v\u0004ʠǔsȂӯ$4(@\b\u000eВ\u001a/P\u0013|ٻ_y\u000bܞ4J"}, d2 = {"Ax]A[,LW.~ir7|\n+c\u007f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[*7\\F;y8,j", "Bx_2Y(<S", "4n]A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FC", "@d`BX:MS\u0018pzb.\u007f\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "@d`BX:MS\u0018l\nr3|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "Ax]A[,LW.~ir7|\n+c\u007fo\\S\u0013\u0002cGK", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016w]G\u0005z41$2bC\u0010ru/\u00010V\"5(eQ\u007fG\u0018\u0011mWL5\u0015\u0010cO$8T;h\u0017,\\\u0011\u0005i\u000b\u0015%W\u0016tyQH\u0010K{\u0018\u0005\u0017\r,-^[\u000bC\u000bL^3fUI\u001aa:83i", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FontSynthesis_androidKt {
    /* JADX INFO: renamed from: synthesizeTypeface-FxwP2eA, reason: not valid java name */
    public static final Object m6254synthesizeTypefaceFxwP2eA(int i2, Object obj, Font font, FontWeight fontWeight, int i3) {
        int weight;
        boolean zM6233equalsimpl0;
        if (!(obj instanceof android.graphics.Typeface)) {
            return obj;
        }
        boolean z2 = FontSynthesis.m6247isWeightOnimpl$ui_text_release(i2) && !Intrinsics.areEqual(font.getWeight(), fontWeight) && fontWeight.compareTo(AndroidFontUtils_androidKt.getAndroidBold(FontWeight.Companion)) >= 0 && font.getWeight().compareTo(AndroidFontUtils_androidKt.getAndroidBold(FontWeight.Companion)) < 0;
        boolean z3 = FontSynthesis.m6246isStyleOnimpl$ui_text_release(i2) && !FontStyle.m6233equalsimpl0(i3, font.mo6188getStyle_LCdwA());
        if (!z3 && !z2) {
            return obj;
        }
        if (Build.VERSION.SDK_INT < 28) {
            return android.graphics.Typeface.create((android.graphics.Typeface) obj, AndroidFontUtils_androidKt.getAndroidTypefaceStyle(z2, z3 && FontStyle.m6233equalsimpl0(i3, FontStyle.Companion.m6239getItalic_LCdwA())));
        }
        if (z2) {
            weight = fontWeight.getWeight();
        } else {
            weight = font.getWeight().getWeight();
        }
        if (z3) {
            zM6233equalsimpl0 = FontStyle.m6233equalsimpl0(i3, FontStyle.Companion.m6239getItalic_LCdwA());
        } else {
            zM6233equalsimpl0 = FontStyle.m6233equalsimpl0(font.mo6188getStyle_LCdwA(), FontStyle.Companion.m6239getItalic_LCdwA());
        }
        return TypefaceHelperMethodsApi28.INSTANCE.create((android.graphics.Typeface) obj, weight, zM6233equalsimpl0);
    }
}
