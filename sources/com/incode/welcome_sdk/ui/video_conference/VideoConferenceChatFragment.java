package com.incode.welcome_sdk.ui.video_conference;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.d.az;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.Date;
import java.util.List;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class VideoConferenceChatFragment extends Fragment {

    /* JADX INFO: renamed from: f */
    private static int f18084f = 1;

    /* JADX INFO: renamed from: i */
    private static int f18085i = 0;

    /* JADX INFO: renamed from: a */
    private final CompositeDisposable f18086a = new CompositeDisposable();

    /* JADX INFO: renamed from: b */
    private String f18087b;

    /* JADX INFO: renamed from: c */
    private ChatAdapter f18088c;

    /* JADX INFO: renamed from: d */
    az f18089d;

    /* JADX INFO: renamed from: e */
    private List<VideoConferenceChatMessage> f18090e;

    /* JADX INFO: renamed from: h */
    private File f18091h;

    /* JADX INFO: renamed from: instrumented$0$onCreateView$-Landroid-view-LayoutInflater-Landroid-view-ViewGroup-Landroid-os-Bundle--Landroid-view-View- */
    public static /* synthetic */ void m8596xd0e31f79(VideoConferenceChatFragment videoConferenceChatFragment, View view) {
        Callback.onClick_enter(view);
        try {
            videoConferenceChatFragment.d(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public static VideoConferenceChatFragment newInstance(String str, File file) {
        int i2 = 2 % 2;
        VideoConferenceChatFragment videoConferenceChatFragment = new VideoConferenceChatFragment();
        Bundle bundle = new Bundle();
        bundle.putString("argInterviewerName", str);
        bundle.putString("argSelfieFilepath", file.getAbsolutePath());
        videoConferenceChatFragment.setArguments(bundle);
        int i3 = f18084f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f18085i = i3 % 128;
        int i4 = i3 % 2;
        return videoConferenceChatFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int i2 = 2 % 2;
        super.onCreate(bundle);
        this.f18087b = (String) getArguments().get("argInterviewerName");
        this.f18091h = new File((String) getArguments().get("argSelfieFilepath"));
        int i3 = f18085i + 11;
        f18084f = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.video_conference.VideoConferenceChatFragment$2 */
    final class AnonymousClass2 implements TextWatcher {

        /* JADX INFO: renamed from: a */
        private static int f18092a = 0;

        /* JADX INFO: renamed from: c */
        private static int f18093c = 1;

        AnonymousClass2() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            int i5 = 2 % 2;
            if (charSequence.toString().trim().length() != 0) {
                VideoConferenceChatFragment.this.f18089d.f6983a.setEnabled(true);
                VideoConferenceChatFragment.this.f18089d.f6983a.setTextColor(ContextCompat.getColor(VideoConferenceChatFragment.this.getActivity(), R.color.onboard_sdk_TextColorDefault));
                int i6 = f18092a + 83;
                f18093c = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i7 = f18093c + 111;
            f18092a = i7 % 128;
            int i8 = i7 % 2;
            VideoConferenceChatFragment.this.f18089d.f6983a.setEnabled(false);
            VideoConferenceChatFragment.this.f18089d.f6983a.setTextColor(ContextCompat.getColor(VideoConferenceChatFragment.this.getActivity(), R.color.onboard_sdk_TextColorDisabled));
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            int i5 = 2 % 2;
            int i6 = f18093c + 95;
            f18092a = i6 % 128;
            int i7 = i6 % 2;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            int i2 = 2 % 2;
            int i3 = f18093c + 15;
            f18092a = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 33 / 0;
            }
        }
    }

    private /* synthetic */ void d(View view) {
        int i2 = 2 % 2;
        int i3 = f18085i + 81;
        f18084f = i3 % 128;
        int i4 = i3 % 2;
        a();
        if (i4 == 0) {
            int i5 = 40 / 0;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        az azVarC = az.c(layoutInflater, viewGroup);
        this.f18089d = azVarC;
        azVarC.f6984b.setText(getString(R.string.onboard_sdk_chat_with, this.f18087b));
        this.f18089d.f6985c.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f18088c = new ChatAdapter(((VideoConferenceActivity) getActivity()).getChatMessages(), this.f18091h);
        this.f18089d.f6985c.setAdapter(this.f18088c);
        this.f18089d.f6986d.addTextChangedListener(new TextWatcher() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferenceChatFragment.2

            /* JADX INFO: renamed from: a */
            private static int f18092a = 0;

            /* JADX INFO: renamed from: c */
            private static int f18093c = 1;

            AnonymousClass2() {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i22, int i3, int i4) {
                int i5 = 2 % 2;
                if (charSequence.toString().trim().length() != 0) {
                    VideoConferenceChatFragment.this.f18089d.f6983a.setEnabled(true);
                    VideoConferenceChatFragment.this.f18089d.f6983a.setTextColor(ContextCompat.getColor(VideoConferenceChatFragment.this.getActivity(), R.color.onboard_sdk_TextColorDefault));
                    int i6 = f18092a + 83;
                    f18093c = i6 % 128;
                    if (i6 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i7 = f18093c + 111;
                f18092a = i7 % 128;
                int i8 = i7 % 2;
                VideoConferenceChatFragment.this.f18089d.f6983a.setEnabled(false);
                VideoConferenceChatFragment.this.f18089d.f6983a.setTextColor(ContextCompat.getColor(VideoConferenceChatFragment.this.getActivity(), R.color.onboard_sdk_TextColorDisabled));
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i22, int i3, int i4) {
                int i5 = 2 % 2;
                int i6 = f18093c + 95;
                f18092a = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                int i22 = 2 % 2;
                int i3 = f18093c + 15;
                f18092a = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 33 / 0;
                }
            }
        });
        this.f18089d.f6983a.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferenceChatFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoConferenceChatFragment.m8596xd0e31f79(this.f$0, view);
            }
        });
        ConstraintLayout constraintLayoutE = this.f18089d.e();
        int i3 = f18084f + 75;
        f18085i = i3 % 128;
        if (i3 % 2 == 0) {
            return constraintLayoutE;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ void b(Boolean bool) throws Exception {
        int i2 = 2 % 2;
        int i3 = f18085i + 101;
        f18084f = i3 % 128;
        int i4 = i3 % 2;
        Timber.d("New message in the chat list", new Object[0]);
        this.f18088c.onNewChatMessage();
        this.f18089d.f6985c.scrollToPosition(this.f18090e.size() - 1);
        int i5 = f18085i + 15;
        f18084f = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        int i2 = 2 % 2;
        int i3 = f18085i + 73;
        f18084f = i3 % 128;
        int i4 = i3 % 2;
        super.onStart();
        VideoConferenceActivity videoConferenceActivity = (VideoConferenceActivity) getActivity();
        this.f18090e = videoConferenceActivity.getChatMessages();
        this.f18086a.add(videoConferenceActivity.getNewChatMessagePublishSubject().subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferenceChatFragment$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.b((Boolean) obj);
            }
        }));
        int i5 = f18084f + 33;
        f18085i = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        int i2 = 2 % 2;
        int i3 = f18085i + 11;
        f18084f = i3 % 128;
        int i4 = i3 % 2;
        super.onStop();
        this.f18086a.clear();
        int i5 = f18084f + 83;
        f18085i = i5 % 128;
        int i6 = i5 % 2;
    }

    private void a() {
        int i2 = 2 % 2;
        ((VideoConferenceActivity) getActivity()).getUserChatPublishSubject().onNext(new VideoConferenceChatMessage(this.f18089d.f6986d.getText().toString(), new Date().getTime(), VideoConferenceChatMessageAuthor.user));
        this.f18089d.f6986d.setText("");
        int i3 = f18085i + 59;
        f18084f = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
