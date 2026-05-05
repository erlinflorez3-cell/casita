package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.braze.models.cards.Card;
import com.braze.ui.R;
import com.braze.ui.actions.IAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import com.braze.ui.widget.BaseCardView;
import com.dynatrace.android.callback.Callback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

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
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&˛\bDZc|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG0L͜P.hS2\u000fq|<$q$yّCU(\u0007*ޛWN}gvJ`\u000bK\u000f\u001c\u0016\u0001j2I]xk\u0017\u0017˰JoM?UoC9htL\u0005(݅(\\\u0010ڎ) 0Ϻ\u001eu#Cy\fB6PrJRSL3\u001bR\u0011N$\u000f tg|9Ղp]H3k\u0019wGf'\u000e6-Q\u001bMl';~\u0012\"9IO5C%\u001a\u0017O`iI\u001b? E5l52CI\"c||H4#8g\r\f\u0001V`\u0013Sx\fU.\u007fgYY&(&z,\u0013J\u0013&\b=G\\=`xP\u001eA\u0006\u000bSnV2dP\u0012\u0013cL\u0016S\u0013y.\u0002Ctey;GTg\u0002\u0013\u001f6%\u0017mOn\u0005\u0012n*3T&gaWNT`P Xk\u00064tp\u000bB\u0004^GH=\n*F\u0017S=\f=1;\u0004\u0002v_.xݼd\u0005"}, d2 = {"\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WMz%G#Z\u001cEms8VR;tC{\u0011u`*\u000bc>$", "\"", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "\u001ab^:\")KO.~Dn0F\u001b3d\u0002(\u000b\n]\u0013%GM\nIu\u00169Y\u0010u", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "0h]1I0>e{\t\u0002],\n", "", "DhTD;6ER\u0019\f", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WMz%G#[*@|\u00167\\!7x3\u000f\u0019hs\u001c\u0011j+N\u0004|", "1`a1", "1qT.g,/W\u0019\u0011]h3{\t<", "DhTD:9Hc$", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "7r29\\*D6\u0015\bye,{", "", "1`a14*MW#\b", "\u001ab^:\")KO.~Dn0F\u0005-t\u00042\u0005NJzrE~\u0012F\u007fz", "A`U2F,M1 \u0003\u0006M6f\u0019>l\u00041{", "7lP4X\u001dBS+", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@q\u001b\u0017YE", "Adc\u001cc;B]\"z\u0002<(\n\b\u0013m{*{", "1`a14:IS\u0017\u000egZ;\u0001\u0013", "", "1`a1<4:U\u0019n\be", "", "Adc#\\,P0\u0015|\u0001`9\u0007\u00198d", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class BaseContentCardView<T extends Card> extends BaseCardView<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseContentCardView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private static final void bindViewHolder$lambda$0(BaseContentCardView this$0, Card card, UriAction uriAction, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(card, "$card");
        this$0.handleCardClick(this$0.applicationContext, card, uriAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$bindViewHolder$-Lcom-braze-ui-contentcards-view-ContentCardViewHolder-Lcom-braze-models-cards-Card--V, reason: not valid java name */
    public static /* synthetic */ void m7060x7f93e91(BaseContentCardView baseContentCardView, Card card, UriAction uriAction, View view) {
        Callback.onClick_enter(view);
        try {
            bindViewHolder$lambda$0(baseContentCardView, card, uriAction, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public void bindViewHolder(ContentCardViewHolder viewHolder, final Card card) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(card, "card");
        viewHolder.setPinnedIconVisible(card.isPinned());
        viewHolder.setUnreadBarVisible(this.configurationProvider.isContentCardsUnreadVisualIndicatorEnabled() && !card.isIndicatorHighlighted());
        final UriAction uriActionForCard = BrazeContentCardUtils.INSTANCE.getUriActionForCard(card);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.braze.ui.contentcards.view.BaseContentCardView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseContentCardView.m7060x7f93e91(this.f$0, card, uriActionForCard, view);
            }
        });
        viewHolder.setActionHintVisible(uriActionForCard != null);
    }

    public abstract ContentCardViewHolder createViewHolder(ViewGroup viewGroup);

    @Override // com.braze.ui.widget.BaseCardView
    protected boolean isClickHandled(Context context, Card card, IAction iAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        IContentCardsActionListener contentCardsActionListener = BrazeContentCardsManager.Companion.getInstance().getContentCardsActionListener();
        return contentCardsActionListener != null && contentCardsActionListener.onContentCardClicked(context, card, iAction);
    }

    protected final void safeSetClipToOutline(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        imageView.setClipToOutline(true);
    }

    public final void setOptionalCardImage(ImageView imageView, float f2, String str, Card card) {
        Intrinsics.checkNotNullParameter(card, "card");
        if (imageView == null || str == null) {
            return;
        }
        setImageViewToUrl(imageView, str, f2, card);
    }

    protected final void setViewBackground(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackground(getResources().getDrawable(R.drawable.com_braze_content_card_background));
        view.setForeground(getResources().getDrawable(R.drawable.com_braze_content_card_scrim));
    }
}
