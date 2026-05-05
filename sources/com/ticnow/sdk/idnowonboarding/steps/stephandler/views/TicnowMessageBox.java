package com.ticnow.sdk.idnowonboarding.steps.stephandler.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ticnow.sdk.idnowonboarding.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.Xg;

/* JADX INFO: loaded from: classes5.dex */
public class TicnowMessageBox extends LinearLayout {
    TextView textCardTV;
    String texto;

    public TicnowMessageBox(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("n|s\u0003\u0001{wBx\u0006\u0006\r~\t\u0010J`\u000e\u000e\u0015\u0007\u001b\u0018", (short) (C1499aX.Xd() ^ (-22864)))).getMethod(Xg.qd("\u0015\u0014$\u0005\u001a\u0018!\u001a", (short) (C1580rY.Xd() ^ (-9834)), (short) (C1580rY.Xd() ^ (-2542))), new Class[0]);
        try {
            method.setAccessible(true);
            this.texto = ((Resources.Theme) method.invoke(context, objArr)).obtainStyledAttributes(attributeSet, R.styleable.TicnowMessageBox, 0, 0).getString(R.styleable.TicnowMessageBox_message);
            init();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void init() {
        inflate(getContext(), R.layout.text_card_layout, this);
        TextView textView = (TextView) findViewById(R.id.textCardTV);
        this.textCardTV = textView;
        textView.setText(this.texto);
    }

    public void setText(String str) {
        this.texto = str;
        this.textCardTV.setText(str);
    }
}
