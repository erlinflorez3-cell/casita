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
/* JADX INFO: compiled from: LongIntMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005'4\u0012\u0006\u001bnj?4LeVAZS0\u000fs{B-cҕyCQU\"}0\u0010WNmpvJh\u000bKƤ\u000e\u0016\u000fj4I[xe\u0012%2JoE8UoS9ht<\u0007(20D\u0002ڎ\t\u001a8S\u0018v\u0001HS\f(0H\u0081@\u0007#˟5\u001a@\u0005~%\u0007 ֔kNDH5\u0002HB;\u0003\u0018V~=mE\u0015_\u001dHd';\u000eq ;@e7%'c\u00035f\nUIӑwޮ\u0004ؒo+9a\fWdlH8#Cg\r\f\u0007Vr\u0013fx\u001e7-_cyg\u001e*\bz*\u000fL\u0006\u001e\u0006U\\\\C`ǘ\u000eս2ο;bNi\u001a^p\u0014+eD1=\u007faB\u007fӜf\u001amI4f7*\u0019=\"1\u001b\u0007!\nkVl#7lw\u007fE\u0002DKef\n\b?6\b~\u0001\u001a*22\u0010$=\u001a).E'gqG89}\u0012JTg%\u001cpjci\u0001JP$~\u0016e>7\"!լj̆j¬\u001di:0e\u001c\u0003\u001b.\u000e!@tyR S\u000f\u0015яh2x[~\"%]hg]|\u0006&Wguy4\u001a&\u001e\u0004jvBbl\u0017\u0013|~rc\u001djkV9ĘLt\u0016\u001d\fJT2#4EwBN<B)kCJҴ\"LG\"\u0019e`\u000f \u0001Z9J y&\u0005\t/s\u000b\u00076Φ~Λ+ʉ)O;hi5GI\u0006AvX\u0015>\u0017\u0010\u0004\u000fui֙KVr;\u0006[\u0002F&\u001c?WUf#\u0011\u000f)`%[m\u0013ǫḵLȼo(\u000b$';\u0017Q\u0018'x\u0015D{z[_cE9Ցb|)-t\u0006\u007f\bV|Miz%k@Yr1|jv~ُ\u000bʍ\u001dݒI\u001d0(M-qJM5\u00068G0qny~\\{ˏ\u00130z\u000b\u00142i<\u007fdWcXXHKi~lER\u0015IܰNݬv٤\u000b\u0018B9KHof!ZFg#/,}MԴ\r9jig+o,6^c8\u000e[}Bus)\u001f{kg\u001co\u0014|\u0019y'\n9}ar 6U \u0005n\u0013\u0013>4\f\u001eFCKb3>7TzɽB\u0082\n͏\u001do\u0014A\u0013\u007ftaU+zF\u0002mn\u000e\u0003\r%ZV8xE\u000f5r9\rCK\u001e'ja\u000bsFbe{2/\u000bM\u000f!j]7~%Y{\u0005?!(f:#E\fzy\b<\u0004Uc\u0006k\u001e\u000eh\u001e\u0003\u001dPS39\u007fH&{xU\u0019\n|N\u0013,BlXN0_\u0017z+El\u0010\u0015\u000b'\b\u000bo\u0011d|T}7QS\u0019\u0017r`7\u0012\u0003cTUE\u0006c/mOp\u001457oSi58V&)\u001219\rg\u001fv\u0019\f2Ɛ\u001a{\u001c\b\u0012\u000f\u0019v0\u00064P\u001b\r\u001a?\u0018E}\u0004ג\u0006\u001dd~{}'f7-r\fhhxz\u001ac\u001b\u001b\u001dkQӎlݫUҳ71^Z!'{B[^hx)SN\u000eW\u0014d+4 N\b\u0011+F˖\"֬Gգ[ܣ\u001117մ:c73`\u001eN5\by\u001c*\u0003*K͇\u0015צ\u0015Ļ\u0015ЁpH_Вnl.i\u0003\fy#\u000b\u0005`^?\u0015j\u000bޔ\"hG9\u001f&i\u0015\u0018v\u0015\r]IT+gĜ}\u05cd\u000eֺ\u0017Ã,|\u0019ܛJdz\u000b8BY\t\u000esD-t^sԣeڒzݨp݁*QMЯR\n2\u001e\u001c\u0011\u007fiF.V\\H\u001eq\u0016ߥE\u001d)\u0003\u001bG\u0014wW/CziSS;7ε?\u008d\u0016ƙ=ˬ>y?\u008831\u0015\u0002)Wƣ:$t\u0590L,\u0014\u0005kڞ/{bȧ\u0013\""}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! IS\u0017K^!@/", "", "u(E", "-bP=T*Bb-", "", "5dc,V(IO\u0017\u0003\nrjz\u00136l\u007f&\u000bD\u000b UCx\u0017F\u0006!D]\b)E", "-rXGX", "5dc,f0SSW|\u0005e3|\u0007>i\n1:<\n !Vk\u001d@\u0001.C", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "9dh@", "", "5dc\u0018X@L\u0012\u0015\b\u0004h;x\u00183o\t6", ";dc.W(MO", "5dc\u001aX;:R\u0015\u000ev\u001d(\u0006\u00129t{7\u007fJ\n%", "Ahi2", "5dc \\A>", "D`[BX:", "", "5dc#T3NS'=vg5\u0007\u0018+t\u00042\u0005N", "/k[", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "/mh", "1n]AT0Ga", "9dh", "1n]AT0Ga~~\u000f", "1n]AT0Ga\nz\u0002n,", "D`[BX", "1nd;g", "3pd._:", "=sW2e", "4h]1>,R7\"}zq", "4na\u0012T*A", "", "0k^0^", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4na\u0012T*A7\"}zq,{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "7mS2k", "4na\u0012T*A9\u0019\u0013", "4na\u0012T*AD\u0015\u0006\u000b^", "5dc", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "2dU.h3MD\u0015\u0006\u000b^", "5dc\u001ce\fEa\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "6`b566=S", "7r4:c;R", "7r=<g\fF^(\u0013", "8nX;G6,b&\u0003\u0004`", "", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "BqP;f-H`!", "<n]2", "BnBAe0GU", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<]/>[a)FU\u00129#", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class LongIntMap {
    public int _capacity;
    public int _size;
    public long[] keys;
    public long[] metadata;
    public int[] values;

    public /* synthetic */ LongIntMap(DefaultConstructorMarker defaultConstructorMarker) {
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

    private LongIntMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = LongSetKt.getEmptyLongArray();
        this.values = IntSetKt.getEmptyIntArray();
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

    public final int get(long j2) {
        int iFindKeyIndex = findKeyIndex(j2);
        if (iFindKeyIndex < 0) {
            throw new NoSuchElementException("Cannot find value for key " + j2);
        }
        return this.values[iFindKeyIndex];
    }

    public final int getOrDefault(long j2, int i2) {
        int iFindKeyIndex = findKeyIndex(j2);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : i2;
    }

    public final int getOrElse(long j2, Function0<Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(j2);
        if (iFindKeyIndex < 0) {
            return defaultValue.invoke().intValue();
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
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
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

    public final void forEach(Function2<? super Long, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.keys;
        int[] iArr = this.values;
        long[] jArr2 = this.metadata;
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
                    if ((255 + j2) - (255 | j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        block.invoke(Long.valueOf(jArr[i5]), Integer.valueOf(iArr[i5]));
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

    public final void forEachKey(Function1<? super Long, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.keys;
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
                    if ((255 + j2) - (255 | j2) < 128) {
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

    public final void forEachValue(Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.values;
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
        return getSize();
    }

    public final boolean contains(long j2) {
        return findKeyIndex(j2) >= 0;
    }

    public final boolean containsKey(long j2) {
        return findKeyIndex(j2) >= 0;
    }

    public static /* synthetic */ String joinToString$default(LongIntMap longIntMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
        }
        if ((i3 + 4) - (4 | i3) != 0) {
        }
        if ((i3 + 8) - (8 | i3) != 0) {
            i2 = -1;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
        }
        return longIntMap.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009f A[PHI: r6
  0x009f: PHI (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:6:0x004c, B:22:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r21, java.lang.CharSequence r22, java.lang.CharSequence r23, int r24, java.lang.CharSequence r25) {
        /*
            r20 = this;
            r2 = r20
            java.lang.String r1 = "separator"
            r19 = r21
            r0 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "prefix"
            r3 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r1 = "postfix"
            r18 = r23
            r0 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "truncated"
            r13 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
            long[] r11 = r2.keys
            int[] r10 = r2.values
            long[] r9 = r2.metadata
            int r0 = r9.length
            int r8 = r0 + (-2)
            if (r8 < 0) goto La6
            r7 = 0
            r6 = 0
        L3b:
            r4 = r9[r7]
            long r0 = ~r4
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r4
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r0 + r14
            long r0 = r0 | r14
            long r2 = r2 - r0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 == 0) goto L9c
            int r0 = r7 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r3 = 8
            int r15 = 8 - r0
            r14 = 0
        L58:
            if (r14 >= r15) goto L9d
            r0 = 255(0xff, double:1.26E-321)
            long r16 = r4 & r0
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 >= 0) goto L7d
            int r0 = r7 << 3
            int r0 = r0 + r14
            r2 = r11[r0]
            r1 = r10[r0]
            r0 = r24
            r0 = r0
            if (r6 != r0) goto L7e
            r12.append(r13)
        L73:
            java.lang.String r1 = r12.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L7d:
            goto L96
        L7e:
            if (r6 == 0) goto L87
            r16 = r12
            r17 = r19
            r16.append(r17)
        L87:
            r12.append(r2)
            r0 = 61
            r12.append(r0)
            r12.append(r1)
            int r6 = r6 + 1
            r3 = 8
        L96:
            long r4 = r4 >> r3
            int r14 = r14 + 1
            r0 = r20
            goto L58
        L9c:
            goto L9f
        L9d:
            if (r15 != r3) goto La6
        L9f:
            if (r7 == r8) goto La6
            int r7 = r7 + 1
            r0 = r20
            goto L3b
        La6:
            r0 = r18
            r12.append(r0)
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongIntMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4 A[PHI: r4
  0x00f4: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:23:0x0094, B:39:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.LongIntMap r19, java.lang.CharSequence r20, java.lang.CharSequence r21, java.lang.CharSequence r22, int r23, java.lang.CharSequence r24, kotlin.jvm.functions.Function2 r25, int r26, java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongIntMap.joinToString$default(androidx.collection.LongIntMap, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2, int, java.lang.Object):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc A[PHI: r4
  0x00bc: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x005c, B:21:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, java.lang.CharSequence r27, int r28, java.lang.CharSequence r29, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Integer, ? extends java.lang.CharSequence> r30) {
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
            long[] r9 = r2.keys
            int[] r8 = r2.values
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
            r16 = r9[r0]
            r0 = r8[r0]
            r15 = r28
            if (r4 != r15) goto L94
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
            java.lang.Long r15 = java.lang.Long.valueOf(r16)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongIntMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r11 = r19
            r2 = r18
            r17 = 1
            if (r11 != r2) goto L9
            return r17
        L9:
            boolean r0 = r11 instanceof androidx.collection.LongIntMap
            r16 = 0
            if (r0 != 0) goto L10
            return r16
        L10:
            androidx.collection.LongIntMap r11 = (androidx.collection.LongIntMap) r11
            int r1 = r11.getSize()
            int r0 = r18.getSize()
            if (r1 == r0) goto L1d
            return r16
        L1d:
            long[] r10 = r2.keys
            int[] r9 = r2.values
            long[] r8 = r2.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L73
            r6 = r16
        L2a:
            r4 = r8[r6]
            long r0 = ~r4
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r4
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = -1
            long r2 = r12 - r0
            long r0 = r12 - r14
            long r2 = r2 | r0
            long r12 = r12 - r2
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L6e
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r3 = 8
            int r13 = 8 - r0
            r12 = r16
        L4c:
            if (r12 >= r13) goto L6c
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r4
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L65
            int r0 = r6 << 3
            int r0 = r0 + r12
            r2 = r10[r0]
            r1 = r9[r0]
            int r0 = r11.get(r2)
            if (r1 == r0) goto L66
            return r16
        L65:
            goto L68
        L66:
            r3 = 8
        L68:
            long r4 = r4 >> r3
            int r12 = r12 + 1
            goto L4c
        L6c:
            if (r13 != r3) goto L73
        L6e:
            if (r6 == r7) goto L73
            int r6 = r6 + 1
            goto L2a
        L73:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongIntMap.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007d A[PHI: r5
  0x007d: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:10:0x0039, B:21:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
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
            long[] r10 = r12.keys
            int[] r9 = r12.values
            long[] r8 = r12.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L82
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
            if (r0 == 0) goto L7a
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r14 = 8
            int r13 = 8 - r0
            r2 = 0
        L45:
            if (r2 >= r13) goto L7b
            r0 = 255(0xff, double:1.26E-321)
            r17 = -1
            long r15 = r17 - r0
            long r0 = r17 - r3
            long r15 = r15 | r0
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L79
            int r15 = r6 << 3
            int r15 = r15 + r2
            r0 = r10[r15]
            r15 = r9[r15]
            r11.append(r0)
            java.lang.String r0 = "="
            r11.append(r0)
            r11.append(r15)
            int r5 = r5 + 1
            int r0 = r12._size
            if (r5 >= r0) goto L75
            java.lang.String r0 = ", "
            r11.append(r0)
        L75:
            long r3 = r3 >> r14
            int r2 = r2 + 1
            goto L45
        L79:
            goto L75
        L7a:
            goto L7d
        L7b:
            if (r13 != r14) goto L82
        L7d:
            if (r6 == r7) goto L82
            int r6 = r6 + 1
            goto L21
        L82:
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r11.append(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "s.append('}').toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongIntMap.toString():java.lang.String");
    }

    public final boolean all(Function2<? super Long, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.keys;
        int[] iArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr2[i2];
            if ((-1) - (((-1) - ((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2)))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 + j2) - (255 | j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (!predicate.invoke(Long.valueOf(jArr[i5]), Integer.valueOf(iArr[i5])).booleanValue()) {
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Integer, java.lang.Boolean> r21) {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r0 = "predicate"
            r10 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            long[] r9 = r1.keys
            int[] r8 = r1.values
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            r19 = 0
            if (r6 < 0) goto L7d
            r5 = r19
        L19:
            r2 = r7[r5]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            r17 = -1
            long r11 = r17 - r0
            long r0 = r17 - r2
            long r11 = r11 | r0
            long r17 = r17 - r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = -1
            long r11 = r13 - r17
            long r0 = r13 - r15
            long r11 = r11 | r0
            long r13 = r13 - r11
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L78
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = r19
        L43:
            if (r4 >= r11) goto L76
            r0 = 255(0xff, double:1.26E-321)
            r15 = -1
            long r13 = r15 - r0
            long r0 = r15 - r2
            long r13 = r13 | r0
            long r15 = r15 - r13
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L72
            int r0 = r5 << 3
            int r0 = r0 + r4
            r13 = r9[r0]
            r0 = r8[r0]
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r10.invoke(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L72
            r0 = 1
            return r0
        L72:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L43
        L76:
            if (r11 != r12) goto L7d
        L78:
            if (r5 == r6) goto L7d
            int r5 = r5 + 1
            goto L19
        L7d:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongIntMap.any(kotlin.jvm.functions.Function2):boolean");
    }

    public final int count(Function2<? super Long, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.keys;
        int[] iArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j2 = jArr2[i3];
                long j3 = (-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2));
                if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 + j2) - (255 | j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            if (predicate.invoke(Long.valueOf(jArr[i7]), Integer.valueOf(iArr[i7])).booleanValue()) {
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsValue(int r18) {
        /*
            r17 = this;
            r0 = r17
            int[] r11 = r0.values
            long[] r10 = r0.metadata
            int r0 = r10.length
            int r9 = r0 + (-2)
            r16 = 0
            if (r9 < 0) goto L52
            r8 = r16
        Lf:
            r3 = r10[r8]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r5 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r5
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L4d
            int r0 = r8 - r9
            int r0 = ~r0
            int r0 = r0 >>> 31
            r7 = 8
            int r6 = 8 - r0
            r5 = r16
        L2a:
            if (r5 >= r6) goto L4b
            r0 = 255(0xff, double:1.26E-321)
            r14 = -1
            long r12 = r14 - r0
            long r0 = r14 - r3
            long r12 = r12 | r0
            long r14 = r14 - r12
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L47
            int r0 = r8 << 3
            int r0 = r0 + r5
            r0 = r11[r0]
            r1 = r18
            if (r1 != r0) goto L47
            r0 = 1
            return r0
        L47:
            long r3 = r3 >> r7
            int r5 = r5 + 1
            goto L2a
        L4b:
            if (r6 != r7) goto L52
        L4d:
            if (r8 == r9) goto L52
            int r8 = r8 + 1
            goto Lf
        L52:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongIntMap.containsValue(int):boolean");
    }

    public int hashCode() {
        long[] jArr = this.keys;
        int[] iArr = this.values;
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
                        if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                            int i6 = (i3 << 3) + i5;
                            long j3 = jArr[i6];
                            iHashCode += Integer.hashCode(iArr[i6]) ^ Long.hashCode(j3);
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

    public final int findKeyIndex(long j2) {
        int iHashCode = Long.hashCode(j2) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = i2 >>> 7;
        int i6 = (i5 + i4) - (i5 | i4);
        int i7 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j3 = (-1) - (((-1) - ((-1) - (((-1) - (jArr[i8 + 1] << (64 - i9))) | ((-1) - ((-i9) >> 63))))) & ((-1) - (jArr[i8] >>> i9)));
            long j4 = (((long) i3) * ScatterMapKt.BitmaskLsb) ^ j3;
            for (long j5 = (-1) - (((-1) - ((~j4) & (j4 - ScatterMapKt.BitmaskLsb))) | ((-1) - (-9187201950435737472L))); j5 != 0; j5 &= j5 - 1) {
                int iNumberOfTrailingZeros = (-1) - (((-1) - ((Long.numberOfTrailingZeros(j5) >> 3) + i6)) | ((-1) - i4));
                if (this.keys[iNumberOfTrailingZeros] == j2) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((-1) - (((-1) - (j3 & ((~j3) << 6))) | ((-1) - (-9187201950435737472L))) != 0) {
                return -1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8 A[PHI: r4
  0x00b8: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0058, B:21:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, java.lang.CharSequence r27, int r28, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Integer, ? extends java.lang.CharSequence> r29) {
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
            long[] r9 = r2.keys
            int[] r8 = r2.values
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
            r16 = r9[r0]
            r0 = r8[r0]
            r15 = r28
            if (r4 != r15) goto L90
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
            java.lang.Long r15 = java.lang.Long.valueOf(r16)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongIntMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3 A[PHI: r4
  0x00b3: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0054, B:21:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, java.lang.CharSequence r27, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Integer, ? extends java.lang.CharSequence> r28) {
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
            r12 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r11 = "..."
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            long[] r9 = r2.keys
            int[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lba
            r5 = 0
            r4 = 0
        L3d:
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
            if (r0 == 0) goto Lb3
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L60:
            if (r14 >= r1) goto Laf
            r21 = 255(0xff, double:1.26E-321)
            r19 = -1
            long r17 = r19 - r2
            long r15 = r19 - r21
            long r17 = r17 | r15
            long r19 = r19 - r17
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r0 >= 0) goto La7
            int r0 = r5 << 3
            int r0 = r0 + r14
            r17 = r9[r0]
            r16 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L8b
            r10.append(r11)
        L81:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L8b:
            if (r4 == 0) goto L94
            r19 = r10
            r20 = r23
            r19.append(r20)
        L94:
            java.lang.Long r15 = java.lang.Long.valueOf(r17)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object r0 = r12.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        La7:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r24
            goto L60
        Laf:
            r0 = 8
            if (r1 != r0) goto Lba
        Lb3:
            if (r5 == r6) goto Lba
            int r5 = r5 + 1
            r0 = r24
            goto L3d
        Lba:
            r10.append(r13)
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongIntMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00af A[PHI: r4
  0x00af: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0050, B:21:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Integer, ? extends java.lang.CharSequence> r27) {
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
            long[] r9 = r2.keys
            int[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb6
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
            if (r0 == 0) goto Laf
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L5c:
            if (r14 >= r1) goto Lab
            r21 = 255(0xff, double:1.26E-321)
            r19 = -1
            long r17 = r19 - r2
            long r15 = r19 - r21
            long r17 = r17 | r15
            long r19 = r19 - r17
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r0 >= 0) goto La3
            int r0 = r5 << 3
            int r0 = r0 + r14
            r17 = r9[r0]
            r16 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L87
            r10.append(r11)
        L7d:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L87:
            if (r4 == 0) goto L90
            r19 = r10
            r20 = r23
            r19.append(r20)
        L90:
            java.lang.Long r15 = java.lang.Long.valueOf(r17)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        La3:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r24
            goto L5c
        Lab:
            r0 = 8
            if (r1 != r0) goto Lb6
        Laf:
            if (r5 == r6) goto Lb6
            int r5 = r5 + 1
            r0 = r24
            goto L39
        Lb6:
            r10.append(r12)
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongIntMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0 A[PHI: r4
  0x00a0: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0042, B:21:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r26, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Integer, ? extends java.lang.CharSequence> r27) {
        /*
            r25 = this;
            r2 = r25
            java.lang.String r1 = "separator"
            r24 = r26
            r0 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "transform"
            r13 = r27
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
            long[] r9 = r2.keys
            int[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La7
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
            if (r14 == 0) goto La0
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L4e:
            if (r1 >= r14) goto L9e
            r22 = 255(0xff, double:1.26E-321)
            r20 = -1
            long r18 = r20 - r2
            long r16 = r20 - r22
            long r18 = r18 | r16
            long r20 = r20 - r18
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 >= 0) goto L79
            int r0 = r5 << 3
            int r0 = r0 + r1
            r17 = r9[r0]
            r16 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L7a
            r10.append(r11)
        L6f:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L79:
            goto L98
        L7a:
            if (r4 == 0) goto L83
            r19 = r10
            r20 = r24
            r19.append(r20)
        L83:
            java.lang.Long r15 = java.lang.Long.valueOf(r17)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L98:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r25
            goto L4e
        L9e:
            if (r14 != r15) goto La7
        La0:
            if (r5 == r6) goto La7
            int r5 = r5 + 1
            r0 = r25
            goto L34
        La7:
            r10.append(r12)
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongIntMap.joinToString(java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[PHI: r4
  0x009e: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0042, B:21:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Integer, ? extends java.lang.CharSequence> r24) {
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
            long[] r9 = r2.keys
            int[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La5
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
            if (r0 == 0) goto L9e
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L4e:
            if (r1 >= r14) goto L9c
            r20 = 255(0xff, double:1.26E-321)
            long r18 = r2 + r20
            long r16 = r2 | r20
            long r18 = r18 - r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L75
            int r0 = r5 << 3
            int r0 = r0 + r1
            r17 = r9[r0]
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
            goto L96
        L76:
            if (r4 == 0) goto L7b
            r10.append(r13)
        L7b:
            java.lang.Long r15 = java.lang.Long.valueOf(r17)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r16 = r22
            r17 = r15
            r18 = r0
            java.lang.Object r0 = r16.invoke(r17, r18)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L96:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r23
            goto L4e
        L9c:
            if (r14 != r15) goto La5
        L9e:
            if (r5 == r6) goto La5
            int r5 = r5 + 1
            r0 = r23
            goto L30
        La5:
            r10.append(r12)
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongIntMap.joinToString(kotlin.jvm.functions.Function2):java.lang.String");
    }
}
