package com.ucsdextandroid1.musicsearch.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rjaylward on 2019-05-11
 */
public class ItunesSongItem implements SongItem, Parcelable {

    @SerializedName("trackId")
    private long trackId;
    @SerializedName("trackName")
    private String trackName;
    @SerializedName("artistName")
    private String artistName;
    @SerializedName("collectionName")
    private String albumName;
    @SerializedName("artworkUrl100")
    private String artworkURL;
    @SerializedName("previewUrl")
    private String previewURL;
    @SerializedName("trackTimeMillis")
    private long trackTime;



    //TODO add all the members to this class with proper serialized names

//    public ItunesSongItem(long trackId, String trackName, String artistName, String albumName,
//                          String artworkURL, String previewURL, long trackTime){
//        this.trackId = trackId;
//        this.trackName = trackName;
//        this.artistName = artistName;
//        this.albumName = albumName;
//        this.artworkURL = artworkURL;
//        this.previewURL = previewURL;
//        this.trackTime = trackTime;
//    }


    protected ItunesSongItem(Parcel in) {
        trackId = in.readLong();
        trackName = in.readString();
        artistName = in.readString();
        albumName = in.readString();
        artworkURL = in.readString();
        previewURL = in.readString();
        trackTime = in.readLong();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(trackId);
        dest.writeString(trackName);
        dest.writeString(artistName);
        dest.writeString(albumName);
        dest.writeString(artworkURL);
        dest.writeString(previewURL);
        dest.writeLong(trackTime);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ItunesSongItem> CREATOR = new Creator<ItunesSongItem>() {
        @Override
        public ItunesSongItem createFromParcel(Parcel in) {
            return new ItunesSongItem(in);
        }

        @Override
        public ItunesSongItem[] newArray(int size) {
            return new ItunesSongItem[size];
        }
    };

    @Override
    public long getTrackId() {
        return trackId;
    }

    @Override
    public String getTrackName() {
        return trackName;
    }

    @Override
    public String getArtistName() {
        return artistName;
    }

    @Override
    public String getAlbumName() {
        return albumName;
    }

    @Override
    public String getArtworkUrl() {
        return artworkURL;
    }

    @Override
    public String getPreviewUrl() {
        return previewURL;
    }

    @Override
    public long getTrackTime() {
        return trackTime;
    }

}
