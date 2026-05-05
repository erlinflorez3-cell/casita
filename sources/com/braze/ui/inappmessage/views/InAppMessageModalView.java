package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.InAppMessageModal;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.inappmessage.config.BrazeInAppMessageParams;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import com.dynatrace.android.callback.Callback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
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
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0LeN/ZS@\u000fs{:'c$\bCCU \u0001*\teNogtOb\u000bY\u000f\u000e\u0016~m4Ikxe\u0012\u00155JoM3UڎE9n\u0013>ӌ(20>\u0002\u0005\u0007\u001a2H\u001e\u007f\u0003CQ\u0012\u001a0VpBR#M\r\u001a\u0018\u0007D4\u0017Ȧ\rg|5\t\u0004m@=#\u001bkXMU`@\u0003[\u000f^V=\f%dӿ/@E9];a,\u001fR\ni3C\u007f=\u001dhU([M\u0002`NX.\u001e[?\u0018!k\u001e>b\u0015Sp\fU1}\u0010{T\u001cU\u0010z*;\u0003\u0018V45wF-H\u00118\u0012A%\u000bSn\u00022bP2\u0013adEU\u0004A^Q\u001b\u0015\u007f\u0012?'\u0003O{3;N'\u000f$9[\u0003<''cb\u0006\bIQngxR\u0018\u0011Um2\")\u0016r\u001c>\u007f\u0018/*;^\u001b37s9Q\"\u001c\bVM\u007fx\u001b_\u0017]0d\u0011^0(.7X3<^Rd\u001dk~U\t0\u001fV4T588\u0017.k\u0010<O`V`\u0018vw'e]8O_jE\u0017\u0007k<\u0006\u007fr\u0004I_h(chuBEr7[ֱh͞W\u0010r^.)@P;*\u0006\u0005\\P\"\u0012`IHʎ@Ϝ5%dé`\u0005$MO\t)a`u\u001e\r%M2\u0012\u0002&\u000b\b/`3ʞ{ς|U4ʉx$3R_G9([5vHM7\u0015\u0014\f\u0002]fz]\u0003Al\u0085Wދ$\u001a2;WFK+_\u00137K\u001a/[K!k\b\"hؔ|܃}\u0013Sj4\u0002\u0016rA@n\u0006bQj\u0016P|\u0015Gyοfѣ}e^|M\u007fb\u0013,RW\u0010\u001b[RMf\u001b;stݩ\u0003Ȟ&\u0001M/IF+6H(=6y_\u007fn\\\u0018\u0019c|܀gנ0g.qhskR\fLW|\u0017@8#\u001b'x\u001dA͂\nɚ\r8%5Nfr\u0017'L[2G\u007f|\u0006Z+'+2Ƽ\u0015̭\u00028Fa0\u001cQ\u001eџb\u0002"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004@I!95CIy0 \u0015Pk8\u0003j\u001dRv9\u001d", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004@I!95CIy0 \u0015LiA\u0007p:R\b'$H\\,MVrOi", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/sc?f", "\u001a`]1e6BRb\u000f\nb3Fd>t\r,xP\u0010\u0017\u0005G~c", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001}%2T\r\u0017zC+\u0019eqH\u0007Q,]Lj8", "4qP:X\u001dBS+", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5dc\u0013e(FS\n\u0003zp", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "7m0=c\u0014>a'z|^", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=\u0007{Bx}.[Q7m4\u0006\u001fg]@\\", "5dc\u0016a\bI^\u0001~\tl(~\t", "u(;0b4\bP&z\u0010^u\u0005\u0013.e\u00076ED\n\u0013\"Rw\u000eJ\u0005!7YG\u0004@I!95CIy0 \u0015Pk8\u0003j\u0002", "Adc\u0016a\bI^\u0001~\tl(~\t", "uKR<`u;`\u0015\u0014z(4\u0007\b/l\u000eq\u007fI|\"\"Oo\u001cJr'5#a)\u0013x!\u0016MQIg6\u001e|r`5\u000e9o?", "7m0=c\u0014>a'z|^\u0010\u0005\u00051ep,{R", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004@I!95CIy0 \u0015Li5\tc\u001dRv9\u001d", "5dc\u0016a\bI^\u0001~\tl(~\t\u0013m{*{1\u0005\u0017)", "u(;0b4\bP&z\u0010^u\r\rxi\t$\u0007K\t\u0017%Uk\u0010<@69Y\u0010.\u0001Q\u001f\nXN#kB,\u0011ja\u001d\u000f_.Ng+G^$", "Adc\u0016a\bI^\u0001~\tl(~\t\u0013m{*{1\u0005\u0017)", "uKR<`u;`\u0015\u0014z(<\u0001R3n{3\u0007H\u0001%%Cq\u000e\u0006\b)5k\fi\u001bvq9X+;yB\u001a\u0017hEA\u0003e,?z'Y\"\u0012\u001d", ";db@T.>0\u0015|\u0001`9\u0007\u00198di%\u0001@~&", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW\u001b\u0004!GUz'7C", "5dc\u001aX:LO\u001b~WZ*\u0003\u000b<o\u00101z*}\u001c\u0017E~", "u(;.a+K]\u001d}D`9x\u00142i}6E?\u000e\u0013)Cl\u0015<@\u0004BU\u0010\u001c4t\u0016\u0004", ";db@T.>1 \u0003xd(y\u0010/V\u0004(\u000e", "5dc\u001aX:LO\u001b~Xe0z\u000f+b\u0007(lD\u0001)", ";db@T.>1 \t\t^\t\r\u0018>o\t\u0019\u007f@\u0013", "5dc\u001aX:LO\u001b~Xe6\u000b\t\fu\u000f7\u0006Iq\u001b\u0017Y", ";db@T.>6\u0019zy^9k\tBtp,{R", "\u001a`]1e6BRb\u0011~].|\u0018xT\u007f;\u000b1\u0005\u0017)\u001d", "5dc\u001aX:LO\u001b~]^({\t<T\u007f;\u000b1\u0005\u0017)", "u(;.a+K]\u001d}Dp0{\u000b/tI\u0017{S\u0010\b\u001bG\u0002c", ";db@T.>7\u0017\t\u0004O0|\u001b", "5dc\u001aX:LO\u001b~^\\6\u0006y3e\u0012", ";db@T.>7!z|^\u001d\u0001\tA", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@q\u001b\u0017YE", "5dc\u001aX:LO\u001b~^f(~\t i\u007f:", "u(;.a+K]\u001d}Dp0{\u000b/tI\f\u0004<\u0003\u0017\bKo \u0012", ";db@T.>B\u0019\u0012\nO0|\u001b", "5dc\u001aX:LO\u001b~i^?\fy3e\u0012", "/o_9l\u0010G/$\nb^:\u000b\u00051ej$\t<\t\u0017&G|\u001c", "", "5dc\u001aX:LO\u001b~Wn;\f\u00138V\u0004(\u000eN", "", "<t\\\u000fh;M]\"\r", "", "=m;.l6Nb", "1gP;Z,=", "", ":dUA", "Bn_", "@hV5g", "0ncAb4", "@db2g\u0014>a'z|^\u0014x\u00161i\t6", "7lP4X\u0019>b&\u0003zo(\u0004v?c}(\nN\u0002'\u001e", "@db6m, `\u0015\n}b*]\u0016+m\u007f\f|\u001c\f\"$Qz\u001b@r45", "Adc\u0016a\bI^\u0001~\tl(~\t\u0013m{*{1\u0005\u0017)#~\u001dIz\"Eh}.", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001expi9\u0014q0_v|", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004\u001bvq9X+;yB\u001a\u0017hEA\u0003e,?z'Y\"", "Adc\u001aX:LO\u001b~WZ*\u0003\u000b<o\u00101z\u001e\u000b\u001e!T", "1n[<e", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class InAppMessageModalView extends InAppMessageImmersiveBaseView {
    private InAppMessageModal inAppMessage;
    private InAppMessageImageView inAppMessageImageView;

    public InAppMessageModalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$resetMessageMargins$-Z-V, reason: not valid java name */
    public static /* synthetic */ void m7071instrumented$0$resetMessageMargins$ZV(InAppMessageModalView inAppMessageModalView, View view) {
        Callback.onClick_enter(view);
        try {
            resetMessageMargins$lambda$0(inAppMessageModalView, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    private static final void resetMessageMargins$lambda$0(InAppMessageModalView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageModalView$resetMessageMargins$1$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Passing scrollView click event to message clickable view.";
            }
        }, 7, (Object) null);
        View messageClickableView = this$0.getMessageClickableView();
        if (messageClickableView != null) {
            messageClickableView.performClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resizeGraphicFrameIfAppropriate$lambda$2(InAppMessageModalView this$0, int i2, int i3, int i4, double d2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        double dMin = Math.min(this$0.getMeasuredWidth() - i2, i3);
        double dMin2 = Math.min(this$0.getMeasuredHeight() - i2, i4);
        double d3 = dMin / dMin2;
        View viewFindViewById = this$0.findViewById(R.id.com_braze_inappmessage_modal_graphic_bound);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (d2 >= d3) {
                layoutParams2.width = (int) dMin;
                layoutParams2.height = (int) (dMin / d2);
            } else {
                layoutParams2.width = (int) (d2 * dMin2);
                layoutParams2.height = (int) dMin2;
            }
            viewFindViewById.setLayoutParams(layoutParams2);
        }
    }

    public void applyInAppMessageParameters(Context context, InAppMessageModal inAppMessage) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        this.inAppMessage = inAppMessage;
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R.id.com_braze_inappmessage_modal_imageview);
        this.inAppMessageImageView = inAppMessageImageView;
        if (inAppMessageImageView != null) {
            setInAppMessageImageViewAttributes(context, inAppMessage, inAppMessageImageView);
        }
        resizeGraphicFrameIfAppropriate(context, inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    public View getFrameView() {
        return findViewById(R.id.com_braze_inappmessage_modal_frame);
    }

    protected final InAppMessageModal getInAppMessage() {
        return this.inAppMessage;
    }

    protected final InAppMessageImageView getInAppMessageImageView() {
        return this.inAppMessageImageView;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public Drawable getMessageBackgroundObject() {
        View messageClickableView = getMessageClickableView();
        if (messageClickableView != null) {
            return messageClickableView.getBackground();
        }
        return null;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public List<View> getMessageButtonViews(int i2) {
        ArrayList arrayList = new ArrayList();
        if (i2 == 1) {
            View viewFindViewById = findViewById(R.id.com_braze_inappmessage_modal_button_layout_single);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
            View viewFindViewById2 = findViewById(R.id.com_braze_inappmessage_modal_button_single_one);
            if (viewFindViewById2 != null) {
                arrayList.add(viewFindViewById2);
            }
        } else if (i2 == 2) {
            View viewFindViewById3 = findViewById(R.id.com_braze_inappmessage_modal_button_layout_dual);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setVisibility(0);
            }
            View viewFindViewById4 = findViewById(R.id.com_braze_inappmessage_modal_button_dual_one);
            View viewFindViewById5 = findViewById(R.id.com_braze_inappmessage_modal_button_dual_two);
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
        return findViewById(R.id.com_braze_inappmessage_modal);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public View getMessageCloseButtonView() {
        return findViewById(R.id.com_braze_inappmessage_modal_close_button);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_modal_header_text);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageIconView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_modal_icon);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public ImageView getMessageImageView() {
        return this.inAppMessageImageView;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageTextView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_modal_message);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) throws Throwable {
        super.onLayout(z2, i2, i3, i4, i5);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "this.context");
        resizeGraphicFrameIfAppropriate(context, this.inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean z2) {
        super.resetMessageMargins(z2);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.com_braze_inappmessage_modal_image_layout);
        if ((z2 || getMessageIconView() != null) && relativeLayout != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            relativeLayout.setLayoutParams(layoutParams);
        }
        View viewFindViewById = findViewById(R.id.com_braze_inappmessage_modal_text_layout);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.braze.ui.inappmessage.views.InAppMessageModalView$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InAppMessageModalView.m7071instrumented$0$resetMessageMargins$ZV(this.f$0, view);
                }
            });
        }
    }

    protected void resizeGraphicFrameIfAppropriate(Context context, InAppMessageModal inAppMessageModal) throws Throwable {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(context, C1561oA.yd(":GCJ@TM", (short) (OY.Xd() ^ 8938)));
        if (inAppMessageModal == null || (bitmap = inAppMessageModal.getBitmap()) == null || inAppMessageModal.getImageStyle() != ImageStyle.GRAPHIC) {
            return;
        }
        final double width = ((double) bitmap.getWidth()) / ((double) bitmap.getHeight());
        short sXd = (short) (FB.Xd() ^ 30015);
        int[] iArr = new int["#1(750,v-::A3=D~\u0015BBI;OL".length()];
        QB qb = new QB("#1(750,v-::A3=D~\u0015BBI;OL");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Xg.qd("%$4\u0013'63:8*-<", (short) (C1633zX.Xd() ^ (-3331)), (short) (C1633zX.Xd() ^ (-31142))), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            final int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.com_braze_inappmessage_modal_margin);
            final int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.com_braze_inappmessage_modal_max_width);
            final int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.com_braze_inappmessage_modal_max_height);
            post(new Runnable() { // from class: com.braze.ui.inappmessage.views.InAppMessageModalView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    InAppMessageModalView.resizeGraphicFrameIfAppropriate$lambda$2(this.f$0, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, width);
                }
            });
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    protected final void setInAppMessage(InAppMessageModal inAppMessageModal) {
        this.inAppMessage = inAppMessageModal;
    }

    protected final void setInAppMessageImageView(InAppMessageImageView inAppMessageImageView) {
        this.inAppMessageImageView = inAppMessageImageView;
    }

    protected void setInAppMessageImageViewAttributes(Context context, IInAppMessageImmersive inAppMessage, IInAppMessageImageView inAppMessageImageView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(inAppMessageImageView, "inAppMessageImageView");
        float fConvertDpToPixels = (float) ViewUtils.convertDpToPixels(context, BrazeInAppMessageParams.getModalizedImageRadiusDp());
        if (inAppMessage.getImageStyle() == ImageStyle.GRAPHIC) {
            inAppMessageImageView.setCornersRadiusPx(fConvertDpToPixels);
        } else {
            inAppMessageImageView.setCornersRadiiPx(fConvertDpToPixels, fConvertDpToPixels, 0.0f, 0.0f);
        }
        inAppMessageImageView.setInAppMessageImageCropType(inAppMessage.getCropType());
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void setMessageBackgroundColor(int i2) {
        View viewFindViewById = findViewById(R.id.com_braze_inappmessage_modal);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.com_braze_inappmessage_modal)");
        InAppMessageViewUtils.setViewBackgroundColorFilter(viewFindViewById, i2);
    }
}
