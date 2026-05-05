package com.braze.ui.contentcards.adapters;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter;
import com.braze.ui.contentcards.view.ContentCardViewHolder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZO;
import yg.hg;

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
@Metadata(bv = {}, d1 = {"Яt\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`r2\u000f\u0002{<řc$\bCCU }*\teNo˧vJh)K\u000f\u0014\"\u0001j2L]xk3\u00172HoG3[uE9ft>\u0005.9*8\u007f\u0006\t\u001a8Q\u0018v\u0001FS\f 0Hp@V\u0015M\u001b\u001a\u001a\u0006D'\u00072rɡ~<Xnm:]#1hrNU`h{\u0003Mod+\u001bxy\u001eYCG9#)k\u00035WkI\u0011E\nC\u0015j7'YQ\"^F\\\u000e\u001d-+}\u0017ǁv&j\u0010\u001ap\u001a>CQyJ~\u0016X{\t\u0014%<2'L,\u00114;4~\b<L;\u0007\u001cN^\u001dvB.\u0017\u0012:%B\u00183YRaz\u001aoI7f7*\u001e=\"1\u001e\u0007!\nmTt])b\u0017i1\u007f`mL\\+q=\u001c\u001d7gJ6\u0012R_\u007f]\u001cA2%FO[g<iy\u0010k\\g%%\u0011la\u0002jHn;5\u0016\u007f8\u00170rD\u0013%\u001cTbuD\u0011{5\u001b\u001bF\u0018!EtwjGU\u0016\\v\u0001k\u0001L\f\u0012k4/;g\u0017\u0004\u000e\u0006_'ICz{\u0010\u0010x'\u0018Mfz\u0005\u0007frW\u001awt(PK\u000f~X\u000e\nof\fA2ou*`D1G\nEL\u0011LZA+\"&n1\u001e\r\u0004K$1\u0010Tx\u0017\u001eh\\\u001f\t.\r\u0012:\u000b\u0011:-owe\u001d4\u0007:hb|i\u001bG\u0002\u000ey\u007fLur\u001d\u001a\u0004\u0007\u0014 D\u001a\u007fewO!B\u0017)`(]OZ'}W]\u00147z+\u0002=J9@u\u000e\u0003v<bzJ}\\E)Mܨtן\fd\bט2R\tP{T9e\u0015ηtè]<V˻M\u0011- =\u0001\u001e%Sމ/ϡ+\u001d\u001eߐd;#mui\u001e;Pʯ\u0011֑xe\fϺ4D}picB=HI\b\u000fl1Tv\u0011P`p\b\nR\tb\u001daWw)/\u001b\u000fԎ\u0017ɣ\u0002p\u001f.\u0013\u0002dmZ\u0015u\u0011BB0<\u0002X\u0016\u001anE5\u0011{c\u0016\u0004Dйh\u05c8N\u000f\u0012ΚL=|\u00164=N[.Ņ\u000bޘ\ns ܽ\u05f6?\u0019"}, d2 = {"\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}W8u!@h}-E7s8VR;tC{\u0011u`\u0015\u0006_7]v4\u001d", "\u001a`]1e6BR,H\b^*\u0011\u00076e\r9\u007f@\u0013`)Kn\u0010<\u0006n\"Y{45t\u0016;>G;}ry\u0014dlH\u0007p\u0002", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WMz%G#[*@|\u00167\\!7x3\u000f\u0019hs\u001c\u0011j+N\u0004|", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}WIv#IW\u0005 D7y=MK*uD\u001c\u0018Ka@\u0012c9*u#R[N92", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ":`h<h;&O\"z|^9", "\u001a`]1e6BR,H\b^*\u0011\u00076e\r9\u007f@\u0013`)Kn\u0010<\u0006n\u001c]\u0007 3z|*aMKz\u001c\u001a\u001edc9\u00149", "1`a17(MO", "", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "1n]AX5M1\u0015\fyl\u001d\u0001\tAB\u00041zD\n\u0019yCx\rCv2", "\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}W?r.4`}-E7y\fWLJk=-rdn8\u0015T0N\t\u0004KUM0eTU9\u001d\u0011a\u000e[\u0001", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001fJ7#.KW9r4+&laKPu0Mx'V\u001650eRnJz\u000en\u0018^:t\u0001b=&nQ\r\u0006\r(Z}\u0005x\u0010\u0010\u001dW\u001cn~Q,vE\u0004\u001d?>6d[Y)\nK\u000bCl3s\fh,Z6G#\";\u001c\u0017qO5\n\taZV0\u0004pvG\"\n\u0016 Kli7Iog\u0019x0\u001eO\u0005yt.as2t:Yw\u001b", "6`]1_,K", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "7l_?X:LS\u0018\\vk+`\b=", "", "", "5dc\u0016`7KS'\rz]\nx\u0016.I~6", "u(;7T=:\u001d)\u000e~euc\r=tU", "Adc\u0016`7KS'\rz]\nx\u0016.I~6", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "7l_?X:LS\u0018\\vk+`\b=I\t7{M\n\u0013\u001e", "", "5dc\u0010T9=/(b\u0004],\u0010", "7mS2k", "", "5dc\u0016g,F1#\u000f\u0004m", "5dc\u0016g,F7\u0018", "", ">nb6g0H\\", "5dc\u0016g,FD\u001d~\rM@\b\t", "7r01T7MS&i\u0005l0\f\r9ni1i>\u000e\u0017\u0017P", "", "/cP=g,K>#\r~m0\u0007\u0012", "7r2<a;K] \\vk+X\u0018\u001ao\u000e,\u000bD\u000b ", "7r8;i(EW\u0018b\u0004],\u0010", "7r8AX4\u001dW'\u0007~l:x\u00066e", ":nV\u0016`7KS'\r~h5", "", "1`a1", ";`a8B5,Q&~zg\nx\u0016.s[6h@|\u0016", "=m16a+/W\u0019\u0011]h3{\t<", "DhTD;6ER\u0019\f", "=m2?X(MS\n\u0003zp\u000f\u0007\u0010.e\r", "DhTD:9Hc$", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "DhTDG@IS", "=m8AX4\u001dW'\u0007~l:", "=mE6X>\u001ab(zxa,{w9W\u00041zJ\u0013", "6n[1X9", "=mE6X>\u001dS(zxa,{i<o\b\u001a\u007fI\u007f!)", "@d_9T*>1\u0015\fyl", "<df\u0010T9=2\u0015\u000ev", "\u0011`a1?0Lbw\u0003{_\nx\u00106b{&\u0002", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class ContentCardAdapter extends RecyclerView.Adapter<ContentCardViewHolder> implements ItemTouchHelperAdapter {
    private final List<Card> cardData;
    private final IContentCardsViewBindingHandler contentCardsViewBindingHandler;
    private final Context context;
    private final Handler handler;
    private Set<String> impressedCardIdsInternal;
    private final LinearLayoutManager layoutManager;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLш|\u0004O$8\u000bDB\u0007\"2\u0013\u007f\u0007tsAӄLeV4ZS0\u0013q{Jř\f$ B{t*\b0\tgTwi~J\t\rq\u0010\u0016 \u0007mDOezm\u0012=4ppУ7M}A\u0002v\u0003;\u001d `(h}\u0013\b2*v\u0018'~QT$\u0012^H7N\u001b#[\u000f2\u00124DP\u0005,c\u007fNdP\u001daH8;\u0003\u0018J\u0015;(F\u000bX%F\u0003-=zo%C@e=E)a\f\u001fR\nGI?:C\u0013t?'YQ:k~^\u000e!-+}\u0015$\u0007vn\u0013Tx\u00127-_cyR<)N߁}Ɂ@\u0004\u0016ͺwZ<-2l\u0018\u0010Ct!UnQXތDȸ~a>ЍԄ\u0004A"}, d2 = {"\u001ab^:\")KO.~Dn0F\u00079n\u000f(\u0005O~\u0013$F}W8u!@h}-E7s8VR;tC{\u0011u`\u0015\u0006_7]v4\u0006*J9[9vK#p^\u000fO\t\t\f`> lJ\r", "\u001a`]1e6BR,H\b^*\u0011\u00076e\r9\u007f@\u0013`)Kn\u0010<\u0006n\u0014]~!'|\u001a5\f!7r;\u001b\u0011fg\u000f", "=kS\u0010T9=a", "", "\u001ab^:\")KO.~Df6{\t6sI&wM\u007f%`%k\u001b;L", "<df\u0010T9=a", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`'Vs\u0015\u0006])ChSc(", "/qT\u0010b5MS\"\u000e\tM/|v+m\u007f", "", "=kS\u0016g,F>#\r~m0\u0007\u0012", "", "<df\u0016g,F>#\r~m0\u0007\u0012", "/qT\u0016g,Fa\b\u0002zL(\u0005\t", "2n8AX4LA\u001cz\b^\u0010{\u0017", "5dc\u001bX>%W'\u000ehbA|", "5dc\u001c_+%W'\u000ehbA|", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class CardListDiffCallback extends DiffUtil.Callback {
        private final List<Card> newCards;
        private final List<Card> oldCards;

        /* JADX WARN: Multi-variable type inference failed */
        public CardListDiffCallback(List<? extends Card> oldCards, List<? extends Card> newCards) {
            Intrinsics.checkNotNullParameter(oldCards, "oldCards");
            Intrinsics.checkNotNullParameter(newCards, "newCards");
            this.oldCards = oldCards;
            this.newCards = newCards;
        }

        private final boolean doItemsShareIds(int i2, int i3) {
            return Intrinsics.areEqual(this.oldCards.get(i2).getId(), this.newCards.get(i3).getId());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i2, int i3) {
            return doItemsShareIds(i2, i3);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i2, int i3) {
            return doItemsShareIds(i2, i3);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            return this.newCards.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            return this.oldCards.size();
        }
    }

    public ContentCardAdapter(Context context, LinearLayoutManager linearLayoutManager, List<Card> list, IContentCardsViewBindingHandler iContentCardsViewBindingHandler) throws Throwable {
        Intrinsics.checkNotNullParameter(context, hg.Vd("1<:?/A<", (short) (Od.Xd() ^ (-1126)), (short) (Od.Xd() ^ (-5934))));
        Intrinsics.checkNotNullParameter(linearLayoutManager, C1561oA.ud("k_vkpnFYeW\\Ye", (short) (Od.Xd() ^ (-28627))));
        short sXd = (short) (OY.Xd() ^ 811);
        int[] iArr = new int[">;K<#?Q=".length()];
        QB qb = new QB(">;K<#?Q=");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(list, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(iContentCardsViewBindingHandler, C1561oA.Yd("[hhoakrBasfvZnk~Jrxou{uWq\u007fv\u007fy\b", (short) (FB.Xd() ^ 20967)));
        this.context = context;
        this.layoutManager = linearLayoutManager;
        this.cardData = list;
        this.contentCardsViewBindingHandler = iContentCardsViewBindingHandler;
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Xg.qd("\u001f-$31,(r5:u\u00159:<2@", (short) (OY.Xd() ^ 23501), (short) (OY.Xd() ^ 15183))).getDeclaredMethod(Jg.Wd("}Cj\u000f\u001b7\u0004]\u0019`UV;", (short) (C1607wl.Xd() ^ 27852), (short) (C1607wl.Xd() ^ 29167)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.impressedCardIdsInternal = new LinkedHashSet();
            setHasStableIds(true);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final boolean isInvalidIndex(int i2) {
        return i2 < 0 || i2 >= this.cardData.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void markOnScreenCardsAsRead$lambda$1(int i2, int i3, ContentCardAdapter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.notifyItemRangeChanged(i3, (i2 - i3) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewDetachedFromWindow$lambda$0(ContentCardAdapter this$0, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.notifyItemChanged(i2);
    }

    public final Card getCardAtIndex(final int i2) {
        if (!isInvalidIndex(i2)) {
            return this.cardData.get(i2);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter.getCardAtIndex.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Cannot return card at index: " + i2 + " in cards list of size: " + this.cardData.size();
            }
        }, 7, (Object) null);
        return null;
    }

    public final List<String> getImpressedCardIds() {
        return CollectionsKt.toList(this.impressedCardIdsInternal);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.cardData.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i2) {
        String id;
        Card cardAtIndex = getCardAtIndex(i2);
        if (cardAtIndex == null || (id = cardAtIndex.getId()) == null) {
            return 0L;
        }
        return id.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        return this.contentCardsViewBindingHandler.getItemViewType(this.context, this.cardData, i2);
    }

    public final boolean isAdapterPositionOnScreen(int i2) {
        return Math.min(this.layoutManager.findFirstVisibleItemPosition(), this.layoutManager.findFirstCompletelyVisibleItemPosition()) <= i2 && i2 <= Math.max(this.layoutManager.findLastVisibleItemPosition(), this.layoutManager.findLastCompletelyVisibleItemPosition());
    }

    public final boolean isControlCardAtPosition(int i2) {
        Card cardAtIndex = getCardAtIndex(i2);
        return cardAtIndex != null && cardAtIndex.isControl();
    }

    @Override // com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter
    public boolean isItemDismissable(int i2) {
        if (this.cardData.isEmpty() || isInvalidIndex(i2)) {
            return false;
        }
        return this.cardData.get(i2).isDismissibleByUser();
    }

    public final void logImpression(final Card card) {
        if (card == null) {
            return;
        }
        if (this.impressedCardIdsInternal.contains(card.getId())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter.logImpression.2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Already counted impression for card " + card.getId();
                }
            }, 6, (Object) null);
        } else {
            card.logImpression();
            this.impressedCardIdsInternal.add(card.getId());
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter.logImpression.1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Logged impression for card " + card.getId();
                }
            }, 6, (Object) null);
        }
        if (card.getViewed()) {
            return;
        }
        card.setViewed(true);
    }

    public final void markOnScreenCardsAsRead() throws Throwable {
        if (this.cardData.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter.markOnScreenCardsAsRead.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Card list is empty. Not marking on-screen cards as read.";
                }
            }, 7, (Object) null);
            return;
        }
        final int iFindFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
        final int iFindLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter.markOnScreenCardsAsRead.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Not marking all on-screen cards as read. Either the first or last index is negative. First visible: " + iFindFirstVisibleItemPosition + " . Last visible: " + iFindLastVisibleItemPosition;
                }
            }, 7, (Object) null);
            return;
        }
        if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
            int i2 = iFindFirstVisibleItemPosition;
            while (true) {
                Card cardAtIndex = getCardAtIndex(i2);
                if (cardAtIndex != null) {
                    cardAtIndex.setIndicatorHighlighted(true);
                }
                if (i2 == iFindLastVisibleItemPosition) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        Handler handler = this.handler;
        Runnable runnable = new Runnable() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ContentCardAdapter.markOnScreenCardsAsRead$lambda$1(iFindLastVisibleItemPosition, iFindFirstVisibleItemPosition, this);
            }
        };
        Class<?> cls = Class.forName(ZO.xd("&nasJ\u0007%a\u0003hQRA[\n`A\u001f", (short) (OY.Xd() ^ 24319), (short) (OY.Xd() ^ 29341)));
        Class<?>[] clsArr = {Class.forName(C1626yg.Ud("75\u0016S\u001a!\u0016*\t\u000eN5}\u00190qp\u001a", (short) (C1633zX.Xd() ^ (-30742)), (short) (C1633zX.Xd() ^ (-13388))))};
        Object[] objArr = {runnable};
        short sXd = (short) (Od.Xd() ^ (-32556));
        int[] iArr = new int["\u001bt\u0007$".length()];
        QB qb = new QB("\u001bt\u0007$");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ContentCardViewHolder viewHolder, int i2) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.contentCardsViewBindingHandler.onBindViewHolder(this.context, this.cardData, viewHolder, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ContentCardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        return this.contentCardsViewBindingHandler.onCreateViewHolder(this.context, this.cardData, viewGroup, i2);
    }

    @Override // com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter
    public void onItemDismiss(final int i2) {
        if (isInvalidIndex(i2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter.onItemDismiss.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Cannot dismiss card at index: " + i2 + " in cards list of size: " + this.cardData.size();
                }
            }, 7, (Object) null);
            return;
        }
        Card cardRemove = this.cardData.remove(i2);
        cardRemove.setDismissed(true);
        notifyItemRemoved(i2);
        IContentCardsActionListener contentCardsActionListener = BrazeContentCardsManager.Companion.getInstance().getContentCardsActionListener();
        if (contentCardsActionListener != null) {
            contentCardsActionListener.onContentCardDismissed(this.context, cardRemove);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(ContentCardViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (this.cardData.isEmpty()) {
            return;
        }
        final int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || !isAdapterPositionOnScreen(bindingAdapterPosition)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter.onViewAttachedToWindow.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "The card at position " + bindingAdapterPosition + " isn't on screen or does not have a valid adapter position. Not logging impression.";
                }
            }, 6, (Object) null);
        } else {
            logImpression(getCardAtIndex(bindingAdapterPosition));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(ContentCardViewHolder contentCardViewHolder) throws Throwable {
        short sXd = (short) (Od.Xd() ^ (-352));
        int[] iArr = new int["O\u007f/O9\u0013".length()];
        QB qb = new QB("O\u007f/O9\u0013");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(contentCardViewHolder, new String(iArr, 0, i2));
        super.onViewDetachedFromWindow(contentCardViewHolder);
        if (this.cardData.isEmpty()) {
            return;
        }
        final int bindingAdapterPosition = contentCardViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || !isAdapterPositionOnScreen(bindingAdapterPosition)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter.onViewDetachedFromWindow.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "The card at position " + bindingAdapterPosition + " isn't on screen or does not have a valid adapter position. Not marking as read.";
                }
            }, 6, (Object) null);
            return;
        }
        Card cardAtIndex = getCardAtIndex(bindingAdapterPosition);
        if (cardAtIndex == null || cardAtIndex.isIndicatorHighlighted()) {
            return;
        }
        cardAtIndex.setIndicatorHighlighted(true);
        Handler handler = this.handler;
        Runnable runnable = new Runnable() { // from class: com.braze.ui.contentcards.adapters.ContentCardAdapter$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ContentCardAdapter.onViewDetachedFromWindow$lambda$0(this.f$0, bindingAdapterPosition);
            }
        };
        Class<?> cls = Class.forName(C1561oA.Qd("GSHUQJD\rMP\n#;G<C;G", (short) (OY.Xd() ^ 28301)));
        Class<?>[] clsArr = new Class[1];
        short sXd2 = (short) (FB.Xd() ^ 12631);
        short sXd3 = (short) (FB.Xd() ^ 21063);
        int[] iArr2 = new int["|t\u000bvD\u0004y\b\u0002In\u0013\r\u000e\u0002\u0004\u000f\t".length()];
        QB qb2 = new QB("|t\u000bvD\u0004y\b\u0002In\u0013\r\u000e\u0002\u0004\u000f\t");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {runnable};
        Method method = cls.getMethod(C1561oA.od("\u0015\u0013\u0016\u0016", (short) (C1607wl.Xd() ^ 13690)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final synchronized void replaceCards(List<? extends Card> newCardData) {
        Intrinsics.checkNotNullParameter(newCardData, "newCardData");
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new CardListDiffCallback(this.cardData, newCardData));
        Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "calculateDiff(diffCallback)");
        this.cardData.clear();
        this.cardData.addAll(newCardData);
        diffResultCalculateDiff.dispatchUpdatesTo(this);
    }

    public final void setImpressedCardIds(List<String> impressedCardIds) {
        Intrinsics.checkNotNullParameter(impressedCardIds, "impressedCardIds");
        this.impressedCardIdsInternal = CollectionsKt.toMutableSet(impressedCardIds);
    }
}
