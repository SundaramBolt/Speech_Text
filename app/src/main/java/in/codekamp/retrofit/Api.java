package in.codekamp.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Freeware Sys on 04-03-2018.
 */

public interface Api {
    public String Base_URl  = "https://simplifiedcoding.net/demos/";

    @GET("marvel")
    Call<List<Hero>> getHeroes();


}
