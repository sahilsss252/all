package com.lti.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Cache;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="TBL_ALBUM")
public class Album {

	@Id 
	@GeneratedValue
	@Column(name="alb_id")
	private int id;
	private String name;
	private LocalDate releaseDate;
	private String  genre;
	
	@OneToMany(mappedBy = "album",cascade=CascadeType.ALL)
	private List<Song> song;
	
	public List<Song> getSong() {
		return song;
	}
	public void setSong(List<Song> song) {
		this.song = song;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	
}
