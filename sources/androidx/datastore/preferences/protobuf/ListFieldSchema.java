package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
abstract class ListFieldSchema {
    private static final ListFieldSchema FULL_INSTANCE;
    private static final ListFieldSchema LITE_INSTANCE;

    abstract void makeImmutableListAt(Object obj, long j2);

    abstract <L> void mergeListsAt(Object obj, Object obj2, long j2);

    abstract <L> List<L> mutableListAt(Object obj, long j2);

    private ListFieldSchema() {
    }

    static {
        FULL_INSTANCE = new ListFieldSchemaFull();
        LITE_INSTANCE = new ListFieldSchemaLite();
    }

    static ListFieldSchema full() {
        return FULL_INSTANCE;
    }

    static ListFieldSchema lite() {
        return LITE_INSTANCE;
    }

    private static final class ListFieldSchemaFull extends ListFieldSchema {
        private static final Class<?> UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private ListFieldSchemaFull() {
            super();
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        <L> List<L> mutableListAt(Object obj, long j2) {
            return mutableListAt(obj, j2, 10);
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        void makeImmutableListAt(Object obj, long j2) {
            Object objUnmodifiableList;
            List list = (List) UnsafeUtil.getObject(obj, j2);
            if (list instanceof LazyStringList) {
                objUnmodifiableList = ((LazyStringList) list).getUnmodifiableView();
            } else {
                if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            UnsafeUtil.putObject(obj, j2, objUnmodifiableList);
        }

        private static <L> List<L> mutableListAt(Object obj, long j2, int i2) {
            Object obj2;
            List<L> arrayList;
            List<L> list = getList(obj, j2);
            if (list.isEmpty()) {
                if (list instanceof LazyStringList) {
                    arrayList = new LazyStringArrayList(i2);
                } else if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                    arrayList = ((Internal.ProtobufList) list).mutableCopyWithCapacity2(i2);
                } else {
                    arrayList = new ArrayList<>(i2);
                }
                UnsafeUtil.putObject(obj, j2, arrayList);
                return arrayList;
            }
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                ArrayList arrayList2 = new ArrayList(list.size() + i2);
                arrayList2.addAll(list);
                UnsafeUtil.putObject(obj, j2, arrayList2);
                obj2 = arrayList2;
            } else if (list instanceof UnmodifiableLazyStringList) {
                LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(list.size() + i2);
                lazyStringArrayList.addAll((UnmodifiableLazyStringList) list);
                UnsafeUtil.putObject(obj, j2, lazyStringArrayList);
                obj2 = lazyStringArrayList;
            } else {
                if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (!protobufList.isModifiable()) {
                        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(list.size() + i2);
                        UnsafeUtil.putObject(obj, j2, protobufListMutableCopyWithCapacity2);
                        return protobufListMutableCopyWithCapacity2;
                    }
                    return list;
                }
                return list;
            }
            return (List<L>) obj2;
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        <E> void mergeListsAt(Object obj, Object obj2, long j2) {
            List list = getList(obj2, j2);
            List listMutableListAt = mutableListAt(obj, j2, list.size());
            int size = listMutableListAt.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listMutableListAt.addAll(list);
            }
            if (size > 0) {
                list = listMutableListAt;
            }
            UnsafeUtil.putObject(obj, j2, list);
        }

        static <E> List<E> getList(Object obj, long j2) {
            return (List) UnsafeUtil.getObject(obj, j2);
        }
    }

    private static final class ListFieldSchemaLite extends ListFieldSchema {
        private ListFieldSchemaLite() {
            super();
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        <L> List<L> mutableListAt(Object obj, long j2) {
            Internal.ProtobufList protobufList = getProtobufList(obj, j2);
            if (protobufList.isModifiable()) {
                return protobufList;
            }
            int size = protobufList.size();
            Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            UnsafeUtil.putObject(obj, j2, protobufListMutableCopyWithCapacity2);
            return protobufListMutableCopyWithCapacity2;
        }

        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        void makeImmutableListAt(Object obj, long j2) {
            getProtobufList(obj, j2).makeImmutable();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [androidx.datastore.preferences.protobuf.Internal$ProtobufList, java.util.Collection] */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2, types: [androidx.datastore.preferences.protobuf.Internal$ProtobufList] */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v8 */
        @Override // androidx.datastore.preferences.protobuf.ListFieldSchema
        <E> void mergeListsAt(Object obj, Object obj2, long j2) {
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

        static <E> Internal.ProtobufList<E> getProtobufList(Object obj, long j2) {
            return (Internal.ProtobufList) UnsafeUtil.getObject(obj, j2);
        }
    }
}
