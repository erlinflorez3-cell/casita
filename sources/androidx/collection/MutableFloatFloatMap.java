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
/* JADX INFO: compiled from: FloatFloatMap.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4C\u0007\":\u0012\u007f\u0007lnA0RjP.XS2\u000f\u0002{<$a(yCQU\"}8\tWNuyvJ`\u0010K\u000f\u0014\u001f\u0001j2I]xs\u0012\u00172HtG3[vEʠvҚf\u0005N1bE\n\u000b\u0007\u001a8H(v)Dƚ\u0010\u0012>B9@`\u0011e\u0005H\u0017L>h\u0005,b\u007fNdM5cH6;\u0003\u0018G\u0015'(>\u000bU%F\u0003(=zo'C@e6[%\u001c\u0011\u0015\\s?1@\"A\u0013s?'YU:W~x\u000e!-+}\u0019\u000ev4g\u001dQ\u000f\u0018W5]qcV\u001e*\bz*\u0019j\u0013T\u0381-З-Ʀbl\u0016\u001eKt!X\u0007PJlP\u0011\u0013ad\u001cU\u0004A=Q\u001b\u0015R(;a\\E\u000f\u001d\rL(1r/[l\u000e\u000f\u0016aT@`?eX=vS:]K\u0003\u001cp\u0011\u0018pʽ8\u0010\u000f=\u0010).E*g_G89k0_\u000bϠ~Movg\u0002RvERr$BB\t:f\u000bߦ\r4_blD\u0011{!\u0005\u000b\f\u001d+ \u000b\u0010\u0003Ơ-X]]\u0002\u0002j{b:)=\u0001OY\u001djTêA'GCl{\u0010\u0010W'\u0018MGz\u0005\u0007rrW\u001avt(P>\u0011\u0007\u001e\u0013\u0014D|\u0018C6M|44Z=I`#d\u001b\u001epM-\rmw\u0001\u0010-`{0\u0011\b<t7\u0006\u0001`~\n\u007fxw+El0LYQc\u001eVY0sL|Q\u0013G\b\u000ef\u007fLul\u001d\u001a\u0004`\u0014 D&iU=Y+\u000f-5z&;fdr\u0014V}(5\u001d\u0015\f\u001f=x.\u0016\u0014zr<`\u0019V_V'\"%~!FN۴\u0006ّ`¿CUqx#[lN#\u0007gaf8+\u0006e\u001dm\u000f}H\u00155[HW!$\u001f,/Cb$i8E\b\u000b'&#j40q!\bb\u007fib?Feq~l.jО\u0003\u000bLx! B75UJVk|p\u0005=}\u000f=#~\u0007Z\u000e!ZiV+o,_tʁ0DO\f\u0017vCS\u0012$όsƽqKd֥ͪ\u000f\u000f\u0013~7߅BJ<֛Z\u0004"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<W,?U\r\u0001>w\u0012=5?FA", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\na\u001e!C~nC\u0001!DAy+\r", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "5q^Dg/%W!\u0003\n", "/cYBf;,b#\fv`,", "", "1kT.e", "2q^=7,ES(~\t", "4h]190Ka(Z\fZ0\u0004\u0005,l\u007f\u0016\u0003J\u0010", "6`b5$", "4h]1<5LS&\u000e^g+|\u001c", "9dh", "", "5dc\u001ce\u0017Nb", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "7mXA\\(EW.~\\k6\u000f\u00182", "7mXA\\(EW.~b^;x\b+t{", "1`_.V0Mg", "7mXA\\(EW.~hm6\n\u00051e", ";h]Bf\bLa\u001d\u0001\u0004", "9dh@", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\na\u001e!C~t@\u00054\u000b", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\na\u001e!C~{<\u0006z", "", ">kd@4:LW\u001b\b", "4q^:", ">tc", "D`[BX", "2dU.h3M", ">tc\u000e_3", "@d\\<i,", "", "@d\\<i,\"T", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "@d\\<i,/O \u000fz:;", "7mS2k", "@db6m,,b#\fv`,", "<df\u0010T7:Q\u001d\u000e\u000f", "Adc", "BqX:", "EqXAX\u0014>b\u0015}vm(", "", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableFloatFloatMap extends FloatFloatMap {
    private int growthLimit;

    public MutableFloatFloatMap() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableFloatFloatMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 + 1) - (i3 | 1) != 0 ? 6 : i2);
    }

    public MutableFloatFloatMap(int i2) {
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
        this.keys = new float[iMax];
        this.values = new float[iMax];
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
        long j2 = 255 << (((-1) - (((-1) - i2) | ((-1) - 7))) << 3);
        jArr2[i3] = (-1) - (((-1) - ((-1) - (((-1) - jArr2[i3]) | ((-1) - (~j2))))) & ((-1) - j2));
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    public final float getOrPut(float f2, Function0<Float> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(f2);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        float fFloatValue = defaultValue.invoke().floatValue();
        put(f2, fFloatValue);
        return fFloatValue;
    }

    public final void set(float f2, float f3) {
        int iFindInsertIndex = findInsertIndex(f2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = f2;
        this.values[iFindInsertIndex] = f3;
    }

    public final void put(float f2, float f3) {
        set(f2, f3);
    }

    public final float put(float f2, float f3, float f4) {
        int iFindInsertIndex = findInsertIndex(f2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        } else {
            f4 = this.values[iFindInsertIndex];
        }
        this.keys[iFindInsertIndex] = f2;
        this.values[iFindInsertIndex] = f3;
        return f4;
    }

    public final void plusAssign(FloatFloatMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void remove(float f2) {
        int iFindKeyIndex = findKeyIndex(f2);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final boolean remove(float f2, float f3) {
        int iFindKeyIndex = findKeyIndex(f2);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != f3) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void removeIf(Function2<? super Float, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((-1) - (((-1) - (((~j2) << 7) & j2)) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (predicate.invoke(Float.valueOf(this.keys[i5]), Float.valueOf(this.values[i5])).booleanValue()) {
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

    public final void minusAssign(float f2) {
        remove(f2);
    }

    public final void minusAssign(float[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (float f2 : keys) {
            remove(f2);
        }
    }

    public final void removeValueAt(int i2) {
        this._size--;
        long[] jArr = this.metadata;
        int i3 = this._capacity;
        int i4 = i2 >> 3;
        int i5 = (7 & i2) << 3;
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
            long j2 = 255 << ((i2 & 7) << 3);
            jArr[i3] = ((-1) - (((-1) - jArr[i3]) | ((-1) - (~j2)))) | j2;
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
            int i7 = (7 & i4) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (~j2) << 7;
            long j4 = (j2 + j3) - (j2 | j3);
            long j5 = (j4 - 9187201950435737472L) - (j4 | (-9187201950435737472L));
            if (j5 != 0) {
                return (i4 + (Long.numberOfTrailingZeros(j5) >> 3)) & i3;
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
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                    int iHashCode = Float.hashCode(fArr[i3]) * ScatterMapKt.MurmurHashC1;
                    int i6 = iHashCode ^ (iHashCode << 16);
                    int i7 = i6 >>> 7;
                    int iFindFirstAvailableSlot = findFirstAvailableSlot(i7);
                    int i8 = (i7 + i2) - (i7 | i2);
                    int i9 = iFindFirstAvailableSlot - i8;
                    if (((i9 + i2) - (i9 | i2)) / 8 == ((i3 - i8) & i2) / 8) {
                        jArr[i4] = (-1) - (((-1) - (((long) ((-1) - (((-1) - i6) | ((-1) - 127)))) << i5)) & ((-1) - ((-1) - (((-1) - (~(255 << i5))) | ((-1) - jArr[i4])))));
                        int lastIndex = ArraysKt.getLastIndex(jArr);
                        long j3 = jArr[c2];
                        long j4 = (j3 + 72057594037927935L) - (j3 | 72057594037927935L);
                        jArr[lastIndex] = (j4 - Long.MIN_VALUE) - (j4 & Long.MIN_VALUE);
                    } else {
                        int i10 = iFindFirstAvailableSlot >> 3;
                        long j5 = jArr[i10];
                        int i11 = (iFindFirstAvailableSlot & 7) << 3;
                        if ((-1) - (((-1) - (j5 >> i11)) | ((-1) - 255)) != 128) {
                            jArr[i10] = (((long) ((-1) - (((-1) - i6) | ((-1) - 127)))) << i11) | ((-1) - (((-1) - j5) | ((-1) - (~(255 << i11)))));
                            if (iFindEmptySlot == -1) {
                                iFindEmptySlot = ScatterMapKt.findEmptySlot(jArr, i3 + 1, i2);
                            }
                            fArr[iFindEmptySlot] = fArr[iFindFirstAvailableSlot];
                            fArr[iFindFirstAvailableSlot] = fArr[i3];
                            fArr[i3] = fArr[iFindEmptySlot];
                            fArr2[iFindEmptySlot] = fArr2[iFindFirstAvailableSlot];
                            fArr2[iFindFirstAvailableSlot] = fArr2[i3];
                            fArr2[i3] = fArr2[iFindEmptySlot];
                            i3--;
                        } else {
                            long j6 = (-1) - (((-1) - j5) | ((-1) - (~(255 << i11))));
                            long j7 = ((long) (i6 & 127)) << i11;
                            jArr[i10] = (j6 + j7) - (j6 & j7);
                            jArr[i4] = (-1) - (((-1) - (jArr[i4] & (~(255 << i5)))) & ((-1) - (128 << i5)));
                            fArr[iFindFirstAvailableSlot] = fArr[i3];
                            fArr[i3] = 0.0f;
                            fArr2[iFindFirstAvailableSlot] = fArr2[i3];
                            fArr2[i3] = 0.0f;
                            iFindEmptySlot = i3;
                        }
                        int lastIndex2 = ArraysKt.getLastIndex(jArr);
                        c2 = 0;
                        long j8 = jArr[0];
                        jArr[lastIndex2] = (-1) - (((-1) - ((j8 + 72057594037927935L) - (j8 | 72057594037927935L))) & ((-1) - Long.MIN_VALUE));
                        i3++;
                    }
                }
                i3++;
            }
        }
        initializeGrowth();
    }

    private final void resizeStorage(int i2) {
        MutableFloatFloatMap mutableFloatFloatMap = this;
        long[] jArr = mutableFloatFloatMap.metadata;
        float[] fArr = mutableFloatFloatMap.keys;
        float[] fArr2 = mutableFloatFloatMap.values;
        int i3 = mutableFloatFloatMap._capacity;
        initializeStorage(i2);
        long[] jArr2 = mutableFloatFloatMap.metadata;
        float[] fArr3 = mutableFloatFloatMap.keys;
        float[] fArr4 = mutableFloatFloatMap.values;
        int i4 = mutableFloatFloatMap._capacity;
        int i5 = 0;
        while (i5 < i3) {
            if (((jArr[i5 >> 3] >> (((i5 + 7) - (7 | i5)) << 3)) & 255) < 128) {
                float f2 = fArr[i5];
                int iHashCode = Float.hashCode(f2) * ScatterMapKt.MurmurHashC1;
                int i6 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableFloatFloatMap.findFirstAvailableSlot(i6 >>> 7);
                int i7 = iFindFirstAvailableSlot >> 3;
                int i8 = ((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3;
                long j2 = (-1) - (((-1) - jArr2[i7]) | ((-1) - (~(255 << i8))));
                long j3 = ((long) (i6 & 127)) << i8;
                long j4 = (j2 + j3) - (j2 & j3);
                jArr2[i7] = j4;
                jArr2[(((iFindFirstAvailableSlot - 7) & i4) + ((-1) - (((-1) - i4) | ((-1) - 7)))) >> 3] = j4;
                fArr3[iFindFirstAvailableSlot] = f2;
                fArr4[iFindFirstAvailableSlot] = fArr2[i5];
            }
            i5++;
            mutableFloatFloatMap = this;
        }
    }

    private final void writeMetadata(int i2, long j2) {
        long[] jArr = this.metadata;
        int i3 = i2 >> 3;
        int i4 = (7 & i2) << 3;
        long j3 = jArr[i3];
        long j4 = ~(255 << i4);
        jArr[i3] = ((j3 + j4) - (j3 | j4)) | (j2 << i4);
        int i5 = this._capacity;
        int i6 = ((i2 - 7) & i5) + ((-1) - (((-1) - i5) | ((-1) - 7)));
        int i7 = i6 >> 3;
        int i8 = ((i6 + 7) - (i6 | 7)) << 3;
        jArr[i7] = (j2 << i8) | ((-1) - (((-1) - jArr[i7]) | ((-1) - (~(255 << i8)))));
    }

    public final void putAll(FloatFloatMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        float[] fArr = from.keys;
        float[] fArr2 = from.values;
        long[] jArr = from.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        set(fArr[i5], fArr2[i5]);
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

    public final void minusAssign(FloatSet keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        float[] fArr = keys.elements;
        long[] jArr = keys.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            long j3 = (~j2) << 7;
            if ((-1) - (((-1) - ((j3 + j2) - (j3 | j2))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                        remove(fArr[(i2 << 3) + i4]);
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

    public final void minusAssign(FloatList keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        float[] fArr = keys.content;
        int i2 = keys._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(fArr[i3]);
        }
    }

    private final int findInsertIndex(float f2) {
        int iHashCode = Float.hashCode(f2) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = (i2 + 127) - (i2 | 127);
        int i5 = this._capacity;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = ((i6 + 7) - (i6 | 7)) << 3;
            long j2 = jArr[i8] >>> i9;
            long j3 = jArr[i8 + 1] << (64 - i9);
            long j4 = (-i9) >> 63;
            long j5 = (j3 + j4) - (j3 | j4);
            long j6 = (j5 + j2) - (j5 & j2);
            long j7 = i4;
            long j8 = j6 ^ (j7 * ScatterMapKt.BitmaskLsb);
            long j9 = j8 - ScatterMapKt.BitmaskLsb;
            long j10 = ~j8;
            long j11 = ((j10 + j9) - (j10 | j9)) & (-9187201950435737472L);
            while (j11 != 0) {
                int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(j11) >> 3) + i6;
                int i10 = (iNumberOfTrailingZeros + i5) - (iNumberOfTrailingZeros | i5);
                if (this.keys[i10] == f2) {
                    return i10;
                }
                long j12 = j11 - 1;
                j11 = (j11 + j12) - (j11 | j12);
            }
            if ((-1) - (((-1) - (((~j6) << 6) & j6)) | ((-1) - (-9187201950435737472L))) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                if (this.growthLimit == 0 && (-1) - (((-1) - (this.metadata[iFindFirstAvailableSlot >> 3] >> ((7 & iFindFirstAvailableSlot) << 3))) | ((-1) - 255)) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                }
                this._size++;
                int i11 = this.growthLimit;
                int i12 = iFindFirstAvailableSlot >> 3;
                int i13 = ((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3;
                long j13 = this.metadata[i12] >> i13;
                this.growthLimit = i11 - ((j13 + 255) - (j13 | 255) != 128 ? 0 : 1);
                long[] jArr2 = this.metadata;
                int i14 = this._capacity;
                long j14 = (-1) - (((-1) - ((-1) - (((-1) - (~(255 << i13))) | ((-1) - jArr2[i12])))) & ((-1) - (j7 << i13)));
                jArr2[i12] = j14;
                int i15 = iFindFirstAvailableSlot - 7;
                jArr2[(((i15 + i14) - (i15 | i14)) + ((i14 + 7) - (i14 | 7))) >> 3] = j14;
                return ~iFindFirstAvailableSlot;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }
}
