package com.swmansion.gesturehandler.core;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.drew.metadata.iptc.IptcDirectory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;

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
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`X2\u000fq{<$i+yCA_\"}0\tWȞog|Sb\u000bI\u0011\u000e\u0016\u000fj4I[\bs܈-aruO5]okʠ\u000fsn\u0004Or%أ}\u0005\u000f\u001arV\u001e\u000e\u0013Cy$B4N\nRR;gK.Z\fL;\u0019\u001e\u000b\u007f\u00156\u0011rkVG#1\u0002\t`ou>\u001ae\rtlW\u0011\u0005\u007f6+nVe\u00193s\u001b\u0007\u0001z\u0006\u0015\bwK&\u0001'UC\u0010\u0006 <f\",\u0015YgSq;2j(i`:ʬ[SqUh\u000eV\u0003C\b\u001b`\u001c\u000e4Ωx2;?~\b<;=~afh\u0002\rۍ0~oE/%.>sE)\u000eiaiϊ~;\n-%\u001eQ\t7-i}&`CÑ\u0005{_[i@kP\u0017\u0016gh\u0006\u0004\u001fç2.\u0012@_\u007f]}Y:%QO[g\u05faQo\u0010Y\\g%\u0007)na\u0017jHn<5\u0016\u007f0\u0017:rD\u0013\u001d2P%d:\u0012e\u001c\u0003\tTܴ\u001fء`wDƙu\u001c\\R\u0001i\u0019Q4܆'çj7aʤ<\u001ce>v5KP\u0012\u00168ׯ\u0003݀C<jڳ)rPZ$Z\u000b0xøTн\u0014w\u0004ͩ\u001f\u0018!;WqJ<\u0003վ%Å\u0019H\u000bٜ\u0013M\u000b\u0013wZ\u0017\u001bUԡ?ʗ\u0007i,ڏY\r^h\to\u0016\u0001 ؖ\t˃&-Iٛ\u0006%4b:hb\u0005yȗ\u000b\u0381\u0004Goն\u0018Xz$\u000eU*(l֠Eֺ3=\u001bÁO5@\u0011EEz}<ʻYɟ+z\u0005Ȫ_Gv>\u007f\b\u0019r\u0003ߏvߝST\u001fǱGj\u00014 d.{8Â\u0007ĕgT\u0013ϵ\u000fU\u0001\u0015q<|@Sā+Ǫ)\u0001wܲMA;V?\u001dD\u007fjٯ!˸aiwЃJn\u001d:\re24:ܡ{͈U]:ծ\tUg\u0014V\"RtYܬTܖ{\bJކ\u0005\u0019A^Yd\u001fX\u000fԊ\u0017ɣ\u0002f\u000fԭޡt\u0007"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001\\\u00129/CIzD+\u0015K]B\u0006j,[L", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "u(E", "1ta?X5M;\u0015\u0012cn4y\t<O\u0001\u0013\u0006D\n&\u0017T}", "", "4`X97,EO-~y", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "6`]1_,K", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", ":`bAK", "", ":`bAL", ";`g\u0011X3:g\u0001\r", "", ";`g\u0011X3MO\f", ";`g\u0011X3MO\r", ";`g\u0011\\:MA%", ";`g\u0011h9:b\u001d\t\u0004F:", ";h]\u001bh4;S&h{I6\u0001\u0012>e\r6", "<t\\/X9(T\bz\u0006l", "=eU@X;1", "=eU@X;2", "AsP?g\u001f", "AsP?g ", "B`_@F6\u001fO&", "/bc6i(MS", "", "4na0X", "", "3mS!T7", "=m2.a*>Z", "=m7.a+ES", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "And?V,\u001ed\u0019\b\n", "=mA2f,M", "@db2g\nH\\\u001a\u0003|", "Adc\u001aT?\u001dS z\u000fF:", "Adc\u001aT?\u001dW'\u000e", ";`g\u0011\\:M", "Adc\u001aT?\u001dc&z\nb6\u0006p=", "Adc\u001aT?\u001df", "2d[AT\u001f", "Adc\u001aT?\u001dg", "2d[AT ", "Adc\u001a\\5'c!{zk\u0016}s9i\t7{M\u000f", "Adc\u001bh4;S&h{M(\b\u0017", "Ag^B_+\u001fO\u001d\u0006", "AsP?g\u001b:^", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class TapGestureHandler extends GestureHandler<TapGestureHandler> {
    public static final Companion Companion = new Companion(null);
    private static final long DEFAULT_MAX_DELAY_MS = 200;
    private static final long DEFAULT_MAX_DURATION_MS = 500;
    private static final int DEFAULT_MIN_NUMBER_OF_POINTERS = 1;
    private static final int DEFAULT_NUMBER_OF_TAPS = 1;
    private static final float MAX_VALUE_IGNORE = Float.MIN_VALUE;
    private Handler handler;
    private float lastX;
    private float lastY;
    private float offsetX;
    private float offsetY;
    private float startX;
    private float startY;
    private int tapsSoFar;
    private float maxDeltaX = Float.MIN_VALUE;
    private float maxDeltaY = Float.MIN_VALUE;
    private float maxDistSq = Float.MIN_VALUE;
    private long maxDurationMs = DEFAULT_MAX_DURATION_MS;
    private long maxDelayMs = DEFAULT_MAX_DELAY_MS;
    private int numberOfTaps = 1;
    private int minNumberOfPointers = 1;
    private int currentMaxNumberOfPointers = 1;
    private final Runnable failDelayed = new Runnable() { // from class: com.swmansion.gesturehandler.core.TapGestureHandler$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            TapGestureHandler.failDelayed$lambda$0(this.f$0);
        }
    };

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126B\u0005\"4\u0012\u0006\rnj?0LeV3Zݷ0Ŧl\u0012éT[Rp\u0004@[\u001aԥ&\t]N8s|Kr\u000bq\u0011\\ǠK̶0I]ތ.\u001e\u001d5Zom5$ڑ\u0010˃dt>ӌp>0<\u0012\u0005/\u001f\u0001Ͻbͯ~CSÈb<NvRR;R[܈dĂB \tȦ-s\\=`l\fB\u0006ݍUݦFN/ڿ݇\u0001V"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001\\\u00129/CIzD+\u0015K]B\u0006j,[5\u0005QTY(eV|Fi", "", "u(E", "\u0012D5\u000eH\u0013-M\u0001ZmX\u000b\\o\u000bYy\u0010i", "", "\u0012D5\u000eH\u0013-M\u0001ZmX\u000blu\u000bTc\u0012d:h\u0005", "\u0012D5\u000eH\u0013-M\u0001bcX\u0015lp\fEl\"e!z\u0002\u0001+X|\u001cc\u0013", "", "\u0012D5\u000eH\u0013-M\u0002nb;\fi\u0003\u0019Fy\u0017W+n", "\u001b@G,I\b%Cxx^@\u0015fu\u000f", "", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TapGestureHandler() {
        setShouldCancelWhenOutside(true);
    }

    private final void endTap() throws Throwable {
        Handler handler = this.handler;
        if (handler == null) {
            short sXd = (short) (FB.Xd() ^ 13399);
            short sXd2 = (short) (FB.Xd() ^ 26202);
            int[] iArr = new int["IUJWSLF\u000fOR\f)KJJ>J".length()];
            QB qb = new QB("IUJWSLF\u000fOR\f)KJJ>J");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.ud("wt\u0003ZmtxUwvvjv", (short) (Od.Xd() ^ (-31335))), new Class[0]);
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
        int i3 = this.tapsSoFar + 1;
        this.tapsSoFar = i3;
        if (i3 == this.numberOfTaps && this.currentMaxNumberOfPointers >= this.minNumberOfPointers) {
            activate();
            return;
        }
        Handler handler2 = this.handler;
        Intrinsics.checkNotNull(handler2);
        Runnable runnable = this.failDelayed;
        long j2 = this.maxDelayMs;
        Class<?> cls = Class.forName(C1561oA.yd("[i\\ke`X#qv.I_m`iO]", (short) (FB.Xd() ^ 24229)));
        Class<?>[] clsArr = {Class.forName(C1561oA.Yd("`XnZ(g]ke-Rvpqegrl", (short) (C1580rY.Xd() ^ (-32721)))), Long.TYPE};
        Object[] objArr2 = {runnable, Long.valueOf(j2)};
        Method method = cls.getMethod(Xg.qd("\n\n\u000f\u0011a\u0004\f\u0002\u001b\b\b", (short) (C1607wl.Xd() ^ 16678), (short) (C1607wl.Xd() ^ IptcDirectory.TAG_TIME_CREATED)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler2, objArr2);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void failDelayed$lambda$0(TapGestureHandler this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.fail();
    }

    private final boolean shouldFail() {
        float f2 = (this.lastX - this.startX) + this.offsetX;
        if (this.maxDeltaX != Float.MIN_VALUE && Math.abs(f2) > this.maxDeltaX) {
            return true;
        }
        float f3 = (this.lastY - this.startY) + this.offsetY;
        if (this.maxDeltaY != Float.MIN_VALUE && Math.abs(f3) > this.maxDeltaY) {
            return true;
        }
        float f4 = (f3 * f3) + (f2 * f2);
        float f5 = this.maxDistSq;
        return f5 != Float.MIN_VALUE && f4 > f5;
    }

    private final void startTap() throws Throwable {
        Handler handler = this.handler;
        if (handler == null) {
            Class<?> cls = Class.forName(Jg.Wd("!\u0016[[M\tc.\u0005\u001dF\u0014W\nV]3", (short) (C1499aX.Xd() ^ (-11578)), (short) (C1499aX.Xd() ^ (-16071))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1607wl.Xd() ^ 17435);
            short sXd2 = (short) (C1607wl.Xd() ^ 135);
            int[] iArr = new int["Y\u0004\nP(q\u007f\u0010O\f*\u0005f".length()];
            QB qb = new QB("Y\u0004\nP(q\u007f\u0010O\f*\u0005f");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
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
        Class<?> cls2 = Class.forName(C1626yg.Ud("(G8Qd:n\u0004;\u001cI).V`\u0005\u001cF", (short) (C1607wl.Xd() ^ 12992), (short) (C1607wl.Xd() ^ 28672)));
        Class<?>[] clsArr2 = {Class.forName(Ig.wd("k\u0015\u0018bn\u0001\u0012\u0018A>b&OS8a\u0012+", (short) (C1499aX.Xd() ^ (-25835)))), Long.TYPE};
        Object[] objArr2 = {runnable, Long.valueOf(j2)};
        Method method = cls2.getMethod(EO.Od("Z\u0012wY u\u0011>xi^", (short) (Od.Xd() ^ (-31310))), clsArr2);
        try {
            method.setAccessible(true);
            method.invoke(handler2, objArr2);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void activate(boolean z2) {
        super.activate(z2);
        end();
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
            int actionMasked = sourceEvent.getActionMasked();
            if (state == 0) {
                this.offsetX = 0.0f;
                this.offsetY = 0.0f;
                this.startX = GestureUtils.INSTANCE.getLastPointerX(sourceEvent, true);
                this.startY = GestureUtils.INSTANCE.getLastPointerY(sourceEvent, true);
            }
            if (actionMasked == 5 || actionMasked == 6) {
                this.offsetX += this.lastX - this.startX;
                this.offsetY += this.lastY - this.startY;
                this.lastX = GestureUtils.INSTANCE.getLastPointerX(sourceEvent, true);
                float lastPointerY = GestureUtils.INSTANCE.getLastPointerY(sourceEvent, true);
                this.lastY = lastPointerY;
                this.startX = this.lastX;
                this.startY = lastPointerY;
            } else {
                this.lastX = GestureUtils.INSTANCE.getLastPointerX(sourceEvent, true);
                this.lastY = GestureUtils.INSTANCE.getLastPointerY(sourceEvent, true);
            }
            if (this.currentMaxNumberOfPointers < sourceEvent.getPointerCount()) {
                this.currentMaxNumberOfPointers = sourceEvent.getPointerCount();
            }
            if (shouldFail()) {
                fail();
                return;
            }
            if (state == 0) {
                if (actionMasked == 0 || actionMasked == 11) {
                    begin();
                }
                startTap();
                return;
            }
            if (state == 2) {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 11) {
                            if (actionMasked != 12) {
                                return;
                            }
                        }
                    }
                    endTap();
                    return;
                }
                startTap();
            }
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void onReset() {
        this.tapsSoFar = 0;
        this.currentMaxNumberOfPointers = 0;
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void resetConfig() {
        super.resetConfig();
        this.maxDeltaX = Float.MIN_VALUE;
        this.maxDeltaY = Float.MIN_VALUE;
        this.maxDistSq = Float.MIN_VALUE;
        this.maxDurationMs = DEFAULT_MAX_DURATION_MS;
        this.maxDelayMs = DEFAULT_MAX_DELAY_MS;
        this.numberOfTaps = 1;
        this.minNumberOfPointers = 1;
    }

    public final TapGestureHandler setMaxDelayMs(long j2) {
        this.maxDelayMs = j2;
        return this;
    }

    public final TapGestureHandler setMaxDist(float f2) {
        this.maxDistSq = f2 * f2;
        return this;
    }

    public final TapGestureHandler setMaxDurationMs(long j2) {
        this.maxDurationMs = j2;
        return this;
    }

    public final TapGestureHandler setMaxDx(float f2) {
        this.maxDeltaX = f2;
        return this;
    }

    public final TapGestureHandler setMaxDy(float f2) {
        this.maxDeltaY = f2;
        return this;
    }

    public final TapGestureHandler setMinNumberOfPointers(int i2) {
        this.minNumberOfPointers = i2;
        return this;
    }

    public final TapGestureHandler setNumberOfTaps(int i2) {
        this.numberOfTaps = i2;
        return this;
    }
}
