package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.QB;
import yg.Xu;
import yg.ZN;

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
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0019\u007fјnjO0L͜P.`X2\u000fq}<$i-yCAY\"}8\tWNmhvJh\u0011K\u000f\f\u001e\u0001jBI]xc\u0019\u00172XoG3SrE9nt>\u0005&4*8\u0010\u0005\t\u001a0a&͌\u0019\u0016{\u0012\"2Pphĥ;L=\u0019dFK0\u0007,\\\u007fPLG\u001b^Ơ3#\u0011k\u000b\\5\u0012H|{@vX5A\u000faL8\u0007K}\u001b3\t\u001b\u0007\u0001\u000f\u0006\u0015\b\bK;\u0001'U^ywemp\u007fBM[S\u001b\u0017\u000b&\u000b=\u0018rT-9\n{K~An\nC\u0002\u001bw\u001c\u000e4Z\u000fBu tD&3#&\u001aT\u0019\u000el\u007f\u0018z\u0010اG)\u000eqC9Ij\u001amIXf7*˜=\"1\b\u0007!\n\\Vl#[lw\u007fĸ\u0002DKQf\n\bE6\u0010~$\u001a*2\u0382w\u0004=\u0006).E-\u007fgGe9k0҆tk\u0005\u0010xh\u0002q\u001bTNe\u0007\u0016eѧ9\u0010hP|\u0005\u001a]\u001dd:Ue\u001c\u0003͵.\f!/twj)m\u001c\\\u0015\u0001i\u0019ܔ\u000e\u000e3?~7\bv4\u001ae\u007fv3cȡ\u0014\u0014oc\u000f\u0014mD+\u0011f.ZS:ȗ\r,0D`j>\u007fDP\\T+2mڤL8:H1\\C`K*P\u000b\u0015\t\u000eʳ\u0019\u0014\r\u001fK$1ql\u0001\u0017Lh\\\u001fב\u0018|WF\u0015`PE\n]Ce>UPֻd\u00011T\u0017s.O0XU\u001b\u0005\u0016$ɝ,$$6QQ]E[\u001b\rxJ\u0002[զ|vsne\u0012U\u0003E\u007f\u001d\f\u0001.\u0016\u00151ptfx\u001cgTE/=^C/\u0016g\u0018y\u0010JQõoӝ\u000f[FδC\u000fgAf8+\u000buǊ'˽s\"\u0005ކ}O5$.wB7k˘iɳs.\u0002ʬ_2\u0003n\u001c,\u0012\u001eF̨]Є6;@Ծ*\u000bL,<l1J\u001f۶\u0004ڇF\t<ؿ\u0004TOo\tVfUaɃ\n֨\u000b,\u0015ߞ'gH\u001f\b}b;6͋\u007fʸ\u0002\u0014fƹu\u001d[a\u007fm\u001cS3֨L؝\u000e\u000b\u0004ς?\u001e*L8V\u0006j_ݸ\u0012֯\u001c6Iݥ3\u0011J\u0019<4ZD^ՄOҰm\u0006\u0018ÿPRm /2p{\u0012ٜ\u001a֭|\\^ޠUlSr9*/\u0007eɿ*א91\rև\u0017b=vJ\u0003i\u001c7/Aʭ\u000bݝ)+LǴ\n'6m\u0019\u000bse\u001a̵\u000e\u0530\bG1Ԗ<{\u001aN0|KJnÊEݔ\u0015_~Ѫ/\u0017c{fd%*=ŝZĀ-~\u0003Մ^H\u0018(#\u0019}zF۱9ٮRw?Ƒj\r%^A\u0007:\u0015:˭'ұ\n55֑\u001av\"B\u0014W\u0002CTЛ,Č+\u0004|ե-c\u001c\u0003\"]IBlލ\"ȫ\u0006\t\u001bУp\u0010<g\rr86^ˉ[ױ7\u0002\u001bȅ*w\u0006?X'Yt\\ןWи|\nkؙ4zc*\u001bf_^PҪ9ȃ!\t/Ӎ~\u001ffzR\u0011\u0002(/Ҽ\fȗ\u0019&'ߎXn71gc\u0017xBϊgá//sˋ2M>v6}M\u001d&\b8v@\u0015iy\f~;Ӿh\u05cfF]\u0016ߜ\u0003*j\u001a\u001aOd\f\rov\u0011A<|7۠h3O\u001b%\u0004\u001bp1\u0016\u0012oa&O9\t\u0004װ;6#q.\"\u001f,\u000bp\u0003,BD\u001fq.\u0015\u0003ߣRÊA\u001a/ڒt\nr1>Ks@r\f:3&\u0011]bv`\u0015ѕ&̄?W;߿1\u0013\u0007DF/@#'e\u0003Q\u0002-Z\u0005\u000b#%?(9*zJى~ܯ3\u0015wߦohAVC\u000f\u0380+_"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001X\u00127/CIzD+\u0015K]B\u0006j,[L", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "/bc6i(MSt\u007f\n^9c\u00138gj5{N\u000f", "", "/bc6i(MSw~\u0002Z@|\b", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "/bc6i,(T\u001a\rzm\u001f\\\u0012.", "", "/bc6i,(T\u001a\rzm\u001fj\u0018+r\u000f", "/bc6i,(T\u001a\rzm \\\u0012.", "/bc6i,(T\u001a\rzm j\u0018+r\u000f", "/uT?T.>B#\u000fxa,\u000b", "", "2dU.h3M;\u001d\bYb:\fv;", "4`X9B-?a\u0019\u000em>5{", "4`X9B-?a\u0019\u000emL;x\u0016>", "4`X9B-?a\u0019\u000en>5{", "4`X9B-?a\u0019\u000enL;x\u0016>", "6`]1_,K", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", ":`bAK", ":`bAL", ";`g\u001db0Gb\u0019\f\t", "", ";h]\u0011\\:MA%", ";h]\u001db0Gb\u0019\f\t", ";h]#X3HQ\u001d\u000e\u000fL8", ";h]#X3HQ\u001d\u000e\u000fQ", ";h]#X3HQ\u001d\u000e\u000fR", "=eU@X;1", "=eU@X;2", "AsP?g\u001f", "AsP?g ", "\nrTA \u0006\u0017", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001[%BTSIJ0-\u0011>", "Ash9h:\u001dO(z", "5dc g@Ec']vm(", "u(;0b4\ba+\u0007vg:\u0001\u00138/\u0002(\nO\u0011$\u0017Jk\u0017;}%B#{*Dm_\u001c\\WB{B|\u0011w]\u000f", "BqP;f3:b\u001d\t\u0004Q", "5dc!e(Ga z\nb6\u0006{", "u(5", "BqP;f3:b\u001d\t\u0004R", "5dc!e(Ga z\nb6\u0006|", "Dd[<V0Mg\b\fv\\2|\u0016", "\u001a`]1e6BRb\u0010~^>Fy/l\n&\u007fO\u0015\u0006$Cm\u0014<\u0004z", "Dd[<V0Mg\f", "5dc#X3HQ\u001d\u000e\u000fQ", "Dd[<V0Mg\r", "5dc#X3HQ\u001d\u000e\u000fR", "/bc6i(MS", "", "4na0X", "=m2.a*>Z", "=m7.a+ES", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "And?V,\u001ed\u0019\b\n", "=mA2f,M", "@db2g\nH\\\u001a\u0003|", "@db2g\u0017K]\u001b\fzl:", "Adc\u000eV;Bd\u0015\u000ez:-\f\t<L\n1}+\u000e\u0017%U", "Bh\\2", "Adc\u000eV;Bd\u0019h{_:|\u0018\"E\t'", "Adc\u000eV;Bd\u0019h{_:|\u0018\"S\u000f$\tO", "Adc\u000eV;Bd\u0019h{_:|\u0018#E\t'", "Adc\u000eV;Bd\u0019h{_:|\u0018#S\u000f$\tO", "Adc\u000ei,KO\u001b~ih<z\f/s", "Adc\u0013T0E=\u001a\u007f\t^;oh8d", "Adc\u0013T0E=\u001a\u007f\t^;ov>a\r7", "Adc\u0013T0E=\u001a\u007f\t^;ph8d", "Adc\u0013T0E=\u001a\u007f\t^;pv>a\r7", "Adc\u001aT?)]\u001d\b\n^9\u000b", "Adc\u001a\\5\u001dW'\u000e", ";h]\u0011\\:M", "Adc\u001a\\5)]\u001d\b\n^9\u000b", "Adc\u001a\\5/S \txb;\u0011", ";h]#X3HQ\u001d\u000e\u000f", "Adc\u001a\\5/S \txb;\u0011{", "Adc\u001a\\5/S \txb;\u0011|", "Ag^B_+\u001aQ(\u0003\fZ;|", "Ag^B_+\u001fO\u001d\u0006", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class PanGestureHandler extends GestureHandler<PanGestureHandler> {
    public static final Companion Companion = new Companion(null);
    private static final long DEFAULT_ACTIVATE_AFTER_LONG_PRESS = 0;
    private static final int DEFAULT_MAX_POINTERS = 10;
    private static final int DEFAULT_MIN_POINTERS = 1;
    private static final float MAX_VALUE_IGNORE = Float.MIN_VALUE;
    private static final float MIN_VALUE_IGNORE = Float.MAX_VALUE;
    private long activateAfterLongPress;
    private boolean averageTouches;
    private final float defaultMinDistSq;
    private Handler handler;
    private float lastX;
    private float lastY;
    private float minDistSq;
    private float offsetX;
    private float offsetY;
    private float startX;
    private float startY;
    private VelocityTracker velocityTracker;
    private float velocityX;
    private float velocityY;
    private float activeOffsetXStart = Float.MAX_VALUE;
    private float activeOffsetXEnd = Float.MIN_VALUE;
    private float failOffsetXStart = Float.MIN_VALUE;
    private float failOffsetXEnd = Float.MAX_VALUE;
    private float activeOffsetYStart = Float.MAX_VALUE;
    private float activeOffsetYEnd = Float.MIN_VALUE;
    private float failOffsetYStart = Float.MIN_VALUE;
    private float failOffsetYEnd = Float.MAX_VALUE;
    private float minVelocityX = Float.MAX_VALUE;
    private float minVelocityY = Float.MAX_VALUE;
    private float minVelocitySq = Float.MAX_VALUE;
    private int minPointers = 1;
    private int maxPointers = 10;
    private final Runnable activateDelayed = new Runnable() { // from class: com.swmansion.gesturehandler.core.PanGestureHandler$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            PanGestureHandler.activateDelayed$lambda$0(this.f$0);
        }
    };
    private StylusData stylusData = new StylusData(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0007\":\u0018\u007f\u0007ljA0RjP.XS2\u000fy{<řc$\bCC٥\"}8\tWȞmˮo`ҙ;C=\u0005V}p,֒Yxk\u0012WJPxW3{ym?n\u007fN\u000761PD*\t\u000f'BH>\u0005AC\u001c\u0018 1XphTcˢWܨ\u0016\u0006FĨQ*jjf6vp4ƀ\u0002ݭ\u0007iJ÷wk>\u0002e\rtX}˜IҐ\"+Hʺ\u0006!3Y\u001b\u0007\u0001b\u0016Ť\u0012џA\u0005pѧw7W{o6\u0007\u0007jƆ}̠\u0011]z̦ف\t`"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001X\u00127/CIzD+\u0015K]B\u0006j,[5\u0005QTY(eV|Fi", "", "u(E", "\u0012D5\u000eH\u0013-Mt\\iB\u001dXw\u000f_[\tj m\u0011}1Xo6a\u0012\u0015Gk", "", "\u0012D5\u000eH\u0013-M\u0001ZmX\u0017fl\u0018T_\u0015i", "", "\u0012D5\u000eH\u0013-M\u0001bcX\u0017fl\u0018T_\u0015i", "\u001b@G,I\b%Cxx^@\u0015fu\u000f", "", "\u001bH=,I\b%Cxx^@\u0015fu\u000f", "/cS#X3HQ\u001d\u000e\u000fF6\u000e\t7e\t7", "", "BqP0^,K", "\u001a`]1e6BRb\u0010~^>Fy/l\n&\u007fO\u0015\u0006$Cm\u0014<\u0004z", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addVelocityMovement(VelocityTracker velocityTracker, MotionEvent motionEvent) {
            float rawX = motionEvent.getRawX() - motionEvent.getX();
            float rawY = motionEvent.getRawY() - motionEvent.getY();
            motionEvent.offsetLocation(rawX, rawY);
            Intrinsics.checkNotNull(velocityTracker);
            velocityTracker.addMovement(motionEvent);
            motionEvent.offsetLocation(-rawX, -rawY);
        }
    }

    public PanGestureHandler(Context context) {
        this.minDistSq = Float.MIN_VALUE;
        Intrinsics.checkNotNull(context);
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        float f2 = scaledTouchSlop * scaledTouchSlop;
        this.defaultMinDistSq = f2;
        this.minDistSq = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void activateDelayed$lambda$0(PanGestureHandler this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.activate();
    }

    private final boolean shouldActivate() {
        float f2 = (this.lastX - this.startX) + this.offsetX;
        float f3 = this.activeOffsetXStart;
        if (f3 != Float.MAX_VALUE && f2 < f3) {
            return true;
        }
        float f4 = this.activeOffsetXEnd;
        if (f4 != Float.MIN_VALUE && f2 > f4) {
            return true;
        }
        float f5 = (this.lastY - this.startY) + this.offsetY;
        float f6 = this.activeOffsetYStart;
        if (f6 != Float.MAX_VALUE && f5 < f6) {
            return true;
        }
        float f7 = this.activeOffsetYEnd;
        if (f7 != Float.MIN_VALUE && f5 > f7) {
            return true;
        }
        float f8 = (f2 * f2) + (f5 * f5);
        float f9 = this.minDistSq;
        if (f9 != Float.MAX_VALUE && f8 >= f9) {
            return true;
        }
        float f10 = this.velocityX;
        float f11 = this.minVelocityX;
        if (f11 != Float.MAX_VALUE && ((f11 < 0.0f && f10 <= f11) || (0.0f <= f11 && f11 <= f10))) {
            return true;
        }
        float f12 = this.velocityY;
        float f13 = this.minVelocityY;
        if (f13 != Float.MAX_VALUE && ((f13 < 0.0f && f10 <= f13) || (0.0f <= f13 && f13 <= f10))) {
            return true;
        }
        float f14 = (f10 * f10) + (f12 * f12);
        float f15 = this.minVelocitySq;
        return f15 != Float.MAX_VALUE && f14 >= f15;
    }

    private final boolean shouldFail() {
        float f2 = (this.lastX - this.startX) + this.offsetX;
        float f3 = (this.lastY - this.startY) + this.offsetY;
        if (this.activateAfterLongPress > 0 && (f2 * f2) + (f3 * f3) > this.defaultMinDistSq) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            return true;
        }
        float f4 = this.failOffsetXStart;
        if (f4 != Float.MIN_VALUE && f2 < f4) {
            return true;
        }
        float f5 = this.failOffsetXEnd;
        if (f5 != Float.MAX_VALUE && f2 > f5) {
            return true;
        }
        float f6 = this.failOffsetYStart;
        if (f6 != Float.MIN_VALUE && f3 < f6) {
            return true;
        }
        float f7 = this.failOffsetYEnd;
        return f7 != Float.MAX_VALUE && f3 > f7;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void activate(boolean z2) {
        if (getState() != 4) {
            resetProgress();
        }
        super.activate(z2);
    }

    public final StylusData getStylusData() {
        return this.stylusData;
    }

    public final float getTranslationX() {
        return (this.lastX - this.startX) + this.offsetX;
    }

    public final float getTranslationY() {
        return (this.lastY - this.startY) + this.offsetY;
    }

    public final float getVelocityX() {
        return this.velocityX;
    }

    public final float getVelocityY() {
        return this.velocityY;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void onCancel() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void onHandle(MotionEvent motionEvent, MotionEvent motionEvent2) throws Throwable {
        Intrinsics.checkNotNullParameter(motionEvent, C1626yg.Ud("c\u0018&(v", (short) (ZN.Xd() ^ 17397), (short) (ZN.Xd() ^ 17130)));
        Intrinsics.checkNotNullParameter(motionEvent2, Ig.wd("uIay$I\u0011\"Bz\u0007", (short) (C1580rY.Xd() ^ (-13535))));
        if (shouldActivateWithMouse(motionEvent2)) {
            if (motionEvent.getToolType(0) == 2) {
                this.stylusData = StylusData.Companion.fromEvent(motionEvent);
            }
            int state = getState();
            int actionMasked = motionEvent2.getActionMasked();
            if (actionMasked == 5 || actionMasked == 6) {
                this.offsetX += this.lastX - this.startX;
                this.offsetY += this.lastY - this.startY;
                this.lastX = GestureUtils.INSTANCE.getLastPointerX(motionEvent2, this.averageTouches);
                float lastPointerY = GestureUtils.INSTANCE.getLastPointerY(motionEvent2, this.averageTouches);
                this.lastY = lastPointerY;
                this.startX = this.lastX;
                this.startY = lastPointerY;
            } else {
                this.lastX = GestureUtils.INSTANCE.getLastPointerX(motionEvent2, this.averageTouches);
                this.lastY = GestureUtils.INSTANCE.getLastPointerY(motionEvent2, this.averageTouches);
            }
            if (state != 0 || motionEvent2.getPointerCount() < this.minPointers) {
                VelocityTracker velocityTracker = this.velocityTracker;
                if (velocityTracker != null) {
                    Companion.addVelocityMovement(velocityTracker, motionEvent2);
                    VelocityTracker velocityTracker2 = this.velocityTracker;
                    Intrinsics.checkNotNull(velocityTracker2);
                    velocityTracker2.computeCurrentVelocity(1000);
                    VelocityTracker velocityTracker3 = this.velocityTracker;
                    Intrinsics.checkNotNull(velocityTracker3);
                    this.velocityX = velocityTracker3.getXVelocity();
                    VelocityTracker velocityTracker4 = this.velocityTracker;
                    Intrinsics.checkNotNull(velocityTracker4);
                    this.velocityY = velocityTracker4.getYVelocity();
                }
            } else {
                resetProgress();
                this.offsetX = 0.0f;
                this.offsetY = 0.0f;
                this.velocityX = 0.0f;
                this.velocityY = 0.0f;
                VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                this.velocityTracker = velocityTrackerObtain;
                Companion.addVelocityMovement(velocityTrackerObtain, motionEvent2);
                begin();
                if (this.activateAfterLongPress > 0) {
                    if (this.handler == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(EO.Od("\u0019\\B*\u007f?h3L\u001e\\VE=`1k", (short) (FB.Xd() ^ 32305))).getDeclaredMethod(C1561oA.Qd("hesK^eiFhgg[g", (short) (C1633zX.Xd() ^ (-10008))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            this.handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                    Handler handler = this.handler;
                    Intrinsics.checkNotNull(handler);
                    Runnable runnable = this.activateDelayed;
                    long j2 = this.activateAfterLongPress;
                    Class<?> cls = Class.forName(C1593ug.zd("#1(750,v9>y\u0015/=4=7E", (short) (C1607wl.Xd() ^ 12299), (short) (C1607wl.Xd() ^ 30080)));
                    Class<?>[] clsArr = new Class[2];
                    short sXd = (short) (C1633zX.Xd() ^ (-22410));
                    int[] iArr = new int[" \u0016*\u0014_\u001d\u0011\u001d\u0015Z} \u0018\u0017\t\t\u0012\n".length()];
                    QB qb = new QB(" \u0016*\u0014_\u001d\u0011\u001d\u0015Z} \u0018\u0017\t\t\u0012\n");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                        i2++;
                    }
                    clsArr[0] = Class.forName(new String(iArr, 0, i2));
                    clsArr[1] = Long.TYPE;
                    Object[] objArr2 = {runnable, Long.valueOf(j2)};
                    Method method = cls.getMethod(C1561oA.Kd("XX]_0RZPiVV", (short) (FB.Xd() ^ 7969)), clsArr);
                    try {
                        method.setAccessible(true);
                        method.invoke(handler, objArr2);
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
            }
            if (actionMasked == 1 || actionMasked == 12) {
                if (state == 4) {
                    end();
                    return;
                } else {
                    fail();
                    return;
                }
            }
            if (actionMasked == 5 && motionEvent2.getPointerCount() > this.maxPointers) {
                if (state == 4) {
                    cancel();
                    return;
                } else {
                    fail();
                    return;
                }
            }
            if (actionMasked == 6 && state == 4 && motionEvent2.getPointerCount() < this.minPointers) {
                fail();
                return;
            }
            if (state == 2) {
                if (shouldFail()) {
                    fail();
                } else if (shouldActivate()) {
                    activate();
                }
            }
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void onReset() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
        this.stylusData = new StylusData(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void resetConfig() {
        super.resetConfig();
        this.activeOffsetXStart = Float.MAX_VALUE;
        this.activeOffsetXEnd = Float.MIN_VALUE;
        this.failOffsetXStart = Float.MIN_VALUE;
        this.failOffsetXEnd = Float.MAX_VALUE;
        this.activeOffsetYStart = Float.MAX_VALUE;
        this.activeOffsetYEnd = Float.MIN_VALUE;
        this.failOffsetYStart = Float.MIN_VALUE;
        this.failOffsetYEnd = Float.MAX_VALUE;
        this.minVelocityX = Float.MAX_VALUE;
        this.minVelocityY = Float.MAX_VALUE;
        this.minVelocitySq = Float.MAX_VALUE;
        this.minDistSq = this.defaultMinDistSq;
        this.minPointers = 1;
        this.maxPointers = 10;
        this.activateAfterLongPress = 0L;
        this.averageTouches = false;
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    public void resetProgress() {
        this.startX = this.lastX;
        this.startY = this.lastY;
    }

    public final PanGestureHandler setActivateAfterLongPress(long j2) {
        this.activateAfterLongPress = j2;
        return this;
    }

    public final PanGestureHandler setActiveOffsetXEnd(float f2) {
        this.activeOffsetXEnd = f2;
        return this;
    }

    public final PanGestureHandler setActiveOffsetXStart(float f2) {
        this.activeOffsetXStart = f2;
        return this;
    }

    public final PanGestureHandler setActiveOffsetYEnd(float f2) {
        this.activeOffsetYEnd = f2;
        return this;
    }

    public final PanGestureHandler setActiveOffsetYStart(float f2) {
        this.activeOffsetYStart = f2;
        return this;
    }

    public final PanGestureHandler setAverageTouches(boolean z2) {
        this.averageTouches = z2;
        return this;
    }

    public final PanGestureHandler setFailOffsetXEnd(float f2) {
        this.failOffsetXEnd = f2;
        return this;
    }

    public final PanGestureHandler setFailOffsetXStart(float f2) {
        this.failOffsetXStart = f2;
        return this;
    }

    public final PanGestureHandler setFailOffsetYEnd(float f2) {
        this.failOffsetYEnd = f2;
        return this;
    }

    public final PanGestureHandler setFailOffsetYStart(float f2) {
        this.failOffsetYStart = f2;
        return this;
    }

    public final PanGestureHandler setMaxPointers(int i2) {
        this.maxPointers = i2;
        return this;
    }

    public final PanGestureHandler setMinDist(float f2) {
        this.minDistSq = f2 * f2;
        return this;
    }

    public final PanGestureHandler setMinPointers(int i2) {
        this.minPointers = i2;
        return this;
    }

    public final PanGestureHandler setMinVelocity(float f2) {
        this.minVelocitySq = f2 * f2;
        return this;
    }

    public final PanGestureHandler setMinVelocityX(float f2) {
        this.minVelocityX = f2;
        return this;
    }

    public final PanGestureHandler setMinVelocityY(float f2) {
        this.minVelocityY = f2;
        return this;
    }
}
