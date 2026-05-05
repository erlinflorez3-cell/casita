package com.incode.welcome_sdk.ui.dynamic_forms.view.components;

import android.os.Process;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class EmojiViewKt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f13986b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f13987e = 1;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void EmojiView(java.lang.String r37, androidx.compose.ui.text.TextStyle r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.components.EmojiViewKt.EmojiView(java.lang.String, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f13988a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f13989b = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f13990g = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f13991j = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ TextStyle f13992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f13993d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ String f13994e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ int f13995f;

        public static int e() {
            int i2 = f13988a;
            int i3 = i2 % 5497928;
            f13988a = i2 + 1;
            if (i3 != 0) {
                return f13989b;
            }
            int iMyUid = Process.myUid();
            f13989b = iMyUid;
            return iMyUid;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13991j + 11;
            f13990g = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            throw null;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13991j + 47;
            f13990g = i3 % 128;
            int i4 = i3 % 2;
            EmojiViewKt.EmojiView(this.f13994e, this.f13992c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13993d | 1), this.f13995f);
            int i5 = f13991j + 45;
            f13990g = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, TextStyle textStyle, int i2, int i3) {
            super(2);
            this.f13994e = str;
            this.f13992c = textStyle;
            this.f13993d = i2;
            this.f13995f = i3;
        }
    }
}
