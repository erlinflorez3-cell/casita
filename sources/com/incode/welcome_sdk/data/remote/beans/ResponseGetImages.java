package com.incode.welcome_sdk.data.remote.beans;

import com.incode.welcome_sdk.data.ImageType;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class ResponseGetImages {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9149a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9150b = 1;
    private Map<ImageType, String> images;

    public ResponseGetImages() {
    }

    public ResponseGetImages(Map<ImageType, String> map) {
        this.images = map;
    }

    public Map<ImageType, String> getImages() {
        int i2 = 2 % 2;
        int i3 = f9149a + 43;
        int i4 = i3 % 128;
        f9150b = i4;
        int i5 = i3 % 2;
        Map<ImageType, String> map = this.images;
        int i6 = i4 + 121;
        f9149a = i6 % 128;
        if (i6 % 2 == 0) {
            return map;
        }
        throw null;
    }

    public String getImage(ImageType imageType) {
        int i2 = 2 % 2;
        int i3 = f9150b;
        int i4 = i3 + 115;
        f9149a = i4 % 128;
        int i5 = i4 % 2;
        Map<ImageType, String> map = this.images;
        if (map == null) {
            return null;
        }
        int i6 = i3 + 25;
        f9149a = i6 % 128;
        int i7 = i6 % 2;
        return map.get(imageType);
    }

    public String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("ResponseGetImages{images=").append(this.images).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f9150b + 31;
        f9149a = i3 % 128;
        if (i3 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public static ResponseGetImages parse(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        HashMap map = new HashMap();
        JSONObject jSONObject = new JSONObject(responseBody.string());
        for (ImageType imageType : ImageType.values()) {
            int i3 = f9149a + 75;
            f9150b = i3 % 128;
            int i4 = i3 % 2;
            String strOptString = jSONObject.optString(imageType.toString(), null);
            if (strOptString != null) {
                map.put(imageType, strOptString);
                int i5 = f9149a + 33;
                f9150b = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        return new ResponseGetImages(map);
    }
}
