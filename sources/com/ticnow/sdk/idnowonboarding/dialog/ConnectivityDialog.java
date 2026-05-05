package com.ticnow.sdk.idnowonboarding.dialog;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.ticnow.sdk.idnowonboarding.R;
import com.ticnow.sdk.idnowonboarding.connectivity.ConnectionAliveCallback;
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
    	... 4 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я<\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjG9LeN.ZS@\u000fsڔ<$q$yّCU0}*ޛWN}gvJ`\u000bYƤ6\u0016'ilLǤ|] \u000fzV}@KM\u001e?id\u00039\u001d `&h}\u0013\u00062*v\u0016?\u000fQR$\u0012^B!>`\u0010e\u0005H\u00166B.\u00066\\\u0016T~lzeR19\u0002\u0018K~+m:\u0015M;Q\u0005-\u001b\u0003y A?eBE+a\u0011\u001fTq>1N8QMn57CI\"Y|lą\u0018&"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#|$3t 0\u0017!Et=\u001e\u0013weJ\u000br@-z#NVP\u0002", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`uKk\u0015Fx\u0006BU\u007f(7v%\u0004", "u(E", "2hb:\\:L>#\n\u000bi", "", "1`[9U(<Y", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#{*@v\u0016,\\GLoC2^FkB\u0010c*]z1P(U0mRP9\u001b\u0019W\nL1b", "D`[BX", "", "2hb:\\:LE\u001d\u000e}<(\u0004\u0010\fa}.", "=m2?X(MS\n\u0003zp", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7mU9T;>`", "\u001a`]1e6BRb\u0010~^>Fo+y\n8\u000b$\n\u0018\u001eC~\u000eIL", "1n]AT0GS&", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=mBAT9M", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class ConnectivityDialog extends DialogFragment {
    private HashMap _$_findViewCache;

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

    public final void dismissPopup(ConnectionAliveCallback callback, boolean z2) {
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        callback.onFinished(Boolean.valueOf(z2));
        dismiss();
    }

    public final void dismissWithCallBack(ConnectionAliveCallback callback, boolean z2) {
        Intrinsics.checkParameterIsNotNull(callback, "callback");
        callback.onFinished(Boolean.valueOf(z2));
        dismiss();
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
        View viewInflate = inflater.inflate(R.layout.dialog_conectivity, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.linearLayout);
        if (viewFindViewById == null) {
            throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        View viewFindViewById2 = viewInflate.findViewById(R.id.textViewMessageDialog);
        Intrinsics.checkExpressionValueIsNotNull(viewFindViewById2, "view.findViewById<TextVi…id.textViewMessageDialog)");
        ((TextView) viewFindViewById2).setText("Estamos comprobando su\nconexión a internet...");
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
    }
}
