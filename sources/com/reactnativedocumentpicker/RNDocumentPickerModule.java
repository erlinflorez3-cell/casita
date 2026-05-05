package com.reactnativedocumentpicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.GuardedResultAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
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
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class RNDocumentPickerModule extends NativeDocumentPickerSpec {
    private static final String E_ACTIVITY_DOES_NOT_EXIST = "ACTIVITY_DOES_NOT_EXIST";
    private static final String E_DOCUMENT_PICKER_CANCELED = "DOCUMENT_PICKER_CANCELED";
    private static final String E_FAILED_TO_SHOW_PICKER = "FAILED_TO_SHOW_PICKER";
    private static final String E_INVALID_DATA_RETURNED = "INVALID_DATA_RETURNED";
    private static final String E_UNABLE_TO_OPEN_FILE_TYPE = "UNABLE_TO_OPEN_FILE_TYPE";
    private static final String E_UNEXPECTED_EXCEPTION = "UNEXPECTED_EXCEPTION";
    private static final String E_UNKNOWN_ACTIVITY_RESULT = "UNKNOWN_ACTIVITY_RESULT";
    private static final String FIELD_COPY_ERROR = "copyError";
    private static final String FIELD_FILE_COPY_URI = "fileCopyUri";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_SIZE = "size";
    private static final String FIELD_TYPE = "type";
    private static final String FIELD_URI = "uri";
    public static final String NAME = "RNDocumentPicker";
    private static final String OPTION_COPY_TO = "copyTo";
    private static final String OPTION_MULTIPLE = "allowMultiSelection";
    private static final String OPTION_TYPE = "type";
    private static final int PICK_DIR_REQUEST_CODE = 42;
    private static final int READ_REQUEST_CODE = 41;
    private final ActivityEventListener activityEventListener;
    private String copyTo;
    private Promise promise;

    private static class ProcessDataTask extends GuardedResultAsyncTask<ReadableArray> {
        private final String copyTo;
        private final Promise promise;
        private final List<Uri> uris;
        private final WeakReference<Context> weakContext;

        protected ProcessDataTask(ReactContext reactContext, List<Uri> list, String str, Promise promise) {
            super(reactContext.getExceptionHandler());
            this.weakContext = new WeakReference<>(reactContext.getApplicationContext());
            this.uris = list;
            this.copyTo = str;
            this.promise = promise;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static android.net.Uri copyFile(android.content.Context r7, android.net.Uri r8, java.io.File r9) throws java.lang.Throwable {
            /*
                java.lang.String r2 = "\u0012 \u0017&\u001c\u0017\u0013]\u001c))0\u001a$+ec\u0011\u0011\u0018\u0002\u0016\u0013"
                r1 = -30009(0xffffffffffff8ac7, float:NaN)
                int r0 = yg.C1499aX.Xd()
                r0 = r0 ^ r1
                short r6 = (short) r0
                int r0 = r2.length()
                int[] r5 = new int[r0]
                yg.QB r4 = new yg.QB
                r4.<init>(r2)
                r3 = 0
            L16:
                boolean r0 = r4.YK()
                if (r0 == 0) goto L34
                int r0 = r4.KK()
                yg.Xu r2 = yg.Xu.Xd(r0)
                int r1 = r2.CK(r0)
                r0 = r6 ^ r3
                int r0 = r0 + r1
                int r0 = r2.fK(r0)
                r5[r3] = r0
                int r3 = r3 + 1
                goto L16
            L34:
                java.lang.String r1 = new java.lang.String
                r0 = 0
                r1.<init>(r5, r0, r3)
                java.lang.Class r6 = java.lang.Class.forName(r1)
                r0 = 0
                java.lang.Class[] r5 = new java.lang.Class[r0]
                r0 = 0
                java.lang.Object[] r4 = new java.lang.Object[r0]
            */
            //  java.lang.String r3 = "(%3\u0001,*/\u001f',\t\u001b(#\u001f(\u0016\""
            /*
                r1 = -5324(0xffffffffffffeb34, float:NaN)
                r2 = -16351(0xffffffffffffc021, float:NaN)
                int r0 = yg.C1633zX.Xd()
                r0 = r0 ^ r1
                short r1 = (short) r0
                int r0 = yg.C1633zX.Xd()
                r0 = r0 ^ r2
                short r0 = (short) r0
                java.lang.String r0 = yg.Qg.kd(r3, r1, r0)
                java.lang.reflect.Method r1 = r6.getMethod(r0, r5)
                r0 = 1
                r1.setAccessible(r0)     // Catch: java.lang.reflect.InvocationTargetException -> La3
                java.lang.Object r0 = r1.invoke(r7, r4)     // Catch: java.lang.reflect.InvocationTargetException -> La3
                android.content.ContentResolver r0 = (android.content.ContentResolver) r0
                java.io.InputStream r4 = r0.openInputStream(r8)
                java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L97
                r3.<init>(r9)     // Catch: java.lang.Throwable -> L97
                r0 = 8192(0x2000, float:1.148E-41)
                byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L8d
            L75:
                int r1 = r4.read(r2)     // Catch: java.lang.Throwable -> L8d
                if (r1 <= 0) goto L80
                r0 = 0
                r3.write(r2, r0, r1)     // Catch: java.lang.Throwable -> L8d
                goto L75
            L80:
                android.net.Uri r0 = android.net.Uri.fromFile(r9)     // Catch: java.lang.Throwable -> L8d
                r3.close()     // Catch: java.lang.Throwable -> L97
                if (r4 == 0) goto L8c
                r4.close()
            L8c:
                return r0
            L8d:
                r1 = move-exception
                r3.close()     // Catch: java.lang.Throwable -> L92
                goto L96
            L92:
                r0 = move-exception
                r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L97
            L96:
                throw r1     // Catch: java.lang.Throwable -> L97
            L97:
                r1 = move-exception
                if (r4 == 0) goto La2
                r4.close()     // Catch: java.lang.Throwable -> L9e
                goto La2
            L9e:
                r0 = move-exception
                r1.addSuppressed(r0)
            La2:
                throw r1
            La3:
                r0 = move-exception
                java.lang.Throwable r0 = r0.getCause()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.reactnativedocumentpicker.RNDocumentPickerModule.ProcessDataTask.copyFile(android.content.Context, android.net.Uri, java.io.File):android.net.Uri");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v2, types: [com.facebook.react.bridge.WritableMap] */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v6 */
        private void copyFileToLocalStorage(Context context, WritableMap writableMap, Uri uri) throws Throwable {
            String strVd = hg.Vd("NPRJ'RRZ5QG", (short) (ZN.Xd() ^ 18775), (short) (ZN.Xd() ^ 30366));
            String strUd = C1561oA.ud("\u0011\u000b\u0012\u0014\f\nD\u0018\u0012A\u0004\u0012\u0004~\u0011\u0001:}\u0002\n{x\t\u0003\u0005\u000b0p\u0003-", (short) (C1580rY.Xd() ^ (-5970)));
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.yd("BPCRTOG\u0012<IELBLO\n4a]dZng", (short) (C1633zX.Xd() ^ (-24287)))).getMethod(C1561oA.Yd("YXh8WZ`^>dn", (short) (C1580rY.Xd() ^ (-5715))), new Class[0]);
            try {
                method.setAccessible(true);
                File file = (File) method.invoke(context, objArr);
                ?? r4 = "\b\u0014\t\u001c\u0015\u000e\u0018\u001fo\u0016 \u0014\u0013%!%-";
                if (this.copyTo.equals(Xg.qd("\b\u0014\t\u001c\u0015\u000e\u0018\u001fo\u0016 \u0014\u0013%!%-", (short) (C1580rY.Xd() ^ (-6597)), (short) (C1580rY.Xd() ^ (-21842))))) {
                    Class<?> cls = Class.forName(Jg.Wd("5Dc\u001b\u0001,P\u0003a\u000fv&@:iLJ8`\u0010i.S", (short) (C1607wl.Xd() ^ 7278), (short) (C1607wl.Xd() ^ 6437)));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr2 = new Object[0];
                    short sXd = (short) (C1633zX.Xd() ^ (-12121));
                    short sXd2 = (short) (C1633zX.Xd() ^ (-30274));
                    int[] iArr = new int["kY\u000b\u001c<sS\u007f\n\u0015V".length()];
                    QB qb = new QB("kY\u000b\u001c<sS\u007f\n\u0015V");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                        i2++;
                    }
                    Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
                    try {
                        method2.setAccessible(true);
                        file = (File) method2.invoke(context, objArr2);
                        r4 = qb;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                File file2 = new File(file, UUID.randomUUID().toString());
                try {
                    if (!file2.mkdir()) {
                        throw new IOException(strUd + file2.getAbsolutePath());
                    }
                    String string = writableMap.getString(C1626yg.Ud("ch\u0003\u0004", (short) (C1607wl.Xd() ^ 15423), (short) (C1607wl.Xd() ^ 4418)));
                    if (string == null) {
                        string = String.valueOf(System.currentTimeMillis());
                    }
                    writableMap.putString(strVd, copyFile(context, uri, safeGetDestination(new File(file2, string), file2.getCanonicalPath())).toString());
                } catch (Exception e3) {
                    e3.printStackTrace();
                    r4.putNull(strVd);
                    r4.putString(Ig.wd("V=\np\u0012b\r7[", (short) (FB.Xd() ^ 10066)), e3.getLocalizedMessage());
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }

        private WritableMap getMetadata(Uri uri) throws Throwable {
            Context context = this.weakContext.get();
            if (context == null) {
                return Arguments.createMap();
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(EO.Od("\u0007\\`\u0013\b.\u0011K^LG-irr\u0010r\u0013[\u0017G4\u0018", (short) (ZN.Xd() ^ 9868))).getMethod(C1561oA.Qd("XUc1\\Z_OW\\9KXSOXFR", (short) (ZN.Xd() ^ 11408)), new Class[0]);
            try {
                method.setAccessible(true);
                ContentResolver contentResolver = (ContentResolver) method.invoke(context, objArr);
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString(C1593ug.zd("ec[", (short) (C1580rY.Xd() ^ (-5946)), (short) (C1580rY.Xd() ^ (-3601))), uri.toString());
                String type = contentResolver.getType(uri);
                String strOd = C1561oA.od("IMC7", (short) (C1580rY.Xd() ^ (-14225)));
                writableMapCreateMap.putString(strOd, type);
                Cursor cursorQuery = contentResolver.query(uri, null, null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            int columnIndex = cursorQuery.getColumnIndex(C1561oA.Kd("\u0014\u001a +)&\u001c5\u001c, -&", (short) (C1607wl.Xd() ^ 7200)));
                            boolean zIsNull = cursorQuery.isNull(columnIndex);
                            String strZd = Wg.Zd("G\u000fi,", (short) (Od.Xd() ^ (-23017)), (short) (Od.Xd() ^ (-22568)));
                            if (zIsNull) {
                                writableMapCreateMap.putNull(strZd);
                            } else {
                                writableMapCreateMap.putString(strZd, cursorQuery.getString(columnIndex));
                            }
                            int columnIndex2 = cursorQuery.getColumnIndex(C1561oA.Xd("SPUNI_e]S", (short) (OY.Xd() ^ 28146)));
                            if (!cursorQuery.isNull(columnIndex2)) {
                                writableMapCreateMap.putString(strOd, cursorQuery.getString(columnIndex2));
                            }
                            boolean zIsNull2 = cursorQuery.isNull(cursorQuery.getColumnIndex(Wg.vd("$70@&", (short) (FB.Xd() ^ 30649))));
                            String strKd = Qg.kd("\u0003w\bq", (short) (ZN.Xd() ^ 17206), (short) (ZN.Xd() ^ 5261));
                            if (zIsNull2) {
                                writableMapCreateMap.putNull(strKd);
                            } else {
                                writableMapCreateMap.putDouble(strKd, cursorQuery.getLong(r10));
                            }
                        }
                    } catch (Throwable th) {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                prepareFileUri(context, writableMapCreateMap, uri);
                return writableMapCreateMap;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        private void prepareFileUri(Context context, WritableMap writableMap, Uri uri) throws Throwable {
            if (this.copyTo == null) {
                writableMap.putNull(RNDocumentPickerModule.FIELD_FILE_COPY_URI);
            } else {
                copyFileToLocalStorage(context, writableMap, uri);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.GuardedResultAsyncTask
        public ReadableArray doInBackgroundGuarded() {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Iterator<Uri> it = this.uris.iterator();
            while (it.hasNext()) {
                writableArrayCreateArray.pushMap(getMetadata(it.next()));
            }
            return writableArrayCreateArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedResultAsyncTask
        public void onPostExecuteGuarded(ReadableArray readableArray) {
            this.promise.resolve(readableArray);
        }

        public File safeGetDestination(File file, String str) throws IOException, IllegalArgumentException {
            if (file.getCanonicalPath().startsWith(str)) {
                return file;
            }
            throw new IllegalArgumentException("The copied file is attempting to write outside of the target directory.");
        }
    }

    public RNDocumentPickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        BaseActivityEventListener baseActivityEventListener = new BaseActivityEventListener() { // from class: com.reactnativedocumentpicker.RNDocumentPickerModule.1
            @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int i2, int i3, Intent intent) {
                Promise promise;
                if ((i2 == 41 || i2 == 42) && (promise = RNDocumentPickerModule.this.promise) != null) {
                    if (i3 == 0) {
                        RNDocumentPickerModule.this.sendError(RNDocumentPickerModule.E_DOCUMENT_PICKER_CANCELED, "User canceled directory picker");
                    } else if (i2 == 41) {
                        RNDocumentPickerModule.this.onShowActivityResult(i3, intent, promise);
                    } else {
                        RNDocumentPickerModule.this.onPickDirectoryResult(i3, intent);
                    }
                }
            }
        };
        this.activityEventListener = baseActivityEventListener;
        reactApplicationContext.addActivityEventListener(baseActivityEventListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPickDirectoryResult(int i2, Intent intent) {
        if (i2 != -1) {
            sendError(E_UNKNOWN_ACTIVITY_RESULT, "Unknown activity result: " + i2);
            return;
        }
        if (intent == null || intent.getData() == null) {
            sendError(E_INVALID_DATA_RETURNED, "Invalid data returned by intent");
            return;
        }
        Uri data = intent.getData();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("uri", data.toString());
        this.promise.resolve(writableMapCreateMap);
    }

    private String[] readableArrayToStringArray(ReadableArray readableArray) {
        int size = readableArray.size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = readableArray.getString(i2);
        }
        return strArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendError(String str, String str2) {
        sendError(str, str2, null);
    }

    private void sendError(String str, String str2, Exception exc) {
        Promise promise = this.promise;
        if (promise != null) {
            this.promise = null;
            promise.reject(str, str2, exc);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        getReactApplicationContext().removeActivityEventListener(this.activityEventListener);
        super.invalidate();
    }

    public void onShowActivityResult(int i2, Intent intent, Promise promise) {
        Uri data;
        ClipData clipData;
        if (i2 != -1) {
            sendError(E_UNKNOWN_ACTIVITY_RESULT, "Unknown activity result: " + i2);
            return;
        }
        if (intent != null) {
            data = intent.getData();
            clipData = intent.getClipData();
        } else {
            data = null;
            clipData = null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (clipData != null && clipData.getItemCount() > 0) {
                int itemCount = clipData.getItemCount();
                for (int i3 = 0; i3 < itemCount; i3++) {
                    arrayList.add(clipData.getItemAt(i3).getUri());
                }
            } else {
                if (data == null) {
                    sendError(E_INVALID_DATA_RETURNED, "Invalid data returned by intent");
                    return;
                }
                arrayList.add(data);
            }
            new ProcessDataTask(getReactApplicationContext(), arrayList, this.copyTo, promise).execute(new Void[0]);
        } catch (Exception e2) {
            sendError(E_UNEXPECTED_EXCEPTION, e2.getLocalizedMessage(), e2);
        }
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    @ReactMethod
    public void pick(ReadableMap readableMap, Promise promise) throws Exception {
        ReadableArray array;
        Activity currentActivity = getCurrentActivity();
        this.promise = promise;
        this.copyTo = readableMap.hasKey(OPTION_COPY_TO) ? readableMap.getString(OPTION_COPY_TO) : null;
        if (currentActivity == null) {
            sendError(E_ACTIVITY_DOES_NOT_EXIST, "Current activity does not exist");
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            boolean z2 = false;
            if (!readableMap.isNull("type") && (array = readableMap.getArray("type")) != null) {
                if (array.size() > 1) {
                    String[] strArr = readableArrayToStringArray(array);
                    intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
                    intent.setType(String.join("|", strArr));
                } else if (array.size() == 1) {
                    intent.setType(array.getString(0));
                }
            }
            if (!readableMap.isNull(OPTION_MULTIPLE) && readableMap.getBoolean(OPTION_MULTIPLE)) {
                z2 = true;
            }
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z2);
            Bundle bundle = Bundle.EMPTY;
            CX.ud();
            currentActivity.startActivityForResult(intent, 41, bundle);
        } catch (ActivityNotFoundException e2) {
            sendError(E_UNABLE_TO_OPEN_FILE_TYPE, e2.getLocalizedMessage());
        } catch (Exception e3) {
            e3.printStackTrace();
            sendError(E_FAILED_TO_SHOW_PICKER, e3.getLocalizedMessage());
        }
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    @ReactMethod
    public void pickDirectory(Promise promise) throws Exception {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Current activity does not exist");
            return;
        }
        this.promise = promise;
        try {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            CX.ud();
            currentActivity.startActivityForResult(intent, 42, null);
        } catch (Exception e2) {
            sendError(E_FAILED_TO_SHOW_PICKER, "Failed to create directory picker", e2);
        }
    }

    @Override // com.reactnativedocumentpicker.NativeDocumentPickerSpec
    public void releaseSecureAccess(ReadableArray readableArray, Promise promise) {
        promise.reject("RNDocumentPicker:releaseSecureAccess", "releaseSecureAccess is not supported on Android");
    }
}
