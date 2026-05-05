package io.cobrowse;

import android.graphics.PointF;
import android.view.Display;
import io.sentry.protocol.SentryThread;
import java.text.ParseException;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class Touch extends AgentEvent {
    final String id;
    PointF position;
    final String state;
    final Date timestamp;

    private Touch(Touch touch) {
        super(touch.display);
        this.id = touch.id;
        this.state = touch.state;
        this.position = touch.position;
        this.timestamp = touch.timestamp;
    }

    Touch(Map<String, Object> map) throws SerializationError {
        super(map);
        this.id = (String) TypeUtils.checkNonNull(map.get("id"), String.class);
        this.state = (String) TypeUtils.checkNonNull(map.get(SentryThread.JsonKeys.STATE), String.class);
        this.position = new PointF(((Double) TypeUtils.checkNonNull(map.get("x"), Double.class)).floatValue(), ((Double) TypeUtils.checkNonNull(map.get("y"), Double.class)).floatValue());
        try {
            this.timestamp = UTCDate.parse((String) TypeUtils.checkNonNull(map.get("timestamp"), String.class));
        } catch (ParseException unused) {
            throw new SerializationError("Invalid date format in agent event");
        }
    }

    PointF delta(Touch touch) {
        return new PointF(this.position.x - touch.position.x, this.position.y - touch.position.y);
    }

    double distance(Touch touch) {
        PointF pointFDelta = delta(touch);
        return Math.hypot(pointFDelta.x, pointFDelta.y);
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

    Touch scaledFor(Display display) {
        Touch touch = new Touch(this);
        touch.position = DisplayScaling.scale(display, this.position);
        return touch;
    }
}
