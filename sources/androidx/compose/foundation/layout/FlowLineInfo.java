package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Dp;
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
/* JADX INFO: compiled from: ContextualFlowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\"B\u0012\u007f\u0007lxA0ReP.XT0ş\u0002ڔd$\n#2nK[ }0\tgN\u0016h~P`\u000bQ\u0011\u001e\u0016'k<O[xk\u0015'2psO9SoK>xtd\tڶ6\"F\u007fM1(>`\u0010%\u0010sO\u001a\u0012H@\u001f;\u0003\u0011[\u00072\u00124?P\u0005,_\u007fNdL\u001daH4;\u0003\u0018F\u0015ϋܸ/ŧ֔\u0011HZ=\u001b\u000e269@O5C&*Ή\u0013қ_K\u000bӊ\n?\u000bo5/KKy`DbP4#0g\r\fv|ؙ\u0011Ƣ_ϯ̥*NӍO^\u0016(\u0006\n\u0014\u000fB\u000f\u001c\u0012GJ4:(tX.Aw\u000bSnTXފNʎyʨڠ\u0016$ő79A\u001bt`y=\u001f^E\b%\u000f$4\u000f|qsb\u0010x\u0015IUN΄=ҨDIPݐ\"[C\u007f\u0012x\u0003\u00040\u0017>QČ/\u0005\u00191\u001dÈS\n8+!q!үH\u007f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"o=\u001exqbC\\", "", ":h]2<5=S,", "", ">nb6g0H\\|\bab5|", ";`g\u001aT0G/,\u0003\tL0\u0012\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", ";`g\u0010e6Lat\u0012~l\u001a\u0001\u001e/", "uH8\u00139\u0013D](\u0006~gu\u0002\u001a7/\u00041\u000b@\u000e \u0013N9l<w!E`\r}Av$=ZS9z>+|dn?\u0007p\u0002\u0012g", "5dc\u0019\\5>7\"}zqj}\u0013?n~$\u000bD\u000b \u0011Nk\"F\u00074/f}'7i$.", "u(8", "Adc\u0019\\5>7\"}zqj}\u0013?n~$\u000bD\u000b \u0011Nk\"F\u00074/f}'7i$.", "uH\u0018#", "5dc\u001aT?\u001c`#\r\t:?\u0001\u0017\u001di\u0015(C\u001fTv\u001c\u0017puzw/Eb|\u001cFq 7GJ7\u007f>.$bn9\u000ec(\\v", "u(5", "Adc\u001aT?\u001c`#\r\t:?\u0001\u0017\u001di\u0015(C\u000bQiaLi\\zw/Eb|\u001cFq 7GJ7\u007f>.$bn9\u000ec(\\v", "uE\u0018#", "\u0014", "5dc\u001aT?&O\u001d\bVq0\u000bv3z\u007foZ\u0014`\u001cfHWL=\u00015>Xy/;w\u001f(T?OuD-\u000fua@\u0007_:N", "Adc\u001aT?&O\u001d\bVq0\u000bv3z\u007foF\u0011Sa\u001cA>L=\u00015>Xy/;w\u001f(T?OuD-\u000fua@\u0007_:N", "5dc\u001db:Bb\u001d\t\u0004B5c\r8e>)\u0006P\n\u0016\u0013Vs\u0018Ep,1m\b0Fg#.TC7y4", "Adc\u001db:Bb\u001d\t\u0004B5c\r8e>)\u0006P\n\u0016\u0013Vs\u0018Ep,1m\b0Fg#.TC7y4", "CoS.g,", "", "CoS.g,\u0006\"\u001eOWA\u0019GG0o\u00101z<\u0010\u001b!Pi\u00158\u000b/Ehw-7t\u0016*[C", "uH8\u00139o/", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FlowLineInfo {
    public static final int $stable = 8;
    private int lineIndex;
    private float maxCrossAxisSize;
    private float maxMainAxisSize;
    private int positionInLine;

    public /* synthetic */ FlowLineInfo(int i2, int i3, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, f2, f3);
    }

    private FlowLineInfo(int i2, int i3, float f2, float f3) {
        this.lineIndex = i2;
        this.positionInLine = i3;
        this.maxMainAxisSize = f2;
        this.maxCrossAxisSize = f3;
    }

    public final int getLineIndex$foundation_layout_release() {
        return this.lineIndex;
    }

    public final void setLineIndex$foundation_layout_release(int i2) {
        this.lineIndex = i2;
    }

    public final int getPositionInLine$foundation_layout_release() {
        return this.positionInLine;
    }

    public final void setPositionInLine$foundation_layout_release(int i2) {
        this.positionInLine = i2;
    }

    /* JADX INFO: renamed from: getMaxMainAxisSize-D9Ej5fM$foundation_layout_release, reason: not valid java name */
    public final float m951getMaxMainAxisSizeD9Ej5fM$foundation_layout_release() {
        return this.maxMainAxisSize;
    }

    /* JADX INFO: renamed from: setMaxMainAxisSize-0680j_4$foundation_layout_release, reason: not valid java name */
    public final void m953setMaxMainAxisSize0680j_4$foundation_layout_release(float f2) {
        this.maxMainAxisSize = f2;
    }

    /* JADX INFO: renamed from: getMaxCrossAxisSize-D9Ej5fM$foundation_layout_release, reason: not valid java name */
    public final float m950getMaxCrossAxisSizeD9Ej5fM$foundation_layout_release() {
        return this.maxCrossAxisSize;
    }

    /* JADX INFO: renamed from: setMaxCrossAxisSize-0680j_4$foundation_layout_release, reason: not valid java name */
    public final void m952setMaxCrossAxisSize0680j_4$foundation_layout_release(float f2) {
        this.maxCrossAxisSize = f2;
    }

    /* JADX INFO: renamed from: update-4j6BHR0$foundation_layout_release, reason: not valid java name */
    public final void m954update4j6BHR0$foundation_layout_release(int i2, int i3, float f2, float f3) {
        this.lineIndex = i2;
        this.positionInLine = i3;
        this.maxMainAxisSize = f2;
        this.maxCrossAxisSize = f3;
    }

    public /* synthetic */ FlowLineInfo(int i2, int i3, float f2, float f3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i4) | ((-1) - 1)) != 0 ? 0 : i2, (-1) - (((-1) - i4) | ((-1) - 2)) != 0 ? 0 : i3, (4 & i4) != 0 ? Dp.m6638constructorimpl(0) : f2, (i4 + 8) - (i4 | 8) != 0 ? Dp.m6638constructorimpl(0) : f3, null);
    }
}
