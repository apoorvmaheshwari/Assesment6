package com.dxc.music.Music.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Album {
	@Id
	private int id;
	private String albumName;
	List<Artists>albumArtist;
	List<Tracks>albumTracks;
	public Album(int id, String albumName, List<Artists> albumArtist, List<Tracks> albumTracks) {
		super();
		this.id = id;
		this.albumName = albumName;
		this.albumArtist = albumArtist;
		this.albumTracks = albumTracks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}
	public List<Artists> getAlbumArtist() {
		return albumArtist;
	}
	public void setAlbumArtist(List<Artists> albumArtist) {
		this.albumArtist = albumArtist;
	}
	public List<Tracks> getAlbumTracks() {
		return albumTracks;
	}
	public void setAlbumTracks(List<Tracks> albumTracks) {
		this.albumTracks = albumTracks;
	}
	
	

}
