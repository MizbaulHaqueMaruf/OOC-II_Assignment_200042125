package assignment2.ControlCoupling;

public class IdGenerator {
    String generateID(String serial, String dept){
        if(dept == "CSE")
        {
            String deptID = "421" + serial;
            return deptID;
        }
        else if(dept == "EEE")
        {
            String deptID = "221" + serial;
            return deptID;
        }
        return "not assigned";
    }
}
