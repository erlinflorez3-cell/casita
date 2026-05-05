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
/* JADX INFO: compiled from: IntIntMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001a\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\u000b6B\r(4\u0012}\u0010~nG0\\ev/jW8\u0011\u0004{b%s8\u007fESUH~R\r]Q\u007fg\u001dN\u000b\u000fQ\u0014\u001e\u0016'nDmczu\u0012=3rsM6eok=\u0011xD\n82P<*\t\u000f BH>z+GY\u0013*0ntR\u0007\u001bO\u001d\u001a@\u0007n$\u000f!tg|:xpk?G#1mrR5eH|{\u0011vX5\u0014\u000faL/p;C\u001d=S1\u000b\u0003_M\fWqk\t\u0001k5-as\u00067\t\u0004\"\u0018CO;a#*j\ni`:+[SqQh\u000eV{+\u007f\u001bC\u001c\u000e4+x2;\"~\b<7%vaIh\u0002\rF0~o@/%.7[=)qiai\u001df\f\n\u0007%\u001eQ\u0002\u001f%iW&`C\u001f\u0005{_6i@kL~\u000egC\u0006\u0004\u001ff2.\u00127_\u007f]\u007fA2%-O[g'Qo\u0010Q\\g%\t\u0011lasjHn&\u001f\u001aE5!\f\tH\u0015\ty\\lXZ\u0015} b\u0014\u0016\bA$t{J/=\u0010|N\u0001}x[u\nS.\u0017;gq\u0004\u000e\u0006=\u000f7CV{\u0010\u0010V\u000f8MJz\u0005\u0007erW\u001a]t(P6xn\u001e|\u0014D|\u0010C6Mw44Z5I`#O\u001b\u001epE\u0015=mh\u0001\u0010-Sc(\u0011l<t7\u0005\u0001`~t\u007fxw0-d03YQc\u001dVY0oL|Q\u000b/w\u000eO\u007fLuP\u001d\u001a\u0004^\u0014 D\u001eQ\u0016=K+\u000f-(b\u0006;Hdr\u0014U}\u00165\u007f\u0015y=?\u00192u\u000e\u0003pZd\u001bN][/\"%b#'\u0016l\u0018y\u0010J+Kq]#[lM#\u0007gFf8+\tO\"3\f\b\"+9E\u00185+.wB.Eekl\b.(f?*\u0003j\u001c,\u0012\u001a f_cJ;fM\n\u0003L)<l1Fxn\u0006\u0010Z\tb\u0011cLOm\tVfQ;3\fp\u001f,;t\u0007_H\u001e\b}b2\u0010.\u0002O\u0016\u0014\rGU\u0015[`\u007fm\u001cO|\u0017X\u05fa\"\u000b*0Eܡ\u001eݞ$V_łק4\u0015"}, d2 = {"\u0013l_Al\u0010Gb|\b\nF(\b", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.D=\u0007/\u001fi!\u0004", "3l_Al\u0010Gb|\b\nF(\b", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &+x\u001d$r0\u000b", "7mc\u0016a;&O$h{", "9dh}", "", "D`[BXw", "9dh~", "D`[BXx", "9dh\u007f", "D`[BXy", "9dh\u0001", "D`[BXz", "9dh\u0002", "D`[BX{", ";tc.U3>7\"\u000e^g;d\u0005:O\u0001", "1n[9X*MW#\b"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class IntIntMapKt {
    private static final MutableIntIntMap EmptyIntIntMap = new MutableIntIntMap(0);

    public static final IntIntMap emptyIntIntMap() {
        return EmptyIntIntMap;
    }

    public static final IntIntMap intIntMapOf() {
        return EmptyIntIntMap;
    }

    public static final IntIntMap intIntMapOf(int i2, int i3) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i2, i3);
        return mutableIntIntMap;
    }

    public static final IntIntMap intIntMapOf(int i2, int i3, int i4, int i5) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i2, i3);
        mutableIntIntMap.set(i4, i5);
        return mutableIntIntMap;
    }

    public static final IntIntMap intIntMapOf(int i2, int i3, int i4, int i5, int i6, int i7) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i2, i3);
        mutableIntIntMap.set(i4, i5);
        mutableIntIntMap.set(i6, i7);
        return mutableIntIntMap;
    }

    public static final IntIntMap intIntMapOf(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i2, i3);
        mutableIntIntMap.set(i4, i5);
        mutableIntIntMap.set(i6, i7);
        mutableIntIntMap.set(i8, i9);
        return mutableIntIntMap;
    }

    public static final IntIntMap intIntMapOf(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i2, i3);
        mutableIntIntMap.set(i4, i5);
        mutableIntIntMap.set(i6, i7);
        mutableIntIntMap.set(i8, i9);
        mutableIntIntMap.set(i10, i11);
        return mutableIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf() {
        return new MutableIntIntMap(0, 1, null);
    }

    public static final MutableIntIntMap mutableIntIntMapOf(int i2, int i3) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i2, i3);
        return mutableIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf(int i2, int i3, int i4, int i5) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i2, i3);
        mutableIntIntMap.set(i4, i5);
        return mutableIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf(int i2, int i3, int i4, int i5, int i6, int i7) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i2, i3);
        mutableIntIntMap.set(i4, i5);
        mutableIntIntMap.set(i6, i7);
        return mutableIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i2, i3);
        mutableIntIntMap.set(i4, i5);
        mutableIntIntMap.set(i6, i7);
        mutableIntIntMap.set(i8, i9);
        return mutableIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i2, i3);
        mutableIntIntMap.set(i4, i5);
        mutableIntIntMap.set(i6, i7);
        mutableIntIntMap.set(i8, i9);
        mutableIntIntMap.set(i10, i11);
        return mutableIntIntMap;
    }
}
