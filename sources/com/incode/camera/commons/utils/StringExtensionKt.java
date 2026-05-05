package com.incode.camera.commons.utils;

import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"trimNewline", "", "core-light_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StringExtensionKt {
    private static int IncodeCamera = 1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static int f3640e1 = 0;

    public static final String trimNewline(String str) {
        String strReplace$default;
        int i2 = 2 % 2;
        int i3 = f3640e1 + 61;
        IncodeCamera = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            strReplace$default = StringsKt.replace$default(StringsKt.trimIndent(str), "\n", Global.BLANK, false, 5, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            strReplace$default = StringsKt.replace$default(StringsKt.trimIndent(str), "\n", Global.BLANK, false, 4, (Object) null);
        }
        int i4 = f3640e1 + 115;
        IncodeCamera = i4 % 128;
        if (i4 % 2 != 0) {
            return strReplace$default;
        }
        throw null;
    }
}
