package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller;

import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.AnimationType;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.BaseAnimation;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.DropAnimation;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.WormAnimation;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Orientation;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.utils.CoordinatesUtils;
import com.incode.welcome_sdk.commons.utils.w;
import com.incode.welcome_sdk.data.local.db.c.a.ae;

/* JADX INFO: loaded from: classes5.dex */
public class AnimationController {

    /* JADX INFO: renamed from: f */
    private static int f6003f = 1;

    /* JADX INFO: renamed from: h */
    private static int f6004h = 0;

    /* JADX INFO: renamed from: a */
    private Indicator f6005a;

    /* JADX INFO: renamed from: b */
    private ValueController.UpdateListener f6006b;

    /* JADX INFO: renamed from: c */
    private BaseAnimation f6007c;

    /* JADX INFO: renamed from: d */
    private ValueController f6008d;

    /* JADX INFO: renamed from: e */
    private float f6009e;

    /* JADX INFO: renamed from: j */
    private boolean f6010j;

    public static /* synthetic */ Object e(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = i3 | i6 | i4;
        int i9 = (~((~i4) | i6)) | i3;
        int i10 = ~((~i3) | i6);
        int i11 = i3 + i6 + i2 + (1132004924 * i5) + ((-2047965933) * i7);
        int i12 = i11 * i11;
        int i13 = ((1650805025 * i3) - 289800192) + ((-1513965855) * i6) + ((-565098208) * i8) + (i9 * 565098208) + (565098208 * i10) + ((-2079064064) * i2) + (1823473664 * i5) + (830210048 * i7) + ((-1143341056) * i12);
        int i14 = ((i3 * (-767560105)) - 1188649921) + (i6 * (-767559017)) + (i8 * (-544)) + (i9 * 544) + (i10 * 544) + (i2 * (-767559561)) + (i5 * 1544553956) + (i7 * (-1468578859)) + (i12 * (-2108293120));
        if (i13 + (i14 * i14 * (-2075787264)) == 1) {
            return d(objArr);
        }
        AnimationController animationController = (AnimationController) objArr[0];
        int i15 = 2 % 2;
        int i16 = f6003f + 47;
        f6004h = i16 % 128;
        int i17 = i16 % 2;
        BaseAnimation baseAnimation = animationController.f6007c;
        if (baseAnimation != null) {
            baseAnimation.a();
            int i18 = f6003f + 19;
            f6004h = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 3 / 4;
            }
        }
        return null;
    }

    public AnimationController(Indicator indicator, ValueController.UpdateListener updateListener) {
        this.f6008d = new ValueController(updateListener);
        this.f6006b = updateListener;
        this.f6005a = indicator;
    }

    public final void b(float f2) {
        int i2 = 2 % 2;
        int i3 = f6003f + 9;
        f6004h = i3 % 128;
        this.f6010j = i3 % 2 == 0;
        this.f6009e = f2;
        c();
        int i4 = f6003f + 103;
        f6004h = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void b() {
        float f2;
        int i2 = 2 % 2;
        int i3 = f6004h + 81;
        f6003f = i3 % 128;
        if (i3 % 2 == 0) {
            this.f6010j = true;
            f2 = 2.0f;
        } else {
            this.f6010j = false;
            f2 = 0.0f;
        }
        this.f6009e = f2;
        c();
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.AnimationController$5 */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a */
        private static int f6011a = 0;

        /* JADX INFO: renamed from: d */
        private static int f6012d = 1;

        /* JADX INFO: renamed from: e */
        static final /* synthetic */ int[] f6013e;

        static {
            int[] iArr = new int[AnimationType.valuesCustom().length];
            f6013e = iArr;
            try {
                iArr[AnimationType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6013e[AnimationType.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6013e[AnimationType.SCALE.ordinal()] = 3;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6013e[AnimationType.WORM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6013e[AnimationType.FILL.ordinal()] = 5;
                int i3 = f6012d + 39;
                f6011a = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 2 / 2;
                } else {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6013e[AnimationType.SLIDE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6013e[AnimationType.THIN_WORM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6013e[AnimationType.DROP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6013e[AnimationType.SWAP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6013e[AnimationType.SCALE_DOWN.ordinal()] = 10;
                int i6 = f6012d + 23;
                f6011a = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private void c() {
        int i2 = 2 % 2;
        int i3 = f6004h + 33;
        f6003f = i3 % 128;
        int i4 = i3 % 2;
        switch (AnonymousClass5.f6013e[this.f6005a.v().ordinal()]) {
            case 1:
                this.f6006b.a(null);
                break;
            case 2:
                d();
                break;
            case 3:
                a();
                break;
            case 4:
                g();
                int i5 = f6003f + 71;
                f6004h = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 87 / 0;
                }
                break;
            case 5:
                h();
                break;
            case 6:
                j();
                break;
            case 7:
                int iA = ae.AnonymousClass8.a();
                e(ae.AnonymousClass8.a(), 1961649704, iA, new Object[]{this}, ae.AnonymousClass8.a(), -1961649703, ae.AnonymousClass8.a());
                break;
            case 8:
                f();
                break;
            case 9:
                k();
                break;
            case 10:
                l();
                break;
        }
    }

    private void d() {
        int i2 = 2 % 2;
        int i3 = f6004h + 83;
        f6003f = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f6005a};
        int iIntValue = ((Integer) Indicator.d(1903576326, w.c(), w.c(), objArr, -1903576323, w.c(), w.c())).intValue();
        int iN = this.f6005a.n();
        BaseAnimation baseAnimationA = this.f6008d.d().c(iN, iIntValue).a(this.f6005a.t());
        if (!this.f6010j) {
            baseAnimationA.c();
        } else {
            int i5 = f6004h + 33;
            f6003f = i5 % 128;
            if (i5 % 2 == 0) {
                baseAnimationA.b(this.f6009e);
                int i6 = 63 / 0;
            } else {
                baseAnimationA.b(this.f6009e);
            }
        }
        this.f6007c = baseAnimationA;
    }

    private void a() {
        int i2 = 2 % 2;
        int i3 = f6004h + 3;
        f6003f = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f6005a};
        int iIntValue = ((Integer) Indicator.d(1903576326, w.c(), w.c(), objArr, -1903576323, w.c(), w.c())).intValue();
        int iN = this.f6005a.n();
        Object[] objArr2 = {this.f6005a};
        int iIntValue2 = ((Integer) Indicator.d(1089547635, w.c(), w.c(), objArr2, -1089547635, w.c(), w.c())).intValue();
        float fG = this.f6005a.g();
        BaseAnimation baseAnimationA = this.f6008d.b().d(iN, iIntValue, iIntValue2, fG).a(this.f6005a.t());
        if (!this.f6010j) {
            baseAnimationA.c();
        } else {
            int i5 = f6003f + 1;
            f6004h = i5 % 128;
            if (i5 % 2 != 0) {
                baseAnimationA.b(this.f6009e);
                int i6 = 37 / 0;
            } else {
                baseAnimationA.b(this.f6009e);
            }
        }
        this.f6007c = baseAnimationA;
    }

    private void g() {
        int iU;
        int i2 = 2 % 2;
        Object obj = null;
        if (this.f6005a.l()) {
            int i3 = f6003f + 47;
            f6004h = i3 % 128;
            if (i3 % 2 != 0) {
                this.f6005a.q();
                obj.hashCode();
                throw null;
            }
            iU = this.f6005a.q();
        } else {
            iU = this.f6005a.u();
        }
        int iX = this.f6005a.l() ? this.f6005a.x() : this.f6005a.q();
        int iB = CoordinatesUtils.b(this.f6005a, iU);
        int iB2 = CoordinatesUtils.b(this.f6005a, iX);
        boolean z2 = iX > iU;
        WormAnimation wormAnimationB = this.f6008d.c().c(iB, iB2, ((Integer) Indicator.d(1089547635, w.c(), w.c(), new Object[]{this.f6005a}, -1089547635, w.c(), w.c())).intValue(), z2).b(this.f6005a.t());
        if (this.f6010j) {
            int i4 = f6004h + 109;
            f6003f = i4 % 128;
            if (i4 % 2 == 0) {
                wormAnimationB.b(this.f6009e);
                obj.hashCode();
                throw null;
            }
            wormAnimationB.b(this.f6009e);
        } else {
            wormAnimationB.c();
        }
        this.f6007c = wormAnimationB;
    }

    private void j() {
        int iU;
        int i2 = 2 % 2;
        if (!this.f6005a.l()) {
            iU = this.f6005a.u();
        } else {
            iU = this.f6005a.q();
            int i3 = f6003f + 87;
            f6004h = i3 % 128;
            int i4 = i3 % 2;
        }
        BaseAnimation baseAnimationA = this.f6008d.a().a(CoordinatesUtils.b(this.f6005a, iU), CoordinatesUtils.b(this.f6005a, this.f6005a.l() ? this.f6005a.x() : this.f6005a.q())).a(this.f6005a.t());
        if (!this.f6010j) {
            baseAnimationA.c();
        } else {
            int i5 = f6004h + 123;
            f6003f = i5 % 128;
            if (i5 % 2 != 0) {
                baseAnimationA.b(this.f6009e);
            } else {
                baseAnimationA.b(this.f6009e);
                throw null;
            }
        }
        this.f6007c = baseAnimationA;
    }

    private void h() {
        int i2 = 2 % 2;
        int i3 = f6004h + 37;
        f6003f = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f6005a};
        int iIntValue = ((Integer) Indicator.d(1903576326, w.c(), w.c(), objArr, -1903576323, w.c(), w.c())).intValue();
        int iN = this.f6005a.n();
        Object[] objArr2 = {this.f6005a};
        int iIntValue2 = ((Integer) Indicator.d(1089547635, w.c(), w.c(), objArr2, -1089547635, w.c(), w.c())).intValue();
        int iJ = this.f6005a.j();
        BaseAnimation baseAnimationA = this.f6008d.e().b(iN, iIntValue, iIntValue2, iJ).a(this.f6005a.t());
        if (this.f6010j) {
            baseAnimationA.b(this.f6009e);
        } else {
            baseAnimationA.c();
            int i5 = f6004h + 5;
            f6003f = i5 % 128;
            int i6 = i5 % 2;
        }
        this.f6007c = baseAnimationA;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        boolean z2 = false;
        AnimationController animationController = (AnimationController) objArr[0];
        int i2 = 2 % 2;
        int i3 = f6003f + 75;
        f6004h = i3 % 128;
        int i4 = i3 % 2;
        int iQ = animationController.f6005a.l() ? animationController.f6005a.q() : animationController.f6005a.u();
        int iX = animationController.f6005a.l() ? animationController.f6005a.x() : animationController.f6005a.q();
        int iB = CoordinatesUtils.b(animationController.f6005a, iQ);
        int iB2 = CoordinatesUtils.b(animationController.f6005a, iX);
        if (iX > iQ) {
            int i5 = f6004h + 5;
            f6003f = i5 % 128;
            if (i5 % 2 != 0) {
                z2 = true;
            }
        }
        WormAnimation wormAnimationB = animationController.f6008d.f().c(iB, iB2, ((Integer) Indicator.d(1089547635, w.c(), w.c(), new Object[]{animationController.f6005a}, -1089547635, w.c(), w.c())).intValue(), z2).b(animationController.f6005a.t());
        Object obj = null;
        if (!(!animationController.f6010j)) {
            int i6 = f6003f + 49;
            f6004h = i6 % 128;
            if (i6 % 2 != 0) {
                wormAnimationB.b(animationController.f6009e);
                obj.hashCode();
                throw null;
            }
            wormAnimationB.b(animationController.f6009e);
        } else {
            wormAnimationB.c();
        }
        animationController.f6007c = wormAnimationB;
        return null;
    }

    private void f() {
        int iQ;
        int i2 = 2 % 2;
        int i3 = f6003f + 31;
        f6004h = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f6005a.l();
            obj.hashCode();
            throw null;
        }
        if (!this.f6005a.l()) {
            iQ = this.f6005a.u();
            int i4 = f6003f + 55;
            f6004h = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = f6003f + 101;
            f6004h = i6 % 128;
            if (i6 % 2 != 0) {
                this.f6005a.q();
                throw null;
            }
            iQ = this.f6005a.q();
        }
        int iX = this.f6005a.l() ? this.f6005a.x() : this.f6005a.q();
        int iB = CoordinatesUtils.b(this.f6005a, iQ);
        int iB2 = CoordinatesUtils.b(this.f6005a, iX);
        int iIntValue = ((Integer) Indicator.d(-1188935359, w.c(), w.c(), new Object[]{this.f6005a}, 1188935361, w.c(), w.c())).intValue();
        int iD = this.f6005a.d();
        if (this.f6005a.w() != Orientation.HORIZONTAL) {
            iIntValue = iD;
        }
        int iIntValue2 = ((Integer) Indicator.d(1089547635, w.c(), w.c(), new Object[]{this.f6005a}, -1089547635, w.c(), w.c())).intValue();
        DropAnimation dropAnimationD = this.f6008d.j().d(this.f6005a.t()).d(iB, iB2, (iIntValue2 * 3) + iIntValue, iIntValue2 + iIntValue, iIntValue2);
        if (this.f6010j) {
            int i7 = f6004h + 95;
            f6003f = i7 % 128;
            if (i7 % 2 == 0) {
                dropAnimationD.b(this.f6009e);
                obj.hashCode();
                throw null;
            }
            dropAnimationD.b(this.f6009e);
        } else {
            dropAnimationD.c();
        }
        this.f6007c = dropAnimationD;
        int i8 = f6004h + 85;
        f6003f = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 43 / 0;
        }
    }

    private void k() {
        int iU;
        int iQ;
        int i2 = 2 % 2;
        if (this.f6005a.l()) {
            int i3 = f6004h + 49;
            f6003f = i3 % 128;
            if (i3 % 2 == 0) {
                iU = this.f6005a.q();
                int i4 = 60 / 0;
            } else {
                iU = this.f6005a.q();
            }
        } else {
            iU = this.f6005a.u();
        }
        if (this.f6005a.l()) {
            int i5 = f6003f + 77;
            f6004h = i5 % 128;
            if (i5 % 2 != 0) {
                iQ = this.f6005a.x();
                int i6 = 19 / 0;
            } else {
                iQ = this.f6005a.x();
            }
        } else {
            iQ = this.f6005a.q();
        }
        int iB = CoordinatesUtils.b(this.f6005a, iU);
        int iB2 = CoordinatesUtils.b(this.f6005a, iQ);
        BaseAnimation baseAnimationA = this.f6008d.g().c(iB, iB2).a(this.f6005a.t());
        if (this.f6010j) {
            int i7 = f6003f + 65;
            f6004h = i7 % 128;
            int i8 = i7 % 2;
            baseAnimationA.b(this.f6009e);
        } else {
            baseAnimationA.c();
        }
        this.f6007c = baseAnimationA;
    }

    private void l() {
        int i2 = 2 % 2;
        int i3 = f6004h + 79;
        f6003f = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f6005a};
        int iIntValue = ((Integer) Indicator.d(1903576326, w.c(), w.c(), objArr, -1903576323, w.c(), w.c())).intValue();
        int iN = this.f6005a.n();
        Object[] objArr2 = {this.f6005a};
        int iIntValue2 = ((Integer) Indicator.d(1089547635, w.c(), w.c(), objArr2, -1089547635, w.c(), w.c())).intValue();
        float fG = this.f6005a.g();
        BaseAnimation baseAnimationA = this.f6008d.h().d(iN, iIntValue, iIntValue2, fG).a(this.f6005a.t());
        if (!this.f6010j) {
            baseAnimationA.c();
        } else {
            int i5 = f6004h + 69;
            f6003f = i5 % 128;
            if (i5 % 2 != 0) {
                baseAnimationA.b(this.f6009e);
            } else {
                baseAnimationA.b(this.f6009e);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        this.f6007c = baseAnimationA;
        int i6 = f6003f + 121;
        f6004h = i6 % 128;
        int i7 = i6 % 2;
    }

    private void i() {
        int iA = ae.AnonymousClass8.a();
        e(ae.AnonymousClass8.a(), 1961649704, iA, new Object[]{this}, ae.AnonymousClass8.a(), -1961649703, ae.AnonymousClass8.a());
    }

    public final void e() {
        int iA = ae.AnonymousClass8.a();
        e(ae.AnonymousClass8.a(), 957113915, iA, new Object[]{this}, ae.AnonymousClass8.a(), -957113915, ae.AnonymousClass8.a());
    }
}
