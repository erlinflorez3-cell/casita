package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;
import javax.annotation.Nonnull;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@ReactModule(name = "\u0012\r\u0011\u0013\u0003\u000e0 \u000e \u001b,\u0001\"\u0016&\u001c\u0014")
class SvgViewModule extends NativeSvgViewModuleSpec {
    public static final String NAME = "RNSVGSvgViewModule";

    /* JADX INFO: renamed from: com.horcrux.svg.SvgViewModule$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ int val$attempt;
        final /* synthetic */ ReadableMap val$options;
        final /* synthetic */ Callback val$successCallback;
        final /* synthetic */ int val$tag;

        AnonymousClass1(int i2, ReadableMap readableMap, Callback callback, int i3) {
            this.val$tag = i2;
            this.val$options = readableMap;
            this.val$successCallback = callback;
            this.val$attempt = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(this.val$tag);
            if (svgViewByTag == null) {
                SvgViewManager.runWhenViewIsAvailable(this.val$tag, new Runnable() { // from class: com.horcrux.svg.SvgViewModule.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        SvgView svgViewByTag2 = SvgViewManager.getSvgViewByTag(AnonymousClass1.this.val$tag);
                        if (svgViewByTag2 == null) {
                            return;
                        }
                        svgViewByTag2.setToDataUrlTask(new Runnable() { // from class: com.horcrux.svg.SvgViewModule.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                SvgViewModule.toDataURL(AnonymousClass1.this.val$tag, AnonymousClass1.this.val$options, AnonymousClass1.this.val$successCallback, AnonymousClass1.this.val$attempt + 1);
                            }
                        });
                    }
                });
                return;
            }
            if (svgViewByTag.notRendered()) {
                svgViewByTag.setToDataUrlTask(new Runnable() { // from class: com.horcrux.svg.SvgViewModule.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        SvgViewModule.toDataURL(AnonymousClass1.this.val$tag, AnonymousClass1.this.val$options, AnonymousClass1.this.val$successCallback, AnonymousClass1.this.val$attempt + 1);
                    }
                });
                return;
            }
            ReadableMap readableMap = this.val$options;
            if (readableMap != null) {
                this.val$successCallback.invoke(svgViewByTag.toDataURL(readableMap.getInt("width"), this.val$options.getInt("height")));
            } else {
                this.val$successCallback.invoke(svgViewByTag.toDataURL());
            }
        }
    }

    SvgViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toDataURL(int i2, ReadableMap readableMap, Callback callback, int i3) {
        UiThreadUtil.runOnUiThread(new AnonymousClass1(i2, readableMap, callback, i3));
    }

    @Override // com.horcrux.svg.NativeSvgViewModuleSpec, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "RNSVGSvgViewModule";
    }

    @Override // com.horcrux.svg.NativeSvgViewModuleSpec
    @ReactMethod
    public void toDataURL(Double d2, ReadableMap readableMap, Callback callback) {
        toDataURL(d2.intValue(), readableMap, callback, 0);
    }
}
