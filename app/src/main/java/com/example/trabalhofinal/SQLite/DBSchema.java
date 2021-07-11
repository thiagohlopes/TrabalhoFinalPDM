package com.example.trabalhofinal.SQLite;

import android.provider.BaseColumns;

public class DBSchema {

    public static final class Oferta implements BaseColumns {
        public static final String TABLENAME = "oferta";
        public static final String PRICE = "preco";
        public static final String NAME = "nome";
        public static final String MERCADO = "mercado";

        public static final String getCreationQuery() {
            return "CREATE TABLE "+TABLENAME+" ("+
                    _ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    PRICE + " REAL, "+
                    NAME + " STRING, "+
                    MERCADO + " STRING" +
                    ")";
        }
    }
}
