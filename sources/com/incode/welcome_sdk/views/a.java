package com.incode.welcome_sdk.views;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:185:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:353:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.Modifier r24, java.lang.String r25, kotlin.jvm.functions.Function0<kotlin.Unit> r26, boolean r27, boolean r28, boolean r29, boolean r30, androidx.compose.ui.Alignment.Horizontal r31, androidx.compose.foundation.layout.Arrangement.Vertical r32, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 839
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.views.a.a(androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function0, boolean, boolean, boolean, boolean, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    static final class b extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: c */
        private /* synthetic */ String f18169c;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semanticsPropertyReceiver2 = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semanticsPropertyReceiver2, "");
            SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver2, this.f18169c);
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f18169c = str;
        }
    }

    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a */
        private /* synthetic */ Function0<Unit> f18170a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ boolean f18171b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Modifier f18172c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ String f18173d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ boolean f18174e;

        /* JADX INFO: renamed from: f */
        private /* synthetic */ Arrangement.Vertical f18175f;

        /* JADX INFO: renamed from: g */
        private /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f18176g;

        /* JADX INFO: renamed from: h */
        private /* synthetic */ boolean f18177h;

        /* JADX INFO: renamed from: i */
        private /* synthetic */ Alignment.Horizontal f18178i;

        /* JADX INFO: renamed from: j */
        private /* synthetic */ boolean f18179j;

        /* JADX INFO: renamed from: k */
        private /* synthetic */ int f18180k;

        /* JADX INFO: renamed from: l */
        private /* synthetic */ int f18181l;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a.a(this.f18172c, this.f18173d, this.f18170a, this.f18174e, this.f18171b, this.f18177h, this.f18179j, this.f18178i, this.f18175f, this.f18176g, composer, RecomposeScopeImplKt.updateChangedFlags(this.f18181l | 1), this.f18180k);
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Modifier modifier, String str, Function0<Unit> function0, boolean z2, boolean z3, boolean z4, boolean z5, Alignment.Horizontal horizontal, Arrangement.Vertical vertical, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i2, int i3) {
            super(2);
            this.f18172c = modifier;
            this.f18173d = str;
            this.f18170a = function0;
            this.f18174e = z2;
            this.f18171b = z3;
            this.f18177h = z4;
            this.f18179j = z5;
            this.f18178i = horizontal;
            this.f18175f = vertical;
            this.f18176g = function3;
            this.f18181l = i2;
            this.f18180k = i3;
        }
    }
}
