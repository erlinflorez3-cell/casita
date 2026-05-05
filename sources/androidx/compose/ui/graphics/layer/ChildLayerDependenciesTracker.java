package androidx.compose.ui.graphics.layer;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.graphics.InlineClassHelperKt;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: ChildLayerDependenciesTracker.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\tnjG9LeN/ZS8\u000fsڔ<$q$yCAU\"}8\tWȞm˧\u0005Ϻ\u000b\u000bq\u000eF\u0019ѱn,WUAi \u0018JB\u001eGcQ}GQ`#9M;@-Py3\rJ:V\u001d\u000f\u0007SM\u001c\u0012^C\u0001<b\r{\u0011H L̋&IGjvf6vx\u000eJ=3\u001buRP7_^\u007f]\u000fVTU\u0019%oN5NDM\u001b5U\u0013\u0007\u0001gm\u0014\u0006уCU|5(CQ\u0004YFX.\u0017+*}\u000f4ù2ػ\tQhϯw9]gcR$'&}RȡHǬ\u0012\u0006/Ξ~A(k \u0016Cv\u0003SnS\u0018]p\u0002QʫBа)\u007f;ٿ\n)tWy=/Me~[ٿ*ţ\u0005n)ż%\u001an\u001c3T&Y\b҈LףLN\u0012ԯǆq\u0016"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7s1QJ:R02\u0015u@9\u0012c5Mv0EPN:K_n;\u001a\u0012gc", "", "u(E", "2d_2a+>\\\u0017\u0003zl\u001a|\u0018", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r D[\u0016=#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", "2d_2a+>\\\u0017\u0013", "=kS\u0011X7>\\\u0018~\u0004\\0|\u0017\u001de\u000f", "=kS\u0011X7>\\\u0018~\u0004\\@", "BqP0^0GU|\bek6~\u0016/s\u000e", "", "=m32c,GR\u0019\bxr\b{\b/d", "5qP=[0<a\u007fz\u000f^9", "@d\\<i,\u001dS$~\u0004],\u0006\u00073e\u000e", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "Ehc5G9:Q\u001f\u0003\u0004`", "=m32c,GR\u0019\bxr\u0019|\u00119v\u007f'", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ChildLayerDependenciesTracker {
    private MutableScatterSet<GraphicsLayer> dependenciesSet;
    private GraphicsLayer dependency;
    private MutableScatterSet<GraphicsLayer> oldDependenciesSet;
    private GraphicsLayer oldDependency;
    private boolean trackingInProgress;

    /* JADX WARN: Removed duplicated region for block: B:69:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void withTracking(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.layer.GraphicsLayer, kotlin.Unit> r18, kotlin.jvm.functions.Function0<kotlin.Unit> r19) {
        /*
            r17 = this;
            r3 = r17
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = access$getDependency$p(r17)
            access$setOldDependency$p(r3, r0)
            androidx.collection.MutableScatterSet r2 = access$getDependenciesSet$p(r17)
            if (r2 == 0) goto L2b
            boolean r0 = r2.isNotEmpty()
            if (r0 == 0) goto L2b
            androidx.collection.MutableScatterSet r1 = access$getOldDependenciesSet$p(r17)
            if (r1 != 0) goto L22
            androidx.collection.MutableScatterSet r1 = androidx.collection.ScatterSetKt.mutableScatterSetOf()
            access$setOldDependenciesSet$p(r3, r1)
        L22:
            r0 = r2
            androidx.collection.ScatterSet r0 = (androidx.collection.ScatterSet) r0
            r1.addAll(r0)
            r2.clear()
        L2b:
            r0 = 1
            access$setTrackingInProgress$p(r3, r0)
            r19.invoke()
            r10 = 0
            access$setTrackingInProgress$p(r3, r10)
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = access$getOldDependency$p(r17)
            r11 = r18
            if (r0 == 0) goto L41
            r11.invoke(r0)
        L41:
            androidx.collection.MutableScatterSet r16 = access$getOldDependenciesSet$p(r17)
            if (r16 == 0) goto La0
            boolean r0 = r16.isNotEmpty()
            if (r0 == 0) goto La0
            r0 = r16
            androidx.collection.ScatterSet r0 = (androidx.collection.ScatterSet) r0
            java.lang.Object[] r9 = r0.elements
            long[] r8 = r0.metadata
            int r0 = r8.length
            int r7 = r0 + (-2)
            if (r7 < 0) goto L9d
            r6 = r10
        L5b:
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
            if (r0 == 0) goto L98
            int r0 = r6 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r3 = r10
        L7f:
            if (r3 >= r12) goto L96
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r4
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L92
            int r0 = r6 << 3
            int r0 = r0 + r3
            r0 = r9[r0]
            r11.invoke(r0)
        L92:
            long r4 = r4 >> r13
            int r3 = r3 + 1
            goto L7f
        L96:
            if (r12 != r13) goto L9d
        L98:
            if (r6 == r7) goto L9d
            int r6 = r6 + 1
            goto L5b
        L9d:
            r16.clear()
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.withTracking(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):void");
    }

    public final boolean onDependencyAdded(GraphicsLayer graphicsLayer) {
        if (!this.trackingInProgress) {
            InlineClassHelperKt.throwIllegalArgumentException("Only add dependencies during a tracking");
        }
        MutableScatterSet<GraphicsLayer> mutableScatterSet = this.dependenciesSet;
        if (mutableScatterSet != null) {
            Intrinsics.checkNotNull(mutableScatterSet);
            mutableScatterSet.add(graphicsLayer);
        } else if (this.dependency != null) {
            MutableScatterSet<GraphicsLayer> mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            GraphicsLayer graphicsLayer2 = this.dependency;
            Intrinsics.checkNotNull(graphicsLayer2);
            mutableScatterSetMutableScatterSetOf.add(graphicsLayer2);
            mutableScatterSetMutableScatterSetOf.add(graphicsLayer);
            this.dependenciesSet = mutableScatterSetMutableScatterSetOf;
            this.dependency = null;
        } else {
            this.dependency = graphicsLayer;
        }
        MutableScatterSet<GraphicsLayer> mutableScatterSet2 = this.oldDependenciesSet;
        if (mutableScatterSet2 != null) {
            Intrinsics.checkNotNull(mutableScatterSet2);
            return !mutableScatterSet2.remove(graphicsLayer);
        }
        if (this.oldDependency != graphicsLayer) {
            return true;
        }
        this.oldDependency = null;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void removeDependencies(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.layer.GraphicsLayer, kotlin.Unit> r21) {
        /*
            r20 = this;
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = access$getDependency$p(r20)
            r11 = r21
            if (r0 == 0) goto L77
            r11.invoke(r0)
            r1 = 0
            r0 = r20
            access$setDependency$p(r0, r1)
        L11:
            androidx.collection.MutableScatterSet r19 = access$getDependenciesSet$p(r20)
            if (r19 == 0) goto L7d
            r0 = r19
            androidx.collection.ScatterSet r0 = (androidx.collection.ScatterSet) r0
            java.lang.Object[] r10 = r0.elements
            long[] r9 = r0.metadata
            int r0 = r9.length
            int r8 = r0 + (-2)
            if (r8 < 0) goto L7a
            r18 = 0
            r7 = r18
        L28:
            r4 = r9[r7]
            long r0 = ~r4
            r2 = 7
            long r0 = r0 << r2
            r16 = -1
            long r2 = r16 - r0
            long r0 = r16 - r4
            long r2 = r2 | r0
            long r16 = r16 - r2
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = -1
            long r2 = r12 - r16
            long r0 = r12 - r14
            long r2 = r2 | r0
            long r12 = r12 - r2
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L72
            int r0 = r7 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r6 = 8 - r0
            r3 = r18
        L52:
            if (r3 >= r6) goto L70
            r0 = 255(0xff, double:1.26E-321)
            r15 = -1
            long r13 = r15 - r0
            long r0 = r15 - r4
            long r13 = r13 | r0
            long r15 = r15 - r13
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6c
            int r0 = r7 << 3
            int r0 = r0 + r3
            r0 = r10[r0]
            r11.invoke(r0)
        L6c:
            long r4 = r4 >> r12
            int r3 = r3 + 1
            goto L52
        L70:
            if (r6 != r12) goto L7a
        L72:
            if (r7 == r8) goto L7a
            int r7 = r7 + 1
            goto L28
        L77:
            r0 = r20
            goto L11
        L7a:
            r19.clear()
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.removeDependencies(kotlin.jvm.functions.Function1):void");
    }
}
