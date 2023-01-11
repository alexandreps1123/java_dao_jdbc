package application;

import model.entities.Department;

public class Program {
    public static void main(String[] args) {
        
        Department dep = new Department(1, "Booka");

        System.out.println(dep);
    }
}
