package com.facebook.imagepipeline.systrace;

import android.os.Trace;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\":\u001e\u007fјnjO0LeN.ZS8\u0018s{:$qҕ\"CiTR|,IRɁkg|J#\u0019Q\u0010\u001e\u0016'l\\Mc{u\u0012=6\t\u0004\bA[tU9\u000fzf\t.5:8(\tG.rN\u001e}\u0013Cy\u000eXD\tvHZ%M3#X\u001a̭$\f"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00059Ch\u000b\u001c5m_\rMD7{;-uuaG\u0005m\u001ab\u00056THL,2", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00059Ch\u000b\u001c5m_\u000fZCIi>\f)vpF\u0003a,\rd;U[[(ZRH", "u(E", "0dV6a\u001a>Q(\u0003\u0005g", "", "<`\\2", "", "0dV6a\u001a>Q(\u0003\u0005g\u001e\u0001\u00182A\r*\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00059Ch\u000b\u001c5m_\u000fZCIi>\f)vpF\u0003a,\rR4IZ+<`Yq=!g", "3mS X*MW#\b", "7rC?T*B\\\u001b", "", "\u0012dU.h3M/&\u0001\t;<\u0001\u0010.e\r", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DefaultFrescoSystrace implements FrescoSystrace.Systrace {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004O\u00128\u000b4B\u0007\"B\u0012\u007f\u0007|jA0JgP.`ݷ2şs{B(c$\u007fICU(\u0005*ޛWNugvϺ`\u000bYƤ6\u0016'ilTe|k\u0012'2ppУ7M}?\u0002~\u0003<\u001d(P)`{\u001b\u007fH.v\u0014'~QS$\u0012^A!>`\u0016e\u0005H\u001cL>h\u0017,g\u007fNdԟ\u001daH7;\u0003\u0018C~+m9\u0015M;P\u001b;U\ro)C@eߎE)a\u000b\u001fR\n@3C\u007fF\u001dhU3q]<mDc\u0018\u0014Cۀ\u007f\u0011kz>\\3R\u0011\u001054gcy]T<@\u0011\n\u0018T\u0004<ͺWL<52f6\u000fcx\u0001\\XP0l\t\u0014CgD&=\u007fa;\u007f/7ao>1Re\u007fm\r|(W͜#ƟX\u000ehٽúX\t"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00059Ch\u000b\u001c5m_\rMD7{;-uuaG\u0005m\u001ab\u00056THL,\u001b1r>\u0010\"a\u001d*8\u000f\u00136Q(uC7,]", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u00059Ch\u000b\u001c5m_\u000fZCIi>\f)vpF\u0003a,\rR4IZ+<`Yq=!g", "<`\\2", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "Asa6a.\u001bc\u001d\u0006y^9", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "\u001aj^A_0G\u001d(~\u000emuj\u0018<i\t*XP\u0005\u001e\u0016G|c", "/o_2a+\u001a`\u001b\u000f\u0003^5\f", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "9dh", "D`[BX", "", "/qV", "", "", "", "4kd@[", "", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class DefaultArgsBuilder implements FrescoSystrace.ArgsBuilder {
        private final StringBuilder stringBuilder;

        public DefaultArgsBuilder(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.stringBuilder = new StringBuilder(name);
        }

        private final StringBuilder appendArgument(String str, Object obj) {
            return this.stringBuilder.append(';').append(str + "=" + obj);
        }

        @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.ArgsBuilder
        public DefaultArgsBuilder arg(String key, double d2) {
            Intrinsics.checkNotNullParameter(key, "key");
            appendArgument(key, Double.valueOf(d2));
            return this;
        }

        @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.ArgsBuilder
        public DefaultArgsBuilder arg(String key, int i2) {
            Intrinsics.checkNotNullParameter(key, "key");
            appendArgument(key, Integer.valueOf(i2));
            return this;
        }

        @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.ArgsBuilder
        public DefaultArgsBuilder arg(String key, long j2) {
            Intrinsics.checkNotNullParameter(key, "key");
            appendArgument(key, Long.valueOf(j2));
            return this;
        }

        @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.ArgsBuilder
        public DefaultArgsBuilder arg(String key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            appendArgument(key, value);
            return this;
        }

        @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.ArgsBuilder
        public void flush() {
            if (this.stringBuilder.length() > 127) {
                this.stringBuilder.setLength(127);
            }
            Trace.beginSection(this.stringBuilder.toString());
        }
    }

    @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.Systrace
    public void beginSection(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (isTracing()) {
            Trace.beginSection(name);
        }
    }

    @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.Systrace
    public FrescoSystrace.ArgsBuilder beginSectionWithArgs(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return isTracing() ? new DefaultArgsBuilder(name) : FrescoSystrace.NO_OP_ARGS_BUILDER;
    }

    @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.Systrace
    public void endSection() {
        if (isTracing()) {
            Trace.endSection();
        }
    }

    @Override // com.facebook.imagepipeline.systrace.FrescoSystrace.Systrace
    public boolean isTracing() {
        return false;
    }
}
