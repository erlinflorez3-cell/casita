package com.drew.metadata;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Metadata {
    private final List<Directory> _directories = new ArrayList();

    public <T extends Directory> void addDirectory(T t2) {
        if (t2 == null) {
            throw new IllegalArgumentException("Directory may not be null.");
        }
        this._directories.add(t2);
    }

    public boolean containsDirectoryOfType(Class<? extends Directory> cls) {
        Iterator<Directory> it = this._directories.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next().getClass())) {
                return true;
            }
        }
        return false;
    }

    public Iterable<Directory> getDirectories() {
        return this._directories;
    }

    public <T extends Directory> Collection<T> getDirectoriesOfType(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (Directory directory : this._directories) {
            if (cls.isAssignableFrom(directory.getClass())) {
                arrayList.add(directory);
            }
        }
        return arrayList;
    }

    public int getDirectoryCount() {
        return this._directories.size();
    }

    public <T extends Directory> T getFirstDirectoryOfType(Class<T> cls) {
        Iterator<Directory> it = this._directories.iterator();
        while (it.hasNext()) {
            T t2 = (T) it.next();
            if (cls.isAssignableFrom(t2.getClass())) {
                return t2;
            }
        }
        return null;
    }

    public boolean hasErrors() {
        Iterator<Directory> it = getDirectories().iterator();
        while (it.hasNext()) {
            if (it.next().hasErrors()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        int directoryCount = getDirectoryCount();
        return String.format("Metadata (%d %s)", Integer.valueOf(directoryCount), directoryCount == 1 ? "directory" : "directories");
    }
}
