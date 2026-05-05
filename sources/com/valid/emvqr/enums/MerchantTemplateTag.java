package com.valid.emvqr.enums;

import com.valid.emvqr.a4;
import com.valid.emvqr.ah;
import com.valid.emvqr.qb;
import java.util.regex.Pattern;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.QB;
import yg.Xu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unexpected branching in enum static init block */
/* JADX INFO: loaded from: classes5.dex */
public final class MerchantTemplateTag implements Tag {
    public static final MerchantTemplateTag TAG_00_GLOBALLY_UNIQUE_IDENTIFIER;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ MerchantTemplateTag[] f18314j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f18315b;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Pattern f18316s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f18317x;

    static {
        try {
            String strIndexOf = a4.indexOf((1564128925 ^ 995411125) ^ 1718514218, Ig.wd("-T\u0004]LA6\u0005T\u001c\u000e_al|_\b.g~79wtjL<rP>hE;", (short) (FB.Xd() ^ (873962801 ^ 873975509))));
            short sXd = (short) (C1633zX.Xd() ^ ((142736804 ^ 544420976) ^ (-686985043)));
            int[] iArr = new int["1y".length()];
            QB qb = new QB("1y");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            int i3 = (296687684 ^ 1018337652) ^ 756908340;
            MerchantTemplateTag merchantTemplateTag = new MerchantTemplateTag(strIndexOf, 0, a4.indexOf(i3, new String(iArr, 0, i2)), qb.substring(C1561oA.Qd("\r3k\"X=(@#\u0012$\u0006B\u001c\u001f\u0015\u001b\u0006.2\b>\tONO^Hg\u0004K:A<oJ", (short) (C1499aX.Xd() ^ (588857932 ^ (-588852227)))), i3), true);
            TAG_00_GLOBALLY_UNIQUE_IDENTIFIER = merchantTemplateTag;
            f18314j = new MerchantTemplateTag[]{merchantTemplateTag};
        } catch (ah unused) {
        }
    }

    private MerchantTemplateTag(String str, int i2, String str2, String str3, boolean z2) {
        this.f18315b = str2;
        this.f18317x = z2;
        if (str3 != null) {
            this.f18316s = Pattern.compile(str3);
        }
    }

    public static MerchantTemplateTag valueOf(String str) {
        try {
            return (MerchantTemplateTag) Enum.valueOf(MerchantTemplateTag.class, str);
        } catch (ah unused) {
            return null;
        }
    }

    public static MerchantTemplateTag[] values() {
        try {
            return (MerchantTemplateTag[]) f18314j.clone();
        } catch (ah unused) {
            return null;
        }
    }

    @Override // com.valid.emvqr.enums.Tag
    public Pattern getPattern() {
        return this.f18316s;
    }

    @Override // com.valid.emvqr.enums.Tag
    public String getTag() {
        return this.f18315b;
    }

    @Override // com.valid.emvqr.enums.Tag
    public boolean isMandatory() {
        return this.f18317x;
    }
}
