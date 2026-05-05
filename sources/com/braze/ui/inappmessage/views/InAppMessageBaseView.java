package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.inappmessage.IInAppMessageWithImage;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0LeV7ZS0\u0012s{Břc$wDCU0}*\tUOog\u0005Jb\u000bI\u0010\u000e\u0016\u000fj4I[{e\u0012\u001d2JģG3coE9fv>\u0005.>*8\u007f\u0005\t\u001a8N\u0018v\u0001GS\f(0Hp@R\u0015M\u001b\u001a\u001a\u0006D!\u0007Brɡlkxl\f9_#1izM\\ G\rS\u001bGl)#u\u0010 ;FE8-'i\u00025VÜC\u0003Mv\u0006\u0013vE?+w\u0013\b:f ,\u0015YpSq;4j'i`:F[Sqnh\u000eV~A\u0010UJ\u00122\u001e'vM]\u001et-&3#\u0019\u001aT\u0019\u0010li\u0018z\u0010UG)\u000e[C9I\u0010\u0018u\u00047\\a\u0014\u0005;=S\u0005|LsT<\u0007E\u001fb$i1\u007fimL\\7q=\u001c-7vJ8\u0012^_\u007f]\u001bA2%TO[gSg\u007fJVR\u0019\u000f\u0005\u000f\b\u0004m`zX\"\u001dI}>Q\u001ahx|\u0005\u001ao\u0005\\:9e\u001c\u00030D\u001cc8j}T!S\u0017%яtȬnYe܃=1l?gw\f\u0010]Cl>\u0006cq\u001cyT\r\u0013mI9ۚZڋFW$\\b60A\u0019~\u001e\b\u0014Fd\u000bACuFrِ.֞\u001d`-J\t0PTM\u001bmn\u0001\u0012\u0015Sa9YȔ&ڲ\r\u0005h^v\u0006u\u0010\u001a>\u000bx:/WPc2|ƅ$מ8\u0001;\t\u0005\u000e\u000eb8^Uh\u0005\u0018\fT*5lׄ;ֺ3A+\u0011\u0005F@\u0019θI\u0003"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004@I!95CIy0 \u0015E]G\u0007T0N\t|", "\u001a`]1e6BRb\u0011~].|\u0018xR\u007f/wO\u0005(\u0017.k\"F\u00074\u000b", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004\u001bvq9X+;yB\u001a\u0017hR=\u0007u\u0002", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/sc?f", "\u001a`]1e6BRb\u000f\nb3Fd>t\r,xP\u0010\u0017\u0005G~c", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001}%2T\r\u0017zC+\u0019eqH\u0007Q,]Lj8", "6`b\u000ec7EW\u0019}lb5{\u0013AI\t6{O\u000f", "", "5dc\u0015T:\u001a^$\u0006~^+n\r8d\n:_I\u000f\u0017&U", "u(I", "Adc\u0015T:\u001a^$\u0006~^+n\r8d\n:_I\u000f\u0017&U", "uY\u0018#", ";db@T.>0\u0015|\u0001`9\u0007\u00198di%\u0001@~&", "", "5dc\u001aX:LO\u001b~WZ*\u0003\u000b<o\u00101z*}\u001c\u0017E~", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", ";db@T.>1 \u0003xd(y\u0010/V\u0004(\u000e", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5dc\u001aX:LO\u001b~Xe0z\u000f+b\u0007(lD\u0001)", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", ";db@T.>7\u0017\t\u0004O0|\u001b", "\u001a`]1e6BRb\u0011~].|\u0018xT\u007f;\u000b1\u0005\u0017)\u001d", "5dc\u001aX:LO\u001b~^\\6\u0006y3e\u0012", "u(;.a+K]\u001d}Dp0{\u000b/tI\u0017{S\u0010\b\u001bG\u0002c", ";db@T.>7!z|^\u001d\u0001\tA", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@q\u001b\u0017YE", "5dc\u001aX:LO\u001b~^f(~\t i\u007f:", "u(;.a+K]\u001d}Dp0{\u000b/tI\f\u0004<\u0003\u0017\bKo \u0012", ";db@T.>B\u0019\u0012\nO0|\u001b", "5dc\u001aX:LO\u001b~i^?\fy3e\u0012", "/o_9l\u001eB\\\u0018\t\rB5\u000b\t>s", "", "7mb2g:", "\u001a`]1e6BR,Hxh9|R@i\u007f:E2\u0005 \u0016Q\u0002qE\u0005%Dg[*?x\u0012=#", "@db2g\u0014>a'z|^\u0014x\u00161i\t6", "7lP4X\u0019>b&\u0003zo(\u0004v?c}(\nN\u0002'\u001e", "Adc\u001aX:LO\u001b~", "BdgA", "", "Adc\u001aX:LO\u001b~WZ*\u0003\u000b<o\u00101z\u001e\u000b\u001e!T", "1n[<e", "", "Adc\u001aX:LO\u001b~^\\6\u0006", "7b^;", "7b^;66E]&", "7b^;5(<Y\u001b\f\u0005n5{f9l\n5", "Adc\u001aX:LO\u001b~^f(~\t i\u007f:", "0hc:T7", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0005\u007fO\t\u0013\"\u001d", "Adc\u001aX:LO\u001b~i^?\fd6i\u00021", "BdgA43BU\"", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn$Y\u0011/\u0013t\u001a0V\u0019", "Adc\u001aX:LO\u001b~i^?\ff9l\n5", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class InAppMessageBaseView extends RelativeLayout implements IInAppMessageView {
    public static final Companion Companion = new Companion(null);
    private boolean hasAppliedWindowInsets;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:SIV2\u007f8\b}P\u0018k|Mr\u000bq\u0013L\u001bѷn1"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004@I!95CIy0 \u0015E]G\u0007T0N\te%VV7X[vG\u001dg", "", "u(E", "5dc\u000ec7K]$\f~Z;|l7a\u0002(kM\b", "", "7m0=c\u0014>a'z|^", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001e\u0007lp<jk(Pv|", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final String getAppropriateImageUrl(IInAppMessageWithImage inAppMessage) {
            Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
            final String localImageUrl = inAppMessage.getLocalImageUrl();
            String str = localImageUrl;
            if (str != null && !StringsKt.isBlank(str)) {
                if (new File(localImageUrl).exists()) {
                    return localImageUrl;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageBaseView$Companion$getAppropriateImageUrl$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Local bitmap file does not exist. Using remote url instead. Local path: " + localImageUrl;
                    }
                }, 6, (Object) null);
            }
            return inAppMessage.getRemoteImageUrl();
        }
    }

    public InAppMessageBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @JvmStatic
    public static final String getAppropriateImageUrl(IInAppMessageWithImage iInAppMessageWithImage) {
        return Companion.getAppropriateImageUrl(iInAppMessageWithImage);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        setHasAppliedWindowInsets(true);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public boolean getHasAppliedWindowInsets() {
        return this.hasAppliedWindowInsets;
    }

    public abstract Object getMessageBackgroundObject();

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public View getMessageClickableView() {
        return this;
    }

    public abstract TextView getMessageIconView();

    public abstract ImageView getMessageImageView();

    public abstract TextView getMessageTextView();

    public void resetMessageMargins(boolean z2) {
        CharSequence text;
        String string;
        ImageView messageImageView = getMessageImageView();
        if (messageImageView != null) {
            if (z2) {
                ViewUtils.removeViewFromParent(getMessageIconView());
            } else {
                ViewUtils.removeViewFromParent(messageImageView);
            }
        }
        TextView messageIconView = getMessageIconView();
        if (messageIconView == null || (text = messageIconView.getText()) == null || (string = text.toString()) == null || !StringsKt.isBlank(string)) {
            return;
        }
        ViewUtils.removeViewFromParent(getMessageIconView());
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void setHasAppliedWindowInsets(boolean z2) {
        this.hasAppliedWindowInsets = z2;
    }

    public void setMessage(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView messageTextView = getMessageTextView();
        if (messageTextView == null) {
            return;
        }
        messageTextView.setText(text);
    }

    public void setMessageBackgroundColor(int i2) {
        Object messageBackgroundObject = getMessageBackgroundObject();
        Intrinsics.checkNotNull(messageBackgroundObject, "null cannot be cast to non-null type android.view.View");
        InAppMessageViewUtils.setViewBackgroundColor((View) messageBackgroundObject, i2);
    }

    public void setMessageIcon(String icon, int i2, int i3) throws Throwable {
        Intrinsics.checkNotNullParameter(icon, "icon");
        TextView messageIconView = getMessageIconView();
        if (messageIconView != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            InAppMessageViewUtils.setIcon(context, icon, i2, i3, messageIconView);
        }
    }

    public void setMessageImageView(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ImageView messageImageView = getMessageImageView();
        if (messageImageView != null) {
            InAppMessageViewUtils.setImage(bitmap, messageImageView);
        }
    }

    public void setMessageTextAlign(TextAlign textAlign) {
        Intrinsics.checkNotNullParameter(textAlign, "textAlign");
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            InAppMessageViewUtils.setTextAlignment(messageTextView, textAlign);
        }
    }

    public void setMessageTextColor(int i2) {
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            InAppMessageViewUtils.setTextViewColor(messageTextView, i2);
        }
    }
}
