package androidx.collection;

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
/* JADX INFO: compiled from: IntLongMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005'4\u0012\u0006\u001anj?0LeVBZS0\u0013s{B-cҕyCQU\"}0\u0010WNmpvJh\u000bKƤ\u000e\u0016\u000fj4I[xe\u0012%2JoE8UoS9ht<\u0007(20D\u0002ڎ\t\u001a8S\u0018v\u0001HS\f(0H\u0081@\u0007#˟5\u001a@\u0005~%\u0007 ֔kNDH5\u0002HB;\u0003\u0018V~=mE\u0015_\u001dHd';xq ;@eL%'c\u00035f\nUIӑwޮ\u0004ؒo+9a\fWdlH8#Cg\r\f\u0007Vr\u0013fx\u001e7-_cyR\u001e*\bz*$L\u0006\u001e\u0006U\\\\C`ǘ\u000eս2ο;bNi\u001a^p\u0014+eD1=\u007fa-\u007fӜf\u001amI4f7*\u0019=\"1\u001b\u0007!\nVVl#7lw\u007fE\u0002DKef\n\bT6\b~\u0001\u001a*22\u0010$=\u001a).E'gqG89}\u0012JTg%\u0007pjci\u0001_P$~\u0016e>7\"!լj̆j¬\u001di:0e\u001c\u0003\u001b.\u000e!@tyR S\u000f\u0015яh2x[~\"%]hg]|\u0006&Wg`y4\u001a&\u001e\u0004jvBbl\u0017\u0013|~rc\u001djkV$ĘLt\u0016\u001d\fJT2#4EwBN<B)kC_Ҵ\"LG\"\u0019e`\u000f \u0001Z9J y&\u0005\t/s\u000b\u00076Φ~Λ+ʉ)O;hi5GI\u0006AvX\u0015>\u0017\u0010\u0004\u000fui֙KVr;\u0006[\u0002F&\u001c?WUf#\u0011\u000f)`%[m\u0013ǫḵLȼo(\u000b$';\u0017Q\u0018'x\u0015D{z[_cE$Ցb|)-t\u0006\u007f\bV|Miz%k@Yr1|jv~ُ\u000bʍ\u001dݒI\u001d0(M-qJM5\u00068G0qny~\\\u0011ˏ\u00130z\u000b\u00142i<\u007fdWcXXHKi~lER\u0015IܰNݬv٤\u000b\u0018B9KHo{!ZFg#/,hMԴ\r9jig+o,K^c8\u000e[}B`s)\u001f{kg\u001c\u0005\u0014|\u0019y'\n9\u0013ar 6U \u0005Y\u0013\u0013>4\f\u001eFCKb3S7TzɽB\u0082\n͏\u001do\u0014A\u0013\u007ftaU+zF\u0002mn\u000e\u0003\r%ZV8xE\u000f5r9\rCK\u001e'ja\u000bsFbe{2/\u000bM\u000f!j]7~%Y{\u0005?!(f:#E\fzy\b<\u0004Uc\u0006k\u001e\u000eh\u001e\u0003\u001dPS39\u007fH&{xU\u0019\n|N\u0013,BlXN0_\u0017z+El\u0010\u0015\u000b'\b\u000bo\u0011d|T}7QS\u0019\u0017r`7\u0012\u0003cTUE\u0006c/mOp\u001457oSi58V&)\u001219\rg\u001fv\u0019\f\u001dƐ\u001a{\u001c\b\u0012\u000f\u0019v0\u00064P\u001b\r\u001a?\u0018E}\u0019ג\u0006\u001dd~{}'f7-r\fhhxz\u001ac\u001b\u001b\u001dkQӎlݫUҳ71^Z!'{B[^hx)SN\u000eW\u0014d+4 N\b\u0011+F˖\"֬Gգ[ܣ\u001117մ:c73`\u001eN5\by\u001c*\u0003*K͇\u0015צ\u0015Ļ\u0015ЁpH_Вnl.i\u0003\fy#\u000b\u0005`^?\u0015j\u000bޔ\"hG9\u001f&i\u0015\u0018v\u0015\r]IT+gĜ}\u05cd\u000eֺ\u0017Ã,|\u0019ܛJdz\u000b8BY\t\u000esD-tasԣeڒzݨp݁*QMЯR\n2\u001f\u001c\u0011\u007fiF/V\\H\u001eq\u0016ߥE\u001d)\u0003\u001bH\u0014wW/C{iSS77ε?\u008d\u0016ƙ=ˬ>y?\u008831\u0015\u0002)Wƣ:$t\u0590L,\u0014\u0005kڞ/{bȧ\u0013\""}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &.y\u0017>^!@/", "", "u(E", "-bP=T*Bb-", "", "5dc,V(IO\u0017\u0003\nrjz\u00136l\u007f&\u000bD\u000b UCx\u0017F\u0006!D]\b)E", "-rXGX", "5dc,f0SSW|\u0005e3|\u0007>i\n1:<\n !Vk\u001d@\u0001.C", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "9dh@", "", "5dc\u0018X@L\u0012\u0015\b\u0004h;x\u00183o\t6", ";dc.W(MO", "", "5dc\u001aX;:R\u0015\u000ev\u001d(\u0006\u00129t{7\u007fJ\n%", "Ahi2", "5dc \\A>", "D`[BX:", "5dc#T3NS'=vg5\u0007\u0018+t\u00042\u0005N", "/k[", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "/mh", "1n]AT0Ga", "9dh", "1n]AT0Ga~~\u000f", "1n]AT0Ga\nz\u0002n,", "D`[BX", "1nd;g", "3pd._:", "=sW2e", "4h]1>,R7\"}zq", "4na\u0012T*A", "", "0k^0^", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4na\u0012T*A7\"}zq,{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "7mS2k", "4na\u0012T*A9\u0019\u0013", "4na\u0012T*AD\u0015\u0006\u000b^", "5dc", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "2dU.h3MD\u0015\u0006\u000b^", "5dc\u001ce\fEa\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "6`b566=S", "7r4:c;R", "7r=<g\fF^(\u0013", "8nX;G6,b&\u0003\u0004`", "", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "BqP;f-H`!", "<n]2", "BnBAe0GU", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.D@\b)9U\u00129#", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class IntLongMap {
    public int _capacity;
    public int _size;
    public int[] keys;
    public long[] metadata;
    public long[] values;

    public /* synthetic */ IntLongMap(DefaultConstructorMarker defaultConstructorMarker) {
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

    private IntLongMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = IntSetKt.getEmptyIntArray();
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

    public final long get(int i2) {
        int iFindKeyIndex = findKeyIndex(i2);
        if (iFindKeyIndex < 0) {
            throw new NoSuchElementException("Cannot find value for key " + i2);
        }
        return this.values[iFindKeyIndex];
    }

    public final long getOrDefault(int i2, long j2) {
        int iFindKeyIndex = findKeyIndex(i2);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : j2;
    }

    public final long getOrElse(int i2, Function0<Long> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(i2);
        if (iFindKeyIndex < 0) {
            return defaultValue.invoke().longValue();
        }
        return this.values[iFindKeyIndex];
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
            long j3 = (-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2));
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
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

    public final void forEach(Function2<? super Integer, ? super Long, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr2[i2];
            long j3 = (~j2) << 7;
            if ((((j3 + j2) - (j3 | j2)) & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                        int i5 = (i2 << 3) + i4;
                        block.invoke(Integer.valueOf(iArr[i5]), Long.valueOf(jArr[i5]));
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

    public final void forEachKey(Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.keys;
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
            long j3 = ((~j2) << 7) & j2;
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
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

    public final boolean contains(int i2) {
        return findKeyIndex(i2) >= 0;
    }

    public final boolean containsKey(int i2) {
        return findKeyIndex(i2) >= 0;
    }

    public static /* synthetic */ String joinToString$default(IntLongMap intLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((1 & i3) != 0) {
        }
        if ((i3 + 2) - (2 | i3) != 0) {
        }
        if ((4 & i3) != 0) {
        }
        if ((8 & i3) != 0) {
            i2 = -1;
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
        }
        return intLongMap.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab A[PHI: r5
  0x00ab: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:6:0x0058, B:22:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r24, java.lang.CharSequence r25, java.lang.CharSequence r26, int r27, java.lang.CharSequence r28) {
        /*
            r23 = this;
            r2 = r23
            java.lang.String r1 = "separator"
            r22 = r24
            r0 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "prefix"
            r3 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r1 = "postfix"
            r21 = r26
            r0 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "truncated"
            r12 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            int[] r10 = r2.keys
            long[] r9 = r2.values
            long[] r8 = r2.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto Lb2
            r6 = 0
            r5 = 0
        L3b:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            r19 = -1
            long r13 = r19 - r0
            long r0 = r19 - r3
            long r13 = r13 | r0
            long r19 = r19 - r13
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r15 = -1
            long r13 = r15 - r19
            long r0 = r15 - r17
            long r13 = r13 | r0
            long r15 = r15 - r13
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 == 0) goto La8
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r13 = 0
        L64:
            if (r13 >= r14) goto La9
            r0 = 255(0xff, double:1.26E-321)
            long r16 = r3 & r0
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 >= 0) goto L89
            int r0 = r6 << 3
            int r0 = r0 + r13
            r15 = r10[r0]
            r1 = r9[r0]
            r0 = r27
            r0 = r0
            if (r5 != r0) goto L8a
            r11.append(r12)
        L7f:
            java.lang.String r1 = r11.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L89:
            goto La2
        L8a:
            if (r5 == 0) goto L93
            r16 = r11
            r17 = r22
            r16.append(r17)
        L93:
            r11.append(r15)
            r0 = 61
            r11.append(r0)
            r11.append(r1)
            int r5 = r5 + 1
            r15 = 8
        La2:
            long r3 = r3 >> r15
            int r13 = r13 + 1
            r0 = r23
            goto L64
        La8:
            goto Lab
        La9:
            if (r14 != r15) goto Lb2
        Lab:
            if (r6 == r7) goto Lb2
            int r6 = r6 + 1
            r0 = r23
            goto L3b
        Lb2:
            r0 = r21
            r11.append(r0)
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntLongMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec A[PHI: r4
  0x00ec: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:23:0x008c, B:39:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.IntLongMap r19, java.lang.CharSequence r20, java.lang.CharSequence r21, java.lang.CharSequence r22, int r23, java.lang.CharSequence r24, kotlin.jvm.functions.Function2 r25, int r26, java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntLongMap.joinToString$default(androidx.collection.IntLongMap, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2, int, java.lang.Object):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc A[PHI: r4
  0x00bc: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x005c, B:21:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, java.lang.CharSequence r27, int r28, java.lang.CharSequence r29, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, ? extends java.lang.CharSequence> r30) {
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
            java.lang.String r0 = "truncated"
            r12 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "transform"
            r11 = r30
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            int[] r9 = r2.keys
            long[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lc4
            r5 = 0
            r4 = 0
        L41:
            r2 = r7[r5]
            long r0 = ~r2
            r14 = 7
            long r0 = r0 << r14
            r18 = -1
            long r14 = r18 - r0
            long r0 = r18 - r2
            long r14 = r14 | r0
            long r18 = r18 - r14
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r18 + r16
            long r18 = r18 | r16
            long r14 = r14 - r18
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto Lbc
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L68:
            if (r14 >= r1) goto Lb8
            r21 = 255(0xff, double:1.26E-321)
            r19 = -1
            long r17 = r19 - r2
            long r15 = r19 - r21
            long r17 = r17 | r15
            long r19 = r19 - r17
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r0 >= 0) goto Lb0
            int r0 = r5 << 3
            int r0 = r0 + r14
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = r28
            if (r4 != r0) goto L94
            r10.append(r12)
        L8a:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L94:
            if (r4 == 0) goto L9d
            r18 = r10
            r19 = r23
            r18.append(r19)
        L9d:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            java.lang.Object r0 = r11.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        Lb0:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r24
            goto L68
        Lb8:
            r0 = 8
            if (r1 != r0) goto Lc4
        Lbc:
            if (r5 == r6) goto Lc4
            int r5 = r5 + 1
            r0 = r24
            goto L41
        Lc4:
            r10.append(r13)
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntLongMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
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
            boolean r0 = r13 instanceof androidx.collection.IntLongMap
            r18 = 0
            if (r0 != 0) goto L10
            return r18
        L10:
            androidx.collection.IntLongMap r13 = (androidx.collection.IntLongMap) r13
            int r1 = r13.getSize()
            int r0 = r20.getSize()
            if (r1 == r0) goto L1d
            return r18
        L1d:
            int[] r12 = r2.keys
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
            long r0 = r0 & r6
            r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r0 + r4
            long r0 = r0 | r4
            long r2 = r2 - r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L71
            int r0 = r8 - r9
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r5 = r18
        L48:
            if (r5 >= r14) goto L6f
            r0 = 255(0xff, double:1.26E-321)
            r16 = -1
            long r2 = r16 - r0
            long r0 = r16 - r6
            long r2 = r2 | r0
            long r16 = r16 - r2
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
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
            goto L48
        L6f:
            if (r14 != r15) goto L76
        L71:
            if (r8 == r9) goto L76
            int r8 = r8 + 1
            goto L2a
        L76:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntLongMap.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[PHI: r5
  0x0072: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:10:0x0035, B:21:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
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
            int[] r10 = r12.keys
            long[] r9 = r12.values
            long[] r8 = r12.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L77
            r6 = 0
            r5 = 0
        L21:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r15 = r0 + r3
            long r0 = r0 | r3
            long r15 = r15 - r0
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r15 + r13
            long r15 = r15 | r13
            long r1 = r1 - r15
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L6f
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r14 = 8
            int r13 = 8 - r0
            r2 = 0
        L41:
            if (r2 >= r13) goto L70
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r17 & r3
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L6e
            int r0 = r6 << 3
            int r0 = r0 + r2
            r15 = r10[r0]
            r0 = r9[r0]
            r11.append(r15)
            java.lang.String r15 = "="
            r11.append(r15)
            r11.append(r0)
            int r5 = r5 + 1
            int r0 = r12._size
            if (r5 >= r0) goto L6a
            java.lang.String r0 = ", "
            r11.append(r0)
        L6a:
            long r3 = r3 >> r14
            int r2 = r2 + 1
            goto L41
        L6e:
            goto L6a
        L6f:
            goto L72
        L70:
            if (r13 != r14) goto L77
        L72:
            if (r6 == r7) goto L77
            int r6 = r6 + 1
            goto L21
        L77:
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r11.append(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "s.append('}').toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntLongMap.toString():java.lang.String");
    }

    public final boolean all(Function2<? super Integer, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr2[i2];
            long j3 = (~j2) << 7;
            if ((-1) - (((-1) - ((j3 + j2) - (j3 | j2))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (!predicate.invoke(Integer.valueOf(iArr[i5]), Long.valueOf(jArr[i5])).booleanValue()) {
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, java.lang.Boolean> r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "predicate"
            r11 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            int[] r10 = r1.keys
            long[] r9 = r1.values
            long[] r8 = r1.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            r17 = 0
            if (r7 < 0) goto L71
            r6 = r17
        L19:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            r14 = -1
            long r12 = r14 - r0
            long r0 = r14 - r3
            long r12 = r12 | r0
            long r14 = r14 - r12
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r1
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 == 0) goto L6c
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r5 = 8 - r0
            r2 = r17
        L3b:
            if (r2 >= r5) goto L6a
            r0 = 255(0xff, double:1.26E-321)
            long r15 = r0 + r3
            long r0 = r0 | r3
            long r15 = r15 - r0
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L66
            int r1 = r6 << 3
            int r1 = r1 + r2
            r0 = r10[r1]
            r13 = r9[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            java.lang.Object r0 = r11.invoke(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L66
            r0 = 1
            return r0
        L66:
            long r3 = r3 >> r12
            int r2 = r2 + 1
            goto L3b
        L6a:
            if (r5 != r12) goto L71
        L6c:
            if (r6 == r7) goto L71
            int r6 = r6 + 1
            goto L19
        L71:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntLongMap.any(kotlin.jvm.functions.Function2):boolean");
    }

    public final int count(Function2<? super Integer, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j2 = jArr2[i3];
                long j3 = (~j2) << 7;
                if ((-1) - (((-1) - ((j3 + j2) - (j3 | j2))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 + j2) - (255 | j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            if (predicate.invoke(Integer.valueOf(iArr[i7]), Long.valueOf(jArr[i7])).booleanValue()) {
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
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
            if (r7 < 0) goto L55
            r6 = r16
        Lf:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r10 = r0 + r3
            long r0 = r0 | r3
            long r10 = r10 - r0
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r1
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 == 0) goto L50
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r10 = 8 - r0
            r5 = r16
        L2d:
            if (r5 >= r10) goto L4e
            r0 = 255(0xff, double:1.26E-321)
            r14 = -1
            long r12 = r14 - r0
            long r0 = r14 - r3
            long r12 = r12 | r0
            long r14 = r14 - r12
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4a
            int r0 = r6 << 3
            int r0 = r0 + r5
            r1 = r9[r0]
            int r0 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r0 != 0) goto L4a
            r0 = 1
            return r0
        L4a:
            long r3 = r3 >> r11
            int r5 = r5 + 1
            goto L2d
        L4e:
            if (r10 != r11) goto L55
        L50:
            if (r6 == r7) goto L55
            int r6 = r6 + 1
            goto Lf
        L55:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntLongMap.containsValue(long):boolean");
    }

    public int hashCode() {
        int[] iArr = this.keys;
        long[] jArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int iHashCode = 0;
            while (true) {
                long j2 = jArr2[i3];
                if ((((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2))) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128) {
                            int i6 = (i3 << 3) + i5;
                            iHashCode += Integer.hashCode(iArr[i6]) ^ Long.hashCode(jArr[i6]);
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

    public final int findKeyIndex(int i2) {
        int iHashCode = Integer.hashCode(i2) * ScatterMapKt.MurmurHashC1;
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = (i3 + 127) - (127 | i3);
        int i5 = this._capacity;
        int i6 = i3 >>> 7;
        int i7 = (i6 + i5) - (i6 | i5);
        int i8 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j2 = jArr[i9] >>> i10;
            long j3 = jArr[i9 + 1] << (64 - i10);
            long j4 = (-i10) >> 63;
            long j5 = ((j3 + j4) - (j3 | j4)) | j2;
            long j6 = (((long) i4) * ScatterMapKt.BitmaskLsb) ^ j5;
            for (long j7 = ((-1) - (((-1) - (~j6)) | ((-1) - (j6 - ScatterMapKt.BitmaskLsb)))) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i7) & i5;
                if (this.keys[iNumberOfTrailingZeros] == i2) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((-1) - (((-1) - ((-1) - (((-1) - j5) | ((-1) - ((~j5) << 6))))) | ((-1) - (-9187201950435737472L))) != 0) {
                return -1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8 A[PHI: r4
  0x00b8: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0058, B:21:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, java.lang.CharSequence r27, int r28, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, ? extends java.lang.CharSequence> r29) {
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
            int[] r9 = r2.keys
            long[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lc0
            r5 = 0
            r4 = 0
        L3d:
            r2 = r7[r5]
            long r0 = ~r2
            r14 = 7
            long r0 = r0 << r14
            r18 = -1
            long r14 = r18 - r0
            long r0 = r18 - r2
            long r14 = r14 | r0
            long r18 = r18 - r14
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r18 + r16
            long r18 = r18 | r16
            long r14 = r14 - r18
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto Lb8
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L64:
            if (r14 >= r1) goto Lb4
            r21 = 255(0xff, double:1.26E-321)
            r19 = -1
            long r17 = r19 - r2
            long r15 = r19 - r21
            long r17 = r17 | r15
            long r19 = r19 - r17
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r0 >= 0) goto Lac
            int r0 = r5 << 3
            int r0 = r0 + r14
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = r28
            if (r4 != r0) goto L90
            r10.append(r11)
        L86:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L90:
            if (r4 == 0) goto L99
            r18 = r10
            r19 = r23
            r18.append(r19)
        L99:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            java.lang.Object r0 = r12.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        Lac:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r24
            goto L64
        Lb4:
            r0 = 8
            if (r1 != r0) goto Lc0
        Lb8:
            if (r5 == r6) goto Lc0
            int r5 = r5 + 1
            r0 = r24
            goto L3d
        Lc0:
            r10.append(r13)
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntLongMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa A[PHI: r4
  0x00aa: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x004f, B:21:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r23, java.lang.CharSequence r24, java.lang.CharSequence r25, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, ? extends java.lang.CharSequence> r26) {
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
            int[] r9 = r2.keys
            long[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb1
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
            if (r0 == 0) goto Laa
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L5b:
            if (r14 >= r1) goto La6
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L9e
            int r0 = r5 << 3
            int r0 = r0 + r14
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L82
            r10.append(r11)
        L78:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L82:
            if (r4 == 0) goto L8b
            r18 = r10
            r19 = r21
            r18.append(r19)
        L8b:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            java.lang.Object r0 = r12.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        L9e:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r22
            goto L5b
        La6:
            r0 = 8
            if (r1 != r0) goto Lb1
        Laa:
            if (r5 == r6) goto Lb1
            int r5 = r5 + 1
            r0 = r22
            goto L3d
        Lb1:
            r10.append(r13)
            goto L78
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntLongMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6 A[PHI: r4
  0x00a6: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0047, B:21:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, ? extends java.lang.CharSequence> r27) {
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
            java.lang.String r0 = "transform"
            r13 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r12 = ""
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            java.lang.String r11 = "..."
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            int[] r9 = r2.keys
            long[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lad
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
            if (r14 == 0) goto La6
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L53:
            if (r14 >= r1) goto La2
            r21 = 255(0xff, double:1.26E-321)
            r19 = -1
            long r17 = r19 - r2
            long r15 = r19 - r21
            long r17 = r17 | r15
            long r19 = r19 - r17
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r0 >= 0) goto L9a
            int r0 = r5 << 3
            int r0 = r0 + r14
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L7e
            r10.append(r11)
        L74:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L7e:
            if (r4 == 0) goto L87
            r18 = r10
            r19 = r23
            r18.append(r19)
        L87:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        L9a:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r24
            goto L53
        La2:
            r0 = 8
            if (r1 != r0) goto Lad
        La6:
            if (r5 == r6) goto Lad
            int r5 = r5 + 1
            r0 = r24
            goto L39
        Lad:
            r10.append(r12)
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntLongMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1 A[PHI: r4
  0x00a1: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x004b, B:21:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r22, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, ? extends java.lang.CharSequence> r23) {
        /*
            r21 = this;
            r2 = r21
            java.lang.String r1 = "separator"
            r20 = r22
            r0 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "transform"
            r13 = r23
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
            int[] r9 = r2.keys
            long[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La8
            r5 = 0
            r4 = 0
        L34:
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
            if (r0 == 0) goto La1
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L57:
            if (r1 >= r14) goto L9f
            r16 = 255(0xff, double:1.26E-321)
            long r18 = r2 & r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L7a
            int r0 = r5 << 3
            int r0 = r0 + r1
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L7b
            r10.append(r11)
        L70:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L7a:
            goto L99
        L7b:
            if (r4 == 0) goto L84
            r18 = r10
            r19 = r20
            r18.append(r19)
        L84:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L99:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r21
            goto L57
        L9f:
            if (r14 != r15) goto La8
        La1:
            if (r5 == r6) goto La8
            int r5 = r5 + 1
            r0 = r21
            goto L34
        La8:
            r10.append(r12)
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntLongMap.joinToString(java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa A[PHI: r4
  0x00aa: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x004e, B:21:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Long, ? extends java.lang.CharSequence> r24) {
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
            int[] r9 = r2.keys
            long[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb1
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
            if (r0 == 0) goto Laa
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L5a:
            if (r1 >= r14) goto La8
            r20 = 255(0xff, double:1.26E-321)
            long r18 = r2 + r20
            long r16 = r2 | r20
            long r18 = r18 - r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L81
            int r0 = r5 << 3
            int r0 = r0 + r1
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L82
            r10.append(r11)
        L77:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L81:
            goto La2
        L82:
            if (r4 == 0) goto L87
            r10.append(r13)
        L87:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r16 = r22
            r17 = r15
            r18 = r0
            java.lang.Object r0 = r16.invoke(r17, r18)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        La2:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r23
            goto L5a
        La8:
            if (r14 != r15) goto Lb1
        Laa:
            if (r5 == r6) goto Lb1
            int r5 = r5 + 1
            r0 = r23
            goto L30
        Lb1:
            r10.append(r12)
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntLongMap.joinToString(kotlin.jvm.functions.Function2):java.lang.String");
    }
}
