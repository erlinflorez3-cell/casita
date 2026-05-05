package com.braze.ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.braze.models.cards.ShortNewsCard;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.actions.IAction;
import com.braze.ui.feed.view.BaseFeedCardView;
import com.dynatrace.android.callback.Callback;

/* JADX INFO: loaded from: classes3.dex */
public class ShortNewsCardView extends BaseFeedCardView<ShortNewsCard> {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) ShortNewsCardView.class);
    private final float mAspectRatio;
    private IAction mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private final ImageView mImage;
    private final TextView mTitle;

    public ShortNewsCardView(Context context) {
        this(context, null);
    }

    public ShortNewsCardView(Context context, ShortNewsCard shortNewsCard) {
        super(context);
        this.mAspectRatio = 1.0f;
        this.mDescription = (TextView) findViewById(R.id.com_braze_short_news_card_description);
        this.mTitle = (TextView) findViewById(R.id.com_braze_short_news_card_title);
        this.mDomain = (TextView) findViewById(R.id.com_braze_short_news_card_domain);
        ImageView imageView = (ImageView) getProperViewFromInflatedStub(R.id.com_braze_short_news_card_imageview_stub);
        this.mImage = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setAdjustViewBounds(true);
        if (shortNewsCard != null) {
            setCard(shortNewsCard);
        }
        setBackground(getResources().getDrawable(R.drawable.com_braze_card_background, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$onSetCard$-Lcom-braze-models-cards-ShortNewsCard--V, reason: not valid java name */
    public static /* synthetic */ void m7076xb3078dc5(ShortNewsCardView shortNewsCardView, ShortNewsCard shortNewsCard, View view) {
        Callback.onClick_enter(view);
        try {
            shortNewsCardView.lambda$onSetCard$0(shortNewsCard, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    private /* synthetic */ void lambda$onSetCard$0(ShortNewsCard shortNewsCard, View view) {
        handleCardClick(this.applicationContext, shortNewsCard, this.mCardAction);
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    protected int getLayoutResource() {
        return R.layout.com_braze_short_news_card;
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    public void onSetCard(final ShortNewsCard shortNewsCard) {
        this.mDescription.setText(shortNewsCard.getDescription());
        setOptionalTextView(this.mTitle, shortNewsCard.getTitle());
        setOptionalTextView(this.mDomain, shortNewsCard.getDomain());
        this.mCardAction = getUriActionForCard(shortNewsCard);
        setOnClickListener(new View.OnClickListener() { // from class: com.braze.ui.widget.ShortNewsCardView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShortNewsCardView.m7076xb3078dc5(this.f$0, shortNewsCard, view);
            }
        });
        setImageViewToUrl(this.mImage, shortNewsCard.getImageUrl(), 1.0f, shortNewsCard);
    }
}
