package com.incode.welcome_sdk.data.local;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoSelfieLocalQuestion implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<VideoSelfieLocalQuestion> CREATOR = new d();

    /* JADX INFO: renamed from: b */
    private static int f7687b = 1;

    /* JADX INFO: renamed from: c */
    private static int f7688c = 1;

    /* JADX INFO: renamed from: d */
    private static int f7689d = 0;

    /* JADX INFO: renamed from: e */
    private static int f7690e = 0;
    private final String answer;
    private final String question;

    public VideoSelfieLocalQuestion(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.question = str;
        this.answer = str2;
    }

    public final String getQuestion() {
        int i2 = 2 % 2;
        int i3 = f7688c;
        int i4 = i3 + 75;
        f7689d = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.question;
        int i5 = i3 + 33;
        f7689d = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAnswer() {
        int i2 = 2 % 2;
        int i3 = f7688c + 33;
        int i4 = i3 % 128;
        f7689d = i4;
        int i5 = i3 % 2;
        String str = this.answer;
        int i6 = i4 + 53;
        f7688c = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i2 = f7687b + 55;
        f7690e = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 78 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = 2 % 2;
        int i4 = f7688c + 39;
        f7689d = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i5 != 0) {
            parcel.writeString(this.question);
            parcel.writeString(this.answer);
            throw null;
        }
        parcel.writeString(this.question);
        parcel.writeString(this.answer);
        int i6 = f7688c + 49;
        f7689d = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i2 = 2 % 2;
        int i3 = f7689d + 85;
        int i4 = i3 % 128;
        f7688c = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 69;
        f7689d = i6 % 128;
        int i7 = i6 % 2;
        return 0;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f7688c + 17;
            f7689d = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof VideoSelfieLocalQuestion)) {
            int i5 = f7689d + 91;
            f7688c = i5 % 128;
            return i5 % 2 == 0;
        }
        VideoSelfieLocalQuestion videoSelfieLocalQuestion = (VideoSelfieLocalQuestion) obj;
        if (!Intrinsics.areEqual(this.question, videoSelfieLocalQuestion.question)) {
            int i6 = f7689d + 117;
            f7688c = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (Intrinsics.areEqual(this.answer, videoSelfieLocalQuestion.answer)) {
            return true;
        }
        int i7 = f7688c + 71;
        f7689d = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public static final class d implements Parcelable.Creator<VideoSelfieLocalQuestion> {

        /* JADX INFO: renamed from: b */
        private static int f7691b = 1;

        /* JADX INFO: renamed from: e */
        private static int f7692e = 0;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoSelfieLocalQuestion createFromParcel(Parcel parcel) {
            int i2 = 2 % 2;
            int i3 = f7692e + 65;
            f7691b = i3 % 128;
            int i4 = i3 % 2;
            VideoSelfieLocalQuestion videoSelfieLocalQuestionD = d(parcel);
            int i5 = f7692e + 69;
            f7691b = i5 % 128;
            int i6 = i5 % 2;
            return videoSelfieLocalQuestionD;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoSelfieLocalQuestion[] newArray(int i2) {
            int i3 = 2 % 2;
            int i4 = f7691b + 55;
            f7692e = i4 % 128;
            int i5 = i4 % 2;
            VideoSelfieLocalQuestion[] videoSelfieLocalQuestionArrE = e(i2);
            if (i5 != 0) {
                int i6 = 73 / 0;
            }
            int i7 = f7692e + 59;
            f7691b = i7 % 128;
            int i8 = i7 % 2;
            return videoSelfieLocalQuestionArrE;
        }

        private static VideoSelfieLocalQuestion d(Parcel parcel) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            VideoSelfieLocalQuestion videoSelfieLocalQuestion = new VideoSelfieLocalQuestion(parcel.readString(), parcel.readString());
            int i3 = f7692e + 97;
            f7691b = i3 % 128;
            int i4 = i3 % 2;
            return videoSelfieLocalQuestion;
        }

        private static VideoSelfieLocalQuestion[] e(int i2) {
            int i3 = 2 % 2;
            int i4 = f7691b + 37;
            f7692e = i4 % 128;
            VideoSelfieLocalQuestion[] videoSelfieLocalQuestionArr = new VideoSelfieLocalQuestion[i2];
            if (i4 % 2 == 0) {
                return videoSelfieLocalQuestionArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f7688c + 15;
        f7689d = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = this.question.hashCode();
        return i4 != 0 ? (iHashCode - 19) * this.answer.hashCode() : (iHashCode * 31) + this.answer.hashCode();
    }

    public final String toString() {
        String str;
        int i2 = 2 % 2;
        int i3 = f7688c + 85;
        f7689d = i3 % 128;
        if (i3 % 2 != 0) {
            str = "VideoSelfieLocalQuestion(question=" + this.question + ", answer=" + this.answer + ")";
            int i4 = 32 / 0;
        } else {
            str = "VideoSelfieLocalQuestion(question=" + this.question + ", answer=" + this.answer + ")";
        }
        int i5 = f7689d + 11;
        f7688c = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static /* synthetic */ VideoSelfieLocalQuestion copy$default(VideoSelfieLocalQuestion videoSelfieLocalQuestion, String str, String str2, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = f7688c + 121;
            f7689d = i4 % 128;
            if (i4 % 2 != 0) {
                String str3 = videoSelfieLocalQuestion.question;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = videoSelfieLocalQuestion.question;
        }
        if ((i2 & 2) != 0) {
            int i5 = f7689d + 65;
            f7688c = i5 % 128;
            if (i5 % 2 == 0) {
                str2 = videoSelfieLocalQuestion.answer;
                int i6 = 95 / 0;
            } else {
                str2 = videoSelfieLocalQuestion.answer;
            }
        }
        return videoSelfieLocalQuestion.copy(str, str2);
    }

    public final VideoSelfieLocalQuestion copy(String str, String str2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        VideoSelfieLocalQuestion videoSelfieLocalQuestion = new VideoSelfieLocalQuestion(str, str2);
        int i3 = f7689d + 7;
        f7688c = i3 % 128;
        int i4 = i3 % 2;
        return videoSelfieLocalQuestion;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f7688c + 91;
        int i4 = i3 % 128;
        f7689d = i4;
        int i5 = i3 % 2;
        String str = this.answer;
        int i6 = i4 + 29;
        f7688c = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f7689d + 43;
        int i4 = i3 % 128;
        f7688c = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.question;
        int i5 = i4 + 25;
        f7689d = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
