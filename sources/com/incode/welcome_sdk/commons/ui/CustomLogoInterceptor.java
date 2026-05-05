package com.incode.welcome_sdk.commons.ui;

import android.view.View;
import android.widget.ImageView;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ThemeConfiguration;
import dev.b3nedikt.viewpump.InflateResult;
import dev.b3nedikt.viewpump.Interceptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class CustomLogoInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5772a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CustomLogoInterceptor f5773b = new CustomLogoInterceptor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ThemeConfiguration f5774c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5775d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5776e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f5777f = 1;

    private CustomLogoInterceptor() {
    }

    public final void setThemeConfiguration(ThemeConfiguration themeConfiguration) {
        int i2 = 2 % 2;
        int i3 = f5775d + 111;
        int i4 = i3 % 128;
        f5772a = i4;
        int i5 = i3 % 2;
        f5774c = themeConfiguration;
        int i6 = i4 + 23;
        f5775d = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public final InflateResult intercept(Interceptor.Chain chain) {
        int i2 = 2 % 2;
        int i3 = f5772a + 7;
        f5775d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(chain, "");
        InflateResult inflateResultProceed = chain.proceed(chain.request());
        if (f5774c != null) {
            View view = inflateResultProceed.getView();
            if (view instanceof ImageView) {
                int i5 = f5775d + 1;
                f5772a = i5 % 128;
                int i6 = i5 % 2;
                ImageView imageView = (ImageView) view;
                if (imageView.getId() == R.id.ivLogoTop) {
                    ThemeConfiguration themeConfiguration = f5774c;
                    int logo = themeConfiguration != null ? themeConfiguration.getLogo() : -1;
                    if (logo >= 0) {
                        int i7 = f5775d + 41;
                        f5772a = i7 % 128;
                        if (i7 % 2 != 0) {
                            throw null;
                        }
                    } else {
                        logo = R.drawable.onboard_sdk_logo_top;
                    }
                    imageView.setImageResource(logo);
                }
            }
        }
        return inflateResultProceed;
    }

    static {
        int i2 = f5776e + 23;
        f5777f = i2 % 128;
        int i3 = i2 % 2;
    }
}
