package androidx.fragment.app;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import com.dynatrace.android.agent.Global;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
final class BackStackRecord extends FragmentTransaction implements FragmentManager.BackStackEntry, FragmentManager.OpGenerator {
    private static final String TAG = "FragmentManager";
    boolean mBeingSaved;
    boolean mCommitted;
    int mIndex;
    final FragmentManager mManager;

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.mIndex >= 0) {
            sb.append(" #");
            sb.append(this.mIndex);
        }
        if (this.mName != null) {
            sb.append(Global.BLANK);
            sb.append(this.mName);
        }
        sb.append("}");
        return sb.toString();
    }

    public void dump(String str, PrintWriter printWriter) {
        dump(str, printWriter, true);
    }

    public void dump(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.mName);
            printWriter.print(" mIndex=");
            printWriter.print(this.mIndex);
            printWriter.print(" mCommitted=");
            printWriter.println(this.mCommitted);
            if (this.mTransition != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.mTransition));
            }
            if (this.mEnterAnim != 0 || this.mExitAnim != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.mEnterAnim));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.mExitAnim));
            }
            if (this.mPopEnterAnim != 0 || this.mPopExitAnim != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.mPopEnterAnim));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.mPopExitAnim));
            }
            if (this.mBreadCrumbTitleRes != 0 || this.mBreadCrumbTitleText != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.mBreadCrumbTitleRes));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.mBreadCrumbTitleText);
            }
            if (this.mBreadCrumbShortTitleRes != 0 || this.mBreadCrumbShortTitleText != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.mBreadCrumbShortTitleRes));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.mBreadCrumbShortTitleText);
            }
        }
        if (!this.mOps.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.mOps.size();
            for (int i2 = 0; i2 < size; i2++) {
                FragmentTransaction.Op op = this.mOps.get(i2);
                switch (op.mCmd) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + op.mCmd;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(Global.BLANK);
                printWriter.println(op.mFragment);
                if (z2) {
                    if (op.mEnterAnim != 0 || op.mExitAnim != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(op.mEnterAnim));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(op.mExitAnim));
                    }
                    if (op.mPopEnterAnim != 0 || op.mPopExitAnim != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(op.mPopEnterAnim));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(op.mPopExitAnim));
                    }
                }
            }
        }
    }

    BackStackRecord(FragmentManager fragmentManager) throws Throwable {
        ClassLoader classLoader;
        FragmentFactory fragmentFactory = fragmentManager.getFragmentFactory();
        if (fragmentManager.getHost() != null) {
            Context context = fragmentManager.getHost().getContext();
            short sXd = (short) (C1607wl.Xd() ^ 27820);
            int[] iArr = new int["X\r~n1\u0007 ~\u0002k\u00144Ul\u0003V&`\u00186c+A".length()];
            QB qb = new QB("X\r~n1\u0007 ~\u0002k\u00144Ul\u0003V&`\u00186c+A");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(EO.Od("\u001c@\u007fps5-\u007f\u0017xf\u000e9F", (short) (FB.Xd() ^ 14087)), new Class[0]);
            try {
                method.setAccessible(true);
                classLoader = (ClassLoader) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            classLoader = null;
        }
        super(fragmentFactory, classLoader);
        this.mIndex = -1;
        this.mBeingSaved = false;
        this.mManager = fragmentManager;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    BackStackRecord(BackStackRecord backStackRecord) throws Throwable {
        ClassLoader classLoader;
        FragmentFactory fragmentFactory = backStackRecord.mManager.getFragmentFactory();
        if (backStackRecord.mManager.getHost() != null) {
            Context context = backStackRecord.mManager.getHost().getContext();
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("l\bE\u000b>\u0011dk\u0015a3?\u0019%v\u0016\u000e\"_nLJ&", (short) (Od.Xd() ^ (-16332)), (short) (Od.Xd() ^ (-24006)))).getMethod(C1626yg.Ud("Hqp#Kd\u0005Q}].M]t", (short) (C1580rY.Xd() ^ (-8444)), (short) (C1580rY.Xd() ^ (-23163))), new Class[0]);
            try {
                method.setAccessible(true);
                classLoader = (ClassLoader) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            classLoader = null;
        }
        super(fragmentFactory, classLoader, backStackRecord);
        this.mIndex = -1;
        this.mBeingSaved = false;
        this.mManager = backStackRecord.mManager;
        this.mCommitted = backStackRecord.mCommitted;
        this.mIndex = backStackRecord.mIndex;
        this.mBeingSaved = backStackRecord.mBeingSaved;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getId() {
        return this.mIndex;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getBreadCrumbTitleRes() {
        return this.mBreadCrumbTitleRes;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getBreadCrumbShortTitleRes() {
        return this.mBreadCrumbShortTitleRes;
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public CharSequence getBreadCrumbTitle() throws Throwable {
        if (this.mBreadCrumbTitleRes == 0) {
            return this.mBreadCrumbTitleText;
        }
        Context context = this.mManager.getHost().getContext();
        int i2 = this.mBreadCrumbTitleRes;
        Class<?> cls = Class.forName(C1561oA.od("JVKXTMG\u0010DOMRBJO\b\u001cGEJ:LG", (short) (C1499aX.Xd() ^ (-32650))));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        Method method = cls.getMethod(C1561oA.Kd("TScDVjg", (short) (FB.Xd() ^ 16033)), clsArr);
        try {
            method.setAccessible(true);
            return (CharSequence) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public CharSequence getBreadCrumbShortTitle() throws Throwable {
        if (this.mBreadCrumbShortTitleRes == 0) {
            return this.mBreadCrumbShortTitleText;
        }
        Context context = this.mManager.getHost().getContext();
        int i2 = this.mBreadCrumbShortTitleRes;
        short sXd = (short) (C1499aX.Xd() ^ (-12581));
        int[] iArr = new int["3?4A=60x-86;+38p\u00050.3#50".length()];
        QB qb = new QB("3?4A=60x-86;+38p\u00050.3#50");
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
        Method method = cls.getMethod(C1593ug.zd("PO_@Rfc", (short) (ZN.Xd() ^ 23889), (short) (ZN.Xd() ^ 15885)), clsArr);
        try {
            method.setAccessible(true);
            return (CharSequence) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.fragment.app.FragmentTransaction
    void doAddOp(int i2, Fragment fragment, String str, int i3) {
        super.doAddOp(i2, fragment, str, i3);
        fragment.mFragmentManager = this.mManager;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction remove(Fragment fragment) {
        if (fragment.mFragmentManager != null && fragment.mFragmentManager != this.mManager) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.remove(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction hide(Fragment fragment) {
        if (fragment.mFragmentManager != null && fragment.mFragmentManager != this.mManager) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.hide(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction show(Fragment fragment) {
        if (fragment.mFragmentManager != null && fragment.mFragmentManager != this.mManager) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.show(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction detach(Fragment fragment) {
        if (fragment.mFragmentManager != null && fragment.mFragmentManager != this.mManager) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.detach(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction setPrimaryNavigationFragment(Fragment fragment) {
        if (fragment != null && fragment.mFragmentManager != null && fragment.mFragmentManager != this.mManager) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.setPrimaryNavigationFragment(fragment);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public FragmentTransaction setMaxLifecycle(Fragment fragment, Lifecycle.State state) {
        if (fragment.mFragmentManager != this.mManager) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.mManager);
        }
        if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        }
        if (state == Lifecycle.State.DESTROYED) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        return super.setMaxLifecycle(fragment, state);
    }

    void bumpBackStackNesting(int i2) {
        if (this.mAddToBackStack) {
            if (FragmentManager.isLoggingEnabled(2)) {
                String str = "Bump nesting in " + this + " by " + i2;
            }
            int size = this.mOps.size();
            for (int i3 = 0; i3 < size; i3++) {
                FragmentTransaction.Op op = this.mOps.get(i3);
                if (op.mFragment != null) {
                    op.mFragment.mBackStackNesting += i2;
                    if (FragmentManager.isLoggingEnabled(2)) {
                        String str2 = "Bump nesting of " + op.mFragment + " to " + op.mFragment.mBackStackNesting;
                    }
                }
            }
        }
    }

    public void runOnCommitRunnables() {
        if (this.mCommitRunnables != null) {
            for (int i2 = 0; i2 < this.mCommitRunnables.size(); i2++) {
                this.mCommitRunnables.get(i2).run();
            }
            this.mCommitRunnables = null;
        }
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commit() {
        return commitInternal(false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commitAllowingStateLoss() {
        return commitInternal(true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNow() {
        disallowAddToBackStack();
        this.mManager.execSingleAction(this, false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNowAllowingStateLoss() {
        disallowAddToBackStack();
        this.mManager.execSingleAction(this, true);
    }

    int commitInternal(boolean z2) {
        if (this.mCommitted) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            String str = "Commit: " + this;
            PrintWriter printWriter = new PrintWriter(new LogWriter("FragmentManager"));
            dump("  ", printWriter);
            printWriter.close();
        }
        this.mCommitted = true;
        if (this.mAddToBackStack) {
            this.mIndex = this.mManager.allocBackStackIndex();
        } else {
            this.mIndex = -1;
        }
        this.mManager.enqueueAction(this, z2);
        return this.mIndex;
    }

    @Override // androidx.fragment.app.FragmentManager.OpGenerator
    public boolean generateOps(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.isLoggingEnabled(2)) {
            String str = "Run: " + this;
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.mAddToBackStack) {
            return true;
        }
        this.mManager.addBackStackState(this);
        return true;
    }

    void executeOps() {
        int size = this.mOps.size();
        for (int i2 = 0; i2 < size; i2++) {
            FragmentTransaction.Op op = this.mOps.get(i2);
            Fragment fragment = op.mFragment;
            if (fragment != null) {
                fragment.mBeingSaved = this.mBeingSaved;
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.mTransition);
                fragment.setSharedElementNames(this.mSharedElementSourceNames, this.mSharedElementTargetNames);
            }
            switch (op.mCmd) {
                case 1:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, false);
                    this.mManager.addFragment(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.mCmd);
                case 3:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.removeFragment(fragment);
                    break;
                case 4:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.hideFragment(fragment);
                    break;
                case 5:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, false);
                    this.mManager.showFragment(fragment);
                    break;
                case 6:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.detachFragment(fragment);
                    break;
                case 7:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, false);
                    this.mManager.attachFragment(fragment);
                    break;
                case 8:
                    this.mManager.setPrimaryNavigationFragment(fragment);
                    break;
                case 9:
                    this.mManager.setPrimaryNavigationFragment(null);
                    break;
                case 10:
                    this.mManager.setMaxLifecycle(fragment, op.mCurrentMaxState);
                    break;
            }
        }
    }

    void executePopOps() {
        for (int size = this.mOps.size() - 1; size >= 0; size--) {
            FragmentTransaction.Op op = this.mOps.get(size);
            Fragment fragment = op.mFragment;
            if (fragment != null) {
                fragment.mBeingSaved = this.mBeingSaved;
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.reverseTransit(this.mTransition));
                fragment.setSharedElementNames(this.mSharedElementTargetNames, this.mSharedElementSourceNames);
            }
            switch (op.mCmd) {
                case 1:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, true);
                    this.mManager.removeFragment(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + op.mCmd);
                case 3:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.addFragment(fragment);
                    break;
                case 4:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.showFragment(fragment);
                    break;
                case 5:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, true);
                    this.mManager.hideFragment(fragment);
                    break;
                case 6:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.attachFragment(fragment);
                    break;
                case 7:
                    fragment.setAnimations(op.mEnterAnim, op.mExitAnim, op.mPopEnterAnim, op.mPopExitAnim);
                    this.mManager.setExitAnimationOrder(fragment, true);
                    this.mManager.detachFragment(fragment);
                    break;
                case 8:
                    this.mManager.setPrimaryNavigationFragment(null);
                    break;
                case 9:
                    this.mManager.setPrimaryNavigationFragment(fragment);
                    break;
                case 10:
                    this.mManager.setMaxLifecycle(fragment, op.mOldMaxState);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.Fragment expandOps(java.util.ArrayList<androidx.fragment.app.Fragment> r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r11 = r18
            r10 = r16
            r9 = 0
        L5:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r10.mOps
            int r0 = r0.size()
            if (r9 >= r0) goto Lbf
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r10.mOps
            java.lang.Object r13 = r0.get(r9)
            androidx.fragment.app.FragmentTransaction$Op r13 = (androidx.fragment.app.FragmentTransaction.Op) r13
            int r1 = r13.mCmd
            r8 = 1
            r12 = r17
            if (r1 == r8) goto Lb8
            r0 = 2
            r15 = 0
            r7 = 3
            r6 = 9
            if (r1 == r0) goto L5b
            if (r1 == r7) goto L42
            r0 = 6
            if (r1 == r0) goto L42
            r0 = 7
            if (r1 == r0) goto Lb8
            r0 = 8
            if (r1 == r0) goto L31
        L2f:
            int r9 = r9 + r8
            goto L5
        L31:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r10.mOps
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r0.<init>(r6, r11, r8)
            r1.add(r9, r0)
            r13.mFromExpandedOp = r8
            int r9 = r9 + 1
            androidx.fragment.app.Fragment r11 = r13.mFragment
            goto L2f
        L42:
            androidx.fragment.app.Fragment r0 = r13.mFragment
            r12.remove(r0)
            androidx.fragment.app.Fragment r0 = r13.mFragment
            if (r0 != r11) goto L2f
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r10.mOps
            androidx.fragment.app.FragmentTransaction$Op r1 = new androidx.fragment.app.FragmentTransaction$Op
            androidx.fragment.app.Fragment r0 = r13.mFragment
            r1.<init>(r6, r0)
            r2.add(r9, r1)
            int r9 = r9 + 1
            r11 = r15
            goto L2f
        L5b:
            androidx.fragment.app.Fragment r5 = r13.mFragment
            int r4 = r5.mContainerId
            int r3 = r12.size()
            int r3 = r3 - r8
            r14 = 0
        L65:
            if (r3 < 0) goto La5
            java.lang.Object r2 = r12.get(r3)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            int r0 = r2.mContainerId
            if (r0 != r4) goto L74
            if (r2 != r5) goto L77
            r14 = r8
        L74:
            int r3 = r3 + (-1)
            goto L65
        L77:
            if (r2 != r11) goto L86
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r10.mOps
            androidx.fragment.app.FragmentTransaction$Op r0 = new androidx.fragment.app.FragmentTransaction$Op
            r0.<init>(r6, r2, r8)
            r1.add(r9, r0)
            int r9 = r9 + 1
            r11 = r15
        L86:
            androidx.fragment.app.FragmentTransaction$Op r1 = new androidx.fragment.app.FragmentTransaction$Op
            r1.<init>(r7, r2, r8)
            int r0 = r13.mEnterAnim
            r1.mEnterAnim = r0
            int r0 = r13.mPopEnterAnim
            r1.mPopEnterAnim = r0
            int r0 = r13.mExitAnim
            r1.mExitAnim = r0
            int r0 = r13.mPopExitAnim
            r1.mPopExitAnim = r0
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r10.mOps
            r0.add(r9, r1)
            r12.remove(r2)
            int r9 = r9 + r8
            goto L74
        La5:
            if (r14 == 0) goto Laf
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r10.mOps
            r0.remove(r9)
            int r9 = r9 + (-1)
            goto L2f
        Laf:
            r13.mCmd = r8
            r13.mFromExpandedOp = r8
            r12.add(r5)
            goto L2f
        Lb8:
            androidx.fragment.app.Fragment r0 = r13.mFragment
            r12.add(r0)
            goto L2f
        Lbf:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.BackStackRecord.expandOps(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.Fragment trackAddedFragmentsInPop(java.util.ArrayList<androidx.fragment.app.Fragment> r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r5.mOps
            int r4 = r0.size()
            r3 = 1
            int r4 = r4 - r3
        L8:
            if (r4 < 0) goto L35
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r5.mOps
            java.lang.Object r2 = r0.get(r4)
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.Op) r2
            int r1 = r2.mCmd
            if (r1 == r3) goto L2f
            r0 = 3
            if (r1 == r0) goto L29
            switch(r1) {
                case 6: goto L29;
                case 7: goto L2f;
                case 8: goto L1f;
                case 9: goto L21;
                case 10: goto L24;
                default: goto L1c;
            }
        L1c:
            int r4 = r4 + (-1)
            goto L8
        L1f:
            r7 = 0
            goto L1c
        L21:
            androidx.fragment.app.Fragment r7 = r2.mFragment
            goto L1c
        L24:
            androidx.lifecycle.Lifecycle$State r0 = r2.mOldMaxState
            r2.mCurrentMaxState = r0
            goto L1c
        L29:
            androidx.fragment.app.Fragment r0 = r2.mFragment
            r6.add(r0)
            goto L1c
        L2f:
            androidx.fragment.app.Fragment r0 = r2.mFragment
            r6.remove(r0)
            goto L1c
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.BackStackRecord.trackAddedFragmentsInPop(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    void collapseOps() {
        int size = this.mOps.size() - 1;
        while (size >= 0) {
            FragmentTransaction.Op op = this.mOps.get(size);
            if (op.mFromExpandedOp) {
                if (op.mCmd == 8) {
                    op.mFromExpandedOp = false;
                    this.mOps.remove(size - 1);
                    size--;
                } else {
                    int i2 = op.mFragment.mContainerId;
                    op.mCmd = 2;
                    op.mFromExpandedOp = false;
                    for (int i3 = size - 1; i3 >= 0; i3--) {
                        FragmentTransaction.Op op2 = this.mOps.get(i3);
                        if (op2.mFromExpandedOp && op2.mFragment.mContainerId == i2) {
                            this.mOps.remove(i3);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public String getName() {
        return this.mName;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public boolean isEmpty() {
        return this.mOps.isEmpty();
    }
}
