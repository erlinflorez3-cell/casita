package androidx.core.provider;

import android.graphics.Typeface;
import androidx.core.provider.FontRequestWorker;
import androidx.core.provider.FontsContractCompat;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
class CallbackWrapper {
    private final FontsContractCompat.FontRequestCallback mCallback;
    private final Executor mExecutor;

    CallbackWrapper(FontsContractCompat.FontRequestCallback fontRequestCallback, Executor executor) {
        this.mCallback = fontRequestCallback;
        this.mExecutor = executor;
    }

    CallbackWrapper(FontsContractCompat.FontRequestCallback fontRequestCallback) {
        this(fontRequestCallback, RequestExecutor.createHandlerExecutor(CalleeHandler.create()));
    }

    /* JADX INFO: renamed from: androidx.core.provider.CallbackWrapper$1 */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ FontsContractCompat.FontRequestCallback val$callback;
        final /* synthetic */ Typeface val$typeface;

        AnonymousClass1(FontsContractCompat.FontRequestCallback fontRequestCallback, Typeface typeface) {
            fontRequestCallback = fontRequestCallback;
            typeface = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            fontRequestCallback.onTypefaceRetrieved(typeface);
        }
    }

    private void onTypefaceRetrieved(Typeface typeface) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.core.provider.CallbackWrapper.1
            final /* synthetic */ FontsContractCompat.FontRequestCallback val$callback;
            final /* synthetic */ Typeface val$typeface;

            AnonymousClass1(FontsContractCompat.FontRequestCallback fontRequestCallback, Typeface typeface2) {
                fontRequestCallback = fontRequestCallback;
                typeface = typeface2;
            }

            @Override // java.lang.Runnable
            public void run() {
                fontRequestCallback.onTypefaceRetrieved(typeface);
            }
        });
    }

    /* JADX INFO: renamed from: androidx.core.provider.CallbackWrapper$2 */
    class AnonymousClass2 implements Runnable {
        final /* synthetic */ FontsContractCompat.FontRequestCallback val$callback;
        final /* synthetic */ int val$reason;

        AnonymousClass2(FontsContractCompat.FontRequestCallback fontRequestCallback, int i2) {
            fontRequestCallback = fontRequestCallback;
            i = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            fontRequestCallback.onTypefaceRequestFailed(i);
        }
    }

    private void onTypefaceRequestFailed(int i2) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.core.provider.CallbackWrapper.2
            final /* synthetic */ FontsContractCompat.FontRequestCallback val$callback;
            final /* synthetic */ int val$reason;

            AnonymousClass2(FontsContractCompat.FontRequestCallback fontRequestCallback, int i22) {
                fontRequestCallback = fontRequestCallback;
                i = i22;
            }

            @Override // java.lang.Runnable
            public void run() {
                fontRequestCallback.onTypefaceRequestFailed(i);
            }
        });
    }

    void onTypefaceResult(FontRequestWorker.TypefaceResult typefaceResult) {
        if (typefaceResult.isSuccess()) {
            onTypefaceRetrieved(typefaceResult.mTypeface);
        } else {
            onTypefaceRequestFailed(typefaceResult.mResult);
        }
    }
}
