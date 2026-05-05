package com.valid.vssh_bio_validation_library.executors;

import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r-4\u0012}\u0012njG9LeN/ZS8\u001bsڔ:Ša:ڎs;\u0004\u0019>5\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019/֒Yxk\u0016W9P|W3{p\u0004˧a==\u0013.J\"f|Kі\u001brc\u001e\u0006\u0013CyÈB6FpHR%M3\u001bB\fD \u000f tg|9\u000fȔ\\\u0003@1\u0013\u0002B|8\u00106\u000b_%Hj&;u(Գ,\t>C(=S1\b\u0019Đ>KF\u007fQ\u001dhU<qʵr(Nf\u007f,\u0015YPcƥ~͉`\u0011YӠ$)1TqQp\u0010.~\t\u0004]T\u0012\u0010\u001e'v1\u0004Նrڿ\u0012?|ɁkBV\u000blL |gA%1ŗ7A"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017CNk2.$rnGP@0Xg#NPM(kV|Fs\u001fg\u0018[\u0001", "", "3qa<e\nHR\u0019", "", "3qa<e\u0014>a'z|^", "", "uH;7T=:\u001d z\u0004`uZ\f+rm(\bP\u0001 \u0015GEQ-", "5dc\u0012e9H`v\ty^", "u(8", "Adc\u0012e9H`v\ty^", "uH\u0018#", "5dc\u0012e9H`\u0001~\tl(~\t", "u(;7T=:\u001d z\u0004`uZ\f+rm(\bP\u0001 \u0015GE", "Adc\u0012e9H`\u0001~\tl(~\t", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001d3~", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class BioValidationError {
    private int errorCode;
    private CharSequence errorMessage;

    public BioValidationError(int i2, CharSequence charSequence) {
        short sXd = (short) (C1607wl.Xd() ^ (ZN.Xd() ^ 864702360));
        int[] iArr = new int["^\u0019\u0007h<Y\u0012@\u0005CK'".length()];
        QB qb = new QB("^\u0019\u0007h<Y\u0012@\u0005CK'");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
            i3++;
        }
        Intrinsics.checkParameterIsNotNull(charSequence, new String(iArr, 0, i3));
        this.errorCode = i2;
        this.errorMessage = charSequence;
    }

    public static /* synthetic */ BioValidationError copy$default(BioValidationError bioValidationError, int i2, CharSequence charSequence, int i3, Object obj) {
        if ((1 & i3) != 0) {
            i2 = bioValidationError.errorCode;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            charSequence = bioValidationError.errorMessage;
        }
        return bioValidationError.copy(i2, charSequence);
    }

    public final int component1() {
        return this.errorCode;
    }

    public final CharSequence component2() {
        return this.errorMessage;
    }

    public final BioValidationError copy(int i2, CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, EO.Od("\t;/\u0013\u0010Gy\u0012l\u001d#|", (short) (Od.Xd() ^ (FB.Xd() ^ (-1609499193)))));
        return new BioValidationError(i2, charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BioValidationError)) {
            return false;
        }
        BioValidationError bioValidationError = (BioValidationError) obj;
        return this.errorCode == bioValidationError.errorCode && Intrinsics.areEqual(this.errorMessage, bioValidationError.errorMessage);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final CharSequence getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.errorCode) * 31;
        CharSequence charSequence = this.errorMessage;
        return iHashCode + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final void setErrorCode(int i2) {
        this.errorCode = i2;
    }

    public final void setErrorMessage(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, C1561oA.Qd("W\u000e~\rDUS", (short) (Od.Xd() ^ (30929158 ^ (-30932743)))));
        this.errorMessage = charSequence;
    }

    public String toString() {
        int iXd = OY.Xd() ^ 69927312;
        int iXd2 = Od.Xd() ^ (355165910 ^ 1389791629);
        short sXd = (short) (C1607wl.Xd() ^ iXd);
        short sXd2 = (short) (C1607wl.Xd() ^ iXd2);
        int[] iArr = new int["AipXdpnjh|ryyQ\u007f\u0001~\u00039w\u0006\u0007\u0005\tZ\b}\u007fX".length()];
        QB qb = new QB("AipXdpnjh|ryyQ\u007f\u0001~\u00039w\u0006\u0007\u0005\tZ\b}\u007fX");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        StringBuilder sbAppend = new StringBuilder(new String(iArr, 0, i2)).append(this.errorCode);
        short sXd3 = (short) (C1607wl.Xd() ^ ((364107223 ^ 1968719875) ^ 1626054106));
        int[] iArr2 = new int["4'kwvrtNerq^c`7".length()];
        QB qb2 = new QB("4'kwvrtNerq^c`7");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        return sbAppend.append(new String(iArr2, 0, i3)).append(this.errorMessage).append(C1561oA.Kd(Global.UNDERSCORE, (short) (FB.Xd() ^ (621334769 ^ 621346006)))).toString();
    }
}
