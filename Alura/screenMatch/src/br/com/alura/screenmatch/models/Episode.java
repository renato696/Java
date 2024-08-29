package br.com.alura.screenmatch.models;

public class Episode {
    private int episodeNumber;
    private int episodeName;
    private Series serie;

    public int getEpisodeNumber() {
        return episodeNumber;
    }
    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }
    public int getEpisodeName() {
        return episodeName;
    }
    public void setEpisodeName(int episodeName) {
        this.episodeName = episodeName;
    }
    public Series getSerie() {
        return serie;
    }
    public void setSerie(Series serie) {
        this.serie = serie;
    }

}
