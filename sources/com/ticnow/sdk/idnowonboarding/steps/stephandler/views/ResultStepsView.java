package com.ticnow.sdk.idnowonboarding.steps.stephandler.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ticnow.sdk.idnowonboarding.R;
import com.ticnow.sdk.idnowonboarding.model.customization.IDNowOnboardingCustomization;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;

/* JADX INFO: loaded from: classes5.dex */
public class ResultStepsView extends LinearLayout {
    private static int FAIL = -1;
    private static int PENDING = 0;
    private static int SELECTED = 2;
    private static int SUCCESS = 1;
    int estado;
    TextView indexTextView;
    TextView score;
    String scoreIdex;
    ImageView statusIV;
    TextView textTV;
    String texto;
    String textoIndex;

    public enum STATUS {
        FAIL,
        SUCCESS,
        PENDING,
        SELECTED
    }

    public ResultStepsView(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("%1&3/(\"j\u001f*(-\u001d%*bv\" %\u0015'\"", (short) (C1499aX.Xd() ^ (-8638)))).getMethod(C1561oA.yd("FEU6KIRK", (short) (C1580rY.Xd() ^ (-21199))), new Class[0]);
        try {
            method.setAccessible(true);
            TypedArray typedArrayObtainStyledAttributes = ((Resources.Theme) method.invoke(context, objArr)).obtainStyledAttributes(attributeSet, R.styleable.ResultStepsView, 0, 0);
            this.estado = typedArrayObtainStyledAttributes.getInt(R.styleable.ResultStepsView_statusf, 0);
            this.texto = typedArrayObtainStyledAttributes.getString(R.styleable.ResultStepsView_textf);
            init();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void init() {
        inflate(getContext(), R.layout.item_enrollment_step_result, this);
        this.textTV = (TextView) findViewById(R.id.textTV);
        this.statusIV = (ImageView) findViewById(R.id.statusIV);
        this.indexTextView = (TextView) findViewById(R.id.stepIndex);
        this.score = (TextView) findViewById(R.id.score);
        this.textTV.setText(this.texto);
        this.indexTextView.setText(this.textoIndex);
        this.score.setText(this.scoreIdex);
        int i2 = this.estado;
        if (i2 == SUCCESS) {
            this.statusIV.setImageResource(R.drawable.idnow_success);
            return;
        }
        if (i2 == FAIL) {
            this.statusIV.setImageResource(R.drawable.idnow_error);
        } else if (i2 == PENDING || i2 == SELECTED) {
            this.statusIV.setImageResource(R.drawable.idnow_isotipe);
        }
    }

    public void setEstado(STATUS status, IDNowOnboardingCustomization iDNowOnboardingCustomization) {
        if (status == STATUS.SUCCESS) {
            this.statusIV.setImageResource(R.drawable.idnow_success);
            this.statusIV.setColorFilter(Color.parseColor(iDNowOnboardingCustomization.idNowSuccessStepTintColor), PorterDuff.Mode.SRC_ATOP);
            this.score.setTextColor(Color.parseColor(iDNowOnboardingCustomization.idNowSuccessStepTintColor));
            this.textTV.setTextColor(Color.parseColor("#8F8F8F"));
            this.indexTextView.setTextColor(Color.parseColor("#8F8F8F"));
            return;
        }
        if (status == STATUS.FAIL) {
            this.statusIV.setImageResource(R.drawable.idnow_error);
            this.statusIV.setColorFilter(Color.parseColor(iDNowOnboardingCustomization.idNowFailStepTintColor), PorterDuff.Mode.SRC_ATOP);
            this.score.setTextColor(Color.parseColor(iDNowOnboardingCustomization.idNowFailStepTintColor));
            this.textTV.setTextColor(Color.parseColor(iDNowOnboardingCustomization.idNowFailStepTintColor));
            this.indexTextView.setTextColor(Color.parseColor(iDNowOnboardingCustomization.idNowFailStepTintColor));
            return;
        }
        if (status == STATUS.PENDING) {
            this.statusIV.setImageResource(R.drawable.idnow_isotipe);
            this.statusIV.setColorFilter(Color.parseColor(iDNowOnboardingCustomization.idNowPendingStepTintColor), PorterDuff.Mode.SRC_ATOP);
            this.score.setTextColor(Color.parseColor(iDNowOnboardingCustomization.idNowPendingStepTintColor));
            this.textTV.setTextColor(Color.parseColor("#8F8F8F"));
            this.indexTextView.setTextColor(Color.parseColor(iDNowOnboardingCustomization.idNowPendingStepTintColor));
            return;
        }
        this.statusIV.setImageResource(R.drawable.idnow_isotipe);
        this.statusIV.setColorFilter(Color.parseColor(iDNowOnboardingCustomization.idNowSelectedStepTintColor), PorterDuff.Mode.SRC_ATOP);
        this.score.setTextColor(Color.parseColor(iDNowOnboardingCustomization.idNowSelectedStepTintColor));
        this.textTV.setTextColor(Color.parseColor(iDNowOnboardingCustomization.idNowSelectedStepTintColor));
        this.indexTextView.setTextColor(Color.parseColor(iDNowOnboardingCustomization.idNowSelectedStepTintColor));
    }

    public void setIndex(int i2) {
        String str = "Paso " + i2;
        this.textoIndex = str;
        this.indexTextView.setText(str);
    }

    public void setIndexScore() {
        this.textoIndex = "SCORE";
        this.indexTextView.setText("SCORE");
    }

    public void setScore(float f2) {
        String string = Integer.toString((int) f2);
        this.scoreIdex = string;
        this.score.setText(string);
    }

    public void setText(String str) {
        this.texto = str;
        this.textTV.setText(str);
    }
}
