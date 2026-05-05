package fr.antelop.sdk.card;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes5.dex */
public interface ICardDisplay {
    String getDescription();

    String getForegroundColor();

    Drawable getGraphicResource(Context context);

    String getLabel();

    String getLayoutDescription();
}
