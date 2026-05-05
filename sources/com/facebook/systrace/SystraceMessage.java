package com.facebook.systrace;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007fјnjG7L͜P.`_2\u000fq~:Ơ[:ڎs;\u0004\u00196#\u0013ZZ(ltJҼ\u000fC\u001d\u0006^\u000fx/aU'aB\u0013@G\b?aS AGg\r63(x'\u0001\b\u0013\n2*v\u0014'~QP$\u0012^F7?#\u001d[\u00062\u00124@V\u0005\\`>\u07b6BՂp]Bǂݳ\u0007v"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0017Cs\u000f5w>\u0001`\u0005[}\u001dIr#5A}.Ei\u0018.#", "", "u(E", "\u0017M2\u0019H\u000b\u001eMtk\\L", "", "0dV6a\u001a>Q(\u0003\u0005g", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0017Cs\u000f5w>\u0001`\u0005[}\u001dIr#5A}.Ei\u0018.\f Ko;\u001d\u0015u7", "B`V", "", "AdRA\\6G<\u0015\u0007z", "", "3mS X*MW#\b", "\u0010tX9W,K", "\u0013mS X*MW#\bWn0\u0004\b/r", "!sP?g\u001a>Q(\u0003\u0005g\t\r\r6d\u007f5", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class SystraceMessage {
    public static boolean INCLUDE_ARGS = false;
    public static final SystraceMessage INSTANCE = new SystraceMessage();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176Ȑ\u0007\":\u0016\u007f\u0007tpA0RlP\u008cZS8\u000fsڔ:Hqҕ\"CiTZ\u0001̀\rO\\g0\u0005X[#C=إF|x.aU'`B\u0013@F\b?aL6a\u0002v\u00037\u001d `Ĳh}\u0013\u00032*v\u0013'~QO$\u0012^E7^\u001b#[\u00062\u00124̄P\u0005,^\u007fNdK\u001daH3;\u0003\u0018H\u0015K(F\u000bN%F\u0003܋=zo C@e8E)a\u0007\u001fR\nFIc:C\u0013p?'YR:{͕\\\n"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0017Cs\u000f5w>\u0001`\u0005[}\u001dIr#5A}.Ei\u0018.\f Ko;\u001d\u0015u7", "", "u(E", "/qV", "9dh", "", "D`[BX", "", "", "", "4kd@[", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static abstract class Builder {
        public abstract Builder arg(String str, double d2);

        public abstract Builder arg(String str, int i2);

        public abstract Builder arg(String str, long j2);

        public abstract Builder arg(String str, Object obj);

        public abstract void flush();
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004O\r8\u000b4C\u0007\":\u001e\u007fјnjGӄLeV2ZS8\u0015sڔ<$i$yّAU0ԂR\t}M(r~Nh\u000b[\u000f4\u0017ѱn,WWAs \u0012JB\u001e>cQ}AQ`#;5$@(Py3\b`>\u0011&\u0005}[K:\u0011`D~>j\r{\nJ\u0016\u0014D8\u0001Ld.b~^z`R/Q\u0002\u001aF\\+w0+R=Jb-%v\u0010'qT\u007fK#(k\u00035Q\fC\u0011C\n=3mW+9O\fWdYF(]1]\u0017urTgKe1\u00185+gcyQdߍyߡ\u007f\rDǉأ\n3"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0017Cs\u000f5w>\u0001`\u0005[}\u001dIr#5A}.Ei\u0018.\f#Dj\"\u001e\u0013weC\u0010@<R}&GY$", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0017Cs\u000f5w>\u0001`\u0005[}\u001dIr#5A}.Ei\u0018.\f Ko;\u001d\u0015u7", "B`V", "", "uI\u0018#", "/qV", "9dh", "", "D`[BX", "", "", "", "4kd@[", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class EndSectionBuilder extends Builder {
        private final long tag;

        public EndSectionBuilder(long j2) {
            this.tag = j2;
        }

        @Override // com.facebook.systrace.SystraceMessage.Builder
        public Builder arg(String key, double d2) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this;
        }

        @Override // com.facebook.systrace.SystraceMessage.Builder
        public Builder arg(String key, int i2) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this;
        }

        @Override // com.facebook.systrace.SystraceMessage.Builder
        public Builder arg(String key, long j2) {
            Intrinsics.checkNotNullParameter(key, "key");
            return this;
        }

        @Override // com.facebook.systrace.SystraceMessage.Builder
        public Builder arg(String key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return this;
        }

        @Override // com.facebook.systrace.SystraceMessage.Builder
        public void flush() {
            Systrace.endSection(this.tag);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004O\r8é6B\r.4\u0012}\u0007njGOL͜P.`S2\u000fq|<$iҕyCIY\"}0\u000fWNmgtJpŏs\u000f4\u00159}<Mcxu\u0012=3RsM5eok<žx6\u0013$z8F\u0001\u001d\u0001H2x\u0014\u0005\u0004[K:\u0015`D~Dj\r{\b`\u0012NT.\f6\\\u0016MfLzfR/Q\u0006\u001aF\\1w0+YSZ\u001d=\u001b\u0002y\u001eY?g9#.k\u00035U\fC\u0011I\n=3um;s_\u0002bNX.\u0013E/]\u0016urT_5Un\u0016?+}q\u0012dV>\u0006\u0006\u0014\rj\u0003>\n5QF-Hi8\u0012A~\u000bSnQHr\u000b\u0006\tpN\u0017S\by?\n-tVyA)PG{3\u0010L)W͜#ƟX\u000ehٽk`\u0006SIQn@\u001fݓ\fՒAm\f͏3\u000e8\u0004HG.0R\u00800ϲ)7cݽأ%{"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0017Cs\u000f5w>\u0001`\u0005[}\u001dIr#5A}.Ei\u0018.\f1JgA-\u0003h_H\u000bm5+\u0007+NKN92", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0017Cs\u000f5w>\u0001`\u0005[}\u001dIr#5A}.Ei\u0018.\f Ko;\u001d\u0015u7", "B`V", "", "AdRA\\6G<\u0015\u0007z", "", "uI;7T=:\u001d z\u0004`uj\u0018<i\t*Q\u0004q", "/qV@", "", "/cS\u000ee.", "", "9dh", "D`[BX", "/qV", "", "", "", "4kd@[", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class StartSectionBuilder extends Builder {
        private final List<String> args;
        private final String sectionName;
        private final long tag;

        public StartSectionBuilder(long j2, String sectionName) {
            Intrinsics.checkNotNullParameter(sectionName, "sectionName");
            this.tag = j2;
            this.sectionName = sectionName;
            this.args = new ArrayList();
        }

        private final void addArg(String str, String str2) {
            this.args.add(str + ": " + str2);
        }

        @Override // com.facebook.systrace.SystraceMessage.Builder
        public Builder arg(String key, double d2) {
            Intrinsics.checkNotNullParameter(key, "key");
            addArg(key, String.valueOf(d2));
            return this;
        }

        @Override // com.facebook.systrace.SystraceMessage.Builder
        public Builder arg(String key, int i2) {
            Intrinsics.checkNotNullParameter(key, "key");
            addArg(key, String.valueOf(i2));
            return this;
        }

        @Override // com.facebook.systrace.SystraceMessage.Builder
        public Builder arg(String key, long j2) {
            Intrinsics.checkNotNullParameter(key, "key");
            addArg(key, String.valueOf(j2));
            return this;
        }

        @Override // com.facebook.systrace.SystraceMessage.Builder
        public Builder arg(String key, Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            addArg(key, value.toString());
            return this;
        }

        @Override // com.facebook.systrace.SystraceMessage.Builder
        public void flush() {
            String str;
            long j2 = this.tag;
            String str2 = this.sectionName;
            if (!SystraceMessage.INCLUDE_ARGS || this.args.isEmpty()) {
                str = "";
            } else {
                str = " (" + String.join(", ", this.args) + ")";
            }
            Systrace.beginSection(j2, str2 + str);
        }
    }

    private SystraceMessage() {
    }

    @JvmStatic
    public static final Builder beginSection(long j2, String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        return new StartSectionBuilder(j2, sectionName);
    }

    @JvmStatic
    public static final Builder endSection(long j2) {
        return new EndSectionBuilder(j2);
    }
}
