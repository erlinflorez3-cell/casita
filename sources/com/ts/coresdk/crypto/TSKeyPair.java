package com.ts.coresdk.crypto;

import android.content.Context;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.crypto.Encryptor;
import com.ts.coresdk.crypto.api.CryptographyBiometricSignResult;
import com.ts.coresdk.crypto.api.TSCryptographySignCallback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.Wg;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0006FLc\u0003\u0010I\u00066\f6B\u0015\"4\u0012}\nnjO0LeN.ZS8\u000fs{:$c$\bCCU(\u000e*\tUOog\u0005Jb\u000bI\u0013\u000e\u0016\u0007̓4Ikxe\u0012\u00152JoU3UڎC^vҚ^\u000b&݅0Y\"\u0005/:RJ\u0016u\tes\u0018\u00180N\u0015bX\u001dO\u0015\u001aH\u0005lC1\u001e\u000b\u0007\u00075c-\u0003J31\u0011\u0002B\u0005ϋo4\u000b\\%F\u0003:\u001dzo3C@e8%)a\u001f\u001fR\nFƄCsC\"vEo8W}o6\u0007\u0003Z\u001aۣS\u000fc|4gM^n\u0018?+}f\u0012Uˎ,y\u0001\b\u001bGL+\u00148`.[*\u0017\f\u001cA\rr\u0002M\u0001\u0006lQ\u0018z\u00186]Gő7-?,tc*`'dO{3\u001dN'\u000f|9[\u0003!\u0011\u0019)c\u0010Q_epAVc\"YsmJ\u0005Ċ\u0006,\nFU\u0017w\u0013\u001fG/'MZg;Qo\u0010V\\g-\u0005'\fרmTNY0\tfO8\b$Zzߟ;~'ԏZ¯\u0015W$V\r|\u0016\u00138^}=/'`b]l\u0002j{`@%mf\u000eծz«\u0012[A`99_h`s`|,?je;X=̿U۱^`0$8Nx\u0015H\u000eRV$\u0013`F(\u001c\u000bν3Ǭ`\u0019P\u0005$JO\u0006"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u00065U\u000ePa!9fS", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u0010b5MS,\u000e", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqYJ\n&\u0017Z~c", "", "9dh\u0016W", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "9dh!T.", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`vPm\u001bP\u00024?f<\u000bGj\u001d2K);\u007f\u0013\u001a$d7", ">tQ9\\*$S-]vm(", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`vPm\u001bP\u00024?f<\u000bGj\u001d2K);\u007f\u0013\u001a$d7", "5dc\u0018X@\"R", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001dh)EW\u0017dzr\u000bx\u0018+", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7tg.Wc'U\\U;2", ">/", ">0", "", "@dcBe5,W\u001b\bg^:\r\u0010>", "uKR<`uMab|\u0005k,\u000b\b5/}5\u0010K\u0010!`Cz\u0012\u0006T2Id\r*9z\u00129PW\u0018o>&\u0015wn=\u0005Q0P\u007f\u0014GZ^3k(Y;\u001e\u001a$\u001d\\t\u000b\u000ffA2mJ\u0001\u001d\u0015@T\u0011E2|\u0017\u001aW$XNOj\u001bV\u0004\u0017\u0003=4kZGc{P\u001fAi1a\b]#2}+", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z", "", ">1", "AhV;", "uKR<`uMab|\u0005k,\u000b\b5/c\u0017i(\u000b\u0016'NoqEw/\u000bOZ\u00075w\u001ew\\Q\u0005i>+\u0015v`?Pa9b\u00026Q\u0016J7`\u001ca+q\u001fn\u0019]5\u000f\u0012UL'\u00032;!\u0011\nE\tBe|\n\u001ccx[", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0005Kq\u00178\u00065BYY0Fp\u00167\\G9gC(\">", "AhV;T;N`\u0019Z\u000bm/|\u0012>i}$\u000bJ\u000e", "uKR<`uMab|\u0005k,\u000b\b5/}5\u0010K\u0010!`Cz\u0012\u0006e\u0013\u0013f\u0012+Fw\u0018;IN>\u007f\"\"\u0017q?5\u000ej)Jt-\u001d\u00105*fZ<L\"[X\u0018[+\u001b\u0004_\u000b\"{XB.\u0012u7\u0006=q|\u001b&\u001b5F\u0001QY\u0010P\t\u0019s=8rS/", "\u0011qh=g6@`\u0015\n}r\u001a\u0001\u000b8C{/\u0003=|\u0015\u001d+w\u0019", ">2", "\nh]6g\u0005", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D+5)\u0010uX\u0010\u0005f\u000b\u0019\u0016\u001c4p:@c$R\t\u001f?!2fSmj\tQN\u0004M:a\u0013c\u001bB:N\u0003\u0010\u0001\u0015p,A", "", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "\"", " DB\"?\u001b", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW+d\u0003Bm\t/Ao#*XFOY8 \u001eF]@\u000e`(L||", "\u0011@;\u00195\b\u001c9"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class TSKeyPair<T extends Context, RESULT, CALLBACK extends TSCryptographySignCallback<RESULT>> {
    private final T context;
    private String keyId;
    private final String keyTag;
    private final Encryptor.PublicKeyData publicKeyData;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0006DLc\u000b\u0004Iي8\u000b<B\u0007\"2\u0014\u007f\u0007|j?ӇF{߉^R\u00022Ox\f82]<qy;ڈ\u001e\u007f(\u000f]U0||Nr\u000bq\u00126\u001a\u0007lDI\u0004y$&Ƥ6DuCAR@OG_\r6; h\"\u000fъ\u0007в\u001e.P\u0012|yQK"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u00065U\u000ePa!9f<}D\u0002!=WEHg?!)Ve;\u0010A(U}$CJT\u0010d]H", ":hbAX5>`", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW+d\u0003Bm\t/Ao#*XFOY8 \u001eF]@\u000e`(L||", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW\u001a\u00049@h\b\"Di!1a ?u<\u001e$ue7tg.Wc'U\\U;2", ">/", "", "=mA2f<Eb", "uKR<`uMab|\u0005k,\u000b\b5/}5\u0010K\u0010!`Cz\u0012\u0006T2Id\r*9z\u00129PW\u0018o>&\u0015wn=\u0005Q0P\u007f\u0014GZ^3k(6.", "\nh]6g\u0005", "uKR<`uMab|\u0005k,\u000b\b5/}5\u0010K\u0010!`6]s<\u000b\u00101]\u000bu\u001ek 6\u0017RI52(\"ho8\r-*[\u000b2VV\u0018(gV<,\u0002og\"Y:\u0017\u0007f=/qX%#\n5'}Bo}\b\u0014\u0014\u000b.a", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0016\u001d"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    private final class CryptographySignCallbackImp implements d {
        private final CALLBACK listener;
        final /* synthetic */ TSKeyPair<T, RESULT, CALLBACK> this$0;

        public CryptographySignCallbackImp(TSKeyPair tSKeyPair, CALLBACK callback) {
            Intrinsics.checkNotNullParameter(callback, "");
            this.this$0 = tSKeyPair;
            this.listener = callback;
        }

        @Override // com.ts.coresdk.crypto.d
        public void onResult(CryptographyBiometricSignResult cryptographyBiometricSignResult) {
            Intrinsics.checkNotNullParameter(cryptographyBiometricSignResult, "");
            this.this$0.returnSignResult(cryptographyBiometricSignResult, this.listener);
        }
    }

    public TSKeyPair(T t2, ITSModuleInfo iTSModuleInfo, String str, Encryptor.PublicKeyData publicKeyData) throws Throwable {
        Intrinsics.checkNotNullParameter(t2, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(publicKeyData, "");
        this.context = t2;
        this.keyTag = str;
        this.publicKeyData = publicKeyData;
        Context context = getContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd("(6-<:51{2??F8BI\u0004\u001aGGN@TQ", (short) (Od.Xd() ^ (-16869)))).getMethod(Wg.Zd("FDS`\u0010\u0010K8\u0003p\u00148N}R~=Ct\b\u0004", (short) (C1499aX.Xd() ^ (-5163)), (short) (C1499aX.Xd() ^ (-16736))), new Class[0]);
        try {
            method.setAccessible(true);
            String strE = com.ts.coresdk.crypto.a.b.e((Context) method.invoke(context, objArr), iTSModuleInfo, com.ts.coresdk.crypto.a.b.e(publicKeyData.getData()));
            Intrinsics.checkNotNullExpressionValue(strE, "");
            this.keyId = strE;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    protected T getContext() {
        return this.context;
    }

    public final String getKeyId() {
        return this.keyId;
    }

    public final String getPublicKeyData() {
        String data = this.publicKeyData.getData();
        Intrinsics.checkNotNullExpressionValue(data, "");
        return data;
    }

    protected abstract void returnSignResult(CryptographyBiometricSignResult cryptographyBiometricSignResult, CALLBACK callback);

    public void sign(ITSModuleInfo iTSModuleInfo, byte[] bArr, CALLBACK callback) {
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(callback, "");
        TSCryptographyManagerImp.INSTANCE.signWithKey(getContext(), iTSModuleInfo, signatureAuthenticator(callback), this.keyTag, bArr, new CryptographySignCallbackImp(this, callback));
    }

    protected abstract SignatureAuthenticator signatureAuthenticator(CALLBACK callback);
}
