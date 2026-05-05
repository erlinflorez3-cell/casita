package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.Ig;
import yg.OY;

/* JADX INFO: loaded from: classes.dex */
final class AppCompatReceiveContentHelper {
    private static final String LOG_TAG = "ReceiveContent";

    private AppCompatReceiveContentHelper() {
    }

    static boolean maybeHandleMenuActionViaPerformReceiveContent(TextView textView, int i2) throws Throwable {
        if (Build.VERSION.SDK_INT >= 31 || ViewCompat.getOnReceiveContentMimeTypes(textView) == null || !(i2 == 16908322 || i2 == 16908337)) {
            return false;
        }
        Context context = textView.getContext();
        Object[] objArr = {C1626yg.Ud("5oAMfcBsS", (short) (OY.Xd() ^ 13256), (short) (OY.Xd() ^ 29021))};
        Method method = Class.forName(Ig.wd("\u007f4f\u0016\n/\u0018G:sz\u001d?Dl=}:~>lQy", (short) (C1580rY.Xd() ^ (-31521)))).getMethod(C1561oA.Qd("jguSxqqahM^jm_XY", (short) (C1607wl.Xd() ^ 32505)), Class.forName(EO.Od("n\rPchsL*al\fOwlm\t", (short) (C1607wl.Xd() ^ 5934))));
        try {
            method.setAccessible(true);
            ClipboardManager clipboardManager = (ClipboardManager) method.invoke(context, objArr);
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                ViewCompat.performReceiveContent(textView, new ContentInfoCompat.Builder(primaryClip, 1).setFlags(i2 != 16908322 ? 1 : 0).build());
            }
            return true;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static boolean maybeHandleDragEventViaPerformReceiveContent(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && ViewCompat.getOnReceiveContentMimeTypes(view) != null) {
            Activity activityTryGetActivity = tryGetActivity(view);
            if (activityTryGetActivity == null) {
                String str = "Can't handle drop: no activity: view=" + view;
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? OnDropApi24Impl.onDropForTextView(dragEvent, (TextView) view, activityTryGetActivity) : OnDropApi24Impl.onDropForView(dragEvent, view, activityTryGetActivity);
            }
        }
        return false;
    }

    private static final class OnDropApi24Impl {
        private OnDropApi24Impl() {
        }

        static boolean onDropForTextView(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                ViewCompat.performReceiveContent(textView, new ContentInfoCompat.Builder(dragEvent.getClipData(), 3).build());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        static boolean onDropForView(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            ViewCompat.performReceiveContent(view, new ContentInfoCompat.Builder(dragEvent.getClipData(), 3).build());
            return true;
        }
    }

    static Activity tryGetActivity(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
