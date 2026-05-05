package androidx.compose.ui.semantics;

import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:305)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яħ\u0014D57\u001eq\u007fR܀kt\nA\u000e0!.J~8,\u001aw\rgr9FDmH4R[*%k\u00044*[,qQY]\u001a\f.\u0011OTgon`Z\u0013C\u0015\u0006\u001exx,QU~]\u001a\u000fHBw?9Ow=Gi|6\u000b\":\"Ny\r\u0001 *P\u0010\rzKK\u0012\u00128@\u0007:Z\r[\u000b\"\u0012\fM(\u00014\\oN<Nt]P/+\u0003oBV'u0\u0005M\u0013P\\'#vi\u001e1B?5+%[\u0003\rRc?\u0011Dy=\u000bj-ޘ+_֕\b6\u0007~T\u001a1Oոar4\\Ufn\r?1_e[P<+&|ԫ\u0011B\f\u05fa\u001e)N2;\u001f7\u001d\u001c9\rxcB`\u0002\rI.|ˋ:\u001d-ĮK-?#tV2S'WO\u0002\u0015\u000f.#/xO]+זbڠ\u001fZ\u007f\u0383ISFHVSZtKy\u001c|r\n:\n@I\u0010/*\u001f\\$S9٦=))ǽ\u001aJJv\u0005\n1\u0001ayjNP$~\u0016e;7\u000e1զfʰoV\\АD\u0013S.b\fN\u001d!3t}L#5\u0010|c\u0017kҷQc\u0012ɘGh=n|p^lGtK;ae a\u0001\u000eBAםf\u000b`٨ZU\u0012rj-rGV\u0004(}\fF^\fA@msʬ829ǉt\u0017N\u001d,G\u0012\u0012\u0017zrn \u0001d3R\u001f\u0018&ڲ\r\u0007Xʔ\tqm\u0016W1Mu0KYWE\u001b6UP|b~ɠ\u000b\u0005{Ò_iRfZqf\u000bc\u001c8\u001c*;a/k4=\u0001Ȟ6\b5զdtks[\u0017w\u0010\u000b\u001d'Ax0w\b\u0019\u0015ZbʧNU\\ϟ:xd\u00181\r5!\b\b^\rWqd\u0017k@Yr1XLPH|3GLL/qݕ\u0001;5ξ?\u001f\u001c!\"4evk\u0014\b4\nd\u001f&#y2.І\u001aujГu4AcW^O\\0P\u0005\tRJzw6^76Cw\u001fаfވZB]\r5+t\u0007D\u000fv\u0005i?c\u0005\fcFe:uS}Brq'ݱQYoƚ\u0006Mb;X\u0014Z \nb\u0007\u0018,?0V\u0006~72Ӓw\u001e>\u05cdSd\u000bn\u0017)\u0005AJ;#Idk\u0016\u0010)\u0014taʸ\u001b8JƽSX\u0014\t\u0007a']\u0013\u0016]f1,\u0011~=OLz\u00985\u000buۮl1ih\u000fXm\u001e)\"g\u0005v';D\u0003UI*\u0092\u0005\u0011M؏[K\bn\u0012Ly\u0003y)$>(~-BFUgSμc|8͜#Wj\nr{b{`\u000b:/\u000f|\r\u000ej2=\rĢSxwۮENT5EHj\u0016%\u0003A\r\u001c~sFI;47ϦAOr̟?}]\u0013I\u0003X5.g\u001cz1^g\u000e\u0015\u001e\f\u001dƐ\u001aw\u001eȈ\u001a\u000b\u0019\u0012.\t~_\u00035\"4\u00188_\u0002aEA`̲o})̸?-rJPP9\u000e\u0018)\u0005i~W\u001b\u0003\u0015w\u0005{ӊ1V%Ԕ?O4Zf_\u000b&ahp\u0017\u0010\u0016%&MJ6dЍ\u0014Uk֬\tmU%\u001b0\u007f\u00018,I6b \u000e\u001f(\u00122,ķ,\u001bCۮe@jTjq\u0013l\u001c+\u0003.tv\u001c)B\u000b-Jր\u0015\u0019<И\u000b j|E\u001eop\u001b\u0016x\r\u0014GY&O?\u0001Aװ;8\u0013 @x\u0017RHgE\u001b8\u0013!~\u0010o<3VVM\u001aUpRz\u0013\u0005ΜOK@܂ .\u0017_\u001f4+M.\u0011t ,=a3ol?\u0003ͤ<\fwޞ17p&a*z\u0016\u000bV%E\n3{:\"N!%˧\u0013u#ʰ~=+\fsQw!\u0010=b\u0005]ef\u000f\u0010\u0005w7¹\"\u007f]ʮ\u0018\f%}2\u000bF8\u000e IN:al@\u0005O\u0006\u0006ڲ.<vޏ;IrU\u0002\u000f|~&Q|aq6QzB:r@Ѓ1r\u000fŵej\u007fiR\u0012Ӟ\u0018\u0017"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015up=\u0007q\u0002", "", "u(E", "\u0011n[9X*MW#\b^g-\u0007", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMlc@$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~7\b'>m\u0014=QMDO=\u001f\u001f>", "5dc\u0010b3ES\u0017\u000e~h5`\u00120o", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`%Gw\nE\u0006)3gG\u000e7u\u00127\\G9y\u001f+\u001fsaF\u0016w\u0012N\u000b|", "\u0011n[9X*MW#\b^m,\u0005l8f\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~7\b'>m\u0014=QMDOC\u001e\u001dLj:\u00119", "5dc\u0010b3ES\u0017\u000e~h5`\u0018/mc1|J", "\u0011n]AX5M2\u0015\u000evM@\b\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0013c\u0007/7v%\rIR7ZH)\u0015>", "5dc\u0010b5MS\"\u000eYZ;xwCp\u007ff\fDz$\u0017No\nJv", "\u0011n]AX5M2\u0019\rxk0\b\u00183o\t", "", "", "5dc\u0010b5MS\"\u000eY^:z\u00163p\u000f,\u0006I", "\u0011n]AX5MB-\nz", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0013c\u0007/7v%\u001daN;A", "5dc\u0010b5MS\"\u000eir7|G?iy5{G\u0001\u0013%G", "\u0012hb.U3>R", "", "5dc\u0011\\::P ~y", "\u0013cXAT)ES\b~\u000em", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "5dc\u0012W0MO\u0016\u0006zM,\u0010\u0018", "\u0013qa<e", "5dc\u0012e9H`", "\u0014nRBf,=", "", "5dc\u0013b*Na\u0019}", "\u0016dP1\\5@", "5dc\u0015X(=W\"\u0001", "\u0016na6m6Gb\u0015\u0006h\\9\u0007\u00106A\u0013,\n-| \u0019G", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G{-At\u001d\n`GIX0'\u0017h7", "5dc\u0015b9Bh#\b\nZ3j\u0007<o\u0007/WS\u0005%\u0004Cx\u0010<", "\u0017lT\u000eV;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7I\u0014=QMDA", "5dc\u0016`,\u001aQ(\u0003\u0005g", "\u0017mS2k\rH`~~\u000f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "5dc\u0016a+>fy\t\bD,\u0011", "\u0017me6f0;Z\u0019m\u0005N:|\u0016", "5dc\u0016a=Ba\u001d{\u0002^\u001b\u0007x=e\r", "\u0017r2<a;:W\"~\b", "5dc\u0016f\nH\\(z~g,\nG+n\t2\u000b<\u0010\u001b!P}", "5dc\u0016f\nH\\(z~g,\n", "\u0017r36T3HU", "5dc\u0016f\u000bBO \t|", "\u0017r41\\;:P ~", "5dc\u0016f\f=W(zwe,", "\u0017r?<c<I", "5dc\u0016f\u0017H^)\n", "\u0017rB5b>B\\\u001bmzq;j\u0019,s\u000f,\u000bP\u0010\u001b!P", "5dc\u0016f\u001aA]+\u0003\u0004`\u001b|\u001c>S\u0010%\nO\u0005&'Vs\u0018E", "\u0017rC?T=>`'z\u0002@9\u0007\u0019:", "5dc\u0016f\u001bKO*~\bl(\u0004j<o\u00103", "\u001ahe2E,@W#\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~@\u000217Z\u00160QMDS>\u001d\u0015>", "5dc\u0019\\=>@\u0019\u0001~h5", "\u001b`g!X?M:\u0019\b|m/", "5dc\u001aT?-S,\u000ea^5~\u00182", "\u001e`]2G0MZ\u0019", "5dc\u001dT5>B\u001d\u000e\u0002^", "\u001e`b@j6KR", "5dc\u001dT:Le#\fy", "\u001eq^4e,Lauz\bK(\u0006\u000b/I\t)\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~D\u000b*9z\u0016<[ 7x!\u001a\u001eja\u001d\u0010d6$", "5dc\u001de6@`\u0019\r\t;(\nu+n\u0002(_I\u0002!", " n[2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~F\b'7C", "5dc\u001fb3>", "!d[2V;:P ~\\k6\r\u0014", "5dc X3>Q(zwe,^\u00169u\u000b", "!d[2V;>R", "5dc X3>Q(~y", "!sPAX\u000b>a\u0017\f~i;\u0001\u00138", "5dc g(MSw~\t\\9\u0001\u0014>i\n1", "\"dbAG(@", "5dc!X:MB\u0015\u0001", "\"dgA", "5dc!X?M", "\"dgAF,ES\u0017\u000e~h5i\u00058g\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "5dc!X?MA\u0019\u0006z\\;\u0001\u00138R{1}@", "\"dgAF<;a(\u0003\nn;\u0001\u00138", "5dc!X?MA){\tm0\f\u0019>i\n1", "\"nV4_,:P ~hm(\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f&\u0013VoW+\u0001'7`}\u001c4t\u0016\u001c\\?Jk\n", "5dc!b.@Z\u0019zwe,j\u0018+t\u007f", "\"qPCX9LO b\u0004],\u0010", "", "5dc!e(OS&\rve\u0010\u0006\b/x", "$daA\\*:Z\u0007|\bh3\u0004dBi\u000e\u0015wI\u0003\u0017", "5dc#X9MW\u0017z\u0002L*\n\u00136l[;\u007fNm\u0013 Io", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SemanticsProperties {
    public static final SemanticsProperties INSTANCE = new SemanticsProperties();
    private static final SemanticsPropertyKey<List<String>> ContentDescription = SemanticsPropertiesKt.AccessibilityKey("ContentDescription", new Function2<List<? extends String>, List<? extends String>, List<? extends String>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
            return invoke2((List<String>) list, (List<String>) list2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<String> invoke2(List<String> list, List<String> list2) {
            List<String> mutableList;
            if (list == null || (mutableList = CollectionsKt.toMutableList((Collection) list)) == null) {
                return list2;
            }
            mutableList.addAll(list2);
            return mutableList;
        }
    });
    private static final SemanticsPropertyKey<String> StateDescription = SemanticsPropertiesKt.AccessibilityKey("StateDescription");
    private static final SemanticsPropertyKey<ProgressBarRangeInfo> ProgressBarRangeInfo = SemanticsPropertiesKt.AccessibilityKey("ProgressBarRangeInfo");
    private static final SemanticsPropertyKey<String> PaneTitle = SemanticsPropertiesKt.AccessibilityKey("PaneTitle", new Function2<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$PaneTitle$1
        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    });
    private static final SemanticsPropertyKey<Unit> SelectableGroup = SemanticsPropertiesKt.AccessibilityKey("SelectableGroup");
    private static final SemanticsPropertyKey<CollectionInfo> CollectionInfo = SemanticsPropertiesKt.AccessibilityKey("CollectionInfo");
    private static final SemanticsPropertyKey<CollectionItemInfo> CollectionItemInfo = SemanticsPropertiesKt.AccessibilityKey("CollectionItemInfo");
    private static final SemanticsPropertyKey<Unit> Heading = SemanticsPropertiesKt.AccessibilityKey("Heading");
    private static final SemanticsPropertyKey<Unit> Disabled = SemanticsPropertiesKt.AccessibilityKey("Disabled");
    private static final SemanticsPropertyKey<LiveRegionMode> LiveRegion = SemanticsPropertiesKt.AccessibilityKey("LiveRegion");
    private static final SemanticsPropertyKey<Boolean> Focused = SemanticsPropertiesKt.AccessibilityKey("Focused");
    private static final SemanticsPropertyKey<Boolean> IsTraversalGroup = SemanticsPropertiesKt.AccessibilityKey("IsTraversalGroup");
    private static final SemanticsPropertyKey<Unit> InvisibleToUser = new SemanticsPropertyKey<>("InvisibleToUser", new Function2<Unit, Unit, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$InvisibleToUser$1
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    });
    private static final SemanticsPropertyKey<ContentType> ContentType = new SemanticsPropertyKey<>("ContentType", new Function2<ContentType, ContentType, ContentType>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentType$1
        @Override // kotlin.jvm.functions.Function2
        public final ContentType invoke(ContentType contentType, ContentType contentType2) {
            return contentType;
        }
    });
    private static final SemanticsPropertyKey<ContentDataType> ContentDataType = new SemanticsPropertyKey<>("ContentDataType", new Function2<ContentDataType, ContentDataType, ContentDataType>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDataType$1
        /* JADX INFO: renamed from: invoke-x33U9Dw, reason: not valid java name */
        public final ContentDataType m5945invokex33U9Dw(ContentDataType contentDataType, int i2) {
            return contentDataType;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ ContentDataType invoke(ContentDataType contentDataType, ContentDataType contentDataType2) {
            return m5945invokex33U9Dw(contentDataType, contentDataType2.m3801unboximpl());
        }
    });
    private static final SemanticsPropertyKey<Float> TraversalIndex = SemanticsPropertiesKt.AccessibilityKey("TraversalIndex", new Function2<Float, Float, Float>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TraversalIndex$1
        public final Float invoke(Float f2, float f3) {
            return f2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Float invoke(Float f2, Float f3) {
            return invoke(f2, f3.floatValue());
        }
    });
    private static final SemanticsPropertyKey<ScrollAxisRange> HorizontalScrollAxisRange = SemanticsPropertiesKt.AccessibilityKey("HorizontalScrollAxisRange");
    private static final SemanticsPropertyKey<ScrollAxisRange> VerticalScrollAxisRange = SemanticsPropertiesKt.AccessibilityKey("VerticalScrollAxisRange");
    private static final SemanticsPropertyKey<Unit> IsPopup = SemanticsPropertiesKt.AccessibilityKey("IsPopup", new Function2<Unit, Unit, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Unit unit, Unit unit2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    });
    private static final SemanticsPropertyKey<Unit> IsDialog = SemanticsPropertiesKt.AccessibilityKey("IsDialog", new Function2<Unit, Unit, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsDialog$1
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Unit unit, Unit unit2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    });
    private static final SemanticsPropertyKey<Role> Role = SemanticsPropertiesKt.AccessibilityKey("Role", new Function2<Role, Role, Role>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Role$1
        /* JADX INFO: renamed from: invoke-qtA-w6s, reason: not valid java name */
        public final Role m5946invokeqtAw6s(Role role, int i2) {
            return role;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Role invoke(Role role, Role role2) {
            return m5946invokeqtAw6s(role, role2.m5932unboximpl());
        }
    });
    private static final SemanticsPropertyKey<String> TestTag = new SemanticsPropertyKey<>("TestTag", false, new Function2<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1
        @Override // kotlin.jvm.functions.Function2
        public final String invoke(String str, String str2) {
            return str;
        }
    });
    private static final SemanticsPropertyKey<List<AnnotatedString>> Text = SemanticsPropertiesKt.AccessibilityKey("Text", new Function2<List<? extends AnnotatedString>, List<? extends AnnotatedString>, List<? extends AnnotatedString>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Text$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ List<? extends AnnotatedString> invoke(List<? extends AnnotatedString> list, List<? extends AnnotatedString> list2) {
            return invoke2((List<AnnotatedString>) list, (List<AnnotatedString>) list2);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<AnnotatedString> invoke2(List<AnnotatedString> list, List<AnnotatedString> list2) {
            List<AnnotatedString> mutableList;
            if (list == null || (mutableList = CollectionsKt.toMutableList((Collection) list)) == null) {
                return list2;
            }
            mutableList.addAll(list2);
            return mutableList;
        }
    });
    private static final SemanticsPropertyKey<AnnotatedString> TextSubstitution = new SemanticsPropertyKey<>("TextSubstitution", null, 2, null);
    private static final SemanticsPropertyKey<Boolean> IsShowingTextSubstitution = new SemanticsPropertyKey<>("IsShowingTextSubstitution", null, 2, null);
    private static final SemanticsPropertyKey<AnnotatedString> EditableText = SemanticsPropertiesKt.AccessibilityKey("EditableText");
    private static final SemanticsPropertyKey<TextRange> TextSelectionRange = SemanticsPropertiesKt.AccessibilityKey("TextSelectionRange");
    private static final SemanticsPropertyKey<ImeAction> ImeAction = SemanticsPropertiesKt.AccessibilityKey("ImeAction");
    private static final SemanticsPropertyKey<Boolean> Selected = SemanticsPropertiesKt.AccessibilityKey("Selected");
    private static final SemanticsPropertyKey<ToggleableState> ToggleableState = SemanticsPropertiesKt.AccessibilityKey("ToggleableState");
    private static final SemanticsPropertyKey<Unit> Password = SemanticsPropertiesKt.AccessibilityKey("Password");
    private static final SemanticsPropertyKey<String> Error = SemanticsPropertiesKt.AccessibilityKey("Error");
    private static final SemanticsPropertyKey<Function1<Object, Integer>> IndexForKey = new SemanticsPropertyKey<>("IndexForKey", null, 2, null);
    private static final SemanticsPropertyKey<Boolean> IsEditable = new SemanticsPropertyKey<>("IsEditable", null, 2, null);
    private static final SemanticsPropertyKey<Integer> MaxTextLength = new SemanticsPropertyKey<>("MaxTextLength", null, 2, null);
    public static final int $stable = 8;

    @Deprecated(message = "\u0018Y\u0001tq}(KjH>\u007fb(-ZC^\u0018<\u0015hK[\u0005Y\u0003oOxq", replaceWith = @ReplaceWith(expression = "IsTraversalGroup", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getIsContainer$annotations() {
    }

    private SemanticsProperties() {
    }

    public final SemanticsPropertyKey<List<String>> getContentDescription() {
        return ContentDescription;
    }

    public final SemanticsPropertyKey<String> getStateDescription() {
        return StateDescription;
    }

    public final SemanticsPropertyKey<ProgressBarRangeInfo> getProgressBarRangeInfo() {
        return ProgressBarRangeInfo;
    }

    public final SemanticsPropertyKey<String> getPaneTitle() {
        return PaneTitle;
    }

    public final SemanticsPropertyKey<Unit> getSelectableGroup() {
        return SelectableGroup;
    }

    public final SemanticsPropertyKey<CollectionInfo> getCollectionInfo() {
        return CollectionInfo;
    }

    public final SemanticsPropertyKey<CollectionItemInfo> getCollectionItemInfo() {
        return CollectionItemInfo;
    }

    public final SemanticsPropertyKey<Unit> getHeading() {
        return Heading;
    }

    public final SemanticsPropertyKey<Unit> getDisabled() {
        return Disabled;
    }

    public final SemanticsPropertyKey<LiveRegionMode> getLiveRegion() {
        return LiveRegion;
    }

    public final SemanticsPropertyKey<Boolean> getFocused() {
        return Focused;
    }

    public final SemanticsPropertyKey<Boolean> getIsContainer() {
        return IsTraversalGroup;
    }

    public final SemanticsPropertyKey<Boolean> getIsTraversalGroup() {
        return IsTraversalGroup;
    }

    public final SemanticsPropertyKey<Unit> getInvisibleToUser() {
        return InvisibleToUser;
    }

    public final SemanticsPropertyKey<ContentType> getContentType$ui_release() {
        return ContentType;
    }

    public final SemanticsPropertyKey<ContentDataType> getContentDataType$ui_release() {
        return ContentDataType;
    }

    public final SemanticsPropertyKey<Float> getTraversalIndex() {
        return TraversalIndex;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> getHorizontalScrollAxisRange() {
        return HorizontalScrollAxisRange;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> getVerticalScrollAxisRange() {
        return VerticalScrollAxisRange;
    }

    public final SemanticsPropertyKey<Unit> getIsPopup() {
        return IsPopup;
    }

    public final SemanticsPropertyKey<Unit> getIsDialog() {
        return IsDialog;
    }

    public final SemanticsPropertyKey<Role> getRole() {
        return Role;
    }

    public final SemanticsPropertyKey<String> getTestTag() {
        return TestTag;
    }

    public final SemanticsPropertyKey<List<AnnotatedString>> getText() {
        return Text;
    }

    public final SemanticsPropertyKey<AnnotatedString> getTextSubstitution() {
        return TextSubstitution;
    }

    public final SemanticsPropertyKey<Boolean> getIsShowingTextSubstitution() {
        return IsShowingTextSubstitution;
    }

    public final SemanticsPropertyKey<AnnotatedString> getEditableText() {
        return EditableText;
    }

    public final SemanticsPropertyKey<TextRange> getTextSelectionRange() {
        return TextSelectionRange;
    }

    public final SemanticsPropertyKey<ImeAction> getImeAction() {
        return ImeAction;
    }

    public final SemanticsPropertyKey<Boolean> getSelected() {
        return Selected;
    }

    public final SemanticsPropertyKey<ToggleableState> getToggleableState() {
        return ToggleableState;
    }

    public final SemanticsPropertyKey<Unit> getPassword() {
        return Password;
    }

    public final SemanticsPropertyKey<String> getError() {
        return Error;
    }

    public final SemanticsPropertyKey<Function1<Object, Integer>> getIndexForKey() {
        return IndexForKey;
    }

    public final SemanticsPropertyKey<Boolean> getIsEditable() {
        return IsEditable;
    }

    public final SemanticsPropertyKey<Integer> getMaxTextLength() {
        return MaxTextLength;
    }
}
