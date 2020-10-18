package javaTest;

public class HDD_Part {
    private int id;
    private String productID;
    private String productName;
    private double size;//2.5 or 3.5
    private String storage;// 500 GB/1 TB/2 TB
    private String deviceType; //SSHD or HDD
    private int hddRPM;//7200 or 5400
    private int hddCache;
    private String diskType;//SMR or CMR
    private String company;
    private int warranty;
    private String status; //EOL or Aticve

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public int getHddRPM() {
        return hddRPM;
    }

    public void setHddRPM(int hddRPM) {
        this.hddRPM = hddRPM;
    }

    public int getHddCache() {
        return hddCache;
    }

    public void setHddCache(int hddCache) {
        this.hddCache = hddCache;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HDD_Part(int id, String productID, String productName, double size, String storage, String type, int hddRPM, int hddCache, String diskType, String company, int warranty, String status){
        this.id = id;
        this.productID = productID;
        this.productName = productName;
        this.size = size;
        this.storage = storage;
        this.deviceType = type;
        this.hddRPM = hddRPM;
        this.hddCache = hddCache;
        this.diskType = diskType;
        this.company = company;
        this.warranty = warranty;
        this.status = status;
    }

    public String toNormalString(){
        return "id:" + id +
                ",productID:" + productID +
                ",productName:" + productName +
                ",size:" + size +
                ",storage:" + storage +
                ",deviceType:" + deviceType +
                ",hddRPM:" + hddRPM +
                ",hddCache:" + hddCache +
                ",diskType:" + diskType +
                ",company:" + company +
                ",warranty:" + warranty +
                ",status:" + status;
    }
}
