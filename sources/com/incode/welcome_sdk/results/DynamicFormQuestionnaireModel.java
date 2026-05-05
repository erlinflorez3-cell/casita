package com.incode.welcome_sdk.results;

import android.os.SystemClock;
import com.incode.welcome_sdk.modules.DynamicForms;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class DynamicFormQuestionnaireModel {
    public static final int $stable = 0;
    private final DynamicForms.InputType inputType;
    private final String interviewId;
    private final String question;
    private final String questionId;
    private final AnswerModel selectedAnswer;

    public static /* synthetic */ DynamicFormQuestionnaireModel copy$default(DynamicFormQuestionnaireModel dynamicFormQuestionnaireModel, String str, String str2, String str3, DynamicForms.InputType inputType, AnswerModel answerModel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dynamicFormQuestionnaireModel.interviewId;
        }
        if ((i2 & 2) != 0) {
            str2 = dynamicFormQuestionnaireModel.questionId;
        }
        if ((i2 & 4) != 0) {
            str3 = dynamicFormQuestionnaireModel.question;
        }
        if ((i2 & 8) != 0) {
            inputType = dynamicFormQuestionnaireModel.inputType;
        }
        if ((i2 & 16) != 0) {
            answerModel = dynamicFormQuestionnaireModel.selectedAnswer;
        }
        return dynamicFormQuestionnaireModel.copy(str, str2, str3, inputType, answerModel);
    }

    public final String component1() {
        return this.interviewId;
    }

    public final String component2() {
        return this.questionId;
    }

    public final String component3() {
        return this.question;
    }

    public final DynamicForms.InputType component4() {
        return this.inputType;
    }

    public final AnswerModel component5() {
        return this.selectedAnswer;
    }

    public final DynamicFormQuestionnaireModel copy(String str, String questionId, String question, DynamicForms.InputType inputType, AnswerModel answerModel) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        return new DynamicFormQuestionnaireModel(str, questionId, question, inputType, answerModel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicFormQuestionnaireModel)) {
            return false;
        }
        DynamicFormQuestionnaireModel dynamicFormQuestionnaireModel = (DynamicFormQuestionnaireModel) obj;
        return Intrinsics.areEqual(this.interviewId, dynamicFormQuestionnaireModel.interviewId) && Intrinsics.areEqual(this.questionId, dynamicFormQuestionnaireModel.questionId) && Intrinsics.areEqual(this.question, dynamicFormQuestionnaireModel.question) && this.inputType == dynamicFormQuestionnaireModel.inputType && Intrinsics.areEqual(this.selectedAnswer, dynamicFormQuestionnaireModel.selectedAnswer);
    }

    public final int hashCode() {
        String str = this.interviewId;
        int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.questionId.hashCode()) * 31) + this.question.hashCode()) * 31) + this.inputType.hashCode()) * 31;
        AnswerModel answerModel = this.selectedAnswer;
        return iHashCode + (answerModel != null ? answerModel.hashCode() : 0);
    }

    public final String toString() {
        return "DynamicFormQuestionnaireModel(interviewId=" + this.interviewId + ", questionId=" + this.questionId + ", question=" + this.question + ", inputType=" + this.inputType + ", selectedAnswer=" + this.selectedAnswer + ")";
    }

    public DynamicFormQuestionnaireModel(String str, String questionId, String question, DynamicForms.InputType inputType, AnswerModel answerModel) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        this.interviewId = str;
        this.questionId = questionId;
        this.question = question;
        this.inputType = inputType;
        this.selectedAnswer = answerModel;
    }

    public final String getInterviewId() {
        return this.interviewId;
    }

    public final String getQuestionId() {
        return this.questionId;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final DynamicForms.InputType getInputType() {
        return this.inputType;
    }

    public final AnswerModel getSelectedAnswer() {
        return this.selectedAnswer;
    }

    public static final class AnswerModel {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a */
        public static int f10720a = 0;

        /* JADX INFO: renamed from: c */
        public static int f10721c = 0;
        private final String detail;

        public AnswerModel(String detail) {
            Intrinsics.checkNotNullParameter(detail, "detail");
            this.detail = detail;
        }

        public final String getDetail() {
            return this.detail;
        }

        public static int c() {
            int i2 = f10720a;
            int i3 = i2 % 9244838;
            f10720a = i2 + 1;
            if (i3 != 0) {
                return f10721c;
            }
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            f10721c = iElapsedRealtime;
            return iElapsedRealtime;
        }
    }
}
