package androidx.compose.ui.node;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: ComposeUiNode.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4G\u0007\"B\u0012\u007f\u0007lmA0ZeP.XV2\u000f\u0002{<$a'yCQU\"}(\fWN}gvJ`\u000eK\u000f\u001c\u0016\u0001j2M[Xs܈-^rom2\u0006ni\n\u0001\u00036\u001d `#n\u001eC%pݺTǘz\u000bSM\u0012\u0014>C\t<X\u0011[\n:\u0014\fD.\bnruVNH\u001bf\u0011ǩ/ɨmLf)e:\u000bX-HZ3\u001b\u0004249NO5C4*ί\u0013қ_I\u001bAwM\u0013yG)1[\u0002j\u0007n\u000e(-+}\"4ĝ2ػ\t[x\u000e-A]zkR\u0014@\u0006\u0014L#J\u001e&\u0006Uc\u0005Ǎ&Ǵ\f\u0018KvxoNm\"`H\u001e\t\u0001\u0007-3 K+g<=Іmޅ\u001dXO}\u000b/,F!p'\u007fb31+)z\u0010Q_x\u0017קTݳ\u000ecUo\n\u0019p+J\u00066q\u000eZʾ\u0010фϒ%;c;)@\u001a\u0001үH\u0015й\t_"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9kF~0?g}\u0010;V -M\u0019", "", "1n\\=b:Bb\u0019dzr\u000fx\u00172", "", "5dc\u0010b4I]'\u0003\n^\u0012|\u001d\u0012a\u000e+:<\n !Vk\u001d@\u0001.C", "u(E", "5dc\u0010b4I]'\u0003\n^\u0012|\u001d\u0012a\u000e+", "u(8", "Adc\u0010b4I]'\u0003\n^\u0012|\u001d\u0012a\u000e+", "uH\u0018#", "1n\\=b:Bb\u001d\t\u0004E6z\u00056M{3", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0015WA7r\u001c\u001a >", "5dc\u0010b4I]'\u0003\nb6\u0006o9c{/c<\f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.;|\u001a8V*Ei0%|dl\u000f", "Adc\u0010b4I]'\u0003\nb6\u0006o9c{/c<\f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f$Fq 74M9g;\u0006\u0011s7|w", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "5dc\u0011X5LW(\u0013", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "Adc\u0011X5LW(\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\r1\u0007", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", "Adc\u0019T@Hc(]~k,z\u00183o\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W#r9?i\r~;z\u0016,\\GEt\na\u0006", ";dP@h9>>#\u0006~\\@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7X 5QAOA", "5dc\u001aX(Lc&~eh3\u0001\u0007C", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001dYy.Gz\u0016\u0019WJ?iHs", "Adc\u001aX(Lc&~eh3\u0001\u0007C", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u00018TG9\u007f\na\u0006", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "5dc\u001ab+BT\u001d~\b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/", "Adc\u001ab+BT\u001d~\b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b\u001dn", "DhTD66GT\u001d\u0001\u000bk(\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", "5dc#\\,P1#\b{b.\r\u0016+t\u00042\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#n$7\u007fs8VD?mD+\u0011weC\u00109", "Adc#\\,P1#\b{b.\r\u0016+t\u00042\u0005", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~J\u0002 IK 7NG={A\u001a$lkB\\'\u001d", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface ComposeUiNode {
    public static final Companion Companion = Companion.$$INSTANCE;

    static /* synthetic */ void getCompositeKeyHash$annotations() {
    }

    int getCompositeKeyHash();

    CompositionLocalMap getCompositionLocalMap();

    Density getDensity();

    LayoutDirection getLayoutDirection();

    MeasurePolicy getMeasurePolicy();

    Modifier getModifier();

    ViewConfiguration getViewConfiguration();

    void setCompositeKeyHash(int i2);

    void setCompositionLocalMap(CompositionLocalMap compositionLocalMap);

    void setDensity(Density density);

    void setLayoutDirection(LayoutDirection layoutDirection);

    void setMeasurePolicy(MeasurePolicy measurePolicy);

    void setModifier(Modifier modifier);

    void setViewConfiguration(ViewConfiguration viewConfiguration);

    /* JADX INFO: compiled from: ComposeUiNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я^\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\bnjO0LeV4ZS8\u000fs{J$c$wECU0}*\tUNog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4I[xe\u0012%2JoE3UoS9ht<\u0005(288\u0002\u0005\u0007\u001c0Ё\u0011\rٙsK:\u0011pEv:ň\u0011M\u0013\u001ab\u001bL!\u0019$li^6vo\f<ǥ'\tqĩf)e4\u000bR]wb-%\u000eq ;@e8%'c\u00035ZkA\u0013? F3oҊ++O}\u000e{/ä\u0016Ʀ/[\u0015ƞ\u0003(b\u0010_`$)1[qX!46\u0006\u0013\u0013\u001d>\u0014\u000e4*X0=\u001a\u0015\u0017\u001e5\u0005r\u0002I~\tެF\u007f\u0001kي\u001b+\bđC;!v_n\f?\\H\u0014\u001c\u001d 3\u0001\u001d$kV\u001e`C-dya1\u007fIkOݳ\u000eYCwձth\nÏ\u001c2M\u0013=\taT%9OrI%1k0KTi\u0007\u0005\u000f}ckbHn+\u001d\u001d֖.\t\u0012dֈh\u000bs¬lZ2'[)%-\f\u001f+7lyL!S\u0013^Qxi\u0019em\f5/\u0015@\bu«\u0012W?hۋ9Wk߄yT|-MI3+f\u0001Zj\u001c\\l(P5Xl w*_^\u000e#2mzJ;Ϝ5\u0019b\u001fȠ\u0007$Jˆ\u0015\u000bevv\u001dOzAA\u001b\u00014v\u0019\u0001~_\u0001qwxwJ\rb2-oZc łY\"n>č'\r\u0007͞\u0018ImkUY=+\u0004u\u0014&&\u001cIQ]@A\u0011ɒ-8\nΏ]Nx\u0007_Rɥ+\u001d"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9kF~0?g}\u0010;V -M\u0002\u0019u<)\u0011qeC\u00109", "", "u(E", "\u0011n]@g9NQ(\t\b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9kF~0?g}\u0010;V -M\u0019", "5dc\u0010b5Lb&\u000fxm6\n", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "!dc\u0010b4I]'\u0003\n^\u0012|\u001d\u0012a\u000e+", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc X;\u001c]!\n\u0005l0\f\t\u0015e\u0014\u000bwN\u0004U\u0013Px\u0018Kr49c\u0007.", "5dc X;\u001c]!\n\u0005l0\f\t\u0015e\u0014\u000bwN\u0004", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "!dc\u0011X5LW(\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "5dc X;\u001dS\"\r~m@", "!dc\u0019T@Hc(]~k,z\u00183o\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc X;%O-\t\u000bm\u000b\u0001\u0016/c\u000f,\u0006I", "!dc\u001aX(Lc&~eh3\u0001\u0007C", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7X 5QAOA", "5dc X;&S\u0015\r\u000bk,g\u00136i}<", "!dc\u001ab+BT\u001d~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "5dc X;&]\u0018\u0003{b,\n", "!dc\u001fX:HZ*~y<6\u0005\u00149s\u00047\u007fJ\n}!Ek\u0015J", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0015WA7r\u001c\u001a >", "5dc X;+S'\t\u0002o,{f9m\u000b2\nD\u0010\u001b!PV\u0018:r,C", "!dc#\\,P1#\b{b.\r\u0016+t\u00042\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", "5dc X;/W\u0019\u0011Xh5}\r1u\r$\u000bD\u000b ", "$haAh(E1#\b\tm9\r\u0007>o\r", "5dc#\\9Mc\u0015\u0006Xh5\u000b\u0018<u}7\u0006M", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Function0<ComposeUiNode> Constructor = LayoutNode.Companion.getConstructor$ui_release();
        private static final Function0<ComposeUiNode> VirtualConstructor = new Function0<LayoutNode>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$VirtualConstructor$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LayoutNode invoke() {
                return new LayoutNode(true, 0, 2, null);
            }
        };
        private static final Function2<ComposeUiNode, Modifier, Unit> SetModifier = new Function2<ComposeUiNode, Modifier, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ComposeUiNode composeUiNode, Modifier modifier) {
                invoke2(composeUiNode, modifier);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ComposeUiNode composeUiNode, Modifier modifier) {
                composeUiNode.setModifier(modifier);
            }
        };
        private static final Function2<ComposeUiNode, Density, Unit> SetDensity = new Function2<ComposeUiNode, Density, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetDensity$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ComposeUiNode composeUiNode, Density density) {
                invoke2(composeUiNode, density);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ComposeUiNode composeUiNode, Density density) {
                composeUiNode.setDensity(density);
            }
        };
        private static final Function2<ComposeUiNode, CompositionLocalMap, Unit> SetResolvedCompositionLocals = new Function2<ComposeUiNode, CompositionLocalMap, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetResolvedCompositionLocals$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ComposeUiNode composeUiNode, CompositionLocalMap compositionLocalMap) {
                invoke2(composeUiNode, compositionLocalMap);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ComposeUiNode composeUiNode, CompositionLocalMap compositionLocalMap) {
                composeUiNode.setCompositionLocalMap(compositionLocalMap);
            }
        };
        private static final Function2<ComposeUiNode, MeasurePolicy, Unit> SetMeasurePolicy = new Function2<ComposeUiNode, MeasurePolicy, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ComposeUiNode composeUiNode, MeasurePolicy measurePolicy) {
                invoke2(composeUiNode, measurePolicy);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ComposeUiNode composeUiNode, MeasurePolicy measurePolicy) {
                composeUiNode.setMeasurePolicy(measurePolicy);
            }
        };
        private static final Function2<ComposeUiNode, LayoutDirection, Unit> SetLayoutDirection = new Function2<ComposeUiNode, LayoutDirection, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
                invoke2(composeUiNode, layoutDirection);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
                composeUiNode.setLayoutDirection(layoutDirection);
            }
        };
        private static final Function2<ComposeUiNode, ViewConfiguration, Unit> SetViewConfiguration = new Function2<ComposeUiNode, ViewConfiguration, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetViewConfiguration$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ComposeUiNode composeUiNode, ViewConfiguration viewConfiguration) {
                invoke2(composeUiNode, viewConfiguration);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ComposeUiNode composeUiNode, ViewConfiguration viewConfiguration) {
                composeUiNode.setViewConfiguration(viewConfiguration);
            }
        };
        private static final Function2<ComposeUiNode, Integer, Unit> SetCompositeKeyHash = new Function2<ComposeUiNode, Integer, Unit>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetCompositeKeyHash$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(ComposeUiNode composeUiNode, Integer num) {
                invoke(composeUiNode, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ComposeUiNode composeUiNode, int i2) {
                composeUiNode.setCompositeKeyHash(i2);
            }
        };

        public static /* synthetic */ void getSetCompositeKeyHash$annotations() {
        }

        private Companion() {
        }

        public final Function0<ComposeUiNode> getConstructor() {
            return Constructor;
        }

        public final Function0<ComposeUiNode> getVirtualConstructor() {
            return VirtualConstructor;
        }

        public final Function2<ComposeUiNode, Modifier, Unit> getSetModifier() {
            return SetModifier;
        }

        public final Function2<ComposeUiNode, Density, Unit> getSetDensity() {
            return SetDensity;
        }

        public final Function2<ComposeUiNode, CompositionLocalMap, Unit> getSetResolvedCompositionLocals() {
            return SetResolvedCompositionLocals;
        }

        public final Function2<ComposeUiNode, MeasurePolicy, Unit> getSetMeasurePolicy() {
            return SetMeasurePolicy;
        }

        public final Function2<ComposeUiNode, LayoutDirection, Unit> getSetLayoutDirection() {
            return SetLayoutDirection;
        }

        public final Function2<ComposeUiNode, ViewConfiguration, Unit> getSetViewConfiguration() {
            return SetViewConfiguration;
        }

        public final Function2<ComposeUiNode, Integer, Unit> getSetCompositeKeyHash() {
            return SetCompositeKeyHash;
        }
    }
}
