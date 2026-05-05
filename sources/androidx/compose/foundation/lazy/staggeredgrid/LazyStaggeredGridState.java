package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: LazyStaggeredGridState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯƁ\u0014D57\u001eq\u007fZDkŞ\fA\u00146\u0013.H\u007f*, \u000b\u000ffp98D{H6RY*\u0017k\u00124,Ӌ,qY;]\u001a\u0004#\u0011OdgonP[\u0013C\u001d\u000f\u001exp6QU\u0007\u0001\u001a\u000fHBw?9Qw=O`|6\u000b\":\"Ny\r\u00010*P\u0010|}KK\"\u00128@v?Z\rc\u0005\"\u0012\f?(\u00014\\oNLHt]@2+\u0003\u007fBV'e1\u0005M#F\\'\u0013wi\u001eA@?5\u001b([\u0003\u001dRc?\tCy=\u001bh/'1L{WLX\b\u0014\u001b-W\rsr.\\\u000bRh\f=+WcQP\u0016(\u0006\u007f\u0004\rB\u0007\u0016\u00065H6- o\u0010\u000eA\u0015zSFX\n^X\u007f\u0003ʨ>\u0017;\u007f;+O\u001bnQw;!NEަ\r\r4#\tn'`\\\u000ev\u0015#T}S7VV׀fݱ\t\n=\u001c\u0003)b̈́)DIM\u0014?\u0002\u0017.%%O[g$1q\bHRi\u000f\u0005\u000fiרmRVCb\u000e\u001cճ:\r\u001a^\\d3p`Xf2)MJY\u0017\u0004\u0016\u001a8^\u000e;O-ŎROvr3kk\u007f=/\u0015.\nry\u0006o9\r4eWi\u0010oK\u000f\u0014m=)ں\u0017ڋFS\u001aT%E0-`j>n,H\\\b+2m5L:21'Y-H13\tˆҴ\r_`fX\u000fb՝#\u001biRk9\u0006^ʖo\bg'\br|)9;ێPM\u0019TLRtBî\"\u001f\u0006\u0004\u0002WgzHz̃\u0015<UD0$֣8i/k\u0004?\u00047Ɍ\u0001EEzc,e\u0016*5ϝ{\u0012\u000fim^l\u0016χoD`\u0019K\u007fX%U\u000f^!$NdH\u0015oÉy_c\u0003\u0002\fCWΆ\u0002q<|)-\f%\u001e3˜n:|cp\n'e&\u0006Ҭ.-a\fZ 3\bʸ\u000e>t\u0014trc^\tpР\\J;f@\n\u0005D!2d\u001bBvk(\u000eH\tB\u0006KHoe9\u001eFԕ\nG}\u0015}\\\u0013~²ZR\u0014\u001eϨ3^\u000b8ϣB\u0016:dB5\u0014]T\u0016ƭl[e\u001bQ\u001f\f\u001b{_e@Φ<0[ge\u001f/4֡\u0017dן:ك\t=\u000fӭ3rћFդGUwщ\u000fC\u001fT݂\u000e/2pjkZ\u001cL\u0011\\\u0005I5fK`/#\u0019~=4dִs̰\tmTNw\n@݅R5\tIa\u007f\u0003t\u001dCD\u0003:K,fy#E\fDy\u0007D߾FAm\u001a\u0005RՄ±\u0001\u001eHɋ\u001a\u0002q\u001fٿuH^9Z\u0015Trʗ\u0011~S|û(/\u007f\u000bɹ;\"\u000f9\u001e\u0016Γƚf.Rϵv\bO(\u000b/DW\u0012bŴe̍\u001f-\u000eז}OWv,'*d*ȍ\u007fл$&/״\r#be\u001cuZo)J.qDsXƂ\u0015ц$\n6\u05fd\rt\u0010@\u0016I +A\u0018+^\b\u0001(%N;Cl4W\u0002=7Z:ذ̨nό\u000f\u0013n3\\\u0015|Ih\u001f\u000f>[F3Z`S\u001fmp\u0002\u001f\u001d,\u0015T4f\fp=(O\u0012}'@\u000e,cĢԩkˮeA8T$\u001e-\u0016\u000e\u00060r6-[XS]r#-\u0005Px&jz*tt:*$~\u000fH\r4AV\u001dݴ Ү37!ے,\u001cU\u0005\u001f\u0004sJ\\eܳVC3980}NG \u0011azt.+xMۥ\u0004kD/L|K@wh2\u0017|\u0003Tu{|ܥ\f0)\u0010\u0017ZhdpPjG4;\u007fHwmg܋\u0017Ƭ\ns\u001f\u001b;\u0018_kuB\u000f+\u0019\u0013O{Akh$e\"y˅\u0011Θ\u001f]nծ=7k}5>RwX2ec\u0005\u0010\u0018j ˀGɭ}YX\u0002\u0010S2JV\b15]1v`6ЈBҕw]\fڏB8t{1\u007f=\u000b\u0002CDiF\t\u001b08ƁC˒\u0018\u001d\\@0gz\u001f\u0016_v5#D;ZJ\feѿ+ط\u001b\u0001(Qw|9aC\\=\u001au<A2:~ߴe:\u0012IF\u00198F}$b%\u0003p}So\u0010fU;OZ֖3ؒd\u007fh߷h?Y;^6\u000by$ڪn\u07b4D\u001b,ۋFD\u0012P\u0014<NJ\u001dH\f\u00121/!{_so\u0011h͠}٭\u001cǎټ$\u0005ɚkrO?c\u000ep??}\u00199\u001bjC2t\u0005\u0004n\"\u07be-܅\u0004p3ɹ_XDh8(V'S5`\u0010rJzfDӨߕ0ʒ\u0003d[_\u0007p-\u0013}\u0017kQ@6\bmrgC7\u0006F)е%٭|\b\u000bްY\u001b\u0019c,-\nL1N%1lE^֠K̉{˷ݗ\u000f\u0002˔N)7\u0006MKYMr2s\u000bicM[$ U%\\٣0\u008ek\u0013qپrq\u0011*NVW'\"¿\u0013ߒFp\u0017߇\r\u000e4kF6VU\u0014rz\u001ccP6ޏ8ɋt\u0015Oڢ\u0003}0H}~\u0015[S)9\u0010i^?W)ee^BS\u0002bfR/Y<?AfX]|ɀ\bž-6\u001fƉ{opZbHakBTHd(\\=ͤ@ͷBBPԯ1hUh)=\u0015t\u0017M\tHo}9۫.ɒ:Nrߘ\u0019\u0003QP%\u0004\b`\u0005\u0015\u007f3h\u0013\u0012&aq=GxvL+8߀!ٛa9>ŧ\b.\u0003\b\u001327~\u0012a\u001dM^\u0003B\u03784ծ^@$ޏݢ'vp\u000b0ĥ(+\u00044nYqެyٗq"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Y{]'\u001c\u0005/", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0011eh9tr(]v|", "7mXA\\(E4\u001d\f\tm\u001d\u0001\u00173b\u0007(_O\u0001\u001fzPn\u000eO", "", "7mXA\\(E4\u001d\f\tm\u001d\u0001\u00173b\u0007(_O\u0001\u001f\u0001Hp\u001c<\u0006", "uH8uI", "7mXA\\(E4\u001d\f\tm\u001d\u0001\u00173b\u0007(_O\u0001\u001f%", "", "7mXA\\(E4\u001d\f\tm\u001d\u0001\u00173b\u0007(eA\u0002%\u0017V}", ">qT3X;<V\u0007|}^+\r\u0010/r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005VA\u001e\u0016hp7\nQ*Qv&WSN92", "uZ8(<\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`\u0018Q\u007f\u0017;r49c\u0007i>i+B\u0017J7\u007f>.$2LF\u0007d,]t*5JQ,[by=!g\u001e~", "/mX:T;>A\u0017\f\u0005e3j\u00079p\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YiW/\u0015\u0001hA\u0012lQA&\u000f\u001aG\fFhV", "/vP6g\u0013:g#\u000f\nF6{\r0i\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005GF\u001a\u0019wB=\u0014q;5r;Q\\]\u0014fQv>\u0018\u0012gc", "5dc\u000ej(Bb\u007fz\u000fh<\fp9d\u0004)\u007f@\u000eU\u0018Q\u007f\u0017;r49c\u0007\u001aDm\u001d.IQ;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}y'deHgg9\\\u0006\u000eC`X<k:|<\u0018\u0013^\u000e[\u0001", "0dh<a+\u001b])\byl\u0010\u0006\n9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;+v;QUM\tfb{<\"uc\u000fX\u0001", "5dc\u000fX@H\\\u0018[\u0005n5{\u0017\u0013n\u00012:A\u000b' Fk\u001d@\u0001./f}'7i$.", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0005\u0011}u \u0003w6^\u0006\u0004G`X5[/|M\u001d\u0011hqW,\u0017Z", "\nrTA \u0006\u0017", "", "1`] V9HZ [v\\2\u000f\u0005<d", "5dc\u0010T5,Q&\t\u0002e\tx\u00075w{5z", "u(I", "Adc\u0010T5,Q&\t\u0002e\tx\u00075w{5z", "uY\u0018#", "1`] V9HZ [v\\2\u000f\u0005<d>'{G\u0001\u0019\u0013Vo", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "1`] V9HZ _\u0005k>x\u0016.", "5dc\u0010T5,Q&\t\u0002e\r\u0007\u0016Aa\r'", "Adc\u0010T5,Q&\t\u0002e\r\u0007\u0016Aa\r'", "1`] V9HZ _\u0005k>x\u0016.$~(\u0003@\u0003\u0013&G", "1ta?X5M7(~\u0003I9|\n/t}+^<\n\u0016\u001eG}", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;9\u0004'HL]*_@\u00029#\u0012\u0019x[+\u000e\u0005h?'Q@@\u001e\u000f,\u001f", "4ha@g\u001dBa\u001d{\u0002^\u0010\f\t7I\t'{S", "5dc\u0013\\9Lb\n\u0003\tb)\u0004\t\u0013t\u007f0_I\u007f\u0017*", "u(8", "4ha@g\u001dBa\u001d{\u0002^\u0010\f\t7S}5\u0006G\b\u0001\u0018H}\u000eK", "5dc\u0013\\9Lb\n\u0003\tb)\u0004\t\u0013t\u007f0i>\u000e!\u001eNY\u000f=\u0005%D", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6Wd1WYL,2", "5dc\u0016a;>`\u0015|\nb6\u0006v9u\r&{", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~]\u0007/7z\u0012,\\GEt}\u0002\u001ewaF\u0003a;R\u000105V^9ZRH", "7rB0e6EZ|\bek6~\u0016/s\u000e", "7sT:45B[\u0015\u000e\u0005k", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O(W0dN\u0002G!g", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YuN'\u001b\u0015fA#RS7']", "5dc\u0016g,F/\"\u0003\u0003Z;\u0007\u0016mf\n8\u0005?|&\u001bQx\bIv,5U\f ", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0005\u0011}u \u0003w6^\u0006\u000bVLV\beVz9#\u001cgc", ":`]266N\\(", "5dc\u0019T5>1#\u000f\u0004mj}\u0013?n~$\u000bD\u000b \u0011To\u0015<r35", ":`]2<5?]", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YtJ4\rhbB.D", "5dc\u0019T5>7\"\u007f\u0005\u001d-\u0007\u00198d{7\u007fJ\n\u0011$Gv\u000e8\u0005%", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7$=IE=kA\u001e\u0014jn=\u0006-\u0013J\f;5[J.^R\u007f=\u0013sg\u0012M\u0012\t\u000eY%-oN\r", ":`bAF*K] \u0006z]\tx\u00075w{5z", "5dc\u0019T:MA\u0017\f\u0005e3|\b\fa}.\u000e<\u000e\u0016", ":`bAF*K] \u0006z]\r\u0007\u0016Aa\r'", "5dc\u0019T:MA\u0017\f\u0005e3|\b\u0010o\r:wM\u007f", ":`h<h;\"\\\u001a\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YtJ?\u0017\u0015h%-oN\r", "5dc\u0019T@Hc(b\u0004_6", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7$=IE=kA\u001e\u0014jn=\u0006-\u0013J\f;5[J.^R\u007f=\u0013sg\u0012M\u0012\t\u0019cQ3RM8)]", ":`h<h;\"\\\u001a\thm(\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YuN'\u001b\u0015fA\u0011nRG&\u0017\u0002", ";dP@h9>>\u0015\r\t<6\r\u0012>", "5dc\u001aX(Lc&~eZ:\u000bf9u\t7:A\u000b' Fk\u001d@\u0001./f}'7i$.", "Adc\u001aX(Lc&~eZ:\u000bf9u\t7:A\u000b' Fk\u001d@\u0001./f}'7i$.", "uH\u0018#", ";dP@h9>[\u0019\b\nL*\u0007\u0014/I\t9wG\u0005\u0016\u0013Vy\u001b", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005U1,\u0015ur5\u0004j,<t1RL25mNyA\u0013\u000ei\u0018[\u0001", "5dc\u001aX(Lc&~\u0003^5\fv-o\u000b(_I\u0012\u0013\u001eKn\nK\u00012|nq$Kt)@\fDE{=\u001d\u0011weC\u0010]9N}'CZN", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006^5DUz'7[%*\\C\u0011", ";tc.U3>7\"\u000ezk(z\u00183o\t\u0016\u0006P\u000e\u0015\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "5dc\u001ah;:P ~^g;|\u0016+c\u000f,\u0006In!'Tm\u000ezw/Eb|\u001cFq 7GP;r4\u001a#h", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~]\u0007/7z\u0012,\\GEt}\u0006%w]6\u000ec\u0010W\u0006'THL;`\\{+\u001e\"g\fN\u0001", "<dP?X:M@\u0015\b|^", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "5dc\u001bX(KS'\u000egZ5~\tmf\n8\u0005?|&\u001bQx\bIv,5U\f ul\u00165ME7z4", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001{%*OE;x4\u001d\u0017ue8PJ(c\u000b\u0015VHP.\\_r<u\u001f^\r<:\t\u0014Y\u0017gUI30\u0004uP}DjJu\u0013\u00135h\u007f\u0018", "5dc\u001bX(KS'\u000egZ5~\tmf\n8\u0005?|&\u001bQx\bIv,5U\f ", "u(;8b;EW\"H\bZ5~\t=/c1\u000b-| \u0019GE", ">h];X+\"b\u0019\u0007\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;9z0PLM\u0010kRz$\u0018 ic", "5dc\u001d\\5GS\u0018b\n^4\u000bG0o\u00101z<\u0010\u001b!Pi\u001b<}%1g}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0005\u0011}u \u0003w6^\u0006\u0012KUW,[6\u0002=\u001cx^\u001c]\u0001", ">kP0X4>\\(lxh7|l8v{/\u007f?|&!T", "5dc\u001d_(<S!~\u0004m\u001az\u0013:ec1\r<\b\u001b\u0016C~\u0018I>:)]\u0012'J\u007fT/WSDj0-\u0019rj3\u0014c3Nr5G", ">qT3X;<Vuz\t^\u0010\u0006\b/x", ">qT3X;<V\u0007\u000evm,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;9\u0004'HL]*_@\u00029#\u00120", "5dc\u001de,?S(|}L;x\u0018/$\u00012\fI\u007f\u0013&Ky\u00176\u0004%<Yy.7", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0005\u0011}u \u0003w6^\u0006\u0012TLO,kPu+#\u000ei\u000e$", ">qT3X;<V\u001d\b|>5x\u00066e~", "5dc\u001de,?S(|}b5~h8a|/{??\u0018!Wx\r8\u0006)?bw-7t\u0016*[C", "Adc\u001de,?S(|}b5~h8a|/{??\u0018!Wx\r8\u0006)?bw-7t\u0016*[C", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c%=Yy.Gz\u00166MLJA", "@d\\2T:N`\u0019\u0007zg;", "5dc\u001fX4>O'\u000f\b^4|\u0012>$\u00012\fI\u007f\u0013&Ky\u00176\u0004%<Yy.7", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\"Y\u0006 3{&;MK;tCs", "@d\\2T:N`\u0019\u0007zg;d\u0013.i\u0001,{M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c%=Yy.Gz\u00166MLJS>\u001d\u0019ie9\u00149", "5dc\u001fX4>O'\u000f\b^4|\u0012>M\n'\u007fA\u0005\u0017$\u0006p\u0018L\u007f$1h\u0002*@g#.TC7y4", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\"Y\u0006 3{&;MK;tC\u0006\u001fge:\u000bc9$", "Aba<_3)]'\u0003\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Y{L8\u0017\f`,.|HF#\u00125\u001f", "5dc V9HZ i\u0005l0\f\r9n>)\u0006P\n\u0016\u0013Vs\u0018Ep25`}\u001cEm", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7$=IE=kA\u001e\u0014jn=\u0006-\u0013J\f;5[J.^R\u007f=\u0013sg\u0012M\u0019\u000b\u0012cH+YNE#\u00170S\u000b\u0011", "", "Aba<_3-]u~Xh5\u000b\u00197e~", "5dc V9HZ m\u0005;,Z\u00138s\u00100{??\u0018!Wx\r8\u0006)?bw-7t\u0016*[C", "u(5", "Aba<_3:P ~hm(\f\t", "/mX:T;>A\u0017\f\u0005e3k\u0013\u0013t\u007f0", "", "7mS2k", "Aba<_3(T\u001a\rzm", "uH8\u0019^6MZ\u001d\bD\\6\n\u0013?t\u00041{NJt!P~\u0012E\u0007!D]\b)\r1|3IT75;\u001a\u001ej+#\u0004h,L\u0006|", "/o_9l\u0014>O'\u000f\b^\u0019|\u0017?l\u000f", "@dbB_;", "Dhb6U3>7(~\u0003l\u001a\f\u0005Ce~\u0017~@n\u0013\u001fG", "/o_9l\u0014>O'\u000f\b^\u0019|\u0017?l\u000ff|J\u0011 \u0016C~\u0012F\u007f\u001fBY\u0005 3{\u0016", "1`]0X3)`\u0019\u007fzm*\u007fl0V\u00046\u007f=\b\u0017zVo\u0016JT(1b\u007f 6", "7mU<", "1kT.e\u0013>T(\t\f^9g\u0016/f\u007f7yCc\u0013 Fv\u000eJ", ">qT3X;<V{z\u0004]3|\u0017\u001fs\u007f'", "", "2hb=T;<V\u0006z\r=,\u0004\u0018+", "2d[AT", "4h[9A,:`\u0019\r\nB5{\r-e\u000e", "7sT:<5=S,", "<nc6Y@)`\u0019\u007fzm*\u007f", "=mB0e6EZ", "2hbAT5<S", "@d`BX:MA\u0017\f\u0005e3k\u0013\u0013t\u007f0", "Aba<_3", "Aba<_3)`\u001d\t\bb;\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\rEhy/7X#2WP?zHs", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn\u001di\r\u001cFm\u0001;QMHoC2jOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0004tn2S\u0011Bl\nU\u0014\u0018Bt\u0001QZ\u0019G\b^SK2wJbouVEOk\u007f(rd\u0019m6\u0004+\u0010z\u001bdRM3\nybf", "Aba<_3-]|\u000ezf", "AmP=G6\"b\u0019\u0007^g;|\u00168a\u0007", "4na0X\u0019>[\u0019z\tn9|", "AmP=G6\"b\u0019\u0007^g;|\u00168a\u0007f|J\u0011 \u0016C~\u0012F\u007f\u001fBY\u0005 3{\u0016", "CoS.g,,Q&\t\u0002e\u0017\u0007\u00173t\u00042\u0005$\u0002\u0006\u001aGP\u0012I\u00054\u0019h}()i$\u0016WT;j", "7sT:C9Hd\u001d}zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O7[6mVq=!g", "4ha@g\u0010MS!b\u0004],\u0010", "CoS.g,,Q&\t\u0002e\u0017\u0007\u00173t\u00042\u0005$\u0002\u0006\u001aGP\u0012I\u00054\u0019h}()i$\u0016WT;jr\u001f\u001fxj8\u0003r0X\u007f!TLU,X`r", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyStaggeredGridState implements ScrollableState {
    private final LazyStaggeredGridAnimateScrollScope animateScrollScope;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private final Map<Integer, LazyLayoutPrefetchState.PrefetchHandle> currentItemPrefetchHandles;
    private final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> itemAnimator;
    private final LazyStaggeredGridLaneInfo laneInfo;
    private final MutableState<LazyStaggeredGridMeasureResult> layoutInfoState;
    private int measurePassCount;
    private final MutableState<Unit> measurementScopeInvalidator;
    private final MutableInteractionSource mutableInteractionSource;
    private final LazyLayoutPinnedItemList pinnedItems;
    private final MutableState<Unit> placementScopeInvalidator;
    private int prefetchBaseIndex;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private Remeasurement remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyStaggeredGridScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Saver<LazyStaggeredGridState, Object> Saver = ListSaverKt.listSaver(new Function2<SaverScope, LazyStaggeredGridState, List<? extends int[]>>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final List<int[]> invoke(SaverScope saverScope, LazyStaggeredGridState lazyStaggeredGridState) {
            return CollectionsKt.listOf((Object[]) new int[][]{lazyStaggeredGridState.getScrollPosition$foundation_release().getIndices(), lazyStaggeredGridState.getScrollPosition$foundation_release().getScrollOffsets()});
        }
    }, new Function1<List<? extends int[]>, LazyStaggeredGridState>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$Companion$Saver$2
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ LazyStaggeredGridState invoke(List<? extends int[]> list) {
            return invoke2((List<int[]>) list);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final LazyStaggeredGridState invoke2(List<int[]> list) {
            return new LazyStaggeredGridState(list.get(0), list.get(1), null);
        }
    });

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\f\u0002\u001c\u001cQ\u0018\u001a\b\u000f\u0010\u000f\u001d\u0011\u0011\u0015!\u0019\u0015_~\u0015//\n,\u001a!\"!/##\u00073+'\u00179';-", f = "\u0019-EC\u001c<(-,)5'%\u00071'!\u000f/\u001b-\u001dd!)", i = {0, 0, 0}, l = {235, 236}, m = "B3CA?@", n = {"c^kY", "bYtU^b2Y?IX3KS", "QbqI]"}, s = {"xQ^", "xQ_", "xQ`"})
    static final class C05281 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C05281(Continuation<? super C05281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LazyStaggeredGridState.this.scroll(null, null, this);
        }
    }

    public LazyStaggeredGridState(int[] iArr, int[] iArr2, PrefetchScheduler prefetchScheduler) {
        LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = new LazyStaggeredGridScrollPosition(iArr, iArr2, new LazyStaggeredGridState$scrollPosition$1(this));
        this.scrollPosition = lazyStaggeredGridScrollPosition;
        this.layoutInfoState = SnapshotStateKt.mutableStateOf(LazyStaggeredGridMeasureResultKt.getEmptyLazyStaggeredGridLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
        this.laneInfo = new LazyStaggeredGridLaneInfo();
        this.canScrollForward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.canScrollBackward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.animateScrollScope = new LazyStaggeredGridAnimateScrollScope(this);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                this.this$0.remeasurement = remeasurement;
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.prefetchingEnabled = true;
        this.prefetchState = new LazyLayoutPrefetchState(prefetchScheduler, null, 2, null);
        this.scrollableState = ScrollableStateKt.ScrollableState(new Function1<Float, Float>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollableState$1
            {
                super(1);
            }

            public final Float invoke(float f2) {
                return Float.valueOf(-this.this$0.onScroll(-f2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                return invoke(f2.floatValue());
            }
        });
        this.prefetchBaseIndex = -1;
        this.currentItemPrefetchHandles = new LinkedHashMap();
        this.mutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.pinnedItems = new LazyLayoutPinnedItemList();
        this.itemAnimator = new LazyLayoutItemAnimator<>();
        lazyStaggeredGridScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m1195constructorimpl$default(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m1195constructorimpl$default(null, 1, null);
    }

    public /* synthetic */ LazyStaggeredGridState(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((1 & i4) != 0 ? 0 : i2, (i4 + 2) - (i4 | 2) != 0 ? 0 : i3);
    }

    public LazyStaggeredGridState(int i2, int i3) {
        this(new int[]{i2}, new int[]{i3}, null);
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    public final LazyStaggeredGridScrollPosition getScrollPosition$foundation_release() {
        return this.scrollPosition;
    }

    public final LazyStaggeredGridLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    public final LazyStaggeredGridLaneInfo getLaneInfo$foundation_release() {
        return this.laneInfo;
    }

    private void setCanScrollForward(boolean z2) {
        this.canScrollForward$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward$delegate.getValue()).booleanValue();
    }

    private void setCanScrollBackward(boolean z2) {
        this.canScrollBackward$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.scrollableState.getLastScrolledForward();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.scrollableState.getLastScrolledBackward();
    }

    public final Remeasurement getRemeasurement$foundation_release() {
        return this.remeasurement;
    }

    public final RemeasurementModifier getRemeasurementModifier$foundation_release() {
        return this.remeasurementModifier;
    }

    public final AwaitFirstLayoutModifier getAwaitLayoutModifier$foundation_release() {
        return this.awaitLayoutModifier;
    }

    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.beyondBoundsInfo;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.prefetchingEnabled;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z2) {
        this.prefetchingEnabled = z2;
    }

    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.prefetchState;
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.scrollToBeConsumed;
    }

    public final int getMeasurePassCount$foundation_release() {
        return this.measurePassCount;
    }

    public final void setMeasurePassCount$foundation_release(int i2) {
        this.measurePassCount = i2;
    }

    public final int getLaneCount$foundation_release() {
        return this.layoutInfoState.getValue().getSlots().getSizes().length;
    }

    public final InteractionSource getInteractionSource() {
        return this.mutableInteractionSource;
    }

    public final MutableInteractionSource getMutableInteractionSource$foundation_release() {
        return this.mutableInteractionSource;
    }

    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.pinnedItems;
    }

    public final LazyLayoutItemAnimator<LazyStaggeredGridMeasuredItem> getItemAnimator$foundation_release() {
        return this.itemAnimator;
    }

    public final IntRange getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    /* JADX INFO: renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<Unit> m1237getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object scroll(androidx.compose.foundation.MutatePriority r7, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.C05281
            if (r0 == 0) goto L60
            r5 = r9
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r5 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.C05281) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L60
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L13:
            java.lang.Object r4 = r5.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 == r1) goto L3f
            if (r0 != r2) goto L66
            kotlin.ResultKt.throwOnFailure(r4)
        L26:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L29:
            kotlin.ResultKt.throwOnFailure(r4)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = r6.awaitLayoutModifier
            r5.L$0 = r6
            r5.L$1 = r7
            r5.L$2 = r8
            r5.label = r1
            java.lang.Object r0 = r0.waitForFirstLayout(r5)
            if (r0 != r3) goto L3d
            return r3
        L3d:
            r0 = r6
            goto L4e
        L3f:
            java.lang.Object r8 = r5.L$2
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r7 = r5.L$1
            androidx.compose.foundation.MutatePriority r7 = (androidx.compose.foundation.MutatePriority) r7
            java.lang.Object r0 = r5.L$0
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r0 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState) r0
            kotlin.ResultKt.throwOnFailure(r4)
        L4e:
            androidx.compose.foundation.gestures.ScrollableState r1 = r0.scrollableState
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.label = r2
            java.lang.Object r0 = r1.scroll(r7, r8, r5)
            if (r0 != r3) goto L26
            return r3
        L60:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r5 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
            r5.<init>(r9)
            goto L13
        L66:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.scroll(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float onScroll(float f2) {
        if ((f2 < 0.0f && !getCanScrollForward()) || (f2 > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (Math.abs(this.scrollToBeConsumed) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
        }
        float f3 = this.scrollToBeConsumed + f2;
        this.scrollToBeConsumed = f3;
        if (Math.abs(f3) > 0.5f) {
            LazyStaggeredGridMeasureResult value = this.layoutInfoState.getValue();
            float f4 = this.scrollToBeConsumed;
            if (value.tryToApplyScrollWithoutRemeasure(MathKt.roundToInt(f4))) {
                applyMeasureResult$foundation_release(value, true);
                ObservableScopeInvalidator.m1199invalidateScopeimpl(this.placementScopeInvalidator);
                notifyPrefetch(f4 - this.scrollToBeConsumed, value);
            } else {
                Remeasurement remeasurement = this.remeasurement;
                if (remeasurement != null) {
                    remeasurement.forceRemeasure();
                }
                notifyPrefetch$default(this, f4 - this.scrollToBeConsumed, null, 2, null);
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return f2;
        }
        float f5 = f2 - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f5;
    }

    public static /* synthetic */ Object scrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i2, int i3, Continuation continuation, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return lazyStaggeredGridState.scrollToItem(i2, i3, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scrollToItem$2, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\f\u0002\u001c\u001cQ\u0018\u001a\b\u000f\u0010\u000f\u001d\u0011\u0011\u0015!\u0019\u0015_~\u0015//\n,\u001a!\"!/##\u00073+'\u00179';-l=.><:;$@\u001bG9By\t", f = "\u0019-EC\u001c<(-,)5'%\u00071'!\u000f/\u001b-\u001dd!)", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $index;
        final /* synthetic */ int $scrollOffset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(int i2, int i3, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$index = i2;
            this.$scrollOffset = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LazyStaggeredGridState.this.new AnonymousClass2(this.$index, this.$scrollOffset, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LazyStaggeredGridState.this.snapToItemInternal$foundation_release(this.$index, this.$scrollOffset, true);
            return Unit.INSTANCE;
        }
    }

    public final Object scrollToItem(int i2, int i3, Continuation<? super Unit> continuation) {
        Object objScroll$default = ScrollableState.scroll$default(this, null, new AnonymousClass2(i2, i3, null), continuation, 1, null);
        return objScroll$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i2, int i3, Continuation continuation, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return lazyStaggeredGridState.animateScrollToItem(i2, i3, continuation);
    }

    public final Object animateScrollToItem(int i2, int i3, Continuation<? super Unit> continuation) {
        LazyStaggeredGridMeasureResult value = this.layoutInfoState.getValue();
        Object objAnimateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.animateScrollScope, i2, i3, value.getSlots().getSizes().length * 100, value.getDensity(), continuation);
        return objAnimateScrollToItem == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateScrollToItem : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<Unit> m1236getMeasurementScopeInvalidatorzYiylxw$foundation_release() {
        return this.measurementScopeInvalidator;
    }

    public static /* synthetic */ void requestScrollToItem$default(LazyStaggeredGridState lazyStaggeredGridState, int i2, int i3, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i3 = 0;
        }
        lazyStaggeredGridState.requestScrollToItem(i2, i3);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$requestScrollToItem$1, reason: invalid class name */
    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\f\u0002\u001c\u001cQ\u0018\u001a\b\u000f\u0010\u000f\u001d\u0011\u0011\u0015!\u0019\u0015_~\u0015//\n,\u001a!\"!/##\u00073+'\u00179';-l<0=B3BD$5ECAB+G\"N@I\u0001\u000f", f = "\u0019-EC\u001c<(-,)5'%\u00071'!\u000f/\u001b-\u001dd!)", i = {}, l = {SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LazyStaggeredGridState.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ScrollExtensionsKt.stopScroll$default(LazyStaggeredGridState.this, null, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void requestScrollToItem(int i2, int i3) {
        if (isScrollInProgress()) {
            BuildersKt__Builders_commonKt.launch$default(this.layoutInfoState.getValue().getCoroutineScope(), null, null, new AnonymousClass1(null), 3, null);
        }
        snapToItemInternal$foundation_release(i2, i3, false);
    }

    public final void snapToItemInternal$foundation_release(int i2, int i3, boolean z2) {
        int iM6766getXimpl;
        boolean z3 = (this.scrollPosition.getIndex() == i2 && this.scrollPosition.getScrollOffset() == i3) ? false : true;
        if (z3) {
            this.itemAnimator.reset();
        }
        LazyStaggeredGridMeasureResult value = this.layoutInfoState.getValue();
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfoFindVisibleItem = LazyStaggeredGridMeasureResultKt.findVisibleItem(value, i2);
        if (lazyStaggeredGridItemInfoFindVisibleItem != null && z3) {
            if (value.getOrientation() == Orientation.Vertical) {
                iM6766getXimpl = IntOffset.m6767getYimpl(lazyStaggeredGridItemInfoFindVisibleItem.mo1217getOffsetnOccac());
            } else {
                iM6766getXimpl = IntOffset.m6766getXimpl(lazyStaggeredGridItemInfoFindVisibleItem.mo1217getOffsetnOccac());
            }
            int i4 = iM6766getXimpl + i3;
            int length = value.getFirstVisibleItemScrollOffsets().length;
            int[] iArr = new int[length];
            for (int i5 = 0; i5 < length; i5++) {
                iArr[i5] = value.getFirstVisibleItemScrollOffsets()[i5] + i4;
            }
            this.scrollPosition.updateScrollOffset(iArr);
        } else {
            this.scrollPosition.requestPositionAndForgetLastKnownKey(i2, i3);
        }
        if (z2) {
            Remeasurement remeasurement = this.remeasurement;
            if (remeasurement != null) {
                remeasurement.forceRemeasure();
                return;
            }
            return;
        }
        ObservableScopeInvalidator.m1199invalidateScopeimpl(this.measurementScopeInvalidator);
    }

    public final int[] updateScrollPositionIfTheFirstItemWasMoved$foundation_release(LazyLayoutItemProvider lazyLayoutItemProvider, int[] iArr) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(lazyLayoutItemProvider, iArr);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f2) {
        return this.scrollableState.dispatchRawDelta(f2);
    }

    static /* synthetic */ void notifyPrefetch$default(LazyStaggeredGridState lazyStaggeredGridState, float f2, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            lazyStaggeredGridMeasureResult = lazyStaggeredGridState.layoutInfoState.getValue();
        }
        lazyStaggeredGridState.notifyPrefetch(f2, lazyStaggeredGridMeasureResult);
    }

    private final void notifyPrefetch(float f2, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult) {
        int index;
        int i2;
        long jM6602fixedHeightOenEA2s;
        if (!this.prefetchingEnabled || lazyStaggeredGridMeasureResult.getVisibleItemsInfo().isEmpty()) {
            return;
        }
        boolean z2 = f2 < 0.0f;
        if (z2) {
            index = ((LazyStaggeredGridMeasuredItem) CollectionsKt.last((List) lazyStaggeredGridMeasureResult.getVisibleItemsInfo())).getIndex();
        } else {
            index = ((LazyStaggeredGridMeasuredItem) CollectionsKt.first((List) lazyStaggeredGridMeasureResult.getVisibleItemsInfo())).getIndex();
        }
        if (index == this.prefetchBaseIndex) {
            return;
        }
        this.prefetchBaseIndex = index;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LazyStaggeredGridSlots slots = lazyStaggeredGridMeasureResult.getSlots();
        int length = slots.getSizes().length;
        for (int i3 = 0; i3 < length; i3++) {
            if (z2) {
                index = this.laneInfo.findNextItemIndex(index, i3);
            } else {
                index = this.laneInfo.findPreviousItemIndex(index, i3);
            }
            if (index < 0 || index >= lazyStaggeredGridMeasureResult.getTotalItemsCount() || linkedHashSet.contains(Integer.valueOf(index))) {
                break;
            }
            linkedHashSet.add(Integer.valueOf(index));
            if (!this.currentItemPrefetchHandles.containsKey(Integer.valueOf(index))) {
                boolean zIsFullSpan = lazyStaggeredGridMeasureResult.getSpanProvider().isFullSpan(index);
                int i4 = zIsFullSpan ? 0 : i3;
                int i5 = zIsFullSpan ? length : 1;
                if (i5 == 1) {
                    i2 = slots.getSizes()[i4];
                } else {
                    int i6 = slots.getPositions()[i4];
                    int i7 = (i4 + i5) - 1;
                    i2 = (slots.getPositions()[i7] + slots.getSizes()[i7]) - i6;
                }
                if (lazyStaggeredGridMeasureResult.getOrientation() == Orientation.Vertical) {
                    jM6602fixedHeightOenEA2s = Constraints.Companion.m6603fixedWidthOenEA2s(i2);
                } else {
                    jM6602fixedHeightOenEA2s = Constraints.Companion.m6602fixedHeightOenEA2s(i2);
                }
                this.currentItemPrefetchHandles.put(Integer.valueOf(index), this.prefetchState.m1190schedulePrefetch0kLqBqw(index, jM6602fixedHeightOenEA2s));
            }
        }
        clearLeftoverPrefetchHandles(linkedHashSet);
    }

    private final void clearLeftoverPrefetchHandles(Set<Integer> set) {
        Iterator<Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle>> it = this.currentItemPrefetchHandles.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, LazyLayoutPrefetchState.PrefetchHandle> next = it.next();
            if (!set.contains(next.getKey())) {
                next.getValue().cancel();
                it.remove();
            }
        }
    }

    private final void cancelPrefetchIfVisibleItemsChanged(LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo) {
        List<LazyStaggeredGridItemInfo> visibleItemsInfo = lazyStaggeredGridLayoutInfo.getVisibleItemsInfo();
        if (this.prefetchBaseIndex != -1 && !visibleItemsInfo.isEmpty()) {
            int index = ((LazyStaggeredGridItemInfo) CollectionsKt.first((List) visibleItemsInfo)).getIndex();
            int index2 = ((LazyStaggeredGridItemInfo) CollectionsKt.last((List) visibleItemsInfo)).getIndex();
            int i2 = this.prefetchBaseIndex;
            if (index > i2 || i2 > index2) {
                this.prefetchBaseIndex = -1;
                Iterator<T> it = this.currentItemPrefetchHandles.values().iterator();
                while (it.hasNext()) {
                    ((LazyLayoutPrefetchState.PrefetchHandle) it.next()).cancel();
                }
                this.currentItemPrefetchHandles.clear();
            }
        }
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(LazyStaggeredGridState lazyStaggeredGridState, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        lazyStaggeredGridState.applyMeasureResult$foundation_release(lazyStaggeredGridMeasureResult, z2);
    }

    public final void applyMeasureResult$foundation_release(LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, boolean z2) {
        this.scrollToBeConsumed -= lazyStaggeredGridMeasureResult.getConsumedScroll();
        this.layoutInfoState.setValue(lazyStaggeredGridMeasureResult);
        if (z2) {
            this.scrollPosition.updateScrollOffset(lazyStaggeredGridMeasureResult.getFirstVisibleItemScrollOffsets());
        } else {
            this.scrollPosition.updateFromMeasureResult(lazyStaggeredGridMeasureResult);
            cancelPrefetchIfVisibleItemsChanged(lazyStaggeredGridMeasureResult);
        }
        setCanScrollBackward(lazyStaggeredGridMeasureResult.getCanScrollBackward());
        setCanScrollForward(lazyStaggeredGridMeasureResult.getCanScrollForward());
        this.measurePassCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] fillNearestIndices(int i2, int i3) {
        int iMin;
        int iFindNextItemIndex = i2;
        int[] iArr = new int[i3];
        if (!this.layoutInfoState.getValue().getSpanProvider().isFullSpan(iFindNextItemIndex)) {
            this.laneInfo.ensureValidIndex(iFindNextItemIndex + i3);
            int lane = this.laneInfo.getLane(iFindNextItemIndex);
            if (lane == -2 || lane == -1) {
                iMin = 0;
            } else {
                if (lane < 0) {
                    throw new IllegalArgumentException(("Expected positive lane number, got " + lane + " instead.").toString());
                }
                iMin = Math.min(lane, i3);
            }
            int i4 = iMin - 1;
            int iFindPreviousItemIndex = iFindNextItemIndex;
            while (true) {
                if (-1 >= i4) {
                    break;
                }
                iFindPreviousItemIndex = this.laneInfo.findPreviousItemIndex(iFindPreviousItemIndex, i4);
                iArr[i4] = iFindPreviousItemIndex;
                if (iFindPreviousItemIndex == -1) {
                    ArraysKt.fill$default(iArr, -1, 0, i4, 2, (Object) null);
                    break;
                }
                i4--;
            }
            iArr[iMin] = iFindNextItemIndex;
            while (true) {
                iMin++;
                if (iMin < i3) {
                    iFindNextItemIndex = this.laneInfo.findNextItemIndex(iFindNextItemIndex, iMin);
                    iArr[iMin] = iFindNextItemIndex;
                } else {
                    return iArr;
                }
            }
        } else {
            ArraysKt.fill$default(iArr, iFindNextItemIndex, 0, 0, 6, (Object) null);
            return iArr;
        }
    }

    /* JADX INFO: compiled from: LazyStaggeredGridState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\blʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$B^IV2\n2\u000b_N\u0016j~Lj\u000bq\u000e4\u0018ѱn2Qǁ\u0011_\u0018\u0013@GŌC9"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Y{]'\u001c\u0005\u0018\u001f.vO3(\f6RW", "", "u(E", "!`e2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Y{]'\u001c\u0005/", "5dc T=>`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005!FYy\u001d>m_\u001cIT;x\n", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<LazyStaggeredGridState, Object> getSaver() {
            return LazyStaggeredGridState.Saver;
        }
    }
}
