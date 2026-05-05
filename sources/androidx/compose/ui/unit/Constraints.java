package androidx.compose.ui.unit;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmInline;
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
/* JADX INFO: compiled from: Constraints.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4C\u0007\":\u0018\u007f\u0007lkA0RnP.Xr2\u000fy\b<$a&wٙykڼ\u001cP9O|f mx\u001b\u0018S\u0013\u0014\u0016\u0011jZJǤ|_\u0018\u0011@E8xAn\b=gś%<\u000b @@Py3\u0006J0N\u0010\u0005\u0015[K:\u0017`Fv:`)e\u0005H\u00176D&\u0001,t\u007fNdMɆ\\ŽȻ\"\u0002ݦFP-\u0002> \u0016%Tx?\r%jN1N\\M\u0017;R1\u0006\u0019Đ@ƄCsC+vNo9W\u001co6\u0007\u0005Zǚ*̠\u0011_xOj\f\u001am\u001aQCO\u0012v\u0017\"߭{|\u00029J1^\u00195LF-Hk>Շ3KɄUĖT\u0006vD\u0006\u0001o=g4\u000e;C9Io\b&ޅ\u001dRO}\u000b\u0017,.Q}/gl\u000e\u000f\u001eQ\u0019ɐU5iBCU\\\u0015*U{\u0012\tb03:t\u001eđ1ɨ\u00158''=jG39m\bYRrG\u001dnzki\u0001QvfEݳ9Ҋ\r\u0016jFj\u0018y`lZ2%['%\u001f\f\u001d+ \u000b\u0001re{ĳPћlszOc 3?~9_\u0006y\u0019(HlKMQ\u0012\u0015\u0018\u0017λ\u0018CTd\u000bqtI$\u001bhv@\"`M!Tȑ\u007fHf\u000e\u0019MMxlC:M1\\CM9bնE\u0001!a`\u0006\u001e\u0006%B2!\u0002$#\u000e7\u0015ʷts\u007fzOK\u000bgrAOQM\u0019TVXֻ\u000bì%ȷ\u0003y\bøwNMlz&߸T{ \u0015\u001agRȀ=\u001c\u0017~/Q\n0Kʅ\u000f\u0014P̐\u0016V"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "4nRBf\u0010GR\u0019\u0012", "", "5dc\u0013b*Na|\by^?D\r7p\u0007", "uI\u0018\u0016", "6`b\u000fb<GR\u0019}]^0~\f>", "", "5dc\u0015T:\u001b])\by^+_\t3g\u00037CD\t\"\u001e", "uI\u0018'", "6`b\u000fb<GR\u0019}lb+\f\f", "5dc\u0015T:\u001b])\by^+n\r.t\u0003o\u007fH\f\u001e", "6`b\u0013\\?>R{~~`/\f", "5dc\u0015T:\u001fW,~yA,\u0001\u000b2t>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "u(E", "5dc\u0015T:\u001fW,~yA,\u0001\u000b2tG,\u0004K\b", "6`b\u0013\\?>R\u000b\u0003ym/", "5dc\u0015T:\u001fW,~yP0{\u00182${1\u0005J\u0010\u0013&Ky\u0017J", "5dc\u0015T:\u001fW,~yP0{\u00182-\u00040\u0007G", "7rI2e6", "7rI2e6|O\"\b\u0005m(\f\r9n\u000e", "7rI2e6\u0006W!\n\u0002", ";`g\u0015X0@V(", "5dc\u001aT?!S\u001d\u0001}ms\u0001\u0011:l", ";`g$\\+MV", "5dc\u001aT?0W\u0018\u000e}&0\u0005\u00146", ";h]\u0015X0@V(", "5dc\u001a\\5!S\u001d\u0001}ms\u0001\u0011:l", ";h]$\\+MV", "5dc\u001a\\50W\u0018\u000e}&0\u0005\u00146", "5dc#T3NSWz\u0004g6\f\u0005>i\n1\n", "1n_F", "1n_F !;Se_y:", "uI8\u0016<\u0010\u00028", "3pd._:", "=sW2e", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class Constraints {
    public static final Companion Companion = new Companion(null);
    public static final int Infinity = Integer.MAX_VALUE;
    private final long value;

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ Constraints m6579boximpl(long j2) {
        return new Constraints(j2);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static long m6580constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m6583equalsimpl(long j2, Object obj) {
        return (obj instanceof Constraints) && j2 == ((Constraints) obj).m6597unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m6584equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX INFO: renamed from: getFocusIndex-impl */
    private static final int m6585getFocusIndeximpl(long j2) {
        return (int) (j2 & 3);
    }

    /* JADX INFO: renamed from: getHasBoundedHeight-impl */
    public static final boolean m6586getHasBoundedHeightimpl(long j2) {
        int i2 = (int) ((3 + j2) - (3 | j2));
        int i3 = (((i2 + 1) - (1 | i2)) << 1) + ((((i2 + 2) - (i2 | 2)) >> 1) * 3);
        int i4 = (1 << (18 - i3)) - 1;
        int i5 = (int) (j2 >> (i3 + 46));
        return (i5 + i4) - (i5 | i4) != 0;
    }

    /* JADX INFO: renamed from: getHasBoundedWidth-impl */
    public static final boolean m6587getHasBoundedWidthimpl(long j2) {
        int i2 = (int) ((-1) - (((-1) - 3) | ((-1) - j2)));
        return (((int) (j2 >> 33)) & ((1 << (((((i2 + 1) - (1 | i2)) << 1) + ((((-1) - (((-1) - i2) | ((-1) - 2))) >> 1) * 3)) + 13)) - 1)) != 0;
    }

    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    /* JADX INFO: renamed from: getHasFixedHeight-impl */
    public static final boolean m6588getHasFixedHeightimpl(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = (((i2 + 1) - (1 | i2)) << 1) + ((((i2 + 2) - (i2 | 2)) >> 1) * 3);
        int i4 = (1 << (18 - i3)) - 1;
        int i5 = (int) (j2 >> (i3 + 15));
        int i6 = (i5 + i4) - (i5 | i4);
        int i7 = (-1) - (((-1) - ((int) (j2 >> (i3 + 46)))) | ((-1) - i4));
        return i6 == (i7 == 0 ? Integer.MAX_VALUE : i7 - 1);
    }

    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    /* JADX INFO: renamed from: getHasFixedWidth-impl */
    public static final boolean m6589getHasFixedWidthimpl(long j2) {
        int i2 = (int) ((-1) - (((-1) - 3) | ((-1) - j2)));
        int i3 = (1 << (((((-1) - (((-1) - i2) | ((-1) - 1))) << 1) + ((((-1) - (((-1) - i2) | ((-1) - 2))) >> 1) * 3)) + 13)) - 1;
        int i4 = (-1) - (((-1) - ((int) (j2 >> 33))) | ((-1) - i3));
        return (-1) - (((-1) - ((int) (j2 >> 2))) | ((-1) - i3)) == (i4 == 0 ? Integer.MAX_VALUE : i4 - 1);
    }

    /* JADX INFO: renamed from: getMaxHeight-impl */
    public static final int m6590getMaxHeightimpl(long j2) {
        int i2 = (int) ((-1) - (((-1) - 3) | ((-1) - j2)));
        int i3 = (((-1) - (((-1) - i2) | ((-1) - 1))) << 1) + ((((i2 + 2) - (i2 | 2)) >> 1) * 3);
        int i4 = ((int) (j2 >> (i3 + 46))) & ((1 << (18 - i3)) - 1);
        if (i4 == 0) {
            return Integer.MAX_VALUE;
        }
        return i4 - 1;
    }

    /* JADX INFO: renamed from: getMaxWidth-impl */
    public static final int m6591getMaxWidthimpl(long j2) {
        int i2 = (int) ((-1) - (((-1) - 3) | ((-1) - j2)));
        int i3 = (1 << ((((i2 & 1) << 1) + (((i2 & 2) >> 1) * 3)) + 13)) - 1;
        int i4 = (int) (j2 >> 33);
        int i5 = (i4 + i3) - (i4 | i3);
        if (i5 == 0) {
            return Integer.MAX_VALUE;
        }
        return i5 - 1;
    }

    /* JADX INFO: renamed from: getMinHeight-impl */
    public static final int m6592getMinHeightimpl(long j2) {
        int i2 = (int) (3 & j2);
        int i3 = ((i2 & 1) << 1) + ((((-1) - (((-1) - i2) | ((-1) - 2))) >> 1) * 3);
        return ((int) (j2 >> (i3 + 15))) & ((1 << (18 - i3)) - 1);
    }

    /* JADX INFO: renamed from: getMinWidth-impl */
    public static final int m6593getMinWidthimpl(long j2) {
        int i2 = (int) ((3 + j2) - (3 | j2));
        int i3 = (1 << (((((i2 + 1) - (1 | i2)) << 1) + (((i2 & 2) >> 1) * 3)) + 13)) - 1;
        int i4 = (int) (j2 >> 2);
        return (i4 + i3) - (i4 | i3);
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m6594hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    public static /* synthetic */ void isZero$annotations() {
    }

    /* JADX INFO: renamed from: isZero-impl */
    public static final boolean m6595isZeroimpl(long j2) {
        int i2 = (int) ((-1) - (((-1) - 3) | ((-1) - j2)));
        int i3 = (((i2 + 1) - (1 | i2)) << 1) + ((((-1) - (((-1) - i2) | ((-1) - 2))) >> 1) * 3);
        if ((((int) (j2 >> 33)) & ((1 << (i3 + 13)) - 1)) - 1 == 0) {
            return true;
        }
        return ((-1) - (((-1) - ((int) (j2 >> (i3 + 46)))) | ((-1) - ((1 << (18 - i3)) - 1)))) - 1 == 0;
    }

    public boolean equals(Object obj) {
        return m6583equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m6594hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ long m6597unboximpl() {
        return this.value;
    }

    private /* synthetic */ Constraints(long j2) {
        this.value = j2;
    }

    /* JADX INFO: renamed from: copy-Zbe2FdA$default */
    public static /* synthetic */ long m6582copyZbe2FdA$default(long j2, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 + 1) - (1 | i6) != 0) {
            i2 = m6593getMinWidthimpl(j2);
        }
        if ((-1) - (((-1) - i6) | ((-1) - 2)) != 0) {
            i3 = m6591getMaxWidthimpl(j2);
        }
        if ((-1) - (((-1) - i6) | ((-1) - 4)) != 0) {
            i4 = m6592getMinHeightimpl(j2);
        }
        if ((i6 & 8) != 0) {
            i5 = m6590getMaxHeightimpl(j2);
        }
        return m6581copyZbe2FdA(j2, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: copy-Zbe2FdA */
    public static final long m6581copyZbe2FdA(long j2, int i2, int i3, int i4, int i5) {
        if (!(i4 >= 0 && i2 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("minHeight(" + i4 + ") and minWidth(" + i2 + ") must be >= 0");
        }
        if (!(i3 >= i2)) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth(" + i3 + ") must be >= minWidth(" + i2 + ')');
        }
        if (!(i5 >= i4)) {
            InlineClassHelperKt.throwIllegalArgumentException("maxHeight(" + i5 + ") must be >= minHeight(" + i4 + ')');
        }
        return ConstraintsKt.createConstraints(i2, i3, i4, i5);
    }

    public String toString() {
        return m6596toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m6596toStringimpl(long j2) {
        int iM6591getMaxWidthimpl = m6591getMaxWidthimpl(j2);
        String strValueOf = "Infinity";
        String strValueOf2 = iM6591getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM6591getMaxWidthimpl);
        int iM6590getMaxHeightimpl = m6590getMaxHeightimpl(j2);
        if (iM6590getMaxHeightimpl != Integer.MAX_VALUE) {
            strValueOf = String.valueOf(iM6590getMaxHeightimpl);
        }
        return "Constraints(minWidth = " + m6593getMinWidthimpl(j2) + ", maxWidth = " + strValueOf2 + ", minHeight = " + m6592getMinHeightimpl(j2) + ", maxHeight = " + strValueOf + ')';
    }

    /* JADX INFO: compiled from: Constraints.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\"B\u0012\u007f\u0007l|A0RnP.XT0Ŧl\u0012éT[Rp\u0004@[\u001aԥ&\t]N0\u001b|Mr\u000bq\u00136\u001a\u0007oDI\u0004z\u000e\u0016\u001d8Zom5}sK@xtd\u0007P60@\u0012\u0005/\u001cpMȮuٙǈJ\u000bܘ4BvC`\u0017\u00168(\u001d\u001e>N\u0005N`uSNH\u001b_j31\t\u0002B|)\u00104\u000bT%F\u0003)=zo&C@e7[*ھ\u0002ޗӱZ>ƄCsC\u0011v1oNW\u0001o6\u0007\u0004D\u00199]%]!(\r\t_o$'YQ*Pح\rߊĴyzɁ@\u0006\u0014\u00165YvH(x \u000eax#WN_\u001a^p\u0002Afڠ\u0016ӛƧ2*ݰ\u001fhWtI-\u0017R\n\u001a%\u001eQ\u0005\u001f%ib&`C\u001d\u001b|ϼ0҅ή<Gݳ\u000e[C\u0004\u0012\u0005+?8\u001bHG.3,\u0015<\u001c=7\n;S%y\b`D\u0016x5dvZ\u0002RvBRr$?B\t:\\tj\u000bk^lp,?fbYϮ|ܱ̯\u001f[ʟ@#+*\\j9uxNu\nS1=Ƅ,ˇo\u000e_ުӗ3>Yc\u0016\u0001Zy\u001a͕X\u0011\u0004׃j^"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$l+MCv0'\u0019rj\u000f", "", "u(E", "\u0017mU6a0Mg", "", "4hc\u001de0H`\u001d\u000e~s0\u0006\u000b\u0012e\u0004*~O", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";h]$\\+MV", ";`g$\\+MV", ";h]\u0015X0@V(", ";`g\u0015X0@V(", "4hc\u001de0H`\u001d\u000e~s0\u0006\u000b\u0012e\u0004*~OH\f\u0014G<n;R", "uH8\u0016<o#", "4hc\u001de0H`\u001d\u000e~s0\u0006\u000b!i~7~", "4hc\u001de0H`\u001d\u000e~s0\u0006\u000b!i~7~\bu\u0014\u0017\u0014P\r\u0018", "4hg2W", "EhSA[", "6dX4[;", "4hg2Ws#V\u001e\u0014\u0010H6", "uH8u=", "4hg2W\u000f>W\u001b\u0002\n", "4hg2W\u000f>W\u001b\u0002\n&\u0016|\u0012\u000fAL6", "uH\u0018\u0017", "4hg2W\u001eBR(\u0002", "4hg2W\u001eBR(\u0002BH,\u0006h\u000b2\u000e", "@dbAe0<bv\t\u0004l;\n\u00053n\u000f6", ">qX<e0MW.~lb+\f\f", "", "@dbAe0<bv\t\u0004l;\n\u00053n\u000f6CSac\u0001,?y", "uH8\u0016<!\u00028", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: fixed-JhjzzOo */
        public final long m6601fixedJhjzzOo(int i2, int i3) {
            if (!(i2 >= 0 && i3 >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("width(" + i2 + ") and height(" + i3 + ") must be >= 0");
            }
            return ConstraintsKt.createConstraints(i2, i2, i3, i3);
        }

        /* JADX INFO: renamed from: fixedWidth-OenEA2s */
        public final long m6603fixedWidthOenEA2s(int i2) {
            if (!(i2 >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("width(" + i2 + ") must be >= 0");
            }
            return ConstraintsKt.createConstraints(i2, i2, 0, Integer.MAX_VALUE);
        }

        /* JADX INFO: renamed from: fixedHeight-OenEA2s */
        public final long m6602fixedHeightOenEA2s(int i2) {
            if (!(i2 >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("height(" + i2 + ") must be >= 0");
            }
            return ConstraintsKt.createConstraints(0, Integer.MAX_VALUE, i2, i2);
        }

        /* JADX INFO: renamed from: restrictConstraints-xF2OJ5Q$default */
        public static /* synthetic */ long m6598restrictConstraintsxF2OJ5Q$default(Companion companion, int i2, int i3, int i4, int i5, boolean z2, int i6, Object obj) {
            if ((i6 + 16) - (i6 | 16) != 0) {
                z2 = true;
            }
            return companion.m6604restrictConstraintsxF2OJ5Q(i2, i3, i4, i5, z2);
        }

        @Deprecated(message = "\u0015K\fArw\u001a\u0017oP<\u0003\u0010\u001b5bL^\u00126\u0017q [\u0011O|qE}(zp", replaceWith = @ReplaceWith(expression = "Constraints.fitPrioritizingWidth(minWidth, maxWidth, minHeight, maxHeight)", imports = {}))
        @InterfaceC1492Gx
        /* JADX INFO: renamed from: restrictConstraints-xF2OJ5Q */
        public final long m6604restrictConstraintsxF2OJ5Q(int i2, int i3, int i4, int i5, boolean z2) {
            return z2 ? m6600fitPrioritizingWidthZbe2FdA(i2, i3, i4, i5) : m6599fitPrioritizingHeightZbe2FdA(i2, i3, i4, i5);
        }

        /* JADX INFO: renamed from: fitPrioritizingWidth-Zbe2FdA */
        public final long m6600fitPrioritizingWidthZbe2FdA(int i2, int i3, int i4, int i5) {
            int iMin = Math.min(i2, 262142);
            int iMin2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
            int iMaxAllowedForSize = ConstraintsKt.maxAllowedForSize(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
            return ConstraintsKt.Constraints(iMin, iMin2, Math.min(iMaxAllowedForSize, i4), i5 != Integer.MAX_VALUE ? Math.min(iMaxAllowedForSize, i5) : Integer.MAX_VALUE);
        }

        /* JADX INFO: renamed from: fitPrioritizingHeight-Zbe2FdA */
        public final long m6599fitPrioritizingHeightZbe2FdA(int i2, int i3, int i4, int i5) {
            int iMin = Math.min(i4, 262142);
            int iMin2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
            int iMaxAllowedForSize = ConstraintsKt.maxAllowedForSize(iMin2 == Integer.MAX_VALUE ? iMin : iMin2);
            return ConstraintsKt.Constraints(Math.min(iMaxAllowedForSize, i2), i3 != Integer.MAX_VALUE ? Math.min(iMaxAllowedForSize, i3) : Integer.MAX_VALUE, iMin, iMin2);
        }
    }
}
