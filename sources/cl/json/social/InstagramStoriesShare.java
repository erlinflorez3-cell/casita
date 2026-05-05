package cl.json.social;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import cl.json.ShareFile;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.appstate.AppStateModule;
import com.reactnativecommunity.clipboard.ClipboardModule;

/* JADX INFO: loaded from: classes4.dex */
public class InstagramStoriesShare extends SingleShareIntent {
    private static final String PACKAGE = "com.instagram.android";
    private static final String PLAY_STORE_LINK = "https://play.google.com/store/apps/details?id=com.instagram.android";

    public InstagramStoriesShare(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        setIntent(new Intent("com.instagram.share.ADD_TO_STORY"));
    }

    private void shareStory(ReadableMap readableMap) {
        String string;
        if (!hasValidKey("backgroundImage", readableMap) && !hasValidKey("backgroundVideo", readableMap) && !hasValidKey("stickerImage", readableMap)) {
            throw new IllegalArgumentException("Invalid background or sticker assets provided.");
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            TargetChosenReceiver.callbackReject("Something went wrong");
            return;
        }
        this.intent.putExtra("source_application", readableMap.getString("appId"));
        this.intent.putExtra("bottom_background_color", "#906df4");
        this.intent.putExtra("top_background_color", "#837DF4");
        if (hasValidKey("attributionURL", readableMap)) {
            this.intent.putExtra("content_url", readableMap.getString("attributionURL"));
        }
        if (hasValidKey("backgroundTopColor", readableMap)) {
            this.intent.putExtra("top_background_color", readableMap.getString("backgroundTopColor"));
        }
        if (hasValidKey("backgroundBottomColor", readableMap)) {
            this.intent.putExtra("bottom_background_color", readableMap.getString("backgroundBottomColor"));
        }
        boolean zValueOf = hasValidKey("useInternalStorage", readableMap) ? Boolean.valueOf(readableMap.getBoolean("useInternalStorage")) : false;
        if (hasValidKey("linkUrl", readableMap)) {
            this.intent.putExtra("link_url", readableMap.getString("linkUrl"));
        }
        if (hasValidKey("linkText", readableMap)) {
            this.intent.putExtra("link_text", readableMap.getString("linkText"));
        }
        Boolean boolValueOf = Boolean.valueOf(hasValidKey("backgroundImage", readableMap) || hasValidKey("backgroundVideo", readableMap));
        if (boolValueOf.booleanValue()) {
            boolean zHasValidKey = hasValidKey("backgroundImage", readableMap);
            String str = ClipboardModule.MIMETYPE_JPEG;
            if (zHasValidKey) {
                string = readableMap.getString("backgroundImage");
            } else if (hasValidKey("backgroundVideo", readableMap)) {
                string = readableMap.getString("backgroundVideo");
                str = "video/*";
            } else {
                string = "";
            }
            ShareFile shareFile = new ShareFile(string, str, AppStateModule.APP_STATE_BACKGROUND, zValueOf, this.reactContext);
            this.intent.setDataAndType(shareFile.getURI(), shareFile.getType());
            this.intent.setFlags(1);
        }
        if (hasValidKey("stickerImage", readableMap)) {
            ShareFile shareFile2 = new ShareFile(readableMap.getString("stickerImage"), ClipboardModule.MIMETYPE_PNG, "sticker", zValueOf, this.reactContext);
            if (!boolValueOf.booleanValue()) {
                this.intent.setType("image/*");
            }
            this.intent.putExtra("interactive_asset_uri", shareFile2.getURI());
            currentActivity.grantUriPermission(PACKAGE, shareFile2.getURI(), 1);
        }
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
    public void open(ReadableMap readableMap) throws ActivityNotFoundException {
        super.open(readableMap);
        shareStory(readableMap);
        openIntentChooser(readableMap);
    }
}
