package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: Vertices.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r@4\u0012\u000e\u0007nj?0Le^.Zݷ2\u000fy\u0002<řc$\u007fVCU }*\t]cogtJb\u000bQ!\u000e\u0016~rBկ\u0006x\f\u0011OuRsM3eok:p~D\u0007882:\n\u0005/\u001eXK \u0001\tHc\u0012\"2PphV;P\u0015$ \fV&\u0011 lg|=vomD=+\u001boRP7_^\u0006{\u0010ТX'\u001b\u0001*29XO5C0\u0004\r\u0015XsE\u0013A\u0002=3oU*qI<kDq\u0018\u0014C<\u007f\u0017k\r>b\u0015Sp\fU/}f\u0012P^7\u0006\u0001\u0014\rj\u000f؝\n-P͓E\u001cl\u0014\u001c@E\u0002aHh\u0002\rPȸ~g>Ѝ=\u00029:G+7`o=1Ne\r˿\u0011$+Ч\u0007#af\u001cse*b|i1\u007fQףLT\u0012ԯUo\n\u0005p\u0015z\u001b>G\u0018/*\u0012ҽ\u0016¦ܔZ8؝%s\nHR~\u000f\u0007f}a\u007fɰHI*q\u001c֕F7\u000bbDj$\u0080To"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n&Y\u000b/;k\u0016<#", "", "DdaAX?&]\u0018~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n&Y\u000b/7\u0001}8LC\u0011", ">nb6g0H\\'", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "BdgAh9>1#\t\b]0\u0006\u0005>e\u000e", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "7mS6V,L", "", "uH;7T=:\u001d)\u000e~euc\r=tU\u000f\u0001<\u0012\u0013`W~\u0012C@\f9g\ru\u001er\u0012?I\rKz8%^OeG\u00169\u0013Sr8C\u0016^;`Y<$\u0018 ic51\u0017\u0014`E-8IH'Q0R\u0011;u\n\b\u001dW\u0014jq>f\u0017VW\u001f~O8uVWn\u0004T)Ao0d\u00195`M", "", "5dc\u0010b3H`'", "u(J\u0016", "", "5dc\u0016a+BQ\u0019\r", "u(J ", "", "5dc\u001db:Bb\u001d\t\u0004l", "u(J\u0013", "5dc!X?Mc&~Xh6\n\b3n{7{N", "5dc#X9MS,f\u0005],D\u0007{x{8w$", "u(8", "\u0017", "3mR<W,\u001c] \t\bE0\u000b\u0018", "3mR<W,)]\u001d\b\nE0\u000b\u0018", ">nX;g:", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Vertices {
    private final int[] colors;
    private final short[] indices;
    private final float[] positions;
    private final float[] textureCoordinates;
    private final int vertexMode;

    public /* synthetic */ Vertices(int i2, List list, List list2, List list3, List list4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, list, list2, list3, list4);
    }

    private Vertices(int i2, final List<Offset> list, List<Offset> list2, List<Color> list3, List<Integer> list4) {
        this.vertexMode = i2;
        Function1<Integer, Boolean> function1 = new Function1<Integer, Boolean>() { // from class: androidx.compose.ui.graphics.Vertices$outOfBounds$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Boolean invoke(int i3) {
                return Boolean.valueOf(i3 < 0 || i3 >= list.size());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                return invoke(num.intValue());
            }
        };
        if (list2.size() != list.size()) {
            throw new IllegalArgumentException("positions and textureCoordinates lengths must match.");
        }
        if (list3.size() != list.size()) {
            throw new IllegalArgumentException("positions and colors lengths must match.");
        }
        int size = list4.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (function1.invoke(list4.get(i3)).booleanValue()) {
                throw new IllegalArgumentException("indices values must be valid indices in the positions list.");
            }
        }
        this.positions = encodePointList(list);
        this.textureCoordinates = encodePointList(list2);
        this.colors = encodeColorList(list3);
        int size2 = list4.size();
        short[] sArr = new short[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            sArr[i4] = (short) list4.get(i4).intValue();
        }
        this.indices = sArr;
    }

    /* JADX INFO: renamed from: getVertexMode-c2xauaI, reason: not valid java name */
    public final int m4580getVertexModec2xauaI() {
        return this.vertexMode;
    }

    public final float[] getPositions() {
        return this.positions;
    }

    public final float[] getTextureCoordinates() {
        return this.textureCoordinates;
    }

    public final int[] getColors() {
        return this.colors;
    }

    public final short[] getIndices() {
        return this.indices;
    }

    private final int[] encodeColorList(List<Color> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ColorKt.m4232toArgb8_81llA(list.get(i2).m4188unboximpl());
        }
        return iArr;
    }

    private final float[] encodePointList(List<Offset> list) {
        int size = list.size() * 2;
        float[] fArr = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            long jM3947unboximpl = list.get(i2 / 2).m3947unboximpl();
            fArr[i2] = i2 % 2 == 0 ? Offset.m3937getXimpl(jM3947unboximpl) : Offset.m3938getYimpl(jM3947unboximpl);
        }
        return fArr;
    }
}
