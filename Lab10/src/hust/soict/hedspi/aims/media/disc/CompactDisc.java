package hust.soict.hedspi.aims.media.disc;

import hust.soict.hedspi.aims.PlayerException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CompactDisc extends Disc implements Playable,Comparable{
	
	public int compareTo(Object obj) {
		if(!(obj instanceof CompactDisc)) {
			return super.compareTo(obj);
		}
		CompactDisc cd = (CompactDisc) obj;
		if (this.tracks.size() - cd.tracks.size() > 0) // Tang dan 
			return 1;
		if (this.tracks.size() == cd.tracks.size()) {
			if (this.getLength() - cd.getLength() > 0)
				return 1;
			if (this.getLength() == cd.getLength())
				return 0;	
		}
		return -1;
	}
	
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public String getArtist() {
		return artist;
	}
	public int numberTracks() {
		return this.tracks.size();
	}
	public List<Track> getTracks(){
		return this.tracks;
	}

	public CompactDisc(String id,String title, String category, float cost,String director,String artist) {
		super(id,title, category, cost, director);
		this.artist = artist;
	}
	public CompactDisc(String id,String title, String category, float cost,String director,String artist,ArrayList<Track>tracks) {
		super(id,title, category, cost, director);
		this.artist = artist;
		this.tracks = tracks;
	}
	public void addTrack(Track track) {
		for(Track track2: tracks) {
			if(track2.equals(track)) {
				System.out.println("Track da ton tai");
				return;
			}
		}

		tracks.add(track);
		System.out.println("Add track thanh cong");
	}
	public void removeTrack(Track track) {
		for(int i = 0 ; i < tracks.size();i++) {
			if(tracks.get(i).equals(track)) {
				tracks.remove(track);
				System.out.println("remove Track da thanh cong");
				return;
			}
		}
		System.out.println("Track khong ton tai");
	}
	
	public int getLength() {
		int length = 0;
		for(int i =0 ; i < tracks.size(); i++) {
			length += tracks.get(i).getLength();
		}

		return length;
	}
	public void play() throws PlayerException {
		if (this.getLength()>0){
			Iterator iter = tracks.iterator();
			Track nextTrack;
			while (iter.hasNext()){
				nextTrack=(Track) iter.next();
				try{
					nextTrack.play();
				} catch (PlayerException e){
					throw e;
				}
			}
		} else{
			throw new PlayerException("ERROR: CD length is non-positive!");
		}
	}
}
