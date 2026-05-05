package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.sequences.Sequence;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&i\u0006DLc\u000b\u0004Iي8\u000b<H\u0007\"2\u0013\u007f\u0007tjAӄLeVQZS0\u0011s{J$c$\bCCU \u0006*\teNogtPb\u000bY\u000f\u000e\u0016\u000fj4Ic\be܈\u00172P\nG3coE9fu>\u000562*8\u007f\u0005\t\u001a8j\u0018v\u0001FS\f 9Hp@\\\u0015M\u0013!\u001a\u0006D \u0017Ȧ\u0005iTȤVk\u0006<5\"\u0011irZ7a@|\u0014\fVV7\r=aL,x6xU2c\t\rRiA\u001b? @ݾl'5/\u0012ye<p\u007fB\u001cqOUm\u0001.t\u0011ab\u001c'aՒsM`\u000e^v)\u0005U@\u0012\u0018\u001e'v5ukt\u0013&3+q\u0004D^\u000evB6Э\u0012l%2\u0018e;J+u\bĥޅ\u001dX=\u000b\u0015\u0013$3\u0011p'az\u001ap(+e\u000ePgP͘ART\u0019iCs\u0014\u0001d\b0*AW\u0002?{G-E3}ي?ٳ ǽɘLDu\tMfvf\u0002RvGhn^E8\u001d$Zrg5o^ip,?PbTO\u0011\u0016)8\\&?Q)\u001eZgh Ҕ\u0014\\ܦ)/tN\"\u0014y&o9\u00152eUq\u001cyR-ܝoFp\u001eplRU\u001cZ\u0013'PL\u000fС\u0016ɧzͩ«\u0010\u0013@Z:\"BHI\u0019\u000b\u001c\u000f\u0003fPO\u001a!_\to@\u0003bQ<\u0003\u0018';\tI^j\u0010\bg'P\\\u0001n$EA\u007f8_&\u001e6vT\u0015#5\u0006$\u0004UsdG\u0003˾\\߶]ދ$\u0016(Z\u001aDK3'~W927Sn\u000bkaO\"'1۠(2\u0002ã60\u001dx\u0011D`\u0019Q\u007f^%D\u000fd\u0003%\u0018d6ט\u0010jAùk\u001d'i^ar1`lZF\u001f\u001d'.)\u0007n2|kԆqLcȽ\u007fӄ3\u0015o\u00042\u0005<\u001az\u000fT{\u0016\u000e:\u0006.urSm2qͯw\u0001EН*l\u0002\u0011b`j&\u000fr\u0013B/KNQf\u0001Vnԇ9WD\u058c\u000ft(~\u007fs:Av.D<\nB\u007fS\u007f$^yљ!Ocg$ly]Qͮ\u0017R3\nZ\u0007\u0012JDPne\u000e!D\u0016\u0004\u001e5QGr\u0007L\tZ҉<>\u0018\u000byS\u00182> Fʒgʸ\u001b2P!\u0004q\u001c}\u0011\\\u0005O5pS\u000f96\u0011\u0001\u001f3T֭E3\u0015m|S]\u0010xܳ[e*)\u0014g~\u0015,[Zbd3:h\u000f\u001bQmEY\u0002lߤW+}k&\u000bfD+D\tȷ#\u0002l\u001f\t\u000f0\r\u0012\u0006t\\\u000f\u000f\u001evT^\"_ͦ\u000b~\u001e<@\u000e9H\u0016Κw+NZw\u00107q!1-RT\u001f\u001e\rqV'=\bE-sƖz\u00167{\u000eRi*6Hfٻ\f=<j\b&h \\Q9Fu$n\u001a\tIУP\b<[\rr@-ĝ:O\u0010dJ+l\f\u0004wOGW;z0ZWxz\u001ac#̙~W\u001b\u0003\u001d0\u0005z7R^O!'{5Cphe)g0h\u0017~$!6!F\b\u0019Ϫ Qsh'j}\b;PԽo*o^xp,07y$\u000bZj6@Sh]Lt\u0015lnRWDߜz*ttB(B)-o')!f^rLk_G'Is\u0019Wb\u0017\u0004{Ò6#ARu\u001aeaS\u000e6))\u0003hi%\u00168m!\u0005\u0010u<9VVM\u001a]ڒ4ot\u0003\\Jsdp0t$\u001cDG\\N\u001ft[J I]KAOֆܗ\u00198\u0014$O2C\u001eiSS_1\u0001\u000f\u0019WygˉjwE\u0004;/En\u0088[fI[}\nZ^$\u0002\u0014Q/cq\u000f's<KEET\u0099eB\u0010\nU#4\b\u0006#.z_VpتbɷU؛ \u00194cNpZ\"}k)w\u0018f\u0002\u0018\"g\"`ƍEz\"T\rL8i\u0005\u0007sT\u0019}\u0019\u0002%EB:U\u0006qO%;(O G[M\u0001YG\\\u0014٪Cw\u0012KJalx\u000eʦYم\n- \u0014,nx.i_>;Z$\u001bE\u00101\u0001g0d+R?K%If`\u0007^Yb9\u0003UĞd~N\u001a\u0010\u001e\u0016\\Kmо\nߢd\u0015\u001bФʽsFO\u0015\\ÔQK\u0010ج)J"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r DU\u00129#", "\u0019", "$", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u0015\u0013V~\u000eI^!@/", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "5q^Dg/%W!\u0003\n", "/cYBf;,b#\fv`,", "", "/r<Bg(;Z\u0019fvi", "", "1kT.e", "1n\\=h;>", "9dh", "1n\\=h;>0 \txd", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "2q^=7,ES(~\t", "4h]190Ka(Z\fZ0\u0004\u0005,l\u007f\u0016\u0003J\u0010", "6`b5$", "4h]1<5LS&\u000e^g+|\u001c", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "5dc\u001ce\u0017Nb", "2dU.h3MD\u0015\u0006\u000b^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010.\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "7mXA\\(EW.~\\k6\u000f\u00182", "7mXA\\(EW.~b^;x\b+t{", "1`_.V0Mg", "7mXA\\(EW.~hm6\n\u00051e", ";h]Bf\bLa\u001d\u0001\u0004", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "9dh@", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nj\u0014\u001cGm\u001d#z3D/", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u0015\u0013V~\u000eId%D/", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", ">kd@4:LW\u001b\b", "4q^:", ">`X?f", "\u001aj^A_0G\u001d\u0004z~k\u0002", "uZ;8b;EW\"HeZ0\n^rV", ">`X?", "", ">tc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", ">tc\u000e_3", "@d\\<i,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kqB", "@d\\<i,\"T", ">qT1\\*:b\u0019", "@d\\<i,/O \u000fz:;", "7mS2k", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "@db6m,,b#\fv`,", "<df\u0010T7:Q\u001d\u000e\u000f", "Adc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq>", "BqX:", "EqXAX\u0014>b\u0015}vm(", "", "\u001btc.U3>;\u0015\nlk(\b\u0014/r", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {
    private int growthLimit;

    public MutableScatterMap() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableScatterMap(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 6 : i2);
    }

    public MutableScatterMap(int i2) {
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
        long j2 = 255 << (((i2 + 7) - (i2 | 7)) << 3);
        jArr2[i3] = (-1) - (((-1) - ((-1) - (((-1) - jArr2[i3]) | ((-1) - (~j2))))) & ((-1) - j2));
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    public final V getOrPut(K k2, Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v2 = get(k2);
        if (v2 != null) {
            return v2;
        }
        V vInvoke = defaultValue.invoke();
        set(k2, vInvoke);
        return vInvoke;
    }

    public final V compute(K k2, Function2<? super K, ? super V, ? extends V> computeBlock) {
        Intrinsics.checkNotNullParameter(computeBlock, "computeBlock");
        int iFindInsertIndex = findInsertIndex(k2);
        boolean z2 = iFindInsertIndex < 0;
        V vInvoke = computeBlock.invoke(k2, z2 ? null : this.values[iFindInsertIndex]);
        if (z2) {
            int i2 = ~iFindInsertIndex;
            this.keys[i2] = k2;
            this.values[i2] = vInvoke;
        } else {
            this.values[iFindInsertIndex] = vInvoke;
        }
        return vInvoke;
    }

    public final void set(K k2, V v2) {
        int iFindInsertIndex = findInsertIndex(k2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        this.keys[iFindInsertIndex] = k2;
        this.values[iFindInsertIndex] = v2;
    }

    public final V put(K k2, V v2) {
        int iFindInsertIndex = findInsertIndex(k2);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        V v3 = (V) this.values[iFindInsertIndex];
        this.keys[iFindInsertIndex] = k2;
        this.values[iFindInsertIndex] = v2;
        return v3;
    }

    public final void putAll(Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    public final void putAll(Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    public final void putAll(Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            set(pair.component1(), pair.component2());
        }
    }

    public final void plusAssign(Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        set(pair.getFirst(), pair.getSecond());
    }

    public final void plusAssign(Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public final void plusAssign(Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public final void plusAssign(Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public final void plusAssign(Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void plusAssign(ScatterMap<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
    
        r13 = (-1) - (((-1) - r4) | ((-1) - ((~r4) << 6)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ab, code lost:
    
        if (((r13 - 9187201950435737472L) - (r13 | (-9187201950435737472L))) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V remove(K r22) {
        /*
            r21 = this;
            r10 = r21
            r8 = r10
            androidx.collection.ScatterMap r8 = (androidx.collection.ScatterMap) r8
            r20 = 0
            r9 = r22
            if (r9 == 0) goto Lb5
            int r2 = r9.hashCode()
        Lf:
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
            int r0 = r2 >>> 7
        L23:
            int r19 = r0 + r6
            r0 = r0 | r6
            int r19 = r19 - r0
            long[] r3 = r8.metadata
            int r2 = r19 >> 3
            r0 = 7
            int r1 = r19 + r0
            r0 = r19 | r0
            int r1 = r1 - r0
            int r1 = r1 << 3
            r15 = r3[r2]
            long r15 = r15 >>> r1
            int r0 = r2 + 1
            r13 = r3[r0]
            int r0 = 64 - r1
            long r13 = r13 << r0
            long r2 = (long) r1
            long r0 = -r2
            r2 = 63
            long r0 = r0 >> r2
            r11 = -1
            long r4 = r11 - r13
            long r2 = r11 - r0
            long r4 = r4 | r2
            long r11 = r11 - r4
            r4 = -1
            long r2 = r4 - r11
            long r0 = r4 - r15
            long r2 = r2 & r0
            long r4 = r4 - r2
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r13 = r2 - r0
            long r0 = ~r2
            long r11 = r0 + r13
            long r0 = r0 | r13
            long r11 = r11 - r0
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r17
        L69:
            r15 = 0
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 == 0) goto L99
            int r0 = java.lang.Long.numberOfTrailingZeros(r11)
            int r0 = r0 >> 3
            int r0 = r0 + r19
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r1 = (-1) - r1
            java.lang.Object[] r0 = r8.keys
            r0 = r0[r1]
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r9)
            if (r0 == 0) goto L8f
        L88:
            if (r1 < 0) goto Lb9
            java.lang.Object r0 = r10.removeValueAt(r1)
            return r0
        L8f:
            r0 = 1
            long r2 = r11 - r0
            long r0 = r11 + r2
            long r11 = r11 | r2
            long r0 = r0 - r11
            r11 = r0
            goto L69
        L99:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            r13 = -1
            long r11 = r13 - r4
            long r2 = r13 - r0
            long r11 = r11 | r2
            long r13 = r13 - r11
            long r1 = r13 + r17
            long r13 = r13 | r17
            long r1 = r1 - r13
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 == 0) goto Laf
            r1 = -1
            goto L88
        Laf:
            int r20 = r20 + 8
            int r0 = r19 + r20
            goto L23
        Lb5:
            r2 = r20
            goto Lf
        Lb9:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.remove(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009f, code lost:
    
        r0 = (~r4) << 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00aa, code lost:
    
        if ((((r4 + r0) - (r4 | r0)) & (-9187201950435737472L)) == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ac, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(K r23, V r24) {
        /*
            r22 = this;
            r9 = r22
            r8 = r9
            androidx.collection.ScatterMap r8 = (androidx.collection.ScatterMap) r8
            r10 = r23
            if (r10 == 0) goto Lbd
            int r1 = r10.hashCode()
        Ld:
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
            int r21 = (-1) - r1
            r20 = 0
        L27:
            long[] r3 = r8.metadata
            int r2 = r21 >> 3
            r0 = 7
            int r1 = r21 + r0
            r0 = r21 | r0
            int r1 = r1 - r0
            int r1 = r1 << 3
            r13 = r3[r2]
            long r13 = r13 >>> r1
            r19 = 1
            int r2 = r2 + r19
            r11 = r3[r2]
            int r0 = 64 - r1
            long r11 = r11 << r0
            long r2 = (long) r1
            long r0 = -r2
            r2 = 63
            long r0 = r0 >> r2
            long r11 = r11 & r0
            long r4 = r11 + r13
            long r11 = r11 & r13
            long r4 = r4 - r11
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
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r15 = r11 + r17
            long r11 = r11 | r17
            long r15 = r15 - r11
        L66:
            r11 = 0
            int r0 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r0 == 0) goto L9f
            int r0 = java.lang.Long.numberOfTrailingZeros(r15)
            int r1 = r0 >> 3
            int r1 = r1 + r21
            r1 = r1 & r6
            java.lang.Object[] r0 = r8.keys
            r0 = r0[r1]
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r10)
            if (r0 == 0) goto L91
        L7f:
            if (r1 < 0) goto Lc0
            java.lang.Object[] r0 = r9.values
            r0 = r0[r1]
            r2 = r24
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 == 0) goto Lc0
            r9.removeValueAt(r1)
            return r19
        L91:
            r0 = 1
            long r13 = r15 - r0
            r11 = -1
            long r2 = r11 - r15
            long r0 = r11 - r13
            long r2 = r2 | r0
            long r11 = r11 - r2
            r15 = r11
            goto L66
        L9f:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r2 = r4 + r0
            long r4 = r4 | r0
            long r2 = r2 - r4
            long r2 = r2 & r17
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto Lae
            r1 = -1
            goto L7f
        Lae:
            r0 = 0
            int r20 = r20 + 8
            int r21 = r21 + r20
            int r0 = r21 + r6
            r21 = r21 | r6
            int r0 = r0 - r21
            r21 = r0
            goto L27
        Lbd:
            r1 = 0
            goto Ld
        Lc0:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.remove(java.lang.Object, java.lang.Object):boolean");
    }

    public final void removeIf(Function2<? super K, ? super V, Boolean> predicate) {
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
                    if ((255 + j2) - (255 | j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (predicate.invoke(this.keys[i5], this.values[i5]).booleanValue()) {
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

    public final V removeValueAt(int i2) {
        this._size--;
        long[] jArr = this.metadata;
        int i3 = this._capacity;
        int i4 = i2 >> 3;
        int i5 = ((i2 + 7) - (7 | i2)) << 3;
        long j2 = (-1) - (((-1) - ((-1) - (((-1) - jArr[i4]) | ((-1) - (~(255 << i5)))))) & ((-1) - (254 << i5)));
        jArr[i4] = j2;
        jArr[(((-1) - (((-1) - (i2 - 7)) | ((-1) - i3))) + ((-1) - (((-1) - i3) | ((-1) - 7)))) >> 3] = j2;
        this.keys[i2] = null;
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
            int i7 = ((-1) - (((-1) - i4) | ((-1) - 7))) << 3;
            long j2 = (-1) - (((-1) - ((-1) - (((-1) - (jArr[i6 + 1] << (64 - i7))) | ((-1) - ((-i7) >> 63))))) & ((-1) - (jArr[i6] >>> i7)));
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
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        ScatterMapKt.convertMetadataForCleanup(jArr, i2);
        int i3 = 0;
        int i4 = 0;
        int iFindEmptySlot = -1;
        while (i4 != i2) {
            int i5 = i4 >> 3;
            int i6 = (7 & i4) << 3;
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
                    int i9 = i8 & i2;
                    int i10 = i4 - i9;
                    if (((-1) - (((-1) - (iFindFirstAvailableSlot - i9)) | ((-1) - i2))) / 8 != ((i10 + i2) - (i10 | i2)) / 8) {
                        int i11 = iFindFirstAvailableSlot >> 3;
                        long j3 = jArr[i11];
                        int i12 = ((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3;
                        long j4 = j3 >> i12;
                        if ((j4 + 255) - (j4 | 255) == 128) {
                            long j5 = (-1) - (((-1) - j3) | ((-1) - (~(255 << i12))));
                            long j6 = ((long) ((i7 + 127) - (i7 | 127))) << i12;
                            jArr[i11] = (j5 + j6) - (j5 & j6);
                            jArr[i5] = (jArr[i5] & (~(255 << i6))) | (128 << i6);
                            objArr[iFindFirstAvailableSlot] = objArr[i4];
                            objArr[i4] = null;
                            objArr2[iFindFirstAvailableSlot] = objArr2[i4];
                            objArr2[i4] = null;
                            iFindEmptySlot = i4;
                        } else {
                            jArr[i11] = (-1) - (((-1) - (((long) (i7 & 127)) << i12)) & ((-1) - ((-1) - (((-1) - j3) | ((-1) - (~(255 << i12)))))));
                            if (iFindEmptySlot == -1) {
                                iFindEmptySlot = ScatterMapKt.findEmptySlot(jArr, i4 + 1, i2);
                            }
                            objArr[iFindEmptySlot] = objArr[iFindFirstAvailableSlot];
                            objArr[iFindFirstAvailableSlot] = objArr[i4];
                            objArr[i4] = objArr[iFindEmptySlot];
                            objArr2[iFindEmptySlot] = objArr2[iFindFirstAvailableSlot];
                            objArr2[iFindFirstAvailableSlot] = objArr2[i4];
                            objArr2[i4] = objArr2[iFindEmptySlot];
                            i4--;
                        }
                        i3 = 0;
                        jArr[ArraysKt.getLastIndex(jArr)] = jArr[0];
                        i4++;
                    } else {
                        long j7 = (~(255 << i6)) & jArr[i5];
                        long j8 = ((long) ((-1) - (((-1) - i7) | ((-1) - 127)))) << i6;
                        jArr[i5] = (j8 + j7) - (j8 & j7);
                        jArr[ArraysKt.getLastIndex(jArr)] = jArr[i3];
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
        Object[] objArr2 = this.values;
        int i3 = this._capacity;
        initializeStorage(i2);
        long[] jArr2 = this.metadata;
        Object[] objArr3 = this.keys;
        Object[] objArr4 = this.values;
        int i4 = this._capacity;
        for (int i5 = 0; i5 < i3; i5++) {
            if (((jArr[i5 >> 3] >> ((7 & i5) << 3)) & 255) < 128) {
                Object obj = objArr[i5];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i6 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i6 >>> 7);
                int i7 = iFindFirstAvailableSlot >> 3;
                int i8 = ((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3;
                long j2 = jArr2[i7] & (~(255 << i8));
                long j3 = ((long) ((i6 + 127) - (i6 | 127))) << i8;
                long j4 = (j3 + j2) - (j3 & j2);
                jArr2[i7] = j4;
                jArr2[(((iFindFirstAvailableSlot - 7) & i4) + ((-1) - (((-1) - i4) | ((-1) - 7)))) >> 3] = j4;
                objArr3[iFindFirstAvailableSlot] = obj;
                objArr4[iFindFirstAvailableSlot] = objArr2[i5];
            }
        }
    }

    private final void writeMetadata(int i2, long j2) {
        long[] jArr = this.metadata;
        int i3 = i2 >> 3;
        int i4 = ((i2 + 7) - (7 | i2)) << 3;
        jArr[i3] = (-1) - (((-1) - (jArr[i3] & (~(255 << i4)))) & ((-1) - (j2 << i4)));
        int i5 = this._capacity;
        int i6 = ((i2 - 7) & i5) + (i5 & 7);
        int i7 = i6 >> 3;
        int i8 = ((i6 + 7) - (i6 | 7)) << 3;
        jArr[i7] = (-1) - (((-1) - (j2 << i8)) & ((-1) - (jArr[i7] & (~(255 << i8)))));
    }

    public final Map<K, V> asMutableMap() {
        return new MutableMapWrapper();
    }

    /* JADX INFO: compiled from: ScatterMap.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>.6B\u0005\"4\u0012\u0006(njGULeN1ZS8,s{:%c$\u007fCCU \u0002*\t]pogtK`ŒE%إF\t\u0019+\u001aa\t_\"\u000fhԏ\u007fACM&<g`%B\u0015\"B\"nц\u0015\u0003**~\u000f%{\u0004Në\u00160Nr\u0003X\u001b[\u001d\u001a@\u0015\u00054I;jwf8^k\u00149_'\u0011zZN]ڿ`\u0001[\u001f^T]\f=uӿ/@EH]Aa\u0017\u001fR\nN3Q\u007fR\u001dv7+1H\u0004Wlݙ\u0010\u0016%+\u0006\f\f\tlpMfn#?-eb\u0002O>,\u0006\f\u0014\rrǉT\u001aόL.;27,\u001c6\r\u0005cN`\u000enD\u0010z\u0018ا''\u00103a8Ik\u007feqm%Ѱ}˿\u0011\";\u0003t'i[^x##l}a3a@sʰ|\u000e\u0010\u0012DեrĊ\u0006.\u001c2M\t=\u0003aF%/OaI%1k8Grr-Y7üUׂVLX$t\"E7Ç\u0010s"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r DU\u00129\f+Kz0\u001b\u001chI5\u0012U9J\u00022GY$", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u0015\u0013V~\u000eI^!@\u0018e\u001cB_#*XN;x\n", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u0015\u0013V~\u000eI^!@/", "", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ~'Vk\u000bCv\u00133U\r/7z}*X\u0019~\\", "3mc?\\,L", "", "", "5dc\u0012a;KW\u0019\r", "u(;7T=:\u001d)\u000e~euj\t>;", "9dh@", "5dc\u0018X@L", "D`[BX:", "", "5dc#T3NS'", "u(;7T=:\u001d)\u000e~euZ\u00136l\u007f&\u000bD\u000b l", "1kT.e", "", ">tc", "9dh", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", ">tc\u000e_3", "4q^:", "", "@d\\<i,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class MutableMapWrapper extends ScatterMap<K, V>.MapWrapper implements Map<K, V>, KMutableMap {
        public MutableMapWrapper() {
            super();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        public Set<Map.Entry<K, V>> getEntries() {
            return new MutableScatterMap$MutableMapWrapper$entries$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        public Set<K> getKeys() {
            return new MutableScatterMap$MutableMapWrapper$keys$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        public Collection<V> getValues() {
            return new MutableScatterMap$MutableMapWrapper$values$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public void clear() {
            MutableScatterMap.this.clear();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public V remove(Object obj) {
            return MutableScatterMap.this.remove(obj);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public V put(K k2, V v2) {
            return MutableScatterMap.this.put(k2, v2);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public void putAll(Map<? extends K, ? extends V> from) {
            Intrinsics.checkNotNullParameter(from, "from");
            for (Map.Entry<? extends K, ? extends V> entry : from.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    public final void putAll(Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            set(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(ScatterMap<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
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
                        int i5 = (i2 << 3) + i4;
                        set(objArr[i5], objArr2[i5]);
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
                    if ((255 & j2) < 128) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.content;
        int i2 = keys._size;
        for (int i3 = 0; i3 < i2; i3++) {
            remove(objArr[i3]);
        }
    }

    public final int findInsertIndex(K k2) {
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
            for (long j5 = (~j4) & (j4 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j5 != 0; j5 = (-1) - (((-1) - j5) | ((-1) - (j5 - 1)))) {
                int iNumberOfTrailingZeros = (-1) - (((-1) - (i6 + (Long.numberOfTrailingZeros(j5) >> 3))) | ((-1) - i5));
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], k2)) {
                    return iNumberOfTrailingZeros;
                }
            }
            long j6 = (~j2) << 6;
            if ((-1) - (((-1) - ((j6 + j2) - (j6 | j2))) | ((-1) - (-9187201950435737472L))) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> (((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3)) & 255) != 254) {
                    adjustStorage();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                }
                this._size++;
                int i10 = this.growthLimit;
                int i11 = iFindFirstAvailableSlot >> 3;
                int i12 = ((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3;
                long j7 = this.metadata[i11] >> i12;
                this.growthLimit = i10 - ((j7 + 255) - (j7 | 255) != 128 ? 0 : 1);
                long[] jArr2 = this.metadata;
                int i13 = this._capacity;
                long j8 = jArr2[i11];
                long j9 = ~(255 << i12);
                long j10 = (j9 + j8) - (j9 | j8);
                long j11 = j3 << i12;
                long j12 = (j10 + j11) - (j10 & j11);
                jArr2[i11] = j12;
                jArr2[(((-1) - (((-1) - (iFindFirstAvailableSlot - 7)) | ((-1) - i13))) + ((-1) - (((-1) - i13) | ((-1) - 7)))) >> 3] = j12;
                return ~iFindFirstAvailableSlot;
            }
            i7 += 8;
            i6 = (-1) - (((-1) - (i6 + i7)) | ((-1) - i5));
        }
    }
}
