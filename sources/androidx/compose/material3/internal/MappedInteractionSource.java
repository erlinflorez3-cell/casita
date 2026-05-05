package androidx.compose.material3.internal;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import com.dynatrace.android.agent.Global;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: compiled from: MappedInteractionSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007njO0LeN/ZS82s{J$c$wDA٥0ԂR\t}M(z~Nh\u000b[\u000f4\u0015\tn:Jmx\f\u0014Ƥ6B}B{[}JQ`#B5$@0Py3\r`*\u0019$\u0005{[K:\u0014\u0007ώrŦQ҈͘\u0004\u0019Ū\n@(\u0001,`8fDM\u0005cJ13\u0003\u0018I|-6ܵ~֔\u0011L\\܋%xg&9I\bM#/k\u000f\u0017Tk?1K\u0002?\u0015hU3YTJɑ8ݼ\u0004\u0014\u001dۀ̀\rfz)bԆm\u000f\u000b/+U\u0003\u05c8T\u001d"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0016INFk3\u0002\u001ewaF\u0003a;R\u000105V^9ZRH", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6Wd1WYL,2", "CmS2e3RW\"\u0001^g;|\u0016+c\u000f,\u0006In!'Tm\u000e", "2d[AT", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u0018'$hn5\u0005r0X\u007f\u0015Q\\[*\\(W$\u001a\u001ci\u0015R4V\njImrMF\u001f\u00155E\t\u0005G\u0001\r\u0012\u001e<yNL_\u001eV\u0007%sP3u.Ul\u007fGN\u001b&\u001b", "\u0018", "7mc2e(<b\u001d\t\u0004l", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6WL", "5dc\u0016a;>`\u0015|\nb6\u0006\u0017", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ\u0018\u001eQ\u0002W\u001d}/G/", ";`_=X+)`\u0019\r\t^:", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005VA\u001e#vEB\u0016c9Jt6KVWjG_rK\"g", ";`_\u001de,La", ">qT@f", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MappedInteractionSource implements InteractionSource {
    public static final int $stable = 0;
    private final long delta;
    private final Flow<Interaction> interactions;
    private final Map<PressInteraction.Press, PressInteraction.Press> mappedPresses;

    public /* synthetic */ MappedInteractionSource(InteractionSource interactionSource, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource, j2);
    }

    private MappedInteractionSource(InteractionSource interactionSource, long j2) {
        this.delta = j2;
        this.mappedPresses = new LinkedHashMap();
        final Flow<Interaction> interactions = interactionSource.getInteractions();
        this.interactions = new Flow<Interaction>() { // from class: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1

            /* JADX INFO: renamed from: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJh\u0003İY\u0006^\nND\u0005Ӭ:\u0012\u0018\tliG1tiV0jSp\u000f2ڟrż_&wFIYۥ\u0002("}, d2 = {"\n`]<a@F])\rS", "", "\"", Global.BLANK, "D`[BX", "3lXA", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "9nc9\\5Q\u001d\u0017\t\bh<\f\r8e\u000eq|G\u000b)`(v\u0018N\\4/S](;|%.ZQ!zr.\u001ev]:\u0007R9J\u007f5HV[4\u001b\u001e1\t", "9nc9\\5Q\u001d\u0017\t\bh<\f\r8e\u000eq|G\u000b)`(v\u0018N\\4/Sl-3v$/WPCQC\\\u001ddlwEg5Uz0GK\r<e`n>\u0014\u0001g\nW9\u000e\u000ffIb:\u0003\u0004"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ MappedInteractionSource this$0;

                /* JADX INFO: renamed from: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @InterfaceC1492Gx
                @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\b\u000e\u0015\u0007\u0015\u0012\u0006\u0012Tt\n\u001a\u001b\u0011\u0011v\u001d$\u0016$\u0014\u0017)\u001f&&\f)0. #b31'&-&2jk2875;33s>3Cw\u0006y\t", f = "\u001a-;:.,\u001049)5#$4(-+\u000f*/+\u001b\u001cc (", i = {}, l = {223}, m = "4=:F", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        int i2 = this.label;
                        this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, MappedInteractionSource mappedInteractionSource) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = mappedInteractionSource;
                }

                /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L94
                        r4 = r8
                        androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1 r4 = (androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r4
                        int r0 = r4.label
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L94
                        int r0 = r4.label
                        int r0 = r0 - r1
                        r4.label = r0
                    L13:
                        java.lang.Object r1 = r4.result
                        java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r4.label
                        r5 = 1
                        if (r0 == 0) goto L26
                        if (r0 != r5) goto L9b
                        kotlin.ResultKt.throwOnFailure(r1)
                    L23:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L26:
                        kotlin.ResultKt.throwOnFailure(r1)
                        kotlinx.coroutines.flow.FlowCollector r2 = r6.$this_unsafeFlow
                        r0 = r4
                        kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                        androidx.compose.foundation.interaction.Interaction r7 = (androidx.compose.foundation.interaction.Interaction) r7
                        boolean r0 = r7 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
                        if (r0 == 0) goto L52
                        androidx.compose.material3.internal.MappedInteractionSource r1 = r6.this$0
                        r0 = r7
                        androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
                        androidx.compose.foundation.interaction.PressInteraction$Press r1 = androidx.compose.material3.internal.MappedInteractionSource.access$mapPress(r1, r0)
                        androidx.compose.material3.internal.MappedInteractionSource r0 = r6.this$0
                        java.util.Map r0 = androidx.compose.material3.internal.MappedInteractionSource.access$getMappedPresses$p(r0)
                        r0.put(r7, r1)
                        r7 = r1
                        androidx.compose.foundation.interaction.Interaction r7 = (androidx.compose.foundation.interaction.Interaction) r7
                    L49:
                        r4.label = r5
                        java.lang.Object r0 = r2.emit(r7, r4)
                        if (r0 != r3) goto L23
                        return r3
                    L52:
                        boolean r0 = r7 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel
                        if (r0 == 0) goto L73
                        androidx.compose.material3.internal.MappedInteractionSource r0 = r6.this$0
                        java.util.Map r1 = androidx.compose.material3.internal.MappedInteractionSource.access$getMappedPresses$p(r0)
                        androidx.compose.foundation.interaction.PressInteraction$Cancel r7 = (androidx.compose.foundation.interaction.PressInteraction.Cancel) r7
                        androidx.compose.foundation.interaction.PressInteraction$Press r0 = r7.getPress()
                        java.lang.Object r0 = r1.remove(r0)
                        androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
                        if (r0 != 0) goto L6d
                    L6a:
                        androidx.compose.foundation.interaction.Interaction r7 = (androidx.compose.foundation.interaction.Interaction) r7
                        goto L49
                    L6d:
                        androidx.compose.foundation.interaction.PressInteraction$Cancel r7 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                        r7.<init>(r0)
                        goto L6a
                    L73:
                        boolean r0 = r7 instanceof androidx.compose.foundation.interaction.PressInteraction.Release
                        if (r0 == 0) goto L49
                        androidx.compose.material3.internal.MappedInteractionSource r0 = r6.this$0
                        java.util.Map r1 = androidx.compose.material3.internal.MappedInteractionSource.access$getMappedPresses$p(r0)
                        androidx.compose.foundation.interaction.PressInteraction$Release r7 = (androidx.compose.foundation.interaction.PressInteraction.Release) r7
                        androidx.compose.foundation.interaction.PressInteraction$Press r0 = r7.getPress()
                        java.lang.Object r0 = r1.remove(r0)
                        androidx.compose.foundation.interaction.PressInteraction$Press r0 = (androidx.compose.foundation.interaction.PressInteraction.Press) r0
                        if (r0 != 0) goto L8e
                    L8b:
                        androidx.compose.foundation.interaction.Interaction r7 = (androidx.compose.foundation.interaction.Interaction) r7
                        goto L49
                    L8e:
                        androidx.compose.foundation.interaction.PressInteraction$Release r7 = new androidx.compose.foundation.interaction.PressInteraction$Release
                        r7.<init>(r0)
                        goto L8b
                    L94:
                        androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1 r4 = new androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1
                        r4.<init>(r8)
                        goto L13
                    L9b:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Interaction> flowCollector, Continuation continuation) {
                Object objCollect = interactions.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public Flow<Interaction> getInteractions() {
        return this.interactions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PressInteraction.Press mapPress(PressInteraction.Press press) {
        return new PressInteraction.Press(Offset.m3941minusMKHz9U(press.m865getPressPositionF1C5BW0(), this.delta), null);
    }
}
