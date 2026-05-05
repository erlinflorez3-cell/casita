package com.dynatrace.agent.communication.api;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000eӵLcz\u0006I\u0006F\u000b6B\u0015\"4ߚ}5|ʑi0rd\u0001.TVj\u0016q}Č(]*qQ<٨\u0019}&\u000eҐRm"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u0017\u001f=k=-\u0003w]H\u00079", "", "\nh]6g\u0005", "u(E", "\u0013mP/_,=", "\u0012hb.U3>R", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u0017\u001f=k=-\u0003w]H\u0007\"\u000bR\u0005#DSN+2", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u0017\u001f=k=-\u0003w]H\u0007\"\fWr$NLM\u0002", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public abstract class AgentState {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLcz\u0005I\u0006>\u00146Ȑ\u0007\":ߚ\u007fјnjG6L͜P.`_2şqۛ<:ӋTqq:\u0016!\u0004\"\u07beSPmg|K#\u001cQ\u0011\u001e\u0016'm\\Oc|u\u0014%1pt\u0006ޣN8DGf\r63'xƉ7B\f\u000f\"BH>\u007fAƦJñ\u0016:"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u0017\u001f=k=-\u0003w]H\u0007\"\u000bR\u0005#DSN+2", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u0017\u001f=k=-\u0003w]H\u00079", "\nh]6g\u0005", "u(E", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Disabled extends AgentState {
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Disabled)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 264509867;
        }

        public String toString() {
            return "Disabled";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLш|\u0004O\u000f8\u000b4H\u0007\":ߚ\u007fјnjG6L͜P.`_2şqڛ::ӋTqq:\u0016'\u000e&\u0017Ofg\u0016oН^\rI\u0011\u0014\u0019Aq:Omx\f\u0013U̷C8PAT\b=gś%<\u000b @\"Py3\u0002`ޙGX\b\tKc\f@1pvH[%O\u001b\u0019@\u0010\u0005ſ\u0002fcuYNH\u001bi\u0001ș\"KpP[?_^\u000b\u0014ЌE%6\u001bvy\u001eYA˝9\u001b-م\u001b\tX_M\bӳuL"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u0017\u001f=k=-\u0003w]H\u0007\"\fWr$NLM\u0002", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001i!2\u0017\u001f=k=-\u0003w]H\u00079", "=m[F;0@V\u0004\f~h9\u0001\u0018CE\u0011(\u0005O\u000f", "", "\nh]6g\u0005", "uY\u0018#", "5dc\u001ca3R6\u001d\u0001}I9\u0001\u0013<i\u000f<[Q\u0001 &U", "u(I", "1n\\=b5>\\(J", "1n_F", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Enabled extends AgentState {
        private final boolean onlyHighPriorityEvents;

        public Enabled(boolean z2) {
            super(null);
            this.onlyHighPriorityEvents = z2;
        }

        public static /* synthetic */ Enabled copy$default(Enabled enabled, boolean z2, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
                z2 = enabled.onlyHighPriorityEvents;
            }
            return enabled.copy(z2);
        }

        public final boolean component1() {
            return this.onlyHighPriorityEvents;
        }

        public final Enabled copy(boolean z2) {
            return new Enabled(z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Enabled) && this.onlyHighPriorityEvents == ((Enabled) obj).onlyHighPriorityEvents;
        }

        public final boolean getOnlyHighPriorityEvents() {
            return this.onlyHighPriorityEvents;
        }

        public int hashCode() {
            return Boolean.hashCode(this.onlyHighPriorityEvents);
        }

        public String toString() {
            return "Enabled(onlyHighPriorityEvents=" + this.onlyHighPriorityEvents + ')';
        }
    }

    private AgentState() {
    }

    public /* synthetic */ AgentState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
