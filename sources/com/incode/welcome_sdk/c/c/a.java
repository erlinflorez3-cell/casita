package com.incode.welcome_sdk.c.c;

import java.lang.Thread;

/* JADX INFO: loaded from: classes5.dex */
public interface a {
    void c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler);

    Thread.UncaughtExceptionHandler e();

    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f4511a = new d(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final c f4512c = new c();

        public static final class d {
            private d() {
            }

            public /* synthetic */ d(byte b2) {
                this();
            }
        }

        private c() {
        }

        @Override // com.incode.welcome_sdk.c.c.a
        public final Thread.UncaughtExceptionHandler e() {
            return Thread.getDefaultUncaughtExceptionHandler();
        }

        @Override // com.incode.welcome_sdk.c.c.a
        public final void c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
    }
}
