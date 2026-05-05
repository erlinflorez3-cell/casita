package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.utils.InAppMessageButtonViewUtils;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.Jg;
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
@Metadata(bv = {}, d1 = {"Яh\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0Le^.ZS0\u0010s{J$c$wFCU(\u0007*ޛWN}gvϺb\u000bQ-\u000eǝ\u0001j:O]xc\u0013\u00172PoG3StE9vt>\u0005&3*8\b\u0011\t\u001a0H\u0018v\u0011CS\f\u00181F\u0015Pĥ=M3\u0019B\u0006l A5lm\\7`ns9]%\u0013oPQ?aF{{\u0011ТX'\u001b{*,9PO5C6\u0004\u0007\u0015ds?1R8QM|5;CO\u0004YFX.\u001bC@\u007f\u0011k\t>\\3h'0oA]{cP<9(~\n&T\u0004<\u001dWL<?2f6!y\t;aNj\u001a^p\u001b+eD3=\u007fa<\u007f//_oX1Ne\u00175\u0011,A\u0019nOr\u001b\")%)s\u0010Q_lpCVn\"[Sl2w)\u0016r\u0018>h\u0018/*,^!3Ys?3#{\u0002vg\u0016\fKt1awv`@P\nF;8'$Zr{K\u007f\u0019bfQ)MJo7\u0002\u001698\\&cg9X\\]\u0011\u0002j{x:)=\u0010OY\u001d\u0016Tk\u0002lA`ic>|\u0003z\"]Tb3o-V\u001c\u001ah\t@\"`c\u001b\u0014\u0006\u0012\\N:*xSB.B2I\u001br\u0014v\ntպCҴ\rcrj\u0016\u0007b<t\u0015w.\r\u000b\u0017O\u000b{Fφzͅ0\u0001x$3M_Bi8c0\u00016\u0013\"5\nJùIѨPKdn\u001c\u0005c\t¶\u001aG"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004@I!95CIy0 \u0015LiA\u0007p:R\b'$H\\,MVrOi", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004@I!95CIy0 \u0015E]G\u0007T0N\t|", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004\u001bvq9X+;yB\u001a\u0017hEA\u000fc9\\z8G=R,n(", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/sc?f", "\u001a`]1e6BRb\u000f\nb3Fd>t\r,xP\u0010\u0017\u0005G~c", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001}%2T\r\u0017zC+\u0019eqH\u0007Q,]Lj8", "4qP:X\u001dBS+", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5dc\u0013e(FS\n\u0003zp", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", ";db@T.>6\u0019zy^9k\tBtp,{R", "\u001a`]1e6BRb\u0011~].|\u0018xT\u007f;\u000b1\u0005\u0017)\u001d", "5dc\u001aX:LO\u001b~]^({\t<T\u007f;\u000b1\u0005\u0017)", "u(;.a+K]\u001d}Dp0{\u000b/tI\u0017{S\u0010\b\u001bG\u0002c", ";db@T.>B\u0019\u0012\nO0|\u001b", "5dc\u001aX:LO\u001b~i^?\fy3e\u0012", "2hb=T;<V~~\u000f>=|\u0012>", "", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fn/y_9{I\u0010l", "5dc\u001aX:LO\u001b~Wn;\f\u00138V\u0004(\u000eN", "", "<t\\\u000fh;M]\"\r", "", "=m:2l\u000bHe\"", "9dh\u0010b+>", "@db2g\u0014>a'z|^\u0014x\u00161i\t6", "", "7lP4X\u0019>b&\u0003zo(\u0004v?c}(\nN\u0002'\u001e", "Adc\u0013e(FSv\t\u0002h9", "1n[<e", "Adc\u0019T9@S&\\\u0002h:|e?t\u000f2\u0005\u001e\b\u001b\u0015MK\u001b<r", "1k^@X\tNb(\t\u0004O0|\u001b", "Adc\u001aX:LO\u001b~Wn;\f\u00138s", ";db@T.>0)\u000e\nh5\u000b", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~A}.Ei\u0018.*SJz>'j", "Adc\u001aX:LO\u001b~Xe6\u000b\t\fu\u000f7\u0006I^!\u001eQ|", "Adc\u001aX:LO\u001b~]^({\t<T\u007f;\u000b", "BdgA", "", "Adc\u001aX:LO\u001b~]^({\t<T\u007f;\u000b\u001c\b\u001b\u0019Pw\u000eE\u0006", "BdgA43BU\"", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn$Y\u0011/\u0013t\u001a0V\u0019", "Adc\u001aX:LO\u001b~]^({\t<T\u007f;\u000b\u001e\u000b\u001e!T", "AdcBc\u000bB`\u0019|\nb6\u0006\u00056N{9\u007fB|&\u001bQx", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class InAppMessageImmersiveBaseView extends InAppMessageBaseView implements IInAppMessageImmersiveView {
    public InAppMessageImmersiveBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setLargerCloseButtonClickArea$lambda$5(View view, InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView, ViewParent viewParent) throws Throwable {
        Intrinsics.checkNotNullParameter(inAppMessageImmersiveBaseView, C1561oA.yd("SFJS\u0007\u0012", (short) (Od.Xd() ^ (-15772))));
        Rect rect = new Rect();
        view.getHitRect(rect);
        Context context = inAppMessageImmersiveBaseView.getContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("}\f\u0003\u0012\u0010\u000b\u0007Q\b\u0015\u0015\u001c\u000e\u0018\u001fYo\u001d\u001d$\u0016*'", (short) (C1580rY.Xd() ^ (-27136)))).getMethod(Xg.qd("ihxWkzw~|nq\u0001", (short) (C1633zX.Xd() ^ (-4780)), (short) (C1633zX.Xd() ^ (-26292))), new Class[0]);
        try {
            method.setAccessible(true);
            int dimensionPixelSize = ((Resources) method.invoke(context, objArr)).getDimensionPixelSize(R.dimen.com_braze_inappmessage_close_button_click_area_width);
            Context context2 = inAppMessageImmersiveBaseView.getContext();
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Jg.Wd("PjE\u001c\b'j#|\u0012<\tb\u0018%\b\n<$7OIQ", (short) (C1607wl.Xd() ^ 15691), (short) (C1607wl.Xd() ^ 27264))).getMethod(ZO.xd("[<\u0003\u0015O\u0012a\u001eH\u0003c(", (short) (C1607wl.Xd() ^ 25822), (short) (C1607wl.Xd() ^ 10489)), new Class[0]);
            try {
                method2.setAccessible(true);
                int dimensionPixelSize2 = ((Resources) method2.invoke(context2, objArr2)).getDimensionPixelSize(R.dimen.com_braze_inappmessage_close_button_click_area_height);
                int iWidth = (dimensionPixelSize - rect.width()) / 2;
                int iHeight = (dimensionPixelSize2 - rect.height()) / 2;
                rect.top -= iHeight;
                rect.bottom += iHeight;
                rect.left -= iWidth;
                rect.right += iWidth;
                ((View) viewParent).setTouchDelegate(new TouchDelegate(rect, view));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (isInTouchMode() || event.getKeyCode() != 4 || !BrazeInAppMessageManager.Companion.getInstance().getDoesBackButtonDismissInAppMessageView()) {
            return super.dispatchKeyEvent(event);
        }
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        return true;
    }

    public abstract View getFrameView();

    public abstract List<View> getMessageButtonViews(int i2);

    public abstract TextView getMessageHeaderTextView();

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public abstract TextView getMessageTextView();

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i2 != 4 || !BrazeInAppMessageManager.Companion.getInstance().getDoesBackButtonDismissInAppMessageView()) {
            return super.onKeyDown(i2, event);
        }
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        return true;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean z2) {
        super.resetMessageMargins(z2);
        TextView messageTextView = getMessageTextView();
        if (StringsKt.isBlank(String.valueOf(messageTextView != null ? messageTextView.getText() : null))) {
            ViewUtils.removeViewFromParent(getMessageTextView());
        }
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (StringsKt.isBlank(String.valueOf(messageHeaderTextView != null ? messageHeaderTextView.getText() : null))) {
            ViewUtils.removeViewFromParent(getMessageHeaderTextView());
        }
        InAppMessageViewUtils.resetMessageMarginsIfNecessary(getMessageTextView(), getMessageHeaderTextView());
    }

    public void setFrameColor(int i2) {
        View frameView = getFrameView();
        if (frameView != null) {
            InAppMessageViewUtils.setFrameColor(frameView, Integer.valueOf(i2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLargerCloseButtonClickArea(final View view) {
        if (view == null || view.getParent() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView.setLargerCloseButtonClickArea.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Cannot increase click area for view if view and/or parent are null.";
                }
            }, 6, (Object) null);
            return;
        }
        final ViewParent parent = view.getParent();
        if (parent instanceof View) {
            ((View) parent).post(new Runnable() { // from class: com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    InAppMessageImmersiveBaseView.setLargerCloseButtonClickArea$lambda$5(view, this, parent);
                }
            });
        }
    }

    public void setMessageButtons(List<? extends MessageButton> messageButtons) throws Throwable {
        Intrinsics.checkNotNullParameter(messageButtons, "messageButtons");
        InAppMessageButtonViewUtils.setButtons(getMessageButtonViews(messageButtons.size()), messageButtons);
    }

    public void setMessageCloseButtonColor(int i2) {
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView != null) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageCloseButtonView, i2);
        }
    }

    public void setMessageHeaderText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView == null) {
            return;
        }
        messageHeaderTextView.setText(text);
    }

    public void setMessageHeaderTextAlignment(TextAlign textAlign) {
        Intrinsics.checkNotNullParameter(textAlign, "textAlign");
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            InAppMessageViewUtils.setTextAlignment(messageHeaderTextView, textAlign);
        }
    }

    public void setMessageHeaderTextColor(int i2) {
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            InAppMessageViewUtils.setTextViewColor(messageHeaderTextView, i2);
        }
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public void setupDirectionalNavigation(final int i2) {
        List<View> messageButtonViews = getMessageButtonViews(i2);
        final View messageCloseButtonView = getMessageCloseButtonView();
        Integer numValueOf = messageCloseButtonView != null ? Integer.valueOf(messageCloseButtonView.getId()) : null;
        if (numValueOf == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView.setupDirectionalNavigation.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "closeButtonId is null. Cannot continue setting up navigation.";
                }
            }, 6, (Object) null);
            return;
        }
        if (i2 == 0) {
            messageCloseButtonView.setNextFocusUpId(numValueOf.intValue());
            messageCloseButtonView.setNextFocusDownId(numValueOf.intValue());
            messageCloseButtonView.setNextFocusRightId(numValueOf.intValue());
            messageCloseButtonView.setNextFocusLeftId(numValueOf.intValue());
        } else if (i2 == 1) {
            View view = messageButtonViews.get(0);
            Integer numValueOf2 = Integer.valueOf(view.getId());
            view.setNextFocusLeftId(numValueOf.intValue());
            view.setNextFocusRightId(numValueOf.intValue());
            view.setNextFocusUpId(numValueOf.intValue());
            view.setNextFocusDownId(numValueOf.intValue());
            messageCloseButtonView.setNextFocusUpId(numValueOf2.intValue());
            messageCloseButtonView.setNextFocusDownId(numValueOf2.intValue());
            messageCloseButtonView.setNextFocusRightId(numValueOf2.intValue());
            messageCloseButtonView.setNextFocusLeftId(numValueOf2.intValue());
            messageCloseButtonView = view;
            numValueOf = numValueOf2;
        } else if (i2 != 2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView.setupDirectionalNavigation.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Cannot setup directional navigation. Got unsupported number of buttons: " + i2;
                }
            }, 6, (Object) null);
        } else {
            View view2 = messageButtonViews.get(1);
            View view3 = messageButtonViews.get(0);
            Integer numValueOf3 = Integer.valueOf(view2.getId());
            Integer numValueOf4 = Integer.valueOf(view3.getId());
            view2.setNextFocusLeftId(numValueOf4.intValue());
            view2.setNextFocusRightId(numValueOf4.intValue());
            view2.setNextFocusUpId(numValueOf.intValue());
            view2.setNextFocusDownId(numValueOf.intValue());
            view3.setNextFocusLeftId(numValueOf3.intValue());
            view3.setNextFocusRightId(numValueOf3.intValue());
            view3.setNextFocusUpId(numValueOf.intValue());
            view3.setNextFocusDownId(numValueOf.intValue());
            messageCloseButtonView.setNextFocusUpId(numValueOf3.intValue());
            messageCloseButtonView.setNextFocusDownId(numValueOf3.intValue());
            messageCloseButtonView.setNextFocusRightId(numValueOf3.intValue());
            messageCloseButtonView.setNextFocusLeftId(numValueOf4.intValue());
            messageCloseButtonView = view2;
            numValueOf = numValueOf3;
        }
        if (numValueOf != null) {
            setNextFocusUpId(numValueOf.intValue());
            setNextFocusDownId(numValueOf.intValue());
            setNextFocusRightId(numValueOf.intValue());
            setNextFocusLeftId(numValueOf.intValue());
        }
        if (messageCloseButtonView != null) {
            messageCloseButtonView.setFocusedByDefault(true);
        }
        if (messageCloseButtonView != null) {
            messageCloseButtonView.post(new Runnable() { // from class: com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    messageCloseButtonView.requestFocus();
                }
            });
        }
    }
}
