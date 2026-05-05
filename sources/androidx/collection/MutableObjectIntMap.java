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
/* JADX INFO: compiled from: ObjectIntMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&˛\bDZc|İI\u0006>\u00116B\u0005#4\u0012\u0006\u0007nj?7Le^.ZS0\u0015s{J$c$\u007fRC٥\"}0#WN}gvJ`\u0012K\u000f\u0014\u001f\u0001j2J]xs\u0012\u00172HtG3[vEʠvҚ^\u0007&݅07*\u000b\u0011\u001c:HVu)C\f\u0019\"6FpHS%M3\u001cŪ\n>.\u0004fbuSNH\u001bc\u0001/k\u0007wIf'\u000e6ES\u001bNl';|(\u001esNE>-%\u0002\u00057ViI\u001b? ?Kho:9T\fWdZ0\u0018#7g\r\u0014öl\\ԇU`\u001a4stqYh\u000eVy+\u007f\u001bH\u001c\u000e<Ωx8;)~\u000e\u001e5\u0005r\u0002B~\u0012%۔\u0006Ҧ`اа)\u007fA<\u0002!tcy;GT}{M\u001b,6\u0019nOa\u0005\u0012n)3T&SwQ\tKVc\"Yks4tp\u0003B\u0004^IF/D%<-=7\n?S%y\u000e`D\u001eϸK¢pרmRVWj\u0004$MB\t:`tn\u0013\u0004hZh.!MR\u03815\u0017Nʽ(%\u0014J7=\u0010|U\u0019uxeu\u001253l6in\"ލ\u0006S%گ=Ʉg\u0010om?)MRz\u0005\u0007lr]\u001art.24XjFǮ*`\u0015܃\u001bzT\u007f2L,_\u001f\r\u001fV\u001b6HQ~\u0019_\u0011Ӑ>\u001c\u001bգ,K~2\u0013!\u0001~b!yu\u0018a2\rb2-wٛc\u0019lť*1M\u000bC\u001f~\"\u0006wkZSdlL߯\u0006\u007f.729\u007f1ˮ\u0017\u000f\rKz#;edr\u0014S}\u00165\u0007\u0015yE\u0090\u00192u)\u0003pZb\u001bN]w/\"%`ѓ'\br$BsT _c\u0003\u0011\fHW\u0012\u001b_LPH|;ȔL%I\u00010#M-q-M\u001a\u0006 G\u0015\u0018Ӡɳs.\byW?\u0003\f\u001c,\u0012= f_iJ;nԾ\n\u0003LC<l1D\u05f8nw\u0016jQX\u001b\\`A\u0013v\u0007N[5G\u0010v\t<\r'£k<#o,6>a:sq%B\n\nѠ\u0017µR܊6{Y\t#J=\u0010;\u007f?\u001c*\u001ck\"\u001dV+\u0017>4\f\u0018dGkf\u0013k!$b.\u0003\bS_b\u001a\u001e\u0010)\u0006vc\u001d#JB*ĩ\u0007\u0012b\u001atVv\u0007'ѫ`Ճ.\u0001\r1{\"\u0007fI\u0005\u001cH\u001dFqd\u0019SK\u000fKn],~%YF\u0005=)Ip\u00019x$ŠORB\u0012KAm\u001aqbՇ$Ԡ!B ÇʆQ\u0016gy6Ͷ;\u0004c͘h+"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001bv%\u0016IN\u0011", "\u0019", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nj\u0014\u001cGm\u001d \u007f4\u001dU\tu", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "5q^Dg/%W!\u0003\n", "/cYBf;,b#\fv`,", "", "1kT.e", "2q^=7,ES(~\t", "4h]190Ka(Z\fZ0\u0004\u0005,l\u007f\u0016\u0003J\u0010", "6`b5$", "4h]1<5=S,", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "5dc\u001ce\u0017Nb", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010.\u0002\u0012Z", "7mXA\\(EW.~\\k6\u000f\u00182", "7mXA\\(EW.~b^;x\b+t{", "1`_.V0Mg", "7mXA\\(EW.~hm6\n\u00051e", ";h]Bf\bLa\u001d\u0001\u0004", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "9dh@", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u0015\u0013V~\u000eId%D/", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", ">kd@4:LW\u001b\b", "4q^:", ">tc", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}_\u0004q", "2dU.h3M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}_$Dz", ">tc\u000e_3", "@d\\<i,", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}_\u0004u", "@d\\<i,\"T", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "@d\\<i,/O \u000fz:;", "7mS2k", "@db6m,,b#\fv`,", "<df\u0010T7:Q\u001d\u000e\u000f", "Adc", "BqX:", "EqXAX\u0014>b\u0015}vm(", "", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableObjectIntMap<K> extends ObjectIntMap<K> {
    private int growthLimit;

    public MutableObjectIntMap() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableObjectIntMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 6 : i2);
    }

    public MutableObjectIntMap(int i2) {
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
        this.values = new int[iMax];
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
        long j2 = 255 << (((i2 + 7) - (i2 | 7)) << 3);
        long j3 = (-1) - (((-1) - jArr2[i3]) | ((-1) - (~j2)));
        jArr2[i3] = (j3 + j2) - (j3 & j2);
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    public final int getOrPut(K k2, Function0<Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(k2);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        int iIntValue = defaultValue.invoke().intValue();
        set(k2, iIntValue);
        return iIntValue;
    }

    public final void set(K k2, int i2) {
        int iFindIndex = findIndex(k2);
        if (iFindIndex < 0) {
            iFindIndex = ~iFindIndex;
        }
        this.keys[iFindIndex] = k2;
        this.values[iFindIndex] = i2;
    }

    public final void put(K k2, int i2) {
        set(k2, i2);
    }

    public final int put(K k2, int i2, int i3) {
        int iFindIndex = findIndex(k2);
        if (iFindIndex < 0) {
            iFindIndex = ~iFindIndex;
        } else {
            i3 = this.values[iFindIndex];
        }
        this.keys[iFindIndex] = k2;
        this.values[iFindIndex] = i2;
        return i3;
    }

    public final void plusAssign(ObjectIntMap<K> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void remove(K k2) {
        int iFindKeyIndex = findKeyIndex(k2);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final boolean remove(K k2, int i2) {
        int iFindKeyIndex = findKeyIndex(k2);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != i2) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void removeIf(Function2<? super K, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2))) & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (predicate.invoke(this.keys[i5], Integer.valueOf(this.values[i5])).booleanValue()) {
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
        int i5 = (7 & i2) << 3;
        long j2 = jArr[i4];
        long j3 = ~(255 << i5);
        long j4 = ((j2 + j3) - (j2 | j3)) | (254 << i5);
        jArr[i4] = j4;
        jArr[(((-1) - (((-1) - (i2 - 7)) | ((-1) - i3))) + (i3 & 7)) >> 3] = j4;
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
            long j3 = 255 << (((i2 + 7) - (i2 | 7)) << 3);
            long j4 = ~j3;
            long j5 = (j2 + j4) - (j2 | j4);
            jArr[i3] = (j5 + j3) - (j5 & j3);
        }
        ArraysKt.fill(this.keys, (Object) null, 0, this._capacity);
        initializeGrowth();
    }

    private final int findFirstAvailableSlot(int i2) {
        int i3 = this._capacity;
        int i4 = (i2 + i3) - (i2 | i3);
        int i5 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i6 = i4 >> 3;
            int i7 = ((i4 + 7) - (7 | i4)) << 3;
            long j2 = (-1) - (((-1) - ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63))) & ((-1) - (jArr[i6] >>> i7)));
            long j3 = ((-1) - (((-1) - j2) | ((-1) - ((~j2) << 7)))) & (-9187201950435737472L);
            if (j3 != 0) {
                int iNumberOfTrailingZeros = i4 + (Long.numberOfTrailingZeros(j3) >> 3);
                return (iNumberOfTrailingZeros + i3) - (iNumberOfTrailingZeros | i3);
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
        Object[] objArr = this.keys;
        int[] iArr = this.values;
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
                    int i9 = i8 & i2;
                    int i10 = ((iFindFirstAvailableSlot - i9) & i2) / 8;
                    int i11 = i4 - i9;
                    if (i10 == ((i11 + i2) - (i11 | i2)) / 8) {
                        jArr[i5] = (-1) - (((-1) - (((long) ((-1) - (((-1) - i7) | ((-1) - 127)))) << i6)) & ((-1) - ((~(255 << i6)) & jArr[i5])));
                        int lastIndex = ArraysKt.getLastIndex(jArr);
                        long j4 = jArr[i3] & 72057594037927935L;
                        jArr[lastIndex] = (j4 - Long.MIN_VALUE) - (j4 & Long.MIN_VALUE);
                    } else {
                        int i12 = iFindFirstAvailableSlot >> 3;
                        long j5 = jArr[i12];
                        int i13 = ((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3;
                        long j6 = j5 >> i13;
                        if ((j6 + 255) - (j6 | 255) == 128) {
                            long j7 = j5 & (~(255 << i13));
                            long j8 = ((long) (i7 & 127)) << i13;
                            jArr[i12] = (j7 + j8) - (j7 & j8);
                            long j9 = jArr[i5];
                            long j10 = ~(255 << i6);
                            jArr[i5] = (-1) - (((-1) - ((j9 + j10) - (j9 | j10))) & ((-1) - (128 << i6)));
                            objArr[iFindFirstAvailableSlot] = objArr[i4];
                            objArr[i4] = null;
                            iArr[iFindFirstAvailableSlot] = iArr[i4];
                            iArr[i4] = 0;
                            iFindEmptySlot = i4;
                        } else {
                            jArr[i12] = (((long) (i7 & 127)) << i13) | ((-1) - (((-1) - j5) | ((-1) - (~(255 << i13)))));
                            if (iFindEmptySlot == -1) {
                                iFindEmptySlot = ScatterMapKt.findEmptySlot(jArr, i4 + 1, i2);
                            }
                            objArr[iFindEmptySlot] = objArr[iFindFirstAvailableSlot];
                            objArr[iFindFirstAvailableSlot] = objArr[i4];
                            objArr[i4] = objArr[iFindEmptySlot];
                            iArr[iFindEmptySlot] = iArr[iFindFirstAvailableSlot];
                            iArr[iFindFirstAvailableSlot] = iArr[i4];
                            iArr[i4] = iArr[iFindEmptySlot];
                            i4--;
                        }
                        i3 = 0;
                        jArr[ArraysKt.getLastIndex(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
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
        int[] iArr = this.values;
        int i3 = this._capacity;
        initializeStorage(i2);
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.keys;
        int[] iArr2 = this.values;
        int i4 = this._capacity;
        for (int i5 = 0; i5 < i3; i5++) {
            long j2 = jArr[i5 >> 3] >> ((7 & i5) << 3);
            if ((j2 + 255) - (j2 | 255) < 128) {
                Object obj = objArr[i5];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i6 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i6 >>> 7);
                int i7 = iFindFirstAvailableSlot >> 3;
                int i8 = (iFindFirstAvailableSlot & 7) << 3;
                long j3 = (((long) ((-1) - (((-1) - i6) | ((-1) - 127)))) << i8) | ((-1) - (((-1) - jArr2[i7]) | ((-1) - (~(255 << i8)))));
                jArr2[i7] = j3;
                jArr2[(((iFindFirstAvailableSlot - 7) & i4) + (7 & i4)) >> 3] = j3;
                objArr2[iFindFirstAvailableSlot] = obj;
                iArr2[iFindFirstAvailableSlot] = iArr[i5];
            }
        }
    }

    private final void writeMetadata(int i2, long j2) {
        long[] jArr = this.metadata;
        int i3 = i2 >> 3;
        int i4 = ((-1) - (((-1) - i2) | ((-1) - 7))) << 3;
        jArr[i3] = (jArr[i3] & (~(255 << i4))) | (j2 << i4);
        int i5 = this._capacity;
        int i6 = ((i2 - 7) & i5) + ((-1) - (((-1) - i5) | ((-1) - 7)));
        int i7 = i6 >> 3;
        int i8 = ((-1) - (((-1) - i6) | ((-1) - 7))) << 3;
        long j3 = (-1) - (((-1) - jArr[i7]) | ((-1) - (~(255 << i8))));
        long j4 = j2 << i8;
        jArr[i7] = (j4 + j3) - (j4 & j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(ObjectIntMap<K> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.keys;
        int[] iArr = from.values;
        long[] jArr = from.metadata;
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
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        set(objArr[i5], iArr[i5]);
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
            long j3 = (-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2));
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
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
        int i4 = (i2 + 127) - (i2 | 127);
        int i5 = this._capacity;
        int i6 = (i3 + i5) - (i3 | i5);
        int i7 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = ((-1) - (((-1) - i6) | ((-1) - 7))) << 3;
            long j2 = ((-1) - (((-1) - (jArr[i8 + 1] << (64 - i9))) | ((-1) - ((-i9) >> 63)))) | (jArr[i8] >>> i9);
            long j3 = i4;
            long j4 = j2 ^ (j3 * ScatterMapKt.BitmaskLsb);
            for (long j5 = (-1) - (((-1) - ((~j4) & (j4 - ScatterMapKt.BitmaskLsb))) | ((-1) - (-9187201950435737472L))); j5 != 0; j5 &= j5 - 1) {
                int iNumberOfTrailingZeros = (-1) - (((-1) - (i6 + (Long.numberOfTrailingZeros(j5) >> 3))) | ((-1) - i5));
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], k2)) {
                    return iNumberOfTrailingZeros;
                }
            }
            long j6 = (-1) - (((-1) - ((~j2) << 6)) | ((-1) - j2));
            if ((j6 - 9187201950435737472L) - (j6 | (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                if (this.growthLimit == 0) {
                    long j7 = this.metadata[iFindFirstAvailableSlot >> 3] >> (((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3);
                    if ((j7 + 255) - (j7 | 255) != 254) {
                        adjustStorage();
                        iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                    }
                }
                this._size++;
                int i10 = iFindFirstAvailableSlot >> 3;
                int i11 = (7 & iFindFirstAvailableSlot) << 3;
                this.growthLimit -= ((this.metadata[i10] >> i11) & 255) != 128 ? 0 : 1;
                long[] jArr2 = this.metadata;
                int i12 = this._capacity;
                long j8 = (-1) - (((-1) - ((-1) - (((-1) - (~(255 << i11))) | ((-1) - jArr2[i10])))) & ((-1) - (j3 << i11)));
                jArr2[i10] = j8;
                jArr2[(((-1) - (((-1) - (iFindFirstAvailableSlot - 7)) | ((-1) - i12))) + ((-1) - (((-1) - i12) | ((-1) - 7)))) >> 3] = j8;
                return ~iFindFirstAvailableSlot;
            }
            i7 += 8;
            i6 = (-1) - (((-1) - (i6 + i7)) | ((-1) - i5));
        }
    }
}
