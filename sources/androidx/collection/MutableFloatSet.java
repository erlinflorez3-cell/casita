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
/* JADX INFO: compiled from: FloatSet.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4C\u0007\":\u001b\u007fјnjG5LeN.ZS8!sڔ<$i$yCAg\"}0\u0010WȞ}˧\u001fJ\t\n\u0004\u001c\u0016\u001c~j:Imx\f\u0013Ƥ6B}A{Y}AQ`#;5$@(Py3\bb6V\u0018\u000fzqP<\u0016>I\t:\u0001\f\u0016\u0011(\u001a\u001e>N\u0006N`uWNH\u001bg\u000351\u000e\u0002B|3&0EQ\u001bSl';\u0003*$9NO5C1\u001a\u0003O`iN\u001b? >5l5-CI\"^|XH\"#;g\r\fsV`\u0013bx\fU,\u0016c\u0014V\u001c:\u0010z*\u0019\u0003\u0004V\u00145[F-Hr8\u0012A\t\u000bSnQH^\u000b\u000e\tvN\u0017S\fc/G\u001b~Q\u0010<_N\u007f\u000b\u0013#6#/zQ_b\u0017x\u0015IS>Ί1\u001aOK^f\n\bI\u001e\b~h\u001a*27\u000eĐ/D <-=7\nES%y\u000b`D\u0016\u0001K¢h\u001cx`_X\"\u001d\"g.\u0017\u0015rD\u0013\u00042³T!;\u001fd4T5\n8\u0017.b\u0010<O,VʡO1xxdu\nS;\u0017;gw\u0004\u000e\u0006C%گ5\u001ao\u001eyjvBDlf\u0013^~B\u0002\u0013#h6;JH\u0019\u0015(\u007fRW$\u0013`>:(BEI\u0019\u000b\u001ax\u0007,KY|7i#v\u001e\u0019l3R\u000f\u001a(\u0003$\u0019P\u000bq6gAW:\u0019x\"[M\u00029'Cm\"\u00175C#O\u0005\u0002\u001e_gzH\u0013q^\rc\u001b8\u0016HE\u00023K.'~W321Sl\u000be\u007fnX\u0600\u0001M\u0006\u001d>\u0001.\u0016\tAѴ8߯nJWܷЈ&\u0019"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<W,?U\r\u000e7|k", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\na\u001e!C~{<\u0006z", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "5q^Dg/%W!\u0003\n", "/cS", "", "3kT:X5M", "", "/cS\u000e_3", "3kT:X5Ma", "", "/cYBf;,b#\fv`,", "", "1kT.e", "2q^=7,ES(~\t", "4h]14)L] \u000f\n^\u0010\u0006\u0017/r\u000f\f\u0005?\u0001*", "4h]190Ka(Z\fZ0\u0004\u0005,l\u007f\u0016\u0003J\u0010", "6`b5$", "7mXA\\(EW.~\\k6\u000f\u00182", "7mXA\\(EW.~b^;x\b+t{", "1`_.V0Mg", "7mXA\\(EW.~hm6\n\u00051e", ";h]Bf\bLa\u001d\u0001\u0004", ">kd@4:LW\u001b\b", "@d\\<i,", "@d\\<i,\u001aZ ", "@d\\<i,\u001eZ\u0019\u0007zg;X\u0018", "7mS2k", "@db6m,,b#\fv`,", "<df\u0010T7:Q\u001d\u000e\u000f", "BqX:", "EqXAX\u0014>b\u0015}vm(", "D`[BX", "", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableFloatSet extends FloatSet {
    private int growthLimit;

    public MutableFloatSet() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableFloatSet(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i3) | ((-1) - 1)) != 0 ? 6 : i2);
    }

    public MutableFloatSet(int i2) {
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
        this.elements = new float[iMax];
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
        jArr2[i3] = ((-1) - (((-1) - jArr2[i3]) | ((-1) - (~j2)))) | j2;
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    public final boolean add(float f2) {
        int i2 = this._size;
        this.elements[findAbsoluteInsertIndex(f2)] = f2;
        return this._size != i2;
    }

    public final void plusAssign(float f2) {
        this.elements[findAbsoluteInsertIndex(f2)] = f2;
    }

    public final boolean addAll(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        plusAssign(elements);
        return i2 != this._size;
    }

    public final boolean addAll(FloatSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        plusAssign(elements);
        return i2 != this._size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008e, code lost:
    
        r4 = r4 & ((~r4) << 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        if (((r4 - 9187201950435737472L) - (r4 | (-9187201950435737472L))) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(float r21) {
        /*
            r20 = this;
            r9 = r20
            r8 = r9
            androidx.collection.FloatSet r8 = (androidx.collection.FloatSet) r8
            int r1 = java.lang.Float.hashCode(r21)
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r0 = 127(0x7f, float:1.78E-43)
            int r7 = r1 + r0
            r0 = r0 | r1
            int r7 = r7 - r0
            int r6 = r8._capacity
            int r0 = r1 >>> 7
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r19 = (-1) - r1
            r18 = 0
            r17 = r18
        L25:
            long[] r3 = r8.metadata
            int r2 = r19 >> 3
            r0 = 7
            r0 = r19 & r0
            int r1 = r0 << 3
            r12 = r3[r2]
            long r12 = r12 >>> r1
            r16 = 1
            int r2 = r2 + r16
            r10 = r3[r2]
            int r0 = 64 - r1
            long r10 = r10 << r0
            long r2 = (long) r1
            long r0 = -r2
            r2 = 63
            long r0 = r0 >> r2
            long r4 = r10 + r0
            long r10 = r10 | r0
            long r4 = r4 - r10
            long r4 = r4 | r12
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r12 = r2 - r0
            long r0 = ~r2
            long r10 = r0 + r12
            long r0 = r0 | r12
            long r10 = r10 - r0
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = -1
            long r2 = r12 - r10
            long r0 = r12 - r14
            long r2 = r2 | r0
            long r12 = r12 - r2
        L60:
            r10 = 0
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto L8e
            int r0 = java.lang.Long.numberOfTrailingZeros(r12)
            int r0 = r0 >> 3
            int r0 = r0 + r19
            int r1 = r0 + r6
            r0 = r0 | r6
            int r1 = r1 - r0
            float[] r0 = r8.elements
            r0 = r0[r1]
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 != 0) goto L84
        L7a:
            if (r1 < 0) goto L7e
            r18 = r16
        L7e:
            if (r18 == 0) goto L83
            r9.removeElementAt(r1)
        L83:
            return r18
        L84:
            r0 = 1
            long r2 = r12 - r0
            long r0 = r12 + r2
            long r12 = r12 | r2
            long r0 = r0 - r12
            r12 = r0
            goto L60
        L8e:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r4 = r4 & r0
            long r1 = r4 + r14
            long r4 = r4 | r14
            long r1 = r1 - r4
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L9c
            r1 = -1
            goto L7a
        L9c:
            int r17 = r17 + 8
            int r19 = r19 + r17
            r19 = r19 & r6
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableFloatSet.remove(float):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0098, code lost:
    
        if (((-1) - (((-1) - ((-1) - (((-1) - r4) | ((-1) - ((~r4) << 6))))) | ((-1) - (-9187201950435737472L)))) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009a, code lost:
    
        r3 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void minusAssign(float r21) {
        /*
            r20 = this;
            r9 = r20
            r8 = r9
            androidx.collection.FloatSet r8 = (androidx.collection.FloatSet) r8
            int r1 = java.lang.Float.hashCode(r21)
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r0 = 127(0x7f, float:1.78E-43)
            r7 = r1 & r0
            int r6 = r8._capacity
            int r0 = r1 >>> 7
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r19 = (-1) - r1
            r18 = 0
        L21:
            long[] r3 = r8.metadata
            int r2 = r19 >> 3
            r0 = 7
            r0 = r19 & r0
            int r1 = r0 << 3
            r14 = r3[r2]
            long r14 = r14 >>> r1
            int r0 = r2 + 1
            r12 = r3[r0]
            int r0 = 64 - r1
            long r12 = r12 << r0
            long r2 = (long) r1
            long r0 = -r2
            r2 = 63
            long r0 = r0 >> r2
            r10 = -1
            long r4 = r10 - r12
            long r2 = r10 - r0
            long r4 = r4 | r2
            long r10 = r10 - r4
            r4 = -1
            long r2 = r4 - r10
            long r0 = r4 - r14
            long r2 = r2 & r0
            long r4 = r4 - r2
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r10 = r2 - r0
            long r0 = ~r2
            long r0 = r0 & r10
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r16
        L5c:
            r14 = 0
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 == 0) goto L83
            int r2 = java.lang.Long.numberOfTrailingZeros(r0)
            int r3 = r2 >> 3
            int r3 = r3 + r19
            r3 = r3 & r6
            float[] r2 = r8.elements
            r2 = r2[r3]
            int r2 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r2 != 0) goto L79
        L73:
            if (r3 < 0) goto L78
            r9.removeElementAt(r3)
        L78:
            return
        L79:
            r2 = 1
            long r10 = r0 - r2
            long r2 = r0 + r10
            long r0 = r0 | r10
            long r2 = r2 - r0
            r0 = r2
            goto L5c
        L83:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            r12 = -1
            long r10 = r12 - r4
            long r2 = r12 - r0
            long r10 = r10 | r2
            long r12 = r12 - r10
            r4 = -1
            long r2 = r4 - r12
            long r0 = r4 - r16
            long r2 = r2 | r0
            long r4 = r4 - r2
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 == 0) goto L9c
            r3 = -1
            goto L73
        L9c:
            int r18 = r18 + 8
            int r19 = r19 + r18
            int r0 = r19 + r6
            r19 = r19 | r6
            int r0 = r0 - r19
            r19 = r0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableFloatSet.minusAssign(float):void");
    }

    public final boolean removeAll(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = this._size;
        minusAssign(elements);
        return i2 != this._size;
    }

    public final boolean removeAll(FloatSet elements) {
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
        long j2 = jArr[i4] & (~(255 << i5));
        long j3 = 254 << i5;
        long j4 = (j2 + j3) - (j2 & j3);
        jArr[i4] = j4;
        jArr[(((-1) - (((-1) - (i2 - 7)) | ((-1) - i3))) + (i3 & 7)) >> 3] = j4;
    }

    public final void clear() {
        this._size = 0;
        if (this.metadata != ScatterMapKt.EmptyGroup) {
            ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr = this.metadata;
            int i2 = this._capacity;
            int i3 = i2 >> 3;
            long j2 = 255 << (((i2 + 7) - (i2 | 7)) << 3);
            long j3 = (-1) - (((-1) - jArr[i3]) | ((-1) - (~j2)));
            jArr[i3] = (j3 + j2) - (j3 & j2);
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
            long j2 = ((-1) - (((-1) - (jArr[i6 + 1] << (64 - i7))) | ((-1) - ((-i7) >> 63)))) | (jArr[i6] >>> i7);
            long j3 = (-1) - (((-1) - (j2 & ((~j2) << 7))) | ((-1) - (-9187201950435737472L)));
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
        float[] fArr = this.elements;
        ScatterMapKt.convertMetadataForCleanup(jArr, i2);
        char c2 = 0;
        int i3 = 0;
        int iFindEmptySlot = -1;
        while (i3 != i2) {
            int i4 = i3 >> 3;
            int i5 = (7 & i3) << 3;
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
                    int i8 = (i7 + i2) - (i7 | i2);
                    int i9 = iFindFirstAvailableSlot - i8;
                    if (((i9 + i2) - (i9 | i2)) / 8 == ((i3 - i8) & i2) / 8) {
                        long j4 = (-1) - (((-1) - i6) | ((-1) - 127));
                        long j5 = (~(255 << i5)) & jArr[i4];
                        long j6 = j4 << i5;
                        jArr[i4] = (j6 + j5) - (j6 & j5);
                        int lastIndex = ArraysKt.getLastIndex(jArr);
                        long j7 = jArr[c2];
                        long j8 = (j7 + 72057594037927935L) - (j7 | 72057594037927935L);
                        jArr[lastIndex] = (j8 - Long.MIN_VALUE) - (j8 & Long.MIN_VALUE);
                    } else {
                        int i10 = iFindFirstAvailableSlot >> 3;
                        long j9 = jArr[i10];
                        int i11 = ((iFindFirstAvailableSlot + 7) - (iFindFirstAvailableSlot | 7)) << 3;
                        if ((-1) - (((-1) - (j9 >> i11)) | ((-1) - 255)) != 128) {
                            long j10 = j9 & (~(255 << i11));
                            long j11 = ((long) ((i6 + 127) - (i6 | 127))) << i11;
                            jArr[i10] = (j11 + j10) - (j11 & j10);
                            if (iFindEmptySlot == -1) {
                                iFindEmptySlot = ScatterMapKt.findEmptySlot(jArr, i3 + 1, i2);
                            }
                            fArr[iFindEmptySlot] = fArr[iFindFirstAvailableSlot];
                            fArr[iFindFirstAvailableSlot] = fArr[i3];
                            fArr[i3] = fArr[iFindEmptySlot];
                            i3--;
                        } else {
                            long j12 = ~(255 << i11);
                            jArr[i10] = (-1) - (((-1) - (((long) (i6 & 127)) << i11)) & ((-1) - ((j9 + j12) - (j9 | j12))));
                            jArr[i4] = (-1) - (((-1) - ((-1) - (((-1) - jArr[i4]) | ((-1) - (~(255 << i5)))))) & ((-1) - (128 << i5)));
                            fArr[iFindFirstAvailableSlot] = fArr[i3];
                            fArr[i3] = 0.0f;
                            iFindEmptySlot = i3;
                        }
                        int lastIndex2 = ArraysKt.getLastIndex(jArr);
                        c2 = 0;
                        long j13 = jArr[0] & 72057594037927935L;
                        jArr[lastIndex2] = (j13 - Long.MIN_VALUE) - (j13 & Long.MIN_VALUE);
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
        float[] fArr = this.elements;
        int i3 = this._capacity;
        initializeStorage(i2);
        long[] jArr2 = this.metadata;
        float[] fArr2 = this.elements;
        int i4 = this._capacity;
        for (int i5 = 0; i5 < i3; i5++) {
            long j2 = jArr[i5 >> 3] >> (((-1) - (((-1) - i5) | ((-1) - 7))) << 3);
            if ((j2 + 255) - (j2 | 255) < 128) {
                float f2 = fArr[i5];
                int iHashCode = Float.hashCode(f2) * ScatterMapKt.MurmurHashC1;
                int i6 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i6 >>> 7);
                int i7 = iFindFirstAvailableSlot >> 3;
                int i8 = ((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3;
                long j3 = jArr2[i7];
                long j4 = ~(255 << i8);
                long j5 = ((j3 + j4) - (j3 | j4)) | (((long) ((i6 + 127) - (i6 | 127))) << i8);
                jArr2[i7] = j5;
                int i9 = iFindFirstAvailableSlot - 7;
                jArr2[(((i9 + i4) - (i9 | i4)) + ((-1) - (((-1) - i4) | ((-1) - 7)))) >> 3] = j5;
                fArr2[iFindFirstAvailableSlot] = f2;
            }
        }
    }

    private final void writeMetadata(int i2, long j2) {
        long[] jArr = this.metadata;
        int i3 = i2 >> 3;
        int i4 = ((i2 + 7) - (7 | i2)) << 3;
        long j3 = jArr[i3];
        long j4 = ~(255 << i4);
        jArr[i3] = ((j3 + j4) - (j3 | j4)) | (j2 << i4);
        int i5 = this._capacity;
        int i6 = i2 - 7;
        int i7 = ((i6 + i5) - (i6 | i5)) + ((i5 + 7) - (i5 | 7));
        int i8 = i7 >> 3;
        int i9 = ((-1) - (((-1) - i7) | ((-1) - 7))) << 3;
        long j5 = jArr[i8] & (~(255 << i9));
        long j6 = j2 << i9;
        jArr[i8] = (j6 + j5) - (j6 & j5);
    }

    public final void plusAssign(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (float f2 : elements) {
            plusAssign(f2);
        }
    }

    public final void plusAssign(FloatSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        float[] fArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            long j3 = (~j2) << 7;
            long j4 = (j3 + j2) - (j3 | j2);
            if ((j4 - 9187201950435737472L) - (j4 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                        plusAssign(fArr[(i2 << 3) + i4]);
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

    public final void minusAssign(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (float f2 : elements) {
            minusAssign(f2);
        }
    }

    public final void minusAssign(FloatSet elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        float[] fArr = elements.elements;
        long[] jArr = elements.metadata;
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
                    if ((255 + j2) - (255 | j2) < 128) {
                        minusAssign(fArr[(i2 << 3) + i4]);
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

    private final int findAbsoluteInsertIndex(float f2) {
        int iHashCode = Float.hashCode(f2) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = (-1) - (((-1) - i2) | ((-1) - 127));
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
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i6) & i5;
                if (this.elements[iNumberOfTrailingZeros] == f2) {
                    return iNumberOfTrailingZeros;
                }
            }
            long j6 = ((~j2) << 6) & j2;
            if ((j6 - 9187201950435737472L) - (j6 | (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                if (this.growthLimit == 0) {
                    long j7 = this.metadata[iFindFirstAvailableSlot >> 3] >> ((7 & iFindFirstAvailableSlot) << 3);
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
                long j8 = (-1) - (((-1) - ((~(255 << i11)) & jArr2[i10])) & ((-1) - (j3 << i11)));
                jArr2[i10] = j8;
                int i13 = iFindFirstAvailableSlot - 7;
                jArr2[(((i13 + i12) - (i13 | i12)) + ((i12 + 7) - (i12 | 7))) >> 3] = j8;
                return iFindFirstAvailableSlot;
            }
            i7 += 8;
            i6 = (-1) - (((-1) - (i6 + i7)) | ((-1) - i5));
        }
    }
}
