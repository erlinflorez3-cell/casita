package com.incode.welcome_sdk.ui.video_conference;

import android.content.Context;
import android.widget.ImageButton;
import com.incode.welcome_sdk.results.VideoConferenceResult;
import com.incode.welcome_sdk.ui.BaseView;
import com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract;
import com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter;
import io.reactivex.subjects.PublishSubject;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class VideoConferenceContract {

    public interface Presenter {
        void enterVideoConference(Context context, VideoConferencePresenter.VideoConferenceData videoConferenceData);

        List<VideoConferenceChatMessage> getChatMessages();

        PublishSubject<Boolean> getNewChatMessagePublishSubject();

        File getSelfieFile();

        PublishSubject<VideoConferenceChatMessage> getUserChatPublishSubject();

        void hangUp();

        void onDestroy();

        void onPause();

        void onResume();

        void publishResult(VideoConferenceResult videoConferenceResult);

        void toggleMute(ImageButton imageButton);

        void waitForMyTurn();
    }

    public interface View extends BaseView, PermissionsMandatoryContract.View {
        void enterVideoConference(VideoConferencePresenter.VideoConferenceData videoConferenceData);

        void hideLoadingSpinner();

        void onVideoConferenceEnded(VideoConferenceResult videoConferenceResult);

        void onVideoConferenceError(Throwable th);

        void onVideoConferenceSet();

        void showInterviewerVideo(android.view.View view);

        void showLoadingSpinner();

        void showMyVideo(android.view.View view);

        void updateNewChatMessageIndicator();
    }
}
