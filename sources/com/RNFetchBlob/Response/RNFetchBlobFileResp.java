package com.RNFetchBlob.Response;

import com.RNFetchBlob.RNFetchBlobConst;
import com.RNFetchBlob.RNFetchBlobProgressConfig;
import com.RNFetchBlob.RNFetchBlobReq;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes4.dex */
public class RNFetchBlobFileResp extends ResponseBody {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    long bytesDownloaded = 0;
    boolean isEndMarkerReceived = false;
    String mPath;
    String mTaskId;
    FileOutputStream ofStream;
    ResponseBody originalBody;
    ReactApplicationContext rctContext;

    private class ProgressReportingSource implements Source {
        private ProgressReportingSource() {
        }

        private void reportProgress(String str, long j2, long j3) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("taskId", str);
            writableMapCreateMap.putString("written", String.valueOf(j2));
            writableMapCreateMap.putString("total", String.valueOf(j3));
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) RNFetchBlobFileResp.this.rctContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(RNFetchBlobConst.EVENT_PROGRESS, writableMapCreateMap);
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            RNFetchBlobFileResp.this.ofStream.close();
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j2) throws IOException {
            int i2 = (int) j2;
            try {
                byte[] bArr = new byte[i2];
                long j3 = RNFetchBlobFileResp.this.originalBody.byteStream().read(bArr, 0, i2);
                RNFetchBlobFileResp.this.bytesDownloaded += j3 > 0 ? j3 : 0L;
                if (j3 > 0) {
                    RNFetchBlobFileResp.this.ofStream.write(bArr, 0, (int) j3);
                } else if (RNFetchBlobFileResp.this.contentLength() == -1 && j3 == -1) {
                    RNFetchBlobFileResp.this.isEndMarkerReceived = true;
                }
                RNFetchBlobProgressConfig reportProgress = RNFetchBlobReq.getReportProgress(RNFetchBlobFileResp.this.mTaskId);
                if (RNFetchBlobFileResp.this.contentLength() != 0) {
                    float fContentLength = RNFetchBlobFileResp.this.contentLength() != -1 ? RNFetchBlobFileResp.this.bytesDownloaded / RNFetchBlobFileResp.this.contentLength() : RNFetchBlobFileResp.this.isEndMarkerReceived ? 1.0f : 0.0f;
                    if (reportProgress != null && reportProgress.shouldReport(fContentLength)) {
                        if (RNFetchBlobFileResp.this.contentLength() != -1) {
                            reportProgress(RNFetchBlobFileResp.this.mTaskId, RNFetchBlobFileResp.this.bytesDownloaded, RNFetchBlobFileResp.this.contentLength());
                        } else if (RNFetchBlobFileResp.this.isEndMarkerReceived) {
                            reportProgress(RNFetchBlobFileResp.this.mTaskId, RNFetchBlobFileResp.this.bytesDownloaded, RNFetchBlobFileResp.this.bytesDownloaded);
                        } else {
                            reportProgress(RNFetchBlobFileResp.this.mTaskId, 0L, RNFetchBlobFileResp.this.contentLength());
                        }
                    }
                }
                return j3;
            } catch (Exception unused) {
                return -1L;
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return null;
        }
    }

    public RNFetchBlobFileResp(ReactApplicationContext reactApplicationContext, String str, ResponseBody responseBody, String str2, boolean z2) throws IOException {
        this.rctContext = reactApplicationContext;
        this.mTaskId = str;
        this.originalBody = responseBody;
        this.mPath = str2;
        if (str2 != null) {
            boolean z3 = !z2;
            String strReplace = str2.replace("?append=true", "");
            this.mPath = strReplace;
            File file = new File(strReplace);
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IllegalStateException("Couldn't create dir: " + parentFile);
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            this.ofStream = new FileOutputStream(new File(strReplace), z3);
        }
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.originalBody.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.originalBody.contentType();
    }

    public boolean isDownloadComplete() {
        return this.bytesDownloaded == contentLength() || (contentLength() == -1 && this.isEndMarkerReceived);
    }

    @Override // okhttp3.ResponseBody
    public BufferedSource source() {
        return Okio.buffer(new ProgressReportingSource());
    }
}
