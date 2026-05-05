package com.incode.welcome_sdk.d;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.views.IncodeButton;
import com.incode.welcome_sdk.views.IncodeDividerView;
import com.incode.welcome_sdk.views.IncodeEditText;
import com.incode.welcome_sdk.views.IncodeTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class az implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IncodeButton f6983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncodeTextView f6984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f6985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IncodeEditText f6986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConstraintLayout f6987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IncodeDividerView f6988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f6989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private IncodeDividerView f6990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ImageView f6991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private IncodeTextView f6992j;

    private az(ConstraintLayout constraintLayout, IncodeButton incodeButton, IncodeDividerView incodeDividerView, IncodeDividerView incodeDividerView2, IncodeEditText incodeEditText, ImageView imageView, View view, RecyclerView recyclerView, IncodeTextView incodeTextView, IncodeTextView incodeTextView2) {
        this.f6987e = constraintLayout;
        this.f6983a = incodeButton;
        this.f6990h = incodeDividerView;
        this.f6988f = incodeDividerView2;
        this.f6986d = incodeEditText;
        this.f6991i = imageView;
        this.f6989g = view;
        this.f6985c = recyclerView;
        this.f6984b = incodeTextView;
        this.f6992j = incodeTextView2;
    }

    public final ConstraintLayout e() {
        return this.f6987e;
    }

    public static az c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewFindChildViewById;
        View viewInflate = layoutInflater.inflate(R.layout.onboard_sdk_fragment_video_conference_chat, viewGroup, false);
        int i2 = R.id.btnSend;
        IncodeButton incodeButton = (IncodeButton) ViewBindings.findChildViewById(viewInflate, i2);
        if (incodeButton != null) {
            i2 = R.id.dividerBottom;
            IncodeDividerView incodeDividerView = (IncodeDividerView) ViewBindings.findChildViewById(viewInflate, i2);
            if (incodeDividerView != null) {
                i2 = R.id.dividerTop;
                IncodeDividerView incodeDividerView2 = (IncodeDividerView) ViewBindings.findChildViewById(viewInflate, i2);
                if (incodeDividerView2 != null) {
                    i2 = R.id.etChat;
                    IncodeEditText incodeEditText = (IncodeEditText) ViewBindings.findChildViewById(viewInflate, i2);
                    if (incodeEditText != null) {
                        i2 = R.id.ivInterviewerAvatar;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, i2);
                        if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, (i2 = R.id.onlineIndicator))) != null) {
                            i2 = R.id.rvChat;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, i2);
                            if (recyclerView != null) {
                                i2 = R.id.tvInterviewerName;
                                IncodeTextView incodeTextView = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                if (incodeTextView != null) {
                                    i2 = R.id.txtOnlineIndicator;
                                    IncodeTextView incodeTextView2 = (IncodeTextView) ViewBindings.findChildViewById(viewInflate, i2);
                                    if (incodeTextView2 != null) {
                                        return new az((ConstraintLayout) viewInflate, incodeButton, incodeDividerView, incodeDividerView2, incodeEditText, imageView, viewFindChildViewById, recyclerView, incodeTextView, incodeTextView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
    }

    @Override // androidx.viewbinding.ViewBinding
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.f6987e;
    }
}
