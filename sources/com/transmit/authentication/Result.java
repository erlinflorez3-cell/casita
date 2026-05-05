package com.transmit.authentication;

import com.dynatrace.android.agent.Global;

/* JADX INFO: loaded from: classes5.dex */
public class Result<T> {

    public static final class Error extends Result {
        private String mErrorCode;
        private String mErrorMsg;
        private Exception mException;

        public Error(Exception exc) {
            super();
            this.mException = exc;
        }

        public Error(String str) {
            super();
            this.mErrorMsg = str;
        }

        public Error(String str, String str2) {
            super();
            this.mErrorCode = str;
            this.mErrorMsg = str2;
        }

        @Override // com.transmit.authentication.Result
        public String toString() {
            String str = this.mErrorCode != null ? this.mErrorCode + Global.BLANK : "";
            if (this.mErrorMsg != null) {
                str = str + this.mErrorMsg + Global.BLANK;
            }
            return this.mException != null ? str + "[exception=" + this.mException.toString() + "]" : str;
        }
    }

    public static final class Success<T> extends Result {
        private T data;

        public Success(T t2) {
            super();
            this.data = t2;
        }

        public T getData() {
            return this.data;
        }
    }

    private Result() {
    }

    public String toString() {
        return this instanceof Success ? "Success[data=" + ((Success) this).getData().toString() + "]" : this instanceof Error ? ((Error) this).toString() : "";
    }
}
