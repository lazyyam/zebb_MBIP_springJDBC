package my.utm.ip.zebb.services.electricalData;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import my.utm.ip.zebb.models.electricalData.ElectricalDAO;
import my.utm.ip.zebb.models.electricalData.ElectricalDTO;
import my.utm.ip.zebb.models.electricalData.ElectricalRepository;

public class ElectricalService_Database implements ElectricalService {
    
    @Autowired
    ElectricalRepository repo;

    @Override
    public List<ElectricalDAO> getAllElectricalData() {
        List<ElectricalDTO> dtos = repo.getAllElectricalData();
        List<ElectricalDAO> electrical = new ArrayList<ElectricalDAO>();
        for (ElectricalDTO dto:dtos){
            electrical.add(new ElectricalDAO(dto));
        }
        return electrical;
    }

    @Override
    public ElectricalDAO addElectricalData1(ElectricalDAO electrical) {
        ElectricalDTO dto = repo.addElectricalData1(electrical.toDTO()); //setto
        return new ElectricalDAO(dto); //
    }

    @Override
    public ElectricalDAO addElectricalData2(ElectricalDAO electrical) {
        ElectricalDTO dto = repo.addElectricalData2(electrical.toDTO2()); //setto
        return new ElectricalDAO(dto); //
    }
    
    @Override
    public ElectricalDAO getElectricalDataByUserName_month(String userName, String month) {
        ElectricalDTO dto =repo.getElectricalDataByUserName_month(userName, month);
        ElectricalDAO recycle= new ElectricalDAO();
        recycle.fromDTO(dto); //getto

        return recycle;
    }

}