package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.dynatrace.android.callback.Callback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup implements ActivityChooserModel.ActivityChooserModelClient {
    private final View mActivityChooserContent;
    private final Drawable mActivityChooserContentBackground;
    final ActivityChooserViewAdapter mAdapter;
    private final Callbacks mCallbacks;
    private int mDefaultActionButtonContentDescription;
    final FrameLayout mDefaultActivityButton;
    private final ImageView mDefaultActivityButtonImage;
    final FrameLayout mExpandActivityOverflowButton;
    private final ImageView mExpandActivityOverflowButtonImage;
    int mInitialActivityCount;
    private boolean mIsAttachedToWindow;
    boolean mIsSelectingDefaultActivity;
    private final int mListPopupMaxWidth;
    private ListPopupWindow mListPopupWindow;
    final DataSetObserver mModelDataSetObserver;
    PopupWindow.OnDismissListener mOnDismissListener;
    private final ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    ActionProvider mProvider;

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i2) throws Throwable {
        super(context, attributeSet, i2);
        this.mModelDataSetObserver = new DataSetObserver() { // from class: androidx.appcompat.widget.ActivityChooserView.1
            @Override // android.database.DataSetObserver
            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.mAdapter.notifyDataSetChanged();
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.mAdapter.notifyDataSetInvalidated();
            }
        };
        this.mOnGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.ActivityChooserView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (ActivityChooserView.this.isShowingPopup()) {
                    if (!ActivityChooserView.this.isShown()) {
                        ActivityChooserView.this.getListPopupWindow().dismiss();
                        return;
                    }
                    ActivityChooserView.this.getListPopupWindow().show();
                    if (ActivityChooserView.this.mProvider != null) {
                        ActivityChooserView.this.mProvider.subUiVisibilityChanged(true);
                    }
                }
            }
        };
        this.mInitialActivityCount = 4;
        int[] iArr = R.styleable.ActivityChooserView;
        Class<?> cls = Class.forName(Jg.Wd("dz\u0004\u000b\u0006\u0013\bo(=?C>jn19n|\u0016\u00101 ", (short) (C1499aX.Xd() ^ (-16940)), (short) (C1499aX.Xd() ^ (-20057))));
        Class<?>[] clsArr = new Class[4];
        short sXd = (short) (ZN.Xd() ^ 2661);
        short sXd2 = (short) (ZN.Xd() ^ 26440);
        int[] iArr2 = new int["`$\u001d2\rN{\u000e<hd98I0U)Ja\"g+;\u000f\n".length()];
        QB qb = new QB("`$\u001d2\rN{\u000e<hd98I0U)Ja\"g+;\u000f\n");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd2) + sXd)));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        clsArr[1] = int[].class;
        clsArr[2] = Integer.TYPE;
        clsArr[3] = Integer.TYPE;
        Object[] objArr = {attributeSet, iArr, Integer.valueOf(i2), 0};
        Method method = cls.getMethod(C1626yg.Ud("\u0015/q1mGfKC\u001a.1|GIl=gA!/T", (short) (C1499aX.Xd() ^ (-10270)), (short) (C1499aX.Xd() ^ (-2222))), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            ViewCompat.saveAttributeDataForStyleable(this, context, R.styleable.ActivityChooserView, attributeSet, typedArray, i2, 0);
            this.mInitialActivityCount = typedArray.getInt(R.styleable.ActivityChooserView_initialActivityCount, 4);
            Drawable drawable = typedArray.getDrawable(R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
            typedArray.recycle();
            LayoutInflater.from(getContext()).inflate(R.layout.abc_activity_chooser_view, (ViewGroup) this, true);
            Callbacks callbacks = new Callbacks();
            this.mCallbacks = callbacks;
            View viewFindViewById = findViewById(R.id.activity_chooser_view_content);
            this.mActivityChooserContent = viewFindViewById;
            this.mActivityChooserContentBackground = viewFindViewById.getBackground();
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.default_activity_button);
            this.mDefaultActivityButton = frameLayout;
            frameLayout.setOnClickListener(callbacks);
            frameLayout.setOnLongClickListener(callbacks);
            this.mDefaultActivityButtonImage = (ImageView) frameLayout.findViewById(R.id.image);
            FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.expand_activities_button);
            frameLayout2.setOnClickListener(callbacks);
            frameLayout2.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: androidx.appcompat.widget.ActivityChooserView.3
                @Override // android.view.View.AccessibilityDelegate
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCanOpenPopup(true);
                }
            });
            frameLayout2.setOnTouchListener(new ForwardingListener(frameLayout2) { // from class: androidx.appcompat.widget.ActivityChooserView.4
                @Override // androidx.appcompat.widget.ForwardingListener
                public ShowableListMenu getPopup() {
                    return ActivityChooserView.this.getListPopupWindow();
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                protected boolean onForwardingStarted() throws Throwable {
                    ActivityChooserView.this.showPopup();
                    return true;
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                protected boolean onForwardingStopped() {
                    ActivityChooserView.this.dismissPopup();
                    return true;
                }
            });
            this.mExpandActivityOverflowButton = frameLayout2;
            ImageView imageView = (ImageView) frameLayout2.findViewById(R.id.image);
            this.mExpandActivityOverflowButtonImage = imageView;
            imageView.setImageDrawable(drawable);
            ActivityChooserViewAdapter activityChooserViewAdapter = new ActivityChooserViewAdapter();
            this.mAdapter = activityChooserViewAdapter;
            activityChooserViewAdapter.registerDataSetObserver(new DataSetObserver() { // from class: androidx.appcompat.widget.ActivityChooserView.5
                @Override // android.database.DataSetObserver
                public void onChanged() throws Throwable {
                    super.onChanged();
                    ActivityChooserView.this.updateAppearance();
                }
            });
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Ig.wd("V\n}p4\t\u001c}\u007fl\u00151Sj\u0001S$b\u00193a,>", (short) (C1607wl.Xd() ^ 19820))).getMethod(EO.Od("t)(c s\u001a!u(.\u0014", (short) (Od.Xd() ^ (-28713))), new Class[0]);
            try {
                method2.setAccessible(true);
                Resources resources = (Resources) method2.invoke(context, objArr2);
                this.mListPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // androidx.appcompat.widget.ActivityChooserModel.ActivityChooserModelClient
    public void setActivityChooserModel(ActivityChooserModel activityChooserModel) throws Throwable {
        this.mAdapter.setDataModel(activityChooserModel);
        if (isShowingPopup()) {
            dismissPopup();
            showPopup();
        }
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.mExpandActivityOverflowButtonImage.setImageDrawable(drawable);
    }

    public void setExpandActivityOverflowButtonContentDescription(int i2) throws Throwable {
        Context context = getContext();
        short sXd = (short) (ZN.Xd() ^ 2668);
        int[] iArr = new int["O[P]YRL\u0015ITRWGOT\r!LJO?QL".length()];
        QB qb = new QB("O[P]YRL\u0015ITRWGOT\r!LJO?QL");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i3));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        Method method = cls.getMethod(C1593ug.zd("@?O/QPHNH", (short) (Od.Xd() ^ (-26741)), (short) (Od.Xd() ^ (-11728))), clsArr);
        try {
            method.setAccessible(true);
            this.mExpandActivityOverflowButtonImage.setContentDescription((String) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setProvider(ActionProvider actionProvider) {
        this.mProvider = actionProvider;
    }

    public boolean showPopup() throws Throwable {
        if (isShowingPopup() || !this.mIsAttachedToWindow) {
            return false;
        }
        this.mIsSelectingDefaultActivity = false;
        showPopupUnchecked(this.mInitialActivityCount);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    void showPopupUnchecked(int i2) throws Throwable {
        if (this.mAdapter.getDataModel() == null) {
            throw new IllegalStateException(Wg.Zd("\r\u0018\u0010n30\u007f\u0006mG\u0016yH\u0014mksF{=\r&w5\u001b\u0010\u0013mj\u0013~\u0011\b/\np_Y(pqW", (short) (FB.Xd() ^ 14885), (short) (FB.Xd() ^ 2389)));
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.mOnGlobalLayoutListener);
        ?? r3 = this.mDefaultActivityButton.getVisibility() == 0 ? 1 : 0;
        int activityCount = this.mAdapter.getActivityCount();
        if (i2 != Integer.MAX_VALUE && activityCount > i2 + r3) {
            this.mAdapter.setShowFooterView(true);
            this.mAdapter.setMaxActivityCount(i2 - 1);
        } else {
            this.mAdapter.setShowFooterView(false);
            this.mAdapter.setMaxActivityCount(i2);
        }
        ListPopupWindow listPopupWindow = getListPopupWindow();
        if (listPopupWindow.isShowing()) {
            return;
        }
        if (this.mIsSelectingDefaultActivity || r3 == 0) {
            this.mAdapter.setShowDefaultActivity(true, r3);
        } else {
            this.mAdapter.setShowDefaultActivity(false, false);
        }
        listPopupWindow.setContentWidth(Math.min(this.mAdapter.measureContentWidth(), this.mListPopupMaxWidth));
        listPopupWindow.show();
        ActionProvider actionProvider = this.mProvider;
        if (actionProvider != null) {
            actionProvider.subUiVisibilityChanged(true);
        }
        ListView listView = listPopupWindow.getListView();
        Context context = getContext();
        int i3 = R.string.abc_activitychooserview_choose_application;
        Class<?> cls = Class.forName(C1561oA.od("UaVc_XR\u001bOZX]MUZ\u0013'RPUEWR", (short) (C1499aX.Xd() ^ (-23811))));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i3)};
        Method method = cls.getMethod(C1561oA.Kd("\u0001\u007f\u0010o\u0012\u0011\t\u000f\t", (short) (C1499aX.Xd() ^ (-2660))), clsArr);
        try {
            method.setAccessible(true);
            listView.setContentDescription((String) method.invoke(context, objArr));
            listPopupWindow.getListView().setSelector(new ColorDrawable(0));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public boolean dismissPopup() {
        if (!isShowingPopup()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
        return true;
    }

    public boolean isShowingPopup() {
        return getListPopupWindow().isShowing();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ActivityChooserModel dataModel = this.mAdapter.getDataModel();
        if (dataModel != null) {
            dataModel.registerObserver(this.mModelDataSetObserver);
        }
        this.mIsAttachedToWindow = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActivityChooserModel dataModel = this.mAdapter.getDataModel();
        if (dataModel != null) {
            dataModel.unregisterObserver(this.mModelDataSetObserver);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.mOnGlobalLayoutListener);
        }
        if (isShowingPopup()) {
            dismissPopup();
        }
        this.mIsAttachedToWindow = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        View view = this.mActivityChooserContent;
        if (this.mDefaultActivityButton.getVisibility() != 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        }
        measureChild(view, i2, i3);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        this.mActivityChooserContent.layout(0, 0, i4 - i2, i5 - i3);
        if (isShowingPopup()) {
            return;
        }
        dismissPopup();
    }

    public ActivityChooserModel getDataModel() {
        return this.mAdapter.getDataModel();
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setInitialActivityCount(int i2) {
        this.mInitialActivityCount = i2;
    }

    public void setDefaultActionButtonContentDescription(int i2) {
        this.mDefaultActionButtonContentDescription = i2;
    }

    ListPopupWindow getListPopupWindow() {
        if (this.mListPopupWindow == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.mListPopupWindow = listPopupWindow;
            listPopupWindow.setAdapter(this.mAdapter);
            this.mListPopupWindow.setAnchorView(this);
            this.mListPopupWindow.setModal(true);
            this.mListPopupWindow.setOnItemClickListener(this.mCallbacks);
            this.mListPopupWindow.setOnDismissListener(this.mCallbacks);
        }
        return this.mListPopupWindow;
    }

    void updateAppearance() throws Throwable {
        if (this.mAdapter.getCount() > 0) {
            this.mExpandActivityOverflowButton.setEnabled(true);
        } else {
            this.mExpandActivityOverflowButton.setEnabled(false);
        }
        int activityCount = this.mAdapter.getActivityCount();
        int historySize = this.mAdapter.getHistorySize();
        if (activityCount == 1 || (activityCount > 1 && historySize > 0)) {
            this.mDefaultActivityButton.setVisibility(0);
            ResolveInfo defaultActivity = this.mAdapter.getDefaultActivity();
            Context context = getContext();
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Xd(")7.=;62|3@@G9CJ\u0005\u001bHHOAUR", (short) (C1580rY.Xd() ^ (-25851)))).getMethod(Wg.vd("HGW4>AJAPO8MSGNMC", (short) (C1633zX.Xd() ^ (-3456))), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                this.mDefaultActivityButtonImage.setImageDrawable(defaultActivity.loadIcon(packageManager));
                if (this.mDefaultActionButtonContentDescription != 0) {
                    CharSequence charSequenceLoadLabel = defaultActivity.loadLabel(packageManager);
                    Context context2 = getContext();
                    int i2 = this.mDefaultActionButtonContentDescription;
                    Object[] objArr2 = {charSequenceLoadLabel};
                    short sXd = (short) (Od.Xd() ^ (-17161));
                    short sXd2 = (short) (Od.Xd() ^ (-26912));
                    int[] iArr = new int["(4)62+%m\"-+0 (-ey%#(\u0018*%".length()];
                    QB qb = new QB("(4)62+%m\"-+0 (-ey%#(\u0018*%");
                    int i3 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i3] = xuXd.fK(((sXd + i3) + xuXd.CK(iKK)) - sXd2);
                        i3++;
                    }
                    Class<?> cls = Class.forName(new String(iArr, 0, i3));
                    Class<?>[] clsArr = {Integer.TYPE, Object[].class};
                    Object[] objArr3 = {Integer.valueOf(i2), objArr2};
                    Method method2 = cls.getMethod(hg.Vd("vs\u0002_\u007f|rvn", (short) (C1580rY.Xd() ^ (-31234)), (short) (C1580rY.Xd() ^ (-24129))), clsArr);
                    try {
                        method2.setAccessible(true);
                        this.mDefaultActivityButton.setContentDescription((String) method2.invoke(context2, objArr3));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } else {
            this.mDefaultActivityButton.setVisibility(8);
        }
        if (this.mDefaultActivityButton.getVisibility() == 0) {
            this.mActivityChooserContent.setBackgroundDrawable(this.mActivityChooserContentBackground);
        } else {
            this.mActivityChooserContent.setBackgroundDrawable(null);
        }
    }

    private class Callbacks implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        Callbacks() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            Callback.onItemClick_enter(view, i2);
            try {
                int itemViewType = ((ActivityChooserViewAdapter) adapterView.getAdapter()).getItemViewType(i2);
                if (itemViewType == 0) {
                    ActivityChooserView.this.dismissPopup();
                    if (!ActivityChooserView.this.mIsSelectingDefaultActivity) {
                        if (!ActivityChooserView.this.mAdapter.getShowDefaultActivity()) {
                            i2++;
                        }
                        Intent intentChooseActivity = ActivityChooserView.this.mAdapter.getDataModel().chooseActivity(i2);
                        if (intentChooseActivity != null) {
                            intentChooseActivity.addFlags(524288);
                            Context context = ActivityChooserView.this.getContext();
                            Class<?> cls = Class.forName(Qg.kd("\u001c(\u001d*&\u001f\u0019a\u0016!\u001f$\u0014\u001c!Ym\u0019\u0017\u001c\f\u001e\u0019", (short) (C1499aX.Xd() ^ (-14117)), (short) (C1499aX.Xd() ^ (-16372))));
                            Class<?>[] clsArr = new Class[1];
                            clsArr[0] = Class.forName(hg.Vd(",8-:6/)q&1/4$,1i\u0004(-\u001d%*", (short) (Od.Xd() ^ (-26910)), (short) (Od.Xd() ^ (-10460))));
                            Object[] objArr = {intentChooseActivity};
                            short sXd = (short) (FB.Xd() ^ ExifDirectoryBase.TAG_TILE_LENGTH);
                            int[] iArr = new int["%%\u0011!\"m\u000f\u001f\u0013\u001f\u0011\u001b\u001f".length()];
                            QB qb = new QB("%%\u0011!\"m\u000f\u001f\u0013\u001f\u0011\u001b\u001f");
                            int i3 = 0;
                            while (qb.YK()) {
                                int iKK = qb.KK();
                                Xu xuXd = Xu.Xd(iKK);
                                iArr[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK));
                                i3++;
                            }
                            Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
                            try {
                                method.setAccessible(true);
                                method.invoke(context, objArr);
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        }
                    } else if (i2 > 0) {
                        ActivityChooserView.this.mAdapter.getDataModel().setDefaultActivity(i2);
                    }
                } else if (itemViewType == 1) {
                    ActivityChooserView.this.showPopupUnchecked(Integer.MAX_VALUE);
                } else {
                    throw new IllegalArgumentException();
                }
            } finally {
                Callback.onItemClick_exit();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                if (view == ActivityChooserView.this.mDefaultActivityButton) {
                    ActivityChooserView.this.dismissPopup();
                    Intent intentChooseActivity = ActivityChooserView.this.mAdapter.getDataModel().chooseActivity(ActivityChooserView.this.mAdapter.getDataModel().getActivityIndex(ActivityChooserView.this.mAdapter.getDefaultActivity()));
                    if (intentChooseActivity != null) {
                        intentChooseActivity.addFlags(524288);
                        Context context = ActivityChooserView.this.getContext();
                        Class<?> cls = Class.forName(Wg.Zd("@<\u0018H+\u00149g@9 P&ZEf%?dL$iK", (short) (Od.Xd() ^ (-17770)), (short) (Od.Xd() ^ (-3530))));
                        Class<?>[] clsArr = new Class[1];
                        clsArr[0] = Class.forName(C1561oA.Xd(".<3B@;7\u00028EEL>HO\n&LSEOV", (short) (ZN.Xd() ^ 27218)));
                        Object[] objArr = {intentChooseActivity};
                        Method method = cls.getMethod(Wg.vd("iiUen:[kgseo{", (short) (ZN.Xd() ^ 26796)), clsArr);
                        try {
                            method.setAccessible(true);
                            method.invoke(context, objArr);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                } else if (view == ActivityChooserView.this.mExpandActivityOverflowButton) {
                    ActivityChooserView.this.mIsSelectingDefaultActivity = false;
                    ActivityChooserView activityChooserView = ActivityChooserView.this;
                    activityChooserView.showPopupUnchecked(activityChooserView.mInitialActivityCount);
                } else {
                    throw new IllegalArgumentException();
                }
            } finally {
                Callback.onClick_exit();
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) throws Throwable {
            if (view == ActivityChooserView.this.mDefaultActivityButton) {
                if (ActivityChooserView.this.mAdapter.getCount() > 0) {
                    ActivityChooserView.this.mIsSelectingDefaultActivity = true;
                    ActivityChooserView activityChooserView = ActivityChooserView.this;
                    activityChooserView.showPopupUnchecked(activityChooserView.mInitialActivityCount);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            notifyOnDismissListener();
            if (ActivityChooserView.this.mProvider != null) {
                ActivityChooserView.this.mProvider.subUiVisibilityChanged(false);
            }
        }

        private void notifyOnDismissListener() {
            if (ActivityChooserView.this.mOnDismissListener != null) {
                ActivityChooserView.this.mOnDismissListener.onDismiss();
            }
        }
    }

    private class ActivityChooserViewAdapter extends BaseAdapter {
        private static final int ITEM_VIEW_TYPE_ACTIVITY = 0;
        private static final int ITEM_VIEW_TYPE_COUNT = 3;
        private static final int ITEM_VIEW_TYPE_FOOTER = 1;
        public static final int MAX_ACTIVITY_COUNT_DEFAULT = 4;
        public static final int MAX_ACTIVITY_COUNT_UNLIMITED = Integer.MAX_VALUE;
        private ActivityChooserModel mDataModel;
        private boolean mHighlightDefaultActivity;
        private int mMaxActivityCount = 4;
        private boolean mShowDefaultActivity;
        private boolean mShowFooterView;

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        ActivityChooserViewAdapter() {
        }

        public void setDataModel(ActivityChooserModel activityChooserModel) {
            ActivityChooserModel dataModel = ActivityChooserView.this.mAdapter.getDataModel();
            if (dataModel != null && ActivityChooserView.this.isShown()) {
                dataModel.unregisterObserver(ActivityChooserView.this.mModelDataSetObserver);
            }
            this.mDataModel = activityChooserModel;
            if (activityChooserModel != null && ActivityChooserView.this.isShown()) {
                activityChooserModel.registerObserver(ActivityChooserView.this.mModelDataSetObserver);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i2) {
            return (this.mShowFooterView && i2 == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int activityCount = this.mDataModel.getActivityCount();
            if (!this.mShowDefaultActivity && this.mDataModel.getDefaultActivity() != null) {
                activityCount--;
            }
            int iMin = Math.min(activityCount, this.mMaxActivityCount);
            return this.mShowFooterView ? iMin + 1 : iMin;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.mShowDefaultActivity && this.mDataModel.getDefaultActivity() != null) {
                i2++;
            }
            return this.mDataModel.getActivity(i2);
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) throws Throwable {
            int itemViewType = getItemViewType(i2);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    if (view == null || view.getId() != 1) {
                        view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                        view.setId(1);
                        TextView textView = (TextView) view.findViewById(R.id.title);
                        Context context = ActivityChooserView.this.getContext();
                        int i3 = R.string.abc_activity_chooser_view_see_all;
                        Class<?> cls = Class.forName(C1561oA.Yd("\u0015#\u001a)'\"\u001eh\u001f,,3%/6p\u000744;-A>", (short) (C1580rY.Xd() ^ (-893))));
                        Class<?>[] clsArr = {Integer.TYPE};
                        Object[] objArr = {Integer.valueOf(i3)};
                        Method method = cls.getMethod(Xg.qd(":9I)KJBHB", (short) (Od.Xd() ^ (-24476)), (short) (Od.Xd() ^ (-10991))), clsArr);
                        try {
                            method.setAccessible(true);
                            textView.setText((String) method.invoke(context, objArr));
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                    return view;
                }
                throw new IllegalArgumentException();
            }
            if (view == null || view.getId() != R.id.list_item) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            Context context2 = ActivityChooserView.this.getContext();
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Jg.Wd("\t1v!\u0004\u0019cSh\b\\\u0007Ou[1\u001c,B\u001e/&/", (short) (FB.Xd() ^ 11537), (short) (FB.Xd() ^ 31234))).getMethod(ZO.xd("?)msj&E\u00143M\u0013;s<){\n", (short) (Od.Xd() ^ (-7007)), (short) (Od.Xd() ^ (-32325))), new Class[0]);
            try {
                method2.setAccessible(true);
                PackageManager packageManager = (PackageManager) method2.invoke(context2, objArr2);
                ImageView imageView = (ImageView) view.findViewById(R.id.icon);
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i2);
                imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(R.id.title)).setText(resolveInfo.loadLabel(packageManager));
                if (this.mShowDefaultActivity && i2 == 0 && this.mHighlightDefaultActivity) {
                    view.setActivated(true);
                } else {
                    view.setActivated(false);
                }
                return view;
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        public int measureContentWidth() throws Throwable {
            int i2 = this.mMaxActivityCount;
            this.mMaxActivityCount = Integer.MAX_VALUE;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int iMax = 0;
            View view = null;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = Math.max(iMax, view.getMeasuredWidth());
            }
            this.mMaxActivityCount = i2;
            return iMax;
        }

        public void setMaxActivityCount(int i2) {
            if (this.mMaxActivityCount != i2) {
                this.mMaxActivityCount = i2;
                notifyDataSetChanged();
            }
        }

        public ResolveInfo getDefaultActivity() {
            return this.mDataModel.getDefaultActivity();
        }

        public void setShowFooterView(boolean z2) {
            if (this.mShowFooterView != z2) {
                this.mShowFooterView = z2;
                notifyDataSetChanged();
            }
        }

        public int getActivityCount() {
            return this.mDataModel.getActivityCount();
        }

        public int getHistorySize() {
            return this.mDataModel.getHistorySize();
        }

        public ActivityChooserModel getDataModel() {
            return this.mDataModel;
        }

        public void setShowDefaultActivity(boolean z2, boolean z3) {
            if (this.mShowDefaultActivity == z2 && this.mHighlightDefaultActivity == z3) {
                return;
            }
            this.mShowDefaultActivity = z2;
            this.mHighlightDefaultActivity = z3;
            notifyDataSetChanged();
        }

        public boolean getShowDefaultActivity() {
            return this.mShowDefaultActivity;
        }
    }

    public static class InnerLayout extends LinearLayout {
        private static final int[] TINT_ATTRS = {android.R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, TINT_ATTRS);
            setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(0));
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }
}
