package id.ac.petra.utsreworkfelincia;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DB_Handler extends SQLiteOpenHelper {
    private static final int DB_Version = 1;
    private static final String DB_Name = "ContactsManager";
    private static final String TB_Name = "Contacts";
    private static final String Key_ID = "ID";
    private static final String Key_Password = "Password";
    private static final String Key_DueDate = "DueDate";
    private static final String Key_Username = "Username";
    private static final String Key_Task = "Task";

    public DB_Handler(@Nullable Context context) {
        super(context, DB_Name, null, DB_Version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String Query = "Create Table " + TB_Name + "(" + Key_ID + " Integer Primary Key," +
                Key_Password + " Integer," + Key_DueDate + " Integer," + Key_Username + " Text," +
                Key_Task + " Text" + ")";
        sqLiteDatabase.execSQL(Query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TB_Name);
        onCreate(sqLiteDatabase);
    }

    public void addContact(New_User u) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(Key_Password, u.getPassword());
        cv.put(Key_ID, u.getID());
        cv.put(Key_Task, u.getTask());
        cv.put(Key_DueDate, u.getDueDate());
        cv.put(Key_Username, u.getUsername());
        db.insert(TB_Name, null, cv);
        db.close();
    }

    public New_User getContact(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor c = db.query(TB_Name, new String[]{Key_ID, Key_Username, Key_Task, Key_Password, Key_DueDate},
                Key_ID + "=?", new String[]{String.valueOf(id)}, null, null, null);
        if (c != null)
            c.moveToFirst();
        New_User user = new New_User(
                "D12200034", "Felincia", "071002", "AppDevelopment", "061023");
        return user;
    }

    public List<New_User> getAllContacts() {
        SQLiteDatabase db = this.getReadableDatabase();
        List<New_User> contactlist = new ArrayList<New_User>();

        String query = "Select * From " + TB_Name;
        Cursor c = db.rawQuery(query, null);

        if (c.moveToFirst()) {
//          Kerjakan selama masih bisa dipindahkan ke yang lain
            do {
                New_User user = new New_User("D12200034", "Felincia", "071002", "AppDevelopment", "061023");
                user.setID(Integer.parseInt(c.getString(0)));
                user.setTask(c.getString(1));
                user.setID(c.getInt(2));
                user.setDueDate(c.getInt(3));
                user.setPassword(c.getInt(4));
                user.setUsername(c.getString(5));
                contactlist.add(user);
            } while (c.moveToNext());
        }
        return contactlist;
    }
}