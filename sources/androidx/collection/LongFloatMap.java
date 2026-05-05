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
/* JADX INFO: compiled from: LongFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005'4\u0012\u0006\u001bnj?4LeV@ZS0\u000fs{B-cҕyCQU\"}0\u0010WNulvJ`\u0014K\u000f\u0014\u0016\u0001̓4Ikxe\u0012\u00152JoU3UoC>htL\u0005(2(:\u0002\u0005\u000f&2Ϻ\u0018v\tNS\f\u00185HpPR\u0015˟\u000bN(ßn /\u001d\u001dlT8Ղp]H/k'wUf'\u000eD-c\u001b[l9\u001dxq\u001eYWG7%%\u0002\u001b\u0017Tk?1S SKؙ-߉*ɞ<[Dq\u0018\u0014C?\u00181k\f>\\3e\u0011\"5@gu[R\u001e(&\u0012\f\u000fL\u0004<\u001e7J>-Hz6$yφx֘?АJmP\u001a\u0013ad+U\u0004AFQ\u001b\u0015h(ݩ\u0019\u0017C\n!%\u001eQ\u0015\u001f%io&`C2\u001d\u0004_Ni@k\\~\u000eg[\u0006\u0004\u001fzJ.\u0012O_\u007f]}YR%DO[g%Q\u0002\u0010]\\y\u0007\u0007ph\u0002\u0001bJP\"\u001d.G,\u0019\f\tX\u0013\u001b2³Z҉+Ҋ\u0016-b'\u0016\bA4\r}JB=\u0012dN\u0017h1ܫ]R3=\tOY\u001dm>[GyK5\u007fzV`\u001b9\"bTb3|\u0017va1r\r83BW\u0019'ȑ\u007fNT2#8E\u0019,627?w%Y\u0013-pYҴ\ri`\u000f \u0005ZZ4\u0005o*\u001b'\u0011Rlp\u001e\f'_rʐfŮ,ۋ\u001ab'Nm\"\u0017X-B\u0015$\f\u001bWx\\Vznטy_\u0002F& ?x??\u0019\u0015%SB\u0004=Ez\u0017\u0014z\u0014Ⱦ-ю{ȪWhvY\u007f\b\u0019\u0015\\\u007fxogo'3\u0007m!:ϋh\n\u007f\bV\u0001M\u000bd\raDo\u000e\u0013[LNf!3Hdݙ\u0007ɴ!Ĝ}ZQS5\u0016&8_4o\u0003\u0002\u000b>\u000br\u001eT\rФ\b6i<\u007fhW\u0005B=>O\u007f\u001dN$4l1fv\u0014>٫H߿3ؿ{WO\u0012\tVfe;3\f\u0002\u001f,;\b\u001dܱ:[\u0004\fbF_X\fs\u0002\"y[%?d\u0004k{\u001dc\\9bW*\u0019,In@4m$drz\t^\u001d$\"DpSh\u0015>\u0019$bDj9Q͖Zʤ\u0005؋C\u0006T\u0012'\u0017`D:O\u001f\u0012b,tVv\u0019)InUB\u0001-#{V\u0007jI\u0005\u001c|\u00055i2\u000f\u000b5\tI#\u007f\u0005l%9}l9I`\t\u0007\u0011Ek}a\u0002d<w/sk}GP\u0018+\u001fr\u001e!9_Mwv^\u0017QZ-Er,*f\u0001\u0005R/\u0005z\u000bET\n=CIUxopfdN&os \u0007\u0017Rc\u001f\f+\u001cv!3\u0006ChUI\u0019\u0016W\u0002]SI:  N_4+'^eK~:m,J% -ȫ\u0006\u0013\u0019v0\n4q\u0005t\u00104.Q_\u0013C\u0011Av̲o\u0002'f71r-RMn~0\u0002|e~U9;\u0015G\u001dһtêOȿQ+[l+X\tNYY.\u0018)\u007fBKl3\u0007\u001ep*(O\u0012j'ա\u000e܀cč;֗.g9Èb \u0004\"\buT@b,-;\u0005OtĹGϞC܂cеbp0˯\u0005\u000e/\u0019\u000b~\u0019m\u001f\u0019LF! \u001bsё\u001d#s\u000fMg\u0015\f\u0016_4*IRm%mָI ~ϕ\u001dܾ>h|ʔ:D\u000f}\u000eg|CT`U\u001aUcZݦ#ܞ|ɖQђF\u000e4ֶ\u001e\u00135gF \u000fk(*SQaCOUܗ\u0019<\u001eq\r(Cr\"i3:\u0019|/\u001euƗoˉ\u0011ݫC«'5\u0017͵+YlM35\u0590K&L֎eO\u0007PiȘ?\u0010+ޢ9\u0007"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! IP\u0015Fr4\u001dU\tu", "", "u(E", "-bP=T*Bb-", "", "5dc,V(IO\u0017\u0003\nrjz\u00136l\u007f&\u000bD\u000b UCx\u0017F\u0006!D]\b)E", "-rXGX", "5dc,f0SSW|\u0005e3|\u0007>i\n1:<\n !Vk\u001d@\u0001.C", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "9dh@", "", "5dc\u0018X@L\u0012\u0015\b\u0004h;x\u00183o\t6", ";dc.W(MO", "5dc\u001aX;:R\u0015\u000ev\u001d(\u0006\u00129t{7\u007fJ\n%", "Ahi2", "5dc \\A>", "D`[BX:", "", "5dc#T3NS'=vg5\u0007\u0018+t\u00042\u0005N", "/k[", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "", "/mh", "1n]AT0Ga", "9dh", "1n]AT0Ga~~\u000f", "1n]AT0Ga\nz\u0002n,", "D`[BX", "1nd;g", "3pd._:", "=sW2e", "4h]1>,R7\"}zq", "4na\u0012T*A", "", "0k^0^", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4na\u0012T*A7\"}zq,{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "7mS2k", "4na\u0012T*A9\u0019\u0013", "4na\u0012T*AD\u0015\u0006\u000b^", "5dc", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "2dU.h3MD\u0015\u0006\u000b^", "5dc\u001ce\fEa\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "6`b566=S", "7r4:c;R", "7r=<g\fF^(\u0013", "8nX;G6,b&\u0003\u0004`", "", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "BqP;f-H`!", "<n]2", "BnBAe0GU", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<]/>[^'Ai%\u0016IN\u0011", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class LongFloatMap {
    public int _capacity;
    public int _size;
    public long[] keys;
    public long[] metadata;
    public float[] values;

    public /* synthetic */ LongFloatMap(DefaultConstructorMarker defaultConstructorMarker) {
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

    private LongFloatMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = LongSetKt.getEmptyLongArray();
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

    public final float get(long j2) {
        int iFindKeyIndex = findKeyIndex(j2);
        if (iFindKeyIndex < 0) {
            throw new NoSuchElementException("Cannot find value for key " + j2);
        }
        return this.values[iFindKeyIndex];
    }

    public final float getOrDefault(long j2, float f2) {
        int iFindKeyIndex = findKeyIndex(j2);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : f2;
    }

    public final float getOrElse(long j2, Function0<Float> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(j2);
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
            long j3 = (-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2));
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
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

    public final void forEach(Function2<? super Long, ? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.keys;
        float[] fArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr2[i2];
            long j3 = (~j2) << 7;
            long j4 = (j3 + j2) - (j3 | j2);
            if ((j4 - 9187201950435737472L) - (j4 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        block.invoke(Long.valueOf(jArr[i5]), Float.valueOf(fArr[i5]));
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
            if ((-1) - (((-1) - ((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2)))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
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
            if ((-1) - (((-1) - (((~j2) << 7) & j2)) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
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

    public final boolean contains(long j2) {
        return findKeyIndex(j2) >= 0;
    }

    public final boolean containsKey(long j2) {
        return findKeyIndex(j2) >= 0;
    }

    public static /* synthetic */ String joinToString$default(LongFloatMap longFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
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
        if ((i3 + 16) - (i3 | 16) != 0) {
        }
        return longFloatMap.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af A[PHI: r6
  0x00af: PHI (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:6:0x0054, B:22:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
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
            r3 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r1 = "postfix"
            r22 = r27
            r0 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "truncated"
            r13 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
            long[] r11 = r2.keys
            float[] r10 = r2.values
            long[] r9 = r2.metadata
            int r0 = r9.length
            int r8 = r0 + (-2)
            if (r8 < 0) goto Lb6
            r7 = 0
            r6 = 0
        L3b:
            r4 = r9[r7]
            long r0 = ~r4
            r2 = 7
            long r0 = r0 << r2
            long r18 = r0 + r4
            long r0 = r0 | r4
            long r18 = r18 - r0
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r14 = -1
            long r2 = r14 - r18
            long r0 = r14 - r16
            long r2 = r2 | r0
            long r14 = r14 - r2
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto Lac
            int r0 = r7 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r3 = 8
            int r15 = 8 - r0
            r14 = 0
        L60:
            if (r14 >= r15) goto Lad
            r20 = 255(0xff, double:1.26E-321)
            r18 = -1
            long r16 = r18 - r4
            long r0 = r18 - r20
            long r16 = r16 | r0
            long r18 = r18 - r16
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r0 >= 0) goto L8d
            int r0 = r7 << 3
            int r0 = r0 + r14
            r2 = r11[r0]
            r1 = r10[r0]
            r0 = r28
            r0 = r0
            if (r6 != r0) goto L8e
            r12.append(r13)
        L83:
            java.lang.String r1 = r12.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L8d:
            goto La6
        L8e:
            if (r6 == 0) goto L97
            r16 = r12
            r17 = r23
            r16.append(r17)
        L97:
            r12.append(r2)
            r0 = 61
            r12.append(r0)
            r12.append(r1)
            int r6 = r6 + 1
            r3 = 8
        La6:
            long r4 = r4 >> r3
            int r14 = r14 + 1
            r0 = r24
            goto L60
        Lac:
            goto Laf
        Lad:
            if (r15 != r3) goto Lb6
        Laf:
            if (r7 == r8) goto Lb6
            int r7 = r7 + 1
            r0 = r24
            goto L3b
        Lb6:
            r0 = r22
            r12.append(r0)
            goto L83
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2 A[PHI: r4
  0x00e2: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:23:0x008a, B:39:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.LongFloatMap r16, java.lang.CharSequence r17, java.lang.CharSequence r18, java.lang.CharSequence r19, int r20, java.lang.CharSequence r21, kotlin.jvm.functions.Function2 r22, int r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongFloatMap.joinToString$default(androidx.collection.LongFloatMap, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2, int, java.lang.Object):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0 A[PHI: r4
  0x00b0: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0054, B:21:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r23, java.lang.CharSequence r24, java.lang.CharSequence r25, int r26, java.lang.CharSequence r27, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Float, ? extends java.lang.CharSequence> r28) {
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
            long[] r9 = r2.keys
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb7
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
            if (r0 == 0) goto Lb0
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L60:
            if (r14 >= r1) goto Lac
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto La4
            int r0 = r5 << 3
            int r0 = r0 + r14
            r16 = r9[r0]
            r0 = r8[r0]
            r15 = r26
            if (r4 != r15) goto L88
            r10.append(r12)
        L7e:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L88:
            if (r4 == 0) goto L91
            r18 = r10
            r19 = r21
            r18.append(r19)
        L91:
            java.lang.Long r15 = java.lang.Long.valueOf(r16)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r11.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        La4:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r22
            goto L60
        Lac:
            r0 = 8
            if (r1 != r0) goto Lb7
        Lb0:
            if (r5 == r6) goto Lb7
            int r5 = r5 + 1
            r0 = r22
            goto L41
        Lb7:
            r10.append(r13)
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r11 = r21
            r2 = r20
            r19 = 1
            if (r11 != r2) goto L9
            return r19
        L9:
            boolean r0 = r11 instanceof androidx.collection.LongFloatMap
            r18 = 0
            if (r0 != 0) goto L10
            return r18
        L10:
            androidx.collection.LongFloatMap r11 = (androidx.collection.LongFloatMap) r11
            int r1 = r11.getSize()
            int r0 = r20.getSize()
            if (r1 == r0) goto L1d
            return r18
        L1d:
            long[] r10 = r2.keys
            float[] r9 = r2.values
            long[] r8 = r2.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L7c
            r6 = r18
        L2a:
            r4 = r8[r6]
            long r0 = ~r4
            r2 = 7
            long r0 = r0 << r2
            long r16 = r0 + r4
            long r0 = r0 | r4
            long r16 = r16 - r0
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = -1
            long r2 = r12 - r16
            long r0 = r12 - r14
            long r2 = r2 | r0
            long r12 = r12 - r2
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L76
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r3 = 8
            int r13 = 8 - r0
            r12 = r18
        L50:
            if (r12 >= r13) goto L74
            r0 = 255(0xff, double:1.26E-321)
            long r14 = r0 + r4
            long r0 = r0 | r4
            long r14 = r14 - r0
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L73
            int r0 = r6 << 3
            int r0 = r0 + r12
            r2 = r10[r0]
            r1 = r9[r0]
            float r0 = r11.get(r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L7b
            r3 = 8
        L6f:
            long r4 = r4 >> r3
            int r12 = r12 + 1
            goto L50
        L73:
            goto L6f
        L74:
            if (r13 != r3) goto L7c
        L76:
            if (r6 == r7) goto L7c
            int r6 = r6 + 1
            goto L2a
        L7b:
            return r18
        L7c:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongFloatMap.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[PHI: r5
  0x006f: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:10:0x0032, B:21:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
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
            float[] r9 = r12.values
            long[] r8 = r12.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L74
            r6 = 0
            r5 = 0
        L21:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r13 = r0 + r3
            long r0 = r0 | r3
            long r13 = r13 - r0
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r1
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 == 0) goto L6c
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r14 = 8
            int r13 = 8 - r0
            r2 = 0
        L3e:
            if (r2 >= r13) goto L6d
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r17 & r3
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L6b
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
            if (r5 >= r0) goto L67
            java.lang.String r0 = ", "
            r11.append(r0)
        L67:
            long r3 = r3 >> r14
            int r2 = r2 + 1
            goto L3e
        L6b:
            goto L67
        L6c:
            goto L6f
        L6d:
            if (r13 != r14) goto L74
        L6f:
            if (r6 == r7) goto L74
            int r6 = r6 + 1
            goto L21
        L74:
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r11.append(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "s.append('}').toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongFloatMap.toString():java.lang.String");
    }

    public final boolean all(Function2<? super Long, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.keys;
        float[] fArr = this.values;
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
                        if (!predicate.invoke(Long.valueOf(jArr[i5]), Float.valueOf(fArr[i5])).booleanValue()) {
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Float, java.lang.Boolean> r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "predicate"
            r10 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            long[] r9 = r1.keys
            float[] r8 = r1.values
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            r17 = 0
            if (r6 < 0) goto L74
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
            if (r0 == 0) goto L6f
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = r17
        L3e:
            if (r4 >= r11) goto L6d
            r0 = 255(0xff, double:1.26E-321)
            long r15 = r0 + r2
            long r0 = r0 | r2
            long r15 = r15 - r0
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L69
            int r0 = r5 << 3
            int r0 = r0 + r4
            r13 = r9[r0]
            r0 = r8[r0]
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r10.invoke(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L69
            r0 = 1
            return r0
        L69:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L3e
        L6d:
            if (r11 != r12) goto L74
        L6f:
            if (r5 == r6) goto L74
            int r5 = r5 + 1
            goto L19
        L74:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongFloatMap.any(kotlin.jvm.functions.Function2):boolean");
    }

    public final int count(Function2<? super Long, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.keys;
        float[] fArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j2 = jArr2[i3];
                long j3 = (~j2) << 7;
                if ((((j3 + j2) - (j3 | j2)) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                            int i7 = (i3 << 3) + i6;
                            if (predicate.invoke(Long.valueOf(jArr[i7]), Float.valueOf(fArr[i7])).booleanValue()) {
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsValue(float r18) {
        /*
            r17 = this;
            r0 = r17
            float[] r9 = r0.values
            long[] r8 = r0.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            r16 = 0
            if (r7 < 0) goto L59
            r6 = r16
        Lf:
            r1 = r8[r6]
            long r3 = ~r1
            r0 = 7
            long r3 = r3 << r0
            r12 = -1
            long r10 = r12 - r3
            long r3 = r12 - r1
            long r10 = r10 | r3
            long r12 = r12 - r10
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r3
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 == 0) goto L54
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r10 = 8 - r0
            r5 = r16
        L31:
            if (r5 >= r10) goto L52
            r3 = 255(0xff, double:1.26E-321)
            r14 = -1
            long r12 = r14 - r3
            long r3 = r14 - r1
            long r12 = r12 | r3
            long r14 = r14 - r12
            r3 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 >= 0) goto L4e
            int r0 = r6 << 3
            int r0 = r0 + r5
            r0 = r9[r0]
            int r0 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r0 != 0) goto L4e
            r0 = 1
            return r0
        L4e:
            long r1 = r1 >> r11
            int r5 = r5 + 1
            goto L31
        L52:
            if (r10 != r11) goto L59
        L54:
            if (r6 == r7) goto L59
            int r6 = r6 + 1
            goto Lf
        L59:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongFloatMap.containsValue(float):boolean");
    }

    public int hashCode() {
        long[] jArr = this.keys;
        float[] fArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int iHashCode = 0;
            while (true) {
                long j2 = jArr2[i3];
                long j3 = (~j2) << 7;
                long j4 = (j3 + j2) - (j3 | j2);
                if ((j4 - 9187201950435737472L) - (j4 | (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                            int i6 = (i3 << 3) + i5;
                            long j5 = jArr[i6];
                            iHashCode += Float.hashCode(fArr[i6]) ^ Long.hashCode(j5);
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
        int i5 = (-1) - (((-1) - (i2 >>> 7)) | ((-1) - i4));
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = ((-1) - (((-1) - i5) | ((-1) - 7))) << 3;
            long j3 = ((-1) - (((-1) - (jArr[i7 + 1] << (64 - i8))) | ((-1) - ((-i8) >> 63)))) | (jArr[i7] >>> i8);
            long j4 = (((long) i3) * ScatterMapKt.BitmaskLsb) ^ j3;
            long j5 = (-1) - (((-1) - (~j4)) | ((-1) - (j4 - ScatterMapKt.BitmaskLsb)));
            long j6 = (j5 - 9187201950435737472L) - (j5 | (-9187201950435737472L));
            while (j6 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j6) >> 3) + i5) & i4;
                if (this.keys[iNumberOfTrailingZeros] == j2) {
                    return iNumberOfTrailingZeros;
                }
                long j7 = j6 - 1;
                j6 = (j6 + j7) - (j6 | j7);
            }
            long j8 = (~j3) << 6;
            if ((((j3 + j8) - (j3 | j8)) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            int i9 = i5 + i6;
            i5 = (i9 + i4) - (i9 | i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab A[PHI: r4
  0x00ab: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0053, B:21:0x00a9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r22, java.lang.CharSequence r23, java.lang.CharSequence r24, int r25, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Float, ? extends java.lang.CharSequence> r26) {
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
            r13 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "transform"
            r12 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r11 = "..."
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            long[] r9 = r2.keys
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb2
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
            if (r0 == 0) goto Lab
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L5f:
            if (r14 >= r1) goto La7
            r15 = 255(0xff, double:1.26E-321)
            long r17 = r2 & r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L9f
            int r0 = r5 << 3
            int r0 = r0 + r14
            r16 = r9[r0]
            r0 = r8[r0]
            r15 = r25
            if (r4 != r15) goto L83
            r10.append(r11)
        L79:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L83:
            if (r4 == 0) goto L8c
            r18 = r10
            r19 = r20
            r18.append(r19)
        L8c:
            java.lang.Long r15 = java.lang.Long.valueOf(r16)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r12.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        L9f:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r21
            goto L5f
        La7:
            r0 = 8
            if (r1 != r0) goto Lb2
        Lab:
            if (r5 == r6) goto Lb2
            int r5 = r5 + 1
            r0 = r21
            goto L3d
        Lb2:
            r10.append(r13)
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6 A[PHI: r4
  0x00b6: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x005b, B:21:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r24, java.lang.CharSequence r25, java.lang.CharSequence r26, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Float, ? extends java.lang.CharSequence> r27) {
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
            long[] r9 = r2.keys
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lbd
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
            if (r0 == 0) goto Lb6
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L67:
            if (r14 >= r1) goto Lb2
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto Laa
            int r0 = r5 << 3
            int r0 = r0 + r14
            r17 = r9[r0]
            r16 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L8e
            r10.append(r11)
        L84:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L8e:
            if (r4 == 0) goto L97
            r19 = r10
            r20 = r22
            r19.append(r20)
        L97:
            java.lang.Long r15 = java.lang.Long.valueOf(r17)
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r12.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        Laa:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r23
            goto L67
        Lb2:
            r0 = 8
            if (r1 != r0) goto Lbd
        Lb6:
            if (r5 == r6) goto Lbd
            int r5 = r5 + 1
            r0 = r23
            goto L3d
        Lbd:
            r10.append(r13)
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae A[PHI: r4
  0x00ae: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0053, B:21:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r24, java.lang.CharSequence r25, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Float, ? extends java.lang.CharSequence> r26) {
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
            long[] r9 = r2.keys
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
            if (r0 == 0) goto Lae
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L5f:
            if (r14 >= r1) goto Laa
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto La2
            int r0 = r5 << 3
            int r0 = r0 + r14
            r17 = r9[r0]
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
            r19 = r10
            r20 = r22
            r19.append(r20)
        L8f:
            java.lang.Long r15 = java.lang.Long.valueOf(r17)
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        La2:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r23
            goto L5f
        Laa:
            r0 = 8
            if (r1 != r0) goto Lb5
        Lae:
            if (r5 == r6) goto Lb5
            int r5 = r5 + 1
            r0 = r23
            goto L39
        Lb5:
            r10.append(r12)
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5 A[PHI: r4
  0x00a5: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x004b, B:21:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r24, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Float, ? extends java.lang.CharSequence> r25) {
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
            long[] r9 = r2.keys
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lac
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
            if (r0 == 0) goto La5
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L57:
            if (r1 >= r14) goto La3
            r20 = 255(0xff, double:1.26E-321)
            long r18 = r2 + r20
            long r16 = r2 | r20
            long r18 = r18 - r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L7e
            int r0 = r5 << 3
            int r0 = r0 + r1
            r17 = r9[r0]
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
            goto L9d
        L7f:
            if (r4 == 0) goto L88
            r19 = r10
            r20 = r22
            r19.append(r20)
        L88:
            java.lang.Long r15 = java.lang.Long.valueOf(r17)
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L9d:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r23
            goto L57
        La3:
            if (r14 != r15) goto Lac
        La5:
            if (r5 == r6) goto Lac
            int r5 = r5 + 1
            r0 = r23
            goto L34
        Lac:
            r10.append(r12)
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongFloatMap.joinToString(java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009f A[PHI: r4
  0x009f: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0047, B:21:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Float, ? extends java.lang.CharSequence> r22) {
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
            long[] r9 = r2.keys
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La6
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
            if (r0 == 0) goto L9f
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L53:
            if (r1 >= r14) goto L9d
            r16 = 255(0xff, double:1.26E-321)
            long r18 = r2 & r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L76
            int r0 = r5 << 3
            int r0 = r0 + r1
            r17 = r9[r0]
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
            goto L97
        L77:
            if (r4 == 0) goto L7c
            r10.append(r13)
        L7c:
            java.lang.Long r15 = java.lang.Long.valueOf(r17)
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            r16 = r20
            r17 = r15
            r18 = r0
            java.lang.Object r0 = r16.invoke(r17, r18)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L97:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r21
            goto L53
        L9d:
            if (r14 != r15) goto La6
        L9f:
            if (r5 == r6) goto La6
            int r5 = r5 + 1
            r0 = r21
            goto L30
        La6:
            r10.append(r12)
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongFloatMap.joinToString(kotlin.jvm.functions.Function2):java.lang.String");
    }
}
