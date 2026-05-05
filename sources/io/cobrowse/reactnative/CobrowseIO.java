package io.cobrowse.reactnative;

import android.app.Activity;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CobrowseIO {

    public interface Delegate {
    }

    public interface RedactionDelegate extends Delegate {
        List<View> redactedViews(Activity activity);

        List<View> unredactedViews(Activity activity);
    }
}
