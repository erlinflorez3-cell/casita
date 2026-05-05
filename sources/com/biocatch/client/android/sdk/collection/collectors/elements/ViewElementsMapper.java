package com.biocatch.client.android.sdk.collection.collectors.elements;

import android.view.View;
import android.view.ViewGroup;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nj?0LeV4ZS0\u000fs{J$c$wDA٥0ԂR\t}M(jĔNZ\u0019CW&$y\u00038YW\t]@\u0012BD\u007f?aQ\u001e?id\u0003;\u001d `%h}\u0013\u00072*v\u0017?%QS$\u0012^G!>`\u0016e\u0005H\u001c6B.\f6\\\u0016UfXziR;3\u0005yB|*o2\rM;J\u0003)SvҖ\"8"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[K\u0012N=l\fYI$wSE\u0007\u00047T\u0002H>", "", "u(E", "5dc\u00119\u001a!O'\u0002bZ7", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[K\u0012N=l\fYI$wS\r", "DhTD", "7mXA\\(EB&z\f^9\u000b\u00056I\t'{S", "", "BqPCX9LS", "5q^Bc", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "AsP?g\u001bKO*~\bl(\u0004l8d\u007f;", "6`b5@(I", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ViewElementsMapper {
    private final int traverse(ViewGroup viewGroup, int i2, HashMap<View, ViewElement> map) {
        int iHashCode = viewGroup.getParent() == null ? 0 : viewGroup.getParent().hashCode();
        String simpleName = viewGroup.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "group.javaClass.simpleName");
        map.put(viewGroup, new ViewElement(i2, simpleName, viewGroup.hashCode(), iHashCode));
        int iTraverse = i2 + 1;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            if (viewGroup.getChildAt(i3) instanceof ViewGroup) {
                View childAt = viewGroup.getChildAt(i3);
                Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
                iTraverse = traverse((ViewGroup) childAt, iTraverse, map);
            } else {
                View childAt2 = viewGroup.getChildAt(i3);
                Intrinsics.checkNotNull(childAt2, "null cannot be cast to non-null type android.view.View");
                String simpleName2 = childAt2.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName2, "view.javaClass.simpleName");
                map.put(childAt2, new ViewElement(iTraverse, simpleName2, childAt2.hashCode(), childAt2.getParent().hashCode()));
                iTraverse++;
            }
        }
        return iTraverse;
    }

    public final HashMap<View, ViewElement> getDFSHashMap(View view, int i2) {
        Intrinsics.checkNotNullParameter(view, "view");
        HashMap<View, ViewElement> map = new HashMap<>();
        if (view instanceof ViewGroup) {
            traverse((ViewGroup) view, i2, map);
        } else {
            String simpleName = view.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "view.javaClass.simpleName");
            map.put(view, new ViewElement(i2, simpleName, view.hashCode(), view.getParent().hashCode()));
        }
        return map;
    }
}
