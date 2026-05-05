package com.incode.welcome_sdk.ui.tutorial.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.incode.welcome_sdk.ui.tutorial.fragments.TutorialAgeAssuranceFragment;
import com.incode.welcome_sdk.ui.tutorial.fragments.TutorialPassport1Fragment;
import com.incode.welcome_sdk.ui.tutorial.fragments.TutorialPassport2Fragment;
import com.incode.welcome_sdk.ui.tutorial.fragments.TutorialPassport3Fragment;
import com.incode.welcome_sdk.ui.tutorial.fragments.TutorialPassport4Fragment;

/* JADX INFO: loaded from: classes5.dex */
public class TutorialPassportAdapter extends FragmentStatePagerAdapter {

    /* JADX INFO: renamed from: b */
    private static int f17935b = 0;

    /* JADX INFO: renamed from: c */
    private static int f17936c = 1;

    /* JADX INFO: renamed from: a */
    private final int f17937a;

    /* JADX INFO: renamed from: d */
    private final boolean f17938d;

    public TutorialPassportAdapter(FragmentManager fragmentManager, boolean z2) {
        super(fragmentManager, 1);
        this.f17938d = z2;
        this.f17937a = z2 ? 5 : 4;
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int i2) {
        int i3 = 2 % 2;
        int i4 = f17936c + 113;
        int i5 = i4 % 128;
        f17935b = i5;
        Object obj = null;
        if (i4 % 2 == 0) {
            if (this.f17938d) {
                int i6 = i5 + 81;
                f17936c = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 76 / 0;
                }
            } else {
                i2++;
            }
            if (i2 == 0) {
                return TutorialAgeAssuranceFragment.newInstance();
            }
            if (i2 == 1) {
                return TutorialPassport1Fragment.newInstance();
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    return TutorialPassport3Fragment.newInstance();
                }
                if (i2 != 4) {
                    return null;
                }
                return TutorialPassport4Fragment.newInstance();
            }
            TutorialPassport2Fragment tutorialPassport2FragmentNewInstance = TutorialPassport2Fragment.newInstance();
            int i8 = f17935b + 67;
            f17936c = i8 % 128;
            if (i8 % 2 != 0) {
                return tutorialPassport2FragmentNewInstance;
            }
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        int i2 = 2 % 2;
        int i3 = f17935b + 85;
        int i4 = i3 % 128;
        f17936c = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i5 = this.f17937a;
        int i6 = i4 + 23;
        f17935b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 83 / 0;
        }
        return i5;
    }
}
