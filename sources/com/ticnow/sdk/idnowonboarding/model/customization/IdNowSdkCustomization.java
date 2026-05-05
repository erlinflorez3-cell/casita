package com.ticnow.sdk.idnowonboarding.model.customization;

import com.google.gson.annotations.SerializedName;
import com.ticnow.sdk.idnowonboarding.R;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005%4\u0012\u000e\u0007nj?4Z͜x.\u0001Rb\u000ex<7ż_$\u007fC\fq(~:\t}P\u001ek-N1ŗOǇ\n\"\u0001̓DK[{k\u0016/4HtM9\u001e\fK@xtd\rV6`<Pږ\rʀ.T\u0018͌\u0013EQ\u0015 :`r@]\u001bYő\u001e "}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K-D", "", "u(E", "0`R8Z9Hc\"}Xh3\u0007\u0016", "", "5dc\u000fT*DU&\t\u000bg+Z\u00136o\r", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "Ata3T*>", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K--2G,\t(G\u0002\u0011", "5dc h9?O\u0017~", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9{B-\u001fpeN\u0003r0X\u007fp+K76n@qCq\"h\u001dX3\u0011\u001aUP(xMu\r\u00189J}9hV", "Adc h9?O\u0017~", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AKyC(\u001dlv5\u0016g6W@\u000bF5X>JQx\u001b$ i\u0018V/\"\u0001hE.w\u0003%/\u0015-E\u007f;>D|", "!ta3T*>", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IdNowSdkCustomization {

    @SerializedName(alternate = {}, value = "\t\u0007\b\u000f\n\u0014\u0010\u0015\r\u0002_\u000b\u0007\t\u000b")
    @InterfaceC1492Gx
    private String backgroundColor = "#AEAEAE";

    @SerializedName(alternate = {}, value = "\u001a\u001b\u0017\n\u0004\u0005\u0006")
    @InterfaceC1492Gx
    private Surface surface = new Surface();

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Яf\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u0006\u0013nj?3Le^.ZS0\u0012s{J$c$wFCU0}*\tUQog\u0005Jb\u000bI\u0012\u000e\u0016\u000fj4I[{e\u0012\u001d8JoE6UoS9ht<\u000b(288\u0002\u0005\u0007\u001d2H&v\u0003CQ\u0018(ؓpphQETKaZO\tkMk+(QɇLlk:\u007f?\u0011jZNUaf\u0001\f\u0011\u001dÞ3˼zm&ѨX9;\u00183W#\tX`M\t\u0010\u000eK\f\u0001'U3\u007fw\u0016:/ä Ʀ/[\u0015ƞ\u000b(b\u000e_j,)1ZqW!*6\u0005\u0013{;J:\u0012D+\u001f͛9բj\u0014\u0016ޗ\rtYO^\u0012~D\u0006\foHgA\u000eFC9Iz\bey\u001d%ѡ\b˿\u0011*+Ч\u0007#ai\u001cv5\u001dZ\u000f_I\"\\Kaf\n\bW$\b/fX×\u0010ΥK\f7Ʌ)0\u001d@EwY%'\t\u0010f\u0015\u0004\u0005$xh\u0002\n\tL~&EݳCҊ\r\u0018bե|\u0007qqbzL\u0013S?b+N$!EtwjG[\u0014\rS?ȑvܷa\u0016-Ä~9_\u0016y6w;d\\C{4,o}\u000f\u0014mh\u0019\t\u0017j\u0019͵\u0018Ⱥ`4*õ`l\u0016%\nrn\u000e\u0019aM\"lP:b1\\Cz9\"\u0001ESȉk˖l\u001c\u0007ԞK&\t\u001d2))\u0003V\u0012~&8\u0015Wc\u0015`PYwUs\u001d|Ŧ.מ8\t+Ȕ\u0017u\u0006\u007fuzgNrO\u0004\u0006L<$TQQ]xI\u0013=-\tĐ9։P~mʸe\u0014-7\u000b7/=nluG;\r:!\u0003J}\u0016M&5bIׄ\u0014ܐ\u0004\u0006i¿\u0013Ii\u0017\u0019\u001f^KxGg\u0002ҧ<L"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K--2G,\t(G\u0002\u0011", "", "u(E", "0`R85<Mb#\b", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K--2G,\t(G\u0002yE|\n\u001cjEy\u007fL_e", "5dc\u000fT*D0)\u000e\nh5", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9{B-\u001fpeN\u0003r0X\u007fp+K76n@qCq\"h\u001dX3\u0011\u001aUP(xMu\r\u00189J}9h?h\u0012\f;G\u0001Qe\u001aPO", "Adc\u000fT*D0)\u000e\nh5", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AKyC(\u001dlv5\u0016g6W@\u000bF5X>JQx\u001b$ i\u0018V/\"\u0001hE.w\u0003%/\u0015-E\u007f;']\b\u0014\u0014\u0012z\u007fQ`\u0019\u001d=\u0006", "0`R8Z9Hc\"}Xh3\u0007\u0016", "", "5dc\u000fT*DU&\t\u000bg+Z\u00136o\r", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "0tcAb5", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K--2G,\t(G\u0002yE\u0011\u001b%\u0018>@", "5dc\u000fh;M]\"", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9{B-\u001fpeN\u0003r0X\u007fp+K76n@qCq\"h\u001dX3\u0011\u001aUP(xMu\r\u00189J}9h?h&\u001dDty\u0018", "Adc\u000fh;M]\"", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AKyC(\u001dlv5\u0016g6W@\u000bF5X>JQx\u001b$ i\u0018V/\"\u0001hE.w\u0003%/\u0015-E\u007f;']\u001c%\u001d?sF\u0006G", "1k^@X\tNb(\t\u0004", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K--2G,\t(G\u0002yF\b\u0016$\u000e\u0012z\u007fQ`\u0019\u001d", "5dc\u0010_6LSu\u000f\nm6\u0006", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9{B-\u001fpeN\u0003r0X\u007fp+K76n@qCq\"h\u001dX3\u0011\u001aUP(xMu\r\u00189J}9h?i\u001d\u0018CjMRe\u001fQ\u0003j", "Adc\u0010_6LSu\u000f\nm6\u0006", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AKyC(\u001dlv5\u0016g6W@\u000bF5X>JQx\u001b$ i\u0018V/\"\u0001hE.w\u0003%/\u0015-E\u007f;'^\u0013 \u001c5G\u0001Qe\u001aPOXf", "2db0e0Ib\u001d\t\u0004", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K--2G,\t(G\u0002yG\u0001\u001a\u0014\u001b9u\u007fF`\u0019\u001d", "5dc\u0011X:<`\u001d\n\nb6\u0006", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9{B-\u001fpeN\u0003r0X\u007fp+K76n@qCq\"h\u001dX3\u0011\u001aUP(xMu\r\u00189J}9h?j\u0016\u001c3wtMe\u0014Q\u0003j", "Adc\u0011X:<`\u001d\n\nb6\u0006", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AKyC(\u001dlv5\u0016g6W@\u000bF5X>JQx\u001b$ i\u0018V/\"\u0001hE.w\u0003%/\u0015-E\u007f;'_\f$\fBn{QZ\u001aPOXf", "2mX\u000fT*D", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K--2G,\t(G\u0002yG\n\u0010r\n3pF", "5dc\u0011a0\u001bO\u0017\u0005", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9{B-\u001fpeN\u0003r0X\u007fp+K76n@qCq\"h\u001dX3\u0011\u001aUP(xMu\r\u00189J}9h?j\u001f\u0012\u0012fnH,", "Adc\u0011a0\u001bO\u0017\u0005", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AKyC(\u001dlv5\u0016g6W@\u000bF5X>JQx\u001b$ i\u0018V/\"\u0001hE.w\u0003%/\u0015-E\u007f;'_\u0015\u001aj1hv\u0018\u001a\u0001", "2mX\u0013e6Gb", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K--2G,\t(G\u0002yG\n\u0010v\u001b?s\u007f\u0018", "5dc\u0011a0\u001f`#\b\n", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9{B-\u001fpeN\u0003r0X\u007fp+K76n@qCq\"h\u001dX3\u0011\u001aUP(xMu\r\u00189J}9h?j\u001f\u0012\u0016wzKee", "Adc\u0011a0\u001f`#\b\n", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AKyC(\u001dlv5\u0016g6W@\u000bF5X>JQx\u001b$ i\u0018V/\"\u0001hE.w\u0003%/\u0015-E\u007f;'_\u0015\u001anBtyQ,S8", "3mc2e7KW'~ah.\u0007", "", "5dc\u0012a;>`$\f~l,c\u00131o", "u(8", "Adc\u0012a;>`$\f~l,c\u00131o", "uH\u0018#", "6h]A", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K--2G,\t(G\u0002yK\u0005\u0015%c", "5dc\u0015\\5M", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9{B-\u001fpeN\u0003r0X\u007fp+K76n@qCq\"h\u001dX3\u0011\u001aUP(xMu\r\u00189J}9h?n\u001a\u0017D@", "Adc\u0015\\5M", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AKyC(\u001dlv5\u0016g6W@\u000bF5X>JQx\u001b$ i\u0018V/\"\u0001hE.w\u0003%/\u0015-E\u007f;'c\u0010\u001f\u001d\u000b.a", ";`a4\\5", "5dc\u001aT9@W\"", "Adc\u001aT9@W\"", "BdgA<5Ic(", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K--2G,\t(G\u0002yW\u0001\u001f%q>u\u0001Q,", "5dc!X?M7\"\n\u000bm", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9{B-\u001fpeN\u0003r0X\u007fp+K76n@qCq\"h\u001dX3\u0011\u001aUP(xMu\r\u00189J}9h?z\u0016!DNyMf\u001f\u001d", "Adc!X?M7\"\n\u000bm", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AKyC(\u001dlv5\u0016g6W@\u000bF5X>JQx\u001b$ i\u0018V/\"\u0001hE.w\u0003%/\u0015-E\u007f;'o\f)\u001d\u0019s{Ree\u000bj", "BhcA_,", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K--2G,\t(G\u0002yW\u0005\u001b%\u00155@", "5dc!\\;MZ\u0019", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)!Pl\u00188\u0004$9b\u007fi?w\u0015.T\r9{B-\u001fpeN\u0003r0X\u007fp+K76n@qCq\"h\u001dX3\u0011\u001aUP(xMu\r\u00189J}9h?z\u001a\u001dDqp\u0018", "Adc!\\;MZ\u0019", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013! Dy\nIu)>[G(Al\u00165\u0017AKyC(\u001dlv5\u0016g6W@\u000bF5X>JQx\u001b$ i\u0018V/\"\u0001hE.w\u0003%/\u0015-E\u007f;'o\u0010%\u001d<jF\u0006G", "\u0010`R85<Mb#\b", "\u0010tcAb5", "\u0011k^@X\tNb(\t\u0004", "\u0012db0e0Ib\u001d\t\u0004", "\u0012mX\u000fT*D", "\u0012mX\u0013e6Gb", "\u0016h]A", "\"dgA<5Ic(", "\"hcA_,", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class Surface {

        @SerializedName(alternate = {}, value = "\t\u0007\b\u000f\n\u0014\u0010\u0015\r\u0002_\u000b\u0007\t\u000b")
        @InterfaceC1492Gx
        private String backgroundColor = "#FFFFFF";

        @SerializedName(alternate = {}, value = "\u0014\u0007\u0017\u000b\f\u0010")
        @InterfaceC1492Gx
        private int margin = 20;

        @SerializedName(alternate = {}, value = "\t\u0007\b\u000fd\u0017\u0015\u0014\u000e\f")
        @InterfaceC1492Gx
        private BackButton backButton = new BackButton();

        @SerializedName(alternate = {}, value = "\f\u0014\u0019\t\u0015\u0012\u0013\t\u0012\u0003h\u000b\u0002\t")
        @InterfaceC1492Gx
        private int enterpriseLogo = R.drawable.ic_enterprise_logo;

        @SerializedName(alternate = {}, value = "\n\u0012\u0014\u0017\bc\u0016\u0014\u0013\r\u000b")
        @InterfaceC1492Gx
        private CloseButton closeButton = new CloseButton();

        @SerializedName(alternate = {}, value = "\u001b\u000f\u0019\u0018\u000f\u0007")
        @InterfaceC1492Gx
        private Tittle tittle = new Tittle();

        @SerializedName(alternate = {}, value = "\u000b\u000b\u0018\u0007\u0015\u000b\u0011\u0014\b\r\u000b")
        @InterfaceC1492Gx
        private Description description = new Description();

        @SerializedName(alternate = {}, value = "\u000f\u000f\u0013\u0018")
        @InterfaceC1492Gx
        private Hint hint = new Hint();

        @SerializedName(alternate = {}, value = "\t\u001b\u0019\u0018\u0012\u0010")
        @InterfaceC1492Gx
        private Button button = new Button();

        @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018k\u0010\u0011\u0015\u0013")
        @InterfaceC1492Gx
        private TextInput textInput = new TextInput();

        @SerializedName(alternate = {}, value = "\u000b\u0014\u000ei\u0015\u0011\u000f\u0014")
        @InterfaceC1492Gx
        private DniFront dniFront = new DniFront();

        @SerializedName(alternate = {}, value = "\u000b\u0014\u000ee\u0004\u0005\f")
        @InterfaceC1492Gx
        private DniBack dniBack = new DniBack();

        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005%4\u0012\u0006\u0010nj?3Z͜x.\u0001Rj\u0012ө\u007f42[t\u000eQ<m\u001a,$?S\rk>ùVҼ\u000fO\u0017إ.zp/WY\u0019_\u0018\u0014@H@[AT\b=gh+:C$\tĺDѩ\t\r\"ݒ`\u0012|\u0004QU,\u00146K~FŎ\u0011Z"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K--2G,\t(G\u0002yE|\n\u001cjEy\u007fL_e", "", "u(E", "2qPDT)ES", "", "5dc\u0011e(PO\u0016\u0006z", "u(8", "Adc\u0011e(PO\u0016\u0006z", "uH\u0018#", "Dhb6U3>", "", "5dc#\\:BP ~", "u(I", "Adc#\\:BP ~", "uY\u0018#", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
        public static final class BackButton {

            @SerializedName(alternate = {}, value = "\u000b\u0018\u0006\u001b\u0004\u0004\r\u0005")
            @InterfaceC1492Gx
            private int drawable = R.drawable.ic_back;

            @SerializedName(alternate = {}, value = "\u001d\u000f\u0018\r\u0005\u000e\u0006")
            @InterfaceC1492Gx
            private boolean visible = true;

            public final int getDrawable() {
                return this.drawable;
            }

            public final boolean getVisible() {
                return this.visible;
            }

            public final void setDrawable(int i2) {
                this.drawable = i2;
            }

            public final void setVisible(boolean z2) {
                this.visible = z2;
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u00051Bߚ(\u0007\u0015iy3ǲiH<R$F\u001dl\u00144R]Zu\u0002?,ۄ\ǹ\r[Vʴ\u007fpP]\u0019G/\b\u001c}x2\u001aq\u0007d*\u000f`D&CqQFޑEžxB\rړJ$>\u0002\u0013\u0005:,N\u0019\u0005\u0001\u0014g\u001a\u001cH@\u001f<\t\u0011\f\tpŏ\u0012̧$\r&ձ\u007fP<SzaZ1)\u000fwH\u001fCm=\u0015M;H\u000b+Kz8Ӥ7Ë;A\u001dǬk\u0005\r`iC#AwL\u0013nwC9Y\fWdZ6\u0018S/&՝ię*h\rĩx\u000e-<]gkR\u0014:\u0006\u0001Ա\u0011O"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K--2G,\t(G\u0002yE\u0011\u001b%\u0018>@", "", "u(E", "0`R8Z9Hc\"}Xh3\u0007\u0016\u000ei\u000e$xG\u0001\u0016", "", "5dc\u000fT*DU&\t\u000bg+Z\u00136o\r\u0007\u007fN|\u0014\u001eGn", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r\u0007\u007fN|\u0014\u001eGn", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "0`R8Z9Hc\"}Xh3\u0007\u0016\u000fn{%\u0003@\u007f", "5dc\u000fT*DU&\t\u000bg+Z\u00136o\r\b\u0005<}\u001e\u0017F", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r\b\u0005<}\u001e\u0017F", "BdgA66E]&]~l(y\u0010/d", "5dc!X?M1#\u0006\u0005k\u000b\u0001\u0017+b\u0007(z", "Adc!X?M1#\u0006\u0005k\u000b\u0001\u0017+b\u0007(z", "BdgA66E]&^\u0004Z)\u0004\t.", "5dc!X?M1#\u0006\u0005k\f\u0006\u0005,l\u007f'", "Adc!X?M1#\u0006\u0005k\f\u0006\u0005,l\u007f'", "BhcA_,\u001f]\"\u000e[Z4\u0001\u0010C", "5dc!\\;MZ\u0019_\u0005g;]\u00057i\u0007<", "Adc!\\;MZ\u0019_\u0005g;]\u00057i\u0007<", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
        public static final class Button {

            @SerializedName(alternate = {}, value = "\t\u0007\b\u000f\n\u0014\u0010\u0015\r\u0002_\u000b\u0007\t\u000b\\\u0005vv\u007fwu")
            @InterfaceC1492Gx
            private String backgroundColorEnabled = "#41B17D";

            @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018e\u0011\r\u000f\u0011b\u000b||\u0006}{")
            @InterfaceC1492Gx
            private String textColorEnabled = "#FFFFFF";

            @SerializedName(alternate = {}, value = "\t\u0007\b\u000f\n\u0014\u0010\u0015\r\u0002_\u000b\u0007\t\u000b[\u007f\tuu~vt")
            @InterfaceC1492Gx
            private String backgroundColorDisabled = "#AEAEAE";

            @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018e\u0011\r\u000f\u0011a\u0006\u000f{{\u0005|z")
            @InterfaceC1492Gx
            private String textColorDisabled = "#FFFFFF";

            @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018h\u0011\u000f\u0014d~\n\u0005\u0007\u0013")
            @InterfaceC1492Gx
            private String tittleFontFamily = "avenirltstd_book_0";

            public final String getBackgroundColorDisabled() {
                return this.backgroundColorDisabled;
            }

            public final String getBackgroundColorEnabled() {
                return this.backgroundColorEnabled;
            }

            public final String getTextColorDisabled() {
                return this.textColorDisabled;
            }

            public final String getTextColorEnabled() {
                return this.textColorEnabled;
            }

            public final String getTittleFontFamily() {
                return this.tittleFontFamily;
            }

            public final void setBackgroundColorDisabled(String str) {
                Intrinsics.checkParameterIsNotNull(str, "<set-?>");
                this.backgroundColorDisabled = str;
            }

            public final void setBackgroundColorEnabled(String str) {
                Intrinsics.checkParameterIsNotNull(str, "<set-?>");
                this.backgroundColorEnabled = str;
            }

            public final void setTextColorDisabled(String str) {
                Intrinsics.checkParameterIsNotNull(str, "<set-?>");
                this.textColorDisabled = str;
            }

            public final void setTextColorEnabled(String str) {
                Intrinsics.checkParameterIsNotNull(str, "<set-?>");
                this.textColorEnabled = str;
            }

            public final void setTittleFontFamily(String str) {
                Intrinsics.checkParameterIsNotNull(str, "<set-?>");
                this.tittleFontFamily = str;
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005%4\u0012\u0006\u0010nj?3Z͜x.\u0001Rj\u0012ө\u007f42[t\u000eQ<m\u001a,$?S\rk>ùVҼ\u000fO\u0017إ.zp/WY\u0019_\u0018\u0014@H@[AT\b=gh+:C$\tĺDѩ\t\r\"ݒ`\u0012|\u0004QU,\u00146K~FŎ\u0011Z"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K--2G,\t(G\u0002yF\b\u0016$\u000e\u0012z\u007fQ`\u0019\u001d", "", "u(E", "2qPDT)ES", "", "5dc\u0011e(PO\u0016\u0006z", "u(8", "Adc\u0011e(PO\u0016\u0006z", "uH\u0018#", "Dhb6U3>", "", "5dc#\\:BP ~", "u(I", "Adc#\\:BP ~", "uY\u0018#", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
        public static final class CloseButton {

            @SerializedName(alternate = {}, value = "\u000b\u0018\u0006\u001b\u0004\u0004\r\u0005")
            @InterfaceC1492Gx
            private int drawable = R.drawable.ic_close;

            @SerializedName(alternate = {}, value = "\u001d\u000f\u0018\r\u0005\u000e\u0006")
            @InterfaceC1492Gx
            private boolean visible = true;

            public final int getDrawable() {
                return this.drawable;
            }

            public final boolean getVisible() {
                return this.visible;
            }

            public final void setDrawable(int i2) {
                this.drawable = i2;
            }

            public final void setVisible(boolean z2) {
                this.visible = z2;
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005(4\u0012\u0006\fnj?6Z͜x.\u0001Rj\u0012ө\u007f42[t\u000eQ<m\u001a,$?S\rk>ùVҼ\u000fO\u0017إ.zp/WY\u0019_\u0018\u0014@H@[AT\b=gb+:C$\tĺDѩ\t\r\"ݒ`\u0012|\u0003QO,\u00146I~@#)[\u000f2\u00124IV\u0005\\`>\u07b6BՂpiBǂ;\u0005oN\\4\u007f2\u0003[\u001bU%C\u001b\u0007y\u001eYKm9S)*ΐ\u0013қ_K\u000bӊ\n?\u000by54KKyiDgą\u0018("}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K--2G,\t(G\u0002yG\u0001\u001a\u0014\u001b9u\u007fF`\u0019\u001d", "", "u(E", "BdgA66E]&", "", "5dc!X?M1#\u0006\u0005k", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc!X?M1#\u0006\u0005k", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "BdgA96Gbyz\u0003b3\u0011", "5dc!X?M4#\b\n?(\u0005\r6y", "Adc!X?M4#\b\n?(\u0005\r6y", "BdgAF0SS", "", "5dc!X?MA\u001d\u0014z", "u(5", "Adc!X?MA\u001d\u0014z", "uE\u0018#", "BdgAF7:Q\u001d\b|", "5dc!X?MA$zxb5~", "Adc!X?MA$zxb5~", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
        public static final class Description {

            @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018u\u0012\u0002\u0003\b\f\u0004")
            @InterfaceC1492Gx
            private float textSpacing;

            @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018e\u0011\r\u000f\u0011")
            @InterfaceC1492Gx
            private String textColor = "#000000";

            @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018u\u000b\u001b\u0005")
            @InterfaceC1492Gx
            private float textSize = 14.0f;

            @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018h\u0011\u000f\u0014d~\n\u0005\u0007\u0013")
            @InterfaceC1492Gx
            private String textFontFamily = "avenirltstd_book_0";

            public final String getTextColor() {
                return this.textColor;
            }

            public final String getTextFontFamily() {
                return this.textFontFamily;
            }

            public final float getTextSize() {
                return this.textSize;
            }

            public final float getTextSpacing() {
                return this.textSpacing;
            }

            public final void setTextColor(String str) {
                Intrinsics.checkParameterIsNotNull(str, "<set-?>");
                this.textColor = str;
            }

            public final void setTextFontFamily(String str) {
                Intrinsics.checkParameterIsNotNull(str, "<set-?>");
                this.textFontFamily = str;
            }

            public final void setTextSize(float f2) {
                this.textSize = f2;
            }

            public final void setTextSpacing(float f2) {
                this.textSpacing = f2;
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005(Bߚ(\u0007\u0015iy3ǲiH<R$F\u001dl\u00144R]Zu\u0002?,ۄ\ǹ\r[Vʴ\u007fpP]\u0019G/\b\u001c}x2\u001aq\u0007d*\u000f`D&CqQFޑEžxB\rړJ$>\u0002\u0013\u0005:,N\u0019\u0005\u0001ŸO\u0016"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K--2G,\t(G\u0002yG\n\u0010r\n3pF", "", "u(E", "4qP:X", "", "5dc\u0013e(FS", "u(8", "Adc\u0013e(FS", "uH\u0018#", "6h]A", "5dc\u0015\\5M", "Adc\u0015\\5M", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
        public static final class DniBack {

            @SerializedName(alternate = {}, value = "\r\u0018\u0006\u0011\b")
            @InterfaceC1492Gx
            private int frame = R.drawable.ic_dni_frame;

            @SerializedName(alternate = {}, value = "\u000f\u000f\u0013\u0018")
            @InterfaceC1492Gx
            private int hint = R.drawable.ic_dni_back;

            public final int getFrame() {
                return this.frame;
            }

            public final int getHint() {
                return this.hint;
            }

            public final void setFrame(int i2) {
                this.frame = i2;
            }

            public final void setHint(int i2) {
                this.hint = i2;
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005(Bߚ(\u0007\u0015iy3ǲiH<R$F\u001dl\u00144R]Zu\u0002?,ۄ\ǹ\r[Vʴ\u007fpP]\u0019G/\b\u001c}x2\u001aq\u0007d*\u000f`D&CqQFޑEžxB\rړJ$>\u0002\u0013\u0005:,N\u0019\u0005\u0001ŸO\u0016"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K--2G,\t(G\u0002yG\n\u0010v\u001b?s\u007f\u0018", "", "u(E", "4qP:X", "", "5dc\u0013e(FS", "u(8", "Adc\u0013e(FS", "uH\u0018#", "6h]A", "5dc\u0015\\5M", "Adc\u0015\\5M", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
        public static final class DniFront {

            @SerializedName(alternate = {}, value = "\r\u0018\u0006\u0011\b")
            @InterfaceC1492Gx
            private int frame = R.drawable.ic_dni_frame;

            @SerializedName(alternate = {}, value = "\u000f\u000f\u0013\u0018")
            @InterfaceC1492Gx
            private int hint = R.drawable.ic_dni_front;

            public final int getFrame() {
                return this.frame;
            }

            public final int getHint() {
                return this.hint;
            }

            public final void setFrame(int i2) {
                this.frame = i2;
            }

            public final void setHint(int i2) {
                this.hint = i2;
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005(4\u0012\u0006\fnj?6Z͜x.\u0001Rj\u0012ө\u007f42[t\u000eQ<m\u001a,$?S\rk>ùVҼ\u000fO\u0017إ.zp/WY\u0019_\u0018\u0014@H@[AT\b=gb+:C$\tĺDѩ\t\r\"ݒ`\u0012|\u0003QO,\u00146I~@#)[\u000f2\u00124IV\u0005\\`>\u07b6BՂpiBǂ;\u0005oN\\4\u007f2\u0003[\u001bU%C\u001b\u0007y\u001eYKm9S)*ΐ\u0013қ_K\u000bӊ\n?\u000by54KKyiDgą\u0018("}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K--2G,\t(G\u0002yK\u0005\u0015%c", "", "u(E", "BdgA66E]&", "", "5dc!X?M1#\u0006\u0005k", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc!X?M1#\u0006\u0005k", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "BdgA96Gbyz\u0003b3\u0011", "5dc!X?M4#\b\n?(\u0005\r6y", "Adc!X?M4#\b\n?(\u0005\r6y", "BdgAF0SS", "", "5dc!X?MA\u001d\u0014z", "u(5", "Adc!X?MA\u001d\u0014z", "uE\u0018#", "BdgAF7:Q\u001d\b|", "5dc!X?MA$zxb5~", "Adc!X?MA$zxb5~", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
        public static final class Hint {

            @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018u\u0012\u0002\u0003\b\f\u0004")
            @InterfaceC1492Gx
            private float textSpacing;

            @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018e\u0011\r\u000f\u0011")
            @InterfaceC1492Gx
            private String textColor = "#000000";

            @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018u\u000b\u001b\u0005")
            @InterfaceC1492Gx
            private float textSize = 14.0f;

            @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018h\u0011\u000f\u0014d~\n\u0005\u0007\u0013")
            @InterfaceC1492Gx
            private String textFontFamily = "avenirltstd_book_0";

            public final String getTextColor() {
                return this.textColor;
            }

            public final String getTextFontFamily() {
                return this.textFontFamily;
            }

            public final float getTextSize() {
                return this.textSize;
            }

            public final float getTextSpacing() {
                return this.textSpacing;
            }

            public final void setTextColor(String str) {
                Intrinsics.checkParameterIsNotNull(str, "<set-?>");
                this.textColor = str;
            }

            public final void setTextFontFamily(String str) {
                Intrinsics.checkParameterIsNotNull(str, "<set-?>");
                this.textFontFamily = str;
            }

            public final void setTextSize(float f2) {
                this.textSize = f2;
            }

            public final void setTextSpacing(float f2) {
                this.textSpacing = f2;
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005.Bߚ(\u0007\u0015iy3ǲiH<R$F\u001dl\u00144R]Zu\u0002?,ۄ\ǹ\r[Vʴ\u007fpP]\u0019G/\b\u001c}x2\u001aq\u0007d*\u000f`D&CqQFޑEžxB\rړJ$>\u0002\u0013\u0005:,N\u0019\u0005\u0001\u0014g\u001a\u001cH@\u001f<\t\u0011\f\tpŏ\u0012̧$\r&ձ\u007fP<SzaZ1)\u000fwH\u001fCm=\u0015M;H\u000b+Kz8Ӥ7Ë;A\u001dǬk\u0005\r`iC#AwL\u0013nҐ+;"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K--2G,\t(G\u0002yW\u0001\u001f%q>u\u0001Q,", "", "u(E", "0`R8Z9Hc\"}Xh3\u0007\u0016\u000ei\u000e$xG\u0001\u0016", "", "5dc\u000fT*DU&\t\u000bg+Z\u00136o\r\u0007\u007fN|\u0014\u001eGn", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r\u0007\u007fN|\u0014\u001eGn", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "0`R8Z9Hc\"}Xh3\u0007\u0016\u000fn{%\u0003@\u007f", "5dc\u000fT*DU&\t\u000bg+Z\u00136o\r\b\u0005<}\u001e\u0017F", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r\b\u0005<}\u001e\u0017F", "BdgA66E]&]~l(y\u0010/d", "5dc!X?M1#\u0006\u0005k\u000b\u0001\u0017+b\u0007(z", "Adc!X?M1#\u0006\u0005k\u000b\u0001\u0017+b\u0007(z", "BdgA66E]&^\u0004Z)\u0004\t.", "5dc!X?M1#\u0006\u0005k\f\u0006\u0005,l\u007f'", "Adc!X?M1#\u0006\u0005k\f\u0006\u0005,l\u007f'", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
        public static final class TextInput {

            @SerializedName(alternate = {}, value = "\n\u0015\u0011\u0013\u0015")
            @InterfaceC1492Gx
            private String backgroundColorEnabled = "#FFFFFF";

            @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018e\u0011\r\u000f\u0011b\u000b||\u0006}{")
            @InterfaceC1492Gx
            private String textColorEnabled = "#FFFFFF";

            @SerializedName(alternate = {}, value = "\t\u0007\b\u000f\n\u0014\u0010\u0015\r\u0002_\u000b\u0007\t\u000b[\u007f\tuu~vt")
            @InterfaceC1492Gx
            private String backgroundColorDisabled = "#FFFFFF";

            @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018e\u0011\r\u000f\u0011a\u0006\u000f{{\u0005|z")
            @InterfaceC1492Gx
            private String textColorDisabled = "#FFFFFF";

            public final String getBackgroundColorDisabled() {
                return this.backgroundColorDisabled;
            }

            public final String getBackgroundColorEnabled() {
                return this.backgroundColorEnabled;
            }

            public final String getTextColorDisabled() {
                return this.textColorDisabled;
            }

            public final String getTextColorEnabled() {
                return this.textColorEnabled;
            }

            public final void setBackgroundColorDisabled(String str) {
                Intrinsics.checkParameterIsNotNull(str, "<set-?>");
                this.backgroundColorDisabled = str;
            }

            public final void setBackgroundColorEnabled(String str) {
                Intrinsics.checkParameterIsNotNull(str, "<set-?>");
                this.backgroundColorEnabled = str;
            }

            public final void setTextColorDisabled(String str) {
                Intrinsics.checkParameterIsNotNull(str, "<set-?>");
                this.textColorDisabled = str;
            }

            public final void setTextColorEnabled(String str) {
                Intrinsics.checkParameterIsNotNull(str, "<set-?>");
                this.textColorEnabled = str;
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005(4\u0012\u0006\fnj?6Z͜x.\u0001Rj\u0012ө\u007f42[t\u000eQ<m\u001a,$?S\rk>ùVҼ\u000fO\u0017إ.zp/WY\u0019_\u0018\u0014@H@[AT\b=gb+:C$\tĺDѩ\t\r\"ݒ`\u0012|\u0003QO,\u00146I~@#)[\u000f2\u00124IV\u0005\\`>\u07b6BՂpiBǂ;\u0005oN\\4\u007f2\u0003[\u001bU%C\u001b\u0007y\u001eYKm9S)*ΐ\u0013қ_K\u000bӊ\n?\u000by54KKyiDgą\u0018("}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#\u0006*6m\u001dwKSIz>&\u0019}]H\u000bm5\u0018Z&0V`\u001a[XPM\"!d\u0016R@\t\u0014]K--2G,\t(G\u0002yW\u0005\u001b%\u00155@", "", "u(E", "BdgA66E]&", "", "5dc!X?M1#\u0006\u0005k", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc!X?M1#\u0006\u0005k", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "BdgA96Gbyz\u0003b3\u0011", "5dc!X?M4#\b\n?(\u0005\r6y", "Adc!X?M4#\b\n?(\u0005\r6y", "BdgA?0GS\u0007\nv\\0\u0006\u000b", "", "5dc!X?M:\u001d\bzL7x\u00073n\u0002", "u(5", "Adc!X?M:\u001d\bzL7x\u00073n\u0002", "uE\u0018#", "BdgAF0SS", "5dc!X?MA\u001d\u0014z", "Adc!X?MA\u001d\u0014z", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
        public static final class Tittle {

            @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018n\u000b\u000f\u0005q\u000e}~\u0004\b\u007f")
            @InterfaceC1492Gx
            private float textLineSpacing;

            @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018e\u0011\r\u000f\u0011")
            @InterfaceC1492Gx
            private String textColor = "#000000";

            @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018u\u000b\u001b\u0005")
            @InterfaceC1492Gx
            private float textSize = 24.0f;

            @SerializedName(alternate = {}, value = "\u001b\u000b\u001d\u0018h\u0011\u000f\u0014d~\n\u0005\u0007\u0013")
            @InterfaceC1492Gx
            private String textFontFamily = "avenirltstd_book_0";

            public final String getTextColor() {
                return this.textColor;
            }

            public final String getTextFontFamily() {
                return this.textFontFamily;
            }

            public final float getTextLineSpacing() {
                return this.textLineSpacing;
            }

            public final float getTextSize() {
                return this.textSize;
            }

            public final void setTextColor(String str) {
                Intrinsics.checkParameterIsNotNull(str, "<set-?>");
                this.textColor = str;
            }

            public final void setTextFontFamily(String str) {
                Intrinsics.checkParameterIsNotNull(str, "<set-?>");
                this.textFontFamily = str;
            }

            public final void setTextLineSpacing(float f2) {
                this.textLineSpacing = f2;
            }

            public final void setTextSize(float f2) {
                this.textSize = f2;
            }
        }

        public final BackButton getBackButton() {
            return this.backButton;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Button getButton() {
            return this.button;
        }

        public final CloseButton getCloseButton() {
            return this.closeButton;
        }

        public final Description getDescription() {
            return this.description;
        }

        public final DniBack getDniBack() {
            return this.dniBack;
        }

        public final DniFront getDniFront() {
            return this.dniFront;
        }

        public final int getEnterpriseLogo() {
            return this.enterpriseLogo;
        }

        public final Hint getHint() {
            return this.hint;
        }

        public final int getMargin() {
            return this.margin;
        }

        public final TextInput getTextInput() {
            return this.textInput;
        }

        public final Tittle getTittle() {
            return this.tittle;
        }

        public final void setBackButton(BackButton backButton) {
            Intrinsics.checkParameterIsNotNull(backButton, "<set-?>");
            this.backButton = backButton;
        }

        public final void setBackgroundColor(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.backgroundColor = str;
        }

        public final void setButton(Button button) {
            Intrinsics.checkParameterIsNotNull(button, "<set-?>");
            this.button = button;
        }

        public final void setCloseButton(CloseButton closeButton) {
            Intrinsics.checkParameterIsNotNull(closeButton, "<set-?>");
            this.closeButton = closeButton;
        }

        public final void setDescription(Description description) {
            Intrinsics.checkParameterIsNotNull(description, "<set-?>");
            this.description = description;
        }

        public final void setDniBack(DniBack dniBack) {
            Intrinsics.checkParameterIsNotNull(dniBack, "<set-?>");
            this.dniBack = dniBack;
        }

        public final void setDniFront(DniFront dniFront) {
            Intrinsics.checkParameterIsNotNull(dniFront, "<set-?>");
            this.dniFront = dniFront;
        }

        public final void setEnterpriseLogo(int i2) {
            this.enterpriseLogo = i2;
        }

        public final void setHint(Hint hint) {
            Intrinsics.checkParameterIsNotNull(hint, "<set-?>");
            this.hint = hint;
        }

        public final void setMargin(int i2) {
            this.margin = i2;
        }

        public final void setTextInput(TextInput textInput) {
            Intrinsics.checkParameterIsNotNull(textInput, "<set-?>");
            this.textInput = textInput;
        }

        public final void setTittle(Tittle tittle) {
            Intrinsics.checkParameterIsNotNull(tittle, "<set-?>");
            this.tittle = tittle;
        }
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Surface getSurface() {
        return this.surface;
    }

    public final void setBackgroundColor(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.backgroundColor = str;
    }

    public final void setSurface(Surface surface) {
        Intrinsics.checkParameterIsNotNull(surface, "<set-?>");
        this.surface = surface;
    }
}
