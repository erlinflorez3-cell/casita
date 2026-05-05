package com.incode.welcome_sdk.ui.composables;

import android.graphics.Canvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class DrawWithLayerKt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f13012b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f13013d = 0;

    public static final void drawWithLayer(DrawScope drawScope, Function1<? super DrawScope, Unit> function1) {
        int i2 = 2 % 2;
        int i3 = f13013d + 29;
        f13012b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(drawScope, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas());
        int iSaveLayer = nativeCanvas.saveLayer(null, null);
        function1.invoke(drawScope);
        nativeCanvas.restoreToCount(iSaveLayer);
        int i5 = f13013d + 63;
        f13012b = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
