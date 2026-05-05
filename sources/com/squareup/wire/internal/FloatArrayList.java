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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4C\u0007\":$\u007f\u0007lkA0ReP\u008cZS8\u0014sڔ<$i-yCAV\"}0\u0015WNmg\u0005Ϻx\u001ds\u000f4\u00151i>\nb\ta \u000fJB\u001e@ݯQqC;nw~\t.9:8(\nI&8P(v)L{\u0010 :Xph]UQ\u0013&*\u0006l-I,juf6vu\u000e>=2\u001bipOm_x\u0003[\u001d^TU\u001e=un7N;M\u0015SXYޚ^ÜC\u0003Gм\u000e\u0011v-?+wt.̯dÿ\u0018\u00153˽վa\u0006"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006W,?U\r{Dz\u0012B4GIz\n", "", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "\nh]6g\u0005", "uH\u0018#", "2`c.", "", "Ahi2", "Bn0?e(R", "/cS", "", "4k^.g", "", "7r=<g\fF^(\u0013", "", "3mbBe,\u001cO$zxb;\u0011", ";h]\u0010T7:Q\u001d\u000e\u000f", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class FloatArrayList {
    public static final Companion Companion = new Companion(null);
    private float[] data;
    private int size;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6Ȑ\u0007\":\u0019\u007fјnjG6L͜N\u0093Siճ?k*3db*qٴ?W }0\n\u0018bui\u0007J\t\u000es\u0013\u0014\u001a\u0011jZN\u0006|k\u0018'2pt\bG[qU9\u000fwf\t.6:8(\f1\u001e8N(v)JƠ\u0010\u001a"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006W,?U\r{Dz\u0012B4GIzr{\u001fpl5\u0010g6WL", "", "\nh]6g\u0005", "u(E", "4na\u0011X*HR\u001d\b|", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006W,?U\r{Dz\u0012B4GIz\n", ";h]\u0019X5@b\u001cb\u0004;@\f\t=", "", ";h]6`<F3 ~\u0003^5\feCt\u007f\u0016\u007fU\u0001", "", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FloatArrayList forDecoding(int i2, int i3) {
            return new FloatArrayList(i2 / i3);
        }

        public final FloatArrayList forDecoding(long j2, long j3) {
            return new FloatArrayList((int) RangesKt.coerceAtMost(j2 / j3, 2147483647L));
        }
    }

    public FloatArrayList(int i2) {
        this.data = new float[i2];
    }

    private final void ensureCapacity(int i2) {
        float[] fArr = this.data;
        if (i2 > fArr.length) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(((fArr.length * 3) / 2) + 1, i2));
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
            this.data = fArrCopyOf;
        }
    }

    public final void add(float f2) {
        ensureCapacity(this.size + 1);
        float[] fArr = this.data;
        int i2 = this.size;
        this.size = i2 + 1;
        fArr[i2] = f2;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    public final float[] toArray() {
        int i2 = this.size;
        float[] fArr = this.data;
        if (i2 < fArr.length) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, i2);
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
            this.data = fArrCopyOf;
        }
        return this.data;
    }

    public String toString() {
        float[] fArrCopyOf = Arrays.copyOf(this.data, this.size);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        String string = Arrays.toString(fArrCopyOf);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
