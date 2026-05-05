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
/* JADX INFO: compiled from: LongObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&˛\bDZc|İI\u0006>\u00116B\u0005#4\u0012\u0006\u0007nj?2LeV5ZS0\u0011s{J$c$wHCU0}*\teNog|^b\u000bI\u0015\u000e\u0016\u0007s4I[ye\u0012%2JoE;cڎe;fҚD\u0004P82:\n\u0005G\u0019XHP\u0004\u000bIQ\f 1XphTҫQ\u0005(\u0015ND.\u00066\\\u0016T|H5aH6;\u0003\u0018H\u0017-m8\u0015M;L\u001b'U\u0005o'C@e7E)a\r\u001fR\nJI?:K\u0013t?'YK$[De\u0018\u0014C-\u0016\r&\u00184j\u001dQ\u0017ϯW/]mcP<3(\u0005\n\u001cT\n\u001e\b7HdƦHvNԋ9иqԟĖT\u0002lSH\u0001oH/%.9q9ct_tS\u0019|=,\t\u001b2;\u0001\u001d#\"TVn#0lw\u007f7\u0002DKIf\n\b?4\u00049q\u0010@\u001c0u\u0006_\u007f\u001fE/%es\u007f\u0601)4\u0011VZ\u007fv3f\u0019Wwi`@P\b\\պ2Q\u001bhZ|\u0005\u001aV\u0005\\:\u001be\u001c\u0003\u0012Dܸ\u001bhk\u0006R9%>T\u007flw\u0002e]8?uϐ?\"\u0004y)o9\r9e[q,yX\u0007\u0016O<\u0019ڳ\u0007f\tʹ\u0014#w6?JJ\u0001\u000f.ӻtR\u001a\u001dJ? 'd0?7t\u0015~ґٿFA\u000b((lv0\u0017Ta*3s2\u0011!\u0007`^\u0001o\u001eծw,Es0NYSK\u0018\\ŞRlB\u0007;\u0007-~õKgZi\u0015\u0006$\u0017m{N9J=_9U\u0013=\nY6\u0010K]L)ό˛Q\u00125\u001fE\u001e\u001d`\u0001.\u0016\u000e\u001b\u0007:\u0007\u0003\\_V'\"%i\u0003%\u0018d6טqH\u000bG\u0012w9\u0003\u0005λxľXߢ\u0017M\u000b-7 ;\u007f&ܲ-9;l?\u001dDyZ.ֵe]w\u001av\bp:>t\u0014\n\\g$\u001czQ\f4\u00028\u0012u\rk:$\u001b\trLx\u0002 B7?=7V_|p\rЕ\u0014ߙ/̱j\u0007:;9Zii+o,6vv8$[}Bds)\u001fvkg\u001co{`\u0019h'\n9\u0007wޮ\u0018lI.Zob72\\֏$ݠE;jŝ¸\t)</Bޤ;qSɔ\nA"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<]/>[g\u001d<m\u0014=5?FA", "$", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! IY\u000bAv#DAy+\r", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "5q^Dg/%W!\u0003\n", "/cYBf;,b#\fv`,", "", "1kT.e", "2q^=7,ES(~\t", "4h]14)L] \u000f\n^\u0010\u0006\u0017/r\u000f\f\u0005?\u0001*", "9dh", "", "4h]190Ka(Z\fZ0\u0004\u0005,l\u007f\u0016\u0003J\u0010", "6`b5$", "5dc\u001ce\u0017Nb", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHuzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "7mXA\\(EW.~\\k6\u000f\u00182", "7mXA\\(EW.~b^;x\b+t{", "1`_.V0Mg", "7mXA\\(EW.~hm6\n\u00051e", ";h]Bf\bLa\u001d\u0001\u0004", "9dh@", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! IV\u0012J\u0006z", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! I]\u000eKL", "", ">kd@4:LW\u001b\b", "4q^:", ">tc", "D`[BX", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", ">tc\u000e_3", "@d\\<i,", "uI\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "@d\\<i,\"T", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "@d\\<i,/O \u000fz:;", "7mS2k", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "@db6m,,b#\fv`,", "<df\u0010T7:Q\u001d\u000e\u000f", "Adc", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "BqX:", "EqXAX\u0014>b\u0015}vm(", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableLongObjectMap<V> extends LongObjectMap<V> {
    private int growthLimit;

    public MutableLongObjectMap() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableLongObjectMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 6 : i2);
    }

    public MutableLongObjectMap(int i2) {
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
        this.keys = new long[iMax];
        this.values = new Object[iMax];
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
        long j2 = 255 << ((i2 & 7) << 3);
        long j3 = (-1) - (((-1) - jArr2[i3]) | ((-1) - (~j2)));
        jArr2[i3] = (j3 + j2) - (j3 & j2);
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    public final V getOrPut(long j2, Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v2 = get(j2);
        if (v2 != null) {
            return v2;
        }
        V vInvoke = defaultValue.invoke();
        set(j2, vInvoke);
        return vInvoke;
    }

    public final void set(long j2, V v2) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(j2);
        this.keys[iFindAbsoluteInsertIndex] = j2;
        this.values[iFindAbsoluteInsertIndex] = v2;
    }

    public final V put(long j2, V v2) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(j2);
        V v3 = (V) this.values[iFindAbsoluteInsertIndex];
        this.keys[iFindAbsoluteInsertIndex] = j2;
        this.values[iFindAbsoluteInsertIndex] = v2;
        return v3;
    }

    public final void plusAssign(LongObjectMap<V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0091, code lost:
    
        if ((((-1) - (((-1) - r4) | ((-1) - ((~r4) << 6)))) & (-9187201950435737472L)) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:
    
        r3 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V remove(long r21) {
        /*
            r20 = this;
            r9 = r20
            r8 = r9
            androidx.collection.LongObjectMap r8 = (androidx.collection.LongObjectMap) r8
            int r2 = java.lang.Long.hashCode(r21)
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
            int r19 = r2 >>> 7
            r19 = r19 & r6
            r18 = 0
        L21:
            long[] r3 = r8.metadata
            int r2 = r19 >> 3
            r0 = 7
            int r1 = r19 + r0
            r0 = r19 | r0
            int r1 = r1 - r0
            int r1 = r1 << 3
            r12 = r3[r2]
            long r12 = r12 >>> r1
            int r0 = r2 + 1
            r10 = r3[r0]
            int r0 = 64 - r1
            long r10 = r10 << r0
            long r2 = (long) r1
            long r0 = -r2
            r2 = 63
            long r0 = r0 >> r2
            long r10 = r10 & r0
            long r4 = r10 + r12
            long r10 = r10 & r12
            long r4 = r4 - r10
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r10 = r2 - r0
            long r0 = ~r2
            long r0 = r0 & r10
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r10 = -1
            long r2 = r10 - r0
            long r0 = r10 - r16
            long r2 = r2 | r0
            long r10 = r10 - r2
        L5a:
            r14 = 0
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 == 0) goto L82
            int r0 = java.lang.Long.numberOfTrailingZeros(r10)
            int r3 = r0 >> 3
            int r3 = r3 + r19
            r3 = r3 & r6
            long[] r0 = r8.keys
            r1 = r0[r3]
            int r0 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r0 != 0) goto L78
        L71:
            if (r3 < 0) goto L9c
            java.lang.Object r0 = r9.removeValueAt(r3)
            return r0
        L78:
            r0 = 1
            long r2 = r10 - r0
            long r0 = r10 + r2
            long r10 = r10 | r2
            long r0 = r0 - r10
            r10 = r0
            goto L5a
        L82:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            r12 = -1
            long r10 = r12 - r4
            long r2 = r12 - r0
            long r10 = r10 | r2
            long r12 = r12 - r10
            long r12 = r12 & r16
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L95
            r3 = -1
            goto L71
        L95:
            int r18 = r18 + 8
            int r19 = r19 + r18
            r19 = r19 & r6
            goto L21
        L9c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongObjectMap.remove(long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b1, code lost:
    
        if (((-1) - (((-1) - (r4 & ((~r4) << 6))) | ((-1) - (-9187201950435737472L)))) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b3, code lost:
    
        r3 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(long r23, V r25) {
        /*
            r22 = this;
            r8 = r22
            r7 = r8
            androidx.collection.LongObjectMap r7 = (androidx.collection.LongObjectMap) r7
            int r1 = java.lang.Long.hashCode(r23)
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r0 = 127(0x7f, float:1.78E-43)
            r9 = r1 & r0
            int r6 = r7._capacity
            int r0 = r1 >>> 7
            int r21 = r0 + r6
            r0 = r0 | r6
            int r21 = r21 - r0
            r20 = 0
            r19 = r20
        L21:
            long[] r3 = r7.metadata
            int r2 = r21 >> 3
            r0 = 7
            int r1 = (-1) - r21
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            int r1 = r0 << 3
            r14 = r3[r2]
            long r14 = r14 >>> r1
            r18 = 1
            int r2 = r2 + r18
            r12 = r3[r2]
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
            long r4 = r10 + r14
            long r10 = r10 & r14
            long r4 = r4 - r10
            long r2 = (long) r9
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r12 = r2 - r0
            long r0 = ~r2
            r10 = -1
            long r2 = r10 - r0
            long r0 = r10 - r12
            long r2 = r2 | r0
            long r10 = r10 - r2
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r10 + r16
            long r10 = r10 | r16
            long r14 = r14 - r10
        L69:
            r12 = 0
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 == 0) goto La3
            int r0 = java.lang.Long.numberOfTrailingZeros(r14)
            int r0 = r0 >> 3
            int r0 = r0 + r21
            int r3 = r0 + r6
            r0 = r0 | r6
            int r3 = r3 - r0
            long[] r0 = r7.keys
            r1 = r0[r3]
            int r0 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            if (r0 != 0) goto L95
        L83:
            if (r3 < 0) goto Lc2
            java.lang.Object[] r0 = r8.values
            r0 = r0[r3]
            r1 = r25
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto Lc2
            r8.removeValueAt(r3)
            return r18
        L95:
            r0 = 1
            long r12 = r14 - r0
            r10 = -1
            long r2 = r10 - r14
            long r0 = r10 - r12
            long r2 = r2 | r0
            long r10 = r10 - r2
            r14 = r10
            goto L69
        La3:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r4 = r4 & r0
            r10 = -1
            long r2 = r10 - r4
            long r0 = r10 - r16
            long r2 = r2 | r0
            long r10 = r10 - r2
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto Lb5
            r3 = -1
            goto L83
        Lb5:
            int r19 = r19 + 8
            int r21 = r21 + r19
            int r1 = (-1) - r21
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r21 = (-1) - r1
            goto L21
        Lc2:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongObjectMap.remove(long, java.lang.Object):boolean");
    }

    public final void removeIf(Function2<? super Long, ? super V, Boolean> predicate) {
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
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (predicate.invoke(Long.valueOf(this.keys[i5]), this.values[i5]).booleanValue()) {
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

    public final void minusAssign(long j2) {
        remove(j2);
    }

    public final void minusAssign(long[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (long j2 : keys) {
            remove(j2);
        }
    }

    public final V removeValueAt(int i2) {
        this._size--;
        long[] jArr = this.metadata;
        int i3 = this._capacity;
        int i4 = i2 >> 3;
        int i5 = ((-1) - (((-1) - i2) | ((-1) - 7))) << 3;
        long j2 = (-1) - (((-1) - (jArr[i4] & (~(255 << i5)))) & ((-1) - (254 << i5)));
        jArr[i4] = j2;
        int i6 = i2 - 7;
        jArr[(((i6 + i3) - (i6 | i3)) + ((i3 + 7) - (i3 | 7))) >> 3] = j2;
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
            jArr[i3] = (jArr[i3] & (~j2)) | j2;
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
            long j6 = (-1) - (((-1) - j5) | ((-1) - ((~j5) << 7)));
            long j7 = (j6 - 9187201950435737472L) - (j6 | (-9187201950435737472L));
            if (j7 != 0) {
                int iNumberOfTrailingZeros = i4 + (Long.numberOfTrailingZeros(j7) >> 3);
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
        long[] jArr2 = this.keys;
        Object[] objArr = this.values;
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
                    int iHashCode = Long.hashCode(jArr2[i3]) * ScatterMapKt.MurmurHashC1;
                    int i6 = iHashCode ^ (iHashCode << 16);
                    int i7 = i6 >>> 7;
                    int iFindFirstAvailableSlot = findFirstAvailableSlot(i7);
                    int i8 = (-1) - (((-1) - i7) | ((-1) - i2));
                    int i9 = ((iFindFirstAvailableSlot - i8) & i2) / 8;
                    int i10 = i3 - i8;
                    if (i9 == ((i10 + i2) - (i10 | i2)) / 8) {
                        jArr[i4] = (((long) (i6 & 127)) << i5) | ((-1) - (((-1) - (~(255 << i5))) | ((-1) - jArr[i4])));
                        int lastIndex = ArraysKt.getLastIndex(jArr);
                        long j3 = jArr[c2];
                        long j4 = (j3 + 72057594037927935L) - (j3 | 72057594037927935L);
                        jArr[lastIndex] = (j4 - Long.MIN_VALUE) - (j4 & Long.MIN_VALUE);
                    } else {
                        int i11 = iFindFirstAvailableSlot >> 3;
                        long j5 = jArr[i11];
                        int i12 = ((iFindFirstAvailableSlot + 7) - (iFindFirstAvailableSlot | 7)) << 3;
                        if ((-1) - (((-1) - (j5 >> i12)) | ((-1) - 255)) != 128) {
                            long j6 = j5 & (~(255 << i12));
                            long j7 = ((long) ((i6 + 127) - (i6 | 127))) << i12;
                            jArr[i11] = (j7 + j6) - (j7 & j6);
                            if (iFindEmptySlot == -1) {
                                iFindEmptySlot = ScatterMapKt.findEmptySlot(jArr, i3 + 1, i2);
                            }
                            jArr2[iFindEmptySlot] = jArr2[iFindFirstAvailableSlot];
                            jArr2[iFindFirstAvailableSlot] = jArr2[i3];
                            jArr2[i3] = jArr2[iFindEmptySlot];
                            objArr[iFindEmptySlot] = objArr[iFindFirstAvailableSlot];
                            objArr[iFindFirstAvailableSlot] = objArr[i3];
                            objArr[i3] = objArr[iFindEmptySlot];
                            i3--;
                        } else {
                            jArr[i11] = (-1) - (((-1) - (j5 & (~(255 << i12)))) & ((-1) - (((long) ((i6 + 127) - (i6 | 127))) << i12)));
                            jArr[i4] = (jArr[i4] & (~(255 << i5))) | (128 << i5);
                            jArr2[iFindFirstAvailableSlot] = jArr2[i3];
                            jArr2[i3] = 0;
                            objArr[iFindFirstAvailableSlot] = objArr[i3];
                            objArr[i3] = null;
                            iFindEmptySlot = i3;
                        }
                        c2 = 0;
                        jArr[ArraysKt.getLastIndex(jArr)] = (-1) - (((-1) - (jArr[0] & 72057594037927935L)) & ((-1) - Long.MIN_VALUE));
                        i3++;
                    }
                }
                i3++;
            }
        }
        initializeGrowth();
    }

    private final void resizeStorage(int i2) {
        MutableLongObjectMap<V> mutableLongObjectMap = this;
        long[] jArr = mutableLongObjectMap.metadata;
        long[] jArr2 = mutableLongObjectMap.keys;
        Object[] objArr = mutableLongObjectMap.values;
        int i3 = mutableLongObjectMap._capacity;
        initializeStorage(i2);
        long[] jArr3 = mutableLongObjectMap.metadata;
        long[] jArr4 = mutableLongObjectMap.keys;
        Object[] objArr2 = mutableLongObjectMap.values;
        int i4 = mutableLongObjectMap._capacity;
        int i5 = 0;
        while (i5 < i3) {
            long j2 = jArr[i5 >> 3] >> (((i5 + 7) - (7 | i5)) << 3);
            if ((j2 + 255) - (j2 | 255) < 128) {
                long j3 = jArr2[i5];
                int iHashCode = Long.hashCode(j3) * ScatterMapKt.MurmurHashC1;
                int i6 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = mutableLongObjectMap.findFirstAvailableSlot(i6 >>> 7);
                int i7 = iFindFirstAvailableSlot >> 3;
                int i8 = (iFindFirstAvailableSlot & 7) << 3;
                long j4 = jArr3[i7];
                long j5 = ~(255 << i8);
                long j6 = (j4 + j5) - (j4 | j5);
                long j7 = ((long) ((-1) - (((-1) - i6) | ((-1) - 127)))) << i8;
                long j8 = (j6 + j7) - (j6 & j7);
                jArr3[i7] = j8;
                jArr3[(((iFindFirstAvailableSlot - 7) & i4) + ((i4 + 7) - (7 | i4))) >> 3] = j8;
                jArr4[iFindFirstAvailableSlot] = j3;
                objArr2[iFindFirstAvailableSlot] = objArr[i5];
            }
            i5++;
            mutableLongObjectMap = this;
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
        int i6 = ((i2 - 7) & i5) + ((i5 + 7) - (i5 | 7));
        int i7 = i6 >> 3;
        int i8 = (i6 & 7) << 3;
        long j5 = jArr[i7];
        long j6 = ~(255 << i8);
        long j7 = (j5 + j6) - (j5 | j6);
        long j8 = j2 << i8;
        jArr[i7] = (j8 + j7) - (j8 & j7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(LongObjectMap<V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        long[] jArr = from.keys;
        Object[] objArr = from.values;
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
                        set(jArr[i5], objArr[i5]);
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

    public final void minusAssign(LongSet keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        long[] jArr = keys.elements;
        long[] jArr2 = keys.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr2[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        remove(jArr[(i2 << 3) + i4]);
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

    public final void minusAssign(LongList keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        long[] jArr = keys.content;
        int i2 = keys._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(jArr[i3]);
        }
    }

    private final int findAbsoluteInsertIndex(long j2) {
        int iHashCode = Long.hashCode(j2) * ScatterMapKt.MurmurHashC1;
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
            long j3 = jArr[i8] >>> i9;
            long j4 = jArr[i8 + 1] << (64 - i9);
            long j5 = (-i9) >> 63;
            long j6 = (j4 + j5) - (j4 | j5);
            long j7 = (j6 + j3) - (j6 & j3);
            long j8 = i4;
            long j9 = j7 ^ (j8 * ScatterMapKt.BitmaskLsb);
            for (long j10 = (~j9) & (j9 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i6) & i5;
                if (this.keys[iNumberOfTrailingZeros] == j2) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((-1) - (((-1) - ((~j7) << 6)) | ((-1) - j7))) & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((7 & iFindFirstAvailableSlot) << 3)) & 255) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                }
                this._size++;
                int i10 = this.growthLimit;
                int i11 = iFindFirstAvailableSlot >> 3;
                int i12 = ((iFindFirstAvailableSlot + 7) - (7 | iFindFirstAvailableSlot)) << 3;
                long j11 = this.metadata[i11] >> i12;
                this.growthLimit = i10 - ((j11 + 255) - (j11 | 255) != 128 ? 0 : 1);
                long[] jArr2 = this.metadata;
                int i13 = this._capacity;
                long j12 = jArr2[i11];
                long j13 = ~(255 << i12);
                long j14 = (-1) - (((-1) - ((j13 + j12) - (j13 | j12))) & ((-1) - (j8 << i12)));
                jArr2[i11] = j14;
                jArr2[(((iFindFirstAvailableSlot - 7) & i13) + (i13 & 7)) >> 3] = j14;
                return iFindFirstAvailableSlot;
            }
            i7 += 8;
            i6 = (-1) - (((-1) - (i6 + i7)) | ((-1) - i5));
        }
    }
}
