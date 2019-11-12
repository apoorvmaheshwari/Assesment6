package com.dxc.music.Music.repo;

import java.util.List;

import com.dxc.music.Music.model.Album;
import com.dxc.music.Music.model.Artists;
import com.dxc.music.Music.model.Tracks;

public interface MusicDal {

	Album create(Album album);

	Boolean deleteAlbum(Album album);

	Artists createArtists(Artists arts);

	Tracks createTracks(Tracks tracks);

	List<Album> findAll();
	
	

	Boolean deleteArtists(Artists album);

	Boolean deleteTracks(Tracks tracks);

	Album findById(String id);

	Artists finddById(String id);

	Tracks findddById(String id);

	List<Tracks> findAllTracks();

	List<Artists> findAllArtists();

}
