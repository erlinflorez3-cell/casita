package com.incode.welcome_sdk.views.b;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class e {
    /* JADX WARN: Removed duplicated region for block: B:162:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:307:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(androidx.compose.ui.Modifier r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, java.lang.String r52, com.incode.welcome_sdk.views.b.c r53, boolean r54, float r55, androidx.compose.runtime.Composer r56, int r57, int r58) {
        /*
            Method dump skipped, instruction units count: 1168
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.views.b.e.e(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, java.lang.String, com.incode.welcome_sdk.views.b.c, boolean, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.views.b.e$e */
    static final class C0258e extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: e */
        public static final C0258e f18202e = new C0258e();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
            return Unit.INSTANCE;
        }

        C0258e() {
            super(1);
        }
    }

    static final class b extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a */
        private /* synthetic */ String f18199a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ TextStyle f18200b;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((iIntValue & 81) != 16 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1157387437, iIntValue, -1, "com.incode.welcome_sdk.views.composables.IncodeButton.<anonymous> (IncodeButton.kt:102)");
                }
                TextKt.m2711Text4IGK_g(this.f18199a, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, this.f18200b, composer2, 0, 0, 65534);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, TextStyle textStyle) {
            super(3);
            this.f18199a = str;
            this.f18200b = textStyle;
        }
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a */
        private /* synthetic */ Modifier f18191a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ com.incode.welcome_sdk.views.b.c f18192b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ boolean f18193c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ Function0<Unit> f18194d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ String f18195e;

        /* JADX INFO: renamed from: f */
        private /* synthetic */ float f18196f;

        /* JADX INFO: renamed from: h */
        private /* synthetic */ int f18197h;

        /* JADX INFO: renamed from: j */
        private /* synthetic */ int f18198j;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            e.e(this.f18191a, this.f18194d, this.f18195e, this.f18192b, this.f18193c, this.f18196f, composer, RecomposeScopeImplKt.updateChangedFlags(this.f18198j | 1), this.f18197h);
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Modifier modifier, Function0<Unit> function0, String str, com.incode.welcome_sdk.views.b.c cVar, boolean z2, float f2, int i2, int i3) {
            super(2);
            this.f18191a = modifier;
            this.f18194d = function0;
            this.f18195e = str;
            this.f18192b = cVar;
            this.f18193c = z2;
            this.f18196f = f2;
            this.f18198j = i2;
            this.f18197h = i3;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f18201b;

        static {
            int[] iArr = new int[com.incode.welcome_sdk.views.b.c.values().length];
            try {
                iArr[com.incode.welcome_sdk.views.b.c.f18184e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.incode.welcome_sdk.views.b.c.f18183d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f18201b = iArr;
        }
    }
}
