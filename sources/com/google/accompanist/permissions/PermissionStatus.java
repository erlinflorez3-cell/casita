package com.google.accompanist.permissions;

import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4ߚ}||ʑi0rd\u0001.RTն\u000ek}7ǒZҕڑC?]\u001c\u0004A7NɇkkĲNY"}, d2 = {"\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7\u0001.ZK?yB\"\u001fqOH\u0003r<\\L", "", "\u0012d]6X+", "\u0015qP;g,=", "\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7\u0001.ZK?yB\"\u001fqOH\u0003r<\\5\u0006GUR,[(", "\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7\u0001.ZK?yB\"\u001fqOH\u0003r<\\5\tTHW;\\QH", ">da:\\:LW#\b\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface PermissionStatus {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLш|\u0004O\u000f8\u000b4G\u0007\":ߚ\u007fјnjG6L͜P.`_2şqڜ::ӋTqq:\u0016%\u000e&\u0017Ofg\u0016oН^\u000bQ\u0011N\u001d\u0007oDI\u0004y$ݏ\u0010zS}EKM\u001eމifz6\u0013 J\"fzKі\u0019rY\u001e}\u0013Cy\rB6NxRT#L3#XĶ?h\b,f\u007fNdS3Ӯ9w*\u0011uZNUlvƾL]Ub'%v\u0010\u001fҋD==Ֆ=U\t\n`_ϓ\u0007M"}, d2 = {"\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7\u0001.ZK?yB\"\u001fqOH\u0003r<\\5\u0006GUR,[(", "\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7\u0001.ZK?yB\"\u001fqOH\u0003r<\\L", "Ag^B_+,V#\u0011gZ;\u0001\u00138a\u0007(", "", "uY\u0018#", "5dc [6NZ\u0018l}h>i\u0005>i\n1wG\u0001", "u(I", "1n\\=b5>\\(J", "1n_F", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", ">da:\\:LW#\b\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Denied implements PermissionStatus {
        public static final int $stable = 0;
        private final boolean shouldShowRationale;

        public Denied(boolean z2) {
            this.shouldShowRationale = z2;
        }

        public static /* synthetic */ Denied copy$default(Denied denied, boolean z2, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                z2 = denied.shouldShowRationale;
            }
            return denied.copy(z2);
        }

        public final boolean component1() {
            return this.shouldShowRationale;
        }

        public final Denied copy(boolean z2) {
            return new Denied(z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Denied) && this.shouldShowRationale == ((Denied) obj).shouldShowRationale;
        }

        public final boolean getShouldShowRationale() {
            return this.shouldShowRationale;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldShowRationale);
        }

        public String toString() {
            return "Denied(shouldShowRationale=" + this.shouldShowRationale + ')';
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u0016DLcz\u0004Gڒ0!Ǟr~P+R|\rfʴ=0Re߲2S"}, d2 = {"\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7\u0001.ZK?yB\"\u001fqOH\u0003r<\\5\tTHW;\\QH", "\u001ab^:\".H]\u001b\u0006z((z\u00079m\u000b$\u0005D\u000f&`Ro\u001bDz3C]\b)E7\u0001.ZK?yB\"\u001fqOH\u0003r<\\L", "u(E", ">da:\\:LW#\b\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Granted implements PermissionStatus {
        public static final int $stable = 0;
        public static final Granted INSTANCE = new Granted();

        private Granted() {
        }
    }
}
