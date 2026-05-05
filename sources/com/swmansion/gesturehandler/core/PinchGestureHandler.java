package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.swmansion.gesturehandler.core.ScaleGestureDetector;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00106B\u0005&4\u0012\u000e\u0007njG4LeN0ZS@\u000fs{:'c$\u007fCC٥\"}0\u0012WNmgvJp\u000bK\u000f\f\u0018\u000f̓\\Oezm\u0012=˰pn\u007f6ޜs=G`=D\u00134J\"f\u000f5\u0005(@`\u0010%\u0012\n_T(>X\t:\u0001\"}\t(+\u001e>N\u001bN`uiNH\u001bw\u0001Ak\tw^f'\u000eEC_ULbD%v\u00103qT\bQ#(k\u00035T\fC\u0011@\n=3jeg\u0002ɥ\u007fɱ:^\bϬ--U\u0011kwvx\u0013Wx\fU-\u007fgYQ&(&|:M\u0013ǐ\u001aΝ+N6Ʀ2h\u000e\u0015AyC_NX\u001a^p\tQʫ8а)\u007f;ٿ\n7t\\y;GXg\u007f\u0013\u000e6#/x_\u001c+לlڠ\u001fZ\u007f\u0383ISFIV[ZgK{\u001crx\u0001X\u0013\u0007ϝ\f\u009e\u007f\u00116ϏuCiI;!\u001a\u0004\u001fֶsЛ\t`pׅ:^VQ:nD9\u0001¡\u0018ʑHd\rߘ!pf>)MJ^7\u0002\u0016\u00148\\&F_efʡ[ŹmpUΪ\"'5yEfˍo,"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001X\u001a7KF\u001dkB-%ua\u001c\u0003l+Uv4\u001d", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "u(E", "\nrTA \u0006\u0017", "", "4nR._\u0017HW\"\u000em", "5dc\u0013b*:Z\u0004\t~g;o", "u(5", "4nR._\u0017HW\"\u000en", "5dc\u0013b*:Z\u0004\t~g;p", "5dbAh9>:\u001d\r\n^5|\u0016", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001[\u0014*TC\u001dkB-%ua\u0018\u0007r,L\u00061T\u000b85JPnD\u0014sZ\u001c];\u001a\u0005@E2}D@\u001f\u0015\u0002", "", "AbP9X", "5dc V(ES", "u(3", "AbP9X\u000e>a(\u000f\b^\u000b|\u0018/c\u000f2\t", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001[\u0014*TC\u001dkB-%ua\u0018\u0007r,L\u00061T\"", "AoP;F3H^", "AsP?g0GU\u0007\nvg", "Dd[<V0Mg", "5dc#X3HQ\u001d\u000e\u000f", "/bc6i(MS", "", "4na0X", "", "=m7.a+ES", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "And?V,\u001ed\u0019\b\n", "=mA2f,M", "@db2g\u0017K]\u001b\fzl:", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class PinchGestureHandler extends GestureHandler<PinchGestureHandler> {
    private float focalPointX = Float.NaN;
    private float focalPointY = Float.NaN;
    private final ScaleGestureDetector.OnScaleGestureListener gestureListener = new ScaleGestureDetector.OnScaleGestureListener() { // from class: com.swmansion.gesturehandler.core.PinchGestureHandler$gestureListener$1
        {
            this.this$0.setShouldCancelWhenOutside(false);
        }

        @Override // com.swmansion.gesturehandler.core.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            double scale = this.this$0.getScale();
            PinchGestureHandler pinchGestureHandler = this.this$0;
            pinchGestureHandler.scale = pinchGestureHandler.getScale() * ((double) detector.getScaleFactor());
            double timeDeltaSeconds = detector.getTimeDeltaSeconds();
            if (timeDeltaSeconds > 0.0d) {
                PinchGestureHandler pinchGestureHandler2 = this.this$0;
                pinchGestureHandler2.velocity = (pinchGestureHandler2.getScale() - scale) / timeDeltaSeconds;
            }
            if (Math.abs(this.this$0.startingSpan - detector.getCurrentSpan()) < this.this$0.spanSlop || this.this$0.getState() != 2) {
                return true;
            }
            this.this$0.activate();
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            this.this$0.startingSpan = detector.getCurrentSpan();
            return true;
        }

        @Override // com.swmansion.gesturehandler.core.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
        }
    };
    private double scale;
    private ScaleGestureDetector scaleGestureDetector;
    private float spanSlop;
    private float startingSpan;
    private double velocity;

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void activate(boolean z2) {
        if (getState() != 4) {
            resetProgress();
        }
        super.activate(z2);
    }

    public final float getFocalPointX() {
        return this.focalPointX;
    }

    public final float getFocalPointY() {
        return this.focalPointY;
    }

    public final double getScale() {
        return this.scale;
    }

    public final double getVelocity() {
        return this.velocity;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void onHandle(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (getState() == 0) {
            View view = getView();
            Intrinsics.checkNotNull(view);
            Context context = view.getContext();
            resetProgress();
            this.scaleGestureDetector = new ScaleGestureDetector(context, this.gestureListener);
            this.spanSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.focalPointX = event.getX();
            this.focalPointY = event.getY();
            begin();
        }
        ScaleGestureDetector scaleGestureDetector = this.scaleGestureDetector;
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(sourceEvent);
        }
        ScaleGestureDetector scaleGestureDetector2 = this.scaleGestureDetector;
        if (scaleGestureDetector2 != null) {
            PointF pointFTransformPoint = transformPoint(new PointF(scaleGestureDetector2.getFocusX(), scaleGestureDetector2.getFocusY()));
            this.focalPointX = pointFTransformPoint.x;
            this.focalPointY = pointFTransformPoint.y;
        }
        if (sourceEvent.getActionMasked() == 1) {
            if (getState() == 4) {
                end();
            } else {
                fail();
            }
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void onReset() {
        this.scaleGestureDetector = null;
        this.focalPointX = Float.NaN;
        this.focalPointY = Float.NaN;
        resetProgress();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void resetProgress() {
        this.velocity = 0.0d;
        this.scale = 1.0d;
    }
}
