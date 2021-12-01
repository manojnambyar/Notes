package in.geofoods.notes;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import in.geofoods.notes.adapters.NotesRecyclerAdapter;
import in.geofoods.notes.models.Note;
import in.geofoods.notes.util.VerticalSpacingItemDecorator;

public class NoteListActivity extends AppCompatActivity {

    private static final String TAG = "NoteListActivity";
    // ui components
    private RecyclerView mRecyclerView;

    //variables
    private ArrayList<Note> mNotes = new ArrayList<>();
    private NotesRecyclerAdapter mNotesRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);
        Log.d(TAG, "onCreate: started");
        mRecyclerView = findViewById(R.id.recyclerView);

        initRecyclerView();
        insertFakeNotes();

        setSupportActionBar((Toolbar) findViewById(R.id.notes_toolbar));
        setTitle("Notes");
        Log.d(TAG, "onCreate: ended");
    }

    private void insertFakeNotes() {
        Log.d(TAG, "insertFakeNotes: started");
        for (int i = 0; i < 1000; i++) {
            Note note = new Note();
            note.setTitle("Title # " + i);
            note.setContent("Content # " + i);
            note.setTimestamp("Jan 2019");
            mNotes.add(note);
        }
        mNotesRecyclerAdapter.notifyDataSetChanged();
        Log.d(TAG, "insertFakeNotes: ended");
    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: started");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        VerticalSpacingItemDecorator verticalSpacingItemDecorator = new VerticalSpacingItemDecorator(10);
        mRecyclerView.addItemDecoration(verticalSpacingItemDecorator);
        mNotesRecyclerAdapter = new NotesRecyclerAdapter(mNotes);
        mRecyclerView.setAdapter(mNotesRecyclerAdapter);
        Log.d(TAG, "initRecyclerView: ended");
    }


}
































