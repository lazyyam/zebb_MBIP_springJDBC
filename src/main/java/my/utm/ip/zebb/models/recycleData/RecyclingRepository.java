package my.utm.ip.zebb.models.recycleData;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface RecyclingRepository {
   
    List<RecyclingDAO> getAllRecycleData();
    RecyclingDAO addRecycleData(final RecyclingDAO recycle);
    List<RecyclingDAO> getRecycleDataByUserName(String userName);
    RecyclingDAO updateRecycleData(final RecyclingDAO recycle);
    public boolean deleteRecycleData(String month);
}    



