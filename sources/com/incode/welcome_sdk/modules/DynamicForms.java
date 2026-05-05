package com.incode.welcome_sdk.modules;

import android.os.Parcel;
import android.os.Parcelable;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class DynamicForms extends BaseModule implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DynamicForms> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10471a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10472b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10473c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10474e = 1;
    private final List<Screen> screens;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicForms(List<Screen> list) {
        super(Modules.DYNAMIC_FORMS);
        Intrinsics.checkNotNullParameter(list, "");
        this.screens = list;
    }

    public final List<Screen> getScreens() {
        int i2 = 2 % 2;
        int i3 = f10473c + 39;
        int i4 = i3 % 128;
        f10471a = i4;
        int i5 = i3 % 2;
        List<Screen> list = this.screens;
        int i6 = i4 + 55;
        f10473c = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    public static final class Screen extends BaseModule implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Screen> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10486b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10487c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10488d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10489e = 1;
        private final boolean hideTitle;
        private final List<Question> questions;
        private final String title;

        public final String getTitle() {
            int i2 = 2 % 2;
            int i3 = f10489e;
            int i4 = i3 + 73;
            f10488d = i4 % 128;
            int i5 = i4 % 2;
            String str = this.title;
            int i6 = i3 + 25;
            f10488d = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public final boolean getHideTitle() {
            int i2 = 2 % 2;
            int i3 = f10488d;
            int i4 = i3 + 55;
            f10489e = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z2 = this.hideTitle;
            int i5 = i3 + 19;
            f10489e = i5 % 128;
            int i6 = i5 % 2;
            return z2;
        }

        public final List<Question> getQuestions() {
            int i2 = 2 % 2;
            int i3 = f10488d + 111;
            f10489e = i3 % 128;
            if (i3 % 2 != 0) {
                return this.questions;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Screen(String str, boolean z2, List<Question> list) {
            super(Modules.DYNAMIC_FORMS);
            Intrinsics.checkNotNullParameter(list, "");
            this.title = str;
            this.hideTitle = z2;
            this.questions = list;
        }

        public static final class Question implements Parcelable {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Question> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f10490b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f10491c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f10492d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f10493e = 0;
            private final String id;
            private final InputType inputType;
            private final List<String> options;
            private final PredefinedInputType predefinedQuestionType;
            private final String questionText;

            public Question(String str, String str2, InputType inputType, PredefinedInputType predefinedInputType, List<String> list) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(inputType, "");
                Intrinsics.checkNotNullParameter(predefinedInputType, "");
                Intrinsics.checkNotNullParameter(list, "");
                this.id = str;
                this.questionText = str2;
                this.inputType = inputType;
                this.predefinedQuestionType = predefinedInputType;
                this.options = list;
            }

            public final String getId() {
                int i2 = 2 % 2;
                int i3 = f10493e + 11;
                int i4 = i3 % 128;
                f10492d = i4;
                int i5 = i3 % 2;
                String str = this.id;
                int i6 = i4 + 121;
                f10493e = i6 % 128;
                int i7 = i6 % 2;
                return str;
            }

            public final String getQuestionText() {
                int i2 = 2 % 2;
                int i3 = f10493e + 31;
                int i4 = i3 % 128;
                f10492d = i4;
                int i5 = i3 % 2;
                String str = this.questionText;
                int i6 = i4 + 29;
                f10493e = i6 % 128;
                if (i6 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            public final InputType getInputType() {
                int i2 = 2 % 2;
                int i3 = f10492d + 59;
                f10493e = i3 % 128;
                if (i3 % 2 == 0) {
                    return this.inputType;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final PredefinedInputType getPredefinedQuestionType() {
                int i2 = 2 % 2;
                int i3 = f10492d + 31;
                int i4 = i3 % 128;
                f10493e = i4;
                if (i3 % 2 != 0) {
                    throw null;
                }
                PredefinedInputType predefinedInputType = this.predefinedQuestionType;
                int i5 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f10492d = i5 % 128;
                int i6 = i5 % 2;
                return predefinedInputType;
            }

            public /* synthetic */ Question(String str, String str2, InputType inputType, PredefinedInputType predefinedInputType, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, inputType, predefinedInputType, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list);
            }

            public final List<String> getOptions() {
                int i2 = 2 % 2;
                int i3 = f10492d + 75;
                int i4 = i3 % 128;
                f10493e = i4;
                int i5 = i3 % 2;
                List<String> list = this.options;
                int i6 = i4 + 45;
                f10492d = i6 % 128;
                int i7 = i6 % 2;
                return list;
            }

            static {
                int i2 = f10491c + 121;
                f10490b = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Question(String str, String str2, InputType inputType, PredefinedInputType predefinedInputType) {
                this(str, str2, inputType, predefinedInputType, null, 16, null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(inputType, "");
                Intrinsics.checkNotNullParameter(predefinedInputType, "");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i2) {
                int i3 = 2 % 2;
                int i4 = f10493e + 49;
                f10492d = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.id);
                parcel.writeString(this.questionText);
                parcel.writeString(this.inputType.name());
                parcel.writeString(this.predefinedQuestionType.name());
                parcel.writeStringList(this.options);
                int i6 = f10493e + 53;
                f10492d = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i2 = 2 % 2;
                int i3 = f10493e;
                int i4 = i3 + 23;
                f10492d = i4 % 128;
                int i5 = i4 % 2 == 0 ? 1 : 0;
                int i6 = i3 + 109;
                f10492d = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 65 / 0;
                }
                return i5;
            }

            public final boolean equals(Object obj) {
                int i2 = 2 % 2;
                int i3 = f10493e + 59;
                int i4 = i3 % 128;
                f10492d = i4;
                int i5 = i3 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Question)) {
                    int i6 = i4 + 49;
                    f10493e = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                Question question = (Question) obj;
                if (!Intrinsics.areEqual(this.id, question.id) || !Intrinsics.areEqual(this.questionText, question.questionText) || this.inputType != question.inputType || this.predefinedQuestionType != question.predefinedQuestionType) {
                    return false;
                }
                if (!(!Intrinsics.areEqual(this.options, question.options))) {
                    return true;
                }
                int i8 = f10493e + 11;
                f10492d = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }

            public final int hashCode() {
                int i2 = 2 % 2;
                int i3 = f10493e + 91;
                f10492d = i3 % 128;
                int i4 = i3 % 2;
                int iHashCode = (((((((this.id.hashCode() * 31) + this.questionText.hashCode()) * 31) + this.inputType.hashCode()) * 31) + this.predefinedQuestionType.hashCode()) * 31) + this.options.hashCode();
                int i5 = f10492d + 121;
                f10493e = i5 % 128;
                if (i5 % 2 == 0) {
                    return iHashCode;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final String toString() {
                int i2 = 2 % 2;
                int i3 = f10493e + 65;
                f10492d = i3 % 128;
                if (i3 % 2 == 0) {
                    String str = "Question(id=" + this.id + ", questionText=" + this.questionText + ", inputType=" + this.inputType + ", predefinedQuestionType=" + this.predefinedQuestionType + ", options=" + this.options + ")";
                    throw null;
                }
                String str2 = "Question(id=" + this.id + ", questionText=" + this.questionText + ", inputType=" + this.inputType + ", predefinedQuestionType=" + this.predefinedQuestionType + ", options=" + this.options + ")";
                int i4 = f10493e + 45;
                f10492d = i4 % 128;
                if (i4 % 2 != 0) {
                    return str2;
                }
                throw null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Question copy$default(Question question, String str, String str2, InputType inputType, PredefinedInputType predefinedInputType, List list, int i2, Object obj) {
                int i3 = 2 % 2;
                if ((i2 & 1) != 0) {
                    int i4 = f10492d + 11;
                    f10493e = i4 % 128;
                    int i5 = i4 % 2;
                    str = question.id;
                }
                if ((i2 & 2) != 0) {
                    str2 = question.questionText;
                }
                if ((i2 & 4) != 0) {
                    int i6 = f10493e;
                    int i7 = i6 + 87;
                    f10492d = i7 % 128;
                    int i8 = i7 % 2;
                    inputType = question.inputType;
                    int i9 = i6 + 67;
                    f10492d = i9 % 128;
                    int i10 = i9 % 2;
                }
                if ((i2 & 8) != 0) {
                    int i11 = f10493e + 61;
                    f10492d = i11 % 128;
                    if (i11 % 2 == 0) {
                        predefinedInputType = question.predefinedQuestionType;
                        int i12 = 93 / 0;
                    } else {
                        predefinedInputType = question.predefinedQuestionType;
                    }
                }
                if ((i2 & 16) != 0) {
                    list = question.options;
                    int i13 = f10492d + 111;
                    f10493e = i13 % 128;
                    int i14 = i13 % 2;
                }
                return question.copy(str, str2, inputType, predefinedInputType, list);
            }

            public static final class a implements Parcelable.Creator<Question> {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f10494d = 0;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private static int f10495e = 1;

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Question createFromParcel(Parcel parcel) {
                    int i2 = 2 % 2;
                    int i3 = f10495e + 1;
                    f10494d = i3 % 128;
                    if (i3 % 2 == 0) {
                        return d(parcel);
                    }
                    d(parcel);
                    throw null;
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Question[] newArray(int i2) {
                    int i3 = 2 % 2;
                    int i4 = f10495e + 83;
                    f10494d = i4 % 128;
                    int i5 = i4 % 2;
                    Question[] questionArrA = a(i2);
                    int i6 = f10494d + 45;
                    f10495e = i6 % 128;
                    int i7 = i6 % 2;
                    return questionArrA;
                }

                private static Question d(Parcel parcel) {
                    int i2 = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    Question question = new Question(parcel.readString(), parcel.readString(), InputType.valueOf(parcel.readString()), PredefinedInputType.valueOf(parcel.readString()), parcel.createStringArrayList());
                    int i3 = f10495e + 81;
                    f10494d = i3 % 128;
                    if (i3 % 2 == 0) {
                        return question;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                private static Question[] a(int i2) {
                    int i3 = 2 % 2;
                    int i4 = f10495e;
                    int i5 = i4 + 121;
                    f10494d = i5 % 128;
                    int i6 = i5 % 2;
                    Question[] questionArr = new Question[i2];
                    int i7 = i4 + 61;
                    f10494d = i7 % 128;
                    int i8 = i7 % 2;
                    return questionArr;
                }
            }

            public final Question copy(String str, String str2, InputType inputType, PredefinedInputType predefinedInputType, List<String> list) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(inputType, "");
                Intrinsics.checkNotNullParameter(predefinedInputType, "");
                Intrinsics.checkNotNullParameter(list, "");
                Question question = new Question(str, str2, inputType, predefinedInputType, list);
                int i3 = f10492d + 123;
                f10493e = i3 % 128;
                if (i3 % 2 == 0) {
                    return question;
                }
                throw null;
            }

            public final List<String> component5() {
                int i2 = 2 % 2;
                int i3 = f10492d;
                int i4 = i3 + 39;
                f10493e = i4 % 128;
                if (i4 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                List<String> list = this.options;
                int i5 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f10493e = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 69 / 0;
                }
                return list;
            }

            public final PredefinedInputType component4() {
                int i2 = 2 % 2;
                int i3 = f10492d + 115;
                int i4 = i3 % 128;
                f10493e = i4;
                if (i3 % 2 != 0) {
                    throw null;
                }
                PredefinedInputType predefinedInputType = this.predefinedQuestionType;
                int i5 = i4 + 97;
                f10492d = i5 % 128;
                int i6 = i5 % 2;
                return predefinedInputType;
            }

            public final InputType component3() {
                int i2 = 2 % 2;
                int i3 = f10492d;
                int i4 = i3 + 7;
                f10493e = i4 % 128;
                Object obj = null;
                if (i4 % 2 != 0) {
                    throw null;
                }
                InputType inputType = this.inputType;
                int i5 = i3 + 111;
                f10493e = i5 % 128;
                if (i5 % 2 == 0) {
                    return inputType;
                }
                obj.hashCode();
                throw null;
            }

            public final String component2() {
                int i2 = 2 % 2;
                int i3 = f10492d;
                int i4 = i3 + 81;
                f10493e = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                String str = this.questionText;
                int i5 = i3 + 19;
                f10493e = i5 % 128;
                int i6 = i5 % 2;
                return str;
            }

            public final String component1() {
                int i2 = 2 % 2;
                int i3 = f10493e + 97;
                f10492d = i3 % 128;
                if (i3 % 2 != 0) {
                    return this.id;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static final class a implements Parcelable.Creator<Screen> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f10496c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f10497d = 0;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Screen createFromParcel(Parcel parcel) {
                int i2 = 2 % 2;
                int i3 = f10497d + 15;
                f10496c = i3 % 128;
                int i4 = i3 % 2;
                Screen screenC = c(parcel);
                int i5 = f10497d + 45;
                f10496c = i5 % 128;
                int i6 = i5 % 2;
                return screenC;
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Screen[] newArray(int i2) {
                int i3 = 2 % 2;
                int i4 = f10496c + 99;
                f10497d = i4 % 128;
                if (i4 % 2 != 0) {
                    d(i2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Screen[] screenArrD = d(i2);
                int i5 = f10497d + 1;
                f10496c = i5 % 128;
                int i6 = i5 % 2;
                return screenArrD;
            }

            private static Screen c(Parcel parcel) {
                boolean z2;
                int i2 = 2 % 2;
                int i3 = f10496c + 95;
                f10497d = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                int i5 = 0;
                if (parcel.readInt() != 0) {
                    int i6 = f10497d + 115;
                    f10496c = i6 % 128;
                    int i7 = i6 % 2;
                    z2 = true;
                } else {
                    int i8 = f10496c + 67;
                    f10497d = i8 % 128;
                    int i9 = i8 % 2;
                    z2 = false;
                }
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                while (i5 != i10) {
                    int i11 = f10497d + 19;
                    f10496c = i11 % 128;
                    if (i11 % 2 == 0) {
                        arrayList.add(Question.CREATOR.createFromParcel(parcel));
                        i5 /= 0;
                    } else {
                        arrayList.add(Question.CREATOR.createFromParcel(parcel));
                        i5++;
                    }
                }
                return new Screen(string, z2, arrayList);
            }

            private static Screen[] d(int i2) {
                int i3 = 2 % 2;
                int i4 = f10497d + 41;
                f10496c = i4 % 128;
                Screen[] screenArr = new Screen[i2];
                if (i4 % 2 != 0) {
                    return screenArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        static {
            int i2 = f10486b + 95;
            f10487c = i2 % 128;
            int i3 = i2 % 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
        @Override // android.os.Parcelable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void writeToParcel(android.os.Parcel r5, int r6) {
            /*
                r4 = this;
                r3 = 2
                int r0 = r3 % r3
                int r0 = com.incode.welcome_sdk.modules.DynamicForms.Screen.f10489e
                int r1 = r0 + 79
                int r0 = r1 % 128
                com.incode.welcome_sdk.modules.DynamicForms.Screen.f10488d = r0
                int r1 = r1 % r3
                r2 = 0
                java.lang.String r0 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                if (r1 == 0) goto L4d
                java.lang.String r0 = r4.title
                r5.writeString(r0)
                boolean r1 = r4.hideTitle
                r0 = 11
                int r0 = r0 / r2
                if (r1 == 0) goto L21
            L20:
                r2 = 1
            L21:
                r5.writeInt(r2)
                java.util.List<com.incode.welcome_sdk.modules.DynamicForms$Screen$Question> r1 = r4.questions
                int r0 = r1.size()
                r5.writeInt(r0)
                java.util.Iterator r1 = r1.iterator()
            L31:
                boolean r0 = r1.hasNext()
                if (r0 != 0) goto L43
                int r0 = com.incode.welcome_sdk.modules.DynamicForms.Screen.f10489e
                int r1 = r0 + 35
                int r0 = r1 % 128
                com.incode.welcome_sdk.modules.DynamicForms.Screen.f10488d = r0
                int r1 = r1 % r3
                if (r1 != 0) goto L57
                return
            L43:
                java.lang.Object r0 = r1.next()
                com.incode.welcome_sdk.modules.DynamicForms$Screen$Question r0 = (com.incode.welcome_sdk.modules.DynamicForms.Screen.Question) r0
                r0.writeToParcel(r5, r6)
                goto L31
            L4d:
                java.lang.String r0 = r4.title
                r5.writeString(r0)
                boolean r0 = r4.hideTitle
                if (r0 == 0) goto L21
                goto L20
            L57:
                r0 = 0
                r0.hashCode()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.modules.DynamicForms.Screen.writeToParcel(android.os.Parcel, int):void");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i2 = 2 % 2;
            int i3 = f10489e + 121;
            int i4 = i3 % 128;
            f10488d = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 35;
            f10489e = i6 % 128;
            if (i6 % 2 != 0) {
                return 0;
            }
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InputType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InputType[] $VALUES;
        public static final c Companion;
        public static final InputType NUMBER = new InputType("NUMBER", 0);
        public static final InputType CPF = new InputType("CPF", 1);
        public static final InputType COUNTRY = new InputType("COUNTRY", 2);
        public static final InputType DATE = new InputType("DATE", 3);
        public static final InputType PHONE = new InputType("PHONE", 4);
        public static final InputType EMAIL = new InputType("EMAIL", 5);
        public static final InputType TEXT = new InputType("TEXT", 6);
        public static final InputType YESNO = new InputType("YESNO", 7);
        public static final InputType SELECT = new InputType("SELECT", 8);

        private static final /* synthetic */ InputType[] $values() {
            return new InputType[]{NUMBER, CPF, COUNTRY, DATE, PHONE, EMAIL, TEXT, YESNO, SELECT};
        }

        public static EnumEntries<InputType> getEntries() {
            return $ENTRIES;
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }

        private InputType(String str, int i2) {
        }

        static {
            InputType[] inputTypeArr$values = $values();
            $VALUES = inputTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(inputTypeArr$values);
            Companion = new c(null);
        }

        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f10479a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f10480b = 1;

            private c() {
            }

            public static InputType d(String str) {
                InputType[] inputTypeArrValues;
                int length;
                int i2;
                int i3 = 2 % 2;
                int i4 = f10480b + 15;
                f10479a = i4 % 128;
                if (i4 % 2 != 0) {
                    inputTypeArrValues = InputType.values();
                    length = inputTypeArrValues.length;
                    i2 = 1;
                } else {
                    inputTypeArrValues = InputType.values();
                    length = inputTypeArrValues.length;
                    i2 = 0;
                }
                while (i2 < length) {
                    int i5 = f10480b + 17;
                    f10479a = i5 % 128;
                    int i6 = i5 % 2;
                    InputType inputType = inputTypeArrValues[i2];
                    if (Intrinsics.areEqual(inputType.name(), str)) {
                        int i7 = f10480b + 97;
                        f10479a = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i8 = 39 / 0;
                        }
                        return inputType;
                    }
                    i2++;
                }
                return null;
            }

            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PredefinedInputType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PredefinedInputType[] $VALUES;
        public static final b Companion;
        public static final PredefinedInputType NUMBER = new PredefinedInputType("NUMBER", 0);
        public static final PredefinedInputType CPF = new PredefinedInputType("CPF", 1);
        public static final PredefinedInputType COUNTRY = new PredefinedInputType("COUNTRY", 2);
        public static final PredefinedInputType NATIONALITY = new PredefinedInputType("NATIONALITY", 3);
        public static final PredefinedInputType DATE = new PredefinedInputType("DATE", 4);
        public static final PredefinedInputType PHONE = new PredefinedInputType("PHONE", 5);
        public static final PredefinedInputType EMAIL = new PredefinedInputType("EMAIL", 6);
        public static final PredefinedInputType TEXT = new PredefinedInputType("TEXT", 7);
        public static final PredefinedInputType YESNO = new PredefinedInputType("YESNO", 8);
        public static final PredefinedInputType NAME = new PredefinedInputType("NAME", 9);
        public static final PredefinedInputType FIRST_NAME = new PredefinedInputType("FIRST_NAME", 10);
        public static final PredefinedInputType LAST_NAME = new PredefinedInputType("LAST_NAME", 11);
        public static final PredefinedInputType SELECT = new PredefinedInputType("SELECT", 12);
        public static final PredefinedInputType NONE = new PredefinedInputType("NONE", 13);

        private static final /* synthetic */ PredefinedInputType[] $values() {
            return new PredefinedInputType[]{NUMBER, CPF, COUNTRY, NATIONALITY, DATE, PHONE, EMAIL, TEXT, YESNO, NAME, FIRST_NAME, LAST_NAME, SELECT, NONE};
        }

        public static EnumEntries<PredefinedInputType> getEntries() {
            return $ENTRIES;
        }

        public static PredefinedInputType valueOf(String str) {
            return (PredefinedInputType) Enum.valueOf(PredefinedInputType.class, str);
        }

        public static PredefinedInputType[] values() {
            return (PredefinedInputType[]) $VALUES.clone();
        }

        private PredefinedInputType(String str, int i2) {
        }

        static {
            PredefinedInputType[] predefinedInputTypeArr$values = $values();
            $VALUES = predefinedInputTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(predefinedInputTypeArr$values);
            Companion = new b(null);
        }

        public static final class b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f10484b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f10485c = 1;

            private b() {
            }

            public static PredefinedInputType b(String str) {
                PredefinedInputType predefinedInputType;
                int i2 = 2 % 2;
                int i3 = f10485c + 53;
                f10484b = i3 % 128;
                int i4 = i3 % 2;
                PredefinedInputType[] predefinedInputTypeArrValues = PredefinedInputType.values();
                int length = predefinedInputTypeArrValues.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        predefinedInputType = null;
                        break;
                    }
                    int i6 = f10485c + 41;
                    f10484b = i6 % 128;
                    if (i6 % 2 != 0) {
                        predefinedInputType = predefinedInputTypeArrValues[i5];
                        int i7 = 9 / 0;
                        if (Intrinsics.areEqual(predefinedInputType.name(), str)) {
                            break;
                        }
                        i5++;
                    } else {
                        predefinedInputType = predefinedInputTypeArrValues[i5];
                        if (Intrinsics.areEqual(predefinedInputType.name(), str)) {
                            break;
                        }
                        i5++;
                    }
                }
                if (predefinedInputType == null) {
                    predefinedInputType = PredefinedInputType.NONE;
                }
                int i8 = f10485c + 61;
                f10484b = i8 % 128;
                int i9 = i8 % 2;
                return predefinedInputType;
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final boolean isName() {
            int i2 = a.f10481a[ordinal()];
            return i2 == 1 || i2 == 2 || i2 == 3;
        }

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f10481a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f10482c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f10483e = 0;

            static {
                int[] iArr = new int[PredefinedInputType.values().length];
                try {
                    iArr[PredefinedInputType.NAME.ordinal()] = 1;
                    int i2 = 2 % 2;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PredefinedInputType.FIRST_NAME.ordinal()] = 2;
                    int i3 = f10482c + 1;
                    f10483e = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PredefinedInputType.LAST_NAME.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f10481a = iArr;
                int i5 = f10482c + 75;
                f10483e = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 96 / 0;
                }
            }
        }
    }

    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10475a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10476b = 81 % 128;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10477c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10478e = 1;
        private List<Screen> screens = new ArrayList();

        public final Builder addScreen(Screen screen) {
            int i2 = 2 % 2;
            int i3 = f10478e + 13;
            f10475a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(screen, "");
            this.screens.add(screen);
            int i5 = f10478e + 101;
            f10475a = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder addScreens(List<Screen> list) {
            int i2 = 2 % 2;
            int i3 = f10478e + 33;
            f10475a = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(list, "");
                this.screens.addAll(list);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(list, "");
            this.screens.addAll(list);
            int i4 = f10478e + 79;
            f10475a = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            obj.hashCode();
            throw null;
        }

        public final DynamicForms build() {
            int i2 = 2 % 2;
            DynamicForms dynamicForms = new DynamicForms(this.screens);
            int i3 = f10475a + 125;
            f10478e = i3 % 128;
            if (i3 % 2 != 0) {
                return dynamicForms;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            if (81 % 2 == 0) {
                int i2 = 89 / 0;
            }
        }
    }

    public static final class b implements Parcelable.Creator<DynamicForms> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10498b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10499c = 0;

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DynamicForms createFromParcel(Parcel parcel) {
            int i2 = 2 % 2;
            int i3 = f10499c + 85;
            f10498b = i3 % 128;
            int i4 = i3 % 2;
            DynamicForms dynamicFormsE = e(parcel);
            int i5 = f10499c + 115;
            f10498b = i5 % 128;
            int i6 = i5 % 2;
            return dynamicFormsE;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DynamicForms[] newArray(int i2) {
            int i3 = 2 % 2;
            int i4 = f10499c + 1;
            f10498b = i4 % 128;
            int i5 = i4 % 2;
            DynamicForms[] dynamicFormsArrB = b(i2);
            int i6 = f10499c + 51;
            f10498b = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 35 / 0;
            }
            return dynamicFormsArrB;
        }

        private static DynamicForms e(Parcel parcel) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            int i4 = f10498b + 7;
            f10499c = i4 % 128;
            int i5 = i4 % 2;
            for (int i6 = 0; i6 != i3; i6++) {
                int i7 = f10498b + 115;
                f10499c = i7 % 128;
                int i8 = i7 % 2;
                arrayList.add(Screen.CREATOR.createFromParcel(parcel));
            }
            return new DynamicForms(arrayList);
        }

        private static DynamicForms[] b(int i2) {
            int i3 = 2 % 2;
            int i4 = f10498b + 81;
            int i5 = i4 % 128;
            f10499c = i5;
            int i6 = i4 % 2;
            DynamicForms[] dynamicFormsArr = new DynamicForms[i2];
            int i7 = i5 + 105;
            f10498b = i7 % 128;
            int i8 = i7 % 2;
            return dynamicFormsArr;
        }
    }

    static {
        int i2 = f10474e + 49;
        f10472b = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = 2 % 2;
        int i4 = f10473c + 19;
        f10471a = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(parcel, "");
        if (i5 == 0) {
            List<Screen> list = this.screens;
            parcel.writeInt(list.size());
            list.iterator();
            throw null;
        }
        List<Screen> list2 = this.screens;
        parcel.writeInt(list2.size());
        Iterator<Screen> it = list2.iterator();
        int i6 = f10473c + 117;
        f10471a = i6 % 128;
        int i7 = i6 % 2;
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i2);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i2 = 2 % 2;
        int i3 = f10471a + 15;
        int i4 = i3 % 128;
        f10473c = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 95;
        f10471a = i6 % 128;
        int i7 = i6 % 2;
        return 0;
    }
}
