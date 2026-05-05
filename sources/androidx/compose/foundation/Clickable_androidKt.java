package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Clickable.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d̉=!,p\bDJd|\u0004O\u000f8\u000bDB\u0007\"2\u0017\u007f\u0007|jAӄLe^.ZݷB\u0019y\u0007L$\n'\u001aCia`Ԃ:\u0013][\u007fg\u001dM\u0003\u000bq\u001dL\u0016\u0019|:կmx\f\u0011e˱DņC9UڎU;ftD\u0006@H0:\u0012\u0005/\u001dRH>z1\u0002\"É\u0014ضDtRT\u0013R\u0013 2\u001cL'\u0019\u001e\u000bjv6vp\u0014z\u0006ݍ\u0005ݦFR?a6\u0005[\u0013fj5\u0016\u000faL.h7c\u0019[\u0012YޘTÜC\u0007WsC\u000fv-ݹ/X"}, d2 = {"\"`_\u0016a+BQ\u0015\u000e~h5[\t6a\u0014", "", "5dc!T7\"\\\u0018\u0003xZ;\u0001\u00138D\u007f/wT", "u(9", "7r29\\*D", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~?}4\u0017~\u00167\\\u0019", "7r29\\*D\u001b\u000e\u0007\u0005d\u0018\u0010\u0013", "uKP;W9HW\u0018H\fb,\u000fR\u0015e\u0014\b\r@\n&l\u000bd", "7r4;g,K", "7r4;g,K\u001b\u000e\u0007\u0005d\u0018\u0010\u0013", "7r??X:L", "7r??X:L\u001b\u000e\u0007\u0005d\u0018\u0010\u0013", "7r2<`7Ha\u0019k\u0005h;`\u0012\u001dc\r2\u0003G|\u0014\u001eGM\u0018E\u0006!9b}-", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r\u001c4t\u0016\u0017WB;A", "7r8;F*K] \u0006v[3|y3e\u0012\n\tJ\u0011\"", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Clickable_androidKt {
    private static final long TapIndicationDelay = ViewConfiguration.getTapTimeout();

    public static final boolean isComposeRootInScrollableContainer(DelegatableNode delegatableNode) {
        return isInScrollableViewGroup(DelegatableNode_androidKt.requireView(delegatableNode));
    }

    private static final boolean isInScrollableViewGroup(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final long getTapIndicationDelay() {
        return TapIndicationDelay;
    }

    /* JADX INFO: renamed from: isPress-ZmokQxo, reason: not valid java name */
    public static final boolean m620isPressZmokQxo(KeyEvent keyEvent) {
        return KeyEventType.m5236equalsimpl0(KeyEvent_androidKt.m5244getTypeZmokQxo(keyEvent), KeyEventType.Companion.m5240getKeyDownCS__XNY()) && m619isEnterZmokQxo(keyEvent);
    }

    /* JADX INFO: renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m618isClickZmokQxo(KeyEvent keyEvent) {
        return KeyEventType.m5236equalsimpl0(KeyEvent_androidKt.m5244getTypeZmokQxo(keyEvent), KeyEventType.Companion.m5241getKeyUpCS__XNY()) && m619isEnterZmokQxo(keyEvent);
    }

    /* JADX INFO: renamed from: isEnter-ZmokQxo, reason: not valid java name */
    private static final boolean m619isEnterZmokQxo(KeyEvent keyEvent) {
        int iM5250getNativeKeyCodeYVgTNJs = Key_androidKt.m5250getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m5243getKeyZmokQxo(keyEvent));
        return iM5250getNativeKeyCodeYVgTNJs == 23 || iM5250getNativeKeyCodeYVgTNJs == 66 || iM5250getNativeKeyCodeYVgTNJs == 160;
    }
}
