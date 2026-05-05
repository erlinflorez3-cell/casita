package y0;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class match extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public match() {
        super(survey.DEFAULT_INSTANCE);
    }

    public final match a(long j2) {
        copyOnWrite();
        survey surveyVar = (survey) this.instance;
        surveyVar.bitField0_ |= 1;
        surveyVar.creationTimestamp_ = j2;
        return this;
    }

    public final match a(constitutional constitutionalVar) {
        copyOnWrite();
        survey surveyVar = (survey) this.instance;
        surveyVar.getClass();
        constitutionalVar.getClass();
        surveyVar.value_ = constitutionalVar;
        surveyVar.valueCase_ = 7;
        return this;
    }

    public final match a(dine dineVar) {
        copyOnWrite();
        survey surveyVar = (survey) this.instance;
        surveyVar.getClass();
        dineVar.getClass();
        surveyVar.value_ = dineVar;
        surveyVar.valueCase_ = 2;
        return this;
    }

    public final match a(inspire inspireVar) {
        copyOnWrite();
        survey surveyVar = (survey) this.instance;
        surveyVar.getClass();
        inspireVar.getClass();
        surveyVar.value_ = inspireVar;
        surveyVar.valueCase_ = 10;
        return this;
    }

    public final match a(professor professorVar) {
        copyOnWrite();
        survey surveyVar = (survey) this.instance;
        surveyVar.getClass();
        professorVar.getClass();
        surveyVar.value_ = professorVar;
        surveyVar.valueCase_ = 5;
        return this;
    }

    public final match a(reporter reporterVar) {
        copyOnWrite();
        survey surveyVar = (survey) this.instance;
        free freeVar = (free) reporterVar.build();
        surveyVar.getClass();
        freeVar.getClass();
        surveyVar.value_ = freeVar;
        surveyVar.valueCase_ = 12;
        return this;
    }

    public final match a(stain stainVar) {
        copyOnWrite();
        survey surveyVar = (survey) this.instance;
        surveyVar.getClass();
        stainVar.getClass();
        surveyVar.value_ = stainVar;
        surveyVar.valueCase_ = 1;
        return this;
    }

    public final match a(wage wageVar) {
        copyOnWrite();
        survey surveyVar = (survey) this.instance;
        surveyVar.getClass();
        wageVar.getClass();
        surveyVar.value_ = wageVar;
        surveyVar.valueCase_ = 9;
        return this;
    }

    public final void a(clean cleanVar) {
        copyOnWrite();
        survey surveyVar = (survey) this.instance;
        surveyVar.getClass();
        cleanVar.getClass();
        surveyVar.deviceContext_ = cleanVar;
        surveyVar.bitField0_ |= 2;
    }
}
