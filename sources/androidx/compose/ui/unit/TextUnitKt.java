package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: TextUnit.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d̉=!,p\bDJe|\u0004W\u00068\u000b<F\u0007\"2\u0014\u007f\u0007toA0JeP.`Y2\u000fq|<$i-yCA`\"}8\tWNmhvJh\u000bK\u000f\f(\u0001jBI]xc\u0018'PP\fW3{sm=n\u0012N\u0005N<R<\b#\u0019\u001aXgȮuٙŲO\u000e\u0018PN\u0012Rj\u001bo\u001d\u001a@)n$\u000fBtg|:\u000fkԐ9ǂݭ\u0007kHs5rH\u001d[/^TU0'e,OX7c\u0019UW\u0011-j[m\u0007\u0006pޮ\u0004ؒҊ+-O\u001be^p(\"7CO;\u0001#*j)i`:+[Sqqh\u000eV{+\u007f\u001be\u001c\u000e4+\u000f-ȟ\u0019Ǒڿ\u00125z\u001dakh*ln\u0018z\u0010:G)\u000e`C9Ij\u0002eIGf7*\t=\"10\u0007!\n^Te۶\u001aƘɐU3WpKyf%go\u0006\u0004\u001ff2.\u0012c_\u007f]zA2%YO[g-gjɘLDu,\u001d\u0004v\n\u0002RvDJnD;Z\u0013\u001a\u0012\\j\u0015m`T\u00070?\u0006bΈ\rś\u0007ʶء`yBZ3Jflv%\u0003M\f\u000eM/\u0015<\nryJo9\r7{ȩk¼`\u05ecλ\u0018AB \u0013\u0017~_aGr\\V&ZH\u0019\u001a(\u007fR\u000b$\u0013`C8ʑ<в0ǉÅ\u0019J\t[Pb\u0015&m\u0016\u0001\u0010-X[$1vTx\u0017=h\\\u001fs.նQڌ{ʠĘ1CWr'eu.vؔ\u0015#5}JÕ\u001aѨPGT˾6\u0002c{8\u0016H8(Ȁ\u0010т\u0013~1Ʌ\"9SM\u000be\u007fLh\u0600M܃}\u000fCÜNs\u0016l\t,\u000fi!֥'Ђ&vfаC$r\u0003\u0012at~oc\u0003\u0010\u0012\u0003 ·\u0005ʾ@XH~\u000b%,,\u0019q(\u0005C6cC+\u0019\u0010\u0014]\u0019\n]\u0018yd>9Ϗ(܌i\u000e<e\u001cup\\u4A@We\u001fZ0'\u0005\u0003pL\u0013w6O?xcΑJыhzf:S\u0011=\f~\t2\u0015~e{W!\u007f\u00164\\pRsq\u0002JڲC{ݖOϬkw}Mb\u001dX\"\"\r\u0002E|'<Y.lob7A.sF:w\u007f9ť>ʢ(><>\u000e\"Qg\u0002\b\u0016\u0013\u000e[\u007f+%KZsiZ6T'a\r\r[ނGȚ%4\u0011\u0001\u0015M,\u007fM3\u000b\tT]O\u007f@\u001ak\u001d7\u001f\u0013O-p[o\u001bǼ;Ь,b\u0011\rKwQT\u001a8\nb7y\f\f\u001aQ0|KF@\u001bg^G$MѲ`κYn^f|,t`f$/\u001a\t\fɝ<\u000f\u0017\u000e\u001fۼ\u000f\u001eaϋP\u000f"}, d2 = {"#M8!R\u0014\u001aA~", "", "#M8!R\u001b2>xxZF", "#M8!R\u001b2>xxhI", "#M8!R\u001b2>xxjG\u001agh\rI`\f[\u001f", "3l", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "", "5dc\u0012`j:\\\"\t\nZ;\u0001\u00138s", "uC\u0018#", "5dc\u0012`", "uC\u0018\u0017", "", "uE\u0018#", "uE\u0018\u0017", "", "uH\u0018#", "uH\u0018\u0017", "7rB=X*BT\u001d~y", "", "7rB=X*BT\u001d~y&siU\"_P2:<\n !Vk\u001d@\u0001.C", "uI\u0018#", "7rB=X*BT\u001d~y&siU\"_P2", "uI\u0018'", "7rD;f7>Q\u001d\u007f~^+", "7rD;f7>Q\u001d\u007f~^+DP\u001c2r\"LJ?\u0013 Py\u001d8\u0006)?b\f", "7rD;f7>Q\u001d\u007f~^+DP\u001c2r\"LJ", "Ao", "5dc cj:\\\"\t\nZ;\u0001\u00138s", "5dc c", "\"dgAH5Bb", "D`[BX", "Bx_2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/&\u0002!.#", "\"dgAH5Bb`z\u0004F{\bs#", "uE9u=", "1gT0^\bKW(\u0002\u0003^;\u0001\u0007", "", RemoteSettings.FORWARD_SLASH_STRING, "1gT0^\bKW(\u0002\u0003^;\u0001\u0007v-ltn:Q!", AdkSettings.PLATFORM_TYPE_MOBILE, "1gT0^\bKW(\u0002\u0003^;\u0001\u0007vN\\xM?\u0014!", "uI9uI", "1", "1gT0^\bKW(\u0002\u0003^;\u0001\u0007vvooF@k\u001d", "uI9\u0017\u001c\u001d", ":da=", "AsP?g", "As^=", "4qP0g0H\\", ":da= \n\f^\"\\kR", "uI9\u0013\u001c\u0011", ">`R8", "CmXAG@IS", "D", "uI5u=", "B`Z2B9\u001eZ'~", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "B`Z2B9\u001eZ'~B^\b}\u0003\rNk", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHuzR", "Bh\\2f", "=sW2e", "Bh\\2fsF^xM\rr\u0018", "uC9u=", "uH9u=", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextUnitKt {
    private static final long UNIT_MASK = 1095216660480L;
    private static final long UNIT_TYPE_EM = 8589934592L;
    private static final long UNIT_TYPE_SP = 4294967296L;
    private static final long UNIT_TYPE_UNSPECIFIED = 0;

    public static /* synthetic */ void getEm$annotations(double d2) {
    }

    public static /* synthetic */ void getEm$annotations(float f2) {
    }

    public static /* synthetic */ void getEm$annotations(int i2) {
    }

    public static /* synthetic */ void getSp$annotations(double d2) {
    }

    public static /* synthetic */ void getSp$annotations(float f2) {
    }

    public static /* synthetic */ void getSp$annotations(int i2) {
    }

    /* JADX INFO: renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m6848isSpecifiedR2X_6o$annotations(long j2) {
    }

    /* JADX INFO: renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m6850isUnspecifiedR2X_6o$annotations(long j2) {
    }

    /* JADX INFO: renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m6843TextUnitanM5pPY(float f2, long j2) {
        return pack(j2, f2);
    }

    /* JADX INFO: renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m6847isSpecifiedR2X_6o(long j2) {
        return !m6849isUnspecifiedR2X_6o(j2);
    }

    /* JADX INFO: renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m6849isUnspecifiedR2X_6o(long j2) {
        return TextUnit.m6829getRawTypeimpl(j2) == 0;
    }

    public static final long getSp(float f2) {
        return pack(UNIT_TYPE_SP, f2);
    }

    public static final long getEm(float f2) {
        return pack(UNIT_TYPE_EM, f2);
    }

    public static final long getSp(double d2) {
        return pack(UNIT_TYPE_SP, (float) d2);
    }

    public static final long getEm(double d2) {
        return pack(UNIT_TYPE_EM, (float) d2);
    }

    public static final long getSp(int i2) {
        return pack(UNIT_TYPE_SP, i2);
    }

    public static final long getEm(int i2) {
        return pack(UNIT_TYPE_EM, i2);
    }

    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m6854timesmpE4wyQ(float f2, long j2) {
        m6844checkArithmeticR2X_6o(j2);
        return pack(TextUnit.m6829getRawTypeimpl(j2), f2 * TextUnit.m6831getValueimpl(j2));
    }

    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m6853timesmpE4wyQ(double d2, long j2) {
        m6844checkArithmeticR2X_6o(j2);
        return pack(TextUnit.m6829getRawTypeimpl(j2), ((float) d2) * TextUnit.m6831getValueimpl(j2));
    }

    /* JADX INFO: renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m6855timesmpE4wyQ(int i2, long j2) {
        m6844checkArithmeticR2X_6o(j2);
        return pack(TextUnit.m6829getRawTypeimpl(j2), i2 * TextUnit.m6831getValueimpl(j2));
    }

    public static final long pack(long j2, float f2) {
        long jFloatToIntBits = ((long) Float.floatToIntBits(f2)) & 4294967295L;
        return TextUnit.m6823constructorimpl((j2 + jFloatToIntBits) - (j2 & jFloatToIntBits));
    }

    /* JADX INFO: renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m6844checkArithmeticR2X_6o(long j2) {
        if (m6849isUnspecifiedR2X_6o(j2)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
    }

    /* JADX INFO: renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m6845checkArithmeticNB67dxo(long j2, long j3) {
        if (m6849isUnspecifiedR2X_6o(j2) || m6849isUnspecifiedR2X_6o(j3)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (!TextUnitType.m6859equalsimpl0(TextUnit.m6830getTypeUIouoOA(j2), TextUnit.m6830getTypeUIouoOA(j3))) {
            throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m6861toStringimpl(TextUnit.m6830getTypeUIouoOA(j2))) + " and " + ((Object) TextUnitType.m6861toStringimpl(TextUnit.m6830getTypeUIouoOA(j3)))).toString());
        }
    }

    /* JADX INFO: renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m6846checkArithmeticvU0ePk(long j2, long j3, long j4) {
        if (m6849isUnspecifiedR2X_6o(j2) || m6849isUnspecifiedR2X_6o(j3) || m6849isUnspecifiedR2X_6o(j4)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.".toString());
        }
        if (!TextUnitType.m6859equalsimpl0(TextUnit.m6830getTypeUIouoOA(j2), TextUnit.m6830getTypeUIouoOA(j3)) || !TextUnitType.m6859equalsimpl0(TextUnit.m6830getTypeUIouoOA(j3), TextUnit.m6830getTypeUIouoOA(j4))) {
            throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) TextUnitType.m6861toStringimpl(TextUnit.m6830getTypeUIouoOA(j2))) + " and " + ((Object) TextUnitType.m6861toStringimpl(TextUnit.m6830getTypeUIouoOA(j3)))).toString());
        }
    }

    /* JADX INFO: renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m6851lerpC3pnCVY(long j2, long j3, float f2) {
        m6845checkArithmeticNB67dxo(j2, j3);
        return pack(TextUnit.m6829getRawTypeimpl(j2), MathHelpersKt.lerp(TextUnit.m6831getValueimpl(j2), TextUnit.m6831getValueimpl(j3), f2));
    }

    /* JADX INFO: renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m6852takeOrElseeAf_CNQ(long j2, Function0<TextUnit> function0) {
        return !m6849isUnspecifiedR2X_6o(j2) ? j2 : function0.invoke().m6840unboximpl();
    }
}
