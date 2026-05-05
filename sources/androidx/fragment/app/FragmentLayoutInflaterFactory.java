package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R;
import androidx.fragment.app.strictmode.FragmentStrictMode;
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
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
class FragmentLayoutInflaterFactory implements LayoutInflater.Factory2 {
    private static final String TAG = "FragmentManager";
    final FragmentManager mFragmentManager;

    FragmentLayoutInflaterFactory(FragmentManager fragmentManager) {
        this.mFragmentManager = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) throws Throwable {
        final FragmentStateManager fragmentStateManagerCreateOrGetFragmentStateManager;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.mFragmentManager);
        }
        if (!C1561oA.Qd("MXFKPGOT", (short) (Od.Xd() ^ (-5493))).equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, C1593ug.zd("\u001d'\u001d01", (short) (Od.Xd() ^ (-4385)), (short) (Od.Xd() ^ (-15778))));
        Object[] objArr = {attributeSet, R.styleable.Fragment};
        Method method = Class.forName(C1561oA.od("\u0001\r\u0002\u000f\u000b\u0004}Fz\u0006\u0004\tx\u0001\u0006>R}{\u0001p\u0003}", (short) (C1499aX.Xd() ^ (-5849)))).getMethod(Wg.Zd("\u000b\u0010=| {sowATf\u001ed;T\u000e\"\f\u001dh\n", (short) (C1499aX.Xd() ^ (-27093)), (short) (C1499aX.Xd() ^ (-16427))), Class.forName(C1561oA.Kd("}\f\u0003\u0012\u0010\u000b\u0007Q\u001a\u001a\u0010\u0014Vj\u001f \u001f\u0017\u0011%%\u0017\u0006\u0019)", (short) (C1607wl.Xd() ^ 15335))), int[].class);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            if (attributeValue == null) {
                attributeValue = typedArray.getString(R.styleable.Fragment_android_name);
            }
            int resourceId = typedArray.getResourceId(R.styleable.Fragment_android_id, -1);
            String string = typedArray.getString(R.styleable.Fragment_android_tag);
            typedArray.recycle();
            if (attributeValue != null) {
                short sXd = (short) (Od.Xd() ^ (-31743));
                int[] iArr = new int["Vd[jhc_*`mmtfpw2Huu|n\u0003\u007f".length()];
                QB qb = new QB("Vd[jhc_*`mmtfpw2Huu|n\u0003\u007f");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr2 = new Object[0];
                short sXd2 = (short) (C1633zX.Xd() ^ (-1340));
                int[] iArr2 = new int["\u0015\u0014$s\u001e\u0014'(\u0002&\u0019\u001d\u001f-".length()];
                QB qb2 = new QB("\u0015\u0014$s\u001e\u0014'(\u0002&\u0019\u001d\u001f-");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
                    i3++;
                }
                Method method2 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method2.setAccessible(true);
                    if (FragmentFactory.isFragmentClass((ClassLoader) method2.invoke(context, objArr2), attributeValue)) {
                        int id = view != null ? view.getId() : 0;
                        if (id == -1 && resourceId == -1 && string == null) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + Qg.kd("sX\u0005,))S&\"\u0016\u0013\u0018\u0014&K \u0018\u0012\u0019\u001c\u000bD\u0005\u0011\u0006\u0013\u000f\b\u0002V\u0005~E8x\u0005y\u0007\u0003{uJ\u0004ot8+y{(og{i#c!p`pbjo\u001apak^\u0015Ua\u0012ZT\u000fT\\^\u000b", (short) (OY.Xd() ^ 28965), (short) (OY.Xd() ^ 17800)) + attributeValue);
                        }
                        Fragment fragmentFindFragmentById = resourceId != -1 ? this.mFragmentManager.findFragmentById(resourceId) : null;
                        if (fragmentFindFragmentById == null && string != null) {
                            fragmentFindFragmentById = this.mFragmentManager.findFragmentByTag(string);
                        }
                        if (fragmentFindFragmentById == null && id != -1) {
                            fragmentFindFragmentById = this.mFragmentManager.findFragmentById(id);
                        }
                        String strVd = hg.Vd("<gUZ_V^c\u000e", (short) (C1580rY.Xd() ^ (-22137)), (short) (C1580rY.Xd() ^ (-8236)));
                        C1561oA.ud("\u001dH6;@7?D\u001c/;-2/;", (short) (ZN.Xd() ^ 20667));
                        if (fragmentFindFragmentById == null) {
                            FragmentFactory fragmentFactory = this.mFragmentManager.getFragmentFactory();
                            Object[] objArr3 = new Object[0];
                            Method method3 = Class.forName(C1561oA.yd("R`Wfd_[&LYY`R\\c\u001eDqqxj~{", (short) (OY.Xd() ^ 15584))).getMethod(C1561oA.Yd("`_o?i_rsMqdhjx", (short) (Od.Xd() ^ (-20341))), new Class[0]);
                            try {
                                method3.setAccessible(true);
                                fragmentFindFragmentById = fragmentFactory.instantiate((ClassLoader) method3.invoke(context, objArr3), attributeValue);
                                fragmentFindFragmentById.mFromLayout = true;
                                fragmentFindFragmentById.mFragmentId = resourceId != 0 ? resourceId : id;
                                fragmentFindFragmentById.mContainerId = id;
                                fragmentFindFragmentById.mTag = string;
                                fragmentFindFragmentById.mInLayout = true;
                                fragmentFindFragmentById.mFragmentManager = this.mFragmentManager;
                                fragmentFindFragmentById.mHost = this.mFragmentManager.getHost();
                                fragmentFindFragmentById.onInflate(this.mFragmentManager.getHost().getContext(), attributeSet, fragmentFindFragmentById.mSavedFragmentState);
                                fragmentStateManagerCreateOrGetFragmentStateManager = this.mFragmentManager.addFragment(fragmentFindFragmentById);
                                if (FragmentManager.isLoggingEnabled(2)) {
                                    String str2 = strVd + fragmentFindFragmentById + Xg.qd("\u0003LFY\u0007JNOY\fV\\U\\RfXX\u0015l`Y\u0019nca\u001d:erbipiszE(}krF-wsMA\u000b", (short) (C1580rY.Xd() ^ (-16502)), (short) (C1580rY.Xd() ^ (-27810))) + Integer.toHexString(resourceId);
                                }
                            } catch (InvocationTargetException e2) {
                                throw e2.getCause();
                            }
                        } else {
                            if (fragmentFindFragmentById.mInLayout) {
                                throw new IllegalArgumentException(attributeSet.getPositionDescription() + Ig.wd("\u0005F6Ef\u0016-D\u0014l]w\u0013\u0012/'7", (short) (C1499aX.Xd() ^ (-22395))) + Integer.toHexString(resourceId) + EO.Od("Lru\u0007\r\n", (short) (C1607wl.Xd() ^ 11688)) + string + C1561oA.Qd("\u001b\u000e\\^\u000bZJZLTY\u0004LF\u0001\u0010W", (short) (C1607wl.Xd() ^ 32527)) + Integer.toHexString(id) + C1593ug.zd("F\u001f\u0012\u001e\u0013K\u000e\u001c\u001e$\u0019\u0017%S\u001b(\u0018\u001f&\u001f)0\\$.2`", (short) (C1499aX.Xd() ^ (-24218)), (short) (C1499aX.Xd() ^ (-15613))) + attributeValue);
                            }
                            fragmentFindFragmentById.mInLayout = true;
                            fragmentFindFragmentById.mFragmentManager = this.mFragmentManager;
                            fragmentFindFragmentById.mHost = this.mFragmentManager.getHost();
                            fragmentFindFragmentById.onInflate(this.mFragmentManager.getHost().getContext(), attributeSet, fragmentFindFragmentById.mSavedFragmentState);
                            fragmentStateManagerCreateOrGetFragmentStateManager = this.mFragmentManager.createOrGetFragmentStateManager(fragmentFindFragmentById);
                            if (FragmentManager.isLoggingEnabled(2)) {
                                String str3 = Jg.Wd("\u001cd\nlJERGYu8\u001dxtCB\u001f@", (short) (C1607wl.Xd() ^ 1011), (short) (C1607wl.Xd() ^ 3346)) + fragmentFindFragmentById + ZO.xd("r4z^I\u001b\u0014\u0001\u0002va\"\u000evbE\u00056oS2I|n\u000eY\u001a\b j\u001cZ>e/Bq$\u0010|/[ ~7\u0016J'\u001a\u001d\u001d", (short) (C1580rY.Xd() ^ (-2700)), (short) (C1580rY.Xd() ^ (-6149))) + Integer.toHexString(resourceId);
                            }
                        }
                        ViewGroup viewGroup = (ViewGroup) view;
                        FragmentStrictMode.onFragmentTagUsage(fragmentFindFragmentById, viewGroup);
                        fragmentFindFragmentById.mContainer = viewGroup;
                        fragmentStateManagerCreateOrGetFragmentStateManager.moveToExpectedState();
                        fragmentStateManagerCreateOrGetFragmentStateManager.ensureInflatedView();
                        if (fragmentFindFragmentById.mView == null) {
                            throw new IllegalStateException(strVd + attributeValue + C1626yg.Ud("<p0O-\u0007B6Hn\u0002\u0010\u0003~olJxS})G\u0003", (short) (C1607wl.Xd() ^ 23301), (short) (C1607wl.Xd() ^ 21866)));
                        }
                        if (resourceId != 0) {
                            fragmentFindFragmentById.mView.setId(resourceId);
                        }
                        if (fragmentFindFragmentById.mView.getTag() == null) {
                            fragmentFindFragmentById.mView.setTag(string);
                        }
                        fragmentFindFragmentById.mView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.fragment.app.FragmentLayoutInflaterFactory.1
                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewDetachedFromWindow(View view2) {
                            }

                            @Override // android.view.View.OnAttachStateChangeListener
                            public void onViewAttachedToWindow(View view2) {
                                Fragment fragment = fragmentStateManagerCreateOrGetFragmentStateManager.getFragment();
                                fragmentStateManagerCreateOrGetFragmentStateManager.moveToExpectedState();
                                SpecialEffectsController.getOrCreateController((ViewGroup) fragment.mView.getParent(), FragmentLayoutInflaterFactory.this.mFragmentManager).forceCompleteAllOperations();
                            }
                        });
                        return fragmentFindFragmentById.mView;
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }
            return null;
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
