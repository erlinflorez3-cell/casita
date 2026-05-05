package com.braze.ui.feed.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import com.braze.models.cards.Card;
import com.braze.models.cards.ICardListener;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.actions.IAction;
import com.braze.ui.feed.BrazeFeedManager;
import com.braze.ui.feed.BrazeImageSwitcher;
import com.braze.ui.widget.BaseCardView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.Qg;
import yg.Wg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseFeedCardView<T extends Card> extends BaseCardView<T> {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) BaseCardView.class);

    public BaseFeedCardView(Context context) throws Throwable {
        super(context);
        Object[] objArr = {C1561oA.Xd("h^wnuualrkrh|n|", (short) (C1580rY.Xd() ^ (-4464)))};
        Method method = Class.forName(Wg.vd(";I<KE@8\u0003ERNUCMP\u000b-ZV]K_X", (short) (FB.Xd() ^ 27050))).getMethod(hg.Vd("vs\u0002_\u0005}}mtYjvykde", (short) (FB.Xd() ^ 32339), (short) (FB.Xd() ^ 31606)), Class.forName(Qg.kd("f\\pZ&cWc[!EebX\\T", (short) (ZN.Xd() ^ 30467), (short) (ZN.Xd() ^ 28822))));
        try {
            method.setAccessible(true);
            ((LayoutInflater) method.invoke(context, objArr)).inflate(getLayoutResource(), this);
            this.imageSwitcher = (BrazeImageSwitcher) findViewById(R.id.com_braze_newsfeed_item_read_indicator_image_switcher);
            if (this.imageSwitcher != null) {
                this.imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: com.braze.ui.feed.view.BaseFeedCardView$$ExternalSyntheticLambda0
                    @Override // android.widget.ViewSwitcher.ViewFactory
                    public final View makeView() {
                        return this.f$0.m7061lambda$new$0$combrazeuifeedviewBaseFeedCardView();
                    }
                });
            }
            if (isUnreadIndicatorEnabled() || this.imageSwitcher == null) {
                return;
            }
            this.imageSwitcher.setVisibility(8);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public Card getCard() {
        return this.card;
    }

    protected abstract int getLayoutResource();

    public View getProperViewFromInflatedStub(int i2) {
        ((ViewStub) findViewById(i2)).inflate();
        return findViewById(R.id.com_braze_stubbed_feed_image_view);
    }

    @Override // com.braze.ui.widget.BaseCardView
    protected boolean isClickHandled(Context context, Card card, IAction iAction) {
        return BrazeFeedManager.getInstance().getFeedCardClickActionListener().onFeedCardClicked(context, card, iAction);
    }

    /* JADX INFO: renamed from: lambda$new$0$com-braze-ui-feed-view-BaseFeedCardView, reason: not valid java name */
    /* synthetic */ View m7061lambda$new$0$combrazeuifeedviewBaseFeedCardView() {
        return new ImageView(this.applicationContext);
    }

    /* JADX INFO: renamed from: lambda$setCard$1$com-braze-ui-feed-view-BaseFeedCardView, reason: not valid java name */
    /* synthetic */ void m7062lambda$setCard$1$combrazeuifeedviewBaseFeedCardView() {
        setCardViewedIndicator(this.imageSwitcher, getCard());
    }

    protected abstract void onSetCard(T t2);

    public void setCard(T t2) {
        this.card = t2;
        onSetCard(this.card);
        this.card.setListener(new ICardListener() { // from class: com.braze.ui.feed.view.BaseFeedCardView$$ExternalSyntheticLambda1
            @Override // com.braze.models.cards.ICardListener
            public final void onCardUpdate() {
                this.f$0.m7062lambda$setCard$1$combrazeuifeedviewBaseFeedCardView();
            }
        });
        setCardViewedIndicator(this.imageSwitcher, getCard());
    }
}
