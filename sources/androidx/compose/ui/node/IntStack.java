package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: MyersDiff.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4F\u0007\":%\u007fјnjG9LeN7ZS8\u000fs{:/a$\bّkUH|b\u0014_Rug\u0007J\t\fß\u0013\u0006$z3BW^\u0011]@\u0019bF}JKM\u001e>id\u0003B\u001d `#~yM\u0010(7`\u0010%{sO\u001a H@\u001f;\u0019ҏMM\u001e \u0015V /(%\u0006\\F`l\f;_'\u0011zZNU``\u0001[\u001f^TU\u000e'e,>X7c\u0016kSK\u000b`oW\u0003mr\u0006!v<?+w\n\b:f\u0017,\u0015YP=a\u0001>t\u0005\u007fa<+9S{K~\u000fp\u001c\t\u0015%<2$6+VHE\u001a\u0015\t>7\u0003\u000ek@~\u0003\u000fF\u000e\u0017y6E&079V3f\u007fb\u00047\\U\u0014\u0005;4S\u0005|2sT<aE\u001fb\ni1\u007fAmL\\\u001dq=\u001c\u00057bJ.\u0012O_\u007f]\u0012YD%EO[g9Qo\u0010i\\g%\u0006\u0011la\fjHn#5\u0016\b6\u0017\u000frD\u0013\u0006B¯`г0\u0011Uȼ%\u0016\f\f+ \u000bxreٚ\u0014Rgjoo[cZ1=mOY\u001dsdæEӷ75Yү߭eu"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9qE\u0006\u0013DU{&\r", "", "7mXA\\(E1\u0015\nv\\0\f\u001d", "", "uH\u0018#", ":`bA<5=S,", "Ahi2", "5dc \\A>", "u(8", "AsP0^", "", "1n\\=T9>2\u001dz|h5x\u0010", "", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "5dc", "7mS2k", "7r=<g\fF^(\u0013", ">`aA\\;B]\"", "AsP?g", "3mS", "3kB6m,", ">n_", ">tb570:U#\bve", "", "F", "G", ">tb5E(GU\u0019", "=kS g(Kb", "=kS\u0012a+", "<df g(Kb", "<df\u0012a+", "?tX0^\u001aH`(", "AnaA70:U#\bve:", "AvP=70:U#\bve", "7", "8", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class IntStack {
    private int lastIndex;
    private int[] stack;

    public IntStack(int i2) {
        this.stack = new int[i2];
    }

    public final int get(int i2) {
        return this.stack[i2];
    }

    public final int getSize() {
        return this.lastIndex;
    }

    public final void pushRange(int i2, int i3, int i4, int i5) {
        int i6 = this.lastIndex;
        int i7 = i6 + 4;
        int[] iArr = this.stack;
        if (i7 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.stack = iArrCopyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i6] = i2;
        iArr2[i6 + 1] = i3;
        iArr2[i6 + 2] = i4;
        iArr2[i6 + 3] = i5;
        this.lastIndex = i7;
    }

    public final void pushDiagonal(int i2, int i3, int i4) {
        int i5 = this.lastIndex;
        int i6 = i5 + 3;
        int[] iArr = this.stack;
        if (i6 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.stack = iArrCopyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i5] = i2 + i4;
        iArr2[i5 + 1] = i3 + i4;
        iArr2[i5 + 2] = i4;
        this.lastIndex = i6;
    }

    public final int pop() {
        int[] iArr = this.stack;
        int i2 = this.lastIndex - 1;
        this.lastIndex = i2;
        return iArr[i2];
    }

    public final boolean isNotEmpty() {
        return this.lastIndex != 0;
    }

    public final void sortDiagonals() {
        int i2 = this.lastIndex;
        if (!(i2 % 3 == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Array size not a multiple of 3");
        }
        if (i2 > 3) {
            quickSort(0, i2 - 3, 3);
        }
    }

    private final void quickSort(int i2, int i3, int i4) {
        if (i2 < i3) {
            int iPartition = partition(i2, i3, i4);
            quickSort(i2, iPartition - i4, i4);
            quickSort(iPartition + i4, i3, i4);
        }
    }

    private final int partition(int i2, int i3, int i4) {
        int i5 = i2 - i4;
        while (i2 < i3) {
            if (compareDiagonal(i2, i3)) {
                i5 += i4;
                swapDiagonal(i5, i2);
            }
            i2 += i4;
        }
        int i6 = i5 + i4;
        swapDiagonal(i6, i3);
        return i6;
    }

    private final void swapDiagonal(int i2, int i3) {
        int[] iArr = this.stack;
        MyersDiffKt.swap(iArr, i2, i3);
        MyersDiffKt.swap(iArr, i2 + 1, i3 + 1);
        MyersDiffKt.swap(iArr, i2 + 2, i3 + 2);
    }

    private final boolean compareDiagonal(int i2, int i3) {
        int[] iArr = this.stack;
        int i4 = iArr[i2];
        int i5 = iArr[i3];
        if (i4 >= i5) {
            return i4 == i5 && iArr[i2 + 1] <= iArr[i3 + 1];
        }
        return true;
    }
}
