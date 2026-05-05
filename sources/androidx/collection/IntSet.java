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
/* JADX INFO: compiled from: IntSet.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005%4\u0012\u0006\u001anj?0LeVBZS0\u0011s{B-cҕyCQU\"}8\tWNmpvJh\u000bK\u000f\f\u001b\u0001j:U]ތe\u0012\u001d=JoE8UoS9hҚ<96݅R8(\u0004A\u001f0JǘzzQKTJ>O\t:\u0001\u001d}$(#\u001eY0\u0012.k\u0016PɇLvcM?)\t}RP-eV\u0012]\u000fVTU\u001d%sdѯF̳4ՖǯS\t\u000fVa>\u0013?\u007f<Ml5=CI\"g~\u0011\u000e*-+}\u001d\u000e\u00124m\u001dlp\u001d7:}eׂT\u0018.\u000b\u000b\u0002\u0013P\u0014\u0010\f-nC=\u001cv\b<C#\u0005\u001aúVڕ]ۍȘzg>\u001b+~C+G\u001a/`oR1Ne\f5\u0011,8\u0019nO]\u001bל`]!b\u0010i1\u007fB\u0004M\u0017BgU\u0006\u0004\u001fd2I\u0012A_\u001b?\r!=E'ھ_C)4{\bNXwx\u000bf\u000fhyTX@P~DIp¦\u0012˧CߟʐkV\\\\2\u0010]\u001cb\u0006F\u0019!9twj1U\u0016\\i\u0001k\u0001L\f\tkÛf\u007fm|\u0007&Wg`c9_x(a\u0001xZ̴BИ\tXl^\u001c\u0013hy@\"`J1ݟ}D|\\)+2msLS:B1w%Y\u0013-pCҴ\ri`{ \u0005ZG4\u0005o*\u001b\u001e\u0011Rlp\u001ew'[rʐfŮ,ۋٞ5\u001f.Y(gD|1\u0006G,\u000ee\u007fLuk\u001d5\u0004u\u0014;&+I`]?т\u0013\t/E\u00123K`\u0003gWS8<\u000b~\n\u000fi\b\\yNυvߓ_ʄ\u07bdOZ\u001f&|]\u0003#\u0016cH2og\u0013G\u0012s;zLi\u000b\u001eiM^G+\u0007ȷ\"/\u0007\u00032\u0003;AS)#\u001c\u001e6?\u0017q]\u0018\u000f\\\f)ω,ݢdֽϽc\u001cwfW\\B;FH\"\u0005LE<l1D\u000f~@\fP-L\raX\nh~{PM9?F\u001f\u0015R%p\u0005\u0003j\u0019u}BVw*\"l.\u001adC3;eS\u0016\u0017\u001eQb\u000bX:\"\u000b*Z\u001f\u0018\"=.\u0003ob726y\u001e6Ohz\u0005j2j9t\u000f\u00161[T\u0018-@\u0001\u0006Fm7/2p\u001dk\\\u0014T\u0007\u0007nH3\nuf'*\u000f*'3L\"e7\u000bmT\u0001Gc`\u0003\u0004#\u000f\u001bx|\u0017fSTtf?\u001d6\u0007\u0019\u0017U_SI08\u0014I9m\u001a\u0019:J^ԅ#Ħ\u0017Ç\u0002U\u001f\u000f\u000f0\r\u001b\u001ej\\\u0015\u000f\u0012\u0015y\u00156y\u000f\t}&<8\u0011Aÿ\u000eΓF۰9ٮRw?Ƒj\u0011%GA\u0007:~\u001a˪YҎ\\ט9ִMj\u001c՝Lfa?\u0016\bN\"]Iȯ%`o\u0010l\u000fk!\u000b,\u007f\u001dz\u00027\u001b\u0007܀B˸!ƕ~˹2\u000e>О\u00125\b\u001clY<\u000e/J?+\u001b\u0011xŮ'Ǎ`ɪx̼r[\u0013ӆv3\\\u0006|-!,\u00174e.AZ\u0011\u007fñW$p\u0013\u0006\"#,̂5\u0007\u0014ϭ\u0010Tkkvջ\u007f\n\fĴ3\u001e"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &5o\u001d\u0012", "", "u(E", "-bP=T*Bb-", "", "-rXGX", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "3kT:X5Ma", "", "5dc\u0012_,FS\"\u000e\t\u001d(\u0006\u00129t{7\u007fJ\n%", ";dc.W(MO", "", "5dc\u001aX;:R\u0015\u000ev\u001d(\u0006\u00129t{7\u007fJ\n%", "Ahi2", "5dc \\A>", "/k[", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "3kT:X5M", "/mh", "1n]AT0Ga", "1nd;g", "3pd._:", "=sW2e", "4h]183>[\u0019\b\nB5{\tB", "4h]183>[\u0019\b\nB5{\tB$}2\u0003G\u0001\u0015&Ky\u0017", "4ha@g", "4na\u0012T*A", "", "0k^0^", "4na\u0012T*A7\"}zq", "7mS2k", "6`b566=S", "7r4:c;R", "7r=<g\fF^(\u0013", "8nX;G6,b&\u0003\u0004`", "", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "BqP;f-H`!", "<n]2", "BnBAe0GU", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.DG}/\r", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class IntSet {
    public int _capacity;
    public int _size;
    public int[] elements;
    public long[] metadata;

    public /* synthetic */ IntSet(DefaultConstructorMarker defaultConstructorMarker) {
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

    private IntSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = IntSetKt.getEmptyIntArray();
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
            long j3 = (~j2) << 7;
            if ((((j3 + j2) - (j3 | j2)) & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 + j2) - (255 | j2) < 128) {
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

    public final void forEach(Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.elements;
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
                        block.invoke(Integer.valueOf(iArr[(i2 << 3) + i4]));
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

    public static /* synthetic */ String joinToString$default(IntSet intSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i3 + 1) - (1 | i3) != 0) {
        }
        if ((2 & i3) != 0) {
        }
        if ((4 & i3) != 0) {
        }
        if ((i3 + 8) - (8 | i3) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
        }
        return intSet.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence4);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0098 A[PHI: r4
  0x0098: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:38:0x0052, B:54:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
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
            int[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L9d
            r5 = 0
            r4 = 0
        L35:
            r2 = r7[r5]
            long r0 = ~r2
            r13 = 7
            long r0 = r0 << r13
            r19 = -1
            long r13 = r19 - r0
            long r0 = r19 - r2
            long r13 = r13 | r0
            long r19 = r19 - r13
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r15 = -1
            long r13 = r15 - r19
            long r0 = r15 - r17
            long r13 = r13 | r0
            long r15 = r15 - r13
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 == 0) goto L95
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r13 = 8 - r1
            r1 = 0
        L5e:
            if (r1 >= r13) goto L96
            r18 = 255(0xff, double:1.26E-321)
            long r16 = r2 + r18
            long r14 = r2 | r18
            long r16 = r16 - r14
            r14 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L84
            int r0 = r5 << 3
            int r0 = r0 + r1
            r0 = r8[r0]
            r14 = r25
            if (r4 != r14) goto L85
            r9.append(r10)
        L7a:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L84:
            goto L8f
        L85:
            if (r4 == 0) goto L8a
            r9.append(r12)
        L8a:
            r9.append(r0)
            int r4 = r4 + 1
        L8f:
            r0 = 8
            long r2 = r2 >> r0
            int r1 = r1 + 1
            goto L5e
        L95:
            goto L98
        L96:
            if (r13 != r0) goto L9d
        L98:
            if (r5 == r6) goto L9d
            int r5 = r5 + 1
            goto L35
        L9d:
            r9.append(r11)
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x00dc A[PHI: r4
  0x00dc: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:77:0x008c, B:91:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.IntSet r15, java.lang.CharSequence r16, java.lang.CharSequence r17, java.lang.CharSequence r18, int r19, java.lang.CharSequence r20, kotlin.jvm.functions.Function1 r21, int r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.joinToString$default(androidx.collection.IntSet, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function1, int, java.lang.Object):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1 A[PHI: r4
  0x00a1: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:38:0x004b, B:54:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r24, java.lang.CharSequence r25, java.lang.CharSequence r26, int r27, java.lang.CharSequence r28, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> r29) {
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
            int[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La8
            r5 = 0
            r4 = 0
        L3d:
            r2 = r7[r5]
            long r0 = ~r2
            r14 = 7
            long r0 = r0 << r14
            long r0 = r0 & r2
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r15
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 == 0) goto L9e
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r14 = 8 - r1
            r1 = 0
        L57:
            if (r1 >= r14) goto L9f
            r21 = 255(0xff, double:1.26E-321)
            r19 = -1
            long r17 = r19 - r2
            long r15 = r19 - r21
            long r17 = r17 | r15
            long r19 = r19 - r17
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r0 >= 0) goto L81
            int r0 = r5 << 3
            int r0 = r0 + r1
            r0 = r8[r0]
            r15 = r27
            if (r4 != r15) goto L82
            r9.append(r11)
        L77:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L81:
            goto L96
        L82:
            if (r4 == 0) goto L87
            r9.append(r13)
        L87:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r10.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r4 = r4 + 1
        L96:
            r0 = 8
            long r2 = r2 >> r0
            int r1 = r1 + 1
            r15 = r23
            goto L57
        L9e:
            goto La1
        L9f:
            if (r14 != r0) goto La8
        La1:
            if (r5 == r6) goto La8
            int r5 = r5 + 1
            r0 = r23
            goto L3d
        La8:
            r9.append(r12)
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r10 = r18
            r2 = r17
            r16 = 1
            if (r10 != r2) goto L9
            return r16
        L9:
            boolean r0 = r10 instanceof androidx.collection.IntSet
            r15 = 0
            if (r0 != 0) goto Lf
            return r15
        Lf:
            androidx.collection.IntSet r10 = (androidx.collection.IntSet) r10
            int r1 = r10._size
            int r0 = r2._size
            if (r1 == r0) goto L18
            return r15
        L18:
            int[] r9 = r2.elements
            long[] r8 = r2.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L61
            r6 = r15
        L22:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r11 = r0 + r3
            long r0 = r0 | r3
            long r11 = r11 - r0
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r1
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 == 0) goto L5c
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r5 = r15
        L3f:
            if (r5 >= r11) goto L5a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r3
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L56
            int r0 = r6 << 3
            int r0 = r0 + r5
            r0 = r9[r0]
            boolean r0 = r10.contains(r0)
            if (r0 != 0) goto L56
            return r15
        L56:
            long r3 = r3 >> r12
            int r5 = r5 + 1
            goto L3f
        L5a:
            if (r11 != r12) goto L61
        L5c:
            if (r6 == r7) goto L61
            int r6 = r6 + 1
            goto L22
        L61:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.equals(java.lang.Object):boolean");
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int first() {
        /*
            r16 = this;
            r0 = r16
            int[] r11 = r0.elements
            long[] r12 = r0.metadata
            int r0 = r12.length
            int r10 = r0 + (-2)
            if (r10 < 0) goto L4d
            r15 = 0
            r9 = r15
        Ld:
            r5 = r12[r9]
            long r0 = ~r5
            r2 = 7
            long r0 = r0 << r2
            long r3 = r0 + r5
            long r0 = r0 | r5
            long r3 = r3 - r0
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L48
            int r0 = r9 - r10
            int r0 = ~r0
            int r0 = r0 >>> 31
            r8 = 8
            int r7 = 8 - r0
            r4 = r15
        L2a:
            if (r4 >= r7) goto L46
            r0 = 255(0xff, double:1.26E-321)
            r13 = -1
            long r2 = r13 - r0
            long r0 = r13 - r5
            long r2 = r2 | r0
            long r13 = r13 - r2
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L42
            int r0 = r9 << 3
            int r0 = r0 + r4
            r0 = r11[r0]
            return r0
        L42:
            long r5 = r5 >> r8
            int r4 = r4 + 1
            goto L2a
        L46:
            if (r7 != r8) goto L4d
        L48:
            if (r9 == r10) goto L4d
            int r9 = r9 + 1
            goto Ld
        L4d:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "The IntSet is empty"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.first():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int first(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> r18) {
        /*
            r17 = this;
            java.lang.String r0 = "predicate"
            r9 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r17
            int[] r8 = r0.elements
            long[] r7 = r0.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L64
            r16 = 0
            r5 = r16
        L17:
            r2 = r7[r5]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r0 + r12
            long r0 = r0 | r12
            long r10 = r10 - r0
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L5f
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r10 = 8 - r0
            r4 = r16
        L35:
            if (r4 >= r10) goto L5d
            r0 = 255(0xff, double:1.26E-321)
            long r14 = r0 + r2
            long r0 = r0 | r2
            long r14 = r14 - r0
            r12 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L59
            int r0 = r5 << 3
            int r0 = r0 + r4
            r1 = r8[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r9.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L59
            return r1
        L59:
            long r2 = r2 >> r11
            int r4 = r4 + 1
            goto L35
        L5d:
            if (r10 != r11) goto L64
        L5f:
            if (r5 == r6) goto L64
            int r5 = r5 + 1
            goto L17
        L64:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Could not find a match"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.first(kotlin.jvm.functions.Function1):int");
    }

    public final boolean all(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            long j3 = (-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2));
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128 && !predicate.invoke(Integer.valueOf(iArr[(i2 << 3) + i4])).booleanValue()) {
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

    /* JADX WARN: Removed duplicated region for block: B:43:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> r20) {
        /*
            r19 = this;
            java.lang.String r0 = "predicate"
            r9 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r19
            int[] r8 = r0.elements
            long[] r7 = r0.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            r18 = 0
            if (r6 < 0) goto L71
            r5 = r18
        L17:
            r1 = r7[r5]
            long r3 = ~r1
            r0 = 7
            long r3 = r3 << r0
            r16 = -1
            long r10 = r16 - r3
            long r3 = r16 - r1
            long r10 = r10 | r3
            long r16 = r16 - r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = -1
            long r10 = r12 - r16
            long r3 = r12 - r14
            long r10 = r10 | r3
            long r12 = r12 - r10
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L6c
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r10 = 8
            int r4 = 8 - r0
            r3 = r18
        L41:
            if (r3 >= r4) goto L6a
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r11 + r1
            long r11 = r11 | r1
            long r13 = r13 - r11
            r11 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L66
            int r0 = r5 << 3
            int r0 = r0 + r3
            r0 = r8[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r9.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L66
            r0 = 1
            return r0
        L66:
            long r1 = r1 >> r10
            int r3 = r3 + 1
            goto L41
        L6a:
            if (r4 != r10) goto L71
        L6c:
            if (r5 == r6) goto L71
            int r5 = r5 + 1
            goto L17
        L71:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.any(kotlin.jvm.functions.Function1):boolean");
    }

    public final int count(Function1<? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 + j2) - (255 | j2) < 128 && predicate.invoke(Integer.valueOf(iArr[(i3 << 3) + i6])).booleanValue()) {
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

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        if (((-1) - (((-1) - ((-1) - (((-1) - r4) | ((-1) - ((~r4) << 6))))) | ((-1) - (-9187201950435737472L)))) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(int r23) {
        /*
            r22 = this;
            r8 = r22
            r9 = r23
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
            int r21 = (-1) - r1
            r20 = 0
            r19 = r20
        L24:
            long[] r3 = r8.metadata
            int r2 = r21 >> 3
            r0 = 7
            int r1 = (-1) - r21
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            int r1 = r0 << 3
            r12 = r3[r2]
            long r12 = r12 >>> r1
            r18 = 1
            int r2 = r2 + r18
            r10 = r3[r2]
            int r0 = 64 - r1
            long r10 = r10 << r0
            long r3 = (long) r1
            long r1 = -r3
            r0 = 63
            long r1 = r1 >> r0
            long r10 = r10 & r1
            r4 = -1
            long r2 = r4 - r10
            long r0 = r4 - r12
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
            r10 = -1
            long r2 = r10 - r0
            long r0 = r10 - r16
            long r2 = r2 | r0
            long r10 = r10 - r2
        L65:
            r14 = 0
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 == 0) goto L8b
            int r0 = java.lang.Long.numberOfTrailingZeros(r10)
            int r0 = r0 >> 3
            int r0 = r0 + r21
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r1 = (-1) - r1
            int[] r0 = r8.elements
            r0 = r0[r1]
            if (r0 != r9) goto L85
        L80:
            if (r1 < 0) goto L84
            r20 = r18
        L84:
            return r20
        L85:
            r2 = 1
            long r0 = r10 - r2
            long r10 = r10 & r0
            goto L65
        L8b:
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
            if (r0 == 0) goto La4
            r1 = -1
            goto L80
        La4:
            int r19 = r19 + 8
            int r21 = r21 + r19
            int r0 = r21 + r6
            r21 = r21 | r6
            int r0 = r0 - r21
            r21 = r0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.contains(int):boolean");
    }

    public int hashCode() {
        int[] iArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int iHashCode = 0;
            while (true) {
                long j2 = jArr[i3];
                long j3 = (~j2) << 7;
                long j4 = (j3 + j2) - (j3 | j2);
                if ((j4 - 9187201950435737472L) - (j4 | (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 + j2) - (255 | j2) < 128) {
                            iHashCode += Integer.hashCode(iArr[(i3 << 3) + i5]);
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

    public final int findElementIndex$collection(int i2) {
        int iHashCode = Integer.hashCode(i2) * ScatterMapKt.MurmurHashC1;
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 & 127;
        int i5 = this._capacity;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = ((-1) - (((-1) - i6) | ((-1) - 7))) << 3;
            long j2 = (-1) - (((-1) - ((-1) - (((-1) - (jArr[i8 + 1] << (64 - i9))) | ((-1) - ((-i9) >> 63))))) & ((-1) - (jArr[i8] >>> i9)));
            long j3 = (((long) i4) * ScatterMapKt.BitmaskLsb) ^ j2;
            long j4 = (~j3) & (j3 - ScatterMapKt.BitmaskLsb);
            long j5 = (j4 - 9187201950435737472L) - (j4 | (-9187201950435737472L));
            while (j5 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i6) & i5;
                if (this.elements[iNumberOfTrailingZeros] == i2) {
                    return iNumberOfTrailingZeros;
                }
                long j6 = j5 - 1;
                j5 = (j5 + j6) - (j5 | j6);
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i7 += 8;
            i6 = (-1) - (((-1) - (i6 + i7)) | ((-1) - i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0099 A[PHI: r4
  0x0099: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:38:0x0047, B:54:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r22, java.lang.CharSequence r23, java.lang.CharSequence r24, int r25, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> r26) {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r0 = "separator"
            r13 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "prefix"
            r2 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "postfix"
            r12 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "transform"
            r11 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r10 = "..."
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            int[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La0
            r5 = 0
            r4 = 0
        L39:
            r2 = r7[r5]
            long r0 = ~r2
            r14 = 7
            long r0 = r0 << r14
            long r0 = r0 & r2
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r15
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 == 0) goto L96
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r14 = 8 - r1
            r1 = 0
        L53:
            if (r1 >= r14) goto L97
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L79
            int r0 = r5 << 3
            int r0 = r0 + r1
            r0 = r8[r0]
            r15 = r25
            if (r4 != r15) goto L7a
            r9.append(r10)
        L6f:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L79:
            goto L8e
        L7a:
            if (r4 == 0) goto L7f
            r9.append(r13)
        L7f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r11.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r4 = r4 + 1
        L8e:
            r0 = 8
            long r2 = r2 >> r0
            int r1 = r1 + 1
            r15 = r21
            goto L53
        L96:
            goto L99
        L97:
            if (r14 != r0) goto La0
        L99:
            if (r5 == r6) goto La0
            int r5 = r5 + 1
            r0 = r21
            goto L39
        La0:
            r9.append(r12)
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0095 A[PHI: r4
  0x0095: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:36:0x004c, B:50:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r21, java.lang.CharSequence r22, java.lang.CharSequence r23, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> r24) {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r0 = "separator"
            r13 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "prefix"
            r2 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "postfix"
            r12 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "transform"
            r11 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r10 = "..."
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            int[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L9a
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
            if (r0 == 0) goto L95
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L58:
            if (r1 >= r14) goto L93
            r16 = 255(0xff, double:1.26E-321)
            long r18 = r2 & r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L8f
            int r0 = r5 << 3
            int r0 = r0 + r1
            r15 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L79
            r9.append(r10)
        L6f:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L79:
            if (r4 == 0) goto L7e
            r9.append(r13)
        L7e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            java.lang.Object r0 = r11.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L8f:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            goto L58
        L93:
            if (r14 != r15) goto L9a
        L95:
            if (r5 == r6) goto L9a
            int r5 = r5 + 1
            goto L39
        L9a:
            r9.append(r12)
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x009d A[PHI: r4
  0x009d: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:36:0x004c, B:50:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> r27) {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r0 = "separator"
            r13 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "prefix"
            r2 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "transform"
            r12 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r11 = ""
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.String r10 = "..."
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            int[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La2
            r5 = 0
            r4 = 0
        L35:
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
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            java.lang.Object r0 = r12.invoke(r0)
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
            goto L35
        La2:
            r9.append(r11)
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.joinToString(java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x008f A[PHI: r4
  0x008f: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:36:0x0042, B:50:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r23, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> r24) {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r0 = "separator"
            r13 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "transform"
            r12 = r24
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
            int[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L94
            r5 = 0
            r4 = 0
        L30:
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
            if (r0 == 0) goto L8f
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L4e:
            if (r1 >= r14) goto L8d
            r20 = 255(0xff, double:1.26E-321)
            long r18 = r2 + r20
            long r16 = r2 | r20
            long r18 = r18 - r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L89
            int r0 = r5 << 3
            int r0 = r0 + r1
            r15 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L73
            r9.append(r10)
        L69:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L73:
            if (r4 == 0) goto L78
            r9.append(r13)
        L78:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            java.lang.Object r0 = r12.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L89:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            goto L4e
        L8d:
            if (r14 != r15) goto L94
        L8f:
            if (r5 == r6) goto L94
            int r5 = r5 + 1
            goto L30
        L94:
            r9.append(r11)
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.joinToString(java.lang.CharSequence, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0094 A[PHI: r4
  0x0094: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:36:0x0043, B:50:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> r25) {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r0 = "transform"
            r13 = r25
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
            int[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L99
            r5 = 0
            r4 = 0
        L2c:
            r2 = r7[r5]
            long r0 = ~r2
            r14 = 7
            long r0 = r0 << r14
            r16 = -1
            long r14 = r16 - r0
            long r0 = r16 - r2
            long r14 = r14 | r0
            long r16 = r16 - r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r16 = r16 & r14
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 == 0) goto L94
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L4f:
            if (r1 >= r14) goto L92
            r22 = 255(0xff, double:1.26E-321)
            r20 = -1
            long r18 = r20 - r2
            long r16 = r20 - r22
            long r18 = r18 | r16
            long r20 = r20 - r18
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 >= 0) goto L8e
            int r0 = r5 << 3
            int r0 = r0 + r1
            r15 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L78
            r9.append(r10)
        L6e:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L78:
            if (r4 == 0) goto L7d
            r9.append(r12)
        L7d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            java.lang.Object r0 = r13.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L8e:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            goto L4f
        L92:
            if (r14 != r15) goto L99
        L94:
            if (r5 == r6) goto L99
            int r5 = r5 + 1
            goto L2c
        L99:
            r9.append(r11)
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntSet.joinToString(kotlin.jvm.functions.Function1):java.lang.String");
    }
}
