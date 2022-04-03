package day31CostomClass_Constructor;

public class Offer {
    public String locatıon;
    public String companyName;
    public String jobTıtle;
    public double salary;
    public boolean hasBenefit;
    public boolean hasPTO;
    public boolean isWFH;
    public boolean isFullTime;


    public void setInfo(String locatıon, String companyName, String jobTıtle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.locatıon = locatıon;
        this.companyName = companyName;
        this.jobTıtle = jobTıtle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "locatıon='" + locatıon + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTıtle='" + jobTıtle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
