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
/* JADX INFO: compiled from: LongLongMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005'4\u0012\u0006\u001bnj?6LeV7Zݷ2\u000f\u0002{<$i+yCA^\"}0\tWȞog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4I[}e\u0012%2JoE5UoKEhҚ>\u0005.=*8\u007f\n\t\u001a@H\u0018͌\u0001waÈB0nozW\u0013Oŋ\u001e\u0012\u0014>h%,n\u007fNd[\u001dsHC;\u0015yD^'\u000eF\rO\u001dF\u0003=\u001dxq\u001eYSeJ[ǳYЁ\u0006Ѹ$C\u0011V\n=3{oK9`\fWdk0*#?g\u001fmt6\\3gp\u000e7+}y[R\u001e(&\u000e*\"\u0003ǐ\u0014ϳ&Ξv<(~ \u000ea\b#WNi\u001a^p\u0016Aʯ6_1\u000eMC9Iy\u0002eI2f7*\u001bU*1\u001c\u0007!\ng>d#7lw\u007fG\u001aDKef\n\b?6(~\u007f\u001a*22w\u0016=\u0010)@''G[g91m\u0012Hr}\u0007\u0007ph\u0002|\u0001]\u0007̕tߤ6ѧQ\u001dhb|\u0005\u001ac\u0005^:0e\u001ej\u0006,\u0007Yؕ\\@J/E(N}j\u001an[v\"%]|}X7.\u001cxQ^aW\u0002\u0018\u001e\u0005j'$PLq3nڋF]\u0012~l.(WXl\u0016}\"]^\u001d#Am\bʬ867=l\u001bN(.DG\u0003/{jj ~\u0003UR\u00180ˌzנ\u007fˆ%\u001e}\u000e\u0011IZ\u001f\u0011A;diP)7e1\u00176č'\u0011\u0005\u0018\u0010MmqWNr\u001c\u001c}\f\"&\u001ags]dYÃ\u0005ɴ1ĈurZ\u001c}Q{4W\u001a\u000b\u001d'Vx?w\u0017\u0019\u0007ݽdtPsd\u001d(\u001cnt)\u000e\u000b\u0019\ncVzu\u0006\u00032\"ųOϸ\u0002ʛ\u0005{F'\u001d\u001fLG1\u000f0 MHS8-%&*ڏ\u0019kc\u000e\u007f4\u007f\b\u001f(zk*Hs\u0018\u007fb\u007f\u007f`b~Յ_͓=Эl{\u0011m`j&\u001er\rB&KHoz7ސ8\u0016\u001f=*~\u0007Z#!ZiS+o,J^c8![}Bt\fE\u001f{kg\u001c\u0004{`\u0019c'\n9\u0012ax IU&fYr\t^\u001c\"G|הAڙ\u0004µQ*B\\T\b9E\u001b}N\u0014\t1^_=*zF\u0002mn\u000e\u0003\f%\u000fV8xE\u000fUZ\u0007\u0005\u000fAS\u00115_;\u001eLZ/qi\u0019SK?KpU~t]CD\u0003oK.^\u0001\u0019~uCw\u0004f\nM){&\b\ffNC\"\u000b\u000f)li\u0011\u000e+`d\u0011Ur\u0004|v@\u001d\u0003T()\r2\u0015\u000ej@?\u0011\u001fO\u0001(z-z\u0005(=I\u001a\u000fP\\)5\u000e-iL\u001b;@M-k\u007f\u001bJ-}e\u000fS.\u00181062\u000bֈ`a\u0014\u000b\u001ac!_&s\u001ch(\"#a0\u0013\\`ƶv\u00144,FU\bX\u0012\u0015d_\u0012\u00141B7+\u001b<p`/Ǖ\u0010ˡk̙7Y\u0019?~1\u0005\r73^Z!'{bYl+P\u001fT8X?\u0002Jݻd˿\rʌnЍ\u0014Uk֬\u0001mU^\u001b+\u007f\u00028eI0\u0001 4Υ8ǡZՠ`Ӳ\u0019A^צNf\u000fazB(\u001dlp@d#\u000e_Xμ\u0003Lv\u0013\u0019;Tznz=@1\u001f\n\u0017}֜Eʗ\u001cÔ2Ж5XG\u05cdG4\u0011z6va\u0019Hn\r\u007fXL?ۂ>ל\u0003ߢRÊA /ڒ4oj\u00104K\u0016GP\u0016D\u0011<\u0013e\u001fߣ$Bt\u001c\"J_;\u0012/\u001f\u0011-84y=ؒsշ(Ɯ1ݜ\u0005\u0003\t\u008dO{7|Hsمq\"mݬo _iAþe\u0014Kۧ\u0010A"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! IV\u0018Ex\r1dS", "", "u(E", "-bP=T*Bb-", "", "5dc,V(IO\u0017\u0003\nrjz\u00136l\u007f&\u000bD\u000b UCx\u0017F\u0006!D]\b)E", "-rXGX", "5dc,f0SSW|\u0005e3|\u0007>i\n1:<\n !Vk\u001d@\u0001.C", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "9dh@", "", "5dc\u0018X@L\u0012\u0015\b\u0004h;x\u00183o\t6", ";dc.W(MO", "5dc\u001aX;:R\u0015\u000ev\u001d(\u0006\u00129t{7\u007fJ\n%", "Ahi2", "5dc \\A>", "D`[BX:", "5dc#T3NS'=vg5\u0007\u0018+t\u00042\u0005N", "/k[", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "/mh", "1n]AT0Ga", "9dh", "1n]AT0Ga~~\u000f", "1n]AT0Ga\nz\u0002n,", "D`[BX", "1nd;g", "3pd._:", "=sW2e", "4h]1>,R7\"}zq", "4na\u0012T*A", "", "0k^0^", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4na\u0012T*A7\"}zq,{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "7mS2k", "4na\u0012T*A9\u0019\u0013", "4na\u0012T*AD\u0015\u0006\u000b^", "5dc", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "2dU.h3MD\u0015\u0006\u000b^", "5dc\u001ce\fEa\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "6`b566=S", "7r4:c;R", "7r=<g\fF^(\u0013", "8nX;G6,b&\u0003\u0004`", "", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "BqP;f-H`!", "<n]2", "BnBAe0GU", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<]/>[d*@o}*X\u0019", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class LongLongMap {
    public int _capacity;
    public int _size;
    public long[] keys;
    public long[] metadata;
    public long[] values;

    public /* synthetic */ LongLongMap(DefaultConstructorMarker defaultConstructorMarker) {
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

    private LongLongMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = LongSetKt.getEmptyLongArray();
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

    public final long get(long j2) {
        int iFindKeyIndex = findKeyIndex(j2);
        if (iFindKeyIndex < 0) {
            throw new NoSuchElementException("Cannot find value for key " + j2);
        }
        return this.values[iFindKeyIndex];
    }

    public final long getOrDefault(long j2, long j3) {
        int iFindKeyIndex = findKeyIndex(j2);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : j3;
    }

    public final long getOrElse(long j2, Function0<Long> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(j2);
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
            long j3 = (~j2) << 7;
            if ((-1) - (((-1) - ((j3 + j2) - (j3 | j2))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
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

    public final void forEach(Function2<? super Long, ? super Long, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr3[i2];
            long j3 = (~j2) << 7;
            if ((((j3 + j2) - (j3 | j2)) & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                        int i5 = (i2 << 3) + i4;
                        block.invoke(Long.valueOf(jArr[i5]), Long.valueOf(jArr2[i5]));
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
            long j3 = (~j2) << 7;
            if ((-1) - (((-1) - ((j3 + j2) - (j3 | j2))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
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
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
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

    public final boolean contains(long j2) {
        return findKeyIndex(j2) >= 0;
    }

    public final boolean containsKey(long j2) {
        return findKeyIndex(j2) >= 0;
    }

    public static /* synthetic */ String joinToString$default(LongLongMap longLongMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i3 + 1) - (1 | i3) != 0) {
        }
        if ((2 & i3) != 0) {
        }
        if ((4 & i3) != 0) {
        }
        if ((8 & i3) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
        }
        return longLongMap.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8 A[PHI: r7
  0x00a8: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0052, B:22:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r22, java.lang.CharSequence r23, java.lang.CharSequence r24, int r25, java.lang.CharSequence r26) {
        /*
            r21 = this;
            r2 = r21
            java.lang.String r1 = "separator"
            r20 = r22
            r0 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "prefix"
            r3 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r1 = "postfix"
            r19 = r24
            r0 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "truncated"
            r18 = r26
            r0 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            long[] r13 = r2.keys
            long[] r12 = r2.values
            long[] r10 = r2.metadata
            int r0 = r10.length
            int r9 = r0 + (-2)
            if (r9 < 0) goto Lad
            r8 = 0
            r7 = 0
        L3d:
            r5 = r10[r8]
            long r0 = ~r5
            r2 = 7
            long r0 = r0 << r2
            r14 = -1
            long r2 = r14 - r0
            long r0 = r14 - r5
            long r2 = r2 | r0
            long r14 = r14 - r2
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r1
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 == 0) goto La5
            int r0 = r8 - r9
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r15 = 8 - r1
            r14 = 0
        L5e:
            if (r14 >= r15) goto La6
            r16 = 255(0xff, double:1.26E-321)
            long r3 = r5 + r16
            long r0 = r5 | r16
            long r3 = r3 - r0
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L88
            int r0 = r8 << 3
            int r0 = r0 + r14
            r3 = r13[r0]
            r1 = r12[r0]
            r0 = r25
            r0 = r0
            if (r7 != r0) goto L89
            r0 = r18
            r11.append(r0)
        L7e:
            java.lang.String r1 = r11.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L88:
            goto L9f
        L89:
            if (r7 == 0) goto L92
            r16 = r11
            r17 = r20
            r16.append(r17)
        L92:
            r11.append(r3)
            r0 = 61
            r11.append(r0)
            r11.append(r1)
            int r7 = r7 + 1
        L9f:
            r0 = 8
            long r5 = r5 >> r0
            int r14 = r14 + 1
            goto L5e
        La5:
            goto La8
        La6:
            if (r15 != r0) goto Lad
        La8:
            if (r8 == r9) goto Lad
            int r8 = r8 + 1
            goto L3d
        Lad:
            r0 = r19
            r11.append(r0)
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongLongMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1 A[PHI: r4
  0x00f1: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:23:0x0091, B:39:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.LongLongMap r19, java.lang.CharSequence r20, java.lang.CharSequence r21, java.lang.CharSequence r22, int r23, java.lang.CharSequence r24, kotlin.jvm.functions.Function2 r25, int r26, java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongLongMap.joinToString$default(androidx.collection.LongLongMap, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2, int, java.lang.Object):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0 A[PHI: r4 r21
  0x00b0: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0054, B:21:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r21v2 'separator' java.lang.CharSequence) = (r21v1 'separator' java.lang.CharSequence), (r21v3 'separator' java.lang.CharSequence) binds: [B:6:0x0054, B:21:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r23, java.lang.CharSequence r24, java.lang.CharSequence r25, int r26, java.lang.CharSequence r27, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, ? extends java.lang.CharSequence> r28) {
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
            long[] r8 = r2.values
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
            r18 = r9[r0]
            r16 = r8[r0]
            r0 = r26
            if (r4 != r0) goto L88
            r10.append(r12)
        L7e:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L88:
            if (r4 == 0) goto L91
            r20 = r10
            r21 = r21
            r20.append(r21)
        L91:
            java.lang.Long r15 = java.lang.Long.valueOf(r18)
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongLongMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
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
            boolean r0 = r11 instanceof androidx.collection.LongLongMap
            r18 = 0
            if (r0 != 0) goto L10
            return r18
        L10:
            androidx.collection.LongLongMap r11 = (androidx.collection.LongLongMap) r11
            int r1 = r11.getSize()
            int r0 = r20.getSize()
            if (r1 == r0) goto L1d
            return r18
        L1d:
            long[] r10 = r2.keys
            long[] r9 = r2.values
            long[] r8 = r2.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L80
            r6 = r18
        L2a:
            r4 = r8[r6]
            long r0 = ~r4
            r2 = 7
            long r0 = r0 << r2
            r14 = -1
            long r2 = r14 - r0
            long r0 = r14 - r4
            long r2 = r2 | r0
            long r14 = r14 - r2
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r14 + r12
            long r14 = r14 | r12
            long r1 = r1 - r14
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 == 0) goto L7b
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r3 = r18
        L4f:
            if (r3 >= r12) goto L79
            r0 = 255(0xff, double:1.26E-321)
            r16 = -1
            long r14 = r16 - r0
            long r0 = r16 - r4
            long r14 = r14 | r0
            long r16 = r16 - r14
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 >= 0) goto L72
            int r2 = r6 << 3
            int r2 = r2 + r3
            r0 = r10[r2]
            r13 = r9[r2]
            long r1 = r11.get(r0)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 == 0) goto L73
            return r18
        L72:
            goto L75
        L73:
            r13 = 8
        L75:
            long r4 = r4 >> r13
            int r3 = r3 + 1
            goto L4f
        L79:
            if (r12 != r13) goto L80
        L7b:
            if (r6 == r7) goto L80
            int r6 = r6 + 1
            goto L2a
        L80:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongLongMap.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007d A[PHI: r6
  0x007d: PHI (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:10:0x003e, B:22:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r20 = this;
            r13 = r20
            boolean r0 = r20.isEmpty()
            if (r0 == 0) goto Lc
            java.lang.String r0 = "{}"
            return r0
        Lc:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "{"
            r12.<init>(r0)
            long[] r11 = r13.keys
            long[] r10 = r13.values
            long[] r9 = r13.metadata
            int r0 = r9.length
            int r8 = r0 + (-2)
            if (r8 < 0) goto L82
            r7 = 0
            r6 = 0
        L21:
            r4 = r9[r7]
            long r0 = ~r4
            r2 = 7
            long r0 = r0 << r2
            r18 = -1
            long r2 = r18 - r0
            long r0 = r18 - r4
            long r2 = r2 | r0
            long r18 = r18 - r2
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r14 = -1
            long r2 = r14 - r18
            long r0 = r14 - r16
            long r2 = r2 | r0
            long r14 = r14 - r2
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto L7a
            int r0 = r7 - r8
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r15 = 8 - r1
            r14 = 0
        L4a:
            if (r14 >= r15) goto L7b
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r4
            r2 = 128(0x80, double:6.3E-322)
            int r1 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r1 >= 0) goto L79
            int r0 = r7 << 3
            int r0 = r0 + r14
            r2 = r11[r0]
            r0 = r10[r0]
            r12.append(r2)
            java.lang.String r2 = "="
            r12.append(r2)
            r12.append(r0)
            int r6 = r6 + 1
            int r0 = r13._size
            if (r6 >= r0) goto L73
            java.lang.String r0 = ", "
            r12.append(r0)
        L73:
            r0 = 8
        L75:
            long r4 = r4 >> r0
            int r14 = r14 + 1
            goto L4a
        L79:
            goto L75
        L7a:
            goto L7d
        L7b:
            if (r15 != r0) goto L82
        L7d:
            if (r7 == r8) goto L82
            int r7 = r7 + 1
            goto L21
        L82:
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r12.append(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "s.append('}').toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongLongMap.toString():java.lang.String");
    }

    public final boolean all(Function2<? super Long, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr3[i2];
            long j3 = ((~j2) << 7) & j2;
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (!predicate.invoke(Long.valueOf(jArr[i5]), Long.valueOf(jArr2[i5])).booleanValue()) {
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
    public final boolean any(kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, java.lang.Boolean> r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "predicate"
            r11 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            long[] r10 = r1.keys
            long[] r9 = r1.values
            long[] r8 = r1.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            r17 = 0
            if (r7 < 0) goto L6a
            r6 = r17
        L19:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r12
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L65
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r5 = 8 - r0
            r2 = r17
        L34:
            if (r2 >= r5) goto L63
            r0 = 255(0xff, double:1.26E-321)
            long r15 = r0 + r3
            long r0 = r0 | r3
            long r15 = r15 - r0
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L5f
            int r13 = r6 << 3
            int r13 = r13 + r2
            r0 = r10[r13]
            r13 = r9[r13]
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            java.lang.Object r0 = r11.invoke(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5f
            r0 = 1
            return r0
        L5f:
            long r3 = r3 >> r12
            int r2 = r2 + 1
            goto L34
        L63:
            if (r5 != r12) goto L6a
        L65:
            if (r6 == r7) goto L6a
            int r6 = r6 + 1
            goto L19
        L6a:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongLongMap.any(kotlin.jvm.functions.Function2):boolean");
    }

    public final int count(Function2<? super Long, ? super Long, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j2 = jArr3[i3];
                if ((((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2))) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            if (predicate.invoke(Long.valueOf(jArr[i7]), Long.valueOf(jArr2[i7])).booleanValue()) {
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsValue(long r20) {
        /*
            r19 = this;
            r0 = r19
            long[] r9 = r0.values
            long[] r8 = r0.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            r18 = 0
            if (r7 < 0) goto L5d
            r6 = r18
        Lf:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            r16 = -1
            long r10 = r16 - r0
            long r0 = r16 - r3
            long r10 = r10 | r0
            long r16 = r16 - r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = -1
            long r10 = r12 - r16
            long r0 = r12 - r14
            long r10 = r10 | r0
            long r12 = r12 - r10
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L58
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r10 = 8 - r0
            r5 = r18
        L39:
            if (r5 >= r10) goto L56
            r0 = 255(0xff, double:1.26E-321)
            long r12 = r0 + r3
            long r0 = r0 | r3
            long r12 = r12 - r0
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 >= 0) goto L52
            int r0 = r6 << 3
            int r0 = r0 + r5
            r1 = r9[r0]
            int r0 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
            if (r0 != 0) goto L52
            r0 = 1
            return r0
        L52:
            long r3 = r3 >> r11
            int r5 = r5 + 1
            goto L39
        L56:
            if (r10 != r11) goto L5d
        L58:
            if (r6 == r7) goto L5d
            int r6 = r6 + 1
            goto Lf
        L5d:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongLongMap.containsValue(long):boolean");
    }

    public int hashCode() {
        long[] jArr = this.keys;
        long[] jArr2 = this.values;
        long[] jArr3 = this.metadata;
        int length = jArr3.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int iHashCode = 0;
            while (true) {
                long j2 = jArr3[i3];
                if ((-1) - (((-1) - (((~j2) << 7) & j2)) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 + j2) - (255 | j2) < 128) {
                            int i6 = (i3 << 3) + i5;
                            iHashCode += Long.hashCode(jArr[i6]) ^ Long.hashCode(jArr2[i6]);
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
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j3 = jArr[i7] >>> i8;
            long j4 = jArr[i7 + 1] << (64 - i8);
            long j5 = (-i8) >> 63;
            long j6 = (j4 + j5) - (j4 | j5);
            long j7 = (j6 + j3) - (j6 & j3);
            long j8 = (((long) i3) * ScatterMapKt.BitmaskLsb) ^ j7;
            for (long j9 = (-1) - (((-1) - ((-1) - (((-1) - (~j8)) | ((-1) - (j8 - ScatterMapKt.BitmaskLsb))))) | ((-1) - (-9187201950435737472L))); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(j9) >> 3) + i5;
                int i9 = (iNumberOfTrailingZeros + i4) - (iNumberOfTrailingZeros | i4);
                if (this.keys[i9] == j2) {
                    return i9;
                }
            }
            long j10 = (~j7) << 6;
            long j11 = (j7 + j10) - (j7 | j10);
            if ((j11 - 9187201950435737472L) - (j11 | (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00af A[PHI: r4 r21
  0x00af: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0053, B:21:0x00ad] A[DONT_GENERATE, DONT_INLINE]
  0x00af: PHI (r21v2 'separator' java.lang.CharSequence) = (r21v1 'separator' java.lang.CharSequence), (r21v3 'separator' java.lang.CharSequence) binds: [B:6:0x0053, B:21:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r23, java.lang.CharSequence r24, java.lang.CharSequence r25, int r26, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, ? extends java.lang.CharSequence> r27) {
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
            long[] r9 = r2.keys
            long[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb6
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
            if (r0 == 0) goto Laf
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L5f:
            if (r14 >= r1) goto Lab
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto La3
            int r0 = r5 << 3
            int r0 = r0 + r14
            r18 = r9[r0]
            r16 = r8[r0]
            r0 = r26
            if (r4 != r0) goto L87
            r10.append(r11)
        L7d:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L87:
            if (r4 == 0) goto L90
            r20 = r10
            r21 = r21
            r20.append(r21)
        L90:
            java.lang.Long r15 = java.lang.Long.valueOf(r18)
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            java.lang.Object r0 = r12.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        La3:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r22
            goto L5f
        Lab:
            r0 = 8
            if (r1 != r0) goto Lb6
        Laf:
            if (r5 == r6) goto Lb6
            int r5 = r5 + 1
            r0 = r22
            goto L3d
        Lb6:
            r10.append(r13)
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongLongMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa A[PHI: r4
  0x00aa: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x004b, B:21:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, java.lang.CharSequence r27, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, ? extends java.lang.CharSequence> r28) {
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
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r15
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 == 0) goto Laa
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L57:
            if (r14 >= r1) goto La6
            r21 = 255(0xff, double:1.26E-321)
            r19 = -1
            long r17 = r19 - r2
            long r15 = r19 - r21
            long r17 = r17 | r15
            long r19 = r19 - r17
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r0 >= 0) goto L9e
            int r0 = r5 << 3
            int r0 = r0 + r14
            r18 = r9[r0]
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
            r20 = r10
            r21 = r23
            r20.append(r21)
        L8b:
            java.lang.Long r15 = java.lang.Long.valueOf(r18)
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            java.lang.Object r0 = r12.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        L9e:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r24
            goto L57
        La6:
            r0 = 8
            if (r1 != r0) goto Lb1
        Laa:
            if (r5 == r6) goto Lb1
            int r5 = r5 + 1
            r0 = r24
            goto L3d
        Lb1:
            r10.append(r13)
            goto L78
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongLongMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6 A[PHI: r4 r21
  0x00a6: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x004b, B:21:0x00a4] A[DONT_GENERATE, DONT_INLINE]
  0x00a6: PHI (r21v2 'separator' java.lang.CharSequence) = (r21v1 'separator' java.lang.CharSequence), (r21v3 'separator' java.lang.CharSequence) binds: [B:6:0x004b, B:21:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r23, java.lang.CharSequence r24, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, ? extends java.lang.CharSequence> r25) {
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
            long[] r9 = r2.keys
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
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r0 + r16
            long r0 = r0 | r16
            long r14 = r14 - r0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto La6
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L57:
            if (r14 >= r1) goto La2
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L9a
            int r0 = r5 << 3
            int r0 = r0 + r14
            r18 = r9[r0]
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
            r20 = r10
            r21 = r21
            r20.append(r21)
        L87:
            java.lang.Long r15 = java.lang.Long.valueOf(r18)
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        L9a:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r22
            goto L57
        La2:
            r0 = 8
            if (r1 != r0) goto Lad
        La6:
            if (r5 == r6) goto Lad
            int r5 = r5 + 1
            r0 = r22
            goto L39
        Lad:
            r10.append(r12)
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongLongMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1 A[PHI: r4
  0x00a1: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0047, B:21:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r24, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, ? extends java.lang.CharSequence> r25) {
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
            long r16 = r0 + r2
            long r0 = r0 | r2
            long r16 = r16 - r0
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
        L53:
            if (r1 >= r14) goto L9f
            r20 = 255(0xff, double:1.26E-321)
            long r18 = r2 + r20
            long r16 = r2 | r20
            long r18 = r18 - r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L7a
            int r0 = r5 << 3
            int r0 = r0 + r1
            r18 = r9[r0]
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
            r20 = r10
            r21 = r22
            r20.append(r21)
        L84:
            java.lang.Long r15 = java.lang.Long.valueOf(r18)
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L99:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r23
            goto L53
        L9f:
            if (r14 != r15) goto La8
        La1:
            if (r5 == r6) goto La8
            int r5 = r5 + 1
            r0 = r23
            goto L34
        La8:
            r10.append(r12)
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongLongMap.joinToString(java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009f A[PHI: r4
  0x009f: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0043, B:21:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, ? extends java.lang.CharSequence> r24) {
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
            long[] r8 = r2.values
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
            long r16 = r0 + r2
            long r0 = r0 | r2
            long r16 = r16 - r0
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
        L4f:
            if (r1 >= r14) goto L9d
            r20 = 255(0xff, double:1.26E-321)
            long r18 = r2 + r20
            long r16 = r2 | r20
            long r18 = r18 - r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L76
            int r0 = r5 << 3
            int r0 = r0 + r1
            r18 = r9[r0]
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
            java.lang.Long r15 = java.lang.Long.valueOf(r18)
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r16 = r22
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
            r0 = r23
            goto L4f
        L9d:
            if (r14 != r15) goto La6
        L9f:
            if (r5 == r6) goto La6
            int r5 = r5 + 1
            r0 = r23
            goto L30
        La6:
            r10.append(r12)
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongLongMap.joinToString(kotlin.jvm.functions.Function2):java.lang.String");
    }
}
