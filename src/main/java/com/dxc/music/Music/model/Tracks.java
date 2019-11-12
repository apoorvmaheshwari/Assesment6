package com.dxc.music.Music.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Tracks {
	
	@Id
	private int id;
	private String tracksName;
	List<Artists>trackArtists;
	public Tracks(int id, String tracksName, List<Artists> trackArtists) {
		super();
		this.id = id;
		this.tracksName = tracksName;
		this.trackArtists = trackArtists;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTracksName() {
		return tracksName;
	}
	public void setTracksName(String tracksName) {
		this.tracksName = tracksName;
	}
	public List<Artists> getTrackArtists() {
		return trackArtists;
	}
	public void setTrackArtists(List<Artists> trackArtists) {
		this.trackArtists = trackArtists;
	}
	
}

