package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import yg.C1561oA;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0018\u007fјnjG5LeN0ZS@\u000fs{:$c$\u007fJCU \u0006*\t]No˧vJp\u000bK\u000f\f\u0018\u0001jBI]xc\u0012\u00172PxG3SySʠ~#f\u000b0428(ڎ/\u0019bG>7\u0006SO\u001a\u0012H@\u001f;ň\u0011M\u0013\u001cZ\u0014L8\u0019\u001e\u000b\u0001~:V\u0007u:]>I}\u000bd5{H|{&vX5*\u000faL/p;C3=S1\u000b\u0019o\b'M\u0011U\u0011x)7+wyg8h\u007fB\u001bYo=a\u0001Gt\u0005\u007f{<-1Oqmh\u000eV\u001bA{UR\u00122\u001e'vG]\u001et\"&3#\u000e\u0004D^'vB.\u0016(H_+\u000eYC9I\u007f\u0018s\u0004/\\^\u0014\u0005;7S\u0005|>sT<dE\u001fb i1\u007fD\u0004Z\u0017\u0010gf\u0006\u0004\u001f{H>L<U*G{?фG)E\u0007Q#OqJTR\u0014\u000f\u0005\u000få\u0004m`uX\"\u001d\u001a\b6\u0017\u000frD\u0013\tB¯`г0\u0011Uȼ%\u0013\f\r+ \u000b}\u0013Ɯ'ŎROpȉ;\\k\u0011=/\u0015;\u00103«\u0012[Q`9=_l`o`\u0001,ARa3c=̾_۱^\\0ί\u0003Tx\u001c\u0010{rTbƑ>Ɛu\u001c<ι\u00021j\"`\u0003LP\u0018Ҙ\u0015ރ^t\u0018зl5*\u0012w4\u0015\u000b\u0007aj\u0003@s\u0007\\D|\u000f&\u0004ێ]ڤ\u001d&]Ȩ9@\u000b7\u001f~\"\u000e\u001eшXܤPl\u001e߯&\b.+29\u007f=\u0014Т\u001bɒ-2\nΏ\u0016X\u0001{iM@-Qۣ\u0006ӛ?h6ԖXv~CxjxU+Ϣ.Ցbr+Ψܖ\u0004)"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001T 7O.HkB,vhoH\u0017p,1r0FSN92", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "1ta?X5M>#\u0003\u0004m,\n\u0017", "", "2dU.h3M;\u0015\u0012Yb:\fv;", "", "2ta.g0H\\", "5dc\u0011h9:b\u001d\t\u0004", "u(8", "6`]1_,K", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", ";`g\u0011\\:MA%", ";h]\u0011h9:b\u001d\t\u0004F:", "", "5dc\u001a\\5\u001dc&z\nb6\u0006p=", "u(9", "Adc\u001a\\5\u001dc&z\nb6\u0006p=", "uI\u0018#", "<t\\/X9(T\u0004\t~g;|\u0016=R\u007f4\fD\u000e\u0017\u0016", ">qTC\\6Na\b\u0003\u0003^", "AsP?g\u001bB[\u0019", "AsP?g\u001f", "AsP?g ", "2hb=T;<V{z\u0004]3|\u0016\u001fp~$\u000b@", "", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "2hb=T;<V\u0007\u000evm,Z\f+n\u0002(", "<df g(MS", ">qTCF;:b\u0019", "5dc\u000ei,KO\u001b~Xh6\n\b=", "\u001aj^A_0G\u001d\u0004z~k\u0002", "3u", "3wR9h+>>#\u0003\u0004m,\n", "", "=m7.a+ES", "And?V,\u001ed\u0019\b\n", "=mA2f,M", "=mBAT;>1\u001cz\u0004`,", ">qTC\\6Na\u0007\u000evm,", "@db2g\nH\\\u001a\u0003|", "Adc\u001aT?\u001dW'\u000e", ";`g\u0011\\:M", "Adc\u001bh4;S&h{I6\u0001\u0012>e\r6", "<t\\/X9(T\u0004\t~g;|\u0016=", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class LongPressGestureHandler extends GestureHandler<LongPressGestureHandler> {
    public static final Companion Companion = new Companion(null);
    private static final float DEFAULT_MAX_DIST_DP = 10.0f;
    private static final long DEFAULT_MIN_DURATION_MS = 500;
    private int currentPointers;
    private final float defaultMaxDistSq;
    private Handler handler;
    private float maxDistSq;
    private long minDurationMs;
    private int numberOfPointersRequired;
    private long previousTime;
    private long startTime;
    private float startX;
    private float startY;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00106Ȑ\u0007\":\u0019\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$BOIV2}P\u000b&ȡ:̊rJbŏ\u0014\u001b\u0014\u0019\u0011jZM,ޏ0ܫ\u00132JģЩ7R"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001T 7O.HkB,vhoH\u0017p,1r0FSN9\u001b0|E\u001f\u000ec\u0012X4b", "", "u(E", "\u0012D5\u000eH\u0013-M\u0001ZmX\u000b`v\u001e_^\u0013", "", "\u0012D5\u000eH\u0013-M\u0001bcX\u000blu\u000bTc\u0012d:h\u0005", "", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LongPressGestureHandler(Context context) throws Throwable {
        short sXd = (short) (ZN.Xd() ^ 4449);
        int[] iArr = new int["TaahZnk".length()];
        QB qb = new QB("TaahZnk");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        this.minDurationMs = DEFAULT_MIN_DURATION_MS;
        setShouldCancelWhenOutside(true);
        Class<?> cls = Class.forName(Wg.vd("\u0006\u0014\u000b\u001a\u0018\u0013\u000fY\u007f\r\r\u0014\u0006\u0010\u0017Qw%%,\u001e2/", (short) (ZN.Xd() ^ 24423)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (OY.Xd() ^ 13265);
        short sXd3 = (short) (OY.Xd() ^ 24534);
        int[] iArr2 = new int["%\"0\r\u001f,',(\u0018\u0019&".length()];
        QB qb2 = new QB("%\"0\r\u001f,',(\u0018\u0019&");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            float f2 = ((Resources) method.invoke(context, objArr)).getDisplayMetrics().density * DEFAULT_MAX_DIST_DP;
            float f3 = f2 * f2;
            this.defaultMaxDistSq = f3;
            this.maxDistSq = f3;
            this.numberOfPointersRequired = 1;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final Pair<Float, Float> getAverageCoords(MotionEvent motionEvent, boolean z2) {
        if (z2) {
            int pointerCount = motionEvent.getPointerCount();
            float x2 = 0.0f;
            float y2 = 0.0f;
            for (int i2 = 0; i2 < pointerCount; i2++) {
                if (i2 != motionEvent.getActionIndex()) {
                    x2 += motionEvent.getX(i2);
                    y2 += motionEvent.getY(i2);
                }
            }
            return new Pair<>(Float.valueOf(x2 / (motionEvent.getPointerCount() - 1)), Float.valueOf(y2 / (motionEvent.getPointerCount() - 1)));
        }
        IntRange intRangeUntil = RangesKt.until(0, motionEvent.getPointerCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(motionEvent.getX(((IntIterator) it).nextInt())));
        }
        float fAverageOfFloat = (float) CollectionsKt.averageOfFloat(arrayList);
        IntRange intRangeUntil2 = RangesKt.until(0, motionEvent.getPointerCount());
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil2, 10));
        Iterator<Integer> it2 = intRangeUntil2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(motionEvent.getY(((IntIterator) it2).nextInt())));
        }
        return new Pair<>(Float.valueOf(fAverageOfFloat), Float.valueOf((float) CollectionsKt.averageOfFloat(arrayList2)));
    }

    static /* synthetic */ Pair getAverageCoords$default(LongPressGestureHandler longPressGestureHandler, MotionEvent motionEvent, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return longPressGestureHandler.getAverageCoords(motionEvent, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHandle$lambda$2(LongPressGestureHandler this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.activate();
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void dispatchHandlerUpdate(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.previousTime = SystemClock.uptimeMillis();
        super.dispatchHandlerUpdate(event);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void dispatchStateChange(int i2, int i3) {
        this.previousTime = SystemClock.uptimeMillis();
        super.dispatchStateChange(i2, i3);
    }

    public final int getDuration() {
        return (int) (this.previousTime - this.startTime);
    }

    public final long getMinDurationMs() {
        return this.minDurationMs;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void onHandle(MotionEvent motionEvent, MotionEvent motionEvent2) throws Throwable {
        Intrinsics.checkNotNullParameter(motionEvent, hg.Vd("\u001e.\u001c$)", (short) (OY.Xd() ^ 26705), (short) (OY.Xd() ^ 82)));
        short sXd = (short) (ZN.Xd() ^ 18952);
        int[] iArr = new int["\u0010\u000b\u0010\f{|[\fy\u0002\u0007".length()];
        QB qb = new QB("\u0010\u000b\u0010\f{|[\fy\u0002\u0007");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(motionEvent2, new String(iArr, 0, i2));
        if (shouldActivateWithMouse(motionEvent2)) {
            if (getState() == 0) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                this.previousTime = jUptimeMillis;
                this.startTime = jUptimeMillis;
                begin();
                Pair averageCoords$default = getAverageCoords$default(this, motionEvent2, false, 2, null);
                float fFloatValue = ((Number) averageCoords$default.component1()).floatValue();
                float fFloatValue2 = ((Number) averageCoords$default.component2()).floatValue();
                this.startX = fFloatValue;
                this.startY = fFloatValue2;
                this.currentPointers++;
            }
            if (motionEvent2.getActionMasked() == 5) {
                this.currentPointers++;
                Pair averageCoords$default2 = getAverageCoords$default(this, motionEvent2, false, 2, null);
                float fFloatValue3 = ((Number) averageCoords$default2.component1()).floatValue();
                float fFloatValue4 = ((Number) averageCoords$default2.component2()).floatValue();
                this.startX = fFloatValue3;
                this.startY = fFloatValue4;
                if (this.currentPointers > this.numberOfPointersRequired) {
                    fail();
                    this.currentPointers = 0;
                }
            }
            if (getState() == 2 && this.currentPointers == this.numberOfPointersRequired && (motionEvent2.getActionMasked() == 0 || motionEvent2.getActionMasked() == 5)) {
                Object[] objArr = new Object[0];
                Method declaredMethod = Class.forName(C1561oA.yd("p|q~zsm6\u0007\nC`\u0003\u0002\u0002uq", (short) (ZN.Xd() ^ 13575))).getDeclaredMethod(C1561oA.Yd("|{\fez\u0004\nh\r\u000e\u0010\u0006\u0014", (short) (C1633zX.Xd() ^ (-9028))), new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                    this.handler = handler;
                    long j2 = this.minDurationMs;
                    if (j2 > 0) {
                        Intrinsics.checkNotNull(handler);
                        Runnable runnable = new Runnable() { // from class: com.swmansion.gesturehandler.core.LongPressGestureHandler$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                LongPressGestureHandler.onHandle$lambda$2(this.f$0);
                            }
                        };
                        long j3 = this.minDurationMs;
                        Class<?> cls = Class.forName(Xg.qd("N\\Sb`[W\"di%@Zh_hbp", (short) (ZN.Xd() ^ 16462), (short) (ZN.Xd() ^ 23025)));
                        Class<?>[] clsArr = {Class.forName(Jg.Wd("2\u0016\ba\n5\t\u0003Y\u000f\u0010 n[+\u001b\u0003h", (short) (OY.Xd() ^ 11922), (short) (OY.Xd() ^ 16580))), Long.TYPE};
                        Object[] objArr2 = {runnable, Long.valueOf(j3)};
                        Method method = cls.getMethod(ZO.xd("RIFF\tMS?P\u0010;", (short) (ZN.Xd() ^ 16402), (short) (ZN.Xd() ^ 32596)), clsArr);
                        try {
                            method.setAccessible(true);
                            method.invoke(handler, objArr2);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } else if (j2 == 0) {
                        activate();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            if (motionEvent2.getActionMasked() == 1 || motionEvent2.getActionMasked() == 12) {
                this.currentPointers--;
                Handler handler2 = this.handler;
                if (handler2 != null) {
                    handler2.removeCallbacksAndMessages(null);
                    this.handler = null;
                }
                if (getState() == 4) {
                    end();
                    return;
                } else {
                    fail();
                    return;
                }
            }
            if (motionEvent2.getActionMasked() != 6) {
                Pair averageCoords$default3 = getAverageCoords$default(this, motionEvent2, false, 2, null);
                float fFloatValue5 = ((Number) averageCoords$default3.component1()).floatValue();
                float fFloatValue6 = ((Number) averageCoords$default3.component2()).floatValue();
                float f2 = fFloatValue5 - this.startX;
                float f3 = fFloatValue6 - this.startY;
                if ((f2 * f2) + (f3 * f3) > this.maxDistSq) {
                    if (getState() == 4) {
                        cancel();
                        return;
                    } else {
                        fail();
                        return;
                    }
                }
                return;
            }
            int i3 = this.currentPointers - 1;
            this.currentPointers = i3;
            if (i3 < this.numberOfPointersRequired && getState() != 4) {
                fail();
                this.currentPointers = 0;
                return;
            }
            Pair<Float, Float> averageCoords = getAverageCoords(motionEvent2, true);
            float fFloatValue7 = averageCoords.component1().floatValue();
            float fFloatValue8 = averageCoords.component2().floatValue();
            this.startX = fFloatValue7;
            this.startY = fFloatValue8;
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void onReset() {
        super.onReset();
        this.currentPointers = 0;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void onStateChange(int i2, int i3) {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.handler = null;
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void resetConfig() {
        super.resetConfig();
        this.minDurationMs = DEFAULT_MIN_DURATION_MS;
        this.maxDistSq = this.defaultMaxDistSq;
    }

    public final LongPressGestureHandler setMaxDist(float f2) {
        this.maxDistSq = f2 * f2;
        return this;
    }

    public final void setMinDurationMs(long j2) {
        this.minDurationMs = j2;
    }

    public final LongPressGestureHandler setNumberOfPointers(int i2) {
        this.numberOfPointersRequired = i2;
        return this;
    }
}
