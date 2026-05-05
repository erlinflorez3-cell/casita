package com.ticnow.sdk.idnowonboarding.steps.stephandler.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ticnow.sdk.idnowonboarding.R;
import com.ticnow.sdk.idnowonboarding.model.customization.IDNowOnboardingCustomization;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1580rY;
import yg.OY;
import yg.Qg;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class ProcessStepView extends LinearLayout {
    private static int FAIL = -1;
    private static int PENDING = 0;
    private static int SELECTED = 2;
    private static int SUCCESS = 1;
    int estado;
    TextView indexTextView;
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

    public ProcessStepView(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("~\u000b\u007f\r\t\u0002{Dx\u0004\u0002\u0007v~\u0004<P{y~n\u0001{", (short) (OY.Xd() ^ 4314), (short) (OY.Xd() ^ 3102))).getMethod(hg.Vd("FCQ0C?F=", (short) (C1580rY.Xd() ^ (-13571)), (short) (C1580rY.Xd() ^ (-652))), new Class[0]);
        try {
            method.setAccessible(true);
            TypedArray typedArrayObtainStyledAttributes = ((Resources.Theme) method.invoke(context, objArr)).obtainStyledAttributes(attributeSet, R.styleable.ProcessStepView, 0, 0);
            this.estado = typedArrayObtainStyledAttributes.getInt(R.styleable.ProcessStepView_status, 0);
            this.texto = typedArrayObtainStyledAttributes.getString(R.styleable.ProcessStepView_text);
            init();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void init() {
        inflate(getContext(), R.layout.item_enrollment_step_status_dav, this);
        this.textTV = (TextView) findViewById(R.id.textTV);
        this.statusIV = (ImageView) findViewById(R.id.statusIV);
        this.indexTextView = (TextView) findViewById(R.id.stepIndex);
        this.textTV.setText(this.texto);
        this.indexTextView.setText(this.textoIndex);
        int i2 = this.estado;
        if (i2 == SUCCESS) {
            this.statusIV.setImageResource(R.drawable.ic_success_dav);
            return;
        }
        if (i2 == FAIL) {
            this.statusIV.setImageResource(R.drawable.ic_failed_dav);
        } else if (i2 == PENDING || i2 == SELECTED) {
            this.statusIV.setImageResource(R.drawable.ic_pending_dav);
        }
    }

    public void setEstado(STATUS status, IDNowOnboardingCustomization iDNowOnboardingCustomization) {
        if (status == STATUS.SUCCESS) {
            this.statusIV.setImageResource(R.drawable.ic_success_dav);
            this.textTV.setTextColor(Color.parseColor("#000000"));
            this.indexTextView.setTextColor(Color.parseColor("#000000"));
        } else if (status == STATUS.FAIL) {
            this.statusIV.setImageResource(R.drawable.ic_failed_dav);
            this.textTV.setTextColor(Color.parseColor("#000000"));
            this.indexTextView.setTextColor(Color.parseColor("#000000"));
        } else if (status == STATUS.PENDING) {
            this.statusIV.setImageResource(R.drawable.ic_pending_dav);
            this.textTV.setTextColor(Color.parseColor("#80000000"));
            this.indexTextView.setTextColor(Color.parseColor("#80000000"));
        } else {
            this.statusIV.setImageResource(R.drawable.ic_pending_dav);
            this.textTV.setTextColor(Color.parseColor("#000000"));
            this.indexTextView.setTextColor(Color.parseColor("#000000"));
        }
    }

    public void setIndex(int i2) {
        this.textoIndex = ">";
        this.indexTextView.setText(">");
    }

    public void setText(String str) {
        this.texto = str;
        this.textTV.setText(str);
    }
}
