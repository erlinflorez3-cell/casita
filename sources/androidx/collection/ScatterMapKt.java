package androidx.collection;

import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
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
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d̉=!,p\bDJg|\u0004O\f8\u000b4D\u0007\":&\u007fјnjO0LeV\u008cZS8\u000es{:'c$\u007fCCU ~*\teNogtNb\u000bY\u000f\u000e\u0016~n4Ic\u0002e\u0012\u00157JoMBUoS9ht<\r(288\u0002\u0005\u0007\u001a2H&v\u0003CQ\u0013*FN\u0005RR;b5\u001e \u001cV /)\rk\\M`l\f@u݊\u001b\u0006Pf?k@~]\r\rn7\u000f\u0007adFnPU\u0017+م\u0011!r]E\u0002M\rU#vC?+wy\b:f\u0016,\u0015YZ=a\u0001Ct\u0005\u007ff<+9m{K~\u0014n»\u0013\u0017\u001b[\u001c\u00124&1.\f:\u0017\f\u001cI\rr\u0002K\u0001\u0006lc\u0018z\u0010<]Ӝ\u0006K:G=~Q\u0010AIRE\u001f\u001d\rL)G͚'sc\u001c\u0005-\u001b\u0003}\u00025_cUH|\u0010 ƞs\u001c\u0002p%B\u0004^M05\n6F\u0019;6\nGiܪq\u001a_R\u000e\u000f\u0005\u000f\u0010\u0004m`^X\"\u001d!g.\u00174rD\u0013\u000b2\u00adZpC\u001fv4T5%8\u0017.r\u0010<O0@R]\u0011\u0002j{cPə5~Fg\u0019\u0004\u000e\u0006`\u000f7C|{\u0010\u0010Q=ܟETy\u0013\u0003~B\u00023\u000b`68JH\u0019\u001b(\u007fRv$\u0013`E8ʊ:D?'\t-H1$rE\u000b wZ\u0017\u0016EԞK@\u0011\u0017<\u0001\u0019\u0003`\\7\nwzY,C{P:aS;ӧ4oBj:{1\"\u0017A\u000et\u007fXWN|\u0016<o\f\"&\u001a\u007fl]J3\u0011\u0005ǻ@\u001cMGRqsl}:5)\u0015\u000e\u001fKn-w\u0014zr<`1d_V'\"=y!S6\u0014 \u0006qH\u000bG*n\u001b]NI9\u001e\blҡ<|\u0013P63\u000f\":|c3s++-\u0010\u0014]\u001b(Ӡ\u0002}<-z\u000fTz\u0016\b:\u0018.o\u0011W$ЦSOW\u000f\u0017>P#\u001d\u0007P~\u0003w6M98\u001bT`A\u0013v\u001dЗS#=\f\u001e\u001f,;v\u0007_H*\b}b4&͈\fj\fLvCS&}Wu$\u0006K\u000b\u0016z\u0013\u0018\"\u00141\u001d\u0018LA.wob766w&aY;\u0011\u0004\u0003ʀ*LKJA#C\u0003~6\u0014\t6^_=\"bF\u0002\\n\u000e\u0003~\rZV0xE\u000f p܁\u0005'B,3M13snX]b\u001b\u00012XOƆpg\u000etaCD\u0003`C,\u0007\u007fsE<~\u0010ͺ<\u001cV7+\u0004o:>@\u0001KA\u0001\u001b\u0018\u0010W٥|Hq\u0019\u0015|R\u0013uzf1\nJ--ye\u000e\u001b*UԦ\u001fg\u0006}#EP|v Cx<?HW\u0006t|BfaҐ\fMHK\u000b\u0003\u0018Uz@S\u001a90$N&lt\u007f|\b\u0012tLu\u001bh\u001c8жh\u001a\u0018!\u00148\u0004\\I\u001dv8-p6.=yù\u0019~eyլ9@U*Cݪ\u0015Ƒlx\u0012ɨ\rw|U#\u0003\u00150\rҳEߴ#ɢ\r-Uܘ#Z`;\u001fU@l\u001f\u0003,\u0015T\u001elʊ9Ϭb˹gnxա_]\u0013/=mJm?5j\u001e,%PǢVցX(\u001d͇vYLk!\\\u001bH.Г1Ɉ,d|׃I \u000b\u0007`^?\u0012\u000bЙE۠h/?؟?g\u001bPx\u00072D \u008fsܳV?#ΠR\u0019}2\u000f\u00111E\u0019ߍVˡD֟v\u007foƨM`bI25i(}f\u0019%ySHD\u0018,?\u001d?<1߃\"ۋ`\u001a$ԝq?O))\u0001C>\\ːYص9jYƚE6\u000f\u000e\u0019\rm\u007f\bˊ\rތ;r+˄/\u0004)i~;S4\u001c͗}چTʩN\u0005Uޏf\u0011g?W7m(\u007f\u07baND*\u001fR#6uQ~m;N߫m\"`V\"V4&X5\u0017N)ؙz?\u0014\nZhHs\u0013ZɎ8\t"}, d2 = {"\u000fk[\u0012`7Mg", "", "\u0010hc:T:D:'{", "5dc\u000f\\;FO'\u0005al);\u00058n\n7wO\u0005! U", "u(E", "\u0010hc:T:D;'{", "5dc\u000f\\;FO'\u0005bl);\u00058n\n7wO\u0005! U", "\u0011k^;X+&S(zyZ;xf9u\t7", "", "\u0012dU.h3MA\u0017z\nm,\nf+p{&\u007fO\u0015", "\u0012d[2g,=", "\u0013l_Al", "\u0013l_Al\u000eK])\n", "", "\u0013l_Al\u001a<O(\u000ezk\u0014x\u0014", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r DU\u00129#", "", "", "\u0015q^Bc\u001eBR(\u0002", "\u001bta:h9!O'\u0002X*", "!d]A\\5>Z", "5dc X5MW\"~\u0002\u001d(\u0006\u00129t{7\u007fJ\n%", "1n]CX9M;\u0019\u000ev](\f\u0005\u0010o\r\u0006\u0003@| 'R", "", ";dc.W(MO", "1`_.V0Mg", "3l_Al\u001a<O(\u000ezk\u0014x\u0014", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u0015\u0013V~\u000eI^!@/", "\u0019", "$", "4h]184Ib-l\u0002h;", "AsP?g", "3mS", "5q^Bc", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nb$!Wzc", "=eU@X;", "60", "6`b5", "61", "9", "7r32_,MS\u0018", "", "7mS2k", "7r4:c;R", "7r5B_3", "D`[BX", ":nP1X+\u001cO$zxb;\u0011", ";tc.U3>A\u0017z\nm,\np+pi)", ">`X?f", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "uZ;8b;EW\"HeZ0\n^rL{1zM\u000b\u001b\u0016Z9\fF},5W\r$Av_\u0016]R7h;\u001e\u0003f]H\u0016c96r2\u001d", "<dgA6(IO\u0017\u0003\nr", "<na:T3Bh\u0019\\vi(z\r>y", "<", "@dP1E(P;\u0019\u000ev](\f\u0005", "2`c.", "Cm[<T+>Rvz\u0006Z*\u0001\u0018C", "EqXAX\u0014>b\u0015}vm(", "EqXAX\u0019:e\u0001~\nZ+x\u0018+", "5dc", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\n]\u001b&Ok\u001cBL", "6`b\u001bX?M", ":nf2f;\u001bW(lzm", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn&\u0013Vs\f\u0019z4=U\f&\r", ";`b884Ib-", ";`b884Ib-h\b=,\u0004\t>e~", ";`c0[", Global.SEMICOLON, "<dgA", "\u0010hc:T:D", "\u0015q^Bc", "!sPA\\*\u001bW(\u0007vl2", "1n[9X*MW#\b"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ScatterMapKt {
    public static final long AllEmpty = -9187201950435737472L;
    public static final long BitmaskLsb = 72340172838076673L;
    public static final long BitmaskMsb = -9187201950435737472L;
    public static final int ClonedMetadataCount = 7;
    public static final int DefaultScatterCapacity = 6;
    public static final long Deleted = 254;
    public static final long Empty = 128;
    public static final long[] EmptyGroup = {-9187201950435737345L, -1};
    private static final MutableScatterMap EmptyScatterMap = new MutableScatterMap(0);
    public static final int GroupWidth = 8;
    public static final int MurmurHashC1 = -862048943;
    public static final long Sentinel = 255;

    public static /* synthetic */ void getBitmaskLsb$annotations() {
    }

    public static /* synthetic */ void getBitmaskMsb$annotations() {
    }

    public static /* synthetic */ void getSentinel$annotations() {
    }

    public static final int h1(int i2) {
        return i2 >>> 7;
    }

    public static final int h2(int i2) {
        return (-1) - (((-1) - i2) | ((-1) - 127));
    }

    public static final boolean hasNext(long j2) {
        return j2 != 0;
    }

    public static final boolean isFull(long j2) {
        return j2 < 128;
    }

    public static final long maskEmpty(long j2) {
        long j3 = (~j2) << 6;
        long j4 = (j2 + j3) - (j2 | j3);
        return (j4 - 9187201950435737472L) - (j4 | (-9187201950435737472L));
    }

    public static final long maskEmptyOrDeleted(long j2) {
        return (-1) - (((-1) - (j2 & ((~j2) << 7))) | ((-1) - (-9187201950435737472L)));
    }

    public static final long match(long j2, int i2) {
        long j3 = j2 ^ (((long) i2) * BitmaskLsb);
        return (-1) - (((-1) - ((~j3) & (j3 - BitmaskLsb))) | ((-1) - (-9187201950435737472L)));
    }

    public static final long next(long j2) {
        long j3 = j2 - 1;
        return (j2 + j3) - (j2 | j3);
    }

    public static final int nextCapacity(int i2) {
        if (i2 == 0) {
            return 6;
        }
        return (i2 * 2) + 1;
    }

    public static final <K, V> ScatterMap<K, V> emptyScatterMap() {
        MutableScatterMap mutableScatterMap = EmptyScatterMap;
        Intrinsics.checkNotNull(mutableScatterMap, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return mutableScatterMap;
    }

    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf() {
        return new MutableScatterMap<>(0, 1, null);
    }

    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf(Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        MutableScatterMap<K, V> mutableScatterMap = new MutableScatterMap<>(pairs.length);
        mutableScatterMap.putAll(pairs);
        return mutableScatterMap;
    }

    public static final void convertMetadataForCleanup(long[] metadata, int i2) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        int i3 = (i2 + 7) >> 3;
        for (int i4 = 0; i4 < i3; i4++) {
            long j2 = metadata[i4];
            long j3 = (j2 - 9187201950435737472L) - (j2 | (-9187201950435737472L));
            metadata[i4] = (-72340172838076674L) & ((~j3) + (j3 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(metadata);
        int i5 = lastIndex - 1;
        long j4 = (-1) - (((-1) - metadata[i5]) | ((-1) - 72057594037927935L));
        metadata[i5] = (j4 - 72057594037927936L) - (j4 & (-72057594037927936L));
        metadata[lastIndex] = metadata[0];
    }

    public static final int hash(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * MurmurHashC1;
        return iHashCode ^ (iHashCode << 16);
    }

    public static final int normalizeCapacity(int i2) {
        if (i2 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i2);
        }
        return 0;
    }

    public static final int loadedCapacity(int i2) {
        if (i2 == 7) {
            return 6;
        }
        return i2 - (i2 / 8);
    }

    public static final int unloadedCapacity(int i2) {
        if (i2 == 7) {
            return 8;
        }
        return i2 + ((i2 - 1) / 7);
    }

    public static final long readRawMetadata(long[] data, int i2) {
        Intrinsics.checkNotNullParameter(data, "data");
        return (data[i2 >> 3] >> ((i2 & 7) << 3)) & 255;
    }

    public static final void writeRawMetadata(long[] data, int i2, long j2) {
        Intrinsics.checkNotNullParameter(data, "data");
        int i3 = i2 >> 3;
        int i4 = (i2 & 7) << 3;
        data[i3] = (-1) - (((-1) - (j2 << i4)) & ((-1) - ((-1) - (((-1) - data[i3]) | ((-1) - (~(255 << i4)))))));
    }

    public static final int lowestBitSet(long j2) {
        return Long.numberOfTrailingZeros(j2) >> 3;
    }

    public static final long group(long[] metadata, int i2) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        int i3 = i2 >> 3;
        int i4 = (i2 & 7) << 3;
        return (((-i4) >> 63) & (metadata[i3 + 1] << (64 - i4))) | (metadata[i3] >>> i4);
    }

    public static final int findEmptySlot(long[] metadata, int i2, int i3) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        while (i2 < i3) {
            if (((metadata[i2 >> 3] >> (((-1) - (((-1) - i2) | ((-1) - 7))) << 3)) & 255) == 128) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final void writeMetadata(long[] data, int i2, int i3, long j2) {
        Intrinsics.checkNotNullParameter(data, "data");
        int i4 = i3 >> 3;
        int i5 = ((i3 + 7) - (7 | i3)) << 3;
        long j3 = (-1) - (((-1) - data[i4]) | ((-1) - (~(255 << i5))));
        long j4 = j2 << i5;
        long j5 = (j4 + j3) - (j4 & j3);
        data[i4] = j5;
        data[(((-1) - (((-1) - (i3 - 7)) | ((-1) - i2))) + (i2 & 7)) >> 3] = j5;
    }

    public static final boolean isEmpty(long[] metadata, int i2) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i2 >> 3] >> (((i2 + 7) - (i2 | 7)) << 3)) & 255) == 128;
    }

    public static final boolean isDeleted(long[] metadata, int i2) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i2 >> 3] >> (((i2 + 7) - (i2 | 7)) << 3)) & 255) == 254;
    }

    public static final boolean isFull(long[] metadata, int i2) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i2 >> 3] >> (((i2 + 7) - (i2 | 7)) << 3)) & 255) < 128;
    }

    public static final int get(long j2) {
        return Long.numberOfTrailingZeros(j2) >> 3;
    }
}
