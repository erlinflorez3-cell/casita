package com.ticnow.sdk.idnowonboarding.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.ticnow.sdk.idnowonboarding.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lmA0RqP\u008cZS8\u000fsڔ<$q$yّQ٥J}P\b\u0010Ywk|Jr\u000bq\u0010و\u001axx.\u0012Y\u0007h*\u000f`N8CAZ\b=gnEB\u0013 J\"fz[В&ݵL\u0010~ٙ\u0014c\u001a\u0015H@\u001f>)ҏyŋ\u001e\u001e\u000ē8\u0003$auTVJrdH7s\u000fwKf'\u000e:Sմ\u0019ТX'\u0015ǸҖ\":"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#|$3t 0\u0017!Et=\u001e\u0013weJ\u000br@-z#NVP\u0015\\dH", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "2hP9b.", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#|$3t 0\u0017!KyC(\u001dGe5\u000em.$", "5dc\u0011\\(E]\u001b", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi6q\u00125WE\u0005ID,$ri\u0018\u000b_3Xx|", "Adc\u0011\\(E]\u001b", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G\u001f;i\u001d8O\r\u0019{B-\u001fp@=\u0003j6PLj8", ";db@T.>", "", "2hb:\\:L", "", "Ag^D", "\u001a`]1e6BRbz\u0006iu[\r+l\n*Q", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class ConnectivityDialogNew {
    private Context context;
    public CustomDialog dialog;
    private String message;

    public ConnectivityDialogNew(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.context = context;
        this.message = "Estamos comprobando su\nconexión a internet...";
    }

    public final void dismiss() {
        CustomDialog customDialog = this.dialog;
        if (customDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        customDialog.dismiss();
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

    public final android.app.Dialog show() {
        Context context = this.context;
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();
        Intrinsics.checkExpressionValueIsNotNull(layoutInflater, "(context as Activity).layoutInflater");
        View viewInflate = layoutInflater.inflate(R.layout.dialog_daviplata_custom_dialog_connectivity, (ViewGroup) null);
        TextView textViewDialogDaviPlata = (TextView) viewInflate.findViewById(R.id.textViewDialogDaviPlata);
        Intrinsics.checkExpressionValueIsNotNull(textViewDialogDaviPlata, "textViewDialogDaviPlata");
        textViewDialogDaviPlata.setText(this.message);
        CustomDialog customDialog = new CustomDialog(this.context);
        this.dialog = customDialog;
        customDialog.setContentView(viewInflate);
        CustomDialog customDialog2 = this.dialog;
        if (customDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        if (customDialog2 == null) {
            Intrinsics.throwNpe();
        }
        Window window = customDialog2.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.drawable.bg_dialog);
        }
        CustomDialog customDialog3 = this.dialog;
        if (customDialog3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        if (customDialog3 == null) {
            Intrinsics.throwNpe();
        }
        Window window2 = customDialog3.getWindow();
        if (window2 != null) {
            window2.setTransitionBackgroundFadeDuration(1000L);
        }
        CustomDialog customDialog4 = this.dialog;
        if (customDialog4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        customDialog4.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.ticnow.sdk.idnowonboarding.dialog.ConnectivityDialogNew.show.1
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                return true;
            }
        });
        CustomDialog customDialog5 = this.dialog;
        if (customDialog5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        customDialog5.show();
        CustomDialog customDialog6 = this.dialog;
        if (customDialog6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        }
        return customDialog6;
    }
}
