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
/* JADX INFO: compiled from: ObjectFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&˛\bDZc|İI\u0006>\u00116B\u0005#4\u0012\u0006\u0007nj?6LeV3Zݷ2\u000f\u0002{<$a*yCQU\"}0\u0018WȞog|db\u000bY\u000f\u000e\u0016~q4Ic\u0002e\u0012\u00153JoU3UoC>htD\f(݅8\u0600\"\u0007\u0007ɝ8G@|\u000bE[\fX/npz_\u001dS\u000b\u001a \u0007V / ֔kNDK5cH4;\u0003\u0018H\u0015'(4\u000bT%F\u0003-U|o&C@e;[%\u001c\u0011\u0015[s?1A\"A\u0013r?'YK:W~k\u000e\u001f-+}\u000f\u000ev4h\u001dQ\u0017ϯm+յgK^\u001bp\u001d\t\n%<2\u001d6+V:E\u001a\u001dڜ>=\u0003\u0003kF`\u0004nB.\n\u0010G]Ӣ\u0006Ɗ*ݍӸjQoMaTE\u000f\u001d\rL)Gniib\"x\u0015IZ(U?fX=vPPY\u0006{\u0012\u0007z\u0002X\n`K\u000e0\u0014\u0011\\\u0019k7$M18\u0004\u0002vJ\u0018z\u0013l\u0001S ɭ\u000f؞*å\u001a78!ToR{\u001dk~Z\t6\u001ff4Z\u0017\u007f\u0018\u0013Vο&Vgؾ\u0018\u0017kv\u0001\u0003M\f\u0010U;tPqv{\u0012]8n3kȡ\u0012+(׳~݀C<p!!{Pj$Z\u000b.R<V\u0004(}\fF^\fIԵm\u000fbـ4y.j,`\u0003LHq\u0007\u0017xrn \u0001d3ZѰ\u0018B;ծ\t\u0019q~\u000f\u007fxw2-j0MYWE\u001b6UXֻb|iț\u0007<\u0019U\tdGzrFyc\b8\u0016Pߙ\u00023K5'~WAī1EZ\u0016.r[3?z+\t??v:\u007f\b!ѱ\\dxlgTE1'b\u0001G d.\tӶJzU\t\u001d\u001didar1_lXF\u001d\u001d%.'\u0011oXĜc-\f8+=\u0010\u0014]\u001b\u0012aw{Fy\u0019χ֑xe\u0012D,/}\ni]`chMg\u000bV\"ZЗ3FV\r\u0010\bp\u0018Ό\u00113Vj-\u0015dbe\u000b]\u0004\u0017\u001d:8\thk<#o4Ү>a:sq\r$`S%?u\u0002\u00144\u07b5Qǅ\nͧW\u0018\u0019)In@\"m$d\u0006z\t^\b:\u0017~OI\u0012\u001d<7*d0J8#C\u0003kL\u0010C\u001cT\u0011'\u0017`H$?d\u001alx\u0013Ƈx\tngx!X\u0010E۷3\u038b|5?(6Jba{2/Ue )\u001eg~\u0015+[Hbg3(\u0007\u0003;Ikea\u0002d8\u000eӦs<{\u001a<0|KDnÊEݔ\u0015_~Ѫ͟\u000bZlQjʔB\u0015QƲ&^"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u0018t *\\+7v\n", "\u0019", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nj\u0014\u001cGm\u001d\u001d}/1he\u001cBC", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "5q^Dg/%W!\u0003\n", "/cYBf;,b#\fv`,", "", "1kT.e", "2q^=7,ES(~\t", "4h]190Ka(Z\fZ0\u0004\u0005,l\u007f\u0016\u0003J\u0010", "6`b5$", "4h]1<5=S,", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "5dc\u001ce\u0017Nb", "", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010.\u0002\u0012W", "7mXA\\(EW.~\\k6\u000f\u00182", "7mXA\\(EW.~b^;x\b+t{", "1`_.V0Mg", "7mXA\\(EW.~hm6\n\u00051e", ";h]Bf\bLa\u001d\u0001\u0004", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "9dh@", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u0015\u0013V~\u000eId%D/", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", ">kd@4:LW\u001b\b", "4q^:", ">tc", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}\\\u0004q", "2dU.h3M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}\\!Dw", ">tc\u000e_3", "@d\\<i,", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}\\\u0004u", "@d\\<i,\"T", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "@d\\<i,/O \u000fz:;", "7mS2k", "@db6m,,b#\fv`,", "<df\u0010T7:Q\u001d\u000e\u000f", "Adc", "BqX:", "EqXAX\u0014>b\u0015}vm(", "", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableObjectFloatMap<K> extends ObjectFloatMap<K> {
    private int growthLimit;

    public MutableObjectFloatMap() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableObjectFloatMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 + 1) - (i3 | 1) != 0 ? 6 : i2);
    }

    public MutableObjectFloatMap(int i2) {
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
        this.values = new float[iMax];
    }

    private final void initializeMetadata(int i2) {
        long[] jArr;
        if (i2 == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((i2 + 15) & (-8)) >> 3];
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.metadata = jArr;
        long[] jArr2 = this.metadata;
        int i3 = i2 >> 3;
        long j2 = 255 << (((-1) - (((-1) - i2) | ((-1) - 7))) << 3);
        long j3 = (-1) - (((-1) - jArr2[i3]) | ((-1) - (~j2)));
        jArr2[i3] = (j3 + j2) - (j3 & j2);
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    public final float getOrPut(K k2, Function0<Float> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(k2);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        float fFloatValue = defaultValue.invoke().floatValue();
        set(k2, fFloatValue);
        return fFloatValue;
    }

    public final void set(K k2, float f2) {
        int iFindIndex = findIndex(k2);
        if (iFindIndex < 0) {
            iFindIndex = ~iFindIndex;
        }
        this.keys[iFindIndex] = k2;
        this.values[iFindIndex] = f2;
    }

    public final void put(K k2, float f2) {
        set(k2, f2);
    }

    public final float put(K k2, float f2, float f3) {
        int iFindIndex = findIndex(k2);
        if (iFindIndex < 0) {
            iFindIndex = ~iFindIndex;
        } else {
            f3 = this.values[iFindIndex];
        }
        this.keys[iFindIndex] = k2;
        this.values[iFindIndex] = f2;
        return f3;
    }

    public final void plusAssign(ObjectFloatMap<K> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void remove(K k2) {
        int iFindKeyIndex = findKeyIndex(k2);
        if (iFindKeyIndex >= 0) {
            removeValueAt(iFindKeyIndex);
        }
    }

    public final boolean remove(K k2, float f2) {
        int iFindKeyIndex = findKeyIndex(k2);
        if (iFindKeyIndex < 0 || this.values[iFindKeyIndex] != f2) {
            return false;
        }
        removeValueAt(iFindKeyIndex);
        return true;
    }

    public final void removeIf(Function2<? super K, ? super Float, Boolean> predicate) {
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
                    if ((255 + j2) - (255 | j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (predicate.invoke(this.keys[i5], Float.valueOf(this.values[i5])).booleanValue()) {
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
        int i5 = ((i2 + 7) - (7 | i2)) << 3;
        long j2 = jArr[i4];
        long j3 = ~(255 << i5);
        long j4 = ((j2 + j3) - (j2 | j3)) | (254 << i5);
        jArr[i4] = j4;
        jArr[(((i2 - 7) & i3) + ((i3 + 7) - (i3 | 7))) >> 3] = j4;
        this.keys[i2] = null;
    }

    public final void clear() {
        this._size = 0;
        if (this.metadata != ScatterMapKt.EmptyGroup) {
            ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr = this.metadata;
            int i2 = this._capacity;
            int i3 = i2 >> 3;
            long j2 = 255 << (((i2 + 7) - (i2 | 7)) << 3);
            jArr[i3] = ((-1) - (((-1) - jArr[i3]) | ((-1) - (~j2)))) | j2;
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
            int i7 = ((-1) - (((-1) - i4) | ((-1) - 7))) << 3;
            long j2 = jArr[i6] >>> i7;
            long j3 = (-1) - (((-1) - (jArr[i6 + 1] << (64 - i7))) | ((-1) - ((-i7) >> 63)));
            long j4 = (j3 + j2) - (j3 & j2);
            long j5 = (-1) - (((-1) - j4) | ((-1) - ((~j4) << 7)));
            long j6 = (j5 - 9187201950435737472L) - (j5 | (-9187201950435737472L));
            if (j6 != 0) {
                int iNumberOfTrailingZeros = i4 + (Long.numberOfTrailingZeros(j6) >> 3);
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
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        ScatterMapKt.convertMetadataForCleanup(jArr, i2);
        int i3 = 0;
        int i4 = 0;
        int iFindEmptySlot = -1;
        while (i4 != i2) {
            int i5 = i4 >> 3;
            int i6 = ((-1) - (((-1) - i4) | ((-1) - 7))) << 3;
            long j2 = (jArr[i5] >> i6) & 255;
            if (j2 == 128) {
                iFindEmptySlot = i4;
                i4++;
            } else {
                if (j2 == 254) {
                    Object obj = objArr[i4];
                    int iHashCode = (obj != null ? obj.hashCode() : i3) * ScatterMapKt.MurmurHashC1;
                    int i7 = iHashCode ^ (iHashCode << 16);
                    int i8 = i7 >>> 7;
                    int iFindFirstAvailableSlot = findFirstAvailableSlot(i8);
                    int i9 = (-1) - (((-1) - i8) | ((-1) - i2));
                    if (((-1) - (((-1) - (iFindFirstAvailableSlot - i9)) | ((-1) - i2))) / 8 == ((i4 - i9) & i2) / 8) {
                        jArr[i5] = (((long) ((i7 + 127) - (i7 | 127))) << i6) | ((~(255 << i6)) & jArr[i5]);
                        jArr[ArraysKt.getLastIndex(jArr)] = ((-1) - (((-1) - jArr[i3]) | ((-1) - 72057594037927935L))) | Long.MIN_VALUE;
                    } else {
                        int i10 = iFindFirstAvailableSlot >> 3;
                        long j3 = jArr[i10];
                        int i11 = ((iFindFirstAvailableSlot + 7) - (iFindFirstAvailableSlot | 7)) << 3;
                        if (((j3 >> i11) & 255) == 128) {
                            jArr[i10] = ((-1) - (((-1) - j3) | ((-1) - (~(255 << i11))))) | (((long) ((i7 + 127) - (i7 | 127))) << i11);
                            long j4 = jArr[i5] & (~(255 << i6));
                            long j5 = 128 << i6;
                            jArr[i5] = (j4 + j5) - (j4 & j5);
                            objArr[iFindFirstAvailableSlot] = objArr[i4];
                            objArr[i4] = null;
                            fArr[iFindFirstAvailableSlot] = fArr[i4];
                            fArr[i4] = 0.0f;
                            iFindEmptySlot = i4;
                        } else {
                            jArr[i10] = (-1) - (((-1) - (((long) ((-1) - (((-1) - i7) | ((-1) - 127)))) << i11)) & ((-1) - (j3 & (~(255 << i11)))));
                            if (iFindEmptySlot == -1) {
                                iFindEmptySlot = ScatterMapKt.findEmptySlot(jArr, i4 + 1, i2);
                            }
                            objArr[iFindEmptySlot] = objArr[iFindFirstAvailableSlot];
                            objArr[iFindFirstAvailableSlot] = objArr[i4];
                            objArr[i4] = objArr[iFindEmptySlot];
                            fArr[iFindEmptySlot] = fArr[iFindFirstAvailableSlot];
                            fArr[iFindFirstAvailableSlot] = fArr[i4];
                            fArr[i4] = fArr[iFindEmptySlot];
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
        float[] fArr = this.values;
        int i3 = this._capacity;
        initializeStorage(i2);
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.keys;
        float[] fArr2 = this.values;
        int i4 = this._capacity;
        for (int i5 = 0; i5 < i3; i5++) {
            if ((-1) - (((-1) - (jArr[i5 >> 3] >> ((7 & i5) << 3))) | ((-1) - 255)) < 128) {
                Object obj = objArr[i5];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i6 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i6 >>> 7);
                int i7 = iFindFirstAvailableSlot >> 3;
                int i8 = (iFindFirstAvailableSlot & 7) << 3;
                long j2 = (((long) ((-1) - (((-1) - i6) | ((-1) - 127)))) << i8) | (jArr2[i7] & (~(255 << i8)));
                jArr2[i7] = j2;
                jArr2[(((iFindFirstAvailableSlot - 7) & i4) + ((i4 + 7) - (7 | i4))) >> 3] = j2;
                objArr2[iFindFirstAvailableSlot] = obj;
                fArr2[iFindFirstAvailableSlot] = fArr[i5];
            }
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
        int i6 = ((i2 - 7) & i5) + ((-1) - (((-1) - i5) | ((-1) - 7)));
        int i7 = i6 >> 3;
        int i8 = (i6 & 7) << 3;
        jArr[i7] = (j2 << i8) | ((-1) - (((-1) - jArr[i7]) | ((-1) - (~(255 << i8)))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(ObjectFloatMap<K> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.keys;
        float[] fArr = from.values;
        long[] jArr = from.metadata;
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
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                        int i5 = (i2 << 3) + i4;
                        set(objArr[i5], fArr[i5]);
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
            if ((((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2))) & (-9187201950435737472L)) != -9187201950435737472L) {
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
            long j9 = j8 - ScatterMapKt.BitmaskLsb;
            long j10 = ~j8;
            for (long j11 = (-1) - (((-1) - ((j10 + j9) - (j10 | j9))) | ((-1) - (-9187201950435737472L))); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = i6 + (Long.numberOfTrailingZeros(j11) >> 3);
                int i10 = (iNumberOfTrailingZeros + i5) - (iNumberOfTrailingZeros | i5);
                if (Intrinsics.areEqual(this.keys[i10], k2)) {
                    return i10;
                }
            }
            if ((((-1) - (((-1) - ((~j6) << 6)) | ((-1) - j6))) & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                if (this.growthLimit == 0 && (-1) - (((-1) - (this.metadata[iFindFirstAvailableSlot >> 3] >> ((7 & iFindFirstAvailableSlot) << 3))) | ((-1) - 255)) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                }
                this._size++;
                int i11 = iFindFirstAvailableSlot >> 3;
                int i12 = (7 & iFindFirstAvailableSlot) << 3;
                this.growthLimit -= ((this.metadata[i11] >> i12) & 255) != 128 ? 0 : 1;
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
