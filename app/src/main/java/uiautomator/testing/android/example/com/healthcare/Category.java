package uiautomator.testing.android.example.com.healthcare;

import java.util.ArrayList;

public class Category {

    private int mId;
    private String mName;
    private ArrayList<Program> mPrograms;

    public Category () {
        mId = 0;
        mName = "";
        mPrograms = new ArrayList<Program>();
    }

    public Category(int mId, String mName, ArrayList<Program> mPrograms) {
        this.mId = mId;
        this.mName = mName;
        this.mPrograms = mPrograms;
    }

    public int getmId() {
        return mId;
    }

    public String getmName() {
        return mName;
    }

    public ArrayList<Program> getmPrograms() {
        return mPrograms;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmPrograms(ArrayList<Program> mPrograms) {
        this.mPrograms = mPrograms;
    }

    @Override
    public String toString() {
        return "Category{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", mPrograms=" + mPrograms +
                '}';
    }
}
