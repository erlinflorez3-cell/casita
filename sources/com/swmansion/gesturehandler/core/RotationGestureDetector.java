package com.swmansion.gesturehandler.core;

import android.view.MotionEvent;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u0017\u007f\u0007lnA0RlP\u008cZS8\u0018s{:$c$\u007fVC٥\"}0\rWNmmvJh\u000bK\u000f\f\u0016\u0001jBI]xc\u0016%˰rom2\u0006n`ym\u0005<\u0013 J$Nx3\u0002ʀ.H\u001exCIY&*0n\f\u0001RUY\u00136*\u0006l-1\"j\u0005f6v\u000b&@=B\u001bipim_x\u000b[-^TU('e,LX7c'kSK\u0015`}W\u0003m\rm\tvD?+w\u0012\u001e6)\u001c\"\u001aCO;a#*j\bi`:+i\u0010:֦\\ˎ,}\u0003Ԉ%>\n\u0014\u0014.\u0019J;\"~\b<7%vaCh\u0002\rF>;8خ#Ӿ\u000493ݍ3hWjI \u001fC\n\u000f%\u001eQ\fEĒgڍ\u0012`\u001dÑ%\u0006_1iBSG|\u000b0Ơoձtb\nÏT<U\fG{?;m©C٦=#)ǽRTRu\u000f\u0005\u000fu*֢^͕D\"vݫ\b6\u0017\u001brD\u0013\u0015B¯Vг0\u0011Uȼ%\u0013\f\u0019+ \u000b\n\u0013Ɯ1ŎROpȉ;Yk\u001d=/\u0015B0ʧwް[9fڨ\u0006mq$yR%&o@p\bpfpeJ\u001b3̬.ĘLp\u0018Ǯ\u0014FT!!H\u0010\u0001*KD1GgK\rҴ\"FY~\u000fwh\u0002ʖ\u0003x"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001Z =IR?u=\u007f\u0015vpI\u0014c\u000bN\u0006'E[X92", "", "5dbAh9>:\u001d\r\n^5|\u0016", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001Z =IR?u=\u007f\u0015vpI\u0014c\u000bN\u0006'E[X9\u001b<{*\u001e!V\u001dR5\u0016fYO3~Q7\u0006\f:X\u0002Dh\u000ea", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77\u00038\\?Jo>'vhoH\u0017p,-v6GJ]6i\u0011\\F\u0001\u001ci\n]/\u0017\u000e;A2}TD\u001fn0W\u0011;q\u0001\u0019kQ&", "\nrTA \u0006\u0017", "", "/mR5b91", "5dc\u000ea*A]&q", "u(5", "/mR5b92", "5dc\u000ea*A]&r", "1ta?X5MB\u001d\u0007z", "", "7r8;C9HU&~\tl", "", "7r?.h:>R", ">nX;g,K7\u0018\r", "", ">qTC\\6Nat\b|e,", "", ">qTC\\6Na\b\u0003\u0003^", "@nc.g0H\\", "5dc\u001fb;:b\u001d\t\u0004", "u(3", "Bh\\27,Eb\u0015", "5dc!\\4>2\u0019\u0006\nZ", "u(9", "4h]6f/", "", "=mC<h*A3*~\u0004m", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "Bqh\u001dT<LS", "Bqh\"a7:c'~", "3uT;g\bGU ~", "CoS.g,\u001cc&\fzg;", "\u001dmA<g(MW#\b\\^:\f\u0019<ef,\nO\u0001 \u0017T", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RotationGestureDetector {
    private float anchorX;
    private float anchorY;
    private long currentTime;
    private final OnRotationGestureListener gestureListener;
    private boolean isInProgress;
    private boolean isPaused;
    private final int[] pointerIds = new int[2];
    private double previousAngle;
    private long previousTime;
    private double rotation;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\u0015\"4\u0012}\u0007njG0L͜N\u0013hݷZ\u000f\u001az|2i$\nCiVJ\u00020\u000bgN\u0016j5n#\u0019Q\u0013\u001e\u0016'k\\Mczu\u0012=5\t\u0014\bA[tU9\u000fzf\t.4:8(\bG>ݻL\u0017"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001Z =IR?u=\u007f\u0015vpI\u0014c\u000bN\u0006'E[X9\u001b<{*\u001e!V\u001dR5\u0016fYO3~Q7\u0006\f:X\u0002Dh\u000ea", "", "=mA<g(MW#\b", "", "2dc2V;H`", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001Z =IR?u=\u007f\u0015vpI\u0014c\u000bN\u0006'E[X92", "=mA<g(MW#\bW^.\u0001\u0012", "=mA<g(MW#\bZg+", "", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface OnRotationGestureListener {
        boolean onRotation(RotationGestureDetector rotationGestureDetector);

        boolean onRotationBegin(RotationGestureDetector rotationGestureDetector);

        void onRotationEnd(RotationGestureDetector rotationGestureDetector);
    }

    public RotationGestureDetector(OnRotationGestureListener onRotationGestureListener) {
        this.gestureListener = onRotationGestureListener;
    }

    private final void finish() {
        if (this.isInProgress) {
            this.isPaused = false;
            this.isInProgress = false;
            OnRotationGestureListener onRotationGestureListener = this.gestureListener;
            if (onRotationGestureListener != null) {
                onRotationGestureListener.onRotationEnd(this);
            }
        }
    }

    private final void tryPause() {
        if (this.isPaused) {
            return;
        }
        this.isPaused = true;
    }

    private final void tryUnpause(double d2) {
        if (this.isPaused) {
            this.previousAngle = d2;
            this.isPaused = false;
        }
    }

    private final void updateCurrent(MotionEvent motionEvent) {
        this.previousTime = this.currentTime;
        this.currentTime = motionEvent.getEventTime();
        int iFindPointerIndex = motionEvent.findPointerIndex(this.pointerIds[0]);
        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.pointerIds[1]);
        if (iFindPointerIndex == -1 || iFindPointerIndex2 == -1) {
            return;
        }
        float x2 = motionEvent.getX(iFindPointerIndex);
        float y2 = motionEvent.getY(iFindPointerIndex);
        float x3 = motionEvent.getX(iFindPointerIndex2);
        float y3 = motionEvent.getY(iFindPointerIndex2);
        this.anchorX = (x2 + x3) * 0.5f;
        this.anchorY = (y2 + y3) * 0.5f;
        double d2 = -Math.atan2(y3 - y2, x3 - x2);
        tryUnpause(d2);
        double d3 = Double.isNaN(this.previousAngle) ? 0.0d : this.previousAngle - d2;
        this.rotation = d3;
        this.previousAngle = d2;
        if (d3 > 3.141592653589793d) {
            this.rotation = d3 - 3.141592653589793d;
        } else if (d3 < -3.141592653589793d) {
            this.rotation = d3 + 3.141592653589793d;
        }
        double d4 = this.rotation;
        if (d4 > 1.5707963267948966d) {
            this.rotation = d4 - 3.141592653589793d;
        } else if (d4 < -1.5707963267948966d) {
            this.rotation = d4 + 3.141592653589793d;
        }
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

    public final long getTimeDelta() {
        return this.currentTime - this.previousTime;
    }

    public final boolean onTouchEvent(MotionEvent event) {
        OnRotationGestureListener onRotationGestureListener;
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.isInProgress = false;
            this.pointerIds[0] = event.getPointerId(event.getActionIndex());
            this.pointerIds[1] = -1;
        } else if (actionMasked == 1) {
            finish();
        } else if (actionMasked != 2) {
            if (actionMasked == 5) {
                if (!this.isInProgress || this.isPaused) {
                    this.pointerIds[1] = event.getPointerId(event.getActionIndex());
                    updateCurrent(event);
                }
                if (!this.isInProgress) {
                    this.isInProgress = true;
                    this.previousTime = event.getEventTime();
                    this.previousAngle = Double.NaN;
                    OnRotationGestureListener onRotationGestureListener2 = this.gestureListener;
                    if (onRotationGestureListener2 != null) {
                        onRotationGestureListener2.onRotationBegin(this);
                    }
                }
            } else if (actionMasked == 6 && this.isInProgress) {
                int pointerId = event.getPointerId(event.getActionIndex());
                int[] iArr = this.pointerIds;
                if (pointerId == iArr[0]) {
                    iArr[0] = iArr[1];
                    iArr[1] = -1;
                    tryPause();
                } else if (pointerId == iArr[1]) {
                    iArr[1] = -1;
                    tryPause();
                }
            }
        } else if (this.isInProgress) {
            updateCurrent(event);
            if (!this.isPaused && (onRotationGestureListener = this.gestureListener) != null) {
                onRotationGestureListener.onRotation(this);
            }
        }
        return true;
    }
}
