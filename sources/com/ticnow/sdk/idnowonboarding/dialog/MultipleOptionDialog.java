package com.ticnow.sdk.idnowonboarding.dialog;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.dynatrace.android.callback.Callback;
import com.ticnow.sdk.idnowonboarding.R;
import java.util.HashMap;
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
@Metadata(bv = {1, 0, 3}, d1 = {"Я@\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4D\u0007\"B\u0012\u007fјnjO0LeN/ZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvϺb\u000bQ\u000f\u000eǝ\u000f̓\\I\u0004w\u001eM\u001f6PoW3{pM=nvN\u0005N32<\b\b\u0019\u001aXI z\tGc\f@1PtHW%M3 \"\nL'\u0019\u001e\u000bo^:Vuu:])ɨmB\\1(T\u000bX%Hj&;\u0003\u0012\"9MO5C3\u0004\t\u0015asA\u0019> M5n58CK\nVdjF(]1] urTpKe1\u00185.gcyQdߍyߡ\u007f\rDǉ^\u00125LF-Hg^ԇ5ϢvSHАRjP\t\u0013ad\u001d{ı5ڢ=\u001bnϟ2G'SO{3\u0013tŃ\u0003ͼ%[\\ו1!)[\u0010Q_Y\u0017׃Jݳ\u000eYEЧT|p\u0004B\u0004^HV߿} 2\u0017-ڛ,E1!\u0004\u0002vE>ϻ\u0007¾lSqɭ͛D7"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#|$3t 0\u0017+KrC\" oa#\u0012r0X\u007f\u0006KHU6^(", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`uKk\u0015Fx\u0006BU\u007f(7v%\u0004", "Bhc9X", "", ";db@T.>", "0tcAb5-S,\u000e", "1`]0X3\u001bc(\u000e\u0005g\u001b|\u001c>", "1kX0^\u0013Ba(~\u0004^9", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feI^\u001e\u001bEut@\u000545b}-\r", "2hb:\\:L:\u001d\r\n^5|\u0016", "\u001a`]1e6BRb|\u0005g;|\u0012>/^,wG\u000b\u0019zP~\u000eIw!3Y<\n@L\u001a<UGIy\u001b\"#waB\u0007p\u0002", "1`]0X3\u001cZ\u001d|\u0001E0\u000b\u0018/n\u007f5", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<D\u0010\u001b\\W<:\u001a\tbCyU@@\u001e\u00156M\u0001\u0005y\u0005\f(W&npT\u0015yPW\u001cy?/OJgnyPAR8\u0011`\u0015^*f>9m\u0012{\"*hY=SZW\ry\\{KpV\u0019\b9 <m\u001a0NNYJ|+-Yb{ AX}+\u0002\u0003j035q\u000fOfaObx'uME'8t&\u001c\u001dRgsr%\u0012v.a\u0011\u000eo\u000bt\n", "=m2?X(MS\n\u0003zp", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7mU9T;>`", "\u001a`]1e6BRb\u0010~^>Fo+y\n8\u000b$\n\u0018\u001eC~\u000eIL", "1n]AT0GS&", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=mBAT9M", "", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class MultipleOptionDialog extends DialogFragment {
    private HashMap _$_findViewCache;
    private final String buttonText;
    private final String cancelButtonText;
    private final View.OnClickListener cancelClickListener;
    private final View.OnClickListener clickListener;
    private final DialogInterface.OnDismissListener dismissListener;
    private final String message;
    private final String title;

    public MultipleOptionDialog(String title, String message, String buttonText, String cancelButtonText, View.OnClickListener clickListener, DialogInterface.OnDismissListener dismissListener, View.OnClickListener cancelClickListener) {
        Intrinsics.checkParameterIsNotNull(title, "title");
        Intrinsics.checkParameterIsNotNull(message, "message");
        Intrinsics.checkParameterIsNotNull(buttonText, "buttonText");
        Intrinsics.checkParameterIsNotNull(cancelButtonText, "cancelButtonText");
        Intrinsics.checkParameterIsNotNull(clickListener, "clickListener");
        Intrinsics.checkParameterIsNotNull(dismissListener, "dismissListener");
        Intrinsics.checkParameterIsNotNull(cancelClickListener, "cancelClickListener");
        this.title = title;
        this.message = message;
        this.buttonText = buttonText;
        this.cancelButtonText = cancelButtonText;
        this.clickListener = clickListener;
        this.dismissListener = dismissListener;
        this.cancelClickListener = cancelClickListener;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this._$_findViewCache;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i2) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i2);
        this._$_findViewCache.put(Integer.valueOf(i2), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(inflater, "inflater");
        android.app.Dialog dialog = getDialog();
        if (dialog == null) {
            Intrinsics.throwNpe();
        }
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.drawable.bg_dialog_transp);
        }
        android.app.Dialog dialog2 = getDialog();
        if (dialog2 == null) {
            Intrinsics.throwNpe();
        }
        dialog2.setOnDismissListener(this.dismissListener);
        View viewInflate = inflater.inflate(R.layout.dialog_multiple_options, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.linearLayout);
        if (viewFindViewById == null) {
            throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        if (Intrinsics.areEqual(this.title, "")) {
            View viewFindViewById2 = viewInflate.findViewById(R.id.textViewTitleDialog);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById2, "view.findViewById<TextVi…R.id.textViewTitleDialog)");
            ((TextView) viewFindViewById2).setVisibility(8);
        } else {
            View viewFindViewById3 = viewInflate.findViewById(R.id.textViewTitleDialog);
            Intrinsics.checkExpressionValueIsNotNull(viewFindViewById3, "view.findViewById<TextVi…R.id.textViewTitleDialog)");
            ((TextView) viewFindViewById3).setText(this.title);
        }
        View viewFindViewById4 = viewInflate.findViewById(R.id.textViewMessageDialog);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById4, "view.findViewById<TextVi…id.textViewMessageDialog)");
        ((TextView) viewFindViewById4).setText(this.message);
        View viewFindViewById5 = viewInflate.findViewById(R.id.buttonDialogAcept);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById5, "view.findViewById<Button>(R.id.buttonDialogAcept)");
        ((Button) viewFindViewById5).setText(this.buttonText);
        View viewFindViewById6 = viewInflate.findViewById(R.id.buttonDialogCancel);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById6, "view.findViewById<Button>(R.id.buttonDialogCancel)");
        ((Button) viewFindViewById6).setText(this.cancelButtonText);
        ((Button) viewInflate.findViewById(R.id.buttonDialogAcept)).setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.dialog.MultipleOptionDialog.onCreateView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.onClick_enter(view);
                try {
                    MultipleOptionDialog.this.clickListener.onClick(view);
                    MultipleOptionDialog.this.dismiss();
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
        ((Button) viewInflate.findViewById(R.id.buttonDialogCancel)).setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.dialog.MultipleOptionDialog.onCreateView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.onClick_enter(view);
                try {
                    MultipleOptionDialog.this.cancelClickListener.onClick(view);
                    MultipleOptionDialog.this.dismiss();
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() throws Throwable {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Resources resources = getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "resources");
        int i2 = (int) (((double) resources.getDisplayMetrics().widthPixels) * 0.85d);
        Resources resources2 = getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources2, "resources");
        int i3 = resources2.getDisplayMetrics().heightPixels;
        android.app.Dialog dialog = getDialog();
        if (dialog == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(dialog, "dialog!!");
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(i2, -2);
        }
        android.app.Dialog dialog2 = getDialog();
        if (dialog2 == null) {
            Intrinsics.throwNpe();
        }
        dialog2.setCancelable(false);
        android.app.Dialog dialog3 = getDialog();
        if (dialog3 == null) {
            Intrinsics.throwNpe();
        }
        dialog3.setCanceledOnTouchOutside(false);
    }
}
