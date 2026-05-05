package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: AndroidClipboardManager.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCC٥\"}0\u0015WNmgvJp\u000bKƤ\u000e\u0016\u000fj4կ]xs\u0012\u00172HoG3coEʠhtL\u0005(2(k\u0002\u0005\u0017\u001a2Ϻ\u0016v\u0011ŏ{\f@/\u0001§9b\u0013S\u0005(\u0012\u001e>N\u0002.bmNDJ\u0005]h23\u000boB\\+w2\u0013L;Kd/\u0013vo$CBM4C,c\u000b\rRiG\u001bA\b<3q7/1I\u0002aNZ\u0016\u0013C6_\u0015cr4h\u001dSv\u000bU8_iQP\u001c6\u0010z*\u0010L\f\u0014\u00065WF/0e6\u001eC|xSNa\u001a`X~)sF\u001f+\u007fA>Q\u001d|P\u0010O)T={\u0013\"6#/o1cZ\u000en+3V\u000eP_hPENN\u0018qUo\u001ao\u0011\u001bò\b0U\u001aw\u007f\u001f|/%e+\nC/\u0001\u001aHrhMݚlŞR֟˦G?̱r$?*\u0017+rFj yltZ2.[:%'\f\u0017+\"rvj1{ĲZұgȉԍL\\ܦ);nŽqpq.eZ~5;sq32r\u0005\u0014W<\u0011\u0006/ٯNϦ\u000bȗۛ'!ĘLx\u0018w\ncf\u000e\u0019VM\u000e<62V'zeb\u0011(ZC\u0013\b\u000ee?ɴ\u000bՁ70\u000bǭ<v\u000f'^\u0004\u0011qm!WUMz09YSK\u0018Tbxׂ@č'\u0013\u0007͞\u0018ImvUw\r\u0018{\u0002\nMf:GSG=A\u0012UȂ>Ɓ,զ˜qd˛Q /z\u000b\u0019'=n\\u$\u000br2\u0010xh t%(\u000f`\t\"6kVןmĸyòуS\nИBUzÅq>Th\u000b6? +3}UMU;K?\u001f,vB8k˜iˉnЃՙa\u000e֑xq\fϺ{\u0018u\u0017_\u0013R=>\u007fg6\u000f<2p\u001bD^i&\r\u0019ލ@٢7TIЬ\tX>\u0006\u0019h\u001eh\rf\u001b,'{H!\b}b16͏\u007f̎|жۤB$ݱQaom{jt\rPK\u0018'\u001c3tO*[ppeu!2\u001crFJ\u0018ݬnƀ@\u0015,҉D>\u000eIQ\u0014\n\b\u0016;\u000e\b0)%JZuQU<mOֻb߃\tlMǷ9,\u0007A\u001dv>z;u\u00133\u0017n=yJ\u0003i\u001c72Aʱ\u000bݝ)7LǴQ\u001d.\u001f\u000fRe_I\u0012\u0010\u007fTa7~\u0004q\"7F\u000fs´$ê=]\u0019٣\u000f2dUc0nf|^t ƌ\"2\u0007}\u0003ɼX8\u000e\u0013\u0019U\u0012Ơf}"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u001di\r\u001c4t\u0016\u001cX?DYC2\u001ch7", "", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "4n]AF0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "4n]AJ,BU\u001c\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "4n]AF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "4n]AF@Gb\u001c~\tb:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[*7\\F;y8,j", "4n]A9(FW \u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJOA", "4n]A9,:b)\fzL,\f\u00183n\u00026", "", ":dcAX9,^\u0015|~g.", "0`b2_0GS\u0007\u0002~_;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#Z\u001cEm\u001d2VC)n8\u001f$>", "BdgA:,H[\u0019\u000e\bb*k\u0016+n\u000e)\u0006M\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|w.WK;zA\"\u0013Wn5\u0010q-X\u0004/\u001d", ":nR._,%W'\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u0006,~@\b\u001e3t\u0016\u0015QQJA", "0`R8Z9Hc\"}", "BdgA7,<]&z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t.KMHgC\"\u001fq7", "AgP1b>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001fA\u007fk", "uI9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@&?b\ri\u0018w\u001f=?C?m7-jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#B.wS\u0001\u007f\u00125XoJ|\b\fkt1soO`\u0014F\r^sK1sPg_CWE\u000fq*w\u001b)\u001efCImt{\"*Vd7\u0019~S\u001fv`ONcP\u0018\bB(=\u0001%DOw`F\u0003'h[\u007fA!2k\u0004tu7\rCs\u0017n\u000eZH\u0014Fb\u007f)\u0002CF#72\u0006\u001a;Te?ZM\u001bl(c]rI1:\u0018rogG\"P[!c@km\u0001\u0001b\n\bXo(6\u0010\rQo\u0001\u0015Rc {ePG$Tn\u001dtE15w~\fe%&2\u0015P#\rr2jA[\u0013Rx<U\u000bYV$:V\u001f\u0002Rr%Fo7EZ\u0011S)3ZIzP2|\f\u001fB\u0002\u0015\f%IP>\u00035 /)<l\u0002`j7\u0016qa\"bw<e.-D\u0011\u001cDwm~p{\b\fd\u0004\u0015DBF\u0011\t&0f+;pU\t;m\u001c\u000e6U 9nt_R_=DJ\u0002\u001dI\u0012:\r\u001a\u001cu\u0015uZ.F\u001b-p\u0019\b\u0019s'8pgTW\u0015Z\u001drG[c{e7\u0010\u001a0F2%PJ+P6YKz\u001dAQkW\u00021bIOJ@\u00050(E\u001bO\ra\u000fhI$j\u0016\u0007\u0001hUx@Q#\b\u0005]NsXD#G-*~dO\u0003S~aj\n\u000e\u0002Yl", "5dc\u000fT*DU&\t\u000bg+DS.7y\u000e\u00010", "u(9", "Adc\u000fT*DU&\t\u000bg+D[)8K/\u0003\u001c", "uI\u0018#", "\u0018", "5dc\u000fT:>Z\u001d\bzL/\u0001\n>-O\u0016i@s{a", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i\u0014i$.TGDk\"!\u0019ip\u000f", "Adc\u000fT:>Z\u001d\bzL/\u0001\n>-y,\n?})z", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~WJ\u00069<YG|3{\u00165QL;Y7\"\u0016w7|w", "5dc\u0010b3H``Iy0&b\u000e\u001f", "Adc\u0010b3H``Qt1w\u0004\u0010\u000b", "5dc\u0013b5M4\u0015\u0007~e@", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u000fIK?rHs", "Adc\u0013b5M4\u0015\u0007~e@", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|v*UGB\u007f\na\u0006", "5dc\u0013b5M4\u0019z\nn9|v/t\u000f,\u0005B\u000f", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0013b5M4\u0019z\nn9|v/t\u000f,\u0005B\u000f", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0013b5MA\u001d\u0014z&\u001fjd\u0013It\b", "Adc\u0013b5MA\u001d\u0014z&siU\"_P2", "5dc\u0013b5MA(\u0013\u0002^sKo<2[y\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u001c\\WBk\n", "Adc\u0013b5MA(\u0013\u0002^s\u0005o4R\\t}", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|\u0004=aJ;Aw\u000f", "5dc\u0013b5MA-\b\na,\u000b\r=-t\u0014]%\u0006\b!", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u001caLJn4,\u0019v7", "Adc\u0013b5MA-\b\na,\u000b\r=-\u000f\u0007zPK\u0004e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|\u0004BVR>kB\"#>%*", "5dc\u0013b5ME\u0019\u0003|a;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av% MG=nCs", "Adc\u0013b5ME\u0019\u0003|a;", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|\b.QE>z\na\u0006", "5dc\u0019X;MS&l\u0006Z*\u0001\u00121-r\u0016W$d\fv", "Adc\u0019X;MS&l\u0006Z*\u0001\u00121-G\u0015H3zg!", "5dc\u0019b*:Z\u0019e~l;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.D`G\u0007Ak\u00125M*?yCs", "Adc\u0019b*:Z\u0019e~l;", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W@\u007f4<#d*5i\u001d.4GIz\na\u0006", "5dc [(=]+", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#k#3l @#", "Adc [(=]+", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~G\u0001\u001c6w(\u0004\u00114", "5dc!X?M2\u0019|\u0005k(\f\r9n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i&m)=,C9uA\u001a$lkB\\", "Adc!X?M2\u0019|\u0005k(\f\r9n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~WJ\u00069<YG\u000f7\u0001%\rMAEx0-\u0019rj\u000fJT", "5dc!X?M5\u0019\t\u0003^;\n\r-T\r$\u0005N\u0002!$O", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i&m)=/CEs4-\"l_(\u0014_5\\w1TT$", "Adc!X?M5\u0019\t\u0003^;\n\r-T\r$\u0005N\u0002!$O", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~WJ\u00069<YG\u000f7\u0001%\u0010MMCkC+\u0019fPF\u0003l:O\u00014O\"\u0012\u001d", "BnB=T5,b-\u0006z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9{Gr.#h\u0012'7C", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class MutableSpanStyle {
    private long background;
    private BaselineShift baselineShift;
    private long color;
    private FontFamily fontFamily;
    private String fontFeatureSettings;
    private long fontSize;
    private FontStyle fontStyle;
    private FontSynthesis fontSynthesis;
    private FontWeight fontWeight;
    private long letterSpacing;
    private LocaleList localeList;
    private Shadow shadow;
    private TextDecoration textDecoration;
    private TextGeometricTransform textGeometricTransform;

    public /* synthetic */ MutableSpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, fontWeight, fontStyle, fontSynthesis, fontFamily, str, j4, baselineShift, textGeometricTransform, localeList, j5, textDecoration, shadow);
    }

    private MutableSpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow) {
        this.color = j2;
        this.fontSize = j3;
        this.fontWeight = fontWeight;
        this.fontStyle = fontStyle;
        this.fontSynthesis = fontSynthesis;
        this.fontFamily = fontFamily;
        this.fontFeatureSettings = str;
        this.letterSpacing = j4;
        this.baselineShift = baselineShift;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j5;
        this.textDecoration = textDecoration;
        this.shadow = shadow;
    }

    public /* synthetic */ MutableSpanStyle(long j2, long j3, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String str, long j4, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j5, TextDecoration textDecoration, Shadow shadow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j2, (i2 + 2) - (i2 | 2) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j3, (i2 + 4) - (i2 | 4) != 0 ? null : fontWeight, (i2 & 8) != 0 ? null : fontStyle, (-1) - (((-1) - i2) | ((-1) - 16)) != 0 ? null : fontSynthesis, (i2 + 32) - (i2 | 32) != 0 ? null : fontFamily, (-1) - (((-1) - i2) | ((-1) - 64)) != 0 ? null : str, (-1) - (((-1) - i2) | ((-1) - 128)) != 0 ? TextUnit.Companion.m6842getUnspecifiedXSAIIZE() : j4, (i2 & 256) != 0 ? null : baselineShift, (i2 + 512) - (i2 | 512) != 0 ? null : textGeometricTransform, (i2 & 1024) != 0 ? null : localeList, (-1) - (((-1) - i2) | ((-1) - 2048)) != 0 ? Color.Companion.m4214getUnspecified0d7_KjU() : j5, (-1) - (((-1) - i2) | ((-1) - 4096)) != 0 ? null : textDecoration, (i2 + 8192) - (i2 | 8192) != 0 ? null : shadow, null);
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m5885getColor0d7_KjU() {
        return this.color;
    }

    /* JADX INFO: renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m5892setColor8_81llA(long j2) {
        this.color = j2;
    }

    /* JADX INFO: renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m5886getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    /* JADX INFO: renamed from: setFontSize--R2X_6o, reason: not valid java name */
    public final void m5893setFontSizeR2X_6o(long j2) {
        this.fontSize = j2;
    }

    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    public final void setFontWeight(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
    }

    /* JADX INFO: renamed from: getFontStyle-4Lr2A7w, reason: not valid java name */
    public final FontStyle m5887getFontStyle4Lr2A7w() {
        return this.fontStyle;
    }

    /* JADX INFO: renamed from: setFontStyle-mLjRB2g, reason: not valid java name */
    public final void m5894setFontStylemLjRB2g(FontStyle fontStyle) {
        this.fontStyle = fontStyle;
    }

    /* JADX INFO: renamed from: getFontSynthesis-ZQGJjVo, reason: not valid java name */
    public final FontSynthesis m5888getFontSynthesisZQGJjVo() {
        return this.fontSynthesis;
    }

    /* JADX INFO: renamed from: setFontSynthesis-tDdu0R4, reason: not valid java name */
    public final void m5895setFontSynthesistDdu0R4(FontSynthesis fontSynthesis) {
        this.fontSynthesis = fontSynthesis;
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final void setFontFamily(FontFamily fontFamily) {
        this.fontFamily = fontFamily;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    public final void setFontFeatureSettings(String str) {
        this.fontFeatureSettings = str;
    }

    /* JADX INFO: renamed from: getLetterSpacing-XSAIIZE, reason: not valid java name */
    public final long m5889getLetterSpacingXSAIIZE() {
        return this.letterSpacing;
    }

    /* JADX INFO: renamed from: setLetterSpacing--R2X_6o, reason: not valid java name */
    public final void m5896setLetterSpacingR2X_6o(long j2) {
        this.letterSpacing = j2;
    }

    /* JADX INFO: renamed from: getBaselineShift-5SSeXJ0, reason: not valid java name */
    public final BaselineShift m5884getBaselineShift5SSeXJ0() {
        return this.baselineShift;
    }

    /* JADX INFO: renamed from: setBaselineShift-_isdbwI, reason: not valid java name */
    public final void m5891setBaselineShift_isdbwI(BaselineShift baselineShift) {
        this.baselineShift = baselineShift;
    }

    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final void setTextGeometricTransform(TextGeometricTransform textGeometricTransform) {
        this.textGeometricTransform = textGeometricTransform;
    }

    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    public final void setLocaleList(LocaleList localeList) {
        this.localeList = localeList;
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m5883getBackground0d7_KjU() {
        return this.background;
    }

    /* JADX INFO: renamed from: setBackground-8_81llA, reason: not valid java name */
    public final void m5890setBackground8_81llA(long j2) {
        this.background = j2;
    }

    public final TextDecoration getTextDecoration() {
        return this.textDecoration;
    }

    public final void setTextDecoration(TextDecoration textDecoration) {
        this.textDecoration = textDecoration;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final void setShadow(Shadow shadow) {
        this.shadow = shadow;
    }

    public final SpanStyle toSpanStyle() {
        return new SpanStyle(this.color, this.fontSize, this.fontWeight, this.fontStyle, this.fontSynthesis, this.fontFamily, this.fontFeatureSettings, this.letterSpacing, this.baselineShift, this.textGeometricTransform, this.localeList, this.background, this.textDecoration, this.shadow, (PlatformSpanStyle) null, (DrawStyle) null, 49152, (DefaultConstructorMarker) null);
    }
}
