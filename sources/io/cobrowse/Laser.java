package io.cobrowse;

import android.graphics.PointF;
import io.sentry.protocol.SentryThread;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class Laser extends AgentEvent {
    final PointF position;
    final String state;

    Laser(Map<String, Object> map) throws SerializationError {
        super(map);
        this.state = (String) TypeUtils.checkNonNull(map.get(SentryThread.JsonKeys.STATE), String.class);
        Double d2 = (Double) TypeUtils.check(map.get("x"), Double.class, null);
        Double d3 = (Double) TypeUtils.check(map.get("y"), Double.class, null);
        if (d2 == null || d3 == null) {
            this.position = null;
        } else {
            this.position = new PointF(d2.floatValue(), d3.floatValue());
        }
    }

    public boolean isEnd() {
        return this.state.equalsIgnoreCase("touchend");
    }

    public boolean isMove() {
        return this.state.equalsIgnoreCase("touchmove");
    }

    public boolean isStart() {
        return this.state.equalsIgnoreCase("touchstart");
    }
}
