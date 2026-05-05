package kotlin.collections.unsigned;

import com.dynatrace.android.agent.Global;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.UnsignedKt;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d̉=!,\b\bDZc|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007|jA0JeP.hS2\u000f\u0002{<$a$yCQU\"}8\tWNmhvJh\u0011K\u000f\f4\u0001j:V]ތe\u0012%2JoE;UoS9htL\u0005(2(N\u0002\u0005\u0017\u001a2H\u0016v\u0003Ca\f\u001a0FwRi\u001b˟\u001d \"\bN /\u001e\u000bfv6vm$?ǥ'\u0005oD\\*wG\u000bձ%Ld)\u001dv\u0010\"Y?_5C*\u001a\b\u07baV]E\tMxU\u001cvѧ?1Yug6\u0007\bB\u0014SO;f9+ػ\tSf\u001656gzYִ&.\b|\f\rj\u0010<\u0005OH\\:`kڿ\u00125z\u0001aOh/lR\u0018z\u0010G?%.4[=)xiai\u0019~=\u0002\u0005\u001b1;\u0001\u001d2\fZ\u0014`#/lw\u007fB\u0018EףLP\u0010nK\u0004\u001c\u001ep\u0012B\u0004^X(/*\u0016^\u001b3Is9Q%\u001c\bNDu\n\u001d`\u0017d\u001aXN@0\u0003.7X\u001aR_ֈh\u0007qgbpD>[,l\u0007,\u0019; \u000b\u0001l%3\"fO\u0017q\u001bSc\n3B~7\b\u007f\u001c\u0014]9lGMQ\u0012!(Wλ\u0018AB{\u0013r~oa\u001cr\\V3ZH\u0019\u001d(\u007fR`$\u0013`K\"\":,?,t\u0015v\u0014NHG|\u0017srh>\u0010\u001b8ʗ\u0007k*\u0010\u0017\u001dhv~\r\u007fxw,%`P.qUC7>UPyzò)ȷ\u0003u\u0006ful_fz3\u000eU*$>\u001agV_A!-\u0017)`\u0013sծRȌiSS35\u001d\u0015\u0014\u001dX\u0001.\u0016\u0010\u0013pZi\u001bN]r/\"%o9ׄ\u000eܐ\u0004{gi\tk{n\u0019xVI!\u000f\u0002<|E-\t-<=\u0001\u001e3Cގ3ϡ+\u001f\u001c\u001d\"U-tk\u0011\b0\u0010a=&\u001de2-*\u001b̔fScZIaal\re:&\u0003\u0002pL\u0013w6GO9٢7JG\u000f~\u0002P`\u0019V\u0016h\u001d+;x~[h\u001c6\u0003ӑ2a0 Q+,qQL)Oif\u001cys\\9WU\u000fν\u007f3t@*l8\u0012e\u0013!2\u001crF6aGhŝJ:L:<>\u0018\u000b\n\u0006\u001888z.G\u0010\u001f%eZ\u007fKX\u001eT'\\fJ\u0015`\f\u0012O^Gϛ\u0015˵\u001d֭\u00985\u0007s{be{m\u000f\u00045\u000b1i}\u0003\u000711לbjC.h\u0003\u001bE$tw4^\u0004u.\u001e{}?P$\r\u001fR\u0018I=a\u0013ovv\u00109\n+̷j˳\u0011צŽR$/6\t5&w\u0018?#\u001beq\u001ejMXTߗEtB\u0007'F9\u0007R.\u0012xC-4>]MW\u001e,3\fYc;,\u00100\"7\u0004;R\u000b\fTѦ\u0010ݺ\u001aŭϦu\u0018h;\u0017Mh[\u0012^bv\t\t\\\u0014V[\b֯\u0010D\u0007_{y1@m\\\u001b8jK\u0017\u0006:sz\u0017\u0007a\u001b\u0005v1\u0005\u0006~/`\u001dOX{bYͅ`щ\u0010֦ޓ\\\u0013\u0006O#b7e\u0016 A\u0012eb\u0017p\u0014O\n\u000e[GyhyE@V$ݙ/y$\u0004X\u0014\u0011\u001dKZS˾t\t\u000bl!\u0018TcɈ,fzM7V\u0015.V\u001c)\u0015JE!\"\r/e\u001eOs\u001b\u0006x\u001b\u0014IO\u008e11\u0001CIv\u001b\u0013\u007f,|֫\u0013:\u0011x^j\t\u000eۥ\u0004i2pT\u0019UI5\u0017<oz\u0002TSm8p\u0011\\)\u001cOGnH$Dю*\u001ciYa\u0001\u0002\u0019\u0011\u0019>ۍ\u007f\u0007G=I\u0012\u001a*ݜ\u0005~\u0007RM@I\u001bH1Ot9.={CW\u0015HUMs\u000b? \u0012iPӭ]c\u0005\u001b\u0010k2=U\"\u007f\u07baP\u007f8+\u0003dLz¡\u0004G7\u00108(tSd=o\u0006<)dnl#um?xԤ0k\u001e>r\u0005yGOD,\u001bZ=X1\u0015\u0007sR/~߃H\u000fK_E:\u001e<A`\u0015\u0012epn3qr{8#bڍ\u0017u\n\u0007@\u000fN\rU\nq,\u001c,@`\fj\u0019z\u0018dݳ<\u0014\u0013Z\u0012'I\u000enNx\u001f.&yvfBb\u070e[r\u000b\u0011P\u00114^ts:=.\u0016\\IG\u0012\f}x!#5WsoG\"X\f!cB\nYLȿmëFʤ߂uZC\tAA\u0006\u0006f\u0004}^\u001bTOO\u00057\u001bɸx\\VMf@**\u001f7<w\rH>I)T6!H<@R\u000fZqa\u0011\u001e/=\u001cF\u00143xė=ؚcɯӘ;Yt#c[E4\u0010Q(C/\u00129&sE8ֿ\u0002>YD\f\nlI\u001c.\u001c{8\u0003\u0010SQ?\u0014rGM[nfem!gA\u000f\ffXR:Yکhճ\u0012ثڡ&a\t\u001eD\u0011A\u0004Y()hXi=\u0007\u0015\u00184ڿF\u0007.C\u0016\u0013r\u001c{l\u000erT.\u001f\u0016w_x/Bq\u007fh\u0005Y{Q;w)>w#?\u0018\u0016Ǹ\u001a٢PƁмB\u0019]xNO\u001aI+yy}^(^\u0017}c\u001ck$lnOqH{4jҵ\u0003f\u0013>\u0012}%P|\u001dl߭\u000e\u001b\u007fDAI'uזE\u0012hA:iNwxl\u0019\u0003a`E\u0018_D%(\u0018KH`y6ca+ϓZ\u0006<n\u00107}\u0004m7<ŧ\u007f,+\u0019c~-wûp\u0007S\u0006\u00120GaT.X\u001eCYUu\u0011\bX\u0017<\u0015\u0013j\u0007gbU{ص\u0003d-+LY*_IK'ˊ\u0013\u0019j\u0010\u0011\u000e\u001f\u007fѯ\\^+\u0005\nL7APOMnWr*?\u007fq}A\u000e67<\u0002\f0\u0011qԷ\u0014cx/})K\u0019m2Sǿ\u0017Yje BP'˙(\n\u001b~\u0010\u0011Ls@z;\u0001=\u0010@J\u0015o)5\u0017\u0019$;\u0005w\u001e2\u001c>\u0004hmgb\u001bk\n$˫K֕.ʗۻOKsY9#&r$\u0013gL\u001cR\u0004=\u0003\u0017b\u0017}7I\u001c\u0004bkBEw\u0018dDkhXu7ZӻQՒ\u0019ʼɼrn|.onU?\u001bl\u001d>\"\u0003K@Sd\u0011w\u000en!|-9aE\u0013\u000fT\u00138``\u0018@C\u000fڞlĳ\u001aĐܸOf pG%\u0011iYms\u0004\u0016@y\"\u0016M\u001c8==\u0010\"F\u001f\u00105g\u0011\u0004Rn5\u0016;7\niǇ-ՄNȫË44M;h\u0001G\u0005\u0016fbfz*5A5u^\u0007\u0005&/K%\u0004:EP%Sg)g3\u0010\u001bo$ԵYͦyʉʑ_]-\u000b\fg9<Ow.\u000eRd(t\n=\u007f\u0006\u000fs`\u001f\u001c\u001cS.6\u001c\u0015g\\\u0005cfoe\u0006ؖvȘ*мҥbD\u000bj3\u0004@4&\u0001ylAI=(PPC\u0007)!!\u001c,K5\t[]\u0007|*2>y\u0004D\u0006ԉ\u0019҇]ݞõ%K6\u000b\u0002leu{VFj\u001eG ^>\\\"Lk2\u0010BU* &\u0001G$dlDU8Vx]Ҧ$ӫ)ſ\u05fa\u0010p6xjMҮo{Ze\u0018Ģd\u001d4ӘD\u001b"}, d2 = {"/r;6f;", "", "\u001aj^A_0G\u001d\t[\u000fm,R", "\u001aj^A_0G\u001d\t[\u000fm,X\u0016<a\u0014}", "/r;6f;\u00065urbX:\\", "uZ1u?1:d\u0015H\u000bm0\u0004R\u0016i\u000e7Q", "\u001aj^A_0G\u001d\tb\u0004m\u0002", "\u001aj^A_0G\u001d\tb\u0004m\b\n\u0016+yU", "/r;6f;\u0006\u001b\u0015\u0004n&\u007fX", "uZ8u?1:d\u0015H\u000bm0\u0004R\u0016i\u000e7Q", "\u001aj^A_0G\u001d\te\u0005g.R", "\u001aj^A_0G\u001d\te\u0005g.X\u0016<a\u0014}", "/r;6f;\u0006?+sgfw\u0003", "uZ9u?1:d\u0015H\u000bm0\u0004R\u0016i\u000e7Q", "\u001aj^A_0G\u001d\tl}h9\f^", "\u001aj^A_0G\u001d\tl}h9\fd<r{<Q", "/r;6f;\u0006`\u007fNWZ=~", "uZBu?1:d\u0015H\u000bm0\u0004R\u0016i\u000e7Q", "0h].e@,S\u0015\fxa", "", "3kT:X5M", "4q^:<5=S,", "Bn8;W,Q", "0h].e@,S\u0015\fxasn\u0014\u0012rs/\u000e", "uZ1\u000f<\u0010\u00027", "0h].e@,S\u0015\fxasI\n/2o{\n", "uZ8\u0016<\u0010\u00027", "0h].e@,S\u0015\fxasbY\u000eW\u0007\u0018y", "uZ9\u0017<\u0010\u00027", "0h].e@,S\u0015\fxas\\\u0018\u000eCr<g", "uZB <\u0010\u00027", "3kT:X5M/(", "7mS2k", "3kT:X5M/(Fei\u000bp\\~g", "uZ1\u0016\u001c\t", "3kT:X5M/(F\u0007?\u0019\u0004S2I", "uZ8\u0016\u001c\u0010", "3kT:X5M/(F\b0\u0010\n}+o", "uZ9\u0016\u001c\u0011", "3kT:X5M/(F\u0004`.\u0003Y\u0012Y", "uZB\u0016\u001c\u001a", ";`g", ";`gy:\t2;\u0013\rZ", "uZ1u?2Hb \u0003\u0004(\u001cY\u001d>eU", ";`gy (CG`RV", "uZ8u?2Hb \u0003\u0004(\u001c`\u0012>;", ";`gyD>3@!J\u0001", "uZ9u?2Hb \u0003\u0004(\u001cc\u00138gU", ";`gye\u0013\u000e0\u0015\u0010|", "uZBu?2Hb \u0003\u0004(\u001cj\f9r\u000f}", ";`g\u000fl", Global.BLANK, "", "Ad[2V;H`", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", ";`g\u000fls#=\nx~_ ", "uZ1\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1|4WRBo=g\u0005EuH\u00079", ";`g\u000flsCU*I\u000eI\u0018", "uZ8\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1|4WRBo=g\u0005LjH\\", ";`g\u000fls&A\u001c\tiL6", "uZ9\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1|4WRBo=g\u0005OkB\t9", ";`g\u000flsQB\u0017\u007f\u000eX\u0014", "uZB\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1|4WRBo=g\u0005VdC\u0014r\u0002", ";`g$\\;A", "1n\\=T9:b#\f", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "\u001aj^A_0G\u001dv\t\u0003i(\n\u0005>o\r}", ";`g$\\;A\u001b\ffg\\7L\u0013", "uZ1\u0019](OOb\u000f\nb3Ff9m\u000b$\t<\u0010!$\u001d3tB\u00014<]\u0007i'J*=M\u0019", ";`g$\\;A\u001b\r\u0007yS&mp", "uZ8\u0019](OOb\u000f\nb3Ff9m\u000b$\t<\u0010!$\u001d3tB\u00014<]\u0007i'Q\u001f=#", ";`g$\\;A\u001b.\fZP\u0011xl", "uZ9\u0019](OOb\u000f\nb3Ff9m\u000b$\t<\u0010!$\u001d3tB\u00014<]\u0007i'T 7O\u0019", ";`g$\\;A\u001b\u0019h]M-q\u0017", "uZB\u0019](OOb\u000f\nb3Ff9m\u000b$\t<\u0010!$\u001d3tB\u00014<]\u0007i'[\u00198ZR\u0011", ";h]", ";h]y:\t2;\u0013\rZ", ";h]y (CG`RV", ";h]yD>3@!J\u0001", ";h]ye\u0013\u000e0\u0015\u0010|", ";h]\u000fl", ";h]\u000fls#=\nx~_ ", ";h]\u000flsCU*I\u000eI\u0018", ";h]\u000fls&A\u001c\tiL6", ";h]\u000flsQB\u0017\u007f\u000eX\u0014", ";h]$\\;A", ";h]$\\;A\u001b\ffg\\7L\u0013", ";h]$\\;A\u001b\r\u0007yS&mp", ";h]$\\;A\u001b.\fZP\u0011xl", ";h]$\\;A\u001b\u0019h]M-q\u0017", "At\\\u001cY", "\u001aiPCTuFO(\u0002D;0~g/c\u00040wGV", "At\\\u001cY\tBUw~xb4x\u0010", "uZ1\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1|3IT75<\u001a$k+\u0016\u000be\u000bNt+OHU\u0002", "\u001aiPCTuFO(\u0002D;0~l8t\u007f*{MV", "At\\\u001cY\tBU|\b\n^.|\u0016", "uZ1\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1|3IT75<\u001a$k+\u0016\u000be\u0010W\u0006'IL[\u0002", "uZ8\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1|3IT75<\u001a$k+\u0016\u000be\u000bNt+OHU\u0002", "uZ8\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1|3IT75<\u001a$k+\u0016\u000be\u0010W\u0006'IL[\u0002", "uZ9\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1|3IT75<\u001a$k+\u0016\u000be\u000bNt+OHU\u0002", "uZ9\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1|3IT75<\u001a$k+\u0016\u000be\u0010W\u0006'IL[\u0002", "uZB\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1|3IT75<\u001a$k+\u0016\u000be\u000bNt+OHU\u0002", "uZB\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1|3IT75<\u001a$k+\u0016\u000be\u0010W\u0006'IL[\u0002", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "\u0003U^{\u001at\u0006\u001dlzr\u0010]re\u0013gT", xi = 49, xs = ">AE<8<{/:65-*:.315o5-1&#)\u001f\u001df\fv'&\u0014+$z#")
class UArraysKt___UArraysJvmKt {
    /* JADX INFO: renamed from: asList--ajY-9A */
    public static final List<UInt> m9448asListajY9A(int[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new UArraysKt___UArraysJvmKt$asList$1(asList);
    }

    /* JADX INFO: renamed from: asList-GBYM_sE */
    public static final List<UByte> m9449asListGBYM_sE(byte[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new UArraysKt___UArraysJvmKt$asList$3(asList);
    }

    /* JADX INFO: renamed from: asList-QwZRm1k */
    public static final List<ULong> m9450asListQwZRm1k(long[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new UArraysKt___UArraysJvmKt$asList$2(asList);
    }

    /* JADX INFO: renamed from: asList-rL5Bavg */
    public static final List<UShort> m9451asListrL5Bavg(short[] asList) {
        Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new UArraysKt___UArraysJvmKt$asList$4(asList);
    }

    /* JADX INFO: renamed from: binarySearch-2fe2U9s */
    public static final int m9452binarySearch2fe2U9s(int[] binarySearch, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i3, i4, UIntArray.m9136getSizeimpl(binarySearch));
        int i5 = i4 - 1;
        while (i3 <= i5) {
            int i6 = (i3 + i5) >>> 1;
            int iUintCompare = UnsignedKt.uintCompare(binarySearch[i6], i2);
            if (iUintCompare < 0) {
                i3 = i6 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i6;
                }
                i5 = i6 - 1;
            }
        }
        return -(i3 + 1);
    }

    /* JADX INFO: renamed from: binarySearch-2fe2U9s$default */
    public static /* synthetic */ int m9453binarySearch2fe2U9s$default(int[] iArr, int i2, int i3, int i4, int i5, Object obj) {
        if ((-1) - (((-1) - i5) | ((-1) - 2)) != 0) {
            i3 = 0;
        }
        if ((i5 + 4) - (i5 | 4) != 0) {
            i4 = UIntArray.m9136getSizeimpl(iArr);
        }
        return UArraysKt.m9452binarySearch2fe2U9s(iArr, i2, i3, i4);
    }

    /* JADX INFO: renamed from: binarySearch-EtDCXyQ */
    public static final int m9454binarySearchEtDCXyQ(short[] binarySearch, short s2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i2, i3, UShortArray.m9320getSizeimpl(binarySearch));
        int i4 = s2 & 65535;
        int i5 = i3 - 1;
        while (i2 <= i5) {
            int i6 = (i2 + i5) >>> 1;
            int iUintCompare = UnsignedKt.uintCompare(binarySearch[i6], i4);
            if (iUintCompare < 0) {
                i2 = i6 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i6;
                }
                i5 = i6 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: binarySearch-EtDCXyQ$default */
    public static /* synthetic */ int m9455binarySearchEtDCXyQ$default(short[] sArr, short s2, int i2, int i3, int i4, Object obj) {
        if ((i4 + 2) - (2 | i4) != 0) {
            i2 = 0;
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            i3 = UShortArray.m9320getSizeimpl(sArr);
        }
        return UArraysKt.m9454binarySearchEtDCXyQ(sArr, s2, i2, i3);
    }

    /* JADX INFO: renamed from: binarySearch-K6DWlUc */
    public static final int m9456binarySearchK6DWlUc(long[] binarySearch, long j2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i2, i3, ULongArray.m9215getSizeimpl(binarySearch));
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int iUlongCompare = UnsignedKt.ulongCompare(binarySearch[i5], j2);
            if (iUlongCompare < 0) {
                i2 = i5 + 1;
            } else {
                if (iUlongCompare <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: binarySearch-K6DWlUc$default */
    public static /* synthetic */ int m9457binarySearchK6DWlUc$default(long[] jArr, long j2, int i2, int i3, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i2 = 0;
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            i3 = ULongArray.m9215getSizeimpl(jArr);
        }
        return UArraysKt.m9456binarySearchK6DWlUc(jArr, j2, i2, i3);
    }

    /* JADX INFO: renamed from: binarySearch-WpHrYlw */
    public static final int m9458binarySearchWpHrYlw(byte[] binarySearch, byte b2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(i2, i3, UByteArray.m9057getSizeimpl(binarySearch));
        int i4 = (b2 + 255) - (b2 | 255);
        int i5 = i3 - 1;
        while (i2 <= i5) {
            int i6 = (i2 + i5) >>> 1;
            int iUintCompare = UnsignedKt.uintCompare(binarySearch[i6], i4);
            if (iUintCompare < 0) {
                i2 = i6 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i6;
                }
                i5 = i6 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: binarySearch-WpHrYlw$default */
    public static /* synthetic */ int m9459binarySearchWpHrYlw$default(byte[] bArr, byte b2, int i2, int i3, int i4, Object obj) {
        if ((2 & i4) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = UByteArray.m9057getSizeimpl(bArr);
        }
        return UArraysKt.m9458binarySearchWpHrYlw(bArr, b2, i2, i3);
    }

    /* JADX INFO: renamed from: elementAt-PpDY95g */
    private static final byte m9460elementAtPpDY95g(byte[] elementAt, int i2) {
        Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return UByteArray.m9056getw2LRezQ(elementAt, i2);
    }

    /* JADX INFO: renamed from: elementAt-nggk6HY */
    private static final short m9461elementAtnggk6HY(short[] elementAt, int i2) {
        Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return UShortArray.m9319getMh2AYeg(elementAt, i2);
    }

    /* JADX INFO: renamed from: elementAt-qFRl0hI */
    private static final int m9462elementAtqFRl0hI(int[] elementAt, int i2) {
        Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return UIntArray.m9135getpVg5ArA(elementAt, i2);
    }

    /* JADX INFO: renamed from: elementAt-r7IrZao */
    private static final long m9463elementAtr7IrZao(long[] elementAt, int i2) {
        Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return ULongArray.m9214getsVKNKU(elementAt, i2);
    }

    @Deprecated(message = "\u0018Y\u0001t~u-Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: max--ajY-9A */
    public static final /* synthetic */ UInt m9464maxajY9A(int[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return UArraysKt.m9832maxOrNullajY9A(max);
    }

    @Deprecated(message = "\u0018Y\u0001t~u-Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: max-GBYM_sE */
    public static final /* synthetic */ UByte m9465maxGBYM_sE(byte[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return UArraysKt.m9833maxOrNullGBYM_sE(max);
    }

    @Deprecated(message = "\u0018Y\u0001t~u-Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: max-QwZRm1k */
    public static final /* synthetic */ ULong m9466maxQwZRm1k(long[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return UArraysKt.m9834maxOrNullQwZRm1k(max);
    }

    @Deprecated(message = "\u0018Y\u0001t~u-Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: max-rL5Bavg */
    public static final /* synthetic */ UShort m9467maxrL5Bavg(short[] max) {
        Intrinsics.checkNotNullParameter(max, "$this$max");
        return UArraysKt.m9835maxOrNullrL5Bavg(max);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.IntIterator] */
    @Deprecated(message = "\u0018Y\u0001t~u-9q6:he!8\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: maxBy-JOV_ifY */
    private static final /* synthetic */ <R extends Comparable<? super R>> UByte m9468maxByJOV_ifY(byte[] maxBy, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m9059isEmptyimpl(maxBy)) {
            return null;
        }
        byte bM9056getw2LRezQ = UByteArray.m9056getw2LRezQ(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(UByte.m8992boximpl(bM9056getw2LRezQ));
            ?? it = new IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                byte bM9056getw2LRezQ2 = UByteArray.m9056getw2LRezQ(maxBy, it.nextInt());
                R rInvoke2 = selector.invoke(UByte.m8992boximpl(bM9056getw2LRezQ2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    bM9056getw2LRezQ = bM9056getw2LRezQ2;
                    rInvoke = rInvoke2;
                }
            }
        }
        return UByte.m8992boximpl(bM9056getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.IntIterator] */
    @Deprecated(message = "\u0018Y\u0001t~u-9q6:he!8\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: maxBy-MShoTSo */
    private static final /* synthetic */ <R extends Comparable<? super R>> ULong m9469maxByMShoTSo(long[] maxBy, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m9217isEmptyimpl(maxBy)) {
            return null;
        }
        long jM9214getsVKNKU = ULongArray.m9214getsVKNKU(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(ULong.m9148boximpl(jM9214getsVKNKU));
            ?? it = new IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                long jM9214getsVKNKU2 = ULongArray.m9214getsVKNKU(maxBy, it.nextInt());
                R rInvoke2 = selector.invoke(ULong.m9148boximpl(jM9214getsVKNKU2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    jM9214getsVKNKU = jM9214getsVKNKU2;
                    rInvoke = rInvoke2;
                }
            }
        }
        return ULong.m9148boximpl(jM9214getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.IntIterator] */
    @Deprecated(message = "\u0018Y\u0001t~u-9q6:he!8\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: maxBy-jgv0xPQ */
    private static final /* synthetic */ <R extends Comparable<? super R>> UInt m9470maxByjgv0xPQ(int[] maxBy, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m9138isEmptyimpl(maxBy)) {
            return null;
        }
        int iM9135getpVg5ArA = UIntArray.m9135getpVg5ArA(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(UInt.m9069boximpl(iM9135getpVg5ArA));
            ?? it = new IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                int iM9135getpVg5ArA2 = UIntArray.m9135getpVg5ArA(maxBy, it.nextInt());
                R rInvoke2 = selector.invoke(UInt.m9069boximpl(iM9135getpVg5ArA2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    iM9135getpVg5ArA = iM9135getpVg5ArA2;
                    rInvoke = rInvoke2;
                }
            }
        }
        return UInt.m9069boximpl(iM9135getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.IntIterator] */
    @Deprecated(message = "\u0018Y\u0001t~u-9q6:he!8\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: maxBy-xTcfx_M */
    private static final /* synthetic */ <R extends Comparable<? super R>> UShort m9471maxByxTcfx_M(short[] maxBy, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m9322isEmptyimpl(maxBy)) {
            return null;
        }
        short sM9319getMh2AYeg = UShortArray.m9319getMh2AYeg(maxBy, 0);
        int lastIndex = ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(UShort.m9255boximpl(sM9319getMh2AYeg));
            ?? it = new IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                short sM9319getMh2AYeg2 = UShortArray.m9319getMh2AYeg(maxBy, it.nextInt());
                R rInvoke2 = selector.invoke(UShort.m9255boximpl(sM9319getMh2AYeg2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    sM9319getMh2AYeg = sM9319getMh2AYeg2;
                    rInvoke = rInvoke2;
                }
            }
        }
        return UShort.m9255boximpl(sM9319getMh2AYeg);
    }

    @Deprecated(message = "\u0018Y\u0001t~u-Na[0ib\u0003AZh\f\u00125\u0018|\u0011Sz\u0014", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: maxWith-XMRcp5o */
    public static final /* synthetic */ UByte m9472maxWithXMRcp5o(byte[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.m9840maxWithOrNullXMRcp5o(maxWith, comparator);
    }

    @Deprecated(message = "\u0018Y\u0001t~u-Na[0ib\u0003AZh\f\u00125\u0018|\u0011Sz\u0014", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: maxWith-YmdZ_VM */
    public static final /* synthetic */ UInt m9473maxWithYmdZ_VM(int[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.m9841maxWithOrNullYmdZ_VM(maxWith, comparator);
    }

    @Deprecated(message = "\u0018Y\u0001t~u-Na[0ib\u0003AZh\f\u00125\u0018|\u0011Sz\u0014", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: maxWith-eOHTfZs */
    public static final /* synthetic */ UShort m9474maxWitheOHTfZs(short[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.m9842maxWithOrNulleOHTfZs(maxWith, comparator);
    }

    @Deprecated(message = "\u0018Y\u0001t~u-Na[0ib\u0003AZh\f\u00125\u0018|\u0011Sz\u0014", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: maxWith-zrEWJaI */
    public static final /* synthetic */ ULong m9475maxWithzrEWJaI(long[] maxWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.m9843maxWithOrNullzrEWJaI(maxWith, comparator);
    }

    @Deprecated(message = "\u0018Y\u0001t~}#Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: min--ajY-9A */
    public static final /* synthetic */ UInt m9476minajY9A(int[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return UArraysKt.m9888minOrNullajY9A(min);
    }

    @Deprecated(message = "\u0018Y\u0001t~}#Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: min-GBYM_sE */
    public static final /* synthetic */ UByte m9477minGBYM_sE(byte[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return UArraysKt.m9889minOrNullGBYM_sE(min);
    }

    @Deprecated(message = "\u0018Y\u0001t~}#Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: min-QwZRm1k */
    public static final /* synthetic */ ULong m9478minQwZRm1k(long[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return UArraysKt.m9890minOrNullQwZRm1k(min);
    }

    @Deprecated(message = "\u0018Y\u0001t~}#Fj5=\u0007\\T5\\o`\u000e(\t6", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: min-rL5Bavg */
    public static final /* synthetic */ UShort m9479minrL5Bavg(short[] min) {
        Intrinsics.checkNotNullParameter(min, "$this$min");
        return UArraysKt.m9891minOrNullrL5Bavg(min);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.IntIterator] */
    @Deprecated(message = "\u0018Y\u0001t~}#9q6:he!8\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: minBy-JOV_ifY */
    private static final /* synthetic */ <R extends Comparable<? super R>> UByte m9480minByJOV_ifY(byte[] minBy, Function1<? super UByte, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UByteArray.m9059isEmptyimpl(minBy)) {
            return null;
        }
        byte bM9056getw2LRezQ = UByteArray.m9056getw2LRezQ(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(UByte.m8992boximpl(bM9056getw2LRezQ));
            ?? it = new IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                byte bM9056getw2LRezQ2 = UByteArray.m9056getw2LRezQ(minBy, it.nextInt());
                R rInvoke2 = selector.invoke(UByte.m8992boximpl(bM9056getw2LRezQ2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    bM9056getw2LRezQ = bM9056getw2LRezQ2;
                    rInvoke = rInvoke2;
                }
            }
        }
        return UByte.m8992boximpl(bM9056getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.IntIterator] */
    @Deprecated(message = "\u0018Y\u0001t~}#9q6:he!8\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: minBy-MShoTSo */
    private static final /* synthetic */ <R extends Comparable<? super R>> ULong m9481minByMShoTSo(long[] minBy, Function1<? super ULong, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (ULongArray.m9217isEmptyimpl(minBy)) {
            return null;
        }
        long jM9214getsVKNKU = ULongArray.m9214getsVKNKU(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(ULong.m9148boximpl(jM9214getsVKNKU));
            ?? it = new IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                long jM9214getsVKNKU2 = ULongArray.m9214getsVKNKU(minBy, it.nextInt());
                R rInvoke2 = selector.invoke(ULong.m9148boximpl(jM9214getsVKNKU2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    jM9214getsVKNKU = jM9214getsVKNKU2;
                    rInvoke = rInvoke2;
                }
            }
        }
        return ULong.m9148boximpl(jM9214getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.IntIterator] */
    @Deprecated(message = "\u0018Y\u0001t~}#9q6:he!8\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: minBy-jgv0xPQ */
    private static final /* synthetic */ <R extends Comparable<? super R>> UInt m9482minByjgv0xPQ(int[] minBy, Function1<? super UInt, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UIntArray.m9138isEmptyimpl(minBy)) {
            return null;
        }
        int iM9135getpVg5ArA = UIntArray.m9135getpVg5ArA(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(UInt.m9069boximpl(iM9135getpVg5ArA));
            ?? it = new IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                int iM9135getpVg5ArA2 = UIntArray.m9135getpVg5ArA(minBy, it.nextInt());
                R rInvoke2 = selector.invoke(UInt.m9069boximpl(iM9135getpVg5ArA2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    iM9135getpVg5ArA = iM9135getpVg5ArA2;
                    rInvoke = rInvoke2;
                }
            }
        }
        return UInt.m9069boximpl(iM9135getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.IntIterator] */
    @Deprecated(message = "\u0018Y\u0001t~}#9q6:he!8\u000eeZ\u001c;\ni\u0010 ", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: minBy-xTcfx_M */
    private static final /* synthetic */ <R extends Comparable<? super R>> UShort m9483minByxTcfx_M(short[] minBy, Function1<? super UShort, ? extends R> selector) {
        Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        Intrinsics.checkNotNullParameter(selector, "selector");
        if (UShortArray.m9322isEmptyimpl(minBy)) {
            return null;
        }
        short sM9319getMh2AYeg = UShortArray.m9319getMh2AYeg(minBy, 0);
        int lastIndex = ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(UShort.m9255boximpl(sM9319getMh2AYeg));
            ?? it = new IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                short sM9319getMh2AYeg2 = UShortArray.m9319getMh2AYeg(minBy, it.nextInt());
                R rInvoke2 = selector.invoke(UShort.m9255boximpl(sM9319getMh2AYeg2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    sM9319getMh2AYeg = sM9319getMh2AYeg2;
                    rInvoke = rInvoke2;
                }
            }
        }
        return UShort.m9255boximpl(sM9319getMh2AYeg);
    }

    @Deprecated(message = "\u0018Y\u0001t~}#Na[0ib\u0003AZh\f\u00125\u0018|\u0011Sz\u0014", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: minWith-XMRcp5o */
    public static final /* synthetic */ UByte m9484minWithXMRcp5o(byte[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.m9896minWithOrNullXMRcp5o(minWith, comparator);
    }

    @Deprecated(message = "\u0018Y\u0001t~}#Na[0ib\u0003AZh\f\u00125\u0018|\u0011Sz\u0014", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: minWith-YmdZ_VM */
    public static final /* synthetic */ UInt m9485minWithYmdZ_VM(int[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.m9897minWithOrNullYmdZ_VM(minWith, comparator);
    }

    @Deprecated(message = "\u0018Y\u0001t~}#Na[0ib\u0003AZh\f\u00125\u0018|\u0011Sz\u0014", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: minWith-eOHTfZs */
    public static final /* synthetic */ UShort m9486minWitheOHTfZs(short[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.m9898minWithOrNulleOHTfZs(minWith, comparator);
    }

    @Deprecated(message = "\u0018Y\u0001t~}#Na[0ib\u0003AZh\f\u00125\u0018|\u0011Sz\u0014", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpG", hiddenSince = "\tq/", warningSince = "\u000bc?")
    /* JADX INFO: renamed from: minWith-zrEWJaI */
    public static final /* synthetic */ ULong m9487minWithzrEWJaI(long[] minWith, Comparator comparator) {
        Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return UArraysKt.m9899minWithOrNullzrEWJaI(minWith, comparator);
    }

    private static final BigDecimal sumOfBigDecimal(byte[] sumOf, Function1<? super UByte, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        int iM9057getSizeimpl = UByteArray.m9057getSizeimpl(sumOf);
        for (int i2 = 0; i2 < iM9057getSizeimpl; i2++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(UByte.m8992boximpl(UByteArray.m9056getw2LRezQ(sumOf, i2))));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    private static final BigDecimal sumOfBigDecimal(int[] sumOf, Function1<? super UInt, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        int iM9136getSizeimpl = UIntArray.m9136getSizeimpl(sumOf);
        for (int i2 = 0; i2 < iM9136getSizeimpl; i2++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(UInt.m9069boximpl(UIntArray.m9135getpVg5ArA(sumOf, i2))));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    private static final BigDecimal sumOfBigDecimal(long[] sumOf, Function1<? super ULong, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        int iM9215getSizeimpl = ULongArray.m9215getSizeimpl(sumOf);
        for (int i2 = 0; i2 < iM9215getSizeimpl; i2++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(ULong.m9148boximpl(ULongArray.m9214getsVKNKU(sumOf, i2))));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    private static final BigDecimal sumOfBigDecimal(short[] sumOf, Function1<? super UShort, ? extends BigDecimal> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        int iM9320getSizeimpl = UShortArray.m9320getSizeimpl(sumOf);
        for (int i2 = 0; i2 < iM9320getSizeimpl; i2++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(UShort.m9255boximpl(UShortArray.m9319getMh2AYeg(sumOf, i2))));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    private static final BigInteger sumOfBigInteger(byte[] sumOf, Function1<? super UByte, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        int iM9057getSizeimpl = UByteArray.m9057getSizeimpl(sumOf);
        for (int i2 = 0; i2 < iM9057getSizeimpl; i2++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(UByte.m8992boximpl(UByteArray.m9056getw2LRezQ(sumOf, i2))));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    private static final BigInteger sumOfBigInteger(int[] sumOf, Function1<? super UInt, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        int iM9136getSizeimpl = UIntArray.m9136getSizeimpl(sumOf);
        for (int i2 = 0; i2 < iM9136getSizeimpl; i2++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(UInt.m9069boximpl(UIntArray.m9135getpVg5ArA(sumOf, i2))));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    private static final BigInteger sumOfBigInteger(long[] sumOf, Function1<? super ULong, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        int iM9215getSizeimpl = ULongArray.m9215getSizeimpl(sumOf);
        for (int i2 = 0; i2 < iM9215getSizeimpl; i2++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(ULong.m9148boximpl(ULongArray.m9214getsVKNKU(sumOf, i2))));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    private static final BigInteger sumOfBigInteger(short[] sumOf, Function1<? super UShort, ? extends BigInteger> selector) {
        Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        Intrinsics.checkNotNullParameter(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        int iM9320getSizeimpl = UShortArray.m9320getSizeimpl(sumOf);
        for (int i2 = 0; i2 < iM9320getSizeimpl; i2++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(UShort.m9255boximpl(UShortArray.m9319getMh2AYeg(sumOf, i2))));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }
}
