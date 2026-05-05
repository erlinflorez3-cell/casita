package io.cobrowse;

/* JADX INFO: loaded from: classes3.dex */
abstract class GestureRecognizer {
    private GestureState state = GestureState.Possible;

    public enum GestureState {
        Possible,
        Started,
        Changed,
        Recognized,
        Failed
    }

    GestureRecognizer() {
    }

    abstract void onTouchBegan(Touch touch);

    abstract void onTouchEnded(Touch touch);

    void onTouchEvent(Touch touch) {
        if (touch.isStart()) {
            onTouchBegan(touch);
        } else if (touch.isMove()) {
            onTouchMoved(touch);
        } else if (touch.isEnd()) {
            onTouchEnded(touch);
        }
    }

    abstract void onTouchMoved(Touch touch);

    void reset() {
        this.state = GestureState.Possible;
    }

    void setState(GestureState gestureState) {
        if (this.state == GestureState.Failed) {
            return;
        }
        if (gestureState != GestureState.Started || this.state == GestureState.Possible) {
            if (gestureState != GestureState.Changed || this.state == GestureState.Started || this.state == GestureState.Changed) {
                this.state = gestureState;
            }
        }
    }

    GestureState state() {
        return this.state;
    }
}
