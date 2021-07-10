package com.example.trabalhofinal.SQLite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.trabalhofinal.model.Oferta;

import java.util.ArrayList;

public class DAOOferta
{
    public static final void execQueryFinance(Context context, String sql)
    {
        DBHelper dbHelper = new DBHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        db.execSQL(sql);
        db.close();
    }

    public static final void insertFinance(Context context, Oferta oferta)
    {
        DBHelper dbHelper = new DBHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(DBSchema.Oferta.PRICE, oferta.getPreco());
        cv.put(DBSchema.Oferta.NAME, oferta.getNome());
        cv.put(DBSchema.Oferta.MERCADO, oferta.getMercado());
        db.insert(DBSchema.Oferta.TABLENAME, null, cv);
        db.close();
    }

    public static final ArrayList<Oferta> getAllPizzas(Context context)
    {
        DBHelper dbHelper = new DBHelper(context);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        ArrayList<Oferta> pizzas = new ArrayList<>();

        // SELECT * FROM pizza;

        Cursor cursor = db.query(
                DBSchema.Oferta.TABLENAME,
                null,
                null,
                null,
                null,
                null,
                DBSchema.Oferta.NAME
        );

        while(cursor.moveToNext()) {
            long id = cursor.getLong(cursor.getColumnIndex(DBSchema.Oferta._ID));
            float preco = cursor.getFloat(cursor.getColumnIndex(DBSchema.Oferta.PRICE));
            String mercado = cursor.getString(cursor.getColumnIndex(DBSchema.Oferta.MERCADO));
            String nome = cursor.getString(cursor.getColumnIndex(DBSchema.Oferta.NAME));
            Oferta oferta = new Oferta( id,  preco,  nome,  mercado);
            pizzas.add(oferta);
        }

        cursor.close();
        db.close();

        return pizzas;
    }
}
