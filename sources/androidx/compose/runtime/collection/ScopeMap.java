package androidx.compose.runtime.collection;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: ScopeMap.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&˛\bDRш|\u0004G\u00078\u000bDB\u0007\"2\u0013\u007f\u0007tpA0JfP.`S2\u000fq}<$i-yّCU0}*\teNogtKb\u000bQ1\u000e\u0016\u0007\u000b4I[\u0006c܈%˰juE\u074c[ne9\u000ft^\u000b&109\"\u0005/\u001aZH>v;Fƚ\u0010\u0012>B9S`\u0018e\u0005H\u001e6B.\u000e6\\\u001eޮfLzkR/Y\u0002ݦFN5nx4[\u001d^TU\u001e'e,8X7kՖUr\u0011\u0019jvO\u0014O\u0001s\u0004ص+11]\u0004]<m\u0010\u0016\u001b1u\u001bmt6\\3b\u000f\u001fmˊUӍOP\u001c>@\u0011\n$T\u0016\u001e\b7HdƦ*n\u0018\u0014Cv\u0003SvO0wp\u0018CeD1=\u007fa7\u0002/tly;G_g\u007f\u0013)6#7͙gƃT\u05f8d\u0015)q@\t?oX=vZ:]Kz\u001cp\u0019̣Z#>Y\u0018J\f\">&[6٦=-'\u007f\u0012NJ|\u0007\u0007fnywbJP\"\u001d\"e=Oȸ`ֈh\u0005yo\u001dq:1e\u001c\u0003\u0018.\f!-twrƙU\u0014\\]\u0001i!Lύ\u000e%=\b\u007fj|\u000e&Wgjc9_q(a\tu݀C<p(!\u0013Pw$Z\u000b4RSNl\u001e\u001d\u0014_^\u001d#Aupʬ867-l\u001bN\u0018.DG\u0003/mjj ~\u0003DR\u00160ˌzQ\u001a^\u0003\to\u0016\u0005y0\u000bm:-wٛe\u001d4|:hj{ɠ\u000b~\u0002\u000f\u0018\u0003ZJdx&we{N\u0016*;a/k\u0013=\u0003Ȟ6\b5զdtkV[\u0018w\n\u000b\u0001';\u00176\u001eLϡt0xlPXb!Țz\u0007"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u001cKMFk\u001c\u001a >", "\u0019dh", "", "!b^=X", "u(E", ";`_", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r DU\u00129#", "5dc\u001aT7", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`~W~\n9}%#Wy/Fm#\u0016IN\u0011", "Ahi2", "", "5dc \\A>", "u(8", "/cS", "", "9dh", "Ab^=X", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq>", "/mh V6IS\u0003\u007f", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u0002\u0012k", "/r<.c", "", "", "1kT.e", "1n]AT0Ga", "3kT:X5M", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "4na\u0012T*AA\u0017\t\u0006^\u0016}", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u0002\u0012g", "@d\\<i,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kqB", "@d\\<i,,Q#\nz", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "@d\\<i,,Q#\nzB-", ">qT1\\*:b\u0019", "Adc", "D`[BX", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ScopeMap<Key, Scope> {
    public static final int $stable = 8;
    private final MutableScatterMap<Object, Object> map = ScatterMapKt.mutableScatterMapOf();

    public final MutableScatterMap<Object, Object> getMap() {
        return this.map;
    }

    public final int getSize() {
        return this.map.getSize();
    }

    public final void add(Key key, Scope scope) {
        MutableScatterMap<Object, Object> mutableScatterMap = this.map;
        int iFindInsertIndex = mutableScatterMap.findInsertIndex(key);
        boolean z2 = iFindInsertIndex < 0;
        Object obj = z2 ? null : mutableScatterMap.values[iFindInsertIndex];
        if (obj != null) {
            if (obj instanceof MutableScatterSet) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                ((MutableScatterSet) obj).add(scope);
            } else if (obj != scope) {
                MutableScatterSet mutableScatterSet = new MutableScatterSet(0, 1, null);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
                mutableScatterSet.add(obj);
                mutableScatterSet.add(scope);
                scope = (Scope) mutableScatterSet;
            }
            scope = (Scope) obj;
        }
        if (z2) {
            int i2 = ~iFindInsertIndex;
            mutableScatterMap.keys[i2] = key;
            mutableScatterMap.values[i2] = scope;
            return;
        }
        mutableScatterMap.values[iFindInsertIndex] = scope;
    }

    public final void set(Key key, Scope scope) {
        this.map.set(key, scope);
    }

    public final boolean contains(Key key) {
        return this.map.containsKey(key);
    }

    public final void forEachScopeOf(Key key, Function1<? super Scope, Unit> function1) {
        Object obj = getMap().get(key);
        if (obj == null) {
            return;
        }
        if (obj instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
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
                            function1.invoke(objArr[(i2 << 3) + i4]);
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
        } else {
            function1.invoke(obj);
        }
    }

    public final void clear() {
        this.map.clear();
    }

    public final boolean remove(Key key, Scope scope) {
        Object obj = this.map.get(key);
        if (obj == null) {
            return false;
        }
        if (obj instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
            boolean zRemove = mutableScatterSet.remove(scope);
            if (zRemove && mutableScatterSet.isEmpty()) {
                this.map.remove(key);
            }
            return zRemove;
        }
        if (!Intrinsics.areEqual(obj, scope)) {
            return false;
        }
        this.map.remove(key);
        return true;
    }

    public final void removeScopeIf(Function1<? super Scope, Boolean> function1) {
        boolean zBooleanValue;
        MutableScatterMap<Object, Object> map = getMap();
        long[] jArr = map.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            char c2 = 7;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((-1) - (((-1) - j2) | ((-1) - 255)) < 128) {
                        int i6 = (i2 << 3) + i5;
                        Object obj = map.keys[i6];
                        Object obj2 = map.values[i6];
                        if (obj2 instanceof MutableScatterSet) {
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                            Object[] objArr = mutableScatterSet.elements;
                            long[] jArr2 = mutableScatterSet.metadata;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i7 = 0;
                                while (true) {
                                    long j3 = jArr2[i7];
                                    long j4 = (~j3) << c2;
                                    if ((((j4 + j3) - (j4 | j3)) & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i8 = 8 - ((~(i7 - length2)) >>> 31);
                                        for (int i9 = 0; i9 < i8; i9++) {
                                            if ((j3 + 255) - (j3 | 255) < 128) {
                                                int i10 = (i7 << 3) + i9;
                                                if (function1.invoke(objArr[i10]).booleanValue()) {
                                                    mutableScatterSet.removeElementAt(i10);
                                                }
                                            }
                                            j3 >>= 8;
                                        }
                                        if (i8 != 8) {
                                            break;
                                        }
                                    }
                                    if (i7 == length2) {
                                        break;
                                    }
                                    i7++;
                                    c2 = 7;
                                }
                            }
                            zBooleanValue = mutableScatterSet.isEmpty();
                        } else {
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                            zBooleanValue = function1.invoke(obj2).booleanValue();
                        }
                        if (zBooleanValue) {
                            map.removeValueAt(i6);
                        }
                        i3 = 8;
                    }
                    j2 >>= i3;
                    i5++;
                    c2 = 7;
                }
                if (i4 != i3) {
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

    public final void removeScope(Scope scope) {
        boolean zIsEmpty;
        MutableScatterMap<Object, Object> mutableScatterMap = this.map;
        long[] jArr = mutableScatterMap.metadata;
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
                        int i5 = (i2 << 3) + i4;
                        Object obj = mutableScatterMap.keys[i5];
                        Object obj2 = mutableScatterMap.values[i5];
                        if (obj2 instanceof MutableScatterSet) {
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                            mutableScatterSet.remove(scope);
                            zIsEmpty = mutableScatterSet.isEmpty();
                        } else {
                            zIsEmpty = obj2 == scope;
                        }
                        if (zIsEmpty) {
                            mutableScatterMap.removeValueAt(i5);
                        }
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<Key, java.util.Set<Scope>> asMap() {
        /*
            r16 = this;
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r0 = r16
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r0 = r0.map
            androidx.collection.ScatterMap r0 = (androidx.collection.ScatterMap) r0
            java.lang.Object[] r10 = r0.keys
            java.lang.Object[] r9 = r0.values
            long[] r8 = r0.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L7c
            r6 = 0
        L17:
            r3 = r8[r6]
            long r0 = ~r3
            r2 = 7
            long r0 = r0 << r2
            long r12 = r0 + r3
            long r0 = r0 | r3
            long r12 = r12 - r0
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r1
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto L77
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r5 = 0
        L34:
            if (r5 >= r12) goto L75
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r3
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L62
            int r0 = r6 << 3
            int r0 = r0 + r5
            r2 = r10[r0]
            r14 = r9[r0]
            r1 = r11
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r0 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap.asMap$lambda$4"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r0)
            boolean r0 = r14 instanceof androidx.collection.MutableScatterSet
            if (r0 == 0) goto L66
            java.lang.String r0 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.asMap$lambda$4>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14, r0)
            androidx.collection.MutableScatterSet r14 = (androidx.collection.MutableScatterSet) r14
            java.util.Set r0 = r14.asSet()
        L5f:
            r1.put(r2, r0)
        L62:
            long r3 = r3 >> r13
            int r5 = r5 + 1
            goto L34
        L66:
            java.lang.String r0 = "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.asMap$lambda$4"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r14}
            java.util.Set r0 = kotlin.collections.SetsKt.mutableSetOf(r0)
            goto L5f
        L75:
            if (r12 != r13) goto L7c
        L77:
            if (r6 == r7) goto L7c
            int r6 = r6 + 1
            goto L17
        L7c:
            java.util.Map r11 = (java.util.Map) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScopeMap.asMap():java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean anyScopeOf(Key r19, kotlin.jvm.functions.Function1<? super Scope, java.lang.Boolean> r20) {
        /*
            r18 = this;
            androidx.collection.MutableScatterMap r0 = r18.getMap()
            r1 = r19
            java.lang.Object r1 = r0.get(r1)
            r17 = 0
            if (r1 == 0) goto L7c
            boolean r0 = r1 instanceof androidx.collection.MutableScatterSet
            r16 = 1
            r9 = r20
            if (r0 == 0) goto L6f
            androidx.collection.MutableScatterSet r1 = (androidx.collection.MutableScatterSet) r1
            androidx.collection.ScatterSet r1 = (androidx.collection.ScatterSet) r1
            java.lang.Object[] r8 = r1.elements
            long[] r7 = r1.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L7c
            r5 = r17
        L25:
            r1 = r7[r5]
            long r3 = ~r1
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r1
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = -1
            long r10 = r12 - r3
            long r3 = r12 - r14
            long r10 = r10 | r3
            long r12 = r12 - r10
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L6a
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r10 = 8
            int r4 = 8 - r0
            r3 = r17
        L47:
            if (r3 >= r4) goto L68
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r1
            r11 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L64
            int r0 = r5 << 3
            int r0 = r0 + r3
            r0 = r8[r0]
            java.lang.Object r0 = r9.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L64
            return r16
        L64:
            long r1 = r1 >> r10
            int r3 = r3 + 1
            goto L47
        L68:
            if (r4 != r10) goto L7c
        L6a:
            if (r5 == r6) goto L7c
            int r5 = r5 + 1
            goto L25
        L6f:
            java.lang.Object r0 = r9.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7c
            return r16
        L7c:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScopeMap.anyScopeOf(java.lang.Object, kotlin.jvm.functions.Function1):boolean");
    }
}
