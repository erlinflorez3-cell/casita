package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я#\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\u000e6B\u0015\"4ߚ\u007f\u0007|jA0Jip-ɟY2%ӆ,4RZl\u0013Q;m\u001a,#9S\\i\u007fnx[;G\u001d\t.x\u0019-\u0010ǘ7ګ\u0011Ɓ̓FqE7[t\u0006anzN\u0005N9R<\b\u0007\u0019\u001aXO@z\tFc\f@7ptHZ%M3#X\u001aͽ\u001fҵɉ`iT@Vw&Z=/\u001bipUWc>\u007fe\rt[W\u0011\u0005i6+n@{)ɥRΈ\u07baV]E\u0010M\u007fܸ\u0005m/*1ʀ\u0010\u00065ނ\u0004#"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\b$\u000b@\u000e\u001b\u0013N=W\u001c\u007f45fY'Ii*<;AHu;%qhd5\u0018g6[50GZ],[@pJ\u001e\u0019akX4\u0016\u0005WP(xMuj", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3UT1PUN*kV|Fi", "=m?<f;\u001fZ\u001d\b|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "1n]@h4>R", "/uP6_(;Z\u0019", "=m?<f;\u001fZ\u001d\b|&\u0019qU3Ap\u001c", "uI9\u0019^6MZ\u001d\bD\\6\n\u0013?t\u00041{NJt!P~\u0012E\u0007!D]\b)\r1|3IT75;\u001a\u001ej+#\u0004h,L\u0006|", "=m?<f;,Q&\t\u0002e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "And?V,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3Ud1WYL,2", "=m?<f;,Q&\t\u0002es[\u001e\u0019Qsrc", "uI9\u0016\u001c\u0011", "=m??X\u001a<`#\u0006\u0002", "=m??X\u001a<`#\u0006\u0002&\u0016\u0012gza].", "uI8u=", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class EnterAlwaysScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ EnterAlwaysScrollBehavior this$0;

    EnterAlwaysScrollBehavior$nestedScrollConnection$1(EnterAlwaysScrollBehavior enterAlwaysScrollBehavior) {
        this.this$0 = enterAlwaysScrollBehavior;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public long mo1094onPreScrollOzD1aCk(long j2, int i2) {
        if (!this.this$0.getCanScroll().invoke().booleanValue()) {
            return Offset.Companion.m3953getZeroF1C5BW0();
        }
        float heightOffset = this.this$0.getState().getHeightOffset();
        this.this$0.getState().setHeightOffset(this.this$0.getState().getHeightOffset() + Offset.m3938getYimpl(j2));
        if (heightOffset != this.this$0.getState().getHeightOffset()) {
            return Offset.m3931copydBAh8RU$default(j2, 0.0f, 0.0f, 2, null);
        }
        return Offset.Companion.m3953getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public long mo820onPostScrollDzOQY0M(long j2, long j3, int i2) {
        if (!this.this$0.getCanScroll().invoke().booleanValue()) {
            return Offset.Companion.m3953getZeroF1C5BW0();
        }
        TopAppBarState state = this.this$0.getState();
        state.setContentOffset(state.getContentOffset() + Offset.m3938getYimpl(j2));
        if ((this.this$0.getState().getHeightOffset() == 0.0f || this.this$0.getState().getHeightOffset() == this.this$0.getState().getHeightOffsetLimit()) && Offset.m3938getYimpl(j2) == 0.0f && Offset.m3938getYimpl(j3) > 0.0f) {
            this.this$0.getState().setContentOffset(0.0f);
        }
        this.this$0.getState().setHeightOffset(this.this$0.getState().getHeightOffset() + Offset.m3938getYimpl(j2));
        return Offset.Companion.m3953getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo819onPostFlingRZ2iAVY(long r16, long r18, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r20) {
        /*
            r15 = this;
            r2 = r20
            r12 = r18
            boolean r0 = r2 instanceof androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1
            if (r0 == 0) goto L84
            r14 = r2
            androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 r14 = (androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) r14
            int r0 = r14.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L84
            int r0 = r14.label
            int r0 = r0 - r1
            r14.label = r0
        L17:
            java.lang.Object r4 = r14.result
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.label
            r7 = 2
            r0 = 1
            if (r1 == 0) goto L3b
            if (r1 == r0) goto L50
            if (r1 != r7) goto L8a
            long r2 = r14.J$0
            kotlin.ResultKt.throwOnFailure(r4)
        L2c:
            androidx.compose.ui.unit.Velocity r4 = (androidx.compose.ui.unit.Velocity) r4
            long r0 = r4.m6884unboximpl()
            long r0 = androidx.compose.ui.unit.Velocity.m6879plusAH228Gc(r2, r0)
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m6866boximpl(r0)
            return r0
        L3b:
            kotlin.ResultKt.throwOnFailure(r4)
            r14.L$0 = r15
            r14.J$0 = r12
            r14.label = r0
            r9 = r15
            r10 = r16
            java.lang.Object r4 = super.mo819onPostFlingRZ2iAVY(r10, r12, r14)
            if (r4 != r8) goto L4e
            return r8
        L4e:
            r1 = r15
            goto L59
        L50:
            long r12 = r14.J$0
            java.lang.Object r1 = r14.L$0
            androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1 r1 = (androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1) r1
            kotlin.ResultKt.throwOnFailure(r4)
        L59:
            androidx.compose.ui.unit.Velocity r4 = (androidx.compose.ui.unit.Velocity) r4
            long r2 = r4.m6884unboximpl()
            androidx.compose.material3.EnterAlwaysScrollBehavior r0 = r1.this$0
            androidx.compose.material3.TopAppBarState r6 = r0.getState()
            float r5 = androidx.compose.ui.unit.Velocity.m6876getYimpl(r12)
            androidx.compose.material3.EnterAlwaysScrollBehavior r0 = r1.this$0
            androidx.compose.animation.core.DecayAnimationSpec r4 = r0.getFlingAnimationSpec()
            androidx.compose.material3.EnterAlwaysScrollBehavior r0 = r1.this$0
            androidx.compose.animation.core.AnimationSpec r1 = r0.getSnapAnimationSpec()
            r0 = 0
            r14.L$0 = r0
            r14.J$0 = r2
            r14.label = r7
            java.lang.Object r4 = androidx.compose.material3.AppBarKt.access$settleAppBar(r6, r5, r4, r1, r14)
            if (r4 != r8) goto L83
            return r8
        L83:
            goto L2c
        L84:
            androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 r14 = new androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1
            r14.<init>(r15, r2)
            goto L17
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1.mo819onPostFlingRZ2iAVY(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
