package com.ts.coresdk.crypto.api;

import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u000ePLcz\u0011I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007njO0Le^.ZS@\u000fs{J$c$\bCCU0}*\teNog\u0005Jb\u000bI\u0010\u000e\u0016\u0007̓2~kތ\u000e\u0012=OzxC8SvEBj\u007fB\u0012.r3>{\u0015\u0007(D`\u0012\ryqJë\u00162F\fHn]g\u0013\u001a*\bT\u001f/\u001d\u0013|%ȼJǰaD7%\tiPO?a6~[\u0010ЂS0\u001c\u0007r0>TLK,=l"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[\u0002", "", "3qa<e\u0014LU", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001\r|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "\u0011`]0X3>R", "\u001anR8b<M", "\u001anR8b<M>\u0019\f\u0003Z5|\u0012>", "\u001cdV.g0OSu\u000f\nm6\u0006", "\u001cn<.g*A", "\u001cnB=T*>", "\u001dsW2e", "\"h\\2B<M", "#m:;b>G", "#mP/_,-]\u0004\f\u0005\\,\u000b\u0017", "#rT?6(GQ\u0019\u0006z]", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[j:N{;\u0014\u0019Z\r$", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[jC\\pC\u001e\"ic", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[jC\\pC\u001e\"ixN8\u0015\u0001bA-}\u001a", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[jERt9#\u0016k\u000e+;\u001c\u0014cJy", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[jE\\Z9#\u0010]c", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[jE\\`H\u0010\u0010Zc", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[jFau=!g", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[jKVz=}\"ic", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[jL[XF\u001e$cc", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[jL[n:\u001b\u0012I\u001898\u0017\u0003YO2D", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[jL`rJq\u000ec\fN2\r\u0004/", ">/", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class SignBiometricAuthenticateError {
    private final String errorMsg;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000ePLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN1ZS@\u000fqڜ::ӋTqqM\u0016'\u000e&\u0017Tfg\u0016mН^\rI\u001f\u0014'Ax:Mmx\f\u0011U̸CņC5SsK<)\rD\u000b82P\u0600*\u000b\u0007\u001a8M(v)B\u0012Đ\u0011ضDr@X\u001bTM2 \u0010V /'\rm\\;`ns9]+IޚCĚ+a6\u0007[\u0018\u000fb5\u001a\u000faL7\u0007̑4չ)U\t\u0014`i\b\u0011M\u0001U\u0005\u0017&mȺHָ[8^\u000f\"\u0018{g\u001b]\u000b&\u000b\u0004\bub˄-յgUX\u0010.w\t|%>\n\u0010\u0014*"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[j:N{;\u0014\u0019Z\r$", "", "3qa<e\u0014LU", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001\r|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", ">/", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011~\u001c\u0006t/BY\f\u001f=7\u0014;aNJu}\u001a l+'\u000be5+z1OL]9`PNM#\u0015Z\u0017]/\u000b\u0001hA\u0004{QA,F\nE\u000b9h\b\f\u0015c", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[\u0002"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Canceled extends SignBiometricAuthenticateError {
        private final String errorMsg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Canceled(String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMsg = str;
        }

        public static /* synthetic */ Canceled copy$default(Canceled canceled, String str, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = canceled.getErrorMsg();
            }
            return canceled.copy(str);
        }

        public final String component1() {
            return getErrorMsg();
        }

        public final Canceled copy(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Canceled(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Canceled) && Intrinsics.areEqual(getErrorMsg(), ((Canceled) obj).getErrorMsg());
        }

        @Override // com.ts.coresdk.crypto.api.SignBiometricAuthenticateError
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public int hashCode() {
            return getErrorMsg().hashCode();
        }

        public String toString() {
            return "Canceled(errorMsg=" + getErrorMsg() + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000ePLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN1ZS@\u000fqڜ::ӋTqqM\u0016'\u000e&\u0017Tfg\u0016mН^\rI\u001f\u0014'Ax:Mmx\f\u0011U̸CņC5SsK<)\rD\u000b82P\u0600*\u000b\u0007\u001a8M(v)B\u0012Đ\u0011ضDr@X\u001bTM2 \u0010V /'\rm\\;`ns9]+IޚCĚ+a6\u0007[\u0018\u000fb5\u001a\u000faL7\u0007̑4չ)U\t\u0014`i\b\u0011M\u0001U\u0005\u0017&mȺHָ[8^\u000f\"\u0018{g\u001b]\u000b&\u000b\u0004\bub˄-յgUX\u0010.w\t|%>\n\u0010\u0014*"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[jC\\pC\u001e\"ic", "", "3qa<e\u0014LU", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001\r|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", ">/", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011~\u001c\u0006t/BY\f\u001f=7\u0014;aNJu}\u001a l+'\u000be5+z1OL]9`PNM#\u0015Z\u0017]/\u000b\u0001hA\u0004{QA,F\u0013S\u007fAr\u0011\u001bk", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[\u0002"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Lockout extends SignBiometricAuthenticateError {
        private final String errorMsg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Lockout(String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMsg = str;
        }

        public static /* synthetic */ Lockout copy$default(Lockout lockout, String str, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                str = lockout.getErrorMsg();
            }
            return lockout.copy(str);
        }

        public final String component1() {
            return getErrorMsg();
        }

        public final Lockout copy(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Lockout(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Lockout) && Intrinsics.areEqual(getErrorMsg(), ((Lockout) obj).getErrorMsg());
        }

        @Override // com.ts.coresdk.crypto.api.SignBiometricAuthenticateError
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public int hashCode() {
            return getErrorMsg().hashCode();
        }

        public String toString() {
            return "Lockout(errorMsg=" + getErrorMsg() + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000ePLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN1ZS@\u000fqڜ::ӋTqqM\u0016'\u000e&\u0017Tfg\u0016mН^\rI\u001f\u0014'Ax:Mmx\f\u0011U̸CņC5SsK<)\rD\u000b82P\u0600*\u000b\u0007\u001a8M(v)B\u0012Đ\u0011ضDr@X\u001bTM2 \u0010V /'\rm\\;`ns9]+IޚCĚ+a6\u0007[\u0018\u000fb5\u001a\u000faL7\u0007̑4չ)U\t\u0014`i\b\u0011M\u0001U\u0005\u0017&mȺHָ[8^\u000f\"\u0018{g\u001b]\u000b&\u000b\u0004\bub˄-յgUX\u0010.w\t|%>\n\u0010\u0014*"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[jC\\pC\u001e\"ixN8\u0015\u0001bA-}\u001a", "", "3qa<e\u0014LU", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001\r|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", ">/", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011~\u001c\u0006t/BY\f\u001f=7\u0014;aNJu}\u001a l+'\u000be5+z1OL]9`PNM#\u0015Z\u0017]/\u000b\u0001hA\u0004{QA,F\u0013S\u007fAr\u0011\u001b\u0001\u000eBrlKV\u0019VO", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[\u0002"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class LockoutPermanent extends SignBiometricAuthenticateError {
        private final String errorMsg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockoutPermanent(String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMsg = str;
        }

        public static /* synthetic */ LockoutPermanent copy$default(LockoutPermanent lockoutPermanent, String str, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = lockoutPermanent.getErrorMsg();
            }
            return lockoutPermanent.copy(str);
        }

        public final String component1() {
            return getErrorMsg();
        }

        public final LockoutPermanent copy(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new LockoutPermanent(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LockoutPermanent) && Intrinsics.areEqual(getErrorMsg(), ((LockoutPermanent) obj).getErrorMsg());
        }

        @Override // com.ts.coresdk.crypto.api.SignBiometricAuthenticateError
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public int hashCode() {
            return getErrorMsg().hashCode();
        }

        public String toString() {
            return "LockoutPermanent(errorMsg=" + getErrorMsg() + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000ePLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN1ZS@\u000fqڜ::ӋTqqM\u0016'\u000e&\u0017Tfg\u0016mН^\rI\u001f\u0014'Ax:Mmx\f\u0011U̸CņC5SsK<)\rD\u000b82P\u0600*\u000b\u0007\u001a8M(v)B\u0012Đ\u0011ضDr@X\u001bTM2 \u0010V /'\rm\\;`ns9]+IޚCĚ+a6\u0007[\u0018\u000fb5\u001a\u000faL7\u0007̑4չ)U\t\u0014`i\b\u0011M\u0001U\u0005\u0017&mȺHָ[8^\u000f\"\u0018{g\u001b]\u000b&\u000b\u0004\bub˄-յgUX\u0010.w\t|%>\n\u0010\u0014*"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[jERt9#\u0016k\u000e+;\u001c\u0014cJy", "", "3qa<e\u0014LU", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001\r|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", ">/", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011~\u001c\u0006t/BY\f\u001f=7\u0014;aNJu}\u001a l+'\u000be5+z1OL]9`PNM#\u0015Z\u0017]/\u000b\u0001hA\u0004{QA,F\u0015I\u00047w\u0005\u001d\u0016jEy\u007fL_e", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[\u0002"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class NegativeButton extends SignBiometricAuthenticateError {
        private final String errorMsg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NegativeButton(String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMsg = str;
        }

        public static /* synthetic */ NegativeButton copy$default(NegativeButton negativeButton, String str, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                str = negativeButton.getErrorMsg();
            }
            return negativeButton.copy(str);
        }

        public final String component1() {
            return getErrorMsg();
        }

        public final NegativeButton copy(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new NegativeButton(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NegativeButton) && Intrinsics.areEqual(getErrorMsg(), ((NegativeButton) obj).getErrorMsg());
        }

        @Override // com.ts.coresdk.crypto.api.SignBiometricAuthenticateError
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public int hashCode() {
            return getErrorMsg().hashCode();
        }

        public String toString() {
            return "NegativeButton(errorMsg=" + getErrorMsg() + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000ePLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN1ZS@\u000fqڜ::ӋTqqM\u0016)\u000e(\u0017Tfi}mxYŲG\u0011\f&\u0007{tYc|u\u0014%1pn\u0006ޔNڱA;fxD\bhL0>\u0012\u0005/ɝZP\u0016v\tHc\u000e(/no\u0001ŭ\f̂\t\u001c\u0018\fL'I6jqf6vu\u000e@=(\u001bkXMUgvƾNϘJV-\u0017\u0005lf9NDM\u0015S_I߮QÜC\u0005E~K\u0013155:as\u00065\u001fĴ\u0013Ʀ/Q\u0013l\u0001)-\u001f_`$)AN\u0012J\u0007#~Ó|ԫ\u0011F\f\u0010\f'V/E\u001cl\n\u001c6"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[jE\\Z9#\u0010]c", "", "3qa<e\u0014LU", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001\r|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", ">/", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011~\u001c\u0006t/BY\f\u001f=7\u0014;aNJu}\u001a l+'\u000be5+z1OL]9`PNM#\u0015Z\u0017]/\u000b\u0001hA\u0004{QA,F\u0015Si7w~\u000fk", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[\u0002"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class NoMatch extends SignBiometricAuthenticateError {
        private final String errorMsg;

        public NoMatch(String str) {
            super(str, null);
            this.errorMsg = str;
        }

        public static /* synthetic */ NoMatch copy$default(NoMatch noMatch, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = noMatch.getErrorMsg();
            }
            return noMatch.copy(str);
        }

        public final String component1() {
            return getErrorMsg();
        }

        public final NoMatch copy(String str) {
            return new NoMatch(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoMatch) && Intrinsics.areEqual(getErrorMsg(), ((NoMatch) obj).getErrorMsg());
        }

        @Override // com.ts.coresdk.crypto.api.SignBiometricAuthenticateError
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public int hashCode() {
            if (getErrorMsg() == null) {
                return 0;
            }
            return getErrorMsg().hashCode();
        }

        public String toString() {
            return "NoMatch(errorMsg=" + getErrorMsg() + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000ePLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN1ZS@\u000fqڜ::ӋTqqM\u0016'\u000e&\u0017Tfg\u0016mН^\rI\u001f\u0014'Ax:Mmx\f\u0011U̸CņC5SsK<)\rD\u000b82P\u0600*\u000b\u0007\u001a8M(v)B\u0012Đ\u0011ضDr@X\u001bTM2 \u0010V /'\rm\\;`ns9]+IޚCĚ+a6\u0007[\u0018\u000fb5\u001a\u000faL7\u0007̑4չ)U\t\u0014`i\b\u0011M\u0001U\u0005\u0017&mȺHָ[8^\u000f\"\u0018{g\u001b]\u000b&\u000b\u0004\bub˄-յgUX\u0010.w\t|%>\n\u0010\u0014*"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[jE\\`H\u0010\u0010Zc", "", "3qa<e\u0014LU", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001\r|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", ">/", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011~\u001c\u0006t/BY\f\u001f=7\u0014;aNJu}\u001a l+'\u000be5+z1OL]9`PNM#\u0015Z\u0017]/\u000b\u0001hA\u0004{QA,F\u0015SoFd~\fk", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[\u0002"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class NoSpace extends SignBiometricAuthenticateError {
        private final String errorMsg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoSpace(String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMsg = str;
        }

        public static /* synthetic */ NoSpace copy$default(NoSpace noSpace, String str, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = noSpace.getErrorMsg();
            }
            return noSpace.copy(str);
        }

        public final String component1() {
            return getErrorMsg();
        }

        public final NoSpace copy(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new NoSpace(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoSpace) && Intrinsics.areEqual(getErrorMsg(), ((NoSpace) obj).getErrorMsg());
        }

        @Override // com.ts.coresdk.crypto.api.SignBiometricAuthenticateError
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public int hashCode() {
            return getErrorMsg().hashCode();
        }

        public String toString() {
            return "NoSpace(errorMsg=" + getErrorMsg() + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000ePLcz\u0006I\u0006>\f6B\u0005*4\u0012\u0006јnjG9LeN.ZS8\u0015s{:'c$\bCA٭ \u0014̝9O|\u0001(\bZ`\u0019N'\b,w\u0019+Y[\u0007i*\u0011HA\u001eCݯQqCPn\r~\u0015.;::\u0010\u0004/\u0019pт\u0011ͯ~EQ\u0015 3\t\u0001H\\%O\u001b\u0019@\n\u0005Ű\u0002ɉ`iT@Vt&`=0\u001bip÷Wg6|[\u0018^V=\f%`N3F7C!=U\u0019\u0006\u0001_\u0006Ʃ>џA\u0007n459\u0012\feGp\u007fB%[U\u001bh\u000b(r\u0004\u007foR̃,յgMV\u001f6\nC\n\u001bP\u001c\u000e4:\u000fΪ,բj\n\u0014G\u0003\b\u001cN^\u0018vB.y(ٿ\u0016Ӿ\u000451O)i\"{I\u0019f9\u0012\u0004;\u001dY\u0016Eħ]ڍ\u0012j\u001d\u001dZw_2iBCJ\\\r*W{\t\td\u0018)24}\u0005\u0006ɍ\u0013ѧ\u001b/?]?(/q\u001aJJn\u0005\r"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[jFau=!g", "", "3qa<e\u0014LU", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001\r|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "", "B", "\u001aiPCTuEO\"\u0001DM/\n\u0013Aa|/{\u0016", "5dc!", "u(;7T=:\u001d z\u0004`uk\f<o\u0012$xG\u0001l", "1n\\=b5>\\(J", "1n\\=b5>\\(K", ">/", ">0", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~R2(\u001d2pGPa6[v5FR\u0018*if}L\u001e[V\u0019Rtz\t[J\u0001rN?\u001f\u00179M\u007f\u0017x\u0010\u000f\u0016\u0017Dnn>e\u0010'\u0007\"\u007fNgRU\\_\u0007\u001d", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn$\\\u000b*Ii\u00135M\u0019~\\", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[\u0002"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Other extends SignBiometricAuthenticateError {
        private final String errorMsg;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Throwable f18273t;

        public Other(String str, Throwable th) {
            super(str, null);
            this.errorMsg = str;
            this.f18273t = th;
        }

        public static /* synthetic */ Other copy$default(Other other, String str, Throwable th, int i2, Object obj) {
            if ((1 & i2) != 0) {
                str = other.getErrorMsg();
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                th = other.f18273t;
            }
            return other.copy(str, th);
        }

        public final String component1() {
            return getErrorMsg();
        }

        public final Throwable component2() {
            return this.f18273t;
        }

        public final Other copy(String str, Throwable th) {
            return new Other(str, th);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Other)) {
                return false;
            }
            Other other = (Other) obj;
            return Intrinsics.areEqual(getErrorMsg(), other.getErrorMsg()) && Intrinsics.areEqual(this.f18273t, other.f18273t);
        }

        @Override // com.ts.coresdk.crypto.api.SignBiometricAuthenticateError
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public final Throwable getT() {
            return this.f18273t;
        }

        public int hashCode() {
            int iHashCode = (getErrorMsg() == null ? 0 : getErrorMsg().hashCode()) * 31;
            Throwable th = this.f18273t;
            return iHashCode + (th != null ? th.hashCode() : 0);
        }

        public String toString() {
            return "Other(errorMsg=" + getErrorMsg() + ", t=" + this.f18273t + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000ePLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN1ZS@\u000fqڜ::ӋTqqM\u0016'\u000e&\u0017Tfg\u0016mН^\rI\u001f\u0014'Ax:Mmx\f\u0011U̸CņC5SsK<)\rD\u000b82P\u0600*\u000b\u0007\u001a8M(v)B\u0012Đ\u0011ضDr@X\u001bTM2 \u0010V /'\rm\\;`ns9]+IޚCĚ+a6\u0007[\u0018\u000fb5\u001a\u000faL7\u0007̑4չ)U\t\u0014`i\b\u0011M\u0001U\u0005\u0017&mȺHָ[8^\u000f\"\u0018{g\u001b]\u000b&\u000b\u0004\bub˄-յgUX\u0010.w\t|%>\n\u0010\u0014*"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[jKVz=}\"ic", "", "3qa<e\u0014LU", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001\r|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", ">/", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011~\u001c\u0006t/BY\f\u001f=7\u0014;aNJu}\u001a l+'\u000be5+z1OL]9`PNM#\u0015Z\u0017]/\u000b\u0001hA\u0004{QA,F\u001bM\n;R\u0011\u001bk", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[\u0002"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class TimeOut extends SignBiometricAuthenticateError {
        private final String errorMsg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TimeOut(String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMsg = str;
        }

        public static /* synthetic */ TimeOut copy$default(TimeOut timeOut, String str, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                str = timeOut.getErrorMsg();
            }
            return timeOut.copy(str);
        }

        public final String component1() {
            return getErrorMsg();
        }

        public final TimeOut copy(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TimeOut(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TimeOut) && Intrinsics.areEqual(getErrorMsg(), ((TimeOut) obj).getErrorMsg());
        }

        @Override // com.ts.coresdk.crypto.api.SignBiometricAuthenticateError
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public int hashCode() {
            return getErrorMsg().hashCode();
        }

        public String toString() {
            return "TimeOut(errorMsg=" + getErrorMsg() + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000ePLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN1ZS@\u000fqڜ::ӋTqqM\u0016)\u000e(\u0017Tfi}mxYŲG\u0011\f&\u0007{tYc|u\u0014%1pn\u0006ޔNڱA;fxD\bhL0>\u0012\u0005/ɝZP\u0016v\tHc\u000e(/no\u0001ŭ\f̂\t\u001c\u0018\fL'I6jqf6vu\u000e@=(\u001bkXMUgvƾNϘJV-\u0017\u0005lf9NDM\u0015S_I߮QÜC\u0005E~K\u0013155:as\u00065\u001fĴ\u0013Ʀ/Q\u0013l\u0001)-\u001f_`$)AN\u0012J\u0007#~Ó|ԫ\u0011F\f\u0010\f'V/E\u001cl\n\u001c6"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[jL[XF\u001e$cc", "", "3qa<e\u0014LU", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001\r|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", ">/", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011~\u001c\u0006t/BY\f\u001f=7\u0014;aNJu}\u001a l+'\u000be5+z1OL]9`PNM#\u0015Z\u0017]/\u000b\u0001hA\u0004{QA,F\u001cRgDr\u0013\u0015k", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[\u0002"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class UnKnown extends SignBiometricAuthenticateError {
        private final String errorMsg;

        public UnKnown(String str) {
            super(str, null);
            this.errorMsg = str;
        }

        public static /* synthetic */ UnKnown copy$default(UnKnown unKnown, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = unKnown.getErrorMsg();
            }
            return unKnown.copy(str);
        }

        public final String component1() {
            return getErrorMsg();
        }

        public final UnKnown copy(String str) {
            return new UnKnown(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnKnown) && Intrinsics.areEqual(getErrorMsg(), ((UnKnown) obj).getErrorMsg());
        }

        @Override // com.ts.coresdk.crypto.api.SignBiometricAuthenticateError
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public int hashCode() {
            if (getErrorMsg() == null) {
                return 0;
            }
            return getErrorMsg().hashCode();
        }

        public String toString() {
            return "UnKnown(errorMsg=" + getErrorMsg() + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000ePLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN1ZS@\u000fqڜ::ӋTqqM\u0016'\u000e&\u0017Tfg\u0016mН^\rI\u001f\u0014'Ax:Mmx\f\u0011U̸CņC5SsK<)\rD\u000b82P\u0600*\u000b\u0007\u001a8M(v)B\u0012Đ\u0011ضDr@X\u001bTM2 \u0010V /'\rm\\;`ns9]+IޚCĚ+a6\u0007[\u0018\u000fb5\u001a\u000faL7\u0007̑4չ)U\t\u0014`i\b\u0011M\u0001U\u0005\u0017&mȺHָ[8^\u000f\"\u0018{g\u001b]\u000b&\u000b\u0004\bub˄-յgUX\u0010.w\t|%>\n\u0010\u0014*"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[jL[n:\u001b\u0012I\u001898\u0017\u0003YO2D", "", "3qa<e\u0014LU", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001\r|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", ">/", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011~\u001c\u0006t/BY\f\u001f=7\u0014;aNJu}\u001a l+'\u000be5+z1OL]9`PNM#\u0015Z\u0017]/\u000b\u0001hA\u0004{QA,F\u001cR}8o\u0001z xBtnBd\u001e\u001d", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[\u0002"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class UnableToProcess extends SignBiometricAuthenticateError {
        private final String errorMsg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnableToProcess(String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMsg = str;
        }

        public static /* synthetic */ UnableToProcess copy$default(UnableToProcess unableToProcess, String str, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                str = unableToProcess.getErrorMsg();
            }
            return unableToProcess.copy(str);
        }

        public final String component1() {
            return getErrorMsg();
        }

        public final UnableToProcess copy(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new UnableToProcess(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnableToProcess) && Intrinsics.areEqual(getErrorMsg(), ((UnableToProcess) obj).getErrorMsg());
        }

        @Override // com.ts.coresdk.crypto.api.SignBiometricAuthenticateError
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public int hashCode() {
            return getErrorMsg().hashCode();
        }

        public String toString() {
            return "UnableToProcess(errorMsg=" + getErrorMsg() + ")";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000ePLcz\nI\u0006>é6B\r+4\u0012}\u0007njG6LeN1ZS@\u000fqڜ::ӋTqqM\u0016'\u000e&\u0017Tfg\u0016mН^\rI\u001f\u0014'Ax:Mmx\f\u0011U̸CņC5SsK<)\rD\u000b82P\u0600*\u000b\u0007\u001a8M(v)B\u0012Đ\u0011ضDr@X\u001bTM2 \u0010V /'\rm\\;`ns9]+IޚCĚ+a6\u0007[\u0018\u000fb5\u001a\u000faL7\u0007̑4չ)U\t\u0014`i\b\u0011M\u0001U\u0005\u0017&mȺHָ[8^\u000f\"\u0018{g\u001b]\u000b&\u000b\u0004\bub˄-յgUX\u0010.w\t|%>\n\u0010\u0014*"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[jL`rJq\u000ec\fN2\r\u0004/", "", "3qa<e\u0014LU", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u0012e9H`\u0001\r|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", ">/", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'~!\u001f\u0011~\u001c\u0006t/BY\f\u001f=7\u0014;aNJu}\u001a l+'\u000be5+z1OL]9`PNM#\u0015Z\u0017]/\u000b\u0001hA\u0004{QA,F\u001cW\u0002HF|\u0015\u0014\u000e<jo\u0018", "", "", "3pd._:", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "", "6`b566=S", "u(8", "BnBAe0GU", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxc\r<\u0007O\u000b`\u0013RsW*z'>6\u0002*?m%;QA\u0017{C!\u0015qp=\u0005_;NV4TV[\u0002"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class UserCanceled extends SignBiometricAuthenticateError {
        private final String errorMsg;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UserCanceled(String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.errorMsg = str;
        }

        public static /* synthetic */ UserCanceled copy$default(UserCanceled userCanceled, String str, int i2, Object obj) {
            if ((i2 + 1) - (i2 | 1) != 0) {
                str = userCanceled.getErrorMsg();
            }
            return userCanceled.copy(str);
        }

        public final String component1() {
            return getErrorMsg();
        }

        public final UserCanceled copy(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new UserCanceled(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserCanceled) && Intrinsics.areEqual(getErrorMsg(), ((UserCanceled) obj).getErrorMsg());
        }

        @Override // com.ts.coresdk.crypto.api.SignBiometricAuthenticateError
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public int hashCode() {
            return getErrorMsg().hashCode();
        }

        public String toString() {
            return "UserCanceled(errorMsg=" + getErrorMsg() + ")";
        }
    }

    private SignBiometricAuthenticateError(String str) {
        this.errorMsg = str;
    }

    public /* synthetic */ SignBiometricAuthenticateError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }
}
