package com.braze.ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.braze.models.cards.ImageOnlyCard;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.actions.IAction;
import com.braze.ui.feed.view.BaseFeedCardView;
import com.dynatrace.android.callback.Callback;

/* JADX INFO: loaded from: classes3.dex */
public class ImageOnlyCardView extends BaseFeedCardView<ImageOnlyCard> {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) ImageOnlyCardView.class);
    private float mAspectRatio;
    private IAction mCardAction;
    private final ImageView mImage;

    public ImageOnlyCardView(Context context) {
        this(context, null);
    }

    public ImageOnlyCardView(Context context, ImageOnlyCard imageOnlyCard) {
        super(context);
        this.mAspectRatio = 6.0f;
        ImageView imageView = (ImageView) getProperViewFromInflatedStub(R.id.com_braze_image_only_card_imageview_stub);
        this.mImage = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setAdjustViewBounds(true);
        if (imageOnlyCard != null) {
            setCard(imageOnlyCard);
        }
        setBackground(getResources().getDrawable(R.drawable.com_braze_card_background, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$onSetCard$-Lcom-braze-models-cards-ImageOnlyCard--V, reason: not valid java name */
    public static /* synthetic */ void m7074xd342ec8d(ImageOnlyCardView imageOnlyCardView, ImageOnlyCard imageOnlyCard, View view) {
        Callback.onClick_enter(view);
        try {
            imageOnlyCardView.lambda$onSetCard$0(imageOnlyCard, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    private /* synthetic */ void lambda$onSetCard$0(ImageOnlyCard imageOnlyCard, View view) {
        handleCardClick(this.applicationContext, imageOnlyCard, this.mCardAction);
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    protected int getLayoutResource() {
        return R.layout.com_braze_image_only_card;
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    public void onSetCard(final ImageOnlyCard imageOnlyCard) {
        if (imageOnlyCard.getAspectRatio() != 0.0f) {
            this.mAspectRatio = imageOnlyCard.getAspectRatio();
        }
        setImageViewToUrl(this.mImage, imageOnlyCard.getImageUrl(), this.mAspectRatio, imageOnlyCard);
        this.mCardAction = getUriActionForCard(imageOnlyCard);
        setOnClickListener(new View.OnClickListener() { // from class: com.braze.ui.widget.ImageOnlyCardView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ImageOnlyCardView.m7074xd342ec8d(this.f$0, imageOnlyCard, view);
            }
        });
    }
}
