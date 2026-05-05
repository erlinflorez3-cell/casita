package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: LazyListItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{BBc$\u007fICU \u0006*\t]NogtJb\u000bQƤ\u000e\u0016~j4Ic\u0002e\u0012\u00156HpU\u074c}ok8!\u0018F\t.2:8(\u0006\u0011\u001e8J(v)F[\u0010 4XphW\u001dQ\u0013 *\u0006l'Ә\"\\uV~czrR/Q\u0019\u001aF\\>w0+X=Jb?%v\u00107qU˝9\u00153mK\u0018`vW\u0003m\u000em\u000bvD?-_r\u0006O\u001fó\u0014];]+ut<[3j\u0011\u00105Bgcy[T<@\t\n,T\u0004<\u0011WL<E2f6'y\t;aNp\u001a^p\u0019+eD.=\u007fa6\u007f//Wo\\1Ne\u0007K!n;\u000fw9ad\u0010p\u0015I_&[g&\u0017חJݳ\u000e]Uo\n|p\u000fz\u0010>I\u0018/*\u0014\u0005ϒ'ھ_9+ܩ<\u0014VR\u007fv3k\u001f(@ʄJغ&r.90\u0018\u001aj\u0015v\u0013ohT\u00071g܊\u001eΤ\u000b\u0004\u0010ʶ8^}M/7``]n\u0002j{d`ɯ1Ϭ;_v\u0088&Y?qAI\"o\u001eajvB@\u0013ϸ\u0007ֽjB[ێɀ`J"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u0018-\u0015pLF\u0011t0Mv4+TY32", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u0018-\u0015pLF\u0011t0Mv4\u001d", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\"-\u0011wa\u000f", "7mc2e=:Zv\t\u0004m,\u0006\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u0018'$hnJ\u0003j\nX\u007f6GU]\u0002", "7sT:F*H^\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B1R;s\"\u001c\u001fsa\u001d\u000fn3$", "9dh\u0016a+>f\u0001z\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;4v;+UM,o:nHi", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001T\u0012Ca*?yC\f$dp9\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018,\u0017\u0015b@ }HA(Q3E\u0017O2g\b+\"\u001cn~Q:\u0019Vy\"\u0007=0FPbnyPP\u001bI&m\u000bl'`9Mm\u0012{!&r^.S|]!{QuvkQ\"D? S\u0002%-A\u0005i \u0004''9y\u0002\u001d2<|6{\u0003j035q\u000fOf+\b\\\u0003\u001d7fO'o7F#HJ_\u0005pH\u00172&]\u001d\",<--our\u0012u\u0003r+B1ui\u0011F8\u0006R-x\u0014'Yf>fOXy", "6dP1X9\"\\\u0018~\u000e^:", "", "", "5dc\u0015X(=S&b\u0004],\u0010\t=", "u(;7T=:\u001d)\u000e~euc\r=tU", "7sT:66N\\(", "5dc\u0016g,F1#\u000f\u0004m", "u(8", "5dc\u0016g,FA\u0017\t\u0006^", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7|*bW\u001fz4&\u0003fkD\u0007G4Y}|", "5dc\u0018X@\"\\\u0018~\u000eF(\b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u001d*aMKz}\u0005\u0011}u \u0003w6^\u0006\rG`25[R\u0006%\u0010\u001d0", "\u0017sT:", "", "7mS2k", "9dh", "", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wZSDz8&\u00152?C\u000fn6\\v4\u001d0\u0012\u001d", "3pd._:", "", "=sW2e", "5dc\u0010b5MS\"\u000eir7|", "5dc\u0016a+>f", "5dc\u0018X@", "6`b566=S", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class LazyListItemProviderImpl implements LazyListItemProvider {
    private final LazyListIntervalContent intervalContent;
    private final LazyItemScopeImpl itemScope;
    private final LazyLayoutKeyIndexMap keyIndexMap;
    private final LazyListState state;

    public LazyListItemProviderImpl(LazyListState lazyListState, LazyListIntervalContent lazyListIntervalContent, LazyItemScopeImpl lazyItemScopeImpl, LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap) {
        this.state = lazyListState;
        this.intervalContent = lazyListIntervalContent;
        this.itemScope = lazyItemScopeImpl;
        this.keyIndexMap = lazyLayoutKeyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public LazyItemScopeImpl getItemScope() {
        return this.itemScope;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public LazyLayoutKeyIndexMap getKeyIndexMap() {
        return this.keyIndexMap;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getItemCount() {
        return this.intervalContent.getItemCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public void Item(final int i2, final Object obj, Composer composer, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-462424778);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Item)76@3005L150,76@2951L204:LazyListItemProvider.kt#428nma");
        if ((-1) - (((-1) - i3) | ((-1) - 6)) == 0) {
            i4 = (-1) - (((-1) - (composerStartRestartGroup.changed(i2) ? 4 : 2)) & ((-1) - i3));
        } else {
            i4 = i3;
        }
        if ((48 & i3) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(obj) ? 32 : 16;
            i4 = (i4 + i5) - (i4 & i5);
        }
        if ((384 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(this) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-462424778, i4, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:75)");
            }
            LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj, i2, this.state.getPinnedItems$foundation_release(), ComposableLambdaKt.rememberComposableLambda(-824725566, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    ComposerKt.sourceInformation(composer2, "C*78@3104L27:LazyListItemProvider.kt#428nma");
                    if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-824725566, i6, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:77)");
                        }
                        LazyListIntervalContent lazyListIntervalContent = LazyListItemProviderImpl.this.intervalContent;
                        int i7 = i2;
                        LazyListItemProviderImpl lazyListItemProviderImpl = LazyListItemProviderImpl.this;
                        IntervalList.Interval<LazyListInterval> interval = lazyListIntervalContent.getIntervals().get(i7);
                        interval.getValue().getItem().invoke(lazyListItemProviderImpl.getItemScope(), Integer.valueOf(i7 - interval.getStartIndex()), composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - ((i4 >> 3) & 14)) & ((-1) - 3072)))) & ((-1) - ((-1) - (((-1) - (i4 << 3)) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))))));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    LazyListItemProviderImpl lazyListItemProviderImpl = LazyListItemProviderImpl.this;
                    int i7 = i2;
                    Object obj2 = obj;
                    int i8 = i3;
                    lazyListItemProviderImpl.Item(i7, obj2, composer2, RecomposeScopeImplKt.updateChangedFlags((i8 + 1) - (i8 & 1)));
                }
            });
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getKey(int i2) {
        Object key = getKeyIndexMap().getKey(i2);
        return key == null ? this.intervalContent.getKey(i2) : key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public Object getContentType(int i2) {
        return this.intervalContent.getContentType(i2);
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemProvider
    public List<Integer> getHeaderIndexes() {
        return this.intervalContent.getHeaderIndexes();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider
    public int getIndex(Object obj) {
        return getKeyIndexMap().getIndex(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LazyListItemProviderImpl) {
            return Intrinsics.areEqual(this.intervalContent, ((LazyListItemProviderImpl) obj).intervalContent);
        }
        return false;
    }

    public int hashCode() {
        return this.intervalContent.hashCode();
    }
}
