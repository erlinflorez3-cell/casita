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
/* JADX INFO: compiled from: FloatObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&˛\bDZc|İI\u0006>\u00116B\u0005#4\u0012\u0006\u0007nj?2LeV3ZS0\u0011s{J$c$wHCU0}*\teNog|\\b\u000bI\u0015\u000e\u0016\u0007s4I[ye\u0012%2JoE:UoK@hҚLӌH4(\u0600\b\u00041 :J vABy\fR=Pv@R\u001bN\u001d\u001a@\b̧$\u0001,_0TDM\u0005]h5i\u00032F\\.w0+SULb/%v\u0010$q@\u007fC#.k\u00035T\fC\u0011I\n=3sm'sW\u0002cNX.\u0016E/]\u001aurT^KQ)159gc\u0002ִ>,\u0006\u0005\u0014\rj\u000f>\u00105WF3*h\u0018\u000eiο!c\u0007З\b\u0081Aȕѐe6%6H99K3f\u007fg\u0002\u0019\u0017E\n\u0018%\u001eQ\u0007\u001f%ih&`C\u001d\u001bw\u001a?_UUH|\u0010\nA{\u0005\tb0,J0\u0010\u000f=\u0012).E+g_G:9k0`\u000bϠ~Movi\u0002RvFRr$NB\t:s\u000bߦ\r4_bnD\u0011{\"\u0005\u000b\f\u0012+ \u000b\u0003\u0003Ơ-X]]~\u0002j{c:)=}OY\u001d\u0006TêA'HCl{\u0010\u0010X'\u001eMXz\u000bhhRSBȗ\u000b(hüP3+\u0006\u0019\\P\"\u0012hŭ\" B6I\u0019\u000b x\u0007,`Y|?ݠ˖l\u0010\rs{6\u0011\n<t7\u0007\u0001f~\f\u007f~Y.\r`XΊoQ},4v:jJ{YȔ/w\u000eQ\u007fLuW̡\u001auc\u001eh/(Zi/k6?\u00037<\u001a-sW#i_k*'1۠ɍ\u0013;vR0,x\u0016D`\u0019P\u007fj%H\u000fp\u0003%\u0018d.\u0005qH\u000bG\u001aҺ\u001b]NI!&\bc\u0015̂\u0003ŷ\u001eǇm\u0016}J\u00157CB]ݴF{\"X-a\fk6-ԃf\u000f4\u001f.\u0012:\u000f.o\u0011W\u000e6IdaY-@h$5\u001fPu\u0003w6H98\u001b=`A\u0013{\u0007<[)G}\u001d߿rݿpÆ_:!\u001eF8<\u000fBsq\u007f\\uQU)M\u0002m\u001eqY\u0006#J=\f;\u007f?\r*\u001ckQ\u001d̳hY<\u0014w06o=9ŠHʢ(44фލ\u000bH\\l\fإ+.Eݓ\u0013I"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<W,?U\r\n4r\u0016,\\+7v\n", "$", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\na\u001e!C~w9{%3he\u001cBC", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "5q^Dg/%W!\u0003\n", "/cYBf;,b#\fv`,", "", "1kT.e", "2q^=7,ES(~\t", "4h]14)L] \u000f\n^\u0010\u0006\u0017/r\u000f\f\u0005?\u0001*", "9dh", "", "4h]190Ka(Z\fZ0\u0004\u0005,l\u007f\u0016\u0003J\u0010", "6`b5$", "5dc\u001ce\u0017Nb", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uE;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHuzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "7mXA\\(EW.~\\k6\u000f\u00182", "7mXA\\(EW.~b^;x\b+t{", "1`_.V0Mg", "7mXA\\(EW.~hm6\n\u00051e", ";h]Bf\bLa\u001d\u0001\u0004", "9dh@", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\na\u001e!C~t@\u00054\u000b", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\na\u001e!C~{<\u0006z", "", ">kd@4:LW\u001b\b", "4q^:", ">tc", "D`[BX", "uE;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", ">tc\u000e_3", "@d\\<i,", "uE\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "", "uE;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "@d\\<i,\"T", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "@d\\<i,/O \u000fz:;", "7mS2k", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "@db6m,,b#\fv`,", "<df\u0010T7:Q\u001d\u000e\u000f", "Adc", "uE;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "BqX:", "EqXAX\u0014>b\u0015}vm(", "", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableFloatObjectMap<V> extends FloatObjectMap<V> {
    private int growthLimit;

    public MutableFloatObjectMap() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableFloatObjectMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i3) | ((-1) - 1)) != 0 ? 6 : i2);
    }

    public MutableFloatObjectMap(int i2) {
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
        this.values = new Object[iMax];
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
        long j3 = jArr2[i4] & (~j2);
        jArr2[i4] = (j3 + j2) - (j3 & j2);
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    public final V getOrPut(float f2, Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v2 = get(f2);
        if (v2 != null) {
            return v2;
        }
        V vInvoke = defaultValue.invoke();
        set(f2, vInvoke);
        return vInvoke;
    }

    public final void set(float f2, V v2) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(f2);
        this.keys[iFindAbsoluteInsertIndex] = f2;
        this.values[iFindAbsoluteInsertIndex] = v2;
    }

    public final V put(float f2, V v2) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(f2);
        V v3 = (V) this.values[iFindAbsoluteInsertIndex];
        this.keys[iFindAbsoluteInsertIndex] = f2;
        this.values[iFindAbsoluteInsertIndex] = v2;
        return v3;
    }

    public final void plusAssign(FloatObjectMap<V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0092, code lost:
    
        r4 = r4 & ((~r4) << 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009d, code lost:
    
        if (((r4 - 9187201950435737472L) - (r4 | (-9187201950435737472L))) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009f, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V remove(float r21) {
        /*
            r20 = this;
            r9 = r20
            r8 = r9
            androidx.collection.FloatObjectMap r8 = (androidx.collection.FloatObjectMap) r8
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
        L23:
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
            r4 = -1
            long r10 = r4 - r12
            long r2 = r4 - r0
            long r10 = r10 | r2
            long r4 = r4 - r10
            long r4 = r4 | r14
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r12 = r2 - r0
            long r0 = ~r2
            long r10 = r0 + r12
            long r0 = r0 | r12
            long r10 = r10 - r0
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r14 = -1
            long r2 = r14 - r10
            long r0 = r14 - r16
            long r2 = r2 | r0
            long r14 = r14 - r2
        L60:
            r10 = 0
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 == 0) goto L92
            int r0 = java.lang.Long.numberOfTrailingZeros(r14)
            int r0 = r0 >> 3
            int r0 = r0 + r19
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r1 = (-1) - r1
            float[] r0 = r8.keys
            r0 = r0[r1]
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 != 0) goto L84
        L7d:
            if (r1 < 0) goto Laf
            java.lang.Object r0 = r9.removeValueAt(r1)
            return r0
        L84:
            r0 = 1
            long r12 = r14 - r0
            r10 = -1
            long r2 = r10 - r14
            long r0 = r10 - r12
            long r2 = r2 | r0
            long r10 = r10 - r2
            r14 = r10
            goto L60
        L92:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r4 = r4 & r0
            long r1 = r4 + r16
            long r4 = r4 | r16
            long r1 = r1 - r4
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto La1
            r1 = -1
            goto L7d
        La1:
            int r18 = r18 + 8
            int r19 = r19 + r18
            int r0 = r19 + r6
            r19 = r19 | r6
            int r0 = r0 - r19
            r19 = r0
            goto L23
        Laf:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableFloatObjectMap.remove(float):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0099, code lost:
    
        r12 = (-1) - (((-1) - r4) | ((-1) - ((~r4) << 6)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ab, code lost:
    
        if (((r12 - 9187201950435737472L) - (r12 | (-9187201950435737472L))) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ad, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(float r25, V r26) {
        /*
            r24 = this;
            r8 = r24
            r7 = r8
            androidx.collection.FloatObjectMap r7 = (androidx.collection.FloatObjectMap) r7
            int r1 = java.lang.Float.hashCode(r25)
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r0 = 127(0x7f, float:1.78E-43)
            r9 = r1 & r0
            int r6 = r7._capacity
            int r0 = r1 >>> 7
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r23 = (-1) - r1
            r22 = 0
            r21 = r22
        L23:
            long[] r3 = r7.metadata
            int r2 = r23 >> 3
            r0 = 7
            int r1 = (-1) - r23
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            int r1 = r0 << 3
            r12 = r3[r2]
            long r12 = r12 >>> r1
            r20 = 1
            int r2 = r2 + r20
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
            long r2 = (long) r9
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r10 = r2 - r0
            long r0 = ~r2
            long r0 = r0 & r10
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r16 = r0 + r18
            long r0 = r0 | r18
            long r16 = r16 - r0
        L5e:
            r14 = 0
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 == 0) goto L99
            int r0 = java.lang.Long.numberOfTrailingZeros(r16)
            int r0 = r0 >> 3
            int r0 = r0 + r23
            int r1 = r0 + r6
            r0 = r0 | r6
            int r1 = r1 - r0
            float[] r0 = r7.keys
            r0 = r0[r1]
            int r0 = (r0 > r25 ? 1 : (r0 == r25 ? 0 : -1))
            if (r0 != 0) goto L8a
        L78:
            if (r1 < 0) goto Lbc
            java.lang.Object[] r0 = r8.values
            r0 = r0[r1]
            r2 = r26
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 == 0) goto Lbc
            r8.removeValueAt(r1)
            return r20
        L8a:
            r0 = 1
            long r12 = r16 - r0
            r10 = -1
            long r2 = r10 - r16
            long r0 = r10 - r12
            long r2 = r2 | r0
            long r10 = r10 - r2
            r16 = r10
            goto L5e
        L99:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            r12 = -1
            long r10 = r12 - r4
            long r2 = r12 - r0
            long r10 = r10 | r2
            long r12 = r12 - r10
            long r1 = r12 + r18
            long r12 = r12 | r18
            long r1 = r1 - r12
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 == 0) goto Laf
            r1 = -1
            goto L78
        Laf:
            int r21 = r21 + 8
            int r23 = r23 + r21
            int r1 = (-1) - r23
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r23 = (-1) - r1
            goto L23
        Lbc:
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableFloatObjectMap.remove(float, java.lang.Object):boolean");
    }

    public final void removeIf(Function2<? super Float, ? super V, Boolean> predicate) {
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
            long j4 = (j3 + j2) - (j3 | j2);
            if ((j4 - 9187201950435737472L) - (j4 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (predicate.invoke(Float.valueOf(this.keys[i5]), this.values[i5]).booleanValue()) {
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

    public final V removeValueAt(int i2) {
        this._size--;
        long[] jArr = this.metadata;
        int i3 = this._capacity;
        int i4 = i2 >> 3;
        int i5 = ((-1) - (((-1) - i2) | ((-1) - 7))) << 3;
        long j2 = jArr[i4];
        long j3 = ~(255 << i5);
        long j4 = (-1) - (((-1) - ((j2 + j3) - (j2 | j3))) & ((-1) - (254 << i5)));
        jArr[i4] = j4;
        int i6 = i2 - 7;
        jArr[(((i6 + i3) - (i6 | i3)) + (i3 & 7)) >> 3] = j4;
        V v2 = (V) this.values[i2];
        this.values[i2] = null;
        return v2;
    }

    public final void clear() {
        this._size = 0;
        if (this.metadata != ScatterMapKt.EmptyGroup) {
            ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr = this.metadata;
            int i2 = this._capacity;
            int i3 = i2 >> 3;
            long j2 = 255 << (((-1) - (((-1) - i2) | ((-1) - 7))) << 3);
            long j3 = (-1) - (((-1) - jArr[i3]) | ((-1) - (~j2)));
            jArr[i3] = (j3 + j2) - (j3 & j2);
        }
        ArraysKt.fill(this.values, (Object) null, 0, this._capacity);
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
            long j3 = jArr[i6 + 1] << (64 - i7);
            long j4 = (-i7) >> 63;
            long j5 = (-1) - (((-1) - ((j3 + j4) - (j3 | j4))) & ((-1) - j2));
            long j6 = (-1) - (((-1) - (j5 & ((~j5) << 7))) | ((-1) - (-9187201950435737472L)));
            if (j6 != 0) {
                return (i4 + (Long.numberOfTrailingZeros(j6) >> 3)) & i3;
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
        float[] fArr = this.keys;
        Object[] objArr = this.values;
        ScatterMapKt.convertMetadataForCleanup(jArr, i2);
        char c2 = 0;
        int i3 = 0;
        int iFindEmptySlot = -1;
        while (i3 != i2) {
            int i4 = i3 >> 3;
            int i5 = ((i3 + 7) - (7 | i3)) << 3;
            long j2 = (jArr[i4] >> i5) & 255;
            if (j2 == 128) {
                iFindEmptySlot = i3;
                i3++;
            } else {
                if (j2 == 254) {
                    int iHashCode = Float.hashCode(fArr[i3]) * ScatterMapKt.MurmurHashC1;
                    int i6 = iHashCode ^ (iHashCode << 16);
                    int i7 = i6 >>> 7;
                    int iFindFirstAvailableSlot = findFirstAvailableSlot(i7);
                    int i8 = i7 & i2;
                    if (((iFindFirstAvailableSlot - i8) & i2) / 8 == ((i3 - i8) & i2) / 8) {
                        long j3 = jArr[i4];
                        long j4 = ~(255 << i5);
                        long j5 = (j4 + j3) - (j4 | j3);
                        long j6 = ((long) ((-1) - (((-1) - i6) | ((-1) - 127)))) << i5;
                        jArr[i4] = (j6 + j5) - (j6 & j5);
                        int lastIndex = ArraysKt.getLastIndex(jArr);
                        long j7 = (-1) - (((-1) - jArr[c2]) | ((-1) - 72057594037927935L));
                        jArr[lastIndex] = (j7 - Long.MIN_VALUE) - (j7 & Long.MIN_VALUE);
                    } else {
                        int i9 = iFindFirstAvailableSlot >> 3;
                        long j8 = jArr[i9];
                        int i10 = ((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3;
                        long j9 = j8 >> i10;
                        if ((j9 + 255) - (j9 | 255) != 128) {
                            long j10 = (-1) - (((-1) - j8) | ((-1) - (~(255 << i10))));
                            long j11 = ((long) ((i6 + 127) - (i6 | 127))) << i10;
                            jArr[i9] = (j11 + j10) - (j11 & j10);
                            if (iFindEmptySlot == -1) {
                                iFindEmptySlot = ScatterMapKt.findEmptySlot(jArr, i3 + 1, i2);
                            }
                            fArr[iFindEmptySlot] = fArr[iFindFirstAvailableSlot];
                            fArr[iFindFirstAvailableSlot] = fArr[i3];
                            fArr[i3] = fArr[iFindEmptySlot];
                            objArr[iFindEmptySlot] = objArr[iFindFirstAvailableSlot];
                            objArr[iFindFirstAvailableSlot] = objArr[i3];
                            objArr[i3] = objArr[iFindEmptySlot];
                            i3--;
                        } else {
                            jArr[i9] = (-1) - (((-1) - (j8 & (~(255 << i10)))) & ((-1) - (((long) (i6 & 127)) << i10)));
                            long j12 = (-1) - (((-1) - jArr[i4]) | ((-1) - (~(255 << i5))));
                            long j13 = 128 << i5;
                            jArr[i4] = (j12 + j13) - (j12 & j13);
                            fArr[iFindFirstAvailableSlot] = fArr[i3];
                            fArr[i3] = 0.0f;
                            objArr[iFindFirstAvailableSlot] = objArr[i3];
                            objArr[i3] = null;
                            iFindEmptySlot = i3;
                        }
                        int lastIndex2 = ArraysKt.getLastIndex(jArr);
                        c2 = 0;
                        long j14 = jArr[0];
                        jArr[lastIndex2] = (-1) - (((-1) - ((j14 + 72057594037927935L) - (j14 | 72057594037927935L))) & ((-1) - Long.MIN_VALUE));
                        i3++;
                    }
                }
                i3++;
            }
        }
        initializeGrowth();
    }

    private final void resizeStorage(int i2) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = this;
        long[] jArr = mutableFloatObjectMap.metadata;
        float[] fArr = mutableFloatObjectMap.keys;
        Object[] objArr = mutableFloatObjectMap.values;
        int i3 = mutableFloatObjectMap._capacity;
        initializeStorage(i2);
        long[] jArr2 = mutableFloatObjectMap.metadata;
        float[] fArr2 = mutableFloatObjectMap.keys;
        Object[] objArr2 = mutableFloatObjectMap.values;
        int i4 = mutableFloatObjectMap._capacity;
        int i5 = 0;
        while (i5 < i3) {
            if (((jArr[i5 >> 3] >> (((i5 + 7) - (7 | i5)) << 3)) & 255) < 128) {
                float f2 = fArr[i5];
                int iHashCode = Float.hashCode(f2) * ScatterMapKt.MurmurHashC1;
                int i6 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableFloatObjectMap.findFirstAvailableSlot(i6 >>> 7);
                int i7 = iFindFirstAvailableSlot >> 3;
                int i8 = (iFindFirstAvailableSlot & 7) << 3;
                long j2 = (jArr2[i7] & (~(255 << i8))) | (((long) (i6 & 127)) << i8);
                jArr2[i7] = j2;
                int i9 = iFindFirstAvailableSlot - 7;
                jArr2[(((i9 + i4) - (i9 | i4)) + ((i4 + 7) - (7 | i4))) >> 3] = j2;
                fArr2[iFindFirstAvailableSlot] = f2;
                objArr2[iFindFirstAvailableSlot] = objArr[i5];
            }
            i5++;
            mutableFloatObjectMap = this;
        }
    }

    private final void writeMetadata(int i2, long j2) {
        long[] jArr = this.metadata;
        int i3 = i2 >> 3;
        int i4 = (7 & i2) << 3;
        long j3 = jArr[i3] & (~(255 << i4));
        long j4 = j2 << i4;
        jArr[i3] = (j3 + j4) - (j3 & j4);
        int i5 = this._capacity;
        int i6 = i2 - 7;
        int i7 = ((i6 + i5) - (i6 | i5)) + (i5 & 7);
        int i8 = i7 >> 3;
        int i9 = (i7 & 7) << 3;
        long j5 = (-1) - (((-1) - jArr[i8]) | ((-1) - (~(255 << i9))));
        long j6 = j2 << i9;
        jArr[i8] = (j6 + j5) - (j6 & j5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(FloatObjectMap<V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        float[] fArr = from.keys;
        Object[] objArr = from.values;
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
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                        int i5 = (i2 << 3) + i4;
                        set(fArr[i5], objArr[i5]);
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
            if ((-1) - (((-1) - (((~j2) << 7) & j2)) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
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

    private final int findAbsoluteInsertIndex(float f2) {
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
            int i9 = (i6 & 7) << 3;
            long j2 = (-1) - (((-1) - ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63))) & ((-1) - (jArr[i8] >>> i9)));
            long j3 = i4;
            long j4 = j2 ^ (j3 * ScatterMapKt.BitmaskLsb);
            for (long j5 = (-1) - (((-1) - ((~j4) & (j4 - ScatterMapKt.BitmaskLsb))) | ((-1) - (-9187201950435737472L))); j5 != 0; j5 &= j5 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i6) & i5;
                if (this.keys[iNumberOfTrailingZeros] == f2) {
                    return iNumberOfTrailingZeros;
                }
            }
            long j6 = (~j2) << 6;
            long j7 = (j6 + j2) - (j6 | j2);
            if ((j7 - 9187201950435737472L) - (j7 | (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> (((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3)) & 255) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                }
                this._size++;
                int i10 = iFindFirstAvailableSlot >> 3;
                int i11 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit -= (-1) - (((-1) - (this.metadata[i10] >> i11)) | ((-1) - 255)) != 128 ? 0 : 1;
                long[] jArr2 = this.metadata;
                int i12 = this._capacity;
                long j8 = jArr2[i10];
                long j9 = ~(255 << i11);
                long j10 = (-1) - (((-1) - ((j9 + j8) - (j9 | j8))) & ((-1) - (j3 << i11)));
                jArr2[i10] = j10;
                jArr2[(((iFindFirstAvailableSlot - 7) & i12) + (i12 & 7)) >> 3] = j10;
                return iFindFirstAvailableSlot;
            }
            i7 += 8;
            int i13 = i6 + i7;
            i6 = (i13 + i5) - (i13 | i5);
        }
    }
}
