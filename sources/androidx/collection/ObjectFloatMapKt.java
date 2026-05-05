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
/* JADX INFO: compiled from: ObjectFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d̉=!4i\bDRш|İI\u0006F\u000b6B\u0005$4\u0012\u0006\fnj?C\\uV/jY:\u0011{{z'\n&\u0012EA٥(\u0001:\u0019]R\u007fm~Lj\u000b\n\u00124\u0015\u0019l2կc{u7\u001d6ZuO5]o\u0004<\u000fsV\u0007&݅0;*\t\u000f\u001fBHVy+GY\u0012*0nwĐV\r[\r2G\u0014B8\u0007.^wN|K\u001b\\Z1)ɅwE~+m5\u0015MSI\u0005+\u001b|y\u001eYGg9#.k\u0003MU\fC\u0011I\n=3oҊ++W~o{f\u0004,\u001b;Q\u001d]9)\u000b\u0004qb\u0012ʬ9R\u0014O^\u0013@wA~=@\u0012\u0014\u001e'v5]\u001et\u0011&3;u\u0004D^\fvB.\u0002\u0012:%1\u00183q<Kj_nS\u0019|>߉\t\r,1\u0019D/_l\u0014p\u0017+T>T_P`?Nݐ\u0018\\mq\u0012uz\u0002p\u0007`K\u000e5\u0014\u0011\\\u001eU;iB;!2\u0005xHu\u0001\u001d`\u0017Z\u001aVVL:n\\:Z\r\u001ag\\d3r\u0001Xf;)MbW7\u0002\u0016#8\\&CƼ)\u0010\\`\u0001OxQu\u001051v7 q\u001a\rw;dڨCT\u0014\u0014oW\u000f\u0014\u0006?\u0013\tflZS:a\r,0;`jVz,H\\\u0016+2mxL8:=1\\[K3\"PN\u0015\t\u000ea\u0019\u0014\rcK$IlTx\u0017\u0011h\\\u001fv\u0018|W>\u0015`h0qUC,>UPoط\u0001#\u0015\u0013\f\u0010U|dM\\n&u\u001c~N\u0018:;WǽK\u0016'$7H\u001a3UN\u0003e\u0018P@)\u001b~\u007fҸIk^k\u0016o\t,'mzSb\u001d:v\ryן\fd\u000e\u0011y{\t]{Z\u001b]NI9\u0006\b>n:\u0003þ-!U\u0005}'\u00155sFW!$},/Ch\u000em}7\u0012bU)%i\u00126{\u0016\u001eiжa2IPa\u001f\rT:*|\u0005RH1z6D)6\u0013ΉVD\u0015td=e\u000bu\u0001\u0017\u000b:\u0013\tV\nACs\f=F_pvs\u0002\"h[%?T\u0004k{yc\\QM?\u000e\u0019\tIn@#ݞ$Ve{!\u0006\u0014\n0<Q=r\u0005\u0003\fR6L>\u000eՁQW\u001a\n\u001e\u007f\u0018F&\u0012G6PySV<[)`dQ\u001d`\fcQ.\u000f\t'3L\u007fe5\u0013y^Tufb\u0005a*!\u001b\u0019V/j3:\\T\u007f\u001eX\\\u000f\u001b]]qPΜ:\u0004UC\u0006Q}\"P\u001e\r\u001fR\u0018a<\u007f\u0013\u007fx6͜\u0019X\u0015Rr{*f\u0019QR-\r\u0001\u0015\u000ej\u0011?\u000f'X\u000bo)0|R\u0006A[\u001a/\u001et-\u0015\u0018\u0015c\r\u001e]\nC:UI\u0019\u001bW\u007febS}N#P+\u0012\u00059\\\u0006\u0015\u0017\u000ek-R\u00168\u0019\u0013\u0006\u0017&h 25ؠxr\u0018I(J]\u05ceK\n#bim\u000e n'Yk\\ןMи|\nkؙ͂rq"}, d2 = {"\u0013l_Al\u0016;X\u0019|\n?3\u0007\u0005>M{3", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u0018t *\\+7v\n", "", "3l_Al\u0016;X\u0019|\n?3\u0007\u0005>M{3", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nj\u0014\u001cGm\u001d\u001d}/1he\u001cBC", "\u0019", ";tc.U3>=\u0016\u0004z\\;]\u00109a\u000f\u0010wKj\u0018", "9dh}", "D`[BXw", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}\\\u0004g\u0013 F|\u0018@u8~W\b'>m\u0014=QMD5\u001c.$d^@\u0007M)Sv%V-U6XaZ9\u001fg", "9dh~", "D`[BXx", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}\\'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004.\u0007\"g=\u001d\"re8\u001a-*X}.GJ]0f[<%$!V\u000bU+v\u0002^A\"}%>)\u0004;1}F>", "9dh\u007f", "D`[BXy", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}\\'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004.*@gE\u001a^o]B\t-\u0016K{'E[$\r 9nF\u0013\u001fd\u0012M>V\u0003cH+nBF#\u00125\u0013iKw|\t\u001d\u000e\u001fguBT\u001f(\u0001\u001fqP\u0011dQ/", "9dh\u0001", "D`[BXz", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}\\'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004.*@gE\u001a^o]B\t-\u0016K{'E[$\rCWnN\u0010[a\nW-VnVF$lS\r\u007fK\u0013E\u000b:u\u000b\u0010\u0015!~hzI]\u0010E\t\u0019\u007fJrPVh[vNA/_/d\nn}cD63{m$p", "9dh\u0002", "D`[BX{", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}\\'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004.*@gE\u001a^o]B\t-\u0016K{'E[$\rCWnN\u0010[a\nW-VnVF$lS\r\u007fn1E\u001372\b\b\u001f\u0010~TmGV\u000eVOu9(%qEfi}FT\u000f`4k\u0013_\u001bk>D-]Y)*dM5\neP\u0016rP\tHnQ\u0015\n  IC", "=aY2V;\u001fZ#z\nF(\b", "=aY2V;\u001fZ#z\nF(\br0", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}\\\u0004g\u0013 F|\u0018@u8~W\b'>m\u0014=QMD5\u001e\u001b\u001ah_Hgj6J\u0006\u000fCW$", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}\\'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004.\u0007\"g=\u001d\"re8\u001a-*X}.GJ]0f[<'\u0011\u0017Z\f]\f\u0014\u000fUP\fjO\r", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}\\'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004.*@gE\u001a^o]B\t-\u0016K{'E[$\r 9nF\u0013\u001fd\u0012M>V\u0003cH+nBF#\u00125\u0013k8m\u0001\n%n<tlQ>\fRO", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}\\'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004.*@gE\u001a^o]B\t-\u0016K{'E[$\rCWnN\u0010[a\nW-VnVF$lS\r\u007fK\u0013E\u000b:u\u000b\u0010\u0015!~hzI]\u0010E\t\u0019\u007fJrRC^_wV\"Ll&ss[(2", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}\\'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004.*@gE\u001a^o]B\t-\u0016K{'E[$\rCWnN\u0010[a\nW-VnVF$lS\r\u007fn1E\u001372\b\b\u001f\u0010~TmGV\u000eVOu9(%qEfi}FT\u000f`4k\u0013_\u001bk>D-][\u0016 hN=j\u0003]\r\u0002:ur=", "1n[9X*MW#\b"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ObjectFloatMapKt {
    private static final MutableObjectFloatMap<Object> EmptyObjectFloatMap = new MutableObjectFloatMap<>(0);

    public static final <K> ObjectFloatMap<K> emptyObjectFloatMap() {
        MutableObjectFloatMap<Object> mutableObjectFloatMap = EmptyObjectFloatMap;
        Intrinsics.checkNotNull(mutableObjectFloatMap, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.emptyObjectFloatMap>");
        return mutableObjectFloatMap;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMap() {
        MutableObjectFloatMap<Object> mutableObjectFloatMap = EmptyObjectFloatMap;
        Intrinsics.checkNotNull(mutableObjectFloatMap, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.objectFloatMap>");
        return mutableObjectFloatMap;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k2, float f2) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k2, f2);
        return mutableObjectFloatMap;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k2, float f2, K k3, float f3) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k2, f2);
        mutableObjectFloatMap.set(k3, f3);
        return mutableObjectFloatMap;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k2, float f2, K k3, float f3, K k4, float f4) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k2, f2);
        mutableObjectFloatMap.set(k3, f3);
        mutableObjectFloatMap.set(k4, f4);
        return mutableObjectFloatMap;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k2, float f2, K k3, float f3, K k4, float f4, K k5, float f5) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k2, f2);
        mutableObjectFloatMap.set(k3, f3);
        mutableObjectFloatMap.set(k4, f4);
        mutableObjectFloatMap.set(k5, f5);
        return mutableObjectFloatMap;
    }

    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k2, float f2, K k3, float f3, K k4, float f4, K k5, float f5, K k6, float f6) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k2, f2);
        mutableObjectFloatMap.set(k3, f3);
        mutableObjectFloatMap.set(k4, f4);
        mutableObjectFloatMap.set(k5, f5);
        mutableObjectFloatMap.set(k6, f6);
        return mutableObjectFloatMap;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf() {
        return new MutableObjectFloatMap<>(0, 1, null);
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k2, float f2) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k2, f2);
        return mutableObjectFloatMap;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k2, float f2, K k3, float f3) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k2, f2);
        mutableObjectFloatMap.set(k3, f3);
        return mutableObjectFloatMap;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k2, float f2, K k3, float f3, K k4, float f4) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k2, f2);
        mutableObjectFloatMap.set(k3, f3);
        mutableObjectFloatMap.set(k4, f4);
        return mutableObjectFloatMap;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k2, float f2, K k3, float f3, K k4, float f4, K k5, float f5) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k2, f2);
        mutableObjectFloatMap.set(k3, f3);
        mutableObjectFloatMap.set(k4, f4);
        mutableObjectFloatMap.set(k5, f5);
        return mutableObjectFloatMap;
    }

    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k2, float f2, K k3, float f3, K k4, float f4, K k5, float f5, K k6, float f6) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k2, f2);
        mutableObjectFloatMap.set(k3, f3);
        mutableObjectFloatMap.set(k4, f4);
        mutableObjectFloatMap.set(k5, f5);
        mutableObjectFloatMap.set(k6, f6);
        return mutableObjectFloatMap;
    }
}
