package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
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
/* JADX INFO: compiled from: IntSet.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4C\u0007\":\u001b\u007f\u0007lkA0RxP\u008cZS8\u000fs{:6c$\u007fJC٥0ԂR\t}M(t~P`\u000bQ\u000f\u001e\u0016'k߽MU\u0007_Z\u001b@F\b?aR AGf\r63!z.F\u0001\u001d\u0001H/x\u0014\u0005\u0003[K:\u0011xL~Aj\r{\nJ\u0016\u0014F8\u0001Le0TDR\u0005]h:i\u00032F\\3w0+XULb4%v\u0010)q@\u007fC#3k\u00035S\fC\u0011E\n=3im'sW\u0002fNX.\u0015E/]\u001durT]KQ)\u00125<gcy[T(@\t\n\u001fT\u0004<\u0011WL<@2f6\u000fyt;aNd\u001a^p\u000b+eD\u0017=\u007fa,\u007f\u001b/`oP1Ne\u00075\u0011,+\u0019nOZ\u001bל`]*b\ri1\u007fKmL\\\u0010q=\u001c\u00057î\u0002r\u0013>\\\u0018/*\u001c^\u001b3?s9Q*2ȼH\rv\u0005\u001bxh\u0002t\u0003LN*\u0007\u0016e)OȸZ\rs\u0013\u0002hT\u00077AQ*Z\u001f}6\u0014fφw\u000503&fO\u0017t\u001bQk\u0012=/\u0015@ ʫkVcGuK5\u007fh@e`|,?jcMdtZk\f\taX&@P\u0003\u0010&z\rZ\u001a+J? !d0?!t\u0015v\ffPO\u0016!_\ts@\u0003bM<\u0003\u0018%;\tI^j\f\bg'T\\\u0001n>EA\u007f6_&\u001e(vQ\u0015#5\u007f:\u0005\u0010~ZedlD\u0001\u0006\u007f.029\u007f0m\u0017\u001d\u001eA20M\fɦx6][\u0015?z+ze\u0093t\u05cek\brѱރd\f"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.DG}/\r", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &5o\u001d\u0012", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "5q^Dg/%W!\u0003\n", "/cS", "", "3kT:X5M", "/cS\u000e_3", "3kT:X5Ma", "", "/cYBf;,b#\fv`,", "", "1kT.e", "2q^=7,ES(~\t", "4h]14)L] \u000f\n^\u0010\u0006\u0017/r\u000f\f\u0005?\u0001*", "4h]190Ka(Z\fZ0\u0004\u0005,l\u007f\u0016\u0003J\u0010", "6`b5$", "7mXA\\(EW.~\\k6\u000f\u00182", "7mXA\\(EW.~b^;x\b+t{", "1`_.V0Mg", "7mXA\\(EW.~hm6\n\u00051e", ";h]Bf\bLa\u001d\u0001\u0004", ">kd@4:LW\u001b\b", "@d\\<i,", "@d\\<i,\u001aZ ", "@d\\<i,\u001eZ\u0019\u0007zg;X\u0018", "7mS2k", "@db6m,,b#\fv`,", "<df\u0010T7:Q\u001d\u000e\u000f", "BqX:", "EqXAX\u0014>b\u0015}vm(", "D`[BX", "", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableIntSet extends IntSet {
    private int growthLimit;

    public MutableIntSet() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableIntSet(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 + 1) - (i3 | 1) != 0 ? 6 : i2);
    }

    public MutableIntSet(int i2) {
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
        this.elements = new int[iMax];
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
        long j2 = jArr2[i3];
        long j3 = 255 << ((i2 & 7) << 3);
        long j4 = ~j3;
        long j5 = (j2 + j4) - (j2 | j4);
        jArr2[i3] = (j5 + j3) - (j5 & j3);
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    public final boolean add(int i2) {
        int i3 = this._size;
        this.elements[findAbsoluteInsertIndex(i2)] = i2;
        return this._size != i3;
    }

    public final void plusAssign(int i2) {
        this.elements[findAbsoluteInsertIndex(i2)] = i2;
    }

    public final boolean addAll(int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        plusAssign(elements);
        return i2 != this._size;
    }

    public final boolean addAll(IntSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        plusAssign(elements);
        return i2 != this._size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008f, code lost:
    
        r0 = (~r4) << 6;
        r11 = (r4 + r0) - (r4 | r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009d, code lost:
    
        if (((r11 - 9187201950435737472L) - (r11 | (-9187201950435737472L))) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(int r23) {
        /*
            r22 = this;
            r9 = r22
            r8 = r9
            androidx.collection.IntSet r8 = (androidx.collection.IntSet) r8
            r10 = r23
            int r2 = java.lang.Integer.hashCode(r10)
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r0
            int r0 = r2 << 16
            r2 = r2 ^ r0
            r0 = 127(0x7f, float:1.78E-43)
            int r1 = (-1) - r2
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r7 = (-1) - r1
            int r6 = r8._capacity
            int r21 = r2 >>> 7
            r21 = r21 & r6
            r20 = 0
        L23:
            long[] r3 = r8.metadata
            int r2 = r21 >> 3
            r0 = 7
            int r1 = r21 + r0
            r0 = r21 | r0
            int r1 = r1 - r0
            int r1 = r1 << 3
            r11 = r3[r2]
            long r11 = r11 >>> r1
            r19 = 1
            int r2 = r2 + r19
            r4 = r3[r2]
            int r0 = 64 - r1
            long r4 = r4 << r0
            long r2 = (long) r1
            long r0 = -r2
            r2 = 63
            long r0 = r0 >> r2
            long r4 = r4 & r0
            long r4 = r4 | r11
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r11 = r2 - r0
            long r0 = ~r2
            long r2 = r0 + r11
            long r0 = r0 | r11
            long r2 = r2 - r0
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r15 = r2 + r17
            long r2 = r2 | r17
            long r15 = r15 - r2
        L5b:
            r13 = 0
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 == 0) goto L8f
            int r0 = java.lang.Long.numberOfTrailingZeros(r15)
            int r0 = r0 >> 3
            int r0 = r0 + r21
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r1 = (-1) - r1
            int[] r0 = r8.elements
            r0 = r0[r1]
            if (r0 != r10) goto L81
        L76:
            if (r1 < 0) goto L7e
        L78:
            if (r19 == 0) goto L7d
            r9.removeElementAt(r1)
        L7d:
            return r19
        L7e:
            r19 = 0
            goto L78
        L81:
            r0 = 1
            long r13 = r15 - r0
            r11 = -1
            long r2 = r11 - r15
            long r0 = r11 - r13
            long r2 = r2 | r0
            long r11 = r11 - r2
            r15 = r11
            goto L5b
        L8f:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r11 = r4 + r0
            long r4 = r4 | r0
            long r11 = r11 - r4
            long r1 = r11 + r17
            long r11 = r11 | r17
            long r1 = r1 - r11
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto La1
            r1 = -1
            goto L76
        La1:
            int r20 = r20 + 8
            int r21 = r21 + r20
            r21 = r21 & r6
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableIntSet.remove(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0085, code lost:
    
        r0 = (~r4) << 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0090, code lost:
    
        if ((((r4 + r0) - (r4 | r0)) & (-9187201950435737472L)) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0092, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void minusAssign(int r22) {
        /*
            r21 = this;
            r10 = r21
            r8 = r10
            androidx.collection.IntSet r8 = (androidx.collection.IntSet) r8
            r9 = r22
            int r2 = java.lang.Integer.hashCode(r9)
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r0
            int r0 = r2 << 16
            r2 = r2 ^ r0
            r0 = 127(0x7f, float:1.78E-43)
            int r1 = (-1) - r2
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r7 = (-1) - r1
            int r6 = r8._capacity
            int r20 = r2 >>> 7
            r20 = r20 & r6
            r19 = 0
        L23:
            long[] r3 = r8.metadata
            int r2 = r20 >> 3
            r0 = 7
            r0 = r20 & r0
            int r1 = r0 << 3
            r13 = r3[r2]
            long r13 = r13 >>> r1
            int r0 = r2 + 1
            r11 = r3[r0]
            int r0 = 64 - r1
            long r11 = r11 << r0
            long r2 = (long) r1
            long r0 = -r2
            r2 = 63
            long r0 = r0 >> r2
            long r4 = r11 + r0
            long r11 = r11 | r0
            long r4 = r4 - r11
            long r4 = r4 | r13
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r11 = r2 - r0
            long r0 = ~r2
            long r0 = r0 & r11
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r15 = -1
            long r2 = r15 - r0
            long r0 = r15 - r17
            long r2 = r2 | r0
            long r15 = r15 - r2
        L59:
            r11 = 0
            int r0 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r0 == 0) goto L85
            int r0 = java.lang.Long.numberOfTrailingZeros(r15)
            int r0 = r0 >> 3
            int r0 = r0 + r20
            int r1 = r0 + r6
            r0 = r0 | r6
            int r1 = r1 - r0
            int[] r0 = r8.elements
            r0 = r0[r1]
            if (r0 != r9) goto L77
        L71:
            if (r1 < 0) goto L76
            r10.removeElementAt(r1)
        L76:
            return
        L77:
            r0 = 1
            long r13 = r15 - r0
            r11 = -1
            long r2 = r11 - r15
            long r0 = r11 - r13
            long r2 = r2 | r0
            long r11 = r11 - r2
            r15 = r11
            goto L59
        L85:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r2 = r4 + r0
            long r4 = r4 | r0
            long r2 = r2 - r4
            long r2 = r2 & r17
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto L94
            r1 = -1
            goto L71
        L94:
            int r19 = r19 + 8
            int r20 = r20 + r19
            r20 = r20 & r6
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableIntSet.minusAssign(int):void");
    }

    public final boolean removeAll(int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        minusAssign(elements);
        return i2 != this._size;
    }

    public final boolean removeAll(IntSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        minusAssign(elements);
        return i2 != this._size;
    }

    private final void removeElementAt(int i2) {
        this._size--;
        long[] jArr = this.metadata;
        int i3 = this._capacity;
        int i4 = i2 >> 3;
        int i5 = (7 & i2) << 3;
        long j2 = ((-1) - (((-1) - jArr[i4]) | ((-1) - (~(255 << i5))))) | (254 << i5);
        jArr[i4] = j2;
        jArr[(((-1) - (((-1) - (i2 - 7)) | ((-1) - i3))) + ((i3 + 7) - (i3 | 7))) >> 3] = j2;
    }

    public final void clear() {
        this._size = 0;
        if (this.metadata != ScatterMapKt.EmptyGroup) {
            ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr = this.metadata;
            int i2 = this._capacity;
            int i3 = i2 >> 3;
            long j2 = 255 << (((-1) - (((-1) - i2) | ((-1) - 7))) << 3);
            jArr[i3] = ((-1) - (((-1) - jArr[i3]) | ((-1) - (~j2)))) | j2;
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
            int i7 = ((i4 + 7) - (i4 | 7)) << 3;
            long j2 = ((-1) - (((-1) - (jArr[i6 + 1] << (64 - i7))) | ((-1) - ((-i7) >> 63)))) | (jArr[i6] >>> i7);
            long j3 = (~j2) << 7;
            long j4 = ((j2 + j3) - (j2 | j3)) & (-9187201950435737472L);
            if (j4 != 0) {
                int iNumberOfTrailingZeros = i4 + (Long.numberOfTrailingZeros(j4) >> 3);
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
        int[] iArr = this.elements;
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
                    int i8 = i7 & i2;
                    int i9 = ((-1) - (((-1) - (iFindFirstAvailableSlot - i8)) | ((-1) - i2))) / 8;
                    int i10 = i3 - i8;
                    if (i9 == ((i10 + i2) - (i10 | i2)) / 8) {
                        jArr[i4] = (((long) ((i6 + 127) - (i6 | 127))) << i5) | ((-1) - (((-1) - (~(255 << i5))) | ((-1) - jArr[i4])));
                        jArr[ArraysKt.getLastIndex(jArr)] = (jArr[c2] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i11 = iFindFirstAvailableSlot >> 3;
                        long j3 = jArr[i11];
                        int i12 = ((iFindFirstAvailableSlot + 7) - (iFindFirstAvailableSlot | 7)) << 3;
                        if ((-1) - (((-1) - (j3 >> i12)) | ((-1) - 255)) != 128) {
                            long j4 = j3 & (~(255 << i12));
                            long j5 = ((long) ((-1) - (((-1) - i6) | ((-1) - 127)))) << i12;
                            jArr[i11] = (j5 + j4) - (j5 & j4);
                            if (iFindEmptySlot == -1) {
                                iFindEmptySlot = ScatterMapKt.findEmptySlot(jArr, i3 + 1, i2);
                            }
                            iArr[iFindEmptySlot] = iArr[iFindFirstAvailableSlot];
                            iArr[iFindFirstAvailableSlot] = iArr[i3];
                            iArr[i3] = iArr[iFindEmptySlot];
                            i3--;
                        } else {
                            long j6 = j3 & (~(255 << i12));
                            long j7 = ((long) ((-1) - (((-1) - i6) | ((-1) - 127)))) << i12;
                            jArr[i11] = (j7 + j6) - (j7 & j6);
                            long j8 = (-1) - (((-1) - jArr[i4]) | ((-1) - (~(255 << i5))));
                            long j9 = 128 << i5;
                            jArr[i4] = (j8 + j9) - (j8 & j9);
                            iArr[iFindFirstAvailableSlot] = iArr[i3];
                            iArr[i3] = 0;
                            iFindEmptySlot = i3;
                        }
                        int lastIndex = ArraysKt.getLastIndex(jArr);
                        c2 = 0;
                        long j10 = jArr[0];
                        jArr[lastIndex] = (-1) - (((-1) - ((j10 + 72057594037927935L) - (j10 | 72057594037927935L))) & ((-1) - Long.MIN_VALUE));
                        i3++;
                    }
                }
                i3++;
            }
        }
        initializeGrowth();
    }

    private final void resizeStorage(int i2) {
        long[] jArr = this.metadata;
        int[] iArr = this.elements;
        int i3 = this._capacity;
        initializeStorage(i2);
        long[] jArr2 = this.metadata;
        int[] iArr2 = this.elements;
        int i4 = this._capacity;
        for (int i5 = 0; i5 < i3; i5++) {
            if (((jArr[i5 >> 3] >> (((i5 + 7) - (7 | i5)) << 3)) & 255) < 128) {
                int i6 = iArr[i5];
                int iHashCode = Integer.hashCode(i6) * ScatterMapKt.MurmurHashC1;
                int i7 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i7 >>> 7);
                int i8 = iFindFirstAvailableSlot >> 3;
                int i9 = ((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3;
                long j2 = jArr2[i8];
                long j3 = ~(255 << i9);
                long j4 = (j2 + j3) - (j2 | j3);
                long j5 = ((long) (i7 & 127)) << i9;
                long j6 = (j4 + j5) - (j4 & j5);
                jArr2[i8] = j6;
                jArr2[(((iFindFirstAvailableSlot - 7) & i4) + ((-1) - (((-1) - i4) | ((-1) - 7)))) >> 3] = j6;
                iArr2[iFindFirstAvailableSlot] = i6;
            }
        }
    }

    private final void writeMetadata(int i2, long j2) {
        long[] jArr = this.metadata;
        int i3 = i2 >> 3;
        int i4 = (i2 & 7) << 3;
        jArr[i3] = ((-1) - (((-1) - jArr[i3]) | ((-1) - (~(255 << i4))))) | (j2 << i4);
        int i5 = this._capacity;
        int i6 = ((-1) - (((-1) - (i2 - 7)) | ((-1) - i5))) + ((i5 + 7) - (i5 | 7));
        int i7 = i6 >> 3;
        int i8 = ((i6 + 7) - (i6 | 7)) << 3;
        long j3 = jArr[i7] & (~(255 << i8));
        long j4 = j2 << i8;
        jArr[i7] = (j4 + j3) - (j4 & j3);
    }

    public final void plusAssign(int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (int i2 : elements) {
            plusAssign(i2);
        }
    }

    public final void plusAssign(IntSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int[] iArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            long j3 = ((~j2) << 7) & j2;
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                        plusAssign(iArr[(i2 << 3) + i4]);
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

    public final void minusAssign(int[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (int i2 : elements) {
            minusAssign(i2);
        }
    }

    public final void minusAssign(IntSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int[] iArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        minusAssign(iArr[(i2 << 3) + i4]);
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

    private final int findAbsoluteInsertIndex(int i2) {
        int iHashCode = Integer.hashCode(i2) * ScatterMapKt.MurmurHashC1;
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 >>> 7;
        int i5 = (-1) - (((-1) - i3) | ((-1) - 127));
        int i6 = this._capacity;
        int i7 = (-1) - (((-1) - i4) | ((-1) - i6));
        int i8 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i9 = i7 >> 3;
            int i10 = ((-1) - (((-1) - i7) | ((-1) - 7))) << 3;
            long j2 = jArr[i9] >>> i10;
            long j3 = jArr[i9 + 1] << (64 - i10);
            long j4 = (-i10) >> 63;
            long j5 = (-1) - (((-1) - ((j3 + j4) - (j3 | j4))) & ((-1) - j2));
            long j6 = i5;
            long j7 = j5 ^ (j6 * ScatterMapKt.BitmaskLsb);
            long j8 = j7 - ScatterMapKt.BitmaskLsb;
            long j9 = ~j7;
            long j10 = (j9 + j8) - (j9 | j8);
            for (long j11 = (j10 - 9187201950435737472L) - (j10 | (-9187201950435737472L)); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i7) & i6;
                if (this.elements[iNumberOfTrailingZeros] == i2) {
                    return iNumberOfTrailingZeros;
                }
            }
            long j12 = (~j5) << 6;
            long j13 = (j12 + j5) - (j12 | j5);
            if ((j13 - 9187201950435737472L) - (j13 | (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i4);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> (((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3)) & 255) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i4);
                }
                this._size++;
                int i11 = iFindFirstAvailableSlot >> 3;
                int i12 = ((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3;
                this.growthLimit -= (-1) - (((-1) - (this.metadata[i11] >> i12)) | ((-1) - 255)) != 128 ? 0 : 1;
                long[] jArr2 = this.metadata;
                int i13 = this._capacity;
                long j14 = (-1) - (((-1) - ((~(255 << i12)) & jArr2[i11])) & ((-1) - (j6 << i12)));
                jArr2[i11] = j14;
                int i14 = iFindFirstAvailableSlot - 7;
                jArr2[(((i14 + i13) - (i14 | i13)) + ((i13 + 7) - (i13 | 7))) >> 3] = j14;
                return iFindFirstAvailableSlot;
            }
            i8 += 8;
            int i15 = i7 + i8;
            i7 = (i15 + i6) - (i15 | i6);
        }
    }
}
