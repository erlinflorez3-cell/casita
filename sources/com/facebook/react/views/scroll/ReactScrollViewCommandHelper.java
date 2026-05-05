package com.facebook.react.views.scroll;

import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.PixelUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ReactScrollViewCommandHelper {
    public static final int COMMAND_FLASH_SCROLL_INDICATORS = 3;
    public static final int COMMAND_SCROLL_TO = 1;
    public static final int COMMAND_SCROLL_TO_END = 2;

    public interface ScrollCommandHandler<T> {
        void flashScrollIndicators(T t2);

        void scrollTo(T t2, ScrollToCommandData scrollToCommandData);

        void scrollToEnd(T t2, ScrollToEndCommandData scrollToEndCommandData);
    }

    public static class ScrollToCommandData {
        public final boolean mAnimated;
        public final int mDestX;
        public final int mDestY;

        ScrollToCommandData(int i2, int i3, boolean z2) {
            this.mDestX = i2;
            this.mDestY = i3;
            this.mAnimated = z2;
        }
    }

    public static class ScrollToEndCommandData {
        public final boolean mAnimated;

        ScrollToEndCommandData(boolean z2) {
            this.mAnimated = z2;
        }
    }

    public static Map<String, Integer> getCommandsMap() {
        return MapBuilder.of("scrollTo", 1, "scrollToEnd", 2, "flashScrollIndicators", 3);
    }

    public static <T> void receiveCommand(ScrollCommandHandler<T> scrollCommandHandler, T t2, int i2, ReadableArray readableArray) {
        Assertions.assertNotNull(scrollCommandHandler);
        Assertions.assertNotNull(t2);
        if (i2 == 1) {
            scrollTo(scrollCommandHandler, t2, (ReadableArray) Assertions.assertNotNull(readableArray));
        } else if (i2 == 2) {
            scrollToEnd(scrollCommandHandler, t2, (ReadableArray) Assertions.assertNotNull(readableArray));
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i2), scrollCommandHandler.getClass().getSimpleName()));
            }
            scrollCommandHandler.flashScrollIndicators(t2);
        }
    }

    public static <T> void receiveCommand(ScrollCommandHandler<T> scrollCommandHandler, T t2, String str, ReadableArray readableArray) {
        Assertions.assertNotNull(scrollCommandHandler);
        Assertions.assertNotNull(t2);
        str.hashCode();
        switch (str) {
            case "scrollTo":
                scrollTo(scrollCommandHandler, t2, (ReadableArray) Assertions.assertNotNull(readableArray));
                return;
            case "flashScrollIndicators":
                scrollCommandHandler.flashScrollIndicators(t2);
                return;
            case "scrollToEnd":
                scrollToEnd(scrollCommandHandler, t2, (ReadableArray) Assertions.assertNotNull(readableArray));
                return;
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %s received by %s.", str, scrollCommandHandler.getClass().getSimpleName()));
        }
    }

    private static <T> void scrollTo(ScrollCommandHandler<T> scrollCommandHandler, T t2, ReadableArray readableArray) {
        scrollCommandHandler.scrollTo(t2, new ScrollToCommandData(Math.round(PixelUtil.toPixelFromDIP(readableArray.getDouble(0))), Math.round(PixelUtil.toPixelFromDIP(readableArray.getDouble(1))), readableArray.getBoolean(2)));
    }

    private static <T> void scrollToEnd(ScrollCommandHandler<T> scrollCommandHandler, T t2, ReadableArray readableArray) {
        scrollCommandHandler.scrollToEnd(t2, new ScrollToEndCommandData(readableArray.getBoolean(0)));
    }
}
