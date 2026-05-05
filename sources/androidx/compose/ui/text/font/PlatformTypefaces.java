package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: compiled from: PlatformTypefaces.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JgP.hS2\u000fq}<$i0yCAV\"}8\tWȞog\u0005Jb\u000bI\u0010\ft\u000f̓\\I\u0004w&2\u001d2Zom4}sK;xtd\bP60<\u0012\u0005/\u001fplȮuٙŲO\u000e\u00186Nw\u0003z\u001bU\u001d\u001a@\u0007n$\u000f'tg|@xpk<G#1lrR5cH|{\u0012\rxބ\fǸҐ\"-FBC!m\u000e\u0011\u0014j]U\u0002mrm\tv5?+w\u0003\b:f\u0010,\u0015YR=a\u00017t\u0005\u007fe<+9a{K~!X{\t\u0010%<2#LKЗ-Ʀբj\n\u0014I\u0003\n֘?O؟^M\b}gى3S~;-?:\u0015PŎ?1،;z"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~D\u0005\u001cFn ;U2Ov4\u001f\u0011faG\\", "", "1qT.g,\u001dS\u001az\u000be;", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0017\u0010K\u0001\u0018\u0013Eoc", "4n]AJ,BU\u001c\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "4n]AF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "1qT.g,\u001dS\u001az\u000be;Di\u00191g/m(", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|\b.QE>z\n\u0002XO]B\u0006p6RupIYJ7_VpK]\u0001n\u0019N,\t\u0003Y\u0017", "1qT.g,'O!~y", "<`\\2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~;})7z\u001a,.MDz\u0015\u001a\u001dlhM\\", "1qT.g,'O!~y&\u0019|\u0018\u0019ic*", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#_ @m#2K$EtC~\u0011pe@\u001b9\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\u001d\t#P$\u0002S\u0001 \u00125XK\u001cr\n\u001b\b\u000e9lsQ,s\u000b`\u0011~@6rJX){T=Pe.b\u001a)\fpE:%\u0010o\u0019p", "=oc6b5:Z\u0003\bY^=\u0001\u0007/F\n1\u000b!|\u001f\u001bN\u0004jP_!=Y", "4`\\6_@'O!~", "", "EdX4[;", "Ash9X", "D`a6T;B]\"lzm;\u0001\u00121s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F^\u0012;Q?Jo>'SVaH\u0016g5P\u0005|", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "=oc6b5:Z\u0003\bY^=\u0001\u0007/F\n1\u000b!|\u001f\u001bN\u0004jP_!=YEq\nL{\u007fT+", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b<\n\u0016$Qs\rO@#?a\t*Em_>Q\rJkG-^ikB\u0016-\rX\u007f69LR._aH!z\u000ec\r[5\u0011\u0004l\u000b\"xLB)\u0016,\u0013\u0012?2\u0010\f)\u001d~kzKeY(\u0004\u001e\u00052%uJUn}QJ\u0004P*s\u001bc&^H\u0010\u000b\u0010z\u0018(rT-Sy]\u001a\u0002R\u0003v1%#\u0004G$Q|1\n,k^;\u00021#JEy\u001f.cw/r;M#>Ad\u0006Ge\u0018\u0014", "Ch\u001cAX?MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface PlatformTypefaces {
    /* JADX INFO: renamed from: createDefault-FO1MlWM, reason: not valid java name */
    android.graphics.Typeface mo6260createDefaultFO1MlWM(FontWeight fontWeight, int i2);

    /* JADX INFO: renamed from: createNamed-RetOiIg, reason: not valid java name */
    android.graphics.Typeface mo6261createNamedRetOiIg(GenericFontFamily genericFontFamily, FontWeight fontWeight, int i2);

    /* JADX INFO: renamed from: optionalOnDeviceFontFamilyByName-78DK7lM, reason: not valid java name */
    android.graphics.Typeface mo6262optionalOnDeviceFontFamilyByName78DK7lM(String str, FontWeight fontWeight, int i2, FontVariation.Settings settings, Context context);
}
