package com.incode.welcome_sdk.commons;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public interface b {
    Function0<Unit> closeButtonHandlerOrNull();

    Function0<Unit> getCloseScreenAction();

    Function0<Unit> getModuleQuitAttempt();

    boolean shouldShowCloseButton();

    public static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f4626c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f4627e = 1;

        public static Function0<Unit> a(b bVar) {
            int i2 = 2 % 2;
            int i3 = f4626c + 49;
            f4627e = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            if (!bVar.shouldShowCloseButton()) {
                return null;
            }
            int i5 = f4627e + 97;
            f4626c = i5 % 128;
            if (i5 % 2 == 0) {
                return bVar.getModuleQuitAttempt();
            }
            bVar.getModuleQuitAttempt();
            obj.hashCode();
            throw null;
        }
    }
}
