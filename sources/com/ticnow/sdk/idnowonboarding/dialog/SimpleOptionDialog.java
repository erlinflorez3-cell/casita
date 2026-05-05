package com.ticnow.sdk.idnowonboarding.dialog;

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
@Metadata(bv = {1, 0, 3}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4C\u0007\"B\u0012\u007f\u0007ljA0ZeP\u008cZS@\u000fsڔ<$q$yّCU0}*ޛWNugvϺpŏs\u000f4\u00159\u000e<Mcxu\u0012=3RsM5eok:pxD\b82P9\n\t\u000f\u001eBH>{ټGK\u001a\u0018xd~Aj\u000fc\u0004H\u001a6B.\n6\\\u0016XfNzhR19\u0002\u0018N~-m=\u0015O#E\u00035S\u000b*$9OO5C5\u001a\u0017W^iB\u001b? >[ؕ)ݳ/I{Ɏ\u0007d\u000e\u0018-+}\u00124ù(ػ\tQhϯw7]ecP<)N߁}Ɂ@\u0004\u0016ͺwT<-2f6\u000f\nςtՂDP\nމ۶\u0004\f"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#|$3t 0\u00171?s?%\u0015RlH\u000bm5-z#NVP\u0002", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`uKk\u0015Fx\u0006BU\u007f(7v%\u0004", "Bhc9X", "", ";db@T.>", "0tcAb5-S,\u000e", "1kX0^\u0013Ba(~\u0004^9", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feI^\u001e\u001bEut@\u000545b}-\r", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3J5[_|A\u0013[k\u0012N=Vu]A6-.@|\u000f0G\b\"l\u000f\u001b\u0016\u00175wF\u0006G", "=m2?X(MS\n\u0003zp", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7mU9T;>`", "\u001a`]1e6BRb\u0010~^>Fo+y\n8\u000b$\n\u0018\u001eC~\u000eIL", "1n]AT0GS&", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=mBAT9M", "", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class SimpleOptionDialog extends DialogFragment {
    private HashMap _$_findViewCache;
    private final String buttonText;
    private final View.OnClickListener clickListener;
    private final String message;
    private final String title;

    public SimpleOptionDialog(String title, String message, String buttonText, View.OnClickListener clickListener) {
        Intrinsics.checkParameterIsNotNull(title, "title");
        Intrinsics.checkParameterIsNotNull(message, "message");
        Intrinsics.checkParameterIsNotNull(buttonText, "buttonText");
        Intrinsics.checkParameterIsNotNull(clickListener, "clickListener");
        this.title = title;
        this.message = message;
        this.buttonText = buttonText;
        this.clickListener = clickListener;
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
        View viewInflate = inflater.inflate(R.layout.dialog_simple_option, viewGroup, false);
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
        ((Button) viewInflate.findViewById(R.id.buttonDialogAcept)).setOnClickListener(new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.dialog.SimpleOptionDialog.onCreateView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.onClick_enter(view);
                try {
                    SimpleOptionDialog.this.clickListener.onClick(view);
                    SimpleOptionDialog.this.dismiss();
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
