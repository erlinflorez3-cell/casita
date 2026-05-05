package io.cobrowse;

import android.app.Application;
import android.content.Intent;
import android.os.SystemClock;
import android.view.KeyCharacterMap;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import yg.CX;

/* JADX INFO: loaded from: classes3.dex */
final class ControlInjector extends SessionContextModule {
    ControlInjector(Application application, Session session) {
        super(application, session);
    }

    private void dispatchTouch(View view, MotionEvent motionEvent) {
        view.dispatchTouchEvent(motionEvent);
    }

    private void onKeyDown(View view, KeyEvent keyEvent) throws Exception {
        ArrayList<android.view.KeyEvent> arrayList;
        android.view.KeyEvent[] events;
        arrayList = new ArrayList<>();
        Application application = getApplication();
        if (keyEvent.code.equals("GoHome")) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            intent.setFlags(268435456);
            CX.ud();
            application.startActivity(intent);
        }
        if (keyEvent.key.length() == 1 && (events = KeyCharacterMap.load(-1).getEvents(keyEvent.key.toCharArray())) != null) {
            arrayList.addAll(Arrays.asList(events));
        }
        String str = keyEvent.code;
        str.hashCode();
        switch (str) {
            case "Backspace":
                arrayList = synthesizeKeypress(67);
                break;
            case "Enter":
                arrayList = synthesizeKeypress(66);
                break;
            case "ArrowRight":
                arrayList = synthesizeKeypress(22);
                break;
            case "ArrowUp":
                arrayList = synthesizeKeypress(19);
                break;
            case "ArrowDown":
                arrayList = synthesizeKeypress(20);
                break;
            case "ArrowLeft":
                arrayList = synthesizeKeypress(21);
                break;
            case "GoBack":
                arrayList = synthesizeKeypress(4);
                break;
        }
        Iterator<android.view.KeyEvent> it = arrayList.iterator();
        while (it.hasNext()) {
            view.dispatchKeyEvent(it.next());
        }
    }

    private void onTouchEnd(View view, Touch touch) {
        dispatchTouch(view, MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, touch.position.x, touch.position.y, 0));
    }

    private void onTouchMove(View view, Touch touch) {
        dispatchTouch(view, MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 2, touch.position.x, touch.position.y, 0));
    }

    private void onTouchStart(View view, Touch touch) {
        dispatchTouch(view, MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, touch.position.x, touch.position.y, 0));
    }

    private ArrayList<android.view.KeyEvent> synthesizeKeypress(int i2) {
        ArrayList<android.view.KeyEvent> arrayList = new ArrayList<>();
        arrayList.add(new android.view.KeyEvent(0, i2));
        arrayList.add(new android.view.KeyEvent(1, i2));
        return arrayList;
    }

    @Override // io.cobrowse.SessionContextModule
    void destroy() {
        ControlInjectorAccessibility.notifySessionEnded(getApplication());
    }

    void inject(View view, KeyEvent keyEvent) throws Exception {
        if (view == null) {
            ControlInjectorAccessibility.inject(getApplication(), keyEvent);
        } else if (keyEvent.isKeyDown()) {
            onKeyDown(view, keyEvent);
        }
    }

    void inject(View view, Touch touch) {
        if (view == null) {
            ControlInjectorAccessibility.inject(getApplication(), touch);
            return;
        }
        if (this.session.fullDevice().booleanValue() && CobrowseAccessibilityService.isRunning(getApplication())) {
            ControlInjectorAccessibility.inject(getApplication(), touch);
            return;
        }
        view.getLocationOnScreen(new int[2]);
        touch.position.x -= r3[0];
        touch.position.y -= r3[1];
        if (touch.isStart()) {
            onTouchStart(view, touch);
        } else if (touch.isMove()) {
            onTouchMove(view, touch);
        } else if (touch.isEnd()) {
            onTouchEnd(view, touch);
        }
    }
}
