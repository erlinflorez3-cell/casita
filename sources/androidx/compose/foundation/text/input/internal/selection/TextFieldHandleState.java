package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.style.ResolvedTextDirection;
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
/* JADX INFO: compiled from: TextFieldHandleState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\u0015\"4ߚ\u007f\u0007|jA0JxP.`Y2şs{B0c$wCA٦ \u0014̝'m~g\u0016m\u0003Y)\u00042\u0016\u001a\u0007jDI\u0004ym\u0016\u001d4Zom6]sK=xtd\n060>\u0012\u0005/\u001bݵL\u0010\u0005\u0002\fR\u001a\"H@\u001f;\u0019ӏNM. \u0017V /!#ʨOʝGkԐ9ǂݭ\u0007kH`5lx\u0004[ ^TU\u0012=Ҵ\u001fsGEI-%\u0002\u0004Mҿ\\\b<M\u0007U\u0005\u0017ѧW1Ose6p\u007fB\u0016[U\u0013]\u0001(t\u0005\u007fc<-1OqOh\u000eV|+\u0002\u0013<\u0012\u0014\u001e'v/sֆeܕ\rޗϢvUFf\u0010u\u000b\u0011\tyN\u0017S\u0001c1G4~Sw:GM}߽\u0006U%1\u001b\u0007!\noT\u0602\u0014c[\u0006mIQnZ\u000fާ\t*L{\b\tb0/˙4M\b\u07fc\u0014\u00134\u001f3@,H1'\u0004\u0002vEϼz\u000bhåkkXRN-?-E,!\f\tG×\u0004ߘĥSW¯\u0015U$T\u0015\f \u0015&h\u0006Iq4\u001eNgh\u0018kܷa\u0010-Ä~9_}y\u0019æ9g;8Wӑ,\u0010Q~\u0014E[О\tw"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*o\u0001b@+n2F\u001b\u0017,\u001f", "", "Dhb6U3>", "", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "2ha2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#j Ew\u001d?MB*kG-sln9\u0005r0X\u007f|", "6`]1_,L1&\t\tl,{", "uY9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@3Dm\u0005 \u0001Z\u0016<WJLk3\r\u0015{p\u0018\u000bp,L\u0006+QU$!CX|L\u001b\u0016cWS<\u0015N]J3nQ@\u001b\u000fu(\u0002<d\u0011\u0013%k?s~Qc E\t\u001f\u0003)%uLYlO\u000b2", "5dc\u0011\\9>Q(\u0003\u0005g", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006\u00054I`}i$m$8TT;j#\u001e(w@=\u0014c*]z1P\"", "5dc\u0015T5=Z\u0019\rXk6\u000b\u0017/d", "u(I", "5dc\u001db:Bb\u001d\t\u0004&\rHf~Bqr", "u(9", "\u0018", "5dc#\\:BP ~", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(KB?wZX\fWJ", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "1n_F <;<\n\u0011jJ", "uY9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Vo!K@3Dm\u0005 \u0001Z\u0016<WJLk3\r\u0015{p\u0018\u000bp,L\u0006+QU$! 9nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\t6Y\u000b:d\u0010\u0010 \u0017~ypUeYK\u0003 \u0006PrlOh_\u0007P=L,8d\u0013_\u001bk>D-]`\u0019.w12\n\u0003Rsn[xng5(vG$\u0014", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldHandleState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TextFieldHandleState Hidden = new TextFieldHandleState(false, Offset.Companion.m3952getUnspecifiedF1C5BW0(), ResolvedTextDirection.Ltr, false, null);
    private final ResolvedTextDirection direction;
    private final boolean handlesCrossed;
    private final long position;
    private final boolean visible;

    public /* synthetic */ TextFieldHandleState(boolean z2, long j2, ResolvedTextDirection resolvedTextDirection, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, j2, resolvedTextDirection, z3);
    }

    /* JADX INFO: renamed from: copy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ TextFieldHandleState m1579copyubNVwUQ$default(TextFieldHandleState textFieldHandleState, boolean z2, long j2, ResolvedTextDirection resolvedTextDirection, boolean z3, int i2, Object obj) {
        if ((1 & i2) != 0) {
            z2 = textFieldHandleState.visible;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            j2 = textFieldHandleState.position;
        }
        if ((4 & i2) != 0) {
            resolvedTextDirection = textFieldHandleState.direction;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            z3 = textFieldHandleState.handlesCrossed;
        }
        return textFieldHandleState.m1581copyubNVwUQ(z2, j2, resolvedTextDirection, z3);
    }

    public final boolean component1() {
        return this.visible;
    }

    /* JADX INFO: renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m1580component2F1C5BW0() {
        return this.position;
    }

    public final ResolvedTextDirection component3() {
        return this.direction;
    }

    public final boolean component4() {
        return this.handlesCrossed;
    }

    /* JADX INFO: renamed from: copy-ubNVwUQ, reason: not valid java name */
    public final TextFieldHandleState m1581copyubNVwUQ(boolean z2, long j2, ResolvedTextDirection resolvedTextDirection, boolean z3) {
        return new TextFieldHandleState(z2, j2, resolvedTextDirection, z3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldHandleState)) {
            return false;
        }
        TextFieldHandleState textFieldHandleState = (TextFieldHandleState) obj;
        return this.visible == textFieldHandleState.visible && Offset.m3934equalsimpl0(this.position, textFieldHandleState.position) && this.direction == textFieldHandleState.direction && this.handlesCrossed == textFieldHandleState.handlesCrossed;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.visible) * 31) + Offset.m3939hashCodeimpl(this.position)) * 31) + this.direction.hashCode()) * 31) + Boolean.hashCode(this.handlesCrossed);
    }

    public String toString() {
        return "TextFieldHandleState(visible=" + this.visible + ", position=" + ((Object) Offset.m3945toStringimpl(this.position)) + ", direction=" + this.direction + ", handlesCrossed=" + this.handlesCrossed + ')';
    }

    private TextFieldHandleState(boolean z2, long j2, ResolvedTextDirection resolvedTextDirection, boolean z3) {
        this.visible = z2;
        this.position = j2;
        this.direction = resolvedTextDirection;
        this.handlesCrossed = z3;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m1582getPositionF1C5BW0() {
        return this.position;
    }

    public final ResolvedTextDirection getDirection() {
        return this.direction;
    }

    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    /* JADX INFO: compiled from: TextFieldHandleState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^ŸG\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*o\u0001b@+n2F\u001b\u0017,\b_Ep\f\b\u001f\u0012?sF", "", "u(E", "\u0016hS1X5", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@Pq,Uv%VPX5&ArP#r^\u000eU*o\u0001b@+n2F\u001b\u0017,\u001f", "5dc\u0015\\+=S\"", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u001a7XSJ58'$hnB\u0003ju\\v.GJ]0f[<,\u0014%inR+\u0014\u0004<=-mK7\r\u0017(X\u0002\u0011", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TextFieldHandleState getHidden() {
            return TextFieldHandleState.Hidden;
        }
    }
}
