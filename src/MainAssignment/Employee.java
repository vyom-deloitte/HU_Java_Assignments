package MainAssignment;

import java.io.Serializable;

// GITHUB ka employee management /YT  CRUD ka code+ driver ka bhi code

    //employee class a code create employee and initialise attributes
    @SuppressWarnings("serial")
    public class Employee implements Serializable{
// ismai aur attributes dalenge
        int id;
        String name;
        float salary;
        long contact_no;
        String email_id;

        public Employee(int id, String name, float salary, long contact_no, String email_id)
        {
            this.id = id;
            this.name = name;
            this.salary = salary;
            this.contact_no = contact_no;
            this.email_id = email_id;
        }

        public String toString()
        {
            return "\nEmployee Details :" + "\nID: " + this.id + "\nName: " + this.name + "\nSalary: " +
                    this.salary + "\nContact No: " + this.contact_no + "\nEmail-id: " + this.email_id;
        }

    }


