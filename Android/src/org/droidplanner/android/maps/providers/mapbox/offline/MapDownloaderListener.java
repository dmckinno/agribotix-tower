package org.droidplanner.android.maps.providers.mapbox.offline;

public interface MapDownloaderListener {

    public void stateChanged(MapDownloader.MBXOfflineMapDownloaderState newState);
    public void initialCountOfFiles(int numberOfFiles);
    public void progressUpdate(int numberOfFilesWritten, int numberOfFilesExcepted);
    public void networkConnectivityError(Throwable error);
    public void sqlLiteError(Throwable error);
    public void httpStatusError(Throwable error);
    public void completionOfOfflineDatabaseMap();

}
