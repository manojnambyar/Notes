package in.geofoods.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import in.geofoods.notes.models.Note;

public class NoteListActivity extends AppCompatActivity {

    private static final String TAG = "Note List Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);

        Note note=new Note("some title","some content","some time stamp");


    }
}