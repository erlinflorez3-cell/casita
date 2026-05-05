package com.valid.vssh_bio_validation_library.executors;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import com.valid.vssh_bio_validation_library.utils.DialogFingerprint;
import com.valid.vssh_bio_validation_library.utils.InstanceBioValidationManager;
import com.valid.vssh_bio_validation_library_embed.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

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
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:299)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0Le^.ZS0\u000fs{B$cҕyCQU\"Ԃ*\teNo˧\u0005Ϻ\u000b\u000bq\u000eF\u0019ѱn,WUAS \u0010JB\u001eAcQ}@Q`#:5?@'P\u0015\u0015\u0012*9v\u000fͯ~MQ\u0013\"6FxJT\u0013S+#\"\bN /(\u000bm~UVwuU?4\u0013xpZϮc:\u0003T\u001dLZ/\u001dxg$QIG7%%\u0002\r5X\f^\u0011L\nX\u0015y76YWָ[@^\u0007$\u001b1W\u001d_x,\u0003\u000eab\u001c'YY\u0012Qם\u00127"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017CNk2.$rnGPD0Wx'T7[0eaRP\u0014\u0010j\u001dX8\u001bZ", "", "u(E", "1qT.g,\u001fW\"\u0001zk7\n\r8tg$\u0005<\u0003\u0017$%k\u0015Cs!3_", "\u001a`]1e6BRb\u0002vk+\u000f\u0005<eI)\u007fI\u0003\u0017$R|\u0012E\u0006n\u0016]\u0007\"7z!;QLJS0'\u0011jaFE?<]y'P[R*XavG\u001doV\u0015U(\t\u0003_\u0017", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "=mBBV*>a'Z\u000bm/", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "2`c.", "", "=m4?e6K/)\u000e}", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017CNk2.$rnGP@0Xg#NPM(kV|Fs\u001fg\u0018[\u0001", "=m5.\\3>Rt\u000f\na", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017CNk2.$rnGP@0Xg#NPM(kV|Ft\u000e^\u0015N*b", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class FingerPrintExecutors {
    public final FingerprintManager.AuthenticationCallback createFingerprintManagerCallback(final Context context, final Function1<Object, Unit> function1, final Function1<? super BioValidationError, Unit> function12, final Function1<? super BioValidationFailed, Unit> function13) {
        short sXd = (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (1207413192 ^ (-1988028911))));
        int[] iArr = new int["Vc_f\\pi".length()];
        QB qb = new QB("Vc_f\\pi");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Intrinsics.checkParameterIsNotNull(context, new String(iArr, 0, i2));
        short sXd2 = (short) (FB.Xd() ^ ((1907356481 ^ 1579539717) ^ 797601327));
        int[] iArr2 = new int["\u0016\u0016{\u001f\u000e\u000f\u0012!\"p&&\u001b".length()];
        QB qb2 = new QB("\u0016\u0016{\u001f\u000e\u000f\u0012!\"p&&\u001b");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
            i3++;
        }
        Intrinsics.checkParameterIsNotNull(function1, new String(iArr2, 0, i3));
        int iXd = C1580rY.Xd() ^ (1974873906 ^ (-1144979845));
        Intrinsics.checkParameterIsNotNull(function12, Xg.qd("\u001f\u001fv%&$(w--\"", (short) (OY.Xd() ^ ((1941683727 ^ 558053169) ^ 1392044118)), (short) (OY.Xd() ^ iXd)));
        Intrinsics.checkParameterIsNotNull(function13, Jg.Wd("\ft+*\u0011\u001f\u0016W4SQF", (short) (OY.Xd() ^ (Od.Xd() ^ 1207809524)), (short) (OY.Xd() ^ (Od.Xd() ^ 1207824187))));
        return new FingerprintManager.AuthenticationCallback() { // from class: com.valid.vssh_bio_validation_library.executors.FingerPrintExecutors.createFingerprintManagerCallback.1
            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationError(int i4, CharSequence charSequence) throws Throwable {
                Intrinsics.checkParameterIsNotNull(charSequence, C1561oA.Kd("N\\]?a`X^X", (short) (C1499aX.Xd() ^ (1060689540 ^ (-1060686294)))));
                super.onAuthenticationError(i4, charSequence);
                InstanceBioValidationManager.INSTANCE.getDialogFingerprint().updateStatePopUp(charSequence.toString(), i4);
                function12.invoke(new BioValidationError(i4, charSequence));
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationFailed() throws Throwable {
                super.onAuthenticationFailed();
                DialogFingerprint dialogFingerprint = InstanceBioValidationManager.INSTANCE.getDialogFingerprint();
                Context context2 = context;
                int i4 = R.string.txt_not_recognize_fingerprint;
                Class<?> cls = Class.forName(Wg.Zd("VAHcY`\fb\u0011*:mWm\u0005KY2BU?_\f", (short) (Od.Xd() ^ (Od.Xd() ^ (994671601 ^ (-2092214333)))), (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951468899))));
                Class<?>[] clsArr = {Integer.TYPE};
                Object[] objArr = {Integer.valueOf(i4)};
                short sXd3 = (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (-1849969470)));
                int[] iArr3 = new int["{z\u000bj\r\f\u0004\n\u0004".length()];
                QB qb3 = new QB("{z\u000bj\r\f\u0004\n\u0004");
                int i5 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 + i5));
                    i5++;
                }
                Method method = cls.getMethod(new String(iArr3, 0, i5), clsArr);
                try {
                    method.setAccessible(true);
                    String str = (String) method.invoke(context2, objArr);
                    Intrinsics.checkExpressionValueIsNotNull(str, Wg.vd("'44;-A>x32B\"DC;A\u001b\\\bd+-,$\ue1cf,2\u001e2&%2\u000b\u0013\u000f!\r\b\u0010\u0014\u001a\u0014\u0013! #\u001b!\b=", (short) (OY.Xd() ^ (1131671040 ^ 1131663527))));
                    dialogFingerprint.updateStatePopUp(str, 1398178326 ^ 1398178334);
                    Function1 function14 = function13;
                    Context context3 = context;
                    int i6 = R.string.txt_error_unexpected;
                    Class<?> cls2 = Class.forName(Qg.kd("YeZgc\\V\u001fS^\\aQY^\u0017+VTYI[V", (short) (OY.Xd() ^ ((733749834 ^ 986815595) ^ 292397372)), (short) (OY.Xd() ^ ((960452331 ^ 829109921) ^ 139732384))));
                    Class<?>[] clsArr2 = {Integer.TYPE};
                    Object[] objArr2 = {Integer.valueOf(i6)};
                    Method method2 = cls2.getMethod(hg.Vd("olzXxukog", (short) (ZN.Xd() ^ ((430808921 ^ 1701390690) ^ 2093255703)), (short) (ZN.Xd() ^ ((256644674 ^ 863355043) ^ 1010433906))), clsArr2);
                    try {
                        method2.setAccessible(true);
                        String str2 = (String) method2.invoke(context3, objArr2);
                        short sXd4 = (short) (OY.Xd() ^ ((1830937283 ^ 1581708888) ^ 862400867));
                        int[] iArr4 = new int["x\u0004\u0002\u0007v\t\u0004<tq\u007f]}zptl,U0ttqgkc)nqlV[gfbdPe]Se\\PM]MK\u000f".length()];
                        QB qb4 = new QB("x\u0004\u0002\u0007v\t\u0004<tq\u007f]}zptl,U0ttqgkc)nqlV[gfbdPe]Se\\PM]MK\u000f");
                        int i7 = 0;
                        while (qb4.YK()) {
                            int iKK4 = qb4.KK();
                            Xu xuXd4 = Xu.Xd(iKK4);
                            iArr4[i7] = xuXd4.fK(sXd4 + i7 + xuXd4.CK(iKK4));
                            i7++;
                        }
                        Intrinsics.checkExpressionValueIsNotNull(str2, new String(iArr4, 0, i7));
                        function14.invoke(new BioValidationFailed(str2));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationHelp(int i4, CharSequence charSequence) throws Throwable {
                super.onAuthenticationHelp(i4, charSequence);
                InstanceBioValidationManager.INSTANCE.getDialogFingerprint().updateStatePopUp(String.valueOf(charSequence), i4);
                function12.invoke(new BioValidationError(i4, String.valueOf(charSequence)));
            }

            @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
            public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
                super.onAuthenticationSucceeded(authenticationResult);
                if (authenticationResult != null) {
                    function1.invoke(new BioValidationSuccess(authenticationResult));
                }
            }
        };
    }
}
