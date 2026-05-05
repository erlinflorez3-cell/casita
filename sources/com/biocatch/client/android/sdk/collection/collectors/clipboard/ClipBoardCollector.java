package com.biocatch.client.android.sdk.collection.collectors.clipboard;

import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector;
import com.biocatch.android.commonsdk.collection.focusManager.IFocusManager;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.core.masking.TextMaskingService;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import com.dynatrace.android.callback.Callback;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яp\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCCU }*\teNo˧vJp\u000bK\u000f\f\u0017\u0001jBI]xc\u0013\u00172P{G3SpE9vt>ӌ(208\u0002ڎ\t\u001a@H\u0018͌\u0003CY\u0015\u001aؓHpPR\u0015M\u000b\u001e\u0018ßTĨ1$li^6vl\f9_#1jrNUap ]\u0011TW?\r%e./N<M\u0015SY\u0013\u000b`bW\u0003myM\tv0?+w}ɱ:X\u000e\u001f]7])urTy5Un*?+}\u0003\u0014^\u001cH\u0010z*.l\b\u001c(?H\\P`zP\u0014A\u0019\u000bSnmHr\u000b\f\t\u0007N\u0017S\u001dc/GA~Q\u0010VaTE#\u001d\rL@G\u0003iab6x\u0015Iq>e\u0002]NI`N8f\u0014Ъ\u0006Ͳf\u00022ʶ\u0001Y\u000e=\u0014\u0011\\&[\f2ޔ%\u074co\u0006`Fm\u0007\u0013q9ewd`@P\u0002L\f\u0001µ\u000eʑHh\u001dmVhfAaY*[\u001f}6\u001bvςy˶%%\u0018ʚ zw\u0001e]8<e;\u000eցp«\u0012[Q`9M_|`m`\u0011,?j}[֝r͞W\fb٢x.@Q\u0003\u0010&\u0006\u001b\u008b\u000eƱ6?yʉ\u00058?\u001et\u0015v\ttՖCҴ\r_bӐʖ\u0003}"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011JU0gO|9!\u0011$kU/\u0018ac=1m\"A&\u000f,G\u0011EuV", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011JU0gO|9!\u0011$kU/\u0018\u0002c=1m$H\u001f\u0011;1\f:h\ba", "\u001a`]1e6BRb\u0010~^>Fp/n\u0010\f\u000b@\tU\u0001PW\u000eE\u0007\tDY\u0006}>q\u001444GIz4'\u0015u7", "\u001a`]1e6BRb|\u0005g;|\u0012>/]/\u007fK}!\u0013Tnu8\u007f!7Y\u000b^!v\u0001;QK7xH{\u001cll\u0017\n_5Pv&.P\\;\\[rJi", "/o_9\\*:b\u001d\t\u0004", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "4nRBf\u0014:\\\u0015\u0001zk", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001f\u001ffqGn_5Jx'T\u00162\rfP\u0003K{\u000ec\nP+\u001aZ", "BdgA@(LY\u001d\b|L,\n\u001a3c\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_6IQAo= ^WaL\u0016K(\\|+PN<,icv;\u0014g", "uKP;W9HW\u0018Hvi7Fd:p\u0007,y<\u0010\u001b!PEt:\u0001-~V\u0002*5i%,P\r7t3+\u001fl`\u0003\u0005m4V\u00010UKTuZ\\\u007f=]\u0002i\u0012U9bkWK,8A;)\u0006(X\u007f>2|\u0015\u0015\u001b?no\fT\u001aO\u0002\u001f~O(n\u0010Wi\u0001NACq.n\u0015)\u001ef8J2{m\"\u0017jP;S_4\u001bpb\bOcP\u0015|81\u0014TYPM9R@~%\u001bZyz[.as8~1\u0003}(@l\rUp&=dB\u00136iAp.2J\u0019CTe?[>!w\u0007]\u0016\u0014f>3\u0007ertL\r\u00073ZL", "1kX=U6:`\u0018fvg(~\t<", "\u001a`]1e6BRb|\u0005g;|\u0012>/]/\u007fK}!\u0013Tnu8\u007f!7Y\u000bu", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", ":`bA8=>\\(m\u000fi,", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011JU0gO|9!\u0011$kU/\u0018djA-}3K*\b\u0002", "=m00g0H\\\u0001~\u0004n\u0016\b\t8", "", ";nS2", "\u001a`]1e6BRb\u0010~^>Fd-t\u00042\u0005(\u000b\u0016\u0017\u001d", "=m<2a<\"b\u0019\u0007Xe0z\u000f", "", "7sT:", "\u001a`]1e6BRb\u0010~^>Fp/n\u0010\f\u000b@\tl", "=m??\\4:`-\\\u0002b7Z\f+n\u0002(z", "Adc\u0019T:M3*~\u0004m\u001b\u0011\u0014/", "3uT;g\u001bR^\u0019", "AsP?g", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ClipBoardCollector extends ContinuousCollector<ClipboardEventModel> implements MenuItem.OnMenuItemClickListener, ClipboardManager.OnPrimaryClipChangedListener {
    private final ClipboardManager clipboardManager;
    private final IFocusManager focusManager;
    private ClipEventType lastEventType;
    private final TextMaskingService textMaskingService;
    private final Utils utils;

    public ClipBoardCollector(Application application, Utils utils, IFocusManager focusManager, TextMaskingService textMaskingService) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(focusManager, "focusManager");
        Intrinsics.checkNotNullParameter(textMaskingService, "textMaskingService");
        this.utils = utils;
        this.focusManager = focusManager;
        this.textMaskingService = textMaskingService;
        this.lastEventType = ClipEventType.UNKNOWN;
        Object systemService = application.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.clipboardManager = (ClipboardManager) systemService;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.Clipboard;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isClipboardEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "clipboardEvents";
    }

    public final void onActionMenuOpen(ActionMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        try {
            Menu menu = mode.getMenu();
            if (menu == null || menu.size() <= 0) {
                return;
            }
            int size = menu.size();
            for (int i2 = 0; i2 < size; i2++) {
                menu.getItem(i2).setOnMenuItemClickListener(this);
            }
        } catch (Throwable th) {
            Log.Companion.getLogger().error("error listening to action menu", th);
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem item) {
        Callback.onMenuItemClick_enter(item);
        try {
            Intrinsics.checkNotNullParameter(item, "item");
            setLastEventType(ClipEventType.Companion.getEventType(item));
            Callback.onMenuItemClick_exit();
            return false;
        } catch (Throwable th) {
            Callback.onMenuItemClick_exit();
            throw th;
        }
    }

    @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
    public void onPrimaryClipChanged() {
        String string;
        try {
            if (!this.clipboardManager.hasPrimaryClip()) {
                Log.Companion.getLogger().warning("no primary clip available");
                return;
            }
            ClipData primaryClip = this.clipboardManager.getPrimaryClip();
            Intrinsics.checkNotNull(primaryClip);
            if (primaryClip.getItemCount() > 0) {
                long currentEventId = getCurrentEventId();
                long jCurrentTimeMillis = this.utils.currentTimeMillis();
                CharSequence text = primaryClip.getItemAt(0).getText();
                if (text == null || (string = text.toString()) == null) {
                    string = "";
                }
                addToQueue(new ClipboardEventModel(getContextIDCache().get(), currentEventId, jCurrentTimeMillis, this.lastEventType, this.focusManager.getCurrentFocus().getHash(), this.textMaskingService.maskClipBoardText(this.focusManager.getCurrentFocus().getId(), string)));
            }
        } catch (Throwable th) {
            Log.Companion.getLogger().error("error collecting clipboard events", th);
        }
    }

    public final void setLastEventType(ClipEventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.lastEventType = eventType;
        if (eventType == ClipEventType.PASTE) {
            onPrimaryClipChanged();
        }
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() {
        if (isStarted()) {
            Log.Companion.getLogger().error("Clipboard events collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Clipboard events collector is already started. Aborting the start operation.");
        }
        this.clipboardManager.addPrimaryClipChangedListener(this);
        setStarted(true);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        this.clipboardManager.removePrimaryClipChangedListener(this);
        setStarted(false);
    }
}
