package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: TextFieldScroll.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0017\u007f\u0007l}A0ZeP\u008cZS@\u000fs{:(c$\u007fCCU ~*\t]TogtR`\nYƤ$F)jZH\u000ew\u000eR\u00148VņC3[o}NpxD\u000682P:\n\u000b\u0007\u001a8K(v)Gƚ\u0010\u0012>E9]`/e\u0005H56B.%6\\\u0016RfLz\u0003R/Q\u0007\u001aF\\Mw0+tSϿù+\r|\nfAN`M\u0015Sz3\u000b`\u0006W\u0003m\u000eޮ\u0004ؒҊ+-O\u001feb!$\"BCO;\u0001#*j\u0017i`:)[Sqyh\u000eV\u0012+\u007f\u001bb\u001c\u000e4Nx2;I~\b<ZE\u001caGh\u0002\rF0~o</%.7a}Y'(Ĭݱ\u0019\u05ee;\f\r\u000f$/\u000f{9]Z\u0016n\u001e;V}[?\\\u0011fV\\\"Ykq4tp\bB\u0004^K6s:U\u0005ϖµ7٦=3)m\bYRt\u000f\u0007fwarrJF2|!\bS\u0017\u001erD\u0013\u0007\u001cTb^D\u0011{\u001e\u000bK<Li\u0605ώw˶%5\u0018PU\u007fw\u0003e_\u00108=zW[t\u0001\u001cm\njANic>{)Λ ͖@b\r֚7ba'r\\V>\tʒvߑvӻϢM\u000bƱ6My\u001cBMI\u001bb2V!>DG\u001c\u0017\u007fʶh\u0019\u0007W9ʖ\u001f\u0018#|\t\u0007oʽt!"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=.G;r3\f\u0013uk@\u000ec99\u00015K[R6e(", "", "u(E", "7mXA\\(E=&\u0003zg;x\u00183o\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "7mXA\\(E", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u0017-Ho4'$dp=\u0011l\u0002/:\u0018", "\nrTA \u0006\u0017", ";`g6`<F", "5dc\u001aT?B[)\u0007", "u(5", "Adc\u001aT?B[)\u0007", "uE\u0018#", ";`g6`<F\u0012\u0018~\u0002^.x\u0018/", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0001>w\u0012=;R7z4s", "=eU@X;", "5dc\u001cY-LS(", "Adc\u001cY-LS(", "=eU@X;|R\u0019\u0006z`(\f\t", "=qX2a;:b\u001d\t\u0004", "5dc\u001ce0>\\(z\nb6\u0006", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~[}.F}#.[\r%x8\u001e\u001ew]H\u000bm5$", "Adc\u001ce0>\\(z\nb6\u0006", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u0017-Ho4'$dp=\u0011l\u0002\u0012g", "=qX2a;:b\u001d\t\u0004\u001d+|\u0010/g{7{", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", ">qTC\\6Nav\u000f\bl6\nu/c\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", ">qTC\\6Na\u0007~\u0002^*\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "5dc\u001de,OW#\u000f\tL,\u0004\t-t\u00042\u0005\b\u007fj\u0001\u0013wm\u001c", "u(9", "Adc\u001de,OW#\u000f\tL,\u0004\t-t\u00042\u0005\bP,\u0015\u000f~t\u000f", "uI\u0018#", "\u0018", "1nT?V,(T\u001a\rzm", "", "1ta@b9,b\u0015\f\n", "1ta@b9\u001e\\\u0018", "1n]AT0GS&l~s,", "", "1nT?V,(T\u001a\rzmj}\u0013?n~$\u000bD\u000b \u0011To\u0015<r35", "5dc\u001cY-LS(m\u0005?6\u0004\u00109w", "Ad[2V;B]\"", "5dc\u001cY-LS(m\u0005?6\u0004\u00109wGw\u0011>H&}\u001a", "uI\u0018\u0016", "CoS.g,", "1ta@b9+S\u0017\u000e", "BdgA90>Z\u0018l~s,", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldScrollerPosition {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<TextFieldScrollerPosition, Object> Saver = ListSaverKt.listSaver(new Function2<SaverScope, TextFieldScrollerPosition, List<? extends Object>>() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final List<Object> invoke(SaverScope saverScope, TextFieldScrollerPosition textFieldScrollerPosition) {
            return CollectionsKt.listOf(Float.valueOf(textFieldScrollerPosition.getOffset()), Boolean.valueOf(textFieldScrollerPosition.getOrientation() == Orientation.Vertical));
        }
    }, new Function1<List<? extends Object>, TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public final TextFieldScrollerPosition invoke(List<? extends Object> list) {
            Object obj = list.get(1);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
            Orientation orientation = ((Boolean) obj).booleanValue() ? Orientation.Vertical : Orientation.Horizontal;
            Object obj2 = list.get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new TextFieldScrollerPosition(orientation, ((Float) obj2).floatValue());
        }
    });
    private final MutableFloatState maximum$delegate;
    private final MutableFloatState offset$delegate;
    private final MutableState orientation$delegate;
    private Rect previousCursorRect;
    private long previousSelection;

    public TextFieldScrollerPosition(Orientation orientation, float f2) {
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        this.maximum$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.previousCursorRect = Rect.Companion.getZero();
        this.previousSelection = TextRange.Companion.m6128getZerod9O1mEE();
        this.orientation$delegate = SnapshotStateKt.mutableStateOf(orientation, SnapshotStateKt.structuralEqualityPolicy());
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, (i2 & 2) != 0 ? 0.0f : f2);
    }

    public TextFieldScrollerPosition() {
        this(Orientation.Vertical, 0.0f, 2, null);
    }

    public final float getOffset() {
        return this.offset$delegate.getFloatValue();
    }

    public final void setOffset(float f2) {
        this.offset$delegate.setFloatValue(f2);
    }

    private final void setMaximum(float f2) {
        this.maximum$delegate.setFloatValue(f2);
    }

    public final float getMaximum() {
        return this.maximum$delegate.getFloatValue();
    }

    /* JADX INFO: renamed from: getPreviousSelection-d9O1mEE, reason: not valid java name */
    public final long m1420getPreviousSelectiond9O1mEE() {
        return this.previousSelection;
    }

    /* JADX INFO: renamed from: setPreviousSelection-5zc-tL8, reason: not valid java name */
    public final void m1421setPreviousSelection5zctL8(long j2) {
        this.previousSelection = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Orientation getOrientation() {
        return (Orientation) this.orientation$delegate.getValue();
    }

    public final void setOrientation(Orientation orientation) {
        this.orientation$delegate.setValue(orientation);
    }

    public final void update(Orientation orientation, Rect rect, int i2, int i3) {
        float f2 = i3 - i2;
        setMaximum(f2);
        if (rect.getLeft() != this.previousCursorRect.getLeft() || rect.getTop() != this.previousCursorRect.getTop()) {
            boolean z2 = orientation == Orientation.Vertical;
            coerceOffset$foundation_release(z2 ? rect.getTop() : rect.getLeft(), z2 ? rect.getBottom() : rect.getRight(), i2);
            this.previousCursorRect = rect;
        }
        setOffset(RangesKt.coerceIn(getOffset(), 0.0f, f2));
    }

    public final void coerceOffset$foundation_release(float f2, float f3, int i2) {
        float offset = getOffset();
        float f4 = i2;
        float f5 = offset + f4;
        setOffset(getOffset() + ((f3 <= f5 && (f2 >= offset || f3 - f2 <= f4)) ? (f2 >= offset || f3 - f2 > f4) ? 0.0f : f2 - offset : f3 - f5));
    }

    /* JADX INFO: renamed from: getOffsetToFollow-5zc-tL8, reason: not valid java name */
    public final int m1419getOffsetToFollow5zctL8(long j2) {
        return TextRange.m6123getStartimpl(j2) != TextRange.m6123getStartimpl(this.previousSelection) ? TextRange.m6123getStartimpl(j2) : TextRange.m6118getEndimpl(j2) != TextRange.m6118getEndimpl(this.previousSelection) ? TextRange.m6118getEndimpl(j2) : TextRange.m6121getMinimpl(j2);
    }

    /* JADX INFO: compiled from: TextFieldScroll.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\blʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$B^IV2\n2\u000b_N\u0016j~Lj\u000bq\u000e4\u0018ѱn2Qǁ\u0011_\u0018\u0013@GŌC9"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=.G;r3\f\u0013uk@\u000ec99\u00015K[R6e\u0011PG\u001c\u001dV\u0017R5\u0016Z", "", "u(E", "!`e2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=.G;r3\f\u0013uk@\u000ec99\u00015K[R6e(", "5dc T=>`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005!FYy\u001d>m_\u001cIT;x\n", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<TextFieldScrollerPosition, Object> getSaver() {
            return TextFieldScrollerPosition.Saver;
        }
    }
}
