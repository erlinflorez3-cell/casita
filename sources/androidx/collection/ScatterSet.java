package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt;
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
/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я^\u001d<K!&˛\bDRш|\u0004G\u00068\u000b<H\u0007\"2\u0015\u007f\u0007tyA0JfP.`g2\u000fq}<$i-yّCU0}*\teNogtLb\u000bQ/\u000e\u0016~u4Icxe\u0012\u00157JoM?UڎE9n\u007f>\u0005&8*8\u0010\u0005\tɝ0|&͌#EQÈ /pphREL?Z\u0017\f@ŋ\u0005\u001ejh\u0017nV}u:]53\tPa?z@\u000e]\u001c|Öܮ\u0011\u0001g3;F=K%'Y\t-ikA\u0013? O3|mݗ1˗rɎ̯X\u0006\u001c\u00191N\u001d]\u0001%%\t_x$'Ya,\u0004^&@w)\u000e=[\u0012!\u001eBX?=)\u001dڜԧ7~xhPV\btR\u0002\u0001g\\.5\u0002C+g-\u0015e(ݩ\u001fل6ަ˟\r$+\u0005t kT\u001c_]%b\u0011i7aBMH\u0005ˣ\bW6\u0018~}\u001a*2Bw\u0004=\u0013).M¦}ي9؝%k\u0010d\rm\u0005\"xh\u0002l\u0019M\tZ|3O*7\u000f\u000bcr\u0018\u0004kdi< \u0004ȼΤ\u000b\b\u000e(0b}R1'\u0016Tu\u007fyl]]87]z}ղtā\rãޭ^9=Ui\u000fqR\u0005\u0013\bMp#pfpe<`jG:4^i>wB\u0380NT)@_\n\u001cb/a\u001dj,`\u0003TՓ\bҒ\u000fރ^j\u0016 bUl\u000fwG\r\t7ˆ#ʠuς|I:!)_;di5Oğ\u0006AvG\u0015>\u0017\u0010\u0004\u000f}х֙KVr+\u0006[\u00026&\u001c?WUT#\u0011\u000f)`\u0014[Y\u0013ǰḵLȼ\u0600z\u0003\u0002\u0013Ag>g\u0016iҔ0`xo\u0018\u0014%H\u000f`\t\">ۭ0\u0019oY\u0013bse\u001bjtδ\u03a2\u0007cBcH\u0003\u000b5.'\u0007uH\u0014E/S'K(&(u֙gՙh۰Іyh\u0017*zd\u0014,q\u0015̔fQkW\u0004pW\u0001\u0017>PL\u001d\"Pq\u0003\u0013\u0018S\u0019CCΉȈEnvkHS\u0011E\u000eh\r23\bf]J\u0013\u001e&bB&͏y̎|жٮC+\u0019QYf}mY[S\u0003\u001d4#{_\u0017B;KInrr\u001a@\u0015\"\u001bݠEEh\u001aL\u000f*J<>\u000e\u0011i\u007fy\b z.n\u000e#]ϪHȶ:ٙ\u0558T~dZN\u0004pEn r\u0007\r;K\u001e'8w\u00196Jb\\{2/ee\r)\u0019g~\u00157s\u0015bh3(\u00071;KcCW3N\u0004u[\u001equ\fFK\u0015\u001dpJK?W\u0011m+H^9\b\u0015Tjv \u001cjNP,/\u0001\u0003\u000eJ@'\u000bG\u0002#\u0004h-Z\u0006\u0010ES\u001c\u0011\u0017z͈\u0017\u000e\rctMC\u0005cA\u0004N3\u001854oSi\u0010P&.`\u001ctO\r\u001e\"7\u001ak\u001dR\u0016 \u0019\u0019կGސ'܂\u0010̛Ntz˖~\u0018DS\u001a30\u0016\u0015̏*լw̺3߿p\u0006JŮ9\b\u0018h\u0005c\u001dXAHЂ5Z\u0012p3V+\u0010wm<\u001bpbJ\u0015c\"n\u0010.\u0014C/UߎFӳ\u007fփ[ʍlxsOi\u0018;1q4o2\u0001h,\n7y$\u0011`Ĕfֽ\u0012۰Y̡h\u000fd֬RY\u0014lx)5\u0004\u001a8,|-K\u0015Vӥ8J\u000b j?E ەZ\f\u0003֟\u0007\tML,Ѝa\u0001>\u05f6;n"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u0015\u0013V~\u000eId%D/", "\u0013", "", "u(E", "-bP=T*Bb-", "", "-rXGX", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "3kT:X5Ma", "", "5dc\u0012_,FS\"\u000e\t\u001d(\u0006\u00129t{7\u007fJ\n%", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", ";dc.W(MO", "", "5dc\u001aX;:R\u0015\u000ev\u001d(\u0006\u00129t{7\u007fJ\n%", "Ahi2", "5dc \\A>", "/k[", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "3kT:X5M", "/mh", "/rB2g", "", "1n]AT0Ga", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1nd;g", "3pd._:", "=sW2e", "4h]183>[\u0019\b\nB5{\tB", "4h]183>[\u0019\b\nB5{\tB$}2\u0003G\u0001\u0015&Ky\u0017", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "4ha@g", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "4ha@g\u0016K<)\u0006\u0002", "4na\u0012T*A", "", "0k^0^", "4na\u0012T*A7\"}zq", "7mS2k", "6`b566=S", "7r4:c;R", "7r=<g\fF^(\u0013", "8nX;G6,b&\u0003\u0004`", "", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "BqP;f-H`!", "<n]2", "BnBAe0GU", "!dc$e(I^\u0019\f", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r D[\u0016=#", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class ScatterSet<E> {
    public int _capacity;
    public int _size;
    public Object[] elements;
    public long[] metadata;

    public /* synthetic */ ScatterSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getElements$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
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

    private ScatterSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = ContainerHelpersKt.EMPTY_OBJECTS;
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

    public final void forEachIndex(Function1<? super Integer, Unit> block) {
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

    public final void forEach(Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.elements;
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
    public static /* synthetic */ String joinToString$default(ScatterSet scatterSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, Function1 function1, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i3 + 1) - (1 | i3) != 0) {
        }
        if ((2 & i3) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
        }
        if ((i3 + 8) - (8 | i3) != 0) {
            i2 = -1;
        }
        if ((16 & i3) != 0) {
        }
        if ((i3 + 32) - (i3 | 32) != 0) {
            function1 = null;
        }
        return scatterSet.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence4, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0099 A[PHI: r4
  0x0099: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:42:0x0043, B:62:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r22, java.lang.CharSequence r23, java.lang.CharSequence r24, int r25, java.lang.CharSequence r26, kotlin.jvm.functions.Function1<? super E, ? extends java.lang.CharSequence> r27) {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r0 = "separator"
            r12 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "prefix"
            r2 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "postfix"
            r11 = r24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "truncated"
            r10 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            java.lang.Object[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La0
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
            if (r13 == 0) goto L96
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r14 = 8
            int r13 = 8 - r0
            r1 = 0
        L4f:
            if (r1 >= r13) goto L97
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L75
            int r0 = r5 << 3
            int r0 = r0 + r1
            r0 = r8[r0]
            r14 = r25
            if (r4 != r14) goto L76
            r9.append(r10)
        L6b:
            java.lang.String r1 = r9.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L75:
            goto L86
        L76:
            if (r4 == 0) goto L7b
            r9.append(r12)
        L7b:
            r14 = r27
            if (r14 != 0) goto L8c
            r9.append(r0)
        L82:
            int r4 = r4 + 1
            r14 = 8
        L86:
            long r2 = r2 >> r14
            int r1 = r1 + 1
            r0 = r21
            goto L4f
        L8c:
            java.lang.Object r0 = r14.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            goto L82
        L96:
            goto L99
        L97:
            if (r13 != r14) goto La0
        L99:
            if (r5 == r6) goto La0
            int r5 = r5 + 1
            r0 = r21
            goto L35
        La0:
            r9.append(r11)
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function1):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r10 = r18
            r2 = r17
            r16 = 1
            if (r10 != r2) goto L9
            return r16
        L9:
            boolean r0 = r10 instanceof androidx.collection.ScatterSet
            r15 = 0
            if (r0 != 0) goto Lf
            return r15
        Lf:
            androidx.collection.ScatterSet r10 = (androidx.collection.ScatterSet) r10
            int r1 = r10.getSize()
            int r0 = r17.getSize()
            if (r1 == r0) goto L1c
            return r15
        L1c:
            java.lang.Object[] r9 = r2.elements
            long[] r8 = r2.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L68
            r6 = r15
        L26:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r11 = r0 + r3
            long r0 = r0 | r3
            long r11 = r11 - r0
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r1
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 == 0) goto L63
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r5 = r15
        L43:
            if (r5 >= r11) goto L61
            r0 = 255(0xff, double:1.26E-321)
            long r13 = r0 + r3
            long r0 = r0 | r3
            long r13 = r13 - r0
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5d
            int r0 = r6 << 3
            int r0 = r0 + r5
            r0 = r9[r0]
            boolean r0 = r10.contains(r0)
            if (r0 != 0) goto L5d
            return r15
        L5d:
            long r3 = r3 >> r12
            int r5 = r5 + 1
            goto L43
        L61:
            if (r11 != r12) goto L68
        L63:
            if (r6 == r7) goto L68
            int r6 = r6 + 1
            goto L26
        L68:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: androidx.collection.ScatterSet$toString$1 */
    /* JADX INFO: compiled from: ScatterSet.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,t\bDJe\u0003İY\u0006^\nND\u0005Ӭ:\u0012(\u000btkQ0\u000be\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "\u0013", "3kT:X5M", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~7\u0001\u001cD[\u0016:]CDi4s"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<E, CharSequence> {
        final /* synthetic */ ScatterSet<E> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScatterSet<E> scatterSet) {
            super(1);
            this.this$0 = scatterSet;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(E e2) {
            return e2 == this.this$0 ? "(this)" : String.valueOf(e2);
        }
    }

    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new Function1<E, CharSequence>(this) { // from class: androidx.collection.ScatterSet.toString.1
            final /* synthetic */ ScatterSet<E> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ScatterSet<E> this) {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(E e2) {
                return e2 == this.this$0 ? "(this)" : String.valueOf(e2);
            }
        }, 25, null);
    }

    public final Set<E> asSet() {
        return new SetWrapper();
    }

    /* JADX INFO: compiled from: ScatterSet.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000edLcz\u0004I\u0006>\u00116B\u0005#4\u0012\u0006\u0010nj?2LeVJZS0\u000fs{BJcҕw٢=kڼ.(\u0019Q^g\u001eñxYKFǇ\n\u0016\u0007jt]c}u\u0012=8rsM:eosʠ'ұ6ӯ$20@B\u0019\u000f#BH>|+MY\u0016*6PrJRC˟3%X\u001a\u0007&\u000f*tg|<\u000f\u0001&G=0\u001boRP7_fŧ{\u001b\rí']\to\u001fC@e7Ky*Ο\tқ_C\u001bAw@\u0013lҐ+:"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\u0015\u0013V~\u000eId%D\u0018k F_#*XN;x\n", "", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ\u0005\u0015C~\u001d<\u0004\u00135hSc(", "Ahi2", "", "5dc \\A>", "u(8", "1n]AT0Ga", "", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1n]AT0Gat\u0006\u0002", "3kT:X5Ma", "", "7r4:c;R", "7sT?T;H`", "", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public class SetWrapper implements Set<E>, KMappedMarker {
        @Override // java.util.Set, java.util.Collection
        public boolean add(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.toArray(this, array);
        }

        public SetWrapper() {
        }

        @Override // java.util.Set, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        public int getSize() {
            return ScatterSet.this._size;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            ScatterSet<E> scatterSet = ScatterSet.this;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!scatterSet.contains((E) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return ScatterSet.this.contains(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return ScatterSet.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return SequencesKt.iterator(new ScatterSet$SetWrapper$iterator$1(ScatterSet.this, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final E first() {
        /*
            r15 = this;
            r0 = r15
            java.lang.Object[] r12 = r0.elements
            long[] r13 = r0.metadata
            int r0 = r13.length
            int r11 = r0 + (-2)
            if (r11 < 0) goto L48
            r14 = 0
            r10 = r14
        Lc:
            r7 = r13[r10]
            long r0 = ~r7
            r2 = 7
            long r0 = r0 << r2
            long r5 = r0 + r7
            long r0 = r0 | r7
            long r5 = r5 - r0
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r5 + r3
            long r5 = r5 | r3
            long r1 = r1 - r5
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L43
            int r0 = r10 - r11
            int r0 = ~r0
            int r0 = r0 >>> 31
            r9 = 8
            int r6 = 8 - r0
            r5 = r14
        L2c:
            if (r5 >= r6) goto L41
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r7
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3d
            int r0 = r10 << 3
            int r0 = r0 + r5
            r0 = r12[r0]
            return r0
        L3d:
            long r7 = r7 >> r9
            int r5 = r5 + 1
            goto L2c
        L41:
            if (r6 != r9) goto L48
        L43:
            if (r10 == r11) goto L48
            int r10 = r10 + 1
            goto Lc
        L48:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "The ScatterSet is empty"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.first():java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x005f  */
    /* JADX WARN: Type inference failed for: r1v1, types: [E, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final E first(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r18) {
        /*
            r17 = this;
            java.lang.String r0 = "predicate"
            r10 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = r17
            java.lang.Object[] r9 = r0.elements
            long[] r8 = r0.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L64
            r16 = 0
            r6 = r16
        L17:
            r2 = r8[r6]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r0 + r11
            long r0 = r0 | r11
            long r4 = r4 - r0
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 == 0) goto L5f
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r5 = 8 - r0
            r4 = r16
        L35:
            if (r4 >= r5) goto L5d
            r0 = 255(0xff, double:1.26E-321)
            r14 = -1
            long r12 = r14 - r0
            long r0 = r14 - r2
            long r12 = r12 | r0
            long r14 = r14 - r12
            r12 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L59
            int r0 = r6 << 3
            int r0 = r0 + r4
            r1 = r9[r0]
            java.lang.Object r0 = r10.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L59
            return r1
        L59:
            long r2 = r2 >> r11
            int r4 = r4 + 1
            goto L35
        L5d:
            if (r5 != r11) goto L64
        L5f:
            if (r6 == r7) goto L64
            int r6 = r6 + 1
            goto L17
        L64:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Could not find a match"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.first(kotlin.jvm.functions.Function1):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E, java.lang.Object] */
    public final E firstOrNull(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
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
                        ?? r1 = (Object) objArr[(i2 << 3) + i4];
                        if (predicate.invoke(r1).booleanValue()) {
                            return r1;
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return null;
                }
            }
            if (i2 == length) {
                return null;
            }
            i2++;
        }
    }

    public final boolean all(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
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
                    if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128 && !predicate.invoke(objArr[(i2 << 3) + i4]).booleanValue()) {
                        return false;
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

    /* JADX WARN: Removed duplicated region for block: B:43:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r20) {
        /*
            r19 = this;
            java.lang.String r0 = "predicate"
            r9 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r19
            java.lang.Object[] r8 = r0.elements
            long[] r7 = r0.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            r18 = 0
            if (r6 < 0) goto L6d
            r5 = r18
        L17:
            r1 = r7[r5]
            long r3 = ~r1
            r0 = 7
            long r3 = r3 << r0
            long r16 = r3 + r1
            long r3 = r3 | r1
            long r16 = r16 - r3
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = -1
            long r10 = r12 - r16
            long r3 = r12 - r14
            long r10 = r10 | r3
            long r12 = r12 - r10
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L68
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r10 = 8
            int r4 = 8 - r0
            r3 = r18
        L3d:
            if (r3 >= r4) goto L66
            r11 = 255(0xff, double:1.26E-321)
            r15 = -1
            long r13 = r15 - r11
            long r11 = r15 - r1
            long r13 = r13 | r11
            long r15 = r15 - r13
            r11 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r0 >= 0) goto L62
            int r0 = r5 << 3
            int r0 = r0 + r3
            r0 = r8[r0]
            java.lang.Object r0 = r9.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L62
            r0 = 1
            return r0
        L62:
            long r1 = r1 >> r10
            int r3 = r3 + 1
            goto L3d
        L66:
            if (r4 != r10) goto L6d
        L68:
            if (r5 == r6) goto L6d
            int r5 = r5 + 1
            goto L17
        L6d:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.any(kotlin.jvm.functions.Function1):boolean");
    }

    public final int count(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j2 = jArr[i3];
                long j3 = (-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2));
                if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j2) < 128 && predicate.invoke(objArr[(i3 << 3) + i6]).booleanValue()) {
                            i4++;
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

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        r4 = r4 & ((~r4) << 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
    
        if (((r4 - 9187201950435737472L) - (r4 | (-9187201950435737472L))) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        r1 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(E r23) {
        /*
            r22 = this;
            r8 = r22
            r21 = 0
            r9 = r23
            if (r9 == 0) goto Laa
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
            int r20 = (-1) - r1
            r19 = r21
        L24:
            long[] r3 = r8.metadata
            int r2 = r20 >> 3
            r0 = 7
            int r1 = (-1) - r20
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            int r1 = r0 << 3
            r10 = r3[r2]
            long r10 = r10 >>> r1
            r18 = 1
            int r2 = r2 + r18
            r4 = r3[r2]
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
            long r10 = r0 + r12
            long r0 = r0 | r12
            long r10 = r10 - r0
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r14 = -1
            long r2 = r14 - r10
            long r0 = r14 - r16
            long r2 = r2 | r0
            long r14 = r14 - r2
        L61:
            r10 = 0
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 == 0) goto L93
            int r0 = java.lang.Long.numberOfTrailingZeros(r14)
            int r0 = r0 >> 3
            int r0 = r0 + r20
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r1 = (-1) - r1
            java.lang.Object[] r0 = r8.elements
            r0 = r0[r1]
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r9)
            if (r0 == 0) goto L85
        L80:
            if (r1 < 0) goto L84
            r21 = r18
        L84:
            return r21
        L85:
            r0 = 1
            long r12 = r14 - r0
            r10 = -1
            long r2 = r10 - r14
            long r0 = r10 - r12
            long r2 = r2 | r0
            long r10 = r10 - r2
            r14 = r10
            goto L61
        L93:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r4 = r4 & r0
            long r1 = r4 + r16
            long r4 = r4 | r16
            long r1 = r1 - r4
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 == 0) goto La2
            r1 = -1
            goto L80
        La2:
            int r19 = r19 + 8
            int r20 = r20 + r19
            r20 = r20 & r6
            goto L24
        Laa:
            r1 = r21
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.contains(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int iHashCode = 0;
            while (true) {
                long j2 = jArr[i3];
                long j3 = (~j2) << 7;
                if ((-1) - (((-1) - ((j3 + j2) - (j3 | j2))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                            Object obj = objArr[(i3 << 3) + i5];
                            iHashCode += obj != null ? obj.hashCode() : 0;
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

    public final int findElementIndex$collection(E e2) {
        int i2 = 0;
        int iHashCode = (e2 != null ? e2.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = (-1) - (((-1) - i3) | ((-1) - 127));
        int i5 = this._capacity;
        int i6 = i3 >>> 7;
        while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.metadata;
            int i8 = i7 >> 3;
            int i9 = ((-1) - (((-1) - i7) | ((-1) - 7))) << 3;
            long j2 = (-1) - (((-1) - ((-1) - (((-1) - (jArr[i8 + 1] << (64 - i9))) | ((-1) - ((-i9) >> 63))))) & ((-1) - (jArr[i8] >>> i9)));
            long j3 = (((long) i4) * ScatterMapKt.BitmaskLsb) ^ j2;
            long j4 = j3 - ScatterMapKt.BitmaskLsb;
            long j5 = ~j3;
            long j6 = (j5 + j4) - (j5 | j4);
            for (long j7 = (j6 - 9187201950435737472L) - (j6 | (-9187201950435737472L)); j7 != 0; j7 &= j7 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i7) & i5;
                if (Intrinsics.areEqual(this.elements[iNumberOfTrailingZeros], e2)) {
                    return iNumberOfTrailingZeros;
                }
            }
            long j8 = (~j2) << 6;
            if ((((j2 + j8) - (j2 | j8)) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
    }
}
