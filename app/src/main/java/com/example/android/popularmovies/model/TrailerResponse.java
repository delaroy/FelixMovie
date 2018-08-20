package com.example.android.popularmovies.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TrailerResponse {

    @SerializedName("id")
    private int id_trailer;
    @SerializedName("results")
    private List<Trailer> results;

    public List<Trailer> getResults() {
        return results;
    }

    public void setResults(List<Trailer> results) {
        this.results = results;
    }

    public int getIdTrailer(){
        return id_trailer;

    }

    public void setIdTrailer(int id_trailer){
        this.id_trailer=id_trailer;
    }
}
