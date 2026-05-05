package com.braze.ui;

import android.app.Activity;
import android.app.ListFragment;
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
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.braze.Braze;
import com.braze.IBraze;
import com.braze.enums.CardCategory;
import com.braze.events.FeedUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.ui.adapters.BrazeListAdapter;
import com.dynatrace.android.callback.Callback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.EnumSet;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class BrazeXamarinFormsFeedFragment extends ListFragment implements SwipeRefreshLayout.OnRefreshListener {
    private static final long AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS = 2500;
    private static final int MAX_FEED_TTL_SECONDS = 60;
    private static final int NETWORK_PROBLEM_WARNING_MS = 5000;
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) BrazeXamarinFormsFeedFragment.class);
    private int currentCardIndexAtBottomOfScreen;
    private BrazeListAdapter mAdapter;
    private IBraze mBraze;
    private EnumSet<CardCategory> mCategories;
    private LinearLayout mEmptyFeedLayout;
    private RelativeLayout mFeedRootLayout;
    private SwipeRefreshLayout mFeedSwipeLayout;
    private IEventSubscriber<FeedUpdatedEvent> mFeedUpdatedSubscriber;
    private GestureDetectorCompat mGestureDetector;
    private ProgressBar mLoadingSpinner;
    private final Handler mMainThreadLooper;
    private LinearLayout mNetworkErrorLayout;
    private final Runnable mShowNetworkError;
    private boolean mSkipCardImpressionsReset;
    private View mTransparentFullBoundsContainerView;
    private int previousVisibleHeadCardIndex;

    public class FeedGestureListener extends GestureDetector.SimpleOnGestureListener {
        public FeedGestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            BrazeXamarinFormsFeedFragment.this.getListView().smoothScrollBy(-((int) ((f3 * (2 * r3)) / 1000.0f)), (int) ((motionEvent2.getEventTime() - motionEvent.getEventTime()) * 4));
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            BrazeXamarinFormsFeedFragment.this.getListView().smoothScrollBy((int) f3, 0);
            return true;
        }
    }

    public BrazeXamarinFormsFeedFragment() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.od("4@5B>71y:=v\u0014655)5", (short) (C1499aX.Xd() ^ (-9793)))).getDeclaredMethod(C1561oA.Kd("SRb<QZ`?cdf\\j", (short) (C1499aX.Xd() ^ (-22146))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.mMainThreadLooper = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.mShowNetworkError = new Runnable() { // from class: com.braze.ui.BrazeXamarinFormsFeedFragment.1
                @Override // java.lang.Runnable
                public void run() {
                    if (BrazeXamarinFormsFeedFragment.this.mLoadingSpinner != null) {
                        BrazeXamarinFormsFeedFragment.this.mLoadingSpinner.setVisibility(8);
                    }
                    if (BrazeXamarinFormsFeedFragment.this.mNetworkErrorLayout != null) {
                        BrazeXamarinFormsFeedFragment.this.mNetworkErrorLayout.setVisibility(0);
                    }
                }
            };
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static /* synthetic */ boolean lambda$onActivityCreated$1(View view, MotionEvent motionEvent) {
        return view.getVisibility() == 0;
    }

    private void setOnScreenCardsToRead() {
        this.mAdapter.batchSetCardsToRead(this.previousVisibleHeadCardIndex, this.currentCardIndexAtBottomOfScreen);
    }

    public EnumSet<CardCategory> getCategories() {
        return this.mCategories;
    }

    /* JADX INFO: renamed from: lambda$onActivityCreated$0$com-braze-ui-BrazeXamarinFormsFeedFragment, reason: not valid java name */
    /* synthetic */ boolean m7053x2cd69e1e(View view, MotionEvent motionEvent) {
        return this.mGestureDetector.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: lambda$onActivityCreated$2$com-braze-ui-BrazeXamarinFormsFeedFragment, reason: not valid java name */
    /* synthetic */ void m7054xb2af70dc(FeedUpdatedEvent feedUpdatedEvent, ListView listView) throws Throwable {
        String str = TAG;
        BrazeLogger.d(str, Wg.Zd("CbR+9*\u000bD\u0018Z\u0015p+'YH_-%-vw\u0005\u0013!+d?y:\b>2i\u0016\u00182.\t:p`\u0019\b4s0]g,.O9", (short) (ZN.Xd() ^ 20446), (short) (ZN.Xd() ^ 21766)) + feedUpdatedEvent);
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
            BrazeLogger.i(str, C1561oA.Xd("Zz{{8\f\u007f~\u0002\u0007\u0015\u0005\u0005A\u001a\u0005\u0018E\u0016\u0014\r\u000f\u001dK!\u0016\u0010\u001eP&\u001b\u0019T#\u00180X.$)\"]3/`.,:*e6.h\u007fzk@32??6F\u007ft:@KIF<UFLF\u007fJV\u0003JTX\u0007VXa\u0017\fOcc\u0010cWdiZikaga\u001b]k\u001etpecwii&}qn\u0002+r\u007f}|0\u0006zx4\t{\n\u000f~\rI", (short) (Od.Xd() ^ (-4533))));
            this.mBraze.requestFeedRefresh();
            if (feedUpdatedEvent.getCardCount(this.mCategories) == 0) {
                short sXd = (short) (FB.Xd() ^ 5301);
                int[] iArr = new int["Plg\"kilj\u0019o\\m\u001dalnei\u001f\u0012eikjRVR\nb\\\u000fO\u0001NHV\\SYQxKKCKJDPp1A6tF<=2;?/?5=5`4+'d2,:0'-%\\!10 \"R\u001f\u001a'*\u0017\u0010\rJ\u0019\u001bK\u0010M\u0005\u0005\u000f\u0003\u001eC\u0016\f8LJIL\t\u0012K".length()];
                QB qb = new QB("Plg\"kilj\u0019o\\m\u001dalnei\u001f\u0012eikjRVR\nb\\\u000fO\u0001NHV\\SYQxKKCKJDPp1A6tF<=2;?/?5=5`4+'d2,:0'-%\\!10 \"R\u001f\u001a'*\u0017\u0010\rJ\u0019\u001bK\u0010M\u0005\u0005\u000f\u0003\u001eC\u0016\f8LJIL\t\u0012K");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                    i2++;
                }
                BrazeLogger.d(str, new String(iArr, 0, i2));
                this.mEmptyFeedLayout.setVisibility(8);
                this.mLoadingSpinner.setVisibility(0);
                this.mTransparentFullBoundsContainerView.setVisibility(0);
                Handler handler = this.mMainThreadLooper;
                Runnable runnable = this.mShowNetworkError;
                short sXd2 = (short) (FB.Xd() ^ 9964);
                short sXd3 = (short) (FB.Xd() ^ 27531);
                int[] iArr2 = new int["/;0=92,t58q\u000b#/$+#/".length()];
                QB qb2 = new QB("/;0=92,t58q\u000b#/$+#/");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
                    i3++;
                }
                Class<?> cls = Class.forName(new String(iArr2, 0, i3));
                Class<?>[] clsArr = new Class[2];
                short sXd4 = (short) (OY.Xd() ^ 21202);
                short sXd5 = (short) (OY.Xd() ^ 20407);
                int[] iArr3 = new int["\f\u0002\u0016\u007fK\t|\t\u0001Fi\f\u0004\u0003tt}u".length()];
                QB qb3 = new QB("\f\u0002\u0016\u007fK\t|\t\u0001Fi\f\u0004\u0003tt}u");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3) + sXd5);
                    i4++;
                }
                clsArr[0] = Class.forName(new String(iArr3, 0, i4));
                clsArr[1] = Long.TYPE;
                Object[] objArr = {runnable, 5000L};
                short sXd6 = (short) (C1580rY.Xd() ^ (-7449));
                int[] iArr4 = new int["XVYY(HNBYDB".length()];
                QB qb4 = new QB("XVYY(HNBYDB");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i5] = xuXd4.fK(sXd6 + i5 + xuXd4.CK(iKK4));
                    i5++;
                }
                Method method = cls.getMethod(new String(iArr4, 0, i5), clsArr);
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
            this.mAdapter.replaceFeed(feedUpdatedEvent.getFeedCards(this.mCategories));
            listView.setVisibility(0);
        }
        this.mFeedSwipeLayout.setRefreshing(false);
    }

    /* JADX INFO: renamed from: lambda$onActivityCreated$3$com-braze-ui-BrazeXamarinFormsFeedFragment, reason: not valid java name */
    /* synthetic */ void m7055x759bda3b(final ListView listView, final FeedUpdatedEvent feedUpdatedEvent) {
        Activity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.braze.ui.BrazeXamarinFormsFeedFragment$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.m7054xb2af70dc(feedUpdatedEvent, listView);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onRefresh$4$com-braze-ui-BrazeXamarinFormsFeedFragment, reason: not valid java name */
    /* synthetic */ void m7056lambda$onRefresh$4$combrazeuiBrazeXamarinFormsFeedFragment() {
        this.mFeedSwipeLayout.setRefreshing(false);
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
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
        this.mFeedRootLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.braze.ui.BrazeXamarinFormsFeedFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f$0.m7053x2cd69e1e(view, motionEvent);
            }
        });
        listView.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.braze.ui.BrazeXamarinFormsFeedFragment.2
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
                BrazeXamarinFormsFeedFragment.this.mFeedSwipeLayout.setEnabled(i2 == 0);
                if (i3 == 0) {
                    return;
                }
                int i5 = i2 - 1;
                if (i5 > BrazeXamarinFormsFeedFragment.this.previousVisibleHeadCardIndex) {
                    BrazeXamarinFormsFeedFragment.this.mAdapter.batchSetCardsToRead(BrazeXamarinFormsFeedFragment.this.previousVisibleHeadCardIndex, i5);
                }
                BrazeXamarinFormsFeedFragment.this.previousVisibleHeadCardIndex = i5;
                BrazeXamarinFormsFeedFragment.this.currentCardIndexAtBottomOfScreen = i2 + i3;
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i2) {
            }
        });
        this.mTransparentFullBoundsContainerView.setOnTouchListener(new View.OnTouchListener() { // from class: com.braze.ui.BrazeXamarinFormsFeedFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return BrazeXamarinFormsFeedFragment.lambda$onActivityCreated$1(view, motionEvent);
            }
        });
        this.mBraze.removeSingleSubscription(this.mFeedUpdatedSubscriber, FeedUpdatedEvent.class);
        IEventSubscriber<FeedUpdatedEvent> iEventSubscriber = new IEventSubscriber() { // from class: com.braze.ui.BrazeXamarinFormsFeedFragment$$ExternalSyntheticLambda3
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                this.f$0.m7055x759bda3b(listView, (FeedUpdatedEvent) obj);
            }
        };
        this.mFeedUpdatedSubscriber = iEventSubscriber;
        this.mBraze.subscribeToFeedUpdates(iEventSubscriber);
        listView.setAdapter((ListAdapter) this.mAdapter);
        this.mBraze.requestFeedRefreshFromCache();
    }

    @Override // android.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mBraze = Braze.getInstance(context);
        if (this.mAdapter == null) {
            this.mAdapter = new BrazeListAdapter(context, R.id.tag, new ArrayList());
            this.mCategories = CardCategory.getAllCategories();
        }
        setRetainInstance(true);
        this.mGestureDetector = new GestureDetectorCompat(context, new FeedGestureListener());
    }

    @Override // android.app.ListFragment, android.app.Fragment
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

    @Override // android.app.ListFragment, android.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.mBraze.removeSingleSubscription(this.mFeedUpdatedSubscriber, FeedUpdatedEvent.class);
        setOnScreenCardsToRead();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        setListAdapter(null);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        setOnScreenCardsToRead();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        Callback.onRefresh_enter();
        try {
            this.mBraze.requestFeedRefresh();
            Handler handler = this.mMainThreadLooper;
            Runnable runnable = new Runnable() { // from class: com.braze.ui.BrazeXamarinFormsFeedFragment$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m7056lambda$onRefresh$4$combrazeuiBrazeXamarinFormsFeedFragment();
                }
            };
            Class<?> cls = Class.forName(C1561oA.yd("lzq\u0001~yu@\u0003\bC^x\u0007}\u0007`n", (short) (OY.Xd() ^ 25688)));
            Class<?>[] clsArr = new Class[2];
            clsArr[0] = Class.forName(C1561oA.Yd("UMcO\u001d\\R`Z\"GkefZ\\ga", (short) (C1607wl.Xd() ^ 23231)));
            clsArr[1] = Long.TYPE;
            Object[] objArr = {runnable, Long.valueOf(AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS)};
            short sXd = (short) (OY.Xd() ^ 5295);
            short sXd2 = (short) (OY.Xd() ^ 9280);
            int[] iArr = new int["nnsuFhpf\u007fll".length()];
            QB qb = new QB("nnsuFhpf\u007fll");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
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

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        Braze.getInstance(getActivity()).logFeedDisplayed();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (isVisible()) {
            this.mSkipCardImpressionsReset = true;
        }
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
        IBraze iBraze = this.mBraze;
        if (iBraze != null) {
            iBraze.requestFeedRefreshFromCache();
        }
    }

    public void setCategory(CardCategory cardCategory) {
        setCategories(EnumSet.of(cardCategory));
    }
}
