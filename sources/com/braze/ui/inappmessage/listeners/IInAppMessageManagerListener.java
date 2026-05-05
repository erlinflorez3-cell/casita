package com.braze.ui.inappmessage.listeners;

import android.view.View;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeFunctionNotImplemented;
import com.braze.ui.inappmessage.InAppMessageCloser;
import com.braze.ui.inappmessage.InAppMessageOperation;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4\u0012}\u0007njO0L͜P.hS2\u000fq|<$i-yّCU0}*ޛWN}gvJ`\fIs\u001cǝ)jZH\u001e\u0007k\u0012'2ppo7[qU9\u000fw|\u0019hH0<\u0012\u0005/\u001bZL\u001e{\u0013Cy\u0012B4NrRR;PK.Z\u0014L'\u0019\u001e\u000bo~:Vnu:]&I}\u000bd5hH|{\u000evX5\u0012\u000faL1p;C\u0017=S1\n\u0019o\b\u0019M{U\u0005\u0017(W/Wxo6\u0007\u0006D\u00199Q%]!)#\u0019\u001av\u001a2CO\u0012W\u0001\u00126y\u0013{;?4\u0012\u00144`.[(-\u001cVS\u0003}k@~\u000e\u000fF\u000e|y6E(079F3f\u007fok\u001f\\F\u0014\u0007#\u001dQ\u001156$b\u001cq-\u001b\u0003\u0004\u00025_BUH|\r Q6\u001c~s\u001a*2<w\u0004=}).E(gaG29m\u0018Grw=\u001a)va{jHn#\u001f\u001aE,!\f\tG+\u0019ÐOӹГ,\u0015U\u001eZ&,\u0007˟$oʽ@ "}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\u00121L\u0017v?\u0006\u0015vo5\tc\u0014J\u007f#IL[\u0013``\u0002=\u001d\u0012gc", "", "/ec2e\u0010G/$\nb^:\u000b\u00051ep,{R^\u001e!Uo\r", "", "7m0=c\u0014>a'z|^", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ej", "/ec2e\u0010G/$\nb^:\u000b\u00051ep,{Rj\"\u0017Po\r", "7m0=c\u0014>a'z|^\u001d\u0001\tA", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "0dU<e,\"\\t\n\u0006F,\u000b\u0017+g\u007f\u0007\u007fN\f\u001e\u0013[o\r", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW \u007f\u0001@de E{\u00120M-FkA\u001a$lkB\\", "0dU<e,\"\\t\n\u0006F,\u000b\u0017+g\u007f\u0019\u007f@\u0013t\u001eQ}\u000e;", "0dU<e,\"\\t\n\u0006F,\u000b\u0017+g\u007f\u0019\u007f@\u0013\u0001\"Gx\u000e;", "=m8;47I;\u0019\r\tZ.|e?t\u000f2\u0005\u001e\b\u001b\u0015Mo\r", "", "0tcAb5", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~A}.Ei\u0018.*SJz>'j", "7m0=c\u0014>a'z|^\n\u0004\u0013=e\r", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW \u007f\u0001@de E{\u00120M!BuB\u001e\">", "=m8;47I;\u0019\r\tZ.|f6i}.{?", "=m8;47I;\u0019\r\tZ.|g3s\b,\nN\u0001\u0016", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface IInAppMessageManagerListener {
    default void afterInAppMessageViewClosed(IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
    }

    default void afterInAppMessageViewOpened(View inAppMessageView, IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
    }

    default InAppMessageOperation beforeInAppMessageDisplayed(IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        return InAppMessageOperation.DISPLAY_NOW;
    }

    default void beforeInAppMessageViewClosed(View inAppMessageView, IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
    }

    default void beforeInAppMessageViewOpened(View inAppMessageView, IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
    }

    default boolean onInAppMessageButtonClicked(IInAppMessage inAppMessage, MessageButton button) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(button, "button");
        return false;
    }

    @Deprecated(message = "\fT\\E\u0002a\u001ajkH/\u007f3!;aa^H0\u0018(\u0010W\u0007XsmO\t)j", replaceWith = @ReplaceWith(expression = "onInAppMessageButtonClicked(inAppMessage, button)", imports = {}))
    @InterfaceC1492Gx
    default boolean onInAppMessageButtonClicked(IInAppMessage inAppMessage, MessageButton button, InAppMessageCloser inAppMessageCloser) throws BrazeFunctionNotImplemented {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(button, "button");
        throw BrazeFunctionNotImplemented.INSTANCE;
    }

    default boolean onInAppMessageClicked(IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        return false;
    }

    @Deprecated(message = "\fT\\E\u0002a\u001ajkH/\u007f3!;aa^H0\u0018(\u0010W\u0007XsmO\t)j", replaceWith = @ReplaceWith(expression = "onInAppMessageClicked(inAppMessage)", imports = {}))
    @InterfaceC1492Gx
    default boolean onInAppMessageClicked(IInAppMessage inAppMessage, InAppMessageCloser inAppMessageCloser) throws BrazeFunctionNotImplemented {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        throw BrazeFunctionNotImplemented.INSTANCE;
    }

    default void onInAppMessageDismissed(IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
    }
}
