package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
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
/* JADX INFO: compiled from: MeasuredPage.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4B\u0007\":0\u007f\u0007|jAӄLe^.Zݷ2\u000fyڔ<řc$\bCC٥\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001̓4Ic\u0002e\u0012\u0015=JoMFUoC=htD\u0005(2(;\u0002\u0005\u0017\u001a2H\u0016y\u0003Ca\f\u001a0Fq@ĥ#˟5\u001a@\u0005~}\u0011\"jgf6vmm>=%\u001bipO7i>\u007fe\u0013VV7\r%fL/P;C\u001b=S1\u000eb_M\u000bWqk\u000ex+55as\u0006Ah\u0006\"!CQ#\\!3l\u000b_n$)AN\u0012Z`\u00126\b\u0013{;M\u0014\u0012\u00149`.[-Ǵ\f\u000eA\t;_Nw\u001a^p(+eD@=\u007fa,\u00026tpy;GUg\u007f\u0013\r6#/og[ۣ\r_۶\u001aƘɐU3WjKs\u0017\u0016gi\u0006\u0004\u001f\u000b2.\u0012]_\u007f]*YJ%TO[gKQo\u0010f\\g%\u0006\u0011la\u001ajHn#\u001f\u001aE[!\f\tE-.y\u0003lXZ\u0018u\u001c\u0003\u000e.\u0018!St\u0004L#5\u0010|PxkzM\f\u000bSc-ƀ_̝jލĆ=`9j_\u001a`p`\f,?jcۖ\\lJͭ$\\b>0I\u0019x\u001e\u0004\u0014Fd\u000bA?\u0016ڧ\u001eٜ01!¢eZ\u0011\u001eZA+\n6ˊjʐ\u0003Z;ɴ\u001bk*\r\u0017\u0018!h~\t\u007fxw?Sʣ$έEQ=ӧvg0pL|Q\u0010U͵\u0002ěkROƂ\u0005\u0018{o\n;f&GaG=A UǾ4ī1ETǩ6][.?z+ze\u0093t\u05cek\brѱ||xhgTE#'b\u0001@ d.z \u0017Qĉoӝ\u000faFδ\u000b\u0005_[\\OM\u0011->=\u0001\u001eCSމ/ϡ+\u001d\u001eߐdA#duo\u007f0\nb=+#iZϽe݁sbYϡ\u0003GF[q~l5zК\u0005\u074cLj\u007f٤\u0013\u0018B\u000fKHoeވZ>UߒG\u007fl):$AdiH+q\u00143\\n\u0001ϕE\u0382\u0018^Kљaaam\u0006mycaͪ\u0011ё\n֊лm\u0011εA\"^Wp,\u0001\u001c\u0002<NAic-<7)jl\u0013ލ\rͲXm\u001e\u0012\u0001%T\u0006ʘ\u0017;JvAٻ*\u0003wdVN$ޣI\u0018"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001U\u0016*[SHk3\t\u0011ja\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120M'Dl>s", "7mS2k", "", "Ahi2", ">kP0X(;Z\u0019\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "DhbBT3(T\u001a\rzm", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "9dh", "", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "6na6m6Gb\u0015\u0006Ve0~\u00127e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "DdaA\\*:Zt\u0006~`5\u0005\t8t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "@de2e:>:\u0015\u0013\u0005n;", "", "uH8\u0019](OOb\u000f\nb3Fo3s\u000f}`'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u00044?DjA(\u0019gt\u0003\u0005m4Y\u00015G\u0016O6l[q9#\u0016d\u0017\u0018-\r\u0013hQ1nR\u0001\t\u00150I\u000bJd\u0010\u0010 \u0017\u000bQlKU\u001dQ}\u0014\t\u000b'rNdi\bG\u000bUfs@\u0013c\u001feB:-#0{%uTC\u0014\u0005b\ry(`cpF&\u0005<#Q7YPMz_Jtp/OES\u00196Z}3t6\u0013r\u001b6q\u0014Oe\u0014E4_\u00115[N1*5O\\=Uk\u0001vL\u000e2/eQ\u001ek9@bLawR\u001f\u0016<\u001bh5_n\u0005A[[30u\u001f6M\u0003K%~&\u0011P(vtIP$P\bcOD#[!\n\u0012D\"%<%Ji\rw4l\u001fI \u000fhEa?J", "1q^@f\bQW'l~s,", "5dc\u0010e6Lat\u0012~l\u001a\u0001\u001e/", "u(8", "5dc\u0016a+>f", "7rE2e;BQ\u0015\u0006", "5dc\u0018X@", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", ";`X;4?Ba\u007fz\u000fh<\fv3z\u007f", "\nrTA \u0006\u0017", "=eU@X;", "5dc\u001cY-LS(", ">kP0X(;Z\u0019h{_:|\u0018=", "", "5dc \\A>", "\u0018", ";`X;4?Ba\u0007\u0003\u0010^", "5dc\u001aT0G/,\u0003\tL0\u0012\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0010<U{ 3j\u001d.#\u0007\u001f", "/o_9l\u001a<`#\u0006\u0002=,\u0004\u0018+", "", "2d[AT", "5dc\u001cY-LS(FWc6LX64", "uH\u0018\u0017", ">kP0X", "Ab^=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", ">nb6g0H\\", ":`h<h;0W\u0018\u000e}", ":`h<h;!S\u001d\u0001}m", "1n_F", ";`X;4?Ba\u0001z\u0006", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "1n_F z-c\u001cL\u0001>", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIuzR", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MeasuredPage implements PageInfo {
    public static final int $stable = 8;
    private final int crossAxisSize;
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private int offset;
    private final int[] placeableOffsets;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    public /* synthetic */ MeasuredPage(int i2, int i3, List list, long j2, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, list, j2, obj, orientation, horizontal, vertical, layoutDirection, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MeasuredPage(int i2, int i3, List<? extends Placeable> list, long j2, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2) {
        this.index = i2;
        this.size = i3;
        this.placeables = list;
        this.visualOffset = j2;
        this.key = obj;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z2;
        this.isVertical = orientation == Orientation.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Placeable placeable = (Placeable) list.get(i4);
            iMax = Math.max(iMax, !this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.crossAxisSize = iMax;
        this.placeableOffsets = new int[this.placeables.size() * 2];
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getIndex() {
        return this.index;
    }

    public final int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public Object getKey() {
        return this.key;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getOffset() {
        return this.offset;
    }

    public final void position(int i2, int i3, int i4) {
        int width;
        this.offset = i2;
        this.mainAxisLayoutSize = this.isVertical ? i4 : i3;
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Placeable placeable = list.get(i5);
            int i6 = i5 * 2;
            if (this.isVertical) {
                int[] iArr = this.placeableOffsets;
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    throw new IllegalArgumentException("null horizontalAlignment".toString());
                }
                iArr[i6] = horizontal.align(placeable.getWidth(), i3, this.layoutDirection);
                this.placeableOffsets[i6 + 1] = i2;
                width = placeable.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i6] = i2;
                int i7 = i6 + 1;
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    throw new IllegalArgumentException("null verticalAlignment".toString());
                }
                iArr2[i7] = vertical.align(placeable.getHeight(), i4);
                width = placeable.getWidth();
            }
            i2 += width;
        }
    }

    public final void place(Placeable.PlacementScope placementScope) {
        int iM6767getYimpl;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        int size = this.placeables.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable placeable = this.placeables.get(i2);
            long jM1253getOffsetBjo55l4 = m1253getOffsetBjo55l4(i2);
            if (this.reverseLayout) {
                int iM6766getXimpl = this.isVertical ? IntOffset.m6766getXimpl(jM1253getOffsetBjo55l4) : (this.mainAxisLayoutSize - IntOffset.m6766getXimpl(jM1253getOffsetBjo55l4)) - getMainAxisSize(placeable);
                if (this.isVertical) {
                    iM6767getYimpl = (this.mainAxisLayoutSize - IntOffset.m6767getYimpl(jM1253getOffsetBjo55l4)) - getMainAxisSize(placeable);
                } else {
                    iM6767getYimpl = IntOffset.m6767getYimpl(jM1253getOffsetBjo55l4);
                }
                jM1253getOffsetBjo55l4 = IntOffsetKt.IntOffset(iM6766getXimpl, iM6767getYimpl);
            }
            long jM6770plusqkQi6aY = IntOffset.m6770plusqkQi6aY(jM1253getOffsetBjo55l4, this.visualOffset);
            if (this.isVertical) {
                Placeable.PlacementScope.m5582placeWithLayeraW9wM$default(placementScope, placeable, jM6770plusqkQi6aY, 0.0f, (Function1) null, 6, (Object) null);
            } else {
                Placeable.PlacementScope.m5580placeRelativeWithLayeraW9wM$default(placementScope, placeable, jM6770plusqkQi6aY, 0.0f, (Function1) null, 6, (Object) null);
            }
        }
    }

    public final void applyScrollDelta(int i2) {
        this.offset = getOffset() + i2;
        int length = this.placeableOffsets.length;
        for (int i3 = 0; i3 < length; i3++) {
            boolean z2 = this.isVertical;
            if ((z2 && i3 % 2 == 1) || (!z2 && i3 % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i3] = iArr[i3] + i2;
            }
        }
    }

    /* JADX INFO: renamed from: getOffset-Bjo55l4, reason: not valid java name */
    private final long m1253getOffsetBjo55l4(int i2) {
        int[] iArr = this.placeableOffsets;
        int i3 = i2 * 2;
        return IntOffsetKt.IntOffset(iArr[i3], iArr[i3 + 1]);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    /* JADX INFO: renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m1252copy4Tuh3kE(long j2, Function1<? super Integer, Integer> function1) {
        int iM6766getXimpl = this.isVertical ? IntOffset.m6766getXimpl(j2) : function1.invoke(Integer.valueOf(IntOffset.m6766getXimpl(j2))).intValue();
        boolean z2 = this.isVertical;
        int iM6767getYimpl = IntOffset.m6767getYimpl(j2);
        if (z2) {
            iM6767getYimpl = function1.invoke(Integer.valueOf(iM6767getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(iM6766getXimpl, iM6767getYimpl);
    }
}
