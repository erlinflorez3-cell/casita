package com.ticnow.sdk.idnowonboarding.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
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
import android.widget.Button;
import android.widget.TextView;
import com.dynatrace.android.callback.Callback;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u0006\u0007nʑA0ZeP\u008cZS8\u0015sڔ<$q$yّCU0}*\tUN}˧\u001fJ\t\n{\u000e\u0017V{̶0Icx&(\u001d9Zom;}sKBxtd\u000fP60C\u0012\u0005/&pHX\u0003\tPc\f@>ptHa%M3*b\u001eL!\u0019\u001e\u000bi%ȫtǰaF7݊\u001bkHQ5cP~S\u0012TZܴ\u0011\t"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#|$3t 0\u0017!Et=\u001e\u0013weJ\u000br@.\u00044QY-0XY|?i", "", "u(E", "2hP9b.", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#|$3t 0\u0017!Et=\u001e\u0013weJ\u000br@.\u00044QY-0XY|?Roj\u001c]5\u0015c]=+xF\r", "5dc\u0011\\(E]\u001b", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi6q\u00125WE\u0005I>'\u001eh_H\u000bt0]\u000b\u0007TYX9;VnD\u001e\u0014\u0019k^9\u001c\u000fa (jKA!]", "Adc\u0011\\(E]\u001b", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G\u001f;i\u001d8O\r\u0019u='\u0015fp=\u0018g;bV4TV[\u000b`NyG\u0016P8\u001e\\:\u0017\r8E uN9tK\u001d", "Adc\u0010b3H`y\u0003\u0002m,\n", "", "2qPDT)ES", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW\u001b\u0004!GUz'7C", "1n[<e", "", "Ag^D", "\u001a`]1e6BRbz\u0006iu[\r+l\n*Q", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "\u0011tbAb4\u001dW\u0015\u0006\u0005`", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class ConnectivityErrorDialog {
    public CustomDialog dialog;

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0014\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0015Ӭ\\\u0012&\u0006'uI4Re`.\u0001T֖\u0013k\n6Ƃ_'"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#|$3t 0\u0017!Et=\u001e\u0013weJ\u000br@.\u00044QY-0XY|?Roj\u001c]5\u0015c]=+xF\r", "\u001a`]1e6BRbz\u0006iu[\r+l\n*Q", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
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
            decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.ticnow.sdk.idnowonboarding.dialog.ConnectivityErrorDialog.CustomDialog.1
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

    public final android.app.Dialog show(final Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();
        Intrinsics.checkExpressionValueIsNotNull(layoutInflater, "(context as Activity).layoutInflater");
        View view = layoutInflater.inflate(R.layout.dialog_simple_option, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(view, "view");
        TextView textView = (TextView) view.findViewById(R.id.textViewTitleDialog);
        Intrinsics.checkExpressionValueIsNotNull(textView, "view.textViewTitleDialog");
        textView.setText("");
        TextView textView2 = (TextView) view.findViewById(R.id.textViewMessageDialog);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "view.textViewMessageDialog");
        textView2.setText("Revise su conexión a internet.\nPor favor intente su proceso más tarde.");
        Button button = (Button) view.findViewById(R.id.buttonDialogAcept);
        Intrinsics.checkExpressionValueIsNotNull(button, "view.buttonDialogAcept");
        button.setText("Aceptar");
        ((Button) view.findViewById(R.id.buttonDialogAcept)).setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.dialog.ConnectivityErrorDialog.show.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Callback.onClick_enter(view2);
                try {
                    ((Activity) context).setResult(3036, new Intent());
                    ((Activity) context).finish();
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
        CustomDialog customDialog = new CustomDialog(context);
        this.dialog = customDialog;
        customDialog.setContentView(view);
        CustomDialog customDialog2 = this.dialog;
        if (customDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        customDialog2.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.ticnow.sdk.idnowonboarding.dialog.ConnectivityErrorDialog.show.2
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
        CustomDialog customDialog4 = this.dialog;
        if (customDialog4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        return customDialog4;
    }
}
