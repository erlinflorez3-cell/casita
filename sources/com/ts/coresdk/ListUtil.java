package com.ts.coresdk;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000ebLcz\u0004I\u0006>\u00146B\u0005#4\u0012\u0006)nj?5LeV\u008cX\u07bf*%ӆ,4RidxI;ڈ\u001e\u007f(\u0015][0\u0019|Nr\u000bq\u0011&\u0018~̓:L\u0006\u0005k\u0012':RqO3\u0004ڎS8\u000fsf\u0011.3:@\n\u0007\u0011\u001a`Ϻ&u)Bƚ\u0010\u00146D~?\u001bP[\r2\u00124@@\u0003$ձuQVJr\\H6S\u0015wBf5o2\rMCϿd)\u001dv\u0018\u001dA?e;E7a\u0004\u001f`kA\u0013?(ܵ\u0015j7'aH\nVd^ÿ\u0018\u00171W\u001bf;Gj\u000fi`:)KQi֟^\u0011X{\t{%<:\u05fa6+V/E\u001a\u001dڜԧ7vx]N["}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxL\u00046\u000b0\u0010\u001b\u001e\u001d", "", ">/", ">0", "", "\"", "1n\\=T9>:\u001d\r\nl", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`'Vs\u0015\u0006])ChSc,", "", "\u0013", "1n\\=T9>;\u0015\n\t", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005L\u0005$\r<J'&KvW$r0\u000b\u001dr", "1n\\=T9>=\u0016\u0004z\\;\u000b", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kqB", "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ListUtil {
    public static final ListUtil INSTANCE = new ListUtil();

    private ListUtil() {
    }

    public final <T> boolean compareLists(List<? extends T> list, List<? extends T> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null) {
            return false;
        }
        List<Pair> listZip = CollectionsKt.zip(list, list2);
        if ((listZip instanceof Collection) && listZip.isEmpty()) {
            return true;
        }
        for (Pair pair : listZip) {
            if (!Intrinsics.areEqual(pair.component1(), pair.component2())) {
                return false;
            }
        }
        return true;
    }

    public final <T, E> boolean compareMaps(Map<T, ? extends E> map, Map<T, ? extends E> map2) {
        if (map == null && map2 == null) {
            return true;
        }
        if (map == null || map2 == null) {
            return false;
        }
        return Intrinsics.areEqual(map, map2);
    }

    public final <T> boolean compareObjects(T t2, T t3) {
        if (t2 == null && t3 == null) {
            return true;
        }
        if (t2 == null || t3 == null) {
            return false;
        }
        return Intrinsics.areEqual(t2, t3);
    }
}
