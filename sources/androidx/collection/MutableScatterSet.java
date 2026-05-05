package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
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
/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&˛\bDZc|İI\u0006>\u00116B\u0005#4\u0012\u0006\u0010nj?2Le^.ZS8\u001esڔ<$i>yCQU\"Ԃ*\t]NogtJb\u000bQ0\u000e\u0016~}4Ikxe\u0012\u00156Xģg5SڎK8\u0011zF\u000702h7(\u00059\u0019Y\t\u001d\u0007\u0001IK\u001a\u0013H@\u001f<ň\u0011M\u0013\u001dZ\u0017L%\u0019\u001e\u000bm~:Vsu:e݊ɨmB\\/(B\u000bV%F\u0003-=\u0001o(CFG7%%\nΈ5]$Q\u0011H\n=3nW19S\f]FZ\u0010\u0014Kۀ}\r&\f4e\u001dQ\u000f\u0012W7]mcX\u001e,}y\f\rrǉ<\u0012όL.;'/\u001a\u001c<\rr\u0002F\u0001\flL\u0018\u0001q8'%6đYGcx_jS\u0019|=,\u000f\u001b(;\u0007~#kTD֫C*\u001d\u0003_Ai@kY\u0015ˣՒAm\n\u0003+\f8\u0017HM\u00101\f\u0011dϏSK$=16\u0004\u0002vU0\u0002\u0013v\u0001S\u0018c\u000f̱ؗr\u0016=AQ\u001fh\\|\u0005\u001aR\u0005\\:\u0018e\u001c\u000b͵D\b˙$\\\u0006Ui3\u001ehgh\u0018l}a\u0018@Gfe[5kV]GzK5\u007ftVa\u001b\u0005\"\\Tb3i\u0017Fa*r\\V$xH3\u001e\u0006\u001b\\N:$bC\u007f\u001dL,_\u001b#\u0015\u0011\u0017,bY|7p\u000bl\u001e\u0006l3ZѰ0ˌt֊\u0005Pj\u00128|\u0007iD|\u000f3]K_?1,e$x43Ƚ5\n:ÙG0aUl\u0005\u0016$f,*$$QW??#\u000f5ǻ`\u0002sխL;\u0002_m*')\u000e*\u001bIrFo\u0018nv+pj\u0001֢\u0003#hԵ^ѓ'\br\"BvT\u001b_c\u0003\u001c\fHW|\u001b_LPH|;ȔL3GȂ\"EJ;c?\u001dD\tD9#kuo\u007f0\nbEծ#tJЁc^\u0004ptu2iIy]\rE:$#×\tלj͎\fB\u0017UUHVd|p\u0005I}\u0015=\b~\r<\u000f\u0001V\u0012ƥAzDҵ.(?\u0002f\u0016\u0014\rTU\u001b[]\u007fs}Ml\u000b\u0001\u05fa8\u000bBωnZ8KCnW\u0011\u001a`\u0012\u0002\"NIKf\u000b;\u0019$jɶj\u0014Q͖TɎ\n\u0010\t\"\u000ft\u001d:JB\"L\u0007\u0018b\u0003t\\X\u0007pE\u0017ԠX\u000fE۷3f\u000eCT\u001dmte_m@\u000bk#\u0019\u001dzO5ܺS:\u000bǻ9c9f%#E\fIy\u0006D\u000b_)$ ƴ\u00108&\u0005eT&@QQ?e':l\u0015mj^f\u0007\u0012\u001dŚ|-q\u0011\t\"&<8\u0015;#]|\bh=N^wmƑH\u0001_]7,$|\u0012LK9\u0014?EEYn\u001a&\fW\nȌ,\u0014Ù$'\u0012\u0002ine3~\n\f!j \u007f z\b\u0019\u0015` :˸x\u0003;\u001c<-NO092\u001dlc\u0004}1B7+#ݩpZ1\u0007\u0018\n\u0005c\u001df;\u0007tXny\u001d/\u0017\u001cQE[V+X\tKAc.\u0002)\f$\u00176\u001flʊr+ O\u0012n\u001f\u0016\u0016܇\u0013Ƅ.մrt?[j\u001e,0*y\u0012Vl(C=\u001dצ̡h\tb\u001a\u000b]\u001c\r\u0003(\u0013vR.d\t\rLv\u0011A6\u001dݴ*Ү37!ےʽ\rLh\n\nٚyT ܹVo"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r D[\u0016=#", "\u0013", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u0015\u0013V~\u000eId%D/", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", "5q^Dg/%W!\u0003\n", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "/cS\u000e_3", "3kT:X5Ma", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nj\u0014\u001cGm\u001d#z3D/", "", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "/cYBf;,b#\fv`,", "", "/cYBf;,b#\fv`,;\u00079l\u0007(yO\u0005! ", "/r<Bg(;Z\u0019lzm", "", "1kT.e", "2q^=7,ES(~\t", "2q^=7,ES(~\t\u001d*\u0007\u00106e}7\u007fJ\n", "4h]14)L] \u000f\n^\u0010\u0006\u0017/r\u000f\f\u0005?\u0001*", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "4h]190Ka(Z\fZ0\u0004\u0005,l\u007f\u0016\u0003J\u0010", "6`b5$", "7mXA\\(EW.~\\k6\u000f\u00182", "7mXA\\(EW.~b^;x\b+t{", "1`_.V0Mg", "7mXA\\(EW.~hm6\n\u00051e", ";h]Bf\bLa\u001d\u0001\u0004", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", ">kd@4:LW\u001b\b", "@d\\<i,", "@d\\<i,\u001aZ ", "@d\\<i,\u001eZ\u0019\u0007zg;X\u0018", "7mS2k", "@d\\<i,\"T", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "@db6m,,b#\fv`,", "<df\u0010T7:Q\u001d\u000e\u000f", "@db6m,,b#\fv`,;\u00079l\u0007(yO\u0005! ", "BqX:", "\u001btc.U3>A\u0019\u000elk(\b\u0014/r", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MutableScatterSet<E> extends ScatterSet<E> {
    private int growthLimit;

    public MutableScatterSet() {
        this(0, 1, null);
    }

    public MutableScatterSet(int i2) {
        super(null);
        if (!(i2 >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i2));
    }

    public /* synthetic */ MutableScatterSet(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 6 : i2);
    }

    private final void initializeStorage(int i2) {
        int iMax = i2 > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(i2)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.elements = new Object[iMax];
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
        long j2 = 255 << (((i2 + 7) - (i2 | 7)) << 3);
        jArr2[i3] = ((-1) - (((-1) - jArr2[i3]) | ((-1) - (~j2)))) | j2;
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    public final boolean add(E e2) {
        int size = getSize();
        this.elements[findAbsoluteInsertIndex(e2)] = e2;
        return getSize() != size;
    }

    public final void plusAssign(E e2) {
        this.elements[findAbsoluteInsertIndex(e2)] = e2;
    }

    public final boolean addAll(E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = getSize();
        plusAssign((Object[]) elements);
        return size != getSize();
    }

    public final boolean addAll(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = getSize();
        plusAssign((Iterable) elements);
        return size != getSize();
    }

    public final boolean addAll(Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = getSize();
        plusAssign((Sequence) elements);
        return size != getSize();
    }

    public final boolean addAll(ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = getSize();
        plusAssign((ScatterSet) elements);
        return size != getSize();
    }

    public final boolean addAll(ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = getSize();
        plusAssign((ObjectList) elements);
        return size != getSize();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:
    
        r0 = (~r4) << 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a2, code lost:
    
        if (((-1) - (((-1) - ((r4 + r0) - (r4 | r0))) | ((-1) - (-9187201950435737472L)))) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a4, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(E r21) {
        /*
            r20 = this;
            r9 = r20
            r8 = r9
            androidx.collection.ScatterSet r8 = (androidx.collection.ScatterSet) r8
            r10 = r21
            if (r10 == 0) goto Lae
            int r2 = r10.hashCode()
        Ld:
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
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r19 = (-1) - r1
            r18 = 0
        L2a:
            long[] r3 = r8.metadata
            int r2 = r19 >> 3
            r0 = 7
            int r1 = (-1) - r19
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            int r1 = r0 << 3
            r11 = r3[r2]
            long r11 = r11 >>> r1
            r17 = 1
            int r2 = r2 + r17
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
            long r13 = r2 - r0
            long r0 = ~r2
            long r11 = r0 + r13
            long r0 = r0 | r13
            long r11 = r11 - r0
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r15
        L60:
            r13 = 0
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L91
            int r0 = java.lang.Long.numberOfTrailingZeros(r11)
            int r0 = r0 >> 3
            int r0 = r0 + r19
            int r1 = r0 + r6
            r0 = r0 | r6
            int r1 = r1 - r0
            java.lang.Object[] r0 = r8.elements
            r0 = r0[r1]
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r10)
            if (r0 == 0) goto L87
        L7c:
            if (r1 < 0) goto L84
        L7e:
            if (r17 == 0) goto L83
            r9.removeElementAt(r1)
        L83:
            return r17
        L84:
            r17 = 0
            goto L7e
        L87:
            r0 = 1
            long r2 = r11 - r0
            long r0 = r11 + r2
            long r11 = r11 | r2
            long r0 = r0 - r11
            r11 = r0
            goto L60
        L91:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r11 = r4 + r0
            long r4 = r4 | r0
            long r11 = r11 - r4
            r4 = -1
            long r2 = r4 - r11
            long r0 = r4 - r15
            long r2 = r2 | r0
            long r4 = r4 - r2
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 == 0) goto La6
            r1 = -1
            goto L7c
        La6:
            int r18 = r18 + 8
            int r19 = r19 + r18
            r19 = r19 & r6
            goto L2a
        Lae:
            r2 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.remove(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0093, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0095, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void minusAssign(E r20) {
        /*
            r19 = this;
            r10 = r19
            r8 = r10
            androidx.collection.ScatterSet r8 = (androidx.collection.ScatterSet) r8
            r18 = 0
            r9 = r20
            if (r9 == 0) goto L9c
            int r1 = r9.hashCode()
        Lf:
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r0 = 127(0x7f, float:1.78E-43)
            int r7 = r1 + r0
            r0 = r0 | r1
            int r7 = r7 - r0
            int r6 = r8._capacity
            int r17 = r1 >>> 7
        L20:
            r17 = r17 & r6
            long[] r3 = r8.metadata
            int r2 = r17 >> 3
            r0 = 7
            int r1 = (-1) - r17
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            int r1 = r0 << 3
            r13 = r3[r2]
            long r13 = r13 >>> r1
            int r0 = r2 + 1
            r4 = r3[r0]
            int r0 = 64 - r1
            long r4 = r4 << r0
            long r2 = (long) r1
            long r0 = -r2
            r2 = 63
            long r0 = r0 >> r2
            long r11 = r4 + r0
            long r4 = r4 | r0
            long r11 = r11 - r4
            r4 = -1
            long r2 = r4 - r11
            long r0 = r4 - r13
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
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = -1
            long r2 = r13 - r11
            long r0 = r13 - r15
            long r2 = r2 | r0
            long r13 = r13 - r2
        L67:
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 == 0) goto L8c
            int r0 = java.lang.Long.numberOfTrailingZeros(r13)
            int r1 = r0 >> 3
            int r1 = r1 + r17
            r1 = r1 & r6
            java.lang.Object[] r0 = r8.elements
            r0 = r0[r1]
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r9)
            if (r0 == 0) goto L86
        L80:
            if (r1 < 0) goto L85
            r10.removeElementAt(r1)
        L85:
            return
        L86:
            r2 = 1
            long r0 = r13 - r2
            long r13 = r13 & r0
            goto L67
        L8c:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r4 = r4 & r0
            long r4 = r4 & r15
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 == 0) goto L97
            r1 = -1
            goto L80
        L97:
            int r18 = r18 + 8
            int r17 = r17 + r18
            goto L20
        L9c:
            r1 = r18
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.minusAssign(java.lang.Object):void");
    }

    public final boolean removeAll(E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = getSize();
        minusAssign((Object[]) elements);
        return size != getSize();
    }

    public final boolean removeAll(Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = getSize();
        minusAssign((Sequence) elements);
        return size != getSize();
    }

    public final boolean removeAll(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = getSize();
        minusAssign((Iterable) elements);
        return size != getSize();
    }

    public final boolean removeAll(ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = getSize();
        minusAssign((ScatterSet) elements);
        return size != getSize();
    }

    public final boolean removeAll(ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = getSize();
        minusAssign((ObjectList) elements);
        return size != getSize();
    }

    public final void removeIf(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
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
                        if (predicate.invoke(objArr[i5]).booleanValue()) {
                            removeElementAt(i5);
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

    public final void removeElementAt(int i2) {
        this._size--;
        long[] jArr = this.metadata;
        int i3 = this._capacity;
        int i4 = i2 >> 3;
        int i5 = (7 & i2) << 3;
        long j2 = (-1) - (((-1) - ((-1) - (((-1) - jArr[i4]) | ((-1) - (~(255 << i5)))))) & ((-1) - (254 << i5)));
        jArr[i4] = j2;
        jArr[(((-1) - (((-1) - (i2 - 7)) | ((-1) - i3))) + ((-1) - (((-1) - i3) | ((-1) - 7)))) >> 3] = j2;
        this.elements[i2] = null;
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
        ArraysKt.fill(this.elements, (Object) null, 0, this._capacity);
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
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (~j2) << 7;
            long j4 = (-1) - (((-1) - ((j2 + j3) - (j2 | j3))) | ((-1) - (-9187201950435737472L)));
            if (j4 != 0) {
                int iNumberOfTrailingZeros = i4 + (Long.numberOfTrailingZeros(j4) >> 3);
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
        resizeStorage$collection(iNormalizeCapacity);
        return i2 - this._capacity;
    }

    public final void adjustStorage$collection() {
        if (this._capacity > 8 && Long.compareUnsigned(ULong.m9154constructorimpl(ULong.m9154constructorimpl(this._size) * 32), ULong.m9154constructorimpl(ULong.m9154constructorimpl(this._capacity) * 25)) <= 0) {
            dropDeletes$collection();
        } else {
            resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
        }
    }

    public final void dropDeletes$collection() {
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        Object[] objArr = this.elements;
        ScatterMapKt.convertMetadataForCleanup(jArr, i2);
        int i3 = 0;
        int i4 = 0;
        int iFindEmptySlot = -1;
        while (i4 != i2) {
            int i5 = i4 >> 3;
            int i6 = (7 & i4) << 3;
            long j2 = (-1) - (((-1) - (jArr[i5] >> i6)) | ((-1) - 255));
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
                    int i10 = iFindFirstAvailableSlot - i9;
                    if (((i10 + i2) - (i10 | i2)) / 8 == ((-1) - (((-1) - (i4 - i9)) | ((-1) - i2))) / 8) {
                        jArr[i5] = (((long) ((-1) - (((-1) - i7) | ((-1) - 127)))) << i6) | ((-1) - (((-1) - (~(255 << i6))) | ((-1) - jArr[i5])));
                        jArr[ArraysKt.getLastIndex(jArr)] = (jArr[i3] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i11 = iFindFirstAvailableSlot >> 3;
                        long j3 = jArr[i11];
                        int i12 = (iFindFirstAvailableSlot & 7) << 3;
                        long j4 = j3 >> i12;
                        if ((j4 + 255) - (j4 | 255) == 128) {
                            long j5 = ~(255 << i12);
                            long j6 = (j3 + j5) - (j3 | j5);
                            long j7 = ((long) ((i7 + 127) - (i7 | 127))) << i12;
                            jArr[i11] = (j7 + j6) - (j7 & j6);
                            long j8 = jArr[i5];
                            long j9 = ~(255 << i6);
                            jArr[i5] = (-1) - (((-1) - ((j8 + j9) - (j8 | j9))) & ((-1) - (128 << i6)));
                            objArr[iFindFirstAvailableSlot] = objArr[i4];
                            objArr[i4] = null;
                            iFindEmptySlot = i4;
                        } else {
                            jArr[i11] = (((long) ((-1) - (((-1) - i7) | ((-1) - 127)))) << i12) | (j3 & (~(255 << i12)));
                            if (iFindEmptySlot == -1) {
                                iFindEmptySlot = ScatterMapKt.findEmptySlot(jArr, i4 + 1, i2);
                            }
                            objArr[iFindEmptySlot] = objArr[iFindFirstAvailableSlot];
                            objArr[iFindFirstAvailableSlot] = objArr[i4];
                            objArr[i4] = objArr[iFindEmptySlot];
                            i4--;
                        }
                        int lastIndex = ArraysKt.getLastIndex(jArr);
                        i3 = 0;
                        long j10 = jArr[0] & 72057594037927935L;
                        jArr[lastIndex] = (j10 - Long.MIN_VALUE) - (j10 & Long.MIN_VALUE);
                        i4++;
                    }
                }
                i4++;
            }
        }
        initializeGrowth();
    }

    public final void resizeStorage$collection(int i2) {
        long[] jArr = this.metadata;
        Object[] objArr = this.elements;
        int i3 = this._capacity;
        initializeStorage(i2);
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.elements;
        int i4 = this._capacity;
        for (int i5 = 0; i5 < i3; i5++) {
            if ((-1) - (((-1) - (jArr[i5 >> 3] >> ((7 & i5) << 3))) | ((-1) - 255)) < 128) {
                Object obj = objArr[i5];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i6 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i6 >>> 7);
                int i7 = iFindFirstAvailableSlot >> 3;
                int i8 = (iFindFirstAvailableSlot & 7) << 3;
                long j2 = (jArr2[i7] & (~(255 << i8))) | (((long) ((i6 + 127) - (i6 | 127))) << i8);
                jArr2[i7] = j2;
                int i9 = iFindFirstAvailableSlot - 7;
                jArr2[(((i9 + i4) - (i9 | i4)) + ((-1) - (((-1) - i4) | ((-1) - 7)))) >> 3] = j2;
                objArr2[iFindFirstAvailableSlot] = obj;
            }
        }
    }

    public final Set<E> asMutableSet() {
        return new MutableSetWrapper();
    }

    /* JADX INFO: compiled from: ScatterSet.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLc\u000b\u0004I\u0006>,6B\u0005\"4\u0012\u0006\u0010nj?2LeVJZݷ2\u000fy{<řc$\u007fjCU \u007f(ޞQdʴ\u0018xxY[I\u001f\b&x!ߚwU)c\"\u0011BB&ЀaN0@˃dtD\u0007hE0;\u0012\u0005/\u001eZL\u001e{\u0013C\u0002ÈXDϮt:`\u0013\u0016\u0019(\u0019\u001e>N\u0005NfuVNN|_J/YɅ\u0018K\u0015;(6\u000bW%F\u00032S\u000b*+9LO;%'c\u0003=Ѹ\nLIӡq\u0006\u0018v5?+ww\b:f\u0005,\u0015a˽Sqę*\\\u0013W) 5:gcyT>2\u0006\u0003\u0014\u0013L\u0006\u001e\u0006]Ξ\\6`zP\"A\u0005\u000bSnT2hP\b\u0013gF\u00195\u007fiٿg$-eŎ?*"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r D[\u0016=\f+Kz0\u001b\u001chO9\u0016U9J\u00022GY$", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u0015\u0013V~\u000eId%D\u0018k F_#*XN;x\n", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u0015\u0013V~\u000eId%D/", "", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ~'Vk\u000bCv\u00133U\r/7z\u0004.\\\u0019~\\", "/cS", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "/cS\u000e_3", "3kT:X5Ma", "", "1kT.e", "", "7sT?T;H`", "", "@d\\<i,", "@d\\<i,\u001aZ ", "@dc.\\5\u001aZ ", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class MutableSetWrapper extends ScatterSet<E>.SetWrapper implements Set<E>, KMutableSet {
        public MutableSetWrapper() {
            super();
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean add(E e2) {
            return MutableScatterSet.this.add(e2);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return MutableScatterSet.this.addAll(elements);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public void clear() {
            MutableScatterSet.this.clear();
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return new MutableScatterSet$MutableSetWrapper$iterator$1(MutableScatterSet.this);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            return MutableScatterSet.this.remove(obj);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean retainAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            MutableScatterSet<E> mutableScatterSet = MutableScatterSet.this;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            boolean z2 = false;
            if (length >= 0) {
                int i2 = 0;
                boolean z3 = false;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2))) & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                                int i5 = (i2 << 3) + i4;
                                if (!elements.contains(mutableScatterSet.elements[i5])) {
                                    mutableScatterSet.removeElementAt(i5);
                                    z3 = true;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            return z3;
                        }
                    }
                    if (i2 == length) {
                        z2 = z3;
                        break;
                    }
                    i2++;
                }
            }
            return z2;
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean removeAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int size = MutableScatterSet.this.getSize();
            Iterator<? extends Object> it = elements.iterator();
            while (it.hasNext()) {
                MutableScatterSet.this.minusAssign((E) it.next());
            }
            return size != MutableScatterSet.this.getSize();
        }
    }

    public final void plusAssign(E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (E e2 : elements) {
            plusAssign(e2);
        }
    }

    public final void plusAssign(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            plusAssign(it.next());
        }
    }

    public final void plusAssign(Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            plusAssign(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        plusAssign(objArr[(i2 << 3) + i4]);
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
    public final void plusAssign(ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.content;
        int i2 = elements._size;
        for (int i3 = 0; i3 < i2; i3++) {
            plusAssign(objArr[i3]);
        }
    }

    public final void minusAssign(E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (E e2 : elements) {
            minusAssign(e2);
        }
    }

    public final void minusAssign(Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            minusAssign(it.next());
        }
    }

    public final void minusAssign(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            minusAssign(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        minusAssign(objArr[(i2 << 3) + i4]);
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
    public final void minusAssign(ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.content;
        int i2 = elements._size;
        for (int i3 = 0; i3 < i2; i3++) {
            minusAssign(objArr[i3]);
        }
    }

    private final int findAbsoluteInsertIndex(E e2) {
        int iHashCode = (e2 != null ? e2.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = (i2 + 127) - (i2 | 127);
        int i5 = this._capacity;
        int i6 = (-1) - (((-1) - i3) | ((-1) - i5));
        int i7 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = ((-1) - (((-1) - i6) | ((-1) - 7))) << 3;
            long j2 = jArr[i8] >>> i9;
            long j3 = (-1) - (((-1) - (jArr[i8 + 1] << (64 - i9))) | ((-1) - ((-i9) >> 63)));
            long j4 = (j3 + j2) - (j3 & j2);
            long j5 = i4;
            long j6 = j4 ^ (j5 * ScatterMapKt.BitmaskLsb);
            long j7 = (~j6) & (j6 - ScatterMapKt.BitmaskLsb);
            for (long j8 = (j7 - 9187201950435737472L) - (j7 | (-9187201950435737472L)); j8 != 0; j8 &= j8 - 1) {
                int iNumberOfTrailingZeros = (-1) - (((-1) - (i6 + (Long.numberOfTrailingZeros(j8) >> 3))) | ((-1) - i5));
                if (Intrinsics.areEqual(this.elements[iNumberOfTrailingZeros], e2)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                if (this.growthLimit == 0) {
                    long j9 = this.metadata[iFindFirstAvailableSlot >> 3] >> (((-1) - (((-1) - iFindFirstAvailableSlot) | ((-1) - 7))) << 3);
                    if ((j9 + 255) - (j9 | 255) != 254) {
                        adjustStorage$collection();
                        iFindFirstAvailableSlot = findFirstAvailableSlot(i3);
                    }
                }
                this._size++;
                int i10 = this.growthLimit;
                int i11 = iFindFirstAvailableSlot >> 3;
                int i12 = ((iFindFirstAvailableSlot + 7) - (iFindFirstAvailableSlot | 7)) << 3;
                long j10 = this.metadata[i11] >> i12;
                this.growthLimit = i10 - ((j10 + 255) - (j10 | 255) != 128 ? 0 : 1);
                long[] jArr2 = this.metadata;
                int i13 = this._capacity;
                long j11 = ((-1) - (((-1) - (~(255 << i12))) | ((-1) - jArr2[i11]))) | (j5 << i12);
                jArr2[i11] = j11;
                jArr2[(((-1) - (((-1) - (iFindFirstAvailableSlot - 7)) | ((-1) - i13))) + ((i13 + 7) - (i13 | 7))) >> 3] = j11;
                return iFindFirstAvailableSlot;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }
}
