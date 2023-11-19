package id.ac.petra.utsreworkfelincia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Job_List_Activity extends AppCompatActivity {

    private ListView listView;
    private String[] jobTitles;
    private String[] jobDescriptions;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_list);

        listView = findViewById(R.id.listView);

        // Data pekerjaan contoh (gantilah dengan data sesuai kebutuhan Anda)
        jobTitles = new String[]{"friendship counseling", "digital leadership", "app development"};
        jobDescriptions = new String[]{"pekerjaan menangani masalah health mental", "pekerjaan mencetuskan inovasi produk baru", "pekerjaan membuat dan mengembangkan aplikasi"};

        // Membuat adapter untuk menghubungkan data ke ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.activity_job_list, R.id.listView, jobTitles);
        listView.setAdapter(adapter);

        // Menambahkan listener untuk meng-handle klik item di ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedJobTitle = jobTitles[position];
                String selectedJobDescription = jobDescriptions[position];

                // Lakukan sesuatu ketika item di klik, misalnya menampilkan Toast dengan detail pekerjaan
                String message = "Pekerjaan: " + selectedJobTitle + "\nDeskripsi: " + selectedJobDescription;
                Toast.makeText(Job_List_Activity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}