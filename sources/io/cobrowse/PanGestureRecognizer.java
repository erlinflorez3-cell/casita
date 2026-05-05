package io.cobrowse;

import android.graphics.PointF;
import io.cobrowse.GestureRecognizer;

/* JADX INFO: loaded from: classes3.dex */
class PanGestureRecognizer extends GestureRecognizer {
    private Touch began;
    private Touch ended;

    enum Direction {
        Up,
        Down,
        Left,
        Right,
        Invalid
    }

    PanGestureRecognizer() {
    }

    Direction getDirection() {
        Touch touch;
        Touch touch2 = this.ended;
        if (touch2 == null || (touch = this.began) == null) {
            return Direction.Invalid;
        }
        PointF pointFDelta = touch2.delta(touch);
        return Math.abs(pointFDelta.x) > Math.abs(pointFDelta.y) ? pointFDelta.x < 0.0f ? Direction.Left : Direction.Right : pointFDelta.y < 0.0f ? Direction.Up : Direction.Down;
    }

    @Override // io.cobrowse.GestureRecognizer
    void onTouchBegan(Touch touch) {
        this.began = touch;
        setState(GestureRecognizer.GestureState.Started);
    }

    @Override // io.cobrowse.GestureRecognizer
    void onTouchEnded(Touch touch) {
        Touch touch2 = this.began;
        if (touch2 == null) {
            this.ended = null;
            setState(GestureRecognizer.GestureState.Failed);
            return;
        }
        this.ended = touch;
        if (touch2.distance(touch) > 20.0d) {
            setState(GestureRecognizer.GestureState.Recognized);
        } else {
            setState(GestureRecognizer.GestureState.Failed);
        }
    }

    @Override // io.cobrowse.GestureRecognizer
    void onTouchMoved(Touch touch) {
    }

    @Override // io.cobrowse.GestureRecognizer
    void reset() {
        this.began = null;
        this.ended = null;
        super.reset();
    }
}
