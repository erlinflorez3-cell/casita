package com.incode.welcome_sdk.ui.results.common;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.data.remote.beans.bj;
import com.incode.welcome_sdk.ui.results.fragments.FacialRecognitionResultsFragment;
import com.incode.welcome_sdk.ui.results.fragments.GovernmentValidationResultsFragment;
import com.incode.welcome_sdk.ui.results.fragments.IdVerificationResultsFragment;
import com.incode.welcome_sdk.ui.results.fragments.LivenessCheckResultsFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class SlidePagerAdapter extends FragmentStatePagerAdapter implements PageIconProvider {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f17286f = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f17287i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f17288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f17289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f17290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f17291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bj f17292e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<ResultTab> f17293g;

    public enum ResultTab {
        GOV_VALIDATION,
        ID_VALIDATION,
        LIVENESS,
        FACE_RECOGNITION;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f17302f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f17303g = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f17304i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f17305j = 1;

        public static ResultTab valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f17305j + 77;
            f17302f = i3 % 128;
            int i4 = i3 % 2;
            ResultTab resultTab = (ResultTab) Enum.valueOf(ResultTab.class, str);
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f17305j + 83;
            f17302f = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 81 / 0;
            }
            return resultTab;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ResultTab[] valuesCustom() {
            int i2 = 2 % 2;
            int i3 = f17305j + 5;
            f17302f = i3 % 128;
            int i4 = i3 % 2;
            ResultTab[] resultTabArrValuesCustom = values();
            if (i4 == 0) {
                return (ResultTab[]) resultTabArrValuesCustom.clone();
            }
            throw null;
        }

        static {
            int i2 = f17303g + 81;
            f17304i = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public SlidePagerAdapter(bj bjVar, File file, File file2, File file3, File file4, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f17292e = new bj();
        this.f17293g = new ArrayList();
        this.f17290c = file;
        this.f17288a = file2;
        this.f17291d = file3;
        this.f17289b = file4;
        this.f17292e = bjVar;
        if (bjVar.d() != null) {
            this.f17293g.add(ResultTab.GOV_VALIDATION);
        }
        if (bjVar.a() != null) {
            this.f17293g.add(ResultTab.ID_VALIDATION);
        }
        if (bjVar.e() != null) {
            this.f17293g.add(ResultTab.LIVENESS);
        }
        if (bjVar.b() != null) {
            this.f17293g.add(ResultTab.FACE_RECOGNITION);
        }
    }

    public SlidePagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f17292e = new bj();
        this.f17293g = new ArrayList();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        int i2 = 2 % 2;
        int i3 = f17287i;
        int i4 = i3 + 35;
        f17286f = i4 % 128;
        int i5 = i4 % 2 == 0 ? 10 : -2;
        int i6 = i3 + 59;
        f17286f = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public Fragment getItem(int i2) {
        int i3 = 2 % 2;
        int i4 = f17287i + 29;
        f17286f = i4 % 128;
        if (i4 % 2 == 0) {
            b(this.f17293g.get(i2));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Fragment fragmentB = b(this.f17293g.get(i2));
        int i5 = f17287i + 101;
        f17286f = i5 % 128;
        int i6 = i5 % 2;
        return fragmentB;
    }

    @Override // com.incode.welcome_sdk.ui.results.common.PageIconProvider
    public int getPageIcon(int i2) {
        int i3 = 2 % 2;
        int i4 = f17286f + 11;
        f17287i = i4 % 128;
        int i5 = i4 % 2;
        ResultTab resultTab = this.f17293g.get(i2);
        if (i5 == 0) {
            return e(resultTab);
        }
        e(resultTab);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        int i2 = 2 % 2;
        int i3 = f17287i + 25;
        f17286f = i3 % 128;
        int i4 = i3 % 2;
        int size = this.f17293g.size();
        int i5 = f17286f + 73;
        f17287i = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return size;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.results.common.SlidePagerAdapter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17294b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f17295d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17296e = 0;

        static {
            int[] iArr = new int[ResultTab.valuesCustom().length];
            f17295d = iArr;
            try {
                iArr[ResultTab.GOV_VALIDATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17295d[ResultTab.ID_VALIDATION.ordinal()] = 2;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17295d[ResultTab.LIVENESS.ordinal()] = 3;
                int i3 = f17296e + 53;
                f17294b = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17295d[ResultTab.FACE_RECOGNITION.ordinal()] = 4;
                int i6 = f17294b + 101;
                f17296e = i6 % 128;
                int i7 = i6 % 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private Fragment b(ResultTab resultTab) {
        int i2 = 2 % 2;
        int i3 = AnonymousClass1.f17295d[resultTab.ordinal()];
        Object obj = null;
        if (i3 == 1) {
            GovernmentValidationResultsFragment governmentValidationResultsFragmentNewInstance = GovernmentValidationResultsFragment.newInstance(this.f17291d, this.f17292e.d());
            int i4 = f17286f + 115;
            f17287i = i4 % 128;
            if (i4 % 2 == 0) {
                return governmentValidationResultsFragmentNewInstance;
            }
            obj.hashCode();
            throw null;
        }
        if (i3 == 2) {
            return IdVerificationResultsFragment.newInstance(this.f17290c, this.f17288a, this.f17292e.a());
        }
        if (i3 == 3) {
            return LivenessCheckResultsFragment.newInstance(this.f17292e.e());
        }
        if (i3 != 4) {
            int i5 = f17287i + 125;
            f17286f = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
        FacialRecognitionResultsFragment facialRecognitionResultsFragmentNewInstance = FacialRecognitionResultsFragment.newInstance(this.f17291d, this.f17289b, this.f17292e.b());
        int i7 = f17287i + 33;
        f17286f = i7 % 128;
        if (i7 % 2 != 0) {
            return facialRecognitionResultsFragmentNewInstance;
        }
        throw null;
    }

    private static int e(ResultTab resultTab) {
        int i2 = 2 % 2;
        int i3 = f17286f + 111;
        f17287i = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = AnonymousClass1.f17295d[resultTab.ordinal()];
            if (i4 == 1) {
                return R.drawable.onboard_sdk_tab_ine_validation;
            }
            if (i4 == 2) {
                return R.drawable.onboard_sdk_tab_id_verification;
            }
            if (i4 != 3) {
                if (i4 != 4) {
                    return 0;
                }
                return R.drawable.onboard_sdk_tab_facial_recognition;
            }
            int i5 = R.drawable.onboard_sdk_tab_liveness_check;
            int i6 = f17286f + 121;
            f17287i = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }
        int i8 = AnonymousClass1.f17295d[resultTab.ordinal()];
        throw null;
    }
}
