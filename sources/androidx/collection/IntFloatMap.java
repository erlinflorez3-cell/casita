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
/* JADX INFO: compiled from: IntFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005'4\u0012\u0006\u001anj?0LeVBZS0\u0011s{B6c$wCCU(\u0007*ޛWN}gvJh\u0010K\u000f\f\u001f\u0001j:I]ތe\u0012%2JoE3UoS9ht<\n(288\u0002\u0005\u0007\u001c2H\u001e\u0003\u0003ŏS\f ;Hp@W\u0015M\u001b\u001a\u001aßDT\u0017Ȧ\rg|5\tqc<ǥ'\u0003wB\u0017KmD\u0015M;[\u0005=\u001b\ry0;BG5C'c\u0005\u0017R\nW\u0013A\u0002=3}U>qɥyˇ5ݙH\u0018#Dg\r\f\bn\u0001\u0013jx\fU@\u007fyYf&:\b|\f\rj\u0006\u001e\b7H\\E*h\u0018\u000ea\n!j\u0007З\b\u0081AȕCpD1=\u007fa@i\u001ftly;GP}ޭ\u0005U*1\u001d\u0007!\ni>d#6lw\u007f3\u001aLKef\n\bR\u001e\b~\u0001\u001a*2H\u0010\u0004=\u001b).E'\u007f\u007fGB9k0Jt}\u0005\u001bxzckbHn$~\u0018G*7$jFt\u0005\u001ae\u0003orґSʵS͵F\u0019!@twj6U\u0016\\p\u0001k\u0001L\f\tkÛf\u007fg|\u000e&Wg`c9_~(a\u0001xZ>\u0005%\u0013{~B\u00020\u000b\u00116GJxz!\b\u000brPܟ\u0017<E\u0018,:2X)^\u001bN)9RR\r\u0018\u000erӳ\u0014\tZY4\toK\u0005\u000b\u0007V\u0003\u000f\u007fi\tIZ!\u000f9sےWۺ\u0018ğ\u001eOv\\\u0015#5#$\u001fU\rdb\\}&\u0005\u0004}°\u001a$?w?C\u00196\u000f+8\bSo\\tuQ{6U$CȬ\u0015ĉg֫05x\u001cD`\u0019n\u007fs%G\u000fy\u00034\u0018s.{ӶJ\u0005M\nd\u0011aeYt\t_biH~\u0015\u001fLI/\u0019hģ;տBگeC\u0006@G\u0015\u0010\u0002\u001a\u000f<\u001fz*6\u0006u\u0013Z{݁slW\u0004BA>pi\u0001D(J\u000b\u0013DXj&,p2zن9ɞ@Ь9eFz#/,~70\u001b\fn[h\u00156ϟ4vs8\"[}Bvs)\u001fhkg\u001co{`\u0019y'\n9\u0014y\u000f LU \u0005o\u0013\r>!\f\u0018dCkl\u0013k!*D.L\b9[\u0003\u001bLؒ\u0001ƍEܪW\u001d@t\f;\u0005\u0010\u001b\r%ZV8xE\u000f6r\u0005\rCK\u001e'Jy={{l/\u0012h1Y#\t)\"g~\u0015][JZ9)ap\u00019}\u000eIO\u0002D>_)\u001c$ \u0012>\u0018\u000bXZ\u0018I;\u0002\u0017ev>\u001b#U\u0013\u0007+{Z]`\u0004:)-1-\u0014B\n\u001dB1O!(\u00133RN\u0006p[\u001a/Ot/\r\f\u000b\u001e^\u001b[>e3CIxO?{\u0006Uk\u0004\u000e .c\u001ctO\u0015\bDl\fkXRF\u0002'r\u00117\u0015ц$\u000e4p\u0005x\u0010U\u00188U\bY\u001d#oiz&9͛+5r,RQn \u001aeri\u0015s\u001b\u0005v1\u00052\u001dD\u0017ɇ\u000f¨Lܘ[\\hx)SNmY\u0006\"T>\u001fd>)=`eqi\tk}]Cċmմ\u0001ԟ=ëV$\u0006Υ\nw\n-b(eQdQVd7^#܀\u0016В5ȧ4̒x\u00121ح\r\u0001Nc\u001f\u0013\u0005U\u0001$|/e\u001bU ǏKd\u001f\u0006KP4)\u0002hM$O29y^ϓOܛ\u0011ŉ\u0001ʷ.H\u0011ۂ\u0010i28TT\u000e05e<m\u0013\u0010\\ɔ\u0004Я\u0019\u074c8י\u0012\u00177դH\"Dj(\u001c\f`AP1\u0011/\u0017nJ˲\u000b\u001dMlWc32Q\u0013\u000f\u001eWy_}pݩu\u0088yˆ\u001bΘ\u001f]nծ57k_5\f֎dI?\u07bac[\u0017d2ޓes\u001dÂY\u0002"}, d2 = {"\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &(v\u00188\u0006\r1dS", "", "u(E", "-bP=T*Bb-", "", "5dc,V(IO\u0017\u0003\nrjz\u00136l\u007f&\u000bD\u000b UCx\u0017F\u0006!D]\b)E", "-rXGX", "5dc,f0SSW|\u0005e3|\u0007>i\n1:<\n !Vk\u001d@\u0001.C", "1`_.V0Mg", "5dc\u0010T7:Q\u001d\u000e\u000f", "u(8", "9dh@", "", "5dc\u0018X@L\u0012\u0015\b\u0004h;x\u00183o\t6", ";dc.W(MO", "", "5dc\u001aX;:R\u0015\u000ev\u001d(\u0006\u00129t{7\u007fJ\n%", "Ahi2", "5dc \\A>", "D`[BX:", "", "5dc#T3NS'=vg5\u0007\u0018+t\u00042\u0005N", "/k[", "", ">qT1\\*:b\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "/mh", "1n]AT0Ga", "9dh", "1n]AT0Ga~~\u000f", "1n]AT0Ga\nz\u0002n,", "D`[BX", "1nd;g", "3pd._:", "=sW2e", "4h]1>,R7\"}zq", "4na\u0012T*A", "", "0k^0^", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4na\u0012T*A7\"}zq,{", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "7mS2k", "4na\u0012T*A9\u0019\u0013", "4na\u0012T*AD\u0015\u0006\u000b^", "5dc", "5dc\u001ce\u000b>T\u0015\u000f\u0002m", "2dU.h3MD\u0015\u0006\u000b^", "5dc\u001ce\fEa\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "6`b566=S", "7r4:c;R", "7r=<g\fF^(\u0013", "8nX;G6,b&\u0003\u0004`", "", "Ad_.e(M]&", "", ">qT3\\?", ">nbAY0Q", ":h\\6g", "Bqd;V(MS\u0018", "BqP;f-H`!", "<n]2", "BnBAe0GU", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.D:\u0005*3|}*X\u0019", "1n[9X*MW#\b"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class IntFloatMap {
    public int _capacity;
    public int _size;
    public int[] keys;
    public long[] metadata;
    public float[] values;

    public /* synthetic */ IntFloatMap(DefaultConstructorMarker defaultConstructorMarker) {
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

    private IntFloatMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = IntSetKt.getEmptyIntArray();
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

    public final float get(int i2) {
        int iFindKeyIndex = findKeyIndex(i2);
        if (iFindKeyIndex < 0) {
            throw new NoSuchElementException("Cannot find value for key " + i2);
        }
        return this.values[iFindKeyIndex];
    }

    public final float getOrDefault(int i2, float f2) {
        int iFindKeyIndex = findKeyIndex(i2);
        return iFindKeyIndex >= 0 ? this.values[iFindKeyIndex] : f2;
    }

    public final float getOrElse(int i2, Function0<Float> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int iFindKeyIndex = findKeyIndex(i2);
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
            long j3 = (~j2) << 7;
            if ((-1) - (((-1) - ((j3 + j2) - (j3 | j2))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
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

    public final void forEach(Function2<? super Integer, ? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int[] iArr = this.keys;
        float[] fArr = this.values;
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
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        block.invoke(Integer.valueOf(iArr[i5]), Float.valueOf(fArr[i5]));
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
            if ((-1) - (((-1) - (((~j2) << 7) & j2)) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
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
            if ((-1) - (((-1) - ((-1) - (((-1) - ((~j2) << 7)) | ((-1) - j2)))) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
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

    public final boolean contains(int i2) {
        return findKeyIndex(i2) >= 0;
    }

    public final boolean containsKey(int i2) {
        return findKeyIndex(i2) >= 0;
    }

    public static /* synthetic */ String joinToString$default(IntFloatMap intFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
        }
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
        }
        if ((8 & i3) != 0) {
            i2 = -1;
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
        }
        return intFloatMap.joinToString(charSequence, charSequence2, charSequence3, i2, charSequence4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5 A[PHI: r4
  0x00a5: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x004e, B:22:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
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
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto Lac
            r5 = 0
            r4 = 0
        L39:
            r2 = r7[r5]
            long r0 = ~r2
            r13 = 7
            long r0 = r0 << r13
            long r0 = r0 & r2
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r15 = -1
            long r13 = r15 - r0
            long r0 = r15 - r17
            long r13 = r13 | r0
            long r15 = r15 - r13
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 == 0) goto La2
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r1 = 8
            int r14 = 8 - r0
            r13 = 0
        L5a:
            if (r13 >= r14) goto La3
            r19 = 255(0xff, double:1.26E-321)
            long r17 = r2 + r19
            long r15 = r2 | r19
            long r17 = r17 - r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto L83
            int r0 = r5 << 3
            int r0 = r0 + r13
            r15 = r9[r0]
            r1 = r8[r0]
            r0 = r26
            r0 = r0
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
            r16 = r10
            r17 = r21
            r16.append(r17)
        L8d:
            r10.append(r15)
            r0 = 61
            r10.append(r0)
            r10.append(r1)
            int r4 = r4 + 1
            r1 = 8
        L9c:
            long r2 = r2 >> r1
            int r13 = r13 + 1
            r0 = r22
            goto L5a
        La2:
            goto La5
        La3:
            if (r14 != r1) goto Lac
        La5:
            if (r5 == r6) goto Lac
            int r5 = r5 + 1
            r0 = r22
            goto L39
        Lac:
            r10.append(r12)
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2 A[PHI: r4
  0x00f2: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:23:0x0092, B:39:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.IntFloatMap r19, java.lang.CharSequence r20, java.lang.CharSequence r21, java.lang.CharSequence r22, int r23, java.lang.CharSequence r24, kotlin.jvm.functions.Function2 r25, int r26, java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntFloatMap.joinToString$default(androidx.collection.IntFloatMap, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2, int, java.lang.Object):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3 A[PHI: r4
  0x00b3: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x005b, B:21:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r24, java.lang.CharSequence r25, java.lang.CharSequence r26, int r27, java.lang.CharSequence r28, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Float, ? extends java.lang.CharSequence> r29) {
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
            float[] r8 = r2.values
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
            if (r0 == 0) goto Lb3
            int r0 = r5 - r6
            int r0 = ~r0
            int r1 = r0 >>> 31
            r0 = 8
            int r1 = 8 - r1
            r14 = 0
        L67:
            if (r14 >= r1) goto Laf
            r15 = 255(0xff, double:1.26E-321)
            long r17 = r2 & r15
            r15 = 128(0x80, double:6.3E-322)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 >= 0) goto La7
            int r0 = r5 << 3
            int r0 = r0 + r14
            r16 = r9[r0]
            r0 = r8[r0]
            r15 = r27
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
            r18 = r22
            r17.append(r18)
        L94:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r16)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r11.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        La7:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r23
            goto L67
        Laf:
            r0 = 8
            if (r1 != r0) goto Lba
        Lb3:
            if (r5 == r6) goto Lba
            int r5 = r5 + 1
            r0 = r23
            goto L41
        Lba:
            r10.append(r13)
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
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
            boolean r0 = r10 instanceof androidx.collection.IntFloatMap
            r17 = 0
            if (r0 != 0) goto L10
            return r17
        L10:
            androidx.collection.IntFloatMap r10 = (androidx.collection.IntFloatMap) r10
            int r1 = r10.getSize()
            int r0 = r19.getSize()
            if (r1 == r0) goto L1d
            return r17
        L1d:
            int[] r9 = r2.keys
            float[] r8 = r2.values
            long[] r7 = r2.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L74
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
            if (r0 == 0) goto L6e
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = r17
        L4b:
            if (r4 >= r11) goto L6c
            r0 = 255(0xff, double:1.26E-321)
            long r15 = r0 + r2
            long r0 = r0 | r2
            long r15 = r15 - r0
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L68
            int r1 = r5 << 3
            int r1 = r1 + r4
            r0 = r9[r1]
            r1 = r8[r1]
            float r0 = r10.get(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L73
        L68:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L4b
        L6c:
            if (r11 != r12) goto L74
        L6e:
            if (r5 == r6) goto L74
            int r5 = r5 + 1
            goto L2a
        L73:
            return r17
        L74:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntFloatMap.equals(java.lang.Object):boolean");
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
            float[] r8 = r11.values
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntFloatMap.toString():java.lang.String");
    }

    public final boolean all(Function2<? super Integer, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.keys;
        float[] fArr = this.values;
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
                    if ((255 + j2) - (255 | j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (!predicate.invoke(Integer.valueOf(iArr[i5]), Float.valueOf(fArr[i5])).booleanValue()) {
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Float, java.lang.Boolean> r21) {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r0 = "predicate"
            r10 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int[] r9 = r1.keys
            float[] r8 = r1.values
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            r19 = 0
            if (r6 < 0) goto L79
            r5 = r19
        L19:
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
            if (r0 == 0) goto L74
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r4 = r19
        L3f:
            if (r4 >= r11) goto L72
            r0 = 255(0xff, double:1.26E-321)
            r15 = -1
            long r13 = r15 - r0
            long r0 = r15 - r2
            long r13 = r13 | r0
            long r15 = r15 - r13
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L6e
            int r0 = r5 << 3
            int r0 = r0 + r4
            r1 = r9[r0]
            r0 = r8[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r10.invoke(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6e
            r0 = 1
            return r0
        L6e:
            long r2 = r2 >> r12
            int r4 = r4 + 1
            goto L3f
        L72:
            if (r11 != r12) goto L79
        L74:
            if (r5 == r6) goto L79
            int r5 = r5 + 1
            goto L19
        L79:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntFloatMap.any(kotlin.jvm.functions.Function2):boolean");
    }

    public final int count(Function2<? super Integer, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int[] iArr = this.keys;
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
                            if (predicate.invoke(Integer.valueOf(iArr[i7]), Float.valueOf(fArr[i7])).booleanValue()) {
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsValue(float r20) {
        /*
            r19 = this;
            r0 = r19
            float[] r9 = r0.values
            long[] r8 = r0.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            r18 = 0
            if (r7 < 0) goto L56
            r6 = r18
        Lf:
            r1 = r8[r6]
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
            if (r0 == 0) goto L51
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r10 = 8 - r0
            r5 = r18
        L35:
            if (r5 >= r10) goto L4f
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r1
            r3 = 128(0x80, double:6.3E-322)
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 >= 0) goto L4b
            int r0 = r6 << 3
            int r0 = r0 + r5
            r0 = r9[r0]
            int r0 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r0 != 0) goto L4b
            r0 = 1
            return r0
        L4b:
            long r1 = r1 >> r11
            int r5 = r5 + 1
            goto L35
        L4f:
            if (r10 != r11) goto L56
        L51:
            if (r6 == r7) goto L56
            int r6 = r6 + 1
            goto Lf
        L56:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntFloatMap.containsValue(float):boolean");
    }

    public int hashCode() {
        int[] iArr = this.keys;
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
                        if ((-1) - (((-1) - 255) | ((-1) - j2)) < 128) {
                            int i6 = (i3 << 3) + i5;
                            int i7 = iArr[i6];
                            iHashCode += Float.hashCode(fArr[i6]) ^ Integer.hashCode(i7);
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
        int i4 = (i3 + 127) - (127 | i3);
        int i5 = this._capacity;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i8 = i6 >> 3;
            int i9 = ((-1) - (((-1) - i6) | ((-1) - 7))) << 3;
            long j2 = ((-1) - (((-1) - (jArr[i8 + 1] << (64 - i9))) | ((-1) - ((-i9) >> 63)))) | (jArr[i8] >>> i9);
            long j3 = (((long) i4) * ScatterMapKt.BitmaskLsb) ^ j2;
            long j4 = j3 - ScatterMapKt.BitmaskLsb;
            long j5 = ~j3;
            for (long j6 = ((j5 + j4) - (j5 | j4)) & (-9187201950435737472L); j6 != 0; j6 &= j6 - 1) {
                int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(j6) >> 3) + i6;
                int i10 = (iNumberOfTrailingZeros + i5) - (iNumberOfTrailingZeros | i5);
                if (this.keys[i10] == i2) {
                    return i10;
                }
            }
            long j7 = (-1) - (((-1) - j2) | ((-1) - ((~j2) << 6)));
            if ((j7 - 9187201950435737472L) - (j7 | (-9187201950435737472L)) != 0) {
                return -1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3 A[PHI: r4
  0x00b3: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0053, B:21:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r25, java.lang.CharSequence r26, java.lang.CharSequence r27, int r28, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Float, ? extends java.lang.CharSequence> r29) {
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
            float[] r8 = r2.values
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
        L5f:
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
            r16 = r9[r0]
            r0 = r8[r0]
            r15 = r28
            if (r4 != r15) goto L8b
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
            java.lang.Integer r15 = java.lang.Integer.valueOf(r16)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r12.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
        La7:
            r0 = 8
            long r2 = r2 >> r0
            int r14 = r14 + 1
            r0 = r24
            goto L5f
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6 A[PHI: r4
  0x00b6: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x005b, B:21:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r24, java.lang.CharSequence r25, java.lang.CharSequence r26, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Float, ? extends java.lang.CharSequence> r27) {
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
            int[] r9 = r2.keys
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
            r15 = r9[r0]
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
            r17 = r10
            r18 = r22
            r17.append(r18)
        L97:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae A[PHI: r4
  0x00ae: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0053, B:21:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r24, java.lang.CharSequence r25, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Float, ? extends java.lang.CharSequence> r26) {
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
            r18 = r22
            r17.append(r18)
        L8f:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntFloatMap.joinToString(java.lang.CharSequence, java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4 A[PHI: r4
  0x00a4: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0046, B:21:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(java.lang.CharSequence r26, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Float, ? extends java.lang.CharSequence> r27) {
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
            int[] r9 = r2.keys
            float[] r8 = r2.values
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
            long r0 = r0 & r2
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r0 + r16
            long r0 = r0 | r16
            long r14 = r14 - r0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto La4
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L52:
            if (r1 >= r14) goto La2
            r22 = 255(0xff, double:1.26E-321)
            r20 = -1
            long r18 = r20 - r2
            long r16 = r20 - r22
            long r18 = r18 | r16
            long r20 = r20 - r18
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 >= 0) goto L7d
            int r0 = r5 << 3
            int r0 = r0 + r1
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L7e
            r10.append(r11)
        L73:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L7d:
            goto L9c
        L7e:
            if (r4 == 0) goto L87
            r17 = r10
            r18 = r24
            r17.append(r18)
        L87:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r13.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L9c:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r25
            goto L52
        La2:
            if (r14 != r15) goto Lab
        La4:
            if (r5 == r6) goto Lab
            int r5 = r5 + 1
            r0 = r25
            goto L34
        Lab:
            r10.append(r12)
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntFloatMap.joinToString(java.lang.CharSequence, kotlin.jvm.functions.Function2):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[PHI: r4
  0x009e: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:6:0x0042, B:21:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String joinToString(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Float, ? extends java.lang.CharSequence> r24) {
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
            float[] r8 = r2.values
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
            long r0 = r0 & r2
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r0 + r16
            long r0 = r0 | r16
            long r14 = r14 - r0
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 == 0) goto L9e
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r15 = 8
            int r14 = 8 - r0
            r1 = 0
        L4e:
            if (r1 >= r14) goto L9c
            r20 = 255(0xff, double:1.26E-321)
            long r18 = r2 + r20
            long r16 = r2 | r20
            long r18 = r18 - r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L75
            int r0 = r5 << 3
            int r0 = r0 + r1
            r15 = r9[r0]
            r16 = r8[r0]
            r0 = -1
            if (r4 != r0) goto L76
            r10.append(r11)
        L6b:
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
        L75:
            goto L96
        L76:
            if (r4 == 0) goto L7b
            r10.append(r13)
        L7b:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            r16 = r22
            r17 = r15
            r18 = r0
            java.lang.Object r0 = r16.invoke(r17, r18)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.append(r0)
            int r4 = r4 + 1
            r15 = 8
        L96:
            long r2 = r2 >> r15
            int r1 = r1 + 1
            r0 = r23
            goto L4e
        L9c:
            if (r14 != r15) goto La5
        L9e:
            if (r5 == r6) goto La5
            int r5 = r5 + 1
            r0 = r23
            goto L30
        La5:
            r10.append(r12)
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.IntFloatMap.joinToString(kotlin.jvm.functions.Function2):java.lang.String");
    }
}
