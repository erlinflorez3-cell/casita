package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
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
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005$4\u0012\u0006\u0007nj?1JΣHDɟ\u0004*=j<9*[ҸuCIUb\u001c0\ngN\u0016i\u001fNh\u000e[\u000f4\u0018)n:Mmx\f\u0014?6PtW3{q\u0004>)#D\u000b82P?*\t\u000f\u001dBH>x+GY\u0014*0nrjV\u001bV\u001d\u001a@\bn$\u000f\"tg|8xpk?G#1k\tSϴc:"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001U\u00166WPOI7.\u001enQH\u000bj\u0002", "", "u(E", "/cYBf;\u001bg(~Xh<\u0006\u0018", "", "=eU@X;", "1nd;g", ";d\\<e@,W.~", "1gT0^\tHc\"}\t", "", "=sW2e\u0013>\\\u001b\u000e}", "=sW2e\u0016?T'~\n", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MemoryChunkUtil {
    public static final MemoryChunkUtil INSTANCE = new MemoryChunkUtil();

    private MemoryChunkUtil() {
    }

    @JvmStatic
    public static final int adjustByteCount(int i2, int i3, int i4) {
        return Math.min(Math.max(0, i4 - i2), i3);
    }

    @JvmStatic
    public static final void checkBounds(int i2, int i3, int i4, int i5, int i6) {
        Preconditions.checkArgument(i5 >= 0, "count (%d) ! >= 0", Integer.valueOf(i5));
        Preconditions.checkArgument(i2 >= 0, "offset (%d) ! >= 0", Integer.valueOf(i2));
        Preconditions.checkArgument(i4 >= 0, "otherOffset (%d) ! >= 0", Integer.valueOf(i4));
        Preconditions.checkArgument(i2 + i5 <= i6, "offset (%d) + count (%d) ! <= %d", Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i6));
        Preconditions.checkArgument(i4 + i5 <= i3, "otherOffset (%d) + count (%d) ! <= %d", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i3));
    }
}
