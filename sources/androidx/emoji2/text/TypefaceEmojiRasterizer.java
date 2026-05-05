package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import com.dynatrace.android.agent.Global;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes4.dex */
public class TypefaceEmojiRasterizer {
    static final int HAS_GLYPH_ABSENT = 1;
    static final int HAS_GLYPH_EXISTS = 2;
    static final int HAS_GLYPH_UNKNOWN = 0;
    private static final ThreadLocal<MetadataItem> sMetadataItem = new ThreadLocal<>();
    private volatile int mCache = 0;
    private final int mIndex;
    private final MetadataRepo mMetadataRepo;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HasGlyph {
    }

    TypefaceEmojiRasterizer(MetadataRepo metadataRepo, int i2) {
        this.mMetadataRepo = metadataRepo;
        this.mIndex = i2;
    }

    public void draw(Canvas canvas, float f2, float f3, Paint paint) {
        Typeface typeface = this.mMetadataRepo.getTypeface();
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(this.mMetadataRepo.getEmojiCharArray(), this.mIndex * 2, 2, f2, f3, paint);
        paint.setTypeface(typeface2);
    }

    public Typeface getTypeface() {
        return this.mMetadataRepo.getTypeface();
    }

    private MetadataItem getMetadataItem() {
        ThreadLocal<MetadataItem> threadLocal = sMetadataItem;
        MetadataItem metadataItem = threadLocal.get();
        if (metadataItem == null) {
            metadataItem = new MetadataItem();
            threadLocal.set(metadataItem);
        }
        this.mMetadataRepo.getMetadataList().list(metadataItem, this.mIndex);
        return metadataItem;
    }

    public int getId() {
        return getMetadataItem().id();
    }

    public int getWidth() {
        return getMetadataItem().width();
    }

    public int getHeight() {
        return getMetadataItem().height();
    }

    public short getCompatAdded() {
        return getMetadataItem().compatAdded();
    }

    public short getSdkAdded() {
        return getMetadataItem().sdkAdded();
    }

    public int getHasGlyph() {
        return this.mCache & 3;
    }

    public void resetHasGlyphCache() {
        if (isPreferredSystemRender()) {
            this.mCache = 4;
        } else {
            this.mCache = 0;
        }
    }

    public void setHasGlyph(boolean z2) {
        int i2 = this.mCache & 4;
        this.mCache = z2 ? (-1) - (((-1) - i2) & ((-1) - 2)) : i2 | 1;
    }

    public void setExclusion(boolean z2) {
        int hasGlyph = getHasGlyph();
        if (z2) {
            this.mCache = (hasGlyph + 4) - (hasGlyph & 4);
        } else {
            this.mCache = hasGlyph;
        }
    }

    public boolean isPreferredSystemRender() {
        return (-1) - (((-1) - this.mCache) | ((-1) - 4)) > 0;
    }

    public boolean isDefaultEmoji() {
        return getMetadataItem().emojiStyle();
    }

    public int getCodepointAt(int i2) {
        return getMetadataItem().codepoints(i2);
    }

    public int getCodepointsLength() {
        return getMetadataItem().codepointsLength();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(getId()));
        sb.append(", codepoints:");
        int codepointsLength = getCodepointsLength();
        for (int i2 = 0; i2 < codepointsLength; i2++) {
            sb.append(Integer.toHexString(getCodepointAt(i2)));
            sb.append(Global.BLANK);
        }
        return sb.toString();
    }
}
