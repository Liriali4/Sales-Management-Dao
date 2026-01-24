package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import model.entities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;

public class Main {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Scanner input = new Scanner(System.in);

        System.out.println("==== Test 1: seller findById ====");
        Seller sel = sellerDao.findById(3);
        System.out.println(sel);

        System.out.println("\n==== Test 2: seller findByDepartment ====");
        Department department = new Department(1, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n==== Test 3: seller findAll ====");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n==== Test 4: seller insert ====");
        Seller newSeller = new Seller(null, "Rui", "rui@g.com", new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
        System.out.println("Insert new seller: " + newSeller.getId());

        System.out.println("\n==== Test 5: seller update ====");
        sel = sellerDao.findById(2);
        sel.setName("Martha Waine");
        sellerDao.update(sel);
        System.out.println("update completed");
        
        
        System.out.println("\n==== Test 6: seller delete ====");
        System.out.print("Enter id for delete test: ");
        int id = input.nextInt();
        sellerDao.deleteById(id);
        
        
        input.close();
    }

}
