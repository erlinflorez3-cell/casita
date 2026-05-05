package androidx.core.view;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public final class HapticFeedbackConstantsCompat {
    public static final int CLOCK_TICK = 4;
    public static final int CONFIRM = 16;
    public static final int CONTEXT_CLICK = 6;
    public static final int DRAG_START = 25;
    static final int FIRST_CONSTANT_INT = 0;
    public static final int FLAG_IGNORE_VIEW_SETTING = 1;
    public static final int GESTURE_END = 13;
    public static final int GESTURE_START = 12;
    public static final int GESTURE_THRESHOLD_ACTIVATE = 23;
    public static final int GESTURE_THRESHOLD_DEACTIVATE = 24;
    public static final int KEYBOARD_PRESS = 3;
    public static final int KEYBOARD_RELEASE = 7;
    public static final int KEYBOARD_TAP = 3;
    static final int LAST_CONSTANT_INT = 27;
    public static final int LONG_PRESS = 0;
    public static final int NO_HAPTICS = -1;
    public static final int REJECT = 17;
    public static final int SEGMENT_FREQUENT_TICK = 27;
    public static final int SEGMENT_TICK = 26;
    public static final int TEXT_HANDLE_MOVE = 9;
    public static final int TOGGLE_OFF = 22;
    public static final int TOGGLE_ON = 21;
    public static final int VIRTUAL_KEY = 1;
    public static final int VIRTUAL_KEY_RELEASE = 8;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HapticFeedbackFlags {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface HapticFeedbackType {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int getFeedbackConstantOrFallback(int r5) {
        /*
            r4 = -1
            if (r5 != r4) goto L4
            return r4
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            r3 = 0
            r2 = 6
            if (r1 >= r0) goto Lf
            switch(r5) {
                case 21: goto L3d;
                case 22: goto L3f;
                case 23: goto L3d;
                case 24: goto L3f;
                case 25: goto L41;
                case 26: goto L3d;
                case 27: goto L3f;
                default: goto Lf;
            }
        Lf:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 >= r0) goto L25
            r0 = 12
            if (r5 == r0) goto L3b
            r0 = 13
            if (r5 == r0) goto L39
            r0 = 16
            if (r5 == r0) goto L3b
            r0 = 17
            if (r5 == r0) goto L26
        L25:
            r3 = r5
        L26:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 27
            if (r1 >= r0) goto L37
            r0 = 7
            if (r3 == r0) goto L38
            r0 = 8
            if (r3 == r0) goto L38
            r0 = 9
            if (r3 == r0) goto L38
        L37:
            r4 = r3
        L38:
            return r4
        L39:
            r3 = r2
            goto L26
        L3b:
            r3 = 1
            goto L26
        L3d:
            r5 = r2
            goto Lf
        L3f:
            r5 = 4
            goto Lf
        L41:
            r5 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.HapticFeedbackConstantsCompat.getFeedbackConstantOrFallback(int):int");
    }

    private HapticFeedbackConstantsCompat() {
    }
}
