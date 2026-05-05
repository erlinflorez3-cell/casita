package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005%4\u0012\u000e\u0007nj?2Le^.Zݷ0Ʀk\u0012éT[Rp\u0004@[\u001aԥ&\t]N0\u0006|Qr\u000bq\u00176\u001a\u0007sDI\u0004z\u000e\u0016\u001d<Zom5}sKDxtd\u0007f7j>\b\u0011\u0019\u001aXUV{KOY\r*0nr\u0011Ĭ_̂\t\u001a\u001aß\u000f/\u000f!tg|8ՂpcBǂ;\u0005oF\\,0<\u000bS%F\u0003)cǻ4ӿ/@?ߎտ)a"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001L\u0016/ISBz\u0015%\u0015{>M\u0016c\b[\u0004#[7X6c=nJ\u0010\u001ahc", "", "u(E", "\u0012D5\u000eH\u0013-M\u0001ZmX\tpw\u000f_[\u0015h\u001ct\u0011\u0005+dm", "", "\u0012D5\u000eH\u0013-M\u0001ZmX\u0015lp)Tb\u0015[\u001c_\u0005", "5dc\u00118\r\u001aC\u007fmtF\bo\u0003\u0018Ug\"j#mvr&]", "u(8", "\u0012D5\u000eH\u0013-M\u0001bcX\tpw\u000f_[\u0015h\u001ct\u0011\u0005+dm", "5d]2e(MSu\u000fxd,\f\u0017", "\u001a`]1e6BRb\u000f\nb3Fv:a\r6{$\n&rT|\nPL", ";h]", ";`g", "<t\\![9>O\u0018\r", "5dc", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001X 8T.7x0&#>", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DefaultFlexByteArrayPoolParams {
    public static final int DEFAULT_MAX_BYTE_ARRAY_SIZE = 4194304;
    private static final int DEFAULT_MIN_BYTE_ARRAY_SIZE = 131072;
    public static final DefaultFlexByteArrayPoolParams INSTANCE = new DefaultFlexByteArrayPoolParams();
    private static final int DEFAULT_MAX_NUM_THREADS = Runtime.getRuntime().availableProcessors();

    private DefaultFlexByteArrayPoolParams() {
    }

    @JvmStatic
    public static final SparseIntArray generateBuckets(int i2, int i3, int i4) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i2 <= i3) {
            sparseIntArray.put(i2, i4);
            i2 *= 2;
        }
        return sparseIntArray;
    }

    @JvmStatic
    public static final PoolParams get() {
        int i2 = DEFAULT_MAX_NUM_THREADS;
        return new PoolParams(4194304, i2 * 4194304, generateBuckets(131072, 4194304, i2), 131072, 4194304, i2);
    }

    public final int getDEFAULT_MAX_NUM_THREADS() {
        return DEFAULT_MAX_NUM_THREADS;
    }
}
