package io.cobrowse;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import com.braze.models.FeatureFlag;
import java.io.ByteArrayInputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class Drawing extends AgentEvent {
    float height;
    Bitmap image;
    byte[] imageData;
    PointF position;
    float width;

    Drawing(Map<String, Object> map) throws SerializationError {
        super(map);
        if (map.containsKey(FeatureFlag.PROPERTIES_TYPE_IMAGE)) {
            this.imageData = (byte[]) TypeUtils.check(map.get(FeatureFlag.PROPERTIES_TYPE_IMAGE), byte[].class);
            this.image = BitmapFactory.decodeStream(new ByteArrayInputStream(this.imageData));
        }
        Double d2 = (Double) TypeUtils.check(map.get("x"), Double.class);
        Double d3 = (Double) TypeUtils.check(map.get("y"), Double.class);
        if (d2 != null && d3 != null) {
            this.position = new PointF(d2.floatValue(), d3.floatValue());
        }
        this.height = TypeUtils.check(map.get("height"), 0.0f);
        this.width = TypeUtils.check(map.get("width"), 0.0f);
    }

    public boolean isEmpty() {
        return this.image == null || this.position == null;
    }
}
