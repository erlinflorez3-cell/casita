package com.swmansion.rnscreens.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r'4\u0012}\u000bnjG9LeN/XS@ş\n\bd$\n#*BG\u0016-\u000e&\u0017Ofg\u0016oZ^\u0019E'\u0006D{̶0Ic|&\u001e\u001d;Zom=}sKDxtd\u0006pA08\u0012\u0005/\u001bݵL\u0016~ٙ[M\u0012\u0017>FAI`\u000fe\u0005H\u0015ĂB&\tȦtiT=VtӀ><"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011\u007f\u001d@}3~7y\u001e:mu7\\POA", "", "1`R5X\u0012>g", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011\u007f\u001d@}3~7y\u001e:m{.a\u0019", "6dP1X9!S\u001d\u0001}m", "", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9\u001eKz,C#[\u001c5p\u0016\u0014MW\u0011Lw\u000f", "5dc\u0010T*AS~~\u000f", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}WL\u0006)<gG}3k\u0019.3COA", "5dc\u0015X(=S&azb.\u007f\u0018", "u(5", "6`b\u0018X@", "", "9dh", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
final class CacheEntry {
    public static final Companion Companion = new Companion(null);
    private static final CacheEntry EMPTY = new CacheEntry(new CacheKey(Integer.MIN_VALUE, false), 0.0f);
    private final CacheKey cacheKey;
    private final float headerHeight;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^ŸG\u0014"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011\u007f\u001d@}3~7y\u001e:mu7\\PO*\u0012(\u001ds]B\u000bm5$", "", "u(E", "\u0013L?!L", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011\u007f\u001d@}3~7y\u001e:mu7\\POA", "5dc\u0012@\u0017-G", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}WL\u0006)<gG}3k\u0019.-LJxHs", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CacheEntry getEMPTY() {
            return CacheEntry.EMPTY;
        }
    }

    public CacheEntry(CacheKey cacheKey, float f2) {
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        this.cacheKey = cacheKey;
        this.headerHeight = f2;
    }

    public final CacheKey getCacheKey() {
        return this.cacheKey;
    }

    public final float getHeaderHeight() {
        return this.headerHeight;
    }

    public final boolean hasKey(CacheKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.cacheKey.getFontSize() != Integer.MIN_VALUE && Intrinsics.areEqual(this.cacheKey, key);
    }
}
