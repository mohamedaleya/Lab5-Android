package tn.medtech.webservices;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;
import tn.medtech.weather.MyWeather;


public interface RestInterface {

    static String url = "http://api.openweathermap.org/data/2.5/";

    @GET("weather?APPID=17db59488cadcad345211c36304a9266")
    Call<MyWeather> getWeatherReport(@Query("q") String city);


    public static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

}
