package androidx.compose.ui.node;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: LayoutNodeAlignmentLines.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":5\u007f\u0007|jA0RkP.XT2\u000fy\u0005<$a;yCIw\"}8\tWNmhvJh\u000bK\u000f\f\u001e\u0001jBI]xc\u0014\u00172XoG3coEʠf#LӌP2P7:\u0012\u0007\u001c:L\u001ev\u0013Cy\rܘ4@~<\u001b+[-2\u00124gP\u0005,\u0007\u007fNdM\u001daHZ;\u0003\u0018H~+m\\\u0015M;k\u001b'U\u0007oKCLG7%%\u0002\b\u0017Tk?1E aMl5UCI\"\u0001~\\\u000eC-+}6&v4\r\u001dQ\u000f5o6]\u0015cP<Q>\u07beԫ\u0011<\n@NCVaE\u001a\u0015<63#\u0018\u0004D^7vB./(X҆$ĮĴ/;!\u001d_\u0019\u0004+\\o\u0014\u0005;$K\u0001\u001dF\fX\u001c\u000b-\u001b\u0003|\u0018S\"XKKf\u0016i?}\u0004\u001fg\u0012,\u00140u\u0006]\u007fgч\u0019É;[A\u05faqz\u0010H\\g%\u0006¾lYqɭ`B(u$?z!\u001ac\\d3u'Ӻd¯\u0015Y$\u0381\u001f\u007f\u000e\u001e.h\u0018>'2\u001e\\ \u0001wye]8/\u0006ϊC֍rw\u0016ãQ`9E_o0cX\b\"M\rt\u0013j~B\u0002\u0016\u0011\u001b~ΰ4ʮn\u0014\u0010}Ja\u001a\u001f\u0003M\u007f0L.G\u0018\u000b\u0016\u001fҔ*նE|\u0011ݠ+z\u001e\u0014l3R\r bKը\u0003˩`t\bi~_:\t1:;Xi5G0,ȩtط\u0001/\u000fѨ\f\u0002M\u007fZSln\u001c\u000fc\np.(Si/k\u001deȰ5ɨ\u00069Mɣ\u000bgWh 3\u001b~\u007f+Iv~\u007f\u0016\b\t,\u000ft!֣`Ђ&\u0003fа;\nj\u001e\bmf|M\u0003b\u0019,VW\u0013\u001bYjX\u000fى\u0011ȷ\"1\tǻ:~;NQ3=\u0018}6=#2}w\u0013F\u0006r\u00116t\u0014\t<e&o\u0011W\fVc8w~Uл$ٝp\u0007ZJp\u001e\u0016iމ3\rl\u0003Ыdu^;SߴK,e§0H"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9iCz'>a})FT\u001a7MQ\u0011", "", "/kX4a4>\\(e~g,\u000brAn\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9iCz'>a})FT\u001a7MQ%}=\u001e\">", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW\u0018})7b\u0006 @||2VCIUF'\u0015u7|w", "/kX4a4>\\(e~g,d\u0005:", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/si:\u0005@\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006R,9[\u0007(7v%\u0015QL;y\u001e0\u001ehn\u000f", "2haAl", "", "5dc\u0011\\9MgW\u000f~X9|\u0010/a\u000e(", "u(I", "Adc\u0011\\9MgW\u000f~X9|\u0010/a\u000e(", "uY\u0018#", ">qTC\\6Na\t\rz]\u000b\r\u00163n\u0002\u0013wM\u0001 &.k\"F\u00074", "5dc\u001de,OW#\u000f\tN:|\b\u000eu\r,\u0005Bk\u0013$Gx\u001d#r9?i\r^Gq\u0010;MJ;gB\u001e", "Adc\u001de,OW#\u000f\tN:|\b\u000eu\r,\u0005Bk\u0013$Gx\u001d#r9?i\r^Gq\u0010;MJ;gB\u001e", "?tT?\\,=", "5dc\u001eh,KW\u0019}9n0v\u0016/l\u007f$\n@", "?tT?l\u0016P\\\u0019\f", "@d`B\\9>R", "5dc\u001fX8NW&~y\u001d<\u0001\u0003<e\u0007(wN\u0001", "CrT15@&]\u0018\u0003{b,\no+y\n8\u000b", "5dc\"f,=0-f\u0005]0}\r/rf$\u0010J\u0011&UWs\bIv,5U\f ", "Adc\"f,=0-f\u0005]0}\r/rf$\u0010J\u0011&UWs\bIv,5U\f ", "CrT15@&]\u0018\u0003{b,\np/a\u000e8\t@\t\u0017 V", "5dc\"f,=0-f\u0005]0}\r/rg(wN\u0011$\u0017Oo\u0017K559S\u000b >m\u0012<M", "Adc\"f,=0-f\u0005]0}\r/rg(wN\u0011$\u0017Oo\u0017K559S\u000b >m\u0012<M", "CrT17<KW\"\u0001eZ9|\u0012>L{<\u0006P\u0010", "5dc\"f,=2)\f~g.g\u0005<e\t7b<\u0015!'V.\u001e@p25`}\u001cEm", "Adc\"f,=2)\f~g.g\u0005<e\t7b<\u0015!'V.\u001e@p25`}\u001cEm", "CrT17<KW\"\u0001eZ9|\u0012>M\u007f$\nP\u000e\u0017\u001fGx\u001d", "5dc\"f,=2)\f~g.g\u0005<e\t7c@|%'To\u0016<\u007f4si\u0002\u001aDm\u001d.IQ;", "Adc\"f,=2)\f~g.g\u0005<e\t7c@|%'To\u0016<\u007f4si\u0002\u001aDm\u001d.IQ;", "/kX4a4>\\(e~g,\u000bp+p", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u0013c\b-6q\u001f*\\MHA", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/sg$\u0007", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW%\u0001$57\b*Dl\u001a7IREx\na{m]J\u0003-<]z.\u00114J72", "/cS\u000e_0@\\!~\u0004m\u0013\u0001\u0012/", "", "/kX4a4>\\(e~g,", "7mXA\\(E>#\r~m0\u0007\u0012", "7mXA\\(E1#\t\b]0\u0006\u0005>o\r", "5dc\u0019T:M1\u0015\u0006xn3x\u00183o\t", "=m09\\.G[\u0019\b\nl\n\u007f\u00058g\u007f'", "@dR._*NZ\u0015\u000ez", "@dR._*NZ\u0015\u000ezJ<|\u0016CO\u00121{M", "@db2g", "@db2gjNW\u0013\fze,x\u0017/", "1`[0h3:b\u0019i\u0005l0\f\r9nc1f<\u000e\u0017 V", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", ">nb6g0H\\", "1`[0h3:b\u0019i\u0005l0\f\r9nc1f<\u000e\u0017 V7z\fU%\u0007)Y", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW%\u0001$57\b*Dl\u001a7IREx\n\u0003XM", "5dc\u001db:Bb\u001d\t\u0004?6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mq5QEDs4'$OeB\u0007q\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9tF\u0001+1\\}\u001c6I\u001d2OLCk=-{lj9\u00159", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class AlignmentLines {
    public static final int $stable = 8;
    private final Map<AlignmentLine, Integer> alignmentLineMap;
    private final AlignmentLinesOwner alignmentLinesOwner;
    private boolean dirty;
    private boolean previousUsedDuringParentLayout;
    private AlignmentLinesOwner queryOwner;
    private boolean usedByModifierLayout;
    private boolean usedByModifierMeasurement;
    private boolean usedDuringParentLayout;
    private boolean usedDuringParentMeasurement;

    public /* synthetic */ AlignmentLines(AlignmentLinesOwner alignmentLinesOwner, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignmentLinesOwner);
    }

    /* JADX INFO: renamed from: calculatePositionInParent-R5De75A, reason: not valid java name */
    protected abstract long mo5621calculatePositionInParentR5De75A(NodeCoordinator nodeCoordinator, long j2);

    protected abstract Map<AlignmentLine, Integer> getAlignmentLinesMap(NodeCoordinator nodeCoordinator);

    protected abstract int getPositionFor(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine);

    private AlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        this.alignmentLinesOwner = alignmentLinesOwner;
        this.dirty = true;
        this.alignmentLineMap = new HashMap();
    }

    public final AlignmentLinesOwner getAlignmentLinesOwner() {
        return this.alignmentLinesOwner;
    }

    public final boolean getDirty$ui_release() {
        return this.dirty;
    }

    public final void setDirty$ui_release(boolean z2) {
        this.dirty = z2;
    }

    public final boolean getUsedDuringParentMeasurement$ui_release() {
        return this.usedDuringParentMeasurement;
    }

    public final void setUsedDuringParentMeasurement$ui_release(boolean z2) {
        this.usedDuringParentMeasurement = z2;
    }

    public final boolean getUsedDuringParentLayout$ui_release() {
        return this.usedDuringParentLayout;
    }

    public final void setUsedDuringParentLayout$ui_release(boolean z2) {
        this.usedDuringParentLayout = z2;
    }

    public final boolean getPreviousUsedDuringParentLayout$ui_release() {
        return this.previousUsedDuringParentLayout;
    }

    public final void setPreviousUsedDuringParentLayout$ui_release(boolean z2) {
        this.previousUsedDuringParentLayout = z2;
    }

    public final boolean getUsedByModifierMeasurement$ui_release() {
        return this.usedByModifierMeasurement;
    }

    public final void setUsedByModifierMeasurement$ui_release(boolean z2) {
        this.usedByModifierMeasurement = z2;
    }

    public final boolean getUsedByModifierLayout$ui_release() {
        return this.usedByModifierLayout;
    }

    public final void setUsedByModifierLayout$ui_release(boolean z2) {
        this.usedByModifierLayout = z2;
    }

    public final boolean getQueried$ui_release() {
        return this.usedDuringParentMeasurement || this.previousUsedDuringParentLayout || this.usedByModifierMeasurement || this.usedByModifierLayout;
    }

    public final boolean getRequired$ui_release() {
        recalculateQueryOwner();
        return this.queryOwner != null;
    }

    public final void recalculateQueryOwner() {
        AlignmentLinesOwner alignmentLinesOwner;
        AlignmentLines alignmentLines;
        AlignmentLines alignmentLines2;
        if (getQueried$ui_release()) {
            alignmentLinesOwner = this.alignmentLinesOwner;
        } else {
            AlignmentLinesOwner parentAlignmentLinesOwner = this.alignmentLinesOwner.getParentAlignmentLinesOwner();
            if (parentAlignmentLinesOwner == null) {
                return;
            }
            alignmentLinesOwner = parentAlignmentLinesOwner.getAlignmentLines().queryOwner;
            if (alignmentLinesOwner == null || !alignmentLinesOwner.getAlignmentLines().getQueried$ui_release()) {
                AlignmentLinesOwner alignmentLinesOwner2 = this.queryOwner;
                if (alignmentLinesOwner2 == null || alignmentLinesOwner2.getAlignmentLines().getQueried$ui_release()) {
                    return;
                }
                AlignmentLinesOwner parentAlignmentLinesOwner2 = alignmentLinesOwner2.getParentAlignmentLinesOwner();
                if (parentAlignmentLinesOwner2 != null && (alignmentLines2 = parentAlignmentLinesOwner2.getAlignmentLines()) != null) {
                    alignmentLines2.recalculateQueryOwner();
                }
                AlignmentLinesOwner parentAlignmentLinesOwner3 = alignmentLinesOwner2.getParentAlignmentLinesOwner();
                alignmentLinesOwner = (parentAlignmentLinesOwner3 == null || (alignmentLines = parentAlignmentLinesOwner3.getAlignmentLines()) == null) ? null : alignmentLines.queryOwner;
            }
        }
        this.queryOwner = alignmentLinesOwner;
    }

    public final Map<AlignmentLine, Integer> getLastCalculation() {
        return this.alignmentLineMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addAlignmentLine(AlignmentLine alignmentLine, int i2, NodeCoordinator nodeCoordinator) {
        float fM3937getXimpl;
        float f2 = i2;
        long jOffset = OffsetKt.Offset(f2, f2);
        while (true) {
            jOffset = mo5621calculatePositionInParentR5De75A(nodeCoordinator, jOffset);
            nodeCoordinator = nodeCoordinator.getWrappedBy$ui_release();
            Intrinsics.checkNotNull(nodeCoordinator);
            if (Intrinsics.areEqual(nodeCoordinator, this.alignmentLinesOwner.getInnerCoordinator())) {
                break;
            } else if (getAlignmentLinesMap(nodeCoordinator).containsKey(alignmentLine)) {
                float positionFor = getPositionFor(nodeCoordinator, alignmentLine);
                jOffset = OffsetKt.Offset(positionFor, positionFor);
            }
        }
        if (alignmentLine instanceof HorizontalAlignmentLine) {
            fM3937getXimpl = Offset.m3938getYimpl(jOffset);
        } else {
            fM3937getXimpl = Offset.m3937getXimpl(jOffset);
        }
        int iRound = Math.round(fM3937getXimpl);
        Map<AlignmentLine, Integer> map = this.alignmentLineMap;
        if (map.containsKey(alignmentLine)) {
            iRound = AlignmentLineKt.merge(alignmentLine, ((Number) MapsKt.getValue(this.alignmentLineMap, alignmentLine)).intValue(), iRound);
        }
        map.put(alignmentLine, Integer.valueOf(iRound));
    }

    public final void recalculate() {
        this.alignmentLineMap.clear();
        this.alignmentLinesOwner.forEachChildAlignmentLinesOwner(new Function1<AlignmentLinesOwner, Unit>() { // from class: androidx.compose.ui.node.AlignmentLines.recalculate.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AlignmentLinesOwner alignmentLinesOwner) {
                invoke2(alignmentLinesOwner);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AlignmentLinesOwner alignmentLinesOwner) {
                if (alignmentLinesOwner.isPlaced()) {
                    if (alignmentLinesOwner.getAlignmentLines().getDirty$ui_release()) {
                        alignmentLinesOwner.layoutChildren();
                    }
                    Map map = alignmentLinesOwner.getAlignmentLines().alignmentLineMap;
                    AlignmentLines alignmentLines = AlignmentLines.this;
                    for (Map.Entry entry : map.entrySet()) {
                        alignmentLines.addAlignmentLine((AlignmentLine) entry.getKey(), ((Number) entry.getValue()).intValue(), alignmentLinesOwner.getInnerCoordinator());
                    }
                    NodeCoordinator wrappedBy$ui_release = alignmentLinesOwner.getInnerCoordinator().getWrappedBy$ui_release();
                    Intrinsics.checkNotNull(wrappedBy$ui_release);
                    while (!Intrinsics.areEqual(wrappedBy$ui_release, AlignmentLines.this.getAlignmentLinesOwner().getInnerCoordinator())) {
                        Set<AlignmentLine> setKeySet = AlignmentLines.this.getAlignmentLinesMap(wrappedBy$ui_release).keySet();
                        AlignmentLines alignmentLines2 = AlignmentLines.this;
                        for (AlignmentLine alignmentLine : setKeySet) {
                            alignmentLines2.addAlignmentLine(alignmentLine, alignmentLines2.getPositionFor(wrappedBy$ui_release, alignmentLine), wrappedBy$ui_release);
                        }
                        wrappedBy$ui_release = wrappedBy$ui_release.getWrappedBy$ui_release();
                        Intrinsics.checkNotNull(wrappedBy$ui_release);
                    }
                }
            }
        });
        this.alignmentLineMap.putAll(getAlignmentLinesMap(this.alignmentLinesOwner.getInnerCoordinator()));
        this.dirty = false;
    }

    public final void reset$ui_release() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.queryOwner = null;
    }

    public final void onAlignmentsChanged() {
        this.dirty = true;
        AlignmentLinesOwner parentAlignmentLinesOwner = this.alignmentLinesOwner.getParentAlignmentLinesOwner();
        if (parentAlignmentLinesOwner == null) {
            return;
        }
        if (this.usedDuringParentMeasurement) {
            parentAlignmentLinesOwner.requestMeasure();
        } else if (this.previousUsedDuringParentLayout || this.usedDuringParentLayout) {
            parentAlignmentLinesOwner.requestLayout();
        }
        if (this.usedByModifierMeasurement) {
            this.alignmentLinesOwner.requestMeasure();
        }
        if (this.usedByModifierLayout) {
            this.alignmentLinesOwner.requestLayout();
        }
        parentAlignmentLinesOwner.getAlignmentLines().onAlignmentsChanged();
    }
}
