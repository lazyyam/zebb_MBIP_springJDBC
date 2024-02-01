package my.utm.ip.zebb.models.electricalData;

import java.util.Arrays;

public class ElectricalDAO {
    String userName;
    double electricityusage;
    int days;
    String month;
    double proportion_factor;
    double amount;
    double current_charge;
    String imageName;
    byte[] imageData;

    public ElectricalDAO() {
        this.userName = "";
        this.electricityusage = 0.0;
        this.days = 0;
        this.month = "";
        this.proportion_factor = 0.0;
        this.amount = 0.0;
        this.current_charge = 0.0;
        this.imageName = "";
        this.imageData = new byte[0]; 
    }

    
    public ElectricalDAO(String userName, double electricityusage, int days, String month, double proportion_factor, double amount,
            double current_charge, String imageName, byte[] imageData) {
        this.userName = userName;
        this.electricityusage = electricityusage;
        this.days = days;
        this.month = month;
        this.proportion_factor = proportion_factor;
        this.amount = amount;
        this.current_charge = current_charge;
        this.imageName = imageName;
        this.imageData = imageData;
    }


     public ElectricalDAO(double electricityusage, int days, String month, double proportion_factor, double amount,
            double current_charge, String imageName, byte[] imageData) {
        this.electricityusage = electricityusage;
        this.days = days;
        this.month = month;
        this.proportion_factor = proportion_factor;
        this.amount = amount;
        this.current_charge = current_charge;
        this.imageName = imageName;
        this.imageData = imageData;
    }

    public void assign(ElectricalDAO electrical) {
        this.userName = electrical.userName;
        this.electricityusage = electrical.electricityusage;
        this.days = electrical.days;
        this.month = electrical.month;
        this.proportion_factor = electrical.proportion_factor;
        this.amount = electrical.amount;
        this.current_charge = electrical.current_charge;
        this.imageName = electrical.imageName;
        this.imageData = electrical.imageData;
    }

    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public double getElectricityusage() {
        return electricityusage;
    }


    public void setElectricityusage(double electricityusage) {
        this.electricityusage = electricityusage;
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


    public double getCurrent_charge() {
        return current_charge;
    }


    public void setCurrent_charge(double current_charge) {
        this.current_charge = current_charge;
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

    // methods to faciliate DTO
    public void fromDTO(final ElectricalDTO dto) {
        this.userName = dto.getUserName();
        this.electricityusage = dto.getElectricityusage();
        this.days = dto.getDays();
        this.month = dto.getMonth();
        this.proportion_factor = dto.getProportion_factor();
        this.amount = dto.getAmount();
        this.current_charge = dto.getCurrent_charge();
        this.imageName = dto.getImageName();
        this.imageData = dto.getImageData();

    }

    public ElectricalDTO toDTO() {
        ElectricalDTO dto = new ElectricalDTO();
        dto.setUserName(this.userName);
        dto.setElectricityusage(this.electricityusage);
        dto.setDays(this.days);
        dto.setMonth(this.month);
        dto.setProportion_factor(this.proportion_factor);
        dto.setAmount(this.amount);
        dto.setCurrent_charge(this.current_charge);
        dto.setImageName(this.imageName);
        dto.setImageData(this.imageData);

        return dto;
    }

    public ElectricalDTO toDTO2() {
        ElectricalDTO dto = new ElectricalDTO();
        dto.setElectricityusage(this.electricityusage);
        dto.setDays(this.days);
        dto.setMonth(this.month);
        dto.setProportion_factor(this.proportion_factor);
        dto.setAmount(this.amount);
        dto.setCurrent_charge(this.current_charge);
        dto.setImageName(this.imageName);
        dto.setImageData(this.imageData);
        return dto;
    }

    public ElectricalDAO(final ElectricalDTO dto){
        this.fromDTO(dto);
    }


    @Override
    public String toString() {
        return "ElectricalDAO [userName=" + userName + ", electricityusage=" + electricityusage + ", days=" + days
                + ", month=" + month + ", proportion_factor=" + proportion_factor + ", amount=" + amount
                + ", current_charge=" + current_charge + ", imageName=" + imageName + ", imageData="
                + Arrays.toString(imageData) + "]";
    }



}