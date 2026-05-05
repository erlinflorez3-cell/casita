package com.swmansion.gesturehandler.core;

import android.graphics.PointF;
import android.view.MotionEvent;
import com.swmansion.gesturehandler.core.RotationGestureDetector;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00106B\u0005&4\u0012\u000e\u0007njG4LeN0ZS@\u000fs{:%c$\u007fCC٥\"}0\u0012WNmgvJp\u000bK\u000f\f\u0019\u000f̓Je\u0006~m\u0014\u001f2pģm2\u0006nYycҽ:\u0005.2jF\b\u0017\u0019\u001aX[@z\tWc\f@E\u0007\u0005\u0003h\u001bc\u001d\u001a@\u0019n$\u000f5tg|NxpkSG#1\u0002\t`oe>\u0017e\rtgm\u001f?g,FX7c(kgS#`^W\u0003msm\tv(?+wu\u0016v/ã Ʀ/U\u0015ƞ\u000b(b\t_e\\C9U{K~\u0010X{\t|%<2\u0010Dg\u001f͚9բj\u000e\u0016ޗ\rtYG^\u0007/N\u000e\u0003y6E.VĔ-ݰ\u001ffYĥ\f5\\B\u0014\u0005;(S\u0005|\"sT<jS[+ȴ]śUFEʰf\f_I{\u0011Ap\u00108\u001c2]~]\u000bgч#É;[A\u05faq\b\u0010X\\g%\u000f\u0011lajjHn,-V\u000eѮ\u0015ɔ^Jlʍ\u0004RZi:\u001eܜ q"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001Z =IR?u=\u007f\u0015vpI\u0014c\u000fJ\u007f&NL[\u0002", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "u(E", "\nrTA \u0006\u0017", "", "/mR5b91", "5dc\u000ea*A]&q", "u(5", "/mR5b92", "5dc\u000ea*A]&r", "5dbAh9>:\u001d\r\n^5|\u0016", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001Z =IR?u=\u007f\u0015vpI\u0014c\u000bN\u0006'E[X9\u001b<{*\u001e!V\u001dR5\u0016fYO3~Q7\u0006\f:X\u0002Dh\u000ea", "", "@nc.g0H\\", "5dc\u001fb;:b\u001d\t\u0004", "u(3", "@nc.g0H\\z~\tm<\n\t\u000ee\u000f(yO\u000b$", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001Z =IR?u=\u007f\u0015vpI\u0014c\u000bN\u0006'E[X92", "Dd[<V0Mg", "5dc#X3HQ\u001d\u000e\u000f", "/bc6i(MS", "", "4na0X", "", "=m7.a+ES", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "And?V,\u001ed\u0019\b\n", "=mA2f,M", "@db2g\u0017K]\u001b\fzl:", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RotationGestureHandler extends GestureHandler<RotationGestureHandler> {
    public static final Companion Companion = new Companion(null);
    private static final double ROTATION_RECOGNITION_THRESHOLD = 0.08726646259971647d;
    private float anchorX = Float.NaN;
    private float anchorY = Float.NaN;
    private final RotationGestureDetector.OnRotationGestureListener gestureListener;
    private double rotation;
    private RotationGestureDetector rotationGestureDetector;
    private double velocity;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000f6Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001Z =IR?u=\u007f\u0015vpI\u0014c\u000fJ\u007f&NL[j:\\zH\u0010\u001b^\u0018W\u0001", "", "u(E", " NC\u000eG\u0010(<\u0013kZ<\u0016^q\u0013Tc\u0012d:oy\u0004']p&]\u0004", "", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RotationGestureHandler() {
        setShouldCancelWhenOutside(false);
        this.gestureListener = new RotationGestureDetector.OnRotationGestureListener() { // from class: com.swmansion.gesturehandler.core.RotationGestureHandler$gestureListener$1
            @Override // com.swmansion.gesturehandler.core.RotationGestureDetector.OnRotationGestureListener
            public boolean onRotation(RotationGestureDetector detector) {
                Intrinsics.checkNotNullParameter(detector, "detector");
                double rotation = this.this$0.getRotation();
                RotationGestureHandler rotationGestureHandler = this.this$0;
                rotationGestureHandler.rotation = rotationGestureHandler.getRotation() + detector.getRotation();
                long timeDelta = detector.getTimeDelta();
                if (timeDelta > 0) {
                    RotationGestureHandler rotationGestureHandler2 = this.this$0;
                    rotationGestureHandler2.velocity = (rotationGestureHandler2.getRotation() - rotation) / timeDelta;
                }
                if (Math.abs(this.this$0.getRotation()) < 0.08726646259971647d || this.this$0.getState() != 2) {
                    return true;
                }
                this.this$0.activate();
                return true;
            }

            @Override // com.swmansion.gesturehandler.core.RotationGestureDetector.OnRotationGestureListener
            public boolean onRotationBegin(RotationGestureDetector detector) {
                Intrinsics.checkNotNullParameter(detector, "detector");
                return true;
            }

            @Override // com.swmansion.gesturehandler.core.RotationGestureDetector.OnRotationGestureListener
            public void onRotationEnd(RotationGestureDetector detector) {
                Intrinsics.checkNotNullParameter(detector, "detector");
                this.this$0.end();
            }
        };
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void activate(boolean z2) {
        if (getState() != 4) {
            resetProgress();
        }
        super.activate(z2);
    }

    public final float getAnchorX() {
        return this.anchorX;
    }

    public final float getAnchorY() {
        return this.anchorY;
    }

    public final double getRotation() {
        return this.rotation;
    }

    public final double getVelocity() {
        return this.velocity;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void onHandle(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (getState() == 0) {
            resetProgress();
            this.rotationGestureDetector = new RotationGestureDetector(this.gestureListener);
            this.anchorX = event.getX();
            this.anchorY = event.getY();
            begin();
        }
        RotationGestureDetector rotationGestureDetector = this.rotationGestureDetector;
        if (rotationGestureDetector != null) {
            rotationGestureDetector.onTouchEvent(sourceEvent);
        }
        RotationGestureDetector rotationGestureDetector2 = this.rotationGestureDetector;
        if (rotationGestureDetector2 != null) {
            PointF pointFTransformPoint = transformPoint(new PointF(rotationGestureDetector2.getAnchorX(), rotationGestureDetector2.getAnchorY()));
            this.anchorX = pointFTransformPoint.x;
            this.anchorY = pointFTransformPoint.y;
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
        this.rotationGestureDetector = null;
        this.anchorX = Float.NaN;
        this.anchorY = Float.NaN;
        resetProgress();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void resetProgress() {
        this.velocity = 0.0d;
        this.rotation = 0.0d;
    }
}
