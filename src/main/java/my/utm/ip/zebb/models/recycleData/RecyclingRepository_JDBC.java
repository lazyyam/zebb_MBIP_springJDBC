package my.utm.ip.zebb.models.recycleData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


public class RecyclingRepository_JDBC implements RecyclingRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<RecyclingDAO> getAllRecycleData() {

        String sql = "SELECT * FROM recycledata";

        final List<RecyclingDAO> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<RecyclingDAO>(RecyclingDAO.class));

        return list;
    } 

    @Override
    public RecyclingDAO addRecycleData(RecyclingDAO recycle) {
        String checkIfExistsSql = "SELECT COUNT(*) FROM recycledata WHERE month = ? AND userName = ?";

        int existingCount = jdbcTemplate.queryForObject(checkIfExistsSql, Integer.class, recycle.getMonth(), recycle.getUserName());

        if (existingCount > 0) {
            // Data already exists, update
            String sql = "UPDATE recycledata SET userName=?, weight=?, month=?, image_name=?, image_data=?, recycling_carbon_factor=? WHERE month=? AND userName=?";
            Object[] arg = { 
                    recycle.getUserName(),
                    recycle.getWeight(),
                    recycle.getMonth(),
                    recycle.getImageName(),
                    recycle.getImageData(),
                    recycle.getRecycling_carbon_factor(),
                    recycle.getMonth(),
                    recycle.getUserName()
            };
            jdbcTemplate.update(sql, arg);

        } else {
            // Data does not exist, insert
            String sql = "INSERT INTO recycledata (userName, weight, month, image_name, image_data, recycling_carbon_factor) VALUES (?, ?, ?, ?, ?, ?)";
            Object[] arg = { 
                recycle.getUserName(),
                recycle.getWeight(),
                recycle.getMonth(),
                recycle.getImageName(),
                recycle.getImageData(),
                recycle.getRecycling_carbon_factor(),
            };
            jdbcTemplate.update(sql, arg);
        }

        return recycle;
    }

    @Override
    public List<RecyclingDAO> getRecycleDataByUserName(String userName) {
        String sql = "SELECT * FROM recycledata WHERE userName=?";
        
        List<RecyclingDAO> recycleList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<RecyclingDAO>(RecyclingDAO.class), userName);

        return recycleList;
    }

    @Override
    public RecyclingDAO updateRecycleData(final RecyclingDAO recycle) {
        String sql = "UPDATE recycledata SET userName=?, weight=?, month=?, image_name=?, image_data=?, recycling_carbon_factor=? WHERE month=?";
        Object[] arg = { 
                recycle.getUserName(),
                recycle.getWeight(),
                recycle.getMonth(),
                recycle.getImageName(),
                recycle.getImageData(),
                recycle.getRecycling_carbon_factor(),
                recycle.getMonth()
        };

        int count = jdbcTemplate.update(sql, arg);

        if (count>0)
            return recycle;

        return null;

    }

    @Override
    public boolean deleteRecycleData(String month) {
        String sql = "DELETE FROM recycledata WHERE month=?";
        int count = jdbcTemplate.update(sql, month);

        return count > 0;

    }

}
