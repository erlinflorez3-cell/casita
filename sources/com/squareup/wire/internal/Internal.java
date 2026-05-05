package com.squareup.wire.internal;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoReader32;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.WireEnum;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Wq\u0001i'\u0011\u0012Ip(8R\"y)v\u00148\u0016/q\u0006\u001d~Wq\u00142&#(V5\u000e=1\bVXn\u0018\u0015H\u0004\\\f0Acp", "Wq\u0001i'\u0011\u0012Ip(8R\"y)v\u00148\u0016/q\u0006\u001d~Wq\u00142&#(V5\u000e=1\bVXn\u0018\u0015H\u0004\\\r."}, d2 = {}, k = 4, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class Internal {
    /* JADX INFO: renamed from: -redactElements, reason: not valid java name */
    public static final <T> List<T> m8724redactElements(List<? extends T> list, ProtoAdapter<T> protoAdapter) {
        return Internal__InternalKt.m8726redactElements(list, protoAdapter);
    }

    /* JADX INFO: renamed from: -redactElements, reason: not valid java name */
    public static final <K, V> Map<K, V> m8725redactElements(Map<K, ? extends V> map, ProtoAdapter<V> protoAdapter) {
        return Internal__InternalKt.m8727redactElements(map, protoAdapter);
    }

    public static final String boxedOneOfClassName(String str) {
        return Internal__InternalKt.boxedOneOfClassName(str);
    }

    public static final String boxedOneOfKeyFieldName(String str, String str2) {
        return Internal__InternalKt.boxedOneOfKeyFieldName(str, str2);
    }

    public static final String boxedOneOfKeysFieldName(String str) {
        return Internal__InternalKt.boxedOneOfKeysFieldName(str);
    }

    public static final void checkElementsNotNull(List<?> list) {
        Internal__InternalKt.checkElementsNotNull(list);
    }

    public static final void checkElementsNotNull(Map<?, ?> map) {
        Internal__InternalKt.checkElementsNotNull(map);
    }

    public static final boolean commonEquals(Duration duration, Object obj) {
        return Internal__InternalKt.commonEquals(duration, obj);
    }

    public static final boolean commonEquals(Instant instant, Object obj) {
        return Internal__InternalKt.commonEquals(instant, obj);
    }

    public static final int commonHashCode(Duration duration) {
        return Internal__InternalKt.commonHashCode(duration);
    }

    public static final int commonHashCode(Instant instant) {
        return Internal__InternalKt.commonHashCode(instant);
    }

    @Deprecated(message = "\u0013R\u00016\u0005yTi]N-\tU'-ba\f\f6\tmKg\nO|q\u000e\f-xm\u0019gQZlqEK0rP\u0017h_\u00031f\b\u000e3\u000e\u0002aKV&\u0004#\u007f;\nw\u001e=", replaceWith = @ReplaceWith(expression = "com.squareup.internal.Internal.copyOf(list)", imports = {}))
    @InterfaceC1492Gx
    public static final <T> List<T> copyOf(String str, List<? extends T> list) {
        return Internal__InternalKt.copyOf(str, list);
    }

    public static final <T> List<T> copyOf(List<? extends T> list) {
        return Internal__InternalKt.copyOf(list);
    }

    @Deprecated(message = "\u0013R\u00016\u0005yTi]N-\tU'-ba\f\f6\tmKg\nO|q\u000e\f-xm\u0019gQZlqEK0rP\u0017h_\u00031f\b\u000e3\u000e\u0002aKV&\u0004#\u007f;\nw\u001e=", replaceWith = @ReplaceWith(expression = "com.squareup.internal.Internal.copyOf(map)", imports = {}))
    @InterfaceC1492Gx
    public static final <K, V> Map<K, V> copyOf(String str, Map<K, ? extends V> map) {
        return Internal__InternalKt.copyOf(str, map);
    }

    public static final <K, V> Map<K, V> copyOf(Map<K, ? extends V> map) {
        return Internal__InternalKt.copyOf(map);
    }

    public static final int countNonNull(Object obj, Object obj2) {
        return Internal__InternalKt.countNonNull(obj, obj2);
    }

    public static final int countNonNull(Object obj, Object obj2, Object obj3) {
        return Internal__InternalKt.countNonNull(obj, obj2, obj3);
    }

    public static final int countNonNull(Object obj, Object obj2, Object obj3, Object obj4, Object... objArr) {
        return Internal__InternalKt.countNonNull(obj, obj2, obj3, obj4, objArr);
    }

    public static final double decodePrimitive_double(ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_double(protoReader32);
    }

    public static final double decodePrimitive_double(ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_double(protoReader);
    }

    public static final int decodePrimitive_fixed32(ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_fixed32(protoReader32);
    }

    public static final int decodePrimitive_fixed32(ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_fixed32(protoReader);
    }

    public static final long decodePrimitive_fixed64(ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_fixed64(protoReader32);
    }

    public static final long decodePrimitive_fixed64(ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_fixed64(protoReader);
    }

    public static final float decodePrimitive_float(ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_float(protoReader32);
    }

    public static final float decodePrimitive_float(ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_float(protoReader);
    }

    public static final int decodePrimitive_int32(ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_int32(protoReader32);
    }

    public static final int decodePrimitive_int32(ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_int32(protoReader);
    }

    public static final long decodePrimitive_int64(ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_int64(protoReader32);
    }

    public static final long decodePrimitive_int64(ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_int64(protoReader);
    }

    public static final int decodePrimitive_sfixed32(ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_sfixed32(protoReader32);
    }

    public static final int decodePrimitive_sfixed32(ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_sfixed32(protoReader);
    }

    public static final long decodePrimitive_sfixed64(ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_sfixed64(protoReader32);
    }

    public static final long decodePrimitive_sfixed64(ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_sfixed64(protoReader);
    }

    public static final int decodePrimitive_sint32(ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_sint32(protoReader32);
    }

    public static final int decodePrimitive_sint32(ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_sint32(protoReader);
    }

    public static final long decodePrimitive_sint64(ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_sint64(protoReader32);
    }

    public static final long decodePrimitive_sint64(ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_sint64(protoReader);
    }

    public static final int decodePrimitive_uint32(ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_uint32(protoReader32);
    }

    public static final int decodePrimitive_uint32(ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_uint32(protoReader);
    }

    public static final long decodePrimitive_uint64(ProtoReader32 protoReader32) {
        return Internal__InternalKt.decodePrimitive_uint64(protoReader32);
    }

    public static final long decodePrimitive_uint64(ProtoReader protoReader) {
        return Internal__InternalKt.decodePrimitive_uint64(protoReader);
    }

    public static final void encodeArray_double(double[] dArr, ReverseProtoWriter reverseProtoWriter, int i2) throws IOException {
        Internal__InternalKt.encodeArray_double(dArr, reverseProtoWriter, i2);
    }

    public static final void encodeArray_fixed32(int[] iArr, ReverseProtoWriter reverseProtoWriter, int i2) {
        Internal__InternalKt.encodeArray_fixed32(iArr, reverseProtoWriter, i2);
    }

    public static final void encodeArray_fixed64(long[] jArr, ReverseProtoWriter reverseProtoWriter, int i2) {
        Internal__InternalKt.encodeArray_fixed64(jArr, reverseProtoWriter, i2);
    }

    public static final void encodeArray_float(float[] fArr, ReverseProtoWriter reverseProtoWriter, int i2) throws IOException {
        Internal__InternalKt.encodeArray_float(fArr, reverseProtoWriter, i2);
    }

    public static final void encodeArray_int32(int[] iArr, ReverseProtoWriter reverseProtoWriter, int i2) throws IOException {
        Internal__InternalKt.encodeArray_int32(iArr, reverseProtoWriter, i2);
    }

    public static final void encodeArray_int64(long[] jArr, ReverseProtoWriter reverseProtoWriter, int i2) {
        Internal__InternalKt.encodeArray_int64(jArr, reverseProtoWriter, i2);
    }

    public static final void encodeArray_sfixed32(int[] iArr, ReverseProtoWriter reverseProtoWriter, int i2) {
        Internal__InternalKt.encodeArray_sfixed32(iArr, reverseProtoWriter, i2);
    }

    public static final void encodeArray_sfixed64(long[] jArr, ReverseProtoWriter reverseProtoWriter, int i2) {
        Internal__InternalKt.encodeArray_sfixed64(jArr, reverseProtoWriter, i2);
    }

    public static final void encodeArray_sint32(int[] iArr, ReverseProtoWriter reverseProtoWriter, int i2) {
        Internal__InternalKt.encodeArray_sint32(iArr, reverseProtoWriter, i2);
    }

    public static final void encodeArray_sint64(long[] jArr, ReverseProtoWriter reverseProtoWriter, int i2) throws IOException {
        Internal__InternalKt.encodeArray_sint64(jArr, reverseProtoWriter, i2);
    }

    public static final void encodeArray_uint32(int[] iArr, ReverseProtoWriter reverseProtoWriter, int i2) {
        Internal__InternalKt.encodeArray_uint32(iArr, reverseProtoWriter, i2);
    }

    public static final void encodeArray_uint64(long[] jArr, ReverseProtoWriter reverseProtoWriter, int i2) {
        Internal__InternalKt.encodeArray_uint64(jArr, reverseProtoWriter, i2);
    }

    public static final boolean equals(Object obj, Object obj2) {
        return Internal__InternalKt.equals(obj, obj2);
    }

    public static final <E extends WireEnum> E getIdentityOrNull(Class<E> cls) {
        return (E) Internal__InternalJvmKt.getIdentityOrNull(cls);
    }

    public static final <T> List<T> immutableCopyOf(String str, List<? extends T> list) {
        return Internal__InternalKt.immutableCopyOf(str, list);
    }

    public static final <K, V> Map<K, V> immutableCopyOf(String str, Map<K, ? extends V> map) {
        return Internal__InternalKt.immutableCopyOf(str, map);
    }

    public static final <K, V> Map<K, V> immutableCopyOfMapWithStructValues(String str, Map<K, ? extends V> map) {
        return Internal__InternalKt.immutableCopyOfMapWithStructValues(str, map);
    }

    public static final <T> T immutableCopyOfStruct(String str, T t2) {
        return (T) Internal__InternalKt.immutableCopyOfStruct(str, t2);
    }

    public static final IllegalStateException missingRequiredFields(Object... objArr) {
        return Internal__InternalKt.missingRequiredFields(objArr);
    }

    public static final <T> List<T> newMutableList() {
        return Internal__InternalKt.newMutableList();
    }

    public static final <K, V> Map<K, V> newMutableMap() {
        return Internal__InternalKt.newMutableMap();
    }

    public static final <T> void redactElements(List<T> list, ProtoAdapter<T> protoAdapter) {
        Internal__InternalJvmKt.redactElements(list, protoAdapter);
    }

    public static final <T> void redactElements(Map<?, T> map, ProtoAdapter<T> protoAdapter) {
        Internal__InternalJvmKt.redactElements(map, protoAdapter);
    }

    public static final String sanitize(String str) {
        return Internal__InternalKt.sanitize(str);
    }

    public static final String sanitize(List<String> list) {
        return Internal__InternalKt.sanitize(list);
    }
}
