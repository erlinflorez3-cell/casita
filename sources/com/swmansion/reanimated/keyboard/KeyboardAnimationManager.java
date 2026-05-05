package com.swmansion.reanimated.keyboard;

import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class KeyboardAnimationManager {
    private final Keyboard mKeyboard;
    private final WindowsInsetsManager mWindowsInsetsManager;
    private int mNextListenerId = 0;
    private final ConcurrentHashMap<Integer, KeyboardWorkletWrapper> mListeners = new ConcurrentHashMap<>();

    public KeyboardAnimationManager(WeakReference<ReactApplicationContext> weakReference) {
        Keyboard keyboard = new Keyboard();
        this.mKeyboard = keyboard;
        this.mWindowsInsetsManager = new WindowsInsetsManager(weakReference, keyboard, new KeyboardAnimationManager$$ExternalSyntheticLambda0(this));
    }

    public void notifyAboutKeyboardChange() {
        Iterator<KeyboardWorkletWrapper> it = this.mListeners.values().iterator();
        while (it.hasNext()) {
            it.next().invoke(this.mKeyboard.getState().asInt(), this.mKeyboard.getHeight());
        }
    }

    public int subscribeForKeyboardUpdates(KeyboardWorkletWrapper keyboardWorkletWrapper, boolean z2, boolean z3) throws Throwable {
        int i2 = this.mNextListenerId;
        this.mNextListenerId = i2 + 1;
        if (this.mListeners.isEmpty()) {
            this.mWindowsInsetsManager.startObservingChanges(new KeyboardAnimationCallback(this.mKeyboard, new KeyboardAnimationManager$$ExternalSyntheticLambda0(this), z3), z2, z3);
        }
        this.mListeners.put(Integer.valueOf(i2), keyboardWorkletWrapper);
        return i2;
    }

    public void unsubscribeFromKeyboardUpdates(int i2) throws Throwable {
        this.mListeners.remove(Integer.valueOf(i2));
        if (this.mListeners.isEmpty()) {
            this.mWindowsInsetsManager.stopObservingChanges();
        }
    }
}
