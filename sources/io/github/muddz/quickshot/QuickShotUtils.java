package io.github.muddz.quickshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.models.FeatureFlag;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
class QuickShotUtils {
    QuickShotUtils() {
    }

    private Bitmap generateLongBitmap(RecyclerView recyclerView) {
        int itemCount = recyclerView.getAdapter().getItemCount();
        RecyclerView.ViewHolder viewHolderCreateViewHolder = recyclerView.getAdapter().createViewHolder(recyclerView, 0);
        viewHolderCreateViewHolder.itemView.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = viewHolderCreateViewHolder.itemView.getMeasuredHeight();
        int measuredWidth = viewHolderCreateViewHolder.itemView.getMeasuredWidth();
        viewHolderCreateViewHolder.itemView.layout(0, 0, measuredWidth, measuredHeight);
        int i2 = measuredHeight * itemCount;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(recyclerView.getMeasuredWidth(), i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (recyclerView.getBackground() != null) {
            Drawable drawableMutate = recyclerView.getBackground().mutate();
            drawableMutate.setBounds(measuredWidth, i2, 0, 0);
            drawableMutate.draw(canvas);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < itemCount; i4++) {
            recyclerView.getAdapter().onBindViewHolder(viewHolderCreateViewHolder, i4);
            viewHolderCreateViewHolder.itemView.setDrawingCacheEnabled(true);
            viewHolderCreateViewHolder.itemView.buildDrawingCache();
            canvas.drawBitmap(viewHolderCreateViewHolder.itemView.getDrawingCache(), 0.0f, i3, (Paint) null);
            i3 += measuredHeight;
            viewHolderCreateViewHolder.itemView.setDrawingCacheEnabled(false);
            viewHolderCreateViewHolder.itemView.destroyDrawingCache();
        }
        return bitmapCreateBitmap;
    }

    static String getMimeType(String str) {
        String strSubstring = str.substring(1);
        if (strSubstring.equals("jpg")) {
            strSubstring = "jpeg";
        }
        return FeatureFlag.PROPERTIES_TYPE_IMAGE + File.separator + strSubstring;
    }

    static boolean isAboveAPI29() {
        return Build.VERSION.SDK_INT >= 29;
    }
}
