package com.braze.ui.contentcards.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.ui.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.ZN;

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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r+4\u0012}\u0007njO0L͜P.hS2\u000fq{<$i$yّCU(\n*\tUQm{\u0005Ϻ\u000b\u000bq\u000eF)\tn:Imx\f\u0013\u001f6PqW3{rެ=`\u0003:M,@,Py3\fJ.V\u001c\u000fzqXT\u001e>N\t:\u0001\u0018}\t(!\u001e>N\u0004fhu^NH\u001bhj31\u0012\u0002B|*(<\u000b^%F\u00032=zo-C@e8e3a\b\u001fTq>1EHܸ\u0007ص+'3ɞDeD_\u0018\u0016+*}\u00154ù(ػ\tQhϯw9]lcR$'&{Rȡ>Ǭ\u0012\u0006/Ξͼ1,"}, d2 = {"\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WMz%G#[*@|\u00167\\!7x3\u000f\u0019hs\u001c\u0011j+N\u0004|", "\u001a`]1e6BR,H\b^*\u0011\u00076e\r9\u007f@\u0013`)Kn\u0010<\u0006n\"Y{45t\u0016;>G;}r\u000f\u0019hs\u001c\u0011j+N\u0004|", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "Ag^DH5KS\u0015}^g+\u0001\u0007+t\n5", "", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q5D\b", "/bc6b5!W\"\u000e", "\u001a`]1e6BRb\u0011~].|\u0018xT\u007f;\u000b1\u0005\u0017)\u001d", ">h];X+\"Q#\b", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@q\u001b\u0017YE", "Cma2T+\u001bO&", "Adc\u000eV;B]\"a~g;k\tBt", "", "BdgA", "", "Adc\u000eV;B]\"a~g;m\r=i|/{", "7rE6f0;Z\u0019", "Adc\u001d\\5GS\u0018bxh5m\r=i|/{", "Adc\"a9>O\u0018[vk\u001d\u0001\u00173b\u0007(", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class ContentCardViewHolder extends RecyclerView.ViewHolder {
    private final TextView actionHint;
    private final ImageView pinnedIcon;
    private final View unreadBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentCardViewHolder(View view, boolean z2) throws Throwable {
        super(view);
        Intrinsics.checkNotNullParameter(view, C1626yg.Ud("~\u0018~c", (short) (FB.Xd() ^ 2079), (short) (FB.Xd() ^ 30436)));
        View viewFindViewById = view.findViewById(R.id.com_braze_content_cards_unread_bar);
        this.unreadBar = viewFindViewById;
        this.pinnedIcon = (ImageView) view.findViewById(R.id.com_braze_content_cards_pinned_icon);
        this.actionHint = (TextView) view.findViewById(R.id.com_braze_content_cards_action_hint);
        if (!z2) {
            if (viewFindViewById == null) {
                return;
            }
            viewFindViewById.setVisibility(8);
            return;
        }
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
        }
        if (viewFindViewById == null) {
            return;
        }
        Context context = view.getContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("5v\u001dQS(|\u001d\u001fqtVs\u0005!7\u0003Cx\u0015B\u0014_", (short) (ZN.Xd() ^ 8423))).getMethod(EO.Od("&R\u0012\u0016j-\u0003\u0004'Z`\u0007", (short) (C1499aX.Xd() ^ (-13222))), new Class[0]);
        try {
            method.setAccessible(true);
            viewFindViewById.setBackground(((Resources) method.invoke(context, objArr)).getDrawable(R.drawable.com_braze_content_cards_unread_bar_background));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void setActionHintText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView textView = this.actionHint;
        if (textView == null) {
            return;
        }
        textView.setText(text);
    }

    public final void setActionHintVisible(boolean z2) {
        TextView textView = this.actionHint;
        if (textView == null) {
            return;
        }
        textView.setVisibility(z2 ? 0 : 8);
    }

    public final void setPinnedIconVisible(boolean z2) {
        ImageView imageView;
        ImageView imageView2 = this.pinnedIcon;
        if (imageView2 != null) {
            imageView2.setVisibility(z2 ? 0 : 8);
        }
        if (z2) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            if (TextUtils.getLayoutDirectionFromLocale(locale) != 1 || (imageView = this.pinnedIcon) == null) {
                return;
            }
            imageView.setScaleX(-1.0f);
        }
    }

    public final void setUnreadBarVisible(boolean z2) {
        View view = this.unreadBar;
        if (view == null) {
            return;
        }
        view.setVisibility(z2 ? 0 : 8);
    }
}
