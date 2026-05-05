package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
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
/* JADX INFO: compiled from: FloatObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&˛\bDRш|\u0004G\u00068\u000b<H\u0007\"2\u0017\u007f\u0007t|A0JeP.`g2\u000fq}<$i3yCAV\"}0\u0012WȞog\u0005Jb\u000bQ\u0014\u000e\u0016~u4Icxe܈\u00172XoG3SoE9vt>\u0005&9*8\u0010\u0005\t\u001a0K\u0018v\tOSÈ\u001a0N{BR\u0013R\r\u001a(\u0006FĨ\u0007Rrɡv8NǍk9_#1i\u0003S-a݁\u0001M\u001bG\u001dK\u001b\ry\u001eYWgK#=k\u0015\u0017Tk?1Y\u0002?\u0015h]ݐ;K\u0004Wdo.-[ۇU\u05ce\\ön`\u0013lx\fUB\u0018\bYk&(&\u0012,#J\u001c&\u00187J>-H\u0001\u0018\u0010Ct)ԟPR\u0012^p\u0017)z|Д+Ƨ2ٿ\u0002*tmy;Geg\u007f\u0013*6#/\tgƃTVl#9lw\u007fH\u0002DKef\n\bW6\u0015~\u0002\u001a*2Gw\u0004=\u001c).M¦ھ_91B4\u0006Vf\u007fv3c1wwt`@PqFM8!$lTf\u0015k~nh.!MR\u0381\u0017\u007f\u0018\u0013Ns&Ugؾ\u0016̓NŖ2{[\u0001\"%]}g_|\u0010&YO]a5\u0018ӆ\u0010*f\u00059W<\u0011\b\tjPp$Z\u000bBhöNн\u0014w\u0002j\u0017N!YWqJ\\\\e'\u0006-x\u0013/RP+#ރ^r\u0016)d9*.y&z\u000f'ml\u0002\u007fv/̢ض\u0001j(WQW;D6W(nZ\u001d3\t\u000fs.o\u0016e\u000eƉrخtɝDM$FQQ]eC.\rRJ\u001d=V\\\u0002\u0014T̊\u00161\u0001'\n\u0015A\u0014>i\u000ep\u0017ZplZO\u0003?P$%в)СcрB\u000fT*_c\u00033\f]W\u001c\u001btL_H\f39Ǫ)\u000buL\r;3n7\u001f\u001c}:L%cmi\u001eV(\u0010UյzѺ\u0003Ϻ,C}\u0013i]`chhg(V=4}\u0013Q~۳͎\fL\u000f^\u001d9Nltr\\>s+?\u007fv\u0007Z5\u001f\u0004\"Ƭ\u0019\u0383|Үvu8%[\u007f*]yљAQa\u0005\u0006myvQͮ\u000fϻ\u000f{?!Z5KSnW\u0019־`\n\u00025NAi|5@\u0017XL,rފդGTw;X \u000e|w\u000fMϨrwIs&T'v\u0007R\u0013\u0015]f1,\u0011~EɼL0{̔\u000b\u0600E\u07bcвg2\u000f\fe\u000f)$g~\u0015(qX\u001d=)bp\u00019\\&GW=N\u0004u@6$}HP\u0018+Zr\u001e!9_Owv^\u001e;[jNr7*f\u0001\u000eR/\u0005z\u000bOT\n=JIUxopodN&:s \u0007\u0017Rl\u001f\f+#\r u|CiUI\u0019QW\u0002]SI<  Nf4z'\\eN~\n\fZj\u001cw\u0016pC!\u0013~_44Pt\u0001LF\bdR29\b\u0013l\u001d\u0004wO\u007fWar\bP\u0010\u0001)\u001at|r\u001do̦\u0007p7\u0001\nt3{-\u000b-ST0hkJ \nݰǨ\u0015\n\u001a?6%<3r+\u0016U\n\t\u0001m_[;j]\u0005pԥ7ŁQʴF#\b;\u001c*\u0003?]Ad\u0014Vd7\u001a3V($ll@d#\u000f_ح;ۈ\u001f՟\u001dӥ8Lzڽt1=\u001d-\\]]n\f\u001cEw)Wܐ\u0011̈q\u03a2>цs.~֫\u0013<hz\u000e+\u0013\u0018\u0001\u0007\u007f,[I\u000b\u0002Ն+]<oj\u000b4T\u0016NP\u0012D\u0011<\u001ceդvԌ\u0015ѐ&̄?W;߿)\u0013\u0007!F\u0007@\u001d'B\u0003Q\u00023`ʈ;ӕc׆\u0006܊o@{ق\u0003%5\u001e}\u001c(uI5Mez*BFʩN\u0003ee\\ o5\u001aUS0\u0012]P\u0004\u001a!:#4uQ\u0013{ʹ\u0007߫6ЉLҕw_\f&8K~F)[zy݈\t+1ѥsicd:л+B\u0018ܻBr"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\na\u001e!C~w9{%3he\u001cBC", "$", "", "u(E", "-bP=T*Bb-", "", "5dc,V(IO\u0017\u0003\nrjz\u00136l\u007f&\u000bD\u000b UCx\u0017F\u0006!D]\b)E", "-rXGX", "5dc,f0SSW|\u0005e3|\u0007>i\n1:<\n !Vk\u001d@\u0001.C", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "9dh@", "", "5dc\u0018X@L\u0012\u0015\b\u0004h;x\u00183o\t6", ";dc.W(MO", "", "5dc\u001aX;:R\u0015\u000ev\u001d(\u0006\u00129t{7\u007fJ\n%", "Ahi2", "5dc \\A>", "D`[BX:", "", "5dc#T3NS'=vg5\u0007\u0018+t\u00042\u0005N", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "/k[", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "/mh", "1n]AT0Ga", "9dh", "1n]AT0Ga~~\u000f", "1n]AT0Ga\nz\u0002n,", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1nd;g", "3pd._:", "=sW2e", "4h]1>,R7\"}zq", "4h]1>,R7\"}zqjz\u00136l\u007f&\u000bD\u000b ", "4na\u0012T*A", "", "0k^0^", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4na\u0012T*A7\"}zq,{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "7mS2k", "4na\u0012T*A9\u0019\u0013", "4na\u0012T*AD\u0015\u0006\u000b^", "5dc", "uE\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "2dU.h3MD\u0015\u0006\u000b^", "uE;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "5dc\u001ce\fEa\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uE;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHuzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "6`b566=S", "7r4:c;R", "7r=<g\fF^(\u0013", "8nX;G6,b&\u0003\u0004`", "", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "BqP;f-H`!", "<n]2", "BnBAe0GU", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<W,?U\r\n4r\u0016,\\+7v\n", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class FloatObjectMap<V> {
    public int _capacity;
    public int _size;
    public float[] keys;
    public long[] metadata;
    public Object[] values;

    public /* synthetic */ FloatObjectMap(DefaultConstructorMarker defaultConstructorMarker) {
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

    private FloatObjectMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = FloatSetKt.getEmptyFloatArray();
        this.values = ContainerHelpersKt.EMPTY_OBJECTS;
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

    public final V getOrElse(float f2, Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v2 = get(f2);
        return v2 == null ? defaultValue.invoke() : v2;
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

    public final void forEach(Function2<? super Float, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.keys;
        Object[] objArr = this.values;
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
                        block.invoke(Float.valueOf(fArr[i5]), objArr[i5]);
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
            long j3 = (~j2) << 7;
            if ((-1) - (((-1) - ((j3 + j2) - (j3 | j2))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
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

    public final void forEachValue(Function1<? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.values;
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

    public final int count() {
        return getSize();
    }

    public static /* synthetic */ String joinToString$default(FloatObjectMap floatObjectMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((1 & i3) != 0) {
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
        return floatObjectMap.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab A[PHI: r4
  0x00ab: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0050, B:22:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
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
            r1 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "postfix"
            r12 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "truncated"
            r11 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            float[] r9 = r2.keys
            java.lang.Object[] r8 = r2.values
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
            long r17 = r0 + r2
            long r0 = r0 | r2
            long r17 = r17 - r0
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
        L5c:
            if (r13 >= r14) goto La9
            r21 = 255(0xff, double:1.26E-321)
            r19 = -1
            long r17 = r19 - r2
            long r15 = r19 - r21
            long r17 = r17 | r15
            long r19 = r19 - r17
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r0 >= 0) goto L89
            int r0 = r5 << 3
            int r0 = r0 + r13
            r15 = r9[r0]
            r1 = r8[r0]
            r0 = r28
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
            r17 = r23
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
            r0 = r24
            goto L5c
        La8:
            goto Lab
        La9:
            if (r14 != r1) goto Lb2
        Lab:
            if (r5 == r6) goto Lb2
            int r5 = r5 + 1
            r0 = r24
            goto L39
        Lb2:
            r10.append(r12)
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4 A[PHI: r4
  0x00f4: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:23:0x0098, B:39:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.FloatObjectMap r19, java.lang.CharSequence r20, java.lang.CharSequence r21, java.lang.CharSequence r22, int r23, java.lang.CharSequence r24, kotlin.jvm.functions.Function2 r25, int r26, java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.joinToString$default(androidx.collection.FloatObjectMap, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2, int, java.lang.Object):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad A[PHI: r4
  0x00ad: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x004f, B:23:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, java.lang.CharSequence r27, int r28, java.lang.CharSequence r29, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super V, ? extends java.lang.CharSequence> r30) {
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
            float[] r9 = r2.keys
            java.lang.Object[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb4
            r5 = 0
            r4 = 0
        L41:
            r2 = r7[r5]
            long r0 = ~r2
            r14 = 7
            long r0 = r0 << r14
            long r0 = r0 & r2
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r15
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 == 0) goto La8
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
            r16 = r9[r0]
            r15 = r8[r0]
            r0 = r28
            if (r4 != r0) goto L88
            r10.append(r12)
        L7d:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L87:
            goto La0
        L88:
            if (r4 == 0) goto L91
            r17 = r10
            r18 = r23
            r17.append(r18)
        L91:
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r11.invoke(r0, r15)
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
            goto L41
        Lb4:
            r10.append(r13)
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
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
            boolean r0 = r10 instanceof androidx.collection.FloatObjectMap
            r17 = 0
            if (r0 != 0) goto L10
            return r17
        L10:
            androidx.collection.FloatObjectMap r10 = (androidx.collection.FloatObjectMap) r10
            int r1 = r10.getSize()
            int r0 = r19.getSize()
            if (r1 == r0) goto L1d
            return r17
        L1d:
            float[] r9 = r2.keys
            java.lang.Object[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L89
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
            if (r0 == 0) goto L84
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = r17
        L4b:
            if (r4 >= r11) goto L82
            r0 = 255(0xff, double:1.26E-321)
            r15 = -1
            long r13 = r15 - r0
            long r0 = r15 - r2
            long r13 = r13 | r0
            long r15 = r15 - r13
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L7e
            int r0 = r5 << 3
            int r0 = r0 + r4
            r13 = r9[r0]
            r1 = r8[r0]
            if (r1 != 0) goto L73
            java.lang.Object r0 = r10.get(r13)
            if (r0 != 0) goto L72
            boolean r0 = r10.containsKey(r13)
            if (r0 != 0) goto L7e
        L72:
            return r17
        L73:
            java.lang.Object r0 = r10.get(r13)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L7e
            return r17
        L7e:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L4b
        L82:
            if (r11 != r12) goto L89
        L84:
            if (r5 == r6) goto L89
            int r5 = r5 + 1
            goto L2a
        L89:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[PHI: r4
  0x0079: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:10:0x0039, B:22:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
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
            java.lang.Object[] r8 = r11.values
            long[] r7 = r11.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L7e
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
            if (r0 == 0) goto L79
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r1 = r18
        L46:
            if (r1 >= r12) goto L77
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r2
            r14 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L73
            int r14 = r5 << 3
            int r14 = r14 + r1
            r0 = r9[r14]
            r14 = r8[r14]
            r10.append(r0)
            java.lang.String r0 = "="
            r10.append(r0)
            if (r14 != r11) goto L65
            java.lang.String r14 = "(this)"
        L65:
            r10.append(r14)
            int r4 = r4 + 1
            int r0 = r11._size
            if (r4 >= r0) goto L73
            java.lang.String r0 = ", "
            r10.append(r0)
        L73:
            long r2 = r2 >> r13
            int r1 = r1 + 1
            goto L46
        L77:
            if (r12 != r13) goto L7e
        L79:
            if (r5 == r6) goto L7e
            int r5 = r5 + 1
            goto L24
        L7e:
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r10.append(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "s.append('}').toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0087, code lost:
    
        r0 = (~r4) << 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0091, code lost:
    
        if ((((r4 + r0) - (r4 | r0)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0093, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(float r18) {
        /*
            r17 = this;
            int r2 = java.lang.Float.hashCode(r18)
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r0
            int r0 = r2 << 16
            r2 = r2 ^ r0
            r0 = 127(0x7f, float:1.78E-43)
            int r1 = (-1) - r2
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r7 = (-1) - r1
            r8 = r17
            int r6 = r8._capacity
            int r0 = r2 >>> 7
            int r16 = r0 + r6
            r0 = r0 | r6
            int r16 = r16 - r0
            r15 = 0
        L20:
            long[] r3 = r8.metadata
            int r2 = r16 >> 3
            r0 = 7
            int r1 = r16 + r0
            r0 = r16 | r0
            int r1 = r1 - r0
            int r1 = r1 << 3
            r9 = r3[r2]
            long r9 = r9 >>> r1
            int r0 = r2 + 1
            r4 = r3[r0]
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
            r9 = -1
            long r2 = r9 - r0
            long r0 = r9 - r11
            long r2 = r2 | r0
            long r9 = r9 - r2
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r11 = -1
            long r2 = r11 - r9
            long r0 = r11 - r13
            long r2 = r2 | r0
            long r11 = r11 - r2
        L5d:
            r9 = 0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 == 0) goto L87
            int r0 = java.lang.Long.numberOfTrailingZeros(r11)
            int r1 = r0 >> 3
            int r1 = r1 + r16
            r1 = r1 & r6
            float[] r0 = r8.keys
            r0 = r0[r1]
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 != 0) goto L7d
        L74:
            if (r1 < 0) goto L7b
            java.lang.Object[] r0 = r8.values
            r0 = r0[r1]
        L7a:
            return r0
        L7b:
            r0 = 0
            goto L7a
        L7d:
            r0 = 1
            long r2 = r11 - r0
            long r0 = r11 + r2
            long r11 = r11 | r2
            long r0 = r0 - r11
            r11 = r0
            goto L5d
        L87:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r2 = r4 + r0
            long r4 = r4 | r0
            long r2 = r2 - r4
            long r2 = r2 & r13
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L95
            r1 = -1
            goto L74
        L95:
            int r15 = r15 + 8
            int r16 = r16 + r15
            int r0 = r16 + r6
            r16 = r16 | r6
            int r0 = r0 - r16
            r16 = r0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.get(float):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0089, code lost:
    
        r0 = (~r4) << 6;
        r9 = (r4 + r0) - (r4 | r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0096, code lost:
    
        if (((r9 - 9187201950435737472L) - (r9 | (-9187201950435737472L))) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0098, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V getOrDefault(float r18, V r19) {
        /*
            r17 = this;
            int r1 = java.lang.Float.hashCode(r18)
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r0 = 127(0x7f, float:1.78E-43)
            int r7 = r1 + r0
            r0 = r0 | r1
            int r7 = r7 - r0
            r8 = r17
            int r6 = r8._capacity
            int r0 = r1 >>> 7
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r16 = (-1) - r1
            r15 = 0
        L1f:
            long[] r3 = r8.metadata
            int r2 = r16 >> 3
            r0 = 7
            int r1 = r16 + r0
            r0 = r16 | r0
            int r1 = r1 - r0
            int r1 = r1 << 3
            r13 = r3[r2]
            long r13 = r13 >>> r1
            int r0 = r2 + 1
            r11 = r3[r0]
            int r0 = 64 - r1
            long r11 = r11 << r0
            long r2 = (long) r1
            long r0 = -r2
            r2 = 63
            long r0 = r0 >> r2
            r9 = -1
            long r4 = r9 - r11
            long r2 = r9 - r0
            long r4 = r4 | r2
            long r9 = r9 - r4
            long r4 = r9 + r13
            long r9 = r9 & r13
            long r4 = r4 - r9
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r9 = r2 - r0
            long r0 = ~r2
            long r0 = r0 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r9 = -1
            long r2 = r9 - r0
            long r0 = r9 - r13
            long r2 = r2 | r0
            long r9 = r9 - r2
        L5f:
            r11 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 == 0) goto L89
            int r0 = java.lang.Long.numberOfTrailingZeros(r9)
            int r0 = r0 >> 3
            int r0 = r0 + r16
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r1 = (-1) - r1
            float[] r0 = r8.keys
            r0 = r0[r1]
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 != 0) goto L83
        L7c:
            if (r1 < 0) goto La2
            java.lang.Object[] r0 = r8.values
            r0 = r0[r1]
            return r0
        L83:
            r2 = 1
            long r0 = r9 - r2
            long r9 = r9 & r0
            goto L5f
        L89:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r9 = r4 + r0
            long r4 = r4 | r0
            long r9 = r9 - r4
            long r1 = r9 + r13
            long r9 = r9 | r13
            long r1 = r1 - r9
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 == 0) goto L9a
            r1 = -1
            goto L7c
        L9a:
            int r15 = r15 + 8
            int r16 = r16 + r15
            r16 = r16 & r6
            goto L1f
        La2:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.getOrDefault(float, java.lang.Object):java.lang.Object");
    }

    public final boolean all(Function2<? super Float, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (!predicate.invoke(Float.valueOf(fArr[i5]), objArr[i5]).booleanValue()) {
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(kotlin.jvm.functions.Function2<? super java.lang.Float, ? super V, java.lang.Boolean> r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "predicate"
            r10 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            float[] r9 = r1.keys
            java.lang.Object[] r8 = r1.values
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            r17 = 0
            if (r6 < 0) goto L70
            r5 = r17
        L19:
            r2 = r7[r5]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            r15 = -1
            long r11 = r15 - r0
            long r0 = r15 - r2
            long r11 = r11 | r0
            long r15 = r15 - r11
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r15 + r13
            long r15 = r15 | r13
            long r11 = r11 - r15
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L6b
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = r17
        L3e:
            if (r4 >= r11) goto L69
            r0 = 255(0xff, double:1.26E-321)
            long r15 = r0 + r2
            long r0 = r0 | r2
            long r15 = r15 - r0
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L65
            int r1 = r5 << 3
            int r1 = r1 + r4
            r0 = r9[r1]
            r1 = r8[r1]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r10.invoke(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L65
            r0 = 1
            return r0
        L65:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L3e
        L69:
            if (r11 != r12) goto L70
        L6b:
            if (r5 == r6) goto L70
            int r5 = r5 + 1
            goto L19
        L70:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.any(kotlin.jvm.functions.Function2):boolean");
    }

    public final int count(Function2<? super Float, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j2 = jArr[i3];
                long j3 = (~j2) << 7;
                long j4 = (j3 + j2) - (j3 | j2);
                if ((j4 - 9187201950435737472L) - (j4 | (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                            int i7 = (i3 << 3) + i6;
                            if (predicate.invoke(Float.valueOf(fArr[i7]), objArr[i7]).booleanValue()) {
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0096, code lost:
    
        if (((r3 & ((~r3) << 6)) & (-9187201950435737472L)) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0098, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(float r21) {
        /*
            r20 = this;
            r9 = r20
            int r1 = java.lang.Float.hashCode(r21)
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r0 = 127(0x7f, float:1.78E-43)
            int r8 = r1 + r0
            r0 = r0 | r1
            int r8 = r8 - r0
            int r7 = r9._capacity
            int r0 = r1 >>> 7
            int r19 = r0 + r7
            r0 = r0 | r7
            int r19 = r19 - r0
            r18 = 0
            r17 = r18
        L20:
            long[] r3 = r9.metadata
            int r2 = r19 >> 3
            r0 = 7
            int r1 = r19 + r0
            r0 = r19 | r0
            int r1 = r1 - r0
            int r1 = r1 << 3
            r14 = r3[r2]
            long r14 = r14 >>> r1
            r16 = 1
            int r2 = r2 + r16
            r12 = r3[r2]
            int r0 = 64 - r1
            long r12 = r12 << r0
            long r0 = (long) r1
            long r2 = -r0
            r0 = 63
            long r2 = r2 >> r0
            r10 = -1
            long r4 = r10 - r12
            long r0 = r10 - r2
            long r4 = r4 | r0
            long r10 = r10 - r4
            r3 = -1
            long r5 = r3 - r10
            long r0 = r3 - r14
            long r5 = r5 & r0
            long r3 = r3 - r5
            long r5 = (long) r8
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r5 = r5 * r0
            long r5 = r5 ^ r3
            long r10 = r5 - r0
            long r0 = ~r5
            r14 = -1
            long r5 = r14 - r0
            long r0 = r14 - r10
            long r5 = r5 | r0
            long r14 = r14 - r5
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r14 + r12
            long r14 = r14 | r12
            long r10 = r10 - r14
        L69:
            r5 = 0
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 == 0) goto L8f
            int r0 = java.lang.Long.numberOfTrailingZeros(r10)
            int r1 = r0 >> 3
            int r1 = r1 + r19
            r1 = r1 & r7
            float[] r0 = r9.keys
            r0 = r0[r1]
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 != 0) goto L85
        L80:
            if (r1 < 0) goto L84
            r18 = r16
        L84:
            return r18
        L85:
            r0 = 1
            long r5 = r10 - r0
            long r0 = r10 + r5
            long r10 = r10 | r5
            long r0 = r0 - r10
            r10 = r0
            goto L69
        L8f:
            long r1 = ~r3
            r0 = 6
            long r1 = r1 << r0
            long r3 = r3 & r1
            long r3 = r3 & r12
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L9a
            r1 = -1
            goto L80
        L9a:
            int r17 = r17 + 8
            int r19 = r19 + r17
            r19 = r19 & r7
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.contains(float):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x008f, code lost:
    
        r0 = (~r4) << 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0099, code lost:
    
        if ((((r4 + r0) - (r4 | r0)) & (-9187201950435737472L)) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009b, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsKey(float r22) {
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
            int r20 = r1 >>> 7
            r20 = r20 & r6
            r19 = 0
            r18 = r19
        L1d:
            long[] r3 = r8.metadata
            int r2 = r20 >> 3
            r0 = 7
            int r1 = (-1) - r20
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
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
            r13 = -1
            long r2 = r13 - r9
            long r0 = r13 - r15
            long r2 = r2 | r0
            long r13 = r13 - r2
        L65:
            r9 = 0
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 == 0) goto L8f
            int r0 = java.lang.Long.numberOfTrailingZeros(r13)
            int r1 = r0 >> 3
            int r1 = r1 + r20
            r1 = r1 & r6
            float[] r0 = r8.keys
            r0 = r0[r1]
            int r0 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r0 != 0) goto L81
        L7c:
            if (r1 < 0) goto L80
            r19 = r17
        L80:
            return r19
        L81:
            r0 = 1
            long r11 = r13 - r0
            r9 = -1
            long r2 = r9 - r13
            long r0 = r9 - r11
            long r2 = r2 | r0
            long r9 = r9 - r2
            r13 = r9
            goto L65
        L8f:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r2 = r4 + r0
            long r4 = r4 | r0
            long r2 = r2 - r4
            long r2 = r2 & r15
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 == 0) goto L9d
            r1 = -1
            goto L7c
        L9d:
            int r18 = r18 + 8
            int r20 = r20 + r18
            int r1 = (-1) - r20
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r20 = (-1) - r1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.containsKey(float):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsValue(V r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object[] r11 = r0.values
            long[] r10 = r0.metadata
            int r0 = r10.length
            int r9 = r0 + (-2)
            r18 = 0
            if (r9 < 0) goto L5a
            r8 = r18
        Lf:
            r3 = r10[r8]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r16 = r0 + r3
            long r0 = r0 | r3
            long r16 = r16 - r0
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = -1
            long r5 = r12 - r16
            long r0 = r12 - r14
            long r5 = r5 | r0
            long r12 = r12 - r5
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L55
            int r0 = r8 - r9
            int r0 = ~r0
            int r0 = r0 >>> 31
            r7 = 8
            int r6 = 8 - r0
            r5 = r18
        L35:
            if (r5 >= r6) goto L53
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r3
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L4f
            int r0 = r8 << 3
            int r0 = r0 + r5
            r0 = r11[r0]
            r1 = r20
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L4f
            r0 = 1
            return r0
        L4f:
            long r3 = r3 >> r7
            int r5 = r5 + 1
            goto L35
        L53:
            if (r6 != r7) goto L5a
        L55:
            if (r8 == r9) goto L5a
            int r8 = r8 + 1
            goto Lf
        L5a:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.containsValue(java.lang.Object):boolean");
    }

    public int hashCode() {
        float[] fArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int iHashCode = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((-1) - (((-1) - (((~j2) << 7) & j2)) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 + j2) - (255 | j2) < 128) {
                            int i6 = (i3 << 3) + i5;
                            float f2 = fArr[i6];
                            Object obj = objArr[i6];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ Float.hashCode(f2);
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

    public final int findKeyIndex$collection(float f2) {
        int iHashCode = Float.hashCode(f2) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = (i2 + 127) - (127 | i2);
        int i4 = this._capacity;
        int i5 = (-1) - (((-1) - (i2 >>> 7)) | ((-1) - i4));
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = ((i5 + 7) - (i5 | 7)) << 3;
            long j2 = jArr[i7] >>> i8;
            long j3 = (jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63);
            long j4 = (j3 + j2) - (j3 & j2);
            long j5 = (((long) i3) * ScatterMapKt.BitmaskLsb) ^ j4;
            long j6 = (-1) - (((-1) - (~j5)) | ((-1) - (j5 - ScatterMapKt.BitmaskLsb)));
            for (long j7 = (j6 - 9187201950435737472L) - (j6 | (-9187201950435737472L)); j7 != 0; j7 &= j7 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i5) & i4;
                if (this.keys[iNumberOfTrailingZeros] == f2) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((-1) - (((-1) - ((-1) - (((-1) - j4) | ((-1) - ((~j4) << 6))))) | ((-1) - (-9187201950435737472L))) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (-1) - (((-1) - (i5 + i6)) | ((-1) - i4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[PHI: r4
  0x00b2: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0058, B:23:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r23, java.lang.CharSequence r24, java.lang.CharSequence r25, int r26, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super V, ? extends java.lang.CharSequence> r27) {
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
            r12 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r11 = "..."
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            float[] r9 = r2.keys
            java.lang.Object[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb9
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
            if (r0 == 0) goto Lad
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L64:
            if (r14 >= r1) goto Lae
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L8c
            int r0 = r5 << 3
            int r0 = r0 + r14
            r16 = r9[r0]
            r15 = r8[r0]
            r0 = r26
            if (r4 != r0) goto L8d
            r10.append(r11)
        L82:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L8c:
            goto La5
        L8d:
            if (r4 == 0) goto L96
            r17 = r10
            r18 = r21
            r17.append(r18)
        L96:
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r12.invoke(r0, r15)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        La5:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r22
            goto L64
        Lad:
            goto Lb2
        Lae:
            r0 = 8
            if (r1 != r0) goto Lb9
        Lb2:
            if (r5 == r6) goto Lb9
            int r5 = r5 + 1
            r0 = r22
            goto L3d
        Lb9:
            r10.append(r13)
            goto L82
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0 A[PHI: r4
  0x00b0: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0057, B:23:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r24, java.lang.CharSequence r25, java.lang.CharSequence r26, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super V, ? extends java.lang.CharSequence> r27) {
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
            r12 = r27
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r11 = "..."
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            float[] r9 = r2.keys
            java.lang.Object[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb7
            r5 = 0
            r4 = 0
        L3d:
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
            if (r0 == 0) goto Lab
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L63:
            if (r14 >= r1) goto Lac
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L8a
            int r0 = r5 << 3
            int r0 = r0 + r14
            r16 = r9[r0]
            r15 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L8b
            r10.append(r11)
        L80:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L8a:
            goto La3
        L8b:
            if (r4 == 0) goto L94
            r17 = r10
            r18 = r22
            r17.append(r18)
        L94:
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r12.invoke(r0, r15)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        La3:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r23
            goto L63
        Lab:
            goto Lb0
        Lac:
            r0 = 8
            if (r1 != r0) goto Lb7
        Lb0:
            if (r5 == r6) goto Lb7
            int r5 = r5 + 1
            r0 = r23
            goto L3d
        Lb7:
            r10.append(r13)
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5 A[PHI: r4
  0x00a5: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x004c, B:23:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r23, java.lang.CharSequence r24, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super V, ? extends java.lang.CharSequence> r25) {
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
            java.lang.String r0 = "transform"
            r13 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r12 = ""
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            java.lang.String r11 = "..."
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            float[] r9 = r2.keys
            java.lang.Object[] r8 = r2.values
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
        L58:
            if (r14 >= r1) goto La1
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L7f
            int r0 = r5 << 3
            int r0 = r0 + r14
            r16 = r9[r0]
            r15 = r8[r0]
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
            r17 = r10
            r18 = r21
            r17.append(r18)
        L89:
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r0, r15)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        L98:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r22
            goto L58
        La0:
            goto La5
        La1:
            r0 = 8
            if (r1 != r0) goto Lac
        La5:
            if (r5 == r6) goto Lac
            int r5 = r5 + 1
            r0 = r22
            goto L39
        Lac:
            r10.append(r12)
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4 A[PHI: r4
  0x00a4: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0052, B:21:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r24, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super V, ? extends java.lang.CharSequence> r25) {
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
            java.lang.Object[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lab
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
            if (r0 == 0) goto La4
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L5e:
            if (r1 >= r14) goto La2
            r16 = 255(0xff, double:1.26E-321)
            long r18 = r2 & r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L81
            int r0 = r5 << 3
            int r0 = r0 + r1
            r16 = r9[r0]
            r15 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L82
            r10.append(r11)
        L77:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L81:
            goto L9c
        L82:
            if (r4 == 0) goto L8b
            r17 = r10
            r18 = r22
            r17.append(r18)
        L8b:
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r0, r15)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L9c:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r23
            goto L5e
        La2:
            if (r14 != r15) goto Lab
        La4:
            if (r5 == r6) goto Lab
            int r5 = r5 + 1
            r0 = r23
            goto L34
        Lab:
            r10.append(r12)
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.joinToString(java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0097 A[PHI: r4
  0x0097: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0043, B:21:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(kotlin.jvm.functions.Function2<? super java.lang.Float, ? super V, ? extends java.lang.CharSequence> r22) {
        /*
            r21 = this;
            r2 = r21
            java.lang.String r1 = "transform"
            r20 = r22
            r0 = r20
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
            java.lang.Object[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L9e
            r5 = 0
            r4 = 0
        L30:
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
            if (r0 == 0) goto L97
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L4f:
            if (r1 >= r14) goto L95
            r16 = 255(0xff, double:1.26E-321)
            long r18 = r2 & r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L72
            int r0 = r5 << 3
            int r0 = r0 + r1
            r16 = r9[r0]
            r15 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L73
            r10.append(r11)
        L68:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L72:
            goto L8f
        L73:
            if (r4 == 0) goto L78
            r10.append(r13)
        L78:
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            r16 = r20
            r17 = r0
            r18 = r15
            java.lang.Object r0 = r16.invoke(r17, r18)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L8f:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r21
            goto L4f
        L95:
            if (r14 != r15) goto L9e
        L97:
            if (r5 == r6) goto L9e
            int r5 = r5 + 1
            r0 = r21
            goto L30
        L9e:
            r10.append(r12)
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.joinToString(kotlin.jvm.functions.Function2):java.lang.String");
    }
}
