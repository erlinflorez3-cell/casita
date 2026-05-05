package androidx.compose.foundation.gestures;

import androidx.collection.ObjectFloatMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0005\"4\u0012\u0006\rnj?2LeV3ZS0\u000fs{B-c$wDCU(Ԃ*ޛWNugvϺb\u000bY\u000f\u000e\u0016\u000fj4I[\u0002e\u0012\u001d>JģE3cڎe;fҚD\u0004P82:\n\u0005G\u0019XHP\b\u000bMY\r*6PrJRC˟3\u001cŪ\n>.\u0004fquVNJ\u0003\\pǂS\u0007wKf'\u000e:CaϘJT5\u0018?~,3X9K\u0014[م3\u000b`dW\u0003m{m\tv3?+w\u0001\u001eJݼ\u0004\u0014#9\u0018\u001ek\u0002>\\3^\u0011\u00125;geaO<9>ߕ{Uz\u0012 \u001e'vA]Nt\u001c&c\u0005\u0004cO\u0007\u061cެF\n\u0001wF\u001d+\u0017C-?!\riqL)]e\u0006˿\u0011()\u0017~'ak\u001eb\u001b!z\u0001a3a@k[|\u001f Q6\u0017~{\u001a*2=w\u0004=\u0016).M¦}oޠ'!y\u001d\u0011Ju\u0013\u001d`\u0017X0f\u0011F0\f.7X\u0013Rn\rj\u0013\nhT\u00076Wadg\u0015\u001d \u0013Nf(@/?(N\u0006Ŗ0~ܷa\n3O/=g\u0010\u0004\u000e\u0006[%G\u0006cq\u0011yX\u0007\u0016O<\u0019ڳ\u0007h\u0019Ͱ\u000eȺ`(*õ\u0019|\u001e{\u0014D|\u0011I\u0007\u0016ڻ\u001eٜ051^\u001bN\u0011%ռE "}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w5?FJA\u001a\u0017j]6\u000ec\bWt*QY\\\u0002", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\u0015\u0010a/X\u00045\u001d", "/mR5b9L", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nj\u0014\u001cGm\u001d\u001d}/1he\u001cBC", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ\u0001\u0014Lo\fKW,?U\r\b3xkq>", "Ahi2", "", "5dc \\A>", "u(8", "1k^@X:M/\"|}h9", ">nb6g0H\\", "", "uE\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "AdP?V/.^+z\b]:", "", "uEIu?1:d\u0015H\u0002Z5~R\u0019b\u0005(yOV", "3pd._:", "=sW2e", "", "4na\u0012T*A", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "/mR5b9", "6`b\u000ea*A]&_\u0005k", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "6`b566=S", ";`g\u000ea*A]&", ";h]\u000ea*A]&", ">nb6g0H\\\u0003\u007f", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?!", "BnBAe0GU", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class MapDraggableAnchors<T> implements DraggableAnchors<T> {
    private final ObjectFloatMap<T> anchors;

    public MapDraggableAnchors(ObjectFloatMap<T> objectFloatMap) {
        this.anchors = objectFloatMap;
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float positionOf(T t2) {
        return this.anchors.getOrDefault(t2, Float.NaN);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public boolean hasAnchorFor(T t2) {
        return this.anchors.containsKey(t2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b A[PHI: r18 r19
  0x005b: PHI (r18v2 float) = (r18v1 float), (r18v3 float) binds: [B:6:0x0025, B:15:0x0059] A[DONT_GENERATE, DONT_INLINE]
  0x005b: PHI (r19v3 T) = (r19v2 T), (r19v4 T) binds: [B:6:0x0025, B:15:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T closestAnchor(float r21) {
        /*
            r20 = this;
            r0 = r20
            androidx.collection.ObjectFloatMap<T> r0 = r0.anchors
            java.lang.Object[] r10 = r0.keys
            float[] r9 = r0.values
            long[] r8 = r0.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            r19 = 0
            if (r7 < 0) goto L60
            r18 = 2139095040(0x7f800000, float:Infinity)
            r17 = 0
            r6 = r17
        L17:
            r2 = r8[r6]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r11
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 == 0) goto L5b
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r5 = r17
        L32:
            if (r5 >= r11) goto L59
            r0 = 255(0xff, double:1.26E-321)
            long r15 = r0 + r2
            long r0 = r0 | r2
            long r15 = r15 - r0
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L55
            int r0 = r6 << 3
            int r0 = r0 + r5
            r4 = r10[r0]
            r0 = r9[r0]
            float r0 = r21 - r0
            float r1 = java.lang.Math.abs(r0)
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r0 > 0) goto L55
            r18 = r1
            r19 = r4
        L55:
            long r2 = r2 >> r12
            int r5 = r5 + 1
            goto L32
        L59:
            if (r11 != r12) goto L60
        L5b:
            if (r6 == r7) goto L60
            int r6 = r6 + 1
            goto L17
        L60:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MapDraggableAnchors.closestAnchor(float):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c A[PHI: r16 r19
  0x006c: PHI (r16v2 float) = (r16v1 float), (r16v3 float) binds: [B:6:0x002e, B:22:0x006a] A[DONT_GENERATE, DONT_INLINE]
  0x006c: PHI (r19v3 T) = (r19v2 T), (r19v4 T) binds: [B:6:0x002e, B:22:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T closestAnchor(float r21, boolean r22) {
        /*
            r20 = this;
            r0 = r20
            androidx.collection.ObjectFloatMap<T> r0 = r0.anchors
            java.lang.Object[] r9 = r0.keys
            float[] r8 = r0.values
            long[] r7 = r0.metadata
            int r0 = r7.length
            int r6 = r0 + (-2)
            r19 = 0
            if (r6 < 0) goto L71
            r18 = 2139095040(0x7f800000, float:Infinity)
            r17 = 0
            r16 = r18
            r5 = r17
        L19:
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
            if (r0 == 0) goto L6c
            int r0 = r5 - r6
            int r0 = ~r0
            int r0 = r0 >>> 31
            r11 = 8
            int r10 = 8 - r0
            r4 = r17
        L3b:
            if (r4 >= r10) goto L6a
            r12 = 255(0xff, double:1.26E-321)
            long r14 = r12 + r1
            long r12 = r12 | r1
            long r14 = r14 - r12
            r12 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L63
            int r0 = r5 << 3
            int r0 = r0 + r4
            r12 = r9[r0]
            r3 = r8[r0]
            if (r22 == 0) goto L67
            float r3 = r3 - r21
        L54:
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L5b
            r3 = r18
        L5b:
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 > 0) goto L63
            r16 = r3
            r19 = r12
        L63:
            long r1 = r1 >> r11
            int r4 = r4 + 1
            goto L3b
        L67:
            float r3 = r21 - r3
            goto L54
        L6a:
            if (r10 != r11) goto L71
        L6c:
            if (r5 == r6) goto L71
            int r5 = r5 + 1
            goto L19
        L71:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MapDraggableAnchors.closestAnchor(float, boolean):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float minAnchor() {
        return AnchoredDraggableKt.minValueOrNaN(this.anchors);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public float maxAnchor() {
        return AnchoredDraggableKt.maxValueOrNaN(this.anchors);
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public int getSize() {
        return this.anchors.getSize();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MapDraggableAnchors) {
            return Intrinsics.areEqual(this.anchors, ((MapDraggableAnchors) obj).anchors);
        }
        return false;
    }

    public int hashCode() {
        return this.anchors.hashCode() * 31;
    }

    public String toString() {
        return "MapDraggableAnchors(" + this.anchors + ')';
    }

    @Override // androidx.compose.foundation.gestures.DraggableAnchors
    public void forEach(Function2<? super T, ? super Float, Unit> function2) {
        ObjectFloatMap<T> objectFloatMap = this.anchors;
        Object[] objArr = objectFloatMap.keys;
        float[] fArr = objectFloatMap.values;
        long[] jArr = objectFloatMap.metadata;
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
                        function2.invoke(objArr[i5], Float.valueOf(fArr[i5]));
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
}
