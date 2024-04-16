
package com.mycompany.aggregationrail;


public class AggregationRail {

    public static void main(String[] args) {
    Address a = new Address("indore","Mp","India");
    Address a1 = new Address("raipur", "CG", "India");
    Student s1=new Student(101, "apeksha", a);
    Student s2=new Student(102, "Aastha", a1);
    s1.display();
    s2.display();
       
    }
}
