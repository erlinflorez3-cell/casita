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
/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d̉=!4i\bDRш|İI\u0006F\u000b6B\u0005)4\u0012\u0006\u0016nj?5\\uV/jY:\u0011{{z'\n&\u0012EA٥(\u0001:\u0019]R\u007fm~Lj\u000b\n\u00124\u0015\u0019l2կc{u/\u001d6ZuO5]o\u0004<\u000fsV\u0007&݅0;*\t\u000f\u001fBHVyټGK\u001a\u0018He~>j\u0013]\u0007*\u0012LAN\u007f>^mޮDK\u001daH4;\u00030E~+m7\u0015MSIù+\r\u0005i6XN;M\u001b5U\u0013\u0007\u0019^m\u0002_sCݛv*W/Wxo6\u001f\u0003D\u00199V%]9)\r\t_i$'qRӍOP\u001c2\u0010$\n\u0011T\n\u001e\b7Ht0He(\u00109ο\u0001Vp`\u0010iZ\b\u000be<\u00165\u007fy.g'\u0007Q(>ϭR7\n\u0012%.1\u000f\u0007'kV\u001e`[\u001e\u0003yq3W̵KKf'gK\u0006\n\u0001d\u0012*J3u\u0002O}\u0017ф%(g_G(9kHKזkv\u0013o\u0001xw``F2p&7p\f:\\df\u000bߘ^W\t0\u001fR4TM\u00018\u0017.c\u0010<g(ŎROvy\u0003zk\u0018=5v9in2\u0011\u0006;~5;ȡq\u0013\u0012V\u0005\u0019W<)\b\tjPZ$Z#+R6Vs(wBG«\u0010\u0013@P\nEB:I\u001fl\u0017X\u0003dEo~)a`Ӑ\u001e\u0002\u0005C2\u000e\u0002,\u0005\r\u0007Olp6j'UL|'%έEQC+Fi0ֻL\u00053\u000b\u000fu\u0016F\u0016LuKCָwʀ\u007f \u001e֝\u0081UB"}, d2 = {"\u0013l_Al\u001a<O(\u000ezk\u001a|\u0018", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r D[\u0016=#", "", "3l_Al\u001a<O(\u000ezk\u001a|\u0018", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u0015\u0013V~\u000eId%D/", "\u0013", ";tc.U3>A\u0017z\nm,\nv/ti)", "3kT:X5M\u001f", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'| \u0016Ty\u0012;\nn3c\u0005'7k%2WL\u0005SD-\u0011eh9ta(]\u0006'T:N;2", "3kT:X5M ", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4?DjA(\u0019gt\u0003\u0005m3Uv%VPX5&:\u0003L\u0010\u000fa\u000e<)\t\u0014hA1\\DFt", "3kT:X5M!", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d\u00105(eQ\u007fG\u0018\u0011mWL5\u0014\fY?3rN@ho<X}8o\u0001y\u0014\nDypOD\u0010VO", "3kT:X5Ma", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u0013 F|\u0018@u8~W\b'>m\u0014=QMD5\u001c.$d^@\u0007Q*J\u00066GY<,k(", "AbPAg,KA\u0019\u000ed_", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'| \u0016Ty\u0012;\nn3c\u0005'7k%2WL\u0005Y2\u001a$waFtc;$", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4?DjA(\u0019gt\u0003\u0005m3Uv%VPX5&@p9#!Z\u001b<+\u001cZ", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d\u00105(eQ\u007fG\u0018\u0011mWL5\u0014\fY?3rN@hu*E\u0011Jh\u000ey\u0016\u001d\u000b", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u0013 F|\u0018@u8~W\b'>m\u0014=QMD5\"\u001c\u0011wp9\u0014Q,]L", "1n[9X*MW#\b"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ScatterSetKt {
    private static final MutableScatterSet<Object> EmptyScatterSet = new MutableScatterSet<>(0);

    public static final <E> ScatterSet<E> emptyScatterSet() {
        MutableScatterSet<Object> mutableScatterSet = EmptyScatterSet;
        Intrinsics.checkNotNull(mutableScatterSet, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        return mutableScatterSet;
    }

    public static final <E> ScatterSet<E> scatterSetOf() {
        MutableScatterSet<Object> mutableScatterSet = EmptyScatterSet;
        Intrinsics.checkNotNull(mutableScatterSet, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.scatterSetOf>");
        return mutableScatterSet;
    }

    public static final <E> ScatterSet<E> scatterSetOf(E e2) {
        return mutableScatterSetOf(e2);
    }

    public static final <E> ScatterSet<E> scatterSetOf(E e2, E e3) {
        return mutableScatterSetOf(e2, e3);
    }

    public static final <E> ScatterSet<E> scatterSetOf(E e2, E e3, E e4) {
        return mutableScatterSetOf(e2, e3, e4);
    }

    public static final <E> ScatterSet<E> scatterSetOf(E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableScatterSet mutableScatterSet = new MutableScatterSet(elements.length);
        mutableScatterSet.plusAssign((Object[]) elements);
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf() {
        return new MutableScatterSet<>(0, 1, null);
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e2) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(1);
        mutableScatterSet.plusAssign(e2);
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e2, E e3) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(2);
        mutableScatterSet.plusAssign(e2);
        mutableScatterSet.plusAssign(e3);
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E e2, E e3, E e4) {
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(3);
        mutableScatterSet.plusAssign(e2);
        mutableScatterSet.plusAssign(e3);
        mutableScatterSet.plusAssign(e4);
        return mutableScatterSet;
    }

    public static final <E> MutableScatterSet<E> mutableScatterSetOf(E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableScatterSet<E> mutableScatterSet = new MutableScatterSet<>(elements.length);
        mutableScatterSet.plusAssign((Object[]) elements);
        return mutableScatterSet;
    }
}
