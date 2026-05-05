package com.google.android.gms.maps.model;

import com.drew.metadata.exif.makernotes.FujifilmMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes8.dex */
public abstract class UrlTileProvider implements TileProvider {
    private final int zza;
    private final int zzb;

    public UrlTileProvider(int i2, int i3) {
        this.zza = i2;
        this.zzb = i3;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i2, int i3, int i4) {
        URL tileUrl = getTileUrl(i2, i3, i4);
        if (tileUrl == null) {
            return NO_TILE;
        }
        try {
            com.google.android.gms.internal.maps.zzf.zzb(FujifilmMakernoteDirectory.TAG_AUTO_BRACKETING);
            int i5 = this.zza;
            int i6 = this.zzb;
            URLConnection uRLConnectionOpenConnection = tileUrl.openConnection();
            Callback.openConnection(uRLConnectionOpenConnection);
            InputStream inputStream = Callback.getInputStream(uRLConnectionOpenConnection);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Preconditions.checkNotNull(inputStream, "from must not be null.");
            Preconditions.checkNotNull(byteArrayOutputStream, "to must not be null.");
            byte[] bArr = new byte[4096];
            while (true) {
                int i7 = inputStream.read(bArr);
                if (i7 == -1) {
                    Tile tile = new Tile(i5, i6, byteArrayOutputStream.toByteArray());
                    com.google.android.gms.internal.maps.zzf.zza();
                    return tile;
                }
                byteArrayOutputStream.write(bArr, 0, i7);
            }
        } catch (IOException unused) {
            com.google.android.gms.internal.maps.zzf.zza();
            return null;
        } catch (Throwable th) {
            com.google.android.gms.internal.maps.zzf.zza();
            throw th;
        }
    }

    public abstract URL getTileUrl(int i2, int i3, int i4);
}
