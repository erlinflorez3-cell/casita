package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d̉=!4i\bӵLc\u0003\u0006Iي8\u000b<N\u0007\"2\u0012\u007f\u0007|jA0JeP.hS2\u000fq{<$i*yCAU\"}0\u0014WNmivJh\nK\u000f\u001c\u0016\u0001j2Im\u0017k܈'2pno7[oU9\u000fuf\t.4:8(\b1\u001e8L(v)F\u0012È*FNuRR;S5\u001e \u0006V /\u001f\rk\\:`l\f=u݊\u001b\bPS?_^\u0003}\u0011TT?\r%bN/N9M\u0015SV3\u000b`_W\u0003mt\u0004ݛ\u0001552as\u0006<\t\u0004\"\u001dCO;f9̦t\u001b_j$'YN\u0014O^\u0019@w)\b=@\u0012\u001b\u001e'v1sԿ~&\u001c=\rr\u0002?\u0001\u0006lM\u0018z\u0010BG)\u000e@C9Ii\u0002eI'f7*\u0014S̔;\u0017|1sT<_E\u001fbyi1\u007fCmL\\\u0018q=\u001c\u00077ç\u001aH\u0012A_\u007f]~A2%%O[g$Qo\u0010J\\g%\b\u0011lamjHn%5\u0016O>\u0017\u001erD\u0013\u0014\u0014P\u0003g\\\u0017S\u001cb\u0012\u0016\bA,#wT33#fO\u0017}\u0013M\f\u001fU3tMqn\u001a\u000f\u001eުӽ7L"}, d2 = {"\u0017me._0=4 \tvm0\u0006\u000b\u001ao\u00041\u000b\u001f\u0001\u0015!Fo\r", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u0013[MDJ4\u001c\u001fgeB\tC?Lv2VPX52", "D`[BX", "", "9dh", "", "=tc=h;", "\u0017me._0=4 \tvm0\u0006\u000b\u001ao\u00041\u000b \n\u0015!Fo\r", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\u0013[MDK=\u001c\u001fgeB\tC?Lv2VPX52", "\u0017me._0=9\u0019\u0013`b5{hBc\u007f3\u000bD\u000b ", "9dh\u0011X:<`\u001d\n\nh9", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "\u0018r^;7,<]\u0018\u0003\u0004`\f\u0010\u0007/p\u000f,\u0006I", "=eU@X;", "", ";db@T.>", "7m_Bg", "", "#mZ;b>G9\u0019\u0013Zq*|\u0014>i\n1", "CmTEc,<b\u0019}[i\f\n\u00169rg(\nN|\u0019\u0017", ";h]6Y@", "Bga<j\u0010Gd\u0015\u0006~]\r\u0004\u0013+t\u00041}+\u000b\u001b VN\u000e:\u0001$5X", "", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006z.DY\u000b)3t_\nJQJx0\u001c$MoC\u0010J,av4\u001d", "@dbB_;", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class JsonExceptionsKt {
    public static final JsonDecodingException InvalidFloatingPointDecoded(Number value, String key, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return JsonDecodingException(-1, unexpectedFpErrorMessage(value, key, output));
    }

    public static final JsonEncodingException InvalidFloatingPointEncoded(Number value, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(output, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) minify$default(output, 0, 1, null)));
    }

    public static final JsonEncodingException InvalidFloatingPointEncoded(Number value, String key, String output) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(output, "output");
        return new JsonEncodingException(unexpectedFpErrorMessage(value, key, output));
    }

    public static final JsonEncodingException InvalidKeyKindException(SerialDescriptor keyDescriptor) {
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + keyDescriptor.getSerialName() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException JsonDecodingException(int i2, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i2 >= 0) {
            message = "Unexpected JSON token at offset " + i2 + ": " + message;
        }
        return new JsonDecodingException(message);
    }

    public static final JsonDecodingException JsonDecodingException(int i2, String message, CharSequence input) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(input, "input");
        return JsonDecodingException(i2, message + "\nJSON input: " + ((Object) minify(input, i2)));
    }

    public static final JsonDecodingException UnknownKeyException(String key, String input) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(input, "input");
        return JsonDecodingException(-1, "Encountered an unknown key '" + key + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) minify$default(input, 0, 1, null)));
    }

    private static final CharSequence minify(CharSequence charSequence, int i2) {
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i2 == -1) {
            int length = charSequence.length() - 60;
            return length <= 0 ? charSequence : "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i3 = i2 - 30;
        int i4 = i2 + 30;
        return (i3 <= 0 ? "" : ".....") + charSequence.subSequence(RangesKt.coerceAtLeast(i3, 0), RangesKt.coerceAtMost(i4, charSequence.length())).toString() + (i4 >= charSequence.length() ? "" : ".....");
    }

    static /* synthetic */ CharSequence minify$default(CharSequence charSequence, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            i2 = -1;
        }
        return minify(charSequence, i2);
    }

    public static final Void throwInvalidFloatingPointDecoded(AbstractJsonLexer abstractJsonLexer, Number result) {
        Intrinsics.checkNotNullParameter(abstractJsonLexer, "<this>");
        Intrinsics.checkNotNullParameter(result, "result");
        AbstractJsonLexer.fail$default(abstractJsonLexer, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, AbstractJsonLexerKt.specialFlowingValuesHint, 2, null);
        throw new KotlinNothingValueException();
    }

    private static final String unexpectedFpErrorMessage(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) minify$default(str2, 0, 1, null));
    }
}
