package com.facebook.soloader;

import com.facebook.soloader.observer.ObserverHolder;

/* JADX INFO: loaded from: classes3.dex */
public class InstrumentedSoFileLoader implements SoFileLoader {
    private final SoFileLoader mDelegate;

    public InstrumentedSoFileLoader(SoFileLoader soFileLoader) {
        this.mDelegate = soFileLoader;
    }

    @Override // com.facebook.soloader.SoFileLoader
    public void load(String str, int i2) {
        ObserverHolder.onSoFileLoaderLoadStart(this.mDelegate, "load", i2);
        try {
            this.mDelegate.load(str, i2);
            ObserverHolder.onSoFileLoaderLoadEnd(null);
        } finally {
        }
    }

    @Override // com.facebook.soloader.SoFileLoader
    public void loadBytes(String str, ElfByteChannel elfByteChannel, int i2) {
        ObserverHolder.onSoFileLoaderLoadStart(this.mDelegate, "loadBytes", i2);
        try {
            this.mDelegate.loadBytes(str, elfByteChannel, i2);
            ObserverHolder.onSoFileLoaderLoadEnd(null);
        } finally {
        }
    }
}
