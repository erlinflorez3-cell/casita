package com.RNFetchBlob.Response;

import com.RNFetchBlob.RNFetchBlobConst;
import com.RNFetchBlob.RNFetchBlobProgressConfig;
import com.RNFetchBlob.RNFetchBlobReq;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.IOException;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes4.dex */
public class RNFetchBlobDefaultResp extends ResponseBody {
    boolean isIncrement;
    String mTaskId;
    ResponseBody originalBody;
    ReactApplicationContext rctContext;

    private class ProgressReportingSource implements Source {
        long bytesRead = 0;
        BufferedSource mOriginalSource;

        ProgressReportingSource(BufferedSource bufferedSource) {
            this.mOriginalSource = bufferedSource;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j2) throws IOException {
            long j3 = this.mOriginalSource.read(buffer, j2);
            this.bytesRead += j3 > 0 ? j3 : 0L;
            RNFetchBlobProgressConfig reportProgress = RNFetchBlobReq.getReportProgress(RNFetchBlobDefaultResp.this.mTaskId);
            long jContentLength = RNFetchBlobDefaultResp.this.contentLength();
            if (reportProgress != null && jContentLength != 0 && reportProgress.shouldReport(this.bytesRead / RNFetchBlobDefaultResp.this.contentLength())) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("taskId", RNFetchBlobDefaultResp.this.mTaskId);
                writableMapCreateMap.putString("written", String.valueOf(this.bytesRead));
                writableMapCreateMap.putString("total", String.valueOf(RNFetchBlobDefaultResp.this.contentLength()));
                if (RNFetchBlobDefaultResp.this.isIncrement) {
                    writableMapCreateMap.putString("chunk", buffer.readString(Charset.defaultCharset()));
                } else {
                    writableMapCreateMap.putString("chunk", "");
                }
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) RNFetchBlobDefaultResp.this.rctContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(RNFetchBlobConst.EVENT_PROGRESS, writableMapCreateMap);
            }
            return j3;
        }

        @Override // okio.Source
        public Timeout timeout() {
            return null;
        }
    }

    public RNFetchBlobDefaultResp(ReactApplicationContext reactApplicationContext, String str, ResponseBody responseBody, boolean z2) {
        this.rctContext = reactApplicationContext;
        this.mTaskId = str;
        this.originalBody = responseBody;
        this.isIncrement = z2;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.originalBody.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.originalBody.contentType();
    }

    @Override // okhttp3.ResponseBody
    public BufferedSource source() {
        return Okio.buffer(new ProgressReportingSource(this.originalBody.source()));
    }
}
