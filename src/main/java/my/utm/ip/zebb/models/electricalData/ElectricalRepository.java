package my.utm.ip.zebb.models.electricalData;

import java.util.List;

import org.springframework.stereotype.Repository;

import my.utm.ip.zebb.models.electricalData.Repository.ElectricalDTO;

@Repository
public interface ElectricalRepository {
   
    List<ElectricalDTO> getAllElectricalData();
    ElectricalDTO addElectricalData(final ElectricalDTO electrical);
    List<ElectricalDTO> getElectricalDataByUserName(String userName);
    ElectricalDTO updateElectricalData(final ElectricalDTO electrical);
    public boolean deleteElectricalData(String month);
} 