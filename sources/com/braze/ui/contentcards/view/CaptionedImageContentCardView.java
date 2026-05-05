package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.braze.models.cards.CaptionedImageCard;
import com.braze.models.cards.Card;
import com.braze.ui.R;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007tjAӄLe^.Zݷ2\u000f\u0002{<$a$yCQU\"}(\tUb}˧\u001fPj\rS\u000f4\u0016'idHb9h\"\u0013@C\b?aOڱA9nw~\u001b.6:8(\n1\u001e8N(v)J{\u0010 8Xph[SaM( \u0010V /%\rk\\A`l\fFu7ɮmP"}, d2 = {"\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WMz%G#[\u001cB|\u001a8VC:O<\u001a\u0017h?C\u0010r,W\u0006\u0005CYM\u001d`R\u0005\u0013", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WMz%G#Z\u001cEms8VR;tC{\u0011u`*\u000bc>$", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u0019Kz/>Y|\u0004?i\u0018.+?Hj\n", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "0h]1I0>e{\t\u0002],\n", "", "DhTD;6ER\u0019\f", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WMz%G#[*@|\u00167\\!7x3\u000f\u0019hs\u001c\u0011j+N\u0004|", "1`a1", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "1qT.g,/W\u0019\u0011]h3{\t<", "DhTD:9Hc$", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "$hTD;6ER\u0019\f", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class CaptionedImageContentCardView extends BaseContentCardView<CaptionedImageCard> {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lkA0ZeP.XV0Ţm\u0012éT[Rp\u0004Fe\u001e\f\"!O|h̊rJh\r\u0014 \u0014\u0019\u0011lBH\u0004|ٕ\u0016\u0015:ԏ\bA9R}C\nq\u0003=\u001d\"H!f\u0002ڱ\u0005 2Ϻ(x\u0001LY\u0016bAN{RT#L3\u001eŪ\nD(ҵ6^mZDNǶaG"}, d2 = {"\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WMz%G#[\u001cB|\u001a8VC:O<\u001a\u0017h?C\u0010r,W\u0006\u0005CYM\u001d`R\u0005{\u0005\u0016Z 15\u0014\u0004YNy", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WMz%G#[*@|\u00167\\!7x3\u000f\u0019hs\u001c\u0011j+N\u0004|", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "uKR<`u;`\u0015\u0014z(<\u0001R-o\t7{I\u0010\u0015\u0013Tn\u001c\u0006\b)5kG}3x%2WL;j\u0018&\u0011ja\u0017\u0011l;N\u007f6%H[+MVrOixV\u0017M8\u0017\tX\u000b5rDIhx0I\u0014\u0011,q", "2db0e0Ib\u001d\t\u0004", "\u001a`]1e6BRb\u0011~].|\u0018xT\u007f;\u000b1\u0005\u0017)\u001d", "5dc\u0011X:<`\u001d\n\nb6\u0006", "u(;.a+K]\u001d}Dp0{\u000b/tI\u0017{S\u0010\b\u001bG\u0002c", "7lP4X\u001dBS+", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@q\u001b\u0017YE", "5dc\u0016`(@S\n\u0003zp", "u(;.a+K]\u001d}Dp0{\u000b/tI\f\u0004<\u0003\u0017\bKo \u0012", "Bhc9X", "5dc!\\;ES", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class ViewHolder extends ContentCardViewHolder {
        private final TextView description;
        private final ImageView imageView;
        final /* synthetic */ CaptionedImageContentCardView this$0;
        private final TextView title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(CaptionedImageContentCardView captionedImageContentCardView, View view) {
            super(view, captionedImageContentCardView.isUnreadIndicatorEnabled());
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = captionedImageContentCardView;
            this.title = (TextView) view.findViewById(R.id.com_braze_content_cards_captioned_image_title);
            this.description = (TextView) view.findViewById(R.id.com_braze_content_cards_captioned_image_description);
            this.imageView = (ImageView) view.findViewById(R.id.com_braze_content_cards_captioned_image_card_image);
        }

        public final TextView getDescription() {
            return this.description;
        }

        public final ImageView getImageView() {
            return this.imageView;
        }

        public final TextView getTitle() {
            return this.title;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptionedImageContentCardView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public void bindViewHolder(ContentCardViewHolder viewHolder, Card card) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(card, "card");
        if (card instanceof CaptionedImageCard) {
            super.bindViewHolder(viewHolder, card);
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            TextView title = viewHolder2.getTitle();
            if (title != null) {
                setOptionalTextView(title, ((CaptionedImageCard) card).getTitle());
            }
            TextView description = viewHolder2.getDescription();
            if (description != null) {
                setOptionalTextView(description, ((CaptionedImageCard) card).getDescription());
            }
            CaptionedImageCard captionedImageCard = (CaptionedImageCard) card;
            String domain = captionedImageCard.getDomain();
            String url = (domain == null || StringsKt.isBlank(domain)) ? card.getUrl() : captionedImageCard.getDomain();
            if (url != null) {
                viewHolder2.setActionHintText(url);
            }
            setOptionalCardImage(viewHolder2.getImageView(), captionedImageCard.getAspectRatio(), captionedImageCard.getImageUrl(), card);
            viewHolder.itemView.setContentDescription(captionedImageCard.getTitle() + " .  " + captionedImageCard.getDescription());
        }
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.com_braze_captioned_image_content_card, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        setViewBackground(view);
        return new ViewHolder(this, view);
    }
}
