package com.swmansion.gesturehandler.core;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.swmansion.gesturehandler.core.Vector;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Xg;
import yg.ZO;

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
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116B\u0005%4\u0012\u000e\u0007nʑA0ZeP\u008cZS8\u0016s{:(c$\bCC٥\"}0\tWȞog|Sb\u000bI\u0010\u000e\u0016\u000fj4I[\u0001s܈-VruO5]okʠ\u000fsn\u0004Dr%أ}\u0005\u000f\u001arV\u001e\u000b\u0013Cy!B4N\u0007RR;dK.Z\u001eL8\u0019\u001e\u000b|~<V\u0006u<E\"1|rR5yH|{(\rTo\u001b\u0005}6+nLe\u00193m\u001b\u0007\u0001v\u0006\u0003\bwK\"\u0001'U@\u0010\u0006 Lf\u001e,\u0015Yd=a\u0001@t\u0005\u007f{<+9n{K~)n\nC\u0002\u001b\\\u001c\u000e4<\u000f@u t)&3#\b\u001aT\u0019\u0010ld\u0018z\u0010KG)\u000eMC9I\u0002\u0018a\u0004'\\Z\u0014\u0005;5S\u0005|;sT<{[\u001b%\u0010_2i@kJ%˪eǀq\u0010xç\u001a,\n3U\u0004O}\u00173%+\bgG*9k0P\u001bϜxݶdh[֟#VN+\u0007\u0018M)7\u00161ըpʰoP\\А|\u001d['l\u0007,\u0014i\u0601\u001fʟ@!-ī\u001f[vv\u0003M\f\f{ÇrƠ]nsލ(ElAMQ\u0012\u001c8ׯ9݀C<jڳ)~Pb$Z\u000b*xüTн\u0014\u0004\u0004ͩf\u000e\u0019BMu<62B'beV\u00110ZC\u0013\b\u000em?ɰ\u000bՁ7$\u000bǭˮx."}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001N\u001d2VE\u001dkB-%ua\u001c\u0003l+Uv4\u001d", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "u(E", "2ha2V;B]\"", "", "5dc\u0011\\9>Q(\u0003\u0005g", "u(8", "Adc\u0011\\9>Q(\u0003\u0005g", "uH\u0018#", "4`X97,EO-~y", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "6`]1_,K", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", ";`g\u0011h9:b\u001d\t\u0004F:", "", ";`g\u001bh4;S&h{I6\u0001\u0012>e\r6iD\t'\u001eVk\u0017<\u00015C`\u0012", ";h]#X3HQ\u001d\u000e\u000f", "<t\\/X9(T\u0004\t~g;|\u0016=R\u007f4\fD\u000e\u0017\u0016", "5dc\u001bh4;S&h{I6\u0001\u0012>e\r6h@\r'\u001bTo\r", "Adc\u001bh4;S&h{I6\u0001\u0012>e\r6h@\r'\u001bTo\r", "Dd[<V0Mg\b\fv\\2|\u0016", "\u001a`]1e6BRb\u0010~^>Fy/l\n&\u007fO\u0015\u0006$Cm\u0014<\u0004z", "/bc6i(MS", "", "4na0X", "", "/cS#X3HQ\u001d\u000e\u000fF6\u000e\t7e\t7", "BqP0^,K", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "3mS\u0013_0GU", "=m2.a*>Z", "=m7.a+ES", "And?V,\u001ed\u0019\b\n", "=mA2f,M", "@db2g\nH\\\u001a\u0003|", "AsP?g\rEW\"\u0001", "Bqh\u0012a+\u001fZ\u001d\b|", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class FlingGestureHandler extends GestureHandler<FlingGestureHandler> {
    private static final int DEFAULT_DIRECTION = 1;
    private static final long DEFAULT_MAX_DURATION_MS = 800;
    private static final long DEFAULT_MIN_VELOCITY = 2000;
    private static final int DEFAULT_NUMBER_OF_TOUCHES_REQUIRED = 1;
    private Handler handler;
    private int maxNumberOfPointersSimultaneously;
    private VelocityTracker velocityTracker;
    public static final Companion Companion = new Companion(null);
    private static final double DEFAULT_ALIGNMENT_CONE = 30.0d;
    private static final double MAX_AXIAL_DEVIATION = GestureUtils.INSTANCE.coneToDeviation(DEFAULT_ALIGNMENT_CONE);
    private static final double MAX_DIAGONAL_DEVIATION = GestureUtils.INSTANCE.coneToDeviation(60.0d);
    private int numberOfPointersRequired = 1;
    private int direction = 1;
    private final long maxDurationMs = DEFAULT_MAX_DURATION_MS;
    private final long minVelocity = DEFAULT_MIN_VELOCITY;
    private final Runnable failDelayed = new Runnable() { // from class: com.swmansion.gesturehandler.core.FlingGestureHandler$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            FlingGestureHandler.failDelayed$lambda$0(this.f$0);
        }
    };

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000f6Ȑ\u0007\":\u0018\u007fјnjG7LeN1Xݾ+%ӆ,4RZdvI;ڈ\u001e}0\t Zuh\u0007J\t\r\u001aƧXȀ|j4կ&\u0005k\u0015'2ps\u0016ݏ ڱA9hҚ\u0007\u0011.7:8(\u000bWɠ|Н\u0014v\u0003ŏ\u001c\u0018 7XphXcˢWܨ\u0016\u0006FĨQ*jof6vp4ƀ\u0002ݭ\u0007iJ÷wk>\u0006e\rtV}˜xҐ\"+Hʺ\u0006!3]\u001b\u0007\u0001]\u0016ŤAџA\u0005pѧݹ/T"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001N\u001d2VE\u001dkB-%ua\u001c\u0003l+Uv4\u0006*X4gN{A\u001e\u001b0", "", "u(E", "\u0012D5\u000eH\u0013-Mte^@\u0015dh\u0018Ty\u0006e)`", "", "\u0012D5\u000eH\u0013-Mwbg>\nkl\u0019N", "", "\u0012D5\u000eH\u0013-M\u0001ZmX\u000blu\u000bTc\u0012d:h\u0005", "", "\u0012D5\u000eH\u0013-M\u0001bcX\u001d\\o\u0019Cc\u0017o", "\u0012D5\u000eH\u0013-M\u0002nb;\fi\u0003\u0019Fy\u0017e0^yv5iz\u001cb\u0015\u0019F]~", "\u001b@G,4\u001f\"/\u007fxY>\u001d`d\u001eIi\u0011", "\u001b@G,7\u0010\u001a5\u0003gVE&[h I[\u0017_*i", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void addVelocityMovement(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        Intrinsics.checkNotNull(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }

    private final void endFling(MotionEvent motionEvent) {
        if (tryEndFling(motionEvent)) {
            return;
        }
        fail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void failDelayed$lambda$0(FlingGestureHandler this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.fail();
    }

    private final void startFling(MotionEvent motionEvent) throws Throwable {
        this.velocityTracker = VelocityTracker.obtain();
        begin();
        this.maxNumberOfPointersSimultaneously = 1;
        Handler handler = this.handler;
        if (handler == null) {
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(C1561oA.Yd(".<3B@;7\u0002DI\u0005$HIKAO", (short) (OY.Xd() ^ 3468))).getDeclaredMethod(Xg.qd("yx\tbw\u0001\u0007e\n\u000b\r\u0003\u0011", (short) (C1633zX.Xd() ^ (-3629)), (short) (C1633zX.Xd() ^ (-28157))), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                this.handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            Intrinsics.checkNotNull(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.handler;
        Intrinsics.checkNotNull(handler2);
        Runnable runnable = this.failDelayed;
        long j2 = this.maxDurationMs;
        Class<?> cls = Class.forName(Jg.Wd("Q%A6Y\u001a;kS]~??r/]|p", (short) (C1499aX.Xd() ^ (-24820)), (short) (C1499aX.Xd() ^ (-20770))));
        Class<?>[] clsArr = {Class.forName(ZO.xd("\u0014\r\u0019j\u001cB=i[\u007fQZQz(=+t", (short) (FB.Xd() ^ 18150), (short) (FB.Xd() ^ 27021))), Long.TYPE};
        Object[] objArr2 = {runnable, Long.valueOf(j2)};
        Method method = cls.getMethod(C1626yg.Ud("\u0003w^@{\u0003rX\b?\u007f", (short) (Od.Xd() ^ (-3331)), (short) (Od.Xd() ^ (-28061))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler2, objArr2);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private final boolean tryEndFling(MotionEvent motionEvent) {
        int i2;
        int i3;
        addVelocityMovement(this.velocityTracker, motionEvent);
        Vector.Companion companion = Vector.Companion;
        VelocityTracker velocityTracker = this.velocityTracker;
        Intrinsics.checkNotNull(velocityTracker);
        Vector vectorFromVelocity = companion.fromVelocity(velocityTracker);
        Integer[] numArr = {2, 1, 4, 8};
        ArrayList arrayList = new ArrayList(4);
        for (int i4 = 0; i4 < 4; i4++) {
            arrayList.add(Boolean.valueOf(tryEndFling$getVelocityAlignment(this, vectorFromVelocity, numArr[i4].intValue(), MAX_AXIAL_DEVIATION)));
        }
        ArrayList arrayList2 = arrayList;
        Integer[] numArr2 = {5, 9, 6, 10};
        ArrayList arrayList3 = new ArrayList(4);
        for (int i5 = 0; i5 < 4; i5++) {
            arrayList3.add(Boolean.valueOf(tryEndFling$getVelocityAlignment(this, vectorFromVelocity, numArr2[i5].intValue(), MAX_DIAGONAL_DEVIATION)));
        }
        ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = arrayList2;
        if ((arrayList5 instanceof Collection) && arrayList5.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue()) {
                    i2 = 1;
                    break;
                }
            }
            i2 = 0;
        }
        ArrayList arrayList6 = arrayList4;
        if ((arrayList6 instanceof Collection) && arrayList6.isEmpty()) {
            i3 = 0;
        } else {
            Iterator it2 = arrayList6.iterator();
            while (it2.hasNext()) {
                if (((Boolean) it2.next()).booleanValue()) {
                    i3 = 1;
                    break;
                }
            }
            i3 = 0;
        }
        int i6 = (-1) - (((-1) - i2) & ((-1) - i3));
        boolean z2 = vectorFromVelocity.getMagnitude() > ((double) this.minVelocity);
        if (this.maxNumberOfPointersSimultaneously != this.numberOfPointersRequired || i6 == 0 || !z2) {
            return false;
        }
        Handler handler = this.handler;
        Intrinsics.checkNotNull(handler);
        handler.removeCallbacksAndMessages(null);
        activate();
        return true;
    }

    private static final boolean tryEndFling$getVelocityAlignment(FlingGestureHandler flingGestureHandler, Vector vector, int i2, double d2) {
        return (flingGestureHandler.direction & i2) == i2 && vector.isSimilar(Vector.Companion.fromDirection(i2), d2);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void activate(boolean z2) {
        super.activate(z2);
        end();
    }

    public final int getDirection() {
        return this.direction;
    }

    public final int getNumberOfPointersRequired() {
        return this.numberOfPointersRequired;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void onCancel() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void onHandle(MotionEvent event, MotionEvent sourceEvent) throws Throwable {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (shouldActivateWithMouse(sourceEvent)) {
            int state = getState();
            if (state == 0) {
                startFling(sourceEvent);
            }
            if (state == 2) {
                tryEndFling(sourceEvent);
                if (sourceEvent.getPointerCount() > this.maxNumberOfPointersSimultaneously) {
                    this.maxNumberOfPointersSimultaneously = sourceEvent.getPointerCount();
                }
                if (sourceEvent.getActionMasked() == 1) {
                    endFling(sourceEvent);
                }
            }
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void onReset() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.velocityTracker = null;
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void resetConfig() {
        super.resetConfig();
        this.numberOfPointersRequired = 1;
        this.direction = 1;
    }

    public final void setDirection(int i2) {
        this.direction = i2;
    }

    public final void setNumberOfPointersRequired(int i2) {
        this.numberOfPointersRequired = i2;
    }
}
