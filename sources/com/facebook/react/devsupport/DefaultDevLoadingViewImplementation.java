package com.facebook.react.devsupport;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.common.logging.FLog;
import com.facebook.react.R;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.interfaces.DevLoadingViewManager;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lkA0ZeP\u008cZS@\u000fsڔ<$i$yCAV\"}0\u0015WNmivJh\u0011K\u000f\f\u0018\u000f̓Ja\u0006x\f\u0011G1Z0JCQ}=Q`#7ӯ$20:B\u000b\u000f%BH>\u0003AW\u0014\u0012 =Xph^SMM( \u0014V /*\rk\\E`l\fJu#KwP_?_^\t}\u0011Tc?\r%qd?\t`C'=S1\u0013\u0003aM\u0016WsS\u0004\u00177W1W\bo8n~B*[U\u001bs\u000b(r\u0004\u007fuR;˦ScYg^<\u0006}\u0014\u000fR\u0003<\n]\t\u0005Ʃ\u001cǴ\f\u0012KvxXNVRlP\u0007\u0013cL\u0016S\b\nڂEӸjQiݢi\\E\u0005\u001d\u000f4\"/xwſ`\u05f8d\u0015#ƘH]?QX=vO`Բ?ъ\bpj̣ø\bI"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~8}!3}\u001d=,CLR>\u001a\u0014lj;wg,`Z/RSN4\\[\u00029#\u0016d\u0017$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~]\u0007/7z\u0017*KCI5\u0013\u001e&Ok5\u0006g5Pg+G^6(eNt=!g", "@dP0g\u0010Ga(z\u0004\\,[\t@H\u007f/\u0007@\u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~F}\u001c5|y7[R7t2\u001eshr\u001c\u0007j7N\u0004|", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u007f\u0017(U\u007f\u0019G\u00012D#j 3k%\u0012VQJg=\u001c\u0015GaJic3Yv4\u001d\u0010?", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u0010b5MS,\u000e", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", "2de\u0019b(=W\"\u0001eh7\r\u0014", "\u001a`]1e6BRb\u0011~].|\u0018xP\n3\fKr\u001b Fy \u0012", "2de\u0019b(=W\"\u0001kb,\u000f", "\u001a`]1e6BRb\u0011~].|\u0018xT\u007f;\u000b1\u0005\u0017)\u001d", "6hS2", "", "6hS2<5MS&\bve", "Ag^D<5MS&\bve", ";db@T.>", "", "Ag^D@,La\u0015\u0001z", "CoS.g,)`#\u0001\b^:\u000b", "AsPAh:", "2n]2", "", "Bnc._", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u0019b\r 9m#\u00044H7|0g\u001cdj;PG5]v)GY$oM", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DefaultDevLoadingViewImplementation implements DevLoadingViewManager {
    public static final Companion Companion = new Companion(null);
    private static boolean isEnabled = true;
    private PopupWindow devLoadingPopup;
    private TextView devLoadingView;
    private final ReactInstanceDevHelper reactInstanceDevHelper;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\":\u0012\u007f\u0007lj?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\u0004a(\u0001:\t}R\u0018k|Or\u000bq\u0011V\"\u0007kDI\u0004z4܋\u001b̓FoG\u074cޢsC"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E?\u0001(%Wz\u0019F\u00044~8}!3}\u001d=,CLR>\u001a\u0014lj;wg,`Z/RSN4\\[\u00029#\u0016d\u0017\r\t\u0017\rd=-rN@t", "", "u(E", "7r4;T)ES\u0018", "", "Adc\u0011X=%]\u0015}~g.\\\u0012+b\u0007(z", "", "3mP/_,=", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void setDevLoadingEnabled(boolean z2) {
            DefaultDevLoadingViewImplementation.isEnabled = z2;
        }
    }

    public DefaultDevLoadingViewImplementation(ReactInstanceDevHelper reactInstanceDevHelper) {
        Intrinsics.checkNotNullParameter(reactInstanceDevHelper, "reactInstanceDevHelper");
        this.reactInstanceDevHelper = reactInstanceDevHelper;
    }

    private final Context getContext() {
        return this.reactInstanceDevHelper.getCurrentActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hide$lambda$2(DefaultDevLoadingViewImplementation this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideInternal();
    }

    private final void hideInternal() {
        PopupWindow popupWindow = this.devLoadingPopup;
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
            this.devLoadingPopup = null;
            this.devLoadingView = null;
        }
    }

    private final void showInternal(String str) {
        PopupWindow popupWindow = this.devLoadingPopup;
        if (popupWindow == null || !popupWindow.isShowing()) {
            Activity currentActivity = this.reactInstanceDevHelper.getCurrentActivity();
            if (currentActivity == null) {
                FLog.e(ReactConstants.TAG, "Unable to display loading message because react activity isn't available");
                return;
            }
            try {
                Rect rect = new Rect();
                currentActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                int i2 = rect.top;
                Object systemService = currentActivity.getSystemService("layout_inflater");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.dev_loading_view, (ViewGroup) null);
                Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) viewInflate;
                textView.setText(str);
                PopupWindow popupWindow2 = new PopupWindow(textView, -1, -2);
                popupWindow2.setTouchable(false);
                popupWindow2.showAtLocation(currentActivity.getWindow().getDecorView(), 0, 0, i2);
                this.devLoadingView = textView;
                this.devLoadingPopup = popupWindow2;
            } catch (WindowManager.BadTokenException unused) {
                FLog.e(ReactConstants.TAG, "Unable to display loading message because react activity isn't active, message: " + str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showMessage$lambda$0(DefaultDevLoadingViewImplementation this$0, String message) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(message, "$message");
        this$0.showInternal(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateProgress$lambda$1(Integer num, Integer num2, DefaultDevLoadingViewImplementation this$0, String str) {
        String str2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (num == null || num2 == null || num2.intValue() <= 0) {
            str2 = "";
        } else {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str2 = String.format(Locale.getDefault(), " %.1f%%", Arrays.copyOf(new Object[]{Float.valueOf((num.intValue() / num2.intValue()) * 100)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        }
        TextView textView = this$0.devLoadingView;
        if (textView == null) {
            return;
        }
        if (str == null) {
            str = "Loading";
        }
        textView.setText(str + str2 + "…");
    }

    @Override // com.facebook.react.devsupport.interfaces.DevLoadingViewManager
    public void hide() {
        if (isEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DefaultDevLoadingViewImplementation$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDevLoadingViewImplementation.hide$lambda$2(this.f$0);
                }
            });
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevLoadingViewManager
    public void showMessage(final String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (isEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DefaultDevLoadingViewImplementation$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDevLoadingViewImplementation.showMessage$lambda$0(this.f$0, message);
                }
            });
        }
    }

    @Override // com.facebook.react.devsupport.interfaces.DevLoadingViewManager
    public void updateProgress(final String str, final Integer num, final Integer num2) {
        if (isEnabled) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DefaultDevLoadingViewImplementation$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDevLoadingViewImplementation.updateProgress$lambda$1(num, num2, this, str);
                }
            });
        }
    }
}
