package uiautomator.testing.android.example.com.healthcare;

import java.util.ArrayList;

public class Program {

    private int mId;
    private String mName;

    private ArrayList<Exercise> mExercises;

    public Program(int mId, String mName, ArrayList<Exercise> mExercises) {
        this.mId = mId;
        this.mName = mName;
        this.mExercises = mExercises;
    }

    public int getmId() {
        return mId;
    }

    public String getmName() {
        return mName;
    }

    public ArrayList<Exercise> getmExercises() {
        return mExercises;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmExercises(ArrayList<Exercise> mExercises) {
        this.mExercises = mExercises;
    }

    @Override
    public String toString() {
        return "Program{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", mExercises=" + mExercises +
                '}';
    }
}
