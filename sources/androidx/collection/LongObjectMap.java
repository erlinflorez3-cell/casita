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
/* JADX INFO: compiled from: LongObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яl\u001d<K!&˛\bDRш|\u0004G\u00068\u000b<H\u0007\"2\u0017\u007f\u0007t~A0JiP.`b2\u000fq|<$i-yّCU0}*\t]UogtUb\u000bQ\u000f\u000eǝ\u0001jBI]xc\u0012\u00172XoG3SvE9vt>\u0005&5*8\b\u0011\tɝ2H\u001e\u0002\u0003CQ\u0011\u001a0VpBĥ\u0013\u0002\u001b܅:\bDĨ\u000f\u001d\rg|6\tqc<ǥ'\u0003wC\u0017KmE\u0015M;\\\u0005=\u001b\u000ey0;BG5C>c\u0005\u0017R\u0012Ϊ\u0013A\u0002=3~U?qɥyˇ5ݙH\u0018#Eg\r\f\tn\u0001\u0013kx\fUA\u007fyYg&:\b|\f\rj\u001d\u001e\b7HdƦ*h\u0018\u000ea\u000b!k\u0007З\b\u0081AȕCpD2=\u007faAi\u001ftmy;Gg}ޭ\u0005U*1\u001e\u0007!\nj>d#7lw\u007fJ\u001aQKff\n\bS\u001e\b~\u0002\u001a*:\u0382Ͻ\u0004/\n1v\u001b3Xs9Q$4&Ve\u007fv3c\u0019iwi`R2p&7X\"\u001c\\Td;ߘ`Vh,?cJlMé\u000e̯\u001fο@M/G(N}~\u001ap[\u0001\"'EeeY5\u009f\u000e MlWMQ\u0012\u0013\u0012V\u00050W<\u0011\u001e\u001f٩Hΐ\u0010ZbMjtV\u0011(w*k~@!ZW\",E<@GuČL\r$kQ\u0003\u000f\njj\u0016\u0005zO4\u0014y3+էɹTfv\u0019w~OV\rb(3gpE\u001b6UP\u0010b\u0015iț\u0005ϗ~ø0yUw\u0005\u0016$|,?$BQl?N#\u001e-,ɨ\u00067Ku\u0003kWw\")\u0001\u0003 <Kj>g6\u0012\u001fX'ʆP؛Sϟj$l!;\b\u0013'*\u0001T#_~d\u001ckMw\fè]FTa\r\u000b%H5\u0003u(#Q=E7\u001dD\u001fB[[˜cˉnЃB\u0010\u001dU\re2S\u00145}\u000bixBLHX\u0010˚й&.r,RNp\"\u0018D\u000f:3RXCtp\u0005_{7u̕l÷+ݸ9lij+q\u00143dɾZwQ\u001a,^q>W߄SܭqmY\u000eSc\u001d<#{gޫB K<nW\u0011\"`\n\u0002KNAqؠƀ@\t2hta\u0016@[T в@~\u000ebw\u000fEKr}I\n&Z\t^fH;ݺs\u0017gƨ\u0007ь\u000eɼ\u038b|5?<6Lbg{2/Vc\u001dcn]8~%YZ\u001d=)bp\u00019[&{W=N\u0004ue\u001equ\fFU\u0015\u001dpVK?W\u0011m6H^9\u0014\u0015Tjv 'jNPg/\u0001\u0003\u000eJK'\u000bGR#uh-Z\u0011\u00107qXG\u001c\r \u0015G\u0015ctW]\f;-K\u0007\u0003\u0014U:\bYA}\u0016_8'23Qb]\u000etJu\u001bhT\"\u001ch\u0002\u0017Th 21zzx\n<JNO0q2Id[y;9p7<|\u0015pdи|\u0014i\u0016st[5\u0013h7\\ \u000b=a-\u0018]Ӎܻ\u0017b`c!Y&\u0003!\u0002\u001a\u001bL>F\nr)>\u000e\u0012\u00017թUݹ\fċwo8&I0\u00014F%\b;\u001c*\u0003d[O'cLf!\\\u001bE\u000eВ\u001dȥ~˱\u0001צ-\u001a\u0005ۈX`\u0017\u0017BGC4r4O\u0019M^Cӑ\u001fԂZقU±%7Z̈+98\u0011})G \u0011Azt.-xMۥ\u0004kD/L\\K#wo2w|\u0003TV{Я\u0001݊\u0003ָ\u001aŔ3`@ԌN^ (IR\u0004W'\u001e\u0019\u0015f\u0011&ޞWƺAܐ_К.\u0007\u0005ӕ\u001dA\u007f?y;DF\u00012G\u000f\u001e\u001e\u000e+֑)9}N-\u001c\u0010n\u001b\u001f[tn\u0017q0Y7[\u001d(Un\u0012@٪bڎ\\°/ǪI9P*mpPXyj\u0012'Ĥ5m\u000bïGq\u0001v\u0010ߙ\u001aFr\u0092_)"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\ng! IY\u000bAv#DAy+\r", "$", "", "u(E", "-bP=T*Bb-", "", "5dc,V(IO\u0017\u0003\nrjz\u00136l\u007f&\u000bD\u000b UCx\u0017F\u0006!D]\b)E", "-rXGX", "5dc,f0SSW|\u0005e3|\u0007>i\n1:<\n !Vk\u001d@\u0001.C", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "9dh@", "", "5dc\u0018X@L\u0012\u0015\b\u0004h;x\u00183o\t6", ";dc.W(MO", "5dc\u001aX;:R\u0015\u000ev\u001d(\u0006\u00129t{7\u007fJ\n%", "Ahi2", "5dc \\A>", "D`[BX:", "", "5dc#T3NS'=vg5\u0007\u0018+t\u00042\u0005N", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "/k[", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "/mh", "1n]AT0Ga", "9dh", "1n]AT0Ga~~\u000f", "1n]AT0Ga\nz\u0002n,", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1nd;g", "3pd._:", "=sW2e", "4h]1>,R7\"}zq", "4h]1>,R7\"}zqjz\u00136l\u007f&\u000bD\u000b ", "4na\u0012T*A", "", "0k^0^", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4na\u0012T*A7\"}zq,{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "7mS2k", "4na\u0012T*A9\u0019\u0013", "4na\u0012T*AD\u0015\u0006\u000b^", "5dc", "uI\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "2dU.h3MD\u0015\u0006\u000b^", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "5dc\u001ce\fEa\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHuzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "6`b566=S", "7r4:c;R", "7r=<g\fF^(\u0013", "8nX;G6,b&\u0003\u0004`", "", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "BqP;f-H`!", "<n]2", "BnBAe0GU", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<]/>[g\u001d<m\u0014=5?FA", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class LongObjectMap<V> {
    public int _capacity;
    public int _size;
    public long[] keys;
    public long[] metadata;
    public Object[] values;

    public /* synthetic */ LongObjectMap(DefaultConstructorMarker defaultConstructorMarker) {
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

    private LongObjectMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = LongSetKt.getEmptyLongArray();
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

    public final V getOrElse(long j2, Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v2 = get(j2);
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
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
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

    public final void forEach(Function2<? super Long, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr2[i2];
            long j3 = ((~j2) << 7) & j2;
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 + j2) - (255 | j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        block.invoke(Long.valueOf(jArr[i5]), objArr[i5]);
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
            if ((-1) - (((-1) - ((j3 + j2) - (j3 | j2))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
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

    public static /* synthetic */ String joinToString$default(LongObjectMap longObjectMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((1 & i3) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
        }
        if ((i3 + 8) - (8 | i3) != 0) {
            i2 = -1;
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
        }
        return longObjectMap.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7 A[PHI: r6
  0x00a7: PHI (r6v2 int) = (r6v1 int), (r6v3 int) binds: [B:6:0x004c, B:22:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
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
            java.lang.Object[] r10 = r2.values
            long[] r9 = r2.metadata
            int r0 = r9.length
            int r8 = r0 + (-2)
            if (r8 < 0) goto Lae
            r7 = 0
            r6 = 0
        L3b:
            r4 = r9[r7]
            long r0 = ~r4
            r2 = 7
            long r0 = r0 << r2
            long r14 = r0 + r4
            long r0 = r0 | r4
            long r14 = r14 - r0
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r1
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 == 0) goto La4
            int r0 = r7 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r3 = 8
            int r15 = 8 - r0
            r14 = 0
        L58:
            if (r14 >= r15) goto La5
            r20 = 255(0xff, double:1.26E-321)
            r18 = -1
            long r16 = r18 - r4
            long r0 = r18 - r20
            long r16 = r16 | r0
            long r18 = r18 - r16
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r0 >= 0) goto L85
            int r0 = r7 << 3
            int r0 = r0 + r14
            r2 = r11[r0]
            r1 = r10[r0]
            r0 = r28
            r0 = r0
            if (r6 != r0) goto L86
            r12.append(r13)
        L7b:
            java.lang.String r1 = r12.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L85:
            goto L9e
        L86:
            if (r6 == 0) goto L8f
            r16 = r12
            r17 = r23
            r16.append(r17)
        L8f:
            r12.append(r2)
            r0 = 61
            r12.append(r0)
            r12.append(r1)
            int r6 = r6 + 1
            r3 = 8
        L9e:
            long r4 = r4 >> r3
            int r14 = r14 + 1
            r0 = r24
            goto L58
        La4:
            goto La7
        La5:
            if (r15 != r3) goto Lae
        La7:
            if (r7 == r8) goto Lae
            int r7 = r7 + 1
            r0 = r24
            goto L3b
        Lae:
            r0 = r22
            r12.append(r0)
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongObjectMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00df A[PHI: r4
  0x00df: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:23:0x0087, B:39:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.LongObjectMap r17, java.lang.CharSequence r18, java.lang.CharSequence r19, java.lang.CharSequence r20, int r21, java.lang.CharSequence r22, kotlin.jvm.functions.Function2 r23, int r24, java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongObjectMap.joinToString$default(androidx.collection.LongObjectMap, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2, int, java.lang.Object):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1 A[PHI: r4
  0x00b1: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0053, B:23:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, java.lang.CharSequence r27, int r28, java.lang.CharSequence r29, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super V, ? extends java.lang.CharSequence> r30) {
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
            java.lang.Object[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lb8
            r5 = 0
            r4 = 0
        L41:
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
            if (r0 == 0) goto Lac
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L5f:
            if (r14 >= r1) goto Lad
            r21 = 255(0xff, double:1.26E-321)
            r19 = -1
            long r17 = r19 - r2
            long r15 = r19 - r21
            long r17 = r17 | r15
            long r19 = r19 - r17
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r0 >= 0) goto L8b
            int r0 = r5 << 3
            int r0 = r0 + r14
            r16 = r9[r0]
            r15 = r8[r0]
            r0 = r28
            if (r4 != r0) goto L8c
            r10.append(r12)
        L81:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L8b:
            goto La4
        L8c:
            if (r4 == 0) goto L95
            r18 = r10
            r19 = r23
            r18.append(r19)
        L95:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            java.lang.Object r0 = r11.invoke(r0, r15)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        La4:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r24
            goto L5f
        Lac:
            goto Lb1
        Lad:
            r0 = 8
            if (r1 != r0) goto Lb8
        Lb1:
            if (r5 == r6) goto Lb8
            int r5 = r5 + 1
            r0 = r24
            goto L41
        Lb8:
            r10.append(r13)
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongObjectMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r10 = r19
            r2 = r18
            r17 = 1
            if (r10 != r2) goto L9
            return r17
        L9:
            boolean r0 = r10 instanceof androidx.collection.LongObjectMap
            r16 = 0
            if (r0 != 0) goto L10
            return r16
        L10:
            androidx.collection.LongObjectMap r10 = (androidx.collection.LongObjectMap) r10
            int r1 = r10.getSize()
            int r0 = r18.getSize()
            if (r1 == r0) goto L1d
            return r16
        L1d:
            long[] r9 = r2.keys
            java.lang.Object[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L86
            r5 = r16
        L2a:
            r3 = r7[r5]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            r13 = -1
            long r11 = r13 - r0
            long r0 = r13 - r3
            long r11 = r11 | r0
            long r13 = r13 - r11
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r1
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 == 0) goto L81
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r12 = 8 - r0
            r11 = r16
        L4c:
            if (r11 >= r12) goto L7f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r3
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L78
            int r0 = r5 << 3
            int r0 = r0 + r11
            r1 = r9[r0]
            r13 = r8[r0]
            if (r13 != 0) goto L6d
            java.lang.Object r0 = r10.get(r1)
            if (r0 != 0) goto L6c
            boolean r0 = r10.containsKey(r1)
            if (r0 != 0) goto L79
        L6c:
            return r16
        L6d:
            java.lang.Object r0 = r10.get(r1)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r13, r0)
            if (r0 != 0) goto L79
            return r16
        L78:
            goto L7b
        L79:
            r15 = 8
        L7b:
            long r3 = r3 >> r15
            int r11 = r11 + 1
            goto L4c
        L7f:
            if (r12 != r15) goto L86
        L81:
            if (r5 == r6) goto L86
            int r5 = r5 + 1
            goto L2a
        L86:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongObjectMap.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007e A[PHI: r5
  0x007e: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:10:0x0036, B:24:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
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
            java.lang.Object[] r9 = r12.values
            long[] r8 = r12.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L83
            r6 = 0
            r5 = 0
        L21:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r3
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r15 = -1
            long r13 = r15 - r0
            long r0 = r15 - r17
            long r13 = r13 | r0
            long r15 = r15 - r13
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 == 0) goto L7b
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r14 = 8
            int r13 = 8 - r0
            r2 = 0
        L42:
            if (r2 >= r13) goto L7c
            r0 = 255(0xff, double:1.26E-321)
            r17 = -1
            long r15 = r17 - r0
            long r0 = r17 - r3
            long r15 = r15 | r0
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L7a
            int r15 = r6 << 3
            int r15 = r15 + r2
            r0 = r10[r15]
            r15 = r9[r15]
            r11.append(r0)
            java.lang.String r0 = "="
            r11.append(r0)
            if (r15 != r12) goto L68
            java.lang.String r15 = "(this)"
        L68:
            r11.append(r15)
            int r5 = r5 + 1
            int r0 = r12._size
            if (r5 >= r0) goto L76
            java.lang.String r0 = ", "
            r11.append(r0)
        L76:
            long r3 = r3 >> r14
            int r2 = r2 + 1
            goto L42
        L7a:
            goto L76
        L7b:
            goto L7e
        L7c:
            if (r13 != r14) goto L83
        L7e:
            if (r6 == r7) goto L83
            int r6 = r6 + 1
            goto L21
        L83:
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r11.append(r0)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "s.append('}').toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongObjectMap.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x009e, code lost:
    
        if (((-1) - (((-1) - ((-1) - (((-1) - r4) | ((-1) - ((~r4) << 6))))) | ((-1) - (-9187201950435737472L)))) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a0, code lost:
    
        r3 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(long r22) {
        /*
            r21 = this;
            r8 = r21
            int r1 = java.lang.Long.hashCode(r22)
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
        L1b:
            long[] r3 = r8.metadata
            int r2 = r20 >> 3
            r0 = 7
            r0 = r20 & r0
            int r1 = r0 << 3
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
            r4 = -1
            long r9 = r4 - r11
            long r2 = r4 - r0
            long r9 = r9 | r2
            long r4 = r4 - r9
            long r4 = r4 | r13
            long r2 = (long) r7
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r9 = r2 - r0
            long r0 = ~r2
            long r0 = r0 & r9
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r15 = -1
            long r2 = r15 - r0
            long r0 = r15 - r17
            long r2 = r2 | r0
            long r15 = r15 - r2
        L55:
            r13 = 0
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 == 0) goto L89
            int r0 = java.lang.Long.numberOfTrailingZeros(r15)
            int r0 = r0 >> 3
            int r0 = r0 + r20
            int r1 = (-1) - r0
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r3 = (-1) - r1
            long[] r0 = r8.keys
            r1 = r0[r3]
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 != 0) goto L7b
        L72:
            if (r3 < 0) goto L79
            java.lang.Object[] r0 = r8.values
            r0 = r0[r3]
        L78:
            return r0
        L79:
            r0 = 0
            goto L78
        L7b:
            r0 = 1
            long r11 = r15 - r0
            r9 = -1
            long r2 = r9 - r15
            long r0 = r9 - r11
            long r2 = r2 | r0
            long r9 = r9 - r2
            r15 = r9
            goto L55
        L89:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            r11 = -1
            long r9 = r11 - r4
            long r2 = r11 - r0
            long r9 = r9 | r2
            long r11 = r11 - r9
            r4 = -1
            long r2 = r4 - r11
            long r0 = r4 - r17
            long r2 = r2 | r0
            long r4 = r4 - r2
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 == 0) goto La2
            r3 = -1
            goto L72
        La2:
            int r19 = r19 + 8
            int r20 = r20 + r19
            int r1 = (-1) - r20
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r20 = (-1) - r1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongObjectMap.get(long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0093, code lost:
    
        if ((((-1) - (((-1) - r4) | ((-1) - ((~r4) << 6)))) & (-9187201950435737472L)) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0095, code lost:
    
        r3 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V getOrDefault(long r20, V r22) {
        /*
            r19 = this;
            r7 = r19
            int r1 = java.lang.Long.hashCode(r20)
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r0
            int r0 = r1 << 16
            r1 = r1 ^ r0
            r0 = 127(0x7f, float:1.78E-43)
            r8 = r1 & r0
            int r6 = r7._capacity
            int r18 = r1 >>> 7
            r18 = r18 & r6
            r17 = 0
        L19:
            long[] r3 = r7.metadata
            int r2 = r18 >> 3
            r0 = 7
            int r1 = (-1) - r18
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            int r1 = r0 << 3
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
            long r2 = (long) r8
            r0 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r0
            long r2 = r2 ^ r4
            long r9 = r2 - r0
            long r0 = ~r2
            long r11 = r0 + r9
            long r0 = r0 | r9
            long r11 = r11 - r0
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r9 = -1
            long r2 = r9 - r11
            long r0 = r9 - r15
            long r2 = r2 | r0
            long r9 = r9 - r2
        L5e:
            r13 = 0
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 == 0) goto L85
            int r0 = java.lang.Long.numberOfTrailingZeros(r9)
            int r0 = r0 >> 3
            int r0 = r0 + r18
            int r3 = r0 + r6
            r0 = r0 | r6
            int r3 = r3 - r0
            long[] r0 = r7.keys
            r1 = r0[r3]
            int r0 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r0 != 0) goto L7f
        L78:
            if (r3 < 0) goto La4
            java.lang.Object[] r0 = r7.values
            r0 = r0[r3]
            return r0
        L7f:
            r2 = 1
            long r0 = r9 - r2
            long r9 = r9 & r0
            goto L5e
        L85:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            r11 = -1
            long r9 = r11 - r4
            long r2 = r11 - r0
            long r9 = r9 | r2
            long r11 = r11 - r9
            long r11 = r11 & r15
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 == 0) goto L97
            r3 = -1
            goto L78
        L97:
            int r17 = r17 + 8
            int r18 = r18 + r17
            int r1 = (-1) - r18
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r18 = (-1) - r1
            goto L19
        La4:
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongObjectMap.getOrDefault(long, java.lang.Object):java.lang.Object");
    }

    public final boolean all(Function2<? super Long, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr2[i2];
            long j3 = (-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2));
            if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 + j2) - (255 | j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (!predicate.invoke(Long.valueOf(jArr[i5]), objArr[i5]).booleanValue()) {
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
    public final boolean any(kotlin.jvm.functions.Function2<? super java.lang.Long, ? super V, java.lang.Boolean> r19) {
        /*
            r18 = this;
            r1 = r18
            java.lang.String r0 = "predicate"
            r11 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            long[] r10 = r1.keys
            java.lang.Object[] r9 = r1.values
            long[] r8 = r1.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            r17 = 0
            if (r7 < 0) goto L70
            r6 = r17
        L19:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            r14 = -1
            long r12 = r14 - r0
            long r0 = r14 - r3
            long r12 = r12 | r0
            long r14 = r14 - r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r14 + r12
            long r14 = r14 | r12
            long r1 = r1 - r14
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 == 0) goto L6b
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r5 = 8 - r0
            r2 = r17
        L3e:
            if (r2 >= r5) goto L69
            r0 = 255(0xff, double:1.26E-321)
            long r15 = r0 + r3
            long r0 = r0 | r3
            long r15 = r15 - r0
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L65
            int r0 = r6 << 3
            int r0 = r0 + r2
            r13 = r10[r0]
            r1 = r9[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            java.lang.Object r0 = r11.invoke(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L65
            r0 = 1
            return r0
        L65:
            long r3 = r3 >> r12
            int r2 = r2 + 1
            goto L3e
        L69:
            if (r5 != r12) goto L70
        L6b:
            if (r6 == r7) goto L70
            int r6 = r6 + 1
            goto L19
        L70:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongObjectMap.any(kotlin.jvm.functions.Function2):boolean");
    }

    public final int count(Function2<? super Long, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j2 = jArr2[i3];
                long j3 = (~j2) << 7;
                if ((-1) - (((-1) - ((j3 + j2) - (j3 | j2))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            if (predicate.invoke(Long.valueOf(jArr[i7]), objArr[i7]).booleanValue()) {
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007f, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
    
        r3 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(long r20) {
        /*
            r19 = this;
            r8 = r19
            int r2 = java.lang.Long.hashCode(r20)
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
            int r18 = r2 >>> 7
            r18 = r18 & r6
            r17 = 0
            r16 = r17
        L20:
            long[] r3 = r8.metadata
            int r2 = r18 >> 3
            r0 = 7
            r0 = r18 & r0
            int r1 = r0 << 3
            r9 = r3[r2]
            long r9 = r9 >>> r1
            r15 = 1
            int r2 = r2 + r15
            r4 = r3[r2]
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
            long r9 = r2 - r0
            long r0 = ~r2
            long r0 = r0 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r0 + r13
            long r0 = r0 | r13
            long r11 = r11 - r0
        L4f:
            r9 = 0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 == 0) goto L78
            int r0 = java.lang.Long.numberOfTrailingZeros(r11)
            int r0 = r0 >> 3
            int r0 = r0 + r18
            int r3 = r0 + r6
            r0 = r0 | r6
            int r3 = r3 - r0
            long[] r0 = r8.keys
            r1 = r0[r3]
            int r0 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r0 != 0) goto L6e
        L69:
            if (r3 < 0) goto L6d
            r17 = r15
        L6d:
            return r17
        L6e:
            r0 = 1
            long r2 = r11 - r0
            long r0 = r11 + r2
            long r11 = r11 | r2
            long r0 = r0 - r11
            r11 = r0
            goto L4f
        L78:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r4 = r4 & r0
            long r4 = r4 & r13
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L83
            r3 = -1
            goto L69
        L83:
            int r16 = r16 + 8
            int r18 = r18 + r16
            int r1 = (-1) - r18
            int r0 = (-1) - r6
            r1 = r1 | r0
            int r18 = (-1) - r1
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongObjectMap.contains(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0097, code lost:
    
        if (((-1) - (((-1) - (r4 & ((~r4) << 6))) | ((-1) - (-9187201950435737472L)))) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0099, code lost:
    
        r3 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsKey(long r20) {
        /*
            r19 = this;
            r8 = r19
            int r2 = java.lang.Long.hashCode(r20)
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
            int r18 = (-1) - r1
            r17 = 0
            r16 = r17
        L25:
            long[] r3 = r8.metadata
            int r2 = r18 >> 3
            r0 = 7
            int r1 = (-1) - r18
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            int r1 = r0 << 3
            r11 = r3[r2]
            long r11 = r11 >>> r1
            r15 = 1
            int r2 = r2 + r15
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
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L64:
            r11 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 == 0) goto L89
            int r0 = java.lang.Long.numberOfTrailingZeros(r9)
            int r0 = r0 >> 3
            int r0 = r0 + r18
            int r3 = r0 + r6
            r0 = r0 | r6
            int r3 = r3 - r0
            long[] r0 = r8.keys
            r1 = r0[r3]
            int r0 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r0 != 0) goto L83
        L7e:
            if (r3 < 0) goto L82
            r17 = r15
        L82:
            return r17
        L83:
            r2 = 1
            long r0 = r9 - r2
            long r9 = r9 & r0
            goto L64
        L89:
            long r0 = ~r4
            r2 = 6
            long r0 = r0 << r2
            long r4 = r4 & r0
            r9 = -1
            long r2 = r9 - r4
            long r0 = r9 - r13
            long r2 = r2 | r0
            long r9 = r9 - r2
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 == 0) goto L9b
            r3 = -1
            goto L7e
        L9b:
            int r16 = r16 + 8
            int r18 = r18 + r16
            r18 = r18 & r6
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongObjectMap.containsKey(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsValue(V r16) {
        /*
            r15 = this;
            java.lang.Object[] r9 = r15.values
            long[] r8 = r15.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            r14 = 0
            if (r7 < 0) goto L4d
            r6 = r14
        Lb:
            r1 = r8[r6]
            long r3 = ~r1
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r1
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r3 + r12
            long r3 = r3 | r12
            long r10 = r10 - r3
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L48
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r10 = 8 - r0
            r5 = r14
        L28:
            if (r5 >= r10) goto L46
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r1
            r3 = 128(0x80, double:6.3E-322)
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 >= 0) goto L42
            int r0 = r6 << 3
            int r0 = r0 + r5
            r0 = r9[r0]
            r3 = r16
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r0 == 0) goto L42
            r0 = 1
            return r0
        L42:
            long r1 = r1 >> r11
            int r5 = r5 + 1
            goto L28
        L46:
            if (r10 != r11) goto L4d
        L48:
            if (r6 == r7) goto L4d
            int r6 = r6 + 1
            goto Lb
        L4d:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongObjectMap.containsValue(java.lang.Object):boolean");
    }

    public int hashCode() {
        long[] jArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr2 = this.metadata;
        int length = jArr2.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int iHashCode = 0;
            while (true) {
                long j2 = jArr2[i3];
                long j3 = ((~j2) << 7) & j2;
                if ((j3 - 9187201950435737472L) - (j3 | (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 + j2) - (255 | j2) < 128) {
                            int i6 = (i3 << 3) + i5;
                            long j4 = jArr[i6];
                            Object obj = objArr[i6];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j4);
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

    public final int findKeyIndex$collection(long j2) {
        int iHashCode = Long.hashCode(j2) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = (i2 + 127) - (127 | i2);
        int i4 = this._capacity;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = ((i5 + 7) - (i5 | 7)) << 3;
            long j3 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j4 = (((long) i3) * ScatterMapKt.BitmaskLsb) ^ j3;
            for (long j5 = (-1) - (((-1) - ((~j4) & (j4 - ScatterMapKt.BitmaskLsb))) | ((-1) - (-9187201950435737472L))); j5 != 0; j5 = (-1) - (((-1) - j5) | ((-1) - (j5 - 1)))) {
                int iNumberOfTrailingZeros = (-1) - (((-1) - ((Long.numberOfTrailingZeros(j5) >> 3) + i5)) | ((-1) - i4));
                if (this.keys[iNumberOfTrailingZeros] == j2) {
                    return iNumberOfTrailingZeros;
                }
            }
            long j6 = j3 & ((~j3) << 6);
            if ((j6 - 9187201950435737472L) - (j6 | (-9187201950435737472L)) != 0) {
                return -1;
            }
            i6 += 8;
            int i9 = i5 + i6;
            i5 = (i9 + i4) - (i9 | i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa A[PHI: r4
  0x00aa: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0054, B:23:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r22, java.lang.CharSequence r23, java.lang.CharSequence r24, int r25, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super V, ? extends java.lang.CharSequence> r26) {
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
            java.lang.Object[] r8 = r2.values
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
            long r18 = r0 + r2
            long r0 = r0 | r2
            long r18 = r18 - r0
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r18 + r16
            long r18 = r18 | r16
            long r14 = r14 - r18
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto La5
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L60:
            if (r14 >= r1) goto La6
            r15 = 255(0xff, double:1.26E-321)
            long r17 = r2 & r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L84
            int r0 = r5 << 3
            int r0 = r0 + r14
            r16 = r9[r0]
            r15 = r8[r0]
            r0 = r25
            if (r4 != r0) goto L85
            r10.append(r11)
        L7a:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L84:
            goto L9d
        L85:
            if (r4 == 0) goto L8e
            r18 = r10
            r19 = r20
            r18.append(r19)
        L8e:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            java.lang.Object r0 = r12.invoke(r0, r15)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        L9d:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r21
            goto L60
        La5:
            goto Laa
        La6:
            r0 = 8
            if (r1 != r0) goto Lb1
        Laa:
            if (r5 == r6) goto Lb1
            int r5 = r5 + 1
            r0 = r21
            goto L3d
        Lb1:
            r10.append(r13)
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongObjectMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5 A[PHI: r4
  0x00b5: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0058, B:23:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, java.lang.CharSequence r27, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super V, ? extends java.lang.CharSequence> r28) {
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
            java.lang.Object[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lbc
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
            if (r0 == 0) goto Lb0
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L64:
            if (r14 >= r1) goto Lb1
            r21 = 255(0xff, double:1.26E-321)
            r19 = -1
            long r17 = r19 - r2
            long r15 = r19 - r21
            long r17 = r17 | r15
            long r19 = r19 - r17
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r0 >= 0) goto L8f
            int r0 = r5 << 3
            int r0 = r0 + r14
            r16 = r9[r0]
            r15 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L90
            r10.append(r11)
        L85:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L8f:
            goto La8
        L90:
            if (r4 == 0) goto L99
            r18 = r10
            r19 = r23
            r18.append(r19)
        L99:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            java.lang.Object r0 = r12.invoke(r0, r15)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        La8:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r24
            goto L64
        Lb0:
            goto Lb5
        Lb1:
            r0 = 8
            if (r1 != r0) goto Lbc
        Lb5:
            if (r5 == r6) goto Lbc
            int r5 = r5 + 1
            r0 = r24
            goto L3d
        Lbc:
            r10.append(r13)
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongObjectMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0 A[PHI: r4 r19
  0x00a0: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x004b, B:23:0x009e] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r19v2 'separator' java.lang.CharSequence) = (r19v1 'separator' java.lang.CharSequence), (r19v3 'separator' java.lang.CharSequence) binds: [B:6:0x004b, B:23:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r21, java.lang.CharSequence r22, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super V, ? extends java.lang.CharSequence> r23) {
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
            long[] r9 = r2.keys
            java.lang.Object[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La7
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
            if (r0 == 0) goto L9b
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L57:
            if (r14 >= r1) goto L9c
            r15 = 255(0xff, double:1.26E-321)
            long r17 = r2 & r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L7a
            int r0 = r5 << 3
            int r0 = r0 + r14
            r16 = r9[r0]
            r15 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L7b
            r10.append(r11)
        L70:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L7a:
            goto L93
        L7b:
            if (r4 == 0) goto L84
            r18 = r10
            r19 = r19
            r18.append(r19)
        L84:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r0, r15)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        L93:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r20
            goto L57
        L9b:
            goto La0
        L9c:
            r0 = 8
            if (r1 != r0) goto La7
        La0:
            if (r5 == r6) goto La7
            int r5 = r5 + 1
            r0 = r20
            goto L39
        La7:
            r10.append(r12)
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongObjectMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0099 A[PHI: r4
  0x0099: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0047, B:21:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r22, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super V, ? extends java.lang.CharSequence> r23) {
        /*
            r21 = this;
            r2 = r21
            java.lang.String r1 = "separator"
            r20 = r22
            r0 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = "transform"
            r13 = r23
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
            java.lang.Object[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto La0
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
            if (r0 == 0) goto L99
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L53:
            if (r1 >= r14) goto L97
            r16 = 255(0xff, double:1.26E-321)
            long r18 = r2 & r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L76
            int r0 = r5 << 3
            int r0 = r0 + r1
            r16 = r9[r0]
            r15 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L77
            r10.append(r11)
        L6c:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L76:
            goto L91
        L77:
            if (r4 == 0) goto L80
            r18 = r10
            r19 = r20
            r18.append(r19)
        L80:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r0, r15)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L91:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r21
            goto L53
        L97:
            if (r14 != r15) goto La0
        L99:
            if (r5 == r6) goto La0
            int r5 = r5 + 1
            r0 = r21
            goto L34
        La0:
            r10.append(r12)
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongObjectMap.joinToString(java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[PHI: r4
  0x009e: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x004a, B:21:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(kotlin.jvm.functions.Function2<? super java.lang.Long, ? super V, ? extends java.lang.CharSequence> r24) {
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
            java.lang.Object[] r8 = r2.values
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
            if (r0 == 0) goto L9e
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L56:
            if (r1 >= r14) goto L9c
            r16 = 255(0xff, double:1.26E-321)
            long r18 = r2 & r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L79
            int r0 = r5 << 3
            int r0 = r0 + r1
            r16 = r9[r0]
            r15 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L7a
            r10.append(r11)
        L6f:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L79:
            goto L96
        L7a:
            if (r4 == 0) goto L7f
            r10.append(r13)
        L7f:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r16 = r22
            r17 = r0
            r18 = r15
            java.lang.Object r0 = r16.invoke(r17, r18)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L96:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r23
            goto L56
        L9c:
            if (r14 != r15) goto La5
        L9e:
            if (r5 == r6) goto La5
            int r5 = r5 + 1
            r0 = r23
            goto L30
        La5:
            r10.append(r12)
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongObjectMap.joinToString(kotlin.jvm.functions.Function2):java.lang.String");
    }
}
