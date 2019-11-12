package com.dxc.music.Music.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.dxc.music.Music.model.Album;
import com.dxc.music.Music.model.Artists;
import com.dxc.music.Music.model.Tracks;

@Repository
public class MusicDalimpl  implements MusicDal {
	
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public Album create(Album album) {
		
		return mongo.save(album);
		
	}
	
	@Override
	public Artists createArtists(Artists arts) {
		
		return mongo.save(arts);
		
	}
	
	@Override
	public Tracks createTracks(Tracks tracks) {
		
		return mongo.save(tracks);
		
	}
	
	@Override
	public List<Album> findAll() {
		// TODO Auto-generated method stub
		return mongo.findAll(Album.class);
	}
	
	@Override
	public Boolean deleteAlbum(Album album) {
		// TODO Auto-generated method stub
		return mongo.remove(album).wasAcknowledged();
	}
	
	@Override
	public Boolean deleteArtists(Artists artists) {
		// TODO Auto-generated method stub
		return mongo.remove(artists).wasAcknowledged();
	}
	
	@Override
	public Boolean deleteTracks(Tracks tracks) {
		// TODO Auto-generated method stub
		return mongo.remove(tracks).wasAcknowledged();
	}
	
	@Override
	public Album findById(String id) {
		// TODO Auto-generated method stub
		return mongo.findAndRemove(new Query(Criteria.where("id").is(id)), Album.class);
	}
	

}
