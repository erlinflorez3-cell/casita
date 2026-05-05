package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.URandomKt;
import kotlin.ranges.UIntProgression;
import kotlin.ranges.ULongProgression;
import okhttp3.internal.ws.WebSocketProtocol;
import yg.InterfaceC1492Gx;

/* JADX INFO: Access modifiers changed from: package-private */
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яd\u001d̉=!4i\bDJd|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007ljA0ZeP.X_2\u000f\u0002{<$a+yCI^\"}8\tWNmnvJp\u000bK\u000f\f\u001c\u0001jBI]xc\u0015\u00172XoG3SyE9vt>\u0005&6*8\b\u000b\t\u001a8O\u0018v\u0001Kc% ؓXphQ5M3\u0019B\nL \u0019\u001e\u000bf\u0015;Ղp_@01\u0005\u0002[\\ϋw0+P5F\u0003*=zo\u001eC@e8[*٨\u0007\tX_M\bW\u000bKݛ\u0001'U1qs\u0006<\t\u0004\"\u0015CO;c9+ػ\tSf\u001353g|Yִ&(&\u0004$\rj\r>\n5HF-HoN\u0013\u07baxtYJ^\rv[\u000e\u0007y6E$(3Y8Kj_nS\u0019|6B\nڟ\"%\u0007|/]l'n!3T&TYQn@xR\u0018fUm2s)\u0007ò\b2M\u000f=\u0001)G%1O[g)Ik0Ntk\u0005\u0012xh\u0002o\u0019Mغ&p\u001cG8\u0011$sRp\u001dk~]\u0001,?VLX\u0015\u000b \u0013Ne>AƼ)\u0012T`vt\u0003nk\u001c=/\u00156\u0002n\u001a\r\b=l3MQ\u0012\u000f\u0012V\u0005!W<\u0011\u0004\u001fk͞W\u000e`o66Jix\"\u0010{rQ4\u0013`B\" B,I\u0019\u000b\u0018x\u0007,OY|7b!mʐ\u0003V99\u0011\u007f<\u0014\u0017\u0013h\\\u001fr\u0010xw/-j0DYWE\u001b6UPkb\u0015i\fҋw\u0002M\u0001Zad\u000e$\bm{N\u001cB9\u007f5m\u0017\u001d~A203uP\u0001riM@-A\u0002ɍ\u0013=nIu$\u0003\u0010:r\u0003J}Z?\"%d#-\u0016{\u0018\u007fqH\u000bG\u0012Z9s\u0005N\u03a2\u0007[BkF\u001b\u001d@,7\u0019oP\u0006]-q0M\u001a\u0006\u0014G\u0015\u0010f\u001as<\u0007z\u000fT},\tНg\u0018u\u0002_}JUFjq~lDLl1exn\u0006,Z\tb\fyǭAяtX>r\u0019U\u0016\u0001\u0015M%p\u0005}b\u0013\u001e!d4mQ\fE\u0014\u0013\rFkݖUϬkmsst%X0\"\u000b*S\u0017\u0012J`PZe\u0007!04y^݅Aވf\u0007B22^DV\u0016,[T\u0018(8z.i\u0010\u0013%VZsi_T֒xחZJ\u000b\fS\r9D\u000f '3L\u001b]13\u001bvX=\bJ\u0001\u0002\u001cOƍjˍ\u0003h+YR\u0004Q56y\u0019\u000bs\u007fkI0c4K7\u0012\u0004o:;^ԅ\u001dÐ\u001c\u001d?\u0002\u001f\u0011\u000fJl,md|\u0007\u001f\u0012\u0015\u007f~(7&\u0013~$;8\u0015QćWζsb3~f\u0012Ed2\u0001EfQ\u0007:*\u0014J)Q\u001e5[F\u0010ݥ\u0014ր\u007fYYn\f<8:59\r!\u000b\u000e6f8\\K>$).b0\bYЫ\"ɯ2Lz+\u0018g P]7K\u0002A\u0015\u0002k&$p+9$\u001eByk?ƅeؼgp[E\u0011\"Ip\b$EPKEOM\\\u0019\t^HHk \u0007\u0017FǼ\u0017Ӕ#8\u000e 7Ng}v&\u0004O\nCS/\u001a3\u00125>\n6}M\u0003<ê,ķ,\u0017A\u0016[~|\u0018j.ZW<a\u0013(\u0013+R.ِ\u0001~V!)\"B\b\u000b\u001e\u00135_\u0019M\u0018SLֿ\u000b\u0004S\r>-?\u0017W\u001dM19rPv?9\u0001g\r\f8\u0007!t\u0016fZ3nTkVm^<|rH>Ks;j\bZGT\u0016˲^8.\u0001t)*\u0001i3o\u001f9\u0001CtLt߁\u001d5x\u0015k18G\u0015\u0003#>(4\u0014:\"m9(G\u001b}aohQ$ckt':>,O\u0017]q\u001e'aZL]EL\u001d\u001cʶ\u0006ˌ#$2N\u000e:\u000e\rIHXb\u0005@\u0005\u0017\b\b4qNnrl\u000eqՐw\n:40\u0004r#y4o\u0001<\u0019rkp˽rخIMvE#[\u001b\r,7=\fQ3E*@S\u007f\bCI!\u0017uaґ@\u0013\u0002PR?o\u0004\u0012IVXX\tU\u0012\u0003\u00071ݟsis\u001e\u0006*\u000f#\u0003&4z`.\u0004M\u001c5\u0013\u000fFd&?RYo\u0019\u000e'&t-p\u00123\u0006D[\u000fǎ\b\u0016^nb+5]roM:V*NM\u0015il\u001e%\u00164\u000eDm{f\fQ39$rXc\u001c#\nm+Y3C\u0015.'S.u\u0013\u0005\u001fBk\u0014]]dvFlxr^\u001e4>\u007fh~\t\u0014$ӥ\u001e7Pcd}~`\u001f_[\u0013M[;e>jUQ~?ߗ\u0005(['e#\u001e\u0002\\Z#\"\faB\n?tI\u0004{4ۦ\u0012ØeL'\u0003\u0014\u0014G[Y?nem<\u007f?-\u000fP+2=+$\u0011jYس\u0010ݤc\u0005R\fd\u007f`egc~B\u0019<#t:4<<c=U\u0006?hbޕ=ݍD.4H\u0017 g\u0005\n|}o\u0015\u0018\u0002Ms4&\u001dLh\n\u0011\u0012X&քpӐ`ZDpe\u0001Ĵ\u0017]"}, d2 = {"1nT?V,\u001ab\u007f~vl;", "\u001aj^A_0G\u001d\t[\u000fm,R", ";h]6`<FD\u0015\u0006\u000b^", "1nT?V,\u001ab\u007f~vl;Dn<8}$]4", "uA1u5", "\u001aj^A_0G\u001d\tb\u0004m\u0002", "1nT?V,\u001ab\u007f~vl;DmzM_sX0", "uH8u<", "\u001aj^A_0G\u001d\te\u0005g.R", "1nT?V,\u001ab\u007f~vl;D\t,3^\u000b[$", "uI9u=", "\u001aj^A_0G\u001d\tl}h9\f^", "1nT?V,\u001ab\u007f~vl;DX\u001avn=L\u001c", "uRBuF", "1nT?V,\u001ab\u0001\t\tm", ";`g6`<FD\u0015\u0006\u000b^", "1nT?V,\u001ab\u0001\t\tmsb\u0016\u0002c{\no", "1nT?V,\u001ab\u0001\t\tmsaT\u0017EK\u0005k", "1nT?V,\u001ab\u0001\t\tms|\u0006|Db\b_", "1nT?V,\u001ab\u0001\t\tmsLs@T\u0015xW", "1nT?V,\"\\", "1nT?V,\"\\`{H,\u001cId\u0017", "uA1\u000f\u001c\t", "1nT?V,\"\\`po2\u001bm\u0012\u000b", "uH8\u0016\u001c\u0010", "@`]4X", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\rl\n6{?m\u0013 Ioc", "1nT?V,\"\\`\u0011\u000bb\n\u0006\u0012\u000b", "uH;8b;EW\"H\bZ5~\t=/]/\u0006N\u0001\u0016\u0004Cx\u0010<Lh\u0019", "1nT?V,\"\\`\rvf)z\u0015\u000f", "uI9\u0017\u001c\u0011", "1nT?V,\"\\`cep\u0019fey", "uI;8b;EW\"H\bZ5~\t=/]/\u0006N\u0001\u0016\u0004Cx\u0010<Lh\u001a", "1nT?V,\"\\`o`L\bGq\u001b", "uRB \u001c\u001a", "1n]AT0Ga", "", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fI\t7h<\n\u0019\u0017\u001d", "D`[BX", "1n]AT0Ga`OMd\u000eP\u001ay", "uKZ<g3B\\b\fvg.|\u0017xUc1\u000b-| \u0019GEj\u007fk", "3kT:X5M", "1n]AT0Ga`{~p\u0018{y\u0013", "1n]AT0Ga`\u007f\u0010.\u0010[f\u000f", "uKZ<g3B\\b\fvg.|\u0017xUc1\u000b-| \u0019GEr\u007fk", "1n]AT0Ga`s\tDyZh\u001b", "uKZ<g3B\\b\fvg.|\u0017xUc1\u000b-| \u0019GE{\u007fk", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fL\n1}-| \u0019GE", "1n]AT0Ga`na[s\u0011m#", "uKZ<g3B\\b\fvg.|\u0017xUf2\u0005Bm\u0013 Ioc\u0019:\u001a", "1n]AT0Ga``v[yPS\u000f", "uKZ<g3B\\b\fvg.|\u0017xUf2\u0005Bm\u0013 Ioc :\u001a", "1n]AT0Ga``nG6I\u0010\u000f", "1n]AT0Ga`\u000f}A\b\u0010\u0013#", "uKZ<g3B\\b\fvg.|\u0017xUf2\u0005Bm\u0013 Ioc*:\u001a", "2nf;G6", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fI\t7fM\u000b\u0019$G}\u001c@\u0001.\u000b", "Bn", "2nf;G6\u00069&QxZ\u000ep", "uA1u?2Hb \u0003\u0004(9x\u00121e\u000eqk$\n&\u0002Ty\u0010Iv3C]\b)\r", "2nf;G6\u00068dfZ*\tl", "uH8u?2Hb \u0003\u0004(9x\u00121e\u000eqk$\n&\u0002Ty\u0010Iv3C]\b)\r", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fL\n1}+\u000e!\u0019To\u001cJz/>/", "2nf;G6\u0006S\u0016LYA\f`", "uI9u?2Hb \u0003\u0004(9x\u00121e\u000eqk'\u000b \u00192|\u0018>\u0004%Cg\u0002*@C", "2nf;G6\u0006#\u0004\u0010is|X", "uRBu?2Hb \u0003\u0004(9x\u00121e\u000eqk$\n&\u0002Ty\u0010Iv3C]\b)\r", "4ha@g", "uKZ<g3B\\b\fvg.|\u0017xUc1\u000b+\u000e!\u0019To\u001cJz/>/A\u0004", "uKZ<g3B\\b\fvg.|\u0017xUf2\u0005Bk$!I|\u000eJ\u0005)?bSc\u001c", "4ha@g\u0016K<)\u0006\u0002", ":`bA", ":`bAB9'c \u0006", "@`]1b4", "uKZ<g3B\\b\fvg.|\u0017xUc1\u000b-| \u0019GEQ ", "\u001aj^A_0G\u001d&z\u0004]6\u0005R\u001ca\t'\u0006HV", "uKZ<g3B\\b\fvg.|\u0017xUc1\u000b-| \u0019GEtB\u00014<]\u0007iDi\u001f-WK\u0005X0'\u0014ri\u000fJG", "uKZ<g3B\\b\fvg.|\u0017xUf2\u0005Bm\u0013 Ioc\u007f[", "uKZ<g3B\\b\fvg.|\u0017xUf2\u0005Bm\u0013 Ioc#|/D`\u0002)\u0001z\u00127LMC5!\u001a\u001egkA\\'\u0011", "@`]1b4(`\u0002\u000f\u0002e", "@de2e:>R", "AsT=", "", "", "Cmc6_", "Cmc6_s$`k|v@ ", "uA1u?2Hb \u0003\u0004(9x\u00121e\u000eqk$\n&\u0004Cx\u0010<L", "Cmc6_s#\u001f\u0001^F;\u001c", "uH8u?2Hb \u0003\u0004(9x\u00121e\u000eqk$\n&\u0004Cx\u0010<L", "Cmc6_s>Pf]]>\u0010", "uI9u?2Hb \u0003\u0004(9x\u00121e\u000eqk'\u000b \u00194k\u0017>vz", "Cmc6_s\u000e>*m\u0010/\b", "uRBu?2Hb \u0003\u0004(9x\u00121e\u000eqk$\n&\u0004Cx\u0010<L", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{>,80-:t\u001a\u0016$0(%2\t1")
public class URangesKt___URangesKt {
    /* JADX INFO: renamed from: coerceAtLeast-5PvTz6A, reason: not valid java name */
    public static final short m10221coerceAtLeast5PvTz6A(short s2, short s3) {
        return Intrinsics.compare((-1) - (((-1) - s2) | ((-1) - 65535)), (-1) - (((-1) - 65535) | ((-1) - s3))) < 0 ? s3 : s2;
    }

    /* JADX INFO: renamed from: coerceAtLeast-J1ME1BU, reason: not valid java name */
    public static final int m10222coerceAtLeastJ1ME1BU(int i2, int i3) {
        return Integer.compareUnsigned(i2, i3) < 0 ? i3 : i2;
    }

    /* JADX INFO: renamed from: coerceAtLeast-Kr8caGY, reason: not valid java name */
    public static final byte m10223coerceAtLeastKr8caGY(byte b2, byte b3) {
        return Intrinsics.compare((-1) - (((-1) - b2) | ((-1) - 255)), 255 & b3) < 0 ? b3 : b2;
    }

    /* JADX INFO: renamed from: coerceAtLeast-eb3DHEI, reason: not valid java name */
    public static final long m10224coerceAtLeasteb3DHEI(long j2, long j3) {
        return Long.compareUnsigned(j2, j3) < 0 ? j3 : j2;
    }

    /* JADX INFO: renamed from: coerceAtMost-5PvTz6A, reason: not valid java name */
    public static final short m10225coerceAtMost5PvTz6A(short s2, short s3) {
        return Intrinsics.compare((s2 + 65535) - (s2 | 65535), (65535 + s3) - (65535 | s3)) > 0 ? s3 : s2;
    }

    /* JADX INFO: renamed from: coerceAtMost-J1ME1BU, reason: not valid java name */
    public static final int m10226coerceAtMostJ1ME1BU(int i2, int i3) {
        return Integer.compareUnsigned(i2, i3) > 0 ? i3 : i2;
    }

    /* JADX INFO: renamed from: coerceAtMost-Kr8caGY, reason: not valid java name */
    public static final byte m10227coerceAtMostKr8caGY(byte b2, byte b3) {
        return Intrinsics.compare((-1) - (((-1) - b2) | ((-1) - 255)), 255 & b3) > 0 ? b3 : b2;
    }

    /* JADX INFO: renamed from: coerceAtMost-eb3DHEI, reason: not valid java name */
    public static final long m10228coerceAtMosteb3DHEI(long j2, long j3) {
        return Long.compareUnsigned(j2, j3) > 0 ? j3 : j2;
    }

    /* JADX INFO: renamed from: coerceIn-JPwROB0, reason: not valid java name */
    public static final long m10229coerceInJPwROB0(long j2, ClosedRange<ULong> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((ULong) RangesKt.coerceIn(ULong.m9148boximpl(j2), (ClosedFloatingPointRange<ULong>) range)).m9206unboximpl();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        return Long.compareUnsigned(j2, ((ULong) range.getStart()).m9206unboximpl()) < 0 ? ((ULong) range.getStart()).m9206unboximpl() : Long.compareUnsigned(j2, ((ULong) range.getEndInclusive()).m9206unboximpl()) > 0 ? ((ULong) range.getEndInclusive()).m9206unboximpl() : j2;
    }

    /* JADX INFO: renamed from: coerceIn-VKSA0NQ, reason: not valid java name */
    public static final short m10230coerceInVKSA0NQ(short s2, short s3, short s4) {
        int i2 = (s3 + 65535) - (s3 | 65535);
        int i3 = s4 & 65535;
        if (Intrinsics.compare(i2, i3) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UShort.m9305toStringimpl(s4)) + " is less than minimum " + ((Object) UShort.m9305toStringimpl(s3)) + '.');
        }
        int i4 = (65535 + s2) - (65535 | s2);
        return Intrinsics.compare(i4, i2) < 0 ? s3 : Intrinsics.compare(i4, i3) > 0 ? s4 : s2;
    }

    /* JADX INFO: renamed from: coerceIn-WZ9TVnA, reason: not valid java name */
    public static final int m10231coerceInWZ9TVnA(int i2, int i3, int i4) {
        if (Integer.compareUnsigned(i3, i4) <= 0) {
            return Integer.compareUnsigned(i2, i3) < 0 ? i3 : Integer.compareUnsigned(i2, i4) > 0 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UInt.m9121toStringimpl(i4)) + " is less than minimum " + ((Object) UInt.m9121toStringimpl(i3)) + '.');
    }

    /* JADX INFO: renamed from: coerceIn-b33U2AM, reason: not valid java name */
    public static final byte m10232coerceInb33U2AM(byte b2, byte b3, byte b4) {
        int i2 = (-1) - (((-1) - b3) | ((-1) - 255));
        int i3 = (-1) - (((-1) - b4) | ((-1) - 255));
        if (Intrinsics.compare(i2, i3) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UByte.m9042toStringimpl(b4)) + " is less than minimum " + ((Object) UByte.m9042toStringimpl(b3)) + '.');
        }
        int i4 = (b2 + 255) - (255 | b2);
        return Intrinsics.compare(i4, i2) < 0 ? b3 : Intrinsics.compare(i4, i3) > 0 ? b4 : b2;
    }

    /* JADX INFO: renamed from: coerceIn-sambcqE, reason: not valid java name */
    public static final long m10233coerceInsambcqE(long j2, long j3, long j4) {
        if (Long.compareUnsigned(j3, j4) <= 0) {
            return Long.compareUnsigned(j2, j3) < 0 ? j3 : Long.compareUnsigned(j2, j4) > 0 ? j4 : j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) ULong.m9200toStringimpl(j4)) + " is less than minimum " + ((Object) ULong.m9200toStringimpl(j3)) + '.');
    }

    /* JADX INFO: renamed from: coerceIn-wuiCnnA, reason: not valid java name */
    public static final int m10234coerceInwuiCnnA(int i2, ClosedRange<UInt> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((UInt) RangesKt.coerceIn(UInt.m9069boximpl(i2), (ClosedFloatingPointRange<UInt>) range)).m9127unboximpl();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        return Integer.compareUnsigned(i2, ((UInt) range.getStart()).m9127unboximpl()) < 0 ? ((UInt) range.getStart()).m9127unboximpl() : Integer.compareUnsigned(i2, ((UInt) range.getEndInclusive()).m9127unboximpl()) > 0 ? ((UInt) range.getEndInclusive()).m9127unboximpl() : i2;
    }

    /* JADX INFO: renamed from: contains-68kG9v0, reason: not valid java name */
    public static final boolean m10235contains68kG9v0(UIntRange contains, byte b2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m10208containsWZ4Q5Ns(UInt.m9075constructorimpl((b2 + 255) - (b2 | 255)));
    }

    /* JADX INFO: renamed from: contains-GYNo2lE, reason: not valid java name */
    private static final boolean m10236containsGYNo2lE(ULongRange contains, ULong uLong) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return uLong != null && contains.m10217containsVKZWuLQ(uLong.m9206unboximpl());
    }

    /* JADX INFO: renamed from: contains-Gab390E, reason: not valid java name */
    public static final boolean m10237containsGab390E(ULongRange contains, int i2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m10217containsVKZWuLQ(ULong.m9154constructorimpl((-1) - (((-1) - ((long) i2)) | ((-1) - 4294967295L))));
    }

    /* JADX INFO: renamed from: contains-ULb-yJY, reason: not valid java name */
    public static final boolean m10238containsULbyJY(ULongRange contains, byte b2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m10217containsVKZWuLQ(ULong.m9154constructorimpl(((long) b2) & 255));
    }

    /* JADX INFO: renamed from: contains-ZsK3CEQ, reason: not valid java name */
    public static final boolean m10239containsZsK3CEQ(UIntRange contains, short s2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m10208containsWZ4Q5Ns(UInt.m9075constructorimpl((s2 + 65535) - (s2 | 65535)));
    }

    /* JADX INFO: renamed from: contains-biwQdVI, reason: not valid java name */
    private static final boolean m10240containsbiwQdVI(UIntRange contains, UInt uInt) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return uInt != null && contains.m10208containsWZ4Q5Ns(uInt.m9127unboximpl());
    }

    /* JADX INFO: renamed from: contains-fz5IDCE, reason: not valid java name */
    public static final boolean m10241containsfz5IDCE(UIntRange contains, long j2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return ULong.m9154constructorimpl(j2 >>> 32) == 0 && contains.m10208containsWZ4Q5Ns(UInt.m9075constructorimpl((int) j2));
    }

    /* JADX INFO: renamed from: contains-uhHAxoY, reason: not valid java name */
    public static final boolean m10242containsuhHAxoY(ULongRange contains, short s2) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        long j2 = s2;
        return contains.m10217containsVKZWuLQ(ULong.m9154constructorimpl((j2 + WebSocketProtocol.PAYLOAD_SHORT_MAX) - (j2 | WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    /* JADX INFO: renamed from: downTo-5PvTz6A, reason: not valid java name */
    public static final UIntProgression m10243downTo5PvTz6A(short s2, short s3) {
        return UIntProgression.Companion.m10205fromClosedRangeNkh28Cs(UInt.m9075constructorimpl((-1) - (((-1) - s2) | ((-1) - 65535))), UInt.m9075constructorimpl((s3 + 65535) - (s3 | 65535)), -1);
    }

    /* JADX INFO: renamed from: downTo-J1ME1BU, reason: not valid java name */
    public static final UIntProgression m10244downToJ1ME1BU(int i2, int i3) {
        return UIntProgression.Companion.m10205fromClosedRangeNkh28Cs(i2, i3, -1);
    }

    /* JADX INFO: renamed from: downTo-Kr8caGY, reason: not valid java name */
    public static final UIntProgression m10245downToKr8caGY(byte b2, byte b3) {
        return UIntProgression.Companion.m10205fromClosedRangeNkh28Cs(UInt.m9075constructorimpl((-1) - (((-1) - b2) | ((-1) - 255))), UInt.m9075constructorimpl((-1) - (((-1) - b3) | ((-1) - 255))), -1);
    }

    /* JADX INFO: renamed from: downTo-eb3DHEI, reason: not valid java name */
    public static final ULongProgression m10246downToeb3DHEI(long j2, long j3) {
        return ULongProgression.Companion.m10214fromClosedRange7ftBX0g(j2, j3, -1L);
    }

    public static final int first(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            throw new NoSuchElementException("Progression " + uIntProgression + " is empty.");
        }
        return uIntProgression.m10203getFirstpVg5ArA();
    }

    public static final long first(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            throw new NoSuchElementException("Progression " + uLongProgression + " is empty.");
        }
        return uLongProgression.m10212getFirstsVKNKU();
    }

    public static final UInt firstOrNull(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.m9069boximpl(uIntProgression.m10203getFirstpVg5ArA());
    }

    public static final ULong firstOrNull(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.m9148boximpl(uLongProgression.m10212getFirstsVKNKU());
    }

    public static final int last(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            throw new NoSuchElementException("Progression " + uIntProgression + " is empty.");
        }
        return uIntProgression.m10204getLastpVg5ArA();
    }

    public static final long last(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            throw new NoSuchElementException("Progression " + uLongProgression + " is empty.");
        }
        return uLongProgression.m10213getLastsVKNKU();
    }

    public static final UInt lastOrNull(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.m9069boximpl(uIntProgression.m10204getLastpVg5ArA());
    }

    public static final ULong lastOrNull(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.m9148boximpl(uLongProgression.m10213getLastsVKNKU());
    }

    private static final int random(UIntRange uIntRange) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        return URangesKt.random(uIntRange, Random.Default);
    }

    public static final int random(UIntRange uIntRange, Random random) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return URandomKt.nextUInt(random, uIntRange);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    private static final long random(ULongRange uLongRange) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        return URangesKt.random(uLongRange, Random.Default);
    }

    public static final long random(ULongRange uLongRange, Random random) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return URandomKt.nextULong(random, uLongRange);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    private static final UInt randomOrNull(UIntRange uIntRange) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        return URangesKt.randomOrNull(uIntRange, Random.Default);
    }

    public static final UInt randomOrNull(UIntRange uIntRange, Random random) {
        Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (uIntRange.isEmpty()) {
            return null;
        }
        return UInt.m9069boximpl(URandomKt.nextUInt(random, uIntRange));
    }

    private static final ULong randomOrNull(ULongRange uLongRange) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        return URangesKt.randomOrNull(uLongRange, Random.Default);
    }

    public static final ULong randomOrNull(ULongRange uLongRange, Random random) {
        Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if (uLongRange.isEmpty()) {
            return null;
        }
        return ULong.m9148boximpl(URandomKt.nextULong(random, uLongRange));
    }

    public static final UIntProgression reversed(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        return UIntProgression.Companion.m10205fromClosedRangeNkh28Cs(uIntProgression.m10204getLastpVg5ArA(), uIntProgression.m10203getFirstpVg5ArA(), -uIntProgression.getStep());
    }

    public static final ULongProgression reversed(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        return ULongProgression.Companion.m10214fromClosedRange7ftBX0g(uLongProgression.m10213getLastsVKNKU(), uLongProgression.m10212getFirstsVKNKU(), -uLongProgression.getStep());
    }

    public static final UIntProgression step(UIntProgression uIntProgression, int i2) {
        Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        RangesKt.checkStepIsPositive(i2 > 0, Integer.valueOf(i2));
        UIntProgression.Companion companion = UIntProgression.Companion;
        int iM10203getFirstpVg5ArA = uIntProgression.m10203getFirstpVg5ArA();
        int iM10204getLastpVg5ArA = uIntProgression.m10204getLastpVg5ArA();
        if (uIntProgression.getStep() <= 0) {
            i2 = -i2;
        }
        return companion.m10205fromClosedRangeNkh28Cs(iM10203getFirstpVg5ArA, iM10204getLastpVg5ArA, i2);
    }

    public static final ULongProgression step(ULongProgression uLongProgression, long j2) {
        long j3 = j2;
        Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        RangesKt.checkStepIsPositive(j3 > 0, Long.valueOf(j3));
        ULongProgression.Companion companion = ULongProgression.Companion;
        long jM10212getFirstsVKNKU = uLongProgression.m10212getFirstsVKNKU();
        long jM10213getLastsVKNKU = uLongProgression.m10213getLastsVKNKU();
        if (uLongProgression.getStep() <= 0) {
            j3 = -j3;
        }
        return companion.m10214fromClosedRange7ftBX0g(jM10212getFirstsVKNKU, jM10213getLastsVKNKU, j3);
    }

    /* JADX INFO: renamed from: until-5PvTz6A, reason: not valid java name */
    public static final UIntRange m10247until5PvTz6A(short s2, short s3) {
        return Intrinsics.compare((-1) - (((-1) - s3) | ((-1) - 65535)), 0) <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange(UInt.m9075constructorimpl((s2 + 65535) - (s2 | 65535)), UInt.m9075constructorimpl(UInt.m9075constructorimpl(r1) - 1), null);
    }

    /* JADX INFO: renamed from: until-J1ME1BU, reason: not valid java name */
    public static final UIntRange m10248untilJ1ME1BU(int i2, int i3) {
        return Integer.compareUnsigned(i3, 0) <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange(i2, UInt.m9075constructorimpl(i3 - 1), null);
    }

    /* JADX INFO: renamed from: until-Kr8caGY, reason: not valid java name */
    public static final UIntRange m10249untilKr8caGY(byte b2, byte b3) {
        return Intrinsics.compare((-1) - (((-1) - b3) | ((-1) - 255)), 0) <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange(UInt.m9075constructorimpl((b2 + 255) - (b2 | 255)), UInt.m9075constructorimpl(UInt.m9075constructorimpl(r2) - 1), null);
    }

    /* JADX INFO: renamed from: until-eb3DHEI, reason: not valid java name */
    public static final ULongRange m10250untileb3DHEI(long j2, long j3) {
        if (Long.compareUnsigned(j3, 0L) <= 0) {
            return ULongRange.Companion.getEMPTY();
        }
        long j4 = 1;
        return new ULongRange(j2, ULong.m9154constructorimpl(j3 - ULong.m9154constructorimpl((j4 + 4294967295L) - (j4 | 4294967295L))), null);
    }
}
