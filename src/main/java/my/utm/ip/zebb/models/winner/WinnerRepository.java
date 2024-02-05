package my.utm.ip.zebb.models.winner;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface WinnerRepository {
   
    List<WinnerDAO> getWinnersByUserAndMonth();
    WinnerDAO updateWinner(final WinnerDAO recycle);
    int getWinnerCountForMonth(String month);
    List<WinnerDAO> getWinners();
    boolean deleteWinnerByUsername(String userName);
}    



