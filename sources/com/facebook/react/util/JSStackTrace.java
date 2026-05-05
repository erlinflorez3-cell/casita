package com.facebook.react.util;

import com.dynatrace.android.agent.Global;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007f\u0007loA0ZeP.XS2\u000f\u0002{<řaӜqYП\u0006\u001a,!ITTg̊rJh\u000b\f%\u0014\u001f\u0011jZK\u0006|k\u001c'2pqo7[zU9\u000f\u0001|\nh@0E\u0012\u0005/\u001cZL\u001e\u0005\u0013Cy\u001bX0\u0011|HS%M3\u001chæ\u0011ŋ\u0005\u001edɡ\u001fJVouBM(+kXMUc^\u0001$θHù+\r~ѭn7N=M\u0015SUYޞ%ÜC\u0003Gм\u000e\u0011v.?+wu.̳+ÿ\u0018\u00153˽]i\u0001.t\u0005\u007fbbʳ}յgKXʫ߳{\u000b"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0010\u001b\u001e\u0011T{*\u0006!3_l-3k\u0016\u0004", "", "u(E", "\u0011N;\"@\u001589xr", "", "\u0014H;\u0012R\u0010\u001dM\u0004ZiM\fiq", "\u001aiPCTuNb\u001d\u0006Dk,~\tB/j$\u000bO\u0001$ \u001d", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "\u0014H;\u0012R\u0012\u001eG", "\u001aH=\u0012R\u0015.;u^gX\u0012\\|", "\u001bDC\u0015B\u000b8<tfZX\u0012\\|", "4na:T;", ";db@T.>", "AsP0^", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", ">`a@X\rBZ\u0019by", "4qP:X", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class JSStackTrace {
    public static final String COLUMN_KEY = "column";
    public static final String FILE_KEY = "file";
    public static final String LINE_NUMBER_KEY = "lineNumber";
    public static final String METHOD_NAME_KEY = "methodName";
    public static final JSStackTrace INSTANCE = new JSStackTrace();
    private static final Pattern FILE_ID_PATTERN = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    private JSStackTrace() {
    }

    @JvmStatic
    public static final String format(String message, ReadableArray stack) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(stack, "stack");
        StringBuilder sbAppend = new StringBuilder(message).append(", stack:\n");
        int size = stack.size();
        for (int i2 = 0; i2 < size; i2++) {
            ReadableMap map = stack.getMap(i2);
            sbAppend.append(map.getString("methodName")).append("@").append(INSTANCE.parseFileId(map));
            if (map.hasKey("lineNumber") && !map.isNull("lineNumber") && map.getType("lineNumber") == ReadableType.Number) {
                sbAppend.append(map.getInt("lineNumber"));
            } else {
                sbAppend.append(-1);
            }
            if (map.hasKey("column") && !map.isNull("column") && map.getType("column") == ReadableType.Number) {
                sbAppend.append(Global.COLON).append(map.getInt("column"));
            }
            sbAppend.append("\n");
        }
        String string = sbAppend.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final String parseFileId(ReadableMap readableMap) {
        String string;
        if (!readableMap.hasKey("file") || readableMap.isNull("file") || readableMap.getType("file") != ReadableType.String || (string = readableMap.getString("file")) == null) {
            return "";
        }
        Matcher matcher = FILE_ID_PATTERN.matcher(string);
        return matcher.find() ? matcher.group(1) + Global.COLON : "";
    }
}
