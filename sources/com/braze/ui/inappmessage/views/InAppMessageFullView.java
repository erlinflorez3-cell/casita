package com.braze.ui.inappmessage.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.inappmessage.config.BrazeInAppMessageParams;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import com.dynatrace.android.callback.Callback;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
@Metadata(bv = {}, d1 = {"Яp\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0LeN/ZS@\u000fsڔ<$i-yّCU(\u0004*\tUUog\u0005Jb\u000bI\u0012\u000e\u0016\u000fj4I[}e\u0012\u001d2JģG3coE9fy>\u000562*\u0600\u0002\u0005\u0017\u001a2Ϻ\u0018v\taS\f\u00182HpPR\u0015M\u000b\u001b\u0018\u001aTĨ1\u001e\u000bf\u000fMXrk:G%\u0019hpO7e>~e\u000f\\SU\u0010țe\u001e9D\u007fK#Jk\u00035x\fC\u0011f\n=3\u0011W+9r\fWd^F\u0014]A]7urT\u00035Un3?+}\f{T\u001cS\u0010z*\u0013\u0003\u0004V\u00145tF-H\r8\u0012A\"\u000bSnxHr\u000b\u001e\t\u0010N\u0017S&c/GJ~Q\u0010kIRE-\u001d\rLU1r/fl\u000e\u000f!ah@e?\u0005XCXP\u001aYks2%\u0013\u000689HG.=B%v%3ms9QG\u001c\u0006V{\u007fv3l/g2pVx:nD]Z\r\u001a\n\\d3\u001c\u0001Xf])MJ\u00077\u0002\u0016\u001c8\\&ug%X\\]#\u0002j{\u0004:)=\"OY\u001dyTk\nrA:ie&`\u0001|J\u0014\u0013Ќ\u0007ֽjFk\u000e`c6*\u0003Vx\u0019\u0010}ZM:\u001d\tŰ}ʬ8,9ǉ-!V\u000e6Bo\t_ݣfӳ\u0014~\\՜t\u0015w1\r\t/^\u0013EFζzͅ0\u0001x$3P_Ei:c3\u00016\u0013\"5\u0005*T\u001eќNܤPp.w[\u000e.\u001ejM_BU\u0015%}W88\u0002\u001cɺtϯUQ*)\u0001\u0011\b\u0017\f|<| l\u0007+\u000fp\u0001$+϶$Ցbv;\nj\u0016\bi\u0017\u000fUzl\rq=w\u000b9.\u0013ҕ:٫\t#6'\u0007\t0\u0017\u0006AQB5\u0018\u000e\u0013]-\u00182@܇0ԃf\u0013>vk :}f\u0004pnu4Q7ww5\u0013xّnúFL\u0003y\u000ea\u0017T]GVb|rl7{#eR=\u0095.ޛtZs<\u0019\u0012\fN~q8\u0017[}BlyygߔUܭqqc^\u0011n\u001d\u001aσ\u007fm"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004@I!95CIy0 \u0015Iq@\u000eT0N\t|", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004@I!95CIy0 \u0015LiA\u0007p:R\b'$H\\,MVrOi", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/sc?f", "\u001a`]1e6BRb\u000f\nb3Fd>t\r,xP\u0010\u0017\u0005G~c", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001}%2T\r\u0017zC+\u0019eqH\u0007Q,]Lj8", "4qP:X\u001dBS+", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5dc\u0013e(FS\n\u0003zp", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "7m0=c\u0014>a'z|^\u0010\u0005\u00051ep,{R", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004@I!95CIy0 \u0015Li5\tc\u001dRv9\u001d", "7r6?T7AW\u0017", "", ":n]48+@S", "", "5dc\u0019b5@3\u0018\u0001z", "u(8", ";db@T.>0\u0015|\u0001`9\u0007\u00198di%\u0001@~&", "5dc\u001aX:LO\u001b~WZ*\u0003\u000b<o\u00101z*}\u001c\u0017E~", ";db@T.>1 \u0003xd(y\u0010/V\u0004(\u000e", "5dc\u001aX:LO\u001b~Xe0z\u000f+b\u0007(lD\u0001)", ";db@T.>1 \t\t^\t\r\u0018>o\t\u0019\u007f@\u0013", "5dc\u001aX:LO\u001b~Xe6\u000b\t\fu\u000f7\u0006Iq\u001b\u0017Y", ";db@T.>6\u0019zy^9k\tBtp,{R", "\u001a`]1e6BRb\u0011~].|\u0018xT\u007f;\u000b1\u0005\u0017)\u001d", "5dc\u001aX:LO\u001b~]^({\t<T\u007f;\u000b1\u0005\u0017)", "u(;.a+K]\u001d}Dp0{\u000b/tI\u0017{S\u0010\b\u001bG\u0002c", ";db@T.>7\u0017\t\u0004O0|\u001b", "5dc\u001aX:LO\u001b~^\\6\u0006y3e\u0012", ";db@T.>7!z|^\u001d\u0001\tA", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@q\u001b\u0017YE", "5dc\u001aX:LO\u001b~^f(~\t i\u007f:", "u(;.a+K]\u001d}Dp0{\u000b/tI\f\u0004<\u0003\u0017\bKo \u0012", ";db@T.>B\u0019\u0012\nO0|\u001b", "5dc\u001aX:LO\u001b~i^?\fy3e\u0012", "Ag^?g\f=U\u0019", "5dc [6Kbx}|^", "/o_9l\u000bBa$\u0006vr\n\r\u00189u\u000f\u0010wM\u0003\u001b U^\u0018\u001a}/CYZ0F| 7", "", "Eh]1b>\"\\'~\nl", "\u001a`]1e6BR,Hxh9|R@i\u007f:E2\u0005 \u0016Q\u0002qE\u0005%Dg[*?x\u0012=#", "1k^@X\tNb(\t\u0004O0|\u001b", "/o_9l\u000bBa$\u0006vr\n\r\u00189u\u000f\u0010wM\u0003\u001b U^\u0018\u001a\u0001.DY\u0007/\u0013z\u0016*", "1n]AX5M/&~vO0|\u001b", "/o_9l\u001eB\\\u0018\t\rB5\u000b\t>s", "7mb2g:", "1qT.g,\u001a^$\f\u0005i9\u0001\u0005>ep,{R\u000f", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "7m0=c\u0014>a'z|^", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001expi9\u0014q0_v|", "5dc\u001aX:LO\u001b~Wn;\f\u00138V\u0004(\u000eN", "", "<t\\\u000fh;M]\"\r", "@db2g\u0014>a'z|^\u0014x\u00161i\t6", "7lP4X\u0019>b&\u0003zo(\u0004v?c}(\nN\u0002'\u001e", "Adc\u0016a\bI^\u0001~\tl(~\t\u0013m{*{1\u0005\u0017)#~\u001dIz\"Eh}.", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004\u001bvq9X+;yB\u001a\u0017hEA\u0003e,?z'Y\"", "Adc\u001aX:LO\u001b~WZ*\u0003\u000b<o\u00101z\u001e\u000b\u001e!T", "1n[<e", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class InAppMessageFullView extends InAppMessageImmersiveBaseView {
    private InAppMessageImageView inAppMessageImageView;
    private boolean isGraphic;

    public InAppMessageFullView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final void applyDisplayCutoutMarginsToCloseButton(WindowInsetsCompat windowInsetsCompat, View view) {
        if (view.getLayoutParams() == null || !(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageFullView.applyDisplayCutoutMarginsToCloseButton.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Close button layout params are null or not of the expected class. Not applying window insets.";
                }
            }, 7, (Object) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(windowInsetsCompat) + marginLayoutParams.leftMargin, ViewUtils.getMaxSafeTopInset(windowInsetsCompat) + marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(windowInsetsCompat) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(windowInsetsCompat) + marginLayoutParams.bottomMargin);
    }

    private final void applyDisplayCutoutMarginsToContentArea(WindowInsetsCompat windowInsetsCompat, View view) {
        if (!(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageFullView.applyDisplayCutoutMarginsToContentArea.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Content area layout params are null or not of the expected class. Not applying window insets.";
                }
            }, 7, (Object) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(windowInsetsCompat) + marginLayoutParams.leftMargin, marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(windowInsetsCompat) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(windowInsetsCompat) + marginLayoutParams.bottomMargin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$resetMessageMargins$-Z-V, reason: not valid java name */
    public static /* synthetic */ void m7069instrumented$0$resetMessageMargins$ZV(InAppMessageFullView inAppMessageFullView, View view, View view2) {
        Callback.onClick_enter(view2);
        try {
            resetMessageMargins$lambda$2$lambda$1(inAppMessageFullView, view, view2);
        } finally {
            Callback.onClick_exit();
        }
    }

    private static final void resetMessageMargins$lambda$2$lambda$1(InAppMessageFullView this$0, View msgClickableView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msgClickableView, "$msgClickableView");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageFullView$resetMessageMargins$1$1$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Passing scrollView click event to message clickable view.";
            }
        }, 7, (Object) null);
        msgClickableView.performClick();
    }

    private final void setInAppMessageImageViewAttributes(Activity activity, IInAppMessageImmersive iInAppMessageImmersive, IInAppMessageImageView iInAppMessageImageView) {
        iInAppMessageImageView.setInAppMessageImageCropType(iInAppMessageImmersive.getCropType());
        if (!ViewUtils.isRunningOnTablet(activity)) {
            iInAppMessageImageView.setCornersRadiusPx(0.0f);
            return;
        }
        float fConvertDpToPixels = (float) ViewUtils.convertDpToPixels(activity, BrazeInAppMessageParams.getModalizedImageRadiusDp());
        if (iInAppMessageImmersive.getImageStyle() == ImageStyle.GRAPHIC) {
            iInAppMessageImageView.setCornersRadiusPx(fConvertDpToPixels);
        } else {
            iInAppMessageImageView.setCornersRadiiPx(fConvertDpToPixels, fConvertDpToPixels, 0.0f, 0.0f);
        }
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        super.applyWindowInsets(insets);
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView != null) {
            applyDisplayCutoutMarginsToCloseButton(insets, messageCloseButtonView);
        }
        if (!this.isGraphic) {
            View viewFindViewById = findViewById(R.id.com_braze_inappmessage_full_text_and_button_content_parent);
            if (viewFindViewById != null) {
                applyDisplayCutoutMarginsToContentArea(insets, viewFindViewById);
                return;
            }
            return;
        }
        View singleButtonParent = findViewById(R.id.com_braze_inappmessage_full_button_layout_single);
        if (singleButtonParent != null && singleButtonParent.getVisibility() == 0) {
            Intrinsics.checkNotNullExpressionValue(singleButtonParent, "singleButtonParent");
            applyDisplayCutoutMarginsToContentArea(insets, singleButtonParent);
            return;
        }
        View dualButtonParent = findViewById(R.id.com_braze_inappmessage_full_button_layout_dual);
        if (dualButtonParent == null || dualButtonParent.getVisibility() != 0) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(dualButtonParent, "dualButtonParent");
        applyDisplayCutoutMarginsToContentArea(insets, dualButtonParent);
    }

    public void createAppropriateViews(Activity activity, IInAppMessageImmersive inAppMessage, boolean z2) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R.id.com_braze_inappmessage_full_imageview);
        this.inAppMessageImageView = inAppMessageImageView;
        if (inAppMessageImageView != null) {
            setInAppMessageImageViewAttributes(activity, inAppMessage, inAppMessageImageView);
        }
        this.isGraphic = z2;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    public View getFrameView() {
        return findViewById(R.id.com_braze_inappmessage_full_frame);
    }

    public int getLongEdge() {
        return findViewById(R.id.com_braze_inappmessage_full).getLayoutParams().height;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public View getMessageBackgroundObject() {
        return findViewById(R.id.com_braze_inappmessage_full);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public List<View> getMessageButtonViews(int i2) {
        ArrayList arrayList = new ArrayList();
        if (i2 == 1) {
            View viewFindViewById = findViewById(R.id.com_braze_inappmessage_full_button_layout_single);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
            View viewFindViewById2 = findViewById(R.id.com_braze_inappmessage_full_button_single_one);
            if (viewFindViewById2 != null) {
                arrayList.add(viewFindViewById2);
            }
        } else if (i2 == 2) {
            View viewFindViewById3 = findViewById(R.id.com_braze_inappmessage_full_button_layout_dual);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setVisibility(0);
            }
            View viewFindViewById4 = findViewById(R.id.com_braze_inappmessage_full_button_dual_one);
            View viewFindViewById5 = findViewById(R.id.com_braze_inappmessage_full_button_dual_two);
            if (viewFindViewById4 != null) {
                arrayList.add(viewFindViewById4);
            }
            if (viewFindViewById5 != null) {
                arrayList.add(viewFindViewById5);
            }
        }
        return arrayList;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, com.braze.ui.inappmessage.views.IInAppMessageView
    public View getMessageClickableView() {
        return findViewById(R.id.com_braze_inappmessage_full);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public View getMessageCloseButtonView() {
        return findViewById(R.id.com_braze_inappmessage_full_close_button);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_full_header_text);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageIconView() {
        return null;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public ImageView getMessageImageView() {
        return this.inAppMessageImageView;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageTextView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_full_message);
    }

    public int getShortEdge() {
        return findViewById(R.id.com_braze_inappmessage_full).getLayoutParams().width;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean z2) {
        super.resetMessageMargins(z2);
        final View messageClickableView = getMessageClickableView();
        if (messageClickableView != null) {
            findViewById(R.id.com_braze_inappmessage_full_text_layout).setOnClickListener(new View.OnClickListener() { // from class: com.braze.ui.inappmessage.views.InAppMessageFullView$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InAppMessageFullView.m7069instrumented$0$resetMessageMargins$ZV(this.f$0, messageClickableView, view);
                }
            });
        }
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void setMessageBackgroundColor(int i2) {
        View messageBackgroundObject = getMessageBackgroundObject();
        if ((messageBackgroundObject != null ? messageBackgroundObject.getBackground() : null) instanceof GradientDrawable) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageBackgroundObject, i2);
            return;
        }
        if (this.isGraphic) {
            super.setMessageBackgroundColor(i2);
            return;
        }
        View viewFindViewById = findViewById(R.id.com_braze_inappmessage_full_all_content_parent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.com_br…_full_all_content_parent)");
        InAppMessageViewUtils.setViewBackgroundColor(viewFindViewById, i2);
        View viewFindViewById2 = findViewById(R.id.com_braze_inappmessage_full_text_and_button_content_parent);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.com_br…nd_button_content_parent)");
        InAppMessageViewUtils.setViewBackgroundColor(viewFindViewById2, i2);
    }
}
