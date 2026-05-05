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
/* JADX INFO: compiled from: FloatLongMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4C\u0007\":\u0012\u007f\u0007lnA0RjP\u008cZS8\u0016sڔ<$q$yCAY\"}8\tWN}gvJh\u001dK\u000f\f\u001b\u0001j:R]xc\u0012\u00172XoG3SuSʠ\u0011td\u0004`?2>\u007f\u0005\u000f\u001aBH>wټGK\u001a\u0014xF~>j\r{\n`\u0012NB.\u00076\\\u0016S~NzdR/Q\b0B\u00175m8\u0015M;G\u0005+\u001b\u007fy\u001eYA}5]3a\r\u001fR\n@3C\u007fH\u001dhU3qI<wDe\u0018\u0014C9\u007f\u0011k}>\\3]\u0011\u00165:gi[R\u001e(&\t*\u001d\u0003ǐ\u0014ϳ&Ξv3(w \u000eay9S\t^\u0010pZ\u007f)ff\u001b3\u0013K+g\u001c-Q*I'bO{3\u0012N'\u000fn9[\u0003\u000f'\u0015cc\u0006fIQnBxR\u0018oUm2\b)̪2L?U\u0015G{?3G)EqQ#O\u0004HҍL0\u0006\u0013u\u0001S\u0018WxD0y.7X\u0015RɵL-\u0014yelXZ\u0016} b\u001d\u0016\bA9#ʃDi4\u001ehgh\u0018o}a\u0018@GfeX5\u008f\u0016 MlOMQ\u0012\u0015\u0012V\u0005\u001fW<\u0011\u0011\tjPp$Z\u000b6jNV\u0007(w*R~\u0010!=WqJ@\\5'y-H1,rE\u000b'wZ\u0017\u001eG`AC\u001biRy9\u0005^w\to\u0016w\u00128\u000b\u0001:-oVe\u001d4`:hb\tk\u001b\r\u0014\u0018G\u0016mwPz!\u000eU*,F\u001eGnG=A\u001dGM@$EEzw\u0016g[5?\r\r{\u001f;\u0017:w\nzpZnzL_TEC%\u00039׃\u000eݦ~ט*T\tl{T9`nM\u0001)q<|9C\u0004g,3(\b\"+:]G5E.wB0[a&\u0001}W\u0012b=+%i\u00127{\u0016\u001en\u0002a@XPI\b\r\u0005д$5\u0007Pr\u0003w6CQK\u001b^`A\u0013u\u0007<[1G}\u0015\b\\\u0011~ss:A}Dұ406\u0002F\u0016\u0014\rD{ݑYϬkmuжŏ\u000bO\u0017\r\u0011֤a\u001d\u0011λAL"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<W,?U\r\u0007Av\u0018\u0016IN\u0011", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\na\u001e!C~tF\u007f'\u001dU\tu", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "5q^Dg/%W!\u0003\n", "/cYBf;,b#\fv`,", "", "1kT.e", "2q^=7,ES(~\t", "4h]190Ka(Z\fZ0\u0004\u0005,l\u007f\u0016\u0003J\u0010", "6`b5$", "4h]1<5LS&\u000e^g+|\u001c", "9dh", "", "5dc\u001ce\u0017Nb", "", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "7mXA\\(EW.~\\k6\u000f\u00182", "7mXA\\(EW.~b^;x\b+t{", "1`_.V0Mg", "7mXA\\(EW.~hm6\n\u00051e", ";h]Bf\bLa\u001d\u0001\u0004", "9dh@", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\na\u001e!C~t@\u00054\u000b", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\na\u001e!C~{<\u0006z", "", ">kd@4:LW\u001b\b", "4q^:", ">tc", "D`[BX", "2dU.h3M", ">tc\u000e_3", "@d\\<i,", "", "@d\\<i,\"T", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "@d\\<i,/O \u000fz:;", "7mS2k", "@db6m,,b#\fv`,", "<df\u0010T7:Q\u001d\u000e\u000f", "Adc", "BqX:", "EqXAX\u0014>b\u0015}vm(", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableFloatLongMap extends FloatLongMap {
    private int growthLimit;

    public MutableFloatLongMap() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableFloatLongMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 + 1) - (i3 | 1) != 0 ? 6 : i2);
    }

    public MutableFloatLongMap(int i2) {
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
        long j2 = 255 << (((-1) - (((-1) - i2) | ((-1) - 7))) << 3);
        jArr2[i4] = ((-1) - (((-1) - jArr2[i4]) | ((-1) - (~j2)))) | j2;
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    public final long getOrPut(float f2, Function0<Long> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(f2);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        long jLongValue = defaultValue.invoke().longValue();
        put(f2, jLongValue);
        return jLongValue;
    }

    public final void set(float f2, long j2) {
        int iFindInsertIndex = findInsertIndex(f2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = f2;
        this.values[iFindInsertIndex] = j2;
    }

    public final void put(float f2, long j2) {
        set(f2, j2);
    }

    public final long put(float f2, long j2, long j3) {
        int iFindInsertIndex = findInsertIndex(f2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        } else {
            j3 = this.values[iFindInsertIndex];
        }
        this.keys[iFindInsertIndex] = f2;
        this.values[iFindInsertIndex] = j2;
        return j3;
    }

    public final void plusAssign(FloatLongMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void remove(float f2) {
        int iFindKeyIndex = findKeyIndex(f2);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final boolean remove(float f2, long j2) {
        int iFindKeyIndex = findKeyIndex(f2);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != j2) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void removeIf(Function2<? super Float, ? super Long, Boolean> predicate) {
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
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (predicate.invoke(Float.valueOf(this.keys[i5]), Long.valueOf(this.values[i5])).booleanValue()) {
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
        int i5 = ((i2 + 7) - (7 | i2)) << 3;
        long j2 = (-1) - (((-1) - jArr[i4]) | ((-1) - (~(255 << i5))));
        long j3 = 254 << i5;
        long j4 = (j2 + j3) - (j2 & j3);
        jArr[i4] = j4;
        jArr[(((i2 - 7) & i3) + (i3 & 7)) >> 3] = j4;
    }

    public final void clear() {
        this._size = 0;
        if (this.metadata != ScatterMapKt.EmptyGroup) {
            ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr = this.metadata;
            int i2 = this._capacity;
            int i3 = i2 >> 3;
            long j2 = 255 << (((i2 + 7) - (i2 | 7)) << 3);
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
            int i7 = (7 & i4) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (-1) - (((-1) - j2) | ((-1) - ((~j2) << 7)));
            long j4 = (j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L));
            if (j4 != 0) {
                return (i4 + (Long.numberOfTrailingZeros(j4) >> 3)) & i3;
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
        float[] fArr = this.keys;
        long[] jArr2 = this.values;
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
                    int iHashCode = Float.hashCode(fArr[i3]) * ScatterMapKt.MurmurHashC1;
                    int i6 = iHashCode ^ (iHashCode << 16);
                    int i7 = i6 >>> 7;
                    int iFindFirstAvailableSlot = findFirstAvailableSlot(i7);
                    int i8 = i7 & i2;
                    int i9 = ((iFindFirstAvailableSlot - i8) & i2) / 8;
                    int i10 = i3 - i8;
                    if (i9 == ((i10 + i2) - (i10 | i2)) / 8) {
                        long j4 = jArr[i4];
                        long j5 = ~(255 << i5);
                        jArr[i4] = (((long) ((i6 + 127) - (i6 | 127))) << i5) | ((j5 + j4) - (j5 | j4));
                        int lastIndex = ArraysKt.getLastIndex(jArr);
                        long j6 = jArr[c2];
                        jArr[lastIndex] = (-1) - (((-1) - ((j6 + 72057594037927935L) - (j6 | 72057594037927935L))) & ((-1) - Long.MIN_VALUE));
                    } else {
                        int i11 = iFindFirstAvailableSlot >> 3;
                        long j7 = jArr[i11];
                        int i12 = ((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3;
                        if (((j7 >> i12) & 255) != 128) {
                            long j8 = ~(255 << i12);
                            jArr[i11] = (((long) ((-1) - (((-1) - i6) | ((-1) - 127)))) << i12) | ((j7 + j8) - (j7 | j8));
                            if (iFindEmptySlot == -1) {
                                iFindEmptySlot = ScatterMapKt.findEmptySlot(jArr, i3 + 1, i2);
                            }
                            fArr[iFindEmptySlot] = fArr[iFindFirstAvailableSlot];
                            fArr[iFindFirstAvailableSlot] = fArr[i3];
                            fArr[i3] = fArr[iFindEmptySlot];
                            jArr2[iFindEmptySlot] = jArr2[iFindFirstAvailableSlot];
                            jArr2[iFindFirstAvailableSlot] = jArr2[i3];
                            jArr2[i3] = jArr2[iFindEmptySlot];
                            i3--;
                        } else {
                            long j9 = (-1) - (((-1) - j7) | ((-1) - (~(255 << i12))));
                            long j10 = ((long) ((i6 + 127) - (i6 | 127))) << i12;
                            jArr[i11] = (j9 + j10) - (j9 & j10);
                            long j11 = jArr[i4];
                            long j12 = ~(255 << i5);
                            long j13 = (j11 + j12) - (j11 | j12);
                            long j14 = 128 << i5;
                            jArr[i4] = (j13 + j14) - (j13 & j14);
                            fArr[iFindFirstAvailableSlot] = fArr[i3];
                            fArr[i3] = 0.0f;
                            jArr2[iFindFirstAvailableSlot] = jArr2[i3];
                            jArr2[i3] = 0;
                            iFindEmptySlot = i3;
                        }
                        int lastIndex2 = ArraysKt.getLastIndex(jArr);
                        c2 = 0;
                        long j15 = jArr[0];
                        jArr[lastIndex2] = (-1) - (((-1) - ((j15 + 72057594037927935L) - (j15 | 72057594037927935L))) & ((-1) - Long.MIN_VALUE));
                        i3++;
                    }
                }
                i3++;
            }
        }
        initializeGrowth();
    }

    private final void resizeStorage(int i2) {
        MutableFloatLongMap mutableFloatLongMap = this;
        long[] jArr = mutableFloatLongMap.metadata;
        float[] fArr = mutableFloatLongMap.keys;
        long[] jArr2 = mutableFloatLongMap.values;
        int i3 = mutableFloatLongMap._capacity;
        initializeStorage(i2);
        long[] jArr3 = mutableFloatLongMap.metadata;
        float[] fArr2 = mutableFloatLongMap.keys;
        long[] jArr4 = mutableFloatLongMap.values;
        int i4 = mutableFloatLongMap._capacity;
        int i5 = 0;
        while (i5 < i3) {
            if ((-1) - (((-1) - (jArr[i5 >> 3] >> ((7 & i5) << 3))) | ((-1) - 255)) < 128) {
                float f2 = fArr[i5];
                int iHashCode = Float.hashCode(f2) * ScatterMapKt.MurmurHashC1;
                int i6 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableFloatLongMap.findFirstAvailableSlot(i6 >>> 7);
                int i7 = iFindFirstAvailableSlot >> 3;
                int i8 = (iFindFirstAvailableSlot & 7) << 3;
                long j2 = jArr3[i7] & (~(255 << i8));
                long j3 = ((long) ((i6 + 127) - (i6 | 127))) << i8;
                long j4 = (j2 + j3) - (j2 & j3);
                jArr3[i7] = j4;
                jArr3[(((-1) - (((-1) - (iFindFirstAvailableSlot - 7)) | ((-1) - i4))) + ((-1) - (((-1) - i4) | ((-1) - 7)))) >> 3] = j4;
                fArr2[iFindFirstAvailableSlot] = f2;
                jArr4[iFindFirstAvailableSlot] = jArr2[i5];
            }
            i5++;
            mutableFloatLongMap = this;
        }
    }

    private final void writeMetadata(int i2, long j2) {
        long[] jArr = this.metadata;
        int i3 = i2 >> 3;
        int i4 = ((i2 + 7) - (7 | i2)) << 3;
        long j3 = jArr[i3];
        long j4 = ~(255 << i4);
        long j5 = (j3 + j4) - (j3 | j4);
        long j6 = j2 << i4;
        jArr[i3] = (j5 + j6) - (j5 & j6);
        int i5 = this._capacity;
        int i6 = ((-1) - (((-1) - (i2 - 7)) | ((-1) - i5))) + ((-1) - (((-1) - i5) | ((-1) - 7)));
        int i7 = i6 >> 3;
        int i8 = ((i6 + 7) - (i6 | 7)) << 3;
        jArr[i7] = (j2 << i8) | (jArr[i7] & (~(255 << i8)));
    }

    public final void putAll(FloatLongMap from) {
        Intrinsics.checkNotNullParameter(from, "from");
        float[] fArr = from.keys;
        long[] jArr = from.values;
        long[] jArr2 = from.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr2[i2];
            long j3 = (-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2));
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 + j2) - (255 | j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        set(fArr[i5], jArr[i5]);
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
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
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
        int i4 = (-1) - (((-1) - i2) | ((-1) - 127));
        int i5 = this._capacity;
        int i6 = (-1) - (((-1) - i3) | ((-1) - i5));
        int i7 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = ((-1) - (((-1) - i6) | ((-1) - 7))) << 3;
            long j2 = jArr[i8] >>> i9;
            long j3 = jArr[i8 + 1] << (64 - i9);
            long j4 = (-i9) >> 63;
            long j5 = (j3 + j4) - (j3 | j4);
            long j6 = (j5 + j2) - (j5 & j2);
            long j7 = i4;
            long j8 = j6 ^ (j7 * ScatterMapKt.BitmaskLsb);
            for (long j9 = (-1) - (((-1) - ((-1) - (((-1) - (~j8)) | ((-1) - (j8 - ScatterMapKt.BitmaskLsb))))) | ((-1) - (-9187201950435737472L))); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i6) & i5;
                if (this.keys[iNumberOfTrailingZeros] == f2) {
                    return iNumberOfTrailingZeros;
                }
            }
            long j10 = (~j6) << 6;
            long j11 = (j10 + j6) - (j10 | j6);
            if ((j11 - 9187201950435737472L) - (j11 | (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> (((iFindFirstAvailableSlot + 7) - (7 | iFindFirstAvailableSlot)) << 3)) & 255) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                }
                this._size++;
                int i10 = iFindFirstAvailableSlot >> 3;
                int i11 = ((iFindFirstAvailableSlot + 7) - (7 | iFindFirstAvailableSlot)) << 3;
                this.growthLimit -= (-1) - (((-1) - (this.metadata[i10] >> i11)) | ((-1) - 255)) != 128 ? 0 : 1;
                long[] jArr2 = this.metadata;
                int i12 = this._capacity;
                long j12 = jArr2[i10];
                long j13 = ~(255 << i11);
                long j14 = (j13 + j12) - (j13 | j12);
                long j15 = j7 << i11;
                long j16 = (j14 + j15) - (j14 & j15);
                jArr2[i10] = j16;
                jArr2[(((iFindFirstAvailableSlot - 7) & i12) + (i12 & 7)) >> 3] = j16;
                return ~iFindFirstAvailableSlot;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }
}
