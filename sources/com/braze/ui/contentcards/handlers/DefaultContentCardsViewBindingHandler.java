package com.braze.ui.contentcards.handlers;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.braze.enums.CardType;
import com.braze.models.cards.Card;
import com.braze.ui.contentcards.view.BaseContentCardView;
import com.braze.ui.contentcards.view.CaptionedImageContentCardView;
import com.braze.ui.contentcards.view.ContentCardViewHolder;
import com.braze.ui.contentcards.view.DefaultContentCardView;
import com.braze.ui.contentcards.view.ImageOnlyContentCardView;
import com.braze.ui.contentcards.view.ShortNewsContentCardView;
import com.braze.ui.contentcards.view.TextAnnouncementContentCardView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u0016DLcz\u0004I\u0006>.6B\u0015\"4\u0012\u000e\u0007nʑA0RkP.XS2\u000f\u0002{<$a%yCIs\"}8\tWNmgvJh\u000bKƤ\u000e\u0016\u000fj4I[xe\u0012%2JoE4UoS9ht<\u0006&F8\u0600\u0018!1\u001aXGHu\u0017\u0004Në\u00160Np\u0003X\u001bR\u001d\u001a@\f\u00054I8jnf:Xlc;]'3mPV?_^\u0006}\u0011T^?\r%dd0\t[C =S1\r\u0003_M\u000bWqk\u000e\u0019157ayg8h\u007fB#Y\\=a\u00015t\u0005\u007ffR;s{q[h\u000eV\t+\u007f\u001bD\u001c\u000e40x8;&~\u000e\u001e5\u0005r\u0002N~\u000f\u000fF\u000e\ry6E8079H3f\u007fg\u0002-\u0017c\n\u0019%\u001eQ\u0014\u001f%i\\&`C$\u0005\u0002_=iFMJ^\n\bK\u001c\u0011!f\u0010?\u001c0u\u0016_\u007f\u001fE/%ea\u007f7i\u0002\u0010`\\g%\u0016\u0011la\u0003jHn<\u001f\u001aEE!\f\tJ+\u0019<lbYD!]\u001ed\u0007,\u000b#&l{L!+\u0011|S\u0017kAܗ_ܦ)/nŽ֓r\t"}, d2 = {"\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}W?r.4`}-E7t.N?KrC{\u001fqp9\u0010r\nJ\u0004&U=R,n/vF\u0013\u0016c\u00101'\u0016\u0004`A1D", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}W?r.4`}-E7y\fWLJk=-rdn8\u0015T0N\t\u0004KUM0eTU9\u001d\u0011a\u000e[\u0001", "u(E", "1n]AX5M1\u0015\fyO0|\u001b\ra}+{", "", "\u001ab^:\")KO.~D^5\r\u0011=/]$\t?o+\"GE", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WMz%G#Z\u001cEms8VR;tC{\u0011u`*\u000bc>$", "2db0e0;Sv\t\u0004m,\u0006\u0018=", "", "5dc\u0010b5MS\"\u000eXZ9{\u0017 i\u007f:\\M\u000b\u001ftCm\u0011<", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1`a1G@IS", "5dc\u0016g,FD\u001d~\rM@\b\t", "1`a1f", "", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "/cP=g,K>#\r~m0\u0007\u0012", "=m16a+/W\u0019\u0011]h3{\t<", "", "DhTD;6ER\u0019\f", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WMz%G#[*@|\u00167\\!7x3\u000f\u0019hs\u001c\u0011j+N\u0004|", "=m2?X(MS\n\u0003zp\u000f\u0007\u0010.e\r", "DhTD:9Hc$", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "DhTDG@IS", "EqXAX\u001bH>\u0015\fx^3", "2dbA", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007}", "4kP4f", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class DefaultContentCardsViewBindingHandler implements IContentCardsViewBindingHandler {
    private final Map<CardType, BaseContentCardView<?>> contentCardViewCache = new LinkedHashMap();
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DefaultContentCardsViewBindingHandler> CREATOR = new Parcelable.Creator<DefaultContentCardsViewBindingHandler>() { // from class: com.braze.ui.contentcards.handlers.DefaultContentCardsViewBindingHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultContentCardsViewBindingHandler createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new DefaultContentCardsViewBindingHandler();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultContentCardsViewBindingHandler[] newArray(int i2) {
            return new DefaultContentCardsViewBindingHandler[i2];
        }
    };

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4ߚ}џg\u0001ˎ`D\u0014GnWY*Ƃo{B$,8\u007fDS[*\u007f2\t}Q\u0016i%N1ŗEǇ\n\u0016\u0001̓\u0082MY"}, d2 = {"\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}W?r.4`}-E7t.N?KrC{\u001fqp9\u0010r\nJ\u0004&U=R,n/vF\u0013\u0016c\u00101'\u0016\u0004`A1-\"A'\u0013(R\u0006EqV", "", "u(E", "\u0011Q4\u000eG\u0016+", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007$xG\u0001UtTo\nK\u00012\u000b", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}W?r.4`}-E7t.N?KrC{\u001fqp9\u0010r\nJ\u0004&U=R,n/vF\u0013\u0016c\u00101'\u0016\u0004`A1D", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardType.values().length];
            try {
                iArr[CardType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardType.CAPTIONED_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardType.SHORT_NEWS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardType.TEXT_ANNOUNCEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final BaseContentCardView<?> getContentCardsViewFromCache(Context context, CardType cardType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        if (!this.contentCardViewCache.containsKey(cardType) || this.contentCardViewCache.get(cardType) == null) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[cardType.ordinal()];
            this.contentCardViewCache.put(cardType, i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? new DefaultContentCardView(context) : new TextAnnouncementContentCardView(context) : new ShortNewsContentCardView(context) : new CaptionedImageContentCardView(context) : new ImageOnlyContentCardView(context));
        }
        BaseContentCardView<?> baseContentCardView = this.contentCardViewCache.get(cardType);
        return baseContentCardView == null ? new DefaultContentCardView(context) : baseContentCardView;
    }

    @Override // com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler
    public int getItemViewType(Context context, List<? extends Card> cards, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cards, "cards");
        if (i2 < 0 || i2 >= cards.size()) {
            return -1;
        }
        return cards.get(i2).getCardType().getValue();
    }

    @Override // com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler
    public void onBindViewHolder(Context context, List<? extends Card> cards, ContentCardViewHolder viewHolder, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (i2 < 0 || i2 >= cards.size()) {
            return;
        }
        Card card = cards.get(i2);
        getContentCardsViewFromCache(context, card.getCardType()).bindViewHolder(viewHolder, card);
    }

    @Override // com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler
    public ContentCardViewHolder onCreateViewHolder(Context context, List<? extends Card> cards, ViewGroup viewGroup, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        return getContentCardsViewFromCache(context, CardType.Companion.fromValue(i2)).createViewHolder(viewGroup);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i2) {
        Intrinsics.checkNotNullParameter(dest, "dest");
    }
}
