package com.valid.vssh_bio_validation_library.executors;

import android.content.Context;
import androidx.biometric.BiometricPrompt;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
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
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.ZN;
import yg.hg;

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
@Metadata(bv = {1, 0, 3}, d1 = {"Я>\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000f\u0002{<$a$yCIU\"Ԃ*\teNo˧vJp\u000bKƤ\u001cǝ)jZH\u0016{ٕ\u0016\u000f@B8=AN\b=gb%:\u0013#J\"f}5\u0005(/`\u0010%\u0001sj\u001a\u0019H[\u0001Kb\u001c{\u0004ܨ\u0016\u0010D)\u0011$bq^8Nr\u0004E?%\u0013ipZUg`\u001c[\u001a^o7\u001e\u0007pL9Ë;?\u001b.c\t\r\\kA\tE\u0018H\u0015j7'YU\"_fw\u000e#-F_\u001em\u0002TlԇUj\u00120;UiU`\u0010.}!\u0007\u001d>\u0014\u000e43v6Ǐ\u001ew"}, d2 = {"\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017CNk2.$rnGP@0Xg#NPM(kV|Fs%Z\f^:\u0017\u0012g\u0017", "", "u(E", "1qT.g,\u001bW#ove0{\u0005>i\n1fM\u000b\u001f\"V", "\u001a`]1e6BR,Hwb6\u0005\t>r\u0004&E\u001d\u0005!\u001fG~\u001b@t\u0010Bc\u0006+FC", "4qP4`,Gbt|\nb=\u0001\u0018C", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D5{/;~\u001a=a\u0019", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "=mBBV*>a'Z\u000bm/", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "2`c.", "", "=m4?e6K/)\u000e}", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017CNk2.$rnGP@0Xg#NPM(kV|Fs\u001fg\u0018[\u0001", "=m5.\\3>Rt\u000f\na", "\u001ab^:\"=:Z\u001d}Do:\u000b\f)b\u00042uQ|\u001e\u001bFk\u001d@\u0001./`\u0002\u001dDi#B\u0017CNk2.$rnGP@0Xg#NPM(kV|Ft\u000e^\u0015N*b", "Drb5 (GR&\t~]s|\u0011,e~'{?H\u0014\u001bQ7\u001f8})4U\r$Av\u0010-M@Km"}, k = 1, mv = {1, 4, 1}, pn = "", xs = "")
public final class BioValidationExecutors {
    public final BiometricPrompt createBioValidationPrompt(FragmentActivity fragmentActivity, final Context context, final Function1<Object, Unit> function1, final Function1<? super BioValidationError, Unit> function12, final Function1<? super BioValidationFailed, Unit> function13) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, C1561oA.ud("\u0017\"\u0010\u0015\u001a\u0011\u0019\u001ei\u000b\u001b\u000f\u001b\r\u0017\u001b", (short) (C1607wl.Xd() ^ (2109843316 ^ 2109845044))));
        Intrinsics.checkParameterIsNotNull(context, C1561oA.yd("}\u000b\u0007\u000e\u0004\u0018\u0011", (short) (C1580rY.Xd() ^ ((1644490278 ^ 1427035316) ^ (-923412103)))));
        Intrinsics.checkParameterIsNotNull(function1, C1561oA.Yd("\b\bm\u0011\u007f\u0001\u0004\u0013\u0014b\u0018\u0018\r", (short) (C1633zX.Xd() ^ ((1925160516 ^ 761389094) ^ (-1608403763)))));
        int iXd = C1499aX.Xd() ^ 1134246847;
        Intrinsics.checkParameterIsNotNull(function12, Xg.qd("  w&'%)x..#", (short) (C1499aX.Xd() ^ ((2016240477 ^ 528970886) ^ (-1739198703))), (short) (C1499aX.Xd() ^ iXd)));
        Intrinsics.checkParameterIsNotNull(function13, Jg.Wd("\f3\u0004wxTF\u001e3@8\u0005", (short) (FB.Xd() ^ (ZN.Xd() ^ 864705991)), (short) (FB.Xd() ^ (OY.Xd() ^ (1961875555 ^ 1891926620)))));
        return new BiometricPrompt(fragmentActivity, ContextCompat.getMainExecutor(context), new BiometricPrompt.AuthenticationCallback() { // from class: com.valid.vssh_bio_validation_library.executors.BioValidationExecutors$createBioValidationPrompt$callback$1
            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationError(int i2, CharSequence charSequence) {
                Intrinsics.checkParameterIsNotNull(charSequence, Wg.Zd("q\t %y\f\u001aC7", (short) (C1607wl.Xd() ^ (Od.Xd() ^ (1036512216 ^ 2050652446))), (short) (C1607wl.Xd() ^ ((970586646 ^ 842158157) ^ 199988287))));
                super.onAuthenticationError(i2, charSequence);
                function12.invoke(new BioValidationError(i2, charSequence));
            }

            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationFailed() throws Throwable {
                super.onAuthenticationFailed();
                Function1 function14 = function13;
                Context context2 = context;
                int i2 = R.string.txt_error_unexpected;
                Class<?> cls = Class.forName(C1561oA.Xd(">LCRPKG\u0012HUU\\NX_\u001a0]]dVjg", (short) (OY.Xd() ^ (1677821513 ^ 1677829289))));
                Class<?>[] clsArr = {Integer.TYPE};
                Object[] objArr = {Integer.valueOf(i2)};
                Method method = cls.getMethod(Wg.vd("JIY9[ZRXR", (short) (Od.Xd() ^ (C1580rY.Xd() ^ 831066507))), clsArr);
                try {
                    method.setAccessible(true);
                    String str = (String) method.invoke(context2, objArr);
                    Intrinsics.checkExpressionValueIsNotNull(str, Qg.kd("\u0016!\u001f$\u0014&!Y\u0012\u000f\u001dz\u001b\u0018\u000e\u0012\nIrM\u0012\u0012\u000f\u0005\t\u0001F\f\u000f\nsx\u0005\u0004\u007f\u0002m\u0003zp\u0003ymjzjh,", (short) (C1607wl.Xd() ^ (1817457821 ^ 1817449021)), (short) (C1607wl.Xd() ^ ((136946959 ^ 561230253) ^ 693779672))));
                    function14.invoke(new BioValidationFailed(str));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }

            @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                Intrinsics.checkParameterIsNotNull(authenticationResult, hg.Vd("zlyzpw", (short) (C1633zX.Xd() ^ ((698219509 ^ 955747137) ^ (-292173314))), (short) (C1633zX.Xd() ^ (854448482 ^ (-854446727)))));
                super.onAuthenticationSucceeded(authenticationResult);
                function1.invoke(new BioValidationSuccess(authenticationResult));
            }
        });
    }
}
