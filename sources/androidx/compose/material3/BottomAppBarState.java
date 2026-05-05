package androidx.compose.material3;

import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4N\u0005\bBߚ\u0016\u0015\u0017jg/|dV~ba*'k*5zӲ&ڱG?m\u001c\u0004$\u0017R\u001f}urbZ9Deٌ\"ѱn6aW~b \u0012RDuEAT@SGh\r63!\třDѩ\t\u000b2,N\u0019\u0005}cM\u0012\u001c>GAP`\u0018e\u0005H\u0013\\̫,Ә\"f\u007fP<Tz`Z1)\u0010wIŰ&ڿܡ|Q\u0015HZF;uҖ\":é;4"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006S/Dh\b(\u0013x!\u000bIP)z0-\u0015>", "", "1n[9T7LS\u0018_\bZ*\f\r9n", "", "5dc\u0010b3EO$\rz]\r\n\u0005-t\u00042\u0005", "u(5", "1n]AX5M=\u001a\u007f\t^;", "5dc\u0010b5MS\"\u000ed_-\u000b\t>", "Adc\u0010b5MS\"\u000ed_-\u000b\t>", "uE\u0018#", "6dX4[;(T\u001a\rzm", "5dc\u0015X0@V(h{_:|\u0018", "Adc\u0015X0@V(h{_:|\u0018", "6dX4[;(T\u001a\rzm\u0013\u0001\u00113t", "5dc\u0015X0@V(h{_:|\u0018\u0016i\b,\u000b", "Adc\u0015X0@V(h{_:|\u0018\u0016i\b,\u000b", "\u0011n\\=T5B]\"", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface BottomAppBarState {
    public static final Companion Companion = Companion.$$INSTANCE;

    float getCollapsedFraction();

    float getContentOffset();

    float getHeightOffset();

    float getHeightOffsetLimit();

    void setContentOffset(float f2);

    void setHeightOffset(float f2);

    void setHeightOffsetLimit(float f2);

    /* JADX INFO: compiled from: AppBar.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\blʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$B\\IV2\b2\u000b_N\u0016j~J`\fq\u0011و\u001a~rߚaW~a \u0014̙Fu"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006S/Dh\b(\u0013x!\u000bIP)z0-\u0015'?C\u000fn(Wz1P\"", "", "u(E", "!`e2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006S/Dh\b(\u0013x!\u000bIP)z0-\u0015>", "5dc T=>`", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0005!FYy\u001d>m_\u001cIT;x\n", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Saver<BottomAppBarState, ?> Saver = ListSaverKt.listSaver(new Function2<SaverScope, BottomAppBarState, List<? extends Float>>() { // from class: androidx.compose.material3.BottomAppBarState$Companion$Saver$1
            @Override // kotlin.jvm.functions.Function2
            public final List<Float> invoke(SaverScope saverScope, BottomAppBarState bottomAppBarState) {
                return CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(bottomAppBarState.getHeightOffsetLimit()), Float.valueOf(bottomAppBarState.getHeightOffset()), Float.valueOf(bottomAppBarState.getContentOffset())});
            }
        }, new Function1<List<? extends Float>, BottomAppBarState>() { // from class: androidx.compose.material3.BottomAppBarState$Companion$Saver$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ BottomAppBarState invoke(List<? extends Float> list) {
                return invoke2((List<Float>) list);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final BottomAppBarState invoke2(List<Float> list) {
                return AppBarKt.BottomAppBarState(list.get(0).floatValue(), list.get(1).floatValue(), list.get(2).floatValue());
            }
        });

        private Companion() {
        }

        public final Saver<BottomAppBarState, ?> getSaver() {
            return Saver;
        }
    }
}
