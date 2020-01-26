package com.example.rolstation;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BDControlador extends SQLiteOpenHelper {

    String sqlRegisto = "CREATE TABLE registro (id AUTO_INCREMENT primary key, usuario varchar(30) not null unique, pwd varchar(30) not null, email varchar(30) not null)";
    String sqlTienda = "CREATE TABLE tienda (nombre varchar(30) not null, direccion varchar(30) primary key," +
            " horario_lunes varchar(10), horario_martes varchar(10), horario_miercoles varchar(10), horario_jueves varchar(10)," +
            " horario_viernes varchar(10), horario_sabado varchar(10), horario_domingo varchar(10), puntuacion int(1))";
    String sqlJuegos = "create table juegos( nombre varchar(30) primary key not null, n_jug varchar(5) not null)";
    String sqlTorneo = "create table torneos( fecha date, foto blob)";

    /*sdsdfsdfsdf*/

    public BDControlador(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public void onCreate(SQLiteDatabase db) {
        //Se ejecuta la sentencia SQL de creación de la tabla
        db.execSQL(sqlRegisto);
        db.execSQL(sqlTienda);
        db.execSQL(sqlJuegos);
        db.execSQL(sqlTorneo);

    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //NOTA: Por simplicidad del ejemplo aquí utilizamos directamente la opción de
        //      eliminar la tabla anterior y crearla de nuevo vacía con el nuevo formato.
        //      Sin embargo lo normal será que haya que migrar datos de la tabla antigua
        //      a la nueva, por lo que este método debería ser más elaborado.

        //Se elimina la versión anterior de la tabla
        db.execSQL("DROP TABLE IF EXISTS registro");
        db.execSQL("DROP TABLE IF EXISTS tienda");
        db.execSQL("DROP TABLE IF EXISTS juegos");
        db.execSQL("DROP TABLE IF EXISTS torneos");

        //Se crea la nueva versión de la tabla
        db.execSQL(sqlRegisto);
        db.execSQL(sqlTienda);
        db.execSQL(sqlJuegos);
        db.execSQL(sqlTorneo);

    }

}
