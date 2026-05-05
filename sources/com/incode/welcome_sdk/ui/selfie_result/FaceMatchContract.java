package com.incode.welcome_sdk.ui.selfie_result;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.results.FaceMatchResult;
import com.incode.welcome_sdk.ui.BasePresenter;
import com.incode.welcome_sdk.ui.BaseView;
import io.reactivex.Completable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface FaceMatchContract {

    public interface Presenter extends BasePresenter {
    }

    public interface View extends BaseView {
        void showLivenessCheckResult(boolean z2);

        void showProgressWithoutAnimation(boolean z2);

        void showResultAnimationMode(FaceMatchResult faceMatchResult);

        void showResultSubmitOnlyMode(FaceMatchResult faceMatchResult);

        Completable startAnimation();

        void updateViews(ViewState viewState);
    }

    public static final class ViewState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17362a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17363e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final State f17364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final State f17365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final State f17366d;

        public ViewState(State state, State state2, State state3) {
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(state2, "");
            this.f17365c = state;
            this.f17366d = state2;
            this.f17364b = state3;
        }

        public final State getLeft() {
            int i2 = 2 % 2;
            int i3 = f17363e + 53;
            f17362a = i3 % 128;
            int i4 = i3 % 2;
            State state = this.f17365c;
            if (i4 == 0) {
                int i5 = 45 / 0;
            }
            return state;
        }

        public final State getRight() {
            int i2 = 2 % 2;
            int i3 = f17363e;
            int i4 = i3 + 69;
            f17362a = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            State state = this.f17366d;
            int i5 = i3 + 117;
            f17362a = i5 % 128;
            if (i5 % 2 != 0) {
                return state;
            }
            throw null;
        }

        public final State getBottom() {
            int i2 = 2 % 2;
            int i3 = f17362a;
            int i4 = i3 + 111;
            f17363e = i4 % 128;
            int i5 = i4 % 2;
            State state = this.f17364b;
            int i6 = i3 + 45;
            f17363e = i6 % 128;
            if (i6 % 2 == 0) {
                return state;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            if (this == obj) {
                int i3 = f17362a + 31;
                f17363e = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 94 / 0;
                }
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            if (!Intrinsics.areEqual(this.f17365c, viewState.f17365c)) {
                return false;
            }
            if (Intrinsics.areEqual(this.f17366d, viewState.f17366d)) {
                return Intrinsics.areEqual(this.f17364b, viewState.f17364b);
            }
            int i5 = f17363e + 103;
            f17362a = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public final int hashCode() {
            int iHashCode;
            int i2 = 2 % 2;
            int i3 = f17363e + 111;
            f17362a = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode2 = ((this.f17365c.hashCode() * 31) + this.f17366d.hashCode()) * 31;
            State state = this.f17364b;
            if (state == null) {
                iHashCode = 0;
            } else {
                iHashCode = state.hashCode();
                int i5 = f17363e + 13;
                f17362a = i5 % 128;
                int i6 = i5 % 2;
            }
            int i7 = iHashCode2 + iHashCode;
            int i8 = f17363e + 5;
            f17362a = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 91 / 0;
            }
            return i7;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f17363e + 53;
            f17362a = i3 % 128;
            int i4 = i3 % 2;
            String str = "ViewState(left=" + this.f17365c + ", right=" + this.f17366d + ", bottom=" + this.f17364b + ")";
            int i5 = f17362a + 55;
            f17363e = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public static /* synthetic */ ViewState copy$default(ViewState viewState, State state, State state2, State state3, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = f17362a + 23;
            int i5 = i4 % 128;
            f17363e = i5;
            if (i4 % 2 == 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
                state = viewState.f17365c;
            }
            if ((i2 & 2) != 0) {
                int i6 = i5 + 91;
                f17362a = i6 % 128;
                int i7 = i6 % 2;
                state2 = viewState.f17366d;
            }
            if ((i2 & 4) != 0) {
                int i8 = i5 + 85;
                f17362a = i8 % 128;
                if (i8 % 2 == 0) {
                    State state4 = viewState.f17364b;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                state3 = viewState.f17364b;
            }
            ViewState viewStateCopy = viewState.copy(state, state2, state3);
            int i9 = f17363e + 75;
            f17362a = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 98 / 0;
            }
            return viewStateCopy;
        }

        public final ViewState copy(State state, State state2, State state3) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(state2, "");
            ViewState viewState = new ViewState(state, state2, state3);
            int i3 = f17363e + 57;
            f17362a = i3 % 128;
            if (i3 % 2 != 0) {
                return viewState;
            }
            throw null;
        }

        public final State component3() {
            int i2 = 2 % 2;
            int i3 = f17363e + 89;
            f17362a = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f17364b;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final State component2() {
            int i2 = 2 % 2;
            int i3 = f17362a + 49;
            f17363e = i3 % 128;
            int i4 = i3 % 2;
            State state = this.f17366d;
            if (i4 != 0) {
                int i5 = 15 / 0;
            }
            return state;
        }

        public final State component1() {
            int i2 = 2 % 2;
            int i3 = f17362a;
            int i4 = i3 + 51;
            f17363e = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            State state = this.f17365c;
            int i5 = i3 + 101;
            f17363e = i5 % 128;
            int i6 = i5 % 2;
            return state;
        }
    }

    public static final class State {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17358b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17359c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f17360a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Integer f17361d;

        public State(Integer num, String str) {
            this.f17361d = num;
            this.f17360a = str;
        }

        public final Integer getHeaderText() {
            int i2 = 2 % 2;
            int i3 = f17358b + 73;
            int i4 = i3 % 128;
            f17359c = i4;
            int i5 = i3 % 2;
            Integer num = this.f17361d;
            int i6 = i4 + 35;
            f17358b = i6 % 128;
            if (i6 % 2 != 0) {
                return num;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getPhotoPath() {
            int i2 = 2 % 2;
            int i3 = f17358b + 113;
            int i4 = i3 % 128;
            f17359c = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.f17360a;
            int i5 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f17358b = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f17358b + 77;
            int i4 = i3 % 128;
            f17359c = i4;
            Object obj2 = null;
            if (i3 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                int i5 = i4 + 111;
                f17358b = i5 % 128;
                if (i5 % 2 != 0) {
                    return true;
                }
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            if (Intrinsics.areEqual(this.f17361d, state.f17361d)) {
                return Intrinsics.areEqual(this.f17360a, state.f17360a);
            }
            int i6 = f17359c + 11;
            f17358b = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }

        public final int hashCode() {
            int i2;
            int i3 = 2 % 2;
            int i4 = f17358b + 45;
            f17359c = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            Integer num = this.f17361d;
            int iHashCode = 0;
            int iHashCode2 = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.f17360a;
            if (str == null) {
                i2 = f17359c + 99;
                f17358b = i2 % 128;
            } else {
                iHashCode = str.hashCode();
                i2 = f17358b + 13;
                f17359c = i2 % 128;
            }
            int i5 = i2 % 2;
            return iHashCode2 + iHashCode;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f17359c + 59;
            f17358b = i3 % 128;
            if (i3 % 2 != 0) {
                return "State(headerText=" + this.f17361d + ", photoPath=" + this.f17360a + ")";
            }
            String str = "State(headerText=" + this.f17361d + ", photoPath=" + this.f17360a + ")";
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ State copy$default(State state, Integer num, String str, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = f17358b;
            int i5 = i4 + 121;
            f17359c = i5 % 128;
            if (i5 % 2 == 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
                num = state.f17361d;
                int i6 = i4 + 107;
                f17359c = i6 % 128;
                int i7 = i6 % 2;
            }
            if ((i2 & 2) != 0) {
                str = state.f17360a;
            }
            return state.copy(num, str);
        }

        public final State copy(Integer num, String str) {
            int i2 = 2 % 2;
            State state = new State(num, str);
            int i3 = f17359c + 15;
            f17358b = i3 % 128;
            if (i3 % 2 != 0) {
                return state;
            }
            throw null;
        }

        public final String component2() {
            int i2 = 2 % 2;
            int i3 = f17359c + 115;
            f17358b = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f17360a;
            }
            throw null;
        }

        public final Integer component1() {
            int i2 = 2 % 2;
            int i3 = f17358b + 125;
            f17359c = i3 % 128;
            if (i3 % 2 == 0) {
                return this.f17361d;
            }
            throw null;
        }
    }
}
