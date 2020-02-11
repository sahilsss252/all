package com.lti.test;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.mapping.Array;
import org.junit.Test;

import com.lti.edao.AlbumSongDao;
import com.lti.edao.GenericDao;
import com.lti.entity.Album;
import com.lti.entity.Song;

public class AlbumSongTest {

	@Test
	public void addAlbums() {
		GenericDao gd=new GenericDao();
		Album album=new Album();
		album.setName("Bhaktigeet");
		album.setGenre("bhajan");
		album.setReleaseDate(LocalDate.of(2001, 01, 01));
		
		gd.save(album);
	}
	@Test
	public void addSongToAnAlbum() {
		Song song=new Song();
		song.setArtist("Anup Jalota");
		song.setDuration(45);
		song.setTitle("Mai nahi makhan khayo");
		GenericDao gd1 = new GenericDao();
		Album album=(Album) gd1.fetchByPk(Album.class,52);
		song.setAlbum(album);
		gd1.save(song);
	}
	@Test
	public void addAlbumAlongWithSong(){
		GenericDao dao = new GenericDao();
		Album album = new Album();
		album.setName("Hits Of rahat");
		album.setGenre("Romantic");
		album.setReleaseDate(LocalDate.of(2020, 01, 01));
		//dao.save(album);
		
		
		Song song = new Song();
		song.setArtist("Atif");
		song.setDuration(564);
		song.setTitle("Pehli Nazar Mai");
		song.setAlbum(album);
		
		Song song1 = new Song();
		song1.setArtist("Atif");
		song1.setDuration(56);
		song1.setTitle("Mai Rang");
		song1.setAlbum(album);
		
		Song song3 = new Song();
		song3.setArtist("Atif");
		song3.setDuration(64);
		song3.setTitle("O re Piya");
		song3.setAlbum(album);
		/*List<Song> s=new ArrayList<>();
		s=album.getSong();*/
		//int s=album.getId();
		List<Song> songs = new ArrayList<>();
		
		songs.add(song);
		songs.add(song1);
		songs.add(song3);
		
		album.setSong(songs);
		
	
		
		//dao.save(album);
		dao.save(album);
	
	}
	@Test
	public void albumByYear(){
		
		AlbumSongDao asd=new AlbumSongDao();
		List<Album> lst=asd.fetchAlbumRealsedIn(2001);
		for(Album a:lst){
			System.out.println(a.getName());
			System.out.println(a.getReleaseDate());
		}
	}
	@Test
	public void FetchSongsungBy(){
		
		AlbumSongDao asd=new AlbumSongDao();
		List<Song> lst=asd.fetchbySinger("Atif");
		for(Song a:lst){
			System.out.println(a.getArtist());
			System.out.println(a.getTitle());
			System.out.println(a.getAlbum().getId());
		}
	}
	@Test
	public void FetchAlbum(){
		
		AlbumSongDao asd=new AlbumSongDao();
		List<Album> lst=asd.fetchAlbumbySinger("Atif");
		for(Album a:lst){
			System.out.println(a.getName());
			//System.out.println(a.getTitle());
			//System.out.println(a.getSong());
			//System.out.println(a.getAlbum().getName());
			for(Song s:a.getSong()){
				System.out.println(s.getArtist());
				System.out.println(s.getTitle());
			}
		
		}
	}
}
