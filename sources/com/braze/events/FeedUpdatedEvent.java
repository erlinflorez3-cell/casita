package com.braze.events;

import com.braze.enums.CardCategory;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedUpdatedEvent {
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) FeedUpdatedEvent.class);
    private final List<Card> mFeedCards;
    private final boolean mFromOfflineStorage;
    private final long mTimestamp;
    private final String mUserId;

    public FeedUpdatedEvent(List<Card> list, String str, boolean z2, long j2) {
        this.mUserId = str;
        this.mFromOfflineStorage = z2;
        list.getClass();
        this.mFeedCards = list;
        this.mTimestamp = j2;
    }

    public int getCardCount() {
        return getCardCount(CardCategory.getAllCategories());
    }

    public int getCardCount(CardCategory cardCategory) {
        return getCardCount(EnumSet.of(cardCategory));
    }

    public int getCardCount(EnumSet<CardCategory> enumSet) {
        if (enumSet == null) {
            BrazeLogger.i(TAG, "The categories passed into getCardCount are null, FeedUpdatedEvent is going to return the count of all the cards in cache.");
            return this.mFeedCards.size();
        }
        if (!enumSet.isEmpty()) {
            return getFeedCards(enumSet).size();
        }
        BrazeLogger.w(TAG, "The parameters passed into categories are not valid, Braze is returning 0 in getCardCount().Please pass in a non-empty EnumSet of CardCategory.");
        return 0;
    }

    public List<Card> getFeedCards() {
        return getFeedCards(CardCategory.getAllCategories());
    }

    public List<Card> getFeedCards(CardCategory cardCategory) {
        return getFeedCards(EnumSet.of(cardCategory));
    }

    public List<Card> getFeedCards(EnumSet<CardCategory> enumSet) {
        if (enumSet == null) {
            try {
                BrazeLogger.i(TAG, "The categories passed to getFeedCards are null, FeedUpdatedEvent is going to return all the cards in cache.");
                enumSet = CardCategory.getAllCategories();
            } catch (Exception e2) {
                BrazeLogger.w(TAG, "Unable to get cards with categories[" + enumSet + "]. Ignoring.", e2);
                return null;
            }
        }
        if (enumSet.isEmpty()) {
            BrazeLogger.w(TAG, "The parameter passed into categories is not valid, Braze is returning an empty card list.Please pass in a non-empty EnumSet of CardCategory for getFeedCards().");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Card card : this.mFeedCards) {
            if (card.isInCategorySet(enumSet) && !card.isExpired()) {
                arrayList.add(card);
            }
        }
        return arrayList;
    }

    public int getUnreadCardCount() {
        return getUnreadCardCount(CardCategory.getAllCategories());
    }

    public int getUnreadCardCount(CardCategory cardCategory) {
        return getUnreadCardCount(EnumSet.of(cardCategory));
    }

    public int getUnreadCardCount(EnumSet<CardCategory> enumSet) {
        if (enumSet == null) {
            BrazeLogger.w(TAG, "The categories passed to getUnreadCardCount are null, FeedUpdatedEvent is going to return the count of all the unread cards in cache.");
            return getUnreadCardCount(CardCategory.getAllCategories());
        }
        int i2 = 0;
        if (enumSet.isEmpty()) {
            BrazeLogger.w(TAG, "The parameters passed into categories are Empty, Braze is returning 0 in getUnreadCardCount().Please pass in a non-empty EnumSet of CardCategory.");
            return 0;
        }
        for (Card card : this.mFeedCards) {
            if (card.isInCategorySet(enumSet) && !card.getViewed() && !card.isExpired()) {
                i2++;
            }
        }
        return i2;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public boolean isFromOfflineStorage() {
        return this.mFromOfflineStorage;
    }

    public long lastUpdatedInSecondsFromEpoch() {
        return this.mTimestamp;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FeedUpdatedEvent{mFeedCards=");
        sb.append(this.mFeedCards);
        sb.append(", mUserId='").append(this.mUserId).append("', mFromOfflineStorage=");
        sb.append(this.mFromOfflineStorage);
        sb.append(", mTimestamp=").append(this.mTimestamp);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
