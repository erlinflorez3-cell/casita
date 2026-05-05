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
/* JADX INFO: compiled from: IntIntMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005'4\u0012\u0006\u001anj?0LeVBZS0\u0013s{B-cҕyCQU\"}(\u0012WNugvϺb\u000bY\u000f\u000e\u0016~j4Ikxe\u0012\u00157JoU3UoC;htD\u0011(݅*8\b\u0010\t\u001a0M\u0018v\u0011CSÈ\u0018dV\u0081jR;LE\u001f\u0018\b̧$\u0001,\\0rD[\u0005]hCS\u0019wWf9o2\rM;Hd)\u001dv\u0010 ;BG5C9\u0002\u0019MѿaУ\u0002ӊ:A\u0013\u007f?'Y]<{Do\u0018\u0014C?\u007f#k\b>n\u0015Sp\fU-_e[P<*\b|\f\rj\u0018<\u001cmΥ4ȟ\u0019ǑP\u001dA\r\u000bSnd2bP\u0019\u0013ad\u0019kĵ3sE)\u0001iai-~;\n\u001e%\u001eQ\u00037-io&`C/\u0005{_Mi@kJ\u0017\u000egZ\u0006\u0004\u001fdJN\u0012M_\u007f]}AD%:OmI%1k0JTi\u0007\u0005\u000fjckbHn6\u001d,}Ѯ\u000fʪYե-\u0016ynlXZ%}\"b&\u0016\n)\u001f\u000bv\u0003ư%X\\]\t\u0002j{_:)=\u007fOY\u001dmTV\u0002!AVic>\u0004\u0003+\"bT\u0013\u0015ivQ\u0002\u000eȺ`2(VXp\u0016\u001d\fFT\u00129KO\u0003,CZ3Ǭ`\u001fN'.HG\"\u0019a`n6\u001bd54\u0003\u0018F#\u001fGˍb̒nΟAv:#x\"[c\u0002T'Im=xE\r25\u0001\u0381\u0004QmpWRr;\u0006W\u0002&<BIS?=A1-PxĊ3ןKǩ.~[;?z+\u001c?ZvQ\u007f#z\u0002<o\u0019LׅX!(\u001bnx)-t\u0002\u007fgl\u0014Wed\u000b\n`w\u001aIʢBӷ7وML,O\u0019oP\u001feLQJ51\b%?$\u0010_ɳs8\u007f\u0007\u001f,z\u000b\u0014.i\u001c\u0016~a_B;fk\b&\u0005д*Ґ\u0002ܩ\u0011y\u00063Z\tb\u000fcLO}\tVfOQɇ}/\u001b:9\tV\n<Cs\fMF_Xus\u0002\"\f[%?O\u001c\b{\u001cc\\9L?\u000e\u0019\u0015In@\u001em*d\u0005z\u000f@\b\u0004\u0018dCi\u0012K¼\u000fՐ3ɶ\u0005\u000e\u0019sli4\u0012A\u0014\u000fc\u001dHJB\"O\u001f\u0012b+tVv\u0019)}nTB\u0001-Cc$~5?:\u0006F\u0003e\u00148\u0007S+@3j}5\u0017+1Dbq3(\u00077;KcCW;N\u0004u+\u001equ\fFR\u0015\u001dpNa>\u001a\bm*H^9\n\u0015Tjv \u001cjNP_/\u0001\u0003\u000eJA'\u000bG\u0006#uh-Z\u0007\u00107qP1\u001dJ)\u0015E\u0015ct\u001d]\f;-K\u0004\u0003\u0014U2\b\nA\u007f\u0016[8W\u0014\u00061k\u0006\u0010ҁ\u000eg!^&w\u001c\b\u0012\u000b\u0019VF\u001d>[\u0005\u000280ĝ:Y\bW\u0012\u0019d~{y'FMG|\bRK\u0017/8y3̡tТ\nӆ/5d6\u0007-~1Q-[k+X\tnWgpn\u001f\u0001,\u0015T!lʊ!Ϫf˘o\u05cftqW܀\u001d-5n8a\u0002F`\"\u0016\u001f(w:՞\u0013ӏk͉b؉Bj\u0011Ϟ|D]\u0013ljxs\u0003\u0012A\u0014+\u0001~#ǚ\u00178^t$k=?i5i\u0016_`5\u000e{Òdϳ\bĞKװ;8\u0013 8x\u0017\u000eHbE\u00168N!r.tbߠ\u0005§\u0014ԥ3ڵ(slܞ6MKFP\b| \u001c GZf\"t!ӭ ?i5G)\u001f\teN\u0014\u0001\u001f\u0019ct\bƚcܹWη\r°C\u007f9ˉJu=\u00051/ݬn\u001a\u0016ƣ;*=hRۘ<0dڭ\u0003\r"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &+x\u001d$r0\u000b", "", "u(E", "-bP=T*Bb-", "", "5dc,V(IO\u0017\u0003\nrjz\u00136l\u007f&\u000bD\u000b UCx\u0017F\u0006!D]\b)E", "-rXGX", "5dc,f0SSW|\u0005e3|\u0007>i\n1:<\n !Vk\u001d@\u0001.C", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "9dh@", "", "5dc\u0018X@L\u0012\u0015\b\u0004h;x\u00183o\t6", ";dc.W(MO", "", "5dc\u001aX;:R\u0015\u000ev\u001d(\u0006\u00129t{7\u007fJ\n%", "Ahi2", "5dc \\A>", "D`[BX:", "5dc#T3NS'=vg5\u0007\u0018+t\u00042\u0005N", "/k[", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "/mh", "1n]AT0Ga", "9dh", "1n]AT0Ga~~\u000f", "1n]AT0Ga\nz\u0002n,", "D`[BX", "1nd;g", "3pd._:", "=sW2e", "4h]1>,R7\"}zq", "4na\u0012T*A", "", "0k^0^", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4na\u0012T*A7\"}zq,{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "7mS2k", "4na\u0012T*A9\u0019\u0013", "4na\u0012T*AD\u0015\u0006\u000b^", "5dc", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "2dU.h3MD\u0015\u0006\u000b^", "5dc\u001ce\fEa\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "6`b566=S", "7r4:c;R", "7r=<g\fF^(\u0013", "8nX;G6,b&\u0003\u0004`", "", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "BqP;f-H`!", "<n]2", "BnBAe0GU", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.D=\u0007/\u001fi!\u0004", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class IntIntMap {
    public int _capacity;
    public int _size;
    public int[] keys;
    public long[] metadata;
    public int[] values;

    public /* synthetic */ IntIntMap(DefaultConstructorMarker defaultConstructorMarker) {
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

    private IntIntMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = IntSetKt.getEmptyIntArray();
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

    public final int get(int i2) {
        int iFindKeyIndex = findKeyIndex(i2);
        if (iFindKeyIndex < 0) {
            throw new NoSuchElementException("Cannot find value for key " + i2);
        }
        return this.values[iFindKeyIndex];
    }

    public final int getOrDefault(int i2, int i3) {
        int iFindKeyIndex = findKeyIndex(i2);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : i3;
    }

    public final int getOrElse(int i2, Function0<Integer> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(i2);
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
            if ((((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2))) & (-9187201950435737472L)) != -9187201950435737472L) {
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

    public final void forEach(Function2<? super Integer, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
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
                    if ((255 + j2) - (255 | j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        block.invoke(Integer.valueOf(iArr[i5]), Integer.valueOf(iArr2[i5]));
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
            long j4 = (j3 + j2) - (j3 | j2);
            if ((j4 - 9187201950435737472L) - (j4 | (-9187201950435737472L)) != -9187201950435737472L) {
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
            long j3 = ((~j2) << 7) & j2;
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
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
        return getSize();
    }

    public final boolean contains(int i2) {
        return findKeyIndex(i2) >= 0;
    }

    public final boolean containsKey(int i2) {
        return findKeyIndex(i2) >= 0;
    }

    public static /* synthetic */ String joinToString$default(IntIntMap intIntMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i3 + 1) - (1 | i3) != 0) {
        }
        if ((i3 + 2) - (2 | i3) != 0) {
        }
        if ((4 & i3) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            i2 = -1;
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
        }
        return intIntMap.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1 A[PHI: r4
  0x00a1: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x004a, B:22:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
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
            int[] r9 = r2.keys
            int[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La8
            r5 = 0
            r4 = 0
        L39:
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
            if (r0 == 0) goto L9e
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r1 = 8
            int r14 = 8 - r0
            r13 = 0
        L56:
            if (r13 >= r14) goto L9f
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L7f
            int r0 = r5 << 3
            int r0 = r0 + r13
            r15 = r9[r0]
            r1 = r8[r0]
            r0 = r26
            r0 = r0
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
            r16 = r10
            r17 = r21
            r16.append(r17)
        L89:
            r10.append(r15)
            r0 = 61
            r10.append(r0)
            r10.append(r1)
            int r4 = r4 + 1
            r1 = 8
        L98:
            long r2 = r2 >> r1
            int r13 = r13 + 1
            r0 = r22
            goto L56
        L9e:
            goto La1
        L9f:
            if (r14 != r1) goto La8
        La1:
            if (r5 == r6) goto La8
            int r5 = r5 + 1
            r0 = r22
            goto L39
        La8:
            r10.append(r12)
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntIntMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0 A[PHI: r4
  0x00e0: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:23:0x0088, B:39:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.IntIntMap r15, java.lang.CharSequence r16, java.lang.CharSequence r17, java.lang.CharSequence r18, int r19, java.lang.CharSequence r20, kotlin.jvm.functions.Function2 r21, int r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntIntMap.joinToString$default(androidx.collection.IntIntMap, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2, int, java.lang.Object):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3 A[PHI: r4
  0x00b3: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0057, B:21:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r23, java.lang.CharSequence r24, java.lang.CharSequence r25, int r26, java.lang.CharSequence r27, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, ? extends java.lang.CharSequence> r28) {
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
            int[] r9 = r2.keys
            int[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lba
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
            if (r0 == 0) goto Lb3
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L63:
            if (r14 >= r1) goto Laf
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto La7
            int r0 = r5 << 3
            int r0 = r0 + r14
            r16 = r9[r0]
            r0 = r8[r0]
            r15 = r26
            if (r4 != r15) goto L8b
            r10.append(r12)
        L81:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L8b:
            if (r4 == 0) goto L94
            r17 = r10
            r18 = r21
            r17.append(r18)
        L94:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r16)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r11.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        La7:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r22
            goto L63
        Laf:
            r0 = 8
            if (r1 != r0) goto Lba
        Lb3:
            if (r5 == r6) goto Lba
            int r5 = r5 + 1
            r0 = r22
            goto L41
        Lba:
            r10.append(r13)
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntIntMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r22) {
        /*
            r21 = this;
            r10 = r22
            r2 = r21
            r20 = 1
            if (r10 != r2) goto L9
            return r20
        L9:
            boolean r0 = r10 instanceof androidx.collection.IntIntMap
            r19 = 0
            if (r0 != 0) goto L10
            return r19
        L10:
            androidx.collection.IntIntMap r10 = (androidx.collection.IntIntMap) r10
            int r1 = r10.getSize()
            int r0 = r21.getSize()
            if (r1 == r0) goto L1d
            return r19
        L1d:
            int[] r9 = r2.keys
            int[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L7b
            r5 = r19
        L2a:
            r2 = r7[r5]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r17 = r0 + r2
            long r0 = r0 | r2
            long r17 = r17 - r0
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = -1
            long r11 = r13 - r17
            long r0 = r13 - r15
            long r11 = r11 | r0
            long r13 = r13 - r11
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L76
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = r19
        L50:
            if (r4 >= r11) goto L74
            r0 = 255(0xff, double:1.26E-321)
            r15 = -1
            long r13 = r15 - r0
            long r0 = r15 - r2
            long r13 = r13 | r0
            long r15 = r15 - r13
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L70
            int r1 = r5 << 3
            int r1 = r1 + r4
            r0 = r9[r1]
            r1 = r8[r1]
            int r0 = r10.get(r0)
            if (r1 == r0) goto L70
            return r19
        L70:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L50
        L74:
            if (r11 != r12) goto L7b
        L76:
            if (r5 == r6) goto L7b
            int r5 = r5 + 1
            goto L2a
        L7b:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntIntMap.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[PHI: r4
  0x0075: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:10:0x0039, B:19:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
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
            int[] r9 = r11.keys
            int[] r8 = r11.values
            long[] r7 = r11.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L7a
            r18 = 0
            r5 = r18
            r4 = r5
        L24:
            r2 = r7[r5]
            long r0 = ~r2
            r12 = 7
            long r0 = r0 << r12
            r14 = -1
            long r12 = r14 - r0
            long r0 = r14 - r2
            long r12 = r12 | r0
            long r14 = r14 - r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r12
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 == 0) goto L75
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r1 = r18
        L46:
            if (r1 >= r12) goto L73
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r2
            r14 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L6f
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
            if (r4 >= r0) goto L6f
            java.lang.String r0 = ", "
            r10.append(r0)
        L6f:
            long r2 = r2 >> r13
            int r1 = r1 + 1
            goto L46
        L73:
            if (r12 != r13) goto L7a
        L75:
            if (r5 == r6) goto L7a
            int r5 = r5 + 1
            goto L24
        L7a:
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r10.append(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "s.append('}').toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntIntMap.toString():java.lang.String");
    }

    public final boolean all(Function2<? super Integer, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
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
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (!predicate.invoke(Integer.valueOf(iArr[i5]), Integer.valueOf(iArr2[i5])).booleanValue()) {
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, java.lang.Boolean> r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "predicate"
            r10 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int[] r9 = r1.keys
            int[] r8 = r1.values
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            r17 = 0
            if (r6 < 0) goto L6d
            r5 = r17
        L19:
            r2 = r7[r5]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r13 = r0 + r2
            long r0 = r0 | r2
            long r13 = r13 - r0
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r11
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 == 0) goto L68
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = r17
        L37:
            if (r4 >= r11) goto L66
            r0 = 255(0xff, double:1.26E-321)
            long r15 = r0 + r2
            long r0 = r0 | r2
            long r15 = r15 - r0
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L62
            int r0 = r5 << 3
            int r0 = r0 + r4
            r1 = r9[r0]
            r0 = r8[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r10.invoke(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L62
            r0 = 1
            return r0
        L62:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L37
        L66:
            if (r11 != r12) goto L6d
        L68:
            if (r5 == r6) goto L6d
            int r5 = r5 + 1
            goto L19
        L6d:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntIntMap.any(kotlin.jvm.functions.Function2):boolean");
    }

    public final int count(Function2<? super Integer, ? super Integer, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j2 = jArr[i3];
                long j3 = (~j2) << 7;
                if ((((j3 + j2) - (j3 | j2)) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            if (predicate.invoke(Integer.valueOf(iArr[i7]), Integer.valueOf(iArr2[i7])).booleanValue()) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntIntMap.containsValue(int):boolean");
    }

    public int hashCode() {
        int[] iArr = this.keys;
        int[] iArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int iHashCode = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128) {
                            int i6 = (i3 << 3) + i5;
                            int i7 = iArr[i6];
                            iHashCode += Integer.hashCode(iArr2[i6]) ^ Integer.hashCode(i7);
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
        int i4 = (-1) - (((-1) - i3) | ((-1) - 127));
        int i5 = this._capacity;
        int i6 = (-1) - (((-1) - (i3 >>> 7)) | ((-1) - i5));
        int i7 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j2 = jArr[i8] >>> i9;
            long j3 = jArr[i8 + 1] << (64 - i9);
            long j4 = (-i9) >> 63;
            long j5 = (-1) - (((-1) - ((j3 + j4) - (j3 | j4))) & ((-1) - j2));
            long j6 = (((long) i4) * ScatterMapKt.BitmaskLsb) ^ j5;
            long j7 = (~j6) & (j6 - ScatterMapKt.BitmaskLsb);
            long j8 = (j7 - 9187201950435737472L) - (j7 | (-9187201950435737472L));
            while (j8 != 0) {
                int iNumberOfTrailingZeros = (-1) - (((-1) - ((Long.numberOfTrailingZeros(j8) >> 3) + i6)) | ((-1) - i5));
                if (this.keys[iNumberOfTrailingZeros] == i2) {
                    return iNumberOfTrailingZeros;
                }
                long j9 = j8 - 1;
                j8 = (j8 + j9) - (j8 | j9);
            }
            long j10 = (~j5) << 6;
            long j11 = (j5 + j10) - (j5 | j10);
            if ((j11 - 9187201950435737472L) - (j11 | (-9187201950435737472L)) != 0) {
                return -1;
            }
            i7 += 8;
            i6 = (-1) - (((-1) - (i6 + i7)) | ((-1) - i5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7 A[PHI: r4
  0x00b7: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x005b, B:21:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r24, java.lang.CharSequence r25, java.lang.CharSequence r26, int r27, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, ? extends java.lang.CharSequence> r28) {
        /*
            r23 = this;
            r2 = r23
            java.lang.String r1 = "separator"
            r22 = r24
            r0 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "prefix"
            r1 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "postfix"
            r13 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "transform"
            r12 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r11 = "..."
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            int[] r9 = r2.keys
            int[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lbe
            r5 = 0
            r4 = 0
        L3d:
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
            if (r0 == 0) goto Lb7
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L67:
            if (r14 >= r1) goto Lb3
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto Lab
            int r0 = r5 << 3
            int r0 = r0 + r14
            r16 = r9[r0]
            r0 = r8[r0]
            r15 = r27
            if (r4 != r15) goto L8f
            r10.append(r11)
        L85:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L8f:
            if (r4 == 0) goto L98
            r17 = r10
            r18 = r22
            r17.append(r18)
        L98:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r16)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r12.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        Lab:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r23
            goto L67
        Lb3:
            r0 = 8
            if (r1 != r0) goto Lbe
        Lb7:
            if (r5 == r6) goto Lbe
            int r5 = r5 + 1
            r0 = r23
            goto L3d
        Lbe:
            r10.append(r13)
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntIntMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3 A[PHI: r4
  0x00b3: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0054, B:21:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, java.lang.CharSequence r27, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, ? extends java.lang.CharSequence> r28) {
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
            int[] r9 = r2.keys
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
            r16 = -1
            long r14 = r16 - r0
            long r0 = r16 - r2
            long r14 = r14 | r0
            long r16 = r16 - r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r16 = r16 & r14
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
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
            r15 = r9[r0]
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
            r17 = r10
            r18 = r23
            r17.append(r18)
        L94:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntIntMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab A[PHI: r4
  0x00ab: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x004c, B:21:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, ? extends java.lang.CharSequence> r27) {
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
            int[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb2
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
            if (r0 == 0) goto Lab
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L58:
            if (r14 >= r1) goto La7
            r21 = 255(0xff, double:1.26E-321)
            r19 = -1
            long r17 = r19 - r2
            long r15 = r19 - r21
            long r17 = r17 | r15
            long r19 = r19 - r17
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r0 >= 0) goto L9f
            int r0 = r5 << 3
            int r0 = r0 + r14
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L83
            r10.append(r11)
        L79:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L83:
            if (r4 == 0) goto L8c
            r17 = r10
            r18 = r23
            r17.append(r18)
        L8c:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        L9f:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r24
            goto L58
        La7:
            r0 = 8
            if (r1 != r0) goto Lb2
        Lab:
            if (r5 == r6) goto Lb2
            int r5 = r5 + 1
            r0 = r24
            goto L39
        Lb2:
            r10.append(r12)
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntIntMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac A[PHI: r4
  0x00ac: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0052, B:21:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r24, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, ? extends java.lang.CharSequence> r25) {
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
            int[] r9 = r2.keys
            int[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb3
            r5 = 0
            r4 = 0
        L34:
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
            if (r0 == 0) goto Lac
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L5e:
            if (r1 >= r14) goto Laa
            r20 = 255(0xff, double:1.26E-321)
            long r18 = r2 + r20
            long r16 = r2 | r20
            long r18 = r18 - r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L85
            int r0 = r5 << 3
            int r0 = r0 + r1
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L86
            r10.append(r11)
        L7b:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L85:
            goto La4
        L86:
            if (r4 == 0) goto L8f
            r17 = r10
            r18 = r22
            r17.append(r18)
        L8f:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        La4:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r23
            goto L5e
        Laa:
            if (r14 != r15) goto Lb3
        Lac:
            if (r5 == r6) goto Lb3
            int r5 = r5 + 1
            r0 = r23
            goto L34
        Lb3:
            r10.append(r12)
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntIntMap.joinToString(java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3 A[PHI: r4
  0x00a3: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0047, B:21:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, ? extends java.lang.CharSequence> r24) {
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
            int[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Laa
            r5 = 0
            r4 = 0
        L30:
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
            if (r0 == 0) goto La3
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L53:
            if (r1 >= r14) goto La1
            r20 = 255(0xff, double:1.26E-321)
            long r18 = r2 + r20
            long r16 = r2 | r20
            long r18 = r18 - r16
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
            goto L9b
        L7b:
            if (r4 == 0) goto L80
            r10.append(r13)
        L80:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r16 = r22
            r17 = r15
            r18 = r0
            java.lang.Object r0 = r16.invoke(r17, r18)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L9b:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r23
            goto L53
        La1:
            if (r14 != r15) goto Laa
        La3:
            if (r5 == r6) goto Laa
            int r5 = r5 + 1
            r0 = r23
            goto L30
        Laa:
            r10.append(r12)
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntIntMap.joinToString(kotlin.jvm.functions.Function2):java.lang.String");
    }
}
