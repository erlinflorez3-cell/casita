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
/* JADX INFO: compiled from: FloatFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005'4\u0012\u0006\u0019nj?0LeVBZS0\u0013s{B-cҕyCQU\"}0\u000eWNmpvJh\u000bKƤ\u000e\u0016\u000fj4I[xe\u0012%2JoE8UoS9ht<\u0007(20D\u0002ڎ\t\u001a8S\u0018v\u0001HS\f(0H\u0081@\u0007#˟5\u001a@\u0005~%\u0007 ֔kNDH5\u0002HB;\u0003\u0018V~=mE\u0015_\u001dHd';\u000eq ;@eL%'c\u00035f\nUIӑwޮ\u0004ؒo+9a\fWdlH8#Cg\r\f\u0007Vr\u0013fx\u001e7-_cyg\u001e*\bz*$L\u0006\u001e\u0006U\\\\C`ǘ\u000eս2ο;bNi\u001a^p\u0014+eD1=\u007faB\u007fӜf\u001amI4f7*\u0019=\"1\u001b\u0007!\nkVl#7lw\u007fE\u0002DKef\n\bT6\b~\u0001\u001a*22\u0010$=\u001a).E'gqG89}\u0012JTg%\u001cpjci\u0001_P$~\u0016e>7\"!լj̆j¬\u001di:0e\u001c\u0003\u001b.\u000e!@tyR S\u000f\u0015яh2x[~\"%]hg]|\u0006&Wguy4\u001a&\u001e\u0004jvBbl\u0017\u0013|~rc\u001djkV9ĘLt\u0016\u001d\fJT2#4EwBN<B)kC_Ҵ\"LG\"\u0019e`\u000f \u0001Z9J y&\u0005\t/s\u000b\u00076Φ~Λ+ʉ)O;hi5GI\u0006AvX\u0015>\u0017\u0010\u0004\u000fui֙KVr;\u0006[\u0002F&\u001c?WUf#\u0011\u000f)`%[m\u0013ǫḵLȼo(\u000b$';\u0017Q\u0018'x\u0015D{z[_cE9Ցb|)-t\u0006\u007f\bV|Miz%k@Yr1|jv~ُ\u000bʍ\u001dݒI\u001d0(M-qJM5\u00068G0qny~\\\u0011ˏ\u00130z\u000b\u00142i<\u007fdWcXXHKi~lER\u0015IܰNݬv٤\u000b\u0018B9KHo{!ZFg#/,}MԴ\r9jig+o,K^c8\u000e[}Bus)\u001f{kg\u001c\u0005\u0014|\u0019y'\n9\u0013ar 6U \u0005n\u0013\u0013>4\f\u001eFCKb3S7TzɽB\u0082\n͏\u001do\u0014A\u0013\u007ftaU+zF\u0002mn\u000e\u0003\r%ZV8xE\u000f5r9\rCK\u001e'ja\u000bsFbe{2/\u000bM\u000f!j]7~%Y{\u0005?!(f:#E\fzy\b<\u0004Uc\u0006k\u001e\u000eh\u001e\u0003\u001dPS39\u007fH&{xU\u0019\n|N\u0013,BlXN0_\u0017z+El\u0010\u0015\u000b'\b\u000bo\u0011d|T}7QS\u0019\u0017r`7\u0012\u0003cTUE\u0006c/mOp\u001457oSi58V&)\u001219\rg\u001fv\u0019\f2Ɛ\u001a{\u001c\b\u0012\u000f\u0019v0\u00064P\u001b\r\u001a?\u0018E}\u0019ג\u0006\u001dd~{}'f7-r\fhhxz\u001ac\u001b\u001b\u001dkQӎlݫUҳ71^Z!'{B[^hx)SN\u000eW\u0014d+4 N\b\u0011+F˖\"֬Gգ[ܣ\u001117մ:c73`\u001eN5\by\u001c*\u0003*K͇\u0015צ\u0015Ļ\u0015ЁpH_Вnl.i\u0003\fy#\u000b\u0005`^?\u0015j\u000bޔ\"hG9\u001f&i\u0015\u0018v\u0015\r]IT+gĜ}\u05cd\u000eֺ\u0017Ã,|\u0019ܛJdz\u000b8BY\t\u000esD-tasԣeڒzݨp݁*QMЯR\n2\u001f\u001c\u0011\u007fiF/V\\H\u001eq\u0016ߥE\u001d)\u0003\u001bH\u0014wW/C{iSS47ε?\u008d\u0016ƙ=ˬ>y?\u008831\u0015\u0002)Wƣ:$t\u0590L,\u0014\u0005kڞ/{bȧ\u0013\""}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\na\u001e!C~nC\u0001!DAy+\r", "", "u(E", "-bP=T*Bb-", "", "5dc,V(IO\u0017\u0003\nrjz\u00136l\u007f&\u000bD\u000b UCx\u0017F\u0006!D]\b)E", "-rXGX", "5dc,f0SSW|\u0005e3|\u0007>i\n1:<\n !Vk\u001d@\u0001.C", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "9dh@", "", "5dc\u0018X@L\u0012\u0015\b\u0004h;x\u00183o\t6", ";dc.W(MO", "", "5dc\u001aX;:R\u0015\u000ev\u001d(\u0006\u00129t{7\u007fJ\n%", "Ahi2", "5dc \\A>", "D`[BX:", "5dc#T3NS'=vg5\u0007\u0018+t\u00042\u0005N", "/k[", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "/mh", "1n]AT0Ga", "9dh", "1n]AT0Ga~~\u000f", "1n]AT0Ga\nz\u0002n,", "D`[BX", "1nd;g", "3pd._:", "=sW2e", "4h]1>,R7\"}zq", "4na\u0012T*A", "", "0k^0^", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4na\u0012T*A7\"}zq,{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "7mS2k", "4na\u0012T*A9\u0019\u0013", "4na\u0012T*AD\u0015\u0006\u000b^", "5dc", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "2dU.h3MD\u0015\u0006\u000b^", "5dc\u001ce\fEa\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "6`b566=S", "7r4:c;R", "7r=<g\fF^(\u0013", "8nX;G6,b&\u0003\u0004`", "", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "BqP;f-H`!", "<n]2", "BnBAe0GU", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<W,?U\r\u0001>w\u0012=5?FA", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class FloatFloatMap {
    public int _capacity;
    public int _size;
    public float[] keys;
    public long[] metadata;
    public float[] values;

    public /* synthetic */ FloatFloatMap(DefaultConstructorMarker defaultConstructorMarker) {
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

    private FloatFloatMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = FloatSetKt.getEmptyFloatArray();
        this.values = FloatSetKt.getEmptyFloatArray();
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

    public final float get(float f2) {
        int iFindKeyIndex = findKeyIndex(f2);
        if (iFindKeyIndex < 0) {
            throw new NoSuchElementException("Cannot find value for key " + f2);
        }
        return this.values[iFindKeyIndex];
    }

    public final float getOrDefault(float f2, float f3) {
        int iFindKeyIndex = findKeyIndex(f2);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : f3;
    }

    public final float getOrElse(float f2, Function0<Float> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(f2);
        if (iFindKeyIndex < 0) {
            return defaultValue.invoke().floatValue();
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
            if ((-1) - (((-1) - (((~j2) << 7) & j2)) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
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

    public final void forEach(Function2<? super Float, ? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((-1) - (((-1) - ((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2)))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 + j2) - (255 | j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        block.invoke(Float.valueOf(fArr[i5]), Float.valueOf(fArr2[i5]));
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

    public final void forEachKey(Function1<? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.keys;
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
                    if ((255 & j2) < 128) {
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

    public final void forEachValue(Function1<? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.values;
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
        return getSize();
    }

    public final boolean contains(float f2) {
        return findKeyIndex(f2) >= 0;
    }

    public final boolean containsKey(float f2) {
        return findKeyIndex(f2) >= 0;
    }

    public static /* synthetic */ String joinToString$default(FloatFloatMap floatFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
        }
        if ((i3 + 2) - (2 | i3) != 0) {
        }
        if ((i3 + 4) - (4 | i3) != 0) {
        }
        if ((i3 + 8) - (8 | i3) != 0) {
            i2 = -1;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
        }
        return floatFloatMap.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab A[PHI: r4
  0x00ab: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0054, B:22:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r23, java.lang.CharSequence r24, java.lang.CharSequence r25, int r26, java.lang.CharSequence r27) {
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
            r12 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "truncated"
            r11 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            float[] r9 = r2.keys
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb2
            r5 = 0
            r4 = 0
        L39:
            r2 = r7[r5]
            long r0 = ~r2
            r13 = 7
            long r0 = r0 << r13
            r17 = -1
            long r13 = r17 - r0
            long r0 = r17 - r2
            long r13 = r13 | r0
            long r17 = r17 - r13
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r17 + r15
            long r17 = r17 | r15
            long r13 = r13 - r17
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto La8
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r1 = 8
            int r14 = 8 - r0
            r13 = 0
        L60:
            if (r13 >= r14) goto La9
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L89
            int r0 = r5 << 3
            int r0 = r0 + r13
            r15 = r9[r0]
            r1 = r8[r0]
            r0 = r26
            r0 = r0
            if (r4 != r0) goto L8a
            r10.append(r11)
        L7f:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L89:
            goto La2
        L8a:
            if (r4 == 0) goto L93
            r16 = r10
            r17 = r21
            r16.append(r17)
        L93:
            r10.append(r15)
            r0 = 61
            r10.append(r0)
            r10.append(r1)
            int r4 = r4 + 1
            r1 = 8
        La2:
            long r2 = r2 >> r1
            int r13 = r13 + 1
            r0 = r22
            goto L60
        La8:
            goto Lab
        La9:
            if (r14 != r1) goto Lb2
        Lab:
            if (r5 == r6) goto Lb2
            int r5 = r5 + 1
            r0 = r22
            goto L39
        Lb2:
            r10.append(r12)
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2 A[PHI: r4
  0x00e2: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:23:0x008a, B:39:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.FloatFloatMap r15, java.lang.CharSequence r16, java.lang.CharSequence r17, java.lang.CharSequence r18, int r19, java.lang.CharSequence r20, kotlin.jvm.functions.Function2 r21, int r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.joinToString$default(androidx.collection.FloatFloatMap, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2, int, java.lang.Object):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac A[PHI: r4
  0x00ac: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0054, B:21:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r21, java.lang.CharSequence r22, java.lang.CharSequence r23, int r24, java.lang.CharSequence r25, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, ? extends java.lang.CharSequence> r26) {
        /*
            r20 = this;
            r2 = r20
            java.lang.String r1 = "separator"
            r19 = r21
            r0 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "prefix"
            r1 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "postfix"
            r13 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "truncated"
            r12 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "transform"
            r11 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            float[] r9 = r2.keys
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb3
            r5 = 0
            r4 = 0
        L41:
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
            if (r0 == 0) goto Lac
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L60:
            if (r14 >= r1) goto La8
            r15 = 255(0xff, double:1.26E-321)
            long r17 = r2 & r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto La0
            int r0 = r5 << 3
            int r0 = r0 + r14
            r16 = r9[r0]
            r0 = r8[r0]
            r15 = r24
            if (r4 != r15) goto L84
            r10.append(r12)
        L7a:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L84:
            if (r4 == 0) goto L8d
            r17 = r10
            r18 = r19
            r17.append(r18)
        L8d:
            java.lang.Float r15 = java.lang.Float.valueOf(r16)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r11.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        La0:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r20
            goto L60
        La8:
            r0 = 8
            if (r1 != r0) goto Lb3
        Lac:
            if (r5 == r6) goto Lb3
            int r5 = r5 + 1
            r0 = r20
            goto L41
        Lb3:
            r10.append(r13)
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
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
            boolean r0 = r10 instanceof androidx.collection.FloatFloatMap
            r17 = 0
            if (r0 != 0) goto L10
            return r17
        L10:
            androidx.collection.FloatFloatMap r10 = (androidx.collection.FloatFloatMap) r10
            int r1 = r10.getSize()
            int r0 = r19.getSize()
            if (r1 == r0) goto L1d
            return r17
        L1d:
            float[] r9 = r2.keys
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L78
            r5 = r17
        L2a:
            r2 = r7[r5]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r15 = r0 + r2
            long r0 = r0 | r2
            long r15 = r15 - r0
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r15 + r13
            long r15 = r15 | r13
            long r11 = r11 - r15
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L72
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = r17
        L4b:
            if (r4 >= r11) goto L70
            r0 = 255(0xff, double:1.26E-321)
            r15 = -1
            long r13 = r15 - r0
            long r0 = r15 - r2
            long r13 = r13 | r0
            long r15 = r15 - r13
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L6c
            int r1 = r5 << 3
            int r1 = r1 + r4
            r0 = r9[r1]
            r1 = r8[r1]
            float r0 = r10.get(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L77
        L6c:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L4b
        L70:
            if (r11 != r12) goto L78
        L72:
            if (r5 == r6) goto L78
            int r5 = r5 + 1
            goto L2a
        L77:
            return r17
        L78:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074 A[PHI: r4
  0x0074: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:10:0x0035, B:19:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r19 = this;
            r11 = r19
            boolean r0 = r19.isEmpty()
            if (r0 == 0) goto Lc
            java.lang.String r0 = "{}"
            return r0
        Lc:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "{"
            r10.<init>(r0)
            float[] r9 = r11.keys
            float[] r8 = r11.values
            long[] r7 = r11.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L79
            r18 = 0
            r5 = r18
            r4 = r5
        L24:
            r2 = r7[r5]
            long r0 = ~r2
            r12 = 7
            long r0 = r0 << r12
            long r14 = r0 + r2
            long r0 = r0 | r2
            long r14 = r14 - r0
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r12
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 == 0) goto L74
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r1 = r18
        L42:
            if (r1 >= r12) goto L72
            r14 = 255(0xff, double:1.26E-321)
            long r16 = r14 + r2
            long r14 = r14 | r2
            long r16 = r16 - r14
            r14 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L6e
            int r14 = r5 << 3
            int r14 = r14 + r1
            r0 = r9[r14]
            r14 = r8[r14]
            r10.append(r0)
            java.lang.String r0 = "="
            r10.append(r0)
            r10.append(r14)
            int r4 = r4 + 1
            int r0 = r11._size
            if (r4 >= r0) goto L6e
            java.lang.String r0 = ", "
            r10.append(r0)
        L6e:
            long r2 = r2 >> r13
            int r1 = r1 + 1
            goto L42
        L72:
            if (r12 != r13) goto L79
        L74:
            if (r5 == r6) goto L79
            int r5 = r5 + 1
            goto L24
        L79:
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r10.append(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "s.append('}').toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.toString():java.lang.String");
    }

    public final boolean all(Function2<? super Float, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            long j3 = (~j2) << 7;
            if ((-1) - (((-1) - ((j3 + j2) - (j3 | j2))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (!predicate.invoke(Float.valueOf(fArr[i5]), Float.valueOf(fArr2[i5])).booleanValue()) {
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, java.lang.Boolean> r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "predicate"
            r10 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            float[] r9 = r1.keys
            float[] r8 = r1.values
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            r17 = 0
            if (r6 < 0) goto L6a
            r5 = r17
        L19:
            r2 = r7[r5]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 == 0) goto L65
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = r17
        L34:
            if (r4 >= r11) goto L63
            r0 = 255(0xff, double:1.26E-321)
            long r15 = r0 + r2
            long r0 = r0 | r2
            long r15 = r15 - r0
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L5f
            int r0 = r5 << 3
            int r0 = r0 + r4
            r1 = r9[r0]
            r0 = r8[r0]
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r10.invoke(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5f
            r0 = 1
            return r0
        L5f:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L34
        L63:
            if (r11 != r12) goto L6a
        L65:
            if (r5 == r6) goto L6a
            int r5 = r5 + 1
            goto L19
        L6a:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.any(kotlin.jvm.functions.Function2):boolean");
    }

    public final int count(Function2<? super Float, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
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
                        if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                            int i7 = (i3 << 3) + i6;
                            if (predicate.invoke(Float.valueOf(fArr[i7]), Float.valueOf(fArr2[i7])).booleanValue()) {
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsValue(float r16) {
        /*
            r15 = this;
            float[] r8 = r15.values
            long[] r7 = r15.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            r14 = 0
            if (r6 < 0) goto L4d
            r5 = r14
        Lb:
            r1 = r7[r5]
            long r3 = ~r1
            r0 = 7
            long r3 = r3 << r0
            r11 = -1
            long r9 = r11 - r3
            long r3 = r11 - r1
            long r9 = r9 | r3
            long r11 = r11 - r9
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r3
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 == 0) goto L48
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r9 = 8
            int r4 = 8 - r0
            r3 = r14
        L2c:
            if (r3 >= r4) goto L46
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r1
            r10 = 128(0x80, double:6.3E-322)
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 >= 0) goto L42
            int r0 = r5 << 3
            int r0 = r0 + r3
            r0 = r8[r0]
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 != 0) goto L42
            r0 = 1
            return r0
        L42:
            long r1 = r1 >> r9
            int r3 = r3 + 1
            goto L2c
        L46:
            if (r4 != r9) goto L4d
        L48:
            if (r5 == r6) goto L4d
            int r5 = r5 + 1
            goto Lb
        L4d:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.containsValue(float):boolean");
    }

    public int hashCode() {
        float[] fArr = this.keys;
        float[] fArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int iHashCode = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2))) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                            int i6 = (i3 << 3) + i5;
                            float f2 = fArr[i6];
                            iHashCode += Float.hashCode(fArr2[i6]) ^ Float.hashCode(f2);
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

    public final int findKeyIndex(float f2) {
        int iHashCode = Float.hashCode(f2) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = (-1) - (((-1) - (i2 >>> 7)) | ((-1) - i4));
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = jArr[i7] >>> i8;
            long j3 = jArr[i7 + 1] << (64 - i8);
            long j4 = (-i8) >> 63;
            long j5 = ((j3 + j4) - (j3 | j4)) | j2;
            long j6 = (((long) i3) * ScatterMapKt.BitmaskLsb) ^ j5;
            for (long j7 = ((-1) - (((-1) - (~j6)) | ((-1) - (j6 - ScatterMapKt.BitmaskLsb)))) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i5) & i4;
                if (this.keys[iNumberOfTrailingZeros] == f2) {
                    return iNumberOfTrailingZeros;
                }
            }
            long j8 = (-1) - (((-1) - j5) | ((-1) - ((~j5) << 6)));
            if ((j8 - 9187201950435737472L) - (j8 | (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (-1) - (((-1) - (i5 + i6)) | ((-1) - i4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3 A[PHI: r4
  0x00a3: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x004b, B:21:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r21, java.lang.CharSequence r22, java.lang.CharSequence r23, int r24, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, ? extends java.lang.CharSequence> r25) {
        /*
            r20 = this;
            r2 = r20
            java.lang.String r1 = "separator"
            r19 = r21
            r0 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "prefix"
            r1 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "postfix"
            r13 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "transform"
            r12 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r11 = "..."
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            float[] r9 = r2.keys
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Laa
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
            if (r14 == 0) goto La3
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L57:
            if (r14 >= r1) goto L9f
            r15 = 255(0xff, double:1.26E-321)
            long r17 = r2 & r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L97
            int r0 = r5 << 3
            int r0 = r0 + r14
            r16 = r9[r0]
            r0 = r8[r0]
            r15 = r24
            if (r4 != r15) goto L7b
            r10.append(r11)
        L71:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L7b:
            if (r4 == 0) goto L84
            r17 = r10
            r18 = r19
            r17.append(r18)
        L84:
            java.lang.Float r15 = java.lang.Float.valueOf(r16)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r12.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        L97:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r20
            goto L57
        L9f:
            r0 = 8
            if (r1 != r0) goto Laa
        La3:
            if (r5 == r6) goto Laa
            int r5 = r5 + 1
            r0 = r20
            goto L3d
        Laa:
            r10.append(r13)
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae A[PHI: r4
  0x00ae: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x004f, B:21:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, java.lang.CharSequence r27, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, ? extends java.lang.CharSequence> r28) {
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
            float[] r9 = r2.keys
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb5
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
            if (r0 == 0) goto Lae
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L5b:
            if (r14 >= r1) goto Laa
            r21 = 255(0xff, double:1.26E-321)
            r19 = -1
            long r17 = r19 - r2
            long r15 = r19 - r21
            long r17 = r17 | r15
            long r19 = r19 - r17
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r0 >= 0) goto La2
            int r0 = r5 << 3
            int r0 = r0 + r14
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L86
            r10.append(r11)
        L7c:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L86:
            if (r4 == 0) goto L8f
            r17 = r10
            r18 = r23
            r17.append(r18)
        L8f:
            java.lang.Float r15 = java.lang.Float.valueOf(r15)
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r12.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        La2:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r24
            goto L5b
        Laa:
            r0 = 8
            if (r1 != r0) goto Lb5
        Lae:
            if (r5 == r6) goto Lb5
            int r5 = r5 + 1
            r0 = r24
            goto L3d
        Lb5:
            r10.append(r13)
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[PHI: r4
  0x009e: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0047, B:21:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r21, java.lang.CharSequence r22, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, ? extends java.lang.CharSequence> r23) {
        /*
            r20 = this;
            r2 = r20
            java.lang.String r1 = "separator"
            r19 = r21
            r0 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "prefix"
            r1 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "transform"
            r13 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r12 = ""
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            java.lang.String r11 = "..."
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            float[] r9 = r2.keys
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La5
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
            if (r14 == 0) goto L9e
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L53:
            if (r14 >= r1) goto L9a
            r15 = 255(0xff, double:1.26E-321)
            long r17 = r2 & r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L92
            int r0 = r5 << 3
            int r0 = r0 + r14
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L76
            r10.append(r11)
        L6c:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L76:
            if (r4 == 0) goto L7f
            r17 = r10
            r18 = r19
            r17.append(r18)
        L7f:
            java.lang.Float r15 = java.lang.Float.valueOf(r15)
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        L92:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r20
            goto L53
        L9a:
            r0 = 8
            if (r1 != r0) goto La5
        L9e:
            if (r5 == r6) goto La5
            int r5 = r5 + 1
            r0 = r20
            goto L39
        La5:
            r10.append(r12)
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0 A[PHI: r4
  0x00a0: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0046, B:21:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r24, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, ? extends java.lang.CharSequence> r25) {
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
            float[] r9 = r2.keys
            float[] r8 = r2.values
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
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r0 + r16
            long r0 = r0 | r16
            long r14 = r14 - r0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto La0
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L52:
            if (r1 >= r14) goto L9e
            r20 = 255(0xff, double:1.26E-321)
            long r18 = r2 + r20
            long r16 = r2 | r20
            long r18 = r18 - r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L79
            int r0 = r5 << 3
            int r0 = r0 + r1
            r15 = r9[r0]
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
            r17 = r10
            r18 = r22
            r17.append(r18)
        L83:
            java.lang.Float r15 = java.lang.Float.valueOf(r15)
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L98:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r23
            goto L52
        L9e:
            if (r14 != r15) goto La7
        La0:
            if (r5 == r6) goto La7
            int r5 = r5 + 1
            r0 = r23
            goto L34
        La7:
            r10.append(r12)
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.joinToString(java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7 A[PHI: r4
  0x00a7: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0047, B:21:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, ? extends java.lang.CharSequence> r26) {
        /*
            r25 = this;
            r2 = r25
            java.lang.String r1 = "transform"
            r24 = r26
            r0 = r24
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
            float[] r9 = r2.keys
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lae
            r5 = 0
            r4 = 0
        L30:
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
            if (r0 == 0) goto La7
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L53:
            if (r1 >= r14) goto La5
            r22 = 255(0xff, double:1.26E-321)
            r20 = -1
            long r18 = r20 - r2
            long r16 = r20 - r22
            long r18 = r18 | r16
            long r20 = r20 - r18
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 >= 0) goto L7e
            int r0 = r5 << 3
            int r0 = r0 + r1
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L7f
            r10.append(r11)
        L74:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L7e:
            goto L9f
        L7f:
            if (r4 == 0) goto L84
            r10.append(r13)
        L84:
            java.lang.Float r15 = java.lang.Float.valueOf(r15)
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            r16 = r24
            r17 = r15
            r18 = r0
            java.lang.Object r0 = r16.invoke(r17, r18)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L9f:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r25
            goto L53
        La5:
            if (r14 != r15) goto Lae
        La7:
            if (r5 == r6) goto Lae
            int r5 = r5 + 1
            r0 = r25
            goto L30
        Lae:
            r10.append(r12)
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatFloatMap.joinToString(kotlin.jvm.functions.Function2):java.lang.String");
    }
}
