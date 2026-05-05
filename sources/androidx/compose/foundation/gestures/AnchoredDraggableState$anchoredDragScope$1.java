package androidx.compose.foundation.gestures;

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
/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я%\u001d̉=!4i\bӵLc\u0003\tI\u00066\u00176B\r\"4\u0012}\tnjG9LeN.zRճ\u0015s\u0012éT[Rp\fQc)\u0016\"7_~ku\u007fbZ9D?\n$\u000b\u0003,wV?qZ\u001b@U\b?a] AGt\r635z.F\u0010\u001d\u0001H:x\u0014\u0005\u000f[K:'\u0001X~:j\r{\u0006pŎ\u0012̧$\r&ձ\u007fP<Jz`Z1)\u0007wG\u001fCm6\u0015O#E\u000b܋cǿmӿ/N?5#0k\u0005\rYiG#AwF\u0013rwC9U\fYLW6Ϭkۇ[ոa\u0001.\\\u0013\\x\u000e-8]kkR\u00146\u0006\u0005Ա\u0011S"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\u00012\fI\u007f\u0013&Ky\u0017\u0006x%Ch\u000e-7{_\nVA>uA\u001e\u0014Gn5\te(K}'5[J;\\\u0011nF\u0012\u0015d\u001bN*k\u0012UC\u0012lNB\u001fFw", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w)L9n>+\u0015g@F\u0003e\u001aL\u00012G\"", "2hbAT5<S", "", "5dc\u0011\\:MO\"|z", "u(5", "Adc\u0011\\:MO\"|z", "uE\u0018#", ":dUA56N\\\u0018", "5dc\u0019X-M0#\u000f\u0004]", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc\u0019X-M0#\u000f\u0004]", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "@hV5g\tHc\"}", "5dc\u001f\\.Abu\t\u000bg+", "Adc\u001f\\.Abu\t\u000bg+", "2qP4G6", "", "<df\u001cY-LS(", ":`bA>5He\"oze6z\r>y", "CoS.g,\u001b])\byl", "7r<<i0GUy\t\bp(\n\b", "", "CoS.g,\"T\u0002~z],{", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnchoredDraggableState$anchoredDragScope$1 implements AnchoredDragScope {
    private float distance = Float.NaN;
    private T leftBound;
    private T rightBound;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    AnchoredDraggableState$anchoredDragScope$1(AnchoredDraggableState<T> anchoredDraggableState) {
        this.this$0 = anchoredDraggableState;
    }

    public final T getLeftBound() {
        return this.leftBound;
    }

    public final void setLeftBound(T t2) {
        this.leftBound = t2;
    }

    public final T getRightBound() {
        return this.rightBound;
    }

    public final void setRightBound(T t2) {
        this.rightBound = t2;
    }

    public final float getDistance() {
        return this.distance;
    }

    public final void setDistance(float f2) {
        this.distance = f2;
    }

    @Override // androidx.compose.foundation.gestures.AnchoredDragScope
    public void dragTo(float f2, float f3) {
        float offset = this.this$0.getOffset();
        this.this$0.setOffset(f2);
        this.this$0.setLastVelocity(f3);
        if (Float.isNaN(offset)) {
            return;
        }
        updateIfNeeded(f2 >= offset);
    }

    public final void updateIfNeeded(boolean z2) {
        updateBounds(z2);
        if (Math.abs(this.this$0.getOffset() - this.this$0.getAnchors().positionOf(this.this$0.getCurrentValue())) >= this.distance / 2.0f) {
            Object currentValue = z2 ? this.rightBound : this.leftBound;
            if (currentValue == null) {
                currentValue = this.this$0.getCurrentValue();
            }
            if (((Boolean) this.this$0.getConfirmValueChange$foundation_release().invoke(currentValue)).booleanValue()) {
                this.this$0.setCurrentValue(currentValue);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [T, java.lang.Object] */
    public final void updateBounds(boolean z2) {
        if (this.this$0.getOffset() == this.this$0.getAnchors().positionOf(this.this$0.getCurrentValue())) {
            Object objClosestAnchor = this.this$0.getAnchors().closestAnchor(this.this$0.getOffset() + (z2 ? 1.0f : -1.0f), z2);
            T currentValue = objClosestAnchor;
            if (objClosestAnchor == null) {
                currentValue = this.this$0.getCurrentValue();
            }
            if (z2) {
                this.leftBound = this.this$0.getCurrentValue();
                this.rightBound = currentValue;
            } else {
                this.leftBound = currentValue;
                this.rightBound = this.this$0.getCurrentValue();
            }
        } else {
            Object objClosestAnchor2 = this.this$0.getAnchors().closestAnchor(this.this$0.getOffset(), false);
            T currentValue2 = objClosestAnchor2;
            if (objClosestAnchor2 == null) {
                currentValue2 = this.this$0.getCurrentValue();
            }
            Object objClosestAnchor3 = this.this$0.getAnchors().closestAnchor(this.this$0.getOffset(), true);
            T currentValue3 = objClosestAnchor3;
            if (objClosestAnchor3 == null) {
                currentValue3 = this.this$0.getCurrentValue();
            }
            this.leftBound = currentValue2;
            this.rightBound = currentValue3;
        }
        DraggableAnchors anchors = this.this$0.getAnchors();
        T t2 = this.leftBound;
        Intrinsics.checkNotNull(t2);
        float fPositionOf = anchors.positionOf(t2);
        DraggableAnchors anchors2 = this.this$0.getAnchors();
        T t3 = this.rightBound;
        Intrinsics.checkNotNull(t3);
        this.distance = Math.abs(fPositionOf - anchors2.positionOf(t3));
    }
}
