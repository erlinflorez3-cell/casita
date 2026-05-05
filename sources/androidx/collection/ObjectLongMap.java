package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: ObjectLongMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яl\u001d<K!&˛\bDRш|\u0004G\u00068\u000b<H\u0007\"2\u0017\u007f\u0007tyA0JfP.`g2\u000fq\u007f<$i-yّCU0}*\t]UogtUb\u000bQ\u000f\u000eǝ\u0001jBI]xc\u0012\u00172XoG3SvE9vt>\u0005&5*8\b\u0011\tɝ2H\u001e\u0002\u0003CQ\u0011\u001a0VpBĥ\u0013\u0002\u001b܅:\bDĨ\u000f\u001d\rg|6\tqc<ǥ'\u0003wC\u0017KmE\u0015M;\\\u0005=\u001b\u000ey0;BG5KǬc\u0005\u0017R\nX\u0013A\u0002=3~U?qɥyˇ5ݙH\u0018#Eg\r\f\tn\u0001\u0013kx\fUA\u007fyYg&:\b|\f\rrǉ\u001e\b7H\\F*h\u0018\u000ea\u000b!k\u0007З\b\u0081AȕCuD2=\u007faAi\u001ftmy;O\u05cb}ޭ\u0005ڟ\"#\u000f\filb,x\u0015Ij(U?mX=~ݐ̆]={!9n\u0010I\u001c0u\u0016_\u007f\u001fN/%et\u0002'/\r\u001aHrj?)n\nki\u0001Kp8|-O<\u0019\u000ejD\u001bʍ{RdXZ*]\u001ed\u0007,\u001eA8#ʃBȒ$ī\u0017`v\f\u0003M\f U5tZqp\u0002\r\u00069%ڿ5\u001av\u001e\u0006jvBBlf\u0013t~B\nێ![͈&2V\u0010X:\njf\fAYo&*\\Da)m%W9ٜնE\u0007\u000f\tjn\u0016)d5*\t\u0010@\u0005\u001a\u0011_\u000b\n״k\u0003OU\rf(WQS;\u001fLu2jD|Q.-\fFÿmׯFƂ5C\u0004\u0001\u0014 DAip=e+*\u000f:B\u0011[HʆvoWv\"-\u0001'\n\u0011AnT\u0015\u0018l\u0001,\u000f\u0012x{\u001bϡ(֧]аk5r.\u0012at\"w\u0003b3sYY\u0004\u0013hrѾ̞\u0001\u000f%G5\u0007uL\r73IM9&y$/C\t\f\u00166Њ\u007f̥\u000eծ=\u0013\u0012[{\u0016\u001e\n\u0002|@cPdi\u0010N1R\u0006úFRp!\u0018H\u000f^\u001d5NG\u000b\u0011f:]\u000b]%\u00153rݿvĜZƥ[\u0004\fdF_X\rs\u0002\"z[%G\u07bd\u001aܑmߑO\\\u0019{W#\u0019.In@5m$dsz\tfү$\u001cDtSb3Uʢ(4:pP0Q\n\u0002\u0006>\u00140Jm+/2xƽk`\u001c\b\u0011bfJ\u0015`syO`GϚ\u0015˵\u001d֭\u00985\u0005{}\u001d5qj\u0019SK\fa~\u0018\u0003t^CD\u0003Oc,f;#E\fY\u0012:D?_)\u001c( \u0012>\u0018\u000bZZ\u0018Iw\u0002\u0017ev>\u001e#U\u0013\r\u0015|\u0018f`\u000f:)-9-\u0014B\n\u001dL1O!r\u00133RN\u0006y[\u001a/U\u000b.O\u0003\u000b\u001f^\u001b[Be3CIxQ?{\u0006\u0012k\u0004\u000e .f\u001ctO\u001b\b\u0014l\nk[R\u0016 T\u0013\b\u000f\u0013^a\u001c.xw#\u00104\bD\u0012\u001a30Q\u000f\u0010qy/\u0004?[|\u0017RZ\u001fǍƠgvi\u0018e\u0011\t\u0011AX\u007ftSl-\u001a7\\\\,͠^D\u0017|0^\u0017*$\u0017,%\\(r+ O\u0012'\u001f\u0004\u0016܈\u0013Ƅ.մre?tj\u001e,5B{\u0012ol(Cw\u001da\u000fz\u0017^\u0005B\u0006\u0011\u0015ȥf˯Kׅ5ِ\u0001\u0005P՝!\u0015:J\u0001\u001f5EE\u001e7[;J\u0017ԂBـ \u0090-ܳVE#ΠB\ru.\u0005\u0012SIp{\u0018*p\f)D\u05ff01^VC\"5bt\u000er\r>SU<R\nB\u0010<\u0011]enԌ|юpˣGǾ7I!\u0011\u000f\"H\bu\u0013'6;ga3B\u0001+\u0010Cׄ8ۧB¡\u007f٥v)7ݩ\u007f\u001d]vI&\u0006tZ8$\u0002\u0014M5\u0012\u07b2Z\u0013y.OGS'JkN\u0013\"\u001fR3<®aǇ\u001cʻT\u008dcbHѲ\u0004Y\n:87˗C\"\u000eؠxx\u0012/oѼ$\u0013ZɎ8\t"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nj\u0014\u001cGm\u001d#\u0001.7Ay+\r", "\u0019", "", "u(E", "-bP=T*Bb-", "", "5dc,V(IO\u0017\u0003\nrjz\u00136l\u007f&\u000bD\u000b UCx\u0017F\u0006!D]\b)E", "-rXGX", "5dc,f0SSW|\u0005e3|\u0007>i\n1:<\n !Vk\u001d@\u0001.C", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "9dh@", "", "5dc\u0018X@L\u0012\u0015\b\u0004h;x\u00183o\t6", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", ";dc.W(MO", "", "5dc\u001aX;:R\u0015\u000ev\u001d(\u0006\u00129t{7\u007fJ\n%", "Ahi2", "5dc \\A>", "D`[BX:", "5dc#T3NS'=vg5\u0007\u0018+t\u00042\u0005N", "/k[", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "/mh", "1n]AT0Ga", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1n]AT0Ga~~\u000f", "1n]AT0Ga\nz\u0002n,", "D`[BX", "1nd;g", "3pd._:", "=sW2e", "4h]1>,R7\"}zq", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "4na\u0012T*A", "", "0k^0^", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4na\u0012T*A7\"}zq,{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "7mS2k", "4na\u0012T*A9\u0019\u0013", "4na\u0012T*AD\u0015\u0006\u000b^", "5dc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?%", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "2dU.h3MD\u0015\u0006\u000b^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}`\u0004e", "5dc\u001ce\fEa\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010.\u0002\u0012[", "6`b566=S", "7r4:c;R", "7r=<g\fF^(\u0013", "8nX;G6,b&\u0003\u0004`", "", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "BqP;f-H`!", "<n]2", "BnBAe0GU", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u001ew\u001f05?FA", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class ObjectLongMap<K> {
    public int _capacity;
    public int _size;
    public Object[] keys;
    public long[] metadata;
    public long[] values;

    public /* synthetic */ ObjectLongMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
    }

    public static /* synthetic */ void get_size$collection$annotations() {
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final String joinToString(CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i2) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i2, null, 16, null);
    }

    private ObjectLongMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = ContainerHelpersKt.EMPTY_OBJECTS;
        this.values = LongSetKt.getEmptyLongArray();
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final int getSize() {
        return this._size;
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final long get(K k2) {
        int iFindKeyIndex = findKeyIndex(k2);
        if (iFindKeyIndex < 0) {
            throw new NoSuchElementException("There is no key " + k2 + " in the map");
        }
        return this.values[iFindKeyIndex];
    }

    public final long getOrDefault(K k2, long j2) {
        int iFindKeyIndex = findKeyIndex(k2);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : j2;
    }

    public final long getOrElse(K k2, Function0<Long> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(k2);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        return defaultValue.invoke().longValue();
    }

    public final void forEachIndexed(Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
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
                    if ((255 & j2) < 128) {
                        block.invoke(Integer.valueOf((i2 << 3) + i4));
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

    public final void forEach(Function2<? super K, ? super Long, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr2[i2];
            long j3 = ((~j2) << 7) & j2;
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        block.invoke(objArr[i5], Long.valueOf(jArr[i5]));
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

    public final void forEachKey(Function1<? super K, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.keys;
        long[] jArr = this.metadata;
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
                        block.invoke(objArr[(i2 << 3) + i4]);
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

    public final void forEachValue(Function1<? super Long, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr2[i2];
            if ((((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2))) & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                        block.invoke(Long.valueOf(jArr[(i2 << 3) + i4]));
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

    public final int count() {
        return getSize();
    }

    public final boolean contains(K k2) {
        return findKeyIndex(k2) >= 0;
    }

    public final boolean containsKey(K k2) {
        return findKeyIndex(k2) >= 0;
    }

    public static /* synthetic */ String joinToString$default(ObjectLongMap objectLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i3 + 1) - (1 | i3) != 0) {
        }
        if ((2 & i3) != 0) {
        }
        if ((i3 + 4) - (4 | i3) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
        }
        return objectLongMap.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence4);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae A[PHI: r5
  0x00ae: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:38:0x0053, B:54:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, java.lang.CharSequence r27, int r28, java.lang.CharSequence r29) {
        /*
            r24 = this;
            r2 = r24
            java.lang.String r1 = "separator"
            r23 = r25
            r0 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "prefix"
            r3 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r1 = "postfix"
            r22 = r27
            r0 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "truncated"
            r12 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            java.lang.Object[] r10 = r2.keys
            long[] r9 = r2.values
            long[] r8 = r2.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto Lb5
            r6 = 0
            r5 = 0
        L3b:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            r15 = -1
            long r13 = r15 - r0
            long r0 = r15 - r3
            long r13 = r13 | r0
            long r15 = r15 - r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r15 + r13
            long r15 = r15 | r13
            long r1 = r1 - r15
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto Lab
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r13 = 0
        L5f:
            if (r13 >= r14) goto Lac
            r20 = 255(0xff, double:1.26E-321)
            r18 = -1
            long r16 = r18 - r3
            long r0 = r18 - r20
            long r16 = r16 | r0
            long r18 = r18 - r16
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r0 >= 0) goto L8c
            int r0 = r6 << 3
            int r0 = r0 + r13
            r15 = r10[r0]
            r1 = r9[r0]
            r0 = r28
            r0 = r0
            if (r5 != r0) goto L8d
            r11.append(r12)
        L82:
            java.lang.String r1 = r11.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L8c:
            goto La5
        L8d:
            if (r5 == 0) goto L96
            r16 = r11
            r17 = r23
            r16.append(r17)
        L96:
            r11.append(r15)
            r0 = 61
            r11.append(r0)
            r11.append(r1)
            int r5 = r5 + 1
            r15 = 8
        La5:
            long r3 = r3 >> r15
            int r13 = r13 + 1
            r0 = r24
            goto L5f
        Lab:
            goto Lae
        Lac:
            if (r14 != r15) goto Lb5
        Lae:
            if (r6 == r7) goto Lb5
            int r6 = r6 + 1
            r0 = r24
            goto L3b
        Lb5:
            r0 = r22
            r11.append(r0)
            goto L82
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x00e4 A[PHI: r4
  0x00e4: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:79:0x008c, B:95:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.ObjectLongMap r17, java.lang.CharSequence r18, java.lang.CharSequence r19, java.lang.CharSequence r20, int r21, java.lang.CharSequence r22, kotlin.jvm.functions.Function2 r23, int r24, java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.joinToString$default(androidx.collection.ObjectLongMap, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2, int, java.lang.Object):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1 A[PHI: r4
  0x00b1: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:39:0x0057, B:56:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r23, java.lang.CharSequence r24, java.lang.CharSequence r25, int r26, java.lang.CharSequence r27, kotlin.jvm.functions.Function2<? super K, ? super java.lang.Long, ? extends java.lang.CharSequence> r28) {
        /*
            r22 = this;
            r2 = r22
            java.lang.String r1 = "separator"
            r21 = r23
            r0 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "prefix"
            r1 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "postfix"
            r13 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "truncated"
            r12 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "transform"
            r11 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            java.lang.Object[] r9 = r2.keys
            long[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb8
            r5 = 0
            r4 = 0
        L41:
            r2 = r7[r5]
            long r0 = ~r2
            r14 = 7
            long r0 = r0 << r14
            long r0 = r0 & r2
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r16 = -1
            long r14 = r16 - r0
            long r0 = r16 - r18
            long r14 = r14 | r0
            long r16 = r16 - r14
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 == 0) goto Lac
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L63:
            if (r14 >= r1) goto Lad
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L8b
            int r0 = r5 << 3
            int r0 = r0 + r14
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = r26
            if (r4 != r0) goto L8c
            r10.append(r12)
        L81:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L8b:
            goto La4
        L8c:
            if (r4 == 0) goto L95
            r18 = r10
            r19 = r21
            r18.append(r19)
        L95:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            java.lang.Object r0 = r11.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        La4:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r22
            goto L63
        Lac:
            goto Lb1
        Lad:
            r0 = 8
            if (r1 != r0) goto Lb8
        Lb1:
            if (r5 == r6) goto Lb8
            int r5 = r5 + 1
            r0 = r22
            goto L41
        Lb8:
            r10.append(r13)
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r13 = r21
            r2 = r20
            r19 = 1
            if (r13 != r2) goto L9
            return r19
        L9:
            boolean r0 = r13 instanceof androidx.collection.ObjectLongMap
            r18 = 0
            if (r0 != 0) goto L10
            return r18
        L10:
            androidx.collection.ObjectLongMap r13 = (androidx.collection.ObjectLongMap) r13
            int r1 = r13.getSize()
            int r0 = r20.getSize()
            if (r1 == r0) goto L1d
            return r18
        L1d:
            java.lang.Object[] r12 = r2.keys
            long[] r11 = r2.values
            long[] r10 = r2.metadata
            int r0 = r10.length
            int r9 = r0 + (-2)
            if (r9 < 0) goto L76
            r8 = r18
        L2a:
            r6 = r10[r8]
            long r0 = ~r6
            r2 = 7
            long r0 = r0 << r2
            long r16 = r0 + r6
            long r0 = r0 | r6
            long r16 = r16 - r0
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r4 = -1
            long r2 = r4 - r16
            long r0 = r4 - r14
            long r2 = r2 | r0
            long r4 = r4 - r2
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 == 0) goto L71
            int r0 = r8 - r9
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r5 = r18
        L50:
            if (r5 >= r14) goto L6f
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r6
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6b
            int r1 = r8 << 3
            int r1 = r1 + r5
            r0 = r12[r1]
            r3 = r11[r1]
            long r1 = r13.get(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L6b
            return r18
        L6b:
            long r6 = r6 >> r15
            int r5 = r5 + 1
            goto L50
        L6f:
            if (r14 != r15) goto L76
        L71:
            if (r8 == r9) goto L76
            int r8 = r8 + 1
            goto L2a
        L76:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x007a A[PHI: r5
  0x007a: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:45:0x0039, B:59:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r19 = this;
            r12 = r19
            boolean r0 = r19.isEmpty()
            if (r0 == 0) goto Lc
            java.lang.String r0 = "{}"
            return r0
        Lc:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "{"
            r11.<init>(r0)
            java.lang.Object[] r10 = r12.keys
            long[] r9 = r12.values
            long[] r8 = r12.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L7f
            r6 = 0
            r5 = 0
        L21:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            r15 = -1
            long r13 = r15 - r0
            long r0 = r15 - r3
            long r13 = r13 | r0
            long r15 = r15 - r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r15 + r13
            long r15 = r15 | r13
            long r1 = r1 - r15
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L77
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r14 = 8
            int r13 = 8 - r0
            r2 = 0
        L45:
            if (r2 >= r13) goto L78
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r17 & r3
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L76
            int r0 = r6 << 3
            int r0 = r0 + r2
            r15 = r10[r0]
            r0 = r9[r0]
            if (r15 != r12) goto L5c
            java.lang.String r15 = "(this)"
        L5c:
            r11.append(r15)
            java.lang.String r15 = "="
            r11.append(r15)
            r11.append(r0)
            int r5 = r5 + 1
            int r0 = r12._size
            if (r5 >= r0) goto L72
            java.lang.String r0 = ", "
            r11.append(r0)
        L72:
            long r3 = r3 >> r14
            int r2 = r2 + 1
            goto L45
        L76:
            goto L72
        L77:
            goto L7a
        L78:
            if (r13 != r14) goto L7f
        L7a:
            if (r6 == r7) goto L7f
            int r6 = r6 + 1
            goto L21
        L7f:
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r11.append(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "s.append('}').toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.toString():java.lang.String");
    }

    public final boolean all(Function2<? super K, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr2[i2];
            long j3 = ((~j2) << 7) & j2;
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 + j2) - (255 | j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (!predicate.invoke(objArr[i5], Long.valueOf(jArr[i5])).booleanValue()) {
                            return false;
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return true;
                }
            }
            if (i2 == length) {
                return true;
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(kotlin.jvm.functions.Function2<? super K, ? super java.lang.Long, java.lang.Boolean> r21) {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r0 = "predicate"
            r10 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.Object[] r9 = r1.keys
            long[] r8 = r1.values
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            r19 = 0
            if (r6 < 0) goto L79
            r5 = r19
        L19:
            r3 = r7[r5]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            r17 = -1
            long r11 = r17 - r0
            long r0 = r17 - r3
            long r11 = r11 | r0
            long r17 = r17 - r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = -1
            long r11 = r13 - r17
            long r0 = r13 - r15
            long r11 = r11 | r0
            long r13 = r13 - r11
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L74
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r2 = r19
        L43:
            if (r2 >= r11) goto L72
            r0 = 255(0xff, double:1.26E-321)
            r15 = -1
            long r13 = r15 - r0
            long r0 = r15 - r3
            long r13 = r13 | r0
            long r15 = r15 - r13
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L6e
            int r0 = r5 << 3
            int r0 = r0 + r2
            r13 = r9[r0]
            r0 = r8[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r10.invoke(r13, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6e
            r0 = 1
            return r0
        L6e:
            long r3 = r3 >> r12
            int r2 = r2 + 1
            goto L43
        L72:
            if (r11 != r12) goto L79
        L74:
            if (r5 == r6) goto L79
            int r5 = r5 + 1
            goto L19
        L79:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.any(kotlin.jvm.functions.Function2):boolean");
    }

    public final int count(Function2<? super K, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j2 = jArr2[i3];
                if ((((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2))) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            if (predicate.invoke(objArr[i7], Long.valueOf(jArr[i7])).booleanValue()) {
                                i4++;
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i5 != 8) {
                        return i4;
                    }
                }
                if (i3 == length) {
                    i2 = i4;
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsValue(long r18) {
        /*
            r17 = this;
            r0 = r17
            long[] r9 = r0.values
            long[] r8 = r0.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            r16 = 0
            if (r7 < 0) goto L5c
            r6 = r16
        Lf:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            r12 = -1
            long r10 = r12 - r0
            long r0 = r12 - r3
            long r10 = r10 | r0
            long r12 = r12 - r10
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r12 + r10
            long r12 = r12 | r10
            long r1 = r1 - r12
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto L57
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r10 = 8 - r0
            r5 = r16
        L34:
            if (r5 >= r10) goto L55
            r0 = 255(0xff, double:1.26E-321)
            r14 = -1
            long r12 = r14 - r0
            long r0 = r14 - r3
            long r12 = r12 | r0
            long r14 = r14 - r12
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L51
            int r0 = r6 << 3
            int r0 = r0 + r5
            r1 = r9[r0]
            int r0 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r0 != 0) goto L51
            r0 = 1
            return r0
        L51:
            long r3 = r3 >> r11
            int r5 = r5 + 1
            goto L34
        L55:
            if (r10 != r11) goto L5c
        L57:
            if (r6 == r7) goto L5c
            int r6 = r6 + 1
            goto Lf
        L5c:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.containsValue(long):boolean");
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int iHashCode = 0;
            while (true) {
                long j2 = jArr2[i3];
                if ((-1) - (((-1) - ((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2)))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 + j2) - (255 | j2) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(jArr[i6]);
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        return iHashCode;
                    }
                }
                if (i3 == length) {
                    i2 = iHashCode;
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    public final int findKeyIndex(K k2) {
        int i2 = 0;
        int iHashCode = (k2 != null ? k2.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = (i3 + 127) - (127 | i3);
        int i5 = this._capacity;
        int i6 = i3 >>> 7;
        while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.metadata;
            int i8 = i7 >> 3;
            int i9 = ((i7 + 7) - (i7 | 7)) << 3;
            long j2 = (-1) - (((-1) - ((-1) - (((-1) - (jArr[i8 + 1] << (64 - i9))) | ((-1) - ((-i9) >> 63))))) & ((-1) - (jArr[i8] >>> i9)));
            long j3 = (((long) i4) * ScatterMapKt.BitmaskLsb) ^ j2;
            for (long j4 = (-1) - (((-1) - ((~j3) & (j3 - ScatterMapKt.BitmaskLsb))) | ((-1) - (-9187201950435737472L))); j4 != 0; j4 = (-1) - (((-1) - j4) | ((-1) - (j4 - 1)))) {
                int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(j4) >> 3) + i7;
                int i10 = (iNumberOfTrailingZeros + i5) - (iNumberOfTrailingZeros | i5);
                if (Intrinsics.areEqual(this.keys[i10], k2)) {
                    return i10;
                }
            }
            if ((-1) - (((-1) - ((-1) - (((-1) - j2) | ((-1) - ((~j2) << 6))))) | ((-1) - (-9187201950435737472L))) != 0) {
                return -1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad A[PHI: r4
  0x00ad: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:39:0x004f, B:56:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, java.lang.CharSequence r27, int r28, kotlin.jvm.functions.Function2<? super K, ? super java.lang.Long, ? extends java.lang.CharSequence> r29) {
        /*
            r24 = this;
            r2 = r24
            java.lang.String r1 = "separator"
            r23 = r25
            r0 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "prefix"
            r1 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "postfix"
            r13 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "transform"
            r12 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r11 = "..."
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            java.lang.Object[] r9 = r2.keys
            long[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb4
            r5 = 0
            r4 = 0
        L3d:
            r2 = r7[r5]
            long r0 = ~r2
            r14 = 7
            long r0 = r0 << r14
            long r0 = r0 & r2
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r0 + r16
            long r0 = r0 | r16
            long r14 = r14 - r0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto La8
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L5b:
            if (r14 >= r1) goto La9
            r21 = 255(0xff, double:1.26E-321)
            r19 = -1
            long r17 = r19 - r2
            long r15 = r19 - r21
            long r17 = r17 | r15
            long r19 = r19 - r17
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r0 >= 0) goto L87
            int r0 = r5 << 3
            int r0 = r0 + r14
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = r28
            if (r4 != r0) goto L88
            r10.append(r11)
        L7d:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L87:
            goto La0
        L88:
            if (r4 == 0) goto L91
            r18 = r10
            r19 = r23
            r18.append(r19)
        L91:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            java.lang.Object r0 = r12.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        La0:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r24
            goto L5b
        La8:
            goto Lad
        La9:
            r0 = 8
            if (r1 != r0) goto Lb4
        Lad:
            if (r5 == r6) goto Lb4
            int r5 = r5 + 1
            r0 = r24
            goto L3d
        Lb4:
            r10.append(r13)
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8 A[PHI: r4
  0x00a8: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:39:0x004f, B:56:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r23, java.lang.CharSequence r24, java.lang.CharSequence r25, kotlin.jvm.functions.Function2<? super K, ? super java.lang.Long, ? extends java.lang.CharSequence> r26) {
        /*
            r22 = this;
            r2 = r22
            java.lang.String r1 = "separator"
            r21 = r23
            r0 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "prefix"
            r1 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "postfix"
            r13 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "transform"
            r12 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r11 = "..."
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            java.lang.Object[] r9 = r2.keys
            long[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Laf
            r5 = 0
            r4 = 0
        L3d:
            r2 = r7[r5]
            long r0 = ~r2
            r14 = 7
            long r0 = r0 << r14
            long r0 = r0 & r2
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r0 + r16
            long r0 = r0 | r16
            long r14 = r14 - r0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto La3
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L5b:
            if (r14 >= r1) goto La4
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L82
            int r0 = r5 << 3
            int r0 = r0 + r14
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L83
            r10.append(r11)
        L78:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L82:
            goto L9b
        L83:
            if (r4 == 0) goto L8c
            r18 = r10
            r19 = r21
            r18.append(r19)
        L8c:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            java.lang.Object r0 = r12.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        L9b:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r22
            goto L5b
        La3:
            goto La8
        La4:
            r0 = 8
            if (r1 != r0) goto Laf
        La8:
            if (r5 == r6) goto Laf
            int r5 = r5 + 1
            r0 = r22
            goto L3d
        Laf:
            r10.append(r13)
            goto L78
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5 A[PHI: r4
  0x00a5: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:39:0x0050, B:56:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r22, java.lang.CharSequence r23, kotlin.jvm.functions.Function2<? super K, ? super java.lang.Long, ? extends java.lang.CharSequence> r24) {
        /*
            r21 = this;
            r2 = r21
            java.lang.String r1 = "separator"
            r20 = r22
            r0 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "prefix"
            r1 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "transform"
            r13 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r12 = ""
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            java.lang.String r11 = "..."
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            java.lang.Object[] r9 = r2.keys
            long[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lac
            r5 = 0
            r4 = 0
        L39:
            r2 = r7[r5]
            long r0 = ~r2
            r14 = 7
            long r0 = r0 << r14
            long r18 = r0 + r2
            long r0 = r0 | r2
            long r18 = r18 - r0
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r18 + r16
            long r18 = r18 | r16
            long r14 = r14 - r18
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto La0
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L5c:
            if (r14 >= r1) goto La1
            r15 = 255(0xff, double:1.26E-321)
            long r17 = r2 & r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L7f
            int r0 = r5 << 3
            int r0 = r0 + r14
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L80
            r10.append(r11)
        L75:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L7f:
            goto L98
        L80:
            if (r4 == 0) goto L89
            r18 = r10
            r19 = r20
            r18.append(r19)
        L89:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        L98:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r21
            goto L5c
        La0:
            goto La5
        La1:
            r0 = 8
            if (r1 != r0) goto Lac
        La5:
            if (r5 == r6) goto Lac
            int r5 = r5 + 1
            r0 = r21
            goto L39
        Lac:
            r10.append(r12)
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0098 A[PHI: r4
  0x0098: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:37:0x0042, B:52:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r24, kotlin.jvm.functions.Function2<? super K, ? super java.lang.Long, ? extends java.lang.CharSequence> r25) {
        /*
            r23 = this;
            r2 = r23
            java.lang.String r1 = "separator"
            r22 = r24
            r0 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "transform"
            r13 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r12 = ""
            r0 = r12
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            java.lang.String r11 = "..."
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.Object[] r9 = r2.keys
            long[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L9f
            r5 = 0
            r4 = 0
        L34:
            r2 = r7[r5]
            long r0 = ~r2
            r14 = 7
            long r0 = r0 << r14
            long r0 = r0 & r2
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r15
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 == 0) goto L98
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L4e:
            if (r1 >= r14) goto L96
            r20 = 255(0xff, double:1.26E-321)
            long r18 = r2 + r20
            long r16 = r2 | r20
            long r18 = r18 - r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L75
            int r0 = r5 << 3
            int r0 = r0 + r1
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L76
            r10.append(r11)
        L6b:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L75:
            goto L90
        L76:
            if (r4 == 0) goto L7f
            r18 = r10
            r19 = r22
            r18.append(r19)
        L7f:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L90:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r23
            goto L4e
        L96:
            if (r14 != r15) goto L9f
        L98:
            if (r5 == r6) goto L9f
            int r5 = r5 + 1
            r0 = r23
            goto L34
        L9f:
            r10.append(r12)
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.joinToString(java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2 A[PHI: r4
  0x00a2: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:37:0x004e, B:52:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(kotlin.jvm.functions.Function2<? super K, ? super java.lang.Long, ? extends java.lang.CharSequence> r24) {
        /*
            r23 = this;
            r2 = r23
            java.lang.String r1 = "transform"
            r22 = r24
            r0 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r13 = ", "
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            java.lang.String r12 = ""
            r0 = r12
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            java.lang.String r11 = "..."
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.Object[] r9 = r2.keys
            long[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La9
            r5 = 0
            r4 = 0
        L30:
            r2 = r7[r5]
            long r0 = ~r2
            r14 = 7
            long r0 = r0 << r14
            r20 = -1
            long r14 = r20 - r0
            long r0 = r20 - r2
            long r14 = r14 | r0
            long r20 = r20 - r14
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r16 = -1
            long r14 = r16 - r20
            long r0 = r16 - r18
            long r14 = r14 | r0
            long r16 = r16 - r14
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 == 0) goto La2
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L5a:
            if (r1 >= r14) goto La0
            r16 = 255(0xff, double:1.26E-321)
            long r18 = r2 & r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L7d
            int r0 = r5 << 3
            int r0 = r0 + r1
            r17 = r9[r0]
            r15 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L7e
            r10.append(r11)
        L73:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L7d:
            goto L9a
        L7e:
            if (r4 == 0) goto L83
            r10.append(r13)
        L83:
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            r15 = r22
            r16 = r17
            r17 = r0
            java.lang.Object r0 = r15.invoke(r16, r17)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L9a:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r23
            goto L5a
        La0:
            if (r14 != r15) goto La9
        La2:
            if (r5 == r6) goto La9
            int r5 = r5 + 1
            r0 = r23
            goto L30
        La9:
            r10.append(r12)
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectLongMap.joinToString(kotlin.jvm.functions.Function2):java.lang.String");
    }
}
