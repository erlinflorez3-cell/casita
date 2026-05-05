package androidx.compose.material3.internal;

import androidx.compose.material3.MenuKt;
import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: MenuPosition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tpAӄLe^.ZS@\u000fs{J$c$wDCU(}*\tUNog\u0005Jb\u000bI\u0015\u000e\u0016\u000fj4I[\u0001e\u0012%2JģG3coEʠhtL\u0005(2(B\u0002\u0005\u000f#2Ϻ\u0018v\tŏS\f\u00180HpH^\u0015˟\u000b܇\u0018\u001c̄P\u0001L[(&FLz]R/Q\u0004yF\\)w0+P\u001dLZ'\u001bzy\u001eYEGk\u001b%a\t\u001f\u0003kP\u0013N Eݾl1-4Yy]@h\u0002\u001a\u001bQZ\u001dn\u00035\u000b\rŌd\u0016-4_iQZ\u001e*}\u0001\"\u0019L\u0006\u001e\u0006UU\\4բj\b\u001cA=#ach\u0002\rf0~oA/%.;[=)\fiai?~;\n,%\u001eQ)\u001f%i}&`CA\u001b\fϼ0҅͘AJT4gh6\u0018~\u000f\u001a*21\u000eŐ0ʾ\u0010-ш$ڛ٦=%'\u0019\u0010\\\rn\u00053xh\u0002l\u0019\u0379Aju$fB\t:_\u000b¥\u00064\bb\tDA]-d\u0016,\u0010˙$f}E1+\u0016X_jopsh\u001a6?ueaˇo\u0018]Bn9;[s\u0012gX\u001d O>r\u0005\u0007spZRɞ]p\f@y\u0003\u0010&ӻtT\u0012\u0013@?\n\u001cb-a\u001fb\u0015V\u00056Bo\u007f9e`h\u001e\u0003l3R\b\u001aZz\t\u000fVt!\u007fx\tXZ\u0005˃&7GZE\u001f,_2j:\u0003I\u0012\u000f\u0005\u0010V\u0016TܤPv\u001c~e\u0002& *;W5c\u001f\u001f\u0001920:sS9ГP͠\u0011\u05fdϸ\u0001{\u0015mva0\u0019x%D`\u0019\u007f\u007fZ%X\u000f`\t\"6\u001cFدb\u000f\u0002U\u001cl\u000b\nC\u0010ϖ\u0002\"C\\q\u0015\u0005MXḵnr\tC<['K&NҤ1ֵe]q۰~\u0006p >t\u0014\u0014\u0003Ϧ\u0018̔fQeЦ\fDWk\u0017>P4CÚD\u05f8nw\u0010ȷYK\u001b3`A\u0013q\u00817ԇÊ.|֨\u000b4\u0015pdpR\u0015u\u0011BB09\u0002E\u0016\u0014\rFѼ\u0015S[܊\u0006oQr\u0019a_\u0016\u0019\u0014In@5\u0014յX͓f\t8үD$D[Sb3U_Ӛ6ʙ@\b\u0013͏%)\u0014\u0016\u00130Vp\u001f&`JǠ?`\u0014]\tb\\R\u0015bKfG5\u0011\u0010\u001fBL\u0001\u00985\u000fsOd5i<\u0011U#\u000fAv_\u0001v%YQ\u0003@Ь,^\tՊ]_Id\u0010RTS7\u000b\u0004o:QnԀ\u001fÐ\u001c\u001bAܱak\u0005Nv\u000b\u0004}%ЉxՆjRVÝy\u000b\t\u001c&<8\u001faĂQζsb5ً\u001f\u0004Ec2\u0001ET\u007fܐ\u000eƔgF#ҎVD;AajB,ٖ[YCջ \"&H\u0012\u0017ը\\`\u0016i\u0010ܣ7h\u0015y\u0016h!ƪ\u0017\f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\rZMFj>0\u001ePaB\u0017N6\\z6KVW\u0017i\\\u0004A\u0013\u0012gc", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006a/@i\t\u000bA{\u001a=QMDVA(&l`9\u00149", "1n]AX5M=\u001a\u007f\t^;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lG`&6g}/\r", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "DdaA\\*:Z\u0001z\b`0\u0006", "", "=m?<f0MW#\bXZ3z\u00196a\u000f(z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00125W\ru", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "/mR5b9\u001b])\byl", ";d]B56N\\\u0018\r", "", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KCy\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018Wwbk_K3uH@h\r=QK?q\u0010\f#\u00171q:!V\u0011C\n\u001c\u0005\u001f3qThl\nEPOo\u0012`\u0019e\u001di\u0010}\u0015", "0ncAb4-]t\bxa6\nw9p", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0016MLKV>,\u0019weC\u0010\"\u001dN\u00046KJJ32", "0ncAb4-]\u000b\u0003\u0004]6\u000fe9t\u000f2\u0004", "1d]AX9-]t\bxa6\nw9p", "5dc\u0010b5MS\"\u000ed_-\u000b\t>-l\u000eZ*qd~", "u(9", "\u0018", "5dc\u0011X5LW(\u0013", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "3mS!b\bGQ\u001c\t\b>5{", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0016MLKV>,\u0019weC\u0010\"\u000fX\u0004+\\VW;XYH", ":dUAG60W\"}\u0005p\u0013|\n>", "5dc\u001ca\u0017Ha\u001d\u000e~h5Z\u00056c\u0010/wO\u0001\u0016", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "@hV5g\u001bHE\u001d\byh>i\r1h\u000f", "AsP?g\u001bH/\"|}h9j\u0018+r\u000f", "Bn_!b\bGQ\u001c\t\b;6\f\u00189m", "Bn_!b\u001eB\\\u0018\t\rM6\b", "5dc#X9MW\u0017z\u0002F(\n\u000b3n", "u(8", "1`[0h3:b\u0019i\u0005l0\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "Eh]1b>,W.~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ">n_Bc\nH\\(~\u0004m\u001a\u0001\u001e/", "1`[0h3:b\u0019i\u0005l0\f\r9nG/\u0003Rqyy\u0016", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W \u007f4\"Y{/\rR|*VBHu8\u001d(2_C\u000fn6\\vpWP\u0018<eV\u0002\u0007z\u000en\u0018^:k\tfA\"}HA(]\u0011\rf", "1n\\=b5>\\(J", "1n\\=b5>\\(JBK\u0012[r 3g", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "1n_F </fuq\u0001p", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KCy\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WwbH@=-mQA#\u0007?\u0013\u007fEp\f\u0016$\u000e~rlQV\u001dKu\u001cC\u000b-qUYl\u0003CH\u000fA7n\u0017^'nC\"$\u001d\u0002\u0004%vT=\u000e\u0006\\{\u007f\\\u000bkfG&P", "3pd._:", "", "=sW2e", "", "6`b566=S", "BnBAe0GU", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final MenuPosition.Vertical bottomToAnchorTop;
    private final MenuPosition.Vertical bottomToWindowBottom;
    private final MenuPosition.Vertical centerToAnchorTop;
    private final long contentOffset;
    private final Density density;
    private final MenuPosition.Horizontal endToAnchorEnd;
    private final MenuPosition.Horizontal leftToWindowLeft;
    private final Function2<IntRect, IntRect, Unit> onPositionCalculated;
    private final MenuPosition.Horizontal rightToWindowRight;
    private final MenuPosition.Horizontal startToAnchorStart;
    private final MenuPosition.Vertical topToAnchorBottom;
    private final MenuPosition.Vertical topToWindowTop;
    private final int verticalMargin;

    public /* synthetic */ DropdownMenuPositionProvider(long j2, Density density, int i2, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, density, i2, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-uVxBXkw$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m2915copyuVxBXkw$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j2, Density density, int i2, Function2 function2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            j2 = dropdownMenuPositionProvider.contentOffset;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        if ((i3 + 4) - (4 | i3) != 0) {
            i2 = dropdownMenuPositionProvider.verticalMargin;
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            function2 = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m2917copyuVxBXkw(j2, density, i2, function2);
    }

    /* JADX INFO: renamed from: component1-RKDOV3M, reason: not valid java name */
    public final long m2916component1RKDOV3M() {
        return this.contentOffset;
    }

    public final Density component2() {
        return this.density;
    }

    public final int component3() {
        return this.verticalMargin;
    }

    public final Function2<IntRect, IntRect, Unit> component4() {
        return this.onPositionCalculated;
    }

    /* JADX INFO: renamed from: copy-uVxBXkw, reason: not valid java name */
    public final DropdownMenuPositionProvider m2917copyuVxBXkw(long j2, Density density, int i2, Function2<? super IntRect, ? super IntRect, Unit> function2) {
        return new DropdownMenuPositionProvider(j2, density, i2, function2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
        return DpOffset.m6698equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && Intrinsics.areEqual(this.density, dropdownMenuPositionProvider.density) && this.verticalMargin == dropdownMenuPositionProvider.verticalMargin && Intrinsics.areEqual(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    public int hashCode() {
        return (((((DpOffset.m6703hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + Integer.hashCode(this.verticalMargin)) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m6706toStringimpl(this.contentOffset)) + ", density=" + this.density + ", verticalMargin=" + this.verticalMargin + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DropdownMenuPositionProvider(long j2, Density density, int i2, Function2<? super IntRect, ? super IntRect, Unit> function2) {
        this.contentOffset = j2;
        this.density = density;
        this.verticalMargin = i2;
        this.onPositionCalculated = function2;
        int iMo704roundToPx0680j_4 = density.mo704roundToPx0680j_4(DpOffset.m6699getXD9Ej5fM(j2));
        this.startToAnchorStart = MenuPosition.INSTANCE.startToAnchorStart(iMo704roundToPx0680j_4);
        this.endToAnchorEnd = MenuPosition.INSTANCE.endToAnchorEnd(iMo704roundToPx0680j_4);
        this.leftToWindowLeft = MenuPosition.INSTANCE.leftToWindowLeft(0);
        this.rightToWindowRight = MenuPosition.INSTANCE.rightToWindowRight(0);
        int iMo704roundToPx0680j_42 = density.mo704roundToPx0680j_4(DpOffset.m6701getYD9Ej5fM(j2));
        this.topToAnchorBottom = MenuPosition.INSTANCE.topToAnchorBottom(iMo704roundToPx0680j_42);
        this.bottomToAnchorTop = MenuPosition.INSTANCE.bottomToAnchorTop(iMo704roundToPx0680j_42);
        this.centerToAnchorTop = MenuPosition.INSTANCE.centerToAnchorTop(iMo704roundToPx0680j_42);
        this.topToWindowTop = MenuPosition.INSTANCE.topToWindowTop(i2);
        this.bottomToWindowBottom = MenuPosition.INSTANCE.bottomToWindowBottom(i2);
    }

    /* JADX INFO: renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m2918getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    public final Density getDensity() {
        return this.density;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j2, Density density, int i2, Function2 function2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, density, (i3 + 4) - (4 | i3) != 0 ? density.mo704roundToPx0680j_4(MenuKt.getMenuVerticalMargin()) : i2, (-1) - (((-1) - i3) | ((-1) - 8)) != 0 ? new Function2<IntRect, IntRect, Unit>() { // from class: androidx.compose.material3.internal.DropdownMenuPositionProvider.2
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(IntRect intRect, IntRect intRect2) {
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
                invoke2(intRect, intRect2);
                return Unit.INSTANCE;
            }
        } : function2, null);
    }

    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public final Function2<IntRect, IntRect, Unit> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public long mo682calculatePositionllwVHH4(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        MenuPosition.Horizontal horizontal;
        int iMo2909position95KtPRI;
        MenuPosition.Vertical vertical;
        MenuPosition.Horizontal[] horizontalArr = new MenuPosition.Horizontal[3];
        int i2 = 0;
        horizontalArr[0] = this.startToAnchorStart;
        horizontalArr[1] = this.endToAnchorEnd;
        if (IntOffset.m6766getXimpl(intRect.m6789getCenternOccac()) < IntSize.m6808getWidthimpl(j2) / 2) {
            horizontal = this.leftToWindowLeft;
        } else {
            horizontal = this.rightToWindowRight;
        }
        horizontalArr[2] = horizontal;
        List listListOf = CollectionsKt.listOf((Object[]) horizontalArr);
        int size = listListOf.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                iMo2909position95KtPRI = 0;
                break;
            }
            iMo2909position95KtPRI = ((MenuPosition.Horizontal) listListOf.get(i3)).mo2909position95KtPRI(intRect, j2, IntSize.m6808getWidthimpl(j3), layoutDirection);
            if (i3 == CollectionsKt.getLastIndex(listListOf) || (iMo2909position95KtPRI >= 0 && IntSize.m6808getWidthimpl(j3) + iMo2909position95KtPRI <= IntSize.m6808getWidthimpl(j2))) {
                break;
            }
            i3++;
        }
        MenuPosition.Vertical[] verticalArr = new MenuPosition.Vertical[4];
        verticalArr[0] = this.topToAnchorBottom;
        verticalArr[1] = this.bottomToAnchorTop;
        verticalArr[2] = this.centerToAnchorTop;
        if (IntOffset.m6767getYimpl(intRect.m6789getCenternOccac()) < IntSize.m6807getHeightimpl(j2) / 2) {
            vertical = this.topToWindowTop;
        } else {
            vertical = this.bottomToWindowBottom;
        }
        verticalArr[3] = vertical;
        List listListOf2 = CollectionsKt.listOf((Object[]) verticalArr);
        int size2 = listListOf2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            int iMo2910positionJVtK1S4 = ((MenuPosition.Vertical) listListOf2.get(i4)).mo2910positionJVtK1S4(intRect, j2, IntSize.m6807getHeightimpl(j3));
            if (i4 == CollectionsKt.getLastIndex(listListOf2) || (iMo2910positionJVtK1S4 >= this.verticalMargin && IntSize.m6807getHeightimpl(j3) + iMo2910positionJVtK1S4 <= IntSize.m6807getHeightimpl(j2) - this.verticalMargin)) {
                i2 = iMo2910positionJVtK1S4;
                break;
            }
        }
        long jIntOffset = IntOffsetKt.IntOffset(iMo2909position95KtPRI, i2);
        this.onPositionCalculated.invoke(intRect, IntRectKt.m6798IntRectVbeCjmY(jIntOffset, j3));
        return jIntOffset;
    }
}
