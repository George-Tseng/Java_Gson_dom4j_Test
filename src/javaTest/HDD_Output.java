package javaTest;

import java.util.List;

public class HDD_Output {
    private String usage; //NB, Desktop, NAS or DC
    private List<HDD_Part> hddPartList;

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public List<HDD_Part> getHddPartList() {
        return hddPartList;
    }

    public void setHddPartList(List<HDD_Part> hddPartList) {
        this.hddPartList = hddPartList;
    }

    public HDD_Output(String usage, List<HDD_Part> hddPartList) {
        this.usage = usage;
        this.hddPartList = hddPartList;
    }
}
