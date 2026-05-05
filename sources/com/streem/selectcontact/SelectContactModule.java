package com.streem.selectcontact;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.autofill.HintConstants;
import com.braze.models.FeatureFlag;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import io.sentry.SentryLockReason;
import io.sentry.protocol.Geo;
import io.sentry.protocol.SentryThread;
import yg.CX;

/* JADX INFO: loaded from: classes5.dex */
public class SelectContactModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int CONTACT_REQUEST = 11112;
    public static final String E_CONTACT_CANCELLED = "E_CONTACT_CANCELLED";
    public static final String E_CONTACT_EXCEPTION = "E_CONTACT_EXCEPTION";
    public static final String E_CONTACT_NO_DATA = "E_CONTACT_NO_DATA";
    public static final String E_CONTACT_PERMISSION = "E_CONTACT_PERMISSION";
    private static final String TAG = "SelectContactModule";
    private final ContentResolver contentResolver;
    private Promise mContactsPromise;

    public static class SelectContactException extends Exception {
        private final String errorCode;

        public SelectContactException(String str, String str2) {
            super(str2);
            this.errorCode = str;
        }

        public String getErrorCode() {
            return this.errorCode;
        }
    }

    public SelectContactModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.contentResolver = getReactApplicationContext().getContentResolver();
        reactApplicationContext.addActivityEventListener(this);
    }

    private void addEmailEntry(WritableArray writableArray, Cursor cursor, Activity activity) {
        String string = cursor.getString(cursor.getColumnIndex("data1"));
        CharSequence typeLabel = ContactsContract.CommonDataKinds.Email.getTypeLabel(activity.getResources(), cursor.getInt(cursor.getColumnIndex("data2")), cursor.getString(cursor.getColumnIndex("data3")));
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(SentryLockReason.JsonKeys.ADDRESS, string);
        writableMapCreateMap.putString("type", String.valueOf(typeLabel));
        writableArray.pushMap(writableMapCreateMap);
    }

    private void addNameData(WritableMap writableMap, Cursor cursor) {
        writableMap.putString("name", cursor.getString(cursor.getColumnIndex("data1")));
        int columnIndex = cursor.getColumnIndex("data2");
        if (columnIndex != -1) {
            writableMap.putString("givenName", cursor.getString(columnIndex));
        }
        if (cursor.getColumnIndex("data3") != -1) {
            writableMap.putString("familyName", cursor.getString(cursor.getColumnIndex("data3")));
        }
        int columnIndex2 = cursor.getColumnIndex("data5");
        if (columnIndex2 != -1) {
            writableMap.putString("middleName", cursor.getString(columnIndex2));
        }
    }

    private void addPhoneEntry(WritableArray writableArray, Cursor cursor, Activity activity) {
        String string = cursor.getString(cursor.getColumnIndex("data1"));
        CharSequence typeLabel = ContactsContract.CommonDataKinds.Phone.getTypeLabel(activity.getResources(), cursor.getInt(cursor.getColumnIndex("data2")), cursor.getString(cursor.getColumnIndex("data3")));
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(FeatureFlag.PROPERTIES_TYPE_NUMBER, string);
        writableMapCreateMap.putString("type", String.valueOf(typeLabel));
        writableArray.pushMap(writableMapCreateMap);
    }

    private void addPostalData(WritableArray writableArray, Cursor cursor, Activity activity) {
        int columnIndex = cursor.getColumnIndex("data1");
        int columnIndex2 = cursor.getColumnIndex("data4");
        int columnIndex3 = cursor.getColumnIndex("data7");
        int columnIndex4 = cursor.getColumnIndex("data8");
        int columnIndex5 = cursor.getColumnIndex("data9");
        int columnIndex6 = cursor.getColumnIndex("data10");
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (columnIndex != -1) {
            writableMapCreateMap.putString("formattedAddress", cursor.getString(columnIndex));
        }
        if (columnIndex2 != -1) {
            writableMapCreateMap.putString("street", cursor.getString(columnIndex2));
        }
        if (columnIndex3 != -1) {
            writableMapCreateMap.putString(Geo.JsonKeys.CITY, cursor.getString(columnIndex3));
        }
        if (columnIndex4 != -1) {
            writableMapCreateMap.putString(SentryThread.JsonKeys.STATE, cursor.getString(columnIndex4));
        }
        if (columnIndex5 != -1) {
            writableMapCreateMap.putString(HintConstants.AUTOFILL_HINT_POSTAL_CODE, cursor.getString(columnIndex5));
        }
        if (columnIndex6 != -1) {
            writableMapCreateMap.putString("isoCountryCode", cursor.getString(columnIndex6));
        }
        int columnIndex7 = cursor.getColumnIndex("data2");
        int columnIndex8 = cursor.getColumnIndex("data3");
        if (columnIndex7 != -1 && columnIndex8 != -1) {
            String string = cursor.getString(columnIndex8);
            writableMapCreateMap.putString("type", String.valueOf(ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabel(activity.getResources(), cursor.getInt(columnIndex7), string)));
        }
        writableArray.pushMap(writableMapCreateMap);
    }

    private Uri buildContactUri(String str) {
        return Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, str).buildUpon().appendPath("entities").build();
    }

    private String getContactId(Uri uri) throws SelectContactException {
        Cursor cursorQuery = this.contentResolver.query(uri, null, null, null, null);
        if (cursorQuery == null || !cursorQuery.moveToFirst()) {
            throw new SelectContactException(E_CONTACT_NO_DATA, "Contact Data Not Found");
        }
        return cursorQuery.getString(cursorQuery.getColumnIndex("_id"));
    }

    private void launchPicker(Promise promise, int i2) throws Exception {
        this.mContactsPromise = promise;
        Cursor cursorQuery = this.contentResolver.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        if (cursorQuery == null) {
            this.mContactsPromise.reject(E_CONTACT_PERMISSION, "no permission");
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("vnd.android.cursor.dir/contact");
        Activity currentActivity = getCurrentActivity();
        if (intent.resolveActivity(currentActivity.getPackageManager()) != null) {
            CX.ud();
            currentActivity.startActivityForResult(intent, i2);
        }
        cursorQuery.close();
    }

    private Cursor openContactQuery(Uri uri) throws SelectContactException {
        Cursor cursorQuery = this.contentResolver.query(uri, new String[]{"mimetype", "data1", "data2", "data3"}, null, null, "raw_contact_id ASC");
        if (cursorQuery != null) {
            return cursorQuery;
        }
        throw new SelectContactException(E_CONTACT_EXCEPTION, "Could not query contacts data. Unable to create cursor.");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SelectContact";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.facebook.react.bridge.ActivityEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityResult(android.app.Activity r15, int r16, int r17, android.content.Intent r18) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.streem.selectcontact.SelectContactModule.onActivityResult(android.app.Activity, int, int, android.content.Intent):void");
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void openContactSelection(Promise promise) throws Exception {
        launchPicker(promise, CONTACT_REQUEST);
    }
}
