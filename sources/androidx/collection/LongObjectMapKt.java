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
/* JADX INFO: compiled from: LongObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d̉=!4i\bDRb|İI\u0006F\u000b6B\u0005#4\u0012\u0006\u000enj?C\\uV/jY:\u0011{{z'\n&\u0012EA٥(\u0001:\u0019]R\u007fm~Lj\u000b\n\u00124\u0018\u0019l2կc{u7\u001d6ZuO5]o\u0004<\u000fvV\u0007&݅0;*\t\u000f\u001fBH>|+GY\u0013*0\u0007sĐV\r[\r2G\u0014B8\u0007.^wN|K\u001b_Z1)ɅwE~+m5\u0015M;L\u0005+\u001b}y\u001eqCg9#.k\u00035X\fC\u0011I\n=KkҊ++W~o{f\u0004,\u001b;Q\u001d]9)\u000b\u0007qb\u0012ʬ9R\u0014O^\u0013@w)\u0002=@\u0012\u0015\u001e'\u000f1]\u001et\u0011&3#x\u0004D^\fvBF}\u0012:%1\u00183Y?Kj_nS\u0019\u0015:߉\t\r,1\u0019D/_l\u0014p\u0017+T>T_S`?Nݐ\u0018\\mq\u0012uz\u0002X\n`K\u000e6\u0014\u0011t\u001aU;iB;!\u001a\bxHu\u0001\u001d`/V\u001aVVL:nD=Z\r\u001ag\\dKn\u0001Xf;)MJZ7\u0002\u0016#8\\>?Ƽ)\u0010\\`\u0001OxQu\u001051v7 q\u001a\u0010w;dڨCT\u0014\u0014oW\u000f\u0014mB\u0013\tfmZSR]\r,0;`j>},H\\\u0016+2\u0006tL8:=1\\CN3\"PN\u0015\t&]\u0019\u0014\rcK$1oTx\u0017\u0011h\\7r\u0018|W>\u0015`P3qUC,>Uhkط\u0001#\u0015\u0013\f\u0010U|dM\\n&u\u001c~N\u0015:;WǽK\u0016'$7G\u001a3UN\u0003e\u0018P@&\u001b~\u007fҸIk^k\u0016o\t,\u000fpzSb\u001e:v%uן\fd\u000e\u0010y{\t\\{Z\u001b]NI9\u0006\b;n:\u0003þ-!U\u0005}'\u00155[IW!$~,/[d\u000em}7\u0012b=,%i\u00126{\u00166eжa2IOa\u001f\rS:*|\u0005RH1z6A)6\u0013ΉVD\u0015td=e\u000b]\u0004\u0017\u000b:\u0014\tV\"=Cs\f=F_Xys\u0002\"h[%WP\u0004k{yc\\9P?\u000e\u0019\tInX\u001fݞ$Vez!\u0006\u0014\t0<Q=r\u0005\u0003\fR3L>\u000eՁQW\u001a\n\u001e\u007f\u0018F\u000e\u0015G6PzSVTW)`dQ\u001d`sfQ.\u000f\t'3d{e5\u0013y^T]ib\u0005a*!\u001b1R/j3:\\Tg!X\\\u000f\u001b]]\nLΜ:\u0004UB\u0006Q}!P\u001e\r\u001fR\u0018a<\u007f\u0010\u007fx6͜\u0019X\u0015Rr{*f\u0001TR-\r\u0002\u0015\u000e\u0003\r?\u000f'X\u000bo\u00113|R\u0006A[\u001aG\u001at-\u0015\u0018\u0015ct!]\nC:UI1\u0017W\u007febS}6&P+\u0012\u00059\\\u001e\u0011\u0017\u000ek-R\u0016 \u001c\u0013\u0006\u0017&h J1ؠxr\u0018H(H]\u05ceK\b#`ik&!n&\u0002ˍ\b\u05ffOh\u0001Žʑp~"}, d2 = {"\u0013l_Al\u0013H\\\u001bhwc,z\u0018\u0017a\u000b", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<]/>[g\u001d<m\u0014=5?FA", "", "3l_Al\u0013H\\\u001bhwc,z\u0018\u0017a\u000b", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! IY\u000bAv#DAy+\r", "$", ":n]4B)CS\u0017\u000ebZ7f\n", "9dh}", "", "D`[BXw", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u0013 F|\u0018@u8~W\b'>m\u0014=QMD5\u001b(\u001ejK6\fc*]^#R\"", "9dh~", "D`[BXx", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q%g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#\u0007\"g=\u001d\"re8\u001a-*X}.GJ]0f[<$\u001e\u001b\\wK0\r\u0003h) y\u001a", "9dh\u007f", "D`[BXy", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q%g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#(\"p0/\u00112h5\u0010eu8s,GJ]\u0002 9nF\u0013\u001fd\u0012M>V\u0003cH+nBF#\u00125\u0013hEq\u0003u\u0013\u00135h\u007f*R\u001b\u001d", "9dh\u0001", "D`[BXz", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q%g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#(\"p0/\u00112h5\u0010eu8s,GJ]\u0002A9w9%\u000e$\u0015J4\u000fNC>)nBFtK\u0013E\u000b:u\u000b\u0010\u0015!~hzI]\u0010E\t\u0019\u007fJrOPbacDFE`9L\bjr", "9dh\u0002", "D`[BX{", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q%g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#(\"p0/\u00112h5\u0010eu8s,GJ]\u0002A9w9%\u000e$\u0015J4\u000fNC>)nBFtl\u0013N}LdJ\u0013\u0012\u001774Z?[\u0010E\tj9(%qEfi}FT\u000f`4k\u0013_\u001bk>D-]X#$j:+\u000f{Q ZN\u0005=", ";tc.U3>:#\b|H)\u0002\t-tg$\u0007*\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u0013 F|\u0018@u8~W\b'>m\u0014=QMD5\u001c.$d^@\u0007J6Wx\u0011DQN*k:nHi", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q%g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#\u0007\"g=\u001d\"re8\u001a-*X}.GJ]0f[<%$!V\u000bU+s\u000fbC\u000ekI7\u001d\u0017\u0014E\r\u0011", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q%g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#(\"p0/\u00112h5\u0010eu8s,GJ]\u0002 9nF\u0013\u001fd\u0012M>V\u0003cH+nBF#\u00125\u0013iKw|\t\u001d\u000e\u001ctyD@\rLy\u0013\u0005)%s\u001c", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q%g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#(\"p0/\u00112h5\u0010eu8s,GJ]\u0002A9w9%\u000e$\u0015J4\u000fNC>)nBFtK\u0013E\u000b:u\u000b\u0010\u0015!~hzI]\u0010E\t\u0019\u007fJrPVh[vNA,l3fu\\\"\\8I\f\u0010|n", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q%g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#(\"p0/\u00112h5\u0010eu8s,GJ]\u0002A9w9%\u000e$\u0015J4\u000fNC>)nBFtl\u0013N}LdJ\u0013\u0012\u001774Z?[\u0010E\tj9(%qEfi}FT\u000f`4k\u0013_\u001bk>D-]Y)*dM5\nb]\u001at<vlgE(b4/\u0014", "1n[9X*MW#\b"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LongObjectMapKt {
    private static final MutableLongObjectMap EmptyLongObjectMap = new MutableLongObjectMap(0);

    public static final <V> LongObjectMap<V> emptyLongObjectMap() {
        MutableLongObjectMap mutableLongObjectMap = EmptyLongObjectMap;
        Intrinsics.checkNotNull(mutableLongObjectMap, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        return mutableLongObjectMap;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf() {
        MutableLongObjectMap mutableLongObjectMap = EmptyLongObjectMap;
        Intrinsics.checkNotNull(mutableLongObjectMap, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.longObjectMapOf>");
        return mutableLongObjectMap;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf(long j2, V v2) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j2, v2);
        return mutableLongObjectMap;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf(long j2, V v2, long j3, V v3) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j2, v2);
        mutableLongObjectMap.set(j3, v3);
        return mutableLongObjectMap;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf(long j2, V v2, long j3, V v3, long j4, V v4) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j2, v2);
        mutableLongObjectMap.set(j3, v3);
        mutableLongObjectMap.set(j4, v4);
        return mutableLongObjectMap;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf(long j2, V v2, long j3, V v3, long j4, V v4, long j5, V v5) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j2, v2);
        mutableLongObjectMap.set(j3, v3);
        mutableLongObjectMap.set(j4, v4);
        mutableLongObjectMap.set(j5, v5);
        return mutableLongObjectMap;
    }

    public static final <V> LongObjectMap<V> longObjectMapOf(long j2, V v2, long j3, V v3, long j4, V v4, long j5, V v5, long j6, V v6) {
        MutableLongObjectMap mutableLongObjectMap = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap.set(j2, v2);
        mutableLongObjectMap.set(j3, v3);
        mutableLongObjectMap.set(j4, v4);
        mutableLongObjectMap.set(j5, v5);
        mutableLongObjectMap.set(j6, v6);
        return mutableLongObjectMap;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf() {
        return new MutableLongObjectMap<>(0, 1, null);
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j2, V v2) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j2, v2);
        return mutableLongObjectMap;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j2, V v2, long j3, V v3) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j2, v2);
        mutableLongObjectMap.set(j3, v3);
        return mutableLongObjectMap;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j2, V v2, long j3, V v3, long j4, V v4) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j2, v2);
        mutableLongObjectMap.set(j3, v3);
        mutableLongObjectMap.set(j4, v4);
        return mutableLongObjectMap;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j2, V v2, long j3, V v3, long j4, V v4, long j5, V v5) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j2, v2);
        mutableLongObjectMap.set(j3, v3);
        mutableLongObjectMap.set(j4, v4);
        mutableLongObjectMap.set(j5, v5);
        return mutableLongObjectMap;
    }

    public static final <V> MutableLongObjectMap<V> mutableLongObjectMapOf(long j2, V v2, long j3, V v3, long j4, V v4, long j5, V v5, long j6, V v6) {
        MutableLongObjectMap<V> mutableLongObjectMap = new MutableLongObjectMap<>(0, 1, null);
        mutableLongObjectMap.set(j2, v2);
        mutableLongObjectMap.set(j3, v3);
        mutableLongObjectMap.set(j4, v4);
        mutableLongObjectMap.set(j5, v5);
        mutableLongObjectMap.set(j6, v6);
        return mutableLongObjectMap;
    }
}
