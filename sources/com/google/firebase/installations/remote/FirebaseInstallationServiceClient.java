package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes7.dex */
public class FirebaseInstallationServiceClient {
    private static final String ACCEPT_HEADER_KEY = "Accept";
    private static final String API_KEY_HEADER = "x-goog-api-key";
    private static final String CACHE_CONTROL_DIRECTIVE = "no-cache";
    private static final String CACHE_CONTROL_HEADER_KEY = "Cache-Control";
    private static final String CONTENT_ENCODING_HEADER_KEY = "Content-Encoding";
    private static final String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    private static final String CREATE_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations";
    private static final String DELETE_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations/%s";
    private static final String FIREBASE_INSTALLATIONS_API_DOMAIN = "firebaseinstallations.googleapis.com";
    private static final String FIREBASE_INSTALLATIONS_API_VERSION = "v1";
    private static final String FIREBASE_INSTALLATIONS_ID_HEARTBEAT_TAG = "fire-installations-id";
    private static final String FIREBASE_INSTALLATION_AUTH_VERSION = "FIS_v2";
    private static final String FIS_TAG = "Firebase-Installations";
    private static final String GENERATE_AUTH_TOKEN_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations/%s/authTokens:generate";
    private static final String GZIP_CONTENT_ENCODING = "gzip";
    private static final String HEART_BEAT_HEADER = "x-firebase-client";
    private static final String JSON_CONTENT_TYPE = "application/json";
    private static final int MAX_RETRIES = 1;
    private static final int NETWORK_TIMEOUT_MILLIS = 10000;
    static final String PARSING_EXPIRATION_TIME_ERROR_MESSAGE = "Invalid Expiration Timestamp.";
    private static final String SDK_VERSION_PREFIX = "a:";
    private static final int TRAFFIC_STATS_CREATE_INSTALLATION_TAG = 32769;
    private static final int TRAFFIC_STATS_DELETE_INSTALLATION_TAG = 32770;
    private static final int TRAFFIC_STATS_FIREBASE_INSTALLATIONS_TAG = 32768;
    private static final int TRAFFIC_STATS_GENERATE_AUTH_TOKEN_TAG = 32771;
    private static final String X_ANDROID_CERT_HEADER_KEY = "X-Android-Cert";
    private static final String X_ANDROID_IID_MIGRATION_KEY = "x-goog-fis-android-iid-migration-auth";
    private static final String X_ANDROID_PACKAGE_HEADER_KEY = "X-Android-Package";
    private final Context context;
    private final Provider<HeartBeatController> heartBeatProvider;
    private final RequestLimiter requestLimiter = new RequestLimiter();
    private boolean shouldServerErrorRetry;
    private static final Pattern EXPIRATION_TIMESTAMP_PATTERN = Pattern.compile("[0-9]+s");
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    public FirebaseInstallationServiceClient(Context context, Provider<HeartBeatController> provider) {
        this.context = context;
        this.heartBeatProvider = provider;
    }

    private static String availableFirebaseOptions(String str, String str2, String str3) {
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, TextUtils.isEmpty(str) ? "" : ", " + str);
    }

    private static JSONObject buildCreateFirebaseInstallationRequestBody(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", FIREBASE_INSTALLATION_AUTH_VERSION);
            jSONObject.put("sdkVersion", "a:18.0.0");
            return jSONObject;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private static JSONObject buildGenerateAuthTokenRequestBody() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private String getFingerprintHashForPackage() throws Throwable {
        C1561oA.yd("EprwcktU[eq`i", (short) (C1633zX.Xd() ^ (-28250)));
        String strYd = C1561oA.Yd("\u00074;3,h8:@l54Dp8<B<;IHKCIP|F@SI\u0002ISW\u0006WILULSR(\u000f", (short) (C1580rY.Xd() ^ (-28653)));
        try {
            Context context = this.context;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Xg.qd("\u0007\u0015\f\u001b\u0019\u0014\u0010Z\u0011\u001e\u001e%\u0017!(bx&&-\u001f30", (short) (ZN.Xd() ^ 32052), (short) (ZN.Xd() ^ 1218))).getMethod(Jg.Wd("\bf\u0018\u0015\b,W0XwBw#\u0015", (short) (C1607wl.Xd() ^ 13967), (short) (C1607wl.Xd() ^ 26828)), new Class[0]);
            try {
                method.setAccessible(true);
                byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, (String) method.invoke(context, objArr));
                if (packageCertificateHashBytes != null) {
                    return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
                }
                StringBuilder sb = new StringBuilder(strYd);
                Context context2 = this.context;
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(ZO.xd("sJ27V\tBi^o\\XlsyR<P9Q\u0002IC", (short) (FB.Xd() ^ 18544), (short) (FB.Xd() ^ 20773))).getMethod(C1626yg.Ud("7\u0013x0\u0012\u0014\u000e\u0015 N|e\fH", (short) (Od.Xd() ^ (-2815)), (short) (Od.Xd() ^ (-24856))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    sb.append((String) method2.invoke(context2, objArr2)).toString();
                    return null;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (PackageManager.NameNotFoundException e4) {
            StringBuilder sb2 = new StringBuilder(Ig.wd("l] \u0017\u0012;\u0018GEIQs7GI;x", (short) (OY.Xd() ^ 25135)));
            Context context3 = this.context;
            Object[] objArr3 = new Object[0];
            Method method3 = Class.forName(EO.Od("yVZ\b\u0016M\u001c]B\u0002z#?VH#U\u007fW5dP&", (short) (C1580rY.Xd() ^ (-6599)))).getMethod(C1561oA.Qd("{x\u0007aqrynspXjul", (short) (Od.Xd() ^ (-15240))), new Class[0]);
            try {
                method3.setAccessible(true);
                sb2.append((String) method3.invoke(context3, objArr3)).toString();
                return null;
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
    }

    private URL getFullyQualifiedRequestUri(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", FIREBASE_INSTALLATIONS_API_DOMAIN, FIREBASE_INSTALLATIONS_API_VERSION, str));
        } catch (MalformedURLException e2) {
            throw new FirebaseInstallationsException(e2.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    private static byte[] getJsonBytes(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static boolean isSuccessfulResponseCode(int i2) {
        return i2 >= 200 && i2 < 300;
    }

    private static void logBadConfigError() {
    }

    private static void logFisCommunicationError(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        if (TextUtils.isEmpty(readErrorResponse(httpURLConnection))) {
            return;
        }
        availableFirebaseOptions(str, str2, str3);
    }

    private HttpURLConnection openHttpURLConnection(URL url, String str) throws Throwable {
        C1593ug.zd("m\n\u0013\u0017\u0011\u0011M#\u001fP\u0019\u0018(T\u001e\u001c\u0019+.\u001d!\u001e22_)'$(*8", (short) (OY.Xd() ^ 16785), (short) (OY.Xd() ^ 25385));
        C1561oA.od("GrpuemrS]go^k", (short) (C1580rY.Xd() ^ (-10784)));
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            Callback.openConnection(uRLConnectionOpenConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            short sXd = (short) (C1580rY.Xd() ^ (-15267));
            int[] iArr = new int["{))0\",3l\u0015;3)".length()];
            QB qb = new QB("{))0\",3l\u0015;3)");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                i2++;
            }
            String str2 = new String(iArr, 0, i2);
            String strZd = Wg.Zd("5\u0013V\u001f]4uW\u0010b\u0013 \u001fv6\u0012", (short) (Od.Xd() ^ (-32554)), (short) (Od.Xd() ^ (-31613)));
            httpURLConnection.addRequestProperty(str2, strZd);
            httpURLConnection.addRequestProperty(C1561oA.Xd("/RSVbg", (short) (C1499aX.Xd() ^ (-9596))), strZd);
            httpURLConnection.addRequestProperty(Wg.vd("\f95<2<?x\u0016@2?9?A;", (short) (C1633zX.Xd() ^ (-26922))), Qg.kd("o\u0002ou", (short) (C1633zX.Xd() ^ (-16573)), (short) (C1633zX.Xd() ^ (-26869))));
            httpURLConnection.addRequestProperty(hg.Vd("x\u0016\u0017\u001b\u0017]r\u001e\u001c!\u001e\u001a\u0016", (short) (FB.Xd() ^ 5685), (short) (FB.Xd() ^ 13870)), C1561oA.ud("\u0014\u0014P\u0006\u0003\u0004\b\u0004", (short) (FB.Xd() ^ 589)));
            Context context = this.context;
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.yd("\u001a&\u001f,$\u001d\u001bc\u0014\u001f!&\u0012\u001a#[\f79>*<;", (short) (Od.Xd() ^ (-20168)))).getMethod(C1561oA.Yd("_^nK]`i`gfPdqj", (short) (OY.Xd() ^ 31759)), new Class[0]);
            try {
                method.setAccessible(true);
                httpURLConnection.addRequestProperty(Xg.qd("3\t\u001eLCRPKG\u00115GJSJQP", (short) (C1607wl.Xd() ^ 16268), (short) (C1607wl.Xd() ^ 6937)), (String) method.invoke(context, objArr));
                HeartBeatController heartBeatController = this.heartBeatProvider.get();
                if (heartBeatController != null) {
                    try {
                        httpURLConnection.addRequestProperty(Jg.Wd("F=QfJ\u007fV(T\u0019+E\u0019(nZ:", (short) (FB.Xd() ^ 23766), (short) (FB.Xd() ^ 10613)), (String) Tasks.await(heartBeatController.getHeartBeatsHeader()));
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                    } catch (ExecutionException e3) {
                    }
                }
                httpURLConnection.addRequestProperty(ZO.xd("\u001e\"eQxp\u0017z:[Zrp\u0013", (short) (FB.Xd() ^ 3279), (short) (FB.Xd() ^ 2593)), getFingerprintHashForPackage());
                httpURLConnection.addRequestProperty(C1626yg.Ud("4\t_\u0003 PNI\tP]wLw", (short) (C1633zX.Xd() ^ (-17383)), (short) (C1633zX.Xd() ^ (-7211))), str);
                return httpURLConnection;
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (IOException unused) {
            throw new FirebaseInstallationsException(Ig.wd("oCJ\u0016r\u001cZlcy)\b9$/\n)R\u0010m)\u0003\u0019H'\u007fb wh\u000f1\u001b\u001eb\u0015-f4JQ]\u0018 vKwx'7C!vx'05\u0002\u0019\u0019n\u001cd\u00104\u0001}&!X", (short) (OY.Xd() ^ 3446)), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    static long parseTokenExpirationTimestamp(String str) {
        Preconditions.checkArgument(EXPIRATION_TIMESTAMP_PATTERN.matcher(str).matches(), PARSING_EXPIRATION_TIME_ERROR_MESSAGE);
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private InstallationResponse readCreateResponse(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = Callback.getInputStream(httpURLConnection);
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, UTF_8));
        TokenResult.Builder builder = TokenResult.builder();
        InstallationResponse.Builder builder2 = InstallationResponse.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                builder2.setUri(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                builder2.setFid(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                builder2.setRefreshToken(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        builder.setToken(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        builder.setTokenExpirationTimestamp(parseTokenExpirationTimestamp(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                builder2.setAuthToken(builder.build());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return builder2.setResponseCode(InstallationResponse.ResponseCode.OK).build();
    }

    private static String readErrorResponse(HttpURLConnection httpURLConnection) throws Exception {
        StringBuilder sb;
        InputStream errorStream = Callback.getErrorStream(httpURLConnection);
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, UTF_8));
        try {
            try {
                sb = new StringBuilder();
            } catch (IOException unused) {
                bufferedReader.close();
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (IOException unused3) {
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line).append('\n');
            return null;
        }
        String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(Callback.getResponseCode(httpURLConnection)), Callback.getResponseMessage(httpURLConnection), sb);
        try {
            bufferedReader.close();
        } catch (IOException unused4) {
        }
        return str;
    }

    private TokenResult readGenerateAuthTokenResponse(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = Callback.getInputStream(httpURLConnection);
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, UTF_8));
        TokenResult.Builder builder = TokenResult.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                builder.setToken(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                builder.setTokenExpirationTimestamp(parseTokenExpirationTimestamp(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return builder.setResponseCode(TokenResult.ResponseCode.OK).build();
    }

    private void writeFIDCreateRequestBodyToOutputStream(HttpURLConnection httpURLConnection, String str, String str2) throws Exception {
        writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildCreateFirebaseInstallationRequestBody(str, str2)));
    }

    private void writeGenerateAuthTokenRequestBodyToOutputStream(HttpURLConnection httpURLConnection) throws Exception {
        writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildGenerateAuthTokenRequestBody()));
    }

    private static void writeRequestBodyToOutputStream(URLConnection uRLConnection, byte[] bArr) throws Exception {
        OutputStream outputStream = Callback.getOutputStream(uRLConnection);
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public InstallationResponse createFirebaseInstallation(String str, String str2, String str3, String str4, String str5) throws FirebaseInstallationsException {
        int responseCode;
        InstallationResponse createResponse;
        if (!this.requestLimiter.isRequestAllowed()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        URL fullyQualifiedRequestUri = getFullyQualifiedRequestUri(String.format(CREATE_REQUEST_RESOURCE_NAME_FORMAT, str3));
        for (int i2 = 0; i2 <= 1; i2++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionOpenHttpURLConnection = openHttpURLConnection(fullyQualifiedRequestUri, str);
            try {
                try {
                    httpURLConnectionOpenHttpURLConnection.setRequestMethod(HttpPost.METHOD_NAME);
                    httpURLConnectionOpenHttpURLConnection.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionOpenHttpURLConnection.addRequestProperty(X_ANDROID_IID_MIGRATION_KEY, str5);
                    }
                    writeFIDCreateRequestBodyToOutputStream(httpURLConnectionOpenHttpURLConnection, str2, str4);
                    responseCode = Callback.getResponseCode(httpURLConnectionOpenHttpURLConnection);
                    this.requestLimiter.setNextRequestTime(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (isSuccessfulResponseCode(responseCode)) {
                    createResponse = readCreateResponse(httpURLConnectionOpenHttpURLConnection);
                } else {
                    logFisCommunicationError(httpURLConnectionOpenHttpURLConnection, str4, str, str3);
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        logBadConfigError();
                        createResponse = InstallationResponse.builder().setResponseCode(InstallationResponse.ResponseCode.BAD_CONFIG).build();
                    } else {
                        httpURLConnectionOpenHttpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                return createResponse;
            } finally {
                httpURLConnectionOpenHttpURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    public void deleteFirebaseInstallation(String str, String str2, String str3, String str4) throws FirebaseInstallationsException {
        URL fullyQualifiedRequestUri = getFullyQualifiedRequestUri(String.format(DELETE_REQUEST_RESOURCE_NAME_FORMAT, str3, str2));
        int i2 = 0;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(32770);
            HttpURLConnection httpURLConnectionOpenHttpURLConnection = openHttpURLConnection(fullyQualifiedRequestUri, str);
            try {
                httpURLConnectionOpenHttpURLConnection.setRequestMethod("DELETE");
                httpURLConnectionOpenHttpURLConnection.addRequestProperty("Authorization", "FIS_v2 " + str4);
                int responseCode = Callback.getResponseCode(httpURLConnectionOpenHttpURLConnection);
                if (responseCode == 200 || responseCode == 401 || responseCode == 404) {
                    httpURLConnectionOpenHttpURLConnection.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return;
                }
                logFisCommunicationError(httpURLConnectionOpenHttpURLConnection, null, str, str3);
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    logBadConfigError();
                    throw new FirebaseInstallationsException("Bad config while trying to delete FID", FirebaseInstallationsException.Status.BAD_CONFIG);
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                httpURLConnectionOpenHttpURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
            i2++;
            httpURLConnectionOpenHttpURLConnection.disconnect();
            TrafficStats.clearThreadStatsTag();
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    public TokenResult generateAuthToken(String str, String str2, String str3, String str4) throws FirebaseInstallationsException {
        int responseCode;
        TokenResult generateAuthTokenResponse;
        if (!this.requestLimiter.isRequestAllowed()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        URL fullyQualifiedRequestUri = getFullyQualifiedRequestUri(String.format(GENERATE_AUTH_TOKEN_REQUEST_RESOURCE_NAME_FORMAT, str3, str2));
        for (int i2 = 0; i2 <= 1; i2++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionOpenHttpURLConnection = openHttpURLConnection(fullyQualifiedRequestUri, str);
            try {
                try {
                    httpURLConnectionOpenHttpURLConnection.setRequestMethod(HttpPost.METHOD_NAME);
                    httpURLConnectionOpenHttpURLConnection.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionOpenHttpURLConnection.setDoOutput(true);
                    writeGenerateAuthTokenRequestBodyToOutputStream(httpURLConnectionOpenHttpURLConnection);
                    responseCode = Callback.getResponseCode(httpURLConnectionOpenHttpURLConnection);
                    this.requestLimiter.setNextRequestTime(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (isSuccessfulResponseCode(responseCode)) {
                    generateAuthTokenResponse = readGenerateAuthTokenResponse(httpURLConnectionOpenHttpURLConnection);
                } else {
                    logFisCommunicationError(httpURLConnectionOpenHttpURLConnection, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        generateAuthTokenResponse = TokenResult.builder().setResponseCode(TokenResult.ResponseCode.AUTH_ERROR).build();
                    } else {
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            logBadConfigError();
                            generateAuthTokenResponse = TokenResult.builder().setResponseCode(TokenResult.ResponseCode.BAD_CONFIG).build();
                        } else {
                            httpURLConnectionOpenHttpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                }
                return generateAuthTokenResponse;
            } finally {
                httpURLConnectionOpenHttpURLConnection.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }
}
