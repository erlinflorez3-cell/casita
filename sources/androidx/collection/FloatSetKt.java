package androidx.collection;

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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: FloatSet.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d̉=!,{\bDJd|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG5LeN0ZS8\u0015s{:%s(\u007fGSUH\u0003:\r]T\u007fg\u001dOr\u0017Q\u0015\u001e\u0016'o\\Mc\u007fu\u0012=:Z\u0004M9eok>\u0011xD\f82P@*\t\u000f#BH>~\u0013_Y\u0012*0nujV\u001bT\u001d\u001a@\u000en$\u000f'tg|>xpkDG#1qZ^5eH|{\u0012v\\5\u0018\u000faL*`7c\u001d=b\u0011\u0013j[m\u0010ouK\u0013\u0001'U3\u0010֖]N\\\u000e#-+}\u0010u~4k\u001dQ\u000f\u000fW/]jcP<0\u0010\u000f\n\u001cT\u0004<\tWL<42f6\u0016cx\u0001\\XP0fZ\u001c\tpN\u0017S\u0003c/G\"~Q\u0010CIRE\u0005\u001d\rL+1r/el\u000e\u000f\u001d3d\u0006`IQn@xV\u0018dUm2o\u0003\u0002X\fPY\u000e\u07fc\u0014\u0011\\\u0016{ڜ]ޠ''sȵ`Fmv\u0013a\t_wT`@Pqlն,Á\u0010ZLߟʶo`"}, d2 = {"\u0013l_Al\rE]\u0015\u000eVk9x\u001d", "", "5dc\u0012`7Mgy\u0006\u0005Z;X\u0016<a\u0014", "u(J\u0013", "\u0013l_Al\rE]\u0015\u000eh^;", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<W,?U\r\u000e7|k", "3l_Al\rE]\u0015\u000eh^;", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\na\u001e!C~{<\u0006z", "4k^.g\u001a>b\u0003\u007f", "3kT:X5M\u001f", "", "3kT:X5M ", "3kT:X5M!", "3kT:X5Ma", "6`b5", "", "9", ";tc.U3>4 \tvm\u001a|\u0018\u0019f", "1n[9X*MW#\b"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FloatSetKt {
    private static final MutableFloatSet EmptyFloatSet = new MutableFloatSet(0);
    private static final float[] EmptyFloatArray = new float[0];

    public static final float[] getEmptyFloatArray() {
        return EmptyFloatArray;
    }

    public static final FloatSet emptyFloatSet() {
        return EmptyFloatSet;
    }

    public static final FloatSet floatSetOf() {
        return EmptyFloatSet;
    }

    public static final FloatSet floatSetOf(float f2) {
        return mutableFloatSetOf(f2);
    }

    public static final FloatSet floatSetOf(float f2, float f3) {
        return mutableFloatSetOf(f2, f3);
    }

    public static final FloatSet floatSetOf(float f2, float f3, float f4) {
        return mutableFloatSetOf(f2, f3, f4);
    }

    public static final FloatSet floatSetOf(float... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(elements.length);
        mutableFloatSet.plusAssign(elements);
        return mutableFloatSet;
    }

    public static final MutableFloatSet mutableFloatSetOf() {
        return new MutableFloatSet(0, 1, null);
    }

    public static final MutableFloatSet mutableFloatSetOf(float f2) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(1);
        mutableFloatSet.plusAssign(f2);
        return mutableFloatSet;
    }

    public static final MutableFloatSet mutableFloatSetOf(float f2, float f3) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(2);
        mutableFloatSet.plusAssign(f2);
        mutableFloatSet.plusAssign(f3);
        return mutableFloatSet;
    }

    public static final MutableFloatSet mutableFloatSetOf(float f2, float f3, float f4) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(3);
        mutableFloatSet.plusAssign(f2);
        mutableFloatSet.plusAssign(f3);
        mutableFloatSet.plusAssign(f4);
        return mutableFloatSet;
    }

    public static final MutableFloatSet mutableFloatSetOf(float... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(elements.length);
        mutableFloatSet.plusAssign(elements);
        return mutableFloatSet;
    }

    public static final int hash(float f2) {
        int iHashCode = Float.hashCode(f2) * ScatterMapKt.MurmurHashC1;
        return iHashCode ^ (iHashCode << 16);
    }
}
