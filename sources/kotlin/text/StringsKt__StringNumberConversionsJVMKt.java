package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d<;\"&i\u000ePLш|\u0004W\u00068\u000b4C\u0007\"B\u0012\u007fјnjO0LeN.ZS@\u000fsڔ<$i*yCAU\"}0\u0012WȞog|MbŏK\u000f\u0014\u001a\u0001j2J]xk\u0017\u00172HqG3[vEʠhtD\r(2(8\u00127\u000fɝBJ&uABk\u000e\u0018ؓNojV\u001bM\u001d\u001a@\u0007n0\u000f ts^8Xl\f;?%\u0013i\tMUbvŪSϘJV-\u0011\u0005f66N=M\u0015SZ+\u0007\u0001\\\u0006ũE\nP\u0013n?'YP\u001cWdY0\u0018#3g\r\f{lؠ\u000bil\u001a1CQyJ~\u0015Pw)|SA\u001c\"\u00141`0C\u0019\u0015\u000f63#s\u0004D^\nvB.\u0004(;/0\u000e>C9Iryai\u001a\u0015ѡ\u0002\u001d ,.\u0019nOg|\u000e\u000f\u0016KX\u0006^IQnK\u000fݘ\u0010qI{\u0013\td\u0018)2<o\u007f]|W3/9EjQ%7j0Tlg%\u0006\u0011lavjHn05\u001bO7\u0017\u001crD\u0013\u0016\u0014RjWZ\u0012\u0014ɄZ\u001f\t\u0016%8\\&OI%>O\u0016Şo\u0003`k\u001c=/\u0015J\u0002n\u001a\u000f\b=l@MQ\u0012\u001e(״|,JJv\u001dX\u0015W{\f\t]nη8`{\u001e\u000e\u0014Fd\u000bAGgqJ5r6Ǭ`\u0015V\u001a6MO\u0015!_\t\u00028~\u00034jѸo<\u0006\u0017\u001bh^\u0007n\u0016\u0012q,+ah2ۮU5'Am-vP\u0015#5\r\u001c\u007fuh\u0013܉R\u0005)\u0004q\u0014 D(aQ]>C\u0013\r6J\u0002[S\u0013ǱkiX D\u0013|(-ch\\hNφvDsxggTE@\u001f^!$8h\u000e\u0007yF)U*ӂ\u0011sIW\u0012\u001bYjn`|3 dݚ\u0007\b5\u000bTECU=>wB0Eekv\b.(pUնz}\u0017:\u0005.o\u0011R\u00062iKy]\rK:$\u001b\u0011\tםp\u0010\u001bP*L\raIid\u001fdhQ\u0019<\u0016f5:Sߦ\\sM!\u0011\u00164\\`Rsq\u001cDbQ2)M\u0002u4\u07b6Qt\u001eX0\"\u000b*2\u0017\u0012J]PZeo!04\u0002^݅Gގf'"}, d2 = {"Aba2X5\u001fZ#z\nO(\u0004\u0019/", "\"", "Asa", "", ">`a@X", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "Aba2X5\u001fZ#z\nO(\u0004\u0019/$m7\tD\n\u0019%-~\b6d4B]\u0007\" }\u001e+MP\u0019u=/\u0015uo=\u0011l:3g\u000f-[", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "Bn16Z\u000b>Q\u001d\u0007ve", "\u001aiPCTuFO(\u0002D;0~g/c\u00040wGV", ";`c566Gb\u0019\u0012\n", "\u001aiPCTuFO(\u0002DF(\f\f\ro\t7{S\u0010l", "Bn16Z\u000b>Q\u001d\u0007ve\u0016\nq?l\u0007", "Bn16Z\u0010Gb\u0019\u0001zk", "\u001aiPCTuFO(\u0002D;0~l8t\u007f*{MV", "@`S6k", "", "Bn16Z\u0010Gb\u0019\u0001zk\u0016\nq?l\u0007", "Bn1<b3>O\"", "", "Bn1Fg,", "", "Bn3<h)ES", "", "Bn3<h)ES\u0003\fcn3\u0004", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~8\b04t\u0016\u0004", "Bn59b(M", "", "Bn59b(M=&g\u000be3", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~:\u0005*3|k", "Bn8;g", "Bn;<a.", "", "BnB5b9M", "", "BnBAe0GU", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{@0B=v\u001a:7-1)4\u000b3")
public class StringsKt__StringNumberConversionsJVMKt extends StringsKt__StringBuilderKt {
    private static final <T> T screenFloatValue$StringsKt__StringNumberConversionsJVMKt(String str, Function1<? super String, ? extends T> function1) {
        try {
            if (ScreenFloatValueRegEx.value.matches(str)) {
                return function1.invoke(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static final BigDecimal toBigDecimal(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new BigDecimal(str);
    }

    private static final BigDecimal toBigDecimal(String str, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    public static final BigDecimal toBigDecimalOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (ScreenFloatValueRegEx.value.matches(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final BigDecimal toBigDecimalOrNull(String str, MathContext mathContext) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        try {
            if (ScreenFloatValueRegEx.value.matches(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static final BigInteger toBigInteger(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new BigInteger(str);
    }

    private static final BigInteger toBigInteger(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new BigInteger(str, CharsKt.checkRadix(i2));
    }

    public static final BigInteger toBigIntegerOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.toBigIntegerOrNull(str, 10);
    }

    public static final BigInteger toBigIntegerOrNull(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt.checkRadix(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length != 1) {
            for (int i3 = str.charAt(0) == '-' ? 1 : 0; i3 < length; i3++) {
                if (CharsKt.digitOf(str.charAt(i3), i2) < 0) {
                    return null;
                }
            }
        } else if (CharsKt.digitOf(str.charAt(0), i2) < 0) {
            return null;
        }
        return new BigInteger(str, CharsKt.checkRadix(i2));
    }

    private static final boolean toBoolean(String str) {
        return Boolean.parseBoolean(str);
    }

    private static final byte toByte(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Byte.parseByte(str);
    }

    private static final byte toByte(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Byte.parseByte(str, CharsKt.checkRadix(i2));
    }

    private static final double toDouble(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Double.parseDouble(str);
    }

    public static final Double toDoubleOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (ScreenFloatValueRegEx.value.matches(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static final float toFloat(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Float.parseFloat(str);
    }

    public static final Float toFloatOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (ScreenFloatValueRegEx.value.matches(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static final int toInt(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Integer.parseInt(str);
    }

    private static final int toInt(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Integer.parseInt(str, CharsKt.checkRadix(i2));
    }

    private static final long toLong(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Long.parseLong(str);
    }

    private static final long toLong(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Long.parseLong(str, CharsKt.checkRadix(i2));
    }

    private static final short toShort(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Short.parseShort(str);
    }

    private static final short toShort(String str, int i2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Short.parseShort(str, CharsKt.checkRadix(i2));
    }

    private static final String toString(byte b2, int i2) {
        String string = Integer.toString(b2, CharsKt.checkRadix(i2));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private static final String toString(int i2, int i3) {
        String string = Integer.toString(i2, CharsKt.checkRadix(i3));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private static final String toString(long j2, int i2) {
        String string = Long.toString(j2, CharsKt.checkRadix(i2));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private static final String toString(short s2, int i2) {
        String string = Integer.toString(s2, CharsKt.checkRadix(i2));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
