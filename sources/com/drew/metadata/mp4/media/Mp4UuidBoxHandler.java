package com.drew.metadata.mp4.media;

import com.drew.imaging.mp4.Mp4Handler;
import com.drew.lang.ByteArrayReader;
import com.drew.lang.ByteTrie;
import com.drew.lang.SequentialByteArrayReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.exif.ExifReader;
import com.drew.metadata.iptc.IptcReader;
import com.drew.metadata.mp4.Mp4Context;
import com.drew.metadata.photoshop.PhotoshopReader;
import com.drew.metadata.xmp.XmpReader;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;
import kotlin.io.encoding.Base64;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public class Mp4UuidBoxHandler extends Mp4Handler<Mp4UuidBoxDirectory> {
    private static final ByteTrie<UuidType> _uuidLookup;

    /* JADX INFO: renamed from: com.drew.metadata.mp4.media.Mp4UuidBoxHandler$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$drew$metadata$mp4$media$Mp4UuidBoxHandler$UuidType;

        static {
            int[] iArr = new int[UuidType.values().length];
            $SwitchMap$com$drew$metadata$mp4$media$Mp4UuidBoxHandler$UuidType = iArr;
            try {
                iArr[UuidType.Exif.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$drew$metadata$mp4$media$Mp4UuidBoxHandler$UuidType[UuidType.IptcIim.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$drew$metadata$mp4$media$Mp4UuidBoxHandler$UuidType[UuidType.PhotoshopImageResources.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$drew$metadata$mp4$media$Mp4UuidBoxHandler$UuidType[UuidType.Xmp.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private enum UuidType {
        Unknown,
        Exif,
        PhotoshopImageResources,
        IptcIim,
        PiffTrackEncryptionBox,
        GeoJp2WorldFileBox,
        PiffSampleEncryptionBox,
        GeoJp2GeoTiffBox,
        Xmp,
        PiffProtectionSystemSpecificHeaderBox
    }

    static {
        ByteTrie<UuidType> byteTrie = new ByteTrie<>();
        _uuidLookup = byteTrie;
        byteTrie.setDefaultValue(UuidType.Unknown);
        byteTrie.addPath(UuidType.Exif, new byte[]{5, 55, MessagePack.Code.UINT16, -85, -99, Ascii.FF, 68, 49, -89, 42, -6, 86, Ascii.US, 42, 17, 62});
        byteTrie.addPath(UuidType.PhotoshopImageResources, new byte[]{44, 76, 1, 0, -123, 4, 64, -71, MessagePack.Code.FIXSTR_PREFIX, 62, 86, 33, 72, MessagePack.Code.FIXEXT4, MessagePack.Code.MAP32, -21});
        byteTrie.addPath(UuidType.IptcIim, new byte[]{51, MessagePack.Code.EXT8, -92, MessagePack.Code.INT32, -72, Ascii.GS, 71, 35, MessagePack.Code.FIXSTR_PREFIX, -70, -15, -93, MessagePack.Code.NEGFIXINT_PREFIX, -105, -83, 56});
        byteTrie.addPath(UuidType.PiffTrackEncryptionBox, new byte[]{-119, 116, MessagePack.Code.STR32, MessagePack.Code.UINT32, 123, -25, 76, 81, -124, -7, 113, 72, -7, -120, 37, 84});
        byteTrie.addPath(UuidType.GeoJp2WorldFileBox, new byte[]{-106, -87, -15, -15, MessagePack.Code.ARRAY16, -104, 64, 45, -89, -82, MessagePack.Code.FIXEXT4, -114, 52, 69, Ascii.CAN, 9});
        byteTrie.addPath(UuidType.PiffSampleEncryptionBox, new byte[]{-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12});
        byteTrie.addPath(UuidType.GeoJp2GeoTiffBox, new byte[]{-79, 75, -8, -67, 8, Base64.padSymbol, 75, 67, -91, -82, -116, MessagePack.Code.FIXEXT8, MessagePack.Code.FIXEXT2, -90, MessagePack.Code.UINT32, 3});
        byteTrie.addPath(UuidType.Xmp, new byte[]{-66, 122, MessagePack.Code.UINT64, MessagePack.Code.FLOAT64, -105, -87, 66, -24, -100, 113, -103, -108, -111, -29, -81, -84});
        byteTrie.addPath(UuidType.PiffProtectionSystemSpecificHeaderBox, new byte[]{MessagePack.Code.INT8, -118, 79, Ascii.CAN, 16, -13, 74, -126, -74, MessagePack.Code.EXT16, 50, MessagePack.Code.FIXEXT16, -85, -95, -125, MessagePack.Code.INT64});
    }

    public Mp4UuidBoxHandler(Metadata metadata) {
        super(metadata);
    }

    private static String getUuid(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong()).toString();
    }

    @Override // com.drew.imaging.mp4.Mp4Handler
    public Mp4UuidBoxDirectory getDirectory() {
        return new Mp4UuidBoxDirectory();
    }

    @Override // com.drew.imaging.mp4.Mp4Handler
    public Mp4Handler<?> processBox(String str, byte[] bArr, long j2, Mp4Context mp4Context) throws IOException {
        UuidType uuidTypeFind;
        if (bArr == null || bArr.length < 16 || (uuidTypeFind = _uuidLookup.find(bArr)) == null) {
            return this;
        }
        int i2 = AnonymousClass1.$SwitchMap$com$drew$metadata$mp4$media$Mp4UuidBoxHandler$UuidType[uuidTypeFind.ordinal()];
        if (i2 == 1) {
            new ExifReader().extract(new ByteArrayReader(bArr, 16), this.metadata, 0, this.directory);
        } else if (i2 == 2) {
            new IptcReader().extract(new SequentialByteArrayReader(bArr, 16), this.metadata, bArr.length - 16, this.directory);
        } else if (i2 == 3) {
            new PhotoshopReader().extract(new SequentialByteArrayReader(bArr, 16), bArr.length - 16, this.metadata, this.directory);
        } else if (i2 != 4) {
            SequentialByteArrayReader sequentialByteArrayReader = new SequentialByteArrayReader(bArr);
            String uuid = getUuid(sequentialByteArrayReader.getBytes(16));
            byte[] bytes = sequentialByteArrayReader.getBytes(sequentialByteArrayReader.available());
            ((Mp4UuidBoxDirectory) this.directory).setString(Mp4UuidBoxDirectory.TAG_UUID.intValue(), uuid);
            ((Mp4UuidBoxDirectory) this.directory).setByteArray(Mp4UuidBoxDirectory.TAG_USER_DATA.intValue(), bytes);
        } else {
            new XmpReader().extract(bArr, 16, bArr.length - 16, this.metadata, this.directory);
        }
        return this;
    }

    @Override // com.drew.imaging.mp4.Mp4Handler
    protected boolean shouldAcceptBox(String str) {
        return str.equals("uuid");
    }

    @Override // com.drew.imaging.mp4.Mp4Handler
    protected boolean shouldAcceptContainer(String str) {
        return false;
    }
}
