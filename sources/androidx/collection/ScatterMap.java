package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&i\u0006DLc\u0003İI\u00066\u000b6B\r(4\u0012}\nnjG?LeN/ZS8#s{:(c$\u007fLC٥\"}8\tWNmgvJh\u0017K\u000f\f\u0016\u0001j:k]xc\u001d\u00172PoG\u074cUoS9ht<\u0005(288\u0002\u0005\u0007!2H&v\u0003CQ\u0010\u001a0N{BR\u0013S\r\u001a(\u0006FĨ\u0007Rrɡv8NǍk9W%\thPNW_^}\u0006\f\u0010\u0015,\u0013xҐ\"+N9}93g\u001b\u0007\u0001po\u0019M\bU\u0017x)7+\u007f֕g8h\u007fJ\u0014;Q\u001d]!;\u000b\u001c\u0018ӧ\u0012̥*Ւ,O^&@w)\u0011U`\u0012&\u001e'vC]0t\u001e&E\u0005tc@\u0007\u061cnD\u0010z\u00185''\u00103YNI}\u0018ĬAуMљD\u0010\u001b7;\u0001\u001d;\"٪\u05f8d\u0015!o@a?mXIXP\u001aYsЧ\u0014rr\u0002`\u0003^dHC\n/F\u0017SL\f=1@\u0004\u0002~ֳ.Ͽ\u0005¾lSwr\u0011Q0\u0010.7X\u001e<^R\u0004\u001dk\u0007ӹг0\u0011[<\u001d\u0018\f*+ \u000b\rl%33fO\u001fhҷQ]\u0018EwjE}\u0007k<[\u0002\u0003AYic>e\u0003\r\"UTt\u0015ZvB\nێj^8\"hGz\u0012\b{rc:*xŴŵ3ιy*j:`\u0003LWq\u0003\u0017\u0006rj&}\u00034j҇il\u000b\u0017(h\\\u001fs\u0018|WK\u0015`XΊ\bٜ;Ԋ*W(\u0011B&kI\r\u001e\u0018G\u0016ww\u0001zB\u000e\u0006\f1&)o֗ȠA\u001d\u0015,98\b[UNxkwl\"8\u000b\f0\u000e³l8m5zv2\u000fzLUZ=E\u0007`\u0003#6\u0010.\u0011(Æ\u0001ūbҺS\tLx\u000b\u0003\bg~W\u000b1795\u0012\u007f1+9ԩG1#C\b\u001a5Cq_ouT+r\u00116t\u0014/Z\u0014\\˳hҌ\\Ц\u0004eW\f\u0017>PO\u001d\"Pt\u0003\u0013\u0018S\u0019CCΉȈEnv\u0004HS\u0011]\u000eh\r23\u0010f]J\u0013\u001e)b^&͏y̎|ж'p3DeS\u0016\u0019\u001ejj7b*\u001a\u001c\f@%\u0011εA*\\\u0005r\u000f64\u0004\u001a<Ga\u0006\u0015>\u0019$bWj8Q͖Zʤ\u0005؋C\u0016T\u0014'\u0019HA*:\u0007\u0012b\u0018tV~γ'ѫ`Ճ.\u0001\rD{7\u0007kI\u0005$E\u00053qQ\u0019SS̿Kn]6~%aCȗ=\u001b6\u0011I0S\u0017[I854K7\r\u0004oBՄH\u0007+y0!IS!_-/\rE\u001c̫Tѿuԣ؉VN0dG\u0001\u000bJT\n=\u000f_c;spjdN&L\f\u001e\u000fU\\)5!EXTZE\u0006cGmOp\u00145<oSi?8&&'\u001279\\\u0006O\u0017\u0010c\u001bHY\n\u0016\u0011C9\u0019V \u0012rbt!\u000e^\u000e<O\u0010x\u001a\u0013\r\u001b\u001c0'@5q\u00058R\\x\b@ɨؼgx[8\u0013l7\u0005\np3VC(7^>\"\u000fYϳ\u0015]&\u0006!\u0006\u001aC6!<\u000e\tL Qsh\u001f-eZ;Bupre?wj\u001e,4B{\u0012rl(CU\u001da\u000ft\u0017_\u0005B\u0006\u0012\u0015ȥf˯Kׅ5ِ\u0001~P՝a#BK\u000b\u001e\u00133m؟]ʺcӓlԥ\bEQ\u008eq@`E37`\u000f&l϶\u0015\u0007Rdz\u00078JY\u0013\u000epD5VXM\u001c=XRn\u0013\r\\ɔ\u0004Я\u0019\u074c8י\u0012\u00197ZF,N^ 'IS\u0004W'\u001e\u0019\u0015f\u0014&ޞWƺAܐ_К.\u0007\u0005ӕ\u001dA\u007f@y<DF\u00013G\u000f\u001e\u001f\u000e+֑)9}N-\u001d\u0010m\u001b\u001f[un\u0017q0Y7[\u001d(Vn\n@٪bڎ\\°/ǪI9P*mhPXyj\u0012(Ĥ5m\u000fïGq\u0001v\u0010ߙ\u001aFr\u0092_-"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u0015\u0013V~\u000eI^!@/", "\u0019", "$", "", "u(E", "-bP=T*Bb-", "", "-rXGX", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "9dh@", "", "5dc\u0018X@L\u0012\u0015\b\u0004h;x\u00183o\t6", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", ";dc.W(MO", "", "5dc\u001aX;:R\u0015\u000ev\u001d(\u0006\u00129t{7\u007fJ\n%", "Ahi2", "5dc \\A>", "D`[BX:", "5dc#T3NS'=vg5\u0007\u0018+t\u00042\u0005N", "/k[", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "/mh", "/r32U<@A(\f~g.", "", "/r32U<@A(\f~g.;\u00079l\u0007(yO\u0005! ", "/r<.c", "", "1n]AT0Ga", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1n]AT0Ga~~\u000f", "1n]AT0Ga\nz\u0002n,", "D`[BX", "1nd;g", "3pd._:", "=sW2e", "4h]1>,R7\"}zq", "4h]1>,R7\"}zqjz\u00136l\u007f&\u000bD\u000b ", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "4na\u0012T*A", "", "0k^0^", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4na\u0012T*A7\"}zq,{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "7mS2k", "4na\u0012T*A9\u0019\u0013", "4na\u0012T*AD\u0015\u0006\u000b^", "5dc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "2dU.h3MD\u0015\u0006\u000b^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4H7|0g\u001cdj;PM)Sv%V\"", "5dc\u001ce\fEa\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010.\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "6`b566=S", "7r4:c;R", "7r=<g\fF^(\u0013", "8nX;G6,b&\u0003\u0004`", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "BqP;f-H`!", "<n]2", "BnBAe0GU", "\u001b`_$e(I^\u0019\f", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r DU\u00129#", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class ScatterMap<K, V> {
    public int _capacity;
    public int _size;
    public Object[] keys;
    public long[] metadata;
    public Object[] values;

    public /* synthetic */ ScatterMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final String joinToString(CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i2) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i2, null, null, 48, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i2, CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i2, truncated, null, 32, null);
    }

    private ScatterMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = ContainerHelpersKt.EMPTY_OBJECTS;
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

    public final V getOrElse(K k2, Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v2 = get(k2);
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
            long j3 = (~j2) << 7;
            long j4 = (j3 + j2) - (j3 | j2);
            if ((j4 - 9187201950435737472L) - (j4 | (-9187201950435737472L)) != -9187201950435737472L) {
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

    public final void forEach(Function2<? super K, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
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
                    if ((255 + j2) - (255 | j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        block.invoke(objArr[i5], objArr2[i5]);
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
            if ((((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2))) & (-9187201950435737472L)) != -9187201950435737472L) {
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
            if ((((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2))) & (-9187201950435737472L)) != -9187201950435737472L) {
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

    public final int count() {
        return getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String joinToString$default(ScatterMap scatterMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function2 function2, int i3, Object obj) {
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
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            function2 = null;
        }
        return scatterMap.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence4, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00af A[PHI: r4
  0x00af: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:43:0x004a, B:64:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r22, java.lang.CharSequence r23, java.lang.CharSequence r24, int r25, java.lang.CharSequence r26, kotlin.jvm.functions.Function2<? super K, ? super V, ? extends java.lang.CharSequence> r27) {
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
            java.lang.String r0 = "postfix"
            r12 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "truncated"
            r11 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            java.lang.Object[] r9 = r2.keys
            java.lang.Object[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb6
            r5 = 0
            r4 = 0
        L39:
            r2 = r7[r5]
            long r0 = ~r2
            r13 = 7
            long r0 = r0 << r13
            long r15 = r0 + r2
            long r0 = r0 | r2
            long r15 = r15 - r0
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r15 = r15 & r13
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 == 0) goto Laa
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r13 = 0
        L56:
            if (r13 >= r1) goto Lab
            r18 = 255(0xff, double:1.26E-321)
            long r16 = r2 + r18
            long r14 = r2 | r18
            long r16 = r16 - r14
            r14 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L7e
            int r14 = r5 << 3
            int r14 = r14 + r13
            r0 = r9[r14]
            r14 = r8[r14]
            r15 = r25
            if (r4 != r15) goto L7f
            r10.append(r11)
        L74:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L7e:
            goto L98
        L7f:
            if (r4 == 0) goto L87
            r15 = r10
            r16 = r20
            r15.append(r16)
        L87:
            r15 = r27
            if (r15 != 0) goto La0
            r10.append(r0)
            r0 = 61
            r10.append(r0)
            r10.append(r14)
        L96:
            int r4 = r4 + 1
        L98:
            r0 = 8
            long r2 = r2 >> r0
            int r13 = r13 + 1
            r0 = r21
            goto L56
        La0:
            java.lang.Object r0 = r15.invoke(r0, r14)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            goto L96
        Laa:
            goto Laf
        Lab:
            r0 = 8
            if (r1 != r0) goto Lb6
        Laf:
            if (r5 == r6) goto Lb6
            int r5 = r5 + 1
            r0 = r21
            goto L39
        Lb6:
            r10.append(r12)
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0074, code lost:
    
        return false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0086  */
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
            boolean r0 = r10 instanceof androidx.collection.ScatterMap
            r19 = 0
            if (r0 != 0) goto L10
            return r19
        L10:
            androidx.collection.ScatterMap r10 = (androidx.collection.ScatterMap) r10
            int r1 = r10.getSize()
            int r0 = r21.getSize()
            if (r1 == r0) goto L1d
            return r19
        L1d:
            java.lang.Object[] r9 = r2.keys
            java.lang.Object[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L8b
            r5 = r19
        L2a:
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
            if (r0 == 0) goto L86
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = r19
        L54:
            if (r4 >= r11) goto L84
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r2
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L80
            int r0 = r5 << 3
            int r0 = r0 + r4
            r13 = r9[r0]
            r1 = r8[r0]
            if (r1 != 0) goto L75
            java.lang.Object r0 = r10.get(r13)
            if (r0 != 0) goto L74
            boolean r0 = r10.containsKey(r13)
            if (r0 != 0) goto L80
        L74:
            return r19
        L75:
            java.lang.Object r0 = r10.get(r13)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L80
            return r19
        L80:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L54
        L84:
            if (r11 != r12) goto L8b
        L86:
            if (r5 == r6) goto L8b
            int r5 = r5 + 1
            goto L2a
        L8b:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x007d A[PHI: r4
  0x007d: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:46:0x0039, B:61:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
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
            java.lang.Object[] r9 = r11.keys
            java.lang.Object[] r8 = r11.values
            long[] r7 = r11.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L82
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
            if (r0 == 0) goto L7d
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r1 = r18
        L46:
            if (r1 >= r12) goto L7b
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r2
            r14 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L77
            int r14 = r5 << 3
            int r14 = r14 + r1
            r0 = r9[r14]
            r15 = r8[r14]
            java.lang.String r14 = "(this)"
            if (r0 != r11) goto L5e
            r0 = r14
        L5e:
            r10.append(r0)
            java.lang.String r0 = "="
            r10.append(r0)
            if (r15 != r11) goto L69
            r15 = r14
        L69:
            r10.append(r15)
            int r4 = r4 + 1
            int r0 = r11._size
            if (r4 >= r0) goto L77
            java.lang.String r0 = ", "
            r10.append(r0)
        L77:
            long r2 = r2 >> r13
            int r1 = r1 + 1
            goto L46
        L7b:
            if (r12 != r13) goto L82
        L7d:
            if (r5 == r6) goto L82
            int r5 = r5 + 1
            goto L24
        L82:
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r10.append(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "s.append('}').toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.toString():java.lang.String");
    }

    public final String asDebugString$collection() {
        StringBuilder sb = new StringBuilder("{metadata=[");
        int capacity = getCapacity();
        for (int i2 = 0; i2 < capacity; i2++) {
            long j2 = (this.metadata[i2 >> 3] >> (((i2 + 7) - (7 | i2)) << 3)) & 255;
            if (j2 == 128) {
                sb.append("Empty");
            } else if (j2 == 254) {
                sb.append("Deleted");
            } else {
                sb.append(j2);
            }
            sb.append(", ");
        }
        sb.append("], keys=[");
        int length = this.keys.length;
        for (int i3 = 0; i3 < length; i3++) {
            sb.append(this.keys[i3]);
            sb.append(", ");
        }
        sb.append("], values=[");
        int length2 = this.values.length;
        for (int i4 = 0; i4 < length2; i4++) {
            sb.append(this.values[i4]);
            sb.append(", ");
        }
        sb.append("]}");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final Map<K, V> asMap() {
        return new MapWrapper();
    }

    /* JADX INFO: compiled from: ScatterMap.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000efLcz\u0004I\u0006>+6B\rF4\u0012}\nnjG6LeN/ZS8+s{:%c$\u007fLCU \u0004(ެQdʴ\u0018zZ\\\u001bCEإ&zz,\u007fT'\\R\u0012̓FoM3\u0016\u0003KIxtd\u0016P60J\u0012\u00057ɝp\\ǘzzQ^T%>T\t:\u0001\u001e}\t('\u001e>V\u007fdpʄR6V\u007f&P=9\u001bkXM]^`\u0001[\u001f^T]˙=҄\u001eҋD7C,mY\u0011\u001fj[m\u0014\u0006\u0006\u000e)v(?=Y\u0002gBh\u0002$\u0015a˽\u001d_\u0003&\u0013\u0004\u007fc:)a$:ֶRˎ,{\u0013}\u0013@\u0012\u0013V?V4E v\n\u001e3+Ɂ\u0002B\u0007V5ۤ\u0002ѐe:/'\u0006:9>kx_iS\u0019|@2Yc̫%ъr%sV\u0014j#&%\u0010_=iFMJ^\n\u0010<\u001c\u0011'7Xæ\u0006ΥK\u0004G}\u0017<%4ۄ_R"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u0015\u0013V~\u000eI^!@\u0018e\u001cB_#*XN;x\n", "", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ\u0005\u0015C~\u001d<\u0004\r1dSc(", "3mc?\\,L", "", "", "5dc\u0012a;KW\u0019\r", "u(;7T=:\u001d)\u000e~euj\t>;", "9dh@", "5dc\u0018X@L", "Ahi2", "", "5dc \\A>", "u(8", "D`[BX:", "", "5dc#T3NS'", "u(;7T=:\u001d)\u000e~euZ\u00136l\u007f&\u000bD\u000b l", "1n]AT0Ga~~\u000f", "", "9dh", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1n]AT0Ga\nz\u0002n,", "D`[BX", "5dc", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "7r4:c;R", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public class MapWrapper implements Map<K, V>, KMappedMarker {
        @Override // java.util.Map
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V compute(K k2, BiFunction<? super K, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V computeIfAbsent(K k2, Function<? super K, ? extends V> function) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V computeIfPresent(K k2, BiFunction<? super K, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V merge(K k2, V v2, BiFunction<? super V, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V put(K k2, V v2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V putIfAbsent(K k2, V v2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public V replace(K k2, V v2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public boolean replace(K k2, V v2, V v3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public MapWrapper() {
        }

        @Override // java.util.Map
        public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
            return getEntries();
        }

        @Override // java.util.Map
        public final /* bridge */ Set<K> keySet() {
            return getKeys();
        }

        @Override // java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.Map
        public final /* bridge */ Collection<V> values() {
            return getValues();
        }

        public Set<Map.Entry<K, V>> getEntries() {
            return new ScatterMap$MapWrapper$entries$1(ScatterMap.this);
        }

        public Set<K> getKeys() {
            return new ScatterMap$MapWrapper$keys$1(ScatterMap.this);
        }

        public Collection<V> getValues() {
            return new ScatterMap$MapWrapper$values$1(ScatterMap.this);
        }

        public int getSize() {
            return ScatterMap.this._size;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return ScatterMap.this.isEmpty();
        }

        @Override // java.util.Map
        public V get(Object obj) {
            return ScatterMap.this.get(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return ScatterMap.this.containsValue(obj);
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return ScatterMap.this.containsKey(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00aa, code lost:
    
        if (((r3 & ((~r3) << 6)) & (-9187201950435737472L)) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ac, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(K r22) {
        /*
            r21 = this;
            r20 = 0
            r9 = r22
            if (r9 == 0) goto Lb4
            int r1 = r9.hashCode()
        La:
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r0 = 127(0x7f, float:1.78E-43)
            int r8 = r1 + r0
            r0 = r0 | r1
            int r8 = r8 - r0
            r10 = r21
            int r7 = r10._capacity
            int r0 = r1 >>> 7
        L1d:
            int r19 = r0 + r7
            r0 = r0 | r7
            int r19 = r19 - r0
            long[] r3 = r10.metadata
            int r2 = r19 >> 3
            r0 = 7
            int r1 = (-1) - r19
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            int r1 = r0 << 3
            r15 = r3[r2]
            long r15 = r15 >>> r1
            int r0 = r2 + 1
            r13 = r3[r0]
            int r0 = 64 - r1
            long r13 = r13 << r0
            long r0 = (long) r1
            long r2 = -r0
            r0 = 63
            long r2 = r2 >> r0
            r11 = -1
            long r4 = r11 - r13
            long r0 = r11 - r2
            long r4 = r4 | r0
            long r11 = r11 - r4
            r3 = -1
            long r5 = r3 - r11
            long r0 = r3 - r15
            long r5 = r5 & r0
            long r3 = r3 - r5
            long r5 = (long) r8
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r5 = r5 * r0
            long r5 = r5 ^ r3
            long r13 = r5 - r0
            long r0 = ~r5
            r11 = -1
            long r5 = r11 - r0
            long r0 = r11 - r13
            long r5 = r5 | r0
            long r11 = r11 - r5
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r15 = r11 + r17
            long r11 = r11 | r17
            long r15 = r15 - r11
        L6c:
            r5 = 0
            int r0 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r0 == 0) goto La2
            int r0 = java.lang.Long.numberOfTrailingZeros(r15)
            int r0 = r0 >> 3
            int r0 = r0 + r19
            int r1 = (-1) - r0
            int r0 = (-1) - r7
            r1 = r1 | r0
            int r1 = (-1) - r1
            java.lang.Object[] r0 = r10.keys
            r0 = r0[r1]
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r9)
            if (r0 == 0) goto L94
        L8b:
            if (r1 < 0) goto L92
            java.lang.Object[] r0 = r10.values
            r0 = r0[r1]
        L91:
            return r0
        L92:
            r0 = 0
            goto L91
        L94:
            r0 = 1
            long r13 = r15 - r0
            r11 = -1
            long r5 = r11 - r15
            long r0 = r11 - r13
            long r5 = r5 | r0
            long r11 = r11 - r5
            r15 = r11
            goto L6c
        La2:
            long r1 = ~r3
            r0 = 6
            long r1 = r1 << r0
            long r3 = r3 & r1
            long r3 = r3 & r17
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto Lae
            r1 = -1
            goto L8b
        Lae:
            int r20 = r20 + 8
            int r0 = r19 + r20
            goto L1d
        Lb4:
            r1 = r20
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.get(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        r12 = (-1) - (((-1) - r4) | ((-1) - ((~r4) << 6)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        if (((r12 - 9187201950435737472L) - (r12 | (-9187201950435737472L))) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a2, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V getOrDefault(K r23, V r24) {
        /*
            r22 = this;
            r21 = 0
            r9 = r23
            if (r9 == 0) goto Laa
            int r1 = r9.hashCode()
        La:
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r0 = 127(0x7f, float:1.78E-43)
            r7 = r1 & r0
            r8 = r22
            int r6 = r8._capacity
            int r0 = r1 >>> 7
        L1b:
            int r20 = r0 + r6
            r0 = r0 | r6
            int r20 = r20 - r0
            long[] r3 = r8.metadata
            int r2 = r20 >> 3
            r0 = 7
            int r1 = (-1) - r20
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            int r1 = r0 << 3
            r12 = r3[r2]
            long r12 = r12 >>> r1
            int r0 = r2 + 1
            r10 = r3[r0]
            int r0 = 64 - r1
            long r10 = r10 << r0
            long r2 = (long) r1
            long r0 = -r2
            r2 = 63
            long r0 = r0 >> r2
            long r10 = r10 & r0
            long r4 = r10 + r12
            long r10 = r10 & r12
            long r4 = r4 - r10
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r12 = r2 - r0
            long r0 = ~r2
            long r10 = r0 + r12
            long r0 = r0 | r12
            long r10 = r10 - r0
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r16 = -1
            long r2 = r16 - r10
            long r0 = r16 - r18
            long r2 = r2 | r0
            long r16 = r16 - r2
        L5f:
            r14 = 0
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 == 0) goto L8e
            int r0 = java.lang.Long.numberOfTrailingZeros(r16)
            int r1 = r0 >> 3
            int r1 = r1 + r20
            r1 = r1 & r6
            java.lang.Object[] r0 = r8.keys
            r0 = r0[r1]
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r9)
            if (r0 == 0) goto L7f
        L78:
            if (r1 < 0) goto Lae
            java.lang.Object[] r0 = r8.values
            r0 = r0[r1]
            return r0
        L7f:
            r0 = 1
            long r12 = r16 - r0
            r10 = -1
            long r2 = r10 - r16
            long r0 = r10 - r12
            long r2 = r2 | r0
            long r10 = r10 - r2
            r16 = r10
            goto L5f
        L8e:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            r12 = -1
            long r10 = r12 - r4
            long r2 = r12 - r0
            long r10 = r10 | r2
            long r12 = r12 - r10
            long r1 = r12 + r18
            long r12 = r12 | r18
            long r1 = r1 - r12
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 == 0) goto La4
            r1 = -1
            goto L78
        La4:
            int r21 = r21 + 8
            int r0 = r20 + r21
            goto L1b
        Laa:
            r1 = r21
            goto La
        Lae:
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.getOrDefault(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final boolean all(Function2<? super K, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
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
                        if (!predicate.invoke(objArr[i5], objArr2[i5]).booleanValue()) {
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

    /* JADX WARN: Removed duplicated region for block: B:43:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Boolean> r21) {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r0 = "predicate"
            r10 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.Object[] r9 = r1.keys
            java.lang.Object[] r8 = r1.values
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            r19 = 0
            if (r6 < 0) goto L71
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
            if (r0 == 0) goto L6c
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = r19
        L43:
            if (r4 >= r11) goto L6a
            r0 = 255(0xff, double:1.26E-321)
            long r15 = r0 + r2
            long r0 = r0 | r2
            long r15 = r15 - r0
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L66
            int r0 = r5 << 3
            int r0 = r0 + r4
            r1 = r9[r0]
            r0 = r8[r0]
            java.lang.Object r0 = r10.invoke(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L66
            r0 = 1
            return r0
        L66:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L43
        L6a:
            if (r11 != r12) goto L71
        L6c:
            if (r5 == r6) goto L71
            int r5 = r5 + 1
            goto L19
        L71:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.any(kotlin.jvm.functions.Function2):boolean");
    }

    public final int count(Function2<? super K, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2))) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 + j2) - (255 | j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            if (predicate.invoke(objArr[i7], objArr2[i7]).booleanValue()) {
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

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        if (((-1) - (((-1) - ((-1) - (((-1) - r4) | ((-1) - ((~r4) << 6))))) | ((-1) - (-9187201950435737472L)))) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(K r23) {
        /*
            r22 = this;
            r8 = r22
            r21 = 0
            r9 = r23
            if (r9 == 0) goto Lb9
            int r2 = r9.hashCode()
        Lc:
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
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r20 = (-1) - r1
            r19 = r21
        L29:
            long[] r3 = r8.metadata
            int r2 = r20 >> 3
            r0 = 7
            r0 = r20 & r0
            int r1 = r0 << 3
            r10 = r3[r2]
            long r10 = r10 >>> r1
            r18 = 1
            int r2 = r2 + r18
            r4 = r3[r2]
            int r0 = 64 - r1
            long r4 = r4 << r0
            long r0 = (long) r1
            long r2 = -r0
            r0 = 63
            long r2 = r2 >> r0
            long r0 = r4 + r2
            long r4 = r4 | r2
            long r0 = r0 - r4
            r4 = -1
            long r2 = r4 - r0
            long r0 = r4 - r10
            long r2 = r2 & r0
            long r4 = r4 - r2
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r10 = r2 - r0
            long r0 = ~r2
            r12 = -1
            long r2 = r12 - r0
            long r0 = r12 - r10
            long r2 = r2 | r0
            long r12 = r12 - r2
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r10 = -1
            long r2 = r10 - r12
            long r0 = r10 - r16
            long r2 = r2 | r0
            long r10 = r10 - r2
        L6f:
            r14 = 0
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 == 0) goto L93
            int r0 = java.lang.Long.numberOfTrailingZeros(r10)
            int r1 = r0 >> 3
            int r1 = r1 + r20
            r1 = r1 & r6
            java.lang.Object[] r0 = r8.keys
            r0 = r0[r1]
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r9)
            if (r0 == 0) goto L8d
        L88:
            if (r1 < 0) goto L8c
            r21 = r18
        L8c:
            return r21
        L8d:
            r2 = 1
            long r0 = r10 - r2
            long r10 = r10 & r0
            goto L6f
        L93:
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
            if (r0 == 0) goto Lac
            r1 = -1
            goto L88
        Lac:
            int r19 = r19 + 8
            int r20 = r20 + r19
            int r1 = (-1) - r20
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r20 = (-1) - r1
            goto L29
        Lb9:
            r2 = r21
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.contains(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        r12 = (-1) - (((-1) - r4) | ((-1) - ((~r4) << 6)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
    
        if (((r12 - 9187201950435737472L) - (r12 | (-9187201950435737472L))) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b1, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsKey(K r25) {
        /*
            r24 = this;
            r8 = r24
            r23 = 0
            r9 = r25
            if (r9 == 0) goto Lc0
            int r1 = r9.hashCode()
        Lc:
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r0 = 127(0x7f, float:1.78E-43)
            r7 = r1 & r0
            int r6 = r8._capacity
            int r0 = r1 >>> 7
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r22 = (-1) - r1
            r21 = r23
        L24:
            long[] r3 = r8.metadata
            int r2 = r22 >> 3
            r0 = 7
            int r1 = (-1) - r22
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            int r1 = r0 << 3
            r14 = r3[r2]
            long r14 = r14 >>> r1
            r20 = 1
            int r2 = r2 + r20
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
            long r4 = r10 + r14
            long r10 = r10 & r14
            long r4 = r4 - r10
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r12 = r2 - r0
            long r0 = ~r2
            r10 = -1
            long r2 = r10 - r0
            long r0 = r10 - r12
            long r2 = r2 | r0
            long r10 = r10 - r2
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r16 = r10 + r18
            long r10 = r10 | r18
            long r16 = r16 - r10
        L6d:
            r14 = 0
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 == 0) goto L9d
            int r0 = java.lang.Long.numberOfTrailingZeros(r16)
            int r0 = r0 >> 3
            int r0 = r0 + r22
            int r1 = r0 + r6
            r0 = r0 | r6
            int r1 = r1 - r0
            java.lang.Object[] r0 = r8.keys
            r0 = r0[r1]
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r9)
            if (r0 == 0) goto L8e
        L89:
            if (r1 < 0) goto L8d
            r23 = r20
        L8d:
            return r23
        L8e:
            r0 = 1
            long r12 = r16 - r0
            r10 = -1
            long r2 = r10 - r16
            long r0 = r10 - r12
            long r2 = r2 | r0
            long r10 = r10 - r2
            r16 = r10
            goto L6d
        L9d:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            r12 = -1
            long r10 = r12 - r4
            long r2 = r12 - r0
            long r10 = r10 | r2
            long r12 = r12 - r10
            long r1 = r12 + r18
            long r12 = r12 | r18
            long r1 = r1 - r12
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 == 0) goto Lb3
            r1 = -1
            goto L89
        Lb3:
            int r21 = r21 + 8
            int r22 = r22 + r21
            int r1 = (-1) - r22
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r22 = (-1) - r1
            goto L24
        Lc0:
            r1 = r23
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.containsKey(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0058  */
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
            if (r9 < 0) goto L5d
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
            if (r0 == 0) goto L58
            int r0 = r8 - r9
            int r0 = ~r0
            int r0 = r0 >>> 31
            r7 = 8
            int r6 = 8 - r0
            r5 = r18
        L35:
            if (r5 >= r6) goto L56
            r0 = 255(0xff, double:1.26E-321)
            long r12 = r0 + r3
            long r0 = r0 | r3
            long r12 = r12 - r0
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L52
            int r0 = r8 << 3
            int r0 = r0 + r5
            r0 = r11[r0]
            r1 = r20
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L52
            r0 = 1
            return r0
        L52:
            long r3 = r3 >> r7
            int r5 = r5 + 1
            goto L35
        L56:
            if (r6 != r7) goto L5d
        L58:
            if (r8 == r9) goto L5d
            int r8 = r8 + 1
            goto Lf
        L5d:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap.containsValue(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
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
                        if ((255 + j2) - (255 | j2) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    public final int findKeyIndex$collection(K k2) {
        int i2 = 0;
        int iHashCode = (k2 != null ? k2.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = (i3 + 127) - (127 | i3);
        int i5 = this._capacity;
        int i6 = i3 >>> 7;
        while (true) {
            int i7 = (i6 + i5) - (i6 | i5);
            long[] jArr = this.metadata;
            int i8 = i7 >> 3;
            int i9 = ((-1) - (((-1) - i7) | ((-1) - 7))) << 3;
            long j2 = jArr[i8] >>> i9;
            long j3 = (jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63);
            long j4 = (j3 + j2) - (j3 & j2);
            long j5 = (((long) i4) * ScatterMapKt.BitmaskLsb) ^ j4;
            long j6 = j5 - ScatterMapKt.BitmaskLsb;
            long j7 = ~j5;
            for (long j8 = (-1) - (((-1) - ((j7 + j6) - (j7 | j6))) | ((-1) - (-9187201950435737472L))); j8 != 0; j8 = (-1) - (((-1) - j8) | ((-1) - (j8 - 1)))) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j8) >> 3) + i7) & i5;
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], k2)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((-1) - (((-1) - (j4 & ((~j4) << 6))) | ((-1) - (-9187201950435737472L))) != 0) {
                return -1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
    }
}
