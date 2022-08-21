package com.APITirage.APITIRAGE.Services;

import com.APITirage.APITIRAGE.Modeles.Postulant;
<<<<<<< HEAD
import com.APITirage.APITIRAGE.Repositories.PostulantRepository;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.CellType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

@Service
public class PostulantServiceImpl implements PostulantService{
    @Override
    public void importer(Postulant postulants) {

=======

import com.APITirage.APITIRAGE.Repositories.PostulantRepository;
import com.APITirage.APITIRAGE.Repositories.PostulantTireRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data
public class PostulantServiceImpl implements PostulantService {
    private final PostulantRepository postulantRepository;

    @Override
    public Postulant ajouter(Postulant postulants) {
        return postulantRepository.save(postulants) ;
>>>>>>> Camara
    }

    @Override
    public List<Postulant> lire() {
        return null;
    }
<<<<<<< HEAD
    /*
    *
    * @Autowired
    PostulantRepository postulantRepository;
}
    @Override
    public void importer(Postulant postulants) {
        try {
            InputStream input = new FileInputStream("Classeur1.xls");
            POIFSFileSystem fs = new POIFSFileSystem(input);
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            HSSFSheet sheet = wb.getSheetAt(0);
            Iterator rows = sheet.rowIterator();

            while (rows.hasNext()){
                values.clear();
                HSSFRow row = (HSSFRow) rows.next();
                Iterator cells = row.cellIterator();
                while (cells.hasNext()){

                    HSSFCell cell = (HSSFCell) cells.next();

                    if( cell.getCellType() == CellType.NUMERIC)
                        values.add(Integer.toString((int) cell.getNumericCellValue()));
                    else if (CellType.STRING == cell.getCellType())
                        values.add(cell.getStringCellValue());
                }

                postulantRepository.(values.get(0), values.get(1), values.get(2), values.get(3));


            } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    *
    * */
=======
>>>>>>> Camara
}
