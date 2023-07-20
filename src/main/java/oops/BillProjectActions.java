package oops;

public interface BillProjectActions {
    public String addnewcustomers(ElectricityBillProject customer);
    public void listallcustomerdetails();
    public void updatingcustomervalues(String username);
    public void updatingcustomervalues(long Billno);
    public void deletingcustomervalue(int userid);

    public void searchingancustomervalues(int userid);
    public void sorting();
}
