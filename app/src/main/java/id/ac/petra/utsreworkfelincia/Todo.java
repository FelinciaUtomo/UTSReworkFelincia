package id.ac.petra.utsreworkfelincia;

import android.widget.Button;

import java.util.Date;
import java.util.UUID;

public class Todo {
    private UUID mId;
    private String mTask;
    private String mNote;
    private Date mdueDate;
    private boolean mDone;

    public Todo() {
        this.mId = UUID.randomUUID();
        this.mdueDate = new Date();
    }

    public UUID getmId() {
        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public String getmTask() {
        return mTask;
    }

    public void setmTask(String mTask) {
        this.mTask = mTask;
    }

    public String getmNote() {
        return mNote;
    }

    public void setmNote(String mNote) {
        this.mNote = mNote;
    }

    public Date getMdueDate() {
        return mdueDate;
    }

    public void setMdueDate(Date mdueDate) {
        this.mdueDate = mdueDate;
    }

    public boolean ismDone() {
        return mDone;
    }

    public void setmDone(boolean mDone) {
        this.mDone = mDone;
    }
}
