package com.braze.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.GestureDetectorCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.ListFragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.braze.Braze;
import com.braze.enums.CardCategory;
import com.braze.events.FeedUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.ui.adapters.BrazeListAdapter;
import com.dynatrace.android.callback.Callback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class BrazeFeedFragment extends ListFragment implements SwipeRefreshLayout.OnRefreshListener {
    private static final long AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS = 2500;
    private static final int MAX_FEED_TTL_SECONDS = 60;
    private static final int NETWORK_PROBLEM_WARNING_MS = 5000;
    static final String SAVED_INSTANCE_STATE_KEY_CARD_CATEGORY = "CARD_CATEGORY";
    static final String SAVED_INSTANCE_STATE_KEY_CURRENT_CARD_INDEX_AT_BOTTOM_OF_SCREEN = "CURRENT_CARD_INDEX_AT_BOTTOM_OF_SCREEN";
    static final String SAVED_INSTANCE_STATE_KEY_PREVIOUS_VISIBLE_HEAD_CARD_INDEX = "PREVIOUS_VISIBLE_HEAD_CARD_INDEX";
    static final String SAVED_INSTANCE_STATE_KEY_SKIP_CARD_IMPRESSIONS_RESET = "SKIP_CARD_IMPRESSIONS_RESET";
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) BrazeFeedFragment.class);
    private BrazeListAdapter mAdapter;
    private EnumSet<CardCategory> mCategories;
    int mCurrentCardIndexAtBottomOfScreen;
    private LinearLayout mEmptyFeedLayout;
    private RelativeLayout mFeedRootLayout;
    private SwipeRefreshLayout mFeedSwipeLayout;
    private IEventSubscriber<FeedUpdatedEvent> mFeedUpdatedSubscriber;
    private GestureDetectorCompat mGestureDetector;
    private ProgressBar mLoadingSpinner;
    private final Handler mMainThreadLooper;
    private LinearLayout mNetworkErrorLayout;
    int mPreviousVisibleHeadCardIndex;
    private final Runnable mShowNetworkError;
    boolean mSkipCardImpressionsReset;
    private boolean mSortEnabled;
    private View mTransparentFullBoundsContainerView;

    public class FeedGestureListener extends GestureDetector.SimpleOnGestureListener {
        public FeedGestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            BrazeFeedFragment.this.getListView().smoothScrollBy(-((int) ((f3 * (2 * r3)) / 1000.0f)), (int) ((motionEvent2.getEventTime() - motionEvent.getEventTime()) * 4));
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            BrazeFeedFragment.this.getListView().smoothScrollBy((int) f3, 0);
            return true;
        }
    }

    public BrazeFeedFragment() throws Throwable {
        Class<?> cls = Class.forName(C1561oA.ud("\u0014 \u0015\"\u001e\u0017\u0011Y\u001a\u001dVs\u0016\u0015\u0015\t\u0015", (short) (OY.Xd() ^ 30375)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1607wl.Xd() ^ 31370);
        int[] iArr = new int["\f\u000b\u001bt\n\u0013\u0019w\u001c\u001d\u001f\u0015#".length()];
        QB qb = new QB("\f\u000b\u001bt\n\u0013\u0019w\u001c\u001d\u001f\u0015#");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            this.mMainThreadLooper = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.mShowNetworkError = new Runnable() { // from class: com.braze.ui.BrazeFeedFragment.1
                @Override // java.lang.Runnable
                public void run() {
                    if (BrazeFeedFragment.this.mLoadingSpinner != null) {
                        BrazeFeedFragment.this.mLoadingSpinner.setVisibility(8);
                    }
                    if (BrazeFeedFragment.this.mNetworkErrorLayout != null) {
                        BrazeFeedFragment.this.mNetworkErrorLayout.setVisibility(0);
                    }
                }
            };
            this.mSortEnabled = false;
            this.mSkipCardImpressionsReset = false;
            this.mPreviousVisibleHeadCardIndex = 0;
            this.mCurrentCardIndexAtBottomOfScreen = 0;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static /* synthetic */ boolean lambda$onViewCreated$1(View view, MotionEvent motionEvent) {
        return view.getVisibility() == 0;
    }

    static /* synthetic */ int lambda$sortFeedCards$4(Card card, Card card2) {
        if (card.isIndicatorHighlighted() == card2.isIndicatorHighlighted()) {
            return 0;
        }
        return card.isIndicatorHighlighted() ? 1 : -1;
    }

    private void setOnScreenCardsToRead() {
        this.mAdapter.batchSetCardsToRead(this.mPreviousVisibleHeadCardIndex, this.mCurrentCardIndexAtBottomOfScreen);
    }

    public EnumSet<CardCategory> getCategories() {
        return this.mCategories;
    }

    public boolean getSortEnabled() {
        return this.mSortEnabled;
    }

    /* JADX INFO: renamed from: lambda$onRefresh$5$com-braze-ui-BrazeFeedFragment, reason: not valid java name */
    /* synthetic */ void m7049lambda$onRefresh$5$combrazeuiBrazeFeedFragment() {
        this.mFeedSwipeLayout.setRefreshing(false);
    }

    /* JADX INFO: renamed from: lambda$onViewCreated$0$com-braze-ui-BrazeFeedFragment, reason: not valid java name */
    /* synthetic */ boolean m7050lambda$onViewCreated$0$combrazeuiBrazeFeedFragment(View view, MotionEvent motionEvent) {
        return this.mGestureDetector.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: lambda$onViewCreated$2$com-braze-ui-BrazeFeedFragment, reason: not valid java name */
    /* synthetic */ void m7051lambda$onViewCreated$2$combrazeuiBrazeFeedFragment(FeedUpdatedEvent feedUpdatedEvent, ListView listView) throws Throwable {
        String str = TAG;
        BrazeLogger.v(str, C1561oA.Yd("7SHFZPVP\nQQRR\u000ffZWjg\u0015_e\u0018k_nlllre!vr$Kkll^zom\u0002ssU\bw\u0002\tO6", (short) (C1633zX.Xd() ^ (-13671))) + feedUpdatedEvent);
        this.mMainThreadLooper.removeCallbacks(this.mShowNetworkError);
        this.mNetworkErrorLayout.setVisibility(8);
        if (feedUpdatedEvent.getCardCount(this.mCategories) == 0) {
            listView.setVisibility(8);
            this.mAdapter.clear();
        } else {
            this.mEmptyFeedLayout.setVisibility(8);
            this.mLoadingSpinner.setVisibility(8);
            this.mTransparentFullBoundsContainerView.setVisibility(8);
        }
        if (feedUpdatedEvent.isFromOfflineStorage() && (feedUpdatedEvent.lastUpdatedInSecondsFromEpoch() + 60) * 1000 < DateTimeUtils.nowInMilliseconds()) {
            BrazeLogger.i(str, Xg.qd(">^__\u001cocbejxhh%}h{)ywpr\u0001/\u0005ys\u00024\n~|8\u0007{\u0014<\u0012\b\r\u0006A\u0017\u0013D\u0012\u0010\u001e\u000eI\u001a\u0012Lc^O$\u0017\u0016##\u001a*cX\u001e$/-* 9*0*c.:f.8<j:<Ezo3GGsG;HM>MOEKE~AO\u0002XTIG[MM\naURe\u000fVca`\u0014i^\\\u0018l_mrbp-", (short) (C1580rY.Xd() ^ (-18834)), (short) (C1580rY.Xd() ^ (-23903))));
            Braze.getInstance(getContext()).requestFeedRefresh();
            if (feedUpdatedEvent.getCardCount(this.mCategories) == 0) {
                BrazeLogger.d(str, Jg.Wd("^\u001f`\u0005L5|d!\u0003\u0016p@\u0010A\rR?zWiX`CyHj,!e>\tH\u0001C;?!mM\u0003`\u0007Hnr\u0013hW\u0003\u0019ur/+\u0016[/YS\u0002Bnp*h&\u0006Ay:266b$yI\u0002J\tu,b\u001a\u0012\u001bq9\u0001^\u007fRfDCE-{&m\u000e0\u007f\u0010Pq\u0010k5\u001fefJ", (short) (C1633zX.Xd() ^ (-30041)), (short) (C1633zX.Xd() ^ (-25566))));
                this.mEmptyFeedLayout.setVisibility(8);
                this.mLoadingSpinner.setVisibility(0);
                this.mTransparentFullBoundsContainerView.setVisibility(0);
                Handler handler = this.mMainThreadLooper;
                Object[] objArr = {this.mShowNetworkError, 5000L};
                Method method = Class.forName(ZO.xd("\u0014}^d,D\u001383{'\u0015XY*\tl\u001f", (short) (Od.Xd() ^ (-28420)), (short) (Od.Xd() ^ (-23821)))).getMethod(Ig.wd(";\t+D3\u001f\u0012G<4=", (short) (C1607wl.Xd() ^ 20052)), Class.forName(C1626yg.Ud("M\u001bOlE#yW\u0003[j\u001fS2`6%$", (short) (ZN.Xd() ^ 6902), (short) (ZN.Xd() ^ 24287))), Long.TYPE);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
        if (feedUpdatedEvent.getCardCount(this.mCategories) == 0) {
            this.mLoadingSpinner.setVisibility(8);
            this.mEmptyFeedLayout.setVisibility(0);
            this.mTransparentFullBoundsContainerView.setVisibility(0);
        } else {
            if (!this.mSortEnabled || feedUpdatedEvent.getCardCount(this.mCategories) == feedUpdatedEvent.getUnreadCardCount(this.mCategories)) {
                this.mAdapter.replaceFeed(feedUpdatedEvent.getFeedCards(this.mCategories));
            } else {
                this.mAdapter.replaceFeed(sortFeedCards(feedUpdatedEvent.getFeedCards(this.mCategories)));
            }
            listView.setVisibility(0);
        }
        this.mFeedSwipeLayout.setRefreshing(false);
    }

    /* JADX INFO: renamed from: lambda$onViewCreated$3$com-braze-ui-BrazeFeedFragment, reason: not valid java name */
    /* synthetic */ void m7052lambda$onViewCreated$3$combrazeuiBrazeFeedFragment(final ListView listView, final FeedUpdatedEvent feedUpdatedEvent) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.braze.ui.BrazeFeedFragment$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.m7051lambda$onViewCreated$2$combrazeuiBrazeFeedFragment(feedUpdatedEvent, listView);
            }
        });
    }

    void loadFragmentStateFromSavedInstanceState(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (this.mCategories == null) {
            this.mCategories = CardCategory.getAllCategories();
        }
        this.mPreviousVisibleHeadCardIndex = bundle.getInt(SAVED_INSTANCE_STATE_KEY_PREVIOUS_VISIBLE_HEAD_CARD_INDEX, 0);
        this.mCurrentCardIndexAtBottomOfScreen = bundle.getInt(SAVED_INSTANCE_STATE_KEY_CURRENT_CARD_INDEX_AT_BOTTOM_OF_SCREEN, 0);
        this.mSkipCardImpressionsReset = bundle.getBoolean(SAVED_INSTANCE_STATE_KEY_SKIP_CARD_IMPRESSIONS_RESET, false);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(SAVED_INSTANCE_STATE_KEY_CARD_CATEGORY);
        if (stringArrayList != null) {
            this.mCategories.clear();
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                this.mCategories.add(CardCategory.valueOf(it.next()));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.mAdapter == null) {
            this.mAdapter = new BrazeListAdapter(context, R.id.tag, new ArrayList());
            this.mCategories = CardCategory.getAllCategories();
        }
        this.mGestureDetector = new GestureDetectorCompat(context, new FeedGestureListener());
    }

    @Override // androidx.fragment.app.ListFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.com_braze_feed, viewGroup, false);
        this.mNetworkErrorLayout = (LinearLayout) viewInflate.findViewById(R.id.com_braze_feed_network_error);
        this.mLoadingSpinner = (ProgressBar) viewInflate.findViewById(R.id.com_braze_feed_loading_spinner);
        this.mEmptyFeedLayout = (LinearLayout) viewInflate.findViewById(R.id.com_braze_feed_empty_feed);
        this.mFeedRootLayout = (RelativeLayout) viewInflate.findViewById(R.id.com_braze_feed_root);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate.findViewById(R.id.braze_feed_swipe_container);
        this.mFeedSwipeLayout = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        this.mFeedSwipeLayout.setEnabled(false);
        this.mFeedSwipeLayout.setColorSchemeResources(R.color.com_braze_newsfeed_swipe_refresh_color_1, R.color.com_braze_newsfeed_swipe_refresh_color_2, R.color.com_braze_newsfeed_swipe_refresh_color_3, R.color.com_braze_newsfeed_swipe_refresh_color_4);
        this.mTransparentFullBoundsContainerView = viewInflate.findViewById(R.id.com_braze_feed_transparent_full_bounds_container_view);
        return viewInflate;
    }

    @Override // androidx.fragment.app.ListFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Braze.getInstance(getContext()).removeSingleSubscription(this.mFeedUpdatedSubscriber, FeedUpdatedEvent.class);
        setOnScreenCardsToRead();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        setListAdapter(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        setOnScreenCardsToRead();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        Callback.onRefresh_enter();
        try {
            Braze.getInstance(getContext()).requestFeedRefresh();
            Handler handler = this.mMainThreadLooper;
            Runnable runnable = new Runnable() { // from class: com.braze.ui.BrazeFeedFragment$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m7049lambda$onRefresh$5$combrazeuiBrazeFeedFragment();
                }
            };
            Class<?> cls = Class.forName(EO.Od("B\naPT\u00132\u0004\u0018pAA\t\b}l\n9", (short) (ZN.Xd() ^ 2835)));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1561oA.Qd("\u001e\u0014(\u0012]\u001b\u000f\u001b\u0013X{\u001e\u0016\u0015\u0007\u0007\u0010\b", (short) (C1633zX.Xd() ^ (-2344))));
            clsArr[1] = Long.TYPE;
            Object[] objArr = {runnable, Long.valueOf(AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS)};
            short sXd = (short) (C1633zX.Xd() ^ (-30450));
            short sXd2 = (short) (C1633zX.Xd() ^ (-9233));
            int[] iArr = new int["\u0001\u0001\u0006\bXz\u0003x\u0012~~".length()];
            QB qb = new QB("\u0001\u0001\u0006\bXz\u0003x\u0012~~");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } finally {
            Callback.onRefresh_exit();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Braze.getInstance(getContext()).logFeedDisplayed();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(SAVED_INSTANCE_STATE_KEY_PREVIOUS_VISIBLE_HEAD_CARD_INDEX, this.mPreviousVisibleHeadCardIndex);
        bundle.putInt(SAVED_INSTANCE_STATE_KEY_CURRENT_CARD_INDEX_AT_BOTTOM_OF_SCREEN, this.mCurrentCardIndexAtBottomOfScreen);
        bundle.putBoolean(SAVED_INSTANCE_STATE_KEY_SKIP_CARD_IMPRESSIONS_RESET, this.mSkipCardImpressionsReset);
        if (this.mCategories == null) {
            this.mCategories = CardCategory.getAllCategories();
        }
        ArrayList<String> arrayList = new ArrayList<>(this.mCategories.size());
        Iterator it = this.mCategories.iterator();
        while (it.hasNext()) {
            arrayList.add(((CardCategory) it.next()).name());
        }
        bundle.putStringArrayList(SAVED_INSTANCE_STATE_KEY_CARD_CATEGORY, arrayList);
        super.onSaveInstanceState(bundle);
        if (isVisible()) {
            this.mSkipCardImpressionsReset = true;
        }
    }

    @Override // androidx.fragment.app.ListFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) throws Throwable {
        super.onViewCreated(view, bundle);
        loadFragmentStateFromSavedInstanceState(bundle);
        if (this.mSkipCardImpressionsReset) {
            this.mSkipCardImpressionsReset = false;
        } else {
            this.mAdapter.resetCardImpressionTracker();
            BrazeLogger.d(TAG, "Resetting card impressions.");
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getActivity());
        final ListView listView = getListView();
        listView.addHeaderView(layoutInflaterFrom.inflate(R.layout.com_braze_feed_header, (ViewGroup) null));
        listView.addFooterView(layoutInflaterFrom.inflate(R.layout.com_braze_feed_footer, (ViewGroup) null));
        this.mFeedRootLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.braze.ui.BrazeFeedFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return this.f$0.m7050lambda$onViewCreated$0$combrazeuiBrazeFeedFragment(view2, motionEvent);
            }
        });
        listView.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.braze.ui.BrazeFeedFragment.2
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
                BrazeFeedFragment.this.mFeedSwipeLayout.setEnabled(i2 == 0);
                if (i3 == 0) {
                    return;
                }
                int i5 = i2 - 1;
                if (i5 > BrazeFeedFragment.this.mPreviousVisibleHeadCardIndex) {
                    BrazeFeedFragment.this.mAdapter.batchSetCardsToRead(BrazeFeedFragment.this.mPreviousVisibleHeadCardIndex, i5);
                }
                BrazeFeedFragment.this.mPreviousVisibleHeadCardIndex = i5;
                BrazeFeedFragment.this.mCurrentCardIndexAtBottomOfScreen = i2 + i3;
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i2) {
            }
        });
        this.mTransparentFullBoundsContainerView.setOnTouchListener(new View.OnTouchListener() { // from class: com.braze.ui.BrazeFeedFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return BrazeFeedFragment.lambda$onViewCreated$1(view2, motionEvent);
            }
        });
        Braze.getInstance(getContext()).removeSingleSubscription(this.mFeedUpdatedSubscriber, FeedUpdatedEvent.class);
        this.mFeedUpdatedSubscriber = new IEventSubscriber() { // from class: com.braze.ui.BrazeFeedFragment$$ExternalSyntheticLambda4
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                this.f$0.m7052lambda$onViewCreated$3$combrazeuiBrazeFeedFragment(listView, (FeedUpdatedEvent) obj);
            }
        };
        Braze.getInstance(getContext()).subscribeToFeedUpdates(this.mFeedUpdatedSubscriber);
        listView.setAdapter((ListAdapter) this.mAdapter);
        Braze.getInstance(getContext()).requestFeedRefreshFromCache();
    }

    public void setCategories(EnumSet<CardCategory> enumSet) {
        if (enumSet == null) {
            BrazeLogger.i(TAG, "The categories passed into setCategories are null, BrazeFeedFragment is going to display all the cards in cache.");
            this.mCategories = CardCategory.getAllCategories();
        } else if (enumSet.isEmpty()) {
            BrazeLogger.w(TAG, "The categories set had no elements and have been ignored. Please pass a valid EnumSet of CardCategory.");
            return;
        } else if (enumSet.equals(this.mCategories)) {
            return;
        } else {
            this.mCategories = enumSet;
        }
        if (Braze.getInstance(getContext()) != null) {
            Braze.getInstance(getContext()).requestFeedRefreshFromCache();
        }
    }

    public void setCategory(CardCategory cardCategory) {
        setCategories(EnumSet.of(cardCategory));
    }

    public void setSortEnabled(boolean z2) {
        this.mSortEnabled = z2;
    }

    public List<Card> sortFeedCards(List<Card> list) {
        Collections.sort(list, new Comparator() { // from class: com.braze.ui.BrazeFeedFragment$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BrazeFeedFragment.lambda$sortFeedCards$4((Card) obj, (Card) obj2);
            }
        });
        return list;
    }
}
