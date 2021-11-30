package in.geofoods.notes.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import in.geofoods.notes.R;
import in.geofoods.notes.models.Note;

public class NotesRecyclerAdapter extends RecyclerView.Adapter<NotesRecyclerAdapter.ViewHolder>{
    private ArrayList<Note> mNotes = new ArrayList<>();

    public NotesRecyclerAdapter(ArrayList<Note> notes) {
        this.mNotes = mNotes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_note_list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title, timestamp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.note_title);
            timestamp=itemView.findViewById(R.id.note_timestamp);
        }
    }
}
