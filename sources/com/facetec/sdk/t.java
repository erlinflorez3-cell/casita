package com.facetec.sdk;

import android.app.Fragment;
import android.widget.RelativeLayout;
import com.facetec.sdk.ce;

/* JADX INFO: loaded from: classes3.dex */
final class t extends av {
    final /* synthetic */ GuidanceCenterContentFragment Code;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(GuidanceCenterContentFragment guidanceCenterContentFragment, Fragment fragment) {
        super(fragment);
        this.Code = guidanceCenterContentFragment;
    }

    @Override // com.facetec.sdk.av
    final void B() {
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        float fCode = ba.Code();
        int iRound = Math.round(ba.Z() * ba.V());
        int iRound2 = Math.round(ce.V(ba.Code) * ba.V() * fCode);
        int iRound3 = Math.round(ce.V(5) * ba.V() * fCode);
        float f2 = this.Code.getArguments().getFloat("bottomOval");
        int i4 = iRound3 << 1;
        float f3 = i4;
        float f4 = (this.Code.getArguments().getFloat("topOval") - (iRound << 1)) - f3;
        float measuredHeight = (this.Code.f2858c.getMeasuredHeight() - f2) - f3;
        int measuredHeight2 = this.Code.C.getMeasuredHeight() - i4;
        int iFloor = (int) Math.floor(f4);
        if (f4 < measuredHeight2) {
            iFloor = measuredHeight2 + (iRound3 << 2);
            z2 = true;
        } else {
            z2 = false;
        }
        int measuredHeight3 = this.Code.F.getMeasuredHeight() - i4;
        int iFloor2 = (int) Math.floor(measuredHeight);
        if (measuredHeight < measuredHeight3) {
            iFloor2 = measuredHeight3 + (iRound3 << 2);
            z3 = true;
        } else {
            z3 = false;
        }
        int i5 = (z2 && ba.aQ()) ? iRound2 : 0;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, iFloor);
        layoutParams.setMargins(i5, 0, i5, 0);
        layoutParams.addRule(10);
        this.Code.f2856a.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, iFloor2);
        layoutParams2.setMargins(0, 0, 0, iRound3);
        layoutParams2.addRule(12);
        this.Code.f2859d.setLayoutParams(layoutParams2);
        if (z2) {
            this.Code.C.setPadding(iRound3, iRound3, iRound3, iRound3);
            this.Code.C.setBackground(this.Code.f2857b);
            this.Code.C.invalidate();
        }
        if (z3) {
            this.Code.F.setPadding(iRound3, iRound3, iRound3, iRound3);
            this.Code.F.setBackground(this.Code.f2860e);
            this.Code.F.invalidate();
        }
        if (FaceTecSDK.V.B) {
            this.Code.F.setOnClickRunnable(new Runnable() { // from class: com.facetec.sdk.t.4
                @Override // java.lang.Runnable
                public final void run() {
                    o oVar = (o) t.this.Code.getActivity();
                    if (oVar != null) {
                        oVar.l();
                    }
                }
            });
        }
        int iFloor3 = (int) Math.floor((((double) iFloor) / 2.0d) / 1.3d);
        int iFloor4 = (int) Math.floor((((double) iFloor2) / 2.0d) / 1.3d);
        int width = this.Code.f2856a.getWidth();
        int width2 = this.Code.f2859d.getWidth();
        if (z2) {
            iFloor3 = (int) Math.floor(((double) (iFloor - i4)) / 2.0d);
            i3 = width - i4;
            i2 = i3;
        } else {
            if (!ba.aQ()) {
                iRound2 = 0;
            }
            i2 = width;
            i3 = width - (iRound2 << 1);
        }
        if (z3) {
            iFloor4 = (int) Math.floor(((double) (iFloor2 - i4)) / 2.0d);
            width2 = this.Code.f2859d.getWidth() - i4;
        }
        ce.I i6 = new ce.I(i3, iFloor3);
        ce.I i7 = new ce.I(i2, iFloor3);
        ce.I i8 = new ce.I(width2, iFloor4);
        int iRound4 = Math.round(ce.Code(8));
        int iRound5 = Math.round(ce.Code(40));
        int iRound6 = Math.round(ce.Code(5));
        int iRound7 = Math.round(ce.Code(36));
        int iZ = ce.Z(this.Code.Z, i6, iRound4, iRound5);
        int iZ2 = ce.Z(this.Code.L, i7, iRound4, iRound5);
        int iZ3 = ce.Z(this.Code.S, i8, iRound6, iRound7);
        int iZ4 = ce.Z(this.Code.D, i8, iRound6, iRound7);
        int iMin = Math.min(iZ, iZ2);
        int iRound8 = (int) Math.round(((double) iMin) * 0.85d);
        if (iZ3 >= iRound8) {
            iZ3 = iRound8;
        }
        if (iZ4 >= iZ3) {
            iZ4 = iZ3;
        }
        float f5 = iMin;
        this.Code.Z.setTextSize(0, f5);
        this.Code.L.setTextSize(0, f5);
        float f6 = iZ4;
        this.Code.S.setTextSize(0, f6);
        this.Code.D.setTextSize(0, f6);
    }
}
