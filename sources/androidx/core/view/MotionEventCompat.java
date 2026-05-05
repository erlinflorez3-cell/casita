package androidx.core.view;

import android.view.MotionEvent;
import androidx.annotation.ReplaceWith;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes4.dex */
public final class MotionEventCompat {

    @Deprecated
    public static final int ACTION_HOVER_ENTER = 9;

    @Deprecated
    public static final int ACTION_HOVER_EXIT = 10;

    @Deprecated
    public static final int ACTION_HOVER_MOVE = 7;

    @Deprecated
    public static final int ACTION_MASK = 255;

    @Deprecated
    public static final int ACTION_POINTER_DOWN = 5;

    @Deprecated
    public static final int ACTION_POINTER_INDEX_MASK = 65280;

    @Deprecated
    public static final int ACTION_POINTER_INDEX_SHIFT = 8;

    @Deprecated
    public static final int ACTION_POINTER_UP = 6;

    @Deprecated
    public static final int ACTION_SCROLL = 8;

    @Deprecated
    public static final int AXIS_BRAKE = 23;

    @Deprecated
    public static final int AXIS_DISTANCE = 24;

    @Deprecated
    public static final int AXIS_GAS = 22;

    @Deprecated
    public static final int AXIS_GENERIC_1 = 32;

    @Deprecated
    public static final int AXIS_GENERIC_10 = 41;

    @Deprecated
    public static final int AXIS_GENERIC_11 = 42;

    @Deprecated
    public static final int AXIS_GENERIC_12 = 43;

    @Deprecated
    public static final int AXIS_GENERIC_13 = 44;

    @Deprecated
    public static final int AXIS_GENERIC_14 = 45;

    @Deprecated
    public static final int AXIS_GENERIC_15 = 46;

    @Deprecated
    public static final int AXIS_GENERIC_16 = 47;

    @Deprecated
    public static final int AXIS_GENERIC_2 = 33;

    @Deprecated
    public static final int AXIS_GENERIC_3 = 34;

    @Deprecated
    public static final int AXIS_GENERIC_4 = 35;

    @Deprecated
    public static final int AXIS_GENERIC_5 = 36;

    @Deprecated
    public static final int AXIS_GENERIC_6 = 37;

    @Deprecated
    public static final int AXIS_GENERIC_7 = 38;

    @Deprecated
    public static final int AXIS_GENERIC_8 = 39;

    @Deprecated
    public static final int AXIS_GENERIC_9 = 40;

    @Deprecated
    public static final int AXIS_HAT_X = 15;

    @Deprecated
    public static final int AXIS_HAT_Y = 16;

    @Deprecated
    public static final int AXIS_HSCROLL = 10;

    @Deprecated
    public static final int AXIS_LTRIGGER = 17;

    @Deprecated
    public static final int AXIS_ORIENTATION = 8;

    @Deprecated
    public static final int AXIS_PRESSURE = 2;
    public static final int AXIS_RELATIVE_X = 27;
    public static final int AXIS_RELATIVE_Y = 28;

    @Deprecated
    public static final int AXIS_RTRIGGER = 18;

    @Deprecated
    public static final int AXIS_RUDDER = 20;

    @Deprecated
    public static final int AXIS_RX = 12;

    @Deprecated
    public static final int AXIS_RY = 13;

    @Deprecated
    public static final int AXIS_RZ = 14;
    public static final int AXIS_SCROLL = 26;

    @Deprecated
    public static final int AXIS_SIZE = 3;

    @Deprecated
    public static final int AXIS_THROTTLE = 19;

    @Deprecated
    public static final int AXIS_TILT = 25;

    @Deprecated
    public static final int AXIS_TOOL_MAJOR = 6;

    @Deprecated
    public static final int AXIS_TOOL_MINOR = 7;

    @Deprecated
    public static final int AXIS_TOUCH_MAJOR = 4;

    @Deprecated
    public static final int AXIS_TOUCH_MINOR = 5;

    @Deprecated
    public static final int AXIS_VSCROLL = 9;

    @Deprecated
    public static final int AXIS_WHEEL = 21;

    @Deprecated
    public static final int AXIS_X = 0;

    @Deprecated
    public static final int AXIS_Y = 1;

    @Deprecated
    public static final int AXIS_Z = 11;

    @Deprecated
    public static final int BUTTON_PRIMARY = 1;

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\t@\u001c!\u0012.dNL\u001e-*YC>\f\f\u0003gLGo[", imports = {})
    @Deprecated
    public static int getActionMasked(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\t@\u001c!\u0012.dNL\u001e-*YC>\b\u0019sa_\u000bp", imports = {})
    @Deprecated
    public static int getActionIndex(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\t@\u001c!\u0012.cRFA\u001a%YBD$\u001dXjKH@ZaMK<.\u001c\rQh\u001a", imports = {})
    @Deprecated
    public static int findPointerIndex(MotionEvent motionEvent, int i2) {
        return motionEvent.findPointerIndex(i2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\t@\u001c!\u0012.dNL-9\u001f^H51ss$WR1!eCT\u0017(\u001b\u007f\u0001-", imports = {})
    @Deprecated
    public static int getPointerId(MotionEvent motionEvent, int i2) {
        return motionEvent.getPointerId(i2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\t@\u001c!\u0012.dNL5q&_=>3\u0010\u0002EUG-+\u001a", imports = {})
    @Deprecated
    public static float getX(MotionEvent motionEvent, int i2) {
        return motionEvent.getX(i2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\t@\u001c!\u0012.dNL6q&_=>3\u0010\u0002EUG-+\u001a", imports = {})
    @Deprecated
    public static float getY(MotionEvent motionEvent, int i2) {
        return motionEvent.getY(i2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\t@\u001c!\u0012.dNL-9\u001f^H51m~qUWo[", imports = {})
    @Deprecated
    public static int getPointerCount(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\t@\u001c!\u0012.dNL09+b75fS", imports = {})
    @Deprecated
    public static int getSource(MotionEvent motionEvent) {
        return motionEvent.getSource();
    }

    public static boolean isFromSource(MotionEvent motionEvent, int i2) {
        return (-1) - (((-1) - motionEvent.getSource()) | ((-1) - i2)) == i2;
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\t@\u001c!\u0012.dNL\u001eB\u001fc*1+ t$H[1&\u001a", imports = {})
    @Deprecated
    public static float getAxisValue(MotionEvent motionEvent, int i2) {
        return motionEvent.getAxisValue(i2);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\t@\u001c!\u0012.dNL\u001eB\u001fc*1+ t$H[1&\u001d}R=#%\u000fmv:3cRQx", imports = {})
    @Deprecated
    public static float getAxisValue(MotionEvent motionEvent, int i2, int i3) {
        return motionEvent.getAxisValue(i2, i3);
    }

    @InterfaceC1492Gx
    @ReplaceWith(expression = "\t@\u001c!\u0012.dNL\u001f?*dC>\u0012\u001fppL\u000bp", imports = {})
    @Deprecated
    public static int getButtonState(MotionEvent motionEvent) {
        return motionEvent.getButtonState();
    }

    private MotionEventCompat() {
    }
}
