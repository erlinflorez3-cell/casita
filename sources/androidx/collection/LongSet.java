package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: LongSet.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005%4\u0012\u0006\u001bnj?4LeV7Zݷ2\u000f\u0002{<$i+yCQU\"}(\u0012WNugvJ`\u0010K\u000f\u0014\"\u0001̓4Ic\u0004e\u0012\u00157JoU3UڎCmvҚf\u0005N1b=\u007f\u0007в\u001e*V\u0010?3QY$\u0012^O!Y`\u001de *#\u0016MN\u0013ɉ`qTIXrcN?%\tohc7a@|{\u001ctemˠ|Ӧ\u001dѨ«7;\u001d)Y\u0002\u0017Ri>KC\u007fS\u001dhU6s\u0002\u0002mNX.#EJ]\u001du\u000e6m\u0015`\u000f\u001eˏ/Yi^`\u0014.\f\u000b}\u0013B*#\u0016)X.[)\u0015\u0019TޞzʺRóГ\u0002dJ\u0004\u0001`F\u00173~{:G2~Q\u0010JIRE\u0011\u001d\rL5G͠!$Z\u001cx-\u001b\u0003y\u00186\u001axK`f\n\b?\u001e#~r\u001aE\u0014AW\u000f]\u000e 2!+Jk?)5{\u0004NJ\u000e\f\u0015bxS\u0018avQhÊ\u001c\u05ec)\u009eȴZJl\tqOdX:\u0010\u0016-b \u0016\bA/\r}J;=\u0012dN\u0017h1ܫ]R9=\u0002OY\u001dm>[GsK5\u007fuVСXλ\u0018?B~M_t_k\f\tnnζ8\u0011#\u001e\u0015\u0014D|\u001eCQM\u00024O<B)kCZҴ\"LG\u0010\u0019e`| \u0001Z9J\u0018y&\u0005\t/_\u000b\u00026Φ~Λ+ʉʣ\"3IU;\u00186U0g|51%\u0017s.f\u0018kUl\u00051\u0006f\f/D,\u07fcU9C&\u001f\u0005/F\u0012/KR\u0019zaO\"')\u001c( \u0002ã4֏\u0007ξѴ,frNUS'\"\u0005];[\u0016\u0006\u0018y\u0010e+fqt#vNZ\u0003\u0012\b>ҡ<\u0007\u000b2.+\u0007\u00042~;3iI-\u0018\b\u0014]4\u0010n0۲4ՙaχձtk\f0i\u0015\u007fb_\\zAFlq~l$j\u0001KFV\u000f\u0010\bp\u0018|\u0011AmYd\u001fe\u0001\u0006\u0019U\u0016f5S=v\\[H;\b}bW\u00100yC\f>vCS:}Ymm{vt\u000bx8:\u0011\u00021|>4=NX\bh\u000f0\u0014!06od)\n\u0005[2ZD<62sZo\u0006\u001e#\u0018F\u000e8G8HsI\u0001&T'\u0006\u0007N\u000b`S\f9*/(?9$xC]\u001dmtV_i8\u0001aJ!\u001b\u0019x/x+-R\u0003Q'8Z\u0011\u000bsoSK\u001262pW~2ƙ\u0012ֽ\u0017ӽeF&JQQ?n?6l;md|\f=&7b\\#A~)~DڳHۇaā[ζsb5ً\u001f\bEF2\u0001EF_܍Jű:ˬ'ұ\n55֑\u001ay\"+\u0014W\u0002=4MÙ$+\u001cv'ae\u00147 k\"R\u0016 \u001e\u0019կGސ'܂\u0010̛Nzz˖>\n<X\u00103R)lc\u0004wOH]ߜ+ݩ\u0019Űtǰ\u000eit̙~W\u0011\u000et1'\t|9h\u001d7)\u0004s \\^R\u0013Y-f\u0017֪\u0013\u0014Ŵ6\rj,\u0016˰\u0014\u0017o֊S\u000e"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! I]\u000eKL", "", "u(E", "-bP=T*Bb-", "", "-rXGX", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "3kT:X5Ma", "", "5dc\u0012_,FS\"\u000e\t\u001d(\u0006\u00129t{7\u007fJ\n%", ";dc.W(MO", "5dc\u001aX;:R\u0015\u000ev\u001d(\u0006\u00129t{7\u007fJ\n%", "Ahi2", "5dc \\A>", "/k[", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "3kT:X5M", "/mh", "1n]AT0Ga", "1nd;g", "3pd._:", "=sW2e", "4h]183>[\u0019\b\nB5{\tB", "4h]183>[\u0019\b\nB5{\tB$}2\u0003G\u0001\u0015&Ky\u0017", "4ha@g", "4na\u0012T*A", "", "0k^0^", "4na\u0012T*A7\"}zq", "7mS2k", "6`b566=S", "7r4:c;R", "7r=<g\fF^(\u0013", "8nX;G6,b&\u0003\u0004`", "", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "BqP;f-H`!", "<n]2", "BnBAe0GU", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<]/>[k FC", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class LongSet {
    public int _capacity;
    public int _size;
    public long[] elements;
    public long[] metadata;

    public /* synthetic */ LongSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getElements$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
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

    private LongSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = LongSetKt.getEmptyLongArray();
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

    public final void forEachIndex(Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
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
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
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

    public final void forEach(Function1<? super Long, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.elements;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr2[i2];
            long j3 = (-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2));
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
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
        return this._size;
    }

    public static /* synthetic */ String joinToString$default(LongSet longSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((1 & i3) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
        }
        if ((4 & i3) != 0) {
        }
        if ((i3 + 8) - (8 | i3) != 0) {
            i2 = -1;
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
        }
        return longSet.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence4);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0095 A[PHI: r4
  0x0095: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:38:0x004c, B:54:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r22, java.lang.CharSequence r23, java.lang.CharSequence r24, int r25, java.lang.CharSequence r26) {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r0 = "separator"
            r12 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "prefix"
            r2 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "postfix"
            r11 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "truncated"
            r10 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            long[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L9a
            r5 = 0
            r4 = 0
        L35:
            r2 = r7[r5]
            long r0 = ~r2
            r13 = 7
            long r0 = r0 << r13
            long r17 = r0 + r2
            long r0 = r0 | r2
            long r17 = r17 - r0
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r17 + r15
            long r17 = r17 | r15
            long r13 = r13 - r17
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L92
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r14 = 8 - r1
            r13 = 0
        L58:
            if (r13 >= r14) goto L93
            r19 = 255(0xff, double:1.26E-321)
            r17 = -1
            long r15 = r17 - r2
            long r0 = r17 - r19
            long r15 = r15 | r0
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L81
            int r0 = r5 << 3
            int r0 = r0 + r13
            r0 = r8[r0]
            r15 = r25
            if (r4 != r15) goto L82
            r9.append(r10)
        L77:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L81:
            goto L8c
        L82:
            if (r4 == 0) goto L87
            r9.append(r12)
        L87:
            r9.append(r0)
            int r4 = r4 + 1
        L8c:
            r0 = 8
            long r2 = r2 >> r0
            int r13 = r13 + 1
            goto L58
        L92:
            goto L95
        L93:
            if (r14 != r0) goto L9a
        L95:
            if (r5 == r6) goto L9a
            int r5 = r5 + 1
            goto L35
        L9a:
            r9.append(r11)
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x00d7 A[PHI: r4
  0x00d7: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:77:0x008f, B:91:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.LongSet r15, java.lang.CharSequence r16, java.lang.CharSequence r17, java.lang.CharSequence r18, int r19, java.lang.CharSequence r20, kotlin.jvm.functions.Function1 r21, int r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.joinToString$default(androidx.collection.LongSet, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function1, int, java.lang.Object):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5 A[PHI: r4
  0x00a5: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:38:0x004f, B:54:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r24, java.lang.CharSequence r25, java.lang.CharSequence r26, int r27, java.lang.CharSequence r28, kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends java.lang.CharSequence> r29) {
        /*
            r23 = this;
            r1 = r23
            java.lang.String r0 = "separator"
            r13 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "prefix"
            r2 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "postfix"
            r12 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "truncated"
            r11 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "transform"
            r10 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            long[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lac
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
            if (r0 == 0) goto La2
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r14 = 8 - r1
            r1 = 0
        L5b:
            if (r1 >= r14) goto La3
            r21 = 255(0xff, double:1.26E-321)
            r19 = -1
            long r17 = r19 - r2
            long r15 = r19 - r21
            long r17 = r17 | r15
            long r19 = r19 - r17
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r0 >= 0) goto L85
            int r0 = r5 << 3
            int r0 = r0 + r1
            r15 = r8[r0]
            r0 = r27
            if (r4 != r0) goto L86
            r9.append(r11)
        L7b:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L85:
            goto L9a
        L86:
            if (r4 == 0) goto L8b
            r9.append(r13)
        L8b:
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            java.lang.Object r0 = r10.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r4 = r4 + 1
        L9a:
            r0 = 8
            long r2 = r2 >> r0
            int r1 = r1 + 1
            r15 = r23
            goto L5b
        La2:
            goto La5
        La3:
            if (r14 != r0) goto Lac
        La5:
            if (r5 == r6) goto Lac
            int r5 = r5 + 1
            r0 = r23
            goto L3d
        Lac:
            r9.append(r12)
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r10 = r19
            r2 = r18
            r17 = 1
            if (r10 != r2) goto L9
            return r17
        L9:
            boolean r0 = r10 instanceof androidx.collection.LongSet
            r16 = 0
            if (r0 != 0) goto L10
            return r16
        L10:
            androidx.collection.LongSet r10 = (androidx.collection.LongSet) r10
            int r1 = r10._size
            int r0 = r2._size
            if (r1 == r0) goto L19
            return r16
        L19:
            long[] r9 = r2.elements
            long[] r8 = r2.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L61
            r6 = r16
        L24:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 == 0) goto L5c
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r5 = 8 - r0
            r2 = r16
        L3f:
            if (r2 >= r5) goto L5a
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r3
            r12 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L56
            int r0 = r6 << 3
            int r0 = r0 + r2
            r0 = r9[r0]
            boolean r0 = r10.contains(r0)
            if (r0 != 0) goto L56
            return r16
        L56:
            long r3 = r3 >> r11
            int r2 = r2 + 1
            goto L3f
        L5a:
            if (r5 != r11) goto L61
        L5c:
            if (r6 == r7) goto L61
            int r6 = r6 + 1
            goto L24
        L61:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.equals(java.lang.Object):boolean");
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long first() {
        /*
            r16 = this;
            r0 = r16
            long[] r11 = r0.elements
            long[] r12 = r0.metadata
            int r0 = r12.length
            int r10 = r0 + (-2)
            if (r10 < 0) goto L54
            r15 = 0
            r9 = r15
        Ld:
            r5 = r12[r9]
            long r0 = ~r5
            r2 = 7
            long r0 = r0 << r2
            r7 = -1
            long r2 = r7 - r0
            long r0 = r7 - r5
            long r2 = r2 | r0
            long r7 = r7 - r2
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r7 + r3
            long r7 = r7 | r3
            long r1 = r1 - r7
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L4f
            int r0 = r9 - r10
            int r0 = ~r0
            int r0 = r0 >>> 31
            r8 = 8
            int r7 = 8 - r0
            r4 = r15
        L31:
            if (r4 >= r7) goto L4d
            r0 = 255(0xff, double:1.26E-321)
            r13 = -1
            long r2 = r13 - r0
            long r0 = r13 - r5
            long r2 = r2 | r0
            long r13 = r13 - r2
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L49
            int r0 = r9 << 3
            int r0 = r0 + r4
            r0 = r11[r0]
            return r0
        L49:
            long r5 = r5 >> r8
            int r4 = r4 + 1
            goto L31
        L4d:
            if (r7 != r8) goto L54
        L4f:
            if (r9 == r10) goto L54
            int r9 = r9 + 1
            goto Ld
        L54:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "The LongSet is empty"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.first():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long first(kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r21) {
        /*
            r20 = this;
            java.lang.String r0 = "predicate"
            r10 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = r20
            long[] r9 = r0.elements
            long[] r8 = r0.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L74
            r19 = 0
            r6 = r19
        L17:
            r3 = r8[r6]
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
            if (r0 == 0) goto L6f
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r5 = r19
        L41:
            if (r5 >= r11) goto L6d
            r0 = 255(0xff, double:1.26E-321)
            r15 = -1
            long r13 = r15 - r0
            long r0 = r15 - r3
            long r13 = r13 | r0
            long r15 = r15 - r13
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 >= 0) goto L69
            int r0 = r6 << 3
            int r0 = r0 + r5
            r1 = r9[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r10.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L69
            return r1
        L69:
            long r3 = r3 >> r12
            int r5 = r5 + 1
            goto L41
        L6d:
            if (r11 != r12) goto L74
        L6f:
            if (r6 == r7) goto L74
            int r6 = r6 + 1
            goto L17
        L74:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Could not find a match"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.first(kotlin.jvm.functions.Function1):long");
    }

    public final boolean all(Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.elements;
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
                    if ((255 + j2) - (255 | j2) < 128 && !predicate.invoke(Long.valueOf(jArr[(i2 << 3) + i4])).booleanValue()) {
                        return false;
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

    /* JADX WARN: Removed duplicated region for block: B:43:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> r18) {
        /*
            r17 = this;
            java.lang.String r0 = "predicate"
            r9 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r17
            long[] r8 = r0.elements
            long[] r7 = r0.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            r16 = 0
            if (r6 < 0) goto L6c
            r5 = r16
        L17:
            r2 = r7[r5]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r14 = r0 + r2
            long r0 = r0 | r2
            long r14 = r14 - r0
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r14 + r12
            long r14 = r14 | r12
            long r10 = r10 - r14
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L67
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r10 = 8 - r0
            r4 = r16
        L38:
            if (r4 >= r10) goto L65
            r0 = 255(0xff, double:1.26E-321)
            r14 = -1
            long r12 = r14 - r0
            long r0 = r14 - r2
            long r12 = r12 | r0
            long r14 = r14 - r12
            r12 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L61
            int r0 = r5 << 3
            int r0 = r0 + r4
            r0 = r8[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r9.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L61
            r0 = 1
            return r0
        L61:
            long r2 = r2 >> r11
            int r4 = r4 + 1
            goto L38
        L65:
            if (r10 != r11) goto L6c
        L67:
            if (r5 == r6) goto L6c
            int r5 = r5 + 1
            goto L17
        L6c:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.any(kotlin.jvm.functions.Function1):boolean");
    }

    public final int count(Function1<? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.elements;
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
                        if ((255 + j2) - (255 | j2) < 128 && predicate.invoke(Long.valueOf(jArr[(i3 << 3) + i6])).booleanValue()) {
                            i4++;
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

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        if (((-1) - (((-1) - ((-1) - (((-1) - r4) | ((-1) - ((~r4) << 6))))) | ((-1) - (-9187201950435737472L)))) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        r3 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(long r22) {
        /*
            r21 = this;
            r8 = r21
            int r2 = java.lang.Long.hashCode(r22)
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
            int r20 = r0 + r6
            r0 = r0 | r6
            int r20 = r20 - r0
            r19 = 0
            r18 = r19
        L23:
            long[] r3 = r8.metadata
            int r2 = r20 >> 3
            r0 = 7
            r0 = r20 & r0
            int r1 = r0 << 3
            r11 = r3[r2]
            long r11 = r11 >>> r1
            r17 = 1
            int r2 = r2 + r17
            r9 = r3[r2]
            int r0 = 64 - r1
            long r9 = r9 << r0
            long r3 = (long) r1
            long r1 = -r3
            r0 = 63
            long r1 = r1 >> r0
            long r9 = r9 & r1
            r4 = -1
            long r2 = r4 - r9
            long r0 = r4 - r11
            long r2 = r2 & r0
            long r4 = r4 - r2
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r11 = r2 - r0
            long r0 = ~r2
            r9 = -1
            long r2 = r9 - r0
            long r0 = r9 - r11
            long r2 = r2 | r0
            long r9 = r9 - r2
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r15
        L5f:
            r13 = 0
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 == 0) goto L85
            int r0 = java.lang.Long.numberOfTrailingZeros(r9)
            int r3 = r0 >> 3
            int r3 = r3 + r20
            r3 = r3 & r6
            long[] r0 = r8.elements
            r1 = r0[r3]
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 != 0) goto L7b
        L76:
            if (r3 < 0) goto L7a
            r19 = r17
        L7a:
            return r19
        L7b:
            r0 = 1
            long r2 = r9 - r0
            long r0 = r9 + r2
            long r9 = r9 | r2
            long r0 = r0 - r9
            r9 = r0
            goto L5f
        L85:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            r11 = -1
            long r9 = r11 - r4
            long r2 = r11 - r0
            long r9 = r9 | r2
            long r11 = r11 - r9
            r4 = -1
            long r2 = r4 - r11
            long r0 = r4 - r15
            long r2 = r2 | r0
            long r4 = r4 - r2
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 == 0) goto L9e
            r3 = -1
            goto L76
        L9e:
            int r18 = r18 + 8
            int r20 = r20 + r18
            r20 = r20 & r6
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.contains(long):boolean");
    }

    public int hashCode() {
        long[] jArr = this.elements;
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
                        if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                            iHashCode += Long.hashCode(jArr[(i3 << 3) + i5]);
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

    public final int findElementIndex$collection(long j2) {
        int iHashCode = Long.hashCode(j2) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = (-1) - (((-1) - i2) | ((-1) - 127));
        int i4 = this._capacity;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j3 = (-1) - (((-1) - ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63))) & ((-1) - (jArr[i7] >>> i8)));
            long j4 = (((long) i3) * ScatterMapKt.BitmaskLsb) ^ j3;
            for (long j5 = ((-1) - (((-1) - (~j4)) | ((-1) - (j4 - ScatterMapKt.BitmaskLsb)))) & (-9187201950435737472L); j5 != 0; j5 = (-1) - (((-1) - j5) | ((-1) - (j5 - 1)))) {
                int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(j5) >> 3) + i5;
                int i9 = (iNumberOfTrailingZeros + i4) - (iNumberOfTrailingZeros | i4);
                if (this.elements[i9] == j2) {
                    return i9;
                }
            }
            if ((-1) - (((-1) - ((-1) - (((-1) - j3) | ((-1) - ((~j3) << 6))))) | ((-1) - (-9187201950435737472L))) != 0) {
                return -1;
            }
            i6 += 8;
            int i10 = i5 + i6;
            i5 = (i10 + i4) - (i10 | i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5 A[PHI: r4
  0x00a5: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:38:0x0053, B:54:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r23, java.lang.CharSequence r24, java.lang.CharSequence r25, int r26, kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends java.lang.CharSequence> r27) {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r0 = "separator"
            r13 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "prefix"
            r2 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "postfix"
            r12 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "transform"
            r11 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r10 = "..."
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            long[] r8 = r1.elements
            long[] r7 = r1.metadata
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
            long r20 = r0 + r2
            long r0 = r0 | r2
            long r20 = r20 - r0
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
            int r1 = r0 >>> 31
            r0 = 8
            int r14 = 8 - r1
            r1 = 0
        L5f:
            if (r1 >= r14) goto La3
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L85
            int r0 = r5 << 3
            int r0 = r0 + r1
            r15 = r8[r0]
            r0 = r26
            if (r4 != r0) goto L86
            r9.append(r10)
        L7b:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L85:
            goto L9a
        L86:
            if (r4 == 0) goto L8b
            r9.append(r13)
        L8b:
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            java.lang.Object r0 = r11.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r4 = r4 + 1
        L9a:
            r0 = 8
            long r2 = r2 >> r0
            int r1 = r1 + 1
            r15 = r22
            goto L5f
        La2:
            goto La5
        La3:
            if (r14 != r0) goto Lac
        La5:
            if (r5 == r6) goto Lac
            int r5 = r5 + 1
            r0 = r22
            goto L39
        Lac:
            r9.append(r12)
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x009d A[PHI: r4
  0x009d: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:36:0x004c, B:50:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, java.lang.CharSequence r27, kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends java.lang.CharSequence> r28) {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r0 = "separator"
            r13 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "prefix"
            r2 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "postfix"
            r12 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "transform"
            r11 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r10 = "..."
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            long[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La2
            r5 = 0
            r4 = 0
        L39:
            r2 = r7[r5]
            long r0 = ~r2
            r14 = 7
            long r0 = r0 << r14
            long r16 = r0 + r2
            long r0 = r0 | r2
            long r16 = r16 - r0
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r16 = r16 & r14
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 == 0) goto L9d
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L58:
            if (r1 >= r14) goto L9b
            r22 = 255(0xff, double:1.26E-321)
            r20 = -1
            long r18 = r20 - r2
            long r16 = r20 - r22
            long r18 = r18 | r16
            long r20 = r20 - r18
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 >= 0) goto L97
            int r0 = r5 << 3
            int r0 = r0 + r1
            r15 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L81
            r9.append(r10)
        L77:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L81:
            if (r4 == 0) goto L86
            r9.append(r13)
        L86:
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            java.lang.Object r0 = r11.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L97:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            goto L58
        L9b:
            if (r14 != r15) goto La2
        L9d:
            if (r5 == r6) goto La2
            int r5 = r5 + 1
            goto L39
        La2:
            r9.append(r12)
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0090 A[PHI: r4
  0x0090: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:36:0x0043, B:50:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r23, java.lang.CharSequence r24, kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends java.lang.CharSequence> r25) {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r0 = "separator"
            r13 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "prefix"
            r2 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "transform"
            r12 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r11 = ""
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.String r10 = "..."
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            long[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L95
            r5 = 0
            r4 = 0
        L35:
            r2 = r7[r5]
            long r0 = ~r2
            r14 = 7
            long r0 = r0 << r14
            long r0 = r0 & r2
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r15
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 == 0) goto L90
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L4f:
            if (r1 >= r14) goto L8e
            r20 = 255(0xff, double:1.26E-321)
            long r18 = r2 + r20
            long r16 = r2 | r20
            long r18 = r18 - r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L8a
            int r0 = r5 << 3
            int r0 = r0 + r1
            r15 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L74
            r9.append(r10)
        L6a:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L74:
            if (r4 == 0) goto L79
            r9.append(r13)
        L79:
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            java.lang.Object r0 = r12.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L8a:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            goto L4f
        L8e:
            if (r14 != r15) goto L95
        L90:
            if (r5 == r6) goto L95
            int r5 = r5 + 1
            goto L35
        L95:
            r9.append(r11)
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.joinToString(java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x009f A[PHI: r4
  0x009f: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:36:0x004e, B:50:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends java.lang.CharSequence> r26) {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r0 = "separator"
            r13 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "transform"
            r12 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r11 = ""
            r0 = r11
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.String r10 = "..."
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            long[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La4
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
            if (r0 == 0) goto L9f
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L5a:
            if (r1 >= r14) goto L9d
            r22 = 255(0xff, double:1.26E-321)
            r20 = -1
            long r18 = r20 - r2
            long r16 = r20 - r22
            long r18 = r18 | r16
            long r20 = r20 - r18
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 >= 0) goto L99
            int r0 = r5 << 3
            int r0 = r0 + r1
            r15 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L83
            r9.append(r10)
        L79:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L83:
            if (r4 == 0) goto L88
            r9.append(r13)
        L88:
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            java.lang.Object r0 = r12.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L99:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            goto L5a
        L9d:
            if (r14 != r15) goto La4
        L9f:
            if (r5 == r6) goto La4
            int r5 = r5 + 1
            goto L30
        La4:
            r9.append(r11)
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.joinToString(java.lang.CharSequence, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x008c A[PHI: r4
  0x008c: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:36:0x003f, B:50:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends java.lang.CharSequence> r23) {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r0 = "transform"
            r13 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r12 = ", "
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            java.lang.String r11 = ""
            r0 = r11
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.String r10 = "..."
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            long[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L91
            r5 = 0
            r4 = 0
        L2c:
            r2 = r7[r5]
            long r0 = ~r2
            r14 = 7
            long r0 = r0 << r14
            long r16 = r0 + r2
            long r0 = r0 | r2
            long r16 = r16 - r0
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r16 = r16 & r14
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 == 0) goto L8c
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L4b:
            if (r1 >= r14) goto L8a
            r20 = 255(0xff, double:1.26E-321)
            long r18 = r2 + r20
            long r16 = r2 | r20
            long r18 = r18 - r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L86
            int r0 = r5 << 3
            int r0 = r0 + r1
            r15 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L70
            r9.append(r10)
        L66:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L70:
            if (r4 == 0) goto L75
            r9.append(r12)
        L75:
            java.lang.Long r0 = java.lang.Long.valueOf(r15)
            java.lang.Object r0 = r13.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L86:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            goto L4b
        L8a:
            if (r14 != r15) goto L91
        L8c:
            if (r5 == r6) goto L91
            int r5 = r5 + 1
            goto L2c
        L91:
            r9.append(r11)
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongSet.joinToString(kotlin.jvm.functions.Function1):java.lang.String");
    }
}
