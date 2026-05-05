package com.braze.ui.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.braze.models.cards.CaptionedImageCard;
import com.braze.models.cards.Card;
import com.braze.models.cards.ImageOnlyCard;
import com.braze.models.cards.ShortNewsCard;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.support.BrazeLogger;
import com.braze.ui.feed.view.BaseFeedCardView;
import com.braze.ui.widget.CaptionedImageCardView;
import com.braze.ui.widget.DefaultCardView;
import com.braze.ui.widget.ImageOnlyCardView;
import com.braze.ui.widget.ShortNewsCardView;
import com.braze.ui.widget.TextAnnouncementCardView;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class BrazeListAdapter extends ArrayAdapter<Card> {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) BrazeListAdapter.class);
    private final Set<String> mCardIdImpressions;
    private final Context mContext;

    public BrazeListAdapter(Context context, int i2, List<Card> list) {
        super(context, i2, list);
        this.mContext = context;
        this.mCardIdImpressions = new HashSet();
    }

    private void logCardImpression(Card card) {
        String id = card.getId();
        if (this.mCardIdImpressions.contains(id)) {
            BrazeLogger.v(TAG, "Already counted impression for card " + id);
        } else {
            this.mCardIdImpressions.add(id);
            card.logImpression();
            BrazeLogger.v(TAG, "Logged impression for card " + id);
        }
        if (card.getViewed()) {
            return;
        }
        card.setViewed(true);
    }

    @Override // android.widget.ArrayAdapter
    public synchronized void add(Card card) {
        super.add(card);
    }

    public void batchSetCardsToRead(int i2, int i3) {
        if (getCount() == 0) {
            BrazeLogger.d(TAG, "mAdapter is empty in setting some cards to viewed.");
            return;
        }
        int iMin = Math.min(getCount(), i3);
        for (int iMax = Math.max(0, i2); iMax < iMin; iMax++) {
            Card item = getItem(iMax);
            if (item == null) {
                BrazeLogger.d(TAG, "Card was null in setting some cards to viewed.");
                return;
            } else {
                if (!item.isIndicatorHighlighted()) {
                    item.setIndicatorHighlighted(true);
                }
            }
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i2) {
        Card item = getItem(i2);
        if (item instanceof ImageOnlyCard) {
            return 1;
        }
        if (item instanceof CaptionedImageCard) {
            return 2;
        }
        if (item instanceof ShortNewsCard) {
            return 3;
        }
        return item instanceof TextAnnouncementCard ? 4 : 0;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        BaseFeedCardView imageOnlyCardView;
        Card item = getItem(i2);
        if (view == null) {
            imageOnlyCardView = item instanceof ImageOnlyCard ? new ImageOnlyCardView(this.mContext) : item instanceof CaptionedImageCard ? new CaptionedImageCardView(this.mContext) : item instanceof ShortNewsCard ? new ShortNewsCardView(this.mContext) : item instanceof TextAnnouncementCard ? new TextAnnouncementCardView(this.mContext) : new DefaultCardView(this.mContext);
        } else {
            BrazeLogger.v(TAG, "Reusing convertView for rendering of item " + i2);
            imageOnlyCardView = (BaseFeedCardView) view;
        }
        BrazeLogger.v(TAG, "Using view of type: " + imageOnlyCardView.getClass().getName() + " for card at position " + i2 + ": " + item.toString());
        imageOnlyCardView.setCard(item);
        logCardImpression(item);
        return imageOnlyCardView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 5;
    }

    public synchronized void replaceFeed(List<Card> list) {
        int i2 = 0;
        setNotifyOnChange(false);
        if (list == null) {
            clear();
            notifyDataSetChanged();
            return;
        }
        BrazeLogger.d(TAG, "Replacing existing feed of " + getCount() + " cards with new feed containing " + list.size() + " cards.");
        int size = list.size();
        int i3 = 0;
        while (i2 < getCount()) {
            Card item = getItem(i2);
            Card card = i3 < size ? list.get(i3) : null;
            if (card == null || !card.equals(item)) {
                remove(item);
            } else {
                i2++;
                i3++;
            }
        }
        super.addAll(list.subList(i3, size));
        notifyDataSetChanged();
    }

    public void resetCardImpressionTracker() {
        this.mCardIdImpressions.clear();
    }
}
