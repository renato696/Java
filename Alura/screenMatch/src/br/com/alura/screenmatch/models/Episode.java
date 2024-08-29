package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.Classification;

public class Episode implements Classification{
    private int episodeNumber;
    private int episodeName;
    private Series serie;
    private int totalViews;

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

    public int getTotalViews() {
        return totalViews;
    }
    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    @Override
    public int getClassification() {
        if (totalViews > 100){
            return 4;
        } else {
            return 2;
        }
    }



    

    
}
