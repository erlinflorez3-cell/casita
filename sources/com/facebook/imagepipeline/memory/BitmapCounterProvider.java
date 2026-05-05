package com.facebook.imagepipeline.memory;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0007\":\u0018\u007f\u0007ljA0ZeP.XW2\u000fy{<řc$\bCC٥ Չ\"\u001fѧ~g\u0016m\u000b_\u0011CǇ\n\u0016\u0007jtOc\u0005u\u0012=9\tt\bA[|U9\u000f\u0003f\t.A:8(\u0015G\u001fzT\u001ew\u0013Cy\u000ehؖ\u0013¤>R\u0015˟U( \tV /\"\u0013k%ȬJǰa:7݊SuPS?_^~$θ\u0019ù+\r~ѭn9N=M\u0017;R1\u000e)¼KƄCqEݛ9353as\u0006:/ß Ʀ/O\u0015ƞC8j\u000ei`:+a\u0010:֢Rˎ,{\u0013}\u0013F\u0012\u0019Σ+Y"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001J\u001a=U?FI>.\u001ewaFqp6_z&GY$", "", "u(E", "\u0019A", "", "\u001b@G,5\u0010-;titM\u0016kd\u0016_m\fp ", "", "\u001bA", "0hc:T7\u001c])\b\n^9", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001J\u001a=U?FI>.\u001ewaF\\", ";`g\u000f\\;FO$\\\u0005n5\f", ";`g \\A>6\u0015\fy<(\b", "5dc\u001aT?,W.~]Z9{f+p", "u(8", "5dc", "7mXA\\(EW.~", "", "0hc:T7\u001c])\b\n^9Z\u00138f\u0004*", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006~%=c\u000b4\u0001J\u001a=U?FI>.\u001ewaFdm5Oz)\u001d", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BitmapCounterProvider {
    public static final BitmapCounterProvider INSTANCE;
    private static final long KB = 1024;
    public static final int MAX_BITMAP_TOTAL_SIZE;
    private static final long MB = 1048576;
    private static volatile BitmapCounter bitmapCounter = null;
    private static int maxBitmapCount = 0;

    static {
        BitmapCounterProvider bitmapCounterProvider = new BitmapCounterProvider();
        INSTANCE = bitmapCounterProvider;
        MAX_BITMAP_TOTAL_SIZE = bitmapCounterProvider.getMaxSizeHardCap();
        maxBitmapCount = BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
    }

    private BitmapCounterProvider() {
    }

    @JvmStatic
    public static final BitmapCounter get() {
        if (bitmapCounter == null) {
            synchronized (BitmapCounterProvider.class) {
                if (bitmapCounter == null) {
                    bitmapCounter = new BitmapCounter(maxBitmapCount, MAX_BITMAP_TOTAL_SIZE);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        BitmapCounter bitmapCounter2 = bitmapCounter;
        Intrinsics.checkNotNull(bitmapCounter2);
        return bitmapCounter2;
    }

    private final int getMaxSizeHardCap() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return ((long) iMin) > 16777216 ? (iMin / 4) * 3 : iMin / 2;
    }

    @JvmStatic
    public static final void initialize(BitmapCounterConfig bitmapCounterConfig) {
        Intrinsics.checkNotNullParameter(bitmapCounterConfig, "bitmapCounterConfig");
        if (bitmapCounter != null) {
            throw new IllegalStateException("BitmapCounter has already been created! `BitmapCounterProvider.initialize(...)` should only be called before `BitmapCounterProvider.get()` or not at all!".toString());
        }
        maxBitmapCount = bitmapCounterConfig.getMaxBitmapCount();
    }
}
