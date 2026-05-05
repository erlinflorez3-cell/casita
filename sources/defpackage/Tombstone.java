package defpackage;

import androidx.core.view.ViewCompat;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import io.sentry.SentryEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0001\u001d<K!&i\u0016DLc\u0003\u0003Iي8\u000bDB\u0007\"2\u0012\u007f\u0007tvA0JfP.`Y2\u000fq}<$iByCAU\"}8\tWNmgvJp\u000bKƤ\u000e\u0016\u000fj4կ]xk4\u00172XoG3SoE9vt>ӌ(288\u0002ڎ\t\u001a@H\u0018v\u0001CS\f 9H\u0081BR#M\r܅\u001a\u0006T \t\u001eb\nV6VǍe:5&\u0019݃`\u001fWk@~]\rtÖ7\u000f\u0007aL+n6m\u0014u\u0014π\u0007baE\u0003MrU\u0005\u0017)71Ose9p\u007fB\u0017;U\u0013]\u0001*t\u0005\u007fe\u001c-1OqQh\u000eV|\u000b\u0002\u0013<\u0012\u0015\u001e'v3= l\b\u001c;\rr\u0002I`\bdB\u000e\u0005y6E.\u0010919)qiai\"^=\u0002\u0005\u001b*;\u0001\u001d&k`\u0014`#(l}a3a@kM|\u0018iCs\u0004~q\u001a*29W\b5{\u001f>/'MZg41q\bHRy\u000f\u0005\u000fmcuXHN5\u0007\u001cG,\u0019\f\tX\u0013\u0013{\\ZX:&e\"d\t\u000e\bA6\u000b\u0006L3+\u0010\\f\u0001uzOm\nS8v9in\u001a'\u0006QnE;Qq*y^\u0007\u0016O<\u0011\u000ehhRS:s\u000b@2>Nj\u001e\u0013\u0014J^\u000e#2m\u000eJB<=\u001f\\#e\u001b$RC\r\t\u000ex\u0017\u001e\u000f`9$\u0011\t<z\u0019\u0003`\\\u001f\u0010\u0016\u0007Y2\u0003`0NYQc\"6[(hB\u001f;\u0007-\u0017\u0010OmLUp\u0005\u0018\fT*E& ?Q=c+\u000f-Pɨ\u0006/Kt\u0001\u000f\u001aS p\u0013|(\u000f\u0002}vx\u00165\t,\u000f\u000ezUbb:xtqQT+їy*L\t\u0015{T9d\u0005];\tg\u000bf8+\ne2m̑o0LM-qگM\u001c}\u0014=\u0016y]\u0018q^\u007fh\u000f4w}\u0004ZeFuhQk6S8w^/D($z\tZH\u0019|8H\u000f4\u001b:`A\u0013u\u0007>S\u000b=\u0006~\u0007Z\u0016!\\a:!y\u00164\\hZyI}\"i[%?V\u0004msmYh#J=\u000f;\b7n )U&fYr\t^\u000b\"&fGAb\u0013K!$b5l\u0010\u0011Cby\u001e\u0012\u0011~tp?\u001d8B\u0002Mn\u000e\u0003}\rbN\u0005nXx':\u0003\u000f\u000fa2'Ca\u0011sFbD{8\u0011U-\tI\u0001}\r\u001771DbP34h\u0003\u001bE\fLY\u0004F\u0004uB\u001c\u0004 \u001e>\u0018\u000b7Z$+;a\u0011\u000e\u007f@`\u001bU\u0013g\u0013\u000fBrXN0D\u0017\u0001\r\u0010L\n='G]#{h-Zk\u0010=S\u001c\u0011\u0017rG5\u001a-oL\u001b;%M3MKz\u0014U\u001c\u0006ak\u0004\u000e .H\u001ctOe\b\u0014l\nk=R\u0016 9\u0013\n\u000f\u0013^D\u001c0`s!/^\u000e<O\u0010Y\u001a\u0013\r\u0001<\f/A?+\u001b\bxO?Ǖ\fʋpivΩ#\u0005l[d%?A^ !'{0I\\1Ϙ\u0013\u05c9$^\u0019֧,\u0017,KD33=\u001eS{h\u001fp\u0006_cē1֗.g9Èj \u0004L\b$T>b.-;\u0005Rth_Ϧnܣ[\u0014fȥ@fz;7BM\u0013Ve)\u0013bK)\";ӽ9ق#a\u0015ӑx\t\nuWTqE`G37`\u0014&,Mֳ\u0005̯fz\b˟Z\u000bx1u^}ZbG2'\b-$hY\u0381MԺ<H\u0010ϴ)\u0010\u0017bhjpRj%4;\u007f<w\u001dgۼ\u0017Ƭ\nu\u000fؒMlW\b3\\Q\u0011\u000f\u0019Wy_ppw\u000e\u0090%˧\u0013u#ʰ~=+jszw \u0010tb~{l\r\u00138κKˢI$\u0002\u07baX\u0002\u0010U2VV\f1\u0010]3^)\u000emvZJӚ\u0006ڲ.<vޏ;Ir0\u0002B|}&\u0006|[\u00109w~jԔFĎ.3t؋]On3\u0019r]Y\"X'\u0006W<M\u0001fމŝ/OzىG^cv!&TN@\u0004Nyuc\u0010.\\Д\u0014̊gpr҃ia\u0016s I]\u001a\u0006Ujb\u0016_K=]OM˷8̊|SIǓ#B\u0015all\u0013&\u0019\u0013.4X\u0019\u0012}xeC!iKJݥI̫Z\u0002)͘)]+E3(;aMh\n^M;C\u000b\u001c^\u0007C\u001c`[ȁ#ʢh1\u001dɸ\u0003-4\td~jDf\u001b&KtJ D'ZV{f4\u0007ɷ\u0001\u0082Gc\tߵ7?[Ws?\u0003\u0003Er|\u001d;9gn\u0001^3/\t\u00021)o1I\u000ftҕ;ߊ'y\u0015ГV}\u000e W\u001aM\u000eW*\u001bmZ#?\u0006m8QM|V\u0014XGou\u0003bԔ)դ\n\u0019,߬\u007f\u0015oS0$SfDqAN[[!fp\u0007=\t+\u0010\u0005ۇ:˴\nC\u000e\u0086z\u001e;\u0002m\u0001|H~&_Uz}:e\u001e\u0005#g\u0004I\u0002ܺ\u001b҅5w\u0019ˮga\u001a6_\u001d)X%v>F#\u0004*\u001dT\u0002*V_4mƑeݺny\\ƻ)[:4>%Ӟv8"}, d2 = {"\u001aS^:U:M]\"~P", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "", "/qR5", "\u001a@a0[0MS\u0017\u000e\u000bk,R", "5tT@g&:`\u0017\u0002", "0tX9W&?W\"\u0001zk7\n\r8t", "", "@de6f0H\\", "Bh\\2f;:[$", ">hS", "", "BhS", "ChS", "Ad[6a<QM zw^3", "1n\\:T5=M \u0003\u0004^", "", ">q^0X:LM)\n\nb4|", "AhV;T38W\"\u007f\u0005", "\u001aRX4a(E)", "/a^?g&FS'\rv`,", "1qP@[&=S(z~e:", "\u001aBa.f/\u001dS(z~e\u0002", "1`d@X:", "\u001aBPBf,\u0014", "Bga2T+L", "", "\u001aSW?X(=)", "5tT@g&MV&~v]:", ";d\\<e@8[\u0015\n\u0006b5~\u0017", "\u001aLT:b9R;\u0015\n\u0006b5~^", ":nV,U<?T\u0019\f\t", "\u001aK^45<?T\u0019\fP", "=oT;R-=a", "\u001aE3\b", ">`V2R:Bh\u0019", "6`b,U,>\\\u0013JKd)v\u00119d\u007f", "", "AsP0^&AW'\u000e\u0005k@v\u0006?f\u0001(\t", "\u001aRc.V2!W'\u000e\u0005k@Y\u00190f\u007f5Q", "CmZ;b>G4\u001d~\u0002]:", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "\nh]6g\u0005", "uK0?V/Bb\u0019|\nn9|^\u0016A\r&~D\u0010\u0017\u0015V\u007f\u001b<L\f:U\u000f\u001c\u0001t\u00127O\r)zA\"\u001ej7 \f_=J@.CUPuJa\u007fA\u001d\u00140tS'\u001e\u0001#H wF\u0001\r\u00179M\u000b=>doyt:f\u0002> \u0017C\u0003\u0017?/8uJbaO.FAs&.\u001cn!c\u0004!(\"\u0001n~O>2\f\u0005O\u0018H9~cxCb\u00024-@7IURs^>J\u000e$G\rs[Bgx2>\u0014\bB9\fK\nGx\u0014\bn\b\u00193&(+4E\u0012yDGtq6N\u001dl&+o\nm\u000b\u0018\u001eav_\u0012\u001f\u0016a\u001e%\u001d]jV\u001eW\u0002OE9%6J\u0006\fB}#\u0018\\\u000braZ?dd\u0010\u001ew\u000e\tc\u001f\u0012XM\u001d\u0018?\u0012\u0007i\u001el1)\u001eQ!\u0018>\u001c\u0001bGR\u0011nNrqY\u0002ed\u0004\u0001Fy\u0012I.\t2F|VM9l*C\u0001x\u000e*wrDOy\u0004", "5dc\u000ee*A", "u(;\u000ee*AW(~xm<\n\t\u0005", "5dc\u0014h,Lb\u0013z\b\\/", "5dc\u000fh0ER\u0013\u007f~g.|\u0016:r\u00041\u000b", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001fX=Ba\u001d\t\u0004", "5dc!\\4>a(z\u0003i", "5dc\u001d\\+", "u(8", "5dc!\\+", "5dc\"\\+", "5dc X3B\\)\u0012te(y\t6", "5dc\u001de6<S'\rtn7\f\r7e", "5dc \\.GO x~g-\u0007", "u(; \\.GO T", "5dc\u000eU6Kb\u0013\u0007zl:x\u000b/", "5dc\u001dT.>M'\u0003\u0010^", "5dc\u0015T:8P\u0019~\u0004XwM\u000f,_\b2z@", "u(I", "5dc g(<Y\u0013\u0002~l;\u0007\u0016C_|8|A\u0001$", "u(; g(<Y{\u0003\tm6\n\u001d\fu\u0001){MV", "5dc\u0010b4FO\"}te0\u0006\t", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u0010e(LV\u0013}zm(\u0001\u0010=", "5dc\u0010T<LS'", "5dc![9>O\u0018\r", "u(;7T=:\u001d)\u000e~eud\u0005:;", "5dc\u0014h,Lb\u0013\u000e}k,x\b=", "5dc\u001aX4H`-x\u0003Z7\b\r8g\u000e", "5dc\u0019b.8P)\u007f{^9\u000b", "5dc\u001cc,GM\u001a}\t", "<df\u000fh0ER\u0019\f", "3pd._:", "=sW2e", "", "6`b566=S", "BnBAe0GU", "1n_F", "\u0011n\\=T5B]\"", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class Tombstone extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "wy\b\f\u000fh\u0002\u0011\u0012\u0001\b\u0007", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 12, tag = 14)
    @InterfaceC1492Gx
    private final String abort_message;

    @WireField(adapter = "L~pvx\u0005vu\b\n\b{:Y][kpbp", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 0, tag = 1)
    @InterfaceC1492Gx
    private final Architecture arch;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "x\r\u0002\u0006~a\u0006\f\u0006\u0005\u0013\u0012\u0015\r\u0013\u001a", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 2, tag = 2)
    @InterfaceC1492Gx
    private final String build_fingerprint;

    @WireField(adapter = "Nm\u0003\u0002t3RVTdi[i", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.REPEATED, oneofName = "", schemaIndex = 14, tag = 15)
    @InterfaceC1492Gx
    private final List<Cause> causes;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "y\u0007\u0006\u0007{\n\u0001i\b\u000e\u0006", keyAdapter = "", label = WireField.Label.REPEATED, oneofName = "", schemaIndex = 9, tag = 9)
    @InterfaceC1492Gx
    private final List<String> command_line;

    @WireField(adapter = "N~n\u0002wTv\u0007t}\u00029X\\Zjoao", declaredName = "", jsonName = "y\ny\r\u0003_\u0002\u0012\u007f\t\r\u0015", keyAdapter = "", label = WireField.Label.REPEATED, oneofName = "", schemaIndex = 13, tag = 21)
    @InterfaceC1492Gx
    private final List<CrashDetail> crash_details;

    @WireField(adapter = "L~pvx\u0005vu\b\n\b{:Y][kpbp", declaredName = "", jsonName = "}\r}\r\u000f\\\u000f\u0001\u0007", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 1, tag = 24)
    @InterfaceC1492Gx
    private final Architecture guest_arch;

    @WireField(adapter = "_t\u007fspt4SWUej\\j", declaredName = "", jsonName = "}\r}\r\u000fo\u0005\u0010\u0004\u0001\u0005\u0015", keyAdapter = "&!\u0010?o\\P//\u0013\u0012w%]B:\u001eUat`XB\u0005\u0014}}pTPp\u0010pf[,\u001c", oneofName = "", schemaIndex = 16, tag = 25)
    @InterfaceC1492Gx
    private final Map<Integer, Thread> guest_threads;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bLlz{y", declaredName = "", jsonName = "~x\f[\u007f\u0001\u000bNT\u000b\u0003n\u0012\b\n", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 21, tag = 23)
    @InterfaceC1492Gx
    private final boolean has_been_16kb_mode;

    @WireField(adapter = "W{tP\u0005vww\u00067VZXhm_m", declaredName = "", jsonName = "\u0003\u0007\u007f[\u0010\u0002\u0003\u0003\u0011\u0013", keyAdapter = "", label = WireField.Label.REPEATED, oneofName = "", schemaIndex = 18, tag = 18)
    @InterfaceC1492Gx
    private final List<LogBuffer> log_buffers;

    @WireField(adapter = "Xqz}\u0002\n^s\u0004\u0005~\u0005~;Z^\\lqcq", declaredName = "", jsonName = "\u0004|\u0006\t\r\u0015i~\u000f\u0010\n\u0010\n\u0017", keyAdapter = "", label = WireField.Label.REPEATED, oneofName = "", schemaIndex = 17, tag = 17)
    @InterfaceC1492Gx
    private final List<MemoryMapping> memory_mappings;

    @WireField(adapter = "QP0OSQafXf", declaredName = "", jsonName = "\u0006\b}\b`\u007f\u0010", keyAdapter = "", label = WireField.Label.REPEATED, oneofName = "", schemaIndex = 19, tag = 19)
    @InterfaceC1492Gx
    private final List<FD> open_fds;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002aa", declaredName = "", jsonName = "\u0007x\u007f~m\u0005\u0017\u0003", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 20, tag = 22)
    @InterfaceC1492Gx
    private final int page_size;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002aa", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 5, tag = 5)
    @InterfaceC1492Gx
    private final int pid;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002aa", declaredName = "", jsonName = "\u0007\n\b|\u007f\u000f\u0010r\u000f\u0014\n\u000f\b", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 10, tag = 20)
    @InterfaceC1492Gx
    private final int process_uptime;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 3, tag = 3)
    @InterfaceC1492Gx
    private final String revision;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "\n|\u0005\u0003\t\u0011\u0015i\u007f\u0002\u0006\u000e", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 8, tag = 8)
    @InterfaceC1492Gx
    private final String selinux_label;

    @WireField(adapter = "^ut|p|4SWUej\\j", declaredName = "", jsonName = "\n\u0001\u007f\b{\be\f\u0005\u000f", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 11, tag = 10)
    @InterfaceC1492Gx
    private final Signal signal_info;

    @WireField(adapter = "^\u0001nqzXz\u0006\b\u0004\b\u0010Y\u000e\u007f\u0001\u0001\u000f@_caqvhv", declaredName = "", jsonName = "\n\fy|\u0006c\u0006\u0011\u0013\u000f\u0013\u001bd\u0019\u000b\f\f\u001a", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 22, tag = 26)
    @InterfaceC1492Gx
    private final StackHistoryBuffer stack_history_buffer;

    @WireField(adapter = "_t\u007fspt4SWUej\\j", declaredName = "", jsonName = "", keyAdapter = "&!\u0010?o\\P//\u0013\u0012w%]B:\u001eUat`XB\u0005\u0014}}pTPp\u0010pf[,\u001c", oneofName = "", schemaIndex = 15, tag = 16)
    @InterfaceC1492Gx
    private final Map<Integer, Thread> threads;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002aa", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 6, tag = 6)
    @InterfaceC1492Gx
    private final int tid;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL}\u007f~v|v", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 4, tag = 4)
    @InterfaceC1492Gx
    private final String timestamp;

    @WireField(adapter = "n{z<\u0003\u0002\u0007s\u0006y\u000b\u0007E\u0010\u0003\r\u0001Jm\u0011\u000f\u0015\u0011c\b\u0006\u0016\u001b\r\u001bL\u007ftz\u0002aa", declaredName = "", jsonName = "", keyAdapter = "", label = WireField.Label.OMIT_IDENTITY, oneofName = "", schemaIndex = 7, tag = 7)
    @InterfaceC1492Gx
    private final int uid;
    public static final Companion Companion = new Companion(null);
    public static final ProtoAdapter<Tombstone> ADAPTER = new Tombstone$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(Tombstone.class), Syntax.PROTO_3);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007tqAӄJͣIDɟ\u0004*=j<;*[ҸuEAU(~r\u001d]P\u007fm~Lj\u000bq\u00134\u0019/n\u0003շWޯa\u0012\u0017˰\u0013{M8eok?7ҝ\tӯ$2*\u0600ѯ\t\b"}, d2 = {"\u001aS^:U:M]\"~9<6\u0005\u0014+n\u00042\u0005\u0016", "", "\nh]6g\u0005", "u(E", "\u000fC0\u001dG\f+", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u001aS^:U:M]\"~P", "Ada6T3/S&\r~h5ll\u000e", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Tombstone() {
        this(null, null, null, null, null, 0, 0, 0, null, null, 0, null, null, null, null, null, null, null, null, null, 0, false, null, null, ViewCompat.MEASURED_SIZE_MASK, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tombstone(Architecture arch, Architecture guest_arch, String build_fingerprint, String revision, String timestamp, int i2, int i3, int i4, String selinux_label, List<String> command_line, int i5, Signal signal, String abort_message, List<CrashDetail> crash_details, List<Cause> causes, Map<Integer, Thread> threads, Map<Integer, Thread> guest_threads, List<MemoryMapping> memory_mappings, List<LogBuffer> log_buffers, List<FD> open_fds, int i6, boolean z2, StackHistoryBuffer stackHistoryBuffer, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(arch, "arch");
        Intrinsics.checkNotNullParameter(guest_arch, "guest_arch");
        Intrinsics.checkNotNullParameter(build_fingerprint, "build_fingerprint");
        Intrinsics.checkNotNullParameter(revision, "revision");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(selinux_label, "selinux_label");
        Intrinsics.checkNotNullParameter(command_line, "command_line");
        Intrinsics.checkNotNullParameter(abort_message, "abort_message");
        Intrinsics.checkNotNullParameter(crash_details, "crash_details");
        Intrinsics.checkNotNullParameter(causes, "causes");
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(guest_threads, "guest_threads");
        Intrinsics.checkNotNullParameter(memory_mappings, "memory_mappings");
        Intrinsics.checkNotNullParameter(log_buffers, "log_buffers");
        Intrinsics.checkNotNullParameter(open_fds, "open_fds");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.arch = arch;
        this.guest_arch = guest_arch;
        this.build_fingerprint = build_fingerprint;
        this.revision = revision;
        this.timestamp = timestamp;
        this.pid = i2;
        this.tid = i3;
        this.uid = i4;
        this.selinux_label = selinux_label;
        this.process_uptime = i5;
        this.signal_info = signal;
        this.abort_message = abort_message;
        this.page_size = i6;
        this.has_been_16kb_mode = z2;
        this.stack_history_buffer = stackHistoryBuffer;
        this.command_line = Internal.immutableCopyOf("command_line", command_line);
        this.crash_details = Internal.immutableCopyOf("crash_details", crash_details);
        this.causes = Internal.immutableCopyOf("causes", causes);
        this.threads = Internal.immutableCopyOf(SentryEvent.JsonKeys.THREADS, threads);
        this.guest_threads = Internal.immutableCopyOf("guest_threads", guest_threads);
        this.memory_mappings = Internal.immutableCopyOf("memory_mappings", memory_mappings);
        this.log_buffers = Internal.immutableCopyOf("log_buffers", log_buffers);
        this.open_fds = Internal.immutableCopyOf("open_fds", open_fds);
    }

    public /* synthetic */ Tombstone(Architecture architecture, Architecture architecture2, String str, String str2, String str3, int i2, int i3, int i4, String str4, List list, int i5, Signal signal, String str5, List list2, List list3, Map map, Map map2, List list4, List list5, List list6, int i6, boolean z2, StackHistoryBuffer stackHistoryBuffer, ByteString byteString, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i7) | ((-1) - 1)) != 0 ? Architecture.ARM32 : architecture, (-1) - (((-1) - i7) | ((-1) - 2)) != 0 ? Architecture.ARM32 : architecture2, (i7 & 4) != 0 ? "" : str, (i7 + 8) - (i7 | 8) != 0 ? "" : str2, (-1) - (((-1) - i7) | ((-1) - 16)) != 0 ? "" : str3, (i7 & 32) != 0 ? 0 : i2, (-1) - (((-1) - i7) | ((-1) - 64)) != 0 ? 0 : i3, (-1) - (((-1) - i7) | ((-1) - 128)) != 0 ? 0 : i4, (i7 & 256) != 0 ? "" : str4, (-1) - (((-1) - i7) | ((-1) - 512)) != 0 ? CollectionsKt.emptyList() : list, (i7 & 1024) != 0 ? 0 : i5, (i7 + 2048) - (i7 | 2048) != 0 ? null : signal, (i7 & 4096) == 0 ? str5 : "", (i7 + 8192) - (i7 | 8192) != 0 ? CollectionsKt.emptyList() : list2, (-1) - (((-1) - i7) | ((-1) - 16384)) != 0 ? CollectionsKt.emptyList() : list3, (i7 + 32768) - (i7 | 32768) != 0 ? MapsKt.emptyMap() : map, (-1) - (((-1) - i7) | ((-1) - 65536)) != 0 ? MapsKt.emptyMap() : map2, (i7 & 131072) != 0 ? CollectionsKt.emptyList() : list4, (i7 + 262144) - (i7 | 262144) != 0 ? CollectionsKt.emptyList() : list5, (i7 & 524288) != 0 ? CollectionsKt.emptyList() : list6, (-1) - (((-1) - i7) | ((-1) - 1048576)) != 0 ? 0 : i6, (i7 & 2097152) != 0 ? false : z2, (-1) - (((-1) - i7) | ((-1) - 4194304)) != 0 ? null : stackHistoryBuffer, (i7 + 8388608) - (i7 | 8388608) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Tombstone copy$default(Tombstone tombstone, Architecture architecture, Architecture architecture2, String str, String str2, String str3, int i2, int i3, int i4, String str4, List list, int i5, Signal signal, String str5, List list2, List list3, Map map, Map map2, List list4, List list5, List list6, int i6, boolean z2, StackHistoryBuffer stackHistoryBuffer, ByteString byteString, int i7, Object obj) {
        ByteString byteStringUnknownFields = byteString;
        Architecture architecture3 = architecture2;
        String str6 = str;
        Architecture architecture4 = architecture;
        String str7 = str5;
        Signal signal2 = signal;
        List list7 = list;
        String str8 = str4;
        int i8 = i4;
        int i9 = i5;
        int i10 = i3;
        String str9 = str3;
        int i11 = i2;
        String str10 = str2;
        StackHistoryBuffer stackHistoryBuffer2 = stackHistoryBuffer;
        boolean z3 = z2;
        int i12 = i6;
        List list8 = list6;
        List list9 = list5;
        List list10 = list4;
        Map map3 = map2;
        Map map4 = map;
        List list11 = list3;
        List list12 = list2;
        if ((i7 & 1) != 0) {
            architecture4 = tombstone.arch;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 2)) != 0) {
            architecture3 = tombstone.guest_arch;
        }
        if ((i7 & 4) != 0) {
            str6 = tombstone.build_fingerprint;
        }
        if ((i7 & 8) != 0) {
            str10 = tombstone.revision;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 16)) != 0) {
            str9 = tombstone.timestamp;
        }
        if ((i7 & 32) != 0) {
            i11 = tombstone.pid;
        }
        if ((i7 & 64) != 0) {
            i10 = tombstone.tid;
        }
        if ((i7 & 128) != 0) {
            i8 = tombstone.uid;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 256)) != 0) {
            str8 = tombstone.selinux_label;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 512)) != 0) {
            list7 = tombstone.command_line;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 1024)) != 0) {
            i9 = tombstone.process_uptime;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 2048)) != 0) {
            signal2 = tombstone.signal_info;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 4096)) != 0) {
            str7 = tombstone.abort_message;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 8192)) != 0) {
            list12 = tombstone.crash_details;
        }
        if ((i7 & 16384) != 0) {
            list11 = tombstone.causes;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 32768)) != 0) {
            map4 = tombstone.threads;
        }
        if ((i7 & 65536) != 0) {
            map3 = tombstone.guest_threads;
        }
        if ((i7 & 131072) != 0) {
            list10 = tombstone.memory_mappings;
        }
        if ((i7 & 262144) != 0) {
            list9 = tombstone.log_buffers;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 524288)) != 0) {
            list8 = tombstone.open_fds;
        }
        if ((-1) - (((-1) - i7) | ((-1) - 1048576)) != 0) {
            i12 = tombstone.page_size;
        }
        if ((i7 & 2097152) != 0) {
            z3 = tombstone.has_been_16kb_mode;
        }
        if ((i7 + 4194304) - (i7 | 4194304) != 0) {
            stackHistoryBuffer2 = tombstone.stack_history_buffer;
        }
        if ((i7 & 8388608) != 0) {
            byteStringUnknownFields = tombstone.unknownFields();
        }
        String str11 = str10;
        List list13 = list7;
        int i13 = i9;
        return tombstone.copy(architecture4, architecture3, str6, str11, str9, i11, i10, i8, str8, list13, i13, signal2, str7, list12, list11, map4, map3, list10, list9, list8, i12, z3, stackHistoryBuffer2, byteStringUnknownFields);
    }

    public final Tombstone copy(Architecture arch, Architecture guest_arch, String build_fingerprint, String revision, String timestamp, int i2, int i3, int i4, String selinux_label, List<String> command_line, int i5, Signal signal, String abort_message, List<CrashDetail> crash_details, List<Cause> causes, Map<Integer, Thread> threads, Map<Integer, Thread> guest_threads, List<MemoryMapping> memory_mappings, List<LogBuffer> log_buffers, List<FD> open_fds, int i6, boolean z2, StackHistoryBuffer stackHistoryBuffer, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(arch, "arch");
        Intrinsics.checkNotNullParameter(guest_arch, "guest_arch");
        Intrinsics.checkNotNullParameter(build_fingerprint, "build_fingerprint");
        Intrinsics.checkNotNullParameter(revision, "revision");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(selinux_label, "selinux_label");
        Intrinsics.checkNotNullParameter(command_line, "command_line");
        Intrinsics.checkNotNullParameter(abort_message, "abort_message");
        Intrinsics.checkNotNullParameter(crash_details, "crash_details");
        Intrinsics.checkNotNullParameter(causes, "causes");
        Intrinsics.checkNotNullParameter(threads, "threads");
        Intrinsics.checkNotNullParameter(guest_threads, "guest_threads");
        Intrinsics.checkNotNullParameter(memory_mappings, "memory_mappings");
        Intrinsics.checkNotNullParameter(log_buffers, "log_buffers");
        Intrinsics.checkNotNullParameter(open_fds, "open_fds");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Tombstone(arch, guest_arch, build_fingerprint, revision, timestamp, i2, i3, i4, selinux_label, command_line, i5, signal, abort_message, crash_details, causes, threads, guest_threads, memory_mappings, log_buffers, open_fds, i6, z2, stackHistoryBuffer, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Tombstone)) {
            return false;
        }
        Tombstone tombstone = (Tombstone) obj;
        return Intrinsics.areEqual(unknownFields(), tombstone.unknownFields()) && this.arch == tombstone.arch && this.guest_arch == tombstone.guest_arch && Intrinsics.areEqual(this.build_fingerprint, tombstone.build_fingerprint) && Intrinsics.areEqual(this.revision, tombstone.revision) && Intrinsics.areEqual(this.timestamp, tombstone.timestamp) && this.pid == tombstone.pid && this.tid == tombstone.tid && this.uid == tombstone.uid && Intrinsics.areEqual(this.selinux_label, tombstone.selinux_label) && Intrinsics.areEqual(this.command_line, tombstone.command_line) && this.process_uptime == tombstone.process_uptime && Intrinsics.areEqual(this.signal_info, tombstone.signal_info) && Intrinsics.areEqual(this.abort_message, tombstone.abort_message) && Intrinsics.areEqual(this.crash_details, tombstone.crash_details) && Intrinsics.areEqual(this.causes, tombstone.causes) && Intrinsics.areEqual(this.threads, tombstone.threads) && Intrinsics.areEqual(this.guest_threads, tombstone.guest_threads) && Intrinsics.areEqual(this.memory_mappings, tombstone.memory_mappings) && Intrinsics.areEqual(this.log_buffers, tombstone.log_buffers) && Intrinsics.areEqual(this.open_fds, tombstone.open_fds) && this.page_size == tombstone.page_size && this.has_been_16kb_mode == tombstone.has_been_16kb_mode && Intrinsics.areEqual(this.stack_history_buffer, tombstone.stack_history_buffer);
    }

    public final String getAbort_message() {
        return this.abort_message;
    }

    public final Architecture getArch() {
        return this.arch;
    }

    public final String getBuild_fingerprint() {
        return this.build_fingerprint;
    }

    public final List<Cause> getCauses() {
        return this.causes;
    }

    public final List<String> getCommand_line() {
        return this.command_line;
    }

    public final List<CrashDetail> getCrash_details() {
        return this.crash_details;
    }

    public final Architecture getGuest_arch() {
        return this.guest_arch;
    }

    public final Map<Integer, Thread> getGuest_threads() {
        return this.guest_threads;
    }

    public final boolean getHas_been_16kb_mode() {
        return this.has_been_16kb_mode;
    }

    public final List<LogBuffer> getLog_buffers() {
        return this.log_buffers;
    }

    public final List<MemoryMapping> getMemory_mappings() {
        return this.memory_mappings;
    }

    public final List<FD> getOpen_fds() {
        return this.open_fds;
    }

    public final int getPage_size() {
        return this.page_size;
    }

    public final int getPid() {
        return this.pid;
    }

    public final int getProcess_uptime() {
        return this.process_uptime;
    }

    public final String getRevision() {
        return this.revision;
    }

    public final String getSelinux_label() {
        return this.selinux_label;
    }

    public final Signal getSignal_info() {
        return this.signal_info;
    }

    public final StackHistoryBuffer getStack_history_buffer() {
        return this.stack_history_buffer;
    }

    public final Map<Integer, Thread> getThreads() {
        return this.threads;
    }

    public final int getTid() {
        return this.tid;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final int getUid() {
        return this.uid;
    }

    public int hashCode() {
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = ((((((((((((((((((((((unknownFields().hashCode() * 37) + this.arch.hashCode()) * 37) + this.guest_arch.hashCode()) * 37) + this.build_fingerprint.hashCode()) * 37) + this.revision.hashCode()) * 37) + this.timestamp.hashCode()) * 37) + Integer.hashCode(this.pid)) * 37) + Integer.hashCode(this.tid)) * 37) + Integer.hashCode(this.uid)) * 37) + this.selinux_label.hashCode()) * 37) + this.command_line.hashCode()) * 37) + Integer.hashCode(this.process_uptime)) * 37;
        Signal signal = this.signal_info;
        int iHashCode2 = (((((((((((((((((((((iHashCode + (signal != null ? signal.hashCode() : 0)) * 37) + this.abort_message.hashCode()) * 37) + this.crash_details.hashCode()) * 37) + this.causes.hashCode()) * 37) + this.threads.hashCode()) * 37) + this.guest_threads.hashCode()) * 37) + this.memory_mappings.hashCode()) * 37) + this.log_buffers.hashCode()) * 37) + this.open_fds.hashCode()) * 37) + Integer.hashCode(this.page_size)) * 37) + Boolean.hashCode(this.has_been_16kb_mode)) * 37;
        StackHistoryBuffer stackHistoryBuffer = this.stack_history_buffer;
        int iHashCode3 = iHashCode2 + (stackHistoryBuffer != null ? stackHistoryBuffer.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m19newBuilder();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016N\u000bJ}x#\u001el\u0007*\u007f\u0010*?S`\f\u00125DS\u001bf\u0003O|")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m19newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        arrayList2.add("arch=" + this.arch);
        arrayList2.add("guest_arch=" + this.guest_arch);
        arrayList2.add("build_fingerprint=" + Internal.sanitize(this.build_fingerprint));
        arrayList2.add("revision=" + Internal.sanitize(this.revision));
        arrayList2.add("timestamp=" + Internal.sanitize(this.timestamp));
        arrayList2.add("pid=" + this.pid);
        arrayList2.add("tid=" + this.tid);
        arrayList2.add("uid=" + this.uid);
        arrayList2.add("selinux_label=" + Internal.sanitize(this.selinux_label));
        if (!this.command_line.isEmpty()) {
            arrayList2.add("command_line=" + Internal.sanitize(this.command_line));
        }
        arrayList2.add("process_uptime=" + this.process_uptime);
        if (this.signal_info != null) {
            arrayList2.add("signal_info=" + this.signal_info);
        }
        arrayList2.add("abort_message=" + Internal.sanitize(this.abort_message));
        if (!this.crash_details.isEmpty()) {
            arrayList2.add("crash_details=" + this.crash_details);
        }
        if (!this.causes.isEmpty()) {
            arrayList2.add("causes=" + this.causes);
        }
        if (!this.threads.isEmpty()) {
            arrayList2.add("threads=" + this.threads);
        }
        if (!this.guest_threads.isEmpty()) {
            arrayList2.add("guest_threads=" + this.guest_threads);
        }
        if (!this.memory_mappings.isEmpty()) {
            arrayList2.add("memory_mappings=" + this.memory_mappings);
        }
        if (!this.log_buffers.isEmpty()) {
            arrayList2.add("log_buffers=" + this.log_buffers);
        }
        if (!this.open_fds.isEmpty()) {
            arrayList2.add("open_fds=" + this.open_fds);
        }
        arrayList2.add("page_size=" + this.page_size);
        arrayList2.add("has_been_16kb_mode=" + this.has_been_16kb_mode);
        if (this.stack_history_buffer != null) {
            arrayList2.add("stack_history_buffer=" + this.stack_history_buffer);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Tombstone{", "}", 0, null, null, 56, null);
    }
}
