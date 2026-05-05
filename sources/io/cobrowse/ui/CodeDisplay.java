package io.cobrowse.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import io.cobrowse.R;

/* JADX INFO: loaded from: classes3.dex */
public class CodeDisplay extends Fragment {
    String code = null;
    Float alpha = Float.valueOf(0.04f);

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_code_display, viewGroup, false);
        render(viewInflate);
        return viewInflate;
    }

    public void render(View view) {
        if (view == null) {
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.cobrowse_code);
        String str = this.code;
        if (str == null) {
            str = "000000";
        }
        textView.setText(String.format("%s-%s", str.substring(0, 3), str.substring(3)));
        textView.setAlpha(this.alpha.floatValue());
    }

    public void setCode(String str) {
        this.code = str;
        this.alpha = Float.valueOf(1.0f);
        render(getView());
    }
}
