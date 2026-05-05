package com.incode.welcome_sdk.views.b;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class d {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(androidx.compose.ui.Modifier r59, androidx.compose.runtime.Composer r60, int r61, int r62) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.views.b.d.d(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    static final class c extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f18189d = new c();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semanticsPropertyReceiver2 = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semanticsPropertyReceiver2, "");
            SemanticsPropertiesKt.invisibleToUser(semanticsPropertyReceiver2);
            return Unit.INSTANCE;
        }

        c() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.views.b.d$d, reason: collision with other inner class name */
    static final class C0257d extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0257d f18190b = new C0257d();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semanticsPropertyReceiver2 = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semanticsPropertyReceiver2, "");
            SemanticsPropertiesKt.invisibleToUser(semanticsPropertyReceiver2);
            return Unit.INSTANCE;
        }

        C0257d() {
            super(1);
        }
    }

    static final class a extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18185a = new a();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semanticsPropertyReceiver2 = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semanticsPropertyReceiver2, "");
            SemanticsPropertiesKt.invisibleToUser(semanticsPropertyReceiver2);
            return Unit.INSTANCE;
        }

        a() {
            super(1);
        }
    }

    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Modifier f18186a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f18187c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ int f18188e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            d.d(this.f18186a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f18188e | 1), this.f18187c);
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Modifier modifier, int i2, int i3) {
            super(2);
            this.f18186a = modifier;
            this.f18188e = i2;
            this.f18187c = i3;
        }
    }
}
