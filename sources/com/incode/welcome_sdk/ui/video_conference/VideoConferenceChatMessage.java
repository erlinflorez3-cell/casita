package com.incode.welcome_sdk.ui.video_conference;

import java.util.Date;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class VideoConferenceChatMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f18095a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f18096d = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VideoConferenceChatMessageAuthor f18097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18098c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18099e;

    public VideoConferenceChatMessage(String str, long j2, VideoConferenceChatMessageAuthor videoConferenceChatMessageAuthor) {
        this.f18099e = str;
        this.f18098c = j2;
        this.f18097b = videoConferenceChatMessageAuthor;
    }

    public String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("VideoConferenceChatMessage{message='").append(this.f18099e).append("', timestamp=").append(this.f18098c).append(", author=").append(this.f18097b).append(AbstractJsonLexerKt.END_OBJ).toString();
        int i3 = f18096d + 123;
        f18095a = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }

    public static VideoConferenceChatMessage fromMessage(String str) {
        int i2 = 2 % 2;
        Object obj = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("message");
            String string2 = jSONObject.getString("author");
            int i3 = f18096d + 97;
            f18095a = i3 % 128;
            int i4 = i3 % 2;
            VideoConferenceChatMessage videoConferenceChatMessage = new VideoConferenceChatMessage(string, new Date().getTime(), VideoConferenceChatMessageAuthor.valueOf(string2));
            int i5 = f18096d + 53;
            f18095a = i5 % 128;
            if (i5 % 2 == 0) {
                return videoConferenceChatMessage;
            }
            obj.hashCode();
            throw null;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public String toMessage() {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", this.f18099e);
            jSONObject.put("author", this.f18097b);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        String string = jSONObject.toString();
        int i3 = f18096d + 99;
        f18095a = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }
}
