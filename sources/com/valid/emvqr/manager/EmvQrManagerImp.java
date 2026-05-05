package com.valid.emvqr.manager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.dynatrace.android.agent.AdkSettings;
import com.valid.emvqr.a4;
import com.valid.emvqr.c1;
import com.valid.emvqr.entities.MerchantEmvQrEntity;
import com.valid.emvqr.exceptions.EmvQrException;
import com.valid.emvqr.hn;
import com.valid.emvqr.parser.Parser;
import com.valid.emvqr.qb;
import com.valid.emvqr.view.BridgeQRActivity;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.CX;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class EmvQrManagerImp implements c1 {

    /* JADX INFO: renamed from: l */
    private EmvQrManagerCallback f18318l;

    /* JADX INFO: renamed from: v */
    private boolean f18319v;

    @Override // com.valid.emvqr.c1
    public void init(Context context, String str, String str2, String str3, EmvQrManagerCallback emvQrManagerCallback) {
        this.f18318l = emvQrManagerCallback;
        if (Integer.parseInt(C1561oA.Qd("j", (short) (OY.Xd() ^ (C1607wl.Xd() ^ 1849962399)))) == 0) {
            this.f18319v = true;
        }
        this.f18318l.initiatedScanEmvQr();
    }

    @Subscribe
    public void onEvent(String str) {
        try {
            EventBus.getDefault().unregister(this);
            this.f18318l.onScanResponse(str);
        } catch (hn unused) {
        }
    }

    @Override // com.valid.emvqr.c1
    public MerchantEmvQrEntity processEmvQrData(String str) {
        Integer numValueOf;
        int i2;
        String str2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        short sXd = (short) (ZN.Xd() ^ (C1607wl.Xd() ^ 1849962705));
        short sXd2 = (short) (ZN.Xd() ^ ((1757201804 ^ 127132407) ^ 1865360502));
        int[] iArr = new int["v *\u0006(\u0004\u0019'\u001b\"!/\u0007,0".length()];
        QB qb = new QB("v *\u0006(\u0004\u0019'\u001b\"!/\u0007,0");
        int i8 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i8] = xuXd.fK((xuXd.CK(iKK) - (sXd + i8)) - sXd2);
            i8++;
        }
        new String(iArr, 0, i8);
        if (this.f18319v) {
            try {
                return Parser.parseData(str);
            } catch (EmvQrException e2) {
                if (this.f18318l != null) {
                    this.f18318l.onErrorEmvQr(Integer.valueOf(e2.getErrorCode()), e2.getErrorMessage());
                }
                C1561oA.od("Pw\u007fYyK}ghruinl", (short) (ZN.Xd() ^ ((1314175093 ^ 555373045) ^ 1867446700)));
                return null;
            } catch (Exception e3) {
                Exception.class.getSimpleName();
                return null;
            }
        }
        EmvQrManagerCallback emvQrManagerCallback = this.f18318l;
        String strKd = C1561oA.Kd("\u0012", (short) (FB.Xd() ^ ((731974466 ^ 1440654858) ^ 2122303527)));
        int i9 = Integer.parseInt(strKd);
        String strZd = Wg.Zd(AdkSettings.PLATFORM_TYPE_MOBILE, (short) (OY.Xd() ^ ((1216279142 ^ 454340581) ^ 1399462284)), (short) (OY.Xd() ^ ((976369293 ^ 640212360) ^ 471505048)));
        int i10 = 4;
        int i11 = 0;
        if (i9 != 0) {
            str2 = strKd;
            numValueOf = null;
            i2 = 4;
            i3 = 0;
        } else {
            numValueOf = Integer.valueOf(C1607wl.Xd() ^ (1931016755 ^ (-492628452)));
            i2 = (694038132 ^ 564462427) ^ 150678819;
            str2 = strZd;
            i3 = 8;
        }
        int i12 = 1;
        if (i2 != 0) {
            i5 = i3 + i3;
            str2 = strKd;
            i4 = 0;
        } else {
            i4 = i2 + 8;
            i5 = 1;
        }
        if (Integer.parseInt(str2) != 0) {
            i7 = i4 + 9;
            i10 = 1;
            i6 = 1;
            strZd = str2;
        } else {
            i6 = i3 + i5;
            i7 = i4 + 7;
            i12 = 4;
        }
        if (i7 != 0) {
            i6 += i10 + i12;
            i11 = 8;
        } else {
            strKd = strZd;
        }
        if (Integer.parseInt(strKd) == 0) {
            i6 /= i11 + i11;
        }
        emvQrManagerCallback.onErrorEmvQr(numValueOf, a4.indexOf(i6, C1561oA.Xd(">]_=<?!\u00015&@3p", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (1494023945 ^ (-115590095)))))));
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.valid.emvqr.c1
    public void startScan(Activity activity, int i2) throws Exception {
        int iXd;
        int iXd2;
        String str;
        int i3;
        int i4;
        int i5;
        int iXd3;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2 = this.f18319v;
        Integer numValueOf = null;
        Intent intent = null;
        String strVd = Wg.vd(",", (short) (C1633zX.Xd() ^ (1144865630 ^ (-1144856442))));
        if (z2) {
            if (!EventBus.getDefault().isRegistered(this)) {
                EventBus.getDefault().register(this);
            }
            Intent intent2 = new Intent(activity, (Class<?>) BridgeQRActivity.class);
            if (Integer.parseInt(strVd) == 0) {
                intent2.putExtra(qb.substring(Qg.kd("W(\u0005%#!&\u0015", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (804184341 ^ (-1879150954)))), (short) (C1633zX.Xd() ^ ((904504313 ^ 193898109) ^ (-1046954032)))), OY.Xd() ^ 69929195), i2);
                intent = intent2;
            }
            CX.ud();
            activity.startActivity(intent);
            return;
        }
        EmvQrManagerCallback emvQrManagerCallback = this.f18318l;
        int i10 = Integer.parseInt(strVd);
        int i11 = 6;
        String strVd2 = hg.Vd("vv", (short) (OY.Xd() ^ (300517666 ^ 300521355)), (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831076728))));
        if (i10 != 0) {
            iXd2 = 6;
            str = strVd;
            iXd = 0;
        } else {
            numValueOf = Integer.valueOf(OY.Xd() ^ (-69929187));
            iXd = FB.Xd() ^ 1609527074;
            iXd2 = C1580rY.Xd() ^ (-831067157);
            str = strVd2;
        }
        if (iXd2 != 0) {
            i4 = iXd + iXd;
            str = strVd;
            i3 = 0;
        } else {
            i3 = iXd2 + 9;
            i4 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            i5 = i3 + 8;
            iXd = 0;
            i4 = 1;
            iXd3 = 1;
        } else {
            i5 = i3 + 6;
            iXd3 = C1499aX.Xd() ^ (257784407 ^ (-1288052039));
            str = strVd2;
        }
        if (i5 != 0) {
            i4 += iXd << iXd3;
            i7 = (642371974 ^ 728239452) ^ 220323038;
            str = strVd;
            i6 = 0;
        } else {
            i6 = i5 + 14;
            i7 = 1;
        }
        if (Integer.parseInt(str) != 0) {
            i9 = i6 + 12;
            i8 = 1;
            strVd2 = str;
        } else {
            i8 = i7 + i7;
            i9 = i6 + 11;
        }
        if (i9 != 0) {
            i4 += i7 + i8;
        } else {
            strVd = strVd2;
            i11 = 0;
        }
        emvQrManagerCallback.onErrorEmvQr(numValueOf, a4.indexOf(i4 / (i11 + (Integer.parseInt(strVd) == 0 ? i11 + i11 : 1)), C1561oA.ud("JOO# \t\u0011F!\b \tL", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (-1609508219))))));
    }
}
