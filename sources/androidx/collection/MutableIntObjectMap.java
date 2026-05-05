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
/* JADX INFO: compiled from: IntObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&˛\bDZc|İI\u0006>\u00116B\u0005#4\u0012\u0006\u0007nj?6Le^.ZS0\u0014s{J$c$\bCCU(\u0011*\tUTog|Sb\u000bI\u0010\u000e\u0016\u000fj4I[~e\u0012\u001d9JģU\u074cuqCʠnsf\u000b0428@\u0004/\u001ajU |\u0001CY\r*0nrĐV\r[\bb\u0018\u0014C8\u0001Lb.N~LzdR/Q\t2H\\/w0+SSF\u001d5\u001b\u007fy\u001eYBg9#/k\u00035T\"?KM\u007fH\u001dhU)[M\u0002cNX.\u0016[+\u00182k\u007f>\\;ĩ\u0011\u001055gcyR>2\u0006\t\u0014\u0013L\u0006\u001e\u0006]Ξ\\<`ǘ\u000eս2οɤW@^\u0012'H\u000e\fy6E+F3sG)xiai\u001f~;\n\u0018%\u001eQ\u00035!$b\u001ct-\u001b\u0003}\u00025_AUH|\f =6\u0013~w\u001a*26w\u0004=\u0012).E<}يAk0y\u0017`D\u0016|5dvi\u0002RvXhÉ\u001e\u007f9\u0017!rD\u0013\u000b\u001cTbbD\u0011{\u001e\u001bͼ\u0006P\".q\u0010<O+@R]~\u0002j{vPɟ7/Lg\t\u0004\u000e\u0006?\u000f=Cl{\u0016qT\u0007\u0014uֺ\u0011\u0005\u001fٯJ\u001c'hx@$HG!ݘ(\u007fRX$\u0013`A\" BII\u0019\u0013éȠ\u0007\u001eP_E\u001bmy\u0001\u0010-Zc.\u0011\u0005<z\u0019\u0003`\\'ב\u0016x\u0012?\u000b\u0001:/WPkӧVY0rL|Q\tҋw\u007fU\t\u0015`Z\r.u\u0004\u001eP\u001a(Ci/k\u0015?\u00037O\u001a-{ɣȌiQ[5o\u001f\u000b\u001e';\u00174\u0018\u001ex\u0016DrzL_TE$\u0007`\u0003#>ۭ\u0010{qF)i\u0012zQϼDЭqÅ\"Q\\_\u0015\u00075\u001d[˚ &\u000b]ECU\u001f\\vӄ3\u0015o~2}<#z\u000fTz\u0016\b:\u000e.o\u0011S$2\u0004TW\u0005\u0017>P*\u001d\u0007PR\u0003w6D98\u001bP`A\u001bݥ\u001dМMߵ3}t3t\u0011~\u0004s:AqFK<\u000eBsq\u0004DbQM)M\u0002i\u001eqYy#J=9Q֍7?\u001e*A8V\u0006d_ݸ\u0012֯\u001c6Iݥأ\u0005A\u0011':ʐl6\n\u0378X\u001a"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.DCz%7k%\u0016IN\u0011", "$", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &1l\u0013<t4\u001dU\tu", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "5q^Dg/%W!\u0003\n", "/cYBf;,b#\fv`,", "", "1kT.e", "2q^=7,ES(~\t", "4h]14)L] \u000f\n^\u0010\u0006\u0017/r\u000f\f\u0005?\u0001*", "9dh", "4h]190Ka(Z\fZ0\u0004\u0005,l\u007f\u0016\u0003J\u0010", "6`b5$", "5dc\u001ce\u0017Nb", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHuzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "7mXA\\(EW.~\\k6\u000f\u00182", "7mXA\\(EW.~b^;x\b+t{", "1`_.V0Mg", "7mXA\\(EW.~hm6\n\u00051e", ";h]Bf\bLa\u001d\u0001\u0004", "9dh@", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &.s\u001cKL", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &5o\u001d\u0012", "", ">kd@4:LW\u001b\b", "4q^:", ">tc", "D`[BX", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", ">tc\u000e_3", "@d\\<i,", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "@d\\<i,\"T", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "@d\\<i,/O \u000fz:;", "7mS2k", "@db6m,,b#\fv`,", "<df\u0010T7:Q\u001d\u000e\u000f", "Adc", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "BqX:", "EqXAX\u0014>b\u0015}vm(", "", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableIntObjectMap<V> extends IntObjectMap<V> {
    private int growthLimit;

    public MutableIntObjectMap() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableIntObjectMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 + 1) - (i3 | 1) != 0 ? 6 : i2);
    }

    public MutableIntObjectMap(int i2) {
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
        this.values = new Object[iMax];
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
        jArr2[i3] = (-1) - (((-1) - ((-1) - (((-1) - jArr2[i3]) | ((-1) - (~j2))))) & ((-1) - j2));
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    public final V getOrPut(int i2, Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v2 = get(i2);
        if (v2 != null) {
            return v2;
        }
        V vInvoke = defaultValue.invoke();
        set(i2, vInvoke);
        return vInvoke;
    }

    public final void set(int i2, V v2) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(i2);
        this.keys[iFindAbsoluteInsertIndex] = i2;
        this.values[iFindAbsoluteInsertIndex] = v2;
    }

    public final V put(int i2, V v2) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(i2);
        V v3 = (V) this.values[iFindAbsoluteInsertIndex];
        this.keys[iFindAbsoluteInsertIndex] = i2;
        this.values[iFindAbsoluteInsertIndex] = v2;
        return v3;
    }

    public final void plusAssign(IntObjectMap<V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0087, code lost:
    
        r0 = (~r4) << 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
    
        if ((((r4 + r0) - (r4 | r0)) & (-9187201950435737472L)) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V remove(int r20) {
        /*
            r19 = this;
            r10 = r19
            r8 = r10
            androidx.collection.IntObjectMap r8 = (androidx.collection.IntObjectMap) r8
            r9 = r20
            int r1 = java.lang.Integer.hashCode(r9)
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
            int r18 = (-1) - r1
            r17 = 0
        L25:
            long[] r3 = r8.metadata
            int r2 = r18 >> 3
            r0 = 7
            r0 = r18 & r0
            int r1 = r0 << 3
            r11 = r3[r2]
            long r11 = r11 >>> r1
            int r0 = r2 + 1
            r4 = r3[r0]
            int r0 = 64 - r1
            long r4 = r4 << r0
            long r2 = (long) r1
            long r0 = -r2
            r2 = 63
            long r0 = r0 >> r2
            long r2 = r4 + r0
            long r4 = r4 | r0
            long r2 = r2 - r4
            long r4 = r2 + r11
            long r2 = r2 & r11
            long r4 = r4 - r2
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r11 = r2 - r0
            long r0 = ~r2
            long r0 = r0 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = -1
            long r2 = r13 - r0
            long r0 = r13 - r15
            long r2 = r2 | r0
            long r13 = r13 - r2
        L5e:
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 == 0) goto L87
            int r0 = java.lang.Long.numberOfTrailingZeros(r13)
            int r0 = r0 >> 3
            int r0 = r0 + r18
            int r1 = r0 + r6
            r0 = r0 | r6
            int r1 = r1 - r0
            int[] r0 = r8.keys
            r0 = r0[r1]
            if (r0 != r9) goto L7d
        L76:
            if (r1 < 0) goto L9c
            java.lang.Object r0 = r10.removeValueAt(r1)
            return r0
        L7d:
            r0 = 1
            long r2 = r13 - r0
            long r0 = r13 + r2
            long r13 = r13 | r2
            long r0 = r0 - r13
            r13 = r0
            goto L5e
        L87:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r2 = r4 + r0
            long r4 = r4 | r0
            long r2 = r2 - r4
            long r2 = r2 & r15
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto L95
            r1 = -1
            goto L76
        L95:
            int r17 = r17 + 8
            int r18 = r18 + r17
            r18 = r18 & r6
            goto L25
        L9c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableIntObjectMap.remove(int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a4, code lost:
    
        r13 = (-1) - (((-1) - r4) | ((-1) - ((~r4) << 6)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b6, code lost:
    
        if (((r13 - 9187201950435737472L) - (r13 | (-9187201950435737472L))) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b8, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(int r25, V r26) {
        /*
            r24 = this;
            r9 = r24
            r8 = r9
            androidx.collection.IntObjectMap r8 = (androidx.collection.IntObjectMap) r8
            r10 = r25
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
            int r23 = r2 >>> 7
            r23 = r23 & r6
            r22 = 0
        L23:
            long[] r3 = r8.metadata
            int r2 = r23 >> 3
            r0 = 7
            int r1 = (-1) - r23
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            int r1 = r0 << 3
            r11 = r3[r2]
            long r11 = r11 >>> r1
            r21 = 1
            int r2 = r2 + r21
            r4 = r3[r2]
            int r0 = 64 - r1
            long r4 = r4 << r0
            long r2 = (long) r1
            long r0 = -r2
            r2 = 63
            long r0 = r0 >> r2
            long r2 = r4 + r0
            long r4 = r4 | r0
            long r2 = r2 - r4
            long r4 = r2 + r11
            long r2 = r2 & r11
            long r4 = r4 - r2
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r13 = r2 - r0
            long r0 = ~r2
            r11 = -1
            long r2 = r11 - r0
            long r0 = r11 - r13
            long r2 = r2 | r0
            long r11 = r11 - r2
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r17 = r11 + r19
            long r11 = r11 | r19
            long r17 = r17 - r11
        L68:
            r15 = 0
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto La4
            int r0 = java.lang.Long.numberOfTrailingZeros(r17)
            int r0 = r0 >> 3
            int r0 = r0 + r23
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r1 = (-1) - r1
            int[] r0 = r8.keys
            r0 = r0[r1]
            if (r0 != r10) goto L95
        L83:
            if (r1 < 0) goto Lc3
            java.lang.Object[] r0 = r9.values
            r0 = r0[r1]
            r2 = r26
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 == 0) goto Lc3
            r9.removeValueAt(r1)
            return r21
        L95:
            r0 = 1
            long r13 = r17 - r0
            r11 = -1
            long r2 = r11 - r17
            long r0 = r11 - r13
            long r2 = r2 | r0
            long r11 = r11 - r2
            r17 = r11
            goto L68
        La4:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            r13 = -1
            long r11 = r13 - r4
            long r2 = r13 - r0
            long r11 = r11 | r2
            long r13 = r13 - r11
            long r1 = r13 + r19
            long r13 = r13 | r19
            long r1 = r1 - r13
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 == 0) goto Lba
            r1 = -1
            goto L83
        Lba:
            r0 = 0
            int r22 = r22 + 8
            int r23 = r23 + r22
            r23 = r23 & r6
            goto L23
        Lc3:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableIntObjectMap.remove(int, java.lang.Object):boolean");
    }

    public final void removeIf(Function2<? super Integer, ? super V, Boolean> predicate) {
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
            if ((-1) - (((-1) - ((j3 + j2) - (j3 | j2))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 + j2) - (255 | j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (predicate.invoke(Integer.valueOf(this.keys[i5]), this.values[i5]).booleanValue()) {
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

    public final V removeValueAt(int i2) {
        this._size--;
        long[] jArr = this.metadata;
        int i3 = this._capacity;
        int i4 = i2 >> 3;
        int i5 = ((-1) - (((-1) - i2) | ((-1) - 7))) << 3;
        long j2 = (-1) - (((-1) - jArr[i4]) | ((-1) - (~(255 << i5))));
        long j3 = 254 << i5;
        long j4 = (j2 + j3) - (j2 & j3);
        jArr[i4] = j4;
        int i6 = i2 - 7;
        jArr[(((i6 + i3) - (i6 | i3)) + ((-1) - (((-1) - i3) | ((-1) - 7)))) >> 3] = j4;
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
            jArr[i3] = (-1) - (((-1) - ((-1) - (((-1) - jArr[i3]) | ((-1) - (~j2))))) & ((-1) - j2));
        }
        ArraysKt.fill(this.values, (Object) null, 0, this._capacity);
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
            long j3 = (~j2) << 7;
            long j4 = ((j2 + j3) - (j2 | j3)) & (-9187201950435737472L);
            if (j4 != 0) {
                return (i4 + (Long.numberOfTrailingZeros(j4) >> 3)) & i3;
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
        Object[] objArr = this.values;
        ScatterMapKt.convertMetadataForCleanup(jArr, i2);
        char c2 = 0;
        int i3 = 0;
        int iFindEmptySlot = -1;
        while (i3 != i2) {
            int i4 = i3 >> 3;
            int i5 = (7 & i3) << 3;
            long j2 = (jArr[i4] >> i5) & 255;
            if (j2 == 128) {
                iFindEmptySlot = i3;
                i3++;
            } else {
                if (j2 == 254) {
                    int iHashCode = Integer.hashCode(iArr[i3]) * ScatterMapKt.MurmurHashC1;
                    int i6 = iHashCode ^ (iHashCode << 16);
                    int i7 = i6 >>> 7;
                    int iFindFirstAvailableSlot = findFirstAvailableSlot(i7);
                    int i8 = (i7 + i2) - (i7 | i2);
                    int i9 = iFindFirstAvailableSlot - i8;
                    int i10 = i3 - i8;
                    if (((i9 + i2) - (i9 | i2)) / 8 == ((i10 + i2) - (i10 | i2)) / 8) {
                        long j3 = (-1) - (((-1) - (~(255 << i5))) | ((-1) - jArr[i4]));
                        long j4 = ((long) (i6 & 127)) << i5;
                        jArr[i4] = (j4 + j3) - (j4 & j3);
                        jArr[ArraysKt.getLastIndex(jArr)] = (-1) - (((-1) - (jArr[c2] & 72057594037927935L)) & ((-1) - Long.MIN_VALUE));
                    } else {
                        int i11 = iFindFirstAvailableSlot >> 3;
                        long j5 = jArr[i11];
                        int i12 = (iFindFirstAvailableSlot & 7) << 3;
                        long j6 = j5 >> i12;
                        if ((j6 + 255) - (j6 | 255) == 128) {
                            long j7 = j5 & (~(255 << i12));
                            long j8 = ((long) ((-1) - (((-1) - i6) | ((-1) - 127)))) << i12;
                            jArr[i11] = (j7 + j8) - (j7 & j8);
                            jArr[i4] = ((-1) - (((-1) - jArr[i4]) | ((-1) - (~(255 << i5))))) | (128 << i5);
                            iArr[iFindFirstAvailableSlot] = iArr[i3];
                            iArr[i3] = 0;
                            objArr[iFindFirstAvailableSlot] = objArr[i3];
                            objArr[i3] = null;
                            iFindEmptySlot = i3;
                        } else {
                            jArr[i11] = (-1) - (((-1) - (((long) ((i6 + 127) - (i6 | 127))) << i12)) & ((-1) - (j5 & (~(255 << i12)))));
                            if (iFindEmptySlot == -1) {
                                iFindEmptySlot = ScatterMapKt.findEmptySlot(jArr, i3 + 1, i2);
                            }
                            iArr[iFindEmptySlot] = iArr[iFindFirstAvailableSlot];
                            iArr[iFindFirstAvailableSlot] = iArr[i3];
                            iArr[i3] = iArr[iFindEmptySlot];
                            objArr[iFindEmptySlot] = objArr[iFindFirstAvailableSlot];
                            objArr[iFindFirstAvailableSlot] = objArr[i3];
                            objArr[i3] = objArr[iFindEmptySlot];
                            i3--;
                        }
                        int lastIndex = ArraysKt.getLastIndex(jArr);
                        c2 = 0;
                        long j9 = jArr[0];
                        jArr[lastIndex] = (-1) - (((-1) - ((j9 + 72057594037927935L) - (j9 | 72057594037927935L))) & ((-1) - Long.MIN_VALUE));
                        i3++;
                    }
                }
                i3++;
            }
        }
        initializeGrowth();
    }

    private final void resizeStorage(int i2) {
        MutableIntObjectMap<V> mutableIntObjectMap = this;
        long[] jArr = mutableIntObjectMap.metadata;
        int[] iArr = mutableIntObjectMap.keys;
        Object[] objArr = mutableIntObjectMap.values;
        int i3 = mutableIntObjectMap._capacity;
        initializeStorage(i2);
        long[] jArr2 = mutableIntObjectMap.metadata;
        int[] iArr2 = mutableIntObjectMap.keys;
        Object[] objArr2 = mutableIntObjectMap.values;
        int i4 = mutableIntObjectMap._capacity;
        int i5 = 0;
        while (i5 < i3) {
            if (((jArr[i5 >> 3] >> (((-1) - (((-1) - i5) | ((-1) - 7))) << 3)) & 255) < 128) {
                int i6 = iArr[i5];
                int iHashCode = Integer.hashCode(i6) * ScatterMapKt.MurmurHashC1;
                int i7 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableIntObjectMap.findFirstAvailableSlot(i7 >>> 7);
                long j2 = (i7 + 127) - (i7 | 127);
                int i8 = iFindFirstAvailableSlot >> 3;
                int i9 = ((iFindFirstAvailableSlot + 7) - (iFindFirstAvailableSlot | 7)) << 3;
                long j3 = jArr2[i8];
                long j4 = ~(255 << i9);
                long j5 = (j3 + j4) - (j3 | j4);
                long j6 = j2 << i9;
                long j7 = (j5 + j6) - (j5 & j6);
                jArr2[i8] = j7;
                jArr2[(((iFindFirstAvailableSlot - 7) & i4) + ((i4 + 7) - (7 | i4))) >> 3] = j7;
                iArr2[iFindFirstAvailableSlot] = i6;
                objArr2[iFindFirstAvailableSlot] = objArr[i5];
            }
            i5++;
            mutableIntObjectMap = this;
        }
    }

    private final void writeMetadata(int i2, long j2) {
        long[] jArr = this.metadata;
        int i3 = i2 >> 3;
        int i4 = ((-1) - (((-1) - i2) | ((-1) - 7))) << 3;
        jArr[i3] = (-1) - (((-1) - (jArr[i3] & (~(255 << i4)))) & ((-1) - (j2 << i4)));
        int i5 = this._capacity;
        int i6 = ((i2 - 7) & i5) + ((i5 + 7) - (i5 | 7));
        int i7 = i6 >> 3;
        int i8 = ((i6 + 7) - (i6 | 7)) << 3;
        jArr[i7] = (-1) - (((-1) - (j2 << i8)) & ((-1) - ((-1) - (((-1) - jArr[i7]) | ((-1) - (~(255 << i8)))))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(IntObjectMap<V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        int[] iArr = from.keys;
        Object[] objArr = from.values;
        long[] jArr = from.metadata;
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
                        set(iArr[i5], objArr[i5]);
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
            long j3 = (-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2));
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
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
            int i10 = (i7 & 7) << 3;
            long j2 = jArr[i9] >>> i10;
            long j3 = (jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63);
            long j4 = (j3 + j2) - (j3 & j2);
            long j5 = i5;
            long j6 = j4 ^ (j5 * ScatterMapKt.BitmaskLsb);
            long j7 = j6 - ScatterMapKt.BitmaskLsb;
            long j8 = ~j6;
            long j9 = (j8 + j7) - (j8 | j7);
            for (long j10 = (j9 - 9187201950435737472L) - (j9 | (-9187201950435737472L)); j10 != 0; j10 = (-1) - (((-1) - j10) | ((-1) - (j10 - 1)))) {
                int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(j10) >> 3) + i7;
                int i11 = (iNumberOfTrailingZeros + i6) - (iNumberOfTrailingZeros | i6);
                if (this.keys[i11] == i2) {
                    return i11;
                }
            }
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i4);
                if (this.growthLimit == 0 && (-1) - (((-1) - (this.metadata[iFindFirstAvailableSlot >> 3] >> ((7 & iFindFirstAvailableSlot) << 3))) | ((-1) - 255)) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i4);
                }
                this._size++;
                int i12 = this.growthLimit;
                int i13 = iFindFirstAvailableSlot >> 3;
                int i14 = (7 & iFindFirstAvailableSlot) << 3;
                long j11 = this.metadata[i13] >> i14;
                this.growthLimit = i12 - ((j11 + 255) - (j11 | 255) != 128 ? 0 : 1);
                long[] jArr2 = this.metadata;
                int i15 = this._capacity;
                long j12 = jArr2[i13];
                long j13 = ~(255 << i14);
                long j14 = ((j13 + j12) - (j13 | j12)) | (j5 << i14);
                jArr2[i13] = j14;
                int i16 = iFindFirstAvailableSlot - 7;
                jArr2[(((i16 + i15) - (i16 | i15)) + ((-1) - (((-1) - i15) | ((-1) - 7)))) >> 3] = j14;
                return iFindFirstAvailableSlot;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
    }
}
