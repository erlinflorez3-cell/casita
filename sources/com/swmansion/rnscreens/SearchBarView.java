package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import com.dynatrace.android.callback.Callback;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.ReactViewGroup;
import com.swmansion.rnscreens.ScreenStackHeaderSubview;
import com.swmansion.rnscreens.events.SearchBarBlurEvent;
import com.swmansion.rnscreens.events.SearchBarChangeTextEvent;
import com.swmansion.rnscreens.events.SearchBarCloseEvent;
import com.swmansion.rnscreens.events.SearchBarFocusEvent;
import com.swmansion.rnscreens.events.SearchBarOpenEvent;
import com.swmansion.rnscreens.events.SearchBarSearchButtonPressEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
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
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007fјnjO0LeN6ZS@\u000fs{:%c$\u007fICU \u0005*\teNogtMb\u000bQ\u001b\u000e\u0016~m4Ikxe\u0012\u00153JoU3UoCEhtD\u0005(2(H\u0002\u0005\u0017\u001a2H\u0016v\u0003Ca\f\u001a0Ft@W#˟5\u001a@\u0005v Yw\u001dt^<Vlu<E\"1jŌR'm2EQ\u001b\u0004l';5*\"9\u007fO5Cc\u001c\u0007\u0015\u0013s?1}:C\u0013*?'Y\b:W~f\u000eV-+}K\u000ev4 \u001dQ\u000f\u0010m+\u0018gY\u0015&(&9D\u0013JI&\u0006U\u0007t-bt\u0016TKt!\u0012pV\u0010&Z\u0002\u0011`d<m\u0010AsQ\u001b\u0015\u0010\u0012A'\u0018O}\u001b\fLHGnikbXx\u0015I\u0013(W?\u001bX?^M8~\u0004mL|pMB\u0004^\u000603\n]F\u0017S;$?1n\u0004\u0002v\u0003.\tMdv\"\u0002Rv~j\u0001$\u0007B\t:\u0019tl\u0013<hXh,\u0017NJ&M}P!./\u0010<Oc@R]<\u0002j{2P%wlE/\u0007k<\u0016\u007f^{C_:(a\u00015DCJ:\u001dX\u0015W\u001a\f+h6%JH\u0019\u0014NӾP«\u0010\u0013:ŭB4B1I\u0019\u000b\u001b\u001fҘ*նE\t\u0011ݠrj\u0016\u0006b;D\u0005o-\u0003\u0013Qhj{\bg'M\u0003ʐlĘ1MYځ1([.vA\u001d%\r\r\u0002\u000f\u0018{ZWdn,t\u0004\rVVpߜSȠA\u0017'\u0001/D\u0010@\u0016h\u0001yiO(&)\u0012PҿGÿ2u\u0010j~FxlPeb.Bxd\u000b1!5\u001c\b|^|]b\u0003 2ųU\u03a2\u0007gDNF\u0017\u001d!$A\u000f\u0007B~;JQ@m.\u00062G\u0015\u0010|@۷:ԃf\u001b.۩}\u00062\u0004$\u0011\u0003ScTI[\u001aq\rb:$\u001b(\u0019לv͎\fN\u0011ͩ%5Ngr\u0018v:S3='7\u001b:7\tXq9A\u001b4t\u0005ʁ,ϵG\u0002,`IQ\u001fz$u{\u001cc^!I=9a֍=ߎ\u0016\u001cEղ'op9H\u0006\"\u001c\rהGك\tH\u0011ӗL.B9\u0019Ptk\fB\t\u000f\u0017w\u001dJJB\"?-՜`ܢ`bPγxGfU8\u000e\u001f\u00119S\u0007D\u0002\u0011{|l/\u0012GWҸ\u001f͢\u001fjWƫ7A9{l;1'\u0007\u0016aԼiƀM\u0010>\u0004UC\u0006muDF/\u001d\u001fHQ)R\"-m1H`!T\u0013c;ʁ\u001e؉V\\*)\r\u0015\u0015\u0010BE\u001d\"9Qx,pFٴRR"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-(q\u0016@#", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001f@v7~F}\u001c5|\u00072MU\u001dx>. >", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\\u0019", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r}Av%.`R\u0011/%", "/qT\u0019\\:MS\"~\bl\u001a|\u0018", "", "/tc<6(IW(z\u0002bA|", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-(q\u0016@\f1;gA\u001c\u0018E]Fbs;XT#RP](cV\b=i", "5dc\u000eh;H1\u0015\n~m(\u0004\rDe", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*v!BW\u0001|3z\u00072MUyY4\u001a\"fd\u0016\u0003p\b^\u00061%HY0kNyA)\u00120", "Adc\u000eh;H1\u0015\n~m(\u0004\rDe", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{<r23\\Z\u001cD^\u001a._\u0002)k0+\u0013k>5\u0014?<]\u0001\u0005CWR;XYvR\u0014g\u001e~", "/tc<96<c'", "5dc\u000eh;H4#|\u000bl", "u(I", "Adc\u000eh;H4#|\u000bl", "uY\u0018#", "6dP1X9\u001c]\"\u007f~`", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sx.IB;x\u0012(\u001eie;\\", "5dc\u0015X(=S&\\\u0005g-\u0001\u000b", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007\u000eFi\u001440C7j4+rrj:\u000be\u0002", "6dP1X9\"Q#\bXh3\u0007\u0016", "", "5dc\u0015X(=S&bxh5Z\u00136o\r", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "Adc\u0015X(=S&bxh5Z\u00136o\r", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "6h]AG,Qbv\t\u0002h9", "5dc\u0015\\5MB\u0019\u0012\n<6\u0004\u0013<", "Adc\u0015\\5MB\u0019\u0012\n<6\u0004\u0013<", "7m_Bg\u001bR^\u0019", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-(q\u0016@\f1;gA\u001c\u0018E]Fjl7^\u0006\u0016[WN:2", "5dc\u0016a7Nb\b\u0013\u0006^", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*v!BW\u0001|3z\u00072MUyY4\u001a\"fd\u0016\u0003p\u0010W\u00027V;b7\\`H", "Adc\u0016a7Nb\b\u0013\u0006^", "uKR<`uLe!z\u0004l0\u0007\u0012xr\t6yM\u0001\u0017 U9{<r23\\Z\u001cD^\u001a._\u0002)k0+\u0013k>5\u0014G5Y\u000766`Y,j(6.", ">kP0X/HZ\u0018~\b", "", "5dc\u001d_(<S\u001c\t\u0002],\n", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u001d_(<S\u001c\t\u0002],\n", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "Aba2X5,b\u0015|\u0001?9x\u000b7e\t7", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\fIv%>G\r\u001c5sv;IECk=-j", "5dc V9>S\"l\nZ*\u0003i<a\u00020{I\u0010", "u(;0b4\ba+\u0007vg:\u0001\u00138/\r1\n>\u000e\u0017\u0017P}W*t25Y\u0007\u000eFi\u00144.P7m<\u001e\u001ew7", "AdP?V//W\u0019\u0011[h9\u0005\u0005>t\u007f5", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#8J\u0002 IN ;U?Jz4+j", "Ag^B_+(d\u0019\f\bb+|e+c\u0006\u0005\fO\u0010! ", "5dc [6NZ\u0018h\f^9\n\r.e\\$yF]'&Vy\u0017", "Adc [6NZ\u0018h\f^9\n\r.e\\$yF]'&Vy\u0017", "Ag^B_+,V#\u0011]b5\fv/a\r&~$~! ", "5dc [6NZ\u0018l}h>_\r8tm(wM~\u001azEy\u0017", "Adc [6NZ\u0018l}h>_\r8tm(wM~\u001azEy\u0017", "Ata3T*>7\u0018", "BdgA66E]&", "5dc!X?M1#\u0006\u0005k", "Adc!X?M1#\u0006\u0005k", "Bh]A66E]&", "5dc!\\5M1#\u0006\u0005k", "Adc!\\5M1#\u0006\u0005k", "6`]1_,\u001bZ)\f_l\u0019|\u0015?e\u000e7", "", "6`]1_,\u001cO\"|ze\u001a|\u0005<c\u0003\r\n-\u0001#'G}\u001d", "6`]1_,\u001cZ\u0019z\bM,\u0010\u0018\u0014sl(\bP\u0001%&", "6`]1_,\u001cZ#\rz", "6`]1_,\u001f]\u0017\u000f\t</x\u00121e", "6`b\u0013b*Na", "6`]1_,\u001f]\u0017\u000f\tC:i\t;u\u007f6\u000b", "6`]1_,(^\u0019\b", "6`]1_,,S(mzq;a\u0017\u001ce\f8{N\u0010", "BdgA", "6`]1_,-S,\u000eXa(\u0006\u000b/", "<df!X?M", "6`]1_,-S,\u000ehn)\u0005\r>", "6`]1_,-]\u001b\u0001\u0002^\nx\u0012-e\u0007\u0005\fO\u0010! ,}z<\u000355g\r", "4kP4", "=m0Ag(<V\u0019}ih\u001e\u0001\u0012.o\u0012", "=mD=W(MS", "Ad]18=>\\(", "3uT;g", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000e^CDz\n", "Adc X(KQ\u001co~^>c\r=t\u007f1{M\u000f", "AdP?V//W\u0019\u0011", "\u001a`]1e6BR,Hvi7z\u00137p{7ER\u0005\u0016\u0019G~W*v!BW\u0001\u0011;m(\u0004", "Adc X(KQ\u001co~^>g\u00169p\u000e", "Adc!b6EP\u0015\fZe,\u0005\t8t\u000e\u0019\u007fN\u0005\u0014\u001bNs\u001dP", "Dhb6U0EW(\u0013", "!dP?V/\u001bO&Z\u000bm6Z\u0005:i\u000f$\u0003D\u0016\u0017", "!dP?V/\u001bO&b\u0004i<\fwCp\u007f6", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SearchBarView extends ReactViewGroup {
    private boolean areListenersSet;
    private SearchBarAutoCapitalize autoCapitalize;
    private boolean autoFocus;
    private Integer headerIconColor;
    private Integer hintTextColor;
    private SearchBarInputTypes inputType;
    private String placeholder;
    private SearchViewFormatter searchViewFormatter;
    private boolean shouldOverrideBackButton;
    private boolean shouldShowHintSearchIcon;
    private final int surfaceId;
    private Integer textColor;
    private Integer tintColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\bGָّ\u000bDȐ/(<\u0014\b\u0007\u0015ʑg/\u0005jN.ʂW*\u001dkd4*\\\rqI=>\u001a\u0004%qOTk̐rO"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-(q\u0016@\f1;gA\u001c\u0018E]Fbs;XT#RP](cV\b=i", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001cN=\u0012", "%NA\u0011F", "!D=!8\u0015\u001c3\u0007", "\u0011G0\u001f4\n-3\u0006l", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class SearchBarAutoCapitalize {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SearchBarAutoCapitalize[] $VALUES;
        public static final SearchBarAutoCapitalize NONE = new SearchBarAutoCapitalize("NONE", 0);
        public static final SearchBarAutoCapitalize WORDS = new SearchBarAutoCapitalize("WORDS", 1);
        public static final SearchBarAutoCapitalize SENTENCES = new SearchBarAutoCapitalize("SENTENCES", 2);
        public static final SearchBarAutoCapitalize CHARACTERS = new SearchBarAutoCapitalize("CHARACTERS", 3);

        private static final /* synthetic */ SearchBarAutoCapitalize[] $values() {
            return new SearchBarAutoCapitalize[]{NONE, WORDS, SENTENCES, CHARACTERS};
        }

        static {
            SearchBarAutoCapitalize[] searchBarAutoCapitalizeArr$values = $values();
            $VALUES = searchBarAutoCapitalizeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(searchBarAutoCapitalizeArr$values);
        }

        private SearchBarAutoCapitalize(String str, int i2) {
        }

        public static EnumEntries<SearchBarAutoCapitalize> getEntries() {
            return $ENTRIES;
        }

        public static SearchBarAutoCapitalize valueOf(String str) {
            return (SearchBarAutoCapitalize) Enum.valueOf(SearchBarAutoCapitalize.class, str);
        }

        public static SearchBarAutoCapitalize[] values() {
            return (SearchBarAutoCapitalize[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eRLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007f\u0007lm?ӋǑe^\u008c\u0003Y:\u0011{{bř\n#2HAU۟\u0002\"\u0017O\u0017uuobZ9E?\n${\u0003,wY?\u0002z\u000f8GX?9SX=?g]6\u000b(ݮ&A"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-(q\u0016@\f1;gA\u001c\u0018E]Fjl7^\u0006\u0016[WN:2", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "Bn0;W9HW\u0018b\u0004i<\fwCp\u007f", "", "1`_6g(EW.~", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-(q\u0016@\f1;gA\u001c\u0018E]Fbs;XT#RP](cV\b=i", "\"DG!", "\u001eG>\u001b8", "\u001cT<\u000f8\u0019", "\u0013L0\u0016?", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class SearchBarInputTypes {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SearchBarInputTypes[] $VALUES;
        public static final SearchBarInputTypes TEXT = new TEXT("TEXT", 0);
        public static final SearchBarInputTypes PHONE = new PHONE("PHONE", 1);
        public static final SearchBarInputTypes NUMBER = new NUMBER("NUMBER", 2);
        public static final SearchBarInputTypes EMAIL = new EMAIL("EMAIL", 3);

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u0016DLш|\u0004O\f8é6B\u0015\"4ߚ}ҟe\u0001ˎ`D\u0014Gv`a*'k*5T_2s[;\u0004\u001dD6߄SR"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-(q\u0016@\f1;gA\u001c\u0018E]Fjl7^\u0006\u0016[WN:\u001b2Z\u0019wx0", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-(q\u0016@\f1;gA\u001c\u0018E]Fjl7^\u0006\u0016[WN:2", "Bn0;W9HW\u0018b\u0004i<\fwCp\u007f", "", "1`_6g(EW.~", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-(q\u0016@\f1;gA\u001c\u0018E]Fbs;XT#RP](cV\b=i", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        static final class EMAIL extends SearchBarInputTypes {
            EMAIL(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.swmansion.rnscreens.SearchBarView.SearchBarInputTypes
            public int toAndroidInputType(SearchBarAutoCapitalize capitalize) {
                Intrinsics.checkNotNullParameter(capitalize, "capitalize");
                return 32;
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u0016DLш|\u0004O\f8é6B\u0015\"4ߚ}ҟe\u0001ˎ`D\u0014Gv`a*'k*5T_2s[;\u0004\u001dD6߄SR"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-(q\u0016@\f1;gA\u001c\u0018E]Fjl7^\u0006\u0016[WN:\u001b;b%pqGc", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-(q\u0016@\f1;gA\u001c\u0018E]Fjl7^\u0006\u0016[WN:2", "Bn0;W9HW\u0018b\u0004i<\fwCp\u007f", "", "1`_6g(EW.~", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-(q\u0016@\f1;gA\u001c\u0018E]Fbs;XT#RP](cV\b=i", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        static final class NUMBER extends SearchBarInputTypes {
            NUMBER(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.swmansion.rnscreens.SearchBarView.SearchBarInputTypes
            public int toAndroidInputType(SearchBarAutoCapitalize capitalize) {
                Intrinsics.checkNotNullParameter(capitalize, "capitalize");
                return 2;
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u0016DLш|\u0004O\f8é6B\u0015\"4ߚ}ҟe\u0001ˎ`D\u0014Gv`a*'k*5T_2s[;\u0004\u001dD6߄SR"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-(q\u0016@\f1;gA\u001c\u0018E]Fjl7^\u0006\u0016[WN:\u001b=U'|q0", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-(q\u0016@\f1;gA\u001c\u0018E]Fjl7^\u0006\u0016[WN:2", "Bn0;W9HW\u0018b\u0004i<\fwCp\u007f", "", "1`_6g(EW.~", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-(q\u0016@\f1;gA\u001c\u0018E]Fbs;XT#RP](cV\b=i", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        static final class PHONE extends SearchBarInputTypes {
            PHONE(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.swmansion.rnscreens.SearchBarView.SearchBarInputTypes
            public int toAndroidInputType(SearchBarAutoCapitalize capitalize) {
                Intrinsics.checkNotNullParameter(capitalize, "capitalize");
                return 3;
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u0016DLш|\u0004O\f8é6B\u0015\"4ߚ}ҟe\u0001ˎ`D\u0014Gv`a*'k*5T_2s[;\u0004\u001dD6߄SR"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-(q\u0016@\f1;gA\u001c\u0018E]Fjl7^\u0006\u0016[WN:\u001bAR0\u0003g", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-(q\u0016@\f1;gA\u001c\u0018E]Fjl7^\u0006\u0016[WN:2", "Bn0;W9HW\u0018b\u0004i<\fwCp\u007f", "", "1`_6g(EW.~", "\u001ab^:\":P[\u0015\b\tb6\u0006R<n\u000e&\t@\u0001 %\u0011]\u000e8\u0004#86y-(q\u0016@\f1;gA\u001c\u0018E]Fbs;XT#RP](cV\b=i", "@dP0gsGO(\u0003\f^s\u000b\u0007<e\u007f1\n:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        static final class TEXT extends SearchBarInputTypes {

            @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SearchBarAutoCapitalize.values().length];
                    try {
                        iArr[SearchBarAutoCapitalize.NONE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SearchBarAutoCapitalize.WORDS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SearchBarAutoCapitalize.SENTENCES.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[SearchBarAutoCapitalize.CHARACTERS.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            TEXT(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.swmansion.rnscreens.SearchBarView.SearchBarInputTypes
            public int toAndroidInputType(SearchBarAutoCapitalize capitalize) {
                Intrinsics.checkNotNullParameter(capitalize, "capitalize");
                int i2 = WhenMappings.$EnumSwitchMapping$0[capitalize.ordinal()];
                if (i2 == 1) {
                    return 1;
                }
                if (i2 == 2) {
                    return 8192;
                }
                if (i2 == 3) {
                    return 16384;
                }
                if (i2 == 4) {
                    return 4096;
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        private static final /* synthetic */ SearchBarInputTypes[] $values() {
            return new SearchBarInputTypes[]{TEXT, PHONE, NUMBER, EMAIL};
        }

        static {
            SearchBarInputTypes[] searchBarInputTypesArr$values = $values();
            $VALUES = searchBarInputTypesArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(searchBarInputTypesArr$values);
        }

        private SearchBarInputTypes(String str, int i2) {
        }

        public /* synthetic */ SearchBarInputTypes(String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i2);
        }

        public static EnumEntries<SearchBarInputTypes> getEntries() {
            return $ENTRIES;
        }

        public static SearchBarInputTypes valueOf(String str) {
            return (SearchBarInputTypes) Enum.valueOf(SearchBarInputTypes.class, str);
        }

        public static SearchBarInputTypes[] values() {
            return (SearchBarInputTypes[]) $VALUES.clone();
        }

        public abstract int toAndroidInputType(SearchBarAutoCapitalize searchBarAutoCapitalize);
    }

    public SearchBarView(ReactContext reactContext) {
        super(reactContext);
        this.inputType = SearchBarInputTypes.TEXT;
        this.autoCapitalize = SearchBarAutoCapitalize.NONE;
        this.placeholder = "";
        this.shouldOverrideBackButton = true;
        this.shouldShowHintSearchIcon = true;
        this.surfaceId = UIManagerHelper.getSurfaceId(this);
    }

    private final ScreenStackHeaderConfig getHeaderConfig() {
        ViewParent parent = getParent();
        if (parent instanceof ScreenStackHeaderSubview) {
            return ((ScreenStackHeaderSubview) parent).getConfig();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScreenStackFragment getScreenStackFragment() {
        ScreenStackHeaderConfig headerConfig = getHeaderConfig();
        if (headerConfig != null) {
            return headerConfig.getScreenFragment();
        }
        return null;
    }

    private final void handleClose() {
        sendEvent(new SearchBarCloseEvent(this.surfaceId, getId()));
        setToolbarElementsVisibility(0);
    }

    private final void handleFocusChange(boolean z2) {
        sendEvent(z2 ? new SearchBarFocusEvent(this.surfaceId, getId()) : new SearchBarBlurEvent(this.surfaceId, getId()));
    }

    private final void handleOpen() {
        sendEvent(new SearchBarOpenEvent(this.surfaceId, getId()));
        setToolbarElementsVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTextChange(String str) {
        sendEvent(new SearchBarChangeTextEvent(this.surfaceId, getId(), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTextSubmit(String str) {
        sendEvent(new SearchBarSearchButtonPressEvent(this.surfaceId, getId(), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$2$setSearchViewListeners$-Landroidx-appcompat-widget-SearchView--V, reason: not valid java name */
    public static /* synthetic */ void m8766x3c07eb6b(SearchBarView searchBarView, View view) {
        Callback.onClick_enter(view);
        try {
            setSearchViewListeners$lambda$2(searchBarView, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    private final void sendEvent(Event<?> event) {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(event);
        }
    }

    private final void setSearchViewListeners(SearchView searchView) {
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: com.swmansion.rnscreens.SearchBarView.setSearchViewListeners.1
            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextChange(String str) {
                SearchBarView.this.handleTextChange(str);
                return true;
            }

            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextSubmit(String str) {
                SearchBarView.this.handleTextSubmit(str);
                return true;
            }
        });
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.swmansion.rnscreens.SearchBarView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                SearchBarView.setSearchViewListeners$lambda$0(this.f$0, view, z2);
            }
        });
        searchView.setOnCloseListener(new SearchView.OnCloseListener() { // from class: com.swmansion.rnscreens.SearchBarView$$ExternalSyntheticLambda1
            @Override // androidx.appcompat.widget.SearchView.OnCloseListener
            public final boolean onClose() {
                return SearchBarView.setSearchViewListeners$lambda$1(this.f$0);
            }
        });
        searchView.setOnSearchClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.SearchBarView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchBarView.m8766x3c07eb6b(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSearchViewListeners$lambda$0(SearchBarView this$0, View view, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handleFocusChange(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setSearchViewListeners$lambda$1(SearchBarView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handleClose();
        return false;
    }

    private static final void setSearchViewListeners$lambda$2(SearchBarView this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handleOpen();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSearchViewProps() throws Throwable {
        ScreenStackFragment screenStackFragment = getScreenStackFragment();
        CustomSearchView searchView = screenStackFragment != null ? screenStackFragment.getSearchView() : null;
        if (searchView != null) {
            if (!this.areListenersSet) {
                setSearchViewListeners(searchView);
                this.areListenersSet = true;
            }
            searchView.setInputType(this.inputType.toAndroidInputType(this.autoCapitalize));
            SearchViewFormatter searchViewFormatter = this.searchViewFormatter;
            if (searchViewFormatter != null) {
                searchViewFormatter.setTextColor(this.textColor);
            }
            SearchViewFormatter searchViewFormatter2 = this.searchViewFormatter;
            if (searchViewFormatter2 != null) {
                searchViewFormatter2.setTintColor(this.tintColor);
            }
            SearchViewFormatter searchViewFormatter3 = this.searchViewFormatter;
            if (searchViewFormatter3 != null) {
                searchViewFormatter3.setHeaderIconColor(this.headerIconColor);
            }
            SearchViewFormatter searchViewFormatter4 = this.searchViewFormatter;
            if (searchViewFormatter4 != null) {
                searchViewFormatter4.setHintTextColor(this.hintTextColor);
            }
            SearchViewFormatter searchViewFormatter5 = this.searchViewFormatter;
            if (searchViewFormatter5 != null) {
                searchViewFormatter5.setPlaceholder(this.placeholder, this.shouldShowHintSearchIcon);
            }
            searchView.setOverrideBackAction(this.shouldOverrideBackButton);
        }
    }

    private final void setToolbarElementsVisibility(int i2) {
        int i3 = 0;
        int configSubviewsCount = getHeaderConfig() != null ? r0.getConfigSubviewsCount() - 1 : 0;
        if (configSubviewsCount < 0) {
            return;
        }
        while (true) {
            ScreenStackHeaderConfig headerConfig = getHeaderConfig();
            ScreenStackHeaderSubview configSubview = headerConfig != null ? headerConfig.getConfigSubview(i3) : null;
            if ((configSubview != null ? configSubview.getType() : null) != ScreenStackHeaderSubview.Type.SEARCH_BAR && configSubview != null) {
                configSubview.setVisibility(i2);
            }
            if (i3 == configSubviewsCount) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final SearchBarAutoCapitalize getAutoCapitalize() {
        return this.autoCapitalize;
    }

    public final boolean getAutoFocus() {
        return this.autoFocus;
    }

    public final Integer getHeaderIconColor() {
        return this.headerIconColor;
    }

    public final Integer getHintTextColor() {
        return this.hintTextColor;
    }

    public final SearchBarInputTypes getInputType() {
        return this.inputType;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final boolean getShouldOverrideBackButton() {
        return this.shouldOverrideBackButton;
    }

    public final boolean getShouldShowHintSearchIcon() {
        return this.shouldShowHintSearchIcon;
    }

    public final Integer getTextColor() {
        return this.textColor;
    }

    public final Integer getTintColor() {
        return this.tintColor;
    }

    public final void handleBlurJsRequest() {
        CustomSearchView searchView;
        ScreenStackFragment screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.clearFocus();
    }

    public final void handleCancelSearchJsRequest() {
        CustomSearchView searchView;
        ScreenStackFragment screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.cancelSearch();
    }

    public final void handleClearTextJsRequest() {
        CustomSearchView searchView;
        ScreenStackFragment screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.clearText();
    }

    public final void handleFocusJsRequest() {
        CustomSearchView searchView;
        ScreenStackFragment screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.focus();
    }

    public final void handleSetTextJsRequest(String str) {
        ScreenStackFragment screenStackFragment;
        CustomSearchView searchView;
        if (str == null || (screenStackFragment = getScreenStackFragment()) == null || (searchView = screenStackFragment.getSearchView()) == null) {
            return;
        }
        searchView.setText(str);
    }

    public final void handleToggleCancelButtonJsRequest(boolean z2) {
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ScreenStackFragment screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null) {
            return;
        }
        screenStackFragment.setOnSearchViewCreate(new Function1<CustomSearchView, Unit>() { // from class: com.swmansion.rnscreens.SearchBarView.onAttachedToWindow.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CustomSearchView customSearchView) throws Throwable {
                invoke2(customSearchView);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CustomSearchView newSearchView) throws Throwable {
                ScreenStackFragment screenStackFragment2;
                CustomSearchView searchView;
                Intrinsics.checkNotNullParameter(newSearchView, "newSearchView");
                if (SearchBarView.this.searchViewFormatter == null) {
                    SearchBarView.this.searchViewFormatter = new SearchViewFormatter(newSearchView);
                }
                SearchBarView.this.setSearchViewProps();
                if (!SearchBarView.this.getAutoFocus() || (screenStackFragment2 = SearchBarView.this.getScreenStackFragment()) == null || (searchView = screenStackFragment2.getSearchView()) == null) {
                    return;
                }
                searchView.focus();
            }
        });
    }

    public final void onUpdate() throws Throwable {
        setSearchViewProps();
    }

    public final void setAutoCapitalize(SearchBarAutoCapitalize searchBarAutoCapitalize) {
        Intrinsics.checkNotNullParameter(searchBarAutoCapitalize, "<set-?>");
        this.autoCapitalize = searchBarAutoCapitalize;
    }

    public final void setAutoFocus(boolean z2) {
        this.autoFocus = z2;
    }

    public final void setHeaderIconColor(Integer num) {
        this.headerIconColor = num;
    }

    public final void setHintTextColor(Integer num) {
        this.hintTextColor = num;
    }

    public final void setInputType(SearchBarInputTypes searchBarInputTypes) {
        Intrinsics.checkNotNullParameter(searchBarInputTypes, "<set-?>");
        this.inputType = searchBarInputTypes;
    }

    public final void setPlaceholder(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.placeholder = str;
    }

    public final void setShouldOverrideBackButton(boolean z2) {
        this.shouldOverrideBackButton = z2;
    }

    public final void setShouldShowHintSearchIcon(boolean z2) {
        this.shouldShowHintSearchIcon = z2;
    }

    public final void setTextColor(Integer num) {
        this.textColor = num;
    }

    public final void setTintColor(Integer num) {
        this.tintColor = num;
    }
}
