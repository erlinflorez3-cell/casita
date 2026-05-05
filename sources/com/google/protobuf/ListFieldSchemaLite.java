package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class ListFieldSchemaLite implements ListFieldSchema {
    ListFieldSchemaLite() {
    }

    static <E> Internal.ProtobufList<E> getProtobufList(Object message, long offset) {
        return (Internal.ProtobufList) UnsafeUtil.getObject(message, offset);
    }

    @Override // com.google.protobuf.ListFieldSchema
    public void makeImmutableListAt(Object message, long offset) {
        getProtobufList(message, offset).makeImmutable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.protobuf.Internal$ProtobufList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.protobuf.Internal$ProtobufList] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // com.google.protobuf.ListFieldSchema
    public <E> void mergeListsAt(Object obj, Object obj2, long j2) {
        Internal.ProtobufList protobufList = getProtobufList(obj, j2);
        ?? protobufList2 = getProtobufList(obj2, j2);
        int size = protobufList.size();
        int size2 = protobufList2.size();
        ?? r4 = protobufList;
        r4 = protobufList;
        if (size > 0 && size2 > 0) {
            boolean zIsModifiable = protobufList.isModifiable();
            ?? MutableCopyWithCapacity2 = protobufList;
            if (!zIsModifiable) {
                MutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size2 + size);
            }
            MutableCopyWithCapacity2.addAll(protobufList2);
            r4 = MutableCopyWithCapacity2;
        }
        if (size > 0) {
            protobufList2 = r4;
        }
        UnsafeUtil.putObject(obj, j2, (Object) protobufList2);
    }

    @Override // com.google.protobuf.ListFieldSchema
    public <L> List<L> mutableListAt(Object message, long offset) {
        Internal.ProtobufList protobufList = getProtobufList(message, offset);
        if (protobufList.isModifiable()) {
            return protobufList;
        }
        int size = protobufList.size();
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
        UnsafeUtil.putObject(message, offset, protobufListMutableCopyWithCapacity2);
        return protobufListMutableCopyWithCapacity2;
    }
}
