package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
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
/* JADX INFO: compiled from: ObjectLongMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&˛\bDZc|İI\u0006>\u00116B\u0005#4\u0012\u0006\u0007nj?6LeV5Zݷ2\u000f\u0002{<$a*yCQU\"}0\u0018WȞog|db\u000bY\u000f\u000e\u0016~q4Ic\u0002e\u0012\u00153JoU3UoC?vҚ^\u0007&݅07*\u000b\u0011\u001c:HVu)C\f\u0019\"6FpHS%M3\u001cŪ\n>.\u0004fbuSNH\u001bc\u0001/k\u0007wIf'\u000e6ES\u001bNl';|(\u001esNE>-%\u0002\u00057ViI\u001b? ?Kho:9T\fWdZ0\u0018#7g\r\u0014öl\\ԇU`\u001a4stqYh\u000eV\u0007+\u007f\u001bH\u001c\u000e<Ωx8;*~\u000e\u001e5\u0005r\u0002O~\u0013%۔\u0006Ҧ`اа)\u007fA=\u0002!tdy;GT}{M\u001b,7\u0019nOa\u0005\u0012n*3T&SwQ\tKVd\"Yks4tp\u0003B\u0004^IF/D%<.=7\n?S%y\u000e`D\u001eϸK¢pרmRVXj\u0004$NB\t:`tn\u0013\u0005hZh.!MR\u03815\u0018Nʽ(%\u0014J8=\u0010|U\u0019uxfu\u001253l6in\"ލ\u0006T%گ=Ʉg\u0010on?)MSz\u0005\u0007lr]\u001ast.24XjFǮ*a\u0015܃\u001bzT\u007f3L,_\u001f\r\u001fV\u001c6HQ~\u0019_\u0011Ӑ>\u001d\u001bգ,K~2\u0014!\u0001~b!yu\u0019a2\rb2-wٛc\u0019lť*1M\u000bD\u001f~\"\u0006wkZSdlL߯\u0006\u007f.829\u007f>ˮ\u0017\u000f\rLz#;fdr\u0014`}\u00165\u0007\u0015yE\u0090\u00192u*\u0003pZo\u001bN]x/\"%mѓ'\br%BsT!_c\u0003\u0011\fHW\u0013\u001b_LPH|;ȔL%I\u00010$M-q-M\u001a\u0006 G\u0015\u0018Ӡɳs.\bzW?\u0003\r\u001c,\u0012> f_iJ;nԾ\n\u0003LD<l1Q\u05f8nw\u0016kQX\u001b]`A\u0013v\u0007N[6G\u0010v\t<\r'£k<#o,C>a:sq&B\u000b\nѠ\u0017µR܊6{Y\n#J=\u0010;\u007f?\u001d*\u001ck\"\u001dV+\u0017>5\f\u0018dGkf\u0013l!$b.\u0003\bS_b\u001b\u001e\u0010)\u0006vc\u001d#JB*ĩ\u0007\u0012b\u001btVv\u0014'ѫ`Ճ.\u0001\r2{\"\u0007gI\u0005\u001cH\u001dFqe\u0019SK\u000fKn]-~%YF\u0005=)Jp\u00019T$ŠORB\u0012KAm\u001aqbՇ$Ԡ!B ÇʆQ\u0016gy6Ͷ;\u0004c͘h+"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001ew\u001f05?FA", "\u0019", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nj\u0014\u001cGm\u001d#\u0001.7Ay+\r", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "5q^Dg/%W!\u0003\n", "/cYBf;,b#\fv`,", "", "1kT.e", "2q^=7,ES(~\t", "4h]190Ka(Z\fZ0\u0004\u0005,l\u007f\u0016\u0003J\u0010", "6`b5$", "4h]1<5=S,", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "5dc\u001ce\u0017Nb", "", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010.\u0002\u0012[", "7mXA\\(EW.~\\k6\u000f\u00182", "7mXA\\(EW.~b^;x\b+t{", "1`_.V0Mg", "7mXA\\(EW.~hm6\n\u00051e", ";h]Bf\bLa\u001d\u0001\u0004", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "9dh@", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u0015\u0013V~\u000eId%D/", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", ">kd@4:LW\u001b\b", "4q^:", ">tc", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}`\u0004q", "2dU.h3M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}`%D{", ">tc\u000e_3", "@d\\<i,", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}`\u0004u", "@d\\<i,\"T", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "@d\\<i,/O \u000fz:;", "7mS2k", "@db6m,,b#\fv`,", "<df\u0010T7:Q\u001d\u000e\u000f", "Adc", "BqX:", "EqXAX\u0014>b\u0015}vm(", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableObjectLongMap<K> extends ObjectLongMap<K> {
    private int growthLimit;

    public MutableObjectLongMap() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableObjectLongMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 6 : i2);
    }

    public MutableObjectLongMap(int i2) {
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
        this.keys = new Object[iMax];
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
        long j2 = 255 << ((i2 & 7) << 3);
        long j3 = (-1) - (((-1) - jArr2[i4]) | ((-1) - (~j2)));
        jArr2[i4] = (j3 + j2) - (j3 & j2);
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    public final long getOrPut(K k2, Function0<Long> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(k2);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        long jLongValue = defaultValue.invoke().longValue();
        set(k2, jLongValue);
        return jLongValue;
    }

    public final void set(K k2, long j2) {
        int iFindIndex = findIndex(k2);
        if (iFindIndex < 0) {
            iFindIndex = ~iFindIndex;
        }
        this.keys[iFindIndex] = k2;
        this.values[iFindIndex] = j2;
    }

    public final void put(K k2, long j2) {
        set(k2, j2);
    }

    public final long put(K k2, long j2, long j3) {
        int iFindIndex = findIndex(k2);
        if (iFindIndex < 0) {
            iFindIndex = ~iFindIndex;
        } else {
            j3 = this.values[iFindIndex];
        }
        this.keys[iFindIndex] = k2;
        this.values[iFindIndex] = j2;
        return j3;
    }

    public final void plusAssign(ObjectLongMap<K> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void remove(K k2) {
        int iFindKeyIndex = findKeyIndex(k2);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final boolean remove(K k2, long j2) {
        int iFindKeyIndex = findKeyIndex(k2);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != j2) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void removeIf(Function2<? super K, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.metadata;
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
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (predicate.invoke(this.keys[i5], Long.valueOf(this.values[i5])).booleanValue()) {
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

    public final void minusAssign(K k2) {
        remove(k2);
    }

    public final void minusAssign(K[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (K k2 : keys) {
            remove(k2);
        }
    }

    public final void minusAssign(Iterable<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void minusAssign(Sequence<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void removeValueAt(int i2) {
        this._size--;
        long[] jArr = this.metadata;
        int i3 = this._capacity;
        int i4 = i2 >> 3;
        int i5 = ((-1) - (((-1) - i2) | ((-1) - 7))) << 3;
        long j2 = jArr[i4] & (~(255 << i5));
        long j3 = 254 << i5;
        long j4 = (j2 + j3) - (j2 & j3);
        jArr[i4] = j4;
        jArr[(((-1) - (((-1) - (i2 - 7)) | ((-1) - i3))) + ((-1) - (((-1) - i3) | ((-1) - 7)))) >> 3] = j4;
        this.keys[i2] = null;
    }

    public final void clear() {
        this._size = 0;
        if (this.metadata != ScatterMapKt.EmptyGroup) {
            ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr = this.metadata;
            int i2 = this._capacity;
            int i3 = i2 >> 3;
            long j2 = jArr[i3];
            long j3 = 255 << (((-1) - (((-1) - i2) | ((-1) - 7))) << 3);
            long j4 = ~j3;
            jArr[i3] = (-1) - (((-1) - ((j2 + j4) - (j2 | j4))) & ((-1) - j3));
        }
        ArraysKt.fill(this.keys, (Object) null, 0, this._capacity);
        initializeGrowth();
    }

    private final int findFirstAvailableSlot(int i2) {
        int i3 = this._capacity;
        int i4 = (-1) - (((-1) - i2) | ((-1) - i3));
        int i5 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i6 = i4 >> 3;
            int i7 = ((i4 + 7) - (7 | i4)) << 3;
            long j2 = jArr[i6] >>> i7;
            long j3 = (jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63);
            long j4 = (j3 + j2) - (j3 & j2);
            long j5 = j4 & ((~j4) << 7);
            long j6 = (j5 - 9187201950435737472L) - (j5 | (-9187201950435737472L));
            if (j6 != 0) {
                return (i4 + (Long.numberOfTrailingZeros(j6) >> 3)) & i3;
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
        Object[] objArr = this.keys;
        long[] jArr2 = this.values;
        ScatterMapKt.convertMetadataForCleanup(jArr, i2);
        int i3 = 0;
        int i4 = 0;
        int iFindEmptySlot = -1;
        while (i4 != i2) {
            int i5 = i4 >> 3;
            int i6 = ((-1) - (((-1) - i4) | ((-1) - 7))) << 3;
            long j2 = jArr[i5] >> i6;
            long j3 = (j2 + 255) - (j2 | 255);
            if (j3 == 128) {
                iFindEmptySlot = i4;
                i4++;
            } else {
                if (j3 == 254) {
                    Object obj = objArr[i4];
                    int iHashCode = (obj != null ? obj.hashCode() : i3) * ScatterMapKt.MurmurHashC1;
                    int i7 = iHashCode ^ (iHashCode << 16);
                    int i8 = i7 >>> 7;
                    int iFindFirstAvailableSlot = findFirstAvailableSlot(i8);
                    int i9 = (-1) - (((-1) - i8) | ((-1) - i2));
                    int i10 = iFindFirstAvailableSlot - i9;
                    if (((i10 + i2) - (i10 | i2)) / 8 == ((i4 - i9) & i2) / 8) {
                        jArr[i5] = (-1) - (((-1) - (((long) (i7 & 127)) << i6)) & ((-1) - ((-1) - (((-1) - (~(255 << i6))) | ((-1) - jArr[i5])))));
                        int lastIndex = ArraysKt.getLastIndex(jArr);
                        long j4 = jArr[i3];
                        jArr[lastIndex] = (-1) - (((-1) - ((j4 + 72057594037927935L) - (j4 | 72057594037927935L))) & ((-1) - Long.MIN_VALUE));
                    } else {
                        int i11 = iFindFirstAvailableSlot >> 3;
                        long j5 = jArr[i11];
                        int i12 = ((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3;
                        long j6 = j5 >> i12;
                        if ((j6 + 255) - (j6 | 255) != 128) {
                            long j7 = j5 & (~(255 << i12));
                            long j8 = ((long) ((-1) - (((-1) - i7) | ((-1) - 127)))) << i12;
                            jArr[i11] = (j8 + j7) - (j8 & j7);
                            if (iFindEmptySlot == -1) {
                                iFindEmptySlot = ScatterMapKt.findEmptySlot(jArr, i4 + 1, i2);
                            }
                            objArr[iFindEmptySlot] = objArr[iFindFirstAvailableSlot];
                            objArr[iFindFirstAvailableSlot] = objArr[i4];
                            objArr[i4] = objArr[iFindEmptySlot];
                            jArr2[iFindEmptySlot] = jArr2[iFindFirstAvailableSlot];
                            jArr2[iFindFirstAvailableSlot] = jArr2[i4];
                            jArr2[i4] = jArr2[iFindEmptySlot];
                            i4--;
                        } else {
                            long j9 = j5 & (~(255 << i12));
                            long j10 = ((long) ((i7 + 127) - (i7 | 127))) << i12;
                            jArr[i11] = (j9 + j10) - (j9 & j10);
                            long j11 = (-1) - (((-1) - jArr[i5]) | ((-1) - (~(255 << i6))));
                            long j12 = 128 << i6;
                            jArr[i5] = (j11 + j12) - (j11 & j12);
                            objArr[iFindFirstAvailableSlot] = objArr[i4];
                            objArr[i4] = null;
                            jArr2[iFindFirstAvailableSlot] = jArr2[i4];
                            jArr2[i4] = 0;
                            iFindEmptySlot = i4;
                        }
                        i3 = 0;
                        jArr[ArraysKt.getLastIndex(jArr)] = (-1) - (((-1) - ((-1) - (((-1) - jArr[0]) | ((-1) - 72057594037927935L)))) & ((-1) - Long.MIN_VALUE));
                        i4++;
                    }
                }
                i4++;
            }
        }
        initializeGrowth();
    }

    private final void resizeStorage(int i2) {
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        long[] jArr2 = this.values;
        int i3 = this._capacity;
        initializeStorage(i2);
        long[] jArr3 = this.metadata;
        Object[] objArr2 = this.keys;
        long[] jArr4 = this.values;
        int i4 = this._capacity;
        for (int i5 = 0; i5 < i3; i5++) {
            if ((-1) - (((-1) - (jArr[i5 >> 3] >> (((i5 + 7) - (7 | i5)) << 3))) | ((-1) - 255)) < 128) {
                Object obj = objArr[i5];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i6 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i6 >>> 7);
                int i7 = iFindFirstAvailableSlot >> 3;
                int i8 = (iFindFirstAvailableSlot & 7) << 3;
                long j2 = jArr3[i7];
                long j3 = ~(255 << i8);
                long j4 = (j2 + j3) - (j2 | j3);
                long j5 = ((long) ((-1) - (((-1) - i6) | ((-1) - 127)))) << i8;
                long j6 = (j5 + j4) - (j5 & j4);
                jArr3[i7] = j6;
                int i9 = iFindFirstAvailableSlot - 7;
                jArr3[(((i9 + i4) - (i9 | i4)) + (7 & i4)) >> 3] = j6;
                objArr2[iFindFirstAvailableSlot] = obj;
                jArr4[iFindFirstAvailableSlot] = jArr2[i5];
            }
        }
    }

    private final void writeMetadata(int i2, long j2) {
        long[] jArr = this.metadata;
        int i3 = i2 >> 3;
        int i4 = ((-1) - (((-1) - i2) | ((-1) - 7))) << 3;
        long j3 = jArr[i3];
        long j4 = ~(255 << i4);
        long j5 = (j3 + j4) - (j3 | j4);
        long j6 = j2 << i4;
        jArr[i3] = (j5 + j6) - (j5 & j6);
        int i5 = this._capacity;
        int i6 = i2 - 7;
        int i7 = ((i6 + i5) - (i6 | i5)) + (i5 & 7);
        int i8 = i7 >> 3;
        int i9 = ((i7 + 7) - (i7 | 7)) << 3;
        long j7 = jArr[i8];
        long j8 = ~(255 << i9);
        jArr[i8] = (-1) - (((-1) - (j2 << i9)) & ((-1) - ((j7 + j8) - (j7 | j8))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(ObjectLongMap<K> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.keys;
        long[] jArr = from.values;
        long[] jArr2 = from.metadata;
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
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                        int i5 = (i2 << 3) + i4;
                        set(objArr[i5], jArr[i5]);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.elements;
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
                        remove(objArr[(i2 << 3) + i4]);
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

    private final int findIndex(K k2) {
        int iHashCode = (k2 != null ? k2.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
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
            long j9 = (~j8) & (j8 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L);
            while (j9 != 0) {
                int iNumberOfTrailingZeros = i6 + (Long.numberOfTrailingZeros(j9) >> 3);
                int i10 = (iNumberOfTrailingZeros + i5) - (iNumberOfTrailingZeros | i5);
                if (Intrinsics.areEqual(this.keys[i10], k2)) {
                    return i10;
                }
                long j10 = j9 - 1;
                j9 = (j9 + j10) - (j9 | j10);
            }
            long j11 = (~j6) << 6;
            if ((((j11 + j6) - (j11 | j6)) & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                if (this.growthLimit == 0 && (-1) - (((-1) - (this.metadata[iFindFirstAvailableSlot >> 3] >> ((7 & iFindFirstAvailableSlot) << 3))) | ((-1) - 255)) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                }
                this._size++;
                int i11 = iFindFirstAvailableSlot >> 3;
                int i12 = (7 & iFindFirstAvailableSlot) << 3;
                this.growthLimit -= (-1) - (((-1) - (this.metadata[i11] >> i12)) | ((-1) - 255)) != 128 ? 0 : 1;
                long[] jArr2 = this.metadata;
                int i13 = this._capacity;
                long j12 = (-1) - (((-1) - ((-1) - (((-1) - (~(255 << i12))) | ((-1) - jArr2[i11])))) & ((-1) - (j7 << i12)));
                jArr2[i11] = j12;
                jArr2[(((-1) - (((-1) - (iFindFirstAvailableSlot - 7)) | ((-1) - i13))) + (i13 & 7)) >> 3] = j12;
                return ~iFindFirstAvailableSlot;
            }
            i7 += 8;
            i6 = (-1) - (((-1) - (i6 + i7)) | ((-1) - i5));
        }
    }
}
