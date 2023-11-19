package id.ac.petra.utsreworkfelincia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class SQLite_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);
        DB_Handler dbHandler = new DB_Handler(this);
        dbHandler.addContact(new New_User("D12200034", "Felincia", "071002", "AppDevelopment", "061023"));
        dbHandler.addContact(new New_User("D12200034", "Felincia", "071002", "AppDevelopment", "061023"));
        dbHandler.addContact(new New_User("D12200034", "Felincia", "071002", "AppDevelopment", "061023"));
        Log.d("SQLite", "Membaca isi database");
        List<New_User> contacts = dbHandler.getAllContacts();
        for (New_User c: contacts){
            String m = "ID: "+c.getID()+ " Username: "+c.getUsername()+ " Password: "+c.getPassword()+
                    "Task: "+c.getTask()+ "DueDate: "+c.getDueDate();
            Log.d("SQLite",m);
        }
    }
}