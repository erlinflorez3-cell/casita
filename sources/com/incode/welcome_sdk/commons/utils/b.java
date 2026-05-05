package com.incode.welcome_sdk.commons.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import timber.log.Timber;
import yg.CX;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a */
    public static final b f6439a = new b();

    /* JADX INFO: renamed from: b */
    private static int f6440b = 1;

    /* JADX INFO: renamed from: c */
    private static int f6441c = 0;

    /* JADX INFO: renamed from: d */
    private static int f6442d = 0;

    /* JADX INFO: renamed from: e */
    private static int f6443e = 1;

    private b() {
    }

    public static final class a {

        /* JADX INFO: renamed from: f */
        private static int f6444f = 1;

        /* JADX INFO: renamed from: h */
        private static int f6445h = 0;

        /* JADX INFO: renamed from: a */
        private final Function1<View, Unit> f6446a;

        /* JADX INFO: renamed from: b */
        private final int f6447b;

        /* JADX INFO: renamed from: c */
        private final Function1<TextPaint, Unit> f6448c;

        /* JADX INFO: renamed from: d */
        private final String f6449d;

        /* JADX INFO: renamed from: e */
        private int f6450e;

        /* JADX INFO: renamed from: g */
        private final ClickableSpan f6451g;

        /* JADX INFO: renamed from: i */
        private int f6452i;

        /* JADX INFO: renamed from: j */
        private int f6453j;

        public /* synthetic */ a(String str, Function1 function1) {
            this(str, function1, null, 33);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private a(String str, Function1<? super View, Unit> function1, Function1<? super TextPaint, Unit> function12, int i2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.f6449d = str;
            this.f6446a = function1;
            this.f6448c = null;
            this.f6447b = 33;
            this.f6450e = -1;
            this.f6452i = -1;
            this.f6451g = new e();
        }

        public final String e() {
            int i2 = 2 % 2;
            int i3 = f6444f;
            int i4 = i3 + 21;
            f6445h = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                throw null;
            }
            String str = this.f6449d;
            int i5 = i3 + 35;
            f6445h = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        public final Function1<View, Unit> a() {
            int i2 = 2 % 2;
            int i3 = f6444f + 115;
            int i4 = i3 % 128;
            f6445h = i4;
            int i5 = i3 % 2;
            Function1<View, Unit> function1 = this.f6446a;
            int i6 = i4 + 113;
            f6444f = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 88 / 0;
            }
            return function1;
        }

        public final Function1<TextPaint, Unit> b() {
            int i2 = 2 % 2;
            int i3 = f6444f + 59;
            int i4 = i3 % 128;
            f6445h = i4;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Function1<TextPaint, Unit> function1 = this.f6448c;
            int i5 = i4 + 107;
            f6444f = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int d() {
            int i2 = 2 % 2;
            int i3 = f6444f + 19;
            int i4 = i3 % 128;
            f6445h = i4;
            int i5 = i3 % 2;
            int i6 = this.f6447b;
            int i7 = i4 + 113;
            f6444f = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        public final int c() {
            int i2 = 2 % 2;
            int i3 = f6445h + 27;
            int i4 = i3 % 128;
            f6444f = i4;
            int i5 = i3 % 2;
            int i6 = this.f6450e;
            int i7 = i4 + 37;
            f6445h = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        public final int g() {
            int i2 = 2 % 2;
            int i3 = f6444f + 43;
            f6445h = i3 % 128;
            if (i3 % 2 == 0) {
                return this.f6452i;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final class e extends ClickableSpan {

            /* JADX INFO: renamed from: b */
            private static int f6454b = 1;

            /* JADX INFO: renamed from: c */
            private static int f6455c = 0;

            e() {
            }

            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = f6454b + 125;
                f6455c = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(view, "");
                    view.cancelPendingInputEvents();
                    a.this.a().invoke(view);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(view, "");
                view.cancelPendingInputEvents();
                a.this.a().invoke(view);
                int i4 = f6455c + 125;
                f6454b = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x001f A[PHI: r1
  0x001f: PHI (r1v5 kotlin.jvm.functions.Function1<android.text.TextPaint, kotlin.Unit>) = 
  (r1v2 kotlin.jvm.functions.Function1<android.text.TextPaint, kotlin.Unit>)
  (r1v6 kotlin.jvm.functions.Function1<android.text.TextPaint, kotlin.Unit>)
 binds: [B:27:0x003c, B:20:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void updateDrawState(android.text.TextPaint r4) {
                /*
                    r3 = this;
                    r2 = 2
                    int r0 = r2 % r2
                    int r0 = com.incode.welcome_sdk.commons.utils.b.a.e.f6454b
                    int r1 = r0 + 5
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.commons.utils.b.a.e.f6455c = r0
                    int r1 = r1 % r2
                    java.lang.String r0 = ""
                    if (r1 == 0) goto L33
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    com.incode.welcome_sdk.commons.utils.b$a r0 = com.incode.welcome_sdk.commons.utils.b.a.this
                    kotlin.jvm.functions.Function1 r1 = r0.b()
                    r0 = 10
                    int r0 = r0 / 0
                    if (r1 == 0) goto L3f
                L1f:
                    r1.invoke(r4)
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                L24:
                    if (r0 != 0) goto L29
                    super.updateDrawState(r4)
                L29:
                    int r0 = com.incode.welcome_sdk.commons.utils.b.a.e.f6455c
                    int r1 = r0 + 69
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.commons.utils.b.a.e.f6454b = r0
                    int r1 = r1 % r2
                    return
                L33:
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    com.incode.welcome_sdk.commons.utils.b$a r0 = com.incode.welcome_sdk.commons.utils.b.a.this
                    kotlin.jvm.functions.Function1 r1 = r0.b()
                    if (r1 == 0) goto L3f
                    goto L1f
                L3f:
                    r0 = 0
                    goto L24
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.b.a.e.updateDrawState(android.text.TextPaint):void");
            }
        }

        public final ClickableSpan j() {
            int i2 = 2 % 2;
            int i3 = f6444f;
            int i4 = i3 + 45;
            f6445h = i4 % 128;
            int i5 = i4 % 2;
            ClickableSpan clickableSpan = this.f6451g;
            int i6 = i3 + 75;
            f6445h = i6 % 128;
            int i7 = i6 % 2;
            return clickableSpan;
        }

        public final void a(String str) {
            int i2 = 2 % 2;
            int i3 = f6445h + 85;
            f6444f = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            this.f6453j = this.f6449d.length();
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, this.f6449d, 0, false, 6, (Object) null);
            this.f6450e = iIndexOf$default;
            this.f6452i = iIndexOf$default + this.f6453j;
            int i5 = f6444f + 109;
            f6445h = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 40 / 0;
            }
        }
    }

    public static SpannableString e(Context context, int i2, a[] aVarArr) {
        int i3 = 2 % 2;
        int i4 = f6441c + 75;
        f6443e = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(aVarArr, "");
            String string = context.getString(i2);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return c(string, aVarArr);
        }
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aVarArr, "");
        String string2 = context.getString(i2);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c(string2, aVarArr);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static SpannableString c(String str, a[] aVarArr) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aVarArr, "");
        SpannableString spannableString = new SpannableString(str);
        int length = aVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = f6441c + 27;
            f6443e = i4 % 128;
            if (i4 % 2 == 0) {
                a aVar = aVarArr[i3];
                aVar.a(str);
                aVar.c();
                throw null;
            }
            a aVar2 = aVarArr[i3];
            aVar2.a(str);
            if (aVar2.c() >= 0) {
                spannableString.setSpan(aVar2.j(), aVar2.c(), aVar2.g(), aVar2.d());
                int i5 = f6443e + 105;
                f6441c = i5 % 128;
                int i6 = i5 % 2;
            } else {
                Timber.Forest.e("Skipping content: [" + aVar2.e() + "] with [start: " + aVar2.c() + ", end: " + aVar2.g() + "]", new Object[0]);
            }
        }
        int i7 = f6441c + 95;
        f6443e = i7 % 128;
        int i8 = i7 % 2;
        return spannableString;
    }

    public static SpannableString c(Context context, String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Pair<String, List<Pair<String, String>>> pairE = e(str);
        String strComponent1 = pairE.component1();
        List<Pair<String, String>> listComponent2 = pairE.component2();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listComponent2, 10));
        Iterator<T> it = listComponent2.iterator();
        int i3 = f6443e + 11;
        f6441c = i3 % 128;
        int i4 = i3 % 2;
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(new a((String) pair.component1(), new d(context, (String) pair.component2())));
        }
        SpannableString spannableStringC = c(strComponent1, (a[]) arrayList.toArray(new a[0]));
        int i5 = f6441c + 117;
        f6443e = i5 % 128;
        int i6 = i5 % 2;
        return spannableStringC;
    }

    static final class d extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f6457a = 0;

        /* JADX INFO: renamed from: b */
        private static int f6458b = 1;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ String f6459c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ Context f6460d;

        private void a(View view) throws Exception {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(view, "");
            Context context = this.f6460d;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f6459c));
            CX.ud();
            context.startActivity(intent);
            int i3 = f6458b + 113;
            f6457a = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 52 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(View view) throws Exception {
            int i2 = 2 % 2;
            int i3 = f6458b + 27;
            f6457a = i3 % 128;
            int i4 = i3 % 2;
            a(view);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 36 / 0;
            }
            return unit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, String str) {
            super(1);
            this.f6460d = context;
            this.f6459c = str;
        }
    }

    static final class e extends Lambda implements Function1<MatchResult, CharSequence> {

        /* JADX INFO: renamed from: a */
        private static int f6461a = 0;

        /* JADX INFO: renamed from: c */
        private static int f6462c = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ List<Pair<String, String>> f6463b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CharSequence invoke(MatchResult matchResult) {
            int i2 = 2 % 2;
            int i3 = f6462c + 19;
            f6461a = i3 % 128;
            int i4 = i3 % 2;
            CharSequence charSequenceE = e(matchResult);
            int i5 = f6462c + 13;
            f6461a = i5 % 128;
            if (i5 % 2 == 0) {
                return charSequenceE;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private CharSequence e(MatchResult matchResult) {
            int i2 = 2 % 2;
            int i3 = f6462c + 121;
            f6461a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(matchResult, "");
            String str = matchResult.getGroupValues().get(1);
            this.f6463b.add(TuplesKt.to(str, matchResult.getGroupValues().get(2)));
            String str2 = str;
            int i5 = f6461a + 15;
            f6462c = i5 % 128;
            if (i5 % 2 != 0) {
                return str2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(List<Pair<String, String>> list) {
            super(1);
            this.f6463b = list;
        }
    }

    private static Pair<String, List<Pair<String, String>>> e(String str) {
        int i2 = 2 % 2;
        Regex regex = new Regex("\\[(.*?)\\]\\((.*?)\\)");
        ArrayList arrayList = new ArrayList();
        Pair<String, List<Pair<String, String>>> pair = new Pair<>(regex.replace(str, new e(arrayList)), arrayList);
        int i3 = f6443e + 27;
        f6441c = i3 % 128;
        int i4 = i3 % 2;
        return pair;
    }

    public static AnnotatedString a(String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        List<Pair<String, String>> second = e(str).getSecond();
        int i3 = 0;
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        Iterator<T> it = second.iterator();
        while (it.hasNext()) {
            int i4 = f6443e + 23;
            f6441c = i4 % 128;
            int i5 = i4 % 2;
            Pair pair = (Pair) it.next();
            String str2 = (String) pair.component1();
            String str3 = (String) pair.component2();
            String str4 = str;
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str4, "[" + str2 + "](", i3, false, 4, (Object) null);
            if (iIndexOf$default >= 0) {
                String strSubstring = str.substring(i3, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                builder.append(strSubstring);
                int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str4, ")", iIndexOf$default, false, 4, (Object) null);
                if (iIndexOf$default2 > iIndexOf$default) {
                    builder.pushStringAnnotation("URL", str3);
                    int iPushStyle = builder.pushStyle(new SpanStyle(Color.Companion.m4205getBlue0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61438, (DefaultConstructorMarker) null));
                    try {
                        builder.append(str2);
                        Unit unit = Unit.INSTANCE;
                        builder.pop(iPushStyle);
                        int i6 = f6443e + 61;
                        f6441c = i6 % 128;
                        if (i6 % 2 != 0) {
                            builder.pop();
                            i3 = 0;
                        } else {
                            builder.pop();
                            i3 = iIndexOf$default2 + 1;
                        }
                    } catch (Throwable th) {
                        builder.pop(iPushStyle);
                        throw th;
                    }
                } else {
                    continue;
                }
            }
        }
        if (i3 < str.length()) {
            String strSubstring2 = str.substring(i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            builder.append(strSubstring2);
        }
        return builder.toAnnotatedString();
    }

    static {
        int i2 = f6442d + 93;
        f6440b = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 13 / 0;
        }
    }
}
