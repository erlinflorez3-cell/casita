package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: compiled from: AndroidShader.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d̉=!4i\bDZc|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lmA0ZeP.XS2\u000fy\u001a<$q$yّCU(\u0003*\tUXog|PbŏK\u000f\u0014)\u0001j2I]xk$\u00172HoG3[oE9ftN1.݅:<(\u0004i\u001a\tH@z\tDc\f@2ptHU%M3\u001eB\nL%\u0019\u001e\u000bk\u0015Ȥ֘kҗƠ3%\toPU?*>\u0005e\u0011tS\u0010\rUaN/N@M\u0015S]3\u000b`fW\u0003m{m\u000fv3?1Yug6\u0007\u000eB\"[[\u001bl\u000b.l\u0007a`:7AN\u0012X\u0001\u00126\t\u0013{;@J\u05faϳ&ΞͶ1\u001cl\u001a\u001cF\r=aTh\u0006\rAhz@6G)\u000eHC9Ip\u0002eI/f7*\u0015=(1\r\u0007'kV\u001e`C)\u0003\u0005\u0002=_OUP^\fi=\u001c\u0014\u0007a0744U\u0011G{?2]¦ܔZݽ؝%m\b_R\u007f\u000f?n\u0002km\u0001G)\"M\u0016g.\u0017!rD\u0013\u000f\u001cZbdD\u0017]\u001ed\u0007,\u0016A-\r\u0004J0=\u0018^Qxi\u0019]s\tS<-Žףm\u0088ް[;dMCl{$on\u000f\u0014mY\u0013\u000ffrZY\u001c\\l(P@vwVv\u0014`\\*+2m\u0011L>:=1b%J\u0013\u001epO+\u0016\u0010^v0\u0017TaAIh<#\u0017\"h^\u0007n\u0016\u001by8\u000b\u0004:5QSE\u0019Te8gb\nS\u0011\r\u007f\u0018MwNWL\u001b$$b,$$:QQ]ZY\u000e\u0017M@&EEz\u0018\u0016[[\u001e?\u0001\r{\u001f;\u0017<\u0016\u0015\u001b|:o\u0003R_V'\"%n\t\"6qFy\nN\tm\u0004T9ZnI!\u0002ʞ<S@\u007f\u000bȶ:S\u007fȤ&$"}, d2 = {"\u000fbcBT3\"[\u0015\u0001zL/x\b/r", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0016~<\u007f\u0017$\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001f7zk", "7lP4X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FA", "Bh[2@6=S\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n$]\u0005 \u001fw\u0015.#", "Bh[2@6=S\r", "\u000fbcBT3\"[\u0015\u0001zL/x\b/rG\tJ\u0014\u0012\u001cjU", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\n\u0002x,H5\u0010b9Xz&\u0011N[(gUv;\"[H\u0011J*\r\u0012/", "\u000fbcBT3%W\"~vk\u000e\n\u0005.i\u007f1\u000b.\u0004\u0013\u0016G|", "4q^:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "Bn", "1n[<e:", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n[<e\u001aM]$\r", "", "Bh[2@6=S", "\u000fbcBT3%W\"~vk\u000e\n\u0005.i\u007f1\u000b.\u0004\u0013\u0016G|U-{\u0005\u0006Ig\u0010", "uI9\u0019](OOb\u000f\nb3Fo3s\u000f}bE|(\u0013\u0011\u007f\u001d@}n\u001c]\f/\rQY\u0015IL:x>\"\u00142cF\u0003n/Rt5\u0011:Q([R\u007f\u0013", "\u000fbcBT3+O\u0018\u0003ve\u000e\n\u0005.i\u007f1\u000b.\u0004\u0013\u0016G|", "1d]AX9", "@`S6h:", "\u000fbcBT3+O\u0018\u0003ve\u000e\n\u0005.i\u007f1\u000b.\u0004\u0013\u0016G|U\u000f\u000792We&", "uI5\u0019](OOb\u000f\nb3Fo3s\u000f}bE|(\u0013\u0011\u007f\u001d@}n\u001c]\f/\rQY\u0015IL:x>\"\u00142cF\u0003n/Rt5\u0011:Q([R\u007f\u0013", "\u000fbcBT3,e\u0019~\u0006@9x\b3e\t7iC|\u0016\u0017T", "\u000fbcBT3,e\u0019~\u0006@9x\b3e\t7iC|\u0016\u0017T7a\"Z\rCn\b", "uI;7T=:\u001d)\u000e~euc\r=tU\u000f\u0001<\u0012\u0013`W~\u0012C@\f9g\ruzT\u00127LPEo3g\u0017u]D\ng*\\@\u0015JHM,i(", "1nd;g\u001bKO\"\r\u0006Z9|\u0012>C\n/\u0006M\u000f", "", ";`Z2G9:\\'\nvk,\u0006\u0018\ro\u00072\tN", "", "<t\\!e(Ga$z\b^5\ff9l\n5\n", ";`Z2G9:\\'\nvk,\u0006\u0018\u001dt\n3\n", "", "As^=f", "D`[6W(MSv\t\u0002h9j\u00189p\u000e", "", "!gP1X9", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidShader_androidKt {
    public static final int countTransparentColors(List<Color> list) {
        return 0;
    }

    /* JADX INFO: renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m4079ActualLinearGradientShaderVjE6UOU(long j2, long j3, List<Color> list, List<Float> list2, int i2) {
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new android.graphics.LinearGradient(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2), Offset.m3937getXimpl(j3), Offset.m3938getYimpl(j3), makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors), AndroidTileMode_androidKt.m4083toAndroidTileMode0vamqd0(i2));
    }

    /* JADX INFO: renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m4080ActualRadialGradientShader8uybcMk(long j2, float f2, List<Color> list, List<Float> list2, int i2) {
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new android.graphics.RadialGradient(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2), f2, makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors), AndroidTileMode_androidKt.m4083toAndroidTileMode0vamqd0(i2));
    }

    /* JADX INFO: renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m4081ActualSweepGradientShader9KIMszo(long j2, List<Color> list, List<Float> list2) {
        validateColorStops(list, list2);
        int iCountTransparentColors = countTransparentColors(list);
        return new android.graphics.SweepGradient(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2), makeTransparentColors(list, iCountTransparentColors), makeTransparentStops(list2, list, iCountTransparentColors));
    }

    /* JADX INFO: renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m4078ActualImageShaderF49vj9s(ImageBitmap imageBitmap, int i2, int i3) {
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap), AndroidTileMode_androidKt.m4083toAndroidTileMode0vamqd0(i2), AndroidTileMode_androidKt.m4083toAndroidTileMode0vamqd0(i3));
    }

    public static final int[] makeTransparentColors(List<Color> list, int i2) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = ColorKt.m4232toArgb8_81llA(list.get(i3).m4188unboximpl());
        }
        return iArr;
    }

    public static final float[] makeTransparentStops(List<Float> list, List<Color> list2, int i2) {
        if (i2 == 0) {
            if (list != null) {
                return CollectionsKt.toFloatArray(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i2];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int lastIndex = CollectionsKt.getLastIndex(list2);
        int i3 = 1;
        for (int i4 = 1; i4 < lastIndex; i4++) {
            long jM4188unboximpl = list2.get(i4).m4188unboximpl();
            float fFloatValue = list != null ? list.get(i4).floatValue() : i4 / CollectionsKt.getLastIndex(list2);
            int i5 = i3 + 1;
            fArr[i3] = fFloatValue;
            if (Color.m4180getAlphaimpl(jM4188unboximpl) == 0.0f) {
                i3 += 2;
                fArr[i5] = fFloatValue;
            } else {
                i3 = i5;
            }
        }
        fArr[i3] = list != null ? list.get(CollectionsKt.getLastIndex(list2)).floatValue() : 1.0f;
        return fArr;
    }

    private static final void validateColorStops(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() == list2.size()) {
        } else {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
