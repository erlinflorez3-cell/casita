package com.airbnb.android.react.lottie;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

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
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":4\u007f\u0007llA0ZeP\u008cZS@\u000fsڔ<$iGyّCU(}*\tUOog|Pb\u000bI\u0012\u000e\u0016\u0007k4I[ye\u0012\u001d;JoE4UoS9ht<\u0007(288\u0002\u0005\u0007$2H\u001e{\u0003CQ\u0018\u001a0NtBR\u0013N\u000b݆\u0012\u001c̄P\u0001L[(S<Hǰa:=#KwPV?_^\u0006}\u0011T^?\r%ld0\tIC!=_\u0013\tb[m\u0005OsM\u0005\u0017&U8\u0010x Df\u000e,\u0015Y^=a\u00016t\u0005\u007fiR,smq\\h\u000eV\u0007+\u007f\u001bL\u001c\u000e40x2;,~\b<F%vaTh\u0002\rUF\u007f*D%:\u00183YHKj_qS\u0019|@B\nU,1\u0017\u0007!\nc>d#+lw\u007f:\u0018E\u0006^\\!q=\u001c\u0013!f\u0010:\u001c0u\t_\u007f\u001fF/%et\u007f(iy\u0010b\\g%\u0014\u0011layjHn+5\u001b\u007f@\u0017'rD\u0013\u0014\u001cTbhD\u0011{%\u0005\u000b\f$+ \u000b\u0015\u0003&m&\\m\u0001i\u0019\\\u000e\u000e3N~7\b\f\u001c\u0012eYv3cr*\u0015*h\u00056W<\u0011\u0014\tjPc$Z\u000b1R6V\u000e(w*a\u0015\u0011[JM\u001644Z@Ib#m\u001b X@+/\u0010^v0\u0017TaEInl\u000b\u0017(h\\\u001f~\u0018|WT\u0015`PJqUC9>UP\nz\u0002k\u001d\r\u001d\u0018G\u0016[wPz@\u000eU*=F\u001eGqG=A0E.z\u0018;pdr\u0014`}\u00165'\u0015y=X\u00192u(\u0003pZ\u00021O\u0018l%O\u000f^!28j\u000e(yH\u0011F\u0012V;_Li\u000b\u0003\b]\u0015=E\u001b-M=\u0001\u001e1-9;s?\u001dD\u0015D3#\u0002ui\u001eO@gW<\u0003\u0017\u001c,\u0012% f_\u0010J;f|\n\u0003LB<l1c\u000fo@ P=L\raWqj~\fPO!.,h70\u001b\u0011n[h46\u0003|Fm`\fC,#\u000fI3HeU}l\u001cM\r\u000fX/\"\u000b*R5\u0017dU.\u000fob7?6y&oY=x\u0004j\u000bT8:\\ \u000bqu0\u000bX\u0013\u000e\u0001w\u000fEAryI\u0012&V\u000f[\u0005J5dS\u00019*/ U8f\u0011Cm\u001dmtc_i@>k\u001f\u001f\u001a\u0019Q/j3K\\Tg<n]I#S\u001c[I0E4M7-\u0004q\"7F~MF&;QQ?\u0001=5'!c%fd%!\u0017V\\cA~)?>@\u0018/#\u0019}\u00146gud\\;OCH\u0010GJ7K$~yEIS69;]ajBHB\\$G\f\t8 U\u0006Kլ/߉\u0012f\u0012܁k^$t.n\u0012\u000b#PN\u0006>L\u0005r8-6:\u0006F\nĀ\u0015Ȩ]u\b#F,9l\u001eDQn\u0007\u0011ʑp)"}, d2 = {"\u001ab^:\"(B`\u0016\bw((\u0006\b<o\u0004'EM\u0001\u0013\u0015V9\u0015F\u000649YG\u0007A|%2M\u001fDo<\u001a$lkBwg,`^#PHP,i6zH\u001bg", "", "u(E", " D0\u0010G&\u001c:tlh", "", "3w_<e;>R\n\u0003zp\n\u0007\u0012=t{1\u000bN", "", "5dc\u0012k7H`(~yO0|\u001b\ro\t6\u000b<\n&%\u0006k\u0017E\u000141h\u0002*@{", "5dc\u0012k7H`(~yO0|\u001b\ro\t6\u000b<\n&%", "u(;7T=:\u001d)\u000e~eud\u0005:;", "1qT.g,/W\u0019\u0011^g:\f\u00058c\u007f", "\u001ab^:\"(B`\u0016\bw(3\u0007\u0018>i\u007fqbJ\u0010&\u001bGK\u0017@~!D]\b)(q\u0016@#", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "5dc\u0012k7H`(~y<<\u000b\u00189m^,\t@~&vXo\u0017Ke9@Y[*@{%*VRI", "", ">`d@X", "", "DhTD", ">kPF", "AsP?g\rKO!~", "", "3mS\u0013e(FS", "@db2g", "@dbB`,", "Ad]145B[\u0015\u000e~h5]\u00053l\u00105{ \u0012\u0017 V", "3qa<e", "", "Ad]145B[\u0015\u000e~h5c\u0013+d\u007f'[Q\u0001 &", "Ad]1B5\u001a\\\u001d\u0007vm0\u0007\u0012\u0010i\t,\nC`(\u0017P~", "7r2.a*>Z ~y", "", "Adc\u000eh;H> z\u000f", "/tc<C3:g", "DhTD@(GO\u001b~\b", "\u001ab^:\"(B`\u0016\bw((\u0006\b<o\u0004'EM\u0001\u0013\u0015V9\u0015F\u000649YG\u0007A|%2M\u001fDo<\u001a$lkBwg,`a4QWN9kfZ9\u001d\u000e\\\u000e[\u0001", "Adc\u0010T*ASv\t\u0003i6\u000b\r>i\n1", "1`R5X\nH[$\t\tb;\u0001\u00138", "Adc\u0010b3H`y\u0003\u0002m,\n\u0017", "1n[<e\rBZ(~\bl", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "Adc\u0012a(;Z\u0019fzk.|s+t\u00036", "3mP/_,&S&\u0001zI(\f\f=", "Adc\u0012a(;Z\u0019lv_,d\u0013.e", "3mP/_,,O\u001a~bh+|", "Adc\u0015T9=e\u0015\fz:*z\t6e\r$\u000bD\u000b ", "6`a1j(KSt|x^3|\u0016+t\u00042\u0005\u001c\n\u0016$Qs\r", "Adc\u0016`(@St\r\t^;\u000bi9l~(\t", "7lP4X\bLa\u0019\u000e\t?6\u0004\b/r", "Adc\u0019b6I", ":n^=", "Adc\u001de6@`\u0019\r\t", ">q^4e,La", "", "Adc\u001fX5=S&f\u0005],", "@d]1X9&]\u0018~", "Adc\u001fX:Bh\u0019f\u0005],", "@db6m,&]\u0018~", "Adc b<KQ\u0019]\u0005m\u0013\u0007\u0018>i\u007f\u0018h$", "CqX", "Adc b<KQ\u0019c\th5", "8r^;", "Adc b<KQ\u0019gvf,", "<`\\2", "Adc b<KQ\u0019ngE", "Cq[ g9B\\\u001b", "Adc c,>R", "AoT2W", "", "Adc!X?M4\u001d\u0006\n^9\u000b", "BdgA90Eb\u0019\f\t", ":ncA\\,\u0006`\u0019zxms\u0006\u0005>i\u0011(uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class LottieAnimationViewManagerImpl {
    public static final LottieAnimationViewManagerImpl INSTANCE = new LottieAnimationViewManagerImpl();
    public static final String REACT_CLASS = "LottieAnimationView";

    private LottieAnimationViewManagerImpl() {
    }

    @JvmStatic
    public static final LottieAnimationView createViewInstance(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        return lottieAnimationView;
    }

    @JvmStatic
    public static final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> mapOf = MapBuilder.of(OnAnimationFinishEvent.EVENT_NAME, MapBuilder.of("registrationName", "onAnimationFinish"), OnAnimationFailureEvent.EVENT_NAME, MapBuilder.of("registrationName", "onAnimationFailure"), OnAnimationLoadedEvent.EVENT_NAME, MapBuilder.of("registrationName", "onAnimationLoaded"));
        Intrinsics.checkNotNullExpressionValue(mapOf, "of(...)");
        return mapOf;
    }

    public static final Map<String, Object> getExportedViewConstants() {
        Map<String, Object> mapBuild = MapBuilder.builder().put("VERSION", 1).build();
        Intrinsics.checkNotNullExpressionValue(mapBuild, "build(...)");
        return mapBuild;
    }

    @JvmStatic
    public static /* synthetic */ void getExportedViewConstants$annotations() {
    }

    @JvmStatic
    public static final void pause(final LottieAnimationView lottieAnimationView) throws Throwable {
        short sXd = (short) (FB.Xd() ^ 8301);
        short sXd2 = (short) (FB.Xd() ^ 26066);
        int[] iArr = new int["zH\\\u001f".length()];
        QB qb = new QB("zH\\\u001f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(lottieAnimationView, new String(iArr, 0, i2));
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Ig.wd("p$X\u0006\u001aoFgv\u0006jb7Ef5}", (short) (C1607wl.Xd() ^ 18444))).getDeclaredMethod(EO.Od("\u0001)ff\u0002g@}p\u0004~\u0016n", (short) (Od.Xd() ^ (-7035))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Runnable runnable = new Runnable() { // from class: com.airbnb.android.react.lottie.LottieAnimationViewManagerImpl$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    LottieAnimationViewManagerImpl.pause$lambda$3(lottieAnimationView);
                }
            };
            Class<?> cls = Class.forName(C1561oA.Qd("o{p}yrl5ux2Kcodkco", (short) (ZN.Xd() ^ 7291)));
            Class<?>[] clsArr = new Class[1];
            short sXd3 = (short) (C1580rY.Xd() ^ (-648));
            short sXd4 = (short) (C1580rY.Xd() ^ (-15159));
            int[] iArr2 = new int["80F2\u007f?5C=\u0005*NHI=?JD".length()];
            QB qb2 = new QB("80F2\u007f?5C=\u0005*NHI=?JD");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i3)) - sXd4);
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            Object[] objArr2 = {runnable};
            Method method = cls.getMethod(C1561oA.od("\u0017\u0015\u0018\u0018", (short) (C1499aX.Xd() ^ (-22909))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static final void pause$lambda$3(LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "$view");
        if (ViewCompat.isAttachedToWindow(view)) {
            view.pauseAnimation();
        }
    }

    @JvmStatic
    public static final void play(final LottieAnimationView lottieAnimationView, final int i2, final int i3) throws Throwable {
        Intrinsics.checkNotNullParameter(lottieAnimationView, C1561oA.Kd("$\u0018\u0015(", (short) (ZN.Xd() ^ 22386)));
        final boolean z2 = (i2 == -1 || i3 == -1) ? false : true;
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Wg.Zd("=\u001e'HXiwT){Iz1H\\d\u0005", (short) (C1607wl.Xd() ^ 4856), (short) (C1607wl.Xd() ^ 3046))).getDeclaredMethod(C1561oA.Xd("{z\u000bdy\u0003\tg\f\r\u000f\u0005\u0013", (short) (C1633zX.Xd() ^ (-31586))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Runnable runnable = new Runnable() { // from class: com.airbnb.android.react.lottie.LottieAnimationViewManagerImpl$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    LottieAnimationViewManagerImpl.play$lambda$1(z2, i2, i3, lottieAnimationView);
                }
            };
            Class<?> cls = Class.forName(Wg.vd("!-&33,*r'*g\u0001\u001d)\")5A", (short) (C1499aX.Xd() ^ (-9126))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (ZN.Xd() ^ 7704);
            short sXd2 = (short) (ZN.Xd() ^ 24180);
            int[] iArr = new int["\u0007|\u0011zF\u0004w\u0004{Ad\u0007~}ooxp".length()];
            QB qb = new QB("\u0007|\u0011zF\u0004w\u0004{Ad\u0007~}ooxp");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(((sXd + i4) + xuXd.CK(iKK)) - sXd2);
                i4++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i4));
            Object[] objArr2 = {runnable};
            Method method = cls.getMethod(hg.Vd("\" ##", (short) (FB.Xd() ^ 300), (short) (FB.Xd() ^ 4194)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static final void play$lambda$1(final boolean z2, int i2, int i3, final LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "$view");
        if (!z2) {
            LottieComposition composition = view.getComposition();
            Integer numValueOf = composition != null ? Integer.valueOf((int) composition.getStartFrame()) : null;
            LottieComposition composition2 = view.getComposition();
            Integer numValueOf2 = composition2 != null ? Integer.valueOf((int) composition2.getEndFrame()) : null;
            int minFrame = (int) view.getMinFrame();
            int maxFrame = (int) view.getMaxFrame();
            if (numValueOf != null && numValueOf2 != null && (minFrame != numValueOf.intValue() || maxFrame != numValueOf2.intValue())) {
                view.setMinAndMaxFrame(numValueOf.intValue(), numValueOf2.intValue());
            }
        } else if (i2 > i3) {
            view.setMinAndMaxFrame(i3, i2);
            if (view.getSpeed() > 0.0f) {
                view.reverseAnimationSpeed();
            }
        } else {
            view.setMinAndMaxFrame(i2, i3);
            if (view.getSpeed() < 0.0f) {
                view.reverseAnimationSpeed();
            }
        }
        if (!ViewCompat.isAttachedToWindow(view)) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.airbnb.android.react.lottie.LottieAnimationViewManagerImpl$play$1$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View v2) {
                    Intrinsics.checkNotNullParameter(v2, "v");
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) v2;
                    if (z2) {
                        view.playAnimation();
                    } else {
                        view.resumeAnimation();
                    }
                    lottieAnimationView.removeOnAttachStateChangeListener(this);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View v2) {
                    Intrinsics.checkNotNullParameter(v2, "v");
                    ((LottieAnimationView) v2).removeOnAttachStateChangeListener(this);
                }
            });
        } else if (z2) {
            view.playAnimation();
        } else {
            view.resumeAnimation();
        }
    }

    @JvmStatic
    public static final void reset(final LottieAnimationView lottieAnimationView) throws Throwable {
        Intrinsics.checkNotNullParameter(lottieAnimationView, C1561oA.ud("RD?P", (short) (Od.Xd() ^ (-9763))));
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.yd("\u000b\u0017\u0010\u001d\u001d\u0016\u0014\\\u0011\u0014Qn\u0015\u0014\u0018\f,", (short) (FB.Xd() ^ 20634))).getDeclaredMethod(C1561oA.Yd("WVf@U^dCghj`n", (short) (C1607wl.Xd() ^ 3389)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Runnable runnable = new Runnable() { // from class: com.airbnb.android.react.lottie.LottieAnimationViewManagerImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    LottieAnimationViewManagerImpl.reset$lambda$2(lottieAnimationView);
                }
            };
            Class<?> cls = Class.forName(Xg.qd("/=4CA<8\u0003EJ\u0006!;I@ICQ", (short) (C1580rY.Xd() ^ (-10595)), (short) (C1580rY.Xd() ^ (-21687))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (ZN.Xd() ^ 16051);
            short sXd2 = (short) (ZN.Xd() ^ 7604);
            int[] iArr = new int["./PE\u001efg~\u0004T\u000527A@K`e".length()];
            QB qb = new QB("./PE\u001efg~\u0004T\u000527A@K`e");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr2 = {runnable};
            short sXd3 = (short) (C1580rY.Xd() ^ (-30574));
            short sXd4 = (short) (C1580rY.Xd() ^ (-17120));
            int[] iArr2 = new int[",E1v".length()];
            QB qb2 = new QB(",E1v");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static final void reset$lambda$2(LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "$view");
        if (ViewCompat.isAttachedToWindow(view)) {
            view.cancelAnimation();
            view.setProgress(0.0f);
        }
    }

    @JvmStatic
    public static final void resume(final LottieAnimationView lottieAnimationView) throws Throwable {
        Intrinsics.checkNotNullParameter(lottieAnimationView, C1626yg.Ud("1Bx\u0014", (short) (C1607wl.Xd() ^ 11582), (short) (C1607wl.Xd() ^ 9537)));
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Ig.wd("I'h]Gs!x\u000fe \u001e\u0012\u0016\u0011f>", (short) (C1499aX.Xd() ^ (-14650)))).getDeclaredMethod(EO.Od("X)\u0006:.c\u0011\u0016\u001983N'", (short) (ZN.Xd() ^ 956)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            Runnable runnable = new Runnable() { // from class: com.airbnb.android.react.lottie.LottieAnimationViewManagerImpl$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    LottieAnimationViewManagerImpl.resume$lambda$4(lottieAnimationView);
                }
            };
            Class<?> cls = Class.forName(C1561oA.Qd("@LANJC=\u0006FI\u0003\u001c4@5<4@", (short) (ZN.Xd() ^ 16508)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (Od.Xd() ^ (-19471));
            short sXd2 = (short) (Od.Xd() ^ (-3164));
            int[] iArr = new int["!\u0019/\u001bh(\u001e,&m\u0013712&(3-".length()];
            QB qb = new QB("!\u0019/\u001bh(\u001e,&m\u0013712&(3-");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr2 = {runnable};
            Method method = cls.getMethod(C1561oA.od("wuxx", (short) (C1607wl.Xd() ^ 10399)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static final void resume$lambda$4(LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "$view");
        if (ViewCompat.isAttachedToWindow(view)) {
            view.resumeAnimation();
        }
    }

    @JvmStatic
    public static final void sendAnimationFailureEvent(LottieAnimationView view, Throwable error) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(error, "error");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new OnAnimationFailureEvent(themedReactContext.getSurfaceId(), view.getId(), error));
        }
    }

    @JvmStatic
    public static final void sendAnimationLoadedEvent(LottieAnimationView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new OnAnimationLoadedEvent(themedReactContext.getSurfaceId(), view.getId()));
        }
    }

    @JvmStatic
    public static final void sendOnAnimationFinishEvent(LottieAnimationView view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ThemedReactContext themedReactContext = (ThemedReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, view.getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new OnAnimationFinishEvent(themedReactContext.getSurfaceId(), view.getId(), z2));
        }
    }

    @JvmStatic
    public static final void setAutoPlay(boolean z2, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setAutoPlay(Boolean.valueOf(z2));
    }

    @JvmStatic
    public static final void setCacheComposition(LottieAnimationView view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setCacheComposition(z2);
    }

    @JvmStatic
    public static final void setColorFilters(ReadableArray readableArray, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setColorFilters(readableArray);
    }

    @JvmStatic
    public static final void setEnableMergePaths(boolean z2, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setEnableMergePaths(Boolean.valueOf(z2));
    }

    @JvmStatic
    public static final void setEnableSafeMode(boolean z2, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setEnableSafeMode(Boolean.valueOf(z2));
    }

    @JvmStatic
    public static final void setHardwareAcceleration(boolean z2, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setLayerType(z2 ? 2 : 1);
    }

    @JvmStatic
    public static final void setImageAssetsFolder(String str, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setImageAssetsFolder(str);
    }

    @JvmStatic
    public static final void setLoop(boolean z2, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setLoop(Boolean.valueOf(z2));
    }

    @JvmStatic
    public static final void setProgress(float f2, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setProgress(Float.valueOf(f2));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x001b  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void setRenderMode(java.lang.String r2, com.airbnb.android.react.lottie.LottieAnimationViewPropertyManager r3) {
        /*
            java.lang.String r0 = "viewManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r2 == 0) goto L1b
            int r1 = r2.hashCode()
            r0 = 165298699(0x9da420b, float:5.2543697E-33)
            if (r1 == r0) goto L38
            r0 = 899536360(0x359dd5e8, float:1.1759666E-6)
            if (r1 == r0) goto L2c
            r0 = 2101957031(0x7d4951a7, float:1.6724924E37)
            if (r1 == r0) goto L20
        L1b:
            r0 = 0
        L1c:
            r3.setRenderMode(r0)
            return
        L20:
            java.lang.String r0 = "SOFTWARE"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L29
            goto L1b
        L29:
            com.airbnb.lottie.RenderMode r0 = com.airbnb.lottie.RenderMode.SOFTWARE
            goto L1c
        L2c:
            java.lang.String r0 = "HARDWARE"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L35
            goto L1b
        L35:
            com.airbnb.lottie.RenderMode r0 = com.airbnb.lottie.RenderMode.HARDWARE
            goto L1c
        L38:
            java.lang.String r0 = "AUTOMATIC"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L41
            goto L1b
        L41:
            com.airbnb.lottie.RenderMode r0 = com.airbnb.lottie.RenderMode.AUTOMATIC
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.android.react.lottie.LottieAnimationViewManagerImpl.setRenderMode(java.lang.String, com.airbnb.android.react.lottie.LottieAnimationViewPropertyManager):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x001b  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void setResizeMode(java.lang.String r2, com.airbnb.android.react.lottie.LottieAnimationViewPropertyManager r3) {
        /*
            java.lang.String r0 = "viewManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r2 == 0) goto L1b
            int r1 = r2.hashCode()
            r0 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r1 == r0) goto L38
            r0 = 94852023(0x5a753b7, float:1.5735357E-35)
            if (r1 == r0) goto L2c
            r0 = 951526612(0x38b724d4, float:8.73298E-5)
            if (r1 == r0) goto L20
        L1b:
            r0 = 0
        L1c:
            r3.setScaleType(r0)
            return
        L20:
            java.lang.String r0 = "contain"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L29
            goto L1b
        L29:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            goto L1c
        L2c:
            java.lang.String r0 = "cover"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L35
            goto L1b
        L35:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            goto L1c
        L38:
            java.lang.String r0 = "center"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L41
            goto L1b
        L41:
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.android.react.lottie.LottieAnimationViewManagerImpl.setResizeMode(java.lang.String, com.airbnb.android.react.lottie.LottieAnimationViewPropertyManager):void");
    }

    @JvmStatic
    public static final void setSourceDotLottieURI(String str, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setSourceDotLottie(str);
        viewManager.commitChanges();
    }

    @JvmStatic
    public static final void setSourceJson(String str, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setAnimationJson(str);
        viewManager.commitChanges();
    }

    @JvmStatic
    public static final void setSourceName(String str, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        if (str != null && !StringsKt.contains$default((CharSequence) str, (CharSequence) ".", false, 2, (Object) null)) {
            str = str + ".json";
        }
        viewManager.setAnimationName(str);
        viewManager.commitChanges();
    }

    @JvmStatic
    public static final void setSourceURL(String str, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setAnimationURL(str);
        viewManager.commitChanges();
    }

    @JvmStatic
    public static final void setSpeed(double d2, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setSpeed(Float.valueOf((float) d2));
    }

    @JvmStatic
    public static final void setTextFilters(ReadableArray readableArray, LottieAnimationViewPropertyManager viewManager) {
        Intrinsics.checkNotNullParameter(viewManager, "viewManager");
        viewManager.setTextFilters(readableArray);
    }
}
