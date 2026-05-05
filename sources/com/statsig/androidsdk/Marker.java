package com.statsig.androidsdk;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tnAӄLe^.Zݷ2\u000fy\u0002<řc$\u007fLC٥\"}0\u0015WNmnvJp\u000bKƤ\u000e\u0016\u000fj4I[Kc\u070f\u0015Hԏ ?aL(<&!Ԑ5\u0015(8\"Fy\u001d\u00030)v\u0011\u0007\u0003IK\u001a\u0014HB\u00079\u0001\u0010]\r \u0012\u0014B8\u00034[\u0016SFPr]H5;\u0005\u007fA|.o8\u0003M\u001bNl)#u\u0010';H=5#/k\u0005\u001dQ\nJ\u0013Gw=\u0013t?)AH\"dF`\u0006\u0014#9g\u000fsqTe\u0015Yf\f5:geaO<5\b\u0003\u0002\rJ\u0014&\b=G\\:*n\u000e\u000eA\u0006\u000bUVO0kR\b\u0001aD)=\u0002I*g$vYg;'aO}\u001b\fL.\u0011v'[b\"x\u00171S&\\AYF=Vc\"[Sl2}r\n0\u0004>]\u00181\u0012\u0010\\.5?a919\u0004\u0004^C\u0016\u0010\u0015hnSwl`B8mDB:\u0011\u0012ZR\u007f\u001dmfS\u00075!U\"T\u0015\u001a \u00156[&GƼ)\u0010\\l1rx u\f;.\u00158 ˫lV`G2K7gb>n\u0019ϟ\u0015\bEpYphXR:g#ͬ#zVxe\u0010}ZM:\u001cxƴrʬ8,?:%#VY6DW{7j!ԗ\u0011њX32522\u0003`\u0019Rro\u001er?ͩ-ʬd\";s\u001a>'~m$~3+0MүtHPu&_N\u0003\u0015$lBÔ\u0017bB_\nU\u0015%}WKHϖF\u0015\u0001s-e\u0014=y+\u0005U×i\u05cek\bx#tnx'gV-!%g9\u0603\tܐ\u0004yogCPq2#]TH!\u0006 ¨O\u0001\u000b\u0013}6'\u0017nP\b{ՍDے!\u0016\u0006Fw#o=\u0002qDx\u0011\u0014lܰfנ0c$>+Zk\u0013S:_X-EhځmKPVL\u0010\nX\bb\u0016yȬBяtVFnS=\fI\u001f.#o\u0005f\u0001ݫpϻ8.m\\<L\fwvE;\u0010{`.ǡn\u0014j\u0019/'\f!z_wXϙ>֕ZWp*x\u000f\u0002}NCQa3IOԞ5tӃ\u0007\u0019*li4؋+\bL_\u001d\u0017JD\n:\u0005\u000f\u0005\u0001bVV\u0007xGv X\u0004/\u00179\u001e\u00079I\u0007\u0004E\u00034\u0014:\u0007S+\u000f3le}\u0015,[LZ9)0p\u0003!D\fLy\n<\u0004U3\u0006m\u0006\u000bf#-%H\u0018)Ei\u0013uu^k;]jNr\u0005*hhMP2/\u0003\u0003\u000eJ\u0019'\r/N!|\u00135RN\u0006G[\u001c\u0017\u0016r67\u0014\u0003cT,E\bK,kV\u001b\u001c-{eeS\u007f\u001e\u001fN04|'\\e!~\fs\u001ah!\"\u001eh\u0002\u0017'h\"\u001a-x\u007f#\u00124\bDd\u001a5\u0018\u0012\rf\u001c\u007f'@5A\u0005\bXJ\u0017\u0010:krc|m#\u0005|0\u0005\u0013\u001f5V\u001d\u0017Ae0)W\tEA[&X\u001f\u001b,\u0017<\u001ed\u0011\u00131\u0016Oq\u0005\tmeZ;6uֻ)Հ50`\u0006F0\b^\u001c*\u00033EAd7Vf\u001f[\u001bA\u001eѩ_3/r_$)B\u0006Eų]Y\u001aB2\u000b\u001e\u0013<}ٶ\u001e,#Ub\u001f\u0006[HT$gV\u0016ו9כ\u000fu0ϓ)\u0005@\u0001\u0003\u001fzb\u0017\u0005\u0018iB,t]s\u001ee]zݮp݁*YM8P,D\u0013\u00141={X\"D~(?\foAV1\u0013\u0017\u0014f\u0013&\u000bW9Aܖ_К.\r\u0005ӕ%A\u007fVy`\u00149xJ=7@9e~S'Kdz@B\u0006$NU\u07bfoȡ\u0013m4ݹMG$#cj \f%O22FA\u000e[IJ@^\u000bW\rw\u0016\b|ĩB˷H/O؝\u0011u\u0010YwF\u0014fa\u0011BqK4'^V,Ck5P\u0004l8\u000f\u001bՁQƌ;\u001d\u000e)AL\u0015\u0012U#N]itSbj\u0012\r3\u0002\u0012R4w5(Pv]h\n\u0004¢`ŀnxuQm4P\u0014\u0013C\u0012\u0019QTf7n@hGY\u0013^8rw{L\u0019\u000f~\u0013zۓ:̚\u0010\u0019\u000e\u0016<}/\u0004\u0004fnG35M,O{bv\n55\u0013q$40\u001en\u0006C,ߖdؐ=A\u0013mX\u000eMgb\u0019cSkf1N\u000e\u001f{NUiV\u001c@W4\u0019{h\u0007\u0014\u001bѕPڍq>80^4rEc\u0014*Q]W\u001b \rf3Mid)-MV\u001dS\f'\u0004ӄ\u0004К\u0014G!Ѻ# Yt@_D+?O\u0014\nrH\u0004\n$MN\u00078Ķ-ǵ\nK7ϕcn\\#M?wA\u0005J.Ot$!3zi)h</\u0016\u0007\u000b:-ʿTä]\u001dnޞ\u0003\u0011\u00014\u001aT,:[FK.a\u0001*ESaV+\\}?K\u000enRۙqݸj\u0001aƲ]-{ZLW\u0012\u0013i\u0012m<?qj`V\u0019m%n\u001c8\u001e[*8ҍTׅ4%]c{\u000f\fVfTgU\f2j>\u0001\n5\\qDTJ\u0003\u0018\u0015V4\u001f\u0010H9Ńl\u0382LM\u0018ؠ\u0005.-{V19\u0003\u0007\u0013o_dWR\u0001;iI9PlXW\u001c)\u001e͎\u0012¤no\u007f\u0015\n\u0013K8\u00139:/5\u0007D1\u00018=%[K\u001cmE1tcv k^}уtǼ.\u001c\u0014|\u0013P\u0007UX\u001d\u0004@\u0013f\u0005o,=\u0012oGK9\u0015\u0019\u0018j\rhQ/\u05fapˬ`-6{\u0014n*D\u0002\u0003z\u0010D\u001aAc\nQJ\\L64m6$c܆\u001e˲gV+ӻ\u0002d\u0017.<s\u0018\t_\u000egiӱ\u000e\u0010"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`/k\u001bBv2\u000b", "", "9dh", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`-o\"+\u000b05/", "/bc6b5", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`#m\u001d@\u0001.$m\t \r", "Bh\\2f;:[$", "", "AsT=", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\u000eGe9@YS", "AsPAh:\u001c]\u0018~", "", "AtR0X:L", "", "Cq[", "", "7c;6f;\u001c])\b\n", "@dP@b5", "AcZ\u001fX.B]\"", ";`a8X9\"2", "/sc2`7M", "7rA2g9R", "7r32_;:", "1n]3\\.'O!~", "3uP9h(MW#\bY^;x\r6s", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`'\u0001\nC\u0007!D]\b)\u0016m%*QJIA", "3qa<e", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`/k\u001bBv2s9\u000b-Az}.[Q7m4s", "6`b\u001bX;P]&\u0005", "Bh\\2b<M;\u0007", "7r19b*DW\"\u0001", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011U\u000ePe9@YS\u00075w\u001ew[R7zB\"\u00172]B\u0006p6Ru5FR\u0018\bZavG\u001d\u0001n\u0019N\u0001s\nUR 8K3(\nu(\fKe\b\fkt3tx\fd\u001fC\t#yCrdOXl\u0004K@Sa0.yn\u001dg)N/\u0014G\u007f da*S\u0003O\u001at\u001c]pvG\u001bzEy%rWWA9\\8})h(\u0006\u0002\u00192T}\u0001[2\u007fE&\u007fk\u0001Tia,m\u0006\u00195^\u0017\u000e+2M\u000f\tR_~n\bqq.a\n\u000eo\u000b\u0018\u001eav_\u0012\u0016\u0003f\u0019%#pl\u0005@T[%Nk&#\u0010\u0006>d{^v\u00161qnK\u0019\u0002Y|+l\u000e)[\u001a\u0005LT')2\u001f?/um&p3\u0017\u001a\u0005q:U_bR\u0015rH\u001dC2wWhkm=t\u001aKj\u0010UF}R?xe|9|\u001czfzeK{\u007fo//DY4k6\u0016\u0010cd\u001ebn4%!v\u001f\u0011_Dw`M\u000e\u0013\b\u00162\u000b$YMF\u00065\u000bEs!ImO\u0004JYXY\f^\u00116pp%Fe|\u0014J}\n\u0004\u000b9Ny\u001a6.?U.c*=j\u000eU\u0006x\u001c<%\u0005W\\\u0015S\\VDU }hmd\u001d/Pu|L\u000f7?<N\u001e]$/\u0019y\u001e\r.a9C@D\u0005(!=\u001b[nU\u00030Adb\u0012\u0003y628pQ$\f\u0002,&\u001bJL\u0011\u0002'\u0016\nW\u000fRu\r[d\u0006\n\u0002Yl", "5dc\u000eV;B]\"", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9i:\u0006)?bl4Bmk", "5dc\u000eg;>[$\u000e", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "Adc\u000eg;>[$\u000e", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "5dc\u0010b5?W\u001bgvf,", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0010b5?W\u001bgvf,", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0012e9H`", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9u8\u0004+5f<\u007fDz ;5CIy0 \u0015>", "Adc\u0012e9H`", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011W\nI|%B\u0018]-Dw#\u0016MQIg6\u001ej,R", "5dc\u0012i(Ec\u0015\u000e~h5[\t>a\u0004/\n", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9mMr,EU\r$Avt.\\??rBs", "Adc\u0012i(Ec\u0015\u000e~h5[\t>a\u0004/\n", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011O\u001f8}51h\u0002*@L\u0016=IGBy\na\u0006", "5dc\u0015T:'S(\u0011\u0005k2", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "Adc\u0015T:'S(\u0011\u0005k2", "uKY.i(\bZ\u0015\b|(\t\u0007\u00136e{1Q\u0004q", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "5dc\u0016W\u0013Ba(\\\u0005n5\f", "Adc\u0016W\u0013Ba(\\\u0005n5\f", "Adc\u000f_6<Y\u001d\b|", "Adc\u0011X3MO", "Adc\u001fX;Kg", "5dc\u0018X@", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9s<\u000b\u0014Id}u", "5dc\u001aT9DS&bY", "Adc\u001aT9DS&bY", "5dc\u001fX(L]\"", "Adc\u001fX(L]\"", "5dc W2+S\u001b\u0003\u0005g", "Adc W2+S\u001b\u0003\u0005g", "5dc g(Mc'\\\u0005],", "Adc g(Mc'\\\u0005],", "5dc g,I", "u(;0b4\ba(z\nl0~R+n~5\u0006D\u007f%\u0016M9{Kv0$m\t \r", "Adc g,I", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011]\u001d<\u0002\u0014Id}uz^", "5dc h*<S'\r", "Adc h*<S'\r", "5dc!\\4>])\u000ebL", "Adc!\\4>])\u000ebL", "5dc!\\4>a(z\u0003i", "u(;7T=:\u001d z\u0004`u[\u0013?b\u0007(Q", "\u001aiPCTuEO\"\u0001D=6\r\u00066eU", "5dc\"e3", "Adc\"e3", "1n\\=b5>\\(J", "1n\\=b5>\\(JE", "1n\\=b5>\\(JF", "1n\\=b5>\\(JG", "1n\\=b5>\\(JH", "1n\\=b5>\\(JI", "1n\\=b5>\\(JJ", "1n\\=b5>\\(JK", "1n\\=b5>\\(JL", "1n\\=b5>\\(JM", "1n\\=b5>\\(JN", "1n\\=b5>\\(K", "1n\\=b5>\\(KE", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n\\=b5>\\(Q", "1n\\=b5>\\(R", "1n_F", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011U\u000ePe9@YS\u00075w\u001ew[R7zB\"\u00172]B\u0006p6Ru5FR\u0018\bZavG\u001d\u0001n\u0019N\u0001s\nUR 8K3(\nu(\fKe\b\fkt3tx\fd\u001fC\t#yCrdOXl\u0004K@Sa0.yn\u001dg)N/\u0014G\u007f da*S\u0003O\u001at\u001c]pvG\u001bzEy%rWWA9\\8})h(\u0006\u0002\u00192T}\u0001[2\u007fE&\u007fk\u0001Tia,m\u0006\u00195^\u0017\u000e+2M\u000f\tR_~n\bqq.a\n\u000eo\u000b\u0018\u001eav_\u0012\u0016\u0003f\u0019%#pl\u0005@T[%Nk&#\u0010\u0006>d{^v\u00161qnK\u0019\u0002Y|+l\u000e)[\u001a\u0005LT')2\u001f?/um&p3\u0017\u001a\u0005q:U_bR\u0015rH\u001dC2wWhkm=t\u001aKj\u0010UF}R?xe|9|\u001czfzeK{\u007fo//DY4k6\u0016\u0010cd\u001ebn4%!v\u001f\u0011_Dw`M\u000e\u0013\b\u00162\u000b$YMF\u00065\u000bEs!ImO\u0004JYXY\f^\u00116pp%Fe|\u0014J}\n\u0004\u000b9Ny\u001a6.?U.c*=j\u000eU\u0006x\u001c<%\u0005W\\\u0015S\\VDU }hmd\u001d/Pu|L\u000f7?<N\u001e]$/\u0019y\u001e\r.a9C@D\u0005(!=\u001b[nU\u00030Adb\u0012\u0003y628pQ$\f\u0002,&\u001bJL\u0011\u0002'\u0016\nW\u000fRu\r[d\u0006\n\u0002Yb7xzXJCV\u0005+5xuePfz\u0001%;\u001a'YG\u00031}n$\u0013=", "3pd._:", "=sW2e", "6`b566=S", "BnBAe0GU", "\u0013qa<e\u0014>a'z|^", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class Marker {

    @SerializedName(alternate = {}, value = "\b\t\u0019\r\u0012\u0010")
    @InterfaceC1492Gx
    private final ActionType action;

    @SerializedName(alternate = {}, value = "\b\u001a\u0019\t\u0010\u0012\u0015")
    @InterfaceC1492Gx
    private Integer attempt;

    @SerializedName(alternate = {}, value = "\n\u0015\u0013\n\f\tn\u0001\f\u0003")
    @InterfaceC1492Gx
    private String configName;

    @SerializedName(alternate = {}, value = "\f\u0018\u0017\u0013\u0015")
    @InterfaceC1492Gx
    private ErrorMessage error;

    @SerializedName(alternate = {}, value = "\f\u001c\u0006\u0010\u0018\u0003\u0015\t\u000e\f`\u0001\u000fz\u0002\u0004\n")
    @InterfaceC1492Gx
    private EvaluationDetails evaluationDetails;

    @SerializedName(alternate = {}, value = "\u000f\u0007\u0018q\b\u0016\u0018\u000f\u0011\t")
    @InterfaceC1492Gx
    private Boolean hasNetwork;

    @SerializedName(alternate = {}, value = "\u0010\np\r\u0016\u0016c\u000f\u0014\f\u0011")
    @InterfaceC1492Gx
    private Integer idListCount;

    @SerializedName(alternate = {}, value = "\u0010\u0019f\u0010\u0012\u0005\f\t\r\u0005")
    @InterfaceC1492Gx
    private Boolean isBlocking;

    @SerializedName(alternate = {}, value = "\u0010\u0019h\t\u000f\u0016\u0002")
    @InterfaceC1492Gx
    private Boolean isDelta;

    @SerializedName(alternate = {}, value = "\u0010\u0019v\t\u0017\u0014\u001a")
    @InterfaceC1492Gx
    private Boolean isRetry;

    @SerializedName(alternate = {}, value = "\u0012\u000b\u001e")
    @InterfaceC1492Gx
    private final KeyType key;

    @SerializedName(alternate = {}, value = "\u0014\u0007\u0017\u000f\b\u0014ic")
    @InterfaceC1492Gx
    private String markerID;

    @SerializedName(alternate = {}, value = "\u0019\u000b\u0006\u0017\u0012\u0010")
    @InterfaceC1492Gx
    private String reason;

    @SerializedName(alternate = {}, value = "\u001a\n\u0010u\b\t\n\u000f\r")
    @InterfaceC1492Gx
    private String sdkRegion;

    @SerializedName(alternate = {}, value = "\u001a\u001a\u0006\u0018\u0018\u0015c\u000f\u0003\u0003")
    @InterfaceC1492Gx
    private Integer statusCode;

    @SerializedName(alternate = {}, value = "\u001a\u001a\n\u0014")
    @InterfaceC1492Gx
    private StepType step;

    @SerializedName(alternate = {}, value = "\u001a\u001b\b\u0007\b\u0015\u0014")
    @InterfaceC1492Gx
    private Boolean success;

    @SerializedName(alternate = {}, value = "\u001b\u000f\u0012\t\u0012\u0017\u0015lq")
    @InterfaceC1492Gx
    private Integer timeoutMS;

    @SerializedName(alternate = {}, value = "\u001b\u000f\u0012\t\u0016\u0016\u0002\r\u000f")
    @InterfaceC1492Gx
    private final Double timestamp;

    @SerializedName(alternate = {}, value = "\u001c\u0018\u0011")
    @InterfaceC1492Gx
    private String url;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4L\u0007\":\u001b\u007f\u0007ljA0RkP.XS0Ŧq\u0012éT[Rp\u0004be\"\u0004\"\u0017Ofi}mx[\u001bK\u0015\u0006$z\u0003._T'^\"\u00178B}BKO\u0006<gaҽ:\u0005.6jA\b\u000e\u0019\u001c@G>wAƖLT\u001b>J\t<h\f{\u0006`Ǝ\u0007\u0007)\u000f)tid5vm$Ǆ0k.wNf'\u000eܞ-U\u0013Fb'%xw\u001dYAg=\u001b%a\u0005\u001fTq>1@\"E\u000bh5*CK\nVdYFг\u0014s`\u001bj\u000b&\u000b\u0013\u0002f\u001a6CQyJ~\rnĒ{D\u0014J\u0014&\u0006UYtǽ\u0019/\u000f\u001cE\rr\u0002A\u0017ٳ]\u0013\u0016\tdN\u0019;~a,o\u001f=ϧcޅ\u001dT?ަ\u001d\u000f$(\u000ftqqb\u000ex\u00171S&RgU\u0017\u05c8Jݳ\u000e_EЧ\u001crh\t8\n\u0001]\u000e1\u0014\u0013D\u0016S8\u0012=yܱmɘLJoϸ\u001dbn[wX͛D5"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`/k\u001bBv2s9\u000b-Az}.[Q7m4s", "", ";db@T.>", "", "<`\\2", "1nS2", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d\u0010?", "5dc\u0010b+>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001aX:LO\u001b~", "5dc\u001bT4>", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class ErrorMessage {

        @SerializedName(alternate = {}, value = "\n\u0015\t\t")
        @InterfaceC1492Gx
        private final String code;

        @SerializedName(alternate = {}, value = "\u0014\u000b\u0018\u0017\u0004\t\u0006")
        @InterfaceC1492Gx
        private final String message;

        @SerializedName(alternate = {}, value = "\u0015\u0007\u0012\t")
        @InterfaceC1492Gx
        private final String name;

        public ErrorMessage() {
            this(null, null, null, 7, null);
        }

        public ErrorMessage(String str, String str2, String str3) {
            this.message = str;
            this.name = str2;
            this.code = str3;
        }

        public /* synthetic */ ErrorMessage(String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 + 1) - (1 | i2) != 0 ? null : str, (i2 + 2) - (2 | i2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3);
        }

        public static /* synthetic */ ErrorMessage copy$default(ErrorMessage errorMessage, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 + 1) - (1 | i2) != 0) {
                str = errorMessage.message;
            }
            if ((i2 + 2) - (2 | i2) != 0) {
                str2 = errorMessage.name;
            }
            if ((i2 + 4) - (i2 | 4) != 0) {
                str3 = errorMessage.code;
            }
            return errorMessage.copy(str, str2, str3);
        }

        public final String component1() {
            return this.message;
        }

        public final String component2() {
            return this.name;
        }

        public final String component3() {
            return this.code;
        }

        public final ErrorMessage copy(String str, String str2, String str3) {
            return new ErrorMessage(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorMessage)) {
                return false;
            }
            ErrorMessage errorMessage = (ErrorMessage) obj;
            return Intrinsics.areEqual(this.message, errorMessage.message) && Intrinsics.areEqual(this.name, errorMessage.name) && Intrinsics.areEqual(this.code, errorMessage.code);
        }

        public final String getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.message;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.code;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "ErrorMessage(message=" + ((Object) this.message) + ", name=" + ((Object) this.name) + ", code=" + ((Object) this.code) + ')';
        }
    }

    public Marker() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public Marker(KeyType keyType, ActionType actionType, Double d2, StepType stepType, Integer num, Boolean bool, String str, Integer num2, String str2, String str3, String str4, Integer num3, Boolean bool2, Boolean bool3, String str5, EvaluationDetails evaluationDetails, ErrorMessage errorMessage, Boolean bool4, Integer num4, Boolean bool5) {
        this.key = keyType;
        this.action = actionType;
        this.timestamp = d2;
        this.step = stepType;
        this.statusCode = num;
        this.success = bool;
        this.url = str;
        this.idListCount = num2;
        this.reason = str2;
        this.sdkRegion = str3;
        this.markerID = str4;
        this.attempt = num3;
        this.isRetry = bool2;
        this.isDelta = bool3;
        this.configName = str5;
        this.evaluationDetails = evaluationDetails;
        this.error = errorMessage;
        this.hasNetwork = bool4;
        this.timeoutMS = num4;
        this.isBlocking = bool5;
    }

    public /* synthetic */ Marker(KeyType keyType, ActionType actionType, Double d2, StepType stepType, Integer num, Boolean bool, String str, Integer num2, String str2, String str3, String str4, Integer num3, Boolean bool2, Boolean bool3, String str5, EvaluationDetails evaluationDetails, ErrorMessage errorMessage, Boolean bool4, Integer num4, Boolean bool5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? null : keyType, (i2 + 2) - (i2 | 2) != 0 ? null : actionType, (i2 + 4) - (i2 | 4) != 0 ? null : d2, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? null : stepType, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? null : num, (i2 & 32) != 0 ? null : bool, (-1) - (((-1) - i2) | ((-1) - 64)) != 0 ? null : str, (i2 & 128) != 0 ? null : num2, (-1) - (((-1) - i2) | ((-1) - 256)) != 0 ? null : str2, (i2 + 512) - (i2 | 512) != 0 ? null : str3, (i2 + 1024) - (i2 | 1024) != 0 ? null : str4, (i2 + 2048) - (i2 | 2048) != 0 ? null : num3, (i2 + 4096) - (i2 | 4096) != 0 ? null : bool2, (-1) - (((-1) - i2) | ((-1) - 8192)) != 0 ? null : bool3, (i2 + 16384) - (i2 | 16384) != 0 ? null : str5, (i2 & 32768) != 0 ? null : evaluationDetails, (-1) - (((-1) - i2) | ((-1) - 65536)) != 0 ? null : errorMessage, (i2 & 131072) != 0 ? null : bool4, (-1) - (((-1) - i2) | ((-1) - 262144)) != 0 ? null : num4, (-1) - (((-1) - i2) | ((-1) - 524288)) != 0 ? null : bool5);
    }

    public static /* synthetic */ Marker copy$default(Marker marker, KeyType keyType, ActionType actionType, Double d2, StepType stepType, Integer num, Boolean bool, String str, Integer num2, String str2, String str3, String str4, Integer num3, Boolean bool2, Boolean bool3, String str5, EvaluationDetails evaluationDetails, ErrorMessage errorMessage, Boolean bool4, Integer num4, Boolean bool5, int i2, Object obj) {
        Boolean bool6 = bool;
        StepType stepType2 = stepType;
        Integer num5 = num;
        Double d3 = d2;
        ActionType actionType2 = actionType;
        KeyType keyType2 = keyType;
        Boolean bool7 = bool2;
        Integer num6 = num3;
        String str6 = str3;
        String str7 = str2;
        String str8 = str4;
        Integer num7 = num2;
        String str9 = str;
        Boolean bool8 = bool5;
        EvaluationDetails evaluationDetails2 = evaluationDetails;
        String str10 = str5;
        Boolean bool9 = bool4;
        ErrorMessage errorMessage2 = errorMessage;
        Integer num8 = num4;
        Boolean bool10 = bool3;
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            keyType2 = marker.key;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            actionType2 = marker.action;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            d3 = marker.timestamp;
        }
        if ((i2 & 8) != 0) {
            stepType2 = marker.step;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            num5 = marker.statusCode;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            bool6 = marker.success;
        }
        if ((i2 & 64) != 0) {
            str9 = marker.url;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 128)) != 0) {
            num7 = marker.idListCount;
        }
        if ((i2 + 256) - (i2 | 256) != 0) {
            str7 = marker.reason;
        }
        if ((i2 & 512) != 0) {
            str6 = marker.sdkRegion;
        }
        if ((i2 & 1024) != 0) {
            str8 = marker.markerID;
        }
        if ((i2 + 2048) - (i2 | 2048) != 0) {
            num6 = marker.attempt;
        }
        if ((i2 & 4096) != 0) {
            bool7 = marker.isRetry;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8192)) != 0) {
            bool10 = marker.isDelta;
        }
        if ((i2 + 16384) - (i2 | 16384) != 0) {
            str10 = marker.configName;
        }
        if ((i2 + 32768) - (i2 | 32768) != 0) {
            evaluationDetails2 = marker.evaluationDetails;
        }
        if ((i2 & 65536) != 0) {
            errorMessage2 = marker.error;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 131072)) != 0) {
            bool9 = marker.hasNetwork;
        }
        if ((i2 + 262144) - (i2 | 262144) != 0) {
            num8 = marker.timeoutMS;
        }
        if ((i2 & 524288) != 0) {
            bool8 = marker.isBlocking;
        }
        Integer num9 = num7;
        String str11 = str7;
        String str12 = str6;
        String str13 = str8;
        Integer num10 = num6;
        return marker.copy(keyType2, actionType2, d3, stepType2, num5, bool6, str9, num9, str11, str12, str13, num10, bool7, bool10, str10, evaluationDetails2, errorMessage2, bool9, num8, bool8);
    }

    public final KeyType component1() {
        return this.key;
    }

    public final String component10() {
        return this.sdkRegion;
    }

    public final String component11() {
        return this.markerID;
    }

    public final Integer component12() {
        return this.attempt;
    }

    public final Boolean component13() {
        return this.isRetry;
    }

    public final Boolean component14() {
        return this.isDelta;
    }

    public final String component15() {
        return this.configName;
    }

    public final EvaluationDetails component16() {
        return this.evaluationDetails;
    }

    public final ErrorMessage component17() {
        return this.error;
    }

    public final Boolean component18() {
        return this.hasNetwork;
    }

    public final Integer component19() {
        return this.timeoutMS;
    }

    public final ActionType component2() {
        return this.action;
    }

    public final Boolean component20() {
        return this.isBlocking;
    }

    public final Double component3() {
        return this.timestamp;
    }

    public final StepType component4() {
        return this.step;
    }

    public final Integer component5() {
        return this.statusCode;
    }

    public final Boolean component6() {
        return this.success;
    }

    public final String component7() {
        return this.url;
    }

    public final Integer component8() {
        return this.idListCount;
    }

    public final String component9() {
        return this.reason;
    }

    public final Marker copy(KeyType keyType, ActionType actionType, Double d2, StepType stepType, Integer num, Boolean bool, String str, Integer num2, String str2, String str3, String str4, Integer num3, Boolean bool2, Boolean bool3, String str5, EvaluationDetails evaluationDetails, ErrorMessage errorMessage, Boolean bool4, Integer num4, Boolean bool5) {
        return new Marker(keyType, actionType, d2, stepType, num, bool, str, num2, str2, str3, str4, num3, bool2, bool3, str5, evaluationDetails, errorMessage, bool4, num4, bool5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Marker)) {
            return false;
        }
        Marker marker = (Marker) obj;
        return this.key == marker.key && this.action == marker.action && Intrinsics.areEqual((Object) this.timestamp, (Object) marker.timestamp) && this.step == marker.step && Intrinsics.areEqual(this.statusCode, marker.statusCode) && Intrinsics.areEqual(this.success, marker.success) && Intrinsics.areEqual(this.url, marker.url) && Intrinsics.areEqual(this.idListCount, marker.idListCount) && Intrinsics.areEqual(this.reason, marker.reason) && Intrinsics.areEqual(this.sdkRegion, marker.sdkRegion) && Intrinsics.areEqual(this.markerID, marker.markerID) && Intrinsics.areEqual(this.attempt, marker.attempt) && Intrinsics.areEqual(this.isRetry, marker.isRetry) && Intrinsics.areEqual(this.isDelta, marker.isDelta) && Intrinsics.areEqual(this.configName, marker.configName) && Intrinsics.areEqual(this.evaluationDetails, marker.evaluationDetails) && Intrinsics.areEqual(this.error, marker.error) && Intrinsics.areEqual(this.hasNetwork, marker.hasNetwork) && Intrinsics.areEqual(this.timeoutMS, marker.timeoutMS) && Intrinsics.areEqual(this.isBlocking, marker.isBlocking);
    }

    public final ActionType getAction() {
        return this.action;
    }

    public final Integer getAttempt() {
        return this.attempt;
    }

    public final String getConfigName() {
        return this.configName;
    }

    public final ErrorMessage getError() {
        return this.error;
    }

    public final EvaluationDetails getEvaluationDetails() {
        return this.evaluationDetails;
    }

    public final Boolean getHasNetwork() {
        return this.hasNetwork;
    }

    public final Integer getIdListCount() {
        return this.idListCount;
    }

    public final KeyType getKey() {
        return this.key;
    }

    public final String getMarkerID() {
        return this.markerID;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getSdkRegion() {
        return this.sdkRegion;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final StepType getStep() {
        return this.step;
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public final Integer getTimeoutMS() {
        return this.timeoutMS;
    }

    public final Double getTimestamp() {
        return this.timestamp;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        KeyType keyType = this.key;
        int iHashCode = (keyType == null ? 0 : keyType.hashCode()) * 31;
        ActionType actionType = this.action;
        int iHashCode2 = (iHashCode + (actionType == null ? 0 : actionType.hashCode())) * 31;
        Double d2 = this.timestamp;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        StepType stepType = this.step;
        int iHashCode4 = (iHashCode3 + (stepType == null ? 0 : stepType.hashCode())) * 31;
        Integer num = this.statusCode;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.success;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.url;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.idListCount;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.reason;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sdkRegion;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.markerID;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.attempt;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool2 = this.isRetry;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isDelta;
        int iHashCode14 = (iHashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.configName;
        int iHashCode15 = (iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        EvaluationDetails evaluationDetails = this.evaluationDetails;
        int iHashCode16 = (iHashCode15 + (evaluationDetails == null ? 0 : evaluationDetails.hashCode())) * 31;
        ErrorMessage errorMessage = this.error;
        int iHashCode17 = (iHashCode16 + (errorMessage == null ? 0 : errorMessage.hashCode())) * 31;
        Boolean bool4 = this.hasNetwork;
        int iHashCode18 = (iHashCode17 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num4 = this.timeoutMS;
        int iHashCode19 = (iHashCode18 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool5 = this.isBlocking;
        return iHashCode19 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final Boolean isBlocking() {
        return this.isBlocking;
    }

    public final Boolean isDelta() {
        return this.isDelta;
    }

    public final Boolean isRetry() {
        return this.isRetry;
    }

    public final void setAttempt(Integer num) {
        this.attempt = num;
    }

    public final void setBlocking(Boolean bool) {
        this.isBlocking = bool;
    }

    public final void setConfigName(String str) {
        this.configName = str;
    }

    public final void setDelta(Boolean bool) {
        this.isDelta = bool;
    }

    public final void setError(ErrorMessage errorMessage) {
        this.error = errorMessage;
    }

    public final void setEvaluationDetails(EvaluationDetails evaluationDetails) {
        this.evaluationDetails = evaluationDetails;
    }

    public final void setHasNetwork(Boolean bool) {
        this.hasNetwork = bool;
    }

    public final void setIdListCount(Integer num) {
        this.idListCount = num;
    }

    public final void setMarkerID(String str) {
        this.markerID = str;
    }

    public final void setReason(String str) {
        this.reason = str;
    }

    public final void setRetry(Boolean bool) {
        this.isRetry = bool;
    }

    public final void setSdkRegion(String str) {
        this.sdkRegion = str;
    }

    public final void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public final void setStep(StepType stepType) {
        this.step = stepType;
    }

    public final void setSuccess(Boolean bool) {
        this.success = bool;
    }

    public final void setTimeoutMS(Integer num) {
        this.timeoutMS = num;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        return "Marker(key=" + this.key + ", action=" + this.action + ", timestamp=" + this.timestamp + ", step=" + this.step + ", statusCode=" + this.statusCode + ", success=" + this.success + ", url=" + ((Object) this.url) + ", idListCount=" + this.idListCount + ", reason=" + ((Object) this.reason) + ", sdkRegion=" + ((Object) this.sdkRegion) + ", markerID=" + ((Object) this.markerID) + ", attempt=" + this.attempt + ", isRetry=" + this.isRetry + ", isDelta=" + this.isDelta + ", configName=" + ((Object) this.configName) + ", evaluationDetails=" + this.evaluationDetails + ", error=" + this.error + ", hasNetwork=" + this.hasNetwork + ", timeoutMS=" + this.timeoutMS + ", isBlocking=" + this.isBlocking + ')';
    }
}
