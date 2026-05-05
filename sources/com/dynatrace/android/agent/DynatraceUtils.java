package com.dynatrace.android.agent;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.HashMap;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS8\u001bs{J$cҕyCQU\"Ԃ(ߜOdʴ\u0018nxYKH\u0015\u0006Ȁ|j:I\u001e\u001dk\u0013'FRsO5cnk8\u000fv\u001f\r062:\u0010\u0004/\u0019\tK@|\tGc\u000e(/nu\u0001RU{\u0013 *&N\"\u0011\u001e\u000bo^:Xns9]\"1p+\\7a@|{\u0015VX7\u000f\r`L*\u001f@e\u001b3]\u001b\thZm\u000eӳuI"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@\u0004Iby/Di\u0014.=R?rBs", "", "u(E", "Bn0?e(R:\u001d\r\n", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "/qa.l", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "Bn7.f/&O$", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", ";`_", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "2x].g9:Q\u0019x\b^(z\u0018vn{7\u007fQ\u0001^\"N\u007f\u0010@\u007f\u001fBY\u0005 3{\u0016"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DynatraceUtils {
    public static final DynatraceUtils INSTANCE = new DynatraceUtils();

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DynatraceUtils() {
    }

    private final ArrayList<Object> toArrayList(ReadableArray readableArray) {
        Intrinsics.checkNotNull(readableArray);
        ArrayList<Object> arrayList = new ArrayList<>(readableArray.size());
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            switch (WhenMappings.$EnumSwitchMapping$0[readableArray.getType(i2).ordinal()]) {
                case 1:
                    arrayList.add(null);
                    break;
                case 2:
                    arrayList.add(Boolean.valueOf(readableArray.getBoolean(i2)));
                    break;
                case 3:
                    double d2 = readableArray.getDouble(i2);
                    if (!Double.isFinite(d2)) {
                        arrayList.add(Double.valueOf(readableArray.getDouble(i2)));
                    } else if (d2 >= -2.147483648E9d && d2 <= 2.147483647E9d && d2 == ((int) d2)) {
                        arrayList.add(Integer.valueOf((int) readableArray.getDouble(i2)));
                    } else if (d2 >= -9.223372036854776E18d && d2 <= 9.223372036854776E18d && d2 == ((long) d2)) {
                        arrayList.add(Long.valueOf((long) readableArray.getDouble(i2)));
                    }
                    break;
                case 4:
                    arrayList.add(readableArray.getString(i2));
                    break;
                case 5:
                    arrayList.add(toHashMap(readableArray.getMap(i2)));
                    break;
                case 6:
                    arrayList.add(toArrayList(readableArray.getArray(i2)));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object at index: " + i2 + ".");
            }
        }
        return arrayList;
    }

    public final HashMap<String, Object> toHashMap(ReadableMap readableMap) {
        HashMap<String, Object> map = new HashMap<>();
        Intrinsics.checkNotNull(readableMap);
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (WhenMappings.$EnumSwitchMapping$0[readableMap.getType(strNextKey).ordinal()]) {
                case 1:
                    map.put(strNextKey, null);
                    break;
                case 2:
                    map.put(strNextKey, Boolean.valueOf(readableMap.getBoolean(strNextKey)));
                    break;
                case 3:
                    double d2 = readableMap.getDouble(strNextKey);
                    if (!Double.isFinite(d2)) {
                        map.put(strNextKey, Double.valueOf(readableMap.getDouble(strNextKey)));
                    } else if (d2 >= -2.147483648E9d && d2 <= 2.147483647E9d && d2 == ((int) d2)) {
                        map.put(strNextKey, Integer.valueOf((int) readableMap.getDouble(strNextKey)));
                    } else if (d2 >= -9.223372036854776E18d && d2 <= 9.223372036854776E18d && d2 == ((long) d2)) {
                        map.put(strNextKey, Long.valueOf((long) readableMap.getDouble(strNextKey)));
                    }
                    break;
                case 4:
                    map.put(strNextKey, readableMap.getString(strNextKey));
                    break;
                case 5:
                    map.put(strNextKey, toHashMap(readableMap.getMap(strNextKey)));
                    break;
                case 6:
                    map.put(strNextKey, toArrayList(readableMap.getArray(strNextKey)));
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object with key: " + strNextKey + ".");
            }
        }
        return map;
    }
}
