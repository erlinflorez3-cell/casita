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
/* JADX INFO: compiled from: IntObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яp\u001d<K!&˛\bDRш|\u0004G\u00068\u000b<H\u0007\"2\u0017\u007f\u0007t}A0JeP.`g2\u000fq}<$i3yCAV\"}0\u0012WȞog\u0005Jb\u000bI\u001a\u000e\u0016\u0007j4կ]xs\u0012\u00172HoG3coE9f{>\u000562*8\u007f\b\t\u001a8T\u0018͌\u0003CY\u0017\u001a0FuBR#M\r܅\u0018:TĨ) bɡ\\5xl\f:o(\tkŌR'm1Eq\u001b\\l';\u000e\u001249XOG%'c\u00035UkA\u0013?(ܵ\u0015j7'Y`\"p|ݠ\u0006ѥ\u0014ۀ\u0018\u0011k\r>\\3h)05Egcyg>>\u0006\u0013\u0014\u001fL\u0006\u001e\u0006UK>/*f>ԄCv\u0003Sng0w\tȜ\u0001̡5Ѝm\u000fAFQ\u001b\u0015h\u0012?'jO{3\u0010dŇ\u00017-iq&`C2\u0005{_Mi@kK\u0017\u001bg[\u0006\u0004\u001fy2.\u0012O_\u007feɅ 2\u00173W$=1B\u0004\u0002vG0\u001b\u0013\u0002\u0001S\u0018UxV0\u0007.I:\u000b\u001cZrg\u0015m`T\u000f\u008c!O,T5\u00156,fφ}͌ طX_]\u000b\u0002j{t:+=\nO[\u0005j<W\u007fӫ3}eq4yR%\u0017o@p!pfpVRȘb͈&2N\u0010X:\njf\fAYo&*\\Da)m%W1!նE\u0007\u000f\tjn\u0016)d5*\t\u0010@\u0005\u001a\u0011_\u0013ʙ״k\u0003OU\rf(WQS;\u001fLt2jD|Q.-\rFÿmׯFƂ5C\u0004\u0001\u0014 DAip=e+*\u000f:B\u0011[HʆvoWv\"-\u0001'\n\u0011AnT\u0015\u0018l\u0001,\u000f\u0012x{\u001bϡ(֧]аk5r.\u0012at\"w\u0003b3sYY\u0004\u0013hjQ̞\u0001\u000f%G5\u0007uL\r73IM9&y$/C\t\f\u00166Њ\u007f̥\u000eծ=\u0013\u0012[{\u0016\u001e\n\u0002|@cPdi\u0010N1ZЗúFRp!\u0018H\u000f^\u001d5NG\u000b\u0010f:]\u000b]%\u00153rݿvĜZƥ[\u0006\fdFa@ry͟DbQA)M\u0002j4\u07b5Ků\u000fJ\u001d;S\u0015?!*\u001csղ\u0007[p%H\u0006\"\u001bfEI\u0016\u001d<?ӗҬ0<\u0016?\fyw;(z6ʋ\u0010\u0013%NZsiY>^\u0007\u0010nN\u0015bU`Wơ/5Uʃ$ئ4̍ܭqFbf,8\u000f\f5\tIm\u0016\u0013/)9}l9I?!\u0005\u0019\u007fuCw\u0019~<Ud\u0006k\u001eHh\u001e\u0003\u001dPU39\u007fO\u0010|6^\u0019\u0015|N\u00135BlXN0i\u0017z+Ll\u0010\u0015\u000b'\u0011\u000bo\u00110|T}7Q\\\u0019\u0017rgM\u0011EZTVE\u0006cimOp\u001459oSi<8&&'\u001249\\\u0006L\u0017\u0010c\u001bHV\n\u0016\u0011@9\u0019V \u0012obt!\r^\u000e<O\u0010u\u001a\u0013\r\u0018\u001c.'B5n\u00056R\\x\b8fؼgx[4\u0013l7\u0001\np3VC%7^>\"\u000fŔϳ\u0015]&\u0002!\u0006\u001a?6!<\u000e\tH Qsh\u001f*}tSē5\u05ed)ԝy4`b\u0016\u001f(\rL0bm-;\u0005\n\u0005xYrzDo\u000e\rm^˯3׃\u007fد\t۫Ld\u0019ӂDHx\"r0\b/-`%G\u000f\n:ـ\b\u008ewܒ^̫\u001f=:У\u007f*|\u0017\u0011;3\u0004\u000e1Z\t!\u0003\u001ep\u0082JXU\u001c-a2v5\u00194U]8p\u0013bֶLı\u0006զDԯBb\"ˡKS9M'\u0012Q+F\u0013\b\u0007GC!\u070e\u0012Ϸ\u0001ʊ\tӸ\u0011E\u0002ۧ{<yF\u0001$\u007f\u001e}+ofi(k*ͺ+\u0010\u001agP\u0010[l'/o>a=U\"\nWV~8\u001fR7<®aǇ\u001cʻT\u008dcdHV\u0002l\u0014(0J|EïFk?݈\n1q\u001by\u0083\f\u00103ъ~["}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &1l\u0013<t4\u001dU\tu", "$", "", "u(E", "-bP=T*Bb-", "", "5dc,V(IO\u0017\u0003\nrjz\u00136l\u007f&\u000bD\u000b UCx\u0017F\u0006!D]\b)E", "-rXGX", "5dc,f0SSW|\u0005e3|\u0007>i\n1:<\n !Vk\u001d@\u0001.C", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "9dh@", "", "5dc\u0018X@L\u0012\u0015\b\u0004h;x\u00183o\t6", ";dc.W(MO", "", "5dc\u001aX;:R\u0015\u000ev\u001d(\u0006\u00129t{7\u007fJ\n%", "Ahi2", "5dc \\A>", "D`[BX:", "", "5dc#T3NS'=vg5\u0007\u0018+t\u00042\u0005N", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "/k[", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "/mh", "1n]AT0Ga", "9dh", "1n]AT0Ga~~\u000f", "1n]AT0Ga\nz\u0002n,", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1nd;g", "3pd._:", "=sW2e", "4h]1>,R7\"}zq", "4h]1>,R7\"}zqjz\u00136l\u007f&\u000bD\u000b ", "4na\u0012T*A", "", "0k^0^", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4na\u0012T*A7\"}zq,{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "7mS2k", "4na\u0012T*A9\u0019\u0013", "4na\u0012T*AD\u0015\u0006\u000b^", "5dc", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "2dU.h3MD\u0015\u0006\u000b^", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "5dc\u001ce\fEa\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHuzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "6`b566=S", "7r4:c;R", "7r=<g\fF^(\u0013", "8nX;G6,b&\u0003\u0004`", "", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "BqP;f-H`!", "<n]2", "BnBAe0GU", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.DCz%7k%\u0016IN\u0011", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class IntObjectMap<V> {
    public int _capacity;
    public int _size;
    public int[] keys;
    public long[] metadata;
    public Object[] values;

    public /* synthetic */ IntObjectMap(DefaultConstructorMarker defaultConstructorMarker) {
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

    private IntObjectMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = IntSetKt.getEmptyIntArray();
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

    public final V getOrElse(int i2, Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v2 = get(i2);
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
            if ((((j3 + j2) - (j3 | j2)) & (-9187201950435737472L)) != -9187201950435737472L) {
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

    public final void forEach(Function2<? super Integer, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                        block.invoke(Integer.valueOf(iArr[i5]), objArr[i5]);
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
            long j3 = (~j2) << 7;
            if ((((j3 + j2) - (j3 | j2)) & (-9187201950435737472L)) != -9187201950435737472L) {
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

    public final int count() {
        return getSize();
    }

    public static /* synthetic */ String joinToString$default(IntObjectMap intObjectMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
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
        return intObjectMap.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9 A[PHI: r4
  0x00a9: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0052, B:22:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
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
            java.lang.Object[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb0
            r5 = 0
            r4 = 0
        L39:
            r2 = r7[r5]
            long r0 = ~r2
            r13 = 7
            long r0 = r0 << r13
            long r19 = r0 + r2
            long r0 = r0 | r2
            long r19 = r19 - r0
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r15 = -1
            long r13 = r15 - r19
            long r0 = r15 - r17
            long r13 = r13 | r0
            long r15 = r15 - r13
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 == 0) goto La6
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r1 = 8
            int r14 = 8 - r0
            r13 = 0
        L5e:
            if (r13 >= r14) goto La7
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L87
            int r0 = r5 << 3
            int r0 = r0 + r13
            r15 = r9[r0]
            r1 = r8[r0]
            r0 = r26
            r0 = r0
            if (r4 != r0) goto L88
            r10.append(r11)
        L7d:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L87:
            goto La0
        L88:
            if (r4 == 0) goto L91
            r16 = r10
            r17 = r21
            r16.append(r17)
        L91:
            r10.append(r15)
            r0 = 61
            r10.append(r0)
            r10.append(r1)
            int r4 = r4 + 1
            r1 = 8
        La0:
            long r2 = r2 >> r1
            int r13 = r13 + 1
            r0 = r22
            goto L5e
        La6:
            goto La9
        La7:
            if (r14 != r1) goto Lb0
        La9:
            if (r5 == r6) goto Lb0
            int r5 = r5 + 1
            r0 = r22
            goto L39
        Lb0:
            r10.append(r12)
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5 A[PHI: r4
  0x00f5: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:23:0x0099, B:39:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.IntObjectMap r19, java.lang.CharSequence r20, java.lang.CharSequence r21, java.lang.CharSequence r22, int r23, java.lang.CharSequence r24, kotlin.jvm.functions.Function2 r25, int r26, java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.joinToString$default(androidx.collection.IntObjectMap, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2, int, java.lang.Object):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9 A[PHI: r4
  0x00b9: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x005f, B:23:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r24, java.lang.CharSequence r25, java.lang.CharSequence r26, int r27, java.lang.CharSequence r28, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super V, ? extends java.lang.CharSequence> r29) {
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
            java.lang.String r0 = "truncated"
            r12 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "transform"
            r11 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            int[] r9 = r2.keys
            java.lang.Object[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lc0
            r5 = 0
            r4 = 0
        L41:
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
            if (r0 == 0) goto Lb4
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L6b:
            if (r14 >= r1) goto Lb5
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L93
            int r0 = r5 << 3
            int r0 = r0 + r14
            r16 = r9[r0]
            r15 = r8[r0]
            r0 = r27
            if (r4 != r0) goto L94
            r10.append(r12)
        L89:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L93:
            goto Lac
        L94:
            if (r4 == 0) goto L9d
            r17 = r10
            r18 = r22
            r17.append(r18)
        L9d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object r0 = r11.invoke(r0, r15)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        Lac:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r23
            goto L6b
        Lb4:
            goto Lb9
        Lb5:
            r0 = 8
            if (r1 != r0) goto Lc0
        Lb9:
            if (r5 == r6) goto Lc0
            int r5 = r5 + 1
            r0 = r23
            goto L41
        Lc0:
            r10.append(r13)
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
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
            boolean r0 = r10 instanceof androidx.collection.IntObjectMap
            r17 = 0
            if (r0 != 0) goto L10
            return r17
        L10:
            androidx.collection.IntObjectMap r10 = (androidx.collection.IntObjectMap) r10
            int r1 = r10.getSize()
            int r0 = r19.getSize()
            if (r1 == r0) goto L1d
            return r17
        L1d:
            int[] r9 = r2.keys
            java.lang.Object[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L8a
            r5 = r17
        L2a:
            r2 = r7[r5]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = -1
            long r11 = r13 - r0
            long r0 = r13 - r15
            long r11 = r11 | r0
            long r13 = r13 - r11
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L85
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = r17
        L4c:
            if (r4 >= r11) goto L83
            r0 = 255(0xff, double:1.26E-321)
            r15 = -1
            long r13 = r15 - r0
            long r0 = r15 - r2
            long r13 = r13 | r0
            long r15 = r15 - r13
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L7f
            int r0 = r5 << 3
            int r0 = r0 + r4
            r13 = r9[r0]
            r1 = r8[r0]
            if (r1 != 0) goto L74
            java.lang.Object r0 = r10.get(r13)
            if (r0 != 0) goto L73
            boolean r0 = r10.containsKey(r13)
            if (r0 != 0) goto L7f
        L73:
            return r17
        L74:
            java.lang.Object r0 = r10.get(r13)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L7f
            return r17
        L7f:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L4c
        L83:
            if (r11 != r12) goto L8a
        L85:
            if (r5 == r6) goto L8a
            int r5 = r5 + 1
            goto L2a
        L8a:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0081 A[PHI: r4
  0x0081: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:10:0x0041, B:22:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r21 = this;
            r11 = r21
            boolean r0 = r21.isEmpty()
            if (r0 == 0) goto Lc
            java.lang.String r0 = "{}"
            return r0
        Lc:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "{"
            r10.<init>(r0)
            int[] r9 = r11.keys
            java.lang.Object[] r8 = r11.values
            long[] r7 = r11.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L86
            r20 = 0
            r5 = r20
            r4 = r5
        L24:
            r2 = r7[r5]
            long r0 = ~r2
            r12 = 7
            long r0 = r0 << r12
            r18 = -1
            long r12 = r18 - r0
            long r0 = r18 - r2
            long r12 = r12 | r0
            long r18 = r18 - r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r14 = -1
            long r12 = r14 - r18
            long r0 = r14 - r16
            long r12 = r12 | r0
            long r14 = r14 - r12
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto L81
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r1 = r20
        L4e:
            if (r1 >= r12) goto L7f
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r2
            r14 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L7b
            int r14 = r5 << 3
            int r14 = r14 + r1
            r0 = r9[r14]
            r14 = r8[r14]
            r10.append(r0)
            java.lang.String r0 = "="
            r10.append(r0)
            if (r14 != r11) goto L6d
            java.lang.String r14 = "(this)"
        L6d:
            r10.append(r14)
            int r4 = r4 + 1
            int r0 = r11._size
            if (r4 >= r0) goto L7b
            java.lang.String r0 = ", "
            r10.append(r0)
        L7b:
            long r2 = r2 >> r13
            int r1 = r1 + 1
            goto L4e
        L7f:
            if (r12 != r13) goto L86
        L81:
            if (r5 == r6) goto L86
            int r5 = r5 + 1
            goto L24
        L86:
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r10.append(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "s.append('}').toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008f, code lost:
    
        r0 = (~r4) << 6;
        r10 = (r4 + r0) - (r4 | r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009c, code lost:
    
        if (((r10 - 9187201950435737472L) - (r10 | (-9187201950435737472L))) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009e, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(int r19) {
        /*
            r18 = this;
            r8 = r19
            int r1 = java.lang.Integer.hashCode(r8)
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r0 = 127(0x7f, float:1.78E-43)
            int r7 = r1 + r0
            r0 = r0 | r1
            int r7 = r7 - r0
            r9 = r18
            int r6 = r9._capacity
            int r17 = r1 >>> 7
            r17 = r17 & r6
            r16 = 0
        L1d:
            long[] r3 = r9.metadata
            int r2 = r17 >> 3
            r0 = 7
            r0 = r17 & r0
            int r1 = r0 << 3
            r14 = r3[r2]
            long r14 = r14 >>> r1
            int r0 = r2 + 1
            r12 = r3[r0]
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
            r4 = -1
            long r2 = r4 - r10
            long r0 = r4 - r14
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
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r12 + r14
            long r12 = r12 | r14
            long r10 = r10 - r12
        L61:
            r12 = 0
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L8f
            int r0 = java.lang.Long.numberOfTrailingZeros(r10)
            int r0 = r0 >> 3
            int r0 = r0 + r17
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r1 = (-1) - r1
            int[] r0 = r9.keys
            r0 = r0[r1]
            if (r0 != r8) goto L85
        L7c:
            if (r1 < 0) goto L83
            java.lang.Object[] r0 = r9.values
            r0 = r0[r1]
        L82:
            return r0
        L83:
            r0 = 0
            goto L82
        L85:
            r0 = 1
            long r2 = r10 - r0
            long r0 = r10 + r2
            long r10 = r10 | r2
            long r0 = r0 - r10
            r10 = r0
            goto L61
        L8f:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r10 = r4 + r0
            long r4 = r4 | r0
            long r10 = r10 - r4
            long r1 = r10 + r14
            long r10 = r10 | r14
            long r1 = r1 - r10
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 == 0) goto La0
            r1 = -1
            goto L7c
        La0:
            int r16 = r16 + 8
            int r17 = r17 + r16
            int r0 = r17 + r6
            r17 = r17 | r6
            int r0 = r0 - r17
            r17 = r0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.get(int):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0092, code lost:
    
        if (((-1) - (((-1) - (r4 & ((~r4) << 6))) | ((-1) - (-9187201950435737472L)))) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0094, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V getOrDefault(int r19, V r20) {
        /*
            r18 = this;
            r9 = r19
            int r1 = java.lang.Integer.hashCode(r9)
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r0 = 127(0x7f, float:1.78E-43)
            int r7 = r1 + r0
            r0 = r0 | r1
            int r7 = r7 - r0
            r8 = r18
            int r6 = r8._capacity
            int r0 = r1 >>> 7
            int r17 = r0 + r6
            r0 = r0 | r6
            int r17 = r17 - r0
            r16 = 0
        L20:
            long[] r3 = r8.metadata
            int r2 = r17 >> 3
            r0 = 7
            int r1 = (-1) - r17
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            int r1 = r0 << 3
            r10 = r3[r2]
            long r10 = r10 >>> r1
            int r0 = r2 + 1
            r4 = r3[r0]
            int r0 = 64 - r1
            long r4 = r4 << r0
            long r2 = (long) r1
            long r0 = -r2
            r2 = 63
            long r0 = r0 >> r2
            long r4 = r4 & r0
            long r4 = r4 | r10
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
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r14
        L58:
            r12 = 0
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L84
            int r0 = java.lang.Long.numberOfTrailingZeros(r10)
            int r0 = r0 >> 3
            int r0 = r0 + r17
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r1 = (-1) - r1
            int[] r0 = r8.keys
            r0 = r0[r1]
            if (r0 != r9) goto L7a
        L73:
            if (r1 < 0) goto La4
            java.lang.Object[] r0 = r8.values
            r0 = r0[r1]
            return r0
        L7a:
            r0 = 1
            long r2 = r10 - r0
            long r0 = r10 + r2
            long r10 = r10 | r2
            long r0 = r0 - r10
            r10 = r0
            goto L58
        L84:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r4 = r4 & r0
            r10 = -1
            long r2 = r10 - r4
            long r0 = r10 - r14
            long r2 = r2 | r0
            long r10 = r10 - r2
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L96
            r1 = -1
            goto L73
        L96:
            int r16 = r16 + 8
            int r17 = r17 + r16
            int r0 = r17 + r6
            r17 = r17 | r6
            int r0 = r0 - r17
            r17 = r0
            goto L20
        La4:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.getOrDefault(int, java.lang.Object):java.lang.Object");
    }

    public final boolean all(Function2<? super Integer, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            long j3 = (~j2) << 7;
            long j4 = (j3 + j2) - (j3 | j2);
            if ((j4 - 9187201950435737472L) - (j4 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (!predicate.invoke(Integer.valueOf(iArr[i5]), objArr[i5]).booleanValue()) {
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super V, java.lang.Boolean> r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "predicate"
            r10 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int[] r9 = r1.keys
            java.lang.Object[] r8 = r1.values
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            r17 = 0
            if (r6 < 0) goto L69
            r5 = r17
        L19:
            r2 = r7[r5]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r0 + r13
            long r0 = r0 | r13
            long r11 = r11 - r0
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L64
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = r17
        L37:
            if (r4 >= r11) goto L62
            r0 = 255(0xff, double:1.26E-321)
            long r15 = r0 + r2
            long r0 = r0 | r2
            long r15 = r15 - r0
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L5e
            int r1 = r5 << 3
            int r1 = r1 + r4
            r0 = r9[r1]
            r1 = r8[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r10.invoke(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5e
            r0 = 1
            return r0
        L5e:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L37
        L62:
            if (r11 != r12) goto L69
        L64:
            if (r5 == r6) goto L69
            int r5 = r5 + 1
            goto L19
        L69:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.any(kotlin.jvm.functions.Function2):boolean");
    }

    public final int count(Function2<? super Integer, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                            if (predicate.invoke(Integer.valueOf(iArr[i7]), objArr[i7]).booleanValue()) {
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009b, code lost:
    
        if ((((-1) - (((-1) - r4) | ((-1) - ((~r4) << 6)))) & (-9187201950435737472L)) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009d, code lost:
    
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
            int r2 = java.lang.Integer.hashCode(r9)
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
            int r21 = (-1) - r1
            r20 = 0
            r19 = r20
        L27:
            long[] r3 = r8.metadata
            int r2 = r21 >> 3
            r0 = 7
            int r1 = r21 + r0
            r0 = r21 | r0
            int r1 = r1 - r0
            int r1 = r1 << 3
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
        L66:
            r14 = 0
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 == 0) goto L8c
            int r0 = java.lang.Long.numberOfTrailingZeros(r10)
            int r0 = r0 >> 3
            int r0 = r0 + r21
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r1 = (-1) - r1
            int[] r0 = r8.keys
            r0 = r0[r1]
            if (r0 != r9) goto L86
        L81:
            if (r1 < 0) goto L85
            r20 = r18
        L85:
            return r20
        L86:
            r2 = 1
            long r0 = r10 - r2
            long r10 = r10 & r0
            goto L66
        L8c:
            long r2 = ~r4
            r0 = 6
            long r2 = r2 << r0
            r12 = -1
            long r10 = r12 - r4
            long r0 = r12 - r2
            long r10 = r10 | r0
            long r12 = r12 - r10
            long r12 = r12 & r16
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L9f
            r1 = -1
            goto L81
        L9f:
            int r19 = r19 + 8
            int r21 = r21 + r19
            r21 = r21 & r6
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.contains(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0087, code lost:
    
        r0 = (~r4) << 6;
        r10 = (r4 + r0) - (r4 | r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0094, code lost:
    
        if (((r10 - 9187201950435737472L) - (r10 | (-9187201950435737472L))) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0096, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsKey(int r21) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            int r1 = java.lang.Integer.hashCode(r9)
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
            int r19 = (-1) - r1
            r18 = 0
            r17 = r18
        L22:
            long[] r3 = r8.metadata
            int r2 = r19 >> 3
            r0 = 7
            r0 = r19 & r0
            int r1 = r0 << 3
            r10 = r3[r2]
            long r10 = r10 >>> r1
            r16 = 1
            int r2 = r2 + r16
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
            long r4 = r0 + r10
            long r0 = r0 & r10
            long r4 = r4 - r0
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
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r14
        L5d:
            r12 = 0
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L87
            int r0 = java.lang.Long.numberOfTrailingZeros(r10)
            int r0 = r0 >> 3
            int r0 = r0 + r19
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r1 = (-1) - r1
            int[] r0 = r8.keys
            r0 = r0[r1]
            if (r0 != r9) goto L7d
        L78:
            if (r1 < 0) goto L7c
            r18 = r16
        L7c:
            return r18
        L7d:
            r0 = 1
            long r2 = r10 - r0
            long r0 = r10 + r2
            long r10 = r10 | r2
            long r0 = r0 - r10
            r10 = r0
            goto L5d
        L87:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r10 = r4 + r0
            long r4 = r4 | r0
            long r10 = r10 - r4
            long r1 = r10 + r14
            long r10 = r10 | r14
            long r1 = r1 - r10
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 == 0) goto L98
            r1 = -1
            goto L78
        L98:
            int r17 = r17 + 8
            int r19 = r19 + r17
            int r0 = r19 + r6
            r19 = r19 | r6
            int r0 = r0 - r19
            r19 = r0
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.containsKey(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
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
            if (r9 < 0) goto L65
            r8 = r18
        Lf:
            r3 = r10[r8]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            r16 = -1
            long r5 = r16 - r0
            long r0 = r16 - r3
            long r5 = r5 | r0
            long r16 = r16 - r5
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = -1
            long r5 = r12 - r16
            long r0 = r12 - r14
            long r5 = r5 | r0
            long r12 = r12 - r5
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L60
            int r0 = r8 - r9
            int r0 = ~r0
            int r0 = r0 >>> 31
            r7 = 8
            int r6 = 8 - r0
            r5 = r18
        L39:
            if (r5 >= r6) goto L5e
            r0 = 255(0xff, double:1.26E-321)
            r14 = -1
            long r12 = r14 - r0
            long r0 = r14 - r3
            long r12 = r12 | r0
            long r14 = r14 - r12
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5a
            int r0 = r8 << 3
            int r0 = r0 + r5
            r0 = r11[r0]
            r1 = r20
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L5a
            r0 = 1
            return r0
        L5a:
            long r3 = r3 >> r7
            int r5 = r5 + 1
            goto L39
        L5e:
            if (r6 != r7) goto L65
        L60:
            if (r8 == r9) goto L65
            int r8 = r8 + 1
            goto Lf
        L65:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.containsValue(java.lang.Object):boolean");
    }

    public int hashCode() {
        int[] iArr = this.keys;
        Object[] objArr = this.values;
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
                        if ((255 & j2) < 128) {
                            int i6 = (i3 << 3) + i5;
                            int i7 = iArr[i6];
                            Object obj = objArr[i6];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i7);
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

    public final int findKeyIndex$collection(int i2) {
        int iHashCode = Integer.hashCode(i2) * ScatterMapKt.MurmurHashC1;
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = (-1) - (((-1) - i3) | ((-1) - 127));
        int i5 = this._capacity;
        int i6 = i3 >>> 7;
        int i7 = (i6 + i5) - (i6 | i5);
        int i8 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i9 = i7 >> 3;
            int i10 = ((-1) - (((-1) - i7) | ((-1) - 7))) << 3;
            long j2 = jArr[i9] >>> i10;
            long j3 = jArr[i9 + 1] << (64 - i10);
            long j4 = (-i10) >> 63;
            long j5 = ((j3 + j4) - (j3 | j4)) | j2;
            long j6 = (((long) i4) * ScatterMapKt.BitmaskLsb) ^ j5;
            long j7 = (-1) - (((-1) - ((-1) - (((-1) - (~j6)) | ((-1) - (j6 - ScatterMapKt.BitmaskLsb))))) | ((-1) - (-9187201950435737472L)));
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (-1) - (((-1) - ((Long.numberOfTrailingZeros(j7) >> 3) + i7)) | ((-1) - i5));
                if (this.keys[iNumberOfTrailingZeros] == i2) {
                    return iNumberOfTrailingZeros;
                }
                long j8 = j7 - 1;
                j7 = (j7 + j8) - (j7 | j8);
            }
            if ((((-1) - (((-1) - j5) | ((-1) - ((~j5) << 6)))) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i8 += 8;
            i7 = (i7 + i8) & i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[PHI: r4
  0x00b2: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0054, B:23:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, java.lang.CharSequence r27, int r28, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super V, ? extends java.lang.CharSequence> r29) {
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
            r16 = -1
            long r14 = r16 - r0
            long r0 = r16 - r2
            long r14 = r14 | r0
            long r16 = r16 - r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r16 = r16 & r14
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 == 0) goto Lad
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L60:
            if (r14 >= r1) goto Lae
            r21 = 255(0xff, double:1.26E-321)
            r19 = -1
            long r17 = r19 - r2
            long r15 = r19 - r21
            long r17 = r17 | r15
            long r19 = r19 - r17
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r0 >= 0) goto L8c
            int r0 = r5 << 3
            int r0 = r0 + r14
            r16 = r9[r0]
            r15 = r8[r0]
            r0 = r28
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
            r18 = r23
            r17.append(r18)
        L96:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object r0 = r12.invoke(r0, r15)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        La5:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r24
            goto L60
        Lad:
            goto Lb2
        Lae:
            r0 = 8
            if (r1 != r0) goto Lb9
        Lb2:
            if (r5 == r6) goto Lb9
            int r5 = r5 + 1
            r0 = r24
            goto L3d
        Lb9:
            r10.append(r13)
            goto L82
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[PHI: r4
  0x00ac: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0053, B:23:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r23, java.lang.CharSequence r24, java.lang.CharSequence r25, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super V, ? extends java.lang.CharSequence> r26) {
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
            java.lang.Object[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb3
            r5 = 0
            r4 = 0
        L3d:
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
            if (r0 == 0) goto La7
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L5f:
            if (r14 >= r1) goto La8
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L86
            int r0 = r5 << 3
            int r0 = r0 + r14
            r16 = r9[r0]
            r15 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L87
            r10.append(r11)
        L7c:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L86:
            goto L9f
        L87:
            if (r4 == 0) goto L90
            r17 = r10
            r18 = r21
            r17.append(r18)
        L90:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object r0 = r12.invoke(r0, r15)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        L9f:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r22
            goto L5f
        La7:
            goto Lac
        La8:
            r0 = 8
            if (r1 != r0) goto Lb3
        Lac:
            if (r5 == r6) goto Lb3
            int r5 = r5 + 1
            r0 = r22
            goto L3d
        Lb3:
            r10.append(r13)
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0 A[PHI: r4
  0x00b0: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0057, B:23:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r24, java.lang.CharSequence r25, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super V, ? extends java.lang.CharSequence> r26) {
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
            java.lang.String r0 = "transform"
            r13 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r12 = ""
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            java.lang.String r11 = "..."
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            int[] r9 = r2.keys
            java.lang.Object[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb7
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
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r0, r15)
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
            goto L39
        Lb7:
            r10.append(r12)
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1 A[PHI: r4
  0x00a1: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x004b, B:21:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r24, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super V, ? extends java.lang.CharSequence> r25) {
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
            java.lang.Object[] r8 = r2.values
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
            r16 = -1
            long r14 = r16 - r0
            long r0 = r16 - r2
            long r14 = r14 | r0
            long r16 = r16 - r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r16 = r16 & r14
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 == 0) goto La1
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L57:
            if (r1 >= r14) goto L9f
            r20 = 255(0xff, double:1.26E-321)
            long r18 = r2 + r20
            long r16 = r2 | r20
            long r18 = r18 - r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L7e
            int r0 = r5 << 3
            int r0 = r0 + r1
            r16 = r9[r0]
            r15 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L7f
            r10.append(r11)
        L74:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L7e:
            goto L99
        L7f:
            if (r4 == 0) goto L88
            r17 = r10
            r18 = r22
            r17.append(r18)
        L88:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r0, r15)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L99:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r23
            goto L57
        L9f:
            if (r14 != r15) goto La8
        La1:
            if (r5 == r6) goto La8
            int r5 = r5 + 1
            r0 = r23
            goto L34
        La8:
            r10.append(r12)
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.joinToString(java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009a A[PHI: r4
  0x009a: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0042, B:21:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super V, ? extends java.lang.CharSequence> r24) {
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
            java.lang.Object[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La1
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
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r16 = r22
            r17 = r0
            r18 = r15
            java.lang.Object r0 = r16.invoke(r17, r18)
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
            goto L30
        La1:
            r10.append(r12)
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntObjectMap.joinToString(kotlin.jvm.functions.Function2):java.lang.String");
    }
}
