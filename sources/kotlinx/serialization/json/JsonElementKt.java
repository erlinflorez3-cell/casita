package kotlinx.serialization.json;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.InlineClassDescriptorKt;
import kotlinx.serialization.json.internal.JsonEncodingException;
import kotlinx.serialization.json.internal.StringOpsKt;
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
@Metadata(bv = {}, d1 = {"Яh\u001d̉=!4i\bDJf|\u0004O\u000f8\u000bDB\u0007\"2\u0016\u007f\u0007tvA0JfP.`W2\u000fq\u007f<$i)yCAY\"}0\u000fWNmkvJp\u000bK\u000f\u001c\u0016\u0001j2J]xs\u0012\u00172HpG3coE9fx>\u0005.9*8\u007f\u000b\t\u001a8G\u0018v\tES\f\u00185X\u0004H\u000f%M3 B\fL]\u0019 rf|;Ղp]Hm;\u0013w~f'\u000e[-S\u001b\u0004l)#u\u0010]qEOC#ak\u00035X\fE\u0011|\n?\u001bgUgCW\u0002\u0014NX.\u001aE1]Jut<[3^x\u001c5lgcyV>.\u00068\u0014\u000fR\u0003<\u0013mMFC() \u000ea4#WN\u0014\u001a^p\r+eD[=\u007fa8\u007f\u001a~co\u00011Ne;-\rLJ1r/\"l\u000e\u000f\"aT\u0018k?҅X=vM@ԯ\u0014Щ\u0006Ͳf\u000e2ʶ@I\u0006/\n\u0012F\u0019+9i<C4y\u0006`D\u0016{-`\u0017Y \u0017͕D&\u0007\u0018=1\u0017\u0014zYr\u000e\u0004RjWZ\u0016u\u001c\u0003\r4L˙$`\u0010>'/\u001eYo}wve_ $]s_Y\u001dqD\u001cߍb7MSi\u001eoa\u0017'MLz\u0005\u0007wjS:`\u0013lϒ6L\u0003\u0012}\u000eRa,(@S\n\u001eJ+_*\u0005\u0015v\tT\u0007˩\u0001\rw\\n%\rjS7\u0011\u0001<t7\u0019x\\\u001fu\u001e=ͅ0\u0001x$3Z_O9;c=\u00016\u0013\"5\u0017\u001c\u007fum\u0003\fƥp\u001a\u000eW\u0002<$7Yd=[+\u000f-HZ\u0002[K\u00037ϯUQ*)\u0001\u001d\b0[}<\n l\u0007+\u000f\nrO\u0003\u001dX;݈v' f\u0006\u001doj\u001bZqy#[lo\u001b\u0003\bc\u0005|٫\t#6'\u0007\u00180&U@QQ5\u0016&?W\u0015\u0010\u0005 4Ц}f'(z\u0012\u0012Y\u0004)}\u0011i]`j`I\b&tfٝp\u0007ZJp(\u0016s)G\u001be`A\u0013v~8{2eB֨\u000b0%r\\\u000fHG\u0010\u0011Bcw*\"y&\u0014\rI[UߠWk\u0006oQ\u0014\u0019\u0003/\u001f\u00195Ip(\u001bkV~W\u0011\u000ffJ֯\u001c:Y=h?JDԀ8s"}, d2 = {"8r^;H5Jc#\u000ez]\u0013\u0001\u0018/r{/Z@\u000f\u0015$Kz\u001dF\u0004", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u0016G}\fIz0Dc\u000b.\u0001[\u0016;Q?BJ4,\u0013ueD\u0016m9$", "5dc\u0017f6GC\"\u000b\u000bh;|\b\u0016i\u000f(\t<\bu\u0017Um\u001b@\u00024?f<\u001c@v =IR?u=,", "u(E", "5dc\u0017f6GC\"\u000b\u000bh;|\b\u0016i\u000f(\t<\bu\u0017Um\u001b@\u00024?f", "u(;8b;EW\"\u0012Dl,\n\r+l\u0004=wO\u0005! \u0011n\u000eJt29d\r*D{_\u001cMP?g;|\u0015v_F\u000bn;X\u0004|", "0n^9X(G", "", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?bh-;u\u001a=QT;A", "5dc\u000fb6ES\u0015\b", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007\u000bDq\u001e2\\GLk\na\n", "0n^9X(G=&g\u000be3", "5dc\u000fb6ES\u0015\bdk\u0015\r\u00106", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007\u000bDq\u001e2\\GLk\na{m]J\u0003-3J\u007f)\u0011)X6cRnFi", "1n]AX5M=&g\u000be3", "", "5dc\u0010b5MS\"\u000edk\u0015\r\u00106", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007\u000bDq\u001e2\\GLk\na{m]J\u0003-3J\u007f)\u0011:]9`[t\u0013", "2nd/_,", "", "5dc\u0011b<;Z\u0019", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007\u000bDq\u001e2\\GLk\nas", "2nd/_,(`\u0002\u000f\u0002e", "5dc\u0011b<;Z\u0019h\bG<\u0004\u0010", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007\u000bDq\u001e2\\GLk\na{m]J\u0003-3J\u007f)\u0011+X<YYr\u0013", "4k^.g", "", "5dc\u0013_6:b", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007\u000bDq\u001e2\\GLk\nau", "4k^.g\u0016K<)\u0006\u0002", "5dc\u0013_6:b\u0003\fcn3\u0004", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007\u000bDq\u001e2\\GLk\na{m]J\u0003-3J\u007f)\u0011-U6XaH", "7mc", "", "5dc\u0016a;", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007\u000bDq\u001e2\\GLk\nax", "7mc\u001ce\u0015NZ ", "5dc\u0016a;(`\u0002\u000f\u0002e", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007\u000bDq\u001e2\\GLk\na{m]J\u0003-3J\u007f)\u00110W;\\TrJi", "8r^;49KO-", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?bY-Di*\u0004", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?b]'7u\u00167\\\u0019", "5dc\u0017f6G/&\fvr", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007\u007f>m\u001e.VR\u0011/\u001b$\u001fwh=\u0010vu\\v4KHU0qN\u0002A\u001e\u001b$\u0013\\5\u0016N>O.w D,\u0004@\u001f", "8r^;A<EZ", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?bf0>tk", "5dc\u0017f6G<)\u0006\u0002", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007\u007f>m\u001e.VR\u0011/\u001b$\u001fwh=\u0010vu\\v4KHU0qN\u0002A\u001e\u001b$\u0013\\5\u0016N>O.w-G&\u000f\u0002", "8r^;B)CS\u0017\u000e", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`\u001cUy\u0017\u0006[3?bg\u001d<m\u0014=#", "5dc\u0017f6G=\u0016\u0004z\\;", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007\u007f>m\u001e.VR\u0011/\u001b$\u001fwh=\u0010vu\\v4KHU0qN\u0002A\u001e\u001b$\u0013\\5\u0016N>O.w.4$\b*XW", "8r^;C9B[\u001d\u000e~o,", "5dc\u0017f6G>&\u0003\u0003b;\u0001\u001a/", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007\u007f>m\u001e.VR\u0011/\u001b$\u001fwh=\u0010vu\\v4KHU0qN\u0002A\u001e\u001b$\u0013\\5\u0016N>O.w/D#\u00100X\u0006LhV", ":n]4", "", "5dc\u0019b5@", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007\u000bDq\u001e2\\GLk\nay", ":n]4B9'c \u0006", "5dc\u0019b5@=&g\u000be3", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `L}\u0018E@\nCc\u0007\u000bDq\u001e2\\GLk\na{m]J\u0003-3J\u007f)\u00113X5^(", "\u0018r^;C9B[\u001d\u000e~o,", "D`[BX", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q\u0004g\u001d!Vv\u0012E\nnCY\u000b$3t\u001aCIR?u=g\u001avkBPH:X\u007f\u0012TPV0kV\u0004=i", "", "", "\u0018r^;H5Jc#\u000ez]\u0013\u0001\u0018/r{/", "CmTEc,<b\u0019}_l6\u0006", "9dh", "3w_2V;>R", "3qa<e", "3kT:X5M", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u001c%Qx"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class JsonElementKt {
    private static final SerialDescriptor jsonUnquotedLiteralDescriptor = InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlinx.serialization.json.JsonUnquotedLiteral", BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));

    @ExperimentalSerializationApi
    public static final JsonNull JsonPrimitive(Void r02) {
        return JsonNull.INSTANCE;
    }

    public static final JsonPrimitive JsonPrimitive(Boolean bool) {
        return bool == null ? JsonNull.INSTANCE : new JsonLiteral(bool, false, null, 4, null);
    }

    public static final JsonPrimitive JsonPrimitive(Number number) {
        return number == null ? JsonNull.INSTANCE : new JsonLiteral(number, false, null, 4, null);
    }

    public static final JsonPrimitive JsonPrimitive(String str) {
        return str == null ? JsonNull.INSTANCE : new JsonLiteral(str, true, null, 4, null);
    }

    @ExperimentalSerializationApi
    public static final JsonPrimitive JsonUnquotedLiteral(String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        if (Intrinsics.areEqual(str, JsonNull.INSTANCE.getContent())) {
            throw new JsonEncodingException("Creating a literal unquoted value of 'null' is forbidden. If you want to create JSON null literal, use JsonNull object, otherwise, use JsonPrimitive");
        }
        return new JsonLiteral(str, false, jsonUnquotedLiteralDescriptor);
    }

    private static final Void error(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + Reflection.getOrCreateKotlinClass(jsonElement.getClass()) + " is not a " + str);
    }

    public static final boolean getBoolean(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        Boolean booleanStrictOrNull = StringOpsKt.toBooleanStrictOrNull(jsonPrimitive.getContent());
        if (booleanStrictOrNull != null) {
            return booleanStrictOrNull.booleanValue();
        }
        throw new IllegalStateException(jsonPrimitive + " does not represent a Boolean");
    }

    public static final Boolean getBooleanOrNull(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return StringOpsKt.toBooleanStrictOrNull(jsonPrimitive.getContent());
    }

    public static final String getContentOrNull(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.getContent();
    }

    public static final double getDouble(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return Double.parseDouble(jsonPrimitive.getContent());
    }

    public static final Double getDoubleOrNull(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return StringsKt.toDoubleOrNull(jsonPrimitive.getContent());
    }

    public static final float getFloat(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return Float.parseFloat(jsonPrimitive.getContent());
    }

    public static final Float getFloatOrNull(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return StringsKt.toFloatOrNull(jsonPrimitive.getContent());
    }

    public static final int getInt(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return Integer.parseInt(jsonPrimitive.getContent());
    }

    public static final Integer getIntOrNull(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return StringsKt.toIntOrNull(jsonPrimitive.getContent());
    }

    public static final JsonArray getJsonArray(JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray != null) {
            return jsonArray;
        }
        error(jsonElement, "JsonArray");
        throw new KotlinNothingValueException();
    }

    public static final JsonNull getJsonNull(JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonNull jsonNull = jsonElement instanceof JsonNull ? (JsonNull) jsonElement : null;
        if (jsonNull != null) {
            return jsonNull;
        }
        error(jsonElement, "JsonNull");
        throw new KotlinNothingValueException();
    }

    public static final JsonObject getJsonObject(JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        error(jsonElement, "JsonObject");
        throw new KotlinNothingValueException();
    }

    public static final JsonPrimitive getJsonPrimitive(JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        error(jsonElement, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    public static final SerialDescriptor getJsonUnquotedLiteralDescriptor() {
        return jsonUnquotedLiteralDescriptor;
    }

    public static /* synthetic */ void getJsonUnquotedLiteralDescriptor$annotations() {
    }

    public static final long getLong(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return Long.parseLong(jsonPrimitive.getContent());
    }

    public static final Long getLongOrNull(JsonPrimitive jsonPrimitive) {
        Intrinsics.checkNotNullParameter(jsonPrimitive, "<this>");
        return StringsKt.toLongOrNull(jsonPrimitive.getContent());
    }

    public static final Void unexpectedJson(String key, String expected) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(expected, "expected");
        throw new IllegalArgumentException("Element " + key + " is not a " + expected);
    }
}
