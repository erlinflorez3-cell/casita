package com.incode.welcome_sdk.ui.video_conference;

/* JADX INFO: loaded from: classes5.dex */
public enum VideoConferenceChatMessageAuthor {
    interviewer,
    user;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f18101b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f18104e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f18105f = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f18106i = 1;

    public static VideoConferenceChatMessageAuthor valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f18104e + 49;
        f18101b = i3 % 128;
        int i4 = i3 % 2;
        VideoConferenceChatMessageAuthor videoConferenceChatMessageAuthor = (VideoConferenceChatMessageAuthor) Enum.valueOf(VideoConferenceChatMessageAuthor.class, str);
        int i5 = f18101b + 13;
        f18104e = i5 % 128;
        if (i5 % 2 != 0) {
            return videoConferenceChatMessageAuthor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static VideoConferenceChatMessageAuthor[] valuesCustom() {
        int i2 = 2 % 2;
        int i3 = f18104e + 51;
        f18101b = i3 % 128;
        int i4 = i3 % 2;
        VideoConferenceChatMessageAuthor[] videoConferenceChatMessageAuthorArrValuesCustom = values();
        if (i4 == 0) {
            return (VideoConferenceChatMessageAuthor[]) videoConferenceChatMessageAuthorArrValuesCustom.clone();
        }
        throw null;
    }

    static {
        int i2 = f18106i + 105;
        f18105f = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
