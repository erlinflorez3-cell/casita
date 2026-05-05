package androidx.compose.ui.input.pointer;

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
/* JADX INFO: compiled from: PointerEvent.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d̉=!,r\bDZc|\u0004G\u00078\u000bDB\u0007\"20\u007f\u0007tpA0Jn`9`uB\u000f\u001a\u007fzřӮ(qQ^m,\fF!O|\r\u0010nxZǈBƤو\u001azpRW|\u0011o 7JB\u001ed[M\u001e=̙_Қȥ\t\"8KF!\u001d\u001b(T`\u0010%ykK:\u0012`D~ej\r{*ݾ\u0011ß̧$\u0003$\tu{V[zҗR/Q\u0002\u0012B|'\u0016tƊQ\u0011^V-\u000e\u0005c>>N:M\u0015SR+\u0007\u0001_uGӭuA\u001dj-,9K\u0014jD^\u0018\u0014C*w\r\fv\\!ԇUd$)1VqMp!6\u007f\u0013{;;,\u000e4'~rǉ\u001ej \u00109}\u0001U`c\u0010hZ\u007f)`^\u0017S\u0004ioݰ\u001fjicA$\\9\u001c\u0018\u001b*;\u0001\u001d \u0004T<dK_ƻ{UISFJVP*lK{\u001cp\u0011\u0001R\u0004^G6sɨ\u00152/'=jG%A~\u0010X\\g%\u0004\th\u0002m\t\rغ&r.90\u001a\u001a\\dw\u0013}hT\u0007+9MJX=Bݔ\u0017$tyB43\u0012nbv}\u0003M\f\tM/\u0015;\u00103«\u0012[Q`9J_e0t`\r,?ja-X\u0015B\nPȺ`,:4N\u0002\u001ey\u001cW\\$+2mpD4Z5O!ČL\u00076DG\u0016\u0017az{\u001e\u0019l3R\u0002\u0012$#\t7\u0015ʷts\u007fzOG\u000bbB@OmM\u0019TTJhb\u0001YKҋw\u0004_iRdZn6\tc\u001a8\u0016H8y/k\u0017ECȞ6\u0006EGR\u0012sSm%5\u001b\u0015y=:\u0011.\u0016\b!5ݽdnbQZ80x\u0007|)Ψr.\u001aat wc\u00030\u0004HOͿ\u0011\t\\Nf\"5\u001fLJ˝o'\u000583ϠCK\u0015߹\u0018_"}, d2 = {"/qT\u000ea@)`\u0019\r\t^+", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0011.$wkB\u00159", "5dc\u000ee,\u001a\\-i\b^:\u000b\t.-{\u000b\u0011\u001e\u0014^v", "uH\u0018'", "7r09g\u000eKO$\u0002ek,\u000b\u0017/d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u001a\u001e)ek5\u0014b\u0014Xu+HPN9j(", "7r09g\u000eKO$\u0002ek,\u000b\u0017/dGw\u000f-k\u000b\u0001\u0012", "7r09g\u0017KS'\rz]", "7r09g\u0017KS'\rz]sL\u001c\u001cPs\u0012F", "7r1.V2)`\u0019\r\t^+", "7r1.V2)`\u0019\r\t^+D\u0005\u0012z];C ", "7r2.c:%]\u0017\u0005dg", "7r2.c:%]\u0017\u0005dgsL\u001c\u001cPs\u0012F", "7r2Ae3)`\u0019\r\t^+", "7r2Ae3)`\u0019\r\t^+DXBRj\u001ce\u000b", "7r5<e>:`\u0018i\b^:\u000b\t.", "7r5<e>:`\u0018i\b^:\u000b\t.-{\u000b\u0011\u001e\u0014^v", "7r5Ba*MW#\bek,\u000b\u0017/d", "7r5Ba*MW#\bek,\u000b\u0017/dGw\u000f-k\u000b\u0001\u0012", "7r<2g()`\u0019\r\t^+", "7r<2g()`\u0019\r\t^+DXBRj\u001ce\u000b", "7r=B`\u0013HQ\u001fh\u0004", "7r=B`\u0013HQ\u001fh\u0004&{\u0010u\u001aYir", "7r??\\4:`-i\b^:\u000b\t.", "7r??\\4:`-i\b^:\u000b\t.-{\u000b\u0011\u001e\u0014^v", "7rB0e6EZ\u007f\txd\u0016\u0006", "7rB0e6EZ\u007f\txd\u0016\u0006P~xl\u0013o*K", "7rB2V6GR\u0015\f\u000fI9|\u0017=e~", "7rB2V6GR\u0015\f\u000fI9|\u0017=e~ow#\u0016t*\u000fO", "7rB5\\-M>&~\tl,{", "7rB5\\-M>&~\tl,{P~xl\u0013o*K", "7rBF`\u0017KS'\rz]", "7rBF`\u0017KS'\rz]sL\u001c\u001cPs\u0012F", "7rC2e;BO&\u0013ek,\u000b\u0017/d", "7rC2e;BO&\u0013ek,\u000b\u0017/dG$^U^*^'", "\u0013l_Al\u0017HW\"\u000ezk\u0012|\u001d,o{5z(\u000b\u0016\u001bHs\u000eI\u0005", "u(8", "7mS2k\u0016?4\u001d\f\tm\u0017\n\t=s\u007f'", "", "7mS2k\u0016?4\u001d\f\tm\u0017\n\t=s\u007f'C<c,tZ7m", "uH\u0018\u0016", "7mS2k\u0016?:\u0015\r\nI9|\u0017=e~", "7mS2k\u0016?:\u0015\r\nI9|\u0017=e~ow#\u0016t*\u000fO", "7r??X:LS\u0018", "0tcAb5\"\\\u0018~\u000e", "7r??X:LS\u0018FwG\u0010n\f:I", "uH8uM", "\u001c`c6i,)]\u001d\b\n^9Y\u0019>t\n1\n", "\u001c`c6i,)]\u001d\b\n^9b\tCb\n$\t?h!\u0016Kp\u0012<\u00043", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PointerEvent_androidKt {
    /* JADX INFO: renamed from: getAreAnyPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m5345getAreAnyPressedaHzCxE(int i2) {
        return i2 != 0;
    }

    /* JADX INFO: renamed from: indexOfFirstPressed-aHzCx-E, reason: not valid java name */
    public static final int m5346indexOfFirstPressedaHzCxE(int i2) {
        if (i2 == 0) {
            return -1;
        }
        int i3 = 0;
        for (int i4 = (-1) - (((-1) - ((i2 - 97) - (i2 | (-97)))) & ((-1) - ((96 & i2) >>> 5))); (-1) - (((-1) - i4) | ((-1) - 1)) == 0; i4 >>>= 1) {
            i3++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: indexOfLastPressed-aHzCx-E, reason: not valid java name */
    public static final int m5347indexOfLastPressedaHzCxE(int i2) {
        int i3 = -1;
        for (int i4 = (i2 & (-97)) | (((i2 + 96) - (96 | i2)) >>> 5); i4 != 0; i4 >>>= 1) {
            i3++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: isAltGraphPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5348isAltGraphPressed5xRPYO0(int i2) {
        return false;
    }

    /* JADX INFO: renamed from: isAltPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5349isAltPressed5xRPYO0(int i2) {
        return (i2 & 2) != 0;
    }

    /* JADX INFO: renamed from: isBackPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m5350isBackPressedaHzCxE(int i2) {
        return (-1) - (((-1) - i2) | ((-1) - 8)) != 0;
    }

    /* JADX INFO: renamed from: isCapsLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m5351isCapsLockOn5xRPYO0(int i2) {
        return (i2 & 1048576) != 0;
    }

    /* JADX INFO: renamed from: isCtrlPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5352isCtrlPressed5xRPYO0(int i2) {
        return (-1) - (((-1) - i2) | ((-1) - 4096)) != 0;
    }

    /* JADX INFO: renamed from: isForwardPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m5353isForwardPressedaHzCxE(int i2) {
        return (-1) - (((-1) - i2) | ((-1) - 16)) != 0;
    }

    /* JADX INFO: renamed from: isFunctionPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5354isFunctionPressed5xRPYO0(int i2) {
        return (-1) - (((-1) - i2) | ((-1) - 8)) != 0;
    }

    /* JADX INFO: renamed from: isMetaPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5355isMetaPressed5xRPYO0(int i2) {
        return (-1) - (((-1) - i2) | ((-1) - 65536)) != 0;
    }

    /* JADX INFO: renamed from: isNumLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m5356isNumLockOn5xRPYO0(int i2) {
        return (i2 + 2097152) - (i2 | 2097152) != 0;
    }

    /* JADX INFO: renamed from: isPrimaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m5358isPrimaryPressedaHzCxE(int i2) {
        return (-1) - (((-1) - i2) | ((-1) - 33)) != 0;
    }

    /* JADX INFO: renamed from: isScrollLockOn-5xRPYO0, reason: not valid java name */
    public static final boolean m5359isScrollLockOn5xRPYO0(int i2) {
        return (i2 & 4194304) != 0;
    }

    /* JADX INFO: renamed from: isSecondaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m5360isSecondaryPressedaHzCxE(int i2) {
        return (i2 & 66) != 0;
    }

    /* JADX INFO: renamed from: isShiftPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5361isShiftPressed5xRPYO0(int i2) {
        return (i2 + 1) - (i2 | 1) != 0;
    }

    /* JADX INFO: renamed from: isSymPressed-5xRPYO0, reason: not valid java name */
    public static final boolean m5362isSymPressed5xRPYO0(int i2) {
        return (i2 & 4) != 0;
    }

    /* JADX INFO: renamed from: isTertiaryPressed-aHzCx-E, reason: not valid java name */
    public static final boolean m5363isTertiaryPressedaHzCxE(int i2) {
        return (-1) - (((-1) - i2) | ((-1) - 4)) != 0;
    }

    public static final int EmptyPointerKeyboardModifiers() {
        return PointerKeyboardModifiers.m5448constructorimpl(0);
    }

    /* JADX INFO: renamed from: isPressed-bNIWhpI, reason: not valid java name */
    public static final boolean m5357isPressedbNIWhpI(int i2, int i3) {
        if (i3 == 0) {
            return m5358isPrimaryPressedaHzCxE(i2);
        }
        if (i3 == 1) {
            return m5360isSecondaryPressedaHzCxE(i2);
        }
        if (i3 == 2 || i3 == 3 || i3 == 4) {
            if ((i2 & (1 << i3)) != 0) {
                return true;
            }
        } else if ((i2 & (1 << (i3 + 2))) != 0) {
            return true;
        }
        return false;
    }
}
