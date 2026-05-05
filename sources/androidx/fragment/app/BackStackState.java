package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Qg;
import yg.Wg;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>() { // from class: androidx.fragment.app.BackStackState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BackStackState[] newArray(int i2) {
            return new BackStackState[i2];
        }
    };
    final List<String> mFragments;
    final List<BackStackRecordState> mTransactions;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    BackStackState(List<String> list, List<BackStackRecordState> list2) {
        this.mFragments = list;
        this.mTransactions = list2;
    }

    BackStackState(Parcel parcel) {
        this.mFragments = parcel.createStringArrayList();
        this.mTransactions = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    List<BackStackRecord> instantiate(FragmentManager fragmentManager, Map<String, Fragment> map) throws Throwable {
        HashMap map2 = new HashMap(this.mFragments.size());
        for (String str : this.mFragments) {
            Fragment fragment = map.get(str);
            if (fragment != null) {
                map2.put(fragment.mWho, fragment);
            } else {
                Bundle savedState = fragmentManager.getFragmentStore().setSavedState(str, null);
                if (savedState != null) {
                    Context context = fragmentManager.getHost().getContext();
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(Wg.Zd("wC\u001f0\u0015mr\u001d\\\u0003rnRSH_}HQ8\u000f%\r", (short) (C1580rY.Xd() ^ (-21190)), (short) (C1580rY.Xd() ^ (-16579)))).getMethod(C1561oA.Xd("BAQ!KATU/SFJLZ", (short) (C1633zX.Xd() ^ (-21471))), new Class[0]);
                    try {
                        method.setAccessible(true);
                        ClassLoader classLoader = (ClassLoader) method.invoke(context, objArr);
                        Fragment fragmentInstantiate = ((FragmentState) savedState.getParcelable(Wg.vd("zzfxh", (short) (C1499aX.Xd() ^ (-15572))))).instantiate(fragmentManager.getFragmentFactory(), classLoader);
                        fragmentInstantiate.mSavedFragmentState = savedState;
                        Bundle bundle = fragmentInstantiate.mSavedFragmentState;
                        String strKd = Qg.kd("cPdRP4X\\\\HTHI6VBTD", (short) (FB.Xd() ^ 26304), (short) (FB.Xd() ^ 25937));
                        if (bundle.getBundle(strKd) == null) {
                            fragmentInstantiate.mSavedFragmentState.putBundle(strKd, new Bundle());
                        }
                        Bundle bundle2 = savedState.getBundle(hg.Vd("=MANE<DIG", (short) (OY.Xd() ^ 5230), (short) (OY.Xd() ^ 29572)));
                        if (bundle2 != null) {
                            bundle2.setClassLoader(classLoader);
                        }
                        fragmentInstantiate.setArguments(bundle2);
                        map2.put(fragmentInstantiate.mWho, fragmentInstantiate);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } else {
                    continue;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<BackStackRecordState> it = this.mTransactions.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().instantiate(fragmentManager, map2));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.mFragments);
        parcel.writeTypedList(this.mTransactions);
    }
}
