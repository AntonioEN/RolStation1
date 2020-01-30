package com.example.rolstation.rest;

public class APIUtils {
    // IP del servidor
    private static final String server = "192.168.1.122";
    // Puerto del microservicio
    private static final String port = "6969";
    //Servicio, si usamos otro punto de partida, pero lo hemos definido en el ProuctoRest
    private static final String servicio = "productos";
    // IP del servicio
    public static final String API_URL = "http://"+server+":"+port+"/";

    private APIUtils() {
    }

    // Constructor del servicio con los elementos de la interfaz
    public static ProductoRest getService() {
        return RetrofitClient.getClient(API_URL).create(ProductoRest.class);
    }



}