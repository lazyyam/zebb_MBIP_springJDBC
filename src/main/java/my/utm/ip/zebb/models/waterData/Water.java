package my.utm.ip.zebb.models.waterData;

import java.util.Arrays;

public class Water {
    private String userName;
    private double waterusage;
    private int days;
    private String month;
    private double proportion_factor;
    private double amount;
    private String imageName;
    private byte[] imageData;
    private double water_carbon_factor;

    public Water() {
        this.userName = "";
        this.waterusage = 0.0;
        this.days = 0;
        this.month = "";
        this.proportion_factor = 0.0;
        this.amount = 0.0;
        this.imageName = "";
        this.imageData = new byte[0]; 
        this.water_carbon_factor=0.0;
    }

    
    public Water(String userName, double waterusage, int days, String month, double proportion_factor, double amount,
             String imageName, byte[] imageData , double water_carbon_factor ) {
        this.userName = userName;
        this.waterusage = waterusage;
        this.days = days;
        this.month = month;
        this.proportion_factor = proportion_factor;
        this.amount = amount;
        this.imageName = imageName;
        this.imageData = imageData;
        this.water_carbon_factor= water_carbon_factor;
    }

    public void assign(Water water) {
        this.userName = water.userName;
        this.waterusage = water.waterusage;
        this.days = water.days;
        this.month = water.month;
        this.proportion_factor = water.proportion_factor;
        this.amount = water.amount;
        this.imageName = water.imageName;
        this.imageData = water.imageData;
        this.water_carbon_factor = water_carbon_factor;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public double getWaterusage() {
        return waterusage;
    }


    public void setWaterusage(double waterusage) {
        this.waterusage = waterusage;
    }


    public int getDays() {
        return days;
    }


    public void setDays(int days) {
        this.days = days;
    }


    public String getMonth() {
        return month;
    }


    public void setMonth(String month) {
        this.month = month;
    }


    public double getProportion_factor() {
        return proportion_factor;
    }


    public void setProportion_factor(double proportion_factor) {
        this.proportion_factor = proportion_factor;
    }


    public double getAmount() {
        return amount;
    }


    public void setAmount(double amount) {
        this.amount = amount;
    }


    public String getImageName() {
        return imageName;
    }


    public void setImageName(String imageName) {
        this.imageName = imageName;
    }


    public byte[] getImageData() {
        return imageData;
    }


    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public double getWater_carbon_factor() {
        return water_carbon_factor;
    }


    public void setWater_carbon_factor(double water_carbon_factor) {
        this.water_carbon_factor = water_carbon_factor;
    }


    public void fromDAO(final WaterDAO dao) {
        this.userName = dao.getUserName();
        this.waterusage = dao.getWaterusage();
        this.days = dao.getDays();
        this.month = dao.getMonth();
        this.proportion_factor = dao.getProportion_factor();
        this.amount = dao.getAmount();
        this.imageName = dao.getImageName();
        this.imageData = dao.getImageData();
        this.water_carbon_factor = dao.getWater_carbon_factor();

    }

    public WaterDAO toDAO() {
        WaterDAO dao = new WaterDAO();
        dao.setUserName(this.userName);
        dao.setWaterusage(this.waterusage);
        dao.setDays(this.days);
        dao.setMonth(this.month);
        dao.setProportion_factor(this.proportion_factor);
        dao.setAmount(this.amount);
        dao.setImageName(this.imageName);
        dao.setImageData(this.imageData);
        dao.setWater_carbon_factor(this.water_carbon_factor);

        return dao;
    }


    public Water(final WaterDAO dao){
        this.fromDAO(dao);
    }


    @Override
    public String toString() {
        return "WaterDAO [userName=" + userName + ", waterusage=" + waterusage + ", days=" + days + ", month=" + month
                + ", proportion_factor=" + proportion_factor + ", amount=" + amount + ", imageName=" + imageName
                + ", imageData=" + Arrays.toString(imageData) + ", water_carbon_factor=" + water_carbon_factor + "]";
    }



    

    
}
