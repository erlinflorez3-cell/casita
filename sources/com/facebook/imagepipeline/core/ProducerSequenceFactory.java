package com.facebook.imagepipeline.core;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.media.MediaUtils;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.AddImageTransformMetaDataProducer;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheGetProducer;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheKeyMultiplexProducer;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer;
import com.facebook.imagepipeline.producers.BitmapPrepareProducer;
import com.facebook.imagepipeline.producers.BitmapProbeProducer;
import com.facebook.imagepipeline.producers.BranchOnSeparateImagesProducer;
import com.facebook.imagepipeline.producers.CustomProducerSequenceFactory;
import com.facebook.imagepipeline.producers.DataFetchProducer;
import com.facebook.imagepipeline.producers.DecodeProducer;
import com.facebook.imagepipeline.producers.DelayProducer;
import com.facebook.imagepipeline.producers.DiskCacheReadProducer;
import com.facebook.imagepipeline.producers.DiskCacheWriteProducer;
import com.facebook.imagepipeline.producers.EncodedCacheKeyMultiplexProducer;
import com.facebook.imagepipeline.producers.EncodedProbeProducer;
import com.facebook.imagepipeline.producers.LocalAssetFetchProducer;
import com.facebook.imagepipeline.producers.LocalContentUriFetchProducer;
import com.facebook.imagepipeline.producers.LocalContentUriThumbnailFetchProducer;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.LocalFileFetchProducer;
import com.facebook.imagepipeline.producers.LocalResourceFetchProducer;
import com.facebook.imagepipeline.producers.LocalThumbnailBitmapSdk29Producer;
import com.facebook.imagepipeline.producers.LocalVideoThumbnailProducer;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.producers.PartialDiskCacheProducer;
import com.facebook.imagepipeline.producers.PostprocessedBitmapMemoryCacheProducer;
import com.facebook.imagepipeline.producers.PostprocessorProducer;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.QualifiedResourceFetchProducer;
import com.facebook.imagepipeline.producers.RemoveImageTransformMetaDataProducer;
import com.facebook.imagepipeline.producers.ResizeAndRotateProducer;
import com.facebook.imagepipeline.producers.SwallowResultProducer;
import com.facebook.imagepipeline.producers.ThreadHandoffProducerQueue;
import com.facebook.imagepipeline.producers.ThrottlingProducer;
import com.facebook.imagepipeline.producers.ThumbnailBranchProducer;
import com.facebook.imagepipeline.producers.ThumbnailProducer;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яč\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmH<[[*\u0015k\u00044:[,ڎK;k\u001a\u0006\"\u000fQVg}nRZ\u0011E\u0017\u0006$\u0019r,_U\u0001]\u0018\u000f:B\u0006?;M\u0006=A`z?\r @E@y\u001b\u0001\"*^\u0010~zIP\u0014\u0012F@x:X\u0018U\u00050\u0012\u000e>&)&\\}N>HrhB/1\u0012qBd'g0\u0003T#Ͽr\u070f\f'aL*x7ߒ\u0014eُ\u0002\u0017Vi?\u001b? >\u0015l5)CI\"ZF`\u000e\u0018-/_\rcsTa\u0015Un\u0012?+}j[T\u001c0\u0010z*\u0014L\b\u001c\u000f?H\\7*j\u0016\u0019Kt!_PT\u0010kZ\u007f)hF\u001b3\u000eK+g\"vUoJ1Ne\u0003\u0015\u0011,3\u0019nOld\u0012n'3T&XAUNP`N8`Mq\u0012\u0005z\u0002X\u000b@S\u000eD\u0014\u0019>\u001957\nP9 \u001a\u0018ҩHg\u0005\u001d)\u0003aRjTP*~\u001cG,\u0019\f\tm\u0013-\u001aj\u0005\\:ze\u001c\u0003qD\b[FjcT-5\u0018^UxkzM\f3SW\u0015Q\n~yzoEn;EWs\u0012qR%=md\u0011\u001f\u001ff\u000bg\u001aHt026Xl&v*u|&C6M[44Z\u001ca~#7\u001b&RE\r\u000buY\u0017A-nc4\u0011V<\u0001\u0019\t`b\u0001qwxwU+\tPG\bQ}14E:tD\u00053\r\u000fu\u0010G\u0016uut\u001b0&Y\n\n.\u001ag<wc!\u007f\u00175B\n=K\\tuQ{;U#+\u0014?Kv\u001b\u007f\u0014zx<fzL_TEK%\u0007!=NdH\u000eo8\u0013OsX\u001b]TH!4\bV~<\u000bn7\u001eSk8:\u000b(EO7%&}$1%a\f)\u001eV(|?*\u0003O\u001c,\u0012\u00018\t_QJGHQi\u0005N$4l1kv\u0013&\"r\u0019ByKTQl\u0001\\HO\u001b/,\u00105T;\u000b\u001d[\u00039}rL:o2\u0004I\u000e\u0016nCS:{{\u0016\b\u001e[jwb\u001b\u001a\u0013\f7~\u0014,=N\u007f\u0006\u000b7JLs`TO1z\u0011L\u00114:<>\u0018\u000bq}\u0018.>\u00150Pm{/8RuKV<o'v\u001fh\u0013W]l12\u0011\u0005\u001f5.xcZ3\u0016tn_m@mk#\u0019\u001dzO-\u0002SE\u000bT\u0002T6O\u0019\u0017UeSO\u00128\u0014GW\u0017\u001a\u0018:RH\u0007+/0!IS!_%K\r%\u0006t\\\\\u000f\u001evZ^(9\u0001\u000b|<W8\t9\u0012\u0016rƚf-ZI@MQ\u0016\u0019\u001dT+\u0017\f+~t5]\u000eC1UMz\u0014-|\u0006X\u0004\u0018\u0016\u001d8-\u0014v1\\\u0006)\u0015$\u000e%H\u0003\n\u001cr\u0004\u0019\u0013~;2H\u0011t;$<\u0006NU\u00125\u0012\u0013\rt\u001a\u0012QJ5\u0018\u0005\fRMxx8~\u001b}5US*t۳U\u0012t=R-\tUh\\-\tjH\tk,h\u0019\u0010\u001a%(/66}W\n}\\/pքS\\\u001bč.4^oɸ/j$\u000e!\nu2E\u0003BEEd:Vj\u0019^|B\u0006)\r\u0005Xt\u0003\u0004A \r\u0007Xd!\u0015DF!9\u0013)e\u0012e[ǏK`\u0015~\u0016U45IRm\"\u000eֻ\rÃ,v\u0019ܛ\u000b\u0004\u0003\u0019BJ\u0019v\u0010iB,tok4]\u001ezݭѫ\u0003ΜOO@D\u000eJ\u001f-)1`T.[-;*[i;Q\u001d!\u0003+74\u000b53k/(ơϼ*ʫ\u0001\u000b\u0015A\u007fSyY\f9xD=,@<e\nS-Ei\\)\"\u0001\u0014e-g\u001a\u001beʯηIˢI(\u0002WF%\u0018><&\f\u001a1\u001d\u0016wVPw\u0001Pd\u0004c\u0014.:<~F3G\u001b\"\"2Z\u0004(\u0002tgq<Q\u0001$\u001bT>XV\u001b/sg\u0017!AHKIjɦ\u001bҋ-E\u001fτ Qwj9t\u000bO5\tki3u\nh@\u0011\u0007<UpqJ\u0016;\"`srzsaa 8@6;,&Kbj\u0010h-\u001c7M\rEd\u000e'go\nADM(5݃Nՠ\u000f\u0018\u001eǚX\u0019\b0X\f-\u00159z\u0002ng\u0014\\0/Laz3;=mzIOU skSiODԹմ5Ǚ`\u000f]#Q\u001c94\u0018l1dUs\u000f&8X\u001e\u000ese\u001fϤFѰH(uӧ\u0001D^\u0014rKm\u0003,\u001fkl+d-H9ۜ]܌\u0015+?ǚ?wc[E\u0005\u0012\u000b G)\u0015\u001b\u001e\u0002b`K\"'g\u0003RŇ֤Iʳ\u0001wQ\u0012\t\u001cX@G\bEhOh=bsN1Wm\u0006bԏ)դ\n\u0013,߬8\u001fw\u0019:_1X\r̈+ےOY\u0019ޯ\u0013v\u001d\u000b\r\f\\\u001d\u000f˔\bܖ\n\u0011jɏ\u0006GmSD.\u001f\u0010\u001eڥlʛ.ewѕEe[WCuGE\bޤ\u0013̑S_\u001cש\"\u0002fy/c6H#\b*\u001f6a*qWXEo\u001a2Aԛ؈`ؕ]>s2j7\u0001\u0006|@izJe=>t\u000e\u0016'aLr\u000fprXA>\"\u001bTUP~/oɵ\u0380Kڼ\u001b\u001e?F|duRR$gbazulXH&vq\u007f%\u0002m5F\r\u001eU+=3X\u001d7ZȦϻMܝ\bu74L\u001fN;E\\-1v%z9\u001aB\u001d8~[bW\u0006!\u0003d-bLBoqo\fw˒н\u0019۠\fBUZ\u00017f{50\u0002L-=Z};4O\u0011LTe;g<m\"9\u007f\u007fvN>\u001a,:(!жԀiϔ\u0015g6O}Rg[qC\bT0Ft-#s\u001aTDRB(3\u0003\u001f6Fs\u0015\u0017'??*b\u05f5۷u˗6wFul,uSY?[+\rb}T\u007fWcU}\u0007;M\u001eK&:}u\u001c\u001e\nW\u000bZ\tΕ؊\u0004ϐ\u0014}h]Hh\u0006'z6q\u000b\ndS9x\u001eF&jn~r\u0007Rq\u0010k?;<3X*nyՓϷ_ϓk\nC\u000bvqEp]f\u0011\u0018\u001fE1WLg'Thn\u001e!\u0012\u0007[dH?gm'Z\u0002Y2ߵߊcÂ&qPm.\u0007\u0018\u0017.8#VCV]\u0019^7Msn\u0011e)\u001e)~O61^Zuw\u0011d\u0006؈ג\u000eϘjVX\u000fGazM\u000fxxpM2ROS}5Ou!w\u000bFnK]\u0017|\u0013#L\t\u0012 }ލ۽\u0006í\u0017K'\u0018\u0014\u0002\u0016\u001f\r]:,\u0004\u001e\u0011i!j2K>\f$\u0007{K3f8[g\u0004*ɛƤ+џchJ\u0007\u0013\u0006/G#\u001a.Az0@%6&[\u0017\u0007\u001bs\n>! փ\u000b\u058bUv\u0003͞\u0003\u001c.c(?8\u001a9ƒyõ%I8ٜDO[.\u0006\">x\u007fv\bf U\u0002>m~&_sP>@bI$nlL7a8F'\u000eLHXL`&\u001dWQ`'\u0002F٘^ؒ\u0016r<΅EZF\u00189N\u0019(\u0007d\u0017P}-\u001a#g\u0005\u0017p\u001dh\u000fPq\u00155ڠ@ƒ\u0001\b9ڭT+YKJ(IQ\n'{6P\"X\fBL\u0014&C\u0011'¦Ϲ6ο@,A>![>\u001e/\u0013FQ\u0003!\u007fR\u001fx!p_9 ƙ^φ0^1շ<\u0006=YjA{x\u0006ع\u0019ߔ<a?̝\u001cq0)]gkP{ޒ\u000fߜn\f|֧mA\u007fdv*m\t\\ϧ\u0016ϸ\u00036xğܤB؟\u001b"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u000bDw\u0015>KCHY4*%hj7\u0007D(L\u00061T`$", "", "1n]AX5M@\u0019\r\u0005e=|\u0016", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001 &4o\u001cF}65fS", ">q^1h*>`yzxm6\n\u001d", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u000bDw\u0015>KCHL0\u001c$rnM\\", "<dcDb9D4\u0019\u000exa,\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w6CJ}>+\u001bIaH\u0005f,[L", "@db6m,\u001a\\\u0018k\u0005m(\f\t\u000fn{%\u0003@\u007fw!TX\u000eK\t/B_", "", "EdQ=F<I^#\f\n>5x\u00066e~", "Bga2T+!O\"}\u0005_-g\u00169d\u0010&{Ml'\u0017Wo", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w<FHk0\u001dwdj8\u0011d-9\u00041F\\L,i>\u0003=$\u00120", "2nf;f(F^ ~bh+|", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG~A\u007f\u001f<IKFr4\u0006\u001fga\u000f", "CrT\u000f\\;FO$i\b^7x\u0016/T\n\u0007\t<\u0013", ">`aA\\(E7!z|^\nx\u00072i\t*[I|\u0014\u001eGn", "2hb86(<V\u0019^\u0004Z)\u0004\t.", "7lP4X\u001bKO\"\rxh+|\u0016\u0010a}7\u0006M\u0015", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u000621b\f\u001eAl\u0016;\u0017'Cg6\u001e\u0004u]B\u0015a6Mv4(HL;f_\u0007\u0013", "7r4;V6=S\u0018fzf6\n\u001d\ra}+{+\u000e!\u0014Kx\u0010\u001c\u007f!2`}\u001f", "7r36f2\u001cO\u0017\u0002zI9\u0007\u00063n\u0002\b\u0005<}\u001e\u0017F", "/k[<j\u000b>Z\u0015\u0013", "1tbAb4)`#}\u000b\\,\nv/q\u0010(\u0005>\u0001w\u0013E~\u0018Iz%C", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w+SIz>&\u007fuk8\u0017a,[d'S\\N5ZRS9\u0012!d\u001bb\u0001", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017 V\\\u000eJ\u0001,FY\u000bu\u001ek 6\u0017D7i4\u001b\u001frg\u0003\u000bk(Pv2KWN3`[r\u0007\u0012\u001cg\u000e\u0018\u0016\u001a\u000fXQ\"nQ\u0018\u001b\u0006;S\u000fO>g\n \u0016~kl@V\rQ\u0004\u001b?E1dHYj}RALf3dUj*f9J\"\u0014~'dQP=\u001c\u0006`\u0017SR\tejG&P-\u0019%keN\u000fpQ:t$)U\u0002A\u0016:Tv+\u007f1\u000f41:m\u0005\u0015r%H]\t\u0013,iOp\u00159I\u0013;JFqu=\u0018i L\u0015\u0018aE/\u0019rQsH\u001f\u00073}Y?i)\u00023P\u0006;Sy\u001bpJ\u0007>]y \r\u0012$tiRCdR\u000b'p\u000e\u0001i#\f\u0011b '5\u0016%c\u000eh\u007fT,By\u0007r@U|UA\u0015mR\u001as\u0015vcSq$A|\u001cI(7T<@aPk\u0019$2\u000b\n~*=MJu8\u0013\u001429bF`j.\u000bt4\u001e\u0017vB)3\u0003&vG'sZ\t#^\u000e\u001dl\u0004^K>GWv2", "0`R8Z9Hc\"}ah*x\u0010\ro\t7{I\u0010\u0007$KP\u000eKt($c])5w\u0015.5CCuA2\u0003hmI\u0007l*N", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w8PEjD\u001c\u0015u7", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0017v\u00148LC:O<\u001a\u0017h7", "5dc\u000fT*DU&\t\u000bg+c\u0013-a\u0007\u0006\u0006I\u0010\u0017 V_\u001b@W%DW\u0001\u000fAM\u001f,WB;S4&\u001fuu'\u0007o<N\u007f%G", "u(;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn@f\b\u001fGk\u0016;[\r&x>\u001d%faF\\", "0`R8Z9Hc\"}ah*x\u0010\ro\t7{I\u0010\u0007$KP\u000eKt($c])5w\u0015.5CCuA2\u0003hmI\u0007l*N5&GSN.Xar", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "0`R8Z9Hc\"}ah*x\u0010\u0010i\u0007(\\@\u0010\u0015\u001a6ymEt/4Ye ?w#B;CG{4'\u0013h", "5dc\u000fT*DU&\t\u000bg+c\u0013-a\u0007\t\u007fG\u0001w\u0017Vm\u0011+\u0001\u0005>W\b\u001f7U\u00166WPOY4*%hj7\u0007", "0`R8Z9Hc\"}ah*x\u0010\u0010i\u0007(\\@\u0010\u0015\u001a6ymEt/4Ye ?w#B;CG{4'\u0013h 8\u0007j,Pr6G", "0`R8Z9Hc\"}c^;\u000f\u0013<k`(\u000b>\u0004\u0006!'x\fFu%4A}(Az*\u001cMOKk=\u001c\u0015", "5dc\u000fT*DU&\t\u000bg+e\t>w\n5\u0002!\u0001&\u0015J^\u0018\u001c\u007f#?X}\u001f\u001fm\u001e8ZW)k@.\u0015q_9", "0`R8Z9Hc\"}c^;\u000f\u0013<k`(\u000b>\u0004\u0006!'x\fFu%4A}(Az*\u001cMOKk=\u001c\u0015'`9\u000ec.J\u0006'", "0hc:T7)`\u0019\nvk,j\t;u\u007f1y@\u000f", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\u000e\u0017\u0018G|\u000eEt%C#['A{\u0016*JJ;X4\u001f\u0015uaB\u0005c\u0002", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0015t <M?8r4\u0002\u001ddc9\\", "5dc\u000f\\;FO$i\b^7x\u0016/S\u007f4\f@\n\u0015\u0017U.\nE\u007f/DU\r$Av$", "u(E", "5dc\u000f\\;FO$i\b^7x\u0016/S\u007f4\f@\n\u0015\u0017U", "u(;7T=:\u001d)\u000e~eud\u0005:;", "Adc\u000f\\;FO$i\b^7x\u0016/S\u007f4\f@\n\u0015\u0017U", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)p", "1k^@X(;Z\u0019b\u0003Z.|s<e\u0001(\u000b>\u0004\u0005\u0017S\u007f\u000eEt%C", "\u001aiPCTuEO\"\u0001DO6\u0001\b\u0005", "5dc\u0010_6LS\u0015{\u0002^\u0010\u0005\u00051ej5{A\u0001&\u0015J]\u000eH\u0007%>W}.ui\u001f7WR7z8(\u001ev", "5dc\u0010_6LS\u0015{\u0002^\u0010\u0005\u00051ej5{A\u0001&\u0015J]\u000eH\u0007%>W}.", "Adc\u0010_6LS\u0015{\u0002^\u0010\u0005\u00051ej5{A\u0001&\u0015J]\u000eH\u0007%>W}.", "1n\\:b5'S(\u0011\u0005k2]\t>c\u0003\u0017\u0006 \n\u0015!Fo\r$v-?f\u0012\u000e7y&.VA;", "5dc\u0010b4F]\"gzm>\u0007\u00165F\u007f7yCo!vPm\u0018;v$\u001dY\u0006*D\u0002\u0004.YS;t2\u001e", "1n\\:b5'S(\u0011\u0005k2]\t>c\u0003\u0017\u0006 \n\u0015!Fo\r$v-?f\u0012\u000e7y&.VA;*3\u001e\u001chc5\u0016c", "2`c.9,MQ\u001clzj<|\u0012-e", "5dc\u0011T;:4\u0019\u000exa\u001a|\u0015?e\t&{", "2`c.9,MQ\u001clzj<|\u0012-e>'{G\u0001\u0019\u0013Vo", ":nR._\bLa\u0019\u000e[^;z\f\u001de\f8{I~\u0017", "5dc\u0019b*:Zt\r\t^;]\t>c\u0003\u0016{L\u0011\u0017 Eo", ":nR._\bLa\u0019\u000e[^;z\f\u001de\f8{I~\u0017UFo\u0015<x!DY", ":nR._\nH\\(~\u0004m\u001c\n\r\u0010e\u000f&~ \n\u0015!Fo\r ~!7Yh-Al&,MP)k@.\u0015q_9", "\u001ab^:\"-:Q\u0019{\u0005h2F\u00079m\b2\u0005\n\t\u0017\u001fQ|\"\u0006a/?`}\u001f\u0014\u0002%.*S<l4+j", "5dc\u0019b*:Zv\t\u0004m,\u0006\u0018\u001fr\u0004\t{O~\u001avPm\u0018;v$\u0019ay\"7X#8LS9kA\f\u0015tq9\u0010a,", ":nR._\nH\\(~\u0004m\u001c\n\r\u0010e\u000f&~ \n\u0015!Fo\r ~!7Yh-Al&,MP)k@.\u0015q_9Eb,Uv)C[N", ":nR._\nH\\(~\u0004m\u001c\n\r\u0010e\u000f&~.\u0001#'Gx\f<", "5dc\u0019b*:Zv\t\u0004m,\u0006\u0018\u001fr\u0004\t{O~\u001a\u0005G{\u001e<\u007f#5", ":nR._\nH\\(~\u0004m\u001c\n\r\u0010e\u000f&~.\u0001#'Gx\f<5$5`}\"3|\u0016", ":nR._\rBZ\u0019_zm*\u007fh8c\n'{?d\u001f\u0013IoxI\u0001$EW}-%m\">ML9k", "5dc\u0019b*:Zy\u0003\u0002^\r|\u0018-h_1yJ\u007f\u0017\u0016+w\n>v\u0010Bc|05m#\u001cMOKk=\u001c\u0015']B\u0010m;J\u0006+QU\\", "5dc\u0019b*:Zy\u0003\u0002^\r|\u0018-h_1yJ\u007f\u0017\u0016+w\n>v\u0010Bc|05m#\u001cMOKk=\u001c\u0015", ":nR._\rBZ\u0019_zm*\u007fh8c\n'{?d\u001f\u0013IoxI\u0001$EW}-%m\">ML9kr\u001d\u0015oa;\u0003r,", ":nR._\rBZ\u0019_zm*\u007fw9E\t&\u0006?\u0001\u0016~Gw\u0018I\u000b\u0010BY~ Fk\u0019\u001cMOKk=\u001c\u0015", "5dc\u0019b*:Zy\u0003\u0002^\r|\u0018-hn2[I~!\u0016Gnu<~/Bmh-7n\u0016=KF)k@.\u0015q_9", ":nR._\rBZ\u0019_zm*\u007fw9E\t&\u0006?\u0001\u0016~Gw\u0018I\u000b\u0010BY~ Fk\u0019\u001cMOKk=\u001c\u0015'`9\u000ec.J\u0006'", ":nR._\u0010FO\u001b~[b3|i/t}+i@\r'\u0017Pm\u000e", "5dc\u0019b*:Z|\u0007v`,]\r6e`(\u000b>\u0004\u0005\u0017S\u007f\u000eEt%", ":nR._\u0010FO\u001b~[b3|i/t}+i@\r'\u0017Pm\u000ezu%<Y\u007f\u001cFm", ":nR._\u0019>a#\u000f\b\\,]\t>c\u0003\u0016{L\u0011\u0017 Eo", "5dc\u0019b*:Z\u0006~\th<\n\u0007/F\u007f7yCn\u0017#Wo\u0017:v", ":nR._\u0019>a#\u000f\b\\,]\t>c\u0003\u0016{L\u0011\u0017 EoL;v,5[y/7", ":nR._\u001bAc!{\u0004Z0\u0004e3t\b$\u0007.\u007f\u001dc\u001bP\u000eKt(#Y\n07v\u0014.", "5dc\u0019b*:Z\b\u0002\u000bf)\u0006\u00053l\\,\u000bH|\"\u0005FuZ\u0010W%DW\u0001\u000e7y&.VA;", ":nR._\u001bAc!{\u0004Z0\u0004e3t\b$\u0007.\u007f\u001dc\u001bP\u000eKt(#Y\n07v\u0014.\fB;r4 \u0011wa", ":nR._\u001dBR\u0019\t[b3|i/t}+i@\r'\u0017Pm\u000e", "5dc\u0019b*:Z\n\u0003y^6]\r6e`(\u000b>\u0004\u0005\u0017S\u007f\u000eEt%", ":nR._\u001dBR\u0019\t[b3|i/t}+i@\r'\u0017Pm\u000ezu%<Y\u007f\u001cFm", "<dcDb9D4\u0019\u000exa\f\u0006\u00079d\u007f'_H|\u0019\u00172|\u0018;\u0007#5fk C}\u00167KC", "5dc\u001bX;P]&\u0005[^;z\f\u000fn}2z@\u007fz\u001fCq\u000e'\u0004/4i{ D[\u0016:]CDi4", "<dcDb9D4\u0019\u000exa\f\u0006\u00079d\u007f'_H|\u0019\u00172|\u0018;\u0007#5fk C}\u00167KCyj4%\u0015j]H\u0007", "<dcDb9D4\u0019\u000exa\u001a|\u0015?e\t&{", "5dc\u001bX;P]&\u0005[^;z\f\u001de\f8{I~\u0017", "<dcDb9D4\u0019\u000exa\u001a|\u0015?e\t&{~\u007f\u0017\u001eGq\nKv", "<dcDb9D4\u0019\u000exa\u001b\u0007h8c\n'{?h\u0017\u001fQ|\"'\u0004%6Y\r\u001e:[\u0016:]CDi4", "5dc\u001bX;P]&\u0005[^;z\f\u001eo_1yJ\u007f\u0017\u0016/o\u0016F\u00049 f}!7|\u00141;CG{4'\u0013h", "<dcDb9D4\u0019\u000exa\u001b\u0007h8c\n'{?h\u0017\u001fQ|\"'\u0004%6Y\r\u001e:[\u0016:]CDi4\\\u0014hh9\t_;N", ">nbAc9HQ\u0019\r\th9j\t;u\u007f1y@\u000f", "5dc\u001db:M^&\tx^:\u000b\u0013<S\u007f4\f@\n\u0015\u0017U.\nE\u007f/DU\r$Av$", "5dc\u001db:M^&\tx^:\u000b\u0013<S\u007f4\f@\n\u0015\u0017U", "Adc\u001db:M^&\tx^:\u000b\u0013<S\u007f4\f@\n\u0015\u0017U", "?tP9\\-BS\u0018kzl6\r\u0016-e`(\u000b>\u0004\u0005\u0017S\u007f\u000eEt%", "5dc\u001eh(EW\u001a\u0003z]\u0019|\u00179u\r&{!\u0001&\u0015J]\u000eH\u0007%>W}", "?tP9\\-BS\u0018kzl6\r\u0016-e`(\u000b>\u0004\u0005\u0017S\u007f\u000eEt%sX}'7o\u0012=M", "5dc\u000fT:BQw~xh+|\b\u0013m{*{.\u0001#'Gx\f<", "7lP4X\u0019>_)~\tm", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0004%Ai}.F7y6IE;X4*%hoH\\", "5dc\u000f\\;FO$i\b^7x\u0016/S\u007f4\f@\n\u0015\u0017", "7m_Bg\u0017K]\u0018\u000fx^9", "5dc\u0011X*HR\u0019}^f(~\t\u001ar\u007f){O~\u001a\u0002Ty\rLt%BG},Gm\u001f,M", "5dc\u0011X*HR\u0019}^f(~\t\u001ar\u007f){O~\u001a\u0005G{\u001e<\u007f#5", "5dc\u0011X*HR\u0019}^f(~\t\u001ar\n'\f>\u0001$\u0005G{\u001e<\u007f#5", "5dc\u0011X3:g\u0007~\u0007n,\u0006\u0007/", "5dc\u0012a*HR\u0019}^f(~\t\u001ar\u007f){O~\u001a\u0002Ty\rLt%BG},Gm\u001f,M", "5dc\u0012a*HR\u0019}^f(~\t\u001ar\n'\f>\u0001$\u0005G{\u001e<\u007f#5", "5dc\u001db:M^&\tx^:\u000b\u0013<S\u007f4\f@\n\u0015\u0017", "<df\u000f\\;FO$\\v\\/|j/tn2XD\u0010\u001f\u0013RM\n:y%#Y\n07v\u0014.", "<df\u000f\\;FO$\\v\\/|j/tn2Z@~!\u0016G]\u000eH\u0007%>W}", "<df\u000f\\;FO$\\v\\/|j/tn2bJ~\u0013\u001e6|\nE\u0005&?f\u0006\u000e7y&.VA;", "Bgd:U5:W i\bh+\r\u0007/r\u000e", "", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00022?X\u000e\u001e7z$w<FKs1'\u0011lh$\u0014m+^t'T\"", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@0Bc|05m#<\u0017.Hu3.\u0013hn\u000f|J*X~pHHL,Y\\|C]\u0016b\nP+\u0018\tdA+rM7h\u00139S\u0001Kf\u0001\u0019$W$m\u0001JS\u0019C}\u001c`N3gVW_\u0007\u001d\u0005,`4lU`\u0019Z:7.\u001ewb\u001fpL0\n\u0007W\u001crY}pg\u0011$\bB#Nk[SS9@I~&/I{\u0005g", "<df\u0010b4F]\"gzm>\u0007\u00165F\u007f7yCo!vPm\u0018;v$\u001dY\u0006*D\u0002\u0004.YS;t2\u001e", "<df\u0011\\:D1\u0015|}^\u001a|\u0015?e\t&{", "<df\u0012a*HR\u0019}XZ*\u007f\t\u0017u\u00077\u007fK\b\u0017*6y|Ir.CW\b\u001f7[\u0016:]CDi4", "<df\u0019b*:Z\b\u0002\u000bf)\u0006\u00053lj5\u0006?\u0011\u0015\u0017T", "uZ;0b4\bT\u0015|z[6\u0007\u000fxi\b$}@\f\u001b\"Gv\u0012Evn@f\b\u001fGk\u0016;[\r*nD&\u0012q]=\u000eN9Xu7EL[\u0002 9pG\u001c[[\nL+\n\u000fcGmrL3!\b7M\r;o\u0005\u0015\u0016W@wzAf\u000eG\u0007#?,6rEi]yT\u0017", "<df\u0019b*:Z\b\fvg:}\u0013<m{7\u007fJ\n%\u0005G{\u001e<\u007f#5", "\u0011n\\=T5B]\"", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ProducerSequenceFactory {
    public static final Companion Companion = new Companion(null);
    private final boolean allowDelay;
    private final Lazy backgroundLocalContentUriFetchToEncodeMemorySequence$delegate;
    private final Lazy backgroundLocalFileFetchToEncodeMemorySequence$delegate;
    private final Lazy backgroundNetworkFetchToEncodedMemorySequence$delegate;
    private Map<Producer<CloseableReference<CloseableImage>>, Producer<CloseableReference<CloseableImage>>> bitmapPrepareSequences;
    private Map<Producer<CloseableReference<CloseableImage>>, Producer<Void>> closeableImagePrefetchSequences;
    private final Lazy commonNetworkFetchToEncodedMemorySequence$delegate;
    private final ContentResolver contentResolver;
    private final Set<CustomProducerSequenceFactory> customProducerSequenceFactories;
    private final Lazy dataFetchSequence$delegate;
    private final boolean diskCacheEnabled;
    private final DownsampleMode downsampleMode;
    private final ImageTranscoderFactory imageTranscoderFactory;
    private final boolean isDiskCacheProbingEnabled;
    private final boolean isEncodedMemoryCacheProbingEnabled;
    private final Lazy localAssetFetchSequence$delegate;
    private final Lazy localContentUriFetchEncodedImageProducerSequence$delegate;
    private final Lazy localContentUriFetchSequence$delegate;
    private final Lazy localFileFetchEncodedImageProducerSequence$delegate;
    private final Lazy localFileFetchToEncodedMemoryPrefetchSequence$delegate;
    private final Lazy localImageFileFetchSequence$delegate;
    private final Lazy localResourceFetchSequence$delegate;
    private final Lazy localThumbnailBitmapSdk29FetchSequence$delegate;
    private final Lazy localVideoFileFetchSequence$delegate;
    private final Lazy networkFetchEncodedImageProducerSequence$delegate;
    private final Lazy networkFetchSequence$delegate;
    private final Lazy networkFetchToEncodedMemoryPrefetchSequence$delegate;
    private final NetworkFetcher<?> networkFetcher;
    private final boolean partialImageCachingEnabled;
    private Map<Producer<CloseableReference<CloseableImage>>, Producer<CloseableReference<CloseableImage>>> postprocessorSequences;
    private final ProducerFactory producerFactory;
    private final Lazy qualifiedResourceFetchSequence$delegate;
    private final boolean resizeAndRotateEnabledForNetwork;
    private final ThreadHandoffProducerQueue threadHandoffProducerQueue;
    private final boolean useBitmapPrepareToDraw;
    private final boolean webpSupportEnabled;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007fјnjG0L͜P.hS2şqڛ5:ӋTqq:\u0016\u001f\u0004\"\u07beSNug7Xh\f[\u000f4\u0018)n:Lmx\f\u0016U2\u000b}M8eok?\u0011xD\f82P@@\u0005и\u001e3"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/BYG\u000bDw\u0015>KCHY4*%hj7\u0007D(L\u00061T`\r\nfZ}9\u001d\u0016d\u0017$", "", "u(E", "5dc [6Kb\u0019\bz]\u001c\n\r\u001dt\r,\u0005B", "", "CqX", "\u001a`]1e6BRb\bzmul\u00163;", "D`[6W(MSx\bxh+|\b\u0013m{*{-\u0001#'G}\u001d", "", "7lP4X\u0019>_)~\tm", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u0004%Ai}.F7y6IE;X4*%hoH\\", "7lP4X7B^\u0019\u0006~g,v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getShortenedUriString(Uri uri) {
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
            if (string.length() <= 30) {
                return string;
            }
            String strSubstring = string.substring(0, 30);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring + "...";
        }

        public final void validateEncodedImageRequest(ImageRequest imageRequest) {
            Preconditions.checkArgument(Boolean.valueOf(imageRequest.getLowestPermittedRequestLevel().getValue() <= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.getValue()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProducerSequenceFactory(ContentResolver contentResolver, ProducerFactory producerFactory, NetworkFetcher<?> networkFetcher, boolean z2, boolean z3, ThreadHandoffProducerQueue threadHandoffProducerQueue, DownsampleMode downsampleMode, boolean z4, boolean z5, boolean z6, ImageTranscoderFactory imageTranscoderFactory, boolean z7, boolean z8, boolean z9, Set<? extends CustomProducerSequenceFactory> set) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(producerFactory, "producerFactory");
        Intrinsics.checkNotNullParameter(networkFetcher, "networkFetcher");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
        Intrinsics.checkNotNullParameter(imageTranscoderFactory, "imageTranscoderFactory");
        this.contentResolver = contentResolver;
        this.producerFactory = producerFactory;
        this.networkFetcher = networkFetcher;
        this.resizeAndRotateEnabledForNetwork = z2;
        this.webpSupportEnabled = z3;
        this.threadHandoffProducerQueue = threadHandoffProducerQueue;
        this.downsampleMode = downsampleMode;
        this.useBitmapPrepareToDraw = z4;
        this.partialImageCachingEnabled = z5;
        this.diskCacheEnabled = z6;
        this.imageTranscoderFactory = imageTranscoderFactory;
        this.isEncodedMemoryCacheProbingEnabled = z7;
        this.isDiskCacheProbingEnabled = z8;
        this.allowDelay = z9;
        this.customProducerSequenceFactories = set;
        this.postprocessorSequences = new LinkedHashMap();
        this.closeableImagePrefetchSequences = new LinkedHashMap();
        this.bitmapPrepareSequences = new LinkedHashMap();
        this.networkFetchEncodedImageProducerSequence$delegate = LazyKt.lazy(new Function0<RemoveImageTransformMetaDataProducer>() { // from class: com.facebook.imagepipeline.core.ProducerSequenceFactory$networkFetchEncodedImageProducerSequence$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final RemoveImageTransformMetaDataProducer invoke() {
                FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
                ProducerSequenceFactory producerSequenceFactory = this.this$0;
                if (!FrescoSystrace.isTracing()) {
                    return new RemoveImageTransformMetaDataProducer(producerSequenceFactory.getBackgroundNetworkFetchToEncodedMemorySequence());
                }
                FrescoSystrace.beginSection("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init");
                try {
                    return new RemoveImageTransformMetaDataProducer(producerSequenceFactory.getBackgroundNetworkFetchToEncodedMemorySequence());
                } finally {
                    FrescoSystrace.endSection();
                }
            }
        });
        this.localFileFetchEncodedImageProducerSequence$delegate = LazyKt.lazy(new Function0<RemoveImageTransformMetaDataProducer>() { // from class: com.facebook.imagepipeline.core.ProducerSequenceFactory$localFileFetchEncodedImageProducerSequence$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final RemoveImageTransformMetaDataProducer invoke() {
                FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
                ProducerSequenceFactory producerSequenceFactory = this.this$0;
                if (!FrescoSystrace.isTracing()) {
                    return new RemoveImageTransformMetaDataProducer(producerSequenceFactory.getBackgroundLocalFileFetchToEncodeMemorySequence());
                }
                FrescoSystrace.beginSection("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init");
                try {
                    return new RemoveImageTransformMetaDataProducer(producerSequenceFactory.getBackgroundLocalFileFetchToEncodeMemorySequence());
                } finally {
                    FrescoSystrace.endSection();
                }
            }
        });
        this.localContentUriFetchEncodedImageProducerSequence$delegate = LazyKt.lazy(new Function0<RemoveImageTransformMetaDataProducer>() { // from class: com.facebook.imagepipeline.core.ProducerSequenceFactory$localContentUriFetchEncodedImageProducerSequence$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final RemoveImageTransformMetaDataProducer invoke() {
                FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
                ProducerSequenceFactory producerSequenceFactory = this.this$0;
                if (!FrescoSystrace.isTracing()) {
                    return new RemoveImageTransformMetaDataProducer(producerSequenceFactory.getBackgroundLocalContentUriFetchToEncodeMemorySequence());
                }
                FrescoSystrace.beginSection("ProducerSequenceFactory#getLocalContentUriFetchEncodedImageProducerSequence:init");
                try {
                    return new RemoveImageTransformMetaDataProducer(producerSequenceFactory.getBackgroundLocalContentUriFetchToEncodeMemorySequence());
                } finally {
                    FrescoSystrace.endSection();
                }
            }
        });
        this.networkFetchSequence$delegate = LazyKt.lazy(new Function0<Producer<CloseableReference<CloseableImage>>>() { // from class: com.facebook.imagepipeline.core.ProducerSequenceFactory$networkFetchSequence$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Producer<CloseableReference<CloseableImage>> invoke() {
                FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
                ProducerSequenceFactory producerSequenceFactory = this.this$0;
                if (!FrescoSystrace.isTracing()) {
                    return producerSequenceFactory.newBitmapCacheGetToDecodeSequence(producerSequenceFactory.getCommonNetworkFetchToEncodedMemorySequence());
                }
                FrescoSystrace.beginSection("ProducerSequenceFactory#getNetworkFetchSequence:init");
                try {
                    return producerSequenceFactory.newBitmapCacheGetToDecodeSequence(producerSequenceFactory.getCommonNetworkFetchToEncodedMemorySequence());
                } finally {
                    FrescoSystrace.endSection();
                }
            }
        });
        this.backgroundNetworkFetchToEncodedMemorySequence$delegate = LazyKt.lazy(new Function0<Producer<EncodedImage>>() { // from class: com.facebook.imagepipeline.core.ProducerSequenceFactory$backgroundNetworkFetchToEncodedMemorySequence$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Producer<EncodedImage> invoke() {
                FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
                ProducerSequenceFactory producerSequenceFactory = this.this$0;
                if (!FrescoSystrace.isTracing()) {
                    return producerSequenceFactory.producerFactory.newBackgroundThreadHandoffProducer(producerSequenceFactory.getCommonNetworkFetchToEncodedMemorySequence(), producerSequenceFactory.threadHandoffProducerQueue);
                }
                FrescoSystrace.beginSection("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
                try {
                    return producerSequenceFactory.producerFactory.newBackgroundThreadHandoffProducer(producerSequenceFactory.getCommonNetworkFetchToEncodedMemorySequence(), producerSequenceFactory.threadHandoffProducerQueue);
                } finally {
                    FrescoSystrace.endSection();
                }
            }
        });
        this.networkFetchToEncodedMemoryPrefetchSequence$delegate = LazyKt.lazy(new Function0<SwallowResultProducer<EncodedImage>>() { // from class: com.facebook.imagepipeline.core.ProducerSequenceFactory$networkFetchToEncodedMemoryPrefetchSequence$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SwallowResultProducer<EncodedImage> invoke() {
                FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
                ProducerSequenceFactory producerSequenceFactory = this.this$0;
                if (!FrescoSystrace.isTracing()) {
                    return producerSequenceFactory.producerFactory.newSwallowResultProducer(producerSequenceFactory.getBackgroundNetworkFetchToEncodedMemorySequence());
                }
                FrescoSystrace.beginSection("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
                try {
                    return producerSequenceFactory.producerFactory.newSwallowResultProducer(producerSequenceFactory.getBackgroundNetworkFetchToEncodedMemorySequence());
                } finally {
                    FrescoSystrace.endSection();
                }
            }
        });
        this.commonNetworkFetchToEncodedMemorySequence$delegate = LazyKt.lazy(new Function0<Producer<EncodedImage>>() { // from class: com.facebook.imagepipeline.core.ProducerSequenceFactory$commonNetworkFetchToEncodedMemorySequence$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Producer<EncodedImage> invoke() {
                FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
                ProducerSequenceFactory producerSequenceFactory = this.this$0;
                if (!FrescoSystrace.isTracing()) {
                    return producerSequenceFactory.newCommonNetworkFetchToEncodedMemorySequence(producerSequenceFactory.networkFetcher);
                }
                FrescoSystrace.beginSection("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
                try {
                    return producerSequenceFactory.newCommonNetworkFetchToEncodedMemorySequence(producerSequenceFactory.networkFetcher);
                } finally {
                    FrescoSystrace.endSection();
                }
            }
        });
        this.localFileFetchToEncodedMemoryPrefetchSequence$delegate = LazyKt.lazy(new Function0<SwallowResultProducer<EncodedImage>>() { // from class: com.facebook.imagepipeline.core.ProducerSequenceFactory$localFileFetchToEncodedMemoryPrefetchSequence$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SwallowResultProducer<EncodedImage> invoke() {
                FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
                ProducerSequenceFactory producerSequenceFactory = this.this$0;
                if (!FrescoSystrace.isTracing()) {
                    return producerSequenceFactory.producerFactory.newSwallowResultProducer(producerSequenceFactory.getBackgroundLocalFileFetchToEncodeMemorySequence());
                }
                FrescoSystrace.beginSection("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
                try {
                    return producerSequenceFactory.producerFactory.newSwallowResultProducer(producerSequenceFactory.getBackgroundLocalFileFetchToEncodeMemorySequence());
                } finally {
                    FrescoSystrace.endSection();
                }
            }
        });
        this.backgroundLocalFileFetchToEncodeMemorySequence$delegate = LazyKt.lazy(new Function0<Producer<EncodedImage>>() { // from class: com.facebook.imagepipeline.core.ProducerSequenceFactory$backgroundLocalFileFetchToEncodeMemorySequence$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Producer<EncodedImage> invoke() {
                FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
                ProducerSequenceFactory producerSequenceFactory = this.this$0;
                if (!FrescoSystrace.isTracing()) {
                    LocalFileFetchProducer localFileFetchProducerNewLocalFileFetchProducer = producerSequenceFactory.producerFactory.newLocalFileFetchProducer();
                    Intrinsics.checkNotNullExpressionValue(localFileFetchProducerNewLocalFileFetchProducer, "producerFactory.newLocalFileFetchProducer()");
                    return producerSequenceFactory.producerFactory.newBackgroundThreadHandoffProducer(producerSequenceFactory.newEncodedCacheMultiplexToTranscodeSequence(localFileFetchProducerNewLocalFileFetchProducer), producerSequenceFactory.threadHandoffProducerQueue);
                }
                FrescoSystrace.beginSection("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
                try {
                    LocalFileFetchProducer localFileFetchProducerNewLocalFileFetchProducer2 = producerSequenceFactory.producerFactory.newLocalFileFetchProducer();
                    Intrinsics.checkNotNullExpressionValue(localFileFetchProducerNewLocalFileFetchProducer2, "producerFactory.newLocalFileFetchProducer()");
                    return producerSequenceFactory.producerFactory.newBackgroundThreadHandoffProducer(producerSequenceFactory.newEncodedCacheMultiplexToTranscodeSequence(localFileFetchProducerNewLocalFileFetchProducer2), producerSequenceFactory.threadHandoffProducerQueue);
                } finally {
                    FrescoSystrace.endSection();
                }
            }
        });
        this.backgroundLocalContentUriFetchToEncodeMemorySequence$delegate = LazyKt.lazy(new Function0<Producer<EncodedImage>>() { // from class: com.facebook.imagepipeline.core.ProducerSequenceFactory$backgroundLocalContentUriFetchToEncodeMemorySequence$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Producer<EncodedImage> invoke() {
                FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
                ProducerSequenceFactory producerSequenceFactory = this.this$0;
                if (!FrescoSystrace.isTracing()) {
                    LocalContentUriFetchProducer localContentUriFetchProducerNewLocalContentUriFetchProducer = producerSequenceFactory.producerFactory.newLocalContentUriFetchProducer();
                    Intrinsics.checkNotNullExpressionValue(localContentUriFetchProducerNewLocalContentUriFetchProducer, "producerFactory.newLocalContentUriFetchProducer()");
                    return producerSequenceFactory.producerFactory.newBackgroundThreadHandoffProducer(producerSequenceFactory.newEncodedCacheMultiplexToTranscodeSequence(localContentUriFetchProducerNewLocalContentUriFetchProducer), producerSequenceFactory.threadHandoffProducerQueue);
                }
                FrescoSystrace.beginSection("ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence:init");
                try {
                    LocalContentUriFetchProducer localContentUriFetchProducerNewLocalContentUriFetchProducer2 = producerSequenceFactory.producerFactory.newLocalContentUriFetchProducer();
                    Intrinsics.checkNotNullExpressionValue(localContentUriFetchProducerNewLocalContentUriFetchProducer2, "producerFactory.newLocalContentUriFetchProducer()");
                    return producerSequenceFactory.producerFactory.newBackgroundThreadHandoffProducer(producerSequenceFactory.newEncodedCacheMultiplexToTranscodeSequence(localContentUriFetchProducerNewLocalContentUriFetchProducer2), producerSequenceFactory.threadHandoffProducerQueue);
                } finally {
                    FrescoSystrace.endSection();
                }
            }
        });
        this.localImageFileFetchSequence$delegate = LazyKt.lazy(new Function0<Producer<CloseableReference<CloseableImage>>>() { // from class: com.facebook.imagepipeline.core.ProducerSequenceFactory$localImageFileFetchSequence$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Producer<CloseableReference<CloseableImage>> invoke() {
                LocalFileFetchProducer localFileFetchProducerNewLocalFileFetchProducer = this.this$0.producerFactory.newLocalFileFetchProducer();
                Intrinsics.checkNotNullExpressionValue(localFileFetchProducerNewLocalFileFetchProducer, "producerFactory.newLocalFileFetchProducer()");
                return this.this$0.newBitmapCacheGetToLocalTransformSequence(localFileFetchProducerNewLocalFileFetchProducer);
            }
        });
        this.localVideoFileFetchSequence$delegate = LazyKt.lazy(new Function0<Producer<CloseableReference<CloseableImage>>>() { // from class: com.facebook.imagepipeline.core.ProducerSequenceFactory$localVideoFileFetchSequence$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Producer<CloseableReference<CloseableImage>> invoke() {
                LocalVideoThumbnailProducer localVideoThumbnailProducerNewLocalVideoThumbnailProducer = this.this$0.producerFactory.newLocalVideoThumbnailProducer();
                Intrinsics.checkNotNullExpressionValue(localVideoThumbnailProducerNewLocalVideoThumbnailProducer, "producerFactory.newLocalVideoThumbnailProducer()");
                return this.this$0.newBitmapCacheGetToBitmapCacheSequence(localVideoThumbnailProducerNewLocalVideoThumbnailProducer);
            }
        });
        this.localContentUriFetchSequence$delegate = LazyKt.lazy(new Function0<Producer<CloseableReference<CloseableImage>>>() { // from class: com.facebook.imagepipeline.core.ProducerSequenceFactory$localContentUriFetchSequence$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Producer<CloseableReference<CloseableImage>> invoke() {
                LocalContentUriFetchProducer localContentUriFetchProducerNewLocalContentUriFetchProducer = this.this$0.producerFactory.newLocalContentUriFetchProducer();
                Intrinsics.checkNotNullExpressionValue(localContentUriFetchProducerNewLocalContentUriFetchProducer, "producerFactory.newLocalContentUriFetchProducer()");
                LocalContentUriThumbnailFetchProducer localContentUriThumbnailFetchProducerNewLocalContentUriThumbnailFetchProducer = this.this$0.producerFactory.newLocalContentUriThumbnailFetchProducer();
                Intrinsics.checkNotNullExpressionValue(localContentUriThumbnailFetchProducerNewLocalContentUriThumbnailFetchProducer, "producerFactory.newLocal…iThumbnailFetchProducer()");
                LocalExifThumbnailProducer localExifThumbnailProducerNewLocalExifThumbnailProducer = this.this$0.producerFactory.newLocalExifThumbnailProducer();
                Intrinsics.checkNotNullExpressionValue(localExifThumbnailProducerNewLocalExifThumbnailProducer, "producerFactory.newLocalExifThumbnailProducer()");
                return this.this$0.newBitmapCacheGetToLocalTransformSequence(localContentUriFetchProducerNewLocalContentUriFetchProducer, new ThumbnailProducer[]{localContentUriThumbnailFetchProducerNewLocalContentUriThumbnailFetchProducer, localExifThumbnailProducerNewLocalExifThumbnailProducer});
            }
        });
        this.localThumbnailBitmapSdk29FetchSequence$delegate = LazyKt.lazy(new Function0<Producer<CloseableReference<CloseableImage>>>() { // from class: com.facebook.imagepipeline.core.ProducerSequenceFactory$localThumbnailBitmapSdk29FetchSequence$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Producer<CloseableReference<CloseableImage>> invoke() throws Throwable {
                if (Build.VERSION.SDK_INT < 29) {
                    throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                }
                ProducerSequenceFactory producerSequenceFactory = this.this$0;
                LocalThumbnailBitmapSdk29Producer localThumbnailBitmapSdk29ProducerNewLocalThumbnailBitmapSdk29Producer = producerSequenceFactory.producerFactory.newLocalThumbnailBitmapSdk29Producer();
                Intrinsics.checkNotNullExpressionValue(localThumbnailBitmapSdk29ProducerNewLocalThumbnailBitmapSdk29Producer, "producerFactory.newLocal…nailBitmapSdk29Producer()");
                return producerSequenceFactory.newBitmapCacheGetToBitmapCacheSequence(localThumbnailBitmapSdk29ProducerNewLocalThumbnailBitmapSdk29Producer);
            }
        });
        this.qualifiedResourceFetchSequence$delegate = LazyKt.lazy(new Function0<Producer<CloseableReference<CloseableImage>>>() { // from class: com.facebook.imagepipeline.core.ProducerSequenceFactory$qualifiedResourceFetchSequence$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Producer<CloseableReference<CloseableImage>> invoke() {
                QualifiedResourceFetchProducer qualifiedResourceFetchProducerNewQualifiedResourceFetchProducer = this.this$0.producerFactory.newQualifiedResourceFetchProducer();
                Intrinsics.checkNotNullExpressionValue(qualifiedResourceFetchProducerNewQualifiedResourceFetchProducer, "producerFactory.newQuali…edResourceFetchProducer()");
                return this.this$0.newBitmapCacheGetToLocalTransformSequence(qualifiedResourceFetchProducerNewQualifiedResourceFetchProducer);
            }
        });
        this.localResourceFetchSequence$delegate = LazyKt.lazy(new Function0<Producer<CloseableReference<CloseableImage>>>() { // from class: com.facebook.imagepipeline.core.ProducerSequenceFactory$localResourceFetchSequence$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Producer<CloseableReference<CloseableImage>> invoke() {
                LocalResourceFetchProducer localResourceFetchProducerNewLocalResourceFetchProducer = this.this$0.producerFactory.newLocalResourceFetchProducer();
                Intrinsics.checkNotNullExpressionValue(localResourceFetchProducerNewLocalResourceFetchProducer, "producerFactory.newLocalResourceFetchProducer()");
                return this.this$0.newBitmapCacheGetToLocalTransformSequence(localResourceFetchProducerNewLocalResourceFetchProducer);
            }
        });
        this.localAssetFetchSequence$delegate = LazyKt.lazy(new Function0<Producer<CloseableReference<CloseableImage>>>() { // from class: com.facebook.imagepipeline.core.ProducerSequenceFactory$localAssetFetchSequence$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Producer<CloseableReference<CloseableImage>> invoke() {
                LocalAssetFetchProducer localAssetFetchProducerNewLocalAssetFetchProducer = this.this$0.producerFactory.newLocalAssetFetchProducer();
                Intrinsics.checkNotNullExpressionValue(localAssetFetchProducerNewLocalAssetFetchProducer, "producerFactory.newLocalAssetFetchProducer()");
                return this.this$0.newBitmapCacheGetToLocalTransformSequence(localAssetFetchProducerNewLocalAssetFetchProducer);
            }
        });
        this.dataFetchSequence$delegate = LazyKt.lazy(new Function0<Producer<CloseableReference<CloseableImage>>>() { // from class: com.facebook.imagepipeline.core.ProducerSequenceFactory$dataFetchSequence$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Producer<CloseableReference<CloseableImage>> invoke() {
                DataFetchProducer dataFetchProducerNewDataFetchProducer = this.this$0.producerFactory.newDataFetchProducer();
                Intrinsics.checkNotNullExpressionValue(dataFetchProducerNewDataFetchProducer, "producerFactory.newDataFetchProducer()");
                AddImageTransformMetaDataProducer addImageTransformMetaDataProducerNewAddImageTransformMetaDataProducer = ProducerFactory.newAddImageTransformMetaDataProducer(dataFetchProducerNewDataFetchProducer);
                Intrinsics.checkNotNullExpressionValue(addImageTransformMetaDataProducerNewAddImageTransformMetaDataProducer, "newAddImageTransformMeta…taProducer(inputProducer)");
                ResizeAndRotateProducer resizeAndRotateProducerNewResizeAndRotateProducer = this.this$0.producerFactory.newResizeAndRotateProducer(addImageTransformMetaDataProducerNewAddImageTransformMetaDataProducer, true, this.this$0.imageTranscoderFactory);
                Intrinsics.checkNotNullExpressionValue(resizeAndRotateProducerNewResizeAndRotateProducer, "producerFactory.newResiz…, imageTranscoderFactory)");
                return this.this$0.newBitmapCacheGetToDecodeSequence(resizeAndRotateProducerNewResizeAndRotateProducer);
            }
        });
    }

    private final Producer<CloseableReference<CloseableImage>> getBasicDecodedImageSequence(ImageRequest imageRequest) {
        Producer<CloseableReference<CloseableImage>> networkFetchSequence;
        FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
        if (!FrescoSystrace.isTracing()) {
            Uri sourceUri = imageRequest.getSourceUri();
            Intrinsics.checkNotNullExpressionValue(sourceUri, "imageRequest.sourceUri");
            if (sourceUri == null) {
                throw new IllegalStateException("Uri is null.".toString());
            }
            int sourceUriType = imageRequest.getSourceUriType();
            if (sourceUriType == 0) {
                return getNetworkFetchSequence();
            }
            switch (sourceUriType) {
                case 2:
                    return imageRequest.getLoadThumbnailOnlyForAndroidSdkAboveQ() ? getLocalThumbnailBitmapSdk29FetchSequence() : getLocalVideoFileFetchSequence();
                case 3:
                    return imageRequest.getLoadThumbnailOnlyForAndroidSdkAboveQ() ? getLocalThumbnailBitmapSdk29FetchSequence() : getLocalImageFileFetchSequence();
                case 4:
                    return imageRequest.getLoadThumbnailOnlyForAndroidSdkAboveQ() ? getLocalThumbnailBitmapSdk29FetchSequence() : MediaUtils.isVideo(this.contentResolver.getType(sourceUri)) ? getLocalVideoFileFetchSequence() : getLocalContentUriFetchSequence();
                case 5:
                    return getLocalAssetFetchSequence();
                case 6:
                    return getLocalResourceFetchSequence();
                case 7:
                    return getDataFetchSequence();
                case 8:
                    return getQualifiedResourceFetchSequence();
                default:
                    Set<CustomProducerSequenceFactory> set = this.customProducerSequenceFactories;
                    if (set != null) {
                        Iterator<CustomProducerSequenceFactory> it = set.iterator();
                        while (it.hasNext()) {
                            Producer<CloseableReference<CloseableImage>> customDecodedImageSequence = it.next().getCustomDecodedImageSequence(imageRequest, this, this.producerFactory, this.threadHandoffProducerQueue, this.isEncodedMemoryCacheProbingEnabled, this.isDiskCacheProbingEnabled);
                            if (customDecodedImageSequence != null) {
                                return customDecodedImageSequence;
                            }
                        }
                    }
                    throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + Companion.getShortenedUriString(sourceUri));
            }
        }
        FrescoSystrace.beginSection("ProducerSequenceFactory#getBasicDecodedImageSequence");
        try {
            Uri sourceUri2 = imageRequest.getSourceUri();
            Intrinsics.checkNotNullExpressionValue(sourceUri2, "imageRequest.sourceUri");
            if (sourceUri2 == null) {
                throw new IllegalStateException("Uri is null.".toString());
            }
            int sourceUriType2 = imageRequest.getSourceUriType();
            if (sourceUriType2 != 0) {
                switch (sourceUriType2) {
                    case 2:
                        if (imageRequest.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
                            return getLocalThumbnailBitmapSdk29FetchSequence();
                        }
                        networkFetchSequence = getLocalVideoFileFetchSequence();
                        break;
                    case 3:
                        if (imageRequest.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
                            return getLocalThumbnailBitmapSdk29FetchSequence();
                        }
                        networkFetchSequence = getLocalImageFileFetchSequence();
                        break;
                    case 4:
                        if (imageRequest.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
                            return getLocalThumbnailBitmapSdk29FetchSequence();
                        }
                        if (MediaUtils.isVideo(this.contentResolver.getType(sourceUri2))) {
                            return getLocalVideoFileFetchSequence();
                        }
                        networkFetchSequence = getLocalContentUriFetchSequence();
                        break;
                    case 5:
                        networkFetchSequence = getLocalAssetFetchSequence();
                        break;
                    case 6:
                        networkFetchSequence = getLocalResourceFetchSequence();
                        break;
                    case 7:
                        networkFetchSequence = getDataFetchSequence();
                        break;
                    case 8:
                        networkFetchSequence = getQualifiedResourceFetchSequence();
                        break;
                    default:
                        Set<CustomProducerSequenceFactory> set2 = this.customProducerSequenceFactories;
                        if (set2 != null) {
                            Iterator<CustomProducerSequenceFactory> it2 = set2.iterator();
                            while (it2.hasNext()) {
                                Producer<CloseableReference<CloseableImage>> customDecodedImageSequence2 = it2.next().getCustomDecodedImageSequence(imageRequest, this, this.producerFactory, this.threadHandoffProducerQueue, this.isEncodedMemoryCacheProbingEnabled, this.isDiskCacheProbingEnabled);
                                if (customDecodedImageSequence2 != null) {
                                    return customDecodedImageSequence2;
                                }
                            }
                        }
                        throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + Companion.getShortenedUriString(sourceUri2));
                }
            } else {
                networkFetchSequence = getNetworkFetchSequence();
            }
            return networkFetchSequence;
        } finally {
            FrescoSystrace.endSection();
        }
    }

    private final synchronized Producer<CloseableReference<CloseableImage>> getBitmapPrepareSequence(Producer<CloseableReference<CloseableImage>> producer) {
        BitmapPrepareProducer bitmapPrepareProducerNewBitmapPrepareProducer;
        bitmapPrepareProducerNewBitmapPrepareProducer = this.bitmapPrepareSequences.get(producer);
        if (bitmapPrepareProducerNewBitmapPrepareProducer == null) {
            bitmapPrepareProducerNewBitmapPrepareProducer = this.producerFactory.newBitmapPrepareProducer(producer);
            this.bitmapPrepareSequences.put(producer, bitmapPrepareProducerNewBitmapPrepareProducer);
        }
        return bitmapPrepareProducerNewBitmapPrepareProducer;
    }

    public static /* synthetic */ void getBitmapPrepareSequences$annotations() {
    }

    public static /* synthetic */ void getCloseableImagePrefetchSequences$annotations() {
    }

    private final synchronized Producer<Void> getDecodedImagePrefetchSequence(Producer<CloseableReference<CloseableImage>> producer) {
        SwallowResultProducer swallowResultProducerNewSwallowResultProducer;
        swallowResultProducerNewSwallowResultProducer = this.closeableImagePrefetchSequences.get(producer);
        if (swallowResultProducerNewSwallowResultProducer == null) {
            swallowResultProducerNewSwallowResultProducer = this.producerFactory.newSwallowResultProducer(producer);
            this.closeableImagePrefetchSequences.put(producer, swallowResultProducerNewSwallowResultProducer);
        }
        return swallowResultProducerNewSwallowResultProducer;
    }

    private final synchronized Producer<CloseableReference<CloseableImage>> getDelaySequence(Producer<CloseableReference<CloseableImage>> producer) {
        DelayProducer delayProducerNewDelayProducer;
        delayProducerNewDelayProducer = this.producerFactory.newDelayProducer(producer);
        Intrinsics.checkNotNullExpressionValue(delayProducerNewDelayProducer, "producerFactory.newDelayProducer(inputProducer)");
        return delayProducerNewDelayProducer;
    }

    public static /* synthetic */ void getLocalFileFetchEncodedImageProducerSequence$annotations() {
    }

    private final synchronized Producer<CloseableReference<CloseableImage>> getPostprocessorSequence(Producer<CloseableReference<CloseableImage>> producer) {
        PostprocessedBitmapMemoryCacheProducer postprocessedBitmapMemoryCacheProducerNewPostprocessorBitmapMemoryCacheProducer;
        postprocessedBitmapMemoryCacheProducerNewPostprocessorBitmapMemoryCacheProducer = this.postprocessorSequences.get(producer);
        if (postprocessedBitmapMemoryCacheProducerNewPostprocessorBitmapMemoryCacheProducer == null) {
            PostprocessorProducer postprocessorProducerNewPostprocessorProducer = this.producerFactory.newPostprocessorProducer(producer);
            Intrinsics.checkNotNullExpressionValue(postprocessorProducerNewPostprocessorProducer, "producerFactory.newPostp…orProducer(inputProducer)");
            postprocessedBitmapMemoryCacheProducerNewPostprocessorBitmapMemoryCacheProducer = this.producerFactory.newPostprocessorBitmapMemoryCacheProducer(postprocessorProducerNewPostprocessorProducer);
            this.postprocessorSequences.put(producer, postprocessedBitmapMemoryCacheProducerNewPostprocessorBitmapMemoryCacheProducer);
        }
        return postprocessedBitmapMemoryCacheProducerNewPostprocessorBitmapMemoryCacheProducer;
    }

    public static /* synthetic */ void getPostprocessorSequences$annotations() {
    }

    public final Producer<CloseableReference<CloseableImage>> newBitmapCacheGetToBitmapCacheSequence(Producer<CloseableReference<CloseableImage>> producer) {
        BitmapMemoryCacheProducer bitmapMemoryCacheProducerNewBitmapMemoryCacheProducer = this.producerFactory.newBitmapMemoryCacheProducer(producer);
        Intrinsics.checkNotNullExpressionValue(bitmapMemoryCacheProducerNewBitmapMemoryCacheProducer, "producerFactory.newBitma…heProducer(inputProducer)");
        BitmapMemoryCacheKeyMultiplexProducer bitmapMemoryCacheKeyMultiplexProducerNewBitmapMemoryCacheKeyMultiplexProducer = this.producerFactory.newBitmapMemoryCacheKeyMultiplexProducer(bitmapMemoryCacheProducerNewBitmapMemoryCacheProducer);
        Intrinsics.checkNotNullExpressionValue(bitmapMemoryCacheKeyMultiplexProducerNewBitmapMemoryCacheKeyMultiplexProducer, "producerFactory.newBitma…itmapMemoryCacheProducer)");
        Producer<CloseableReference<CloseableImage>> producerNewBackgroundThreadHandoffProducer = this.producerFactory.newBackgroundThreadHandoffProducer(bitmapMemoryCacheKeyMultiplexProducerNewBitmapMemoryCacheKeyMultiplexProducer, this.threadHandoffProducerQueue);
        Intrinsics.checkNotNullExpressionValue(producerNewBackgroundThreadHandoffProducer, "producerFactory.newBackg…readHandoffProducerQueue)");
        if (!this.isEncodedMemoryCacheProbingEnabled && !this.isDiskCacheProbingEnabled) {
            BitmapMemoryCacheGetProducer bitmapMemoryCacheGetProducerNewBitmapMemoryCacheGetProducer = this.producerFactory.newBitmapMemoryCacheGetProducer(producerNewBackgroundThreadHandoffProducer);
            Intrinsics.checkNotNullExpressionValue(bitmapMemoryCacheGetProducerNewBitmapMemoryCacheGetProducer, "producerFactory.newBitma…er(threadHandoffProducer)");
            return bitmapMemoryCacheGetProducerNewBitmapMemoryCacheGetProducer;
        }
        BitmapMemoryCacheGetProducer bitmapMemoryCacheGetProducerNewBitmapMemoryCacheGetProducer2 = this.producerFactory.newBitmapMemoryCacheGetProducer(producerNewBackgroundThreadHandoffProducer);
        Intrinsics.checkNotNullExpressionValue(bitmapMemoryCacheGetProducerNewBitmapMemoryCacheGetProducer2, "producerFactory.newBitma…er(threadHandoffProducer)");
        BitmapProbeProducer bitmapProbeProducerNewBitmapProbeProducer = this.producerFactory.newBitmapProbeProducer(bitmapMemoryCacheGetProducerNewBitmapMemoryCacheGetProducer2);
        Intrinsics.checkNotNullExpressionValue(bitmapProbeProducerNewBitmapProbeProducer, "producerFactory.newBitma…apMemoryCacheGetProducer)");
        return bitmapProbeProducerNewBitmapProbeProducer;
    }

    public final Producer<CloseableReference<CloseableImage>> newBitmapCacheGetToLocalTransformSequence(Producer<EncodedImage> producer) {
        LocalExifThumbnailProducer localExifThumbnailProducerNewLocalExifThumbnailProducer = this.producerFactory.newLocalExifThumbnailProducer();
        Intrinsics.checkNotNullExpressionValue(localExifThumbnailProducerNewLocalExifThumbnailProducer, "producerFactory.newLocalExifThumbnailProducer()");
        return newBitmapCacheGetToLocalTransformSequence(producer, new ThumbnailProducer[]{localExifThumbnailProducerNewLocalExifThumbnailProducer});
    }

    public final Producer<CloseableReference<CloseableImage>> newBitmapCacheGetToLocalTransformSequence(Producer<EncodedImage> producer, ThumbnailProducer<EncodedImage>[] thumbnailProducerArr) {
        return newBitmapCacheGetToDecodeSequence(newLocalTransformationsSequence(newEncodedCacheMultiplexToTranscodeSequence(producer), thumbnailProducerArr));
    }

    private final Producer<EncodedImage> newDiskCacheSequence(Producer<EncodedImage> producer) {
        DiskCacheWriteProducer diskCacheWriteProducerNewDiskCacheWriteProducer;
        DiskCacheWriteProducer diskCacheWriteProducerNewDiskCacheWriteProducer2;
        FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
        if (!FrescoSystrace.isTracing()) {
            if (this.partialImageCachingEnabled) {
                PartialDiskCacheProducer partialDiskCacheProducerNewPartialDiskCacheProducer = this.producerFactory.newPartialDiskCacheProducer(producer);
                Intrinsics.checkNotNullExpressionValue(partialDiskCacheProducerNewPartialDiskCacheProducer, "producerFactory.newParti…heProducer(inputProducer)");
                diskCacheWriteProducerNewDiskCacheWriteProducer2 = this.producerFactory.newDiskCacheWriteProducer(partialDiskCacheProducerNewPartialDiskCacheProducer);
            } else {
                diskCacheWriteProducerNewDiskCacheWriteProducer2 = this.producerFactory.newDiskCacheWriteProducer(producer);
            }
            Intrinsics.checkNotNullExpressionValue(diskCacheWriteProducerNewDiskCacheWriteProducer2, "if (partialImageCachingE…utProducer)\n            }");
            DiskCacheReadProducer diskCacheReadProducerNewDiskCacheReadProducer = this.producerFactory.newDiskCacheReadProducer(diskCacheWriteProducerNewDiskCacheWriteProducer2);
            Intrinsics.checkNotNullExpressionValue(diskCacheReadProducerNewDiskCacheReadProducer, "producerFactory.newDiskC…ducer(cacheWriteProducer)");
            return diskCacheReadProducerNewDiskCacheReadProducer;
        }
        FrescoSystrace.beginSection("ProducerSequenceFactory#newDiskCacheSequence");
        try {
            if (this.partialImageCachingEnabled) {
                PartialDiskCacheProducer partialDiskCacheProducerNewPartialDiskCacheProducer2 = this.producerFactory.newPartialDiskCacheProducer(producer);
                Intrinsics.checkNotNullExpressionValue(partialDiskCacheProducerNewPartialDiskCacheProducer2, "producerFactory.newParti…heProducer(inputProducer)");
                diskCacheWriteProducerNewDiskCacheWriteProducer = this.producerFactory.newDiskCacheWriteProducer(partialDiskCacheProducerNewPartialDiskCacheProducer2);
            } else {
                diskCacheWriteProducerNewDiskCacheWriteProducer = this.producerFactory.newDiskCacheWriteProducer(producer);
            }
            Intrinsics.checkNotNullExpressionValue(diskCacheWriteProducerNewDiskCacheWriteProducer, "if (partialImageCachingE…utProducer)\n            }");
            DiskCacheReadProducer diskCacheReadProducerNewDiskCacheReadProducer2 = this.producerFactory.newDiskCacheReadProducer(diskCacheWriteProducerNewDiskCacheWriteProducer);
            Intrinsics.checkNotNullExpressionValue(diskCacheReadProducerNewDiskCacheReadProducer2, "producerFactory.newDiskC…ducer(cacheWriteProducer)");
            return diskCacheReadProducerNewDiskCacheReadProducer2;
        } finally {
            FrescoSystrace.endSection();
        }
    }

    public final Producer<EncodedImage> newEncodedCacheMultiplexToTranscodeSequence(Producer<EncodedImage> producer) {
        if (this.diskCacheEnabled) {
            producer = newDiskCacheSequence(producer);
        }
        Producer<EncodedImage> producerNewEncodedMemoryCacheProducer = this.producerFactory.newEncodedMemoryCacheProducer(producer);
        Intrinsics.checkNotNullExpressionValue(producerNewEncodedMemoryCacheProducer, "producerFactory.newEncodedMemoryCacheProducer(ip)");
        if (!this.isDiskCacheProbingEnabled) {
            EncodedCacheKeyMultiplexProducer encodedCacheKeyMultiplexProducerNewEncodedCacheKeyMultiplexProducer = this.producerFactory.newEncodedCacheKeyMultiplexProducer(producerNewEncodedMemoryCacheProducer);
            Intrinsics.checkNotNullExpressionValue(encodedCacheKeyMultiplexProducerNewEncodedCacheKeyMultiplexProducer, "producerFactory.newEncod…codedMemoryCacheProducer)");
            return encodedCacheKeyMultiplexProducerNewEncodedCacheKeyMultiplexProducer;
        }
        EncodedProbeProducer encodedProbeProducerNewEncodedProbeProducer = this.producerFactory.newEncodedProbeProducer(producerNewEncodedMemoryCacheProducer);
        Intrinsics.checkNotNullExpressionValue(encodedProbeProducerNewEncodedProbeProducer, "producerFactory.newEncod…codedMemoryCacheProducer)");
        EncodedCacheKeyMultiplexProducer encodedCacheKeyMultiplexProducerNewEncodedCacheKeyMultiplexProducer2 = this.producerFactory.newEncodedCacheKeyMultiplexProducer(encodedProbeProducerNewEncodedProbeProducer);
        Intrinsics.checkNotNullExpressionValue(encodedCacheKeyMultiplexProducerNewEncodedCacheKeyMultiplexProducer2, "producerFactory.newEncod…exProducer(probeProducer)");
        return encodedCacheKeyMultiplexProducerNewEncodedCacheKeyMultiplexProducer2;
    }

    private final Producer<EncodedImage> newLocalThumbnailProducer(ThumbnailProducer<EncodedImage>[] thumbnailProducerArr) {
        ThumbnailBranchProducer thumbnailBranchProducerNewThumbnailBranchProducer = this.producerFactory.newThumbnailBranchProducer(thumbnailProducerArr);
        Intrinsics.checkNotNullExpressionValue(thumbnailBranchProducerNewThumbnailBranchProducer, "producerFactory.newThumb…ducer(thumbnailProducers)");
        ResizeAndRotateProducer resizeAndRotateProducerNewResizeAndRotateProducer = this.producerFactory.newResizeAndRotateProducer(thumbnailBranchProducerNewThumbnailBranchProducer, true, this.imageTranscoderFactory);
        Intrinsics.checkNotNullExpressionValue(resizeAndRotateProducerNewResizeAndRotateProducer, "producerFactory.newResiz…, imageTranscoderFactory)");
        return resizeAndRotateProducerNewResizeAndRotateProducer;
    }

    private final Producer<EncodedImage> newLocalTransformationsSequence(Producer<EncodedImage> producer, ThumbnailProducer<EncodedImage>[] thumbnailProducerArr) {
        AddImageTransformMetaDataProducer addImageTransformMetaDataProducerNewAddImageTransformMetaDataProducer = ProducerFactory.newAddImageTransformMetaDataProducer(producer);
        Intrinsics.checkNotNullExpressionValue(addImageTransformMetaDataProducerNewAddImageTransformMetaDataProducer, "newAddImageTransformMeta…taProducer(inputProducer)");
        ResizeAndRotateProducer resizeAndRotateProducerNewResizeAndRotateProducer = this.producerFactory.newResizeAndRotateProducer(addImageTransformMetaDataProducerNewAddImageTransformMetaDataProducer, true, this.imageTranscoderFactory);
        Intrinsics.checkNotNullExpressionValue(resizeAndRotateProducerNewResizeAndRotateProducer, "producerFactory.newResiz…, imageTranscoderFactory)");
        ThrottlingProducer throttlingProducerNewThrottlingProducer = this.producerFactory.newThrottlingProducer(resizeAndRotateProducerNewResizeAndRotateProducer);
        Intrinsics.checkNotNullExpressionValue(throttlingProducerNewThrottlingProducer, "producerFactory.newThrot…ducer(localImageProducer)");
        BranchOnSeparateImagesProducer branchOnSeparateImagesProducerNewBranchOnSeparateImagesProducer = ProducerFactory.newBranchOnSeparateImagesProducer(newLocalThumbnailProducer(thumbnailProducerArr), throttlingProducerNewThrottlingProducer);
        Intrinsics.checkNotNullExpressionValue(branchOnSeparateImagesProducerNewBranchOnSeparateImagesProducer, "newBranchOnSeparateImage…lImageThrottlingProducer)");
        return branchOnSeparateImagesProducerNewBranchOnSeparateImagesProducer;
    }

    public final Producer<EncodedImage> getBackgroundLocalContentUriFetchToEncodeMemorySequence() {
        Object value = this.backgroundLocalContentUriFetchToEncodeMemorySequence$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-backgroundLocalCont…ncodeMemorySequence>(...)");
        return (Producer) value;
    }

    public final Producer<EncodedImage> getBackgroundLocalFileFetchToEncodeMemorySequence() {
        Object value = this.backgroundLocalFileFetchToEncodeMemorySequence$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-backgroundLocalFile…ncodeMemorySequence>(...)");
        return (Producer) value;
    }

    public final Producer<EncodedImage> getBackgroundNetworkFetchToEncodedMemorySequence() {
        Object value = this.backgroundNetworkFetchToEncodedMemorySequence$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-backgroundNetworkFe…codedMemorySequence>(...)");
        return (Producer) value;
    }

    public final Map<Producer<CloseableReference<CloseableImage>>, Producer<CloseableReference<CloseableImage>>> getBitmapPrepareSequences() {
        return this.bitmapPrepareSequences;
    }

    public final Map<Producer<CloseableReference<CloseableImage>>, Producer<Void>> getCloseableImagePrefetchSequences() {
        return this.closeableImagePrefetchSequences;
    }

    public final Producer<EncodedImage> getCommonNetworkFetchToEncodedMemorySequence() {
        return (Producer) this.commonNetworkFetchToEncodedMemorySequence$delegate.getValue();
    }

    public final Producer<CloseableReference<CloseableImage>> getDataFetchSequence() {
        return (Producer) this.dataFetchSequence$delegate.getValue();
    }

    public final Producer<Void> getDecodedImagePrefetchProducerSequence(ImageRequest imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        Producer<CloseableReference<CloseableImage>> basicDecodedImageSequence = getBasicDecodedImageSequence(imageRequest);
        if (this.useBitmapPrepareToDraw) {
            basicDecodedImageSequence = getBitmapPrepareSequence(basicDecodedImageSequence);
        }
        return getDecodedImagePrefetchSequence(basicDecodedImageSequence);
    }

    public final Producer<CloseableReference<CloseableImage>> getDecodedImageProducerSequence(ImageRequest imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
        if (!FrescoSystrace.isTracing()) {
            Producer<CloseableReference<CloseableImage>> basicDecodedImageSequence = getBasicDecodedImageSequence(imageRequest);
            if (imageRequest.getPostprocessor() != null) {
                basicDecodedImageSequence = getPostprocessorSequence(basicDecodedImageSequence);
            }
            if (this.useBitmapPrepareToDraw) {
                basicDecodedImageSequence = getBitmapPrepareSequence(basicDecodedImageSequence);
            }
            return (!this.allowDelay || imageRequest.getDelayMs() <= 0) ? basicDecodedImageSequence : getDelaySequence(basicDecodedImageSequence);
        }
        FrescoSystrace.beginSection("ProducerSequenceFactory#getDecodedImageProducerSequence");
        try {
            Producer<CloseableReference<CloseableImage>> basicDecodedImageSequence2 = getBasicDecodedImageSequence(imageRequest);
            if (imageRequest.getPostprocessor() != null) {
                basicDecodedImageSequence2 = getPostprocessorSequence(basicDecodedImageSequence2);
            }
            if (this.useBitmapPrepareToDraw) {
                basicDecodedImageSequence2 = getBitmapPrepareSequence(basicDecodedImageSequence2);
            }
            if (this.allowDelay && imageRequest.getDelayMs() > 0) {
                basicDecodedImageSequence2 = getDelaySequence(basicDecodedImageSequence2);
            }
            return basicDecodedImageSequence2;
        } finally {
            FrescoSystrace.endSection();
        }
    }

    public final Producer<Void> getEncodedImagePrefetchProducerSequence(ImageRequest imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        Companion companion = Companion;
        companion.validateEncodedImageRequest(imageRequest);
        int sourceUriType = imageRequest.getSourceUriType();
        if (sourceUriType == 0) {
            return getNetworkFetchToEncodedMemoryPrefetchSequence();
        }
        if (sourceUriType == 2 || sourceUriType == 3) {
            return getLocalFileFetchToEncodedMemoryPrefetchSequence();
        }
        Uri sourceUri = imageRequest.getSourceUri();
        Intrinsics.checkNotNullExpressionValue(sourceUri, "imageRequest.sourceUri");
        throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + companion.getShortenedUriString(sourceUri));
    }

    public final Producer<CloseableReference<PooledByteBuffer>> getEncodedImageProducerSequence(ImageRequest imageRequest) {
        Producer<CloseableReference<PooledByteBuffer>> networkFetchEncodedImageProducerSequence;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
        if (!FrescoSystrace.isTracing()) {
            Companion.validateEncodedImageRequest(imageRequest);
            Uri sourceUri = imageRequest.getSourceUri();
            Intrinsics.checkNotNullExpressionValue(sourceUri, "imageRequest.sourceUri");
            int sourceUriType = imageRequest.getSourceUriType();
            if (sourceUriType == 0) {
                return getNetworkFetchEncodedImageProducerSequence();
            }
            if (sourceUriType == 2 || sourceUriType == 3) {
                return getLocalFileFetchEncodedImageProducerSequence();
            }
            if (sourceUriType == 4) {
                return getLocalContentUriFetchEncodedImageProducerSequence();
            }
            Set<CustomProducerSequenceFactory> set = this.customProducerSequenceFactories;
            if (set != null) {
                Iterator<CustomProducerSequenceFactory> it = set.iterator();
                while (it.hasNext()) {
                    Producer<CloseableReference<PooledByteBuffer>> customEncodedImageSequence = it.next().getCustomEncodedImageSequence(imageRequest, this, this.producerFactory, this.threadHandoffProducerQueue);
                    if (customEncodedImageSequence != null) {
                        return customEncodedImageSequence;
                    }
                }
            }
            throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + Companion.getShortenedUriString(sourceUri));
        }
        FrescoSystrace.beginSection("ProducerSequenceFactory#getEncodedImageProducerSequence");
        try {
            Companion.validateEncodedImageRequest(imageRequest);
            Uri sourceUri2 = imageRequest.getSourceUri();
            Intrinsics.checkNotNullExpressionValue(sourceUri2, "imageRequest.sourceUri");
            int sourceUriType2 = imageRequest.getSourceUriType();
            if (sourceUriType2 == 0) {
                networkFetchEncodedImageProducerSequence = getNetworkFetchEncodedImageProducerSequence();
            } else if (sourceUriType2 == 2 || sourceUriType2 == 3) {
                networkFetchEncodedImageProducerSequence = getLocalFileFetchEncodedImageProducerSequence();
            } else {
                if (sourceUriType2 != 4) {
                    Set<CustomProducerSequenceFactory> set2 = this.customProducerSequenceFactories;
                    if (set2 != null) {
                        Iterator<CustomProducerSequenceFactory> it2 = set2.iterator();
                        while (it2.hasNext()) {
                            Producer<CloseableReference<PooledByteBuffer>> customEncodedImageSequence2 = it2.next().getCustomEncodedImageSequence(imageRequest, this, this.producerFactory, this.threadHandoffProducerQueue);
                            if (customEncodedImageSequence2 != null) {
                                return customEncodedImageSequence2;
                            }
                        }
                    }
                    throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + Companion.getShortenedUriString(sourceUri2));
                }
                networkFetchEncodedImageProducerSequence = getLocalContentUriFetchEncodedImageProducerSequence();
            }
            return networkFetchEncodedImageProducerSequence;
        } finally {
            FrescoSystrace.endSection();
        }
    }

    public final Producer<CloseableReference<CloseableImage>> getLocalAssetFetchSequence() {
        return (Producer) this.localAssetFetchSequence$delegate.getValue();
    }

    public final Producer<CloseableReference<PooledByteBuffer>> getLocalContentUriFetchEncodedImageProducerSequence() {
        return (Producer) this.localContentUriFetchEncodedImageProducerSequence$delegate.getValue();
    }

    public final Producer<CloseableReference<CloseableImage>> getLocalContentUriFetchSequence() {
        return (Producer) this.localContentUriFetchSequence$delegate.getValue();
    }

    public final Producer<CloseableReference<PooledByteBuffer>> getLocalFileFetchEncodedImageProducerSequence() {
        return (Producer) this.localFileFetchEncodedImageProducerSequence$delegate.getValue();
    }

    public final Producer<Void> getLocalFileFetchToEncodedMemoryPrefetchSequence() {
        Object value = this.localFileFetchToEncodedMemoryPrefetchSequence$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-localFileFetchToEnc…oryPrefetchSequence>(...)");
        return (Producer) value;
    }

    public final Producer<CloseableReference<CloseableImage>> getLocalImageFileFetchSequence() {
        return (Producer) this.localImageFileFetchSequence$delegate.getValue();
    }

    public final Producer<CloseableReference<CloseableImage>> getLocalResourceFetchSequence() {
        return (Producer) this.localResourceFetchSequence$delegate.getValue();
    }

    public final Producer<CloseableReference<CloseableImage>> getLocalThumbnailBitmapSdk29FetchSequence() {
        return (Producer) this.localThumbnailBitmapSdk29FetchSequence$delegate.getValue();
    }

    public final Producer<CloseableReference<CloseableImage>> getLocalVideoFileFetchSequence() {
        return (Producer) this.localVideoFileFetchSequence$delegate.getValue();
    }

    public final Producer<CloseableReference<PooledByteBuffer>> getNetworkFetchEncodedImageProducerSequence() {
        return (Producer) this.networkFetchEncodedImageProducerSequence$delegate.getValue();
    }

    public final Producer<CloseableReference<CloseableImage>> getNetworkFetchSequence() {
        return (Producer) this.networkFetchSequence$delegate.getValue();
    }

    public final Producer<Void> getNetworkFetchToEncodedMemoryPrefetchSequence() {
        Object value = this.networkFetchToEncodedMemoryPrefetchSequence$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-networkFetchToEncod…oryPrefetchSequence>(...)");
        return (Producer) value;
    }

    public final Map<Producer<CloseableReference<CloseableImage>>, Producer<CloseableReference<CloseableImage>>> getPostprocessorSequences() {
        return this.postprocessorSequences;
    }

    public final Producer<CloseableReference<CloseableImage>> getQualifiedResourceFetchSequence() {
        return (Producer) this.qualifiedResourceFetchSequence$delegate.getValue();
    }

    public final Producer<CloseableReference<CloseableImage>> newBitmapCacheGetToDecodeSequence(Producer<EncodedImage> inputProducer) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
        if (!FrescoSystrace.isTracing()) {
            DecodeProducer decodeProducerNewDecodeProducer = this.producerFactory.newDecodeProducer(inputProducer);
            Intrinsics.checkNotNullExpressionValue(decodeProducerNewDecodeProducer, "producerFactory.newDecodeProducer(inputProducer)");
            return newBitmapCacheGetToBitmapCacheSequence(decodeProducerNewDecodeProducer);
        }
        FrescoSystrace.beginSection("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        try {
            DecodeProducer decodeProducerNewDecodeProducer2 = this.producerFactory.newDecodeProducer(inputProducer);
            Intrinsics.checkNotNullExpressionValue(decodeProducerNewDecodeProducer2, "producerFactory.newDecodeProducer(inputProducer)");
            return newBitmapCacheGetToBitmapCacheSequence(decodeProducerNewDecodeProducer2);
        } finally {
            FrescoSystrace.endSection();
        }
    }

    public final synchronized Producer<EncodedImage> newCommonNetworkFetchToEncodedMemorySequence(NetworkFetcher<?> networkFetcher) {
        Intrinsics.checkNotNullParameter(networkFetcher, "networkFetcher");
        FrescoSystrace frescoSystrace = FrescoSystrace.INSTANCE;
        if (!FrescoSystrace.isTracing()) {
            Producer<EncodedImage> producerNewNetworkFetchProducer = this.producerFactory.newNetworkFetchProducer(networkFetcher);
            Intrinsics.checkNotNullExpressionValue(producerNewNetworkFetchProducer, "producerFactory.newNetwo…hProducer(networkFetcher)");
            AddImageTransformMetaDataProducer addImageTransformMetaDataProducerNewAddImageTransformMetaDataProducer = ProducerFactory.newAddImageTransformMetaDataProducer(newEncodedCacheMultiplexToTranscodeSequence(producerNewNetworkFetchProducer));
            Intrinsics.checkNotNullExpressionValue(addImageTransformMetaDataProducerNewAddImageTransformMetaDataProducer, "newAddImageTransformMeta…taProducer(inputProducer)");
            ResizeAndRotateProducer resizeAndRotateProducerNewResizeAndRotateProducer = this.producerFactory.newResizeAndRotateProducer(addImageTransformMetaDataProducerNewAddImageTransformMetaDataProducer, this.resizeAndRotateEnabledForNetwork && this.downsampleMode != DownsampleMode.NEVER, this.imageTranscoderFactory);
            Intrinsics.checkNotNullExpressionValue(resizeAndRotateProducerNewResizeAndRotateProducer, "producerFactory.newResiz…  imageTranscoderFactory)");
            ResizeAndRotateProducer networkFetchToEncodedMemorySequence = resizeAndRotateProducerNewResizeAndRotateProducer;
            Intrinsics.checkNotNullExpressionValue(networkFetchToEncodedMemorySequence, "networkFetchToEncodedMemorySequence");
            return networkFetchToEncodedMemorySequence;
        }
        FrescoSystrace.beginSection("ProducerSequenceFactory#createCommonNetworkFetchToEncodedMemorySequence");
        try {
            Producer<EncodedImage> producerNewNetworkFetchProducer2 = this.producerFactory.newNetworkFetchProducer(networkFetcher);
            Intrinsics.checkNotNullExpressionValue(producerNewNetworkFetchProducer2, "producerFactory.newNetwo…hProducer(networkFetcher)");
            AddImageTransformMetaDataProducer addImageTransformMetaDataProducerNewAddImageTransformMetaDataProducer2 = ProducerFactory.newAddImageTransformMetaDataProducer(newEncodedCacheMultiplexToTranscodeSequence(producerNewNetworkFetchProducer2));
            Intrinsics.checkNotNullExpressionValue(addImageTransformMetaDataProducerNewAddImageTransformMetaDataProducer2, "newAddImageTransformMeta…taProducer(inputProducer)");
            ResizeAndRotateProducer resizeAndRotateProducerNewResizeAndRotateProducer2 = this.producerFactory.newResizeAndRotateProducer(addImageTransformMetaDataProducerNewAddImageTransformMetaDataProducer2, this.resizeAndRotateEnabledForNetwork && this.downsampleMode != DownsampleMode.NEVER, this.imageTranscoderFactory);
            Intrinsics.checkNotNullExpressionValue(resizeAndRotateProducerNewResizeAndRotateProducer2, "producerFactory.newResiz…  imageTranscoderFactory)");
            ResizeAndRotateProducer networkFetchToEncodedMemorySequence2 = resizeAndRotateProducerNewResizeAndRotateProducer2;
            Intrinsics.checkNotNullExpressionValue(networkFetchToEncodedMemorySequence2, "networkFetchToEncodedMemorySequence");
            return networkFetchToEncodedMemorySequence2;
        } finally {
            FrescoSystrace.endSection();
        }
    }

    public final void setBitmapPrepareSequences(Map<Producer<CloseableReference<CloseableImage>>, Producer<CloseableReference<CloseableImage>>> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.bitmapPrepareSequences = map;
    }

    public final void setCloseableImagePrefetchSequences(Map<Producer<CloseableReference<CloseableImage>>, Producer<Void>> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.closeableImagePrefetchSequences = map;
    }

    public final void setPostprocessorSequences(Map<Producer<CloseableReference<CloseableImage>>, Producer<CloseableReference<CloseableImage>>> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.postprocessorSequences = map;
    }
}
