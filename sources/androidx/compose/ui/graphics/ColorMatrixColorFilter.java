package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: ColorFilter.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007|jA0JjP.`\\2şs{BřcҕyCI[\"}(\u000bWNusvϺ`\u0010YƤ6\u0016'ilV[\rm\u0016\u001d2Zom4ޜs=Gb5Q\u000bړB(Fy\u001d\u00030)v\u0011\u0007\u0003QN$\u0016^DY:1\u0012̂\t\u001a \f\u00078\u000f&tg|7xrc:=,\u001bipOф^ܞƊQ\u000fL^5\u0018?r,7X7c\"UY\u0011\u0015j]U\u0002m\u0001\u0004ݲho-9Y\fWdiF(]>]\u001furT]KQՙ\u000b&̼NҪׂT\u0010.\u000b\t\u0010UB\u0012#\u001e'vDs.7\u001e\u001c3\rti?~\u00035ې\fҦ`ا҆$~Ĵ/;#f_hݥ\u0019W?~\u000bڞ:Q\u007fv!as\u05fed,"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DU\u0012=ZGNI>%\u001fuB=\u000er,[L", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "1n[<e\u0014:b&\u0003\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DU\u0012=ZGNA", "uZ5\u0019^6MZ\u001d\bDc=\u0005R3n\u000f(\tI|\u001e`&o\u000f8\u0007,D7\b)E|#>KREx\u001c\u001a\"naF\\'\u001d", "<`c6i,\u001c] \t\b?0\u0004\u0018/r", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006\u0006G\u000b$wKv\u001d<\u0004z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001eU\r$Hms8TMHL8%$hn\u000f", "uZ5\u0019T5=`#\u0003y(.\n\u0005:h\u0004&\n\n^!\u001eQ|n@}45fS\u0007=w%5QL\u0005pE&^ljH\u0007p5J}p&LO(lY\u0002\u001b\u001e\u001bh\u001d[;\u000b\u0014cN\fjQ=\u001f\u0015\u0002\rr", ")E", "1n_F66E]&fvm9\u0001\u001c", "B`a4X;\u001c] \t\bF(\f\u00163x", "1n_F66E]&fvm9\u0001\u001cvg\\+G\u0010\fz", "uZ5uN\r", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "=ac.\\5\u001c] \t\bF(\f\u00163x", "=ac.\\5\u001c] \t\bF(\f\u00163xG3G\u000bH'}Q", "u(J\u0013", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ColorMatrixColorFilter extends ColorFilter {
    private float[] colorMatrix;

    public /* synthetic */ ColorMatrixColorFilter(float[] fArr, android.graphics.ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr, colorFilter);
    }

    public /* synthetic */ ColorMatrixColorFilter(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    private ColorMatrixColorFilter(float[] fArr, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.colorMatrix = fArr;
    }

    private ColorMatrixColorFilter(float[] fArr) {
        this(fArr, AndroidColorFilter_androidKt.m4042actualColorMatrixColorFilterjHGOpc(fArr), null);
    }

    /* JADX INFO: renamed from: copyColorMatrix-gBh15pI$default */
    public static /* synthetic */ float[] m4255copyColorMatrixgBh15pI$default(ColorMatrixColorFilter colorMatrixColorFilter, float[] fArr, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            fArr = ColorMatrix.m4235constructorimpl$default(null, 1, null);
        }
        return colorMatrixColorFilter.m4257copyColorMatrixgBh15pI(fArr);
    }

    /* JADX INFO: renamed from: copyColorMatrix-gBh15pI */
    public final float[] m4257copyColorMatrixgBh15pI(float[] fArr) {
        ArraysKt.copyInto$default(m4256obtainColorMatrixp10uLo(), fArr, 0, 0, 0, 14, (Object) null);
        return fArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorMatrixColorFilter) && Arrays.equals(m4256obtainColorMatrixp10uLo(), ((ColorMatrixColorFilter) obj).m4256obtainColorMatrixp10uLo());
    }

    /* JADX INFO: renamed from: obtainColorMatrix-p10-uLo */
    private final float[] m4256obtainColorMatrixp10uLo() {
        float[] fArr = this.colorMatrix;
        if (fArr != null) {
            return fArr;
        }
        float[] fArrActualColorMatrixFromFilter = AndroidColorFilter_androidKt.actualColorMatrixFromFilter(getNativeColorFilter$ui_graphics_release());
        this.colorMatrix = fArrActualColorMatrixFromFilter;
        return fArrActualColorMatrixFromFilter;
    }

    public int hashCode() {
        float[] fArr = this.colorMatrix;
        if (fArr != null) {
            return ColorMatrix.m4242hashCodeimpl(fArr);
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.colorMatrix;
        return sb.append((Object) (fArr == null ? "null" : ColorMatrix.m4253toStringimpl(fArr))).append(')').toString();
    }
}
