package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
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
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.unit.Density;
import com.drew.metadata.exif.ExifDirectoryBase;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
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
/* JADX INFO: compiled from: LazyListState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŷ\u0014D57\u001eq\u007fZDkŞ\fA\u00146\u0013.H\u007f*,(w\u000ffp98D{H6Ra/\u0017k\u00124,Ӌ,qY;]ڼ\u0006\"\u001fOVgmoRZ!C\u0017\u0006\u001cyr,W^\u0001]\u0018\u0019:B\u0006?;MuCA`\u000b6\r 8#@y\u001b\u0001\"*N\u0012~zYK\u0014\u0012F@x:X\u0012U\u00050\u0012\u000e>&\u0002&\\}N>H\u0003]Bǂ+\u0003\u007fBV'e1\u0005M#F\\'\u0013{i\u001eA@?5\u001b+[\u0003\u001dRcΪ\u000b?\b=\rh-*3I\nW>X\u0006\u0016\u001d+e\rer,`\rQv\f/+UeSP\u001c(\u007fz\u0002\u001cD\u0004$\u0006/Ξ6-0f\u0010\u000eItzSVP\n^Pȕ\u0003aL\u0017-\u007f90A\u001b|Qi;\u001fN?{\u001b\r&#\u0007p'`jו~ڙ\u001a\u0005w\u007f0\n@לG\u000f#_Q}\nvb\u0010*\u001c0u\u0001?\u0002\u0017.%'O[g$\u074co\u0002VG(\u001a\u000bexYoRV@:nD8:\u000f\u0012ZRf\u001dk~Uh2\u0017M*X\u001f}6\u0018ء`wJ'm0\\B\u0001i\u0019A\u000e\u0010+.t,qn\u001a\u000f\b?d3CG{\u0010\u0010S=ܤ}םf\u0005f]\u000bx\u001aRt(P&xn\u001ep\u0014D|OC6Mk44ZGIb\u001bH\u0011\u0019ZA+\u001f&ʳӳ\u0014~Z/l\u0011w!\r\t/Y\rt}e\u0011IZ\u0006'6uX_ڂ\u0018>UP\\d\u00011\u0005\u0017s.P\u0018PU\n\u0005\u0016$\u0014B ^0G֙.U\u0013=\bY7\u0010ΒDdr\u0014Z\u0014ȼؠ~}\u007fҼ:1GuŒi\t,\u000f^zUZ\u00160kvrQ\t\u0015\u0006\u007faTp_c\u0003\f$\u0006W΅\u0002q<|,-\u000b-ǎ$\u0019pPĤ4]n5ݽ\u0015\u0010:5\u0014q`yp\\ӫa\u001f/\u0005l\u0014.s\u0016\u001eV\u007fϭ1K=Y\\\u0015=Pهk1ܳGܖ{\tHޔ3SΠ\u0007ыhqdФLSP\f֕\u0006D\r\u001fJ\f@\u0019n\f)F_Xts\u0004\u001a^Q\u001b)M\u0002h4\u07b5\nů\u000fJ\u001d\u0001S\"?\u07bc\u00114=NJ\bf\u0017%\u001esF7q?pzT\tR5\\A\u0016ՓBli4&AĔʮc\u0010\u001dϻA<\\dթS\u0011\\\u0005<5dS^9*/\b?7,\u001bM13\u0011vZ=҇1\u0019TK͕\u001a1OG\u00073ŔCl9I)\t\u0007\u0019Ս\\[J0Ԧ\u0003w.{ºn$8F}c\u00adɓ\u001f:Wδ^GHl\u0012mp^f\u0007\u0012\u0015[^$9~)\u0007<D`ۊ\u0017ĢSrwۮ}X\\\u0003OCH\rmװ+ܰ\u0010|k˪k?\u0014BE=wxj՞}\u009cWA\u0006И8\"-\u0013\u00031-i\u001cw\"]ILlދ\u0018ȫ\u0006\u000f\u001bУ8\u00064]\u0003\u0007ZW\u0016Mg\u0002a\u0018Cbg\u0001\u0010!n=aAD\u0013\"Ьǜ\nʋpsvW\u0011\u001ftNn{tE^6))SH!s+c\u001fq8X?\u0016D\u001944N\b\u0011?F$\"9Gոϖ[á/?s,gR>o6\u007f%\u0019\u0004\u001dJV.5Iq\u001ePr+tlpzD\u001dA۫fé\u0010-,~\u0005ll6cCTr6d]8Oc˝\u0011Kx\t\nkWMq@`A37`\f&l϶\u0015\u0007Rdz(8iY\u000f\u000e\u0011D-tjm\u001e5n<m\u0013\u0019d\f\u001cаNݭ0\u0017\u0016ıG\\>JLuj+I|KAG=7YƬ\ns\u001f\u001b;\u0018_\u0002u<\u000f,\u0019\rm*\bˊ<ތ;x+˄'q!\ttmuGs\u007f?\f0{\u0001S$ަXւe0a7KQ\bn\u0011\u0018\u0018S<*\u0016w3\u007fsgv_6ЈBҕw]\fڏB8t{1\u007f=\u000b\u0002CDiF\n\u001b08ƁC˒\u0018\u001d\\@0gz \u0016_v5#D;[J\feѿ+ط\u001b\u0001(Qw|9bC\\=\u001au<A2:~ߴe:\u0012IF\u00198F}$b%\u0003p}So\u0010fU;OZ֖3ؒd\u007fh߷hAY;^6\u000b>$ڪd\u0089?ǃƔ]-̚\u0010\u0013\u000e\u0016<e/\u0004\u0004\u0011n\\cLU<YG@ 2_sǏ؈%͘)q\u0003IE\"\u007f&e;9U{\u0016)Qs+\u001dUOL\u0015/#\u0015\u0003+\\H\u0015~p߮dƼ\u0012KlЪ(F~\u00146\u0015\u0001B>!\u0017Zq/W߶!ߚY\u001bmۿJd=.rd{QeCjUQrOߐ\u0005¨@Èӳ\n\u001dҰ=:+s\u001bNV}\u000e2W\u001dM\u000eWf\u001bc` ]Io5O`\u0005X{>G\u001b}?bԍ3դ\n\u0019,߬\u007f\u0015oe08SXD0AHy4g\u07b2Dً\u0013z|ޛ~\u001eF1\u001e=4m9ɐ7ņcF4Ȩ\t\u000bM-xZzq}j\rY{J\u0002ܵ\u001b҅5q\u0019ˮ w\"Ni\\\u0007Tmϫ2Į\u0017\u000e\"ܮ>c\u0002)7I7WiOx\u000f%\u0001\u001f=LmFc(U\u0017jLxV>^kGI\u000e>qЫPС\rfxֳY\u0012hQ:\r\u0007Zx\u007f\u0019\u0001yIm\u05909ޑz)oʨR$g\u000baGuYXp&j\u0010\u0001K:4զ8Ɗs0\u0015\u0017\u000b*t_Tx\u0013;H\u0004\u001a\u001e\tՎ\\ޓ -b¨>\u0005\u0016\u001a&\f+\u000e\\ragiuM{#?y̏&҄[?O̖+\u0005\u001f-\u0016\u001f\u001ed\t`p\\S-Rݣ!ˬF{=Ζ͍s\u0005;ZwٜP\f\u001d1}o\u0017ߦ\u0011ܛ\u0011"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\"-\u0011wa\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0011eh9tr(]v|", "4ha@g\u001dBa\u001d{\u0002^\u0010\f\t7I\t'{S", "", "4ha@g\u001dBa\u001d{\u0002^\u0010\f\t7S}5\u0006G\b\u0001\u0018H}\u000eK", "uH8uI", ">qT3X;<V\u0007\u000e\bZ;|\u000bC", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001f+\u0015iaH\u0005f\u001a]\u0004#VLP@2", "uH8\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\u0005\u001cL\u0002_\u0015IXOR8,$Sn9\bc;Ly\u0015VYJ;\\T\u0007\u0013W\u0003", "-rR?b3E2\u0019\u0006\nZ\t|\u0018Ae\u007f1f<\u000f%\u0017U", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"-\u0011wa\u000f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "/mX:T;>A\u0017\f\u0005e3j\u00079p\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u0010'\u0019p]H\u0007Q*[\u0001.N:L6gRH", "/vP6g\u0013:g#\u000f\nF6{\r0i\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005GF\u001a\u0019wB=\u0014q;5r;Q\\]\u0014fQv>\u0018\u0012gc", "5dc\u000ej(Bb\u007fz\u000fh<\fp9d\u0004)\u007f@\u000eU\u0018Q\u007f\u0017;r49c\u0007\u001aDm\u001d.IQ;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}y'deHgg9\\\u0006\u000eC`X<k:|<\u0018\u0013^\u000e[\u0001", "0dh<a+\u001b])\byl\u0010\u0006\n9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;+v;QUM\tfb{<\"uc\u000fX\u0001", "5dc\u000fX@H\\\u0018[\u0005n5{\u0017\u0013n\u00012:A\u000b' Fk\u001d@\u0001./f}'7i$.", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0005\u0011}u \u0003w6^\u0006\u0004G`X5[/|M\u001d\u0011hqW,\u0017Z", "\nrTA \u0006\u0017", "", "1`] V9HZ [v\\2\u000f\u0005<d", "5dc\u0010T5,Q&\t\u0002e\tx\u00075w{5z", "u(I", "Adc\u0010T5,Q&\t\u0002e\tx\u00075w{5z", "uY\u0018#", "1`] V9HZ [v\\2\u000f\u0005<d>'{G\u0001\u0019\u0013Vo", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "1`] V9HZ _\u0005k>x\u0016.", "5dc\u0010T5,Q&\t\u0002e\r\u0007\u0016Aa\r'", "Adc\u0010T5,Q&\t\u0002e\r\u0007\u0016Aa\r'", "1`] V9HZ _\u0005k>x\u0016.$~(\u0003@\u0003\u0013&G", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "5dc\u0011X5LW(\u00139_6\r\u0012.a\u000f,\u0006Iz$\u0017No\nJv", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "5dc\u0013\\9Lb\n\u0003\tb)\u0004\t\u0013t\u007f0_I\u007f\u0017*", "u(8", "5dc\u0013\\9Lb\n\u0003\tb)\u0004\t\u0013t\u007f0i>\u000e!\u001eNY\u000f=\u0005%D", "6`b\u0019b6DO\u001c~v]\u0017x\u0017=O}&\fM\u000e\u0017\u0016", "5dc\u0015T:%]#\u0005va,x\b\u001aa\u000e6e>~'$To\rzw/Eb|\u001cFq 7GP;r4\u001a#h", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6Wd1WYL,2", "5dc\u0016a;>`\u0015|\nb6\u0006v9u\r&{", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~]\u0007/7z\u0012,\\GEt}\u0002\u001ewaF\u0003a;R\u000105V^9ZRH", "7mc2e5:Z|\b\n^9x\u0007>i\n1iJ\u0011$\u0015G", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "5dc\u0016a;>`\"z\u0002B5\f\t<a}7\u007fJ\n\u0005!W|\f<5&?i\u0007\u001f3|\u001a8V=Hk;\u001e\u0011va", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~]\u0007/7z\u0012,\\GEt}\u0006%w]6\u000ec\u0010W\u0006'THL;`\\{+\u001e\"g\fN\u0001", "7rB0e6EZ|\bek6~\u0016/s\u000e", "7sT:45B[\u0015\u000e\u0005k", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O(W0dN\u0002G!g", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001c\u001e\u0011vqF\u0007b\u0010]v/\u001d", "5dc\u0016g,F/\"\u0003\u0003Z;\u0007\u0016mf\n8\u0005?|&\u001bQx\bIv,5U\f ", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0005\u0011}u \u0003w6^\u0006\u000bVLV\beVz9#\u001cgc", ":`bAF*K] \u0006z]\tx\u00075w{5z", "5dc\u0019T:MA\u0017\f\u0005e3|\b\fa}.\u000e<\u000e\u0016", ":`bAF*K] \u0006z]\r\u0007\u0016Aa\r'", "5dc\u0019T:MA\u0017\f\u0005e3|\b\u0010o\r:wM\u007f", ":`h<h;\"\\\u001a\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001b\u001a)rqHjl-XL", "5dc\u0019T@Hc(b\u0004_6", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7|*bW\"oB-{duC\u0017r\u0010Ww1\u001d", ":`h<h;\"\\\u001a\thm(\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001c\u001e\u0011vqF\u0007P,\\\u0007.V\"", ";dP@h9>[\u0019\b\nL*\u0007\u0014/I\t9wG\u0005\u0016\u0013Vy\u001b", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005U1,\u0015ur5\u0004j,<t1RL25mNyA\u0013\u000ei\u0018[\u0001", "5dc\u001aX(Lc&~\u0003^5\fv-o\u000b(_I\u0012\u0013\u001eKn\nK\u00012|nq$Kt)@\fDE{=\u001d\u0011weC\u0010]9N}'CZN", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006^5DUz'7[%*\\C\u0011", "<dP?X:M@\u0015\b|^", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "5dc\u001bX(KS'\u000egZ5~\tmf\n8\u0005?|&\u001bQx\bIv,5U\f ul\u00165ME7z4", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001T\u0012Ca*?yC\f$dp9\\'\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001", "5dc\u001bX(KS'\u000egZ5~\tmf\n8\u0005?|&\u001bQx\bIv,5U\f ", "u(;8b;EW\"H\bZ5~\t=/c1\u000b-| \u0019GE", "<t\\\u001aX(Lc&~eZ:\u000b\t=", "5dc\u001bh4&S\u0015\r\u000bk,g\u0005=s\u007f6:A\u000b' Fk\u001d@\u0001./f}'7i$.", ">h];X+\"b\u0019\u0007\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;9z0PLM\u0010kRz$\u0018 ic", "5dc\u001d\\5GS\u0018b\n^4\u000bG0o\u00101z<\u0010\u001b!Pi\u001b<}%1g}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0005\u0011}u \u0003w6^\u0006\u0012KUW,[6\u0002=\u001cx^\u001c]\u0001", ">kP0X4>\\(lxh7|l8v{/\u007f?|&!T", "5dc\u001d_(<S!~\u0004m\u001az\u0013:ec1\r<\b\u001b\u0016C~\u0018I>:)]\u0012'J\u007fT/WSDj0-\u0019rj3\u0014c3Nr5G", ">nbA?6HY\u0015\u0002zZ+c\u0005Co\u00107_I\u0002!", "5dc\u001db:M:#\t\u0001Z/|\u0005.L{<\u0006P\u0010z HyL=\u00015>Xy/;w\u001f(ZCBk0,\u0015", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7|*bW\"oB-|h]G\u0017p,;v5WS]\u0002", ">qT3X;<V\u0007|\u0005i,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001f+\u0015iaH\u0005f\u001aL\u00012G\"", ">qT3X;<V\u0007\u000evm,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;9\u0004'HL]*_@\u00029#\u00120", "5dc\u001de,?S(|}L;x\u0018/$\u00012\fI\u007f\u0013&Ky\u00176\u0004%<Yy.7", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0005\u0011}u \u0003w6^\u0006\u0012TLO,kPu+#\u000ei\u000e$", ">qT3X;<V\u001d\b|>5x\u00066e~", "5dc\u001de,?S(|}b5~h8a|/{??\u0018!Wx\r8\u0006)?bw-7t\u0016*[C", "Adc\u001de,?S(|}b5~h8a|/{??\u0018!Wx\r8\u0006)?bw-7t\u0016*[C", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c%=Yy.Gz\u00166MLJA", "@d\\2T:N`\u0019\u0007zg;", "5dc\u001fX4>O'\u000f\b^4|\u0012>$\u00012\fI\u007f\u0013&Ky\u00176\u0004%<Yy.7", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\"Y\u0006 3{&;MK;tCs", "@d\\2T:N`\u0019\u0007zg;d\u0013.i\u0001,{M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c%=Yy.Gz\u00166MLJS>\u001d\u0019ie9\u00149", "5dc\u001fX4>O'\u000f\b^4|\u0012>M\n'\u007fA\u0005\u0017$\u0006p\u0018L\u007f$1h\u0002*@g#.TC7y4", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\"Y\u0006 3{&;MK;tC\u0006\u001fge:\u000bc9$", "Aba<_3\u001dS \u000ev;,\f\u001b/e\t\u0013wN\u000f\u0017%", "5dc V9HZ ]ze;xe/t\u0012({Ik\u0013%Uo\u001czw/Eb|\u001cFq 7GP;r4\u001a#h", "u(5", "Aba<_3)]'\u0003\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\"\u001c\"rh@qm:R\u0006+QU$", "Aba<_3-]u~Xh5\u000b\u00197e~", "5dc V9HZ m\u0005;,Z\u00138s\u00100{??\u0018!Wx\r8\u0006)?bw-7t\u0016*[C", "Aba<_3:P ~hm(\f\t", "/mX:T;>A\u0017\f\u0005e3k\u0013\u0013t\u007f0", "", "7mS2k", "Aba<_3(T\u001a\rzm", "uH8\u0019^6MZ\u001d\bD\\6\n\u0013?t\u00041{NJt!P~\u0012E\u0007!D]\b)\r1|3IT75;\u001a\u001ej+#\u0004h,L\u0006|", "/o_9l\u0014>O'\u000f\b^\u0019|\u0017?l\u000f", "@dbB_;", "7r;<b2B\\\u001bZ}^({", "Dhb6U3>7(~\u0003l\u001a\f\u0005Ce~\u0017~@n\u0013\u001fG", "/o_9l\u0014>O'\u000f\b^\u0019|\u0017?l\u000ff|J\u0011 \u0016C~\u0012F\u007f\u001fBY\u0005 3{\u0016", "2hb=T;<V\u0006z\r=,\u0004\u0018+", "2d[AT", "<nc6Y@)`\u0019\u007fzm*\u007fr8S}5\u0006G\b", "=mB0e6EZ", "2hbAT5<S", "=mB0e6EZW\u007f\u0005n5{\u0005>i\n1uM\u0001\u001e\u0017C}\u000e", "@d`BX:MA\u0017\f\u0005e3k\u0013\u0013t\u007f0", "Aba<_3", "Aba<_3)`\u001d\t\bb;\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\rEhy/7X#2WP?zHs", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn\u001di\r\u001cFm\u0001;QMHoC2jOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0004tn2S\u0011Bl\nU\u0014\u0018Bt\u0001QZ\u0019G\b^SK2wJbouVEOk\u007f(rd\u0019m6\u0004+\u0010z\u001bdRM3\nybf", "Aba<_3-]|\u000ezf", "AmP=G6\"b\u0019\u0007^g+|\u001c\u0013n\u000f(\tI|\u001e", "4na0X\u0019>[\u0019z\tn9|", "AmP=G6\"b\u0019\u0007^g+|\u001c\u0013n\u000f(\tI|\u001eUHy\u001eEu!D]\b)1z\u00165M?Ik", "CoS.g,,Q&\t\u0002e\u000b|\u0010>a`2\t+\u000b%&.y\u0018Br(5U|", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "CoS.g,,Q&\t\u0002e\u0017\u0007\u00173t\u00042\u0005$\u0002\u0006\u001aGP\u0012I\u00054\u0019h}()i$\u0016WT;j", "7sT:C9Hd\u001d}zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u0018-\u0015pLF\u0011t0Mv4\u001d", "4ha@g\u0010MS!b\u0004],\u0010", "CoS.g,,Q&\t\u0002e\u0017\u0007\u00173t\u00042\u0005$\u0002\u0006\u001aGP\u0012I\u00054\u0019h}()i$\u0016WT;jr\u001f\u001fxj8\u0003r0X\u007f!TLU,X`r", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyListState implements ScrollableState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<LazyListState, ?> Saver = ListSaverKt.listSaver(new Function2<SaverScope, LazyListState, List<? extends Integer>>() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final List<Integer> invoke(SaverScope saverScope, LazyListState lazyListState) {
            return CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(lazyListState.getFirstVisibleItemIndex()), Integer.valueOf(lazyListState.getFirstVisibleItemScrollOffset())});
        }
    }, new Function1<List<? extends Integer>, LazyListState>() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ LazyListState invoke(List<? extends Integer> list) {
            return invoke2((List<Integer>) list);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final LazyListState invoke2(List<Integer> list) {
            return new LazyListState(list.get(0).intValue(), list.get(1).intValue());
        }
    });
    private AnimationState<Float, AnimationVector1D> _scrollDeltaBetweenPasses;
    private final LazyListAnimateScrollScope animateScrollScope;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final MutableState canScrollBackward$delegate;
    private final MutableState canScrollForward$delegate;
    private boolean hasLookaheadPassOccurred;
    private final MutableInteractionSource internalInteractionSource;
    private final LazyLayoutItemAnimator<LazyListMeasuredItem> itemAnimator;
    private final MutableState<LazyListMeasureResult> layoutInfoState;
    private final MutableState<Unit> measurementScopeInvalidator;
    private int numMeasurePasses;
    private final LazyLayoutPinnedItemList pinnedItems;
    private final MutableState<Unit> placementScopeInvalidator;
    private LazyListMeasureResult postLookaheadLayoutInfo;
    private final LazyListPrefetchScope prefetchScope;
    private final LazyLayoutPrefetchState prefetchState;
    private final LazyListPrefetchStrategy prefetchStrategy;
    private boolean prefetchingEnabled;
    private Remeasurement remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final LazyListScrollPosition scrollPosition;
    private float scrollToBeConsumed;
    private final ScrollableState scrollableState;

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyListState$scroll$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LazyListState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\f\u0002\u001c\u001cQp\u0007!!t\u0013\u001e \u007f\"\u0010$\u0016", f = "\u0019-EC\u00151::\u00188$6&m*2", i = {0, 0, 0}, l = {388, 389}, m = "B3CA?@", n = {"c^kY", "bYtU^b2Y?IX3KS", "QbqI]"}, s = {"xQ^", "xQ_", "xQ`"})
    static final class C05021 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C05021(Continuation<? super C05021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return LazyListState.this.scroll(null, null, this);
        }
    }

    public LazyListState() {
        this(0, 0, null, 7, null);
    }

    public LazyListState(final int i2, int i3, LazyListPrefetchStrategy lazyListPrefetchStrategy) {
        this.prefetchStrategy = lazyListPrefetchStrategy;
        LazyListScrollPosition lazyListScrollPosition = new LazyListScrollPosition(i2, i3);
        this.scrollPosition = lazyListScrollPosition;
        this.animateScrollScope = new LazyListAnimateScrollScope(this);
        this.layoutInfoState = SnapshotStateKt.mutableStateOf(LazyListStateKt.EmptyLazyListMeasureResult, SnapshotStateKt.neverEqualPolicy());
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.scrollableState = ScrollableStateKt.ScrollableState(new Function1<Float, Float>() { // from class: androidx.compose.foundation.lazy.LazyListState$scrollableState$1
            {
                super(1);
            }

            public final Float invoke(float f2) {
                return Float.valueOf(-this.this$0.onScroll$foundation_release(-f2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Float invoke(Float f2) {
                return invoke(f2.floatValue());
            }
        });
        this.prefetchingEnabled = true;
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.LazyListState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                this.this$0.remeasurement = remeasurement;
            }
        };
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.itemAnimator = new LazyLayoutItemAnimator<>();
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.prefetchState = new LazyLayoutPrefetchState(lazyListPrefetchStrategy.getPrefetchScheduler(), new Function1<NestedPrefetchScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListState$prefetchState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(NestedPrefetchScope nestedPrefetchScope) {
                invoke2(nestedPrefetchScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(NestedPrefetchScope nestedPrefetchScope) {
                LazyListPrefetchStrategy lazyListPrefetchStrategy2 = this.this$0.prefetchStrategy;
                int i4 = i2;
                Snapshot.Companion companion = Snapshot.Companion;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                companion.restoreNonObservable(currentThreadSnapshot, companion.makeCurrentNonObservable(currentThreadSnapshot), currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null);
                lazyListPrefetchStrategy2.onNestedPrefetch(nestedPrefetchScope, i4);
            }
        });
        this.prefetchScope = new LazyListPrefetchScope() { // from class: androidx.compose.foundation.lazy.LazyListState$prefetchScope$1
            @Override // androidx.compose.foundation.lazy.LazyListPrefetchScope
            public LazyLayoutPrefetchState.PrefetchHandle schedulePrefetch(int i4) {
                Snapshot.Companion companion = Snapshot.Companion;
                LazyListState lazyListState = this.this$0;
                Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    long jM1126getChildConstraintsmsEJaDk = ((LazyListMeasureResult) lazyListState.layoutInfoState.getValue()).m1126getChildConstraintsmsEJaDk();
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    return this.this$0.getPrefetchState$foundation_release().m1190schedulePrefetch0kLqBqw(i4, jM1126getChildConstraintsmsEJaDk);
                } catch (Throwable th) {
                    companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
        };
        this.pinnedItems = new LazyLayoutPinnedItemList();
        lazyListScrollPosition.getNearestRangeState();
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m1195constructorimpl$default(null, 1, null);
        this.canScrollForward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.canScrollBackward$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.placementScopeInvalidator = ObservableScopeInvalidator.m1195constructorimpl$default(null, 1, null);
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        Float fValueOf = Float.valueOf(0.0f);
        this._scrollDeltaBetweenPasses = AnimationStateKt.AnimationState$default(vectorConverter, fValueOf, fValueOf, 0L, 0L, false, 56, null);
    }

    public /* synthetic */ LazyListState(int i2, int i3, LazyListPrefetchStrategy lazyListPrefetchStrategy, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 + 1) - (1 | i4) != 0 ? 0 : i2, (i4 + 2) - (2 | i4) != 0 ? 0 : i3, (-1) - (((-1) - i4) | ((-1) - 4)) != 0 ? LazyListPrefetchStrategyKt.LazyListPrefetchStrategy$default(0, 1, null) : lazyListPrefetchStrategy);
    }

    public /* synthetic */ LazyListState(int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i4) | ((-1) - 1)) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3);
    }

    public LazyListState(int i2, int i3) {
        this(i2, i3, LazyListPrefetchStrategyKt.LazyListPrefetchStrategy$default(0, 1, null));
    }

    public final boolean getHasLookaheadPassOccurred$foundation_release() {
        return this.hasLookaheadPassOccurred;
    }

    public final LazyListMeasureResult getPostLookaheadLayoutInfo$foundation_release() {
        return this.postLookaheadLayoutInfo;
    }

    public final int getFirstVisibleItemIndex() {
        return this.scrollPosition.getIndex();
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.scrollPosition.getScrollOffset();
    }

    public final LazyListLayoutInfo getLayoutInfo() {
        return this.layoutInfoState.getValue();
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final MutableInteractionSource getInternalInteractionSource$foundation_release() {
        return this.internalInteractionSource;
    }

    public final float getScrollToBeConsumed$foundation_release() {
        return this.scrollToBeConsumed;
    }

    public final Density getDensity$foundation_release() {
        return this.layoutInfoState.getValue().getDensity();
    }

    public final int getNumMeasurePasses$foundation_release() {
        return this.numMeasurePasses;
    }

    public final boolean getPrefetchingEnabled$foundation_release() {
        return this.prefetchingEnabled;
    }

    public final void setPrefetchingEnabled$foundation_release(boolean z2) {
        this.prefetchingEnabled = z2;
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

    public final LazyLayoutItemAnimator<LazyListMeasuredItem> getItemAnimator$foundation_release() {
        return this.itemAnimator;
    }

    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo$foundation_release() {
        return this.beyondBoundsInfo;
    }

    public final LazyLayoutPrefetchState getPrefetchState$foundation_release() {
        return this.prefetchState;
    }

    public final LazyLayoutPinnedItemList getPinnedItems$foundation_release() {
        return this.pinnedItems;
    }

    public final IntRange getNearestRange$foundation_release() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public static /* synthetic */ Object scrollToItem$default(LazyListState lazyListState, int i2, int i3, Continuation continuation, int i4, Object obj) {
        if ((i4 + 2) - (i4 | 2) != 0) {
            i3 = 0;
        }
        return lazyListState.scrollToItem(i2, i3, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyListState$scrollToItem$2, reason: invalid class name */
    /* JADX INFO: compiled from: LazyListState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\f\u0002\u001c\u001cQp\u0007!!t\u0013\u001e \u007f\"\u0010$\u0016U&\u0017'%#$\r)\u00040\"+bq", f = "\u0019-EC\u00151::\u00188$6&m*2", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
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
            return LazyListState.this.new AnonymousClass2(this.$index, this.$scrollOffset, continuation);
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
            LazyListState.this.snapToItemIndexInternal$foundation_release(this.$index, this.$scrollOffset, true);
            return Unit.INSTANCE;
        }
    }

    public final Object scrollToItem(int i2, int i3, Continuation<? super Unit> continuation) {
        Object objScroll$default = ScrollableState.scroll$default(this, null, new AnonymousClass2(i2, i3, null), continuation, 1, null);
        return objScroll$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll$default : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<Unit> m1135getMeasurementScopeInvalidatorzYiylxw$foundation_release() {
        return this.measurementScopeInvalidator;
    }

    public static /* synthetic */ void requestScrollToItem$default(LazyListState lazyListState, int i2, int i3, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i3 = 0;
        }
        lazyListState.requestScrollToItem(i2, i3);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1, reason: invalid class name */
    /* JADX INFO: compiled from: LazyListState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\f\u0002\u001c\u001cQp\u0007!!t\u0013\u001e \u007f\"\u0010$\u0016U%\u0019&+\u001c+-\r\u001e.,*+\u00140\u000b7)2iw", f = "\u0019-EC\u00151::\u00188$6&m*2", i = {}, l = {ExifDirectoryBase.TAG_EXTRA_SAMPLES}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LazyListState.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: LazyListState.kt */
        /* JADX INFO: loaded from: classes2.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\f\u0002\u001c\u001cQp\u0007!!t\u0013\u001e \u007f\"\u0010$\u0016U%\u0019&+\u001c+-\r\u001e.,*+\u00140\u000b7)2iwky", f = "\u0019-EC\u00151::\u00188$6&m*2", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class C00361 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
            int label;

            C00361(Continuation<? super C00361> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C00361(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
                return ((C00361) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ScrollableState.scroll$default(LazyListState.this, null, new C00361(null), this, 1, null) == coroutine_suspended) {
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
        snapToItemIndexInternal$foundation_release(i2, i3, false);
    }

    public final void snapToItemIndexInternal$foundation_release(int i2, int i3, boolean z2) {
        if (this.scrollPosition.getIndex() != i2 || this.scrollPosition.getScrollOffset() != i3) {
            this.itemAnimator.reset();
        }
        this.scrollPosition.requestPositionAndForgetLastKnownKey(i2, i3);
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

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object scroll(androidx.compose.foundation.MutatePriority r7, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.gestures.ScrollScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.lazy.LazyListState.C05021
            if (r0 == 0) goto L66
            r5 = r9
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r5 = (androidx.compose.foundation.lazy.LazyListState.C05021) r5
            int r0 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L66
            int r0 = r5.label
            int r0 = r0 - r2
            r5.label = r0
        L19:
            java.lang.Object r4 = r5.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 == r1) goto L45
            if (r0 != r2) goto L6c
            kotlin.ResultKt.throwOnFailure(r4)
        L2c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2f:
            kotlin.ResultKt.throwOnFailure(r4)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = r6.awaitLayoutModifier
            r5.L$0 = r6
            r5.L$1 = r7
            r5.L$2 = r8
            r5.label = r1
            java.lang.Object r0 = r0.waitForFirstLayout(r5)
            if (r0 != r3) goto L43
            return r3
        L43:
            r0 = r6
            goto L54
        L45:
            java.lang.Object r8 = r5.L$2
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r7 = r5.L$1
            androidx.compose.foundation.MutatePriority r7 = (androidx.compose.foundation.MutatePriority) r7
            java.lang.Object r0 = r5.L$0
            androidx.compose.foundation.lazy.LazyListState r0 = (androidx.compose.foundation.lazy.LazyListState) r0
            kotlin.ResultKt.throwOnFailure(r4)
        L54:
            androidx.compose.foundation.gestures.ScrollableState r1 = r0.scrollableState
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.label = r2
            java.lang.Object r0 = r1.scroll(r7, r8, r5)
            if (r0 != r3) goto L2c
            return r3
        L66:
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r5 = new androidx.compose.foundation.lazy.LazyListState$scroll$1
            r5.<init>(r9)
            goto L19
        L6c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.scroll(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float f2) {
        return this.scrollableState.dispatchRawDelta(f2);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
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

    /* JADX INFO: renamed from: getPlacementScopeInvalidator-zYiylxw$foundation_release, reason: not valid java name */
    public final MutableState<Unit> m1136getPlacementScopeInvalidatorzYiylxw$foundation_release() {
        return this.placementScopeInvalidator;
    }

    public final float onScroll$foundation_release(float f2) {
        if ((f2 < 0.0f && !getCanScrollForward()) || (f2 > 0.0f && !getCanScrollBackward())) {
            return 0.0f;
        }
        if (Math.abs(this.scrollToBeConsumed) > 0.5f) {
            throw new IllegalStateException(("entered drag with non-zero pending scroll: " + this.scrollToBeConsumed).toString());
        }
        float f3 = this.scrollToBeConsumed + f2;
        this.scrollToBeConsumed = f3;
        if (Math.abs(f3) > 0.5f) {
            LazyListMeasureResult value = this.layoutInfoState.getValue();
            float f4 = this.scrollToBeConsumed;
            int iRound = Math.round(f4);
            LazyListMeasureResult lazyListMeasureResult = this.postLookaheadLayoutInfo;
            boolean zTryToApplyScrollWithoutRemeasure = value.tryToApplyScrollWithoutRemeasure(iRound, !this.hasLookaheadPassOccurred);
            if (zTryToApplyScrollWithoutRemeasure && lazyListMeasureResult != null) {
                zTryToApplyScrollWithoutRemeasure = lazyListMeasureResult.tryToApplyScrollWithoutRemeasure(iRound, true);
            }
            if (zTryToApplyScrollWithoutRemeasure) {
                applyMeasureResult$foundation_release(value, this.hasLookaheadPassOccurred, true);
                ObservableScopeInvalidator.m1199invalidateScopeimpl(this.placementScopeInvalidator);
                notifyPrefetchOnScroll(f4 - this.scrollToBeConsumed, value);
            } else {
                Remeasurement remeasurement = this.remeasurement;
                if (remeasurement != null) {
                    remeasurement.forceRemeasure();
                }
                notifyPrefetchOnScroll(f4 - this.scrollToBeConsumed, getLayoutInfo());
            }
        }
        if (Math.abs(this.scrollToBeConsumed) <= 0.5f) {
            return f2;
        }
        float f5 = f2 - this.scrollToBeConsumed;
        this.scrollToBeConsumed = 0.0f;
        return f5;
    }

    private final void notifyPrefetchOnScroll(float f2, LazyListLayoutInfo lazyListLayoutInfo) {
        if (this.prefetchingEnabled) {
            this.prefetchStrategy.onScroll(this.prefetchScope, f2, lazyListLayoutInfo);
        }
    }

    public static /* synthetic */ Object animateScrollToItem$default(LazyListState lazyListState, int i2, int i3, Continuation continuation, int i4, Object obj) {
        if ((i4 + 2) - (i4 | 2) != 0) {
            i3 = 0;
        }
        return lazyListState.animateScrollToItem(i2, i3, continuation);
    }

    public final Object animateScrollToItem(int i2, int i3, Continuation<? super Unit> continuation) {
        Object objAnimateScrollToItem = LazyAnimateScrollKt.animateScrollToItem(this.animateScrollScope, i2, i3, 100, getDensity$foundation_release(), continuation);
        return objAnimateScrollToItem == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateScrollToItem : Unit.INSTANCE;
    }

    public static /* synthetic */ void applyMeasureResult$foundation_release$default(LazyListState lazyListState, LazyListMeasureResult lazyListMeasureResult, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            z3 = false;
        }
        lazyListState.applyMeasureResult$foundation_release(lazyListMeasureResult, z2, z3);
    }

    public final void applyMeasureResult$foundation_release(LazyListMeasureResult lazyListMeasureResult, boolean z2, boolean z3) {
        if (!z2 && this.hasLookaheadPassOccurred) {
            this.postLookaheadLayoutInfo = lazyListMeasureResult;
            return;
        }
        if (z2) {
            this.hasLookaheadPassOccurred = true;
        }
        setCanScrollBackward(lazyListMeasureResult.getCanScrollBackward());
        setCanScrollForward(lazyListMeasureResult.getCanScrollForward());
        this.scrollToBeConsumed -= lazyListMeasureResult.getConsumedScroll();
        this.layoutInfoState.setValue(lazyListMeasureResult);
        if (z3) {
            this.scrollPosition.updateScrollOffset(lazyListMeasureResult.getFirstVisibleItemScrollOffset());
        } else {
            this.scrollPosition.updateFromMeasureResult(lazyListMeasureResult);
            if (this.prefetchingEnabled) {
                this.prefetchStrategy.onVisibleItemsUpdated(this.prefetchScope, lazyListMeasureResult);
            }
        }
        if (z2) {
            updateScrollDeltaForPostLookahead(lazyListMeasureResult.getScrollBackAmount(), lazyListMeasureResult.getDensity(), lazyListMeasureResult.getCoroutineScope());
        }
        this.numMeasurePasses++;
    }

    public final float getScrollDeltaBetweenPasses$foundation_release() {
        return this._scrollDeltaBetweenPasses.getValue().floatValue();
    }

    private final void updateScrollDeltaForPostLookahead(float f2, Density density, CoroutineScope coroutineScope) {
        if (f2 <= density.mo710toPx0680j_4(LazyListStateKt.DeltaThresholdForScrollAnimation)) {
            return;
        }
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            float fFloatValue = this._scrollDeltaBetweenPasses.getValue().floatValue();
            if (this._scrollDeltaBetweenPasses.isRunning()) {
                this._scrollDeltaBetweenPasses = AnimationStateKt.copy$default((AnimationState) this._scrollDeltaBetweenPasses, fFloatValue - f2, 0.0f, 0L, 0L, false, 30, (Object) null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new LazyListState$updateScrollDeltaForPostLookahead$2$1(this, null), 3, null);
            } else {
                this._scrollDeltaBetweenPasses = new AnimationState<>(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Float.valueOf(-f2), null, 0L, 0L, false, 60, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new LazyListState$updateScrollDeltaForPostLookahead$2$2(this, null), 3, null);
            }
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    public final int updateScrollPositionIfTheFirstItemWasMoved$foundation_release(LazyListItemProvider lazyListItemProvider, int i2) {
        return this.scrollPosition.updateScrollPositionIfTheFirstItemWasMoved(lazyListItemProvider, i2);
    }

    /* JADX INFO: compiled from: LazyListState.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\tnjO0LeN.Xݾ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018kum\u0007Tj\rS\u000f4\u0019\tj2J\u0004z\u000e\u0016\u001d9Zom;\u0014nެ=`z?U9@#P\u0004\u0015\u0003**v\u0013\u0007zIL:\u0014ضDvBĥ%O\u000b\u001e \u000b̭$\u000b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\"-\u0011wawdm4Yr0KVW\u0002", "", "u(E", "!`e2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\"-\u0011wa\u000f", "5dc T=>`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005!FYy\u001d>m_\u001cIT;x\n", "A`e2e", ">qT3X;<V\u0007\u000e\bZ;|\u000bC", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001f+\u0015iaH\u0005f\u001a]\u0004#VLP@2", "A`e2ej?])\byZ;\u0001\u00138_\r(\u0003@|%\u0017", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<LazyListState, ?> getSaver() {
            return LazyListState.Saver;
        }

        public final Saver<LazyListState, ?> saver$foundation_release(final LazyListPrefetchStrategy lazyListPrefetchStrategy) {
            return ListSaverKt.listSaver(new Function2<SaverScope, LazyListState, List<? extends Integer>>() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$saver$3
                @Override // kotlin.jvm.functions.Function2
                public final List<Integer> invoke(SaverScope saverScope, LazyListState lazyListState) {
                    return CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(lazyListState.getFirstVisibleItemIndex()), Integer.valueOf(lazyListState.getFirstVisibleItemScrollOffset())});
                }
            }, new Function1<List<? extends Integer>, LazyListState>() { // from class: androidx.compose.foundation.lazy.LazyListState$Companion$saver$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ LazyListState invoke(List<? extends Integer> list) {
                    return invoke2((List<Integer>) list);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final LazyListState invoke2(List<Integer> list) {
                    return new LazyListState(list.get(0).intValue(), list.get(1).intValue(), lazyListPrefetchStrategy);
                }
            });
        }
    }
}
