package com.incode.camera.commons.utils;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0005"}, d2 = {"afterMeasured", "", "Landroid/view/View;", "block", "Lkotlin/Function1;", "core-light_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ViewExtensionsKt {
    private static int IncodeCamera = 0;
    private static int ProcessCameraProviderExtensionsKt = 1;

    public static final void afterMeasured(final View view, final Function1<? super View, Unit> function1) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.incode.camera.commons.utils.ViewExtensionsKt.afterMeasured.1
                private static int CameraConstants = 0;
                private static int IncodeCamera = 1;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    int i3 = 2 % 2;
                    if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
                        return;
                    }
                    int i4 = CameraConstants + 33;
                    IncodeCamera = i4 % 128;
                    if (i4 % 2 == 0) {
                        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        function1.invoke(view);
                        throw null;
                    }
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    function1.invoke(view);
                    int i5 = IncodeCamera + 31;
                    CameraConstants = i5 % 128;
                    int i6 = i5 % 2;
                }
            });
            return;
        }
        int i3 = ProcessCameraProviderExtensionsKt + 125;
        IncodeCamera = i3 % 128;
        int i4 = i3 % 2;
        function1.invoke(view);
        int i5 = ProcessCameraProviderExtensionsKt + 47;
        IncodeCamera = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
    }
}
