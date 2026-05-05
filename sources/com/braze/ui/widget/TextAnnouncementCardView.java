package com.braze.ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.actions.IAction;
import com.braze.ui.feed.view.BaseFeedCardView;
import com.dynatrace.android.callback.Callback;

/* JADX INFO: loaded from: classes3.dex */
public class TextAnnouncementCardView extends BaseFeedCardView<TextAnnouncementCard> {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) TextAnnouncementCardView.class);
    private IAction mCardAction;
    private final TextView mDescription;
    private final TextView mDomain;
    private final TextView mTitle;

    public TextAnnouncementCardView(Context context) {
        this(context, null);
    }

    public TextAnnouncementCardView(Context context, TextAnnouncementCard textAnnouncementCard) {
        super(context);
        this.mTitle = (TextView) findViewById(R.id.com_braze_text_announcement_card_title);
        this.mDescription = (TextView) findViewById(R.id.com_braze_text_announcement_card_description);
        this.mDomain = (TextView) findViewById(R.id.com_braze_text_announcement_card_domain);
        if (textAnnouncementCard != null) {
            setCard(textAnnouncementCard);
        }
        setBackground(getResources().getDrawable(R.drawable.com_braze_card_background, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$onSetCard$-Lcom-braze-models-cards-TextAnnouncementCard--V, reason: not valid java name */
    public static /* synthetic */ void m7078x9623bfa4(TextAnnouncementCardView textAnnouncementCardView, TextAnnouncementCard textAnnouncementCard, View view) {
        Callback.onClick_enter(view);
        try {
            textAnnouncementCardView.lambda$onSetCard$0(textAnnouncementCard, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    private /* synthetic */ void lambda$onSetCard$0(TextAnnouncementCard textAnnouncementCard, View view) {
        handleCardClick(this.applicationContext, textAnnouncementCard, this.mCardAction);
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    protected int getLayoutResource() {
        return R.layout.com_braze_text_announcement_card;
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    public void onSetCard(final TextAnnouncementCard textAnnouncementCard) {
        this.mTitle.setText(textAnnouncementCard.getTitle());
        this.mDescription.setText(textAnnouncementCard.getDescription());
        setOptionalTextView(this.mDomain, textAnnouncementCard.getDomain());
        this.mCardAction = getUriActionForCard(textAnnouncementCard);
        setOnClickListener(new View.OnClickListener() { // from class: com.braze.ui.widget.TextAnnouncementCardView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextAnnouncementCardView.m7078x9623bfa4(this.f$0, textAnnouncementCard, view);
            }
        });
    }
}
