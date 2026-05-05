package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.ReplaceWith;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ListViewCompat {
    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u00103*'sib`\u0006P-(_@<\u000b\u0014\u0003p)\\o,\u001a", imports = {})
    @Deprecated
    public static void scrollListBy(ListView listView, int i2) {
        listView.scrollListBy(i2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\u00103*'sib`\u0006@+$C7B.\u0017{HPV<ZUGT3\u001d+\u0004wr\u001a", imports = {})
    @Deprecated
    public static boolean canScrollList(ListView listView, int i2) {
        return listView.canScrollList(i2);
    }

    private ListViewCompat() {
    }
}
