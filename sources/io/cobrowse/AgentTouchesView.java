package io.cobrowse;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
final class AgentTouchesView extends FrameLayout {
    private final HashMap<String, AgentTouch> dots;

    /* JADX INFO: Access modifiers changed from: private */
    static class AgentTouch extends View {
        AgentTouch(Context context) {
            super(context);
            setAlpha(0.25f);
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            super.draw(canvas);
            int iMin = (Math.min(getWidth(), getHeight()) / 2) - 1;
            Paint paint = new Paint(1);
            paint.setColor(Color.rgb(80, 80, 80));
            paint.setStyle(Paint.Style.FILL);
            float f2 = iMin;
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, f2, paint);
            Paint paint2 = new Paint(1);
            paint2.setColor(Color.rgb(20, 20, 20));
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(3.0f);
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, f2, paint2);
        }
    }

    AgentTouchesView(Context context) {
        super(context);
        this.dots = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: centreOn, reason: merged with bridge method [inline-methods] */
    public void m8800lambda$start$0$iocobrowseAgentTouchesView(View view, PointF pointF) {
        view.setX(pointF.x - (view.getWidth() / 2));
        view.setY(pointF.y - (view.getHeight() / 2));
    }

    public void end(PointF pointF, String str) {
        AgentTouch agentTouch = this.dots.get(str);
        if (agentTouch != null) {
            removeView(agentTouch);
            this.dots.remove(str);
        }
    }

    public boolean isEmpty() {
        return this.dots.isEmpty();
    }

    public void move(PointF pointF, String str) {
        AgentTouch agentTouch = this.dots.get(str);
        if (agentTouch != null) {
            m8800lambda$start$0$iocobrowseAgentTouchesView(agentTouch, pointF);
        }
    }

    public void start(final PointF pointF, String str) {
        final AgentTouch agentTouch = new AgentTouch(getContext());
        this.dots.put(str, agentTouch);
        addView(agentTouch, 80, 80);
        agentTouch.post(new Runnable() { // from class: io.cobrowse.AgentTouchesView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8800lambda$start$0$iocobrowseAgentTouchesView(agentTouch, pointF);
            }
        });
    }
}
