package androidx.compose.ui.unit.fontscaling;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: FontScaleConverterTable.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004O\u00188\u000b4K\u0007\":\u0017\u007f\u0007llA0RnP\u008cZS8şsڔ<$i*yّCU(\n*\tUNml\u0005Ϻx$s\u000f4\u00151iE\nj~b\"\u0013@B\b?aN\u007fAGb\r63!ݨ&8\b\bI(8T(v)P{\u0010 >Xph_SaM( \u0015V /+\rk\\F`l\fGu7KzP_?_^\u000f}\u0013Tg?\u000f\r`L?\u0007ˑ5]+a\u0018\u001fR\nUIS:C\u0013\u007f?'Ya:k\u0007r\u000e\u0018-+}\u000e\u0014v|ؠ\u0007Ōd\u0018/˃_eQU\u001c.\u0010|\u0002\u0014J\f^ 5QF-Hg>\u0012\nχtՂD\\\nމR\u0002\u0001kD\u001d=\u000296G#ǁU{"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9\u000fF\u007f4CWy';v\u0018w.MDz\"\u001c\u0011oa\u0017\u0011l=N\u00046GY=(YYr\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9\u000fF\u007f4CWy';v\u0018w.MDz\"\u001c\u0011oa\u0017\u0011l=N\u00046GY$", "4q^:F7", "", "Bn3=", "uZ5(9o/", ";Ea<`\u001aID\u0015\u0006\u000b^:", "5dc\u001a99H[\u0007\nkZ3\r\t=${1\u0005J\u0010\u0013&Ky\u0017J", "u(E", "5dc\u001a99H[\u0007\nkZ3\r\t=", "u(J\u0013", ";S^\u0011c\u001d:Z)~\t", "5dc\u001aG6\u001d^\nz\u0002n,\u000bG+n\t2\u000b<\u0010\u001b!P}", "5dc\u001aG6\u001d^\nz\u0002n,\u000b", "1n]CX9M2$m\u0005L7", "", "2o", "1n]CX9MA$m\u0005=7", "Ao", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FontScaleConverterTable implements FontScaleConverter {
    private final float[] mFromSpValues;
    private final float[] mToDpValues;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ void getMFromSpValues$annotations() {
    }

    public static /* synthetic */ void getMToDpValues$annotations() {
    }

    public FontScaleConverterTable(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero".toString());
        }
        this.mFromSpValues = fArr;
        this.mToDpValues = fArr2;
    }

    public final float[] getMFromSpValues() {
        return this.mFromSpValues;
    }

    public final float[] getMToDpValues() {
        return this.mToDpValues;
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertDpToSp(float f2) {
        return Companion.lookupAndInterpolate(f2, this.mToDpValues, this.mFromSpValues);
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertSpToDp(float f2) {
        return Companion.lookupAndInterpolate(f2, this.mFromSpValues, this.mToDpValues);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FontScaleConverterTable)) {
            return false;
        }
        FontScaleConverterTable fontScaleConverterTable = (FontScaleConverterTable) obj;
        return Arrays.equals(this.mFromSpValues, fontScaleConverterTable.mFromSpValues) && Arrays.equals(this.mToDpValues, fontScaleConverterTable.mToDpValues);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.mFromSpValues) * 31) + Arrays.hashCode(this.mToDpValues);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.mFromSpValues);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        StringBuilder sbAppend = sb.append(string).append(", toDpValues=");
        String string2 = Arrays.toString(this.mToDpValues);
        Intrinsics.checkNotNullExpressionValue(string2, "toString(this)");
        return sbAppend.append(string2).append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    /* JADX INFO: compiled from: FontScaleConverterTable.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00106B\u0005\"4\u0012\u0006\u0019nj?0JͣIDɟ\u0004*=j<9*[ҸuCIUb\u001c0\ngN\u0016i\u001fNh\u000e[\u000f4\u0018)n:Mmx\f\u0017?6PuW3{t\u00049Ƅx="}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9\u000fF\u007f4CWy';v\u0018w.MDz\"\u001c\u0011oa\u0017\u0011l=N\u00046GY=(YYr{q\u001cb\u0019J4\u0011\u000fb\u0017", "", "u(E", ":n^8h7\u001a\\\u0018b\u0004m,\n\u00149l{7{", "", "And?V,/O \u000fz", "And?V,/O \u000fzl", "", "B`a4X;/O \u000fzl", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float lookupAndInterpolate(float f2, float[] fArr, float[] fArr2) {
            float f3;
            float f4;
            float f5;
            float fConstrainedMap;
            float fAbs = Math.abs(f2);
            float fSignum = Math.signum(f2);
            int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
            if (iBinarySearch >= 0) {
                fConstrainedMap = fArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                int i3 = i2 - 1;
                float f6 = 0.0f;
                if (i3 >= fArr.length - 1) {
                    float f7 = fArr[fArr.length - 1];
                    float f8 = fArr2[fArr.length - 1];
                    if (f7 == 0.0f) {
                        return 0.0f;
                    }
                    return f2 * (f8 / f7);
                }
                if (i3 == -1) {
                    f3 = fArr[0];
                    f5 = fArr2[0];
                    f4 = 0.0f;
                } else {
                    f6 = fArr[i3];
                    f3 = fArr[i2];
                    f4 = fArr2[i3];
                    f5 = fArr2[i2];
                }
                fConstrainedMap = MathUtils.INSTANCE.constrainedMap(f4, f5, f6, f3, fAbs);
            }
            return fSignum * fConstrainedMap;
        }
    }
}
