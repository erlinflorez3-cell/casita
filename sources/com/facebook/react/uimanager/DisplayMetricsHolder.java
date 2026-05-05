package com.facebook.react.uimanager;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007f\u0007llA0ZeP\u008cZS8\u0013s{:'c$\u007fCC٥\"}8\tWNmitсZ!¼?\u0006Dw+1OUޯa\u0012\u001d2\u000b}M;eokB\u0011xD\u000f82PC@\nI08T(v)L{\u0010 =XphV=Q\u0013$*\u0006l+G\u001e%m\\D`l\f>u(KoP]?_^\u0001\u0014\u0012\u000fb5\u001d\u000faL<p;C'=S1\u001a\u0019`\b\u0011M\u0006U\u0005\u00178W/W\u0006o6\u0007\u0013Z\u001as_\u001br\u000b&\u000b\u0016\u0002f\u001a4CQyJ~\u0012n|C\f\u001bR\u001c\u000e48x4;'~\n$2#v\u001aE!\u000elC\u0018z\u00108mӞRĴ/9#Ƙ\"yI\u001cf9\u0012\u0004;\"Y\u0001-!2ٮ\u001a\u05ce\u0019!\\ȭa3WEKH\u001f\"gC\u0006\u0006\u0007a0.:0\u0006\u007f\u0006ɉ\u001dѧ\u001b+?كI%'r\u0010Hלk\u000e"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u0014]\f+>i*\u0016MRHo2,wrh8\u0007p\u0002", "", "u(E", "\u0017M8!<\b%7\u000eZiB\u0016e\u0003\u0017Im\u0016_)b\u0011~']{\u0018X\u0005", "", "Aba2X5\u001dW'\n\u0002Z@d\t>r\u0004&\n", "\u001a`]1e6BRb\u000f\nb3Fg3s\u000b/wTh\u0017&Ts\fJL", "5dc V9>S\"]~l7\u0004\u0005CM\u007f7\tD~%UCx\u0017F\u0006!D]\b)E", "Eh]1b>\u001dW'\n\u0002Z@d\t>r\u0004&\n", "5dc$\\5=]+]~l7\u0004\u0005CM\u007f7\tD~%UCx\u0017F\u0006!D]\b)E", "5dc\u0011\\:IZ\u0015\u0013b^;\n\r-sq5\u007fO|\u0014\u001eGW\nG", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7U\u00129#", "4n]AF*:Z\u0019", "", "5dc\u001d[@LW\u0017z\u0002I0\u0010\t6sq5\u007fO|\u0014\u001eGW\nG", "2hb=_(R;\u0019\u000e\bb*\u000b", "5dc V9>S\"]~l7\u0004\u0005CM\u007f7\tD~%", "5dc$\\5=]+]~l7\u0004\u0005CM\u007f7\tD~%", "7mXA70L^ z\u000fF,\f\u00163c\u000e", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7mXA70L^ z\u000fF,\f\u00163c\u000e\f|)\u000b&zPs\u001d@r,9n}\u001f", "Adc V9>S\"]~l7\u0004\u0005CM\u007f7\tD~%", "Adc$\\5=]+]~l7\u0004\u0005CM\u007f7\tD~%", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DisplayMetricsHolder {
    private static final String INITIALIZATION_MISSING_MESSAGE = "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics";
    public static final DisplayMetricsHolder INSTANCE = new DisplayMetricsHolder();
    private static DisplayMetrics screenDisplayMetrics = null;
    private static DisplayMetrics windowDisplayMetrics = null;

    private DisplayMetricsHolder() {
    }

    @JvmStatic
    public static final WritableMap getDisplayMetricsWritableMap(double d2) {
        DisplayMetricsHolder displayMetricsHolder = INSTANCE;
        if (windowDisplayMetrics == null) {
            throw new IllegalStateException(INITIALIZATION_MISSING_MESSAGE.toString());
        }
        if (screenDisplayMetrics == null) {
            throw new IllegalStateException(INITIALIZATION_MISSING_MESSAGE.toString());
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        DisplayMetrics displayMetrics = windowDisplayMetrics;
        Intrinsics.checkNotNull(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        writableNativeMap.putMap("windowPhysicalPixels", displayMetricsHolder.getPhysicalPixelsWritableMap(displayMetrics, d2));
        DisplayMetrics displayMetrics2 = screenDisplayMetrics;
        Intrinsics.checkNotNull(displayMetrics2, "null cannot be cast to non-null type android.util.DisplayMetrics");
        writableNativeMap.putMap("screenPhysicalPixels", displayMetricsHolder.getPhysicalPixelsWritableMap(displayMetrics2, d2));
        return writableNativeMap;
    }

    private final WritableMap getPhysicalPixelsWritableMap(DisplayMetrics displayMetrics, double d2) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", displayMetrics.widthPixels);
        writableNativeMap.putInt("height", displayMetrics.heightPixels);
        writableNativeMap.putDouble("scale", displayMetrics.density);
        writableNativeMap.putDouble("fontScale", d2);
        writableNativeMap.putDouble("densityDpi", displayMetrics.densityDpi);
        return writableNativeMap;
    }

    @JvmStatic
    public static final DisplayMetrics getScreenDisplayMetrics() {
        DisplayMetrics displayMetrics = screenDisplayMetrics;
        if (displayMetrics == null) {
            throw new IllegalStateException(INITIALIZATION_MISSING_MESSAGE.toString());
        }
        Intrinsics.checkNotNull(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        return displayMetrics;
    }

    @JvmStatic
    private static /* synthetic */ void getScreenDisplayMetrics$annotations() {
    }

    @JvmStatic
    public static final DisplayMetrics getWindowDisplayMetrics() {
        DisplayMetrics displayMetrics = windowDisplayMetrics;
        if (displayMetrics == null) {
            throw new IllegalStateException(INITIALIZATION_MISSING_MESSAGE.toString());
        }
        Intrinsics.checkNotNull(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        return displayMetrics;
    }

    @JvmStatic
    private static /* synthetic */ void getWindowDisplayMetrics$annotations() {
    }

    @JvmStatic
    public static final void initDisplayMetrics(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1593ug.zd("\u0004\u0011\u0011\u0018\n\u001e\u001b", (short) (ZN.Xd() ^ 28839), (short) (ZN.Xd() ^ 7959)));
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od("\u001b'\u001c)%\u001e\u0018`\u0015 \u001e#\u0013\u001b Xl\u0018\u0016\u001b\u000b\u001d\u0018", (short) (C1580rY.Xd() ^ (-19326)))).getMethod(C1561oA.Kd("?>N-APMTRDGV", (short) (C1499aX.Xd() ^ (-2080))), new Class[0]);
        try {
            method.setAccessible(true);
            DisplayMetrics displayMetrics = ((Resources) method.invoke(context, objArr)).getDisplayMetrics();
            windowDisplayMetrics = displayMetrics;
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            displayMetrics2.setTo(displayMetrics);
            String strZd = Wg.Zd("3f#\u0007I@", (short) (OY.Xd() ^ 23920), (short) (OY.Xd() ^ 28653));
            short sXd = (short) (Od.Xd() ^ (-16430));
            int[] iArr = new int["@NETRMI\u0014JWW^PZa\u001c2__fXli".length()];
            QB qb = new QB("@NETRMI\u0014JWW^PZa\u001c2__fXli");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            Object[] objArr2 = {strZd};
            Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(Qg.kd("/,:\u0018=66&-\u0012#/2$\u001d\u001e", (short) (C1633zX.Xd() ^ (-26057)), (short) (C1633zX.Xd() ^ (-24572))), Class.forName(Wg.vd("\u001b\u0013)\u0015Z\u001a\u0010\u001e g\u000e0'\u001f%\u001f", (short) (C1633zX.Xd() ^ (-5472)))));
            try {
                method2.setAccessible(true);
                Object objInvoke = method2.invoke(context, objArr2);
                Intrinsics.checkNotNull(objInvoke, hg.Vd("CI?>p30<;;?i+-f)&77a5/^,,*g(.$#U)-#\u0017P\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u001e\u0010\u000b\u001cQy\u000b\u000f\u0004\u000e\u0015i|\tz\u007f|\t", (short) (C1499aX.Xd() ^ (-28120)), (short) (C1499aX.Xd() ^ (-27818))));
                ((WindowManager) objInvoke).getDefaultDisplay().getRealMetrics(displayMetrics2);
                screenDisplayMetrics = displayMetrics2;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @JvmStatic
    public static final void initDisplayMetricsIfNotInitialized(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        if (screenDisplayMetrics != null) {
            return;
        }
        initDisplayMetrics(context);
    }

    @JvmStatic
    public static final void setScreenDisplayMetrics(DisplayMetrics displayMetrics) {
        screenDisplayMetrics = displayMetrics;
    }

    @JvmStatic
    public static final void setWindowDisplayMetrics(DisplayMetrics displayMetrics) {
        windowDisplayMetrics = displayMetrics;
    }
}
