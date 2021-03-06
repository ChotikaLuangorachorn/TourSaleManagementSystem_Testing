package Table;

public class Receipt {
    private String reservationCode;
    private String receiptNo;
    private String tourID;
    private String tourName;
    private String customerID;
    private String customerName;
    private String employeeID;
    private String employeeName;
    private int amountCustomer;
    private Double totalPrice;
    private String receiptType;
    private String createStatus = "Not created";

    public Receipt(){}

    public Receipt(String reservationCode, String receiptNo, String tourID, String tourName, String customerID, String customerName, String employeeID, String employeeName, int amountCustomer, Double totalPrice, String receiptType, String createStatus) {
        this.reservationCode = reservationCode;
        this.receiptNo = receiptNo;
        this.tourID = tourID;
        this.tourName = tourName;
        this.customerID = customerID;
        this.customerName = customerName;
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.amountCustomer = amountCustomer;
        this.totalPrice = totalPrice;
        this.receiptType = receiptType;
        this.createStatus = createStatus;
    }

    public String getReservationCode() {
        return reservationCode;
    }

    public void setReservationCode(String reservationCode) {
        this.reservationCode = reservationCode;
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public String getTourID() {
        return tourID;
    }

    public void setTourID(String tourID) {
        this.tourID = tourID;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAmountCustomer() {
        return amountCustomer;
    }

    public void setAmountCustomer(int amountCustomer) {
        this.amountCustomer = amountCustomer;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }

    public String getCreateStatus() {
        return createStatus;
    }

    public void setCreateStatus(String createStatus) {
        this.createStatus = createStatus;
    }
}
