package com.incode.welcome_sdk.ui.results.fragments;

import androidx.fragment.app.Fragment;
import com.incode.welcome_sdk.d.bd;
import com.incode.welcome_sdk.data.remote.beans.GovernmentValidationResults;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class GovernmentValidationResultsFragment extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f17319c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17320e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f17321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private bd f17322b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private GovernmentValidationResults f17323d;

    public static GovernmentValidationResultsFragment newInstance(File file, GovernmentValidationResults governmentValidationResults) {
        int i2 = 2 % 2;
        GovernmentValidationResultsFragment governmentValidationResultsFragment = new GovernmentValidationResultsFragment();
        governmentValidationResultsFragment.f17321a = file;
        governmentValidationResultsFragment.f17323d = governmentValidationResults;
        int i3 = f17320e + 125;
        f17319c = i3 % 128;
        int i4 = i3 % 2;
        return governmentValidationResultsFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            com.incode.welcome_sdk.d.bd r0 = com.incode.welcome_sdk.d.bd.b(r6, r7)
            r5.f17322b = r0
            androidx.core.widget.NestedScrollView r3 = r0.b()
            com.incode.welcome_sdk.data.remote.beans.GovernmentValidationResults r0 = r5.f17323d
            if (r0 == 0) goto L69
            androidx.core.util.Pair r0 = r0.getStatus()
            r2 = 0
            if (r0 == 0) goto L5f
            com.incode.welcome_sdk.data.remote.beans.GovernmentValidationResults r0 = r5.f17323d
            androidx.core.util.Pair r0 = r0.getStatus()
            S r0 = r0.second
            if (r0 == 0) goto L5f
            int r0 = com.incode.welcome_sdk.ui.results.fragments.GovernmentValidationResultsFragment.f17320e
            int r1 = r0 + 45
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.results.fragments.GovernmentValidationResultsFragment.f17319c = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L6e
            com.incode.welcome_sdk.data.remote.beans.GovernmentValidationResults r0 = r5.f17323d
            androidx.core.util.Pair r0 = r0.getStatus()
            S r0 = r0.second
            androidx.core.util.Pair r0 = (androidx.core.util.Pair) r0
            F r0 = r0.first
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 10
            int r0 = r0 / r2
            if (r1 != 0) goto L5f
        L44:
            com.incode.welcome_sdk.data.remote.beans.GovernmentValidationResults r0 = r5.f17323d
            androidx.core.util.Pair r0 = r0.getStatus()
            S r0 = r0.second
            androidx.core.util.Pair r0 = (androidx.core.util.Pair) r0
            F r0 = r0.first
            java.lang.String r0 = (java.lang.String) r0
            int r2 = java.lang.Integer.parseInt(r0)
            int r0 = com.incode.welcome_sdk.ui.results.fragments.GovernmentValidationResultsFragment.f17319c
            int r1 = r0 + 1
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.results.fragments.GovernmentValidationResultsFragment.f17320e = r0
            int r1 = r1 % r4
        L5f:
            switch(r2) {
                case 2: goto L6a;
                case 3: goto L6a;
                case 4: goto L6a;
                case 5: goto L6a;
                case 6: goto L6a;
                case 7: goto L6a;
                case 8: goto L6a;
                case 9: goto L6a;
                default: goto L62;
            }
        L62:
            android.content.Context r0 = r3.getContext()
            r5.e(r0)
        L69:
            return r3
        L6a:
            r5.e(r2)
            goto L69
        L6e:
            com.incode.welcome_sdk.data.remote.beans.GovernmentValidationResults r0 = r5.f17323d
            androidx.core.util.Pair r0 = r0.getStatus()
            S r0 = r0.second
            androidx.core.util.Pair r0 = (androidx.core.util.Pair) r0
            F r0 = r0.first
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L5f
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.results.fragments.GovernmentValidationResultsFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(android.content.Context r10) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.results.fragments.GovernmentValidationResultsFragment.e(android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(int r5) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.results.fragments.GovernmentValidationResultsFragment.f17319c
            int r1 = r0 + 93
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.results.fragments.GovernmentValidationResultsFragment.f17320e = r0
            int r1 = r1 % r3
            r2 = 0
            if (r1 != 0) goto L2c
            com.incode.welcome_sdk.d.bd r0 = r4.f17322b
            android.widget.ImageView r1 = r0.f7030b
            int r0 = com.incode.welcome_sdk.R.drawable.onboard_sdk_ine_error_small
            r1.setImageResource(r0)
            com.incode.welcome_sdk.d.bd r0 = r4.f17322b
            com.incode.welcome_sdk.views.IncodeTextView r0 = r0.f7037i
            r0.setVisibility(r2)
            switch(r5) {
                case 2: goto L40;
                case 3: goto L43;
                case 4: goto L46;
                case 5: goto L49;
                case 6: goto L4c;
                case 7: goto L58;
                case 8: goto L64;
                case 9: goto L67;
                default: goto L22;
            }
        L22:
            int r2 = com.incode.welcome_sdk.R.string.onboard_sdk_ine_validation_failure
        L24:
            com.incode.welcome_sdk.d.bd r0 = r4.f17322b
            com.incode.welcome_sdk.views.IncodeTextView r0 = r0.f7037i
            r0.setText(r2)
            return
        L2c:
            com.incode.welcome_sdk.d.bd r0 = r4.f17322b
            android.widget.ImageView r1 = r0.f7030b
            int r0 = com.incode.welcome_sdk.R.drawable.onboard_sdk_ine_error_small
            r1.setImageResource(r0)
            com.incode.welcome_sdk.d.bd r0 = r4.f17322b
            com.incode.welcome_sdk.views.IncodeTextView r0 = r0.f7037i
            r0.setVisibility(r2)
            switch(r5) {
                case 2: goto L40;
                case 3: goto L43;
                case 4: goto L46;
                case 5: goto L49;
                case 6: goto L4c;
                case 7: goto L58;
                case 8: goto L64;
                case 9: goto L67;
                default: goto L3f;
            }
        L3f:
            goto L22
        L40:
            int r2 = com.incode.welcome_sdk.R.string.onboard_sdk_ine_validation_connection_error
            goto L24
        L43:
            int r2 = com.incode.welcome_sdk.R.string.onboard_sdk_ine_validation_ine_infrastructure_error
            goto L24
        L46:
            int r2 = com.incode.welcome_sdk.R.string.onboard_sdk_ine_validation_module_not_supported_error
            goto L24
        L49:
            int r2 = com.incode.welcome_sdk.R.string.onboard_sdk_ine_validation_missing_document_identifier_error
            goto L24
        L4c:
            int r2 = com.incode.welcome_sdk.R.string.onboard_sdk_ine_validation_missing_selfie_error
            int r0 = com.incode.welcome_sdk.ui.results.fragments.GovernmentValidationResultsFragment.f17319c
            int r1 = r0 + 101
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.results.fragments.GovernmentValidationResultsFragment.f17320e = r0
            int r1 = r1 % r3
            goto L24
        L58:
            int r2 = com.incode.welcome_sdk.R.string.onboard_sdk_ine_validation_user_not_found_error
            int r0 = com.incode.welcome_sdk.ui.results.fragments.GovernmentValidationResultsFragment.f17320e
            int r1 = r0 + 59
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.results.fragments.GovernmentValidationResultsFragment.f17319c = r0
            int r1 = r1 % r3
            goto L24
        L64:
            int r2 = com.incode.welcome_sdk.R.string.onboard_sdk_ine_validation_user_not_in_database
            goto L24
        L67:
            int r2 = com.incode.welcome_sdk.R.string.onboard_sdk_ine_validation_insufficient_lookup_data
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.results.fragments.GovernmentValidationResultsFragment.e(int):void");
    }
}
