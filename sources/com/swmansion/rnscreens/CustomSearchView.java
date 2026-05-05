package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import com.dynatrace.android.callback.Callback;
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
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0L͜P.hS2şs{J$cҕyCQU\"Ԃ*\t]WogtNb\u000bQ\u000f\u000e\u0016~q4Ic\u0005e܈\u00157Xģo3{n}LpxD\u000582P9\n\t\u000f\u001cBH>yټGK\u001a\u0016xD~Nj\r{\u001ab\u0016\u0014T8\u0001Lq0RD_\u0005]hDk\twZf'\u000eEC_ULb@%v\u00103qR\u007fE#?k\u00035g\fE\u0011Z\n?\u001bgU1q]<gDt\u0018\u0014C@\u007f\u0013k\u000e>^\u001bP\u000f\u0018m?\u0018oYm&(&\u0010,\u0011J\"&\u0006Ug~9(k \u000eazIԢBг\u0006^JȕKmD\u001e=\u007fa3\u0010ӘrЂe;!\u05cb\b\n\u0013\u00166%\u0017mOe+טlڠ\u001fT\u007f\u0383\u0002_NH`P XkyZ͒n͆.\u00048ϚPQ\n F\u0017SE\f=1.\u0004\u0002vR\u001e;C%?\u05ccuʐLJ:p\u001cG8\u001a,\\Jv\u0013~ÕXx"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011M\u001eJ\u0006/=G}\u001cDk\u0019\u001fQCMA", "\u001a`]1e6BR,Hvi7z\u00137p{7ER\u0005\u0016\u0019G~W*v!BW\u0001\u0011;m(\u0004", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "4qP4`,Gb", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001fJ7\u0017;IECk=-^dlDPD9Jx/GU]\u0002 C", "0`R8C9>a'h\f^9\n\r.e\r", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011P\u001b8x-5b\r|3k\u001c\u0019ZCIy\u001e/\u0015un=\u0006c9$", "=m1.V2)`\u0019\r\t^+Z\u00056l|$yF", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qeI]\u0013\u0015MZ\u001b<\u000535X[\u001c>t\u0013*KI\u0011", "=m29b:>:\u001d\r\n^5|\u0016", "\u001a`]1e6BR,Hvi7z\u00137p{7ER\u0005\u0016\u0019G~W*v!BW\u0001\u0011;m(l7L\u0019r>,\u0015OeG\u0016c5N\u0004|", "=mB2T9<Vv\u0006~\\2|\b\u0016i\u000e7{I\u0001$", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feI^\u001e\u001bEut@\u000545b}-\r", "D`[BX", "", "=uT?e0=Suzxd\bz\u00183o\t", "5dc\u001ci,K`\u001d}z;(z\u000f\u000bc\u000f,\u0006I", "u(I", "Adc\u001ci,K`\u001d}z;(z\u000f\u000bc\u000f,\u0006I", "uY\u0018#", "1`]0X3,S\u0015\fxa", "", "1kT.e\u001b>f(", "4nRBf", "=m0Ag(<V\u0019}ih\u001e\u0001\u0012.o\u0012", "=m32g(<V\u0019}[k6\u0005z3n~2\u000e", "Adc\u001ca\nE]'~ab:\f\t8e\r", ":hbAX5>`", "Adc\u001ca\u001a>O&|}<3\u0001\u00075L\u00046\u000b@\n\u0017$", "Adc!X?M", "BdgA", "", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CustomSearchView extends SearchView {
    private final FragmentBackPressOverrider backPressOverrider;
    private OnBackPressedCallback onBackPressedCallback;
    private SearchView.OnCloseListener onCloseListener;
    private View.OnClickListener onSearchClickedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomSearchView(Context context, Fragment fragment) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.onBackPressedCallback = new OnBackPressedCallback() { // from class: com.swmansion.rnscreens.CustomSearchView$onBackPressedCallback$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                this.this$0.setIconified(true);
            }
        };
        this.backPressOverrider = new FragmentBackPressOverrider(fragment, this.onBackPressedCallback);
        super.setOnSearchClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.CustomSearchView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomSearchView.m8760x322a76ba(this.f$0, view);
            }
        });
        super.setOnCloseListener(new SearchView.OnCloseListener() { // from class: com.swmansion.rnscreens.CustomSearchView$$ExternalSyntheticLambda1
            @Override // androidx.appcompat.widget.SearchView.OnCloseListener
            public final boolean onClose() {
                return CustomSearchView._init_$lambda$1(this.f$0);
            }
        });
        setMaxWidth(Integer.MAX_VALUE);
    }

    private static final void _init_$lambda$0(CustomSearchView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View.OnClickListener onClickListener = this$0.onSearchClickedListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        this$0.backPressOverrider.maybeAddBackCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(CustomSearchView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SearchView.OnCloseListener onCloseListener = this$0.onCloseListener;
        boolean zOnClose = onCloseListener != null ? onCloseListener.onClose() : false;
        this$0.backPressOverrider.removeBackCallbackIfAdded();
        return zOnClose;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$new$-Landroid-content-Context-Landroidx-fragment-app-Fragment--V, reason: not valid java name */
    public static /* synthetic */ void m8760x322a76ba(CustomSearchView customSearchView, View view) {
        Callback.onClick_enter(view);
        try {
            _init_$lambda$0(customSearchView, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public final void cancelSearch() {
        clearText();
        setIconified(true);
    }

    public final void clearText() {
        setQuery("", false);
    }

    public final void focus() {
        setIconified(false);
        requestFocusFromTouch();
    }

    public final boolean getOverrideBackAction() {
        return this.backPressOverrider.getOverrideBackAction();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isIconified()) {
            return;
        }
        this.backPressOverrider.maybeAddBackCallback();
    }

    @Override // androidx.appcompat.widget.SearchView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.backPressOverrider.removeBackCallbackIfAdded();
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnCloseListener(SearchView.OnCloseListener onCloseListener) {
        this.onCloseListener = onCloseListener;
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.onSearchClickedListener = onClickListener;
    }

    public final void setOverrideBackAction(boolean z2) {
        this.backPressOverrider.setOverrideBackAction(z2);
    }

    public final void setText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        setQuery(text, false);
    }
}
