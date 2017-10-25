package android.jet.prototype;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/10/24.
 */

public class Area implements Cloneable, Serializable {

    // 钞票单位
    private String unit;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    protected Area clone() throws CloneNotSupportedException {
        Area cloneArea;
        cloneArea = (Area) super.clone();
        return cloneArea;
    }
}
