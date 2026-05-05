package com.squareup.wire.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":%\u007f\u0007lkA0ReP.XS2\u000fy\u0005<$a%yCIa\"}(\teȞ\u0006x\u001fJ\t\n{\u000e\u0017V\u0006z0WU\u0011]@\u0010̓FqE5[r\u0006=n{N\u0005N7jD\b\r\u0019\u001aXQ@z\tMc\f@1\ttH]%M3&Z\u0014L-\u0019\u001e\u000bp~:Vzu:]$Ii\u000bT5nH|{\u001d\rhw\u0019\u0005e6+n<\fՙ1٨\u0007\u0007Z¹\u0010\u000fMwU\u0005\u0017(}ǥUָ[6`ÜЕ\u0019="}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006Z.D5\u000b-3\u0002|2[R\u0011", "", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "\nh]6g\u0005", "uH\u0018#", "2`c.", "", "Ahi2", "Bn0?e(R", "/cS", "", "7mc", "7r=<g\fF^(\u0013", "", "3mbBe,\u001cO$zxb;\u0011", ";h]\u0010T7:Q\u001d\u000e\u000f", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class IntArrayList {
    public static final Companion Companion = new Companion(null);
    private int[] data;
    private int size;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6Ȑ\u0007\":\u0019\u007fјnjG6L͜N\u0093Siճ?k*3db*qٴ?W }0\n\u0018bui\u0007J\t\u000es\u0013\u0014\u001a\u0011jZN\u0006|k\u0018'2pt\bG[qU9\u000fwf\t.6:8(\f1\u001e8N(v)JƠ\u0010\u001a"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006Z.D5\u000b-3\u0002|2[RyI>& dj=\u0011l\u0002", "", "\nh]6g\u0005", "u(E", "4na\u0011X*HR\u001d\b|", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006Z.D5\u000b-3\u0002|2[R\u0011", ";h]\u0019X5@b\u001cb\u0004;@\f\t=", "", ";h]6`<F3 ~\u0003^5\feCt\u007f\u0016\u007fU\u0001", "", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IntArrayList forDecoding(int i2, int i3) {
            return new IntArrayList(i2 / i3);
        }

        public final IntArrayList forDecoding(long j2, long j3) {
            return new IntArrayList((int) RangesKt.coerceAtMost(j2 / j3, 2147483647L));
        }
    }

    public IntArrayList(int i2) {
        this.data = new int[i2];
    }

    private final void ensureCapacity(int i2) {
        int[] iArr = this.data;
        if (i2 > iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(((iArr.length * 3) / 2) + 1, i2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.data = iArrCopyOf;
        }
    }

    public final void add(int i2) {
        ensureCapacity(this.size + 1);
        int[] iArr = this.data;
        int i3 = this.size;
        this.size = i3 + 1;
        iArr[i3] = i2;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    public final int[] toArray() {
        int i2 = this.size;
        int[] iArr = this.data;
        if (i2 < iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.data = iArrCopyOf;
        }
        return this.data;
    }

    public String toString() {
        int[] iArrCopyOf = Arrays.copyOf(this.data, this.size);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        String string = Arrays.toString(iArrCopyOf);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
