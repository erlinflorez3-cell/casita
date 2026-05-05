package com.facebook.react.views.modal;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;

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
/* JADX INFO: loaded from: classes3.dex */
@Deprecated(message = "\u0017N\u0005H1w!XkZg\u0004cT:]\u001cX\u00185\fm\u001e\u0012\fYsn\u000eu2j(cmNY\u001cj>\u000608G!lQ}akWJs\f")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$4\u0012\u000e\u0007nʑ?ԆD{߉^R\u0002)Op\u00024ż_$\u007fC\u0004c(\u0003:\t}P\u0018k|Pr\u000bq\u0016L\u001bIv:Jmx\f\u0014e˳DņC3Uڎ\u000eEnwN\u0005N4x\u0603{ڱ\u0005\u001a2Ϻ`\u0003\tGc\f@2\u0017\u0084<ň\u0011M\r܅Ű\nF"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0016Fu!<#e*6i\u001d\u0011WQJN4% hn\u000f", "", "u(E", "\u001b@G,C\u0016\"<\b", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&l", "\u001bH=,C\u0016\"<\b", "!HI\u0012R\u0017(7\u0002m", "5dc\u001ab+:Z{\t\tm\u001a\u0001\u001e/", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ModalHostHelper {
    public static final ModalHostHelper INSTANCE = new ModalHostHelper();
    private static final Point MIN_POINT = new Point();
    private static final Point MAX_POINT = new Point();
    private static final Point SIZE_POINT = new Point();

    private ModalHostHelper() {
    }

    @JvmStatic
    public static final Point getModalHostSize(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.ud("3><A1C>", (short) (OY.Xd() ^ 7138)));
        String strYd = C1561oA.yd("dU]RX_", (short) (C1633zX.Xd() ^ (-13066)));
        Class<?> cls = Class.forName(C1561oA.Yd("8F=LJEA\fBOOVHRY\u0014*WW^Pda", (short) (Od.Xd() ^ (-2602))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (C1633zX.Xd() ^ (-16733));
        short sXd2 = (short) (C1633zX.Xd() ^ (-9486));
        int[] iArr = new int["aYo[)h^lf.Tvumsm".length()];
        QB qb = new QB("aYo[)h^lf.Tvumsm");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {strYd};
        Method method = cls.getMethod(Jg.Wd("\u0005Lq6rvMdB2J-W $<", (short) (C1499aX.Xd() ^ (-27669)), (short) (C1499aX.Xd() ^ (-16085))), clsArr);
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            short sXd3 = (short) (C1607wl.Xd() ^ 32752);
            short sXd4 = (short) (C1607wl.Xd() ^ 13046);
            int[] iArr2 = new int["r\u001c.5#${,i|\u000f)G@\u001bj'o(='aiMX%V\"lBI\u00122\u0011\u0011dLE}x\u0016\u007f?'{\u0010Yolb\u001f\u0002\r^V\u0011s3_x \t4".length()];
            QB qb2 = new QB("r\u001c.5#${,i|\u000f)G@\u001bj'o(='aiMX%V\"lBI\u00122\u0011\u0011dLE}x\u0016\u007f?'{\u0010Yolb\u001f\u0002\r^V\u0011s3_x \t4");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                i3++;
            }
            Intrinsics.checkNotNull(objInvoke, new String(iArr2, 0, i3));
            Display defaultDisplay = ((WindowManager) objInvoke).getDefaultDisplay();
            Point point = MIN_POINT;
            Point point2 = MAX_POINT;
            defaultDisplay.getCurrentSizeRange(point, point2);
            Point point3 = SIZE_POINT;
            defaultDisplay.getSize(point3);
            int[] iArr3 = {R.attr.windowFullscreen};
            short sXd5 = (short) (Od.Xd() ^ (-6351));
            short sXd6 = (short) (Od.Xd() ^ (-5849));
            int[] iArr4 = new int["H.L\u0013r.C{C\u0014DX'WoBf3do\u001et\u0003".length()];
            QB qb3 = new QB("H.L\u0013r.C{C\u0014DX'WoBf3do\u001et\u0003");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr4[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd5 + sXd5) + (i4 * sXd6))) + xuXd3.CK(iKK3));
                i4++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr4, 0, i4)).getMethod(Ig.wd("\u001cqP\nt%Kp", (short) (OY.Xd() ^ 28032)), new Class[0]);
            try {
                method2.setAccessible(true);
                TypedArray typedArrayObtainStyledAttributes = ((Resources.Theme) method2.invoke(context, objArr2)).obtainStyledAttributes(iArr3);
                short sXd7 = (short) (C1499aX.Xd() ^ (-16393));
                int[] iArr5 = new int["\u001cf|\u0003\u00060z\u0006>N \u00072YG.iN,U\ta}\u0002D*\n".length()];
                QB qb4 = new QB("\u001cf|\u0003\u00060z\u0006>N \u00072YG.iN,U\ta}\u0002D*\n");
                int i5 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr5[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd7 + sXd7) + i5)) + xuXd4.CK(iKK4));
                    i5++;
                }
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, new String(iArr5, 0, i5));
                int dimension = 0;
                boolean z2 = typedArrayObtainStyledAttributes.getBoolean(0, false);
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1561oA.Qd(".:/<81+s(316&.3k\u007f+).\u001e0+", (short) (C1607wl.Xd() ^ 32104))).getMethod(C1593ug.zd("ZYiH\\khom_bq", (short) (FB.Xd() ^ 22671), (short) (FB.Xd() ^ 16597)), new Class[0]);
                try {
                    method3.setAccessible(true);
                    Resources resources = (Resources) method3.invoke(context, objArr3);
                    int identifier = resources.getIdentifier(Wg.Zd("Ds\u0011L}4P{+v\u0014Er/]\u0007C", (short) (OY.Xd() ^ 5532), (short) (OY.Xd() ^ 26648)), C1561oA.od(":>A8@", (short) (Od.Xd() ^ (-9694))), C1561oA.Kd("2@7FD?;", (short) (C1499aX.Xd() ^ (-23841))));
                    if (z2 && identifier > 0) {
                        dimension = (int) resources.getDimension(identifier);
                    }
                    return point3.x < point3.y ? new Point(point.x, point2.y + dimension) : new Point(point2.x, point.y + dimension);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
