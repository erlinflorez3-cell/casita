package cl.json.social;

import android.content.Intent;
import android.net.Uri;
import cl.json.ShareFile;
import com.braze.models.FeatureFlag;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.sentry.rrweb.RRWebVideoEvent;
import yg.CX;

/* JADX INFO: loaded from: classes4.dex */
public class InstagramShare extends SingleShareIntent {
    private static final String PACKAGE = "com.instagram.android";
    private static final String PLAY_STORE_LINK = "https://play.google.com/store/apps/details?id=com.instagram.android";

    public InstagramShare(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private String getExtension(String str) {
        return str.split(RemoteSettings.FORWARD_SLASH_STRING)[r1.length - 1];
    }

    @Override // cl.json.social.ShareIntent
    protected String getDefaultWebLink() {
        return null;
    }

    @Override // cl.json.social.ShareIntent
    protected String getPackage() {
        return PACKAGE;
    }

    @Override // cl.json.social.ShareIntent
    protected String getPlayStoreLink() {
        return PLAY_STORE_LINK;
    }

    @Override // cl.json.social.SingleShareIntent, cl.json.social.ShareIntent
    public void open(ReadableMap readableMap) throws Exception {
        super.open(readableMap);
        if (ShareIntent.hasValidKey("type", readableMap)) {
            String string = readableMap.getString("type");
            if (string.startsWith("text")) {
                openInstagramIntentChooserForText(this.chooserTitle);
                return;
            }
            if (ShareIntent.hasValidKey("url", readableMap)) {
                String string2 = readableMap.getString("url");
                if (Boolean.valueOf(string2.startsWith("instagram://")).booleanValue()) {
                    openInstagramUrlScheme(string2);
                    return;
                }
                String extension = getExtension(string);
                openInstagramIntentChooserForMedia(string2, this.chooserTitle, Boolean.valueOf(string.startsWith(FeatureFlag.PROPERTIES_TYPE_IMAGE)), extension);
            }
        }
    }

    protected void openInstagramIntentChooserForMedia(String str, String str2, Boolean bool, String str3) throws Exception {
        Boolean boolValueOf = Boolean.valueOf(ShareIntent.hasValidKey("useInternalStorage", this.options) && this.options.getBoolean("useInternalStorage"));
        Uri uri = (bool.booleanValue() ? new ShareFile(str, "image/" + str3, FeatureFlag.PROPERTIES_TYPE_IMAGE, boolValueOf, this.reactContext) : new ShareFile(str, "video/" + str3, RRWebVideoEvent.EVENT_TAG, boolValueOf, this.reactContext)).getURI();
        Intent intent = new Intent("android.intent.action.SEND");
        if (bool.booleanValue()) {
            intent.setType("image/*");
        } else {
            intent.setType("video/*");
        }
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setPackage(PACKAGE);
        Intent intent2 = new Intent("com.instagram.share.ADD_TO_STORY");
        intent2.setDataAndType(uri, str3);
        intent2.addFlags(1);
        intent2.setPackage(PACKAGE);
        Intent intentCreateChooser = Intent.createChooser(intent, str2);
        intentCreateChooser.addFlags(268435456);
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent2});
        this.reactContext.getCurrentActivity().grantUriPermission(PACKAGE, uri, 1);
        ReactApplicationContext reactApplicationContext = this.reactContext;
        CX.ud();
        reactApplicationContext.startActivity(intentCreateChooser);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean(FirebaseAnalytics.Param.SUCCESS, true);
        writableMapCreateMap.putString("message", getIntent().getPackage());
        TargetChosenReceiver.callbackResolve(writableMapCreateMap);
    }

    protected void openInstagramIntentChooserForText(String str) throws Exception {
        getIntent().setPackage(PACKAGE);
        getIntent().setType("text/plain");
        getIntent().setAction("android.intent.action.SEND");
        super.openIntentChooser();
    }

    protected void openInstagramUrlScheme(String str) throws Exception {
        Uri uri = Uri.parse(str);
        getIntent().setAction("android.intent.action.VIEW");
        getIntent().setData(uri);
        super.openIntentChooser();
    }
}
