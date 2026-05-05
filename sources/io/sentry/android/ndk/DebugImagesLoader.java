package io.sentry.android.ndk;

import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.IDebugImagesLoader;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.DebugImage;
import io.sentry.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class DebugImagesLoader implements IDebugImagesLoader {
    private static volatile List<DebugImage> debugImages = null;
    private static final Object debugImagesLock = new Object();
    private final NativeModuleListLoader moduleListLoader;
    private final SentryOptions options;

    public DebugImagesLoader(SentryAndroidOptions sentryAndroidOptions, NativeModuleListLoader nativeModuleListLoader) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryAndroidOptions, "The SentryAndroidOptions is required.");
        this.moduleListLoader = (NativeModuleListLoader) Objects.requireNonNull(nativeModuleListLoader, "The NativeModuleListLoader is required.");
    }

    private Set<DebugImage> filterImagesByAddresses(List<DebugImage> list, Set<String> set) {
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (i2 < list.size()) {
            DebugImage debugImage = list.get(i2);
            i2++;
            DebugImage debugImage2 = i2 < list.size() ? list.get(i2) : null;
            String imageAddr = debugImage2 != null ? debugImage2.getImageAddr() : null;
            Iterator<String> it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        long j2 = Long.parseLong(it.next().replace("0x", ""), 16);
                        String imageAddr2 = debugImage.getImageAddr();
                        if (imageAddr2 != null) {
                            long j3 = Long.parseLong(imageAddr2.replace("0x", ""), 16);
                            Long imageSize = debugImage.getImageSize();
                            long jLongValue = imageSize != null ? imageSize.longValue() + j3 : imageAddr != null ? Long.parseLong(imageAddr.replace("0x", ""), 16) : Long.MAX_VALUE;
                            if (j2 >= j3 && j2 < jLongValue) {
                                hashSet.add(debugImage);
                                break;
                            }
                        } else {
                            continue;
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        return hashSet;
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    public void clearDebugImages() {
        synchronized (debugImagesLock) {
            try {
                this.moduleListLoader.clearModuleList();
                this.options.getLogger().log(SentryLevel.INFO, "Debug images cleared.", new Object[0]);
            } finally {
            }
            debugImages = null;
        }
    }

    List<DebugImage> getCachedDebugImages() {
        return debugImages;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042 A[Catch: all -> 0x0046, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:11:0x0042, B:10:0x0032, B:6:0x0007, B:8:0x000f), top: B:19:0x0003, inners: #0 }] */
    @Override // io.sentry.android.core.IDebugImagesLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<io.sentry.protocol.DebugImage> loadDebugImages() {
        /*
            r6 = this;
            java.lang.Object r5 = io.sentry.android.ndk.DebugImagesLoader.debugImagesLock
            monitor-enter(r5)
            java.util.List<io.sentry.protocol.DebugImage> r0 = io.sentry.android.ndk.DebugImagesLoader.debugImages     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L42
            io.sentry.android.ndk.NativeModuleListLoader r0 = r6.moduleListLoader     // Catch: java.lang.Throwable -> L31
            io.sentry.protocol.DebugImage[] r0 = r0.loadModuleList()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L42
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L31
            io.sentry.android.ndk.DebugImagesLoader.debugImages = r0     // Catch: java.lang.Throwable -> L31
            io.sentry.SentryOptions r0 = r6.options     // Catch: java.lang.Throwable -> L31
            io.sentry.ILogger r3 = r0.getLogger()     // Catch: java.lang.Throwable -> L31
            io.sentry.SentryLevel r2 = io.sentry.SentryLevel.DEBUG     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "Debug images loaded: %d"
            java.util.List<io.sentry.protocol.DebugImage> r0 = io.sentry.android.ndk.DebugImagesLoader.debugImages     // Catch: java.lang.Throwable -> L31
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L31
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L31
            r3.log(r2, r1, r0)     // Catch: java.lang.Throwable -> L31
            goto L42
        L31:
            r4 = move-exception
            io.sentry.SentryOptions r0 = r6.options     // Catch: java.lang.Throwable -> L46
            io.sentry.ILogger r3 = r0.getLogger()     // Catch: java.lang.Throwable -> L46
            io.sentry.SentryLevel r2 = io.sentry.SentryLevel.ERROR     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = "Failed to load debug images."
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L46
            r3.log(r2, r4, r1, r0)     // Catch: java.lang.Throwable -> L46
        L42:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L46
            java.util.List<io.sentry.protocol.DebugImage> r0 = io.sentry.android.ndk.DebugImagesLoader.debugImages
            return r0
        L46:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L46
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.ndk.DebugImagesLoader.loadDebugImages():java.util.List");
    }

    @Override // io.sentry.android.core.IDebugImagesLoader
    public Set<DebugImage> loadDebugImagesForAddresses(Set<String> set) {
        synchronized (debugImagesLock) {
            List<DebugImage> listLoadDebugImages = loadDebugImages();
            if (listLoadDebugImages == null) {
                return null;
            }
            if (set.isEmpty()) {
                return null;
            }
            Set<DebugImage> setFilterImagesByAddresses = filterImagesByAddresses(listLoadDebugImages, set);
            if (!setFilterImagesByAddresses.isEmpty()) {
                return setFilterImagesByAddresses;
            }
            this.options.getLogger().log(SentryLevel.WARNING, "No debug images found for any of the %d addresses.", Integer.valueOf(set.size()));
            return null;
        }
    }
}
