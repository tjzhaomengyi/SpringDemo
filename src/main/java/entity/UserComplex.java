package entity;

import java.util.*;

/**
 * @Auther: zhaomengyi
 * @Date: 19-8-22 17:59
 * @Description:
 */
public class UserComplex {
    private int uid;
    private String uname;
    private String[] arrData;
    private List listData;
    private Set setData;
    private Map mapData;
    private Properties pros;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String[] getArrData() {
        return arrData;
    }

    public void setArrData(String[] arrData) {
        this.arrData = arrData;
    }

    public List getListData() {
        return listData;
    }

    public void setListData(List listData) {
        this.listData = listData;
    }

    public Set getSetData() {
        return setData;
    }

    public void setSetData(Set setData) {
        this.setData = setData;
    }

    public Map getMapData() {
        return mapData;
    }

    public void setMapData(Map mapData) {
        this.mapData = mapData;
    }

    public Properties getPros() {
        return pros;
    }

    public void setPros(Properties pros) {
        this.pros = pros;
    }

    @Override
    public String toString() {
        return "UserComplex{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", arrData=" + Arrays.toString(arrData) +
                ", listData=" + listData +
                ", setData=" + setData +
                ", mapData=" + mapData +
                ", pros=" + pros +
                '}';
    }
}
