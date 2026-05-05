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
/* JADX INFO: compiled from: LongLongMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4C\u0007\":\u0012\u007f\u0007lnA0RlP.XS2\u000f\u0002{<$a(yCQU\"}8\tWNu{vJ`\u0010K\u000f\u0014\u001f\u0001j2I]xs\u0012\u00172HuU\u074c}ok8!\u0002F\u000b&208\u0012\u0005/\u001bݵL\u0010\u0005|\fQ\u001a\u0016H@\u001f?\u0019\r\u0016\t(\u0018\u001e>N\u0006fbuUNH\u001bb\u0001/k\u0011wJf'\u000e1-Q\u001bOl';w(\u001esNE?-%\u0002\u00047ViJ\u001b? IKhoG9V\fWdd0\u0018#6g\r\f~Vf\u0013_x\u00127-_cy\\<7>߅\u0002ʗ;ǉV\f5XF-HkN\u000e{\u0003\u0001dXP0cr\u0004\tsN\u0017S\u0001y+\u0002)tdy;GSg\u007f\u0013\r6#/og[\u001d\u001dn)3T&VaUNR`N8o\u0004Ю\f9q\u0010>\u001c0u\u0005_\u007f\u001fC/%er\u007f\u0601)4\u0011VX\u007fv3e\u0019Ww]`@Pz\\պ2Q\u001bhX|\u0005\u001aU\u0005\\:&e\u001c\u0003\u001fDܸ\u001bhk\u0006U9%>S\u007flw\u0005e]8$uϐ?\"\u0003y)o9\r8eUq\u001byR% o@p!pfp_TvjC:2vv@{\nOf\fA>ou*PD1GhEL\u0011;ZA+\u0015(fv.\u0017Ta)3m2\u000f!\u0001~[9{u\u0018a,+eR1O\\M\u0019Taj|B\u001c;\u0007-\u00140KuW_L\u001b\"&Y\n<.\u001ag]wa!0\u0017)`\u0007][Z\u0015}c]\u00147z+\u0006\u001f=x.\u0016\u0014zr<`\u0019j}w]Ǹ|ޞqּPr\u000e\u001eyF)L\u0014X\u0019\u0001VI!\u0004 ;\u0017F\u000b+7\u001eS\u0006 &\u000b\\ECU\u001e\\w\\F#\nui\u001e3*f\u001d1\re28\u0014\u001a}~i]`G~ՅYGB0M\u0005\u0003pI3\u000f\u0016l!4;8xEr\u0016n8{\f_\u0002t#D\r\u001fb\"ƨ\u0019@\nB1w*\"DTйjǜ)\u0011Uω܍mrS_\u0011\u0381?8\nֳ5\u001a"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<]/>[d*@o}*X\u0019", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! IV\u0018Ex\r1dS", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "5q^Dg/%W!\u0003\n", "/cYBf;,b#\fv`,", "", "1kT.e", "2q^=7,ES(~\t", "4h]190Ka(Z\fZ0\u0004\u0005,l\u007f\u0016\u0003J\u0010", "6`b5$", "4h]1<5LS&\u000e^g+|\u001c", "9dh", "", "5dc\u001ce\u0017Nb", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "7mXA\\(EW.~\\k6\u000f\u00182", "7mXA\\(EW.~b^;x\b+t{", "1`_.V0Mg", "7mXA\\(EW.~hm6\n\u00051e", ";h]Bf\bLa\u001d\u0001\u0004", "9dh@", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! IV\u0012J\u0006z", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! I]\u000eKL", "", ">kd@4:LW\u001b\b", "4q^:", ">tc", "D`[BX", "2dU.h3M", ">tc\u000e_3", "@d\\<i,", "", "@d\\<i,\"T", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "@d\\<i,/O \u000fz:;", "7mS2k", "@db6m,,b#\fv`,", "<df\u0010T7:Q\u001d\u000e\u000f", "Adc", "BqX:", "EqXAX\u0014>b\u0015}vm(", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableLongLongMap extends LongLongMap {
    private int growthLimit;

    public MutableLongLongMap() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableLongLongMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 + 1) - (i3 | 1) != 0 ? 6 : i2);
    }

    public MutableLongLongMap(int i2) {
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
        this.keys = new long[iMax];
        this.values = new long[iMax];
    }

    private final void initializeMetadata(int i2) {
        long[] jArr;
        if (i2 == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            int i3 = i2 + 15;
            jArr = new long[((i3 - 8) - (i3 | (-8))) >> 3];
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.metadata = jArr;
        long[] jArr2 = this.metadata;
        int i4 = i2 >> 3;
        long j2 = jArr2[i4];
        long j3 = 255 << (((-1) - (((-1) - i2) | ((-1) - 7))) << 3);
        long j4 = ~j3;
        long j5 = (j2 + j4) - (j2 | j4);
        jArr2[i4] = (j5 + j3) - (j5 & j3);
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    public final long getOrPut(long j2, Function0<Long> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(j2);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        long jLongValue = defaultValue.invoke().longValue();
        put(j2, jLongValue);
        return jLongValue;
    }

    public final void set(long j2, long j3) {
        int iFindInsertIndex = findInsertIndex(j2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = j2;
        this.values[iFindInsertIndex] = j3;
    }

    public final void put(long j2, long j3) {
        set(j2, j3);
    }

    public final long put(long j2, long j3, long j4) {
        int iFindInsertIndex = findInsertIndex(j2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        } else {
            j4 = this.values[iFindInsertIndex];
        }
        this.keys[iFindInsertIndex] = j2;
        this.values[iFindInsertIndex] = j3;
        return j4;
    }

    public final void plusAssign(LongLongMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void remove(long j2) {
        int iFindKeyIndex = findKeyIndex(j2);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final boolean remove(long j2, long j3) {
        int iFindKeyIndex = findKeyIndex(j2);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != j3) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void removeIf(Function2<? super Long, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((-1) - (((-1) - ((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2)))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 + j2) - (255 | j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (predicate.invoke(Long.valueOf(this.keys[i5]), Long.valueOf(this.values[i5])).booleanValue()) {
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

    public final void minusAssign(long j2) {
        remove(j2);
    }

    public final void minusAssign(long[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (long j2 : keys) {
            remove(j2);
        }
    }

    public final void removeValueAt(int i2) {
        this._size--;
        long[] jArr = this.metadata;
        int i3 = this._capacity;
        int i4 = i2 >> 3;
        int i5 = ((-1) - (((-1) - i2) | ((-1) - 7))) << 3;
        long j2 = (-1) - (((-1) - jArr[i4]) | ((-1) - (~(255 << i5))));
        long j3 = 254 << i5;
        long j4 = (j2 + j3) - (j2 & j3);
        jArr[i4] = j4;
        jArr[(((-1) - (((-1) - (i2 - 7)) | ((-1) - i3))) + ((-1) - (((-1) - i3) | ((-1) - 7)))) >> 3] = j4;
    }

    public final void clear() {
        this._size = 0;
        if (this.metadata != ScatterMapKt.EmptyGroup) {
            ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr = this.metadata;
            int i2 = this._capacity;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr[i3] = (jArr[i3] & (~j2)) | j2;
        }
        initializeGrowth();
    }

    private final int findFirstAvailableSlot(int i2) {
        int i3 = this._capacity;
        int i4 = (-1) - (((-1) - i2) | ((-1) - i3));
        int i5 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = (-1) - (((-1) - ((-1) - (((-1) - (jArr[i6 + 1] << (64 - i7))) | ((-1) - ((-i7) >> 63))))) & ((-1) - (jArr[i6] >>> i7)));
            long j3 = (~j2) << 7;
            long j4 = (j2 + j3) - (j2 | j3);
            long j5 = (j4 - 9187201950435737472L) - (j4 | (-9187201950435737472L));
            if (j5 != 0) {
                return (-1) - (((-1) - (i4 + (Long.numberOfTrailingZeros(j5) >> 3))) | ((-1) - i3));
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
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
        long[] jArr2 = this.keys;
        long[] jArr3 = this.values;
        ScatterMapKt.convertMetadataForCleanup(jArr, i2);
        char c2 = 0;
        int i3 = 0;
        int iFindEmptySlot = -1;
        while (i3 != i2) {
            int i4 = i3 >> 3;
            int i5 = ((-1) - (((-1) - i3) | ((-1) - 7))) << 3;
            long j2 = jArr[i4] >> i5;
            long j3 = (j2 + 255) - (j2 | 255);
            if (j3 == 128) {
                iFindEmptySlot = i3;
                i3++;
            } else {
                if (j3 == 254) {
                    int iHashCode = Long.hashCode(jArr2[i3]) * ScatterMapKt.MurmurHashC1;
                    int i6 = iHashCode ^ (iHashCode << 16);
                    int i7 = i6 >>> 7;
                    int iFindFirstAvailableSlot = findFirstAvailableSlot(i7);
                    int i8 = (i7 + i2) - (i7 | i2);
                    int i9 = ((iFindFirstAvailableSlot - i8) & i2) / 8;
                    int i10 = i3 - i8;
                    if (i9 == ((i10 + i2) - (i10 | i2)) / 8) {
                        long j4 = jArr[i4];
                        long j5 = ~(255 << i5);
                        jArr[i4] = (((long) ((-1) - (((-1) - i6) | ((-1) - 127)))) << i5) | ((j5 + j4) - (j5 | j4));
                        int lastIndex = ArraysKt.getLastIndex(jArr);
                        long j6 = jArr[c2];
                        jArr[lastIndex] = ((j6 + 72057594037927935L) - (j6 | 72057594037927935L)) | Long.MIN_VALUE;
                    } else {
                        int i11 = iFindFirstAvailableSlot >> 3;
                        long j7 = jArr[i11];
                        int i12 = ((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3;
                        long j8 = j7 >> i12;
                        if ((j8 + 255) - (j8 | 255) != 128) {
                            jArr[i11] = (((long) ((i6 + 127) - (i6 | 127))) << i12) | ((-1) - (((-1) - j7) | ((-1) - (~(255 << i12)))));
                            if (iFindEmptySlot == -1) {
                                iFindEmptySlot = ScatterMapKt.findEmptySlot(jArr, i3 + 1, i2);
                            }
                            jArr2[iFindEmptySlot] = jArr2[iFindFirstAvailableSlot];
                            jArr2[iFindFirstAvailableSlot] = jArr2[i3];
                            jArr2[i3] = jArr2[iFindEmptySlot];
                            jArr3[iFindEmptySlot] = jArr3[iFindFirstAvailableSlot];
                            jArr3[iFindFirstAvailableSlot] = jArr3[i3];
                            jArr3[i3] = jArr3[iFindEmptySlot];
                            i3--;
                        } else {
                            jArr[i11] = ((-1) - (((-1) - j7) | ((-1) - (~(255 << i12))))) | (((long) ((i6 + 127) - (i6 | 127))) << i12);
                            jArr[i4] = ((-1) - (((-1) - jArr[i4]) | ((-1) - (~(255 << i5))))) | (128 << i5);
                            jArr2[iFindFirstAvailableSlot] = jArr2[i3];
                            jArr2[i3] = 0;
                            jArr3[iFindFirstAvailableSlot] = jArr3[i3];
                            jArr3[i3] = 0;
                            iFindEmptySlot = i3;
                        }
                        int lastIndex2 = ArraysKt.getLastIndex(jArr);
                        c2 = 0;
                        long j9 = jArr[0];
                        jArr[lastIndex2] = (-1) - (((-1) - ((j9 + 72057594037927935L) - (j9 | 72057594037927935L))) & ((-1) - Long.MIN_VALUE));
                        i3++;
                    }
                }
                i3++;
            }
        }
        initializeGrowth();
    }

    private final void resizeStorage(int i2) {
        MutableLongLongMap mutableLongLongMap = this;
        long[] jArr = mutableLongLongMap.metadata;
        long[] jArr2 = mutableLongLongMap.keys;
        long[] jArr3 = mutableLongLongMap.values;
        int i3 = mutableLongLongMap._capacity;
        initializeStorage(i2);
        long[] jArr4 = mutableLongLongMap.metadata;
        long[] jArr5 = mutableLongLongMap.keys;
        long[] jArr6 = mutableLongLongMap.values;
        int i4 = mutableLongLongMap._capacity;
        int i5 = 0;
        while (i5 < i3) {
            if ((-1) - (((-1) - (jArr[i5 >> 3] >> (((i5 + 7) - (7 | i5)) << 3))) | ((-1) - 255)) < 128) {
                long j2 = jArr2[i5];
                int iHashCode = Long.hashCode(j2) * ScatterMapKt.MurmurHashC1;
                int i6 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableLongLongMap.findFirstAvailableSlot(i6 >>> 7);
                int i7 = iFindFirstAvailableSlot >> 3;
                int i8 = (iFindFirstAvailableSlot & 7) << 3;
                long j3 = (-1) - (((-1) - (jArr4[i7] & (~(255 << i8)))) & ((-1) - (((long) ((i6 + 127) - (i6 | 127))) << i8)));
                jArr4[i7] = j3;
                jArr4[(((iFindFirstAvailableSlot - 7) & i4) + ((i4 + 7) - (7 | i4))) >> 3] = j3;
                jArr5[iFindFirstAvailableSlot] = j2;
                jArr6[iFindFirstAvailableSlot] = jArr3[i5];
            }
            i5++;
            mutableLongLongMap = this;
        }
    }

    private final void writeMetadata(int i2, long j2) {
        long[] jArr = this.metadata;
        int i3 = i2 >> 3;
        int i4 = ((-1) - (((-1) - i2) | ((-1) - 7))) << 3;
        long j3 = jArr[i3];
        long j4 = ~(255 << i4);
        jArr[i3] = (-1) - (((-1) - ((j3 + j4) - (j3 | j4))) & ((-1) - (j2 << i4)));
        int i5 = this._capacity;
        int i6 = i2 - 7;
        int i7 = ((i6 + i5) - (i6 | i5)) + (i5 & 7);
        int i8 = i7 >> 3;
        int i9 = ((-1) - (((-1) - i7) | ((-1) - 7))) << 3;
        long j5 = (-1) - (((-1) - jArr[i8]) | ((-1) - (~(255 << i9))));
        long j6 = j2 << i9;
        jArr[i8] = (j6 + j5) - (j6 & j5);
    }

    public final void putAll(LongLongMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        long[] jArr = from.keys;
        long[] jArr2 = from.values;
        long[] jArr3 = from.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr3[i2];
            long j3 = (-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2));
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 + j2) - (255 | j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        set(jArr[i5], jArr2[i5]);
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

    public final void minusAssign(LongSet keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        long[] jArr = keys.elements;
        long[] jArr2 = keys.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr2[i2];
            if ((-1) - (((-1) - (((~j2) << 7) & j2)) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 + j2) - (255 | j2) < 128) {
                        remove(jArr[(i2 << 3) + i4]);
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

    public final void minusAssign(LongList keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        long[] jArr = keys.content;
        int i2 = keys._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(jArr[i3]);
        }
    }

    private final int findInsertIndex(long j2) {
        int iHashCode = Long.hashCode(j2) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = (-1) - (((-1) - i2) | ((-1) - 127));
        int i5 = this._capacity;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = ((i6 + 7) - (i6 | 7)) << 3;
            long j3 = jArr[i8] >>> i9;
            long j4 = jArr[i8 + 1] << (64 - i9);
            long j5 = (-i9) >> 63;
            long j6 = ((j4 + j5) - (j4 | j5)) | j3;
            long j7 = i4;
            long j8 = j6 ^ (j7 * ScatterMapKt.BitmaskLsb);
            long j9 = (~j8) & (j8 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L);
            while (j9 != 0) {
                int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(j9) >> 3) + i6;
                int i10 = (iNumberOfTrailingZeros + i5) - (iNumberOfTrailingZeros | i5);
                if (this.keys[i10] == j2) {
                    return i10;
                }
                long j10 = j9 - 1;
                j9 = (j9 + j10) - (j9 | j10);
            }
            long j11 = (-1) - (((-1) - ((~j6) << 6)) | ((-1) - j6));
            if ((j11 - 9187201950435737472L) - (j11 | (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                if (this.growthLimit == 0) {
                    long j12 = this.metadata[iFindFirstAvailableSlot >> 3] >> (((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3);
                    if ((j12 + 255) - (j12 | 255) != 254) {
                        adjustStorage();
                        iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                    }
                }
                this._size++;
                int i11 = iFindFirstAvailableSlot >> 3;
                int i12 = ((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3;
                this.growthLimit -= (-1) - (((-1) - (this.metadata[i11] >> i12)) | ((-1) - 255)) != 128 ? 0 : 1;
                long[] jArr2 = this.metadata;
                int i13 = this._capacity;
                long j13 = (-1) - (((-1) - (~(255 << i12))) | ((-1) - jArr2[i11]));
                long j14 = j7 << i12;
                long j15 = (j13 + j14) - (j13 & j14);
                jArr2[i11] = j15;
                int i14 = iFindFirstAvailableSlot - 7;
                jArr2[(((i14 + i13) - (i14 | i13)) + ((i13 + 7) - (i13 | 7))) >> 3] = j15;
                return ~iFindFirstAvailableSlot;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }
}
