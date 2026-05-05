package com.incode.welcome_sdk.data;

/* JADX INFO: loaded from: classes5.dex */
public class TemplateModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7585a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f7586b = 1;
    String template;
    String templateId;

    public TemplateModel() {
    }

    public TemplateModel(String str, String str2) {
        this.templateId = str;
        this.template = str2;
    }

    public String getTemplateId() {
        int i2 = 2 % 2;
        int i3 = f7586b + 77;
        int i4 = i3 % 128;
        f7585a = i4;
        int i5 = i3 % 2;
        String str = this.templateId;
        int i6 = i4 + 59;
        f7586b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public void setTemplateId(String str) {
        int i2 = 2 % 2;
        int i3 = f7586b + 67;
        int i4 = i3 % 128;
        f7585a = i4;
        if (i3 % 2 == 0) {
            this.templateId = str;
            int i5 = i4 + 103;
            f7586b = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        this.templateId = str;
        throw null;
    }

    public String getTemplate() {
        int i2 = 2 % 2;
        int i3 = f7585a + 19;
        f7586b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.template;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setTemplate(String str) {
        int i2 = 2 % 2;
        int i3 = f7585a + 97;
        int i4 = i3 % 128;
        f7586b = i4;
        int i5 = i3 % 2;
        this.template = str;
        int i6 = i4 + 15;
        f7585a = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("TemplateModel{templateId='").append(this.templateId).append("', template='").append(this.template).append("'}").toString();
        int i3 = f7585a + 103;
        f7586b = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 25 / 0;
        }
        return string;
    }
}
