package com.braze.ui.inappmessage.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Qg;
import yg.Wg;
import yg.ZN;
import yg.hg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6B\u0005\"4\u0012\u000e\u0007nj?1Le^.Zݷ2\u000fy\u0002<$a%yCQU\"}(\nWN}gvϺb\u000bQ\u001b\u000e\u0016~m4Ikxe܈\u00172XoG3SoE9vt>\u0005&4(هy\u001bЏJ*v\u000f7\u007fIKë\u00160Np\u0003X\u001bN\u001d\u001a@\b\u0005%I8jjf6vn\u000e@='\u001bkXMUd`\u0003[\u0013^V=\f%fd0\tOC\u001c=S1\t\u0003_M\u000bWqk\u000e\u0019--*W}o6\u0007\u000bZ\u001asg\u001bi\u000b&\u000b\u0007\u0002d\u001a/CO\u0012T\u0001\u0014.v\t\u0006%<2\u0019L'\u0011K;'~\b<5%vaNh\u0002\rQ0\u0001o@/'\u00162YDakЂe;'^\u007f,\u0013\u001e6#/pQ_b x\u0015Ig(W?eX?^M8nmq\u0012\u0007z\u0002X\u000f`K\u000eF\u0014\u0011\\\"U;iQ;!\u001a\u0007\u000fI0\u000f\u0013y\u0001S\u0018TxF0\t.9@\b:uth\u0013\bhT\u0007IWRdj\u0015\u001c \u0013N^(@/=(N}m\u001an[|\"%]\u0007}^7\u0002\u001cxQ^a7\u0002g\u001eyjvBDlf\u0013b~B\u0002\u0017!ap8@j\u0003\u0010&}tR\u001a!J? +d0?#t\u0015v\u000edG\n\u0015\u0017\u0003rh>\u0001\u000572\u0011\u0002$#\u00181Vbo}q\u0011IZ\b''γEu"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWL\u0006)<gG\u0004@I!95CIy0 \u0015Ye9\u0019S;R}5\u001d", "", "u(E", "1k^@X\u0010G/$\nb^:\u000b\u00051ei1a@\u0015\u0015!Foj8t+", "", "@db2g\u0014>a'z|^\u0014x\u00161i\t6_Ai\u0017\u0015G}\u001c8\u00049", ";db@T.>D\u001d~\r", "\u001a`]1e6BRb\u0011~].|\u0018xT\u007f;\u000b1\u0005\u0017)\u001d", "6dP1X9/W\u0019\u0011", "Adc\u0011e(PO\u0016\u0006z<6\u0004\u0013<", "2qPDT)ES", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW\u001b\u0004!GUz'7C", "1n[<e", "", "Adc\u0011e(PO\u0016\u0006z<6\u0004\u0013<F\u0004/\u000b@\u000e", "Adc\u0013e(FSv\t\u0002h9", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q'\u0006\u0013(C9\u00158\u007f'~=\u0007/7o\u0016;#\u0007,", "Adc\u0016V6G", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7b^;", "", "7b^;66E]&", "7b^;5(<Y\u001b\f\u0005n5{f9l\n5", "BdgAI0>e", "Adc\u0016`(@S", "0hc:T7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "7lP4X\u001dBS+", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@q\u001b\u0017YE", "Adc!X?M/ \u0003|g4|\u0012>", "BdgA43BU\"", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn$Y\u0011/\u0013t\u001a0V\u0019", "Adc!X?MD\u001d~\r<6\u0004\u0013<", "Adc#\\,P0\u0015|\u0001`9\u0007\u00198d]2\u0003J\u000e", "Adc#\\,P0\u0015|\u0001`9\u0007\u00198d]2\u0003J\u000ew\u001bN~\u000eI", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class InAppMessageViewUtils {
    public static final InAppMessageViewUtils INSTANCE = new InAppMessageViewUtils();

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.InAppMessageViewUtils$closeInAppMessageOnKeycodeBack$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<String> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Back button intercepted by in-app message view, closing in-app message.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.InAppMessageViewUtils$setDrawableColor$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10831 extends Lambda implements Function0<String> {
        public static final C10831 INSTANCE = ;

        C10831() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "LayerDrawable for button background did not have the expected number of layers or the 0th layer was not a GradientDrawable.";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.utils.InAppMessageViewUtils$setIcon$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10841 extends Lambda implements Function0<String> {
        public static final C10841 INSTANCE = ;

        C10841() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Caught exception setting icon typeface. Not rendering icon.";
        }
    }

    private InAppMessageViewUtils() {
    }

    @JvmStatic
    public static final void closeInAppMessageOnKeycodeBack() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) AnonymousClass1.INSTANCE, 7, (Object) null);
        BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    @JvmStatic
    public static final void resetMessageMarginsIfNecessary(TextView textView, TextView textView2) {
        if (textView2 != null || textView == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(textView.getLayoutParams().width, textView.getLayoutParams().height);
        layoutParams.setMargins(0, 0, 0, 0);
        textView.setLayoutParams(layoutParams);
    }

    @JvmStatic
    public static final void setDrawableColor(Drawable drawable, int i2) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() <= 0 || !(layerDrawable.getDrawable(0) instanceof GradientDrawable)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C10831.INSTANCE, 7, (Object) null);
            } else {
                Drawable drawable2 = layerDrawable.getDrawable(0);
                Intrinsics.checkNotNullExpressionValue(drawable2, "drawable.getDrawable(0)");
                setDrawableColor(drawable2, i2);
            }
        }
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i2);
        } else {
            INSTANCE.setDrawableColorFilter(drawable, i2);
        }
    }

    private final void setDrawableColorFilter(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            drawable.setColorFilter(new BlendModeColorFilter(i2, BlendMode.SRC_ATOP));
        } else {
            drawable.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
        }
    }

    @JvmStatic
    public static final void setFrameColor(View view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (num != null) {
            view.setBackgroundColor(num.intValue());
        }
    }

    @JvmStatic
    public static final void setIcon(Context context, String str, int i2, int i3, TextView textView) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.Kd("\u0007\u0014\u0014\u001b\r!\u001e", (short) (OY.Xd() ^ 28142)));
        Intrinsics.checkNotNullParameter(textView, Wg.Zd("w\u0017br\r<p\u0017", (short) (ZN.Xd() ^ 31488), (short) (ZN.Xd() ^ 2408)));
        if (str != null) {
            try {
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.Xd("y\b~\u000e\f\u0007\u0003M\u0004\u0011\u0011\u0018\n\u0014\u001bUk\u0019\u0019 \u0012&#", (short) (C1499aX.Xd() ^ (-13666)))).getMethod(Wg.vd("\"\u001f1|*)\u001e,&", (short) (C1499aX.Xd() ^ (-8130))), new Class[0]);
                try {
                    method.setAccessible(true);
                    textView.setTypeface(Typeface.createFromAsset((AssetManager) method.invoke(context, objArr), Qg.kd("t|z\u007fk\u0001mzuri0yfbemkp)nm^", (short) (OY.Xd() ^ 20186), (short) (OY.Xd() ^ 11626))));
                    textView.setText(str);
                    setTextViewColor(textView, i2);
                    if (textView.getBackground() == null) {
                        setViewBackgroundColor(textView, i3);
                        return;
                    }
                    Drawable background = textView.getBackground();
                    Intrinsics.checkNotNullExpressionValue(background, hg.Vd("7'94\u0015'\"3h\u001c\u001a\u001b\"\u001d'#( \u0015", (short) (C1633zX.Xd() ^ (-28718)), (short) (C1633zX.Xd() ^ (-19488))));
                    setDrawableColor(background, i3);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (Exception e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) C10841.INSTANCE, 4, (Object) null);
            }
        }
    }

    @JvmStatic
    public static final void setImage(Bitmap bitmap, ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    @JvmStatic
    public static final void setTextAlignment(TextView textView, TextAlign textAlign) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(textAlign, "textAlign");
        if (textAlign == TextAlign.START) {
            textView.setGravity(GravityCompat.START);
        } else if (textAlign == TextAlign.END) {
            textView.setGravity(GravityCompat.END);
        } else if (textAlign == TextAlign.CENTER) {
            textView.setGravity(17);
        }
    }

    @JvmStatic
    public static final void setTextViewColor(TextView textView, int i2) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        textView.setTextColor(i2);
    }

    @JvmStatic
    public static final void setViewBackgroundColor(View view, int i2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackgroundColor(i2);
    }

    @JvmStatic
    public static final void setViewBackgroundColorFilter(View view, int i2) {
        Intrinsics.checkNotNullParameter(view, "view");
        InAppMessageViewUtils inAppMessageViewUtils = INSTANCE;
        Drawable background = view.getBackground();
        Intrinsics.checkNotNullExpressionValue(background, "view.background");
        inAppMessageViewUtils.setDrawableColorFilter(background, i2);
        view.getBackground().setAlpha(Color.alpha(i2));
    }
}
