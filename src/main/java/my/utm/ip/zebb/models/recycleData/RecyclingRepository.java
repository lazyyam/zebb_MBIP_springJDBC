package my.utm.ip.zebb.models.recycleData;

import java.util.List;

import org.springframework.stereotype.Repository;

import my.utm.ip.zebb.models.recycleData.Repository.RecyclingDTO;

@Repository
public interface RecyclingRepository {
   
    List<RecyclingDTO> getAllRecycleData();
    RecyclingDTO addRecycleData(final RecyclingDTO recycle);
    List<RecyclingDTO> getRecycleDataByUserName(String userName);
    RecyclingDTO updateRecycleData(final RecyclingDTO recycle);
    public boolean deleteRecycleData(String month);
}    



