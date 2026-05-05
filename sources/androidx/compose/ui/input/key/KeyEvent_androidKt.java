package androidx.compose.ui.input.key;

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
/* JADX INFO: compiled from: KeyEvent.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!,r\bDZc|\u0004G\r8\u000bDB\u0007\"2\u0013\u007f\u0007|jA0JfP.`Y2\u000fq{<$q$yّ[h(Ԃ:\t}M\u0010g\u001dJ\u0011Oß\u0013\n.zp-WW\u0019p \u0012JB\u001e>[M\u001e=o%ҽ:\t84(<\b\u0007!-8M(v)Bs\f@0v5ĐV\u0011e\u0007 \u0018\u0014@@\u0014,c\u007fNdG\u0015]h/YGݦFR?a6\u0005[\u000ffg5\u0016\u000faL5h7c\u0015[\u0018Ϋ\u000bVsA\tJ\u007fI%{54CI\"e^X.\u0014Ko̠\u0011a\u000b(b\u0014_p,:9`{K~ Pw){C\u0001Ǭ\u0012\n?J4@(v0\u0016A\t\u0013Sne2^p\u0015іeL"}, d2 = {"7r09g\u0017KS'\rz]", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~?}4\u0017~\u00167\\\u0019", "7r09g\u0017KS'\rz]sq\u00119kk;\u0006", "uKP;W9HW\u0018H\fb,\u000fR\u0015e\u0014\b\r@\n&l\u000bd", "7r2Ae3)`\u0019\r\t^+", "7r2Ae3)`\u0019\r\t^+D}7o\u0006\u0014\u000fJ", "7r<2g()`\u0019\r\t^+", "7r<2g()`\u0019\r\t^+D}7o\u0006\u0014\u000fJ", "7rB5\\-M>&~\tl,{", "7rB5\\-M>&~\tl,{P$m\n.gS\u000b", "9dh", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~?}4\r", "5dc\u0018X@\u0006H!\t\u0001J?\u0007", "uKP;W9HW\u0018H\fb,\u000fR\u0015e\u0014\b\r@\n&l\u000bT", "Bx_2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~?}4\u0017~\u00167\\2Ov4s", "5dc!l7>\u001b\u000e\u0007\u0005d\u0018\u0010\u0013", "uKP;W9HW\u0018H\fb,\u000fR\u0015e\u0014\b\r@\n&l\u000bS", "CsU})\nHR\u0019i\u0005b5\f", "", "5dc\"g-\n$v\ty^\u0017\u0007\r8tG\u001d\u0004J\u0007\u0003*Q", "\u001c`c6i,$S-^\f^5\f", "\u001a`]1e6BRb\u0010~^>Fn/y_9{I\u0010l", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class KeyEvent_androidKt {
    /* JADX INFO: renamed from: getKey-ZmokQxo, reason: not valid java name */
    public static final long m5243getKeyZmokQxo(android.view.KeyEvent keyEvent) {
        return Key_androidKt.Key(keyEvent.getKeyCode());
    }

    /* JADX INFO: renamed from: getUtf16CodePoint-ZmokQxo, reason: not valid java name */
    public static final int m5245getUtf16CodePointZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    /* JADX INFO: renamed from: getType-ZmokQxo, reason: not valid java name */
    public static final int m5244getTypeZmokQxo(android.view.KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action == 0) {
            return KeyEventType.Companion.m5240getKeyDownCS__XNY();
        }
        if (action == 1) {
            return KeyEventType.Companion.m5241getKeyUpCS__XNY();
        }
        return KeyEventType.Companion.m5242getUnknownCS__XNY();
    }

    /* JADX INFO: renamed from: isAltPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m5246isAltPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isAltPressed();
    }

    /* JADX INFO: renamed from: isCtrlPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m5247isCtrlPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    /* JADX INFO: renamed from: isMetaPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m5248isMetaPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isMetaPressed();
    }

    /* JADX INFO: renamed from: isShiftPressed-ZmokQxo, reason: not valid java name */
    public static final boolean m5249isShiftPressedZmokQxo(android.view.KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }
}
