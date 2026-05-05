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
/* JADX INFO: compiled from: FloatSet.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005%4\u0012\u0006\u0019nj?0LeVBZS0\u0011s{B-cҕyCQU\"}0\u000eWN}gvJ`\u0014K\u000f\u0014\u0016\u0001j2N]xk\u001e\u0017˰JoM>UoC>htL\u0005(݅(l\u0010ڎ1\u001aXGP{\u0001Eƚ\u0010\u0012>@9r`\u001ce\u0005H\"6].\u00126ww_FW\u001bpƠ3-\t}RT-t@~S\u0013lj7\u000f\u0007aL;nI{՝+ھ\u0002ޗѻ[E\u000bCw<\u0015h5&sM\u0002nNX.$]c]$urTl5pn\u001d?F_t[_<;Þ~\u0006\u0013P\u0014\u0014\f<X03 \r\u001e\u001e5\u0005r\u0002P~\u0014%۔\u0006Ҧ`اА%\u0006;/?\u001avQo:a]E\u0014\u001d\rL31r/ql\u000e\u000f(aƟw\u001a7_YUH|\f B6<~{\u001a*22w\u001f=\r)I'6Gjg6\u074co\fNXw|\u000buxUoXnV2p&7X\u0019:l\u000bߧ\u000bÐOӹГ,\u0017U Z\u0006\u000e\b!\u001f%\tJ;=\u0010|_\u0019oxhu\f;.\u00156 ʻkVkGzK5\u007fe@e`\r,?juK֛l͞W\f`yp)@f\u0003\u0010&\u000f\u000b\u008f\u0012[jM\u001044ZDI{#Y\u001b9RR\r\u0018\u000emӳ\u0014\tZG4\to9\u0005\u000b\u0007V\u0003\u0007\u007fi\tIZ\r\u000f4sےWۺ\u0018ğš\"n<\u0001)\u0006\u000fs\u000eF0\u0005Uk\u0005\u0016$u,?$;Ql?N#\u001e-<ɨ\u00067K`\u0003kWb\")\u0001\u0003 %Kj>g6\u000b\u001f>'ʋP؛SϟǴvdz'\u000ec\u0010yoEC\u007fqv#[li#\"g]fS\r\u0016/-S\u0003Ȟ&\u0007;AS-#+\b\u00165\u001b\b\u0001yq>y\u0011/T\u0007,ֿ2ќ\u0015˱̨Qc:?>Hi~L!lr\u0011f`j&\n\t\u001d|\u0011AmYd\u001ff\u0001Q\u0019U\u0016f5<U)d\u0003R\u0013\u001e&d4e*\u0002l\u0016\u0014\rmU\u0017SSu\u0019\u0006K\u000b5z\u0015\u0010\u000b\n]\u0007\u0012JgP\\]b\u0017]\u001esF8qAh\u0005J7<4ZfN\u0010\f'w-(z.n\u0010\u0015\u001d2P\u001dSV<~)b\\H\u0013\f]`OT1\u0005\u00153,%M13\u0018vZ5c@.k\u001d7\u001d\u001bU\u0005f3Y\\TgEXj\u0007\rS\r[U\u00128\u0014GW\u0001{q\u001c8F'KT^Ï?ު\u0010٣?4l;md|t?\u0018t\u0004f\"W'A\u0011^L\u0018\u0010#\u0019}t&ۮkً%ߙCƴ\u001e\u0001\u001f\u05edy\u0017\u001a\u007f{FI/<זk֑ ݟ ր\u007fW[ȌN\u0017.$?\u0004##\u0013\u001dˍj\u000eu\u001d@\u001b\u007f\u001c3\u0018\u0017\u001ah 26\u0001Ɠ1˖\u0005üBс\u00069\nՂn[q\u0001/@wAz\u0010ZK\u0017\u0004@ɨ+̙EΫ\u0017өj7^ҳ~/V)\u0017'\u001e=!er:?UV\u001eӜ\u0004\u0018-(%D\u0016hϭ\u000fN\u0016֯ppW^\u0013ĥ_\u001a)Ն5c"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\na\u001e!C~{<\u0006z", "", "u(E", "-bP=T*Bb-", "", "-rXGX", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "3kT:X5Ma", "", "5dc\u0012_,FS\"\u000e\t\u001d(\u0006\u00129t{7\u007fJ\n%", ";dc.W(MO", "", "5dc\u001aX;:R\u0015\u000ev\u001d(\u0006\u00129t{7\u007fJ\n%", "Ahi2", "5dc \\A>", "/k[", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "3kT:X5M", "/mh", "1n]AT0Ga", "1nd;g", "3pd._:", "=sW2e", "4h]183>[\u0019\b\nB5{\tB", "4h]183>[\u0019\b\nB5{\tB$}2\u0003G\u0001\u0015&Ky\u0017", "4ha@g", "4na\u0012T*A", "", "0k^0^", "4na\u0012T*A7\"}zq", "7mS2k", "6`b566=S", "7r4:c;R", "7r=<g\fF^(\u0013", "8nX;G6,b&\u0003\u0004`", "", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "BqP;f-H`!", "<n]2", "BnBAe0GU", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<W,?U\r\u000e7|k", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class FloatSet {
    public int _capacity;
    public int _size;
    public float[] elements;
    public long[] metadata;

    public /* synthetic */ FloatSet(DefaultConstructorMarker defaultConstructorMarker) {
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

    private FloatSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = FloatSetKt.getEmptyFloatArray();
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
            if ((((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2))) & (-9187201950435737472L)) != -9187201950435737472L) {
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

    public final void forEach(Function1<? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.elements;
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
                        block.invoke(Float.valueOf(fArr[(i2 << 3) + i4]));
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

    public static /* synthetic */ String joinToString$default(FloatSet floatSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
        }
        if ((4 & i3) != 0) {
        }
        if ((8 & i3) != 0) {
            i2 = -1;
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
        }
        return floatSet.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence4);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0088 A[PHI: r4
  0x0088: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:38:0x0046, B:54:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r19, java.lang.CharSequence r20, java.lang.CharSequence r21, int r22, java.lang.CharSequence r23) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "separator"
            r12 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "prefix"
            r2 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "postfix"
            r11 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "truncated"
            r10 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            float[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L8d
            r5 = 0
            r4 = 0
        L35:
            r2 = r7[r5]
            long r0 = ~r2
            r13 = 7
            long r0 = r0 << r13
            long r0 = r0 & r2
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r0 + r15
            long r0 = r0 | r15
            long r13 = r13 - r0
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L85
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r13 = 8 - r1
            r1 = 0
        L52:
            if (r1 >= r13) goto L86
            r14 = 255(0xff, double:1.26E-321)
            long r16 = r2 & r14
            r14 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L74
            int r0 = r5 << 3
            int r0 = r0 + r1
            r0 = r8[r0]
            r14 = r22
            if (r4 != r14) goto L75
            r9.append(r10)
        L6a:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L74:
            goto L7f
        L75:
            if (r4 == 0) goto L7a
            r9.append(r12)
        L7a:
            r9.append(r0)
            int r4 = r4 + 1
        L7f:
            r0 = 8
            long r2 = r2 >> r0
            int r1 = r1 + 1
            goto L52
        L85:
            goto L88
        L86:
            if (r13 != r0) goto L8d
        L88:
            if (r5 == r6) goto L8d
            int r5 = r5 + 1
            goto L35
        L8d:
            r9.append(r11)
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatSet.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x00d4 A[PHI: r4
  0x00d4: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:77:0x0088, B:91:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.FloatSet r15, java.lang.CharSequence r16, java.lang.CharSequence r17, java.lang.CharSequence r18, int r19, java.lang.CharSequence r20, kotlin.jvm.functions.Function1 r21, int r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatSet.joinToString$default(androidx.collection.FloatSet, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function1, int, java.lang.Object):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x009d A[PHI: r4
  0x009d: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:38:0x004f, B:54:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r20, java.lang.CharSequence r21, java.lang.CharSequence r22, int r23, java.lang.CharSequence r24, kotlin.jvm.functions.Function1<? super java.lang.Float, ? extends java.lang.CharSequence> r25) {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r0 = "separator"
            r13 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "prefix"
            r2 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "postfix"
            r12 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "truncated"
            r11 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "transform"
            r10 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            float[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La4
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
            if (r0 == 0) goto L9a
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r14 = 8 - r1
            r1 = 0
        L5b:
            if (r1 >= r14) goto L9b
            r15 = 255(0xff, double:1.26E-321)
            long r17 = r2 & r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L7d
            int r0 = r5 << 3
            int r0 = r0 + r1
            r0 = r8[r0]
            r15 = r23
            if (r4 != r15) goto L7e
            r9.append(r11)
        L73:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L7d:
            goto L92
        L7e:
            if (r4 == 0) goto L83
            r9.append(r13)
        L83:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r10.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r4 = r4 + 1
        L92:
            r0 = 8
            long r2 = r2 >> r0
            int r1 = r1 + 1
            r15 = r19
            goto L5b
        L9a:
            goto L9d
        L9b:
            if (r14 != r0) goto La4
        L9d:
            if (r5 == r6) goto La4
            int r5 = r5 + 1
            r0 = r19
            goto L3d
        La4:
            r9.append(r12)
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatSet.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r20) {
        /*
            r19 = this;
            r10 = r20
            r2 = r19
            r18 = 1
            if (r10 != r2) goto L9
            return r18
        L9:
            boolean r0 = r10 instanceof androidx.collection.FloatSet
            r17 = 0
            if (r0 != 0) goto L10
            return r17
        L10:
            androidx.collection.FloatSet r10 = (androidx.collection.FloatSet) r10
            int r1 = r10._size
            int r0 = r2._size
            if (r1 == r0) goto L19
            return r17
        L19:
            float[] r9 = r2.elements
            long[] r8 = r2.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L68
            r6 = r17
        L24:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = -1
            long r11 = r13 - r0
            long r0 = r13 - r15
            long r11 = r11 | r0
            long r13 = r13 - r11
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L63
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r5 = r17
        L46:
            if (r5 >= r11) goto L61
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r3
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5d
            int r0 = r6 << 3
            int r0 = r0 + r5
            r0 = r9[r0]
            boolean r0 = r10.contains(r0)
            if (r0 != 0) goto L5d
            return r17
        L5d:
            long r3 = r3 >> r12
            int r5 = r5 + 1
            goto L46
        L61:
            if (r11 != r12) goto L68
        L63:
            if (r6 == r7) goto L68
            int r6 = r6 + 1
            goto L24
        L68:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatSet.equals(java.lang.Object):boolean");
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, 25, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float first() {
        /*
            r17 = this;
            r0 = r17
            float[] r12 = r0.elements
            long[] r13 = r0.metadata
            int r0 = r13.length
            int r11 = r0 + (-2)
            if (r11 < 0) goto L4d
            r16 = 0
            r10 = r16
        Lf:
            r7 = r13[r10]
            long r0 = ~r7
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r7
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r4 = -1
            long r2 = r4 - r0
            long r0 = r4 - r14
            long r2 = r2 | r0
            long r4 = r4 - r2
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 == 0) goto L48
            int r0 = r10 - r11
            int r0 = ~r0
            int r0 = r0 >>> 31
            r9 = 8
            int r6 = 8 - r0
            r5 = r16
        L31:
            if (r5 >= r6) goto L46
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r7
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L42
            int r0 = r10 << 3
            int r0 = r0 + r5
            r0 = r12[r0]
            return r0
        L42:
            long r7 = r7 >> r9
            int r5 = r5 + 1
            goto L31
        L46:
            if (r6 != r9) goto L4d
        L48:
            if (r10 == r11) goto L4d
            int r10 = r10 + 1
            goto Lf
        L4d:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "The FloatSet is empty"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatSet.first():float");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float first(kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Boolean> r18) {
        /*
            r17 = this;
            java.lang.String r0 = "predicate"
            r9 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r17
            float[] r8 = r0.elements
            long[] r7 = r0.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L68
            r16 = 0
            r5 = r16
        L17:
            r2 = r7[r5]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = -1
            long r10 = r12 - r0
            long r0 = r12 - r14
            long r10 = r10 | r0
            long r12 = r12 - r10
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L63
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r10 = 8 - r0
            r4 = r16
        L39:
            if (r4 >= r10) goto L61
            r0 = 255(0xff, double:1.26E-321)
            long r14 = r0 + r2
            long r0 = r0 | r2
            long r14 = r14 - r0
            r12 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L5d
            int r0 = r5 << 3
            int r0 = r0 + r4
            r1 = r8[r0]
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            java.lang.Object r0 = r9.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5d
            return r1
        L5d:
            long r2 = r2 >> r11
            int r4 = r4 + 1
            goto L39
        L61:
            if (r10 != r11) goto L68
        L63:
            if (r5 == r6) goto L68
            int r5 = r5 + 1
            goto L17
        L68:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Could not find a match"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatSet.first(kotlin.jvm.functions.Function1):float");
    }

    public final boolean all(Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            long j3 = (~j2) << 7;
            if ((((j3 + j2) - (j3 | j2)) & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 + j2) - (255 | j2) < 128 && !predicate.invoke(Float.valueOf(fArr[(i2 << 3) + i4])).booleanValue()) {
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

    /* JADX WARN: Removed duplicated region for block: B:43:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(kotlin.jvm.functions.Function1<? super java.lang.Float, java.lang.Boolean> r17) {
        /*
            r16 = this;
            java.lang.String r0 = "predicate"
            r9 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r16
            float[] r8 = r0.elements
            long[] r7 = r0.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            r15 = 0
            if (r6 < 0) goto L62
            r5 = r15
        L15:
            r1 = r7[r5]
            long r3 = ~r1
            r0 = 7
            long r3 = r3 << r0
            long r12 = r3 + r1
            long r3 = r3 | r1
            long r12 = r12 - r3
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r12 + r10
            long r12 = r12 | r10
            long r3 = r3 - r12
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L5d
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r10 = 8
            int r4 = 8 - r0
            r3 = r15
        L35:
            if (r3 >= r4) goto L5b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r1
            r11 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L57
            int r0 = r5 << 3
            int r0 = r0 + r3
            r0 = r8[r0]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r9.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L57
            r0 = 1
            return r0
        L57:
            long r1 = r1 >> r10
            int r3 = r3 + 1
            goto L35
        L5b:
            if (r4 != r10) goto L62
        L5d:
            if (r5 == r6) goto L62
            int r5 = r5 + 1
            goto L15
        L62:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatSet.any(kotlin.jvm.functions.Function1):boolean");
    }

    public final int count(Function1<? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j2 = jArr[i3];
                long j3 = (~j2) << 7;
                if ((-1) - (((-1) - ((j3 + j2) - (j3 | j2))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 + j2) - (255 | j2) < 128 && predicate.invoke(Float.valueOf(fArr[(i3 << 3) + i6])).booleanValue()) {
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

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        r0 = (~r4) << 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        if ((((r4 + r0) - (r4 | r0)) & (-9187201950435737472L)) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(float r22) {
        /*
            r21 = this;
            r8 = r21
            int r1 = java.lang.Float.hashCode(r22)
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
            int r20 = (-1) - r1
            r19 = 0
            r18 = r19
        L22:
            long[] r3 = r8.metadata
            int r2 = r20 >> 3
            r0 = 7
            r0 = r20 & r0
            int r1 = r0 << 3
            r9 = r3[r2]
            long r9 = r9 >>> r1
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
            long r4 = r4 | r9
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r11 = r2 - r0
            long r0 = ~r2
            long r9 = r0 + r11
            long r0 = r0 | r11
            long r9 = r9 - r0
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = -1
            long r2 = r13 - r9
            long r0 = r13 - r15
            long r2 = r2 | r0
            long r13 = r13 - r2
        L5a:
            r9 = 0
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 == 0) goto L8a
            int r0 = java.lang.Long.numberOfTrailingZeros(r13)
            int r0 = r0 >> 3
            int r0 = r0 + r20
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r1 = (-1) - r1
            float[] r0 = r8.elements
            r0 = r0[r1]
            int r0 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r0 != 0) goto L7c
        L77:
            if (r1 < 0) goto L7b
            r19 = r17
        L7b:
            return r19
        L7c:
            r0 = 1
            long r11 = r13 - r0
            r9 = -1
            long r2 = r9 - r13
            long r0 = r9 - r11
            long r2 = r2 | r0
            long r9 = r9 - r2
            r13 = r9
            goto L5a
        L8a:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r2 = r4 + r0
            long r4 = r4 | r0
            long r2 = r2 - r4
            long r2 = r2 & r15
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L98
            r1 = -1
            goto L77
        L98:
            int r18 = r18 + 8
            int r20 = r20 + r18
            int r1 = (-1) - r20
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r20 = (-1) - r1
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatSet.contains(float):boolean");
    }

    public int hashCode() {
        float[] fArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int iHashCode = 0;
            while (true) {
                long j2 = jArr[i3];
                long j3 = ((~j2) << 7) & j2;
                if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 + j2) - (255 | j2) < 128) {
                            iHashCode += Float.hashCode(fArr[(i3 << 3) + i5]);
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

    public final int findElementIndex$collection(float f2) {
        int iHashCode = Float.hashCode(f2) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = (i2 + 127) - (127 | i2);
        int i4 = this._capacity;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = ((i5 + 7) - (7 | i5)) << 3;
            long j2 = jArr[i7] >>> i8;
            long j3 = jArr[i7 + 1] << (64 - i8);
            long j4 = (-i8) >> 63;
            long j5 = ((j3 + j4) - (j3 | j4)) | j2;
            long j6 = (((long) i3) * ScatterMapKt.BitmaskLsb) ^ j5;
            long j7 = ((-1) - (((-1) - (~j6)) | ((-1) - (j6 - ScatterMapKt.BitmaskLsb)))) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(j7) >> 3) + i5;
                int i9 = (iNumberOfTrailingZeros + i4) - (iNumberOfTrailingZeros | i4);
                if (this.elements[i9] == f2) {
                    return i9;
                }
                long j8 = j7 - 1;
                j7 = (j7 + j8) - (j7 | j8);
            }
            long j9 = j5 & ((~j5) << 6);
            if ((j9 - 9187201950435737472L) - (j9 | (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9 A[PHI: r4
  0x00a9: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:38:0x0057, B:54:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r23, java.lang.CharSequence r24, java.lang.CharSequence r25, int r26, kotlin.jvm.functions.Function1<? super java.lang.Float, ? extends java.lang.CharSequence> r27) {
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
            float[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb0
            r5 = 0
            r4 = 0
        L39:
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
            if (r0 == 0) goto La6
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r14 = 8 - r1
            r1 = 0
        L63:
            if (r1 >= r14) goto La7
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L89
            int r0 = r5 << 3
            int r0 = r0 + r1
            r0 = r8[r0]
            r15 = r26
            if (r4 != r15) goto L8a
            r9.append(r10)
        L7f:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L89:
            goto L9e
        L8a:
            if (r4 == 0) goto L8f
            r9.append(r13)
        L8f:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r11.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r4 = r4 + 1
        L9e:
            r0 = 8
            long r2 = r2 >> r0
            int r1 = r1 + 1
            r15 = r22
            goto L63
        La6:
            goto La9
        La7:
            if (r14 != r0) goto Lb0
        La9:
            if (r5 == r6) goto Lb0
            int r5 = r5 + 1
            r0 = r22
            goto L39
        Lb0:
            r9.append(r12)
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatSet.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0099 A[PHI: r4
  0x0099: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:36:0x0050, B:50:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r21, java.lang.CharSequence r22, java.lang.CharSequence r23, kotlin.jvm.functions.Function1<? super java.lang.Float, ? extends java.lang.CharSequence> r24) {
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
            float[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L9e
            r5 = 0
            r4 = 0
        L39:
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
            if (r0 == 0) goto L99
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L5c:
            if (r1 >= r14) goto L97
            r16 = 255(0xff, double:1.26E-321)
            long r18 = r2 & r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L93
            int r0 = r5 << 3
            int r0 = r0 + r1
            r15 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L7d
            r9.append(r10)
        L73:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L7d:
            if (r4 == 0) goto L82
            r9.append(r13)
        L82:
            java.lang.Float r0 = java.lang.Float.valueOf(r15)
            java.lang.Object r0 = r11.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L93:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            goto L5c
        L97:
            if (r14 != r15) goto L9e
        L99:
            if (r5 == r6) goto L9e
            int r5 = r5 + 1
            goto L39
        L9e:
            r9.append(r12)
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatSet.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0094 A[PHI: r4
  0x0094: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:36:0x004b, B:50:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r21, java.lang.CharSequence r22, kotlin.jvm.functions.Function1<? super java.lang.Float, ? extends java.lang.CharSequence> r23) {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r0 = "separator"
            r13 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "prefix"
            r2 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "transform"
            r12 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r11 = ""
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.String r10 = "..."
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            float[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L99
            r5 = 0
            r4 = 0
        L35:
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
            if (r0 == 0) goto L94
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L57:
            if (r1 >= r14) goto L92
            r16 = 255(0xff, double:1.26E-321)
            long r18 = r2 & r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
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
            r9.append(r13)
        L7d:
            java.lang.Float r0 = java.lang.Float.valueOf(r15)
            java.lang.Object r0 = r12.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L8e:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            goto L57
        L92:
            if (r14 != r15) goto L99
        L94:
            if (r5 == r6) goto L99
            int r5 = r5 + 1
            goto L35
        L99:
            r9.append(r11)
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatSet.joinToString(java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x009f A[PHI: r4
  0x009f: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:36:0x004e, B:50:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, kotlin.jvm.functions.Function1<? super java.lang.Float, ? extends java.lang.CharSequence> r26) {
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
            float[] r8 = r1.elements
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
            java.lang.Float r0 = java.lang.Float.valueOf(r15)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatSet.joinToString(java.lang.CharSequence, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x009b A[PHI: r4
  0x009b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:36:0x004a, B:50:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(kotlin.jvm.functions.Function1<? super java.lang.Float, ? extends java.lang.CharSequence> r25) {
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
            float[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La0
            r5 = 0
            r4 = 0
        L2c:
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
            if (r0 == 0) goto L9b
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L56:
            if (r1 >= r14) goto L99
            r22 = 255(0xff, double:1.26E-321)
            r20 = -1
            long r18 = r20 - r2
            long r16 = r20 - r22
            long r18 = r18 | r16
            long r20 = r20 - r18
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 >= 0) goto L95
            int r0 = r5 << 3
            int r0 = r0 + r1
            r15 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L7f
            r9.append(r10)
        L75:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L7f:
            if (r4 == 0) goto L84
            r9.append(r12)
        L84:
            java.lang.Float r0 = java.lang.Float.valueOf(r15)
            java.lang.Object r0 = r13.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L95:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            goto L56
        L99:
            if (r14 != r15) goto La0
        L9b:
            if (r5 == r6) goto La0
            int r5 = r5 + 1
            goto L2c
        La0:
            r9.append(r11)
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatSet.joinToString(kotlin.jvm.functions.Function1):java.lang.String");
    }
}
