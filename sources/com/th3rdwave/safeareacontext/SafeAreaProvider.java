package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
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
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007|jA0ZeP.XS2\u000f\u0002{<řc$\bCC٥\"}0\tWN}gvJ`\u000fK\u000f\u0014\u001f\u0001j2Jkތ\u000e\u0012=1rom3\u000e|M?nuN\u000761P:ѩ\t\u0001(-\u0011\u0016\u0005\f[K:\u001fv@9@`\u001fe\u0005H\u001fLPh\u0007,o\u007fNdU3o\u000351\u0017\u0002B|<&DE'\u001b\\l';\u0004\u0012o9WO\u0003%6c\u00125ѸÜC\rEwM\u000bn.7-Oy}>h\u0011$$YXոa|,b\u0015Wf\u00137-UiqZ\u001e9\b\n*\u0018ʀ\b\u0018\f-X43!v\n\u00149\u001b~cB`\u0002\rO\u0016y\u0010;\u007f'\u00162\nGk@_eSf^H\f\u0014;̔ţ\u0005x'ad\u0014f\u001c+V}WWYPNX]8bǀq\u000evh\u00120\n7W\u00025\u000278'6Gjg.\u074co\fNJw|\u000bgxUoXnL2p&7X\u0016\"YrimmfS7:g۶(Τ\u000b}\u0010ʶpj\u0006K9'&M}s@җYύ\u000e%7ω\bg|{&YO]a>(Ҳ\u001cуVv\u001c̳ףf\u001d"}, d2 = {"\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~Gy!7I#.I.HuE\"\u0014hn\u000f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001f@v7~F}\u001c5|\u00072MU\u001dx>. >", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\u0017\t@\u0001\u0001\u0014Uo\u001bMv2sC\u0007\u000bDmt;IU\"oB-\u0015qaF\\", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", ";H]@X;L1\u001cz\u0004`,_\u00058d\u0007(\t", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "DhTD", "\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~9|\"7Q\u001f<MRIA", "7mb2g:", "\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~F}\u001eFC", "4qP:X", "", "\u001ab^:\";A!&}\rZ=|R=a\u0001(wM\u0001\u0013\u0015Qx\u001d<\n4~C\u0007\u0004@{\u0016=[!>g= \u0015K]B\u0006j,[L", ";KP@g\rKO!~", ";KP@g\u0010Ga\u0019\u000e\t", ";`h/X\u001cIR\u0015\u000ezB5\u000b\t>s", "=m0Ag(<V\u0019}ih\u001e\u0001\u0012.o\u0012", "=m32g(<V\u0019}[k6\u0005z3n~2\u000e", "=m??X\u000bKO+", "", "Adc\u001ca\u0010Ga\u0019\u000e\t</x\u00121eb$\u0005?\b\u0017$", "6`]1_,K", "@dP0gsGO(\u0003\f^s\u000b\u00050eG$\t@|^\u0015Qx\u001d<\n4/f}'7i$."}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SafeAreaProvider extends ReactViewGroup implements ViewTreeObserver.OnPreDrawListener {
    private Function3<? super SafeAreaProvider, ? super EdgeInsets, ? super Rect, Unit> mInsetsChangeHandler;
    private Rect mLastFrame;
    private EdgeInsets mLastInsets;

    public SafeAreaProvider(Context context) {
        super(context);
    }

    private final void maybeUpdateInsets() {
        SafeAreaProvider safeAreaProvider;
        EdgeInsets safeAreaInsets;
        Function3<? super SafeAreaProvider, ? super EdgeInsets, ? super Rect, Unit> function3 = this.mInsetsChangeHandler;
        if (function3 == null || (safeAreaInsets = SafeAreaUtilsKt.getSafeAreaInsets((safeAreaProvider = this))) == null) {
            return;
        }
        View rootView = getRootView();
        Intrinsics.checkNotNull(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        Rect frame = SafeAreaUtilsKt.getFrame((ViewGroup) rootView, safeAreaProvider);
        if (frame == null) {
            return;
        }
        if (Intrinsics.areEqual(this.mLastInsets, safeAreaInsets) && Intrinsics.areEqual(this.mLastFrame, frame)) {
            return;
        }
        function3.invoke(this, safeAreaInsets, frame);
        this.mLastInsets = safeAreaInsets;
        this.mLastFrame = frame;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        maybeUpdateInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        maybeUpdateInsets();
        return true;
    }

    public final void setOnInsetsChangeHandler(Function3<? super SafeAreaProvider, ? super EdgeInsets, ? super Rect, Unit> function3) {
        this.mInsetsChangeHandler = function3;
        maybeUpdateInsets();
    }
}
