package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ActionProvider;
import com.dynatrace.android.callback.Callback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
public class ShareActionProvider extends ActionProvider {
    private static final int DEFAULT_INITIAL_ACTIVITY_COUNT = 4;
    public static final String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";
    final Context mContext;
    private int mMaxShownActivityCount;
    private ActivityChooserModel.OnChooseActivityListener mOnChooseActivityListener;
    private final ShareMenuItemOnMenuItemClickListener mOnMenuItemClickListener;
    OnShareTargetSelectedListener mOnShareTargetSelectedListener;
    String mShareHistoryFileName;

    public interface OnShareTargetSelectedListener {
        boolean onShareTargetSelected(ShareActionProvider shareActionProvider, Intent intent);
    }

    @Override // androidx.core.view.ActionProvider
    public boolean hasSubMenu() {
        return true;
    }

    public ShareActionProvider(Context context) {
        super(context);
        this.mMaxShownActivityCount = 4;
        this.mOnMenuItemClickListener = new ShareMenuItemOnMenuItemClickListener();
        this.mShareHistoryFileName = DEFAULT_SHARE_HISTORY_FILE_NAME;
        this.mContext = context;
    }

    public void setOnShareTargetSelectedListener(OnShareTargetSelectedListener onShareTargetSelectedListener) {
        this.mOnShareTargetSelectedListener = onShareTargetSelectedListener;
        setActivityChooserPolicyIfNeeded();
    }

    @Override // androidx.core.view.ActionProvider
    public View onCreateActionView() throws Throwable {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.mContext);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(ActivityChooserModel.get(this.mContext, this.mShareHistoryFileName));
        }
        TypedValue typedValue = new TypedValue();
        Context context = this.mContext;
        short sXd = (short) (C1580rY.Xd() ^ (-22935));
        int[] iArr = new int["\u0006\u0014\u000b\u001a\u0018\u0013\u000fY\u007f\r\r\u0014\u0006\u0010\u0017Qw%%,\u001e2/".length()];
        QB qb = new QB("\u0006\u0014\u000b\u001a\u0018\u0013\u000fY\u007f\r\r\u0014\u0006\u0010\u0017Qw%%,\u001e2/");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (FB.Xd() ^ 3305);
        int[] iArr2 = new int["QP`AVT]V".length()];
        QB qb2 = new QB("QP`AVT]V");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            ((Resources.Theme) method.invoke(context, objArr)).resolveAttribute(R.attr.actionModeShareDrawable, typedValue, true);
            activityChooserView.setExpandActivityOverflowButtonDrawable(AppCompatResources.getDrawable(this.mContext, typedValue.resourceId));
            activityChooserView.setProvider(this);
            activityChooserView.setDefaultActionButtonContentDescription(R.string.abc_shareactionprovider_share_with_application);
            activityChooserView.setExpandActivityOverflowButtonContentDescription(R.string.abc_shareactionprovider_share_with);
            return activityChooserView;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.core.view.ActionProvider
    public void onPrepareSubMenu(SubMenu subMenu) throws Throwable {
        subMenu.clear();
        ActivityChooserModel activityChooserModel = ActivityChooserModel.get(this.mContext, this.mShareHistoryFileName);
        Context context = this.mContext;
        short sXd = (short) (ZN.Xd() ^ 26360);
        short sXd2 = (short) (ZN.Xd() ^ 25654);
        int[] iArr = new int["\u001e,#20+'q(55<.8?y\u0010==D6JG".length()];
        QB qb = new QB("\u001e,#20+'q(55<.8?y\u0010==D6JG");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Jg.Wd("}5}\u000fi%f\u0012Ax\u001ac:j&YP", (short) (C1607wl.Xd() ^ 27981), (short) (C1607wl.Xd() ^ 28760)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            int activityCount = activityChooserModel.getActivityCount();
            int iMin = Math.min(activityCount, this.mMaxShownActivityCount);
            for (int i3 = 0; i3 < iMin; i3++) {
                ResolveInfo activity = activityChooserModel.getActivity(i3);
                subMenu.add(0, i3, i3, activity.loadLabel(packageManager)).setIcon(activity.loadIcon(packageManager)).setOnMenuItemClickListener(this.mOnMenuItemClickListener);
            }
            if (iMin < activityCount) {
                Context context2 = this.mContext;
                int i4 = R.string.abc_activity_chooser_view_see_all;
                short sXd3 = (short) (Od.Xd() ^ (-14358));
                short sXd4 = (short) (Od.Xd() ^ (-28971));
                int[] iArr2 = new int["I2Us|\u0012s\u001ev\u001af'\u001bp+\n[$8pr\u0017r".length()];
                QB qb2 = new QB("I2Us|\u0012s\u001ev\u001af'\u001bp+\n[$8pr\u0017r");
                int i5 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((i5 * sXd4) + sXd3)));
                    i5++;
                }
                Class<?> cls = Class.forName(new String(iArr2, 0, i5));
                Class<?>[] clsArr = {Integer.TYPE};
                Object[] objArr2 = {Integer.valueOf(i4)};
                Method method2 = cls.getMethod(C1626yg.Ud("W{g\u001cmG\u001e\u000e-", (short) (C1633zX.Xd() ^ (-9911)), (short) (C1633zX.Xd() ^ (-17908))), clsArr);
                try {
                    method2.setAccessible(true);
                    SubMenu subMenuAddSubMenu = subMenu.addSubMenu(0, iMin, iMin, (String) method2.invoke(context2, objArr2));
                    for (int i6 = 0; i6 < activityCount; i6++) {
                        ResolveInfo activity2 = activityChooserModel.getActivity(i6);
                        subMenuAddSubMenu.add(0, i6, i6, activity2.loadLabel(packageManager)).setIcon(activity2.loadIcon(packageManager)).setOnMenuItemClickListener(this.mOnMenuItemClickListener);
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public void setShareHistoryFileName(String str) {
        this.mShareHistoryFileName = str;
        setActivityChooserPolicyIfNeeded();
    }

    public void setShareIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                updateIntent(intent);
            }
        }
        ActivityChooserModel.get(this.mContext, this.mShareHistoryFileName).setIntent(intent);
    }

    private class ShareMenuItemOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {
        ShareMenuItemOnMenuItemClickListener() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            Callback.onMenuItemClick_enter(menuItem);
            try {
                Intent intentChooseActivity = ActivityChooserModel.get(ShareActionProvider.this.mContext, ShareActionProvider.this.mShareHistoryFileName).chooseActivity(menuItem.getItemId());
                if (intentChooseActivity != null) {
                    String action = intentChooseActivity.getAction();
                    if (C1561oA.Xd("DRIXVQM\u0018TZaS]d\u001fSVh^ee&L?I@", (short) (C1633zX.Xd() ^ (-4292))).equals(action) || Wg.vd("\u0005\u0013\u0006\u0015\u0017\u0012\nT\u0005\u000b\u000e\u007f\u000e\u0015K\u007f\u0017)\u001b\"&f\t{yp\tw\u0005|\u0002w\u0014\u0011\u0007", (short) (C1633zX.Xd() ^ (-30594))).equals(action)) {
                        ShareActionProvider.this.updateIntent(intentChooseActivity);
                    }
                    Context context = ShareActionProvider.this.mContext;
                    Class<?> cls = Class.forName(Qg.kd("$0%2.'!i\u001e)',\u001c$)au!\u001f$\u0014&!", (short) (ZN.Xd() ^ 7535), (short) (ZN.Xd() ^ 23570)));
                    Class<?>[] clsArr = new Class[1];
                    clsArr[0] = Class.forName(hg.Vd("}\n~\f\b\u0001zCw\u0003\u0001\u0006u}\u0003;Uy~nv{", (short) (OY.Xd() ^ 10195), (short) (OY.Xd() ^ 2080)));
                    Object[] objArr = {intentChooseActivity};
                    short sXd = (short) (C1580rY.Xd() ^ (-1665));
                    int[] iArr = new int["00\u001c,-x\u001a*\u001e*\u001c&*".length()];
                    QB qb = new QB("00\u001c,-x\u001a*\u001e*\u001c&*");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                        i2++;
                    }
                    Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                    try {
                        method.setAccessible(true);
                        method.invoke(context, objArr);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                Callback.onMenuItemClick_exit();
                return true;
            } catch (Throwable th) {
                Callback.onMenuItemClick_exit();
                throw th;
            }
        }
    }

    private void setActivityChooserPolicyIfNeeded() {
        if (this.mOnShareTargetSelectedListener == null) {
            return;
        }
        if (this.mOnChooseActivityListener == null) {
            this.mOnChooseActivityListener = new ShareActivityChooserModelPolicy();
        }
        ActivityChooserModel.get(this.mContext, this.mShareHistoryFileName).setOnChooseActivityListener(this.mOnChooseActivityListener);
    }

    private class ShareActivityChooserModelPolicy implements ActivityChooserModel.OnChooseActivityListener {
        ShareActivityChooserModelPolicy() {
        }

        @Override // androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener
        public boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent) {
            if (ShareActionProvider.this.mOnShareTargetSelectedListener == null) {
                return false;
            }
            ShareActionProvider.this.mOnShareTargetSelectedListener.onShareTargetSelected(ShareActionProvider.this, intent);
            return false;
        }
    }

    void updateIntent(Intent intent) {
        intent.addFlags(134742016);
    }
}
