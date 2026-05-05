package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: compiled from: NodeKind.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яħ\u0014D57\u001eq\u007fR܀kt\nA\u000e0!.J~8,\u001aw\rhr9FDmH4S[*%k\u00044*\\,qY;]\u001a\u0004#\u0011OdgonP[\u0013C%\u0006\u001exp-QU\u000f]\u001a\u000f8Cw?IMw=?a|6\u001b :\">z\r\u00010*P\u0010|{KK\"\u00128@v;Z\rc\u0005\"\u0012\f?(\u00014\\oN<It]P/+\u0003oCV'u0\u0005M\u0013G\\'#vi\u001e1A?5+%[\u0003\rSc?\u0019?y=\u000bi-ޑ+_֕\b6\u0007~T\u001a1Oոar4\\Uvn\r?1_e[P<+&|2ɥ<Z\u0602\bТG͓ȟ\u0019eڿ\u0012=\u0005tYD^\u0002vD\u0006\u007fo<gJ\u000e:C?+haai!|92̣\rtň\u0003ϒ żۣ\r_ڠ\u001f^\bS7ZN=`P\u0010cKsT\u0016p\rB\n@I\u0010/*\u001d\\\u0019[ۢ[\u0010\u0602#ɶ\u0001҆جfuݶdrckXUN\"\u0007\u0018=8\u0017\u0012+ir\u0014\u0004VdZ<\u0011{,\u0003\t4ݸ\u0013vχy͌ طƤMNŹmt]_\u00106=fO[t}\u001c]\n\u0004AHii cbvBSjd;סf\u0019͵\u000eʐ[̥Ш1Gн\u0014\u0002\fFT!!2Ws\"J:7i\u0002#_\u001b$RC\r\t\u000er\u0017\u00125ե3zѸk̾sէˏO[ʼsq\tK2\u0016n\"ECWO',&GvO\u0015)\u0017\u0001\u0004\u007fu\u0004zI\u0003ͅ\u0016Lɥ}Ć\u0015֝ÑP.ˮ\u0017\u0019\u000f+8\u001f;Edtko[\u0018w \u000b\u0019'Ax0w\b\u0019\u0011Zb!\u0080O+ϧ$֧]аص\u0007cѣ}kV|M\u0005b\u000bs@O\u0015\u0011_\rsF \u001d%.'\u0011oP!c/y۶\u001dlߘ\u0016ۥ\u0014˕ՙhnЦ}l\u001f(z\u000b\u0012,{\u0018u\t_c\u0003`Fpq\u0005N$4l1jvl.ګB_ͱ\u000fЂGШҥoUиQ\u0015?\u007fl0:\r\tXad!uNY<\u000bByS\u007f$^qQ?O\nݑmDо^؞I\u05faё\nzϥr\u001c,?&\u0004eb!2\f\"&<\u0012`p4T\u000f46<<6;qV ѹ\u0010QĜHޣ\u000eğѡArŌZ\u0018dzb\bV\u0005xGfS8\u0007O4AQ\u0011;A\u0007}F\u0003c\u001247Ӽ\u001d_ƍḷ}ܺ\u0000*Cȗ=%8Z\u0007@S][K\bl\u0012My\u0013y'$>(~-BFSgSGڪv\u0007ͤ\rۖc̯ѿu\u0011؉VX2+\u00054\u000b\u000eT\f\u0015E'UC\u0015phdT\b9S\u001a/Sr+=Ҡ|:˲\u001dԇ\u0005זм<Hހ\u00181\fYYx\f\b8\"-B\u0003'-|\u001c&\"c+<&qD#0\u000bIѪ Z̀LȌq˖܍\u00075с\u0006=\u0012\u0015d\u001byw9B-mz\f\u0013pv<\"i|e~U9G\u00153\rӺn\u0004Ǩ\u001f֍&Ӎޑ\u0012Wŷ>\u001bc\"^V\u000e\u0014-(%|\u0016hy5]+\u0001v{Qk\rYw\u001a,\u0018ʼ0)ʼ\u007fОxǡś)SӲ\u0019EfOD.\u0017\\\u0005D]Xlpۭd}\u0014,\u001aλ\u001bv]\u0019\u0013:eޚ\"0"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%C/", "", "u(E", "\u000fmh", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u001b]\u0007\u001f\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "5dc\u000ea@\u0006=\u007f\u0011\u0002H\u0012\u000fG+n\t2\u000b<\u0010\u001b!P}", "5dc\u000ea@\u0006=\u007f\u0011\u0002H\u0012\u000f", "u(8", "\u000fo_?b(<V\u0001~vl<\n\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R0@f\b\u001c5p|*aMKz\u001c(\u0014lb=\u0007p\u0015Xu'\u001d", "5dc\u000ec7K]\u0015|}F,x\u0017?r\u007foe'\u0013\u001e\u0001-\u0002L8\u007f.?hy/;w\u001f<", "5dc\u000ec7K]\u0015|}F,x\u0017?r\u007foe'\u0013\u001e\u0001-\u0002", "\u0011n\\=b:Bb\u001d\t\u0004E6z\u00056C\n1\nP\t\u0017$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9kF~0?g\u0002/;w\u001f\u0015WA7r\u0012(\u001evqA\u0007p\u0014Xu+HPN9E\\q=i", "5dc\u0010b4I]'\u0003\nb6\u0006o9c{/YJ\n%'Oo\u001b\u0004`\fG`g\u0006I,\u00127VMJgC\"\u001fqo", "5dc\u0010b4I]'\u0003\nb6\u0006o9c{/YJ\n%'Oo\u001b\u0004`\fG`g\u0006I", "\u0012qPD", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9lIr7\u001dc|$8q\u0016;6M:k\n", "5dc\u0011e(P\u001b\u0003e\re\u0016b\u001bma\t1\u0006O|&\u001bQx\u001c", "5dc\u0011e(P\u001b\u0003e\re\u0016b\u001b", "\u0014nRBf\fOS\"\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Eg]17v%\u0016WB?l8\u001e\"Qk8\u00079", "5dc\u0013b*Nax\u0010zg;Dr\u0016w\u0007\u0012aR?\u0013 Py\u001d8\u0006)?b\f", "5dc\u0013b*Nax\u0010zg;Dr\u0016w\u0007\u0012aR", "\u0014nRBf\u0017K]$~\bm0|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egh-Ax\u0016;\\G;y\u001c(\u0014lb=\u0007p\u0015Xu'\u001d", "5dc\u0013b*Na\u0004\f\u0005i,\n\u00183e\u000eoe'\u0013\u001e\u0001-\u0002L8\u007f.?hy/;w\u001f<", "5dc\u0013b*Na\u0004\f\u0005i,\n\u00183e\u000eoe'\u0013\u001e\u0001-\u0002", "\u0014nRBf\u001b:`\u001b~\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egl\u001cDo\u0016=6M:k\n", "5dc\u0013b*Na\bz\b`,\fP\u0019L\u0012/e&\u0013U\u0013Px\u0018Kr49c\u0007.", "5dc\u0013b*Na\bz\b`,\fP\u0019L\u0012/e&\u0013", "\u0015k^/T3)]'\u0003\nb6\u0006dAa\r(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9oC\u0001\"1`h*Eq%2WL\u0017}0+\u0015Pk8\u000bd0N\u0004\u0010QKN\u0002", "5dc\u0014_6;O i\u0005l0\f\r9n[:wM\u0001^\u0001.\u0002\u0015&\\7sU\u0007)A|\u0012=QMDy", "5dc\u0014_6;O i\u0005l0\f\r9n[:wM\u0001^\u0001.\u0002\u0015&\\7", "\u0019dh\u0016a7Nb", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~?}4\u001bv!>\\+Ej8\u001f\u0019hn\"\u0011b,$", "5dc\u0018X@\"\\$\u000f\n&\u0016c\u001b6Oe::<\n !Vk\u001d@\u0001.C", "5dc\u0018X@\"\\$\u000f\n&\u0016c\u001b6Oe:", "\u001a`h<h;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehe*6q\u00172MP$u3\u001ej", "5dc\u0019T@Hc(FdE>\u0004r\u0015w>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc\u0019T@Hc(FdE>\u0004r\u0015w", "\u001a`h<h;\u001ae\u0015\fz", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/EhY23z\u0016\u0016WB?l8\u001e\"Qk8\u00079", "5dc\u0019T@Hc(Z\rZ9|P\u0019L\u0012/e&\u0013U\u0013Px\u0018Kr49c\u0007.", "5dc\u0019T@Hc(Z\rZ9|P\u0019L\u0012/e&\u0013", "\u001anR._:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\t!\u0016Kp\u0012<\u0004n\u001dc|$8q\u0016;4M9g;\u0006\u001fge:\u000bc97\u0001&G\"", "5dc\u0019b*:Z'FdE>\u0004r\u0015w>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc\u0019b*:Z'FdE>\u0004r\u0015w", "\u001e`a2a;\u001dO(z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9x8\u0004%>h\\\u001cFi}8LG<o4+}r`9\\", "5dc\u001dT9>\\(]vm(Dr\u0016w\u0007\u0012aR?\u0013 Py\u001d8\u0006)?b\f", "5dc\u001dT9>\\(]vm(Dr\u0016w\u0007\u0012aR", "\u001enX;g,K7\"\n\u000bm", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9xFz.DY\u000b\u0004@x&=5M:o5\"\u0015uJC\u0006c\u0002", "5dc\u001db0Gb\u0019\f^g7\r\u0018vOf:\u0003*f)UCx\u0017F\u0006!D]\b)E", "5dc\u001db0Gb\u0019\f^g7\r\u0018vOf:\u0003*f)", " nc.e@\"\\$\u000f\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WI\u000141f\u0012i$w%*ZW\u001ft?.$Pk8\u000bd0N\u0004\u0010QKN\u0002", "5dc\u001fb;:`-b\u0004i<\fP\u0019L\u0012/e&\u0013U\u0013Px\u0018Kr49c\u0007.", "5dc\u001fb;:`-b\u0004i<\fP\u0019L\u0012/e&\u0013", "!d\\.a;BQ'", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9{<~!>h\u0002\u001eEU -QD?kA\u0007\u001fga\u000f", "5dc X4:\\(\u0003xlsfoAli\u000e\u000e~|  Q~\nKz/>g", "5dc X4:\\(\u0003xlsfoAli\u000e\u000e", "!nUA>,RP#z\b]\u0012|\u001d\u0013n\u000b8\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~G\b!FS\u0016BJM7x3\u0002\u001ewaF\u0005c7]z1P4X+`Sv=!zd\rN\u0001", "5dc b-M9\u0019\u0013wh(\n\b\u0015e\u0014\f\u0005K\u0011&^1V C`\u000bG\u0018y)@w%*\\GEtB", "5dc b-M9\u0019\u0013wh(\n\b\u0015e\u0014\f\u0005K\u0011&^1V C`\u000bG", "\"qPCX9LO\u0016\u0006z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9|Ir65f\f\u001c4t\u0016\u0017WB;A", "5dc!e(OS&\rv[3|P\u0019L\u0012/e&\u0013U\u0013Px\u0018Kr49c\u0007.", "5dc!e(OS&\rv[3|P\u0019L\u0012/e&\u0013", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Nodes {
    public static final int $stable = 0;
    public static final Nodes INSTANCE = new Nodes();

    @JvmStatic
    /* JADX INFO: renamed from: getAny-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5761getAnyOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getApproachMeasure-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5763getApproachMeasureOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getCompositionLocalConsumer-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5765getCompositionLocalConsumerOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getDraw-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5767getDrawOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getFocusEvent-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5769getFocusEventOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getFocusProperties-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5771getFocusPropertiesOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getFocusTarget-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5773getFocusTargetOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getGlobalPositionAware-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5775getGlobalPositionAwareOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getKeyInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5777getKeyInputOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getLayout-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5779getLayoutOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getLayoutAware-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5781getLayoutAwareOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getLocals-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5783getLocalsOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getParentData-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5785getParentDataOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getPointerInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5787getPointerInputOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getRotaryInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5789getRotaryInputOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getSemantics-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5791getSemanticsOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getSoftKeyboardKeyInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5793getSoftKeyboardKeyInputOLwlOKw$annotations() {
    }

    @JvmStatic
    /* JADX INFO: renamed from: getTraversable-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5795getTraversableOLwlOKw$annotations() {
    }

    private Nodes() {
    }

    /* JADX INFO: renamed from: getAny-OLwlOKw, reason: not valid java name */
    public static final int m5760getAnyOLwlOKw() {
        return NodeKind.m5749constructorimpl(1);
    }

    /* JADX INFO: renamed from: getLayout-OLwlOKw, reason: not valid java name */
    public static final int m5778getLayoutOLwlOKw() {
        return NodeKind.m5749constructorimpl(2);
    }

    /* JADX INFO: renamed from: getDraw-OLwlOKw, reason: not valid java name */
    public static final int m5766getDrawOLwlOKw() {
        return NodeKind.m5749constructorimpl(4);
    }

    /* JADX INFO: renamed from: getSemantics-OLwlOKw, reason: not valid java name */
    public static final int m5790getSemanticsOLwlOKw() {
        return NodeKind.m5749constructorimpl(8);
    }

    /* JADX INFO: renamed from: getPointerInput-OLwlOKw, reason: not valid java name */
    public static final int m5786getPointerInputOLwlOKw() {
        return NodeKind.m5749constructorimpl(16);
    }

    /* JADX INFO: renamed from: getLocals-OLwlOKw, reason: not valid java name */
    public static final int m5782getLocalsOLwlOKw() {
        return NodeKind.m5749constructorimpl(32);
    }

    /* JADX INFO: renamed from: getParentData-OLwlOKw, reason: not valid java name */
    public static final int m5784getParentDataOLwlOKw() {
        return NodeKind.m5749constructorimpl(64);
    }

    /* JADX INFO: renamed from: getLayoutAware-OLwlOKw, reason: not valid java name */
    public static final int m5780getLayoutAwareOLwlOKw() {
        return NodeKind.m5749constructorimpl(128);
    }

    /* JADX INFO: renamed from: getGlobalPositionAware-OLwlOKw, reason: not valid java name */
    public static final int m5774getGlobalPositionAwareOLwlOKw() {
        return NodeKind.m5749constructorimpl(256);
    }

    /* JADX INFO: renamed from: getApproachMeasure-OLwlOKw, reason: not valid java name */
    public static final int m5762getApproachMeasureOLwlOKw() {
        return NodeKind.m5749constructorimpl(512);
    }

    /* JADX INFO: renamed from: getFocusTarget-OLwlOKw, reason: not valid java name */
    public static final int m5772getFocusTargetOLwlOKw() {
        return NodeKind.m5749constructorimpl(1024);
    }

    /* JADX INFO: renamed from: getFocusProperties-OLwlOKw, reason: not valid java name */
    public static final int m5770getFocusPropertiesOLwlOKw() {
        return NodeKind.m5749constructorimpl(2048);
    }

    /* JADX INFO: renamed from: getFocusEvent-OLwlOKw, reason: not valid java name */
    public static final int m5768getFocusEventOLwlOKw() {
        return NodeKind.m5749constructorimpl(4096);
    }

    /* JADX INFO: renamed from: getKeyInput-OLwlOKw, reason: not valid java name */
    public static final int m5776getKeyInputOLwlOKw() {
        return NodeKind.m5749constructorimpl(8192);
    }

    /* JADX INFO: renamed from: getRotaryInput-OLwlOKw, reason: not valid java name */
    public static final int m5788getRotaryInputOLwlOKw() {
        return NodeKind.m5749constructorimpl(16384);
    }

    /* JADX INFO: renamed from: getCompositionLocalConsumer-OLwlOKw, reason: not valid java name */
    public static final int m5764getCompositionLocalConsumerOLwlOKw() {
        return NodeKind.m5749constructorimpl(32768);
    }

    /* JADX INFO: renamed from: getSoftKeyboardKeyInput-OLwlOKw, reason: not valid java name */
    public static final int m5792getSoftKeyboardKeyInputOLwlOKw() {
        return NodeKind.m5749constructorimpl(131072);
    }

    /* JADX INFO: renamed from: getTraversable-OLwlOKw, reason: not valid java name */
    public static final int m5794getTraversableOLwlOKw() {
        return NodeKind.m5749constructorimpl(262144);
    }
}
