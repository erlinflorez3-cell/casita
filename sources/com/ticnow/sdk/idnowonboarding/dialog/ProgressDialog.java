package com.ticnow.sdk.idnowonboarding.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.ticnow.sdk.idnowonboarding.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u0006\u0007nʑA0ZeP\u008cZS8\u0015s{:$c$\bCC٥\"}0\u0014WNmg\u0005Ϻ\u000b\u000bq\u000e>\u0015\u000b+/֒Yxk\u0012WHPvW3{wm=n}N\u0005N<R<\b\u0010\u0019\u001aXTVvCOY\u0019*0nxjV\u001b[\u001d\u001a@\u0015\u00076\u000f+tg|>xpkHG#1xrT5oH~c\ftew%\u0005b6+n9\f՝Q٨\u0007\u0013Z¹W\u0005EtK\t\t)-0Wyɷ:k"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#|$3t 0\u0017.Hu6+\u0015vo\u0018\u000b_3Xx|", "", "u(E", "2hP9b.", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#|$3t 0\u0017.Hu6+\u0015vo\u0018\u000b_3Xxe%\\\\;fZQA\u0010\u0019d\u0010$", "5dc\u0011\\(E]\u001b", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi6q\u00125WE\u0005VA(\u0017uaG\u0015B0J}1I\u000b,<ja|Er\u0016V\u0015X-b", "Adc\u0011\\(E]\u001b", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G\u001f;i\u001d8O\r&x> \"hoGeg(U\u0001)\u0006*^:k\\z\u001c\u0018\u000ea\u0018P\u0001Pu", "Adc\u0010b3H`y\u0003\u0002m,\n", "", "2qPDT)ES", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW\u001b\u0004!GUz'7C", "1n[<e", "", "Ag^D", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ";db@T.>", "", "\u0011tbAb4\u001dW\u0015\u0006\u0005`", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class ProgressDialog {
    public CustomDialog dialog;

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0014\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0015Ӭ\\\u0012&\u0006'uI4Re`.\u0001T֖\u0013k\n6Ƃ_'"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#|$3t 0\u0017.Hu6+\u0015vo\u0018\u000b_3Xxe%\\\\;fZQA\u0010\u0019d\u0010$", "\u001a`]1e6BRbz\u0006iu[\r+l\n*Q", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class CustomDialog extends android.app.Dialog {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomDialog(Context context) {
            View decorView;
            View decorView2;
            View rootView;
            super(context, R.style.customDialogTheme);
            Intrinsics.checkParameterIsNotNull(context, "context");
            Window window = getWindow();
            if (window != null && (decorView2 = window.getDecorView()) != null && (rootView = decorView2.getRootView()) != null) {
                rootView.setBackgroundResource(R.color.backgroundColor);
            }
            Window window2 = getWindow();
            if (window2 == null || (decorView = window2.getDecorView()) == null) {
                return;
            }
            decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.ticnow.sdk.idnowonboarding.dialog.ProgressDialog.CustomDialog.1
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return windowInsets.consumeSystemWindowInsets();
                }
            });
        }
    }

    private final void setColorFilter(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            drawable.setColorFilter(new BlendModeColorFilter(i2, BlendMode.SRC_ATOP));
        } else {
            drawable.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
        }
    }

    public final CustomDialog getDialog() {
        CustomDialog customDialog = this.dialog;
        if (customDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        return customDialog;
    }

    public final void setDialog(CustomDialog customDialog) {
        Intrinsics.checkParameterIsNotNull(customDialog, "<set-?>");
        this.dialog = customDialog;
    }

    public final void show(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        show(context, null);
    }

    public final void show(Context context, CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        try {
            LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();
            Intrinsics.checkExpressionValueIsNotNull(layoutInflater, "(context as Activity).layoutInflater");
            View view = layoutInflater.inflate(R.layout.dialog_progress_dialog, (ViewGroup) null);
            Intrinsics.checkExpressionValueIsNotNull(view, "view");
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progressBarCustomProgressDialog);
            Intrinsics.checkExpressionValueIsNotNull(progressBar, "view.progressBarCustomProgressDialog");
            Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
            Intrinsics.checkExpressionValueIsNotNull(indeterminateDrawable, "view.progressBarCustomPr…log.indeterminateDrawable");
            setColorFilter(indeterminateDrawable, -1);
            if (charSequence != null) {
                TextView textView = (TextView) view.findViewById(R.id.textViewCustomProgressDialog);
                Intrinsics.checkExpressionValueIsNotNull(textView, "view.textViewCustomProgressDialog");
                textView.setText(charSequence);
            }
            ((TextView) view.findViewById(R.id.textViewCustomProgressDialog)).setTextColor(ViewCompat.MEASURED_STATE_MASK);
            CustomDialog customDialog = new CustomDialog(context);
            this.dialog = customDialog;
            customDialog.setContentView(view);
            CustomDialog customDialog2 = this.dialog;
            if (customDialog2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
            }
            customDialog2.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.ticnow.sdk.idnowonboarding.dialog.ProgressDialog.show.1
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                    return true;
                }
            });
            CustomDialog customDialog3 = this.dialog;
            if (customDialog3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
            }
            customDialog3.show();
        } catch (Exception unused) {
        }
    }
}
