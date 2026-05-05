package io.sentry.transport;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TransportResult {

    private static final class ErrorTransportResult extends TransportResult {
        private final int responseCode;

        ErrorTransportResult(int i2) {
            super();
            this.responseCode = i2;
        }

        @Override // io.sentry.transport.TransportResult
        public int getResponseCode() {
            return this.responseCode;
        }

        @Override // io.sentry.transport.TransportResult
        public boolean isSuccess() {
            return false;
        }
    }

    private static final class SuccessTransportResult extends TransportResult {
        static final SuccessTransportResult INSTANCE = new SuccessTransportResult();

        private SuccessTransportResult() {
            super();
        }

        @Override // io.sentry.transport.TransportResult
        public int getResponseCode() {
            return -1;
        }

        @Override // io.sentry.transport.TransportResult
        public boolean isSuccess() {
            return true;
        }
    }

    private TransportResult() {
    }

    public static TransportResult error() {
        return error(-1);
    }

    public static TransportResult error(int i2) {
        return new ErrorTransportResult(i2);
    }

    public static TransportResult success() {
        return SuccessTransportResult.INSTANCE;
    }

    public abstract int getResponseCode();

    public abstract boolean isSuccess();
}
