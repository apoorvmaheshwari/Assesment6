package com.dxc.music.Music.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.music.Music.model.Album;
import com.dxc.music.Music.model.Tracks;
import com.dxc.music.Music.repo.MusicDal;


@RestController
public class IndexController {
	
	@Autowired
	private MusicDal musicDal;
	
	@RequestMapping(value = "/albums", method = RequestMethod.GET, produces = "application/json")
	public List<Album> firstPage() {
		return musicDal.findAll();
	}
	
	@DeleteMapping(path = { "/albums/{id}" })
	public Album delete(@PathVariable("id") String id) {
		System.out.println("id " + id);
		Album deletedMus = musicDal.findById(id);
		System.out.println(deletedMus);
		if(musicDal.deleteAlbum(deletedMus))
			return deletedMus;
		else
			return null;
	}
	
	@PostMapping("/albums")
	public Album create(@RequestBody Album user) {
		musicDal.create(user);
		System.out.println(user + " insert");
		return user;
	}
	
	@PostMapping("/tracks")
	public Tracks createTracks(@RequestBody Tracks user) {
		musicDal.createTracks(user);
		System.out.println(user + " insert");
		return user;
	}
	
}
