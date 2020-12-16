package hbcu.stay.ready.baronsfarm.crops;

import java.util.ArrayList;
import java.util.List;

public class Field {

    private List<CropRow> cropRows;

    public Field(){
        cropRows = new ArrayList<CropRow>();
    }

    public void addCropRow(CropRow row) {
        cropRows.add(row);
    }

    public CropRow getCropRow(int rowNumber){
        return cropRows.get(rowNumber - 1);
    }

    public List<CropRow> getCropRows() {
        return cropRows;
    }
}
