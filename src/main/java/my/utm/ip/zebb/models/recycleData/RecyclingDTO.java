package my.utm.ip.zebb.models.recycleData;

public class RecyclingDTO {
    private String userName;
    private double weight;
    private int days;
    private String month;
    private String imageName;
    private byte[] imageData;

    public RecyclingDTO(String userName, double weight, int days, String month, String imageName, byte[] imageData ) {
        this.userName = userName;
        this.weight = weight;
        this.days = days;
        this.month = month;
        this.imageName = imageName;
        this.imageData = imageData;
    }

    public RecyclingDTO(double weight, int days, String month, String imageName, byte[] imageData ) { //for testing
        this.weight = weight;
        this.days = days;
        this.month = month;
        this.imageName = imageName;
        this.imageData = imageData;
    }

    public RecyclingDTO() {
        this.userName = "";
        this.weight = 0.0;
        this.days = 0;
        this.month = "";
        this.imageName = "";
        this.imageData = new byte[0]; 
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    public String getUserName() {
        return userName;
    }

    public double getWeight() {
        return weight;
    }

    public int getDays() {
        return days;
    }

    public String getMonth() {
        return month;
    }

    public String getImageName() {
        return imageName;
    }

    public byte[] getImageData() {
        return imageData;
    }

    @Override
   public String toString() {
       return "Recycling data [userName=" + userName + ", weight=" + weight + ", days=" + days +  ", month=" + month + ", imageName=" + imageName
               + ", imageData=" + imageData + "]";
   }

      
}
