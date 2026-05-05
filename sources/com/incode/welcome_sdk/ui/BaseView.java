package com.incode.welcome_sdk.ui;

import android.content.Context;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.modules.Modules;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public interface BaseView {
    void closeScreen();

    Context getContext();

    Modules getModule();

    float getScreenDensity();

    int getScreenHeight();

    ScreenName getScreenName();

    int getScreenWidth();

    void showNoNetworkMessage();

    void showNoNetworkMessage(Function0<Unit> function0);

    public static final class DefaultImpls {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f10819a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f10820c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10821d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10822e = 1;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showNoNetworkMessage$default(BaseView baseView, Function0 function0, int i2, Object obj) {
            int i3 = 2 % 2;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showNoNetworkMessage");
            }
            if ((i2 & 1) != 0) {
                int i4 = f10821d + 123;
                f10822e = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                function0 = null;
            }
            baseView.showNoNetworkMessage(function0);
            int i5 = f10822e + 33;
            f10821d = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public static int e() {
            int i2 = f10820c;
            int i3 = i2 % 7401071;
            f10820c = i2 + 1;
            if (i3 != 0) {
                return f10819a;
            }
            int i4 = (int) Runtime.getRuntime().totalMemory();
            f10819a = i4;
            return i4;
        }
    }
}
