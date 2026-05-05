package com.valid.vssh_bio_validation_library.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

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
@Metadata(bv = {1, 0, 3}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4P\u0007\":\u001b\u007f\u0007ljA0RkP.XS0Ŧq\u0012éT[Rp\u0004Ve\u001e\f\"!O|hwrX\\#C=\u0007&|x/aU'^ܫ\u00132Ps\b:[|U9\u000fu|ԓ!z)F\b\u001d\u0001H+\u000fǼwCJY\u001b*0nq\u0001Ŭ\u000e\u0016*(\"\u001e>NҵNbmNDH\u0005]h0S\toB\\)w0+N=LZ'\u001byy\u001eYA}\u0094\u0014md\u0011\u0018j[m\u0015owK\u0018\u0001)=*wr\u001e\u0383YH\u001b#?g\r\f\blٯ\u0004\u001ag\u001a=CO\u0012L\u0017̂'H\u0013\n\u0010T\u0004<\u0007}Υ:ǉ\u001er\u0010ԄKvxXNV\"`H\u0007\ti\u0007/3\u0002K+g\u001c=Ϧmޅ\u001dZ?ަ\u001d\u000f$,\u000ftA]Z\u0018n\u001dkl\u0006QIQn>\u001fݗ\u0016ՒAy\f͏z\u00040\u000f>M 1\u0002\u001d<\u001fÏ;r"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017KEj4%^Ge5\u000em.+\u0007+NKN9D\\q=\u001bg", "", "Bhc9X", "", "AtQ!\\;ES", "2db0e0Ib\u001d\t\u0004", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d\u0010?", "5dc\u0011X:<`\u001d\n\nb6\u0006", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0011X:<`\u001d\n\nb6\u0006", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc h)-W(\u0006z", "Adc h)-W(\u0006z", "5dc!\\;ES", "Adc!\\;ES", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class DialogBuilderModel {
    private String description;
    private String subTitle;
    private String title;

    public DialogBuilderModel(String str, String str2, String str3) {
        int iXd = OY.Xd() ^ (-69951292);
        int iXd2 = ZN.Xd() ^ (-864699900);
        short sXd = (short) (C1499aX.Xd() ^ iXd);
        short sXd2 = (short) (C1499aX.Xd() ^ iXd2);
        int[] iArr = new int["\u0017\u001cv?\b".length()];
        QB qb = new QB("\u0017\u001cv?\b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(str, new String(iArr, 0, i2));
        Intrinsics.checkParameterIsNotNull(str2, ZO.xd("\r_\u001dj\u0013xp$", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207824634))), (short) (C1633zX.Xd() ^ (Od.Xd() ^ (301883924 ^ (-1443072572))))));
        Intrinsics.checkParameterIsNotNull(str3, C1626yg.Ud("J\\kwXl\f\u001f+=L", (short) (OY.Xd() ^ (FB.Xd() ^ (1241930581 ^ 367610916))), (short) (OY.Xd() ^ ((253094718 ^ 1998683332) ^ 2016726577))));
        this.title = str;
        this.subTitle = str2;
        this.description = str3;
    }

    public static /* synthetic */ DialogBuilderModel copy$default(DialogBuilderModel dialogBuilderModel, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            str = dialogBuilderModel.title;
        }
        if ((2 & i2) != 0) {
            str2 = dialogBuilderModel.subTitle;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            str3 = dialogBuilderModel.description;
        }
        return dialogBuilderModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subTitle;
    }

    public final String component3() {
        return this.description;
    }

    public final DialogBuilderModel copy(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, Ig.wd("\u001dA:\u0017\u007f", (short) (C1607wl.Xd() ^ (2060773409 ^ 2060763465))));
        Intrinsics.checkParameterIsNotNull(str2, EO.Od("x0M]-l>*", (short) (C1607wl.Xd() ^ (1280927831 ^ 1280931899))));
        Intrinsics.checkParameterIsNotNull(str3, C1561oA.Qd("??L;I?EH<A?", (short) (C1633zX.Xd() ^ (267031613 ^ (-267030679)))));
        return new DialogBuilderModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogBuilderModel)) {
            return false;
        }
        DialogBuilderModel dialogBuilderModel = (DialogBuilderModel) obj;
        return Intrinsics.areEqual(this.title, dialogBuilderModel.title) && Intrinsics.areEqual(this.subTitle, dialogBuilderModel.subTitle) && Intrinsics.areEqual(this.description, dialogBuilderModel.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.description;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setDescription(String str) {
        Intrinsics.checkParameterIsNotNull(str, C1593ug.zd("6naq+>>", (short) (FB.Xd() ^ (C1633zX.Xd() ^ (-1951474765))), (short) (FB.Xd() ^ ((336812477 ^ 1445411979) ^ 1110718289))));
        this.description = str;
    }

    public final void setSubTitle(String str) {
        short sXd = (short) (C1580rY.Xd() ^ (FB.Xd() ^ (-1609518942)));
        int[] iArr = new int["\t?0>u\u0007\u0005".length()];
        QB qb = new QB("\t?0>u\u0007\u0005");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(str, new String(iArr, 0, i2));
        this.subTitle = str;
    }

    public final void setTitle(String str) {
        Intrinsics.checkParameterIsNotNull(str, C1561oA.Kd("_\u0018\u000b\u001bTgg", (short) (C1499aX.Xd() ^ (OY.Xd() ^ (1491753983 ^ (-1556182220))))));
        this.title = str;
    }

    public String toString() {
        StringBuilder sbAppend = new StringBuilder(Wg.Zd("Grr\u007f\u0007\u0005g\u001d\\ee(9\u001aD|\b\u0013X) /12\u0010", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609516506))), (short) (C1633zX.Xd() ^ ((2100274969 ^ 647137615) ^ (-1539123234))))).append(this.title);
        short sXd = (short) (C1607wl.Xd() ^ ((1903016919 ^ 729556000) ^ 1511127072));
        int[] iArr = new int["#\u0018lo]Pfrke>".length()];
        QB qb = new QB("#\u0018lo]Pfrke>");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        StringBuilder sbAppend2 = sbAppend.append(new String(iArr, 0, i2)).append(this.subTitle);
        short sXd2 = (short) (FB.Xd() ^ (OY.Xd() ^ 69944027));
        int[] iArr2 = new int["aT\u0018\u0018%\u0014\"\u0018\u001e!\u0015\u001a\u0018e".length()];
        QB qb2 = new QB("aT\u0018\u0018%\u0014\"\u0018\u001e!\u0015\u001a\u0018e");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        return sbAppend2.append(new String(iArr2, 0, i3)).append(this.description).append(Qg.kd("\n", (short) (C1633zX.Xd() ^ (ZN.Xd() ^ (1667881336 ^ (-1357118736)))), (short) (C1633zX.Xd() ^ ((425819556 ^ 922275469) ^ (-798615469))))).toString();
    }
}
