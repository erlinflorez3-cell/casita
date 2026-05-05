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
/* JADX INFO: compiled from: IntFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4C\u0007\":\u0012\u007f\u0007loA0RjP\u008cZS@\u000fs{:(c$\bCCU0}*\t]aogtOb\u000bQ\u0018\u000e\u0016~j4Ikxe\u0012\u00157JoM:UڎSʠ\u0011td\u0004`?2>\u007f\u0005\u000f\u001aBH>wټGK\u001a\u0014xF~>j\r{\n`\u0012NB.\u00076\\\u0016S~NzdR/Q\b0B\u00175m8\u0015M;G\u0005+\u001b\u007fy\u001eYA}5]3a\r\u001fR\n@3C\u007fH\u001dhU(qI<wDd\u0018\u0014C8\u007f\u0011k}>\\3R\u0011\u001659gi[R\u001e(&\b*\u001c\u0003ǐ\u0014ϳ&Ξv3(v \u000eay9S\t^\u0010oZ\u007f)ff\u001b3\u0012K+g\u001c-Q*I'aO{3\u0012N'\u000fn9[\u0003\u000f'\u0015cc\u0006eIQnBxR\u0018nUm2\u0007)̪2L?U\u0014G{?3G)EpQ#O\u0003HҍL0\u0006\u0013t\u0001S\u0018WxD0y.7X\nRɵL-\u0014ydlXZ\u0016} b\u001c\u0016\bA8#ʃDi4\u001eggh\u0018o}a\u0018?GfeX5\u008f\u0016 MlNMQ\u0012\u0015\u0012V\u0005\u001fW<\u0011\u0006\tjPo$Z\u000b5jNV\u0006(w*Q~\u0010!=WqJ5\\5'x-H1+rE\u000b&wZ\u0017\u001dG`AB\u001biRy9\u0005^v\to\u0016w\u00128\u000b\u007f:-oVe\u001d4`:hb}k\u001b\r\u0013\u0018G\u0016lwPz!\u000eU*!F\u001eGmG=A\u001cGM@#EEzw\u0016g[4?\r\r{\u001f;\u0017/w\nzpZmzL_TEB%\u00029׃\u000eݦ~ט*T\tk{T9`nM\u0001(q<|9C\u0004g,3'\b\"+:]G5D.wB0[a&\u0001}V\u0012b=+%i\u00127{\u0016\u001ec\u0002a@WPI\b\f\u0005д$5\u0007Pq\u0003w6CQK\u001b]`A\u0013u\u0007<[0G}\u0015\b\\\u0011~rs:A\u001bDұ406\u0002F\u0016\u0014\rD{ݑYϬkmuжŏ\u000bO\u0017\r\u0011֤a\u001d\u0011λAL"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.D:\u0005*3|}*X\u0019", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &(v\u00188\u0006\r1dS", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "5q^Dg/%W!\u0003\n", "/cYBf;,b#\fv`,", "", "1kT.e", "2q^=7,ES(~\t", "4h]190Ka(Z\fZ0\u0004\u0005,l\u007f\u0016\u0003J\u0010", "6`b5$", "4h]1<5LS&\u000e^g+|\u001c", "9dh", "5dc\u001ce\u0017Nb", "", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "7mXA\\(EW.~\\k6\u000f\u00182", "7mXA\\(EW.~b^;x\b+t{", "1`_.V0Mg", "7mXA\\(EW.~hm6\n\u00051e", ";h]Bf\bLa\u001d\u0001\u0004", "9dh@", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &.s\u001cKL", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &5o\u001d\u0012", "", ">kd@4:LW\u001b\b", "4q^:", ">tc", "D`[BX", "2dU.h3M", ">tc\u000e_3", "@d\\<i,", "", "@d\\<i,\"T", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "@d\\<i,/O \u000fz:;", "7mS2k", "@db6m,,b#\fv`,", "<df\u0010T7:Q\u001d\u000e\u000f", "Adc", "BqX:", "EqXAX\u0014>b\u0015}vm(", "", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableIntFloatMap extends IntFloatMap {
    private int growthLimit;

    public MutableIntFloatMap() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableIntFloatMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 + 1) - (i3 | 1) != 0 ? 6 : i2);
    }

    public MutableIntFloatMap(int i2) {
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
        this.values = new float[iMax];
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
        long j2 = 255 << (((-1) - (((-1) - i2) | ((-1) - 7))) << 3);
        jArr2[i4] = ((-1) - (((-1) - jArr2[i4]) | ((-1) - (~j2)))) | j2;
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    public final float getOrPut(int i2, Function0<Float> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(i2);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        float fFloatValue = defaultValue.invoke().floatValue();
        put(i2, fFloatValue);
        return fFloatValue;
    }

    public final void set(int i2, float f2) {
        int iFindInsertIndex = findInsertIndex(i2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = i2;
        this.values[iFindInsertIndex] = f2;
    }

    public final void put(int i2, float f2) {
        set(i2, f2);
    }

    public final float put(int i2, float f2, float f3) {
        int iFindInsertIndex = findInsertIndex(i2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        } else {
            f3 = this.values[iFindInsertIndex];
        }
        this.keys[iFindInsertIndex] = i2;
        this.values[iFindInsertIndex] = f2;
        return f3;
    }

    public final void plusAssign(IntFloatMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void remove(int i2) {
        int iFindKeyIndex = findKeyIndex(i2);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final boolean remove(int i2, float f2) {
        int iFindKeyIndex = findKeyIndex(i2);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != f2) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void removeIf(Function2<? super Integer, ? super Float, Boolean> predicate) {
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
                        if (predicate.invoke(Integer.valueOf(this.keys[i5]), Float.valueOf(this.values[i5])).booleanValue()) {
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
        long j2 = jArr[i4];
        long j3 = ~(255 << i5);
        long j4 = (-1) - (((-1) - ((j2 + j3) - (j2 | j3))) & ((-1) - (254 << i5)));
        jArr[i4] = j4;
        jArr[(((i2 - 7) & i3) + ((-1) - (((-1) - i3) | ((-1) - 7)))) >> 3] = j4;
    }

    public final void clear() {
        this._size = 0;
        if (this.metadata != ScatterMapKt.EmptyGroup) {
            ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr = this.metadata;
            int i2 = this._capacity;
            int i3 = i2 >> 3;
            long j2 = jArr[i3];
            long j3 = 255 << (((i2 + 7) - (i2 | 7)) << 3);
            long j4 = ~j3;
            jArr[i3] = ((j2 + j4) - (j2 | j4)) | j3;
        }
        initializeGrowth();
    }

    private final int findFirstAvailableSlot(int i2) {
        int i3 = this._capacity;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i6 = i4 >> 3;
            int i7 = ((i4 + 7) - (7 | i4)) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (-1) - (((-1) - (j2 & ((~j2) << 7))) | ((-1) - (-9187201950435737472L)));
            if (j3 != 0) {
                int iNumberOfTrailingZeros = i4 + (Long.numberOfTrailingZeros(j3) >> 3);
                return (iNumberOfTrailingZeros + i3) - (iNumberOfTrailingZeros | i3);
            }
            i5 += 8;
            i4 = (-1) - (((-1) - (i4 + i5)) | ((-1) - i3));
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
        float[] fArr = this.values;
        ScatterMapKt.convertMetadataForCleanup(jArr, i2);
        char c2 = 0;
        int i3 = 0;
        int iFindEmptySlot = -1;
        while (i3 != i2) {
            int i4 = i3 >> 3;
            int i5 = (7 & i3) << 3;
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
                    int i9 = ((iFindFirstAvailableSlot - i8) & i2) / 8;
                    int i10 = i3 - i8;
                    if (i9 == ((i10 + i2) - (i10 | i2)) / 8) {
                        jArr[i4] = (((long) (i6 & 127)) << i5) | ((-1) - (((-1) - (~(255 << i5))) | ((-1) - jArr[i4])));
                        jArr[ArraysKt.getLastIndex(jArr)] = (-1) - (((-1) - (jArr[c2] & 72057594037927935L)) & ((-1) - Long.MIN_VALUE));
                    } else {
                        int i11 = iFindFirstAvailableSlot >> 3;
                        long j3 = jArr[i11];
                        int i12 = ((iFindFirstAvailableSlot + 7) - (iFindFirstAvailableSlot | 7)) << 3;
                        long j4 = j3 >> i12;
                        if ((j4 + 255) - (j4 | 255) == 128) {
                            jArr[i11] = ((-1) - (((-1) - j3) | ((-1) - (~(255 << i12))))) | (((long) ((-1) - (((-1) - i6) | ((-1) - 127)))) << i12);
                            long j5 = jArr[i4] & (~(255 << i5));
                            long j6 = 128 << i5;
                            jArr[i4] = (j5 + j6) - (j5 & j6);
                            iArr[iFindFirstAvailableSlot] = iArr[i3];
                            iArr[i3] = 0;
                            fArr[iFindFirstAvailableSlot] = fArr[i3];
                            fArr[i3] = 0.0f;
                            iFindEmptySlot = i3;
                        } else {
                            jArr[i11] = (-1) - (((-1) - (((long) ((i6 + 127) - (i6 | 127))) << i12)) & ((-1) - ((-1) - (((-1) - j3) | ((-1) - (~(255 << i12)))))));
                            if (iFindEmptySlot == -1) {
                                iFindEmptySlot = ScatterMapKt.findEmptySlot(jArr, i3 + 1, i2);
                            }
                            iArr[iFindEmptySlot] = iArr[iFindFirstAvailableSlot];
                            iArr[iFindFirstAvailableSlot] = iArr[i3];
                            iArr[i3] = iArr[iFindEmptySlot];
                            fArr[iFindEmptySlot] = fArr[iFindFirstAvailableSlot];
                            fArr[iFindFirstAvailableSlot] = fArr[i3];
                            fArr[i3] = fArr[iFindEmptySlot];
                            i3--;
                        }
                        c2 = 0;
                        jArr[ArraysKt.getLastIndex(jArr)] = ((-1) - (((-1) - jArr[0]) | ((-1) - 72057594037927935L))) | Long.MIN_VALUE;
                        i3++;
                    }
                }
                i3++;
            }
        }
        initializeGrowth();
    }

    private final void resizeStorage(int i2) {
        MutableIntFloatMap mutableIntFloatMap = this;
        long[] jArr = mutableIntFloatMap.metadata;
        int[] iArr = mutableIntFloatMap.keys;
        float[] fArr = mutableIntFloatMap.values;
        int i3 = mutableIntFloatMap._capacity;
        initializeStorage(i2);
        long[] jArr2 = mutableIntFloatMap.metadata;
        int[] iArr2 = mutableIntFloatMap.keys;
        float[] fArr2 = mutableIntFloatMap.values;
        int i4 = mutableIntFloatMap._capacity;
        int i5 = 0;
        while (i5 < i3) {
            if ((-1) - (((-1) - (jArr[i5 >> 3] >> (((i5 + 7) - (7 | i5)) << 3))) | ((-1) - 255)) < 128) {
                int i6 = iArr[i5];
                int iHashCode = Integer.hashCode(i6) * ScatterMapKt.MurmurHashC1;
                int i7 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableIntFloatMap.findFirstAvailableSlot(i7 >>> 7);
                int i8 = iFindFirstAvailableSlot >> 3;
                int i9 = (iFindFirstAvailableSlot & 7) << 3;
                long j2 = jArr2[i8];
                long j3 = ~(255 << i9);
                long j4 = ((j2 + j3) - (j2 | j3)) | (((long) (i7 & 127)) << i9);
                jArr2[i8] = j4;
                jArr2[(((iFindFirstAvailableSlot - 7) & i4) + (7 & i4)) >> 3] = j4;
                iArr2[iFindFirstAvailableSlot] = i6;
                fArr2[iFindFirstAvailableSlot] = fArr[i5];
            }
            i5++;
            mutableIntFloatMap = this;
        }
    }

    private final void writeMetadata(int i2, long j2) {
        long[] jArr = this.metadata;
        int i3 = i2 >> 3;
        int i4 = ((-1) - (((-1) - i2) | ((-1) - 7))) << 3;
        long j3 = jArr[i3] & (~(255 << i4));
        long j4 = j2 << i4;
        jArr[i3] = (j3 + j4) - (j3 & j4);
        int i5 = this._capacity;
        int i6 = ((-1) - (((-1) - (i2 - 7)) | ((-1) - i5))) + (i5 & 7);
        int i7 = i6 >> 3;
        int i8 = (i6 & 7) << 3;
        jArr[i7] = (-1) - (((-1) - (j2 << i8)) & ((-1) - (jArr[i7] & (~(255 << i8)))));
    }

    public final void putAll(IntFloatMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        int[] iArr = from.keys;
        float[] fArr = from.values;
        long[] jArr = from.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            long j3 = (~j2) << 7;
            if ((((j3 + j2) - (j3 | j2)) & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        set(iArr[i5], fArr[i5]);
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
            if ((-1) - (((-1) - ((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2)))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
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
        int i5 = i3 & 127;
        int i6 = this._capacity;
        int i7 = (-1) - (((-1) - i4) | ((-1) - i6));
        int i8 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i9 = i7 >> 3;
            int i10 = ((i7 + 7) - (i7 | 7)) << 3;
            long j2 = jArr[i9] >>> i10;
            long j3 = jArr[i9 + 1] << (64 - i10);
            long j4 = (-i10) >> 63;
            long j5 = (j3 + j4) - (j3 | j4);
            long j6 = (j5 + j2) - (j5 & j2);
            long j7 = i5;
            long j8 = j6 ^ (j7 * ScatterMapKt.BitmaskLsb);
            long j9 = j8 - ScatterMapKt.BitmaskLsb;
            long j10 = ~j8;
            long j11 = ((j10 + j9) - (j10 | j9)) & (-9187201950435737472L);
            while (j11 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i7) & i6;
                if (this.keys[iNumberOfTrailingZeros] == i2) {
                    return iNumberOfTrailingZeros;
                }
                long j12 = j11 - 1;
                j11 = (j11 + j12) - (j11 | j12);
            }
            if ((((-1) - (((-1) - ((~j6) << 6)) | ((-1) - j6))) & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i4);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> (((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3)) & 255) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i4);
                }
                this._size++;
                int i11 = this.growthLimit;
                int i12 = iFindFirstAvailableSlot >> 3;
                int i13 = ((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3;
                long j13 = this.metadata[i12] >> i13;
                this.growthLimit = i11 - ((j13 + 255) - (j13 | 255) != 128 ? 0 : 1);
                long[] jArr2 = this.metadata;
                int i14 = this._capacity;
                long j14 = jArr2[i12];
                long j15 = ~(255 << i13);
                long j16 = ((j15 + j14) - (j15 | j14)) | (j7 << i13);
                jArr2[i12] = j16;
                jArr2[(((iFindFirstAvailableSlot - 7) & i14) + ((i14 + 7) - (i14 | 7))) >> 3] = j16;
                return ~iFindFirstAvailableSlot;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
    }
}
