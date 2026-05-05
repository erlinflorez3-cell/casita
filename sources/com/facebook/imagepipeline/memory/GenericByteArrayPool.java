package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.imagepipeline.memory.BasePool;
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
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLc\u0003\u0014I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000fq{<$i7yّCU(\u0004*\tUQog|Jb\u000bI\u0013\f+\u000f̓\\Qe|m\u0014%1pom2}ok:!\u0010F\t.4:8(\b\u0011\u001e8L(v)H[\u0010 6XphYҫQ\u0005(\u001aNL.\u00106\\\u0016NfLzmR/Q\u000f0T\u00175mA\u0015M;X\u0005+\u001b\ny\u001eY@}G]3a\u0017\u001fR\nK3C\u007fR\u001dhU3q[<eDn\u0018\u0014C7\u007f\u0011k\u0006>\\3Q'\u001eo9]zcP<4(~\n\u001dT\u0004<\u0012mZ~9(o \u000ea~IԢBг\u0006^JȕKpD\"=\u007fa7o_ƻUeS\u001bTD\n\u0013ڥ\";"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001O\u00167MP?i\u00112$h=F\u0014_@9\u00011N\"", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001J\u0012<M.Eu;s", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006S9DYY-Di*\u0019WMBA", ";d\\<e@-`\u001d\u0007\u0003Z)\u0004\t\u001ce\u0002,\nO\u000e+", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006^%=c\u000b4&z\u001a6U?8r4\u000b\u0015jeG\u0016p@$", ">n^9C(KO!\r", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001X 8T.7x0&#>", ">n^9F;:b'm\bZ*\u0003\t<", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001X 8T1JgC,\u0004u]7\rc9$", "uKR<`u?O\u0017~wh6\u0003R-o\b0\u0006IJ\u001f\u0017Oy\u001bP@\r5a\b-K\\#2UK7h;\u001e\u0002hc=\u0015r9bL\u000eEVVu]Np=\u0011\u001cd\u0014\u0018/\u0015\u0001[A/rO7&\f5IKCh\t\u0016#\"~UzL]zC\u0007\u0011}O~ODcgCH=Cb'n\u0016ef`B6&\u0014|\u001d&hW2\u0013{\u001d\u0019rZ\u0004t{\u0011\u0004\u0005B+,|WUS^b8r-\u001fXQ;\u0003", "0tR8X;,W.~\t", "", ";h]\u000fh-?S&l~s,", "", "5dc\u001a\\5\u001bc\u001a\u007fzk\u001a\u0001\u001e/", "u(8", "/k[<V", "0tR8X;>R\u0007\u0003\u0010^", "4qT2", "", "D`[BX", "5dc\u000fh*DS(~yL0\u0012\t", "@d`BX:MA\u001d\u0014z", "5dc\u000fh*DS(~yL0\u0012\t\u0010o\r\u0019wG\u0011\u0017", "5dc \\A>7\"[\u000fm,\u000b", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class GenericByteArrayPool extends BasePool<byte[]> implements ByteArrayPool {
    private final int[] bucketSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericByteArrayPool(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams poolParams, PoolStatsTracker poolStatsTracker) {
        super(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        Intrinsics.checkNotNullParameter(memoryTrimmableRegistry, "memoryTrimmableRegistry");
        Intrinsics.checkNotNullParameter(poolParams, "poolParams");
        Intrinsics.checkNotNullParameter(poolStatsTracker, "poolStatsTracker");
        SparseIntArray sparseIntArray = poolParams.bucketSizes;
        if (sparseIntArray != null) {
            this.bucketSizes = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.bucketSizes[i2] = sparseIntArray.keyAt(i2);
            }
        } else {
            this.bucketSizes = new int[0];
        }
        initialize();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: alloc */
    public byte[] alloc2(int i2) {
        return new byte[i2];
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public void free(byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int getBucketedSize(int i2) {
        if (i2 <= 0) {
            throw new BasePool.InvalidSizeException(Integer.valueOf(i2));
        }
        for (int i3 : this.bucketSizes) {
            if (i3 >= i2) {
                return i3;
            }
        }
        return i2;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    public int getBucketedSizeForValue(byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.length;
    }

    public final int getMinBufferSize() {
        int[] iArr = this.bucketSizes;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return 0;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    protected int getSizeInBytes(int i2) {
        return i2;
    }
}
