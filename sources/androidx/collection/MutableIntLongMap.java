package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: IntLongMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4C\u0007\":\u0012\u007f\u0007loA0RlP\u008cZS@\u000fs{:(c$\bCCU0}*\t]aogtOb\u000bQ\u0018\u000e\u0016~j4Ikxe\u0012\u00158Xģo3{n}Fpz<\u0005.2:8(\u0006в\u001e*V\u0012?\u0001QO$\u0012^E7:\u001b\u0011[\u000b2\u00124Ch\u0007,c\u007fNdM3]\u0003=1\u000b\u0002B|(\u00104\u000bV%F\u0003(Sv*,9JO5C&\u0004\u0007\u0015]s?1@8=M\t53CI\"df\\\u000e\u001f-+}\u000e\u000e|4j\u001dWp\u000e7+}py_Tߑ}¶zȞ\u0005\n\u001c\u0016?H\\2`fP\u001cA\u0006\u000bSnU2bP\u0012\u0013ad\u0018k\u007f{9G.~Q\u0010@IRE{\u001d\rL$Gnijb\"x\u0015IY(U?fX=vdPԶE6\u0013~v\u001a*25w\u0004=\u0011).E<}يAk0y\u0016`D\u0016{5dv^\u0002RvAhÉ\u001e\u007f9\u0017 rD\u0013\n\u001cTbmD\u0011{4\u001bͼ\u0006P\".u\u0010<O*@R]\u0003\u0002j{\\Pɟ7/Kg\n\u0004\u000e\u0006>\u000f7C\\{\u0010\u0010S'\u0018MXz\u0005\u0007s\u000bo\u001aut(P?xn\u001e\u0003\u0014D|\rC6M\u000e44Z>I`#e\u001b\u001epNE\u0015mx\u0001\u0010-Yc(\u0011\u0004<t7\u007f\u0019h~\u000f\u007fxw1-d08YQc\u001ani0\bL|Q'/w\u000eR\u007fLuM\u001d\u001a\u0004q\u0014 D'\u0002u=^+\u000f-.b\u0018;gd\u0005uS]\u0012U{\r{\u001f;\u0017;w\nzpZ\u0001\u0019m\u0016ܾ\u001dɪuܥ;1\u0016\t\u0018y\u0010K+Kqy#[lJ9\u0002\"J\\^\u0015\u0005M#U\u0005}I\u00155[Dm\u001d^\u000f\"W-a\fn 2\bm'&#f40q2\bb\u007fjxյ8\u0012]\rg:$\u001b\u0004\u000b_x\" B79=7Vf|p\u00059}\u000f=\u001a~\u0007Z\u001a7¦a\u000b\u001f}\u0001L.\u000e+Jʘ\nљbC-ݎ߀SlupQŦ;x\u000eЁ\u000f'"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.D@\b)9U\u00129#", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &.y\u0017>^!@/", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "5q^Dg/%W!\u0003\n", "/cYBf;,b#\fv`,", "", "1kT.e", "2q^=7,ES(~\t", "4h]190Ka(Z\fZ0\u0004\u0005,l\u007f\u0016\u0003J\u0010", "6`b5$", "4h]1<5LS&\u000e^g+|\u001c", "9dh", "5dc\u001ce\u0017Nb", "", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "7mXA\\(EW.~\\k6\u000f\u00182", "7mXA\\(EW.~b^;x\b+t{", "1`_.V0Mg", "7mXA\\(EW.~hm6\n\u00051e", ";h]Bf\bLa\u001d\u0001\u0004", "9dh@", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &.s\u001cKL", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &5o\u001d\u0012", "", ">kd@4:LW\u001b\b", "4q^:", ">tc", "D`[BX", "2dU.h3M", ">tc\u000e_3", "@d\\<i,", "", "@d\\<i,\"T", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "@d\\<i,/O \u000fz:;", "7mS2k", "@db6m,,b#\fv`,", "<df\u0010T7:Q\u001d\u000e\u000f", "Adc", "BqX:", "EqXAX\u0014>b\u0015}vm(", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableIntLongMap extends IntLongMap {
    private int growthLimit;

    public MutableIntLongMap() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableIntLongMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i3) | ((-1) - 1)) != 0 ? 6 : i2);
    }

    public MutableIntLongMap(int i2) {
        super(null);
        if (!(i2 >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i2));
    }

    private final void initializeStorage(int i2) {
        int iMax = i2 > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(i2)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.keys = new int[iMax];
        this.values = new long[iMax];
    }

    private final void initializeMetadata(int i2) {
        long[] jArr;
        if (i2 == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((-1) - (((-1) - (i2 + 15)) | ((-1) - (-8)))) >> 3];
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.metadata = jArr;
        long[] jArr2 = this.metadata;
        int i3 = i2 >> 3;
        long j2 = jArr2[i3];
        long j3 = 255 << (((i2 + 7) - (i2 | 7)) << 3);
        long j4 = ~j3;
        long j5 = (j2 + j4) - (j2 | j4);
        jArr2[i3] = (j5 + j3) - (j5 & j3);
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    public final long getOrPut(int i2, Function0<Long> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(i2);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        long jLongValue = defaultValue.invoke().longValue();
        put(i2, jLongValue);
        return jLongValue;
    }

    public final void set(int i2, long j2) {
        int iFindInsertIndex = findInsertIndex(i2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = i2;
        this.values[iFindInsertIndex] = j2;
    }

    public final void put(int i2, long j2) {
        set(i2, j2);
    }

    public final long put(int i2, long j2, long j3) {
        int iFindInsertIndex = findInsertIndex(i2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        } else {
            j3 = this.values[iFindInsertIndex];
        }
        this.keys[iFindInsertIndex] = i2;
        this.values[iFindInsertIndex] = j2;
        return j3;
    }

    public final void plusAssign(IntLongMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void remove(int i2) {
        int iFindKeyIndex = findKeyIndex(i2);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final boolean remove(int i2, long j2) {
        int iFindKeyIndex = findKeyIndex(i2);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != j2) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void removeIf(Function2<? super Integer, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            long j3 = (-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2));
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (predicate.invoke(Integer.valueOf(this.keys[i5]), Long.valueOf(this.values[i5])).booleanValue()) {
                            removeValueAt(i5);
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void minusAssign(int i2) {
        remove(i2);
    }

    public final void minusAssign(int[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (int i2 : keys) {
            remove(i2);
        }
    }

    public final void removeValueAt(int i2) {
        this._size--;
        long[] jArr = this.metadata;
        int i3 = this._capacity;
        int i4 = i2 >> 3;
        int i5 = ((i2 + 7) - (7 | i2)) << 3;
        long j2 = ((-1) - (((-1) - jArr[i4]) | ((-1) - (~(255 << i5))))) | (254 << i5);
        jArr[i4] = j2;
        jArr[(((-1) - (((-1) - (i2 - 7)) | ((-1) - i3))) + (i3 & 7)) >> 3] = j2;
    }

    public final void clear() {
        this._size = 0;
        if (this.metadata != ScatterMapKt.EmptyGroup) {
            ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr = this.metadata;
            int i2 = this._capacity;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            long j3 = (-1) - (((-1) - jArr[i3]) | ((-1) - (~j2)));
            jArr[i3] = (j3 + j2) - (j3 & j2);
        }
        initializeGrowth();
    }

    private final int findFirstAvailableSlot(int i2) {
        int i3 = this._capacity;
        int i4 = (i2 + i3) - (i2 | i3);
        int i5 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((-1) - (((-1) - (jArr[i6 + 1] << (64 - i7))) | ((-1) - ((-i7) >> 63)))) | (jArr[i6] >>> i7);
            long j3 = (~j2) << 7;
            long j4 = (j2 + j3) - (j2 | j3);
            long j5 = (j4 - 9187201950435737472L) - (j4 | (-9187201950435737472L));
            if (j5 != 0) {
                int iNumberOfTrailingZeros = i4 + (Long.numberOfTrailingZeros(j5) >> 3);
                return (iNumberOfTrailingZeros + i3) - (iNumberOfTrailingZeros | i3);
            }
            i5 += 8;
            int i8 = i4 + i5;
            i4 = (i8 + i3) - (i8 | i3);
        }
    }

    public final int trim() {
        int i2 = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i2) {
            return 0;
        }
        resizeStorage(iNormalizeCapacity);
        return i2 - this._capacity;
    }

    private final void adjustStorage() {
        if (this._capacity > 8 && Long.compareUnsigned(ULong.m9154constructorimpl(ULong.m9154constructorimpl(this._size) * 32), ULong.m9154constructorimpl(ULong.m9154constructorimpl(this._capacity) * 25)) <= 0) {
            dropDeletes();
        } else {
            resizeStorage(ScatterMapKt.nextCapacity(this._capacity));
        }
    }

    private final void dropDeletes() {
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        int[] iArr = this.keys;
        long[] jArr2 = this.values;
        ScatterMapKt.convertMetadataForCleanup(jArr, i2);
        char c2 = 0;
        int i3 = 0;
        int iFindEmptySlot = -1;
        while (i3 != i2) {
            int i4 = i3 >> 3;
            int i5 = ((i3 + 7) - (7 | i3)) << 3;
            long j2 = (-1) - (((-1) - (jArr[i4] >> i5)) | ((-1) - 255));
            if (j2 == 128) {
                iFindEmptySlot = i3;
                i3++;
            } else {
                if (j2 == 254) {
                    int iHashCode = Integer.hashCode(iArr[i3]) * ScatterMapKt.MurmurHashC1;
                    int i6 = iHashCode ^ (iHashCode << 16);
                    int i7 = i6 >>> 7;
                    int iFindFirstAvailableSlot = findFirstAvailableSlot(i7);
                    int i8 = (-1) - (((-1) - i7) | ((-1) - i2));
                    int i9 = ((-1) - (((-1) - (iFindFirstAvailableSlot - i8)) | ((-1) - i2))) / 8;
                    int i10 = i3 - i8;
                    if (i9 == ((i10 + i2) - (i10 | i2)) / 8) {
                        long j3 = (-1) - (((-1) - (~(255 << i5))) | ((-1) - jArr[i4]));
                        long j4 = ((long) ((i6 + 127) - (i6 | 127))) << i5;
                        jArr[i4] = (j4 + j3) - (j4 & j3);
                        jArr[ArraysKt.getLastIndex(jArr)] = (jArr[c2] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i11 = iFindFirstAvailableSlot >> 3;
                        long j5 = jArr[i11];
                        int i12 = (iFindFirstAvailableSlot & 7) << 3;
                        if (((j5 >> i12) & 255) != 128) {
                            jArr[i11] = (((long) ((-1) - (((-1) - i6) | ((-1) - 127)))) << i12) | (j5 & (~(255 << i12)));
                            if (iFindEmptySlot == -1) {
                                iFindEmptySlot = ScatterMapKt.findEmptySlot(jArr, i3 + 1, i2);
                            }
                            iArr[iFindEmptySlot] = iArr[iFindFirstAvailableSlot];
                            iArr[iFindFirstAvailableSlot] = iArr[i3];
                            iArr[i3] = iArr[iFindEmptySlot];
                            jArr2[iFindEmptySlot] = jArr2[iFindFirstAvailableSlot];
                            jArr2[iFindFirstAvailableSlot] = jArr2[i3];
                            jArr2[i3] = jArr2[iFindEmptySlot];
                            i3--;
                        } else {
                            long j6 = j5 & (~(255 << i12));
                            long j7 = ((long) ((i6 + 127) - (i6 | 127))) << i12;
                            jArr[i11] = (j6 + j7) - (j6 & j7);
                            jArr[i4] = (jArr[i4] & (~(255 << i5))) | (128 << i5);
                            iArr[iFindFirstAvailableSlot] = iArr[i3];
                            iArr[i3] = 0;
                            jArr2[iFindFirstAvailableSlot] = jArr2[i3];
                            jArr2[i3] = 0;
                            iFindEmptySlot = i3;
                        }
                        int lastIndex = ArraysKt.getLastIndex(jArr);
                        c2 = 0;
                        long j8 = (-1) - (((-1) - jArr[0]) | ((-1) - 72057594037927935L));
                        jArr[lastIndex] = (j8 - Long.MIN_VALUE) - (j8 & Long.MIN_VALUE);
                        i3++;
                    }
                }
                i3++;
            }
        }
        initializeGrowth();
    }

    private final void resizeStorage(int i2) {
        MutableIntLongMap mutableIntLongMap = this;
        long[] jArr = mutableIntLongMap.metadata;
        int[] iArr = mutableIntLongMap.keys;
        long[] jArr2 = mutableIntLongMap.values;
        int i3 = mutableIntLongMap._capacity;
        initializeStorage(i2);
        long[] jArr3 = mutableIntLongMap.metadata;
        int[] iArr2 = mutableIntLongMap.keys;
        long[] jArr4 = mutableIntLongMap.values;
        int i4 = mutableIntLongMap._capacity;
        int i5 = 0;
        while (i5 < i3) {
            if ((-1) - (((-1) - (jArr[i5 >> 3] >> (((i5 + 7) - (7 | i5)) << 3))) | ((-1) - 255)) < 128) {
                int i6 = iArr[i5];
                int iHashCode = Integer.hashCode(i6) * ScatterMapKt.MurmurHashC1;
                int i7 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableIntLongMap.findFirstAvailableSlot(i7 >>> 7);
                int i8 = iFindFirstAvailableSlot >> 3;
                int i9 = ((iFindFirstAvailableSlot + 7) - (iFindFirstAvailableSlot | 7)) << 3;
                long j2 = jArr3[i8];
                long j3 = ~(255 << i9);
                long j4 = ((j2 + j3) - (j2 | j3)) | (((long) (i7 & 127)) << i9);
                jArr3[i8] = j4;
                int i10 = iFindFirstAvailableSlot - 7;
                jArr3[(((i10 + i4) - (i10 | i4)) + (7 & i4)) >> 3] = j4;
                iArr2[iFindFirstAvailableSlot] = i6;
                jArr4[iFindFirstAvailableSlot] = jArr2[i5];
            }
            i5++;
            mutableIntLongMap = this;
        }
    }

    private final void writeMetadata(int i2, long j2) {
        long[] jArr = this.metadata;
        int i3 = i2 >> 3;
        int i4 = ((-1) - (((-1) - i2) | ((-1) - 7))) << 3;
        jArr[i3] = (jArr[i3] & (~(255 << i4))) | (j2 << i4);
        int i5 = this._capacity;
        int i6 = ((-1) - (((-1) - (i2 - 7)) | ((-1) - i5))) + (i5 & 7);
        int i7 = i6 >> 3;
        int i8 = (i6 & 7) << 3;
        jArr[i7] = (-1) - (((-1) - (j2 << i8)) & ((-1) - ((-1) - (((-1) - jArr[i7]) | ((-1) - (~(255 << i8)))))));
    }

    public final void putAll(IntLongMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        int[] iArr = from.keys;
        long[] jArr = from.values;
        long[] jArr2 = from.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr2[i2];
            long j3 = ((~j2) << 7) & j2;
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        set(iArr[i5], jArr[i5]);
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void minusAssign(IntSet keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        int[] iArr = keys.elements;
        long[] jArr = keys.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            long j3 = (-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2));
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 + j2) - (255 | j2) < 128) {
                        remove(iArr[(i2 << 3) + i4]);
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void minusAssign(IntList keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        int[] iArr = keys.content;
        int i2 = keys._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(iArr[i3]);
        }
    }

    private final int findInsertIndex(int i2) {
        int iHashCode = Integer.hashCode(i2) * ScatterMapKt.MurmurHashC1;
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = (i3 + 127) - (i3 | 127);
        int i6 = this._capacity;
        int i7 = (-1) - (((-1) - i4) | ((-1) - i6));
        int i8 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i9 = i7 >> 3;
            int i10 = ((-1) - (((-1) - i7) | ((-1) - 7))) << 3;
            long j2 = jArr[i9] >>> i10;
            long j3 = (-1) - (((-1) - (jArr[i9 + 1] << (64 - i10))) | ((-1) - ((-i10) >> 63)));
            long j4 = (j3 + j2) - (j3 & j2);
            long j5 = i5;
            long j6 = j4 ^ (j5 * ScatterMapKt.BitmaskLsb);
            for (long j7 = (-1) - (((-1) - ((-1) - (((-1) - (~j6)) | ((-1) - (j6 - ScatterMapKt.BitmaskLsb))))) | ((-1) - (-9187201950435737472L))); j7 != 0; j7 = (-1) - (((-1) - j7) | ((-1) - (j7 - 1)))) {
                int iNumberOfTrailingZeros = (-1) - (((-1) - ((Long.numberOfTrailingZeros(j7) >> 3) + i7)) | ((-1) - i6));
                if (this.keys[iNumberOfTrailingZeros] == i2) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((-1) - (((-1) - ((~j4) << 6)) | ((-1) - j4))) & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i4);
                if (this.growthLimit == 0 && (-1) - (((-1) - (this.metadata[iFindFirstAvailableSlot >> 3] >> (((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3))) | ((-1) - 255)) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i4);
                }
                this._size++;
                int i11 = iFindFirstAvailableSlot >> 3;
                int i12 = ((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3;
                this.growthLimit -= (-1) - (((-1) - (this.metadata[i11] >> i12)) | ((-1) - 255)) != 128 ? 0 : 1;
                long[] jArr2 = this.metadata;
                int i13 = this._capacity;
                long j8 = ((~(255 << i12)) & jArr2[i11]) | (j5 << i12);
                jArr2[i11] = j8;
                int i14 = iFindFirstAvailableSlot - 7;
                jArr2[(((i14 + i13) - (i14 | i13)) + ((i13 + 7) - (i13 | 7))) >> 3] = j8;
                return ~iFindFirstAvailableSlot;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
    }
}
