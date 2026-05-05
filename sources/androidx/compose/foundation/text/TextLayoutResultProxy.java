package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
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
/* JADX INFO: compiled from: TextLayoutResultProxy.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0010njG6LeN.ZS8\u0018s{:$c$\u007fHCU }*\teNogtW`ŏYƤ6\u0016'ille|k\u0012'2ppO;SoK;xvL\u0004N52@\u007f\u0005\u000f\u001eBJ&u)Fƚ\u0010\u0012>E9P`\u001be\u0005H!6B.\u00116\\\u0016]fNr]H@;\u0003\u0018T\u00173mC\u0015M;U\u0005+\u001b\u000by\u001eYU\u007fU#;k\u00035a\fC\u0011V\n=3\u0001W-1I\u0002pNX.&Ǽ*˽ոat,v\u0013l)\"5Ggcyb>,\u0006\u0018\u0014\rj\u001cٳ\u0005Ωρ2/ \u0005\u0016-{\r\u0001sXP0vr\u0004\t~N\u0017S\u0018yٿ߆\u001aƘЂe=\u001foE\u001eM%,F\u0019nOs\u0005\u0012n23T&iw҅ή<ʰݳ\u000e[C\u0012\u0012\u0013+\u00168)HG.G$\u0011\\/k7ڼ8\u05fa\u074co\u0004Nju\u0019UzvW\u0002T^?Pqlպ6Á\u0010fLߟ\u001dmVZf31O\"\\\u0015\u0007X-.^\u0010>7$>Q&ŝuҷQi\u0012ɘGh=c|r.Y?iA>\"r\u001eajvB@םf\u000b`٨ZU\u0012fj5β2Mr\u0013}ԝ`|\u000bƷ6f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=4?OuD-\u0002hoI\u000er\u0017[\u0001:[\"", "", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "7m]2e\u001b>f(_~^3{f9o\r'\u007fI|&\u0017U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "2dR<e(MW#\bWh?Z\u00139r~,\u0005<\u0010\u0017%", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W+v8D@y4A}%\u001bMQKrCs{dj8\u0014m0M\npEVV7f`r\u0007$\u0016$\u0015J?\u0017\u0015h\u000b\u000bjXA/\u0017\nS\fHg\u0005\u0015\u0012\u001d5xF)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUf\u0019pDJ3]X\u0015/r`=g\u0006]\u001eqV\u0003cvG'P{\u0015", "5dc\u0011X*H`\u0015\u000e~h5Y\u0013BC\n2\t?\u0005 \u0013Vo\u001c", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000f", "Adc\u0011X*H`\u0015\u000e~h5Y\u0013BC\n2\t?\u0005 \u0013Vo\u001c", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7|w", "5dc\u0016a5>`\b~\u000em\r\u0001\t6d]2\u0006M\u007f\u001b C~\u000eJ", "Adc\u0016a5>`\b~\u000em\r\u0001\t6d]2\u0006M\u007f\u001b C~\u000eJ", "5dc#T3NS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhd\u001cKw&=:CI{;-j", "5dc\u0019\\5>3\"}", "", ":h]2<5=S,", "Dhb6U3>3\"}", "", "5dc\u0019\\5>4#\fk^9\f\r-a\u0007\u0013\u0006N\u0005&\u001bQx", "DdaA\\*:Z", "", "5dc\u001cY-LS(_\u0005k\u0017\u0007\u00173t\u00042\u0005", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "1nT?V,\"\\\n\u0003\tb)\u0004\t\fo\u00101zN", "5dc\u001cY-LS(_\u0005k\u0017\u0007\u00173t\u00042\u0005\bN~\u001fGW^B", "uIIu<", "7r?<f0MW#\bdg\u001b|\u001c>", "=eU@X;", "7r?<f0MW#\bdg\u001b|\u001c>-\u0006oJGla~", "uI\u0018'", "BqP;f3:b\u0019]z\\6\n\u0005>i\n1jJd  G|kF\u000124]\u0007\u001cFm$", "BqP;f3:b\u0019]z\\6\n\u0005>i\n1jJd  G|kF\u000124]\u0007\u001cFm$u5)\u0003NIq\u0005'bC\u0017l+J\u0006+QUH9\\Yr9\"\u0012", "uI\u0018\u0017", "BqP;f3:b\u0019b\u0004g,\nw9D\u007f&\u0006M|&\u001bQxkF\u000124]\u0007\u001cFm$", "BqP;f3:b\u0019b\u0004g,\nw9D\u007f&\u0006M|&\u001bQxkF\u000124]\u0007\u001cFm$u5)\u0003NIq\u0005'bC\u0017l+J\u0006+QUH9\\Yr9\"\u0012", "1nT?V,=7\"o~l0y\u0010/B\n8\u0005?\u000f\u0001\u0018+x\u0019L\u0006\u00145l\r", "1nT?V,=7\"o~l0y\u0010/B\n8\u0005?\u000f\u0001\u0018+x\u0019L\u0006\u00145l\rg\u001fS]\u0011b\u0017+", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextLayoutResultProxy {
    public static final int $stable = 8;
    private LayoutCoordinates decorationBoxCoordinates;
    private LayoutCoordinates innerTextFieldCoordinates;
    private final TextLayoutResult value;

    public TextLayoutResultProxy(TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2) {
        this.value = textLayoutResult;
        this.innerTextFieldCoordinates = layoutCoordinates;
        this.decorationBoxCoordinates = layoutCoordinates2;
    }

    public /* synthetic */ TextLayoutResultProxy(TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLayoutResult, (2 & i2) != 0 ? null : layoutCoordinates, (i2 + 4) - (i2 | 4) != 0 ? null : layoutCoordinates2);
    }

    public final TextLayoutResult getValue() {
        return this.value;
    }

    public final LayoutCoordinates getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final void setInnerTextFieldCoordinates(LayoutCoordinates layoutCoordinates) {
        this.innerTextFieldCoordinates = layoutCoordinates;
    }

    public final LayoutCoordinates getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    public final void setDecorationBoxCoordinates(LayoutCoordinates layoutCoordinates) {
        this.decorationBoxCoordinates = layoutCoordinates;
    }

    /* JADX INFO: renamed from: getOffsetForPosition-3MmeM6k$default */
    public static /* synthetic */ int m1427getOffsetForPosition3MmeM6k$default(TextLayoutResultProxy textLayoutResultProxy, long j2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return textLayoutResultProxy.m1428getOffsetForPosition3MmeM6k(j2, z2);
    }

    /* JADX INFO: renamed from: getOffsetForPosition-3MmeM6k */
    public final int m1428getOffsetForPosition3MmeM6k(long j2, boolean z2) {
        if (z2) {
            j2 = m1426coercedInVisibleBoundsOfInputTextMKHz9U(j2);
        }
        return this.value.m6095getOffsetForPositionk4lQ0M(m1430translateDecorationToInnerCoordinatesMKHz9U$foundation_release(j2));
    }

    public final int getLineForVerticalPosition(float f2) {
        return this.value.getLineForVerticalPosition(Offset.m3938getYimpl(m1430translateDecorationToInnerCoordinatesMKHz9U$foundation_release(m1426coercedInVisibleBoundsOfInputTextMKHz9U(OffsetKt.Offset(0.0f, f2)))));
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResultProxy textLayoutResultProxy, int i2, boolean z2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        return textLayoutResultProxy.getLineEnd(i2, z2);
    }

    public final int getLineEnd(int i2, boolean z2) {
        return this.value.getLineEnd(i2, z2);
    }

    /* JADX INFO: renamed from: isPositionOnText-k-4lQ0M */
    public final boolean m1429isPositionOnTextk4lQ0M(long j2) {
        long jM1430translateDecorationToInnerCoordinatesMKHz9U$foundation_release = m1430translateDecorationToInnerCoordinatesMKHz9U$foundation_release(m1426coercedInVisibleBoundsOfInputTextMKHz9U(j2));
        int lineForVerticalPosition = this.value.getLineForVerticalPosition(Offset.m3938getYimpl(jM1430translateDecorationToInnerCoordinatesMKHz9U$foundation_release));
        return Offset.m3937getXimpl(jM1430translateDecorationToInnerCoordinatesMKHz9U$foundation_release) >= this.value.getLineLeft(lineForVerticalPosition) && Offset.m3937getXimpl(jM1430translateDecorationToInnerCoordinatesMKHz9U$foundation_release) <= this.value.getLineRight(lineForVerticalPosition);
    }

    /* JADX INFO: renamed from: translateDecorationToInnerCoordinates-MK-Hz9U$foundation_release */
    public final long m1430translateDecorationToInnerCoordinatesMKHz9U$foundation_release(long j2) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.innerTextFieldCoordinates;
        if (layoutCoordinates2 == null) {
            return j2;
        }
        if (!layoutCoordinates2.isAttached()) {
            layoutCoordinates2 = null;
        }
        if (layoutCoordinates2 == null || (layoutCoordinates = this.decorationBoxCoordinates) == null) {
            return j2;
        }
        LayoutCoordinates layoutCoordinates3 = layoutCoordinates.isAttached() ? layoutCoordinates : null;
        return layoutCoordinates3 == null ? j2 : layoutCoordinates2.mo5523localPositionOfR5De75A(layoutCoordinates3, j2);
    }

    /* JADX INFO: renamed from: translateInnerToDecorationCoordinates-MK-Hz9U$foundation_release */
    public final long m1431translateInnerToDecorationCoordinatesMKHz9U$foundation_release(long j2) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.innerTextFieldCoordinates;
        if (layoutCoordinates2 == null) {
            return j2;
        }
        if (!layoutCoordinates2.isAttached()) {
            layoutCoordinates2 = null;
        }
        if (layoutCoordinates2 == null || (layoutCoordinates = this.decorationBoxCoordinates) == null) {
            return j2;
        }
        LayoutCoordinates layoutCoordinates3 = layoutCoordinates.isAttached() ? layoutCoordinates : null;
        return layoutCoordinates3 == null ? j2 : layoutCoordinates3.mo5523localPositionOfR5De75A(layoutCoordinates2, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0017  */
    /* JADX INFO: renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long m1426coercedInVisibleBoundsOfInputTextMKHz9U(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.layout.LayoutCoordinates r4 = r5.innerTextFieldCoordinates
            if (r4 == 0) goto L17
            boolean r0 = r4.isAttached()
            if (r0 == 0) goto L22
            androidx.compose.ui.layout.LayoutCoordinates r3 = r5.decorationBoxCoordinates
            r2 = 0
            if (r3 == 0) goto L15
            r1 = 0
            r0 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.ui.layout.LayoutCoordinates.localBoundingBoxOf$default(r3, r4, r1, r0, r2)
        L15:
            if (r2 != 0) goto L1d
        L17:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L1d:
            long r0 = androidx.compose.foundation.text.TextLayoutResultProxyKt.m1432access$coerceIn3MmeM6k(r6, r2)
            return r0
        L22:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextLayoutResultProxy.m1426coercedInVisibleBoundsOfInputTextMKHz9U(long):long");
    }
}
