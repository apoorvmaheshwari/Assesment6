package com.dxc.music.Music.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Artists {
	
	@Id
	private int id;
	private String artistName;
	List<Album>artistAlbums;
	List<Tracks>trackArtists;
	
	
	public Artists(int id, String artistName, List<Album> artistAlbums, List<Tracks> trackArtists) {
		super();
		this.id = id;
		this.artistName = artistName;
		this.artistAlbums = artistAlbums;
		this.trackArtists = trackArtists;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public List<Album> getArtistAlbums() {
		return artistAlbums;
	}
	public void setArtistAlbums(List<Album> artistAlbums) {
		this.artistAlbums = artistAlbums;
	}
	public List<Tracks> getTrackArtists() {
		return trackArtists;
	}
	public void setTrackArtists(List<Tracks> trackArtists) {
		this.trackArtists = trackArtists;
	}
	

}
