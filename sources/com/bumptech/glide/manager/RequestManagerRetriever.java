package com.bumptech.glide.manager;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class RequestManagerRetriever implements Handler.Callback {
    private static final RequestManagerFactory DEFAULT_FACTORY = new RequestManagerFactory() { // from class: com.bumptech.glide.manager.RequestManagerRetriever.1
        @Override // com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory
        public RequestManager build(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context) {
            return new RequestManager(glide, lifecycle, requestManagerTreeNode, context);
        }
    };
    private static final String FRAGMENT_INDEX_KEY = "key";
    static final String FRAGMENT_TAG = "com.bumptech.glide.manager";
    private static final int ID_REMOVE_FRAGMENT_MANAGER = 1;
    private static final int ID_REMOVE_SUPPORT_FRAGMENT_MANAGER = 2;
    private static final String TAG = "RMRetriever";
    private volatile RequestManager applicationManager;
    private final RequestManagerFactory factory;
    private final Handler handler;
    final Map<FragmentManager, RequestManagerFragment> pendingRequestManagerFragments = new HashMap();
    final Map<androidx.fragment.app.FragmentManager, SupportRequestManagerFragment> pendingSupportRequestManagerFragments = new HashMap();
    private final ArrayMap<View, Fragment> tempViewToSupportFragment = new ArrayMap<>();
    private final ArrayMap<View, android.app.Fragment> tempViewToFragment = new ArrayMap<>();
    private final Bundle tempBundle = new Bundle();

    public interface RequestManagerFactory {
        RequestManager build(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context);
    }

    public RequestManagerRetriever(RequestManagerFactory requestManagerFactory) throws Throwable {
        this.factory = requestManagerFactory == null ? DEFAULT_FACTORY : requestManagerFactory;
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Xd("t\u0003y\t\u0007\u0002}H\u000b\u0010Kj\u000f\u0010\u0012\b\u0016", (short) (FB.Xd() ^ 2035))).getDeclaredMethod(Wg.vd("}z\t`{\u0003\u0007c\u000e\r\r\u0001\u0015", (short) (C1607wl.Xd() ^ 11702)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.handler = new Handler((Looper) declaredMethod.invoke(null, objArr), this);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static void assertNotDestroyed(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static Activity findActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return findActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Deprecated
    private void findAllFragmentsWithViews(FragmentManager fragmentManager, ArrayMap<View, android.app.Fragment> arrayMap) {
        for (android.app.Fragment fragment : fragmentManager.getFragments()) {
            if (fragment.getView() != null) {
                arrayMap.put(fragment.getView(), fragment);
                findAllFragmentsWithViews(fragment.getChildFragmentManager(), arrayMap);
            }
        }
    }

    @Deprecated
    private void findAllFragmentsWithViewsPreO(FragmentManager fragmentManager, ArrayMap<View, android.app.Fragment> arrayMap) {
        android.app.Fragment fragment;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            this.tempBundle.putInt(FRAGMENT_INDEX_KEY, i2);
            try {
                fragment = fragmentManager.getFragment(this.tempBundle, FRAGMENT_INDEX_KEY);
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                arrayMap.put(fragment.getView(), fragment);
                findAllFragmentsWithViews(fragment.getChildFragmentManager(), arrayMap);
            }
            i2 = i3;
        }
    }

    private static void findAllSupportFragmentsWithViews(Collection<Fragment> collection, Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                findAllSupportFragmentsWithViews(fragment.getChildFragmentManager().getFragments(), map);
            }
        }
    }

    @Deprecated
    private android.app.Fragment findFragment(View view, Activity activity) {
        this.tempViewToFragment.clear();
        findAllFragmentsWithViews(activity.getFragmentManager(), this.tempViewToFragment);
        View viewFindViewById = activity.findViewById(R.id.content);
        android.app.Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.tempViewToFragment.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.tempViewToFragment.clear();
        return fragment;
    }

    private Fragment findSupportFragment(View view, FragmentActivity fragmentActivity) {
        this.tempViewToSupportFragment.clear();
        findAllSupportFragmentsWithViews(fragmentActivity.getSupportFragmentManager().getFragments(), this.tempViewToSupportFragment);
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.tempViewToSupportFragment.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.tempViewToSupportFragment.clear();
        return fragment;
    }

    @Deprecated
    private RequestManager fragmentGet(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z2) throws Exception {
        RequestManagerFragment requestManagerFragment = getRequestManagerFragment(fragmentManager, fragment, z2);
        RequestManager requestManager = requestManagerFragment.getRequestManager();
        if (requestManager != null) {
            return requestManager;
        }
        RequestManager requestManagerBuild = this.factory.build(Glide.get(context), requestManagerFragment.getGlideLifecycle(), requestManagerFragment.getRequestManagerTreeNode(), context);
        requestManagerFragment.setRequestManager(requestManagerBuild);
        return requestManagerBuild;
    }

    private RequestManager getApplicationManager(Context context) {
        if (this.applicationManager == null) {
            synchronized (this) {
                if (this.applicationManager == null) {
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(Qg.kd("\u0004\u0010\u0005\u0012\u000e\u0007\u0001I}\t\u0007\f{\u0004\tAU\u0001~\u0004s\u0006\u0001", (short) (C1499aX.Xd() ^ (-31889)), (short) (C1499aX.Xd() ^ (-2962)))).getMethod(hg.Vd("mjxDrqlha^pdig;fdiYkf", (short) (C1580rY.Xd() ^ (-5292)), (short) (C1580rY.Xd() ^ (-28903))), new Class[0]);
                    try {
                        method.setAccessible(true);
                        Glide glide = Glide.get((Context) method.invoke(context, objArr));
                        RequestManagerFactory requestManagerFactory = this.factory;
                        ApplicationLifecycle applicationLifecycle = new ApplicationLifecycle();
                        EmptyRequestManagerTreeNode emptyRequestManagerTreeNode = new EmptyRequestManagerTreeNode();
                        Object[] objArr2 = new Object[0];
                        Method method2 = Class.forName(C1561oA.ud("\u0001\r\u0002\u000f\u000b\u0004}Fz\u0006\u0004\tx\u0001\u0006>R}{\u0001p\u0003}", (short) (C1580rY.Xd() ^ (-9572)))).getMethod(C1561oA.yd(".-9\u000734-+21A7::\f9EL:NG", (short) (OY.Xd() ^ 22382)), new Class[0]);
                        try {
                            method2.setAccessible(true);
                            this.applicationManager = requestManagerFactory.build(glide, applicationLifecycle, emptyRequestManagerTreeNode, (Context) method2.invoke(context, objArr2));
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
            }
        }
        return this.applicationManager;
    }

    private RequestManagerFragment getRequestManagerFragment(FragmentManager fragmentManager, android.app.Fragment fragment, boolean z2) throws Exception {
        RequestManagerFragment requestManagerFragment = (RequestManagerFragment) fragmentManager.findFragmentByTag(FRAGMENT_TAG);
        if (requestManagerFragment == null && (requestManagerFragment = this.pendingRequestManagerFragments.get(fragmentManager)) == null) {
            requestManagerFragment = new RequestManagerFragment();
            requestManagerFragment.setParentFragmentHint(fragment);
            if (z2) {
                requestManagerFragment.getGlideLifecycle().onStart();
            }
            this.pendingRequestManagerFragments.put(fragmentManager, requestManagerFragment);
            CX.ud();
            fragmentManager.beginTransaction().add(requestManagerFragment, FRAGMENT_TAG).commitAllowingStateLoss();
            this.handler.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return requestManagerFragment;
    }

    private SupportRequestManagerFragment getSupportRequestManagerFragment(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z2) throws Exception {
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) fragmentManager.findFragmentByTag(FRAGMENT_TAG);
        if (supportRequestManagerFragment == null && (supportRequestManagerFragment = this.pendingSupportRequestManagerFragments.get(fragmentManager)) == null) {
            supportRequestManagerFragment = new SupportRequestManagerFragment();
            supportRequestManagerFragment.setParentFragmentHint(fragment);
            if (z2) {
                supportRequestManagerFragment.getGlideLifecycle().onStart();
            }
            this.pendingSupportRequestManagerFragments.put(fragmentManager, supportRequestManagerFragment);
            CX.ud();
            fragmentManager.beginTransaction().add(supportRequestManagerFragment, FRAGMENT_TAG).commitAllowingStateLoss();
            this.handler.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return supportRequestManagerFragment;
    }

    private static boolean isActivityVisible(Context context) {
        Activity activityFindActivity = findActivity(context);
        return activityFindActivity == null || !activityFindActivity.isFinishing();
    }

    private RequestManager supportFragmentGet(Context context, androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z2) throws Exception {
        SupportRequestManagerFragment supportRequestManagerFragment = getSupportRequestManagerFragment(fragmentManager, fragment, z2);
        RequestManager requestManager = supportRequestManagerFragment.getRequestManager();
        if (requestManager != null) {
            return requestManager;
        }
        RequestManager requestManagerBuild = this.factory.build(Glide.get(context), supportRequestManagerFragment.getGlideLifecycle(), supportRequestManagerFragment.getRequestManagerTreeNode(), context);
        supportRequestManagerFragment.setRequestManager(requestManagerBuild);
        return requestManagerBuild;
    }

    public RequestManager get(Activity activity) {
        if (Util.isOnBackgroundThread()) {
            return get(activity.getApplicationContext());
        }
        assertNotDestroyed(activity);
        return fragmentGet(activity, activity.getFragmentManager(), null, isActivityVisible(activity));
    }

    @Deprecated
    public RequestManager get(android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        if (Util.isOnBackgroundThread()) {
            return get(fragment.getActivity().getApplicationContext());
        }
        return fragmentGet(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    public RequestManager get(Context context) throws Throwable {
        if (context == null) {
            throw new IllegalArgumentException(Jg.Wd("^W\u0006\u0014\u0006)^\u0001q\u001bkg\u0015i]H \b*_Oe\u00110nR,\u0010~q]|h\u0003J_\u000bvL\bp", (short) (OY.Xd() ^ 14411), (short) (OY.Xd() ^ 25701)));
        }
        if (Util.isOnMainThread() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return get((FragmentActivity) context);
            }
            if (context instanceof Activity) {
                return get((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                Context baseContext = contextWrapper.getBaseContext();
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.Yd("\\japnie0fsszlv}8N{{\u0003t\t\u0006", (short) (ZN.Xd() ^ 15289))).getMethod(Xg.qd("%$4\u0002230.)(<299\u000f<<C5IF", (short) (ZN.Xd() ^ 774), (short) (ZN.Xd() ^ 30807)), new Class[0]);
                try {
                    method.setAccessible(true);
                    if (((Context) method.invoke(baseContext, objArr)) != null) {
                        return get(contextWrapper.getBaseContext());
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
        return getApplicationManager(context);
    }

    public RequestManager get(View view) throws Throwable {
        if (Util.isOnBackgroundThread()) {
            Context context = view.getContext();
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("0\u00014|\u0015M!#prB\u001d\u00175'u8W@\u001a 7\u0004", (short) (C1607wl.Xd() ^ 23011), (short) (C1607wl.Xd() ^ 21852))).getMethod(C1626yg.Ud(".c`<N8\u0001|F<\u0011qKVC\u0004e\u0007wm\u0012", (short) (ZN.Xd() ^ 13234), (short) (ZN.Xd() ^ 27651)), new Class[0]);
            try {
                method.setAccessible(true);
                return get((Context) method.invoke(context, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Preconditions.checkNotNull(view);
        Preconditions.checkNotNull(view.getContext(), Ig.wd("i:\u001bx\u001bf9\u000e:\u001eo\u0001D7O}V6,R\u0007Ndl\u007f9\u0006\u001f)gr\"4^$4ZuNy0^\u0007\u0019,h:\u0004`0g)@\u001b\n,U[(8\u001d\u000ea", (short) (C1580rY.Xd() ^ (-30888))));
        Activity activityFindActivity = findActivity(view.getContext());
        if (activityFindActivity != null) {
            if (!(activityFindActivity instanceof FragmentActivity)) {
                android.app.Fragment fragmentFindFragment = findFragment(view, activityFindActivity);
                return fragmentFindFragment == null ? get(activityFindActivity) : get(fragmentFindFragment);
            }
            FragmentActivity fragmentActivity = (FragmentActivity) activityFindActivity;
            Fragment fragmentFindSupportFragment = findSupportFragment(view, fragmentActivity);
            return fragmentFindSupportFragment != null ? get(fragmentFindSupportFragment) : get(fragmentActivity);
        }
        Context context2 = view.getContext();
        short sXd = (short) (C1607wl.Xd() ^ 13246);
        int[] iArr = new int["\u0017M1$x?b<0=6\"=Df\u0003D\u0003*L{C-".length()];
        QB qb = new QB("\u0017M1$x?b<0=6\"=Df\u0003D\u0003*L{C-");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr2 = new Object[0];
        short sXd2 = (short) (C1499aX.Xd() ^ (-30393));
        int[] iArr2 = new int["{x\u0007R\u0001\u007fzvol~rwuItrwgyt".length()];
        QB qb2 = new QB("{x\u0007R\u0001\u007fzvol~rwuItrwgyt");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method2.setAccessible(true);
            return get((Context) method2.invoke(context2, objArr2));
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public RequestManager get(Fragment fragment) throws Throwable {
        Preconditions.checkNotNull(fragment.getContext(), C1593ug.zd("?V]\tMLZ[]c\u0010dfTfi\u0016X\u0018ei\\`\u001dmm b\"ivfmtmw~+nrt~\u0003v2|\t5\u007f\u000b8z\u000f\u0010}\u0001\u0007\u0005\u0005A\u0012\u0016D\u0007\r\u001c\u000e\u001cJ\u0015!M\u0018#P\u0016\u0018')(&1\u001e\u001e", (short) (C1607wl.Xd() ^ 24750), (short) (C1607wl.Xd() ^ 21341)));
        if (!Util.isOnBackgroundThread()) {
            return supportFragmentGet(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
        Context context = fragment.getContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od("\n\u0016\u000b\u0018\u0014\r\u0007O\u0004\u000f\r\u0012\u0002\n\u000fG[\u0007\u0005\ny\f\u0007", (short) (C1633zX.Xd() ^ (-15129)))).getMethod(C1561oA.Kd("\u000b\n\u001ag\u0018\u0019\u0016\u0014\u000f\u000e\"\u0018\u001f\u001ft\"\")\u001b/,", (short) (FB.Xd() ^ 28833)), new Class[0]);
        try {
            method.setAccessible(true);
            return get((Context) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public RequestManager get(FragmentActivity fragmentActivity) {
        if (Util.isOnBackgroundThread()) {
            return get(fragmentActivity.getApplicationContext());
        }
        assertNotDestroyed(fragmentActivity);
        return supportFragmentGet(fragmentActivity, fragmentActivity.getSupportFragmentManager(), null, isActivityVisible(fragmentActivity));
    }

    @Deprecated
    RequestManagerFragment getRequestManagerFragment(Activity activity) {
        return getRequestManagerFragment(activity.getFragmentManager(), null, isActivityVisible(activity));
    }

    SupportRequestManagerFragment getSupportRequestManagerFragment(Context context, androidx.fragment.app.FragmentManager fragmentManager) {
        return getSupportRequestManagerFragment(fragmentManager, null, isActivityVisible(context));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        ComponentCallbacks componentCallbacksRemove;
        int i2 = message.what;
        boolean z2 = true;
        if (i2 == 1) {
            obj = (FragmentManager) message.obj;
            componentCallbacksRemove = this.pendingRequestManagerFragments.remove(obj);
        } else if (i2 != 2) {
            componentCallbacksRemove = null;
            z2 = false;
            obj = null;
        } else {
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            componentCallbacksRemove = this.pendingSupportRequestManagerFragments.remove(obj);
        }
        if (z2 && componentCallbacksRemove == null && Log.isLoggable(TAG, 5)) {
            String str = "Failed to remove expected request manager fragment, manager: " + obj;
        }
        return z2;
    }
}
