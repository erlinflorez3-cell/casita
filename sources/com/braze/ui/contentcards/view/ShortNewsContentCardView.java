package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.braze.models.cards.Card;
import com.braze.models.cards.ShortNewsCard;
import com.braze.ui.R;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007tjAӄLe^.Zݷ2\u000f\u0002{<$a$yCQU\"}(\nUb}˧\rW\u000b\u0011S\u0011\u0016\u0016'jZH\u000exj O=RsM4eok;žx6\u0013#z8F}\u001d\u0001H/x\u0014\u0005\u0001[K:\u0019`D~Bj\r{\u000e`&NL.\u000b6\\\u0016UfLzhR/Q\u000f0VĠ+n"}, d2 = {"\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WMz%G#k#Az%\u0017MUII>'$hjHd_9Mg+G^$", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WMz%G#Z\u001cEms8VR;tC{\u0011u`*\u000bc>$", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`5r\u0018I\u0006\u000e5k\f}3z\u0015\u0004", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "0h]1I0>e{\t\u0002],\n", "", "DhTD;6ER\u0019\f", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WMz%G#[*@|\u00167\\!7x3\u000f\u0019hs\u001c\u0011j+N\u0004|", "1`a1", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "1qT.g,/W\u0019\u0011]h3{\t<", "DhTD:9Hc$", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "\u0011n\\=T5B]\"", "$hTD;6ER\u0019\f", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class ShortNewsContentCardView extends BaseContentCardView<ShortNewsCard> {
    private static final float ASPECT_RATIO = 1.0f;
    public static final Companion Companion = new Companion(null);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00106Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WMz%G#k#Az%\u0017MUII>'$hjHd_9Mg+G^\r\nfZ}9\u001d\u0016d\u0017$", "", "u(E", "\u000fR?\u00126\u001b8@tm^H", "", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lkA0ZeP.XV0Ţm\u0012éT[Rp\u0004Fe\u001e\f\"!O|h̊rJh\r\u0014 \u0014\u0019\u0011lBH\u0004|ٕ\u0016\u0015:ԏ\bA9R}C\nq\u0003=\u001d\"H!f\u0002ڱ\u0005 2Ϻ(x\u0001LY\u0016bAN{RT#L3\u001eŪ\nD(ҵ6^mZDNǶaG"}, d2 = {"\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WMz%G#k#Az%\u0017MUII>'$hjHd_9Mg+G^\r\u001d`R\u0005 \u001e\u0019Y\u000e[\u0001", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WMz%G#[*@|\u00167\\!7x3\u000f\u0019hs\u001c\u0011j+N\u0004|", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "uKR<`u;`\u0015\u0014z(<\u0001R-o\t7{I\u0010\u0015\u0013Tn\u001c\u0006\b)5kG\u000e:w#=6CMy\u0012(\u001ewaB\u0016A([u\u0018KL`\u0002CN{<!\u001c^\r\u0018<\u0011\u0005k\u000b\u0015rDItK\u001d", "2db0e0Ib\u001d\t\u0004", "\u001a`]1e6BRb\u0011~].|\u0018xT\u007f;\u000b1\u0005\u0017)\u001d", "5dc\u0011X:<`\u001d\n\nb6\u0006", "u(;.a+K]\u001d}Dp0{\u000b/tI\u0017{S\u0010\b\u001bG\u0002c", "7lP4X\u001dBS+", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@q\u001b\u0017YE", "5dc\u0016`(@S\n\u0003zp", "u(;.a+K]\u001d}Dp0{\u000b/tI\f\u0004<\u0003\u0017\bKo \u0012", "Bhc9X", "5dc!\\;ES", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class ViewHolder extends ContentCardViewHolder {
        private final TextView description;
        private final ImageView imageView;
        final /* synthetic */ ShortNewsContentCardView this$0;
        private final TextView title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ShortNewsContentCardView shortNewsContentCardView, View view) {
            super(view, shortNewsContentCardView.isUnreadIndicatorEnabled());
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = shortNewsContentCardView;
            this.title = (TextView) view.findViewById(R.id.com_braze_content_cards_short_news_card_title);
            this.description = (TextView) view.findViewById(R.id.com_braze_content_cards_short_news_card_description);
            this.imageView = (ImageView) view.findViewById(R.id.com_braze_content_cards_short_news_card_image);
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
    public ShortNewsContentCardView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public void bindViewHolder(ContentCardViewHolder viewHolder, Card card) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(card, "card");
        if (card instanceof ShortNewsCard) {
            super.bindViewHolder(viewHolder, card);
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            TextView title = viewHolder2.getTitle();
            if (title != null) {
                setOptionalTextView(title, ((ShortNewsCard) card).getTitle());
            }
            TextView description = viewHolder2.getDescription();
            if (description != null) {
                setOptionalTextView(description, ((ShortNewsCard) card).getDescription());
            }
            ShortNewsCard shortNewsCard = (ShortNewsCard) card;
            String domain = shortNewsCard.getDomain();
            String url = (domain == null || StringsKt.isBlank(domain)) ? card.getUrl() : shortNewsCard.getDomain();
            if (url != null) {
                viewHolder2.setActionHintText(url);
            }
            setOptionalCardImage(viewHolder2.getImageView(), 1.0f, shortNewsCard.getImageUrl(), card);
            safeSetClipToOutline(viewHolder2.getImageView());
            viewHolder.itemView.setContentDescription(shortNewsCard.getTitle() + " . " + shortNewsCard.getDescription());
        }
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.com_braze_short_news_content_card, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        setViewBackground(view);
        return new ViewHolder(this, view);
    }
}
