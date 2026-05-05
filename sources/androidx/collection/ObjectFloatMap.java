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
/* JADX INFO: compiled from: ObjectFloatMap.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&˛\bDRш|\u0004G\u00068\u000b<H\u0007\"2\u0017\u007f\u0007tyA0JfP.`g2\u000fq}<$i6yCAU\"}0\u0012WȞog\u0005Jb\u000bQ\u0014\u000e\u0016~u4Icxe܈\u00172XoG3SoE9vt>\u0005&9*8\u0010\u0005\t\u001a0K\u0018v\tOSÈ\u001a0N{BR\u0013R\r\u001a(\u0006FĨ\u0007Rrɡv8NǍk9_#1i\u0003S-a݁\u0001M\u001bG\u001dK\u001b\ry\u001eYWgK#=k\u0015\u0017Tk?9ӊ\u0002?\u0015hUA;K\u0004Wdo.-[ۇU\u05ce\\ön`\u0013lx\fUB\u0018\bYk&(&\u0012,#J\u001c&\u00187J>-PǑ\u0018\u0010Ct!mPR\u0012^p\u0017)z|Д+Ƨ2ٿ\u0002/tmy;Geg\u007f\u0013*6#7͙gƃT\u05f8d\u0015)r@b?pX=ve:]K\u000b\u001cp\u0019̣ò\b0U\u001ew\b\u001fN/%eri'/\r\u001aHr\u0002?\tn\u000bki\u0001K\tF|8O*7\u000f\u000bZr\u001d\u0004bdZ<\u0011\u0004ȼd\t\u000e\bA:lyL!S'|h/Ȑpލ\\܃m@tZqn\u001a%\b?lWMSy\u000f\u0010R=ܴ?\u0005u\u0013}~B\u0002\u000f\u000b`6?JH!ݘ>zΌR\f!X\b4*[D1G\u0005E|\u0011GZq\r\u001aoi\u001fɭњX=*-y*z4\u0011Rbv\u0016\u0005\tZ<\f\u000f<έE[;C6[(\u0014D~)\r%\u0015\u0010IwLut\u001b/<ɤ\u0002Ć\u0015֝\u0002~=i+\u000f-Qb!;nd\u000eub]!U}܃}\u0019A\u0013>m\u000e\u0016\u0001.fpp}d\u00192v\r\u001bQ5+т\u007fՌEک\u0010\u0011b:s>w\u001b3xJwP\u0018\u00150.47ǻݕ\u0001?3m7#\u001c#$1\u001bg\u0004\u0007\u007f0\nb=N#\u0013JЁiޗn̥\u001a\u000b@kPI\b'nA2\u0016\u001b]X{\b\u0017p#Ό\u0011=Nktv\\c]\r5\u0004\r(<\u000f\u0001V\nbA\u001dDҵ4˷)ϒ\f\u0012\"\u0010[%?g\u0004k{\u000bc\\AͧUϟ\u000b֭5n N\u00069d\u000bz\t^ $\u001cD^Sb;µ9(B`T\b9]Ұm\u0006\u001e0HkmE/2p\u000ekZ\u001cq\u0011\\\rޠ5jS\u001590\u0011\u0001\u001f3L\u0013chK֎L´.Ѳ҅\u0005S+Acp]8~%YG\u001bMc,f;#E\fZ\u0012\u0006D?_)\u001c\u00038DFT\u0015\u001dpUK?W\u0011m5H^9\u0015\u0015Tjv 'jNPh/\u0001\u0003\u000eJK'\u000bG\u000f#uh-Z\u0011\u00107q\u001d1\u001dJ)\u0015O\u0015ctZs\u000b}$K\u0006\u0003\u0014U9\bYA}\u0016^8'24Qb]\u000etJu\u001bhU\"\u001ch\u0002\u0017Th 2mzzx\n<JNO062\u0019dYy;9@Uj\u001d<HMv=\"\u0014|t~dAӆЂ5`\u007f\u0019=V#47O4\u0019~wJ\"c/\u0007+\u05ca\u0018\u001f,IF\u000ehT Qin\u0017\r_]\u001d+]+XzwÐX̭|ΥBy\u0012ol(CR\u001fSL+!\\\u001b\u007f\u001e\"/\u00016f\r\fW\u00173ۈ\u0007՝gӄ@лv$lӵG\u001b%_\u001bH1\u001d\u0012Ja&O4\ẗYΠ\tХ{Ĭz\u0017\u000b̌rv\u00060P\nC\u000fu3EF\u0003@Pkڵ(q|\u0005,SSA\u0013(:\u001b&\u0019?^H\"T[H\u001ci\\i߿WֆW̓D۰s\u000f!5x^c'0\r\u000b\u0002]U\b?\u0004:\"F)܌mݩFߨcǃ?+=֍\\)\u0012\u0012sKO\\qg'aZLk\nɭ}YX\u0002\u001012-V\f1\u0013]1v>\u0016Ї~ѲJӔ\u0010ڲ.<vޏ3Ir\u000e\u0002\u000b߂h\u0017;߭[f<D\u0001\u0086Ir=Љ15"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nj\u0014\u001cGm\u001d\u001d}/1he\u001cBC", "\u0019", "", "u(E", "-bP=T*Bb-", "", "5dc,V(IO\u0017\u0003\nrjz\u00136l\u007f&\u000bD\u000b UCx\u0017F\u0006!D]\b)E", "-rXGX", "5dc,f0SSW|\u0005e3|\u0007>i\n1:<\n !Vk\u001d@\u0001.C", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "9dh@", "", "5dc\u0018X@L\u0012\u0015\b\u0004h;x\u00183o\t6", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", ";dc.W(MO", "", "5dc\u001aX;:R\u0015\u000ev\u001d(\u0006\u00129t{7\u007fJ\n%", "Ahi2", "5dc \\A>", "D`[BX:", "", "5dc#T3NS'=vg5\u0007\u0018+t\u00042\u0005N", "/k[", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "/mh", "1n]AT0Ga", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1n]AT0Ga~~\u000f", "1n]AT0Ga\nz\u0002n,", "D`[BX", "1nd;g", "3pd._:", "=sW2e", "4h]1>,R7\"}zq", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "4na\u0012T*A", "", "0k^0^", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4na\u0012T*A7\"}zq,{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "7mS2k", "4na\u0012T*A9\u0019\u0013", "4na\u0012T*AD\u0015\u0006\u000b^", "5dc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?!", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "2dU.h3MD\u0015\u0006\u000b^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}\\\u0004a", "5dc\u001ce\fEa\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010.\u0002\u0012W", "6`b566=S", "7r4:c;R", "7r=<g\fF^(\u0013", "8nX;G6,b&\u0003\u0004`", "", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "BqP;f-H`!", "<n]2", "BnBAe0GU", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<`\":Y{/\u0018t *\\+7v\n", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class ObjectFloatMap<K> {
    public int _capacity;
    public int _size;
    public Object[] keys;
    public long[] metadata;
    public float[] values;

    public /* synthetic */ ObjectFloatMap(DefaultConstructorMarker defaultConstructorMarker) {
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

    private ObjectFloatMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = ContainerHelpersKt.EMPTY_OBJECTS;
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

    public final float get(K k2) {
        int iFindKeyIndex = findKeyIndex(k2);
        if (iFindKeyIndex < 0) {
            throw new NoSuchElementException("There is no key " + k2 + " in the map");
        }
        return this.values[iFindKeyIndex];
    }

    public final float getOrDefault(K k2, float f2) {
        int iFindKeyIndex = findKeyIndex(k2);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : f2;
    }

    public final float getOrElse(K k2, Function0<Float> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(k2);
        if (iFindKeyIndex >= 0) {
            return this.values[iFindKeyIndex];
        }
        return defaultValue.invoke().floatValue();
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
            if ((-1) - (((-1) - ((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2)))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
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

    public final void forEach(Function2<? super K, ? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.keys;
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
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                        int i5 = (i2 << 3) + i4;
                        block.invoke(objArr[i5], Float.valueOf(fArr[i5]));
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
            if ((-1) - (((-1) - ((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2)))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
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

    public final boolean contains(K k2) {
        return findKeyIndex(k2) >= 0;
    }

    public final boolean containsKey(K k2) {
        return findKeyIndex(k2) >= 0;
    }

    public static /* synthetic */ String joinToString$default(ObjectFloatMap objectFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i3 + 1) - (1 | i3) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
        }
        if ((4 & i3) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            i2 = -1;
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
        }
        return objectFloatMap.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence4);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0096 A[PHI: r4
  0x0096: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:38:0x0043, B:54:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
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
            r1 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "postfix"
            r12 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "truncated"
            r11 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            java.lang.Object[] r9 = r2.keys
            float[] r8 = r2.values
            long[] r7 = r2.metadata
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
            long r0 = r0 & r2
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r14
            int r13 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r13 == 0) goto L93
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r1 = 8
            int r14 = 8 - r0
            r13 = 0
        L4f:
            if (r13 >= r14) goto L94
            r15 = 255(0xff, double:1.26E-321)
            long r17 = r2 & r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L74
            int r0 = r5 << 3
            int r0 = r0 + r13
            r15 = r9[r0]
            r1 = r8[r0]
            r0 = r24
            r0 = r0
            if (r4 != r0) goto L75
            r10.append(r11)
        L6a:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L74:
            goto L8d
        L75:
            if (r4 == 0) goto L7e
            r16 = r10
            r17 = r19
            r16.append(r17)
        L7e:
            r10.append(r15)
            r0 = 61
            r10.append(r0)
            r10.append(r1)
            int r4 = r4 + 1
            r1 = 8
        L8d:
            long r2 = r2 >> r1
            int r13 = r13 + 1
            r0 = r20
            goto L4f
        L93:
            goto L96
        L94:
            if (r14 != r1) goto L9d
        L96:
            if (r5 == r6) goto L9d
            int r5 = r5 + 1
            r0 = r20
            goto L35
        L9d:
            r10.append(r12)
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x00f1 A[PHI: r4
  0x00f1: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:79:0x0099, B:95:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.ObjectFloatMap r18, java.lang.CharSequence r19, java.lang.CharSequence r20, java.lang.CharSequence r21, int r22, java.lang.CharSequence r23, kotlin.jvm.functions.Function2 r24, int r25, java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.joinToString$default(androidx.collection.ObjectFloatMap, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2, int, java.lang.Object):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5 A[PHI: r4
  0x00a5: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:39:0x004f, B:56:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r21, java.lang.CharSequence r22, java.lang.CharSequence r23, int r24, java.lang.CharSequence r25, kotlin.jvm.functions.Function2<? super K, ? super java.lang.Float, ? extends java.lang.CharSequence> r26) {
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
            java.lang.Object[] r9 = r2.keys
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lac
            r5 = 0
            r4 = 0
        L3c:
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
            if (r0 == 0) goto La0
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L5b:
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
            r0 = r24
            if (r4 != r0) goto L80
            r10.append(r12)
        L75:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L7f:
            goto L98
        L80:
            if (r4 == 0) goto L89
            r17 = r10
            r18 = r19
            r17.append(r18)
        L89:
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r11.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        L98:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r20
            goto L5b
        La0:
            goto La5
        La1:
            r0 = 8
            if (r1 != r0) goto Lac
        La5:
            if (r5 == r6) goto Lac
            int r5 = r5 + 1
            r0 = r20
            goto L3c
        Lac:
            r10.append(r13)
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0068  */
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
            boolean r0 = r10 instanceof androidx.collection.ObjectFloatMap
            r17 = 0
            if (r0 != 0) goto L10
            return r17
        L10:
            androidx.collection.ObjectFloatMap r10 = (androidx.collection.ObjectFloatMap) r10
            int r1 = r10.getSize()
            int r0 = r19.getSize()
            if (r1 == r0) goto L1d
            return r17
        L1d:
            java.lang.Object[] r9 = r2.keys
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L6e
            r5 = r17
        L2a:
            r2 = r7[r5]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 == 0) goto L68
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = r17
        L45:
            if (r4 >= r11) goto L66
            r0 = 255(0xff, double:1.26E-321)
            long r15 = r0 + r2
            long r0 = r0 | r2
            long r15 = r15 - r0
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L62
            int r1 = r5 << 3
            int r1 = r1 + r4
            r0 = r9[r1]
            r1 = r8[r1]
            float r0 = r10.get(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L6d
        L62:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L45
        L66:
            if (r11 != r12) goto L6e
        L68:
            if (r5 == r6) goto L6e
            int r5 = r5 + 1
            goto L2a
        L6d:
            return r17
        L6e:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0083 A[PHI: r4
  0x0083: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:43:0x003b, B:55:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r21 = this;
            r11 = r21
            boolean r0 = r21.isEmpty()
            if (r0 == 0) goto Lb
            java.lang.String r0 = "{}"
            return r0
        Lb:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "{"
            r10.<init>(r0)
            java.lang.Object[] r9 = r11.keys
            float[] r8 = r11.values
            long[] r7 = r11.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L88
            r20 = 0
            r5 = r20
            r4 = r5
        L22:
            r2 = r7[r5]
            long r0 = ~r2
            r12 = 7
            long r0 = r0 << r12
            long r18 = r0 + r2
            long r0 = r0 | r2
            long r18 = r18 - r0
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r14 = -1
            long r12 = r14 - r18
            long r0 = r14 - r16
            long r12 = r12 | r0
            long r14 = r14 - r12
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto L83
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r1 = r20
        L48:
            if (r1 >= r12) goto L81
            r14 = 255(0xff, double:1.26E-321)
            r18 = -1
            long r16 = r18 - r14
            long r14 = r18 - r2
            long r16 = r16 | r14
            long r18 = r18 - r16
            r14 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r0 >= 0) goto L7d
            int r14 = r5 << 3
            int r14 = r14 + r1
            r0 = r9[r14]
            r14 = r8[r14]
            if (r0 != r11) goto L67
            java.lang.String r0 = "(this)"
        L67:
            r10.append(r0)
            java.lang.String r0 = "="
            r10.append(r0)
            r10.append(r14)
            int r4 = r4 + 1
            int r0 = r11._size
            if (r4 >= r0) goto L7d
            java.lang.String r0 = ", "
            r10.append(r0)
        L7d:
            long r2 = r2 >> r13
            int r1 = r1 + 1
            goto L48
        L81:
            if (r12 != r13) goto L88
        L83:
            if (r5 == r6) goto L88
            int r5 = r5 + 1
            goto L22
        L88:
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r10.append(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "s.append('}').toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.toString():java.lang.String");
    }

    public final boolean all(Function2<? super K, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((-1) - (((-1) - ((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2)))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (!predicate.invoke(objArr[i5], Float.valueOf(fArr[i5])).booleanValue()) {
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

    /* JADX WARN: Removed duplicated region for block: B:43:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(kotlin.jvm.functions.Function2<? super K, ? super java.lang.Float, java.lang.Boolean> r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "predicate"
            r10 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.Object[] r9 = r1.keys
            float[] r8 = r1.values
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            r17 = 0
            if (r6 < 0) goto L69
            r5 = r17
        L18:
            r2 = r7[r5]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 == 0) goto L64
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = r17
        L33:
            if (r4 >= r11) goto L62
            r0 = 255(0xff, double:1.26E-321)
            r15 = -1
            long r13 = r15 - r0
            long r0 = r15 - r2
            long r13 = r13 | r0
            long r15 = r15 - r13
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L5e
            int r0 = r5 << 3
            int r0 = r0 + r4
            r1 = r9[r0]
            r0 = r8[r0]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r10.invoke(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5e
            r0 = 1
            return r0
        L5e:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L33
        L62:
            if (r11 != r12) goto L69
        L64:
            if (r5 == r6) goto L69
            int r5 = r5 + 1
            goto L18
        L69:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.any(kotlin.jvm.functions.Function2):boolean");
    }

    public final int count(Function2<? super K, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((-1) - (((-1) - ((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2)))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 + j2) - (255 | j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            if (predicate.invoke(objArr[i7], Float.valueOf(fArr[i7])).booleanValue()) {
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

    /* JADX WARN: Removed duplicated region for block: B:43:0x004a  */
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
            if (r6 < 0) goto L4f
            r5 = r14
        Lb:
            r1 = r7[r5]
            long r3 = ~r1
            r0 = 7
            long r3 = r3 << r0
            long r11 = r3 + r1
            long r3 = r3 | r1
            long r11 = r11 - r3
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r11 + r9
            long r11 = r11 | r9
            long r3 = r3 - r11
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 == 0) goto L4a
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r9 = 8
            int r4 = 8 - r0
            r3 = r14
        L2b:
            if (r3 >= r4) goto L48
            r10 = 255(0xff, double:1.26E-321)
            long r12 = r10 + r1
            long r10 = r10 | r1
            long r12 = r12 - r10
            r10 = 128(0x80, double:6.3E-322)
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 >= 0) goto L44
            int r0 = r5 << 3
            int r0 = r0 + r3
            r0 = r8[r0]
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 != 0) goto L44
            r0 = 1
            return r0
        L44:
            long r1 = r1 >> r9
            int r3 = r3 + 1
            goto L2b
        L48:
            if (r4 != r9) goto L4f
        L4a:
            if (r5 == r6) goto L4f
            int r5 = r5 + 1
            goto Lb
        L4f:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.containsValue(float):boolean");
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        float[] fArr = this.values;
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
                        if ((255 & j2) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            iHashCode += Float.hashCode(fArr[i6]) ^ (obj != null ? obj.hashCode() : 0);
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
            int i7 = (-1) - (((-1) - i6) | ((-1) - i5));
            long[] jArr = this.metadata;
            int i8 = i7 >> 3;
            int i9 = ((-1) - (((-1) - i7) | ((-1) - 7))) << 3;
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j3 = (((long) i4) * ScatterMapKt.BitmaskLsb) ^ j2;
            long j4 = j3 - ScatterMapKt.BitmaskLsb;
            long j5 = ~j3;
            long j6 = (j5 + j4) - (j5 | j4);
            long j7 = (j6 - 9187201950435737472L) - (j6 | (-9187201950435737472L));
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (-1) - (((-1) - ((Long.numberOfTrailingZeros(j7) >> 3) + i7)) | ((-1) - i5));
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], k2)) {
                    return iNumberOfTrailingZeros;
                }
                long j8 = j7 - 1;
                j7 = (j7 + j8) - (j7 | j8);
            }
            if ((-1) - (((-1) - (j2 & ((~j2) << 6))) | ((-1) - (-9187201950435737472L))) != 0) {
                return -1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae A[PHI: r4
  0x00ae: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:39:0x0050, B:56:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, java.lang.CharSequence r27, int r28, kotlin.jvm.functions.Function2<? super K, ? super java.lang.Float, ? extends java.lang.CharSequence> r29) {
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
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb5
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
            if (r0 == 0) goto La9
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L5c:
            if (r14 >= r1) goto Laa
            r21 = 255(0xff, double:1.26E-321)
            r19 = -1
            long r17 = r19 - r2
            long r15 = r19 - r21
            long r17 = r17 | r15
            long r19 = r19 - r17
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r0 >= 0) goto L88
            int r0 = r5 << 3
            int r0 = r0 + r14
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = r28
            if (r4 != r0) goto L89
            r10.append(r11)
        L7e:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L88:
            goto La1
        L89:
            if (r4 == 0) goto L92
            r17 = r10
            r18 = r23
            r17.append(r18)
        L92:
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r12.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        La1:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r24
            goto L5c
        La9:
            goto Lae
        Laa:
            r0 = 8
            if (r1 != r0) goto Lb5
        Lae:
            if (r5 == r6) goto Lb5
            int r5 = r5 + 1
            r0 = r24
            goto L39
        Lb5:
            r10.append(r13)
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x009c A[PHI: r4
  0x009c: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:39:0x0047, B:56:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r21, java.lang.CharSequence r22, java.lang.CharSequence r23, kotlin.jvm.functions.Function2<? super K, ? super java.lang.Float, ? extends java.lang.CharSequence> r24) {
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
            r12 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r11 = "..."
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            java.lang.Object[] r9 = r2.keys
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La3
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
            if (r14 == 0) goto L97
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L53:
            if (r14 >= r1) goto L98
            r15 = 255(0xff, double:1.26E-321)
            long r17 = r2 & r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L76
            int r0 = r5 << 3
            int r0 = r0 + r14
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L77
            r10.append(r11)
        L6c:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L76:
            goto L8f
        L77:
            if (r4 == 0) goto L80
            r17 = r10
            r18 = r19
            r17.append(r18)
        L80:
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r12.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        L8f:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r20
            goto L53
        L97:
            goto L9c
        L98:
            r0 = 8
            if (r1 != r0) goto La3
        L9c:
            if (r5 == r6) goto La3
            int r5 = r5 + 1
            r0 = r20
            goto L39
        La3:
            r10.append(r13)
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9 A[PHI: r4
  0x00a9: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:39:0x004c, B:56:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, kotlin.jvm.functions.Function2<? super K, ? super java.lang.Float, ? extends java.lang.CharSequence> r27) {
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
            java.lang.Object[] r9 = r2.keys
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb0
            r5 = 0
            r4 = 0
        L36:
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
            if (r0 == 0) goto La4
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L58:
            if (r14 >= r1) goto La5
            r21 = 255(0xff, double:1.26E-321)
            r19 = -1
            long r17 = r19 - r2
            long r15 = r19 - r21
            long r17 = r17 | r15
            long r19 = r19 - r17
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r0 >= 0) goto L83
            int r0 = r5 << 3
            int r0 = r0 + r14
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L84
            r10.append(r11)
        L79:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L83:
            goto L9c
        L84:
            if (r4 == 0) goto L8d
            r17 = r10
            r18 = r23
            r17.append(r18)
        L8d:
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        L9c:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r24
            goto L58
        La4:
            goto La9
        La5:
            r0 = 8
            if (r1 != r0) goto Lb0
        La9:
            if (r5 == r6) goto Lb0
            int r5 = r5 + 1
            r0 = r24
            goto L36
        Lb0:
            r10.append(r12)
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2 A[PHI: r4
  0x00a2: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:37:0x0048, B:52:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r26, kotlin.jvm.functions.Function2<? super K, ? super java.lang.Float, ? extends java.lang.CharSequence> r27) {
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
            java.lang.Object[] r9 = r2.keys
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La9
            r5 = 0
            r4 = 0
        L32:
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
            if (r0 == 0) goto La2
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L54:
            if (r1 >= r14) goto La0
            r22 = 255(0xff, double:1.26E-321)
            r20 = -1
            long r18 = r20 - r2
            long r16 = r20 - r22
            long r18 = r18 | r16
            long r20 = r20 - r18
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 >= 0) goto L7f
            int r0 = r5 << 3
            int r0 = r0 + r1
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
            goto L9a
        L80:
            if (r4 == 0) goto L89
            r17 = r10
            r18 = r24
            r17.append(r18)
        L89:
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L9a:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r25
            goto L54
        La0:
            if (r14 != r15) goto La9
        La2:
            if (r5 == r6) goto La9
            int r5 = r5 + 1
            r0 = r25
            goto L32
        La9:
            r10.append(r12)
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.joinToString(java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x009a A[PHI: r4
  0x009a: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:37:0x0042, B:52:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(kotlin.jvm.functions.Function2<? super K, ? super java.lang.Float, ? extends java.lang.CharSequence> r24) {
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
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La1
            r5 = 0
            r4 = 0
        L2f:
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
            if (r0 == 0) goto L9a
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L4e:
            if (r1 >= r14) goto L98
            r20 = 255(0xff, double:1.26E-321)
            long r18 = r2 + r20
            long r16 = r2 | r20
            long r18 = r18 - r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L75
            int r0 = r5 << 3
            int r0 = r0 + r1
            r16 = r9[r0]
            r15 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L76
            r10.append(r11)
        L6b:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L75:
            goto L92
        L76:
            if (r4 == 0) goto L7b
            r10.append(r13)
        L7b:
            java.lang.Float r0 = java.lang.Float.valueOf(r15)
            r15 = r22
            r16 = r16
            r17 = r0
            java.lang.Object r0 = r15.invoke(r16, r17)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L92:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r23
            goto L4e
        L98:
            if (r14 != r15) goto La1
        L9a:
            if (r5 == r6) goto La1
            int r5 = r5 + 1
            r0 = r23
            goto L2f
        La1:
            r10.append(r12)
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ObjectFloatMap.joinToString(kotlin.jvm.functions.Function2):java.lang.String");
    }
}
