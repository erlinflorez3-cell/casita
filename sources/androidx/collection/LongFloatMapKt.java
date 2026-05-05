package androidx.collection;

import kotlin.Metadata;
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
/* JADX INFO: compiled from: LongFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d̉=!4i\bӵLc\u000b\u0004I\u00066\u000b6B\r)4ߚ\u007f\u0007toA0Jm`2`SB\u000f\u001a|L(i&\nCiV2\u00120\u000bgN\u0016h\u001fNh\u000e[\u000f4\u001a)n:Nmx\f\u0018'VPqW3{pm=nwN\u0005N6R<\b\n\u0019\u001aXN@z\tJc\f@4ptHZ%M3 *:L\"\u0019\u001e\u000bh~:Vou:]'3mPS?_^\u0003}\u0011T[?\r%eN/N?M\u0015SY3\u000b`dW\u0003mum\tv1?+wyozf\u0002,\u0015YP=a\u0001)t\u0005\u007fd<+9T{K~\u0014X{\t\u0003%<2\u00126+V6E\u001a\u0015\u000e>7\u0003{k@~\u0006\u000fF\u000e\u0005y6E+079D3f\u007fek\u001d\\C\u0014\u0005;$;U|#sT<aE\u001fbzi1\u007fDmL\\\u000fq=\u001c\n!f\u00101\u001c0u\u0004_\u007f\u001f6/%eai'/t\u001aHrk'\tnrki\u0001Np&|!O*7\u0010\u000bHr\u0011\u0004P\u0003^\\\u0015[)l\u0007,\fC$j\u0006T!S\u0016fSvx\u0003M\f\t=CtFqn\u001a\r\b=l6MQ\u0012\u0014\u0012V\u0005\u0019W<\u0011\u000bp\u000bPb$Z\u000b'R6Vm(w*H~\u0010!7WqJ:\\5'c-H1\"rE\u000b\u0011wZ\u0017\u0016\u0017\tA3\u001biRs9\u0005^_\to\u0016|y0\u000be:-oWe\u001d4\\:hb\u0001S\u000b\r{\u0018G\u0016RwPz\u001f\u000eU*$F\u001eG[G=A\u0015\u0017m@\u0011EEzq\u0016U[\u0015?z+}??v3\u007f\b\u0019v\\dxQgTE&'b\u0001+ d.\u007f\u0012J\tP{T9_nM\u0001\rq<|>-\t-)=\u0001\u001e&-9;O?\u001dD},\u0004#pui\u001e-*f\u001d)\re20\u0014\u001a}gi]`AhMg\u0006V\"Rp3FVr\u0010\bp\u000fd\u0011AQYd\u001fZhQ\u00199\u0016f52=tdfR\u0013\u001e\u0002d2m6\fC,\u001a\u000fG3\u001eeS\u0016q\u001eOj\u0019b\u000f8\u0011\u001c=|ܞ4=NU.Ņ\u000bޘ\ns ܽ\u05f6?r"}, d2 = {"\u0013l_Al\u0013H\\\u001b_\u0002h(\fp+p", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<]/>[^'Ai%\u0016IN\u0011", "3l_Al\u0013H\\\u001b_\u0002h(\fp+p", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! IP\u0015Fr4\u001dU\tu", ":n]493HO(fvi\u0016}", "9dh}", "", "D`[BXw", "", "9dh~", "D`[BXx", "9dh\u007f", "D`[BXy", "9dh\u0001", "D`[BXz", "9dh\u0002", "D`[BX{", ";tc.U3>:#\b|?3\u0007\u0005>M{3eA", "1n[9X*MW#\b"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LongFloatMapKt {
    private static final MutableLongFloatMap EmptyLongFloatMap = new MutableLongFloatMap(0);

    public static final LongFloatMap emptyLongFloatMap() {
        return EmptyLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf() {
        return EmptyLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf(long j2, float f2) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j2, f2);
        return mutableLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf(long j2, float f2, long j3, float f3) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j2, f2);
        mutableLongFloatMap.set(j3, f3);
        return mutableLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf(long j2, float f2, long j3, float f3, long j4, float f4) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j2, f2);
        mutableLongFloatMap.set(j3, f3);
        mutableLongFloatMap.set(j4, f4);
        return mutableLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf(long j2, float f2, long j3, float f3, long j4, float f4, long j5, float f5) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j2, f2);
        mutableLongFloatMap.set(j3, f3);
        mutableLongFloatMap.set(j4, f4);
        mutableLongFloatMap.set(j5, f5);
        return mutableLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf(long j2, float f2, long j3, float f3, long j4, float f4, long j5, float f5, long j6, float f6) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j2, f2);
        mutableLongFloatMap.set(j3, f3);
        mutableLongFloatMap.set(j4, f4);
        mutableLongFloatMap.set(j5, f5);
        mutableLongFloatMap.set(j6, f6);
        return mutableLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf() {
        return new MutableLongFloatMap(0, 1, null);
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf(long j2, float f2) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j2, f2);
        return mutableLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf(long j2, float f2, long j3, float f3) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j2, f2);
        mutableLongFloatMap.set(j3, f3);
        return mutableLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf(long j2, float f2, long j3, float f3, long j4, float f4) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j2, f2);
        mutableLongFloatMap.set(j3, f3);
        mutableLongFloatMap.set(j4, f4);
        return mutableLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf(long j2, float f2, long j3, float f3, long j4, float f4, long j5, float f5) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j2, f2);
        mutableLongFloatMap.set(j3, f3);
        mutableLongFloatMap.set(j4, f4);
        mutableLongFloatMap.set(j5, f5);
        return mutableLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf(long j2, float f2, long j3, float f3, long j4, float f4, long j5, float f5, long j6, float f6) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, null);
        mutableLongFloatMap.set(j2, f2);
        mutableLongFloatMap.set(j3, f3);
        mutableLongFloatMap.set(j4, f4);
        mutableLongFloatMap.set(j5, f5);
        mutableLongFloatMap.set(j6, f6);
        return mutableLongFloatMap;
    }
}
