package com.example.myapplication;

public class SMNBT {
   private String SmName;
   private int SmPic;
   private String SmPath;

    public SMNBT(String smName, int smPic, String smPath) {
        SmName = smName;
        SmPic = smPic;
        SmPath = smPath;
    }

    public String getSmName() {
        return SmName;
    }

    public void setSmName(String smName) {
        SmName = smName;
    }

    public int getSmPic() {
        return SmPic;
    }

    public void setSmPic(int smPic) {
        SmPic = smPic;
    }

    public String getSmPath() {
        return SmPath;
    }

    public void setSmPath(String smPath) {
        SmPath = smPath;
    }
}
