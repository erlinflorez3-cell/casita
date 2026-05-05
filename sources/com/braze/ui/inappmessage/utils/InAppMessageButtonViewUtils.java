package com.braze.ui.inappmessage.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.Button;
import com.braze.models.inappmessage.MessageButton;
import com.braze.ui.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`Y2\u000fq{<$i-yCAV\"}0\tWȞog\u0005Jb\u000bI\u0010\u000e\u0016\u0007\t4Ikxe\u0012\u00152HŪ?Iݹ =g_5;\u000b ݨ&8\b\u0005IH8I(v)E{\u0010 3XphV=Q\u0013\u001f*\u0006l&1\"jnf6vt\u000e>=,\u001bipVWc>\u0007e\rt_m\u0012?w,7X7c\u0017UW\u0011\nj[m\u0007ouK\u0012\u0001'U3\u0010x \\f\u000e,\u0015Y^=a\u00016t\u0005\u007fq<+9T{K~\u0014X{\t\u000e%<2\u00166+V7E\u001a\u0015\u0010T8=\u0015aSh\u0002\rQ0\u0005oJ/+\u00105;9I|\u007fvk#\\N\u0014\u000b\u001d 3\u0001\u001d'\niTeڦ\u001fl"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWL\u0006)<gG\u0004@I!95CIy0 \u0015EqH\u0016m5?z'Y<]0c`H", "", "u(E", "5dc\u000fh;M]\"]\bZ>x\u00066e", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW\u001b\u0004!GUz'7C", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ";db@T.>0)\u000e\nh5", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~A}.Ei\u0018.*SJz>'j", "<df g9HY\u0019p~];\u007f", "", "Asa<^,\u001f]\u0017\u000f\t^+n\r.t\u0003", "7r5<V<LS\u0018", "", "5dc\u0011e(PO\u0016\u0006z", "2qPDT)ES|}", "Adc\u000fh;M]\"", "", "0tcAb5", "\u001a`]1e6BRb\u0011~].|\u0018xB\u00107\u000bJ\nl", "Asa<^,0W\u0018\u000e}", "Adc\u000fh;M]\"\r", "0tcAb5/W\u0019\u0011\t", "", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", ";db@T.>0)\u000e\nh5\u000b", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class InAppMessageButtonViewUtils {
    public static final InAppMessageButtonViewUtils INSTANCE = new InAppMessageButtonViewUtils();

    private InAppMessageButtonViewUtils() {
    }

    @JvmStatic
    public static final Drawable getButtonDrawable(Context context, MessageButton messageButton, int i2, int i3, boolean z2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(messageButton, "messageButton");
        Drawable drawable = getDrawable(context, R.drawable.com_braze_inappmessage_button_background);
        drawable.mutate();
        Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.RippleDrawable");
        Drawable drawableFindDrawableByLayerId = ((RippleDrawable) drawable).findDrawableByLayerId(R.id.com_braze_inappmessage_button_background_ripple_internal_gradient);
        Intrinsics.checkNotNull(drawableFindDrawableByLayerId, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) drawableFindDrawableByLayerId;
        if (z2) {
            i2 = i3;
        }
        gradientDrawable.setStroke(i2, messageButton.getBorderColor());
        gradientDrawable.setColor(messageButton.getBackgroundColor());
        return drawable;
    }

    @JvmStatic
    public static final Drawable getDrawable(Context context, int i2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.Yd("(55<.B?", (short) (C1499aX.Xd() ^ (-17381))));
        short sXd = (short) (FB.Xd() ^ 20312);
        short sXd2 = (short) (FB.Xd() ^ 9648);
        int[] iArr = new int["t\u0003y\t\u0007\u0002}H~\f\f\u0013\u0005\u000f\u0016Pf\u0014\u0014\u001b\r!\u001e".length()];
        QB qb = new QB("t\u0003y\t\u0007\u0002}H~\f\f\u0013\u0005\u000f\u0016Pf\u0014\u0014\u001b\r!\u001e");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd3 = (short) (C1499aX.Xd() ^ (-17068));
        short sXd4 = (short) (C1499aX.Xd() ^ (-11385));
        int[] iArr2 = new int["k\u0018L^\u000eas(Zo6Q".length()];
        QB qb2 = new QB("k\u0018L^\u000eas(Zo6Q");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((i4 * sXd4) ^ sXd3));
            i4++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            Drawable drawable = ((Resources) method.invoke(context, objArr)).getDrawable(i2, null);
            Intrinsics.checkNotNullExpressionValue(drawable, ZO.xd("\u0001`D'o]+;H?@Z\u0017\u007fn)MFe!,C3*^\u001a\u0017H[S<kt2_\f9Q47\u001d_\\u~`\u000b", (short) (C1633zX.Xd() ^ (-21275)), (short) (C1633zX.Xd() ^ (-8266))));
            return drawable;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @JvmStatic
    public static final void setButton(Button button, MessageButton messageButton, int i2, int i3) throws Throwable {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(messageButton, "messageButton");
        button.setText(messageButton.getText());
        button.setContentDescription(messageButton.getText());
        InAppMessageViewUtils.setTextViewColor(button, messageButton.getTextColor());
        StateListDrawable stateListDrawable = new StateListDrawable();
        button.setStateListAnimator(null);
        Context context = button.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "button.context");
        Drawable buttonDrawable = getButtonDrawable(context, messageButton, i2, i3, false);
        Context context2 = button.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "button.context");
        stateListDrawable.addState(new int[]{android.R.attr.state_focused}, getButtonDrawable(context2, messageButton, i2, i3, true));
        stateListDrawable.addState(new int[]{android.R.attr.state_enabled}, buttonDrawable);
        button.setBackground(stateListDrawable);
    }

    @JvmStatic
    public static final void setButtons(List<? extends View> list, List<? extends MessageButton> list2) throws Throwable {
        Intrinsics.checkNotNullParameter(list, C1626yg.Ud("HgaQpwavpf\u001d", (short) (C1580rY.Xd() ^ (-6251)), (short) (C1580rY.Xd() ^ (-16994))));
        short sXd = (short) (C1499aX.Xd() ^ (-11526));
        int[] iArr = new int["\u00199\u0004*mN&YYj\u0013e\u0015&".length()];
        QB qb = new QB("\u00199\u0004*mN&YYj\u0013e\u0015&");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Intrinsics.checkNotNullParameter(list2, new String(iArr, 0, i2));
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            MessageButton messageButton = list2.get(i3);
            Context context = view.getContext();
            Object[] objArr = new Object[0];
            Method method = Class.forName(EO.Od("Bv`TK\u0013\u0018\u001b{\n\tj\u000b\u0010\f%o4\\\u0019E\u0016\u001e", (short) (OY.Xd() ^ 27757))).getMethod(C1561oA.Qd("'$2\u000f!.).*\u001a\u001b(", (short) (ZN.Xd() ^ 16151)), new Class[0]);
            try {
                method.setAccessible(true);
                int dimensionPixelSize = ((Resources) method.invoke(context, objArr)).getDimensionPixelSize(R.dimen.com_braze_inappmessage_button_border_stroke);
                Context context2 = view.getContext();
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1593ug.zd("4B9HFA=\b>KKRDNU\u0010&SSZL`]", (short) (OY.Xd() ^ 26427), (short) (OY.Xd() ^ 25518))).getMethod(C1561oA.od("~{\nfx\u0006\u0001\u0006\u0002qr\u007f", (short) (Od.Xd() ^ (-7907))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    int dimensionPixelSize2 = ((Resources) method2.invoke(context2, objArr2)).getDimensionPixelSize(R.dimen.com_braze_inappmessage_button_border_stroke_focused);
                    if (list2.size() <= i3) {
                        view.setVisibility(8);
                    } else if (view instanceof Button) {
                        setButton((Button) view, messageButton, dimensionPixelSize, dimensionPixelSize2);
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }
}
