
package com.mycompany.aggregationrail;


public class Student {
    int id ;
    String name;
    Address address;
public Student (int id , String name, Address address){
    super();
    this.id=id;
    this.name=name;
    this.address=address;
    
}
void display(){
    System.out.println(id+""+name);
    System.out.println(address.city+" "+address.state+" "+address.country);
            
}

  
}
